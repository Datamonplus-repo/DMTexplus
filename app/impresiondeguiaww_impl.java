package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class impresiondeguiaww_impl extends GXDataArea
{
   public impresiondeguiaww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public impresiondeguiaww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( impresiondeguiaww_impl.class ));
   }

   public impresiondeguiaww_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavPrio = new HTMLChoice();
      cmbavManaut = new HTMLChoice();
      chkavSelected = UIFactory.getCheckbox(this);
      cmbAlbEnvFtp = new HTMLChoice();
      cmbAlbProAT = new HTMLChoice();
      cmbAlbMarca = new HTMLChoice();
      cmbAlbDivTCod = new HTMLChoice();
      cmbGuiRemDivT = new HTMLChoice();
      chkCliValA = UIFactory.getCheckbox(this);
      chkCliMailGrE = UIFactory.getCheckbox(this);
      chkCliMailPkE = UIFactory.getCheckbox(this);
      chkavSelectall = UIFactory.getCheckbox(this);
      chkavVermail = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_109 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_109"))) ;
      nGXsfl_109_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_109_idx"))) ;
      sGXsfl_109_idx = httpContext.GetPar( "sGXsfl_109_idx") ;
      chkavSelected.setTitleFormat( (short)(GXutil.lval( httpContext.GetNextPar( ))) );
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
      AV21AlbProfchfrom = localUtil.parseDateParm( httpContext.GetPar( "AlbProfchfrom")) ;
      AV22AlbProfchto = localUtil.parseDateParm( httpContext.GetPar( "AlbProfchto")) ;
      AV19AlbProCodfrom = GXutil.lval( httpContext.GetPar( "AlbProCodfrom")) ;
      AV20AlbProCodto = GXutil.lval( httpContext.GetPar( "AlbProCodto")) ;
      cmbavPrio.fromJSonString( httpContext.GetNextPar( ));
      AV18PRIO = httpContext.GetPar( "PRIO") ;
      cmbavManaut.fromJSonString( httpContext.GetNextPar( ));
      AV15ManAut = httpContext.GetPar( "ManAut") ;
      AV23CliCodfrom = (int)(GXutil.lval( httpContext.GetPar( "CliCodfrom"))) ;
      AV24CliCodto = (int)(GXutil.lval( httpContext.GetPar( "CliCodto"))) ;
      AV44EmprCod = httpContext.GetPar( "EmprCod") ;
      AV91LoadGridData = GXutil.strtobool( httpContext.GetPar( "LoadGridData")) ;
      AV67EmprCodJson = httpContext.GetPar( "EmprCodJson") ;
      AV71AlbProCodJson = httpContext.GetPar( "AlbProCodJson") ;
      AV28TFAlbProCod = GXutil.lval( httpContext.GetPar( "TFAlbProCod")) ;
      AV29TFAlbProCod_To = GXutil.lval( httpContext.GetPar( "TFAlbProCod_To")) ;
      AV88TFGuiRemCln = httpContext.GetPar( "TFGuiRemCln") ;
      AV89TFGuiRemCln_Sel = httpContext.GetPar( "TFGuiRemCln_Sel") ;
      AV55TFCliMailGrE_Sel = httpContext.GetPar( "TFCliMailGrE_Sel") ;
      AV49TFCliMailGr = httpContext.GetPar( "TFCliMailGr") ;
      AV50TFCliMailGr_Sel = httpContext.GetPar( "TFCliMailGr_Sel") ;
      AV56TFCliMailPkE_Sel = httpContext.GetPar( "TFCliMailPkE_Sel") ;
      AV51TFCliMailPk = httpContext.GetPar( "TFCliMailPk") ;
      AV52TFCliMailPk_Sel = httpContext.GetPar( "TFCliMailPk_Sel") ;
      AV223Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      chkavSelected.setTitleFormat( (short)(GXutil.lval( httpContext.GetNextPar( ))) );
      AV17PATHPDF = httpContext.GetPar( "PATHPDF") ;
      AV14Copias2 = (short)(GXutil.lval( httpContext.GetPar( "Copias2"))) ;
      AV65i = GXutil.lval( httpContext.GetPar( "i")) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV66EmprCodCol);
      AV69EmprCodToFind = httpContext.GetPar( "EmprCodToFind") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV70AlbProCodCol);
      AV73AlbProCodToFind = GXutil.lval( httpContext.GetPar( "AlbProCodToFind")) ;
      AV86SelectAll = GXutil.strtobool( httpContext.GetPar( "SelectAll")) ;
      AV16VerMail = GXutil.strtobool( httpContext.GetPar( "VerMail")) ;
      AV113MostrarMail = GXutil.strtobool( httpContext.GetPar( "MostrarMail")) ;
      AV214CliNom = httpContext.GetPar( "CliNom") ;
      AV108Usumail = httpContext.GetPar( "Usumail") ;
      AV45EmprNom = httpContext.GetPar( "EmprNom") ;
      AV102PathXLS_Email = httpContext.GetPar( "PathXLS_Email") ;
      AV101PathPDF_Email = httpContext.GetPar( "PathPDF_Email") ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV28TFAlbProCod, AV29TFAlbProCod_To, AV88TFGuiRemCln, AV89TFGuiRemCln_Sel, AV55TFCliMailGrE_Sel, AV49TFCliMailGr, AV50TFCliMailGr_Sel, AV56TFCliMailPkE_Sel, AV51TFCliMailPk, AV52TFCliMailPk_Sel, AV223Pgmname, AV12OrderedBy, AV13OrderedDsc, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV86SelectAll, AV16VerMail, AV113MostrarMail, AV214CliNom, AV108Usumail, AV45EmprNom, AV102PathXLS_Email, AV101PathPDF_Email, Gx_date) ;
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
      pa29D2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start29D2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.impresiondeguiaww", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV113MostrarMail));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV214CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108Usumail, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45EmprNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHXLS_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102PathXLS_Email, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV101PathPDF_Email, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ImpresionDeGuiaww");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV223Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("impresiondeguiaww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROFCHFROM", localUtil.format(AV21AlbProfchfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROFCHTO", localUtil.format(AV22AlbProfchto, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROCODFROM", GXutil.ltrim( localUtil.ntoc( AV19AlbProCodfrom, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROCODTO", GXutil.ltrim( localUtil.ntoc( AV20AlbProCodto, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vPRIO", GXutil.rtrim( AV18PRIO));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vMANAUT", GXutil.rtrim( AV15ManAut));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODFROM", GXutil.ltrim( localUtil.ntoc( AV23CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vCLICODTO", GXutil.ltrim( localUtil.ntoc( AV24CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_109", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_109, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODFROM_DATA", AV40CliCodfrom_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODFROM_DATA", AV40CliCodfrom_Data);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCLICODTO_DATA", AV42CliCodto_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCLICODTO_DATA", AV42CliCodto_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV38GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV39GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV36DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV36DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vLOADGRIDDATA", AV91LoadGridData);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCODJSON", AV67EmprCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCODJSON", AV71AlbProCodJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV28TFAlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD_TO", GXutil.ltrim( localUtil.ntoc( AV29TFAlbProCod_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLN", GXutil.rtrim( AV88TFGuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLN_SEL", GXutil.rtrim( AV89TFGuiRemCln_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIMAILGRE_SEL", GXutil.rtrim( AV55TFCliMailGrE_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIMAILGR", GXutil.rtrim( AV49TFCliMailGr));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIMAILGR_SEL", GXutil.rtrim( AV50TFCliMailGr_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIMAILPKE_SEL", GXutil.rtrim( AV56TFCliMailPkE_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIMAILPK", GXutil.rtrim( AV51TFCliMailPk));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCLIMAILPK_SEL", GXutil.rtrim( AV52TFCliMailPk_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV65i, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vEMPRCODCOL", AV66EmprCodCol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vEMPRCODCOL", AV66EmprCodCol);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCODTOFIND", GXutil.rtrim( AV69EmprCodToFind));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vALBPROCODCOL", AV70AlbProCodCol);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vALBPROCODCOL", AV70AlbProCodCol);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROCODTOFIND", GXutil.ltrim( localUtil.ntoc( AV73AlbProCodToFind, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSELECTEDROWS", AV63SelectedRows);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSELECTEDROWS", AV63SelectedRows);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vICON_GXI", AV235Icon_GXI);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV44EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44EmprCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLISTACORREOSCOPIAOCULTA", AV109ListaCorreosCopiaOculta);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLISTACORREOSCOPIAOCULTA", AV109ListaCorreosCopiaOculta);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLISTACORREOSCOPIA", AV111ListaCorreosCopia);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLISTACORREOSCOPIA", AV111ListaCorreosCopia);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vLISTACORREOSDESTINO", AV107ListaCorreosDestino);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vLISTACORREOSDESTINO", AV107ListaCorreosDestino);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOSEPARADOR", AV105TextoSeparador);
      app.GxWebStd.gx_hidden_field( httpContext, "vASUNTO", AV116Asunto);
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOCORREO", AV110TextoCorreo);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMOSTRARMAIL", AV113MostrarMail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV113MostrarMail));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLIMAILGR", GXutil.rtrim( AV213CliMailGr));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV214CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV214CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSUMAIL", GXutil.rtrim( AV108Usumail));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108Usumail, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRNOM", GXutil.rtrim( AV45EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45EmprNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHXLS_EMAIL", AV102PathXLS_Email);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHXLS_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102PathXLS_Email, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHPDF_EMAIL", AV101PathPDF_Email);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV101PathPDF_Email, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Cls", GXutil.rtrim( Combo_clicodfrom_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_set", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Emptyitemtext", GXutil.rtrim( Combo_clicodfrom_Emptyitemtext));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Cls", GXutil.rtrim( Combo_clicodto_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_set", GXutil.rtrim( Combo_clicodto_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Emptyitemtext", GXutil.rtrim( Combo_clicodto_Emptyitemtext));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistfixedvalues", GXutil.rtrim( Ddo_grid_Datalistfixedvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODTO_Selectedvalue_get", GXutil.rtrim( Combo_clicodto_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_CLICODFROM_Selectedvalue_get", GXutil.rtrim( Combo_clicodfrom_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "vSELECTED_Titleformat", GXutil.ltrim( localUtil.ntoc( chkavSelected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
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
         we29D2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt29D2( ) ;
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
      return formatLink("app.impresiondeguiaww", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ImpresionDeGuiaww" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Albaran de Produccion", "") ;
   }

   public void wb29D0( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", divLayoutmaintable_Class, "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDivheader_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "header");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodfrom_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "", "", lblTextblockcombo_clicodfrom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ImpresionDeGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodfrom.setProperty("Caption", Combo_clicodfrom_Caption);
         ucCombo_clicodfrom.setProperty("Cls", Combo_clicodfrom_Cls);
         ucCombo_clicodfrom.setProperty("EmptyItemText", Combo_clicodfrom_Emptyitemtext);
         ucCombo_clicodfrom.setProperty("DropDownOptionsData", AV40CliCodfrom_Data);
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_clicodto_Internalname, httpContext.getMessage( "Cliente Final", ""), "", "", lblTextblockcombo_clicodto_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_ImpresionDeGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_clicodto.setProperty("Caption", Combo_clicodto_Caption);
         ucCombo_clicodto.setProperty("Cls", Combo_clicodto_Cls);
         ucCombo_clicodto.setProperty("EmptyItemText", Combo_clicodto_Emptyitemtext);
         ucCombo_clicodto.setProperty("DropDownOptionsData", AV42CliCodto_Data);
         ucCombo_clicodto.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_clicodto_Internalname, "COMBO_CLICODTOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchfrom_Internalname, httpContext.getMessage( "Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 48,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchfrom_Internalname, localUtil.format(AV21AlbProfchfrom, "99/99/99"), localUtil.format( AV21AlbProfchfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,48);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionDeGuiaww.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ImpresionDeGuiaww.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchto_Internalname, httpContext.getMessage( "Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 52,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchto_Internalname, localUtil.format(AV22AlbProfchto, "99/99/99"), localUtil.format( AV22AlbProfchto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,52);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionDeGuiaww.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ImpresionDeGuiaww.htm");
         httpContext.writeTextNL( "</div>") ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV19AlbProCodfrom, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocodfrom_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19AlbProCodfrom), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19AlbProCodfrom), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocodfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocodfrom_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionDeGuiaww.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV20AlbProCodto, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocodto_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20AlbProCodto), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20AlbProCodto), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocodto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocodto_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionDeGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavPrio.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavPrio.getInternalname(), httpContext.getMessage( "Tipo de Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPrio, cmbavPrio.getInternalname(), GXutil.rtrim( AV18PRIO), 1, cmbavPrio.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavPrio.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,74);\"", "", true, (byte)(0), "HLP_ImpresionDeGuiaww.htm");
         cmbavPrio.setValue( GXutil.rtrim( AV18PRIO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavManaut.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavManaut.getInternalname(), httpContext.getMessage( "Tipo de Impresion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavManaut, cmbavManaut.getInternalname(), GXutil.rtrim( AV15ManAut), 1, cmbavManaut.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavManaut.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,78);\"", "", true, (byte)(0), "HLP_ImpresionDeGuiaww.htm");
         cmbavManaut.setValue( GXutil.rtrim( AV15ManAut) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavManaut.getInternalname(), "Values", cmbavManaut.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtn_search_Internalname, "gx.evt.setGridEvt("+GXutil.str( 109, 3, 0)+","+"null"+");", httpContext.getMessage( "Ver resultado", ""), bttBtn_search_Jsonclick, 5, httpContext.getMessage( "GX_BtnSearch", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSEARCH\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ImpresionDeGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "header");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop24", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableoptions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableaction_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Right", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 100,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial WWPBtnNeedMultiRowSelection" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnprocessar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 109, 3, 0)+","+"null"+");", httpContext.getMessage( "Processar", ""), bttBtnprocessar_Jsonclick, 5, httpContext.getMessage( "Clique para processar os relatorios!", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOPROCESSAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ImpresionDeGuiaww.htm");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         startgridcontrol109( ) ;
      }
      if ( wbEnd == 109 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_109 = (int)(nGXsfl_109_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV38GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV39GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV223Pgmname), GXutil.rtrim( localUtil.format( AV223Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ImpresionDeGuiaww.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodfrom_Internalname, GXutil.ltrim( localUtil.ntoc( AV23CliCodfrom, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV23CliCodfrom), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodfrom_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodfrom_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionDeGuiaww.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodto_Internalname, GXutil.ltrim( localUtil.ntoc( AV24CliCodto, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV24CliCodto), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodto_Jsonclick, 0, "Attribute", "", "", "", "", edtavClicodto_Visible, 1, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionDeGuiaww.htm");
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
         ucDdo_grid.setProperty("DataListFixedValues", Ddo_grid_Datalistfixedvalues);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV36DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 187,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavSelectall.getInternalname(), GXutil.booltostr( AV86SelectAll), "", "", chkavSelectall.getVisible(), 1, "true", "", StyleString, ClassString, "", "", TempTags+" onblur=\""+""+";gx.evt.onblur(this,187);\"");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 188,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavVermail.getInternalname(), GXutil.booltostr( AV16VerMail), "", "", chkavVermail.getVisible(), 1, "true", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(188, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,188);\"");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPathpdf_Internalname, GXutil.rtrim( AV17PATHPDF), GXutil.rtrim( localUtil.format( AV17PATHPDF, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPathpdf_Jsonclick, 0, "Attribute", "", "", "", "", edtavPathpdf_Visible, 1, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ImpresionDeGuiaww.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 190,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCopias2_Internalname, GXutil.ltrim( localUtil.ntoc( AV14Copias2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV14Copias2), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,190);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCopias2_Jsonclick, 0, "Attribute", "", "", "", "", edtavCopias2_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ImpresionDeGuiaww.htm");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 191,'',false,'" + sGXsfl_109_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInfo_Internalname, AV112Info, GXutil.rtrim( localUtil.format( AV112Info, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,191);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInfo_Jsonclick, 0, "Attribute", "", "", "", "", edtavInfo_Visible, 1, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ImpresionDeGuiaww.htm");
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
      if ( wbEnd == 109 )
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

   public void start29D2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Albaran de Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup29D0( ) ;
   }

   public void ws29D2( )
   {
      start29D2( ) ;
      evt29D2( ) ;
   }

   public void evt29D2( )
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
                           e1129D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "COMBO_CLICODTO.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1229D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1329D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1429D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1529D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSEARCH'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSearch' */
                           e1629D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPROCESSAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoProcessar' */
                           e1729D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VSELECTALL.CLICK") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1829D2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPROCODFROM.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1929D2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "VICON.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VSELECTED.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VSELECTED.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "VICON.CLICK") == 0 ) )
                        {
                           nGXsfl_109_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1092( ) ;
                           AV62Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
                           n407EmprNom = false ;
                           A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
                           A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
                           A4023AlbFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbFecSal_Internalname), 0)) ;
                           A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
                           A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
                           A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
                           A3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1259AlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1259AlbDomEnv = false ;
                           A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
                           n841TrnNom = false ;
                           A3868AlbMat = httpContext.cgiGet( edtAlbMat_Internalname) ;
                           A2242AlbSec = GXutil.upper( httpContext.cgiGet( edtAlbSec_Internalname)) ;
                           cmbAlbEnvFtp.setName( cmbAlbEnvFtp.getInternalname() );
                           cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
                           A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
                           A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
                           cmbAlbProAT.setName( cmbAlbProAT.getInternalname() );
                           cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
                           A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
                           A10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtAlbHhfm_Internalname), 0) ;
                           A10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( edtAlbGrossT_Internalname)) ;
                           A10837AlbTrnNc = httpContext.cgiGet( edtAlbTrnNc_Internalname) ;
                           A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
                           n10017AlbFmd = false ;
                           A10835AlbTrnNm = httpContext.cgiGet( edtAlbTrnNm_Internalname) ;
                           A10018ALbFmdc = httpContext.cgiGet( edtALbFmdc_Internalname) ;
                           A10836AlbTrnDm = httpContext.cgiGet( edtAlbTrnDm_Internalname) ;
                           cmbAlbMarca.setName( cmbAlbMarca.getInternalname() );
                           cmbAlbMarca.setValue( httpContext.cgiGet( cmbAlbMarca.getInternalname()) );
                           A5140AlbMarca = httpContext.cgiGet( cmbAlbMarca.getInternalname()) ;
                           A3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbLocDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbLocCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPObsCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A5141AlbIvaCod = GXutil.upper( httpContext.cgiGet( edtAlbIvaCod_Internalname)) ;
                           A7987AlbColCa = httpContext.cgiGet( edtAlbColCa_Internalname) ;
                           A7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbDesp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A7986AlbCambio = localUtil.ctond( httpContext.cgiGet( edtAlbCambio_Internalname)) ;
                           A7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbTipDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A7984AlbMotTr = httpContext.cgiGet( edtAlbMotTr_Internalname) ;
                           A5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTipCal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A7988AlbObsCb = httpContext.cgiGet( edtAlbObsCb_Internalname) ;
                           A7102AlbNumT = localUtil.ctol( httpContext.cgiGet( edtAlbNumT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A7100AlbMarCo = httpContext.cgiGet( edtAlbMarCo_Internalname) ;
                           A7099AlbOComp = httpContext.cgiGet( edtAlbOComp_Internalname) ;
                           A3643TrnNif = GXutil.upper( httpContext.cgiGet( edtTrnNif_Internalname)) ;
                           n3643TrnNif = false ;
                           cmbAlbDivTCod.setName( cmbAlbDivTCod.getInternalname() );
                           cmbAlbDivTCod.setValue( httpContext.cgiGet( cmbAlbDivTCod.getInternalname()) );
                           A3093AlbDivTCod = httpContext.cgiGet( cmbAlbDivTCod.getInternalname()) ;
                           n3093AlbDivTCod = false ;
                           A3109AlbDivAbr = httpContext.cgiGet( edtAlbDivAbr_Internalname) ;
                           n3109AlbDivAbr = false ;
                           A3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n3108AlbDivCod = false ;
                           A1260BusDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtBusDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1260BusDomEnv = false ;
                           A1253EmprGuiRem = GXutil.upper( httpContext.cgiGet( edtEmprGuiRem_Internalname)) ;
                           A1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( edtGuiRemDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1258GuiRemDom = false ;
                           cmbGuiRemDivT.setName( cmbGuiRemDivT.getInternalname() );
                           cmbGuiRemDivT.setValue( httpContext.cgiGet( cmbGuiRemDivT.getInternalname()) );
                           A3145GuiRemDivT = httpContext.cgiGet( cmbGuiRemDivT.getInternalname()) ;
                           n3145GuiRemDivT = false ;
                           A3110GuiRemDiv = (byte)(localUtil.ctol( httpContext.cgiGet( edtGuiRemDiv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n3110GuiRemDiv = false ;
                           A1902CliValA = ((GXutil.strcmp(httpContext.cgiGet( chkCliValA.getInternalname()), "S")==0) ? "S" : "N") ;
                           n1902CliValA = false ;
                           A11622CliMailGrE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailGrE.getInternalname()), "S")==0) ? "S" : "N") ;
                           n11622CliMailGrE = false ;
                           A11620CliMailGr = httpContext.cgiGet( edtCliMailGr_Internalname) ;
                           n11620CliMailGr = false ;
                           A11623CliMailPkE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailPkE.getInternalname()), "S")==0) ? "S" : "N") ;
                           n11623CliMailPkE = false ;
                           A11621CliMailPk = httpContext.cgiGet( edtCliMailPk_Internalname) ;
                           n11621CliMailPk = false ;
                           A10301Cod_pais = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_pais_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n10301Cod_pais = false ;
                           AV87Icon = httpContext.cgiGet( edtavIcon_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV235Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_109_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
                           AV98Grid_PathPdf = httpContext.cgiGet( edtavGrid_pathpdf_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGrid_pathpdf_Internalname, AV98Grid_PathPdf);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_PATHPDF"+"_"+sGXsfl_109_idx, getSecureSignedToken( sGXsfl_109_idx, GXutil.rtrim( localUtil.format( AV98Grid_PathPdf, ""))));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID_NMRCOPIA");
                              GX_FocusControl = edtavGrid_nmrcopia_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV100Grid_NmrCopia = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGrid_nmrcopia_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_NMRCOPIA"+"_"+sGXsfl_109_idx, getSecureSignedToken( sGXsfl_109_idx, localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")));
                           }
                           else
                           {
                              AV100Grid_NmrCopia = (short)(localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGrid_nmrcopia_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_NMRCOPIA"+"_"+sGXsfl_109_idx, getSecureSignedToken( sGXsfl_109_idx, localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")));
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
                                 e2029D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2129D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2229D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VICON.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2329D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VSELECTED.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2429D2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Albprofchfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPROFCHFROM"), 0), AV21AlbProfchfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprofchto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPROFCHTO"), 0), AV22AlbProfchto) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprocodfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROCODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV19AlbProCodfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprocodto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV20AlbProCodto )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Prio Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPRIO"), AV18PRIO) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Manaut Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMANAUT"), AV15ManAut) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicodfrom Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV23CliCodfrom )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Clicodto Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV24CliCodto )
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

   public void we29D2( )
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

   public void pa29D2( )
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

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_1092( ) ;
      while ( nGXsfl_109_idx <= nRC_GXsfl_109 )
      {
         sendrow_1092( ) ;
         nGXsfl_109_idx = ((subGrid_Islastpage==1)&&(nGXsfl_109_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_109_idx+1) ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.util.Date AV21AlbProfchfrom ,
                                 java.util.Date AV22AlbProfchto ,
                                 long AV19AlbProCodfrom ,
                                 long AV20AlbProCodto ,
                                 String AV18PRIO ,
                                 String AV15ManAut ,
                                 int AV23CliCodfrom ,
                                 int AV24CliCodto ,
                                 String AV44EmprCod ,
                                 boolean AV91LoadGridData ,
                                 String AV67EmprCodJson ,
                                 String AV71AlbProCodJson ,
                                 long AV28TFAlbProCod ,
                                 long AV29TFAlbProCod_To ,
                                 String AV88TFGuiRemCln ,
                                 String AV89TFGuiRemCln_Sel ,
                                 String AV55TFCliMailGrE_Sel ,
                                 String AV49TFCliMailGr ,
                                 String AV50TFCliMailGr_Sel ,
                                 String AV56TFCliMailPkE_Sel ,
                                 String AV51TFCliMailPk ,
                                 String AV52TFCliMailPk_Sel ,
                                 String AV223Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV17PATHPDF ,
                                 short AV14Copias2 ,
                                 long AV65i ,
                                 GXSimpleCollection<String> AV66EmprCodCol ,
                                 String AV69EmprCodToFind ,
                                 GXSimpleCollection<Long> AV70AlbProCodCol ,
                                 long AV73AlbProCodToFind ,
                                 boolean AV86SelectAll ,
                                 boolean AV16VerMail ,
                                 boolean AV113MostrarMail ,
                                 String AV214CliNom ,
                                 String AV108Usumail ,
                                 String AV45EmprNom ,
                                 String AV102PathXLS_Email ,
                                 String AV101PathPDF_Email ,
                                 java.util.Date Gx_date )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2129D2 ();
      GRID_nCurrentRecord = 0 ;
      rf29D2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ImpresionDeGuiaww");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV223Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("impresiondeguiaww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_PATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV98Grid_PathPdf, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID_PATHPDF", AV98Grid_PathPdf);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_NMRCOPIA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID_NMRCOPIA", GXutil.ltrim( localUtil.ntoc( AV100Grid_NmrCopia, (byte)(4), (byte)(0), ".", "")));
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
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV18PRIO = cmbavPrio.getValidValue(AV18PRIO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18PRIO", AV18PRIO);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPrio.setValue( GXutil.rtrim( AV18PRIO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
      }
      if ( cmbavManaut.getItemCount() > 0 )
      {
         AV15ManAut = cmbavManaut.getValidValue(AV15ManAut) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15ManAut", AV15ManAut);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavManaut.setValue( GXutil.rtrim( AV15ManAut) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavManaut.getInternalname(), "Values", cmbavManaut.ToJavascriptSource(), true);
      }
      AV86SelectAll = GXutil.strtobool( GXutil.booltostr( AV86SelectAll)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86SelectAll", AV86SelectAll);
      AV16VerMail = GXutil.strtobool( GXutil.booltostr( AV16VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16VerMail", AV16VerMail);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf29D2( ) ;
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
      AV223Pgmname = "ImpresionDeGuiaww" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV223Pgmname", AV223Pgmname);
      Gx_err = (short)(0) ;
      edtavGrid_pathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_pathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_pathpdf_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      edtavGrid_nmrcopia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_nmrcopia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_nmrcopia_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf29D2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(109) ;
      /* Execute user event: Refresh */
      e2129D2 ();
      nGXsfl_109_idx = 1 ;
      sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1092( ) ;
      bGXsfl_109_Refreshing = true ;
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
         subsflControlProps_1092( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Long.valueOf(AV225Impresiondeguiawwds_1_tfalbprocod) ,
                                              Long.valueOf(AV226Impresiondeguiawwds_2_tfalbprocod_to) ,
                                              AV228Impresiondeguiawwds_4_tfguiremcln_sel ,
                                              AV227Impresiondeguiawwds_3_tfguiremcln ,
                                              AV229Impresiondeguiawwds_5_tfclimailgre_sel ,
                                              AV231Impresiondeguiawwds_7_tfclimailgr_sel ,
                                              AV230Impresiondeguiawwds_6_tfclimailgr ,
                                              AV232Impresiondeguiawwds_8_tfclimailpke_sel ,
                                              AV234Impresiondeguiawwds_10_tfclimailpk_sel ,
                                              AV233Impresiondeguiawwds_9_tfclimailpk ,
                                              Boolean.valueOf(AV91LoadGridData) ,
                                              Long.valueOf(AV19AlbProCodfrom) ,
                                              AV15ManAut ,
                                              Long.valueOf(AV20AlbProCodto) ,
                                              AV21AlbProfchfrom ,
                                              AV22AlbProfchto ,
                                              Integer.valueOf(AV23CliCodfrom) ,
                                              Integer.valueOf(AV24CliCodto) ,
                                              Long.valueOf(A30AlbProCod) ,
                                              A1244GuiRemCln ,
                                              A11622CliMailGrE ,
                                              A11620CliMailGr ,
                                              A11623CliMailPkE ,
                                              A11621CliMailPk ,
                                              A396EmprCod ,
                                              A34AlbProfch ,
                                              Integer.valueOf(A1243GuiRemCli) ,
                                              Byte.valueOf(A33AlbProEst) ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A39AlbProPri ,
                                              AV18PRIO ,
                                              AV44EmprCod } ,
                                              new int[]{
                                              TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE,
                                              TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV227Impresiondeguiawwds_3_tfguiremcln = GXutil.padr( GXutil.rtrim( AV227Impresiondeguiawwds_3_tfguiremcln), 30, "%") ;
         lV230Impresiondeguiawwds_6_tfclimailgr = GXutil.padr( GXutil.rtrim( AV230Impresiondeguiawwds_6_tfclimailgr), 100, "%") ;
         lV233Impresiondeguiawwds_9_tfclimailpk = GXutil.padr( GXutil.rtrim( AV233Impresiondeguiawwds_9_tfclimailpk), 100, "%") ;
         /* Using cursor H029D2 */
         pr_default.execute(0, new Object[] {AV44EmprCod, AV18PRIO, Long.valueOf(AV225Impresiondeguiawwds_1_tfalbprocod), Long.valueOf(AV226Impresiondeguiawwds_2_tfalbprocod_to), lV227Impresiondeguiawwds_3_tfguiremcln, AV228Impresiondeguiawwds_4_tfguiremcln_sel, AV229Impresiondeguiawwds_5_tfclimailgre_sel, lV230Impresiondeguiawwds_6_tfclimailgr, AV231Impresiondeguiawwds_7_tfclimailgr_sel, AV232Impresiondeguiawwds_8_tfclimailpke_sel, lV233Impresiondeguiawwds_9_tfclimailpk, AV234Impresiondeguiawwds_10_tfclimailpk_sel, Long.valueOf(AV19AlbProCodfrom), Long.valueOf(AV20AlbProCodto), AV21AlbProfchfrom, AV22AlbProfchto, Integer.valueOf(AV23CliCodfrom), Integer.valueOf(AV24CliCodto), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_109_idx = 1 ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A10301Cod_pais = H029D2_A10301Cod_pais[0] ;
            n10301Cod_pais = H029D2_n10301Cod_pais[0] ;
            A11621CliMailPk = H029D2_A11621CliMailPk[0] ;
            n11621CliMailPk = H029D2_n11621CliMailPk[0] ;
            A11623CliMailPkE = H029D2_A11623CliMailPkE[0] ;
            n11623CliMailPkE = H029D2_n11623CliMailPkE[0] ;
            A11620CliMailGr = H029D2_A11620CliMailGr[0] ;
            n11620CliMailGr = H029D2_n11620CliMailGr[0] ;
            A11622CliMailGrE = H029D2_A11622CliMailGrE[0] ;
            n11622CliMailGrE = H029D2_n11622CliMailGrE[0] ;
            A1902CliValA = H029D2_A1902CliValA[0] ;
            n1902CliValA = H029D2_n1902CliValA[0] ;
            A3110GuiRemDiv = H029D2_A3110GuiRemDiv[0] ;
            n3110GuiRemDiv = H029D2_n3110GuiRemDiv[0] ;
            A3145GuiRemDivT = H029D2_A3145GuiRemDivT[0] ;
            n3145GuiRemDivT = H029D2_n3145GuiRemDivT[0] ;
            A1258GuiRemDom = H029D2_A1258GuiRemDom[0] ;
            n1258GuiRemDom = H029D2_n1258GuiRemDom[0] ;
            A1253EmprGuiRem = H029D2_A1253EmprGuiRem[0] ;
            A3108AlbDivCod = H029D2_A3108AlbDivCod[0] ;
            n3108AlbDivCod = H029D2_n3108AlbDivCod[0] ;
            A3109AlbDivAbr = H029D2_A3109AlbDivAbr[0] ;
            n3109AlbDivAbr = H029D2_n3109AlbDivAbr[0] ;
            A3093AlbDivTCod = H029D2_A3093AlbDivTCod[0] ;
            n3093AlbDivTCod = H029D2_n3093AlbDivTCod[0] ;
            A3643TrnNif = H029D2_A3643TrnNif[0] ;
            n3643TrnNif = H029D2_n3643TrnNif[0] ;
            A7099AlbOComp = H029D2_A7099AlbOComp[0] ;
            A7100AlbMarCo = H029D2_A7100AlbMarCo[0] ;
            A7102AlbNumT = H029D2_A7102AlbNumT[0] ;
            A7988AlbObsCb = H029D2_A7988AlbObsCb[0] ;
            A5803AlbTipCal = H029D2_A5803AlbTipCal[0] ;
            A7984AlbMotTr = H029D2_A7984AlbMotTr[0] ;
            A7985AlbTipDoc = H029D2_A7985AlbTipDoc[0] ;
            A7986AlbCambio = H029D2_A7986AlbCambio[0] ;
            A7162AlbDesp = H029D2_A7162AlbDesp[0] ;
            A7987AlbColCa = H029D2_A7987AlbColCa[0] ;
            A5141AlbIvaCod = H029D2_A5141AlbIvaCod[0] ;
            A914AlbPObsCon = H029D2_A914AlbPObsCon[0] ;
            A3866AlbLocCar = H029D2_A3866AlbLocCar[0] ;
            A3867AlbLocDes = H029D2_A3867AlbLocDes[0] ;
            A5140AlbMarca = H029D2_A5140AlbMarca[0] ;
            A10836AlbTrnDm = H029D2_A10836AlbTrnDm[0] ;
            A10018ALbFmdc = H029D2_A10018ALbFmdc[0] ;
            A10835AlbTrnNm = H029D2_A10835AlbTrnNm[0] ;
            A10017AlbFmd = H029D2_A10017AlbFmd[0] ;
            n10017AlbFmd = H029D2_n10017AlbFmd[0] ;
            A10837AlbTrnNc = H029D2_A10837AlbTrnNc[0] ;
            A10020AlbGrossT = H029D2_A10020AlbGrossT[0] ;
            A10019AlbHhfm = H029D2_A10019AlbHhfm[0] ;
            A10765AlbProAT = H029D2_A10765AlbProAT[0] ;
            A7101AlbLic = H029D2_A7101AlbLic[0] ;
            A5805AlbEnvFtp = H029D2_A5805AlbEnvFtp[0] ;
            A2242AlbSec = H029D2_A2242AlbSec[0] ;
            A3868AlbMat = H029D2_A3868AlbMat[0] ;
            A841TrnNom = H029D2_A841TrnNom[0] ;
            n841TrnNom = H029D2_n841TrnNom[0] ;
            A840TrnCod = H029D2_A840TrnCod[0] ;
            A1259AlbDomEnv = H029D2_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = H029D2_n1259AlbDomEnv[0] ;
            A3869AlbCliDes = H029D2_A3869AlbCliDes[0] ;
            A1244GuiRemCln = H029D2_A1244GuiRemCln[0] ;
            A1243GuiRemCli = H029D2_A1243GuiRemCli[0] ;
            A7098AlbUsu = H029D2_A7098AlbUsu[0] ;
            A3865AlbHorSal = H029D2_A3865AlbHorSal[0] ;
            A4023AlbFecSal = H029D2_A4023AlbFecSal[0] ;
            A34AlbProfch = H029D2_A34AlbProfch[0] ;
            A33AlbProEst = H029D2_A33AlbProEst[0] ;
            A39AlbProPri = H029D2_A39AlbProPri[0] ;
            A30AlbProCod = H029D2_A30AlbProCod[0] ;
            A407EmprNom = H029D2_A407EmprNom[0] ;
            n407EmprNom = H029D2_n407EmprNom[0] ;
            A396EmprCod = H029D2_A396EmprCod[0] ;
            A1260BusDomEnv = H029D2_A1260BusDomEnv[0] ;
            n1260BusDomEnv = H029D2_n1260BusDomEnv[0] ;
            A3109AlbDivAbr = H029D2_A3109AlbDivAbr[0] ;
            n3109AlbDivAbr = H029D2_n3109AlbDivAbr[0] ;
            A10301Cod_pais = H029D2_A10301Cod_pais[0] ;
            n10301Cod_pais = H029D2_n10301Cod_pais[0] ;
            A11621CliMailPk = H029D2_A11621CliMailPk[0] ;
            n11621CliMailPk = H029D2_n11621CliMailPk[0] ;
            A11623CliMailPkE = H029D2_A11623CliMailPkE[0] ;
            n11623CliMailPkE = H029D2_n11623CliMailPkE[0] ;
            A11620CliMailGr = H029D2_A11620CliMailGr[0] ;
            n11620CliMailGr = H029D2_n11620CliMailGr[0] ;
            A11622CliMailGrE = H029D2_A11622CliMailGrE[0] ;
            n11622CliMailGrE = H029D2_n11622CliMailGrE[0] ;
            A1902CliValA = H029D2_A1902CliValA[0] ;
            n1902CliValA = H029D2_n1902CliValA[0] ;
            A3110GuiRemDiv = H029D2_A3110GuiRemDiv[0] ;
            n3110GuiRemDiv = H029D2_n3110GuiRemDiv[0] ;
            A3145GuiRemDivT = H029D2_A3145GuiRemDivT[0] ;
            n3145GuiRemDivT = H029D2_n3145GuiRemDivT[0] ;
            A1244GuiRemCln = H029D2_A1244GuiRemCln[0] ;
            A1260BusDomEnv = H029D2_A1260BusDomEnv[0] ;
            n1260BusDomEnv = H029D2_n1260BusDomEnv[0] ;
            A407EmprNom = H029D2_A407EmprNom[0] ;
            n407EmprNom = H029D2_n407EmprNom[0] ;
            A3643TrnNif = H029D2_A3643TrnNif[0] ;
            n3643TrnNif = H029D2_n3643TrnNif[0] ;
            A841TrnNom = H029D2_A841TrnNom[0] ;
            n841TrnNom = H029D2_n841TrnNom[0] ;
            /* Using cursor H029D3 */
            pr_default.execute(1, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
            A3643TrnNif = H029D3_A3643TrnNif[0] ;
            n3643TrnNif = H029D3_n3643TrnNif[0] ;
            A841TrnNom = H029D3_A841TrnNom[0] ;
            n841TrnNom = H029D3_n841TrnNom[0] ;
            pr_default.close(1);
            e2229D2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(109) ;
         wb29D0( ) ;
      }
      bGXsfl_109_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes29D2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_PATHPDF"+"_"+sGXsfl_109_idx, getSecureSignedToken( sGXsfl_109_idx, GXutil.rtrim( localUtil.format( AV98Grid_PathPdf, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_NMRCOPIA"+"_"+sGXsfl_109_idx, getSecureSignedToken( sGXsfl_109_idx, localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV44EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44EmprCod, "@!"))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMOSTRARMAIL", AV113MostrarMail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV113MostrarMail));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLINOM", GXutil.rtrim( AV214CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLINOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV214CliNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSUMAIL", GXutil.rtrim( AV108Usumail));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108Usumail, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRNOM", GXutil.rtrim( AV45EmprNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45EmprNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHXLS_EMAIL", AV102PathXLS_Email);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHXLS_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102PathXLS_Email, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHPDF_EMAIL", AV101PathPDF_Email);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF_EMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV101PathPDF_Email, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
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
      AV225Impresiondeguiawwds_1_tfalbprocod = AV28TFAlbProCod ;
      AV226Impresiondeguiawwds_2_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV227Impresiondeguiawwds_3_tfguiremcln = AV88TFGuiRemCln ;
      AV228Impresiondeguiawwds_4_tfguiremcln_sel = AV89TFGuiRemCln_Sel ;
      AV229Impresiondeguiawwds_5_tfclimailgre_sel = AV55TFCliMailGrE_Sel ;
      AV230Impresiondeguiawwds_6_tfclimailgr = AV49TFCliMailGr ;
      AV231Impresiondeguiawwds_7_tfclimailgr_sel = AV50TFCliMailGr_Sel ;
      AV232Impresiondeguiawwds_8_tfclimailpke_sel = AV56TFCliMailPkE_Sel ;
      AV233Impresiondeguiawwds_9_tfclimailpk = AV51TFCliMailPk ;
      AV234Impresiondeguiawwds_10_tfclimailpk_sel = AV52TFCliMailPk_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Long.valueOf(AV225Impresiondeguiawwds_1_tfalbprocod) ,
                                           Long.valueOf(AV226Impresiondeguiawwds_2_tfalbprocod_to) ,
                                           AV228Impresiondeguiawwds_4_tfguiremcln_sel ,
                                           AV227Impresiondeguiawwds_3_tfguiremcln ,
                                           AV229Impresiondeguiawwds_5_tfclimailgre_sel ,
                                           AV231Impresiondeguiawwds_7_tfclimailgr_sel ,
                                           AV230Impresiondeguiawwds_6_tfclimailgr ,
                                           AV232Impresiondeguiawwds_8_tfclimailpke_sel ,
                                           AV234Impresiondeguiawwds_10_tfclimailpk_sel ,
                                           AV233Impresiondeguiawwds_9_tfclimailpk ,
                                           Boolean.valueOf(AV91LoadGridData) ,
                                           Long.valueOf(AV19AlbProCodfrom) ,
                                           AV15ManAut ,
                                           Long.valueOf(AV20AlbProCodto) ,
                                           AV21AlbProfchfrom ,
                                           AV22AlbProfchto ,
                                           Integer.valueOf(AV23CliCodfrom) ,
                                           Integer.valueOf(AV24CliCodto) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A1244GuiRemCln ,
                                           A11622CliMailGrE ,
                                           A11620CliMailGr ,
                                           A11623CliMailPkE ,
                                           A11621CliMailPk ,
                                           A396EmprCod ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A39AlbProPri ,
                                           AV18PRIO ,
                                           AV44EmprCod } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE,
                                           TypeConstants.INT, TypeConstants.BYTE, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV227Impresiondeguiawwds_3_tfguiremcln = GXutil.padr( GXutil.rtrim( AV227Impresiondeguiawwds_3_tfguiremcln), 30, "%") ;
      lV230Impresiondeguiawwds_6_tfclimailgr = GXutil.padr( GXutil.rtrim( AV230Impresiondeguiawwds_6_tfclimailgr), 100, "%") ;
      lV233Impresiondeguiawwds_9_tfclimailpk = GXutil.padr( GXutil.rtrim( AV233Impresiondeguiawwds_9_tfclimailpk), 100, "%") ;
      /* Using cursor H029D4 */
      pr_default.execute(2, new Object[] {AV44EmprCod, AV18PRIO, Long.valueOf(AV225Impresiondeguiawwds_1_tfalbprocod), Long.valueOf(AV226Impresiondeguiawwds_2_tfalbprocod_to), lV227Impresiondeguiawwds_3_tfguiremcln, AV228Impresiondeguiawwds_4_tfguiremcln_sel, AV229Impresiondeguiawwds_5_tfclimailgre_sel, lV230Impresiondeguiawwds_6_tfclimailgr, AV231Impresiondeguiawwds_7_tfclimailgr_sel, AV232Impresiondeguiawwds_8_tfclimailpke_sel, lV233Impresiondeguiawwds_9_tfclimailpk, AV234Impresiondeguiawwds_10_tfclimailpk_sel, Long.valueOf(AV19AlbProCodfrom), Long.valueOf(AV20AlbProCodto), AV21AlbProfchfrom, AV22AlbProfchto, Integer.valueOf(AV23CliCodfrom), Integer.valueOf(AV24CliCodto)});
      GRID_nRecordCount = H029D4_AGRID_nRecordCount[0] ;
      pr_default.close(2);
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
      AV225Impresiondeguiawwds_1_tfalbprocod = AV28TFAlbProCod ;
      AV226Impresiondeguiawwds_2_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV227Impresiondeguiawwds_3_tfguiremcln = AV88TFGuiRemCln ;
      AV228Impresiondeguiawwds_4_tfguiremcln_sel = AV89TFGuiRemCln_Sel ;
      AV229Impresiondeguiawwds_5_tfclimailgre_sel = AV55TFCliMailGrE_Sel ;
      AV230Impresiondeguiawwds_6_tfclimailgr = AV49TFCliMailGr ;
      AV231Impresiondeguiawwds_7_tfclimailgr_sel = AV50TFCliMailGr_Sel ;
      AV232Impresiondeguiawwds_8_tfclimailpke_sel = AV56TFCliMailPkE_Sel ;
      AV233Impresiondeguiawwds_9_tfclimailpk = AV51TFCliMailPk ;
      AV234Impresiondeguiawwds_10_tfclimailpk_sel = AV52TFCliMailPk_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV28TFAlbProCod, AV29TFAlbProCod_To, AV88TFGuiRemCln, AV89TFGuiRemCln_Sel, AV55TFCliMailGrE_Sel, AV49TFCliMailGr, AV50TFCliMailGr_Sel, AV56TFCliMailPkE_Sel, AV51TFCliMailPk, AV52TFCliMailPk_Sel, AV223Pgmname, AV12OrderedBy, AV13OrderedDsc, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV86SelectAll, AV16VerMail, AV113MostrarMail, AV214CliNom, AV108Usumail, AV45EmprNom, AV102PathXLS_Email, AV101PathPDF_Email, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV225Impresiondeguiawwds_1_tfalbprocod = AV28TFAlbProCod ;
      AV226Impresiondeguiawwds_2_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV227Impresiondeguiawwds_3_tfguiremcln = AV88TFGuiRemCln ;
      AV228Impresiondeguiawwds_4_tfguiremcln_sel = AV89TFGuiRemCln_Sel ;
      AV229Impresiondeguiawwds_5_tfclimailgre_sel = AV55TFCliMailGrE_Sel ;
      AV230Impresiondeguiawwds_6_tfclimailgr = AV49TFCliMailGr ;
      AV231Impresiondeguiawwds_7_tfclimailgr_sel = AV50TFCliMailGr_Sel ;
      AV232Impresiondeguiawwds_8_tfclimailpke_sel = AV56TFCliMailPkE_Sel ;
      AV233Impresiondeguiawwds_9_tfclimailpk = AV51TFCliMailPk ;
      AV234Impresiondeguiawwds_10_tfclimailpk_sel = AV52TFCliMailPk_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV28TFAlbProCod, AV29TFAlbProCod_To, AV88TFGuiRemCln, AV89TFGuiRemCln_Sel, AV55TFCliMailGrE_Sel, AV49TFCliMailGr, AV50TFCliMailGr_Sel, AV56TFCliMailPkE_Sel, AV51TFCliMailPk, AV52TFCliMailPk_Sel, AV223Pgmname, AV12OrderedBy, AV13OrderedDsc, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV86SelectAll, AV16VerMail, AV113MostrarMail, AV214CliNom, AV108Usumail, AV45EmprNom, AV102PathXLS_Email, AV101PathPDF_Email, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV225Impresiondeguiawwds_1_tfalbprocod = AV28TFAlbProCod ;
      AV226Impresiondeguiawwds_2_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV227Impresiondeguiawwds_3_tfguiremcln = AV88TFGuiRemCln ;
      AV228Impresiondeguiawwds_4_tfguiremcln_sel = AV89TFGuiRemCln_Sel ;
      AV229Impresiondeguiawwds_5_tfclimailgre_sel = AV55TFCliMailGrE_Sel ;
      AV230Impresiondeguiawwds_6_tfclimailgr = AV49TFCliMailGr ;
      AV231Impresiondeguiawwds_7_tfclimailgr_sel = AV50TFCliMailGr_Sel ;
      AV232Impresiondeguiawwds_8_tfclimailpke_sel = AV56TFCliMailPkE_Sel ;
      AV233Impresiondeguiawwds_9_tfclimailpk = AV51TFCliMailPk ;
      AV234Impresiondeguiawwds_10_tfclimailpk_sel = AV52TFCliMailPk_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV28TFAlbProCod, AV29TFAlbProCod_To, AV88TFGuiRemCln, AV89TFGuiRemCln_Sel, AV55TFCliMailGrE_Sel, AV49TFCliMailGr, AV50TFCliMailGr_Sel, AV56TFCliMailPkE_Sel, AV51TFCliMailPk, AV52TFCliMailPk_Sel, AV223Pgmname, AV12OrderedBy, AV13OrderedDsc, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV86SelectAll, AV16VerMail, AV113MostrarMail, AV214CliNom, AV108Usumail, AV45EmprNom, AV102PathXLS_Email, AV101PathPDF_Email, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV225Impresiondeguiawwds_1_tfalbprocod = AV28TFAlbProCod ;
      AV226Impresiondeguiawwds_2_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV227Impresiondeguiawwds_3_tfguiremcln = AV88TFGuiRemCln ;
      AV228Impresiondeguiawwds_4_tfguiremcln_sel = AV89TFGuiRemCln_Sel ;
      AV229Impresiondeguiawwds_5_tfclimailgre_sel = AV55TFCliMailGrE_Sel ;
      AV230Impresiondeguiawwds_6_tfclimailgr = AV49TFCliMailGr ;
      AV231Impresiondeguiawwds_7_tfclimailgr_sel = AV50TFCliMailGr_Sel ;
      AV232Impresiondeguiawwds_8_tfclimailpke_sel = AV56TFCliMailPkE_Sel ;
      AV233Impresiondeguiawwds_9_tfclimailpk = AV51TFCliMailPk ;
      AV234Impresiondeguiawwds_10_tfclimailpk_sel = AV52TFCliMailPk_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV28TFAlbProCod, AV29TFAlbProCod_To, AV88TFGuiRemCln, AV89TFGuiRemCln_Sel, AV55TFCliMailGrE_Sel, AV49TFCliMailGr, AV50TFCliMailGr_Sel, AV56TFCliMailPkE_Sel, AV51TFCliMailPk, AV52TFCliMailPk_Sel, AV223Pgmname, AV12OrderedBy, AV13OrderedDsc, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV86SelectAll, AV16VerMail, AV113MostrarMail, AV214CliNom, AV108Usumail, AV45EmprNom, AV102PathXLS_Email, AV101PathPDF_Email, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV225Impresiondeguiawwds_1_tfalbprocod = AV28TFAlbProCod ;
      AV226Impresiondeguiawwds_2_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV227Impresiondeguiawwds_3_tfguiremcln = AV88TFGuiRemCln ;
      AV228Impresiondeguiawwds_4_tfguiremcln_sel = AV89TFGuiRemCln_Sel ;
      AV229Impresiondeguiawwds_5_tfclimailgre_sel = AV55TFCliMailGrE_Sel ;
      AV230Impresiondeguiawwds_6_tfclimailgr = AV49TFCliMailGr ;
      AV231Impresiondeguiawwds_7_tfclimailgr_sel = AV50TFCliMailGr_Sel ;
      AV232Impresiondeguiawwds_8_tfclimailpke_sel = AV56TFCliMailPkE_Sel ;
      AV233Impresiondeguiawwds_9_tfclimailpk = AV51TFCliMailPk ;
      AV234Impresiondeguiawwds_10_tfclimailpk_sel = AV52TFCliMailPk_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21AlbProfchfrom, AV22AlbProfchto, AV19AlbProCodfrom, AV20AlbProCodto, AV18PRIO, AV15ManAut, AV23CliCodfrom, AV24CliCodto, AV44EmprCod, AV91LoadGridData, AV67EmprCodJson, AV71AlbProCodJson, AV28TFAlbProCod, AV29TFAlbProCod_To, AV88TFGuiRemCln, AV89TFGuiRemCln_Sel, AV55TFCliMailGrE_Sel, AV49TFCliMailGr, AV50TFCliMailGr_Sel, AV56TFCliMailPkE_Sel, AV51TFCliMailPk, AV52TFCliMailPk_Sel, AV223Pgmname, AV12OrderedBy, AV13OrderedDsc, AV17PATHPDF, AV14Copias2, AV65i, AV66EmprCodCol, AV69EmprCodToFind, AV70AlbProCodCol, AV73AlbProCodToFind, AV86SelectAll, AV16VerMail, AV113MostrarMail, AV214CliNom, AV108Usumail, AV45EmprNom, AV102PathXLS_Email, AV101PathPDF_Email, Gx_date) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV223Pgmname = "ImpresionDeGuiaww" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV223Pgmname", AV223Pgmname);
      Gx_err = (short)(0) ;
      edtavGrid_pathpdf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_pathpdf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_pathpdf_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      edtavGrid_nmrcopia_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid_nmrcopia_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid_nmrcopia_Enabled), 5, 0), !bGXsfl_109_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29D0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2029D2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODFROM_DATA"), AV40CliCodfrom_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCLICODTO_DATA"), AV42CliCodto_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV36DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_109 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_109"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV38GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV39GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Datalistfixedvalues = httpContext.cgiGet( "DDO_GRID_Datalistfixedvalues") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
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
         Combo_clicodto_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODTO_Selectedvalue_get") ;
         Combo_clicodfrom_Selectedvalue_get = httpContext.cgiGet( "COMBO_CLICODFROM_Selectedvalue_get") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHFROM");
            GX_FocusControl = edtavAlbprofchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21AlbProfchfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProfchfrom", localUtil.format(AV21AlbProfchfrom, "99/99/99"));
         }
         else
         {
            AV21AlbProfchfrom = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProfchfrom", localUtil.format(AV21AlbProfchfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHTO");
            GX_FocusControl = edtavAlbprofchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22AlbProfchto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfchto", localUtil.format(AV22AlbProfchto, "99/99/99"));
         }
         else
         {
            AV22AlbProfchto = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfchto", localUtil.format(AV22AlbProfchto, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCODFROM");
            GX_FocusControl = edtavAlbprocodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19AlbProCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProCodfrom), 10, 0));
         }
         else
         {
            AV19AlbProCodfrom = localUtil.ctol( httpContext.cgiGet( edtavAlbprocodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19AlbProCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProCodfrom), 10, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCODTO");
            GX_FocusControl = edtavAlbprocodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20AlbProCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProCodto), 10, 0));
         }
         else
         {
            AV20AlbProCodto = localUtil.ctol( httpContext.cgiGet( edtavAlbprocodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProCodto), 10, 0));
         }
         cmbavPrio.setName( cmbavPrio.getInternalname() );
         cmbavPrio.setValue( httpContext.cgiGet( cmbavPrio.getInternalname()) );
         AV18PRIO = httpContext.cgiGet( cmbavPrio.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18PRIO", AV18PRIO);
         cmbavManaut.setName( cmbavManaut.getInternalname() );
         cmbavManaut.setValue( httpContext.cgiGet( cmbavManaut.getInternalname()) );
         AV15ManAut = httpContext.cgiGet( cmbavManaut.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15ManAut", AV15ManAut);
         AV223Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV223Pgmname", AV223Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODFROM");
            GX_FocusControl = edtavClicodfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23CliCodfrom = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCodfrom), 6, 0));
         }
         else
         {
            AV23CliCodfrom = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodfrom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCodfrom), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODTO");
            GX_FocusControl = edtavClicodto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24CliCodto = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCodto), 6, 0));
         }
         else
         {
            AV24CliCodto = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodto_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCodto), 6, 0));
         }
         AV86SelectAll = GXutil.strtobool( httpContext.cgiGet( chkavSelectall.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV86SelectAll", AV86SelectAll);
         AV16VerMail = GXutil.strtobool( httpContext.cgiGet( chkavVermail.getInternalname())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16VerMail", AV16VerMail);
         AV17PATHPDF = httpContext.cgiGet( edtavPathpdf_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17PATHPDF", AV17PATHPDF);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOPIAS2");
            GX_FocusControl = edtavCopias2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14Copias2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Copias2), 4, 0));
         }
         else
         {
            AV14Copias2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Copias2), 4, 0));
         }
         AV112Info = httpContext.cgiGet( edtavInfo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV112Info", AV112Info);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ImpresionDeGuiaww");
         AV223Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV223Pgmname", AV223Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV223Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("impresiondeguiaww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPROFCHFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV21AlbProfchfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPROFCHTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV22AlbProfchto)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROCODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV19AlbProCodfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROCODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV20AlbProCodto )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPRIO"), AV18PRIO) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vMANAUT"), AV15ManAut) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODFROM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV23CliCodfrom )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vCLICODTO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV24CliCodto )
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
      e2029D2 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
   }

   public void e2029D2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_SdtWWPContext1[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV6WWPContext = GXv_SdtWWPContext1[0] ;
      GXt_char2 = AV43Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      impresiondeguiaww_impl.this.GXt_char2 = GXv_char3[0] ;
      AV43Station = GXt_char2 ;
      GXv_char3[0] = AV44EmprCod ;
      GXv_char4[0] = AV45EmprNom ;
      GXv_char5[0] = AV46UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV43Station, GXv_char3, GXv_char4, GXv_char5) ;
      impresiondeguiaww_impl.this.AV44EmprCod = GXv_char3[0] ;
      impresiondeguiaww_impl.this.AV45EmprNom = GXv_char4[0] ;
      impresiondeguiaww_impl.this.AV46UsurCod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44EmprCod", AV44EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV44EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "AV45EmprNom", AV45EmprNom);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV45EmprNom, ""))));
      edtavClicodto_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodto_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodto_Visible), 5, 0), true);
      edtavClicodfrom_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodfrom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodfrom_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOCLICODFROM' */
      S112 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADCOMBOCLICODTO' */
      S122 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      chkavVermail.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "Visible", GXutil.ltrimstr( chkavVermail.getVisible(), 5, 0), true);
      edtavPathpdf_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPathpdf_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPathpdf_Visible), 5, 0), true);
      edtavCopias2_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCopias2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCopias2_Visible), 5, 0), true);
      edtavInfo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInfo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInfo_Visible), 5, 0), true);
      chkavSelectall.setVisible( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelectall.getInternalname(), "Visible", GXutil.ltrimstr( chkavSelectall.getVisible(), 5, 0), true);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Albaran de Produccion", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S132 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S142 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S152 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      chkavSelected.setTitleFormat( (short)(1) );
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV36DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV36DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      AV18PRIO = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18PRIO", AV18PRIO);
      AV47Copia[1-1] = "Original" ;
      AV47Copia[2-1] = "Duplicado" ;
      AV47Copia[3-1] = "Triplicado" ;
      AV47Copia[4-1] = "Quadriplicado" ;
      GXv_int8[0] = AV94Copias ;
      new app.pbuscon(remoteHandle, context).execute( AV44EmprCod, "100005", GXv_int8) ;
      impresiondeguiaww_impl.this.AV94Copias = (short)((short)(GXv_int8[0])) ;
      if ( AV94Copias == 0 )
      {
         AV94Copias = (short)(1) ;
      }
      AV14Copias2 = AV94Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14Copias2), 4, 0));
      AV15ManAut = "M" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15ManAut", AV15ManAut);
      GXt_char2 = AV17PATHPDF ;
      GXv_char5[0] = GXt_char2 ;
      new app.pbusemplin(remoteHandle, context).execute( AV44EmprCod, "WEBPDF", GXv_char5) ;
      impresiondeguiaww_impl.this.GXt_char2 = GXv_char5[0] ;
      AV17PATHPDF = GXt_char2 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17PATHPDF", AV17PATHPDF);
      AV17PATHPDF = GXutil.trim( AV17PATHPDF) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17PATHPDF", AV17PATHPDF);
      AV16VerMail = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16VerMail", AV16VerMail);
      AV96Ano = (short)(GXutil.year( Gx_date)) ;
      AV97Mes = (short)(GXutil.month( Gx_date)) ;
      AV92IniDate = localUtil.ymdtod( AV96Ano, 1, 1) ;
      AV93EndDate = GXutil.eomdate( Gx_date) ;
      AV21AlbProfchfrom = AV92IniDate ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProfchfrom", localUtil.format(AV21AlbProfchfrom, "99/99/99"));
      AV22AlbProfchto = AV93EndDate ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfchto", localUtil.format(AV22AlbProfchto, "99/99/99"));
      GXt_int9 = (byte)(AV103Moda21) ;
      GXv_int10[0] = GXt_int9 ;
      new app.pexicon(remoteHandle, context).execute( AV44EmprCod, "MODA21", GXv_int10) ;
      impresiondeguiaww_impl.this.GXt_int9 = GXv_int10[0] ;
      AV103Moda21 = GXt_int9 ;
      AV108Usumail = AV6WWPContext.getgxTv_SdtWWPContext_Usumail() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108Usumail", AV108Usumail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSUMAIL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV108Usumail, ""))));
   }

   public void e2129D2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext1[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext1) ;
      AV6WWPContext = GXv_SdtWWPContext1[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S162 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      chkavSelected.setTitle( GXutil.format( "<input name=\"selectAllCheckbox\" type=\"checkbox\" value=\"Select All\" onchange=\"$(%1).click();\" class=\"AttributeCheckBox\" >", "'#"+chkavSelectall.getInternalname()+"'", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelected.getInternalname(), "Title", chkavSelected.getTitle(), !bGXsfl_109_Refreshing);
      AV86SelectAll = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86SelectAll", AV86SelectAll);
      Gridpaginationbar_Emptygridcaption = (AV91LoadGridData ? httpContext.getMessage( "WWP_PagingEmptyGridCaption", "") : httpContext.getMessage( "WWP_PressSearchToShowData", "")) ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
      AV38GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV38GridCurrentPage), 10, 0));
      AV39GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridPageCount), 10, 0));
      AV66EmprCodCol.fromJSonString(AV67EmprCodJson, null);
      AV70AlbProCodCol.fromJSonString(AV71AlbProCodJson, null);
      AV225Impresiondeguiawwds_1_tfalbprocod = AV28TFAlbProCod ;
      AV226Impresiondeguiawwds_2_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV227Impresiondeguiawwds_3_tfguiremcln = AV88TFGuiRemCln ;
      AV228Impresiondeguiawwds_4_tfguiremcln_sel = AV89TFGuiRemCln_Sel ;
      AV229Impresiondeguiawwds_5_tfclimailgre_sel = AV55TFCliMailGrE_Sel ;
      AV230Impresiondeguiawwds_6_tfclimailgr = AV49TFCliMailGr ;
      AV231Impresiondeguiawwds_7_tfclimailgr_sel = AV50TFCliMailGr_Sel ;
      AV232Impresiondeguiawwds_8_tfclimailpke_sel = AV56TFCliMailPkE_Sel ;
      AV233Impresiondeguiawwds_9_tfclimailpk = AV51TFCliMailPk ;
      AV234Impresiondeguiawwds_10_tfclimailpk_sel = AV52TFCliMailPk_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66EmprCodCol", AV66EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV70AlbProCodCol", AV70AlbProCodCol);
   }

   public void e1629D2( )
   {
      /* 'DoSearch' Routine */
      returnInSub = false ;
      AV91LoadGridData = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91LoadGridData", AV91LoadGridData);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66EmprCodCol", AV66EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV70AlbProCodCol", AV70AlbProCodCol);
   }

   public void e1329D2( )
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

   public void e1429D2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1529D2( )
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
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCod") == 0 )
         {
            AV28TFAlbProCod = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFAlbProCod), 10, 0));
            AV29TFAlbProCod_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiRemCln") == 0 )
         {
            AV88TFGuiRemCln = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFGuiRemCln", AV88TFGuiRemCln);
            AV89TFGuiRemCln_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFGuiRemCln_Sel", AV89TFGuiRemCln_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliMailGrE") == 0 )
         {
            AV55TFCliMailGrE_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCliMailGrE_Sel", AV55TFCliMailGrE_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliMailGr") == 0 )
         {
            AV49TFCliMailGr = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFCliMailGr", AV49TFCliMailGr);
            AV50TFCliMailGr_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFCliMailGr_Sel", AV50TFCliMailGr_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliMailPkE") == 0 )
         {
            AV56TFCliMailPkE_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliMailPkE_Sel", AV56TFCliMailPkE_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "CliMailPk") == 0 )
         {
            AV51TFCliMailPk = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFCliMailPk", AV51TFCliMailPk);
            AV52TFCliMailPk_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFCliMailPk_Sel", AV52TFCliMailPk_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2229D2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV98Grid_PathPdf = AV17PATHPDF ;
      httpContext.ajax_rsp_assign_attri("", false, edtavGrid_pathpdf_Internalname, AV98Grid_PathPdf);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_PATHPDF"+"_"+sGXsfl_109_idx, getSecureSignedToken( sGXsfl_109_idx, GXutil.rtrim( localUtil.format( AV98Grid_PathPdf, ""))));
      AV100Grid_NmrCopia = AV14Copias2 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavGrid_nmrcopia_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRID_NMRCOPIA"+"_"+sGXsfl_109_idx, getSecureSignedToken( sGXsfl_109_idx, localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")));
      edtavIcon_Visible = 0 ;
      AV62Selected = false ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
      if ( ( GXutil.strcmp(A11622CliMailGrE, "S") == 0 ) || ( GXutil.strcmp(A11623CliMailPkE, "S") == 0 ) )
      {
         edtavIcon_gximage = "Email" ;
         AV87Icon = context.getHttpContext().getImagePath( "1b09bc09-7c40-49bb-a9b2-73bc4af027c1", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIcon_Internalname, AV87Icon);
         AV235Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "1b09bc09-7c40-49bb-a9b2-73bc4af027c1", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         edtavIcon_Tooltiptext = httpContext.getMessage( "Liberado para enviar por mail !", "") ;
         edtavIcon_Visible = 1 ;
      }
      if ( ( GXutil.strcmp(A11622CliMailGrE, "S") == 0 ) && (GXutil.strcmp("", A11620CliMailGr)==0) )
      {
         edtavIcon_gximage = "EmailError" ;
         AV87Icon = context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIcon_Internalname, AV87Icon);
         AV235Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         edtavIcon_Tooltiptext = httpContext.getMessage( "Guia Remessa : NO tiene mail", "") ;
      }
      if ( ( GXutil.strcmp(A11623CliMailPkE, "S") == 0 ) && (GXutil.strcmp("", A11621CliMailPk)==0) )
      {
         edtavIcon_gximage = "EmailError" ;
         AV87Icon = context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavIcon_Internalname, AV87Icon);
         AV235Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
         edtavIcon_Tooltiptext = httpContext.getMessage( "Packing List : NO tiene mail", "") ;
      }
      AV69EmprCodToFind = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69EmprCodToFind", AV69EmprCodToFind);
      AV73AlbProCodToFind = A30AlbProCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73AlbProCodToFind", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbProCodToFind), 10, 0));
      /* Execute user subroutine: 'GETINDEXOFSELECTEDROW' */
      S172 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( AV65i > 0 )
      {
         AV62Selected = true ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(109) ;
      }
      sendrow_1092( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_109_Refreshing )
      {
         httpContext.doAjaxLoad(109, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e2429D2( )
   {
      /* Selected_Click Routine */
      returnInSub = false ;
      if ( AV62Selected )
      {
         AV66EmprCodCol.add(A396EmprCod, 0);
         AV70AlbProCodCol.add((long)(A30AlbProCod), 0);
      }
      else
      {
         AV69EmprCodToFind = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69EmprCodToFind", AV69EmprCodToFind);
         AV73AlbProCodToFind = A30AlbProCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73AlbProCodToFind", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV73AlbProCodToFind), 10, 0));
         /* Execute user subroutine: 'GETINDEXOFSELECTEDROW' */
         S172 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
         AV66EmprCodCol.removeItem((int)(AV65i));
         AV70AlbProCodCol.removeItem((int)(AV65i));
      }
      AV67EmprCodJson = AV66EmprCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67EmprCodJson", AV67EmprCodJson);
      AV71AlbProCodJson = AV70AlbProCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71AlbProCodJson", AV71AlbProCodJson);
      divLayoutmaintable_Class = "Table TableWithSelectableGrid"+((AV66EmprCodCol.size()>0) ? " WWPMultiRowSelected" : "") ;
      httpContext.ajax_rsp_assign_prop("", false, divLayoutmaintable_Internalname, "Class", divLayoutmaintable_Class, true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66EmprCodCol", AV66EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV70AlbProCodCol", AV70AlbProCodCol);
   }

   public void e1729D2( )
   {
      /* 'DoProcessar' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADSELECTEDROWS' */
      S182 ();
      if ( returnInSub )
      {
         pr_default.close(1);
         returnInSub = true;
         if (true) return;
      }
      if ( AV63SelectedRows.size() == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_NoRecordSelected", ""));
      }
      if ( AV63SelectedRows.size() > 0 )
      {
         AV236GXV1 = 1 ;
         while ( AV236GXV1 <= AV63SelectedRows.size() )
         {
            AV64SelectedRow = (app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem)((app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem)AV63SelectedRows.elementAt(-1+AV236GXV1));
            httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_5", new String[] {GXutil.URLEncode(GXutil.rtrim(AV64SelectedRow.getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod())),GXutil.URLEncode(GXutil.ltrimstr(AV64SelectedRow.getgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod(),10,0)),GXutil.URLEncode(GXutil.rtrim(A5140AlbMarca))}, new String[] {"AuxEmprcod","AlbProcod","albmarca"}) , new Object[] {});
            AV236GXV1 = (int)(AV236GXV1+1) ;
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Selecione al menos una linea !", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63SelectedRows", AV63SelectedRows);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66EmprCodCol", AV66EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV70AlbProCodCol", AV70AlbProCodCol);
   }

   public void e1829D2( )
   {
      /* Selectall_Click Routine */
      returnInSub = false ;
      AV66EmprCodCol = new GXSimpleCollection<String>(String.class, "internal", "") ;
      AV70AlbProCodCol = new GXSimpleCollection<Long>(Long.class, "internal", "") ;
      if ( AV86SelectAll )
      {
         /* Execute user subroutine: 'ADD ALL RECORDS' */
         S192 ();
         if ( returnInSub )
         {
            pr_default.close(1);
            returnInSub = true;
            if (true) return;
         }
      }
      /* Start For Each Line */
      nRC_GXsfl_109 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_109"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_109_fel_idx = 0 ;
      while ( nGXsfl_109_fel_idx < nRC_GXsfl_109 )
      {
         nGXsfl_109_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_109_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_109_fel_idx+1) ;
         sGXsfl_109_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_1092( ) ;
         AV62Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A407EmprNom = httpContext.cgiGet( edtEmprNom_Internalname) ;
         n407EmprNom = false ;
         A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
         A33AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbProEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
         A4023AlbFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbFecSal_Internalname), 0)) ;
         A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
         A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
         A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
         A3869AlbCliDes = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbCliDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A1259AlbDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1259AlbDomEnv = false ;
         A840TrnCod = (short)(localUtil.ctol( httpContext.cgiGet( edtTrnCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A841TrnNom = httpContext.cgiGet( edtTrnNom_Internalname) ;
         n841TrnNom = false ;
         A3868AlbMat = httpContext.cgiGet( edtAlbMat_Internalname) ;
         A2242AlbSec = GXutil.upper( httpContext.cgiGet( edtAlbSec_Internalname)) ;
         cmbAlbEnvFtp.setName( cmbAlbEnvFtp.getInternalname() );
         cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
         A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
         A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
         cmbAlbProAT.setName( cmbAlbProAT.getInternalname() );
         cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
         A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
         A10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtAlbHhfm_Internalname), 0) ;
         A10020AlbGrossT = localUtil.ctond( httpContext.cgiGet( edtAlbGrossT_Internalname)) ;
         A10837AlbTrnNc = httpContext.cgiGet( edtAlbTrnNc_Internalname) ;
         A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
         n10017AlbFmd = false ;
         A10835AlbTrnNm = httpContext.cgiGet( edtAlbTrnNm_Internalname) ;
         A10018ALbFmdc = httpContext.cgiGet( edtALbFmdc_Internalname) ;
         A10836AlbTrnDm = httpContext.cgiGet( edtAlbTrnDm_Internalname) ;
         cmbAlbMarca.setName( cmbAlbMarca.getInternalname() );
         cmbAlbMarca.setValue( httpContext.cgiGet( cmbAlbMarca.getInternalname()) );
         A5140AlbMarca = httpContext.cgiGet( cmbAlbMarca.getInternalname()) ;
         A3867AlbLocDes = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbLocDes_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A3866AlbLocCar = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbLocCar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A914AlbPObsCon = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbPObsCon_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A5141AlbIvaCod = GXutil.upper( httpContext.cgiGet( edtAlbIvaCod_Internalname)) ;
         A7987AlbColCa = httpContext.cgiGet( edtAlbColCa_Internalname) ;
         A7162AlbDesp = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbDesp_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A7986AlbCambio = localUtil.ctond( httpContext.cgiGet( edtAlbCambio_Internalname)) ;
         A7985AlbTipDoc = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbTipDoc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A7984AlbMotTr = httpContext.cgiGet( edtAlbMotTr_Internalname) ;
         A5803AlbTipCal = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbTipCal_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A7988AlbObsCb = httpContext.cgiGet( edtAlbObsCb_Internalname) ;
         A7102AlbNumT = localUtil.ctol( httpContext.cgiGet( edtAlbNumT_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         A7100AlbMarCo = httpContext.cgiGet( edtAlbMarCo_Internalname) ;
         A7099AlbOComp = httpContext.cgiGet( edtAlbOComp_Internalname) ;
         A3643TrnNif = GXutil.upper( httpContext.cgiGet( edtTrnNif_Internalname)) ;
         n3643TrnNif = false ;
         cmbAlbDivTCod.setName( cmbAlbDivTCod.getInternalname() );
         cmbAlbDivTCod.setValue( httpContext.cgiGet( cmbAlbDivTCod.getInternalname()) );
         A3093AlbDivTCod = httpContext.cgiGet( cmbAlbDivTCod.getInternalname()) ;
         n3093AlbDivTCod = false ;
         A3109AlbDivAbr = httpContext.cgiGet( edtAlbDivAbr_Internalname) ;
         n3109AlbDivAbr = false ;
         A3108AlbDivCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtAlbDivCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3108AlbDivCod = false ;
         A1260BusDomEnv = (byte)(localUtil.ctol( httpContext.cgiGet( edtBusDomEnv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1260BusDomEnv = false ;
         A1253EmprGuiRem = GXutil.upper( httpContext.cgiGet( edtEmprGuiRem_Internalname)) ;
         A1258GuiRemDom = (byte)(localUtil.ctol( httpContext.cgiGet( edtGuiRemDom_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n1258GuiRemDom = false ;
         cmbGuiRemDivT.setName( cmbGuiRemDivT.getInternalname() );
         cmbGuiRemDivT.setValue( httpContext.cgiGet( cmbGuiRemDivT.getInternalname()) );
         A3145GuiRemDivT = httpContext.cgiGet( cmbGuiRemDivT.getInternalname()) ;
         n3145GuiRemDivT = false ;
         A3110GuiRemDiv = (byte)(localUtil.ctol( httpContext.cgiGet( edtGuiRemDiv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n3110GuiRemDiv = false ;
         A1902CliValA = ((GXutil.strcmp(httpContext.cgiGet( chkCliValA.getInternalname()), "S")==0) ? "S" : "N") ;
         n1902CliValA = false ;
         A11622CliMailGrE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailGrE.getInternalname()), "S")==0) ? "S" : "N") ;
         n11622CliMailGrE = false ;
         A11620CliMailGr = httpContext.cgiGet( edtCliMailGr_Internalname) ;
         n11620CliMailGr = false ;
         A11623CliMailPkE = ((GXutil.strcmp(httpContext.cgiGet( chkCliMailPkE.getInternalname()), "S")==0) ? "S" : "N") ;
         n11623CliMailPkE = false ;
         A11621CliMailPk = httpContext.cgiGet( edtCliMailPk_Internalname) ;
         n11621CliMailPk = false ;
         A10301Cod_pais = (short)(localUtil.ctol( httpContext.cgiGet( edtCod_pais_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n10301Cod_pais = false ;
         AV87Icon = httpContext.cgiGet( edtavIcon_Internalname) ;
         AV98Grid_PathPdf = httpContext.cgiGet( edtavGrid_pathpdf_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID_NMRCOPIA");
            GX_FocusControl = edtavGrid_nmrcopia_Internalname ;
            wbErr = true ;
            AV100Grid_NmrCopia = (short)(0) ;
         }
         else
         {
            AV100Grid_NmrCopia = (short)(localUtil.ctol( httpContext.cgiGet( edtavGrid_nmrcopia_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV62Selected = AV86SelectAll ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
         /* End For Each Line */
      }
      if ( nGXsfl_109_fel_idx == 0 )
      {
         nGXsfl_109_idx = 1 ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
      }
      nGXsfl_109_fel_idx = 1 ;
      AV67EmprCodJson = AV66EmprCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67EmprCodJson", AV67EmprCodJson);
      AV71AlbProCodJson = AV70AlbProCodCol.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71AlbProCodJson", AV71AlbProCodJson);
      divLayoutmaintable_Class = "Table TableWithSelectableGrid"+((AV66EmprCodCol.size()>0) ? " WWPMultiRowSelected" : "") ;
      httpContext.ajax_rsp_assign_prop("", false, divLayoutmaintable_Internalname, "Class", divLayoutmaintable_Class, true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV66EmprCodCol", AV66EmprCodCol);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV70AlbProCodCol", AV70AlbProCodCol);
   }

   public void e1229D2( )
   {
      /* Combo_clicodto_Onoptionclicked Routine */
      returnInSub = false ;
      AV24CliCodto = (int)(GXutil.lval( Combo_clicodto_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCodto), 6, 0));
      /*  Sending Event outputs  */
   }

   public void e1129D2( )
   {
      /* Combo_clicodfrom_Onoptionclicked Routine */
      returnInSub = false ;
      AV23CliCodfrom = (int)(GXutil.lval( Combo_clicodfrom_Selectedvalue_get)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCodfrom), 6, 0));
      /*  Sending Event outputs  */
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
      /* 'GETINDEXOFSELECTEDROW' Routine */
      returnInSub = false ;
      AV65i = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65i), 10, 0));
      AV238GXV2 = 1 ;
      while ( AV238GXV2 <= AV66EmprCodCol.size() )
      {
         AV68EmprCodColItem = (String)AV66EmprCodCol.elementAt(-1+AV238GXV2) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68EmprCodColItem", AV68EmprCodColItem);
         if ( ( GXutil.strcmp(AV68EmprCodColItem, AV69EmprCodToFind) == 0 ) && ( ((Number) AV70AlbProCodCol.elementAt(-1+(int)(AV65i))).longValue() == AV73AlbProCodToFind ) )
         {
            if (true) break;
         }
         AV65i = (long)(AV65i+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65i), 10, 0));
         AV238GXV2 = (int)(AV238GXV2+1) ;
      }
      if ( AV65i > AV66EmprCodCol.size() )
      {
         AV65i = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65i), 10, 0));
      }
   }

   public void S182( )
   {
      /* 'LOADSELECTEDROWS' Routine */
      returnInSub = false ;
      AV63SelectedRows = new GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem>(app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem.class, "ImpresionDeGuiawwSDTItem", "TexplusNET", remoteHandle) ;
      AV66EmprCodCol.fromJSonString(AV67EmprCodJson, null);
      AV70AlbProCodCol.fromJSonString(AV71AlbProCodJson, null);
      AV65i = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65i), 10, 0));
      AV239GXV3 = 1 ;
      while ( AV239GXV3 <= AV66EmprCodCol.size() )
      {
         AV68EmprCodColItem = (String)AV66EmprCodCol.elementAt(-1+AV239GXV3) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68EmprCodColItem", AV68EmprCodColItem);
         AV64SelectedRow = (app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem)new app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem(remoteHandle, context);
         AV72AlbProCodColItem = ((Number) AV70AlbProCodCol.elementAt(-1+(int)(AV65i))).longValue() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72AlbProCodColItem", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV72AlbProCodColItem), 10, 0));
         /* Using cursor H029D5 */
         pr_default.execute(3, new Object[] {AV68EmprCodColItem, Long.valueOf(AV72AlbProCodColItem)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A30AlbProCod = H029D5_A30AlbProCod[0] ;
            A396EmprCod = H029D5_A396EmprCod[0] ;
            A407EmprNom = H029D5_A407EmprNom[0] ;
            n407EmprNom = H029D5_n407EmprNom[0] ;
            A39AlbProPri = H029D5_A39AlbProPri[0] ;
            A33AlbProEst = H029D5_A33AlbProEst[0] ;
            A34AlbProfch = H029D5_A34AlbProfch[0] ;
            A4023AlbFecSal = H029D5_A4023AlbFecSal[0] ;
            A3865AlbHorSal = H029D5_A3865AlbHorSal[0] ;
            A7098AlbUsu = H029D5_A7098AlbUsu[0] ;
            A1243GuiRemCli = H029D5_A1243GuiRemCli[0] ;
            A1244GuiRemCln = H029D5_A1244GuiRemCln[0] ;
            A3869AlbCliDes = H029D5_A3869AlbCliDes[0] ;
            A1259AlbDomEnv = H029D5_A1259AlbDomEnv[0] ;
            n1259AlbDomEnv = H029D5_n1259AlbDomEnv[0] ;
            A840TrnCod = H029D5_A840TrnCod[0] ;
            A841TrnNom = H029D5_A841TrnNom[0] ;
            n841TrnNom = H029D5_n841TrnNom[0] ;
            A3868AlbMat = H029D5_A3868AlbMat[0] ;
            A2242AlbSec = H029D5_A2242AlbSec[0] ;
            A5805AlbEnvFtp = H029D5_A5805AlbEnvFtp[0] ;
            A7101AlbLic = H029D5_A7101AlbLic[0] ;
            A10765AlbProAT = H029D5_A10765AlbProAT[0] ;
            A10019AlbHhfm = H029D5_A10019AlbHhfm[0] ;
            A10020AlbGrossT = H029D5_A10020AlbGrossT[0] ;
            A10837AlbTrnNc = H029D5_A10837AlbTrnNc[0] ;
            A10017AlbFmd = H029D5_A10017AlbFmd[0] ;
            n10017AlbFmd = H029D5_n10017AlbFmd[0] ;
            A10835AlbTrnNm = H029D5_A10835AlbTrnNm[0] ;
            A10018ALbFmdc = H029D5_A10018ALbFmdc[0] ;
            A10836AlbTrnDm = H029D5_A10836AlbTrnDm[0] ;
            A5140AlbMarca = H029D5_A5140AlbMarca[0] ;
            A3867AlbLocDes = H029D5_A3867AlbLocDes[0] ;
            A3866AlbLocCar = H029D5_A3866AlbLocCar[0] ;
            A914AlbPObsCon = H029D5_A914AlbPObsCon[0] ;
            A5141AlbIvaCod = H029D5_A5141AlbIvaCod[0] ;
            A7987AlbColCa = H029D5_A7987AlbColCa[0] ;
            A7162AlbDesp = H029D5_A7162AlbDesp[0] ;
            A7986AlbCambio = H029D5_A7986AlbCambio[0] ;
            A7985AlbTipDoc = H029D5_A7985AlbTipDoc[0] ;
            A7984AlbMotTr = H029D5_A7984AlbMotTr[0] ;
            A5803AlbTipCal = H029D5_A5803AlbTipCal[0] ;
            A7988AlbObsCb = H029D5_A7988AlbObsCb[0] ;
            A7102AlbNumT = H029D5_A7102AlbNumT[0] ;
            A7100AlbMarCo = H029D5_A7100AlbMarCo[0] ;
            A7099AlbOComp = H029D5_A7099AlbOComp[0] ;
            A3643TrnNif = H029D5_A3643TrnNif[0] ;
            n3643TrnNif = H029D5_n3643TrnNif[0] ;
            A3093AlbDivTCod = H029D5_A3093AlbDivTCod[0] ;
            n3093AlbDivTCod = H029D5_n3093AlbDivTCod[0] ;
            A3109AlbDivAbr = H029D5_A3109AlbDivAbr[0] ;
            n3109AlbDivAbr = H029D5_n3109AlbDivAbr[0] ;
            A3108AlbDivCod = H029D5_A3108AlbDivCod[0] ;
            n3108AlbDivCod = H029D5_n3108AlbDivCod[0] ;
            A1253EmprGuiRem = H029D5_A1253EmprGuiRem[0] ;
            A1258GuiRemDom = H029D5_A1258GuiRemDom[0] ;
            n1258GuiRemDom = H029D5_n1258GuiRemDom[0] ;
            A3145GuiRemDivT = H029D5_A3145GuiRemDivT[0] ;
            n3145GuiRemDivT = H029D5_n3145GuiRemDivT[0] ;
            A3110GuiRemDiv = H029D5_A3110GuiRemDiv[0] ;
            n3110GuiRemDiv = H029D5_n3110GuiRemDiv[0] ;
            A1902CliValA = H029D5_A1902CliValA[0] ;
            n1902CliValA = H029D5_n1902CliValA[0] ;
            A11622CliMailGrE = H029D5_A11622CliMailGrE[0] ;
            n11622CliMailGrE = H029D5_n11622CliMailGrE[0] ;
            A11620CliMailGr = H029D5_A11620CliMailGr[0] ;
            n11620CliMailGr = H029D5_n11620CliMailGr[0] ;
            A11623CliMailPkE = H029D5_A11623CliMailPkE[0] ;
            n11623CliMailPkE = H029D5_n11623CliMailPkE[0] ;
            A11621CliMailPk = H029D5_A11621CliMailPk[0] ;
            n11621CliMailPk = H029D5_n11621CliMailPk[0] ;
            A10301Cod_pais = H029D5_A10301Cod_pais[0] ;
            n10301Cod_pais = H029D5_n10301Cod_pais[0] ;
            A1260BusDomEnv = H029D5_A1260BusDomEnv[0] ;
            n1260BusDomEnv = H029D5_n1260BusDomEnv[0] ;
            A407EmprNom = H029D5_A407EmprNom[0] ;
            n407EmprNom = H029D5_n407EmprNom[0] ;
            A841TrnNom = H029D5_A841TrnNom[0] ;
            n841TrnNom = H029D5_n841TrnNom[0] ;
            A3643TrnNif = H029D5_A3643TrnNif[0] ;
            n3643TrnNif = H029D5_n3643TrnNif[0] ;
            A3109AlbDivAbr = H029D5_A3109AlbDivAbr[0] ;
            n3109AlbDivAbr = H029D5_n3109AlbDivAbr[0] ;
            A1244GuiRemCln = H029D5_A1244GuiRemCln[0] ;
            A3145GuiRemDivT = H029D5_A3145GuiRemDivT[0] ;
            n3145GuiRemDivT = H029D5_n3145GuiRemDivT[0] ;
            A3110GuiRemDiv = H029D5_A3110GuiRemDiv[0] ;
            n3110GuiRemDiv = H029D5_n3110GuiRemDiv[0] ;
            A1902CliValA = H029D5_A1902CliValA[0] ;
            n1902CliValA = H029D5_n1902CliValA[0] ;
            A11622CliMailGrE = H029D5_A11622CliMailGrE[0] ;
            n11622CliMailGrE = H029D5_n11622CliMailGrE[0] ;
            A11620CliMailGr = H029D5_A11620CliMailGr[0] ;
            n11620CliMailGr = H029D5_n11620CliMailGr[0] ;
            A11623CliMailPkE = H029D5_A11623CliMailPkE[0] ;
            n11623CliMailPkE = H029D5_n11623CliMailPkE[0] ;
            A11621CliMailPk = H029D5_A11621CliMailPk[0] ;
            n11621CliMailPk = H029D5_n11621CliMailPk[0] ;
            A10301Cod_pais = H029D5_A10301Cod_pais[0] ;
            n10301Cod_pais = H029D5_n10301Cod_pais[0] ;
            A1260BusDomEnv = H029D5_A1260BusDomEnv[0] ;
            n1260BusDomEnv = H029D5_n1260BusDomEnv[0] ;
            /* Using cursor H029D6 */
            pr_default.execute(4, new Object[] {A1253EmprGuiRem, Short.valueOf(A840TrnCod)});
            A841TrnNom = H029D6_A841TrnNom[0] ;
            n841TrnNom = H029D6_n841TrnNom[0] ;
            A3643TrnNif = H029D6_A3643TrnNif[0] ;
            n3643TrnNif = H029D6_n3643TrnNif[0] ;
            pr_default.close(4);
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod( A396EmprCod );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprnom( A407EmprNom );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod( A30AlbProCod );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpropri( A39AlbProPri );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest( A33AlbProEst );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch( A34AlbProfch );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfecsal( A4023AlbFecSal );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhorsal( A3865AlbHorSal );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albusu( A7098AlbUsu );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli( A1243GuiRemCli );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln( A1244GuiRemCln );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albclides( A3869AlbCliDes );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdomenv( A1259AlbDomEnv );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trncod( A840TrnCod );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnom( A841TrnNom );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmat( A3868AlbMat );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albsec( A2242AlbSec );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albenvftp( A5805AlbEnvFtp );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblic( A7101AlbLic );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproat( A10765AlbProAT );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albhhfm( A10019AlbHhfm );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albgrosst( A10020AlbGrossT );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnc( A10837AlbTrnNc );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmd( A10017AlbFmd );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrnnm( A10835AlbTrnNm );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albfmdc( A10018ALbFmdc );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtrndm( A10836AlbTrnDm );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarca( A5140AlbMarca );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Alblocdes( A3867AlbLocDes );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albloccar( A3866AlbLocCar );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albpobscon( A914AlbPObsCon );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albivacod( A5141AlbIvaCod );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcolca( A7987AlbColCa );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdesp( A7162AlbDesp );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albcambio( A7986AlbCambio );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipdoc( A7985AlbTipDoc );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmottr( A7984AlbMotTr );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albtipcal( A5803AlbTipCal );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albobscb( A7988AlbObsCb );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albnumt( A7102AlbNumT );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albmarco( A7100AlbMarCo );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albocomp( A7099AlbOComp );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Trnnif( A3643TrnNif );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivtcod( A3093AlbDivTCod );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivabr( A3109AlbDivAbr );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albdivcod( A3108AlbDivCod );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Busdomenv( A1260BusDomEnv );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprguirem( A1253EmprGuiRem );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdom( A1258GuiRemDom );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdivt( A3145GuiRemDivT );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremdiv( A3110GuiRemDiv );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala( A1902CliValA );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre( A11622CliMailGrE );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr( A11620CliMailGr );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke( A11623CliMailPkE );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk( A11621CliMailPk );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Cod_pais( A10301Cod_pais );
            if ( ( GXutil.strcmp(A11622CliMailGrE, "S") == 0 ) || ( GXutil.strcmp(A11623CliMailPkE, "S") == 0 ) )
            {
               edtavIcon_gximage = "Email" ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "gximage", edtavIcon_gximage, !bGXsfl_109_Refreshing);
               AV87Icon = context.getHttpContext().getImagePath( "1b09bc09-7c40-49bb-a9b2-73bc4af027c1", "", context.getHttpContext().getTheme( )) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV235Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_109_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               AV235Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "1b09bc09-7c40-49bb-a9b2-73bc4af027c1", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV235Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_109_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               edtavIcon_Tooltiptext = httpContext.getMessage( "Liberado para enviar por mail !", "") ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Tooltiptext", edtavIcon_Tooltiptext, !bGXsfl_109_Refreshing);
               edtavIcon_Visible = 1 ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavIcon_Visible), 5, 0), !bGXsfl_109_Refreshing);
            }
            if ( ( GXutil.strcmp(A11622CliMailGrE, "S") == 0 ) && (GXutil.strcmp("", A11620CliMailGr)==0) )
            {
               edtavIcon_gximage = "EmailError" ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "gximage", edtavIcon_gximage, !bGXsfl_109_Refreshing);
               AV87Icon = context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV235Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_109_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               AV235Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV235Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_109_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               edtavIcon_Tooltiptext = httpContext.getMessage( "Guia Remessa : NO tiene mail", "") ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Tooltiptext", edtavIcon_Tooltiptext, !bGXsfl_109_Refreshing);
            }
            if ( ( GXutil.strcmp(A11623CliMailPkE, "S") == 0 ) && (GXutil.strcmp("", A11621CliMailPk)==0) )
            {
               edtavIcon_gximage = "EmailError" ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "gximage", edtavIcon_gximage, !bGXsfl_109_Refreshing);
               AV87Icon = context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV235Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_109_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               AV235Icon_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "b1ab6750-3ef5-4f59-b70d-90e710e751d7", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Bitmap", ((GXutil.strcmp("", AV87Icon)==0) ? AV235Icon_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV87Icon))), !bGXsfl_109_Refreshing);
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV87Icon), true);
               edtavIcon_Tooltiptext = httpContext.getMessage( "Packing List : NO tiene mail", "") ;
               httpContext.ajax_rsp_assign_prop("", false, edtavIcon_Internalname, "Tooltiptext", edtavIcon_Tooltiptext, !bGXsfl_109_Refreshing);
            }
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon( AV87Icon );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Icon_gxi( AV235Icon_GXI );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf( AV98Grid_PathPdf );
            AV64SelectedRow.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia( AV100Grid_NmrCopia );
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
         AV63SelectedRows.add(AV64SelectedRow, 0);
         AV65i = (long)(AV65i+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65i), 10, 0));
         AV239GXV3 = (int)(AV239GXV3+1) ;
      }
   }

   public void S142( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV25Session.getValue(AV223Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV223Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV25Session.getValue(AV223Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S152 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         returnInSub = true;
         if (true) return;
      }
      AV241GXV4 = 1 ;
      while ( AV241GXV4 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV241GXV4));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV28TFAlbProCod = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28TFAlbProCod), 10, 0));
            AV29TFAlbProCod_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV88TFGuiRemCln = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88TFGuiRemCln", AV88TFGuiRemCln);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV89TFGuiRemCln_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89TFGuiRemCln_Sel", AV89TFGuiRemCln_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILGRE_SEL") == 0 )
         {
            AV55TFCliMailGrE_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFCliMailGrE_Sel", AV55TFCliMailGrE_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILGR") == 0 )
         {
            AV49TFCliMailGr = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFCliMailGr", AV49TFCliMailGr);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILGR_SEL") == 0 )
         {
            AV50TFCliMailGr_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFCliMailGr_Sel", AV50TFCliMailGr_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILPKE_SEL") == 0 )
         {
            AV56TFCliMailPkE_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFCliMailPkE_Sel", AV56TFCliMailPkE_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILPK") == 0 )
         {
            AV51TFCliMailPk = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFCliMailPk", AV51TFCliMailPk);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCLIMAILPK_SEL") == 0 )
         {
            AV52TFCliMailPk_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFCliMailPk_Sel", AV52TFCliMailPk_Sel);
         }
         AV241GXV4 = (int)(AV241GXV4+1) ;
      }
      GXt_char2 = "" ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV89TFGuiRemCln_Sel)==0), AV89TFGuiRemCln_Sel, GXv_char5) ;
      impresiondeguiaww_impl.this.GXt_char2 = GXv_char5[0] ;
      GXt_char11 = "" ;
      GXv_char4[0] = GXt_char11 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFCliMailGrE_Sel)==0), AV55TFCliMailGrE_Sel, GXv_char4) ;
      impresiondeguiaww_impl.this.GXt_char11 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV50TFCliMailGr_Sel)==0), AV50TFCliMailGr_Sel, GXv_char3) ;
      impresiondeguiaww_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char14[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFCliMailPkE_Sel)==0), AV56TFCliMailPkE_Sel, GXv_char14) ;
      impresiondeguiaww_impl.this.GXt_char13 = GXv_char14[0] ;
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFCliMailPk_Sel)==0), AV52TFCliMailPk_Sel, GXv_char16) ;
      impresiondeguiaww_impl.this.GXt_char15 = GXv_char16[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char2+"|"+GXt_char11+"|"+GXt_char12+"|"+GXt_char13+"|"+GXt_char15 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char15 = "" ;
      GXv_char16[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV88TFGuiRemCln)==0), AV88TFGuiRemCln, GXv_char16) ;
      impresiondeguiaww_impl.this.GXt_char15 = GXv_char16[0] ;
      GXt_char13 = "" ;
      GXv_char14[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV49TFCliMailGr)==0), AV49TFCliMailGr, GXv_char14) ;
      impresiondeguiaww_impl.this.GXt_char13 = GXv_char14[0] ;
      GXt_char12 = "" ;
      GXv_char5[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFCliMailPk)==0), AV51TFCliMailPk, GXv_char5) ;
      impresiondeguiaww_impl.this.GXt_char12 = GXv_char5[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV28TFAlbProCod) ? "" : GXutil.str( AV28TFAlbProCod, 10, 0))+"|"+GXt_char15+"||"+GXt_char13+"||"+GXt_char12 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV29TFAlbProCod_To) ? "" : GXutil.str( AV29TFAlbProCod_To, 10, 0))+"|||||" ;
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
      AV10GridState.fromxml(AV25Session.getValue(AV223Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFALBPROCOD", "", !((0==AV28TFAlbProCod)&&(0==AV29TFAlbProCod_To)), (short)(0), GXutil.trim( GXutil.str( AV28TFAlbProCod, 10, 0)), GXutil.trim( GXutil.str( AV29TFAlbProCod_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFGUIREMCLN", "", !(GXutil.strcmp("", AV88TFGuiRemCln)==0), (short)(0), AV88TFGuiRemCln, "", !(GXutil.strcmp("", AV89TFGuiRemCln_Sel)==0), AV89TFGuiRemCln_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFCLIMAILGRE_SEL", "", !(GXutil.strcmp("", AV55TFCliMailGrE_Sel)==0), (short)(0), AV55TFCliMailGrE_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFCLIMAILGR", "", !(GXutil.strcmp("", AV49TFCliMailGr)==0), (short)(0), AV49TFCliMailGr, "", !(GXutil.strcmp("", AV50TFCliMailGr_Sel)==0), AV50TFCliMailGr_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFCLIMAILPKE_SEL", "", !(GXutil.strcmp("", AV56TFCliMailPkE_Sel)==0), (short)(0), AV56TFCliMailPkE_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      GXv_SdtWWPGridState17[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState17, "TFCLIMAILPK", "", !(GXutil.strcmp("", AV51TFCliMailPk)==0), (short)(0), AV51TFCliMailPk, "", !(GXutil.strcmp("", AV52TFCliMailPk_Sel)==0), AV52TFCliMailPk_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState17[0] ;
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV223Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV223Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "Calprd_TRN" );
      AV25Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S192( )
   {
      /* 'ADD ALL RECORDS' Routine */
      returnInSub = false ;
      AV225Impresiondeguiawwds_1_tfalbprocod = AV28TFAlbProCod ;
      AV226Impresiondeguiawwds_2_tfalbprocod_to = AV29TFAlbProCod_To ;
      AV227Impresiondeguiawwds_3_tfguiremcln = AV88TFGuiRemCln ;
      AV228Impresiondeguiawwds_4_tfguiremcln_sel = AV89TFGuiRemCln_Sel ;
      AV229Impresiondeguiawwds_5_tfclimailgre_sel = AV55TFCliMailGrE_Sel ;
      AV230Impresiondeguiawwds_6_tfclimailgr = AV49TFCliMailGr ;
      AV231Impresiondeguiawwds_7_tfclimailgr_sel = AV50TFCliMailGr_Sel ;
      AV232Impresiondeguiawwds_8_tfclimailpke_sel = AV56TFCliMailPkE_Sel ;
      AV233Impresiondeguiawwds_9_tfclimailpk = AV51TFCliMailPk ;
      AV234Impresiondeguiawwds_10_tfclimailpk_sel = AV52TFCliMailPk_Sel ;
      pr_default.dynParam(5, new Object[]{ new Object[]{
                                           Long.valueOf(AV225Impresiondeguiawwds_1_tfalbprocod) ,
                                           Long.valueOf(AV226Impresiondeguiawwds_2_tfalbprocod_to) ,
                                           AV228Impresiondeguiawwds_4_tfguiremcln_sel ,
                                           AV227Impresiondeguiawwds_3_tfguiremcln ,
                                           AV229Impresiondeguiawwds_5_tfclimailgre_sel ,
                                           AV231Impresiondeguiawwds_7_tfclimailgr_sel ,
                                           AV230Impresiondeguiawwds_6_tfclimailgr ,
                                           AV232Impresiondeguiawwds_8_tfclimailpke_sel ,
                                           AV234Impresiondeguiawwds_10_tfclimailpk_sel ,
                                           AV233Impresiondeguiawwds_9_tfclimailpk ,
                                           Long.valueOf(AV19AlbProCodfrom) ,
                                           AV15ManAut ,
                                           Long.valueOf(AV20AlbProCodto) ,
                                           AV21AlbProfchfrom ,
                                           AV22AlbProfchto ,
                                           Integer.valueOf(AV23CliCodfrom) ,
                                           Integer.valueOf(AV24CliCodto) ,
                                           Long.valueOf(A30AlbProCod) ,
                                           A1244GuiRemCln ,
                                           A11622CliMailGrE ,
                                           A11620CliMailGr ,
                                           A11623CliMailPkE ,
                                           A11621CliMailPk ,
                                           A34AlbProfch ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           Byte.valueOf(A33AlbProEst) ,
                                           A39AlbProPri ,
                                           AV18PRIO ,
                                           AV44EmprCod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.LONG, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.LONG, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.INT, TypeConstants.INT, TypeConstants.LONG, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DATE, TypeConstants.INT, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV227Impresiondeguiawwds_3_tfguiremcln = GXutil.padr( GXutil.rtrim( AV227Impresiondeguiawwds_3_tfguiremcln), 30, "%") ;
      lV230Impresiondeguiawwds_6_tfclimailgr = GXutil.padr( GXutil.rtrim( AV230Impresiondeguiawwds_6_tfclimailgr), 100, "%") ;
      lV233Impresiondeguiawwds_9_tfclimailpk = GXutil.padr( GXutil.rtrim( AV233Impresiondeguiawwds_9_tfclimailpk), 100, "%") ;
      /* Using cursor H029D7 */
      pr_default.execute(5, new Object[] {AV44EmprCod, AV18PRIO, Long.valueOf(AV225Impresiondeguiawwds_1_tfalbprocod), Long.valueOf(AV226Impresiondeguiawwds_2_tfalbprocod_to), lV227Impresiondeguiawwds_3_tfguiremcln, AV228Impresiondeguiawwds_4_tfguiremcln_sel, AV229Impresiondeguiawwds_5_tfclimailgre_sel, lV230Impresiondeguiawwds_6_tfclimailgr, AV231Impresiondeguiawwds_7_tfclimailgr_sel, AV232Impresiondeguiawwds_8_tfclimailpke_sel, lV233Impresiondeguiawwds_9_tfclimailpk, AV234Impresiondeguiawwds_10_tfclimailpk_sel, Long.valueOf(AV19AlbProCodfrom), Long.valueOf(AV20AlbProCodto), AV21AlbProfchfrom, AV22AlbProfchto, Integer.valueOf(AV23CliCodfrom), Integer.valueOf(AV24CliCodto)});
      while ( (pr_default.getStatus(5) != 101) )
      {
         A1253EmprGuiRem = H029D7_A1253EmprGuiRem[0] ;
         A33AlbProEst = H029D7_A33AlbProEst[0] ;
         A1243GuiRemCli = H029D7_A1243GuiRemCli[0] ;
         A34AlbProfch = H029D7_A34AlbProfch[0] ;
         A39AlbProPri = H029D7_A39AlbProPri[0] ;
         A396EmprCod = H029D7_A396EmprCod[0] ;
         A11621CliMailPk = H029D7_A11621CliMailPk[0] ;
         n11621CliMailPk = H029D7_n11621CliMailPk[0] ;
         A11623CliMailPkE = H029D7_A11623CliMailPkE[0] ;
         n11623CliMailPkE = H029D7_n11623CliMailPkE[0] ;
         A11620CliMailGr = H029D7_A11620CliMailGr[0] ;
         n11620CliMailGr = H029D7_n11620CliMailGr[0] ;
         A11622CliMailGrE = H029D7_A11622CliMailGrE[0] ;
         n11622CliMailGrE = H029D7_n11622CliMailGrE[0] ;
         A1244GuiRemCln = H029D7_A1244GuiRemCln[0] ;
         A30AlbProCod = H029D7_A30AlbProCod[0] ;
         A11621CliMailPk = H029D7_A11621CliMailPk[0] ;
         n11621CliMailPk = H029D7_n11621CliMailPk[0] ;
         A11623CliMailPkE = H029D7_A11623CliMailPkE[0] ;
         n11623CliMailPkE = H029D7_n11623CliMailPkE[0] ;
         A11620CliMailGr = H029D7_A11620CliMailGr[0] ;
         n11620CliMailGr = H029D7_n11620CliMailGr[0] ;
         A11622CliMailGrE = H029D7_A11622CliMailGrE[0] ;
         n11622CliMailGrE = H029D7_n11622CliMailGrE[0] ;
         A1244GuiRemCln = H029D7_A1244GuiRemCln[0] ;
         AV66EmprCodCol.add(A396EmprCod, 0);
         AV70AlbProCodCol.add((long)(A30AlbProCod), 0);
         pr_default.readNext(5);
      }
      pr_default.close(5);
   }

   public void S122( )
   {
      /* 'LOADCOMBOCLICODTO' Routine */
      returnInSub = false ;
      /* Using cursor H029D8 */
      pr_default.execute(6);
      while ( (pr_default.getStatus(6) != 101) )
      {
         A10045CliAct = H029D8_A10045CliAct[0] ;
         A396EmprCod = H029D8_A396EmprCod[0] ;
         A13735CliCNom = H029D8_A13735CliCNom[0] ;
         A252CliCod = H029D8_A252CliCod[0] ;
         A279CliNom = H029D8_A279CliNom[0] ;
         AV41Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV41Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV41Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV42CliCodto_Data.add(AV41Combo_DataItem, 0);
         pr_default.readNext(6);
      }
      pr_default.close(6);
      Combo_clicodto_Selectedvalue_set = ((0==AV24CliCodto) ? "" : GXutil.trim( GXutil.str( AV24CliCodto, 6, 0))) ;
      ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
   }

   public void S112( )
   {
      /* 'LOADCOMBOCLICODFROM' Routine */
      returnInSub = false ;
      /* Using cursor H029D9 */
      pr_default.execute(7);
      while ( (pr_default.getStatus(7) != 101) )
      {
         A10045CliAct = H029D9_A10045CliAct[0] ;
         A396EmprCod = H029D9_A396EmprCod[0] ;
         A13735CliCNom = H029D9_A13735CliCNom[0] ;
         A252CliCod = H029D9_A252CliCod[0] ;
         A279CliNom = H029D9_A279CliNom[0] ;
         AV41Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV41Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A252CliCod, 6, 0)) );
         AV41Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13735CliCNom );
         AV40CliCodfrom_Data.add(AV41Combo_DataItem, 0);
         pr_default.readNext(7);
      }
      pr_default.close(7);
      Combo_clicodfrom_Selectedvalue_set = ((0==AV23CliCodfrom) ? "" : GXutil.trim( GXutil.str( AV23CliCodfrom, 6, 0))) ;
      ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
   }

   public void e2329D2( )
   {
      /* Icon_Click Routine */
      returnInSub = false ;
      AV213CliMailGr = A11620CliMailGr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV213CliMailGr", AV213CliMailGr);
      AV216CLIMAILPK = A11621CliMailPk ;
      AV215ImpresionDeGuiawwSDT = new GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem>(app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem.class, "ImpresionDeGuiawwSDTItem", "TexplusNET", remoteHandle) ;
      AV217ImpresionDeGuiawwSDTItem = (app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem)new app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem(remoteHandle, context);
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprocod( A30AlbProCod );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Emprcod( A396EmprCod );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcli( A1243GuiRemCli );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Guiremcln( A1244GuiRemCln );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Clivala( A1902CliValA );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgre( A11622CliMailGrE );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailgr( A11620CliMailGr );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpke( A11623CliMailPkE );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Climailpk( A11621CliMailPk );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albprofch( A34AlbProfch );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Albproest( A33AlbProEst );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_pathpdf( AV17PATHPDF );
      AV217ImpresionDeGuiawwSDTItem.setgxTv_SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem_Grid_nmrcopia( AV14Copias2 );
      AV215ImpresionDeGuiawwSDT.add(AV217ImpresionDeGuiawwSDTItem, 0);
      GXt_objcol_svchar18 = AV104NombresAdjuntos ;
      GXv_objcol_svchar19[0] = GXt_objcol_svchar18 ;
      new app.documentodeguiaremessa(remoteHandle, context).execute( AV215ImpresionDeGuiawwSDT, AV14Copias2, GXv_objcol_svchar19) ;
      GXt_objcol_svchar18 = GXv_objcol_svchar19[0] ;
      AV104NombresAdjuntos = GXt_objcol_svchar18 ;
      /* Execute user subroutine: 'GENERARDATOSCORREO' */
      S202 ();
      if ( returnInSub )
      {
         pr_default.close(4);
         returnInSub = true;
         if (true) return;
      }
      AV219Url = formatLink("app.enviarcorreomodal", new String[] {GXutil.URLEncode(GXutil.rtrim(AV105TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV107ListaCorreosDestino.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV111ListaCorreosCopia.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV109ListaCorreosCopiaOculta.toJSonString(false))),GXutil.URLEncode(GXutil.rtrim(AV116Asunto)),GXutil.URLEncode(GXutil.rtrim(AV110TextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV104NombresAdjuntos.toJSonString(false))),GXutil.URLEncode(GXutil.booltostr(AV113MostrarMail))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail"})  ;
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "ModalPageRedirect", "", new Object[] {AV219Url,httpContext.getMessage( "ENVIAR CORREO", ""),AV219Url,"",httpContext.getMessage( "false", "")});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV107ListaCorreosDestino", AV107ListaCorreosDestino);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111ListaCorreosCopia", AV111ListaCorreosCopia);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV109ListaCorreosCopiaOculta", AV109ListaCorreosCopiaOculta);
   }

   public void e1929D2( )
   {
      /* Albprocodfrom_Isvalid Routine */
      returnInSub = false ;
      AV20AlbProCodto = AV19AlbProCodfrom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20AlbProCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbProCodto), 10, 0));
      if ( AV19AlbProCodfrom > 0 )
      {
         AV24CliCodto = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24CliCodto", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24CliCodto), 6, 0));
         Combo_clicodto_Selectedvalue_set = GXutil.trim( GXutil.str( AV24CliCodto, 6, 0)) ;
         ucCombo_clicodto.sendProperty(context, "", false, Combo_clicodto_Internalname, "SelectedValue_set", Combo_clicodto_Selectedvalue_set);
         AV23CliCodfrom = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23CliCodfrom", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23CliCodfrom), 6, 0));
         Combo_clicodfrom_Selectedvalue_set = GXutil.trim( GXutil.str( AV23CliCodfrom, 6, 0)) ;
         ucCombo_clicodfrom.sendProperty(context, "", false, Combo_clicodfrom_Internalname, "SelectedValue_set", Combo_clicodfrom_Selectedvalue_set);
         AV21AlbProfchfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProfchfrom", localUtil.format(AV21AlbProfchfrom, "99/99/99"));
         AV22AlbProfchto = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfchto", localUtil.format(AV22AlbProfchto, "99/99/99"));
      }
      else
      {
         AV96Ano = (short)(GXutil.year( Gx_date)) ;
         AV97Mes = (short)(GXutil.month( Gx_date)) ;
         AV92IniDate = localUtil.ymdtod( AV96Ano, 1, 1) ;
         AV93EndDate = GXutil.eomdate( Gx_date) ;
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21AlbProfchfrom)) )
         {
            AV21AlbProfchfrom = AV92IniDate ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21AlbProfchfrom", localUtil.format(AV21AlbProfchfrom, "99/99/99"));
         }
         if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22AlbProfchto)) )
         {
            AV22AlbProfchto = AV93EndDate ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22AlbProfchto", localUtil.format(AV22AlbProfchto, "99/99/99"));
         }
      }
      /*  Sending Event outputs  */
   }

   public void S202( )
   {
      /* 'GENERARDATOSCORREO' Routine */
      returnInSub = false ;
      AV105TextoSeparador = "|#@|" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV105TextoSeparador", AV105TextoSeparador);
      AV106CadenaRegistrar = AV213CliMailGr ;
      AV106CadenaRegistrar += AV105TextoSeparador + GXutil.trim( AV214CliNom) ;
      AV107ListaCorreosDestino.clear();
      AV107ListaCorreosDestino.add(AV106CadenaRegistrar, 0);
      AV111ListaCorreosCopia.clear();
      AV106CadenaRegistrar = AV108Usumail ;
      AV106CadenaRegistrar += AV105TextoSeparador + AV45EmprNom ;
      AV109ListaCorreosCopiaOculta.clear();
      AV109ListaCorreosCopiaOculta.add(AV106CadenaRegistrar, 0);
      if ( ! (GXutil.strcmp("", AV102PathXLS_Email)==0) )
      {
         AV110TextoCorreo = httpContext.getMessage( "Envio GUIA e PACKING por e-mail", "") + "<br>" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110TextoCorreo", AV110TextoCorreo);
         AV110TextoCorreo += httpContext.getMessage( "Arquivos anexados: ", "") + AV102PathXLS_Email + "<br>" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110TextoCorreo", AV110TextoCorreo);
         AV116Asunto = httpContext.getMessage( "Envio de GUIA e PACKING", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV116Asunto", AV116Asunto);
      }
      else
      {
         AV110TextoCorreo = httpContext.getMessage( "Envio GUIA por e-mail", "") + "<br>" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110TextoCorreo", AV110TextoCorreo);
         AV110TextoCorreo += httpContext.getMessage( "No arquivo em anexo:", "") + GXutil.trim( AV101PathPDF_Email) + "<br>" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV110TextoCorreo", AV110TextoCorreo);
         AV116Asunto = httpContext.getMessage( "Envio de GUIA", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV116Asunto", AV116Asunto);
      }
      AV110TextoCorreo += httpContext.getMessage( "Atenciosamente,", "") + "<br>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110TextoCorreo", AV110TextoCorreo);
      AV110TextoCorreo += AV45EmprNom + "<br>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110TextoCorreo", AV110TextoCorreo);
      AV110TextoCorreo += "<br>" + "<br>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110TextoCorreo", AV110TextoCorreo);
      AV110TextoCorreo += httpContext.getMessage( "Se enviará a: ", "") + GXutil.trim( AV213CliMailGr) + "<br>" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV110TextoCorreo", AV110TextoCorreo);
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
      pa29D2( ) ;
      ws29D2( ) ;
      we29D2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682415133516", true, true);
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
      httpContext.AddJavascriptSource("impresiondeguiaww.js", "?202682415133516", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_1092( )
   {
      chkavSelected.setInternalname( "vSELECTED_"+sGXsfl_109_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_109_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_109_idx ;
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_109_idx ;
      edtAlbProPri_Internalname = "ALBPROPRI_"+sGXsfl_109_idx ;
      edtAlbProEst_Internalname = "ALBPROEST_"+sGXsfl_109_idx ;
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_109_idx ;
      edtAlbFecSal_Internalname = "ALBFECSAL_"+sGXsfl_109_idx ;
      edtAlbHorSal_Internalname = "ALBHORSAL_"+sGXsfl_109_idx ;
      edtAlbUsu_Internalname = "ALBUSU_"+sGXsfl_109_idx ;
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_109_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_109_idx ;
      edtAlbCliDes_Internalname = "ALBCLIDES_"+sGXsfl_109_idx ;
      edtAlbDomEnv_Internalname = "ALBDOMENV_"+sGXsfl_109_idx ;
      edtTrnCod_Internalname = "TRNCOD_"+sGXsfl_109_idx ;
      edtTrnNom_Internalname = "TRNNOM_"+sGXsfl_109_idx ;
      edtAlbMat_Internalname = "ALBMAT_"+sGXsfl_109_idx ;
      edtAlbSec_Internalname = "ALBSEC_"+sGXsfl_109_idx ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP_"+sGXsfl_109_idx );
      edtAlbLic_Internalname = "ALBLIC_"+sGXsfl_109_idx ;
      cmbAlbProAT.setInternalname( "ALBPROAT_"+sGXsfl_109_idx );
      edtAlbHhfm_Internalname = "ALBHHFM_"+sGXsfl_109_idx ;
      edtAlbGrossT_Internalname = "ALBGROSST_"+sGXsfl_109_idx ;
      edtAlbTrnNc_Internalname = "ALBTRNNC_"+sGXsfl_109_idx ;
      edtAlbFmd_Internalname = "ALBFMD_"+sGXsfl_109_idx ;
      edtAlbTrnNm_Internalname = "ALBTRNNM_"+sGXsfl_109_idx ;
      edtALbFmdc_Internalname = "ALBFMDC_"+sGXsfl_109_idx ;
      edtAlbTrnDm_Internalname = "ALBTRNDM_"+sGXsfl_109_idx ;
      cmbAlbMarca.setInternalname( "ALBMARCA_"+sGXsfl_109_idx );
      edtAlbLocDes_Internalname = "ALBLOCDES_"+sGXsfl_109_idx ;
      edtAlbLocCar_Internalname = "ALBLOCCAR_"+sGXsfl_109_idx ;
      edtAlbPObsCon_Internalname = "ALBPOBSCON_"+sGXsfl_109_idx ;
      edtAlbIvaCod_Internalname = "ALBIVACOD_"+sGXsfl_109_idx ;
      edtAlbColCa_Internalname = "ALBCOLCA_"+sGXsfl_109_idx ;
      edtAlbDesp_Internalname = "ALBDESP_"+sGXsfl_109_idx ;
      edtAlbCambio_Internalname = "ALBCAMBIO_"+sGXsfl_109_idx ;
      edtAlbTipDoc_Internalname = "ALBTIPDOC_"+sGXsfl_109_idx ;
      edtAlbMotTr_Internalname = "ALBMOTTR_"+sGXsfl_109_idx ;
      edtAlbTipCal_Internalname = "ALBTIPCAL_"+sGXsfl_109_idx ;
      edtAlbObsCb_Internalname = "ALBOBSCB_"+sGXsfl_109_idx ;
      edtAlbNumT_Internalname = "ALBNUMT_"+sGXsfl_109_idx ;
      edtAlbMarCo_Internalname = "ALBMARCO_"+sGXsfl_109_idx ;
      edtAlbOComp_Internalname = "ALBOCOMP_"+sGXsfl_109_idx ;
      edtTrnNif_Internalname = "TRNNIF_"+sGXsfl_109_idx ;
      cmbAlbDivTCod.setInternalname( "ALBDIVTCOD_"+sGXsfl_109_idx );
      edtAlbDivAbr_Internalname = "ALBDIVABR_"+sGXsfl_109_idx ;
      edtAlbDivCod_Internalname = "ALBDIVCOD_"+sGXsfl_109_idx ;
      edtBusDomEnv_Internalname = "BUSDOMENV_"+sGXsfl_109_idx ;
      edtEmprGuiRem_Internalname = "EMPRGUIREM_"+sGXsfl_109_idx ;
      edtGuiRemDom_Internalname = "GUIREMDOM_"+sGXsfl_109_idx ;
      cmbGuiRemDivT.setInternalname( "GUIREMDIVT_"+sGXsfl_109_idx );
      edtGuiRemDiv_Internalname = "GUIREMDIV_"+sGXsfl_109_idx ;
      chkCliValA.setInternalname( "CLIVALA_"+sGXsfl_109_idx );
      chkCliMailGrE.setInternalname( "CLIMAILGRE_"+sGXsfl_109_idx );
      edtCliMailGr_Internalname = "CLIMAILGR_"+sGXsfl_109_idx ;
      chkCliMailPkE.setInternalname( "CLIMAILPKE_"+sGXsfl_109_idx );
      edtCliMailPk_Internalname = "CLIMAILPK_"+sGXsfl_109_idx ;
      edtCod_pais_Internalname = "COD_PAIS_"+sGXsfl_109_idx ;
      edtavIcon_Internalname = "vICON_"+sGXsfl_109_idx ;
      edtavGrid_pathpdf_Internalname = "vGRID_PATHPDF_"+sGXsfl_109_idx ;
      edtavGrid_nmrcopia_Internalname = "vGRID_NMRCOPIA_"+sGXsfl_109_idx ;
   }

   public void subsflControlProps_fel_1092( )
   {
      chkavSelected.setInternalname( "vSELECTED_"+sGXsfl_109_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_109_fel_idx ;
      edtEmprNom_Internalname = "EMPRNOM_"+sGXsfl_109_fel_idx ;
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_109_fel_idx ;
      edtAlbProPri_Internalname = "ALBPROPRI_"+sGXsfl_109_fel_idx ;
      edtAlbProEst_Internalname = "ALBPROEST_"+sGXsfl_109_fel_idx ;
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_109_fel_idx ;
      edtAlbFecSal_Internalname = "ALBFECSAL_"+sGXsfl_109_fel_idx ;
      edtAlbHorSal_Internalname = "ALBHORSAL_"+sGXsfl_109_fel_idx ;
      edtAlbUsu_Internalname = "ALBUSU_"+sGXsfl_109_fel_idx ;
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_109_fel_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_109_fel_idx ;
      edtAlbCliDes_Internalname = "ALBCLIDES_"+sGXsfl_109_fel_idx ;
      edtAlbDomEnv_Internalname = "ALBDOMENV_"+sGXsfl_109_fel_idx ;
      edtTrnCod_Internalname = "TRNCOD_"+sGXsfl_109_fel_idx ;
      edtTrnNom_Internalname = "TRNNOM_"+sGXsfl_109_fel_idx ;
      edtAlbMat_Internalname = "ALBMAT_"+sGXsfl_109_fel_idx ;
      edtAlbSec_Internalname = "ALBSEC_"+sGXsfl_109_fel_idx ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP_"+sGXsfl_109_fel_idx );
      edtAlbLic_Internalname = "ALBLIC_"+sGXsfl_109_fel_idx ;
      cmbAlbProAT.setInternalname( "ALBPROAT_"+sGXsfl_109_fel_idx );
      edtAlbHhfm_Internalname = "ALBHHFM_"+sGXsfl_109_fel_idx ;
      edtAlbGrossT_Internalname = "ALBGROSST_"+sGXsfl_109_fel_idx ;
      edtAlbTrnNc_Internalname = "ALBTRNNC_"+sGXsfl_109_fel_idx ;
      edtAlbFmd_Internalname = "ALBFMD_"+sGXsfl_109_fel_idx ;
      edtAlbTrnNm_Internalname = "ALBTRNNM_"+sGXsfl_109_fel_idx ;
      edtALbFmdc_Internalname = "ALBFMDC_"+sGXsfl_109_fel_idx ;
      edtAlbTrnDm_Internalname = "ALBTRNDM_"+sGXsfl_109_fel_idx ;
      cmbAlbMarca.setInternalname( "ALBMARCA_"+sGXsfl_109_fel_idx );
      edtAlbLocDes_Internalname = "ALBLOCDES_"+sGXsfl_109_fel_idx ;
      edtAlbLocCar_Internalname = "ALBLOCCAR_"+sGXsfl_109_fel_idx ;
      edtAlbPObsCon_Internalname = "ALBPOBSCON_"+sGXsfl_109_fel_idx ;
      edtAlbIvaCod_Internalname = "ALBIVACOD_"+sGXsfl_109_fel_idx ;
      edtAlbColCa_Internalname = "ALBCOLCA_"+sGXsfl_109_fel_idx ;
      edtAlbDesp_Internalname = "ALBDESP_"+sGXsfl_109_fel_idx ;
      edtAlbCambio_Internalname = "ALBCAMBIO_"+sGXsfl_109_fel_idx ;
      edtAlbTipDoc_Internalname = "ALBTIPDOC_"+sGXsfl_109_fel_idx ;
      edtAlbMotTr_Internalname = "ALBMOTTR_"+sGXsfl_109_fel_idx ;
      edtAlbTipCal_Internalname = "ALBTIPCAL_"+sGXsfl_109_fel_idx ;
      edtAlbObsCb_Internalname = "ALBOBSCB_"+sGXsfl_109_fel_idx ;
      edtAlbNumT_Internalname = "ALBNUMT_"+sGXsfl_109_fel_idx ;
      edtAlbMarCo_Internalname = "ALBMARCO_"+sGXsfl_109_fel_idx ;
      edtAlbOComp_Internalname = "ALBOCOMP_"+sGXsfl_109_fel_idx ;
      edtTrnNif_Internalname = "TRNNIF_"+sGXsfl_109_fel_idx ;
      cmbAlbDivTCod.setInternalname( "ALBDIVTCOD_"+sGXsfl_109_fel_idx );
      edtAlbDivAbr_Internalname = "ALBDIVABR_"+sGXsfl_109_fel_idx ;
      edtAlbDivCod_Internalname = "ALBDIVCOD_"+sGXsfl_109_fel_idx ;
      edtBusDomEnv_Internalname = "BUSDOMENV_"+sGXsfl_109_fel_idx ;
      edtEmprGuiRem_Internalname = "EMPRGUIREM_"+sGXsfl_109_fel_idx ;
      edtGuiRemDom_Internalname = "GUIREMDOM_"+sGXsfl_109_fel_idx ;
      cmbGuiRemDivT.setInternalname( "GUIREMDIVT_"+sGXsfl_109_fel_idx );
      edtGuiRemDiv_Internalname = "GUIREMDIV_"+sGXsfl_109_fel_idx ;
      chkCliValA.setInternalname( "CLIVALA_"+sGXsfl_109_fel_idx );
      chkCliMailGrE.setInternalname( "CLIMAILGRE_"+sGXsfl_109_fel_idx );
      edtCliMailGr_Internalname = "CLIMAILGR_"+sGXsfl_109_fel_idx ;
      chkCliMailPkE.setInternalname( "CLIMAILPKE_"+sGXsfl_109_fel_idx );
      edtCliMailPk_Internalname = "CLIMAILPK_"+sGXsfl_109_fel_idx ;
      edtCod_pais_Internalname = "COD_PAIS_"+sGXsfl_109_fel_idx ;
      edtavIcon_Internalname = "vICON_"+sGXsfl_109_fel_idx ;
      edtavGrid_pathpdf_Internalname = "vGRID_PATHPDF_"+sGXsfl_109_fel_idx ;
      edtavGrid_nmrcopia_Internalname = "vGRID_NMRCOPIA_"+sGXsfl_109_fel_idx ;
   }

   public void sendrow_1092( )
   {
      subsflControlProps_1092( ) ;
      wb29D0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_109_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_109_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_109_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSelected.getEnabled()!=0)&&(chkavSelected.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 110,'',false,'"+sGXsfl_109_idx+"',109)\"" : " ") ;
         ClassString = "AttributeCheckBox" ;
         StyleString = "" ;
         GXCCtl = "vSELECTED_" + sGXsfl_109_idx ;
         chkavSelected.setName( GXCCtl );
         chkavSelected.setWebtags( "" );
         chkavSelected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSelected.getInternalname(), "TitleCaption", chkavSelected.getCaption(), !bGXsfl_109_Refreshing);
         chkavSelected.setCheckedValue( "false" );
         AV62Selected = GXutil.strtobool( GXutil.booltostr( AV62Selected)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSelected.getInternalname(),GXutil.booltostr( AV62Selected),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"","",TempTags+((chkavSelected.getEnabled()!=0)&&(chkavSelected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,110);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprNom_Internalname,GXutil.rtrim( A407EmprNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCod_Internalname,GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProPri_Internalname,GXutil.rtrim( A39AlbProPri),GXutil.rtrim( localUtil.format( A39AlbProPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProEst_Internalname,GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProEst_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProfch_Internalname,localUtil.format(A34AlbProfch, "99/99/99"),localUtil.format( A34AlbProfch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbFecSal_Internalname,localUtil.format(A4023AlbFecSal, "99/99/99"),localUtil.format( A4023AlbFecSal, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHorSal_Internalname,GXutil.rtrim( A3865AlbHorSal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHorSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbUsu_Internalname,GXutil.rtrim( A7098AlbUsu),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbUsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCln_Internalname,GXutil.rtrim( A1244GuiRemCln),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCliDes_Internalname,GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3869AlbCliDes), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCliDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbDomEnv_Internalname,GXutil.ltrim( localUtil.ntoc( A1259AlbDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1259AlbDomEnv), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbDomEnv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnCod_Internalname,GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A840TrnCod), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","",httpContext.getMessage( "Codigo Transportista", ""),"",edtTrnCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnNom_Internalname,GXutil.rtrim( A841TrnNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrnNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbMat_Internalname,GXutil.rtrim( A3868AlbMat),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbMat_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSec_Internalname,GXutil.rtrim( A2242AlbSec),GXutil.rtrim( localUtil.format( A2242AlbSec, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbEnvFtp.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBENVFTP_" + sGXsfl_109_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbEnvFtp,cmbAlbEnvFtp.getInternalname(),GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)),Integer.valueOf(1),cmbAlbEnvFtp.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), !bGXsfl_109_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbLic_Internalname,GXutil.rtrim( A7101AlbLic),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbLic_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbProAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROAT_" + sGXsfl_109_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProAT,cmbAlbProAT.getInternalname(),GXutil.rtrim( A10765AlbProAT),Integer.valueOf(1),cmbAlbProAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), !bGXsfl_109_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHhfm_Internalname,localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10019AlbHhfm, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHhfm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbGrossT_Internalname,GXutil.ltrim( localUtil.ntoc( A10020AlbGrossT, (byte)(13), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A10020AlbGrossT, "ZZZZZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbGrossT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTrnNc_Internalname,GXutil.rtrim( A10837AlbTrnNc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbTrnNc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbFmd_Internalname,A10017AlbFmd,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbFmd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTrnNm_Internalname,GXutil.rtrim( A10835AlbTrnNm),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbTrnNm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtALbFmdc_Internalname,GXutil.rtrim( A10018ALbFmdc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtALbFmdc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTrnDm_Internalname,GXutil.rtrim( A10836AlbTrnDm),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbTrnDm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbMarca.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBMARCA_" + sGXsfl_109_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbMarca,cmbAlbMarca.getInternalname(),GXutil.rtrim( A5140AlbMarca),Integer.valueOf(1),cmbAlbMarca.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbMarca.setValue( GXutil.rtrim( A5140AlbMarca) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbMarca.getInternalname(), "Values", cmbAlbMarca.ToJavascriptSource(), !bGXsfl_109_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbLocDes_Internalname,GXutil.ltrim( localUtil.ntoc( A3867AlbLocDes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3867AlbLocDes), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbLocDes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbLocCar_Internalname,GXutil.ltrim( localUtil.ntoc( A3866AlbLocCar, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3866AlbLocCar), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbLocCar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPObsCon_Internalname,GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A914AlbPObsCon), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPObsCon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbIvaCod_Internalname,GXutil.rtrim( A5141AlbIvaCod),GXutil.rtrim( localUtil.format( A5141AlbIvaCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbIvaCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbColCa_Internalname,GXutil.rtrim( A7987AlbColCa),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbColCa_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbDesp_Internalname,GXutil.ltrim( localUtil.ntoc( A7162AlbDesp, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7162AlbDesp), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbDesp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbCambio_Internalname,GXutil.ltrim( localUtil.ntoc( A7986AlbCambio, (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A7986AlbCambio, "Z9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbCambio_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTipDoc_Internalname,GXutil.ltrim( localUtil.ntoc( A7985AlbTipDoc, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7985AlbTipDoc), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbTipDoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbMotTr_Internalname,GXutil.rtrim( A7984AlbMotTr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbMotTr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(25),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbTipCal_Internalname,GXutil.ltrim( localUtil.ntoc( A5803AlbTipCal, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5803AlbTipCal), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbTipCal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbObsCb_Internalname,GXutil.rtrim( A7988AlbObsCb),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbObsCb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(60),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbNumT_Internalname,GXutil.ltrim( localUtil.ntoc( A7102AlbNumT, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A7102AlbNumT), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbNumT_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbMarCo_Internalname,GXutil.rtrim( A7100AlbMarCo),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbMarCo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbOComp_Internalname,GXutil.rtrim( A7099AlbOComp),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbOComp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTrnNif_Internalname,GXutil.rtrim( A3643TrnNif),GXutil.rtrim( localUtil.format( A3643TrnNif, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTrnNif_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbAlbDivTCod.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBDIVTCOD_" + sGXsfl_109_idx ;
            cmbAlbDivTCod.setName( GXCCtl );
            cmbAlbDivTCod.setWebtags( "" );
            cmbAlbDivTCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
            cmbAlbDivTCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
            if ( cmbAlbDivTCod.getItemCount() > 0 )
            {
               A3093AlbDivTCod = cmbAlbDivTCod.getValidValue(A3093AlbDivTCod) ;
               n3093AlbDivTCod = false ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbDivTCod,cmbAlbDivTCod.getInternalname(),GXutil.rtrim( A3093AlbDivTCod),Integer.valueOf(1),cmbAlbDivTCod.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbDivTCod.setValue( GXutil.rtrim( A3093AlbDivTCod) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbDivTCod.getInternalname(), "Values", cmbAlbDivTCod.ToJavascriptSource(), !bGXsfl_109_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbDivAbr_Internalname,GXutil.rtrim( A3109AlbDivAbr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbDivAbr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbDivCod_Internalname,GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3108AlbDivCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbDivCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBusDomEnv_Internalname,GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1260BusDomEnv), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBusDomEnv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprGuiRem_Internalname,GXutil.rtrim( A1253EmprGuiRem),GXutil.rtrim( localUtil.format( A1253EmprGuiRem, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprGuiRem_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemDom_Internalname,GXutil.ltrim( localUtil.ntoc( A1258GuiRemDom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1258GuiRemDom), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemDom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         GXCCtl = "GUIREMDIVT_" + sGXsfl_109_idx ;
         cmbGuiRemDivT.setName( GXCCtl );
         cmbGuiRemDivT.setWebtags( "" );
         cmbGuiRemDivT.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
         cmbGuiRemDivT.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
         if ( cmbGuiRemDivT.getItemCount() > 0 )
         {
            A3145GuiRemDivT = cmbGuiRemDivT.getValidValue(A3145GuiRemDivT) ;
            n3145GuiRemDivT = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbGuiRemDivT,cmbGuiRemDivT.getInternalname(),GXutil.rtrim( A3145GuiRemDivT),Integer.valueOf(1),cmbGuiRemDivT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbGuiRemDivT.setValue( GXutil.rtrim( A3145GuiRemDivT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbGuiRemDivT.getInternalname(), "Values", cmbGuiRemDivT.ToJavascriptSource(), !bGXsfl_109_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemDiv_Internalname,GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3110GuiRemDiv), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemDiv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "CLIVALA_" + sGXsfl_109_idx ;
         chkCliValA.setName( GXCCtl );
         chkCliValA.setWebtags( "" );
         chkCliValA.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkCliValA.getInternalname(), "TitleCaption", chkCliValA.getCaption(), !bGXsfl_109_Refreshing);
         chkCliValA.setCheckedValue( "N" );
         A1902CliValA = ((GXutil.strcmp(GXutil.rtrim( A1902CliValA), "S")==0) ? "S" : "N") ;
         n1902CliValA = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkCliValA.getInternalname(),A1902CliValA,"","",Integer.valueOf(0),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "CLIMAILGRE_" + sGXsfl_109_idx ;
         chkCliMailGrE.setName( GXCCtl );
         chkCliMailGrE.setWebtags( "" );
         chkCliMailGrE.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkCliMailGrE.getInternalname(), "TitleCaption", chkCliMailGrE.getCaption(), !bGXsfl_109_Refreshing);
         chkCliMailGrE.setCheckedValue( "N" );
         A11622CliMailGrE = ((GXutil.strcmp(GXutil.rtrim( A11622CliMailGrE), "S")==0) ? "S" : "N") ;
         n11622CliMailGrE = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkCliMailGrE.getInternalname(),A11622CliMailGrE,"","",Integer.valueOf(-1),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliMailGr_Internalname,GXutil.rtrim( A11620CliMailGr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliMailGr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "CLIMAILPKE_" + sGXsfl_109_idx ;
         chkCliMailPkE.setName( GXCCtl );
         chkCliMailPkE.setWebtags( "" );
         chkCliMailPkE.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkCliMailPkE.getInternalname(), "TitleCaption", chkCliMailPkE.getCaption(), !bGXsfl_109_Refreshing);
         chkCliMailPkE.setCheckedValue( "N" );
         A11623CliMailPkE = ((GXutil.strcmp(GXutil.rtrim( A11623CliMailPkE), "S")==0) ? "S" : "N") ;
         n11623CliMailPkE = false ;
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkCliMailPkE.getInternalname(),A11623CliMailPkE,"","",Integer.valueOf(-1),Integer.valueOf(0),"S","",StyleString,ClassString,"WWColumn","",""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliMailPk_Internalname,GXutil.rtrim( A11621CliMailPk),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliMailPk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCod_pais_Internalname,GXutil.ltrim( localUtil.ntoc( A10301Cod_pais, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A10301Cod_pais), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCod_pais_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+((edtavIcon_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavIcon_Enabled!=0)&&(edtavIcon_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 168,'',false,'',109)\"" : " ") ;
         ClassString = "ResponsiveImageAttribute" + " " + ((GXutil.strcmp(edtavIcon_gximage, "")==0) ? "" : "GX_Image_"+edtavIcon_gximage+"_Class") ;
         StyleString = "" ;
         AV87Icon_IsBlob = (boolean)(((GXutil.strcmp("", AV87Icon)==0)&&(GXutil.strcmp("", AV235Icon_GXI)==0))||!(GXutil.strcmp("", AV87Icon)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV87Icon)==0) ? AV235Icon_GXI : httpContext.getResourceRelative(AV87Icon)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavIcon_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(edtavIcon_Visible),Integer.valueOf(1),"",edtavIcon_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavIcon_Jsonclick,"'"+""+"'"+",false,"+"'"+"EVICON.CLICK."+sGXsfl_109_idx+"'",StyleString,ClassString,"WWColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV87Icon_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGrid_pathpdf_Enabled!=0)&&(edtavGrid_pathpdf_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 169,'',false,'"+sGXsfl_109_idx+"',109)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGrid_pathpdf_Internalname,AV98Grid_PathPdf,"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGrid_pathpdf_Enabled!=0)&&(edtavGrid_pathpdf_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,169);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGrid_pathpdf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGrid_pathpdf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(180),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGrid_nmrcopia_Enabled!=0)&&(edtavGrid_nmrcopia_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 170,'',false,'"+sGXsfl_109_idx+"',109)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGrid_nmrcopia_Internalname,GXutil.ltrim( localUtil.ntoc( AV100Grid_NmrCopia, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGrid_nmrcopia_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV100Grid_NmrCopia), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGrid_nmrcopia_Enabled!=0)&&(edtavGrid_nmrcopia_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,170);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGrid_nmrcopia_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavGrid_nmrcopia_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(109),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes29D2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_109_idx = ((subGrid_Islastpage==1)&&(nGXsfl_109_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_109_idx+1) ;
         sGXsfl_109_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_109_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1092( ) ;
      }
      /* End function sendrow_1092 */
   }

   public void startgridcontrol109( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"109\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeCheckBox"+"\" "+" style=\""+""+""+"\" "+">") ;
         if ( chkavSelected.getTitleFormat() == 0 )
         {
            httpContext.writeValue( chkavSelected.getTitle()) ;
         }
         else
         {
            httpContext.writeText( chkavSelected.getTitle()) ;
         }
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nmr. Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora Salida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operador", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente Destino", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Domicilio de Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Matricula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Seccion,C,M,L,etc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envio Albaran FTP", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Licencia Conducir", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Manual o Automatico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora Firma Digital", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Total Bruto Firma", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N contribuiente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Firma Digital", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nome Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Firma Digital Control", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Morada Transportista", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Marca para saber si esta Anula", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Local Descarga", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Local de Carga", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Contador Lineas Observ.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo IVA", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Camion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Despachador", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "TipoCambio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Motivo Traslado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Calidad (Comunicaciones)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Observaciones Cabecera", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero de Transporte(Texfina)", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Marca Camion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden Compra Texfina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Divisa Traspaso Contable", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Abreviatura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Divisa Albaran", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Busca Domicilio de Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "EmprGuiRem", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Domicilio Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Divisa Traspaso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Divisa Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Imprimir Albaran Valorado ?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Enviar Guia ?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Email", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Enviar Pack ? ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Email", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pais", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ResponsiveImageAttribute"+" "+((GXutil.strcmp(edtavIcon_gximage, "")==0) ? "" : "GX_Image_"+edtavIcon_gximage+"_Class")+"\" "+" style=\""+((edtavIcon_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV62Selected));
         GridColumn.AddObjectProperty("Title", GXutil.rtrim( chkavSelected.getTitle()));
         GridColumn.AddObjectProperty("Titleformat", GXutil.ltrim( localUtil.ntoc( chkavSelected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A407EmprNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A39AlbProPri));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A34AlbProfch, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A4023AlbFecSal, "99/99/99"));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3865AlbHorSal));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7098AlbUsu));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1244GuiRemCln));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3869AlbCliDes, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1259AlbDomEnv, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A840TrnCod, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A841TrnNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3868AlbMat));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2242AlbSec));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7101AlbLic));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10765AlbProAT));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10020AlbGrossT, (byte)(13), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10837AlbTrnNc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A10017AlbFmd);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10835AlbTrnNm));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10018ALbFmdc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10836AlbTrnDm));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5140AlbMarca));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3867AlbLocDes, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3866AlbLocCar, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A914AlbPObsCon, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5141AlbIvaCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7987AlbColCa));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7162AlbDesp, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7986AlbCambio, (byte)(7), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7985AlbTipDoc, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7984AlbMotTr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5803AlbTipCal, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7988AlbObsCb));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A7102AlbNumT, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7100AlbMarCo));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7099AlbOComp));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3643TrnNif));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3093AlbDivTCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3109AlbDivAbr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3108AlbDivCod, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1260BusDomEnv, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1253EmprGuiRem));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1258GuiRemDom, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3145GuiRemDivT));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3110GuiRemDiv, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1902CliValA));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11622CliMailGrE));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11620CliMailGr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11623CliMailPkE));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A11621CliMailPk));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A10301Cod_pais, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV87Icon));
         GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavIcon_Tooltiptext));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavIcon_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", AV98Grid_PathPdf);
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGrid_pathpdf_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV100Grid_NmrCopia, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGrid_nmrcopia_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavAlbprofchfrom_Internalname = "vALBPROFCHFROM" ;
      edtavAlbprofchto_Internalname = "vALBPROFCHTO" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavAlbprocodfrom_Internalname = "vALBPROCODFROM" ;
      edtavAlbprocodto_Internalname = "vALBPROCODTO" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      cmbavPrio.setInternalname( "vPRIO" );
      cmbavManaut.setInternalname( "vMANAUT" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTable_filtrosgenerales_Internalname = "TABLE_FILTROSGENERALES" ;
      divPanel_filtrosgenerales_Internalname = "PANEL_FILTROSGENERALES" ;
      Dvpanel_panel_filtrosgenerales_Internalname = "DVPANEL_PANEL_FILTROSGENERALES" ;
      divTable_acciones_Internalname = "TABLE_ACCIONES" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      bttBtn_search_Internalname = "BTN_SEARCH" ;
      divPanel_filtros_Internalname = "PANEL_FILTROS" ;
      Dvpanel_panel_filtros_Internalname = "DVPANEL_PANEL_FILTROS" ;
      divDivheader_Internalname = "DIVHEADER" ;
      bttBtnprocessar_Internalname = "BTNPROCESSAR" ;
      divTableaction_Internalname = "TABLEACTION" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      divTableoptions_Internalname = "TABLEOPTIONS" ;
      chkavSelected.setInternalname( "vSELECTED" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtEmprNom_Internalname = "EMPRNOM" ;
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtAlbProPri_Internalname = "ALBPROPRI" ;
      edtAlbProEst_Internalname = "ALBPROEST" ;
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      edtAlbFecSal_Internalname = "ALBFECSAL" ;
      edtAlbHorSal_Internalname = "ALBHORSAL" ;
      edtAlbUsu_Internalname = "ALBUSU" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      edtAlbCliDes_Internalname = "ALBCLIDES" ;
      edtAlbDomEnv_Internalname = "ALBDOMENV" ;
      edtTrnCod_Internalname = "TRNCOD" ;
      edtTrnNom_Internalname = "TRNNOM" ;
      edtAlbMat_Internalname = "ALBMAT" ;
      edtAlbSec_Internalname = "ALBSEC" ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      edtAlbLic_Internalname = "ALBLIC" ;
      cmbAlbProAT.setInternalname( "ALBPROAT" );
      edtAlbHhfm_Internalname = "ALBHHFM" ;
      edtAlbGrossT_Internalname = "ALBGROSST" ;
      edtAlbTrnNc_Internalname = "ALBTRNNC" ;
      edtAlbFmd_Internalname = "ALBFMD" ;
      edtAlbTrnNm_Internalname = "ALBTRNNM" ;
      edtALbFmdc_Internalname = "ALBFMDC" ;
      edtAlbTrnDm_Internalname = "ALBTRNDM" ;
      cmbAlbMarca.setInternalname( "ALBMARCA" );
      edtAlbLocDes_Internalname = "ALBLOCDES" ;
      edtAlbLocCar_Internalname = "ALBLOCCAR" ;
      edtAlbPObsCon_Internalname = "ALBPOBSCON" ;
      edtAlbIvaCod_Internalname = "ALBIVACOD" ;
      edtAlbColCa_Internalname = "ALBCOLCA" ;
      edtAlbDesp_Internalname = "ALBDESP" ;
      edtAlbCambio_Internalname = "ALBCAMBIO" ;
      edtAlbTipDoc_Internalname = "ALBTIPDOC" ;
      edtAlbMotTr_Internalname = "ALBMOTTR" ;
      edtAlbTipCal_Internalname = "ALBTIPCAL" ;
      edtAlbObsCb_Internalname = "ALBOBSCB" ;
      edtAlbNumT_Internalname = "ALBNUMT" ;
      edtAlbMarCo_Internalname = "ALBMARCO" ;
      edtAlbOComp_Internalname = "ALBOCOMP" ;
      edtTrnNif_Internalname = "TRNNIF" ;
      cmbAlbDivTCod.setInternalname( "ALBDIVTCOD" );
      edtAlbDivAbr_Internalname = "ALBDIVABR" ;
      edtAlbDivCod_Internalname = "ALBDIVCOD" ;
      edtBusDomEnv_Internalname = "BUSDOMENV" ;
      edtEmprGuiRem_Internalname = "EMPRGUIREM" ;
      edtGuiRemDom_Internalname = "GUIREMDOM" ;
      cmbGuiRemDivT.setInternalname( "GUIREMDIVT" );
      edtGuiRemDiv_Internalname = "GUIREMDIV" ;
      chkCliValA.setInternalname( "CLIVALA" );
      chkCliMailGrE.setInternalname( "CLIMAILGRE" );
      edtCliMailGr_Internalname = "CLIMAILGR" ;
      chkCliMailPkE.setInternalname( "CLIMAILPKE" );
      edtCliMailPk_Internalname = "CLIMAILPK" ;
      edtCod_pais_Internalname = "COD_PAIS" ;
      edtavIcon_Internalname = "vICON" ;
      edtavGrid_pathpdf_Internalname = "vGRID_PATHPDF" ;
      edtavGrid_nmrcopia_Internalname = "vGRID_NMRCOPIA" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavClicodfrom_Internalname = "vCLICODFROM" ;
      edtavClicodto_Internalname = "vCLICODTO" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      chkavSelectall.setInternalname( "vSELECTALL" );
      chkavVermail.setInternalname( "vVERMAIL" );
      edtavPathpdf_Internalname = "vPATHPDF" ;
      edtavCopias2_Internalname = "vCOPIAS2" ;
      edtavInfo_Internalname = "vINFO" ;
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
      edtavGrid_nmrcopia_Jsonclick = "" ;
      edtavGrid_nmrcopia_Visible = 0 ;
      edtavGrid_nmrcopia_Enabled = 1 ;
      edtavGrid_pathpdf_Jsonclick = "" ;
      edtavGrid_pathpdf_Visible = 0 ;
      edtavGrid_pathpdf_Enabled = 1 ;
      edtavIcon_Jsonclick = "" ;
      edtavIcon_Enabled = 1 ;
      edtCod_pais_Jsonclick = "" ;
      edtCliMailPk_Jsonclick = "" ;
      chkCliMailPkE.setCaption( "" );
      edtCliMailGr_Jsonclick = "" ;
      chkCliMailGrE.setCaption( "" );
      chkCliValA.setCaption( "" );
      edtGuiRemDiv_Jsonclick = "" ;
      cmbGuiRemDivT.setJsonclick( "" );
      edtGuiRemDom_Jsonclick = "" ;
      edtEmprGuiRem_Jsonclick = "" ;
      edtBusDomEnv_Jsonclick = "" ;
      edtAlbDivCod_Jsonclick = "" ;
      edtAlbDivAbr_Jsonclick = "" ;
      cmbAlbDivTCod.setJsonclick( "" );
      edtTrnNif_Jsonclick = "" ;
      edtAlbOComp_Jsonclick = "" ;
      edtAlbMarCo_Jsonclick = "" ;
      edtAlbNumT_Jsonclick = "" ;
      edtAlbObsCb_Jsonclick = "" ;
      edtAlbTipCal_Jsonclick = "" ;
      edtAlbMotTr_Jsonclick = "" ;
      edtAlbTipDoc_Jsonclick = "" ;
      edtAlbCambio_Jsonclick = "" ;
      edtAlbDesp_Jsonclick = "" ;
      edtAlbColCa_Jsonclick = "" ;
      edtAlbIvaCod_Jsonclick = "" ;
      edtAlbPObsCon_Jsonclick = "" ;
      edtAlbLocCar_Jsonclick = "" ;
      edtAlbLocDes_Jsonclick = "" ;
      cmbAlbMarca.setJsonclick( "" );
      edtAlbTrnDm_Jsonclick = "" ;
      edtALbFmdc_Jsonclick = "" ;
      edtAlbTrnNm_Jsonclick = "" ;
      edtAlbFmd_Jsonclick = "" ;
      edtAlbTrnNc_Jsonclick = "" ;
      edtAlbGrossT_Jsonclick = "" ;
      edtAlbHhfm_Jsonclick = "" ;
      cmbAlbProAT.setJsonclick( "" );
      edtAlbLic_Jsonclick = "" ;
      cmbAlbEnvFtp.setJsonclick( "" );
      edtAlbSec_Jsonclick = "" ;
      edtAlbMat_Jsonclick = "" ;
      edtTrnNom_Jsonclick = "" ;
      edtTrnCod_Jsonclick = "" ;
      edtAlbDomEnv_Jsonclick = "" ;
      edtAlbCliDes_Jsonclick = "" ;
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCli_Jsonclick = "" ;
      edtAlbUsu_Jsonclick = "" ;
      edtAlbHorSal_Jsonclick = "" ;
      edtAlbFecSal_Jsonclick = "" ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProEst_Jsonclick = "" ;
      edtAlbProPri_Jsonclick = "" ;
      edtAlbProCod_Jsonclick = "" ;
      edtEmprNom_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      chkavSelected.setCaption( "" );
      chkavSelected.setVisible( -1 );
      chkavSelected.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavIcon_Visible = -1 ;
      edtavIcon_Tooltiptext = "" ;
      edtavIcon_gximage = "" ;
      chkavSelected.setTitle( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavInfo_Jsonclick = "" ;
      edtavInfo_Visible = 1 ;
      edtavCopias2_Jsonclick = "" ;
      edtavCopias2_Visible = 1 ;
      edtavPathpdf_Jsonclick = "" ;
      edtavPathpdf_Visible = 1 ;
      chkavVermail.setVisible( 1 );
      chkavSelectall.setVisible( 1 );
      edtavClicodto_Jsonclick = "" ;
      edtavClicodto_Visible = 1 ;
      edtavClicodfrom_Jsonclick = "" ;
      edtavClicodfrom_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      cmbavManaut.setJsonclick( "" );
      cmbavManaut.setEnabled( 1 );
      cmbavPrio.setJsonclick( "" );
      cmbavPrio.setEnabled( 1 );
      edtavAlbprocodto_Jsonclick = "" ;
      edtavAlbprocodto_Enabled = 1 ;
      edtavAlbprocodfrom_Jsonclick = "" ;
      edtavAlbprocodfrom_Enabled = 1 ;
      edtavAlbprofchto_Jsonclick = "" ;
      edtavAlbprofchto_Enabled = 1 ;
      edtavAlbprofchfrom_Jsonclick = "" ;
      edtavAlbprofchfrom_Enabled = 1 ;
      divLayoutmaintable_Class = "Table TableWithSelectableGrid" ;
      chkavSelected.setTitleFormat( (short)(0) );
      Grid_empowerer_Fixedcolumns = ";;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;R;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "ImpresionDeGuiawwGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "||S:WWP_TSChecked,N:WWP_TSUnChecked||S:WWP_TSChecked,N:WWP_TSUnChecked|" ;
      Ddo_grid_Datalisttype = "|Dynamic|FixedValues|Dynamic|FixedValues|Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|T|T|T" ;
      Ddo_grid_Filterisrange = "T|||||" ;
      Ddo_grid_Filtertype = "Numeric|Character||Character||Character" ;
      Ddo_grid_Includefilter = "T|T||T||T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6" ;
      Ddo_grid_Columnids = "3:AlbProCod|11:GuiRemCln|53:CliMailGrE|54:CliMailGr|55:CliMailPkE|56:CliMailPk" ;
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
      Dvpanel_panel_filtros_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Iconposition = "Right" ;
      Dvpanel_panel_filtros_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_filtros_Collapsed = GXutil.toBoolean( 1) ;
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
      Combo_clicodto_Emptyitemtext = "Todos" ;
      Combo_clicodto_Cls = "ExtendedCombo AttributeFL" ;
      Combo_clicodfrom_Emptyitemtext = "Todos" ;
      Combo_clicodfrom_Cls = "ExtendedCombo AttributeFL" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Albaran de Produccion", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavPrio.setName( "vPRIO" );
      cmbavPrio.setWebtags( "" );
      cmbavPrio.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavPrio.addItem("0", httpContext.getMessage( "Guia Transporte", ""), (short)(0));
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV18PRIO = cmbavPrio.getValidValue(AV18PRIO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18PRIO", AV18PRIO);
      }
      cmbavManaut.setName( "vMANAUT" );
      cmbavManaut.setWebtags( "" );
      cmbavManaut.addItem("A", httpContext.getMessage( "Automatica", ""), (short)(0));
      cmbavManaut.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      if ( cmbavManaut.getItemCount() > 0 )
      {
         AV15ManAut = cmbavManaut.getValidValue(AV15ManAut) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15ManAut", AV15ManAut);
      }
      GXCCtl = "vSELECTED_" + sGXsfl_109_idx ;
      chkavSelected.setName( GXCCtl );
      chkavSelected.setWebtags( "" );
      chkavSelected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelected.getInternalname(), "TitleCaption", chkavSelected.getCaption(), !bGXsfl_109_Refreshing);
      chkavSelected.setCheckedValue( "false" );
      AV62Selected = GXutil.strtobool( GXutil.booltostr( AV62Selected)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV62Selected);
      GXCCtl = "ALBENVFTP_" + sGXsfl_109_idx ;
      cmbAlbEnvFtp.setName( GXCCtl );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
      }
      GXCCtl = "ALBPROAT_" + sGXsfl_109_idx ;
      cmbAlbProAT.setName( GXCCtl );
      cmbAlbProAT.setWebtags( "" );
      cmbAlbProAT.addItem("A", httpContext.getMessage( "Automatico", ""), (short)(0));
      cmbAlbProAT.addItem("M", httpContext.getMessage( "Manual", ""), (short)(0));
      cmbAlbProAT.addItem("", httpContext.getMessage( "s/d", ""), (short)(0));
      if ( cmbAlbProAT.getItemCount() > 0 )
      {
         A10765AlbProAT = cmbAlbProAT.getValidValue(A10765AlbProAT) ;
      }
      GXCCtl = "ALBMARCA_" + sGXsfl_109_idx ;
      cmbAlbMarca.setName( GXCCtl );
      cmbAlbMarca.setWebtags( "" );
      cmbAlbMarca.addItem("", httpContext.getMessage( "Activo", ""), (short)(0));
      cmbAlbMarca.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbAlbMarca.getItemCount() > 0 )
      {
         A5140AlbMarca = cmbAlbMarca.getValidValue(A5140AlbMarca) ;
      }
      GXCCtl = "ALBDIVTCOD_" + sGXsfl_109_idx ;
      cmbAlbDivTCod.setName( GXCCtl );
      cmbAlbDivTCod.setWebtags( "" );
      cmbAlbDivTCod.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      cmbAlbDivTCod.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      if ( cmbAlbDivTCod.getItemCount() > 0 )
      {
         A3093AlbDivTCod = cmbAlbDivTCod.getValidValue(A3093AlbDivTCod) ;
         n3093AlbDivTCod = false ;
      }
      GXCCtl = "GUIREMDIVT_" + sGXsfl_109_idx ;
      cmbGuiRemDivT.setName( GXCCtl );
      cmbGuiRemDivT.setWebtags( "" );
      cmbGuiRemDivT.addItem("E", httpContext.getMessage( "EURO", ""), (short)(0));
      cmbGuiRemDivT.addItem("P", httpContext.getMessage( "PESETA", ""), (short)(0));
      if ( cmbGuiRemDivT.getItemCount() > 0 )
      {
         A3145GuiRemDivT = cmbGuiRemDivT.getValidValue(A3145GuiRemDivT) ;
         n3145GuiRemDivT = false ;
      }
      GXCCtl = "CLIVALA_" + sGXsfl_109_idx ;
      chkCliValA.setName( GXCCtl );
      chkCliValA.setWebtags( "" );
      chkCliValA.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliValA.getInternalname(), "TitleCaption", chkCliValA.getCaption(), !bGXsfl_109_Refreshing);
      chkCliValA.setCheckedValue( "N" );
      A1902CliValA = ((GXutil.strcmp(GXutil.rtrim( A1902CliValA), "S")==0) ? "S" : "N") ;
      n1902CliValA = false ;
      GXCCtl = "CLIMAILGRE_" + sGXsfl_109_idx ;
      chkCliMailGrE.setName( GXCCtl );
      chkCliMailGrE.setWebtags( "" );
      chkCliMailGrE.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliMailGrE.getInternalname(), "TitleCaption", chkCliMailGrE.getCaption(), !bGXsfl_109_Refreshing);
      chkCliMailGrE.setCheckedValue( "N" );
      A11622CliMailGrE = ((GXutil.strcmp(GXutil.rtrim( A11622CliMailGrE), "S")==0) ? "S" : "N") ;
      n11622CliMailGrE = false ;
      GXCCtl = "CLIMAILPKE_" + sGXsfl_109_idx ;
      chkCliMailPkE.setName( GXCCtl );
      chkCliMailPkE.setWebtags( "" );
      chkCliMailPkE.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkCliMailPkE.getInternalname(), "TitleCaption", chkCliMailPkE.getCaption(), !bGXsfl_109_Refreshing);
      chkCliMailPkE.setCheckedValue( "N" );
      A11623CliMailPkE = ((GXutil.strcmp(GXutil.rtrim( A11623CliMailPkE), "S")==0) ? "S" : "N") ;
      n11623CliMailPkE = false ;
      chkavSelectall.setName( "vSELECTALL" );
      chkavSelectall.setWebtags( "" );
      chkavSelectall.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelectall.getInternalname(), "TitleCaption", chkavSelectall.getCaption(), true);
      chkavSelectall.setCheckedValue( "false" );
      AV86SelectAll = GXutil.strtobool( GXutil.booltostr( AV86SelectAll)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV86SelectAll", AV86SelectAll);
      chkavVermail.setName( "vVERMAIL" );
      chkavVermail.setWebtags( "" );
      chkavVermail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavVermail.getInternalname(), "TitleCaption", chkavVermail.getCaption(), true);
      chkavVermail.setCheckedValue( "false" );
      AV16VerMail = GXutil.strtobool( GXutil.booltostr( AV16VerMail)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16VerMail", AV16VerMail);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'cmbavPrio'},{av:'AV18PRIO',fld:'vPRIO',pic:'9'},{av:'cmbavManaut'},{av:'AV15ManAut',fld:'vMANAUT',pic:''},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV91LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV44EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV89TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV55TFCliMailGrE_Sel',fld:'vTFCLIMAILGRE_SEL',pic:''},{av:'AV49TFCliMailGr',fld:'vTFCLIMAILGR',pic:''},{av:'AV50TFCliMailGr_Sel',fld:'vTFCLIMAILGR_SEL',pic:''},{av:'AV56TFCliMailPkE_Sel',fld:'vTFCLIMAILPKE_SEL',pic:''},{av:'AV51TFCliMailPk',fld:'vTFCLIMAILPK',pic:''},{av:'AV52TFCliMailPk_Sel',fld:'vTFCLIMAILPK_SEL',pic:''},{av:'AV223Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'AV16VerMail',fld:'vVERMAIL',pic:''},{av:'AV113MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV214CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV102PathXLS_Email',fld:'vPATHXLS_EMAIL',pic:'',hsh:true},{av:'AV101PathPDF_Email',fld:'vPATHPDF_EMAIL',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'chkavSelected.getTitle()',ctrl:'vSELECTED',prop:'Title'},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV38GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV39GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''}]}");
      setEventMetadata("'DOSEARCH'","{handler:'e1629D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'cmbavPrio'},{av:'AV18PRIO',fld:'vPRIO',pic:'9'},{av:'cmbavManaut'},{av:'AV15ManAut',fld:'vMANAUT',pic:''},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV44EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV91LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV89TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV55TFCliMailGrE_Sel',fld:'vTFCLIMAILGRE_SEL',pic:''},{av:'AV49TFCliMailGr',fld:'vTFCLIMAILGR',pic:''},{av:'AV50TFCliMailGr_Sel',fld:'vTFCLIMAILGR_SEL',pic:''},{av:'AV56TFCliMailPkE_Sel',fld:'vTFCLIMAILPKE_SEL',pic:''},{av:'AV51TFCliMailPk',fld:'vTFCLIMAILPK',pic:''},{av:'AV52TFCliMailPk_Sel',fld:'vTFCLIMAILPK_SEL',pic:''},{av:'AV223Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'AV16VerMail',fld:'vVERMAIL',pic:''},{av:'AV113MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV214CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV102PathXLS_Email',fld:'vPATHXLS_EMAIL',pic:'',hsh:true},{av:'AV101PathPDF_Email',fld:'vPATHPDF_EMAIL',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true}]");
      setEventMetadata("'DOSEARCH'",",oparms:[{av:'AV91LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'chkavSelected.getTitle()',ctrl:'vSELECTED',prop:'Title'},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV38GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV39GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1329D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'cmbavPrio'},{av:'AV18PRIO',fld:'vPRIO',pic:'9'},{av:'cmbavManaut'},{av:'AV15ManAut',fld:'vMANAUT',pic:''},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV44EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV91LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV89TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV55TFCliMailGrE_Sel',fld:'vTFCLIMAILGRE_SEL',pic:''},{av:'AV49TFCliMailGr',fld:'vTFCLIMAILGR',pic:''},{av:'AV50TFCliMailGr_Sel',fld:'vTFCLIMAILGR_SEL',pic:''},{av:'AV56TFCliMailPkE_Sel',fld:'vTFCLIMAILPKE_SEL',pic:''},{av:'AV51TFCliMailPk',fld:'vTFCLIMAILPK',pic:''},{av:'AV52TFCliMailPk_Sel',fld:'vTFCLIMAILPK_SEL',pic:''},{av:'AV223Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'AV16VerMail',fld:'vVERMAIL',pic:''},{av:'AV113MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV214CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV102PathXLS_Email',fld:'vPATHXLS_EMAIL',pic:'',hsh:true},{av:'AV101PathPDF_Email',fld:'vPATHPDF_EMAIL',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1429D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'cmbavPrio'},{av:'AV18PRIO',fld:'vPRIO',pic:'9'},{av:'cmbavManaut'},{av:'AV15ManAut',fld:'vMANAUT',pic:''},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV44EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV91LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV89TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV55TFCliMailGrE_Sel',fld:'vTFCLIMAILGRE_SEL',pic:''},{av:'AV49TFCliMailGr',fld:'vTFCLIMAILGR',pic:''},{av:'AV50TFCliMailGr_Sel',fld:'vTFCLIMAILGR_SEL',pic:''},{av:'AV56TFCliMailPkE_Sel',fld:'vTFCLIMAILPKE_SEL',pic:''},{av:'AV51TFCliMailPk',fld:'vTFCLIMAILPK',pic:''},{av:'AV52TFCliMailPk_Sel',fld:'vTFCLIMAILPK_SEL',pic:''},{av:'AV223Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'AV16VerMail',fld:'vVERMAIL',pic:''},{av:'AV113MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV214CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV102PathXLS_Email',fld:'vPATHXLS_EMAIL',pic:'',hsh:true},{av:'AV101PathPDF_Email',fld:'vPATHPDF_EMAIL',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1529D2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'cmbavPrio'},{av:'AV18PRIO',fld:'vPRIO',pic:'9'},{av:'cmbavManaut'},{av:'AV15ManAut',fld:'vMANAUT',pic:''},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'AV44EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV91LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV88TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV89TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV55TFCliMailGrE_Sel',fld:'vTFCLIMAILGRE_SEL',pic:''},{av:'AV49TFCliMailGr',fld:'vTFCLIMAILGR',pic:''},{av:'AV50TFCliMailGr_Sel',fld:'vTFCLIMAILGR_SEL',pic:''},{av:'AV56TFCliMailPkE_Sel',fld:'vTFCLIMAILPKE_SEL',pic:''},{av:'AV51TFCliMailPk',fld:'vTFCLIMAILPK',pic:''},{av:'AV52TFCliMailPk_Sel',fld:'vTFCLIMAILPK_SEL',pic:''},{av:'AV223Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'chkavSelected.getTitleFormat()',ctrl:'vSELECTED',prop:'Titleformat'},{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'AV16VerMail',fld:'vVERMAIL',pic:''},{av:'AV113MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV214CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV102PathXLS_Email',fld:'vPATHXLS_EMAIL',pic:'',hsh:true},{av:'AV101PathPDF_Email',fld:'vPATHPDF_EMAIL',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV51TFCliMailPk',fld:'vTFCLIMAILPK',pic:''},{av:'AV52TFCliMailPk_Sel',fld:'vTFCLIMAILPK_SEL',pic:''},{av:'AV56TFCliMailPkE_Sel',fld:'vTFCLIMAILPKE_SEL',pic:''},{av:'AV49TFCliMailGr',fld:'vTFCLIMAILGR',pic:''},{av:'AV50TFCliMailGr_Sel',fld:'vTFCLIMAILGR_SEL',pic:''},{av:'AV55TFCliMailGrE_Sel',fld:'vTFCLIMAILGRE_SEL',pic:''},{av:'AV88TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV89TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2229D2',iparms:[{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''},{av:'A11620CliMailGr',fld:'CLIMAILGR',pic:''},{av:'A11621CliMailPk',fld:'CLIMAILPK',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV98Grid_PathPdf',fld:'vGRID_PATHPDF',pic:'',hsh:true},{av:'AV100Grid_NmrCopia',fld:'vGRID_NMRCOPIA',pic:'ZZZ9',hsh:true},{av:'edtavIcon_Visible',ctrl:'vICON',prop:'Visible'},{av:'AV62Selected',fld:'vSELECTED',pic:''},{av:'AV87Icon',fld:'vICON',pic:''},{av:'edtavIcon_Tooltiptext',ctrl:'vICON',prop:'Tooltiptext'},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV68EmprCodColItem',fld:'vEMPRCODCOLITEM',pic:'@!'}]}");
      setEventMetadata("VSELECTED.CLICK","{handler:'e2429D2',iparms:[{av:'AV62Selected',fld:'vSELECTED',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("VSELECTED.CLICK",",oparms:[{av:'AV69EmprCodToFind',fld:'vEMPRCODTOFIND',pic:'@!'},{av:'AV73AlbProCodToFind',fld:'vALBPROCODTOFIND',pic:'ZZZZZZZZZ9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'divLayoutmaintable_Class',ctrl:'LAYOUTMAINTABLE',prop:'Class'},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV68EmprCodColItem',fld:'vEMPRCODCOLITEM',pic:'@!'}]}");
      setEventMetadata("'DOPROCESSAR'","{handler:'e1729D2',iparms:[{av:'AV63SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'cmbAlbMarca'},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A407EmprNom',fld:'EMPRNOM',pic:''},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A4023AlbFecSal',fld:'ALBFECSAL',pic:''},{av:'A3865AlbHorSal',fld:'ALBHORSAL',pic:''},{av:'A7098AlbUsu',fld:'ALBUSU',pic:''},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A3869AlbCliDes',fld:'ALBCLIDES',pic:'ZZZZZ9'},{av:'A1259AlbDomEnv',fld:'ALBDOMENV',pic:'9'},{av:'A840TrnCod',fld:'TRNCOD',pic:'ZZZ9'},{av:'A841TrnNom',fld:'TRNNOM',pic:''},{av:'A3868AlbMat',fld:'ALBMAT',pic:''},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!'},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'cmbAlbProAT'},{av:'A10765AlbProAT',fld:'ALBPROAT',pic:''},{av:'A10019AlbHhfm',fld:'ALBHHFM',pic:'99/99/99 99:99'},{av:'A10020AlbGrossT',fld:'ALBGROSST',pic:'ZZZZZZZZZ9.99'},{av:'A10837AlbTrnNc',fld:'ALBTRNNC',pic:''},{av:'A10017AlbFmd',fld:'ALBFMD',pic:''},{av:'A10835AlbTrnNm',fld:'ALBTRNNM',pic:''},{av:'A10018ALbFmdc',fld:'ALBFMDC',pic:''},{av:'A10836AlbTrnDm',fld:'ALBTRNDM',pic:''},{av:'A3867AlbLocDes',fld:'ALBLOCDES',pic:'9'},{av:'A3866AlbLocCar',fld:'ALBLOCCAR',pic:'9'},{av:'A914AlbPObsCon',fld:'ALBPOBSCON',pic:'Z9'},{av:'A5141AlbIvaCod',fld:'ALBIVACOD',pic:'@!'},{av:'A7987AlbColCa',fld:'ALBCOLCA',pic:''},{av:'A7162AlbDesp',fld:'ALBDESP',pic:'ZZZZZ9'},{av:'A7986AlbCambio',fld:'ALBCAMBIO',pic:'Z9.9999'},{av:'A7985AlbTipDoc',fld:'ALBTIPDOC',pic:'ZZZZZZZ9'},{av:'A7984AlbMotTr',fld:'ALBMOTTR',pic:''},{av:'A5803AlbTipCal',fld:'ALBTIPCAL',pic:'9'},{av:'A7988AlbObsCb',fld:'ALBOBSCB',pic:''},{av:'A7102AlbNumT',fld:'ALBNUMT',pic:'ZZZZZZZZZ9'},{av:'A7100AlbMarCo',fld:'ALBMARCO',pic:''},{av:'A7099AlbOComp',fld:'ALBOCOMP',pic:''},{av:'A3643TrnNif',fld:'TRNNIF',pic:'@!'},{av:'cmbAlbDivTCod'},{av:'A3093AlbDivTCod',fld:'ALBDIVTCOD',pic:''},{av:'A3109AlbDivAbr',fld:'ALBDIVABR',pic:''},{av:'A3108AlbDivCod',fld:'ALBDIVCOD',pic:'Z9'},{av:'A1260BusDomEnv',fld:'BUSDOMENV',pic:'9'},{av:'A1253EmprGuiRem',fld:'EMPRGUIREM',pic:'@!'},{av:'A1258GuiRemDom',fld:'GUIREMDOM',pic:'9'},{av:'cmbGuiRemDivT'},{av:'A3145GuiRemDivT',fld:'GUIREMDIVT',pic:''},{av:'A3110GuiRemDiv',fld:'GUIREMDIV',pic:'Z9'},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11620CliMailGr',fld:'CLIMAILGR',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''},{av:'A11621CliMailPk',fld:'CLIMAILPK',pic:''},{av:'A10301Cod_pais',fld:'COD_PAIS',pic:'ZZZ9'},{av:'AV87Icon',fld:'vICON',pic:''},{av:'AV235Icon_GXI',fld:'vICON_GXI',pic:''},{av:'AV98Grid_PathPdf',fld:'vGRID_PATHPDF',pic:'',hsh:true},{av:'AV100Grid_NmrCopia',fld:'vGRID_NMRCOPIA',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOPROCESSAR'",",oparms:[{av:'AV63SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV65i',fld:'vI',pic:'ZZZZZZZZZ9'},{av:'AV68EmprCodColItem',fld:'vEMPRCODCOLITEM',pic:'@!'},{av:'AV72AlbProCodColItem',fld:'vALBPROCODCOLITEM',pic:'ZZZZZZZZZ9'},{av:'AV87Icon',fld:'vICON',pic:''},{av:'edtavIcon_Tooltiptext',ctrl:'vICON',prop:'Tooltiptext'},{av:'edtavIcon_Visible',ctrl:'vICON',prop:'Visible'}]}");
      setEventMetadata("VSELECTALL.CLICK","{handler:'e1829D2',iparms:[{av:'AV86SelectAll',fld:'vSELECTALL',pic:''},{av:'AV52TFCliMailPk_Sel',fld:'vTFCLIMAILPK_SEL',pic:''},{av:'AV51TFCliMailPk',fld:'vTFCLIMAILPK',pic:''},{av:'AV56TFCliMailPkE_Sel',fld:'vTFCLIMAILPKE_SEL',pic:''},{av:'AV50TFCliMailGr_Sel',fld:'vTFCLIMAILGR_SEL',pic:''},{av:'AV49TFCliMailGr',fld:'vTFCLIMAILGR',pic:''},{av:'AV55TFCliMailGrE_Sel',fld:'vTFCLIMAILGRE_SEL',pic:''},{av:'AV89TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV88TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV29TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV28TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',grid:109,pic:'@!'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_109',ctrl:'GRID',grid:109,prop:'GridRC',grid:109},{av:'AV44EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'A39AlbProPri',fld:'ALBPROPRI',grid:109,pic:'9'},{av:'cmbavPrio'},{av:'AV18PRIO',fld:'vPRIO',pic:'9'},{av:'cmbavManaut'},{av:'AV15ManAut',fld:'vMANAUT',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',grid:109,pic:'ZZZZZZZZZ9'},{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'A34AlbProfch',fld:'ALBPROFCH',grid:109,pic:''},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'A1243GuiRemCli',fld:'GUIREMCLI',grid:109,pic:'ZZZZZ9'},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'A33AlbProEst',fld:'ALBPROEST',grid:109,pic:'9'},{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''}]");
      setEventMetadata("VSELECTALL.CLICK",",oparms:[{av:'AV66EmprCodCol',fld:'vEMPRCODCOL',pic:''},{av:'AV70AlbProCodCol',fld:'vALBPROCODCOL',pic:''},{av:'AV62Selected',fld:'vSELECTED',pic:''},{av:'AV67EmprCodJson',fld:'vEMPRCODJSON',pic:''},{av:'AV71AlbProCodJson',fld:'vALBPROCODJSON',pic:''},{av:'divLayoutmaintable_Class',ctrl:'LAYOUTMAINTABLE',prop:'Class'}]}");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED","{handler:'e1229D2',iparms:[{av:'Combo_clicodto_Selectedvalue_get',ctrl:'COMBO_CLICODTO',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODTO.ONOPTIONCLICKED",",oparms:[{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'}]}");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED","{handler:'e1129D2',iparms:[{av:'Combo_clicodfrom_Selectedvalue_get',ctrl:'COMBO_CLICODFROM',prop:'SelectedValue_get'}]");
      setEventMetadata("COMBO_CLICODFROM.ONOPTIONCLICKED",",oparms:[{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'}]}");
      setEventMetadata("VICON.CLICK","{handler:'e2329D2',iparms:[{av:'A11620CliMailGr',fld:'CLIMAILGR',pic:''},{av:'A11621CliMailPk',fld:'CLIMAILPK',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A1902CliValA',fld:'CLIVALA',pic:'@!'},{av:'A11622CliMailGrE',fld:'CLIMAILGRE',pic:''},{av:'A11623CliMailPkE',fld:'CLIMAILPKE',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:''},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9'},{av:'AV17PATHPDF',fld:'vPATHPDF',pic:''},{av:'AV14Copias2',fld:'vCOPIAS2',pic:'ZZZ9'},{av:'AV109ListaCorreosCopiaOculta',fld:'vLISTACORREOSCOPIAOCULTA',pic:''},{av:'AV111ListaCorreosCopia',fld:'vLISTACORREOSCOPIA',pic:''},{av:'AV107ListaCorreosDestino',fld:'vLISTACORREOSDESTINO',pic:''},{av:'AV105TextoSeparador',fld:'vTEXTOSEPARADOR',pic:''},{av:'AV116Asunto',fld:'vASUNTO',pic:''},{av:'AV110TextoCorreo',fld:'vTEXTOCORREO',pic:''},{av:'AV113MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV213CliMailGr',fld:'vCLIMAILGR',pic:''},{av:'AV214CliNom',fld:'vCLINOM',pic:'',hsh:true},{av:'AV108Usumail',fld:'vUSUMAIL',pic:'',hsh:true},{av:'AV45EmprNom',fld:'vEMPRNOM',pic:'',hsh:true},{av:'AV102PathXLS_Email',fld:'vPATHXLS_EMAIL',pic:'',hsh:true},{av:'AV101PathPDF_Email',fld:'vPATHPDF_EMAIL',pic:'',hsh:true}]");
      setEventMetadata("VICON.CLICK",",oparms:[{av:'AV213CliMailGr',fld:'vCLIMAILGR',pic:''},{av:'AV105TextoSeparador',fld:'vTEXTOSEPARADOR',pic:''},{av:'AV107ListaCorreosDestino',fld:'vLISTACORREOSDESTINO',pic:''},{av:'AV111ListaCorreosCopia',fld:'vLISTACORREOSCOPIA',pic:''},{av:'AV109ListaCorreosCopiaOculta',fld:'vLISTACORREOSCOPIAOCULTA',pic:''},{av:'AV110TextoCorreo',fld:'vTEXTOCORREO',pic:''},{av:'AV116Asunto',fld:'vASUNTO',pic:''}]}");
      setEventMetadata("VALBPROCODFROM.ISVALID","{handler:'e1929D2',iparms:[{av:'AV19AlbProCodfrom',fld:'vALBPROCODFROM',pic:'ZZZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''}]");
      setEventMetadata("VALBPROCODFROM.ISVALID",",oparms:[{av:'AV20AlbProCodto',fld:'vALBPROCODTO',pic:'ZZZZZZZZZ9'},{av:'AV24CliCodto',fld:'vCLICODTO',pic:'ZZZZZ9'},{av:'Combo_clicodto_Selectedvalue_set',ctrl:'COMBO_CLICODTO',prop:'SelectedValue_set'},{av:'AV23CliCodfrom',fld:'vCLICODFROM',pic:'ZZZZZ9'},{av:'Combo_clicodfrom_Selectedvalue_set',ctrl:'COMBO_CLICODFROM',prop:'SelectedValue_set'},{av:'AV21AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV22AlbProfchto',fld:'vALBPROFCHTO',pic:''}]}");
      setEventMetadata("VALIDV_PRIO","{handler:'validv_Prio',iparms:[]");
      setEventMetadata("VALIDV_PRIO",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_ALBDOMENV","{handler:'valid_Albdomenv',iparms:[]");
      setEventMetadata("VALID_ALBDOMENV",",oparms:[]}");
      setEventMetadata("VALID_TRNCOD","{handler:'valid_Trncod',iparms:[]");
      setEventMetadata("VALID_TRNCOD",",oparms:[]}");
      setEventMetadata("VALID_ALBDIVCOD","{handler:'valid_Albdivcod',iparms:[]");
      setEventMetadata("VALID_ALBDIVCOD",",oparms:[]}");
      setEventMetadata("VALID_EMPRGUIREM","{handler:'valid_Emprguirem',iparms:[]");
      setEventMetadata("VALID_EMPRGUIREM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Grid_nmrcopia',iparms:[]");
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
      pr_default.close(4);
      pr_default.close(1);
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
      Combo_clicodto_Selectedvalue_get = "" ;
      Combo_clicodfrom_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV21AlbProfchfrom = GXutil.nullDate() ;
      AV22AlbProfchto = GXutil.nullDate() ;
      AV18PRIO = "" ;
      AV15ManAut = "" ;
      AV44EmprCod = "" ;
      AV67EmprCodJson = "" ;
      AV71AlbProCodJson = "" ;
      AV88TFGuiRemCln = "" ;
      AV89TFGuiRemCln_Sel = "" ;
      AV55TFCliMailGrE_Sel = "" ;
      AV49TFCliMailGr = "" ;
      AV50TFCliMailGr_Sel = "" ;
      AV56TFCliMailPkE_Sel = "" ;
      AV51TFCliMailPk = "" ;
      AV52TFCliMailPk_Sel = "" ;
      AV223Pgmname = "" ;
      AV17PATHPDF = "" ;
      AV66EmprCodCol = new GXSimpleCollection<String>(String.class, "internal", "");
      AV69EmprCodToFind = "" ;
      AV70AlbProCodCol = new GXSimpleCollection<Long>(Long.class, "internal", "");
      AV214CliNom = "" ;
      AV108Usumail = "" ;
      AV45EmprNom = "" ;
      AV102PathXLS_Email = "" ;
      AV101PathPDF_Email = "" ;
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV40CliCodfrom_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV42CliCodto_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV36DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV63SelectedRows = new GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem>(app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem.class, "ImpresionDeGuiawwSDTItem", "TexplusNET", remoteHandle);
      AV235Icon_GXI = "" ;
      AV109ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV111ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV107ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV105TextoSeparador = "" ;
      AV116Asunto = "" ;
      AV110TextoCorreo = "" ;
      AV213CliMailGr = "" ;
      Combo_clicodfrom_Selectedvalue_set = "" ;
      Combo_clicodto_Selectedvalue_set = "" ;
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
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      bttBtn_search_Jsonclick = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      bttBtnprocessar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      AV112Info = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A396EmprCod = "" ;
      A407EmprNom = "" ;
      A39AlbProPri = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A7098AlbUsu = "" ;
      A1244GuiRemCln = "" ;
      A841TrnNom = "" ;
      A3868AlbMat = "" ;
      A2242AlbSec = "" ;
      A7101AlbLic = "" ;
      A10765AlbProAT = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A10020AlbGrossT = DecimalUtil.ZERO ;
      A10837AlbTrnNc = "" ;
      A10017AlbFmd = "" ;
      A10835AlbTrnNm = "" ;
      A10018ALbFmdc = "" ;
      A10836AlbTrnDm = "" ;
      A5140AlbMarca = "" ;
      A5141AlbIvaCod = "" ;
      A7987AlbColCa = "" ;
      A7986AlbCambio = DecimalUtil.ZERO ;
      A7984AlbMotTr = "" ;
      A7988AlbObsCb = "" ;
      A7100AlbMarCo = "" ;
      A7099AlbOComp = "" ;
      A3643TrnNif = "" ;
      A3093AlbDivTCod = "" ;
      A3109AlbDivAbr = "" ;
      A1253EmprGuiRem = "" ;
      A3145GuiRemDivT = "" ;
      A1902CliValA = "" ;
      A11622CliMailGrE = "" ;
      A11620CliMailGr = "" ;
      A11623CliMailPkE = "" ;
      A11621CliMailPk = "" ;
      AV87Icon = "" ;
      AV98Grid_PathPdf = "" ;
      scmdbuf = "" ;
      lV227Impresiondeguiawwds_3_tfguiremcln = "" ;
      lV230Impresiondeguiawwds_6_tfclimailgr = "" ;
      lV233Impresiondeguiawwds_9_tfclimailpk = "" ;
      AV228Impresiondeguiawwds_4_tfguiremcln_sel = "" ;
      AV227Impresiondeguiawwds_3_tfguiremcln = "" ;
      AV229Impresiondeguiawwds_5_tfclimailgre_sel = "" ;
      AV231Impresiondeguiawwds_7_tfclimailgr_sel = "" ;
      AV230Impresiondeguiawwds_6_tfclimailgr = "" ;
      AV232Impresiondeguiawwds_8_tfclimailpke_sel = "" ;
      AV234Impresiondeguiawwds_10_tfclimailpk_sel = "" ;
      AV233Impresiondeguiawwds_9_tfclimailpk = "" ;
      H029D2_A252CliCod = new int[1] ;
      H029D2_A266CliEnvLin = new byte[1] ;
      H029D2_A10301Cod_pais = new short[1] ;
      H029D2_n10301Cod_pais = new boolean[] {false} ;
      H029D2_A11621CliMailPk = new String[] {""} ;
      H029D2_n11621CliMailPk = new boolean[] {false} ;
      H029D2_A11623CliMailPkE = new String[] {""} ;
      H029D2_n11623CliMailPkE = new boolean[] {false} ;
      H029D2_A11620CliMailGr = new String[] {""} ;
      H029D2_n11620CliMailGr = new boolean[] {false} ;
      H029D2_A11622CliMailGrE = new String[] {""} ;
      H029D2_n11622CliMailGrE = new boolean[] {false} ;
      H029D2_A1902CliValA = new String[] {""} ;
      H029D2_n1902CliValA = new boolean[] {false} ;
      H029D2_A3110GuiRemDiv = new byte[1] ;
      H029D2_n3110GuiRemDiv = new boolean[] {false} ;
      H029D2_A3145GuiRemDivT = new String[] {""} ;
      H029D2_n3145GuiRemDivT = new boolean[] {false} ;
      H029D2_A1258GuiRemDom = new byte[1] ;
      H029D2_n1258GuiRemDom = new boolean[] {false} ;
      H029D2_A1253EmprGuiRem = new String[] {""} ;
      H029D2_A3108AlbDivCod = new byte[1] ;
      H029D2_n3108AlbDivCod = new boolean[] {false} ;
      H029D2_A3109AlbDivAbr = new String[] {""} ;
      H029D2_n3109AlbDivAbr = new boolean[] {false} ;
      H029D2_A3093AlbDivTCod = new String[] {""} ;
      H029D2_n3093AlbDivTCod = new boolean[] {false} ;
      H029D2_A3643TrnNif = new String[] {""} ;
      H029D2_n3643TrnNif = new boolean[] {false} ;
      H029D2_A7099AlbOComp = new String[] {""} ;
      H029D2_A7100AlbMarCo = new String[] {""} ;
      H029D2_A7102AlbNumT = new long[1] ;
      H029D2_A7988AlbObsCb = new String[] {""} ;
      H029D2_A5803AlbTipCal = new byte[1] ;
      H029D2_A7984AlbMotTr = new String[] {""} ;
      H029D2_A7985AlbTipDoc = new int[1] ;
      H029D2_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029D2_A7162AlbDesp = new int[1] ;
      H029D2_A7987AlbColCa = new String[] {""} ;
      H029D2_A5141AlbIvaCod = new String[] {""} ;
      H029D2_A914AlbPObsCon = new byte[1] ;
      H029D2_A3866AlbLocCar = new byte[1] ;
      H029D2_A3867AlbLocDes = new byte[1] ;
      H029D2_A5140AlbMarca = new String[] {""} ;
      H029D2_A10836AlbTrnDm = new String[] {""} ;
      H029D2_A10018ALbFmdc = new String[] {""} ;
      H029D2_A10835AlbTrnNm = new String[] {""} ;
      H029D2_A10017AlbFmd = new String[] {""} ;
      H029D2_n10017AlbFmd = new boolean[] {false} ;
      H029D2_A10837AlbTrnNc = new String[] {""} ;
      H029D2_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029D2_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      H029D2_A10765AlbProAT = new String[] {""} ;
      H029D2_A7101AlbLic = new String[] {""} ;
      H029D2_A5805AlbEnvFtp = new byte[1] ;
      H029D2_A2242AlbSec = new String[] {""} ;
      H029D2_A3868AlbMat = new String[] {""} ;
      H029D2_A841TrnNom = new String[] {""} ;
      H029D2_n841TrnNom = new boolean[] {false} ;
      H029D2_A840TrnCod = new short[1] ;
      H029D2_A1259AlbDomEnv = new byte[1] ;
      H029D2_n1259AlbDomEnv = new boolean[] {false} ;
      H029D2_A3869AlbCliDes = new int[1] ;
      H029D2_A1244GuiRemCln = new String[] {""} ;
      H029D2_A1243GuiRemCli = new int[1] ;
      H029D2_A7098AlbUsu = new String[] {""} ;
      H029D2_A3865AlbHorSal = new String[] {""} ;
      H029D2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H029D2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H029D2_A33AlbProEst = new byte[1] ;
      H029D2_A39AlbProPri = new String[] {""} ;
      H029D2_A30AlbProCod = new long[1] ;
      H029D2_A407EmprNom = new String[] {""} ;
      H029D2_n407EmprNom = new boolean[] {false} ;
      H029D2_A396EmprCod = new String[] {""} ;
      H029D2_A1260BusDomEnv = new byte[1] ;
      H029D2_n1260BusDomEnv = new boolean[] {false} ;
      H029D3_A3643TrnNif = new String[] {""} ;
      H029D3_n3643TrnNif = new boolean[] {false} ;
      H029D3_A841TrnNom = new String[] {""} ;
      H029D3_n841TrnNom = new boolean[] {false} ;
      H029D4_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      AV43Station = "" ;
      AV46UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV47Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV47Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_int8 = new int[1] ;
      AV92IniDate = GXutil.nullDate() ;
      AV93EndDate = GXutil.nullDate() ;
      GXv_int10 = new byte[1] ;
      GXv_SdtWWPContext1 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV64SelectedRow = new app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem(remoteHandle, context);
      AV68EmprCodColItem = "" ;
      H029D5_A252CliCod = new int[1] ;
      H029D5_A266CliEnvLin = new byte[1] ;
      H029D5_A30AlbProCod = new long[1] ;
      H029D5_A396EmprCod = new String[] {""} ;
      H029D5_A407EmprNom = new String[] {""} ;
      H029D5_n407EmprNom = new boolean[] {false} ;
      H029D5_A39AlbProPri = new String[] {""} ;
      H029D5_A33AlbProEst = new byte[1] ;
      H029D5_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H029D5_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H029D5_A3865AlbHorSal = new String[] {""} ;
      H029D5_A7098AlbUsu = new String[] {""} ;
      H029D5_A1243GuiRemCli = new int[1] ;
      H029D5_A1244GuiRemCln = new String[] {""} ;
      H029D5_A3869AlbCliDes = new int[1] ;
      H029D5_A1259AlbDomEnv = new byte[1] ;
      H029D5_n1259AlbDomEnv = new boolean[] {false} ;
      H029D5_A840TrnCod = new short[1] ;
      H029D5_A841TrnNom = new String[] {""} ;
      H029D5_n841TrnNom = new boolean[] {false} ;
      H029D5_A3868AlbMat = new String[] {""} ;
      H029D5_A2242AlbSec = new String[] {""} ;
      H029D5_A5805AlbEnvFtp = new byte[1] ;
      H029D5_A7101AlbLic = new String[] {""} ;
      H029D5_A10765AlbProAT = new String[] {""} ;
      H029D5_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      H029D5_A10020AlbGrossT = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029D5_A10837AlbTrnNc = new String[] {""} ;
      H029D5_A10017AlbFmd = new String[] {""} ;
      H029D5_n10017AlbFmd = new boolean[] {false} ;
      H029D5_A10835AlbTrnNm = new String[] {""} ;
      H029D5_A10018ALbFmdc = new String[] {""} ;
      H029D5_A10836AlbTrnDm = new String[] {""} ;
      H029D5_A5140AlbMarca = new String[] {""} ;
      H029D5_A3867AlbLocDes = new byte[1] ;
      H029D5_A3866AlbLocCar = new byte[1] ;
      H029D5_A914AlbPObsCon = new byte[1] ;
      H029D5_A5141AlbIvaCod = new String[] {""} ;
      H029D5_A7987AlbColCa = new String[] {""} ;
      H029D5_A7162AlbDesp = new int[1] ;
      H029D5_A7986AlbCambio = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H029D5_A7985AlbTipDoc = new int[1] ;
      H029D5_A7984AlbMotTr = new String[] {""} ;
      H029D5_A5803AlbTipCal = new byte[1] ;
      H029D5_A7988AlbObsCb = new String[] {""} ;
      H029D5_A7102AlbNumT = new long[1] ;
      H029D5_A7100AlbMarCo = new String[] {""} ;
      H029D5_A7099AlbOComp = new String[] {""} ;
      H029D5_A3643TrnNif = new String[] {""} ;
      H029D5_n3643TrnNif = new boolean[] {false} ;
      H029D5_A3093AlbDivTCod = new String[] {""} ;
      H029D5_n3093AlbDivTCod = new boolean[] {false} ;
      H029D5_A3109AlbDivAbr = new String[] {""} ;
      H029D5_n3109AlbDivAbr = new boolean[] {false} ;
      H029D5_A3108AlbDivCod = new byte[1] ;
      H029D5_n3108AlbDivCod = new boolean[] {false} ;
      H029D5_A1253EmprGuiRem = new String[] {""} ;
      H029D5_A1258GuiRemDom = new byte[1] ;
      H029D5_n1258GuiRemDom = new boolean[] {false} ;
      H029D5_A3145GuiRemDivT = new String[] {""} ;
      H029D5_n3145GuiRemDivT = new boolean[] {false} ;
      H029D5_A3110GuiRemDiv = new byte[1] ;
      H029D5_n3110GuiRemDiv = new boolean[] {false} ;
      H029D5_A1902CliValA = new String[] {""} ;
      H029D5_n1902CliValA = new boolean[] {false} ;
      H029D5_A11622CliMailGrE = new String[] {""} ;
      H029D5_n11622CliMailGrE = new boolean[] {false} ;
      H029D5_A11620CliMailGr = new String[] {""} ;
      H029D5_n11620CliMailGr = new boolean[] {false} ;
      H029D5_A11623CliMailPkE = new String[] {""} ;
      H029D5_n11623CliMailPkE = new boolean[] {false} ;
      H029D5_A11621CliMailPk = new String[] {""} ;
      H029D5_n11621CliMailPk = new boolean[] {false} ;
      H029D5_A10301Cod_pais = new short[1] ;
      H029D5_n10301Cod_pais = new boolean[] {false} ;
      H029D5_A1260BusDomEnv = new byte[1] ;
      H029D5_n1260BusDomEnv = new boolean[] {false} ;
      H029D6_A841TrnNom = new String[] {""} ;
      H029D6_n841TrnNom = new boolean[] {false} ;
      H029D6_A3643TrnNif = new String[] {""} ;
      H029D6_n3643TrnNif = new boolean[] {false} ;
      AV25Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char2 = "" ;
      GXt_char11 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXt_char15 = "" ;
      GXv_char16 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char14 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char5 = new String[1] ;
      GXv_SdtWWPGridState17 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H029D7_A1253EmprGuiRem = new String[] {""} ;
      H029D7_A33AlbProEst = new byte[1] ;
      H029D7_A1243GuiRemCli = new int[1] ;
      H029D7_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H029D7_A39AlbProPri = new String[] {""} ;
      H029D7_A396EmprCod = new String[] {""} ;
      H029D7_A11621CliMailPk = new String[] {""} ;
      H029D7_n11621CliMailPk = new boolean[] {false} ;
      H029D7_A11623CliMailPkE = new String[] {""} ;
      H029D7_n11623CliMailPkE = new boolean[] {false} ;
      H029D7_A11620CliMailGr = new String[] {""} ;
      H029D7_n11620CliMailGr = new boolean[] {false} ;
      H029D7_A11622CliMailGrE = new String[] {""} ;
      H029D7_n11622CliMailGrE = new boolean[] {false} ;
      H029D7_A1244GuiRemCln = new String[] {""} ;
      H029D7_A30AlbProCod = new long[1] ;
      H029D8_A10045CliAct = new String[] {""} ;
      H029D8_A396EmprCod = new String[] {""} ;
      H029D8_A13735CliCNom = new String[] {""} ;
      H029D8_A252CliCod = new int[1] ;
      H029D8_A279CliNom = new String[] {""} ;
      A10045CliAct = "" ;
      A13735CliCNom = "" ;
      A279CliNom = "" ;
      AV41Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      H029D9_A10045CliAct = new String[] {""} ;
      H029D9_A396EmprCod = new String[] {""} ;
      H029D9_A13735CliCNom = new String[] {""} ;
      H029D9_A252CliCod = new int[1] ;
      H029D9_A279CliNom = new String[] {""} ;
      AV216CLIMAILPK = "" ;
      AV215ImpresionDeGuiawwSDT = new GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem>(app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem.class, "ImpresionDeGuiawwSDTItem", "TexplusNET", remoteHandle);
      AV217ImpresionDeGuiawwSDTItem = new app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem(remoteHandle, context);
      AV104NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      GXt_objcol_svchar18 = new GXSimpleCollection<String>(String.class, "internal", "");
      GXv_objcol_svchar19 = new GXSimpleCollection[1] ;
      AV219Url = "" ;
      AV106CadenaRegistrar = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      sImgUrl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.impresiondeguiaww__default(),
         new Object[] {
             new Object[] {
            H029D2_A252CliCod, H029D2_A266CliEnvLin, H029D2_A10301Cod_pais, H029D2_n10301Cod_pais, H029D2_A11621CliMailPk, H029D2_n11621CliMailPk, H029D2_A11623CliMailPkE, H029D2_n11623CliMailPkE, H029D2_A11620CliMailGr, H029D2_n11620CliMailGr,
            H029D2_A11622CliMailGrE, H029D2_n11622CliMailGrE, H029D2_A1902CliValA, H029D2_n1902CliValA, H029D2_A3110GuiRemDiv, H029D2_n3110GuiRemDiv, H029D2_A3145GuiRemDivT, H029D2_n3145GuiRemDivT, H029D2_A1258GuiRemDom, H029D2_n1258GuiRemDom,
            H029D2_A1253EmprGuiRem, H029D2_A3108AlbDivCod, H029D2_n3108AlbDivCod, H029D2_A3109AlbDivAbr, H029D2_n3109AlbDivAbr, H029D2_A3093AlbDivTCod, H029D2_n3093AlbDivTCod, H029D2_A3643TrnNif, H029D2_n3643TrnNif, H029D2_A7099AlbOComp,
            H029D2_A7100AlbMarCo, H029D2_A7102AlbNumT, H029D2_A7988AlbObsCb, H029D2_A5803AlbTipCal, H029D2_A7984AlbMotTr, H029D2_A7985AlbTipDoc, H029D2_A7986AlbCambio, H029D2_A7162AlbDesp, H029D2_A7987AlbColCa, H029D2_A5141AlbIvaCod,
            H029D2_A914AlbPObsCon, H029D2_A3866AlbLocCar, H029D2_A3867AlbLocDes, H029D2_A5140AlbMarca, H029D2_A10836AlbTrnDm, H029D2_A10018ALbFmdc, H029D2_A10835AlbTrnNm, H029D2_A10017AlbFmd, H029D2_n10017AlbFmd, H029D2_A10837AlbTrnNc,
            H029D2_A10020AlbGrossT, H029D2_A10019AlbHhfm, H029D2_A10765AlbProAT, H029D2_A7101AlbLic, H029D2_A5805AlbEnvFtp, H029D2_A2242AlbSec, H029D2_A3868AlbMat, H029D2_A841TrnNom, H029D2_n841TrnNom, H029D2_A840TrnCod,
            H029D2_A1259AlbDomEnv, H029D2_n1259AlbDomEnv, H029D2_A3869AlbCliDes, H029D2_A1244GuiRemCln, H029D2_A1243GuiRemCli, H029D2_A7098AlbUsu, H029D2_A3865AlbHorSal, H029D2_A4023AlbFecSal, H029D2_A34AlbProfch, H029D2_A33AlbProEst,
            H029D2_A39AlbProPri, H029D2_A30AlbProCod, H029D2_A407EmprNom, H029D2_n407EmprNom, H029D2_A396EmprCod, H029D2_A1260BusDomEnv, H029D2_n1260BusDomEnv
            }
            , new Object[] {
            H029D3_A3643TrnNif, H029D3_n3643TrnNif, H029D3_A841TrnNom, H029D3_n841TrnNom
            }
            , new Object[] {
            H029D4_AGRID_nRecordCount
            }
            , new Object[] {
            H029D5_A252CliCod, H029D5_A266CliEnvLin, H029D5_A30AlbProCod, H029D5_A396EmprCod, H029D5_A407EmprNom, H029D5_n407EmprNom, H029D5_A39AlbProPri, H029D5_A33AlbProEst, H029D5_A34AlbProfch, H029D5_A4023AlbFecSal,
            H029D5_A3865AlbHorSal, H029D5_A7098AlbUsu, H029D5_A1243GuiRemCli, H029D5_A1244GuiRemCln, H029D5_A3869AlbCliDes, H029D5_A1259AlbDomEnv, H029D5_n1259AlbDomEnv, H029D5_A840TrnCod, H029D5_A841TrnNom, H029D5_n841TrnNom,
            H029D5_A3868AlbMat, H029D5_A2242AlbSec, H029D5_A5805AlbEnvFtp, H029D5_A7101AlbLic, H029D5_A10765AlbProAT, H029D5_A10019AlbHhfm, H029D5_A10020AlbGrossT, H029D5_A10837AlbTrnNc, H029D5_A10017AlbFmd, H029D5_n10017AlbFmd,
            H029D5_A10835AlbTrnNm, H029D5_A10018ALbFmdc, H029D5_A10836AlbTrnDm, H029D5_A5140AlbMarca, H029D5_A3867AlbLocDes, H029D5_A3866AlbLocCar, H029D5_A914AlbPObsCon, H029D5_A5141AlbIvaCod, H029D5_A7987AlbColCa, H029D5_A7162AlbDesp,
            H029D5_A7986AlbCambio, H029D5_A7985AlbTipDoc, H029D5_A7984AlbMotTr, H029D5_A5803AlbTipCal, H029D5_A7988AlbObsCb, H029D5_A7102AlbNumT, H029D5_A7100AlbMarCo, H029D5_A7099AlbOComp, H029D5_A3643TrnNif, H029D5_n3643TrnNif,
            H029D5_A3093AlbDivTCod, H029D5_n3093AlbDivTCod, H029D5_A3109AlbDivAbr, H029D5_n3109AlbDivAbr, H029D5_A3108AlbDivCod, H029D5_n3108AlbDivCod, H029D5_A1253EmprGuiRem, H029D5_A1258GuiRemDom, H029D5_n1258GuiRemDom, H029D5_A3145GuiRemDivT,
            H029D5_n3145GuiRemDivT, H029D5_A3110GuiRemDiv, H029D5_n3110GuiRemDiv, H029D5_A1902CliValA, H029D5_n1902CliValA, H029D5_A11622CliMailGrE, H029D5_n11622CliMailGrE, H029D5_A11620CliMailGr, H029D5_n11620CliMailGr, H029D5_A11623CliMailPkE,
            H029D5_n11623CliMailPkE, H029D5_A11621CliMailPk, H029D5_n11621CliMailPk, H029D5_A10301Cod_pais, H029D5_n10301Cod_pais, H029D5_A1260BusDomEnv, H029D5_n1260BusDomEnv
            }
            , new Object[] {
            H029D6_A841TrnNom, H029D6_n841TrnNom, H029D6_A3643TrnNif, H029D6_n3643TrnNif
            }
            , new Object[] {
            H029D7_A1253EmprGuiRem, H029D7_A33AlbProEst, H029D7_A1243GuiRemCli, H029D7_A34AlbProfch, H029D7_A39AlbProPri, H029D7_A396EmprCod, H029D7_A11621CliMailPk, H029D7_n11621CliMailPk, H029D7_A11623CliMailPkE, H029D7_n11623CliMailPkE,
            H029D7_A11620CliMailGr, H029D7_n11620CliMailGr, H029D7_A11622CliMailGrE, H029D7_n11622CliMailGrE, H029D7_A1244GuiRemCln, H029D7_A30AlbProCod
            }
            , new Object[] {
            H029D8_A10045CliAct, H029D8_A396EmprCod, H029D8_A13735CliCNom, H029D8_A252CliCod, H029D8_A279CliNom
            }
            , new Object[] {
            H029D9_A10045CliAct, H029D9_A396EmprCod, H029D9_A13735CliCNom, H029D9_A252CliCod, H029D9_A279CliNom
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV223Pgmname = "ImpresionDeGuiaww" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV223Pgmname = "ImpresionDeGuiaww" ;
      Gx_err = (short)(0) ;
      edtavGrid_pathpdf_Enabled = 0 ;
      edtavGrid_nmrcopia_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A33AlbProEst ;
   private byte A1259AlbDomEnv ;
   private byte A5805AlbEnvFtp ;
   private byte A3867AlbLocDes ;
   private byte A3866AlbLocCar ;
   private byte A914AlbPObsCon ;
   private byte A5803AlbTipCal ;
   private byte A3108AlbDivCod ;
   private byte A1260BusDomEnv ;
   private byte A1258GuiRemDom ;
   private byte A3110GuiRemDiv ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int9 ;
   private byte GXv_int10[] ;
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
   private short AV12OrderedBy ;
   private short AV14Copias2 ;
   private short wbEnd ;
   private short wbStart ;
   private short A840TrnCod ;
   private short A10301Cod_pais ;
   private short AV100Grid_NmrCopia ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV94Copias ;
   private short AV96Ano ;
   private short AV97Mes ;
   private short AV103Moda21 ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_109 ;
   private int nGXsfl_109_idx=1 ;
   private int AV23CliCodfrom ;
   private int AV24CliCodto ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbprofchfrom_Enabled ;
   private int edtavAlbprofchto_Enabled ;
   private int edtavAlbprocodfrom_Enabled ;
   private int edtavAlbprocodto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavClicodfrom_Visible ;
   private int edtavClicodto_Visible ;
   private int edtavPathpdf_Visible ;
   private int edtavCopias2_Visible ;
   private int edtavInfo_Visible ;
   private int A1243GuiRemCli ;
   private int A3869AlbCliDes ;
   private int A7162AlbDesp ;
   private int A7985AlbTipDoc ;
   private int subGrid_Islastpage ;
   private int edtavGrid_pathpdf_Enabled ;
   private int edtavGrid_nmrcopia_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXv_int8[] ;
   private int AV37PageToGo ;
   private int edtavIcon_Visible ;
   private int AV236GXV1 ;
   private int nGXsfl_109_fel_idx=1 ;
   private int AV238GXV2 ;
   private int AV239GXV3 ;
   private int AV241GXV4 ;
   private int A252CliCod ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavIcon_Enabled ;
   private int edtavGrid_pathpdf_Visible ;
   private int edtavGrid_nmrcopia_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int GX_I ;
   private long GRID_nFirstRecordOnPage ;
   private long AV19AlbProCodfrom ;
   private long AV20AlbProCodto ;
   private long AV28TFAlbProCod ;
   private long AV29TFAlbProCod_To ;
   private long AV65i ;
   private long AV73AlbProCodToFind ;
   private long AV38GridCurrentPage ;
   private long AV39GridPageCount ;
   private long A30AlbProCod ;
   private long A7102AlbNumT ;
   private long GRID_nCurrentRecord ;
   private long AV225Impresiondeguiawwds_1_tfalbprocod ;
   private long AV226Impresiondeguiawwds_2_tfalbprocod_to ;
   private long GRID_nRecordCount ;
   private long AV72AlbProCodColItem ;
   private java.math.BigDecimal A10020AlbGrossT ;
   private java.math.BigDecimal A7986AlbCambio ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Combo_clicodto_Selectedvalue_get ;
   private String Combo_clicodfrom_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_109_idx="0001" ;
   private String AV18PRIO ;
   private String AV15ManAut ;
   private String AV44EmprCod ;
   private String AV88TFGuiRemCln ;
   private String AV89TFGuiRemCln_Sel ;
   private String AV55TFCliMailGrE_Sel ;
   private String AV49TFCliMailGr ;
   private String AV50TFCliMailGr_Sel ;
   private String AV56TFCliMailPkE_Sel ;
   private String AV51TFCliMailPk ;
   private String AV52TFCliMailPk_Sel ;
   private String AV223Pgmname ;
   private String AV17PATHPDF ;
   private String AV69EmprCodToFind ;
   private String AV214CliNom ;
   private String AV108Usumail ;
   private String AV45EmprNom ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV213CliMailGr ;
   private String Combo_clicodfrom_Cls ;
   private String Combo_clicodfrom_Selectedvalue_set ;
   private String Combo_clicodfrom_Emptyitemtext ;
   private String Combo_clicodto_Cls ;
   private String Combo_clicodto_Selectedvalue_set ;
   private String Combo_clicodto_Emptyitemtext ;
   private String Dvpanel_panel_filtrosgenerales_Width ;
   private String Dvpanel_panel_filtrosgenerales_Cls ;
   private String Dvpanel_panel_filtrosgenerales_Title ;
   private String Dvpanel_panel_filtrosgenerales_Iconposition ;
   private String Dvpanel_panel_filtros_Width ;
   private String Dvpanel_panel_filtros_Cls ;
   private String Dvpanel_panel_filtros_Title ;
   private String Dvpanel_panel_filtros_Iconposition ;
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
   private String Ddo_grid_Datalistfixedvalues ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divLayoutmaintable_Class ;
   private String divTablemain_Internalname ;
   private String divDivheader_Internalname ;
   private String Dvpanel_panel_filtros_Internalname ;
   private String divPanel_filtros_Internalname ;
   private String Dvpanel_panel_filtrosgenerales_Internalname ;
   private String divPanel_filtrosgenerales_Internalname ;
   private String divTable_filtrosgenerales_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable5_Internalname ;
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
   private String divUnnamedtable6_Internalname ;
   private String edtavAlbprofchfrom_Internalname ;
   private String TempTags ;
   private String edtavAlbprofchfrom_Jsonclick ;
   private String edtavAlbprofchto_Internalname ;
   private String edtavAlbprofchto_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavAlbprocodfrom_Internalname ;
   private String edtavAlbprocodfrom_Jsonclick ;
   private String edtavAlbprocodto_Internalname ;
   private String edtavAlbprocodto_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divTable_acciones_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtn_search_Internalname ;
   private String bttBtn_search_Jsonclick ;
   private String divTableoptions_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableaction_Internalname ;
   private String bttBtnprocessar_Internalname ;
   private String bttBtnprocessar_Jsonclick ;
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
   private String Ddo_grid_Internalname ;
   private String edtavPathpdf_Internalname ;
   private String edtavPathpdf_Jsonclick ;
   private String edtavCopias2_Internalname ;
   private String edtavCopias2_Jsonclick ;
   private String edtavInfo_Internalname ;
   private String edtavInfo_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String A407EmprNom ;
   private String edtEmprNom_Internalname ;
   private String edtAlbProCod_Internalname ;
   private String A39AlbProPri ;
   private String edtAlbProPri_Internalname ;
   private String edtAlbProEst_Internalname ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbFecSal_Internalname ;
   private String A3865AlbHorSal ;
   private String edtAlbHorSal_Internalname ;
   private String A7098AlbUsu ;
   private String edtAlbUsu_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Internalname ;
   private String edtAlbCliDes_Internalname ;
   private String edtAlbDomEnv_Internalname ;
   private String edtTrnCod_Internalname ;
   private String A841TrnNom ;
   private String edtTrnNom_Internalname ;
   private String A3868AlbMat ;
   private String edtAlbMat_Internalname ;
   private String A2242AlbSec ;
   private String edtAlbSec_Internalname ;
   private String A7101AlbLic ;
   private String edtAlbLic_Internalname ;
   private String A10765AlbProAT ;
   private String edtAlbHhfm_Internalname ;
   private String edtAlbGrossT_Internalname ;
   private String A10837AlbTrnNc ;
   private String edtAlbTrnNc_Internalname ;
   private String edtAlbFmd_Internalname ;
   private String A10835AlbTrnNm ;
   private String edtAlbTrnNm_Internalname ;
   private String A10018ALbFmdc ;
   private String edtALbFmdc_Internalname ;
   private String A10836AlbTrnDm ;
   private String edtAlbTrnDm_Internalname ;
   private String A5140AlbMarca ;
   private String edtAlbLocDes_Internalname ;
   private String edtAlbLocCar_Internalname ;
   private String edtAlbPObsCon_Internalname ;
   private String A5141AlbIvaCod ;
   private String edtAlbIvaCod_Internalname ;
   private String A7987AlbColCa ;
   private String edtAlbColCa_Internalname ;
   private String edtAlbDesp_Internalname ;
   private String edtAlbCambio_Internalname ;
   private String edtAlbTipDoc_Internalname ;
   private String A7984AlbMotTr ;
   private String edtAlbMotTr_Internalname ;
   private String edtAlbTipCal_Internalname ;
   private String A7988AlbObsCb ;
   private String edtAlbObsCb_Internalname ;
   private String edtAlbNumT_Internalname ;
   private String A7100AlbMarCo ;
   private String edtAlbMarCo_Internalname ;
   private String A7099AlbOComp ;
   private String edtAlbOComp_Internalname ;
   private String A3643TrnNif ;
   private String edtTrnNif_Internalname ;
   private String A3093AlbDivTCod ;
   private String A3109AlbDivAbr ;
   private String edtAlbDivAbr_Internalname ;
   private String edtAlbDivCod_Internalname ;
   private String edtBusDomEnv_Internalname ;
   private String A1253EmprGuiRem ;
   private String edtEmprGuiRem_Internalname ;
   private String edtGuiRemDom_Internalname ;
   private String A3145GuiRemDivT ;
   private String edtGuiRemDiv_Internalname ;
   private String A1902CliValA ;
   private String A11622CliMailGrE ;
   private String A11620CliMailGr ;
   private String edtCliMailGr_Internalname ;
   private String A11623CliMailPkE ;
   private String A11621CliMailPk ;
   private String edtCliMailPk_Internalname ;
   private String edtCod_pais_Internalname ;
   private String edtavIcon_Internalname ;
   private String edtavGrid_pathpdf_Internalname ;
   private String edtavGrid_nmrcopia_Internalname ;
   private String scmdbuf ;
   private String lV227Impresiondeguiawwds_3_tfguiremcln ;
   private String lV230Impresiondeguiawwds_6_tfclimailgr ;
   private String lV233Impresiondeguiawwds_9_tfclimailpk ;
   private String AV228Impresiondeguiawwds_4_tfguiremcln_sel ;
   private String AV227Impresiondeguiawwds_3_tfguiremcln ;
   private String AV229Impresiondeguiawwds_5_tfclimailgre_sel ;
   private String AV231Impresiondeguiawwds_7_tfclimailgr_sel ;
   private String AV230Impresiondeguiawwds_6_tfclimailgr ;
   private String AV232Impresiondeguiawwds_8_tfclimailpke_sel ;
   private String AV234Impresiondeguiawwds_10_tfclimailpk_sel ;
   private String AV233Impresiondeguiawwds_9_tfclimailpk ;
   private String hsh ;
   private String AV43Station ;
   private String AV46UsurCod ;
   private String edtavIcon_gximage ;
   private String edtavIcon_Tooltiptext ;
   private String sGXsfl_109_fel_idx="0001" ;
   private String AV68EmprCodColItem ;
   private String GXt_char2 ;
   private String GXt_char11 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXt_char15 ;
   private String GXv_char16[] ;
   private String GXt_char13 ;
   private String GXv_char14[] ;
   private String GXt_char12 ;
   private String GXv_char5[] ;
   private String A10045CliAct ;
   private String A279CliNom ;
   private String AV216CLIMAILPK ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtEmprNom_Jsonclick ;
   private String edtAlbProCod_Jsonclick ;
   private String edtAlbProPri_Jsonclick ;
   private String edtAlbProEst_Jsonclick ;
   private String edtAlbProfch_Jsonclick ;
   private String edtAlbFecSal_Jsonclick ;
   private String edtAlbHorSal_Jsonclick ;
   private String edtAlbUsu_Jsonclick ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbCliDes_Jsonclick ;
   private String edtAlbDomEnv_Jsonclick ;
   private String edtTrnCod_Jsonclick ;
   private String edtTrnNom_Jsonclick ;
   private String edtAlbMat_Jsonclick ;
   private String edtAlbSec_Jsonclick ;
   private String edtAlbLic_Jsonclick ;
   private String edtAlbHhfm_Jsonclick ;
   private String edtAlbGrossT_Jsonclick ;
   private String edtAlbTrnNc_Jsonclick ;
   private String edtAlbFmd_Jsonclick ;
   private String edtAlbTrnNm_Jsonclick ;
   private String edtALbFmdc_Jsonclick ;
   private String edtAlbTrnDm_Jsonclick ;
   private String edtAlbLocDes_Jsonclick ;
   private String edtAlbLocCar_Jsonclick ;
   private String edtAlbPObsCon_Jsonclick ;
   private String edtAlbIvaCod_Jsonclick ;
   private String edtAlbColCa_Jsonclick ;
   private String edtAlbDesp_Jsonclick ;
   private String edtAlbCambio_Jsonclick ;
   private String edtAlbTipDoc_Jsonclick ;
   private String edtAlbMotTr_Jsonclick ;
   private String edtAlbTipCal_Jsonclick ;
   private String edtAlbObsCb_Jsonclick ;
   private String edtAlbNumT_Jsonclick ;
   private String edtAlbMarCo_Jsonclick ;
   private String edtAlbOComp_Jsonclick ;
   private String edtTrnNif_Jsonclick ;
   private String edtAlbDivAbr_Jsonclick ;
   private String edtAlbDivCod_Jsonclick ;
   private String edtBusDomEnv_Jsonclick ;
   private String edtEmprGuiRem_Jsonclick ;
   private String edtGuiRemDom_Jsonclick ;
   private String edtGuiRemDiv_Jsonclick ;
   private String edtCliMailGr_Jsonclick ;
   private String edtCliMailPk_Jsonclick ;
   private String edtCod_pais_Jsonclick ;
   private String sImgUrl ;
   private String edtavIcon_Jsonclick ;
   private String edtavGrid_pathpdf_Jsonclick ;
   private String edtavGrid_nmrcopia_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date AV21AlbProfchfrom ;
   private java.util.Date AV22AlbProfchto ;
   private java.util.Date Gx_date ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date AV92IniDate ;
   private java.util.Date AV93EndDate ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV91LoadGridData ;
   private boolean AV13OrderedDsc ;
   private boolean AV86SelectAll ;
   private boolean AV16VerMail ;
   private boolean AV113MostrarMail ;
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
   private boolean AV62Selected ;
   private boolean n407EmprNom ;
   private boolean n1259AlbDomEnv ;
   private boolean n841TrnNom ;
   private boolean n10017AlbFmd ;
   private boolean n3643TrnNif ;
   private boolean n3093AlbDivTCod ;
   private boolean n3109AlbDivAbr ;
   private boolean n3108AlbDivCod ;
   private boolean n1260BusDomEnv ;
   private boolean n1258GuiRemDom ;
   private boolean n3145GuiRemDivT ;
   private boolean n3110GuiRemDiv ;
   private boolean n1902CliValA ;
   private boolean n11622CliMailGrE ;
   private boolean n11620CliMailGr ;
   private boolean n11623CliMailPkE ;
   private boolean n11621CliMailPk ;
   private boolean n10301Cod_pais ;
   private boolean bGXsfl_109_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean AV87Icon_IsBlob ;
   private String AV67EmprCodJson ;
   private String AV71AlbProCodJson ;
   private String AV102PathXLS_Email ;
   private String AV101PathPDF_Email ;
   private String AV235Icon_GXI ;
   private String AV105TextoSeparador ;
   private String AV116Asunto ;
   private String AV110TextoCorreo ;
   private String AV112Info ;
   private String A10017AlbFmd ;
   private String AV98Grid_PathPdf ;
   private String AV47Copia[] ;
   private String A13735CliCNom ;
   private String AV219Url ;
   private String AV106CadenaRegistrar ;
   private String AV87Icon ;
   private GXSimpleCollection<Long> AV70AlbProCodCol ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV25Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtros ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_filtrosgenerales ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodfrom ;
   private com.genexus.webpanels.GXUserControl ucCombo_clicodto ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavPrio ;
   private HTMLChoice cmbavManaut ;
   private ICheckbox chkavSelected ;
   private HTMLChoice cmbAlbEnvFtp ;
   private HTMLChoice cmbAlbProAT ;
   private HTMLChoice cmbAlbMarca ;
   private HTMLChoice cmbAlbDivTCod ;
   private HTMLChoice cmbGuiRemDivT ;
   private ICheckbox chkCliValA ;
   private ICheckbox chkCliMailGrE ;
   private ICheckbox chkCliMailPkE ;
   private ICheckbox chkavSelectall ;
   private ICheckbox chkavVermail ;
   private IDataStoreProvider pr_default ;
   private int[] H029D2_A252CliCod ;
   private byte[] H029D2_A266CliEnvLin ;
   private short[] H029D2_A10301Cod_pais ;
   private boolean[] H029D2_n10301Cod_pais ;
   private String[] H029D2_A11621CliMailPk ;
   private boolean[] H029D2_n11621CliMailPk ;
   private String[] H029D2_A11623CliMailPkE ;
   private boolean[] H029D2_n11623CliMailPkE ;
   private String[] H029D2_A11620CliMailGr ;
   private boolean[] H029D2_n11620CliMailGr ;
   private String[] H029D2_A11622CliMailGrE ;
   private boolean[] H029D2_n11622CliMailGrE ;
   private String[] H029D2_A1902CliValA ;
   private boolean[] H029D2_n1902CliValA ;
   private byte[] H029D2_A3110GuiRemDiv ;
   private boolean[] H029D2_n3110GuiRemDiv ;
   private String[] H029D2_A3145GuiRemDivT ;
   private boolean[] H029D2_n3145GuiRemDivT ;
   private byte[] H029D2_A1258GuiRemDom ;
   private boolean[] H029D2_n1258GuiRemDom ;
   private String[] H029D2_A1253EmprGuiRem ;
   private byte[] H029D2_A3108AlbDivCod ;
   private boolean[] H029D2_n3108AlbDivCod ;
   private String[] H029D2_A3109AlbDivAbr ;
   private boolean[] H029D2_n3109AlbDivAbr ;
   private String[] H029D2_A3093AlbDivTCod ;
   private boolean[] H029D2_n3093AlbDivTCod ;
   private String[] H029D2_A3643TrnNif ;
   private boolean[] H029D2_n3643TrnNif ;
   private String[] H029D2_A7099AlbOComp ;
   private String[] H029D2_A7100AlbMarCo ;
   private long[] H029D2_A7102AlbNumT ;
   private String[] H029D2_A7988AlbObsCb ;
   private byte[] H029D2_A5803AlbTipCal ;
   private String[] H029D2_A7984AlbMotTr ;
   private int[] H029D2_A7985AlbTipDoc ;
   private java.math.BigDecimal[] H029D2_A7986AlbCambio ;
   private int[] H029D2_A7162AlbDesp ;
   private String[] H029D2_A7987AlbColCa ;
   private String[] H029D2_A5141AlbIvaCod ;
   private byte[] H029D2_A914AlbPObsCon ;
   private byte[] H029D2_A3866AlbLocCar ;
   private byte[] H029D2_A3867AlbLocDes ;
   private String[] H029D2_A5140AlbMarca ;
   private String[] H029D2_A10836AlbTrnDm ;
   private String[] H029D2_A10018ALbFmdc ;
   private String[] H029D2_A10835AlbTrnNm ;
   private String[] H029D2_A10017AlbFmd ;
   private boolean[] H029D2_n10017AlbFmd ;
   private String[] H029D2_A10837AlbTrnNc ;
   private java.math.BigDecimal[] H029D2_A10020AlbGrossT ;
   private java.util.Date[] H029D2_A10019AlbHhfm ;
   private String[] H029D2_A10765AlbProAT ;
   private String[] H029D2_A7101AlbLic ;
   private byte[] H029D2_A5805AlbEnvFtp ;
   private String[] H029D2_A2242AlbSec ;
   private String[] H029D2_A3868AlbMat ;
   private String[] H029D2_A841TrnNom ;
   private boolean[] H029D2_n841TrnNom ;
   private short[] H029D2_A840TrnCod ;
   private byte[] H029D2_A1259AlbDomEnv ;
   private boolean[] H029D2_n1259AlbDomEnv ;
   private int[] H029D2_A3869AlbCliDes ;
   private String[] H029D2_A1244GuiRemCln ;
   private int[] H029D2_A1243GuiRemCli ;
   private String[] H029D2_A7098AlbUsu ;
   private String[] H029D2_A3865AlbHorSal ;
   private java.util.Date[] H029D2_A4023AlbFecSal ;
   private java.util.Date[] H029D2_A34AlbProfch ;
   private byte[] H029D2_A33AlbProEst ;
   private String[] H029D2_A39AlbProPri ;
   private long[] H029D2_A30AlbProCod ;
   private String[] H029D2_A407EmprNom ;
   private boolean[] H029D2_n407EmprNom ;
   private String[] H029D2_A396EmprCod ;
   private byte[] H029D2_A1260BusDomEnv ;
   private boolean[] H029D2_n1260BusDomEnv ;
   private String[] H029D3_A3643TrnNif ;
   private boolean[] H029D3_n3643TrnNif ;
   private String[] H029D3_A841TrnNom ;
   private boolean[] H029D3_n841TrnNom ;
   private long[] H029D4_AGRID_nRecordCount ;
   private int[] H029D5_A252CliCod ;
   private byte[] H029D5_A266CliEnvLin ;
   private long[] H029D5_A30AlbProCod ;
   private String[] H029D5_A396EmprCod ;
   private String[] H029D5_A407EmprNom ;
   private boolean[] H029D5_n407EmprNom ;
   private String[] H029D5_A39AlbProPri ;
   private byte[] H029D5_A33AlbProEst ;
   private java.util.Date[] H029D5_A34AlbProfch ;
   private java.util.Date[] H029D5_A4023AlbFecSal ;
   private String[] H029D5_A3865AlbHorSal ;
   private String[] H029D5_A7098AlbUsu ;
   private int[] H029D5_A1243GuiRemCli ;
   private String[] H029D5_A1244GuiRemCln ;
   private int[] H029D5_A3869AlbCliDes ;
   private byte[] H029D5_A1259AlbDomEnv ;
   private boolean[] H029D5_n1259AlbDomEnv ;
   private short[] H029D5_A840TrnCod ;
   private String[] H029D5_A841TrnNom ;
   private boolean[] H029D5_n841TrnNom ;
   private String[] H029D5_A3868AlbMat ;
   private String[] H029D5_A2242AlbSec ;
   private byte[] H029D5_A5805AlbEnvFtp ;
   private String[] H029D5_A7101AlbLic ;
   private String[] H029D5_A10765AlbProAT ;
   private java.util.Date[] H029D5_A10019AlbHhfm ;
   private java.math.BigDecimal[] H029D5_A10020AlbGrossT ;
   private String[] H029D5_A10837AlbTrnNc ;
   private String[] H029D5_A10017AlbFmd ;
   private boolean[] H029D5_n10017AlbFmd ;
   private String[] H029D5_A10835AlbTrnNm ;
   private String[] H029D5_A10018ALbFmdc ;
   private String[] H029D5_A10836AlbTrnDm ;
   private String[] H029D5_A5140AlbMarca ;
   private byte[] H029D5_A3867AlbLocDes ;
   private byte[] H029D5_A3866AlbLocCar ;
   private byte[] H029D5_A914AlbPObsCon ;
   private String[] H029D5_A5141AlbIvaCod ;
   private String[] H029D5_A7987AlbColCa ;
   private int[] H029D5_A7162AlbDesp ;
   private java.math.BigDecimal[] H029D5_A7986AlbCambio ;
   private int[] H029D5_A7985AlbTipDoc ;
   private String[] H029D5_A7984AlbMotTr ;
   private byte[] H029D5_A5803AlbTipCal ;
   private String[] H029D5_A7988AlbObsCb ;
   private long[] H029D5_A7102AlbNumT ;
   private String[] H029D5_A7100AlbMarCo ;
   private String[] H029D5_A7099AlbOComp ;
   private String[] H029D5_A3643TrnNif ;
   private boolean[] H029D5_n3643TrnNif ;
   private String[] H029D5_A3093AlbDivTCod ;
   private boolean[] H029D5_n3093AlbDivTCod ;
   private String[] H029D5_A3109AlbDivAbr ;
   private boolean[] H029D5_n3109AlbDivAbr ;
   private byte[] H029D5_A3108AlbDivCod ;
   private boolean[] H029D5_n3108AlbDivCod ;
   private String[] H029D5_A1253EmprGuiRem ;
   private byte[] H029D5_A1258GuiRemDom ;
   private boolean[] H029D5_n1258GuiRemDom ;
   private String[] H029D5_A3145GuiRemDivT ;
   private boolean[] H029D5_n3145GuiRemDivT ;
   private byte[] H029D5_A3110GuiRemDiv ;
   private boolean[] H029D5_n3110GuiRemDiv ;
   private String[] H029D5_A1902CliValA ;
   private boolean[] H029D5_n1902CliValA ;
   private String[] H029D5_A11622CliMailGrE ;
   private boolean[] H029D5_n11622CliMailGrE ;
   private String[] H029D5_A11620CliMailGr ;
   private boolean[] H029D5_n11620CliMailGr ;
   private String[] H029D5_A11623CliMailPkE ;
   private boolean[] H029D5_n11623CliMailPkE ;
   private String[] H029D5_A11621CliMailPk ;
   private boolean[] H029D5_n11621CliMailPk ;
   private short[] H029D5_A10301Cod_pais ;
   private boolean[] H029D5_n10301Cod_pais ;
   private byte[] H029D5_A1260BusDomEnv ;
   private boolean[] H029D5_n1260BusDomEnv ;
   private String[] H029D6_A841TrnNom ;
   private boolean[] H029D6_n841TrnNom ;
   private String[] H029D6_A3643TrnNif ;
   private boolean[] H029D6_n3643TrnNif ;
   private String[] H029D7_A1253EmprGuiRem ;
   private byte[] H029D7_A33AlbProEst ;
   private int[] H029D7_A1243GuiRemCli ;
   private java.util.Date[] H029D7_A34AlbProfch ;
   private String[] H029D7_A39AlbProPri ;
   private String[] H029D7_A396EmprCod ;
   private String[] H029D7_A11621CliMailPk ;
   private boolean[] H029D7_n11621CliMailPk ;
   private String[] H029D7_A11623CliMailPkE ;
   private boolean[] H029D7_n11623CliMailPkE ;
   private String[] H029D7_A11620CliMailGr ;
   private boolean[] H029D7_n11620CliMailGr ;
   private String[] H029D7_A11622CliMailGrE ;
   private boolean[] H029D7_n11622CliMailGrE ;
   private String[] H029D7_A1244GuiRemCln ;
   private long[] H029D7_A30AlbProCod ;
   private String[] H029D8_A10045CliAct ;
   private String[] H029D8_A396EmprCod ;
   private String[] H029D8_A13735CliCNom ;
   private int[] H029D8_A252CliCod ;
   private String[] H029D8_A279CliNom ;
   private String[] H029D9_A10045CliAct ;
   private String[] H029D9_A396EmprCod ;
   private String[] H029D9_A13735CliCNom ;
   private int[] H029D9_A252CliCod ;
   private String[] H029D9_A279CliNom ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV66EmprCodCol ;
   private GXSimpleCollection<String> AV109ListaCorreosCopiaOculta ;
   private GXSimpleCollection<String> AV111ListaCorreosCopia ;
   private GXSimpleCollection<String> AV107ListaCorreosDestino ;
   private GXSimpleCollection<String> AV104NombresAdjuntos ;
   private GXSimpleCollection<String> GXt_objcol_svchar18 ;
   private GXSimpleCollection<String> GXv_objcol_svchar19[] ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV40CliCodfrom_Data ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV42CliCodto_Data ;
   private GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> AV63SelectedRows ;
   private GXBaseCollection<app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem> AV215ImpresionDeGuiawwSDT ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext1[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState17[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV36DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV41Combo_DataItem ;
   private app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem AV64SelectedRow ;
   private app.SdtImpresionDeGuiawwSDT_ImpresionDeGuiawwSDTItem AV217ImpresionDeGuiawwSDTItem ;
}

final  class impresiondeguiaww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H029D2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV225Impresiondeguiawwds_1_tfalbprocod ,
                                          long AV226Impresiondeguiawwds_2_tfalbprocod_to ,
                                          String AV228Impresiondeguiawwds_4_tfguiremcln_sel ,
                                          String AV227Impresiondeguiawwds_3_tfguiremcln ,
                                          String AV229Impresiondeguiawwds_5_tfclimailgre_sel ,
                                          String AV231Impresiondeguiawwds_7_tfclimailgr_sel ,
                                          String AV230Impresiondeguiawwds_6_tfclimailgr ,
                                          String AV232Impresiondeguiawwds_8_tfclimailpke_sel ,
                                          String AV234Impresiondeguiawwds_10_tfclimailpk_sel ,
                                          String AV233Impresiondeguiawwds_9_tfclimailpk ,
                                          boolean AV91LoadGridData ,
                                          long AV19AlbProCodfrom ,
                                          String AV15ManAut ,
                                          long AV20AlbProCodto ,
                                          java.util.Date AV21AlbProfchfrom ,
                                          java.util.Date AV22AlbProfchto ,
                                          int AV23CliCodfrom ,
                                          int AV24CliCodto ,
                                          long A30AlbProCod ,
                                          String A1244GuiRemCln ,
                                          String A11622CliMailGrE ,
                                          String A11620CliMailGr ,
                                          String A11623CliMailPkE ,
                                          String A11621CliMailPk ,
                                          String A396EmprCod ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          byte A33AlbProEst ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A39AlbProPri ,
                                          String AV18PRIO ,
                                          String AV44EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int20 = new byte[23];
      Object[] GXv_Object21 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T4.CliCod, T4.CliEnvLin, T3.Cod_pais, T3.CliMailPk, T3.CliMailPkE, T3.CliMailGr, T3.CliMailGrE, T3.CliValA, T3.CliDivCod AS GuiRemDiv, T3.CliDivTra AS GuiRemDivT," ;
      sSelectString += " T1.GuiRemDom, T1.EmprGuiRem AS EmprGuiRem, T1.AlbDivCod AS AlbDivCod, T2.DivAbr AS AlbDivAbr, T1.AlbDivTCod, T6.TrnNif, T1.AlbOComp, T1.AlbMarCo, T1.AlbNumT, T1.AlbObsCb," ;
      sSelectString += " T1.AlbTipCal, T1.AlbMotTr, T1.AlbTipDoc, T1.AlbCambio, T1.AlbDesp, T1.AlbColCa, T1.AlbIvaCod, T1.AlbPObsCon, T1.AlbLocCar, T1.AlbLocDes, T1.AlbMarca, T1.AlbTrnDm," ;
      sSelectString += " T1.ALbFmdc, T1.AlbTrnNm, T1.AlbFmd, T1.AlbTrnNc, T1.AlbGrossT, T1.AlbHhfm, T1.AlbProAT, T1.AlbLic, T1.AlbEnvFtp, T1.AlbSec, T1.AlbMat, T6.TrnNom, T1.TrnCod, T1.AlbDomEnv," ;
      sSelectString += " T1.AlbCliDes, T3.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbUsu, T1.AlbHorSal, T1.AlbFecSal, T1.AlbProfch, T1.AlbProEst, T1.AlbProPri, T1.AlbProCod," ;
      sSelectString += " T5.EmprNom, T1.EmprCod, COALESCE( T4.CliEnvLin, 0) AS BusDomEnv" ;
      sFromString = " FROM (((((TXPCALPRD T1 LEFT JOIN TXPDIVISA T2 ON T2.DivCod = T1.AlbDivCod) INNER JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprGuiRem AND T3.CliCod = T1.GuiRemCli) LEFT" ;
      sFromString += " JOIN TXPCLIENV T4 ON T4.EmprCod = T1.EmprGuiRem AND T4.CliCod = T1.GuiRemCli AND T4.CliEnvLin = T1.AlbDomEnv) INNER JOIN TXPEMPRES T5 ON T5.EmprCod = T1.EmprCod)" ;
      sFromString += " INNER JOIN TXPTRANSP T6 ON T6.EmprCod = T1.EmprCod AND T6.TrnCod = T1.TrnCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV225Impresiondeguiawwds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int20[2] = (byte)(1) ;
      }
      if ( ! (0==AV226Impresiondeguiawwds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int20[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV228Impresiondeguiawwds_4_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV227Impresiondeguiawwds_3_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV228Impresiondeguiawwds_4_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliNom = ?)");
      }
      else
      {
         GXv_int20[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV229Impresiondeguiawwds_5_tfclimailgre_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliMailGrE = ?)");
      }
      else
      {
         GXv_int20[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV231Impresiondeguiawwds_7_tfclimailgr_sel)==0) && ( ! (GXutil.strcmp("", AV230Impresiondeguiawwds_6_tfclimailgr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliMailGr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV231Impresiondeguiawwds_7_tfclimailgr_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliMailGr = ?)");
      }
      else
      {
         GXv_int20[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV232Impresiondeguiawwds_8_tfclimailpke_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliMailPkE = ?)");
      }
      else
      {
         GXv_int20[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV234Impresiondeguiawwds_10_tfclimailpk_sel)==0) && ( ! (GXutil.strcmp("", AV233Impresiondeguiawwds_9_tfclimailpk)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.CliMailPk) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int20[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV234Impresiondeguiawwds_10_tfclimailpk_sel)==0) )
      {
         addWhere(sWhereString, "(T3.CliMailPk = ?)");
      }
      else
      {
         GXv_int20[11] = (byte)(1) ;
      }
      if ( ! AV91LoadGridData )
      {
         addWhere(sWhereString, "(T1.EmprCod IS NULL and Not T1.EmprCod IS NULL and T1.AlbProCod IS NULL)");
      }
      if ( ! (0==AV19AlbProCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int20[12] = (byte)(1) ;
      }
      if ( ! (0==AV20AlbProCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int20[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21AlbProfchfrom)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int20[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22AlbProfchto)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int20[15] = (byte)(1) ;
      }
      if ( ! (0==AV23CliCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int20[16] = (byte)(1) ;
      }
      if ( ! (0==AV24CliCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int20[17] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV15ManAut, "A") == 0 )
      {
         addWhere(sWhereString, "(T1.AlbProEst = 0)");
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliMailGrE" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliMailGrE DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliMailGr" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliMailGr DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliMailPkE" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliMailPkE DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.CliMailPk" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.CliMailPk DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object21[0] = scmdbuf ;
      GXv_Object21[1] = GXv_int20 ;
      return GXv_Object21 ;
   }

   protected Object[] conditional_H029D4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV225Impresiondeguiawwds_1_tfalbprocod ,
                                          long AV226Impresiondeguiawwds_2_tfalbprocod_to ,
                                          String AV228Impresiondeguiawwds_4_tfguiremcln_sel ,
                                          String AV227Impresiondeguiawwds_3_tfguiremcln ,
                                          String AV229Impresiondeguiawwds_5_tfclimailgre_sel ,
                                          String AV231Impresiondeguiawwds_7_tfclimailgr_sel ,
                                          String AV230Impresiondeguiawwds_6_tfclimailgr ,
                                          String AV232Impresiondeguiawwds_8_tfclimailpke_sel ,
                                          String AV234Impresiondeguiawwds_10_tfclimailpk_sel ,
                                          String AV233Impresiondeguiawwds_9_tfclimailpk ,
                                          boolean AV91LoadGridData ,
                                          long AV19AlbProCodfrom ,
                                          String AV15ManAut ,
                                          long AV20AlbProCodto ,
                                          java.util.Date AV21AlbProfchfrom ,
                                          java.util.Date AV22AlbProfchto ,
                                          int AV23CliCodfrom ,
                                          int AV24CliCodto ,
                                          long A30AlbProCod ,
                                          String A1244GuiRemCln ,
                                          String A11622CliMailGrE ,
                                          String A11620CliMailGr ,
                                          String A11623CliMailPkE ,
                                          String A11621CliMailPk ,
                                          String A396EmprCod ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          byte A33AlbProEst ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A39AlbProPri ,
                                          String AV18PRIO ,
                                          String AV44EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int22 = new byte[18];
      Object[] GXv_Object23 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (((((TXPCALPRD T1 LEFT JOIN TXPDIVISA T5 ON T5.DivCod = T1.AlbDivCod) INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod =" ;
      scmdbuf += " T1.GuiRemCli) LEFT JOIN TXPCLIENV T6 ON T6.EmprCod = T1.EmprGuiRem AND T6.CliCod = T1.GuiRemCli AND T6.CliEnvLin = T1.AlbDomEnv) INNER JOIN TXPEMPRES T3 ON T3.EmprCod" ;
      scmdbuf += " = T1.EmprCod) INNER JOIN TXPTRANSP T4 ON T4.EmprCod = T1.EmprCod AND T4.TrnCod = T1.TrnCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV225Impresiondeguiawwds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int22[2] = (byte)(1) ;
      }
      if ( ! (0==AV226Impresiondeguiawwds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int22[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV228Impresiondeguiawwds_4_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV227Impresiondeguiawwds_3_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV228Impresiondeguiawwds_4_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int22[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV229Impresiondeguiawwds_5_tfclimailgre_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailGrE = ?)");
      }
      else
      {
         GXv_int22[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV231Impresiondeguiawwds_7_tfclimailgr_sel)==0) && ( ! (GXutil.strcmp("", AV230Impresiondeguiawwds_6_tfclimailgr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliMailGr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV231Impresiondeguiawwds_7_tfclimailgr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailGr = ?)");
      }
      else
      {
         GXv_int22[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV232Impresiondeguiawwds_8_tfclimailpke_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailPkE = ?)");
      }
      else
      {
         GXv_int22[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV234Impresiondeguiawwds_10_tfclimailpk_sel)==0) && ( ! (GXutil.strcmp("", AV233Impresiondeguiawwds_9_tfclimailpk)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliMailPk) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int22[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV234Impresiondeguiawwds_10_tfclimailpk_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailPk = ?)");
      }
      else
      {
         GXv_int22[11] = (byte)(1) ;
      }
      if ( ! AV91LoadGridData )
      {
         addWhere(sWhereString, "(T1.EmprCod IS NULL and Not T1.EmprCod IS NULL and T1.AlbProCod IS NULL)");
      }
      if ( ! (0==AV19AlbProCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int22[12] = (byte)(1) ;
      }
      if ( ! (0==AV20AlbProCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int22[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21AlbProfchfrom)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int22[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22AlbProfchto)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int22[15] = (byte)(1) ;
      }
      if ( ! (0==AV23CliCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int22[16] = (byte)(1) ;
      }
      if ( ! (0==AV24CliCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int22[17] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV15ManAut, "A") == 0 )
      {
         addWhere(sWhereString, "(T1.AlbProEst = 0)");
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object23[0] = scmdbuf ;
      GXv_Object23[1] = GXv_int22 ;
      return GXv_Object23 ;
   }

   protected Object[] conditional_H029D7( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          long AV225Impresiondeguiawwds_1_tfalbprocod ,
                                          long AV226Impresiondeguiawwds_2_tfalbprocod_to ,
                                          String AV228Impresiondeguiawwds_4_tfguiremcln_sel ,
                                          String AV227Impresiondeguiawwds_3_tfguiremcln ,
                                          String AV229Impresiondeguiawwds_5_tfclimailgre_sel ,
                                          String AV231Impresiondeguiawwds_7_tfclimailgr_sel ,
                                          String AV230Impresiondeguiawwds_6_tfclimailgr ,
                                          String AV232Impresiondeguiawwds_8_tfclimailpke_sel ,
                                          String AV234Impresiondeguiawwds_10_tfclimailpk_sel ,
                                          String AV233Impresiondeguiawwds_9_tfclimailpk ,
                                          long AV19AlbProCodfrom ,
                                          String AV15ManAut ,
                                          long AV20AlbProCodto ,
                                          java.util.Date AV21AlbProfchfrom ,
                                          java.util.Date AV22AlbProfchto ,
                                          int AV23CliCodfrom ,
                                          int AV24CliCodto ,
                                          long A30AlbProCod ,
                                          String A1244GuiRemCln ,
                                          String A11622CliMailGrE ,
                                          String A11620CliMailGr ,
                                          String A11623CliMailPkE ,
                                          String A11621CliMailPk ,
                                          java.util.Date A34AlbProfch ,
                                          int A1243GuiRemCli ,
                                          byte A33AlbProEst ,
                                          String A39AlbProPri ,
                                          String AV18PRIO ,
                                          String AV44EmprCod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int24 = new byte[18];
      Object[] GXv_Object25 = new Object[2];
      scmdbuf = "SELECT T1.EmprGuiRem AS EmprGuiRem, T1.AlbProEst, T1.GuiRemCli AS GuiRemCli, T1.AlbProfch, T1.AlbProPri, T1.EmprCod, T2.CliMailPk, T2.CliMailPkE, T2.CliMailGr, T2.CliMailGrE," ;
      scmdbuf += " T2.CliNom AS GuiRemCln, T1.AlbProCod FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      if ( ! (0==AV225Impresiondeguiawwds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int24[2] = (byte)(1) ;
      }
      if ( ! (0==AV226Impresiondeguiawwds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int24[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV228Impresiondeguiawwds_4_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV227Impresiondeguiawwds_3_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV228Impresiondeguiawwds_4_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int24[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV229Impresiondeguiawwds_5_tfclimailgre_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailGrE = ?)");
      }
      else
      {
         GXv_int24[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV231Impresiondeguiawwds_7_tfclimailgr_sel)==0) && ( ! (GXutil.strcmp("", AV230Impresiondeguiawwds_6_tfclimailgr)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliMailGr) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV231Impresiondeguiawwds_7_tfclimailgr_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailGr = ?)");
      }
      else
      {
         GXv_int24[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV232Impresiondeguiawwds_8_tfclimailpke_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailPkE = ?)");
      }
      else
      {
         GXv_int24[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV234Impresiondeguiawwds_10_tfclimailpk_sel)==0) && ( ! (GXutil.strcmp("", AV233Impresiondeguiawwds_9_tfclimailpk)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliMailPk) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int24[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV234Impresiondeguiawwds_10_tfclimailpk_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliMailPk = ?)");
      }
      else
      {
         GXv_int24[11] = (byte)(1) ;
      }
      if ( ! (0==AV19AlbProCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int24[12] = (byte)(1) ;
      }
      if ( ! (0==AV20AlbProCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int24[13] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV21AlbProfchfrom)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int24[14] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV22AlbProfchto)) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int24[15] = (byte)(1) ;
      }
      if ( ! (0==AV23CliCodfrom) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int24[16] = (byte)(1) ;
      }
      if ( ! (0==AV24CliCodto) && ( GXutil.strcmp(AV15ManAut, "M") == 0 ) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int24[17] = (byte)(1) ;
      }
      if ( GXutil.strcmp(AV15ManAut, "A") == 0 )
      {
         addWhere(sWhereString, "(T1.AlbProEst = 0)");
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod" ;
      GXv_Object25[0] = scmdbuf ;
      GXv_Object25[1] = GXv_int24 ;
      return GXv_Object25 ;
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
                  return conditional_H029D2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Boolean) dynConstraints[10]).booleanValue() , ((Number) dynConstraints[11]).longValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).longValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).longValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Boolean) dynConstraints[29]).booleanValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 2 :
                  return conditional_H029D4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Boolean) dynConstraints[10]).booleanValue() , ((Number) dynConstraints[11]).longValue() , (String)dynConstraints[12] , ((Number) dynConstraints[13]).longValue() , (java.util.Date)dynConstraints[14] , (java.util.Date)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).intValue() , ((Number) dynConstraints[18]).longValue() , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , (java.util.Date)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() , ((Number) dynConstraints[27]).byteValue() , ((Number) dynConstraints[28]).shortValue() , ((Boolean) dynConstraints[29]).booleanValue() , (String)dynConstraints[30] , (String)dynConstraints[31] , (String)dynConstraints[32] );
            case 5 :
                  return conditional_H029D7(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).longValue() , ((Number) dynConstraints[1]).longValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , ((Number) dynConstraints[10]).longValue() , (String)dynConstraints[11] , ((Number) dynConstraints[12]).longValue() , (java.util.Date)dynConstraints[13] , (java.util.Date)dynConstraints[14] , ((Number) dynConstraints[15]).intValue() , ((Number) dynConstraints[16]).intValue() , ((Number) dynConstraints[17]).longValue() , (String)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , (String)dynConstraints[21] , (String)dynConstraints[22] , (java.util.Date)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , ((Number) dynConstraints[25]).byteValue() , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (String)dynConstraints[29] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H029D2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029D3", "SELECT TrnNif, TrnNom FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029D4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029D5", "SELECT T6.CliCod, T6.CliEnvLin, T1.AlbProCod, T1.EmprCod, T2.EmprNom, T1.AlbProPri, T1.AlbProEst, T1.AlbProfch, T1.AlbFecSal, T1.AlbHorSal, T1.AlbUsu, T1.GuiRemCli AS GuiRemCli, T5.CliNom AS GuiRemCln, T1.AlbCliDes, T1.AlbDomEnv, T1.TrnCod, T3.TrnNom, T1.AlbMat, T1.AlbSec, T1.AlbEnvFtp, T1.AlbLic, T1.AlbProAT, T1.AlbHhfm, T1.AlbGrossT, T1.AlbTrnNc, T1.AlbFmd, T1.AlbTrnNm, T1.ALbFmdc, T1.AlbTrnDm, T1.AlbMarca, T1.AlbLocDes, T1.AlbLocCar, T1.AlbPObsCon, T1.AlbIvaCod, T1.AlbColCa, T1.AlbDesp, T1.AlbCambio, T1.AlbTipDoc, T1.AlbMotTr, T1.AlbTipCal, T1.AlbObsCb, T1.AlbNumT, T1.AlbMarCo, T1.AlbOComp, T3.TrnNif, T1.AlbDivTCod, T4.DivAbr AS AlbDivAbr, T1.AlbDivCod AS AlbDivCod, T1.EmprGuiRem AS EmprGuiRem, T1.GuiRemDom, T5.CliDivTra AS GuiRemDivT, T5.CliDivCod AS GuiRemDiv, T5.CliValA, T5.CliMailGrE, T5.CliMailGr, T5.CliMailPkE, T5.CliMailPk, T5.Cod_pais, COALESCE( T6.CliEnvLin, 0) AS BusDomEnv FROM (((((TXPCALPRD T1 INNER JOIN TXPEMPRES T2 ON T2.EmprCod = T1.EmprCod) INNER JOIN TXPTRANSP T3 ON T3.EmprCod = T1.EmprCod AND T3.TrnCod = T1.TrnCod) LEFT JOIN TXPDIVISA T4 ON T4.DivCod = T1.AlbDivCod) INNER JOIN TXPCLIENT T5 ON T5.EmprCod = T1.EmprGuiRem AND T5.CliCod = T1.GuiRemCli) LEFT JOIN TXPCLIENV T6 ON T6.EmprCod = T1.EmprGuiRem AND T6.CliCod = T1.GuiRemCli AND T6.CliEnvLin = T1.AlbDomEnv) WHERE T1.EmprCod = ? and T1.AlbProCod = ? ORDER BY T1.EmprCod, T1.AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H029D6", "SELECT TrnNom, TrnNif FROM TXPTRANSP WHERE EmprCod = ? AND TrnCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H029D7", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029D8", "SELECT CliAct, EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H029D9", "SELECT CliAct, EmprCod, RTRIM(LTRIM(SUBSTR(TO_CHAR(CliCod,'999990'), 2))) || '-' || RTRIM(LTRIM(CliNom)) AS CliCNom, CliCod, CliNom FROM TXPCLIENT WHERE CliAct = 'S' ORDER BY CliCNom ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 100);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(7, 1);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((byte[]) buf[14])[0] = rslt.getByte(9);
               ((boolean[]) buf[15])[0] = rslt.wasNull();
               ((String[]) buf[16])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               ((byte[]) buf[18])[0] = rslt.getByte(11);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(12, 3);
               ((byte[]) buf[21])[0] = rslt.getByte(13);
               ((boolean[]) buf[22])[0] = rslt.wasNull();
               ((String[]) buf[23])[0] = rslt.getString(14, 6);
               ((boolean[]) buf[24])[0] = rslt.wasNull();
               ((String[]) buf[25])[0] = rslt.getString(15, 1);
               ((boolean[]) buf[26])[0] = rslt.wasNull();
               ((String[]) buf[27])[0] = rslt.getString(16, 20);
               ((boolean[]) buf[28])[0] = rslt.wasNull();
               ((String[]) buf[29])[0] = rslt.getString(17, 30);
               ((String[]) buf[30])[0] = rslt.getString(18, 30);
               ((long[]) buf[31])[0] = rslt.getLong(19);
               ((String[]) buf[32])[0] = rslt.getString(20, 60);
               ((byte[]) buf[33])[0] = rslt.getByte(21);
               ((String[]) buf[34])[0] = rslt.getString(22, 25);
               ((int[]) buf[35])[0] = rslt.getInt(23);
               ((java.math.BigDecimal[]) buf[36])[0] = rslt.getBigDecimal(24,4);
               ((int[]) buf[37])[0] = rslt.getInt(25);
               ((String[]) buf[38])[0] = rslt.getString(26, 20);
               ((String[]) buf[39])[0] = rslt.getString(27, 3);
               ((byte[]) buf[40])[0] = rslt.getByte(28);
               ((byte[]) buf[41])[0] = rslt.getByte(29);
               ((byte[]) buf[42])[0] = rslt.getByte(30);
               ((String[]) buf[43])[0] = rslt.getString(31, 1);
               ((String[]) buf[44])[0] = rslt.getString(32, 60);
               ((String[]) buf[45])[0] = rslt.getString(33, 255);
               ((String[]) buf[46])[0] = rslt.getString(34, 60);
               ((String[]) buf[47])[0] = rslt.getVarchar(35);
               ((boolean[]) buf[48])[0] = rslt.wasNull();
               ((String[]) buf[49])[0] = rslt.getString(36, 20);
               ((java.math.BigDecimal[]) buf[50])[0] = rslt.getBigDecimal(37,2);
               ((java.util.Date[]) buf[51])[0] = rslt.getGXDateTime(38);
               ((String[]) buf[52])[0] = rslt.getString(39, 1);
               ((String[]) buf[53])[0] = rslt.getString(40, 20);
               ((byte[]) buf[54])[0] = rslt.getByte(41);
               ((String[]) buf[55])[0] = rslt.getString(42, 1);
               ((String[]) buf[56])[0] = rslt.getString(43, 20);
               ((String[]) buf[57])[0] = rslt.getString(44, 30);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((short[]) buf[59])[0] = rslt.getShort(45);
               ((byte[]) buf[60])[0] = rslt.getByte(46);
               ((boolean[]) buf[61])[0] = rslt.wasNull();
               ((int[]) buf[62])[0] = rslt.getInt(47);
               ((String[]) buf[63])[0] = rslt.getString(48, 30);
               ((int[]) buf[64])[0] = rslt.getInt(49);
               ((String[]) buf[65])[0] = rslt.getString(50, 8);
               ((String[]) buf[66])[0] = rslt.getString(51, 8);
               ((java.util.Date[]) buf[67])[0] = rslt.getGXDate(52);
               ((java.util.Date[]) buf[68])[0] = rslt.getGXDate(53);
               ((byte[]) buf[69])[0] = rslt.getByte(54);
               ((String[]) buf[70])[0] = rslt.getString(55, 1);
               ((long[]) buf[71])[0] = rslt.getLong(56);
               ((String[]) buf[72])[0] = rslt.getString(57, 30);
               ((boolean[]) buf[73])[0] = rslt.wasNull();
               ((String[]) buf[74])[0] = rslt.getString(58, 3);
               ((byte[]) buf[75])[0] = rslt.getByte(59);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 20);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 30);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 3 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(7);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 8);
               ((String[]) buf[11])[0] = rslt.getString(11, 8);
               ((int[]) buf[12])[0] = rslt.getInt(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 30);
               ((int[]) buf[14])[0] = rslt.getInt(14);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((short[]) buf[17])[0] = rslt.getShort(16);
               ((String[]) buf[18])[0] = rslt.getString(17, 30);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               ((String[]) buf[20])[0] = rslt.getString(18, 20);
               ((String[]) buf[21])[0] = rslt.getString(19, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(20);
               ((String[]) buf[23])[0] = rslt.getString(21, 20);
               ((String[]) buf[24])[0] = rslt.getString(22, 1);
               ((java.util.Date[]) buf[25])[0] = rslt.getGXDateTime(23);
               ((java.math.BigDecimal[]) buf[26])[0] = rslt.getBigDecimal(24,2);
               ((String[]) buf[27])[0] = rslt.getString(25, 20);
               ((String[]) buf[28])[0] = rslt.getVarchar(26);
               ((boolean[]) buf[29])[0] = rslt.wasNull();
               ((String[]) buf[30])[0] = rslt.getString(27, 60);
               ((String[]) buf[31])[0] = rslt.getString(28, 255);
               ((String[]) buf[32])[0] = rslt.getString(29, 60);
               ((String[]) buf[33])[0] = rslt.getString(30, 1);
               ((byte[]) buf[34])[0] = rslt.getByte(31);
               ((byte[]) buf[35])[0] = rslt.getByte(32);
               ((byte[]) buf[36])[0] = rslt.getByte(33);
               ((String[]) buf[37])[0] = rslt.getString(34, 3);
               ((String[]) buf[38])[0] = rslt.getString(35, 20);
               ((int[]) buf[39])[0] = rslt.getInt(36);
               ((java.math.BigDecimal[]) buf[40])[0] = rslt.getBigDecimal(37,4);
               ((int[]) buf[41])[0] = rslt.getInt(38);
               ((String[]) buf[42])[0] = rslt.getString(39, 25);
               ((byte[]) buf[43])[0] = rslt.getByte(40);
               ((String[]) buf[44])[0] = rslt.getString(41, 60);
               ((long[]) buf[45])[0] = rslt.getLong(42);
               ((String[]) buf[46])[0] = rslt.getString(43, 30);
               ((String[]) buf[47])[0] = rslt.getString(44, 30);
               ((String[]) buf[48])[0] = rslt.getString(45, 20);
               ((boolean[]) buf[49])[0] = rslt.wasNull();
               ((String[]) buf[50])[0] = rslt.getString(46, 1);
               ((boolean[]) buf[51])[0] = rslt.wasNull();
               ((String[]) buf[52])[0] = rslt.getString(47, 6);
               ((boolean[]) buf[53])[0] = rslt.wasNull();
               ((byte[]) buf[54])[0] = rslt.getByte(48);
               ((boolean[]) buf[55])[0] = rslt.wasNull();
               ((String[]) buf[56])[0] = rslt.getString(49, 3);
               ((byte[]) buf[57])[0] = rslt.getByte(50);
               ((boolean[]) buf[58])[0] = rslt.wasNull();
               ((String[]) buf[59])[0] = rslt.getString(51, 1);
               ((boolean[]) buf[60])[0] = rslt.wasNull();
               ((byte[]) buf[61])[0] = rslt.getByte(52);
               ((boolean[]) buf[62])[0] = rslt.wasNull();
               ((String[]) buf[63])[0] = rslt.getString(53, 1);
               ((boolean[]) buf[64])[0] = rslt.wasNull();
               ((String[]) buf[65])[0] = rslt.getString(54, 1);
               ((boolean[]) buf[66])[0] = rslt.wasNull();
               ((String[]) buf[67])[0] = rslt.getString(55, 100);
               ((boolean[]) buf[68])[0] = rslt.wasNull();
               ((String[]) buf[69])[0] = rslt.getString(56, 1);
               ((boolean[]) buf[70])[0] = rslt.wasNull();
               ((String[]) buf[71])[0] = rslt.getString(57, 100);
               ((boolean[]) buf[72])[0] = rslt.wasNull();
               ((short[]) buf[73])[0] = rslt.getShort(58);
               ((boolean[]) buf[74])[0] = rslt.wasNull();
               ((byte[]) buf[75])[0] = rslt.getByte(59);
               ((boolean[]) buf[76])[0] = rslt.wasNull();
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 3);
               ((String[]) buf[6])[0] = rslt.getString(7, 100);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((String[]) buf[10])[0] = rslt.getString(9, 100);
               ((boolean[]) buf[11])[0] = rslt.wasNull();
               ((String[]) buf[12])[0] = rslt.getString(10, 1);
               ((boolean[]) buf[13])[0] = rslt.wasNull();
               ((String[]) buf[14])[0] = rslt.getString(11, 30);
               ((long[]) buf[15])[0] = rslt.getLong(12);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 30);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
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
                  stmt.setString(sIdx, (String)parms[23], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[25]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[26]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[35]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[36]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[37]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[38]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[43]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[44]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[30]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[31]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setShort(2, ((Number) parms[1]).shortValue());
               return;
            case 5 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[20]).longValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[21]).longValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 30);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 30);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[30]).longValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[31]).longValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[32]);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[33]);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
      }
   }

}

