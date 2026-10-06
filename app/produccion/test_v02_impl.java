package app.produccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class test_v02_impl extends GXDataArea
{
   public test_v02_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public test_v02_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( test_v02_impl.class ));
   }

   public test_v02_impl( int remoteHandle ,
                         ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavMuestras = new HTMLChoice();
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
      AV83CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      AV84CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
      AV85BarDisNum = httpContext.GetPar( "BarDisNum") ;
      AV86BarDisNumTo = httpContext.GetPar( "BarDisNumTo") ;
      AV87BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
      AV88BarSitTo = (byte)(GXutil.lval( httpContext.GetPar( "BarSitTo"))) ;
      AV75BarFecGen = localUtil.parseDateParm( httpContext.GetPar( "BarFecGen")) ;
      AV76BarFecGenTo = localUtil.parseDateParm( httpContext.GetPar( "BarFecGenTo")) ;
      AV77BarFecCli = localUtil.parseDateParm( httpContext.GetPar( "BarFecCli")) ;
      AV78BarFecCliTo = localUtil.parseDateParm( httpContext.GetPar( "BarFecCliTo")) ;
      AV79BarFecFpr = localUtil.parseDateParm( httpContext.GetPar( "BarFecFpr")) ;
      AV80BarFecFprto = localUtil.parseDateParm( httpContext.GetPar( "BarFecFprto")) ;
      AV81BarFecSal = localUtil.parseDateParm( httpContext.GetPar( "BarFecSal")) ;
      AV82BarFecSalto = localUtil.parseDateParm( httpContext.GetPar( "BarFecSalto")) ;
      AV71BarColNom = httpContext.GetPar( "BarColNom") ;
      AV72BarColNum = (int)(GXutil.lval( httpContext.GetPar( "BarColNum"))) ;
      AV73BarColNomto = httpContext.GetPar( "BarColNomto") ;
      AV74BarColNumto = (int)(GXutil.lval( httpContext.GetPar( "BarColNumto"))) ;
      AV67BarNomCli = httpContext.GetPar( "BarNomCli") ;
      AV68BarNumCli = (int)(GXutil.lval( httpContext.GetPar( "BarNumCli"))) ;
      AV69BarNomClito = httpContext.GetPar( "BarNomClito") ;
      AV70BarNumClito = (int)(GXutil.lval( httpContext.GetPar( "BarNumClito"))) ;
      AV65BarSer = httpContext.GetPar( "BarSer") ;
      AV66BarSerto = httpContext.GetPar( "BarSerto") ;
      AV57BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV58BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV59BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV60BarCodto = (int)(GXutil.lval( httpContext.GetPar( "BarCodto"))) ;
      AV61BarCodReoto = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReoto"))) ;
      AV62BarCodParto = httpContext.GetPar( "BarCodParto") ;
      AV55BarGirar = httpContext.GetPar( "BarGirar") ;
      AV63BarTipArt = (short)(GXutil.lval( httpContext.GetPar( "BarTipArt"))) ;
      AV64BarTipArtto = (short)(GXutil.lval( httpContext.GetPar( "BarTipArtto"))) ;
      AV54Cod_Idtx = httpContext.GetPar( "Cod_Idtx") ;
      AV93EmprCod = httpContext.GetPar( "EmprCod") ;
      AV15TFBarCod = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod"))) ;
      AV16TFBarCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarCod_To"))) ;
      AV17TFBarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo"))) ;
      AV18TFBarCodReo_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarCodReo_To"))) ;
      AV19TFBarCodPar = httpContext.GetPar( "TFBarCodPar") ;
      AV20TFBarCodPar_Sel = httpContext.GetPar( "TFBarCodPar_Sel") ;
      AV21TFBarDisNum = httpContext.GetPar( "TFBarDisNum") ;
      AV22TFBarDisNum_Sel = httpContext.GetPar( "TFBarDisNum_Sel") ;
      AV23TFCliCod = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod"))) ;
      AV24TFCliCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFCliCod_To"))) ;
      AV25TFCliNom = httpContext.GetPar( "TFCliNom") ;
      AV26TFCliNom_Sel = httpContext.GetPar( "TFCliNom_Sel") ;
      AV27TFBarSer = httpContext.GetPar( "TFBarSer") ;
      AV28TFBarSer_Sel = httpContext.GetPar( "TFBarSer_Sel") ;
      AV29TFBarSerDsc = httpContext.GetPar( "TFBarSerDsc") ;
      AV30TFBarSerDsc_Sel = httpContext.GetPar( "TFBarSerDsc_Sel") ;
      AV31TFBarColNom = httpContext.GetPar( "TFBarColNom") ;
      AV32TFBarColNom_Sel = httpContext.GetPar( "TFBarColNom_Sel") ;
      AV33TFBarColNum = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum"))) ;
      AV34TFBarColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFBarColNum_To"))) ;
      AV35TFBarNomCli = httpContext.GetPar( "TFBarNomCli") ;
      AV36TFBarNomCli_Sel = httpContext.GetPar( "TFBarNomCli_Sel") ;
      AV37TFBarSit = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit"))) ;
      AV38TFBarSit_To = (byte)(GXutil.lval( httpContext.GetPar( "TFBarSit_To"))) ;
      AV39TFBarFecGen = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecGen")) ;
      AV41TFBarFecCli = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecCli")) ;
      AV43TFBarFecFpr = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecFpr")) ;
      AV45TFBarFecSal = localUtil.parseDateParm( httpContext.GetPar( "TFBarFecSal")) ;
      AV109Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV48TotBarKgm = CommonUtil.decimalVal( httpContext.GetPar( "TotBarKgm"), ".") ;
      AV50TotBarMtr = CommonUtil.decimalVal( httpContext.GetPar( "TotBarMtr"), ".") ;
      AV52TotBarPie = GXutil.lval( httpContext.GetPar( "TotBarPie")) ;
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
      gxgrgrid_refresh( subGrid_Rows, AV83CliCod, AV84CliCodto, AV85BarDisNum, AV86BarDisNumTo, AV87BarSit, AV88BarSitTo, AV75BarFecGen, AV76BarFecGenTo, AV77BarFecCli, AV78BarFecCliTo, AV79BarFecFpr, AV80BarFecFprto, AV81BarFecSal, AV82BarFecSalto, AV71BarColNom, AV72BarColNum, AV73BarColNomto, AV74BarColNumto, AV67BarNomCli, AV68BarNumCli, AV69BarNomClito, AV70BarNumClito, AV65BarSer, AV66BarSerto, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV60BarCodto, AV61BarCodReoto, AV62BarCodParto, AV55BarGirar, AV63BarTipArt, AV64BarTipArtto, AV54Cod_Idtx, AV93EmprCod, AV15TFBarCod, AV16TFBarCod_To, AV17TFBarCodReo, AV18TFBarCodReo_To, AV19TFBarCodPar, AV20TFBarCodPar_Sel, AV21TFBarDisNum, AV22TFBarDisNum_Sel, AV23TFCliCod, AV24TFCliCod_To, AV25TFCliNom, AV26TFCliNom_Sel, AV27TFBarSer, AV28TFBarSer_Sel, AV29TFBarSerDsc, AV30TFBarSerDsc_Sel, AV31TFBarColNom, AV32TFBarColNom_Sel, AV33TFBarColNum, AV34TFBarColNum_To, AV35TFBarNomCli, AV36TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV41TFBarFecCli, AV43TFBarFecFpr, AV45TFBarFecSal, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48TotBarKgm, AV50TotBarMtr, AV52TotBarPie) ;
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
      pa27Q2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start27Q2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.produccion.test_v02", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARKGM", getSecureSignedToken( "", localUtil.format( AV48TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARMTR", getSecureSignedToken( "", localUtil.format( AV50TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52TotBarPie), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Test_v02");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV109Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\test_v02:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICOD", GXutil.ltrim( localUtil.ntoc( AV83CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV84CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARDISNUM", GXutil.rtrim( AV85BarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARDISNUMTO", GXutil.rtrim( AV86BarDisNumTo));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSIT", GXutil.ltrim( localUtil.ntoc( AV87BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSITTO", GXutil.ltrim( localUtil.ntoc( AV88BarSitTo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGEN", localUtil.format(AV75BarFecGen, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECGENTO", localUtil.format(AV76BarFecGenTo, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECCLI", localUtil.format(AV77BarFecCli, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECCLITO", localUtil.format(AV78BarFecCliTo, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECFPR", localUtil.format(AV79BarFecFpr, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECFPRTO", localUtil.format(AV80BarFecFprto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECSAL", localUtil.format(AV81BarFecSal, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARFECSALTO", localUtil.format(AV82BarFecSalto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNOM", GXutil.rtrim( AV71BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV72BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNOMTO", GXutil.rtrim( AV73BarColNomto));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOLNUMTO", GXutil.ltrim( localUtil.ntoc( AV74BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNOMCLI", GXutil.rtrim( AV67BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNUMCLI", GXutil.ltrim( localUtil.ntoc( AV68BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNOMCLITO", GXutil.rtrim( AV69BarNomClito));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARNUMCLITO", GXutil.ltrim( localUtil.ntoc( AV70BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSER", GXutil.rtrim( AV65BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARSERTO", GXutil.rtrim( AV66BarSerto));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCOD", GXutil.ltrim( localUtil.ntoc( AV57BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV58BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODPAR", GXutil.rtrim( AV59BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODTO", GXutil.ltrim( localUtil.ntoc( AV60BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODREOTO", GXutil.ltrim( localUtil.ntoc( AV61BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARCODPARTO", GXutil.rtrim( AV62BarCodParto));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARGIRAR", GXutil.rtrim( AV55BarGirar));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARTIPART", GXutil.ltrim( localUtil.ntoc( AV63BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vBARTIPARTTO", GXutil.ltrim( localUtil.ntoc( AV64BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCOD_IDTX", GXutil.rtrim( AV54Cod_Idtx));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_221", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_221, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARTIPART_DATA", AV91BarTipArt_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARTIPART_DATA", AV91BarTipArt_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vBARTIPARTTO_DATA", AV92BarTipArtto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vBARTIPARTTO_DATA", AV92BarTipArtto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOD_IDTX_DATA", AV89Cod_Idtx_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOD_IDTX_DATA", AV89Cod_Idtx_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV47DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV47DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOD", GXutil.ltrim( localUtil.ntoc( AV15TFBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOD_TO", GXutil.ltrim( localUtil.ntoc( AV16TFBarCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODREO", GXutil.ltrim( localUtil.ntoc( AV17TFBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODREO_TO", GXutil.ltrim( localUtil.ntoc( AV18TFBarCodReo_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODPAR", GXutil.rtrim( AV19TFBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCODPAR_SEL", GXutil.rtrim( AV20TFBarCodPar_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARDISNUM", GXutil.rtrim( AV21TFBarDisNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARDISNUM_SEL", GXutil.rtrim( AV22TFBarDisNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD", GXutil.ltrim( localUtil.ntoc( AV23TFCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLICOD_TO", GXutil.ltrim( localUtil.ntoc( AV24TFCliCod_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM", GXutil.rtrim( AV25TFCliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLINOM_SEL", GXutil.rtrim( AV26TFCliNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER", GXutil.rtrim( AV27TFBarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSER_SEL", GXutil.rtrim( AV28TFBarSer_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC", GXutil.rtrim( AV29TFBarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSERDSC_SEL", GXutil.rtrim( AV30TFBarSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM", GXutil.rtrim( AV31TFBarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNOM_SEL", GXutil.rtrim( AV32TFBarColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV33TFBarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV34TFBarColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI", GXutil.rtrim( AV35TFBarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARNOMCLI_SEL", GXutil.rtrim( AV36TFBarNomCli_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT", GXutil.ltrim( localUtil.ntoc( AV37TFBarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARSIT_TO", GXutil.ltrim( localUtil.ntoc( AV38TFBarSit_To, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECGEN", localUtil.dtoc( AV39TFBarFecGen, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECCLI", localUtil.dtoc( AV41TFBarFecCli, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECFPR", localUtil.dtoc( AV43TFBarFecFpr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFBARFECSAL", localUtil.dtoc( AV45TFBarFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV93EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNUMCLI", GXutil.ltrim( localUtil.ntoc( A1235BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV48TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARKGM", getSecureSignedToken( "", localUtil.format( AV48TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV50TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARMTR", getSecureSignedToken( "", localUtil.format( AV50TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARPIE", GXutil.ltrim( localUtil.ntoc( AV52TotBarPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52TotBarPie), "ZZZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
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
         we27Q2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt27Q2( ) ;
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
      return formatLink("app.produccion.test_v02", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Produccion.Test_v02" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Consulta Produccion v02", "") ;
   }

   public void wb27Q0( )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV83CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV83CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV83CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,19);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV84CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV84CliCodto), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV84CliCodto), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodto_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnum_Internalname, GXutil.rtrim( AV85BarDisNum), GXutil.rtrim( localUtil.format( AV85BarDisNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,27);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBardisnum_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBardisnumto_Internalname, GXutil.rtrim( AV86BarDisNumTo), GXutil.rtrim( localUtil.format( AV86BarDisNumTo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBardisnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBardisnumto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsit_Internalname, GXutil.ltrim( localUtil.ntoc( AV87BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV87BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV87BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,35);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsit_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsitto_Internalname, GXutil.ltrim( localUtil.ntoc( AV88BarSitTo, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsitto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV88BarSitTo), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV88BarSitTo), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsitto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsitto_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgen_Internalname, localUtil.format(AV75BarFecGen, "99/99/99"), localUtil.format( AV75BarFecGen, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgen_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgen_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgen_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecgento_Internalname, localUtil.format(AV76BarFecGenTo, "99/99/99"), localUtil.format( AV76BarFecGenTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecgento_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecgento_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecgento_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecgento_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfeccli_Internalname, localUtil.format(AV77BarFecCli, "99/99/99"), localUtil.format( AV77BarFecCli, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfeccli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfeccli_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfeccli_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfeccli_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecclito_Internalname, localUtil.format(AV78BarFecCliTo, "99/99/99"), localUtil.format( AV78BarFecCliTo, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,61);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecclito_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecclito_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecclito_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecfpr_Internalname, localUtil.format(AV79BarFecFpr, "99/99/99"), localUtil.format( AV79BarFecFpr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,65);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecfpr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecfpr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecfpr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecfpr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecfprto_Internalname, localUtil.format(AV80BarFecFprto, "99/99/99"), localUtil.format( AV80BarFecFprto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecfprto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecfprto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecfprto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecfprto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecsal_Internalname, localUtil.format(AV81BarFecSal, "99/99/99"), localUtil.format( AV81BarFecSal, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,73);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecsal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecsal_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecsal_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecsal_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecsalto_Internalname, localUtil.format(AV82BarFecSalto, "99/99/99"), localUtil.format( AV82BarFecSalto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,77);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecsalto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecsalto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecsalto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecsalto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV71BarColNom), GXutil.rtrim( localUtil.format( AV71BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV72BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV72BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV72BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnomto_Internalname, GXutil.rtrim( AV73BarColNomto), GXutil.rtrim( localUtil.format( AV73BarColNomto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnomto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnomto_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnumto_Internalname, GXutil.ltrim( localUtil.ntoc( AV74BarColNumto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnumto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV74BarColNumto), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV74BarColNumto), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnumto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnumto_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV67BarNomCli), GXutil.rtrim( localUtil.format( AV67BarNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV68BarNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV68BarNumCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV68BarNumCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomclito_Internalname, GXutil.rtrim( AV69BarNomClito), GXutil.rtrim( localUtil.format( AV69BarNomClito, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomclito_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnumclito_Internalname, GXutil.ltrim( localUtil.ntoc( AV70BarNumClito, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarnumclito_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV70BarNumClito), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV70BarNumClito), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnumclito_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnumclito_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV65BarSer), GXutil.rtrim( localUtil.format( AV65BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,135);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserto_Internalname, GXutil.rtrim( AV66BarSerto), GXutil.rtrim( localUtil.format( AV66BarSerto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,139);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserto_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_bartipart_Internalname, httpContext.getMessage( "Tipo Art. Inicial", ""), "", "", lblTextblockcombo_bartipart_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_bartipart.setProperty("Caption", Combo_bartipart_Caption);
         ucCombo_bartipart.setProperty("Cls", Combo_bartipart_Cls);
         ucCombo_bartipart.setProperty("EmptyItemText", Combo_bartipart_Emptyitemtext);
         ucCombo_bartipart.setProperty("DropDownOptionsData", AV91BarTipArt_Data);
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_bartipartto_Internalname, httpContext.getMessage( "Tipo Art. Final", ""), "", "", lblTextblockcombo_bartipartto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_bartipartto.setProperty("Caption", Combo_bartipartto_Caption);
         ucCombo_bartipartto.setProperty("Cls", Combo_bartipartto_Cls);
         ucCombo_bartipartto.setProperty("EmptyItemText", Combo_bartipartto_Emptyitemtext);
         ucCombo_bartipartto.setProperty("DropDownOptionsData", AV92BarTipArtto_Data);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV57BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV57BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV57BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,170);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV58BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV58BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV58BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV59BarCodPar), GXutil.rtrim( localUtil.format( AV59BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,178);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV60BarCodto, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV60BarCodto), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV60BarCodto), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodto_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreoto_Internalname, GXutil.ltrim( localUtil.ntoc( AV61BarCodReoto, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreoto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV61BarCodReoto), "9") : localUtil.format( DecimalUtil.doubleToDec(AV61BarCodReoto), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,186);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreoto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreoto_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodparto_Internalname, GXutil.rtrim( AV62BarCodParto), GXutil.rtrim( localUtil.format( AV62BarCodParto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodparto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodparto_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_cod_idtx_Internalname, httpContext.getMessage( "Clear To Wear", ""), "", "", lblTextblockcombo_cod_idtx_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_cod_idtx.setProperty("Caption", Combo_cod_idtx_Caption);
         ucCombo_cod_idtx.setProperty("Cls", Combo_cod_idtx_Cls);
         ucCombo_cod_idtx.setProperty("EmptyItemText", Combo_cod_idtx_Emptyitemtext);
         ucCombo_cod_idtx.setProperty("DropDownOptionsData", AV89Cod_Idtx_Data);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBargirar_Internalname, GXutil.rtrim( AV55BarGirar), GXutil.rtrim( localUtil.format( AV55BarGirar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,205);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBargirar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBargirar_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavMuestras, cmbavMuestras.getInternalname(), GXutil.rtrim( AV56Muestras), 1, cmbavMuestras.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavMuestras.getVisible(), cmbavMuestras.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,209);\"", "", true, (byte)(0), "HLP_Produccion\\Test_v02.htm");
         cmbavMuestras.setValue( GXutil.rtrim( AV56Muestras) );
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
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithtotalizers_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
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
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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
         wb_table1_256_27Q2( true) ;
      }
      else
      {
         wb_table1_256_27Q2( false) ;
      }
      return  ;
   }

   public void wb_table1_256_27Q2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV109Pgmname), GXutil.rtrim( localUtil.format( AV109Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 303,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipart_Internalname, GXutil.ltrim( localUtil.ntoc( AV63BarTipArt, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV63BarTipArt), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,303);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipart_Jsonclick, 0, "Attribute", "", "", "", "", edtavBartipart_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 304,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipartto_Internalname, GXutil.ltrim( localUtil.ntoc( AV64BarTipArtto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV64BarTipArtto), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,304);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipartto_Jsonclick, 0, "Attribute", "", "", "", "", edtavBartipartto_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 305,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCod_idtx_Internalname, GXutil.rtrim( AV54Cod_Idtx), GXutil.rtrim( localUtil.format( AV54Cod_Idtx, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,305);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCod_idtx_Jsonclick, 0, "Attribute", "", "", "", "", edtavCod_idtx_Visible, 1, 0, "text", "", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV47DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecgenauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 309,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecgenauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecgenauxdate_Internalname, localUtil.format(AV40DDO_BarFecGenAuxDate, "99/99/99"), localUtil.format( AV40DDO_BarFecGenAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,309);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecgenauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecgenauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfeccliauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 311,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfeccliauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfeccliauxdate_Internalname, localUtil.format(AV42DDO_BarFecCliAuxDate, "99/99/99"), localUtil.format( AV42DDO_BarFecCliAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,311);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfeccliauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfeccliauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecfprauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 313,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecfprauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecfprauxdate_Internalname, localUtil.format(AV44DDO_BarFecFprAuxDate, "99/99/99"), localUtil.format( AV44DDO_BarFecFprAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,313);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecfprauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecfprauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_barfecsalauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 315,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_barfecsalauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_barfecsalauxdate_Internalname, localUtil.format(AV46DDO_BarFecSalAuxDate, "99/99/99"), localUtil.format( AV46DDO_BarFecSalAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,315);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_barfecsalauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_barfecsalauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Produccion\\Test_v02.htm");
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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

   public void start27Q2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Consulta Produccion v02", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup27Q0( ) ;
   }

   public void ws27Q2( )
   {
      start27Q2( ) ;
      evt27Q2( ) ;
   }

   public void evt27Q2( )
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
                           e1127Q2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_BARTIPARTTO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1227Q2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_COD_IDTX.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1327Q2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1427Q2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV110Produccion_test_v02ds_1_tfbarcod = AV15TFBarCod ;
                           AV111Produccion_test_v02ds_2_tfbarcod_to = AV16TFBarCod_To ;
                           AV112Produccion_test_v02ds_3_tfbarcodreo = AV17TFBarCodReo ;
                           AV113Produccion_test_v02ds_4_tfbarcodreo_to = AV18TFBarCodReo_To ;
                           AV114Produccion_test_v02ds_5_tfbarcodpar = AV19TFBarCodPar ;
                           AV115Produccion_test_v02ds_6_tfbarcodpar_sel = AV20TFBarCodPar_Sel ;
                           AV116Produccion_test_v02ds_7_tfbardisnum = AV21TFBarDisNum ;
                           AV117Produccion_test_v02ds_8_tfbardisnum_sel = AV22TFBarDisNum_Sel ;
                           AV118Produccion_test_v02ds_9_tfclicod = AV23TFCliCod ;
                           AV119Produccion_test_v02ds_10_tfclicod_to = AV24TFCliCod_To ;
                           AV120Produccion_test_v02ds_11_tfclinom = AV25TFCliNom ;
                           AV121Produccion_test_v02ds_12_tfclinom_sel = AV26TFCliNom_Sel ;
                           AV122Produccion_test_v02ds_13_tfbarser = AV27TFBarSer ;
                           AV123Produccion_test_v02ds_14_tfbarser_sel = AV28TFBarSer_Sel ;
                           AV124Produccion_test_v02ds_15_tfbarserdsc = AV29TFBarSerDsc ;
                           AV125Produccion_test_v02ds_16_tfbarserdsc_sel = AV30TFBarSerDsc_Sel ;
                           AV126Produccion_test_v02ds_17_tfbarcolnom = AV31TFBarColNom ;
                           AV127Produccion_test_v02ds_18_tfbarcolnom_sel = AV32TFBarColNom_Sel ;
                           AV128Produccion_test_v02ds_19_tfbarcolnum = AV33TFBarColNum ;
                           AV129Produccion_test_v02ds_20_tfbarcolnum_to = AV34TFBarColNum_To ;
                           AV130Produccion_test_v02ds_21_tfbarnomcli = AV35TFBarNomCli ;
                           AV131Produccion_test_v02ds_22_tfbarnomcli_sel = AV36TFBarNomCli_Sel ;
                           AV132Produccion_test_v02ds_23_tfbarsit = AV37TFBarSit ;
                           AV133Produccion_test_v02ds_24_tfbarsit_to = AV38TFBarSit_To ;
                           AV134Produccion_test_v02ds_25_tfbarfecgen = AV39TFBarFecGen ;
                           AV135Produccion_test_v02ds_26_tfbarfeccli = AV41TFBarFecCli ;
                           AV136Produccion_test_v02ds_27_tfbarfecfpr = AV43TFBarFecFpr ;
                           AV137Produccion_test_v02ds_28_tfbarfecsal = AV45TFBarFecSal ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_221_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_221_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_221_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_2212( ) ;
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
                           AV103BarFasCod = httpContext.cgiGet( edtavBarfascod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfascod_Internalname, AV103BarFasCod);
                           AV104BarFasSig = httpContext.cgiGet( edtavBarfassig_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarfassig_Internalname, AV104BarFasSig);
                           AV105BarAlbUltimo = localUtil.ctol( httpContext.cgiGet( edtavBaralbultimo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBaralbultimo_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105BarAlbUltimo), 10, 0));
                           AV106BarAlbFact = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbfact_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBaralbfact_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarAlbFact), 8, 0));
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
                                 e1527Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1627Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1727Q2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Clicod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83CliCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicodto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV84CliCodto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bardisnum Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUM"), AV85BarDisNum) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bardisnumto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUMTO"), AV86BarDisNumTo) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsit Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV87BarSit )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barsitto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV88BarSitTo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgen Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGEN"), 0), AV75BarFecGen) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecgento Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECGENTO"), 0), AV76BarFecGenTo) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfeccli Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECCLI"), 0), AV77BarFecCli) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecclito Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECCLITO"), 0), AV78BarFecCliTo) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecfpr Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECFPR"), 0), AV79BarFecFpr) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecfprto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECFPRTO"), 0), AV80BarFecFprto) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecsal Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECSAL"), 0), AV81BarFecSal) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barfecsalto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vBARFECSALTO"), 0), AV82BarFecSalto) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnom Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOM"), AV71BarColNom) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnum Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV72BarColNum )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnomto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOMTO"), AV73BarColNomto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcolnumto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUMTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV74BarColNumto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnomcli Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLI"), AV67BarNomCli) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnumcli Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV68BarNumCli )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnomclito Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLITO"), AV69BarNomClito) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barnumclito Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLITO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV70BarNumClito )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barser Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSER"), AV65BarSer) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barserto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSERTO"), AV66BarSerto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV57BarCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodreo Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV58BarCodReo )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodpar Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPAR"), AV59BarCodPar) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV60BarCodto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodreoto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREOTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV61BarCodReoto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Barcodparto Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPARTO"), AV62BarCodParto) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bargirar Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARGIRAR"), AV55BarGirar) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bartipart Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV63BarTipArt )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Bartipartto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPARTTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV64BarTipArtto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Cod_idtx Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCOD_IDTX"), AV54Cod_Idtx) != 0 )
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we27Q2( )
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

   public void pa27Q2( )
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
                                 int AV83CliCod ,
                                 int AV84CliCodto ,
                                 String AV85BarDisNum ,
                                 String AV86BarDisNumTo ,
                                 byte AV87BarSit ,
                                 byte AV88BarSitTo ,
                                 java.util.Date AV75BarFecGen ,
                                 java.util.Date AV76BarFecGenTo ,
                                 java.util.Date AV77BarFecCli ,
                                 java.util.Date AV78BarFecCliTo ,
                                 java.util.Date AV79BarFecFpr ,
                                 java.util.Date AV80BarFecFprto ,
                                 java.util.Date AV81BarFecSal ,
                                 java.util.Date AV82BarFecSalto ,
                                 String AV71BarColNom ,
                                 int AV72BarColNum ,
                                 String AV73BarColNomto ,
                                 int AV74BarColNumto ,
                                 String AV67BarNomCli ,
                                 int AV68BarNumCli ,
                                 String AV69BarNomClito ,
                                 int AV70BarNumClito ,
                                 String AV65BarSer ,
                                 String AV66BarSerto ,
                                 int AV57BarCod ,
                                 byte AV58BarCodReo ,
                                 String AV59BarCodPar ,
                                 int AV60BarCodto ,
                                 byte AV61BarCodReoto ,
                                 String AV62BarCodParto ,
                                 String AV55BarGirar ,
                                 short AV63BarTipArt ,
                                 short AV64BarTipArtto ,
                                 String AV54Cod_Idtx ,
                                 String AV93EmprCod ,
                                 int AV15TFBarCod ,
                                 int AV16TFBarCod_To ,
                                 byte AV17TFBarCodReo ,
                                 byte AV18TFBarCodReo_To ,
                                 String AV19TFBarCodPar ,
                                 String AV20TFBarCodPar_Sel ,
                                 String AV21TFBarDisNum ,
                                 String AV22TFBarDisNum_Sel ,
                                 int AV23TFCliCod ,
                                 int AV24TFCliCod_To ,
                                 String AV25TFCliNom ,
                                 String AV26TFCliNom_Sel ,
                                 String AV27TFBarSer ,
                                 String AV28TFBarSer_Sel ,
                                 String AV29TFBarSerDsc ,
                                 String AV30TFBarSerDsc_Sel ,
                                 String AV31TFBarColNom ,
                                 String AV32TFBarColNom_Sel ,
                                 int AV33TFBarColNum ,
                                 int AV34TFBarColNum_To ,
                                 String AV35TFBarNomCli ,
                                 String AV36TFBarNomCli_Sel ,
                                 byte AV37TFBarSit ,
                                 byte AV38TFBarSit_To ,
                                 java.util.Date AV39TFBarFecGen ,
                                 java.util.Date AV41TFBarFecCli ,
                                 java.util.Date AV43TFBarFecFpr ,
                                 java.util.Date AV45TFBarFecSal ,
                                 String AV109Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 java.math.BigDecimal AV48TotBarKgm ,
                                 java.math.BigDecimal AV50TotBarMtr ,
                                 long AV52TotBarPie )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1627Q2 ();
      GRID_nCurrentRecord = 0 ;
      rf27Q2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Test_v02");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV109Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("produccion\\test_v02:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
         AV56Muestras = cmbavMuestras.getValidValue(AV56Muestras) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Muestras", AV56Muestras);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavMuestras.setValue( GXutil.rtrim( AV56Muestras) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavMuestras.getInternalname(), "Values", cmbavMuestras.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_221_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf27Q2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV109Pgmname = "Produccion.Test_v02" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109Pgmname", AV109Pgmname);
      Gx_err = (short)(0) ;
      edtavBarfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascod_Enabled), 5, 0), !bGXsfl_221_Refreshing);
      edtavBarfassig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfassig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfassig_Enabled), 5, 0), !bGXsfl_221_Refreshing);
      edtavBaralbultimo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbultimo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbultimo_Enabled), 5, 0), !bGXsfl_221_Refreshing);
      edtavBaralbfact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbfact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbfact_Enabled), 5, 0), !bGXsfl_221_Refreshing);
      edtavTotvaluebarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarkgm_Enabled), 5, 0), true);
      edtavTotvaluebarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarmtr_Enabled), 5, 0), true);
      edtavTotvaluebarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvaluebarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluebarpie_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27Q2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(221) ;
      /* Execute user event: Refresh */
      e1627Q2 ();
      nGXsfl_221_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_221_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_221_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2212( ) ;
      bGXsfl_221_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
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
         subsflControlProps_2212( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV110Produccion_test_v02ds_1_tfbarcod) ,
                                              Integer.valueOf(AV111Produccion_test_v02ds_2_tfbarcod_to) ,
                                              Byte.valueOf(AV112Produccion_test_v02ds_3_tfbarcodreo) ,
                                              Byte.valueOf(AV113Produccion_test_v02ds_4_tfbarcodreo_to) ,
                                              AV115Produccion_test_v02ds_6_tfbarcodpar_sel ,
                                              AV114Produccion_test_v02ds_5_tfbarcodpar ,
                                              AV117Produccion_test_v02ds_8_tfbardisnum_sel ,
                                              AV116Produccion_test_v02ds_7_tfbardisnum ,
                                              Integer.valueOf(AV118Produccion_test_v02ds_9_tfclicod) ,
                                              Integer.valueOf(AV119Produccion_test_v02ds_10_tfclicod_to) ,
                                              AV121Produccion_test_v02ds_12_tfclinom_sel ,
                                              AV120Produccion_test_v02ds_11_tfclinom ,
                                              AV123Produccion_test_v02ds_14_tfbarser_sel ,
                                              AV122Produccion_test_v02ds_13_tfbarser ,
                                              AV125Produccion_test_v02ds_16_tfbarserdsc_sel ,
                                              AV124Produccion_test_v02ds_15_tfbarserdsc ,
                                              AV127Produccion_test_v02ds_18_tfbarcolnom_sel ,
                                              AV126Produccion_test_v02ds_17_tfbarcolnom ,
                                              Integer.valueOf(AV128Produccion_test_v02ds_19_tfbarcolnum) ,
                                              Integer.valueOf(AV129Produccion_test_v02ds_20_tfbarcolnum_to) ,
                                              AV131Produccion_test_v02ds_22_tfbarnomcli_sel ,
                                              AV130Produccion_test_v02ds_21_tfbarnomcli ,
                                              Byte.valueOf(AV132Produccion_test_v02ds_23_tfbarsit) ,
                                              Byte.valueOf(AV133Produccion_test_v02ds_24_tfbarsit_to) ,
                                              AV134Produccion_test_v02ds_25_tfbarfecgen ,
                                              AV135Produccion_test_v02ds_26_tfbarfeccli ,
                                              AV136Produccion_test_v02ds_27_tfbarfecfpr ,
                                              AV137Produccion_test_v02ds_28_tfbarfecsal ,
                                              Integer.valueOf(AV83CliCod) ,
                                              Integer.valueOf(AV84CliCodto) ,
                                              AV85BarDisNum ,
                                              AV86BarDisNumTo ,
                                              AV75BarFecGen ,
                                              AV76BarFecGenTo ,
                                              AV77BarFecCli ,
                                              AV78BarFecCliTo ,
                                              AV81BarFecSal ,
                                              AV82BarFecSalto ,
                                              AV79BarFecFpr ,
                                              AV80BarFecFprto ,
                                              AV71BarColNom ,
                                              AV73BarColNomto ,
                                              Integer.valueOf(AV72BarColNum) ,
                                              Integer.valueOf(AV74BarColNumto) ,
                                              AV67BarNomCli ,
                                              AV69BarNomClito ,
                                              Integer.valueOf(AV68BarNumCli) ,
                                              Integer.valueOf(AV70BarNumClito) ,
                                              Integer.valueOf(AV57BarCod) ,
                                              Integer.valueOf(AV60BarCodto) ,
                                              Byte.valueOf(AV58BarCodReo) ,
                                              Byte.valueOf(AV61BarCodReoto) ,
                                              AV59BarCodPar ,
                                              AV62BarCodParto ,
                                              AV54Cod_Idtx ,
                                              AV55BarGirar ,
                                              Short.valueOf(AV63BarTipArt) ,
                                              Short.valueOf(AV64BarTipArtto) ,
                                              AV65BarSer ,
                                              AV66BarSerto ,
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
                                              Byte.valueOf(AV87BarSit) ,
                                              Byte.valueOf(AV88BarSitTo) ,
                                              AV93EmprCod ,
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
         lV114Produccion_test_v02ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV114Produccion_test_v02ds_5_tfbarcodpar), 1, "%") ;
         lV116Produccion_test_v02ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV116Produccion_test_v02ds_7_tfbardisnum), 8, "%") ;
         lV120Produccion_test_v02ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV120Produccion_test_v02ds_11_tfclinom), 30, "%") ;
         lV122Produccion_test_v02ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV122Produccion_test_v02ds_13_tfbarser), 16, "%") ;
         lV124Produccion_test_v02ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV124Produccion_test_v02ds_15_tfbarserdsc), 26, "%") ;
         lV126Produccion_test_v02ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV126Produccion_test_v02ds_17_tfbarcolnom), 13, "%") ;
         lV130Produccion_test_v02ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV130Produccion_test_v02ds_21_tfbarnomcli), 13, "%") ;
         /* Using cursor H027Q3 */
         pr_default.execute(0, new Object[] {AV93EmprCod, Byte.valueOf(AV87BarSit), Byte.valueOf(AV88BarSitTo), Integer.valueOf(AV110Produccion_test_v02ds_1_tfbarcod), Integer.valueOf(AV111Produccion_test_v02ds_2_tfbarcod_to), Byte.valueOf(AV112Produccion_test_v02ds_3_tfbarcodreo), Byte.valueOf(AV113Produccion_test_v02ds_4_tfbarcodreo_to), lV114Produccion_test_v02ds_5_tfbarcodpar, AV115Produccion_test_v02ds_6_tfbarcodpar_sel, lV116Produccion_test_v02ds_7_tfbardisnum, AV117Produccion_test_v02ds_8_tfbardisnum_sel, Integer.valueOf(AV118Produccion_test_v02ds_9_tfclicod), Integer.valueOf(AV119Produccion_test_v02ds_10_tfclicod_to), lV120Produccion_test_v02ds_11_tfclinom, AV121Produccion_test_v02ds_12_tfclinom_sel, lV122Produccion_test_v02ds_13_tfbarser, AV123Produccion_test_v02ds_14_tfbarser_sel, lV124Produccion_test_v02ds_15_tfbarserdsc, AV125Produccion_test_v02ds_16_tfbarserdsc_sel, lV126Produccion_test_v02ds_17_tfbarcolnom, AV127Produccion_test_v02ds_18_tfbarcolnom_sel, Integer.valueOf(AV128Produccion_test_v02ds_19_tfbarcolnum), Integer.valueOf(AV129Produccion_test_v02ds_20_tfbarcolnum_to), lV130Produccion_test_v02ds_21_tfbarnomcli, AV131Produccion_test_v02ds_22_tfbarnomcli_sel, Byte.valueOf(AV132Produccion_test_v02ds_23_tfbarsit), Byte.valueOf(AV133Produccion_test_v02ds_24_tfbarsit_to), AV134Produccion_test_v02ds_25_tfbarfecgen, AV135Produccion_test_v02ds_26_tfbarfeccli, AV136Produccion_test_v02ds_27_tfbarfecfpr, AV137Produccion_test_v02ds_28_tfbarfecsal, Integer.valueOf(AV83CliCod), Integer.valueOf(AV84CliCodto), AV85BarDisNum, AV86BarDisNumTo, AV75BarFecGen, AV76BarFecGenTo, AV77BarFecCli, AV78BarFecCliTo, AV81BarFecSal, AV82BarFecSalto, AV79BarFecFpr, AV80BarFecFprto, AV71BarColNom, AV73BarColNomto, Integer.valueOf(AV72BarColNum), Integer.valueOf(AV74BarColNumto), AV67BarNomCli, AV69BarNomClito, Integer.valueOf(AV68BarNumCli), Integer.valueOf(AV70BarNumClito), Integer.valueOf(AV57BarCod), Integer.valueOf(AV60BarCodto), Byte.valueOf(AV58BarCodReo), Byte.valueOf(AV61BarCodReoto), AV59BarCodPar, AV62BarCodParto, AV54Cod_Idtx, AV55BarGirar, Short.valueOf(AV63BarTipArt), Short.valueOf(AV64BarTipArtto), AV65BarSer, AV66BarSerto, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_221_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_221_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_221_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2212( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1235BarNumCli = H027Q3_A1235BarNumCli[0] ;
            A4348DisUsrCod = H027Q3_A4348DisUsrCod[0] ;
            A4466BarAcaAnh = H027Q3_A4466BarAcaAnh[0] ;
            A2454BarGirar = H027Q3_A2454BarGirar[0] ;
            A161BarFecSal = H027Q3_A161BarFecSal[0] ;
            A158BarFecFpr = H027Q3_A158BarFecFpr[0] ;
            A155BarFecCli = H027Q3_A155BarFecCli[0] ;
            A159BarFecGen = H027Q3_A159BarFecGen[0] ;
            A213BarSit = H027Q3_A213BarSit[0] ;
            A1234BarNomCli = H027Q3_A1234BarNomCli[0] ;
            A136BarColNum = H027Q3_A136BarColNum[0] ;
            A135BarColNom = H027Q3_A135BarColNom[0] ;
            A13711BarTipArtD = H027Q3_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H027Q3_n13711BarTipArtD[0] ;
            A217BarTipArt = H027Q3_A217BarTipArt[0] ;
            n217BarTipArt = H027Q3_n217BarTipArt[0] ;
            A1652BarSerDsc = H027Q3_A1652BarSerDsc[0] ;
            A212BarSer = H027Q3_A212BarSer[0] ;
            A279CliNom = H027Q3_A279CliNom[0] ;
            A252CliCod = H027Q3_A252CliCod[0] ;
            n252CliCod = H027Q3_n252CliCod[0] ;
            A143BarDisNum = H027Q3_A143BarDisNum[0] ;
            A120BarAgrEst = H027Q3_A120BarAgrEst[0] ;
            A130BarCodPar = H027Q3_A130BarCodPar[0] ;
            A132BarCodReo = H027Q3_A132BarCodReo[0] ;
            A129BarCod = H027Q3_A129BarCod[0] ;
            A13933BarCuadern = H027Q3_A13933BarCuadern[0] ;
            n13933BarCuadern = H027Q3_n13933BarCuadern[0] ;
            A184BarMtr = H027Q3_A184BarMtr[0] ;
            A166BarKgm = H027Q3_A166BarKgm[0] ;
            A199BarPie1 = H027Q3_A199BarPie1[0] ;
            A365DisDes = H027Q3_A365DisDes[0] ;
            A898BarPieNDes = H027Q3_A898BarPieNDes[0] ;
            A2829BarProPer = H027Q3_A2829BarProPer[0] ;
            A361DisCod = H027Q3_A361DisCod[0] ;
            A396EmprCod = H027Q3_A396EmprCod[0] ;
            A4348DisUsrCod = H027Q3_A4348DisUsrCod[0] ;
            A13711BarTipArtD = H027Q3_A13711BarTipArtD[0] ;
            n13711BarTipArtD = H027Q3_n13711BarTipArtD[0] ;
            A279CliNom = H027Q3_A279CliNom[0] ;
            A13933BarCuadern = H027Q3_A13933BarCuadern[0] ;
            n13933BarCuadern = H027Q3_n13933BarCuadern[0] ;
            A184BarMtr = H027Q3_A184BarMtr[0] ;
            A166BarKgm = H027Q3_A166BarKgm[0] ;
            A199BarPie1 = H027Q3_A199BarPie1[0] ;
            A898BarPieNDes = H027Q3_A898BarPieNDes[0] ;
            GXt_char1 = A14204BarProPerI ;
            GXv_char2[0] = GXt_char1 ;
            new app.pinditexin(remoteHandle, context).execute( A396EmprCod, A2829BarProPer, GXv_char2) ;
            test_v02_impl.this.GXt_char1 = GXv_char2[0] ;
            A14204BarProPerI = GXt_char1 ;
            GXt_char1 = A13934BarNormas ;
            GXv_char2[0] = GXt_char1 ;
            new app.produccion.consultadeproduccion_normasestandarstextiles(remoteHandle, context).execute( A396EmprCod, A361DisCod, GXv_char2) ;
            test_v02_impl.this.GXt_char1 = GXv_char2[0] ;
            A13934BarNormas = GXt_char1 ;
            if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
            {
               A198BarPie = A898BarPieNDes ;
            }
            else
            {
               A198BarPie = A199BarPie1 ;
            }
            e1727Q2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(221) ;
         wb27Q0( ) ;
      }
      bGXsfl_221_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes27Q2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV93EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARKGM", GXutil.ltrim( localUtil.ntoc( AV48TotBarKgm, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARKGM", getSecureSignedToken( "", localUtil.format( AV48TotBarKgm, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARMTR", GXutil.ltrim( localUtil.ntoc( AV50TotBarMtr, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARMTR", getSecureSignedToken( "", localUtil.format( AV50TotBarMtr, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTBARPIE", GXutil.ltrim( localUtil.ntoc( AV52TotBarPie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52TotBarPie), "ZZZZZ9")));
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
      AV110Produccion_test_v02ds_1_tfbarcod = AV15TFBarCod ;
      AV111Produccion_test_v02ds_2_tfbarcod_to = AV16TFBarCod_To ;
      AV112Produccion_test_v02ds_3_tfbarcodreo = AV17TFBarCodReo ;
      AV113Produccion_test_v02ds_4_tfbarcodreo_to = AV18TFBarCodReo_To ;
      AV114Produccion_test_v02ds_5_tfbarcodpar = AV19TFBarCodPar ;
      AV115Produccion_test_v02ds_6_tfbarcodpar_sel = AV20TFBarCodPar_Sel ;
      AV116Produccion_test_v02ds_7_tfbardisnum = AV21TFBarDisNum ;
      AV117Produccion_test_v02ds_8_tfbardisnum_sel = AV22TFBarDisNum_Sel ;
      AV118Produccion_test_v02ds_9_tfclicod = AV23TFCliCod ;
      AV119Produccion_test_v02ds_10_tfclicod_to = AV24TFCliCod_To ;
      AV120Produccion_test_v02ds_11_tfclinom = AV25TFCliNom ;
      AV121Produccion_test_v02ds_12_tfclinom_sel = AV26TFCliNom_Sel ;
      AV122Produccion_test_v02ds_13_tfbarser = AV27TFBarSer ;
      AV123Produccion_test_v02ds_14_tfbarser_sel = AV28TFBarSer_Sel ;
      AV124Produccion_test_v02ds_15_tfbarserdsc = AV29TFBarSerDsc ;
      AV125Produccion_test_v02ds_16_tfbarserdsc_sel = AV30TFBarSerDsc_Sel ;
      AV126Produccion_test_v02ds_17_tfbarcolnom = AV31TFBarColNom ;
      AV127Produccion_test_v02ds_18_tfbarcolnom_sel = AV32TFBarColNom_Sel ;
      AV128Produccion_test_v02ds_19_tfbarcolnum = AV33TFBarColNum ;
      AV129Produccion_test_v02ds_20_tfbarcolnum_to = AV34TFBarColNum_To ;
      AV130Produccion_test_v02ds_21_tfbarnomcli = AV35TFBarNomCli ;
      AV131Produccion_test_v02ds_22_tfbarnomcli_sel = AV36TFBarNomCli_Sel ;
      AV132Produccion_test_v02ds_23_tfbarsit = AV37TFBarSit ;
      AV133Produccion_test_v02ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV134Produccion_test_v02ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV135Produccion_test_v02ds_26_tfbarfeccli = AV41TFBarFecCli ;
      AV136Produccion_test_v02ds_27_tfbarfecfpr = AV43TFBarFecFpr ;
      AV137Produccion_test_v02ds_28_tfbarfecsal = AV45TFBarFecSal ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV110Produccion_test_v02ds_1_tfbarcod) ,
                                           Integer.valueOf(AV111Produccion_test_v02ds_2_tfbarcod_to) ,
                                           Byte.valueOf(AV112Produccion_test_v02ds_3_tfbarcodreo) ,
                                           Byte.valueOf(AV113Produccion_test_v02ds_4_tfbarcodreo_to) ,
                                           AV115Produccion_test_v02ds_6_tfbarcodpar_sel ,
                                           AV114Produccion_test_v02ds_5_tfbarcodpar ,
                                           AV117Produccion_test_v02ds_8_tfbardisnum_sel ,
                                           AV116Produccion_test_v02ds_7_tfbardisnum ,
                                           Integer.valueOf(AV118Produccion_test_v02ds_9_tfclicod) ,
                                           Integer.valueOf(AV119Produccion_test_v02ds_10_tfclicod_to) ,
                                           AV121Produccion_test_v02ds_12_tfclinom_sel ,
                                           AV120Produccion_test_v02ds_11_tfclinom ,
                                           AV123Produccion_test_v02ds_14_tfbarser_sel ,
                                           AV122Produccion_test_v02ds_13_tfbarser ,
                                           AV125Produccion_test_v02ds_16_tfbarserdsc_sel ,
                                           AV124Produccion_test_v02ds_15_tfbarserdsc ,
                                           AV127Produccion_test_v02ds_18_tfbarcolnom_sel ,
                                           AV126Produccion_test_v02ds_17_tfbarcolnom ,
                                           Integer.valueOf(AV128Produccion_test_v02ds_19_tfbarcolnum) ,
                                           Integer.valueOf(AV129Produccion_test_v02ds_20_tfbarcolnum_to) ,
                                           AV131Produccion_test_v02ds_22_tfbarnomcli_sel ,
                                           AV130Produccion_test_v02ds_21_tfbarnomcli ,
                                           Byte.valueOf(AV132Produccion_test_v02ds_23_tfbarsit) ,
                                           Byte.valueOf(AV133Produccion_test_v02ds_24_tfbarsit_to) ,
                                           AV134Produccion_test_v02ds_25_tfbarfecgen ,
                                           AV135Produccion_test_v02ds_26_tfbarfeccli ,
                                           AV136Produccion_test_v02ds_27_tfbarfecfpr ,
                                           AV137Produccion_test_v02ds_28_tfbarfecsal ,
                                           Integer.valueOf(AV83CliCod) ,
                                           Integer.valueOf(AV84CliCodto) ,
                                           AV85BarDisNum ,
                                           AV86BarDisNumTo ,
                                           AV75BarFecGen ,
                                           AV76BarFecGenTo ,
                                           AV77BarFecCli ,
                                           AV78BarFecCliTo ,
                                           AV81BarFecSal ,
                                           AV82BarFecSalto ,
                                           AV79BarFecFpr ,
                                           AV80BarFecFprto ,
                                           AV71BarColNom ,
                                           AV73BarColNomto ,
                                           Integer.valueOf(AV72BarColNum) ,
                                           Integer.valueOf(AV74BarColNumto) ,
                                           AV67BarNomCli ,
                                           AV69BarNomClito ,
                                           Integer.valueOf(AV68BarNumCli) ,
                                           Integer.valueOf(AV70BarNumClito) ,
                                           Integer.valueOf(AV57BarCod) ,
                                           Integer.valueOf(AV60BarCodto) ,
                                           Byte.valueOf(AV58BarCodReo) ,
                                           Byte.valueOf(AV61BarCodReoto) ,
                                           AV59BarCodPar ,
                                           AV62BarCodParto ,
                                           AV54Cod_Idtx ,
                                           AV55BarGirar ,
                                           Short.valueOf(AV63BarTipArt) ,
                                           Short.valueOf(AV64BarTipArtto) ,
                                           AV65BarSer ,
                                           AV66BarSerto ,
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
                                           Byte.valueOf(AV87BarSit) ,
                                           Byte.valueOf(AV88BarSitTo) ,
                                           AV93EmprCod ,
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
      lV114Produccion_test_v02ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV114Produccion_test_v02ds_5_tfbarcodpar), 1, "%") ;
      lV116Produccion_test_v02ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV116Produccion_test_v02ds_7_tfbardisnum), 8, "%") ;
      lV120Produccion_test_v02ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV120Produccion_test_v02ds_11_tfclinom), 30, "%") ;
      lV122Produccion_test_v02ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV122Produccion_test_v02ds_13_tfbarser), 16, "%") ;
      lV124Produccion_test_v02ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV124Produccion_test_v02ds_15_tfbarserdsc), 26, "%") ;
      lV126Produccion_test_v02ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV126Produccion_test_v02ds_17_tfbarcolnom), 13, "%") ;
      lV130Produccion_test_v02ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV130Produccion_test_v02ds_21_tfbarnomcli), 13, "%") ;
      /* Using cursor H027Q5 */
      pr_default.execute(1, new Object[] {AV93EmprCod, Byte.valueOf(AV87BarSit), Byte.valueOf(AV88BarSitTo), Integer.valueOf(AV110Produccion_test_v02ds_1_tfbarcod), Integer.valueOf(AV111Produccion_test_v02ds_2_tfbarcod_to), Byte.valueOf(AV112Produccion_test_v02ds_3_tfbarcodreo), Byte.valueOf(AV113Produccion_test_v02ds_4_tfbarcodreo_to), lV114Produccion_test_v02ds_5_tfbarcodpar, AV115Produccion_test_v02ds_6_tfbarcodpar_sel, lV116Produccion_test_v02ds_7_tfbardisnum, AV117Produccion_test_v02ds_8_tfbardisnum_sel, Integer.valueOf(AV118Produccion_test_v02ds_9_tfclicod), Integer.valueOf(AV119Produccion_test_v02ds_10_tfclicod_to), lV120Produccion_test_v02ds_11_tfclinom, AV121Produccion_test_v02ds_12_tfclinom_sel, lV122Produccion_test_v02ds_13_tfbarser, AV123Produccion_test_v02ds_14_tfbarser_sel, lV124Produccion_test_v02ds_15_tfbarserdsc, AV125Produccion_test_v02ds_16_tfbarserdsc_sel, lV126Produccion_test_v02ds_17_tfbarcolnom, AV127Produccion_test_v02ds_18_tfbarcolnom_sel, Integer.valueOf(AV128Produccion_test_v02ds_19_tfbarcolnum), Integer.valueOf(AV129Produccion_test_v02ds_20_tfbarcolnum_to), lV130Produccion_test_v02ds_21_tfbarnomcli, AV131Produccion_test_v02ds_22_tfbarnomcli_sel, Byte.valueOf(AV132Produccion_test_v02ds_23_tfbarsit), Byte.valueOf(AV133Produccion_test_v02ds_24_tfbarsit_to), AV134Produccion_test_v02ds_25_tfbarfecgen, AV135Produccion_test_v02ds_26_tfbarfeccli, AV136Produccion_test_v02ds_27_tfbarfecfpr, AV137Produccion_test_v02ds_28_tfbarfecsal, Integer.valueOf(AV83CliCod), Integer.valueOf(AV84CliCodto), AV85BarDisNum, AV86BarDisNumTo, AV75BarFecGen, AV76BarFecGenTo, AV77BarFecCli, AV78BarFecCliTo, AV81BarFecSal, AV82BarFecSalto, AV79BarFecFpr, AV80BarFecFprto, AV71BarColNom, AV73BarColNomto, Integer.valueOf(AV72BarColNum), Integer.valueOf(AV74BarColNumto), AV67BarNomCli, AV69BarNomClito, Integer.valueOf(AV68BarNumCli), Integer.valueOf(AV70BarNumClito), Integer.valueOf(AV57BarCod), Integer.valueOf(AV60BarCodto), Byte.valueOf(AV58BarCodReo), Byte.valueOf(AV61BarCodReoto), AV59BarCodPar, AV62BarCodParto, AV54Cod_Idtx, AV55BarGirar, Short.valueOf(AV63BarTipArt), Short.valueOf(AV64BarTipArtto), AV65BarSer, AV66BarSerto});
      GRID_nRecordCount = H027Q5_AGRID_nRecordCount[0] ;
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
      AV110Produccion_test_v02ds_1_tfbarcod = AV15TFBarCod ;
      AV111Produccion_test_v02ds_2_tfbarcod_to = AV16TFBarCod_To ;
      AV112Produccion_test_v02ds_3_tfbarcodreo = AV17TFBarCodReo ;
      AV113Produccion_test_v02ds_4_tfbarcodreo_to = AV18TFBarCodReo_To ;
      AV114Produccion_test_v02ds_5_tfbarcodpar = AV19TFBarCodPar ;
      AV115Produccion_test_v02ds_6_tfbarcodpar_sel = AV20TFBarCodPar_Sel ;
      AV116Produccion_test_v02ds_7_tfbardisnum = AV21TFBarDisNum ;
      AV117Produccion_test_v02ds_8_tfbardisnum_sel = AV22TFBarDisNum_Sel ;
      AV118Produccion_test_v02ds_9_tfclicod = AV23TFCliCod ;
      AV119Produccion_test_v02ds_10_tfclicod_to = AV24TFCliCod_To ;
      AV120Produccion_test_v02ds_11_tfclinom = AV25TFCliNom ;
      AV121Produccion_test_v02ds_12_tfclinom_sel = AV26TFCliNom_Sel ;
      AV122Produccion_test_v02ds_13_tfbarser = AV27TFBarSer ;
      AV123Produccion_test_v02ds_14_tfbarser_sel = AV28TFBarSer_Sel ;
      AV124Produccion_test_v02ds_15_tfbarserdsc = AV29TFBarSerDsc ;
      AV125Produccion_test_v02ds_16_tfbarserdsc_sel = AV30TFBarSerDsc_Sel ;
      AV126Produccion_test_v02ds_17_tfbarcolnom = AV31TFBarColNom ;
      AV127Produccion_test_v02ds_18_tfbarcolnom_sel = AV32TFBarColNom_Sel ;
      AV128Produccion_test_v02ds_19_tfbarcolnum = AV33TFBarColNum ;
      AV129Produccion_test_v02ds_20_tfbarcolnum_to = AV34TFBarColNum_To ;
      AV130Produccion_test_v02ds_21_tfbarnomcli = AV35TFBarNomCli ;
      AV131Produccion_test_v02ds_22_tfbarnomcli_sel = AV36TFBarNomCli_Sel ;
      AV132Produccion_test_v02ds_23_tfbarsit = AV37TFBarSit ;
      AV133Produccion_test_v02ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV134Produccion_test_v02ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV135Produccion_test_v02ds_26_tfbarfeccli = AV41TFBarFecCli ;
      AV136Produccion_test_v02ds_27_tfbarfecfpr = AV43TFBarFecFpr ;
      AV137Produccion_test_v02ds_28_tfbarfecsal = AV45TFBarFecSal ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV83CliCod, AV84CliCodto, AV85BarDisNum, AV86BarDisNumTo, AV87BarSit, AV88BarSitTo, AV75BarFecGen, AV76BarFecGenTo, AV77BarFecCli, AV78BarFecCliTo, AV79BarFecFpr, AV80BarFecFprto, AV81BarFecSal, AV82BarFecSalto, AV71BarColNom, AV72BarColNum, AV73BarColNomto, AV74BarColNumto, AV67BarNomCli, AV68BarNumCli, AV69BarNomClito, AV70BarNumClito, AV65BarSer, AV66BarSerto, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV60BarCodto, AV61BarCodReoto, AV62BarCodParto, AV55BarGirar, AV63BarTipArt, AV64BarTipArtto, AV54Cod_Idtx, AV93EmprCod, AV15TFBarCod, AV16TFBarCod_To, AV17TFBarCodReo, AV18TFBarCodReo_To, AV19TFBarCodPar, AV20TFBarCodPar_Sel, AV21TFBarDisNum, AV22TFBarDisNum_Sel, AV23TFCliCod, AV24TFCliCod_To, AV25TFCliNom, AV26TFCliNom_Sel, AV27TFBarSer, AV28TFBarSer_Sel, AV29TFBarSerDsc, AV30TFBarSerDsc_Sel, AV31TFBarColNom, AV32TFBarColNom_Sel, AV33TFBarColNum, AV34TFBarColNum_To, AV35TFBarNomCli, AV36TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV41TFBarFecCli, AV43TFBarFecFpr, AV45TFBarFecSal, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48TotBarKgm, AV50TotBarMtr, AV52TotBarPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV110Produccion_test_v02ds_1_tfbarcod = AV15TFBarCod ;
      AV111Produccion_test_v02ds_2_tfbarcod_to = AV16TFBarCod_To ;
      AV112Produccion_test_v02ds_3_tfbarcodreo = AV17TFBarCodReo ;
      AV113Produccion_test_v02ds_4_tfbarcodreo_to = AV18TFBarCodReo_To ;
      AV114Produccion_test_v02ds_5_tfbarcodpar = AV19TFBarCodPar ;
      AV115Produccion_test_v02ds_6_tfbarcodpar_sel = AV20TFBarCodPar_Sel ;
      AV116Produccion_test_v02ds_7_tfbardisnum = AV21TFBarDisNum ;
      AV117Produccion_test_v02ds_8_tfbardisnum_sel = AV22TFBarDisNum_Sel ;
      AV118Produccion_test_v02ds_9_tfclicod = AV23TFCliCod ;
      AV119Produccion_test_v02ds_10_tfclicod_to = AV24TFCliCod_To ;
      AV120Produccion_test_v02ds_11_tfclinom = AV25TFCliNom ;
      AV121Produccion_test_v02ds_12_tfclinom_sel = AV26TFCliNom_Sel ;
      AV122Produccion_test_v02ds_13_tfbarser = AV27TFBarSer ;
      AV123Produccion_test_v02ds_14_tfbarser_sel = AV28TFBarSer_Sel ;
      AV124Produccion_test_v02ds_15_tfbarserdsc = AV29TFBarSerDsc ;
      AV125Produccion_test_v02ds_16_tfbarserdsc_sel = AV30TFBarSerDsc_Sel ;
      AV126Produccion_test_v02ds_17_tfbarcolnom = AV31TFBarColNom ;
      AV127Produccion_test_v02ds_18_tfbarcolnom_sel = AV32TFBarColNom_Sel ;
      AV128Produccion_test_v02ds_19_tfbarcolnum = AV33TFBarColNum ;
      AV129Produccion_test_v02ds_20_tfbarcolnum_to = AV34TFBarColNum_To ;
      AV130Produccion_test_v02ds_21_tfbarnomcli = AV35TFBarNomCli ;
      AV131Produccion_test_v02ds_22_tfbarnomcli_sel = AV36TFBarNomCli_Sel ;
      AV132Produccion_test_v02ds_23_tfbarsit = AV37TFBarSit ;
      AV133Produccion_test_v02ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV134Produccion_test_v02ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV135Produccion_test_v02ds_26_tfbarfeccli = AV41TFBarFecCli ;
      AV136Produccion_test_v02ds_27_tfbarfecfpr = AV43TFBarFecFpr ;
      AV137Produccion_test_v02ds_28_tfbarfecsal = AV45TFBarFecSal ;
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV83CliCod, AV84CliCodto, AV85BarDisNum, AV86BarDisNumTo, AV87BarSit, AV88BarSitTo, AV75BarFecGen, AV76BarFecGenTo, AV77BarFecCli, AV78BarFecCliTo, AV79BarFecFpr, AV80BarFecFprto, AV81BarFecSal, AV82BarFecSalto, AV71BarColNom, AV72BarColNum, AV73BarColNomto, AV74BarColNumto, AV67BarNomCli, AV68BarNumCli, AV69BarNomClito, AV70BarNumClito, AV65BarSer, AV66BarSerto, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV60BarCodto, AV61BarCodReoto, AV62BarCodParto, AV55BarGirar, AV63BarTipArt, AV64BarTipArtto, AV54Cod_Idtx, AV93EmprCod, AV15TFBarCod, AV16TFBarCod_To, AV17TFBarCodReo, AV18TFBarCodReo_To, AV19TFBarCodPar, AV20TFBarCodPar_Sel, AV21TFBarDisNum, AV22TFBarDisNum_Sel, AV23TFCliCod, AV24TFCliCod_To, AV25TFCliNom, AV26TFCliNom_Sel, AV27TFBarSer, AV28TFBarSer_Sel, AV29TFBarSerDsc, AV30TFBarSerDsc_Sel, AV31TFBarColNom, AV32TFBarColNom_Sel, AV33TFBarColNum, AV34TFBarColNum_To, AV35TFBarNomCli, AV36TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV41TFBarFecCli, AV43TFBarFecFpr, AV45TFBarFecSal, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48TotBarKgm, AV50TotBarMtr, AV52TotBarPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV110Produccion_test_v02ds_1_tfbarcod = AV15TFBarCod ;
      AV111Produccion_test_v02ds_2_tfbarcod_to = AV16TFBarCod_To ;
      AV112Produccion_test_v02ds_3_tfbarcodreo = AV17TFBarCodReo ;
      AV113Produccion_test_v02ds_4_tfbarcodreo_to = AV18TFBarCodReo_To ;
      AV114Produccion_test_v02ds_5_tfbarcodpar = AV19TFBarCodPar ;
      AV115Produccion_test_v02ds_6_tfbarcodpar_sel = AV20TFBarCodPar_Sel ;
      AV116Produccion_test_v02ds_7_tfbardisnum = AV21TFBarDisNum ;
      AV117Produccion_test_v02ds_8_tfbardisnum_sel = AV22TFBarDisNum_Sel ;
      AV118Produccion_test_v02ds_9_tfclicod = AV23TFCliCod ;
      AV119Produccion_test_v02ds_10_tfclicod_to = AV24TFCliCod_To ;
      AV120Produccion_test_v02ds_11_tfclinom = AV25TFCliNom ;
      AV121Produccion_test_v02ds_12_tfclinom_sel = AV26TFCliNom_Sel ;
      AV122Produccion_test_v02ds_13_tfbarser = AV27TFBarSer ;
      AV123Produccion_test_v02ds_14_tfbarser_sel = AV28TFBarSer_Sel ;
      AV124Produccion_test_v02ds_15_tfbarserdsc = AV29TFBarSerDsc ;
      AV125Produccion_test_v02ds_16_tfbarserdsc_sel = AV30TFBarSerDsc_Sel ;
      AV126Produccion_test_v02ds_17_tfbarcolnom = AV31TFBarColNom ;
      AV127Produccion_test_v02ds_18_tfbarcolnom_sel = AV32TFBarColNom_Sel ;
      AV128Produccion_test_v02ds_19_tfbarcolnum = AV33TFBarColNum ;
      AV129Produccion_test_v02ds_20_tfbarcolnum_to = AV34TFBarColNum_To ;
      AV130Produccion_test_v02ds_21_tfbarnomcli = AV35TFBarNomCli ;
      AV131Produccion_test_v02ds_22_tfbarnomcli_sel = AV36TFBarNomCli_Sel ;
      AV132Produccion_test_v02ds_23_tfbarsit = AV37TFBarSit ;
      AV133Produccion_test_v02ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV134Produccion_test_v02ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV135Produccion_test_v02ds_26_tfbarfeccli = AV41TFBarFecCli ;
      AV136Produccion_test_v02ds_27_tfbarfecfpr = AV43TFBarFecFpr ;
      AV137Produccion_test_v02ds_28_tfbarfecsal = AV45TFBarFecSal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV83CliCod, AV84CliCodto, AV85BarDisNum, AV86BarDisNumTo, AV87BarSit, AV88BarSitTo, AV75BarFecGen, AV76BarFecGenTo, AV77BarFecCli, AV78BarFecCliTo, AV79BarFecFpr, AV80BarFecFprto, AV81BarFecSal, AV82BarFecSalto, AV71BarColNom, AV72BarColNum, AV73BarColNomto, AV74BarColNumto, AV67BarNomCli, AV68BarNumCli, AV69BarNomClito, AV70BarNumClito, AV65BarSer, AV66BarSerto, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV60BarCodto, AV61BarCodReoto, AV62BarCodParto, AV55BarGirar, AV63BarTipArt, AV64BarTipArtto, AV54Cod_Idtx, AV93EmprCod, AV15TFBarCod, AV16TFBarCod_To, AV17TFBarCodReo, AV18TFBarCodReo_To, AV19TFBarCodPar, AV20TFBarCodPar_Sel, AV21TFBarDisNum, AV22TFBarDisNum_Sel, AV23TFCliCod, AV24TFCliCod_To, AV25TFCliNom, AV26TFCliNom_Sel, AV27TFBarSer, AV28TFBarSer_Sel, AV29TFBarSerDsc, AV30TFBarSerDsc_Sel, AV31TFBarColNom, AV32TFBarColNom_Sel, AV33TFBarColNum, AV34TFBarColNum_To, AV35TFBarNomCli, AV36TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV41TFBarFecCli, AV43TFBarFecFpr, AV45TFBarFecSal, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48TotBarKgm, AV50TotBarMtr, AV52TotBarPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV110Produccion_test_v02ds_1_tfbarcod = AV15TFBarCod ;
      AV111Produccion_test_v02ds_2_tfbarcod_to = AV16TFBarCod_To ;
      AV112Produccion_test_v02ds_3_tfbarcodreo = AV17TFBarCodReo ;
      AV113Produccion_test_v02ds_4_tfbarcodreo_to = AV18TFBarCodReo_To ;
      AV114Produccion_test_v02ds_5_tfbarcodpar = AV19TFBarCodPar ;
      AV115Produccion_test_v02ds_6_tfbarcodpar_sel = AV20TFBarCodPar_Sel ;
      AV116Produccion_test_v02ds_7_tfbardisnum = AV21TFBarDisNum ;
      AV117Produccion_test_v02ds_8_tfbardisnum_sel = AV22TFBarDisNum_Sel ;
      AV118Produccion_test_v02ds_9_tfclicod = AV23TFCliCod ;
      AV119Produccion_test_v02ds_10_tfclicod_to = AV24TFCliCod_To ;
      AV120Produccion_test_v02ds_11_tfclinom = AV25TFCliNom ;
      AV121Produccion_test_v02ds_12_tfclinom_sel = AV26TFCliNom_Sel ;
      AV122Produccion_test_v02ds_13_tfbarser = AV27TFBarSer ;
      AV123Produccion_test_v02ds_14_tfbarser_sel = AV28TFBarSer_Sel ;
      AV124Produccion_test_v02ds_15_tfbarserdsc = AV29TFBarSerDsc ;
      AV125Produccion_test_v02ds_16_tfbarserdsc_sel = AV30TFBarSerDsc_Sel ;
      AV126Produccion_test_v02ds_17_tfbarcolnom = AV31TFBarColNom ;
      AV127Produccion_test_v02ds_18_tfbarcolnom_sel = AV32TFBarColNom_Sel ;
      AV128Produccion_test_v02ds_19_tfbarcolnum = AV33TFBarColNum ;
      AV129Produccion_test_v02ds_20_tfbarcolnum_to = AV34TFBarColNum_To ;
      AV130Produccion_test_v02ds_21_tfbarnomcli = AV35TFBarNomCli ;
      AV131Produccion_test_v02ds_22_tfbarnomcli_sel = AV36TFBarNomCli_Sel ;
      AV132Produccion_test_v02ds_23_tfbarsit = AV37TFBarSit ;
      AV133Produccion_test_v02ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV134Produccion_test_v02ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV135Produccion_test_v02ds_26_tfbarfeccli = AV41TFBarFecCli ;
      AV136Produccion_test_v02ds_27_tfbarfecfpr = AV43TFBarFecFpr ;
      AV137Produccion_test_v02ds_28_tfbarfecsal = AV45TFBarFecSal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV83CliCod, AV84CliCodto, AV85BarDisNum, AV86BarDisNumTo, AV87BarSit, AV88BarSitTo, AV75BarFecGen, AV76BarFecGenTo, AV77BarFecCli, AV78BarFecCliTo, AV79BarFecFpr, AV80BarFecFprto, AV81BarFecSal, AV82BarFecSalto, AV71BarColNom, AV72BarColNum, AV73BarColNomto, AV74BarColNumto, AV67BarNomCli, AV68BarNumCli, AV69BarNomClito, AV70BarNumClito, AV65BarSer, AV66BarSerto, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV60BarCodto, AV61BarCodReoto, AV62BarCodParto, AV55BarGirar, AV63BarTipArt, AV64BarTipArtto, AV54Cod_Idtx, AV93EmprCod, AV15TFBarCod, AV16TFBarCod_To, AV17TFBarCodReo, AV18TFBarCodReo_To, AV19TFBarCodPar, AV20TFBarCodPar_Sel, AV21TFBarDisNum, AV22TFBarDisNum_Sel, AV23TFCliCod, AV24TFCliCod_To, AV25TFCliNom, AV26TFCliNom_Sel, AV27TFBarSer, AV28TFBarSer_Sel, AV29TFBarSerDsc, AV30TFBarSerDsc_Sel, AV31TFBarColNom, AV32TFBarColNom_Sel, AV33TFBarColNum, AV34TFBarColNum_To, AV35TFBarNomCli, AV36TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV41TFBarFecCli, AV43TFBarFecFpr, AV45TFBarFecSal, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48TotBarKgm, AV50TotBarMtr, AV52TotBarPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV110Produccion_test_v02ds_1_tfbarcod = AV15TFBarCod ;
      AV111Produccion_test_v02ds_2_tfbarcod_to = AV16TFBarCod_To ;
      AV112Produccion_test_v02ds_3_tfbarcodreo = AV17TFBarCodReo ;
      AV113Produccion_test_v02ds_4_tfbarcodreo_to = AV18TFBarCodReo_To ;
      AV114Produccion_test_v02ds_5_tfbarcodpar = AV19TFBarCodPar ;
      AV115Produccion_test_v02ds_6_tfbarcodpar_sel = AV20TFBarCodPar_Sel ;
      AV116Produccion_test_v02ds_7_tfbardisnum = AV21TFBarDisNum ;
      AV117Produccion_test_v02ds_8_tfbardisnum_sel = AV22TFBarDisNum_Sel ;
      AV118Produccion_test_v02ds_9_tfclicod = AV23TFCliCod ;
      AV119Produccion_test_v02ds_10_tfclicod_to = AV24TFCliCod_To ;
      AV120Produccion_test_v02ds_11_tfclinom = AV25TFCliNom ;
      AV121Produccion_test_v02ds_12_tfclinom_sel = AV26TFCliNom_Sel ;
      AV122Produccion_test_v02ds_13_tfbarser = AV27TFBarSer ;
      AV123Produccion_test_v02ds_14_tfbarser_sel = AV28TFBarSer_Sel ;
      AV124Produccion_test_v02ds_15_tfbarserdsc = AV29TFBarSerDsc ;
      AV125Produccion_test_v02ds_16_tfbarserdsc_sel = AV30TFBarSerDsc_Sel ;
      AV126Produccion_test_v02ds_17_tfbarcolnom = AV31TFBarColNom ;
      AV127Produccion_test_v02ds_18_tfbarcolnom_sel = AV32TFBarColNom_Sel ;
      AV128Produccion_test_v02ds_19_tfbarcolnum = AV33TFBarColNum ;
      AV129Produccion_test_v02ds_20_tfbarcolnum_to = AV34TFBarColNum_To ;
      AV130Produccion_test_v02ds_21_tfbarnomcli = AV35TFBarNomCli ;
      AV131Produccion_test_v02ds_22_tfbarnomcli_sel = AV36TFBarNomCli_Sel ;
      AV132Produccion_test_v02ds_23_tfbarsit = AV37TFBarSit ;
      AV133Produccion_test_v02ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV134Produccion_test_v02ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV135Produccion_test_v02ds_26_tfbarfeccli = AV41TFBarFecCli ;
      AV136Produccion_test_v02ds_27_tfbarfecfpr = AV43TFBarFecFpr ;
      AV137Produccion_test_v02ds_28_tfbarfecsal = AV45TFBarFecSal ;
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
         gxgrgrid_refresh( subGrid_Rows, AV83CliCod, AV84CliCodto, AV85BarDisNum, AV86BarDisNumTo, AV87BarSit, AV88BarSitTo, AV75BarFecGen, AV76BarFecGenTo, AV77BarFecCli, AV78BarFecCliTo, AV79BarFecFpr, AV80BarFecFprto, AV81BarFecSal, AV82BarFecSalto, AV71BarColNom, AV72BarColNum, AV73BarColNomto, AV74BarColNumto, AV67BarNomCli, AV68BarNumCli, AV69BarNomClito, AV70BarNumClito, AV65BarSer, AV66BarSerto, AV57BarCod, AV58BarCodReo, AV59BarCodPar, AV60BarCodto, AV61BarCodReoto, AV62BarCodParto, AV55BarGirar, AV63BarTipArt, AV64BarTipArtto, AV54Cod_Idtx, AV93EmprCod, AV15TFBarCod, AV16TFBarCod_To, AV17TFBarCodReo, AV18TFBarCodReo_To, AV19TFBarCodPar, AV20TFBarCodPar_Sel, AV21TFBarDisNum, AV22TFBarDisNum_Sel, AV23TFCliCod, AV24TFCliCod_To, AV25TFCliNom, AV26TFCliNom_Sel, AV27TFBarSer, AV28TFBarSer_Sel, AV29TFBarSerDsc, AV30TFBarSerDsc_Sel, AV31TFBarColNom, AV32TFBarColNom_Sel, AV33TFBarColNum, AV34TFBarColNum_To, AV35TFBarNomCli, AV36TFBarNomCli_Sel, AV37TFBarSit, AV38TFBarSit_To, AV39TFBarFecGen, AV41TFBarFecCli, AV43TFBarFecFpr, AV45TFBarFecSal, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV48TotBarKgm, AV50TotBarMtr, AV52TotBarPie) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV109Pgmname = "Produccion.Test_v02" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV109Pgmname", AV109Pgmname);
      Gx_err = (short)(0) ;
      edtavBarfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfascod_Enabled), 5, 0), !bGXsfl_221_Refreshing);
      edtavBarfassig_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfassig_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfassig_Enabled), 5, 0), !bGXsfl_221_Refreshing);
      edtavBaralbultimo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbultimo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbultimo_Enabled), 5, 0), !bGXsfl_221_Refreshing);
      edtavBaralbfact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbfact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbfact_Enabled), 5, 0), !bGXsfl_221_Refreshing);
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

   public void strup27Q0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1527Q2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBARTIPART_DATA"), AV91BarTipArt_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vBARTIPARTTO_DATA"), AV92BarTipArtto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOD_IDTX_DATA"), AV89Cod_Idtx_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV47DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_221 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_221"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
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
            AV83CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83CliCod), 6, 0));
         }
         else
         {
            AV83CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV83CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV83CliCod), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV84CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84CliCodto), 6, 0));
         }
         else
         {
            AV84CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84CliCodto), 6, 0));
         }
         AV85BarDisNum = httpContext.cgiGet( edtavBardisnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85BarDisNum", AV85BarDisNum);
         AV86BarDisNumTo = httpContext.cgiGet( edtavBardisnumto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86BarDisNumTo", AV86BarDisNumTo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSIT");
            GX_FocusControl = edtavBarsit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV87BarSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87BarSit), 2, 0));
         }
         else
         {
            AV87BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87BarSit), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSITTO");
            GX_FocusControl = edtavBarsitto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV88BarSitTo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88BarSitTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88BarSitTo), 2, 0));
         }
         else
         {
            AV88BarSitTo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsitto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88BarSitTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88BarSitTo), 2, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgen_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGEN");
            GX_FocusControl = edtavBarfecgen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV75BarFecGen = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75BarFecGen", localUtil.format(AV75BarFecGen, "99/99/99"));
         }
         else
         {
            AV75BarFecGen = localUtil.ctod( httpContext.cgiGet( edtavBarfecgen_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV75BarFecGen", localUtil.format(AV75BarFecGen, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecgento_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECGENTO");
            GX_FocusControl = edtavBarfecgento_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV76BarFecGenTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76BarFecGenTo", localUtil.format(AV76BarFecGenTo, "99/99/99"));
         }
         else
         {
            AV76BarFecGenTo = localUtil.ctod( httpContext.cgiGet( edtavBarfecgento_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV76BarFecGenTo", localUtil.format(AV76BarFecGenTo, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfeccli_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECCLI");
            GX_FocusControl = edtavBarfeccli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV77BarFecCli = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77BarFecCli", localUtil.format(AV77BarFecCli, "99/99/99"));
         }
         else
         {
            AV77BarFecCli = localUtil.ctod( httpContext.cgiGet( edtavBarfeccli_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77BarFecCli", localUtil.format(AV77BarFecCli, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecclito_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECCLITO");
            GX_FocusControl = edtavBarfecclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV78BarFecCliTo = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78BarFecCliTo", localUtil.format(AV78BarFecCliTo, "99/99/99"));
         }
         else
         {
            AV78BarFecCliTo = localUtil.ctod( httpContext.cgiGet( edtavBarfecclito_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78BarFecCliTo", localUtil.format(AV78BarFecCliTo, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecfpr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECFPR");
            GX_FocusControl = edtavBarfecfpr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV79BarFecFpr = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79BarFecFpr", localUtil.format(AV79BarFecFpr, "99/99/99"));
         }
         else
         {
            AV79BarFecFpr = localUtil.ctod( httpContext.cgiGet( edtavBarfecfpr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV79BarFecFpr", localUtil.format(AV79BarFecFpr, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecfprto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECFPRTO");
            GX_FocusControl = edtavBarfecfprto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV80BarFecFprto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80BarFecFprto", localUtil.format(AV80BarFecFprto, "99/99/99"));
         }
         else
         {
            AV80BarFecFprto = localUtil.ctod( httpContext.cgiGet( edtavBarfecfprto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80BarFecFprto", localUtil.format(AV80BarFecFprto, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecsal_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSAL");
            GX_FocusControl = edtavBarfecsal_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81BarFecSal = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81BarFecSal", localUtil.format(AV81BarFecSal, "99/99/99"));
         }
         else
         {
            AV81BarFecSal = localUtil.ctod( httpContext.cgiGet( edtavBarfecsal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81BarFecSal", localUtil.format(AV81BarFecSal, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecsalto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECSALTO");
            GX_FocusControl = edtavBarfecsalto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV82BarFecSalto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82BarFecSalto", localUtil.format(AV82BarFecSalto, "99/99/99"));
         }
         else
         {
            AV82BarFecSalto = localUtil.ctod( httpContext.cgiGet( edtavBarfecsalto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV82BarFecSalto", localUtil.format(AV82BarFecSalto, "99/99/99"));
         }
         AV71BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71BarColNom", AV71BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV72BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarColNum), 6, 0));
         }
         else
         {
            AV72BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV72BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72BarColNum), 6, 0));
         }
         AV73BarColNomto = httpContext.cgiGet( edtavBarcolnomto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73BarColNomto", AV73BarColNomto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUMTO");
            GX_FocusControl = edtavBarcolnumto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV74BarColNumto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74BarColNumto), 6, 0));
         }
         else
         {
            AV74BarColNumto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnumto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV74BarColNumto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74BarColNumto), 6, 0));
         }
         AV67BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67BarNomCli", AV67BarNomCli);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLI");
            GX_FocusControl = edtavBarnumcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV68BarNumCli = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68BarNumCli), 6, 0));
         }
         else
         {
            AV68BarNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV68BarNumCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV68BarNumCli), 6, 0));
         }
         AV69BarNomClito = httpContext.cgiGet( edtavBarnomclito_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69BarNomClito", AV69BarNomClito);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARNUMCLITO");
            GX_FocusControl = edtavBarnumclito_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV70BarNumClito = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70BarNumClito), 6, 0));
         }
         else
         {
            AV70BarNumClito = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarnumclito_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV70BarNumClito", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70BarNumClito), 6, 0));
         }
         AV65BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65BarSer", AV65BarSer);
         AV66BarSerto = httpContext.cgiGet( edtavBarserto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66BarSerto", AV66BarSerto);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV57BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57BarCod), 8, 0));
         }
         else
         {
            AV57BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57BarCod), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV58BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58BarCodReo", GXutil.str( AV58BarCodReo, 1, 0));
         }
         else
         {
            AV58BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58BarCodReo", GXutil.str( AV58BarCodReo, 1, 0));
         }
         AV59BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV59BarCodPar", AV59BarCodPar);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODTO");
            GX_FocusControl = edtavBarcodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV60BarCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCodto), 8, 0));
         }
         else
         {
            AV60BarCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60BarCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV60BarCodto), 8, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREOTO");
            GX_FocusControl = edtavBarcodreoto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV61BarCodReoto = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReoto", GXutil.str( AV61BarCodReoto, 1, 0));
         }
         else
         {
            AV61BarCodReoto = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreoto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61BarCodReoto", GXutil.str( AV61BarCodReoto, 1, 0));
         }
         AV62BarCodParto = httpContext.cgiGet( edtavBarcodparto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV62BarCodParto", AV62BarCodParto);
         AV55BarGirar = httpContext.cgiGet( edtavBargirar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55BarGirar", AV55BarGirar);
         cmbavMuestras.setName( cmbavMuestras.getInternalname() );
         cmbavMuestras.setValue( httpContext.cgiGet( cmbavMuestras.getInternalname()) );
         AV56Muestras = httpContext.cgiGet( cmbavMuestras.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Muestras", AV56Muestras);
         AV49TotValueBarKgm = httpContext.cgiGet( edtavTotvaluebarkgm_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49TotValueBarKgm", AV49TotValueBarKgm);
         AV51TotValueBarMtr = httpContext.cgiGet( edtavTotvaluebarmtr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51TotValueBarMtr", AV51TotValueBarMtr);
         AV53TotValueBarPie = httpContext.cgiGet( edtavTotvaluebarpie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53TotValueBarPie", AV53TotValueBarPie);
         AV109Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109Pgmname", AV109Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPART");
            GX_FocusControl = edtavBartipart_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63BarTipArt = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63BarTipArt), 4, 0));
         }
         else
         {
            AV63BarTipArt = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipart_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63BarTipArt), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPARTTO");
            GX_FocusControl = edtavBartipartto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV64BarTipArtto = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64BarTipArtto), 4, 0));
         }
         else
         {
            AV64BarTipArtto = (short)(localUtil.ctol( httpContext.cgiGet( edtavBartipartto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64BarTipArtto), 4, 0));
         }
         AV54Cod_Idtx = httpContext.cgiGet( edtavCod_idtx_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54Cod_Idtx", AV54Cod_Idtx);
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
            AV42DDO_BarFecCliAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_BarFecCliAuxDate", localUtil.format(AV42DDO_BarFecCliAuxDate, "99/99/99"));
         }
         else
         {
            AV42DDO_BarFecCliAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfeccliauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42DDO_BarFecCliAuxDate", localUtil.format(AV42DDO_BarFecCliAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECFPRAUXDATE");
            GX_FocusControl = edtavDdo_barfecfprauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44DDO_BarFecFprAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44DDO_BarFecFprAuxDate", localUtil.format(AV44DDO_BarFecFprAuxDate, "99/99/99"));
         }
         else
         {
            AV44DDO_BarFecFprAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecfprauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44DDO_BarFecFprAuxDate", localUtil.format(AV44DDO_BarFecFprAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_BARFECSALAUXDATE");
            GX_FocusControl = edtavDdo_barfecsalauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46DDO_BarFecSalAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46DDO_BarFecSalAuxDate", localUtil.format(AV46DDO_BarFecSalAuxDate, "99/99/99"));
         }
         else
         {
            AV46DDO_BarFecSalAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_barfecsalauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46DDO_BarFecSalAuxDate", localUtil.format(AV46DDO_BarFecSalAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"Test_v02");
         AV109Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV109Pgmname", AV109Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV109Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("produccion\\test_v02:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV83CliCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV84CliCodto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUM"), AV85BarDisNum) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARDISNUMTO"), AV86BarDisNumTo) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV87BarSit )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARSITTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV88BarSitTo )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGEN"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV75BarFecGen)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECGENTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV76BarFecGenTo)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECCLI"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV77BarFecCli)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECCLITO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV78BarFecCliTo)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECFPR"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV79BarFecFpr)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECFPRTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV80BarFecFprto)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECSAL"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV81BarFecSal)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vBARFECSALTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV82BarFecSalto)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOM"), AV71BarColNom) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV72BarColNum )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCOLNOMTO"), AV73BarColNomto) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOLNUMTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV74BarColNumto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLI"), AV67BarNomCli) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV68BarNumCli )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARNOMCLITO"), AV69BarNomClito) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARNUMCLITO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV70BarNumClito )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSER"), AV65BarSer) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARSERTO"), AV66BarSerto) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV57BarCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV58BarCodReo )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPAR"), AV59BarCodPar) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV60BarCodto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARCODREOTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV61BarCodReoto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARCODPARTO"), AV62BarCodParto) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vBARGIRAR"), AV55BarGirar) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPART"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV63BarTipArt )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vBARTIPARTTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV64BarTipArtto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vCOD_IDTX"), AV54Cod_Idtx) != 0 )
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
      e1527Q2 ();
      if (returnInSub) return;
   }

   public void e1527Q2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV94Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      test_v02_impl.this.GXt_char1 = GXv_char2[0] ;
      AV94Station = GXt_char1 ;
      GXv_char2[0] = AV93EmprCod ;
      GXv_char3[0] = AV95EmprNom ;
      GXv_char4[0] = AV96UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV94Station, GXv_char2, GXv_char3, GXv_char4) ;
      test_v02_impl.this.AV93EmprCod = GXv_char2[0] ;
      test_v02_impl.this.AV95EmprNom = GXv_char3[0] ;
      test_v02_impl.this.AV96UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93EmprCod", AV93EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV93EmprCod, "@!"))));
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
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Consulta Produccion v02", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV47DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV47DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      AV87BarSit = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87BarSit), 2, 0));
      AV88BarSitTo = (byte)(11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88BarSitTo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV88BarSitTo), 2, 0));
      AV75BarFecGen = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75BarFecGen", localUtil.format(AV75BarFecGen, "99/99/99"));
      AV76BarFecGenTo = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV76BarFecGenTo", localUtil.format(AV76BarFecGenTo, "99/99/99"));
      GXt_int7 = (byte)(AV97Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV93EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      test_v02_impl.this.GXt_int7 = GXv_int8[0] ;
      AV97Moda21 = GXt_int7 ;
      GXt_int7 = (byte)(AV98cuaderno) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV93EmprCod, httpContext.getMessage( "CNOENC", ""), GXv_int8) ;
      test_v02_impl.this.GXt_int7 = GXv_int8[0] ;
      AV98cuaderno = GXt_int7 ;
      GXt_int7 = (byte)(AV99STNORM) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV93EmprCod, httpContext.getMessage( "STNORM", ""), GXv_int8) ;
      test_v02_impl.this.GXt_int7 = GXv_int8[0] ;
      AV99STNORM = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV99STNORM", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV99STNORM), 4, 0));
      AV100Barplf = "N" ;
      AV101BarplfTo = "S" ;
   }

   public void e1627Q2( )
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
      S182 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S192 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S202 ();
      if (returnInSub) return;
      AV110Produccion_test_v02ds_1_tfbarcod = AV15TFBarCod ;
      AV111Produccion_test_v02ds_2_tfbarcod_to = AV16TFBarCod_To ;
      AV112Produccion_test_v02ds_3_tfbarcodreo = AV17TFBarCodReo ;
      AV113Produccion_test_v02ds_4_tfbarcodreo_to = AV18TFBarCodReo_To ;
      AV114Produccion_test_v02ds_5_tfbarcodpar = AV19TFBarCodPar ;
      AV115Produccion_test_v02ds_6_tfbarcodpar_sel = AV20TFBarCodPar_Sel ;
      AV116Produccion_test_v02ds_7_tfbardisnum = AV21TFBarDisNum ;
      AV117Produccion_test_v02ds_8_tfbardisnum_sel = AV22TFBarDisNum_Sel ;
      AV118Produccion_test_v02ds_9_tfclicod = AV23TFCliCod ;
      AV119Produccion_test_v02ds_10_tfclicod_to = AV24TFCliCod_To ;
      AV120Produccion_test_v02ds_11_tfclinom = AV25TFCliNom ;
      AV121Produccion_test_v02ds_12_tfclinom_sel = AV26TFCliNom_Sel ;
      AV122Produccion_test_v02ds_13_tfbarser = AV27TFBarSer ;
      AV123Produccion_test_v02ds_14_tfbarser_sel = AV28TFBarSer_Sel ;
      AV124Produccion_test_v02ds_15_tfbarserdsc = AV29TFBarSerDsc ;
      AV125Produccion_test_v02ds_16_tfbarserdsc_sel = AV30TFBarSerDsc_Sel ;
      AV126Produccion_test_v02ds_17_tfbarcolnom = AV31TFBarColNom ;
      AV127Produccion_test_v02ds_18_tfbarcolnom_sel = AV32TFBarColNom_Sel ;
      AV128Produccion_test_v02ds_19_tfbarcolnum = AV33TFBarColNum ;
      AV129Produccion_test_v02ds_20_tfbarcolnum_to = AV34TFBarColNum_To ;
      AV130Produccion_test_v02ds_21_tfbarnomcli = AV35TFBarNomCli ;
      AV131Produccion_test_v02ds_22_tfbarnomcli_sel = AV36TFBarNomCli_Sel ;
      AV132Produccion_test_v02ds_23_tfbarsit = AV37TFBarSit ;
      AV133Produccion_test_v02ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV134Produccion_test_v02ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV135Produccion_test_v02ds_26_tfbarfeccli = AV41TFBarFecCli ;
      AV136Produccion_test_v02ds_27_tfbarfecfpr = AV43TFBarFecFpr ;
      AV137Produccion_test_v02ds_28_tfbarfecsal = AV45TFBarFecSal ;
      /*  Sending Event outputs  */
   }

   public void e1427Q2( )
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
            AV15TFBarCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFBarCod), 8, 0));
            AV16TFBarCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodReo") == 0 )
         {
            AV17TFBarCodReo = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFBarCodReo", GXutil.str( AV17TFBarCodReo, 1, 0));
            AV18TFBarCodReo_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFBarCodReo_To", GXutil.str( AV18TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarCodPar") == 0 )
         {
            AV19TFBarCodPar = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFBarCodPar", AV19TFBarCodPar);
            AV20TFBarCodPar_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFBarCodPar_Sel", AV20TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarDisNum") == 0 )
         {
            AV21TFBarDisNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFBarDisNum", AV21TFBarDisNum);
            AV22TFBarDisNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFBarDisNum_Sel", AV22TFBarDisNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliCod") == 0 )
         {
            AV23TFCliCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFCliCod), 6, 0));
            AV24TFCliCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliNom") == 0 )
         {
            AV25TFCliNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFCliNom", AV25TFCliNom);
            AV26TFCliNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFCliNom_Sel", AV26TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSer") == 0 )
         {
            AV27TFBarSer = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFBarSer", AV27TFBarSer);
            AV28TFBarSer_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarSer_Sel", AV28TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarSerDsc") == 0 )
         {
            AV29TFBarSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFBarSerDsc", AV29TFBarSerDsc);
            AV30TFBarSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarSerDsc_Sel", AV30TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNom") == 0 )
         {
            AV31TFBarColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarColNom", AV31TFBarColNom);
            AV32TFBarColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarColNom_Sel", AV32TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarColNum") == 0 )
         {
            AV33TFBarColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFBarColNum), 6, 0));
            AV34TFBarColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarNomCli") == 0 )
         {
            AV35TFBarNomCli = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFBarNomCli", AV35TFBarNomCli);
            AV36TFBarNomCli_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFBarNomCli_Sel", AV36TFBarNomCli_Sel);
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
            AV41TFBarFecCli = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFBarFecCli", localUtil.format(AV41TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecFpr") == 0 )
         {
            AV43TFBarFecFpr = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFBarFecFpr", localUtil.format(AV43TFBarFecFpr, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "BarFecSal") == 0 )
         {
            AV45TFBarFecSal = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFBarFecSal", localUtil.format(AV45TFBarFecSal, "99/99/99"));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1727Q2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXt_char1 = AV103BarFasCod ;
      GXv_char4[0] = GXt_char1 ;
      new app.pget_barfascod(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_char4) ;
      test_v02_impl.this.GXt_char1 = GXv_char4[0] ;
      AV103BarFasCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavBarfascod_Internalname, AV103BarFasCod);
      GXt_char1 = AV104BarFasSig ;
      GXv_char4[0] = GXt_char1 ;
      new app.pget_barfassig(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_char4) ;
      test_v02_impl.this.GXt_char1 = GXv_char4[0] ;
      AV104BarFasSig = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavBarfassig_Internalname, AV104BarFasSig);
      GXt_int10 = AV105BarAlbUltimo ;
      GXv_int11[0] = GXt_int10 ;
      new app.produccion.consultadeproduccion_albaranultimo(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int11) ;
      test_v02_impl.this.GXt_int10 = GXv_int11[0] ;
      AV105BarAlbUltimo = GXt_int10 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavBaralbultimo_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV105BarAlbUltimo), 10, 0));
      GXt_int12 = AV106BarAlbFact ;
      GXv_int13[0] = GXt_int12 ;
      new app.produccion.consultadeproduccion_factura(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int13) ;
      test_v02_impl.this.GXt_int12 = GXv_int13[0] ;
      AV106BarAlbFact = GXt_int12 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavBaralbfact_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV106BarAlbFact), 8, 0));
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
   }

   public void e1327Q2( )
   {
      /* Combo_cod_idtx_Onoptionclicked Routine */
      returnInSub = false ;
      AV54Cod_Idtx = Combo_cod_idtx_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54Cod_Idtx", AV54Cod_Idtx);
      /*  Sending Event outputs  */
   }

   public void e1227Q2( )
   {
      /* Combo_bartipartto_Onoptionclicked Routine */
      returnInSub = false ;
      AV64BarTipArtto = (short)(GXutil.lval( Combo_bartipartto_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64BarTipArtto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64BarTipArtto), 4, 0));
      /*  Sending Event outputs  */
   }

   public void e1127Q2( )
   {
      /* Combo_bartipart_Onoptionclicked Routine */
      returnInSub = false ;
      AV63BarTipArt = (short)(GXutil.lval( Combo_bartipart_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63BarTipArt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63BarTipArt), 4, 0));
      /*  Sending Event outputs  */
   }

   public void S172( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV109Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV109Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV109Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S172 ();
      if (returnInSub) return;
      AV138GXV1 = 1 ;
      while ( AV138GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV138GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOD") == 0 )
         {
            AV15TFBarCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFBarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFBarCod), 8, 0));
            AV16TFBarCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFBarCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFBarCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODREO") == 0 )
         {
            AV17TFBarCodReo = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFBarCodReo", GXutil.str( AV17TFBarCodReo, 1, 0));
            AV18TFBarCodReo_To = (byte)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFBarCodReo_To", GXutil.str( AV18TFBarCodReo_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR") == 0 )
         {
            AV19TFBarCodPar = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFBarCodPar", AV19TFBarCodPar);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCODPAR_SEL") == 0 )
         {
            AV20TFBarCodPar_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFBarCodPar_Sel", AV20TFBarCodPar_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISNUM") == 0 )
         {
            AV21TFBarDisNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TFBarDisNum", AV21TFBarDisNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARDISNUM_SEL") == 0 )
         {
            AV22TFBarDisNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22TFBarDisNum_Sel", AV22TFBarDisNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLICOD") == 0 )
         {
            AV23TFCliCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFCliCod), 6, 0));
            AV24TFCliCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFCliCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFCliCod_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM") == 0 )
         {
            AV25TFCliNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFCliNom", AV25TFCliNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLINOM_SEL") == 0 )
         {
            AV26TFCliNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFCliNom_Sel", AV26TFCliNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER") == 0 )
         {
            AV27TFBarSer = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFBarSer", AV27TFBarSer);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSER_SEL") == 0 )
         {
            AV28TFBarSer_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFBarSer_Sel", AV28TFBarSer_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC") == 0 )
         {
            AV29TFBarSerDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFBarSerDsc", AV29TFBarSerDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARSERDSC_SEL") == 0 )
         {
            AV30TFBarSerDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFBarSerDsc_Sel", AV30TFBarSerDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM") == 0 )
         {
            AV31TFBarColNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFBarColNom", AV31TFBarColNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNOM_SEL") == 0 )
         {
            AV32TFBarColNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFBarColNom_Sel", AV32TFBarColNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARCOLNUM") == 0 )
         {
            AV33TFBarColNum = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFBarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFBarColNum), 6, 0));
            AV34TFBarColNum_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFBarColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34TFBarColNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI") == 0 )
         {
            AV35TFBarNomCli = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFBarNomCli", AV35TFBarNomCli);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARNOMCLI_SEL") == 0 )
         {
            AV36TFBarNomCli_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFBarNomCli_Sel", AV36TFBarNomCli_Sel);
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
            AV41TFBarFecCli = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFBarFecCli", localUtil.format(AV41TFBarFecCli, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECFPR") == 0 )
         {
            AV43TFBarFecFpr = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFBarFecFpr", localUtil.format(AV43TFBarFecFpr, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFBARFECSAL") == 0 )
         {
            AV45TFBarFecSal = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV45TFBarFecSal", localUtil.format(AV45TFBarFecSal, "99/99/99"));
         }
         AV138GXV1 = (int)(AV138GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV20TFBarCodPar_Sel)==0), AV20TFBarCodPar_Sel, GXv_char4) ;
      test_v02_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV22TFBarDisNum_Sel)==0), AV22TFBarDisNum_Sel, GXv_char3) ;
      test_v02_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFCliNom_Sel)==0), AV26TFCliNom_Sel, GXv_char2) ;
      test_v02_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFBarSer_Sel)==0), AV28TFBarSer_Sel, GXv_char17) ;
      test_v02_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV30TFBarSerDsc_Sel)==0), AV30TFBarSerDsc_Sel, GXv_char19) ;
      test_v02_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFBarColNom_Sel)==0), AV32TFBarColNom_Sel, GXv_char21) ;
      test_v02_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFBarNomCli_Sel)==0), AV36TFBarNomCli_Sel, GXv_char23) ;
      test_v02_impl.this.GXt_char22 = GXv_char23[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+GXt_char14+"||"+GXt_char15+"|"+GXt_char16+"|"+GXt_char18+"|"+GXt_char20+"||"+GXt_char22+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char22 = "" ;
      GXv_char23[0] = GXt_char22 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFBarCodPar)==0), AV19TFBarCodPar, GXv_char23) ;
      test_v02_impl.this.GXt_char22 = GXv_char23[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV21TFBarDisNum)==0), AV21TFBarDisNum, GXv_char21) ;
      test_v02_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFCliNom)==0), AV25TFCliNom, GXv_char19) ;
      test_v02_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFBarSer)==0), AV27TFBarSer, GXv_char17) ;
      test_v02_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV29TFBarSerDsc)==0), AV29TFBarSerDsc, GXv_char4) ;
      test_v02_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFBarColNom)==0), AV31TFBarColNom, GXv_char3) ;
      test_v02_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFBarNomCli)==0), AV35TFBarNomCli, GXv_char2) ;
      test_v02_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV15TFBarCod) ? "" : GXutil.str( AV15TFBarCod, 8, 0))+"|"+((0==AV17TFBarCodReo) ? "" : GXutil.str( AV17TFBarCodReo, 1, 0))+"|"+GXt_char22+"|"+GXt_char20+"|"+((0==AV23TFCliCod) ? "" : GXutil.str( AV23TFCliCod, 6, 0))+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char15+"|"+GXt_char14+"|"+((0==AV33TFBarColNum) ? "" : GXutil.str( AV33TFBarColNum, 6, 0))+"|"+GXt_char1+"|"+((0==AV37TFBarSit) ? "" : GXutil.str( AV37TFBarSit, 2, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV39TFBarFecGen)) ? "" : localUtil.dtoc( AV39TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41TFBarFecCli)) ? "" : localUtil.dtoc( AV41TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFBarFecFpr)) ? "" : localUtil.dtoc( AV43TFBarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45TFBarFecSal)) ? "" : localUtil.dtoc( AV45TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV16TFBarCod_To) ? "" : GXutil.str( AV16TFBarCod_To, 8, 0))+"|"+((0==AV18TFBarCodReo_To) ? "" : GXutil.str( AV18TFBarCodReo_To, 1, 0))+"|||"+((0==AV24TFCliCod_To) ? "" : GXutil.str( AV24TFCliCod_To, 6, 0))+"|||||"+((0==AV34TFBarColNum_To) ? "" : GXutil.str( AV34TFBarColNum_To, 6, 0))+"||"+((0==AV38TFBarSit_To) ? "" : GXutil.str( AV38TFBarSit_To, 2, 0))+"||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S182( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV109Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCOD", "", !((0==AV15TFBarCod)&&(0==AV16TFBarCod_To)), (short)(0), GXutil.trim( GXutil.str( AV15TFBarCod, 8, 0)), GXutil.trim( GXutil.str( AV16TFBarCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCODREO", "", !((0==AV17TFBarCodReo)&&(0==AV18TFBarCodReo_To)), (short)(0), GXutil.trim( GXutil.str( AV17TFBarCodReo, 1, 0)), GXutil.trim( GXutil.str( AV18TFBarCodReo_To, 1, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCODPAR", "", !(GXutil.strcmp("", AV19TFBarCodPar)==0), (short)(0), AV19TFBarCodPar, "", !(GXutil.strcmp("", AV20TFBarCodPar_Sel)==0), AV20TFBarCodPar_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARDISNUM", "", !(GXutil.strcmp("", AV21TFBarDisNum)==0), (short)(0), AV21TFBarDisNum, "", !(GXutil.strcmp("", AV22TFBarDisNum_Sel)==0), AV22TFBarDisNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLICOD", "", !((0==AV23TFCliCod)&&(0==AV24TFCliCod_To)), (short)(0), GXutil.trim( GXutil.str( AV23TFCliCod, 6, 0)), GXutil.trim( GXutil.str( AV24TFCliCod_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFCLINOM", "", !(GXutil.strcmp("", AV25TFCliNom)==0), (short)(0), AV25TFCliNom, "", !(GXutil.strcmp("", AV26TFCliNom_Sel)==0), AV26TFCliNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARSER", "", !(GXutil.strcmp("", AV27TFBarSer)==0), (short)(0), AV27TFBarSer, "", !(GXutil.strcmp("", AV28TFBarSer_Sel)==0), AV28TFBarSer_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARSERDSC", "", !(GXutil.strcmp("", AV29TFBarSerDsc)==0), (short)(0), AV29TFBarSerDsc, "", !(GXutil.strcmp("", AV30TFBarSerDsc_Sel)==0), AV30TFBarSerDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCOLNOM", "", !(GXutil.strcmp("", AV31TFBarColNom)==0), (short)(0), AV31TFBarColNom, "", !(GXutil.strcmp("", AV32TFBarColNom_Sel)==0), AV32TFBarColNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARCOLNUM", "", !((0==AV33TFBarColNum)&&(0==AV34TFBarColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV33TFBarColNum, 6, 0)), GXutil.trim( GXutil.str( AV34TFBarColNum_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARNOMCLI", "", !(GXutil.strcmp("", AV35TFBarNomCli)==0), (short)(0), AV35TFBarNomCli, "", !(GXutil.strcmp("", AV36TFBarNomCli_Sel)==0), AV36TFBarNomCli_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARSIT", "", !((0==AV37TFBarSit)&&(0==AV38TFBarSit_To)), (short)(0), GXutil.trim( GXutil.str( AV37TFBarSit, 2, 0)), GXutil.trim( GXutil.str( AV38TFBarSit_To, 2, 0))) ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARFECGEN", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV39TFBarFecGen)), (short)(0), GXutil.trim( localUtil.dtoc( AV39TFBarFecGen, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARFECCLI", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV41TFBarFecCli)), (short)(0), GXutil.trim( localUtil.dtoc( AV41TFBarFecCli, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARFECFPR", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV43TFBarFecFpr)), (short)(0), GXutil.trim( localUtil.dtoc( AV43TFBarFecFpr, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      GXv_SdtWWPGridState24[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState24, "TFBARFECSAL", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV45TFBarFecSal)), (short)(0), GXutil.trim( localUtil.dtoc( AV45TFBarFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState24[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV109Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV109Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PedidosClienteSinDetalle.HojadeRuta_TRN" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S142( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV93EmprCod, httpContext.getMessage( "CNOENC", "")) == 1 ) ) )
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
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV93EmprCod, httpContext.getMessage( "CNOENC", "")) == 1 ) ) )
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
      if ( ! ( ( AV99STNORM == 1 ) ) )
      {
         edtBarNormas_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtBarNormas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtBarNormas_Visible), 5, 0), !bGXsfl_221_Refreshing);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV93EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV93EmprCod, httpContext.getMessage( "STDNOR", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV93EmprCod, httpContext.getMessage( "STNORM", "")) == 1 ) || ( new app.pexicon(remoteHandle, context).executeUdp( AV93EmprCod, httpContext.getMessage( "CTWEAR", "")) == 1 ) ) )
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
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV93EmprCod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
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
      AV48TotBarKgm = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48TotBarKgm", GXutil.ltrimstr( AV48TotBarKgm, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARKGM", getSecureSignedToken( "", localUtil.format( AV48TotBarKgm, "ZZZZZ9.99")));
      AV50TotBarMtr = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50TotBarMtr", GXutil.ltrimstr( AV50TotBarMtr, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARMTR", getSecureSignedToken( "", localUtil.format( AV50TotBarMtr, "ZZZZZ9.99")));
      AV52TotBarPie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52TotBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TotBarPie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52TotBarPie), "ZZZZZ9")));
   }

   public void S202( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV110Produccion_test_v02ds_1_tfbarcod = AV15TFBarCod ;
      AV111Produccion_test_v02ds_2_tfbarcod_to = AV16TFBarCod_To ;
      AV112Produccion_test_v02ds_3_tfbarcodreo = AV17TFBarCodReo ;
      AV113Produccion_test_v02ds_4_tfbarcodreo_to = AV18TFBarCodReo_To ;
      AV114Produccion_test_v02ds_5_tfbarcodpar = AV19TFBarCodPar ;
      AV115Produccion_test_v02ds_6_tfbarcodpar_sel = AV20TFBarCodPar_Sel ;
      AV116Produccion_test_v02ds_7_tfbardisnum = AV21TFBarDisNum ;
      AV117Produccion_test_v02ds_8_tfbardisnum_sel = AV22TFBarDisNum_Sel ;
      AV118Produccion_test_v02ds_9_tfclicod = AV23TFCliCod ;
      AV119Produccion_test_v02ds_10_tfclicod_to = AV24TFCliCod_To ;
      AV120Produccion_test_v02ds_11_tfclinom = AV25TFCliNom ;
      AV121Produccion_test_v02ds_12_tfclinom_sel = AV26TFCliNom_Sel ;
      AV122Produccion_test_v02ds_13_tfbarser = AV27TFBarSer ;
      AV123Produccion_test_v02ds_14_tfbarser_sel = AV28TFBarSer_Sel ;
      AV124Produccion_test_v02ds_15_tfbarserdsc = AV29TFBarSerDsc ;
      AV125Produccion_test_v02ds_16_tfbarserdsc_sel = AV30TFBarSerDsc_Sel ;
      AV126Produccion_test_v02ds_17_tfbarcolnom = AV31TFBarColNom ;
      AV127Produccion_test_v02ds_18_tfbarcolnom_sel = AV32TFBarColNom_Sel ;
      AV128Produccion_test_v02ds_19_tfbarcolnum = AV33TFBarColNum ;
      AV129Produccion_test_v02ds_20_tfbarcolnum_to = AV34TFBarColNum_To ;
      AV130Produccion_test_v02ds_21_tfbarnomcli = AV35TFBarNomCli ;
      AV131Produccion_test_v02ds_22_tfbarnomcli_sel = AV36TFBarNomCli_Sel ;
      AV132Produccion_test_v02ds_23_tfbarsit = AV37TFBarSit ;
      AV133Produccion_test_v02ds_24_tfbarsit_to = AV38TFBarSit_To ;
      AV134Produccion_test_v02ds_25_tfbarfecgen = AV39TFBarFecGen ;
      AV135Produccion_test_v02ds_26_tfbarfeccli = AV41TFBarFecCli ;
      AV136Produccion_test_v02ds_27_tfbarfecfpr = AV43TFBarFecFpr ;
      AV137Produccion_test_v02ds_28_tfbarfecsal = AV45TFBarFecSal ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Integer.valueOf(AV110Produccion_test_v02ds_1_tfbarcod) ,
                                           Integer.valueOf(AV111Produccion_test_v02ds_2_tfbarcod_to) ,
                                           Byte.valueOf(AV112Produccion_test_v02ds_3_tfbarcodreo) ,
                                           Byte.valueOf(AV113Produccion_test_v02ds_4_tfbarcodreo_to) ,
                                           AV115Produccion_test_v02ds_6_tfbarcodpar_sel ,
                                           AV114Produccion_test_v02ds_5_tfbarcodpar ,
                                           AV117Produccion_test_v02ds_8_tfbardisnum_sel ,
                                           AV116Produccion_test_v02ds_7_tfbardisnum ,
                                           Integer.valueOf(AV118Produccion_test_v02ds_9_tfclicod) ,
                                           Integer.valueOf(AV119Produccion_test_v02ds_10_tfclicod_to) ,
                                           AV121Produccion_test_v02ds_12_tfclinom_sel ,
                                           AV120Produccion_test_v02ds_11_tfclinom ,
                                           AV123Produccion_test_v02ds_14_tfbarser_sel ,
                                           AV122Produccion_test_v02ds_13_tfbarser ,
                                           AV125Produccion_test_v02ds_16_tfbarserdsc_sel ,
                                           AV124Produccion_test_v02ds_15_tfbarserdsc ,
                                           AV127Produccion_test_v02ds_18_tfbarcolnom_sel ,
                                           AV126Produccion_test_v02ds_17_tfbarcolnom ,
                                           Integer.valueOf(AV128Produccion_test_v02ds_19_tfbarcolnum) ,
                                           Integer.valueOf(AV129Produccion_test_v02ds_20_tfbarcolnum_to) ,
                                           AV131Produccion_test_v02ds_22_tfbarnomcli_sel ,
                                           AV130Produccion_test_v02ds_21_tfbarnomcli ,
                                           Byte.valueOf(AV132Produccion_test_v02ds_23_tfbarsit) ,
                                           Byte.valueOf(AV133Produccion_test_v02ds_24_tfbarsit_to) ,
                                           AV134Produccion_test_v02ds_25_tfbarfecgen ,
                                           AV135Produccion_test_v02ds_26_tfbarfeccli ,
                                           AV136Produccion_test_v02ds_27_tfbarfecfpr ,
                                           AV137Produccion_test_v02ds_28_tfbarfecsal ,
                                           Integer.valueOf(AV83CliCod) ,
                                           Integer.valueOf(AV84CliCodto) ,
                                           AV85BarDisNum ,
                                           AV86BarDisNumTo ,
                                           AV75BarFecGen ,
                                           AV76BarFecGenTo ,
                                           AV77BarFecCli ,
                                           AV78BarFecCliTo ,
                                           AV81BarFecSal ,
                                           AV82BarFecSalto ,
                                           AV79BarFecFpr ,
                                           AV80BarFecFprto ,
                                           AV71BarColNom ,
                                           AV73BarColNomto ,
                                           Integer.valueOf(AV72BarColNum) ,
                                           Integer.valueOf(AV74BarColNumto) ,
                                           AV67BarNomCli ,
                                           AV69BarNomClito ,
                                           Integer.valueOf(AV68BarNumCli) ,
                                           Integer.valueOf(AV70BarNumClito) ,
                                           Integer.valueOf(AV57BarCod) ,
                                           Integer.valueOf(AV60BarCodto) ,
                                           Byte.valueOf(AV58BarCodReo) ,
                                           Byte.valueOf(AV61BarCodReoto) ,
                                           AV59BarCodPar ,
                                           AV62BarCodParto ,
                                           AV54Cod_Idtx ,
                                           AV55BarGirar ,
                                           Short.valueOf(AV63BarTipArt) ,
                                           Short.valueOf(AV64BarTipArtto) ,
                                           AV65BarSer ,
                                           AV66BarSerto ,
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
                                           Byte.valueOf(AV87BarSit) ,
                                           Byte.valueOf(AV88BarSitTo) ,
                                           AV93EmprCod ,
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
      lV114Produccion_test_v02ds_5_tfbarcodpar = GXutil.padr( GXutil.rtrim( AV114Produccion_test_v02ds_5_tfbarcodpar), 1, "%") ;
      lV116Produccion_test_v02ds_7_tfbardisnum = GXutil.padr( GXutil.rtrim( AV116Produccion_test_v02ds_7_tfbardisnum), 8, "%") ;
      lV120Produccion_test_v02ds_11_tfclinom = GXutil.padr( GXutil.rtrim( AV120Produccion_test_v02ds_11_tfclinom), 30, "%") ;
      lV122Produccion_test_v02ds_13_tfbarser = GXutil.padr( GXutil.rtrim( AV122Produccion_test_v02ds_13_tfbarser), 16, "%") ;
      lV124Produccion_test_v02ds_15_tfbarserdsc = GXutil.padr( GXutil.rtrim( AV124Produccion_test_v02ds_15_tfbarserdsc), 26, "%") ;
      lV126Produccion_test_v02ds_17_tfbarcolnom = GXutil.padr( GXutil.rtrim( AV126Produccion_test_v02ds_17_tfbarcolnom), 13, "%") ;
      lV130Produccion_test_v02ds_21_tfbarnomcli = GXutil.padr( GXutil.rtrim( AV130Produccion_test_v02ds_21_tfbarnomcli), 13, "%") ;
      /* Using cursor H027Q7 */
      pr_default.execute(2, new Object[] {AV93EmprCod, Byte.valueOf(AV87BarSit), Byte.valueOf(AV88BarSitTo), Integer.valueOf(AV110Produccion_test_v02ds_1_tfbarcod), Integer.valueOf(AV111Produccion_test_v02ds_2_tfbarcod_to), Byte.valueOf(AV112Produccion_test_v02ds_3_tfbarcodreo), Byte.valueOf(AV113Produccion_test_v02ds_4_tfbarcodreo_to), lV114Produccion_test_v02ds_5_tfbarcodpar, AV115Produccion_test_v02ds_6_tfbarcodpar_sel, lV116Produccion_test_v02ds_7_tfbardisnum, AV117Produccion_test_v02ds_8_tfbardisnum_sel, Integer.valueOf(AV118Produccion_test_v02ds_9_tfclicod), Integer.valueOf(AV119Produccion_test_v02ds_10_tfclicod_to), lV120Produccion_test_v02ds_11_tfclinom, AV121Produccion_test_v02ds_12_tfclinom_sel, lV122Produccion_test_v02ds_13_tfbarser, AV123Produccion_test_v02ds_14_tfbarser_sel, lV124Produccion_test_v02ds_15_tfbarserdsc, AV125Produccion_test_v02ds_16_tfbarserdsc_sel, lV126Produccion_test_v02ds_17_tfbarcolnom, AV127Produccion_test_v02ds_18_tfbarcolnom_sel, Integer.valueOf(AV128Produccion_test_v02ds_19_tfbarcolnum), Integer.valueOf(AV129Produccion_test_v02ds_20_tfbarcolnum_to), lV130Produccion_test_v02ds_21_tfbarnomcli, AV131Produccion_test_v02ds_22_tfbarnomcli_sel, Byte.valueOf(AV132Produccion_test_v02ds_23_tfbarsit), Byte.valueOf(AV133Produccion_test_v02ds_24_tfbarsit_to), AV134Produccion_test_v02ds_25_tfbarfecgen, AV135Produccion_test_v02ds_26_tfbarfeccli, AV136Produccion_test_v02ds_27_tfbarfecfpr, AV137Produccion_test_v02ds_28_tfbarfecsal, Integer.valueOf(AV83CliCod), Integer.valueOf(AV84CliCodto), AV85BarDisNum, AV86BarDisNumTo, AV75BarFecGen, AV76BarFecGenTo, AV77BarFecCli, AV78BarFecCliTo, AV81BarFecSal, AV82BarFecSalto, AV79BarFecFpr, AV80BarFecFprto, AV71BarColNom, AV73BarColNomto, Integer.valueOf(AV72BarColNum), Integer.valueOf(AV74BarColNumto), AV67BarNomCli, AV69BarNomClito, Integer.valueOf(AV68BarNumCli), Integer.valueOf(AV70BarNumClito), Integer.valueOf(AV57BarCod), Integer.valueOf(AV60BarCodto), Byte.valueOf(AV58BarCodReo), Byte.valueOf(AV61BarCodReoto), AV59BarCodPar, AV62BarCodParto, AV54Cod_Idtx, AV55BarGirar, Short.valueOf(AV63BarTipArt), Short.valueOf(AV64BarTipArtto), AV65BarSer, AV66BarSerto});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A217BarTipArt = H027Q7_A217BarTipArt[0] ;
         n217BarTipArt = H027Q7_n217BarTipArt[0] ;
         A2454BarGirar = H027Q7_A2454BarGirar[0] ;
         A2829BarProPer = H027Q7_A2829BarProPer[0] ;
         A1235BarNumCli = H027Q7_A1235BarNumCli[0] ;
         A396EmprCod = H027Q7_A396EmprCod[0] ;
         A161BarFecSal = H027Q7_A161BarFecSal[0] ;
         A158BarFecFpr = H027Q7_A158BarFecFpr[0] ;
         A155BarFecCli = H027Q7_A155BarFecCli[0] ;
         A159BarFecGen = H027Q7_A159BarFecGen[0] ;
         A213BarSit = H027Q7_A213BarSit[0] ;
         A1234BarNomCli = H027Q7_A1234BarNomCli[0] ;
         A136BarColNum = H027Q7_A136BarColNum[0] ;
         A135BarColNom = H027Q7_A135BarColNom[0] ;
         A1652BarSerDsc = H027Q7_A1652BarSerDsc[0] ;
         A212BarSer = H027Q7_A212BarSer[0] ;
         A279CliNom = H027Q7_A279CliNom[0] ;
         A252CliCod = H027Q7_A252CliCod[0] ;
         n252CliCod = H027Q7_n252CliCod[0] ;
         A143BarDisNum = H027Q7_A143BarDisNum[0] ;
         A130BarCodPar = H027Q7_A130BarCodPar[0] ;
         A132BarCodReo = H027Q7_A132BarCodReo[0] ;
         A129BarCod = H027Q7_A129BarCod[0] ;
         A166BarKgm = H027Q7_A166BarKgm[0] ;
         A184BarMtr = H027Q7_A184BarMtr[0] ;
         A199BarPie1 = H027Q7_A199BarPie1[0] ;
         A365DisDes = H027Q7_A365DisDes[0] ;
         A898BarPieNDes = H027Q7_A898BarPieNDes[0] ;
         A279CliNom = H027Q7_A279CliNom[0] ;
         A166BarKgm = H027Q7_A166BarKgm[0] ;
         A184BarMtr = H027Q7_A184BarMtr[0] ;
         A199BarPie1 = H027Q7_A199BarPie1[0] ;
         A898BarPieNDes = H027Q7_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
         }
         else
         {
            A198BarPie = A199BarPie1 ;
         }
         AV48TotBarKgm = A166BarKgm.add(AV48TotBarKgm) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48TotBarKgm", GXutil.ltrimstr( AV48TotBarKgm, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARKGM", getSecureSignedToken( "", localUtil.format( AV48TotBarKgm, "ZZZZZ9.99")));
         AV50TotBarMtr = A184BarMtr.add(AV50TotBarMtr) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50TotBarMtr", GXutil.ltrimstr( AV50TotBarMtr, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARMTR", getSecureSignedToken( "", localUtil.format( AV50TotBarMtr, "ZZZZZ9.99")));
         AV52TotBarPie = (long)(A198BarPie+AV52TotBarPie) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52TotBarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TotBarPie), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTBARPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV52TotBarPie), "ZZZZZ9")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV49TotValueBarKgm = localUtil.format( AV48TotBarKgm, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49TotValueBarKgm", AV49TotValueBarKgm);
      AV51TotValueBarMtr = localUtil.format( AV50TotBarMtr, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51TotValueBarMtr", AV51TotValueBarMtr);
      AV53TotValueBarPie = localUtil.format( DecimalUtil.doubleToDec(AV52TotBarPie), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53TotValueBarPie", AV53TotValueBarPie);
   }

   public void S132( )
   {
      /* 'LOADCOMBOCOD_IDTX' Routine */
      returnInSub = false ;
      /* Using cursor H027Q8 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H027Q8_A396EmprCod[0] ;
         A13810Dsc_IdtxID = H027Q8_A13810Dsc_IdtxID[0] ;
         A10887Cod_Idtx = H027Q8_A10887Cod_Idtx[0] ;
         A10888Dsc_Idtx = H027Q8_A10888Dsc_Idtx[0] ;
         n10888Dsc_Idtx = H027Q8_n10888Dsc_Idtx[0] ;
         AV90Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV90Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A10887Cod_Idtx );
         AV90Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13810Dsc_IdtxID );
         AV89Cod_Idtx_Data.add(AV90Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_cod_idtx_Selectedvalue_set = AV54Cod_Idtx ;
      ucCombo_cod_idtx.sendProperty(context, "", false, Combo_cod_idtx_Internalname, "SelectedValue_set", Combo_cod_idtx_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOBARTIPARTTO' Routine */
      returnInSub = false ;
      /* Using cursor H027Q9 */
      pr_default.execute(4);
      while ( (pr_default.getStatus(4) != 101) )
      {
         A396EmprCod = H027Q9_A396EmprCod[0] ;
         A13788TipArtCodD = H027Q9_A13788TipArtCodD[0] ;
         A829TipArtCod = H027Q9_A829TipArtCod[0] ;
         A830TipArtDsc = H027Q9_A830TipArtDsc[0] ;
         n830TipArtDsc = H027Q9_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H027Q9_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H027Q9_n6014TipArtDsc2[0] ;
         AV90Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV90Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV90Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV92BarTipArtto_Data.add(AV90Combo_DataItem, 0);
         pr_default.readNext(4);
      }
      pr_default.close(4);
      Combo_bartipartto_Selectedvalue_set = ((0==AV64BarTipArtto) ? "" : GXutil.trim( GXutil.str( AV64BarTipArtto, 4, 0))) ;
      ucCombo_bartipartto.sendProperty(context, "", false, Combo_bartipartto_Internalname, "SelectedValue_set", Combo_bartipartto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOBARTIPART' Routine */
      returnInSub = false ;
      /* Using cursor H027Q10 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A396EmprCod = H027Q10_A396EmprCod[0] ;
         A13788TipArtCodD = H027Q10_A13788TipArtCodD[0] ;
         A829TipArtCod = H027Q10_A829TipArtCod[0] ;
         A830TipArtDsc = H027Q10_A830TipArtDsc[0] ;
         n830TipArtDsc = H027Q10_n830TipArtDsc[0] ;
         A6014TipArtDsc2 = H027Q10_A6014TipArtDsc2[0] ;
         n6014TipArtDsc2 = H027Q10_n6014TipArtDsc2[0] ;
         AV90Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV90Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A829TipArtCod, 4, 0)) );
         AV90Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13788TipArtCodD );
         AV91BarTipArt_Data.add(AV90Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_bartipart_Selectedvalue_set = ((0==AV63BarTipArt) ? "" : GXutil.trim( GXutil.str( AV63BarTipArt, 4, 0))) ;
      ucCombo_bartipart.sendProperty(context, "", false, Combo_bartipart_Internalname, "SelectedValue_set", Combo_bartipart_Selectedvalue_set);
   }

   public void wb_table1_256_27Q2( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarkgm_Internalname, httpContext.getMessage( "Tot Value Bar Kgm", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 274,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarkgm_Internalname, AV49TotValueBarKgm, GXutil.rtrim( localUtil.format( AV49TotValueBarKgm, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,274);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarkgm_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarkgm_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarmtr_Internalname, httpContext.getMessage( "Tot Value Bar Mtr", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 277,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarmtr_Internalname, AV51TotValueBarMtr, GXutil.rtrim( localUtil.format( AV51TotValueBarMtr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,277);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarmtr_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarmtr_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluebarpie_Internalname, httpContext.getMessage( "Tot Value Bar Pie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 280,'',false,'" + sGXsfl_221_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluebarpie_Internalname, AV53TotValueBarPie, GXutil.rtrim( localUtil.format( AV53TotValueBarPie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,280);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluebarpie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluebarpie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Produccion\\Test_v02.htm");
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
         wb_table1_256_27Q2e( true) ;
      }
      else
      {
         wb_table1_256_27Q2e( false) ;
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
      pa27Q2( ) ;
      ws27Q2( ) ;
      we27Q2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116153368", true, true);
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
      httpContext.AddJavascriptSource("produccion/test_v02.js", "?202682116153368", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_2212( )
   {
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
      edtavBarfascod_Internalname = "vBARFASCOD_"+sGXsfl_221_idx ;
      edtavBarfassig_Internalname = "vBARFASSIG_"+sGXsfl_221_idx ;
      edtavBaralbultimo_Internalname = "vBARALBULTIMO_"+sGXsfl_221_idx ;
      edtavBaralbfact_Internalname = "vBARALBFACT_"+sGXsfl_221_idx ;
      edtBarGirar_Internalname = "BARGIRAR_"+sGXsfl_221_idx ;
      edtBarAcaAnh_Internalname = "BARACAANH_"+sGXsfl_221_idx ;
      edtBarCuadern_Internalname = "BARCUADERN_"+sGXsfl_221_idx ;
      edtBarProPerI_Internalname = "BARPROPERI_"+sGXsfl_221_idx ;
      edtBarNormas_Internalname = "BARNORMAS_"+sGXsfl_221_idx ;
      edtDisUsrCod_Internalname = "DISUSRCOD_"+sGXsfl_221_idx ;
   }

   public void subsflControlProps_fel_2212( )
   {
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
      edtavBarfascod_Internalname = "vBARFASCOD_"+sGXsfl_221_fel_idx ;
      edtavBarfassig_Internalname = "vBARFASSIG_"+sGXsfl_221_fel_idx ;
      edtavBaralbultimo_Internalname = "vBARALBULTIMO_"+sGXsfl_221_fel_idx ;
      edtavBaralbfact_Internalname = "vBARALBFACT_"+sGXsfl_221_fel_idx ;
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
      wb27Q0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_221_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_221_idx+"\">") ;
         }
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
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfascod_Internalname,GXutil.rtrim( AV103BarFasCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarfassig_Internalname,GXutil.rtrim( AV104BarFasSig),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarfassig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarfassig_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbultimo_Internalname,GXutil.ltrim( localUtil.ntoc( AV105BarAlbUltimo, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbultimo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV105BarAlbUltimo), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV105BarAlbUltimo), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbultimo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBaralbultimo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaralbfact_Internalname,GXutil.ltrim( localUtil.ntoc( AV106BarAlbFact, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBaralbfact_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV106BarAlbFact), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV106BarAlbFact), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBaralbfact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBaralbfact_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(221),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
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
         send_integrity_lvl_hashes27Q2( ) ;
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
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Codigo Fase en Produccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase Siguiente,Formula", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV103BarFasCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV104BarFasSig));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarfassig_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV105BarAlbUltimo, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaralbultimo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV106BarAlbFact, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaralbfact_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavBarfascod_Internalname = "vBARFASCOD" ;
      edtavBarfassig_Internalname = "vBARFASSIG" ;
      edtavBaralbultimo_Internalname = "vBARALBULTIMO" ;
      edtavBaralbfact_Internalname = "vBARALBFACT" ;
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
      divGridtablewithtotalizers_Internalname = "GRIDTABLEWITHTOTALIZERS" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavBartipart_Internalname = "vBARTIPART" ;
      edtavBartipartto_Internalname = "vBARTIPARTTO" ;
      edtavCod_idtx_Internalname = "vCOD_IDTX" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
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
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtDisUsrCod_Jsonclick = "" ;
      edtBarNormas_Jsonclick = "" ;
      edtBarProPerI_Jsonclick = "" ;
      edtBarCuadern_Jsonclick = "" ;
      edtBarAcaAnh_Jsonclick = "" ;
      edtBarGirar_Jsonclick = "" ;
      edtavBaralbfact_Jsonclick = "" ;
      edtavBaralbfact_Enabled = 0 ;
      edtavBaralbultimo_Jsonclick = "" ;
      edtavBaralbultimo_Enabled = 0 ;
      edtavBarfassig_Jsonclick = "" ;
      edtavBarfassig_Enabled = 0 ;
      edtavBarfascod_Jsonclick = "" ;
      edtavBarfascod_Enabled = 0 ;
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
      subGrid_Class = "GridWithTotalizer GridNoBorder WorkWith" ;
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
      Grid_empowerer_Infinitescrolling = "Form" ;
      Ddo_grid_Datalistproc = "Produccion.Test_v02GetFilterData" ;
      Ddo_grid_Datalisttype = "||Dynamic|Dynamic||Dynamic|Dynamic|Dynamic|Dynamic||Dynamic|||||" ;
      Ddo_grid_Includedatalist = "||T|T||T|T|T|T||T|||||" ;
      Ddo_grid_Filterisrange = "T|T|||T|||||T||T||||" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character|Character|Numeric|Character|Character|Character|Character|Numeric|Character|Numeric|Date|Date|Date|Date" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17" ;
      Ddo_grid_Columnids = "0:BarCod|1:BarCodReo|2:BarCodPar|4:BarDisNum|5:CliCod|6:CliNom|7:BarSer|8:BarSerDsc|11:BarColNom|12:BarColNum|13:BarNomCli|17:BarSit|18:BarFecGen|19:BarFecCli|20:BarFecFpr|21:BarFecSal" ;
      Ddo_grid_Gridinternalname = "" ;
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
      Form.setCaption( httpContext.getMessage( "Consulta Produccion v02", "") );
      edtBarNormas_Visible = -1 ;
      edtBarCuadern_Visible = -1 ;
      edtBarAcaAnh_Visible = -1 ;
      subGrid_Rows = 50 ;
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
         AV56Muestras = cmbavMuestras.getValidValue(AV56Muestras) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV56Muestras", AV56Muestras);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV15TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV16TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV17TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV18TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV19TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV20TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV21TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV22TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV23TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV24TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV25TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV26TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV27TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV28TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV29TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV30TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV31TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV32TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV33TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV36TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV41TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV43TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV45TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV87BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV88BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV84CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'AV85BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV86BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'AV77BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV78BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'AV81BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV82BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'AV79BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV80BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV71BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV73BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV72BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV74BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'AV67BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV69BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'AV68BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV70BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV60BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV58BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV61BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV59BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV62BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'AV54Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'AV55BarGirar',fld:'vBARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV65BarSer',fld:'vBARSER',pic:''},{av:'AV66BarSerto',fld:'vBARSERTO',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV48TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV52TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV48TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV52TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV51TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV53TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1427Q2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV84CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV85BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV86BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'AV87BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV88BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'AV77BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV78BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'AV79BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV80BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'AV81BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV82BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'AV71BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV72BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV73BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'AV74BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'AV67BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV68BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV69BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'AV70BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'AV65BarSer',fld:'vBARSER',pic:''},{av:'AV66BarSerto',fld:'vBARSERTO',pic:''},{av:'AV57BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV58BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV59BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV60BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'AV61BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'AV62BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'AV55BarGirar',fld:'vBARGIRAR',pic:''},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'AV54Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV15TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV16TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV17TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV18TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV19TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV20TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV21TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV22TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV23TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV24TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV25TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV26TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV27TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV28TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV29TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV30TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV31TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV32TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV33TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV36TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV41TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV43TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV45TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV48TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV52TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV45TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV43TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV41TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV35TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV36TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV33TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV31TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV32TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV29TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV30TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV27TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV28TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV25TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV26TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV23TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV24TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV21TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV22TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV19TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV20TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV17TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV18TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV15TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV16TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1727Q2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV103BarFasCod',fld:'vBARFASCOD',pic:''},{av:'AV104BarFasSig',fld:'vBARFASSIG',pic:''},{av:'AV105BarAlbUltimo',fld:'vBARALBULTIMO',pic:'ZZZZZZZZZ9'},{av:'AV106BarAlbFact',fld:'vBARALBFACT',pic:'ZZZZZZZ9'}]}");
      setEventMetadata("COMBO_COD_IDTX.ONOPTIONCLICKED","{handler:'e1327Q2',iparms:[{av:'Combo_cod_idtx_Selectedvalue_get',ctrl:'COMBO_COD_IDTX',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_COD_IDTX.ONOPTIONCLICKED",",oparms:[{av:'AV54Cod_Idtx',fld:'vCOD_IDTX',pic:''}]}");
      setEventMetadata("COMBO_BARTIPARTTO.ONOPTIONCLICKED","{handler:'e1227Q2',iparms:[{av:'Combo_bartipartto_Selectedvalue_get',ctrl:'COMBO_BARTIPARTTO',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_BARTIPARTTO.ONOPTIONCLICKED",",oparms:[{av:'AV64BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'}]}");
      setEventMetadata("COMBO_BARTIPART.ONOPTIONCLICKED","{handler:'e1127Q2',iparms:[{av:'Combo_bartipart_Selectedvalue_get',ctrl:'COMBO_BARTIPART',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_BARTIPART.ONOPTIONCLICKED",",oparms:[{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV15TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV16TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV17TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV18TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV19TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV20TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV21TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV22TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV23TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV24TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV25TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV26TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV27TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV28TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV29TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV30TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV31TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV32TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV33TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV36TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV41TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV43TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV45TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV87BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV88BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV84CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'AV85BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV86BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'AV77BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV78BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'AV81BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV82BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'AV79BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV80BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV71BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV73BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV72BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV74BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'AV67BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV69BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'AV68BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV70BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV60BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV58BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV61BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV59BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV62BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'AV54Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'AV55BarGirar',fld:'vBARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV65BarSer',fld:'vBARSER',pic:''},{av:'AV66BarSerto',fld:'vBARSERTO',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'AV48TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'AV50TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'AV52TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV48TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV52TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV51TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV53TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV15TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV16TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV17TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV18TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV19TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV20TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV21TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV22TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV23TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV24TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV25TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV26TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV27TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV28TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV29TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV30TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV31TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV32TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV33TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV36TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV41TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV43TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV45TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV87BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV88BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV84CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'AV85BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV86BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'AV77BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV78BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'AV81BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV82BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'AV79BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV80BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV71BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV73BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV72BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV74BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'AV67BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV69BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'AV68BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV70BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV60BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV58BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV61BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV59BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV62BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'AV54Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'AV55BarGirar',fld:'vBARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV65BarSer',fld:'vBARSER',pic:''},{av:'AV66BarSerto',fld:'vBARSERTO',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'AV48TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'AV50TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'AV52TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV48TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV52TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV51TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV53TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV15TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV16TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV17TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV18TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV19TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV20TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV21TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV22TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV23TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV24TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV25TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV26TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV27TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV28TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV29TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV30TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV31TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV32TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV33TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV36TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV41TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV43TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV45TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV87BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV88BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV84CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'AV85BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV86BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'AV77BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV78BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'AV81BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV82BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'AV79BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV80BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV71BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV73BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV72BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV74BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'AV67BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV69BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'AV68BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV70BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV60BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV58BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV61BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV59BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV62BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'AV54Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'AV55BarGirar',fld:'vBARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV65BarSer',fld:'vBARSER',pic:''},{av:'AV66BarSerto',fld:'vBARSERTO',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'AV48TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'AV50TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'AV52TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV48TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV52TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV51TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV53TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtBarAcaAnh_Visible',ctrl:'BARACAANH',prop:'Visible'},{av:'edtBarCuadern_Visible',ctrl:'BARCUADERN',prop:'Visible'},{av:'edtBarNormas_Visible',ctrl:'BARNORMAS',prop:'Visible'},{av:'AV15TFBarCod',fld:'vTFBARCOD',pic:'ZZZZZZZ9'},{av:'AV16TFBarCod_To',fld:'vTFBARCOD_TO',pic:'ZZZZZZZ9'},{av:'AV17TFBarCodReo',fld:'vTFBARCODREO',pic:'9'},{av:'AV18TFBarCodReo_To',fld:'vTFBARCODREO_TO',pic:'9'},{av:'AV19TFBarCodPar',fld:'vTFBARCODPAR',pic:''},{av:'AV20TFBarCodPar_Sel',fld:'vTFBARCODPAR_SEL',pic:''},{av:'AV21TFBarDisNum',fld:'vTFBARDISNUM',pic:''},{av:'AV22TFBarDisNum_Sel',fld:'vTFBARDISNUM_SEL',pic:''},{av:'AV23TFCliCod',fld:'vTFCLICOD',pic:'ZZZZZ9'},{av:'AV24TFCliCod_To',fld:'vTFCLICOD_TO',pic:'ZZZZZ9'},{av:'AV25TFCliNom',fld:'vTFCLINOM',pic:''},{av:'AV26TFCliNom_Sel',fld:'vTFCLINOM_SEL',pic:''},{av:'AV27TFBarSer',fld:'vTFBARSER',pic:''},{av:'AV28TFBarSer_Sel',fld:'vTFBARSER_SEL',pic:''},{av:'AV29TFBarSerDsc',fld:'vTFBARSERDSC',pic:''},{av:'AV30TFBarSerDsc_Sel',fld:'vTFBARSERDSC_SEL',pic:''},{av:'AV31TFBarColNom',fld:'vTFBARCOLNOM',pic:''},{av:'AV32TFBarColNom_Sel',fld:'vTFBARCOLNOM_SEL',pic:''},{av:'AV33TFBarColNum',fld:'vTFBARCOLNUM',pic:'ZZZZZ9'},{av:'AV34TFBarColNum_To',fld:'vTFBARCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV35TFBarNomCli',fld:'vTFBARNOMCLI',pic:''},{av:'AV36TFBarNomCli_Sel',fld:'vTFBARNOMCLI_SEL',pic:''},{av:'AV37TFBarSit',fld:'vTFBARSIT',pic:'Z9'},{av:'AV38TFBarSit_To',fld:'vTFBARSIT_TO',pic:'Z9'},{av:'AV39TFBarFecGen',fld:'vTFBARFECGEN',pic:''},{av:'AV41TFBarFecCli',fld:'vTFBARFECCLI',pic:''},{av:'AV43TFBarFecFpr',fld:'vTFBARFECFPR',pic:''},{av:'AV45TFBarFecSal',fld:'vTFBARFECSAL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV93EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'AV87BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV88BarSitTo',fld:'vBARSITTO',pic:'Z9'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'AV83CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV84CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A143BarDisNum',fld:'BARDISNUM',pic:''},{av:'AV85BarDisNum',fld:'vBARDISNUM',pic:''},{av:'AV86BarDisNumTo',fld:'vBARDISNUMTO',pic:''},{av:'A159BarFecGen',fld:'BARFECGEN',pic:''},{av:'AV75BarFecGen',fld:'vBARFECGEN',pic:''},{av:'AV76BarFecGenTo',fld:'vBARFECGENTO',pic:''},{av:'A155BarFecCli',fld:'BARFECCLI',pic:''},{av:'AV77BarFecCli',fld:'vBARFECCLI',pic:''},{av:'AV78BarFecCliTo',fld:'vBARFECCLITO',pic:''},{av:'A161BarFecSal',fld:'BARFECSAL',pic:''},{av:'AV81BarFecSal',fld:'vBARFECSAL',pic:''},{av:'AV82BarFecSalto',fld:'vBARFECSALTO',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'AV79BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV80BarFecFprto',fld:'vBARFECFPRTO',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV71BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV73BarColNomto',fld:'vBARCOLNOMTO',pic:''},{av:'A136BarColNum',fld:'BARCOLNUM',pic:'ZZZZZ9'},{av:'AV72BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV74BarColNumto',fld:'vBARCOLNUMTO',pic:'ZZZZZ9'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'AV67BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV69BarNomClito',fld:'vBARNOMCLITO',pic:''},{av:'A1235BarNumCli',fld:'BARNUMCLI',pic:'ZZZZZ9'},{av:'AV68BarNumCli',fld:'vBARNUMCLI',pic:'ZZZZZ9'},{av:'AV70BarNumClito',fld:'vBARNUMCLITO',pic:'ZZZZZ9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'AV57BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV60BarCodto',fld:'vBARCODTO',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'AV58BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV61BarCodReoto',fld:'vBARCODREOTO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV59BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV62BarCodParto',fld:'vBARCODPARTO',pic:''},{av:'A2829BarProPer',fld:'BARPROPER',pic:''},{av:'AV54Cod_Idtx',fld:'vCOD_IDTX',pic:''},{av:'A2454BarGirar',fld:'BARGIRAR',pic:''},{av:'AV55BarGirar',fld:'vBARGIRAR',pic:''},{av:'A217BarTipArt',fld:'BARTIPART',pic:'ZZZ9'},{av:'AV63BarTipArt',fld:'vBARTIPART',pic:'ZZZ9'},{av:'AV64BarTipArtto',fld:'vBARTIPARTTO',pic:'ZZZ9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'AV65BarSer',fld:'vBARSER',pic:''},{av:'AV66BarSerto',fld:'vBARSERTO',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'AV48TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'AV50TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'AV52TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV48TotBarKgm',fld:'vTOTBARKGM',pic:'ZZZZZ9.99',hsh:true},{av:'AV50TotBarMtr',fld:'vTOTBARMTR',pic:'ZZZZZ9.99',hsh:true},{av:'AV52TotBarPie',fld:'vTOTBARPIE',pic:'ZZZZZ9',hsh:true},{av:'AV49TotValueBarKgm',fld:'vTOTVALUEBARKGM',pic:''},{av:'AV51TotValueBarMtr',fld:'vTOTVALUEBARMTR',pic:''},{av:'AV53TotValueBarPie',fld:'vTOTVALUEBARPIE',pic:''}]}");
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
      AV85BarDisNum = "" ;
      AV86BarDisNumTo = "" ;
      AV75BarFecGen = GXutil.nullDate() ;
      AV76BarFecGenTo = GXutil.nullDate() ;
      AV77BarFecCli = GXutil.nullDate() ;
      AV78BarFecCliTo = GXutil.nullDate() ;
      AV79BarFecFpr = GXutil.nullDate() ;
      AV80BarFecFprto = GXutil.nullDate() ;
      AV81BarFecSal = GXutil.nullDate() ;
      AV82BarFecSalto = GXutil.nullDate() ;
      AV71BarColNom = "" ;
      AV73BarColNomto = "" ;
      AV67BarNomCli = "" ;
      AV69BarNomClito = "" ;
      AV65BarSer = "" ;
      AV66BarSerto = "" ;
      AV59BarCodPar = "" ;
      AV62BarCodParto = "" ;
      AV55BarGirar = "" ;
      AV54Cod_Idtx = "" ;
      AV93EmprCod = "" ;
      AV19TFBarCodPar = "" ;
      AV20TFBarCodPar_Sel = "" ;
      AV21TFBarDisNum = "" ;
      AV22TFBarDisNum_Sel = "" ;
      AV25TFCliNom = "" ;
      AV26TFCliNom_Sel = "" ;
      AV27TFBarSer = "" ;
      AV28TFBarSer_Sel = "" ;
      AV29TFBarSerDsc = "" ;
      AV30TFBarSerDsc_Sel = "" ;
      AV31TFBarColNom = "" ;
      AV32TFBarColNom_Sel = "" ;
      AV35TFBarNomCli = "" ;
      AV36TFBarNomCli_Sel = "" ;
      AV39TFBarFecGen = GXutil.nullDate() ;
      AV41TFBarFecCli = GXutil.nullDate() ;
      AV43TFBarFecFpr = GXutil.nullDate() ;
      AV45TFBarFecSal = GXutil.nullDate() ;
      AV109Pgmname = "" ;
      AV48TotBarKgm = DecimalUtil.ZERO ;
      AV50TotBarMtr = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV91BarTipArt_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV92BarTipArtto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV89Cod_Idtx_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV47DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      AV56Muestras = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV40DDO_BarFecGenAuxDate = GXutil.nullDate() ;
      AV42DDO_BarFecCliAuxDate = GXutil.nullDate() ;
      AV44DDO_BarFecFprAuxDate = GXutil.nullDate() ;
      AV46DDO_BarFecSalAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV114Produccion_test_v02ds_5_tfbarcodpar = "" ;
      AV115Produccion_test_v02ds_6_tfbarcodpar_sel = "" ;
      AV116Produccion_test_v02ds_7_tfbardisnum = "" ;
      AV117Produccion_test_v02ds_8_tfbardisnum_sel = "" ;
      AV120Produccion_test_v02ds_11_tfclinom = "" ;
      AV121Produccion_test_v02ds_12_tfclinom_sel = "" ;
      AV122Produccion_test_v02ds_13_tfbarser = "" ;
      AV123Produccion_test_v02ds_14_tfbarser_sel = "" ;
      AV124Produccion_test_v02ds_15_tfbarserdsc = "" ;
      AV125Produccion_test_v02ds_16_tfbarserdsc_sel = "" ;
      AV126Produccion_test_v02ds_17_tfbarcolnom = "" ;
      AV127Produccion_test_v02ds_18_tfbarcolnom_sel = "" ;
      AV130Produccion_test_v02ds_21_tfbarnomcli = "" ;
      AV131Produccion_test_v02ds_22_tfbarnomcli_sel = "" ;
      AV134Produccion_test_v02ds_25_tfbarfecgen = GXutil.nullDate() ;
      AV135Produccion_test_v02ds_26_tfbarfeccli = GXutil.nullDate() ;
      AV136Produccion_test_v02ds_27_tfbarfecfpr = GXutil.nullDate() ;
      AV137Produccion_test_v02ds_28_tfbarfecsal = GXutil.nullDate() ;
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
      AV103BarFasCod = "" ;
      AV104BarFasSig = "" ;
      A2454BarGirar = "" ;
      A13933BarCuadern = "" ;
      A14204BarProPerI = "" ;
      A13934BarNormas = "" ;
      A4348DisUsrCod = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV114Produccion_test_v02ds_5_tfbarcodpar = "" ;
      lV116Produccion_test_v02ds_7_tfbardisnum = "" ;
      lV120Produccion_test_v02ds_11_tfclinom = "" ;
      lV122Produccion_test_v02ds_13_tfbarser = "" ;
      lV124Produccion_test_v02ds_15_tfbarserdsc = "" ;
      lV126Produccion_test_v02ds_17_tfbarcolnom = "" ;
      lV130Produccion_test_v02ds_21_tfbarnomcli = "" ;
      H027Q3_A9713Tb1_Cod = new short[1] ;
      H027Q3_A1235BarNumCli = new int[1] ;
      H027Q3_A4348DisUsrCod = new String[] {""} ;
      H027Q3_A4466BarAcaAnh = new short[1] ;
      H027Q3_A2454BarGirar = new String[] {""} ;
      H027Q3_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H027Q3_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H027Q3_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H027Q3_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H027Q3_A213BarSit = new byte[1] ;
      H027Q3_A1234BarNomCli = new String[] {""} ;
      H027Q3_A136BarColNum = new int[1] ;
      H027Q3_A135BarColNom = new String[] {""} ;
      H027Q3_A13711BarTipArtD = new String[] {""} ;
      H027Q3_n13711BarTipArtD = new boolean[] {false} ;
      H027Q3_A217BarTipArt = new short[1] ;
      H027Q3_n217BarTipArt = new boolean[] {false} ;
      H027Q3_A1652BarSerDsc = new String[] {""} ;
      H027Q3_A212BarSer = new String[] {""} ;
      H027Q3_A279CliNom = new String[] {""} ;
      H027Q3_A252CliCod = new int[1] ;
      H027Q3_n252CliCod = new boolean[] {false} ;
      H027Q3_A143BarDisNum = new String[] {""} ;
      H027Q3_A120BarAgrEst = new String[] {""} ;
      H027Q3_A130BarCodPar = new String[] {""} ;
      H027Q3_A132BarCodReo = new byte[1] ;
      H027Q3_A129BarCod = new int[1] ;
      H027Q3_A13933BarCuadern = new String[] {""} ;
      H027Q3_n13933BarCuadern = new boolean[] {false} ;
      H027Q3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027Q3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027Q3_A199BarPie1 = new short[1] ;
      H027Q3_A365DisDes = new String[] {""} ;
      H027Q3_A898BarPieNDes = new int[1] ;
      H027Q3_A2829BarProPer = new String[] {""} ;
      H027Q3_A361DisCod = new int[1] ;
      H027Q3_A396EmprCod = new String[] {""} ;
      H027Q5_AGRID_nRecordCount = new long[1] ;
      AV49TotValueBarKgm = "" ;
      AV51TotValueBarMtr = "" ;
      AV53TotValueBarPie = "" ;
      hsh = "" ;
      AV94Station = "" ;
      AV95EmprNom = "" ;
      AV96UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int8 = new byte[1] ;
      AV100Barplf = "" ;
      AV101BarplfTo = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_int11 = new long[1] ;
      GXv_int13 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV14Session = httpContext.getWebSession();
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
      GXv_char4 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState24 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H027Q7_A217BarTipArt = new short[1] ;
      H027Q7_n217BarTipArt = new boolean[] {false} ;
      H027Q7_A2454BarGirar = new String[] {""} ;
      H027Q7_A2829BarProPer = new String[] {""} ;
      H027Q7_A1235BarNumCli = new int[1] ;
      H027Q7_A396EmprCod = new String[] {""} ;
      H027Q7_A161BarFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H027Q7_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H027Q7_A155BarFecCli = new java.util.Date[] {GXutil.nullDate()} ;
      H027Q7_A159BarFecGen = new java.util.Date[] {GXutil.nullDate()} ;
      H027Q7_A213BarSit = new byte[1] ;
      H027Q7_A1234BarNomCli = new String[] {""} ;
      H027Q7_A136BarColNum = new int[1] ;
      H027Q7_A135BarColNom = new String[] {""} ;
      H027Q7_A1652BarSerDsc = new String[] {""} ;
      H027Q7_A212BarSer = new String[] {""} ;
      H027Q7_A279CliNom = new String[] {""} ;
      H027Q7_A252CliCod = new int[1] ;
      H027Q7_n252CliCod = new boolean[] {false} ;
      H027Q7_A143BarDisNum = new String[] {""} ;
      H027Q7_A130BarCodPar = new String[] {""} ;
      H027Q7_A132BarCodReo = new byte[1] ;
      H027Q7_A129BarCod = new int[1] ;
      H027Q7_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027Q7_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H027Q7_A199BarPie1 = new short[1] ;
      H027Q7_A365DisDes = new String[] {""} ;
      H027Q7_A898BarPieNDes = new int[1] ;
      H027Q8_A396EmprCod = new String[] {""} ;
      H027Q8_A13810Dsc_IdtxID = new String[] {""} ;
      H027Q8_A10887Cod_Idtx = new String[] {""} ;
      H027Q8_A10888Dsc_Idtx = new String[] {""} ;
      H027Q8_n10888Dsc_Idtx = new boolean[] {false} ;
      A13810Dsc_IdtxID = "" ;
      A10887Cod_Idtx = "" ;
      A10888Dsc_Idtx = "" ;
      AV90Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H027Q9_A396EmprCod = new String[] {""} ;
      H027Q9_A13788TipArtCodD = new String[] {""} ;
      H027Q9_A829TipArtCod = new short[1] ;
      H027Q9_A830TipArtDsc = new String[] {""} ;
      H027Q9_n830TipArtDsc = new boolean[] {false} ;
      H027Q9_A6014TipArtDsc2 = new String[] {""} ;
      H027Q9_n6014TipArtDsc2 = new boolean[] {false} ;
      A13788TipArtCodD = "" ;
      A830TipArtDsc = "" ;
      A6014TipArtDsc2 = "" ;
      H027Q10_A396EmprCod = new String[] {""} ;
      H027Q10_A13788TipArtCodD = new String[] {""} ;
      H027Q10_A829TipArtCod = new short[1] ;
      H027Q10_A830TipArtDsc = new String[] {""} ;
      H027Q10_n830TipArtDsc = new boolean[] {false} ;
      H027Q10_A6014TipArtDsc2 = new String[] {""} ;
      H027Q10_n6014TipArtDsc2 = new boolean[] {false} ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.produccion.test_v02__default(),
         new Object[] {
             new Object[] {
            H027Q3_A9713Tb1_Cod, H027Q3_A1235BarNumCli, H027Q3_A4348DisUsrCod, H027Q3_A4466BarAcaAnh, H027Q3_A2454BarGirar, H027Q3_A161BarFecSal, H027Q3_A158BarFecFpr, H027Q3_A155BarFecCli, H027Q3_A159BarFecGen, H027Q3_A213BarSit,
            H027Q3_A1234BarNomCli, H027Q3_A136BarColNum, H027Q3_A135BarColNom, H027Q3_A13711BarTipArtD, H027Q3_n13711BarTipArtD, H027Q3_A217BarTipArt, H027Q3_n217BarTipArt, H027Q3_A1652BarSerDsc, H027Q3_A212BarSer, H027Q3_A279CliNom,
            H027Q3_A252CliCod, H027Q3_n252CliCod, H027Q3_A143BarDisNum, H027Q3_A120BarAgrEst, H027Q3_A130BarCodPar, H027Q3_A132BarCodReo, H027Q3_A129BarCod, H027Q3_A13933BarCuadern, H027Q3_n13933BarCuadern, H027Q3_A184BarMtr,
            H027Q3_A166BarKgm, H027Q3_A199BarPie1, H027Q3_A365DisDes, H027Q3_A898BarPieNDes, H027Q3_A2829BarProPer, H027Q3_A361DisCod, H027Q3_A396EmprCod
            }
            , new Object[] {
            H027Q5_AGRID_nRecordCount
            }
            , new Object[] {
            H027Q7_A217BarTipArt, H027Q7_n217BarTipArt, H027Q7_A2454BarGirar, H027Q7_A2829BarProPer, H027Q7_A1235BarNumCli, H027Q7_A396EmprCod, H027Q7_A161BarFecSal, H027Q7_A158BarFecFpr, H027Q7_A155BarFecCli, H027Q7_A159BarFecGen,
            H027Q7_A213BarSit, H027Q7_A1234BarNomCli, H027Q7_A136BarColNum, H027Q7_A135BarColNom, H027Q7_A1652BarSerDsc, H027Q7_A212BarSer, H027Q7_A279CliNom, H027Q7_A252CliCod, H027Q7_n252CliCod, H027Q7_A143BarDisNum,
            H027Q7_A130BarCodPar, H027Q7_A132BarCodReo, H027Q7_A129BarCod, H027Q7_A166BarKgm, H027Q7_A184BarMtr, H027Q7_A199BarPie1, H027Q7_A365DisDes, H027Q7_A898BarPieNDes
            }
            , new Object[] {
            H027Q8_A396EmprCod, H027Q8_A13810Dsc_IdtxID, H027Q8_A10887Cod_Idtx, H027Q8_A10888Dsc_Idtx, H027Q8_n10888Dsc_Idtx
            }
            , new Object[] {
            H027Q9_A396EmprCod, H027Q9_A13788TipArtCodD, H027Q9_A829TipArtCod, H027Q9_A830TipArtDsc, H027Q9_n830TipArtDsc, H027Q9_A6014TipArtDsc2, H027Q9_n6014TipArtDsc2
            }
            , new Object[] {
            H027Q10_A396EmprCod, H027Q10_A13788TipArtCodD, H027Q10_A829TipArtCod, H027Q10_A830TipArtDsc, H027Q10_n830TipArtDsc, H027Q10_A6014TipArtDsc2, H027Q10_n6014TipArtDsc2
            }
         }
      );
      AV109Pgmname = "Produccion.Test_v02" ;
      /* GeneXus formulas. */
      AV109Pgmname = "Produccion.Test_v02" ;
      Gx_err = (short)(0) ;
      edtavBarfascod_Enabled = 0 ;
      edtavBarfassig_Enabled = 0 ;
      edtavBaralbultimo_Enabled = 0 ;
      edtavBaralbfact_Enabled = 0 ;
      edtavTotvaluebarkgm_Enabled = 0 ;
      edtavTotvaluebarmtr_Enabled = 0 ;
      edtavTotvaluebarpie_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV87BarSit ;
   private byte AV88BarSitTo ;
   private byte AV58BarCodReo ;
   private byte AV61BarCodReoto ;
   private byte AV17TFBarCodReo ;
   private byte AV18TFBarCodReo_To ;
   private byte AV37TFBarSit ;
   private byte AV38TFBarSit_To ;
   private byte gxajaxcallmode ;
   private byte AV112Produccion_test_v02ds_3_tfbarcodreo ;
   private byte AV113Produccion_test_v02ds_4_tfbarcodreo_to ;
   private byte AV132Produccion_test_v02ds_23_tfbarsit ;
   private byte AV133Produccion_test_v02ds_24_tfbarsit_to ;
   private byte A132BarCodReo ;
   private byte A213BarSit ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
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
   private short AV63BarTipArt ;
   private short AV64BarTipArtto ;
   private short AV12OrderedBy ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short A217BarTipArt ;
   private short A4466BarAcaAnh ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV97Moda21 ;
   private short AV98cuaderno ;
   private short AV99STNORM ;
   private short A829TipArtCod ;
   private int edtBarAcaAnh_Visible ;
   private int edtBarCuadern_Visible ;
   private int edtBarNormas_Visible ;
   private int nRC_GXsfl_221 ;
   private int subGrid_Rows ;
   private int nGXsfl_221_idx=1 ;
   private int AV83CliCod ;
   private int AV84CliCodto ;
   private int AV72BarColNum ;
   private int AV74BarColNumto ;
   private int AV68BarNumCli ;
   private int AV70BarNumClito ;
   private int AV57BarCod ;
   private int AV60BarCodto ;
   private int AV15TFBarCod ;
   private int AV16TFBarCod_To ;
   private int AV23TFCliCod ;
   private int AV24TFCliCod_To ;
   private int AV33TFBarColNum ;
   private int AV34TFBarColNum_To ;
   private int A1235BarNumCli ;
   private int A898BarPieNDes ;
   private int A361DisCod ;
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
   private int AV110Produccion_test_v02ds_1_tfbarcod ;
   private int AV111Produccion_test_v02ds_2_tfbarcod_to ;
   private int AV118Produccion_test_v02ds_9_tfclicod ;
   private int AV119Produccion_test_v02ds_10_tfclicod_to ;
   private int AV128Produccion_test_v02ds_19_tfbarcolnum ;
   private int AV129Produccion_test_v02ds_20_tfbarcolnum_to ;
   private int A129BarCod ;
   private int A252CliCod ;
   private int A136BarColNum ;
   private int A198BarPie ;
   private int AV106BarAlbFact ;
   private int subGrid_Islastpage ;
   private int edtavBarfascod_Enabled ;
   private int edtavBarfassig_Enabled ;
   private int edtavBaralbultimo_Enabled ;
   private int edtavBaralbfact_Enabled ;
   private int edtavTotvaluebarkgm_Enabled ;
   private int edtavTotvaluebarmtr_Enabled ;
   private int edtavTotvaluebarpie_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int12 ;
   private int GXv_int13[] ;
   private int AV138GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV52TotBarPie ;
   private long AV105BarAlbUltimo ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXt_int10 ;
   private long GXv_int11[] ;
   private java.math.BigDecimal AV48TotBarKgm ;
   private java.math.BigDecimal AV50TotBarMtr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
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
   private String AV85BarDisNum ;
   private String AV86BarDisNumTo ;
   private String AV71BarColNom ;
   private String AV73BarColNomto ;
   private String AV67BarNomCli ;
   private String AV69BarNomClito ;
   private String AV65BarSer ;
   private String AV66BarSerto ;
   private String AV59BarCodPar ;
   private String AV62BarCodParto ;
   private String AV55BarGirar ;
   private String AV54Cod_Idtx ;
   private String AV93EmprCod ;
   private String AV19TFBarCodPar ;
   private String AV20TFBarCodPar_Sel ;
   private String AV21TFBarDisNum ;
   private String AV22TFBarDisNum_Sel ;
   private String AV25TFCliNom ;
   private String AV26TFCliNom_Sel ;
   private String AV27TFBarSer ;
   private String AV28TFBarSer_Sel ;
   private String AV29TFBarSerDsc ;
   private String AV30TFBarSerDsc_Sel ;
   private String AV31TFBarColNom ;
   private String AV32TFBarColNom_Sel ;
   private String AV35TFBarNomCli ;
   private String AV36TFBarNomCli_Sel ;
   private String AV109Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
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
   private String AV56Muestras ;
   private String divUnnamedtable7_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divGridtablewithtotalizers_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavBartipart_Internalname ;
   private String edtavBartipart_Jsonclick ;
   private String edtavBartipartto_Internalname ;
   private String edtavBartipartto_Jsonclick ;
   private String edtavCod_idtx_Internalname ;
   private String edtavCod_idtx_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
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
   private String AV114Produccion_test_v02ds_5_tfbarcodpar ;
   private String AV115Produccion_test_v02ds_6_tfbarcodpar_sel ;
   private String AV116Produccion_test_v02ds_7_tfbardisnum ;
   private String AV117Produccion_test_v02ds_8_tfbardisnum_sel ;
   private String AV120Produccion_test_v02ds_11_tfclinom ;
   private String AV121Produccion_test_v02ds_12_tfclinom_sel ;
   private String AV122Produccion_test_v02ds_13_tfbarser ;
   private String AV123Produccion_test_v02ds_14_tfbarser_sel ;
   private String AV124Produccion_test_v02ds_15_tfbarserdsc ;
   private String AV125Produccion_test_v02ds_16_tfbarserdsc_sel ;
   private String AV126Produccion_test_v02ds_17_tfbarcolnom ;
   private String AV127Produccion_test_v02ds_18_tfbarcolnom_sel ;
   private String AV130Produccion_test_v02ds_21_tfbarnomcli ;
   private String AV131Produccion_test_v02ds_22_tfbarnomcli_sel ;
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
   private String AV103BarFasCod ;
   private String edtavBarfascod_Internalname ;
   private String AV104BarFasSig ;
   private String edtavBarfassig_Internalname ;
   private String edtavBaralbultimo_Internalname ;
   private String edtavBaralbfact_Internalname ;
   private String A2454BarGirar ;
   private String edtBarGirar_Internalname ;
   private String A13933BarCuadern ;
   private String A14204BarProPerI ;
   private String edtBarProPerI_Internalname ;
   private String A4348DisUsrCod ;
   private String edtDisUsrCod_Internalname ;
   private String GXCCtl ;
   private String edtavTotvaluebarkgm_Internalname ;
   private String edtavTotvaluebarmtr_Internalname ;
   private String edtavTotvaluebarpie_Internalname ;
   private String scmdbuf ;
   private String lV114Produccion_test_v02ds_5_tfbarcodpar ;
   private String lV116Produccion_test_v02ds_7_tfbardisnum ;
   private String lV120Produccion_test_v02ds_11_tfclinom ;
   private String lV122Produccion_test_v02ds_13_tfbarser ;
   private String lV124Produccion_test_v02ds_15_tfbarserdsc ;
   private String lV126Produccion_test_v02ds_17_tfbarcolnom ;
   private String lV130Produccion_test_v02ds_21_tfbarnomcli ;
   private String hsh ;
   private String AV94Station ;
   private String AV95EmprNom ;
   private String AV96UsurCod ;
   private String AV100Barplf ;
   private String AV101BarplfTo ;
   private String GXt_char22 ;
   private String GXv_char23[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String A10887Cod_Idtx ;
   private String A10888Dsc_Idtx ;
   private String A830TipArtDsc ;
   private String A6014TipArtDsc2 ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluebarkgm_Jsonclick ;
   private String edtavTotvaluebarmtr_Jsonclick ;
   private String edtavTotvaluebarpie_Jsonclick ;
   private String sGXsfl_221_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
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
   private String edtavBarfascod_Jsonclick ;
   private String edtavBarfassig_Jsonclick ;
   private String edtavBaralbultimo_Jsonclick ;
   private String edtavBaralbfact_Jsonclick ;
   private String edtBarGirar_Jsonclick ;
   private String edtBarAcaAnh_Jsonclick ;
   private String edtBarCuadern_Jsonclick ;
   private String edtBarProPerI_Jsonclick ;
   private String edtBarNormas_Jsonclick ;
   private String edtDisUsrCod_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV75BarFecGen ;
   private java.util.Date AV76BarFecGenTo ;
   private java.util.Date AV77BarFecCli ;
   private java.util.Date AV78BarFecCliTo ;
   private java.util.Date AV79BarFecFpr ;
   private java.util.Date AV80BarFecFprto ;
   private java.util.Date AV81BarFecSal ;
   private java.util.Date AV82BarFecSalto ;
   private java.util.Date AV39TFBarFecGen ;
   private java.util.Date AV41TFBarFecCli ;
   private java.util.Date AV43TFBarFecFpr ;
   private java.util.Date AV45TFBarFecSal ;
   private java.util.Date AV40DDO_BarFecGenAuxDate ;
   private java.util.Date AV42DDO_BarFecCliAuxDate ;
   private java.util.Date AV44DDO_BarFecFprAuxDate ;
   private java.util.Date AV46DDO_BarFecSalAuxDate ;
   private java.util.Date AV134Produccion_test_v02ds_25_tfbarfecgen ;
   private java.util.Date AV135Produccion_test_v02ds_26_tfbarfeccli ;
   private java.util.Date AV136Produccion_test_v02ds_27_tfbarfecfpr ;
   private java.util.Date AV137Produccion_test_v02ds_28_tfbarfecsal ;
   private java.util.Date A159BarFecGen ;
   private java.util.Date A155BarFecCli ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date A161BarFecSal ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n252CliCod ;
   private boolean n217BarTipArt ;
   private boolean n13711BarTipArtD ;
   private boolean n13933BarCuadern ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private boolean n10888Dsc_Idtx ;
   private boolean n830TipArtDsc ;
   private boolean n6014TipArtDsc2 ;
   private String A13934BarNormas ;
   private String AV49TotValueBarKgm ;
   private String AV51TotValueBarMtr ;
   private String AV53TotValueBarPie ;
   private String A13810Dsc_IdtxID ;
   private String A13788TipArtCodD ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucCombo_bartipart ;
   private com.genexus.webpanels.GXUserControl ucCombo_bartipartto ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable5 ;
   private com.genexus.webpanels.GXUserControl ucCombo_cod_idtx ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavMuestras ;
   private IDataStoreProvider pr_default ;
   private short[] H027Q3_A9713Tb1_Cod ;
   private int[] H027Q3_A1235BarNumCli ;
   private String[] H027Q3_A4348DisUsrCod ;
   private short[] H027Q3_A4466BarAcaAnh ;
   private String[] H027Q3_A2454BarGirar ;
   private java.util.Date[] H027Q3_A161BarFecSal ;
   private java.util.Date[] H027Q3_A158BarFecFpr ;
   private java.util.Date[] H027Q3_A155BarFecCli ;
   private java.util.Date[] H027Q3_A159BarFecGen ;
   private byte[] H027Q3_A213BarSit ;
   private String[] H027Q3_A1234BarNomCli ;
   private int[] H027Q3_A136BarColNum ;
   private String[] H027Q3_A135BarColNom ;
   private String[] H027Q3_A13711BarTipArtD ;
   private boolean[] H027Q3_n13711BarTipArtD ;
   private short[] H027Q3_A217BarTipArt ;
   private boolean[] H027Q3_n217BarTipArt ;
   private String[] H027Q3_A1652BarSerDsc ;
   private String[] H027Q3_A212BarSer ;
   private String[] H027Q3_A279CliNom ;
   private int[] H027Q3_A252CliCod ;
   private boolean[] H027Q3_n252CliCod ;
   private String[] H027Q3_A143BarDisNum ;
   private String[] H027Q3_A120BarAgrEst ;
   private String[] H027Q3_A130BarCodPar ;
   private byte[] H027Q3_A132BarCodReo ;
   private int[] H027Q3_A129BarCod ;
   private String[] H027Q3_A13933BarCuadern ;
   private boolean[] H027Q3_n13933BarCuadern ;
   private java.math.BigDecimal[] H027Q3_A184BarMtr ;
   private java.math.BigDecimal[] H027Q3_A166BarKgm ;
   private short[] H027Q3_A199BarPie1 ;
   private String[] H027Q3_A365DisDes ;
   private int[] H027Q3_A898BarPieNDes ;
   private String[] H027Q3_A2829BarProPer ;
   private int[] H027Q3_A361DisCod ;
   private String[] H027Q3_A396EmprCod ;
   private long[] H027Q5_AGRID_nRecordCount ;
   private short[] H027Q7_A217BarTipArt ;
   private boolean[] H027Q7_n217BarTipArt ;
   private String[] H027Q7_A2454BarGirar ;
   private String[] H027Q7_A2829BarProPer ;
   private int[] H027Q7_A1235BarNumCli ;
   private String[] H027Q7_A396EmprCod ;
   private java.util.Date[] H027Q7_A161BarFecSal ;
   private java.util.Date[] H027Q7_A158BarFecFpr ;
   private java.util.Date[] H027Q7_A155BarFecCli ;
   private java.util.Date[] H027Q7_A159BarFecGen ;
   private byte[] H027Q7_A213BarSit ;
   private String[] H027Q7_A1234BarNomCli ;
   private int[] H027Q7_A136BarColNum ;
   private String[] H027Q7_A135BarColNom ;
   private String[] H027Q7_A1652BarSerDsc ;
   private String[] H027Q7_A212BarSer ;
   private String[] H027Q7_A279CliNom ;
   private int[] H027Q7_A252CliCod ;
   private boolean[] H027Q7_n252CliCod ;
   private String[] H027Q7_A143BarDisNum ;
   private String[] H027Q7_A130BarCodPar ;
   private byte[] H027Q7_A132BarCodReo ;
   private int[] H027Q7_A129BarCod ;
   private java.math.BigDecimal[] H027Q7_A166BarKgm ;
   private java.math.BigDecimal[] H027Q7_A184BarMtr ;
   private short[] H027Q7_A199BarPie1 ;
   private String[] H027Q7_A365DisDes ;
   private int[] H027Q7_A898BarPieNDes ;
   private String[] H027Q8_A396EmprCod ;
   private String[] H027Q8_A13810Dsc_IdtxID ;
   private String[] H027Q8_A10887Cod_Idtx ;
   private String[] H027Q8_A10888Dsc_Idtx ;
   private boolean[] H027Q8_n10888Dsc_Idtx ;
   private String[] H027Q9_A396EmprCod ;
   private String[] H027Q9_A13788TipArtCodD ;
   private short[] H027Q9_A829TipArtCod ;
   private String[] H027Q9_A830TipArtDsc ;
   private boolean[] H027Q9_n830TipArtDsc ;
   private String[] H027Q9_A6014TipArtDsc2 ;
   private boolean[] H027Q9_n6014TipArtDsc2 ;
   private String[] H027Q10_A396EmprCod ;
   private String[] H027Q10_A13788TipArtCodD ;
   private short[] H027Q10_A829TipArtCod ;
   private String[] H027Q10_A830TipArtDsc ;
   private boolean[] H027Q10_n830TipArtDsc ;
   private String[] H027Q10_A6014TipArtDsc2 ;
   private boolean[] H027Q10_n6014TipArtDsc2 ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV91BarTipArt_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV92BarTipArtto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV89Cod_Idtx_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState24[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV47DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV90Combo_DataItem ;
}

final  class test_v02__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H027Q3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV110Produccion_test_v02ds_1_tfbarcod ,
                                          int AV111Produccion_test_v02ds_2_tfbarcod_to ,
                                          byte AV112Produccion_test_v02ds_3_tfbarcodreo ,
                                          byte AV113Produccion_test_v02ds_4_tfbarcodreo_to ,
                                          String AV115Produccion_test_v02ds_6_tfbarcodpar_sel ,
                                          String AV114Produccion_test_v02ds_5_tfbarcodpar ,
                                          String AV117Produccion_test_v02ds_8_tfbardisnum_sel ,
                                          String AV116Produccion_test_v02ds_7_tfbardisnum ,
                                          int AV118Produccion_test_v02ds_9_tfclicod ,
                                          int AV119Produccion_test_v02ds_10_tfclicod_to ,
                                          String AV121Produccion_test_v02ds_12_tfclinom_sel ,
                                          String AV120Produccion_test_v02ds_11_tfclinom ,
                                          String AV123Produccion_test_v02ds_14_tfbarser_sel ,
                                          String AV122Produccion_test_v02ds_13_tfbarser ,
                                          String AV125Produccion_test_v02ds_16_tfbarserdsc_sel ,
                                          String AV124Produccion_test_v02ds_15_tfbarserdsc ,
                                          String AV127Produccion_test_v02ds_18_tfbarcolnom_sel ,
                                          String AV126Produccion_test_v02ds_17_tfbarcolnom ,
                                          int AV128Produccion_test_v02ds_19_tfbarcolnum ,
                                          int AV129Produccion_test_v02ds_20_tfbarcolnum_to ,
                                          String AV131Produccion_test_v02ds_22_tfbarnomcli_sel ,
                                          String AV130Produccion_test_v02ds_21_tfbarnomcli ,
                                          byte AV132Produccion_test_v02ds_23_tfbarsit ,
                                          byte AV133Produccion_test_v02ds_24_tfbarsit_to ,
                                          java.util.Date AV134Produccion_test_v02ds_25_tfbarfecgen ,
                                          java.util.Date AV135Produccion_test_v02ds_26_tfbarfeccli ,
                                          java.util.Date AV136Produccion_test_v02ds_27_tfbarfecfpr ,
                                          java.util.Date AV137Produccion_test_v02ds_28_tfbarfecsal ,
                                          int AV83CliCod ,
                                          int AV84CliCodto ,
                                          String AV85BarDisNum ,
                                          String AV86BarDisNumTo ,
                                          java.util.Date AV75BarFecGen ,
                                          java.util.Date AV76BarFecGenTo ,
                                          java.util.Date AV77BarFecCli ,
                                          java.util.Date AV78BarFecCliTo ,
                                          java.util.Date AV81BarFecSal ,
                                          java.util.Date AV82BarFecSalto ,
                                          java.util.Date AV79BarFecFpr ,
                                          java.util.Date AV80BarFecFprto ,
                                          String AV71BarColNom ,
                                          String AV73BarColNomto ,
                                          int AV72BarColNum ,
                                          int AV74BarColNumto ,
                                          String AV67BarNomCli ,
                                          String AV69BarNomClito ,
                                          int AV68BarNumCli ,
                                          int AV70BarNumClito ,
                                          int AV57BarCod ,
                                          int AV60BarCodto ,
                                          byte AV58BarCodReo ,
                                          byte AV61BarCodReoto ,
                                          String AV59BarCodPar ,
                                          String AV62BarCodParto ,
                                          String AV54Cod_Idtx ,
                                          String AV55BarGirar ,
                                          short AV63BarTipArt ,
                                          short AV64BarTipArtto ,
                                          String AV65BarSer ,
                                          String AV66BarSerto ,
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
                                          byte AV87BarSit ,
                                          byte AV88BarSitTo ,
                                          String AV93EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[68];
      Object[] GXv_Object26 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T5.Tb1_Cod, T1.BarNumCli, T2.DisUsrCod, T1.BarAcaAnh, T1.BarGirar, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen, T1.BarSit, T1.BarNomCli," ;
      sSelectString += " T1.BarColNum, T1.BarColNom, T3.TipArtDsc AS BarTipArtD, T1.BarTipArt AS BarTipArt, T1.BarSerDsc, T1.BarSer, T4.CliNom, T1.CliCod, T1.BarDisNum, T1.BarAgrEst, T1.BarCodPar," ;
      sSelectString += " T1.BarCodReo, T1.BarCod, COALESCE( T5.Tb1_Dsc, ' ') AS BarCuadern, COALESCE( T6.BarMtr, 0) AS BarMtr, COALESCE( T6.BarKgm, 0) AS BarKgm, COALESCE( T6.BarPie1, 0)" ;
      sSelectString += " AS BarPie1, T1.DisDes, COALESCE( T6.BarPieNDes, 0) AS BarPieNDes, T1.BarProPer, T1.DisCod, T1.EmprCod" ;
      sFromString = " FROM (((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod AND T3.TipArtCod" ;
      sFromString += " = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod AND T5.Tb1_Cod =" ;
      sFromString += " T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr, SUM(BarPieKil)" ;
      sFromString += " AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo = T1.BarCodReo" ;
      sFromString += " AND T6.BarCodPar = T1.BarCodPar)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV110Produccion_test_v02ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int25[3] = (byte)(1) ;
      }
      if ( ! (0==AV111Produccion_test_v02ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int25[4] = (byte)(1) ;
      }
      if ( ! (0==AV112Produccion_test_v02ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! (0==AV113Produccion_test_v02ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Produccion_test_v02ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV114Produccion_test_v02ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Produccion_test_v02ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Produccion_test_v02ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV116Produccion_test_v02ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Produccion_test_v02ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( ! (0==AV118Produccion_test_v02ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (0==AV119Produccion_test_v02ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Produccion_test_v02ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV120Produccion_test_v02ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Produccion_test_v02ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Produccion_test_v02ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV122Produccion_test_v02ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Produccion_test_v02ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Produccion_test_v02ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Produccion_test_v02ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Produccion_test_v02ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Produccion_test_v02ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV126Produccion_test_v02ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Produccion_test_v02ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (0==AV128Produccion_test_v02ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( ! (0==AV129Produccion_test_v02ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Produccion_test_v02ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV130Produccion_test_v02ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Produccion_test_v02ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (0==AV132Produccion_test_v02ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( ! (0==AV133Produccion_test_v02ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Produccion_test_v02ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Produccion_test_v02ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV136Produccion_test_v02ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV137Produccion_test_v02ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (0==AV83CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      if ( ! (0==AV84CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int25[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85BarDisNum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int25[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int25[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int25[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int25[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int25[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78BarFecCliTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int25[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int25[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int25[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int25[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int25[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int25[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int25[44] = (byte)(1) ;
      }
      if ( ! (0==AV72BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int25[45] = (byte)(1) ;
      }
      if ( ! (0==AV74BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int25[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int25[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int25[48] = (byte)(1) ;
      }
      if ( ! (0==AV68BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int25[49] = (byte)(1) ;
      }
      if ( ! (0==AV70BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int25[50] = (byte)(1) ;
      }
      if ( ! (0==AV57BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int25[51] = (byte)(1) ;
      }
      if ( ! (0==AV60BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int25[52] = (byte)(1) ;
      }
      if ( ! (0==AV58BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int25[53] = (byte)(1) ;
      }
      if ( ! (0==AV61BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int25[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59BarCodPar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int25[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int25[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int25[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int25[58] = (byte)(1) ;
      }
      if ( ! (0==AV63BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int25[59] = (byte)(1) ;
      }
      if ( ! (0==AV64BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int25[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int25[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66BarSerto)==0) )
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

   protected Object[] conditional_H027Q5( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV110Produccion_test_v02ds_1_tfbarcod ,
                                          int AV111Produccion_test_v02ds_2_tfbarcod_to ,
                                          byte AV112Produccion_test_v02ds_3_tfbarcodreo ,
                                          byte AV113Produccion_test_v02ds_4_tfbarcodreo_to ,
                                          String AV115Produccion_test_v02ds_6_tfbarcodpar_sel ,
                                          String AV114Produccion_test_v02ds_5_tfbarcodpar ,
                                          String AV117Produccion_test_v02ds_8_tfbardisnum_sel ,
                                          String AV116Produccion_test_v02ds_7_tfbardisnum ,
                                          int AV118Produccion_test_v02ds_9_tfclicod ,
                                          int AV119Produccion_test_v02ds_10_tfclicod_to ,
                                          String AV121Produccion_test_v02ds_12_tfclinom_sel ,
                                          String AV120Produccion_test_v02ds_11_tfclinom ,
                                          String AV123Produccion_test_v02ds_14_tfbarser_sel ,
                                          String AV122Produccion_test_v02ds_13_tfbarser ,
                                          String AV125Produccion_test_v02ds_16_tfbarserdsc_sel ,
                                          String AV124Produccion_test_v02ds_15_tfbarserdsc ,
                                          String AV127Produccion_test_v02ds_18_tfbarcolnom_sel ,
                                          String AV126Produccion_test_v02ds_17_tfbarcolnom ,
                                          int AV128Produccion_test_v02ds_19_tfbarcolnum ,
                                          int AV129Produccion_test_v02ds_20_tfbarcolnum_to ,
                                          String AV131Produccion_test_v02ds_22_tfbarnomcli_sel ,
                                          String AV130Produccion_test_v02ds_21_tfbarnomcli ,
                                          byte AV132Produccion_test_v02ds_23_tfbarsit ,
                                          byte AV133Produccion_test_v02ds_24_tfbarsit_to ,
                                          java.util.Date AV134Produccion_test_v02ds_25_tfbarfecgen ,
                                          java.util.Date AV135Produccion_test_v02ds_26_tfbarfeccli ,
                                          java.util.Date AV136Produccion_test_v02ds_27_tfbarfecfpr ,
                                          java.util.Date AV137Produccion_test_v02ds_28_tfbarfecsal ,
                                          int AV83CliCod ,
                                          int AV84CliCodto ,
                                          String AV85BarDisNum ,
                                          String AV86BarDisNumTo ,
                                          java.util.Date AV75BarFecGen ,
                                          java.util.Date AV76BarFecGenTo ,
                                          java.util.Date AV77BarFecCli ,
                                          java.util.Date AV78BarFecCliTo ,
                                          java.util.Date AV81BarFecSal ,
                                          java.util.Date AV82BarFecSalto ,
                                          java.util.Date AV79BarFecFpr ,
                                          java.util.Date AV80BarFecFprto ,
                                          String AV71BarColNom ,
                                          String AV73BarColNomto ,
                                          int AV72BarColNum ,
                                          int AV74BarColNumto ,
                                          String AV67BarNomCli ,
                                          String AV69BarNomClito ,
                                          int AV68BarNumCli ,
                                          int AV70BarNumClito ,
                                          int AV57BarCod ,
                                          int AV60BarCodto ,
                                          byte AV58BarCodReo ,
                                          byte AV61BarCodReoto ,
                                          String AV59BarCodPar ,
                                          String AV62BarCodParto ,
                                          String AV54Cod_Idtx ,
                                          String AV55BarGirar ,
                                          short AV63BarTipArt ,
                                          short AV64BarTipArtto ,
                                          String AV65BarSer ,
                                          String AV66BarSerto ,
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
                                          byte AV87BarSit ,
                                          byte AV88BarSitTo ,
                                          String AV93EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[63];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((((TXPBARCAD T1 INNER JOIN TXPDISPOS T2 ON T2.EmprCod = T1.EmprCod AND T2.DisCod = T1.DisCod) LEFT JOIN TXPTIPART T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.TipArtCod = T1.BarTipArt) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) LEFT JOIN TXPTABLE1 T5 ON T5.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T5.Tb1_Cod = T1.BarAcaAnh) LEFT JOIN (SELECT SUM(BarPiePie) AS BarPieNDes, EmprCod, BarCod, BarCodReo, BarCodPar, COUNT(*) AS BarPie1, SUM(BarPieMet) AS BarMtr," ;
      scmdbuf += " SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T6 ON T6.EmprCod = T1.EmprCod AND T6.BarCod = T1.BarCod AND T6.BarCodReo" ;
      scmdbuf += " = T1.BarCodReo AND T6.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV110Produccion_test_v02ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int27[3] = (byte)(1) ;
      }
      if ( ! (0==AV111Produccion_test_v02ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int27[4] = (byte)(1) ;
      }
      if ( ! (0==AV112Produccion_test_v02ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int27[5] = (byte)(1) ;
      }
      if ( ! (0==AV113Produccion_test_v02ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Produccion_test_v02ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV114Produccion_test_v02ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Produccion_test_v02ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Produccion_test_v02ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV116Produccion_test_v02ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Produccion_test_v02ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (0==AV118Produccion_test_v02ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( ! (0==AV119Produccion_test_v02ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Produccion_test_v02ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV120Produccion_test_v02ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T4.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Produccion_test_v02ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T4.CliNom = ?)");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Produccion_test_v02ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV122Produccion_test_v02ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Produccion_test_v02ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int27[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Produccion_test_v02ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Produccion_test_v02ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Produccion_test_v02ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int27[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Produccion_test_v02ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV126Produccion_test_v02ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Produccion_test_v02ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int27[20] = (byte)(1) ;
      }
      if ( ! (0==AV128Produccion_test_v02ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int27[21] = (byte)(1) ;
      }
      if ( ! (0==AV129Produccion_test_v02ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int27[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Produccion_test_v02ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV130Produccion_test_v02ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Produccion_test_v02ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int27[24] = (byte)(1) ;
      }
      if ( ! (0==AV132Produccion_test_v02ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int27[25] = (byte)(1) ;
      }
      if ( ! (0==AV133Produccion_test_v02ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int27[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Produccion_test_v02ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int27[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Produccion_test_v02ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int27[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV136Produccion_test_v02ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int27[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV137Produccion_test_v02ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int27[30] = (byte)(1) ;
      }
      if ( ! (0==AV83CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int27[31] = (byte)(1) ;
      }
      if ( ! (0==AV84CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int27[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85BarDisNum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int27[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int27[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int27[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int27[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int27[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78BarFecCliTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int27[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int27[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int27[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int27[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int27[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int27[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int27[44] = (byte)(1) ;
      }
      if ( ! (0==AV72BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int27[45] = (byte)(1) ;
      }
      if ( ! (0==AV74BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int27[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int27[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int27[48] = (byte)(1) ;
      }
      if ( ! (0==AV68BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int27[49] = (byte)(1) ;
      }
      if ( ! (0==AV70BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int27[50] = (byte)(1) ;
      }
      if ( ! (0==AV57BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int27[51] = (byte)(1) ;
      }
      if ( ! (0==AV60BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int27[52] = (byte)(1) ;
      }
      if ( ! (0==AV58BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int27[53] = (byte)(1) ;
      }
      if ( ! (0==AV61BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int27[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59BarCodPar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int27[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int27[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int27[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int27[58] = (byte)(1) ;
      }
      if ( ! (0==AV63BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int27[59] = (byte)(1) ;
      }
      if ( ! (0==AV64BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int27[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int27[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66BarSerto)==0) )
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

   protected Object[] conditional_H027Q7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV110Produccion_test_v02ds_1_tfbarcod ,
                                          int AV111Produccion_test_v02ds_2_tfbarcod_to ,
                                          byte AV112Produccion_test_v02ds_3_tfbarcodreo ,
                                          byte AV113Produccion_test_v02ds_4_tfbarcodreo_to ,
                                          String AV115Produccion_test_v02ds_6_tfbarcodpar_sel ,
                                          String AV114Produccion_test_v02ds_5_tfbarcodpar ,
                                          String AV117Produccion_test_v02ds_8_tfbardisnum_sel ,
                                          String AV116Produccion_test_v02ds_7_tfbardisnum ,
                                          int AV118Produccion_test_v02ds_9_tfclicod ,
                                          int AV119Produccion_test_v02ds_10_tfclicod_to ,
                                          String AV121Produccion_test_v02ds_12_tfclinom_sel ,
                                          String AV120Produccion_test_v02ds_11_tfclinom ,
                                          String AV123Produccion_test_v02ds_14_tfbarser_sel ,
                                          String AV122Produccion_test_v02ds_13_tfbarser ,
                                          String AV125Produccion_test_v02ds_16_tfbarserdsc_sel ,
                                          String AV124Produccion_test_v02ds_15_tfbarserdsc ,
                                          String AV127Produccion_test_v02ds_18_tfbarcolnom_sel ,
                                          String AV126Produccion_test_v02ds_17_tfbarcolnom ,
                                          int AV128Produccion_test_v02ds_19_tfbarcolnum ,
                                          int AV129Produccion_test_v02ds_20_tfbarcolnum_to ,
                                          String AV131Produccion_test_v02ds_22_tfbarnomcli_sel ,
                                          String AV130Produccion_test_v02ds_21_tfbarnomcli ,
                                          byte AV132Produccion_test_v02ds_23_tfbarsit ,
                                          byte AV133Produccion_test_v02ds_24_tfbarsit_to ,
                                          java.util.Date AV134Produccion_test_v02ds_25_tfbarfecgen ,
                                          java.util.Date AV135Produccion_test_v02ds_26_tfbarfeccli ,
                                          java.util.Date AV136Produccion_test_v02ds_27_tfbarfecfpr ,
                                          java.util.Date AV137Produccion_test_v02ds_28_tfbarfecsal ,
                                          int AV83CliCod ,
                                          int AV84CliCodto ,
                                          String AV85BarDisNum ,
                                          String AV86BarDisNumTo ,
                                          java.util.Date AV75BarFecGen ,
                                          java.util.Date AV76BarFecGenTo ,
                                          java.util.Date AV77BarFecCli ,
                                          java.util.Date AV78BarFecCliTo ,
                                          java.util.Date AV81BarFecSal ,
                                          java.util.Date AV82BarFecSalto ,
                                          java.util.Date AV79BarFecFpr ,
                                          java.util.Date AV80BarFecFprto ,
                                          String AV71BarColNom ,
                                          String AV73BarColNomto ,
                                          int AV72BarColNum ,
                                          int AV74BarColNumto ,
                                          String AV67BarNomCli ,
                                          String AV69BarNomClito ,
                                          int AV68BarNumCli ,
                                          int AV70BarNumClito ,
                                          int AV57BarCod ,
                                          int AV60BarCodto ,
                                          byte AV58BarCodReo ,
                                          byte AV61BarCodReoto ,
                                          String AV59BarCodPar ,
                                          String AV62BarCodParto ,
                                          String AV54Cod_Idtx ,
                                          String AV55BarGirar ,
                                          short AV63BarTipArt ,
                                          short AV64BarTipArtto ,
                                          String AV65BarSer ,
                                          String AV66BarSerto ,
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
                                          byte AV87BarSit ,
                                          byte AV88BarSitTo ,
                                          String AV93EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int29 = new byte[63];
      Object[] GXv_Object30 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ T1.BarTipArt AS BarTipArt, T1.BarGirar, T1.BarProPer, T1.BarNumCli, T1.EmprCod, T1.BarFecSal, T1.BarFecFpr, T1.BarFecCli, T1.BarFecGen," ;
      scmdbuf += " T1.BarSit, T1.BarNomCli, T1.BarColNum, T1.BarColNom, T1.BarSerDsc, T1.BarSer, T2.CliNom, T1.CliCod, T1.BarDisNum, T1.BarCodPar, T1.BarCodReo, T1.BarCod, COALESCE(" ;
      scmdbuf += " T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD" ;
      scmdbuf += " T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar," ;
      scmdbuf += " SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.BarSit >= ?)");
      addWhere(sWhereString, "(T1.BarSit <= ?)");
      if ( ! (0==AV110Produccion_test_v02ds_1_tfbarcod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int29[3] = (byte)(1) ;
      }
      if ( ! (0==AV111Produccion_test_v02ds_2_tfbarcod_to) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int29[4] = (byte)(1) ;
      }
      if ( ! (0==AV112Produccion_test_v02ds_3_tfbarcodreo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int29[5] = (byte)(1) ;
      }
      if ( ! (0==AV113Produccion_test_v02ds_4_tfbarcodreo_to) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int29[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV115Produccion_test_v02ds_6_tfbarcodpar_sel)==0) && ( ! (GXutil.strcmp("", AV114Produccion_test_v02ds_5_tfbarcodpar)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarCodPar) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV115Produccion_test_v02ds_6_tfbarcodpar_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar = ?)");
      }
      else
      {
         GXv_int29[8] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV117Produccion_test_v02ds_8_tfbardisnum_sel)==0) && ( ! (GXutil.strcmp("", AV116Produccion_test_v02ds_7_tfbardisnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarDisNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[9] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV117Produccion_test_v02ds_8_tfbardisnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum = ?)");
      }
      else
      {
         GXv_int29[10] = (byte)(1) ;
      }
      if ( ! (0==AV118Produccion_test_v02ds_9_tfclicod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[11] = (byte)(1) ;
      }
      if ( ! (0==AV119Produccion_test_v02ds_10_tfclicod_to) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV121Produccion_test_v02ds_12_tfclinom_sel)==0) && ( ! (GXutil.strcmp("", AV120Produccion_test_v02ds_11_tfclinom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV121Produccion_test_v02ds_12_tfclinom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int29[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV123Produccion_test_v02ds_14_tfbarser_sel)==0) && ( ! (GXutil.strcmp("", AV122Produccion_test_v02ds_13_tfbarser)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSer) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV123Produccion_test_v02ds_14_tfbarser_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer = ?)");
      }
      else
      {
         GXv_int29[16] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV125Produccion_test_v02ds_16_tfbarserdsc_sel)==0) && ( ! (GXutil.strcmp("", AV124Produccion_test_v02ds_15_tfbarserdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[17] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Produccion_test_v02ds_16_tfbarserdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarSerDsc = ?)");
      }
      else
      {
         GXv_int29[18] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Produccion_test_v02ds_18_tfbarcolnom_sel)==0) && ( ! (GXutil.strcmp("", AV126Produccion_test_v02ds_17_tfbarcolnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[19] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Produccion_test_v02ds_18_tfbarcolnom_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom = ?)");
      }
      else
      {
         GXv_int29[20] = (byte)(1) ;
      }
      if ( ! (0==AV128Produccion_test_v02ds_19_tfbarcolnum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int29[21] = (byte)(1) ;
      }
      if ( ! (0==AV129Produccion_test_v02ds_20_tfbarcolnum_to) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int29[22] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV131Produccion_test_v02ds_22_tfbarnomcli_sel)==0) && ( ! (GXutil.strcmp("", AV130Produccion_test_v02ds_21_tfbarnomcli)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.BarNomCli) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int29[23] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV131Produccion_test_v02ds_22_tfbarnomcli_sel)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli = ?)");
      }
      else
      {
         GXv_int29[24] = (byte)(1) ;
      }
      if ( ! (0==AV132Produccion_test_v02ds_23_tfbarsit) )
      {
         addWhere(sWhereString, "(T1.BarSit >= ?)");
      }
      else
      {
         GXv_int29[25] = (byte)(1) ;
      }
      if ( ! (0==AV133Produccion_test_v02ds_24_tfbarsit_to) )
      {
         addWhere(sWhereString, "(T1.BarSit <= ?)");
      }
      else
      {
         GXv_int29[26] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV134Produccion_test_v02ds_25_tfbarfecgen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int29[27] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV135Produccion_test_v02ds_26_tfbarfeccli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int29[28] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV136Produccion_test_v02ds_27_tfbarfecfpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int29[29] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV137Produccion_test_v02ds_28_tfbarfecsal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int29[30] = (byte)(1) ;
      }
      if ( ! (0==AV83CliCod) )
      {
         addWhere(sWhereString, "(T1.CliCod >= ?)");
      }
      else
      {
         GXv_int29[31] = (byte)(1) ;
      }
      if ( ! (0==AV84CliCodto) )
      {
         addWhere(sWhereString, "(T1.CliCod <= ?)");
      }
      else
      {
         GXv_int29[32] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV85BarDisNum)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum >= ?)");
      }
      else
      {
         GXv_int29[33] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86BarDisNumTo)==0) )
      {
         addWhere(sWhereString, "(T1.BarDisNum <= ?)");
      }
      else
      {
         GXv_int29[34] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV75BarFecGen)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen >= ?)");
      }
      else
      {
         GXv_int29[35] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV76BarFecGenTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecGen <= ?)");
      }
      else
      {
         GXv_int29[36] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV77BarFecCli)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli >= ?)");
      }
      else
      {
         GXv_int29[37] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV78BarFecCliTo)) )
      {
         addWhere(sWhereString, "(T1.BarFecCli <= ?)");
      }
      else
      {
         GXv_int29[38] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV81BarFecSal)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal >= ?)");
      }
      else
      {
         GXv_int29[39] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV82BarFecSalto)) )
      {
         addWhere(sWhereString, "(T1.BarFecSal <= ?)");
      }
      else
      {
         GXv_int29[40] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV79BarFecFpr)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr >= ?)");
      }
      else
      {
         GXv_int29[41] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV80BarFecFprto)) )
      {
         addWhere(sWhereString, "(T1.BarFecFpr <= ?)");
      }
      else
      {
         GXv_int29[42] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71BarColNom)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom >= ?)");
      }
      else
      {
         GXv_int29[43] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73BarColNomto)==0) )
      {
         addWhere(sWhereString, "(T1.BarColNom <= ?)");
      }
      else
      {
         GXv_int29[44] = (byte)(1) ;
      }
      if ( ! (0==AV72BarColNum) )
      {
         addWhere(sWhereString, "(T1.BarColNum >= ?)");
      }
      else
      {
         GXv_int29[45] = (byte)(1) ;
      }
      if ( ! (0==AV74BarColNumto) )
      {
         addWhere(sWhereString, "(T1.BarColNum <= ?)");
      }
      else
      {
         GXv_int29[46] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV67BarNomCli)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli >= ?)");
      }
      else
      {
         GXv_int29[47] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69BarNomClito)==0) )
      {
         addWhere(sWhereString, "(T1.BarNomCli <= ?)");
      }
      else
      {
         GXv_int29[48] = (byte)(1) ;
      }
      if ( ! (0==AV68BarNumCli) )
      {
         addWhere(sWhereString, "(T1.BarNumCli >= ?)");
      }
      else
      {
         GXv_int29[49] = (byte)(1) ;
      }
      if ( ! (0==AV70BarNumClito) )
      {
         addWhere(sWhereString, "(T1.BarNumCli <= ?)");
      }
      else
      {
         GXv_int29[50] = (byte)(1) ;
      }
      if ( ! (0==AV57BarCod) )
      {
         addWhere(sWhereString, "(T1.BarCod >= ?)");
      }
      else
      {
         GXv_int29[51] = (byte)(1) ;
      }
      if ( ! (0==AV60BarCodto) )
      {
         addWhere(sWhereString, "(T1.BarCod <= ?)");
      }
      else
      {
         GXv_int29[52] = (byte)(1) ;
      }
      if ( ! (0==AV58BarCodReo) )
      {
         addWhere(sWhereString, "(T1.BarCodReo >= ?)");
      }
      else
      {
         GXv_int29[53] = (byte)(1) ;
      }
      if ( ! (0==AV61BarCodReoto) )
      {
         addWhere(sWhereString, "(T1.BarCodReo <= ?)");
      }
      else
      {
         GXv_int29[54] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV59BarCodPar)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar >= ?)");
      }
      else
      {
         GXv_int29[55] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62BarCodParto)==0) )
      {
         addWhere(sWhereString, "(T1.BarCodPar <= ?)");
      }
      else
      {
         GXv_int29[56] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV54Cod_Idtx)==0) )
      {
         addWhere(sWhereString, "(T1.BarProPer = ?)");
      }
      else
      {
         GXv_int29[57] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV55BarGirar)==0) )
      {
         addWhere(sWhereString, "(T1.BarGirar = ?)");
      }
      else
      {
         GXv_int29[58] = (byte)(1) ;
      }
      if ( ! (0==AV63BarTipArt) )
      {
         addWhere(sWhereString, "(T1.BarTipArt >= ?)");
      }
      else
      {
         GXv_int29[59] = (byte)(1) ;
      }
      if ( ! (0==AV64BarTipArtto) )
      {
         addWhere(sWhereString, "(T1.BarTipArt <= ?)");
      }
      else
      {
         GXv_int29[60] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV65BarSer)==0) )
      {
         addWhere(sWhereString, "(T1.BarSer >= ?)");
      }
      else
      {
         GXv_int29[61] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV66BarSerto)==0) )
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
                  return conditional_H027Q3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).shortValue() , ((Boolean) dynConstraints[81]).booleanValue() , ((Number) dynConstraints[82]).byteValue() , ((Number) dynConstraints[83]).byteValue() , (String)dynConstraints[84] , (String)dynConstraints[85] );
            case 1 :
                  return conditional_H027Q5(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).shortValue() , ((Boolean) dynConstraints[81]).booleanValue() , ((Number) dynConstraints[82]).byteValue() , ((Number) dynConstraints[83]).byteValue() , (String)dynConstraints[84] , (String)dynConstraints[85] );
            case 2 :
                  return conditional_H027Q7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).byteValue() , ((Number) dynConstraints[3]).byteValue() , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , (String)dynConstraints[21] , ((Number) dynConstraints[22]).byteValue() , ((Number) dynConstraints[23]).byteValue() , (java.util.Date)dynConstraints[24] , (java.util.Date)dynConstraints[25] , (java.util.Date)dynConstraints[26] , (java.util.Date)dynConstraints[27] , ((Number) dynConstraints[28]).intValue() , ((Number) dynConstraints[29]).intValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (java.util.Date)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (java.util.Date)dynConstraints[34] , (java.util.Date)dynConstraints[35] , (java.util.Date)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (java.util.Date)dynConstraints[38] , (java.util.Date)dynConstraints[39] , (String)dynConstraints[40] , (String)dynConstraints[41] , ((Number) dynConstraints[42]).intValue() , ((Number) dynConstraints[43]).intValue() , (String)dynConstraints[44] , (String)dynConstraints[45] , ((Number) dynConstraints[46]).intValue() , ((Number) dynConstraints[47]).intValue() , ((Number) dynConstraints[48]).intValue() , ((Number) dynConstraints[49]).intValue() , ((Number) dynConstraints[50]).byteValue() , ((Number) dynConstraints[51]).byteValue() , (String)dynConstraints[52] , (String)dynConstraints[53] , (String)dynConstraints[54] , (String)dynConstraints[55] , ((Number) dynConstraints[56]).shortValue() , ((Number) dynConstraints[57]).shortValue() , (String)dynConstraints[58] , (String)dynConstraints[59] , ((Number) dynConstraints[60]).intValue() , ((Number) dynConstraints[61]).byteValue() , (String)dynConstraints[62] , (String)dynConstraints[63] , ((Number) dynConstraints[64]).intValue() , (String)dynConstraints[65] , (String)dynConstraints[66] , (String)dynConstraints[67] , (String)dynConstraints[68] , ((Number) dynConstraints[69]).intValue() , (String)dynConstraints[70] , ((Number) dynConstraints[71]).byteValue() , (java.util.Date)dynConstraints[72] , (java.util.Date)dynConstraints[73] , (java.util.Date)dynConstraints[74] , (java.util.Date)dynConstraints[75] , ((Number) dynConstraints[76]).intValue() , (String)dynConstraints[77] , (String)dynConstraints[78] , ((Number) dynConstraints[79]).shortValue() , ((Number) dynConstraints[80]).byteValue() , ((Number) dynConstraints[81]).byteValue() , (String)dynConstraints[82] , (String)dynConstraints[83] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H027Q3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027Q5", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027Q7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027Q8", "SELECT EmprCod, RTRIM(LTRIM(Cod_Idtx)) || '-' || RTRIM(LTRIM(COALESCE( Dsc_Idtx, ''))) AS Dsc_IdtxID, Cod_Idtx, Dsc_Idtx FROM TXPINDITE ORDER BY Dsc_IdtxID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027Q9", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H027Q10", "SELECT EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(TipArtCod,'9990'), 2))) || '-' || RTRIM(LTRIM(COALESCE( TipArtDsc, ''))) || ' ' || RTRIM(LTRIM(COALESCE( TipArtDsc2, ''))) AS TipArtCodD, TipArtCod, TipArtDsc, TipArtDsc2 FROM TXPTIPART ORDER BY TipArtCodD ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((byte[]) buf[25])[0] = rslt.getByte(23);
               ((int[]) buf[26])[0] = rslt.getInt(24);
               ((String[]) buf[27])[0] = rslt.getString(25, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[29])[0] = rslt.getBigDecimal(26,2);
               ((java.math.BigDecimal[]) buf[30])[0] = rslt.getBigDecimal(27,2);
               ((short[]) buf[31])[0] = rslt.getShort(28);
               ((String[]) buf[32])[0] = rslt.getString(29, 1);
               ((int[]) buf[33])[0] = rslt.getInt(30);
               ((String[]) buf[34])[0] = rslt.getString(31, 8);
               ((int[]) buf[35])[0] = rslt.getInt(32);
               ((String[]) buf[36])[0] = rslt.getString(33, 3);
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

