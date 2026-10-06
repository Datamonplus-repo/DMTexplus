package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class enviarcorreoarchivosadjuntos_impl extends GXDataArea
{
   public enviarcorreoarchivosadjuntos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public enviarcorreoarchivosadjuntos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( enviarcorreoarchivosadjuntos_impl.class ));
   }

   public enviarcorreoarchivosadjuntos_impl( int remoteHandle ,
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Grid1") == 0 )
         {
            gxnrgrid1_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Grid1") == 0 )
         {
            gxgrgrid1_refresh_invoke( ) ;
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
            AV27TextoSeparador = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TextoSeparador", AV27TextoSeparador);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOSEPARADOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27TextoSeparador, ""))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV23parametroCorreosDestinoJson = httpContext.GetPar( "parametroCorreosDestinoJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23parametroCorreosDestinoJson", AV23parametroCorreosDestinoJson);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSDESTINOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23parametroCorreosDestinoJson, ""))));
               AV20parametroCorreosCopiaJson = httpContext.GetPar( "parametroCorreosCopiaJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20parametroCorreosCopiaJson", AV20parametroCorreosCopiaJson);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20parametroCorreosCopiaJson, ""))));
               AV21parametroCorreosCopiaOcultaJson = httpContext.GetPar( "parametroCorreosCopiaOcultaJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21parametroCorreosCopiaOcultaJson", AV21parametroCorreosCopiaOcultaJson);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAOCULTAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21parametroCorreosCopiaOcultaJson, ""))));
               AV19parametroAsunto = httpContext.GetPar( "parametroAsunto") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19parametroAsunto", AV19parametroAsunto);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROASUNTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19parametroAsunto, ""))));
               AV24parametroTextoCorreo = httpContext.GetPar( "parametroTextoCorreo") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV24parametroTextoCorreo", AV24parametroTextoCorreo);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROTEXTOCORREO", getSecureSignedToken( "", AV24parametroTextoCorreo));
               AV18NombresAdjuntosJson = httpContext.GetPar( "NombresAdjuntosJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18NombresAdjuntosJson", AV18NombresAdjuntosJson);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOMBRESADJUNTOSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18NombresAdjuntosJson, ""))));
               AV14MostrarMail = GXutil.strtobool( httpContext.GetPar( "MostrarMail")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14MostrarMail", AV14MostrarMail);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV14MostrarMail));
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

   public void gxnrgrid1_newrow_invoke( )
   {
      nRC_GXsfl_72 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_72"))) ;
      nGXsfl_72_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_72_idx"))) ;
      sGXsfl_72_idx = httpContext.GetPar( "sGXsfl_72_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgrid1_newrow( ) ;
      /* End function gxnrGrid1_newrow_invoke */
   }

   public void gxgrgrid1_refresh_invoke( )
   {
      subGrid1_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGrid1_Rows"))) ;
      AV23parametroCorreosDestinoJson = httpContext.GetPar( "parametroCorreosDestinoJson") ;
      AV27TextoSeparador = httpContext.GetPar( "TextoSeparador") ;
      AV14MostrarMail = GXutil.strtobool( httpContext.GetPar( "MostrarMail")) ;
      AV20parametroCorreosCopiaJson = httpContext.GetPar( "parametroCorreosCopiaJson") ;
      AV21parametroCorreosCopiaOcultaJson = httpContext.GetPar( "parametroCorreosCopiaOcultaJson") ;
      AV19parametroAsunto = httpContext.GetPar( "parametroAsunto") ;
      AV24parametroTextoCorreo = httpContext.GetPar( "parametroTextoCorreo") ;
      AV18NombresAdjuntosJson = httpContext.GetPar( "NombresAdjuntosJson") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, AV23parametroCorreosDestinoJson, AV27TextoSeparador, AV14MostrarMail, AV20parametroCorreosCopiaJson, AV21parametroCorreosCopiaOcultaJson, AV19parametroAsunto, AV24parametroTextoCorreo, AV18NombresAdjuntosJson) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
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
      paZW2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startZW2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.enviarcorreoarchivosadjuntos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV23parametroCorreosDestinoJson)),GXutil.URLEncode(GXutil.rtrim(AV20parametroCorreosCopiaJson)),GXutil.URLEncode(GXutil.rtrim(AV21parametroCorreosCopiaOcultaJson)),GXutil.URLEncode(GXutil.rtrim(AV19parametroAsunto)),GXutil.URLEncode(GXutil.rtrim(AV24parametroTextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV18NombresAdjuntosJson)),GXutil.URLEncode(GXutil.booltostr(AV14MostrarMail))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSDESTINOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23parametroCorreosDestinoJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOSEPARADOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27TextoSeparador, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV14MostrarMail));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20parametroCorreosCopiaJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAOCULTAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21parametroCorreosCopiaOcultaJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROASUNTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19parametroAsunto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROTEXTOCORREO", getSecureSignedToken( "", AV24parametroTextoCorreo));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOMBRESADJUNTOSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18NombresAdjuntosJson, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Fileuploaddata", AV44FileUploadData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Fileuploaddata", AV44FileUploadData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_72", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_72, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOCORREOMOSTRAR", AV37TextoCorreoMostrar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vUPLOADEDFILES", AV46UploadedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vUPLOADEDFILES", AV46UploadedFiles);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFAILEDFILES", AV43FailedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFAILEDFILES", AV43FailedFiles);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSDESTINOJSON", AV23parametroCorreosDestinoJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSDESTINOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23parametroCorreosDestinoJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOSEPARADOR", AV27TextoSeparador);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOSEPARADOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27TextoSeparador, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMOSTRARMAIL", AV14MostrarMail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV14MostrarMail));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCORREOSDESTINO", AV10CorreosDestino);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCORREOSDESTINO", AV10CorreosDestino);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSCOPIAJSON", AV20parametroCorreosCopiaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20parametroCorreosCopiaJson, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCORREOSCOPIA", AV8CorreosCopia);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCORREOSCOPIA", AV8CorreosCopia);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSCOPIAOCULTAJSON", AV21parametroCorreosCopiaOcultaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAOCULTAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21parametroCorreosCopiaOcultaJson, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCORREOSCOPIAOCULTA", AV9CorreosCopiaOculta);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCORREOSCOPIAOCULTA", AV9CorreosCopiaOculta);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROASUNTO", AV19parametroAsunto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROASUNTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19parametroAsunto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROTEXTOCORREO", AV24parametroTextoCorreo);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROTEXTOCORREO", getSecureSignedToken( "", AV24parametroTextoCorreo));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOMBRESADJUNTOSJSON", AV18NombresAdjuntosJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOMBRESADJUNTOSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18NombresAdjuntosJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCANTIDADARCHIVOS", GXutil.ltrim( localUtil.ntoc( AV6CantidadArchivos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vNOMBRESADJUNTOS", AV17NombresAdjuntos);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vNOMBRESADJUNTOS", AV17NombresAdjuntos);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vARCHIVO_GXI", AV59Archivo_GXI);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTOCORREOMOSTRAR_Enabled", GXutil.booltostr( Textocorreomostrar_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTOCORREOMOSTRAR_Captionclass", GXutil.rtrim( Textocorreomostrar_Captionclass));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTOCORREOMOSTRAR_Captionstyle", GXutil.rtrim( Textocorreomostrar_Captionstyle));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTOCORREOMOSTRAR_Captionposition", GXutil.rtrim( Textocorreomostrar_Captionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Autoupload", GXutil.booltostr( Upload_Autoupload));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Hideadditionalbuttons", GXutil.booltostr( Upload_Hideadditionalbuttons));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Tooltiptext", GXutil.rtrim( Upload_Tooltiptext));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Maxnumberoffiles", GXutil.ltrim( localUtil.ntoc( Upload_Maxnumberoffiles, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Autodisableaddingfiles", GXutil.booltostr( Upload_Autodisableaddingfiles));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Width", GXutil.rtrim( Dvpanel_tablecontent_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Autowidth", GXutil.booltostr( Dvpanel_tablecontent_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Autoheight", GXutil.booltostr( Dvpanel_tablecontent_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Cls", GXutil.rtrim( Dvpanel_tablecontent_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Title", GXutil.rtrim( Dvpanel_tablecontent_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Collapsible", GXutil.booltostr( Dvpanel_tablecontent_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Collapsed", GXutil.booltostr( Dvpanel_tablecontent_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Showcollapseicon", GXutil.booltostr( Dvpanel_tablecontent_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Iconposition", GXutil.rtrim( Dvpanel_tablecontent_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLECONTENT_Autoscroll", GXutil.booltostr( Dvpanel_tablecontent_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLARESULTADO_Width", GXutil.rtrim( Dvpanel_tablaresultado_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLARESULTADO_Autowidth", GXutil.booltostr( Dvpanel_tablaresultado_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLARESULTADO_Autoheight", GXutil.booltostr( Dvpanel_tablaresultado_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLARESULTADO_Cls", GXutil.rtrim( Dvpanel_tablaresultado_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLARESULTADO_Title", GXutil.rtrim( Dvpanel_tablaresultado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLARESULTADO_Collapsible", GXutil.booltostr( Dvpanel_tablaresultado_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLARESULTADO_Collapsed", GXutil.booltostr( Dvpanel_tablaresultado_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLARESULTADO_Showcollapseicon", GXutil.booltostr( Dvpanel_tablaresultado_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLARESULTADO_Iconposition", GXutil.rtrim( Dvpanel_tablaresultado_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLARESULTADO_Autoscroll", GXutil.booltostr( Dvpanel_tablaresultado_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid1_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLARESULTADO_Collapsed", GXutil.booltostr( Dvpanel_tablaresultado_Collapsed));
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
         weZW2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtZW2( ) ;
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
      return formatLink("app.enviarcorreoarchivosadjuntos", new String[] {GXutil.URLEncode(GXutil.rtrim(AV27TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV23parametroCorreosDestinoJson)),GXutil.URLEncode(GXutil.rtrim(AV20parametroCorreosCopiaJson)),GXutil.URLEncode(GXutil.rtrim(AV21parametroCorreosCopiaOcultaJson)),GXutil.URLEncode(GXutil.rtrim(AV19parametroAsunto)),GXutil.URLEncode(GXutil.rtrim(AV24parametroTextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV18NombresAdjuntosJson)),GXutil.URLEncode(GXutil.booltostr(AV14MostrarMail))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail"})  ;
   }

   public String getPgmname( )
   {
      return "EnviarCorreoArchivosAdjuntos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Envio de Correo (Archivos Adjuntos)", "") ;
   }

   public void wbZW0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV52Pgmname), GXutil.rtrim( localUtil.format( AV52Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoArchivosAdjuntos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemains_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablecontent.setProperty("Width", Dvpanel_tablecontent_Width);
         ucDvpanel_tablecontent.setProperty("AutoWidth", Dvpanel_tablecontent_Autowidth);
         ucDvpanel_tablecontent.setProperty("AutoHeight", Dvpanel_tablecontent_Autoheight);
         ucDvpanel_tablecontent.setProperty("Cls", Dvpanel_tablecontent_Cls);
         ucDvpanel_tablecontent.setProperty("Title", Dvpanel_tablecontent_Title);
         ucDvpanel_tablecontent.setProperty("Collapsible", Dvpanel_tablecontent_Collapsible);
         ucDvpanel_tablecontent.setProperty("Collapsed", Dvpanel_tablecontent_Collapsed);
         ucDvpanel_tablecontent.setProperty("ShowCollapseIcon", Dvpanel_tablecontent_Showcollapseicon);
         ucDvpanel_tablecontent.setProperty("IconPosition", Dvpanel_tablecontent_Iconposition);
         ucDvpanel_tablecontent.setProperty("AutoScroll", Dvpanel_tablecontent_Autoscroll);
         ucDvpanel_tablecontent.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablecontent_Internalname, "DVPANEL_TABLECONTENTContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLECONTENTContainer"+"TableContent"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTabladatoscorreo_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNombredestino_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNombredestino_Internalname, httpContext.getMessage( "Nombre Destino", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNombredestino_Internalname, AV16NombreDestino, GXutil.rtrim( localUtil.format( AV16NombreDestino, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,29);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNombredestino_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNombredestino_Enabled, 1, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoArchivosAdjuntos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDestinoemail_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDestinoemail_Internalname, httpContext.getMessage( "Correo Destino", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDestinoemail_Internalname, AV12DestinoEmail, GXutil.rtrim( localUtil.format( AV12DestinoEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,33);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDestinoemail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDestinoemail_Enabled, 1, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoArchivosAdjuntos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcemail_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcemail_Internalname, httpContext.getMessage( "Cc", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcemail_Internalname, AV48CcEmail, GXutil.rtrim( localUtil.format( AV48CcEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcemail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcemail_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoArchivosAdjuntos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAsunto_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAsunto_Internalname, httpContext.getMessage( "Asunto", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAsunto_Internalname, AV5Asunto, GXutil.rtrim( localUtil.format( AV5Asunto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAsunto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAsunto_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoArchivosAdjuntos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* User Defined Control */
         ucTextocorreomostrar.setProperty("Attribute", AV37TextoCorreoMostrar);
         ucTextocorreomostrar.setProperty("CaptionClass", Textocorreomostrar_Captionclass);
         ucTextocorreomostrar.setProperty("CaptionStyle", Textocorreomostrar_Captionstyle);
         ucTextocorreomostrar.setProperty("CaptionPosition", Textocorreomostrar_Captionposition);
         ucTextocorreomostrar.render(context, "fckeditor", Textocorreomostrar_Internalname, "TEXTOCORREOMOSTRARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablaacciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 56,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenviarcorreo_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "Enviar Correo", ""), bttBtnenviarcorreo_Jsonclick, 5, httpContext.getMessage( "Enviar Correo", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOENVIARCORREO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EnviarCorreoArchivosAdjuntos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 58,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EnviarCorreoArchivosAdjuntos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", edtavNombrearchivo_Visible, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNombrearchivo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNombrearchivo_Internalname, httpContext.getMessage( "Listado Adjuntos", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNombrearchivo_Internalname, AV15NombreArchivo, GXutil.rtrim( localUtil.format( AV15NombreArchivo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNombrearchivo_Jsonclick, 0, "AttributeFL", "", "", "", "", edtavNombrearchivo_Visible, edtavNombrearchivo_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoArchivosAdjuntos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableupload_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol72( ) ;
      }
      if ( wbEnd == 72 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_72 = (int)(nGXsfl_72_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
            Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
            }
         }
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
         /* User Defined Control */
         ucUpload.setProperty("AutoUpload", Upload_Autoupload);
         ucUpload.setProperty("HideAdditionalButtons", Upload_Hideadditionalbuttons);
         ucUpload.setProperty("TooltipText", Upload_Tooltiptext);
         ucUpload.setProperty("MaxNumberOfFiles", Upload_Maxnumberoffiles);
         ucUpload.setProperty("AutoDisableAddingFiles", Upload_Autodisableaddingfiles);
         ucUpload.setProperty("UploadedFiles", AV46UploadedFiles);
         ucUpload.setProperty("FailedFiles", AV43FailedFiles);
         ucUpload.render(context, "fileupload", Upload_Internalname, "UPLOADContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminaradjuntos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 72, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar", ""), bttBtneliminaradjuntos_Jsonclick, 5, httpContext.getMessage( "Eliminar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOELIMINARADJUNTOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_EnviarCorreoArchivosAdjuntos.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 CellMarginTop", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_tablaresultado.setProperty("Width", Dvpanel_tablaresultado_Width);
         ucDvpanel_tablaresultado.setProperty("AutoWidth", Dvpanel_tablaresultado_Autowidth);
         ucDvpanel_tablaresultado.setProperty("AutoHeight", Dvpanel_tablaresultado_Autoheight);
         ucDvpanel_tablaresultado.setProperty("Cls", Dvpanel_tablaresultado_Cls);
         ucDvpanel_tablaresultado.setProperty("Title", Dvpanel_tablaresultado_Title);
         ucDvpanel_tablaresultado.setProperty("Collapsible", Dvpanel_tablaresultado_Collapsible);
         ucDvpanel_tablaresultado.setProperty("Collapsed", Dvpanel_tablaresultado_Collapsed);
         ucDvpanel_tablaresultado.setProperty("ShowCollapseIcon", Dvpanel_tablaresultado_Showcollapseicon);
         ucDvpanel_tablaresultado.setProperty("IconPosition", Dvpanel_tablaresultado_Iconposition);
         ucDvpanel_tablaresultado.setProperty("AutoScroll", Dvpanel_tablaresultado_Autoscroll);
         ucDvpanel_tablaresultado.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tablaresultado_Internalname, "DVPANEL_TABLARESULTADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLARESULTADOContainer"+"TablaResultado"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablaresultado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCodigoerrorenvio_Internalname, httpContext.getMessage( "Codigo Error Envio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCodigoerrorenvio_Internalname, GXutil.ltrim( localUtil.ntoc( AV7CodigoErrorEnvio, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCodigoerrorenvio_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7CodigoErrorEnvio), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7CodigoErrorEnvio), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,96);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCodigoerrorenvio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCodigoerrorenvio_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EnviarCorreoArchivosAdjuntos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDescripcionerrorenvio_Internalname, httpContext.getMessage( "Descripcion Error Envio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_72_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDescripcionerrorenvio_Internalname, AV11DescripcionErrorEnvio, GXutil.rtrim( localUtil.format( AV11DescripcionErrorEnvio, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDescripcionerrorenvio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDescripcionerrorenvio_Enabled, 0, "text", "", 120, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoArchivosAdjuntos.htm");
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
         ucGrid1_empowerer.render(context, "wwp.gridempowerer", Grid1_empowerer_Internalname, "GRID1_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 72 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Grid1Container.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Grid1Container.AddObjectProperty("GRID1_nEOF", GRID1_nEOF);
               Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Grid1Container"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Grid1", Grid1Container, subGrid1_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData", Grid1Container.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Grid1ContainerData"+"V", Grid1Container.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Grid1ContainerData"+"V"+"\" value='"+Grid1Container.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startZW2( )
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
      strupZW0( ) ;
   }

   public void wsZW2( )
   {
      startZW2( ) ;
      evtZW2( ) ;
   }

   public void evtZW2( )
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
                           e11ZW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOELIMINARADJUNTOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEliminarAdjuntos' */
                           e12ZW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOENVIARCORREO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEnviarCorreo' */
                           e13ZW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCancelar' */
                           e14ZW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDESCRIPCIONERRORENVIO.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15ZW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRID1PAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid1_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid1_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid1_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid1_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_72_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_722( ) ;
                           AV44FileUploadData.setgxTv_SdtFileUploadData_Fullname( httpContext.cgiGet( edtavFileuploaddata_fullname_Internalname) );
                           AV44FileUploadData.setgxTv_SdtFileUploadData_Name( httpContext.cgiGet( edtavFileuploaddata_name_Internalname) );
                           AV44FileUploadData.setgxTv_SdtFileUploadData_Extension( httpContext.cgiGet( edtavFileuploaddata_extension_Internalname) );
                           AV44FileUploadData.setgxTv_SdtFileUploadData_Size( localUtil.ctol( httpContext.cgiGet( edtavFileuploaddata_size_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) );
                           AV44FileUploadData.setgxTv_SdtFileUploadData_File( httpContext.cgiGet( edtavFileuploaddata_file_Internalname) );
                           AV47UserAction1 = httpContext.cgiGet( edtavUseraction1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavUseraction1_Internalname, AV47UserAction1);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e16ZW2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e17ZW2 ();
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

   public void weZW2( )
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

   public void paZW2( )
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
            GX_FocusControl = edtavNombredestino_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgrid1_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_722( ) ;
      while ( nGXsfl_72_idx <= nRC_GXsfl_72 )
      {
         sendrow_722( ) ;
         nGXsfl_72_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_72_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_72_idx+1) ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_722( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  String AV23parametroCorreosDestinoJson ,
                                  String AV27TextoSeparador ,
                                  boolean AV14MostrarMail ,
                                  String AV20parametroCorreosCopiaJson ,
                                  String AV21parametroCorreosCopiaOcultaJson ,
                                  String AV19parametroAsunto ,
                                  String AV24parametroTextoCorreo ,
                                  String AV18NombresAdjuntosJson )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rfZW2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid1_refresh */
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
      rfZW2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV52Pgmname = "EnviarCorreoArchivosAdjuntos" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavNombredestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombredestino_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNombredestino_Enabled), 5, 0), true);
      edtavNombrearchivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombrearchivo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNombrearchivo_Enabled), 5, 0), true);
      edtavFileuploaddata_fullname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_fullname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_fullname_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavFileuploaddata_name_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_name_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_name_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavFileuploaddata_extension_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_extension_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_extension_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavFileuploaddata_size_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_size_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_size_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavFileuploaddata_file_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_file_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_file_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavUseraction1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUseraction1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUseraction1_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavCodigoerrorenvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCodigoerrorenvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCodigoerrorenvio_Enabled), 5, 0), true);
      edtavDescripcionerrorenvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDescripcionerrorenvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDescripcionerrorenvio_Enabled), 5, 0), true);
   }

   public void rfZW2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(72) ;
      nGXsfl_72_idx = 1 ;
      sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_722( ) ;
      bGXsfl_72_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      if ( subGrid1_Islastpage != 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordcount( )-subgrid1_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_722( ) ;
         e17ZW2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_72_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e17ZW2 ();
         }
         wbEnd = (short)(72) ;
         wbZW0( ) ;
      }
      bGXsfl_72_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesZW2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSDESTINOJSON", AV23parametroCorreosDestinoJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSDESTINOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23parametroCorreosDestinoJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOSEPARADOR", AV27TextoSeparador);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOSEPARADOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27TextoSeparador, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMOSTRARMAIL", AV14MostrarMail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV14MostrarMail));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSCOPIAJSON", AV20parametroCorreosCopiaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20parametroCorreosCopiaJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSCOPIAOCULTAJSON", AV21parametroCorreosCopiaOcultaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAOCULTAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21parametroCorreosCopiaOcultaJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROASUNTO", AV19parametroAsunto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROASUNTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19parametroAsunto, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROTEXTOCORREO", AV24parametroTextoCorreo);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROTEXTOCORREO", getSecureSignedToken( "", AV24parametroTextoCorreo));
      app.GxWebStd.gx_hidden_field( httpContext, "vNOMBRESADJUNTOSJSON", AV18NombresAdjuntosJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOMBRESADJUNTOSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18NombresAdjuntosJson, ""))));
   }

   public int subgrid1_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      return (int)(((subGrid1_Recordcount==0) ? GRID1_nFirstRecordOnPage+1 : subGrid1_Recordcount)) ;
   }

   public int subgrid1_fnc_recordsperpage( )
   {
      if ( subGrid1_Rows > 0 )
      {
         return subGrid1_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgrid1_fnc_currentpage( )
   {
      return (int)(((subGrid1_Islastpage==1) ? subgrid1_fnc_recordcount( )/ (double) (subgrid1_fnc_recordsperpage( ))+((((int)((subgrid1_fnc_recordcount( )) % (subgrid1_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV23parametroCorreosDestinoJson, AV27TextoSeparador, AV14MostrarMail, AV20parametroCorreosCopiaJson, AV21parametroCorreosCopiaOcultaJson, AV19parametroAsunto, AV24parametroTextoCorreo, AV18NombresAdjuntosJson) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      if ( GRID1_nEOF == 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV23parametroCorreosDestinoJson, AV27TextoSeparador, AV14MostrarMail, AV20parametroCorreosCopiaJson, AV21parametroCorreosCopiaOcultaJson, AV19parametroAsunto, AV24parametroTextoCorreo, AV18NombresAdjuntosJson) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID1_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid1_previouspage( )
   {
      if ( GRID1_nFirstRecordOnPage >= subgrid1_fnc_recordsperpage( ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage-subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV23parametroCorreosDestinoJson, AV27TextoSeparador, AV14MostrarMail, AV20parametroCorreosCopiaJson, AV21parametroCorreosCopiaOcultaJson, AV19parametroAsunto, AV24parametroTextoCorreo, AV18NombresAdjuntosJson) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV23parametroCorreosDestinoJson, AV27TextoSeparador, AV14MostrarMail, AV20parametroCorreosCopiaJson, AV21parametroCorreosCopiaOcultaJson, AV19parametroAsunto, AV24parametroTextoCorreo, AV18NombresAdjuntosJson) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid1_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRID1_nFirstRecordOnPage = (long)(subgrid1_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV23parametroCorreosDestinoJson, AV27TextoSeparador, AV14MostrarMail, AV20parametroCorreosCopiaJson, AV21parametroCorreosCopiaOcultaJson, AV19parametroAsunto, AV24parametroTextoCorreo, AV18NombresAdjuntosJson) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV52Pgmname = "EnviarCorreoArchivosAdjuntos" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      edtavNombredestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombredestino_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNombredestino_Enabled), 5, 0), true);
      edtavNombrearchivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombrearchivo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNombrearchivo_Enabled), 5, 0), true);
      edtavFileuploaddata_fullname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_fullname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_fullname_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavFileuploaddata_name_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_name_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_name_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavFileuploaddata_extension_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_extension_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_extension_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavFileuploaddata_size_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_size_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_size_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavFileuploaddata_file_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_file_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_file_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavUseraction1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUseraction1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUseraction1_Enabled), 5, 0), !bGXsfl_72_Refreshing);
      edtavCodigoerrorenvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCodigoerrorenvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCodigoerrorenvio_Enabled), 5, 0), true);
      edtavDescripcionerrorenvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDescripcionerrorenvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDescripcionerrorenvio_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupZW0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e16ZW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Fileuploaddata"), AV44FileUploadData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vUPLOADEDFILES"), AV46UploadedFiles);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFAILEDFILES"), AV43FailedFiles);
         /* Read saved values. */
         nRC_GXsfl_72 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_72"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV37TextoCorreoMostrar = httpContext.cgiGet( "vTEXTOCORREOMOSTRAR") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         Textocorreomostrar_Enabled = GXutil.strtobool( httpContext.cgiGet( "TEXTOCORREOMOSTRAR_Enabled")) ;
         Textocorreomostrar_Captionclass = httpContext.cgiGet( "TEXTOCORREOMOSTRAR_Captionclass") ;
         Textocorreomostrar_Captionstyle = httpContext.cgiGet( "TEXTOCORREOMOSTRAR_Captionstyle") ;
         Textocorreomostrar_Captionposition = httpContext.cgiGet( "TEXTOCORREOMOSTRAR_Captionposition") ;
         Upload_Autoupload = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Autoupload")) ;
         Upload_Hideadditionalbuttons = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Hideadditionalbuttons")) ;
         Upload_Tooltiptext = httpContext.cgiGet( "UPLOAD_Tooltiptext") ;
         Upload_Maxnumberoffiles = (int)(localUtil.ctol( httpContext.cgiGet( "UPLOAD_Maxnumberoffiles"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Upload_Autodisableaddingfiles = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Autodisableaddingfiles")) ;
         Dvpanel_tablecontent_Width = httpContext.cgiGet( "DVPANEL_TABLECONTENT_Width") ;
         Dvpanel_tablecontent_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Autowidth")) ;
         Dvpanel_tablecontent_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Autoheight")) ;
         Dvpanel_tablecontent_Cls = httpContext.cgiGet( "DVPANEL_TABLECONTENT_Cls") ;
         Dvpanel_tablecontent_Title = httpContext.cgiGet( "DVPANEL_TABLECONTENT_Title") ;
         Dvpanel_tablecontent_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Collapsible")) ;
         Dvpanel_tablecontent_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Collapsed")) ;
         Dvpanel_tablecontent_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Showcollapseicon")) ;
         Dvpanel_tablecontent_Iconposition = httpContext.cgiGet( "DVPANEL_TABLECONTENT_Iconposition") ;
         Dvpanel_tablecontent_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLECONTENT_Autoscroll")) ;
         Dvpanel_tablaresultado_Width = httpContext.cgiGet( "DVPANEL_TABLARESULTADO_Width") ;
         Dvpanel_tablaresultado_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLARESULTADO_Autowidth")) ;
         Dvpanel_tablaresultado_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLARESULTADO_Autoheight")) ;
         Dvpanel_tablaresultado_Cls = httpContext.cgiGet( "DVPANEL_TABLARESULTADO_Cls") ;
         Dvpanel_tablaresultado_Title = httpContext.cgiGet( "DVPANEL_TABLARESULTADO_Title") ;
         Dvpanel_tablaresultado_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLARESULTADO_Collapsible")) ;
         Dvpanel_tablaresultado_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLARESULTADO_Collapsed")) ;
         Dvpanel_tablaresultado_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLARESULTADO_Showcollapseicon")) ;
         Dvpanel_tablaresultado_Iconposition = httpContext.cgiGet( "DVPANEL_TABLARESULTADO_Iconposition") ;
         Dvpanel_tablaresultado_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLARESULTADO_Autoscroll")) ;
         Grid1_empowerer_Gridinternalname = httpContext.cgiGet( "GRID1_EMPOWERER_Gridinternalname") ;
         /* Read variables values. */
         AV52Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV52Pgmname", AV52Pgmname);
         AV16NombreDestino = httpContext.cgiGet( edtavNombredestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16NombreDestino", AV16NombreDestino);
         AV12DestinoEmail = httpContext.cgiGet( edtavDestinoemail_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12DestinoEmail", AV12DestinoEmail);
         AV48CcEmail = httpContext.cgiGet( edtavCcemail_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV48CcEmail", AV48CcEmail);
         AV5Asunto = httpContext.cgiGet( edtavAsunto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Asunto", AV5Asunto);
         AV15NombreArchivo = httpContext.cgiGet( edtavNombrearchivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15NombreArchivo", AV15NombreArchivo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCodigoerrorenvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCodigoerrorenvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCODIGOERRORENVIO");
            GX_FocusControl = edtavCodigoerrorenvio_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7CodigoErrorEnvio = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CodigoErrorEnvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodigoErrorEnvio), 18, 0));
         }
         else
         {
            AV7CodigoErrorEnvio = localUtil.ctol( httpContext.cgiGet( edtavCodigoerrorenvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CodigoErrorEnvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodigoErrorEnvio), 18, 0));
         }
         AV11DescripcionErrorEnvio = httpContext.cgiGet( edtavDescripcionerrorenvio_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11DescripcionErrorEnvio", AV11DescripcionErrorEnvio);
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
      e16ZW2 ();
      if (returnInSub) return;
   }

   public void e16ZW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'CARGAR DATOS PARAMÉTRICOS' */
      S112 ();
      if (returnInSub) return;
      edtavNombredestino_Enabled = (((AV10CorreosDestino.size()==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombredestino_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNombredestino_Enabled), 5, 0), true);
      edtavDestinoemail_Enabled = (((AV10CorreosDestino.size()==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDestinoemail_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDestinoemail_Enabled), 5, 0), true);
      GXt_char1 = AV38Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      enviarcorreoarchivosadjuntos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV38Station = GXt_char1 ;
      GXv_char2[0] = AV39EmprCod ;
      GXv_char3[0] = AV40EmprNom ;
      GXv_char4[0] = AV41UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV38Station, GXv_char2, GXv_char3, GXv_char4) ;
      enviarcorreoarchivosadjuntos_impl.this.AV39EmprCod = GXv_char2[0] ;
      enviarcorreoarchivosadjuntos_impl.this.AV40EmprNom = GXv_char3[0] ;
      enviarcorreoarchivosadjuntos_impl.this.AV41UsurCod = GXv_char4[0] ;
      Grid1_empowerer_Gridinternalname = subGrid1_Internalname ;
      ucGrid1_empowerer.sendProperty(context, "", false, Grid1_empowerer_Internalname, "GridInternalName", Grid1_empowerer_Gridinternalname);
      subGrid1_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   private void e17ZW2( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      AV47UserAction1 = httpContext.getMessage( "Deletar", "") ;
      httpContext.ajax_rsp_assign_attri("", false, edtavUseraction1_Internalname, AV47UserAction1);
      /*  Sending Event outputs  */
   }

   public void e12ZW2( )
   {
      /* 'DoEliminarAdjuntos' Routine */
      returnInSub = false ;
      AV17NombresAdjuntos.clear();
      /* Execute user subroutine: 'CARGAR DATOS PARAMÉTRICOS' */
      S112 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV17NombresAdjuntos", AV17NombresAdjuntos);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10CorreosDestino", AV10CorreosDestino);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV8CorreosCopia", AV8CorreosCopia);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV9CorreosCopiaOculta", AV9CorreosCopiaOculta);
   }

   public void e13ZW2( )
   {
      /* 'DoEnviarCorreo' Routine */
      returnInSub = false ;
      if ( (GXutil.strcmp("", AV16NombreDestino)==0) && ( AV10CorreosDestino.size() == 0 ) )
      {
         httpContext.GX_msglist.addItem("Se requiere nombre destinatario");
      }
      else if ( (GXutil.strcmp("", AV12DestinoEmail)==0) && ( AV10CorreosDestino.size() == 0 ) )
      {
         httpContext.GX_msglist.addItem("Se requiere mail destinatario");
      }
      else if ( (GXutil.strcmp("", AV5Asunto)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere asunto del mail", ""));
      }
      else if ( (GXutil.strcmp("", AV37TextoCorreoMostrar)==0) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se requiere texto del mail", ""));
      }
      else
      {
         if ( ! (GXutil.strcmp("", AV16NombreDestino)==0) && ! (GXutil.strcmp("", AV12DestinoEmail)==0) && ( AV10CorreosDestino.size() == 0 ) )
         {
            AV13DirTo.setAddress( AV12DestinoEmail );
            AV13DirTo.setName( AV16NombreDestino );
            AV10CorreosDestino.add(AV13DirTo, 0);
         }
         AV7CodigoErrorEnvio = 0 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7CodigoErrorEnvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodigoErrorEnvio), 18, 0));
         AV11DescripcionErrorEnvio = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11DescripcionErrorEnvio", AV11DescripcionErrorEnvio);
         GXv_int5[0] = AV7CodigoErrorEnvio ;
         GXv_char4[0] = AV11DescripcionErrorEnvio ;
         new app.enviarcorreosmtp(remoteHandle, context).execute( AV10CorreosDestino, AV8CorreosCopia, AV9CorreosCopiaOculta, AV5Asunto, AV37TextoCorreoMostrar, AV17NombresAdjuntos, GXv_int5, GXv_char4) ;
         enviarcorreoarchivosadjuntos_impl.this.AV7CodigoErrorEnvio = GXv_int5[0] ;
         enviarcorreoarchivosadjuntos_impl.this.AV11DescripcionErrorEnvio = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7CodigoErrorEnvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodigoErrorEnvio), 18, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV11DescripcionErrorEnvio", AV11DescripcionErrorEnvio);
         this.executeUsercontrolMethod("", false, "DVPANEL_TABLARESULTADOContainer", "Expand", "", new Object[] {});
         this.executeUsercontrolMethod("", false, "DVPANEL_TABLECONTENTContainer", "Collapse", "", new Object[] {});
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV10CorreosDestino", AV10CorreosDestino);
   }

   public void e14ZW2( )
   {
      /* 'DoCancelar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e15ZW2( )
   {
      /* Descripcionerrorenvio_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", AV11DescripcionErrorEnvio)==0) )
      {
         if ( (0==AV7CodigoErrorEnvio) && ! AV14MostrarMail )
         {
            httpContext.setWebReturnParms(new Object[] {});
            httpContext.setWebReturnParmsMetadata(new Object[] {});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
         this.executeUsercontrolMethod("", false, "DVPANEL_TABLARESULTADOContainer", "Expand", "", new Object[] {});
         this.executeUsercontrolMethod("", false, "DVPANEL_TABLECONTENTContainer", "Collapse", "", new Object[] {});
      }
   }

   public void e11ZW2( )
   {
      /* Upload_Uploadcomplete Routine */
      returnInSub = false ;
      AV58GXV6 = 1 ;
      while ( AV58GXV6 <= AV46UploadedFiles.size() )
      {
         AV45FileUploadfile = (app.SdtFileUploadData)((app.SdtFileUploadData)AV46UploadedFiles.elementAt(-1+AV58GXV6));
         AV42Archivo = AV45FileUploadfile.getgxTv_SdtFileUploadData_File() ;
         AV59Archivo_GXI = com.genexus.GXDbFile.getUriFromFile( "", "", AV45FileUploadfile.getgxTv_SdtFileUploadData_File()) ;
         AV58GXV6 = (int)(AV58GXV6+1) ;
      }
      if ( (GXutil.strcmp("", AV15NombreArchivo)==0) )
      {
         AV15NombreArchivo = AV59Archivo_GXI ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15NombreArchivo", AV15NombreArchivo);
      }
      else
      {
         AV15NombreArchivo += AV59Archivo_GXI + GXutil.newLine( ) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15NombreArchivo", AV15NombreArchivo);
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'CARGAR DATOS PARAMÉTRICOS' Routine */
      returnInSub = false ;
      AV30ListaCorreosDestino.fromJSonString(AV23parametroCorreosDestinoJson, null);
      AV60GXV7 = 1 ;
      while ( AV60GXV7 <= AV30ListaCorreosDestino.size() )
      {
         AV31CadenaRegistrar = (String)AV30ListaCorreosDestino.elementAt(-1+AV60GXV7) ;
         AV32PosicionSeparador = (short)(GXutil.strSearch( AV31CadenaRegistrar, AV27TextoSeparador, 1)) ;
         AV12DestinoEmail = GXutil.substring( AV31CadenaRegistrar, 1, (AV32PosicionSeparador-1)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12DestinoEmail", AV12DestinoEmail);
         AV32PosicionSeparador = (short)(AV32PosicionSeparador+(GXutil.len( AV27TextoSeparador))) ;
         AV16NombreDestino = GXutil.substring( AV31CadenaRegistrar, AV32PosicionSeparador, GXutil.len( AV31CadenaRegistrar)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16NombreDestino", AV16NombreDestino);
         if ( ! AV14MostrarMail )
         {
            AV33CorreoMailRecipient = (com.genexus.internet.MailRecipient)new com.genexus.internet.MailRecipient();
            AV33CorreoMailRecipient.setAddress( AV16NombreDestino );
            AV33CorreoMailRecipient.setName( AV12DestinoEmail );
            AV10CorreosDestino.add(AV33CorreoMailRecipient, 0);
         }
         AV60GXV7 = (int)(AV60GXV7+1) ;
      }
      if ( ! (GXutil.strcmp("", AV20parametroCorreosCopiaJson)==0) )
      {
         AV28ListaCorreosCopia.fromJSonString(AV20parametroCorreosCopiaJson, null);
         AV61GXV8 = 1 ;
         while ( AV61GXV8 <= AV28ListaCorreosCopia.size() )
         {
            AV31CadenaRegistrar = (String)AV28ListaCorreosCopia.elementAt(-1+AV61GXV8) ;
            AV32PosicionSeparador = (short)(GXutil.strSearch( AV31CadenaRegistrar, AV27TextoSeparador, 1)) ;
            AV49CopiaEmail = GXutil.substring( AV31CadenaRegistrar, 1, (AV32PosicionSeparador-1)) ;
            AV33CorreoMailRecipient = (com.genexus.internet.MailRecipient)new com.genexus.internet.MailRecipient();
            AV33CorreoMailRecipient.setAddress( GXutil.substring( AV31CadenaRegistrar, 1, (AV32PosicionSeparador-1)) );
            AV33CorreoMailRecipient.setName( GXutil.strReplace( GXutil.substring( AV31CadenaRegistrar, AV32PosicionSeparador, GXutil.len( AV31CadenaRegistrar)), AV27TextoSeparador, "") );
            AV8CorreosCopia.add(AV33CorreoMailRecipient, 0);
            AV61GXV8 = (int)(AV61GXV8+1) ;
         }
      }
      if ( ! (GXutil.strcmp("", AV21parametroCorreosCopiaOcultaJson)==0) )
      {
         AV29ListaCorreosCopiaOculta.fromJSonString(AV21parametroCorreosCopiaOcultaJson, null);
         AV62GXV9 = 1 ;
         while ( AV62GXV9 <= AV29ListaCorreosCopiaOculta.size() )
         {
            AV31CadenaRegistrar = (String)AV29ListaCorreosCopiaOculta.elementAt(-1+AV62GXV9) ;
            AV32PosicionSeparador = (short)(GXutil.strSearch( AV31CadenaRegistrar, AV27TextoSeparador, 1)) ;
            AV33CorreoMailRecipient = (com.genexus.internet.MailRecipient)new com.genexus.internet.MailRecipient();
            AV33CorreoMailRecipient.setAddress( GXutil.substring( AV31CadenaRegistrar, 1, (AV32PosicionSeparador-1)) );
            AV33CorreoMailRecipient.setName( GXutil.strReplace( GXutil.substring( AV31CadenaRegistrar, AV32PosicionSeparador, GXutil.len( AV31CadenaRegistrar)), AV27TextoSeparador, "") );
            AV9CorreosCopiaOculta.add(AV33CorreoMailRecipient, 0);
            AV62GXV9 = (int)(AV62GXV9+1) ;
         }
      }
      AV5Asunto = AV19parametroAsunto ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Asunto", AV5Asunto);
      AV37TextoCorreoMostrar = AV24parametroTextoCorreo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TextoCorreoMostrar", AV37TextoCorreoMostrar);
      AV37TextoCorreoMostrar = AV24parametroTextoCorreo ;
      httpContext.ajax_rsp_assign_attri("", false, "AV37TextoCorreoMostrar", AV37TextoCorreoMostrar);
      AV26TextoCorreo = GXutil.strReplace( AV24parametroTextoCorreo, "<br>", GXutil.newLine( )) ;
      AV35Cantidad = DecimalUtil.ZERO ;
      AV63GXV10 = 1 ;
      while ( AV63GXV10 <= AV10CorreosDestino.size() )
      {
         AV13DirTo = (com.genexus.internet.MailRecipient)AV10CorreosDestino.elementAt(-1+AV63GXV10);
         AV35Cantidad = AV35Cantidad.add(DecimalUtil.doubleToDec(1)) ;
         AV16NombreDestino = AV13DirTo.getName() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16NombreDestino", AV16NombreDestino);
         AV12DestinoEmail = AV13DirTo.getAddress() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12DestinoEmail", AV12DestinoEmail);
         if (true) break;
         AV63GXV10 = (int)(AV63GXV10+1) ;
      }
      AV17NombresAdjuntos.fromJSonString(AV18NombresAdjuntosJson, null);
      edtavNombrearchivo_Visible = (((AV17NombresAdjuntos.size()>0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombrearchivo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNombrearchivo_Visible), 5, 0), true);
      if ( AV17NombresAdjuntos.size() > 0 )
      {
         AV64GXV11 = 1 ;
         while ( AV64GXV11 <= AV17NombresAdjuntos.size() )
         {
            AV25RutaAdjunto = (String)AV17NombresAdjuntos.elementAt(-1+AV64GXV11) ;
            AV6CantidadArchivos = (short)(AV6CantidadArchivos+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6CantidadArchivos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CantidadArchivos), 4, 0));
            if ( AV6CantidadArchivos == 1 )
            {
               AV15NombreArchivo = AV25RutaAdjunto ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15NombreArchivo", AV15NombreArchivo);
            }
            else
            {
               AV15NombreArchivo += GXutil.newLine( ) + AV25RutaAdjunto ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15NombreArchivo", AV15NombreArchivo);
            }
            AV64GXV11 = (int)(AV64GXV11+1) ;
         }
      }
      if ( ! AV14MostrarMail && ( AV35Cantidad.doubleValue() > 0 ) )
      {
         GXv_int5[0] = AV7CodigoErrorEnvio ;
         GXv_char4[0] = AV11DescripcionErrorEnvio ;
         new app.enviarcorreosmtp(remoteHandle, context).execute( AV10CorreosDestino, AV8CorreosCopia, AV9CorreosCopiaOculta, AV5Asunto, AV37TextoCorreoMostrar, AV17NombresAdjuntos, GXv_int5, GXv_char4) ;
         enviarcorreoarchivosadjuntos_impl.this.AV7CodigoErrorEnvio = GXv_int5[0] ;
         enviarcorreoarchivosadjuntos_impl.this.AV11DescripcionErrorEnvio = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7CodigoErrorEnvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7CodigoErrorEnvio), 18, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV11DescripcionErrorEnvio", AV11DescripcionErrorEnvio);
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV27TextoSeparador = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TextoSeparador", AV27TextoSeparador);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTEXTOSEPARADOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27TextoSeparador, ""))));
      AV23parametroCorreosDestinoJson = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23parametroCorreosDestinoJson", AV23parametroCorreosDestinoJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSDESTINOJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23parametroCorreosDestinoJson, ""))));
      AV20parametroCorreosCopiaJson = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20parametroCorreosCopiaJson", AV20parametroCorreosCopiaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20parametroCorreosCopiaJson, ""))));
      AV21parametroCorreosCopiaOcultaJson = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21parametroCorreosCopiaOcultaJson", AV21parametroCorreosCopiaOcultaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROCORREOSCOPIAOCULTAJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21parametroCorreosCopiaOcultaJson, ""))));
      AV19parametroAsunto = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19parametroAsunto", AV19parametroAsunto);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROASUNTO", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19parametroAsunto, ""))));
      AV24parametroTextoCorreo = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24parametroTextoCorreo", AV24parametroTextoCorreo);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPARAMETROTEXTOCORREO", getSecureSignedToken( "", AV24parametroTextoCorreo));
      AV18NombresAdjuntosJson = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18NombresAdjuntosJson", AV18NombresAdjuntosJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNOMBRESADJUNTOSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV18NombresAdjuntosJson, ""))));
      AV14MostrarMail = ((Boolean) getParm(obj,7)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14MostrarMail", AV14MostrarMail);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMOSTRARMAIL", getSecureSignedToken( "", AV14MostrarMail));
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
      paZW2( ) ;
      wsZW2( ) ;
      weZW2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016423456", true, true);
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
      httpContext.AddJavascriptSource("enviarcorreoarchivosadjuntos.js", "?202661016423456", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("CKEditor/ckeditor/ckeditor.js", "", false, true);
      httpContext.AddJavascriptSource("CKEditor/CKEditorRender.js", "", false, true);
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_722( )
   {
      edtavFileuploaddata_fullname_Internalname = "FILEUPLOADDATA_FULLNAME_"+sGXsfl_72_idx ;
      edtavFileuploaddata_name_Internalname = "FILEUPLOADDATA_NAME_"+sGXsfl_72_idx ;
      edtavFileuploaddata_extension_Internalname = "FILEUPLOADDATA_EXTENSION_"+sGXsfl_72_idx ;
      edtavFileuploaddata_size_Internalname = "FILEUPLOADDATA_SIZE_"+sGXsfl_72_idx ;
      edtavFileuploaddata_file_Internalname = "FILEUPLOADDATA_FILE_"+sGXsfl_72_idx ;
      edtavUseraction1_Internalname = "vUSERACTION1_"+sGXsfl_72_idx ;
   }

   public void subsflControlProps_fel_722( )
   {
      edtavFileuploaddata_fullname_Internalname = "FILEUPLOADDATA_FULLNAME_"+sGXsfl_72_fel_idx ;
      edtavFileuploaddata_name_Internalname = "FILEUPLOADDATA_NAME_"+sGXsfl_72_fel_idx ;
      edtavFileuploaddata_extension_Internalname = "FILEUPLOADDATA_EXTENSION_"+sGXsfl_72_fel_idx ;
      edtavFileuploaddata_size_Internalname = "FILEUPLOADDATA_SIZE_"+sGXsfl_72_fel_idx ;
      edtavFileuploaddata_file_Internalname = "FILEUPLOADDATA_FILE_"+sGXsfl_72_fel_idx ;
      edtavUseraction1_Internalname = "vUSERACTION1_"+sGXsfl_72_fel_idx ;
   }

   public void sendrow_722( )
   {
      subsflControlProps_722( ) ;
      wbZW0( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_72_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
      {
         Grid1Row = GXWebRow.GetNew(context,Grid1Container) ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGrid1_Backstyle = (byte)(0) ;
            subGrid1_Backcolor = subGrid1_Allbackcolor ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Uniform" ;
            }
         }
         else if ( subGrid1_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Odd" ;
            }
            subGrid1_Backcolor = (int)(0x0) ;
         }
         else if ( subGrid1_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGrid1_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_72_idx) % (2))) == 0 )
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Even" ;
               }
            }
            else
            {
               subGrid1_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGrid1_Class, "") != 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Odd" ;
               }
            }
         }
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_72_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploaddata_fullname_Internalname,GXutil.rtrim( AV44FileUploadData.getgxTv_SdtFileUploadData_Fullname()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploaddata_fullname_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFileuploaddata_fullname_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploaddata_name_Internalname,GXutil.rtrim( AV44FileUploadData.getgxTv_SdtFileUploadData_Name()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploaddata_name_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFileuploaddata_name_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploaddata_extension_Internalname,GXutil.rtrim( AV44FileUploadData.getgxTv_SdtFileUploadData_Extension()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploaddata_extension_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFileuploaddata_extension_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploaddata_size_Internalname,GXutil.ltrim( localUtil.ntoc( AV44FileUploadData.getgxTv_SdtFileUploadData_Size(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFileuploaddata_size_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV44FileUploadData.getgxTv_SdtFileUploadData_Size()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV44FileUploadData.getgxTv_SdtFileUploadData_Size()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploaddata_size_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFileuploaddata_size_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         ClassString = "Attribute" ;
         StyleString = "" ;
         edtavFileuploaddata_file_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_file_Internalname, "Filetype", edtavFileuploaddata_file_Filetype, !bGXsfl_72_Refreshing);
         if ( ! (GXutil.strcmp("", AV44FileUploadData.getgxTv_SdtFileUploadData_File())==0) )
         {
            gxblobfileaux.setSource( AV44FileUploadData.getgxTv_SdtFileUploadData_File() );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavFileuploaddata_file_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavFileuploaddata_file_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               AV44FileUploadData.setgxTv_SdtFileUploadData_File( gxblobfileaux.getURI() );
               edtavFileuploaddata_file_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_file_Internalname, "Filetype", edtavFileuploaddata_file_Filetype, !bGXsfl_72_Refreshing);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_file_Internalname, "URL", httpContext.getResourceRelative(AV44FileUploadData.getgxTv_SdtFileUploadData_File()), !bGXsfl_72_Refreshing);
         }
         Grid1Row.AddColumnProperties("blob", 2, isAjaxCallMode( ), new Object[] {edtavFileuploaddata_file_Internalname,GXutil.rtrim( AV44FileUploadData.getgxTv_SdtFileUploadData_File()),httpContext.getResourceRelative(AV44FileUploadData.getgxTv_SdtFileUploadData_File()),((GXutil.strcmp("", edtavFileuploaddata_file_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavFileuploaddata_file_Filetype)==0) ? AV44FileUploadData.getgxTv_SdtFileUploadData_File() : edtavFileuploaddata_file_Filetype)) : edtavFileuploaddata_file_Contenttype),Boolean.valueOf(false),"",edtavFileuploaddata_file_Parameters,Integer.valueOf(0),Integer.valueOf(edtavFileuploaddata_file_Enabled),Integer.valueOf(0),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(60),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),edtavFileuploaddata_file_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'",StyleString,ClassString,"WWColumn","",""+"","",""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUseraction1_Internalname,GXutil.rtrim( AV47UserAction1),"","","'"+""+"'"+",false,"+"'"+""+"'","","",httpContext.getMessage( "Clique aqui para deletar", ""),"",edtavUseraction1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavUseraction1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(72),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesZW2( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_72_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_72_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_72_idx+1) ;
         sGXsfl_72_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_72_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_722( ) ;
      }
      /* End function sendrow_722 */
   }

   public void startgridcontrol72( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"72\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGrid1_Backcolorstyle == 0 )
         {
            subGrid1_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGrid1_Class) > 0 )
            {
               subGrid1_Linesclass = subGrid1_Class+"Title" ;
            }
         }
         else
         {
            subGrid1_Titlebackstyle = (byte)(1) ;
            if ( subGrid1_Backcolorstyle == 1 )
            {
               subGrid1_Titlebackcolor = subGrid1_Allbackcolor ;
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGrid1_Class) > 0 )
               {
                  subGrid1_Linesclass = subGrid1_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Arquivo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "File name without extension", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "File extension", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "File size in bytes", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Uploaded file", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "GridNoBorder WorkWith");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV44FileUploadData.getgxTv_SdtFileUploadData_Fullname()));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploaddata_fullname_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV44FileUploadData.getgxTv_SdtFileUploadData_Name()));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploaddata_name_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV44FileUploadData.getgxTv_SdtFileUploadData_Extension()));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploaddata_extension_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV44FileUploadData.getgxTv_SdtFileUploadData_Size(), (byte)(10), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploaddata_size_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", AV44FileUploadData.getgxTv_SdtFileUploadData_File());
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploaddata_file_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV47UserAction1));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUseraction1_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Container.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGrid1_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGrid1_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGrid1_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavPgmname_Internalname = "vPGMNAME" ;
      edtavNombredestino_Internalname = "vNOMBREDESTINO" ;
      edtavDestinoemail_Internalname = "vDESTINOEMAIL" ;
      edtavCcemail_Internalname = "vCCEMAIL" ;
      edtavAsunto_Internalname = "vASUNTO" ;
      Textocorreomostrar_Internalname = "TEXTOCORREOMOSTRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      bttBtnenviarcorreo_Internalname = "BTNENVIARCORREO" ;
      bttBtncancelar_Internalname = "BTNCANCELAR" ;
      divTablaacciones_Internalname = "TABLAACCIONES" ;
      divTabladatoscorreo_Internalname = "TABLADATOSCORREO" ;
      edtavNombrearchivo_Internalname = "vNOMBREARCHIVO" ;
      edtavFileuploaddata_fullname_Internalname = "FILEUPLOADDATA_FULLNAME" ;
      edtavFileuploaddata_name_Internalname = "FILEUPLOADDATA_NAME" ;
      edtavFileuploaddata_extension_Internalname = "FILEUPLOADDATA_EXTENSION" ;
      edtavFileuploaddata_size_Internalname = "FILEUPLOADDATA_SIZE" ;
      edtavFileuploaddata_file_Internalname = "FILEUPLOADDATA_FILE" ;
      edtavUseraction1_Internalname = "vUSERACTION1" ;
      divTableupload_Internalname = "TABLEUPLOAD" ;
      Upload_Internalname = "UPLOAD" ;
      bttBtneliminaradjuntos_Internalname = "BTNELIMINARADJUNTOS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      Dvpanel_tablecontent_Internalname = "DVPANEL_TABLECONTENT" ;
      edtavCodigoerrorenvio_Internalname = "vCODIGOERRORENVIO" ;
      edtavDescripcionerrorenvio_Internalname = "vDESCRIPCIONERRORENVIO" ;
      divTablaresultado_Internalname = "TABLARESULTADO" ;
      Dvpanel_tablaresultado_Internalname = "DVPANEL_TABLARESULTADO" ;
      divTablemains_Internalname = "TABLEMAINS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Grid1_empowerer_Internalname = "GRID1_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGrid1_Internalname = "GRID1" ;
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
      subGrid1_Allowcollapsing = (byte)(0) ;
      subGrid1_Allowselection = (byte)(0) ;
      subGrid1_Header = "" ;
      edtavUseraction1_Jsonclick = "" ;
      edtavUseraction1_Enabled = 0 ;
      edtavFileuploaddata_file_Jsonclick = "" ;
      edtavFileuploaddata_file_Parameters = "" ;
      edtavFileuploaddata_file_Contenttype = "" ;
      edtavFileuploaddata_file_Filetype = "" ;
      edtavFileuploaddata_file_Enabled = 0 ;
      edtavFileuploaddata_size_Jsonclick = "" ;
      edtavFileuploaddata_size_Enabled = 0 ;
      edtavFileuploaddata_extension_Jsonclick = "" ;
      edtavFileuploaddata_extension_Enabled = 0 ;
      edtavFileuploaddata_name_Jsonclick = "" ;
      edtavFileuploaddata_name_Enabled = 0 ;
      edtavFileuploaddata_fullname_Jsonclick = "" ;
      edtavFileuploaddata_fullname_Enabled = 0 ;
      subGrid1_Class = "GridNoBorder WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavFileuploaddata_file_Enabled = -1 ;
      edtavFileuploaddata_size_Enabled = -1 ;
      edtavFileuploaddata_extension_Enabled = -1 ;
      edtavFileuploaddata_name_Enabled = -1 ;
      edtavFileuploaddata_fullname_Enabled = -1 ;
      edtavDescripcionerrorenvio_Jsonclick = "" ;
      edtavDescripcionerrorenvio_Enabled = 1 ;
      edtavCodigoerrorenvio_Jsonclick = "" ;
      edtavCodigoerrorenvio_Enabled = 1 ;
      edtavNombrearchivo_Jsonclick = "" ;
      edtavNombrearchivo_Enabled = 1 ;
      edtavNombrearchivo_Visible = 1 ;
      Textocorreomostrar_Enabled = GXutil.toBoolean( 1) ;
      edtavAsunto_Jsonclick = "" ;
      edtavAsunto_Enabled = 1 ;
      edtavCcemail_Jsonclick = "" ;
      edtavCcemail_Enabled = 1 ;
      edtavDestinoemail_Jsonclick = "" ;
      edtavDestinoemail_Enabled = 1 ;
      edtavNombredestino_Jsonclick = "" ;
      edtavNombredestino_Enabled = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Dvpanel_tablaresultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablaresultado_Iconposition = "Right" ;
      Dvpanel_tablaresultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablaresultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablaresultado_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablaresultado_Title = httpContext.getMessage( "Resultado EnvíoCorreo", "") ;
      Dvpanel_tablaresultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablaresultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablaresultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablaresultado_Width = "100%" ;
      Dvpanel_tablecontent_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Iconposition = "Right" ;
      Dvpanel_tablecontent_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tablecontent_Title = httpContext.getMessage( "Datos Correo", "") ;
      Dvpanel_tablecontent_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tablecontent_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tablecontent_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tablecontent_Width = "100%" ;
      Upload_Autodisableaddingfiles = GXutil.toBoolean( 0) ;
      Upload_Maxnumberoffiles = 10 ;
      Upload_Tooltiptext = "Enviar el modelo" ;
      Upload_Hideadditionalbuttons = GXutil.toBoolean( -1) ;
      Upload_Autoupload = GXutil.toBoolean( -1) ;
      Textocorreomostrar_Captionposition = "None" ;
      Textocorreomostrar_Captionstyle = "" ;
      Textocorreomostrar_Captionclass = "col-sm-3 AttributeLabel" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Envio de Correo (Archivos Adjuntos)", "") );
      subGrid1_Rows = 0 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV23parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV27TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV14MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV20parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV21parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV19parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV24parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'AV18NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID1.LOAD","{handler:'e17ZW2',iparms:[]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV47UserAction1',fld:'vUSERACTION1',pic:''}]}");
      setEventMetadata("'DOELIMINARADJUNTOS'","{handler:'e12ZW2',iparms:[{av:'AV23parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV27TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV14MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV10CorreosDestino',fld:'vCORREOSDESTINO',pic:''},{av:'AV20parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV8CorreosCopia',fld:'vCORREOSCOPIA',pic:''},{av:'AV21parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV9CorreosCopiaOculta',fld:'vCORREOSCOPIAOCULTA',pic:''},{av:'AV19parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV24parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'AV18NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true},{av:'AV6CantidadArchivos',fld:'vCANTIDADARCHIVOS',pic:'ZZZ9'},{av:'AV15NombreArchivo',fld:'vNOMBREARCHIVO',pic:''}]");
      setEventMetadata("'DOELIMINARADJUNTOS'",",oparms:[{av:'AV17NombresAdjuntos',fld:'vNOMBRESADJUNTOS',pic:''},{av:'AV12DestinoEmail',fld:'vDESTINOEMAIL',pic:''},{av:'AV16NombreDestino',fld:'vNOMBREDESTINO',pic:''},{av:'AV10CorreosDestino',fld:'vCORREOSDESTINO',pic:''},{av:'AV8CorreosCopia',fld:'vCORREOSCOPIA',pic:''},{av:'AV9CorreosCopiaOculta',fld:'vCORREOSCOPIAOCULTA',pic:''},{av:'AV5Asunto',fld:'vASUNTO',pic:''},{av:'AV37TextoCorreoMostrar',fld:'vTEXTOCORREOMOSTRAR',pic:''},{av:'edtavNombrearchivo_Visible',ctrl:'vNOMBREARCHIVO',prop:'Visible'},{av:'AV6CantidadArchivos',fld:'vCANTIDADARCHIVOS',pic:'ZZZ9'},{av:'AV15NombreArchivo',fld:'vNOMBREARCHIVO',pic:''},{av:'AV11DescripcionErrorEnvio',fld:'vDESCRIPCIONERRORENVIO',pic:''},{av:'AV7CodigoErrorEnvio',fld:'vCODIGOERRORENVIO',pic:'ZZZZZZZZZZZZZZZZZ9'}]}");
      setEventMetadata("'DOENVIARCORREO'","{handler:'e13ZW2',iparms:[{av:'AV16NombreDestino',fld:'vNOMBREDESTINO',pic:''},{av:'AV10CorreosDestino',fld:'vCORREOSDESTINO',pic:''},{av:'AV12DestinoEmail',fld:'vDESTINOEMAIL',pic:''},{av:'AV5Asunto',fld:'vASUNTO',pic:''},{av:'AV37TextoCorreoMostrar',fld:'vTEXTOCORREOMOSTRAR',pic:''},{av:'AV8CorreosCopia',fld:'vCORREOSCOPIA',pic:''},{av:'AV9CorreosCopiaOculta',fld:'vCORREOSCOPIAOCULTA',pic:''},{av:'AV17NombresAdjuntos',fld:'vNOMBRESADJUNTOS',pic:''}]");
      setEventMetadata("'DOENVIARCORREO'",",oparms:[{av:'AV10CorreosDestino',fld:'vCORREOSDESTINO',pic:''},{av:'AV7CodigoErrorEnvio',fld:'vCODIGOERRORENVIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV11DescripcionErrorEnvio',fld:'vDESCRIPCIONERRORENVIO',pic:''}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e14ZW2',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("VDESCRIPCIONERRORENVIO.CONTROLVALUECHANGED","{handler:'e15ZW2',iparms:[{av:'AV11DescripcionErrorEnvio',fld:'vDESCRIPCIONERRORENVIO',pic:''},{av:'AV7CodigoErrorEnvio',fld:'vCODIGOERRORENVIO',pic:'ZZZZZZZZZZZZZZZZZ9'},{av:'AV14MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true}]");
      setEventMetadata("VDESCRIPCIONERRORENVIO.CONTROLVALUECHANGED",",oparms:[]}");
      setEventMetadata("UPLOAD.UPLOADCOMPLETE","{handler:'e11ZW2',iparms:[{av:'AV46UploadedFiles',fld:'vUPLOADEDFILES',pic:''},{av:'AV15NombreArchivo',fld:'vNOMBREARCHIVO',pic:''},{av:'AV59Archivo_GXI',fld:'vARCHIVO_GXI',pic:''}]");
      setEventMetadata("UPLOAD.UPLOADCOMPLETE",",oparms:[{av:'AV15NombreArchivo',fld:'vNOMBREARCHIVO',pic:''}]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV23parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV27TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV14MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV20parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV21parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV19parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV24parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'AV18NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV23parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV27TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV14MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV20parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV21parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV19parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV24parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'AV18NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV23parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV27TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV14MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV20parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV21parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV19parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV24parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'AV18NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV23parametroCorreosDestinoJson',fld:'vPARAMETROCORREOSDESTINOJSON',pic:'',hsh:true},{av:'AV27TextoSeparador',fld:'vTEXTOSEPARADOR',pic:'',hsh:true},{av:'AV14MostrarMail',fld:'vMOSTRARMAIL',pic:'',hsh:true},{av:'AV20parametroCorreosCopiaJson',fld:'vPARAMETROCORREOSCOPIAJSON',pic:'',hsh:true},{av:'AV21parametroCorreosCopiaOcultaJson',fld:'vPARAMETROCORREOSCOPIAOCULTAJSON',pic:'',hsh:true},{av:'AV19parametroAsunto',fld:'vPARAMETROASUNTO',pic:'',hsh:true},{av:'AV24parametroTextoCorreo',fld:'vPARAMETROTEXTOCORREO',pic:'',hsh:true},{av:'AV18NombresAdjuntosJson',fld:'vNOMBRESADJUNTOSJSON',pic:'',hsh:true}]");
      setEventMetadata("GRID1_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Useraction1',iparms:[]");
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
      wcpOAV27TextoSeparador = "" ;
      wcpOAV23parametroCorreosDestinoJson = "" ;
      wcpOAV20parametroCorreosCopiaJson = "" ;
      wcpOAV21parametroCorreosCopiaOcultaJson = "" ;
      wcpOAV19parametroAsunto = "" ;
      wcpOAV24parametroTextoCorreo = "" ;
      wcpOAV18NombresAdjuntosJson = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV27TextoSeparador = "" ;
      AV23parametroCorreosDestinoJson = "" ;
      AV20parametroCorreosCopiaJson = "" ;
      AV21parametroCorreosCopiaOcultaJson = "" ;
      AV19parametroAsunto = "" ;
      AV24parametroTextoCorreo = "" ;
      AV18NombresAdjuntosJson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV44FileUploadData = new app.SdtFileUploadData(remoteHandle, context);
      AV37TextoCorreoMostrar = "" ;
      AV46UploadedFiles = new GXBaseCollection<app.SdtFileUploadData>(app.SdtFileUploadData.class, "FileUploadData", "TexplusNET", remoteHandle);
      AV43FailedFiles = new GXBaseCollection<app.SdtFileUploadData>(app.SdtFileUploadData.class, "FileUploadData", "TexplusNET", remoteHandle);
      AV10CorreosDestino = new GXSimpleCollection<com.genexus.internet.MailRecipient>();
      AV8CorreosCopia = new GXSimpleCollection<com.genexus.internet.MailRecipient>();
      AV9CorreosCopiaOculta = new GXSimpleCollection<com.genexus.internet.MailRecipient>();
      AV17NombresAdjuntos = new GXSimpleCollection<String>(String.class, "internal", "");
      AV59Archivo_GXI = "" ;
      Grid1_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      AV52Pgmname = "" ;
      ucDvpanel_tablecontent = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV16NombreDestino = "" ;
      AV12DestinoEmail = "" ;
      AV48CcEmail = "" ;
      AV5Asunto = "" ;
      ucTextocorreomostrar = new com.genexus.webpanels.GXUserControl();
      bttBtnenviarcorreo_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      AV15NombreArchivo = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucUpload = new com.genexus.webpanels.GXUserControl();
      bttBtneliminaradjuntos_Jsonclick = "" ;
      ucDvpanel_tablaresultado = new com.genexus.webpanels.GXUserControl();
      AV11DescripcionErrorEnvio = "" ;
      ucGrid1_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV47UserAction1 = "" ;
      AV38Station = "" ;
      GXt_char1 = "" ;
      AV39EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV40EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV41UsurCod = "" ;
      AV13DirTo = new com.genexus.internet.MailRecipient();
      AV45FileUploadfile = new app.SdtFileUploadData(remoteHandle, context);
      AV42Archivo = "" ;
      AV30ListaCorreosDestino = new GXSimpleCollection<String>(String.class, "internal", "");
      AV31CadenaRegistrar = "" ;
      AV33CorreoMailRecipient = new com.genexus.internet.MailRecipient();
      AV28ListaCorreosCopia = new GXSimpleCollection<String>(String.class, "internal", "");
      AV49CopiaEmail = "" ;
      AV29ListaCorreosCopiaOculta = new GXSimpleCollection<String>(String.class, "internal", "");
      AV26TextoCorreo = "" ;
      AV35Cantidad = DecimalUtil.ZERO ;
      AV25RutaAdjunto = "" ;
      GXv_int5 = new long[1] ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      AV52Pgmname = "EnviarCorreoArchivosAdjuntos" ;
      /* GeneXus formulas. */
      AV52Pgmname = "EnviarCorreoArchivosAdjuntos" ;
      Gx_err = (short)(0) ;
      edtavPgmname_Enabled = 0 ;
      edtavNombredestino_Enabled = 0 ;
      edtavNombrearchivo_Enabled = 0 ;
      edtavFileuploaddata_fullname_Enabled = 0 ;
      edtavFileuploaddata_name_Enabled = 0 ;
      edtavFileuploaddata_extension_Enabled = 0 ;
      edtavFileuploaddata_size_Enabled = 0 ;
      edtavFileuploaddata_file_Enabled = 0 ;
      edtavUseraction1_Enabled = 0 ;
      edtavCodigoerrorenvio_Enabled = 0 ;
      edtavDescripcionerrorenvio_Enabled = 0 ;
   }

   private byte GRID1_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGrid1_Backstyle ;
   private byte subGrid1_Titlebackstyle ;
   private byte subGrid1_Allowselection ;
   private byte subGrid1_Allowhovering ;
   private byte subGrid1_Allowcollapsing ;
   private byte subGrid1_Collapsed ;
   private short AV6CantidadArchivos ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV32PosicionSeparador ;
   private int nRC_GXsfl_72 ;
   private int subGrid1_Rows ;
   private int nGXsfl_72_idx=1 ;
   private int Upload_Maxnumberoffiles ;
   private int edtavPgmname_Enabled ;
   private int edtavNombredestino_Enabled ;
   private int edtavDestinoemail_Enabled ;
   private int edtavCcemail_Enabled ;
   private int edtavAsunto_Enabled ;
   private int edtavNombrearchivo_Visible ;
   private int edtavNombrearchivo_Enabled ;
   private int edtavCodigoerrorenvio_Enabled ;
   private int edtavDescripcionerrorenvio_Enabled ;
   private int subGrid1_Islastpage ;
   private int edtavFileuploaddata_fullname_Enabled ;
   private int edtavFileuploaddata_name_Enabled ;
   private int edtavFileuploaddata_extension_Enabled ;
   private int edtavFileuploaddata_size_Enabled ;
   private int edtavFileuploaddata_file_Enabled ;
   private int edtavUseraction1_Enabled ;
   private int GRID1_nGridOutOfScope ;
   private int subGrid1_Recordcount ;
   private int AV58GXV6 ;
   private int AV60GXV7 ;
   private int AV61GXV8 ;
   private int AV62GXV9 ;
   private int AV63GXV10 ;
   private int AV64GXV11 ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long AV7CodigoErrorEnvio ;
   private long GRID1_nCurrentRecord ;
   private long GXv_int5[] ;
   private java.math.BigDecimal AV35Cantidad ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_72_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Textocorreomostrar_Captionclass ;
   private String Textocorreomostrar_Captionstyle ;
   private String Textocorreomostrar_Captionposition ;
   private String Upload_Tooltiptext ;
   private String Dvpanel_tablecontent_Width ;
   private String Dvpanel_tablecontent_Cls ;
   private String Dvpanel_tablecontent_Title ;
   private String Dvpanel_tablecontent_Iconposition ;
   private String Dvpanel_tablaresultado_Width ;
   private String Dvpanel_tablaresultado_Cls ;
   private String Dvpanel_tablaresultado_Title ;
   private String Dvpanel_tablaresultado_Iconposition ;
   private String Grid1_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String edtavPgmname_Internalname ;
   private String AV52Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divTablemains_Internalname ;
   private String Dvpanel_tablecontent_Internalname ;
   private String divTablecontent_Internalname ;
   private String divTabladatoscorreo_Internalname ;
   private String edtavNombredestino_Internalname ;
   private String TempTags ;
   private String edtavNombredestino_Jsonclick ;
   private String edtavDestinoemail_Internalname ;
   private String edtavDestinoemail_Jsonclick ;
   private String edtavCcemail_Internalname ;
   private String edtavCcemail_Jsonclick ;
   private String edtavAsunto_Internalname ;
   private String edtavAsunto_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String Textocorreomostrar_Internalname ;
   private String divTablaacciones_Internalname ;
   private String bttBtnenviarcorreo_Internalname ;
   private String bttBtnenviarcorreo_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtavNombrearchivo_Internalname ;
   private String edtavNombrearchivo_Jsonclick ;
   private String divTableupload_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String Upload_Internalname ;
   private String bttBtneliminaradjuntos_Internalname ;
   private String bttBtneliminaradjuntos_Jsonclick ;
   private String Dvpanel_tablaresultado_Internalname ;
   private String divTablaresultado_Internalname ;
   private String edtavCodigoerrorenvio_Internalname ;
   private String edtavCodigoerrorenvio_Jsonclick ;
   private String edtavDescripcionerrorenvio_Internalname ;
   private String edtavDescripcionerrorenvio_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid1_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFileuploaddata_fullname_Internalname ;
   private String edtavFileuploaddata_name_Internalname ;
   private String edtavFileuploaddata_extension_Internalname ;
   private String edtavFileuploaddata_size_Internalname ;
   private String edtavFileuploaddata_file_Internalname ;
   private String AV47UserAction1 ;
   private String edtavUseraction1_Internalname ;
   private String AV38Station ;
   private String GXt_char1 ;
   private String AV39EmprCod ;
   private String GXv_char2[] ;
   private String AV40EmprNom ;
   private String GXv_char3[] ;
   private String AV41UsurCod ;
   private String GXv_char4[] ;
   private String sGXsfl_72_fel_idx="0001" ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String ROClassString ;
   private String edtavFileuploaddata_fullname_Jsonclick ;
   private String edtavFileuploaddata_name_Jsonclick ;
   private String edtavFileuploaddata_extension_Jsonclick ;
   private String edtavFileuploaddata_size_Jsonclick ;
   private String edtavFileuploaddata_file_Filetype ;
   private String edtavFileuploaddata_file_Contenttype ;
   private String edtavFileuploaddata_file_Parameters ;
   private String edtavFileuploaddata_file_Jsonclick ;
   private String edtavUseraction1_Jsonclick ;
   private String subGrid1_Header ;
   private boolean wcpOAV14MostrarMail ;
   private boolean Dvpanel_tablaresultado_Collapsed ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV14MostrarMail ;
   private boolean Textocorreomostrar_Enabled ;
   private boolean Upload_Autoupload ;
   private boolean Upload_Hideadditionalbuttons ;
   private boolean Upload_Autodisableaddingfiles ;
   private boolean Dvpanel_tablecontent_Autowidth ;
   private boolean Dvpanel_tablecontent_Autoheight ;
   private boolean Dvpanel_tablecontent_Collapsible ;
   private boolean Dvpanel_tablecontent_Collapsed ;
   private boolean Dvpanel_tablecontent_Showcollapseicon ;
   private boolean Dvpanel_tablecontent_Autoscroll ;
   private boolean Dvpanel_tablaresultado_Autowidth ;
   private boolean Dvpanel_tablaresultado_Autoheight ;
   private boolean Dvpanel_tablaresultado_Collapsible ;
   private boolean Dvpanel_tablaresultado_Showcollapseicon ;
   private boolean Dvpanel_tablaresultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_72_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String wcpOAV24parametroTextoCorreo ;
   private String AV24parametroTextoCorreo ;
   private String AV37TextoCorreoMostrar ;
   private String wcpOAV27TextoSeparador ;
   private String wcpOAV23parametroCorreosDestinoJson ;
   private String wcpOAV20parametroCorreosCopiaJson ;
   private String wcpOAV21parametroCorreosCopiaOcultaJson ;
   private String wcpOAV19parametroAsunto ;
   private String wcpOAV18NombresAdjuntosJson ;
   private String AV27TextoSeparador ;
   private String AV23parametroCorreosDestinoJson ;
   private String AV20parametroCorreosCopiaJson ;
   private String AV21parametroCorreosCopiaOcultaJson ;
   private String AV19parametroAsunto ;
   private String AV18NombresAdjuntosJson ;
   private String AV59Archivo_GXI ;
   private String AV16NombreDestino ;
   private String AV12DestinoEmail ;
   private String AV48CcEmail ;
   private String AV5Asunto ;
   private String AV15NombreArchivo ;
   private String AV11DescripcionErrorEnvio ;
   private String AV31CadenaRegistrar ;
   private String AV49CopiaEmail ;
   private String AV26TextoCorreo ;
   private String AV25RutaAdjunto ;
   private String AV42Archivo ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.MailRecipient AV13DirTo ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablecontent ;
   private com.genexus.webpanels.GXUserControl ucTextocorreomostrar ;
   private com.genexus.webpanels.GXUserControl ucUpload ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tablaresultado ;
   private com.genexus.webpanels.GXUserControl ucGrid1_empowerer ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MailRecipient AV33CorreoMailRecipient ;
   private GXSimpleCollection<String> AV17NombresAdjuntos ;
   private GXSimpleCollection<String> AV30ListaCorreosDestino ;
   private GXSimpleCollection<String> AV28ListaCorreosCopia ;
   private GXSimpleCollection<String> AV29ListaCorreosCopiaOculta ;
   private GXBaseCollection<app.SdtFileUploadData> AV46UploadedFiles ;
   private GXBaseCollection<app.SdtFileUploadData> AV43FailedFiles ;
   private GXSimpleCollection<com.genexus.internet.MailRecipient> AV10CorreosDestino ;
   private GXSimpleCollection<com.genexus.internet.MailRecipient> AV8CorreosCopia ;
   private GXSimpleCollection<com.genexus.internet.MailRecipient> AV9CorreosCopiaOculta ;
   private app.SdtFileUploadData AV44FileUploadData ;
   private app.SdtFileUploadData AV45FileUploadfile ;
}

