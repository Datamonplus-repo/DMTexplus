package app.documentotransporteproduccion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class documentodetransporteproduccion_40_impl extends GXDataArea
{
   public documentodetransporteproduccion_40_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public documentodetransporteproduccion_40_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( documentodetransporteproduccion_40_impl.class ));
   }

   public documentodetransporteproduccion_40_impl( int remoteHandle ,
                                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAlbpropri = new HTMLChoice();
      cmbavAlbenvftp = new HTMLChoice();
      chkavClifacmtsp = UIFactory.getCheckbox(this);
      cmbavAlbproval = new HTMLChoice();
      chkavBartipcor = UIFactory.getCheckbox(this);
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
            AV53EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53EmprCod", AV53EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV24AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AlbProCod), 10, 0));
               AV58Guiremcli = (int)(GXutil.lval( httpContext.GetPar( "Guiremcli"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Guiremcli), 6, 0));
               AV59GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV59GuiRemCln", AV59GuiRemCln);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59GuiRemCln, ""))));
               AV26AlbProFch = localUtil.parseDateParm( httpContext.GetPar( "AlbProFch")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV26AlbProFch", localUtil.format(AV26AlbProFch, "99/99/99"));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV26AlbProFch));
               AV29AlbSec = httpContext.GetPar( "AlbSec") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29AlbSec", AV29AlbSec);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29AlbSec, "@!"))));
               AV27AlbProPri = httpContext.GetPar( "AlbProPri") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27AlbProPri", AV27AlbProPri);
               AV18AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18AlbEnvFtp", GXutil.str( AV18AlbEnvFtp, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18AlbEnvFtp), "9")));
               AV23AlbLic = httpContext.GetPar( "AlbLic") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23AlbLic", AV23AlbLic);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23AlbLic, ""))));
               AV22AlbHhfm = localUtil.parseDTimeParm( httpContext.GetPar( "AlbHhfm")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22AlbHhfm", localUtil.ttoc( AV22AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV25AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV25AlbProEst", GXutil.str( AV25AlbProEst, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25AlbProEst), "9")));
               AV80AlbMarca = httpContext.GetPar( "AlbMarca") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV80AlbMarca", AV80AlbMarca);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80AlbMarca, ""))));
               AV60Hash = httpContext.GetPar( "Hash") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV60Hash", AV60Hash);
               AV66ok = GXutil.strtobool( httpContext.GetPar( "ok")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66ok", AV66ok);
               AV62Messages_json = httpContext.GetPar( "Messages_json") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV62Messages_json", AV62Messages_json);
               AV51CliFacMtsP = httpContext.GetPar( "CliFacMtsP") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51CliFacMtsP", AV51CliFacMtsP);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51CliFacMtsP, ""))));
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
      pa2952( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2952( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_40", new String[] {GXutil.URLEncode(GXutil.rtrim(AV53EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV24AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV58Guiremcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV59GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV26AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV29AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV27AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV18AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV23AlbLic)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV22AlbHhfm)),GXutil.URLEncode(GXutil.ltrimstr(AV25AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV80AlbMarca)),GXutil.URLEncode(GXutil.rtrim(AV60Hash)),GXutil.URLEncode(GXutil.booltostr(AV66ok)),GXutil.URLEncode(GXutil.rtrim(AV62Messages_json)),GXutil.URLEncode(GXutil.rtrim(AV51CliFacMtsP))}, new String[] {"EmprCod","AlbProCod","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic","AlbHhfm","AlbProEst","AlbMarca","Hash","ok","Messages_json","CliFacMtsP"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV64Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55errkgs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLAVANDERIAPRECIO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV82lavanderiaprecio), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57FlagFas), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMENSAJE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Mensaje, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOFASES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65Nofases), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59GuiRemCln, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV26AlbProFch));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18AlbEnvFtp), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23AlbLic, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25AlbProEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80AlbMarca, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51CliFacMtsP, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_40");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV88Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("documentotransporteproduccion\\documentodetransporteproduccion_40:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTUBCOD_DATA", AV72TubCod_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTUBCOD_DATA", AV72TubCod_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROEST", GXutil.ltrim( localUtil.ntoc( AV25AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25AlbProEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBMARCA", GXutil.rtrim( AV80AlbMarca));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80AlbMarca, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV64Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV64Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRKGS", GXutil.ltrim( localUtil.ntoc( AV55errkgs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55errkgs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLAVANDERIAPRECIO", GXutil.ltrim( localUtil.ntoc( AV82lavanderiaprecio, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLAVANDERIAPRECIO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV82lavanderiaprecio), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV53EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFAS", GXutil.ltrim( localUtil.ntoc( AV57FlagFas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57FlagFas), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV74UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV70Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV13Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMENSAJE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Mensaje, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROFCH", localUtil.dtoc( AV26AlbProFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV26AlbProFch));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOFASES", GXutil.ltrim( localUtil.ntoc( AV65Nofases, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOFASES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65Nofases), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGUIREMCLN", GXutil.rtrim( AV59GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59GuiRemCln, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBSEC", GXutil.rtrim( AV29AlbSec));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29AlbSec, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBHHFM", localUtil.ttoc( AV22AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBPROSAL", localUtil.ttoc( AV78AlbProsal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vCADENA", AV49Cadena);
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV60Hash);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vOK", AV66ok);
      app.GxWebStd.gx_hidden_field( httpContext, "vMESSAGES_JSON", AV62Messages_json);
      app.GxWebStd.gx_hidden_field( httpContext, "vIN_BARSIT", GXutil.ltrim( localUtil.ntoc( AV12IN_Barsit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Visible", GXutil.booltostr( Combo_tubcod_Visible));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_TUBCOD_Selectedvalue_get", GXutil.rtrim( Combo_tubcod_Selectedvalue_get));
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
      if ( ! ( WebComp_Wcdocumentodetransporteproduccion_41 == null ) )
      {
         WebComp_Wcdocumentodetransporteproduccion_41.componentjscripts();
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
         we2952( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2952( ) ;
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
      return formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_40", new String[] {GXutil.URLEncode(GXutil.rtrim(AV53EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV24AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV58Guiremcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV59GuiRemCln)),GXutil.URLEncode(GXutil.formatDateParm(AV26AlbProFch)),GXutil.URLEncode(GXutil.rtrim(AV29AlbSec)),GXutil.URLEncode(GXutil.rtrim(AV27AlbProPri)),GXutil.URLEncode(GXutil.ltrimstr(AV18AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV23AlbLic)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV22AlbHhfm)),GXutil.URLEncode(GXutil.ltrimstr(AV25AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV80AlbMarca)),GXutil.URLEncode(GXutil.rtrim(AV60Hash)),GXutil.URLEncode(GXutil.booltostr(AV66ok)),GXutil.URLEncode(GXutil.rtrim(AV62Messages_json)),GXutil.URLEncode(GXutil.rtrim(AV51CliFacMtsP))}, new String[] {"EmprCod","AlbProCod","Guiremcli","GuiRemCln","AlbProFch","AlbSec","AlbProPri","AlbEnvFtp","AlbLic","AlbHhfm","AlbProEst","AlbMarca","Hash","ok","Messages_json","CliFacMtsP"})  ;
   }

   public String getPgmname( )
   {
      return "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_40" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Producciones (ins_upd)", "") ;
   }

   public void wb2950( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV24AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV58Guiremcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV58Guiremcli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV58Guiremcli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DataContentCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavAlbpropri.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAlbpropri.getInternalname(), httpContext.getMessage( "Tipo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbpropri, cmbavAlbpropri.getInternalname(), GXutil.rtrim( AV27AlbProPri), 1, cmbavAlbpropri.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbpropri.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         cmbavAlbpropri.setValue( GXutil.rtrim( AV27AlbProPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlblic_Internalname, GXutil.rtrim( AV23AlbLic), GXutil.rtrim( localUtil.format( AV23AlbLic, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlblic_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlblic_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbenvftp, cmbavAlbenvftp.getInternalname(), GXutil.trim( GXutil.str( AV18AlbEnvFtp, 1, 0)), 1, cmbavAlbenvftp.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavAlbenvftp.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         cmbavAlbenvftp.setValue( GXutil.trim( GXutil.str( AV18AlbEnvFtp, 1, 0)) );
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
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavClifacmtsp.getInternalname(), AV51CliFacMtsP, "", httpContext.getMessage( "Fatura Metros PL?", ""), 1, chkavClifacmtsp.getEnabled(), "S", "", StyleString, ClassString, "", "", "");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV35BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV35BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV35BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,58);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "ImagePrompt" + " " + ((GXutil.strcmp(imgavPrompt_gximage, "")==0) ? "" : "GX_Image_"+imgavPrompt_gximage+"_Class") ;
         StyleString = "" ;
         AV69Prompt_IsBlob = (boolean)(((GXutil.strcmp("", AV69Prompt)==0)&&(GXutil.strcmp("", AV89Prompt_GXI)==0))||!(GXutil.strcmp("", AV69Prompt)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV69Prompt)==0) ? AV89Prompt_GXI : httpContext.getResourceRelative(AV69Prompt)) ;
         app.GxWebStd.gx_bitmap( httpContext, imgavPrompt_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, -1, 0, "", 0, "", 0, 0, 7, imgavPrompt_Jsonclick, "'"+""+"'"+",false,"+"'"+"e112951_client"+"'", StyleString, ClassString, "", "", "", "", ""+TempTags, "", "", 1, AV69Prompt_IsBlob, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV37BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV37BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV37BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV36BarCodPar), GXutil.rtrim( localUtil.format( AV36BarCodPar, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbkgme_Internalname, GXutil.ltrim( localUtil.ntoc( AV30BarAlbKgmE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbkgme_Enabled!=0) ? localUtil.format( AV30BarAlbKgmE, "ZZZZZ9.99") : localUtil.format( AV30BarAlbKgmE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbkgme_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbkgme_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavAlbhdranc_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbhdranc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbhdranc_Internalname, httpContext.getMessage( "Larg.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbhdranc_Internalname, GXutil.ltrim( localUtil.ntoc( AV19AlbHdrAnc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbhdranc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19AlbHdrAnc), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19AlbHdrAnc), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbhdranc_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavAlbhdranc_Visible, edtavAlbhdranc_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavAlbhdrgm2_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbhdrgm2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbhdrgm2_Internalname, httpContext.getMessage( "Grm2", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbhdrgm2_Internalname, GXutil.ltrim( localUtil.ntoc( AV20AlbHdrgm2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbhdrgm2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20AlbHdrgm2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20AlbHdrgm2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,82);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbhdrgm2_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavAlbhdrgm2_Visible, edtavAlbhdrgm2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBaralbmtre_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbmtre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbmtre_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbmtre_Internalname, GXutil.ltrim( localUtil.ntoc( AV31BarAlbMtrE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbmtre_Enabled!=0) ? localUtil.format( AV31BarAlbMtrE, "ZZZZZ9.99") : localUtil.format( AV31BarAlbMtrE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbmtre_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBaralbmtre_Visible, edtavBaralbmtre_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV32BarAlbPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV32BarAlbPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV32BarAlbPie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBaralbpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAlbproval, cmbavAlbproval.getInternalname(), GXutil.rtrim( AV28AlbProVal), 1, cmbavAlbproval.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavAlbproval.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         cmbavAlbproval.setValue( GXutil.rtrim( AV28AlbProVal) );
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_tubcod_Internalname, httpContext.getMessage( "Tubo", ""), "", "", lblTextblockcombo_tubcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", lblTextblockcombo_tubcod_Visible, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_tubcod.setProperty("Caption", Combo_tubcod_Caption);
         ucCombo_tubcod.setProperty("Cls", Combo_tubcod_Cls);
         ucCombo_tubcod.setProperty("EmptyItemText", Combo_tubcod_Emptyitemtext);
         ucCombo_tubcod.setProperty("DropDownOptionsData", AV72TubCod_Data);
         ucCombo_tubcod.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_tubcod_Internalname, "COMBO_TUBCODContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBaralbtub_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbtub_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbtub_Internalname, httpContext.getMessage( "Qtd.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 109,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbtub_Internalname, GXutil.ltrim( localUtil.ntoc( AV33BarAlbTub, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbtub_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33BarAlbTub), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV33BarAlbTub), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,109);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbtub_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBaralbtub_Visible, edtavBaralbtub_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 113,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbhdrobs_Internalname, GXutil.rtrim( AV21AlbHdrObs), GXutil.rtrim( localUtil.format( AV21AlbHdrObs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,113);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbhdrobs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbhdrobs_Enabled, 0, "text", "", 60, "chr", 1, "row", 60, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 121,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, bttBtnenter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnhashcomunicarat_Internalname, "", httpContext.getMessage( "Hash y Comunicar a AT", ""), bttBtnhashcomunicarat_Jsonclick, 5, httpContext.getMessage( "Hash y Comunicar a AT", ""), "", StyleString, ClassString, 1, bttBtnhashcomunicarat_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOHASHCOMUNICARAT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarenccli_Internalname, GXutil.rtrim( AV40BarEncCli), GXutil.rtrim( localUtil.format( AV40BarEncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,141);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarenccli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarenccli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 145,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV44BarSer), GXutil.rtrim( localUtil.format( AV44BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,145);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarserdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserdsc_Internalname, httpContext.getMessage( "Descriçao", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 149,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV45BarSerDsc), GXutil.rtrim( localUtil.format( AV45BarSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,149);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 153,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV38BarColNom), GXutil.rtrim( localUtil.format( AV38BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,153);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 157,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV39BarColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV39BarColNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV39BarColNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,157);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 161,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV47BarTipCol, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV47BarTipCol), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV47BarTipCol), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,161);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipcol_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 165,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV43BarNomCli), GXutil.rtrim( localUtil.format( AV43BarNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,165);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 169,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavBartipcor.getInternalname(), AV48BarTipCor, "", httpContext.getMessage( "Exp?", ""), 1, chkavBartipcor.getEnabled(), "SI", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(169, this, 'SI', 'NO',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,169);\"");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 173,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarsit_Internalname, GXutil.ltrim( localUtil.ntoc( AV46BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV46BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV46BarSit), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,173);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarsit_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarsit_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarunimed_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarunimed_Internalname, httpContext.getMessage( "Und", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 177,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarunimed_Internalname, GXutil.rtrim( AV79Barunimed), GXutil.rtrim( localUtil.format( AV79Barunimed, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,177);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarunimed_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarunimed_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-1 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBartipdis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBartipdis_Internalname, httpContext.getMessage( "T", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBartipdis_Internalname, GXutil.rtrim( AV83BarTipDis), GXutil.rtrim( localUtil.format( AV83BarTipDis, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBartipdis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBartipdis_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavBaralbund_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBaralbund_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBaralbund_Internalname, httpContext.getMessage( "Prendas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 189,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBaralbund_Internalname, GXutil.ltrim( localUtil.ntoc( AV81BarAlbUnd, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBaralbund_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV81BarAlbUnd), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV81BarAlbUnd), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,189);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBaralbund_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavBaralbund_Visible, edtavBaralbund_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbpmppza_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbpmppza_Internalname, httpContext.getMessage( "Peso 1 Pça", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbpmppza_Internalname, GXutil.ltrim( localUtil.ntoc( AV85AlbpmpPza, (byte)(6), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbpmppza_Enabled!=0) ? localUtil.format( AV85AlbpmpPza, "Z9.999") : localUtil.format( AV85AlbpmpPza, "Z9.999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'3');"+";gx.evt.onblur(this,193);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbpmppza_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbpmppza_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0199"+"", GXutil.rtrim( WebComp_Wcdocumentodetransporteproduccion_41_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0199"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_41_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWcdocumentodetransporteproduccion_41), GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_41_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0199"+"");
               }
               WebComp_Wcdocumentodetransporteproduccion_41.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWcdocumentodetransporteproduccion_41), GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_41_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_unnamedtable3_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_unnamedtable3_cell_Class, "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV50CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV50CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,209);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 213,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarestreo, cmbavBarestreo.getInternalname(), GXutil.trim( GXutil.str( AV41BarEstReo, 1, 0)), 1, cmbavBarestreo.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavBarestreo.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,213);\"", "", true, (byte)(0), "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         cmbavBarestreo.setValue( GXutil.trim( GXutil.str( AV41BarEstReo, 1, 0)) );
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 217,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV42BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV42BarKgm, "ZZZZZ9.99") : localUtil.format( AV42BarKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,217);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarpie_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarpie_Internalname, httpContext.getMessage( "Peças", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 221,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarpie_Internalname, GXutil.ltrim( localUtil.ntoc( AV84barpie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV84barpie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV84barpie), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,221);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarpie_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarpie_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavKilant_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavKilant_Internalname, httpContext.getMessage( "Old Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 225,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavKilant_Internalname, GXutil.ltrim( localUtil.ntoc( AV61KilAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavKilant_Enabled!=0) ? localUtil.format( AV61KilAnt, "ZZZZZ9.99") : localUtil.format( AV61KilAnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,225);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavKilant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavKilant_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMetant_Internalname, GXutil.ltrim( localUtil.ntoc( AV63MetAnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMetant_Enabled!=0) ? localUtil.format( AV63MetAnt, "ZZZZZ9.99") : localUtil.format( AV63MetAnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMetant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMetant_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 233,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPieant_Internalname, GXutil.ltrim( localUtil.ntoc( AV67PieAnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPieant_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV67PieAnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV67PieAnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,233);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPieant_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPieant_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 237,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcad_Internalname, GXutil.ltrim( localUtil.ntoc( AV34barcad, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34barcad), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV34barcad), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,237);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcad_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcad_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 241,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbbar_Internalname, GXutil.ltrim( localUtil.ntoc( AV17albbar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbbar_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17albbar), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17albbar), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,241);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbbar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbbar_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV88Pgmname), GXutil.rtrim( localUtil.format( AV88Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 252,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTubcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV71TubCod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV71TubCod), "ZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,252);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTubcod_Jsonclick, 0, "Attribute", "", "", "", "", edtavTubcod_Visible, 1, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_DocumentoTransporteProduccion\\DocumentodeTransporteProduccion_40.htm");
         wb_table1_253_2952( true) ;
      }
      else
      {
         wb_table1_253_2952( false) ;
      }
      return  ;
   }

   public void wb_table1_253_2952e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start2952( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Producciones (ins_upd)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2950( ) ;
   }

   public void ws2952( )
   {
      start2952( ) ;
      evt2952( ) ;
   }

   public void evt2952( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e132952 ();
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
                                 e142952 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOHASHCOMUNICARAT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Dohashcomunicarat' */
                           e152952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e162952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCOD.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e172952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARCODPAR.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e182952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBPROVAL.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VBARALBKGME.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e202952 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e212952 ();
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
                     }
                  }
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 199 )
                     {
                        OldWcdocumentodetransporteproduccion_41 = httpContext.cgiGet( "W0199") ;
                        if ( ( GXutil.len( OldWcdocumentodetransporteproduccion_41) == 0 ) || ( GXutil.strcmp(OldWcdocumentodetransporteproduccion_41, WebComp_Wcdocumentodetransporteproduccion_41_Component) != 0 ) )
                        {
                           WebComp_Wcdocumentodetransporteproduccion_41 = WebUtils.getWebComponent(getClass(), "app." + OldWcdocumentodetransporteproduccion_41 + "_impl", remoteHandle, context);
                           WebComp_Wcdocumentodetransporteproduccion_41_Component = OldWcdocumentodetransporteproduccion_41 ;
                        }
                        if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_41_Component) != 0 )
                        {
                           WebComp_Wcdocumentodetransporteproduccion_41.componentprocess("W0199", "", sEvt);
                        }
                        WebComp_Wcdocumentodetransporteproduccion_41_Component = OldWcdocumentodetransporteproduccion_41 ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we2952( )
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

   public void pa2952( )
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
      if ( cmbavAlbpropri.getItemCount() > 0 )
      {
         AV27AlbProPri = cmbavAlbpropri.getValidValue(AV27AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27AlbProPri", AV27AlbProPri);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbpropri.setValue( GXutil.rtrim( AV27AlbProPri) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
      }
      if ( cmbavAlbenvftp.getItemCount() > 0 )
      {
         AV18AlbEnvFtp = (byte)(GXutil.lval( cmbavAlbenvftp.getValidValue(GXutil.trim( GXutil.str( AV18AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbEnvFtp", GXutil.str( AV18AlbEnvFtp, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18AlbEnvFtp), "9")));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbenvftp.setValue( GXutil.trim( GXutil.str( AV18AlbEnvFtp, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbenvftp.getInternalname(), "Values", cmbavAlbenvftp.ToJavascriptSource(), true);
      }
      AV51CliFacMtsP = ((GXutil.strcmp(GXutil.rtrim( AV51CliFacMtsP), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51CliFacMtsP", AV51CliFacMtsP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51CliFacMtsP, ""))));
      if ( cmbavAlbproval.getItemCount() > 0 )
      {
         AV28AlbProVal = cmbavAlbproval.getValidValue(AV28AlbProVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28AlbProVal", AV28AlbProVal);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAlbproval.setValue( GXutil.rtrim( AV28AlbProVal) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproval.getInternalname(), "Values", cmbavAlbproval.ToJavascriptSource(), true);
      }
      AV48BarTipCor = ((GXutil.strcmp(GXutil.rtrim( AV48BarTipCor), "SI")==0) ? "SI" : "NO") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48BarTipCor", AV48BarTipCor);
      if ( cmbavBarestreo.getItemCount() > 0 )
      {
         AV41BarEstReo = (byte)(GXutil.lval( cmbavBarestreo.getValidValue(GXutil.trim( GXutil.str( AV41BarEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41BarEstReo", GXutil.str( AV41BarEstReo, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarestreo.setValue( GXutil.trim( GXutil.str( AV41BarEstReo, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarestreo.getInternalname(), "Values", cmbavBarestreo.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2952( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV88Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_40" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Pgmname", AV88Pgmname);
      Gx_err = (short)(0) ;
      edtavAlblic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlblic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlblic_Enabled), 5, 0), true);
      cmbavAlbenvftp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbenvftp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbenvftp.getEnabled(), 5, 0), true);
      cmbavAlbproval.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproval.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbproval.getEnabled(), 5, 0), true);
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
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavBartipdis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipdis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipdis_Enabled), 5, 0), true);
      edtavBaralbund_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbund_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbund_Enabled), 5, 0), true);
      edtavAlbpmppza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpmppza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpmppza_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      cmbavBarestreo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarestreo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarestreo.getEnabled(), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
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
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2952( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_41_Component) != 0 )
            {
               WebComp_Wcdocumentodetransporteproduccion_41.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e212952 ();
         wb2950( ) ;
      }
   }

   public void send_integrity_lvl_hashes2952( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV64Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV64Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vERRKGS", GXutil.ltrim( localUtil.ntoc( AV55errkgs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55errkgs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLAVANDERIAPRECIO", GXutil.ltrim( localUtil.ntoc( AV82lavanderiaprecio, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLAVANDERIAPRECIO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV82lavanderiaprecio), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGFAS", GXutil.ltrim( localUtil.ntoc( AV57FlagFas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57FlagFas), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV74UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV70Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMENSAJE", AV13Mensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMENSAJE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13Mensaje, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOFASES", GXutil.ltrim( localUtil.ntoc( AV65Nofases, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOFASES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65Nofases), "ZZZ9")));
   }

   public void before_start_formulas( )
   {
      AV88Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_40" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88Pgmname", AV88Pgmname);
      Gx_err = (short)(0) ;
      edtavAlblic_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlblic_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlblic_Enabled), 5, 0), true);
      cmbavAlbenvftp.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbenvftp.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbenvftp.getEnabled(), 5, 0), true);
      cmbavAlbproval.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproval.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavAlbproval.getEnabled(), 5, 0), true);
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
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), true);
      edtavBartipdis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBartipdis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBartipdis_Enabled), 5, 0), true);
      edtavBaralbund_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbund_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbund_Enabled), 5, 0), true);
      edtavAlbpmppza_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbpmppza_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbpmppza_Enabled), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      cmbavBarestreo.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarestreo.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarestreo.getEnabled(), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), true);
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
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2950( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e132952 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTUBCOD_DATA"), AV72TubCod_Data);
         /* Read saved values. */
         AV64Moda21 = (short)(localUtil.ctol( httpContext.cgiGet( "vMODA21"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV82lavanderiaprecio = (short)(localUtil.ctol( httpContext.cgiGet( "vLAVANDERIAPRECIO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV53EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
         AV12IN_Barsit = (byte)(localUtil.ctol( httpContext.cgiGet( "vIN_BARSIT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Combo_tubcod_Visible = GXutil.strtobool( httpContext.cgiGet( "COMBO_TUBCOD_Visible")) ;
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
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV35BarCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarCod), 8, 0));
         }
         else
         {
            AV35BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarCod), 8, 0));
         }
         AV69Prompt = httpContext.cgiGet( imgavPrompt_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
            GX_FocusControl = edtavBarcodreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV37BarCodReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BarCodReo", GXutil.str( AV37BarCodReo, 1, 0));
         }
         else
         {
            AV37BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37BarCodReo", GXutil.str( AV37BarCodReo, 1, 0));
         }
         AV36BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36BarCodPar", AV36BarCodPar);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBKGME");
            GX_FocusControl = edtavBaralbkgme_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV30BarAlbKgmE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30BarAlbKgmE", GXutil.ltrimstr( AV30BarAlbKgmE, 9, 2));
         }
         else
         {
            AV30BarAlbKgmE = localUtil.ctond( httpContext.cgiGet( edtavBaralbkgme_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30BarAlbKgmE", GXutil.ltrimstr( AV30BarAlbKgmE, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdranc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdranc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBHDRANC");
            GX_FocusControl = edtavAlbhdranc_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19AlbHdrAnc = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbHdrAnc), 4, 0));
         }
         else
         {
            AV19AlbHdrAnc = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbhdranc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbHdrAnc), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbhdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBHDRGM2");
            GX_FocusControl = edtavAlbhdrgm2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20AlbHdrgm2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbHdrgm2), 4, 0));
         }
         else
         {
            AV20AlbHdrgm2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbhdrgm2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbHdrgm2), 4, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBMTRE");
            GX_FocusControl = edtavBaralbmtre_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV31BarAlbMtrE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31BarAlbMtrE", GXutil.ltrimstr( AV31BarAlbMtrE, 9, 2));
         }
         else
         {
            AV31BarAlbMtrE = localUtil.ctond( httpContext.cgiGet( edtavBaralbmtre_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31BarAlbMtrE", GXutil.ltrimstr( AV31BarAlbMtrE, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBPIE");
            GX_FocusControl = edtavBaralbpie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV32BarAlbPie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarAlbPie), 6, 0));
         }
         else
         {
            AV32BarAlbPie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarAlbPie), 6, 0));
         }
         cmbavAlbproval.setValue( httpContext.cgiGet( cmbavAlbproval.getInternalname()) );
         AV28AlbProVal = httpContext.cgiGet( cmbavAlbproval.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28AlbProVal", AV28AlbProVal);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbtub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbtub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBTUB");
            GX_FocusControl = edtavBaralbtub_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV33BarAlbTub = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarAlbTub), 6, 0));
         }
         else
         {
            AV33BarAlbTub = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbtub_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarAlbTub), 6, 0));
         }
         AV21AlbHdrObs = httpContext.cgiGet( edtavAlbhdrobs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21AlbHdrObs", AV21AlbHdrObs);
         AV40BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40BarEncCli", AV40BarEncCli);
         AV44BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44BarSer", AV44BarSer);
         AV45BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarSerDsc", AV45BarSerDsc);
         AV38BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38BarColNom", AV38BarColNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM");
            GX_FocusControl = edtavBarcolnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV39BarColNum = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarColNum), 6, 0));
         }
         else
         {
            AV39BarColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarColNum), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARTIPCOL");
            GX_FocusControl = edtavBartipcol_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV47BarTipCol = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47BarTipCol), 2, 0));
         }
         else
         {
            AV47BarTipCol = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBartipcol_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV47BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47BarTipCol), 2, 0));
         }
         AV43BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43BarNomCli", AV43BarNomCli);
         AV48BarTipCor = ((GXutil.strcmp(httpContext.cgiGet( chkavBartipcor.getInternalname()), "SI")==0) ? "SI" : "NO") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48BarTipCor", AV48BarTipCor);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSIT");
            GX_FocusControl = edtavBarsit_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46BarSit = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46BarSit), 2, 0));
         }
         else
         {
            AV46BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46BarSit), 2, 0));
         }
         AV79Barunimed = GXutil.upper( httpContext.cgiGet( edtavBarunimed_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV79Barunimed", AV79Barunimed);
         AV83BarTipDis = GXutil.upper( httpContext.cgiGet( edtavBartipdis_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83BarTipDis", AV83BarTipDis);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbund_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBaralbund_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARALBUND");
            GX_FocusControl = edtavBaralbund_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81BarAlbUnd = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81BarAlbUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81BarAlbUnd), 6, 0));
         }
         else
         {
            AV81BarAlbUnd = (int)(localUtil.ctol( httpContext.cgiGet( edtavBaralbund_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81BarAlbUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81BarAlbUnd), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbpmppza_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbpmppza_Internalname)), DecimalUtil.stringToDec("99.999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBPMPPZA");
            GX_FocusControl = edtavAlbpmppza_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV85AlbpmpPza = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85AlbpmpPza", GXutil.ltrimstr( AV85AlbpmpPza, 6, 3));
         }
         else
         {
            AV85AlbpmpPza = localUtil.ctond( httpContext.cgiGet( edtavAlbpmppza_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV85AlbpmpPza", GXutil.ltrimstr( AV85AlbpmpPza, 6, 3));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV50CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50CliCod), 6, 0));
         }
         else
         {
            AV50CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50CliCod), 6, 0));
         }
         cmbavBarestreo.setValue( httpContext.cgiGet( cmbavBarestreo.getInternalname()) );
         AV41BarEstReo = (byte)(GXutil.lval( httpContext.cgiGet( cmbavBarestreo.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41BarEstReo", GXutil.str( AV41BarEstReo, 1, 0));
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM");
            GX_FocusControl = edtavBarkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42BarKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42BarKgm", GXutil.ltrimstr( AV42BarKgm, 9, 2));
         }
         else
         {
            AV42BarKgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42BarKgm", GXutil.ltrimstr( AV42BarKgm, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIE");
            GX_FocusControl = edtavBarpie_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV84barpie = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84barpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84barpie), 6, 0));
         }
         else
         {
            AV84barpie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV84barpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84barpie), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavKilant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavKilant_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vKILANT");
            GX_FocusControl = edtavKilant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV61KilAnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61KilAnt", GXutil.ltrimstr( AV61KilAnt, 9, 2));
         }
         else
         {
            AV61KilAnt = localUtil.ctond( httpContext.cgiGet( edtavKilant_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61KilAnt", GXutil.ltrimstr( AV61KilAnt, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavMetant_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavMetant_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vMETANT");
            GX_FocusControl = edtavMetant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63MetAnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63MetAnt", GXutil.ltrimstr( AV63MetAnt, 9, 2));
         }
         else
         {
            AV63MetAnt = localUtil.ctond( httpContext.cgiGet( edtavMetant_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63MetAnt", GXutil.ltrimstr( AV63MetAnt, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPieant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPieant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPIEANT");
            GX_FocusControl = edtavPieant_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV67PieAnt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67PieAnt), 6, 0));
         }
         else
         {
            AV67PieAnt = (int)(localUtil.ctol( httpContext.cgiGet( edtavPieant_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV67PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67PieAnt), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCAD");
            GX_FocusControl = edtavBarcad_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV34barcad = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34barcad), 4, 0));
         }
         else
         {
            AV34barcad = (short)(localUtil.ctol( httpContext.cgiGet( edtavBarcad_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34barcad), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBBAR");
            GX_FocusControl = edtavAlbbar_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17albbar = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17albbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17albbar), 4, 0));
         }
         else
         {
            AV17albbar = (short)(localUtil.ctol( httpContext.cgiGet( edtavAlbbar_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17albbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17albbar), 4, 0));
         }
         AV88Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88Pgmname", AV88Pgmname);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTubcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTubcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTUBCOD");
            GX_FocusControl = edtavTubcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV71TubCod = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TubCod), 4, 0));
         }
         else
         {
            AV71TubCod = (short)(localUtil.ctol( httpContext.cgiGet( edtavTubcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV71TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TubCod), 4, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DocumentodeTransporteProduccion_40");
         AV88Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV88Pgmname", AV88Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV88Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("documentotransporteproduccion\\documentodetransporteproduccion_40:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
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
      e132952 ();
      if (returnInSub) return;
   }

   public void e132952( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV70Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      documentodetransporteproduccion_40_impl.this.GXt_char1 = GXv_char2[0] ;
      AV70Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV70Station", AV70Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV70Station, ""))));
      GXv_char2[0] = AV53EmprCod ;
      GXv_char3[0] = AV54EmprNom ;
      GXv_char4[0] = AV74UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV70Station, GXv_char2, GXv_char3, GXv_char4) ;
      documentodetransporteproduccion_40_impl.this.AV53EmprCod = GXv_char2[0] ;
      documentodetransporteproduccion_40_impl.this.AV54EmprNom = GXv_char3[0] ;
      documentodetransporteproduccion_40_impl.this.AV74UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53EmprCod", AV53EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV74UsurCod", AV74UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV74UsurCod, "@!"))));
      edtavTubcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTubcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTubcod_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOTUBCOD' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S122 ();
      if (returnInSub) return;
      GXt_int5 = (byte)(AV64Moda21) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int6) ;
      documentodetransporteproduccion_40_impl.this.GXt_int5 = GXv_int6[0] ;
      AV64Moda21 = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV64Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV64Moda21), "ZZZ9")));
      GXt_int5 = (byte)(AV55errkgs) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "ERRKGS", ""), GXv_int6) ;
      documentodetransporteproduccion_40_impl.this.GXt_int5 = GXv_int6[0] ;
      AV55errkgs = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55errkgs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55errkgs), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRKGS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV55errkgs), "ZZZ9")));
      GXt_int5 = (byte)(AV65Nofases) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "NOFASE", ""), GXv_int6) ;
      documentodetransporteproduccion_40_impl.this.GXt_int5 = GXv_int6[0] ;
      AV65Nofases = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Nofases", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV65Nofases), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOFASES", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV65Nofases), "ZZZ9")));
      GXt_int5 = (byte)(AV68Plasticos) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "PLASTI", ""), GXv_int6) ;
      documentodetransporteproduccion_40_impl.this.GXt_int5 = GXv_int6[0] ;
      AV68Plasticos = GXt_int5 ;
      GXt_int5 = (byte)(AV73Tubos) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "TUBOSS", ""), GXv_int6) ;
      documentodetransporteproduccion_40_impl.this.GXt_int5 = GXv_int6[0] ;
      AV73Tubos = GXt_int5 ;
      GXt_int5 = (byte)(AV57FlagFas) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "ALBFAS", ""), GXv_int6) ;
      documentodetransporteproduccion_40_impl.this.GXt_int5 = GXv_int6[0] ;
      AV57FlagFas = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57FlagFas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57FlagFas), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGFAS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV57FlagFas), "ZZZ9")));
      GXt_int5 = (byte)(AV82lavanderiaprecio) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "PVPPDA", ""), GXv_int6) ;
      documentodetransporteproduccion_40_impl.this.GXt_int5 = GXv_int6[0] ;
      AV82lavanderiaprecio = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV82lavanderiaprecio", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV82lavanderiaprecio), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vLAVANDERIAPRECIO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV82lavanderiaprecio), "ZZZ9")));
      edtavBaralbund_Visible = AV82lavanderiaprecio ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbund_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbund_Visible), 5, 0), true);
      imgavPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "gximage", imgavPrompt_gximage, true);
      AV69Prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV69Prompt)==0) ? AV89Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV69Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV69Prompt), true);
      AV89Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "Bitmap", ((GXutil.strcmp("", AV69Prompt)==0) ? AV89Prompt_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV69Prompt))), true);
      httpContext.ajax_rsp_assign_prop("", false, imgavPrompt_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV69Prompt), true);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
      bttBtnenter_Enabled = ((AV18AlbEnvFtp==3)||(GXutil.strcmp(AV23AlbLic, " ")!=0)||(AV25AlbProEst==2)||(GXutil.strcmp(AV80AlbMarca, "A")==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Enabled), 5, 0), true);
      bttBtnhashcomunicarat_Enabled = ((AV18AlbEnvFtp==3)||(GXutil.strcmp(AV23AlbLic, " ")!=0)||(AV25AlbProEst==2)||(GXutil.strcmp(AV80AlbMarca, "A")==0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnhashcomunicarat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnhashcomunicarat_Enabled), 5, 0), true);
      AV28AlbProVal = ((GXutil.strcmp(AV27AlbProPri, "0")==0) ? "N" : "S") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28AlbProVal", AV28AlbProVal);
      /* Object Property */
      if ( true )
      {
         bDynCreated_Wcdocumentodetransporteproduccion_41 = true ;
      }
      if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_41_Component), GXutil.lower( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41")) != 0 )
      {
         WebComp_Wcdocumentodetransporteproduccion_41 = WebUtils.getWebComponent(getClass(), "app.documentotransporteproduccion.documentodetransporteproduccion_41_impl", remoteHandle, context);
         WebComp_Wcdocumentodetransporteproduccion_41_Component = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41" ;
      }
      if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_41_Component) != 0 )
      {
         WebComp_Wcdocumentodetransporteproduccion_41.setjustcreated();
         WebComp_Wcdocumentodetransporteproduccion_41.componentprepare(new Object[] {"W0199","",AV53EmprCod,Long.valueOf(AV24AlbProCod),Integer.valueOf(AV58Guiremcli),AV59GuiRemCln,AV26AlbProFch,AV29AlbSec,AV27AlbProPri,Byte.valueOf(AV18AlbEnvFtp),AV23AlbLic,AV22AlbHhfm,Byte.valueOf(AV25AlbProEst),AV30BarAlbKgmE,AV31BarAlbMtrE,AV80AlbMarca});
         WebComp_Wcdocumentodetransporteproduccion_41.componentbind(new Object[] {"","vALBPROCOD","vGUIREMCLI","","","","vALBPROPRI","vALBENVFTP","vALBLIC","","","vBARALBKGME","vBARALBMTRE",""});
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e142952 ();
      if (returnInSub) return;
   }

   public void e142952( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV18AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV23AlbLic, " ") != 0 ) || ( AV25AlbProEst == 2 ) || ( GXutil.strcmp(AV80AlbMarca, "A") == 0 ) )
      {
         lblTbmessage_Caption = ((AV25AlbProEst==2) ? httpContext.getMessage( "Guia faturada", "") : httpContext.getMessage( "Comunicada a AT", "")) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         if ( GXutil.strcmp(AV80AlbMarca, "A") == 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Guia ANULADA", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV35BarCod) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "NO hay valor en N OS", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV50CliCod != AV58Guiremcli )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Cliente errado", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavBarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( ( AV46BarSit == 9 ) && ( AV17albbar == 0 ) )
               {
                  GX_FocusControl = edtavBarcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
                  lblTbmessage_Caption = httpContext.getMessage( "Ordem Serviço está fechado", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               }
               else
               {
                  if ( ( AV46BarSit == 11 ) && ( AV17albbar == 0 ) )
                  {
                     GX_FocusControl = edtavBarcod_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                     lblTbmessage_Caption = httpContext.getMessage( "Ordem Serviço está no HISTÓRICO", "") ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  }
                  else
                  {
                     if ( ( GXutil.strcmp(AV27AlbProPri, "1") == 0 ) && ( AV41BarEstReo == 2 ) && ( AV64Moda21 == 1 ) )
                     {
                        GX_FocusControl = edtavBarcod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                        lblTbmessage_Caption = httpContext.getMessage( "Ordem Serviço nao autorizada. Es uma Reclamaçao ¡¡¡", "") ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     }
                     else
                     {
                        if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30BarAlbKgmE)==0) && (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31BarAlbMtrE)==0) )
                        {
                           GX_FocusControl = edtavBaralbkgme_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                           lblTbmessage_Caption = httpContext.getMessage( "Os quilos e metros introduzidos têm o valor 0", "") ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        }
                        else
                        {
                           if ( ( AV64Moda21 == 1 ) && ( DecimalUtil.compareTo(AV30BarAlbKgmE, AV42BarKgm) > 0 ) && ( AV55errkgs == 1 ) )
                           {
                              GX_FocusControl = edtavBaralbkgme_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              httpContext.doAjaxSetFocus(GX_FocusControl);
                              lblTbmessage_Caption = httpContext.getMessage( "Os quilos saidos= ", "")+GXutil.trim( GXutil.str( AV30BarAlbKgmE, 9, 2))+httpContext.getMessage( ", são maiores do que os quilos da OS= ", "")+GXutil.trim( GXutil.str( AV42BarKgm, 9, 2)) ;
                              httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           }
                           else
                           {
                              if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV30BarAlbKgmE)==0) && ( GXutil.strcmp(AV79Barunimed, httpContext.getMessage( "K", "")) == 0 ) )
                              {
                                 GX_FocusControl = edtavBaralbkgme_Internalname ;
                                 httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                 httpContext.doAjaxSetFocus(GX_FocusControl);
                                 lblTbmessage_Caption = httpContext.getMessage( "Os quilos têm valor zero e a unidade é K.", "") ;
                                 httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                              }
                              else
                              {
                                 if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV31BarAlbMtrE)==0) && ( GXutil.strcmp(AV79Barunimed, httpContext.getMessage( "M", "")) == 0 ) )
                                 {
                                    GX_FocusControl = edtavBaralbkgme_Internalname ;
                                    httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                    httpContext.doAjaxSetFocus(GX_FocusControl);
                                    lblTbmessage_Caption = httpContext.getMessage( "Os metros têm valor zero e a unidade é K.", "") ;
                                    httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                                 }
                                 else
                                 {
                                    if ( ( GXutil.strcmp(AV83BarTipDis, "L") == 0 ) && ( AV32BarAlbPie == 0 ) && ( AV64Moda21 == 1 ) && ( AV82lavanderiaprecio == 1 ) )
                                    {
                                       GX_FocusControl = edtavBaralbpie_Internalname ;
                                       httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                       httpContext.doAjaxSetFocus(GX_FocusControl);
                                       lblTbmessage_Caption = httpContext.getMessage( "Trata-se de uma produção de LAVANDARIA, o número de peças é obrigatório.", "") ;
                                       httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                                    }
                                    else
                                    {
                                       if ( ( AV64Moda21 == 1 ) && ( GXutil.strcmp(AV83BarTipDis, "L") == 0 ) && ( AV32BarAlbPie > AV84barpie ) && ( AV82lavanderiaprecio == 1 ) )
                                       {
                                          GX_FocusControl = edtavBaralbpie_Internalname ;
                                          httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                                          httpContext.doAjaxSetFocus(GX_FocusControl);
                                          lblTbmessage_Caption = httpContext.getMessage( "O número de peças entregues= ", "")+GXutil.trim( GXutil.str( AV32BarAlbPie, 6, 0))+httpContext.getMessage( ", é superior ao número de peças do O.S= ", "")+GXutil.trim( GXutil.str( AV84barpie, 6, 0)) ;
                                          httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                                       }
                                       else
                                       {
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
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e122952( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S132 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      cmbavAlbproval.setValue( GXutil.rtrim( AV28AlbProVal) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproval.getInternalname(), "Values", cmbavAlbproval.ToJavascriptSource(), true);
      cmbavBarestreo.setValue( GXutil.trim( GXutil.str( AV41BarEstReo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarestreo.getInternalname(), "Values", cmbavBarestreo.ToJavascriptSource(), true);
   }

   public void e152952( )
   {
      /* 'Dohashcomunicarat' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_12", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV53EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV24AlbProCod,10,0))}, new String[] {"Mode","EmprCod","AlbProCod"}) , new Object[] {});
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentotransporteproduccion_fecha_hora_salida_hash", new String[] {GXutil.URLEncode(GXutil.rtrim(AV53EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV24AlbProCod,10,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV22AlbHhfm)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV78AlbProsal)),GXutil.URLEncode(GXutil.rtrim(AV27AlbProPri)),GXutil.URLEncode(GXutil.rtrim(AV49Cadena)),GXutil.URLEncode(GXutil.rtrim(AV60Hash))}, new String[] {"EmprCod","AlbProcod","AlbHhfm","AlbProSal","ALbProPri","Cadena","Hash"}) , new Object[] {"AV53EmprCod","AV24AlbProCod","AV22AlbHhfm","AV78AlbProsal","AV27AlbProPri","AV49Cadena","AV60Hash"});
      new app.documentotransporteproduccion.eliminaciondocumento(remoteHandle, context).execute( AV53EmprCod, AV24AlbProCod) ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      cmbavAlbpropri.setValue( GXutil.rtrim( AV27AlbProPri) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbpropri.getInternalname(), "Values", cmbavAlbpropri.ToJavascriptSource(), true);
   }

   public void e162952( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      if ( ( AV18AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV23AlbLic, " ") != 0 ) || ( AV25AlbProEst == 2 ) || ( GXutil.strcmp(AV80AlbMarca, "A") == 0 ) )
      {
         lblTbmessage_Caption = ((AV25AlbProEst==2) ? httpContext.getMessage( "Guia faturada", "") : httpContext.getMessage( "Comunicada a AT", "")) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         if ( GXutil.strcmp(AV80AlbMarca, "A") == 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Guia Anulada", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         new app.documentotransporteproduccion.documentodetransporteproduccion_getins_upd(remoteHandle, context).execute( AV53EmprCod, AV24AlbProCod, AV35BarCod, AV37BarCodReo, AV36BarCodPar, AV30BarAlbKgmE, AV19AlbHdrAnc, AV20AlbHdrgm2, AV31BarAlbMtrE, AV32BarAlbPie, AV71TubCod, AV33BarAlbTub, AV28AlbProVal, AV21AlbHdrObs, AV57FlagFas, AV64Moda21, AV17albbar, AV63MetAnt, AV61KilAnt, AV67PieAnt, AV74UsurCod, AV70Station) ;
         if ( ( AV64Moda21 == 1 ) && ( GXutil.strcmp(AV48BarTipCor, "SI") == 0 ) )
         {
            AV77Pzs = AV32BarAlbPie ;
            AV75Kgs = AV30BarAlbKgmE ;
            AV76Mts = AV31BarAlbMtrE ;
            GXv_int7[0] = AV77Pzs ;
            GXv_decimal8[0] = AV75Kgs ;
            GXv_decimal9[0] = AV76Mts ;
            GXv_char4[0] = AV16MetPieCtr ;
            GXv_char3[0] = Gx_msg ;
            new app.pmetpiacopy1(remoteHandle, context).execute( AV53EmprCod, AV35BarCod, AV37BarCodReo, AV36BarCodPar, AV24AlbProCod, GXv_int7, GXv_decimal8, GXv_decimal9, GXv_char4, GXv_char3) ;
            documentodetransporteproduccion_40_impl.this.AV77Pzs = GXv_int7[0] ;
            documentodetransporteproduccion_40_impl.this.AV75Kgs = GXv_decimal8[0] ;
            documentodetransporteproduccion_40_impl.this.AV76Mts = GXv_decimal9[0] ;
            documentodetransporteproduccion_40_impl.this.AV16MetPieCtr = GXv_char4[0] ;
            documentodetransporteproduccion_40_impl.this.Gx_msg = GXv_char3[0] ;
            httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_piezas", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV53EmprCod)),GXutil.URLEncode(GXutil.rtrim("9999999999")),GXutil.URLEncode(GXutil.ltrimstr(AV35BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV36BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV24AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV77Pzs,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV75Kgs)),GXutil.URLEncode(DecimalUtil.decToString(AV76Mts)),GXutil.URLEncode(GXutil.rtrim(AV16MetPieCtr)),GXutil.URLEncode(GXutil.rtrim(AV13Mensaje))}, new String[] {"Modo","EmprCod","MetTerCod","BarCod","BarCodReo","BarCodPar","AlbProCod","Pzs","Kgs","Mts","MetPiectr","Mensaje"}) , new Object[] {});
         }
         httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_8", new String[] {GXutil.URLEncode(GXutil.rtrim(AV53EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV35BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV36BarCodPar)),GXutil.URLEncode(DecimalUtil.decToString(AV30BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(AV31BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(AV32BarAlbPie,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV61KilAnt)),GXutil.URLEncode(DecimalUtil.decToString(AV63MetAnt)),GXutil.URLEncode(GXutil.ltrimstr(AV67PieAnt,6,0)),GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.ltrimstr(AV46BarSit,2,0)),GXutil.URLEncode(GXutil.formatDateParm(AV26AlbProFch))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","BarAlbKgmE","BarAlbMtrE","BarAlbPie","KilAnt","MtrAnt","PieAnt","Mode","BarSit","AlbProFch"}) , new Object[] {});
         if ( (0==AV65Nofases) )
         {
            httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV53EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV24AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV35BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV36BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV58Guiremcli,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV30BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(AV31BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(AV18AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV23AlbLic)),GXutil.URLEncode(GXutil.ltrimstr(AV25AlbProEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV80AlbMarca))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","BarAlbKgmE","BarAlbMtrE","AlbEnvFtp","AlbLic","AlbProEst","albmarca"}) , new Object[] {});
         }
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wcdocumentodetransporteproduccion_41 = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wcdocumentodetransporteproduccion_41_Component), GXutil.lower( "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41")) != 0 )
         {
            WebComp_Wcdocumentodetransporteproduccion_41 = WebUtils.getWebComponent(getClass(), "app.documentotransporteproduccion.documentodetransporteproduccion_41_impl", remoteHandle, context);
            WebComp_Wcdocumentodetransporteproduccion_41_Component = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_41" ;
         }
         if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_41_Component) != 0 )
         {
            WebComp_Wcdocumentodetransporteproduccion_41.setjustcreated();
            WebComp_Wcdocumentodetransporteproduccion_41.componentprepare(new Object[] {"W0199","",AV53EmprCod,Long.valueOf(AV24AlbProCod),Integer.valueOf(AV58Guiremcli),AV59GuiRemCln,AV26AlbProFch,AV29AlbSec,AV27AlbProPri,Byte.valueOf(AV18AlbEnvFtp),AV23AlbLic,AV22AlbHhfm,Byte.valueOf(AV25AlbProEst),AV30BarAlbKgmE,AV31BarAlbMtrE,AV80AlbMarca});
            WebComp_Wcdocumentodetransporteproduccion_41.componentbind(new Object[] {"","vALBPROCOD","vGUIREMCLI","","","","vALBPROPRI","vALBENVFTP","vALBLIC","","","vBARALBKGME","vBARALBMTRE",""});
         }
         if ( isFullAjaxMode( ) || isAjaxCallMode( ) && bDynCreated_Wcdocumentodetransporteproduccion_41 )
         {
            httpContext.ajax_rspStartCmp("gxHTMLWrpW0199"+"");
            WebComp_Wcdocumentodetransporteproduccion_41.componentdraw();
            httpContext.ajax_rspEndCmp();
         }
         AV35BarCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35BarCod), 8, 0));
         AV37BarCodReo = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV37BarCodReo", GXutil.str( AV37BarCodReo, 1, 0));
         AV36BarCodPar = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV36BarCodPar", AV36BarCodPar);
         AV19AlbHdrAnc = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbHdrAnc), 4, 0));
         AV20AlbHdrgm2 = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbHdrgm2), 4, 0));
         AV21AlbHdrObs = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21AlbHdrObs", AV21AlbHdrObs);
         AV30BarAlbKgmE = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30BarAlbKgmE", GXutil.ltrimstr( AV30BarAlbKgmE, 9, 2));
         AV31BarAlbMtrE = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31BarAlbMtrE", GXutil.ltrimstr( AV31BarAlbMtrE, 9, 2));
         AV32BarAlbPie = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarAlbPie), 6, 0));
         AV33BarAlbTub = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV33BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarAlbTub), 6, 0));
         AV71TubCod = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TubCod), 4, 0));
         Combo_tubcod_Selectedvalue_set = GXutil.trim( GXutil.str( AV71TubCod, 4, 0)) ;
         ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "SelectedValue_set", Combo_tubcod_Selectedvalue_set);
         AV28AlbProVal = ((GXutil.strcmp(AV27AlbProPri, "0")==0) ? "N" : "S") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28AlbProVal", AV28AlbProVal);
         AV40BarEncCli = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40BarEncCli", AV40BarEncCli);
         AV44BarSer = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44BarSer", AV44BarSer);
         AV45BarSerDsc = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45BarSerDsc", AV45BarSerDsc);
         AV38BarColNom = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38BarColNom", AV38BarColNom);
         AV39BarColNum = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV39BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarColNum), 6, 0));
         AV47BarTipCol = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47BarTipCol), 2, 0));
         AV43BarNomCli = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43BarNomCli", AV43BarNomCli);
         AV8barnumcli = 0 ;
         AV46BarSit = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV46BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46BarSit), 2, 0));
         AV48BarTipCor = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48BarTipCor", AV48BarTipCor);
         AV50CliCod = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50CliCod), 6, 0));
         AV41BarEstReo = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41BarEstReo", GXutil.str( AV41BarEstReo, 1, 0));
         AV42BarKgm = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42BarKgm", GXutil.ltrimstr( AV42BarKgm, 9, 2));
         AV61KilAnt = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61KilAnt", GXutil.ltrimstr( AV61KilAnt, 9, 2));
         AV63MetAnt = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63MetAnt", GXutil.ltrimstr( AV63MetAnt, 9, 2));
         AV67PieAnt = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV67PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67PieAnt), 6, 0));
         AV34barcad = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV34barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34barcad), 4, 0));
         AV17albbar = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17albbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17albbar), 4, 0));
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         AV83BarTipDis = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83BarTipDis", AV83BarTipDis);
         AV81BarAlbUnd = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV81BarAlbUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81BarAlbUnd), 6, 0));
         AV85AlbpmpPza = DecimalUtil.ZERO ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85AlbpmpPza", GXutil.ltrimstr( AV85AlbpmpPza, 6, 3));
         lblTbmessage_Caption = " " ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
      }
   }

   public void S122( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( 1 == 2 ) ) )
      {
         divDvpanel_unnamedtable3_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
      }
      else
      {
         divDvpanel_unnamedtable3_cell_Class = "col-xs-12" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_unnamedtable3_cell_Internalname, "Class", divDvpanel_unnamedtable3_cell_Class, true);
      }
   }

   public void S112( )
   {
      /* 'LOADCOMBOTUBCOD' Routine */
      returnInSub = false ;
      /* Using cursor H02952 */
      pr_default.execute(0);
      while ( (pr_default.getStatus(0) != 101) )
      {
         A13813TubNomID = H02952_A13813TubNomID[0] ;
         A1207TubNom = H02952_A1207TubNom[0] ;
         n1207TubNom = H02952_n1207TubNom[0] ;
         A1206TubCod = H02952_A1206TubCod[0] ;
         AV52Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV52Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( GXutil.trim( GXutil.str( A1206TubCod, 4, 0)) );
         AV52Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13813TubNomID );
         AV72TubCod_Data.add(AV52Combo_DataItem, 0);
         pr_default.readNext(0);
      }
      pr_default.close(0);
      Combo_tubcod_Selectedvalue_set = ((0==AV71TubCod) ? "" : GXutil.trim( GXutil.str( AV71TubCod, 4, 0))) ;
      ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "SelectedValue_set", Combo_tubcod_Selectedvalue_set);
   }

   public void e172952( )
   {
      /* Barcod_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV18AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV23AlbLic, " ") != 0 ) || ( AV25AlbProEst == 2 ) || ( GXutil.strcmp(AV80AlbMarca, "A") == 0 ) )
      {
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
         if ( ( AV18AlbEnvFtp == 3 ) || ( GXutil.strcmp(AV23AlbLic, " ") != 0 ) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Guia comunicada a AT", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         if ( AV25AlbProEst == 2 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Guia faturadaT", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
         if ( GXutil.strcmp(AV80AlbMarca, "A") == 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Guia ANULADA", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
      }
      else
      {
         if ( (0==AV35BarCod) )
         {
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            lblTbmessage_Caption = httpContext.getMessage( "NO hay valor en N OS", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e182952( )
   {
      /* Barcodpar_Isvalid Routine */
      returnInSub = false ;
      edtavBaralbmtre_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbmtre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmtre_Visible), 5, 0), true);
      edtavAlbhdranc_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbhdranc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbhdranc_Visible), 5, 0), true);
      edtavAlbhdrgm2_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbhdrgm2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbhdrgm2_Visible), 5, 0), true);
      edtavTubcod_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTubcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTubcod_Visible), 5, 0), true);
      edtavBaralbtub_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaralbtub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbtub_Visible), 5, 0), true);
      Combo_tubcod_Visible = GXutil.toBoolean( 1) ;
      ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "Visible", GXutil.booltostr( Combo_tubcod_Visible));
      lblTextblockcombo_tubcod_Visible = 1 ;
      httpContext.ajax_rsp_assign_prop("", false, lblTextblockcombo_tubcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTextblockcombo_tubcod_Visible), 5, 0), true);
      GXv_decimal9[0] = AV30BarAlbKgmE ;
      GXv_int10[0] = AV19AlbHdrAnc ;
      GXv_int11[0] = AV20AlbHdrgm2 ;
      GXv_decimal8[0] = AV31BarAlbMtrE ;
      GXv_int7[0] = AV32BarAlbPie ;
      GXv_int12[0] = AV71TubCod ;
      GXv_int13[0] = AV33BarAlbTub ;
      GXv_char4[0] = AV28AlbProVal ;
      GXv_int6[0] = AV41BarEstReo ;
      GXv_char3[0] = AV48BarTipCor ;
      GXv_int14[0] = AV46BarSit ;
      GXv_char2[0] = AV43BarNomCli ;
      GXv_int15[0] = AV8barnumcli ;
      GXv_char16[0] = AV44BarSer ;
      GXv_char17[0] = AV45BarSerDsc ;
      GXv_int18[0] = AV11bartipart ;
      GXv_int19[0] = AV47BarTipCol ;
      GXv_int20[0] = AV50CliCod ;
      GXv_char21[0] = AV40BarEncCli ;
      GXv_char22[0] = AV21AlbHdrObs ;
      GXv_int23[0] = AV34barcad ;
      GXv_int24[0] = AV17albbar ;
      GXv_decimal25[0] = AV42BarKgm ;
      GXv_decimal26[0] = AV61KilAnt ;
      GXv_decimal27[0] = AV63MetAnt ;
      GXv_int28[0] = AV67PieAnt ;
      GXv_char29[0] = AV38BarColNom ;
      GXv_int30[0] = AV39BarColNum ;
      GXv_char31[0] = AV79Barunimed ;
      GXv_int32[0] = AV81BarAlbUnd ;
      GXv_char33[0] = AV83BarTipDis ;
      GXv_int34[0] = AV84barpie ;
      GXv_decimal35[0] = AV85AlbpmpPza ;
      new app.documentotransporteproduccion.documentodetransporteproduccion_20_prc(remoteHandle, context).execute( AV53EmprCod, AV24AlbProCod, AV35BarCod, AV37BarCodReo, AV36BarCodPar, GXv_decimal9, GXv_int10, GXv_int11, GXv_decimal8, GXv_int7, GXv_int12, GXv_int13, GXv_char4, GXv_int6, GXv_char3, GXv_int14, GXv_char2, GXv_int15, GXv_char16, GXv_char17, GXv_int18, GXv_int19, GXv_int20, GXv_char21, GXv_char22, GXv_int23, GXv_int24, GXv_decimal25, GXv_decimal26, GXv_decimal27, GXv_int28, GXv_char29, GXv_int30, GXv_char31, AV27AlbProPri, GXv_int32, GXv_char33, GXv_int34, GXv_decimal35) ;
      documentodetransporteproduccion_40_impl.this.AV30BarAlbKgmE = GXv_decimal9[0] ;
      documentodetransporteproduccion_40_impl.this.AV19AlbHdrAnc = GXv_int10[0] ;
      documentodetransporteproduccion_40_impl.this.AV20AlbHdrgm2 = GXv_int11[0] ;
      documentodetransporteproduccion_40_impl.this.AV31BarAlbMtrE = GXv_decimal8[0] ;
      documentodetransporteproduccion_40_impl.this.AV32BarAlbPie = GXv_int7[0] ;
      documentodetransporteproduccion_40_impl.this.AV71TubCod = GXv_int12[0] ;
      documentodetransporteproduccion_40_impl.this.AV33BarAlbTub = GXv_int13[0] ;
      documentodetransporteproduccion_40_impl.this.AV28AlbProVal = GXv_char4[0] ;
      documentodetransporteproduccion_40_impl.this.AV41BarEstReo = GXv_int6[0] ;
      documentodetransporteproduccion_40_impl.this.AV48BarTipCor = GXv_char3[0] ;
      documentodetransporteproduccion_40_impl.this.AV46BarSit = GXv_int14[0] ;
      documentodetransporteproduccion_40_impl.this.AV43BarNomCli = GXv_char2[0] ;
      documentodetransporteproduccion_40_impl.this.AV8barnumcli = GXv_int15[0] ;
      documentodetransporteproduccion_40_impl.this.AV44BarSer = GXv_char16[0] ;
      documentodetransporteproduccion_40_impl.this.AV45BarSerDsc = GXv_char17[0] ;
      documentodetransporteproduccion_40_impl.this.AV11bartipart = GXv_int18[0] ;
      documentodetransporteproduccion_40_impl.this.AV47BarTipCol = GXv_int19[0] ;
      documentodetransporteproduccion_40_impl.this.AV50CliCod = GXv_int20[0] ;
      documentodetransporteproduccion_40_impl.this.AV40BarEncCli = GXv_char21[0] ;
      documentodetransporteproduccion_40_impl.this.AV21AlbHdrObs = GXv_char22[0] ;
      documentodetransporteproduccion_40_impl.this.AV34barcad = GXv_int23[0] ;
      documentodetransporteproduccion_40_impl.this.AV17albbar = GXv_int24[0] ;
      documentodetransporteproduccion_40_impl.this.AV42BarKgm = GXv_decimal25[0] ;
      documentodetransporteproduccion_40_impl.this.AV61KilAnt = GXv_decimal26[0] ;
      documentodetransporteproduccion_40_impl.this.AV63MetAnt = GXv_decimal27[0] ;
      documentodetransporteproduccion_40_impl.this.AV67PieAnt = GXv_int28[0] ;
      documentodetransporteproduccion_40_impl.this.AV38BarColNom = GXv_char29[0] ;
      documentodetransporteproduccion_40_impl.this.AV39BarColNum = GXv_int30[0] ;
      documentodetransporteproduccion_40_impl.this.AV79Barunimed = GXv_char31[0] ;
      documentodetransporteproduccion_40_impl.this.AV81BarAlbUnd = GXv_int32[0] ;
      documentodetransporteproduccion_40_impl.this.AV83BarTipDis = GXv_char33[0] ;
      documentodetransporteproduccion_40_impl.this.AV84barpie = GXv_int34[0] ;
      documentodetransporteproduccion_40_impl.this.AV85AlbpmpPza = GXv_decimal35[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30BarAlbKgmE", GXutil.ltrimstr( AV30BarAlbKgmE, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV19AlbHdrAnc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbHdrAnc), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV20AlbHdrgm2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20AlbHdrgm2), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV31BarAlbMtrE", GXutil.ltrimstr( AV31BarAlbMtrE, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV32BarAlbPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32BarAlbPie), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV71TubCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71TubCod), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV33BarAlbTub", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33BarAlbTub), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV28AlbProVal", AV28AlbProVal);
      httpContext.ajax_rsp_assign_attri("", false, "AV41BarEstReo", GXutil.str( AV41BarEstReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV48BarTipCor", AV48BarTipCor);
      httpContext.ajax_rsp_assign_attri("", false, "AV46BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46BarSit), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV43BarNomCli", AV43BarNomCli);
      httpContext.ajax_rsp_assign_attri("", false, "AV44BarSer", AV44BarSer);
      httpContext.ajax_rsp_assign_attri("", false, "AV45BarSerDsc", AV45BarSerDsc);
      httpContext.ajax_rsp_assign_attri("", false, "AV47BarTipCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47BarTipCol), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV50CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50CliCod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV40BarEncCli", AV40BarEncCli);
      httpContext.ajax_rsp_assign_attri("", false, "AV21AlbHdrObs", AV21AlbHdrObs);
      httpContext.ajax_rsp_assign_attri("", false, "AV34barcad", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34barcad), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17albbar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17albbar), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV42BarKgm", GXutil.ltrimstr( AV42BarKgm, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV61KilAnt", GXutil.ltrimstr( AV61KilAnt, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV63MetAnt", GXutil.ltrimstr( AV63MetAnt, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV67PieAnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV67PieAnt), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38BarColNom", AV38BarColNom);
      httpContext.ajax_rsp_assign_attri("", false, "AV39BarColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39BarColNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV79Barunimed", AV79Barunimed);
      httpContext.ajax_rsp_assign_attri("", false, "AV81BarAlbUnd", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81BarAlbUnd), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV83BarTipDis", AV83BarTipDis);
      httpContext.ajax_rsp_assign_attri("", false, "AV84barpie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV84barpie), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV85AlbpmpPza", GXutil.ltrimstr( AV85AlbpmpPza, 6, 3));
      Combo_tubcod_Selectedvalue_set = ((0==AV71TubCod) ? "" : GXutil.trim( GXutil.str( AV71TubCod, 4, 0))) ;
      ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "SelectedValue_set", Combo_tubcod_Selectedvalue_set);
      if ( (0==AV34barcad) )
      {
         GX_FocusControl = edtavBarcod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
         lblTbmessage_Caption = httpContext.getMessage( "NO existe N OS", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         if ( ( GXutil.strcmp(AV27AlbProPri, "1") == 0 ) && ( AV41BarEstReo == 2 ) && ( AV64Moda21 == 1 ) )
         {
            GX_FocusControl = edtavBarcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
            httpContext.doAjaxRefresh();
            lblTbmessage_Caption = httpContext.getMessage( "Ordem Serviço nao autorizada. Es uma Reclamaçao ¡¡¡", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
      }
      if ( GXutil.strcmp(AV83BarTipDis, "L") == 0 )
      {
         edtavBaralbmtre_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBaralbmtre_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbmtre_Visible), 5, 0), true);
         edtavAlbhdranc_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAlbhdranc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbhdranc_Visible), 5, 0), true);
         edtavAlbhdrgm2_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavAlbhdrgm2_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbhdrgm2_Visible), 5, 0), true);
         edtavTubcod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavTubcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTubcod_Visible), 5, 0), true);
         edtavBaralbtub_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBaralbtub_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaralbtub_Visible), 5, 0), true);
         Combo_tubcod_Visible = GXutil.toBoolean( 0) ;
         ucCombo_tubcod.sendProperty(context, "", false, Combo_tubcod_Internalname, "Visible", GXutil.booltostr( Combo_tubcod_Visible));
         lblTextblockcombo_tubcod_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTextblockcombo_tubcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTextblockcombo_tubcod_Visible), 5, 0), true);
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      cmbavBarestreo.setValue( GXutil.trim( GXutil.str( AV41BarEstReo, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarestreo.getInternalname(), "Values", cmbavBarestreo.ToJavascriptSource(), true);
      cmbavAlbproval.setValue( GXutil.rtrim( AV28AlbProVal) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAlbproval.getInternalname(), "Values", cmbavAlbproval.ToJavascriptSource(), true);
   }

   public void e192952( )
   {
      /* Albproval_Isvalid Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(AV28AlbProVal, "S") == 0 ) && ( AV34barcad == 1 ) && ( AV17albbar == 0 ) )
      {
         GXv_decimal35[0] = AV9BarPreKgm ;
         GXv_decimal27[0] = AV10BarPreMtr ;
         GXv_int19[0] = AV5AlbProEsp ;
         GXv_decimal26[0] = AV6AlbProRec ;
         GXv_char33[0] = AV7BarFasExt ;
         new app.pbuspre4(remoteHandle, context).execute( AV53EmprCod, AV35BarCod, AV37BarCodReo, AV36BarCodPar, GXv_decimal35, GXv_decimal27, GXv_int19, GXv_decimal26, GXv_char33) ;
         documentodetransporteproduccion_40_impl.this.AV9BarPreKgm = GXv_decimal35[0] ;
         documentodetransporteproduccion_40_impl.this.AV10BarPreMtr = GXv_decimal27[0] ;
         documentodetransporteproduccion_40_impl.this.AV5AlbProEsp = GXv_int19[0] ;
         documentodetransporteproduccion_40_impl.this.AV6AlbProRec = GXv_decimal26[0] ;
         documentodetransporteproduccion_40_impl.this.AV7BarFasExt = GXv_char33[0] ;
      }
   }

   public void e202952( )
   {
      /* Baralbkgme_Isvalid Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( AV64Moda21 == 1 )
      {
         if ( GXutil.strcmp(AV83BarTipDis, "L") != 0 )
         {
            if ( ( DecimalUtil.compareTo(AV30BarAlbKgmE, AV42BarKgm) > 0 ) && ( AV55errkgs == 1 ) )
            {
               GX_FocusControl = edtavBaralbkgme_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
               httpContext.doAjaxRefresh();
               lblTbmessage_Caption = httpContext.getMessage( "Os quilos saidos= ", "")+GXutil.trim( GXutil.str( AV30BarAlbKgmE, 9, 2))+httpContext.getMessage( ", são maiores do que os quilos da OS= ", "")+GXutil.trim( GXutil.str( AV42BarKgm, 9, 2)) ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            }
            else
            {
               if ( GXutil.strcmp(AV51CliFacMtsP, "N") == 0 )
               {
                  AV31BarAlbMtrE = (((AV20AlbHdrgm2*AV19AlbHdrAnc)>0) ? (AV30BarAlbKgmE.divide(DecimalUtil.doubleToDec((AV20AlbHdrgm2*(AV19AlbHdrAnc/ (double) (100)))), 18, java.math.RoundingMode.DOWN)).multiply(DecimalUtil.doubleToDec(1000)) : DecimalUtil.doubleToDec(0)) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV31BarAlbMtrE", GXutil.ltrimstr( AV31BarAlbMtrE, 9, 2));
                  GXv_char33[0] = Gx_msg ;
                  new app.pmodmercopy1(remoteHandle, context).execute( AV53EmprCod, AV24AlbProCod, AV35BarCod, AV37BarCodReo, AV36BarCodPar, AV30BarAlbKgmE, AV74UsurCod, AV70Station, AV88Pgmname, GXv_char33) ;
                  documentodetransporteproduccion_40_impl.this.Gx_msg = GXv_char33[0] ;
                  if ( ! (GXutil.strcmp("", Gx_msg)==0) )
                  {
                     lblTbmessage_Caption = Gx_msg ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   protected void nextLoad( )
   {
   }

   protected void e212952( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_253_2952( boolean wbgen )
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
         wb_table1_253_2952e( true) ;
      }
      else
      {
         wb_table1_253_2952e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV53EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53EmprCod", AV53EmprCod);
      AV24AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24AlbProCod), 10, 0));
      AV58Guiremcli = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV58Guiremcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58Guiremcli), 6, 0));
      AV59GuiRemCln = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59GuiRemCln", AV59GuiRemCln);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGUIREMCLN", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV59GuiRemCln, ""))));
      AV26AlbProFch = (java.util.Date)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26AlbProFch", localUtil.format(AV26AlbProFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROFCH", getSecureSignedToken( "", AV26AlbProFch));
      AV29AlbSec = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29AlbSec", AV29AlbSec);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBSEC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV29AlbSec, "@!"))));
      AV27AlbProPri = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27AlbProPri", AV27AlbProPri);
      AV18AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18AlbEnvFtp", GXutil.str( AV18AlbEnvFtp, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18AlbEnvFtp), "9")));
      AV23AlbLic = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23AlbLic", AV23AlbLic);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBLIC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23AlbLic, ""))));
      AV22AlbHhfm = (java.util.Date)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22AlbHhfm", localUtil.ttoc( AV22AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV25AlbProEst = ((Number) GXutil.testNumericType( getParm(obj,10), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25AlbProEst", GXutil.str( AV25AlbProEst, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBPROEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25AlbProEst), "9")));
      AV80AlbMarca = (String)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80AlbMarca", AV80AlbMarca);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBMARCA", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80AlbMarca, ""))));
      AV60Hash = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV60Hash", AV60Hash);
      AV66ok = ((Boolean) getParm(obj,13)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66ok", AV66ok);
      AV62Messages_json = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62Messages_json", AV62Messages_json);
      AV51CliFacMtsP = (String)getParm(obj,15) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51CliFacMtsP", AV51CliFacMtsP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51CliFacMtsP, ""))));
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
      pa2952( ) ;
      ws2952( ) ;
      we2952( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      if ( ! ( WebComp_Wcdocumentodetransporteproduccion_41 == null ) )
      {
         if ( GXutil.len( WebComp_Wcdocumentodetransporteproduccion_41_Component) != 0 )
         {
            WebComp_Wcdocumentodetransporteproduccion_41.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714281232", true, true);
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
      httpContext.AddJavascriptSource("documentotransporteproduccion/documentodetransporteproduccion_40.js", "?202681714281232", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      edtavGuiremcli_Internalname = "vGUIREMCLI" ;
      cmbavAlbpropri.setInternalname( "vALBPROPRI" );
      edtavAlblic_Internalname = "vALBLIC" ;
      cmbavAlbenvftp.setInternalname( "vALBENVFTP" );
      chkavClifacmtsp.setInternalname( "vCLIFACMTSP" );
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
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
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      lblTextblockcombo_tubcod_Internalname = "TEXTBLOCKCOMBO_TUBCOD" ;
      Combo_tubcod_Internalname = "COMBO_TUBCOD" ;
      divTablesplittedtubcod_Internalname = "TABLESPLITTEDTUBCOD" ;
      edtavBaralbtub_Internalname = "vBARALBTUB" ;
      edtavAlbhdrobs_Internalname = "vALBHDROBS" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnhashcomunicarat_Internalname = "BTNHASHCOMUNICARAT" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
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
      edtavBarunimed_Internalname = "vBARUNIMED" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavBartipdis_Internalname = "vBARTIPDIS" ;
      edtavBaralbund_Internalname = "vBARALBUND" ;
      edtavAlbpmppza_Internalname = "vALBPMPPZA" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      edtavClicod_Internalname = "vCLICOD" ;
      cmbavBarestreo.setInternalname( "vBARESTREO" );
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarpie_Internalname = "vBARPIE" ;
      edtavKilant_Internalname = "vKILANT" ;
      edtavMetant_Internalname = "vMETANT" ;
      edtavPieant_Internalname = "vPIEANT" ;
      edtavBarcad_Internalname = "vBARCAD" ;
      edtavAlbbar_Internalname = "vALBBAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divDvpanel_unnamedtable3_cell_Internalname = "DVPANEL_UNNAMEDTABLE3_CELL" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavTubcod_Internalname = "vTUBCOD" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
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
      edtavTubcod_Jsonclick = "" ;
      edtavTubcod_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
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
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Enabled = 1 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 1 ;
      cmbavBarestreo.setJsonclick( "" );
      cmbavBarestreo.setEnabled( 1 );
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      divDvpanel_unnamedtable3_cell_Class = "col-xs-12" ;
      edtavAlbpmppza_Jsonclick = "" ;
      edtavAlbpmppza_Enabled = 1 ;
      edtavBaralbund_Jsonclick = "" ;
      edtavBaralbund_Enabled = 1 ;
      edtavBaralbund_Visible = 1 ;
      edtavBartipdis_Jsonclick = "" ;
      edtavBartipdis_Enabled = 1 ;
      edtavBarunimed_Jsonclick = "" ;
      edtavBarunimed_Enabled = 1 ;
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
      bttBtnhashcomunicarat_Enabled = 1 ;
      bttBtnenter_Enabled = 1 ;
      edtavAlbhdrobs_Jsonclick = "" ;
      edtavAlbhdrobs_Enabled = 1 ;
      edtavBaralbtub_Jsonclick = "" ;
      edtavBaralbtub_Enabled = 1 ;
      edtavBaralbtub_Visible = 1 ;
      lblTextblockcombo_tubcod_Visible = 1 ;
      cmbavAlbproval.setJsonclick( "" );
      cmbavAlbproval.setEnabled( 1 );
      edtavBaralbpie_Jsonclick = "" ;
      edtavBaralbpie_Enabled = 1 ;
      edtavBaralbmtre_Jsonclick = "" ;
      edtavBaralbmtre_Enabled = 1 ;
      edtavBaralbmtre_Visible = 1 ;
      edtavAlbhdrgm2_Jsonclick = "" ;
      edtavAlbhdrgm2_Enabled = 1 ;
      edtavAlbhdrgm2_Visible = 1 ;
      edtavAlbhdranc_Jsonclick = "" ;
      edtavAlbhdranc_Enabled = 1 ;
      edtavAlbhdranc_Visible = 1 ;
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
      cmbavAlbpropri.setJsonclick( "" );
      cmbavAlbpropri.setEnabled( 0 );
      edtavGuiremcli_Jsonclick = "" ;
      edtavGuiremcli_Enabled = 0 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma el dato?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Provisional", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
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
      Combo_tubcod_Visible = GXutil.toBoolean( -1) ;
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
      Form.setCaption( httpContext.getMessage( "Producciones (ins_upd)", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavAlbpropri.setName( "vALBPROPRI" );
      cmbavAlbpropri.setWebtags( "" );
      cmbavAlbpropri.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavAlbpropri.addItem("0", httpContext.getMessage( "Guia Transporte", ""), (short)(0));
      if ( cmbavAlbpropri.getItemCount() > 0 )
      {
         AV27AlbProPri = cmbavAlbpropri.getValidValue(AV27AlbProPri) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27AlbProPri", AV27AlbProPri);
      }
      cmbavAlbenvftp.setName( "vALBENVFTP" );
      cmbavAlbenvftp.setWebtags( "" );
      cmbavAlbenvftp.addItem("0", httpContext.getMessage( "Não Enviada", ""), (short)(0));
      cmbavAlbenvftp.addItem("3", httpContext.getMessage( "Enviada a AT", ""), (short)(0));
      if ( cmbavAlbenvftp.getItemCount() > 0 )
      {
         AV18AlbEnvFtp = (byte)(GXutil.lval( cmbavAlbenvftp.getValidValue(GXutil.trim( GXutil.str( AV18AlbEnvFtp, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18AlbEnvFtp", GXutil.str( AV18AlbEnvFtp, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vALBENVFTP", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18AlbEnvFtp), "9")));
      }
      chkavClifacmtsp.setName( "vCLIFACMTSP" );
      chkavClifacmtsp.setWebtags( "" );
      chkavClifacmtsp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavClifacmtsp.getInternalname(), "TitleCaption", chkavClifacmtsp.getCaption(), true);
      chkavClifacmtsp.setCheckedValue( "N" );
      AV51CliFacMtsP = ((GXutil.strcmp(GXutil.rtrim( AV51CliFacMtsP), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51CliFacMtsP", AV51CliFacMtsP);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLIFACMTSP", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51CliFacMtsP, ""))));
      cmbavAlbproval.setName( "vALBPROVAL" );
      cmbavAlbproval.setWebtags( "" );
      cmbavAlbproval.addItem("S", httpContext.getMessage( "Si", ""), (short)(0));
      cmbavAlbproval.addItem("N", httpContext.getMessage( "No", ""), (short)(0));
      if ( cmbavAlbproval.getItemCount() > 0 )
      {
         AV28AlbProVal = cmbavAlbproval.getValidValue(AV28AlbProVal) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28AlbProVal", AV28AlbProVal);
      }
      chkavBartipcor.setName( "vBARTIPCOR" );
      chkavBartipcor.setWebtags( "" );
      chkavBartipcor.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavBartipcor.getInternalname(), "TitleCaption", chkavBartipcor.getCaption(), true);
      chkavBartipcor.setCheckedValue( "NO" );
      AV48BarTipCor = ((GXutil.strcmp(GXutil.rtrim( AV48BarTipCor), "SI")==0) ? "SI" : "NO") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48BarTipCor", AV48BarTipCor);
      cmbavBarestreo.setName( "vBARESTREO" );
      cmbavBarestreo.setWebtags( "" );
      cmbavBarestreo.addItem("0", httpContext.getMessage( "Normal", ""), (short)(0));
      cmbavBarestreo.addItem("1", httpContext.getMessage( "No Conformidad", ""), (short)(0));
      cmbavBarestreo.addItem("2", httpContext.getMessage( "Reclamacion", ""), (short)(0));
      if ( cmbavBarestreo.getItemCount() > 0 )
      {
         AV41BarEstReo = (byte)(GXutil.lval( cmbavBarestreo.getValidValue(GXutil.trim( GXutil.str( AV41BarEstReo, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41BarEstReo", GXutil.str( AV41BarEstReo, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV48BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV25AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV80AlbMarca',fld:'vALBMARCA',pic:'',hsh:true},{av:'AV64Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV55errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'AV82lavanderiaprecio',fld:'vLAVANDERIAPRECIO',pic:'ZZZ9',hsh:true},{av:'AV57FlagFas',fld:'vFLAGFAS',pic:'ZZZ9',hsh:true},{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV70Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV13Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV26AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV65Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV59GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV29AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'cmbavAlbenvftp'},{av:'AV18AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV23AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV51CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV88Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e142952',iparms:[{av:'cmbavAlbenvftp'},{av:'AV18AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV23AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV25AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV80AlbMarca',fld:'vALBMARCA',pic:'',hsh:true},{av:'AV35BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV50CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV58Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV46BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV17albbar',fld:'vALBBAR',pic:'ZZZ9'},{av:'cmbavAlbpropri'},{av:'AV27AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'cmbavBarestreo'},{av:'AV41BarEstReo',fld:'vBARESTREO',pic:'9'},{av:'AV64Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV30BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV31BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV42BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV55errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'AV79Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV83BarTipDis',fld:'vBARTIPDIS',pic:'@!'},{av:'AV32BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'},{av:'AV82lavanderiaprecio',fld:'vLAVANDERIAPRECIO',pic:'ZZZ9',hsh:true},{av:'AV84barpie',fld:'vBARPIE',pic:'ZZZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e122952',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'cmbavAlbenvftp'},{av:'AV18AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV23AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV25AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV80AlbMarca',fld:'vALBMARCA',pic:'',hsh:true},{av:'AV35BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV37BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV36BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV30BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV19AlbHdrAnc',fld:'vALBHDRANC',pic:'ZZZ9'},{av:'AV20AlbHdrgm2',fld:'vALBHDRGM2',pic:'ZZZ9'},{av:'AV31BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV32BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'},{av:'AV71TubCod',fld:'vTUBCOD',pic:'ZZZ9'},{av:'AV33BarAlbTub',fld:'vBARALBTUB',pic:'ZZZ9'},{av:'cmbavAlbproval'},{av:'AV28AlbProVal',fld:'vALBPROVAL',pic:'@!'},{av:'AV21AlbHdrObs',fld:'vALBHDROBS',pic:''},{av:'AV57FlagFas',fld:'vFLAGFAS',pic:'ZZZ9',hsh:true},{av:'AV64Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV17albbar',fld:'vALBBAR',pic:'ZZZ9'},{av:'AV63MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV61KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV67PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'},{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV70Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV48BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV13Mensaje',fld:'vMENSAJE',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV46BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV26AlbProFch',fld:'vALBPROFCH',pic:'',hsh:true},{av:'AV65Nofases',fld:'vNOFASES',pic:'ZZZ9',hsh:true},{av:'AV58Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV59GuiRemCln',fld:'vGUIREMCLN',pic:'',hsh:true},{av:'AV29AlbSec',fld:'vALBSEC',pic:'@!',hsh:true},{av:'cmbavAlbpropri'},{av:'AV27AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV22AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{ctrl:'WCDOCUMENTODETRANSPORTEPRODUCCION_41'},{av:'AV35BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV36BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV19AlbHdrAnc',fld:'vALBHDRANC',pic:'ZZZ9'},{av:'AV20AlbHdrgm2',fld:'vALBHDRGM2',pic:'ZZZ9'},{av:'AV21AlbHdrObs',fld:'vALBHDROBS',pic:''},{av:'AV30BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV31BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV32BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'},{av:'AV33BarAlbTub',fld:'vBARALBTUB',pic:'ZZZ9'},{av:'AV71TubCod',fld:'vTUBCOD',pic:'ZZZ9'},{av:'Combo_tubcod_Selectedvalue_set',ctrl:'COMBO_TUBCOD',prop:'SelectedValue_set'},{av:'cmbavAlbproval'},{av:'AV28AlbProVal',fld:'vALBPROVAL',pic:'@!'},{av:'AV40BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV44BarSer',fld:'vBARSER',pic:''},{av:'AV45BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV38BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV39BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV47BarTipCol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV43BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV46BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV48BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'AV50CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'cmbavBarestreo'},{av:'AV41BarEstReo',fld:'vBARESTREO',pic:'9'},{av:'AV42BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV61KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV63MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV67PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'},{av:'AV34barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV17albbar',fld:'vALBBAR',pic:'ZZZ9'},{av:'AV83BarTipDis',fld:'vBARTIPDIS',pic:'@!'},{av:'AV81BarAlbUnd',fld:'vBARALBUND',pic:'ZZZZZ9'},{av:'AV85AlbpmpPza',fld:'vALBPMPPZA',pic:'Z9.999'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'}]}");
      setEventMetadata("'DOHASHCOMUNICARAT'","{handler:'e152952',iparms:[{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV22AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV78AlbProsal',fld:'vALBPROSAL',pic:'99/99/99 99:99'},{av:'cmbavAlbpropri'},{av:'AV27AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV49Cadena',fld:'vCADENA',pic:''},{av:'AV60Hash',fld:'vHASH',pic:''}]");
      setEventMetadata("'DOHASHCOMUNICARAT'",",oparms:[{av:'AV60Hash',fld:'vHASH',pic:''},{av:'AV49Cadena',fld:'vCADENA',pic:''},{av:'cmbavAlbpropri'},{av:'AV27AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV78AlbProsal',fld:'vALBPROSAL',pic:'99/99/99 99:99'},{av:'AV22AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV24AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e162952',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VPROMPT.CLICK","{handler:'e112951',iparms:[{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV36BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV58Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'}]");
      setEventMetadata("VPROMPT.CLICK",",oparms:[{av:'AV58Guiremcli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV36BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV37BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV35BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VBARCOD.ISVALID","{handler:'e172952',iparms:[{av:'cmbavAlbenvftp'},{av:'AV18AlbEnvFtp',fld:'vALBENVFTP',pic:'9',hsh:true},{av:'AV23AlbLic',fld:'vALBLIC',pic:'',hsh:true},{av:'AV25AlbProEst',fld:'vALBPROEST',pic:'9',hsh:true},{av:'AV80AlbMarca',fld:'vALBMARCA',pic:'',hsh:true},{av:'AV35BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("VBARCOD.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'}]}");
      setEventMetadata("VBARCODPAR.ISVALID","{handler:'e182952',iparms:[{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV35BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV36BarCodPar',fld:'vBARCODPAR',pic:''},{av:'cmbavAlbpropri'},{av:'AV27AlbProPri',fld:'vALBPROPRI',pic:'9'},{av:'AV64Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("VBARCODPAR.ISVALID",",oparms:[{av:'edtavBaralbmtre_Visible',ctrl:'vBARALBMTRE',prop:'Visible'},{av:'edtavAlbhdranc_Visible',ctrl:'vALBHDRANC',prop:'Visible'},{av:'edtavAlbhdrgm2_Visible',ctrl:'vALBHDRGM2',prop:'Visible'},{av:'edtavTubcod_Visible',ctrl:'vTUBCOD',prop:'Visible'},{av:'edtavBaralbtub_Visible',ctrl:'vBARALBTUB',prop:'Visible'},{av:'Combo_tubcod_Visible',ctrl:'COMBO_TUBCOD',prop:'Visible'},{av:'lblTextblockcombo_tubcod_Visible',ctrl:'TEXTBLOCKCOMBO_TUBCOD',prop:'Visible'},{av:'AV85AlbpmpPza',fld:'vALBPMPPZA',pic:'Z9.999'},{av:'AV84barpie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV83BarTipDis',fld:'vBARTIPDIS',pic:'@!'},{av:'AV81BarAlbUnd',fld:'vBARALBUND',pic:'ZZZZZ9'},{av:'AV79Barunimed',fld:'vBARUNIMED',pic:'@!'},{av:'AV39BarColNum',fld:'vBARCOLNUM',pic:'ZZZZZ9'},{av:'AV38BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV67PieAnt',fld:'vPIEANT',pic:'ZZZZZ9'},{av:'AV63MetAnt',fld:'vMETANT',pic:'ZZZZZ9.99'},{av:'AV61KilAnt',fld:'vKILANT',pic:'ZZZZZ9.99'},{av:'AV42BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV17albbar',fld:'vALBBAR',pic:'ZZZ9'},{av:'AV34barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV21AlbHdrObs',fld:'vALBHDROBS',pic:''},{av:'AV40BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV50CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV47BarTipCol',fld:'vBARTIPCOL',pic:'Z9'},{av:'AV45BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV44BarSer',fld:'vBARSER',pic:''},{av:'AV43BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV46BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV48BarTipCor',fld:'vBARTIPCOR',pic:''},{av:'cmbavBarestreo'},{av:'AV41BarEstReo',fld:'vBARESTREO',pic:'9'},{av:'cmbavAlbproval'},{av:'AV28AlbProVal',fld:'vALBPROVAL',pic:'@!'},{av:'AV33BarAlbTub',fld:'vBARALBTUB',pic:'ZZZ9'},{av:'AV71TubCod',fld:'vTUBCOD',pic:'ZZZ9'},{av:'AV32BarAlbPie',fld:'vBARALBPIE',pic:'ZZZZZ9'},{av:'AV31BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'},{av:'AV20AlbHdrgm2',fld:'vALBHDRGM2',pic:'ZZZ9'},{av:'AV19AlbHdrAnc',fld:'vALBHDRANC',pic:'ZZZ9'},{av:'AV30BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'Combo_tubcod_Selectedvalue_set',ctrl:'COMBO_TUBCOD',prop:'SelectedValue_set'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'}]}");
      setEventMetadata("VALBPROVAL.ISVALID","{handler:'e192952',iparms:[{av:'cmbavAlbproval'},{av:'AV28AlbProVal',fld:'vALBPROVAL',pic:'@!'},{av:'AV34barcad',fld:'vBARCAD',pic:'ZZZ9'},{av:'AV17albbar',fld:'vALBBAR',pic:'ZZZ9'},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV35BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV36BarCodPar',fld:'vBARCODPAR',pic:''}]");
      setEventMetadata("VALBPROVAL.ISVALID",",oparms:[]}");
      setEventMetadata("VBARALBKGME.ISVALID","{handler:'e202952',iparms:[{av:'AV64Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV83BarTipDis',fld:'vBARTIPDIS',pic:'@!'},{av:'AV30BarAlbKgmE',fld:'vBARALBKGME',pic:'ZZZZZ9.99'},{av:'AV42BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV55errkgs',fld:'vERRKGS',pic:'ZZZ9',hsh:true},{av:'AV51CliFacMtsP',fld:'vCLIFACMTSP',pic:'',hsh:true},{av:'AV20AlbHdrgm2',fld:'vALBHDRGM2',pic:'ZZZ9'},{av:'AV19AlbHdrAnc',fld:'vALBHDRANC',pic:'ZZZ9'},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV24AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV35BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV36BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV74UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV70Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV88Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("VBARALBKGME.ISVALID",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV31BarAlbMtrE',fld:'vBARALBMTRE',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("VALIDV_BARUNIMED","{handler:'validv_Barunimed',iparms:[]");
      setEventMetadata("VALIDV_BARUNIMED",",oparms:[]}");
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
      wcpOAV53EmprCod = "" ;
      wcpOAV59GuiRemCln = "" ;
      wcpOAV26AlbProFch = GXutil.nullDate() ;
      wcpOAV29AlbSec = "" ;
      wcpOAV27AlbProPri = "" ;
      wcpOAV23AlbLic = "" ;
      wcpOAV22AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      wcpOAV80AlbMarca = "" ;
      wcpOAV60Hash = "" ;
      wcpOAV62Messages_json = "" ;
      wcpOAV51CliFacMtsP = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Combo_tubcod_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV53EmprCod = "" ;
      AV59GuiRemCln = "" ;
      AV26AlbProFch = GXutil.nullDate() ;
      AV29AlbSec = "" ;
      AV27AlbProPri = "" ;
      AV23AlbLic = "" ;
      AV22AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV80AlbMarca = "" ;
      AV60Hash = "" ;
      AV62Messages_json = "" ;
      AV51CliFacMtsP = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV74UsurCod = "" ;
      AV70Station = "" ;
      AV13Mensaje = "" ;
      Gx_mode = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV88Pgmname = "" ;
      AV72TubCod_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV78AlbProsal = GXutil.resetTime( GXutil.nullDate() );
      AV49Cadena = "" ;
      Combo_tubcod_Selectedvalue_set = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV69Prompt = "" ;
      AV89Prompt_GXI = "" ;
      sImgUrl = "" ;
      AV36BarCodPar = "" ;
      AV30BarAlbKgmE = DecimalUtil.ZERO ;
      AV31BarAlbMtrE = DecimalUtil.ZERO ;
      AV28AlbProVal = "" ;
      lblTextblockcombo_tubcod_Jsonclick = "" ;
      ucCombo_tubcod = new com.genexus.webpanels.GXUserControl();
      Combo_tubcod_Caption = "" ;
      AV21AlbHdrObs = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnhashcomunicarat_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      AV40BarEncCli = "" ;
      AV44BarSer = "" ;
      AV45BarSerDsc = "" ;
      AV38BarColNom = "" ;
      AV43BarNomCli = "" ;
      AV48BarTipCor = "" ;
      AV79Barunimed = "" ;
      AV83BarTipDis = "" ;
      AV85AlbpmpPza = DecimalUtil.ZERO ;
      WebComp_Wcdocumentodetransporteproduccion_41_Component = "" ;
      OldWcdocumentodetransporteproduccion_41 = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      AV42BarKgm = DecimalUtil.ZERO ;
      AV61KilAnt = DecimalUtil.ZERO ;
      AV63MetAnt = DecimalUtil.ZERO ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      GXt_char1 = "" ;
      AV54EmprNom = "" ;
      AV75Kgs = DecimalUtil.ZERO ;
      AV76Mts = DecimalUtil.ZERO ;
      AV16MetPieCtr = "" ;
      Gx_msg = "" ;
      scmdbuf = "" ;
      H02952_A396EmprCod = new String[] {""} ;
      H02952_A13813TubNomID = new String[] {""} ;
      H02952_A1207TubNom = new String[] {""} ;
      H02952_n1207TubNom = new boolean[] {false} ;
      H02952_A1206TubCod = new short[1] ;
      A13813TubNomID = "" ;
      A1207TubNom = "" ;
      AV52Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int7 = new int[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int14 = new byte[1] ;
      GXv_char2 = new String[1] ;
      GXv_int15 = new int[1] ;
      GXv_char16 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_int18 = new short[1] ;
      GXv_int20 = new int[1] ;
      GXv_char21 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_int23 = new short[1] ;
      GXv_int24 = new short[1] ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_int28 = new int[1] ;
      GXv_char29 = new String[1] ;
      GXv_int30 = new int[1] ;
      GXv_char31 = new String[1] ;
      GXv_int32 = new int[1] ;
      GXv_int34 = new int[1] ;
      AV9BarPreKgm = DecimalUtil.ZERO ;
      GXv_decimal35 = new java.math.BigDecimal[1] ;
      AV10BarPreMtr = DecimalUtil.ZERO ;
      GXv_decimal27 = new java.math.BigDecimal[1] ;
      GXv_int19 = new byte[1] ;
      AV6AlbProRec = DecimalUtil.ZERO ;
      GXv_decimal26 = new java.math.BigDecimal[1] ;
      AV7BarFasExt = "" ;
      GXv_char33 = new String[1] ;
      sStyleString = "" ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.documentotransporteproduccion.documentodetransporteproduccion_40__default(),
         new Object[] {
             new Object[] {
            H02952_A396EmprCod, H02952_A13813TubNomID, H02952_A1207TubNom, H02952_n1207TubNom, H02952_A1206TubCod
            }
         }
      );
      AV88Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_40" ;
      /* GeneXus formulas. */
      AV88Pgmname = "DocumentoTransporteProduccion.DocumentodeTransporteProduccion_40" ;
      Gx_err = (short)(0) ;
      edtavAlblic_Enabled = 0 ;
      cmbavAlbenvftp.setEnabled( 0 );
      cmbavAlbproval.setEnabled( 0 );
      edtavBarenccli_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarcolnum_Enabled = 0 ;
      edtavBartipcol_Enabled = 0 ;
      edtavBarnomcli_Enabled = 0 ;
      chkavBartipcor.setEnabled( 0 );
      edtavBarsit_Enabled = 0 ;
      edtavBarunimed_Enabled = 0 ;
      edtavBartipdis_Enabled = 0 ;
      edtavBaralbund_Enabled = 0 ;
      edtavAlbpmppza_Enabled = 0 ;
      edtavClicod_Enabled = 0 ;
      cmbavBarestreo.setEnabled( 0 );
      edtavBarkgm_Enabled = 0 ;
      edtavBarpie_Enabled = 0 ;
      edtavKilant_Enabled = 0 ;
      edtavMetant_Enabled = 0 ;
      edtavPieant_Enabled = 0 ;
      edtavBarcad_Enabled = 0 ;
      edtavAlbbar_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      WebComp_Wcdocumentodetransporteproduccion_41 = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte wcpOAV18AlbEnvFtp ;
   private byte wcpOAV25AlbProEst ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV18AlbEnvFtp ;
   private byte AV25AlbProEst ;
   private byte gxajaxcallmode ;
   private byte AV12IN_Barsit ;
   private byte AV37BarCodReo ;
   private byte AV47BarTipCol ;
   private byte AV46BarSit ;
   private byte AV41BarEstReo ;
   private byte nDonePA ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte GXv_int14[] ;
   private byte AV5AlbProEsp ;
   private byte GXv_int19[] ;
   private byte nGXWrapped ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV64Moda21 ;
   private short AV55errkgs ;
   private short AV82lavanderiaprecio ;
   private short AV57FlagFas ;
   private short AV65Nofases ;
   private short wbEnd ;
   private short wbStart ;
   private short AV19AlbHdrAnc ;
   private short AV20AlbHdrgm2 ;
   private short AV34barcad ;
   private short AV17albbar ;
   private short AV71TubCod ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV68Plasticos ;
   private short AV73Tubos ;
   private short A1206TubCod ;
   private short GXv_int10[] ;
   private short GXv_int11[] ;
   private short GXv_int12[] ;
   private short AV11bartipart ;
   private short GXv_int18[] ;
   private short GXv_int23[] ;
   private short GXv_int24[] ;
   private int wcpOAV58Guiremcli ;
   private int AV58Guiremcli ;
   private int edtavAlbprocod_Enabled ;
   private int edtavGuiremcli_Enabled ;
   private int edtavAlblic_Enabled ;
   private int AV35BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavBaralbkgme_Enabled ;
   private int edtavAlbhdranc_Visible ;
   private int edtavAlbhdranc_Enabled ;
   private int edtavAlbhdrgm2_Visible ;
   private int edtavAlbhdrgm2_Enabled ;
   private int edtavBaralbmtre_Visible ;
   private int edtavBaralbmtre_Enabled ;
   private int AV32BarAlbPie ;
   private int edtavBaralbpie_Enabled ;
   private int lblTextblockcombo_tubcod_Visible ;
   private int edtavBaralbtub_Visible ;
   private int AV33BarAlbTub ;
   private int edtavBaralbtub_Enabled ;
   private int edtavAlbhdrobs_Enabled ;
   private int bttBtnenter_Enabled ;
   private int bttBtnhashcomunicarat_Enabled ;
   private int edtavBarenccli_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int AV39BarColNum ;
   private int edtavBarcolnum_Enabled ;
   private int edtavBartipcol_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int edtavBarsit_Enabled ;
   private int edtavBarunimed_Enabled ;
   private int edtavBartipdis_Enabled ;
   private int edtavBaralbund_Visible ;
   private int AV81BarAlbUnd ;
   private int edtavBaralbund_Enabled ;
   private int edtavAlbpmppza_Enabled ;
   private int AV50CliCod ;
   private int edtavClicod_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int AV84barpie ;
   private int edtavBarpie_Enabled ;
   private int edtavKilant_Enabled ;
   private int edtavMetant_Enabled ;
   private int AV67PieAnt ;
   private int edtavPieant_Enabled ;
   private int edtavBarcad_Enabled ;
   private int edtavAlbbar_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavTubcod_Visible ;
   private int AV77Pzs ;
   private int AV8barnumcli ;
   private int GXv_int7[] ;
   private int GXv_int13[] ;
   private int GXv_int15[] ;
   private int GXv_int20[] ;
   private int GXv_int28[] ;
   private int GXv_int30[] ;
   private int GXv_int32[] ;
   private int GXv_int34[] ;
   private int idxLst ;
   private long wcpOAV24AlbProCod ;
   private long AV24AlbProCod ;
   private java.math.BigDecimal AV30BarAlbKgmE ;
   private java.math.BigDecimal AV31BarAlbMtrE ;
   private java.math.BigDecimal AV85AlbpmpPza ;
   private java.math.BigDecimal AV42BarKgm ;
   private java.math.BigDecimal AV61KilAnt ;
   private java.math.BigDecimal AV63MetAnt ;
   private java.math.BigDecimal AV75Kgs ;
   private java.math.BigDecimal AV76Mts ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal AV9BarPreKgm ;
   private java.math.BigDecimal GXv_decimal35[] ;
   private java.math.BigDecimal AV10BarPreMtr ;
   private java.math.BigDecimal GXv_decimal27[] ;
   private java.math.BigDecimal AV6AlbProRec ;
   private java.math.BigDecimal GXv_decimal26[] ;
   private String wcpOAV53EmprCod ;
   private String wcpOAV59GuiRemCln ;
   private String wcpOAV29AlbSec ;
   private String wcpOAV27AlbProPri ;
   private String wcpOAV23AlbLic ;
   private String wcpOAV80AlbMarca ;
   private String wcpOAV51CliFacMtsP ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Combo_tubcod_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV53EmprCod ;
   private String AV59GuiRemCln ;
   private String AV29AlbSec ;
   private String AV27AlbProPri ;
   private String AV23AlbLic ;
   private String AV80AlbMarca ;
   private String AV51CliFacMtsP ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV74UsurCod ;
   private String AV70Station ;
   private String Gx_mode ;
   private String GXKey ;
   private String AV88Pgmname ;
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
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divUnnamedtable9_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavGuiremcli_Internalname ;
   private String edtavGuiremcli_Jsonclick ;
   private String edtavAlblic_Internalname ;
   private String edtavAlblic_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable6_Internalname ;
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
   private String AV36BarCodPar ;
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
   private String AV28AlbProVal ;
   private String divUnnamedtable7_Internalname ;
   private String divTablesplittedtubcod_Internalname ;
   private String lblTextblockcombo_tubcod_Internalname ;
   private String lblTextblockcombo_tubcod_Jsonclick ;
   private String Combo_tubcod_Caption ;
   private String Combo_tubcod_Internalname ;
   private String edtavBaralbtub_Internalname ;
   private String edtavBaralbtub_Jsonclick ;
   private String edtavAlbhdrobs_Internalname ;
   private String AV21AlbHdrObs ;
   private String edtavAlbhdrobs_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnhashcomunicarat_Internalname ;
   private String bttBtnhashcomunicarat_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavBarenccli_Internalname ;
   private String AV40BarEncCli ;
   private String edtavBarenccli_Jsonclick ;
   private String edtavBarser_Internalname ;
   private String AV44BarSer ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Internalname ;
   private String AV45BarSerDsc ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavBarcolnom_Internalname ;
   private String AV38BarColNom ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarcolnum_Internalname ;
   private String edtavBarcolnum_Jsonclick ;
   private String edtavBartipcol_Internalname ;
   private String edtavBartipcol_Jsonclick ;
   private String edtavBarnomcli_Internalname ;
   private String AV43BarNomCli ;
   private String edtavBarnomcli_Jsonclick ;
   private String AV48BarTipCor ;
   private String edtavBarsit_Internalname ;
   private String edtavBarsit_Jsonclick ;
   private String edtavBarunimed_Internalname ;
   private String AV79Barunimed ;
   private String edtavBarunimed_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBartipdis_Internalname ;
   private String AV83BarTipDis ;
   private String edtavBartipdis_Jsonclick ;
   private String edtavBaralbund_Internalname ;
   private String edtavBaralbund_Jsonclick ;
   private String edtavAlbpmppza_Internalname ;
   private String edtavAlbpmppza_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wcdocumentodetransporteproduccion_41_Component ;
   private String OldWcdocumentodetransporteproduccion_41 ;
   private String divDvpanel_unnamedtable3_cell_Internalname ;
   private String divDvpanel_unnamedtable3_cell_Class ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarpie_Internalname ;
   private String edtavBarpie_Jsonclick ;
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
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavTubcod_Internalname ;
   private String edtavTubcod_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String hsh ;
   private String GXt_char1 ;
   private String AV54EmprNom ;
   private String AV16MetPieCtr ;
   private String Gx_msg ;
   private String scmdbuf ;
   private String A1207TubNom ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char16[] ;
   private String GXv_char17[] ;
   private String GXv_char21[] ;
   private String GXv_char22[] ;
   private String GXv_char29[] ;
   private String GXv_char31[] ;
   private String AV7BarFasExt ;
   private String GXv_char33[] ;
   private String sStyleString ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private java.util.Date wcpOAV22AlbHhfm ;
   private java.util.Date AV22AlbHhfm ;
   private java.util.Date AV78AlbProsal ;
   private java.util.Date wcpOAV26AlbProFch ;
   private java.util.Date AV26AlbProFch ;
   private boolean wcpOAV66ok ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV66ok ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Combo_tubcod_Visible ;
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
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean wbLoad ;
   private boolean AV69Prompt_IsBlob ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wcdocumentodetransporteproduccion_41 ;
   private boolean n1207TubNom ;
   private String wcpOAV62Messages_json ;
   private String AV62Messages_json ;
   private String wcpOAV60Hash ;
   private String AV60Hash ;
   private String AV13Mensaje ;
   private String AV49Cadena ;
   private String AV89Prompt_GXI ;
   private String A13813TubNomID ;
   private String AV69Prompt ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wcdocumentodetransporteproduccion_41 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_tubcod ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavAlbpropri ;
   private HTMLChoice cmbavAlbenvftp ;
   private ICheckbox chkavClifacmtsp ;
   private HTMLChoice cmbavAlbproval ;
   private ICheckbox chkavBartipcor ;
   private HTMLChoice cmbavBarestreo ;
   private IDataStoreProvider pr_default ;
   private String[] H02952_A396EmprCod ;
   private String[] H02952_A13813TubNomID ;
   private String[] H02952_A1207TubNom ;
   private boolean[] H02952_n1207TubNom ;
   private short[] H02952_A1206TubCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV72TubCod_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV52Combo_DataItem ;
}

final  class documentodetransporteproduccion_40__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02952", "SELECT EmprCod, RTRIM(LTRIM(COALESCE( TubNom, ''))) || '(' || RTRIM(LTRIM(SUBSTR(TO_CHAR(TubCod,'9990'), 2))) || ')' AS TubNomID, TubNom, TubCod FROM TXPTUBOS ORDER BY TubNomID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
      switch ( cursor )
      {
      }
   }

}

