package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class enviarcorreomodal_impl extends GXDataArea
{
   public enviarcorreomodal_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public enviarcorreomodal_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( enviarcorreomodal_impl.class ));
   }

   public enviarcorreomodal_impl( int remoteHandle ,
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
            AV39TextoSeparador = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TextoSeparador", AV39TextoSeparador);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV32parametroCorreosDestinoJson = httpContext.GetPar( "parametroCorreosDestinoJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32parametroCorreosDestinoJson", AV32parametroCorreosDestinoJson);
               AV29parametroCorreosCopiaJson = httpContext.GetPar( "parametroCorreosCopiaJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV29parametroCorreosCopiaJson", AV29parametroCorreosCopiaJson);
               AV30parametroCorreosCopiaOcultaJson = httpContext.GetPar( "parametroCorreosCopiaOcultaJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30parametroCorreosCopiaOcultaJson", AV30parametroCorreosCopiaOcultaJson);
               AV28parametroAsunto = httpContext.GetPar( "parametroAsunto") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV28parametroAsunto", AV28parametroAsunto);
               AV33parametroTextoCorreo = httpContext.GetPar( "parametroTextoCorreo") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV33parametroTextoCorreo", AV33parametroTextoCorreo);
               AV27NombresAdjuntosJson = httpContext.GetPar( "NombresAdjuntosJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV27NombresAdjuntosJson", AV27NombresAdjuntosJson);
               AV23MostrarMail = GXutil.strtobool( httpContext.GetPar( "MostrarMail")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23MostrarMail", AV23MostrarMail);
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
      nRC_GXsfl_74 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_74"))) ;
      nGXsfl_74_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_74_idx"))) ;
      sGXsfl_74_idx = httpContext.GetPar( "sGXsfl_74_idx") ;
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
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid1_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpageprompt");
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
      pa29T2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start29T2( ) ;
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
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("CKEditor/ckeditor/ckeditor.js", "", false, true);
      httpContext.AddJavascriptSource("CKEditor/CKEditorRender.js", "", false, true);
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.enviarcorreomodal", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV32parametroCorreosDestinoJson)),GXutil.URLEncode(GXutil.rtrim(AV29parametroCorreosCopiaJson)),GXutil.URLEncode(GXutil.rtrim(AV30parametroCorreosCopiaOcultaJson)),GXutil.URLEncode(GXutil.rtrim(AV28parametroAsunto)),GXutil.URLEncode(GXutil.rtrim(AV33parametroTextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV27NombresAdjuntosJson)),GXutil.URLEncode(GXutil.booltostr(AV23MostrarMail))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail"}) +"\">") ;
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
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Fileuploaddata", AV43FileUploadData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Fileuploaddata", AV43FileUploadData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_74", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_74, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOCORREOMOSTRAR", AV38TextoCorreoMostrar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vUPLOADEDFILES", AV45UploadedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vUPLOADEDFILES", AV45UploadedFiles);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFAILEDFILES", AV42FailedFiles);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFAILEDFILES", AV42FailedFiles);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTEXTOSEPARADOR", AV39TextoSeparador);
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSDESTINOJSON", AV32parametroCorreosDestinoJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSCOPIAJSON", AV29parametroCorreosCopiaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROCORREOSCOPIAOCULTAJSON", AV30parametroCorreosCopiaOcultaJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROASUNTO", AV28parametroAsunto);
      app.GxWebStd.gx_hidden_field( httpContext, "vPARAMETROTEXTOCORREO", AV33parametroTextoCorreo);
      app.GxWebStd.gx_hidden_field( httpContext, "vNOMBRESADJUNTOSJSON", AV27NombresAdjuntosJson);
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vMOSTRARMAIL", AV23MostrarMail);
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTOCORREOMOSTRAR_Enabled", GXutil.booltostr( Textocorreomostrar_Enabled));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTOCORREOMOSTRAR_Width", GXutil.rtrim( Textocorreomostrar_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTOCORREOMOSTRAR_Height", GXutil.rtrim( Textocorreomostrar_Height));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTOCORREOMOSTRAR_Toolbar", GXutil.rtrim( Textocorreomostrar_Toolbar));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTOCORREOMOSTRAR_Captionclass", GXutil.rtrim( Textocorreomostrar_Captionclass));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTOCORREOMOSTRAR_Captionstyle", GXutil.rtrim( Textocorreomostrar_Captionstyle));
      app.GxWebStd.gx_hidden_field( httpContext, "TEXTOCORREOMOSTRAR_Captionposition", GXutil.rtrim( Textocorreomostrar_Captionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Autoupload", GXutil.booltostr( Upload_Autoupload));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Hideadditionalbuttons", GXutil.booltostr( Upload_Hideadditionalbuttons));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Tooltiptext", GXutil.rtrim( Upload_Tooltiptext));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Maxnumberoffiles", GXutil.ltrim( localUtil.ntoc( Upload_Maxnumberoffiles, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "UPLOAD_Autodisableaddingfiles", GXutil.booltostr( Upload_Autodisableaddingfiles));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Pagecount", GXutil.ltrim( localUtil.ntoc( Gxuitabspanel_tabs1_Pagecount, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Class", GXutil.rtrim( Gxuitabspanel_tabs1_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GXUITABSPANEL_TABS1_Historymanagement", GXutil.booltostr( Gxuitabspanel_tabs1_Historymanagement));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid1_empowerer_Gridinternalname));
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
         we29T2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt29T2( ) ;
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
      return formatLink("app.enviarcorreomodal", new String[] {GXutil.URLEncode(GXutil.rtrim(AV39TextoSeparador)),GXutil.URLEncode(GXutil.rtrim(AV32parametroCorreosDestinoJson)),GXutil.URLEncode(GXutil.rtrim(AV29parametroCorreosCopiaJson)),GXutil.URLEncode(GXutil.rtrim(AV30parametroCorreosCopiaOcultaJson)),GXutil.URLEncode(GXutil.rtrim(AV28parametroAsunto)),GXutil.URLEncode(GXutil.rtrim(AV33parametroTextoCorreo)),GXutil.URLEncode(GXutil.rtrim(AV27NombresAdjuntosJson)),GXutil.URLEncode(GXutil.booltostr(AV23MostrarMail))}, new String[] {"TextoSeparador","parametroCorreosDestinoJson","parametroCorreosCopiaJson","parametroCorreosCopiaOcultaJson","parametroAsunto","parametroTextoCorreo","NombresAdjuntosJson","MostrarMail"})  ;
   }

   public String getPgmname( )
   {
      return "EnviarCorreoModal" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Envio de Correo (Archivos Adjuntos)", "") ;
   }

   public void wb29T0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableModal", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTablemains_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGxuitabspanel_tabs1.setProperty("PageCount", Gxuitabspanel_tabs1_Pagecount);
         ucGxuitabspanel_tabs1.setProperty("Class", Gxuitabspanel_tabs1_Class);
         ucGxuitabspanel_tabs1.setProperty("HistoryManagement", Gxuitabspanel_tabs1_Historymanagement);
         ucGxuitabspanel_tabs1.render(context, "tab", Gxuitabspanel_tabs1_Internalname, "GXUITABSPANEL_TABS1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title1"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab1_title_Internalname, httpContext.getMessage( "Email", ""), "", "", lblTab1_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_EnviarCorreoModal.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab1") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNombredestino_Internalname, AV25NombreDestino, GXutil.rtrim( localUtil.format( AV25NombreDestino, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNombredestino_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNombredestino_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoModal.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDestinoemail_Internalname, AV16DestinoEmail, GXutil.rtrim( localUtil.format( AV16DestinoEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDestinoemail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDestinoemail_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoModal.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcemail_Internalname, AV47CcEmail, GXutil.rtrim( localUtil.format( AV47CcEmail, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcemail_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcemail_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoModal.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAsunto_Internalname, AV7Asunto, GXutil.rtrim( localUtil.format( AV7Asunto, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAsunto_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAsunto_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoModal.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* User Defined Control */
         ucTextocorreomostrar.setProperty("Width", Textocorreomostrar_Width);
         ucTextocorreomostrar.setProperty("Height", Textocorreomostrar_Height);
         ucTextocorreomostrar.setProperty("Attribute", AV38TextoCorreoMostrar);
         ucTextocorreomostrar.setProperty("Toolbar", Textocorreomostrar_Toolbar);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop15", "Right", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenviarcorreo_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", httpContext.getMessage( "Enviar Correo", ""), bttBtnenviarcorreo_Jsonclick, 7, httpContext.getMessage( "Enviar Correo", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1129t1_client"+"'", TempTags, "", 2, "HLP_EnviarCorreoModal.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title2"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab3_title_Internalname, httpContext.getMessage( "Anexos", ""), "", "", lblTab3_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_EnviarCorreoModal.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab3") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavNombrearchivo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavNombrearchivo_Internalname, httpContext.getMessage( "Listado Adjuntos", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavNombrearchivo_Internalname, AV24NombreArchivo, GXutil.rtrim( localUtil.format( AV24NombreArchivo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavNombrearchivo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavNombrearchivo_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoModal.htm");
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
         startgridcontrol74( ) ;
      }
      if ( wbEnd == 74 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_74 = (int)(nGXsfl_74_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         ucUpload.setProperty("UploadedFiles", AV45UploadedFiles);
         ucUpload.setProperty("FailedFiles", AV42FailedFiles);
         ucUpload.render(context, "fileupload", Upload_Internalname, "UPLOADContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminaradjuntos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 74, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar", ""), bttBtneliminaradjuntos_Jsonclick, 7, httpContext.getMessage( "Eliminar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1229t1_client"+"'", TempTags, "", 2, "HLP_EnviarCorreoModal.htm");
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
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"title3"+"\" style=\"display:none;\">") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTab2_title_Internalname, httpContext.getMessage( "Resultado Envío do Correo", ""), "", "", lblTab2_title_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_EnviarCorreoModal.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", "", "display:none;", "div");
         httpContext.writeText( "Tab2") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"GXUITABSPANEL_TABS1Container"+"panel3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCodigoerrorenvio_Internalname, httpContext.getMessage( "Codigo Error Envio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCodigoerrorenvio_Internalname, GXutil.ltrim( localUtil.ntoc( AV10CodigoErrorEnvio, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCodigoerrorenvio_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10CodigoErrorEnvio), "ZZZZZZZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10CodigoErrorEnvio), "ZZZZZZZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCodigoerrorenvio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCodigoerrorenvio_Enabled, 0, "text", "1", 18, "chr", 1, "row", 18, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_EnviarCorreoModal.htm");
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
         app.GxWebStd.gx_label_element( httpContext, edtavDescripcionerrorenvio_Internalname, httpContext.getMessage( "Descripcion Error Envio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_74_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDescripcionerrorenvio_Internalname, AV15DescripcionErrorEnvio, GXutil.rtrim( localUtil.format( AV15DescripcionErrorEnvio, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDescripcionerrorenvio_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDescripcionerrorenvio_Enabled, 0, "text", "", 120, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_EnviarCorreoModal.htm");
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
      if ( wbEnd == 74 )
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

   public void start29T2( )
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
      strup29T0( ) ;
   }

   public void ws29T2( )
   {
      start29T2( ) ;
      evt29T2( ) ;
   }

   public void evt29T2( )
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
                           nGXsfl_74_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_742( ) ;
                           AV43FileUploadData.setgxTv_SdtFileUploadData_Fullname( httpContext.cgiGet( edtavFileuploaddata_fullname_Internalname) );
                           AV43FileUploadData.setgxTv_SdtFileUploadData_Name( httpContext.cgiGet( edtavFileuploaddata_name_Internalname) );
                           AV43FileUploadData.setgxTv_SdtFileUploadData_Extension( httpContext.cgiGet( edtavFileuploaddata_extension_Internalname) );
                           AV43FileUploadData.setgxTv_SdtFileUploadData_Size( localUtil.ctol( httpContext.cgiGet( edtavFileuploaddata_size_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) );
                           AV43FileUploadData.setgxTv_SdtFileUploadData_File( httpContext.cgiGet( edtavFileuploaddata_file_Internalname) );
                           AV46UserAction1 = httpContext.cgiGet( edtavUseraction1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavUseraction1_Internalname, AV46UserAction1);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1329T2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1429T2 ();
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

   public void we29T2( )
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

   public void pa29T2( )
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
      subsflControlProps_742( ) ;
      while ( nGXsfl_74_idx <= nRC_GXsfl_74 )
      {
         sendrow_742( ) ;
         nGXsfl_74_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_74_idx+1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID1_nCurrentRecord = 0 ;
      rf29T2( ) ;
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
      rf29T2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavNombredestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombredestino_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNombredestino_Enabled), 5, 0), true);
      edtavNombrearchivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombrearchivo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNombrearchivo_Enabled), 5, 0), true);
      edtavFileuploaddata_fullname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_fullname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_fullname_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavFileuploaddata_name_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_name_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_name_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavFileuploaddata_extension_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_extension_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_extension_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavFileuploaddata_size_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_size_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_size_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavFileuploaddata_file_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_file_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_file_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavUseraction1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUseraction1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUseraction1_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavCodigoerrorenvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCodigoerrorenvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCodigoerrorenvio_Enabled), 5, 0), true);
      edtavDescripcionerrorenvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDescripcionerrorenvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDescripcionerrorenvio_Enabled), 5, 0), true);
   }

   public void rf29T2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(74) ;
      nGXsfl_74_idx = 1 ;
      sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_742( ) ;
      bGXsfl_74_Refreshing = true ;
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
         subsflControlProps_742( ) ;
         e1429T2 ();
         if ( ( GRID1_nCurrentRecord > 0 ) && ( GRID1_nGridOutOfScope == 0 ) && ( nGXsfl_74_idx == 1 ) )
         {
            GRID1_nCurrentRecord = 0 ;
            GRID1_nGridOutOfScope = 1 ;
            subgrid1_firstpage( ) ;
            e1429T2 ();
         }
         wbEnd = (short)(74) ;
         wb29T0( ) ;
      }
      bGXsfl_74_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes29T2( )
   {
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
         gxgrgrid1_refresh( subGrid1_Rows) ;
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
         gxgrgrid1_refresh( subGrid1_Rows) ;
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
         gxgrgrid1_refresh( subGrid1_Rows) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      subGrid1_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows) ;
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
         gxgrgrid1_refresh( subGrid1_Rows) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavNombredestino_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombredestino_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNombredestino_Enabled), 5, 0), true);
      edtavNombrearchivo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavNombrearchivo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNombrearchivo_Enabled), 5, 0), true);
      edtavFileuploaddata_fullname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_fullname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_fullname_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavFileuploaddata_name_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_name_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_name_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavFileuploaddata_extension_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_extension_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_extension_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavFileuploaddata_size_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_size_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_size_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavFileuploaddata_file_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_file_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFileuploaddata_file_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavUseraction1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavUseraction1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUseraction1_Enabled), 5, 0), !bGXsfl_74_Refreshing);
      edtavCodigoerrorenvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCodigoerrorenvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCodigoerrorenvio_Enabled), 5, 0), true);
      edtavDescripcionerrorenvio_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDescripcionerrorenvio_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDescripcionerrorenvio_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup29T0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1329T2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Fileuploaddata"), AV43FileUploadData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vUPLOADEDFILES"), AV45UploadedFiles);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFAILEDFILES"), AV42FailedFiles);
         /* Read saved values. */
         nRC_GXsfl_74 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_74"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV38TextoCorreoMostrar = httpContext.cgiGet( "vTEXTOCORREOMOSTRAR") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         Textocorreomostrar_Enabled = GXutil.strtobool( httpContext.cgiGet( "TEXTOCORREOMOSTRAR_Enabled")) ;
         Textocorreomostrar_Width = httpContext.cgiGet( "TEXTOCORREOMOSTRAR_Width") ;
         Textocorreomostrar_Height = httpContext.cgiGet( "TEXTOCORREOMOSTRAR_Height") ;
         Textocorreomostrar_Toolbar = httpContext.cgiGet( "TEXTOCORREOMOSTRAR_Toolbar") ;
         Textocorreomostrar_Captionclass = httpContext.cgiGet( "TEXTOCORREOMOSTRAR_Captionclass") ;
         Textocorreomostrar_Captionstyle = httpContext.cgiGet( "TEXTOCORREOMOSTRAR_Captionstyle") ;
         Textocorreomostrar_Captionposition = httpContext.cgiGet( "TEXTOCORREOMOSTRAR_Captionposition") ;
         Upload_Autoupload = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Autoupload")) ;
         Upload_Hideadditionalbuttons = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Hideadditionalbuttons")) ;
         Upload_Tooltiptext = httpContext.cgiGet( "UPLOAD_Tooltiptext") ;
         Upload_Maxnumberoffiles = (int)(localUtil.ctol( httpContext.cgiGet( "UPLOAD_Maxnumberoffiles"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Upload_Autodisableaddingfiles = GXutil.strtobool( httpContext.cgiGet( "UPLOAD_Autodisableaddingfiles")) ;
         Gxuitabspanel_tabs1_Pagecount = (int)(localUtil.ctol( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Pagecount"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gxuitabspanel_tabs1_Class = httpContext.cgiGet( "GXUITABSPANEL_TABS1_Class") ;
         Gxuitabspanel_tabs1_Historymanagement = GXutil.strtobool( httpContext.cgiGet( "GXUITABSPANEL_TABS1_Historymanagement")) ;
         Grid1_empowerer_Gridinternalname = httpContext.cgiGet( "GRID1_EMPOWERER_Gridinternalname") ;
         /* Read variables values. */
         AV25NombreDestino = httpContext.cgiGet( edtavNombredestino_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25NombreDestino", AV25NombreDestino);
         AV16DestinoEmail = httpContext.cgiGet( edtavDestinoemail_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16DestinoEmail", AV16DestinoEmail);
         AV47CcEmail = httpContext.cgiGet( edtavCcemail_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47CcEmail", AV47CcEmail);
         AV7Asunto = httpContext.cgiGet( edtavAsunto_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Asunto", AV7Asunto);
         AV24NombreArchivo = httpContext.cgiGet( edtavNombrearchivo_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24NombreArchivo", AV24NombreArchivo);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCodigoerrorenvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCodigoerrorenvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCODIGOERRORENVIO");
            GX_FocusControl = edtavCodigoerrorenvio_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10CodigoErrorEnvio = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10CodigoErrorEnvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CodigoErrorEnvio), 18, 0));
         }
         else
         {
            AV10CodigoErrorEnvio = localUtil.ctol( httpContext.cgiGet( edtavCodigoerrorenvio_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10CodigoErrorEnvio", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10CodigoErrorEnvio), 18, 0));
         }
         AV15DescripcionErrorEnvio = httpContext.cgiGet( edtavDescripcionerrorenvio_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15DescripcionErrorEnvio", AV15DescripcionErrorEnvio);
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
      e1329T2 ();
      if (returnInSub) return;
   }

   public void e1329T2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV36Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      enviarcorreomodal_impl.this.GXt_char1 = GXv_char2[0] ;
      AV36Station = GXt_char1 ;
      GXv_char2[0] = AV18EmprCod ;
      GXv_char3[0] = AV19EmprNom ;
      GXv_char4[0] = AV40UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV36Station, GXv_char2, GXv_char3, GXv_char4) ;
      enviarcorreomodal_impl.this.AV18EmprCod = GXv_char2[0] ;
      enviarcorreomodal_impl.this.AV19EmprNom = GXv_char3[0] ;
      enviarcorreomodal_impl.this.AV40UsurCod = GXv_char4[0] ;
      Grid1_empowerer_Gridinternalname = subGrid1_Internalname ;
      ucGrid1_empowerer.sendProperty(context, "", false, Grid1_empowerer_Internalname, "GridInternalName", Grid1_empowerer_Gridinternalname);
      subGrid1_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   private void e1429T2( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      AV46UserAction1 = httpContext.getMessage( "Deletar", "") ;
      httpContext.ajax_rsp_assign_attri("", false, edtavUseraction1_Internalname, AV46UserAction1);
      /*  Sending Event outputs  */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV39TextoSeparador = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39TextoSeparador", AV39TextoSeparador);
      AV32parametroCorreosDestinoJson = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32parametroCorreosDestinoJson", AV32parametroCorreosDestinoJson);
      AV29parametroCorreosCopiaJson = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29parametroCorreosCopiaJson", AV29parametroCorreosCopiaJson);
      AV30parametroCorreosCopiaOcultaJson = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30parametroCorreosCopiaOcultaJson", AV30parametroCorreosCopiaOcultaJson);
      AV28parametroAsunto = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28parametroAsunto", AV28parametroAsunto);
      AV33parametroTextoCorreo = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33parametroTextoCorreo", AV33parametroTextoCorreo);
      AV27NombresAdjuntosJson = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27NombresAdjuntosJson", AV27NombresAdjuntosJson);
      AV23MostrarMail = ((Boolean) getParm(obj,7)).booleanValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23MostrarMail", AV23MostrarMail);
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
      pa29T2( ) ;
      ws29T2( ) ;
      we29T2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016453858", true, true);
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
      httpContext.AddJavascriptSource("enviarcorreomodal.js", "?202661016453859", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManager.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/json2005.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/rsh/rsh.js", "", false, true);
      httpContext.AddJavascriptSource("Shared/HistoryManager/HistoryManagerCreate.js", "", false, true);
      httpContext.AddJavascriptSource("Tab/TabRender.js", "", false, true);
      httpContext.AddJavascriptSource("CKEditor/ckeditor/ckeditor.js", "", false, true);
      httpContext.AddJavascriptSource("CKEditor/CKEditorRender.js", "", false, true);
      httpContext.AddJavascriptSource("FileUpload/fileupload.min.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_742( )
   {
      edtavFileuploaddata_fullname_Internalname = "FILEUPLOADDATA_FULLNAME_"+sGXsfl_74_idx ;
      edtavFileuploaddata_name_Internalname = "FILEUPLOADDATA_NAME_"+sGXsfl_74_idx ;
      edtavFileuploaddata_extension_Internalname = "FILEUPLOADDATA_EXTENSION_"+sGXsfl_74_idx ;
      edtavFileuploaddata_size_Internalname = "FILEUPLOADDATA_SIZE_"+sGXsfl_74_idx ;
      edtavFileuploaddata_file_Internalname = "FILEUPLOADDATA_FILE_"+sGXsfl_74_idx ;
      edtavUseraction1_Internalname = "vUSERACTION1_"+sGXsfl_74_idx ;
   }

   public void subsflControlProps_fel_742( )
   {
      edtavFileuploaddata_fullname_Internalname = "FILEUPLOADDATA_FULLNAME_"+sGXsfl_74_fel_idx ;
      edtavFileuploaddata_name_Internalname = "FILEUPLOADDATA_NAME_"+sGXsfl_74_fel_idx ;
      edtavFileuploaddata_extension_Internalname = "FILEUPLOADDATA_EXTENSION_"+sGXsfl_74_fel_idx ;
      edtavFileuploaddata_size_Internalname = "FILEUPLOADDATA_SIZE_"+sGXsfl_74_fel_idx ;
      edtavFileuploaddata_file_Internalname = "FILEUPLOADDATA_FILE_"+sGXsfl_74_fel_idx ;
      edtavUseraction1_Internalname = "vUSERACTION1_"+sGXsfl_74_fel_idx ;
   }

   public void sendrow_742( )
   {
      subsflControlProps_742( ) ;
      wb29T0( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_74_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_74_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_74_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploaddata_fullname_Internalname,GXutil.rtrim( AV43FileUploadData.getgxTv_SdtFileUploadData_Fullname()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploaddata_fullname_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFileuploaddata_fullname_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploaddata_name_Internalname,GXutil.rtrim( AV43FileUploadData.getgxTv_SdtFileUploadData_Name()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploaddata_name_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFileuploaddata_name_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploaddata_extension_Internalname,GXutil.rtrim( AV43FileUploadData.getgxTv_SdtFileUploadData_Extension()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploaddata_extension_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFileuploaddata_extension_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFileuploaddata_size_Internalname,GXutil.ltrim( localUtil.ntoc( AV43FileUploadData.getgxTv_SdtFileUploadData_Size(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFileuploaddata_size_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV43FileUploadData.getgxTv_SdtFileUploadData_Size()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV43FileUploadData.getgxTv_SdtFileUploadData_Size()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFileuploaddata_size_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavFileuploaddata_size_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         ClassString = "Attribute" ;
         StyleString = "" ;
         edtavFileuploaddata_file_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_file_Internalname, "Filetype", edtavFileuploaddata_file_Filetype, !bGXsfl_74_Refreshing);
         if ( ! (GXutil.strcmp("", AV43FileUploadData.getgxTv_SdtFileUploadData_File())==0) )
         {
            gxblobfileaux.setSource( AV43FileUploadData.getgxTv_SdtFileUploadData_File() );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavFileuploaddata_file_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavFileuploaddata_file_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               AV43FileUploadData.setgxTv_SdtFileUploadData_File( gxblobfileaux.getURI() );
               edtavFileuploaddata_file_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_file_Internalname, "Filetype", edtavFileuploaddata_file_Filetype, !bGXsfl_74_Refreshing);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop("", false, edtavFileuploaddata_file_Internalname, "URL", httpContext.getResourceRelative(AV43FileUploadData.getgxTv_SdtFileUploadData_File()), !bGXsfl_74_Refreshing);
         }
         Grid1Row.AddColumnProperties("blob", 2, isAjaxCallMode( ), new Object[] {edtavFileuploaddata_file_Internalname,GXutil.rtrim( AV43FileUploadData.getgxTv_SdtFileUploadData_File()),httpContext.getResourceRelative(AV43FileUploadData.getgxTv_SdtFileUploadData_File()),((GXutil.strcmp("", edtavFileuploaddata_file_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavFileuploaddata_file_Filetype)==0) ? AV43FileUploadData.getgxTv_SdtFileUploadData_File() : edtavFileuploaddata_file_Filetype)) : edtavFileuploaddata_file_Contenttype),Boolean.valueOf(false),"",edtavFileuploaddata_file_Parameters,Integer.valueOf(0),Integer.valueOf(edtavFileuploaddata_file_Enabled),Integer.valueOf(0),"","",Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(60),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),edtavFileuploaddata_file_Jsonclick,"'"+""+"'"+",false,"+"'"+""+"'",StyleString,ClassString,"WWColumn","",""+"","",""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUseraction1_Internalname,GXutil.rtrim( AV46UserAction1),"","","'"+""+"'"+",false,"+"'"+""+"'","","",httpContext.getMessage( "Clique aqui para deletar", ""),"",edtavUseraction1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavUseraction1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(74),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes29T2( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_74_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_74_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_74_idx+1) ;
         sGXsfl_74_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_74_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_742( ) ;
      }
      /* End function sendrow_742 */
   }

   public void startgridcontrol74( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"74\">") ;
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
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV43FileUploadData.getgxTv_SdtFileUploadData_Fullname()));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploaddata_fullname_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV43FileUploadData.getgxTv_SdtFileUploadData_Name()));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploaddata_name_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV43FileUploadData.getgxTv_SdtFileUploadData_Extension()));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploaddata_extension_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV43FileUploadData.getgxTv_SdtFileUploadData_Size(), (byte)(10), (byte)(0), ".", "")));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploaddata_size_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", AV43FileUploadData.getgxTv_SdtFileUploadData_File());
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFileuploaddata_file_Enabled, (byte)(5), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV46UserAction1));
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
      lblTab1_title_Internalname = "TAB1_TITLE" ;
      edtavNombredestino_Internalname = "vNOMBREDESTINO" ;
      edtavDestinoemail_Internalname = "vDESTINOEMAIL" ;
      edtavCcemail_Internalname = "vCCEMAIL" ;
      edtavAsunto_Internalname = "vASUNTO" ;
      Textocorreomostrar_Internalname = "TEXTOCORREOMOSTRAR" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      bttBtnenviarcorreo_Internalname = "BTNENVIARCORREO" ;
      divTablaacciones_Internalname = "TABLAACCIONES" ;
      divTabladatoscorreo_Internalname = "TABLADATOSCORREO" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      lblTab3_title_Internalname = "TAB3_TITLE" ;
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
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTab2_title_Internalname = "TAB2_TITLE" ;
      edtavCodigoerrorenvio_Internalname = "vCODIGOERRORENVIO" ;
      edtavDescripcionerrorenvio_Internalname = "vDESCRIPCIONERRORENVIO" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Gxuitabspanel_tabs1_Internalname = "GXUITABSPANEL_TABS1" ;
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
      Textocorreomostrar_Enabled = GXutil.toBoolean( 1) ;
      edtavAsunto_Jsonclick = "" ;
      edtavAsunto_Enabled = 1 ;
      edtavCcemail_Jsonclick = "" ;
      edtavCcemail_Enabled = 1 ;
      edtavDestinoemail_Jsonclick = "" ;
      edtavDestinoemail_Enabled = 1 ;
      edtavNombredestino_Jsonclick = "" ;
      edtavNombredestino_Enabled = 1 ;
      Gxuitabspanel_tabs1_Historymanagement = GXutil.toBoolean( 0) ;
      Gxuitabspanel_tabs1_Class = "" ;
      Gxuitabspanel_tabs1_Pagecount = 3 ;
      Upload_Autodisableaddingfiles = GXutil.toBoolean( 0) ;
      Upload_Maxnumberoffiles = 10 ;
      Upload_Tooltiptext = "Enviar el modelo" ;
      Upload_Hideadditionalbuttons = GXutil.toBoolean( -1) ;
      Upload_Autoupload = GXutil.toBoolean( -1) ;
      Textocorreomostrar_Captionposition = "None" ;
      Textocorreomostrar_Captionstyle = "" ;
      Textocorreomostrar_Captionclass = "col-sm-3 AttributeLabel" ;
      Textocorreomostrar_Toolbar = "Basic" ;
      Textocorreomostrar_Height = "350" ;
      Textocorreomostrar_Width = "100%" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID1.LOAD","{handler:'e1429T2',iparms:[]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV46UserAction1',fld:'vUSERACTION1',pic:''}]}");
      setEventMetadata("'DOELIMINARADJUNTOS'","{handler:'e1229T1',iparms:[]");
      setEventMetadata("'DOELIMINARADJUNTOS'",",oparms:[]}");
      setEventMetadata("'DOENVIARCORREO'","{handler:'e1129T1',iparms:[]");
      setEventMetadata("'DOENVIARCORREO'",",oparms:[]}");
      setEventMetadata("GRID1_FIRSTPAGE","{handler:'subgrid1_firstpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'}]");
      setEventMetadata("GRID1_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_PREVPAGE","{handler:'subgrid1_previouspage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'}]");
      setEventMetadata("GRID1_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID1_NEXTPAGE","{handler:'subgrid1_nextpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'}]");
      setEventMetadata("GRID1_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID1_LASTPAGE","{handler:'subgrid1_lastpage',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'}]");
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
      wcpOAV39TextoSeparador = "" ;
      wcpOAV32parametroCorreosDestinoJson = "" ;
      wcpOAV29parametroCorreosCopiaJson = "" ;
      wcpOAV30parametroCorreosCopiaOcultaJson = "" ;
      wcpOAV28parametroAsunto = "" ;
      wcpOAV33parametroTextoCorreo = "" ;
      wcpOAV27NombresAdjuntosJson = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV39TextoSeparador = "" ;
      AV32parametroCorreosDestinoJson = "" ;
      AV29parametroCorreosCopiaJson = "" ;
      AV30parametroCorreosCopiaOcultaJson = "" ;
      AV28parametroAsunto = "" ;
      AV33parametroTextoCorreo = "" ;
      AV27NombresAdjuntosJson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV43FileUploadData = new app.SdtFileUploadData(remoteHandle, context);
      AV38TextoCorreoMostrar = "" ;
      AV45UploadedFiles = new GXBaseCollection<app.SdtFileUploadData>(app.SdtFileUploadData.class, "FileUploadData", "TexplusNET", remoteHandle);
      AV42FailedFiles = new GXBaseCollection<app.SdtFileUploadData>(app.SdtFileUploadData.class, "FileUploadData", "TexplusNET", remoteHandle);
      Grid1_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucGxuitabspanel_tabs1 = new com.genexus.webpanels.GXUserControl();
      lblTab1_title_Jsonclick = "" ;
      TempTags = "" ;
      AV25NombreDestino = "" ;
      AV16DestinoEmail = "" ;
      AV47CcEmail = "" ;
      AV7Asunto = "" ;
      ucTextocorreomostrar = new com.genexus.webpanels.GXUserControl();
      bttBtnenviarcorreo_Jsonclick = "" ;
      lblTab3_title_Jsonclick = "" ;
      AV24NombreArchivo = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucUpload = new com.genexus.webpanels.GXUserControl();
      bttBtneliminaradjuntos_Jsonclick = "" ;
      lblTab2_title_Jsonclick = "" ;
      AV15DescripcionErrorEnvio = "" ;
      ucGrid1_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV46UserAction1 = "" ;
      AV36Station = "" ;
      GXt_char1 = "" ;
      AV18EmprCod = "" ;
      GXv_char2 = new String[1] ;
      AV19EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV40UsurCod = "" ;
      GXv_char4 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      subGrid1_Linesclass = "" ;
      ROClassString = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
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
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int nRC_GXsfl_74 ;
   private int subGrid1_Rows ;
   private int nGXsfl_74_idx=1 ;
   private int Upload_Maxnumberoffiles ;
   private int Gxuitabspanel_tabs1_Pagecount ;
   private int edtavNombredestino_Enabled ;
   private int edtavDestinoemail_Enabled ;
   private int edtavCcemail_Enabled ;
   private int edtavAsunto_Enabled ;
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
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private long GRID1_nFirstRecordOnPage ;
   private long AV10CodigoErrorEnvio ;
   private long GRID1_nCurrentRecord ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_74_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Textocorreomostrar_Width ;
   private String Textocorreomostrar_Height ;
   private String Textocorreomostrar_Toolbar ;
   private String Textocorreomostrar_Captionclass ;
   private String Textocorreomostrar_Captionstyle ;
   private String Textocorreomostrar_Captionposition ;
   private String Upload_Tooltiptext ;
   private String Gxuitabspanel_tabs1_Class ;
   private String Grid1_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablemains_Internalname ;
   private String Gxuitabspanel_tabs1_Internalname ;
   private String lblTab1_title_Internalname ;
   private String lblTab1_title_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
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
   private String divUnnamedtable6_Internalname ;
   private String Textocorreomostrar_Internalname ;
   private String divTablaacciones_Internalname ;
   private String bttBtnenviarcorreo_Internalname ;
   private String bttBtnenviarcorreo_Jsonclick ;
   private String lblTab3_title_Internalname ;
   private String lblTab3_title_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavNombrearchivo_Internalname ;
   private String edtavNombrearchivo_Jsonclick ;
   private String divTableupload_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String Upload_Internalname ;
   private String bttBtneliminaradjuntos_Internalname ;
   private String bttBtneliminaradjuntos_Jsonclick ;
   private String lblTab2_title_Internalname ;
   private String lblTab2_title_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
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
   private String AV46UserAction1 ;
   private String edtavUseraction1_Internalname ;
   private String AV36Station ;
   private String GXt_char1 ;
   private String AV18EmprCod ;
   private String GXv_char2[] ;
   private String AV19EmprNom ;
   private String GXv_char3[] ;
   private String AV40UsurCod ;
   private String GXv_char4[] ;
   private String sGXsfl_74_fel_idx="0001" ;
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
   private boolean wcpOAV23MostrarMail ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV23MostrarMail ;
   private boolean Textocorreomostrar_Enabled ;
   private boolean Upload_Autoupload ;
   private boolean Upload_Hideadditionalbuttons ;
   private boolean Upload_Autodisableaddingfiles ;
   private boolean Gxuitabspanel_tabs1_Historymanagement ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_74_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private String wcpOAV33parametroTextoCorreo ;
   private String AV33parametroTextoCorreo ;
   private String AV38TextoCorreoMostrar ;
   private String wcpOAV39TextoSeparador ;
   private String wcpOAV32parametroCorreosDestinoJson ;
   private String wcpOAV29parametroCorreosCopiaJson ;
   private String wcpOAV30parametroCorreosCopiaOcultaJson ;
   private String wcpOAV28parametroAsunto ;
   private String wcpOAV27NombresAdjuntosJson ;
   private String AV39TextoSeparador ;
   private String AV32parametroCorreosDestinoJson ;
   private String AV29parametroCorreosCopiaJson ;
   private String AV30parametroCorreosCopiaOcultaJson ;
   private String AV28parametroAsunto ;
   private String AV27NombresAdjuntosJson ;
   private String AV25NombreDestino ;
   private String AV16DestinoEmail ;
   private String AV47CcEmail ;
   private String AV7Asunto ;
   private String AV24NombreArchivo ;
   private String AV15DescripcionErrorEnvio ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGxuitabspanel_tabs1 ;
   private com.genexus.webpanels.GXUserControl ucTextocorreomostrar ;
   private com.genexus.webpanels.GXUserControl ucUpload ;
   private com.genexus.webpanels.GXUserControl ucGrid1_empowerer ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtFileUploadData> AV45UploadedFiles ;
   private GXBaseCollection<app.SdtFileUploadData> AV42FailedFiles ;
   private app.SdtFileUploadData AV43FileUploadData ;
}

