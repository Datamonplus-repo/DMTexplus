package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class test_v01_impl extends GXDataArea
{
   public test_v01_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public test_v01_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( test_v01_impl.class ));
   }

   public test_v01_impl( int remoteHandle ,
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
      nRC_GXsfl_221 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_221"))) ;
      nGXsfl_221_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_221_idx"))) ;
      sGXsfl_221_idx = httpContext.GetPar( "sGXsfl_221_idx") ;
      edtBarAcaAnh_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaAnh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Visible), 5, 0), !bGXsfl_221_Refreshing);
      edtBarCuadern_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCuadern_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCuadern_Visible), 5, 0), !bGXsfl_221_Refreshing);
      edtBarNormas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNormas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNormas_Visible), 5, 0), !bGXsfl_221_Refreshing);
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
      AV14CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV15CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
      AV71BarDisNum = httpContext.GetPar( "BarDisNum") ;
      AV74BarDisNumTo = httpContext.GetPar( "BarDisNumTo") ;
      AV18BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
      AV19BarSitTo = (byte)(GXutil.lval( httpContext.GetPar( "BarSitTo"))) ;
      AV16BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
      AV17BarFecGenTo = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenTo")) ;
      AV72BarFecCli = localUtil.parseDateParm( httpContext.GetPar( "BarFecCli")) ;
      AV73BarFecCliTo = localUtil.parseDateParm( httpContext.GetPar( "BarFecCliTo")) ;
      AV76BarFecFpr = localUtil.parseDateParm( httpContext.GetPar( "BarFecFpr")) ;
      AV77BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
      AV78BarFecSal = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal")) ;
      AV79BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
      AV80BarColNom = httpContext.GetPar( "BarColNom") ;
      AV81BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV86BarColNomto = httpContext.GetPar( "BarColNomto") ;
      AV87BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
      AV82BarNomCli = httpContext.GetPar( "BarNomCli") ;
      AV83BarNumCli = (int)(GXutil.lval( httpContext.GetPar( "BarNumCli"))) ;
      AV84BarNomClito = httpContext.GetPar( "BarNomClito") ;
      AV85BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
      AV110BarSer = httpContext.GetPar( "BarSer") ;
      AV111BarSerto = httpContext.GetPar( "BarSerto") ;
      AV90BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV91BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV92BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV96BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
      AV97BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
      AV98BarCodParto = httpContext.GetPar( "BarCodParto") ;
      AV94BarGirar = httpContext.GetPar( "BarGirar") ;
      AV108BarTipArt = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt"))) ;
      AV109BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
      AV93Cod_Idtx = httpContext.GetPar( "Cod_Idtx") ;
      AV46EmprCod = httpContext.GetPar( "EmprCod") ;
      AV21TFBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod"))) ;
      AV22TFBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod_To"))) ;
      AV23TFBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo"))) ;
      AV24TFBarCodReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo_To"))) ;
      AV25TFBarCodPar = httpContext.GetPar( "TFBarCodPar") ;
      AV26TFBarCodPar_Sel = httpContext.GetPar( "TFBarCodPar_Sel") ;
      AV27TFBarDisNum = httpContext.GetPar( "TFBarDisNum") ;
      AV28TFBarDisNum_Sel = httpContext.GetPar( "TFBarDisNum_Sel") ;
      AV29TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV30TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV31TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV32TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV33TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV34TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV35TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV36TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV55TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV56TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV57TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV58TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV59TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV60TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV37TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV38TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV39TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV49TFBarFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli")) ;
      AV88TFBarFecFpr = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecFpr")) ;
      AV53TFBarFecSal = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecSal")) ;
      AV118Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV62TotBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotBarKgm"), ".") ;
      AV64TotBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotBarMtr"), ".") ;
      AV66TotBarPie = GXutil.lval( httpContext.GetPar( "TotBarPie")) ;
      edtBarAcaAnh_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarAcaAnh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Visible), 5, 0), !bGXsfl_221_Refreshing);
      edtBarCuadern_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarCuadern_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCuadern_Visible), 5, 0), !bGXsfl_221_Refreshing);
      edtBarNormas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtBarNormas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNormas_Visible), 5, 0), !bGXsfl_221_Refreshing);
      AV68Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV101MacCod = (int)(GXutil.lval( httpContext.GetPar( "MacCod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV14CliCod, AV15CliCodto, AV71BarDisNum, AV74BarDisNumTo, AV18BarSit, AV19BarSitTo, AV16BarFecGen, AV17BarFecGenTo, AV72BarFecCli, AV73BarFecCliTo, AV76BarFecFpr, AV77BarFecFprto, AV78BarFecSal, AV79BarFecSalto, AV80BarColNom, AV81BarColNum, AV86BarColNomto, AV87BarColNumto, AV82BarNomCli, AV83BarNumCli, AV84BarNomClito, AV85BarNumClito, AV110BarSer, AV111BarSerto, AV90BarCod, AV91BarCodReo, AV92BarCodPar, AV96BarCodto, AV97BarCodReoto, AV98BarCodParto, AV94BarGirar, AV108BarTipArt, AV109BarTipArtto, AV93Cod_Idtx, AV46EmprCod, AV21TFBarCod, AV22TFBarCod_To, AV23TFBarCodReo, AV24TFBarCodReo_To, AV25TFBarCodPar, AV26TFBarCodPar_Sel, AV27TFBarDisNum, AV28TFBarDisNum_Sel, AV29TFCliCod, AV30TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV33TFBarSer, AV34TFBarSer_Sel, AV35TFBarSerDsc, AV36TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV59TFBarNomCli, AV60TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV49TFBarFecCli, AV88TFBarFecFpr, AV53TFBarFecSal, AV118Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62TotBarKgm, AV64TotBarMtr, AV66TotBarPie, AV68Moda21, AV101MacCod) ;
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
      pa27P2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start27P2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.test_v01", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARKGM", getSecureSignedToken( "", localUtil.format( AV62TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARMTR", getSecureSignedToken( "", localUtil.format( AV64TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66TotBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101MacCod), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Test_v01");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV118Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\test_v01:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICOD", GXutil.ltrim( localUtil.ntoc( AV14CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV15CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARDISNUM", GXutil.rtrim( AV71BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARDISNUMTO", GXutil.rtrim( AV74BarDisNumTo));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSIT", GXutil.ltrim( localUtil.ntoc( AV18BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV19BarSitTo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGEN", localUtil.format(AV16BarFecGen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGENTO", localUtil.format(AV17BarFecGenTo, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECCLI", localUtil.format(AV72BarFecCli, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECCLITO", localUtil.format(AV73BarFecCliTo, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECFPR", localUtil.format(AV76BarFecFpr, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECFPRTO", localUtil.format(AV77BarFecFprto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECSAL", localUtil.format(AV78BarFecSal, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECSALTO", localUtil.format(AV79BarFecSalto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNOM", GXutil.rtrim( AV80BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV81BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNOMTO", GXutil.rtrim( AV86BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNUMTO", GXutil.ltrim( localUtil.ntoc( AV87BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNOMCLI", GXutil.rtrim( AV82BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNUMCLI", GXutil.ltrim( localUtil.ntoc( AV83BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNOMCLITO", GXutil.rtrim( AV84BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNUMCLITO", GXutil.ltrim( localUtil.ntoc( AV85BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSER", GXutil.rtrim( AV110BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSERTO", GXutil.rtrim( AV111BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOD", GXutil.ltrim( localUtil.ntoc( AV90BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV91BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODPAR", GXutil.rtrim( AV92BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODTO", GXutil.ltrim( localUtil.ntoc( AV96BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODREOTO", GXutil.ltrim( localUtil.ntoc( AV97BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODPARTO", GXutil.rtrim( AV98BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARGIRAR", GXutil.rtrim( AV94BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARTIPART", GXutil.ltrim( localUtil.ntoc( AV108BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARTIPARTTO", GXutil.ltrim( localUtil.ntoc( AV109BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCOD_IDTX", GXutil.rtrim( AV93Cod_Idtx));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_221", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_221, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARTIPART_DATA", AV112BarTipArt_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARTIPART_DATA", AV112BarTipArt_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARTIPARTTO_DATA", AV113BarTipArtto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARTIPARTTO_DATA", AV113BarTipArtto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOD_IDTX_DATA", AV99Cod_Idtx_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOD_IDTX_DATA", AV99Cod_Idtx_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV43GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV44GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV41DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOD", GXutil.ltrim( localUtil.ntoc( AV21TFBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV22TFBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODREO", GXutil.ltrim( localUtil.ntoc( AV23TFBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODREO_TO", GXutil.ltrim( localUtil.ntoc( AV24TFBarCodReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODPAR", GXutil.rtrim( AV25TFBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODPAR_SEL", GXutil.rtrim( AV26TFBarCodPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARDISNUM", GXutil.rtrim( AV27TFBarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARDISNUM_SEL", GXutil.rtrim( AV28TFBarDisNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV29TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV30TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV31TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV32TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER", GXutil.rtrim( AV33TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER_SEL", GXutil.rtrim( AV34TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC", GXutil.rtrim( AV35TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC_SEL", GXutil.rtrim( AV36TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM", GXutil.rtrim( AV55TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM_SEL", GXutil.rtrim( AV56TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV57TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV58TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI", GXutil.rtrim( AV59TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI_SEL", GXutil.rtrim( AV60TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV37TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV38TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECGEN", localUtil.dtoc( AV39TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECCLI", localUtil.dtoc( AV49TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECFPR", localUtil.dtoc( AV88TFBarFecFpr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECSAL", localUtil.dtoc( AV53TFBarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV46EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMCLI", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV62TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARKGM", getSecureSignedToken( "", localUtil.format( AV62TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV64TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARMTR", getSecureSignedToken( "", localUtil.format( AV64TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARPIE", GXutil.ltrim( localUtil.ntoc( AV66TotBarPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66TotBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV68Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMACCOD", GXutil.ltrim( localUtil.ntoc( AV101MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101MacCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPLFTO", GXutil.rtrim( AV107BarplfTo));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARPLF", GXutil.rtrim( AV106Barplf));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPROPER", GXutil.rtrim( A2829BarProPer));
      app.GxWebStd.gx_hidden_field( httpContext, "DISCOD", GXutil.ltrim( localUtil.ntoc( A361DisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_Cls", GXutil.rtrim( Combo_bartipart_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_Selectedvalue_set", GXutil.rtrim( Combo_bartipart_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_Emptyitemtext", GXutil.rtrim( Combo_bartipart_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Cls", GXutil.rtrim( Combo_bartipartto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Selectedvalue_set", GXutil.rtrim( Combo_bartipartto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Emptyitemtext", GXutil.rtrim( Combo_bartipartto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Cls", GXutil.rtrim( Combo_cod_idtx_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Selectedvalue_set", GXutil.rtrim( Combo_cod_idtx_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Visible", GXutil.booltostr( Combo_cod_idtx_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Emptyitemtext", GXutil.rtrim( Combo_cod_idtx_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Selectedvalue_get", GXutil.rtrim( Combo_cod_idtx_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Selectedvalue_get", GXutil.rtrim( Combo_bartipartto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_Selectedvalue_get", GXutil.rtrim( Combo_bartipart_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "BARACAANH_Visible", GXutil.ltrim( localUtil.ntoc( edtBarAcaAnh_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCUADERN_Visible", GXutil.ltrim( localUtil.ntoc( edtBarCuadern_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNORMAS_Visible", GXutil.ltrim( localUtil.ntoc( edtBarNormas_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_COD_IDTX_Selectedvalue_get", GXutil.rtrim( Combo_cod_idtx_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPARTTO_Selectedvalue_get", GXutil.rtrim( Combo_bartipartto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_BARTIPART_Selectedvalue_get", GXutil.rtrim( Combo_bartipart_Selectedvalue_get));
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
         we27P2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt27P2( ) ;
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
      return formatLink("app.produccion.test_v01", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Produccion.Test_v01" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta de Produccion", "") ;
   }

   public void wb27P0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente Inicial", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV14CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,19);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-6 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV15CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15CliCodto), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15CliCodto), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodto_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBardisnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBardisnum_Internalname, httpContext.getMessage( "Ped. Cli. Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnum_Internalname, GXutil.rtrim( AV71BarDisNum), GXutil.rtrim( localUtil.format( AV71BarDisNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBardisnum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBardisnumto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBardisnumto_Internalname, httpContext.getMessage( "Ped. Cli. Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnumto_Internalname, GXutil.rtrim( AV74BarDisNumTo), GXutil.rtrim( localUtil.format( AV74BarDisNumTo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBardisnumto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsit_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsit_Internalname, httpContext.getMessage( "Sit. Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsit_Internalname, GXutil.ltrim( localUtil.ntoc( AV18BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV18BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsit_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarsitto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarsitto_Internalname, httpContext.getMessage( "Sit. Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitto_Internalname, GXutil.ltrim( localUtil.ntoc( AV19BarSitTo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19BarSitTo), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV19BarSitTo), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsitto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecgen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgen_Internalname, httpContext.getMessage( "Fecha Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgen_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgen_Internalname, localUtil.format(AV16BarFecGen, "99/99/99"), localUtil.format( AV16BarFecGen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecgento_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecgento_Internalname, httpContext.getMessage( "Fecha Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecgento_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgento_Internalname, localUtil.format(AV17BarFecGenTo, "99/99/99"), localUtil.format( AV17BarFecGenTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgento_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgento_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgento_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgento_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfeccli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfeccli_Internalname, httpContext.getMessage( "Fec. Ped. Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfeccli_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfeccli_Internalname, localUtil.format(AV72BarFecCli, "99/99/99"), localUtil.format( AV72BarFecCli, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfeccli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfeccli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfeccli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfeccli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecclito_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecclito_Internalname, httpContext.getMessage( "Fec. Ped. Cli.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 61,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecclito_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecclito_Internalname, localUtil.format(AV73BarFecCliTo, "99/99/99"), localUtil.format( AV73BarFecCliTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecclito_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecclito_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecclito_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecfpr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecfpr_Internalname, httpContext.getMessage( "Fecha Prev.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecfpr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecfpr_Internalname, localUtil.format(AV76BarFecFpr, "99/99/99"), localUtil.format( AV76BarFecFpr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecfpr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecfpr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecfpr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecfpr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecfprto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecfprto_Internalname, httpContext.getMessage( "Fecha Prev.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecfprto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecfprto_Internalname, localUtil.format(AV77BarFecFprto, "99/99/99"), localUtil.format( AV77BarFecFprto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecfprto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecfprto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecfprto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecfprto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecsal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecsal_Internalname, httpContext.getMessage( "Fecha Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 73,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecsal_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecsal_Internalname, localUtil.format(AV78BarFecSal, "99/99/99"), localUtil.format( AV78BarFecSal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecsal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecsal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecsal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecsal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfecsalto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecsalto_Internalname, httpContext.getMessage( "Fecha Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 77,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecsalto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecsalto_Internalname, localUtil.format(AV79BarFecSalto, "99/99/99"), localUtil.format( AV79BarFecSalto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecsalto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecsalto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecsalto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecsalto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Color", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV80BarColNom), GXutil.rtrim( localUtil.format( AV80BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV81BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV81BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV81BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomto_Internalname, GXutil.rtrim( AV86BarColNomto), GXutil.rtrim( localUtil.format( AV86BarColNomto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnomto_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnumto_Internalname, GXutil.ltrim( localUtil.ntoc( AV87BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnumto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV87BarColNumto), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV87BarColNumto), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnumto_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnomcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomcli_Internalname, httpContext.getMessage( "Color Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV82BarNomCli), GXutil.rtrim( localUtil.format( AV82BarNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnumcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnumcli_Internalname, httpContext.getMessage( "Numero ", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV83BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV83BarNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomclito_Internalname, GXutil.rtrim( AV84BarNomClito), GXutil.rtrim( localUtil.format( AV84BarNomClito, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomclito_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumclito_Internalname, GXutil.ltrim( localUtil.ntoc( AV85BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumclito_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV85BarNumClito), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV85BarNumClito), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumclito_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 135,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV110BarSer), GXutil.rtrim( localUtil.format( AV110BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 139,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserto_Internalname, GXutil.rtrim( AV111BarSerto), GXutil.rtrim( localUtil.format( AV111BarSerto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserto_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedbartipart_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_bartipart_Internalname, httpContext.getMessage( "Tipo Art. Inicial", ""), "", "", lblTextblockcombo_bartipart_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_bartipart.setProperty("Caption", Combo_bartipart_Caption);
         ucCombo_bartipart.setProperty("Cls", Combo_bartipart_Cls);
         ucCombo_bartipart.setProperty("EmptyItemText", Combo_bartipart_Emptyitemtext);
         ucCombo_bartipart.setProperty("DropDownOptionsData", AV112BarTipArt_Data);
         ucCombo_bartipart.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_bartipart_Internalname, "COMBO_BARTIPARTContainer");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_bartipartto_Internalname, httpContext.getMessage( "Tipo Art. Final", ""), "", "", lblTextblockcombo_bartipartto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_bartipartto.setProperty("Caption", Combo_bartipartto_Caption);
         ucCombo_bartipartto.setProperty("Cls", Combo_bartipartto_Cls);
         ucCombo_bartipartto.setProperty("EmptyItemText", Combo_bartipartto_Emptyitemtext);
         ucCombo_bartipartto.setProperty("DropDownOptionsData", AV113BarTipArtto_Data);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "N Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 170,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV90BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV90BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV90BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,170);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV91BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV91BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV91BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV92BarCodPar), GXutil.rtrim( localUtil.format( AV92BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,178);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV96BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV96BarCodto), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV96BarCodto), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodto_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreoto_Internalname, GXutil.ltrim( localUtil.ntoc( AV97BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreoto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV97BarCodReoto), "9") : localUtil.format( DecimalUtil.doubleToDec(AV97BarCodReoto), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreoto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreoto_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparto_Internalname, GXutil.rtrim( AV98BarCodParto), GXutil.rtrim( localUtil.format( AV98BarCodParto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparto_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cod_idtx_Internalname, httpContext.getMessage( "Clear To Wear", ""), "", "", lblTextblockcombo_cod_idtx_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cod_idtx.setProperty("Caption", Combo_cod_idtx_Caption);
         ucCombo_cod_idtx.setProperty("Cls", Combo_cod_idtx_Cls);
         ucCombo_cod_idtx.setProperty("EmptyItemText", Combo_cod_idtx_Emptyitemtext);
         ucCombo_cod_idtx.setProperty("DropDownOptionsData", AV99Cod_Idtx_Data);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 205,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBargirar_Internalname, GXutil.rtrim( AV94BarGirar), GXutil.rtrim( localUtil.format( AV94BarGirar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,205);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBargirar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBargirar_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divMuestras_cell_Internalname, 1, 0, "px", 0, "px", divMuestras_cell_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", cmbavMuestras.getVisible(), 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavMuestras.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavMuestras.getInternalname(), httpContext.getMessage( "Amostras?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavMuestras, cmbavMuestras.getInternalname(), GXutil.rtrim( AV95Muestras), 1, cmbavMuestras.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavMuestras.getVisible(), cmbavMuestras.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,209);\"", "", true, (byte)(0), "HLP_Produccion\\Test_v01.htm");
         cmbavMuestras.setValue( GXutil.rtrim( AV95Muestras) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Values", cmbavMuestras.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol221( ) ;
      }
      if ( wbEnd == 221 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_221 = (int)(nGXsfl_221_idx-1) ;
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
         wb_table1_257_27P2( true) ;
      }
      else
      {
         wb_table1_257_27P2( false) ;
      }
      return  ;
   }

   public void wb_table1_257_27P2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV43GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV44GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV118Pgmname), GXutil.rtrim( localUtil.format( AV118Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipart_Internalname, GXutil.ltrim( localUtil.ntoc( AV108BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV108BarTipArt), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,311);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipart_Jsonclick, 0, "Attribute", "", "", "", "", edtavBartipart_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 312,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipartto_Internalname, GXutil.ltrim( localUtil.ntoc( AV109BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV109BarTipArtto), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,312);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipartto_Jsonclick, 0, "Attribute", "", "", "", "", edtavBartipartto_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 313,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCod_idtx_Internalname, GXutil.rtrim( AV93Cod_Idtx), GXutil.rtrim( localUtil.format( AV93Cod_Idtx, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,313);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCod_idtx_Jsonclick, 0, "Attribute", "", "", "", "", edtavCod_idtx_Visible, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV41DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_315_27P2( true) ;
      }
      else
      {
         wb_table2_315_27P2( false) ;
      }
      return  ;
   }

   public void wb_table2_315_27P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_320_27P2( true) ;
      }
      else
      {
         wb_table3_320_27P2( false) ;
      }
      return  ;
   }

   public void wb_table3_320_27P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_325_27P2( true) ;
      }
      else
      {
         wb_table4_325_27P2( false) ;
      }
      return  ;
   }

   public void wb_table4_325_27P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table5_330_27P2( true) ;
      }
      else
      {
         wb_table5_330_27P2( false) ;
      }
      return  ;
   }

   public void wb_table5_330_27P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table6_335_27P2( true) ;
      }
      else
      {
         wb_table6_335_27P2( false) ;
      }
      return  ;
   }

   public void wb_table6_335_27P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table7_340_27P2( true) ;
      }
      else
      {
         wb_table7_340_27P2( false) ;
      }
      return  ;
   }

   public void wb_table7_340_27P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table8_345_27P2( true) ;
      }
      else
      {
         wb_table8_345_27P2( false) ;
      }
      return  ;
   }

   public void wb_table8_345_27P2e( boolean wbgen )
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
            app.GxWebStd.gx_hidden_field( httpContext, "W0352"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0352"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_221_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0352"+"");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecgenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 354,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdate_Internalname, localUtil.format(AV40DDO_BarFecGenAuxDate, "99/99/99"), localUtil.format( AV40DDO_BarFecGenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,354);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 356,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdate_Internalname, localUtil.format(AV50DDO_BarFecCliAuxDate, "99/99/99"), localUtil.format( AV50DDO_BarFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,356);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecfprauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 358,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecfprauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecfprauxdate_Internalname, localUtil.format(AV89DDO_BarFecFprAuxDate, "99/99/99"), localUtil.format( AV89DDO_BarFecFprAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,358);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecfprauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecfprauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecsalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 360,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecsalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecsalauxdate_Internalname, localUtil.format(AV54DDO_BarFecSalAuxDate, "99/99/99"), localUtil.format( AV54DDO_BarFecSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,360);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecsalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecsalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 221 )
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

   public void start27P2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta de Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup27P0( ) ;
   }

   public void ws27P2( )
   {
      start27P2( ) ;
      evt27P2( ) ;
   }

   public void evt27P2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_BARTIPART.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1127P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_BARTIPARTTO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1227P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_COD_IDTX.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1327P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1427P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1527P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1627P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "SITUACIONFASES_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1727P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "CONSULTAALBARANSALIDA_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1827P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "RECETAS_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1927P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "PARTESPRODUCCION_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2027P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "PIEZAS_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2127P2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "AGRUPADAS_MODAL.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2227P2 ();
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
                           nGXsfl_221_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_221_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_221_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_2212( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV61GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActionGroup1), 4, 0));
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
                           A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n252CliCod = false ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
                           A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
                           A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n217BarTipArt = false ;
                           A13711BarTipArtD = httpContext.cgiGet( edtBarTipArtD_Internalname) ;
                           n13711BarTipArtD = false ;
                           A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
                           A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
                           A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
                           A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
                           A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A159BarFecGen = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecGen_Internalname), 0)) ;
                           A155BarFecCli = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecCli_Internalname), 0)) ;
                           A158BarFecFpr = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecFpr_Internalname), 0)) ;
                           A161BarFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtBarFecSal_Internalname), 0)) ;
                           A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
                           n151BarFasCod = false ;
                           A1955BarFasSig = httpContext.cgiGet( edtBarFasSig_Internalname) ;
                           n1955BarFasSig = false ;
                           A13930BarAlbUlti = localUtil.ctol( httpContext.cgiGet( edtBarAlbUlti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A13935BarAlbFact = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbFact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A2454BarGirar = httpContext.cgiGet( edtBarGirar_Internalname) ;
                           A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13933BarCuadern = httpContext.cgiGet( edtBarCuadern_Internalname) ;
                           n13933BarCuadern = false ;
                           A14204BarProPerI = httpContext.cgiGet( edtBarProPerI_Internalname) ;
                           A13934BarNormas = httpContext.cgiGet( edtBarNormas_Internalname) ;
                           A4348DisUsrCod = httpContext.cgiGet( edtDisUsrCod_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2327P2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2427P2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2527P2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2627P2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Clicod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV14CliCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicodto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV15CliCodto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bardisnum Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUM"), AV71BarDisNum) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bardisnumto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUMTO"), AV74BarDisNumTo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsit Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV18BarSit )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsitto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV19BarSitTo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgen Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGEN"), 0), AV16BarFecGen) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgento Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGENTO"), 0), AV17BarFecGenTo) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfeccli Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECCLI"), 0), AV72BarFecCli) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecclito Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECCLITO"), 0), AV73BarFecCliTo) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecfpr Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECFPR"), 0), AV76BarFecFpr) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecfprto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECFPRTO"), 0), AV77BarFecFprto) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecsal Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECSAL"), 0), AV78BarFecSal) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecsalto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECSALTO"), 0), AV79BarFecSalto) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOM"), AV80BarColNom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnum Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV81BarColNum )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnomto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOMTO"), AV86BarColNomto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnumto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUMTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV87BarColNumto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnomcli Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLI"), AV82BarNomCli) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnumcli Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83BarNumCli )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnomclito Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLITO"), AV84BarNomClito) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnumclito Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLITO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV85BarNumClito )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barser Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSER"), AV110BarSer) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barserto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSERTO"), AV111BarSerto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV90BarCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodreo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV91BarCodReo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodpar Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPAR"), AV92BarCodPar) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV96BarCodto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodreoto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREOTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV97BarCodReoto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodparto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPARTO"), AV98BarCodParto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bargirar Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARGIRAR"), AV94BarGirar) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bartipart Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV108BarTipArt )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bartipartto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPARTTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV109BarTipArtto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cod_idtx Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCOD_IDTX"), AV93Cod_Idtx) != 0 )
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
                     if ( nCmpId == 352 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0352") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0352", "", sEvt);
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

   public void we27P2( )
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

   public void pa27P2( )
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
            GX_FocusControl = edtavClicod_Internalname ;
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
      subsflControlProps_2212( ) ;
      while ( nGXsfl_221_idx <= nRC_GXsfl_221 )
      {
         sendrow_2212( ) ;
         nGXsfl_221_idx = ((subGrid_Islastpage==1)&&(nGXsfl_221_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_221_idx+1) ;
         sGXsfl_221_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_221_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2212( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 int AV14CliCod ,
                                 int AV15CliCodto ,
                                 String AV71BarDisNum ,
                                 String AV74BarDisNumTo ,
                                 byte AV18BarSit ,
                                 byte AV19BarSitTo ,
                                 java.util.Date AV16BarFecGen ,
                                 java.util.Date AV17BarFecGenTo ,
                                 java.util.Date AV72BarFecCli ,
                                 java.util.Date AV73BarFecCliTo ,
                                 java.util.Date AV76BarFecFpr ,
                                 java.util.Date AV77BarFecFprto ,
                                 java.util.Date AV78BarFecSal ,
                                 java.util.Date AV79BarFecSalto ,
                                 String AV80BarColNom ,
                                 int AV81BarColNum ,
                                 String AV86BarColNomto ,
                                 int AV87BarColNumto ,
                                 String AV82BarNomCli ,
                                 int AV83BarNumCli ,
                                 String AV84BarNomClito ,
                                 int AV85BarNumClito ,
                                 String AV110BarSer ,
                                 String AV111BarSerto ,
                                 int AV90BarCod ,
                                 byte AV91BarCodReo ,
                                 String AV92BarCodPar ,
                                 int AV96BarCodto ,
                                 byte AV97BarCodReoto ,
                                 String AV98BarCodParto ,
                                 String AV94BarGirar ,
                                 short AV108BarTipArt ,
                                 short AV109BarTipArtto ,
                                 String AV93Cod_Idtx ,
                                 String AV46EmprCod ,
                                 int AV21TFBarCod ,
                                 int AV22TFBarCod_To ,
                                 byte AV23TFBarCodReo ,
                                 byte AV24TFBarCodReo_To ,
                                 String AV25TFBarCodPar ,
                                 String AV26TFBarCodPar_Sel ,
                                 String AV27TFBarDisNum ,
                                 String AV28TFBarDisNum_Sel ,
                                 int AV29TFCliCod ,
                                 int AV30TFCliCod_To ,
                                 String AV31TFCliNom ,
                                 String AV32TFCliNom_Sel ,
                                 String AV33TFBarSer ,
                                 String AV34TFBarSer_Sel ,
                                 String AV35TFBarSerDsc ,
                                 String AV36TFBarSerDsc_Sel ,
                                 String AV55TFBarColNom ,
                                 String AV56TFBarColNom_Sel ,
                                 int AV57TFBarColNum ,
                                 int AV58TFBarColNum_To ,
                                 String AV59TFBarNomCli ,
                                 String AV60TFBarNomCli_Sel ,
                                 byte AV37TFBarSit ,
                                 byte AV38TFBarSit_To ,
                                 java.util.Date AV39TFBarFecGen ,
                                 java.util.Date AV49TFBarFecCli ,
                                 java.util.Date AV88TFBarFecFpr ,
                                 java.util.Date AV53TFBarFecSal ,
                                 String AV118Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV62TotBarKgm ,
                                 java.math.BigDecimal AV64TotBarMtr ,
                                 long AV66TotBarPie ,
                                 short AV68Moda21 ,
                                 int AV101MacCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2427P2 ();
      GRID_nCurrentRecord = 0 ;
      rf27P2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Test_v01");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV118Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\test_v01:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      if ( cmbavMuestras.getItemCount() > 0 )
      {
         AV95Muestras = cmbavMuestras.getValidValue(AV95Muestras) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Muestras", AV95Muestras);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavMuestras.setValue( GXutil.rtrim( AV95Muestras) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Values", cmbavMuestras.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf27P2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV118Pgmname = "Produccion.Test_v01" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118Pgmname", AV118Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavTotvaluebarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27P2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(221) ;
      /* Execute user event: Refresh */
      e2427P2 ();
      nGXsfl_221_idx = 1 ;
      sGXsfl_221_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_221_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2212( ) ;
      bGXsfl_221_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_2212( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV119Produccion_test_v01ds_1_tfbarcod) ,
                                              Integer.valueOf(AV120Produccion_test_v01ds_2_tfbarcod_to) ,
                                              Byte.valueOf(AV121Produccion_test_v01ds_3_tfbarcodreo) ,
                                              Byte.valueOf(AV122Produccion_test_v01ds_4_tfbarcodreo_to) ,
                                              AV124Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                              AV123Produccion_test_v01ds_5_tfbarcodpar ,
                                              AV126Produccion_test_v01ds_8_tfbardisnum_sel ,
                                              AV125Produccion_test_v01ds_7_tfbardisnum ,
                                              Integer.valueOf(AV127Produccion_test_v01ds_9_tfclicod) ,
                                              Integer.valueOf(AV128Produccion_test_v01ds_10_tfclicod_to) ,
                                              AV130Produccion_test_v01ds_12_tfclinom_sel ,
                                              AV129Produccion_test_v01ds_11_tfclinom ,
                                              AV132Produccion_test_v01ds_14_tfbarser_sel ,
                                              AV131Produccion_test_v01ds_13_tfbarser ,
                                              AV134Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                              AV133Produccion_test_v01ds_15_tfbarserdsc ,
                                              AV136Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                              AV135Produccion_test_v01ds_17_tfbarcolnom ,
                                              Integer.valueOf(AV137Produccion_test_v01ds_19_tfbarcolnum) ,
                                              Integer.valueOf(AV138Produccion_test_v01ds_20_tfbarcolnum_to) ,
                                              AV140Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                              AV139Produccion_test_v01ds_21_tfbarnomcli ,
                                              Byte.valueOf(AV141Produccion_test_v01ds_23_tfbarsit) ,
                                              Byte.valueOf(AV142Produccion_test_v01ds_24_tfbarsit_to) ,
                                              AV143Produccion_test_v01ds_25_tfbarfecgen ,
                                              AV144Produccion_test_v01ds_26_tfbarfeccli ,
                                              AV145Produccion_test_v01ds_27_tfbarfecfpr ,
                                              AV146Produccion_test_v01ds_28_tfbarfecsal ,
                                              Integer.valueOf(AV14CliCod) ,
                                              Integer.valueOf(AV15CliCodto) ,
                                              AV71BarDisNum ,
                                              AV74BarDisNumTo ,
                                              AV16BarFecGen ,
                                              AV17BarFecGenTo ,
                                              AV72BarFecCli ,
                                              AV73BarFecCliTo ,
                                              AV78BarFecSal ,
                                              AV79BarFecSalto ,
                                              AV76BarFecFpr ,
                                              AV77BarFecFprto ,
                                              AV80BarColNom ,
                                              AV86BarColNomto ,
                                              Integer.valueOf(AV81BarColNum) ,
                                              Integer.valueOf(AV87BarColNumto) ,
                                              AV82BarNomCli ,
                                              AV84BarNomClito ,
                                              Integer.valueOf(AV83BarNumCli) ,
                                              Integer.valueOf(AV85BarNumClito) ,
                                              Integer.valueOf(AV90BarCod) ,
                                              Integer.valueOf(AV96BarCodto) ,
                                              Byte.valueOf(AV91BarCodReo) ,
                                              Byte.valueOf(AV97BarCodReoto) ,
                                              AV92BarCodPar ,
                                              AV98BarCodParto ,
                                              AV93Cod_Idtx ,
                                              AV94BarGirar ,
                                              Short.valueOf(AV108BarTipArt) ,
                                              Short.valueOf(AV109BarTipArtto) ,
                                              AV110BarSer ,
                                              AV111BarSerto ,
                                              Integer.valueOf(A129BarCod) ,
                                              Byte.valueOf(A132BarCodReo) ,
                                              A130BarCodPar ,
                                              A143BarDisNum ,
                                              Integer.valueOf(A252CliCod) ,
                                              A279CliNom ,
                                              A212BarSer ,
                                              A1652BarSerDsc ,
                                              A135BarColNom ,
                                              Integer.valueOf(A136BarColNum) ,
                                              A1234BarNomCli ,
                                              Byte.valueOf(A213BarSit) ,
                                              A159BarFecGen ,
                                              A155BarFecCli ,
                                              A158BarFecFpr ,
                                              A161BarFecSal ,
                                              Integer.valueOf(A1235BarNumCli) ,
                                              A2829BarProPer ,
                                              A2454BarGirar ,
                                              Short.valueOf(A217BarTipArt) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              Byte.valueOf(AV18BarSit) ,
                                              Byte.valueOf(AV19BarSitTo) ,
                                              AV46EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV123Produccion_test_v01ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV123Produccion_test_v01ds_5_tfbarcodpar), 1, "%") ;
         lV125Produccion_test_v01ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV125Produccion_test_v01ds_7_tfbardisnum), 8, "%") ;
         lV129Produccion_test_v01ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV129Produccion_test_v01ds_11_tfclinom), 30, "%") ;
         lV131Produccion_test_v01ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV131Produccion_test_v01ds_13_tfbarser), 16, "%") ;
         lV133Produccion_test_v01ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV133Produccion_test_v01ds_15_tfbarserdsc), 26, "%") ;
         lV135Produccion_test_v01ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV135Produccion_test_v01ds_17_tfbarcolnom), 13, "%") ;
         lV139Produccion_test_v01ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV139Produccion_test_v01ds_21_tfbarnomcli), 13, "%") ;
         /* Using cursor H027P9 */
         pr_default.execute(0, new Object[] {AV46EmprCod, Byte.valueOf(AV18BarSit), Byte.valueOf(AV19BarSitTo), Integer.valueOf(AV119Produccion_test_v01ds_1_tfbarcod), Integer.valueOf(AV120Produccion_test_v01ds_2_tfbarcod_to), Byte.valueOf(AV121Produccion_test_v01ds_3_tfbarcodreo), Byte.valueOf(AV122Produccion_test_v01ds_4_tfbarcodreo_to), lV123Produccion_test_v01ds_5_tfbarcodpar, AV124Produccion_test_v01ds_6_tfbarcodpar_sel, lV125Produccion_test_v01ds_7_tfbardisnum, AV126Produccion_test_v01ds_8_tfbardisnum_sel, Integer.valueOf(AV127Produccion_test_v01ds_9_tfclicod), Integer.valueOf(AV128Produccion_test_v01ds_10_tfclicod_to), lV129Produccion_test_v01ds_11_tfclinom, AV130Produccion_test_v01ds_12_tfclinom_sel, lV131Produccion_test_v01ds_13_tfbarser, AV132Produccion_test_v01ds_14_tfbarser_sel, lV133Produccion_test_v01ds_15_tfbarserdsc, AV134Produccion_test_v01ds_16_tfbarserdsc_sel, lV135Produccion_test_v01ds_17_tfbarcolnom, AV136Produccion_test_v01ds_18_tfbarcolnom_sel, Integer.valueOf(AV137Produccion_test_v01ds_19_tfbarcolnum), Integer.valueOf(AV138Produccion_test_v01ds_20_tfbarcolnum_to), lV139Produccion_test_v01ds_21_tfbarnomcli, AV140Produccion_test_v01ds_22_tfbarnomcli_sel, Byte.valueOf(AV141Produccion_test_v01ds_23_tfbarsit), Byte.valueOf(AV142Produccion_test_v01ds_24_tfbarsit_to), AV143Produccion_test_v01ds_25_tfbarfecgen, AV144Produccion_test_v01ds_26_tfbarfeccli, AV145Produccion_test_v01ds_27_tfbarfecfpr, AV146Produccion_test_v01ds_28_tfbarfecsal, Integer.valueOf(AV14CliCod), Integer.valueOf(AV15CliCodto), AV71BarDisNum, AV74BarDisNumTo, AV16BarFecGen, AV17BarFecGenTo, AV72BarFecCli, AV73BarFecCliTo, AV78BarFecSal, AV79BarFecSalto, AV76BarFecFpr, AV77BarFecFprto, AV80BarColNom, AV86BarColNomto, Integer.valueOf(AV81BarColNum), Integer.valueOf(AV87BarColNumto), AV82BarNomCli, AV84BarNomClito, Integer.valueOf(AV83BarNumCli), Integer.valueOf(AV85BarNumClito), Integer.valueOf(AV90BarCod), Integer.valueOf(AV96BarCodto), Byte.valueOf(AV91BarCodReo), Byte.valueOf(AV97BarCodReoto), AV92BarCodPar, AV98BarCodParto, AV93Cod_Idtx, AV94BarGirar, Short.valueOf(AV108BarTipArt), Short.valueOf(AV109BarTipArtto), AV110BarSer, AV111BarSerto, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_221_idx = 1 ;
         sGXsfl_221_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_221_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2212( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1235BarNumCli = H027P9_A1235BarNumCli[0] ;
            A4348DisUsrCod = H027P9_A4348DisUsrCod[0] ;
            A4466BarAcaAnh = H027P9_A4466BarAcaAnh[0] ;
            A2454BarGirar = H027P9_A2454BarGirar[0] ;
            A161BarFecSal = H027P9_A161BarFecSal[0] ;
            A158BarFecFpr = H027P9_A158BarFecFpr[0] ;
            A155BarFecCli = H027P9_A155BarFecCli[0] ;
            A159BarFecGen = H027P9_A159BarFecGen[0] ;
            A213BarSit = H027P9_A213BarSit[0] ;
            A1234BarNomCli = H027P9_A1234BarNomCli[0] ;
            A136BarColNum = H027P9_A136BarColNum[0] ;
            A135BarColNom = H027P9_A135BarColNom[0] ;
            A13711BarTipArtD = H027P9_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H027P9_n13711BarTipArtD[0] ;
            A217BarTipArt = H027P9_A217BarTipArt[0] ;
            n217BarTipArt = H027P9_n217BarTipArt[0] ;
            A1652BarSerDsc = H027P9_A1652BarSerDsc[0] ;
            A212BarSer = H027P9_A212BarSer[0] ;
            A279CliNom = H027P9_A279CliNom[0] ;
            A252CliCod = H027P9_A252CliCod[0] ;
            n252CliCod = H027P9_n252CliCod[0] ;
            A143BarDisNum = H027P9_A143BarDisNum[0] ;
            A120BarAgrEst = H027P9_A120BarAgrEst[0] ;
            A13933BarCuadern = H027P9_A13933BarCuadern[0] ;
            n13933BarCuadern = H027P9_n13933BarCuadern[0] ;
            A1955BarFasSig = H027P9_A1955BarFasSig[0] ;
            n1955BarFasSig = H027P9_n1955BarFasSig[0] ;
            A151BarFasCod = H027P9_A151BarFasCod[0] ;
            n151BarFasCod = H027P9_n151BarFasCod[0] ;
            A184BarMtr = H027P9_A184BarMtr[0] ;
            A166BarKgm = H027P9_A166BarKgm[0] ;
            A199BarPie1 = H027P9_A199BarPie1[0] ;
            A365DisDes = H027P9_A365DisDes[0] ;
            A898BarPieNDes = H027P9_A898BarPieNDes[0] ;
            A130BarCodPar = H027P9_A130BarCodPar[0] ;
            A132BarCodReo = H027P9_A132BarCodReo[0] ;
            A129BarCod = H027P9_A129BarCod[0] ;
            A2829BarProPer = H027P9_A2829BarProPer[0] ;
            A361DisCod = H027P9_A361DisCod[0] ;
            A396EmprCod = H027P9_A396EmprCod[0] ;
            A4348DisUsrCod = H027P9_A4348DisUsrCod[0] ;
            A13711BarTipArtD = H027P9_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H027P9_n13711BarTipArtD[0] ;
            A279CliNom = H027P9_A279CliNom[0] ;
            A13933BarCuadern = H027P9_A13933BarCuadern[0] ;
            n13933BarCuadern = H027P9_n13933BarCuadern[0] ;
            A1955BarFasSig = H027P9_A1955BarFasSig[0] ;
            n1955BarFasSig = H027P9_n1955BarFasSig[0] ;
            A151BarFasCod = H027P9_A151BarFasCod[0] ;
            n151BarFasCod = H027P9_n151BarFasCod[0] ;
            A184BarMtr = H027P9_A184BarMtr[0] ;
            A166BarKgm = H027P9_A166BarKgm[0] ;
            A199BarPie1 = H027P9_A199BarPie1[0] ;
            A898BarPieNDes = H027P9_A898BarPieNDes[0] ;
            GXt_int1 = A13930BarAlbUlti ;
            GXv_int2[0] = GXt_int1 ;
            new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int2) ;
            test_v01_impl.this.GXt_int1 = GXv_int2[0] ;
            A13930BarAlbUlti = GXt_int1 ;
            GXt_int3 = A13935BarAlbFact ;
            GXv_int4[0] = GXt_int3 ;
            new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int4) ;
            test_v01_impl.this.GXt_int3 = GXv_int4[0] ;
            A13935BarAlbFact = GXt_int3 ;
            GXt_char5 = A14204BarProPerI ;
            GXv_char6[0] = GXt_char5 ;
            new app.pinditexin(remoteHandle, context).execute( A396EmprCod, A2829BarProPer, GXv_char6) ;
            test_v01_impl.this.GXt_char5 = GXv_char6[0] ;
            A14204BarProPerI = GXt_char5 ;
            GXt_char5 = A13934BarNormas ;
            GXv_char6[0] = GXt_char5 ;
            new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char6) ;
            test_v01_impl.this.GXt_char5 = GXv_char6[0] ;
            A13934BarNormas = GXt_char5 ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            e2527P2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(221) ;
         wb27P0( ) ;
      }
      bGXsfl_221_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes27P2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV46EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV62TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARKGM", getSecureSignedToken( "", localUtil.format( AV62TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV64TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARMTR", getSecureSignedToken( "", localUtil.format( AV64TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARPIE", GXutil.ltrim( localUtil.ntoc( AV66TotBarPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66TotBarPie), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV68Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMACCOD", GXutil.ltrim( localUtil.ntoc( AV101MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMACCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV101MacCod), "ZZZZZZZ9")));
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
      AV119Produccion_test_v01ds_1_tfbarcod = AV21TFBarCod ;
      AV120Produccion_test_v01ds_2_tfbarcod_to = AV22TFBarCod_To ;
      AV121Produccion_test_v01ds_3_tfbarcodreo = AV23TFBarCodReo ;
      AV122Produccion_test_v01ds_4_tfbarcodreo_to = AV24TFBarCodReo_To ;
      AV123Produccion_test_v01ds_5_tfbarcodpar = AV25TFBarCodPar ;
      AV124Produccion_test_v01ds_6_tfbarcodpar_sel = AV26TFBarCodPar_Sel ;
      AV125Produccion_test_v01ds_7_tfbardisnum = AV27TFBarDisNum ;
      AV126Produccion_test_v01ds_8_tfbardisnum_sel = AV28TFBarDisNum_Sel ;
      AV127Produccion_test_v01ds_9_tfclicod = AV29TFCliCod ;
      AV128Produccion_test_v01ds_10_tfclicod_to = AV30TFCliCod_To ;
      AV129Produccion_test_v01ds_11_tfclinom = AV31TFCliNom ;
      AV130Produccion_test_v01ds_12_tfclinom_sel = AV32TFCliNom_Sel ;
      AV131Produccion_test_v01ds_13_tfbarser = AV33TFBarSer ;
      AV132Produccion_test_v01ds_14_tfbarser_sel = AV34TFBarSer_Sel ;
      AV133Produccion_test_v01ds_15_tfbarserdsc = AV35TFBarSerDsc ;
      AV134Produccion_test_v01ds_16_tfbarserdsc_sel = AV36TFBarSerDsc_Sel ;
      AV135Produccion_test_v01ds_17_tfbarcolnom = AV55TFBarColNom ;
      AV136Produccion_test_v01ds_18_tfbarcolnom_sel = AV56TFBarColNom_Sel ;
      AV137Produccion_test_v01ds_19_tfbarcolnum = AV57TFBarColNum ;
      AV138Produccion_test_v01ds_20_tfbarcolnum_to = AV58TFBarColNum_To ;
      AV139Produccion_test_v01ds_21_tfbarnomcli = AV59TFBarNomCli ;
      AV140Produccion_test_v01ds_22_tfbarnomcli_sel = AV60TFBarNomCli_Sel ;
      AV141Produccion_test_v01ds_23_tfbarsit = AV37TFBarSit ;
      AV142Produccion_test_v01ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV143Produccion_test_v01ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV144Produccion_test_v01ds_26_tfbarfeccli = AV49TFBarFecCli ;
      AV145Produccion_test_v01ds_27_tfbarfecfpr = AV88TFBarFecFpr ;
      AV146Produccion_test_v01ds_28_tfbarfecsal = AV53TFBarFecSal ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV119Produccion_test_v01ds_1_tfbarcod) ,
                                           Integer.valueOf(AV120Produccion_test_v01ds_2_tfbarcod_to) ,
                                           Byte.valueOf(AV121Produccion_test_v01ds_3_tfbarcodreo) ,
                                           Byte.valueOf(AV122Produccion_test_v01ds_4_tfbarcodreo_to) ,
                                           AV124Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                           AV123Produccion_test_v01ds_5_tfbarcodpar ,
                                           AV126Produccion_test_v01ds_8_tfbardisnum_sel ,
                                           AV125Produccion_test_v01ds_7_tfbardisnum ,
                                           Integer.valueOf(AV127Produccion_test_v01ds_9_tfclicod) ,
                                           Integer.valueOf(AV128Produccion_test_v01ds_10_tfclicod_to) ,
                                           AV130Produccion_test_v01ds_12_tfclinom_sel ,
                                           AV129Produccion_test_v01ds_11_tfclinom ,
                                           AV132Produccion_test_v01ds_14_tfbarser_sel ,
                                           AV131Produccion_test_v01ds_13_tfbarser ,
                                           AV134Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                           AV133Produccion_test_v01ds_15_tfbarserdsc ,
                                           AV136Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                           AV135Produccion_test_v01ds_17_tfbarcolnom ,
                                           Integer.valueOf(AV137Produccion_test_v01ds_19_tfbarcolnum) ,
                                           Integer.valueOf(AV138Produccion_test_v01ds_20_tfbarcolnum_to) ,
                                           AV140Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                           AV139Produccion_test_v01ds_21_tfbarnomcli ,
                                           Byte.valueOf(AV141Produccion_test_v01ds_23_tfbarsit) ,
                                           Byte.valueOf(AV142Produccion_test_v01ds_24_tfbarsit_to) ,
                                           AV143Produccion_test_v01ds_25_tfbarfecgen ,
                                           AV144Produccion_test_v01ds_26_tfbarfeccli ,
                                           AV145Produccion_test_v01ds_27_tfbarfecfpr ,
                                           AV146Produccion_test_v01ds_28_tfbarfecsal ,
                                           Integer.valueOf(AV14CliCod) ,
                                           Integer.valueOf(AV15CliCodto) ,
                                           AV71BarDisNum ,
                                           AV74BarDisNumTo ,
                                           AV16BarFecGen ,
                                           AV17BarFecGenTo ,
                                           AV72BarFecCli ,
                                           AV73BarFecCliTo ,
                                           AV78BarFecSal ,
                                           AV79BarFecSalto ,
                                           AV76BarFecFpr ,
                                           AV77BarFecFprto ,
                                           AV80BarColNom ,
                                           AV86BarColNomto ,
                                           Integer.valueOf(AV81BarColNum) ,
                                           Integer.valueOf(AV87BarColNumto) ,
                                           AV82BarNomCli ,
                                           AV84BarNomClito ,
                                           Integer.valueOf(AV83BarNumCli) ,
                                           Integer.valueOf(AV85BarNumClito) ,
                                           Integer.valueOf(AV90BarCod) ,
                                           Integer.valueOf(AV96BarCodto) ,
                                           Byte.valueOf(AV91BarCodReo) ,
                                           Byte.valueOf(AV97BarCodReoto) ,
                                           AV92BarCodPar ,
                                           AV98BarCodParto ,
                                           AV93Cod_Idtx ,
                                           AV94BarGirar ,
                                           Short.valueOf(AV108BarTipArt) ,
                                           Short.valueOf(AV109BarTipArtto) ,
                                           AV110BarSer ,
                                           AV111BarSerto ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           Byte.valueOf(AV18BarSit) ,
                                           Byte.valueOf(AV19BarSitTo) ,
                                           AV46EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV123Produccion_test_v01ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV123Produccion_test_v01ds_5_tfbarcodpar), 1, "%") ;
      lV125Produccion_test_v01ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV125Produccion_test_v01ds_7_tfbardisnum), 8, "%") ;
      lV129Produccion_test_v01ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV129Produccion_test_v01ds_11_tfclinom), 30, "%") ;
      lV131Produccion_test_v01ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV131Produccion_test_v01ds_13_tfbarser), 16, "%") ;
      lV133Produccion_test_v01ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV133Produccion_test_v01ds_15_tfbarserdsc), 26, "%") ;
      lV135Produccion_test_v01ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV135Produccion_test_v01ds_17_tfbarcolnom), 13, "%") ;
      lV139Produccion_test_v01ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV139Produccion_test_v01ds_21_tfbarnomcli), 13, "%") ;
      /* Using cursor H027P17 */
      pr_default.execute(1, new Object[] {AV46EmprCod, Byte.valueOf(AV18BarSit), Byte.valueOf(AV19BarSitTo), Integer.valueOf(AV119Produccion_test_v01ds_1_tfbarcod), Integer.valueOf(AV120Produccion_test_v01ds_2_tfbarcod_to), Byte.valueOf(AV121Produccion_test_v01ds_3_tfbarcodreo), Byte.valueOf(AV122Produccion_test_v01ds_4_tfbarcodreo_to), lV123Produccion_test_v01ds_5_tfbarcodpar, AV124Produccion_test_v01ds_6_tfbarcodpar_sel, lV125Produccion_test_v01ds_7_tfbardisnum, AV126Produccion_test_v01ds_8_tfbardisnum_sel, Integer.valueOf(AV127Produccion_test_v01ds_9_tfclicod), Integer.valueOf(AV128Produccion_test_v01ds_10_tfclicod_to), lV129Produccion_test_v01ds_11_tfclinom, AV130Produccion_test_v01ds_12_tfclinom_sel, lV131Produccion_test_v01ds_13_tfbarser, AV132Produccion_test_v01ds_14_tfbarser_sel, lV133Produccion_test_v01ds_15_tfbarserdsc, AV134Produccion_test_v01ds_16_tfbarserdsc_sel, lV135Produccion_test_v01ds_17_tfbarcolnom, AV136Produccion_test_v01ds_18_tfbarcolnom_sel, Integer.valueOf(AV137Produccion_test_v01ds_19_tfbarcolnum), Integer.valueOf(AV138Produccion_test_v01ds_20_tfbarcolnum_to), lV139Produccion_test_v01ds_21_tfbarnomcli, AV140Produccion_test_v01ds_22_tfbarnomcli_sel, Byte.valueOf(AV141Produccion_test_v01ds_23_tfbarsit), Byte.valueOf(AV142Produccion_test_v01ds_24_tfbarsit_to), AV143Produccion_test_v01ds_25_tfbarfecgen, AV144Produccion_test_v01ds_26_tfbarfeccli, AV145Produccion_test_v01ds_27_tfbarfecfpr, AV146Produccion_test_v01ds_28_tfbarfecsal, Integer.valueOf(AV14CliCod), Integer.valueOf(AV15CliCodto), AV71BarDisNum, AV74BarDisNumTo, AV16BarFecGen, AV17BarFecGenTo, AV72BarFecCli, AV73BarFecCliTo, AV78BarFecSal, AV79BarFecSalto, AV76BarFecFpr, AV77BarFecFprto, AV80BarColNom, AV86BarColNomto, Integer.valueOf(AV81BarColNum), Integer.valueOf(AV87BarColNumto), AV82BarNomCli, AV84BarNomClito, Integer.valueOf(AV83BarNumCli), Integer.valueOf(AV85BarNumClito), Integer.valueOf(AV90BarCod), Integer.valueOf(AV96BarCodto), Byte.valueOf(AV91BarCodReo), Byte.valueOf(AV97BarCodReoto), AV92BarCodPar, AV98BarCodParto, AV93Cod_Idtx, AV94BarGirar, Short.valueOf(AV108BarTipArt), Short.valueOf(AV109BarTipArtto), AV110BarSer, AV111BarSerto});
      GRID_nRecordCount = H027P17_AGRID_nRecordCount[0] ;
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
      AV119Produccion_test_v01ds_1_tfbarcod = AV21TFBarCod ;
      AV120Produccion_test_v01ds_2_tfbarcod_to = AV22TFBarCod_To ;
      AV121Produccion_test_v01ds_3_tfbarcodreo = AV23TFBarCodReo ;
      AV122Produccion_test_v01ds_4_tfbarcodreo_to = AV24TFBarCodReo_To ;
      AV123Produccion_test_v01ds_5_tfbarcodpar = AV25TFBarCodPar ;
      AV124Produccion_test_v01ds_6_tfbarcodpar_sel = AV26TFBarCodPar_Sel ;
      AV125Produccion_test_v01ds_7_tfbardisnum = AV27TFBarDisNum ;
      AV126Produccion_test_v01ds_8_tfbardisnum_sel = AV28TFBarDisNum_Sel ;
      AV127Produccion_test_v01ds_9_tfclicod = AV29TFCliCod ;
      AV128Produccion_test_v01ds_10_tfclicod_to = AV30TFCliCod_To ;
      AV129Produccion_test_v01ds_11_tfclinom = AV31TFCliNom ;
      AV130Produccion_test_v01ds_12_tfclinom_sel = AV32TFCliNom_Sel ;
      AV131Produccion_test_v01ds_13_tfbarser = AV33TFBarSer ;
      AV132Produccion_test_v01ds_14_tfbarser_sel = AV34TFBarSer_Sel ;
      AV133Produccion_test_v01ds_15_tfbarserdsc = AV35TFBarSerDsc ;
      AV134Produccion_test_v01ds_16_tfbarserdsc_sel = AV36TFBarSerDsc_Sel ;
      AV135Produccion_test_v01ds_17_tfbarcolnom = AV55TFBarColNom ;
      AV136Produccion_test_v01ds_18_tfbarcolnom_sel = AV56TFBarColNom_Sel ;
      AV137Produccion_test_v01ds_19_tfbarcolnum = AV57TFBarColNum ;
      AV138Produccion_test_v01ds_20_tfbarcolnum_to = AV58TFBarColNum_To ;
      AV139Produccion_test_v01ds_21_tfbarnomcli = AV59TFBarNomCli ;
      AV140Produccion_test_v01ds_22_tfbarnomcli_sel = AV60TFBarNomCli_Sel ;
      AV141Produccion_test_v01ds_23_tfbarsit = AV37TFBarSit ;
      AV142Produccion_test_v01ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV143Produccion_test_v01ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV144Produccion_test_v01ds_26_tfbarfeccli = AV49TFBarFecCli ;
      AV145Produccion_test_v01ds_27_tfbarfecfpr = AV88TFBarFecFpr ;
      AV146Produccion_test_v01ds_28_tfbarfecsal = AV53TFBarFecSal ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV14CliCod, AV15CliCodto, AV71BarDisNum, AV74BarDisNumTo, AV18BarSit, AV19BarSitTo, AV16BarFecGen, AV17BarFecGenTo, AV72BarFecCli, AV73BarFecCliTo, AV76BarFecFpr, AV77BarFecFprto, AV78BarFecSal, AV79BarFecSalto, AV80BarColNom, AV81BarColNum, AV86BarColNomto, AV87BarColNumto, AV82BarNomCli, AV83BarNumCli, AV84BarNomClito, AV85BarNumClito, AV110BarSer, AV111BarSerto, AV90BarCod, AV91BarCodReo, AV92BarCodPar, AV96BarCodto, AV97BarCodReoto, AV98BarCodParto, AV94BarGirar, AV108BarTipArt, AV109BarTipArtto, AV93Cod_Idtx, AV46EmprCod, AV21TFBarCod, AV22TFBarCod_To, AV23TFBarCodReo, AV24TFBarCodReo_To, AV25TFBarCodPar, AV26TFBarCodPar_Sel, AV27TFBarDisNum, AV28TFBarDisNum_Sel, AV29TFCliCod, AV30TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV33TFBarSer, AV34TFBarSer_Sel, AV35TFBarSerDsc, AV36TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV59TFBarNomCli, AV60TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV49TFBarFecCli, AV88TFBarFecFpr, AV53TFBarFecSal, AV118Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62TotBarKgm, AV64TotBarMtr, AV66TotBarPie, AV68Moda21, AV101MacCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV119Produccion_test_v01ds_1_tfbarcod = AV21TFBarCod ;
      AV120Produccion_test_v01ds_2_tfbarcod_to = AV22TFBarCod_To ;
      AV121Produccion_test_v01ds_3_tfbarcodreo = AV23TFBarCodReo ;
      AV122Produccion_test_v01ds_4_tfbarcodreo_to = AV24TFBarCodReo_To ;
      AV123Produccion_test_v01ds_5_tfbarcodpar = AV25TFBarCodPar ;
      AV124Produccion_test_v01ds_6_tfbarcodpar_sel = AV26TFBarCodPar_Sel ;
      AV125Produccion_test_v01ds_7_tfbardisnum = AV27TFBarDisNum ;
      AV126Produccion_test_v01ds_8_tfbardisnum_sel = AV28TFBarDisNum_Sel ;
      AV127Produccion_test_v01ds_9_tfclicod = AV29TFCliCod ;
      AV128Produccion_test_v01ds_10_tfclicod_to = AV30TFCliCod_To ;
      AV129Produccion_test_v01ds_11_tfclinom = AV31TFCliNom ;
      AV130Produccion_test_v01ds_12_tfclinom_sel = AV32TFCliNom_Sel ;
      AV131Produccion_test_v01ds_13_tfbarser = AV33TFBarSer ;
      AV132Produccion_test_v01ds_14_tfbarser_sel = AV34TFBarSer_Sel ;
      AV133Produccion_test_v01ds_15_tfbarserdsc = AV35TFBarSerDsc ;
      AV134Produccion_test_v01ds_16_tfbarserdsc_sel = AV36TFBarSerDsc_Sel ;
      AV135Produccion_test_v01ds_17_tfbarcolnom = AV55TFBarColNom ;
      AV136Produccion_test_v01ds_18_tfbarcolnom_sel = AV56TFBarColNom_Sel ;
      AV137Produccion_test_v01ds_19_tfbarcolnum = AV57TFBarColNum ;
      AV138Produccion_test_v01ds_20_tfbarcolnum_to = AV58TFBarColNum_To ;
      AV139Produccion_test_v01ds_21_tfbarnomcli = AV59TFBarNomCli ;
      AV140Produccion_test_v01ds_22_tfbarnomcli_sel = AV60TFBarNomCli_Sel ;
      AV141Produccion_test_v01ds_23_tfbarsit = AV37TFBarSit ;
      AV142Produccion_test_v01ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV143Produccion_test_v01ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV144Produccion_test_v01ds_26_tfbarfeccli = AV49TFBarFecCli ;
      AV145Produccion_test_v01ds_27_tfbarfecfpr = AV88TFBarFecFpr ;
      AV146Produccion_test_v01ds_28_tfbarfecsal = AV53TFBarFecSal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14CliCod, AV15CliCodto, AV71BarDisNum, AV74BarDisNumTo, AV18BarSit, AV19BarSitTo, AV16BarFecGen, AV17BarFecGenTo, AV72BarFecCli, AV73BarFecCliTo, AV76BarFecFpr, AV77BarFecFprto, AV78BarFecSal, AV79BarFecSalto, AV80BarColNom, AV81BarColNum, AV86BarColNomto, AV87BarColNumto, AV82BarNomCli, AV83BarNumCli, AV84BarNomClito, AV85BarNumClito, AV110BarSer, AV111BarSerto, AV90BarCod, AV91BarCodReo, AV92BarCodPar, AV96BarCodto, AV97BarCodReoto, AV98BarCodParto, AV94BarGirar, AV108BarTipArt, AV109BarTipArtto, AV93Cod_Idtx, AV46EmprCod, AV21TFBarCod, AV22TFBarCod_To, AV23TFBarCodReo, AV24TFBarCodReo_To, AV25TFBarCodPar, AV26TFBarCodPar_Sel, AV27TFBarDisNum, AV28TFBarDisNum_Sel, AV29TFCliCod, AV30TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV33TFBarSer, AV34TFBarSer_Sel, AV35TFBarSerDsc, AV36TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV59TFBarNomCli, AV60TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV49TFBarFecCli, AV88TFBarFecFpr, AV53TFBarFecSal, AV118Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62TotBarKgm, AV64TotBarMtr, AV66TotBarPie, AV68Moda21, AV101MacCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV119Produccion_test_v01ds_1_tfbarcod = AV21TFBarCod ;
      AV120Produccion_test_v01ds_2_tfbarcod_to = AV22TFBarCod_To ;
      AV121Produccion_test_v01ds_3_tfbarcodreo = AV23TFBarCodReo ;
      AV122Produccion_test_v01ds_4_tfbarcodreo_to = AV24TFBarCodReo_To ;
      AV123Produccion_test_v01ds_5_tfbarcodpar = AV25TFBarCodPar ;
      AV124Produccion_test_v01ds_6_tfbarcodpar_sel = AV26TFBarCodPar_Sel ;
      AV125Produccion_test_v01ds_7_tfbardisnum = AV27TFBarDisNum ;
      AV126Produccion_test_v01ds_8_tfbardisnum_sel = AV28TFBarDisNum_Sel ;
      AV127Produccion_test_v01ds_9_tfclicod = AV29TFCliCod ;
      AV128Produccion_test_v01ds_10_tfclicod_to = AV30TFCliCod_To ;
      AV129Produccion_test_v01ds_11_tfclinom = AV31TFCliNom ;
      AV130Produccion_test_v01ds_12_tfclinom_sel = AV32TFCliNom_Sel ;
      AV131Produccion_test_v01ds_13_tfbarser = AV33TFBarSer ;
      AV132Produccion_test_v01ds_14_tfbarser_sel = AV34TFBarSer_Sel ;
      AV133Produccion_test_v01ds_15_tfbarserdsc = AV35TFBarSerDsc ;
      AV134Produccion_test_v01ds_16_tfbarserdsc_sel = AV36TFBarSerDsc_Sel ;
      AV135Produccion_test_v01ds_17_tfbarcolnom = AV55TFBarColNom ;
      AV136Produccion_test_v01ds_18_tfbarcolnom_sel = AV56TFBarColNom_Sel ;
      AV137Produccion_test_v01ds_19_tfbarcolnum = AV57TFBarColNum ;
      AV138Produccion_test_v01ds_20_tfbarcolnum_to = AV58TFBarColNum_To ;
      AV139Produccion_test_v01ds_21_tfbarnomcli = AV59TFBarNomCli ;
      AV140Produccion_test_v01ds_22_tfbarnomcli_sel = AV60TFBarNomCli_Sel ;
      AV141Produccion_test_v01ds_23_tfbarsit = AV37TFBarSit ;
      AV142Produccion_test_v01ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV143Produccion_test_v01ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV144Produccion_test_v01ds_26_tfbarfeccli = AV49TFBarFecCli ;
      AV145Produccion_test_v01ds_27_tfbarfecfpr = AV88TFBarFecFpr ;
      AV146Produccion_test_v01ds_28_tfbarfecsal = AV53TFBarFecSal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14CliCod, AV15CliCodto, AV71BarDisNum, AV74BarDisNumTo, AV18BarSit, AV19BarSitTo, AV16BarFecGen, AV17BarFecGenTo, AV72BarFecCli, AV73BarFecCliTo, AV76BarFecFpr, AV77BarFecFprto, AV78BarFecSal, AV79BarFecSalto, AV80BarColNom, AV81BarColNum, AV86BarColNomto, AV87BarColNumto, AV82BarNomCli, AV83BarNumCli, AV84BarNomClito, AV85BarNumClito, AV110BarSer, AV111BarSerto, AV90BarCod, AV91BarCodReo, AV92BarCodPar, AV96BarCodto, AV97BarCodReoto, AV98BarCodParto, AV94BarGirar, AV108BarTipArt, AV109BarTipArtto, AV93Cod_Idtx, AV46EmprCod, AV21TFBarCod, AV22TFBarCod_To, AV23TFBarCodReo, AV24TFBarCodReo_To, AV25TFBarCodPar, AV26TFBarCodPar_Sel, AV27TFBarDisNum, AV28TFBarDisNum_Sel, AV29TFCliCod, AV30TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV33TFBarSer, AV34TFBarSer_Sel, AV35TFBarSerDsc, AV36TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV59TFBarNomCli, AV60TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV49TFBarFecCli, AV88TFBarFecFpr, AV53TFBarFecSal, AV118Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62TotBarKgm, AV64TotBarMtr, AV66TotBarPie, AV68Moda21, AV101MacCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV119Produccion_test_v01ds_1_tfbarcod = AV21TFBarCod ;
      AV120Produccion_test_v01ds_2_tfbarcod_to = AV22TFBarCod_To ;
      AV121Produccion_test_v01ds_3_tfbarcodreo = AV23TFBarCodReo ;
      AV122Produccion_test_v01ds_4_tfbarcodreo_to = AV24TFBarCodReo_To ;
      AV123Produccion_test_v01ds_5_tfbarcodpar = AV25TFBarCodPar ;
      AV124Produccion_test_v01ds_6_tfbarcodpar_sel = AV26TFBarCodPar_Sel ;
      AV125Produccion_test_v01ds_7_tfbardisnum = AV27TFBarDisNum ;
      AV126Produccion_test_v01ds_8_tfbardisnum_sel = AV28TFBarDisNum_Sel ;
      AV127Produccion_test_v01ds_9_tfclicod = AV29TFCliCod ;
      AV128Produccion_test_v01ds_10_tfclicod_to = AV30TFCliCod_To ;
      AV129Produccion_test_v01ds_11_tfclinom = AV31TFCliNom ;
      AV130Produccion_test_v01ds_12_tfclinom_sel = AV32TFCliNom_Sel ;
      AV131Produccion_test_v01ds_13_tfbarser = AV33TFBarSer ;
      AV132Produccion_test_v01ds_14_tfbarser_sel = AV34TFBarSer_Sel ;
      AV133Produccion_test_v01ds_15_tfbarserdsc = AV35TFBarSerDsc ;
      AV134Produccion_test_v01ds_16_tfbarserdsc_sel = AV36TFBarSerDsc_Sel ;
      AV135Produccion_test_v01ds_17_tfbarcolnom = AV55TFBarColNom ;
      AV136Produccion_test_v01ds_18_tfbarcolnom_sel = AV56TFBarColNom_Sel ;
      AV137Produccion_test_v01ds_19_tfbarcolnum = AV57TFBarColNum ;
      AV138Produccion_test_v01ds_20_tfbarcolnum_to = AV58TFBarColNum_To ;
      AV139Produccion_test_v01ds_21_tfbarnomcli = AV59TFBarNomCli ;
      AV140Produccion_test_v01ds_22_tfbarnomcli_sel = AV60TFBarNomCli_Sel ;
      AV141Produccion_test_v01ds_23_tfbarsit = AV37TFBarSit ;
      AV142Produccion_test_v01ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV143Produccion_test_v01ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV144Produccion_test_v01ds_26_tfbarfeccli = AV49TFBarFecCli ;
      AV145Produccion_test_v01ds_27_tfbarfecfpr = AV88TFBarFecFpr ;
      AV146Produccion_test_v01ds_28_tfbarfecsal = AV53TFBarFecSal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14CliCod, AV15CliCodto, AV71BarDisNum, AV74BarDisNumTo, AV18BarSit, AV19BarSitTo, AV16BarFecGen, AV17BarFecGenTo, AV72BarFecCli, AV73BarFecCliTo, AV76BarFecFpr, AV77BarFecFprto, AV78BarFecSal, AV79BarFecSalto, AV80BarColNom, AV81BarColNum, AV86BarColNomto, AV87BarColNumto, AV82BarNomCli, AV83BarNumCli, AV84BarNomClito, AV85BarNumClito, AV110BarSer, AV111BarSerto, AV90BarCod, AV91BarCodReo, AV92BarCodPar, AV96BarCodto, AV97BarCodReoto, AV98BarCodParto, AV94BarGirar, AV108BarTipArt, AV109BarTipArtto, AV93Cod_Idtx, AV46EmprCod, AV21TFBarCod, AV22TFBarCod_To, AV23TFBarCodReo, AV24TFBarCodReo_To, AV25TFBarCodPar, AV26TFBarCodPar_Sel, AV27TFBarDisNum, AV28TFBarDisNum_Sel, AV29TFCliCod, AV30TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV33TFBarSer, AV34TFBarSer_Sel, AV35TFBarSerDsc, AV36TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV59TFBarNomCli, AV60TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV49TFBarFecCli, AV88TFBarFecFpr, AV53TFBarFecSal, AV118Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62TotBarKgm, AV64TotBarMtr, AV66TotBarPie, AV68Moda21, AV101MacCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV119Produccion_test_v01ds_1_tfbarcod = AV21TFBarCod ;
      AV120Produccion_test_v01ds_2_tfbarcod_to = AV22TFBarCod_To ;
      AV121Produccion_test_v01ds_3_tfbarcodreo = AV23TFBarCodReo ;
      AV122Produccion_test_v01ds_4_tfbarcodreo_to = AV24TFBarCodReo_To ;
      AV123Produccion_test_v01ds_5_tfbarcodpar = AV25TFBarCodPar ;
      AV124Produccion_test_v01ds_6_tfbarcodpar_sel = AV26TFBarCodPar_Sel ;
      AV125Produccion_test_v01ds_7_tfbardisnum = AV27TFBarDisNum ;
      AV126Produccion_test_v01ds_8_tfbardisnum_sel = AV28TFBarDisNum_Sel ;
      AV127Produccion_test_v01ds_9_tfclicod = AV29TFCliCod ;
      AV128Produccion_test_v01ds_10_tfclicod_to = AV30TFCliCod_To ;
      AV129Produccion_test_v01ds_11_tfclinom = AV31TFCliNom ;
      AV130Produccion_test_v01ds_12_tfclinom_sel = AV32TFCliNom_Sel ;
      AV131Produccion_test_v01ds_13_tfbarser = AV33TFBarSer ;
      AV132Produccion_test_v01ds_14_tfbarser_sel = AV34TFBarSer_Sel ;
      AV133Produccion_test_v01ds_15_tfbarserdsc = AV35TFBarSerDsc ;
      AV134Produccion_test_v01ds_16_tfbarserdsc_sel = AV36TFBarSerDsc_Sel ;
      AV135Produccion_test_v01ds_17_tfbarcolnom = AV55TFBarColNom ;
      AV136Produccion_test_v01ds_18_tfbarcolnom_sel = AV56TFBarColNom_Sel ;
      AV137Produccion_test_v01ds_19_tfbarcolnum = AV57TFBarColNum ;
      AV138Produccion_test_v01ds_20_tfbarcolnum_to = AV58TFBarColNum_To ;
      AV139Produccion_test_v01ds_21_tfbarnomcli = AV59TFBarNomCli ;
      AV140Produccion_test_v01ds_22_tfbarnomcli_sel = AV60TFBarNomCli_Sel ;
      AV141Produccion_test_v01ds_23_tfbarsit = AV37TFBarSit ;
      AV142Produccion_test_v01ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV143Produccion_test_v01ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV144Produccion_test_v01ds_26_tfbarfeccli = AV49TFBarFecCli ;
      AV145Produccion_test_v01ds_27_tfbarfecfpr = AV88TFBarFecFpr ;
      AV146Produccion_test_v01ds_28_tfbarfecsal = AV53TFBarFecSal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV14CliCod, AV15CliCodto, AV71BarDisNum, AV74BarDisNumTo, AV18BarSit, AV19BarSitTo, AV16BarFecGen, AV17BarFecGenTo, AV72BarFecCli, AV73BarFecCliTo, AV76BarFecFpr, AV77BarFecFprto, AV78BarFecSal, AV79BarFecSalto, AV80BarColNom, AV81BarColNum, AV86BarColNomto, AV87BarColNumto, AV82BarNomCli, AV83BarNumCli, AV84BarNomClito, AV85BarNumClito, AV110BarSer, AV111BarSerto, AV90BarCod, AV91BarCodReo, AV92BarCodPar, AV96BarCodto, AV97BarCodReoto, AV98BarCodParto, AV94BarGirar, AV108BarTipArt, AV109BarTipArtto, AV93Cod_Idtx, AV46EmprCod, AV21TFBarCod, AV22TFBarCod_To, AV23TFBarCodReo, AV24TFBarCodReo_To, AV25TFBarCodPar, AV26TFBarCodPar_Sel, AV27TFBarDisNum, AV28TFBarDisNum_Sel, AV29TFCliCod, AV30TFCliCod_To, AV31TFCliNom, AV32TFCliNom_Sel, AV33TFBarSer, AV34TFBarSer_Sel, AV35TFBarSerDsc, AV36TFBarSerDsc_Sel, AV55TFBarColNom, AV56TFBarColNom_Sel, AV57TFBarColNum, AV58TFBarColNum_To, AV59TFBarNomCli, AV60TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV49TFBarFecCli, AV88TFBarFecFpr, AV53TFBarFecSal, AV118Pgmname, AV12OrderedBy, AV13OrderedDsc, AV62TotBarKgm, AV64TotBarMtr, AV66TotBarPie, AV68Moda21, AV101MacCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV118Pgmname = "Produccion.Test_v01" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV118Pgmname", AV118Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavTotvaluebarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup27P0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2327P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBARTIPART_DATA"), AV112BarTipArt_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBARTIPARTTO_DATA"), AV113BarTipArtto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOD_IDTX_DATA"), AV99Cod_Idtx_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV41DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_221 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_221"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV43GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV44GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV107BarplfTo = httpContext.cgiGet( "vBARPLFTO") ;
         AV106Barplf = httpContext.cgiGet( "vBARPLF") ;
         AV101MacCod = (int)(localUtil.ctol( httpContext.cgiGet( "vMACCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Combo_bartipart_Cls = httpContext.cgiGet( "COMBO_BARTIPART_Cls") ;
         Combo_bartipart_Selectedvalue_set = httpContext.cgiGet( "COMBO_BARTIPART_Selectedvalue_set") ;
         Combo_bartipart_Emptyitemtext = httpContext.cgiGet( "COMBO_BARTIPART_Emptyitemtext") ;
         Combo_bartipartto_Cls = httpContext.cgiGet( "COMBO_BARTIPARTTO_Cls") ;
         Combo_bartipartto_Selectedvalue_set = httpContext.cgiGet( "COMBO_BARTIPARTTO_Selectedvalue_set") ;
         Combo_bartipartto_Emptyitemtext = httpContext.cgiGet( "COMBO_BARTIPARTTO_Emptyitemtext") ;
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
         Combo_cod_idtx_Cls = httpContext.cgiGet( "COMBO_COD_IDTX_Cls") ;
         Combo_cod_idtx_Selectedvalue_set = httpContext.cgiGet( "COMBO_COD_IDTX_Selectedvalue_set") ;
         Combo_cod_idtx_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_COD_IDTX_Visible")) ;
         Combo_cod_idtx_Emptyitemtext = httpContext.cgiGet( "COMBO_COD_IDTX_Emptyitemtext") ;
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
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Combo_cod_idtx_Selectedvalue_get = httpContext.cgiGet( "COMBO_COD_IDTX_Selectedvalue_get") ;
         Combo_bartipartto_Selectedvalue_get = httpContext.cgiGet( "COMBO_BARTIPARTTO_Selectedvalue_get") ;
         Combo_bartipart_Selectedvalue_get = httpContext.cgiGet( "COMBO_BARTIPART_Selectedvalue_get") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
         }
         else
         {
            AV14CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14CliCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodto), 6, 0));
         }
         else
         {
            AV15CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15CliCodto), 6, 0));
         }
         AV71BarDisNum = httpContext.cgiGet( edtavBardisnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71BarDisNum", AV71BarDisNum);
         AV74BarDisNumTo = httpContext.cgiGet( edtavBardisnumto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74BarDisNumTo", AV74BarDisNumTo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSIT");
            GX_FocusControl = edtavBarsit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18BarSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarSit), 2, 0));
         }
         else
         {
            AV18BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarSit), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITTO");
            GX_FocusControl = edtavBarsitto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19BarSitTo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarSitTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarSitTo), 2, 0));
         }
         else
         {
            AV19BarSitTo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarSitTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarSitTo), 2, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGEN");
            GX_FocusControl = edtavBarfecgen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16BarFecGen = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16BarFecGen", localUtil.format(AV16BarFecGen, "99/99/99"));
         }
         else
         {
            AV16BarFecGen = localUtil.ctod( httpContext.cgiGet( edtavBarfecgen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16BarFecGen", localUtil.format(AV16BarFecGen, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgento_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGENTO");
            GX_FocusControl = edtavBarfecgento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17BarFecGenTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarFecGenTo", localUtil.format(AV17BarFecGenTo, "99/99/99"));
         }
         else
         {
            AV17BarFecGenTo = localUtil.ctod( httpContext.cgiGet( edtavBarfecgento_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17BarFecGenTo", localUtil.format(AV17BarFecGenTo, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfeccli_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECCLI");
            GX_FocusControl = edtavBarfeccli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV72BarFecCli = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72BarFecCli", localUtil.format(AV72BarFecCli, "99/99/99"));
         }
         else
         {
            AV72BarFecCli = localUtil.ctod( httpContext.cgiGet( edtavBarfeccli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72BarFecCli", localUtil.format(AV72BarFecCli, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecclito_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECCLITO");
            GX_FocusControl = edtavBarfecclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV73BarFecCliTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73BarFecCliTo", localUtil.format(AV73BarFecCliTo, "99/99/99"));
         }
         else
         {
            AV73BarFecCliTo = localUtil.ctod( httpContext.cgiGet( edtavBarfecclito_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV73BarFecCliTo", localUtil.format(AV73BarFecCliTo, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecfpr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECFPR");
            GX_FocusControl = edtavBarfecfpr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV76BarFecFpr = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76BarFecFpr", localUtil.format(AV76BarFecFpr, "99/99/99"));
         }
         else
         {
            AV76BarFecFpr = localUtil.ctod( httpContext.cgiGet( edtavBarfecfpr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76BarFecFpr", localUtil.format(AV76BarFecFpr, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecfprto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECFPRTO");
            GX_FocusControl = edtavBarfecfprto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV77BarFecFprto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77BarFecFprto", localUtil.format(AV77BarFecFprto, "99/99/99"));
         }
         else
         {
            AV77BarFecFprto = localUtil.ctod( httpContext.cgiGet( edtavBarfecfprto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77BarFecFprto", localUtil.format(AV77BarFecFprto, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecsal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSAL");
            GX_FocusControl = edtavBarfecsal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV78BarFecSal = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78BarFecSal", localUtil.format(AV78BarFecSal, "99/99/99"));
         }
         else
         {
            AV78BarFecSal = localUtil.ctod( httpContext.cgiGet( edtavBarfecsal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78BarFecSal", localUtil.format(AV78BarFecSal, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecsalto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSALTO");
            GX_FocusControl = edtavBarfecsalto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV79BarFecSalto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79BarFecSalto", localUtil.format(AV79BarFecSalto, "99/99/99"));
         }
         else
         {
            AV79BarFecSalto = localUtil.ctod( httpContext.cgiGet( edtavBarfecsalto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79BarFecSalto", localUtil.format(AV79BarFecSalto, "99/99/99"));
         }
         AV80BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80BarColNom", AV80BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81BarColNum), 6, 0));
         }
         else
         {
            AV81BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81BarColNum), 6, 0));
         }
         AV86BarColNomto = httpContext.cgiGet( edtavBarcolnomto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86BarColNomto", AV86BarColNomto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMTO");
            GX_FocusControl = edtavBarcolnumto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV87BarColNumto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87BarColNumto), 6, 0));
         }
         else
         {
            AV87BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87BarColNumto), 6, 0));
         }
         AV82BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82BarNomCli", AV82BarNomCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLI");
            GX_FocusControl = edtavBarnumcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV83BarNumCli = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83BarNumCli), 6, 0));
         }
         else
         {
            AV83BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83BarNumCli), 6, 0));
         }
         AV84BarNomClito = httpContext.cgiGet( edtavBarnomclito_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84BarNomClito", AV84BarNomClito);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLITO");
            GX_FocusControl = edtavBarnumclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV85BarNumClito = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85BarNumClito), 6, 0));
         }
         else
         {
            AV85BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85BarNumClito), 6, 0));
         }
         AV110BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110BarSer", AV110BarSer);
         AV111BarSerto = httpContext.cgiGet( edtavBarserto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV111BarSerto", AV111BarSerto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV90BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90BarCod), 8, 0));
         }
         else
         {
            AV90BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV90BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV90BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV91BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91BarCodReo", GXutil.str( AV91BarCodReo, 1, 0));
         }
         else
         {
            AV91BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV91BarCodReo", GXutil.str( AV91BarCodReo, 1, 0));
         }
         AV92BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV92BarCodPar", AV92BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODTO");
            GX_FocusControl = edtavBarcodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV96BarCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96BarCodto), 8, 0));
         }
         else
         {
            AV96BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96BarCodto), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOTO");
            GX_FocusControl = edtavBarcodreoto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV97BarCodReoto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97BarCodReoto", GXutil.str( AV97BarCodReoto, 1, 0));
         }
         else
         {
            AV97BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97BarCodReoto", GXutil.str( AV97BarCodReoto, 1, 0));
         }
         AV98BarCodParto = httpContext.cgiGet( edtavBarcodparto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98BarCodParto", AV98BarCodParto);
         AV94BarGirar = httpContext.cgiGet( edtavBargirar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV94BarGirar", AV94BarGirar);
         cmbavMuestras.setName( cmbavMuestras.getInternalname() );
         cmbavMuestras.setValue( httpContext.cgiGet( cmbavMuestras.getInternalname()) );
         AV95Muestras = httpContext.cgiGet( cmbavMuestras.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Muestras", AV95Muestras);
         AV63TotValueBarKgm = httpContext.cgiGet( edtavTotvaluebarkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63TotValueBarKgm", AV63TotValueBarKgm);
         AV65TotValueBarMtr = httpContext.cgiGet( edtavTotvaluebarmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65TotValueBarMtr", AV65TotValueBarMtr);
         AV67TotValueBarPie = httpContext.cgiGet( edtavTotvaluebarpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67TotValueBarPie", AV67TotValueBarPie);
         AV118Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV118Pgmname", AV118Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPART");
            GX_FocusControl = edtavBartipart_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV108BarTipArt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108BarTipArt), 4, 0));
         }
         else
         {
            AV108BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV108BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108BarTipArt), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPARTTO");
            GX_FocusControl = edtavBartipartto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV109BarTipArtto = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109BarTipArtto), 4, 0));
         }
         else
         {
            AV109BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV109BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109BarTipArtto), 4, 0));
         }
         AV93Cod_Idtx = httpContext.cgiGet( edtavCod_idtx_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV93Cod_Idtx", AV93Cod_Idtx);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECGENAUXDATE");
            GX_FocusControl = edtavDdo_barfecgenauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40DDO_BarFecGenAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40DDO_BarFecGenAuxDate", localUtil.format(AV40DDO_BarFecGenAuxDate, "99/99/99"));
         }
         else
         {
            AV40DDO_BarFecGenAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecgenauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40DDO_BarFecGenAuxDate", localUtil.format(AV40DDO_BarFecGenAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECCLIAUXDATE");
            GX_FocusControl = edtavDdo_barfeccliauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50DDO_BarFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50DDO_BarFecCliAuxDate", localUtil.format(AV50DDO_BarFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV50DDO_BarFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50DDO_BarFecCliAuxDate", localUtil.format(AV50DDO_BarFecCliAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECFPRAUXDATE");
            GX_FocusControl = edtavDdo_barfecfprauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV89DDO_BarFecFprAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89DDO_BarFecFprAuxDate", localUtil.format(AV89DDO_BarFecFprAuxDate, "99/99/99"));
         }
         else
         {
            AV89DDO_BarFecFprAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89DDO_BarFecFprAuxDate", localUtil.format(AV89DDO_BarFecFprAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECSALAUXDATE");
            GX_FocusControl = edtavDdo_barfecsalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV54DDO_BarFecSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_BarFecSalAuxDate", localUtil.format(AV54DDO_BarFecSalAuxDate, "99/99/99"));
         }
         else
         {
            AV54DDO_BarFecSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54DDO_BarFecSalAuxDate", localUtil.format(AV54DDO_BarFecSalAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_221_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_221_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_221_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2212( ) ;
         if ( nGXsfl_221_idx > 0 )
         {
            cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
            cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
            AV61GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActionGroup1), 4, 0));
            A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
            A120BarAgrEst = GXutil.upper( httpContext.cgiGet( edtBarAgrEst_Internalname)) ;
            A143BarDisNum = httpContext.cgiGet( edtBarDisNum_Internalname) ;
            A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n252CliCod = false ;
            A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
            A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
            A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
            A217BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtBarTipArt_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            n217BarTipArt = false ;
            A13711BarTipArtD = httpContext.cgiGet( edtBarTipArtD_Internalname) ;
            n13711BarTipArtD = false ;
            A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
            A136BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtBarColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
            A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
            A184BarMtr = localUtil.ctond( httpContext.cgiGet( edtBarMtr_Internalname)) ;
            A198BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtBarPie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A213BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarSit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A159BarFecGen = localUtil.ctod( httpContext.cgiGet( edtBarFecGen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A155BarFecCli = localUtil.ctod( httpContext.cgiGet( edtBarFecCli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A158BarFecFpr = localUtil.ctod( httpContext.cgiGet( edtBarFecFpr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A161BarFecSal = localUtil.ctod( httpContext.cgiGet( edtBarFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A151BarFasCod = httpContext.cgiGet( edtBarFasCod_Internalname) ;
            n151BarFasCod = false ;
            A1955BarFasSig = httpContext.cgiGet( edtBarFasSig_Internalname) ;
            n1955BarFasSig = false ;
            A13930BarAlbUlti = localUtil.ctol( httpContext.cgiGet( edtBarAlbUlti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A13935BarAlbFact = (int)(localUtil.ctol( httpContext.cgiGet( edtBarAlbFact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A2454BarGirar = httpContext.cgiGet( edtBarGirar_Internalname) ;
            A4466BarAcaAnh = (short)(localUtil.ctol( httpContext.cgiGet( edtBarAcaAnh_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A13933BarCuadern = httpContext.cgiGet( edtBarCuadern_Internalname) ;
            n13933BarCuadern = false ;
            A14204BarProPerI = httpContext.cgiGet( edtBarProPerI_Internalname) ;
            A13934BarNormas = httpContext.cgiGet( edtBarNormas_Internalname) ;
            A4348DisUsrCod = httpContext.cgiGet( edtDisUsrCod_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"Test_v01");
         AV118Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV118Pgmname", AV118Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV118Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\test_v01:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV14CliCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV15CliCodto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUM"), AV71BarDisNum) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUMTO"), AV74BarDisNumTo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV18BarSit )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV19BarSitTo )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGEN"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV16BarFecGen)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGENTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV17BarFecGenTo)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECCLI"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV72BarFecCli)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECCLITO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV73BarFecCliTo)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECFPR"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV76BarFecFpr)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECFPRTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV77BarFecFprto)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECSAL"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV78BarFecSal)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECSALTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV79BarFecSalto)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOM"), AV80BarColNom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV81BarColNum )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOMTO"), AV86BarColNomto) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUMTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV87BarColNumto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLI"), AV82BarNomCli) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83BarNumCli )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLITO"), AV84BarNomClito) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLITO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV85BarNumClito )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSER"), AV110BarSer) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSERTO"), AV111BarSerto) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV90BarCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV91BarCodReo )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPAR"), AV92BarCodPar) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV96BarCodto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREOTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV97BarCodReoto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPARTO"), AV98BarCodParto) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARGIRAR"), AV94BarGirar) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV108BarTipArt )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPARTTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV109BarTipArtto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCOD_IDTX"), AV93Cod_Idtx) != 0 )
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
      e2327P2 ();
      if (returnInSub) return;
   }

   public void e2327P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char5 = AV45Station ;
      GXv_char6[0] = GXt_char5 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      test_v01_impl.this.GXt_char5 = GXv_char6[0] ;
      AV45Station = GXt_char5 ;
      GXv_char6[0] = AV46EmprCod ;
      GXv_char7[0] = AV47EmprNom ;
      GXv_char8[0] = AV48UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV45Station, GXv_char6, GXv_char7, GXv_char8) ;
      test_v01_impl.this.AV46EmprCod = GXv_char6[0] ;
      test_v01_impl.this.AV47EmprNom = GXv_char7[0] ;
      test_v01_impl.this.AV48UsurCod = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46EmprCod", AV46EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46EmprCod, "@!"))));
      edtavCod_idtx_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCod_idtx_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCod_idtx_Visible), 5, 0), true);
      edtavBartipartto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipartto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipartto_Visible), 5, 0), true);
      edtavBartipart_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipart_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipart_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOBARTIPART' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOBARTIPARTTO' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCOD_IDTX' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S142 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Consulta de Produccion", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S162 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S172 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV41DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV41DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV18BarSit = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18BarSit), 2, 0));
      AV19BarSitTo = (byte)(11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarSitTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19BarSitTo), 2, 0));
      AV16BarFecGen = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16BarFecGen", localUtil.format(AV16BarFecGen, "99/99/99"));
      AV17BarFecGenTo = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17BarFecGenTo", localUtil.format(AV17BarFecGenTo, "99/99/99"));
      GXt_int11 = (byte)(AV68Moda21) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( AV46EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int12) ;
      test_v01_impl.this.GXt_int11 = GXv_int12[0] ;
      AV68Moda21 = GXt_int11 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV68Moda21), "ZZZ9")));
      GXt_int11 = (byte)(AV69cuaderno) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( AV46EmprCod, httpContext.getMessage( "CNOENC", ""), GXv_int12) ;
      test_v01_impl.this.GXt_int11 = GXv_int12[0] ;
      AV69cuaderno = GXt_int11 ;
      GXt_int11 = (byte)(AV70STNORM) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( AV46EmprCod, httpContext.getMessage( "STNORM", ""), GXv_int12) ;
      test_v01_impl.this.GXt_int11 = GXv_int12[0] ;
      AV70STNORM = GXt_int11 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70STNORM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70STNORM), 4, 0));
      AV106Barplf = "N" ;
      AV107BarplfTo = "S" ;
   }

   public void e2427P2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext13[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext13) ;
      AV6WWPContext = GXv_SdtWWPContext13[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S192 ();
      if (returnInSub) return;
      AV43GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43GridCurrentPage), 10, 0));
      AV44GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S202 ();
      if (returnInSub) return;
      AV119Produccion_test_v01ds_1_tfbarcod = AV21TFBarCod ;
      AV120Produccion_test_v01ds_2_tfbarcod_to = AV22TFBarCod_To ;
      AV121Produccion_test_v01ds_3_tfbarcodreo = AV23TFBarCodReo ;
      AV122Produccion_test_v01ds_4_tfbarcodreo_to = AV24TFBarCodReo_To ;
      AV123Produccion_test_v01ds_5_tfbarcodpar = AV25TFBarCodPar ;
      AV124Produccion_test_v01ds_6_tfbarcodpar_sel = AV26TFBarCodPar_Sel ;
      AV125Produccion_test_v01ds_7_tfbardisnum = AV27TFBarDisNum ;
      AV126Produccion_test_v01ds_8_tfbardisnum_sel = AV28TFBarDisNum_Sel ;
      AV127Produccion_test_v01ds_9_tfclicod = AV29TFCliCod ;
      AV128Produccion_test_v01ds_10_tfclicod_to = AV30TFCliCod_To ;
      AV129Produccion_test_v01ds_11_tfclinom = AV31TFCliNom ;
      AV130Produccion_test_v01ds_12_tfclinom_sel = AV32TFCliNom_Sel ;
      AV131Produccion_test_v01ds_13_tfbarser = AV33TFBarSer ;
      AV132Produccion_test_v01ds_14_tfbarser_sel = AV34TFBarSer_Sel ;
      AV133Produccion_test_v01ds_15_tfbarserdsc = AV35TFBarSerDsc ;
      AV134Produccion_test_v01ds_16_tfbarserdsc_sel = AV36TFBarSerDsc_Sel ;
      AV135Produccion_test_v01ds_17_tfbarcolnom = AV55TFBarColNom ;
      AV136Produccion_test_v01ds_18_tfbarcolnom_sel = AV56TFBarColNom_Sel ;
      AV137Produccion_test_v01ds_19_tfbarcolnum = AV57TFBarColNum ;
      AV138Produccion_test_v01ds_20_tfbarcolnum_to = AV58TFBarColNum_To ;
      AV139Produccion_test_v01ds_21_tfbarnomcli = AV59TFBarNomCli ;
      AV140Produccion_test_v01ds_22_tfbarnomcli_sel = AV60TFBarNomCli_Sel ;
      AV141Produccion_test_v01ds_23_tfbarsit = AV37TFBarSit ;
      AV142Produccion_test_v01ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV143Produccion_test_v01ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV144Produccion_test_v01ds_26_tfbarfeccli = AV49TFBarFecCli ;
      AV145Produccion_test_v01ds_27_tfbarfecfpr = AV88TFBarFecFpr ;
      AV146Produccion_test_v01ds_28_tfbarfecsal = AV53TFBarFecSal ;
      /*  Sending Event outputs  */
   }

   public void e1427P2( )
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
         AV42PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV42PageToGo) ;
      }
   }

   public void e1527P2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1627P2( )
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
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCod") == 0 )
         {
            AV21TFBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TFBarCod), 8, 0));
            AV22TFBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodReo") == 0 )
         {
            AV23TFBarCodReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFBarCodReo", GXutil.str( AV23TFBarCodReo, 1, 0));
            AV24TFBarCodReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFBarCodReo_To", GXutil.str( AV24TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodPar") == 0 )
         {
            AV25TFBarCodPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFBarCodPar", AV25TFBarCodPar);
            AV26TFBarCodPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFBarCodPar_Sel", AV26TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarDisNum") == 0 )
         {
            AV27TFBarDisNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFBarDisNum", AV27TFBarDisNum);
            AV28TFBarDisNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarDisNum_Sel", AV28TFBarDisNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV29TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod), 6, 0));
            AV30TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV31TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliNom", AV31TFCliNom);
            AV32TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliNom_Sel", AV32TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV33TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarSer", AV33TFBarSer);
            AV34TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarSer_Sel", AV34TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV35TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFBarSerDsc", AV35TFBarSerDsc);
            AV36TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFBarSerDsc_Sel", AV36TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV55TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarColNom", AV55TFBarColNom);
            AV56TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFBarColNom_Sel", AV56TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV57TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarColNum), 6, 0));
            AV58TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV59TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFBarNomCli", AV59TFBarNomCli);
            AV60TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarNomCli_Sel", AV60TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSit") == 0 )
         {
            AV37TFBarSit = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFBarSit), 2, 0));
            AV38TFBarSit_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecGen") == 0 )
         {
            AV39TFBarFecGen = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFBarFecGen", localUtil.format(AV39TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecCli") == 0 )
         {
            AV49TFBarFecCli = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFBarFecCli", localUtil.format(AV49TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecFpr") == 0 )
         {
            AV88TFBarFecFpr = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFBarFecFpr", localUtil.format(AV88TFBarFecFpr, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecSal") == 0 )
         {
            AV53TFBarFecSal = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarFecSal", localUtil.format(AV53TFBarFecSal, "99/99/99"));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2527P2( )
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
      GXt_int11 = (byte)(0) ;
      GXv_int12[0] = GXt_int11 ;
      new app.pexicon(remoteHandle, context).execute( AV46EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int12) ;
      test_v01_impl.this.GXt_int11 = GXv_int12[0] ;
      AV75TempBoolean = (boolean)((GXt_int11==1)) ;
      if ( AV75TempBoolean )
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
         wbStart = (short)(221) ;
      }
      sendrow_2212( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_221_Refreshing )
      {
         httpContext.doAjaxLoad(221, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV61GridActionGroup1, 4, 0)) );
   }

   public void e2627P2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV61GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO SITUACIONFASES' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV61GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO CONSULTAALBARANSALIDA' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV61GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO RECETAS' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV61GridActionGroup1 == 4 )
      {
         /* Execute user subroutine: 'DO PARTESPRODUCCION' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV61GridActionGroup1 == 5 )
      {
         /* Execute user subroutine: 'DO PACKINGLIST' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV61GridActionGroup1 == 6 )
      {
         /* Execute user subroutine: 'DO PIEZAS' */
         S262 ();
         if (returnInSub) return;
      }
      else if ( AV61GridActionGroup1 == 7 )
      {
         /* Execute user subroutine: 'DO MODIFICARFECHAE' */
         S272 ();
         if (returnInSub) return;
      }
      else if ( AV61GridActionGroup1 == 8 )
      {
         /* Execute user subroutine: 'DO IMPRESIONHDR' */
         S282 ();
         if (returnInSub) return;
      }
      else if ( AV61GridActionGroup1 == 9 )
      {
         /* Execute user subroutine: 'DO AGRUPADAS' */
         S292 ();
         if (returnInSub) return;
      }
      AV61GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV61GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e1727P2( )
   {
      /* Situacionfases_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e1827P2( )
   {
      /* Consultaalbaransalida_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e1927P2( )
   {
      /* Recetas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2027P2( )
   {
      /* Partesproduccion_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2127P2( )
   {
      /* Piezas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e2227P2( )
   {
      /* Agrupadas_modal_Close Routine */
      returnInSub = false ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e1327P2( )
   {
      /* Combo_cod_idtx_Onoptionclicked Routine */
      returnInSub = false ;
      AV93Cod_Idtx = Combo_cod_idtx_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93Cod_Idtx", AV93Cod_Idtx);
      /*  Sending Event outputs  */
   }

   public void e1227P2( )
   {
      /* Combo_bartipartto_Onoptionclicked Routine */
      returnInSub = false ;
      AV109BarTipArtto = (short)(GXutil.lval( Combo_bartipartto_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109BarTipArtto), 4, 0));
      /*  Sending Event outputs  */
   }

   public void e1127P2( )
   {
      /* Combo_bartipart_Onoptionclicked Routine */
      returnInSub = false ;
      AV108BarTipArt = (short)(GXutil.lval( Combo_bartipart_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108BarTipArt), 4, 0));
      /*  Sending Event outputs  */
   }

   public void S172( )
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
      httpContext.popup(formatLink("app.produccion.consultadeproduccion_packinglist", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A143BarDisNum)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum"}) , new Object[] {});
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
      httpContext.popup(formatLink("app.produccion.consultadeproduccion_modfecent", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(A252CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(A279CliNom)),GXutil.URLEncode(GXutil.rtrim(A143BarDisNum)),GXutil.URLEncode(GXutil.rtrim(A212BarSer)),GXutil.URLEncode(GXutil.rtrim(A1652BarSerDsc)),GXutil.URLEncode(GXutil.rtrim(A135BarColNom)),GXutil.URLEncode(GXutil.ltrimstr(A136BarColNum,6,0)),GXutil.URLEncode(GXutil.formatDateParm(A158BarFecFpr))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","CliCod","CliNom","PedidoCliente","BarSer","BarSerDsc","BarColNom","BarColNum","BarFecFpr"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S282( )
   {
      /* 'DO IMPRESIONHDR' Routine */
      returnInSub = false ;
      if ( AV68Moda21 == 1 )
      {
         httpContext.popup(formatLink("app.rhdrmod", new String[] {GXutil.URLEncode(GXutil.rtrim(AV46EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "SCR", "")))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ImpCod","Output"}) , new Object[] {});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta definir el formato", ""));
      }
   }

   public void S292( )
   {
      /* 'DO AGRUPADAS' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "AGRUPADAS_MODALContainer", "Confirm", "", new Object[] {});
   }

   public void S162( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV20Session.getValue(AV118Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV118Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV20Session.getValue(AV118Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S172 ();
      if (returnInSub) return;
      AV147GXV1 = 1 ;
      while ( AV147GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV147GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV21TFBarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TFBarCod), 8, 0));
            AV22TFBarCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV23TFBarCodReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFBarCodReo", GXutil.str( AV23TFBarCodReo, 1, 0));
            AV24TFBarCodReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFBarCodReo_To", GXutil.str( AV24TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV25TFBarCodPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFBarCodPar", AV25TFBarCodPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV26TFBarCodPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFBarCodPar_Sel", AV26TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISNUM") == 0 )
         {
            AV27TFBarDisNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFBarDisNum", AV27TFBarDisNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISNUM_SEL") == 0 )
         {
            AV28TFBarDisNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarDisNum_Sel", AV28TFBarDisNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV29TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFCliCod), 6, 0));
            AV30TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV31TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFCliNom", AV31TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV32TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFCliNom_Sel", AV32TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV33TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarSer", AV33TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV34TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarSer_Sel", AV34TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV35TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFBarSerDsc", AV35TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV36TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFBarSerDsc_Sel", AV36TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV55TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFBarColNom", AV55TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV56TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFBarColNom_Sel", AV56TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV57TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFBarColNum), 6, 0));
            AV58TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV59TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFBarNomCli", AV59TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV60TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFBarNomCli_Sel", AV60TFBarNomCli_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSIT") == 0 )
         {
            AV37TFBarSit = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFBarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFBarSit), 2, 0));
            AV38TFBarSit_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFBarSit_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38TFBarSit_To), 2, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECGEN") == 0 )
         {
            AV39TFBarFecGen = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFBarFecGen", localUtil.format(AV39TFBarFecGen, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECCLI") == 0 )
         {
            AV49TFBarFecCli = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFBarFecCli", localUtil.format(AV49TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV88TFBarFecFpr = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFBarFecFpr", localUtil.format(AV88TFBarFecFpr, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV53TFBarFecSal = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFBarFecSal", localUtil.format(AV53TFBarFecSal, "99/99/99"));
         }
         AV147GXV1 = (int)(AV147GXV1+1) ;
      }
      GXt_char5 = "" ;
      GXv_char8[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFBarCodPar_Sel)==0), AV26TFBarCodPar_Sel, GXv_char8) ;
      test_v01_impl.this.GXt_char5 = GXv_char8[0] ;
      GXt_char14 = "" ;
      GXv_char7[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFBarDisNum_Sel)==0), AV28TFBarDisNum_Sel, GXv_char7) ;
      test_v01_impl.this.GXt_char14 = GXv_char7[0] ;
      GXt_char15 = "" ;
      GXv_char6[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFCliNom_Sel)==0), AV32TFCliNom_Sel, GXv_char6) ;
      test_v01_impl.this.GXt_char15 = GXv_char6[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFBarSer_Sel)==0), AV34TFBarSer_Sel, GXv_char17) ;
      test_v01_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFBarSerDsc_Sel)==0), AV36TFBarSerDsc_Sel, GXv_char19) ;
      test_v01_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFBarColNom_Sel)==0), AV56TFBarColNom_Sel, GXv_char21) ;
      test_v01_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFBarNomCli_Sel)==0), AV60TFBarNomCli_Sel, GXv_char23) ;
      test_v01_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char5+"|"+GXt_char14+"||"+GXt_char15+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"||"+GXt_char22+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFBarCodPar)==0), AV25TFBarCodPar, GXv_char23) ;
      test_v01_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFBarDisNum)==0), AV27TFBarDisNum, GXv_char21) ;
      test_v01_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFCliNom)==0), AV31TFCliNom, GXv_char19) ;
      test_v01_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFBarSer)==0), AV33TFBarSer, GXv_char17) ;
      test_v01_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char8[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarSerDsc)==0), AV35TFBarSerDsc, GXv_char8) ;
      test_v01_impl.this.GXt_char15 = GXv_char8[0] ;
      GXt_char14 = "" ;
      GXv_char7[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFBarColNom)==0), AV55TFBarColNom, GXv_char7) ;
      test_v01_impl.this.GXt_char14 = GXv_char7[0] ;
      GXt_char5 = "" ;
      GXv_char6[0] = GXt_char5 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFBarNomCli)==0), AV59TFBarNomCli, GXv_char6) ;
      test_v01_impl.this.GXt_char5 = GXv_char6[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV21TFBarCod) ? "" : GXutil.str( AV21TFBarCod, 8, 0))+"|"+((0==AV23TFBarCodReo) ? "" : GXutil.str( AV23TFBarCodReo, 1, 0))+"|"+GXt_char22+"|"+GXt_char20+"|"+((0==AV29TFCliCod) ? "" : GXutil.str( AV29TFCliCod, 6, 0))+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char15+"|"+GXt_char14+"|"+((0==AV57TFBarColNum) ? "" : GXutil.str( AV57TFBarColNum, 6, 0))+"|"+GXt_char5+"|"+((0==AV37TFBarSit) ? "" : GXutil.str( AV37TFBarSit, 2, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV39TFBarFecGen)) ? "" : localUtil.dtoc( AV39TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFBarFecCli)) ? "" : localUtil.dtoc( AV49TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88TFBarFecFpr)) ? "" : localUtil.dtoc( AV88TFBarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFBarFecSal)) ? "" : localUtil.dtoc( AV53TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV22TFBarCod_To) ? "" : GXutil.str( AV22TFBarCod_To, 8, 0))+"|"+((0==AV24TFBarCodReo_To) ? "" : GXutil.str( AV24TFBarCodReo_To, 1, 0))+"|||"+((0==AV30TFCliCod_To) ? "" : GXutil.str( AV30TFCliCod_To, 6, 0))+"|||||"+((0==AV58TFBarColNum_To) ? "" : GXutil.str( AV58TFBarColNum_To, 6, 0))+"||"+((0==AV38TFBarSit_To) ? "" : GXutil.str( AV38TFBarSit_To, 2, 0))+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV20Session.getValue(AV118Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCOD", "", !((0==AV21TFBarCod)&&(0==AV22TFBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV21TFBarCod, 8, 0)), GXutil.trim( GXutil.str( AV22TFBarCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCODREO", "", !((0==AV23TFBarCodReo)&&(0==AV24TFBarCodReo_To)), (short)(0), GXutil.trim( GXutil.str( AV23TFBarCodReo, 1, 0)), GXutil.trim( GXutil.str( AV24TFBarCodReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCODPAR", "", !(GXutil.strcmp("", AV25TFBarCodPar)==0), (short)(0), AV25TFBarCodPar, "", !(GXutil.strcmp("", AV26TFBarCodPar_Sel)==0), AV26TFBarCodPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARDISNUM", "", !(GXutil.strcmp("", AV27TFBarDisNum)==0), (short)(0), AV27TFBarDisNum, "", !(GXutil.strcmp("", AV28TFBarDisNum_Sel)==0), AV28TFBarDisNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLICOD", "", !((0==AV29TFCliCod)&&(0==AV30TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV29TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV30TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLINOM", "", !(GXutil.strcmp("", AV31TFCliNom)==0), (short)(0), AV31TFCliNom, "", !(GXutil.strcmp("", AV32TFCliNom_Sel)==0), AV32TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARSER", "", !(GXutil.strcmp("", AV33TFBarSer)==0), (short)(0), AV33TFBarSer, "", !(GXutil.strcmp("", AV34TFBarSer_Sel)==0), AV34TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARSERDSC", "", !(GXutil.strcmp("", AV35TFBarSerDsc)==0), (short)(0), AV35TFBarSerDsc, "", !(GXutil.strcmp("", AV36TFBarSerDsc_Sel)==0), AV36TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV55TFBarColNom)==0), (short)(0), AV55TFBarColNom, "", !(GXutil.strcmp("", AV56TFBarColNom_Sel)==0), AV56TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCOLNUM", "", !((0==AV57TFBarColNum)&&(0==AV58TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV58TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV59TFBarNomCli)==0), (short)(0), AV59TFBarNomCli, "", !(GXutil.strcmp("", AV60TFBarNomCli_Sel)==0), AV60TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARSIT", "", !((0==AV37TFBarSit)&&(0==AV38TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV37TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV38TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARFECGEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV39TFBarFecGen)), (short)(0), GXutil.trim( localUtil.dtoc( AV39TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARFECCLI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV49TFBarFecCli)), (short)(0), GXutil.trim( localUtil.dtoc( AV49TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARFECFPR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88TFBarFecFpr)), (short)(0), GXutil.trim( localUtil.dtoc( AV88TFBarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARFECSAL", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV53TFBarFecSal)), (short)(0), GXutil.trim( localUtil.dtoc( AV53TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV118Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV118Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PedidosClienteSinDetalle.HojadeRuta_TRN" );
      AV20Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S142( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV46EmprCod, httpContext.getMessage( "CNOENC", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarAcaAnh_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarAcaAnh_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarAcaAnh_Visible), 5, 0), !bGXsfl_221_Refreshing);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV46EmprCod, httpContext.getMessage( "CNOENC", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtBarCuadern_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarCuadern_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarCuadern_Visible), 5, 0), !bGXsfl_221_Refreshing);
      }
      if ( ! ( ( AV70STNORM == 1 ) ) )
      {
         edtBarNormas_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarNormas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNormas_Visible), 5, 0), !bGXsfl_221_Refreshing);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV46EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV46EmprCod, httpContext.getMessage( "STDNOR", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV46EmprCod, httpContext.getMessage( "STNORM", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV46EmprCod, httpContext.getMessage( "CTWEAR", "")) == 1 ) ) )
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
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV46EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
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
         divMuestras_cell_Class = "col-xs-12 col-sm-3 CellMarginTop20" ;
         httpContext.ajax_rsp_assign_prop("", false, divMuestras_cell_Internalname, "Class", divMuestras_cell_Class, true);
      }
   }

   public void S192( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV62TotBarKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TotBarKgm", GXutil.ltrimstr( AV62TotBarKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARKGM", getSecureSignedToken( "", localUtil.format( AV62TotBarKgm, "ZZZZZ9.99")));
      AV64TotBarMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64TotBarMtr", GXutil.ltrimstr( AV64TotBarMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARMTR", getSecureSignedToken( "", localUtil.format( AV64TotBarMtr, "ZZZZZ9.99")));
      AV66TotBarPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66TotBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TotBarPie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66TotBarPie), "ZZZZZ9")));
   }

   public void S202( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV119Produccion_test_v01ds_1_tfbarcod = AV21TFBarCod ;
      AV120Produccion_test_v01ds_2_tfbarcod_to = AV22TFBarCod_To ;
      AV121Produccion_test_v01ds_3_tfbarcodreo = AV23TFBarCodReo ;
      AV122Produccion_test_v01ds_4_tfbarcodreo_to = AV24TFBarCodReo_To ;
      AV123Produccion_test_v01ds_5_tfbarcodpar = AV25TFBarCodPar ;
      AV124Produccion_test_v01ds_6_tfbarcodpar_sel = AV26TFBarCodPar_Sel ;
      AV125Produccion_test_v01ds_7_tfbardisnum = AV27TFBarDisNum ;
      AV126Produccion_test_v01ds_8_tfbardisnum_sel = AV28TFBarDisNum_Sel ;
      AV127Produccion_test_v01ds_9_tfclicod = AV29TFCliCod ;
      AV128Produccion_test_v01ds_10_tfclicod_to = AV30TFCliCod_To ;
      AV129Produccion_test_v01ds_11_tfclinom = AV31TFCliNom ;
      AV130Produccion_test_v01ds_12_tfclinom_sel = AV32TFCliNom_Sel ;
      AV131Produccion_test_v01ds_13_tfbarser = AV33TFBarSer ;
      AV132Produccion_test_v01ds_14_tfbarser_sel = AV34TFBarSer_Sel ;
      AV133Produccion_test_v01ds_15_tfbarserdsc = AV35TFBarSerDsc ;
      AV134Produccion_test_v01ds_16_tfbarserdsc_sel = AV36TFBarSerDsc_Sel ;
      AV135Produccion_test_v01ds_17_tfbarcolnom = AV55TFBarColNom ;
      AV136Produccion_test_v01ds_18_tfbarcolnom_sel = AV56TFBarColNom_Sel ;
      AV137Produccion_test_v01ds_19_tfbarcolnum = AV57TFBarColNum ;
      AV138Produccion_test_v01ds_20_tfbarcolnum_to = AV58TFBarColNum_To ;
      AV139Produccion_test_v01ds_21_tfbarnomcli = AV59TFBarNomCli ;
      AV140Produccion_test_v01ds_22_tfbarnomcli_sel = AV60TFBarNomCli_Sel ;
      AV141Produccion_test_v01ds_23_tfbarsit = AV37TFBarSit ;
      AV142Produccion_test_v01ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV143Produccion_test_v01ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV144Produccion_test_v01ds_26_tfbarfeccli = AV49TFBarFecCli ;
      AV145Produccion_test_v01ds_27_tfbarfecfpr = AV88TFBarFecFpr ;
      AV146Produccion_test_v01ds_28_tfbarfecsal = AV53TFBarFecSal ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV119Produccion_test_v01ds_1_tfbarcod) ,
                                           Integer.valueOf(AV120Produccion_test_v01ds_2_tfbarcod_to) ,
                                           Byte.valueOf(AV121Produccion_test_v01ds_3_tfbarcodreo) ,
                                           Byte.valueOf(AV122Produccion_test_v01ds_4_tfbarcodreo_to) ,
                                           AV124Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                           AV123Produccion_test_v01ds_5_tfbarcodpar ,
                                           AV126Produccion_test_v01ds_8_tfbardisnum_sel ,
                                           AV125Produccion_test_v01ds_7_tfbardisnum ,
                                           Integer.valueOf(AV127Produccion_test_v01ds_9_tfclicod) ,
                                           Integer.valueOf(AV128Produccion_test_v01ds_10_tfclicod_to) ,
                                           AV130Produccion_test_v01ds_12_tfclinom_sel ,
                                           AV129Produccion_test_v01ds_11_tfclinom ,
                                           AV132Produccion_test_v01ds_14_tfbarser_sel ,
                                           AV131Produccion_test_v01ds_13_tfbarser ,
                                           AV134Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                           AV133Produccion_test_v01ds_15_tfbarserdsc ,
                                           AV136Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                           AV135Produccion_test_v01ds_17_tfbarcolnom ,
                                           Integer.valueOf(AV137Produccion_test_v01ds_19_tfbarcolnum) ,
                                           Integer.valueOf(AV138Produccion_test_v01ds_20_tfbarcolnum_to) ,
                                           AV140Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                           AV139Produccion_test_v01ds_21_tfbarnomcli ,
                                           Byte.valueOf(AV141Produccion_test_v01ds_23_tfbarsit) ,
                                           Byte.valueOf(AV142Produccion_test_v01ds_24_tfbarsit_to) ,
                                           AV143Produccion_test_v01ds_25_tfbarfecgen ,
                                           AV144Produccion_test_v01ds_26_tfbarfeccli ,
                                           AV145Produccion_test_v01ds_27_tfbarfecfpr ,
                                           AV146Produccion_test_v01ds_28_tfbarfecsal ,
                                           Integer.valueOf(AV14CliCod) ,
                                           Integer.valueOf(AV15CliCodto) ,
                                           AV71BarDisNum ,
                                           AV74BarDisNumTo ,
                                           AV16BarFecGen ,
                                           AV17BarFecGenTo ,
                                           AV72BarFecCli ,
                                           AV73BarFecCliTo ,
                                           AV78BarFecSal ,
                                           AV79BarFecSalto ,
                                           AV76BarFecFpr ,
                                           AV77BarFecFprto ,
                                           AV80BarColNom ,
                                           AV86BarColNomto ,
                                           Integer.valueOf(AV81BarColNum) ,
                                           Integer.valueOf(AV87BarColNumto) ,
                                           AV82BarNomCli ,
                                           AV84BarNomClito ,
                                           Integer.valueOf(AV83BarNumCli) ,
                                           Integer.valueOf(AV85BarNumClito) ,
                                           Integer.valueOf(AV90BarCod) ,
                                           Integer.valueOf(AV96BarCodto) ,
                                           Byte.valueOf(AV91BarCodReo) ,
                                           Byte.valueOf(AV97BarCodReoto) ,
                                           AV92BarCodPar ,
                                           AV98BarCodParto ,
                                           AV93Cod_Idtx ,
                                           AV94BarGirar ,
                                           Short.valueOf(AV108BarTipArt) ,
                                           Short.valueOf(AV109BarTipArtto) ,
                                           AV110BarSer ,
                                           AV111BarSerto ,
                                           Integer.valueOf(A129BarCod) ,
                                           Byte.valueOf(A132BarCodReo) ,
                                           A130BarCodPar ,
                                           A143BarDisNum ,
                                           Integer.valueOf(A252CliCod) ,
                                           A279CliNom ,
                                           A212BarSer ,
                                           A1652BarSerDsc ,
                                           A135BarColNom ,
                                           Integer.valueOf(A136BarColNum) ,
                                           A1234BarNomCli ,
                                           Byte.valueOf(A213BarSit) ,
                                           A159BarFecGen ,
                                           A155BarFecCli ,
                                           A158BarFecFpr ,
                                           A161BarFecSal ,
                                           Integer.valueOf(A1235BarNumCli) ,
                                           A2829BarProPer ,
                                           A2454BarGirar ,
                                           Short.valueOf(A217BarTipArt) ,
                                           Byte.valueOf(AV18BarSit) ,
                                           Byte.valueOf(AV19BarSitTo) ,
                                           AV46EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV123Produccion_test_v01ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV123Produccion_test_v01ds_5_tfbarcodpar), 1, "%") ;
      lV125Produccion_test_v01ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV125Produccion_test_v01ds_7_tfbardisnum), 8, "%") ;
      lV129Produccion_test_v01ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV129Produccion_test_v01ds_11_tfclinom), 30, "%") ;
      lV131Produccion_test_v01ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV131Produccion_test_v01ds_13_tfbarser), 16, "%") ;
      lV133Produccion_test_v01ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV133Produccion_test_v01ds_15_tfbarserdsc), 26, "%") ;
      lV135Produccion_test_v01ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV135Produccion_test_v01ds_17_tfbarcolnom), 13, "%") ;
      lV139Produccion_test_v01ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV139Produccion_test_v01ds_21_tfbarnomcli), 13, "%") ;
      /* Using cursor H027P19 */
      pr_default.execute(2, new Object[] {AV46EmprCod, Byte.valueOf(AV18BarSit), Byte.valueOf(AV19BarSitTo), Integer.valueOf(AV119Produccion_test_v01ds_1_tfbarcod), Integer.valueOf(AV120Produccion_test_v01ds_2_tfbarcod_to), Byte.valueOf(AV121Produccion_test_v01ds_3_tfbarcodreo), Byte.valueOf(AV122Produccion_test_v01ds_4_tfbarcodreo_to), lV123Produccion_test_v01ds_5_tfbarcodpar, AV124Produccion_test_v01ds_6_tfbarcodpar_sel, lV125Produccion_test_v01ds_7_tfbardisnum, AV126Produccion_test_v01ds_8_tfbardisnum_sel, Integer.valueOf(AV127Produccion_test_v01ds_9_tfclicod), Integer.valueOf(AV128Produccion_test_v01ds_10_tfclicod_to), lV129Produccion_test_v01ds_11_tfclinom, AV130Produccion_test_v01ds_12_tfclinom_sel, lV131Produccion_test_v01ds_13_tfbarser, AV132Produccion_test_v01ds_14_tfbarser_sel, lV133Produccion_test_v01ds_15_tfbarserdsc, AV134Produccion_test_v01ds_16_tfbarserdsc_sel, lV135Produccion_test_v01ds_17_tfbarcolnom, AV136Produccion_test_v01ds_18_tfbarcolnom_sel, Integer.valueOf(AV137Produccion_test_v01ds_19_tfbarcolnum), Integer.valueOf(AV138Produccion_test_v01ds_20_tfbarcolnum_to), lV139Produccion_test_v01ds_21_tfbarnomcli, AV140Produccion_test_v01ds_22_tfbarnomcli_sel, Byte.valueOf(AV141Produccion_test_v01ds_23_tfbarsit), Byte.valueOf(AV142Produccion_test_v01ds_24_tfbarsit_to), AV143Produccion_test_v01ds_25_tfbarfecgen, AV144Produccion_test_v01ds_26_tfbarfeccli, AV145Produccion_test_v01ds_27_tfbarfecfpr, AV146Produccion_test_v01ds_28_tfbarfecsal, Integer.valueOf(AV14CliCod), Integer.valueOf(AV15CliCodto), AV71BarDisNum, AV74BarDisNumTo, AV16BarFecGen, AV17BarFecGenTo, AV72BarFecCli, AV73BarFecCliTo, AV78BarFecSal, AV79BarFecSalto, AV76BarFecFpr, AV77BarFecFprto, AV80BarColNom, AV86BarColNomto, Integer.valueOf(AV81BarColNum), Integer.valueOf(AV87BarColNumto), AV82BarNomCli, AV84BarNomClito, Integer.valueOf(AV83BarNumCli), Integer.valueOf(AV85BarNumClito), Integer.valueOf(AV90BarCod), Integer.valueOf(AV96BarCodto), Byte.valueOf(AV91BarCodReo), Byte.valueOf(AV97BarCodReoto), AV92BarCodPar, AV98BarCodParto, AV93Cod_Idtx, AV94BarGirar, Short.valueOf(AV108BarTipArt), Short.valueOf(AV109BarTipArtto), AV110BarSer, AV111BarSerto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A217BarTipArt = H027P19_A217BarTipArt[0] ;
         n217BarTipArt = H027P19_n217BarTipArt[0] ;
         A2454BarGirar = H027P19_A2454BarGirar[0] ;
         A2829BarProPer = H027P19_A2829BarProPer[0] ;
         A1235BarNumCli = H027P19_A1235BarNumCli[0] ;
         A396EmprCod = H027P19_A396EmprCod[0] ;
         A161BarFecSal = H027P19_A161BarFecSal[0] ;
         A158BarFecFpr = H027P19_A158BarFecFpr[0] ;
         A155BarFecCli = H027P19_A155BarFecCli[0] ;
         A159BarFecGen = H027P19_A159BarFecGen[0] ;
         A213BarSit = H027P19_A213BarSit[0] ;
         A1234BarNomCli = H027P19_A1234BarNomCli[0] ;
         A136BarColNum = H027P19_A136BarColNum[0] ;
         A135BarColNom = H027P19_A135BarColNom[0] ;
         A1652BarSerDsc = H027P19_A1652BarSerDsc[0] ;
         A212BarSer = H027P19_A212BarSer[0] ;
         A279CliNom = H027P19_A279CliNom[0] ;
         A252CliCod = H027P19_A252CliCod[0] ;
         n252CliCod = H027P19_n252CliCod[0] ;
         A143BarDisNum = H027P19_A143BarDisNum[0] ;
         A130BarCodPar = H027P19_A130BarCodPar[0] ;
         A132BarCodReo = H027P19_A132BarCodReo[0] ;
         A129BarCod = H027P19_A129BarCod[0] ;
         A166BarKgm = H027P19_A166BarKgm[0] ;
         A184BarMtr = H027P19_A184BarMtr[0] ;
         A199BarPie1 = H027P19_A199BarPie1[0] ;
         A365DisDes = H027P19_A365DisDes[0] ;
         A898BarPieNDes = H027P19_A898BarPieNDes[0] ;
         A279CliNom = H027P19_A279CliNom[0] ;
         A166BarKgm = H027P19_A166BarKgm[0] ;
         A184BarMtr = H027P19_A184BarMtr[0] ;
         A199BarPie1 = H027P19_A199BarPie1[0] ;
         A898BarPieNDes = H027P19_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV62TotBarKgm = A166BarKgm.add(AV62TotBarKgm) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62TotBarKgm", GXutil.ltrimstr( AV62TotBarKgm, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARKGM", getSecureSignedToken( "", localUtil.format( AV62TotBarKgm, "ZZZZZ9.99")));
         AV64TotBarMtr = A184BarMtr.add(AV64TotBarMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV64TotBarMtr", GXutil.ltrimstr( AV64TotBarMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARMTR", getSecureSignedToken( "", localUtil.format( AV64TotBarMtr, "ZZZZZ9.99")));
         AV66TotBarPie = (long)(A198BarPie+AV66TotBarPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66TotBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66TotBarPie), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV66TotBarPie), "ZZZZZ9")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV63TotValueBarKgm = localUtil.format( AV62TotBarKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63TotValueBarKgm", AV63TotValueBarKgm);
      AV65TotValueBarMtr = localUtil.format( AV64TotBarMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65TotValueBarMtr", AV65TotValueBarMtr);
      AV67TotValueBarPie = localUtil.format( DecimalUtil.doubleToDec(AV66TotBarPie), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67TotValueBarPie", AV67TotValueBarPie);
   }

   public void S132( )
   {
      /* 'LOADCOMBOCOD_IDTX' Routine */
      returnInSub = false ;
      /* Using cursor H027P20 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H027P20_A396EmprCod[0] ;
         A13810Dsc_IdtxID = H027P20_A13810Dsc_IdtxID[0] ;
         A10887Cod_Idtx = H027P20_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = H027P20_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = H027P20_n10888Dsc_Idtx[0] ;
         AV100Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV100Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A10887Cod_Idtx );
         AV100Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13810Dsc_IdtxID );
         AV99Cod_Idtx_Data.add(AV100Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_cod_idtx_Selectedvalue_set = AV93Cod_Idtx ;
      ucCombo_cod_idtx.sendProperty(context, "", false, Combo_cod_idtx_Internalname, "SelectedValue_set", Combo_cod_idtx_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOBARTIPARTTO' Routine */
      returnInSub = false ;
      /* Using cursor H027P21 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = H027P21_A396EmprCod[0] ;
         A13788TipArtCodD = H027P21_A13788TipArtCodD[0] ;
         A829TipArtCod = H027P21_A829TipArtCod[0] ;
         A830TipArtDsc = H027P21_A830TipArtDsc[0] ;
         n830TipArtDsc = H027P21_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H027P21_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H027P21_n6014TipArtDsc2[0] ;
         AV100Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV100Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV100Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV113BarTipArtto_Data.add(AV100Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_bartipartto_Selectedvalue_set = ((0==AV109BarTipArtto) ? "" : GXutil.trim( GXutil.str( AV109BarTipArtto, 4, 0))) ;
      ucCombo_bartipartto.sendProperty(context, "", false, Combo_bartipartto_Internalname, "SelectedValue_set", Combo_bartipartto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOBARTIPART' Routine */
      returnInSub = false ;
      /* Using cursor H027P22 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = H027P22_A396EmprCod[0] ;
         A13788TipArtCodD = H027P22_A13788TipArtCodD[0] ;
         A829TipArtCod = H027P22_A829TipArtCod[0] ;
         A830TipArtDsc = H027P22_A830TipArtDsc[0] ;
         n830TipArtDsc = H027P22_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H027P22_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H027P22_n6014TipArtDsc2[0] ;
         AV100Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV100Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV100Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV112BarTipArt_Data.add(AV100Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_bartipart_Selectedvalue_set = ((0==AV108BarTipArt) ? "" : GXutil.trim( GXutil.str( AV108BarTipArt, 4, 0))) ;
      ucCombo_bartipart.sendProperty(context, "", false, Combo_bartipart_Internalname, "SelectedValue_set", Combo_bartipart_Selectedvalue_set);
   }

   public void wb_table8_345_27P2( boolean wbgen )
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
         wb_table8_345_27P2e( true) ;
      }
      else
      {
         wb_table8_345_27P2e( false) ;
      }
   }

   public void wb_table7_340_27P2( boolean wbgen )
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
         wb_table7_340_27P2e( true) ;
      }
      else
      {
         wb_table7_340_27P2e( false) ;
      }
   }

   public void wb_table6_335_27P2( boolean wbgen )
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
         wb_table6_335_27P2e( true) ;
      }
      else
      {
         wb_table6_335_27P2e( false) ;
      }
   }

   public void wb_table5_330_27P2( boolean wbgen )
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
         wb_table5_330_27P2e( true) ;
      }
      else
      {
         wb_table5_330_27P2e( false) ;
      }
   }

   public void wb_table4_325_27P2( boolean wbgen )
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
         wb_table4_325_27P2e( true) ;
      }
      else
      {
         wb_table4_325_27P2e( false) ;
      }
   }

   public void wb_table3_320_27P2( boolean wbgen )
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
         wb_table3_320_27P2e( true) ;
      }
      else
      {
         wb_table3_320_27P2e( false) ;
      }
   }

   public void wb_table2_315_27P2( boolean wbgen )
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
         wb_table2_315_27P2e( true) ;
      }
      else
      {
         wb_table2_315_27P2e( false) ;
      }
   }

   public void wb_table1_257_27P2( boolean wbgen )
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
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkgm_Internalname, httpContext.getMessage( "Tot Value Bar Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 276,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkgm_Internalname, AV63TotValueBarKgm, GXutil.rtrim( localUtil.format( AV63TotValueBarKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,276);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarmtr_Internalname, httpContext.getMessage( "Tot Value Bar Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 279,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarmtr_Internalname, AV65TotValueBarMtr, GXutil.rtrim( localUtil.format( AV65TotValueBarMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,279);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarpie_Internalname, httpContext.getMessage( "Tot Value Bar Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 282,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarpie_Internalname, AV67TotValueBarPie, GXutil.rtrim( localUtil.format( AV67TotValueBarPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,282);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v01.htm");
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
         wb_table1_257_27P2e( true) ;
      }
      else
      {
         wb_table1_257_27P2e( false) ;
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
      pa27P2( ) ;
      ws27P2( ) ;
      we27P2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116153644", true, true);
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
      httpContext.AddJavascriptSource("produccion/test_v01.js", "?202682116153644", false, true);
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

   public void subsflControlProps_2212( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_221_idx );
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_221_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_221_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_221_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_221_idx ;
      edtBarDisNum_Internalname = "BARDISNUM_"+sGXsfl_221_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_221_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_221_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_221_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_221_idx ;
      edtBarTipArt_Internalname = "BARTIPART_"+sGXsfl_221_idx ;
      edtBarTipArtD_Internalname = "BARTIPARTD_"+sGXsfl_221_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_221_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_221_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_221_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_221_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_221_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_221_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_221_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_221_idx ;
      edtBarFecCli_Internalname = "BARFECCLI_"+sGXsfl_221_idx ;
      edtBarFecFpr_Internalname = "BARFECFPR_"+sGXsfl_221_idx ;
      edtBarFecSal_Internalname = "BARFECSAL_"+sGXsfl_221_idx ;
      edtBarFasCod_Internalname = "BARFASCOD_"+sGXsfl_221_idx ;
      edtBarFasSig_Internalname = "BARFASSIG_"+sGXsfl_221_idx ;
      edtBarAlbUlti_Internalname = "BARALBULTI_"+sGXsfl_221_idx ;
      edtBarAlbFact_Internalname = "BARALBFACT_"+sGXsfl_221_idx ;
      edtBarGirar_Internalname = "BARGIRAR_"+sGXsfl_221_idx ;
      edtBarAcaAnh_Internalname = "BARACAANH_"+sGXsfl_221_idx ;
      edtBarCuadern_Internalname = "BARCUADERN_"+sGXsfl_221_idx ;
      edtBarProPerI_Internalname = "BARPROPERI_"+sGXsfl_221_idx ;
      edtBarNormas_Internalname = "BARNORMAS_"+sGXsfl_221_idx ;
      edtDisUsrCod_Internalname = "DISUSRCOD_"+sGXsfl_221_idx ;
   }

   public void subsflControlProps_fel_2212( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_221_fel_idx );
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_221_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_221_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_221_fel_idx ;
      edtBarAgrEst_Internalname = "BARAGREST_"+sGXsfl_221_fel_idx ;
      edtBarDisNum_Internalname = "BARDISNUM_"+sGXsfl_221_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_221_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_221_fel_idx ;
      edtBarSer_Internalname = "BARSER_"+sGXsfl_221_fel_idx ;
      edtBarSerDsc_Internalname = "BARSERDSC_"+sGXsfl_221_fel_idx ;
      edtBarTipArt_Internalname = "BARTIPART_"+sGXsfl_221_fel_idx ;
      edtBarTipArtD_Internalname = "BARTIPARTD_"+sGXsfl_221_fel_idx ;
      edtBarColNom_Internalname = "BARCOLNOM_"+sGXsfl_221_fel_idx ;
      edtBarColNum_Internalname = "BARCOLNUM_"+sGXsfl_221_fel_idx ;
      edtBarNomCli_Internalname = "BARNOMCLI_"+sGXsfl_221_fel_idx ;
      edtBarKgm_Internalname = "BARKGM_"+sGXsfl_221_fel_idx ;
      edtBarMtr_Internalname = "BARMTR_"+sGXsfl_221_fel_idx ;
      edtBarPie_Internalname = "BARPIE_"+sGXsfl_221_fel_idx ;
      edtBarSit_Internalname = "BARSIT_"+sGXsfl_221_fel_idx ;
      edtBarFecGen_Internalname = "BARFECGEN_"+sGXsfl_221_fel_idx ;
      edtBarFecCli_Internalname = "BARFECCLI_"+sGXsfl_221_fel_idx ;
      edtBarFecFpr_Internalname = "BARFECFPR_"+sGXsfl_221_fel_idx ;
      edtBarFecSal_Internalname = "BARFECSAL_"+sGXsfl_221_fel_idx ;
      edtBarFasCod_Internalname = "BARFASCOD_"+sGXsfl_221_fel_idx ;
      edtBarFasSig_Internalname = "BARFASSIG_"+sGXsfl_221_fel_idx ;
      edtBarAlbUlti_Internalname = "BARALBULTI_"+sGXsfl_221_fel_idx ;
      edtBarAlbFact_Internalname = "BARALBFACT_"+sGXsfl_221_fel_idx ;
      edtBarGirar_Internalname = "BARGIRAR_"+sGXsfl_221_fel_idx ;
      edtBarAcaAnh_Internalname = "BARACAANH_"+sGXsfl_221_fel_idx ;
      edtBarCuadern_Internalname = "BARCUADERN_"+sGXsfl_221_fel_idx ;
      edtBarProPerI_Internalname = "BARPROPERI_"+sGXsfl_221_fel_idx ;
      edtBarNormas_Internalname = "BARNORMAS_"+sGXsfl_221_fel_idx ;
      edtDisUsrCod_Internalname = "DISUSRCOD_"+sGXsfl_221_fel_idx ;
   }

   public void sendrow_2212( )
   {
      subsflControlProps_2212( ) ;
      wb27P0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_221_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_221_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_221_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 222,'',false,'"+sGXsfl_221_idx+"',221)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_221_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV61GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV61GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV61GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_221_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,222);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV61GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_221_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAgrEst_Internalname,GXutil.rtrim( A120BarAgrEst),GXutil.rtrim( localUtil.format( A120BarAgrEst, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAgrEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarDisNum_Internalname,GXutil.rtrim( A143BarDisNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarDisNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSer_Internalname,GXutil.rtrim( A212BarSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSerDsc_Internalname,GXutil.rtrim( A1652BarSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArt_Internalname,GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A217BarTipArt), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTipArtD_Internalname,GXutil.rtrim( A13711BarTipArtD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTipArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNom_Internalname,GXutil.rtrim( A135BarColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A136BarColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNomCli_Internalname,GXutil.rtrim( A1234BarNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A166BarKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarKgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A184BarMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarMtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarPie_Internalname,GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A198BarPie), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarPie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarSit_Internalname,GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A213BarSit), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarSit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecGen_Internalname,localUtil.format(A159BarFecGen, "99/99/99"),localUtil.format( A159BarFecGen, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecGen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecCli_Internalname,localUtil.format(A155BarFecCli, "99/99/99"),localUtil.format( A155BarFecCli, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecFpr_Internalname,localUtil.format(A158BarFecFpr, "99/99/99"),localUtil.format( A158BarFecFpr, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecFpr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFecSal_Internalname,localUtil.format(A161BarFecSal, "99/99/99"),localUtil.format( A161BarFecSal, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCod_Internalname,GXutil.rtrim( A151BarFasCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasSig_Internalname,GXutil.rtrim( A1955BarFasSig),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasSig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbUlti_Internalname,GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13930BarAlbUlti), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbUlti_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAlbFact_Internalname,GXutil.ltrim( localUtil.ntoc( A13935BarAlbFact, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13935BarAlbFact), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAlbFact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarGirar_Internalname,GXutil.rtrim( A2454BarGirar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarGirar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtBarAcaAnh_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAcaAnh_Internalname,GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A4466BarAcaAnh), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAcaAnh_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarAcaAnh_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarCuadern_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCuadern_Internalname,GXutil.rtrim( A13933BarCuadern),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCuadern_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarCuadern_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarProPerI_Internalname,GXutil.rtrim( A14204BarProPerI),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarProPerI_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtBarNormas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarNormas_Internalname,A13934BarNormas,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarNormas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtBarNormas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDisUsrCod_Internalname,GXutil.rtrim( A4348DisUsrCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDisUsrCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes27P2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_221_idx = ((subGrid_Islastpage==1)&&(nGXsfl_221_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_221_idx+1) ;
         sGXsfl_221_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_221_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2212( ) ;
      }
      /* End function sendrow_2212 */
   }

   public void startgridcontrol221( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"221\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Nº Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ped. Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tip Art", "")) ;
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
         httpContext.writeValue( httpContext.getMessage( "Color Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sit.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Ped. Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Ent. Prev.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ult. Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Sig. Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultimo Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarAcaAnh_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cuaderno", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarCuadern_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "CTW", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtBarNormas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Normas Estandars Textiles", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV61GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A120BarAgrEst));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A143BarDisNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A212BarSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1652BarSerDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A217BarTipArt, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13711BarTipArtD));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A135BarColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A136BarColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1234BarNomCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A159BarFecGen, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A155BarFecCli, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A158BarFecFpr, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A161BarFecSal, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A151BarFasCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1955BarFasSig));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13930BarAlbUlti, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13935BarAlbFact, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2454BarGirar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A4466BarAcaAnh, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarAcaAnh_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13933BarCuadern));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarCuadern_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14204BarProPerI));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A13934BarNormas);
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtBarNormas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4348DisUsrCod));
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
      edtavClicodto_Internalname = "vCLICODTO" ;
      edtavBardisnum_Internalname = "vBARDISNUM" ;
      edtavBardisnumto_Internalname = "vBARDISNUMTO" ;
      edtavBarsit_Internalname = "vBARSIT" ;
      edtavBarsitto_Internalname = "vBARSITTO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavBarfecgen_Internalname = "vBARFECGEN" ;
      edtavBarfecgento_Internalname = "vBARFECGENTO" ;
      edtavBarfeccli_Internalname = "vBARFECCLI" ;
      edtavBarfecclito_Internalname = "vBARFECCLITO" ;
      edtavBarfecfpr_Internalname = "vBARFECFPR" ;
      edtavBarfecfprto_Internalname = "vBARFECFPRTO" ;
      edtavBarfecsal_Internalname = "vBARFECSAL" ;
      edtavBarfecsalto_Internalname = "vBARFECSALTO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarcolnum_Internalname = "vBARCOLNUM" ;
      edtavBarcolnomto_Internalname = "vBARCOLNOMTO" ;
      edtavBarcolnumto_Internalname = "vBARCOLNUMTO" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      edtavBarnomcli_Internalname = "vBARNOMCLI" ;
      edtavBarnumcli_Internalname = "vBARNUMCLI" ;
      edtavBarnomclito_Internalname = "vBARNOMCLITO" ;
      edtavBarnumclito_Internalname = "vBARNUMCLITO" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarserto_Internalname = "vBARSERTO" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      lblTextblockcombo_bartipart_Internalname = "TEXTBLOCKCOMBO_BARTIPART" ;
      Combo_bartipart_Internalname = "COMBO_BARTIPART" ;
      divTablesplittedbartipart_Internalname = "TABLESPLITTEDBARTIPART" ;
      lblTextblockcombo_bartipartto_Internalname = "TEXTBLOCKCOMBO_BARTIPARTTO" ;
      Combo_bartipartto_Internalname = "COMBO_BARTIPARTTO" ;
      divTablesplittedbartipartto_Internalname = "TABLESPLITTEDBARTIPARTTO" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavBarcodto_Internalname = "vBARCODTO" ;
      edtavBarcodreoto_Internalname = "vBARCODREOTO" ;
      edtavBarcodparto_Internalname = "vBARCODPARTO" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      Dvpanel_unnamedtable5_Internalname = "DVPANEL_UNNAMEDTABLE5" ;
      lblTextblockcombo_cod_idtx_Internalname = "TEXTBLOCKCOMBO_COD_IDTX" ;
      Combo_cod_idtx_Internalname = "COMBO_COD_IDTX" ;
      divTablesplittedcod_idtx_Internalname = "TABLESPLITTEDCOD_IDTX" ;
      divCombo_cod_idtx_cell_Internalname = "COMBO_COD_IDTX_CELL" ;
      edtavBargirar_Internalname = "vBARGIRAR" ;
      cmbavMuestras.setInternalname( "vMUESTRAS" );
      divMuestras_cell_Internalname = "MUESTRAS_CELL" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtBarAgrEst_Internalname = "BARAGREST" ;
      edtBarDisNum_Internalname = "BARDISNUM" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      edtBarSer_Internalname = "BARSER" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      edtBarTipArt_Internalname = "BARTIPART" ;
      edtBarTipArtD_Internalname = "BARTIPARTD" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      edtBarColNum_Internalname = "BARCOLNUM" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      edtBarKgm_Internalname = "BARKGM" ;
      edtBarMtr_Internalname = "BARMTR" ;
      edtBarPie_Internalname = "BARPIE" ;
      edtBarSit_Internalname = "BARSIT" ;
      edtBarFecGen_Internalname = "BARFECGEN" ;
      edtBarFecCli_Internalname = "BARFECCLI" ;
      edtBarFecFpr_Internalname = "BARFECFPR" ;
      edtBarFecSal_Internalname = "BARFECSAL" ;
      edtBarFasCod_Internalname = "BARFASCOD" ;
      edtBarFasSig_Internalname = "BARFASSIG" ;
      edtBarAlbUlti_Internalname = "BARALBULTI" ;
      edtBarAlbFact_Internalname = "BARALBFACT" ;
      edtBarGirar_Internalname = "BARGIRAR" ;
      edtBarAcaAnh_Internalname = "BARACAANH" ;
      edtBarCuadern_Internalname = "BARCUADERN" ;
      edtBarProPerI_Internalname = "BARPROPERI" ;
      edtBarNormas_Internalname = "BARNORMAS" ;
      edtDisUsrCod_Internalname = "DISUSRCOD" ;
      edtavTotvaluebarkgm_Internalname = "vTOTVALUEBARKGM" ;
      edtavTotvaluebarmtr_Internalname = "vTOTVALUEBARMTR" ;
      edtavTotvaluebarpie_Internalname = "vTOTVALUEBARPIE" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavBartipart_Internalname = "vBARTIPART" ;
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
      edtavDdo_barfecgenauxdate_Internalname = "vDDO_BARFECGENAUXDATE" ;
      divDdo_barfecgenauxdates_Internalname = "DDO_BARFECGENAUXDATES" ;
      edtavDdo_barfeccliauxdate_Internalname = "vDDO_BARFECCLIAUXDATE" ;
      divDdo_barfeccliauxdates_Internalname = "DDO_BARFECCLIAUXDATES" ;
      edtavDdo_barfecfprauxdate_Internalname = "vDDO_BARFECFPRAUXDATE" ;
      divDdo_barfecfprauxdates_Internalname = "DDO_BARFECFPRAUXDATES" ;
      edtavDdo_barfecsalauxdate_Internalname = "vDDO_BARFECSALAUXDATE" ;
      divDdo_barfecsalauxdates_Internalname = "DDO_BARFECSALAUXDATES" ;
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
      edtDisUsrCod_Jsonclick = "" ;
      edtBarNormas_Jsonclick = "" ;
      edtBarProPerI_Jsonclick = "" ;
      edtBarCuadern_Jsonclick = "" ;
      edtBarAcaAnh_Jsonclick = "" ;
      edtBarGirar_Jsonclick = "" ;
      edtBarAlbFact_Jsonclick = "" ;
      edtBarAlbUlti_Jsonclick = "" ;
      edtBarFasSig_Jsonclick = "" ;
      edtBarFasCod_Jsonclick = "" ;
      edtBarFecSal_Jsonclick = "" ;
      edtBarFecFpr_Jsonclick = "" ;
      edtBarFecCli_Jsonclick = "" ;
      edtBarFecGen_Jsonclick = "" ;
      edtBarSit_Jsonclick = "" ;
      edtBarPie_Jsonclick = "" ;
      edtBarMtr_Jsonclick = "" ;
      edtBarKgm_Jsonclick = "" ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarColNum_Jsonclick = "" ;
      edtBarColNom_Jsonclick = "" ;
      edtBarTipArtD_Jsonclick = "" ;
      edtBarTipArt_Jsonclick = "" ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSer_Jsonclick = "" ;
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtBarDisNum_Jsonclick = "" ;
      edtBarAgrEst_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvaluebarpie_Jsonclick = "" ;
      edtavTotvaluebarpie_Enabled = 1 ;
      edtavTotvaluebarmtr_Jsonclick = "" ;
      edtavTotvaluebarmtr_Enabled = 1 ;
      edtavTotvaluebarkgm_Jsonclick = "" ;
      edtavTotvaluebarkgm_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_barfecsalauxdate_Jsonclick = "" ;
      edtavDdo_barfecfprauxdate_Jsonclick = "" ;
      edtavDdo_barfeccliauxdate_Jsonclick = "" ;
      edtavDdo_barfecgenauxdate_Jsonclick = "" ;
      edtavCod_idtx_Jsonclick = "" ;
      edtavCod_idtx_Visible = 1 ;
      edtavBartipartto_Jsonclick = "" ;
      edtavBartipartto_Visible = 1 ;
      edtavBartipart_Jsonclick = "" ;
      edtavBartipart_Visible = 1 ;
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
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 1 ;
      edtavBarserto_Jsonclick = "" ;
      edtavBarserto_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavBarnumclito_Jsonclick = "" ;
      edtavBarnumclito_Enabled = 1 ;
      edtavBarnomclito_Jsonclick = "" ;
      edtavBarnomclito_Enabled = 1 ;
      edtavBarnumcli_Jsonclick = "" ;
      edtavBarnumcli_Enabled = 1 ;
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Enabled = 1 ;
      edtavBarcolnumto_Jsonclick = "" ;
      edtavBarcolnumto_Enabled = 1 ;
      edtavBarcolnomto_Jsonclick = "" ;
      edtavBarcolnomto_Enabled = 1 ;
      edtavBarcolnum_Jsonclick = "" ;
      edtavBarcolnum_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarfecsalto_Jsonclick = "" ;
      edtavBarfecsalto_Enabled = 1 ;
      edtavBarfecsal_Jsonclick = "" ;
      edtavBarfecsal_Enabled = 1 ;
      edtavBarfecfprto_Jsonclick = "" ;
      edtavBarfecfprto_Enabled = 1 ;
      edtavBarfecfpr_Jsonclick = "" ;
      edtavBarfecfpr_Enabled = 1 ;
      edtavBarfecclito_Jsonclick = "" ;
      edtavBarfecclito_Enabled = 1 ;
      edtavBarfeccli_Jsonclick = "" ;
      edtavBarfeccli_Enabled = 1 ;
      edtavBarfecgento_Jsonclick = "" ;
      edtavBarfecgento_Enabled = 1 ;
      edtavBarfecgen_Jsonclick = "" ;
      edtavBarfecgen_Enabled = 1 ;
      edtavBarsitto_Jsonclick = "" ;
      edtavBarsitto_Enabled = 1 ;
      edtavBarsit_Jsonclick = "" ;
      edtavBarsit_Enabled = 1 ;
      edtavBardisnumto_Jsonclick = "" ;
      edtavBardisnumto_Enabled = 1 ;
      edtavBardisnum_Jsonclick = "" ;
      edtavBardisnum_Enabled = 1 ;
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
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
      Ddo_grid_Datalistproc = "Produccion.Test_v01GetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|||||" ;
      Ddo_grid_Includedatalist = "||T|T||T|T|T|T||T|||||" ;
      Ddo_grid_Filterisrange = "T|T|||T|||||T||T||||" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Character|Numeric|Character|Character|Character|Character|Numeric|Character|Numeric|Date|Date|Date|Date" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17" ;
      Ddo_grid_Columnids = "1:BarCod|2:BarCodReo|3:BarCodPar|5:BarDisNum|6:CliCod|7:CliNom|8:BarSer|9:BarSerDsc|12:BarColNom|13:BarColNum|14:BarNomCli|18:BarSit|19:BarFecGen|20:BarFecCli|21:BarFecFpr|22:BarFecSal" ;
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
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Combo_cod_idtx_Emptyitemtext = "Todas" ;
      Combo_cod_idtx_Visible = GXutil.toBoolean( -1) ;
      Combo_cod_idtx_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable5_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Iconposition = "Right" ;
      Dvpanel_unnamedtable5_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Title = httpContext.getMessage( "Nº HDR", "") ;
      Dvpanel_unnamedtable5_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable5_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable5_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable5_Width = "100%" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Articulo", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Combo_bartipartto_Emptyitemtext = "Todos" ;
      Combo_bartipartto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_bartipart_Emptyitemtext = "Todos" ;
      Combo_bartipart_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Color", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Fechas", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Consulta de Produccion", "") );
      edtBarNormas_Visible = -1 ;
      edtBarCuadern_Visible = -1 ;
      edtBarAcaAnh_Visible = -1 ;
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
      cmbavMuestras.addItem("T", httpContext.getMessage( "Todo", ""), (short)(0));
      cmbavMuestras.addItem("N", httpContext.getMessage( "Nao AMOSTRAS", ""), (short)(0));
      cmbavMuestras.addItem("S", httpContext.getMessage( "Sim AMOSTRAS", ""), (short)(0));
      if ( cmbavMuestras.getItemCount() > 0 )
      {
         AV95Muestras = cmbavMuestras.getValidValue(AV95Muestras) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Muestras", AV95Muestras);
      }
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_221_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV61GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV61GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61GridActionGroup1), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV71BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV74BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV18BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV19BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV16BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV17BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV72BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV73BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV76BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV77BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV78BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV79BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV87BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV82BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV83BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV84BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV85BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV110BarSer',fld:'vBARSER',pic:''},{av:'AV111BarSerto',fld:'vBARSERTO',pic:''},{av:'AV90BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV91BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV92BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV96BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV97BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV98BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV94BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV68Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV101MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV63TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV65TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV67TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1427P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV71BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV74BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV18BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV19BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV16BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV17BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV72BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV73BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV76BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV77BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV78BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV79BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV87BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV82BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV83BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV84BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV85BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV110BarSer',fld:'vBARSER',pic:''},{av:'AV111BarSerto',fld:'vBARSERTO',pic:''},{av:'AV90BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV91BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV92BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV96BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV97BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV98BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV94BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV68Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV101MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1527P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV71BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV74BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV18BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV19BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV16BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV17BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV72BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV73BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV76BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV77BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV78BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV79BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV87BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV82BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV83BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV84BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV85BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV110BarSer',fld:'vBARSER',pic:''},{av:'AV111BarSerto',fld:'vBARSERTO',pic:''},{av:'AV90BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV91BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV92BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV96BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV97BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV98BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV94BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV68Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV101MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1627P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV71BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV74BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV18BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV19BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV16BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV17BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV72BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV73BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV76BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV77BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV78BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV79BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV87BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV82BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV83BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV84BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV85BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV110BarSer',fld:'vBARSER',pic:''},{av:'AV111BarSerto',fld:'vBARSERTO',pic:''},{av:'AV90BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV91BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV92BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV96BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV97BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV98BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV94BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV68Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV101MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2527P2',iparms:[{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV61GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2627P2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV61GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV71BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV74BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV18BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV19BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV16BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV17BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV72BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV73BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV76BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV77BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV78BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV79BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV87BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV82BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV83BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV84BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV85BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV110BarSer',fld:'vBARSER',pic:''},{av:'AV111BarSerto',fld:'vBARSERTO',pic:''},{av:'AV90BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV91BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV92BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV96BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV97BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV98BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV94BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV68Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV101MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV61GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV63TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV65TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV67TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE","{handler:'e1727P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV71BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV74BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV18BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV19BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV16BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV17BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV72BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV73BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV76BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV77BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV78BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV79BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV87BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV82BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV83BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV84BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV85BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV110BarSer',fld:'vBARSER',pic:''},{av:'AV111BarSerto',fld:'vBARSERTO',pic:''},{av:'AV90BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV91BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV92BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV96BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV97BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV98BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV94BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV68Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV101MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("SITUACIONFASES_MODAL.CLOSE",",oparms:[{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV63TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV65TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV67TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("CONSULTAALBARANSALIDA_MODAL.CLOSE","{handler:'e1827P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV71BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV74BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV18BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV19BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV16BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV17BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV72BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV73BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV76BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV77BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV78BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV79BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV87BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV82BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV83BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV84BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV85BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV110BarSer',fld:'vBARSER',pic:''},{av:'AV111BarSerto',fld:'vBARSERTO',pic:''},{av:'AV90BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV91BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV92BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV96BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV97BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV98BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV94BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV68Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV101MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("CONSULTAALBARANSALIDA_MODAL.CLOSE",",oparms:[{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV63TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV65TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV67TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("RECETAS_MODAL.CLOSE","{handler:'e1927P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV71BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV74BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV18BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV19BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV16BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV17BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV72BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV73BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV76BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV77BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV78BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV79BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV87BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV82BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV83BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV84BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV85BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV110BarSer',fld:'vBARSER',pic:''},{av:'AV111BarSerto',fld:'vBARSERTO',pic:''},{av:'AV90BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV91BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV92BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV96BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV97BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV98BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV94BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV68Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV101MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("RECETAS_MODAL.CLOSE",",oparms:[{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV63TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV65TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV67TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("PARTESPRODUCCION_MODAL.CLOSE","{handler:'e2027P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV71BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV74BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV18BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV19BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV16BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV17BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV72BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV73BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV76BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV77BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV78BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV79BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV87BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV82BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV83BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV84BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV85BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV110BarSer',fld:'vBARSER',pic:''},{av:'AV111BarSerto',fld:'vBARSERTO',pic:''},{av:'AV90BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV91BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV92BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV96BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV97BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV98BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV94BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV68Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV101MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("PARTESPRODUCCION_MODAL.CLOSE",",oparms:[{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV63TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV65TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV67TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("PIEZAS_MODAL.CLOSE","{handler:'e2127P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV71BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV74BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV18BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV19BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV16BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV17BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV72BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV73BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV76BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV77BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV78BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV79BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV87BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV82BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV83BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV84BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV85BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV110BarSer',fld:'vBARSER',pic:''},{av:'AV111BarSerto',fld:'vBARSERTO',pic:''},{av:'AV90BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV91BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV92BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV96BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV97BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV98BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV94BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV68Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV101MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("PIEZAS_MODAL.CLOSE",",oparms:[{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV63TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV65TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV67TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("AGRUPADAS_MODAL.CLOSE","{handler:'e2227P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV14CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV71BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV74BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV18BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV19BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV16BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV17BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV72BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV73BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV76BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV77BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV78BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV79BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV80BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV81BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV86BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV87BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV82BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV83BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV84BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV85BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV110BarSer',fld:'vBARSER',pic:''},{av:'AV111BarSerto',fld:'vBARSERTO',pic:''},{av:'AV90BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV91BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV92BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV96BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV97BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV98BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV94BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV46EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV21TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV22TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV23TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV24TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV25TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV26TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV27TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV28TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV29TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV30TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV31TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV32TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV33TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV34TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV35TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV36TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV55TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV56TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV57TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV58TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV59TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV60TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV49TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV88TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV53TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV118Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV68Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV101MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("AGRUPADAS_MODAL.CLOSE",",oparms:[{av:'AV43GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV44GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV62TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV64TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV66TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV63TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV65TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV67TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("COMBO_COD_IDTX.ONOPTIONCLICKED","{handler:'e1327P2',iparms:[{av:'Combo_cod_idtx_Selectedvalue_get',ctrl:'COMBO_COD_IDTX',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_COD_IDTX.ONOPTIONCLICKED",",oparms:[{av:'AV93Cod_Idtx',fld:'vCOD_IDTX',pic:''}]}");
      setEventMetadata("COMBO_BARTIPARTTO.ONOPTIONCLICKED","{handler:'e1227P2',iparms:[{av:'Combo_bartipartto_Selectedvalue_get',ctrl:'COMBO_BARTIPARTTO',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_BARTIPARTTO.ONOPTIONCLICKED",",oparms:[{av:'AV109BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'}]}");
      setEventMetadata("COMBO_BARTIPART.ONOPTIONCLICKED","{handler:'e1127P2',iparms:[{av:'Combo_bartipart_Selectedvalue_get',ctrl:'COMBO_BARTIPART',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_BARTIPART.ONOPTIONCLICKED",",oparms:[{av:'AV108BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARTIPART","{handler:'valid_Bartipart',iparms:[]");
      setEventMetadata("VALID_BARTIPART",",oparms:[]}");
      setEventMetadata("VALID_BARACAANH","{handler:'valid_Baracaanh',iparms:[]");
      setEventMetadata("VALID_BARACAANH",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Disusrcod',iparms:[]");
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
      Combo_cod_idtx_Selectedvalue_get = "" ;
      Combo_bartipartto_Selectedvalue_get = "" ;
      Combo_bartipart_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV71BarDisNum = "" ;
      AV74BarDisNumTo = "" ;
      AV16BarFecGen = GXutil.nullDate() ;
      AV17BarFecGenTo = GXutil.nullDate() ;
      AV72BarFecCli = GXutil.nullDate() ;
      AV73BarFecCliTo = GXutil.nullDate() ;
      AV76BarFecFpr = GXutil.nullDate() ;
      AV77BarFecFprto = GXutil.nullDate() ;
      AV78BarFecSal = GXutil.nullDate() ;
      AV79BarFecSalto = GXutil.nullDate() ;
      AV80BarColNom = "" ;
      AV86BarColNomto = "" ;
      AV82BarNomCli = "" ;
      AV84BarNomClito = "" ;
      AV110BarSer = "" ;
      AV111BarSerto = "" ;
      AV92BarCodPar = "" ;
      AV98BarCodParto = "" ;
      AV94BarGirar = "" ;
      AV93Cod_Idtx = "" ;
      AV46EmprCod = "" ;
      AV25TFBarCodPar = "" ;
      AV26TFBarCodPar_Sel = "" ;
      AV27TFBarDisNum = "" ;
      AV28TFBarDisNum_Sel = "" ;
      AV31TFCliNom = "" ;
      AV32TFCliNom_Sel = "" ;
      AV33TFBarSer = "" ;
      AV34TFBarSer_Sel = "" ;
      AV35TFBarSerDsc = "" ;
      AV36TFBarSerDsc_Sel = "" ;
      AV55TFBarColNom = "" ;
      AV56TFBarColNom_Sel = "" ;
      AV59TFBarNomCli = "" ;
      AV60TFBarNomCli_Sel = "" ;
      AV39TFBarFecGen = GXutil.nullDate() ;
      AV49TFBarFecCli = GXutil.nullDate() ;
      AV88TFBarFecFpr = GXutil.nullDate() ;
      AV53TFBarFecSal = GXutil.nullDate() ;
      AV118Pgmname = "" ;
      AV62TotBarKgm = DecimalUtil.ZERO ;
      AV64TotBarMtr = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV112BarTipArt_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV113BarTipArtto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV99Cod_Idtx_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV41DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV107BarplfTo = "" ;
      AV106Barplf = "" ;
      A365DisDes = "" ;
      A396EmprCod = "" ;
      A2829BarProPer = "" ;
      Combo_bartipart_Selectedvalue_set = "" ;
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
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_bartipart_Jsonclick = "" ;
      ucCombo_bartipart = new com.genexus.webpanels.GXUserControl();
      Combo_bartipart_Caption = "" ;
      lblTextblockcombo_bartipartto_Jsonclick = "" ;
      ucCombo_bartipartto = new com.genexus.webpanels.GXUserControl();
      Combo_bartipartto_Caption = "" ;
      ucDvpanel_unnamedtable5 = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_cod_idtx_Jsonclick = "" ;
      ucCombo_cod_idtx = new com.genexus.webpanels.GXUserControl();
      Combo_cod_idtx_Caption = "" ;
      AV95Muestras = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      AV40DDO_BarFecGenAuxDate = GXutil.nullDate() ;
      AV50DDO_BarFecCliAuxDate = GXutil.nullDate() ;
      AV89DDO_BarFecFprAuxDate = GXutil.nullDate() ;
      AV54DDO_BarFecSalAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A130BarCodPar = "" ;
      A120BarAgrEst = "" ;
      A143BarDisNum = "" ;
      A279CliNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A13711BarTipArtD = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A159BarFecGen = GXutil.nullDate() ;
      A155BarFecCli = GXutil.nullDate() ;
      A158BarFecFpr = GXutil.nullDate() ;
      A161BarFecSal = GXutil.nullDate() ;
      A151BarFasCod = "" ;
      A1955BarFasSig = "" ;
      A2454BarGirar = "" ;
      A13933BarCuadern = "" ;
      A14204BarProPerI = "" ;
      A13934BarNormas = "" ;
      A4348DisUsrCod = "" ;
      scmdbuf = "" ;
      lV123Produccion_test_v01ds_5_tfbarcodpar = "" ;
      lV125Produccion_test_v01ds_7_tfbardisnum = "" ;
      lV129Produccion_test_v01ds_11_tfclinom = "" ;
      lV131Produccion_test_v01ds_13_tfbarser = "" ;
      lV133Produccion_test_v01ds_15_tfbarserdsc = "" ;
      lV135Produccion_test_v01ds_17_tfbarcolnom = "" ;
      lV139Produccion_test_v01ds_21_tfbarnomcli = "" ;
      AV124Produccion_test_v01ds_6_tfbarcodpar_sel = "" ;
      AV123Produccion_test_v01ds_5_tfbarcodpar = "" ;
      AV126Produccion_test_v01ds_8_tfbardisnum_sel = "" ;
      AV125Produccion_test_v01ds_7_tfbardisnum = "" ;
      AV130Produccion_test_v01ds_12_tfclinom_sel = "" ;
      AV129Produccion_test_v01ds_11_tfclinom = "" ;
      AV132Produccion_test_v01ds_14_tfbarser_sel = "" ;
      AV131Produccion_test_v01ds_13_tfbarser = "" ;
      AV134Produccion_test_v01ds_16_tfbarserdsc_sel = "" ;
      AV133Produccion_test_v01ds_15_tfbarserdsc = "" ;
      AV136Produccion_test_v01ds_18_tfbarcolnom_sel = "" ;
      AV135Produccion_test_v01ds_17_tfbarcolnom = "" ;
      AV140Produccion_test_v01ds_22_tfbarnomcli_sel = "" ;
      AV139Produccion_test_v01ds_21_tfbarnomcli = "" ;
      AV143Produccion_test_v01ds_25_tfbarfecgen = GXutil.nullDate() ;
      AV144Produccion_test_v01ds_26_tfbarfeccli = GXutil.nullDate() ;
      AV145Produccion_test_v01ds_27_tfbarfecfpr = GXutil.nullDate() ;
      AV146Produccion_test_v01ds_28_tfbarfecsal = GXutil.nullDate() ;
      H027P9_A9713Tb1_Cod = new short[1] ;
      H027P9_A1235BarNumCli = new int[1] ;
      H027P9_A4348DisUsrCod = new String[] {""} ;
      H027P9_A4466BarAcaAnh = new short[1] ;
      H027P9_A2454BarGirar = new String[] {""} ;
      H027P9_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H027P9_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H027P9_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H027P9_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H027P9_A213BarSit = new byte[1] ;
      H027P9_A1234BarNomCli = new String[] {""} ;
      H027P9_A136BarColNum = new int[1] ;
      H027P9_A135BarColNom = new String[] {""} ;
      H027P9_A13711BarTipArtD = new String[] {""} ;
      H027P9_n13711BarTipArtD = new boolean[] {false} ;
      H027P9_A217BarTipArt = new short[1] ;
      H027P9_n217BarTipArt = new boolean[] {false} ;
      H027P9_A1652BarSerDsc = new String[] {""} ;
      H027P9_A212BarSer = new String[] {""} ;
      H027P9_A279CliNom = new String[] {""} ;
      H027P9_A252CliCod = new int[1] ;
      H027P9_n252CliCod = new boolean[] {false} ;
      H027P9_A143BarDisNum = new String[] {""} ;
      H027P9_A120BarAgrEst = new String[] {""} ;
      H027P9_A13933BarCuadern = new String[] {""} ;
      H027P9_n13933BarCuadern = new boolean[] {false} ;
      H027P9_A1955BarFasSig = new String[] {""} ;
      H027P9_n1955BarFasSig = new boolean[] {false} ;
      H027P9_A151BarFasCod = new String[] {""} ;
      H027P9_n151BarFasCod = new boolean[] {false} ;
      H027P9_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027P9_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027P9_A199BarPie1 = new short[1] ;
      H027P9_A365DisDes = new String[] {""} ;
      H027P9_A898BarPieNDes = new int[1] ;
      H027P9_A130BarCodPar = new String[] {""} ;
      H027P9_A132BarCodReo = new byte[1] ;
      H027P9_A129BarCod = new int[1] ;
      H027P9_A2829BarProPer = new String[] {""} ;
      H027P9_A361DisCod = new int[1] ;
      H027P9_A396EmprCod = new String[] {""} ;
      GXv_int2 = new long[1] ;
      GXv_int4 = new int[1] ;
      H027P17_AGRID_nRecordCount = new long[1] ;
      AV63TotValueBarKgm = "" ;
      AV65TotValueBarMtr = "" ;
      AV67TotValueBarPie = "" ;
      hsh = "" ;
      AV45Station = "" ;
      AV47EmprNom = "" ;
      AV48UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext13 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_int12 = new byte[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV20Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char22 = "" ;
      GXv_char23 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char8 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char7 = new String[1] ;
      GXt_char5 = "" ;
      GXv_char6 = new String[1] ;
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H027P19_A217BarTipArt = new short[1] ;
      H027P19_n217BarTipArt = new boolean[] {false} ;
      H027P19_A2454BarGirar = new String[] {""} ;
      H027P19_A2829BarProPer = new String[] {""} ;
      H027P19_A1235BarNumCli = new int[1] ;
      H027P19_A396EmprCod = new String[] {""} ;
      H027P19_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H027P19_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H027P19_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H027P19_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H027P19_A213BarSit = new byte[1] ;
      H027P19_A1234BarNomCli = new String[] {""} ;
      H027P19_A136BarColNum = new int[1] ;
      H027P19_A135BarColNom = new String[] {""} ;
      H027P19_A1652BarSerDsc = new String[] {""} ;
      H027P19_A212BarSer = new String[] {""} ;
      H027P19_A279CliNom = new String[] {""} ;
      H027P19_A252CliCod = new int[1] ;
      H027P19_n252CliCod = new boolean[] {false} ;
      H027P19_A143BarDisNum = new String[] {""} ;
      H027P19_A130BarCodPar = new String[] {""} ;
      H027P19_A132BarCodReo = new byte[1] ;
      H027P19_A129BarCod = new int[1] ;
      H027P19_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027P19_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027P19_A199BarPie1 = new short[1] ;
      H027P19_A365DisDes = new String[] {""} ;
      H027P19_A898BarPieNDes = new int[1] ;
      H027P20_A396EmprCod = new String[] {""} ;
      H027P20_A13810Dsc_IdtxID = new String[] {""} ;
      H027P20_A10887Cod_Idtx = new String[] {""} ;
      H027P20_A10888Dsc_Idtx = new String[] {""} ;
      H027P20_n10888Dsc_Idtx = new boolean[] {false} ;
      A13810Dsc_IdtxID = "" ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV100Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H027P21_A396EmprCod = new String[] {""} ;
      H027P21_A13788TipArtCodD = new String[] {""} ;
      H027P21_A829TipArtCod = new short[1] ;
      H027P21_A830TipArtDsc = new String[] {""} ;
      H027P21_n830TipArtDsc = new boolean[] {false} ;
      H027P21_A6014TipArtDsc2 = new String[] {""} ;
      H027P21_n6014TipArtDsc2 = new boolean[] {false} ;
      A13788TipArtCodD = "" ;
      A830TipArtDsc = "" ;
      A6014TipArtDsc2 = "" ;
      H027P22_A396EmprCod = new String[] {""} ;
      H027P22_A13788TipArtCodD = new String[] {""} ;
      H027P22_A829TipArtCod = new short[1] ;
      H027P22_A830TipArtDsc = new String[] {""} ;
      H027P22_n830TipArtDsc = new boolean[] {false} ;
      H027P22_A6014TipArtDsc2 = new String[] {""} ;
      H027P22_n6014TipArtDsc2 = new boolean[] {false} ;
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
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.test_v01__default(),
         new Object[] {
             new Object[] {
            H027P9_A9713Tb1_Cod, H027P9_A1235BarNumCli, H027P9_A4348DisUsrCod, H027P9_A4466BarAcaAnh, H027P9_A2454BarGirar, H027P9_A161BarFecSal, H027P9_A158BarFecFpr, H027P9_A155BarFecCli, H027P9_A159BarFecGen, H027P9_A213BarSit,
            H027P9_A1234BarNomCli, H027P9_A136BarColNum, H027P9_A135BarColNom, H027P9_A13711BarTipArtD, H027P9_n13711BarTipArtD, H027P9_A217BarTipArt, H027P9_n217BarTipArt, H027P9_A1652BarSerDsc, H027P9_A212BarSer, H027P9_A279CliNom,
            H027P9_A252CliCod, H027P9_n252CliCod, H027P9_A143BarDisNum, H027P9_A120BarAgrEst, H027P9_A13933BarCuadern, H027P9_n13933BarCuadern, H027P9_A1955BarFasSig, H027P9_n1955BarFasSig, H027P9_A151BarFasCod, H027P9_n151BarFasCod,
            H027P9_A184BarMtr, H027P9_A166BarKgm, H027P9_A199BarPie1, H027P9_A365DisDes, H027P9_A898BarPieNDes, H027P9_A130BarCodPar, H027P9_A132BarCodReo, H027P9_A129BarCod, H027P9_A2829BarProPer, H027P9_A361DisCod,
            H027P9_A396EmprCod
            }
            , new Object[] {
            H027P17_AGRID_nRecordCount
            }
            , new Object[] {
            H027P19_A217BarTipArt, H027P19_n217BarTipArt, H027P19_A2454BarGirar, H027P19_A2829BarProPer, H027P19_A1235BarNumCli, H027P19_A396EmprCod, H027P19_A161BarFecSal, H027P19_A158BarFecFpr, H027P19_A155BarFecCli, H027P19_A159BarFecGen,
            H027P19_A213BarSit, H027P19_A1234BarNomCli, H027P19_A136BarColNum, H027P19_A135BarColNom, H027P19_A1652BarSerDsc, H027P19_A212BarSer, H027P19_A279CliNom, H027P19_A252CliCod, H027P19_n252CliCod, H027P19_A143BarDisNum,
            H027P19_A130BarCodPar, H027P19_A132BarCodReo, H027P19_A129BarCod, H027P19_A166BarKgm, H027P19_A184BarMtr, H027P19_A199BarPie1, H027P19_A365DisDes, H027P19_A898BarPieNDes
            }
            , new Object[] {
            H027P20_A396EmprCod, H027P20_A13810Dsc_IdtxID, H027P20_A10887Cod_Idtx, H027P20_A10888Dsc_Idtx, H027P20_n10888Dsc_Idtx
            }
            , new Object[] {
            H027P21_A396EmprCod, H027P21_A13788TipArtCodD, H027P21_A829TipArtCod, H027P21_A830TipArtDsc, H027P21_n830TipArtDsc, H027P21_A6014TipArtDsc2, H027P21_n6014TipArtDsc2
            }
            , new Object[] {
            H027P22_A396EmprCod, H027P22_A13788TipArtCodD, H027P22_A829TipArtCod, H027P22_A830TipArtDsc, H027P22_n830TipArtDsc, H027P22_A6014TipArtDsc2, H027P22_n6014TipArtDsc2
            }
         }
      );
      AV118Pgmname = "Produccion.Test_v01" ;
      /* GeneXus formulas. */
      AV118Pgmname = "Produccion.Test_v01" ;
      Gx_err = (short)(0) ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      edtavTotvaluebarmtr_Enabled = 0 ;
      edtavTotvaluebarpie_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV18BarSit ;
   private byte AV19BarSitTo ;
   private byte AV91BarCodReo ;
   private byte AV97BarCodReoto ;
   private byte AV23TFBarCodReo ;
   private byte AV24TFBarCodReo_To ;
   private byte AV37TFBarSit ;
   private byte AV38TFBarSit_To ;
   private byte gxajaxcallmode ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV121Produccion_test_v01ds_3_tfbarcodreo ;
   private byte AV122Produccion_test_v01ds_4_tfbarcodreo_to ;
   private byte AV141Produccion_test_v01ds_23_tfbarsit ;
   private byte AV142Produccion_test_v01ds_24_tfbarsit_to ;
   private byte GXt_int11 ;
   private byte GXv_int12[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV108BarTipArt ;
   private short AV109BarTipArtto ;
   private short AV12OrderedBy ;
   private short AV68Moda21 ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV61GridActionGroup1 ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV69cuaderno ;
   private short AV70STNORM ;
   private short A829TipArtCod ;
   private int edtBarAcaAnh_Visible ;
   private int edtBarCuadern_Visible ;
   private int edtBarNormas_Visible ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_221 ;
   private int nGXsfl_221_idx=1 ;
   private int AV14CliCod ;
   private int AV15CliCodto ;
   private int AV81BarColNum ;
   private int AV87BarColNumto ;
   private int AV83BarNumCli ;
   private int AV85BarNumClito ;
   private int AV90BarCod ;
   private int AV96BarCodto ;
   private int AV21TFBarCod ;
   private int AV22TFBarCod_To ;
   private int AV29TFCliCod ;
   private int AV30TFCliCod_To ;
   private int AV57TFBarColNum ;
   private int AV58TFBarColNum_To ;
   private int AV101MacCod ;
   private int A1235BarNumCli ;
   private int A898BarPieNDes ;
   private int A361DisCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClicodto_Enabled ;
   private int edtavBardisnum_Enabled ;
   private int edtavBardisnumto_Enabled ;
   private int edtavBarsit_Enabled ;
   private int edtavBarsitto_Enabled ;
   private int edtavBarfecgen_Enabled ;
   private int edtavBarfecgento_Enabled ;
   private int edtavBarfeccli_Enabled ;
   private int edtavBarfecclito_Enabled ;
   private int edtavBarfecfpr_Enabled ;
   private int edtavBarfecfprto_Enabled ;
   private int edtavBarfecsal_Enabled ;
   private int edtavBarfecsalto_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBarcolnomto_Enabled ;
   private int edtavBarcolnumto_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int edtavBarnumcli_Enabled ;
   private int edtavBarnomclito_Enabled ;
   private int edtavBarnumclito_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserto_Enabled ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavBarcodto_Enabled ;
   private int edtavBarcodreoto_Enabled ;
   private int edtavBarcodparto_Enabled ;
   private int edtavBargirar_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavBartipart_Visible ;
   private int edtavBartipartto_Visible ;
   private int edtavCod_idtx_Visible ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int A13935BarAlbFact ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluebarkgm_Enabled ;
   private int edtavTotvaluebarmtr_Enabled ;
   private int edtavTotvaluebarpie_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV119Produccion_test_v01ds_1_tfbarcod ;
   private int AV120Produccion_test_v01ds_2_tfbarcod_to ;
   private int AV127Produccion_test_v01ds_9_tfclicod ;
   private int AV128Produccion_test_v01ds_10_tfclicod_to ;
   private int AV137Produccion_test_v01ds_19_tfbarcolnum ;
   private int AV138Produccion_test_v01ds_20_tfbarcolnum_to ;
   private int GXt_int3 ;
   private int GXv_int4[] ;
   private int AV42PageToGo ;
   private int AV147GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV66TotBarPie ;
   private long AV43GridCurrentPage ;
   private long AV44GridPageCount ;
   private long A13930BarAlbUlti ;
   private long GRID_nCurrentRecord ;
   private long GXt_int1 ;
   private long GXv_int2[] ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV62TotBarKgm ;
   private java.math.BigDecimal AV64TotBarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Combo_cod_idtx_Selectedvalue_get ;
   private String Combo_bartipartto_Selectedvalue_get ;
   private String Combo_bartipart_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_221_idx="0001" ;
   private String edtBarAcaAnh_Internalname ;
   private String edtBarCuadern_Internalname ;
   private String edtBarNormas_Internalname ;
   private String AV71BarDisNum ;
   private String AV74BarDisNumTo ;
   private String AV80BarColNom ;
   private String AV86BarColNomto ;
   private String AV82BarNomCli ;
   private String AV84BarNomClito ;
   private String AV110BarSer ;
   private String AV111BarSerto ;
   private String AV92BarCodPar ;
   private String AV98BarCodParto ;
   private String AV94BarGirar ;
   private String AV93Cod_Idtx ;
   private String AV46EmprCod ;
   private String AV25TFBarCodPar ;
   private String AV26TFBarCodPar_Sel ;
   private String AV27TFBarDisNum ;
   private String AV28TFBarDisNum_Sel ;
   private String AV31TFCliNom ;
   private String AV32TFCliNom_Sel ;
   private String AV33TFBarSer ;
   private String AV34TFBarSer_Sel ;
   private String AV35TFBarSerDsc ;
   private String AV36TFBarSerDsc_Sel ;
   private String AV55TFBarColNom ;
   private String AV56TFBarColNom_Sel ;
   private String AV59TFBarNomCli ;
   private String AV60TFBarNomCli_Sel ;
   private String AV118Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV107BarplfTo ;
   private String AV106Barplf ;
   private String A365DisDes ;
   private String A396EmprCod ;
   private String A2829BarProPer ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Combo_bartipart_Cls ;
   private String Combo_bartipart_Selectedvalue_set ;
   private String Combo_bartipart_Emptyitemtext ;
   private String Combo_bartipartto_Cls ;
   private String Combo_bartipartto_Selectedvalue_set ;
   private String Combo_bartipartto_Emptyitemtext ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Dvpanel_unnamedtable5_Width ;
   private String Dvpanel_unnamedtable5_Cls ;
   private String Dvpanel_unnamedtable5_Title ;
   private String Dvpanel_unnamedtable5_Iconposition ;
   private String Combo_cod_idtx_Cls ;
   private String Combo_cod_idtx_Selectedvalue_set ;
   private String Combo_cod_idtx_Emptyitemtext ;
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
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavClicod_Internalname ;
   private String TempTags ;
   private String edtavClicod_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String edtavBardisnum_Internalname ;
   private String edtavBardisnum_Jsonclick ;
   private String edtavBardisnumto_Internalname ;
   private String edtavBardisnumto_Jsonclick ;
   private String edtavBarsit_Internalname ;
   private String edtavBarsit_Jsonclick ;
   private String edtavBarsitto_Internalname ;
   private String edtavBarsitto_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavBarfecgen_Internalname ;
   private String edtavBarfecgen_Jsonclick ;
   private String edtavBarfecgento_Internalname ;
   private String edtavBarfecgento_Jsonclick ;
   private String edtavBarfeccli_Internalname ;
   private String edtavBarfeccli_Jsonclick ;
   private String edtavBarfecclito_Internalname ;
   private String edtavBarfecclito_Jsonclick ;
   private String edtavBarfecfpr_Internalname ;
   private String edtavBarfecfpr_Jsonclick ;
   private String edtavBarfecfprto_Internalname ;
   private String edtavBarfecfprto_Jsonclick ;
   private String edtavBarfecsal_Internalname ;
   private String edtavBarfecsal_Jsonclick ;
   private String edtavBarfecsalto_Internalname ;
   private String edtavBarfecsalto_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable11_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBarcolnomto_Internalname ;
   private String edtavBarcolnomto_Jsonclick ;
   private String edtavBarcolnumto_Internalname ;
   private String edtavBarcolnumto_Jsonclick ;
   private String divUnnamedtable12_Internalname ;
   private String edtavBarnomcli_Internalname ;
   private String edtavBarnomcli_Jsonclick ;
   private String edtavBarnumcli_Internalname ;
   private String edtavBarnumcli_Jsonclick ;
   private String edtavBarnomclito_Internalname ;
   private String edtavBarnomclito_Jsonclick ;
   private String edtavBarnumclito_Internalname ;
   private String edtavBarnumclito_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserto_Internalname ;
   private String edtavBarserto_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String divTablesplittedbartipart_Internalname ;
   private String lblTextblockcombo_bartipart_Internalname ;
   private String lblTextblockcombo_bartipart_Jsonclick ;
   private String Combo_bartipart_Caption ;
   private String Combo_bartipart_Internalname ;
   private String divTablesplittedbartipartto_Internalname ;
   private String lblTextblockcombo_bartipartto_Internalname ;
   private String lblTextblockcombo_bartipartto_Jsonclick ;
   private String Combo_bartipartto_Caption ;
   private String Combo_bartipartto_Internalname ;
   private String Dvpanel_unnamedtable5_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtable8_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavBarcodto_Internalname ;
   private String edtavBarcodto_Jsonclick ;
   private String edtavBarcodreoto_Internalname ;
   private String edtavBarcodreoto_Jsonclick ;
   private String edtavBarcodparto_Internalname ;
   private String edtavBarcodparto_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
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
   private String AV95Muestras ;
   private String divUnnamedtable7_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavBartipart_Internalname ;
   private String edtavBartipart_Jsonclick ;
   private String edtavBartipartto_Internalname ;
   private String edtavBartipartto_Jsonclick ;
   private String edtavCod_idtx_Internalname ;
   private String edtavCod_idtx_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String divDdo_barfecgenauxdates_Internalname ;
   private String edtavDdo_barfecgenauxdate_Internalname ;
   private String edtavDdo_barfecgenauxdate_Jsonclick ;
   private String divDdo_barfeccliauxdates_Internalname ;
   private String edtavDdo_barfeccliauxdate_Internalname ;
   private String edtavDdo_barfeccliauxdate_Jsonclick ;
   private String divDdo_barfecfprauxdates_Internalname ;
   private String edtavDdo_barfecfprauxdate_Internalname ;
   private String edtavDdo_barfecfprauxdate_Jsonclick ;
   private String divDdo_barfecsalauxdates_Internalname ;
   private String edtavDdo_barfecsalauxdate_Internalname ;
   private String edtavDdo_barfecsalauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A120BarAgrEst ;
   private String edtBarAgrEst_Internalname ;
   private String A143BarDisNum ;
   private String edtBarDisNum_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String A212BarSer ;
   private String edtBarSer_Internalname ;
   private String A1652BarSerDsc ;
   private String edtBarSerDsc_Internalname ;
   private String edtBarTipArt_Internalname ;
   private String A13711BarTipArtD ;
   private String edtBarTipArtD_Internalname ;
   private String A135BarColNom ;
   private String edtBarColNom_Internalname ;
   private String edtBarColNum_Internalname ;
   private String A1234BarNomCli ;
   private String edtBarNomCli_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtBarMtr_Internalname ;
   private String edtBarPie_Internalname ;
   private String edtBarSit_Internalname ;
   private String edtBarFecGen_Internalname ;
   private String edtBarFecCli_Internalname ;
   private String edtBarFecFpr_Internalname ;
   private String edtBarFecSal_Internalname ;
   private String A151BarFasCod ;
   private String edtBarFasCod_Internalname ;
   private String A1955BarFasSig ;
   private String edtBarFasSig_Internalname ;
   private String edtBarAlbUlti_Internalname ;
   private String edtBarAlbFact_Internalname ;
   private String A2454BarGirar ;
   private String edtBarGirar_Internalname ;
   private String A13933BarCuadern ;
   private String A14204BarProPerI ;
   private String edtBarProPerI_Internalname ;
   private String A4348DisUsrCod ;
   private String edtDisUsrCod_Internalname ;
   private String edtavTotvaluebarkgm_Internalname ;
   private String edtavTotvaluebarmtr_Internalname ;
   private String edtavTotvaluebarpie_Internalname ;
   private String scmdbuf ;
   private String lV123Produccion_test_v01ds_5_tfbarcodpar ;
   private String lV125Produccion_test_v01ds_7_tfbardisnum ;
   private String lV129Produccion_test_v01ds_11_tfclinom ;
   private String lV131Produccion_test_v01ds_13_tfbarser ;
   private String lV133Produccion_test_v01ds_15_tfbarserdsc ;
   private String lV135Produccion_test_v01ds_17_tfbarcolnom ;
   private String lV139Produccion_test_v01ds_21_tfbarnomcli ;
   private String AV124Produccion_test_v01ds_6_tfbarcodpar_sel ;
   private String AV123Produccion_test_v01ds_5_tfbarcodpar ;
   private String AV126Produccion_test_v01ds_8_tfbardisnum_sel ;
   private String AV125Produccion_test_v01ds_7_tfbardisnum ;
   private String AV130Produccion_test_v01ds_12_tfclinom_sel ;
   private String AV129Produccion_test_v01ds_11_tfclinom ;
   private String AV132Produccion_test_v01ds_14_tfbarser_sel ;
   private String AV131Produccion_test_v01ds_13_tfbarser ;
   private String AV134Produccion_test_v01ds_16_tfbarserdsc_sel ;
   private String AV133Produccion_test_v01ds_15_tfbarserdsc ;
   private String AV136Produccion_test_v01ds_18_tfbarcolnom_sel ;
   private String AV135Produccion_test_v01ds_17_tfbarcolnom ;
   private String AV140Produccion_test_v01ds_22_tfbarnomcli_sel ;
   private String AV139Produccion_test_v01ds_21_tfbarnomcli ;
   private String hsh ;
   private String AV45Station ;
   private String AV47EmprNom ;
   private String AV48UsurCod ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char15 ;
   private String GXv_char8[] ;
   private String GXt_char14 ;
   private String GXv_char7[] ;
   private String GXt_char5 ;
   private String GXv_char6[] ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A830TipArtDsc ;
   private String A6014TipArtDsc2 ;
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
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarkgm_Jsonclick ;
   private String edtavTotvaluebarmtr_Jsonclick ;
   private String edtavTotvaluebarpie_Jsonclick ;
   private String sGXsfl_221_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtBarAgrEst_Jsonclick ;
   private String edtBarDisNum_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String edtBarTipArt_Jsonclick ;
   private String edtBarTipArtD_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String edtBarColNum_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String edtBarMtr_Jsonclick ;
   private String edtBarPie_Jsonclick ;
   private String edtBarSit_Jsonclick ;
   private String edtBarFecGen_Jsonclick ;
   private String edtBarFecCli_Jsonclick ;
   private String edtBarFecFpr_Jsonclick ;
   private String edtBarFecSal_Jsonclick ;
   private String edtBarFasCod_Jsonclick ;
   private String edtBarFasSig_Jsonclick ;
   private String edtBarAlbUlti_Jsonclick ;
   private String edtBarAlbFact_Jsonclick ;
   private String edtBarGirar_Jsonclick ;
   private String edtBarAcaAnh_Jsonclick ;
   private String edtBarCuadern_Jsonclick ;
   private String edtBarProPerI_Jsonclick ;
   private String edtBarNormas_Jsonclick ;
   private String edtDisUsrCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV16BarFecGen ;
   private java.util.Date AV17BarFecGenTo ;
   private java.util.Date AV72BarFecCli ;
   private java.util.Date AV73BarFecCliTo ;
   private java.util.Date AV76BarFecFpr ;
   private java.util.Date AV77BarFecFprto ;
   private java.util.Date AV78BarFecSal ;
   private java.util.Date AV79BarFecSalto ;
   private java.util.Date AV39TFBarFecGen ;
   private java.util.Date AV49TFBarFecCli ;
   private java.util.Date AV88TFBarFecFpr ;
   private java.util.Date AV53TFBarFecSal ;
   private java.util.Date AV40DDO_BarFecGenAuxDate ;
   private java.util.Date AV50DDO_BarFecCliAuxDate ;
   private java.util.Date AV89DDO_BarFecFprAuxDate ;
   private java.util.Date AV54DDO_BarFecSalAuxDate ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A161BarFecSal ;
   private java.util.Date AV143Produccion_test_v01ds_25_tfbarfecgen ;
   private java.util.Date AV144Produccion_test_v01ds_26_tfbarfeccli ;
   private java.util.Date AV145Produccion_test_v01ds_27_tfbarfecfpr ;
   private java.util.Date AV146Produccion_test_v01ds_28_tfbarfecsal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_221_Refreshing=false ;
   private boolean AV13OrderedDsc ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
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
   private boolean Combo_cod_idtx_Visible ;
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
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n13711BarTipArtD ;
   private boolean n151BarFasCod ;
   private boolean n1955BarFasSig ;
   private boolean n13933BarCuadern ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV75TempBoolean ;
   private boolean Cond_result ;
   private boolean n10888Dsc_Idtx ;
   private boolean n830TipArtDsc ;
   private boolean n6014TipArtDsc2 ;
   private String A13934BarNormas ;
   private String AV63TotValueBarKgm ;
   private String AV65TotValueBarMtr ;
   private String AV67TotValueBarPie ;
   private String A13810Dsc_IdtxID ;
   private String A13788TipArtCodD ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV20Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucCombo_bartipart ;
   private com.genexus.webpanels.GXUserControl ucCombo_bartipartto ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucCombo_cod_idtx ;
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
   private short[] H027P9_A9713Tb1_Cod ;
   private int[] H027P9_A1235BarNumCli ;
   private String[] H027P9_A4348DisUsrCod ;
   private short[] H027P9_A4466BarAcaAnh ;
   private String[] H027P9_A2454BarGirar ;
   private java.util.Date[] H027P9_A161BarFecSal ;
   private java.util.Date[] H027P9_A158BarFecFpr ;
   private java.util.Date[] H027P9_A155BarFecCli ;
   private java.util.Date[] H027P9_A159BarFecGen ;
   private byte[] H027P9_A213BarSit ;
   private String[] H027P9_A1234BarNomCli ;
   private int[] H027P9_A136BarColNum ;
   private String[] H027P9_A135BarColNom ;
   private String[] H027P9_A13711BarTipArtD ;
   private boolean[] H027P9_n13711BarTipArtD ;
   private short[] H027P9_A217BarTipArt ;
   private boolean[] H027P9_n217BarTipArt ;
   private String[] H027P9_A1652BarSerDsc ;
   private String[] H027P9_A212BarSer ;
   private String[] H027P9_A279CliNom ;
   private int[] H027P9_A252CliCod ;
   private boolean[] H027P9_n252CliCod ;
   private String[] H027P9_A143BarDisNum ;
   private String[] H027P9_A120BarAgrEst ;
   private String[] H027P9_A13933BarCuadern ;
   private boolean[] H027P9_n13933BarCuadern ;
   private String[] H027P9_A1955BarFasSig ;
   private boolean[] H027P9_n1955BarFasSig ;
   private String[] H027P9_A151BarFasCod ;
   private boolean[] H027P9_n151BarFasCod ;
   private java.math.BigDecimal[] H027P9_A184BarMtr ;
   private java.math.BigDecimal[] H027P9_A166BarKgm ;
   private short[] H027P9_A199BarPie1 ;
   private String[] H027P9_A365DisDes ;
   private int[] H027P9_A898BarPieNDes ;
   private String[] H027P9_A130BarCodPar ;
   private byte[] H027P9_A132BarCodReo ;
   private int[] H027P9_A129BarCod ;
   private String[] H027P9_A2829BarProPer ;
   private int[] H027P9_A361DisCod ;
   private String[] H027P9_A396EmprCod ;
   private long[] H027P17_AGRID_nRecordCount ;
   private short[] H027P19_A217BarTipArt ;
   private boolean[] H027P19_n217BarTipArt ;
   private String[] H027P19_A2454BarGirar ;
   private String[] H027P19_A2829BarProPer ;
   private int[] H027P19_A1235BarNumCli ;
   private String[] H027P19_A396EmprCod ;
   private java.util.Date[] H027P19_A161BarFecSal ;
   private java.util.Date[] H027P19_A158BarFecFpr ;
   private java.util.Date[] H027P19_A155BarFecCli ;
   private java.util.Date[] H027P19_A159BarFecGen ;
   private byte[] H027P19_A213BarSit ;
   private String[] H027P19_A1234BarNomCli ;
   private int[] H027P19_A136BarColNum ;
   private String[] H027P19_A135BarColNom ;
   private String[] H027P19_A1652BarSerDsc ;
   private String[] H027P19_A212BarSer ;
   private String[] H027P19_A279CliNom ;
   private int[] H027P19_A252CliCod ;
   private boolean[] H027P19_n252CliCod ;
   private String[] H027P19_A143BarDisNum ;
   private String[] H027P19_A130BarCodPar ;
   private byte[] H027P19_A132BarCodReo ;
   private int[] H027P19_A129BarCod ;
   private java.math.BigDecimal[] H027P19_A166BarKgm ;
   private java.math.BigDecimal[] H027P19_A184BarMtr ;
   private short[] H027P19_A199BarPie1 ;
   private String[] H027P19_A365DisDes ;
   private int[] H027P19_A898BarPieNDes ;
   private String[] H027P20_A396EmprCod ;
   private String[] H027P20_A13810Dsc_IdtxID ;
   private String[] H027P20_A10887Cod_Idtx ;
   private String[] H027P20_A10888Dsc_Idtx ;
   private boolean[] H027P20_n10888Dsc_Idtx ;
   private String[] H027P21_A396EmprCod ;
   private String[] H027P21_A13788TipArtCodD ;
   private short[] H027P21_A829TipArtCod ;
   private String[] H027P21_A830TipArtDsc ;
   private boolean[] H027P21_n830TipArtDsc ;
   private String[] H027P21_A6014TipArtDsc2 ;
   private boolean[] H027P21_n6014TipArtDsc2 ;
   private String[] H027P22_A396EmprCod ;
   private String[] H027P22_A13788TipArtCodD ;
   private short[] H027P22_A829TipArtCod ;
   private String[] H027P22_A830TipArtDsc ;
   private boolean[] H027P22_n830TipArtDsc ;
   private String[] H027P22_A6014TipArtDsc2 ;
   private boolean[] H027P22_n6014TipArtDsc2 ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV112BarTipArt_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV113BarTipArtto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV99Cod_Idtx_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext13[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV41DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV100Combo_DataItem ;
}

final  class test_v01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H027P9( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV119Produccion_test_v01ds_1_tfbarcod ,
                                          int AV120Produccion_test_v01ds_2_tfbarcod_to ,
                                          byte AV121Produccion_test_v01ds_3_tfbarcodreo ,
                                          byte AV122Produccion_test_v01ds_4_tfbarcodreo_to ,
                                          String AV124Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                          String AV123Produccion_test_v01ds_5_tfbarcodpar ,
                                          String AV126Produccion_test_v01ds_8_tfbardisnum_sel ,
                                          String AV125Produccion_test_v01ds_7_tfbardisnum ,
                                          int AV127Produccion_test_v01ds_9_tfclicod ,
                                          int AV128Produccion_test_v01ds_10_tfclicod_to ,
                                          String AV130Produccion_test_v01ds_12_tfclinom_sel ,
                                          String AV129Produccion_test_v01ds_11_tfclinom ,
                                          String AV132Produccion_test_v01ds_14_tfbarser_sel ,
                                          String AV131Produccion_test_v01ds_13_tfbarser ,
                                          String AV134Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                          String AV133Produccion_test_v01ds_15_tfbarserdsc ,
                                          String AV136Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                          String AV135Produccion_test_v01ds_17_tfbarcolnom ,
                                          int AV137Produccion_test_v01ds_19_tfbarcolnum ,
                                          int AV138Produccion_test_v01ds_20_tfbarcolnum_to ,
                                          String AV140Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                          String AV139Produccion_test_v01ds_21_tfbarnomcli ,
                                          byte AV141Produccion_test_v01ds_23_tfbarsit ,
                                          byte AV142Produccion_test_v01ds_24_tfbarsit_to ,
                                          java.util.Date AV143Produccion_test_v01ds_25_tfbarfecgen ,
                                          java.util.Date AV144Produccion_test_v01ds_26_tfbarfeccli ,
                                          java.util.Date AV145Produccion_test_v01ds_27_tfbarfecfpr ,
                                          java.util.Date AV146Produccion_test_v01ds_28_tfbarfecsal ,
                                          int AV14CliCod ,
                                          int AV15CliCodto ,
                                          String AV71BarDisNum ,
                                          String AV74BarDisNumTo ,
                                          java.util.Date AV16BarFecGen ,
                                          java.util.Date AV17BarFecGenTo ,
                                          java.util.Date AV72BarFecCli ,
                                          java.util.Date AV73BarFecCliTo ,
                                          java.util.Date AV78BarFecSal ,
                                          java.util.Date AV79BarFecSalto ,
                                          java.util.Date AV76BarFecFpr ,
                                          java.util.Date AV77BarFecFprto ,
                                          String AV80BarColNom ,
                                          String AV86BarColNomto ,
                                          int AV81BarColNum ,
                                          int AV87BarColNumto ,
                                          String AV82BarNomCli ,
                                          String AV84BarNomClito ,
                                          int AV83BarNumCli ,
                                          int AV85BarNumClito ,
                                          int AV90BarCod ,
                                          int AV96BarCodto ,
                                          byte AV91BarCodReo ,
                                          byte AV97BarCodReoto ,
                                          String AV92BarCodPar ,
                                          String AV98BarCodParto ,
                                          String AV93Cod_Idtx ,
                                          String AV94BarGirar ,
                                          short AV108BarTipArt ,
                                          short AV109BarTipArtto ,
                                          String AV110BarSer ,
                                          String AV111BarSerto ,
                                          int A129BarCod ,
                                          byte A132BarCodReo ,
                                          String A130BarCodPar ,
                                          String A143BarDisNum ,
                                          int A252CliCod ,
                                          String A279CliNom ,
                                          String A212BarSer ,
                                          String A1652BarSerDsc ,
                                          String A135BarColNom ,
                                          int A136BarColNum ,
                                          String A1234BarNomCli ,
                                          byte A213BarSit ,
                                          java.util.Date A159BarFecGen ,
                                          java.util.Date A155BarFecCli ,
                                          java.util.Date A158BarFecFpr ,
                                          java.util.Date A161BarFecSal ,
                                          int A1235BarNumCli ,
                                          String A2829BarProPer ,
                                          String A2454BarGirar ,
                                          short A217BarTipArt ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          byte AV18BarSit ,
                                          byte AV19BarSitTo ,
                                          String AV46EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[68];
      Object[] GXv_Object26 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T5.Tb1_Cod, T1.BarNumCli, T2.DisUsrCod, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli, T1.BarColNum," ;
      sSelectString += " T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T4.CliNom, T1.CliCod, T1.BarDisNum, T1.BarAgrEst, COALESCE( T5.Tb1_Dsc," ;
      sSelectString += " ' ') AS BarCuadern, COALESCE( T6.BarFasSig, ' ') AS BarFasSig, COALESCE( T7.BarFasSig, ' ') AS BarFasCod, COALESCE( T8.BarMtr, 0) AS BarMtr, COALESCE( T8.BarKgm," ;
      sSelectString += " 0) AS BarKgm, COALESCE( T8.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T8.BarPieNDes, 0) AS BarPieNDes, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.BarProPer, T1.DisCod," ;
      sSelectString += " T1.EmprCod" ;
      sFromString = " FROM (((((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod" ;
      sFromString += " = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod =" ;
      sFromString += " T1.BarAcaAnh) LEFT JOIN (SELECT MIN(T9.FasCod) AS BarFasSig, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM ((TXPBARFAS" ;
      sFromString += " T9 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo," ;
      sFromString += " BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) INNER JOIN (SELECT MIN(T12.BarOrdLin)" ;
      sFromString += " AS GXC2, COALESCE( T13.BarFasLin, 0) AS BarFasLin, T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar FROM (TXPBARFAS T12 LEFT JOIN (SELECT MAX(BarOrdLin) AS" ;
      sFromString += " BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T13 ON T13.EmprCod = T12.EmprCod" ;
      sFromString += " AND T13.BarCod = T12.BarCod AND T13.BarCodReo = T12.BarCodReo AND T13.BarCodPar = T12.BarCodPar) WHERE (T12.BarOrdLin >= 0) AND (T12.BarOrdLin > COALESCE( T13.BarFasLin," ;
      sFromString += " 0)) AND (T12.BarFasEst = 0) GROUP BY T13.BarFasLin, T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar ) T11 ON T11.EmprCod = T9.EmprCod AND T11.BarCod = T9.BarCod" ;
      sFromString += " AND T11.BarCodReo = T9.BarCodReo AND T11.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin = T11.GXC2) AND (T9.BarOrdLin >= 0) AND (T9.BarOrdLin > COALESCE( T10.BarFasLin," ;
      sFromString += " 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND" ;
      sFromString += " T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T9.FasCod) AS BarFasSig, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM" ;
      sFromString += " (TXPBARFAS T9 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC3, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo," ;
      sFromString += " BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin =" ;
      sFromString += " T10.GXC3) AND (T9.BarFasEst <> 0) GROUP BY T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod AND T7.BarCod = T1.BarCod AND T7.BarCodReo" ;
      sFromString += " = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet)" ;
      sFromString += " AS BarMtr, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T8 ON T8.EmprCod = T1.EmprCod AND T8.BarCod = T1.BarCod AND" ;
      sFromString += " T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV119Produccion_test_v01ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( ! (0==AV120Produccion_test_v01ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (0==AV121Produccion_test_v01ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! (0==AV122Produccion_test_v01ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Produccion_test_v01ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV123Produccion_test_v01ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Produccion_test_v01ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Produccion_test_v01ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV125Produccion_test_v01ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Produccion_test_v01ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (0==AV127Produccion_test_v01ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (0==AV128Produccion_test_v01ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Produccion_test_v01ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV129Produccion_test_v01ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Produccion_test_v01ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Produccion_test_v01ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV131Produccion_test_v01ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Produccion_test_v01ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Produccion_test_v01ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV133Produccion_test_v01ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Produccion_test_v01ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Produccion_test_v01ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV135Produccion_test_v01ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Produccion_test_v01ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (0==AV137Produccion_test_v01ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (0==AV138Produccion_test_v01ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Produccion_test_v01ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV139Produccion_test_v01ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Produccion_test_v01ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (0==AV141Produccion_test_v01ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (0==AV142Produccion_test_v01ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Produccion_test_v01ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Produccion_test_v01ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Produccion_test_v01ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV146Produccion_test_v01ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (0==AV14CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( ! (0==AV15CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71BarDisNum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73BarFecCliTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int25[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int25[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int25[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int25[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int25[44] = (byte)(1) ;
      }
      if ( ! (0==AV81BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int25[45] = (byte)(1) ;
      }
      if ( ! (0==AV87BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int25[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int25[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int25[48] = (byte)(1) ;
      }
      if ( ! (0==AV83BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int25[49] = (byte)(1) ;
      }
      if ( ! (0==AV85BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int25[50] = (byte)(1) ;
      }
      if ( ! (0==AV90BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int25[51] = (byte)(1) ;
      }
      if ( ! (0==AV96BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int25[52] = (byte)(1) ;
      }
      if ( ! (0==AV91BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int25[53] = (byte)(1) ;
      }
      if ( ! (0==AV97BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int25[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92BarCodPar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int25[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int25[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int25[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int25[58] = (byte)(1) ;
      }
      if ( ! (0==AV108BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int25[59] = (byte)(1) ;
      }
      if ( ! (0==AV109BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int25[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int25[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int25[62] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.CliCod, T1.BarDisNum, T1.BarFecGen" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarCodReo" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarCodReo DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarCodPar" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarCodPar DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarDisNum" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarDisNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.CliCod" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.CliCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T4.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T4.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarSer" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarSer DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarSerDsc" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarSerDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarColNom" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarColNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarColNum" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarColNum DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarNomCli" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarNomCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarSit" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarSit DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFecGen" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFecGen DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFecCli" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFecCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFecFpr" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFecFpr DESC" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.BarFecSal" ;
      }
      else if ( ( AV12OrderedBy == 17 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.BarFecSal DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
   }

   protected Object[] conditional_H027P17( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV119Produccion_test_v01ds_1_tfbarcod ,
                                           int AV120Produccion_test_v01ds_2_tfbarcod_to ,
                                           byte AV121Produccion_test_v01ds_3_tfbarcodreo ,
                                           byte AV122Produccion_test_v01ds_4_tfbarcodreo_to ,
                                           String AV124Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                           String AV123Produccion_test_v01ds_5_tfbarcodpar ,
                                           String AV126Produccion_test_v01ds_8_tfbardisnum_sel ,
                                           String AV125Produccion_test_v01ds_7_tfbardisnum ,
                                           int AV127Produccion_test_v01ds_9_tfclicod ,
                                           int AV128Produccion_test_v01ds_10_tfclicod_to ,
                                           String AV130Produccion_test_v01ds_12_tfclinom_sel ,
                                           String AV129Produccion_test_v01ds_11_tfclinom ,
                                           String AV132Produccion_test_v01ds_14_tfbarser_sel ,
                                           String AV131Produccion_test_v01ds_13_tfbarser ,
                                           String AV134Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                           String AV133Produccion_test_v01ds_15_tfbarserdsc ,
                                           String AV136Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                           String AV135Produccion_test_v01ds_17_tfbarcolnom ,
                                           int AV137Produccion_test_v01ds_19_tfbarcolnum ,
                                           int AV138Produccion_test_v01ds_20_tfbarcolnum_to ,
                                           String AV140Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                           String AV139Produccion_test_v01ds_21_tfbarnomcli ,
                                           byte AV141Produccion_test_v01ds_23_tfbarsit ,
                                           byte AV142Produccion_test_v01ds_24_tfbarsit_to ,
                                           java.util.Date AV143Produccion_test_v01ds_25_tfbarfecgen ,
                                           java.util.Date AV144Produccion_test_v01ds_26_tfbarfeccli ,
                                           java.util.Date AV145Produccion_test_v01ds_27_tfbarfecfpr ,
                                           java.util.Date AV146Produccion_test_v01ds_28_tfbarfecsal ,
                                           int AV14CliCod ,
                                           int AV15CliCodto ,
                                           String AV71BarDisNum ,
                                           String AV74BarDisNumTo ,
                                           java.util.Date AV16BarFecGen ,
                                           java.util.Date AV17BarFecGenTo ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCliTo ,
                                           java.util.Date AV78BarFecSal ,
                                           java.util.Date AV79BarFecSalto ,
                                           java.util.Date AV76BarFecFpr ,
                                           java.util.Date AV77BarFecFprto ,
                                           String AV80BarColNom ,
                                           String AV86BarColNomto ,
                                           int AV81BarColNum ,
                                           int AV87BarColNumto ,
                                           String AV82BarNomCli ,
                                           String AV84BarNomClito ,
                                           int AV83BarNumCli ,
                                           int AV85BarNumClito ,
                                           int AV90BarCod ,
                                           int AV96BarCodto ,
                                           byte AV91BarCodReo ,
                                           byte AV97BarCodReoto ,
                                           String AV92BarCodPar ,
                                           String AV98BarCodParto ,
                                           String AV93Cod_Idtx ,
                                           String AV94BarGirar ,
                                           short AV108BarTipArt ,
                                           short AV109BarTipArtto ,
                                           String AV110BarSer ,
                                           String AV111BarSerto ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A143BarDisNum ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           int A1235BarNumCli ,
                                           String A2829BarProPer ,
                                           String A2454BarGirar ,
                                           short A217BarTipArt ,
                                           short AV12OrderedBy ,
                                           boolean AV13OrderedDsc ,
                                           byte AV18BarSit ,
                                           byte AV19BarSitTo ,
                                           String AV46EmprCod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[63];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT MIN(T9.FasCod) AS BarFasSig, COALESCE( T10.BarFasLin, 0) AS BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar" ;
      scmdbuf += " FROM ((TXPBARFAS T9 LEFT JOIN (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod," ;
      scmdbuf += " BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar = T9.BarCodPar) INNER JOIN" ;
      scmdbuf += " (SELECT MIN(T12.BarOrdLin) AS GXC2, COALESCE( T13.BarFasLin, 0) AS BarFasLin, T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar FROM (TXPBARFAS T12 LEFT JOIN" ;
      scmdbuf += " (SELECT MAX(BarOrdLin) AS BarFasLin, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar )" ;
      scmdbuf += " T13 ON T13.EmprCod = T12.EmprCod AND T13.BarCod = T12.BarCod AND T13.BarCodReo = T12.BarCodReo AND T13.BarCodPar = T12.BarCodPar) WHERE (T12.BarOrdLin >= 0) AND" ;
      scmdbuf += " (T12.BarOrdLin > COALESCE( T13.BarFasLin, 0)) AND (T12.BarFasEst = 0) GROUP BY T13.BarFasLin, T12.EmprCod, T12.BarCod, T12.BarCodReo, T12.BarCodPar ) T11 ON T11.EmprCod" ;
      scmdbuf += " = T9.EmprCod AND T11.BarCod = T9.BarCod AND T11.BarCodReo = T9.BarCodReo AND T11.BarCodPar = T9.BarCodPar) WHERE (T9.BarOrdLin = T11.GXC2) AND (T9.BarOrdLin >=" ;
      scmdbuf += " 0) AND (T9.BarOrdLin > COALESCE( T10.BarFasLin, 0)) AND (T9.BarFasEst = 0) GROUP BY T10.BarFasLin, T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T6 ON T6.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT MIN(T9.FasCod) AS BarFasSig, T9.EmprCod," ;
      scmdbuf += " T9.BarCod, T9.BarCodReo, T9.BarCodPar FROM (TXPBARFAS T9 INNER JOIN (SELECT MAX(BarOrdLin) AS GXC3, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARFAS WHERE BarFasEst" ;
      scmdbuf += " <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T10 ON T10.EmprCod = T9.EmprCod AND T10.BarCod = T9.BarCod AND T10.BarCodReo = T9.BarCodReo AND T10.BarCodPar" ;
      scmdbuf += " = T9.BarCodPar) WHERE (T9.BarOrdLin = T10.GXC3) AND (T9.BarFasEst <> 0) GROUP BY T9.EmprCod, T9.BarCod, T9.BarCodReo, T9.BarCodPar ) T7 ON T7.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T7.BarCod = T1.BarCod AND T7.BarCodReo = T1.BarCodReo AND T7.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo," ;
      scmdbuf += " BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T8 ON T8.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T8.BarCod = T1.BarCod AND T8.BarCodReo = T1.BarCodReo AND T8.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV119Produccion_test_v01ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int27[3] = (byte)(1) ;
      }
      if ( ! (0==AV120Produccion_test_v01ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int27[4] = (byte)(1) ;
      }
      if ( ! (0==AV121Produccion_test_v01ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int27[5] = (byte)(1) ;
      }
      if ( ! (0==AV122Produccion_test_v01ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Produccion_test_v01ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV123Produccion_test_v01ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Produccion_test_v01ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Produccion_test_v01ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV125Produccion_test_v01ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Produccion_test_v01ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (0==AV127Produccion_test_v01ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (0==AV128Produccion_test_v01ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Produccion_test_v01ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV129Produccion_test_v01ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Produccion_test_v01ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Produccion_test_v01ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV131Produccion_test_v01ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Produccion_test_v01ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Produccion_test_v01ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV133Produccion_test_v01ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Produccion_test_v01ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Produccion_test_v01ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV135Produccion_test_v01ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Produccion_test_v01ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (0==AV137Produccion_test_v01ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( ! (0==AV138Produccion_test_v01ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Produccion_test_v01ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV139Produccion_test_v01ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Produccion_test_v01ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (0==AV141Produccion_test_v01ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( ! (0==AV142Produccion_test_v01ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Produccion_test_v01ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Produccion_test_v01ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Produccion_test_v01ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV146Produccion_test_v01ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (0==AV14CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( ! (0==AV15CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71BarDisNum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int27[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int27[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int27[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int27[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73BarFecCliTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int27[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int27[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int27[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int27[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int27[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int27[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int27[44] = (byte)(1) ;
      }
      if ( ! (0==AV81BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int27[45] = (byte)(1) ;
      }
      if ( ! (0==AV87BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int27[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int27[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int27[48] = (byte)(1) ;
      }
      if ( ! (0==AV83BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int27[49] = (byte)(1) ;
      }
      if ( ! (0==AV85BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int27[50] = (byte)(1) ;
      }
      if ( ! (0==AV90BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int27[51] = (byte)(1) ;
      }
      if ( ! (0==AV96BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int27[52] = (byte)(1) ;
      }
      if ( ! (0==AV91BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int27[53] = (byte)(1) ;
      }
      if ( ! (0==AV97BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int27[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92BarCodPar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int27[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int27[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int27[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int27[58] = (byte)(1) ;
      }
      if ( ! (0==AV108BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int27[59] = (byte)(1) ;
      }
      if ( ! (0==AV109BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int27[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int27[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int27[62] = (byte)(1) ;
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
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
   }

   protected Object[] conditional_H027P19( ModelContext context ,
                                           int remoteHandle ,
                                           com.genexus.IHttpContext httpContext ,
                                           int AV119Produccion_test_v01ds_1_tfbarcod ,
                                           int AV120Produccion_test_v01ds_2_tfbarcod_to ,
                                           byte AV121Produccion_test_v01ds_3_tfbarcodreo ,
                                           byte AV122Produccion_test_v01ds_4_tfbarcodreo_to ,
                                           String AV124Produccion_test_v01ds_6_tfbarcodpar_sel ,
                                           String AV123Produccion_test_v01ds_5_tfbarcodpar ,
                                           String AV126Produccion_test_v01ds_8_tfbardisnum_sel ,
                                           String AV125Produccion_test_v01ds_7_tfbardisnum ,
                                           int AV127Produccion_test_v01ds_9_tfclicod ,
                                           int AV128Produccion_test_v01ds_10_tfclicod_to ,
                                           String AV130Produccion_test_v01ds_12_tfclinom_sel ,
                                           String AV129Produccion_test_v01ds_11_tfclinom ,
                                           String AV132Produccion_test_v01ds_14_tfbarser_sel ,
                                           String AV131Produccion_test_v01ds_13_tfbarser ,
                                           String AV134Produccion_test_v01ds_16_tfbarserdsc_sel ,
                                           String AV133Produccion_test_v01ds_15_tfbarserdsc ,
                                           String AV136Produccion_test_v01ds_18_tfbarcolnom_sel ,
                                           String AV135Produccion_test_v01ds_17_tfbarcolnom ,
                                           int AV137Produccion_test_v01ds_19_tfbarcolnum ,
                                           int AV138Produccion_test_v01ds_20_tfbarcolnum_to ,
                                           String AV140Produccion_test_v01ds_22_tfbarnomcli_sel ,
                                           String AV139Produccion_test_v01ds_21_tfbarnomcli ,
                                           byte AV141Produccion_test_v01ds_23_tfbarsit ,
                                           byte AV142Produccion_test_v01ds_24_tfbarsit_to ,
                                           java.util.Date AV143Produccion_test_v01ds_25_tfbarfecgen ,
                                           java.util.Date AV144Produccion_test_v01ds_26_tfbarfeccli ,
                                           java.util.Date AV145Produccion_test_v01ds_27_tfbarfecfpr ,
                                           java.util.Date AV146Produccion_test_v01ds_28_tfbarfecsal ,
                                           int AV14CliCod ,
                                           int AV15CliCodto ,
                                           String AV71BarDisNum ,
                                           String AV74BarDisNumTo ,
                                           java.util.Date AV16BarFecGen ,
                                           java.util.Date AV17BarFecGenTo ,
                                           java.util.Date AV72BarFecCli ,
                                           java.util.Date AV73BarFecCliTo ,
                                           java.util.Date AV78BarFecSal ,
                                           java.util.Date AV79BarFecSalto ,
                                           java.util.Date AV76BarFecFpr ,
                                           java.util.Date AV77BarFecFprto ,
                                           String AV80BarColNom ,
                                           String AV86BarColNomto ,
                                           int AV81BarColNum ,
                                           int AV87BarColNumto ,
                                           String AV82BarNomCli ,
                                           String AV84BarNomClito ,
                                           int AV83BarNumCli ,
                                           int AV85BarNumClito ,
                                           int AV90BarCod ,
                                           int AV96BarCodto ,
                                           byte AV91BarCodReo ,
                                           byte AV97BarCodReoto ,
                                           String AV92BarCodPar ,
                                           String AV98BarCodParto ,
                                           String AV93Cod_Idtx ,
                                           String AV94BarGirar ,
                                           short AV108BarTipArt ,
                                           short AV109BarTipArtto ,
                                           String AV110BarSer ,
                                           String AV111BarSerto ,
                                           int A129BarCod ,
                                           byte A132BarCodReo ,
                                           String A130BarCodPar ,
                                           String A143BarDisNum ,
                                           int A252CliCod ,
                                           String A279CliNom ,
                                           String A212BarSer ,
                                           String A1652BarSerDsc ,
                                           String A135BarColNom ,
                                           int A136BarColNum ,
                                           String A1234BarNomCli ,
                                           byte A213BarSit ,
                                           java.util.Date A159BarFecGen ,
                                           java.util.Date A155BarFecCli ,
                                           java.util.Date A158BarFecFpr ,
                                           java.util.Date A161BarFecSal ,
                                           int A1235BarNumCli ,
                                           String A2829BarProPer ,
                                           String A2454BarGirar ,
                                           short A217BarTipArt ,
                                           byte AV18BarSit ,
                                           byte AV19BarSitTo ,
                                           String AV46EmprCod ,
                                           String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[63];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT T1.BarTipArt AS BarTipArt, T1.BarGirar, T1.BarProPer, T1.BarNumCli, T1.EmprCod, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      scmdbuf += " T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE( T3.BarKgm, 0) AS BarKgm," ;
      scmdbuf += " COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT" ;
      scmdbuf += " T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr," ;
      scmdbuf += " SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod =" ;
      scmdbuf += " T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV119Produccion_test_v01ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( ! (0==AV120Produccion_test_v01ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (0==AV121Produccion_test_v01ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! (0==AV122Produccion_test_v01ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Produccion_test_v01ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV123Produccion_test_v01ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Produccion_test_v01ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV126Produccion_test_v01ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV125Produccion_test_v01ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV126Produccion_test_v01ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (0==AV127Produccion_test_v01ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (0==AV128Produccion_test_v01ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Produccion_test_v01ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV129Produccion_test_v01ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Produccion_test_v01ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV132Produccion_test_v01ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV131Produccion_test_v01ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV132Produccion_test_v01ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Produccion_test_v01ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV133Produccion_test_v01ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Produccion_test_v01ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Produccion_test_v01ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV135Produccion_test_v01ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Produccion_test_v01ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV137Produccion_test_v01ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (0==AV138Produccion_test_v01ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV140Produccion_test_v01ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV139Produccion_test_v01ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV140Produccion_test_v01ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (0==AV141Produccion_test_v01ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (0==AV142Produccion_test_v01ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV143Produccion_test_v01ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV144Produccion_test_v01ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV145Produccion_test_v01ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV146Produccion_test_v01ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (0==AV14CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! (0==AV15CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71BarDisNum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV74BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV16BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV17BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV72BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV73BarFecCliTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV80BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( ! (0==AV81BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( ! (0==AV87BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int29[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV82BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int29[48] = (byte)(1) ;
      }
      if ( ! (0==AV83BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int29[49] = (byte)(1) ;
      }
      if ( ! (0==AV85BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int29[50] = (byte)(1) ;
      }
      if ( ! (0==AV90BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int29[51] = (byte)(1) ;
      }
      if ( ! (0==AV96BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int29[52] = (byte)(1) ;
      }
      if ( ! (0==AV91BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int29[53] = (byte)(1) ;
      }
      if ( ! (0==AV97BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int29[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92BarCodPar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int29[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int29[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV93Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int29[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int29[58] = (byte)(1) ;
      }
      if ( ! (0==AV108BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int29[59] = (byte)(1) ;
      }
      if ( ! (0==AV109BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int29[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int29[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV111BarSerto)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer <= ?)");
      }
      else
      {
         GXv_int29[62] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
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
                  return conditional_H027P9(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).shortValue() , ((Boolean) dynConstraints[81]).booleanValue() , ((Number) dynConstraints[82]).byteValue() , ((Number) dynConstraints[83]).byteValue() , (String)dynConstraints[84] , (String)dynConstraints[85] );
            case 1 :
                  return conditional_H027P17(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).shortValue() , ((Boolean) dynConstraints[81]).booleanValue() , ((Number) dynConstraints[82]).byteValue() , ((Number) dynConstraints[83]).byteValue() , (String)dynConstraints[84] , (String)dynConstraints[85] );
            case 2 :
                  return conditional_H027P19(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).byteValue() , ((Number) dynConstraints[81]).byteValue() , (String)dynConstraints[82] , (String)dynConstraints[83] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H027P9", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027P17", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027P19", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027P20", "SELECT EmprCod, RTRIM(LTRIM(Cod_Idtx)) || '-' || RTRIM(LTRIM(COALESCE( Dsc_Idtx, ''))) AS Dsc_IdtxID, Cod_Idtx, Dsc_Idtx FROM TXPINDITE ORDER BY Dsc_IdtxID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027P21", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027P22", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((short[]) buf[3])[0] = rslt.getShort(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((byte[]) buf[9])[0] = rslt.getByte(10);
               ((String[]) buf[10])[0] = rslt.getString(11, 13);
               ((int[]) buf[11])[0] = rslt.getInt(12);
               ((String[]) buf[12])[0] = rslt.getString(13, 13);
               ((String[]) buf[13])[0] = rslt.getString(14, 30);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((short[]) buf[15])[0] = rslt.getShort(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((String[]) buf[17])[0] = rslt.getString(16, 26);
               ((String[]) buf[18])[0] = rslt.getString(17, 16);
               ((String[]) buf[19])[0] = rslt.getString(18, 30);
               ((int[]) buf[20])[0] = rslt.getInt(19);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((String[]) buf[22])[0] = rslt.getString(20, 8);
               ((String[]) buf[23])[0] = rslt.getString(21, 1);
               ((String[]) buf[24])[0] = rslt.getString(22, 20);
               ((boolean[]) buf[25])[0] = rslt.wasNull();
               ((String[]) buf[26])[0] = rslt.getString(23, 8);
               ((boolean[]) buf[27])[0] = rslt.wasNull();
               ((String[]) buf[28])[0] = rslt.getString(24, 8);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(25,2);
               ((java.math.BigDecimal[]) buf[31])[0] = rslt.getBigDecimal(26,2);
               ((short[]) buf[32])[0] = rslt.getShort(27);
               ((String[]) buf[33])[0] = rslt.getString(28, 1);
               ((int[]) buf[34])[0] = rslt.getInt(29);
               ((String[]) buf[35])[0] = rslt.getString(30, 1);
               ((byte[]) buf[36])[0] = rslt.getByte(31);
               ((int[]) buf[37])[0] = rslt.getInt(32);
               ((String[]) buf[38])[0] = rslt.getString(33, 8);
               ((int[]) buf[39])[0] = rslt.getInt(34);
               ((String[]) buf[40])[0] = rslt.getString(35, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((String[]) buf[3])[0] = rslt.getString(3, 8);
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 3);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((byte[]) buf[10])[0] = rslt.getByte(10);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
               ((String[]) buf[14])[0] = rslt.getString(14, 26);
               ((String[]) buf[15])[0] = rslt.getString(15, 16);
               ((String[]) buf[16])[0] = rslt.getString(16, 30);
               ((int[]) buf[17])[0] = rslt.getInt(17);
               ((boolean[]) buf[18])[0] = rslt.wasNull();
               ((String[]) buf[19])[0] = rslt.getString(18, 8);
               ((String[]) buf[20])[0] = rslt.getString(19, 1);
               ((byte[]) buf[21])[0] = rslt.getByte(20);
               ((int[]) buf[22])[0] = rslt.getInt(21);
               ((java.math.BigDecimal[]) buf[23])[0] = rslt.getBigDecimal(22,2);
               ((java.math.BigDecimal[]) buf[24])[0] = rslt.getBigDecimal(23,2);
               ((short[]) buf[25])[0] = rslt.getShort(24);
               ((String[]) buf[26])[0] = rslt.getString(25, 1);
               ((int[]) buf[27])[0] = rslt.getInt(26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((String[]) buf[3])[0] = rslt.getString(4, 60);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
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
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 30);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 80);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[68], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[70]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[73]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[74]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[75], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[79]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[80]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[84], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[85], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[88], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[89]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[90]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[91], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[92], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[93]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[94]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[95]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[96]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[97]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[99]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[100]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[101], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[102], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[106]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[107]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[108]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[109]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[110]);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[112], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[115], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[116], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[117]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[118]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[119]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[120]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[121]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[122]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[123], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[126], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[127]).shortValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[128]).shortValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[129], 16);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[130], 16);
               }
               if ( ((Number) parms[63]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[131]).intValue());
               }
               if ( ((Number) parms[64]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[132]).intValue());
               }
               if ( ((Number) parms[65]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[133]).intValue());
               }
               if ( ((Number) parms[66]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[134]).intValue());
               }
               if ( ((Number) parms[67]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[135]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[90]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 16);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 16);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[64]).byteValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[65]).byteValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[66]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[67]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[68]).byteValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[69]).byteValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[70], 1);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[71], 1);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[72], 8);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[73], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[74]).intValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[75]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[76], 30);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[77], 30);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[78], 16);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[79], 16);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[80], 26);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[81], 26);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[82], 13);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[83], 13);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[84]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[85]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[86], 13);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[87], 13);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[88]).byteValue());
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[89]).byteValue());
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[90]);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[91]);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[92]);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[93]);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[94]).intValue());
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[95]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[96], 8);
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[97], 8);
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[98]);
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[99]);
               }
               if ( ((Number) parms[37]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[100]);
               }
               if ( ((Number) parms[38]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[101]);
               }
               if ( ((Number) parms[39]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[102]);
               }
               if ( ((Number) parms[40]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[103]);
               }
               if ( ((Number) parms[41]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[104]);
               }
               if ( ((Number) parms[42]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[105]);
               }
               if ( ((Number) parms[43]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[106], 13);
               }
               if ( ((Number) parms[44]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[107], 13);
               }
               if ( ((Number) parms[45]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[108]).intValue());
               }
               if ( ((Number) parms[46]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[109]).intValue());
               }
               if ( ((Number) parms[47]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[110], 13);
               }
               if ( ((Number) parms[48]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[111], 13);
               }
               if ( ((Number) parms[49]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[112]).intValue());
               }
               if ( ((Number) parms[50]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[113]).intValue());
               }
               if ( ((Number) parms[51]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[114]).intValue());
               }
               if ( ((Number) parms[52]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[115]).intValue());
               }
               if ( ((Number) parms[53]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[116]).byteValue());
               }
               if ( ((Number) parms[54]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[117]).byteValue());
               }
               if ( ((Number) parms[55]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[118], 1);
               }
               if ( ((Number) parms[56]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[119], 1);
               }
               if ( ((Number) parms[57]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[120], 4);
               }
               if ( ((Number) parms[58]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[121], 20);
               }
               if ( ((Number) parms[59]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[122]).shortValue());
               }
               if ( ((Number) parms[60]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[123]).shortValue());
               }
               if ( ((Number) parms[61]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[124], 16);
               }
               if ( ((Number) parms[62]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[125], 16);
               }
               return;
      }
   }

}

