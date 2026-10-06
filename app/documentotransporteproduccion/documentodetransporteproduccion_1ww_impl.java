package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_1ww_impl extends GXDataArea
{
   public documentodetransporteproduccion_1ww_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_1ww_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_1ww_impl.class ));
   }

   public documentodetransporteproduccion_1ww_impl( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavPrioridad = new HTMLChoice();
      cmbavAlbmarcain = new HTMLChoice();
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
         gxfirstwebparm = httpContext.GetFirstPar( "AlbProPri") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "AlbProPri") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "AlbProPri") ;
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
            AV50AlbProPri = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50AlbProPri", AV50AlbProPri);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50AlbProPri, ""))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV55ContCod = httpContext.GetPar( "ContCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55ContCod", AV55ContCod);
               AV56Albsec = httpContext.GetPar( "Albsec") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56Albsec", AV56Albsec);
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
      nRC_GXsfl_64 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_64"))) ;
      nGXsfl_64_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_64_idx"))) ;
      sGXsfl_64_idx = httpContext.GetPar( "sGXsfl_64_idx") ;
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
      AV92AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
      cmbavAlbmarcain.fromJSonString( httpContext.GetNextPar( ));
      AV98AlbMarcaIN = httpContext.GetPar( "AlbMarcaIN") ;
      AV87GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
      AV88AlbProfchfrom = localUtil.parseDateParm( httpContext.GetPar( "AlbProfchfrom")) ;
      AV89AlbProfchto = localUtil.parseDateParm( httpContext.GetPar( "AlbProfchto")) ;
      AV52EmprCod = httpContext.GetPar( "EmprCod") ;
      AV50AlbProPri = httpContext.GetPar( "AlbProPri") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV10GridState);
      AV15TFAlbProCod = GXutil.lval( httpContext.GetPar( "TFAlbProCod")) ;
      AV16TFAlbProCod_To = GXutil.lval( httpContext.GetPar( "TFAlbProCod_To")) ;
      AV17TFGuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "TFGuiRemCli"))) ;
      AV18TFGuiRemCli_To = (int)(GXutil.lval( httpContext.GetPar( "TFGuiRemCli_To"))) ;
      AV19TFGuiRemCln = httpContext.GetPar( "TFGuiRemCln") ;
      AV20TFGuiRemCln_Sel = httpContext.GetPar( "TFGuiRemCln_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV62TFAlbProEst_Sels);
      AV119TFAlbEnvMail = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbEnvMail")) ;
      AV35TFAlbUsu = httpContext.GetPar( "TFAlbUsu") ;
      AV36TFAlbUsu_Sel = httpContext.GetPar( "TFAlbUsu_Sel") ;
      AV57TFAlbLic = httpContext.GetPar( "TFAlbLic") ;
      AV58TFAlbLic_Sel = httpContext.GetPar( "TFAlbLic_Sel") ;
      AV80TFAlbPdATCUD = httpContext.GetPar( "TFAlbPdATCUD") ;
      AV81TFAlbPdATCUD_Sel = httpContext.GetPar( "TFAlbPdATCUD_Sel") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV38TFAlbEnvFtp_Sels);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV94TFAlbProAT_Sels);
      AV39TFAlbHhfm = localUtil.parseDTimeParm( httpContext.GetPar( "TFAlbHhfm")) ;
      AV104TFFirma4dig = httpContext.GetPar( "TFFirma4dig") ;
      AV105TFFirma4dig_Sel = httpContext.GetPar( "TFFirma4dig_Sel") ;
      AV123Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV55ContCod = httpContext.GetPar( "ContCod") ;
      AV56Albsec = httpContext.GetPar( "Albsec") ;
      AV67FirmaD = (short)(GXutil.lval( httpContext.GetPar( "FirmaD"))) ;
      AV108moda21 = (short)(GXutil.lval( httpContext.GetPar( "moda21"))) ;
      AV106Messages_json = httpContext.GetPar( "Messages_json") ;
      AV102PATHPDF = httpContext.GetPar( "PATHPDF") ;
      AV118TextoCopia = httpContext.GetPar( "TextoCopia") ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      cmbavPrioridad.fromJSonString( httpContext.GetNextPar( ));
      AV69Prioridad = httpContext.GetPar( "Prioridad") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV92AlbProCod, AV98AlbMarcaIN, AV87GuiRemCli, AV88AlbProfchfrom, AV89AlbProfchto, AV52EmprCod, AV50AlbProPri, AV10GridState, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFGuiRemCli, AV18TFGuiRemCli_To, AV19TFGuiRemCln, AV20TFGuiRemCln_Sel, AV62TFAlbProEst_Sels, AV119TFAlbEnvMail, AV35TFAlbUsu, AV36TFAlbUsu_Sel, AV57TFAlbLic, AV58TFAlbLic_Sel, AV80TFAlbPdATCUD, AV81TFAlbPdATCUD_Sel, AV38TFAlbEnvFtp_Sels, AV94TFAlbProAT_Sels, AV39TFAlbHhfm, AV104TFFirma4dig, AV105TFFirma4dig_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV55ContCod, AV56Albsec, AV67FirmaD, AV108moda21, AV106Messages_json, AV102PATHPDF, AV118TextoCopia, Gx_date, AV69Prioridad) ;
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
      pa24X2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start24X2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_1ww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV50AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV55ContCod)),GXutil.URLEncode(GXutil.rtrim(AV56Albsec))}, new String[] {"AlbProPri","ContCod","Albsec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDSTATE", getSecureSignedToken( "", AV10GridState));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50AlbProPri, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSON", getSecureSignedToken( "", AV106Messages_json));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOCOPIA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV118TextoCopia, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_1WW");
      forbiddenHiddens.add("Prioridad", GXutil.rtrim( localUtil.format( AV69Prioridad, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV123Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_1ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV92AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBMARCAIN", GXutil.rtrim( AV98AlbMarcaIN));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV87GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROFCHFROM", localUtil.format(AV88AlbProfchfrom, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vALBPROFCHTO", localUtil.format(AV89AlbProfchto, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_64", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_64, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV47GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV48GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV45DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV45DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDSTATE", getSecureSignedToken( "", AV10GridState));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD", GXutil.ltrim( localUtil.ntoc( AV15TFAlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPROCOD_TO", GXutil.ltrim( localUtil.ntoc( AV16TFAlbProCod_To, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLI", GXutil.ltrim( localUtil.ntoc( AV17TFGuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLI_TO", GXutil.ltrim( localUtil.ntoc( AV18TFGuiRemCli_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLN", GXutil.rtrim( AV19TFGuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFGUIREMCLN_SEL", GXutil.rtrim( AV20TFGuiRemCln_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROEST_SELS", AV62TFAlbProEst_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROEST_SELS", AV62TFAlbProEst_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBENVMAIL", localUtil.ttoc( AV119TFAlbEnvMail, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBUSU", GXutil.rtrim( AV35TFAlbUsu));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBUSU_SEL", GXutil.rtrim( AV36TFAlbUsu_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBLIC", GXutil.rtrim( AV57TFAlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBLIC_SEL", GXutil.rtrim( AV58TFAlbLic_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPDATCUD", GXutil.rtrim( AV80TFAlbPdATCUD));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBPDATCUD_SEL", GXutil.rtrim( AV81TFAlbPdATCUD_Sel));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBENVFTP_SELS", AV38TFAlbEnvFtp_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBENVFTP_SELS", AV38TFAlbEnvFtp_Sels);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTFALBPROAT_SELS", AV94TFAlbProAT_Sels);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTFALBPROAT_SELS", AV94TFAlbProAT_Sels);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBHHFM", localUtil.ttoc( AV39TFAlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFIRMA4DIG", GXutil.rtrim( AV104TFFirma4dig));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFIRMA4DIG_SEL", GXutil.rtrim( AV105TFFirma4dig_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV50AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50AlbProPri, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTCOD", GXutil.rtrim( AV55ContCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV56Albsec));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV52EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV67FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV70Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV78Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV108moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108moda21), "ZZZ9")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vOK", AV75ok);
      app.GxWebStd.gx_hidden_field( httpContext, "vMESSAGES_JSON", AV106Messages_json);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSON", getSecureSignedToken( "", AV106Messages_json));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHPDF", GXutil.rtrim( AV102PATHPDF));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOCOPIA", AV118TextoCopia);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOCOPIA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV118TextoCopia, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROSAL", localUtil.ttoc( AV79AlbProsal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTODAY", getSecureSignedToken( "", Gx_date));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1", AV111FilterDocumentodeTransporteProduccion_1);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1", AV111FilterDocumentodeTransporteProduccion_1);
      }
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
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
         we24X2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt24X2( ) ;
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
      return formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_1ww", new String[] {GXutil.URLEncode(GXutil.rtrim(AV50AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV55ContCod)),GXutil.URLEncode(GXutil.rtrim(AV56Albsec))}, new String[] {"AlbProPri","ContCod","Albsec"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1WW" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Documento de Transporte Produccion", "") ;
   }

   public void wb24X0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         wb_table1_17_24X2( true) ;
      }
      else
      {
         wb_table1_17_24X2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_24X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Guia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV92AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV92AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV92AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbmarcain.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbmarcain.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbmarcain, cmbavAlbmarcain.getInternalname(), GXutil.rtrim( AV98AlbMarcaIN), 1, cmbavAlbmarcain.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbmarcain.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         cmbavAlbmarcain.setValue( GXutil.rtrim( AV98AlbMarcaIN) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbmarcain.getInternalname(), "Values", cmbavAlbmarcain.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcli_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV87GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV87GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV87GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchfrom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchfrom_Internalname, httpContext.getMessage( "Data Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchfrom_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchfrom_Internalname, localUtil.format(AV88AlbProfchfrom, "99/99/99"), localUtil.format( AV88AlbProfchfrom, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,46);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchfrom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchfrom_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchfrom_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchfrom_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprofchto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprofchto_Internalname, httpContext.getMessage( "Data Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbprofchto_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprofchto_Internalname, localUtil.format(AV89AlbProfchto, "99/99/99"), localUtil.format( AV89AlbProfchto, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprofchto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprofchto_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbprofchto_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbprofchto_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
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
         wb_table2_53_24X2( true) ;
      }
      else
      {
         wb_table2_53_24X2( false) ;
      }
      return  ;
   }

   public void wb_table2_53_24X2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         startgridcontrol64( ) ;
      }
      if ( wbEnd == 64 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_64 = (int)(nGXsfl_64_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV47GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV48GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV123Pgmname), GXutil.rtrim( localUtil.format( AV123Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV45DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albenvmailauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albenvmailauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albenvmailauxdate_Internalname, localUtil.format(AV120DDO_AlbEnvMailAuxDate, "99/99/99"), localUtil.format( AV120DDO_AlbEnvMailAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albenvmailauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albenvmailauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_albhhfmauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 104,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_albhhfmauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_albhhfmauxdate_Internalname, localUtil.format(AV41DDO_AlbHhfmAuxDate, "99/99/99"), localUtil.format( AV41DDO_AlbHhfmAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,104);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_albhhfmauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_albhhfmauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 64 )
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

   public void start24X2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Documento de Transporte Produccion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup24X0( ) ;
   }

   public void ws24X2( )
   {
      start24X2( ) ;
      evt24X2( ) ;
   }

   public void evt24X2( )
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
                           e1124X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1224X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1324X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsert' */
                           e1424X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPRIORIDAD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1524X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPROCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1624X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBMARCAIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1724X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VGUIREMCLI.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1824X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPROFCHFROM.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1924X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPROFCHTO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2024X2 ();
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
                           nGXsfl_64_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_642( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV49GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridActions), 4, 0));
                           A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
                           cmbAlbProEst.setName( cmbAlbProEst.getInternalname() );
                           cmbAlbProEst.setValue( httpContext.cgiGet( cmbAlbProEst.getInternalname()) );
                           A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
                           cmbAlbMarca.setName( cmbAlbMarca.getInternalname() );
                           cmbAlbMarca.setValue( httpContext.cgiGet( cmbAlbMarca.getInternalname()) );
                           A5140AlbMarca = httpContext.cgiGet( cmbAlbMarca.getInternalname()) ;
                           A34AlbProfch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbProfch_Internalname), 0)) ;
                           A4023AlbFecSal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtAlbFecSal_Internalname), 0)) ;
                           A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
                           A14404AlbEnvMail = localUtil.ctot( httpContext.cgiGet( edtAlbEnvMail_Internalname), 0) ;
                           A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
                           A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
                           A14069AlbPdATCUD = httpContext.cgiGet( edtAlbPdATCUD_Internalname) ;
                           cmbAlbEnvFtp.setName( cmbAlbEnvFtp.getInternalname() );
                           cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
                           A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
                           cmbAlbProAT.setName( cmbAlbProAT.getInternalname() );
                           cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
                           A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
                           A10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtAlbHhfm_Internalname), 0) ;
                           A14362Firma4dig = httpContext.cgiGet( edtFirma4dig_Internalname) ;
                           A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
                           n10017AlbFmd = false ;
                           A2242AlbSec = GXutil.upper( httpContext.cgiGet( edtAlbSec_Internalname)) ;
                           A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2124X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2224X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2324X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONS.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2424X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Albprocod Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV92AlbProCod )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albmarcain Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBMARCAIN"), AV98AlbMarcaIN) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Guiremcli Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vGUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV87GuiRemCli )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprofchfrom Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPROFCHFROM"), 0), AV88AlbProfchfrom) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Albprofchto Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vALBPROFCHTO"), 0), AV89AlbProfchto) ) )
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

   public void we24X2( )
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

   public void pa24X2( )
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
            GX_FocusControl = cmbavPrioridad.getInternalname() ;
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
      subsflControlProps_642( ) ;
      while ( nGXsfl_64_idx <= nRC_GXsfl_64 )
      {
         sendrow_642( ) ;
         nGXsfl_64_idx = ((subGrid_Islastpage==1)&&(nGXsfl_64_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_64_idx+1) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 long AV92AlbProCod ,
                                 String AV98AlbMarcaIN ,
                                 int AV87GuiRemCli ,
                                 java.util.Date AV88AlbProfchfrom ,
                                 java.util.Date AV89AlbProfchto ,
                                 String AV52EmprCod ,
                                 String AV50AlbProPri ,
                                 app.wwpbaseobjects.SdtWWPGridState AV10GridState ,
                                 long AV15TFAlbProCod ,
                                 long AV16TFAlbProCod_To ,
                                 int AV17TFGuiRemCli ,
                                 int AV18TFGuiRemCli_To ,
                                 String AV19TFGuiRemCln ,
                                 String AV20TFGuiRemCln_Sel ,
                                 GXSimpleCollection<Byte> AV62TFAlbProEst_Sels ,
                                 java.util.Date AV119TFAlbEnvMail ,
                                 String AV35TFAlbUsu ,
                                 String AV36TFAlbUsu_Sel ,
                                 String AV57TFAlbLic ,
                                 String AV58TFAlbLic_Sel ,
                                 String AV80TFAlbPdATCUD ,
                                 String AV81TFAlbPdATCUD_Sel ,
                                 GXSimpleCollection<Byte> AV38TFAlbEnvFtp_Sels ,
                                 GXSimpleCollection<String> AV94TFAlbProAT_Sels ,
                                 java.util.Date AV39TFAlbHhfm ,
                                 String AV104TFFirma4dig ,
                                 String AV105TFFirma4dig_Sel ,
                                 String AV123Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 String AV55ContCod ,
                                 String AV56Albsec ,
                                 short AV67FirmaD ,
                                 short AV108moda21 ,
                                 String AV106Messages_json ,
                                 String AV102PATHPDF ,
                                 String AV118TextoCopia ,
                                 java.util.Date Gx_date ,
                                 String AV69Prioridad )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2224X2 ();
      GRID_nCurrentRecord = 0 ;
      rf24X2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_1WW");
      forbiddenHiddens.add("Prioridad", GXutil.rtrim( localUtil.format( AV69Prioridad, "")));
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV123Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_1ww:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROEST", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBENVFTP", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A5140AlbMarca, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBMARCA", GXutil.rtrim( A5140AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A2242AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBSEC", GXutil.rtrim( A2242AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBFECSAL", getSecureSignedToken( "", A4023AlbFecSal));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBFECSAL", localUtil.format(A4023AlbFecSal, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBHORSAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A3865AlbHorSal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHORSAL", GXutil.rtrim( A3865AlbHorSal));
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
      if ( cmbavPrioridad.getItemCount() > 0 )
      {
         AV69Prioridad = cmbavPrioridad.getValidValue(AV69Prioridad) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69Prioridad", AV69Prioridad);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPrioridad.setValue( GXutil.rtrim( AV69Prioridad) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrioridad.getInternalname(), "Values", cmbavPrioridad.ToJavascriptSource(), true);
      }
      if ( cmbavAlbmarcain.getItemCount() > 0 )
      {
         AV98AlbMarcaIN = cmbavAlbmarcain.getValidValue(AV98AlbMarcaIN) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98AlbMarcaIN", AV98AlbMarcaIN);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbmarcain.setValue( GXutil.rtrim( AV98AlbMarcaIN) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbmarcain.getInternalname(), "Values", cmbavAlbmarcain.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf24X2( ) ;
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
      AV123Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123Pgmname", AV123Pgmname);
      Gx_err = (short)(0) ;
      cmbavPrioridad.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPrioridad.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavPrioridad.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf24X2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(64) ;
      /* Execute user event: Refresh */
      e2224X2 ();
      nGXsfl_64_idx = 1 ;
      sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_642( ) ;
      bGXsfl_64_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_642( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Byte.valueOf(A33AlbProEst) ,
                                              AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                              Byte.valueOf(A5805AlbEnvFtp) ,
                                              AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                              A10765AlbProAT ,
                                              AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                              Long.valueOf(AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) ,
                                              Long.valueOf(AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) ,
                                              Integer.valueOf(AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) ,
                                              Integer.valueOf(AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) ,
                                              AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                              AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                              Integer.valueOf(AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels.size()) ,
                                              AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                              AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                              AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                              AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                              AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                              AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                              AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                              Integer.valueOf(AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels.size()) ,
                                              Integer.valueOf(AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels.size()) ,
                                              AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                              AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                              AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                              Boolean.valueOf(AV68LoadGridData) ,
                                              Long.valueOf(AV92AlbProCod) ,
                                              Integer.valueOf(AV87GuiRemCli) ,
                                              AV88AlbProfchfrom ,
                                              AV89AlbProfchto ,
                                              Long.valueOf(A30AlbProCod) ,
                                              Integer.valueOf(A1243GuiRemCli) ,
                                              A1244GuiRemCln ,
                                              A14404AlbEnvMail ,
                                              A7098AlbUsu ,
                                              A7101AlbLic ,
                                              A14069AlbPdATCUD ,
                                              A10019AlbHhfm ,
                                              A10017AlbFmd ,
                                              A396EmprCod ,
                                              A34AlbProfch ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              A39AlbProPri ,
                                              AV50AlbProPri ,
                                              A5140AlbMarca ,
                                              AV98AlbMarcaIN ,
                                              AV52EmprCod } ,
                                              new int[]{
                                              TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = GXutil.padr( GXutil.rtrim( AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln), 30, "%") ;
         lV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = GXutil.padr( GXutil.rtrim( AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu), 8, "%") ;
         lV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = GXutil.padr( GXutil.rtrim( AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic), 20, "%") ;
         lV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud), 20, "%") ;
         lV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = GXutil.padr( GXutil.rtrim( AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig), 4, "%") ;
         /* Using cursor H024X2 */
         pr_default.execute(0, new Object[] {AV52EmprCod, AV50AlbProPri, AV98AlbMarcaIN, AV98AlbMarcaIN, Long.valueOf(AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod), Long.valueOf(AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to), Integer.valueOf(AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli), Integer.valueOf(AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to), lV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln, AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel, AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail, lV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu, AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel, lV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic, AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel, lV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud, AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel, AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm, lV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig, AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel, Long.valueOf(AV92AlbProCod), Integer.valueOf(AV87GuiRemCli), AV88AlbProfchfrom, AV89AlbProfchto, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_64_idx = 1 ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A1253EmprGuiRem = H024X2_A1253EmprGuiRem[0] ;
            A396EmprCod = H024X2_A396EmprCod[0] ;
            A39AlbProPri = H024X2_A39AlbProPri[0] ;
            A2242AlbSec = H024X2_A2242AlbSec[0] ;
            A10019AlbHhfm = H024X2_A10019AlbHhfm[0] ;
            A10765AlbProAT = H024X2_A10765AlbProAT[0] ;
            A5805AlbEnvFtp = H024X2_A5805AlbEnvFtp[0] ;
            A14069AlbPdATCUD = H024X2_A14069AlbPdATCUD[0] ;
            A7101AlbLic = H024X2_A7101AlbLic[0] ;
            A7098AlbUsu = H024X2_A7098AlbUsu[0] ;
            A14404AlbEnvMail = H024X2_A14404AlbEnvMail[0] ;
            A3865AlbHorSal = H024X2_A3865AlbHorSal[0] ;
            A4023AlbFecSal = H024X2_A4023AlbFecSal[0] ;
            A34AlbProfch = H024X2_A34AlbProfch[0] ;
            A5140AlbMarca = H024X2_A5140AlbMarca[0] ;
            A33AlbProEst = H024X2_A33AlbProEst[0] ;
            A1244GuiRemCln = H024X2_A1244GuiRemCln[0] ;
            A1243GuiRemCli = H024X2_A1243GuiRemCli[0] ;
            A30AlbProCod = H024X2_A30AlbProCod[0] ;
            A10017AlbFmd = H024X2_A10017AlbFmd[0] ;
            n10017AlbFmd = H024X2_n10017AlbFmd[0] ;
            A1244GuiRemCln = H024X2_A1244GuiRemCln[0] ;
            A14362Firma4dig = GXutil.substring( A10017AlbFmd, 1, 1) + GXutil.substring( A10017AlbFmd, 11, 1) + GXutil.substring( A10017AlbFmd, 21, 1) + GXutil.substring( A10017AlbFmd, 31, 1) ;
            e2324X2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(64) ;
         wb24X0( ) ;
      }
      bGXsfl_64_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes24X2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDSTATE", getSecureSignedToken( "", AV10GridState));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROPRI", GXutil.rtrim( AV50AlbProPri));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50AlbProPri, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROEST"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, localUtil.format( DecimalUtil.doubleToDec(A33AlbProEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBENVFTP"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, localUtil.format( DecimalUtil.doubleToDec(A5805AlbEnvFtp), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFIRMAD", GXutil.ltrim( localUtil.ntoc( AV67FirmaD, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67FirmaD), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBMARCA"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, GXutil.rtrim( localUtil.format( A5140AlbMarca, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBSEC"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, GXutil.rtrim( localUtil.format( A2242AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBFECSAL"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, A4023AlbFecSal));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBHORSAL"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, GXutil.rtrim( localUtil.format( A3865AlbHorSal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV108moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBPROFCH"+"_"+sGXsfl_64_idx, getSecureSignedToken( sGXsfl_64_idx, A34AlbProfch));
      app.GxWebStd.gx_hidden_field( httpContext, "vMESSAGES_JSON", AV106Messages_json);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMESSAGES_JSON", getSecureSignedToken( "", AV106Messages_json));
      app.GxWebStd.gx_hidden_field( httpContext, "vPATHPDF", GXutil.rtrim( AV102PATHPDF));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102PATHPDF, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOCOPIA", AV118TextoCopia);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOCOPIA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV118TextoCopia, ""))));
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
      AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV15TFAlbProCod ;
      AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV17TFGuiRemCli ;
      AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV18TFGuiRemCli_To ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV19TFGuiRemCln ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV20TFGuiRemCln_Sel ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV62TFAlbProEst_Sels ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV119TFAlbEnvMail ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV35TFAlbUsu ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV36TFAlbUsu_Sel ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV57TFAlbLic ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV58TFAlbLic_Sel ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV80TFAlbPdATCUD ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV81TFAlbPdATCUD_Sel ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV38TFAlbEnvFtp_Sels ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV94TFAlbProAT_Sels ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV39TFAlbHhfm ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV104TFFirma4dig ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV105TFFirma4dig_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Byte.valueOf(A33AlbProEst) ,
                                           AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                           Byte.valueOf(A5805AlbEnvFtp) ,
                                           AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                           A10765AlbProAT ,
                                           AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                           Long.valueOf(AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) ,
                                           Long.valueOf(AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) ,
                                           Integer.valueOf(AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) ,
                                           Integer.valueOf(AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) ,
                                           AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                           AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                           Integer.valueOf(AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels.size()) ,
                                           AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                           AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                           AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                           AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                           AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                           AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                           AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                           Integer.valueOf(AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels.size()) ,
                                           Integer.valueOf(AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels.size()) ,
                                           AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                           AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                           AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                           Boolean.valueOf(AV68LoadGridData) ,
                                           Long.valueOf(AV92AlbProCod) ,
                                           Integer.valueOf(AV87GuiRemCli) ,
                                           AV88AlbProfchfrom ,
                                           AV89AlbProfchto ,
                                           Long.valueOf(A30AlbProCod) ,
                                           Integer.valueOf(A1243GuiRemCli) ,
                                           A1244GuiRemCln ,
                                           A14404AlbEnvMail ,
                                           A7098AlbUsu ,
                                           A7101AlbLic ,
                                           A14069AlbPdATCUD ,
                                           A10019AlbHhfm ,
                                           A10017AlbFmd ,
                                           A396EmprCod ,
                                           A34AlbProfch ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           A39AlbProPri ,
                                           AV50AlbProPri ,
                                           A5140AlbMarca ,
                                           AV98AlbMarcaIN ,
                                           AV52EmprCod } ,
                                           new int[]{
                                           TypeConstants.BYTE, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.LONG, TypeConstants.LONG, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DATE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.LONG, TypeConstants.INT, TypeConstants.DATE, TypeConstants.DATE, TypeConstants.LONG, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = GXutil.padr( GXutil.rtrim( AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln), 30, "%") ;
      lV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = GXutil.padr( GXutil.rtrim( AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu), 8, "%") ;
      lV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = GXutil.padr( GXutil.rtrim( AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic), 20, "%") ;
      lV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = GXutil.padr( GXutil.rtrim( AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud), 20, "%") ;
      lV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = GXutil.padr( GXutil.rtrim( AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig), 4, "%") ;
      /* Using cursor H024X3 */
      pr_default.execute(1, new Object[] {AV52EmprCod, AV50AlbProPri, AV98AlbMarcaIN, AV98AlbMarcaIN, Long.valueOf(AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod), Long.valueOf(AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to), Integer.valueOf(AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli), Integer.valueOf(AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to), lV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln, AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel, AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail, lV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu, AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel, lV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic, AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel, lV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud, AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel, AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm, lV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig, AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel, Long.valueOf(AV92AlbProCod), Integer.valueOf(AV87GuiRemCli), AV88AlbProfchfrom, AV89AlbProfchto});
      GRID_nRecordCount = H024X3_AGRID_nRecordCount[0] ;
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
      AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV15TFAlbProCod ;
      AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV17TFGuiRemCli ;
      AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV18TFGuiRemCli_To ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV19TFGuiRemCln ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV20TFGuiRemCln_Sel ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV62TFAlbProEst_Sels ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV119TFAlbEnvMail ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV35TFAlbUsu ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV36TFAlbUsu_Sel ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV57TFAlbLic ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV58TFAlbLic_Sel ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV80TFAlbPdATCUD ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV81TFAlbPdATCUD_Sel ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV38TFAlbEnvFtp_Sels ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV94TFAlbProAT_Sels ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV39TFAlbHhfm ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV104TFFirma4dig ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV105TFFirma4dig_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV92AlbProCod, AV98AlbMarcaIN, AV87GuiRemCli, AV88AlbProfchfrom, AV89AlbProfchto, AV52EmprCod, AV50AlbProPri, AV10GridState, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFGuiRemCli, AV18TFGuiRemCli_To, AV19TFGuiRemCln, AV20TFGuiRemCln_Sel, AV62TFAlbProEst_Sels, AV119TFAlbEnvMail, AV35TFAlbUsu, AV36TFAlbUsu_Sel, AV57TFAlbLic, AV58TFAlbLic_Sel, AV80TFAlbPdATCUD, AV81TFAlbPdATCUD_Sel, AV38TFAlbEnvFtp_Sels, AV94TFAlbProAT_Sels, AV39TFAlbHhfm, AV104TFFirma4dig, AV105TFFirma4dig_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV55ContCod, AV56Albsec, AV67FirmaD, AV108moda21, AV106Messages_json, AV102PATHPDF, AV118TextoCopia, Gx_date, AV69Prioridad) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV15TFAlbProCod ;
      AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV17TFGuiRemCli ;
      AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV18TFGuiRemCli_To ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV19TFGuiRemCln ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV20TFGuiRemCln_Sel ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV62TFAlbProEst_Sels ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV119TFAlbEnvMail ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV35TFAlbUsu ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV36TFAlbUsu_Sel ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV57TFAlbLic ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV58TFAlbLic_Sel ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV80TFAlbPdATCUD ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV81TFAlbPdATCUD_Sel ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV38TFAlbEnvFtp_Sels ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV94TFAlbProAT_Sels ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV39TFAlbHhfm ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV104TFFirma4dig ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV105TFFirma4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV92AlbProCod, AV98AlbMarcaIN, AV87GuiRemCli, AV88AlbProfchfrom, AV89AlbProfchto, AV52EmprCod, AV50AlbProPri, AV10GridState, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFGuiRemCli, AV18TFGuiRemCli_To, AV19TFGuiRemCln, AV20TFGuiRemCln_Sel, AV62TFAlbProEst_Sels, AV119TFAlbEnvMail, AV35TFAlbUsu, AV36TFAlbUsu_Sel, AV57TFAlbLic, AV58TFAlbLic_Sel, AV80TFAlbPdATCUD, AV81TFAlbPdATCUD_Sel, AV38TFAlbEnvFtp_Sels, AV94TFAlbProAT_Sels, AV39TFAlbHhfm, AV104TFFirma4dig, AV105TFFirma4dig_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV55ContCod, AV56Albsec, AV67FirmaD, AV108moda21, AV106Messages_json, AV102PATHPDF, AV118TextoCopia, Gx_date, AV69Prioridad) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV15TFAlbProCod ;
      AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV17TFGuiRemCli ;
      AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV18TFGuiRemCli_To ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV19TFGuiRemCln ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV20TFGuiRemCln_Sel ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV62TFAlbProEst_Sels ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV119TFAlbEnvMail ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV35TFAlbUsu ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV36TFAlbUsu_Sel ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV57TFAlbLic ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV58TFAlbLic_Sel ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV80TFAlbPdATCUD ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV81TFAlbPdATCUD_Sel ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV38TFAlbEnvFtp_Sels ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV94TFAlbProAT_Sels ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV39TFAlbHhfm ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV104TFFirma4dig ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV105TFFirma4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV92AlbProCod, AV98AlbMarcaIN, AV87GuiRemCli, AV88AlbProfchfrom, AV89AlbProfchto, AV52EmprCod, AV50AlbProPri, AV10GridState, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFGuiRemCli, AV18TFGuiRemCli_To, AV19TFGuiRemCln, AV20TFGuiRemCln_Sel, AV62TFAlbProEst_Sels, AV119TFAlbEnvMail, AV35TFAlbUsu, AV36TFAlbUsu_Sel, AV57TFAlbLic, AV58TFAlbLic_Sel, AV80TFAlbPdATCUD, AV81TFAlbPdATCUD_Sel, AV38TFAlbEnvFtp_Sels, AV94TFAlbProAT_Sels, AV39TFAlbHhfm, AV104TFFirma4dig, AV105TFFirma4dig_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV55ContCod, AV56Albsec, AV67FirmaD, AV108moda21, AV106Messages_json, AV102PATHPDF, AV118TextoCopia, Gx_date, AV69Prioridad) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV15TFAlbProCod ;
      AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV17TFGuiRemCli ;
      AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV18TFGuiRemCli_To ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV19TFGuiRemCln ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV20TFGuiRemCln_Sel ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV62TFAlbProEst_Sels ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV119TFAlbEnvMail ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV35TFAlbUsu ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV36TFAlbUsu_Sel ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV57TFAlbLic ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV58TFAlbLic_Sel ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV80TFAlbPdATCUD ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV81TFAlbPdATCUD_Sel ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV38TFAlbEnvFtp_Sels ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV94TFAlbProAT_Sels ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV39TFAlbHhfm ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV104TFFirma4dig ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV105TFFirma4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV92AlbProCod, AV98AlbMarcaIN, AV87GuiRemCli, AV88AlbProfchfrom, AV89AlbProfchto, AV52EmprCod, AV50AlbProPri, AV10GridState, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFGuiRemCli, AV18TFGuiRemCli_To, AV19TFGuiRemCln, AV20TFGuiRemCln_Sel, AV62TFAlbProEst_Sels, AV119TFAlbEnvMail, AV35TFAlbUsu, AV36TFAlbUsu_Sel, AV57TFAlbLic, AV58TFAlbLic_Sel, AV80TFAlbPdATCUD, AV81TFAlbPdATCUD_Sel, AV38TFAlbEnvFtp_Sels, AV94TFAlbProAT_Sels, AV39TFAlbHhfm, AV104TFFirma4dig, AV105TFFirma4dig_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV55ContCod, AV56Albsec, AV67FirmaD, AV108moda21, AV106Messages_json, AV102PATHPDF, AV118TextoCopia, Gx_date, AV69Prioridad) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV15TFAlbProCod ;
      AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV17TFGuiRemCli ;
      AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV18TFGuiRemCli_To ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV19TFGuiRemCln ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV20TFGuiRemCln_Sel ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV62TFAlbProEst_Sels ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV119TFAlbEnvMail ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV35TFAlbUsu ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV36TFAlbUsu_Sel ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV57TFAlbLic ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV58TFAlbLic_Sel ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV80TFAlbPdATCUD ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV81TFAlbPdATCUD_Sel ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV38TFAlbEnvFtp_Sels ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV94TFAlbProAT_Sels ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV39TFAlbHhfm ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV104TFFirma4dig ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV105TFFirma4dig_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV92AlbProCod, AV98AlbMarcaIN, AV87GuiRemCli, AV88AlbProfchfrom, AV89AlbProfchto, AV52EmprCod, AV50AlbProPri, AV10GridState, AV15TFAlbProCod, AV16TFAlbProCod_To, AV17TFGuiRemCli, AV18TFGuiRemCli_To, AV19TFGuiRemCln, AV20TFGuiRemCln_Sel, AV62TFAlbProEst_Sels, AV119TFAlbEnvMail, AV35TFAlbUsu, AV36TFAlbUsu_Sel, AV57TFAlbLic, AV58TFAlbLic_Sel, AV80TFAlbPdATCUD, AV81TFAlbPdATCUD_Sel, AV38TFAlbEnvFtp_Sels, AV94TFAlbProAT_Sels, AV39TFAlbHhfm, AV104TFFirma4dig, AV105TFFirma4dig_Sel, AV123Pgmname, AV12OrderedBy, AV13OrderedDsc, AV55ContCod, AV56Albsec, AV67FirmaD, AV108moda21, AV106Messages_json, AV102PATHPDF, AV118TextoCopia, Gx_date, AV69Prioridad) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_date = GXutil.today( ) ;
      AV123Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1WW" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV123Pgmname", AV123Pgmname);
      Gx_err = (short)(0) ;
      cmbavPrioridad.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavPrioridad.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavPrioridad.getEnabled(), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup24X0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2124X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV45DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_64 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_64"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV47GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV48GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
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
         /* Read variables values. */
         cmbavPrioridad.setName( cmbavPrioridad.getInternalname() );
         cmbavPrioridad.setValue( httpContext.cgiGet( cmbavPrioridad.getInternalname()) );
         AV69Prioridad = httpContext.cgiGet( cmbavPrioridad.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69Prioridad", AV69Prioridad);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPROCOD");
            GX_FocusControl = edtavAlbprocod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV92AlbProCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92AlbProCod), 10, 0));
         }
         else
         {
            AV92AlbProCod = localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV92AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92AlbProCod), 10, 0));
         }
         cmbavAlbmarcain.setName( cmbavAlbmarcain.getInternalname() );
         cmbavAlbmarcain.setValue( httpContext.cgiGet( cmbavAlbmarcain.getInternalname()) );
         AV98AlbMarcaIN = httpContext.cgiGet( cmbavAlbmarcain.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98AlbMarcaIN", AV98AlbMarcaIN);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGuiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGuiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGUIREMCLI");
            GX_FocusControl = edtavGuiremcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV87GuiRemCli = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87GuiRemCli), 6, 0));
         }
         else
         {
            AV87GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtavGuiremcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV87GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87GuiRemCli), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHFROM");
            GX_FocusControl = edtavAlbprofchfrom_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV88AlbProfchfrom = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProfchfrom", localUtil.format(AV88AlbProfchfrom, "99/99/99"));
         }
         else
         {
            AV88AlbProfchfrom = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchfrom_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProfchfrom", localUtil.format(AV88AlbProfchfrom, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavAlbprofchto_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vALBPROFCHTO");
            GX_FocusControl = edtavAlbprofchto_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV89AlbProfchto = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89AlbProfchto", localUtil.format(AV89AlbProfchto, "99/99/99"));
         }
         else
         {
            AV89AlbProfchto = localUtil.ctod( httpContext.cgiGet( edtavAlbprofchto_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89AlbProfchto", localUtil.format(AV89AlbProfchto, "99/99/99"));
         }
         AV123Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV123Pgmname", AV123Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albenvmailauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBENVMAILAUXDATE");
            GX_FocusControl = edtavDdo_albenvmailauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV120DDO_AlbEnvMailAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120DDO_AlbEnvMailAuxDate", localUtil.format(AV120DDO_AlbEnvMailAuxDate, "99/99/99"));
         }
         else
         {
            AV120DDO_AlbEnvMailAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albenvmailauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120DDO_AlbEnvMailAuxDate", localUtil.format(AV120DDO_AlbEnvMailAuxDate, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_albhhfmauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_ALBHHFMAUXDATE");
            GX_FocusControl = edtavDdo_albhhfmauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41DDO_AlbHhfmAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41DDO_AlbHhfmAuxDate", localUtil.format(AV41DDO_AlbHhfmAuxDate, "99/99/99"));
         }
         else
         {
            AV41DDO_AlbHhfmAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_albhhfmauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41DDO_AlbHhfmAuxDate", localUtil.format(AV41DDO_AlbHhfmAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         nGXsfl_64_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
         if ( nGXsfl_64_idx > 0 )
         {
            cmbavGridactions.setName( cmbavGridactions.getInternalname() );
            cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
            AV49GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridActions), 4, 0));
            A30AlbProCod = localUtil.ctol( httpContext.cgiGet( edtAlbProCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            A1243GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( edtGuiRemCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A1244GuiRemCln = httpContext.cgiGet( edtGuiRemCln_Internalname) ;
            cmbAlbProEst.setName( cmbAlbProEst.getInternalname() );
            cmbAlbProEst.setValue( httpContext.cgiGet( cmbAlbProEst.getInternalname()) );
            A33AlbProEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbProEst.getInternalname()))) ;
            cmbAlbMarca.setName( cmbAlbMarca.getInternalname() );
            cmbAlbMarca.setValue( httpContext.cgiGet( cmbAlbMarca.getInternalname()) );
            A5140AlbMarca = httpContext.cgiGet( cmbAlbMarca.getInternalname()) ;
            A34AlbProfch = localUtil.ctod( httpContext.cgiGet( edtAlbProfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A4023AlbFecSal = localUtil.ctod( httpContext.cgiGet( edtAlbFecSal_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            A3865AlbHorSal = httpContext.cgiGet( edtAlbHorSal_Internalname) ;
            A14404AlbEnvMail = localUtil.ctot( httpContext.cgiGet( edtAlbEnvMail_Internalname)) ;
            A7098AlbUsu = httpContext.cgiGet( edtAlbUsu_Internalname) ;
            A7101AlbLic = httpContext.cgiGet( edtAlbLic_Internalname) ;
            A14069AlbPdATCUD = httpContext.cgiGet( edtAlbPdATCUD_Internalname) ;
            cmbAlbEnvFtp.setName( cmbAlbEnvFtp.getInternalname() );
            cmbAlbEnvFtp.setValue( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()) );
            A5805AlbEnvFtp = (byte)(GXutil.lval( httpContext.cgiGet( cmbAlbEnvFtp.getInternalname()))) ;
            cmbAlbProAT.setName( cmbAlbProAT.getInternalname() );
            cmbAlbProAT.setValue( httpContext.cgiGet( cmbAlbProAT.getInternalname()) );
            A10765AlbProAT = httpContext.cgiGet( cmbAlbProAT.getInternalname()) ;
            A10019AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtAlbHhfm_Internalname)) ;
            A14362Firma4dig = httpContext.cgiGet( edtFirma4dig_Internalname) ;
            A10017AlbFmd = httpContext.cgiGet( edtAlbFmd_Internalname) ;
            n10017AlbFmd = false ;
            A2242AlbSec = GXutil.upper( httpContext.cgiGet( edtAlbSec_Internalname)) ;
            A39AlbProPri = httpContext.cgiGet( edtAlbProPri_Internalname) ;
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_1WW");
         AV69Prioridad = httpContext.cgiGet( cmbavPrioridad.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69Prioridad", AV69Prioridad);
         forbiddenHiddens.add("Prioridad", GXutil.rtrim( localUtil.format( AV69Prioridad, "")));
         AV123Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV123Pgmname", AV123Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV123Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_1ww:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vALBPROCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV92AlbProCod )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vALBMARCAIN"), AV98AlbMarcaIN) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vGUIREMCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV87GuiRemCli )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPROFCHFROM"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV88AlbProfchfrom)) ) )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vALBPROFCHTO"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV89AlbProfchto)) ) )
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
      e2124X2 ();
      if (returnInSub) return;
   }

   public void e2124X2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV69Prioridad = AV50AlbProPri ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69Prioridad", AV69Prioridad);
      /* Execute user subroutine: 'LOADFILTERFORM' */
      S112 ();
      if (returnInSub) return;
      if ( (GXutil.strcmp("", AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca())==0) )
      {
         AV98AlbMarcaIN = "T" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98AlbMarcaIN", AV98AlbMarcaIN);
      }
      if ( GXutil.strcmp(AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad(), " ") == 0 )
      {
         AV69Prioridad = AV50AlbProPri ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69Prioridad", AV69Prioridad);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom())) || ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto())) )
      {
         AV88AlbProfchfrom = AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProfchfrom", localUtil.format(AV88AlbProfchfrom, "99/99/99"));
         AV89AlbProfchto = AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89AlbProfchto", localUtil.format(AV89AlbProfchto, "99/99/99"));
      }
      else
      {
         if ( (0==AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod()) )
         {
            AV88AlbProfchfrom = GXutil.dadd(Gx_date,-(30)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProfchfrom", localUtil.format(AV88AlbProfchfrom, "99/99/99"));
            AV89AlbProfchto = Gx_date ;
            httpContext.ajax_rsp_assign_attri("", false, "AV89AlbProfchto", localUtil.format(AV89AlbProfchto, "99/99/99"));
         }
      }
      GXt_char1 = AV51Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char1 = GXv_char2[0] ;
      AV51Station = GXt_char1 ;
      GXv_char2[0] = AV52EmprCod ;
      GXv_char3[0] = AV53EmprNom ;
      GXv_char4[0] = AV54UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV51Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_1ww_impl.this.AV52EmprCod = GXv_char2[0] ;
      documentodetransporteproduccion_1ww_impl.this.AV53EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_1ww_impl.this.AV54UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Documento de Transporte Produccion", "") );
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV45DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV45DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV67FirmaD) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV52EmprCod, httpContext.getMessage( "FIRDGG", ""), GXv_int8) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV67FirmaD = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV67FirmaD", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67FirmaD), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFIRMAD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV67FirmaD), "ZZZ9")));
      GXt_int7 = (byte)(AV95hashAnt) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV52EmprCod, httpContext.getMessage( "HASANT", ""), GXv_int8) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV95hashAnt = GXt_int7 ;
      GXt_char1 = AV102PATHPDF ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusemplin(remoteHandle, context).execute( AV52EmprCod, httpContext.getMessage( "WEBPDF", ""), GXv_char4) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char1 = GXv_char4[0] ;
      AV102PATHPDF = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV102PATHPDF", AV102PATHPDF);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPATHPDF", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV102PATHPDF, ""))));
      GXt_int7 = (byte)(AV108moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV52EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_int7 = GXv_int8[0] ;
      AV108moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV108moda21), "ZZZ9")));
   }

   public void e2224X2( )
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
      AV68LoadGridData = (boolean)(((AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size()>0))) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68LoadGridData", AV68LoadGridData);
      Gridpaginationbar_Emptygridcaption = (AV68LoadGridData ? httpContext.getMessage( "WWP_PagingEmptyGridCaption", "") : httpContext.getMessage( "WWP_ApplyFilterToShowData", "")) ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
      AV47GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridCurrentPage), 10, 0));
      AV48GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48GridPageCount), 10, 0));
      cmbavGridactions.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Columnheaderclass", cmbavGridactions.getColumnHeaderClass(), !bGXsfl_64_Refreshing);
      edtAlbProCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProCod_Internalname, "Columnheaderclass", edtAlbProCod_Columnheaderclass, !bGXsfl_64_Refreshing);
      edtGuiRemCli_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCli_Internalname, "Columnheaderclass", edtGuiRemCli_Columnheaderclass, !bGXsfl_64_Refreshing);
      edtGuiRemCln_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtGuiRemCln_Internalname, "Columnheaderclass", edtGuiRemCln_Columnheaderclass, !bGXsfl_64_Refreshing);
      cmbAlbProEst.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Columnheaderclass", cmbAlbProEst.getColumnHeaderClass(), !bGXsfl_64_Refreshing);
      cmbAlbMarca.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbMarca.getInternalname(), "Columnheaderclass", cmbAlbMarca.getColumnHeaderClass(), !bGXsfl_64_Refreshing);
      edtAlbProfch_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbProfch_Internalname, "Columnheaderclass", edtAlbProfch_Columnheaderclass, !bGXsfl_64_Refreshing);
      edtAlbFecSal_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbFecSal_Internalname, "Columnheaderclass", edtAlbFecSal_Columnheaderclass, !bGXsfl_64_Refreshing);
      edtAlbHorSal_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHorSal_Internalname, "Columnheaderclass", edtAlbHorSal_Columnheaderclass, !bGXsfl_64_Refreshing);
      edtAlbEnvMail_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbEnvMail_Internalname, "Columnheaderclass", edtAlbEnvMail_Columnheaderclass, !bGXsfl_64_Refreshing);
      edtAlbUsu_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbUsu_Internalname, "Columnheaderclass", edtAlbUsu_Columnheaderclass, !bGXsfl_64_Refreshing);
      edtAlbLic_Columnheaderclass = "WWColumn hidden-xs" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbLic_Internalname, "Columnheaderclass", edtAlbLic_Columnheaderclass, !bGXsfl_64_Refreshing);
      edtAlbPdATCUD_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbPdATCUD_Internalname, "Columnheaderclass", edtAlbPdATCUD_Columnheaderclass, !bGXsfl_64_Refreshing);
      cmbAlbEnvFtp.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Columnheaderclass", cmbAlbEnvFtp.getColumnHeaderClass(), !bGXsfl_64_Refreshing);
      cmbAlbProAT.setColumnHeaderClass( "WWColumn hidden-xs" );
      httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Columnheaderclass", cmbAlbProAT.getColumnHeaderClass(), !bGXsfl_64_Refreshing);
      edtAlbHhfm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtAlbHhfm_Internalname, "Columnheaderclass", edtAlbHhfm_Columnheaderclass, !bGXsfl_64_Refreshing);
      edtFirma4dig_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtFirma4dig_Internalname, "Columnheaderclass", edtFirma4dig_Columnheaderclass, !bGXsfl_64_Refreshing);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "GridLayoutClean", "", new Object[] {});
      AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod = AV15TFAlbProCod ;
      AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to = AV16TFAlbProCod_To ;
      AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli = AV17TFGuiRemCli ;
      AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to = AV18TFGuiRemCli_To ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = AV19TFGuiRemCln ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = AV20TFGuiRemCln_Sel ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = AV62TFAlbProEst_Sels ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = AV119TFAlbEnvMail ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = AV35TFAlbUsu ;
      AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = AV36TFAlbUsu_Sel ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = AV57TFAlbLic ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = AV58TFAlbLic_Sel ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = AV80TFAlbPdATCUD ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = AV81TFAlbPdATCUD_Sel ;
      AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = AV38TFAlbEnvFtp_Sels ;
      AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = AV94TFAlbProAT_Sels ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = AV39TFAlbHhfm ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = AV104TFFirma4dig ;
      AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = AV105TFFirma4dig_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1124X2( )
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
         AV46PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV46PageToGo) ;
      }
   }

   public void e1224X2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1324X2( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProCod") == 0 )
         {
            AV15TFAlbProCod = GXutil.lval( Ddo_grid_Filteredtext_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFAlbProCod), 10, 0));
            AV16TFAlbProCod_To = GXutil.lval( Ddo_grid_Filteredtextto_get) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiRemCli") == 0 )
         {
            AV17TFGuiRemCli = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFGuiRemCli), 6, 0));
            AV18TFGuiRemCli_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFGuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18TFGuiRemCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "GuiRemCln") == 0 )
         {
            AV19TFGuiRemCln = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFGuiRemCln", AV19TFGuiRemCln);
            AV20TFGuiRemCln_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFGuiRemCln_Sel", AV20TFGuiRemCln_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProEst") == 0 )
         {
            AV61TFAlbProEst_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbProEst_SelsJson", AV61TFAlbProEst_SelsJson);
            AV62TFAlbProEst_Sels.fromJSonString(GXutil.strReplace( AV61TFAlbProEst_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbEnvMail") == 0 )
         {
            AV119TFAlbEnvMail = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFAlbEnvMail", localUtil.ttoc( AV119TFAlbEnvMail, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbUsu") == 0 )
         {
            AV35TFAlbUsu = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFAlbUsu", AV35TFAlbUsu);
            AV36TFAlbUsu_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbUsu_Sel", AV36TFAlbUsu_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbLic") == 0 )
         {
            AV57TFAlbLic = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbLic", AV57TFAlbLic);
            AV58TFAlbLic_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbLic_Sel", AV58TFAlbLic_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbPdATCUD") == 0 )
         {
            AV80TFAlbPdATCUD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFAlbPdATCUD", AV80TFAlbPdATCUD);
            AV81TFAlbPdATCUD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFAlbPdATCUD_Sel", AV81TFAlbPdATCUD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbEnvFtp") == 0 )
         {
            AV37TFAlbEnvFtp_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbEnvFtp_SelsJson", AV37TFAlbEnvFtp_SelsJson);
            AV38TFAlbEnvFtp_Sels.fromJSonString(GXutil.strReplace( AV37TFAlbEnvFtp_SelsJson, "\"", ""), null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbProAT") == 0 )
         {
            AV93TFAlbProAT_SelsJson = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFAlbProAT_SelsJson", AV93TFAlbProAT_SelsJson);
            AV94TFAlbProAT_Sels.fromJSonString(AV93TFAlbProAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbHhfm") == 0 )
         {
            AV39TFAlbHhfm = localUtil.ctot( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFAlbHhfm", localUtil.ttoc( AV39TFAlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "Firma4dig") == 0 )
         {
            AV104TFFirma4dig = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFFirma4dig", AV104TFFirma4dig);
            AV105TFFirma4dig_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFFirma4dig_Sel", AV105TFFirma4dig_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV94TFAlbProAT_Sels", AV94TFAlbProAT_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV38TFAlbEnvFtp_Sels", AV38TFAlbEnvFtp_Sels);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV62TFAlbProEst_Sels", AV62TFAlbProEst_Sels);
   }

   private void e2324X2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_display", ""), "fa fa-search", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "GXM_update", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Anular GUIA", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      if ( 1 == 2 )
      {
         cmbavGridactions.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar Lineas Documento", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactions.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Produccion", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Imprimir / Enviar Email", ""), "fa fa-file-pdf", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("7", GXutil.format( "%1;%2", httpContext.getMessage( "Enviar Impressora", ""), "fas fa-print", "", "", "", "", "", "", ""), (short)(0));
      if ( 1 == 2 )
      {
         cmbavGridactions.addItem("8", GXutil.format( "%1;%2", httpContext.getMessage( "Generar HASH", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavGridactions.addItem("9", GXutil.format( "%1;%2", httpContext.getMessage( "Envio AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("10", GXutil.format( "%1;%2", httpContext.getMessage( "Entrada Manual Codigo de AT", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.addItem("11", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavGridactions.setColumnClass( ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWActionGroupColumn WWColumnDanger WWColumnDangerFirstColumn" : "WWActionGroupColumn") );
      edtAlbProCod_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtGuiRemCli_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtGuiRemCln_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      cmbAlbProEst.setColumnClass( ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      cmbAlbMarca.setColumnClass( ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      edtAlbProfch_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbFecSal_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbHorSal_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbEnvMail_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbUsu_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtAlbLic_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") ;
      edtAlbPdATCUD_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      cmbAlbEnvFtp.setColumnClass( ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") );
      cmbAlbProAT.setColumnClass( ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger hidden-xs" : "WWColumn hidden-xs") );
      edtAlbHhfm_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      edtFirma4dig_Columnclass = ((GXutil.strcmp(A5140AlbMarca, "A")==0) ? "WWColumn WWColumnDanger" : "WWColumn") ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(64) ;
      }
      sendrow_642( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_64_Refreshing )
      {
         httpContext.doAjaxLoad(64, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV49GridActions, 4, 0)) );
   }

   public void e2424X2( )
   {
      /* Gridactions_Click Routine */
      returnInSub = false ;
      if ( AV49GridActions == 1 )
      {
         /* Execute user subroutine: 'DO DISPLAY' */
         S162 ();
         if (returnInSub) return;
      }
      else if ( AV49GridActions == 2 )
      {
         /* Execute user subroutine: 'DO UPDATE' */
         S172 ();
         if (returnInSub) return;
      }
      else if ( AV49GridActions == 3 )
      {
         /* Execute user subroutine: 'DO ANULARGUIA' */
         S182 ();
         if (returnInSub) return;
      }
      else if ( AV49GridActions == 4 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S192 ();
         if (returnInSub) return;
      }
      else if ( AV49GridActions == 5 )
      {
         /* Execute user subroutine: 'DO PRODUCCION' */
         S202 ();
         if (returnInSub) return;
      }
      else if ( AV49GridActions == 6 )
      {
         /* Execute user subroutine: 'DO IMPRIMIR' */
         S212 ();
         if (returnInSub) return;
      }
      else if ( AV49GridActions == 7 )
      {
         /* Execute user subroutine: 'DO ENVIARIMPRESSORA' */
         S222 ();
         if (returnInSub) return;
      }
      else if ( AV49GridActions == 8 )
      {
         /* Execute user subroutine: 'DO HASH' */
         S232 ();
         if (returnInSub) return;
      }
      else if ( AV49GridActions == 9 )
      {
         /* Execute user subroutine: 'DO ENVIOAT' */
         S242 ();
         if (returnInSub) return;
      }
      else if ( AV49GridActions == 10 )
      {
         /* Execute user subroutine: 'DO MANUALCODIGOAT' */
         S252 ();
         if (returnInSub) return;
      }
      else if ( AV49GridActions == 11 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S262 ();
         if (returnInSub) return;
      }
      AV49GridActions = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridActions), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV49GridActions, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), true);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
   }

   public void e1424X2( )
   {
      /* 'DoInsert' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV69Prioridad, "9") == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO hay defininido el Tipo de Guia: Guia Remessa o Guia Transporte sem Ecargos", ""));
         GX_FocusControl = cmbavPrioridad.getInternalname() ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( GXutil.strcmp(AV69Prioridad, "1") == 0 )
         {
            AV56Albsec = "N" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56Albsec", AV56Albsec);
            AV55ContCod = "666666" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55ContCod", AV55ContCod);
         }
         else if ( GXutil.strcmp(AV69Prioridad, "0") == 0 )
         {
            AV56Albsec = "N" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56Albsec", AV56Albsec);
            AV55ContCod = "555555" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55ContCod", AV55ContCod);
         }
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_1", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(0,9,0)),GXutil.URLEncode(GXutil.rtrim(AV69Prioridad)),GXutil.URLEncode(GXutil.rtrim(AV55ContCod)),GXutil.URLEncode(GXutil.rtrim(AV56Albsec))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","ContCod","AlbSec"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10GridState", AV10GridState);
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
      /* 'DO DISPLAY' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
      {
         AV55ContCod = "666666" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ContCod", AV55ContCod);
      }
      else if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
      {
         AV55ContCod = "555555" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55ContCod", AV55ContCod);
      }
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_1", new String[] {GXutil.URLEncode(GXutil.rtrim("DSP")),GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(A39AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV55ContCod)),GXutil.URLEncode(GXutil.rtrim(AV56Albsec))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","ContCod","AlbSec"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'DO UPDATE' Routine */
      returnInSub = false ;
      if ( A33AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Faturado", ""));
      }
      else
      {
         if ( ( ! (GXutil.strcmp("", A7101AlbLic)==0) || ( A5805AlbEnvFtp == 3 ) ) && ( AV67FirmaD == 1 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""));
         }
         else
         {
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Anulada ¡¡¡", ""));
            }
            else
            {
               if ( GXutil.strcmp(A39AlbProPri, "1") == 0 )
               {
                  AV55ContCod = "666666" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV55ContCod", AV55ContCod);
               }
               else if ( GXutil.strcmp(A39AlbProPri, "0") == 0 )
               {
                  AV55ContCod = "555555" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV55ContCod", AV55ContCod);
               }
               httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_1", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(A39AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV55ContCod)),GXutil.URLEncode(GXutil.rtrim(A2242AlbSec))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","ContCod","AlbSec"}) , new Object[] {});
               httpContext.doAjaxRefresh();
            }
         }
      }
   }

   public void S182( )
   {
      /* 'DO ANULARGUIA' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A5140AlbMarca, "A") == 0 )
      {
         Gx_msg = httpContext.getMessage( "Este Guia foi ANULADA", "") ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( (GXutil.strcmp("", A7101AlbLic)==0) )
         {
            Gx_msg = httpContext.getMessage( "Este guia não tem código AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( A5805AlbEnvFtp == 0 )
            {
               Gx_msg = httpContext.getMessage( "Este guia não foi enviado para a AT", "") ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               AV109albprosalalfa = localUtil.dtoc( A4023AlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") ;
               AV110texto = AV109albprosalalfa + " " + GXutil.trim( A3865AlbHorSal) ;
               AV79AlbProsal = localUtil.ctot( AV110texto, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV79AlbProsal", localUtil.ttoc( AV79AlbProsal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               httpContext.popup(formatLink("app.documentotransporteproduccion_anulacion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10019AlbHhfm)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV79AlbProsal)),GXutil.URLEncode(GXutil.rtrim(A39AlbProPri)),GXutil.URLEncode(GXutil.rtrim(A7101AlbLic)),GXutil.URLEncode(GXutil.rtrim(AV70Cadena)),GXutil.URLEncode(GXutil.rtrim(AV78Hash))}, new String[] {"EmprCod","AlbProcod","AlbHhfm","AlbProSal","ALbProPri","ALbLic","Cadena","Hash"}) , new Object[] {"AV52EmprCod","A30AlbProCod","A10019AlbHhfm","AV79AlbProsal","A39AlbProPri","A7101AlbLic","AV70Cadena","AV78Hash"});
            }
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      if ( A33AlbProEst == 2 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Faturado", ""));
      }
      else
      {
         if ( ! (GXutil.strcmp("", A7101AlbLic)==0) && ( AV67FirmaD == 1 ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Este guia foi comunicada à AT", ""));
         }
         else
         {
            if ( GXutil.strcmp(A5140AlbMarca, httpContext.getMessage( "A", "")) == 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia Anulada ¡¡¡", ""));
            }
            else
            {
               GXv_char4[0] = AV52EmprCod ;
               GXv_int10[0] = A30AlbProCod ;
               GXv_int8[0] = (byte)(1) ;
               new app.pdelaln(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int8) ;
               documentodetransporteproduccion_1ww_impl.this.AV52EmprCod = GXv_char4[0] ;
               documentodetransporteproduccion_1ww_impl.this.A30AlbProCod = GXv_int10[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
               httpContext.doAjaxRefresh();
               if ( 1 == 0 )
               {
                  callWebObject(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_1", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(A39AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV55ContCod)),GXutil.URLEncode(GXutil.rtrim(A2242AlbSec))}, new String[] {"Mode","EmprCod","AlbProCod","AlbProPri","ContCod","AlbSec"}) );
                  httpContext.wjLocDisableFrm = (byte)(1) ;
               }
            }
         }
      }
   }

   public void S202( )
   {
      /* 'DO PRODUCCION' Routine */
      returnInSub = false ;
      AV107CliFacMtsP = "N" ;
      if ( AV108moda21 == 1 )
      {
         GXv_char4[0] = AV52EmprCod ;
         GXv_int11[0] = A1243GuiRemCli ;
         GXv_char3[0] = AV107CliFacMtsP ;
         new app.pclimtspl(remoteHandle, context).execute( GXv_char4, GXv_int11, GXv_char3) ;
         documentodetransporteproduccion_1ww_impl.this.AV52EmprCod = GXv_char4[0] ;
         documentodetransporteproduccion_1ww_impl.this.A1243GuiRemCli = GXv_int11[0] ;
         documentodetransporteproduccion_1ww_impl.this.AV107CliFacMtsP = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52EmprCod", AV52EmprCod);
      }
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_40", new String[] {GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A1243GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(A1244GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(A34AlbProfch)),GXutil.URLEncode(GXutil.rtrim(A2242AlbSec)),GXutil.URLEncode(GXutil.rtrim(A39AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(A5805AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(A7101AlbLic)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10019AlbHhfm)),GXutil.URLEncode(GXutil.ltrimstr(A33AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(A5140AlbMarca)),GXutil.URLEncode(GXutil.rtrim(AV78Hash)),GXutil.URLEncode(GXutil.booltostr(AV75ok)),GXutil.URLEncode(GXutil.rtrim(AV106Messages_json)),GXutil.URLEncode(GXutil.rtrim(AV107CliFacMtsP))}, new String[] {"EmprCod","AlbProCod","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic","AlbHhfm","AlbProEst","AlbMarca","Hash","ok","Messages_json","CliFacMtsP"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S212( )
   {
      /* 'DO IMPRIMIR' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_5", new String[] {GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.rtrim(A5140AlbMarca))}, new String[] {"AuxEmprcod","AlbProcod","albmarca"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S222( )
   {
      /* 'DO ENVIARIMPRESSORA' Routine */
      returnInSub = false ;
      AV116Path = GXutil.format( httpContext.getMessage( "%1Report_Printer.pdf", ""), AV102PATHPDF, "", "", "", "", "", "", "", "") ;
      new app.paguagrmodacopy1(remoteHandle, context).execute( AV116Path, AV52EmprCod, A30AlbProCod, "", AV118TextoCopia) ;
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "ModalPageRedirect", "", new Object[] {formatLink("app.listprinter", new String[] {GXutil.URLEncode(GXutil.rtrim(AV116Path))}, new String[] {"Path"}) ,httpContext.getMessage( "Seleccion de Impressora", ""),"#","",""});
   }

   public void S232( )
   {
      /* 'DO HASH' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV96msg_control ;
      new app.pctrlhashanterior_2(remoteHandle, context).execute( AV52EmprCod, A39AlbProPri, A30AlbProCod, GXv_char4) ;
      documentodetransporteproduccion_1ww_impl.this.AV96msg_control = GXv_char4[0] ;
      if ( ! (GXutil.strcmp("", AV96msg_control)==0) )
      {
         httpContext.GX_msglist.addItem(AV96msg_control);
      }
      else
      {
         if ( GXutil.strcmp(A7101AlbLic, " ") != 0 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A7101AlbLic ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            if ( A5805AlbEnvFtp == 3 )
            {
               Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            else
            {
               if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(A4023AlbFecSal)) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Fecha-Hora Salida", ""));
               }
               else
               {
                  if ( GXutil.dateCompare(GXutil.nullDate(), A10019AlbHhfm) )
                  {
                     httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Fecha-Hora System", ""));
                  }
                  else
                  {
                     GXv_char4[0] = AV70Cadena ;
                     GXv_char3[0] = AV71firma ;
                     new app.documentotransporteproduccion.obtengocadenaparahashdocumentodetransporteproduccion(remoteHandle, context).execute( AV52EmprCod, (int)(A30AlbProCod), A34AlbProfch, A10019AlbHhfm, GXv_char4, GXv_char3) ;
                     documentodetransporteproduccion_1ww_impl.this.AV70Cadena = GXv_char4[0] ;
                     documentodetransporteproduccion_1ww_impl.this.AV71firma = GXv_char3[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV70Cadena", AV70Cadena);
                     GXv_char4[0] = AV78Hash ;
                     GXv_objcol_SdtMessages_Message12[0] = AV76Messages ;
                     GXv_boolean13[0] = AV75ok ;
                     new app.hash_obtener(remoteHandle, context).execute( AV70Cadena, GXv_char4, GXv_objcol_SdtMessages_Message12, GXv_boolean13) ;
                     documentodetransporteproduccion_1ww_impl.this.AV78Hash = GXv_char4[0] ;
                     AV76Messages = GXv_objcol_SdtMessages_Message12[0] ;
                     documentodetransporteproduccion_1ww_impl.this.AV75ok = GXv_boolean13[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "AV78Hash", AV78Hash);
                     httpContext.ajax_rsp_assign_attri("", false, "AV75ok", AV75ok);
                     if ( AV75ok )
                     {
                        httpContext.GX_msglist.addItem(httpContext.getMessage( "Hash creado correctamente", ""));
                        GXv_char4[0] = AV70Cadena ;
                        GXv_char3[0] = AV78Hash ;
                        new app.documentotransporteproduccion.actualizohashdocumentodetransporteproduccion(remoteHandle, context).execute( AV52EmprCod, (int)(A30AlbProCod), GXv_char4, GXv_char3) ;
                        documentodetransporteproduccion_1ww_impl.this.AV70Cadena = GXv_char4[0] ;
                        documentodetransporteproduccion_1ww_impl.this.AV78Hash = GXv_char3[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV70Cadena", AV70Cadena);
                        httpContext.ajax_rsp_assign_attri("", false, "AV78Hash", AV78Hash);
                     }
                     else
                     {
                        AV145GXV1 = 1 ;
                        while ( AV145GXV1 <= AV76Messages.size() )
                        {
                           AV77Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV76Messages.elementAt(-1+AV145GXV1));
                           httpContext.GX_msglist.addItem(AV77Message.getgxTv_SdtMessages_Message_Description());
                           AV145GXV1 = (int)(AV145GXV1+1) ;
                        }
                     }
                  }
               }
            }
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S242( )
   {
      /* 'DO ENVIOAT' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A7101AlbLic, " ") != 0 )
      {
         Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A7101AlbLic ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( A5805AlbEnvFtp == 3 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            httpContext.popup(formatLink("app.documentotransporteproduccion.documentotransporteproduccion_fecha_hora_salida_hash", new String[] {GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10019AlbHhfm)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV79AlbProsal)),GXutil.URLEncode(GXutil.rtrim(A39AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV70Cadena)),GXutil.URLEncode(GXutil.rtrim(AV78Hash))}, new String[] {"EmprCod","AlbProcod","AlbHhfm","AlbProSal","ALbProPri","Cadena","Hash"}) , new Object[] {"AV52EmprCod","A30AlbProCod","A10019AlbHhfm","AV79AlbProsal","A39AlbProPri","AV70Cadena","AV78Hash"});
         }
      }
      httpContext.doAjaxRefresh();
   }

   public void S252( )
   {
      /* 'DO MANUALCODIGOAT' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A7101AlbLic, " ") != 0 )
      {
         Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + A7101AlbLic ;
         httpContext.GX_msglist.addItem(Gx_msg);
      }
      else
      {
         if ( A5805AlbEnvFtp == 3 )
         {
            Gx_msg = httpContext.getMessage( "Atenção, este guia ya fue enviada a AT", "") ;
            httpContext.GX_msglist.addItem(Gx_msg);
         }
         else
         {
            httpContext.popup(formatLink("app.documentotransporteproduccion.documentotransportedeproduccion_11", new String[] {GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(A1243GuiRemCli,6,0)),GXutil.URLEncode(GXutil.formatDateParm(A4023AlbFecSal)),GXutil.URLEncode(GXutil.rtrim(A3865AlbHorSal)),GXutil.URLEncode(GXutil.formatDateTimeParm(A10019AlbHhfm)),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"Emprcod","AlbProcod","clicod","AlbFecSal","AlbHorSal","AlbHhfm","CliNif"}) , new Object[] {});
            httpContext.doAjaxRefresh();
         }
      }
   }

   public void S262( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_12", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV52EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A30AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV14Session.getValue(AV123Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV123Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV14Session.getValue(AV123Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV146GXV2 = 1 ;
      while ( AV146GXV2 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV146GXV2));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROCOD") == 0 )
         {
            AV15TFAlbProCod = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15TFAlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15TFAlbProCod), 10, 0));
            AV16TFAlbProCod_To = GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto()) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16TFAlbProCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16TFAlbProCod_To), 10, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLI") == 0 )
         {
            AV17TFGuiRemCli = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TFGuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TFGuiRemCli), 6, 0));
            AV18TFGuiRemCli_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18TFGuiRemCli_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18TFGuiRemCli_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN") == 0 )
         {
            AV19TFGuiRemCln = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19TFGuiRemCln", AV19TFGuiRemCln);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFGUIREMCLN_SEL") == 0 )
         {
            AV20TFGuiRemCln_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TFGuiRemCln_Sel", AV20TFGuiRemCln_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROEST_SEL") == 0 )
         {
            AV61TFAlbProEst_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFAlbProEst_SelsJson", AV61TFAlbProEst_SelsJson);
            AV62TFAlbProEst_Sels.fromJSonString(AV61TFAlbProEst_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBENVMAIL") == 0 )
         {
            AV119TFAlbEnvMail = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFAlbEnvMail", localUtil.ttoc( AV119TFAlbEnvMail, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV120DDO_AlbEnvMailAuxDate = GXutil.resetTime(AV119TFAlbEnvMail) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV120DDO_AlbEnvMailAuxDate", localUtil.format(AV120DDO_AlbEnvMailAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBUSU") == 0 )
         {
            AV35TFAlbUsu = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFAlbUsu", AV35TFAlbUsu);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBUSU_SEL") == 0 )
         {
            AV36TFAlbUsu_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFAlbUsu_Sel", AV36TFAlbUsu_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC") == 0 )
         {
            AV57TFAlbLic = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFAlbLic", AV57TFAlbLic);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBLIC_SEL") == 0 )
         {
            AV58TFAlbLic_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFAlbLic_Sel", AV58TFAlbLic_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPDATCUD") == 0 )
         {
            AV80TFAlbPdATCUD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV80TFAlbPdATCUD", AV80TFAlbPdATCUD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPDATCUD_SEL") == 0 )
         {
            AV81TFAlbPdATCUD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81TFAlbPdATCUD_Sel", AV81TFAlbPdATCUD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBENVFTP_SEL") == 0 )
         {
            AV37TFAlbEnvFtp_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFAlbEnvFtp_SelsJson", AV37TFAlbEnvFtp_SelsJson);
            AV38TFAlbEnvFtp_Sels.fromJSonString(AV37TFAlbEnvFtp_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBPROAT_SEL") == 0 )
         {
            AV93TFAlbProAT_SelsJson = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93TFAlbProAT_SelsJson", AV93TFAlbProAT_SelsJson);
            AV94TFAlbProAT_Sels.fromJSonString(AV93TFAlbProAT_SelsJson, null);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBHHFM") == 0 )
         {
            AV39TFAlbHhfm = localUtil.ctot( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFAlbHhfm", localUtil.ttoc( AV39TFAlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV41DDO_AlbHhfmAuxDate = GXutil.resetTime(AV39TFAlbHhfm) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41DDO_AlbHhfmAuxDate", localUtil.format(AV41DDO_AlbHhfmAuxDate, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFIRMA4DIG") == 0 )
         {
            AV104TFFirma4dig = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV104TFFirma4dig", AV104TFFirma4dig);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFIRMA4DIG_SEL") == 0 )
         {
            AV105TFFirma4dig_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV105TFFirma4dig_Sel", AV105TFFirma4dig_Sel);
         }
         AV146GXV2 = (int)(AV146GXV2+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV20TFGuiRemCln_Sel)==0), AV20TFGuiRemCln_Sel, GXv_char4) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFAlbUsu_Sel)==0), AV36TFAlbUsu_Sel, GXv_char3) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char14 = GXv_char3[0] ;
      GXt_char15 = "" ;
      GXv_char2[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFAlbLic_Sel)==0), AV58TFAlbLic_Sel, GXv_char2) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char15 = GXv_char2[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV81TFAlbPdATCUD_Sel)==0), AV81TFAlbPdATCUD_Sel, GXv_char17) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (AV94TFAlbProAT_Sels.size()==0), AV93TFAlbProAT_SelsJson, GXv_char19) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV105TFFirma4dig_Sel)==0), AV105TFFirma4dig_Sel, GXv_char21) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = "||"+GXt_char1+"|"+((AV62TFAlbProEst_Sels.size()==0) ? "" : AV61TFAlbProEst_SelsJson)+"||||||"+GXt_char14+"|"+GXt_char15+"|"+GXt_char16+"|"+((AV38TFAlbEnvFtp_Sels.size()==0) ? "" : AV37TFAlbEnvFtp_SelsJson)+"|"+GXt_char18+"||"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV19TFGuiRemCln)==0), AV19TFGuiRemCln, GXv_char21) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFAlbUsu)==0), AV35TFAlbUsu, GXv_char19) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFAlbLic)==0), AV57TFAlbLic, GXv_char17) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char15 = "" ;
      GXv_char4[0] = GXt_char15 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV80TFAlbPdATCUD)==0), AV80TFAlbPdATCUD, GXv_char4) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char15 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV104TFFirma4dig)==0), AV104TFFirma4dig, GXv_char3) ;
      documentodetransporteproduccion_1ww_impl.this.GXt_char14 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV15TFAlbProCod) ? "" : GXutil.str( AV15TFAlbProCod, 10, 0))+"|"+((0==AV17TFGuiRemCli) ? "" : GXutil.str( AV17TFGuiRemCli, 6, 0))+"|"+GXt_char20+"||||||"+(GXutil.dateCompare(GXutil.nullDate(), AV119TFAlbEnvMail) ? "" : localUtil.dtoc( AV120DDO_AlbEnvMailAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char18+"|"+GXt_char16+"|"+GXt_char15+"|||"+(GXutil.dateCompare(GXutil.nullDate(), AV39TFAlbHhfm) ? "" : localUtil.dtoc( AV41DDO_AlbHhfmAuxDate, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV16TFAlbProCod_To) ? "" : GXutil.str( AV16TFAlbProCod_To, 10, 0))+"|"+((0==AV18TFGuiRemCli_To) ? "" : GXutil.str( AV18TFGuiRemCli_To, 6, 0))+"||||||||||||||" ;
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
      AV10GridState.fromxml(AV14Session.getValue(AV123Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBPROCOD", "", !((0==AV15TFAlbProCod)&&(0==AV16TFAlbProCod_To)), (short)(0), GXutil.trim( GXutil.str( AV15TFAlbProCod, 10, 0)), GXutil.trim( GXutil.str( AV16TFAlbProCod_To, 10, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFGUIREMCLI", "", !((0==AV17TFGuiRemCli)&&(0==AV18TFGuiRemCli_To)), (short)(0), GXutil.trim( GXutil.str( AV17TFGuiRemCli, 6, 0)), GXutil.trim( GXutil.str( AV18TFGuiRemCli_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFGUIREMCLN", "", !(GXutil.strcmp("", AV19TFGuiRemCln)==0), (short)(0), AV19TFGuiRemCln, "", !(GXutil.strcmp("", AV20TFGuiRemCln_Sel)==0), AV20TFGuiRemCln_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBPROEST_SEL", "", !(AV62TFAlbProEst_Sels.size()==0), (short)(0), AV62TFAlbProEst_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBENVMAIL", "", !GXutil.dateCompare(GXutil.nullDate(), AV119TFAlbEnvMail), (short)(0), GXutil.trim( localUtil.ttoc( AV119TFAlbEnvMail, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBUSU", "", !(GXutil.strcmp("", AV35TFAlbUsu)==0), (short)(0), AV35TFAlbUsu, "", !(GXutil.strcmp("", AV36TFAlbUsu_Sel)==0), AV36TFAlbUsu_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBLIC", "", !(GXutil.strcmp("", AV57TFAlbLic)==0), (short)(0), AV57TFAlbLic, "", !(GXutil.strcmp("", AV58TFAlbLic_Sel)==0), AV58TFAlbLic_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBPDATCUD", "", !(GXutil.strcmp("", AV80TFAlbPdATCUD)==0), (short)(0), AV80TFAlbPdATCUD, "", !(GXutil.strcmp("", AV81TFAlbPdATCUD_Sel)==0), AV81TFAlbPdATCUD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBENVFTP_SEL", "", !(AV38TFAlbEnvFtp_Sels.size()==0), (short)(0), AV38TFAlbEnvFtp_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBPROAT_SEL", "", !(AV94TFAlbProAT_Sels.size()==0), (short)(0), AV94TFAlbProAT_Sels.toJSonString(false), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFALBHHFM", "", !GXutil.dateCompare(GXutil.nullDate(), AV39TFAlbHhfm), (short)(0), GXutil.trim( localUtil.ttoc( AV39TFAlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")), "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFFIRMA4DIG", "", !(GXutil.strcmp("", AV104TFFirma4dig)==0), (short)(0), AV104TFFirma4dig, "", !(GXutil.strcmp("", AV105TFFirma4dig_Sel)==0), AV105TFFirma4dig_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV50AlbProPri)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBPROPRI" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV50AlbProPri );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV55ContCod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&CONTCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV55ContCod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV56Albsec)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBSEC" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV56Albsec );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV123Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV123Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1" );
      AV14Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e1524X2( )
   {
      /* Prioridad_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV69Prioridad, "1") == 0 )
      {
         AV89AlbProfchto = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89AlbProfchto", localUtil.format(AV89AlbProfchto, "99/99/99"));
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S272 ();
         if (returnInSub) return;
      }
      else if ( GXutil.strcmp(AV69Prioridad, "0") == 0 )
      {
         AV89AlbProfchto = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89AlbProfchto", localUtil.format(AV89AlbProfchto, "99/99/99"));
         /* Execute user subroutine: 'SAVEFILTERFORM' */
         S272 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111FilterDocumentodeTransporteProduccion_1", AV111FilterDocumentodeTransporteProduccion_1);
   }

   public void e1624X2( )
   {
      /* Albprocod_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( (0==AV92AlbProCod) )
      {
         AV88AlbProfchfrom = GXutil.dadd(Gx_date,-(30)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProfchfrom", localUtil.format(AV88AlbProfchfrom, "99/99/99"));
         AV89AlbProfchto = Gx_date ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89AlbProfchto", localUtil.format(AV89AlbProfchto, "99/99/99"));
         AV87GuiRemCli = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87GuiRemCli), 6, 0));
      }
      else
      {
         AV88AlbProfchfrom = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProfchfrom", localUtil.format(AV88AlbProfchfrom, "99/99/99"));
         AV89AlbProfchto = GXutil.nullDate() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV89AlbProfchto", localUtil.format(AV89AlbProfchto, "99/99/99"));
         AV87GuiRemCli = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV87GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87GuiRemCli), 6, 0));
      }
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S272 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111FilterDocumentodeTransporteProduccion_1", AV111FilterDocumentodeTransporteProduccion_1);
   }

   public void e1724X2( )
   {
      /* Albmarcain_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S272 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111FilterDocumentodeTransporteProduccion_1", AV111FilterDocumentodeTransporteProduccion_1);
   }

   public void e1824X2( )
   {
      /* Guiremcli_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S272 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111FilterDocumentodeTransporteProduccion_1", AV111FilterDocumentodeTransporteProduccion_1);
   }

   public void e1924X2( )
   {
      /* Albprofchfrom_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S272 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111FilterDocumentodeTransporteProduccion_1", AV111FilterDocumentodeTransporteProduccion_1);
   }

   public void e2024X2( )
   {
      /* Albprofchto_Controlvaluechanged Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'SAVEFILTERFORM' */
      S272 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV111FilterDocumentodeTransporteProduccion_1", AV111FilterDocumentodeTransporteProduccion_1);
   }

   public void S282( )
   {
      /* 'DO EMAIL' Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", AV102PATHPDF)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Revisar contador WEBPDF, falta PATH ¡¡", ""));
      }
      else
      {
         if ( GXutil.strcmp(A5140AlbMarca, "A") == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Guia ANULADA¡¡¡", ""));
         }
         else
         {
            GXv_char21[0] = AV101CliMailGrE ;
            GXv_char19[0] = AV99climailpke ;
            GXv_char17[0] = AV100climailgr ;
            new app.documentotransporteproduccion.obtengomailcliente(remoteHandle, context).execute( AV52EmprCod, A1243GuiRemCli, GXv_char21, GXv_char19, GXv_char17) ;
            documentodetransporteproduccion_1ww_impl.this.AV101CliMailGrE = GXv_char21[0] ;
            documentodetransporteproduccion_1ww_impl.this.AV99climailpke = GXv_char19[0] ;
            documentodetransporteproduccion_1ww_impl.this.AV100climailgr = GXv_char17[0] ;
            if ( ( GXutil.strcmp(AV101CliMailGrE, "S") == 0 ) || ( GXutil.strcmp(AV99climailpke, "S") == 0 ) )
            {
               if ( (GXutil.strcmp("", AV100climailgr)==0) )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Cliente NO tiene mail", ""));
               }
               else
               {
               }
            }
         }
      }
   }

   public void S112( )
   {
      /* 'LOADFILTERFORM' Routine */
      returnInSub = false ;
      AV111FilterDocumentodeTransporteProduccion_1.fromJSonString(AV112WebSession.getValue(httpContext.getMessage( "FilterDocumentodeTransporteProduccion_1", "")), null);
      AV92AlbProCod = AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV92AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV92AlbProCod), 10, 0));
      AV98AlbMarcaIN = AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98AlbMarcaIN", AV98AlbMarcaIN);
      AV87GuiRemCli = AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV87GuiRemCli), 6, 0));
      AV88AlbProfchfrom = AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88AlbProfchfrom", localUtil.format(AV88AlbProfchfrom, "99/99/99"));
      AV89AlbProfchto = AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89AlbProfchto", localUtil.format(AV89AlbProfchto, "99/99/99"));
      AV69Prioridad = AV111FilterDocumentodeTransporteProduccion_1.getgxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69Prioridad", AV69Prioridad);
   }

   public void S272( )
   {
      /* 'SAVEFILTERFORM' Routine */
      returnInSub = false ;
      AV111FilterDocumentodeTransporteProduccion_1.setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Clicod( AV87GuiRemCli );
      AV111FilterDocumentodeTransporteProduccion_1.setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprocod( AV92AlbProCod );
      AV111FilterDocumentodeTransporteProduccion_1.setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albmarca( AV98AlbMarcaIN );
      AV111FilterDocumentodeTransporteProduccion_1.setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchfrom( AV88AlbProfchfrom );
      AV111FilterDocumentodeTransporteProduccion_1.setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Albprofchto( AV89AlbProfchto );
      AV111FilterDocumentodeTransporteProduccion_1.setgxTv_SdtFilterDocumentodeTransporteProduccion_1_Prioridad( AV69Prioridad );
      AV112WebSession.setValue(httpContext.getMessage( "FilterDocumentodeTransporteProduccion_1", ""), AV111FilterDocumentodeTransporteProduccion_1.toJSonString(false, true));
   }

   public void wb_table2_53_24X2( boolean wbgen )
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
         wb_table2_53_24X2e( true) ;
      }
      else
      {
         wb_table2_53_24X2e( false) ;
      }
   }

   public void wb_table1_17_24X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedactiongroup_actions_Internalname, tblTablemergedactiongroup_actions_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "BtnInsertDoc" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsert_Internalname, "gx.evt.setGridEvt("+GXutil.str( 64, 2, 0)+","+"null"+");", httpContext.getMessage( "GXM_insert", ""), bttBtninsert_Jsonclick, 5, httpContext.getMessage( "GXM_insert", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='DscTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableprioridad_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockprioridad_Internalname, "", "", "", lblTextblockprioridad_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavPrioridad.getInternalname(), httpContext.getMessage( "Prioridad", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_64_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPrioridad, cmbavPrioridad.getInternalname(), GXutil.rtrim( AV69Prioridad), 1, cmbavPrioridad.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavPrioridad.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_1WW.htm");
         cmbavPrioridad.setValue( GXutil.rtrim( AV69Prioridad) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrioridad.getInternalname(), "Values", cmbavPrioridad.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_24X2e( true) ;
      }
      else
      {
         wb_table1_17_24X2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV50AlbProPri = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50AlbProPri", AV50AlbProPri);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROPRI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50AlbProPri, ""))));
      AV55ContCod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55ContCod", AV55ContCod);
      AV56Albsec = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56Albsec", AV56Albsec);
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
      pa24X2( ) ;
      ws24X2( ) ;
      we24X2( ) ;
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
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116144787", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_1ww.js", "?202682116144788", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_642( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_64_idx );
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_64_idx ;
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_64_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_64_idx ;
      cmbAlbProEst.setInternalname( "ALBPROEST_"+sGXsfl_64_idx );
      cmbAlbMarca.setInternalname( "ALBMARCA_"+sGXsfl_64_idx );
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_64_idx ;
      edtAlbFecSal_Internalname = "ALBFECSAL_"+sGXsfl_64_idx ;
      edtAlbHorSal_Internalname = "ALBHORSAL_"+sGXsfl_64_idx ;
      edtAlbEnvMail_Internalname = "ALBENVMAIL_"+sGXsfl_64_idx ;
      edtAlbUsu_Internalname = "ALBUSU_"+sGXsfl_64_idx ;
      edtAlbLic_Internalname = "ALBLIC_"+sGXsfl_64_idx ;
      edtAlbPdATCUD_Internalname = "ALBPDATCUD_"+sGXsfl_64_idx ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP_"+sGXsfl_64_idx );
      cmbAlbProAT.setInternalname( "ALBPROAT_"+sGXsfl_64_idx );
      edtAlbHhfm_Internalname = "ALBHHFM_"+sGXsfl_64_idx ;
      edtFirma4dig_Internalname = "FIRMA4DIG_"+sGXsfl_64_idx ;
      edtAlbFmd_Internalname = "ALBFMD_"+sGXsfl_64_idx ;
      edtAlbSec_Internalname = "ALBSEC_"+sGXsfl_64_idx ;
      edtAlbProPri_Internalname = "ALBPROPRI_"+sGXsfl_64_idx ;
   }

   public void subsflControlProps_fel_642( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_64_fel_idx );
      edtAlbProCod_Internalname = "ALBPROCOD_"+sGXsfl_64_fel_idx ;
      edtGuiRemCli_Internalname = "GUIREMCLI_"+sGXsfl_64_fel_idx ;
      edtGuiRemCln_Internalname = "GUIREMCLN_"+sGXsfl_64_fel_idx ;
      cmbAlbProEst.setInternalname( "ALBPROEST_"+sGXsfl_64_fel_idx );
      cmbAlbMarca.setInternalname( "ALBMARCA_"+sGXsfl_64_fel_idx );
      edtAlbProfch_Internalname = "ALBPROFCH_"+sGXsfl_64_fel_idx ;
      edtAlbFecSal_Internalname = "ALBFECSAL_"+sGXsfl_64_fel_idx ;
      edtAlbHorSal_Internalname = "ALBHORSAL_"+sGXsfl_64_fel_idx ;
      edtAlbEnvMail_Internalname = "ALBENVMAIL_"+sGXsfl_64_fel_idx ;
      edtAlbUsu_Internalname = "ALBUSU_"+sGXsfl_64_fel_idx ;
      edtAlbLic_Internalname = "ALBLIC_"+sGXsfl_64_fel_idx ;
      edtAlbPdATCUD_Internalname = "ALBPDATCUD_"+sGXsfl_64_fel_idx ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP_"+sGXsfl_64_fel_idx );
      cmbAlbProAT.setInternalname( "ALBPROAT_"+sGXsfl_64_fel_idx );
      edtAlbHhfm_Internalname = "ALBHHFM_"+sGXsfl_64_fel_idx ;
      edtFirma4dig_Internalname = "FIRMA4DIG_"+sGXsfl_64_fel_idx ;
      edtAlbFmd_Internalname = "ALBFMD_"+sGXsfl_64_fel_idx ;
      edtAlbSec_Internalname = "ALBSEC_"+sGXsfl_64_fel_idx ;
      edtAlbProPri_Internalname = "ALBPROPRI_"+sGXsfl_64_fel_idx ;
   }

   public void sendrow_642( )
   {
      subsflControlProps_642( ) ;
      wb24X0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_64_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_64_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_64_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'',false,'"+sGXsfl_64_idx+"',64)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_64_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV49GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV49GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV49GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONS.CLICK."+sGXsfl_64_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactions.getColumnClass(),cmbavGridactions.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,65);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV49GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_64_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProCod_Internalname,GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A30AlbProCod), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbProCod_Columnclass,edtAlbProCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1243GuiRemCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtGuiRemCli_Columnclass,edtGuiRemCli_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtGuiRemCln_Internalname,GXutil.rtrim( A1244GuiRemCln),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtGuiRemCln_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtGuiRemCln_Columnclass,edtGuiRemCln_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROEST_" + sGXsfl_64_idx ;
            cmbAlbProEst.setName( GXCCtl );
            cmbAlbProEst.setWebtags( "" );
            cmbAlbProEst.addItem("0", httpContext.getMessage( "Pdte. Imprimir", ""), (short)(0));
            cmbAlbProEst.addItem("1", httpContext.getMessage( "Imprimido", ""), (short)(0));
            cmbAlbProEst.addItem("2", httpContext.getMessage( "Facturado", ""), (short)(0));
            if ( cmbAlbProEst.getItemCount() > 0 )
            {
               A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProEst,cmbAlbProEst.getInternalname(),GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)),Integer.valueOf(1),cmbAlbProEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbProEst.getColumnClass(),cmbAlbProEst.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProEst.setValue( GXutil.trim( GXutil.str( A33AlbProEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProEst.getInternalname(), "Values", cmbAlbProEst.ToJavascriptSource(), !bGXsfl_64_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbMarca.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBMARCA_" + sGXsfl_64_idx ;
            cmbAlbMarca.setName( GXCCtl );
            cmbAlbMarca.setWebtags( "" );
            cmbAlbMarca.addItem("", httpContext.getMessage( "Em preparação", ""), (short)(0));
            cmbAlbMarca.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
            cmbAlbMarca.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
            if ( cmbAlbMarca.getItemCount() > 0 )
            {
               A5140AlbMarca = cmbAlbMarca.getValidValue(A5140AlbMarca) ;
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbMarca,cmbAlbMarca.getInternalname(),GXutil.rtrim( A5140AlbMarca),Integer.valueOf(1),cmbAlbMarca.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbMarca.getColumnClass(),cmbAlbMarca.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbMarca.setValue( GXutil.rtrim( A5140AlbMarca) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbMarca.getInternalname(), "Values", cmbAlbMarca.ToJavascriptSource(), !bGXsfl_64_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProfch_Internalname,localUtil.format(A34AlbProfch, "99/99/99"),localUtil.format( A34AlbProfch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProfch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbProfch_Columnclass,edtAlbProfch_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbFecSal_Internalname,localUtil.format(A4023AlbFecSal, "99/99/99"),localUtil.format( A4023AlbFecSal, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbFecSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbFecSal_Columnclass,edtAlbFecSal_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHorSal_Internalname,GXutil.rtrim( A3865AlbHorSal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHorSal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbHorSal_Columnclass,edtAlbHorSal_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbEnvMail_Internalname,localUtil.ttoc( A14404AlbEnvMail, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A14404AlbEnvMail, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbEnvMail_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbEnvMail_Columnclass,edtAlbEnvMail_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbUsu_Internalname,GXutil.rtrim( A7098AlbUsu),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbUsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbUsu_Columnclass,edtAlbUsu_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbLic_Internalname,GXutil.rtrim( A7101AlbLic),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbLic_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbLic_Columnclass,edtAlbLic_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbPdATCUD_Internalname,GXutil.rtrim( A14069AlbPdATCUD),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbPdATCUD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbPdATCUD_Columnclass,edtAlbPdATCUD_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbEnvFtp.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBENVFTP_" + sGXsfl_64_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbEnvFtp,cmbAlbEnvFtp.getInternalname(),GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)),Integer.valueOf(1),cmbAlbEnvFtp.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbEnvFtp.getColumnClass(),cmbAlbEnvFtp.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbEnvFtp.setValue( GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbEnvFtp.getInternalname(), "Values", cmbAlbEnvFtp.ToJavascriptSource(), !bGXsfl_64_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbAlbProAT.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "ALBPROAT_" + sGXsfl_64_idx ;
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
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbAlbProAT,cmbAlbProAT.getInternalname(),GXutil.rtrim( A10765AlbProAT),Integer.valueOf(1),cmbAlbProAT.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbAlbProAT.getColumnClass(),cmbAlbProAT.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbAlbProAT.setValue( GXutil.rtrim( A10765AlbProAT) );
         httpContext.ajax_rsp_assign_prop("", false, cmbAlbProAT.getInternalname(), "Values", cmbAlbProAT.ToJavascriptSource(), !bGXsfl_64_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbHhfm_Internalname,localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A10019AlbHhfm, "99/99/99 99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbHhfm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtAlbHhfm_Columnclass,edtAlbHhfm_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFirma4dig_Internalname,GXutil.rtrim( A14362Firma4dig),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFirma4dig_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtFirma4dig_Columnclass,edtFirma4dig_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbFmd_Internalname,A10017AlbFmd,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbFmd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(255),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbSec_Internalname,GXutil.rtrim( A2242AlbSec),GXutil.rtrim( localUtil.format( A2242AlbSec, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbSec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbProPri_Internalname,GXutil.rtrim( A39AlbProPri),GXutil.rtrim( localUtil.format( A39AlbProPri, "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbProPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(64),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes24X2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_64_idx = ((subGrid_Islastpage==1)&&(nGXsfl_64_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_64_idx+1) ;
         sGXsfl_64_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_64_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_642( ) ;
      }
      /* End function sendrow_642 */
   }

   public void startgridcontrol64( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"64\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Guia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nome", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Data Mail", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Operador", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo AT", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "ATCUD", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Envio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A/M", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dia-Hora", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hash", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Secc.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV49GridActions, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactions.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactions.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbProCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbProCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtGuiRemCli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtGuiRemCli_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1244GuiRemCln));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtGuiRemCln_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtGuiRemCln_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A33AlbProEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbProEst.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbProEst.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5140AlbMarca));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbMarca.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbMarca.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A34AlbProfch, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbProfch_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbProfch_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A4023AlbFecSal, "99/99/99"));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbFecSal_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbFecSal_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3865AlbHorSal));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbHorSal_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbHorSal_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A14404AlbEnvMail, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbEnvMail_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbEnvMail_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7098AlbUsu));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbUsu_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbUsu_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A7101AlbLic));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbLic_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbLic_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14069AlbPdATCUD));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbPdATCUD_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbPdATCUD_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5805AlbEnvFtp, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbEnvFtp.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbEnvFtp.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A10765AlbProAT));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbAlbProAT.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbAlbProAT.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A10019AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtAlbHhfm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtAlbHhfm_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A14362Firma4dig));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtFirma4dig_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtFirma4dig_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", A10017AlbFmd);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A2242AlbSec));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A39AlbProPri));
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
      lblTextblockprioridad_Internalname = "TEXTBLOCKPRIORIDAD" ;
      cmbavPrioridad.setInternalname( "vPRIORIDAD" );
      divUnnamedtableprioridad_Internalname = "UNNAMEDTABLEPRIORIDAD" ;
      tblTablemergedactiongroup_actions_Internalname = "TABLEMERGEDACTIONGROUP_ACTIONS" ;
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      cmbavAlbmarcain.setInternalname( "vALBMARCAIN" );
      edtavGuiremcli_Internalname = "vGUIREMCLI" ;
      edtavAlbprofchfrom_Internalname = "vALBPROFCHFROM" ;
      edtavAlbprofchto_Internalname = "vALBPROFCHTO" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblTablerightheader_Internalname = "TABLERIGHTHEADER" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtAlbProCod_Internalname = "ALBPROCOD" ;
      edtGuiRemCli_Internalname = "GUIREMCLI" ;
      edtGuiRemCln_Internalname = "GUIREMCLN" ;
      cmbAlbProEst.setInternalname( "ALBPROEST" );
      cmbAlbMarca.setInternalname( "ALBMARCA" );
      edtAlbProfch_Internalname = "ALBPROFCH" ;
      edtAlbFecSal_Internalname = "ALBFECSAL" ;
      edtAlbHorSal_Internalname = "ALBHORSAL" ;
      edtAlbEnvMail_Internalname = "ALBENVMAIL" ;
      edtAlbUsu_Internalname = "ALBUSU" ;
      edtAlbLic_Internalname = "ALBLIC" ;
      edtAlbPdATCUD_Internalname = "ALBPDATCUD" ;
      cmbAlbEnvFtp.setInternalname( "ALBENVFTP" );
      cmbAlbProAT.setInternalname( "ALBPROAT" );
      edtAlbHhfm_Internalname = "ALBHHFM" ;
      edtFirma4dig_Internalname = "FIRMA4DIG" ;
      edtAlbFmd_Internalname = "ALBFMD" ;
      edtAlbSec_Internalname = "ALBSEC" ;
      edtAlbProPri_Internalname = "ALBPROPRI" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
      Grid_empowerer_Internalname = "GRID_EMPOWERER" ;
      edtavDdo_albenvmailauxdate_Internalname = "vDDO_ALBENVMAILAUXDATE" ;
      divDdo_albenvmailauxdates_Internalname = "DDO_ALBENVMAILAUXDATES" ;
      edtavDdo_albhhfmauxdate_Internalname = "vDDO_ALBHHFMAUXDATE" ;
      divDdo_albhhfmauxdates_Internalname = "DDO_ALBHHFMAUXDATES" ;
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
      edtAlbProPri_Jsonclick = "" ;
      edtAlbSec_Jsonclick = "" ;
      edtAlbFmd_Jsonclick = "" ;
      edtFirma4dig_Jsonclick = "" ;
      edtFirma4dig_Columnclass = "WWColumn" ;
      edtAlbHhfm_Jsonclick = "" ;
      edtAlbHhfm_Columnclass = "WWColumn" ;
      cmbAlbProAT.setJsonclick( "" );
      cmbAlbProAT.setColumnClass( "WWColumn hidden-xs" );
      cmbAlbEnvFtp.setJsonclick( "" );
      cmbAlbEnvFtp.setColumnClass( "WWColumn" );
      edtAlbPdATCUD_Jsonclick = "" ;
      edtAlbPdATCUD_Columnclass = "WWColumn" ;
      edtAlbLic_Jsonclick = "" ;
      edtAlbLic_Columnclass = "WWColumn hidden-xs" ;
      edtAlbUsu_Jsonclick = "" ;
      edtAlbUsu_Columnclass = "WWColumn" ;
      edtAlbEnvMail_Jsonclick = "" ;
      edtAlbEnvMail_Columnclass = "WWColumn" ;
      edtAlbHorSal_Jsonclick = "" ;
      edtAlbHorSal_Columnclass = "WWColumn" ;
      edtAlbFecSal_Jsonclick = "" ;
      edtAlbFecSal_Columnclass = "WWColumn" ;
      edtAlbProfch_Jsonclick = "" ;
      edtAlbProfch_Columnclass = "WWColumn" ;
      cmbAlbMarca.setJsonclick( "" );
      cmbAlbMarca.setColumnClass( "WWColumn" );
      cmbAlbProEst.setJsonclick( "" );
      cmbAlbProEst.setColumnClass( "WWColumn" );
      edtGuiRemCln_Jsonclick = "" ;
      edtGuiRemCln_Columnclass = "WWColumn" ;
      edtGuiRemCli_Jsonclick = "" ;
      edtGuiRemCli_Columnclass = "WWColumn" ;
      edtAlbProCod_Jsonclick = "" ;
      edtAlbProCod_Columnclass = "WWColumn" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      cmbavGridactions.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      cmbavPrioridad.setJsonclick( "" );
      cmbavPrioridad.setEnabled( 1 );
      edtFirma4dig_Columnheaderclass = "" ;
      edtAlbHhfm_Columnheaderclass = "" ;
      cmbAlbProAT.setColumnHeaderClass( "" );
      cmbAlbEnvFtp.setColumnHeaderClass( "" );
      edtAlbPdATCUD_Columnheaderclass = "" ;
      edtAlbLic_Columnheaderclass = "" ;
      edtAlbUsu_Columnheaderclass = "" ;
      edtAlbEnvMail_Columnheaderclass = "" ;
      edtAlbHorSal_Columnheaderclass = "" ;
      edtAlbFecSal_Columnheaderclass = "" ;
      edtAlbProfch_Columnheaderclass = "" ;
      cmbAlbMarca.setColumnHeaderClass( "" );
      cmbAlbProEst.setColumnHeaderClass( "" );
      edtGuiRemCln_Columnheaderclass = "" ;
      edtGuiRemCli_Columnheaderclass = "" ;
      edtAlbProCod_Columnheaderclass = "" ;
      cmbavGridactions.setColumnHeaderClass( "" );
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_albhhfmauxdate_Jsonclick = "" ;
      edtavDdo_albenvmailauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavAlbprofchto_Jsonclick = "" ;
      edtavAlbprofchto_Enabled = 1 ;
      edtavAlbprofchfrom_Jsonclick = "" ;
      edtavAlbprofchfrom_Enabled = 1 ;
      edtavGuiremcli_Jsonclick = "" ;
      edtavGuiremcli_Enabled = 1 ;
      cmbavAlbmarcain.setJsonclick( "" );
      cmbavAlbmarcain.setEnabled( 1 );
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;Salida;Salida;ENVIO;;AT;AT;AT;AT;AT;;AT;;" ;
      Ddo_grid_Datalistproc = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1WWGetFilterData" ;
      Ddo_grid_Datalistfixedvalues = "|||0:Pdte. Imprimir,1:Imprimido,2:Facturado|||||||||0:Não Enviada,3:Enviada a AT|A:Automatico,M:Manual,:s/d||" ;
      Ddo_grid_Allowmultipleselection = "|||T|||||||||T|T||" ;
      Ddo_grid_Datalisttype = "||Dynamic|FixedValues||||||Dynamic|Dynamic|Dynamic|FixedValues|FixedValues||Dynamic" ;
      Ddo_grid_Includedatalist = "||T|T||||||T|T|T|T|T||T" ;
      Ddo_grid_Filterisrange = "T|T||||||||||||||" ;
      Ddo_grid_Filtertype = "Numeric|Numeric|Character||||||Date|Character|Character|Character|||Date|Character" ;
      Ddo_grid_Includefilter = "T|T|T||||||T|T|T|T|||T|T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T|T|T|T|T|T|T|T|T|" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|" ;
      Ddo_grid_Columnids = "1:AlbProCod|2:GuiRemCli|3:GuiRemCln|4:AlbProEst|5:AlbMarca|6:AlbProfch|7:AlbFecSal|8:AlbHorSal|9:AlbEnvMail|10:AlbUsu|11:AlbLic|12:AlbPdATCUD|13:AlbEnvFtp|14:AlbProAT|15:AlbHhfm|16:Firma4dig" ;
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
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( " Documento de Transporte Produccion", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavPrioridad.setName( "vPRIORIDAD" );
      cmbavPrioridad.setWebtags( "" );
      cmbavPrioridad.addItem("9", httpContext.getMessage( "Definir Guia", ""), (short)(0));
      cmbavPrioridad.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavPrioridad.addItem("0", httpContext.getMessage( "Guia Transporte sem Encargos", ""), (short)(0));
      if ( cmbavPrioridad.getItemCount() > 0 )
      {
         AV69Prioridad = cmbavPrioridad.getValidValue(AV69Prioridad) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69Prioridad", AV69Prioridad);
      }
      cmbavAlbmarcain.setName( "vALBMARCAIN" );
      cmbavAlbmarcain.setWebtags( "" );
      cmbavAlbmarcain.addItem("T", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavAlbmarcain.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbavAlbmarcain.addItem("", httpContext.getMessage( "Em preparação", ""), (short)(0));
      cmbavAlbmarcain.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbavAlbmarcain.getItemCount() > 0 )
      {
         AV98AlbMarcaIN = cmbavAlbmarcain.getValidValue(AV98AlbMarcaIN) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98AlbMarcaIN", AV98AlbMarcaIN);
      }
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_64_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV49GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV49GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49GridActions), 4, 0));
      }
      GXCCtl = "ALBPROEST_" + sGXsfl_64_idx ;
      cmbAlbProEst.setName( GXCCtl );
      cmbAlbProEst.setWebtags( "" );
      cmbAlbProEst.addItem("0", httpContext.getMessage( "Pdte. Imprimir", ""), (short)(0));
      cmbAlbProEst.addItem("1", httpContext.getMessage( "Imprimido", ""), (short)(0));
      cmbAlbProEst.addItem("2", httpContext.getMessage( "Facturado", ""), (short)(0));
      if ( cmbAlbProEst.getItemCount() > 0 )
      {
         A33AlbProEst = (byte)(GXutil.lval( cmbAlbProEst.getValidValue(GXutil.trim( GXutil.str( A33AlbProEst, 1, 0))))) ;
      }
      GXCCtl = "ALBMARCA_" + sGXsfl_64_idx ;
      cmbAlbMarca.setName( GXCCtl );
      cmbAlbMarca.setWebtags( "" );
      cmbAlbMarca.addItem("", httpContext.getMessage( "Em preparação", ""), (short)(0));
      cmbAlbMarca.addItem("F", httpContext.getMessage( "Finalizado", ""), (short)(0));
      cmbAlbMarca.addItem("A", httpContext.getMessage( "Anulado", ""), (short)(0));
      if ( cmbAlbMarca.getItemCount() > 0 )
      {
         A5140AlbMarca = cmbAlbMarca.getValidValue(A5140AlbMarca) ;
      }
      GXCCtl = "ALBENVFTP_" + sGXsfl_64_idx ;
      cmbAlbEnvFtp.setName( GXCCtl );
      cmbAlbEnvFtp.setWebtags( "" );
      cmbAlbEnvFtp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbAlbEnvFtp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbAlbEnvFtp.getItemCount() > 0 )
      {
         A5805AlbEnvFtp = (byte)(GXutil.lval( cmbAlbEnvFtp.getValidValue(GXutil.trim( GXutil.str( A5805AlbEnvFtp, 1, 0))))) ;
      }
      GXCCtl = "ALBPROAT_" + sGXsfl_64_idx ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV50AlbProPri',fld:'vALBPROPRI',pic:'',hsh:true},{av:'AV10GridState',fld:'vGRIDSTATE',pic:'',hsh:true},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV18TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV19TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV20TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV62TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV119TFAlbEnvMail',fld:'vTFALBENVMAIL',pic:'99/99/99 99:99'},{av:'AV35TFAlbUsu',fld:'vTFALBUSU',pic:''},{av:'AV36TFAlbUsu_Sel',fld:'vTFALBUSU_SEL',pic:''},{av:'AV57TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV58TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV80TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV81TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV38TFAlbEnvFtp_Sels',fld:'vTFALBENVFTP_SELS',pic:''},{av:'AV94TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV39TFAlbHhfm',fld:'vTFALBHHFM',pic:'99/99/99 99:99'},{av:'AV104TFFirma4dig',fld:'vTFFIRMA4DIG',pic:''},{av:'AV105TFFirma4dig_Sel',fld:'vTFFIRMA4DIG_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV55ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV56Albsec',fld:'vALBSEC',pic:'@!'},{av:'AV67FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV108moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV106Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV102PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV118TextoCopia',fld:'vTEXTOCOPIA',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV68LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV47GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV48GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtAlbProCod_Columnheaderclass',ctrl:'ALBPROCOD',prop:'Columnheaderclass'},{av:'edtGuiRemCli_Columnheaderclass',ctrl:'GUIREMCLI',prop:'Columnheaderclass'},{av:'edtGuiRemCln_Columnheaderclass',ctrl:'GUIREMCLN',prop:'Columnheaderclass'},{av:'cmbAlbProEst'},{av:'cmbAlbMarca'},{av:'edtAlbProfch_Columnheaderclass',ctrl:'ALBPROFCH',prop:'Columnheaderclass'},{av:'edtAlbFecSal_Columnheaderclass',ctrl:'ALBFECSAL',prop:'Columnheaderclass'},{av:'edtAlbHorSal_Columnheaderclass',ctrl:'ALBHORSAL',prop:'Columnheaderclass'},{av:'edtAlbEnvMail_Columnheaderclass',ctrl:'ALBENVMAIL',prop:'Columnheaderclass'},{av:'edtAlbUsu_Columnheaderclass',ctrl:'ALBUSU',prop:'Columnheaderclass'},{av:'edtAlbLic_Columnheaderclass',ctrl:'ALBLIC',prop:'Columnheaderclass'},{av:'edtAlbPdATCUD_Columnheaderclass',ctrl:'ALBPDATCUD',prop:'Columnheaderclass'},{av:'cmbAlbEnvFtp'},{av:'cmbAlbProAT'},{av:'edtAlbHhfm_Columnheaderclass',ctrl:'ALBHHFM',prop:'Columnheaderclass'},{av:'edtFirma4dig_Columnheaderclass',ctrl:'FIRMA4DIG',prop:'Columnheaderclass'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:'',hsh:true}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1124X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50AlbProPri',fld:'vALBPROPRI',pic:'',hsh:true},{av:'AV10GridState',fld:'vGRIDSTATE',pic:'',hsh:true},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV18TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV19TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV20TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV62TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV119TFAlbEnvMail',fld:'vTFALBENVMAIL',pic:'99/99/99 99:99'},{av:'AV35TFAlbUsu',fld:'vTFALBUSU',pic:''},{av:'AV36TFAlbUsu_Sel',fld:'vTFALBUSU_SEL',pic:''},{av:'AV57TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV58TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV80TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV81TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV38TFAlbEnvFtp_Sels',fld:'vTFALBENVFTP_SELS',pic:''},{av:'AV94TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV39TFAlbHhfm',fld:'vTFALBHHFM',pic:'99/99/99 99:99'},{av:'AV104TFFirma4dig',fld:'vTFFIRMA4DIG',pic:''},{av:'AV105TFFirma4dig_Sel',fld:'vTFFIRMA4DIG_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV55ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV56Albsec',fld:'vALBSEC',pic:'@!'},{av:'AV67FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV108moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV106Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV102PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV118TextoCopia',fld:'vTEXTOCOPIA',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1224X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50AlbProPri',fld:'vALBPROPRI',pic:'',hsh:true},{av:'AV10GridState',fld:'vGRIDSTATE',pic:'',hsh:true},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV18TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV19TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV20TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV62TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV119TFAlbEnvMail',fld:'vTFALBENVMAIL',pic:'99/99/99 99:99'},{av:'AV35TFAlbUsu',fld:'vTFALBUSU',pic:''},{av:'AV36TFAlbUsu_Sel',fld:'vTFALBUSU_SEL',pic:''},{av:'AV57TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV58TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV80TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV81TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV38TFAlbEnvFtp_Sels',fld:'vTFALBENVFTP_SELS',pic:''},{av:'AV94TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV39TFAlbHhfm',fld:'vTFALBHHFM',pic:'99/99/99 99:99'},{av:'AV104TFFirma4dig',fld:'vTFFIRMA4DIG',pic:''},{av:'AV105TFFirma4dig_Sel',fld:'vTFFIRMA4DIG_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV55ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV56Albsec',fld:'vALBSEC',pic:'@!'},{av:'AV67FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV108moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV106Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV102PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV118TextoCopia',fld:'vTEXTOCOPIA',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1324X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50AlbProPri',fld:'vALBPROPRI',pic:'',hsh:true},{av:'AV10GridState',fld:'vGRIDSTATE',pic:'',hsh:true},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV18TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV19TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV20TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV62TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV119TFAlbEnvMail',fld:'vTFALBENVMAIL',pic:'99/99/99 99:99'},{av:'AV35TFAlbUsu',fld:'vTFALBUSU',pic:''},{av:'AV36TFAlbUsu_Sel',fld:'vTFALBUSU_SEL',pic:''},{av:'AV57TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV58TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV80TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV81TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV38TFAlbEnvFtp_Sels',fld:'vTFALBENVFTP_SELS',pic:''},{av:'AV94TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV39TFAlbHhfm',fld:'vTFALBHHFM',pic:'99/99/99 99:99'},{av:'AV104TFFirma4dig',fld:'vTFFIRMA4DIG',pic:''},{av:'AV105TFFirma4dig_Sel',fld:'vTFFIRMA4DIG_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV55ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV56Albsec',fld:'vALBSEC',pic:'@!'},{av:'AV67FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV108moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV106Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV102PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV118TextoCopia',fld:'vTEXTOCOPIA',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV104TFFirma4dig',fld:'vTFFIRMA4DIG',pic:''},{av:'AV105TFFirma4dig_Sel',fld:'vTFFIRMA4DIG_SEL',pic:''},{av:'AV39TFAlbHhfm',fld:'vTFALBHHFM',pic:'99/99/99 99:99'},{av:'AV93TFAlbProAT_SelsJson',fld:'vTFALBPROAT_SELSJSON',pic:''},{av:'AV94TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV37TFAlbEnvFtp_SelsJson',fld:'vTFALBENVFTP_SELSJSON',pic:''},{av:'AV38TFAlbEnvFtp_Sels',fld:'vTFALBENVFTP_SELS',pic:''},{av:'AV80TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV81TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV57TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV58TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV35TFAlbUsu',fld:'vTFALBUSU',pic:''},{av:'AV36TFAlbUsu_Sel',fld:'vTFALBUSU_SEL',pic:''},{av:'AV119TFAlbEnvMail',fld:'vTFALBENVMAIL',pic:'99/99/99 99:99'},{av:'AV61TFAlbProEst_SelsJson',fld:'vTFALBPROEST_SELSJSON',pic:''},{av:'AV62TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV19TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV20TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV17TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV18TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2324X2',iparms:[{av:'cmbAlbMarca'},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:'',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV49GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'edtAlbProCod_Columnclass',ctrl:'ALBPROCOD',prop:'Columnclass'},{av:'edtGuiRemCli_Columnclass',ctrl:'GUIREMCLI',prop:'Columnclass'},{av:'edtGuiRemCln_Columnclass',ctrl:'GUIREMCLN',prop:'Columnclass'},{av:'cmbAlbProEst'},{av:'cmbAlbMarca'},{av:'edtAlbProfch_Columnclass',ctrl:'ALBPROFCH',prop:'Columnclass'},{av:'edtAlbFecSal_Columnclass',ctrl:'ALBFECSAL',prop:'Columnclass'},{av:'edtAlbHorSal_Columnclass',ctrl:'ALBHORSAL',prop:'Columnclass'},{av:'edtAlbEnvMail_Columnclass',ctrl:'ALBENVMAIL',prop:'Columnclass'},{av:'edtAlbUsu_Columnclass',ctrl:'ALBUSU',prop:'Columnclass'},{av:'edtAlbLic_Columnclass',ctrl:'ALBLIC',prop:'Columnclass'},{av:'edtAlbPdATCUD_Columnclass',ctrl:'ALBPDATCUD',prop:'Columnclass'},{av:'cmbAlbEnvFtp'},{av:'cmbAlbProAT'},{av:'edtAlbHhfm_Columnclass',ctrl:'ALBHHFM',prop:'Columnclass'},{av:'edtFirma4dig_Columnclass',ctrl:'FIRMA4DIG',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e2424X2',iparms:[{av:'cmbavGridactions'},{av:'AV49GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50AlbProPri',fld:'vALBPROPRI',pic:'',hsh:true},{av:'AV10GridState',fld:'vGRIDSTATE',pic:'',hsh:true},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV18TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV19TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV20TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV62TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV119TFAlbEnvMail',fld:'vTFALBENVMAIL',pic:'99/99/99 99:99'},{av:'AV35TFAlbUsu',fld:'vTFALBUSU',pic:''},{av:'AV36TFAlbUsu_Sel',fld:'vTFALBUSU_SEL',pic:''},{av:'AV57TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV58TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV80TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV81TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV38TFAlbEnvFtp_Sels',fld:'vTFALBENVFTP_SELS',pic:''},{av:'AV94TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV39TFAlbHhfm',fld:'vTFALBHHFM',pic:'99/99/99 99:99'},{av:'AV104TFFirma4dig',fld:'vTFFIRMA4DIG',pic:''},{av:'AV105TFFirma4dig_Sel',fld:'vTFFIRMA4DIG_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV55ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV56Albsec',fld:'vALBSEC',pic:'@!'},{av:'AV67FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV108moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV106Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV102PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV118TextoCopia',fld:'vTEXTOCOPIA',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbAlbProEst'},{av:'A33AlbProEst',fld:'ALBPROEST',pic:'9',hsh:true},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'cmbAlbEnvFtp'},{av:'A5805AlbEnvFtp',fld:'ALBENVFTP',pic:'9',hsh:true},{av:'cmbAlbMarca'},{av:'A5140AlbMarca',fld:'ALBMARCA',pic:'',hsh:true},{av:'A2242AlbSec',fld:'ALBSEC',pic:'@!',hsh:true},{av:'A4023AlbFecSal',fld:'ALBFECSAL',pic:'',hsh:true},{av:'A3865AlbHorSal',fld:'ALBHORSAL',pic:'',hsh:true},{av:'A10019AlbHhfm',fld:'ALBHHFM',pic:'99/99/99 99:99'},{av:'AV70Cadena',fld:'vCADENA',pic:''},{av:'AV78Hash',fld:'vHASH',pic:''},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A1244GuiRemCln',fld:'GUIREMCLN',pic:''},{av:'A34AlbProfch',fld:'ALBPROFCH',pic:'',hsh:true},{av:'AV75ok',fld:'vOK',pic:''},{av:'AV79AlbProsal',fld:'vALBPROSAL',pic:'99/99/99 99:99'}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV49GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV55ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV79AlbProsal',fld:'vALBPROSAL',pic:'99/99/99 99:99'},{av:'AV78Hash',fld:'vHASH',pic:''},{av:'AV70Cadena',fld:'vCADENA',pic:''},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A39AlbProPri',fld:'ALBPROPRI',pic:'9'},{av:'A10019AlbHhfm',fld:'ALBHHFM',pic:'99/99/99 99:99'},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'AV75ok',fld:'vOK',pic:''},{av:'AV68LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV47GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV48GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'edtAlbProCod_Columnheaderclass',ctrl:'ALBPROCOD',prop:'Columnheaderclass'},{av:'edtGuiRemCli_Columnheaderclass',ctrl:'GUIREMCLI',prop:'Columnheaderclass'},{av:'edtGuiRemCln_Columnheaderclass',ctrl:'GUIREMCLN',prop:'Columnheaderclass'},{av:'cmbAlbProEst'},{av:'cmbAlbMarca'},{av:'edtAlbProfch_Columnheaderclass',ctrl:'ALBPROFCH',prop:'Columnheaderclass'},{av:'edtAlbFecSal_Columnheaderclass',ctrl:'ALBFECSAL',prop:'Columnheaderclass'},{av:'edtAlbHorSal_Columnheaderclass',ctrl:'ALBHORSAL',prop:'Columnheaderclass'},{av:'edtAlbEnvMail_Columnheaderclass',ctrl:'ALBENVMAIL',prop:'Columnheaderclass'},{av:'edtAlbUsu_Columnheaderclass',ctrl:'ALBUSU',prop:'Columnheaderclass'},{av:'edtAlbLic_Columnheaderclass',ctrl:'ALBLIC',prop:'Columnheaderclass'},{av:'edtAlbPdATCUD_Columnheaderclass',ctrl:'ALBPDATCUD',prop:'Columnheaderclass'},{av:'cmbAlbEnvFtp'},{av:'cmbAlbProAT'},{av:'edtAlbHhfm_Columnheaderclass',ctrl:'ALBHHFM',prop:'Columnheaderclass'},{av:'edtFirma4dig_Columnheaderclass',ctrl:'FIRMA4DIG',prop:'Columnheaderclass'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:'',hsh:true}]}");
      setEventMetadata("'DOINSERT'","{handler:'e1424X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV52EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50AlbProPri',fld:'vALBPROPRI',pic:'',hsh:true},{av:'AV10GridState',fld:'vGRIDSTATE',pic:'',hsh:true},{av:'AV15TFAlbProCod',fld:'vTFALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV16TFAlbProCod_To',fld:'vTFALBPROCOD_TO',pic:'ZZZZZZZZZ9'},{av:'AV17TFGuiRemCli',fld:'vTFGUIREMCLI',pic:'ZZZZZ9'},{av:'AV18TFGuiRemCli_To',fld:'vTFGUIREMCLI_TO',pic:'ZZZZZ9'},{av:'AV19TFGuiRemCln',fld:'vTFGUIREMCLN',pic:''},{av:'AV20TFGuiRemCln_Sel',fld:'vTFGUIREMCLN_SEL',pic:''},{av:'AV62TFAlbProEst_Sels',fld:'vTFALBPROEST_SELS',pic:''},{av:'AV119TFAlbEnvMail',fld:'vTFALBENVMAIL',pic:'99/99/99 99:99'},{av:'AV35TFAlbUsu',fld:'vTFALBUSU',pic:''},{av:'AV36TFAlbUsu_Sel',fld:'vTFALBUSU_SEL',pic:''},{av:'AV57TFAlbLic',fld:'vTFALBLIC',pic:''},{av:'AV58TFAlbLic_Sel',fld:'vTFALBLIC_SEL',pic:''},{av:'AV80TFAlbPdATCUD',fld:'vTFALBPDATCUD',pic:''},{av:'AV81TFAlbPdATCUD_Sel',fld:'vTFALBPDATCUD_SEL',pic:''},{av:'AV38TFAlbEnvFtp_Sels',fld:'vTFALBENVFTP_SELS',pic:''},{av:'AV94TFAlbProAT_Sels',fld:'vTFALBPROAT_SELS',pic:''},{av:'AV39TFAlbHhfm',fld:'vTFALBHHFM',pic:'99/99/99 99:99'},{av:'AV104TFFirma4dig',fld:'vTFFIRMA4DIG',pic:''},{av:'AV105TFFirma4dig_Sel',fld:'vTFFIRMA4DIG_SEL',pic:''},{av:'AV123Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV55ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV56Albsec',fld:'vALBSEC',pic:'@!'},{av:'AV67FirmaD',fld:'vFIRMAD',pic:'ZZZ9',hsh:true},{av:'AV108moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV106Messages_json',fld:'vMESSAGES_JSON',pic:'',hsh:true},{av:'AV102PATHPDF',fld:'vPATHPDF',pic:'',hsh:true},{av:'AV118TextoCopia',fld:'vTEXTOCOPIA',pic:'',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("'DOINSERT'",",oparms:[{av:'AV56Albsec',fld:'vALBSEC',pic:'@!'},{av:'AV55ContCod',fld:'vCONTCOD',pic:'@!'},{av:'AV68LoadGridData',fld:'vLOADGRIDDATA',pic:''},{av:'Gridpaginationbar_Emptygridcaption',ctrl:'GRIDPAGINATIONBAR',prop:'EmptyGridCaption'},{av:'AV47GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV48GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactions'},{av:'edtAlbProCod_Columnheaderclass',ctrl:'ALBPROCOD',prop:'Columnheaderclass'},{av:'edtGuiRemCli_Columnheaderclass',ctrl:'GUIREMCLI',prop:'Columnheaderclass'},{av:'edtGuiRemCln_Columnheaderclass',ctrl:'GUIREMCLN',prop:'Columnheaderclass'},{av:'cmbAlbProEst'},{av:'cmbAlbMarca'},{av:'edtAlbProfch_Columnheaderclass',ctrl:'ALBPROFCH',prop:'Columnheaderclass'},{av:'edtAlbFecSal_Columnheaderclass',ctrl:'ALBFECSAL',prop:'Columnheaderclass'},{av:'edtAlbHorSal_Columnheaderclass',ctrl:'ALBHORSAL',prop:'Columnheaderclass'},{av:'edtAlbEnvMail_Columnheaderclass',ctrl:'ALBENVMAIL',prop:'Columnheaderclass'},{av:'edtAlbUsu_Columnheaderclass',ctrl:'ALBUSU',prop:'Columnheaderclass'},{av:'edtAlbLic_Columnheaderclass',ctrl:'ALBLIC',prop:'Columnheaderclass'},{av:'edtAlbPdATCUD_Columnheaderclass',ctrl:'ALBPDATCUD',prop:'Columnheaderclass'},{av:'cmbAlbEnvFtp'},{av:'cmbAlbProAT'},{av:'edtAlbHhfm_Columnheaderclass',ctrl:'ALBHHFM',prop:'Columnheaderclass'},{av:'edtFirma4dig_Columnheaderclass',ctrl:'FIRMA4DIG',prop:'Columnheaderclass'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:'',hsh:true}]}");
      setEventMetadata("VPRIORIDAD.CONTROLVALUECHANGED","{handler:'e1524X2',iparms:[{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''},{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''}]");
      setEventMetadata("VPRIORIDAD.CONTROLVALUECHANGED",",oparms:[{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''}]}");
      setEventMetadata("VALBPROCOD.CONTROLVALUECHANGED","{handler:'e1624X2',iparms:[{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''}]");
      setEventMetadata("VALBPROCOD.CONTROLVALUECHANGED",",oparms:[{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''}]}");
      setEventMetadata("VALBMARCAIN.CONTROLVALUECHANGED","{handler:'e1724X2',iparms:[{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''},{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''}]");
      setEventMetadata("VALBMARCAIN.CONTROLVALUECHANGED",",oparms:[{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''}]}");
      setEventMetadata("VGUIREMCLI.CONTROLVALUECHANGED","{handler:'e1824X2',iparms:[{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''},{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''}]");
      setEventMetadata("VGUIREMCLI.CONTROLVALUECHANGED",",oparms:[{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''}]}");
      setEventMetadata("VALBPROFCHFROM.CONTROLVALUECHANGED","{handler:'e1924X2',iparms:[{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''},{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''}]");
      setEventMetadata("VALBPROFCHFROM.CONTROLVALUECHANGED",",oparms:[{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''}]}");
      setEventMetadata("VALBPROFCHTO.CONTROLVALUECHANGED","{handler:'e2024X2',iparms:[{av:'AV87GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''},{av:'AV92AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'cmbavAlbmarcain'},{av:'AV98AlbMarcaIN',fld:'vALBMARCAIN',pic:''},{av:'AV88AlbProfchfrom',fld:'vALBPROFCHFROM',pic:''},{av:'AV89AlbProfchto',fld:'vALBPROFCHTO',pic:''},{av:'cmbavPrioridad'},{av:'AV69Prioridad',fld:'vPRIORIDAD',pic:''}]");
      setEventMetadata("VALBPROFCHTO.CONTROLVALUECHANGED",",oparms:[{av:'AV111FilterDocumentodeTransporteProduccion_1',fld:'vFILTERDOCUMENTODETRANSPORTEPRODUCCION_1',pic:''}]}");
      setEventMetadata("VALID_GUIREMCLI","{handler:'valid_Guiremcli',iparms:[]");
      setEventMetadata("VALID_GUIREMCLI",",oparms:[]}");
      setEventMetadata("VALID_ALBFMD","{handler:'valid_Albfmd',iparms:[]");
      setEventMetadata("VALID_ALBFMD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albpropri',iparms:[]");
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
      wcpOAV50AlbProPri = "" ;
      wcpOAV55ContCod = "" ;
      wcpOAV56Albsec = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV50AlbProPri = "" ;
      AV55ContCod = "" ;
      AV56Albsec = "" ;
      AV98AlbMarcaIN = "" ;
      AV88AlbProfchfrom = GXutil.nullDate() ;
      AV89AlbProfchto = GXutil.nullDate() ;
      AV52EmprCod = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV19TFGuiRemCln = "" ;
      AV20TFGuiRemCln_Sel = "" ;
      AV62TFAlbProEst_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV119TFAlbEnvMail = GXutil.resetTime( GXutil.nullDate() );
      AV35TFAlbUsu = "" ;
      AV36TFAlbUsu_Sel = "" ;
      AV57TFAlbLic = "" ;
      AV58TFAlbLic_Sel = "" ;
      AV80TFAlbPdATCUD = "" ;
      AV81TFAlbPdATCUD_Sel = "" ;
      AV38TFAlbEnvFtp_Sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV94TFAlbProAT_Sels = new GXSimpleCollection<String>(String.class, "internal", "");
      AV39TFAlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV104TFFirma4dig = "" ;
      AV105TFFirma4dig_Sel = "" ;
      AV123Pgmname = "" ;
      AV106Messages_json = "" ;
      AV102PATHPDF = "" ;
      AV118TextoCopia = "" ;
      Gx_date = GXutil.nullDate() ;
      AV69Prioridad = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV45DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV70Cadena = "" ;
      AV78Hash = "" ;
      AV79AlbProsal = GXutil.resetTime( GXutil.nullDate() );
      AV111FilterDocumentodeTransporteProduccion_1 = new app.documentotransporteproduccion.SdtFilterDocumentodeTransporteProduccion_1(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV120DDO_AlbEnvMailAuxDate = GXutil.nullDate() ;
      AV41DDO_AlbHhfmAuxDate = GXutil.nullDate() ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A1244GuiRemCln = "" ;
      A5140AlbMarca = "" ;
      A34AlbProfch = GXutil.nullDate() ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A3865AlbHorSal = "" ;
      A14404AlbEnvMail = GXutil.resetTime( GXutil.nullDate() );
      A7098AlbUsu = "" ;
      A7101AlbLic = "" ;
      A14069AlbPdATCUD = "" ;
      A10765AlbProAT = "" ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A14362Firma4dig = "" ;
      A10017AlbFmd = "" ;
      A2242AlbSec = "" ;
      A39AlbProPri = "" ;
      AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels = new GXSimpleCollection<Byte>(Byte.class, "internal", "");
      AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels = new GXSimpleCollection<String>(String.class, "internal", "");
      scmdbuf = "" ;
      lV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = "" ;
      lV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = "" ;
      lV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = "" ;
      lV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = "" ;
      lV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = "" ;
      AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel = "" ;
      AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln = "" ;
      AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail = GXutil.resetTime( GXutil.nullDate() );
      AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel = "" ;
      AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu = "" ;
      AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel = "" ;
      AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic = "" ;
      AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel = "" ;
      AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud = "" ;
      AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm = GXutil.resetTime( GXutil.nullDate() );
      AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel = "" ;
      AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig = "" ;
      A396EmprCod = "" ;
      H024X2_A1253EmprGuiRem = new String[] {""} ;
      H024X2_A396EmprCod = new String[] {""} ;
      H024X2_A39AlbProPri = new String[] {""} ;
      H024X2_A2242AlbSec = new String[] {""} ;
      H024X2_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      H024X2_A10765AlbProAT = new String[] {""} ;
      H024X2_A5805AlbEnvFtp = new byte[1] ;
      H024X2_A14069AlbPdATCUD = new String[] {""} ;
      H024X2_A7101AlbLic = new String[] {""} ;
      H024X2_A7098AlbUsu = new String[] {""} ;
      H024X2_A14404AlbEnvMail = new java.util.Date[] {GXutil.nullDate()} ;
      H024X2_A3865AlbHorSal = new String[] {""} ;
      H024X2_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H024X2_A34AlbProfch = new java.util.Date[] {GXutil.nullDate()} ;
      H024X2_A5140AlbMarca = new String[] {""} ;
      H024X2_A33AlbProEst = new byte[1] ;
      H024X2_A1244GuiRemCln = new String[] {""} ;
      H024X2_A1243GuiRemCli = new int[1] ;
      H024X2_A30AlbProCod = new long[1] ;
      H024X2_A10017AlbFmd = new String[] {""} ;
      H024X2_n10017AlbFmd = new boolean[] {false} ;
      A1253EmprGuiRem = "" ;
      H024X3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV51Station = "" ;
      AV53EmprNom = "" ;
      AV54UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV61TFAlbProEst_SelsJson = "" ;
      AV37TFAlbEnvFtp_SelsJson = "" ;
      AV93TFAlbProAT_SelsJson = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      Gx_msg = "" ;
      AV109albprosalalfa = "" ;
      AV110texto = "" ;
      GXv_int10 = new long[1] ;
      GXv_int8 = new byte[1] ;
      AV107CliFacMtsP = "" ;
      GXv_int11 = new int[1] ;
      AV116Path = "" ;
      AV96msg_control = "" ;
      AV71firma = "" ;
      AV76Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXv_objcol_SdtMessages_Message12 = new GXBaseCollection[1] ;
      GXv_boolean13 = new boolean[1] ;
      AV77Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      AV14Session = httpContext.getWebSession();
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXt_char20 = "" ;
      GXt_char18 = "" ;
      GXt_char16 = "" ;
      GXt_char15 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV101CliMailGrE = "" ;
      GXv_char21 = new String[1] ;
      AV99climailpke = "" ;
      GXv_char19 = new String[1] ;
      AV100climailgr = "" ;
      GXv_char17 = new String[1] ;
      AV112WebSession = httpContext.getWebSession();
      bttBtninsert_Jsonclick = "" ;
      lblTextblockprioridad_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_1ww__default(),
         new Object[] {
             new Object[] {
            H024X2_A1253EmprGuiRem, H024X2_A396EmprCod, H024X2_A39AlbProPri, H024X2_A2242AlbSec, H024X2_A10019AlbHhfm, H024X2_A10765AlbProAT, H024X2_A5805AlbEnvFtp, H024X2_A14069AlbPdATCUD, H024X2_A7101AlbLic, H024X2_A7098AlbUsu,
            H024X2_A14404AlbEnvMail, H024X2_A3865AlbHorSal, H024X2_A4023AlbFecSal, H024X2_A34AlbProfch, H024X2_A5140AlbMarca, H024X2_A33AlbProEst, H024X2_A1244GuiRemCln, H024X2_A1243GuiRemCli, H024X2_A30AlbProCod, H024X2_A10017AlbFmd,
            H024X2_n10017AlbFmd
            }
            , new Object[] {
            H024X3_AGRID_nRecordCount
            }
         }
      );
      Gx_date = GXutil.today( ) ;
      AV123Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1WW" ;
      /* GeneXus formulas. */
      Gx_date = GXutil.today( ) ;
      AV123Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_1WW" ;
      Gx_err = (short)(0) ;
      cmbavPrioridad.setEnabled( 0 );
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte A33AlbProEst ;
   private byte A5805AlbEnvFtp ;
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
   private short AV12OrderedBy ;
   private short AV67FirmaD ;
   private short AV108moda21 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV49GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV95hashAnt ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_64 ;
   private int nGXsfl_64_idx=1 ;
   private int AV87GuiRemCli ;
   private int AV17TFGuiRemCli ;
   private int AV18TFGuiRemCli_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbprocod_Enabled ;
   private int edtavGuiremcli_Enabled ;
   private int edtavAlbprofchfrom_Enabled ;
   private int edtavAlbprofchto_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A1243GuiRemCli ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size ;
   private int AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size ;
   private int AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size ;
   private int AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli ;
   private int AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to ;
   private int AV46PageToGo ;
   private int GXv_int11[] ;
   private int AV145GXV1 ;
   private int AV146GXV2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV92AlbProCod ;
   private long AV15TFAlbProCod ;
   private long AV16TFAlbProCod_To ;
   private long AV47GridCurrentPage ;
   private long AV48GridPageCount ;
   private long A30AlbProCod ;
   private long GRID_nCurrentRecord ;
   private long AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod ;
   private long AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to ;
   private long GRID_nRecordCount ;
   private long GXv_int10[] ;
   private String wcpOAV50AlbProPri ;
   private String wcpOAV55ContCod ;
   private String wcpOAV56Albsec ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV50AlbProPri ;
   private String AV55ContCod ;
   private String AV56Albsec ;
   private String sGXsfl_64_idx="0001" ;
   private String AV98AlbMarcaIN ;
   private String AV52EmprCod ;
   private String AV19TFGuiRemCln ;
   private String AV20TFGuiRemCln_Sel ;
   private String AV35TFAlbUsu ;
   private String AV36TFAlbUsu_Sel ;
   private String AV57TFAlbLic ;
   private String AV58TFAlbLic_Sel ;
   private String AV80TFAlbPdATCUD ;
   private String AV81TFAlbPdATCUD_Sel ;
   private String AV104TFFirma4dig ;
   private String AV105TFFirma4dig_Sel ;
   private String AV123Pgmname ;
   private String AV102PATHPDF ;
   private String AV69Prioridad ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String TempTags ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavGuiremcli_Internalname ;
   private String edtavGuiremcli_Jsonclick ;
   private String edtavAlbprofchfrom_Internalname ;
   private String edtavAlbprofchfrom_Jsonclick ;
   private String edtavAlbprofchto_Internalname ;
   private String edtavAlbprofchto_Jsonclick ;
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
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_albenvmailauxdates_Internalname ;
   private String edtavDdo_albenvmailauxdate_Internalname ;
   private String edtavDdo_albenvmailauxdate_Jsonclick ;
   private String divDdo_albhhfmauxdates_Internalname ;
   private String edtavDdo_albhhfmauxdate_Internalname ;
   private String edtavDdo_albhhfmauxdate_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbProCod_Internalname ;
   private String edtGuiRemCli_Internalname ;
   private String A1244GuiRemCln ;
   private String edtGuiRemCln_Internalname ;
   private String A5140AlbMarca ;
   private String edtAlbProfch_Internalname ;
   private String edtAlbFecSal_Internalname ;
   private String A3865AlbHorSal ;
   private String edtAlbHorSal_Internalname ;
   private String edtAlbEnvMail_Internalname ;
   private String A7098AlbUsu ;
   private String edtAlbUsu_Internalname ;
   private String A7101AlbLic ;
   private String edtAlbLic_Internalname ;
   private String A14069AlbPdATCUD ;
   private String edtAlbPdATCUD_Internalname ;
   private String A10765AlbProAT ;
   private String edtAlbHhfm_Internalname ;
   private String A14362Firma4dig ;
   private String edtFirma4dig_Internalname ;
   private String edtAlbFmd_Internalname ;
   private String A2242AlbSec ;
   private String edtAlbSec_Internalname ;
   private String A39AlbProPri ;
   private String edtAlbProPri_Internalname ;
   private String scmdbuf ;
   private String lV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ;
   private String lV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ;
   private String lV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ;
   private String lV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ;
   private String lV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ;
   private String AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ;
   private String AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ;
   private String AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ;
   private String AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ;
   private String AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ;
   private String AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ;
   private String AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ;
   private String AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ;
   private String AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ;
   private String AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ;
   private String A396EmprCod ;
   private String A1253EmprGuiRem ;
   private String hsh ;
   private String AV51Station ;
   private String AV53EmprNom ;
   private String AV54UsurCod ;
   private String edtAlbProCod_Columnheaderclass ;
   private String edtGuiRemCli_Columnheaderclass ;
   private String edtGuiRemCln_Columnheaderclass ;
   private String edtAlbProfch_Columnheaderclass ;
   private String edtAlbFecSal_Columnheaderclass ;
   private String edtAlbHorSal_Columnheaderclass ;
   private String edtAlbEnvMail_Columnheaderclass ;
   private String edtAlbUsu_Columnheaderclass ;
   private String edtAlbLic_Columnheaderclass ;
   private String edtAlbPdATCUD_Columnheaderclass ;
   private String edtAlbHhfm_Columnheaderclass ;
   private String edtFirma4dig_Columnheaderclass ;
   private String edtAlbProCod_Columnclass ;
   private String edtGuiRemCli_Columnclass ;
   private String edtGuiRemCln_Columnclass ;
   private String edtAlbProfch_Columnclass ;
   private String edtAlbFecSal_Columnclass ;
   private String edtAlbHorSal_Columnclass ;
   private String edtAlbEnvMail_Columnclass ;
   private String edtAlbUsu_Columnclass ;
   private String edtAlbLic_Columnclass ;
   private String edtAlbPdATCUD_Columnclass ;
   private String edtAlbHhfm_Columnclass ;
   private String edtFirma4dig_Columnclass ;
   private String Gx_msg ;
   private String AV109albprosalalfa ;
   private String AV110texto ;
   private String AV107CliFacMtsP ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXt_char20 ;
   private String GXt_char18 ;
   private String GXt_char16 ;
   private String GXt_char15 ;
   private String GXv_char4[] ;
   private String GXt_char14 ;
   private String GXv_char3[] ;
   private String AV101CliMailGrE ;
   private String GXv_char21[] ;
   private String AV99climailpke ;
   private String GXv_char19[] ;
   private String AV100climailgr ;
   private String GXv_char17[] ;
   private String tblTablerightheader_Internalname ;
   private String tblTablemergedactiongroup_actions_Internalname ;
   private String bttBtninsert_Internalname ;
   private String bttBtninsert_Jsonclick ;
   private String divUnnamedtableprioridad_Internalname ;
   private String lblTextblockprioridad_Internalname ;
   private String lblTextblockprioridad_Jsonclick ;
   private String sGXsfl_64_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbProCod_Jsonclick ;
   private String edtGuiRemCli_Jsonclick ;
   private String edtGuiRemCln_Jsonclick ;
   private String edtAlbProfch_Jsonclick ;
   private String edtAlbFecSal_Jsonclick ;
   private String edtAlbHorSal_Jsonclick ;
   private String edtAlbEnvMail_Jsonclick ;
   private String edtAlbUsu_Jsonclick ;
   private String edtAlbLic_Jsonclick ;
   private String edtAlbPdATCUD_Jsonclick ;
   private String edtAlbHhfm_Jsonclick ;
   private String edtFirma4dig_Jsonclick ;
   private String edtAlbFmd_Jsonclick ;
   private String edtAlbSec_Jsonclick ;
   private String edtAlbProPri_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV119TFAlbEnvMail ;
   private java.util.Date AV39TFAlbHhfm ;
   private java.util.Date AV79AlbProsal ;
   private java.util.Date A14404AlbEnvMail ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ;
   private java.util.Date AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ;
   private java.util.Date AV88AlbProfchfrom ;
   private java.util.Date AV89AlbProfchto ;
   private java.util.Date Gx_date ;
   private java.util.Date AV120DDO_AlbEnvMailAuxDate ;
   private java.util.Date AV41DDO_AlbHhfmAuxDate ;
   private java.util.Date A34AlbProfch ;
   private java.util.Date A4023AlbFecSal ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
   private boolean AV75ok ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n10017AlbFmd ;
   private boolean bGXsfl_64_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean AV68LoadGridData ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean GXv_boolean13[] ;
   private String AV106Messages_json ;
   private String AV61TFAlbProEst_SelsJson ;
   private String AV37TFAlbEnvFtp_SelsJson ;
   private String AV93TFAlbProAT_SelsJson ;
   private String AV118TextoCopia ;
   private String AV70Cadena ;
   private String AV78Hash ;
   private String A10017AlbFmd ;
   private String AV116Path ;
   private String AV96msg_control ;
   private String AV71firma ;
   private GXSimpleCollection<Byte> AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ;
   private GXSimpleCollection<Byte> AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ;
   private GXSimpleCollection<Byte> AV62TFAlbProEst_Sels ;
   private GXSimpleCollection<Byte> AV38TFAlbEnvFtp_Sels ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV14Session ;
   private com.genexus.webpanels.WebSession AV112WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private GXSimpleCollection<String> AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ;
   private HTMLChoice cmbavPrioridad ;
   private HTMLChoice cmbavAlbmarcain ;
   private HTMLChoice cmbavGridactions ;
   private HTMLChoice cmbAlbProEst ;
   private HTMLChoice cmbAlbMarca ;
   private HTMLChoice cmbAlbEnvFtp ;
   private HTMLChoice cmbAlbProAT ;
   private IDataStoreProvider pr_default ;
   private String[] H024X2_A1253EmprGuiRem ;
   private String[] H024X2_A396EmprCod ;
   private String[] H024X2_A39AlbProPri ;
   private String[] H024X2_A2242AlbSec ;
   private java.util.Date[] H024X2_A10019AlbHhfm ;
   private String[] H024X2_A10765AlbProAT ;
   private byte[] H024X2_A5805AlbEnvFtp ;
   private String[] H024X2_A14069AlbPdATCUD ;
   private String[] H024X2_A7101AlbLic ;
   private String[] H024X2_A7098AlbUsu ;
   private java.util.Date[] H024X2_A14404AlbEnvMail ;
   private String[] H024X2_A3865AlbHorSal ;
   private java.util.Date[] H024X2_A4023AlbFecSal ;
   private java.util.Date[] H024X2_A34AlbProfch ;
   private String[] H024X2_A5140AlbMarca ;
   private byte[] H024X2_A33AlbProEst ;
   private String[] H024X2_A1244GuiRemCln ;
   private int[] H024X2_A1243GuiRemCli ;
   private long[] H024X2_A30AlbProCod ;
   private String[] H024X2_A10017AlbFmd ;
   private boolean[] H024X2_n10017AlbFmd ;
   private long[] H024X3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV94TFAlbProAT_Sels ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV76Messages ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message12[] ;
   private com.genexus.SdtMessages_Message AV77Message ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV45DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.documentotransporteproduccion.SdtFilterDocumentodeTransporteProduccion_1 AV111FilterDocumentodeTransporteProduccion_1 ;
}

final  class documentodetransporteproduccion_1ww__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H024X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                          byte A5805AlbEnvFtp ,
                                          GXSimpleCollection<Byte> AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                          long AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod ,
                                          long AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to ,
                                          int AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli ,
                                          int AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to ,
                                          String AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                          String AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                          int AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size ,
                                          java.util.Date AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                          String AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                          String AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                          String AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                          String AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                          String AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                          String AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                          int AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size ,
                                          int AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size ,
                                          java.util.Date AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                          String AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                          String AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                          boolean AV68LoadGridData ,
                                          long AV92AlbProCod ,
                                          int AV87GuiRemCli ,
                                          java.util.Date AV88AlbProfchfrom ,
                                          java.util.Date AV89AlbProfchto ,
                                          long A30AlbProCod ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          java.util.Date A14404AlbEnvMail ,
                                          String A7098AlbUsu ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          java.util.Date A10019AlbHhfm ,
                                          String A10017AlbFmd ,
                                          String A396EmprCod ,
                                          java.util.Date A34AlbProfch ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A39AlbProPri ,
                                          String AV50AlbProPri ,
                                          String A5140AlbMarca ,
                                          String AV98AlbMarcaIN ,
                                          String AV52EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[29];
      Object[] GXv_Object24 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprGuiRem AS EmprGuiRem, T1.EmprCod, T1.AlbProPri, T1.AlbSec, T1.AlbHhfm, T1.AlbProAT, T1.AlbEnvFtp, T1.AlbPdATCUD, T1.AlbLic, T1.AlbUsu, T1.AlbEnvMail, T1.AlbHorSal," ;
      sSelectString += " T1.AlbFecSal, T1.AlbProfch, T1.AlbMarca, T1.AlbProEst, T2.CliNom AS GuiRemCln, T1.GuiRemCli AS GuiRemCli, T1.AlbProCod, T1.AlbFmd" ;
      sFromString = " FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      addWhere(sWhereString, "(T1.AlbMarca = ? or ? = 'T')");
      if ( ! (0==AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (0==AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (0==AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (0==AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail) )
      {
         addWhere(sWhereString, "(T1.AlbEnvMail >= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) && ( ! (GXutil.strcmp("", AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbUsu = ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels, "T1.AlbEnvFtp IN (", ")")+")");
      }
      if ( AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm) )
      {
         addWhere(sWhereString, "(T1.AlbHhfm >= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! AV68LoadGridData )
      {
         addWhere(sWhereString, "(T1.EmprCod IS NULL and Not T1.EmprCod IS NULL and T1.AlbProCod IS NULL)");
      }
      if ( ! (0==AV92AlbProCod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod = ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (0==AV87GuiRemCli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli = ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88AlbProfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89AlbProfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.GuiRemCli" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.GuiRemCli DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T2.CliNom" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.CliNom DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProEst" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProEst DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbMarca" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbMarca DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProfch" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProfch DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbFecSal" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbFecSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHorSal" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHorSal DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbEnvMail" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbEnvMail DESC" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbUsu" ;
      }
      else if ( ( AV12OrderedBy == 11 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbUsu DESC" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbLic" ;
      }
      else if ( ( AV12OrderedBy == 12 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbLic DESC" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbPdATCUD" ;
      }
      else if ( ( AV12OrderedBy == 13 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbPdATCUD DESC" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbEnvFtp" ;
      }
      else if ( ( AV12OrderedBy == 14 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbEnvFtp DESC" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbProAT" ;
      }
      else if ( ( AV12OrderedBy == 15 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbProAT DESC" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbHhfm" ;
      }
      else if ( ( AV12OrderedBy == 16 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbHhfm DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.AlbProCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H024X3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          byte A33AlbProEst ,
                                          GXSimpleCollection<Byte> AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels ,
                                          byte A5805AlbEnvFtp ,
                                          GXSimpleCollection<Byte> AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels ,
                                          String A10765AlbProAT ,
                                          GXSimpleCollection<String> AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels ,
                                          long AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod ,
                                          long AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to ,
                                          int AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli ,
                                          int AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to ,
                                          String AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel ,
                                          String AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln ,
                                          int AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size ,
                                          java.util.Date AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail ,
                                          String AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel ,
                                          String AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu ,
                                          String AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel ,
                                          String AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic ,
                                          String AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel ,
                                          String AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud ,
                                          int AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size ,
                                          int AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size ,
                                          java.util.Date AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm ,
                                          String AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel ,
                                          String AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig ,
                                          boolean AV68LoadGridData ,
                                          long AV92AlbProCod ,
                                          int AV87GuiRemCli ,
                                          java.util.Date AV88AlbProfchfrom ,
                                          java.util.Date AV89AlbProfchto ,
                                          long A30AlbProCod ,
                                          int A1243GuiRemCli ,
                                          String A1244GuiRemCln ,
                                          java.util.Date A14404AlbEnvMail ,
                                          String A7098AlbUsu ,
                                          String A7101AlbLic ,
                                          String A14069AlbPdATCUD ,
                                          java.util.Date A10019AlbHhfm ,
                                          String A10017AlbFmd ,
                                          String A396EmprCod ,
                                          java.util.Date A34AlbProfch ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String A39AlbProPri ,
                                          String AV50AlbProPri ,
                                          String A5140AlbMarca ,
                                          String AV98AlbMarcaIN ,
                                          String AV52EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[24];
      Object[] GXv_Object27 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPCALPRD T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprGuiRem AND T2.CliCod = T1.GuiRemCli)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.AlbProPri = ?)");
      addWhere(sWhereString, "(T1.AlbMarca = ? or ? = 'T')");
      if ( ! (0==AV125Documentotransporteproduccion_documentodetransporteproduccion_1wwds_1_tfalbprocod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod >= ?)");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (0==AV126Documentotransporteproduccion_documentodetransporteproduccion_1wwds_2_tfalbprocod_to) )
      {
         addWhere(sWhereString, "(T1.AlbProCod <= ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (0==AV127Documentotransporteproduccion_documentodetransporteproduccion_1wwds_3_tfguiremcli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli >= ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (0==AV128Documentotransporteproduccion_documentodetransporteproduccion_1wwds_4_tfguiremcli_to) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli <= ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) && ( ! (GXutil.strcmp("", AV129Documentotransporteproduccion_documentodetransporteproduccion_1wwds_5_tfguiremcln)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.CliNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Documentotransporteproduccion_documentodetransporteproduccion_1wwds_6_tfguiremcln_sel)==0) )
      {
         addWhere(sWhereString, "(T2.CliNom = ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV131Documentotransporteproduccion_documentodetransporteproduccion_1wwds_7_tfalbproest_sels, "T1.AlbProEst IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV132Documentotransporteproduccion_documentodetransporteproduccion_1wwds_8_tfalbenvmail) )
      {
         addWhere(sWhereString, "(T1.AlbEnvMail >= ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) && ( ! (GXutil.strcmp("", AV133Documentotransporteproduccion_documentodetransporteproduccion_1wwds_9_tfalbusu)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbUsu) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV134Documentotransporteproduccion_documentodetransporteproduccion_1wwds_10_tfalbusu_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbUsu = ?)");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) && ( ! (GXutil.strcmp("", AV135Documentotransporteproduccion_documentodetransporteproduccion_1wwds_11_tfalblic)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbLic) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV136Documentotransporteproduccion_documentodetransporteproduccion_1wwds_12_tfalblic_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbLic = ?)");
      }
      else
      {
         GXv_int26[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) && ( ! (GXutil.strcmp("", AV137Documentotransporteproduccion_documentodetransporteproduccion_1wwds_13_tfalbpdatcud)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.AlbPdATCUD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV138Documentotransporteproduccion_documentodetransporteproduccion_1wwds_14_tfalbpdatcud_sel)==0) )
      {
         addWhere(sWhereString, "(T1.AlbPdATCUD = ?)");
      }
      else
      {
         GXv_int26[16] = (byte)(1) ;
      }
      if ( AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV139Documentotransporteproduccion_documentodetransporteproduccion_1wwds_15_tfalbenvftp_sels, "T1.AlbEnvFtp IN (", ")")+")");
      }
      if ( AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels_size > 0 )
      {
         addWhere(sWhereString, "("+GXutil.toValueList("oracle7", AV140Documentotransporteproduccion_documentodetransporteproduccion_1wwds_16_tfalbproat_sels, "T1.AlbProAT IN (", ")")+")");
      }
      if ( ! GXutil.dateCompare(GXutil.nullDate(), AV141Documentotransporteproduccion_documentodetransporteproduccion_1wwds_17_tfalbhhfm) )
      {
         addWhere(sWhereString, "(T1.AlbHhfm >= ?)");
      }
      else
      {
         GXv_int26[17] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) && ( ! (GXutil.strcmp("", AV142Documentotransporteproduccion_documentodetransporteproduccion_1wwds_18_tffirma4dig)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1)) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[18] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV143Documentotransporteproduccion_documentodetransporteproduccion_1wwds_19_tffirma4dig_sel)==0) )
      {
         addWhere(sWhereString, "(SUBSTR(T1.AlbFmd, 1, 1) || SUBSTR(T1.AlbFmd, 11, 1) || SUBSTR(T1.AlbFmd, 21, 1) || SUBSTR(T1.AlbFmd, 31, 1) = ?)");
      }
      else
      {
         GXv_int26[19] = (byte)(1) ;
      }
      if ( ! AV68LoadGridData )
      {
         addWhere(sWhereString, "(T1.EmprCod IS NULL and Not T1.EmprCod IS NULL and T1.AlbProCod IS NULL)");
      }
      if ( ! (0==AV92AlbProCod) )
      {
         addWhere(sWhereString, "(T1.AlbProCod = ?)");
      }
      else
      {
         GXv_int26[20] = (byte)(1) ;
      }
      if ( ! (0==AV87GuiRemCli) )
      {
         addWhere(sWhereString, "(T1.GuiRemCli = ?)");
      }
      else
      {
         GXv_int26[21] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV88AlbProfchfrom)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch >= ?)");
      }
      else
      {
         GXv_int26[22] = (byte)(1) ;
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV89AlbProfchto)) )
      {
         addWhere(sWhereString, "(T1.AlbProfch <= ?)");
      }
      else
      {
         GXv_int26[23] = (byte)(1) ;
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
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
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
                  return conditional_H024X2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Boolean) dynConstraints[25]).booleanValue() , ((Number) dynConstraints[26]).longValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).longValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] );
            case 1 :
                  return conditional_H024X3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[1] , ((Number) dynConstraints[2]).byteValue() , (GXSimpleCollection<Byte>)dynConstraints[3] , (String)dynConstraints[4] , (GXSimpleCollection<String>)dynConstraints[5] , ((Number) dynConstraints[6]).longValue() , ((Number) dynConstraints[7]).longValue() , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).intValue() , (java.util.Date)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , (java.util.Date)dynConstraints[22] , (String)dynConstraints[23] , (String)dynConstraints[24] , ((Boolean) dynConstraints[25]).booleanValue() , ((Number) dynConstraints[26]).longValue() , ((Number) dynConstraints[27]).intValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , ((Number) dynConstraints[30]).longValue() , ((Number) dynConstraints[31]).intValue() , (String)dynConstraints[32] , (java.util.Date)dynConstraints[33] , (String)dynConstraints[34] , (String)dynConstraints[35] , (String)dynConstraints[36] , (java.util.Date)dynConstraints[37] , (String)dynConstraints[38] , (String)dynConstraints[39] , (java.util.Date)dynConstraints[40] , ((Number) dynConstraints[41]).shortValue() , ((Boolean) dynConstraints[42]).booleanValue() , (String)dynConstraints[43] , (String)dynConstraints[44] , (String)dynConstraints[45] , (String)dynConstraints[46] , (String)dynConstraints[47] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H024X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H024X3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 20);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((java.util.Date[]) buf[10])[0] = rslt.getGXDateTime(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 8);
               ((java.util.Date[]) buf[12])[0] = rslt.getGXDate(13);
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDate(14);
               ((String[]) buf[14])[0] = rslt.getString(15, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(16);
               ((String[]) buf[16])[0] = rslt.getString(17, 30);
               ((int[]) buf[17])[0] = rslt.getInt(18);
               ((long[]) buf[18])[0] = rslt.getLong(19);
               ((String[]) buf[19])[0] = rslt.getVarchar(20);
               ((boolean[]) buf[20])[0] = rslt.wasNull();
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
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[33]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[34]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[39], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[41], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[44], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[45], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[46], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[49]).longValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[51]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[52]);
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
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 1);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[28]).longValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[29]).longValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 30);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 30);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[34], false);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 20);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDateTime(sIdx, (java.util.Date)parms[41], false);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[42], 4);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[43], 4);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setLong(sIdx, ((Number) parms[44]).longValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[46]);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[47]);
               }
               return;
      }
   }

}

