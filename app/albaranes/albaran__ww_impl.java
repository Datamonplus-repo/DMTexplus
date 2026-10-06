package app.albaranes ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class albaran__ww_impl extends GXDataArea
{
   public albaran__ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public albaran__ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( albaran__ww_impl.class ));
   }

   public albaran__ww_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
      cmbAlbProEst = new HTMLChoice();
      cmbAlbMarca = new HTMLChoice();
      cmbAlbEnvFtp = new HTMLChoice();
      cmbAlbProAT = new HTMLChoice();
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
      nRC_GXsfl_61 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_61"))) ;
      nGXsfl_61_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_61_idx"))) ;
      sGXsfl_61_idx = httpContext.GetPar( "sGXsfl_61_idx") ;
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
      AV48AlbProfch = localUtil.parseDateParm( httpContext.GetPar( "AlbProfch")) ;
      AV66AlbProfch_To = localUtil.parseDateParm( httpContext.GetPar( "AlbProfch_To")) ;
      AV41EmprCod = httpContext.GetPar( "EmprCod") ;
      AV65ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV61ColumnsSelector);
      AV84Okc = httpContext.GetPar( "Okc") ;
      AV47GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
      AV46AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      AV51Ok = httpContext.GetPar( "Ok") ;
      AV58FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV15TFAlbProCod = GXutil.lval( httpContext.GetPar( "TFAlbProCod")) ;
      AV16TFAlbProCod_To = GXutil.lval( httpContext.GetPar( "TFAlbProCod_To")) ;
      AV17TFAlbProPri = httpContext.GetPar( "TFAlbProPri") ;
      AV18TFAlbProPri_Sel = httpContext.GetPar( "TFAlbProPri_Sel") ;
      AV19TFAlbProfch = localUtil.parseDateParm( httpContext.GetPar( "TFAlbProfch")) ;
      AV23TFGuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "TFGuiRemCli"))) ;
      AV24TFGuiRemCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFGuiRemCli_To"))) ;
      AV25TFGuiRemCln = httpContext.GetPar( "TFGuiRemCln") ;
      AV26TFGuiRemCln_Sel = httpContext.GetPar( "TFGuiRemCln_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV28TFAlbProEst_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV79TFAlbMarca_Sels);
      AV31TFAlbLic = httpContext.GetPar( "TFAlbLic") ;
      AV32TFAlbLic_Sel = httpContext.GetPar( "TFAlbLic_Sel") ;
      AV33TFAlbPdATCUD = httpContext.GetPar( "TFAlbPdATCUD") ;
      AV34TFAlbPdATCUD_Sel = httpContext.GetPar( "TFAlbPdATCUD_Sel") ;
      AV82Pgmname = httpContext.GetPar( "Pgmname") ;
      AV67OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV12OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV74CCC = (short)(GXutil.lval( httpContext.GetPar( "CCC"))) ;
      AV70Carvitin = (short)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
      AV75PwdGrl = (short)(GXutil.lval( httpContext.GetPar( "PwdGrl"))) ;
      AV49ContVal = (int)(GXutil.lval( httpContext.GetPar( "ContVal"))) ;
      AV43UsurCod = httpContext.GetPar( "UsurCod") ;
      AV54ImpCod = httpContext.GetPar( "ImpCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV48AlbProfch, AV66AlbProfch_To, AV41EmprCod, AV65ManageFiltersExecutionStep, AV61ColumnsSelector, AV84Okc, AV47GuiRemCli, AV46AlbProCod, AV51Ok, AV58FilterFullText, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFAlbProPri, AV18TFAlbProPri_Sel, AV19TFAlbProfch, AV23TFGuiRemCli, AV24TFGuiRemCli_To, AV25TFGuiRemCln, AV26TFGuiRemCln_Sel, AV28TFAlbProEst_Sels, AV79TFAlbMarca_Sels, AV31TFAlbLic, AV32TFAlbLic_Sel, AV33TFAlbPdATCUD, AV34TFAlbPdATCUD_Sel, AV82Pgmname, AV67OrderedBy, AV12OrderedDsc, AV74CCC, AV70Carvitin, AV75PwdGrl, AV49ContVal, AV43UsurCod, AV54ImpCod) ;
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
      pa1XE2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1XE2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.albaranes.albaran__ww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47GuiRemCli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74CCC), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPWDGRL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54ImpCod, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Albaran__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV82Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("albaranes\\albaran__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROFCH", localUtil.format(AV48AlbProfch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROFCH_TO", localUtil.format(AV66AlbProfch_To, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_61", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_61, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vMANAGEFILTERSDATA", AV63ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vMANAGEFILTERSDATA", AV63ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV37GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV38GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV35DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV35DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV61ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV61ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV65ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOKC", GXutil.rtrim( AV84Okc));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV41EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV47GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47GuiRemCli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV46AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vOK", GXutil.rtrim( AV51Ok));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV15TFAlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD_TO", GXutil.ltrim( localUtil.ntoc( AV16TFAlbProCod_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRI", GXutil.rtrim( AV17TFAlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROPRI_SEL", GXutil.rtrim( AV18TFAlbProPri_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROFCH", localUtil.dtoc( AV19TFAlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV23TFGuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV24TFGuiRemCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLN", GXutil.rtrim( AV25TFGuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLN_SEL", GXutil.rtrim( AV26TFGuiRemCln_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROEST_SELS", AV28TFAlbProEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROEST_SELS", AV28TFAlbProEst_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBMARCA_SELS", AV79TFAlbMarca_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBMARCA_SELS", AV79TFAlbMarca_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBLIC", GXutil.rtrim( AV31TFAlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBLIC_SEL", GXutil.rtrim( AV32TFAlbLic_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPDATCUD", GXutil.rtrim( AV33TFAlbPdATCUD));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPDATCUD_SEL", GXutil.rtrim( AV34TFAlbPdATCUD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV67OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV12OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vCCC", GXutil.ltrim( localUtil.ntoc( AV74CCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74CCC), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV70Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Carvitin), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROEST_SELSJSON", AV27TFAlbProEst_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBMARCA_SELSJSON", AV78TFAlbMarca_SelsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV75PwdGrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPWDGRL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV49ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV43UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV54ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Allowmultipleselection", GXutil.rtrim( Ddo_grid_Allowmultipleselection));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
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
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         WebComp_Grid_dwc.componentjscripts();
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
         we1XE2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1XE2( ) ;
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
      return formatLink("app.albaranes.albaran__ww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Albaranes.Albaran__WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Albaranes", "") ;
   }

   public void wb1XE0( )
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\Albaran__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Albaranes\\Albaran__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_24_1XE2( true) ;
      }
      else
      {
         wb_table1_24_1XE2( false) ;
      }
      return  ;
   }

   public void wb_table1_24_1XE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedfiltertextalbprofch_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblFiltertextalbprofch_Internalname, httpContext.getMessage( "Fecha", ""), "", "", lblFiltertextalbprofch_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Albaranes\\Albaran__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         wb_table2_43_1XE2( true) ;
      }
      else
      {
         wb_table2_43_1XE2( false) ;
      }
      return  ;
   }

   public void wb_table2_43_1XE2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         startgridcontrol61( ) ;
      }
      if ( wbEnd == 61 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_61 = (int)(nGXsfl_61_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV37GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV38GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_grid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_grid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0086"+"", GXutil.rtrim( WebComp_Grid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0086"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_61_Refreshing )
            {
               if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0086"+"");
                  }
                  WebComp_Grid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldGrid_dwc), GXutil.lower( WebComp_Grid_dwc_Component)) != 0 )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV82Pgmname), GXutil.rtrim( localUtil.format( AV82Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Albaranes\\Albaran__WW.htm");
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
         ucDdo_grid.setProperty("AllowMultipleSelection", Ddo_grid_Allowmultipleselection);
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV35DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV35DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV61ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albprofchauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albprofchauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albprofchauxdate_Internalname, localUtil.format(AV21DDO_AlbProfchAuxDate, "99/99/99"), localUtil.format( AV21DDO_AlbProfchAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albprofchauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albprofchauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Albaranes\\Albaran__WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 61 )
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

   public void start1XE2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Albaranes", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1XE0( ) ;
   }

   public void ws1XE2( )
   {
      start1XE2( ) ;
      evt1XE2( ) ;
   }

   public void evt1XE2( )
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
                           e111XE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121XE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e131XE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141XE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e151XE2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e161XE2 ();
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
                           nGXsfl_61_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_612( ) ;
                           AV68DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV68DetailWebComponent);
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV39GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridActions), 4, 0));
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
                           A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
                           A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
                           cmbAlbProEst.setName( cmbAlbProEst.getInternalname() );
                           cmbAlbProEst.setValue( httpContext.cgiGet( cmbAlbProEst.getInternalname()) );
                           A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
                           cmbAlbMarca.setName( cmbAlbMarca.getInternalname() );
                           cmbAlbMarca.setValue( httpContext.cgiGet( cmbAlbMarca.getInternalname()) );
                           A5140AlbMarca = httpContext.cgiGet( cmbAlbMarca.getInternalname()) ;
                           A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
                           A14069AlbPdATCUD = httpContext.cgiGet( edtAlbPdATCUD_Internalname) ;
                           cmbAlbEnvFtp.setName( cmbAlbEnvFtp.getInternalname() );
                           cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
                           A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
                           cmbAlbProAT.setName( cmbAlbProAT.getInternalname() );
                           cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
                           A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
                           A4023AlbFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbFecSal_Internalname), 0)) ;
                           A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
                           A3633CliEmail = httpContext.cgiGet( edtCliEmail_Internalname) ;
                           n3633CliEmail = false ;
                           A2242AlbSec = GXutil.upper( httpContext.cgiGet( edtAlbSec_Internalname)) ;
                           AV13Test = httpContext.cgiGet( edtavTest_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavTest_Internalname, AV13Test);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e171XE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e181XE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e191XE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e201XE2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Albprofch Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPROFCH"), 0), AV48AlbProfch) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprofch_to Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPROFCH_TO"), 0), AV66AlbProfch_To) ) )
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
                     if ( nCmpId == 86 )
                     {
                        OldGrid_dwc = httpContext.cgiGet( "W0086") ;
                        if ( ( GXutil.len( OldGrid_dwc) == 0 ) || ( GXutil.strcmp(OldGrid_dwc, WebComp_Grid_dwc_Component) != 0 ) )
                        {
                           WebComp_Grid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldGrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Grid_dwc_Component = OldGrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
                        {
                           WebComp_Grid_dwc.componentprocess("W0086", "", sEvt);
                        }
                        WebComp_Grid_dwc_Component = OldGrid_dwc ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1XE2( )
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

   public void pa1XE2( )
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
      subsflControlProps_612( ) ;
      while ( nGXsfl_61_idx <= nRC_GXsfl_61 )
      {
         sendrow_612( ) ;
         nGXsfl_61_idx = ((subGrid_Islastpage==1)&&(nGXsfl_61_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_61_idx+1) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.util.Date AV48AlbProfch ,
                                 java.util.Date AV66AlbProfch_To ,
                                 String AV41EmprCod ,
                                 byte AV65ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV61ColumnsSelector ,
                                 String AV84Okc ,
                                 int AV47GuiRemCli ,
                                 long AV46AlbProCod ,
                                 String AV51Ok ,
                                 String AV58FilterFullText ,
                                 long AV15TFAlbProCod ,
                                 long AV16TFAlbProCod_To ,
                                 String AV17TFAlbProPri ,
                                 String AV18TFAlbProPri_Sel ,
                                 java.util.Date AV19TFAlbProfch ,
                                 int AV23TFGuiRemCli ,
                                 int AV24TFGuiRemCli_To ,
                                 String AV25TFGuiRemCln ,
                                 String AV26TFGuiRemCln_Sel ,
                                 GXSimpleCollection<Byte> AV28TFAlbProEst_Sels ,
                                 GXSimpleCollection<String> AV79TFAlbMarca_Sels ,
                                 String AV31TFAlbLic ,
                                 String AV32TFAlbLic_Sel ,
                                 String AV33TFAlbPdATCUD ,
                                 String AV34TFAlbPdATCUD_Sel ,
                                 String AV82Pgmname ,
                                 short AV67OrderedBy ,
                                 boolean AV12OrderedDsc ,
                                 short AV74CCC ,
                                 short AV70Carvitin ,
                                 short AV75PwdGrl ,
                                 int AV49ContVal ,
                                 String AV43UsurCod ,
                                 String AV54ImpCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e181XE2 ();
      GRID_nCurrentRecord = 0 ;
      rf1XE2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"Albaran__WW");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV82Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("albaranes\\albaran__ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROFCH", getSecureSignedToken( "", A34AlbProfch));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROFCH", localUtil.format(A34AlbProfch, "99/99/99"));
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
      rf1XE2( ) ;
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
      AV82Pgmname = "Albaranes.Albaran__WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82Pgmname", AV82Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavTest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTest_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV85Albaranes_albaran__wwds_1_filterfulltext = AV58FilterFullText ;
      AV86Albaranes_albaran__wwds_2_albprofch = AV48AlbProfch ;
      AV87Albaranes_albaran__wwds_3_albprofch_to = AV66AlbProfch_To ;
      AV88Albaranes_albaran__wwds_4_tfalbprocod = AV15TFAlbProCod ;
      AV89Albaranes_albaran__wwds_5_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV90Albaranes_albaran__wwds_6_tfalbpropri = AV17TFAlbProPri ;
      AV91Albaranes_albaran__wwds_7_tfalbpropri_sel = AV18TFAlbProPri_Sel ;
      AV92Albaranes_albaran__wwds_8_tfalbprofch = AV19TFAlbProfch ;
      AV93Albaranes_albaran__wwds_9_tfguiremcli = AV23TFGuiRemCli ;
      AV94Albaranes_albaran__wwds_10_tfguiremcli_to = AV24TFGuiRemCli_To ;
      AV95Albaranes_albaran__wwds_11_tfguiremcln = AV25TFGuiRemCln ;
      AV96Albaranes_albaran__wwds_12_tfguiremcln_sel = AV26TFGuiRemCln_Sel ;
      AV97Albaranes_albaran__wwds_13_tfalbproest_sels = AV28TFAlbProEst_Sels ;
      AV98Albaranes_albaran__wwds_14_tfalbmarca_sels = AV79TFAlbMarca_Sels ;
      AV99Albaranes_albaran__wwds_15_tfalblic = AV31TFAlbLic ;
      AV100Albaranes_albaran__wwds_16_tfalblic_sel = AV32TFAlbLic_Sel ;
      AV101Albaranes_albaran__wwds_17_tfalbpdatcud = AV33TFAlbPdATCUD ;
      AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel = AV34TFAlbPdATCUD_Sel ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV97Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                           A5140AlbMarca ,
                                           AV98Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                           AV86Albaranes_albaran__wwds_2_albprofch ,
                                           AV87Albaranes_albaran__wwds_3_albprofch_to ,
                                           Long.valueOf(AV88Albaranes_albaran__wwds_4_tfalbprocod) ,
                                           Long.valueOf(AV89Albaranes_albaran__wwds_5_tfalbprocod_to) ,
                                           AV91Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                           AV90Albaranes_albaran__wwds_6_tfalbpropri ,
                                           AV92Albaranes_albaran__wwds_8_tfalbprofch ,
                                           Integer.valueOf(AV93Albaranes_albaran__wwds_9_tfguiremcli) ,
                                           Integer.valueOf(AV94Albaranes_albaran__wwds_10_tfguiremcli_to) ,
                                           AV96Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                           AV95Albaranes_albaran__wwds_11_tfguiremcln ,
                                           Integer.valueOf(AV97Albaranes_albaran__wwds_13_tfalbproest_sels.size()) ,
                                           Integer.valueOf(AV98Albaranes_albaran__wwds_14_tfalbmarca_sels.size()) ,
                                           AV100Albaranes_albaran__wwds_16_tfalblic_sel ,
                                           AV99Albaranes_albaran__wwds_15_tfalblic ,
                                           AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                           AV101Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                           Boolean.valueOf(AV52isAnulado) ,
                                           A34AlbProfch ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A39AlbProPri ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A7101AlbLic ,
                                           A14069AlbPdATCUD ,
                                           Short.valueOf(AV67OrderedBy) ,
                                           Boolean.valueOf(AV12OrderedDsc) ,
                                           AV85Albaranes_albaran__wwds_1_filterfulltext ,
                                           AV41EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                           TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV90Albaranes_albaran__wwds_6_tfalbpropri = GXutil.padr( GXutil.rtrim( AV90Albaranes_albaran__wwds_6_tfalbpropri), 1, "%") ;
      lV95Albaranes_albaran__wwds_11_tfguiremcln = GXutil.padr( GXutil.rtrim( AV95Albaranes_albaran__wwds_11_tfguiremcln), 30, "%") ;
      lV99Albaranes_albaran__wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV99Albaranes_albaran__wwds_15_tfalblic), 20, "%") ;
      lV101Albaranes_albaran__wwds_17_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV101Albaranes_albaran__wwds_17_tfalbpdatcud), 20, "%") ;
      /* Using cursor H01XE2 */
      pr_default.execute(0, new Object[] {AV41EmprCod, AV86Albaranes_albaran__wwds_2_albprofch, AV87Albaranes_albaran__wwds_3_albprofch_to, Long.valueOf(AV88Albaranes_albaran__wwds_4_tfalbprocod), Long.valueOf(AV89Albaranes_albaran__wwds_5_tfalbprocod_to), lV90Albaranes_albaran__wwds_6_tfalbpropri, AV91Albaranes_albaran__wwds_7_tfalbpropri_sel, AV92Albaranes_albaran__wwds_8_tfalbprofch, Integer.valueOf(AV93Albaranes_albaran__wwds_9_tfguiremcli), Integer.valueOf(AV94Albaranes_albaran__wwds_10_tfguiremcli_to), lV95Albaranes_albaran__wwds_11_tfguiremcln, AV96Albaranes_albaran__wwds_12_tfguiremcln_sel, lV99Albaranes_albaran__wwds_15_tfalblic, AV100Albaranes_albaran__wwds_16_tfalblic_sel, lV101Albaranes_albaran__wwds_17_tfalbpdatcud, AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A1253EmprGuiRem = H01XE2_A1253EmprGuiRem[0] ;
         A5141AlbIvaCod = H01XE2_A5141AlbIvaCod[0] ;
         A2242AlbSec = H01XE2_A2242AlbSec[0] ;
         A3633CliEmail = H01XE2_A3633CliEmail[0] ;
         n3633CliEmail = H01XE2_n3633CliEmail[0] ;
         A3865AlbHorSal = H01XE2_A3865AlbHorSal[0] ;
         A4023AlbFecSal = H01XE2_A4023AlbFecSal[0] ;
         A10765AlbProAT = H01XE2_A10765AlbProAT[0] ;
         A5805AlbEnvFtp = H01XE2_A5805AlbEnvFtp[0] ;
         A14069AlbPdATCUD = H01XE2_A14069AlbPdATCUD[0] ;
         A7101AlbLic = H01XE2_A7101AlbLic[0] ;
         A5140AlbMarca = H01XE2_A5140AlbMarca[0] ;
         A33AlbProEst = H01XE2_A33AlbProEst[0] ;
         A1244GuiRemCln = H01XE2_A1244GuiRemCln[0] ;
         A1243GuiRemCli = H01XE2_A1243GuiRemCli[0] ;
         A34AlbProfch = H01XE2_A34AlbProfch[0] ;
         A39AlbProPri = H01XE2_A39AlbProPri[0] ;
         A30AlbProCod = H01XE2_A30AlbProCod[0] ;
         A396EmprCod = H01XE2_A396EmprCod[0] ;
         A3633CliEmail = H01XE2_A3633CliEmail[0] ;
         n3633CliEmail = H01XE2_n3633CliEmail[0] ;
         A1244GuiRemCln = H01XE2_A1244GuiRemCln[0] ;
         if ( (GXutil.strcmp("", AV85Albaranes_albaran__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV85Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV85Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV85Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "activo", "") , GXutil.padr( "%" + GXutil.lower( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "anulado", "") , GXutil.padr( "%" + GXutil.lower( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14069AlbPdATCUD) , GXutil.padr( "%" + GXutil.upper( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1XE2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(61) ;
      /* Execute user event: Refresh */
      e181XE2 ();
      nGXsfl_61_idx = 1 ;
      sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_612( ) ;
      bGXsfl_61_Refreshing = true ;
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
            if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
            {
               WebComp_Grid_dwc.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_612( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              Byte.valueOf(A33AlbProEst) ,
                                              AV97Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                              A5140AlbMarca ,
                                              AV98Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                              AV86Albaranes_albaran__wwds_2_albprofch ,
                                              AV87Albaranes_albaran__wwds_3_albprofch_to ,
                                              Long.valueOf(AV88Albaranes_albaran__wwds_4_tfalbprocod) ,
                                              Long.valueOf(AV89Albaranes_albaran__wwds_5_tfalbprocod_to) ,
                                              AV91Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                              AV90Albaranes_albaran__wwds_6_tfalbpropri ,
                                              AV92Albaranes_albaran__wwds_8_tfalbprofch ,
                                              Integer.valueOf(AV93Albaranes_albaran__wwds_9_tfguiremcli) ,
                                              Integer.valueOf(AV94Albaranes_albaran__wwds_10_tfguiremcli_to) ,
                                              AV96Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                              AV95Albaranes_albaran__wwds_11_tfguiremcln ,
                                              Integer.valueOf(AV97Albaranes_albaran__wwds_13_tfalbproest_sels.size()) ,
                                              Integer.valueOf(AV98Albaranes_albaran__wwds_14_tfalbmarca_sels.size()) ,
                                              AV100Albaranes_albaran__wwds_16_tfalblic_sel ,
                                              AV99Albaranes_albaran__wwds_15_tfalblic ,
                                              AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                              AV101Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                              Boolean.valueOf(AV52isAnulado) ,
                                              A34AlbProfch ,
                                              Long.valueOf(A30AlbProCod) ,
                                              A39AlbProPri ,
                                              Integer.valueOf(A1243GuiRemCli) ,
                                              A1244GuiRemCln ,
                                              A7101AlbLic ,
                                              A14069AlbPdATCUD ,
                                              Short.valueOf(AV67OrderedBy) ,
                                              Boolean.valueOf(AV12OrderedDsc) ,
                                              AV85Albaranes_albaran__wwds_1_filterfulltext ,
                                              AV41EmprCod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN,
                                              TypeConstants.DATE, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV90Albaranes_albaran__wwds_6_tfalbpropri = GXutil.padr( GXutil.rtrim( AV90Albaranes_albaran__wwds_6_tfalbpropri), 1, "%") ;
         lV95Albaranes_albaran__wwds_11_tfguiremcln = GXutil.padr( GXutil.rtrim( AV95Albaranes_albaran__wwds_11_tfguiremcln), 30, "%") ;
         lV99Albaranes_albaran__wwds_15_tfalblic = GXutil.padr( GXutil.rtrim( AV99Albaranes_albaran__wwds_15_tfalblic), 20, "%") ;
         lV101Albaranes_albaran__wwds_17_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV101Albaranes_albaran__wwds_17_tfalbpdatcud), 20, "%") ;
         /* Using cursor H01XE3 */
         pr_default.execute(1, new Object[] {AV41EmprCod, AV86Albaranes_albaran__wwds_2_albprofch, AV87Albaranes_albaran__wwds_3_albprofch_to, Long.valueOf(AV88Albaranes_albaran__wwds_4_tfalbprocod), Long.valueOf(AV89Albaranes_albaran__wwds_5_tfalbprocod_to), lV90Albaranes_albaran__wwds_6_tfalbpropri, AV91Albaranes_albaran__wwds_7_tfalbpropri_sel, AV92Albaranes_albaran__wwds_8_tfalbprofch, Integer.valueOf(AV93Albaranes_albaran__wwds_9_tfguiremcli), Integer.valueOf(AV94Albaranes_albaran__wwds_10_tfguiremcli_to), lV95Albaranes_albaran__wwds_11_tfguiremcln, AV96Albaranes_albaran__wwds_12_tfguiremcln_sel, lV99Albaranes_albaran__wwds_15_tfalblic, AV100Albaranes_albaran__wwds_16_tfalblic_sel, lV101Albaranes_albaran__wwds_17_tfalbpdatcud, AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel});
         nGXsfl_61_idx = 1 ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1253EmprGuiRem = H01XE3_A1253EmprGuiRem[0] ;
            A5141AlbIvaCod = H01XE3_A5141AlbIvaCod[0] ;
            A2242AlbSec = H01XE3_A2242AlbSec[0] ;
            A3633CliEmail = H01XE3_A3633CliEmail[0] ;
            n3633CliEmail = H01XE3_n3633CliEmail[0] ;
            A3865AlbHorSal = H01XE3_A3865AlbHorSal[0] ;
            A4023AlbFecSal = H01XE3_A4023AlbFecSal[0] ;
            A10765AlbProAT = H01XE3_A10765AlbProAT[0] ;
            A5805AlbEnvFtp = H01XE3_A5805AlbEnvFtp[0] ;
            A14069AlbPdATCUD = H01XE3_A14069AlbPdATCUD[0] ;
            A7101AlbLic = H01XE3_A7101AlbLic[0] ;
            A5140AlbMarca = H01XE3_A5140AlbMarca[0] ;
            A33AlbProEst = H01XE3_A33AlbProEst[0] ;
            A1244GuiRemCln = H01XE3_A1244GuiRemCln[0] ;
            A1243GuiRemCli = H01XE3_A1243GuiRemCli[0] ;
            A34AlbProfch = H01XE3_A34AlbProfch[0] ;
            A39AlbProPri = H01XE3_A39AlbProPri[0] ;
            A30AlbProCod = H01XE3_A30AlbProCod[0] ;
            A396EmprCod = H01XE3_A396EmprCod[0] ;
            A3633CliEmail = H01XE3_A3633CliEmail[0] ;
            n3633CliEmail = H01XE3_n3633CliEmail[0] ;
            A1244GuiRemCln = H01XE3_A1244GuiRemCln[0] ;
            if ( (GXutil.strcmp("", AV85Albaranes_albaran__wwds_1_filterfulltext)==0) || ( ( GXutil.like( GXutil.str( A30AlbProCod, 10, 0) , GXutil.padr( "%" + AV85Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A39AlbProPri) , GXutil.padr( "%" + GXutil.upper( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A1243GuiRemCli, 6, 0) , GXutil.padr( "%" + AV85Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A1244GuiRemCln) , GXutil.padr( "%" + GXutil.upper( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A33AlbProEst, 1, 0) , GXutil.padr( "%" + AV85Albaranes_albaran__wwds_1_filterfulltext , 254 , "%"),  ' ' ) ) || ( GXutil.like( httpContext.getMessage( "activo", "") , GXutil.padr( "%" + GXutil.lower( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "") == 0 ) ) || ( GXutil.like( httpContext.getMessage( "anulado", "") , GXutil.padr( "%" + GXutil.lower( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) && ( GXutil.strcmp(A5140AlbMarca, "A") == 0 ) ) || ( GXutil.like( GXutil.upper( A7101AlbLic) , GXutil.padr( "%" + GXutil.upper( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A14069AlbPdATCUD) , GXutil.padr( "%" + GXutil.upper( AV85Albaranes_albaran__wwds_1_filterfulltext) , 255 , "%"),  ' ' ) ) ) )
            {
               e191XE2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(61) ;
         wb1XE0( ) ;
      }
      bGXsfl_61_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1XE2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV41EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV47GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV47GuiRemCli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD"+"_"+sGXsfl_61_idx, getSecureSignedToken( sGXsfl_61_idx, GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROCOD"+"_"+sGXsfl_61_idx, getSecureSignedToken( sGXsfl_61_idx, localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCCC", GXutil.ltrim( localUtil.ntoc( AV74CCC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74CCC), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV70Carvitin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Carvitin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPWDGRL", GXutil.ltrim( localUtil.ntoc( AV75PwdGrl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPWDGRL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75PwdGrl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTVAL", GXutil.ltrim( localUtil.ntoc( AV49ContVal, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49ContVal), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV43UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV54ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV54ImpCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROFCH"+"_"+sGXsfl_61_idx, getSecureSignedToken( sGXsfl_61_idx, A34AlbProfch));
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
      AV85Albaranes_albaran__wwds_1_filterfulltext = AV58FilterFullText ;
      AV86Albaranes_albaran__wwds_2_albprofch = AV48AlbProfch ;
      AV87Albaranes_albaran__wwds_3_albprofch_to = AV66AlbProfch_To ;
      AV88Albaranes_albaran__wwds_4_tfalbprocod = AV15TFAlbProCod ;
      AV89Albaranes_albaran__wwds_5_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV90Albaranes_albaran__wwds_6_tfalbpropri = AV17TFAlbProPri ;
      AV91Albaranes_albaran__wwds_7_tfalbpropri_sel = AV18TFAlbProPri_Sel ;
      AV92Albaranes_albaran__wwds_8_tfalbprofch = AV19TFAlbProfch ;
      AV93Albaranes_albaran__wwds_9_tfguiremcli = AV23TFGuiRemCli ;
      AV94Albaranes_albaran__wwds_10_tfguiremcli_to = AV24TFGuiRemCli_To ;
      AV95Albaranes_albaran__wwds_11_tfguiremcln = AV25TFGuiRemCln ;
      AV96Albaranes_albaran__wwds_12_tfguiremcln_sel = AV26TFGuiRemCln_Sel ;
      AV97Albaranes_albaran__wwds_13_tfalbproest_sels = AV28TFAlbProEst_Sels ;
      AV98Albaranes_albaran__wwds_14_tfalbmarca_sels = AV79TFAlbMarca_Sels ;
      AV99Albaranes_albaran__wwds_15_tfalblic = AV31TFAlbLic ;
      AV100Albaranes_albaran__wwds_16_tfalblic_sel = AV32TFAlbLic_Sel ;
      AV101Albaranes_albaran__wwds_17_tfalbpdatcud = AV33TFAlbPdATCUD ;
      AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel = AV34TFAlbPdATCUD_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV48AlbProfch, AV66AlbProfch_To, AV41EmprCod, AV65ManageFiltersExecutionStep, AV61ColumnsSelector, AV84Okc, AV47GuiRemCli, AV46AlbProCod, AV51Ok, AV58FilterFullText, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFAlbProPri, AV18TFAlbProPri_Sel, AV19TFAlbProfch, AV23TFGuiRemCli, AV24TFGuiRemCli_To, AV25TFGuiRemCln, AV26TFGuiRemCln_Sel, AV28TFAlbProEst_Sels, AV79TFAlbMarca_Sels, AV31TFAlbLic, AV32TFAlbLic_Sel, AV33TFAlbPdATCUD, AV34TFAlbPdATCUD_Sel, AV82Pgmname, AV67OrderedBy, AV12OrderedDsc, AV74CCC, AV70Carvitin, AV75PwdGrl, AV49ContVal, AV43UsurCod, AV54ImpCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV85Albaranes_albaran__wwds_1_filterfulltext = AV58FilterFullText ;
      AV86Albaranes_albaran__wwds_2_albprofch = AV48AlbProfch ;
      AV87Albaranes_albaran__wwds_3_albprofch_to = AV66AlbProfch_To ;
      AV88Albaranes_albaran__wwds_4_tfalbprocod = AV15TFAlbProCod ;
      AV89Albaranes_albaran__wwds_5_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV90Albaranes_albaran__wwds_6_tfalbpropri = AV17TFAlbProPri ;
      AV91Albaranes_albaran__wwds_7_tfalbpropri_sel = AV18TFAlbProPri_Sel ;
      AV92Albaranes_albaran__wwds_8_tfalbprofch = AV19TFAlbProfch ;
      AV93Albaranes_albaran__wwds_9_tfguiremcli = AV23TFGuiRemCli ;
      AV94Albaranes_albaran__wwds_10_tfguiremcli_to = AV24TFGuiRemCli_To ;
      AV95Albaranes_albaran__wwds_11_tfguiremcln = AV25TFGuiRemCln ;
      AV96Albaranes_albaran__wwds_12_tfguiremcln_sel = AV26TFGuiRemCln_Sel ;
      AV97Albaranes_albaran__wwds_13_tfalbproest_sels = AV28TFAlbProEst_Sels ;
      AV98Albaranes_albaran__wwds_14_tfalbmarca_sels = AV79TFAlbMarca_Sels ;
      AV99Albaranes_albaran__wwds_15_tfalblic = AV31TFAlbLic ;
      AV100Albaranes_albaran__wwds_16_tfalblic_sel = AV32TFAlbLic_Sel ;
      AV101Albaranes_albaran__wwds_17_tfalbpdatcud = AV33TFAlbPdATCUD ;
      AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel = AV34TFAlbPdATCUD_Sel ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV48AlbProfch, AV66AlbProfch_To, AV41EmprCod, AV65ManageFiltersExecutionStep, AV61ColumnsSelector, AV84Okc, AV47GuiRemCli, AV46AlbProCod, AV51Ok, AV58FilterFullText, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFAlbProPri, AV18TFAlbProPri_Sel, AV19TFAlbProfch, AV23TFGuiRemCli, AV24TFGuiRemCli_To, AV25TFGuiRemCln, AV26TFGuiRemCln_Sel, AV28TFAlbProEst_Sels, AV79TFAlbMarca_Sels, AV31TFAlbLic, AV32TFAlbLic_Sel, AV33TFAlbPdATCUD, AV34TFAlbPdATCUD_Sel, AV82Pgmname, AV67OrderedBy, AV12OrderedDsc, AV74CCC, AV70Carvitin, AV75PwdGrl, AV49ContVal, AV43UsurCod, AV54ImpCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV85Albaranes_albaran__wwds_1_filterfulltext = AV58FilterFullText ;
      AV86Albaranes_albaran__wwds_2_albprofch = AV48AlbProfch ;
      AV87Albaranes_albaran__wwds_3_albprofch_to = AV66AlbProfch_To ;
      AV88Albaranes_albaran__wwds_4_tfalbprocod = AV15TFAlbProCod ;
      AV89Albaranes_albaran__wwds_5_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV90Albaranes_albaran__wwds_6_tfalbpropri = AV17TFAlbProPri ;
      AV91Albaranes_albaran__wwds_7_tfalbpropri_sel = AV18TFAlbProPri_Sel ;
      AV92Albaranes_albaran__wwds_8_tfalbprofch = AV19TFAlbProfch ;
      AV93Albaranes_albaran__wwds_9_tfguiremcli = AV23TFGuiRemCli ;
      AV94Albaranes_albaran__wwds_10_tfguiremcli_to = AV24TFGuiRemCli_To ;
      AV95Albaranes_albaran__wwds_11_tfguiremcln = AV25TFGuiRemCln ;
      AV96Albaranes_albaran__wwds_12_tfguiremcln_sel = AV26TFGuiRemCln_Sel ;
      AV97Albaranes_albaran__wwds_13_tfalbproest_sels = AV28TFAlbProEst_Sels ;
      AV98Albaranes_albaran__wwds_14_tfalbmarca_sels = AV79TFAlbMarca_Sels ;
      AV99Albaranes_albaran__wwds_15_tfalblic = AV31TFAlbLic ;
      AV100Albaranes_albaran__wwds_16_tfalblic_sel = AV32TFAlbLic_Sel ;
      AV101Albaranes_albaran__wwds_17_tfalbpdatcud = AV33TFAlbPdATCUD ;
      AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel = AV34TFAlbPdATCUD_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48AlbProfch, AV66AlbProfch_To, AV41EmprCod, AV65ManageFiltersExecutionStep, AV61ColumnsSelector, AV84Okc, AV47GuiRemCli, AV46AlbProCod, AV51Ok, AV58FilterFullText, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFAlbProPri, AV18TFAlbProPri_Sel, AV19TFAlbProfch, AV23TFGuiRemCli, AV24TFGuiRemCli_To, AV25TFGuiRemCln, AV26TFGuiRemCln_Sel, AV28TFAlbProEst_Sels, AV79TFAlbMarca_Sels, AV31TFAlbLic, AV32TFAlbLic_Sel, AV33TFAlbPdATCUD, AV34TFAlbPdATCUD_Sel, AV82Pgmname, AV67OrderedBy, AV12OrderedDsc, AV74CCC, AV70Carvitin, AV75PwdGrl, AV49ContVal, AV43UsurCod, AV54ImpCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV85Albaranes_albaran__wwds_1_filterfulltext = AV58FilterFullText ;
      AV86Albaranes_albaran__wwds_2_albprofch = AV48AlbProfch ;
      AV87Albaranes_albaran__wwds_3_albprofch_to = AV66AlbProfch_To ;
      AV88Albaranes_albaran__wwds_4_tfalbprocod = AV15TFAlbProCod ;
      AV89Albaranes_albaran__wwds_5_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV90Albaranes_albaran__wwds_6_tfalbpropri = AV17TFAlbProPri ;
      AV91Albaranes_albaran__wwds_7_tfalbpropri_sel = AV18TFAlbProPri_Sel ;
      AV92Albaranes_albaran__wwds_8_tfalbprofch = AV19TFAlbProfch ;
      AV93Albaranes_albaran__wwds_9_tfguiremcli = AV23TFGuiRemCli ;
      AV94Albaranes_albaran__wwds_10_tfguiremcli_to = AV24TFGuiRemCli_To ;
      AV95Albaranes_albaran__wwds_11_tfguiremcln = AV25TFGuiRemCln ;
      AV96Albaranes_albaran__wwds_12_tfguiremcln_sel = AV26TFGuiRemCln_Sel ;
      AV97Albaranes_albaran__wwds_13_tfalbproest_sels = AV28TFAlbProEst_Sels ;
      AV98Albaranes_albaran__wwds_14_tfalbmarca_sels = AV79TFAlbMarca_Sels ;
      AV99Albaranes_albaran__wwds_15_tfalblic = AV31TFAlbLic ;
      AV100Albaranes_albaran__wwds_16_tfalblic_sel = AV32TFAlbLic_Sel ;
      AV101Albaranes_albaran__wwds_17_tfalbpdatcud = AV33TFAlbPdATCUD ;
      AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel = AV34TFAlbPdATCUD_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48AlbProfch, AV66AlbProfch_To, AV41EmprCod, AV65ManageFiltersExecutionStep, AV61ColumnsSelector, AV84Okc, AV47GuiRemCli, AV46AlbProCod, AV51Ok, AV58FilterFullText, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFAlbProPri, AV18TFAlbProPri_Sel, AV19TFAlbProfch, AV23TFGuiRemCli, AV24TFGuiRemCli_To, AV25TFGuiRemCln, AV26TFGuiRemCln_Sel, AV28TFAlbProEst_Sels, AV79TFAlbMarca_Sels, AV31TFAlbLic, AV32TFAlbLic_Sel, AV33TFAlbPdATCUD, AV34TFAlbPdATCUD_Sel, AV82Pgmname, AV67OrderedBy, AV12OrderedDsc, AV74CCC, AV70Carvitin, AV75PwdGrl, AV49ContVal, AV43UsurCod, AV54ImpCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV85Albaranes_albaran__wwds_1_filterfulltext = AV58FilterFullText ;
      AV86Albaranes_albaran__wwds_2_albprofch = AV48AlbProfch ;
      AV87Albaranes_albaran__wwds_3_albprofch_to = AV66AlbProfch_To ;
      AV88Albaranes_albaran__wwds_4_tfalbprocod = AV15TFAlbProCod ;
      AV89Albaranes_albaran__wwds_5_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV90Albaranes_albaran__wwds_6_tfalbpropri = AV17TFAlbProPri ;
      AV91Albaranes_albaran__wwds_7_tfalbpropri_sel = AV18TFAlbProPri_Sel ;
      AV92Albaranes_albaran__wwds_8_tfalbprofch = AV19TFAlbProfch ;
      AV93Albaranes_albaran__wwds_9_tfguiremcli = AV23TFGuiRemCli ;
      AV94Albaranes_albaran__wwds_10_tfguiremcli_to = AV24TFGuiRemCli_To ;
      AV95Albaranes_albaran__wwds_11_tfguiremcln = AV25TFGuiRemCln ;
      AV96Albaranes_albaran__wwds_12_tfguiremcln_sel = AV26TFGuiRemCln_Sel ;
      AV97Albaranes_albaran__wwds_13_tfalbproest_sels = AV28TFAlbProEst_Sels ;
      AV98Albaranes_albaran__wwds_14_tfalbmarca_sels = AV79TFAlbMarca_Sels ;
      AV99Albaranes_albaran__wwds_15_tfalblic = AV31TFAlbLic ;
      AV100Albaranes_albaran__wwds_16_tfalblic_sel = AV32TFAlbLic_Sel ;
      AV101Albaranes_albaran__wwds_17_tfalbpdatcud = AV33TFAlbPdATCUD ;
      AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel = AV34TFAlbPdATCUD_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV48AlbProfch, AV66AlbProfch_To, AV41EmprCod, AV65ManageFiltersExecutionStep, AV61ColumnsSelector, AV84Okc, AV47GuiRemCli, AV46AlbProCod, AV51Ok, AV58FilterFullText, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFAlbProPri, AV18TFAlbProPri_Sel, AV19TFAlbProfch, AV23TFGuiRemCli, AV24TFGuiRemCli_To, AV25TFGuiRemCln, AV26TFGuiRemCln_Sel, AV28TFAlbProEst_Sels, AV79TFAlbMarca_Sels, AV31TFAlbLic, AV32TFAlbLic_Sel, AV33TFAlbPdATCUD, AV34TFAlbPdATCUD_Sel, AV82Pgmname, AV67OrderedBy, AV12OrderedDsc, AV74CCC, AV70Carvitin, AV75PwdGrl, AV49ContVal, AV43UsurCod, AV54ImpCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV82Pgmname = "Albaranes.Albaran__WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82Pgmname", AV82Pgmname);
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavTest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTest_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1XE0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e171XE2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vMANAGEFILTERSDATA"), AV63ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV35DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV61ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_61 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_61"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV37GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV38GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Allowmultipleselection = httpContext.cgiGet( "DDO_GRID_Allowmultipleselection") ;
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
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
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( "DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV58FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58FilterFullText", AV58FilterFullText);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCH");
            GX_FocusControl = edtavAlbprofch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV48AlbProfch = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProfch", localUtil.format(AV48AlbProfch, "99/99/99"));
         }
         else
         {
            AV48AlbProfch = localUtil.ctod( httpContext.cgiGet( edtavAlbprofch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProfch", localUtil.format(AV48AlbProfch, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofch_to_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCH_TO");
            GX_FocusControl = edtavAlbprofch_to_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV66AlbProfch_To = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66AlbProfch_To", localUtil.format(AV66AlbProfch_To, "99/99/99"));
         }
         else
         {
            AV66AlbProfch_To = localUtil.ctod( httpContext.cgiGet( edtavAlbprofch_to_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66AlbProfch_To", localUtil.format(AV66AlbProfch_To, "99/99/99"));
         }
         AV82Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82Pgmname", AV82Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albprofchauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBPROFCHAUXDATE");
            GX_FocusControl = edtavDdo_albprofchauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21DDO_AlbProfchAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21DDO_AlbProfchAuxDate", localUtil.format(AV21DDO_AlbProfchAuxDate, "99/99/99"));
         }
         else
         {
            AV21DDO_AlbProfchAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albprofchauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21DDO_AlbProfchAuxDate", localUtil.format(AV21DDO_AlbProfchAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_61_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
         if ( nGXsfl_61_idx > 0 )
         {
            AV68DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV68DetailWebComponent);
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV39GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridActions), 4, 0));
            A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
            A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
            cmbAlbProEst.setName( cmbAlbProEst.getInternalname() );
            cmbAlbProEst.setValue( httpContext.cgiGet( cmbAlbProEst.getInternalname()) );
            A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
            cmbAlbMarca.setName( cmbAlbMarca.getInternalname() );
            cmbAlbMarca.setValue( httpContext.cgiGet( cmbAlbMarca.getInternalname()) );
            A5140AlbMarca = httpContext.cgiGet( cmbAlbMarca.getInternalname()) ;
            A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
            A14069AlbPdATCUD = httpContext.cgiGet( edtAlbPdATCUD_Internalname) ;
            cmbAlbEnvFtp.setName( cmbAlbEnvFtp.getInternalname() );
            cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            cmbAlbProAT.setName( cmbAlbProAT.getInternalname() );
            cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
            A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
            A4023AlbFecSal = localUtil.ctod( httpContext.cgiGet( edtAlbFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
            A3633CliEmail = httpContext.cgiGet( edtCliEmail_Internalname) ;
            n3633CliEmail = false ;
            A2242AlbSec = GXutil.upper( httpContext.cgiGet( edtAlbSec_Internalname)) ;
            AV13Test = httpContext.cgiGet( edtavTest_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavTest_Internalname, AV13Test);
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"Albaran__WW");
         AV82Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV82Pgmname", AV82Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV82Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("albaranes\\albaran__ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPROFCH"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV48AlbProfch)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPROFCH_TO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV66AlbProfch_To)) ) )
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
      e171XE2 ();
      if (returnInSub) return;
   }

   public void e171XE2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV40Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      albaran__ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV40Station = GXt_char1 ;
      GXv_char2[0] = AV41EmprCod ;
      GXv_char3[0] = AV42EmprNom ;
      GXv_char4[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV40Station, GXv_char2, GXv_char3, GXv_char4) ;
      albaran__ww_impl.this.AV41EmprCod = GXv_char2[0] ;
      albaran__ww_impl.this.AV42EmprNom = GXv_char3[0] ;
      albaran__ww_impl.this.AV43UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV43UsurCod", AV43UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43UsurCod, "@!"))));
      AV44Albsec = httpContext.getMessage( "N", "") ;
      AV45ContCod = "666666" ;
      GXt_char1 = AV40Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      albaran__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV40Station = GXt_char1 ;
      GXv_char4[0] = AV41EmprCod ;
      GXv_char3[0] = AV42EmprNom ;
      GXv_char2[0] = AV43UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV40Station, GXv_char4, GXv_char3, GXv_char2) ;
      albaran__ww_impl.this.AV41EmprCod = GXv_char4[0] ;
      albaran__ww_impl.this.AV42EmprNom = GXv_char3[0] ;
      albaran__ww_impl.this.AV43UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41EmprCod", AV41EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV43UsurCod", AV43UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV43UsurCod, "@!"))));
      divCell_grid_dwc_Class = "Invisible WCD_"+GXutil.upper( subGrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop("", false, divCell_grid_dwc_Internalname, "Class", divCell_grid_dwc_Class, true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      if ( GXutil.strcmp(AV7HTTPRequest.getMethod(), "GET") == 0 )
      {
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Albaranes", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV67OrderedBy < 1 )
      {
         AV67OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV35DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV35DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV48AlbProfch = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProfch", localUtil.format(AV48AlbProfch, "99/99/99"));
      AV66AlbProfch_To = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66AlbProfch_To", localUtil.format(AV66AlbProfch_To, "99/99/99"));
      GXv_int7[0] = (byte)(AV77F_carvema) ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int7) ;
      albaran__ww_impl.this.AV77F_carvema = GXv_int7[0] ;
      GXt_int8 = AV69F_tinamar ;
      GXv_int7[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int7) ;
      albaran__ww_impl.this.GXt_int8 = GXv_int7[0] ;
      AV69F_tinamar = GXt_int8 ;
      GXt_int8 = (byte)(AV70Carvitin) ;
      GXv_int7[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int7) ;
      albaran__ww_impl.this.GXt_int8 = GXv_int7[0] ;
      AV70Carvitin = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Carvitin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV70Carvitin), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVITIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV70Carvitin), "ZZZ9")));
      GXt_int8 = (byte)(AV71Erfoc) ;
      GXv_int7[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "ERFOC", ""), GXv_int7) ;
      albaran__ww_impl.this.GXt_int8 = GXv_int7[0] ;
      AV71Erfoc = GXt_int8 ;
      GXt_int8 = (byte)(AV72Etm) ;
      GXv_int7[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "ETM", ""), GXv_int7) ;
      albaran__ww_impl.this.GXt_int8 = GXv_int7[0] ;
      AV72Etm = GXt_int8 ;
      GXt_int8 = (byte)(AV73Artemalha) ;
      GXv_int7[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "ARTEMH", ""), GXv_int7) ;
      albaran__ww_impl.this.GXt_int8 = GXv_int7[0] ;
      AV73Artemalha = GXt_int8 ;
      GXt_int8 = (byte)(AV74CCC) ;
      GXv_int7[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "CCC", ""), GXv_int7) ;
      albaran__ww_impl.this.GXt_int8 = GXv_int7[0] ;
      AV74CCC = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74CCC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV74CCC), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV74CCC), "ZZZ9")));
      GXt_int9 = AV49ContVal ;
      GXv_int10[0] = GXt_int9 ;
      new app.pbuscon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "PWDGRE", ""), GXv_int10) ;
      albaran__ww_impl.this.GXt_int9 = GXv_int10[0] ;
      AV49ContVal = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49ContVal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49ContVal), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCONTVAL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV49ContVal), "ZZZZZZZ9")));
      GXt_int8 = (byte)(AV75PwdGrl) ;
      GXv_int7[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "PWDGRE", ""), GXv_int7) ;
      albaran__ww_impl.this.GXt_int8 = GXv_int7[0] ;
      AV75PwdGrl = GXt_int8 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV75PwdGrl", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV75PwdGrl), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPWDGRL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV75PwdGrl), "ZZZ9")));
      GXt_int8 = (byte)(AV76PdfGx16) ;
      GXv_int7[0] = GXt_int8 ;
      new app.pexicon(remoteHandle, context).execute( AV41EmprCod, httpContext.getMessage( "PDFGUI", ""), GXv_int7) ;
      albaran__ww_impl.this.GXt_int8 = GXv_int7[0] ;
      AV76PdfGx16 = GXt_int8 ;
      AV48AlbProfch = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProfch", localUtil.format(AV48AlbProfch, "99/99/99"));
      AV66AlbProfch_To = Gx_date ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66AlbProfch_To", localUtil.format(AV66AlbProfch_To, "99/99/99"));
   }

   public void e181XE2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV65ManageFiltersExecutionStep == 1 )
      {
         AV65ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65ManageFiltersExecutionStep", GXutil.str( AV65ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV65ManageFiltersExecutionStep == 2 )
      {
         AV65ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65ManageFiltersExecutionStep", GXutil.str( AV65ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV14Session.getValue("Albaranes.Albaran__WWColumnsSelector"), "") != 0 )
      {
         AV59ColumnsSelectorXML = AV14Session.getValue("Albaranes.Albaran__WWColumnsSelector") ;
         AV61ColumnsSelector.fromxml(AV59ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtAlbProCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV61ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProCod_Visible), 5, 0), !bGXsfl_61_Refreshing);
      edtAlbProPri_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV61ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProPri_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProPri_Visible), 5, 0), !bGXsfl_61_Refreshing);
      edtAlbProfch_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV61ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbProfch_Visible), 5, 0), !bGXsfl_61_Refreshing);
      edtGuiRemCli_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV61ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCli_Visible), 5, 0), !bGXsfl_61_Refreshing);
      edtGuiRemCln_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV61ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtGuiRemCln_Visible), 5, 0), !bGXsfl_61_Refreshing);
      cmbAlbProEst.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV61ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbProEst.getVisible(), 5, 0), !bGXsfl_61_Refreshing);
      cmbAlbMarca.setVisible( (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV61ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbMarca.getInternalname(), "Visible", GXutil.ltrimstr( cmbAlbMarca.getVisible(), 5, 0), !bGXsfl_61_Refreshing);
      edtAlbLic_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV61ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbLic_Visible), 5, 0), !bGXsfl_61_Refreshing);
      edtAlbPdATCUD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV61ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPdATCUD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbPdATCUD_Visible), 5, 0), !bGXsfl_61_Refreshing);
      AV37GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37GridCurrentPage), 10, 0));
      AV38GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridPageCount), 10, 0));
      if ( GXutil.strcmp(AV84Okc, httpContext.getMessage( "S", "")) == 0 )
      {
         AV84Okc = httpContext.getMessage( "Z", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV84Okc", AV84Okc);
         httpContext.popup(formatLink("app.tclientprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV41EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV47GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"InOutEmprCod","InOutCliCod","OutCliNom"}) , new Object[] {"AV41EmprCod","AV47GuiRemCli","AV50GuiRemCln"});
      }
      if ( GXutil.strcmp(AV84Okc, httpContext.getMessage( "Z", "")) == 0 )
      {
         new app.pcligrc(remoteHandle, context).execute( AV41EmprCod, AV46AlbProCod, AV47GuiRemCli) ;
      }
      if ( GXutil.strcmp(AV51Ok, httpContext.getMessage( "S", "")) == 0 )
      {
         /* Execute user subroutine: 'CONFIRMAELIMINARREGISTRO' */
         S172 ();
         if (returnInSub) return;
      }
      AV85Albaranes_albaran__wwds_1_filterfulltext = AV58FilterFullText ;
      AV86Albaranes_albaran__wwds_2_albprofch = AV48AlbProfch ;
      AV87Albaranes_albaran__wwds_3_albprofch_to = AV66AlbProfch_To ;
      AV88Albaranes_albaran__wwds_4_tfalbprocod = AV15TFAlbProCod ;
      AV89Albaranes_albaran__wwds_5_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV90Albaranes_albaran__wwds_6_tfalbpropri = AV17TFAlbProPri ;
      AV91Albaranes_albaran__wwds_7_tfalbpropri_sel = AV18TFAlbProPri_Sel ;
      AV92Albaranes_albaran__wwds_8_tfalbprofch = AV19TFAlbProfch ;
      AV93Albaranes_albaran__wwds_9_tfguiremcli = AV23TFGuiRemCli ;
      AV94Albaranes_albaran__wwds_10_tfguiremcli_to = AV24TFGuiRemCli_To ;
      AV95Albaranes_albaran__wwds_11_tfguiremcln = AV25TFGuiRemCln ;
      AV96Albaranes_albaran__wwds_12_tfguiremcln_sel = AV26TFGuiRemCln_Sel ;
      AV97Albaranes_albaran__wwds_13_tfalbproest_sels = AV28TFAlbProEst_Sels ;
      AV98Albaranes_albaran__wwds_14_tfalbmarca_sels = AV79TFAlbMarca_Sels ;
      AV99Albaranes_albaran__wwds_15_tfalblic = AV31TFAlbLic ;
      AV100Albaranes_albaran__wwds_16_tfalblic_sel = AV32TFAlbLic_Sel ;
      AV101Albaranes_albaran__wwds_17_tfalbpdatcud = AV33TFAlbPdATCUD ;
      AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel = AV34TFAlbPdATCUD_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV61ColumnsSelector", AV61ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63ManageFiltersData", AV63ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e121XE2( )
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
         AV36PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV36PageToGo) ;
      }
   }

   public void e131XE2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141XE2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV67OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67OrderedBy), 4, 0));
         AV12OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedDsc", AV12OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCod") == 0 )
         {
            AV15TFAlbProCod = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFAlbProCod), 10, 0));
            AV16TFAlbProCod_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProPri") == 0 )
         {
            AV17TFAlbProPri = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFAlbProPri", AV17TFAlbProPri);
            AV18TFAlbProPri_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFAlbProPri_Sel", AV18TFAlbProPri_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProfch") == 0 )
         {
            AV19TFAlbProfch = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFAlbProfch", localUtil.format(AV19TFAlbProfch, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiRemCli") == 0 )
         {
            AV23TFGuiRemCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFGuiRemCli), 6, 0));
            AV24TFGuiRemCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFGuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFGuiRemCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiRemCln") == 0 )
         {
            AV25TFGuiRemCln = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFGuiRemCln", AV25TFGuiRemCln);
            AV26TFGuiRemCln_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFGuiRemCln_Sel", AV26TFGuiRemCln_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProEst") == 0 )
         {
            AV27TFAlbProEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbProEst_SelsJson", AV27TFAlbProEst_SelsJson);
            AV28TFAlbProEst_Sels.fromJSonString(GXutil.strReplace( AV27TFAlbProEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbMarca") == 0 )
         {
            AV78TFAlbMarca_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFAlbMarca_SelsJson", AV78TFAlbMarca_SelsJson);
            AV79TFAlbMarca_Sels.fromJSonString(AV78TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbLic") == 0 )
         {
            AV31TFAlbLic = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbLic", AV31TFAlbLic);
            AV32TFAlbLic_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbLic_Sel", AV32TFAlbLic_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbPdATCUD") == 0 )
         {
            AV33TFAlbPdATCUD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbPdATCUD", AV33TFAlbPdATCUD);
            AV34TFAlbPdATCUD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbPdATCUD_Sel", AV34TFAlbPdATCUD_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV79TFAlbMarca_Sels", AV79TFAlbMarca_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28TFAlbProEst_Sels", AV28TFAlbProEst_Sels);
   }

   private void e191XE2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV68DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV68DetailWebComponent);
         cmbavGridactions.removeAllItems();
         cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Consultar", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Alterar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Excluir", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
         if ( AV74CCC == 1 )
         {
            cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Trocar Cliente", ""), "fas fa-exchange-alt", "", "", "", "", "", "", ""), (short)(0));
         }
         if ( AV70Carvitin == 1 )
         {
            cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Ver Formato", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
         }
         cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Email", ""), "fa fa-inbox", "", "", "", "", "", "", ""), (short)(0));
         GXt_char1 = AV13Test ;
         GXv_char4[0] = A396EmprCod ;
         GXv_int10[0] = A1243GuiRemCli ;
         GXv_char3[0] = GXt_char1 ;
         new app.pguiatest(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_char3) ;
         albaran__ww_impl.this.A396EmprCod = GXv_char4[0] ;
         albaran__ww_impl.this.A1243GuiRemCli = GXv_int10[0] ;
         albaran__ww_impl.this.GXt_char1 = GXv_char3[0] ;
         AV13Test = GXt_char1 ;
         httpContext.ajax_rsp_assign_attri("", false, edtavTest_Internalname, AV13Test);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(61) ;
         }
         sendrow_612( ) ;
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
      if ( isFullAjaxMode( ) && ! bGXsfl_61_Refreshing )
      {
         httpContext.doAjaxLoad(61, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV39GridActions, 4, 0)) );
   }

   public void e151XE2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV59ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV61ColumnsSelector.fromJSonString(AV59ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "Albaranes.Albaran__WWColumnsSelector", ((GXutil.strcmp("", AV59ColumnsSelectorXML)==0) ? "" : AV61ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV61ColumnsSelector", AV61ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63ManageFiltersData", AV63ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e111XE2( )
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
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("Albaranes.Albaran__WWFilters")),GXutil.URLEncode(GXutil.rtrim(AV82Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV65ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65ManageFiltersExecutionStep", GXutil.str( AV65ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("Albaranes.Albaran__WWFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV65ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65ManageFiltersExecutionStep", GXutil.str( AV65ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefresh();
      }
      else
      {
         GXt_char1 = AV64ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "Albaranes.Albaran__WWFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         albaran__ww_impl.this.GXt_char1 = GXv_char4[0] ;
         AV64ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV64ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S182 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV82Pgmname+"GridState", AV64ManageFiltersXml) ;
            AV10GridState.fromxml(AV64ManageFiltersXml, null, null);
            AV67OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67OrderedBy), 4, 0));
            AV12OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedDsc", AV12OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
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
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV28TFAlbProEst_Sels", AV28TFAlbProEst_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV79TFAlbMarca_Sels", AV79TFAlbMarca_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV61ColumnsSelector", AV61ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63ManageFiltersData", AV63ManageFiltersData);
   }

   public void e201XE2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV39GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV39GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV39GridActions == 3 )
      {
         /* Execute user subroutine: 'DO ELIMINAR' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV39GridActions == 4 )
      {
         /* Execute user subroutine: 'DO CAMBIARCLIENTE' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV39GridActions == 5 )
      {
         /* Execute user subroutine: 'DO VERFORMATO' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV39GridActions == 6 )
      {
         /* Execute user subroutine: 'DO EMAIL' */
         S252 ();
         if (returnInSub) return;
      }
      AV39GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV39GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV61ColumnsSelector", AV61ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63ManageFiltersData", AV63ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e161XE2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.albaranes.albaran", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV41EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.booltostr(true)),GXutil.URLEncode(GXutil.booltostr(true))}, new String[] {"Mode","EmprCod","AlbProCod","VisualizarAcciones","AccionesEnPopup"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV67OrderedBy, 4, 0))+":"+(AV12OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV61ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV61ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "AlbProCod", "", "Nº Guia", true, "") ;
      AV61ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV61ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "AlbProPri", "", "P", true, "") ;
      AV61ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV61ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "AlbProfch", "", "Data", true, "") ;
      AV61ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV61ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "GuiRemCli", "", "Codigo", true, "") ;
      AV61ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV61ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "GuiRemCln", "", "Cliente", true, "") ;
      AV61ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV61ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "AlbProEst", "", "Estado", true, "") ;
      AV61ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV61ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "AlbMarca", "", "M", true, "") ;
      AV61ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV61ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "AlbLic", "", "Codigo AT", true, "") ;
      AV61ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV61ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "AlbPdATCUD", "", "ATCUD", true, "") ;
      AV61ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char1 = AV60UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "Albaranes.Albaran__WWColumnsSelector", GXv_char4) ;
      albaran__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV60UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV60UserCustomValue)==0) ) )
      {
         AV62ColumnsSelectorAux.fromxml(AV60UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV62ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV61ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV62ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV61ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV63ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "Albaranes.Albaran__WWFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV63ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S182( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV58FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58FilterFullText", AV58FilterFullText);
      AV48AlbProfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProfch", localUtil.format(AV48AlbProfch, "99/99/99"));
      AV66AlbProfch_To = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66AlbProfch_To", localUtil.format(AV66AlbProfch_To, "99/99/99"));
      AV15TFAlbProCod = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFAlbProCod), 10, 0));
      AV16TFAlbProCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFAlbProCod_To), 10, 0));
      AV17TFAlbProPri = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17TFAlbProPri", AV17TFAlbProPri);
      AV18TFAlbProPri_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18TFAlbProPri_Sel", AV18TFAlbProPri_Sel);
      AV19TFAlbProfch = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19TFAlbProfch", localUtil.format(AV19TFAlbProfch, "99/99/99"));
      AV23TFGuiRemCli = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23TFGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFGuiRemCli), 6, 0));
      AV24TFGuiRemCli_To = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24TFGuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFGuiRemCli_To), 6, 0));
      AV25TFGuiRemCln = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25TFGuiRemCln", AV25TFGuiRemCln);
      AV26TFGuiRemCln_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26TFGuiRemCln_Sel", AV26TFGuiRemCln_Sel);
      AV28TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "") ;
      AV79TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV31TFAlbLic = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbLic", AV31TFAlbLic);
      AV32TFAlbLic_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbLic_Sel", AV32TFAlbLic_Sel);
      AV33TFAlbPdATCUD = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbPdATCUD", AV33TFAlbPdATCUD);
      AV34TFAlbPdATCUD_Sel = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbPdATCUD_Sel", AV34TFAlbPdATCUD_Sel);
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
      callWebObject(formatLink("app.albaranes.albaran", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.booltostr(true)),GXutil.URLEncode(GXutil.booltostr(true))}, new String[] {"Mode","EmprCod","AlbProCod","VisualizarAcciones","AccionesEnPopup"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S212( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.albaranes.albaran", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.booltostr(true)),GXutil.URLEncode(GXutil.booltostr(true))}, new String[] {"Mode","EmprCod","AlbProCod","VisualizarAcciones","AccionesEnPopup"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
   }

   public void S222( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      if ( AV75PwdGrl == 1 )
      {
         AV51Ok = httpContext.getMessage( "N", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51Ok", AV51Ok);
         httpContext.popup(formatLink("app.albaranes.pwdgrl", new String[] {GXutil.URLEncode(GXutil.ltrimstr(AV49ContVal,8,0)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"UsurPwd1","PwdBo"}) , new Object[] {"AV51Ok"});
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No habilitado para eliminar", ""));
      }
   }

   public void S232( )
   {
      /* 'DO CAMBIARCLIENTE' Routine */
      returnInSub = false ;
      if ( ( AV74CCC == 1 ) && ( A30AlbProCod > 0 ) )
      {
         AV46AlbProCod = A30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46AlbProCod), 10, 0));
         httpContext.popup(formatLink("app.albaranes.pwduse", new String[] {GXutil.URLEncode(GXutil.rtrim(AV43UsurCod)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"UsurCod","PwdBo"}) , new Object[] {"AV84Okc"});
         httpContext.doAjaxRefresh();
      }
   }

   public void S242( )
   {
      /* 'DO VERFORMATO' Routine */
      returnInSub = false ;
      if ( AV70Carvitin == 1 )
      {
         httpContext.popup(formatLink("app.albaranes.pgrcarvitin", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(AV54ImpCod)),GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "Original", "")))}, new String[] {"EmprCod","AlbProCod","ImpCod","TextoCopia"}) , new Object[] {});
      }
   }

   public void S252( )
   {
      /* 'DO EMAIL' Routine */
      returnInSub = false ;
      new app.albaranes.albaran_enviomailalbaranproduccionsdp(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, A34AlbProfch, "", true) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV82Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV82Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV82Pgmname+"GridState"), null, null);
      }
      AV67OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67OrderedBy), 4, 0));
      AV12OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedDsc", AV12OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
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
      AV103GXV1 = 1 ;
      while ( AV103GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV58FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58FilterFullText", AV58FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "ALBPROFCH") == 0 )
         {
            AV48AlbProfch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48AlbProfch", localUtil.format(AV48AlbProfch, "99/99/99"));
            AV66AlbProfch_To = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV66AlbProfch_To", localUtil.format(AV66AlbProfch_To, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV15TFAlbProCod = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFAlbProCod), 10, 0));
            AV16TFAlbProCod_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI") == 0 )
         {
            AV17TFAlbProPri = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFAlbProPri", AV17TFAlbProPri);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROPRI_SEL") == 0 )
         {
            AV18TFAlbProPri_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFAlbProPri_Sel", AV18TFAlbProPri_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROFCH") == 0 )
         {
            AV19TFAlbProfch = localUtil.ctod( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFAlbProfch", localUtil.format(AV19TFAlbProfch, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV23TFGuiRemCli = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFGuiRemCli), 6, 0));
            AV24TFGuiRemCli_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFGuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFGuiRemCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV25TFGuiRemCln = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFGuiRemCln", AV25TFGuiRemCln);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV26TFGuiRemCln_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFGuiRemCln_Sel", AV26TFGuiRemCln_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV27TFAlbProEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFAlbProEst_SelsJson", AV27TFAlbProEst_SelsJson);
            AV28TFAlbProEst_Sels.fromJSonString(AV27TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBMARCA_SEL") == 0 )
         {
            AV78TFAlbMarca_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV78TFAlbMarca_SelsJson", AV78TFAlbMarca_SelsJson);
            AV79TFAlbMarca_Sels.fromJSonString(AV78TFAlbMarca_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV31TFAlbLic = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFAlbLic", AV31TFAlbLic);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV32TFAlbLic_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFAlbLic_Sel", AV32TFAlbLic_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPDATCUD") == 0 )
         {
            AV33TFAlbPdATCUD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFAlbPdATCUD", AV33TFAlbPdATCUD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPDATCUD_SEL") == 0 )
         {
            AV34TFAlbPdATCUD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFAlbPdATCUD_Sel", AV34TFAlbPdATCUD_Sel);
         }
         AV103GXV1 = (int)(AV103GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV18TFAlbProPri_Sel)==0), AV18TFAlbProPri_Sel, GXv_char4) ;
      albaran__ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFGuiRemCln_Sel)==0), AV26TFGuiRemCln_Sel, GXv_char3) ;
      albaran__ww_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV79TFAlbMarca_Sels.size()==0), AV78TFAlbMarca_SelsJson, GXv_char2) ;
      albaran__ww_impl.this.GXt_char17 = GXv_char2[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFAlbLic_Sel)==0), AV32TFAlbLic_Sel, GXv_char19) ;
      albaran__ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFAlbPdATCUD_Sel)==0), AV34TFAlbPdATCUD_Sel, GXv_char21) ;
      albaran__ww_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|||"+GXt_char16+"|"+((AV28TFAlbProEst_Sels.size()==0) ? "" : AV27TFAlbProEst_SelsJson)+"|"+GXt_char17+"|"+GXt_char18+"|"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV17TFAlbProPri)==0), AV17TFAlbProPri, GXv_char21) ;
      albaran__ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFGuiRemCln)==0), AV25TFGuiRemCln, GXv_char19) ;
      albaran__ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char17 = "" ;
      GXv_char4[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV31TFAlbLic)==0), AV31TFAlbLic, GXv_char4) ;
      albaran__ww_impl.this.GXt_char17 = GXv_char4[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFAlbPdATCUD)==0), AV33TFAlbPdATCUD, GXv_char3) ;
      albaran__ww_impl.this.GXt_char16 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV15TFAlbProCod) ? "" : GXutil.str( AV15TFAlbProCod, 10, 0))+"|"+GXt_char20+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19TFAlbProfch)) ? "" : localUtil.dtoc( AV19TFAlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+((0==AV23TFGuiRemCli) ? "" : GXutil.str( AV23TFGuiRemCli, 6, 0))+"|"+GXt_char18+"|||"+GXt_char17+"|"+GXt_char16 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV16TFAlbProCod_To) ? "" : GXutil.str( AV16TFAlbProCod_To, 10, 0))+"|||"+((0==AV24TFGuiRemCli_To) ? "" : GXutil.str( AV24TFGuiRemCli_To, 6, 0))+"|||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV14Session.getValue(AV82Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV67OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV12OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV58FilterFullText)==0), (short)(0), AV58FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "ALBPROFCH", "", !(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV48AlbProfch))&&GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV66AlbProfch_To))), (short)(0), GXutil.trim( localUtil.dtoc( AV48AlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), GXutil.trim( localUtil.dtoc( AV66AlbProfch_To, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBPROCOD", "", !((0==AV15TFAlbProCod)&&(0==AV16TFAlbProCod_To)), (short)(0), GXutil.trim( GXutil.str( AV15TFAlbProCod, 10, 0)), GXutil.trim( GXutil.str( AV16TFAlbProCod_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBPROPRI", "", !(GXutil.strcmp("", AV17TFAlbProPri)==0), (short)(0), AV17TFAlbProPri, "", !(GXutil.strcmp("", AV18TFAlbProPri_Sel)==0), AV18TFAlbProPri_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBPROFCH", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV19TFAlbProfch)), (short)(0), GXutil.trim( localUtil.dtoc( AV19TFAlbProfch, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFGUIREMCLI", "", !((0==AV23TFGuiRemCli)&&(0==AV24TFGuiRemCli_To)), (short)(0), GXutil.trim( GXutil.str( AV23TFGuiRemCli, 6, 0)), GXutil.trim( GXutil.str( AV24TFGuiRemCli_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFGUIREMCLN", "", !(GXutil.strcmp("", AV25TFGuiRemCln)==0), (short)(0), AV25TFGuiRemCln, "", !(GXutil.strcmp("", AV26TFGuiRemCln_Sel)==0), AV26TFGuiRemCln_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBPROEST_SEL", "", !(AV28TFAlbProEst_Sels.size()==0), (short)(0), AV28TFAlbProEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBMARCA_SEL", "", !(AV79TFAlbMarca_Sels.size()==0), (short)(0), AV79TFAlbMarca_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBLIC", "", !(GXutil.strcmp("", AV31TFAlbLic)==0), (short)(0), AV31TFAlbLic, "", !(GXutil.strcmp("", AV32TFAlbLic_Sel)==0), AV32TFAlbLic_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBPDATCUD", "", !(GXutil.strcmp("", AV33TFAlbPdATCUD)==0), (short)(0), AV33TFAlbPdATCUD, "", !(GXutil.strcmp("", AV34TFAlbPdATCUD_Sel)==0), AV34TFAlbPdATCUD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV82Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV82Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Albaranes.Albaran" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'CONFIRMAELIMINARREGISTRO' Routine */
      returnInSub = false ;
      GXv_objcol_SdtMessages_Message23[0] = AV55Messages ;
      new app.albaranes.albaran__eliminar_pr(remoteHandle, context).execute( A396EmprCod, A30AlbProCod, GXv_objcol_SdtMessages_Message23) ;
      AV55Messages = GXv_objcol_SdtMessages_Message23[0] ;
      if ( AV55Messages.size() > 0 )
      {
         AV104GXV2 = 1 ;
         while ( AV104GXV2 <= AV55Messages.size() )
         {
            AV56Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV55Messages.elementAt(-1+AV104GXV2));
            httpContext.GX_msglist.addItem(AV56Message.getgxTv_SdtMessages_Message_Description());
            AV104GXV2 = (int)(AV104GXV2+1) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Registro eliminado", ""));
      }
   }

   public void wb_table2_43_1XE2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedalbprofch_Internalname, tblTablemergedalbprofch_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofch_Internalname, httpContext.getMessage( "Fecha creacion del Albaran", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofch_Internalname, localUtil.format(AV48AlbProfch, "99/99/99"), localUtil.format( AV48AlbProfch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofch_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavAlbprofch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Albaranes\\Albaran__WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblAlbprofch_rangemiddletext_Internalname, httpContext.getMessage( "a", ""), "", "", lblAlbprofch_rangemiddletext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataFilterDescription", 0, "", 1, 1, 0, (short)(0), "HLP_Albaranes\\Albaran__WW.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofch_to_Internalname, httpContext.getMessage( "Alb Profch_To", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofch_to_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofch_to_Internalname, localUtil.format(AV66AlbProfch_To, "99/99/99"), localUtil.format( AV66AlbProfch_To, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofch_to_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavAlbprofch_to_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Albaranes\\Albaran__WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofch_to_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofch_to_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Albaranes\\Albaran__WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_43_1XE2e( true) ;
      }
      else
      {
         wb_table2_43_1XE2e( false) ;
      }
   }

   public void wb_table1_24_1XE2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV63ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, "DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_29_1XE2( true) ;
      }
      else
      {
         wb_table3_29_1XE2( false) ;
      }
      return  ;
   }

   public void wb_table3_29_1XE2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_24_1XE2e( true) ;
      }
      else
      {
         wb_table1_24_1XE2e( false) ;
      }
   }

   public void wb_table3_29_1XE2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV58FilterFullText, GXutil.rtrim( localUtil.format( AV58FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_Albaranes\\Albaran__WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_29_1XE2e( true) ;
      }
      else
      {
         wb_table3_29_1XE2e( false) ;
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
      pa1XE2( ) ;
      ws1XE2( ) ;
      we1XE2( ) ;
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
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Grid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Grid_dwc_Component) != 0 )
         {
            WebComp_Grid_dwc.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682813454763", true, true);
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
      httpContext.AddJavascriptSource("albaranes/albaran__ww.js", "?202682813454763", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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

   public void subsflControlProps_612( )
   {
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_61_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_61_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_61_idx ;
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_61_idx ;
      edtAlbProPri_Internalname = "ALBPROPRI_"+sGXsfl_61_idx ;
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_61_idx ;
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_61_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_61_idx ;
      cmbAlbProEst.setInternalname( "ALBPROEST_"+sGXsfl_61_idx );
      cmbAlbMarca.setInternalname( "ALBMARCA_"+sGXsfl_61_idx );
      edtAlbLic_Internalname = "ALBLIC_"+sGXsfl_61_idx ;
      edtAlbPdATCUD_Internalname = "ALBPDATCUD_"+sGXsfl_61_idx ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP_"+sGXsfl_61_idx );
      cmbAlbProAT.setInternalname( "ALBPROAT_"+sGXsfl_61_idx );
      edtAlbFecSal_Internalname = "ALBFECSAL_"+sGXsfl_61_idx ;
      edtAlbHorSal_Internalname = "ALBHORSAL_"+sGXsfl_61_idx ;
      edtCliEmail_Internalname = "CLIEMAIL_"+sGXsfl_61_idx ;
      edtAlbSec_Internalname = "ALBSEC_"+sGXsfl_61_idx ;
      edtavTest_Internalname = "vTEST_"+sGXsfl_61_idx ;
   }

   public void subsflControlProps_fel_612( )
   {
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_61_fel_idx ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_61_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_61_fel_idx ;
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_61_fel_idx ;
      edtAlbProPri_Internalname = "ALBPROPRI_"+sGXsfl_61_fel_idx ;
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_61_fel_idx ;
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_61_fel_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_61_fel_idx ;
      cmbAlbProEst.setInternalname( "ALBPROEST_"+sGXsfl_61_fel_idx );
      cmbAlbMarca.setInternalname( "ALBMARCA_"+sGXsfl_61_fel_idx );
      edtAlbLic_Internalname = "ALBLIC_"+sGXsfl_61_fel_idx ;
      edtAlbPdATCUD_Internalname = "ALBPDATCUD_"+sGXsfl_61_fel_idx ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP_"+sGXsfl_61_fel_idx );
      cmbAlbProAT.setInternalname( "ALBPROAT_"+sGXsfl_61_fel_idx );
      edtAlbFecSal_Internalname = "ALBFECSAL_"+sGXsfl_61_fel_idx ;
      edtAlbHorSal_Internalname = "ALBHORSAL_"+sGXsfl_61_fel_idx ;
      edtCliEmail_Internalname = "CLIEMAIL_"+sGXsfl_61_fel_idx ;
      edtAlbSec_Internalname = "ALBSEC_"+sGXsfl_61_fel_idx ;
      edtavTest_Internalname = "vTEST_"+sGXsfl_61_fel_idx ;
   }

   public void sendrow_612( )
   {
      subsflControlProps_612( ) ;
      wb1XE0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_61_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_61_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_61_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV68DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,62);\"" : " "),"'"+""+"'"+",false,"+"'"+"e211xe2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_61_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV39GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV39GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV39GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_61_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV39GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_61_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCod_Internalname,GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbProPri_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProPri_Internalname,GXutil.rtrim( A39AlbProPri),GXutil.rtrim( localUtil.format( A39AlbProPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProPri_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbProfch_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProfch_Internalname,localUtil.format(A34AlbProfch, "99/99/99"),localUtil.format( A34AlbProfch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbProfch_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtGuiRemCli_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGuiRemCli_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtGuiRemCln_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCln_Internalname,GXutil.rtrim( A1244GuiRemCln),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtGuiRemCln_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((cmbAlbProEst.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbProEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROEST_" + sGXsfl_61_idx ;
            cmbAlbProEst.setName( GXCCtl );
            cmbAlbProEst.setWebtags( "" );
            cmbAlbProEst.addItem("0", httpContext.getMessage( "0 Pdte. Imprimir", ""), (short)(0));
            cmbAlbProEst.addItem("1", httpContext.getMessage( "1 Imprimido", ""), (short)(0));
            cmbAlbProEst.addItem("2", httpContext.getMessage( "2 Facturado", ""), (short)(0));
            if ( cmbAlbProEst.getItemCount() > 0 )
            {
               A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProEst,cmbAlbProEst.getInternalname(),GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)),Integer.valueOf(1),cmbAlbProEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(cmbAlbProEst.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProEst.setValue( GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Values", cmbAlbProEst.ToJavascriptSource(), !bGXsfl_61_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((cmbAlbMarca.getVisible()==0) ? "display:none;" : "")+"\">") ;
         }
         if ( ( cmbAlbMarca.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBMARCA_" + sGXsfl_61_idx ;
            cmbAlbMarca.setName( GXCCtl );
            cmbAlbMarca.setWebtags( "" );
            cmbAlbMarca.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
            cmbAlbMarca.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
            if ( cmbAlbMarca.getItemCount() > 0 )
            {
               A5140AlbMarca = cmbAlbMarca.getValidValue(A5140AlbMarca) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbMarca,cmbAlbMarca.getInternalname(),GXutil.rtrim( A5140AlbMarca),Integer.valueOf(1),cmbAlbMarca.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(cmbAlbMarca.getVisible()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbMarca.setValue( GXutil.rtrim( A5140AlbMarca) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbMarca.getInternalname(), "Values", cmbAlbMarca.ToJavascriptSource(), !bGXsfl_61_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbLic_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbLic_Internalname,GXutil.rtrim( A7101AlbLic),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbLic_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbLic_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbPdATCUD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPdATCUD_Internalname,GXutil.rtrim( A14069AlbPdATCUD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPdATCUD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtAlbPdATCUD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbEnvFtp.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBENVFTP_" + sGXsfl_61_idx ;
            cmbAlbEnvFtp.setName( GXCCtl );
            cmbAlbEnvFtp.setWebtags( "" );
            cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
            cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
            if ( cmbAlbEnvFtp.getItemCount() > 0 )
            {
               A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbEnvFtp,cmbAlbEnvFtp.getInternalname(),GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)),Integer.valueOf(1),cmbAlbEnvFtp.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), !bGXsfl_61_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbProAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROAT_" + sGXsfl_61_idx ;
            cmbAlbProAT.setName( GXCCtl );
            cmbAlbProAT.setWebtags( "" );
            cmbAlbProAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
            cmbAlbProAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
            cmbAlbProAT.addItem("", httpContext.getMessage( "s/d", ""), (short)(0));
            if ( cmbAlbProAT.getItemCount() > 0 )
            {
               A10765AlbProAT = cmbAlbProAT.getValidValue(A10765AlbProAT) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProAT,cmbAlbProAT.getInternalname(),GXutil.rtrim( A10765AlbProAT),Integer.valueOf(1),cmbAlbProAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn hidden-xs","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), !bGXsfl_61_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbFecSal_Internalname,localUtil.format(A4023AlbFecSal, "99/99/99"),localUtil.format( A4023AlbFecSal, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHorSal_Internalname,GXutil.rtrim( A3865AlbHorSal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHorSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliEmail_Internalname,GXutil.rtrim( A3633CliEmail),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliEmail_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSec_Internalname,GXutil.rtrim( A2242AlbSec),GXutil.rtrim( localUtil.format( A2242AlbSec, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTest_Enabled!=0)&&(edtavTest_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTest_Internalname,GXutil.rtrim( AV13Test),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavTest_Enabled!=0)&&(edtavTest_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,80);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1XE2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_61_idx = ((subGrid_Islastpage==1)&&(nGXsfl_61_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_61_idx+1) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
      }
      /* End function sendrow_612 */
   }

   public void startgridcontrol61( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"61\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProPri_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbProfch_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiRemCli_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtGuiRemCln_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbProEst.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((cmbAlbMarca.getVisible()==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "M", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbLic_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo AT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbPdATCUD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ATCUD", "")) ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV68DetailWebComponent));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV39GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A39AlbProPri));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProPri_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A34AlbProfch, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbProfch_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiRemCli_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1244GuiRemCln));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtGuiRemCln_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbProEst.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5140AlbMarca));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( cmbAlbMarca.getVisible(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7101AlbLic));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbLic_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14069AlbPdATCUD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbPdATCUD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10765AlbProAT));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A4023AlbFecSal, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3865AlbHorSal));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3633CliEmail));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2242AlbSec));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV13Test));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTest_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtninsert_Internalname = "BTNINSERT" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      Ddo_managefilters_Internalname = "DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = "vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = "TABLEFILTERS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      lblFiltertextalbprofch_Internalname = "FILTERTEXTALBPROFCH" ;
      edtavAlbprofch_Internalname = "vALBPROFCH" ;
      lblAlbprofch_rangemiddletext_Internalname = "ALBPROFCH_RANGEMIDDLETEXT" ;
      edtavAlbprofch_to_Internalname = "vALBPROFCH_TO" ;
      tblTablemergedalbprofch_Internalname = "TABLEMERGEDALBPROFCH" ;
      divTablesplittedfiltertextalbprofch_Internalname = "TABLESPLITTEDFILTERTEXTALBPROFCH" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtAlbProPri_Internalname = "ALBPROPRI" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      cmbAlbProEst.setInternalname( "ALBPROEST" );
      cmbAlbMarca.setInternalname( "ALBMARCA" );
      edtAlbLic_Internalname = "ALBLIC" ;
      edtAlbPdATCUD_Internalname = "ALBPDATCUD" ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      cmbAlbProAT.setInternalname( "ALBPROAT" );
      edtAlbFecSal_Internalname = "ALBFECSAL" ;
      edtAlbHorSal_Internalname = "ALBHORSAL" ;
      edtCliEmail_Internalname = "CLIEMAIL" ;
      edtAlbSec_Internalname = "ALBSEC" ;
      edtavTest_Internalname = "vTEST" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divCell_grid_dwc_Internalname = "CELL_GRID_DWC" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albprofchauxdate_Internalname = "vDDO_ALBPROFCHAUXDATE" ;
      divDdo_albprofchauxdates_Internalname = "DDO_ALBPROFCHAUXDATES" ;
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
      edtavTest_Jsonclick = "" ;
      edtavTest_Visible = 0 ;
      edtavTest_Enabled = 1 ;
      edtAlbSec_Jsonclick = "" ;
      edtCliEmail_Jsonclick = "" ;
      edtAlbHorSal_Jsonclick = "" ;
      edtAlbFecSal_Jsonclick = "" ;
      cmbAlbProAT.setJsonclick( "" );
      cmbAlbEnvFtp.setJsonclick( "" );
      edtAlbPdATCUD_Jsonclick = "" ;
      edtAlbLic_Jsonclick = "" ;
      cmbAlbMarca.setJsonclick( "" );
      cmbAlbProEst.setJsonclick( "" );
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCli_Jsonclick = "" ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProPri_Jsonclick = "" ;
      edtAlbProCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavAlbprofch_to_Jsonclick = "" ;
      edtavAlbprofch_to_Enabled = 1 ;
      edtavAlbprofch_Jsonclick = "" ;
      edtavAlbprofch_Enabled = 1 ;
      edtAlbPdATCUD_Visible = -1 ;
      edtAlbLic_Visible = -1 ;
      cmbAlbMarca.setVisible( -1 );
      cmbAlbProEst.setVisible( -1 );
      edtGuiRemCln_Visible = -1 ;
      edtGuiRemCli_Visible = -1 ;
      edtAlbProfch_Visible = -1 ;
      edtAlbProPri_Visible = -1 ;
      edtAlbProCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albprofchauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_grid_dwc_Class = "col-xs-12" ;
      Grid_empowerer_Fixedcolumns = ";L;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "Albaranes.Albaran__WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||||0:0 Pdte. Imprimir,1:1 Imprimido,2:2 Facturado|:Activo,A:Anulado||" ;
      Ddo_grid_Allowmultipleselection = "|||||T|T||" ;
      Ddo_grid_Datalisttype = "|Dynamic|||Dynamic|FixedValues|FixedValues|Dynamic|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|||T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "T|||T|||||" ;
      Ddo_grid_Filtertype = "Numeric|Character|Date|Numeric|Character|||Character|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|||T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "3:AlbProCod|4:AlbProPri|5:AlbProfch|6:GuiRemCli|7:GuiRemCln|8:AlbProEst|9:AlbMarca|10:AlbLic|11:AlbPdATCUD" ;
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
      Form.setCaption( httpContext.getMessage( " Albaranes", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_61_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV39GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV39GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridActions), 4, 0));
      }
      GXCCtl = "ALBPROEST_" + sGXsfl_61_idx ;
      cmbAlbProEst.setName( GXCCtl );
      cmbAlbProEst.setWebtags( "" );
      cmbAlbProEst.addItem("0", httpContext.getMessage( "0 Pdte. Imprimir", ""), (short)(0));
      cmbAlbProEst.addItem("1", httpContext.getMessage( "1 Imprimido", ""), (short)(0));
      cmbAlbProEst.addItem("2", httpContext.getMessage( "2 Facturado", ""), (short)(0));
      if ( cmbAlbProEst.getItemCount() > 0 )
      {
         A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
      }
      GXCCtl = "ALBMARCA_" + sGXsfl_61_idx ;
      cmbAlbMarca.setName( GXCCtl );
      cmbAlbMarca.setWebtags( "" );
      cmbAlbMarca.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbAlbMarca.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbAlbMarca.getItemCount() > 0 )
      {
         A5140AlbMarca = cmbAlbMarca.getValidValue(A5140AlbMarca) ;
      }
      GXCCtl = "ALBENVFTP_" + sGXsfl_61_idx ;
      cmbAlbEnvFtp.setName( GXCCtl );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
      }
      GXCCtl = "ALBPROAT_" + sGXsfl_61_idx ;
      cmbAlbProAT.setName( GXCCtl );
      cmbAlbProAT.setWebtags( "" );
      cmbAlbProAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
      cmbAlbProAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbAlbProAT.addItem("", httpContext.getMessage( "s/d", ""), (short)(0));
      if ( cmbAlbProAT.getItemCount() > 0 )
      {
         A10765AlbProAT = cmbAlbProAT.getValidValue(A10765AlbProAT) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV65ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV61ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV66AlbProfch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV84Okc',fld:'vOKC',pic:''},{av:'AV47GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV46AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV51Ok',fld:'vOK',pic:''},{av:'AV58FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV18TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV19TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV23TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV25TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV26TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV28TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV79TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV31TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV32TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV33TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV34TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV67OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74CCC',fld:'vCCC',pic:'ZZZ9',hsh:true},{av:'AV70Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV75PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV49ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'AV43UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV54ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV65ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV61ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'cmbAlbProEst'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'edtAlbPdATCUD_Visible',ctrl:'ALBPDATCUD',prop:'Visible'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV84Okc',fld:'vOKC',pic:''},{av:'AV47GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV63ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121XE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV66AlbProfch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV65ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV61ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV84Okc',fld:'vOKC',pic:''},{av:'AV47GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV46AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV51Ok',fld:'vOK',pic:''},{av:'AV58FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV18TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV19TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV23TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV25TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV26TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV28TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV79TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV31TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV32TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV33TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV34TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV67OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74CCC',fld:'vCCC',pic:'ZZZ9',hsh:true},{av:'AV70Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV75PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV49ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'AV43UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV54ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131XE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV66AlbProfch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV65ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV61ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV84Okc',fld:'vOKC',pic:''},{av:'AV47GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV46AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV51Ok',fld:'vOK',pic:''},{av:'AV58FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV18TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV19TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV23TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV25TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV26TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV28TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV79TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV31TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV32TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV33TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV34TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV67OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74CCC',fld:'vCCC',pic:'ZZZ9',hsh:true},{av:'AV70Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV75PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV49ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'AV43UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV54ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141XE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV66AlbProfch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV65ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV61ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV84Okc',fld:'vOKC',pic:''},{av:'AV47GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV46AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV51Ok',fld:'vOK',pic:''},{av:'AV58FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV18TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV19TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV23TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV25TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV26TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV28TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV79TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV31TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV32TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV33TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV34TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV67OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74CCC',fld:'vCCC',pic:'ZZZ9',hsh:true},{av:'AV70Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV75PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV49ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'AV43UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV54ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV67OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV33TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV34TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV31TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV32TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV78TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV79TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV27TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV28TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV25TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV26TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV23TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV19TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV17TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV18TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e191XE2',iparms:[{av:'AV74CCC',fld:'vCCC',pic:'ZZZ9',hsh:true},{av:'AV70Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV68DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'cmbavGridactions'},{av:'AV39GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV13Test',fld:'vTEST',pic:''},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151XE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV66AlbProfch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV65ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV61ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV84Okc',fld:'vOKC',pic:''},{av:'AV47GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV46AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV51Ok',fld:'vOK',pic:''},{av:'AV58FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV18TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV19TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV23TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV25TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV26TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV28TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV79TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV31TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV32TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV33TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV34TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV67OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74CCC',fld:'vCCC',pic:'ZZZ9',hsh:true},{av:'AV70Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV75PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV49ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'AV43UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV54ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV61ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV65ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'cmbAlbProEst'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'edtAlbPdATCUD_Visible',ctrl:'ALBPDATCUD',prop:'Visible'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV84Okc',fld:'vOKC',pic:''},{av:'AV47GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV63ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111XE2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV66AlbProfch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV65ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV61ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV84Okc',fld:'vOKC',pic:''},{av:'AV47GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV46AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV51Ok',fld:'vOK',pic:''},{av:'AV58FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV18TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV19TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV23TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV25TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV26TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV28TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV79TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV31TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV32TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV33TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV34TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV67OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74CCC',fld:'vCCC',pic:'ZZZ9',hsh:true},{av:'AV70Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV75PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV49ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'AV43UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV54ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV27TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV78TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV65ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV67OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV48AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV66AlbProfch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV18TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV19TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV23TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV25TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV26TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV28TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV79TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV31TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV32TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV33TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV34TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV78TFAlbMarca_SelsJson',fld:'vTFALBMARCA_SELSJSON',pic:''},{av:'AV27TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV61ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'cmbAlbProEst'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'edtAlbPdATCUD_Visible',ctrl:'ALBPDATCUD',prop:'Visible'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV84Okc',fld:'vOKC',pic:''},{av:'AV47GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV63ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e201XE2',iparms:[{av:'cmbavGridactions'},{av:'AV39GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV48AlbProfch',fld:'vALBPROFCH',pic:''},{av:'AV66AlbProfch_To',fld:'vALBPROFCH_TO',pic:''},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV65ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV61ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV84Okc',fld:'vOKC',pic:''},{av:'AV47GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV46AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV51Ok',fld:'vOK',pic:''},{av:'AV58FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFAlbProPri',fld:'vTFALBPROPRI',pic:'9'},{av:'AV18TFAlbProPri_Sel',fld:'vTFALBPROPRI_SEL',pic:'9'},{av:'AV19TFAlbProfch',fld:'vTFALBPROFCH',pic:''},{av:'AV23TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV24TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV25TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV26TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV28TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV79TFAlbMarca_Sels',fld:'vTFALBMARCA_SELS',pic:''},{av:'AV31TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV32TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV33TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV34TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV82Pgmname',fld:'vPGMNAME',pic:''},{av:'AV67OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV12OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV74CCC',fld:'vCCC',pic:'ZZZ9',hsh:true},{av:'AV70Carvitin',fld:'vCARVITIN',pic:'ZZZ9',hsh:true},{av:'AV75PwdGrl',fld:'vPWDGRL',pic:'ZZZ9',hsh:true},{av:'AV49ContVal',fld:'vCONTVAL',pic:'ZZZZZZZ9',hsh:true},{av:'AV43UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV54ImpCod',fld:'vIMPCOD',pic:'',hsh:true},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:'',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV39GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV51Ok',fld:'vOK',pic:''},{av:'AV46AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV84Okc',fld:'vOKC',pic:''},{av:'AV65ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV61ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbProCod_Visible',ctrl:'ALBPROCOD',prop:'Visible'},{av:'edtAlbProPri_Visible',ctrl:'ALBPROPRI',prop:'Visible'},{av:'edtAlbProfch_Visible',ctrl:'ALBPROFCH',prop:'Visible'},{av:'edtGuiRemCli_Visible',ctrl:'GUIREMCLI',prop:'Visible'},{av:'edtGuiRemCln_Visible',ctrl:'GUIREMCLN',prop:'Visible'},{av:'cmbAlbProEst'},{av:'cmbAlbMarca'},{av:'edtAlbLic_Visible',ctrl:'ALBLIC',prop:'Visible'},{av:'edtAlbPdATCUD_Visible',ctrl:'ALBPDATCUD',prop:'Visible'},{av:'AV37GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV38GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV47GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9',hsh:true},{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV63ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOINSERT'","{handler:'e161XE2',iparms:[{av:'AV41EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOINSERT'",",oparms:[]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e211XE2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'GRID_DWC'}]}");
      setEventMetadata("VALID_ALBPROCOD","{handler:'valid_Albprocod',iparms:[]");
      setEventMetadata("VALID_ALBPROCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBPROPRI","{handler:'valid_Albpropri',iparms:[]");
      setEventMetadata("VALID_ALBPROPRI",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLN","{handler:'valid_Guiremcln',iparms:[]");
      setEventMetadata("VALID_GUIREMCLN",",oparms:[]}");
      setEventMetadata("VALID_ALBPROEST","{handler:'valid_Albproest',iparms:[]");
      setEventMetadata("VALID_ALBPROEST",",oparms:[]}");
      setEventMetadata("VALID_ALBMARCA","{handler:'valid_Albmarca',iparms:[]");
      setEventMetadata("VALID_ALBMARCA",",oparms:[]}");
      setEventMetadata("VALID_ALBLIC","{handler:'valid_Alblic',iparms:[]");
      setEventMetadata("VALID_ALBLIC",",oparms:[]}");
      setEventMetadata("VALID_ALBPDATCUD","{handler:'valid_Albpdatcud',iparms:[]");
      setEventMetadata("VALID_ALBPDATCUD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Test',iparms:[]");
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
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV48AlbProfch = GXutil.nullDate() ;
      AV66AlbProfch_To = GXutil.nullDate() ;
      AV41EmprCod = "" ;
      AV61ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV84Okc = "" ;
      AV51Ok = "" ;
      AV58FilterFullText = "" ;
      AV17TFAlbProPri = "" ;
      AV18TFAlbProPri_Sel = "" ;
      AV19TFAlbProfch = GXutil.nullDate() ;
      AV25TFGuiRemCln = "" ;
      AV26TFGuiRemCln_Sel = "" ;
      AV28TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV79TFAlbMarca_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV31TFAlbLic = "" ;
      AV32TFAlbLic_Sel = "" ;
      AV33TFAlbPdATCUD = "" ;
      AV34TFAlbPdATCUD_Sel = "" ;
      AV82Pgmname = "" ;
      AV43UsurCod = "" ;
      AV54ImpCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV63ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV35DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV27TFAlbProEst_SelsJson = "" ;
      AV78TFAlbMarca_SelsJson = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtninsert_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      lblFiltertextalbprofch_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Grid_dwc_Component = "" ;
      OldGrid_dwc = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV21DDO_AlbProfchAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV68DetailWebComponent = "" ;
      A396EmprCod = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A1244GuiRemCln = "" ;
      A5140AlbMarca = "" ;
      A7101AlbLic = "" ;
      A14069AlbPdATCUD = "" ;
      A10765AlbProAT = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A3633CliEmail = "" ;
      A2242AlbSec = "" ;
      AV13Test = "" ;
      Gx_date = GXutil.nullDate() ;
      AV85Albaranes_albaran__wwds_1_filterfulltext = "" ;
      AV86Albaranes_albaran__wwds_2_albprofch = GXutil.nullDate() ;
      AV87Albaranes_albaran__wwds_3_albprofch_to = GXutil.nullDate() ;
      AV90Albaranes_albaran__wwds_6_tfalbpropri = "" ;
      AV91Albaranes_albaran__wwds_7_tfalbpropri_sel = "" ;
      AV92Albaranes_albaran__wwds_8_tfalbprofch = GXutil.nullDate() ;
      AV95Albaranes_albaran__wwds_11_tfguiremcln = "" ;
      AV96Albaranes_albaran__wwds_12_tfguiremcln_sel = "" ;
      AV97Albaranes_albaran__wwds_13_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV98Albaranes_albaran__wwds_14_tfalbmarca_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV99Albaranes_albaran__wwds_15_tfalblic = "" ;
      AV100Albaranes_albaran__wwds_16_tfalblic_sel = "" ;
      AV101Albaranes_albaran__wwds_17_tfalbpdatcud = "" ;
      AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel = "" ;
      scmdbuf = "" ;
      lV85Albaranes_albaran__wwds_1_filterfulltext = "" ;
      lV90Albaranes_albaran__wwds_6_tfalbpropri = "" ;
      lV95Albaranes_albaran__wwds_11_tfguiremcln = "" ;
      lV99Albaranes_albaran__wwds_15_tfalblic = "" ;
      lV101Albaranes_albaran__wwds_17_tfalbpdatcud = "" ;
      H01XE2_A1253EmprGuiRem = new String[] {""} ;
      H01XE2_A5141AlbIvaCod = new String[] {""} ;
      H01XE2_A2242AlbSec = new String[] {""} ;
      H01XE2_A3633CliEmail = new String[] {""} ;
      H01XE2_n3633CliEmail = new boolean[] {false} ;
      H01XE2_A3865AlbHorSal = new String[] {""} ;
      H01XE2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H01XE2_A10765AlbProAT = new String[] {""} ;
      H01XE2_A5805AlbEnvFtp = new byte[1] ;
      H01XE2_A14069AlbPdATCUD = new String[] {""} ;
      H01XE2_A7101AlbLic = new String[] {""} ;
      H01XE2_A5140AlbMarca = new String[] {""} ;
      H01XE2_A33AlbProEst = new byte[1] ;
      H01XE2_A1244GuiRemCln = new String[] {""} ;
      H01XE2_A1243GuiRemCli = new int[1] ;
      H01XE2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01XE2_A39AlbProPri = new String[] {""} ;
      H01XE2_A30AlbProCod = new long[1] ;
      H01XE2_A396EmprCod = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      A5141AlbIvaCod = "" ;
      H01XE3_A1253EmprGuiRem = new String[] {""} ;
      H01XE3_A5141AlbIvaCod = new String[] {""} ;
      H01XE3_A2242AlbSec = new String[] {""} ;
      H01XE3_A3633CliEmail = new String[] {""} ;
      H01XE3_n3633CliEmail = new boolean[] {false} ;
      H01XE3_A3865AlbHorSal = new String[] {""} ;
      H01XE3_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H01XE3_A10765AlbProAT = new String[] {""} ;
      H01XE3_A5805AlbEnvFtp = new byte[1] ;
      H01XE3_A14069AlbPdATCUD = new String[] {""} ;
      H01XE3_A7101AlbLic = new String[] {""} ;
      H01XE3_A5140AlbMarca = new String[] {""} ;
      H01XE3_A33AlbProEst = new byte[1] ;
      H01XE3_A1244GuiRemCln = new String[] {""} ;
      H01XE3_A1243GuiRemCli = new int[1] ;
      H01XE3_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H01XE3_A39AlbProPri = new String[] {""} ;
      H01XE3_A30AlbProCod = new long[1] ;
      H01XE3_A396EmprCod = new String[] {""} ;
      hsh = "" ;
      AV40Station = "" ;
      AV42EmprNom = "" ;
      AV44Albsec = "" ;
      AV45ContCod = "" ;
      AV7HTTPRequest = httpContext.getHttpRequest();
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXv_int7 = new byte[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV14Session = httpContext.getWebSession();
      AV59ColumnsSelectorXML = "" ;
      GXv_int10 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV64ManageFiltersXml = "" ;
      AV60UserCustomValue = "" ;
      AV62ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV55Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message23 = new GXBaseCollection[1] ;
      AV56Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      lblAlbprofch_rangemiddletext_Jsonclick = "" ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.albaranes.albaran__ww__default(),
         new Object[] {
             new Object[] {
            H01XE2_A1253EmprGuiRem, H01XE2_A5141AlbIvaCod, H01XE2_A2242AlbSec, H01XE2_A3633CliEmail, H01XE2_n3633CliEmail, H01XE2_A3865AlbHorSal, H01XE2_A4023AlbFecSal, H01XE2_A10765AlbProAT, H01XE2_A5805AlbEnvFtp, H01XE2_A14069AlbPdATCUD,
            H01XE2_A7101AlbLic, H01XE2_A5140AlbMarca, H01XE2_A33AlbProEst, H01XE2_A1244GuiRemCln, H01XE2_A1243GuiRemCli, H01XE2_A34AlbProfch, H01XE2_A39AlbProPri, H01XE2_A30AlbProCod, H01XE2_A396EmprCod
            }
            , new Object[] {
            H01XE3_A1253EmprGuiRem, H01XE3_A5141AlbIvaCod, H01XE3_A2242AlbSec, H01XE3_A3633CliEmail, H01XE3_n3633CliEmail, H01XE3_A3865AlbHorSal, H01XE3_A4023AlbFecSal, H01XE3_A10765AlbProAT, H01XE3_A5805AlbEnvFtp, H01XE3_A14069AlbPdATCUD,
            H01XE3_A7101AlbLic, H01XE3_A5140AlbMarca, H01XE3_A33AlbProEst, H01XE3_A1244GuiRemCln, H01XE3_A1243GuiRemCli, H01XE3_A34AlbProfch, H01XE3_A39AlbProPri, H01XE3_A30AlbProCod, H01XE3_A396EmprCod
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV82Pgmname = "Albaranes.Albaran__WW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV82Pgmname = "Albaranes.Albaran__WW" ;
      Gx_err = (short)(0) ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavTest_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Grid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV65ManageFiltersExecutionStep ;
   private byte gxajaxcallmode ;
   private byte A33AlbProEst ;
   private byte A5805AlbEnvFtp ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV69F_tinamar ;
   private byte GXt_int8 ;
   private byte GXv_int7[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV67OrderedBy ;
   private short AV74CCC ;
   private short AV70Carvitin ;
   private short AV75PwdGrl ;
   private short wbEnd ;
   private short wbStart ;
   private short AV39GridActions ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV77F_carvema ;
   private short AV71Erfoc ;
   private short AV72Etm ;
   private short AV73Artemalha ;
   private short AV76PdfGx16 ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_61 ;
   private int nGXsfl_61_idx=1 ;
   private int AV47GuiRemCli ;
   private int AV23TFGuiRemCli ;
   private int AV24TFGuiRemCli_To ;
   private int AV49ContVal ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A1243GuiRemCli ;
   private int subGrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavTest_Enabled ;
   private int AV93Albaranes_albaran__wwds_9_tfguiremcli ;
   private int AV94Albaranes_albaran__wwds_10_tfguiremcli_to ;
   private int AV97Albaranes_albaran__wwds_13_tfalbproest_sels_size ;
   private int AV98Albaranes_albaran__wwds_14_tfalbmarca_sels_size ;
   private int GXt_int9 ;
   private int edtAlbProCod_Visible ;
   private int edtAlbProPri_Visible ;
   private int edtAlbProfch_Visible ;
   private int edtGuiRemCli_Visible ;
   private int edtGuiRemCln_Visible ;
   private int edtAlbLic_Visible ;
   private int edtAlbPdATCUD_Visible ;
   private int AV36PageToGo ;
   private int GXv_int10[] ;
   private int AV103GXV1 ;
   private int AV104GXV2 ;
   private int edtavAlbprofch_Enabled ;
   private int edtavAlbprofch_to_Enabled ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavTest_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV46AlbProCod ;
   private long AV15TFAlbProCod ;
   private long AV16TFAlbProCod_To ;
   private long AV37GridCurrentPage ;
   private long AV38GridPageCount ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long AV88Albaranes_albaran__wwds_4_tfalbprocod ;
   private long AV89Albaranes_albaran__wwds_5_tfalbprocod_to ;
   private long GRID_nRecordCount ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_61_idx="0001" ;
   private String AV41EmprCod ;
   private String AV84Okc ;
   private String AV51Ok ;
   private String AV17TFAlbProPri ;
   private String AV18TFAlbProPri_Sel ;
   private String AV25TFGuiRemCln ;
   private String AV26TFGuiRemCln_Sel ;
   private String AV31TFAlbLic ;
   private String AV32TFAlbLic_Sel ;
   private String AV33TFAlbPdATCUD ;
   private String AV34TFAlbPdATCUD_Sel ;
   private String AV82Pgmname ;
   private String AV43UsurCod ;
   private String AV54ImpCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Allowmultipleselection ;
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divTablesplittedfiltertextalbprofch_Internalname ;
   private String lblFiltertextalbprofch_Internalname ;
   private String lblFiltertextalbprofch_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divCell_grid_dwc_Internalname ;
   private String divCell_grid_dwc_Class ;
   private String WebComp_Grid_dwc_Component ;
   private String OldGrid_dwc ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_albprofchauxdates_Internalname ;
   private String edtavDdo_albprofchauxdate_Internalname ;
   private String edtavDdo_albprofchauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV68DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtAlbProCod_Internalname ;
   private String A39AlbProPri ;
   private String edtAlbProPri_Internalname ;
   private String edtAlbProfch_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Internalname ;
   private String A5140AlbMarca ;
   private String A7101AlbLic ;
   private String edtAlbLic_Internalname ;
   private String A14069AlbPdATCUD ;
   private String edtAlbPdATCUD_Internalname ;
   private String A10765AlbProAT ;
   private String edtAlbFecSal_Internalname ;
   private String A3865AlbHorSal ;
   private String edtAlbHorSal_Internalname ;
   private String A3633CliEmail ;
   private String edtCliEmail_Internalname ;
   private String A2242AlbSec ;
   private String edtAlbSec_Internalname ;
   private String AV13Test ;
   private String edtavTest_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String AV90Albaranes_albaran__wwds_6_tfalbpropri ;
   private String AV91Albaranes_albaran__wwds_7_tfalbpropri_sel ;
   private String AV95Albaranes_albaran__wwds_11_tfguiremcln ;
   private String AV96Albaranes_albaran__wwds_12_tfguiremcln_sel ;
   private String AV99Albaranes_albaran__wwds_15_tfalblic ;
   private String AV100Albaranes_albaran__wwds_16_tfalblic_sel ;
   private String AV101Albaranes_albaran__wwds_17_tfalbpdatcud ;
   private String AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel ;
   private String scmdbuf ;
   private String lV90Albaranes_albaran__wwds_6_tfalbpropri ;
   private String lV95Albaranes_albaran__wwds_11_tfguiremcln ;
   private String lV99Albaranes_albaran__wwds_15_tfalblic ;
   private String lV101Albaranes_albaran__wwds_17_tfalbpdatcud ;
   private String A1253EmprGuiRem ;
   private String A5141AlbIvaCod ;
   private String edtavAlbprofch_Internalname ;
   private String edtavAlbprofch_to_Internalname ;
   private String hsh ;
   private String AV40Station ;
   private String AV42EmprNom ;
   private String AV44Albsec ;
   private String AV45ContCod ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char17 ;
   private String GXv_char4[] ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String tblTablemergedalbprofch_Internalname ;
   private String edtavAlbprofch_Jsonclick ;
   private String lblAlbprofch_rangemiddletext_Internalname ;
   private String lblAlbprofch_rangemiddletext_Jsonclick ;
   private String edtavAlbprofch_to_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sGXsfl_61_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String GXCCtl ;
   private String edtEmprCod_Jsonclick ;
   private String edtAlbProCod_Jsonclick ;
   private String edtAlbProPri_Jsonclick ;
   private String edtAlbProfch_Jsonclick ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbLic_Jsonclick ;
   private String edtAlbPdATCUD_Jsonclick ;
   private String edtAlbFecSal_Jsonclick ;
   private String edtAlbHorSal_Jsonclick ;
   private String edtCliEmail_Jsonclick ;
   private String edtAlbSec_Jsonclick ;
   private String edtavTest_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV48AlbProfch ;
   private java.util.Date AV66AlbProfch_To ;
   private java.util.Date AV19TFAlbProfch ;
   private java.util.Date AV21DDO_AlbProfchAuxDate ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date Gx_date ;
   private java.util.Date AV86Albaranes_albaran__wwds_2_albprofch ;
   private java.util.Date AV87Albaranes_albaran__wwds_3_albprofch_to ;
   private java.util.Date AV92Albaranes_albaran__wwds_8_tfalbprofch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV12OrderedDsc ;
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
   private boolean bGXsfl_61_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n3633CliEmail ;
   private boolean AV52isAnulado ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV27TFAlbProEst_SelsJson ;
   private String AV78TFAlbMarca_SelsJson ;
   private String AV59ColumnsSelectorXML ;
   private String AV64ManageFiltersXml ;
   private String AV60UserCustomValue ;
   private String AV58FilterFullText ;
   private String AV85Albaranes_albaran__wwds_1_filterfulltext ;
   private String lV85Albaranes_albaran__wwds_1_filterfulltext ;
   private GXSimpleCollection<Byte> AV28TFAlbProEst_Sels ;
   private GXSimpleCollection<Byte> AV97Albaranes_albaran__wwds_13_tfalbproest_sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Grid_dwc ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbProEst ;
   private HTMLChoice cmbAlbMarca ;
   private HTMLChoice cmbAlbEnvFtp ;
   private HTMLChoice cmbAlbProAT ;
   private IDataStoreProvider pr_default ;
   private String[] H01XE2_A1253EmprGuiRem ;
   private String[] H01XE2_A5141AlbIvaCod ;
   private String[] H01XE2_A2242AlbSec ;
   private String[] H01XE2_A3633CliEmail ;
   private boolean[] H01XE2_n3633CliEmail ;
   private String[] H01XE2_A3865AlbHorSal ;
   private java.util.Date[] H01XE2_A4023AlbFecSal ;
   private String[] H01XE2_A10765AlbProAT ;
   private byte[] H01XE2_A5805AlbEnvFtp ;
   private String[] H01XE2_A14069AlbPdATCUD ;
   private String[] H01XE2_A7101AlbLic ;
   private String[] H01XE2_A5140AlbMarca ;
   private byte[] H01XE2_A33AlbProEst ;
   private String[] H01XE2_A1244GuiRemCln ;
   private int[] H01XE2_A1243GuiRemCli ;
   private java.util.Date[] H01XE2_A34AlbProfch ;
   private String[] H01XE2_A39AlbProPri ;
   private long[] H01XE2_A30AlbProCod ;
   private String[] H01XE2_A396EmprCod ;
   private String[] H01XE3_A1253EmprGuiRem ;
   private String[] H01XE3_A5141AlbIvaCod ;
   private String[] H01XE3_A2242AlbSec ;
   private String[] H01XE3_A3633CliEmail ;
   private boolean[] H01XE3_n3633CliEmail ;
   private String[] H01XE3_A3865AlbHorSal ;
   private java.util.Date[] H01XE3_A4023AlbFecSal ;
   private String[] H01XE3_A10765AlbProAT ;
   private byte[] H01XE3_A5805AlbEnvFtp ;
   private String[] H01XE3_A14069AlbPdATCUD ;
   private String[] H01XE3_A7101AlbLic ;
   private String[] H01XE3_A5140AlbMarca ;
   private byte[] H01XE3_A33AlbProEst ;
   private String[] H01XE3_A1244GuiRemCln ;
   private int[] H01XE3_A1243GuiRemCli ;
   private java.util.Date[] H01XE3_A34AlbProfch ;
   private String[] H01XE3_A39AlbProPri ;
   private long[] H01XE3_A30AlbProCod ;
   private String[] H01XE3_A396EmprCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV79TFAlbMarca_Sels ;
   private GXSimpleCollection<String> AV98Albaranes_albaran__wwds_14_tfalbmarca_sels ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV55Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message23[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV63ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private com.genexus.SdtMessages_Message AV56Message ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV35DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV61ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV62ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
}

final  class albaran__ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01XE2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV97Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV98Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                          java.util.Date AV86Albaranes_albaran__wwds_2_albprofch ,
                                          java.util.Date AV87Albaranes_albaran__wwds_3_albprofch_to ,
                                          long AV88Albaranes_albaran__wwds_4_tfalbprocod ,
                                          long AV89Albaranes_albaran__wwds_5_tfalbprocod_to ,
                                          String AV91Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                          String AV90Albaranes_albaran__wwds_6_tfalbpropri ,
                                          java.util.Date AV92Albaranes_albaran__wwds_8_tfalbprofch ,
                                          int AV93Albaranes_albaran__wwds_9_tfguiremcli ,
                                          int AV94Albaranes_albaran__wwds_10_tfguiremcli_to ,
                                          String AV96Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                          String AV95Albaranes_albaran__wwds_11_tfguiremcln ,
                                          int AV97Albaranes_albaran__wwds_13_tfalbproest_sels_size ,
                                          int AV98Albaranes_albaran__wwds_14_tfalbmarca_sels_size ,
                                          String AV100Albaranes_albaran__wwds_16_tfalblic_sel ,
                                          String AV99Albaranes_albaran__wwds_15_tfalblic ,
                                          String AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                          String AV101Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                          boolean AV52isAnulado ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          short AV67OrderedBy ,
                                          boolean AV12OrderedDsc ,
                                          String AV85Albaranes_albaran__wwds_1_filterfulltext ,
                                          String AV41EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[16];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbIvaCod, T1.AlbSec, T2.CliEmail, T1.AlbHorSal, T1.AlbFecSal, T1.AlbProAT, T1.AlbEnvFtp, T1.AlbPdATCUD, T1.AlbLic, T1.AlbMarca," ;
      scmdbuf += " T1.AlbProEst, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch, T1.AlbProPri, T1.AlbProCod, T1.EmprCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Albaranes_albaran__wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int24[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Albaranes_albaran__wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int24[2] = (byte)(1) ;
      }
      if ( ! (0==AV88Albaranes_albaran__wwds_4_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int24[3] = (byte)(1) ;
      }
      if ( ! (0==AV89Albaranes_albaran__wwds_5_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int24[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV90Albaranes_albaran__wwds_6_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int24[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Albaranes_albaran__wwds_8_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int24[7] = (byte)(1) ;
      }
      if ( ! (0==AV93Albaranes_albaran__wwds_9_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int24[8] = (byte)(1) ;
      }
      if ( ! (0==AV94Albaranes_albaran__wwds_10_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int24[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV95Albaranes_albaran__wwds_11_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int24[11] = (byte)(1) ;
      }
      if ( AV97Albaranes_albaran__wwds_13_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Albaranes_albaran__wwds_13_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( AV98Albaranes_albaran__wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Albaranes_albaran__wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Albaranes_albaran__wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV99Albaranes_albaran__wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Albaranes_albaran__wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV101Albaranes_albaran__wwds_17_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( AV52isAnulado )
      {
         addWhere(sWhereString, "(T1.AlbMarca = 'A')");
      }
      scmdbuf += sWhereString ;
      if ( AV67OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.AlbIvaCod" ;
      }
      else if ( ( AV67OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV67OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV67OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProPri" ;
      }
      else if ( ( AV67OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProPri DESC" ;
      }
      else if ( ( AV67OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProfch" ;
      }
      else if ( ( AV67OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProfch DESC" ;
      }
      else if ( ( AV67OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli" ;
      }
      else if ( ( AV67OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli DESC" ;
      }
      else if ( ( AV67OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV67OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV67OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProEst" ;
      }
      else if ( ( AV67OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProEst DESC" ;
      }
      else if ( ( AV67OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbMarca" ;
      }
      else if ( ( AV67OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbMarca DESC" ;
      }
      else if ( ( AV67OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbLic" ;
      }
      else if ( ( AV67OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbLic DESC" ;
      }
      else if ( ( AV67OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbPdATCUD" ;
      }
      else if ( ( AV67OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbPdATCUD DESC" ;
      }
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
   }

   protected Object[] conditional_H01XE3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV97Albaranes_albaran__wwds_13_tfalbproest_sels ,
                                          String A5140AlbMarca ,
                                          GXSimpleCollection<String> AV98Albaranes_albaran__wwds_14_tfalbmarca_sels ,
                                          java.util.Date AV86Albaranes_albaran__wwds_2_albprofch ,
                                          java.util.Date AV87Albaranes_albaran__wwds_3_albprofch_to ,
                                          long AV88Albaranes_albaran__wwds_4_tfalbprocod ,
                                          long AV89Albaranes_albaran__wwds_5_tfalbprocod_to ,
                                          String AV91Albaranes_albaran__wwds_7_tfalbpropri_sel ,
                                          String AV90Albaranes_albaran__wwds_6_tfalbpropri ,
                                          java.util.Date AV92Albaranes_albaran__wwds_8_tfalbprofch ,
                                          int AV93Albaranes_albaran__wwds_9_tfguiremcli ,
                                          int AV94Albaranes_albaran__wwds_10_tfguiremcli_to ,
                                          String AV96Albaranes_albaran__wwds_12_tfguiremcln_sel ,
                                          String AV95Albaranes_albaran__wwds_11_tfguiremcln ,
                                          int AV97Albaranes_albaran__wwds_13_tfalbproest_sels_size ,
                                          int AV98Albaranes_albaran__wwds_14_tfalbmarca_sels_size ,
                                          String AV100Albaranes_albaran__wwds_16_tfalblic_sel ,
                                          String AV99Albaranes_albaran__wwds_15_tfalblic ,
                                          String AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel ,
                                          String AV101Albaranes_albaran__wwds_17_tfalbpdatcud ,
                                          boolean AV52isAnulado ,
                                          java.util.Date A34AlbProfch ,
                                          long A30AlbProCod ,
                                          String A39AlbProPri ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          short AV67OrderedBy ,
                                          boolean AV12OrderedDsc ,
                                          String AV85Albaranes_albaran__wwds_1_filterfulltext ,
                                          String AV41EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int27 = new byte[16];
      Object[] GXv_Object28 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbIvaCod, T1.AlbSec, T2.CliEmail, T1.AlbHorSal, T1.AlbFecSal, T1.AlbProAT, T1.AlbEnvFtp, T1.AlbPdATCUD, T1.AlbLic, T1.AlbMarca," ;
      scmdbuf += " T1.AlbProEst, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch, T1.AlbProPri, T1.AlbProCod, T1.EmprCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2" ;
      scmdbuf += " ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV86Albaranes_albaran__wwds_2_albprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int27[1] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV87Albaranes_albaran__wwds_3_albprofch_to)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int27[2] = (byte)(1) ;
      }
      if ( ! (0==AV88Albaranes_albaran__wwds_4_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int27[3] = (byte)(1) ;
      }
      if ( ! (0==AV89Albaranes_albaran__wwds_5_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int27[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV91Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) && ( ! (GXutil.strcmp("", AV90Albaranes_albaran__wwds_6_tfalbpropri)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbProPri) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV91Albaranes_albaran__wwds_7_tfalbpropri_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbProPri = ?)");
      }
      else
      {
         GXv_int27[6] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV92Albaranes_albaran__wwds_8_tfalbprofch)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int27[7] = (byte)(1) ;
      }
      if ( ! (0==AV93Albaranes_albaran__wwds_9_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int27[8] = (byte)(1) ;
      }
      if ( ! (0==AV94Albaranes_albaran__wwds_10_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int27[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV96Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV95Albaranes_albaran__wwds_11_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV96Albaranes_albaran__wwds_12_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int27[11] = (byte)(1) ;
      }
      if ( AV97Albaranes_albaran__wwds_13_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV97Albaranes_albaran__wwds_13_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( AV98Albaranes_albaran__wwds_14_tfalbmarca_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV98Albaranes_albaran__wwds_14_tfalbmarca_sels, "T1.AlbMarca IN (", ")")+")");
      }
      if ( (GXutil.strcmp("", AV100Albaranes_albaran__wwds_16_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV99Albaranes_albaran__wwds_15_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Albaranes_albaran__wwds_16_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int27[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV101Albaranes_albaran__wwds_17_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int27[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Albaranes_albaran__wwds_18_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int27[15] = (byte)(1) ;
      }
      if ( AV52isAnulado )
      {
         addWhere(sWhereString, "(T1.AlbMarca = 'A')");
      }
      scmdbuf += sWhereString ;
      if ( AV67OrderedBy == 1 )
      {
         scmdbuf += " ORDER BY T1.AlbIvaCod" ;
      }
      else if ( ( AV67OrderedBy == 2 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV67OrderedBy == 2 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV67OrderedBy == 3 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProPri" ;
      }
      else if ( ( AV67OrderedBy == 3 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProPri DESC" ;
      }
      else if ( ( AV67OrderedBy == 4 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProfch" ;
      }
      else if ( ( AV67OrderedBy == 4 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProfch DESC" ;
      }
      else if ( ( AV67OrderedBy == 5 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli" ;
      }
      else if ( ( AV67OrderedBy == 5 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.GuiRemCli DESC" ;
      }
      else if ( ( AV67OrderedBy == 6 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV67OrderedBy == 6 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV67OrderedBy == 7 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbProEst" ;
      }
      else if ( ( AV67OrderedBy == 7 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbProEst DESC" ;
      }
      else if ( ( AV67OrderedBy == 8 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbMarca" ;
      }
      else if ( ( AV67OrderedBy == 8 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbMarca DESC" ;
      }
      else if ( ( AV67OrderedBy == 9 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbLic" ;
      }
      else if ( ( AV67OrderedBy == 9 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbLic DESC" ;
      }
      else if ( ( AV67OrderedBy == 10 ) && ! AV12OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.AlbPdATCUD" ;
      }
      else if ( ( AV67OrderedBy == 10 ) && ( AV12OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.AlbPdATCUD DESC" ;
      }
      GXv_Object28[0] = scmdbuf ;
      GXv_Object28[1] = GXv_int27 ;
      return GXv_Object28 ;
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
                  return conditional_H01XE2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Boolean) dynConstraints[21]).booleanValue() , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).longValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
            case 1 :
                  return conditional_H01XE3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , (String)dynConstraints[2] , (GXSimpleCollection<String>)dynConstraints[3] , (java.util.Date)dynConstraints[4] , (java.util.Date)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.util.Date)dynConstraints[10] , ((Number) dynConstraints[11]).intValue() , ((Number) dynConstraints[12]).intValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Boolean) dynConstraints[21]).booleanValue() , (java.util.Date)dynConstraints[22] , ((Number) dynConstraints[23]).longValue() , (String)dynConstraints[24] , ((Number) dynConstraints[25]).intValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , ((Number) dynConstraints[29]).shortValue() , ((Boolean) dynConstraints[30]).booleanValue() , (String)dynConstraints[31] , (String)dynConstraints[32] , (String)dynConstraints[33] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01XE2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01XE3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 3);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 40);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getString(5, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((byte[]) buf[8])[0] = rslt.getByte(8);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((String[]) buf[10])[0] = rslt.getString(10, 20);
               ((String[]) buf[11])[0] = rslt.getString(11, 1);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDate(15);
               ((String[]) buf[16])[0] = rslt.getString(16, 1);
               ((long[]) buf[17])[0] = rslt.getLong(17);
               ((String[]) buf[18])[0] = rslt.getString(18, 3);
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
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[17]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[18]);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[19]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 1);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[23]);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[24]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[25]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 30);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 20);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 20);
               }
               return;
      }
   }

}

