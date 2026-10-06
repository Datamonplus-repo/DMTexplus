package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class sendmailattached2_impl extends GXDataArea
{
   public sendmailattached2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public sendmailattached2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( sendmailattached2_impl.class ));
   }

   public sendmailattached2_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "TextoSeparador") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "TextoSeparador") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "TextoSeparador") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridfileuploadfiless") == 0 )
         {
            gxnrgridfileuploadfiless_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridfileuploadfiless") == 0 )
         {
            gxgrgridfileuploadfiless_refresh_invoke( ) ;
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
            AV62TextoSeparador = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TextoSeparador", AV62TextoSeparador);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOSEPARADOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62TextoSeparador, ""))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV52parametroCorreosDestinoJson = httpContext.GetPar( "parametroCorreosDestinoJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV52parametroCorreosDestinoJson", AV52parametroCorreosDestinoJson);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSDESTINOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52parametroCorreosDestinoJson, ""))));
               AV50parametroCorreosCopiaJson = httpContext.GetPar( "parametroCorreosCopiaJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50parametroCorreosCopiaJson", AV50parametroCorreosCopiaJson);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50parametroCorreosCopiaJson, ""))));
               AV51parametroCorreosCopiaOcultaJson = httpContext.GetPar( "parametroCorreosCopiaOcultaJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51parametroCorreosCopiaOcultaJson", AV51parametroCorreosCopiaOcultaJson);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAOCULTAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51parametroCorreosCopiaOcultaJson, ""))));
               AV49parametroAsunto = httpContext.GetPar( "parametroAsunto") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV49parametroAsunto", AV49parametroAsunto);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROASUNTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49parametroAsunto, ""))));
               AV53parametroTextoCorreo = httpContext.GetPar( "parametroTextoCorreo") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53parametroTextoCorreo", AV53parametroTextoCorreo);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROTEXTOCORREO", getSecureSignedToken( "", AV53parametroTextoCorreo));
               AV46NombresAdjuntosJson = httpContext.GetPar( "NombresAdjuntosJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46NombresAdjuntosJson", AV46NombresAdjuntosJson);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOMBRESADJUNTOSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46NombresAdjuntosJson, ""))));
               AV42MostrarMail = GXutil.strtobool( httpContext.GetPar( "MostrarMail")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV42MostrarMail", AV42MostrarMail);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV42MostrarMail));
               AV81Numero_documento = GXutil.lval( httpContext.GetPar( "Numero_documento")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV81Numero_documento", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81Numero_documento), 12, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMERO_DOCUMENTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81Numero_documento), "ZZZZZZZZZZZ9")));
               AV80Tipo_documento = httpContext.GetPar( "Tipo_documento") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV80Tipo_documento", AV80Tipo_documento);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_DOCUMENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80Tipo_documento, ""))));
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

   public void gxnrgridfileuploadfiless_newrow_invoke( )
   {
      nRC_GXsfl_58 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_58"))) ;
      nGXsfl_58_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_58_idx"))) ;
      sGXsfl_58_idx = httpContext.GetPar( "sGXsfl_58_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridfileuploadfiless_newrow( ) ;
      /* End function gxnrGridfileuploadfiless_newrow_invoke */
   }

   public void gxgrgridfileuploadfiless_refresh_invoke( )
   {
      subGridfileuploadfiless_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridfileuploadfiless_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20CorreosDestino);
      AV80Tipo_documento = httpContext.GetPar( "Tipo_documento") ;
      AV81Numero_documento = GXutil.lval( httpContext.GetPar( "Numero_documento")) ;
      AV53parametroTextoCorreo = httpContext.GetPar( "parametroTextoCorreo") ;
      AV62TextoSeparador = httpContext.GetPar( "TextoSeparador") ;
      AV52parametroCorreosDestinoJson = httpContext.GetPar( "parametroCorreosDestinoJson") ;
      AV50parametroCorreosCopiaJson = httpContext.GetPar( "parametroCorreosCopiaJson") ;
      AV51parametroCorreosCopiaOcultaJson = httpContext.GetPar( "parametroCorreosCopiaOcultaJson") ;
      AV49parametroAsunto = httpContext.GetPar( "parametroAsunto") ;
      AV46NombresAdjuntosJson = httpContext.GetPar( "NombresAdjuntosJson") ;
      AV42MostrarMail = GXutil.strtobool( httpContext.GetPar( "MostrarMail")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridfileuploadfiless_refresh( subGridfileuploadfiless_Rows, AV20CorreosDestino, AV80Tipo_documento, AV81Numero_documento, AV53parametroTextoCorreo, AV62TextoSeparador, AV52parametroCorreosDestinoJson, AV50parametroCorreosCopiaJson, AV51parametroCorreosCopiaOcultaJson, AV49parametroAsunto, AV46NombresAdjuntosJson, AV42MostrarMail) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridfileuploadfiless_refresh_invoke */
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
      pa2AI2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2AI2( ) ;
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
      httpContext.AddJavascriptSource("CKEditor/ckeditor/ckeditor.js", "", false, true);
      httpContext.AddJavascriptSource("CKEditor/CKEditorRender.js", "", false, true);
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.sendmailattached2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV62TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV52parametroCorreosDestinoJson)),GXutil.URLEncode(GXutil.rtrim(AV50parametroCorreosCopiaJson)),GXutil.URLEncode(GXutil.rtrim(AV51parametroCorreosCopiaOcultaJson)),GXutil.URLEncode(GXutil.rtrim(AV49parametroAsunto)),GXutil.URLEncode(GXutil.rtrim(AV53parametroTextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV46NombresAdjuntosJson)),GXutil.URLEncode(GXutil.booltostr(AV42MostrarMail)),GXutil.URLEncode(GXutil.ltrimstr(AV81Numero_documento,12,0)),GXutil.URLEncode(GXutil.rtrim(AV80Tipo_documento))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail","Numero_documento","Tipo_documento"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCORREOSDESTINO", getSecureSignedToken( "", AV20CorreosDestino));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_DOCUMENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80Tipo_documento, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMERO_DOCUMENTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81Numero_documento), "ZZZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROTEXTOCORREO", getSecureSignedToken( "", AV53parametroTextoCorreo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOSEPARADOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62TextoSeparador, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSDESTINOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52parametroCorreosDestinoJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50parametroCorreosCopiaJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAOCULTAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51parametroCorreosCopiaOcultaJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROASUNTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49parametroAsunto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOMBRESADJUNTOSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46NombresAdjuntosJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV42MostrarMail));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Fileuploadfiles", AV32FileUploadFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Fileuploadfiles", AV32FileUploadFiles);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_58", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_58, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTO", AV59Texto);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vUPLOADEDFILES", AV63UploadedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vUPLOADEDFILES", AV63UploadedFiles);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFAILEDFILES", AV28FailedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFAILEDFILES", AV28FailedFiles);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vEMAILS", AV67Emails);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vEMAILS", AV67Emails);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCORREOSDESTINO", AV20CorreosDestino);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCORREOSDESTINO", AV20CorreosDestino);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCORREOSDESTINO", getSecureSignedToken( "", AV20CorreosDestino));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFILEUPLOADFILES", AV32FileUploadFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFILEUPLOADFILES", AV32FileUploadFiles);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPO_DOCUMENTO", AV80Tipo_documento);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_DOCUMENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80Tipo_documento, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMERO_DOCUMENTO", GXutil.ltrim( localUtil.ntoc( AV81Numero_documento, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMERO_DOCUMENTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81Numero_documento), "ZZZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROTEXTOCORREO", AV53parametroTextoCorreo);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROTEXTOCORREO", getSecureSignedToken( "", AV53parametroTextoCorreo));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOSEPARADOR", AV62TextoSeparador);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOSEPARADOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62TextoSeparador, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSDESTINOJSON", AV52parametroCorreosDestinoJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSDESTINOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52parametroCorreosDestinoJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSCOPIAJSON", AV50parametroCorreosCopiaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50parametroCorreosCopiaJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSCOPIAOCULTAJSON", AV51parametroCorreosCopiaOcultaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAOCULTAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51parametroCorreosCopiaOcultaJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROASUNTO", AV49parametroAsunto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROASUNTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49parametroAsunto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOMBRESADJUNTOSJSON", AV46NombresAdjuntosJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOMBRESADJUNTOSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46NombresAdjuntosJson, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMOSTRARMAIL", AV42MostrarMail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV42MostrarMail));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDFILEUPLOADFILESS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDFILEUPLOADFILESS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_Rows", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTO_Enabled", GXutil.booltostr( Texto_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTO_Width", GXutil.rtrim( Texto_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTO_Height", GXutil.rtrim( Texto_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTO_Skin", GXutil.rtrim( Texto_Skin));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTO_Toolbar", GXutil.rtrim( Texto_Toolbar));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTO_Toolbarcancollapse", GXutil.booltostr( Texto_Toolbarcancollapse));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTO_Color", GXutil.ltrim( localUtil.ntoc( Texto_Color, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTO_Captionclass", GXutil.rtrim( Texto_Captionclass));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTO_Captionstyle", GXutil.rtrim( Texto_Captionstyle));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTO_Captionposition", GXutil.rtrim( Texto_Captionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Autoupload", GXutil.booltostr( Upload_Autoupload));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Hideadditionalbuttons", GXutil.booltostr( Upload_Hideadditionalbuttons));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Maxnumberoffiles", GXutil.ltrim( localUtil.ntoc( Upload_Maxnumberoffiles, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Autodisableaddingfiles", GXutil.booltostr( Upload_Autodisableaddingfiles));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Acceptedfiletypes", GXutil.rtrim( Upload_Acceptedfiletypes));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DADOSENVIO_Width", GXutil.rtrim( Dvpanel_dadosenvio_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DADOSENVIO_Autowidth", GXutil.booltostr( Dvpanel_dadosenvio_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DADOSENVIO_Autoheight", GXutil.booltostr( Dvpanel_dadosenvio_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DADOSENVIO_Cls", GXutil.rtrim( Dvpanel_dadosenvio_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DADOSENVIO_Title", GXutil.rtrim( Dvpanel_dadosenvio_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DADOSENVIO_Collapsible", GXutil.booltostr( Dvpanel_dadosenvio_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DADOSENVIO_Collapsed", GXutil.booltostr( Dvpanel_dadosenvio_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DADOSENVIO_Showcollapseicon", GXutil.booltostr( Dvpanel_dadosenvio_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DADOSENVIO_Iconposition", GXutil.rtrim( Dvpanel_dadosenvio_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_DADOSENVIO_Autoscroll", GXutil.booltostr( Dvpanel_dadosenvio_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridfileuploadfiless_empowerer_Gridinternalname));
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
         we2AI2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2AI2( ) ;
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
      return formatLink("app.sendmailattached2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV62TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV52parametroCorreosDestinoJson)),GXutil.URLEncode(GXutil.rtrim(AV50parametroCorreosCopiaJson)),GXutil.URLEncode(GXutil.rtrim(AV51parametroCorreosCopiaOcultaJson)),GXutil.URLEncode(GXutil.rtrim(AV49parametroAsunto)),GXutil.URLEncode(GXutil.rtrim(AV53parametroTextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV46NombresAdjuntosJson)),GXutil.URLEncode(GXutil.booltostr(AV42MostrarMail)),GXutil.URLEncode(GXutil.ltrimstr(AV81Numero_documento,12,0)),GXutil.URLEncode(GXutil.rtrim(AV80Tipo_documento))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail","Numero_documento","Tipo_documento"})  ;
   }

   public String getPgmname( )
   {
      return "SendMailAttached2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Envio de Correo (Archivos Adjuntos)", "") ;
   }

   public void wb2AI0( )
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
         /* User Defined Control */
         ucDvpanel_dadosenvio.setProperty("Width", Dvpanel_dadosenvio_Width);
         ucDvpanel_dadosenvio.setProperty("AutoWidth", Dvpanel_dadosenvio_Autowidth);
         ucDvpanel_dadosenvio.setProperty("AutoHeight", Dvpanel_dadosenvio_Autoheight);
         ucDvpanel_dadosenvio.setProperty("Cls", Dvpanel_dadosenvio_Cls);
         ucDvpanel_dadosenvio.setProperty("Title", Dvpanel_dadosenvio_Title);
         ucDvpanel_dadosenvio.setProperty("Collapsible", Dvpanel_dadosenvio_Collapsible);
         ucDvpanel_dadosenvio.setProperty("Collapsed", Dvpanel_dadosenvio_Collapsed);
         ucDvpanel_dadosenvio.setProperty("ShowCollapseIcon", Dvpanel_dadosenvio_Showcollapseicon);
         ucDvpanel_dadosenvio.setProperty("IconPosition", Dvpanel_dadosenvio_Iconposition);
         ucDvpanel_dadosenvio.setProperty("AutoScroll", Dvpanel_dadosenvio_Autoscroll);
         ucDvpanel_dadosenvio.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_dadosenvio_Internalname, "DVPANEL_DADOSENVIOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_DADOSENVIOContainer"+"DadosEnvio"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDadosenvio_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabledatoscorreo_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavParaemail_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavParaemail_Internalname, httpContext.getMessage( "Para", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavParaemail_Internalname, AV48ParaEmail, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,19);\"", (short)(0), 1, edtavParaemail_Enabled, 0, 80, "chr", 3, "row", (byte)(0), StyleString, ClassString, "", "", "200", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_SendMailAttached2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavParanombre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavParanombre_Internalname, httpContext.getMessage( "Nombre Destino", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavParanombre_Internalname, AV54ParaNombre, GXutil.rtrim( localUtil.format( AV54ParaNombre, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavParanombre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavParanombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SendMailAttached2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCopiaemail_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCopiaemail_Internalname, httpContext.getMessage( "Cc", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCopiaemail_Internalname, AV15CopiaEmail, GXutil.rtrim( localUtil.format( AV15CopiaEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCopiaemail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCopiaemail_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SendMailAttached2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCopianombre_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCopianombre_Internalname, httpContext.getMessage( "Nombre Copia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCopianombre_Internalname, AV16CopiaNombre, GXutil.rtrim( localUtil.format( AV16CopiaNombre, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCopianombre_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCopianombre_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SendMailAttached2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAsunto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAsunto_Internalname, httpContext.getMessage( "Asunto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_58_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAsunto_Internalname, AV8Asunto, GXutil.rtrim( localUtil.format( AV8Asunto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAsunto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAsunto_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SendMailAttached2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop15", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabletexto_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblock1_Internalname, httpContext.getMessage( "Texto", ""), "", "", lblTextblock1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "AttributeWeightBold", 0, "", 1, 1, 0, (short)(0), "HLP_SendMailAttached2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* User Defined Control */
         ucTexto.setProperty("Width", Texto_Width);
         ucTexto.setProperty("Height", Texto_Height);
         ucTexto.setProperty("Attribute", AV59Texto);
         ucTexto.setProperty("Skin", Texto_Skin);
         ucTexto.setProperty("Toolbar", Texto_Toolbar);
         ucTexto.setProperty("ToolbarCanCollapse", Texto_Toolbarcancollapse);
         ucTexto.setProperty("Color", Texto_Color);
         ucTexto.setProperty("CaptionClass", Texto_Captionclass);
         ucTexto.setProperty("CaptionStyle", Texto_Captionstyle);
         ucTexto.setProperty("CaptionPosition", Texto_Captionposition);
         ucTexto.render(context, "fckeditor", Texto_Internalname, "TEXTOContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop30", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableadjuntos_Internalname, 1, 0, "px", divTableadjuntos_Height, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableupload_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucUpload.setProperty("AutoUpload", Upload_Autoupload);
         ucUpload.setProperty("HideAdditionalButtons", Upload_Hideadditionalbuttons);
         ucUpload.setProperty("TooltipText", Upload_Tooltiptext);
         ucUpload.setProperty("MaxNumberOfFiles", Upload_Maxnumberoffiles);
         ucUpload.setProperty("AutoDisableAddingFiles", Upload_Autodisableaddingfiles);
         ucUpload.setProperty("AcceptedFileTypes", Upload_Acceptedfiletypes);
         ucUpload.setProperty("UploadedFiles", AV63UploadedFiles);
         ucUpload.setProperty("FailedFiles", AV28FailedFiles);
         ucUpload.render(context, "fileupload", Upload_Internalname, "UPLOADContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridfileuploadfilessContainer.SetWrapped(nGXWrapped);
         startgridcontrol58( ) ;
      }
      if ( wbEnd == 58 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_58 = (int)(nGXsfl_58_idx-1) ;
         if ( GridfileuploadfilessContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridfileuploadfilessContainer.AddObjectProperty("GRIDFILEUPLOADFILESS_nEOF", GRIDFILEUPLOADFILESS_nEOF);
            GridfileuploadfilessContainer.AddObjectProperty("GRIDFILEUPLOADFILESS_nFirstRecordOnPage", GRIDFILEUPLOADFILESS_nFirstRecordOnPage);
            AV84GXV1 = nGXsfl_58_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridfileuploadfilessContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridfileuploadfiless", GridfileuploadfilessContainer, subGridfileuploadfiless_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridfileuploadfilessContainerData", GridfileuploadfilessContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridfileuploadfilessContainerData"+"V", GridfileuploadfilessContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridfileuploadfilessContainerData"+"V"+"\" value='"+GridfileuploadfilessContainer.GridValuesHidden()+"'/>") ;
            }
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableaction_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenviarcorreo_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "Enviar Correo", ""), bttBtnenviarcorreo_Jsonclick, 5, httpContext.getMessage( "Enviar Correo", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOENVIARCORREO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_SendMailAttached2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 58, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 7, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e112ai1_client"+"'", TempTags, "", 2, "HLP_SendMailAttached2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV90Pgmname), GXutil.rtrim( localUtil.format( AV90Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_SendMailAttached2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucGridfileuploadfiless_empowerer.render(context, "wwp.gridempowerer", Gridfileuploadfiless_empowerer_Internalname, "GRIDFILEUPLOADFILESS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 58 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridfileuploadfilessContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               GridfileuploadfilessContainer.AddObjectProperty("GRIDFILEUPLOADFILESS_nEOF", GRIDFILEUPLOADFILESS_nEOF);
               GridfileuploadfilessContainer.AddObjectProperty("GRIDFILEUPLOADFILESS_nFirstRecordOnPage", GRIDFILEUPLOADFILESS_nFirstRecordOnPage);
               AV84GXV1 = nGXsfl_58_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridfileuploadfilessContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridfileuploadfiless", GridfileuploadfilessContainer, subGridfileuploadfiless_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridfileuploadfilessContainerData", GridfileuploadfilessContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridfileuploadfilessContainerData"+"V", GridfileuploadfilessContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridfileuploadfilessContainerData"+"V"+"\" value='"+GridfileuploadfilessContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2AI2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Envio de Correo (Archivos Adjuntos)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2AI0( ) ;
   }

   public void ws2AI2( )
   {
      start2AI2( ) ;
      evt2AI2( ) ;
   }

   public void evt2AI2( )
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
                        else if ( GXutil.strcmp(sEvt, "UPLOAD.UPLOADCOMPLETE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122AI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOENVIARCORREO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEnviarCorreo' */
                           e132AI2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDFILEUPLOADFILESSPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDFILEUPLOADFILESSPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridfileuploadfiless_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridfileuploadfiless_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridfileuploadfiless_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridfileuploadfiless_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "GRIDFILEUPLOADFILESS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "VDELETAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 14), "VDELETAR.CLICK") == 0 ) )
                        {
                           nGXsfl_58_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_582( ) ;
                           AV84GXV1 = (int)(nGXsfl_58_idx+GRIDFILEUPLOADFILESS_nFirstRecordOnPage) ;
                           if ( ( AV32FileUploadFiles.size() >= AV84GXV1 ) && ( AV84GXV1 > 0 ) )
                           {
                              AV32FileUploadFiles.currentItem( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)) );
                              AV21Deletar = httpContext.cgiGet( edtavDeletar_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDeletar_Internalname, AV21Deletar);
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
                                 e142AI2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDFILEUPLOADFILESS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e152AI2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VDELETAR.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e162AI2 ();
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

   public void we2AI2( )
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

   public void pa2AI2( )
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
            GX_FocusControl = edtavParaemail_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridfileuploadfiless_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_582( ) ;
      while ( nGXsfl_58_idx <= nRC_GXsfl_58 )
      {
         sendrow_582( ) ;
         nGXsfl_58_idx = ((subGridfileuploadfiless_Islastpage==1)&&(nGXsfl_58_idx+1>subgridfileuploadfiless_fnc_recordsperpage( )) ? 1 : nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_582( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridfileuploadfilessContainer)) ;
      /* End function gxnrGridfileuploadfiless_newrow */
   }

   public void gxgrgridfileuploadfiless_refresh( int subGridfileuploadfiless_Rows ,
                                                 GXSimpleCollection<com.genexus.internet.MailRecipient> AV20CorreosDestino ,
                                                 String AV80Tipo_documento ,
                                                 long AV81Numero_documento ,
                                                 String AV53parametroTextoCorreo ,
                                                 String AV62TextoSeparador ,
                                                 String AV52parametroCorreosDestinoJson ,
                                                 String AV50parametroCorreosCopiaJson ,
                                                 String AV51parametroCorreosCopiaOcultaJson ,
                                                 String AV49parametroAsunto ,
                                                 String AV46NombresAdjuntosJson ,
                                                 boolean AV42MostrarMail )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRIDFILEUPLOADFILESS_nCurrentRecord = 0 ;
      rf2AI2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridfileuploadfiless_refresh */
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf2AI2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV90Pgmname = "SendMailAttached2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Pgmname", AV90Pgmname);
      Gx_err = (short)(0) ;
      edtavFileuploadfiles__fullname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__fullname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploadfiles__fullname_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavFileuploadfiles__name_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__name_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploadfiles__name_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavFileuploadfiles__extension_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__extension_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploadfiles__extension_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavFileuploadfiles__size_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__size_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploadfiles__size_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavFileuploadfiles__file_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__file_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploadfiles__file_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavDeletar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDeletar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDeletar_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2AI2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridfileuploadfilessContainer.ClearRows();
      }
      wbStart = (short)(58) ;
      nGXsfl_58_idx = 1 ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_582( ) ;
      bGXsfl_58_Refreshing = true ;
      GridfileuploadfilessContainer.AddObjectProperty("GridName", "Gridfileuploadfiless");
      GridfileuploadfilessContainer.AddObjectProperty("CmpContext", "");
      GridfileuploadfilessContainer.AddObjectProperty("InMasterPage", "false");
      GridfileuploadfilessContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridfileuploadfilessContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridfileuploadfilessContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridfileuploadfilessContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridfileuploadfilessContainer.setPageSize( subgridfileuploadfiless_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_582( ) ;
         e152AI2 ();
         if ( ( GRIDFILEUPLOADFILESS_nCurrentRecord > 0 ) && ( GRIDFILEUPLOADFILESS_nGridOutOfScope == 0 ) && ( nGXsfl_58_idx == 1 ) )
         {
            GRIDFILEUPLOADFILESS_nCurrentRecord = 0 ;
            GRIDFILEUPLOADFILESS_nGridOutOfScope = 1 ;
            subgridfileuploadfiless_firstpage( ) ;
            e152AI2 ();
         }
         wbEnd = (short)(58) ;
         wb2AI0( ) ;
      }
      bGXsfl_58_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2AI2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCORREOSDESTINO", AV20CorreosDestino);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCORREOSDESTINO", AV20CorreosDestino);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCORREOSDESTINO", getSecureSignedToken( "", AV20CorreosDestino));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPO_DOCUMENTO", AV80Tipo_documento);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_DOCUMENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80Tipo_documento, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vNUMERO_DOCUMENTO", GXutil.ltrim( localUtil.ntoc( AV81Numero_documento, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMERO_DOCUMENTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81Numero_documento), "ZZZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROTEXTOCORREO", AV53parametroTextoCorreo);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROTEXTOCORREO", getSecureSignedToken( "", AV53parametroTextoCorreo));
   }

   public int subgridfileuploadfiless_fnc_pagecount( )
   {
      GRIDFILEUPLOADFILESS_nRecordCount = subgridfileuploadfiless_fnc_recordcount( ) ;
      if ( ((int)((GRIDFILEUPLOADFILESS_nRecordCount) % (subgridfileuploadfiless_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDFILEUPLOADFILESS_nRecordCount/ (double) (subgridfileuploadfiless_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDFILEUPLOADFILESS_nRecordCount/ (double) (subgridfileuploadfiless_fnc_recordsperpage( )))+1) ;
   }

   public int subgridfileuploadfiless_fnc_recordcount( )
   {
      return AV32FileUploadFiles.size() ;
   }

   public int subgridfileuploadfiless_fnc_recordsperpage( )
   {
      if ( subGridfileuploadfiless_Rows > 0 )
      {
         return subGridfileuploadfiless_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridfileuploadfiless_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDFILEUPLOADFILESS_nFirstRecordOnPage/ (double) (subgridfileuploadfiless_fnc_recordsperpage( )))+1) ;
   }

   public short subgridfileuploadfiless_firstpage( )
   {
      GRIDFILEUPLOADFILESS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDFILEUPLOADFILESS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridfileuploadfiless_refresh( subGridfileuploadfiless_Rows, AV20CorreosDestino, AV80Tipo_documento, AV81Numero_documento, AV53parametroTextoCorreo, AV62TextoSeparador, AV52parametroCorreosDestinoJson, AV50parametroCorreosCopiaJson, AV51parametroCorreosCopiaOcultaJson, AV49parametroAsunto, AV46NombresAdjuntosJson, AV42MostrarMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridfileuploadfiless_nextpage( )
   {
      GRIDFILEUPLOADFILESS_nRecordCount = subgridfileuploadfiless_fnc_recordcount( ) ;
      if ( ( GRIDFILEUPLOADFILESS_nRecordCount >= subgridfileuploadfiless_fnc_recordsperpage( ) ) && ( GRIDFILEUPLOADFILESS_nEOF == 0 ) )
      {
         GRIDFILEUPLOADFILESS_nFirstRecordOnPage = (long)(GRIDFILEUPLOADFILESS_nFirstRecordOnPage+subgridfileuploadfiless_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDFILEUPLOADFILESS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridfileuploadfilessContainer.AddObjectProperty("GRIDFILEUPLOADFILESS_nFirstRecordOnPage", GRIDFILEUPLOADFILESS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridfileuploadfiless_refresh( subGridfileuploadfiless_Rows, AV20CorreosDestino, AV80Tipo_documento, AV81Numero_documento, AV53parametroTextoCorreo, AV62TextoSeparador, AV52parametroCorreosDestinoJson, AV50parametroCorreosCopiaJson, AV51parametroCorreosCopiaOcultaJson, AV49parametroAsunto, AV46NombresAdjuntosJson, AV42MostrarMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDFILEUPLOADFILESS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridfileuploadfiless_previouspage( )
   {
      if ( GRIDFILEUPLOADFILESS_nFirstRecordOnPage >= subgridfileuploadfiless_fnc_recordsperpage( ) )
      {
         GRIDFILEUPLOADFILESS_nFirstRecordOnPage = (long)(GRIDFILEUPLOADFILESS_nFirstRecordOnPage-subgridfileuploadfiless_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDFILEUPLOADFILESS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridfileuploadfiless_refresh( subGridfileuploadfiless_Rows, AV20CorreosDestino, AV80Tipo_documento, AV81Numero_documento, AV53parametroTextoCorreo, AV62TextoSeparador, AV52parametroCorreosDestinoJson, AV50parametroCorreosCopiaJson, AV51parametroCorreosCopiaOcultaJson, AV49parametroAsunto, AV46NombresAdjuntosJson, AV42MostrarMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridfileuploadfiless_lastpage( )
   {
      GRIDFILEUPLOADFILESS_nRecordCount = subgridfileuploadfiless_fnc_recordcount( ) ;
      if ( GRIDFILEUPLOADFILESS_nRecordCount > subgridfileuploadfiless_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDFILEUPLOADFILESS_nRecordCount) % (subgridfileuploadfiless_fnc_recordsperpage( )))) == 0 )
         {
            GRIDFILEUPLOADFILESS_nFirstRecordOnPage = (long)(GRIDFILEUPLOADFILESS_nRecordCount-subgridfileuploadfiless_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDFILEUPLOADFILESS_nFirstRecordOnPage = (long)(GRIDFILEUPLOADFILESS_nRecordCount-((int)((GRIDFILEUPLOADFILESS_nRecordCount) % (subgridfileuploadfiless_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDFILEUPLOADFILESS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDFILEUPLOADFILESS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridfileuploadfiless_refresh( subGridfileuploadfiless_Rows, AV20CorreosDestino, AV80Tipo_documento, AV81Numero_documento, AV53parametroTextoCorreo, AV62TextoSeparador, AV52parametroCorreosDestinoJson, AV50parametroCorreosCopiaJson, AV51parametroCorreosCopiaOcultaJson, AV49parametroAsunto, AV46NombresAdjuntosJson, AV42MostrarMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridfileuploadfiless_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDFILEUPLOADFILESS_nFirstRecordOnPage = (long)(subgridfileuploadfiless_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDFILEUPLOADFILESS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDFILEUPLOADFILESS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridfileuploadfiless_refresh( subGridfileuploadfiless_Rows, AV20CorreosDestino, AV80Tipo_documento, AV81Numero_documento, AV53parametroTextoCorreo, AV62TextoSeparador, AV52parametroCorreosDestinoJson, AV50parametroCorreosCopiaJson, AV51parametroCorreosCopiaOcultaJson, AV49parametroAsunto, AV46NombresAdjuntosJson, AV42MostrarMail) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV90Pgmname = "SendMailAttached2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV90Pgmname", AV90Pgmname);
      Gx_err = (short)(0) ;
      edtavFileuploadfiles__fullname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__fullname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploadfiles__fullname_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavFileuploadfiles__name_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__name_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploadfiles__name_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavFileuploadfiles__extension_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__extension_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploadfiles__extension_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavFileuploadfiles__size_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__size_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploadfiles__size_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavFileuploadfiles__file_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__file_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploadfiles__file_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavDeletar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDeletar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDeletar_Enabled), 5, 0), !bGXsfl_58_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2AI0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e142AI2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Fileuploadfiles"), AV32FileUploadFiles);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vUPLOADEDFILES"), AV63UploadedFiles);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFAILEDFILES"), AV28FailedFiles);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFILEUPLOADFILES"), AV32FileUploadFiles);
         /* Read saved values. */
         nRC_GXsfl_58 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_58"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV59Texto = httpContext.cgiGet( "vTEXTO") ;
         GRIDFILEUPLOADFILESS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDFILEUPLOADFILESS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDFILEUPLOADFILESS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDFILEUPLOADFILESS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridfileuploadfiless_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDFILEUPLOADFILESS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_Rows", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Rows, (byte)(6), (byte)(0), ".", "")));
         Texto_Enabled = GXutil.strtobool( httpContext.cgiGet( "TEXTO_Enabled")) ;
         Texto_Width = httpContext.cgiGet( "TEXTO_Width") ;
         Texto_Height = httpContext.cgiGet( "TEXTO_Height") ;
         Texto_Skin = httpContext.cgiGet( "TEXTO_Skin") ;
         Texto_Toolbar = httpContext.cgiGet( "TEXTO_Toolbar") ;
         Texto_Toolbarcancollapse = GXutil.strtobool( httpContext.cgiGet( "TEXTO_Toolbarcancollapse")) ;
         Texto_Color = (int)(localUtil.ctol( httpContext.cgiGet( "TEXTO_Color"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Texto_Captionclass = httpContext.cgiGet( "TEXTO_Captionclass") ;
         Texto_Captionstyle = httpContext.cgiGet( "TEXTO_Captionstyle") ;
         Texto_Captionposition = httpContext.cgiGet( "TEXTO_Captionposition") ;
         Upload_Autoupload = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Autoupload")) ;
         Upload_Hideadditionalbuttons = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Hideadditionalbuttons")) ;
         Upload_Maxnumberoffiles = (int)(localUtil.ctol( httpContext.cgiGet( "UPLOAD_Maxnumberoffiles"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Upload_Autodisableaddingfiles = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Autodisableaddingfiles")) ;
         Upload_Acceptedfiletypes = httpContext.cgiGet( "UPLOAD_Acceptedfiletypes") ;
         Dvpanel_dadosenvio_Width = httpContext.cgiGet( "DVPANEL_DADOSENVIO_Width") ;
         Dvpanel_dadosenvio_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DADOSENVIO_Autowidth")) ;
         Dvpanel_dadosenvio_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DADOSENVIO_Autoheight")) ;
         Dvpanel_dadosenvio_Cls = httpContext.cgiGet( "DVPANEL_DADOSENVIO_Cls") ;
         Dvpanel_dadosenvio_Title = httpContext.cgiGet( "DVPANEL_DADOSENVIO_Title") ;
         Dvpanel_dadosenvio_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DADOSENVIO_Collapsible")) ;
         Dvpanel_dadosenvio_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DADOSENVIO_Collapsed")) ;
         Dvpanel_dadosenvio_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DADOSENVIO_Showcollapseicon")) ;
         Dvpanel_dadosenvio_Iconposition = httpContext.cgiGet( "DVPANEL_DADOSENVIO_Iconposition") ;
         Dvpanel_dadosenvio_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_DADOSENVIO_Autoscroll")) ;
         Gridfileuploadfiless_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDFILEUPLOADFILESS_EMPOWERER_Gridinternalname") ;
         nRC_GXsfl_58 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_58"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_58_fel_idx = 0 ;
         while ( nGXsfl_58_fel_idx < nRC_GXsfl_58 )
         {
            nGXsfl_58_fel_idx = ((subGridfileuploadfiless_Islastpage==1)&&(nGXsfl_58_fel_idx+1>subgridfileuploadfiless_fnc_recordsperpage( )) ? 1 : nGXsfl_58_fel_idx+1) ;
            sGXsfl_58_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_582( ) ;
            AV84GXV1 = (int)(nGXsfl_58_fel_idx+GRIDFILEUPLOADFILESS_nFirstRecordOnPage) ;
            if ( ( AV32FileUploadFiles.size() >= AV84GXV1 ) && ( AV84GXV1 > 0 ) )
            {
               AV32FileUploadFiles.currentItem( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)) );
               AV21Deletar = httpContext.cgiGet( edtavDeletar_Internalname) ;
            }
         }
         if ( nGXsfl_58_fel_idx == 0 )
         {
            nGXsfl_58_idx = 1 ;
            sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_582( ) ;
         }
         nGXsfl_58_fel_idx = 1 ;
         /* Read variables values. */
         AV48ParaEmail = httpContext.cgiGet( edtavParaemail_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48ParaEmail", AV48ParaEmail);
         AV54ParaNombre = httpContext.cgiGet( edtavParanombre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54ParaNombre", AV54ParaNombre);
         AV15CopiaEmail = httpContext.cgiGet( edtavCopiaemail_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15CopiaEmail", AV15CopiaEmail);
         AV16CopiaNombre = httpContext.cgiGet( edtavCopianombre_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16CopiaNombre", AV16CopiaNombre);
         AV8Asunto = httpContext.cgiGet( edtavAsunto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Asunto", AV8Asunto);
         AV90Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV90Pgmname", AV90Pgmname);
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
      e142AI2 ();
      if (returnInSub) return;
   }

   public void e142AI2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV55PathTomcat = AV6AppTool.servletinfo() ;
      AV70AppName = AV36HTTPRequest.getRemoteAddress() ;
      GXt_char1 = AV58Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      sendmailattached2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV58Station = GXt_char1 ;
      GXv_char2[0] = AV25EmprCod ;
      GXv_char3[0] = AV26EmprNom ;
      GXv_char4[0] = AV65UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV58Station, GXv_char2, GXv_char3, GXv_char4) ;
      sendmailattached2_impl.this.AV25EmprCod = GXv_char2[0] ;
      sendmailattached2_impl.this.AV26EmprNom = GXv_char3[0] ;
      sendmailattached2_impl.this.AV65UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25EmprCod", AV25EmprCod);
      divTableadjuntos_Height = 300 ;
      httpContext.ajax_rsp_assign_prop("", false, divTableadjuntos_Internalname, "Height", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableadjuntos_Height), 9, 0), true);
      Gridfileuploadfiless_empowerer_Gridinternalname = subGridfileuploadfiless_Internalname ;
      ucGridfileuploadfiless_empowerer.sendProperty(context, "", false, Gridfileuploadfiless_empowerer_Internalname, "GridInternalName", Gridfileuploadfiless_empowerer_Gridinternalname);
      subGridfileuploadfiless_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_Rows", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Rows, (byte)(6), (byte)(0), ".", "")));
      AV48ParaEmail = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV48ParaEmail", AV48ParaEmail);
      AV54ParaNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54ParaNombre", AV54ParaNombre);
      AV15CopiaEmail = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15CopiaEmail", AV15CopiaEmail);
      AV16CopiaNombre = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CopiaNombre", AV16CopiaNombre);
      AV8Asunto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Asunto", AV8Asunto);
      AV59Texto = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Texto", AV59Texto);
      /* Execute user subroutine: 'CARGAR DATOS PARAMÉTRICOS' */
      S112 ();
      if (returnInSub) return;
   }

   private void e152AI2( )
   {
      /* Gridfileuploadfiless_Load Routine */
      returnInSub = false ;
      AV84GXV1 = 1 ;
      while ( AV84GXV1 <= AV32FileUploadFiles.size() )
      {
         AV32FileUploadFiles.currentItem( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)) );
         AV21Deletar = "<i class=\"fa-trash-alt far\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDeletar_Internalname, AV21Deletar);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(58) ;
         }
         if ( ( subGridfileuploadfiless_Islastpage == 1 ) || ( subGridfileuploadfiless_Rows == 0 ) || ( ( GRIDFILEUPLOADFILESS_nCurrentRecord >= GRIDFILEUPLOADFILESS_nFirstRecordOnPage ) && ( GRIDFILEUPLOADFILESS_nCurrentRecord < GRIDFILEUPLOADFILESS_nFirstRecordOnPage + subgridfileuploadfiless_fnc_recordsperpage( ) ) ) )
         {
            sendrow_582( ) ;
            GRIDFILEUPLOADFILESS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDFILEUPLOADFILESS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDFILEUPLOADFILESS_nCurrentRecord + 1 >= subgridfileuploadfiless_fnc_recordcount( ) )
            {
               GRIDFILEUPLOADFILESS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDFILEUPLOADFILESS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDFILEUPLOADFILESS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDFILEUPLOADFILESS_nCurrentRecord = (long)(GRIDFILEUPLOADFILESS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_58_Refreshing )
         {
            httpContext.doAjaxLoad(58, GridfileuploadfilessRow);
         }
         AV84GXV1 = (int)(AV84GXV1+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void e132AI2( )
   {
      AV84GXV1 = (int)(nGXsfl_58_idx+GRIDFILEUPLOADFILESS_nFirstRecordOnPage) ;
      if ( ( AV84GXV1 > 0 ) && ( AV32FileUploadFiles.size() >= AV84GXV1 ) )
      {
         AV32FileUploadFiles.currentItem( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)) );
      }
      /* 'DoEnviarCorreo' Routine */
      returnInSub = false ;
      AV67Emails.setgxTv_SdtEmails_Title( AV8Asunto );
      AV67Emails.setgxTv_SdtEmails_Subject( AV8Asunto );
      AV67Emails.setgxTv_SdtEmails_Htmltext( AV59Texto );
      if ( (GXutil.strcmp("", AV48ParaEmail)==0) && ( AV20CorreosDestino.size() == 0 ) )
      {
         httpContext.GX_msglist.addItem("Se requiere nombre destinatario");
      }
      else if ( (GXutil.strcmp("", AV15CopiaEmail)==0) && ( AV20CorreosDestino.size() == 0 ) )
      {
         httpContext.GX_msglist.addItem("Se requiere mail destinatario");
      }
      else if ( (GXutil.strcmp("", AV8Asunto)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere asunto del mail", ""));
      }
      else if ( (GXutil.strcmp("", AV59Texto)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere texto del mail", ""));
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV48ParaEmail)==0) )
         {
            AV67Emails.getgxTv_SdtEmails_To().clear();
            AV92GXV8 = 1 ;
            AV91GXV7 = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV48ParaEmail,";")) ;
            while ( AV92GXV8 <= AV91GXV7.size() )
            {
               AV79sParaEmail = (String)AV91GXV7.elementAt(-1+AV92GXV8) ;
               AV78Emails_TO = (app.SdtEmails_TOItem)new app.SdtEmails_TOItem(remoteHandle, context);
               AV78Emails_TO.setgxTv_SdtEmails_TOItem_Email( AV79sParaEmail );
               AV78Emails_TO.setgxTv_SdtEmails_TOItem_Name( AV54ParaNombre );
               AV67Emails.getgxTv_SdtEmails_To().add(AV78Emails_TO, 0);
               AV92GXV8 = (int)(AV92GXV8+1) ;
            }
         }
         if ( ! (GXutil.strcmp("", AV15CopiaEmail)==0) )
         {
            AV67Emails.getgxTv_SdtEmails_Cc().clear();
            AV94GXV10 = 1 ;
            AV93GXV9 = new GXSimpleCollection<String>(String.class, "internal", "", GxRegex.Split(AV15CopiaEmail,";")) ;
            while ( AV94GXV10 <= AV93GXV9.size() )
            {
               AV71sCopiaEmail = (String)AV93GXV9.elementAt(-1+AV94GXV10) ;
               AV68Emails_CC = (app.SdtEmails_CCitem)new app.SdtEmails_CCitem(remoteHandle, context);
               AV68Emails_CC.setgxTv_SdtEmails_CCitem_Email( AV71sCopiaEmail );
               AV68Emails_CC.setgxTv_SdtEmails_CCitem_Name( AV16CopiaNombre );
               AV67Emails.getgxTv_SdtEmails_Cc().add(AV68Emails_CC, 0);
               AV94GXV10 = (int)(AV94GXV10+1) ;
            }
         }
         AV14CodigoErrorEnvio = 0 ;
         AV22DescripcionErrorEnvio = "" ;
         GXv_int5[0] = AV14CodigoErrorEnvio ;
         GXv_char4[0] = AV22DescripcionErrorEnvio ;
         new app.psend_email2(remoteHandle, context).execute( AV67Emails, AV32FileUploadFiles, GXv_int5, GXv_char4) ;
         sendmailattached2_impl.this.AV14CodigoErrorEnvio = GXv_int5[0] ;
         sendmailattached2_impl.this.AV22DescripcionErrorEnvio = GXv_char4[0] ;
         if ( AV14CodigoErrorEnvio == 200 )
         {
            if ( GXutil.strcmp(AV80Tipo_documento, "FRA") == 0 )
            {
               new app.facturacion.psetfraenvmail(remoteHandle, context).execute( (int)(AV81Numero_documento), "") ;
            }
            else if ( GXutil.strcmp(AV80Tipo_documento, "GUIA") == 0 )
            {
               new app.albaranes.psetalbenvmail(remoteHandle, context).execute( AV81Numero_documento) ;
            }
            callWebObject(formatLink("app.sendemailinfo", new String[] {}, new String[] {}) );
            httpContext.wjLocDisableFrm = (byte)(1) ;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV67Emails", AV67Emails);
   }

   public void e122AI2( )
   {
      AV84GXV1 = (int)(nGXsfl_58_idx+GRIDFILEUPLOADFILESS_nFirstRecordOnPage) ;
      if ( ( AV84GXV1 > 0 ) && ( AV32FileUploadFiles.size() >= AV84GXV1 ) )
      {
         AV32FileUploadFiles.currentItem( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)) );
      }
      /* Upload_Uploadcomplete Routine */
      returnInSub = false ;
      AV33FileUploadFiles_File = (app.SdtFileUploadFiles_File)new app.SdtFileUploadFiles_File(remoteHandle, context);
      AV33FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Fullname( ((app.SdtFileUploadData)AV63UploadedFiles.elementAt(-1+1)).getgxTv_SdtFileUploadData_Fullname() );
      AV33FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Name( ((app.SdtFileUploadData)AV63UploadedFiles.elementAt(-1+1)).getgxTv_SdtFileUploadData_Name() );
      AV33FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Extension( ((app.SdtFileUploadData)AV63UploadedFiles.elementAt(-1+1)).getgxTv_SdtFileUploadData_Extension() );
      AV33FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Size( ((app.SdtFileUploadData)AV63UploadedFiles.elementAt(-1+1)).getgxTv_SdtFileUploadData_Size() );
      AV33FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_File( ((app.SdtFileUploadData)AV63UploadedFiles.elementAt(-1+1)).getgxTv_SdtFileUploadData_File() );
      AV32FileUploadFiles.add(AV33FileUploadFiles_File, 0);
      gx_BV58 = true ;
      AV43NombreArchivo = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43NombreArchivo", AV43NombreArchivo);
      /* Execute user subroutine: 'LISTAADJUNTO' */
      S122 ();
      if (returnInSub) return;
      AV63UploadedFiles.clear();
      this.executeUsercontrolMethod("", false, "UPLOADContainer", "Clear", "", new Object[] {});
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV32FileUploadFiles", AV32FileUploadFiles);
      nGXsfl_58_bak_idx = nGXsfl_58_idx ;
      gxgrgridfileuploadfiless_refresh( subGridfileuploadfiless_Rows, AV20CorreosDestino, AV80Tipo_documento, AV81Numero_documento, AV53parametroTextoCorreo, AV62TextoSeparador, AV52parametroCorreosDestinoJson, AV50parametroCorreosCopiaJson, AV51parametroCorreosCopiaOcultaJson, AV49parametroAsunto, AV46NombresAdjuntosJson, AV42MostrarMail) ;
      nGXsfl_58_idx = nGXsfl_58_bak_idx ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_582( ) ;
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV63UploadedFiles", AV63UploadedFiles);
   }

   public void e162AI2( )
   {
      AV84GXV1 = (int)(nGXsfl_58_idx+GRIDFILEUPLOADFILESS_nFirstRecordOnPage) ;
      if ( ( AV84GXV1 > 0 ) && ( AV32FileUploadFiles.size() >= AV84GXV1 ) )
      {
         AV32FileUploadFiles.currentItem( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)) );
      }
      /* Deletar_Click Routine */
      returnInSub = false ;
      AV37indexOf = (short)(AV32FileUploadFiles.indexof(((app.SdtFileUploadFiles_File)AV32FileUploadFiles.currentItem()))) ;
      AV32FileUploadFiles.removeItem(AV37indexOf);
      gx_BV58 = true ;
      /* Execute user subroutine: 'LISTAADJUNTO' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV32FileUploadFiles", AV32FileUploadFiles);
      nGXsfl_58_bak_idx = nGXsfl_58_idx ;
      gxgrgridfileuploadfiless_refresh( subGridfileuploadfiless_Rows, AV20CorreosDestino, AV80Tipo_documento, AV81Numero_documento, AV53parametroTextoCorreo, AV62TextoSeparador, AV52parametroCorreosDestinoJson, AV50parametroCorreosCopiaJson, AV51parametroCorreosCopiaOcultaJson, AV49parametroAsunto, AV46NombresAdjuntosJson, AV42MostrarMail) ;
      nGXsfl_58_idx = nGXsfl_58_bak_idx ;
      sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_582( ) ;
   }

   public void S122( )
   {
      /* 'LISTAADJUNTO' Routine */
      returnInSub = false ;
      AV59Texto = AV53parametroTextoCorreo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Texto", AV59Texto);
      AV38ListaAnexo = httpContext.getMessage( "<ul>", "") ;
      AV95GXV11 = 1 ;
      while ( AV95GXV11 <= AV32FileUploadFiles.size() )
      {
         AV33FileUploadFiles_File = (app.SdtFileUploadFiles_File)((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV95GXV11));
         AV38ListaAnexo += httpContext.getMessage( "<li>", "") + AV33FileUploadFiles_File.getgxTv_SdtFileUploadFiles_File_Fullname() + httpContext.getMessage( "</li>", "") ;
         AV95GXV11 = (int)(AV95GXV11+1) ;
      }
      AV38ListaAnexo += httpContext.getMessage( "</ul>", "") ;
      AV59Texto = GXutil.strReplace( AV59Texto, httpContext.getMessage( "#ADJUNTO#", ""), AV38ListaAnexo) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Texto", AV59Texto);
   }

   public void S112( )
   {
      /* 'CARGAR DATOS PARAMÉTRICOS' Routine */
      returnInSub = false ;
      GXt_SdtEmails6 = AV67Emails;
      GXv_SdtEmails7[0] = GXt_SdtEmails6;
      new app.dpemail(remoteHandle, context).execute( AV25EmprCod, GXv_SdtEmails7) ;
      GXt_SdtEmails6 = GXv_SdtEmails7[0] ;
      AV67Emails = GXt_SdtEmails6;
      AV41ListaCorreosDestino.fromJSonString(AV52parametroCorreosDestinoJson, null);
      AV96GXV12 = 1 ;
      while ( AV96GXV12 <= AV41ListaCorreosDestino.size() )
      {
         AV12CadenaRegistrar = (String)AV41ListaCorreosDestino.elementAt(-1+AV96GXV12) ;
         AV56PosicionSeparador = (short)(GXutil.strSearch( AV12CadenaRegistrar, AV62TextoSeparador, 1)) ;
         AV48ParaEmail = GXutil.trim( GXutil.substring( AV12CadenaRegistrar, 1, (AV56PosicionSeparador-1))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48ParaEmail", AV48ParaEmail);
         if ( ! GXutil.endsWith( AV48ParaEmail, ";") )
         {
            AV48ParaEmail += ";" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV48ParaEmail", AV48ParaEmail);
         }
         AV56PosicionSeparador = (short)(AV56PosicionSeparador+(GXutil.len( AV62TextoSeparador))) ;
         AV54ParaNombre = GXutil.trim( GXutil.substring( AV12CadenaRegistrar, AV56PosicionSeparador, GXutil.len( AV12CadenaRegistrar))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV54ParaNombre", AV54ParaNombre);
         if ( ! AV42MostrarMail )
         {
            AV5Cantidad = AV5Cantidad.add(DecimalUtil.doubleToDec(1)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Cantidad", GXutil.ltrimstr( AV5Cantidad, 9, 2));
         }
         AV96GXV12 = (int)(AV96GXV12+1) ;
      }
      if ( ! (GXutil.strcmp("", AV50parametroCorreosCopiaJson)==0) )
      {
         AV39ListaCorreosCopia.fromJSonString(AV50parametroCorreosCopiaJson, null);
         AV97GXV13 = 1 ;
         while ( AV97GXV13 <= AV39ListaCorreosCopia.size() )
         {
            AV12CadenaRegistrar = (String)AV39ListaCorreosCopia.elementAt(-1+AV97GXV13) ;
            AV56PosicionSeparador = (short)(GXutil.strSearch( AV12CadenaRegistrar, AV62TextoSeparador, 1)) ;
            AV15CopiaEmail = GXutil.trim( GXutil.substring( AV12CadenaRegistrar, 1, (AV56PosicionSeparador-1))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15CopiaEmail", AV15CopiaEmail);
            if ( ! GXutil.endsWith( AV15CopiaEmail, ";") )
            {
               AV15CopiaEmail += ";" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15CopiaEmail", AV15CopiaEmail);
            }
            AV68Emails_CC = (app.SdtEmails_CCitem)new app.SdtEmails_CCitem(remoteHandle, context);
            AV68Emails_CC.setgxTv_SdtEmails_CCitem_Email( GXutil.trim( GXutil.substring( AV12CadenaRegistrar, 1, (AV56PosicionSeparador-1))) );
            AV68Emails_CC.setgxTv_SdtEmails_CCitem_Name( GXutil.trim( GXutil.strReplace( GXutil.substring( AV12CadenaRegistrar, AV56PosicionSeparador, GXutil.len( AV12CadenaRegistrar)), AV62TextoSeparador, "")) );
            AV16CopiaNombre = GXutil.trim( GXutil.strReplace( GXutil.substring( AV12CadenaRegistrar, AV56PosicionSeparador, GXutil.len( AV12CadenaRegistrar)), AV62TextoSeparador, "")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16CopiaNombre", AV16CopiaNombre);
            AV67Emails.getgxTv_SdtEmails_Cc().add(AV68Emails_CC, 0);
            AV97GXV13 = (int)(AV97GXV13+1) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV51parametroCorreosCopiaOcultaJson)==0) )
      {
         AV40ListaCorreosCopiaOculta.fromJSonString(AV51parametroCorreosCopiaOcultaJson, null);
         AV98GXV14 = 1 ;
         while ( AV98GXV14 <= AV40ListaCorreosCopiaOculta.size() )
         {
            AV12CadenaRegistrar = (String)AV40ListaCorreosCopiaOculta.elementAt(-1+AV98GXV14) ;
            AV56PosicionSeparador = (short)(GXutil.strSearch( AV12CadenaRegistrar, AV62TextoSeparador, 1)) ;
            AV69Emails_CCO = (app.SdtEmails_CCOItem)new app.SdtEmails_CCOItem(remoteHandle, context);
            AV69Emails_CCO.setgxTv_SdtEmails_CCOItem_Email( GXutil.substring( AV12CadenaRegistrar, 1, (AV56PosicionSeparador-1)) );
            AV69Emails_CCO.setgxTv_SdtEmails_CCOItem_Name( GXutil.strReplace( GXutil.substring( AV12CadenaRegistrar, AV56PosicionSeparador, GXutil.len( AV12CadenaRegistrar)), AV62TextoSeparador, "") );
            AV67Emails.getgxTv_SdtEmails_Cco().add(AV69Emails_CCO, 0);
            AV98GXV14 = (int)(AV98GXV14+1) ;
         }
      }
      AV8Asunto = AV49parametroAsunto ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Asunto", AV8Asunto);
      AV59Texto = AV53parametroTextoCorreo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV59Texto", AV59Texto);
      AV60TextoCorreo = GXutil.strReplace( AV53parametroTextoCorreo, "<br>", GXutil.newLine( )) ;
      AV5Cantidad = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Cantidad", GXutil.ltrimstr( AV5Cantidad, 9, 2));
      AV67Emails.setgxTv_SdtEmails_Title( AV8Asunto );
      AV67Emails.setgxTv_SdtEmails_Subject( AV8Asunto );
      AV67Emails.setgxTv_SdtEmails_Htmltext( AV60TextoCorreo );
      AV45NombresAdjuntos.fromJSonString(AV46NombresAdjuntosJson, null);
      if ( AV45NombresAdjuntos.size() > 0 )
      {
         AV99GXV15 = 1 ;
         while ( AV99GXV15 <= AV45NombresAdjuntos.size() )
         {
            AV57RutaAdjunto = (String)AV45NombresAdjuntos.elementAt(-1+AV99GXV15) ;
            AV13CantidadArchivos = (short)(AV13CantidadArchivos+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13CantidadArchivos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13CantidadArchivos), 4, 0));
            if ( AV13CantidadArchivos == 1 )
            {
               AV43NombreArchivo = AV57RutaAdjunto ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43NombreArchivo", AV43NombreArchivo);
            }
            else
            {
               AV43NombreArchivo += GXutil.newLine( ) + AV57RutaAdjunto ;
               httpContext.ajax_rsp_assign_attri("", false, "AV43NombreArchivo", AV43NombreArchivo);
            }
            if ( GxRegex.IsMatch(AV57RutaAdjunto,httpContext.getMessage( "pdf", "")) )
            {
               AV10Blob = AV57RutaAdjunto ;
               AV29File = (com.genexus.util.GXFile)new com.genexus.util.GXFile();
               AV29File.setSource( AV10Blob );
               AV11BlobFile = AV29File.getURI() ;
               AV100Blobfile_GXI = GXDbFile.pathToUrl( AV29File.getURI(), context.getHttpContext()) ;
               AV27Extension = "PDF" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27Extension", AV27Extension);
            }
            else
            {
               AV29File = (com.genexus.util.GXFile)new com.genexus.util.GXFile();
               AV29File.setSource( AV57RutaAdjunto );
               AV11BlobFile = AV29File.getURI() ;
               AV100Blobfile_GXI = GXDbFile.pathToUrl( AV29File.getURI(), context.getHttpContext()) ;
            }
            if ( AV29File.exists() )
            {
               AV33FileUploadFiles_File = (app.SdtFileUploadFiles_File)new app.SdtFileUploadFiles_File(remoteHandle, context);
               AV33FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_File( AV11BlobFile );
               AV33FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Extension( AV27Extension );
               AV33FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Fullname( GXDbFile.getFileName( AV100Blobfile_GXI) );
               AV33FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Name( AV29File.getName() );
               AV33FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Size( AV29File.getLength() );
               AV33FileUploadFiles_File.setgxTv_SdtFileUploadFiles_File_Path( AV57RutaAdjunto );
               AV32FileUploadFiles.add(AV33FileUploadFiles_File, 0);
               gx_BV58 = true ;
               AV27Extension = "" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27Extension", AV27Extension);
            }
            AV99GXV15 = (int)(AV99GXV15+1) ;
         }
      }
      /* Execute user subroutine: 'LISTAADJUNTO' */
      S122 ();
      if (returnInSub) return;
      AV67Emails.setgxTv_SdtEmails_Htmltext( AV59Texto );
      if ( ! AV42MostrarMail && ( AV5Cantidad.doubleValue() > 0 ) )
      {
         GXv_int5[0] = AV14CodigoErrorEnvio ;
         GXv_char4[0] = AV22DescripcionErrorEnvio ;
         new app.psend_email2(remoteHandle, context).execute( AV67Emails, AV32FileUploadFiles, GXv_int5, GXv_char4) ;
         sendmailattached2_impl.this.AV14CodigoErrorEnvio = GXv_int5[0] ;
         sendmailattached2_impl.this.AV22DescripcionErrorEnvio = GXv_char4[0] ;
         if ( AV14CodigoErrorEnvio == 200 )
         {
            if ( GXutil.strcmp(AV80Tipo_documento, "FRA") == 0 )
            {
               new app.facturacion.psetfraenvmail(remoteHandle, context).execute( (int)(AV81Numero_documento), "") ;
            }
            else if ( GXutil.strcmp(AV80Tipo_documento, "GUIA") == 0 )
            {
               new app.albaranes.psetalbenvmail(remoteHandle, context).execute( AV81Numero_documento) ;
            }
         }
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV62TextoSeparador = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV62TextoSeparador", AV62TextoSeparador);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOSEPARADOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV62TextoSeparador, ""))));
      AV52parametroCorreosDestinoJson = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52parametroCorreosDestinoJson", AV52parametroCorreosDestinoJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSDESTINOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52parametroCorreosDestinoJson, ""))));
      AV50parametroCorreosCopiaJson = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50parametroCorreosCopiaJson", AV50parametroCorreosCopiaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV50parametroCorreosCopiaJson, ""))));
      AV51parametroCorreosCopiaOcultaJson = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51parametroCorreosCopiaOcultaJson", AV51parametroCorreosCopiaOcultaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAOCULTAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV51parametroCorreosCopiaOcultaJson, ""))));
      AV49parametroAsunto = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49parametroAsunto", AV49parametroAsunto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROASUNTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV49parametroAsunto, ""))));
      AV53parametroTextoCorreo = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53parametroTextoCorreo", AV53parametroTextoCorreo);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROTEXTOCORREO", getSecureSignedToken( "", AV53parametroTextoCorreo));
      AV46NombresAdjuntosJson = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46NombresAdjuntosJson", AV46NombresAdjuntosJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOMBRESADJUNTOSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV46NombresAdjuntosJson, ""))));
      AV42MostrarMail = ((Boolean) getParm(obj,7)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42MostrarMail", AV42MostrarMail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV42MostrarMail));
      AV81Numero_documento = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV81Numero_documento", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81Numero_documento), 12, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNUMERO_DOCUMENTO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV81Numero_documento), "ZZZZZZZZZZZ9")));
      AV80Tipo_documento = (String)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Tipo_documento", AV80Tipo_documento);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTIPO_DOCUMENTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV80Tipo_documento, ""))));
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
      pa2AI2( ) ;
      ws2AI2( ) ;
      we2AI2( ) ;
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
      httpContext.AddStyleSheetFile("FileUpload/fileupload.min.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266291250418", true, true);
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
      httpContext.AddJavascriptSource("sendmailattached2.js", "?20266291250418", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("CKEditor/ckeditor/ckeditor.js", "", false, true);
      httpContext.AddJavascriptSource("CKEditor/CKEditorRender.js", "", false, true);
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_582( )
   {
      edtavFileuploadfiles__fullname_Internalname = "FILEUPLOADFILES__FULLNAME_"+sGXsfl_58_idx ;
      edtavFileuploadfiles__name_Internalname = "FILEUPLOADFILES__NAME_"+sGXsfl_58_idx ;
      edtavFileuploadfiles__extension_Internalname = "FILEUPLOADFILES__EXTENSION_"+sGXsfl_58_idx ;
      edtavFileuploadfiles__size_Internalname = "FILEUPLOADFILES__SIZE_"+sGXsfl_58_idx ;
      edtavFileuploadfiles__file_Internalname = "FILEUPLOADFILES__FILE_"+sGXsfl_58_idx ;
      edtavDeletar_Internalname = "vDELETAR_"+sGXsfl_58_idx ;
   }

   public void subsflControlProps_fel_582( )
   {
      edtavFileuploadfiles__fullname_Internalname = "FILEUPLOADFILES__FULLNAME_"+sGXsfl_58_fel_idx ;
      edtavFileuploadfiles__name_Internalname = "FILEUPLOADFILES__NAME_"+sGXsfl_58_fel_idx ;
      edtavFileuploadfiles__extension_Internalname = "FILEUPLOADFILES__EXTENSION_"+sGXsfl_58_fel_idx ;
      edtavFileuploadfiles__size_Internalname = "FILEUPLOADFILES__SIZE_"+sGXsfl_58_fel_idx ;
      edtavFileuploadfiles__file_Internalname = "FILEUPLOADFILES__FILE_"+sGXsfl_58_fel_idx ;
      edtavDeletar_Internalname = "vDELETAR_"+sGXsfl_58_fel_idx ;
   }

   public void sendrow_582( )
   {
      subsflControlProps_582( ) ;
      wb2AI0( ) ;
      if ( ( subGridfileuploadfiless_Rows * 1 == 0 ) || ( nGXsfl_58_idx <= subgridfileuploadfiless_fnc_recordsperpage( ) * 1 ) )
      {
         GridfileuploadfilessRow = GXWebRow.GetNew(context,GridfileuploadfilessContainer) ;
         if ( subGridfileuploadfiless_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridfileuploadfiless_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridfileuploadfiless_Class, "") != 0 )
            {
               subGridfileuploadfiless_Linesclass = subGridfileuploadfiless_Class+"Odd" ;
            }
         }
         else if ( subGridfileuploadfiless_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridfileuploadfiless_Backstyle = (byte)(0) ;
            subGridfileuploadfiless_Backcolor = subGridfileuploadfiless_Allbackcolor ;
            if ( GXutil.strcmp(subGridfileuploadfiless_Class, "") != 0 )
            {
               subGridfileuploadfiless_Linesclass = subGridfileuploadfiless_Class+"Uniform" ;
            }
         }
         else if ( subGridfileuploadfiless_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridfileuploadfiless_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridfileuploadfiless_Class, "") != 0 )
            {
               subGridfileuploadfiless_Linesclass = subGridfileuploadfiless_Class+"Odd" ;
            }
            subGridfileuploadfiless_Backcolor = (int)(0x0) ;
         }
         else if ( subGridfileuploadfiless_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridfileuploadfiless_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_58_idx) % (2))) == 0 )
            {
               subGridfileuploadfiless_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridfileuploadfiless_Class, "") != 0 )
               {
                  subGridfileuploadfiless_Linesclass = subGridfileuploadfiless_Class+"Even" ;
               }
            }
            else
            {
               subGridfileuploadfiless_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridfileuploadfiless_Class, "") != 0 )
               {
                  subGridfileuploadfiless_Linesclass = subGridfileuploadfiless_Class+"Odd" ;
               }
            }
         }
         if ( GridfileuploadfilessContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_58_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridfileuploadfilessContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridfileuploadfilessRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploadfiles__fullname_Internalname,GXutil.rtrim( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_Fullname()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploadfiles__fullname_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFileuploadfiles__fullname_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridfileuploadfilessContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridfileuploadfilessRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploadfiles__name_Internalname,GXutil.rtrim( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_Name()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploadfiles__name_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFileuploadfiles__name_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridfileuploadfilessContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridfileuploadfilessRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploadfiles__extension_Internalname,GXutil.rtrim( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_Extension()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploadfiles__extension_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFileuploadfiles__extension_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridfileuploadfilessContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridfileuploadfilessRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploadfiles__size_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_Size(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFileuploadfiles__size_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_Size()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_Size()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploadfiles__size_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFileuploadfiles__size_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridfileuploadfilessContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         ClassString = "Attribute" ;
         StyleString = "" ;
         edtavFileuploadfiles__file_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__file_Internalname, "Filetype", edtavFileuploadfiles__file_Filetype, !bGXsfl_58_Refreshing);
         if ( ! (GXutil.strcmp("", ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_File())==0) )
         {
            gxblobfileaux.setSource( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_File() );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavFileuploadfiles__file_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavFileuploadfiles__file_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).setgxTv_SdtFileUploadFiles_File_File( gxblobfileaux.getURI() );
               edtavFileuploadfiles__file_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__file_Internalname, "Filetype", edtavFileuploadfiles__file_Filetype, !bGXsfl_58_Refreshing);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop("", false, edtavFileuploadfiles__file_Internalname, "URL", httpContext.getResourceRelative(((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_File()), !bGXsfl_58_Refreshing);
         }
         GridfileuploadfilessRow.AddColumnProperties("blob", 2, isAjaxCallMode( ), new Object[] {edtavFileuploadfiles__file_Internalname,GXutil.rtrim( ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_File()),httpContext.getResourceRelative(((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_File()),((GXutil.strcmp("", edtavFileuploadfiles__file_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavFileuploadfiles__file_Filetype)==0) ? ((app.SdtFileUploadFiles_File)AV32FileUploadFiles.elementAt(-1+AV84GXV1)).getgxTv_SdtFileUploadFiles_File_File() : edtavFileuploadfiles__file_Filetype)) : edtavFileuploadfiles__file_Contenttype),Boolean.valueOf(false),"",edtavFileuploadfiles__file_Parameters,Integer.valueOf(0),Integer.valueOf(edtavFileuploadfiles__file_Enabled),Integer.valueOf(0),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(60),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),edtavFileuploadfiles__file_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'",StyleString,ClassString,"WWColumn","",""+"","",""});
         /* Subfile cell */
         if ( GridfileuploadfilessContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDeletar_Enabled!=0)&&(edtavDeletar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'',false,'"+sGXsfl_58_idx+"',58)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridfileuploadfilessRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDeletar_Internalname,GXutil.rtrim( AV21Deletar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavDeletar_Enabled!=0)&&(edtavDeletar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,64);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVDELETAR.CLICK."+sGXsfl_58_idx+"'","","",httpContext.getMessage( "Clique aqui para apagar", ""),"",edtavDeletar_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDeletar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(58),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2AI2( ) ;
         GridfileuploadfilessContainer.AddRow(GridfileuploadfilessRow);
         nGXsfl_58_idx = ((subGridfileuploadfiless_Islastpage==1)&&(nGXsfl_58_idx+1>subgridfileuploadfiless_fnc_recordsperpage( )) ? 1 : nGXsfl_58_idx+1) ;
         sGXsfl_58_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_58_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_582( ) ;
      }
      /* End function sendrow_582 */
   }

   public void startgridcontrol58( )
   {
      if ( GridfileuploadfilessContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridfileuploadfilessContainer"+"DivS\" data-gxgridid=\"58\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridfileuploadfiless_Internalname, subGridfileuploadfiless_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridfileuploadfiless_Backcolorstyle == 0 )
         {
            subGridfileuploadfiless_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridfileuploadfiless_Class) > 0 )
            {
               subGridfileuploadfiless_Linesclass = subGridfileuploadfiless_Class+"Title" ;
            }
         }
         else
         {
            subGridfileuploadfiless_Titlebackstyle = (byte)(1) ;
            if ( subGridfileuploadfiless_Backcolorstyle == 1 )
            {
               subGridfileuploadfiless_Titlebackcolor = subGridfileuploadfiless_Allbackcolor ;
               if ( GXutil.len( subGridfileuploadfiless_Class) > 0 )
               {
                  subGridfileuploadfiless_Linesclass = subGridfileuploadfiless_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridfileuploadfiless_Class) > 0 )
               {
                  subGridfileuploadfiless_Linesclass = subGridfileuploadfiless_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "File extension", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tamanho", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Uploaded file", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridfileuploadfilessContainer.AddObjectProperty("GridName", "Gridfileuploadfiless");
      }
      else
      {
         GridfileuploadfilessContainer.AddObjectProperty("GridName", "Gridfileuploadfiless");
         GridfileuploadfilessContainer.AddObjectProperty("Header", subGridfileuploadfiless_Header);
         GridfileuploadfilessContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridfileuploadfilessContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddObjectProperty("CmpContext", "");
         GridfileuploadfilessContainer.AddObjectProperty("InMasterPage", "false");
         GridfileuploadfilessColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridfileuploadfilessColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploadfiles__fullname_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddColumnProperties(GridfileuploadfilessColumn);
         GridfileuploadfilessColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridfileuploadfilessColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploadfiles__name_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddColumnProperties(GridfileuploadfilessColumn);
         GridfileuploadfilessColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridfileuploadfilessColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploadfiles__extension_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddColumnProperties(GridfileuploadfilessColumn);
         GridfileuploadfilessColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridfileuploadfilessColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploadfiles__size_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddColumnProperties(GridfileuploadfilessColumn);
         GridfileuploadfilessColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridfileuploadfilessColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploadfiles__file_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddColumnProperties(GridfileuploadfilessColumn);
         GridfileuploadfilessColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridfileuploadfilessColumn.AddObjectProperty("Value", GXutil.rtrim( AV21Deletar));
         GridfileuploadfilessColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDeletar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddColumnProperties(GridfileuploadfilessColumn);
         GridfileuploadfilessContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridfileuploadfilessContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridfileuploadfiless_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavParaemail_Internalname = "vPARAEMAIL" ;
      edtavParanombre_Internalname = "vPARANOMBRE" ;
      edtavCopiaemail_Internalname = "vCOPIAEMAIL" ;
      edtavCopianombre_Internalname = "vCOPIANOMBRE" ;
      edtavAsunto_Internalname = "vASUNTO" ;
      lblTextblock1_Internalname = "TEXTBLOCK1" ;
      Texto_Internalname = "TEXTO" ;
      divTabletexto_Internalname = "TABLETEXTO" ;
      Upload_Internalname = "UPLOAD" ;
      divTableupload_Internalname = "TABLEUPLOAD" ;
      edtavFileuploadfiles__fullname_Internalname = "FILEUPLOADFILES__FULLNAME" ;
      edtavFileuploadfiles__name_Internalname = "FILEUPLOADFILES__NAME" ;
      edtavFileuploadfiles__extension_Internalname = "FILEUPLOADFILES__EXTENSION" ;
      edtavFileuploadfiles__size_Internalname = "FILEUPLOADFILES__SIZE" ;
      edtavFileuploadfiles__file_Internalname = "FILEUPLOADFILES__FILE" ;
      edtavDeletar_Internalname = "vDELETAR" ;
      divTableadjuntos_Internalname = "TABLEADJUNTOS" ;
      divTabledatoscorreo_Internalname = "TABLEDATOSCORREO" ;
      bttBtnenviarcorreo_Internalname = "BTNENVIARCORREO" ;
      bttBtncancelar_Internalname = "BTNCANCELAR" ;
      divTableaction_Internalname = "TABLEACTION" ;
      divDadosenvio_Internalname = "DADOSENVIO" ;
      Dvpanel_dadosenvio_Internalname = "DVPANEL_DADOSENVIO" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Gridfileuploadfiless_empowerer_Internalname = "GRIDFILEUPLOADFILESS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridfileuploadfiless_Internalname = "GRIDFILEUPLOADFILESS" ;
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
      subGridfileuploadfiless_Allowcollapsing = (byte)(0) ;
      subGridfileuploadfiless_Allowselection = (byte)(0) ;
      subGridfileuploadfiless_Header = "" ;
      edtavDeletar_Jsonclick = "" ;
      edtavDeletar_Visible = -1 ;
      edtavDeletar_Enabled = 1 ;
      edtavFileuploadfiles__file_Jsonclick = "" ;
      edtavFileuploadfiles__file_Parameters = "" ;
      edtavFileuploadfiles__file_Contenttype = "" ;
      edtavFileuploadfiles__file_Filetype = "" ;
      edtavFileuploadfiles__file_Enabled = 0 ;
      edtavFileuploadfiles__size_Jsonclick = "" ;
      edtavFileuploadfiles__size_Enabled = 0 ;
      edtavFileuploadfiles__extension_Jsonclick = "" ;
      edtavFileuploadfiles__extension_Enabled = 0 ;
      edtavFileuploadfiles__name_Jsonclick = "" ;
      edtavFileuploadfiles__name_Enabled = 0 ;
      edtavFileuploadfiles__fullname_Jsonclick = "" ;
      edtavFileuploadfiles__fullname_Enabled = 0 ;
      subGridfileuploadfiless_Class = "GridNoBorder WorkWith" ;
      subGridfileuploadfiless_Backcolorstyle = (byte)(0) ;
      edtavFileuploadfiles__file_Enabled = -1 ;
      edtavFileuploadfiles__size_Enabled = -1 ;
      edtavFileuploadfiles__extension_Enabled = -1 ;
      edtavFileuploadfiles__name_Enabled = -1 ;
      edtavFileuploadfiles__fullname_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Upload_Tooltiptext = "" ;
      divTableadjuntos_Height = 0 ;
      Texto_Enabled = GXutil.toBoolean( 1) ;
      edtavAsunto_Jsonclick = "" ;
      edtavAsunto_Enabled = 1 ;
      edtavCopianombre_Jsonclick = "" ;
      edtavCopianombre_Enabled = 1 ;
      edtavCopiaemail_Jsonclick = "" ;
      edtavCopiaemail_Enabled = 1 ;
      edtavParanombre_Jsonclick = "" ;
      edtavParanombre_Enabled = 1 ;
      edtavParaemail_Enabled = 1 ;
      Dvpanel_dadosenvio_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_dadosenvio_Iconposition = "Right" ;
      Dvpanel_dadosenvio_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_dadosenvio_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_dadosenvio_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_dadosenvio_Title = httpContext.getMessage( "Datos Correo", "") ;
      Dvpanel_dadosenvio_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_dadosenvio_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_dadosenvio_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_dadosenvio_Width = "100%" ;
      Upload_Acceptedfiletypes = "any" ;
      Upload_Autodisableaddingfiles = GXutil.toBoolean( 0) ;
      Upload_Maxnumberoffiles = 1 ;
      Upload_Hideadditionalbuttons = GXutil.toBoolean( -1) ;
      Upload_Autoupload = GXutil.toBoolean( -1) ;
      Texto_Captionposition = "None" ;
      Texto_Captionstyle = "" ;
      Texto_Captionclass = "col-sm-3 AttributeLabel" ;
      Texto_Color = (int)(0xD3D3D3) ;
      Texto_Toolbarcancollapse = GXutil.toBoolean( -1) ;
      Texto_Toolbar = "None" ;
      Texto_Skin = "silver" ;
      Texto_Height = "350" ;
      Texto_Width = "auto" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Envio de Correo (Archivos Adjuntos)", "") );
      subGridfileuploadfiless_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDFILEUPLOADFILESS_nFirstRecordOnPage'},{av:'GRIDFILEUPLOADFILESS_nEOF'},{av:'AV32FileUploadFiles',fld:'vFILEUPLOADFILES',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRIDFILEUPLOADFILESS',prop:'GridRC',grid:58},{av:'subGridfileuploadfiless_Rows',ctrl:'GRIDFILEUPLOADFILESS',prop:'Rows'},{av:'AV20CorreosDestino',fld:'vCORREOSDESTINO',pic:'',hsh:true},{av:'AV80Tipo_documento',fld:'vTIPO_DOCUMENTO',pic:'',hsh:true},{av:'AV81Numero_documento',fld:'vNUMERO_DOCUMENTO',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV53parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'AV62TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV52parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV50parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV51parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV49parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV46NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true},{av:'AV42MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRIDFILEUPLOADFILESS.LOAD","{handler:'e152AI2',iparms:[]");
      setEventMetadata("GRIDFILEUPLOADFILESS.LOAD",",oparms:[{av:'AV21Deletar',fld:'vDELETAR',pic:''}]}");
      setEventMetadata("'DOENVIARCORREO'","{handler:'e132AI2',iparms:[{av:'AV8Asunto',fld:'vASUNTO',pic:''},{av:'AV67Emails',fld:'vEMAILS',pic:''},{av:'AV59Texto',fld:'vTEXTO',pic:''},{av:'AV48ParaEmail',fld:'vPARAEMAIL',pic:''},{av:'AV20CorreosDestino',fld:'vCORREOSDESTINO',pic:'',hsh:true},{av:'AV15CopiaEmail',fld:'vCOPIAEMAIL',pic:''},{av:'AV54ParaNombre',fld:'vPARANOMBRE',pic:''},{av:'AV16CopiaNombre',fld:'vCOPIANOMBRE',pic:''},{av:'AV32FileUploadFiles',fld:'vFILEUPLOADFILES',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRIDFILEUPLOADFILESS_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRIDFILEUPLOADFILESS',prop:'GridRC',grid:58},{av:'AV80Tipo_documento',fld:'vTIPO_DOCUMENTO',pic:'',hsh:true},{av:'AV81Numero_documento',fld:'vNUMERO_DOCUMENTO',pic:'ZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("'DOENVIARCORREO'",",oparms:[{av:'AV67Emails',fld:'vEMAILS',pic:''}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e112AI1',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("UPLOAD.UPLOADCOMPLETE","{handler:'e122AI2',iparms:[{av:'AV63UploadedFiles',fld:'vUPLOADEDFILES',pic:''},{av:'AV32FileUploadFiles',fld:'vFILEUPLOADFILES',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRIDFILEUPLOADFILESS_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRIDFILEUPLOADFILESS',prop:'GridRC',grid:58},{av:'AV53parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'GRIDFILEUPLOADFILESS_nEOF'},{av:'subGridfileuploadfiless_Rows',ctrl:'GRIDFILEUPLOADFILESS',prop:'Rows'},{av:'AV20CorreosDestino',fld:'vCORREOSDESTINO',pic:'',hsh:true},{av:'AV80Tipo_documento',fld:'vTIPO_DOCUMENTO',pic:'',hsh:true},{av:'AV81Numero_documento',fld:'vNUMERO_DOCUMENTO',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV62TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV52parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV50parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV51parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV49parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV46NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true},{av:'AV42MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true}]");
      setEventMetadata("UPLOAD.UPLOADCOMPLETE",",oparms:[{av:'AV32FileUploadFiles',fld:'vFILEUPLOADFILES',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRIDFILEUPLOADFILESS_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRIDFILEUPLOADFILESS',prop:'GridRC',grid:58},{av:'AV43NombreArchivo',fld:'vNOMBREARCHIVO',pic:''},{av:'AV63UploadedFiles',fld:'vUPLOADEDFILES',pic:''},{av:'AV59Texto',fld:'vTEXTO',pic:''}]}");
      setEventMetadata("VDELETAR.CLICK","{handler:'e162AI2',iparms:[{av:'AV32FileUploadFiles',fld:'vFILEUPLOADFILES',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRIDFILEUPLOADFILESS_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRIDFILEUPLOADFILESS',prop:'GridRC',grid:58},{av:'AV53parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'GRIDFILEUPLOADFILESS_nEOF'},{av:'subGridfileuploadfiless_Rows',ctrl:'GRIDFILEUPLOADFILESS',prop:'Rows'},{av:'AV20CorreosDestino',fld:'vCORREOSDESTINO',pic:'',hsh:true},{av:'AV80Tipo_documento',fld:'vTIPO_DOCUMENTO',pic:'',hsh:true},{av:'AV81Numero_documento',fld:'vNUMERO_DOCUMENTO',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV62TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV52parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV50parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV51parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV49parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV46NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true},{av:'AV42MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true}]");
      setEventMetadata("VDELETAR.CLICK",",oparms:[{av:'AV32FileUploadFiles',fld:'vFILEUPLOADFILES',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'GRIDFILEUPLOADFILESS_nFirstRecordOnPage'},{av:'nRC_GXsfl_58',ctrl:'GRIDFILEUPLOADFILESS',prop:'GridRC',grid:58},{av:'AV59Texto',fld:'vTEXTO',pic:''}]}");
      setEventMetadata("GRIDFILEUPLOADFILESS_FIRSTPAGE","{handler:'subgridfileuploadfiless_firstpage',iparms:[{av:'GRIDFILEUPLOADFILESS_nFirstRecordOnPage'},{av:'GRIDFILEUPLOADFILESS_nEOF'},{av:'subGridfileuploadfiless_Rows',ctrl:'GRIDFILEUPLOADFILESS',prop:'Rows'},{av:'AV20CorreosDestino',fld:'vCORREOSDESTINO',pic:'',hsh:true},{av:'AV80Tipo_documento',fld:'vTIPO_DOCUMENTO',pic:'',hsh:true},{av:'AV81Numero_documento',fld:'vNUMERO_DOCUMENTO',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV53parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'AV62TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV52parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV50parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV51parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV49parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV46NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true},{av:'AV42MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV32FileUploadFiles',fld:'vFILEUPLOADFILES',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRIDFILEUPLOADFILESS',prop:'GridRC',grid:58}]");
      setEventMetadata("GRIDFILEUPLOADFILESS_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRIDFILEUPLOADFILESS_PREVPAGE","{handler:'subgridfileuploadfiless_previouspage',iparms:[{av:'GRIDFILEUPLOADFILESS_nFirstRecordOnPage'},{av:'GRIDFILEUPLOADFILESS_nEOF'},{av:'subGridfileuploadfiless_Rows',ctrl:'GRIDFILEUPLOADFILESS',prop:'Rows'},{av:'AV20CorreosDestino',fld:'vCORREOSDESTINO',pic:'',hsh:true},{av:'AV80Tipo_documento',fld:'vTIPO_DOCUMENTO',pic:'',hsh:true},{av:'AV81Numero_documento',fld:'vNUMERO_DOCUMENTO',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV53parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'AV62TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV52parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV50parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV51parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV49parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV46NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true},{av:'AV42MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV32FileUploadFiles',fld:'vFILEUPLOADFILES',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRIDFILEUPLOADFILESS',prop:'GridRC',grid:58}]");
      setEventMetadata("GRIDFILEUPLOADFILESS_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRIDFILEUPLOADFILESS_NEXTPAGE","{handler:'subgridfileuploadfiless_nextpage',iparms:[{av:'GRIDFILEUPLOADFILESS_nFirstRecordOnPage'},{av:'GRIDFILEUPLOADFILESS_nEOF'},{av:'subGridfileuploadfiless_Rows',ctrl:'GRIDFILEUPLOADFILESS',prop:'Rows'},{av:'AV20CorreosDestino',fld:'vCORREOSDESTINO',pic:'',hsh:true},{av:'AV80Tipo_documento',fld:'vTIPO_DOCUMENTO',pic:'',hsh:true},{av:'AV81Numero_documento',fld:'vNUMERO_DOCUMENTO',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV53parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'AV62TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV52parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV50parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV51parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV49parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV46NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true},{av:'AV42MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV32FileUploadFiles',fld:'vFILEUPLOADFILES',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRIDFILEUPLOADFILESS',prop:'GridRC',grid:58}]");
      setEventMetadata("GRIDFILEUPLOADFILESS_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRIDFILEUPLOADFILESS_LASTPAGE","{handler:'subgridfileuploadfiless_lastpage',iparms:[{av:'GRIDFILEUPLOADFILESS_nFirstRecordOnPage'},{av:'GRIDFILEUPLOADFILESS_nEOF'},{av:'subGridfileuploadfiless_Rows',ctrl:'GRIDFILEUPLOADFILESS',prop:'Rows'},{av:'AV20CorreosDestino',fld:'vCORREOSDESTINO',pic:'',hsh:true},{av:'AV80Tipo_documento',fld:'vTIPO_DOCUMENTO',pic:'',hsh:true},{av:'AV81Numero_documento',fld:'vNUMERO_DOCUMENTO',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV53parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'AV62TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV52parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV50parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV51parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV49parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV46NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true},{av:'AV42MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV32FileUploadFiles',fld:'vFILEUPLOADFILES',grid:58,pic:''},{av:'nGXsfl_58_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:58},{av:'nRC_GXsfl_58',ctrl:'GRIDFILEUPLOADFILESS',prop:'GridRC',grid:58}]");
      setEventMetadata("GRIDFILEUPLOADFILESS_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Deletar',iparms:[]");
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
      wcpOAV62TextoSeparador = "" ;
      wcpOAV52parametroCorreosDestinoJson = "" ;
      wcpOAV50parametroCorreosCopiaJson = "" ;
      wcpOAV51parametroCorreosCopiaOcultaJson = "" ;
      wcpOAV49parametroAsunto = "" ;
      wcpOAV53parametroTextoCorreo = "" ;
      wcpOAV46NombresAdjuntosJson = "" ;
      wcpOAV80Tipo_documento = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV62TextoSeparador = "" ;
      AV52parametroCorreosDestinoJson = "" ;
      AV50parametroCorreosCopiaJson = "" ;
      AV51parametroCorreosCopiaOcultaJson = "" ;
      AV49parametroAsunto = "" ;
      AV53parametroTextoCorreo = "" ;
      AV46NombresAdjuntosJson = "" ;
      AV80Tipo_documento = "" ;
      AV20CorreosDestino = new GXSimpleCollection<com.genexus.internet.MailRecipient>();
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV32FileUploadFiles = new GXBaseCollection<app.SdtFileUploadFiles_File>(app.SdtFileUploadFiles_File.class, "File", "TexplusNET", remoteHandle);
      AV59Texto = "" ;
      AV63UploadedFiles = new GXBaseCollection<app.SdtFileUploadData>(app.SdtFileUploadData.class, "FileUploadData", "TexplusNET", remoteHandle);
      AV28FailedFiles = new GXBaseCollection<app.SdtFileUploadData>(app.SdtFileUploadData.class, "FileUploadData", "TexplusNET", remoteHandle);
      AV67Emails = new app.SdtEmails(remoteHandle, context);
      Gridfileuploadfiless_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_dadosenvio = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV48ParaEmail = "" ;
      AV54ParaNombre = "" ;
      AV15CopiaEmail = "" ;
      AV16CopiaNombre = "" ;
      AV8Asunto = "" ;
      lblTextblock1_Jsonclick = "" ;
      ucTexto = new com.genexus.webpanels.GXUserControl();
      ucUpload = new com.genexus.webpanels.GXUserControl();
      GridfileuploadfilessContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      bttBtnenviarcorreo_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      AV90Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGridfileuploadfiless_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV21Deletar = "" ;
      AV55PathTomcat = "" ;
      AV6AppTool = new app.SdtAppTool(remoteHandle, context);
      AV70AppName = "" ;
      AV36HTTPRequest = httpContext.getHttpRequest();
      AV58Station = "" ;
      GXt_char1 = "" ;
      AV25EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV26EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV65UsurCod = "" ;
      GridfileuploadfilessRow = new com.genexus.webpanels.GXWebRow();
      AV91GXV7 = new GXSimpleCollection<String>(String.class, "internal", "");
      AV79sParaEmail = "" ;
      AV78Emails_TO = new app.SdtEmails_TOItem(remoteHandle, context);
      AV93GXV9 = new GXSimpleCollection<String>(String.class, "internal", "");
      AV71sCopiaEmail = "" ;
      AV68Emails_CC = new app.SdtEmails_CCitem(remoteHandle, context);
      AV22DescripcionErrorEnvio = "" ;
      AV33FileUploadFiles_File = new app.SdtFileUploadFiles_File(remoteHandle, context);
      AV43NombreArchivo = "" ;
      AV38ListaAnexo = "" ;
      GXt_SdtEmails6 = new app.SdtEmails(remoteHandle, context);
      GXv_SdtEmails7 = new app.SdtEmails[1] ;
      AV41ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV12CadenaRegistrar = "" ;
      AV5Cantidad = DecimalUtil.ZERO ;
      AV39ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV40ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV69Emails_CCO = new app.SdtEmails_CCOItem(remoteHandle, context);
      AV60TextoCorreo = "" ;
      AV45NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      AV57RutaAdjunto = "" ;
      AV10Blob = "" ;
      AV29File = new com.genexus.util.GXFile();
      AV11BlobFile = "" ;
      AV100Blobfile_GXI = "" ;
      AV27Extension = "" ;
      GXv_int5 = new long[1] ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridfileuploadfiless_Linesclass = "" ;
      ROClassString = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      GridfileuploadfilessColumn = new com.genexus.webpanels.GXWebColumn();
      AV90Pgmname = "SendMailAttached2" ;
      /* GeneXus formulas. */
      AV90Pgmname = "SendMailAttached2" ;
      Gx_err = (short)(0) ;
      edtavFileuploadfiles__fullname_Enabled = 0 ;
      edtavFileuploadfiles__name_Enabled = 0 ;
      edtavFileuploadfiles__extension_Enabled = 0 ;
      edtavFileuploadfiles__size_Enabled = 0 ;
      edtavFileuploadfiles__file_Enabled = 0 ;
      edtavDeletar_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRIDFILEUPLOADFILESS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGridfileuploadfiless_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGridfileuploadfiless_Backstyle ;
   private byte subGridfileuploadfiless_Titlebackstyle ;
   private byte subGridfileuploadfiless_Allowselection ;
   private byte subGridfileuploadfiless_Allowhovering ;
   private byte subGridfileuploadfiless_Allowcollapsing ;
   private byte subGridfileuploadfiless_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV37indexOf ;
   private short AV56PosicionSeparador ;
   private short AV13CantidadArchivos ;
   private int nRC_GXsfl_58 ;
   private int subGridfileuploadfiless_Rows ;
   private int nGXsfl_58_idx=1 ;
   private int Texto_Color ;
   private int Upload_Maxnumberoffiles ;
   private int edtavParaemail_Enabled ;
   private int edtavParanombre_Enabled ;
   private int edtavCopiaemail_Enabled ;
   private int edtavCopianombre_Enabled ;
   private int edtavAsunto_Enabled ;
   private int divTableadjuntos_Height ;
   private int AV84GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGridfileuploadfiless_Islastpage ;
   private int edtavFileuploadfiles__fullname_Enabled ;
   private int edtavFileuploadfiles__name_Enabled ;
   private int edtavFileuploadfiles__extension_Enabled ;
   private int edtavFileuploadfiles__size_Enabled ;
   private int edtavFileuploadfiles__file_Enabled ;
   private int edtavDeletar_Enabled ;
   private int GRIDFILEUPLOADFILESS_nGridOutOfScope ;
   private int nGXsfl_58_fel_idx=1 ;
   private int AV92GXV8 ;
   private int AV94GXV10 ;
   private int nGXsfl_58_bak_idx=1 ;
   private int AV95GXV11 ;
   private int AV96GXV12 ;
   private int AV97GXV13 ;
   private int AV98GXV14 ;
   private int AV99GXV15 ;
   private int idxLst ;
   private int subGridfileuploadfiless_Backcolor ;
   private int subGridfileuploadfiless_Allbackcolor ;
   private int edtavDeletar_Visible ;
   private int subGridfileuploadfiless_Titlebackcolor ;
   private int subGridfileuploadfiless_Selectedindex ;
   private int subGridfileuploadfiless_Selectioncolor ;
   private int subGridfileuploadfiless_Hoveringcolor ;
   private long wcpOAV81Numero_documento ;
   private long GRIDFILEUPLOADFILESS_nFirstRecordOnPage ;
   private long AV81Numero_documento ;
   private long GRIDFILEUPLOADFILESS_nCurrentRecord ;
   private long GRIDFILEUPLOADFILESS_nRecordCount ;
   private long AV14CodigoErrorEnvio ;
   private long GXv_int5[] ;
   private java.math.BigDecimal AV5Cantidad ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_58_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Texto_Width ;
   private String Texto_Height ;
   private String Texto_Skin ;
   private String Texto_Toolbar ;
   private String Texto_Captionclass ;
   private String Texto_Captionstyle ;
   private String Texto_Captionposition ;
   private String Upload_Acceptedfiletypes ;
   private String Dvpanel_dadosenvio_Width ;
   private String Dvpanel_dadosenvio_Cls ;
   private String Dvpanel_dadosenvio_Title ;
   private String Dvpanel_dadosenvio_Iconposition ;
   private String Gridfileuploadfiless_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_dadosenvio_Internalname ;
   private String divDadosenvio_Internalname ;
   private String divTabledatoscorreo_Internalname ;
   private String edtavParaemail_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String edtavParanombre_Internalname ;
   private String edtavParanombre_Jsonclick ;
   private String edtavCopiaemail_Internalname ;
   private String edtavCopiaemail_Jsonclick ;
   private String edtavCopianombre_Internalname ;
   private String edtavCopianombre_Jsonclick ;
   private String edtavAsunto_Internalname ;
   private String edtavAsunto_Jsonclick ;
   private String divTabletexto_Internalname ;
   private String lblTextblock1_Internalname ;
   private String lblTextblock1_Jsonclick ;
   private String Texto_Internalname ;
   private String divTableadjuntos_Internalname ;
   private String divTableupload_Internalname ;
   private String Upload_Tooltiptext ;
   private String Upload_Internalname ;
   private String sStyleString ;
   private String subGridfileuploadfiless_Internalname ;
   private String divTableaction_Internalname ;
   private String bttBtnenviarcorreo_Internalname ;
   private String bttBtnenviarcorreo_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String AV90Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridfileuploadfiless_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV21Deletar ;
   private String edtavDeletar_Internalname ;
   private String edtavFileuploadfiles__fullname_Internalname ;
   private String edtavFileuploadfiles__name_Internalname ;
   private String edtavFileuploadfiles__extension_Internalname ;
   private String edtavFileuploadfiles__size_Internalname ;
   private String edtavFileuploadfiles__file_Internalname ;
   private String sGXsfl_58_fel_idx="0001" ;
   private String AV58Station ;
   private String GXt_char1 ;
   private String AV25EmprCod ;
   private String GXv_char2[] ;
   private String AV26EmprNom ;
   private String GXv_char3[] ;
   private String AV65UsurCod ;
   private String GXv_char4[] ;
   private String subGridfileuploadfiless_Class ;
   private String subGridfileuploadfiless_Linesclass ;
   private String ROClassString ;
   private String edtavFileuploadfiles__fullname_Jsonclick ;
   private String edtavFileuploadfiles__name_Jsonclick ;
   private String edtavFileuploadfiles__extension_Jsonclick ;
   private String edtavFileuploadfiles__size_Jsonclick ;
   private String edtavFileuploadfiles__file_Filetype ;
   private String edtavFileuploadfiles__file_Contenttype ;
   private String edtavFileuploadfiles__file_Parameters ;
   private String edtavFileuploadfiles__file_Jsonclick ;
   private String edtavDeletar_Jsonclick ;
   private String subGridfileuploadfiless_Header ;
   private boolean wcpOAV42MostrarMail ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV42MostrarMail ;
   private boolean Texto_Enabled ;
   private boolean Texto_Toolbarcancollapse ;
   private boolean Upload_Autoupload ;
   private boolean Upload_Hideadditionalbuttons ;
   private boolean Upload_Autodisableaddingfiles ;
   private boolean Dvpanel_dadosenvio_Autowidth ;
   private boolean Dvpanel_dadosenvio_Autoheight ;
   private boolean Dvpanel_dadosenvio_Collapsible ;
   private boolean Dvpanel_dadosenvio_Collapsed ;
   private boolean Dvpanel_dadosenvio_Showcollapseicon ;
   private boolean Dvpanel_dadosenvio_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_58_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV58 ;
   private String wcpOAV53parametroTextoCorreo ;
   private String AV53parametroTextoCorreo ;
   private String AV59Texto ;
   private String AV10Blob ;
   private String wcpOAV62TextoSeparador ;
   private String wcpOAV52parametroCorreosDestinoJson ;
   private String wcpOAV50parametroCorreosCopiaJson ;
   private String wcpOAV51parametroCorreosCopiaOcultaJson ;
   private String wcpOAV49parametroAsunto ;
   private String wcpOAV46NombresAdjuntosJson ;
   private String wcpOAV80Tipo_documento ;
   private String AV62TextoSeparador ;
   private String AV52parametroCorreosDestinoJson ;
   private String AV50parametroCorreosCopiaJson ;
   private String AV51parametroCorreosCopiaOcultaJson ;
   private String AV49parametroAsunto ;
   private String AV46NombresAdjuntosJson ;
   private String AV80Tipo_documento ;
   private String AV48ParaEmail ;
   private String AV54ParaNombre ;
   private String AV15CopiaEmail ;
   private String AV16CopiaNombre ;
   private String AV8Asunto ;
   private String AV55PathTomcat ;
   private String AV70AppName ;
   private String AV79sParaEmail ;
   private String AV71sCopiaEmail ;
   private String AV22DescripcionErrorEnvio ;
   private String AV43NombreArchivo ;
   private String AV38ListaAnexo ;
   private String AV12CadenaRegistrar ;
   private String AV60TextoCorreo ;
   private String AV57RutaAdjunto ;
   private String AV100Blobfile_GXI ;
   private String AV27Extension ;
   private String AV11BlobFile ;
   private com.genexus.webpanels.GXWebGrid GridfileuploadfilessContainer ;
   private com.genexus.webpanels.GXWebRow GridfileuploadfilessRow ;
   private com.genexus.webpanels.GXWebColumn GridfileuploadfilessColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV36HTTPRequest ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_dadosenvio ;
   private com.genexus.webpanels.GXUserControl ucTexto ;
   private com.genexus.webpanels.GXUserControl ucUpload ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGridfileuploadfiless_empowerer ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private app.SdtAppTool AV6AppTool ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.util.GXFile AV29File ;
   private GXSimpleCollection<String> AV91GXV7 ;
   private GXSimpleCollection<String> AV93GXV9 ;
   private GXSimpleCollection<String> AV41ListaCorreosDestino ;
   private GXSimpleCollection<String> AV39ListaCorreosCopia ;
   private GXSimpleCollection<String> AV40ListaCorreosCopiaOculta ;
   private GXSimpleCollection<String> AV45NombresAdjuntos ;
   private GXBaseCollection<app.SdtFileUploadData> AV63UploadedFiles ;
   private GXBaseCollection<app.SdtFileUploadData> AV28FailedFiles ;
   private GXBaseCollection<app.SdtFileUploadFiles_File> AV32FileUploadFiles ;
   private GXSimpleCollection<com.genexus.internet.MailRecipient> AV20CorreosDestino ;
   private app.SdtEmails AV67Emails ;
   private app.SdtEmails GXt_SdtEmails6 ;
   private app.SdtEmails GXv_SdtEmails7[] ;
   private app.SdtEmails_TOItem AV78Emails_TO ;
   private app.SdtEmails_CCitem AV68Emails_CC ;
   private app.SdtEmails_CCOItem AV69Emails_CCO ;
   private app.SdtFileUploadFiles_File AV33FileUploadFiles_File ;
}

