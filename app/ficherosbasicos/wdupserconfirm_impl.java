package app.ficherosbasicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wdupserconfirm_impl extends GXDataArea
{
   public wdupserconfirm_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wdupserconfirm_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wdupserconfirm_impl.class ));
   }

   public wdupserconfirm_impl( int remoteHandle ,
                               ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavOp_e = new HTMLChoice();
      cmbavOp_p = new HTMLChoice();
      chkavSdtduplicaccionserie__selected = UIFactory.getCheckbox(this);
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
            AV14EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14EmprCod", AV14EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV5CliCodOri = (int)(GXutil.lval( httpContext.GetPar( "CliCodOri"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5CliCodOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCodOri), 6, 0));
               AV6CliCodDes = (int)(GXutil.lval( httpContext.GetPar( "CliCodDes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCodDes), 6, 0));
               AV15Op_e = httpContext.GetPar( "Op_e") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15Op_e", AV15Op_e);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOP_E", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Op_e, ""))));
               AV27Op_p = httpContext.GetPar( "Op_p") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27Op_p", AV27Op_p);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOP_P", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Op_p, ""))));
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
      nRC_GXsfl_83 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_83"))) ;
      nGXsfl_83_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_83_idx"))) ;
      sGXsfl_83_idx = httpContext.GetPar( "sGXsfl_83_idx") ;
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
      AV67Pgmname = httpContext.GetPar( "Pgmname") ;
      AV57TFSDTDuplicaccionSerie__ArtCodOri = httpContext.GetPar( "TFSDTDuplicaccionSerie__ArtCodOri") ;
      AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel = httpContext.GetPar( "TFSDTDuplicaccionSerie__ArtCodOri_Sel") ;
      AV59TFSDTDuplicaccionSerie__ArtDscDes = httpContext.GetPar( "TFSDTDuplicaccionSerie__ArtDscDes") ;
      AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel = httpContext.GetPar( "TFSDTDuplicaccionSerie__ArtDscDes_Sel") ;
      AV14EmprCod = httpContext.GetPar( "EmprCod") ;
      AV5CliCodOri = (int)(GXutil.lval( httpContext.GetPar( "CliCodOri"))) ;
      AV6CliCodDes = (int)(GXutil.lval( httpContext.GetPar( "CliCodDes"))) ;
      cmbavOp_e.fromJSonString( httpContext.GetNextPar( ));
      AV15Op_e = httpContext.GetPar( "Op_e") ;
      cmbavOp_p.fromJSonString( httpContext.GetNextPar( ));
      AV27Op_p = httpContext.GetPar( "Op_p") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV35SDTDuplicaccionSerie);
      AV55Moda21 = (byte)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV48Ok_Upd = (byte)(GXutil.lval( httpContext.GetPar( "Ok_Upd"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV67Pgmname, AV57TFSDTDuplicaccionSerie__ArtCodOri, AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel, AV59TFSDTDuplicaccionSerie__ArtDscDes, AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel, AV14EmprCod, AV5CliCodOri, AV6CliCodDes, AV15Op_e, AV27Op_p, AV35SDTDuplicaccionSerie, AV55Moda21, AV48Ok_Upd) ;
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
      pa2352( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2352( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ficherosbasicos.wdupserconfirm", new String[] {GXutil.URLEncode(GXutil.rtrim(AV14EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5CliCodOri,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCodDes,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15Op_e)),GXutil.URLEncode(GXutil.rtrim(AV27Op_p))}, new String[] {"EmprCod","CliCodOri","CliCodDes","Op_e","Op_p"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTDUPLICACCIONSERIE", getSecureSignedToken( "", AV35SDTDuplicaccionSerie));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55Moda21), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOK_UPD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48Ok_Upd), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOP_E", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Op_e, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOP_P", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Op_p, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"wdupserConfirm");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\wdupserconfirm:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtduplicaccionserie", AV35SDTDuplicaccionSerie);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtduplicaccionserie", AV35SDTDuplicaccionSerie);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Sdtduplicaccionserie", getSecureSignedToken( "", AV35SDTDuplicaccionSerie));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_83", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_83, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV10DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV10DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODORI_DATA", AV9CliCodOri_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODORI_DATA", AV9CliCodOri_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODDES_DATA", AV12CliCodDes_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODDES_DATA", AV12CliCodDes_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV38GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV39GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSDTDUPLICACCIONSERIE__ARTCODORI", GXutil.rtrim( AV57TFSDTDuplicaccionSerie__ArtCodOri));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSDTDUPLICACCIONSERIE__ARTCODORI_SEL", GXutil.rtrim( AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSDTDUPLICACCIONSERIE__ARTDSCDES", GXutil.rtrim( AV59TFSDTDuplicaccionSerie__ArtDscDes));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFSDTDUPLICACCIONSERIE__ARTDSCDES_SEL", GXutil.rtrim( AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV14EmprCod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSELECTEDROWS", AV40SelectedRows);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSELECTEDROWS", AV40SelectedRows);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTDUPLICACCIONSERIE", AV35SDTDuplicaccionSerie);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTDUPLICACCIONSERIE", AV35SDTDuplicaccionSerie);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTDUPLICACCIONSERIE", getSecureSignedToken( "", AV35SDTDuplicaccionSerie));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV55Moda21, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55Moda21), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK_UPD", GXutil.ltrim( localUtil.ntoc( AV48Ok_Upd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOK_UPD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48Ok_Upd), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODORI_Cls", GXutil.rtrim( Combo_clicodori_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODORI_Selectedvalue_set", GXutil.rtrim( Combo_clicodori_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODORI_Enabled", GXutil.booltostr( Combo_clicodori_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODORI_Emptyitem", GXutil.booltostr( Combo_clicodori_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Cls", GXutil.rtrim( Combo_clicoddes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Selectedvalue_set", GXutil.rtrim( Combo_clicoddes_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Enabled", GXutil.booltostr( Combo_clicoddes_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Emptyitem", GXutil.booltostr( Combo_clicoddes_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODDES_Selectedvalue_get", GXutil.rtrim( Combo_clicoddes_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODORI_Selectedvalue_get", GXutil.rtrim( Combo_clicodori_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
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
         we2352( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2352( ) ;
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
      return formatLink("app.ficherosbasicos.wdupserconfirm", new String[] {GXutil.URLEncode(GXutil.rtrim(AV14EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV5CliCodOri,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6CliCodDes,6,0)),GXutil.URLEncode(GXutil.rtrim(AV15Op_e)),GXutil.URLEncode(GXutil.rtrim(AV27Op_p))}, new String[] {"EmprCod","CliCodOri","CliCodDes","Op_e","Op_p"})  ;
   }

   public String getPgmname( )
   {
      return "FicherosBasicos.wdupserConfirm" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Duplicidade Series", "") ;
   }

   public void wb2350( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodori_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodori_Internalname, httpContext.getMessage( "Origen", ""), "", "", lblTextblockcombo_clicodori_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\wdupserConfirm.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodori.setProperty("Caption", Combo_clicodori_Caption);
         ucCombo_clicodori.setProperty("Cls", Combo_clicodori_Cls);
         ucCombo_clicodori.setProperty("EmptyItem", Combo_clicodori_Emptyitem);
         ucCombo_clicodori.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_clicodori.setProperty("DropDownOptionsData", AV9CliCodOri_Data);
         ucCombo_clicodori.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodori_Internalname, "COMBO_CLICODORIContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicoddes_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicoddes_Internalname, httpContext.getMessage( "Destino", ""), "", "", lblTextblockcombo_clicoddes_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FicherosBasicos\\wdupserConfirm.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicoddes.setProperty("Caption", Combo_clicoddes_Caption);
         ucCombo_clicoddes.setProperty("Cls", Combo_clicoddes_Cls);
         ucCombo_clicoddes.setProperty("EmptyItem", Combo_clicoddes_Emptyitem);
         ucCombo_clicoddes.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucCombo_clicoddes.setProperty("DropDownOptionsData", AV12CliCodDes_Data);
         ucCombo_clicoddes.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicoddes_Internalname, "COMBO_CLICODDESContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLit7_Internalname, httpContext.getMessage( "Lit7", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLit7_Internalname, GXutil.rtrim( AV7Lit7), GXutil.rtrim( localUtil.format( AV7Lit7, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLit7_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLit7_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\wdupserConfirm.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavOp_e.getInternalname(), httpContext.getMessage( "Op_e", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOp_e, cmbavOp_e.getInternalname(), GXutil.rtrim( AV15Op_e), 1, cmbavOp_e.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavOp_e.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_FicherosBasicos\\wdupserConfirm.htm");
         cmbavOp_e.setValue( GXutil.rtrim( AV15Op_e) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOp_e.getInternalname(), "Values", cmbavOp_e.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavLit8_Internalname, httpContext.getMessage( "Lit8", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_83_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavLit8_Internalname, GXutil.rtrim( AV8Lit8), GXutil.rtrim( localUtil.format( AV8Lit8, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavLit8_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavLit8_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\wdupserConfirm.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavOp_p.getInternalname(), httpContext.getMessage( "Op_p", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavOp_p, cmbavOp_p.getInternalname(), GXutil.rtrim( AV27Op_p), 1, cmbavOp_p.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavOp_p.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_FicherosBasicos\\wdupserConfirm.htm");
         cmbavOp_p.setValue( GXutil.rtrim( AV27Op_p) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOp_p.getInternalname(), "Values", cmbavOp_p.ToJavascriptSource(), true);
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "Button WWPBtnNeedMultiRowWOPagingSelection" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnbtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 83, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnbtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, bttBtnbtnconfirmar_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112351_client"+"'", TempTags, "", 2, "HLP_FicherosBasicos\\wdupserConfirm.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 83, 2, 0)+","+"null"+");", httpContext.getMessage( "Volver", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FicherosBasicos\\wdupserConfirm.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTablebarprogress_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucProgressbar.render(context, "gxprogressindicator", Progressbar_Internalname, "PROGRESSBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, divTablegrid_Internalname, 1, 0, "px", 0, "px", "ta", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol83( ) ;
      }
      if ( wbEnd == 83 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_83 = (int)(nGXsfl_83_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV63GXV1 = nGXsfl_83_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV38GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV39GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV67Pgmname), GXutil.rtrim( localUtil.format( AV67Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FicherosBasicos\\wdupserConfirm.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodori_Internalname, GXutil.ltrim( localUtil.ntoc( AV5CliCodOri, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5CliCodOri), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", edtavClicodori_Tooltiptext, "", edtavClicodori_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodori_Visible, 0, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\wdupserConfirm.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicoddes_Internalname, GXutil.ltrim( localUtil.ntoc( AV6CliCodDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV6CliCodDes), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", edtavClicoddes_Tooltiptext, "", edtavClicoddes_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicoddes_Visible, 0, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FicherosBasicos\\wdupserConfirm.htm");
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV10DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_106_2352( true) ;
      }
      else
      {
         wb_table1_106_2352( false) ;
      }
      return  ;
   }

   public void wb_table1_106_2352e( boolean wbgen )
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
      if ( wbEnd == 83 )
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
               AV63GXV1 = nGXsfl_83_idx ;
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

   public void start2352( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Duplicidade Series", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2350( ) ;
   }

   public void ws2352( )
   {
      start2352( ) ;
      evt2352( ) ;
   }

   public void evt2352( )
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
                           e122352 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132352 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142352 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152352 ();
                           /* No code required for Cancel button. It is implemented as the Reset button. */
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_83_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_832( ) ;
                           AV63GXV1 = (int)(nGXsfl_83_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV35SDTDuplicaccionSerie.size() >= AV63GXV1 ) && ( AV63GXV1 > 0 ) )
                           {
                              AV35SDTDuplicaccionSerie.currentItem( ((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV35SDTDuplicaccionSerie.elementAt(-1+AV63GXV1)) );
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
                                 e162352 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e172352 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e182352 ();
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

   public void we2352( )
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

   public void pa2352( )
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
            GX_FocusControl = edtavLit7_Internalname ;
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
      subsflControlProps_832( ) ;
      while ( nGXsfl_83_idx <= nRC_GXsfl_83 )
      {
         sendrow_832( ) ;
         nGXsfl_83_idx = ((subGrid_Islastpage==1)&&(nGXsfl_83_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_83_idx+1) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_832( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV67Pgmname ,
                                 String AV57TFSDTDuplicaccionSerie__ArtCodOri ,
                                 String AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel ,
                                 String AV59TFSDTDuplicaccionSerie__ArtDscDes ,
                                 String AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel ,
                                 String AV14EmprCod ,
                                 int AV5CliCodOri ,
                                 int AV6CliCodDes ,
                                 String AV15Op_e ,
                                 String AV27Op_p ,
                                 GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie> AV35SDTDuplicaccionSerie ,
                                 byte AV55Moda21 ,
                                 byte AV48Ok_Upd )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e172352 ();
      GRID_nCurrentRecord = 0 ;
      rf2352( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"wdupserConfirm");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ficherosbasicos\\wdupserconfirm:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      if ( cmbavOp_e.getItemCount() > 0 )
      {
         AV15Op_e = cmbavOp_e.getValidValue(AV15Op_e) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Op_e", AV15Op_e);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOP_E", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Op_e, ""))));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOp_e.setValue( GXutil.rtrim( AV15Op_e) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOp_e.getInternalname(), "Values", cmbavOp_e.ToJavascriptSource(), true);
      }
      if ( cmbavOp_p.getItemCount() > 0 )
      {
         AV27Op_p = cmbavOp_p.getValidValue(AV27Op_p) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Op_p", AV27Op_p);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOP_P", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Op_p, ""))));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavOp_p.setValue( GXutil.rtrim( AV27Op_p) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavOp_p.getInternalname(), "Values", cmbavOp_p.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2352( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV67Pgmname = "FicherosBasicos.wdupserConfirm" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavLit7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit7_Enabled), 5, 0), true);
      edtavLit8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit8_Enabled), 5, 0), true);
      edtavSdtduplicaccionserie__artcodori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtduplicaccionserie__artcodori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtduplicaccionserie__artcodori_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtavSdtduplicaccionserie__artdscdes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtduplicaccionserie__artdscdes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtduplicaccionserie__artdscdes_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2352( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(83) ;
      /* Execute user event: Refresh */
      e172352 ();
      nGXsfl_83_idx = 1 ;
      sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_832( ) ;
      bGXsfl_83_Refreshing = true ;
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
         subsflControlProps_832( ) ;
         e182352 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_83_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e182352 ();
         }
         wbEnd = (short)(83) ;
         wb2350( ) ;
      }
      bGXsfl_83_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2352( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTDUPLICACCIONSERIE", AV35SDTDuplicaccionSerie);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTDUPLICACCIONSERIE", AV35SDTDuplicaccionSerie);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTDUPLICACCIONSERIE", getSecureSignedToken( "", AV35SDTDuplicaccionSerie));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV55Moda21, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55Moda21), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK_UPD", GXutil.ltrim( localUtil.ntoc( AV48Ok_Upd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOK_UPD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV48Ok_Upd), "9")));
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
      return AV35SDTDuplicaccionSerie.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67Pgmname, AV57TFSDTDuplicaccionSerie__ArtCodOri, AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel, AV59TFSDTDuplicaccionSerie__ArtDscDes, AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel, AV14EmprCod, AV5CliCodOri, AV6CliCodDes, AV15Op_e, AV27Op_p, AV35SDTDuplicaccionSerie, AV55Moda21, AV48Ok_Upd) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67Pgmname, AV57TFSDTDuplicaccionSerie__ArtCodOri, AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel, AV59TFSDTDuplicaccionSerie__ArtDscDes, AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel, AV14EmprCod, AV5CliCodOri, AV6CliCodDes, AV15Op_e, AV27Op_p, AV35SDTDuplicaccionSerie, AV55Moda21, AV48Ok_Upd) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67Pgmname, AV57TFSDTDuplicaccionSerie__ArtCodOri, AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel, AV59TFSDTDuplicaccionSerie__ArtDscDes, AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel, AV14EmprCod, AV5CliCodOri, AV6CliCodDes, AV15Op_e, AV27Op_p, AV35SDTDuplicaccionSerie, AV55Moda21, AV48Ok_Upd) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67Pgmname, AV57TFSDTDuplicaccionSerie__ArtCodOri, AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel, AV59TFSDTDuplicaccionSerie__ArtDscDes, AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel, AV14EmprCod, AV5CliCodOri, AV6CliCodDes, AV15Op_e, AV27Op_p, AV35SDTDuplicaccionSerie, AV55Moda21, AV48Ok_Upd) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV67Pgmname, AV57TFSDTDuplicaccionSerie__ArtCodOri, AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel, AV59TFSDTDuplicaccionSerie__ArtDscDes, AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel, AV14EmprCod, AV5CliCodOri, AV6CliCodDes, AV15Op_e, AV27Op_p, AV35SDTDuplicaccionSerie, AV55Moda21, AV48Ok_Upd) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV67Pgmname = "FicherosBasicos.wdupserConfirm" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
      Gx_err = (short)(0) ;
      edtavLit7_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit7_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit7_Enabled), 5, 0), true);
      edtavLit8_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavLit8_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavLit8_Enabled), 5, 0), true);
      edtavSdtduplicaccionserie__artcodori_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtduplicaccionserie__artcodori_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtduplicaccionserie__artcodori_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtavSdtduplicaccionserie__artdscdes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtduplicaccionserie__artdscdes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtduplicaccionserie__artdscdes_Enabled), 5, 0), !bGXsfl_83_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2350( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e162352 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtduplicaccionserie"), AV35SDTDuplicaccionSerie);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV10DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODORI_DATA"), AV9CliCodOri_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODDES_DATA"), AV12CliCodDes_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTDUPLICACCIONSERIE"), AV35SDTDuplicaccionSerie);
         /* Read saved values. */
         nRC_GXsfl_83 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV38GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV39GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_clicodori_Cls = httpContext.cgiGet( "COMBO_CLICODORI_Cls") ;
         Combo_clicodori_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODORI_Selectedvalue_set") ;
         Combo_clicodori_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICODORI_Enabled")) ;
         Combo_clicodori_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICODORI_Emptyitem")) ;
         Combo_clicoddes_Cls = httpContext.cgiGet( "COMBO_CLICODDES_Cls") ;
         Combo_clicoddes_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODDES_Selectedvalue_set") ;
         Combo_clicoddes_Enabled = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICODDES_Enabled")) ;
         Combo_clicoddes_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_CLICODDES_Emptyitem")) ;
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
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         nRC_GXsfl_83 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_83"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_83_fel_idx = 0 ;
         while ( nGXsfl_83_fel_idx < nRC_GXsfl_83 )
         {
            nGXsfl_83_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_83_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_83_fel_idx+1) ;
            sGXsfl_83_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_832( ) ;
            AV63GXV1 = (int)(nGXsfl_83_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV35SDTDuplicaccionSerie.size() >= AV63GXV1 ) && ( AV63GXV1 > 0 ) )
            {
               AV35SDTDuplicaccionSerie.currentItem( ((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV35SDTDuplicaccionSerie.elementAt(-1+AV63GXV1)) );
            }
         }
         if ( nGXsfl_83_fel_idx == 0 )
         {
            nGXsfl_83_idx = 1 ;
            sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_832( ) ;
         }
         nGXsfl_83_fel_idx = 1 ;
         /* Read variables values. */
         AV7Lit7 = httpContext.cgiGet( edtavLit7_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Lit7", AV7Lit7);
         AV8Lit8 = httpContext.cgiGet( edtavLit8_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Lit8", AV8Lit8);
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"wdupserConfirm");
         AV67Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67Pgmname", AV67Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV67Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ficherosbasicos\\wdupserconfirm:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e162352 ();
      if (returnInSub) return;
   }

   public void e162352( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV53Lit0 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char2) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV53Lit0 = GXt_char1 ;
      GXt_char1 = AV52Lit2 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV67Pgmname, (byte)(99), GXv_char2) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV52Lit2 = GXt_char1 ;
      GXt_char1 = AV21Lit3 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN815_", ""), (byte)(99), GXv_char2) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Lit3 = GXt_char1 ;
      GXt_char1 = AV22Lit4 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN074_", ""), (byte)(99), GXv_char2) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Lit4 = GXt_char1 ;
      GXt_char1 = AV23Lit5 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Lit5 = GXt_char1 ;
      GXt_char1 = AV24Lit6 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WGEN073_", ""), (byte)(99), GXv_char2) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV24Lit6 = GXt_char1 ;
      GXt_char1 = AV7Lit7 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( "WJLN206", (byte)(99), GXv_char2) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV7Lit7 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Lit7", AV7Lit7);
      GXt_char1 = AV8Lit8 ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( "WJLN207", (byte)(99), GXv_char2) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV8Lit8 = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Lit8", AV8Lit8);
      GXt_char1 = AV54Litfe ;
      GXv_char2[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char2) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV54Litfe = GXt_char1 ;
      edtavClicodori_Tooltiptext = AV22Lit4 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodori_Internalname, "Tooltiptext", edtavClicodori_Tooltiptext, true);
      edtavClicoddes_Tooltiptext = AV7Lit7 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicoddes_Internalname, "Tooltiptext", edtavClicoddes_Tooltiptext, true);
      GXv_int3[0] = AV55Moda21 ;
      new app.pexicon(remoteHandle, context).execute( AV14EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int3) ;
      wdupserconfirm_impl.this.AV55Moda21 = GXv_int3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55Moda21", GXutil.str( AV55Moda21, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55Moda21), "9")));
      GXt_char1 = AV18Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char2[0] ;
      AV18Station = GXt_char1 ;
      GXv_char2[0] = AV14EmprCod ;
      GXv_char4[0] = AV19EmprNom ;
      GXv_char5[0] = AV20UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV18Station, GXv_char2, GXv_char4, GXv_char5) ;
      wdupserconfirm_impl.this.AV14EmprCod = GXv_char2[0] ;
      wdupserconfirm_impl.this.AV19EmprNom = GXv_char4[0] ;
      wdupserconfirm_impl.this.AV20UsurCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprCod", AV14EmprCod);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV10DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV10DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtavClicoddes_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicoddes_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicoddes_Visible), 5, 0), true);
      Combo_clicoddes_Enabled = false ;
      ucCombo_clicoddes.sendProperty(context, "", false, Combo_clicoddes_Internalname, "Enabled", GXutil.booltostr( Combo_clicoddes_Enabled));
      edtavClicodori_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodori_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodori_Visible), 5, 0), true);
      Combo_clicodori_Enabled = false ;
      ucCombo_clicodori.sendProperty(context, "", false, Combo_clicodori_Internalname, "Enabled", GXutil.booltostr( Combo_clicodori_Enabled));
      /* Execute user subroutine: 'LOADCOMBOCLICODORI' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADCOMBOCLICODDES' */
      S122 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Duplicidade Series", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      chkavSdtduplicaccionserie__selected.setTitleFormat( (short)(1) );
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV10DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV10DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      bttBtnbtnconfirmar_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnbtnconfirmar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnbtnconfirmar_Visible), 5, 0), true);
   }

   public void e172352( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext8[0] = AV29WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV29WWPContext = GXv_SdtWWPContext8[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      chkavSdtduplicaccionserie__selected.setTitle( GXutil.format( "<input name=\"selectAllCheckbox\" type=\"checkbox\" value=\"Select All\" onClick=\"WWPSelectAll(this, %1);\" onMouseOver=\"WWPSelectAllRemoveParentOnClick(this)\" class=\"AttributeCheckBox\" >", "'SELECTED'", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtduplicaccionserie__selected.getInternalname(), "Title", chkavSdtduplicaccionserie__selected.getTitle(), !bGXsfl_83_Refreshing);
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S152 ();
      if (returnInSub) return;
      AV38GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridCurrentPage), 10, 0));
      AV39GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV35SDTDuplicaccionSerie", AV35SDTDuplicaccionSerie);
   }

   public void e122352( )
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
         AV37PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV37PageToGo) ;
      }
   }

   public void e132352( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e142352( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SDTDuplicaccionSerie__ArtCodOri") == 0 )
         {
            AV57TFSDTDuplicaccionSerie__ArtCodOri = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFSDTDuplicaccionSerie__ArtCodOri", AV57TFSDTDuplicaccionSerie__ArtCodOri);
            AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel", AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "SDTDuplicaccionSerie__ArtDscDes") == 0 )
         {
            AV59TFSDTDuplicaccionSerie__ArtDscDes = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFSDTDuplicaccionSerie__ArtDscDes", AV59TFSDTDuplicaccionSerie__ArtDscDes);
            AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel", AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e182352( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV63GXV1 = 1 ;
      while ( AV63GXV1 <= AV35SDTDuplicaccionSerie.size() )
      {
         AV35SDTDuplicaccionSerie.currentItem( ((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV35SDTDuplicaccionSerie.elementAt(-1+AV63GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(83) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_832( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_83_Refreshing )
         {
            httpContext.doAjaxLoad(83, GridRow);
         }
         AV63GXV1 = (int)(AV63GXV1+1) ;
      }
   }

   public void e152352( )
   {
      AV63GXV1 = (int)(nGXsfl_83_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV63GXV1 > 0 ) && ( AV35SDTDuplicaccionSerie.size() >= AV63GXV1 ) )
      {
         AV35SDTDuplicaccionSerie.currentItem( ((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV35SDTDuplicaccionSerie.elementAt(-1+AV63GXV1)) );
      }
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION BTNCONFIRMAR' */
         S162 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51ProgressIndicator", AV51ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV40SelectedRows", AV40SelectedRows);
   }

   public void S152( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTDuplicaccionSerie_Serie9 = AV35SDTDuplicaccionSerie ;
      GXv_objcol_SdtSDTDuplicaccionSerie_Serie10[0] = GXt_objcol_SdtSDTDuplicaccionSerie_Serie9 ;
      new app.ficherosbasicos.dpduplicacionserie(remoteHandle, context).execute( AV14EmprCod, (short)(AV5CliCodOri), GXv_objcol_SdtSDTDuplicaccionSerie_Serie10) ;
      GXt_objcol_SdtSDTDuplicaccionSerie_Serie9 = GXv_objcol_SdtSDTDuplicaccionSerie_Serie10[0] ;
      AV35SDTDuplicaccionSerie = GXt_objcol_SdtSDTDuplicaccionSerie_Serie9 ;
      gx_BV83 = true ;
   }

   public void S162( )
   {
      /* 'DO ACTION BTNCONFIRMAR' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADSELECTEDROWS' */
      S172 ();
      if (returnInSub) return;
      if ( AV40SelectedRows.size() == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_NoRecordSelected", ""));
      }
      if ( AV40SelectedRows.size() > 0 )
      {
         AV45TotalSelected = (short)(0) ;
         AV44TotalGrid = (short)(AV35SDTDuplicaccionSerie.size()) ;
         AV45TotalSelected = (short)(AV40SelectedRows.size()) ;
         AV68GXV5 = 1 ;
         while ( AV68GXV5 <= AV40SelectedRows.size() )
         {
            AV49SelectedRows_row = (app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV40SelectedRows.elementAt(-1+AV68GXV5));
            if ( AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Selected() )
            {
               if ( AV55Moda21 == 1 )
               {
                  GXt_int11 = (byte)(AV46FlagArt) ;
                  GXv_int3[0] = GXt_int11 ;
                  new app.pbusart(remoteHandle, context).execute( AV14EmprCod, AV5CliCodOri, AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori(), GXv_int3) ;
                  wdupserconfirm_impl.this.GXt_int11 = GXv_int3[0] ;
                  AV46FlagArt = GXt_int11 ;
               }
            }
            AV68GXV5 = (int)(AV68GXV5+1) ;
         }
         AV43Cont = (short)(0) ;
         AV51ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
         AV51ProgressIndicator.showwithtitle(httpContext.getMessage( "Áctualizando.........", ""));
         AV51ProgressIndicator.setgxTv_SdtProgress_Maxvalue( AV45TotalSelected );
         AV69GXV6 = 1 ;
         while ( AV69GXV6 <= AV40SelectedRows.size() )
         {
            AV49SelectedRows_row = (app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV40SelectedRows.elementAt(-1+AV69GXV6));
            if ( AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Selected() )
            {
               AV50vVar = GXutil.str( AV6CliCodDes, 6, 0) + "/" + AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori() ;
               AV51ProgressIndicator.setgxTv_SdtProgress_Description( GXutil.format( httpContext.getMessage( "Procesando Cliente/Serie Destino = %1", ""), AV50vVar, "", "", "", "", "", "", "", "") );
               AV43Cont = (short)(AV43Cont+1) ;
               if ( AV48Ok_Upd == 0 )
               {
                  GXv_char5[0] = AV14EmprCod ;
                  GXv_char4[0] = AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes() ;
                  GXv_char2[0] = " " ;
                  new app.pnewse2(remoteHandle, context).execute( GXv_char5, AV5CliCodOri, AV6CliCodDes, AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori(), GXv_char4, GXv_char2) ;
                  wdupserconfirm_impl.this.AV14EmprCod = GXv_char5[0] ;
                  AV49SelectedRows_row.setgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes( GXv_char4[0] );
                  httpContext.ajax_rsp_assign_attri("", false, "AV14EmprCod", AV14EmprCod);
               }
               else
               {
                  GXt_int11 = (byte)(AV46FlagArt) ;
                  GXv_int3[0] = GXt_int11 ;
                  new app.pbusart(remoteHandle, context).execute( AV14EmprCod, AV6CliCodDes, AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori(), GXv_int3) ;
                  wdupserconfirm_impl.this.GXt_int11 = GXv_int3[0] ;
                  AV46FlagArt = GXt_int11 ;
                  if ( AV46FlagArt == 1 )
                  {
                     new app.pmodse2(remoteHandle, context).execute( AV14EmprCod, AV5CliCodOri, AV6CliCodDes, AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori(), AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes(), AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes()) ;
                  }
                  else
                  {
                     GXv_char5[0] = AV14EmprCod ;
                     GXv_char4[0] = AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes() ;
                     GXv_char2[0] = " " ;
                     new app.pnewse2(remoteHandle, context).execute( GXv_char5, AV5CliCodOri, AV6CliCodDes, AV49SelectedRows_row.getgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori(), GXv_char4, GXv_char2) ;
                     wdupserconfirm_impl.this.AV14EmprCod = GXv_char5[0] ;
                     AV49SelectedRows_row.setgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes( GXv_char4[0] );
                     httpContext.ajax_rsp_assign_attri("", false, "AV14EmprCod", AV14EmprCod);
                  }
               }
               AV51ProgressIndicator.setgxTv_SdtProgress_Value( AV43Cont );
            }
            AV69GXV6 = (int)(AV69GXV6+1) ;
         }
         AV51ProgressIndicator.hide();
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S172( )
   {
      /* 'LOADSELECTEDROWS' Routine */
      returnInSub = false ;
      AV40SelectedRows = new GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie>(app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie.class, "Serie", "TexplusNET", remoteHandle) ;
      AV70GXV7 = 1 ;
      while ( AV70GXV7 <= AV35SDTDuplicaccionSerie.size() )
      {
         AV42SDTDuplicaccionSerieItem = (app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV35SDTDuplicaccionSerie.elementAt(-1+AV70GXV7));
         if ( AV42SDTDuplicaccionSerieItem.getgxTv_SdtSDTDuplicaccionSerie_Serie_Selected() )
         {
            AV41SelectedRow = AV42SDTDuplicaccionSerieItem.Clone();
            AV40SelectedRows.add(AV41SelectedRow, 0);
         }
         AV70GXV7 = (int)(AV70GXV7+1) ;
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV36Session.getValue(AV67Pgmname+"GridState"), "") == 0 )
      {
         AV33GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV67Pgmname+"GridState"), null, null);
      }
      else
      {
         AV33GridState.fromxml(AV36Session.getValue(AV67Pgmname+"GridState"), null, null);
      }
      AV71GXV8 = 1 ;
      while ( AV71GXV8 <= AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV71GXV8));
         if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTDUPLICACCIONSERIE__ARTCODORI") == 0 )
         {
            AV57TFSDTDuplicaccionSerie__ArtCodOri = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFSDTDuplicaccionSerie__ArtCodOri", AV57TFSDTDuplicaccionSerie__ArtCodOri);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTDUPLICACCIONSERIE__ARTCODORI_SEL") == 0 )
         {
            AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel", AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTDUPLICACCIONSERIE__ARTDSCDES") == 0 )
         {
            AV59TFSDTDuplicaccionSerie__ArtDscDes = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFSDTDuplicaccionSerie__ArtDscDes", AV59TFSDTDuplicaccionSerie__ArtDscDes);
         }
         else if ( GXutil.strcmp(AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFSDTDUPLICACCIONSERIE__ARTDSCDES_SEL") == 0 )
         {
            AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel = AV34GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel", AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel);
         }
         AV71GXV8 = (int)(AV71GXV8+1) ;
      }
      GXt_char1 = "" ;
      GXv_char5[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel)==0), AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel, GXv_char5) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char5[0] ;
      GXt_char12 = "" ;
      GXv_char4[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel)==0), AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel, GXv_char4) ;
      wdupserconfirm_impl.this.GXt_char12 = GXv_char4[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char12 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char12 = "" ;
      GXv_char5[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFSDTDuplicaccionSerie__ArtCodOri)==0), AV57TFSDTDuplicaccionSerie__ArtCodOri, GXv_char5) ;
      wdupserconfirm_impl.this.GXt_char12 = GXv_char5[0] ;
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFSDTDuplicaccionSerie__ArtDscDes)==0), AV59TFSDTDuplicaccionSerie__ArtDscDes, GXv_char4) ;
      wdupserconfirm_impl.this.GXt_char1 = GXv_char4[0] ;
      Ddo_grid_Filteredtext_set = GXt_char12+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV33GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV33GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV33GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV33GridState.fromxml(AV36Session.getValue(AV67Pgmname+"GridState"), null, null);
      AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState13[0] = AV33GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFSDTDUPLICACCIONSERIE__ARTCODORI", "", !(GXutil.strcmp("", AV57TFSDTDuplicaccionSerie__ArtCodOri)==0), (short)(0), AV57TFSDTDuplicaccionSerie__ArtCodOri, "", !(GXutil.strcmp("", AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel)==0), AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel, "") ;
      AV33GridState = GXv_SdtWWPGridState13[0] ;
      GXv_SdtWWPGridState13[0] = AV33GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState13, "TFSDTDUPLICACCIONSERIE__ARTDSCDES", "", !(GXutil.strcmp("", AV59TFSDTDuplicaccionSerie__ArtDscDes)==0), (short)(0), AV59TFSDTDuplicaccionSerie__ArtDscDes, "", !(GXutil.strcmp("", AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel)==0), AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel, "") ;
      AV33GridState = GXv_SdtWWPGridState13[0] ;
      if ( ! (GXutil.strcmp("", AV14EmprCod)==0) )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV34GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV34GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV14EmprCod );
         AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV34GridStateFilterValue, 0);
      }
      if ( ! (0==AV5CliCodOri) )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV34GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODORI" );
         AV34GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV5CliCodOri, 6, 0) );
         AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV34GridStateFilterValue, 0);
      }
      if ( ! (0==AV6CliCodDes) )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV34GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CLICODDES" );
         AV34GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6CliCodDes, 6, 0) );
         AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV34GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV15Op_e)==0) )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV34GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OP_E" );
         AV34GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV15Op_e );
         AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV34GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV27Op_p)==0) )
      {
         AV34GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV34GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&OP_P" );
         AV34GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV27Op_p );
         AV33GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV34GridStateFilterValue, 0);
      }
      AV33GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV33GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV67Pgmname+"GridState", AV33GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODDES' Routine */
      returnInSub = false ;
      AV12CliCodDes_Data.sort("Title");
      Combo_clicoddes_Selectedvalue_set = ((0==AV6CliCodDes) ? "" : GXutil.trim( GXutil.str( AV6CliCodDes, 6, 0))) ;
      ucCombo_clicoddes.sendProperty(context, "", false, Combo_clicoddes_Internalname, "SelectedValue_set", Combo_clicoddes_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODORI' Routine */
      returnInSub = false ;
      AV9CliCodOri_Data.sort("Title");
      Combo_clicodori_Selectedvalue_set = ((0==AV5CliCodOri) ? "" : GXutil.trim( GXutil.str( AV5CliCodOri, 6, 0))) ;
      ucCombo_clicodori.sendProperty(context, "", false, Combo_clicodori_Internalname, "SelectedValue_set", Combo_clicodori_Selectedvalue_set);
   }

   public void wb_table1_106_2352( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_106_2352e( true) ;
      }
      else
      {
         wb_table1_106_2352e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV14EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14EmprCod", AV14EmprCod);
      AV5CliCodOri = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5CliCodOri", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5CliCodOri), 6, 0));
      AV6CliCodDes = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CliCodDes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CliCodDes), 6, 0));
      AV15Op_e = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Op_e", AV15Op_e);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOP_E", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Op_e, ""))));
      AV27Op_p = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Op_p", AV27Op_p);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOP_P", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Op_p, ""))));
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
      pa2352( ) ;
      ws2352( ) ;
      we2352( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116143984", true, true);
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
      httpContext.AddJavascriptSource("ficherosbasicos/wdupserconfirm.js", "?202682116143984", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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

   public void subsflControlProps_832( )
   {
      chkavSdtduplicaccionserie__selected.setInternalname( "SDTDUPLICACCIONSERIE__SELECTED_"+sGXsfl_83_idx );
      edtavSdtduplicaccionserie__artcodori_Internalname = "SDTDUPLICACCIONSERIE__ARTCODORI_"+sGXsfl_83_idx ;
      edtavSdtduplicaccionserie__artdscdes_Internalname = "SDTDUPLICACCIONSERIE__ARTDSCDES_"+sGXsfl_83_idx ;
   }

   public void subsflControlProps_fel_832( )
   {
      chkavSdtduplicaccionserie__selected.setInternalname( "SDTDUPLICACCIONSERIE__SELECTED_"+sGXsfl_83_fel_idx );
      edtavSdtduplicaccionserie__artcodori_Internalname = "SDTDUPLICACCIONSERIE__ARTCODORI_"+sGXsfl_83_fel_idx ;
      edtavSdtduplicaccionserie__artdscdes_Internalname = "SDTDUPLICACCIONSERIE__ARTDSCDES_"+sGXsfl_83_fel_idx ;
   }

   public void sendrow_832( )
   {
      subsflControlProps_832( ) ;
      wb2350( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_83_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_83_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_83_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSdtduplicaccionserie__selected.getEnabled()!=0)&&(chkavSdtduplicaccionserie__selected.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 84,'',false,'"+sGXsfl_83_idx+"',83)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDTDUPLICACCIONSERIE__SELECTED_" + sGXsfl_83_idx ;
         chkavSdtduplicaccionserie__selected.setName( GXCCtl );
         chkavSdtduplicaccionserie__selected.setWebtags( "" );
         chkavSdtduplicaccionserie__selected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSdtduplicaccionserie__selected.getInternalname(), "TitleCaption", chkavSdtduplicaccionserie__selected.getCaption(), !bGXsfl_83_Refreshing);
         chkavSdtduplicaccionserie__selected.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtduplicaccionserie__selected.getInternalname(),GXutil.booltostr( ((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV35SDTDuplicaccionSerie.elementAt(-1+AV63GXV1)).getgxTv_SdtSDTDuplicaccionSerie_Serie_Selected()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(84, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtduplicaccionserie__selected.getEnabled()!=0)&&(chkavSdtduplicaccionserie__selected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,84);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtduplicaccionserie__artcodori_Internalname,GXutil.rtrim( ((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV35SDTDuplicaccionSerie.elementAt(-1+AV63GXV1)).getgxTv_SdtSDTDuplicaccionSerie_Serie_Artcodori()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtduplicaccionserie__artcodori_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtduplicaccionserie__artcodori_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtduplicaccionserie__artdscdes_Internalname,GXutil.rtrim( ((app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie)AV35SDTDuplicaccionSerie.elementAt(-1+AV63GXV1)).getgxTv_SdtSDTDuplicaccionSerie_Serie_Artdscdes()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtduplicaccionserie__artdscdes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtduplicaccionserie__artdscdes_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(83),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2352( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_83_idx = ((subGrid_Islastpage==1)&&(nGXsfl_83_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_83_idx+1) ;
         sGXsfl_83_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_83_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_832( ) ;
      }
      /* End function sendrow_832 */
   }

   public void startgridcontrol83( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"83\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         if ( chkavSdtduplicaccionserie__selected.getTitleFormat() == 0 )
         {
            httpContext.writeValue( chkavSdtduplicaccionserie__selected.getTitle()) ;
         }
         else
         {
            httpContext.writeText( chkavSdtduplicaccionserie__selected.getTitle()) ;
         }
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artículo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
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
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( chkavSdtduplicaccionserie__selected.getTitle()));
         GridColumn.AddObjectProperty("Titleformat", GXutil.ltrim( localUtil.ntoc( chkavSdtduplicaccionserie__selected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtduplicaccionserie__artcodori_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtduplicaccionserie__artdscdes_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblockcombo_clicodori_Internalname = "TEXTBLOCKCOMBO_CLICODORI" ;
      Combo_clicodori_Internalname = "COMBO_CLICODORI" ;
      divTablesplittedclicodori_Internalname = "TABLESPLITTEDCLICODORI" ;
      lblTextblockcombo_clicoddes_Internalname = "TEXTBLOCKCOMBO_CLICODDES" ;
      Combo_clicoddes_Internalname = "COMBO_CLICODDES" ;
      divTablesplittedclicoddes_Internalname = "TABLESPLITTEDCLICODDES" ;
      edtavLit7_Internalname = "vLIT7" ;
      cmbavOp_e.setInternalname( "vOP_E" );
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavLit8_Internalname = "vLIT8" ;
      cmbavOp_p.setInternalname( "vOP_P" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnbtnconfirmar_Internalname = "BTNBTNCONFIRMAR" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTablebarprogress_Internalname = "TABLEBARPROGRESS" ;
      chkavSdtduplicaccionserie__selected.setInternalname( "SDTDUPLICACCIONSERIE__SELECTED" );
      edtavSdtduplicaccionserie__artcodori_Internalname = "SDTDUPLICACCIONSERIE__ARTCODORI" ;
      edtavSdtduplicaccionserie__artdscdes_Internalname = "SDTDUPLICACCIONSERIE__ARTDSCDES" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablegrid_Internalname = "TABLEGRID" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodori_Internalname = "vCLICODORI" ;
      edtavClicoddes_Internalname = "vCLICODDES" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      chkavSdtduplicaccionserie__selected.setTitleFormat( (short)(0) );
      chkavSdtduplicaccionserie__selected.setTitle( "" );
      edtavSdtduplicaccionserie__artdscdes_Jsonclick = "" ;
      edtavSdtduplicaccionserie__artdscdes_Enabled = 0 ;
      edtavSdtduplicaccionserie__artcodori_Jsonclick = "" ;
      edtavSdtduplicaccionserie__artcodori_Enabled = 0 ;
      chkavSdtduplicaccionserie__selected.setCaption( "" );
      chkavSdtduplicaccionserie__selected.setVisible( -1 );
      chkavSdtduplicaccionserie__selected.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      chkavSdtduplicaccionserie__selected.setTitle( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavSdtduplicaccionserie__artdscdes_Enabled = -1 ;
      edtavSdtduplicaccionserie__artcodori_Enabled = -1 ;
      edtavClicoddes_Jsonclick = "" ;
      edtavClicoddes_Tooltiptext = "" ;
      edtavClicoddes_Visible = 1 ;
      edtavClicodori_Jsonclick = "" ;
      edtavClicodori_Tooltiptext = "" ;
      edtavClicodori_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      bttBtnbtnconfirmar_Visible = 1 ;
      cmbavOp_p.setJsonclick( "" );
      cmbavOp_p.setEnabled( 0 );
      edtavLit8_Jsonclick = "" ;
      edtavLit8_Enabled = 1 ;
      cmbavOp_e.setJsonclick( "" );
      cmbavOp_e.setEnabled( 0 );
      edtavLit7_Jsonclick = "" ;
      edtavLit7_Enabled = 1 ;
      Combo_clicoddes_Caption = "" ;
      Combo_clicodori_Caption = "" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "Artigos existentes!" ;
      Dvelop_confirmpanel_btnconfirmar_Title = httpContext.getMessage( "Deseja modificar? ", "") ;
      Ddo_grid_Datalistproc = "FicherosBasicos.wdupserConfirmGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "T" ;
      Ddo_grid_Filtertype = "Character|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Columnssortvalues = "|" ;
      Ddo_grid_Columnids = "1:SDTDuplicaccionSerie__ArtCodOri|2:SDTDuplicaccionSerie__ArtDscDes" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Duplicacion Series", "") ;
      Dvpanel_panel_filtros_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_filtros_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Width = "100%" ;
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
      Combo_clicoddes_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicoddes_Enabled = GXutil.toBoolean( -1) ;
      Combo_clicoddes_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodori_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_clicodori_Enabled = GXutil.toBoolean( -1) ;
      Combo_clicodori_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Duplicidade Series", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavOp_e.setName( "vOP_E" );
      cmbavOp_e.setWebtags( "" );
      cmbavOp_e.addItem("S", httpContext.getMessage( "SI", ""), (short)(0));
      cmbavOp_e.addItem("N", httpContext.getMessage( "NO", ""), (short)(0));
      if ( cmbavOp_e.getItemCount() > 0 )
      {
         AV15Op_e = cmbavOp_e.getValidValue(AV15Op_e) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Op_e", AV15Op_e);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOP_E", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV15Op_e, ""))));
      }
      cmbavOp_p.setName( "vOP_P" );
      cmbavOp_p.setWebtags( "" );
      cmbavOp_p.addItem("S", httpContext.getMessage( "SI", ""), (short)(0));
      cmbavOp_p.addItem("N", httpContext.getMessage( "NO", ""), (short)(0));
      if ( cmbavOp_p.getItemCount() > 0 )
      {
         AV27Op_p = cmbavOp_p.getValidValue(AV27Op_p) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27Op_p", AV27Op_p);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vOP_P", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27Op_p, ""))));
      }
      GXCCtl = "SDTDUPLICACCIONSERIE__SELECTED_" + sGXsfl_83_idx ;
      chkavSdtduplicaccionserie__selected.setName( GXCCtl );
      chkavSdtduplicaccionserie__selected.setWebtags( "" );
      chkavSdtduplicaccionserie__selected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtduplicaccionserie__selected.getInternalname(), "TitleCaption", chkavSdtduplicaccionserie__selected.getCaption(), !bGXsfl_83_Refreshing);
      chkavSdtduplicaccionserie__selected.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV57TFSDTDuplicaccionSerie__ArtCodOri',fld:'vTFSDTDUPLICACCIONSERIE__ARTCODORI',pic:''},{av:'AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel',fld:'vTFSDTDUPLICACCIONSERIE__ARTCODORI_SEL',pic:''},{av:'AV59TFSDTDuplicaccionSerie__ArtDscDes',fld:'vTFSDTDUPLICACCIONSERIE__ARTDSCDES',pic:''},{av:'AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel',fld:'vTFSDTDUPLICACCIONSERIE__ARTDSCDES_SEL',pic:''},{av:'AV14EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCodOri',fld:'vCLICODORI',pic:'ZZZZZ9'},{av:'AV6CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'cmbavOp_e'},{av:'AV15Op_e',fld:'vOP_E',pic:'',hsh:true},{av:'cmbavOp_p'},{av:'AV27Op_p',fld:'vOP_P',pic:'',hsh:true},{av:'AV35SDTDuplicaccionSerie',fld:'vSDTDUPLICACCIONSERIE',grid:83,pic:'',hsh:true},{av:'nGXsfl_83_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:83},{av:'nRC_GXsfl_83',ctrl:'GRID',prop:'GridRC',grid:83},{av:'AV55Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV48Ok_Upd',fld:'vOK_UPD',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{ctrl:'SDTDUPLICACCIONSERIE__SELECTED',prop:'Title'},{av:'AV38GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV39GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV35SDTDuplicaccionSerie',fld:'vSDTDUPLICACCIONSERIE',grid:83,pic:'',hsh:true},{av:'nGXsfl_83_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:83},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_83',ctrl:'GRID',prop:'GridRC',grid:83}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e122352',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV57TFSDTDuplicaccionSerie__ArtCodOri',fld:'vTFSDTDUPLICACCIONSERIE__ARTCODORI',pic:''},{av:'AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel',fld:'vTFSDTDUPLICACCIONSERIE__ARTCODORI_SEL',pic:''},{av:'AV59TFSDTDuplicaccionSerie__ArtDscDes',fld:'vTFSDTDUPLICACCIONSERIE__ARTDSCDES',pic:''},{av:'AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel',fld:'vTFSDTDUPLICACCIONSERIE__ARTDSCDES_SEL',pic:''},{av:'AV14EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCodOri',fld:'vCLICODORI',pic:'ZZZZZ9'},{av:'AV6CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'cmbavOp_e'},{av:'AV15Op_e',fld:'vOP_E',pic:'',hsh:true},{av:'cmbavOp_p'},{av:'AV27Op_p',fld:'vOP_P',pic:'',hsh:true},{av:'AV35SDTDuplicaccionSerie',fld:'vSDTDUPLICACCIONSERIE',grid:83,pic:'',hsh:true},{av:'nGXsfl_83_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:83},{av:'nRC_GXsfl_83',ctrl:'GRID',prop:'GridRC',grid:83},{av:'AV55Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV48Ok_Upd',fld:'vOK_UPD',pic:'9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e132352',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV57TFSDTDuplicaccionSerie__ArtCodOri',fld:'vTFSDTDUPLICACCIONSERIE__ARTCODORI',pic:''},{av:'AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel',fld:'vTFSDTDUPLICACCIONSERIE__ARTCODORI_SEL',pic:''},{av:'AV59TFSDTDuplicaccionSerie__ArtDscDes',fld:'vTFSDTDUPLICACCIONSERIE__ARTDSCDES',pic:''},{av:'AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel',fld:'vTFSDTDUPLICACCIONSERIE__ARTDSCDES_SEL',pic:''},{av:'AV14EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCodOri',fld:'vCLICODORI',pic:'ZZZZZ9'},{av:'AV6CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'cmbavOp_e'},{av:'AV15Op_e',fld:'vOP_E',pic:'',hsh:true},{av:'cmbavOp_p'},{av:'AV27Op_p',fld:'vOP_P',pic:'',hsh:true},{av:'AV35SDTDuplicaccionSerie',fld:'vSDTDUPLICACCIONSERIE',grid:83,pic:'',hsh:true},{av:'nGXsfl_83_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:83},{av:'nRC_GXsfl_83',ctrl:'GRID',prop:'GridRC',grid:83},{av:'AV55Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV48Ok_Upd',fld:'vOK_UPD',pic:'9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e142352',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV67Pgmname',fld:'vPGMNAME',pic:''},{av:'AV57TFSDTDuplicaccionSerie__ArtCodOri',fld:'vTFSDTDUPLICACCIONSERIE__ARTCODORI',pic:''},{av:'AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel',fld:'vTFSDTDUPLICACCIONSERIE__ARTCODORI_SEL',pic:''},{av:'AV59TFSDTDuplicaccionSerie__ArtDscDes',fld:'vTFSDTDUPLICACCIONSERIE__ARTDSCDES',pic:''},{av:'AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel',fld:'vTFSDTDUPLICACCIONSERIE__ARTDSCDES_SEL',pic:''},{av:'AV14EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCodOri',fld:'vCLICODORI',pic:'ZZZZZ9'},{av:'AV6CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'cmbavOp_e'},{av:'AV15Op_e',fld:'vOP_E',pic:'',hsh:true},{av:'cmbavOp_p'},{av:'AV27Op_p',fld:'vOP_P',pic:'',hsh:true},{av:'AV35SDTDuplicaccionSerie',fld:'vSDTDUPLICACCIONSERIE',grid:83,pic:'',hsh:true},{av:'nGXsfl_83_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:83},{av:'nRC_GXsfl_83',ctrl:'GRID',prop:'GridRC',grid:83},{av:'AV55Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV48Ok_Upd',fld:'vOK_UPD',pic:'9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV57TFSDTDuplicaccionSerie__ArtCodOri',fld:'vTFSDTDUPLICACCIONSERIE__ARTCODORI',pic:''},{av:'AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel',fld:'vTFSDTDUPLICACCIONSERIE__ARTCODORI_SEL',pic:''},{av:'AV59TFSDTDuplicaccionSerie__ArtDscDes',fld:'vTFSDTDUPLICACCIONSERIE__ARTDSCDES',pic:''},{av:'AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel',fld:'vTFSDTDUPLICACCIONSERIE__ARTDSCDES_SEL',pic:''}]}");
      setEventMetadata("GRID.LOAD","{handler:'e182352',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOBTNCONFIRMAR'","{handler:'e112351',iparms:[]");
      setEventMetadata("'DOBTNCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e152352',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV40SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV35SDTDuplicaccionSerie',fld:'vSDTDUPLICACCIONSERIE',grid:83,pic:'',hsh:true},{av:'nGXsfl_83_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:83},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_83',ctrl:'GRID',prop:'GridRC',grid:83},{av:'AV55Moda21',fld:'vMODA21',pic:'9',hsh:true},{av:'AV14EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5CliCodOri',fld:'vCLICODORI',pic:'ZZZZZ9'},{av:'AV6CliCodDes',fld:'vCLICODDES',pic:'ZZZZZ9'},{av:'AV48Ok_Upd',fld:'vOK_UPD',pic:'9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV14EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV40SelectedRows',fld:'vSELECTEDROWS',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv4',iparms:[]");
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
      wcpOAV14EmprCod = "" ;
      wcpOAV15Op_e = "" ;
      wcpOAV27Op_p = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      Combo_clicoddes_Selectedvalue_get = "" ;
      Combo_clicodori_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV14EmprCod = "" ;
      AV15Op_e = "" ;
      AV27Op_p = "" ;
      AV67Pgmname = "" ;
      AV57TFSDTDuplicaccionSerie__ArtCodOri = "" ;
      AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel = "" ;
      AV59TFSDTDuplicaccionSerie__ArtDscDes = "" ;
      AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel = "" ;
      AV35SDTDuplicaccionSerie = new GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie>(app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie.class, "Serie", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV10DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV9CliCodOri_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV12CliCodDes_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV40SelectedRows = new GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie>(app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie.class, "Serie", "TexplusNET", remoteHandle);
      Combo_clicodori_Selectedvalue_set = "" ;
      Combo_clicoddes_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodori_Jsonclick = "" ;
      ucCombo_clicodori = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicoddes_Jsonclick = "" ;
      ucCombo_clicoddes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7Lit7 = "" ;
      AV8Lit8 = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnbtnconfirmar_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
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
      hsh = "" ;
      AV53Lit0 = "" ;
      AV52Lit2 = "" ;
      AV21Lit3 = "" ;
      AV22Lit4 = "" ;
      AV23Lit5 = "" ;
      AV24Lit6 = "" ;
      AV54Litfe = "" ;
      AV18Station = "" ;
      AV19EmprNom = "" ;
      AV20UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV29WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV51ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      GXt_objcol_SdtSDTDuplicaccionSerie_Serie9 = new GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie>(app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie.class, "Serie", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTDuplicaccionSerie_Serie10 = new GXBaseCollection[1] ;
      AV49SelectedRows_row = new app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie(remoteHandle, context);
      AV50vVar = "" ;
      GXv_int3 = new byte[1] ;
      GXv_char2 = new String[1] ;
      AV42SDTDuplicaccionSerieItem = new app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie(remoteHandle, context);
      AV41SelectedRow = new app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie(remoteHandle, context);
      AV36Session = httpContext.getWebSession();
      AV33GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV34GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char12 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_SdtWWPGridState13 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV67Pgmname = "FicherosBasicos.wdupserConfirm" ;
      /* GeneXus formulas. */
      AV67Pgmname = "FicherosBasicos.wdupserConfirm" ;
      Gx_err = (short)(0) ;
      edtavLit7_Enabled = 0 ;
      edtavLit8_Enabled = 0 ;
      edtavSdtduplicaccionserie__artcodori_Enabled = 0 ;
      edtavSdtduplicaccionserie__artdscdes_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV55Moda21 ;
   private byte AV48Ok_Upd ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int11 ;
   private byte GXv_int3[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV45TotalSelected ;
   private short AV44TotalGrid ;
   private short AV46FlagArt ;
   private short AV43Cont ;
   private int wcpOAV5CliCodOri ;
   private int wcpOAV6CliCodDes ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_83 ;
   private int AV5CliCodOri ;
   private int AV6CliCodDes ;
   private int nGXsfl_83_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavLit7_Enabled ;
   private int edtavLit8_Enabled ;
   private int bttBtnbtnconfirmar_Visible ;
   private int AV63GXV1 ;
   private int edtavPgmname_Enabled ;
   private int edtavClicodori_Visible ;
   private int edtavClicoddes_Visible ;
   private int subGrid_Islastpage ;
   private int edtavSdtduplicaccionserie__artcodori_Enabled ;
   private int edtavSdtduplicaccionserie__artdscdes_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_83_fel_idx=1 ;
   private int AV37PageToGo ;
   private int AV68GXV5 ;
   private int AV69GXV6 ;
   private int AV70GXV7 ;
   private int AV71GXV8 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV38GridCurrentPage ;
   private long AV39GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV14EmprCod ;
   private String wcpOAV15Op_e ;
   private String wcpOAV27Op_p ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String Combo_clicoddes_Selectedvalue_get ;
   private String Combo_clicodori_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV14EmprCod ;
   private String AV15Op_e ;
   private String AV27Op_p ;
   private String sGXsfl_83_idx="0001" ;
   private String AV67Pgmname ;
   private String AV57TFSDTDuplicaccionSerie__ArtCodOri ;
   private String AV58TFSDTDuplicaccionSerie__ArtCodOri_Sel ;
   private String AV59TFSDTDuplicaccionSerie__ArtDscDes ;
   private String AV60TFSDTDuplicaccionSerie__ArtDscDes_Sel ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Combo_clicodori_Cls ;
   private String Combo_clicodori_Selectedvalue_set ;
   private String Combo_clicoddes_Cls ;
   private String Combo_clicoddes_Selectedvalue_set ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
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
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
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
   private String divTablesplittedclicodori_Internalname ;
   private String lblTextblockcombo_clicodori_Internalname ;
   private String lblTextblockcombo_clicodori_Jsonclick ;
   private String Combo_clicodori_Caption ;
   private String Combo_clicodori_Internalname ;
   private String divTablesplittedclicoddes_Internalname ;
   private String lblTextblockcombo_clicoddes_Internalname ;
   private String lblTextblockcombo_clicoddes_Jsonclick ;
   private String Combo_clicoddes_Caption ;
   private String Combo_clicoddes_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavLit7_Internalname ;
   private String TempTags ;
   private String AV7Lit7 ;
   private String edtavLit7_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavLit8_Internalname ;
   private String AV8Lit8 ;
   private String edtavLit8_Jsonclick ;
   private String divTable_acciones_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnbtnconfirmar_Internalname ;
   private String bttBtnbtnconfirmar_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String divTablebarprogress_Internalname ;
   private String Progressbar_Internalname ;
   private String divTablegrid_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodori_Internalname ;
   private String edtavClicodori_Tooltiptext ;
   private String edtavClicodori_Jsonclick ;
   private String edtavClicoddes_Internalname ;
   private String edtavClicoddes_Tooltiptext ;
   private String edtavClicoddes_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdtduplicaccionserie__artcodori_Internalname ;
   private String edtavSdtduplicaccionserie__artdscdes_Internalname ;
   private String sGXsfl_83_fel_idx="0001" ;
   private String hsh ;
   private String AV18Station ;
   private String AV19EmprNom ;
   private String AV20UsurCod ;
   private String GXv_char2[] ;
   private String GXt_char12 ;
   private String GXv_char5[] ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavSdtduplicaccionserie__artcodori_Jsonclick ;
   private String edtavSdtduplicaccionserie__artdscdes_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Combo_clicodori_Enabled ;
   private boolean Combo_clicodori_Emptyitem ;
   private boolean Combo_clicoddes_Enabled ;
   private boolean Combo_clicoddes_Emptyitem ;
   private boolean Dvpanel_panel_filtrosgenerales_Autowidth ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoheight ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsible ;
   private boolean Dvpanel_panel_filtrosgenerales_Collapsed ;
   private boolean Dvpanel_panel_filtrosgenerales_Showcollapseicon ;
   private boolean Dvpanel_panel_filtrosgenerales_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panel_filtros_Autowidth ;
   private boolean Dvpanel_panel_filtros_Autoheight ;
   private boolean Dvpanel_panel_filtros_Collapsible ;
   private boolean Dvpanel_panel_filtros_Collapsed ;
   private boolean Dvpanel_panel_filtros_Showcollapseicon ;
   private boolean Dvpanel_panel_filtros_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_83_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV83 ;
   private String AV53Lit0 ;
   private String AV52Lit2 ;
   private String AV21Lit3 ;
   private String AV22Lit4 ;
   private String AV23Lit5 ;
   private String AV24Lit6 ;
   private String AV54Litfe ;
   private String AV50vVar ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV36Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodori ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicoddes ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavOp_e ;
   private HTMLChoice cmbavOp_p ;
   private ICheckbox chkavSdtduplicaccionserie__selected ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV9CliCodOri_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV12CliCodDes_Data ;
   private GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie> AV35SDTDuplicaccionSerie ;
   private GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie> AV40SelectedRows ;
   private GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie> GXt_objcol_SdtSDTDuplicaccionSerie_Serie9 ;
   private GXBaseCollection<app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie> GXv_objcol_SdtSDTDuplicaccionSerie_Serie10[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV10DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.wwpbaseobjects.SdtWWPContext AV29WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV33GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState13[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV34GridStateFilterValue ;
   private app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie AV49SelectedRows_row ;
   private app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie AV42SDTDuplicaccionSerieItem ;
   private app.ficherosbasicos.SdtSDTDuplicaccionSerie_Serie AV41SelectedRow ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV51ProgressIndicator ;
}

