package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class generarjobremessa_impl extends GXDataArea
{
   public generarjobremessa_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public generarjobremessa_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generarjobremessa_impl.class ));
   }

   public generarjobremessa_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void executeCmdLine( String args[] )
   {
      nGotPars = 1 ;
      webExecute();
   }

   protected void createObjects( )
   {
      cmbavF_header = new HTMLChoice();
      cmbavPrio = new HTMLChoice();
      chkavMail = UIFactory.getCheckbox(this);
      chkavManaut = UIFactory.getCheckbox(this);
      chkavOpi = UIFactory.getCheckbox(this);
      cmbavGridactiongroup1 = new HTMLChoice();
      cmbJobStat = new HTMLChoice();
      chkavVermail = UIFactory.getCheckbox(this);
      cmbavVersumlin = new HTMLChoice();
      cmbavAlbmarca = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Listjobgrid") == 0 )
         {
            gxnrlistjobgrid_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Listjobgrid") == 0 )
         {
            gxgrlistjobgrid_refresh_invoke( ) ;
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

   public void gxnrlistjobgrid_newrow_invoke( )
   {
      nRC_GXsfl_135 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_135"))) ;
      nGXsfl_135_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_135_idx"))) ;
      sGXsfl_135_idx = httpContext.GetPar( "sGXsfl_135_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrlistjobgrid_newrow( ) ;
      /* End function gxnrListjobgrid_newrow_invoke */
   }

   public void gxgrlistjobgrid_refresh_invoke( )
   {
      subListjobgrid_Rows = (int)(GXutil.lval( httpContext.GetPar( "subListjobgrid_Rows"))) ;
      AV79PrgPct = (short)(GXutil.lval( httpContext.GetPar( "PrgPct"))) ;
      AV77i = (short)(GXutil.lval( httpContext.GetPar( "i"))) ;
      AV33Mail = httpContext.GetPar( "Mail") ;
      AV34ManAut = httpContext.GetPar( "ManAut") ;
      AV37Opi = httpContext.GetPar( "Opi") ;
      AV51VerMail = GXutil.strtobool( httpContext.GetPar( "VerMail")) ;
      AV41PATHTEMP = httpContext.GetPar( "PATHTEMP") ;
      AV40PATHPDF = httpContext.GetPar( "PATHPDF") ;
      AV112Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV79PrgPct, AV77i, AV33Mail, AV34ManAut, AV37Opi, AV51VerMail, AV41PATHTEMP, AV40PATHPDF, AV112Pgmname) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrListjobgrid_refresh_invoke */
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
      pa2DN2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2DN2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.generarjobremessa", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHTEMP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41PATHTEMP, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"GenerarJobRemessa");
      forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV40PATHPDF, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV112Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\generarjobremessa:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_135", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_135, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV8CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV8CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV10CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV10CliCodto_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLISTPRINTER_DATA", AV31ListPrinter_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLISTPRINTER_DATA", AV31ListPrinter_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vLISTJOBGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV64ListJobGridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV77i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DOCID", GXutil.ltrim( localUtil.ntoc( A14470DocId, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV102AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMCLI", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMCLN", GXutil.rtrim( A1244GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMMF", GXutil.rtrim( A14561GuiRemmf));
      app.GxWebStd.gx_hidden_field( httpContext, "vJOBID_SELECTED", AV81JobId_Selected.toString());
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV49UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRI", GXutil.rtrim( A39AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROFCH", localUtil.dtoc( A34AlbProfch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROEST", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHTEMP", AV41PATHTEMP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHTEMP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41PATHTEMP, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vNOTIFICATIONINFO", AV70NotificationInfo);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vNOTIFICATIONINFO", AV70NotificationInfo);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vASYNC_JOBID", AV71Async_JobId.toString());
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nEOF", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Cls", GXutil.rtrim( Combo_listprinter_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedvalue_set", GXutil.rtrim( Combo_listprinter_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedtext_set", GXutil.rtrim( Combo_listprinter_Selectedtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Visible", GXutil.booltostr( Combo_listprinter_Visible));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Emptyitem", GXutil.booltostr( Combo_listprinter_Emptyitem));
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
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Class", GXutil.rtrim( Listjobgridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Listjobgridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Listjobgridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Listjobgridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Listjobgridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Listjobgridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Listjobgridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Listjobgridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Listjobgridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Listjobgridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Previous", GXutil.rtrim( Listjobgridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Next", GXutil.rtrim( Listjobgridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Caption", GXutil.rtrim( Listjobgridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Listjobgridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Listjobgridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Width", GXutil.rtrim( Dvpanel_panelwccomponent_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Autowidth", GXutil.booltostr( Dvpanel_panelwccomponent_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Autoheight", GXutil.booltostr( Dvpanel_panelwccomponent_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Cls", GXutil.rtrim( Dvpanel_panelwccomponent_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Title", GXutil.rtrim( Dvpanel_panelwccomponent_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Collapsible", GXutil.booltostr( Dvpanel_panelwccomponent_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Collapsed", GXutil.booltostr( Dvpanel_panelwccomponent_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Showcollapseicon", GXutil.booltostr( Dvpanel_panelwccomponent_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Iconposition", GXutil.rtrim( Dvpanel_panelwccomponent_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANELWCCOMPONENT_Autoscroll", GXutil.booltostr( Dvpanel_panelwccomponent_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DATAMONJS_Paramstr", GXutil.rtrim( Datamonjs_Paramstr));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Gridinternalname", GXutil.rtrim( Popover_jobdesc_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Iteminternalname", GXutil.rtrim( Popover_jobdesc_Iteminternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Isgriditem", GXutil.booltostr( Popover_jobdesc_Isgriditem));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Trigger", GXutil.rtrim( Popover_jobdesc_Trigger));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Popoverwidth", GXutil.ltrim( localUtil.ntoc( Popover_jobdesc_Popoverwidth, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "POPOVER_JOBDESC_Position", GXutil.rtrim( Popover_jobdesc_Position));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Title", GXutil.rtrim( Dvelop_confirmpanel_deleted_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_deleted_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_deleted_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_deleted_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_deleted_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_deleted_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_deleted_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Listjobgrid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_EMPOWERER_Popoversingrid", GXutil.rtrim( Listjobgrid_empowerer_Popoversingrid));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Listjobgridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Result", GXutil.rtrim( Dvelop_confirmpanel_deleted_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_LISTPRINTER_Selectedvalue_get", GXutil.rtrim( Combo_listprinter_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOTIFICATIONINFO_Id", GXutil.rtrim( AV70NotificationInfo.getgxTv_SdtNotificationInfo_Id()));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Listjobgridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Listjobgridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_DELETED_Result", GXutil.rtrim( Dvelop_confirmpanel_deleted_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
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
      if ( ! ( WebComp_Listjobgrid_dwc == null ) )
      {
         WebComp_Listjobgrid_dwc.componentjscripts();
      }
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
         we2DN2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2DN2( ) ;
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
      return formatLink("app.facturacion.generarjobremessa", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.GenerarJobRemessa" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Impresion Guia Remessa", "") ;
   }

   public void wb2DN0( )
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodfrom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\GenerarJobRemessa.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV8CliCodfrom_Data);
         ucCombo_clicodfrom.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodfrom_Internalname, "COMBO_CLICODFROMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedclicodto_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\GenerarJobRemessa.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV10CliCodto_Data);
         ucCombo_clicodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodto_Internalname, "COMBO_CLICODTOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchfrom_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchfrom_Internalname, localUtil.format(AV99AlbProfchfrom, "99/99/99"), localUtil.format( AV99AlbProfchfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchto_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchto_Internalname, localUtil.format(AV100AlbProfchto, "99/99/99"), localUtil.format( AV100AlbProfchto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocodfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocodfrom_Internalname, httpContext.getMessage( "Nº Documento Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV96AlbProCodfrom, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV96AlbProCodfrom), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV96AlbProCodfrom), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocodfrom_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocodto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocodto_Internalname, httpContext.getMessage( "Nº Documento Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV97AlbProCodto, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV97AlbProCodto), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV97AlbProCodto), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocodto_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCopias2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCopias2_Internalname, httpContext.getMessage( "Nº Copias", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCopias2_Internalname, GXutil.ltrim( localUtil.ntoc( AV13Copias2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCopias2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13Copias2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13Copias2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCopias2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCopias2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavF_header.getInternalname()+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavF_header, cmbavF_header.getInternalname(), GXutil.trim( GXutil.str( AV18F_header, 1, 0)), 1, cmbavF_header.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavF_header.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,79);\"", "", true, (byte)(0), "HLP_Facturacion\\GenerarJobRemessa.htm");
         cmbavF_header.setValue( GXutil.trim( GXutil.str( AV18F_header, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavF_header.getInternalname(), "Values", cmbavF_header.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavPrio.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavPrio.getInternalname(), httpContext.getMessage( "Tipo de Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPrio, cmbavPrio.getInternalname(), GXutil.rtrim( AV42PRIO), 1, cmbavPrio.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavPrio.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,87);\"", "", true, (byte)(0), "HLP_Facturacion\\GenerarJobRemessa.htm");
         cmbavPrio.setValue( GXutil.rtrim( AV42PRIO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavMail.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavMail.getInternalname(), httpContext.getMessage( "Envio Guia Remessa por E-mail?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavMail.getInternalname(), AV33Mail, "", httpContext.getMessage( "Envio Guia Remessa por E-mail?", ""), 1, chkavMail.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(91, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,91);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPathpdf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPathpdf_Internalname, httpContext.getMessage( "Path", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPathpdf_Internalname, GXutil.rtrim( AV40PATHPDF), GXutil.rtrim( localUtil.format( AV40PATHPDF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPathpdf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPathpdf_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavManaut.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavManaut.getInternalname(), httpContext.getMessage( "Automatico?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavManaut.getInternalname(), AV34ManAut, "", httpContext.getMessage( "Automatico?", ""), 1, chkavManaut.getEnabled(), "A", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(103, this, 'A', 'M',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,103);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavOpi.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavOpi.getInternalname(), httpContext.getMessage( "Ecrã", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 107,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavOpi.getInternalname(), AV37Opi, "", httpContext.getMessage( "Ecrã", ""), 1, chkavOpi.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onblur=\""+""+";gx.evt.onblur(this,107);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedlistprinter_Internalname, divTablesplittedlistprinter_Visible, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_listprinter_Internalname, httpContext.getMessage( "Impressora Servidor", ""), "", "", lblTextblockcombo_listprinter_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Facturacion\\GenerarJobRemessa.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_listprinter.setProperty("Caption", Combo_listprinter_Caption);
         ucCombo_listprinter.setProperty("Cls", Combo_listprinter_Cls);
         ucCombo_listprinter.setProperty("EmptyItem", Combo_listprinter_Emptyitem);
         ucCombo_listprinter.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucCombo_listprinter.setProperty("DropDownOptionsData", AV31ListPrinter_Data);
         ucCombo_listprinter.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_listprinter_Internalname, "COMBO_LISTPRINTERContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 135, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\GenerarJobRemessa.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 124,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 135, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 7, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112dn1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\GenerarJobRemessa.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop30", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelwccomponent.setProperty("Width", Dvpanel_panelwccomponent_Width);
         ucDvpanel_panelwccomponent.setProperty("AutoWidth", Dvpanel_panelwccomponent_Autowidth);
         ucDvpanel_panelwccomponent.setProperty("AutoHeight", Dvpanel_panelwccomponent_Autoheight);
         ucDvpanel_panelwccomponent.setProperty("Cls", Dvpanel_panelwccomponent_Cls);
         ucDvpanel_panelwccomponent.setProperty("Title", Dvpanel_panelwccomponent_Title);
         ucDvpanel_panelwccomponent.setProperty("Collapsible", Dvpanel_panelwccomponent_Collapsible);
         ucDvpanel_panelwccomponent.setProperty("Collapsed", Dvpanel_panelwccomponent_Collapsed);
         ucDvpanel_panelwccomponent.setProperty("ShowCollapseIcon", Dvpanel_panelwccomponent_Showcollapseicon);
         ucDvpanel_panelwccomponent.setProperty("IconPosition", Dvpanel_panelwccomponent_Iconposition);
         ucDvpanel_panelwccomponent.setProperty("AutoScroll", Dvpanel_panelwccomponent_Autoscroll);
         ucDvpanel_panelwccomponent.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelwccomponent_Internalname, "DVPANEL_PANELWCCOMPONENTContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANELWCCOMPONENTContainer"+"PanelWCComponent"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanelwccomponent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divListjobgridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         ListjobgridContainer.SetWrapped(nGXWrapped);
         startgridcontrol135( ) ;
      }
      if ( wbEnd == 135 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_135 = (int)(nGXsfl_135_idx-1) ;
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"ListjobgridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Listjobgrid", ListjobgridContainer, subListjobgrid_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "ListjobgridContainerData", ListjobgridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "ListjobgridContainerData"+"V", ListjobgridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"ListjobgridContainerData"+"V"+"\" value='"+ListjobgridContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucListjobgridpaginationbar.setProperty("Class", Listjobgridpaginationbar_Class);
         ucListjobgridpaginationbar.setProperty("ShowFirst", Listjobgridpaginationbar_Showfirst);
         ucListjobgridpaginationbar.setProperty("ShowPrevious", Listjobgridpaginationbar_Showprevious);
         ucListjobgridpaginationbar.setProperty("ShowNext", Listjobgridpaginationbar_Shownext);
         ucListjobgridpaginationbar.setProperty("ShowLast", Listjobgridpaginationbar_Showlast);
         ucListjobgridpaginationbar.setProperty("PagesToShow", Listjobgridpaginationbar_Pagestoshow);
         ucListjobgridpaginationbar.setProperty("PagingButtonsPosition", Listjobgridpaginationbar_Pagingbuttonsposition);
         ucListjobgridpaginationbar.setProperty("PagingCaptionPosition", Listjobgridpaginationbar_Pagingcaptionposition);
         ucListjobgridpaginationbar.setProperty("EmptyGridClass", Listjobgridpaginationbar_Emptygridclass);
         ucListjobgridpaginationbar.setProperty("RowsPerPageSelector", Listjobgridpaginationbar_Rowsperpageselector);
         ucListjobgridpaginationbar.setProperty("RowsPerPageOptions", Listjobgridpaginationbar_Rowsperpageoptions);
         ucListjobgridpaginationbar.setProperty("Previous", Listjobgridpaginationbar_Previous);
         ucListjobgridpaginationbar.setProperty("Next", Listjobgridpaginationbar_Next);
         ucListjobgridpaginationbar.setProperty("Caption", Listjobgridpaginationbar_Caption);
         ucListjobgridpaginationbar.setProperty("EmptyGridCaption", Listjobgridpaginationbar_Emptygridcaption);
         ucListjobgridpaginationbar.setProperty("RowsPerPageCaption", Listjobgridpaginationbar_Rowsperpagecaption);
         ucListjobgridpaginationbar.setProperty("CurrentPage", AV63ListJobGridCurrentPage);
         ucListjobgridpaginationbar.setProperty("PageCount", AV64ListJobGridPageCount);
         ucListjobgridpaginationbar.render(context, "dvelop.dvpaginationbar", Listjobgridpaginationbar_Internalname, "LISTJOBGRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divCell_listjobgrid_dwc_Internalname, 1, 0, "px", 0, "px", divCell_listjobgrid_dwc_Class, "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0158"+"", GXutil.rtrim( WebComp_Listjobgrid_dwc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0158"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_135_Refreshing )
            {
               if ( GXutil.len( WebComp_Listjobgrid_dwc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldListjobgrid_dwc), GXutil.lower( WebComp_Listjobgrid_dwc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0158"+"");
                  }
                  WebComp_Listjobgrid_dwc.componentdraw();
                  if ( GXutil.strcmp(GXutil.lower( OldListjobgrid_dwc), GXutil.lower( WebComp_Listjobgrid_dwc_Component)) != 0 )
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
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTable_progress_Internalname, 1, 0, "px", 0, "px", "Table_ProgressBar", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV112Pgmname), GXutil.rtrim( localUtil.format( AV112Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.setProperty("Paramstr", Datamonjs_Paramstr);
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, "DATAMONJSContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucInnewwindowpdf.render(context, "innewwindow", Innewwindowpdf_Internalname, "INNEWWINDOWPDFContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 178,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV7CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV7CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,178);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 179,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV9CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,179);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 180,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavListprinter_Internalname, AV30ListPrinter, GXutil.rtrim( localUtil.format( AV30ListPrinter, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,180);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavListprinter_Jsonclick, 0, "Attribute", "", "", "", "", edtavListprinter_Visible, 1, 0, "text", "", 80, "chr", 1, "row", 150, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
         /* User Defined Control */
         ucPopover_jobdesc.setProperty("IsGridItem", Popover_jobdesc_Isgriditem);
         ucPopover_jobdesc.setProperty("Trigger", Popover_jobdesc_Trigger);
         ucPopover_jobdesc.setProperty("PopoverWidth", Popover_jobdesc_Popoverwidth);
         ucPopover_jobdesc.setProperty("Position", Popover_jobdesc_Position);
         ucPopover_jobdesc.render(context, "dvelop.wwppopover", Popover_jobdesc_Internalname, "POPOVER_JOBDESCContainer");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 182,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavListjobgridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV63ListJobGridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV63ListJobGridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,182);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavListjobgridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavListjobgridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 183,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavVermail.getInternalname(), GXutil.booltostr( AV51VerMail), "", "", chkavVermail.getVisible(), 1, "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(183, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,183);\"");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavVersumlin, cmbavVersumlin.getInternalname(), GXutil.trim( GXutil.str( AV52VerSumLin, 1, 0)), 1, cmbavVersumlin.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", cmbavVersumlin.getVisible(), 1, 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,184);\"", "", true, (byte)(0), "HLP_Facturacion\\GenerarJobRemessa.htm");
         cmbavVersumlin.setValue( GXutil.trim( GXutil.str( AV52VerSumLin, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavVersumlin.getInternalname(), "Values", cmbavVersumlin.ToJavascriptSource(), true);
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAgr_fases_Internalname, GXutil.ltrim( localUtil.ntoc( AV5Agr_Fases, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV5Agr_Fases), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAgr_fases_Jsonclick, 0, "Attribute", "", "", "", "", edtavAgr_fases_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\GenerarJobRemessa.htm");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 186,'',false,'" + sGXsfl_135_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbmarca, cmbavAlbmarca.getInternalname(), GXutil.rtrim( AV108albmarca), 1, cmbavAlbmarca.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", cmbavAlbmarca.getVisible(), 1, 0, (short)(0), 0, "em", 0, "", "", "Attribute", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,186);\"", "", true, (byte)(0), "HLP_Facturacion\\GenerarJobRemessa.htm");
         cmbavAlbmarca.setValue( GXutil.rtrim( AV108albmarca) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbmarca.getInternalname(), "Values", cmbavAlbmarca.ToJavascriptSource(), true);
         wb_table1_187_2DN2( true) ;
      }
      else
      {
         wb_table1_187_2DN2( false) ;
      }
      return  ;
   }

   public void wb_table1_187_2DN2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_192_2DN2( true) ;
      }
      else
      {
         wb_table2_192_2DN2( false) ;
      }
      return  ;
   }

   public void wb_table2_192_2DN2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucListjobgrid_empowerer.setProperty("PopoversInGrid", Listjobgrid_empowerer_Popoversingrid);
         ucListjobgrid_empowerer.render(context, "wwp.gridempowerer", Listjobgrid_empowerer_Internalname, "LISTJOBGRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDiv_wwpauxwc_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0199"+"", GXutil.rtrim( WebComp_Wwpaux_wc_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0199"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( bGXsfl_135_Refreshing )
            {
               if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
               {
                  if ( GXutil.strcmp(GXutil.lower( OldWwpaux_wc), GXutil.lower( WebComp_Wwpaux_wc_Component)) != 0 )
                  {
                     httpContext.ajax_rspStartCmp("gxHTMLWrpW0199"+"");
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
      if ( wbEnd == 135 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( ListjobgridContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"ListjobgridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Listjobgrid", ListjobgridContainer, subListjobgrid_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "ListjobgridContainerData", ListjobgridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "ListjobgridContainerData"+"V", ListjobgridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"ListjobgridContainerData"+"V"+"\" value='"+ListjobgridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2DN2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Impresion Guia Remessa", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2DN0( ) ;
   }

   public void ws2DN2( )
   {
      start2DN2( ) ;
      evt2DN2( ) ;
   }

   public void evt2DN2( )
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
                           e122DN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODTO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132DN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LISTJOBGRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142DN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LISTJOBGRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e152DN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_DELETED.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e162DN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172DN2 ();
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
                                 e182DN2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPROFCHFROM.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192DN2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "ONMESSAGE_GX1") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Onmessage_gx1 */
                           e202DN2 ();
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "LISTJOBGRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "VRUN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "LISTJOBGRID.REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "ONMESSAGE_GX1") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "VRUN.CLICK") == 0 ) )
                        {
                           nGXsfl_135_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1352( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV67GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67GridActionGroup1), 4, 0));
                           AV66DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV66DetailWebComponent);
                           A14423JobId = GXutil.strToGuid(httpContext.cgiGet( edtJobId_Internalname)) ;
                           AV75JobDescWithTags = httpContext.cgiGet( edtavJobdescwithtags_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavJobdescwithtags_Internalname, AV75JobDescWithTags);
                           A14485JobDesc = httpContext.cgiGet( edtJobDesc_Internalname) ;
                           n14485JobDesc = false ;
                           A14424JobType = httpContext.cgiGet( edtJobType_Internalname) ;
                           n14424JobType = false ;
                           A14457OkItem = localUtil.ctol( httpContext.cgiGet( edtOkItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14457OkItem = false ;
                           A14458ErItem = localUtil.ctol( httpContext.cgiGet( edtErItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14458ErItem = false ;
                           A14456PrcItem = localUtil.ctol( httpContext.cgiGet( edtPrcItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14456PrcItem = false ;
                           A14459PrgPct = (short)(localUtil.ctol( httpContext.cgiGet( edtPrgPct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n14459PrgPct = false ;
                           A14455TotItem = localUtil.ctol( httpContext.cgiGet( edtTotItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           n14455TotItem = false ;
                           cmbJobStat.setName( cmbJobStat.getInternalname() );
                           cmbJobStat.setValue( httpContext.cgiGet( cmbJobStat.getInternalname()) );
                           A14450JobStat = httpContext.cgiGet( cmbJobStat.getInternalname()) ;
                           n14450JobStat = false ;
                           A14463ZipPath = httpContext.cgiGet( edtZipPath_Internalname) ;
                           n14463ZipPath = false ;
                           A14464ZipUrl = httpContext.cgiGet( edtZipUrl_Internalname) ;
                           n14464ZipUrl = false ;
                           AV68Run = httpContext.cgiGet( edtavRun_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavRun_Internalname, AV68Run);
                           AV78Row = httpContext.cgiGet( edtavRow_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavRow_Internalname, AV78Row);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRGPCT");
                              GX_FocusControl = edtavPrgpct_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV79PrgPct = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrgpct_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79PrgPct), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRGPCT"+"_"+sGXsfl_135_idx, getSecureSignedToken( sGXsfl_135_idx, localUtil.format( DecimalUtil.doubleToDec(AV79PrgPct), "ZZ9")));
                           }
                           else
                           {
                              AV79PrgPct = (short)(localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrgpct_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79PrgPct), 3, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRGPCT"+"_"+sGXsfl_135_idx, getSecureSignedToken( sGXsfl_135_idx, localUtil.format( DecimalUtil.doubleToDec(AV79PrgPct), "ZZ9")));
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
                                 e212DN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e222DN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LISTJOBGRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e232DN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242DN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VRUN.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e252DN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "LISTJOBGRID.REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e262DN2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ONMESSAGE_GX1") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Onmessage_gx1 */
                                 e202DN2 ();
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                              }
                              else if ( GXutil.strcmp(sEvt, "ONMESSAGE_GX1") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Onmessage_gx1 */
                                 e202DN2 ();
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
                     if ( nCmpId == 158 )
                     {
                        OldListjobgrid_dwc = httpContext.cgiGet( "W0158") ;
                        if ( ( GXutil.len( OldListjobgrid_dwc) == 0 ) || ( GXutil.strcmp(OldListjobgrid_dwc, WebComp_Listjobgrid_dwc_Component) != 0 ) )
                        {
                           WebComp_Listjobgrid_dwc = WebUtils.getWebComponent(getClass(), "app." + OldListjobgrid_dwc + "_impl", remoteHandle, context);
                           WebComp_Listjobgrid_dwc_Component = OldListjobgrid_dwc ;
                        }
                        if ( GXutil.len( WebComp_Listjobgrid_dwc_Component) != 0 )
                        {
                           WebComp_Listjobgrid_dwc.componentprocess("W0158", "", sEvt);
                        }
                        WebComp_Listjobgrid_dwc_Component = OldListjobgrid_dwc ;
                     }
                     else if ( nCmpId == 199 )
                     {
                        OldWwpaux_wc = httpContext.cgiGet( "W0199") ;
                        if ( ( GXutil.len( OldWwpaux_wc) == 0 ) || ( GXutil.strcmp(OldWwpaux_wc, WebComp_Wwpaux_wc_Component) != 0 ) )
                        {
                           WebComp_Wwpaux_wc = WebUtils.getWebComponent(getClass(), "app." + OldWwpaux_wc + "_impl", remoteHandle, context);
                           WebComp_Wwpaux_wc_Component = OldWwpaux_wc ;
                        }
                        if ( GXutil.len( WebComp_Wwpaux_wc_Component) != 0 )
                        {
                           WebComp_Wwpaux_wc.componentprocess("W0199", "", sEvt);
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

   public void we2DN2( )
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

   public void pa2DN2( )
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
            GX_FocusControl = edtavAlbprofchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrlistjobgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1352( ) ;
      while ( nGXsfl_135_idx <= nRC_GXsfl_135 )
      {
         sendrow_1352( ) ;
         nGXsfl_135_idx = ((subListjobgrid_Islastpage==1)&&(nGXsfl_135_idx+1>sublistjobgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_135_idx+1) ;
         sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1352( ) ;
      }
      addString( httpContext.getJSONContainerResponse( ListjobgridContainer)) ;
      /* End function gxnrListjobgrid_newrow */
   }

   public void gxgrlistjobgrid_refresh( int subListjobgrid_Rows ,
                                        short AV79PrgPct ,
                                        short AV77i ,
                                        String AV33Mail ,
                                        String AV34ManAut ,
                                        String AV37Opi ,
                                        boolean AV51VerMail ,
                                        String AV41PATHTEMP ,
                                        String AV40PATHPDF ,
                                        String AV112Pgmname )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e222DN2 ();
      LISTJOBGRID_nCurrentRecord = 0 ;
      rf2DN2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"GenerarJobRemessa");
      forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV40PATHPDF, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV112Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\generarjobremessa:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrListjobgrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_JOBTYPE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A14424JobType, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "JOBTYPE", A14424JobType);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRGPCT", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV79PrgPct), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRGPCT", GXutil.ltrim( localUtil.ntoc( AV79PrgPct, (byte)(3), (byte)(0), ".", "")));
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
      if ( cmbavF_header.getItemCount() > 0 )
      {
         AV18F_header = (byte)(GXutil.lval( cmbavF_header.getValidValue(GXutil.trim( GXutil.str( AV18F_header, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18F_header", GXutil.str( AV18F_header, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavF_header.setValue( GXutil.trim( GXutil.str( AV18F_header, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavF_header.getInternalname(), "Values", cmbavF_header.ToJavascriptSource(), true);
      }
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV42PRIO = cmbavPrio.getValidValue(AV42PRIO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42PRIO", AV42PRIO);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPrio.setValue( GXutil.rtrim( AV42PRIO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
      }
      AV33Mail = ((GXutil.strcmp(GXutil.rtrim( AV33Mail), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Mail", AV33Mail);
      AV34ManAut = ((GXutil.strcmp(GXutil.rtrim( AV34ManAut), "A")==0) ? "A" : "M") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34ManAut", AV34ManAut);
      AV37Opi = ((GXutil.strcmp(GXutil.rtrim( AV37Opi), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Opi", AV37Opi);
      AV51VerMail = GXutil.strtobool( GXutil.booltostr( AV51VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51VerMail", AV51VerMail);
      if ( cmbavVersumlin.getItemCount() > 0 )
      {
         AV52VerSumLin = (byte)(GXutil.lval( cmbavVersumlin.getValidValue(GXutil.trim( GXutil.str( AV52VerSumLin, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52VerSumLin", GXutil.str( AV52VerSumLin, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavVersumlin.setValue( GXutil.trim( GXutil.str( AV52VerSumLin, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavVersumlin.getInternalname(), "Values", cmbavVersumlin.ToJavascriptSource(), true);
      }
      if ( cmbavAlbmarca.getItemCount() > 0 )
      {
         AV108albmarca = cmbavAlbmarca.getValidValue(AV108albmarca) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108albmarca", AV108albmarca);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbmarca.setValue( GXutil.rtrim( AV108albmarca) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbmarca.getInternalname(), "Values", cmbavAlbmarca.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      /* Execute user event: Refresh */
      e222DN2 ();
      rf2DN2( ) ;
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
      AV112Pgmname = "Facturacion.GenerarJobRemessa" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112Pgmname", AV112Pgmname);
      Gx_err = (short)(0) ;
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtavJobdescwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavJobdescwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJobdescwithtags_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtavRun_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRun_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRun_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtavRow_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRow_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRow_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtavPrgpct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrgpct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrgpct_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2DN2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         ListjobgridContainer.ClearRows();
      }
      wbStart = (short)(135) ;
      e262DN2 ();
      nGXsfl_135_idx = 1 ;
      sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1352( ) ;
      bGXsfl_135_Refreshing = true ;
      ListjobgridContainer.AddObjectProperty("GridName", "Listjobgrid");
      ListjobgridContainer.AddObjectProperty("CmpContext", "");
      ListjobgridContainer.AddObjectProperty("InMasterPage", "false");
      ListjobgridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      ListjobgridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      ListjobgridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      ListjobgridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      ListjobgridContainer.setPageSize( sublistjobgrid_fnc_recordsperpage( ) );
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Listjobgrid_dwc_Component) != 0 )
            {
               WebComp_Listjobgrid_dwc.componentstart();
            }
         }
      }
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
         subsflControlProps_1352( ) ;
         GXPagingFrom2 = (int)(((subListjobgrid_Rows==0) ? 1 : LISTJOBGRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subListjobgrid_Rows==0) ? 10000 : LISTJOBGRID_nFirstRecordOnPage+sublistjobgrid_fnc_recordsperpage( )+1)) ;
         /* Using cursor H02DN2 */
         pr_default.execute(0, new Object[] {Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_135_idx = 1 ;
         sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1352( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subListjobgrid_Rows == 0 ) || ( LISTJOBGRID_nCurrentRecord < sublistjobgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A14452DtCreat = H02DN2_A14452DtCreat[0] ;
            n14452DtCreat = H02DN2_n14452DtCreat[0] ;
            A14464ZipUrl = H02DN2_A14464ZipUrl[0] ;
            n14464ZipUrl = H02DN2_n14464ZipUrl[0] ;
            A14463ZipPath = H02DN2_A14463ZipPath[0] ;
            n14463ZipPath = H02DN2_n14463ZipPath[0] ;
            A14450JobStat = H02DN2_A14450JobStat[0] ;
            n14450JobStat = H02DN2_n14450JobStat[0] ;
            A14455TotItem = H02DN2_A14455TotItem[0] ;
            n14455TotItem = H02DN2_n14455TotItem[0] ;
            A14459PrgPct = H02DN2_A14459PrgPct[0] ;
            n14459PrgPct = H02DN2_n14459PrgPct[0] ;
            A14456PrcItem = H02DN2_A14456PrcItem[0] ;
            n14456PrcItem = H02DN2_n14456PrcItem[0] ;
            A14458ErItem = H02DN2_A14458ErItem[0] ;
            n14458ErItem = H02DN2_n14458ErItem[0] ;
            A14457OkItem = H02DN2_A14457OkItem[0] ;
            n14457OkItem = H02DN2_n14457OkItem[0] ;
            A14424JobType = H02DN2_A14424JobType[0] ;
            n14424JobType = H02DN2_n14424JobType[0] ;
            A14485JobDesc = H02DN2_A14485JobDesc[0] ;
            n14485JobDesc = H02DN2_n14485JobDesc[0] ;
            A14423JobId = H02DN2_A14423JobId[0] ;
            e232DN2 ();
            pr_default.readNext(0);
         }
         LISTJOBGRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nEOF", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(135) ;
         wb2DN0( ) ;
      }
      bGXsfl_135_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2DN2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHTEMP", AV41PATHTEMP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHTEMP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41PATHTEMP, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_JOBTYPE"+"_"+sGXsfl_135_idx, getSecureSignedToken( sGXsfl_135_idx, GXutil.rtrim( localUtil.format( A14424JobType, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRGPCT"+"_"+sGXsfl_135_idx, getSecureSignedToken( sGXsfl_135_idx, localUtil.format( DecimalUtil.doubleToDec(AV79PrgPct), "ZZ9")));
   }

   public int sublistjobgrid_fnc_pagecount( )
   {
      LISTJOBGRID_nRecordCount = sublistjobgrid_fnc_recordcount( ) ;
      if ( ((int)((LISTJOBGRID_nRecordCount) % (sublistjobgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( LISTJOBGRID_nRecordCount/ (double) (sublistjobgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( LISTJOBGRID_nRecordCount/ (double) (sublistjobgrid_fnc_recordsperpage( )))+1) ;
   }

   public int sublistjobgrid_fnc_recordcount( )
   {
      /* Using cursor H02DN3 */
      pr_default.execute(1);
      LISTJOBGRID_nRecordCount = H02DN3_ALISTJOBGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(LISTJOBGRID_nRecordCount) ;
   }

   public int sublistjobgrid_fnc_recordsperpage( )
   {
      if ( subListjobgrid_Rows > 0 )
      {
         return subListjobgrid_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int sublistjobgrid_fnc_currentpage( )
   {
      return (int)(GXutil.Int( LISTJOBGRID_nFirstRecordOnPage/ (double) (sublistjobgrid_fnc_recordsperpage( )))+1) ;
   }

   public short sublistjobgrid_firstpage( )
   {
      LISTJOBGRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV79PrgPct, AV77i, AV33Mail, AV34ManAut, AV37Opi, AV51VerMail, AV41PATHTEMP, AV40PATHPDF, AV112Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short sublistjobgrid_nextpage( )
   {
      LISTJOBGRID_nRecordCount = sublistjobgrid_fnc_recordcount( ) ;
      if ( ( LISTJOBGRID_nRecordCount >= sublistjobgrid_fnc_recordsperpage( ) ) && ( LISTJOBGRID_nEOF == 0 ) )
      {
         LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nFirstRecordOnPage+sublistjobgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      ListjobgridContainer.AddObjectProperty("LISTJOBGRID_nFirstRecordOnPage", LISTJOBGRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV79PrgPct, AV77i, AV33Mail, AV34ManAut, AV37Opi, AV51VerMail, AV41PATHTEMP, AV40PATHPDF, AV112Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((LISTJOBGRID_nEOF==0) ? 0 : 2)) ;
   }

   public short sublistjobgrid_previouspage( )
   {
      if ( LISTJOBGRID_nFirstRecordOnPage >= sublistjobgrid_fnc_recordsperpage( ) )
      {
         LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nFirstRecordOnPage-sublistjobgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV79PrgPct, AV77i, AV33Mail, AV34ManAut, AV37Opi, AV51VerMail, AV41PATHTEMP, AV40PATHPDF, AV112Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short sublistjobgrid_lastpage( )
   {
      LISTJOBGRID_nRecordCount = sublistjobgrid_fnc_recordcount( ) ;
      if ( LISTJOBGRID_nRecordCount > sublistjobgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((LISTJOBGRID_nRecordCount) % (sublistjobgrid_fnc_recordsperpage( )))) == 0 )
         {
            LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nRecordCount-sublistjobgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            LISTJOBGRID_nFirstRecordOnPage = (long)(LISTJOBGRID_nRecordCount-((int)((LISTJOBGRID_nRecordCount) % (sublistjobgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         LISTJOBGRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV79PrgPct, AV77i, AV33Mail, AV34ManAut, AV37Opi, AV51VerMail, AV41PATHTEMP, AV40PATHPDF, AV112Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int sublistjobgrid_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         LISTJOBGRID_nFirstRecordOnPage = (long)(sublistjobgrid_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         LISTJOBGRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( LISTJOBGRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV79PrgPct, AV77i, AV33Mail, AV34ManAut, AV37Opi, AV51VerMail, AV41PATHTEMP, AV40PATHPDF, AV112Pgmname) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV112Pgmname = "Facturacion.GenerarJobRemessa" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV112Pgmname", AV112Pgmname);
      Gx_err = (short)(0) ;
      edtavPathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Enabled), 5, 0), true);
      edtavDetailwebcomponent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDetailwebcomponent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDetailwebcomponent_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtavJobdescwithtags_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavJobdescwithtags_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavJobdescwithtags_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtavRun_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRun_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRun_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtavRow_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRow_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRow_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtavPrgpct_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrgpct_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrgpct_Enabled), 5, 0), !bGXsfl_135_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2DN0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e212DN2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV15DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV8CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV10CliCodto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vLISTPRINTER_DATA"), AV31ListPrinter_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vNOTIFICATIONINFO"), AV70NotificationInfo);
         /* Read saved values. */
         nRC_GXsfl_135 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_135"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV64ListJobGridPageCount = localUtil.ctol( httpContext.cgiGet( "vLISTJOBGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         LISTJOBGRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "LISTJOBGRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         LISTJOBGRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subListjobgrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Combo_clicodfrom_Cls = httpContext.cgiGet( "COMBO_CLICODFROM_Cls") ;
         Combo_clicodfrom_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_set") ;
         Combo_clicodfrom_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODFROM_Emptyitemtext") ;
         Combo_clicodto_Cls = httpContext.cgiGet( "COMBO_CLICODTO_Cls") ;
         Combo_clicodto_Selectedvalue_set = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_set") ;
         Combo_clicodto_Emptyitemtext = httpContext.cgiGet( "COMBO_CLICODTO_Emptyitemtext") ;
         Combo_listprinter_Cls = httpContext.cgiGet( "COMBO_LISTPRINTER_Cls") ;
         Combo_listprinter_Selectedvalue_set = httpContext.cgiGet( "COMBO_LISTPRINTER_Selectedvalue_set") ;
         Combo_listprinter_Selectedtext_set = httpContext.cgiGet( "COMBO_LISTPRINTER_Selectedtext_set") ;
         Combo_listprinter_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTPRINTER_Visible")) ;
         Combo_listprinter_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_LISTPRINTER_Emptyitem")) ;
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
         Listjobgridpaginationbar_Class = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Class") ;
         Listjobgridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Showfirst")) ;
         Listjobgridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Showprevious")) ;
         Listjobgridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Shownext")) ;
         Listjobgridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Showlast")) ;
         Listjobgridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Listjobgridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Listjobgridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Listjobgridpaginationbar_Emptygridclass = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Emptygridclass") ;
         Listjobgridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Listjobgridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Listjobgridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Listjobgridpaginationbar_Previous = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Previous") ;
         Listjobgridpaginationbar_Next = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Next") ;
         Listjobgridpaginationbar_Caption = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Caption") ;
         Listjobgridpaginationbar_Emptygridcaption = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Emptygridcaption") ;
         Listjobgridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_panelwccomponent_Width = httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Width") ;
         Dvpanel_panelwccomponent_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Autowidth")) ;
         Dvpanel_panelwccomponent_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Autoheight")) ;
         Dvpanel_panelwccomponent_Cls = httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Cls") ;
         Dvpanel_panelwccomponent_Title = httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Title") ;
         Dvpanel_panelwccomponent_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Collapsible")) ;
         Dvpanel_panelwccomponent_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Collapsed")) ;
         Dvpanel_panelwccomponent_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Showcollapseicon")) ;
         Dvpanel_panelwccomponent_Iconposition = httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Iconposition") ;
         Dvpanel_panelwccomponent_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANELWCCOMPONENT_Autoscroll")) ;
         Datamonjs_Paramstr = httpContext.cgiGet( "DATAMONJS_Paramstr") ;
         Popover_jobdesc_Gridinternalname = httpContext.cgiGet( "POPOVER_JOBDESC_Gridinternalname") ;
         Popover_jobdesc_Iteminternalname = httpContext.cgiGet( "POPOVER_JOBDESC_Iteminternalname") ;
         Popover_jobdesc_Isgriditem = GXutil.strtobool( httpContext.cgiGet( "POPOVER_JOBDESC_Isgriditem")) ;
         Popover_jobdesc_Trigger = httpContext.cgiGet( "POPOVER_JOBDESC_Trigger") ;
         Popover_jobdesc_Popoverwidth = (int)(localUtil.ctol( httpContext.cgiGet( "POPOVER_JOBDESC_Popoverwidth"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Popover_jobdesc_Position = httpContext.cgiGet( "POPOVER_JOBDESC_Position") ;
         Dvelop_confirmpanel_deleted_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Title") ;
         Dvelop_confirmpanel_deleted_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Confirmationtext") ;
         Dvelop_confirmpanel_deleted_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Yesbuttoncaption") ;
         Dvelop_confirmpanel_deleted_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Nobuttoncaption") ;
         Dvelop_confirmpanel_deleted_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_deleted_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Yesbuttonposition") ;
         Dvelop_confirmpanel_deleted_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Confirmtype") ;
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Listjobgrid_empowerer_Gridinternalname = httpContext.cgiGet( "LISTJOBGRID_EMPOWERER_Gridinternalname") ;
         Listjobgrid_empowerer_Popoversingrid = httpContext.cgiGet( "LISTJOBGRID_EMPOWERER_Popoversingrid") ;
         subListjobgrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Listjobgridpaginationbar_Selectedpage = httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Selectedpage") ;
         Listjobgridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "LISTJOBGRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_deleted_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_DELETED_Result") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         Combo_clicodto_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_get") ;
         Combo_clicodfrom_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_get") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHFROM");
            GX_FocusControl = edtavAlbprofchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV99AlbProfchfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99AlbProfchfrom", localUtil.format(AV99AlbProfchfrom, "99/99/99"));
         }
         else
         {
            AV99AlbProfchfrom = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV99AlbProfchfrom", localUtil.format(AV99AlbProfchfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHTO");
            GX_FocusControl = edtavAlbprofchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV100AlbProfchto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100AlbProfchto", localUtil.format(AV100AlbProfchto, "99/99/99"));
         }
         else
         {
            AV100AlbProfchto = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV100AlbProfchto", localUtil.format(AV100AlbProfchto, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCODFROM");
            GX_FocusControl = edtavAlbprocodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV96AlbProCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96AlbProCodfrom), 10, 0));
         }
         else
         {
            AV96AlbProCodfrom = localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV96AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV96AlbProCodfrom), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCODTO");
            GX_FocusControl = edtavAlbprocodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV97AlbProCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97AlbProCodto), 10, 0));
         }
         else
         {
            AV97AlbProCodto = localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV97AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97AlbProCodto), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOPIAS2");
            GX_FocusControl = edtavCopias2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13Copias2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Copias2), 4, 0));
         }
         else
         {
            AV13Copias2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Copias2), 4, 0));
         }
         cmbavF_header.setName( cmbavF_header.getInternalname() );
         cmbavF_header.setValue( httpContext.cgiGet( cmbavF_header.getInternalname()) );
         AV18F_header = (byte)(GXutil.lval( httpContext.cgiGet( cmbavF_header.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18F_header", GXutil.str( AV18F_header, 1, 0));
         cmbavPrio.setName( cmbavPrio.getInternalname() );
         cmbavPrio.setValue( httpContext.cgiGet( cmbavPrio.getInternalname()) );
         AV42PRIO = httpContext.cgiGet( cmbavPrio.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42PRIO", AV42PRIO);
         AV33Mail = ((GXutil.strcmp(httpContext.cgiGet( chkavMail.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33Mail", AV33Mail);
         AV40PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40PATHPDF", AV40PATHPDF);
         AV34ManAut = ((GXutil.strcmp(httpContext.cgiGet( chkavManaut.getInternalname()), "A")==0) ? "A" : "M") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34ManAut", AV34ManAut);
         AV37Opi = ((GXutil.strcmp(httpContext.cgiGet( chkavOpi.getInternalname()), "1")==0) ? "1" : "0") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37Opi", AV37Opi);
         AV112Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112Pgmname", AV112Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCodfrom), 6, 0));
         }
         else
         {
            AV7CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCodfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CliCodto), 6, 0));
         }
         else
         {
            AV9CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CliCodto), 6, 0));
         }
         AV30ListPrinter = httpContext.cgiGet( edtavListprinter_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30ListPrinter", AV30ListPrinter);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavListjobgridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavListjobgridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vLISTJOBGRIDCURRENTPAGE");
            GX_FocusControl = edtavListjobgridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63ListJobGridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63ListJobGridCurrentPage), 10, 0));
         }
         else
         {
            AV63ListJobGridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavListjobgridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63ListJobGridCurrentPage), 10, 0));
         }
         AV51VerMail = GXutil.strtobool( httpContext.cgiGet( chkavVermail.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51VerMail", AV51VerMail);
         cmbavVersumlin.setName( cmbavVersumlin.getInternalname() );
         cmbavVersumlin.setValue( httpContext.cgiGet( cmbavVersumlin.getInternalname()) );
         AV52VerSumLin = (byte)(GXutil.lval( httpContext.cgiGet( cmbavVersumlin.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52VerSumLin", GXutil.str( AV52VerSumLin, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAgr_fases_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAgr_fases_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vAGR_FASES");
            GX_FocusControl = edtavAgr_fases_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5Agr_Fases = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Agr_Fases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Agr_Fases), 4, 0));
         }
         else
         {
            AV5Agr_Fases = (short)(localUtil.ctol( httpContext.cgiGet( edtavAgr_fases_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Agr_Fases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Agr_Fases), 4, 0));
         }
         cmbavAlbmarca.setName( cmbavAlbmarca.getInternalname() );
         cmbavAlbmarca.setValue( httpContext.cgiGet( cmbavAlbmarca.getInternalname()) );
         AV108albmarca = httpContext.cgiGet( cmbavAlbmarca.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108albmarca", AV108albmarca);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"GenerarJobRemessa");
         AV40PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40PATHPDF", AV40PATHPDF);
         forbiddenHiddens.add("PATHPDF", GXutil.rtrim( localUtil.format( AV40PATHPDF, "")));
         AV112Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112Pgmname", AV112Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV112Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\generarjobremessa:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e212DN2 ();
      if (returnInSub) return;
   }

   public void e212DN2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_SdtWWPContext1[0] = AV53WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV53WWPContext = GXv_SdtWWPContext1[0] ;
      GXt_char2 = AV46Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      generarjobremessa_impl.this.GXt_char2 = GXv_char3[0] ;
      AV46Station = GXt_char2 ;
      GXv_char3[0] = AV16EmprCod ;
      GXv_char4[0] = AV17EmprNom ;
      GXv_char5[0] = AV49UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV46Station, GXv_char3, GXv_char4, GXv_char5) ;
      generarjobremessa_impl.this.AV16EmprCod = GXv_char3[0] ;
      generarjobremessa_impl.this.AV17EmprNom = GXv_char4[0] ;
      generarjobremessa_impl.this.AV49UsurCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV49UsurCod", AV49UsurCod);
      Popover_jobdesc_Gridinternalname = subListjobgrid_Internalname ;
      ucPopover_jobdesc.sendProperty(context, "", false, Popover_jobdesc_Internalname, "GridInternalName", Popover_jobdesc_Gridinternalname);
      Popover_jobdesc_Iteminternalname = edtavJobdescwithtags_Internalname ;
      ucPopover_jobdesc.sendProperty(context, "", false, Popover_jobdesc_Internalname, "ItemInternalName", Popover_jobdesc_Iteminternalname);
      divCell_listjobgrid_dwc_Class = "Invisible WCD_"+GXutil.upper( subListjobgrid_Internalname) ;
      httpContext.ajax_rsp_assign_prop("", false, divCell_listjobgrid_dwc_Internalname, "Class", divCell_listjobgrid_dwc_Class, true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV15DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV15DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      edtavListprinter_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListprinter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListprinter_Visible), 5, 0), true);
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
      /* Execute user subroutine: 'LOADCOMBOLISTPRINTER' */
      S132 ();
      if (returnInSub) return;
      chkavVermail.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "Visible", GXutil.ltrimstr( chkavVermail.getVisible(), 5, 0), true);
      cmbavVersumlin.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavVersumlin.getInternalname(), "Visible", GXutil.ltrimstr( cmbavVersumlin.getVisible(), 5, 0), true);
      edtavAgr_fases_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAgr_fases_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAgr_fases_Visible), 5, 0), true);
      cmbavAlbmarca.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbmarca.getInternalname(), "Visible", GXutil.ltrimstr( cmbavAlbmarca.getVisible(), 5, 0), true);
      Listjobgrid_empowerer_Gridinternalname = subListjobgrid_Internalname ;
      ucListjobgrid_empowerer.sendProperty(context, "", false, Listjobgrid_empowerer_Internalname, "GridInternalName", Listjobgrid_empowerer_Gridinternalname);
      subListjobgrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV63ListJobGridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63ListJobGridCurrentPage), 10, 0));
      edtavListjobgridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavListjobgridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavListjobgridcurrentpage_Visible), 5, 0), true);
      AV64ListJobGridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64ListJobGridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64ListJobGridPageCount), 10, 0));
      Listjobgridpaginationbar_Rowsperpageselectedvalue = subListjobgrid_Rows ;
      ucListjobgridpaginationbar.sendProperty(context, "", false, Listjobgridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Listjobgridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV51VerMail = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51VerMail", AV51VerMail);
      AV37Opi = "0" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Opi", AV37Opi);
      GXt_char2 = AV40PATHPDF ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusemplin(remoteHandle, context).execute( AV16EmprCod, "WEBPDF", GXv_char5) ;
      generarjobremessa_impl.this.GXt_char2 = GXv_char5[0] ;
      AV40PATHPDF = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40PATHPDF", AV40PATHPDF);
      GXt_char2 = AV41PATHTEMP ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusemplin(remoteHandle, context).execute( AV16EmprCod, "WEBPDF", GXv_char5) ;
      generarjobremessa_impl.this.GXt_char2 = GXv_char5[0] ;
      AV41PATHTEMP = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41PATHTEMP", AV41PATHTEMP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHTEMP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41PATHTEMP, ""))));
      if ( ! (GXutil.strcmp("", AV53WWPContext.getgxTv_SdtWWPContext_Usurprint())==0) )
      {
         AV30ListPrinter = AV53WWPContext.getgxTv_SdtWWPContext_Usurprint() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30ListPrinter", AV30ListPrinter);
         Combo_listprinter_Selectedtext_set = AV30ListPrinter ;
         ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedText_set", Combo_listprinter_Selectedtext_set);
         Combo_listprinter_Selectedvalue_set = AV30ListPrinter ;
         ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedValue_set", Combo_listprinter_Selectedvalue_set);
      }
      AV34ManAut = "M" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34ManAut", AV34ManAut);
      AV52VerSumLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52VerSumLin", GXutil.str( AV52VerSumLin, 1, 0));
      AV18F_header = (byte)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18F_header", GXutil.str( AV18F_header, 1, 0));
      AV5Agr_Fases = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Agr_Fases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Agr_Fases), 4, 0));
      AV50Var_OutPut = "PRN" ;
      AV42PRIO = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42PRIO", AV42PRIO);
      AV24FacFchto = Gx_date ;
      AV23FacFchfrom = GXutil.dadd(Gx_date,-(7)) ;
      GXt_int8 = AV12Copias ;
      GXv_int9[0] = GXt_int8 ;
      new app.pbuscon(remoteHandle, context).execute( AV16EmprCod, "100005", GXv_int9) ;
      generarjobremessa_impl.this.GXt_int8 = GXv_int9[0] ;
      AV12Copias = (short)(GXt_int8) ;
      if ( AV12Copias == 0 )
      {
         AV12Copias = (short)(1) ;
      }
      AV13Copias2 = AV12Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Copias2), 4, 0));
      AV106Copia[1-1] = "Original" ;
      AV106Copia[2-1] = "Duplicado" ;
      AV106Copia[3-1] = "Triplicado" ;
      AV106Copia[4-1] = "Quadriplicado" ;
      AV54Year = (short)(GXutil.year( Gx_date)) ;
      AV14Day = (short)(GXutil.day( Gx_date)) ;
      AV36Mounth = (short)(GXutil.month( Gx_date)) ;
      AV77i = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77i), 4, 0));
   }

   public void e222DN2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV92RecordCount = (short)(sublistjobgrid_fnc_recordcount( )) ;
      AV64ListJobGridPageCount = (long)(AV92RecordCount/ (double) (subListjobgrid_Rows)+((((int)((AV92RecordCount) % (subListjobgrid_Rows)))>0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64ListJobGridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64ListJobGridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e232DN2( )
   {
      /* Listjobgrid_Load Routine */
      returnInSub = false ;
      AV77i = (short)(AV77i+1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77i), 4, 0));
      AV79PrgPct = A14459PrgPct ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrgpct_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV79PrgPct), 3, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRGPCT"+"_"+sGXsfl_135_idx, getSecureSignedToken( sGXsfl_135_idx, localUtil.format( DecimalUtil.doubleToDec(AV79PrgPct), "ZZ9")));
      AV78Row = GXutil.format( "%1%2", httpContext.getMessage( "span_PRGPCT_", ""), GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV77i), "9999")), "", "", "", "", "", "", "") ;
      httpContext.ajax_rsp_assign_attri("", false, edtavRow_Internalname, AV78Row);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "SetProgress", "", new Object[] {AV78Row,GXutil.str( A14459PrgPct, 3, 0),"100"});
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";FontColorIconInfo far fa-caret-square-down", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Email", ""), "fas fa-envelope-open-text", "", "", "", "", "", "", ""), (short)(0));
      if ( GXutil.strcmp(A14450JobStat, "DONE") == 0 )
      {
         cmbavGridactiongroup1.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir", ""), "fas fa-print", "", "", "", "", "", "", ""), (short)(0));
      }
      if ( GXutil.strcmp(A14450JobStat, "DONE") == 0 )
      {
         cmbavGridactiongroup1.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Preview", ""), "far fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactiongroup1.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Apagar", ""), "fas fa-trash-alt", "", "", "", "", "", "", ""), (short)(0));
      AV66DetailWebComponent = "<i class=\"fas fa-angle-right ArrowIcon\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavDetailwebcomponent_Internalname, AV66DetailWebComponent);
      AV68Run = "<i class=\"FontColorIcon fas fa-angle-double-right\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavRun_Internalname, AV68Run);
      if ( A14458ErItem > 0 )
      {
         edtavRun_Class = "Attribute" ;
      }
      else
      {
         edtavRun_Class = "Invisible" ;
      }
      AV75JobDescWithTags = A14485JobDesc ;
      httpContext.ajax_rsp_assign_attri("", false, edtavJobdescwithtags_Internalname, AV75JobDescWithTags);
      AV75JobDescWithTags += "<i class='WWPPopoverIcon TagAfterText fa fa-caret-down fas fa-info'></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavJobdescwithtags_Internalname, AV75JobDescWithTags);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(135) ;
      }
      sendrow_1352( ) ;
      LISTJOBGRID_nCurrentRecord = (long)(LISTJOBGRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_135_Refreshing )
      {
         httpContext.doAjaxLoad(135, ListjobgridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV67GridActionGroup1, 4, 0)) );
   }

   public void e142DN2( )
   {
      /* Listjobgridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Listjobgridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV63ListJobGridCurrentPage = (long)(AV63ListJobGridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63ListJobGridCurrentPage), 10, 0));
         sublistjobgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Listjobgridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV63ListJobGridCurrentPage = (long)(AV63ListJobGridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63ListJobGridCurrentPage), 10, 0));
         sublistjobgrid_nextpage( ) ;
      }
      else
      {
         AV62PageToGo = (int)(GXutil.lval( Listjobgridpaginationbar_Selectedpage)) ;
         AV63ListJobGridCurrentPage = AV62PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63ListJobGridCurrentPage), 10, 0));
         sublistjobgrid_gotopage( AV62PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e152DN2( )
   {
      /* Listjobgridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subListjobgrid_Rows = Listjobgridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "LISTJOBGRID_Rows", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV63ListJobGridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63ListJobGridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63ListJobGridCurrentPage), 10, 0));
      sublistjobgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e242DN2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV67GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO ENVIAREMAIL' */
         S142 ();
         if (returnInSub) return;
      }
      else if ( AV67GridActionGroup1 == 2 )
      {
         /* Execute user subroutine: 'DO PRINTER' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV67GridActionGroup1 == 3 )
      {
         /* Execute user subroutine: 'DO PREVIEW' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV67GridActionGroup1 == 4 )
      {
         /* Execute user subroutine: 'DO DELETED' */
         S172 ();
         if (returnInSub) return;
      }
      AV67GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV67GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e162DN2( )
   {
      /* Dvelop_confirmpanel_deleted_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_deleted_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION DELETED' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e182DN2 ();
      if (returnInSub) return;
   }

   public void e182DN2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( (0==AV96AlbProCodfrom) && (0==AV97AlbProCodto) && (0==AV96AlbProCodfrom) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100AlbProfchto)) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em Fatura, Data", ""));
      }
      else
      {
         if ( (0==AV96AlbProCodfrom) && (0==AV97AlbProCodto) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99AlbProfchfrom)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100AlbProfchto)) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Fatura", ""));
         }
         else
         {
            if ( (0==AV96AlbProCodfrom) && ! (0==AV97AlbProCodto) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Fatura inicial", ""));
            }
            else
            {
               if ( ! (0==AV96AlbProCodfrom) && (0==AV97AlbProCodto) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Fatura final", ""));
               }
               else
               {
                  if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99AlbProfchfrom)) && GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100AlbProfchto)) && (0==AV96AlbProCodfrom) && (0==AV97AlbProCodto) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Data", ""));
                  }
                  else
                  {
                     if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99AlbProfchfrom)) && ! (0==AV97AlbProCodto) )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Data inicial", ""));
                     }
                     else
                     {
                        if ( ! (0==AV96AlbProCodfrom) && (0==AV97AlbProCodto) )
                        {
                           httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção: Não foi introduzido qualquer valor em  Data final", ""));
                        }
                        else
                        {
                           AV98numeroderemessa = (short)(0) ;
                           /* Optimized group. */
                           pr_default.dynParam(2, new Object[]{ new Object[]{
                                                                Long.valueOf(AV96AlbProCodfrom) ,
                                                                AV34ManAut ,
                                                                Long.valueOf(AV97AlbProCodto) ,
                                                                AV99AlbProfchfrom ,
                                                                AV100AlbProfchto ,
                                                                Integer.valueOf(AV7CliCodfrom) ,
                                                                Integer.valueOf(AV9CliCodto) ,
                                                                Long.valueOf(A30AlbProCod) ,
                                                                A34AlbProfch ,
                                                                Integer.valueOf(A1243GuiRemCli) ,
                                                                Byte.valueOf(A33AlbProEst) ,
                                                                AV16EmprCod ,
                                                                AV42PRIO } ,
                                                                new int[]{
                                                                TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.INT,
                                                                TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                                                }
                           });
                           /* Using cursor H02DN4 */
                           pr_default.execute(2, new Object[] {AV16EmprCod, AV42PRIO, Long.valueOf(AV96AlbProCodfrom), Long.valueOf(AV97AlbProCodto), AV99AlbProfchfrom, AV100AlbProfchto, Integer.valueOf(AV7CliCodfrom), Integer.valueOf(AV9CliCodto)});
                           cV98numeroderemessa = H02DN4_AV98numeroderemessa[0] ;
                           pr_default.close(2);
                           AV98numeroderemessa = (short)(AV98numeroderemessa+cV98numeroderemessa*1) ;
                           /* End optimized group. */
                           if ( AV98numeroderemessa == 0 )
                           {
                              httpContext.GX_msglist.addItem(httpContext.getMessage( "Não há Guia de Remessa a processar.", ""));
                           }
                           else
                           {
                              if ( AV98numeroderemessa > 50 )
                              {
                                 httpContext.GX_msglist.addItem(httpContext.getMessage( "Atenção. O número de Guias a processar ", "")+localUtil.format( DecimalUtil.doubleToDec(AV98numeroderemessa), "ZZZ9")+httpContext.getMessage( ", ultrapassará as 50.", ""));
                              }
                              else
                              {
                                 Dvelop_confirmpanel_enter_Confirmationtext = httpContext.getMessage( "O número de Guia Remessa a processar é ", "")+localUtil.format( DecimalUtil.doubleToDec(AV98numeroderemessa), "ZZZ9")+httpContext.getMessage( ". Pretende imprimi-las?", "") ;
                                 ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
                                 this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e172DN2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e132DN2( )
   {
      /* Combo_clicodto_Onoptionclicked Routine */
      returnInSub = false ;
      AV9CliCodto = (int)(GXutil.lval( Combo_clicodto_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9CliCodto), 6, 0));
      /*  Sending Event outputs  */
   }

   public void e122DN2( )
   {
      /* Combo_clicodfrom_Onoptionclicked Routine */
      returnInSub = false ;
      AV7CliCodfrom = (int)(GXutil.lval( Combo_clicodfrom_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CliCodfrom), 6, 0));
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'DO ENVIAREMAIL' Routine */
      returnInSub = false ;
      AV89AuxJobId = A14423JobId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89AuxJobId", AV89AuxJobId.toString());
      /* Using cursor H02DN5 */
      pr_default.execute(3, new Object[] {AV89AuxJobId});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A14423JobId = H02DN5_A14423JobId[0] ;
         A14470DocId = H02DN5_A14470DocId[0] ;
         n14470DocId = H02DN5_n14470DocId[0] ;
         AV102AlbProCod = A14470DocId ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102AlbProCod), 10, 0));
         /* Execute user subroutine: 'BUSCARDADOSGUIAREMESSA' */
         S224 ();
         if ( returnInSub )
         {
            pr_default.close(3);
            returnInSub = true;
            if (true) return;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
   }

   public void S152( )
   {
      /* 'DO PRINTER' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV30ListPrinter)==0) )
      {
         AV69Aviso = AV6AppTool.printto(A14463ZipPath, AV30ListPrinter, (byte)(1), true, false) ;
         httpContext.GX_msglist.addItem(AV69Aviso);
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Selecione una impressora !", ""));
      }
   }

   public void S162( )
   {
      /* 'DO PREVIEW' Routine */
      returnInSub = false ;
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "windows", "", new Object[] {A14464ZipUrl,"_blank"});
   }

   public void S172( )
   {
      /* 'DO DELETED' Routine */
      returnInSub = false ;
      AV81JobId_Selected = A14423JobId ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81JobId_Selected", AV81JobId_Selected.toString());
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_DELETEDContainer", "Confirm", "", new Object[] {});
   }

   public void S182( )
   {
      /* 'DO ACTION DELETED' Routine */
      returnInSub = false ;
      new app.asyncbatch.jobdelete(remoteHandle, context).execute( AV81JobId_Selected, AV16EmprCod, AV49UsurCod) ;
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      AV21FacEst = (byte)(0) ;
      AV22FacEstto = (byte)(((GXutil.strcmp(AV34ManAut, "A")==0) ? 0 : 2)) ;
      AV48Total = (short)(0) ;
      AV45Seq = (short)(0) ;
      AV28JobItem = new GXBaseCollection<app.asyncbatch.SdtJobItemSdt_Item>(app.asyncbatch.SdtJobItemSdt_Item.class, "Item", "TexplusNET", remoteHandle) ;
      AV27JobId = GXutil.strToGuid(java.util.UUID.randomUUID( ).toString()) ;
      AV80Cliente = "" ;
      AV116GXLvl427 = (byte)(0) ;
      pr_default.dynParam(4, new Object[]{ new Object[]{
                                           Long.valueOf(AV96AlbProCodfrom) ,
                                           AV34ManAut ,
                                           Long.valueOf(AV97AlbProCodto) ,
                                           AV99AlbProfchfrom ,
                                           AV100AlbProfchto ,
                                           Integer.valueOf(AV7CliCodfrom) ,
                                           Integer.valueOf(AV9CliCodto) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A39AlbProPri ,
                                           AV42PRIO ,
                                           AV16EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.INT,
                                           TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      /* Using cursor H02DN6 */
      pr_default.execute(4, new Object[] {AV16EmprCod, AV42PRIO, Long.valueOf(AV96AlbProCodfrom), Long.valueOf(AV97AlbProCodto), AV99AlbProfchfrom, AV100AlbProfchto, Integer.valueOf(AV7CliCodfrom), Integer.valueOf(AV9CliCodto)});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A1253EmprGuiRem = H02DN6_A1253EmprGuiRem[0] ;
         A33AlbProEst = H02DN6_A33AlbProEst[0] ;
         A1243GuiRemCli = H02DN6_A1243GuiRemCli[0] ;
         A34AlbProfch = H02DN6_A34AlbProfch[0] ;
         A30AlbProCod = H02DN6_A30AlbProCod[0] ;
         A39AlbProPri = H02DN6_A39AlbProPri[0] ;
         A396EmprCod = H02DN6_A396EmprCod[0] ;
         A1244GuiRemCln = H02DN6_A1244GuiRemCln[0] ;
         A1244GuiRemCln = H02DN6_A1244GuiRemCln[0] ;
         AV116GXLvl427 = (byte)(1) ;
         AV45Seq = (short)(AV45Seq+1) ;
         AV95Bar = "\\" ;
         AV93Folder = GXutil.trim( AV40PATHPDF) + GXutil.trim( AV95Bar) + GXutil.trim( AV27JobId.toString()) ;
         AV25FileNm = GXutil.format( httpContext.getMessage( "%1_%2_%3.pdf", ""), GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9")), GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9")), GXutil.padl( GXutil.trim( GXutil.str( GXutil.year( A34AlbProfch), 10, 0)), (short)(4), "0")+GXutil.padl( GXutil.trim( GXutil.str( GXutil.month( A34AlbProfch), 10, 0)), (short)(2), "0")+GXutil.padl( GXutil.trim( GXutil.str( GXutil.day( A34AlbProfch), 10, 0)), (short)(2), "0"), "", "", "", "", "", "") ;
         AV38OutFile = GXutil.trim( AV40PATHPDF) + GXutil.trim( AV27JobId.toString()) + AV95Bar + AV25FileNm ;
         AV39OutUrl = GXutil.format( "./webpdf/%1/%2", GXutil.trim( AV27JobId.toString()), AV25FileNm, "", "", "", "", "", "", "") ;
         AV94Directory.setSource( AV93Folder );
         if ( ! AV94Directory.exists() )
         {
            AV94Directory.create();
         }
         AV80Cliente = GXutil.format( "%1-%2", GXutil.trim( GXutil.str( A1243GuiRemCli, 6, 0)), GXutil.trim( A1244GuiRemCln), "", "", "", "", "", "", "") ;
         AV29JobItem_Row = (app.asyncbatch.SdtJobItemSdt_Item)new app.asyncbatch.SdtJobItemSdt_Item(remoteHandle, context);
         AV29JobItem_Row.setgxTv_SdtJobItemSdt_Item_Jobid( AV27JobId );
         AV29JobItem_Row.setgxTv_SdtJobItemSdt_Item_Itmid( AV45Seq );
         AV29JobItem_Row.setgxTv_SdtJobItemSdt_Item_Docid( A30AlbProCod );
         AV29JobItem_Row.setgxTv_SdtJobItemSdt_Item_Doclbl( GXutil.format( "#%1_%2", GXutil.trim( GXutil.str( AV45Seq, 4, 0)), AV80Cliente, "", "", "", "", "", "", "") );
         AV29JobItem_Row.setgxTv_SdtJobItemSdt_Item_Itmsts( "WAIT" );
         AV29JobItem_Row.setgxTv_SdtJobItemSdt_Item_Retryqt( (short)(1) );
         AV29JobItem_Row.setgxTv_SdtJobItemSdt_Item_Outfile( AV38OutFile );
         AV29JobItem_Row.setgxTv_SdtJobItemSdt_Item_Outurl( AV39OutUrl );
         AV29JobItem_Row.setgxTv_SdtJobItemSdt_Item_Filenm( AV25FileNm );
         AV28JobItem.add(AV29JobItem_Row, 0);
         AV56isExist = true ;
         pr_default.readNext(4);
      }
      pr_default.close(4);
      if ( AV116GXLvl427 == 0 )
      {
         AV56isExist = false ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Registro no localizado !", ""));
      }
      if ( AV56isExist )
      {
         GXt_boolean10 = AV26isOk ;
         GXv_boolean11[0] = GXt_boolean10 ;
         new app.asyncbatch.jobcreate(remoteHandle, context).execute( AV27JobId, "REMESSA", AV28JobItem, AV40PATHPDF, AV41PATHTEMP, GXv_boolean11) ;
         generarjobremessa_impl.this.GXt_boolean10 = GXv_boolean11[0] ;
         AV26isOk = GXt_boolean10 ;
         if ( AV26isOk )
         {
            this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "FormSerialize", "", new Object[] {AV27JobId,"Enpoint or object send Serialize"});
            httpContext.GX_msglist.addItem(httpContext.getMessage( "JOB creado con sucesso !", ""));
         }
      }
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "ClickElement", "", new Object[] {httpContext.getMessage( "#Title_DVPANEL_PANEL_FILTROSContainer", "")});
      gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV79PrgPct, AV77i, AV33Mail, AV34ManAut, AV37Opi, AV51VerMail, AV41PATHTEMP, AV40PATHPDF, AV112Pgmname) ;
      callSubmit( 1 , new Object[]{ AV27JobId,AV16EmprCod,AV49UsurCod });
   }

   public void S132( )
   {
      /* 'LOADCOMBOLISTPRINTER' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV53WWPContext.getgxTv_SdtWWPContext_Usurprint())==0) )
      {
         AV32ListPrinter_Data_Item = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV32ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Id( AV53WWPContext.getgxTv_SdtWWPContext_Usurprint() );
         AV32ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Title( AV53WWPContext.getgxTv_SdtWWPContext_Usurprint() );
         AV31ListPrinter_Data.add(AV32ListPrinter_Data_Item, 0);
      }
      /* Execute user subroutine: 'LOADPRINTERFROMSERVER' */
      S232 ();
      if (returnInSub) return;
      AV31ListPrinter_Data.sort("Title");
      Combo_listprinter_Selectedvalue_set = AV30ListPrinter ;
      ucCombo_listprinter.sendProperty(context, "", false, Combo_listprinter_Internalname, "SelectedValue_set", Combo_listprinter_Selectedvalue_set);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H02DN7 */
      pr_default.execute(5);
      while ( (pr_default.getStatus(5) != 101) )
      {
         A10045CliAct = H02DN7_A10045CliAct[0] ;
         A279CliNom = H02DN7_A279CliNom[0] ;
         A252CliCod = H02DN7_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13735CliCNom", A13735CliCNom);
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV10CliCodto_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
      Combo_clicodto_Selectedvalue_set = ((0==AV9CliCodto) ? "" : GXutil.trim( GXutil.str( AV9CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
      AV10CliCodto_Data.sort("Title");
      Combo_clicodto_Selectedvalue_set = ((0==AV9CliCodto) ? "" : GXutil.trim( GXutil.str( AV9CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H02DN8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A10045CliAct = H02DN8_A10045CliAct[0] ;
         A279CliNom = H02DN8_A279CliNom[0] ;
         A252CliCod = H02DN8_A252CliCod[0] ;
         A13735CliCNom = GXutil.trim( GXutil.str( A252CliCod, 6, 0)) + "-" + GXutil.trim( A279CliNom) ;
         httpContext.ajax_rsp_assign_attri("", false, "A13735CliCNom", A13735CliCNom);
         AV11Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV11Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV8CliCodfrom_Data.add(AV11Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV7CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV7CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
      AV8CliCodfrom_Data.sort("Title");
      Combo_clicodfrom_Selectedvalue_set = ((0==AV7CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV7CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   public void e252DN2( )
   {
      /* Run_Click Routine */
      returnInSub = false ;
      callSubmit( 2 , new Object[]{ A14423JobId,AV16EmprCod,AV49UsurCod });
      /*  Sending Event outputs  */
   }

   public void e262DN2( )
   {
      /* Listjobgrid_Refresh Routine */
      returnInSub = false ;
      AV77i = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77i), 4, 0));
      /* Start For Each Line in Listjobgrid */
      nRC_GXsfl_135 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_135"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_135_fel_idx = 0 ;
      while ( nGXsfl_135_fel_idx < nRC_GXsfl_135 )
      {
         nGXsfl_135_fel_idx = ((subListjobgrid_Islastpage==1)&&(nGXsfl_135_fel_idx+1>sublistjobgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_135_fel_idx+1) ;
         sGXsfl_135_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_1352( ) ;
         cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
         cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
         AV67GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
         AV66DetailWebComponent = httpContext.cgiGet( edtavDetailwebcomponent_Internalname) ;
         A14423JobId = GXutil.strToGuid(httpContext.cgiGet( edtJobId_Internalname)) ;
         AV75JobDescWithTags = httpContext.cgiGet( edtavJobdescwithtags_Internalname) ;
         A14485JobDesc = httpContext.cgiGet( edtJobDesc_Internalname) ;
         n14485JobDesc = false ;
         A14424JobType = httpContext.cgiGet( edtJobType_Internalname) ;
         n14424JobType = false ;
         A14457OkItem = localUtil.ctol( httpContext.cgiGet( edtOkItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n14457OkItem = false ;
         A14458ErItem = localUtil.ctol( httpContext.cgiGet( edtErItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n14458ErItem = false ;
         A14456PrcItem = localUtil.ctol( httpContext.cgiGet( edtPrcItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n14456PrcItem = false ;
         A14459PrgPct = (short)(localUtil.ctol( httpContext.cgiGet( edtPrgPct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n14459PrgPct = false ;
         A14455TotItem = localUtil.ctol( httpContext.cgiGet( edtTotItem_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         n14455TotItem = false ;
         cmbJobStat.setName( cmbJobStat.getInternalname() );
         cmbJobStat.setValue( httpContext.cgiGet( cmbJobStat.getInternalname()) );
         A14450JobStat = httpContext.cgiGet( cmbJobStat.getInternalname()) ;
         n14450JobStat = false ;
         A14463ZipPath = httpContext.cgiGet( edtZipPath_Internalname) ;
         n14463ZipPath = false ;
         A14464ZipUrl = httpContext.cgiGet( edtZipUrl_Internalname) ;
         n14464ZipUrl = false ;
         AV68Run = httpContext.cgiGet( edtavRun_Internalname) ;
         AV78Row = httpContext.cgiGet( edtavRow_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRGPCT");
            GX_FocusControl = edtavPrgpct_Internalname ;
            wbErr = true ;
            AV79PrgPct = (short)(0) ;
         }
         else
         {
            AV79PrgPct = (short)(localUtil.ctol( httpContext.cgiGet( edtavPrgpct_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV77i = (short)(AV77i+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77i), 4, 0));
         AV78Row = GXutil.format( "%1%2", httpContext.getMessage( "span_PRGPCT_", ""), GXutil.trim( localUtil.format( DecimalUtil.doubleToDec(AV77i), "9999")), "", "", "", "", "", "", "") ;
         httpContext.ajax_rsp_assign_attri("", false, edtavRow_Internalname, AV78Row);
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "SetProgress", "", new Object[] {AV78Row,GXutil.str( AV79PrgPct, 3, 0),"100"});
         /* End For Each Line */
      }
      if ( nGXsfl_135_fel_idx == 0 )
      {
         nGXsfl_135_idx = 1 ;
         sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1352( ) ;
      }
      nGXsfl_135_fel_idx = 1 ;
      /*  Sending Event outputs  */
   }

   public void e202DN2( )
   {
      /* Onmessage_gx1 Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV70NotificationInfo.getgxTv_SdtNotificationInfo_Message(), "DONE") == 0 )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV79PrgPct, AV77i, AV33Mail, AV34ManAut, AV37Opi, AV51VerMail, AV41PATHTEMP, AV40PATHPDF, AV112Pgmname) ;
         AV71Async_JobId = GXutil.strToGuid(AV70NotificationInfo.getgxTv_SdtNotificationInfo_Id()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71Async_JobId", AV71Async_JobId.toString());
         GXt_char2 = AV73PARM_OPT ;
         GXv_char5[0] = GXt_char2 ;
         new app.asyncbatch.getjobpar(remoteHandle, context).execute( AV71Async_JobId, "OPI", GXv_char5) ;
         generarjobremessa_impl.this.GXt_char2 = GXv_char5[0] ;
         AV73PARM_OPT = GXt_char2 ;
         if ( GXutil.strcmp(AV73PARM_OPT, "S") == 0 )
         {
            /* Execute user subroutine: 'PREVIEWASYNC' */
            S202 ();
            if (returnInSub) return;
         }
         else
         {
            if ( (GXutil.strcmp("", AV30ListPrinter)==0) )
            {
               GXt_char2 = AV30ListPrinter ;
               GXv_char5[0] = GXt_char2 ;
               new app.asyncbatch.getjobpar(remoteHandle, context).execute( AV71Async_JobId, "LISTPRINTER", GXv_char5) ;
               generarjobremessa_impl.this.GXt_char2 = GXv_char5[0] ;
               AV30ListPrinter = GXt_char2 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30ListPrinter", AV30ListPrinter);
            }
            if ( ! (GXutil.strcmp("", AV30ListPrinter)==0) )
            {
               /* Execute user subroutine: 'PRINTER' */
               S212 ();
               if (returnInSub) return;
            }
            else
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Impressora no localizada !", ""));
            }
         }
      }
      if ( GXutil.strcmp(AV70NotificationInfo.getgxTv_SdtNotificationInfo_Message(), "PROGRESS") == 0 )
      {
         gxgrlistjobgrid_refresh( subListjobgrid_Rows, AV79PrgPct, AV77i, AV33Mail, AV34ManAut, AV37Opi, AV51VerMail, AV41PATHTEMP, AV40PATHPDF, AV112Pgmname) ;
      }
      /*  Sending Event outputs  */
   }

   public void e192DN2( )
   {
      /* Albprofchfrom_Isvalid Routine */
      returnInSub = false ;
      AV100AlbProfchto = AV99AlbProfchfrom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV100AlbProfchto", localUtil.format(AV100AlbProfchto, "99/99/99"));
      if ( AV96AlbProCodfrom > 0 )
      {
         AV99AlbProfchfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV99AlbProfchfrom", localUtil.format(AV99AlbProfchfrom, "99/99/99"));
         AV100AlbProfchto = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100AlbProfchto", localUtil.format(AV100AlbProfchto, "99/99/99"));
      }
      else
      {
         AV100AlbProfchto = GXutil.serverDate( context, remoteHandle, pr_default) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV100AlbProfchto", localUtil.format(AV100AlbProfchto, "99/99/99"));
      }
      /*  Sending Event outputs  */
   }

   public void S224( )
   {
      /* 'BUSCARDADOSGUIAREMESSA' Routine */
      returnInSub = false ;
      /* Using cursor H02DN9 */
      pr_default.execute(7, new Object[] {AV16EmprCod, Long.valueOf(AV102AlbProCod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A1253EmprGuiRem = H02DN9_A1253EmprGuiRem[0] ;
         A396EmprCod = H02DN9_A396EmprCod[0] ;
         A30AlbProCod = H02DN9_A30AlbProCod[0] ;
         A1243GuiRemCli = H02DN9_A1243GuiRemCli[0] ;
         A1244GuiRemCln = H02DN9_A1244GuiRemCln[0] ;
         A14561GuiRemmf = H02DN9_A14561GuiRemmf[0] ;
         A1244GuiRemCln = H02DN9_A1244GuiRemCln[0] ;
         A14561GuiRemmf = H02DN9_A14561GuiRemmf[0] ;
         AV102AlbProCod = A30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV102AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV102AlbProCod), 10, 0));
         AV104GuiRemCli = A1243GuiRemCli ;
         AV103GuiRemCln = A1244GuiRemCln ;
         AV109GuiRemmf = A14561GuiRemmf ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S202( )
   {
      /* 'PREVIEWASYNC' Routine */
      returnInSub = false ;
      /* Using cursor H02DN10 */
      pr_default.execute(8, new Object[] {AV71Async_JobId});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A14423JobId = H02DN10_A14423JobId[0] ;
         A14464ZipUrl = H02DN10_A14464ZipUrl[0] ;
         n14464ZipUrl = H02DN10_n14464ZipUrl[0] ;
         AV74ZipUrl = A14464ZipUrl ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
      if ( ! (GXutil.strcmp("", AV74ZipUrl)==0) )
      {
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "windows", "", new Object[] {AV74ZipUrl,"_blank"});
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Documento no encontrado!", ""));
      }
   }

   public void S232( )
   {
      /* 'LOADPRINTERFROMSERVER' Routine */
      returnInSub = false ;
      AV47STR_SDTListPrinter = AV6AppTool.listprinter() ;
      if ( AV43SDTListPrinter.fromJSonString(AV47STR_SDTListPrinter, AV35Messages) )
      {
         AV122GXV1 = 1 ;
         while ( AV122GXV1 <= AV43SDTListPrinter.size() )
         {
            AV44SDTListPrinter_item = (app.SdtSDTListPrinter_SDTListPrinterItem)((app.SdtSDTListPrinter_SDTListPrinterItem)AV43SDTListPrinter.elementAt(-1+AV122GXV1));
            if ( GXutil.strcmp(AV53WWPContext.getgxTv_SdtWWPContext_Usurprint(), AV44SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name()) != 0 )
            {
               AV32ListPrinter_Data_Item = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
               AV32ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Id( AV44SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name() );
               AV32ListPrinter_Data_Item.setgxTv_SdtDVB_SDTComboData_Item_Title( AV44SDTListPrinter_item.getgxTv_SdtSDTListPrinter_SDTListPrinterItem_Name() );
               AV31ListPrinter_Data.add(AV32ListPrinter_Data_Item, 0);
            }
            AV122GXV1 = (int)(AV122GXV1+1) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ninguna impressora localizada", ""));
      }
   }

   public void S212( )
   {
      /* 'PRINTER' Routine */
      returnInSub = false ;
      /* Using cursor H02DN11 */
      pr_default.execute(9, new Object[] {AV71Async_JobId});
      while ( (pr_default.getStatus(9) != 101) )
      {
         A14423JobId = H02DN11_A14423JobId[0] ;
         A14463ZipPath = H02DN11_A14463ZipPath[0] ;
         n14463ZipPath = H02DN11_n14463ZipPath[0] ;
         AV72ZipPath = A14463ZipPath ;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(9);
      new com.genexuscore.genexus.common.SdtLog(remoteHandle, context).info(httpContext.getMessage( "Starting print file to :", "")+AV30ListPrinter+httpContext.getMessage( "Doc:", "")+AV72ZipPath, AV112Pgmname) ;
      GXt_char2 = AV30ListPrinter ;
      GXv_char5[0] = GXt_char2 ;
      new app.asyncbatch.getjobpar(remoteHandle, context).execute( AV71Async_JobId, "LISTPRINTER", GXv_char5) ;
      generarjobremessa_impl.this.GXt_char2 = GXv_char5[0] ;
      AV30ListPrinter = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30ListPrinter", AV30ListPrinter);
      AV69Aviso = AV6AppTool.printto(AV72ZipPath, AV30ListPrinter, (byte)(1), true, false) ;
      httpContext.GX_msglist.addItem(AV69Aviso);
   }

   public void wb_table2_192_2DN2( boolean wbgen )
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
         wb_table2_192_2DN2e( true) ;
      }
      else
      {
         wb_table2_192_2DN2e( false) ;
      }
   }

   public void wb_table1_187_2DN2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_deleted_Internalname, tblTabledvelop_confirmpanel_deleted_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_deleted.setProperty("Title", Dvelop_confirmpanel_deleted_Title);
         ucDvelop_confirmpanel_deleted.setProperty("ConfirmationText", Dvelop_confirmpanel_deleted_Confirmationtext);
         ucDvelop_confirmpanel_deleted.setProperty("YesButtonCaption", Dvelop_confirmpanel_deleted_Yesbuttoncaption);
         ucDvelop_confirmpanel_deleted.setProperty("NoButtonCaption", Dvelop_confirmpanel_deleted_Nobuttoncaption);
         ucDvelop_confirmpanel_deleted.setProperty("CancelButtonCaption", Dvelop_confirmpanel_deleted_Cancelbuttoncaption);
         ucDvelop_confirmpanel_deleted.setProperty("YesButtonPosition", Dvelop_confirmpanel_deleted_Yesbuttonposition);
         ucDvelop_confirmpanel_deleted.setProperty("ConfirmType", Dvelop_confirmpanel_deleted_Confirmtype);
         ucDvelop_confirmpanel_deleted.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_deleted_Internalname, "DVELOP_CONFIRMPANEL_DELETEDContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_DELETEDContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_187_2DN2e( true) ;
      }
      else
      {
         wb_table1_187_2DN2e( false) ;
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
      pa2DN2( ) ;
      ws2DN2( ) ;
      we2DN2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("calendar-system.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Listjobgrid_dwc == null ) )
      {
         if ( GXutil.len( WebComp_Listjobgrid_dwc_Component) != 0 )
         {
            WebComp_Listjobgrid_dwc.componentthemes();
         }
      }
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116155118", true, true);
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
      httpContext.AddJavascriptSource("facturacion/generarjobremessa.js", "?202682116155118", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Popover/WWPPopoverRender.js", "", false, true);
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

   public void subsflControlProps_1352( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_135_idx );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_135_idx ;
      edtJobId_Internalname = "JOBID_"+sGXsfl_135_idx ;
      edtavJobdescwithtags_Internalname = "vJOBDESCWITHTAGS_"+sGXsfl_135_idx ;
      edtJobDesc_Internalname = "JOBDESC_"+sGXsfl_135_idx ;
      edtJobType_Internalname = "JOBTYPE_"+sGXsfl_135_idx ;
      edtOkItem_Internalname = "OKITEM_"+sGXsfl_135_idx ;
      edtErItem_Internalname = "ERITEM_"+sGXsfl_135_idx ;
      edtPrcItem_Internalname = "PRCITEM_"+sGXsfl_135_idx ;
      edtPrgPct_Internalname = "PRGPCT_"+sGXsfl_135_idx ;
      edtTotItem_Internalname = "TOTITEM_"+sGXsfl_135_idx ;
      cmbJobStat.setInternalname( "JOBSTAT_"+sGXsfl_135_idx );
      edtZipPath_Internalname = "ZIPPATH_"+sGXsfl_135_idx ;
      edtZipUrl_Internalname = "ZIPURL_"+sGXsfl_135_idx ;
      edtavRun_Internalname = "vRUN_"+sGXsfl_135_idx ;
      edtavRow_Internalname = "vROW_"+sGXsfl_135_idx ;
      edtavPrgpct_Internalname = "vPRGPCT_"+sGXsfl_135_idx ;
   }

   public void subsflControlProps_fel_1352( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_135_fel_idx );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT_"+sGXsfl_135_fel_idx ;
      edtJobId_Internalname = "JOBID_"+sGXsfl_135_fel_idx ;
      edtavJobdescwithtags_Internalname = "vJOBDESCWITHTAGS_"+sGXsfl_135_fel_idx ;
      edtJobDesc_Internalname = "JOBDESC_"+sGXsfl_135_fel_idx ;
      edtJobType_Internalname = "JOBTYPE_"+sGXsfl_135_fel_idx ;
      edtOkItem_Internalname = "OKITEM_"+sGXsfl_135_fel_idx ;
      edtErItem_Internalname = "ERITEM_"+sGXsfl_135_fel_idx ;
      edtPrcItem_Internalname = "PRCITEM_"+sGXsfl_135_fel_idx ;
      edtPrgPct_Internalname = "PRGPCT_"+sGXsfl_135_fel_idx ;
      edtTotItem_Internalname = "TOTITEM_"+sGXsfl_135_fel_idx ;
      cmbJobStat.setInternalname( "JOBSTAT_"+sGXsfl_135_fel_idx );
      edtZipPath_Internalname = "ZIPPATH_"+sGXsfl_135_fel_idx ;
      edtZipUrl_Internalname = "ZIPURL_"+sGXsfl_135_fel_idx ;
      edtavRun_Internalname = "vRUN_"+sGXsfl_135_fel_idx ;
      edtavRow_Internalname = "vROW_"+sGXsfl_135_fel_idx ;
      edtavPrgpct_Internalname = "vPRGPCT_"+sGXsfl_135_fel_idx ;
   }

   public void sendrow_1352( )
   {
      subsflControlProps_1352( ) ;
      wb2DN0( ) ;
      if ( ( subListjobgrid_Rows * 1 == 0 ) || ( nGXsfl_135_idx <= sublistjobgrid_fnc_recordsperpage( ) * 1 ) )
      {
         ListjobgridRow = GXWebRow.GetNew(context,ListjobgridContainer) ;
         if ( subListjobgrid_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Odd" ;
            }
         }
         else if ( subListjobgrid_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(0) ;
            subListjobgrid_Backcolor = subListjobgrid_Allbackcolor ;
            if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Uniform" ;
            }
         }
         else if ( subListjobgrid_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Odd" ;
            }
            subListjobgrid_Backcolor = (int)(0x0) ;
         }
         else if ( subListjobgrid_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subListjobgrid_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_135_idx) % (2))) == 0 )
            {
               subListjobgrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"Even" ;
               }
            }
            else
            {
               subListjobgrid_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subListjobgrid_Class, "") != 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"Odd" ;
               }
            }
         }
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_135_idx+"\">") ;
         }
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 136,'',false,'"+sGXsfl_135_idx+"',135)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_135_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV67GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV67GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         ListjobgridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV67GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_135_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,136);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV67GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_135_Refreshing);
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 137,'',false,'"+sGXsfl_135_idx+"',135)\"" : " ") ;
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDetailwebcomponent_Internalname,GXutil.rtrim( AV66DetailWebComponent),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDetailwebcomponent_Enabled!=0)&&(edtavDetailwebcomponent_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,137);\"" : " "),"'"+""+"'"+",false,"+"'"+"e272dn2_client"+"'","","","","",edtavDetailwebcomponent_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWIconActionColumn WCD_ActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDetailwebcomponent_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJobId_Internalname,A14423JobId.toString(),A14423JobId.toString(),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJobId_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(36),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavJobdescwithtags_Enabled!=0)&&(edtavJobdescwithtags_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 139,'',false,'"+sGXsfl_135_idx+"',135)\"" : " ") ;
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavJobdescwithtags_Internalname,AV75JobDescWithTags,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavJobdescwithtags_Enabled!=0)&&(edtavJobdescwithtags_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,139);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavJobdescwithtags_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavJobdescwithtags_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJobDesc_Internalname,A14485JobDesc,"","","'"+""+"'"+",false,"+"'"+"e282dn2_client"+"'","","","","",edtJobDesc_Jsonclick,Integer.valueOf(7),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtJobType_Internalname,A14424JobType,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtJobType_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtOkItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14457OkItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14457OkItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtOkItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtErItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14458ErItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14458ErItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtErItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrcItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14456PrcItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14456PrcItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrcItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrgPct_Internalname,GXutil.ltrim( localUtil.ntoc( A14459PrgPct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14459PrgPct), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrgPct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(100),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTotItem_Internalname,GXutil.ltrim( localUtil.ntoc( A14455TotItem, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A14455TotItem), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTotItem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbJobStat.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "JOBSTAT_" + sGXsfl_135_idx ;
            cmbJobStat.setName( GXCCtl );
            cmbJobStat.setWebtags( "" );
            cmbJobStat.addItem("WAINTING", httpContext.getMessage( "Aguarde", ""), (short)(0));
            cmbJobStat.addItem("PROCESSING", httpContext.getMessage( "Processando", ""), (short)(0));
            cmbJobStat.addItem("SUCCESS", httpContext.getMessage( "Sucesso", ""), (short)(0));
            cmbJobStat.addItem("ERROR", httpContext.getMessage( "Error", ""), (short)(0));
            cmbJobStat.addItem("DONE", httpContext.getMessage( "Finalizado", ""), (short)(0));
            cmbJobStat.addItem("DONE_ERR", httpContext.getMessage( "Finalizado con errors", ""), (short)(0));
            if ( cmbJobStat.getItemCount() > 0 )
            {
               A14450JobStat = cmbJobStat.getValidValue(A14450JobStat) ;
               n14450JobStat = false ;
            }
         }
         /* ComboBox */
         ListjobgridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbJobStat,cmbJobStat.getInternalname(),GXutil.rtrim( A14450JobStat),Integer.valueOf(1),cmbJobStat.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","svchar","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbJobStat.setValue( GXutil.rtrim( A14450JobStat) );
         httpContext.ajax_rsp_assign_prop("", false, cmbJobStat.getInternalname(), "Values", cmbJobStat.ToJavascriptSource(), !bGXsfl_135_Refreshing);
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtZipPath_Internalname,A14463ZipPath,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtZipPath_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtZipUrl_Internalname,A14464ZipUrl,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtZipUrl_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(200),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRun_Enabled!=0)&&(edtavRun_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 150,'',false,'"+sGXsfl_135_idx+"',135)\"" : " ") ;
         ROClassString = edtavRun_Class ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRun_Internalname,GXutil.rtrim( AV68Run),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavRun_Enabled!=0)&&(edtavRun_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,150);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVRUN.CLICK."+sGXsfl_135_idx+"'","","",httpContext.getMessage( "Generar Facturas", ""),"",edtavRun_Jsonclick,Integer.valueOf(5),edtavRun_Class,"",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavRun_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRow_Enabled!=0)&&(edtavRow_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 151,'',false,'"+sGXsfl_135_idx+"',135)\"" : " ") ;
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRow_Internalname,AV78Row,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavRow_Enabled!=0)&&(edtavRow_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,151);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRow_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavRow_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( ListjobgridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrgpct_Enabled!=0)&&(edtavPrgpct_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 152,'',false,'"+sGXsfl_135_idx+"',135)\"" : " ") ;
         ROClassString = "Attribute" ;
         ListjobgridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrgpct_Internalname,GXutil.ltrim( localUtil.ntoc( AV79PrgPct, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrgpct_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV79PrgPct), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV79PrgPct), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPrgpct_Enabled!=0)&&(edtavPrgpct_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,152);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrgpct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrgpct_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(135),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2DN2( ) ;
         ListjobgridContainer.AddRow(ListjobgridRow);
         nGXsfl_135_idx = ((subListjobgrid_Islastpage==1)&&(nGXsfl_135_idx+1>sublistjobgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_135_idx+1) ;
         sGXsfl_135_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_135_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1352( ) ;
      }
      /* End function sendrow_1352 */
   }

   public void startgridcontrol135( )
   {
      if ( ListjobgridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"ListjobgridContainer"+"DivS\" data-gxgridid=\"135\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subListjobgrid_Internalname, subListjobgrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subListjobgrid_Backcolorstyle == 0 )
         {
            subListjobgrid_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subListjobgrid_Class) > 0 )
            {
               subListjobgrid_Linesclass = subListjobgrid_Class+"Title" ;
            }
         }
         else
         {
            subListjobgrid_Titlebackstyle = (byte)(1) ;
            if ( subListjobgrid_Backcolorstyle == 1 )
            {
               subListjobgrid_Titlebackcolor = subListjobgrid_Allbackcolor ;
               if ( GXutil.len( subListjobgrid_Class) > 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subListjobgrid_Class) > 0 )
               {
                  subListjobgrid_Linesclass = subListjobgrid_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Job", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Type", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Success", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Error", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Procesado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" width="+GXutil.ltrimstr( DecimalUtil.doubleToDec(100), 4, 0)+"px"+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Progress", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Zip Path", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Url Zip", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+edtavRun_Class+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Progress", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         ListjobgridContainer.AddObjectProperty("GridName", "Listjobgrid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            ListjobgridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            ListjobgridContainer.Clear();
         }
         ListjobgridContainer.SetWrapped(nGXWrapped);
         ListjobgridContainer.AddObjectProperty("GridName", "Listjobgrid");
         ListjobgridContainer.AddObjectProperty("Header", subListjobgrid_Header);
         ListjobgridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         ListjobgridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("CmpContext", "");
         ListjobgridContainer.AddObjectProperty("InMasterPage", "false");
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV67GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.rtrim( AV66DetailWebComponent));
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDetailwebcomponent_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14423JobId.toString());
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", AV75JobDescWithTags);
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavJobdescwithtags_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14485JobDesc);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14424JobType);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14457OkItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14458ErItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14456PrcItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14459PrgPct, (byte)(3), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A14455TotItem, (byte)(10), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14450JobStat);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14463ZipPath);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", A14464ZipUrl);
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.rtrim( AV68Run));
         ListjobgridColumn.AddObjectProperty("Class", GXutil.rtrim( edtavRun_Class));
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRun_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", AV78Row);
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavRow_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         ListjobgridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV79PrgPct, (byte)(3), (byte)(0), ".", "")));
         ListjobgridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrgpct_Enabled, (byte)(5), (byte)(0), ".", "")));
         ListjobgridContainer.AddColumnProperties(ListjobgridColumn);
         ListjobgridContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Allowselection, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         ListjobgridContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subListjobgrid_Collapsed, (byte)(1), (byte)(0), ".", "")));
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
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavAlbprofchfrom_Internalname = "vALBPROFCHFROM" ;
      edtavAlbprofchto_Internalname = "vALBPROFCHTO" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavAlbprocodfrom_Internalname = "vALBPROCODFROM" ;
      edtavAlbprocodto_Internalname = "vALBPROCODTO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavCopias2_Internalname = "vCOPIAS2" ;
      cmbavF_header.setInternalname( "vF_HEADER" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      cmbavPrio.setInternalname( "vPRIO" );
      chkavMail.setInternalname( "vMAIL" );
      edtavPathpdf_Internalname = "vPATHPDF" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      chkavManaut.setInternalname( "vMANAUT" );
      chkavOpi.setInternalname( "vOPI" );
      lblTextblockcombo_listprinter_Internalname = "TEXTBLOCKCOMBO_LISTPRINTER" ;
      Combo_listprinter_Internalname = "COMBO_LISTPRINTER" ;
      divTablesplittedlistprinter_Internalname = "TABLESPLITTEDLISTPRINTER" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtavDetailwebcomponent_Internalname = "vDETAILWEBCOMPONENT" ;
      edtJobId_Internalname = "JOBID" ;
      edtavJobdescwithtags_Internalname = "vJOBDESCWITHTAGS" ;
      edtJobDesc_Internalname = "JOBDESC" ;
      edtJobType_Internalname = "JOBTYPE" ;
      edtOkItem_Internalname = "OKITEM" ;
      edtErItem_Internalname = "ERITEM" ;
      edtPrcItem_Internalname = "PRCITEM" ;
      edtPrgPct_Internalname = "PRGPCT" ;
      edtTotItem_Internalname = "TOTITEM" ;
      cmbJobStat.setInternalname( "JOBSTAT" );
      edtZipPath_Internalname = "ZIPPATH" ;
      edtZipUrl_Internalname = "ZIPURL" ;
      edtavRun_Internalname = "vRUN" ;
      edtavRow_Internalname = "vROW" ;
      edtavPrgpct_Internalname = "vPRGPCT" ;
      Listjobgridpaginationbar_Internalname = "LISTJOBGRIDPAGINATIONBAR" ;
      divCell_listjobgrid_dwc_Internalname = "CELL_LISTJOBGRID_DWC" ;
      divListjobgridtablewithpaginationbar_Internalname = "LISTJOBGRIDTABLEWITHPAGINATIONBAR" ;
      divPanelwccomponent_Internalname = "PANELWCCOMPONENT" ;
      Dvpanel_panelwccomponent_Internalname = "DVPANEL_PANELWCCOMPONENT" ;
      Progressbar_Internalname = "PROGRESSBAR" ;
      divTable_progress_Internalname = "TABLE_PROGRESS" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      Innewwindowpdf_Internalname = "INNEWWINDOWPDF" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
      edtavListprinter_Internalname = "vLISTPRINTER" ;
      Popover_jobdesc_Internalname = "POPOVER_JOBDESC" ;
      edtavListjobgridcurrentpage_Internalname = "vLISTJOBGRIDCURRENTPAGE" ;
      chkavVermail.setInternalname( "vVERMAIL" );
      cmbavVersumlin.setInternalname( "vVERSUMLIN" );
      edtavAgr_fases_Internalname = "vAGR_FASES" ;
      cmbavAlbmarca.setInternalname( "vALBMARCA" );
      Dvelop_confirmpanel_deleted_Internalname = "DVELOP_CONFIRMPANEL_DELETED" ;
      tblTabledvelop_confirmpanel_deleted_Internalname = "TABLEDVELOP_CONFIRMPANEL_DELETED" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      Listjobgrid_empowerer_Internalname = "LISTJOBGRID_EMPOWERER" ;
      divDiv_wwpauxwc_Internalname = "DIV_WWPAUXWC" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subListjobgrid_Internalname = "LISTJOBGRID" ;
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
      subListjobgrid_Allowcollapsing = (byte)(0) ;
      subListjobgrid_Allowselection = (byte)(0) ;
      subListjobgrid_Header = "" ;
      edtavPrgpct_Jsonclick = "" ;
      edtavPrgpct_Visible = 0 ;
      edtavPrgpct_Enabled = 1 ;
      edtavRow_Jsonclick = "" ;
      edtavRow_Visible = 0 ;
      edtavRow_Enabled = 1 ;
      edtavRun_Jsonclick = "" ;
      edtavRun_Class = "Attribute" ;
      edtavRun_Visible = -1 ;
      edtavRun_Enabled = 1 ;
      edtZipUrl_Jsonclick = "" ;
      edtZipPath_Jsonclick = "" ;
      cmbJobStat.setJsonclick( "" );
      edtTotItem_Jsonclick = "" ;
      edtPrgPct_Jsonclick = "" ;
      edtPrcItem_Jsonclick = "" ;
      edtErItem_Jsonclick = "" ;
      edtOkItem_Jsonclick = "" ;
      edtJobType_Jsonclick = "" ;
      edtJobDesc_Jsonclick = "" ;
      edtavJobdescwithtags_Jsonclick = "" ;
      edtavJobdescwithtags_Visible = -1 ;
      edtavJobdescwithtags_Enabled = 1 ;
      edtJobId_Jsonclick = "" ;
      edtavDetailwebcomponent_Jsonclick = "" ;
      edtavDetailwebcomponent_Visible = -1 ;
      edtavDetailwebcomponent_Enabled = 1 ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subListjobgrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subListjobgrid_Backcolorstyle = (byte)(0) ;
      cmbavAlbmarca.setJsonclick( "" );
      cmbavAlbmarca.setVisible( 1 );
      edtavAgr_fases_Jsonclick = "" ;
      edtavAgr_fases_Visible = 1 ;
      cmbavVersumlin.setJsonclick( "" );
      cmbavVersumlin.setVisible( 1 );
      chkavVermail.setVisible( 1 );
      edtavListjobgridcurrentpage_Jsonclick = "" ;
      edtavListjobgridcurrentpage_Visible = 1 ;
      edtavListprinter_Jsonclick = "" ;
      edtavListprinter_Visible = 1 ;
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Visible = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divCell_listjobgrid_dwc_Class = "col-xs-12" ;
      Combo_listprinter_Caption = "" ;
      divTablesplittedlistprinter_Visible = 1 ;
      chkavOpi.setEnabled( 1 );
      chkavManaut.setEnabled( 1 );
      edtavPathpdf_Jsonclick = "" ;
      edtavPathpdf_Enabled = 1 ;
      chkavMail.setEnabled( 1 );
      cmbavPrio.setJsonclick( "" );
      cmbavPrio.setEnabled( 1 );
      cmbavF_header.setJsonclick( "" );
      cmbavF_header.setEnabled( 1 );
      edtavCopias2_Jsonclick = "" ;
      edtavCopias2_Enabled = 1 ;
      edtavAlbprocodto_Jsonclick = "" ;
      edtavAlbprocodto_Enabled = 1 ;
      edtavAlbprocodfrom_Jsonclick = "" ;
      edtavAlbprocodfrom_Enabled = 1 ;
      edtavAlbprofchto_Jsonclick = "" ;
      edtavAlbprofchto_Enabled = 1 ;
      edtavAlbprofchfrom_Jsonclick = "" ;
      edtavAlbprofchfrom_Enabled = 1 ;
      Combo_clicodto_Caption = "" ;
      Combo_clicodfrom_Caption = "" ;
      Listjobgrid_empowerer_Popoversingrid = "Popover_JobDesc" ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Pretende imprimir as faturas??" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvelop_confirmpanel_deleted_Confirmtype = "1" ;
      Dvelop_confirmpanel_deleted_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_deleted_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_deleted_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_deleted_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_deleted_Confirmationtext = "Realmente desea borrar ?" ;
      Dvelop_confirmpanel_deleted_Title = httpContext.getMessage( "Aviso", "") ;
      Popover_jobdesc_Position = "Bottom" ;
      Popover_jobdesc_Popoverwidth = 400 ;
      Popover_jobdesc_Trigger = "Click" ;
      Popover_jobdesc_Isgriditem = GXutil.toBoolean( -1) ;
      Popover_jobdesc_Iteminternalname = "" ;
      Datamonjs_Paramstr = "&JobParJson" ;
      Dvpanel_panelwccomponent_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panelwccomponent_Iconposition = "Right" ;
      Dvpanel_panelwccomponent_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelwccomponent_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panelwccomponent_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_panelwccomponent_Title = httpContext.getMessage( "Lista", "") ;
      Dvpanel_panelwccomponent_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panelwccomponent_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelwccomponent_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panelwccomponent_Width = "100%" ;
      Listjobgridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Listjobgridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Listjobgridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Listjobgridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Listjobgridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Listjobgridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Listjobgridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Listjobgridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Listjobgridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Listjobgridpaginationbar_Pagingcaptionposition = "Left" ;
      Listjobgridpaginationbar_Pagingbuttonsposition = "Right" ;
      Listjobgridpaginationbar_Pagestoshow = 5 ;
      Listjobgridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Listjobgridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Listjobgridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Listjobgridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Listjobgridpaginationbar_Class = "PaginationBar" ;
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_panel_filtros_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panel_filtros_Title = httpContext.getMessage( "<i class=\"fas fa-filter\"></i> Generar Guia de Remessa", "") ;
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
      Combo_listprinter_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_listprinter_Visible = GXutil.toBoolean( -1) ;
      Combo_listprinter_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Impresion Guia Remessa", "") );
      subListjobgrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavF_header.setName( "vF_HEADER" );
      cmbavF_header.setWebtags( "" );
      cmbavF_header.addItem("1", httpContext.getMessage( "Formato Inicial", ""), (short)(0));
      cmbavF_header.addItem("2", httpContext.getMessage( "Formato Novo", ""), (short)(0));
      if ( cmbavF_header.getItemCount() > 0 )
      {
         AV18F_header = (byte)(GXutil.lval( cmbavF_header.getValidValue(GXutil.trim( GXutil.str( AV18F_header, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18F_header", GXutil.str( AV18F_header, 1, 0));
      }
      cmbavPrio.setName( "vPRIO" );
      cmbavPrio.setWebtags( "" );
      cmbavPrio.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavPrio.addItem("0", httpContext.getMessage( "Guia Transporte", ""), (short)(0));
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV42PRIO = cmbavPrio.getValidValue(AV42PRIO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42PRIO", AV42PRIO);
      }
      chkavMail.setName( "vMAIL" );
      chkavMail.setWebtags( "" );
      chkavMail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavMail.getInternalname(), "TitleCaption", chkavMail.getCaption(), true);
      chkavMail.setCheckedValue( "N" );
      AV33Mail = ((GXutil.strcmp(GXutil.rtrim( AV33Mail), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33Mail", AV33Mail);
      chkavManaut.setName( "vMANAUT" );
      chkavManaut.setWebtags( "" );
      chkavManaut.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavManaut.getInternalname(), "TitleCaption", chkavManaut.getCaption(), true);
      chkavManaut.setCheckedValue( "M" );
      AV34ManAut = ((GXutil.strcmp(GXutil.rtrim( AV34ManAut), "A")==0) ? "A" : "M") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34ManAut", AV34ManAut);
      chkavOpi.setName( "vOPI" );
      chkavOpi.setWebtags( "" );
      chkavOpi.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOpi.getInternalname(), "TitleCaption", chkavOpi.getCaption(), true);
      chkavOpi.setCheckedValue( "0" );
      AV37Opi = ((GXutil.strcmp(GXutil.rtrim( AV37Opi), "1")==0) ? "1" : "0") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37Opi", AV37Opi);
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_135_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV67GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV67GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67GridActionGroup1), 4, 0));
      }
      GXCCtl = "JOBSTAT_" + sGXsfl_135_idx ;
      cmbJobStat.setName( GXCCtl );
      cmbJobStat.setWebtags( "" );
      cmbJobStat.addItem("WAINTING", httpContext.getMessage( "Aguarde", ""), (short)(0));
      cmbJobStat.addItem("PROCESSING", httpContext.getMessage( "Processando", ""), (short)(0));
      cmbJobStat.addItem("SUCCESS", httpContext.getMessage( "Sucesso", ""), (short)(0));
      cmbJobStat.addItem("ERROR", httpContext.getMessage( "Error", ""), (short)(0));
      cmbJobStat.addItem("DONE", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbJobStat.addItem("DONE_ERR", httpContext.getMessage( "Finalizado con errors", ""), (short)(0));
      if ( cmbJobStat.getItemCount() > 0 )
      {
         A14450JobStat = cmbJobStat.getValidValue(A14450JobStat) ;
         n14450JobStat = false ;
      }
      chkavVermail.setName( "vVERMAIL" );
      chkavVermail.setWebtags( "" );
      chkavVermail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "TitleCaption", chkavVermail.getCaption(), true);
      chkavVermail.setCheckedValue( "false" );
      AV51VerMail = GXutil.strtobool( GXutil.booltostr( AV51VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51VerMail", AV51VerMail);
      cmbavVersumlin.setName( "vVERSUMLIN" );
      cmbavVersumlin.setWebtags( "" );
      cmbavVersumlin.addItem("0", "0", (short)(0));
      cmbavVersumlin.addItem("1", "1", (short)(0));
      if ( cmbavVersumlin.getItemCount() > 0 )
      {
         AV52VerSumLin = (byte)(GXutil.lval( cmbavVersumlin.getValidValue(GXutil.trim( GXutil.str( AV52VerSumLin, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52VerSumLin", GXutil.str( AV52VerSumLin, 1, 0));
      }
      cmbavAlbmarca.setName( "vALBMARCA" );
      cmbavAlbmarca.setWebtags( "" );
      cmbavAlbmarca.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbavAlbmarca.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbavAlbmarca.getItemCount() > 0 )
      {
         AV108albmarca = cmbavAlbmarca.getValidValue(AV108albmarca) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV108albmarca", AV108albmarca);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'AV79PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV77i',fld:'vI',pic:'9999'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV33Mail',fld:'vMAIL',pic:''},{av:'AV34ManAut',fld:'vMANAUT',pic:''},{av:'AV37Opi',fld:'vOPI',pic:''},{av:'AV51VerMail',fld:'vVERMAIL',pic:''},{av:'AV41PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV64ListJobGridPageCount',fld:'vLISTJOBGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("LISTJOBGRID.LOAD","{handler:'e232DN2',iparms:[{av:'AV77i',fld:'vI',pic:'9999'},{av:'A14459PrgPct',fld:'PRGPCT',pic:'ZZ9'},{av:'cmbJobStat'},{av:'A14450JobStat',fld:'JOBSTAT',pic:''},{av:'A14458ErItem',fld:'ERITEM',pic:'ZZZZZZZZZ9'},{av:'A14485JobDesc',fld:'JOBDESC',pic:''}]");
      setEventMetadata("LISTJOBGRID.LOAD",",oparms:[{av:'AV77i',fld:'vI',pic:'9999'},{av:'AV79PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV78Row',fld:'vROW',pic:''},{av:'cmbavGridactiongroup1'},{av:'AV67GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV66DetailWebComponent',fld:'vDETAILWEBCOMPONENT',pic:''},{av:'AV68Run',fld:'vRUN',pic:''},{av:'edtavRun_Class',ctrl:'vRUN',prop:'Class'},{av:'AV75JobDescWithTags',fld:'vJOBDESCWITHTAGS',pic:''}]}");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e142DN2',iparms:[{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV79PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV77i',fld:'vI',pic:'9999'},{av:'AV33Mail',fld:'vMAIL',pic:''},{av:'AV34ManAut',fld:'vMANAUT',pic:''},{av:'AV37Opi',fld:'vOPI',pic:''},{av:'AV51VerMail',fld:'vVERMAIL',pic:''},{av:'AV41PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'Listjobgridpaginationbar_Selectedpage',ctrl:'LISTJOBGRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV63ListJobGridCurrentPage',fld:'vLISTJOBGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV63ListJobGridCurrentPage',fld:'vLISTJOBGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV64ListJobGridPageCount',fld:'vLISTJOBGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e152DN2',iparms:[{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV79PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV77i',fld:'vI',pic:'9999'},{av:'AV33Mail',fld:'vMAIL',pic:''},{av:'AV34ManAut',fld:'vMANAUT',pic:''},{av:'AV37Opi',fld:'vOPI',pic:''},{av:'AV51VerMail',fld:'vVERMAIL',pic:''},{av:'AV41PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'Listjobgridpaginationbar_Rowsperpageselectedvalue',ctrl:'LISTJOBGRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("LISTJOBGRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV63ListJobGridCurrentPage',fld:'vLISTJOBGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e242DN2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV67GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'A14423JobId',fld:'JOBID',pic:''},{av:'A14470DocId',fld:'DOCID',pic:'ZZZZZZZZZ9'},{av:'AV30ListPrinter',fld:'vLISTPRINTER',pic:''},{av:'A14463ZipPath',fld:'ZIPPATH',pic:''},{av:'A14464ZipUrl',fld:'ZIPURL',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV102AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A14561GuiRemmf',fld:'GUIREMMF',pic:''}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV67GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV89AuxJobId',fld:'vAUXJOBID',pic:''},{av:'AV102AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV81JobId_Selected',fld:'vJOBID_SELECTED',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETED.CLOSE","{handler:'e162DN2',iparms:[{av:'Dvelop_confirmpanel_deleted_Result',ctrl:'DVELOP_CONFIRMPANEL_DELETED',prop:'Result'},{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV79PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV77i',fld:'vI',pic:'9999'},{av:'AV33Mail',fld:'vMAIL',pic:''},{av:'AV34ManAut',fld:'vMANAUT',pic:''},{av:'AV37Opi',fld:'vOPI',pic:''},{av:'AV51VerMail',fld:'vVERMAIL',pic:''},{av:'AV41PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV81JobId_Selected',fld:'vJOBID_SELECTED',pic:''},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_DELETED.CLOSE",",oparms:[{av:'AV64ListJobGridPageCount',fld:'vLISTJOBGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e182DN2',iparms:[{av:'AV97AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'AV96AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV100AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV99AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'cmbavPrio'},{av:'AV42PRIO',fld:'vPRIO',pic:'9'},{av:'AV34ManAut',fld:'vMANAUT',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'AV7CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV9CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'Dvelop_confirmpanel_enter_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e172DN2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV79PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV77i',fld:'vI',pic:'9999'},{av:'AV33Mail',fld:'vMAIL',pic:''},{av:'AV34ManAut',fld:'vMANAUT',pic:''},{av:'AV37Opi',fld:'vOPI',pic:''},{av:'AV51VerMail',fld:'vVERMAIL',pic:''},{av:'AV41PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'cmbavPrio'},{av:'AV42PRIO',fld:'vPRIO',pic:'9'},{av:'AV96AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV97AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'AV99AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV100AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'AV7CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV9CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'AV49UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV49UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV64ListJobGridPageCount',fld:'vLISTJOBGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e112DN1',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("JOBDESC.CLICK","{handler:'e282DN2',iparms:[{av:'A14423JobId',fld:'JOBID',pic:''},{av:'A14424JobType',fld:'JOBTYPE',pic:'',hsh:true}]");
      setEventMetadata("JOBDESC.CLICK",",oparms:[{ctrl:'WWPAUX_WC'}]}");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK","{handler:'e272DN2',iparms:[{av:'A14423JobId',fld:'JOBID',pic:''}]");
      setEventMetadata("VDETAILWEBCOMPONENT.CLICK",",oparms:[{ctrl:'LISTJOBGRID_DWC'}]}");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED","{handler:'e132DN2',iparms:[{av:'Combo_clicodto_Selectedvalue_get',ctrl:'COMBO_CLICODTO',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED",",oparms:[{av:'AV9CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'}]}");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED","{handler:'e122DN2',iparms:[{av:'Combo_clicodfrom_Selectedvalue_get',ctrl:'COMBO_CLICODFROM',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED",",oparms:[{av:'AV7CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'}]}");
      setEventMetadata("VRUN.CLICK","{handler:'e252DN2',iparms:[{av:'A14423JobId',fld:'JOBID',pic:''},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV49UsurCod',fld:'vUSURCOD',pic:'@!'}]");
      setEventMetadata("VRUN.CLICK",",oparms:[{av:'AV49UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A14423JobId',fld:'JOBID',pic:''}]}");
      setEventMetadata("LISTJOBGRID.REFRESH","{handler:'e262DN2',iparms:[{av:'AV79PrgPct',fld:'vPRGPCT',grid:135,pic:'ZZ9',hsh:true},{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_135',ctrl:'LISTJOBGRID',grid:135,prop:'GridRC',grid:135}]");
      setEventMetadata("LISTJOBGRID.REFRESH",",oparms:[{av:'AV77i',fld:'vI',pic:'9999'},{av:'AV78Row',fld:'vROW',pic:''}]}");
      setEventMetadata("VALBPROFCHFROM.ISVALID","{handler:'e192DN2',iparms:[{av:'AV99AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV96AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("VALBPROFCHFROM.ISVALID",",oparms:[{av:'AV100AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV99AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''}]}");
      setEventMetadata("ONMESSAGE_GX1","{handler:'e202DN2',iparms:[{av:'LISTJOBGRID_nFirstRecordOnPage'},{av:'LISTJOBGRID_nEOF'},{av:'subListjobgrid_Rows',ctrl:'LISTJOBGRID',prop:'Rows'},{av:'AV79PrgPct',fld:'vPRGPCT',pic:'ZZ9',hsh:true},{av:'AV77i',fld:'vI',pic:'9999'},{av:'AV33Mail',fld:'vMAIL',pic:''},{av:'AV34ManAut',fld:'vMANAUT',pic:''},{av:'AV37Opi',fld:'vOPI',pic:''},{av:'AV51VerMail',fld:'vVERMAIL',pic:''},{av:'AV41PATHTEMP',fld:'vPATHTEMP',pic:'',hsh:true},{av:'AV40PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV112Pgmname',fld:'vPGMNAME',pic:''},{av:'AV70NotificationInfo',fld:'vNOTIFICATIONINFO',pic:''},{av:'AV30ListPrinter',fld:'vLISTPRINTER',pic:''},{av:'A14423JobId',fld:'JOBID',pic:''},{av:'AV71Async_JobId',fld:'vASYNC_JOBID',pic:''},{av:'A14464ZipUrl',fld:'ZIPURL',pic:''},{av:'A14463ZipPath',fld:'ZIPPATH',pic:''}]");
      setEventMetadata("ONMESSAGE_GX1",",oparms:[{av:'AV71Async_JobId',fld:'vASYNC_JOBID',pic:''},{av:'AV30ListPrinter',fld:'vLISTPRINTER',pic:''},{av:'AV64ListJobGridPageCount',fld:'vLISTJOBGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_PRIO","{handler:'validv_Prio',iparms:[]");
      setEventMetadata("VALIDV_PRIO",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Prgpct',iparms:[]");
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
   public void submit( int submitId ,
                       Object [] submitParms ,
                       ModelContext submitContext )
   {
      UserInformation submitUI = (UserInformation) GXObjectHelper.getUserInformation(context, -1);
      int remoteHandle = submitUI.getHandle();
      try
      {
         switch ( submitId )
         {
               case 1 :
                  new app.asyncbatch.jobrun(remoteHandle, submitContext).execute( (java.util.UUID)submitParms[0], (String)submitParms[1], (String)submitParms[2]) ;
                  try { Application.getConnectionManager().disconnect(remoteHandle); } catch(Exception submitExc) { ; }
                  break;
               case 2 :
                  new app.asyncbatch.jobrun(remoteHandle, submitContext).execute( (java.util.UUID)submitParms[0], (String)submitParms[1], (String)submitParms[2]) ;
                  try { Application.getConnectionManager().disconnect(remoteHandle); } catch(Exception submitExc) { ; }
                  break;
         }
      }
      catch ( Exception e )
      {
         Application.cleanupConnection(remoteHandle);
         e.printStackTrace();
      }
   }

   public void initialize( )
   {
      Listjobgridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_deleted_Result = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Combo_listprinter_Selectedvalue_get = "" ;
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      AV70NotificationInfo = new com.genexuscore.genexus.server.SdtNotificationInfo(remoteHandle, context);
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV33Mail = "" ;
      AV34ManAut = "" ;
      AV37Opi = "" ;
      AV41PATHTEMP = "" ;
      AV40PATHPDF = "" ;
      AV112Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV15DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV8CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV10CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV31ListPrinter_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      A396EmprCod = "" ;
      AV16EmprCod = "" ;
      A1244GuiRemCln = "" ;
      A14561GuiRemmf = "" ;
      AV81JobId_Selected = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV49UsurCod = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      AV71Async_JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
      Combo_listprinter_Selectedvalue_set = "" ;
      Combo_listprinter_Selectedtext_set = "" ;
      Popover_jobdesc_Gridinternalname = "" ;
      Listjobgrid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_panel_filtros = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_panel_filtrosgenerales = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodfrom_Jsonclick = "" ;
      ucCombo_clicodfrom = new com.genexus.webpanels.GXUserControl();
      lblTextblockcombo_clicodto_Jsonclick = "" ;
      ucCombo_clicodto = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV99AlbProfchfrom = GXutil.nullDate() ;
      AV100AlbProfchto = GXutil.nullDate() ;
      AV42PRIO = "" ;
      lblTextblockcombo_listprinter_Jsonclick = "" ;
      ucCombo_listprinter = new com.genexus.webpanels.GXUserControl();
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_panelwccomponent = new com.genexus.webpanels.GXUserControl();
      ListjobgridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucListjobgridpaginationbar = new com.genexus.webpanels.GXUserControl();
      WebComp_Listjobgrid_dwc_Component = "" ;
      OldListjobgrid_dwc = "" ;
      ucProgressbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucInnewwindowpdf = new com.genexus.webpanels.GXUserControl();
      AV30ListPrinter = "" ;
      ucPopover_jobdesc = new com.genexus.webpanels.GXUserControl();
      AV108albmarca = "" ;
      ucListjobgrid_empowerer = new com.genexus.webpanels.GXUserControl();
      WebComp_Wwpaux_wc_Component = "" ;
      OldWwpaux_wc = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV66DetailWebComponent = "" ;
      A14423JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV75JobDescWithTags = "" ;
      A14485JobDesc = "" ;
      A14424JobType = "" ;
      A14450JobStat = "" ;
      A14463ZipPath = "" ;
      A14464ZipUrl = "" ;
      AV68Run = "" ;
      AV78Row = "" ;
      Gx_date = GXutil.nullDate() ;
      scmdbuf = "" ;
      H02DN2_A14452DtCreat = new java.util.Date[] {GXutil.nullDate()} ;
      H02DN2_n14452DtCreat = new boolean[] {false} ;
      H02DN2_A14464ZipUrl = new String[] {""} ;
      H02DN2_n14464ZipUrl = new boolean[] {false} ;
      H02DN2_A14463ZipPath = new String[] {""} ;
      H02DN2_n14463ZipPath = new boolean[] {false} ;
      H02DN2_A14450JobStat = new String[] {""} ;
      H02DN2_n14450JobStat = new boolean[] {false} ;
      H02DN2_A14455TotItem = new long[1] ;
      H02DN2_n14455TotItem = new boolean[] {false} ;
      H02DN2_A14459PrgPct = new short[1] ;
      H02DN2_n14459PrgPct = new boolean[] {false} ;
      H02DN2_A14456PrcItem = new long[1] ;
      H02DN2_n14456PrcItem = new boolean[] {false} ;
      H02DN2_A14458ErItem = new long[1] ;
      H02DN2_n14458ErItem = new boolean[] {false} ;
      H02DN2_A14457OkItem = new long[1] ;
      H02DN2_n14457OkItem = new boolean[] {false} ;
      H02DN2_A14424JobType = new String[] {""} ;
      H02DN2_n14424JobType = new boolean[] {false} ;
      H02DN2_A14485JobDesc = new String[] {""} ;
      H02DN2_n14485JobDesc = new boolean[] {false} ;
      H02DN2_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      A14452DtCreat = GXutil.resetTime( GXutil.nullDate() );
      H02DN3_ALISTJOBGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV53WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV46Station = "" ;
      GXv_char3 = new String[1] ;
      AV17EmprNom = "" ;
      GXv_char4 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV50Var_OutPut = "" ;
      AV24FacFchto = GXutil.nullDate() ;
      AV23FacFchfrom = GXutil.nullDate() ;
      GXv_int9 = new int[1] ;
      AV106Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV106Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      ListjobgridRow = new com.genexus.webpanels.GXWebRow();
      H02DN4_AV98numeroderemessa = new short[1] ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      AV89AuxJobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      H02DN5_A14468ItmId = new long[1] ;
      H02DN5_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      H02DN5_A14470DocId = new long[1] ;
      H02DN5_n14470DocId = new boolean[] {false} ;
      AV69Aviso = "" ;
      AV6AppTool = new app.SdtAppTool(remoteHandle, context);
      AV28JobItem = new GXBaseCollection<app.asyncbatch.SdtJobItemSdt_Item>(app.asyncbatch.SdtJobItemSdt_Item.class, "Item", "TexplusNET", remoteHandle);
      AV27JobId = java.util.UUID.fromString("00000000-0000-0000-0000-000000000000") ;
      AV80Cliente = "" ;
      H02DN6_A1253EmprGuiRem = new String[] {""} ;
      H02DN6_A33AlbProEst = new byte[1] ;
      H02DN6_A1243GuiRemCli = new int[1] ;
      H02DN6_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H02DN6_A30AlbProCod = new long[1] ;
      H02DN6_A39AlbProPri = new String[] {""} ;
      H02DN6_A396EmprCod = new String[] {""} ;
      H02DN6_A1244GuiRemCln = new String[] {""} ;
      A1253EmprGuiRem = "" ;
      AV95Bar = "" ;
      AV93Folder = "" ;
      AV25FileNm = "" ;
      AV38OutFile = "" ;
      AV39OutUrl = "" ;
      AV94Directory = new com.genexus.util.GXDirectory();
      AV29JobItem_Row = new app.asyncbatch.SdtJobItemSdt_Item(remoteHandle, context);
      GXv_boolean11 = new boolean[1] ;
      AV32ListPrinter_Data_Item = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02DN7_A396EmprCod = new String[] {""} ;
      H02DN7_A10045CliAct = new String[] {""} ;
      H02DN7_A279CliNom = new String[] {""} ;
      H02DN7_A252CliCod = new int[1] ;
      A10045CliAct = "" ;
      A279CliNom = "" ;
      A13735CliCNom = "" ;
      AV11Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H02DN8_A396EmprCod = new String[] {""} ;
      H02DN8_A10045CliAct = new String[] {""} ;
      H02DN8_A279CliNom = new String[] {""} ;
      H02DN8_A252CliCod = new int[1] ;
      AV73PARM_OPT = "" ;
      H02DN9_A1253EmprGuiRem = new String[] {""} ;
      H02DN9_A396EmprCod = new String[] {""} ;
      H02DN9_A30AlbProCod = new long[1] ;
      H02DN9_A1243GuiRemCli = new int[1] ;
      H02DN9_A1244GuiRemCln = new String[] {""} ;
      H02DN9_A14561GuiRemmf = new String[] {""} ;
      AV103GuiRemCln = "" ;
      AV109GuiRemmf = "" ;
      H02DN10_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      H02DN10_A14464ZipUrl = new String[] {""} ;
      H02DN10_n14464ZipUrl = new boolean[] {false} ;
      AV74ZipUrl = "" ;
      AV47STR_SDTListPrinter = "" ;
      AV35Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV43SDTListPrinter = new GXBaseCollection<app.SdtSDTListPrinter_SDTListPrinterItem>(app.SdtSDTListPrinter_SDTListPrinterItem.class, "SDTListPrinterItem", "TexplusNET", remoteHandle);
      AV44SDTListPrinter_item = new app.SdtSDTListPrinter_SDTListPrinterItem(remoteHandle, context);
      H02DN11_A14423JobId = new java.util.UUID[] {java.util.UUID.fromString("00000000-0000-0000-0000-000000000000")} ;
      H02DN11_A14463ZipPath = new String[] {""} ;
      H02DN11_n14463ZipPath = new boolean[] {false} ;
      AV72ZipPath = "" ;
      GXt_char2 = "" ;
      GXv_char5 = new String[1] ;
      ucDvelop_confirmpanel_deleted = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subListjobgrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      ListjobgridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.facturacion.generarjobremessa__default(),
         new Object[] {
             new Object[] {
            H02DN2_A14452DtCreat, H02DN2_n14452DtCreat, H02DN2_A14464ZipUrl, H02DN2_n14464ZipUrl, H02DN2_A14463ZipPath, H02DN2_n14463ZipPath, H02DN2_A14450JobStat, H02DN2_n14450JobStat, H02DN2_A14455TotItem, H02DN2_n14455TotItem,
            H02DN2_A14459PrgPct, H02DN2_n14459PrgPct, H02DN2_A14456PrcItem, H02DN2_n14456PrcItem, H02DN2_A14458ErItem, H02DN2_n14458ErItem, H02DN2_A14457OkItem, H02DN2_n14457OkItem, H02DN2_A14424JobType, H02DN2_n14424JobType,
            H02DN2_A14485JobDesc, H02DN2_n14485JobDesc, H02DN2_A14423JobId
            }
            , new Object[] {
            H02DN3_ALISTJOBGRID_nRecordCount
            }
            , new Object[] {
            H02DN4_AV98numeroderemessa
            }
            , new Object[] {
            H02DN5_A14468ItmId, H02DN5_A14423JobId, H02DN5_A14470DocId, H02DN5_n14470DocId
            }
            , new Object[] {
            H02DN6_A1253EmprGuiRem, H02DN6_A33AlbProEst, H02DN6_A1243GuiRemCli, H02DN6_A34AlbProfch, H02DN6_A30AlbProCod, H02DN6_A39AlbProPri, H02DN6_A396EmprCod, H02DN6_A1244GuiRemCln
            }
            , new Object[] {
            H02DN7_A396EmprCod, H02DN7_A10045CliAct, H02DN7_A279CliNom, H02DN7_A252CliCod
            }
            , new Object[] {
            H02DN8_A396EmprCod, H02DN8_A10045CliAct, H02DN8_A279CliNom, H02DN8_A252CliCod
            }
            , new Object[] {
            H02DN9_A1253EmprGuiRem, H02DN9_A396EmprCod, H02DN9_A30AlbProCod, H02DN9_A1243GuiRemCli, H02DN9_A1244GuiRemCln, H02DN9_A14561GuiRemmf
            }
            , new Object[] {
            H02DN10_A14423JobId, H02DN10_A14464ZipUrl, H02DN10_n14464ZipUrl
            }
            , new Object[] {
            H02DN11_A14423JobId, H02DN11_A14463ZipPath, H02DN11_n14463ZipPath
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV112Pgmname = "Facturacion.GenerarJobRemessa" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV112Pgmname = "Facturacion.GenerarJobRemessa" ;
      Gx_err = (short)(0) ;
      edtavPathpdf_Enabled = 0 ;
      edtavDetailwebcomponent_Enabled = 0 ;
      edtavJobdescwithtags_Enabled = 0 ;
      edtavRun_Enabled = 0 ;
      edtavRow_Enabled = 0 ;
      edtavPrgpct_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Listjobgrid_dwc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
      WebComp_Wwpaux_wc = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte LISTJOBGRID_nEOF ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A33AlbProEst ;
   private byte AV18F_header ;
   private byte AV52VerSumLin ;
   private byte nDonePA ;
   private byte subListjobgrid_Backcolorstyle ;
   private byte AV21FacEst ;
   private byte AV22FacEstto ;
   private byte AV116GXLvl427 ;
   private byte nGXWrapped ;
   private byte subListjobgrid_Backstyle ;
   private byte subListjobgrid_Titlebackstyle ;
   private byte subListjobgrid_Allowselection ;
   private byte subListjobgrid_Allowhovering ;
   private byte subListjobgrid_Allowcollapsing ;
   private byte subListjobgrid_Collapsed ;
   private short nRcdExists_10 ;
   private short nIsMod_10 ;
   private short nRcdExists_9 ;
   private short nIsMod_9 ;
   private short nRcdExists_8 ;
   private short nIsMod_8 ;
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
   private short AV79PrgPct ;
   private short AV77i ;
   private short wbEnd ;
   private short wbStart ;
   private short AV13Copias2 ;
   private short AV5Agr_Fases ;
   private short AV67GridActionGroup1 ;
   private short A14459PrgPct ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV12Copias ;
   private short AV54Year ;
   private short AV14Day ;
   private short AV36Mounth ;
   private short AV92RecordCount ;
   private short AV98numeroderemessa ;
   private short cV98numeroderemessa ;
   private short AV48Total ;
   private short AV45Seq ;
   private int subListjobgrid_Rows ;
   private int Listjobgridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_135 ;
   private int nGXsfl_135_idx=1 ;
   private int A1243GuiRemCli ;
   private int Listjobgridpaginationbar_Pagestoshow ;
   private int Popover_jobdesc_Popoverwidth ;
   private int edtavAlbprofchfrom_Enabled ;
   private int edtavAlbprofchto_Enabled ;
   private int edtavAlbprocodfrom_Enabled ;
   private int edtavAlbprocodto_Enabled ;
   private int edtavCopias2_Enabled ;
   private int edtavPathpdf_Enabled ;
   private int divTablesplittedlistprinter_Visible ;
   private int edtavPgmname_Enabled ;
   private int AV7CliCodfrom ;
   private int edtavClicodfrom_Visible ;
   private int AV9CliCodto ;
   private int edtavClicodto_Visible ;
   private int edtavListprinter_Visible ;
   private int edtavListjobgridcurrentpage_Visible ;
   private int edtavAgr_fases_Visible ;
   private int subListjobgrid_Islastpage ;
   private int edtavDetailwebcomponent_Enabled ;
   private int edtavJobdescwithtags_Enabled ;
   private int edtavRun_Enabled ;
   private int edtavRow_Enabled ;
   private int edtavPrgpct_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int8 ;
   private int GXv_int9[] ;
   private int AV62PageToGo ;
   private int A252CliCod ;
   private int nGXsfl_135_fel_idx=1 ;
   private int AV104GuiRemCli ;
   private int AV122GXV1 ;
   private int idxLst ;
   private int subListjobgrid_Backcolor ;
   private int subListjobgrid_Allbackcolor ;
   private int edtavDetailwebcomponent_Visible ;
   private int edtavJobdescwithtags_Visible ;
   private int edtavRun_Visible ;
   private int edtavRow_Visible ;
   private int edtavPrgpct_Visible ;
   private int subListjobgrid_Titlebackcolor ;
   private int subListjobgrid_Selectedindex ;
   private int subListjobgrid_Selectioncolor ;
   private int subListjobgrid_Hoveringcolor ;
   private int GX_I ;
   private long LISTJOBGRID_nFirstRecordOnPage ;
   private long AV64ListJobGridPageCount ;
   private long A14470DocId ;
   private long A30AlbProCod ;
   private long AV102AlbProCod ;
   private long AV96AlbProCodfrom ;
   private long AV97AlbProCodto ;
   private long AV63ListJobGridCurrentPage ;
   private long A14457OkItem ;
   private long A14458ErItem ;
   private long A14456PrcItem ;
   private long A14455TotItem ;
   private long LISTJOBGRID_nCurrentRecord ;
   private long LISTJOBGRID_nRecordCount ;
   private String Listjobgridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_deleted_Result ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Combo_listprinter_Selectedvalue_get ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_135_idx="0001" ;
   private String AV33Mail ;
   private String AV34ManAut ;
   private String AV37Opi ;
   private String AV40PATHPDF ;
   private String AV112Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String AV16EmprCod ;
   private String A1244GuiRemCln ;
   private String A14561GuiRemmf ;
   private String AV49UsurCod ;
   private String A39AlbProPri ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
   private String Combo_listprinter_Cls ;
   private String Combo_listprinter_Selectedvalue_set ;
   private String Combo_listprinter_Selectedtext_set ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
   private String Listjobgridpaginationbar_Class ;
   private String Listjobgridpaginationbar_Pagingbuttonsposition ;
   private String Listjobgridpaginationbar_Pagingcaptionposition ;
   private String Listjobgridpaginationbar_Emptygridclass ;
   private String Listjobgridpaginationbar_Rowsperpageoptions ;
   private String Listjobgridpaginationbar_Previous ;
   private String Listjobgridpaginationbar_Next ;
   private String Listjobgridpaginationbar_Caption ;
   private String Listjobgridpaginationbar_Emptygridcaption ;
   private String Listjobgridpaginationbar_Rowsperpagecaption ;
   private String Dvpanel_panelwccomponent_Width ;
   private String Dvpanel_panelwccomponent_Cls ;
   private String Dvpanel_panelwccomponent_Title ;
   private String Dvpanel_panelwccomponent_Iconposition ;
   private String Datamonjs_Paramstr ;
   private String Popover_jobdesc_Gridinternalname ;
   private String Popover_jobdesc_Iteminternalname ;
   private String Popover_jobdesc_Trigger ;
   private String Popover_jobdesc_Position ;
   private String Dvelop_confirmpanel_deleted_Title ;
   private String Dvelop_confirmpanel_deleted_Confirmationtext ;
   private String Dvelop_confirmpanel_deleted_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_deleted_Nobuttoncaption ;
   private String Dvelop_confirmpanel_deleted_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_deleted_Yesbuttonposition ;
   private String Dvelop_confirmpanel_deleted_Confirmtype ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Listjobgrid_empowerer_Gridinternalname ;
   private String Listjobgrid_empowerer_Popoversingrid ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divTable_filtrosgenerales_Internalname ;
   private String divUnnamedtable1_Internalname ;
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
   private String divUnnamedtable2_Internalname ;
   private String edtavAlbprofchfrom_Internalname ;
   private String TempTags ;
   private String edtavAlbprofchfrom_Jsonclick ;
   private String edtavAlbprofchto_Internalname ;
   private String edtavAlbprofchto_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtavAlbprocodfrom_Internalname ;
   private String edtavAlbprocodfrom_Jsonclick ;
   private String edtavAlbprocodto_Internalname ;
   private String edtavAlbprocodto_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavCopias2_Internalname ;
   private String edtavCopias2_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String AV42PRIO ;
   private String edtavPathpdf_Internalname ;
   private String edtavPathpdf_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divTablesplittedlistprinter_Internalname ;
   private String lblTextblockcombo_listprinter_Internalname ;
   private String lblTextblockcombo_listprinter_Jsonclick ;
   private String Combo_listprinter_Caption ;
   private String Combo_listprinter_Internalname ;
   private String divTable_acciones_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_panelwccomponent_Internalname ;
   private String divPanelwccomponent_Internalname ;
   private String divListjobgridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subListjobgrid_Internalname ;
   private String Listjobgridpaginationbar_Internalname ;
   private String divCell_listjobgrid_dwc_Internalname ;
   private String divCell_listjobgrid_dwc_Class ;
   private String WebComp_Listjobgrid_dwc_Component ;
   private String OldListjobgrid_dwc ;
   private String divTable_progress_Internalname ;
   private String Progressbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String Innewwindowpdf_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavClicodfrom_Internalname ;
   private String edtavClicodfrom_Jsonclick ;
   private String edtavClicodto_Internalname ;
   private String edtavClicodto_Jsonclick ;
   private String edtavListprinter_Internalname ;
   private String edtavListprinter_Jsonclick ;
   private String Popover_jobdesc_Internalname ;
   private String edtavListjobgridcurrentpage_Internalname ;
   private String edtavListjobgridcurrentpage_Jsonclick ;
   private String edtavAgr_fases_Internalname ;
   private String edtavAgr_fases_Jsonclick ;
   private String AV108albmarca ;
   private String Listjobgrid_empowerer_Internalname ;
   private String divDiv_wwpauxwc_Internalname ;
   private String WebComp_Wwpaux_wc_Component ;
   private String OldWwpaux_wc ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV66DetailWebComponent ;
   private String edtavDetailwebcomponent_Internalname ;
   private String edtJobId_Internalname ;
   private String edtavJobdescwithtags_Internalname ;
   private String edtJobDesc_Internalname ;
   private String edtJobType_Internalname ;
   private String edtOkItem_Internalname ;
   private String edtErItem_Internalname ;
   private String edtPrcItem_Internalname ;
   private String edtPrgPct_Internalname ;
   private String edtTotItem_Internalname ;
   private String edtZipPath_Internalname ;
   private String edtZipUrl_Internalname ;
   private String AV68Run ;
   private String edtavRun_Internalname ;
   private String edtavRow_Internalname ;
   private String edtavPrgpct_Internalname ;
   private String scmdbuf ;
   private String hsh ;
   private String AV46Station ;
   private String GXv_char3[] ;
   private String AV17EmprNom ;
   private String GXv_char4[] ;
   private String AV50Var_OutPut ;
   private String edtavRun_Class ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String A1253EmprGuiRem ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String sGXsfl_135_fel_idx="0001" ;
   private String AV103GuiRemCln ;
   private String AV109GuiRemmf ;
   private String GXt_char2 ;
   private String GXv_char5[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String tblTabledvelop_confirmpanel_deleted_Internalname ;
   private String Dvelop_confirmpanel_deleted_Internalname ;
   private String subListjobgrid_Class ;
   private String subListjobgrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavDetailwebcomponent_Jsonclick ;
   private String edtJobId_Jsonclick ;
   private String edtavJobdescwithtags_Jsonclick ;
   private String edtJobDesc_Jsonclick ;
   private String edtJobType_Jsonclick ;
   private String edtOkItem_Jsonclick ;
   private String edtErItem_Jsonclick ;
   private String edtPrcItem_Jsonclick ;
   private String edtPrgPct_Jsonclick ;
   private String edtTotItem_Jsonclick ;
   private String edtZipPath_Jsonclick ;
   private String edtZipUrl_Jsonclick ;
   private String edtavRun_Jsonclick ;
   private String edtavRow_Jsonclick ;
   private String edtavPrgpct_Jsonclick ;
   private String subListjobgrid_Header ;
   private java.util.Date A14452DtCreat ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date AV99AlbProfchfrom ;
   private java.util.Date AV100AlbProfchto ;
   private java.util.Date Gx_date ;
   private java.util.Date AV24FacFchto ;
   private java.util.Date AV23FacFchfrom ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV51VerMail ;
   private boolean Combo_listprinter_Visible ;
   private boolean Combo_listprinter_Emptyitem ;
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
   private boolean Listjobgridpaginationbar_Showfirst ;
   private boolean Listjobgridpaginationbar_Showprevious ;
   private boolean Listjobgridpaginationbar_Shownext ;
   private boolean Listjobgridpaginationbar_Showlast ;
   private boolean Listjobgridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panelwccomponent_Autowidth ;
   private boolean Dvpanel_panelwccomponent_Autoheight ;
   private boolean Dvpanel_panelwccomponent_Collapsible ;
   private boolean Dvpanel_panelwccomponent_Collapsed ;
   private boolean Dvpanel_panelwccomponent_Showcollapseicon ;
   private boolean Dvpanel_panelwccomponent_Autoscroll ;
   private boolean Popover_jobdesc_Isgriditem ;
   private boolean wbLoad ;
   private boolean bGXsfl_135_Refreshing=false ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n14485JobDesc ;
   private boolean n14424JobType ;
   private boolean n14457OkItem ;
   private boolean n14458ErItem ;
   private boolean n14456PrcItem ;
   private boolean n14459PrgPct ;
   private boolean n14455TotItem ;
   private boolean n14450JobStat ;
   private boolean n14463ZipPath ;
   private boolean n14464ZipUrl ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n14452DtCreat ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n14470DocId ;
   private boolean AV56isExist ;
   private boolean AV26isOk ;
   private boolean GXt_boolean10 ;
   private boolean GXv_boolean11[] ;
   private String AV39OutUrl ;
   private String AV47STR_SDTListPrinter ;
   private String AV41PATHTEMP ;
   private String AV30ListPrinter ;
   private String AV75JobDescWithTags ;
   private String A14485JobDesc ;
   private String A14424JobType ;
   private String A14450JobStat ;
   private String A14463ZipPath ;
   private String A14464ZipUrl ;
   private String AV78Row ;
   private String AV106Copia[] ;
   private String AV69Aviso ;
   private String AV80Cliente ;
   private String AV95Bar ;
   private String AV93Folder ;
   private String AV25FileNm ;
   private String AV38OutFile ;
   private String A13735CliCNom ;
   private String AV73PARM_OPT ;
   private String AV74ZipUrl ;
   private String AV72ZipPath ;
   private java.util.UUID AV81JobId_Selected ;
   private java.util.UUID AV71Async_JobId ;
   private java.util.UUID A14423JobId ;
   private java.util.UUID AV89AuxJobId ;
   private java.util.UUID AV27JobId ;
   private com.genexus.webpanels.GXWebGrid ListjobgridContainer ;
   private com.genexus.webpanels.GXWebRow ListjobgridRow ;
   private com.genexus.webpanels.GXWebColumn ListjobgridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Listjobgrid_dwc ;
   private GXWebComponent WebComp_Wwpaux_wc ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucCombo_listprinter ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelwccomponent ;
   private com.genexus.webpanels.GXUserControl ucListjobgridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucProgressbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucInnewwindowpdf ;
   private com.genexus.webpanels.GXUserControl ucPopover_jobdesc ;
   private com.genexus.webpanels.GXUserControl ucListjobgrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_deleted ;
   private com.genexus.util.GXDirectory AV94Directory ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXBaseCollection<app.SdtSDTListPrinter_SDTListPrinterItem> AV43SDTListPrinter ;
   private com.genexuscore.genexus.server.SdtNotificationInfo AV70NotificationInfo ;
   private app.SdtAppTool AV6AppTool ;
   private HTMLChoice cmbavF_header ;
   private HTMLChoice cmbavPrio ;
   private ICheckbox chkavMail ;
   private ICheckbox chkavManaut ;
   private ICheckbox chkavOpi ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private HTMLChoice cmbJobStat ;
   private ICheckbox chkavVermail ;
   private HTMLChoice cmbavVersumlin ;
   private HTMLChoice cmbavAlbmarca ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H02DN2_A14452DtCreat ;
   private boolean[] H02DN2_n14452DtCreat ;
   private String[] H02DN2_A14464ZipUrl ;
   private boolean[] H02DN2_n14464ZipUrl ;
   private String[] H02DN2_A14463ZipPath ;
   private boolean[] H02DN2_n14463ZipPath ;
   private String[] H02DN2_A14450JobStat ;
   private boolean[] H02DN2_n14450JobStat ;
   private long[] H02DN2_A14455TotItem ;
   private boolean[] H02DN2_n14455TotItem ;
   private short[] H02DN2_A14459PrgPct ;
   private boolean[] H02DN2_n14459PrgPct ;
   private long[] H02DN2_A14456PrcItem ;
   private boolean[] H02DN2_n14456PrcItem ;
   private long[] H02DN2_A14458ErItem ;
   private boolean[] H02DN2_n14458ErItem ;
   private long[] H02DN2_A14457OkItem ;
   private boolean[] H02DN2_n14457OkItem ;
   private String[] H02DN2_A14424JobType ;
   private boolean[] H02DN2_n14424JobType ;
   private String[] H02DN2_A14485JobDesc ;
   private boolean[] H02DN2_n14485JobDesc ;
   private java.util.UUID[] H02DN2_A14423JobId ;
   private long[] H02DN3_ALISTJOBGRID_nRecordCount ;
   private short[] H02DN4_AV98numeroderemessa ;
   private long[] H02DN5_A14468ItmId ;
   private java.util.UUID[] H02DN5_A14423JobId ;
   private long[] H02DN5_A14470DocId ;
   private boolean[] H02DN5_n14470DocId ;
   private String[] H02DN6_A1253EmprGuiRem ;
   private byte[] H02DN6_A33AlbProEst ;
   private int[] H02DN6_A1243GuiRemCli ;
   private java.util.Date[] H02DN6_A34AlbProfch ;
   private long[] H02DN6_A30AlbProCod ;
   private String[] H02DN6_A39AlbProPri ;
   private String[] H02DN6_A396EmprCod ;
   private String[] H02DN6_A1244GuiRemCln ;
   private String[] H02DN7_A396EmprCod ;
   private String[] H02DN7_A10045CliAct ;
   private String[] H02DN7_A279CliNom ;
   private int[] H02DN7_A252CliCod ;
   private String[] H02DN8_A396EmprCod ;
   private String[] H02DN8_A10045CliAct ;
   private String[] H02DN8_A279CliNom ;
   private int[] H02DN8_A252CliCod ;
   private String[] H02DN9_A1253EmprGuiRem ;
   private String[] H02DN9_A396EmprCod ;
   private long[] H02DN9_A30AlbProCod ;
   private int[] H02DN9_A1243GuiRemCli ;
   private String[] H02DN9_A1244GuiRemCln ;
   private String[] H02DN9_A14561GuiRemmf ;
   private java.util.UUID[] H02DN10_A14423JobId ;
   private String[] H02DN10_A14464ZipUrl ;
   private boolean[] H02DN10_n14464ZipUrl ;
   private java.util.UUID[] H02DN11_A14423JobId ;
   private String[] H02DN11_A14463ZipPath ;
   private boolean[] H02DN11_n14463ZipPath ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV8CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV10CliCodto_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV31ListPrinter_Data ;
   private GXBaseCollection<app.asyncbatch.SdtJobItemSdt_Item> AV28JobItem ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV35Messages ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV32ListPrinter_Data_Item ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV11Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV15DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.asyncbatch.SdtJobItemSdt_Item AV29JobItem_Row ;
   private app.SdtSDTListPrinter_SDTListPrinterItem AV44SDTListPrinter_item ;
   private app.wwpbaseobjects.SdtWWPContext AV53WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
}

final  class generarjobremessa__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02DN4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV96AlbProCodfrom ,
                                          String AV34ManAut ,
                                          long AV97AlbProCodto ,
                                          java.util.Date AV99AlbProfchfrom ,
                                          java.util.Date AV100AlbProfchto ,
                                          int AV7CliCodfrom ,
                                          int AV9CliCodto ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          byte A33AlbProEst ,
                                          String AV16EmprCod ,
                                          String AV42PRIO )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int12 = new byte[8];
      Object[] GXv_Object13 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCALPRD" ;
      addWhere(sWhereString, "(EmprCod = ?)");
      addWhere(sWhereString, "(AlbProPri = ?)");
      if ( ! (0==AV96AlbProCodfrom) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(AlbProCod >= ?)");
      }
      else
      {
         GXv_int12[2] = (byte)(1) ;
      }
      if ( ! (0==AV97AlbProCodto) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(AlbProCod <= ?)");
      }
      else
      {
         GXv_int12[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99AlbProfchfrom)) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(AlbProfch >= ?)");
      }
      else
      {
         GXv_int12[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100AlbProfchto)) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(AlbProfch <= ?)");
      }
      else
      {
         GXv_int12[5] = (byte)(1) ;
      }
      if ( ! (0==AV7CliCodfrom) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(GuiRemCli >= ?)");
      }
      else
      {
         GXv_int12[6] = (byte)(1) ;
      }
      if ( ! (0==AV9CliCodto) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(GuiRemCli <= ?)");
      }
      else
      {
         GXv_int12[7] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV34ManAut, "A") == 0 )
      {
         addWhere(sWhereString, "(AlbProEst = 0)");
      }
      scmdbuf += sWhereString ;
      GXv_Object13[0] = scmdbuf ;
      GXv_Object13[1] = GXv_int12 ;
      return GXv_Object13 ;
   }

   protected Object[] conditional_H02DN6( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV96AlbProCodfrom ,
                                          String AV34ManAut ,
                                          long AV97AlbProCodto ,
                                          java.util.Date AV99AlbProfchfrom ,
                                          java.util.Date AV100AlbProfchto ,
                                          int AV7CliCodfrom ,
                                          int AV9CliCodto ,
                                          long A30AlbProCod ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          String AV42PRIO ,
                                          String AV16EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int14 = new byte[8];
      Object[] GXv_Object15 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbProEst, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch, T1.AlbProCod, T1.AlbProPri, T1.EmprCod, T2.CliNom AS GuiRemCln FROM (TXPCALPRD" ;
      scmdbuf += " T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV96AlbProCodfrom) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int14[2] = (byte)(1) ;
      }
      if ( ! (0==AV97AlbProCodto) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int14[3] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV99AlbProfchfrom)) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int14[4] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV100AlbProfchto)) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int14[5] = (byte)(1) ;
      }
      if ( ! (0==AV7CliCodfrom) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int14[6] = (byte)(1) ;
      }
      if ( ! (0==AV9CliCodto) && ( GXutil.strcmp(AV34ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int14[7] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV34ManAut, "A") == 0 )
      {
         addWhere(sWhereString, "(T1.AlbProEst = 0)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
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
            case 2 :
                  return conditional_H02DN4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] );
            case 4 :
                  return conditional_H02DN6(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , (String)dynConstraints[1] , ((Number) dynConstraints[2]).longValue() , (java.util.Date)dynConstraints[3] , (java.util.Date)dynConstraints[4] , ((Number) dynConstraints[5]).intValue() , ((Number) dynConstraints[6]).intValue() , ((Number) dynConstraints[7]).longValue() , (java.util.Date)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).byteValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02DN2", "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT  DtCreat, ZipUrl, ZipPath, JobStat, TotItem, PrgPct, PrcItem, ErItem, OkItem, JobType, JobDesc, JobId FROM TXPJOB WHERE JobType = 'REMESSA' ORDER BY DtCreat DESC) GX_CTE) WHERE GX_ROW_NUMBER BETWEEN ? AND ? OR ? < ? AND GX_ROW_NUMBER >= ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DN3", "SELECT COUNT(*) FROM TXPJOB WHERE JobType = 'REMESSA' ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DN4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DN5", "SELECT ItmId, JobId, DocId FROM TXPJOBITE WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DN6", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DN7", "SELECT EmprCod, CliAct, CliNom, CliCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DN8", "SELECT EmprCod, CliAct, CliNom, CliCod FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02DN9", "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProCod, T1.GuiRemCli AS GuiRemCli, T2.CliNom AS GuiRemCln, T2.Cliemf AS GuiRemmf FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02DN10", "SELECT JobId, ZipUrl FROM TXPJOB WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H02DN11", "SELECT JobId, ZipPath FROM TXPJOB WHERE JobId = ? ORDER BY JobId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDateTime(1);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getVarchar(3);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((long[]) buf[8])[0] = rslt.getLong(5);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((short[]) buf[10])[0] = rslt.getShort(6);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((long[]) buf[12])[0] = rslt.getLong(7);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((long[]) buf[14])[0] = rslt.getLong(8);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((long[]) buf[16])[0] = rslt.getLong(9);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((String[]) buf[18])[0] = rslt.getVarchar(10);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getVarchar(11);
               ((boolean[]) buf[21])[0] = rslt.wasNull();
               ((java.util.UUID[]) buf[22])[0] = rslt.getGUID(12);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((java.util.UUID[]) buf[1])[0] = rslt.getGUID(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((String[]) buf[7])[0] = rslt.getString(8, 30);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((String[]) buf[5])[0] = rslt.getString(6, 40);
               return;
            case 8 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               return;
            case 9 :
               ((java.util.UUID[]) buf[0])[0] = rslt.getGUID(1);
               ((String[]) buf[1])[0] = rslt.getVarchar(2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
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
               stmt.setInt(1, ((Number) parms[0]).intValue());
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setInt(4, ((Number) parms[3]).intValue());
               stmt.setInt(5, ((Number) parms[4]).intValue());
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 3 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 4 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[10]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[11]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[12]);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[13]);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 8 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
            case 9 :
               stmt.setGUID(1, (java.util.UUID)parms[0]);
               return;
      }
   }

}

