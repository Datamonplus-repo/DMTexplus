package app.wwpbaseobjects ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwp_selectimportfile_impl extends GXDataArea
{
   public wwp_selectimportfile_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwp_selectimportfile_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwp_selectimportfile_impl.class ));
   }

   public wwp_selectimportfile_impl( int remoteHandle ,
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
         gxfirstwebparm = httpContext.GetFirstPar( "TransactionName") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "TransactionName") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "TransactionName") ;
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
            AV13TransactionName = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13TransactionName", AV13TransactionName);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRANSACTIONNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13TransactionName, ""))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV8ImportType = httpContext.GetPar( "ImportType") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8ImportType", AV8ImportType);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPORTTYPE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8ImportType, ""))));
               AV6ExtraParmsJson = httpContext.GetPar( "ExtraParmsJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6ExtraParmsJson", AV6ExtraParmsJson);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEXTRAPARMSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6ExtraParmsJson, ""))));
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
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpageprompt");
         MasterPageObj.setDataArea(this,true);
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
      pa11Y2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start11Y2( ) ;
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
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeText( " "+"class=\"form-horizontal FormNoBackgroundColor\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormNoBackgroundColor\" data-gx-class=\"form-horizontal FormNoBackgroundColor\" novalidate action=\""+formatLink("app.wwpbaseobjects.wwp_selectimportfile", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13TransactionName)),GXutil.URLEncode(GXutil.rtrim(AV8ImportType)),GXutil.URLEncode(GXutil.rtrim(AV6ExtraParmsJson))}, new String[] {"TransactionName","ImportType","ExtraParmsJson"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal FormNoBackgroundColor", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPORTTYPE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8ImportType, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRORMSGS", getSecureSignedToken( "", AV5ErrorMsgs));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEXTRAPARMSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6ExtraParmsJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRANSACTIONNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13TransactionName, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPORTTYPE", AV8ImportType);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPORTTYPE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8ImportType, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vERRORMSGS", AV5ErrorMsgs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vERRORMSGS", AV5ErrorMsgs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRORMSGS", getSecureSignedToken( "", AV5ErrorMsgs));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXTRAPARMSJSON", AV6ExtraParmsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEXTRAPARMSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6ExtraParmsJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTRANSACTIONNAME", AV13TransactionName);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRANSACTIONNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13TransactionName, ""))));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vRET", AV12Ret);
      GXCCtlgxBlob = "vFILTERTOUPLOAD" + "_gxBlob" ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtlgxBlob, AV7FilterToUpload);
      app.GxWebStd.gx_hidden_field( httpContext, "vFILTERTOUPLOAD_Filename", GXutil.rtrim( edtavFiltertoupload_Filename));
      app.GxWebStd.gx_hidden_field( httpContext, "vFILTERTOUPLOAD_Filename", GXutil.rtrim( edtavFiltertoupload_Filename));
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
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal FormNoBackgroundColor" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we11Y2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt11Y2( ) ;
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
      return formatLink("app.wwpbaseobjects.wwp_selectimportfile", new String[] {GXutil.URLEncode(GXutil.rtrim(AV13TransactionName)),GXutil.URLEncode(GXutil.rtrim(AV8ImportType)),GXutil.URLEncode(GXutil.rtrim(AV6ExtraParmsJson))}, new String[] {"TransactionName","ImportType","ExtraParmsJson"})  ;
   }

   public String getPgmname( )
   {
      return "WWPBaseObjects.WWP_SelectImportFile" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Select file to import", "") ;
   }

   public void wb11Y0( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableTransactionTemplate", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainTransactionPopUp", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6 DataContentCell AttributeImportFileCell DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFiltertoupload_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFiltertoupload_Internalname, httpContext.getMessage( "File", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         edtavFiltertoupload_Filetype = "tmp" ;
         httpContext.ajax_rsp_assign_prop("", false, edtavFiltertoupload_Internalname, "Filetype", edtavFiltertoupload_Filetype, true);
         if ( ! (GXutil.strcmp("", AV7FilterToUpload)==0) )
         {
            gxblobfileaux.setSource( AV7FilterToUpload );
            if ( ! gxblobfileaux.hasExtension() || ( GXutil.strcmp(edtavFiltertoupload_Filetype, "tmp") != 0 ) )
            {
               gxblobfileaux.setExt(GXutil.trim( edtavFiltertoupload_Filetype));
            }
            if ( gxblobfileaux.getErrCode() == 0 )
            {
               AV7FilterToUpload = gxblobfileaux.getURI() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavFiltertoupload_Internalname, "URL", httpContext.getResourceRelative(AV7FilterToUpload), true);
               edtavFiltertoupload_Filetype = gxblobfileaux.getExtension() ;
               httpContext.ajax_rsp_assign_prop("", false, edtavFiltertoupload_Internalname, "Filetype", edtavFiltertoupload_Filetype, true);
               gxblobfileaux.setBlobToDelete();
            }
            httpContext.ajax_rsp_assign_prop("", false, edtavFiltertoupload_Internalname, "URL", httpContext.getResourceRelative(AV7FilterToUpload), true);
         }
         app.GxWebStd.gx_blob_field( httpContext, edtavFiltertoupload_Internalname, GXutil.rtrim( AV7FilterToUpload), httpContext.getResourceRelative(AV7FilterToUpload), ((GXutil.strcmp("", edtavFiltertoupload_Contenttype)==0) ? com.genexus.internet.HttpResponse.getContentType(((GXutil.strcmp("", edtavFiltertoupload_Filetype)==0) ? AV7FilterToUpload : edtavFiltertoupload_Filetype)) : edtavFiltertoupload_Contenttype), false, "", edtavFiltertoupload_Parameters, 0, edtavFiltertoupload_Enabled, 1, "", "", 0, -1, 250, "px", 60, "px", 0, 0, 0, edtavFiltertoupload_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", StyleString, ClassString, "", "", ""+TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,17);\"", "", "", "HLP_WWPBaseObjects\\WWP_SelectImportFile.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupRight", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "", httpContext.getMessage( "Import", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWPBaseObjects\\WWP_SelectImportFile.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnucancel_Internalname, "", httpContext.getMessage( "Cancel", ""), bttBtnucancel_Jsonclick, 5, httpContext.getMessage( "Cancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUCANCEL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WWPBaseObjects\\WWP_SelectImportFile.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start11Y2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Select file to import", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup11Y0( ) ;
   }

   public void ws11Y2( )
   {
      start11Y2( ) ;
      evt11Y2( ) ;
   }

   public void evt11Y2( )
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
                        else if ( GXutil.strcmp(sEvt, "START") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Start */
                           e1111Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUCANCEL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUCancel' */
                           e1211Y2 ();
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
                                 e1311Y2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Refresh */
                           e1411Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e1511Y2 ();
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
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we11Y2( )
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

   public void pa11Y2( )
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
            GX_FocusControl = edtavFiltertoupload_Internalname ;
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf11Y2( ) ;
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
   }

   public void rf11Y2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      /* Execute user event: Refresh */
      e1411Y2 ();
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e1511Y2 ();
         wb11Y0( ) ;
      }
   }

   public void send_integrity_lvl_hashes11Y2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPORTTYPE", AV8ImportType);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPORTTYPE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8ImportType, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vERRORMSGS", AV5ErrorMsgs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vERRORMSGS", AV5ErrorMsgs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vERRORMSGS", getSecureSignedToken( "", AV5ErrorMsgs));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXTRAPARMSJSON", AV6ExtraParmsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEXTRAPARMSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6ExtraParmsJson, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vTRANSACTIONNAME", AV13TransactionName);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRANSACTIONNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13TransactionName, ""))));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup11Y0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1111Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         edtavFiltertoupload_Filename = httpContext.cgiGet( "vFILTERTOUPLOAD_Filename") ;
         /* Read variables values. */
         AV7FilterToUpload = httpContext.cgiGet( edtavFiltertoupload_Internalname) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         if ( (GXutil.strcmp("", AV7FilterToUpload)==0) )
         {
            GXCCtlgxBlob = "vFILTERTOUPLOAD" + "_gxBlob" ;
            AV7FilterToUpload = httpContext.cgiGet( GXCCtlgxBlob) ;
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e1111Y2 ();
      if (returnInSub) return;
   }

   public void e1111Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV17Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wwp_selectimportfile_impl.this.GXt_char1 = GXv_char2[0] ;
      AV17Station = GXt_char1 ;
      GXv_char2[0] = AV18Emprcod ;
      GXv_char3[0] = AV19Emprnom ;
      GXv_char4[0] = AV20Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV17Station, GXv_char2, GXv_char3, GXv_char4) ;
      wwp_selectimportfile_impl.this.AV18Emprcod = GXv_char2[0] ;
      wwp_selectimportfile_impl.this.AV19Emprnom = GXv_char3[0] ;
      wwp_selectimportfile_impl.this.AV20Usurcod = GXv_char4[0] ;
   }

   public void e1211Y2( )
   {
      /* 'DoUCancel' Routine */
      returnInSub = false ;
      httpContext.GX_msglist.addItem("<#CLEAR#>");
      AV12Ret = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Ret", AV12Ret);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1311Y2 ();
      if (returnInSub) return;
   }

   public void e1311Y2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV14FilterToUploadExt = edtavFiltertoupload_Filename ;
      AV14FilterToUploadExt = ((GXutil.strSearch( AV14FilterToUploadExt, ".", 1)>0) ? GXutil.substring( AV14FilterToUploadExt, GXutil.strSearchRev( AV14FilterToUploadExt, ".", -1)+1, GXutil.len( AV14FilterToUploadExt)-GXutil.strSearchRev( AV14FilterToUploadExt, ".", -1)) : "") ;
      httpContext.GX_msglist.addItem("<#CLEAR#>");
      if ( ! (GXutil.strcmp("", AV7FilterToUpload)==0) )
      {
         if ( ( ( GXutil.strcmp(GXutil.upper( AV14FilterToUploadExt), "CSV") == 0 ) && ( GXutil.strcmp(AV8ImportType, "CSV") == 0 ) ) || ( ( GXutil.strcmp(GXutil.upper( AV14FilterToUploadExt), "XLSX") == 0 ) && ( GXutil.strcmp(AV8ImportType, "Excel") == 0 ) ) )
         {
            AV11ResultMsg = "" ;
            GXv_objcol_SdtMessages_Message5[0] = AV5ErrorMsgs ;
            if ( new app.wwpbaseobjects.wwp_importdata(remoteHandle, context).executeUdp( AV13TransactionName, AV8ImportType, AV7FilterToUpload, AV6ExtraParmsJson, GXv_objcol_SdtMessages_Message5) )
            {
               Cond_result = true ;
            }
            else
            {
               Cond_result = false ;
            }
            AV5ErrorMsgs = GXv_objcol_SdtMessages_Message5[0] ;
            if ( Cond_result )
            {
               AV9LastErrorType = (byte)(2) ;
               AV21GXV1 = 1 ;
               while ( AV21GXV1 <= AV5ErrorMsgs.size() )
               {
                  AV10Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV5ErrorMsgs.elementAt(-1+AV21GXV1));
                  if ( ! (GXutil.strcmp("", AV11ResultMsg)==0) )
                  {
                     AV11ResultMsg += GXutil.newLine( ) ;
                     if ( ( AV9LastErrorType == 0 ) && ( AV10Message.getgxTv_SdtMessages_Message_Type() == 2 ) )
                     {
                        AV11ResultMsg += GXutil.newLine( ) ;
                     }
                  }
                  AV9LastErrorType = AV10Message.getgxTv_SdtMessages_Message_Type() ;
                  AV11ResultMsg += AV10Message.getgxTv_SdtMessages_Message_Description() ;
                  AV21GXV1 = (int)(AV21GXV1+1) ;
               }
               httpContext.GX_msglist.addItem(new app.wwpbaseobjects.dvmessagegetbasicnotificationmsg(remoteHandle, context).executeUdp( httpContext.getMessage( "File import success", ""), AV11ResultMsg, "success", "", "na", ""));
               AV12Ret = true ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12Ret", AV12Ret);
               httpContext.doAjaxRefresh();
            }
            else
            {
               AV7FilterToUpload = "" ;
               httpContext.ajax_rsp_assign_prop("", false, edtavFiltertoupload_Internalname, "URL", httpContext.getResourceRelative(AV7FilterToUpload), true);
               AV22GXV2 = 1 ;
               while ( AV22GXV2 <= AV5ErrorMsgs.size() )
               {
                  AV10Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV5ErrorMsgs.elementAt(-1+AV22GXV2));
                  if ( ! (GXutil.strcmp("", AV11ResultMsg)==0) )
                  {
                     AV11ResultMsg += GXutil.newLine( ) ;
                     if ( GXutil.strcmp(AV10Message.getgxTv_SdtMessages_Message_Id(), "WWP_LineId") == 0 )
                     {
                        AV11ResultMsg += GXutil.newLine( ) ;
                     }
                  }
                  AV11ResultMsg += AV10Message.getgxTv_SdtMessages_Message_Description() ;
                  AV22GXV2 = (int)(AV22GXV2+1) ;
               }
               httpContext.GX_msglist.addItem(new app.wwpbaseobjects.dvmessagegetbasicnotificationmsg(remoteHandle, context).executeUdp( httpContext.getMessage( "Error importing file", ""), AV11ResultMsg, "error", "", "false", ""));
            }
         }
         else
         {
            AV7FilterToUpload = "" ;
            httpContext.ajax_rsp_assign_prop("", false, edtavFiltertoupload_Internalname, "URL", httpContext.getResourceRelative(AV7FilterToUpload), true);
            AV11ResultMsg = GXutil.format( httpContext.getMessage( "The expected file type is %1.", ""), ((GXutil.strcmp(AV8ImportType, "CSV")==0) ? "csv" : "xlsx"), "", "", "", "", "", "", "", "") ;
            httpContext.GX_msglist.addItem(new app.wwpbaseobjects.dvmessagegetbasicnotificationmsg(remoteHandle, context).executeUdp( httpContext.getMessage( "Invalid file type", ""), AV11ResultMsg, "error", "", "na", ""));
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(GXutil.format( httpContext.getMessage( "WWP_RequiredAttribute", ""), httpContext.getMessage( "File", ""), "", "", "", "", "", "", "", ""));
      }
      /*  Sending Event outputs  */
   }

   public void e1411Y2( )
   {
      /* Refresh Routine */
      returnInSub = false ;
      if ( AV12Ret )
      {
         httpContext.setWebReturnParms(new Object[] {AV13TransactionName,AV8ImportType,AV6ExtraParmsJson});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV13TransactionName","AV8ImportType","AV6ExtraParmsJson"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   protected void nextLoad( )
   {
   }

   protected void e1511Y2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV13TransactionName = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13TransactionName", AV13TransactionName);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTRANSACTIONNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV13TransactionName, ""))));
      AV8ImportType = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8ImportType", AV8ImportType);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vIMPORTTYPE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8ImportType, ""))));
      AV6ExtraParmsJson = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6ExtraParmsJson", AV6ExtraParmsJson);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEXTRAPARMSJSON", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV6ExtraParmsJson, ""))));
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
      pa11Y2( ) ;
      ws11Y2( ) ;
      we11Y2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016423825", true, true);
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
      httpContext.AddJavascriptSource("wwpbaseobjects/wwp_selectimportfile.js", "?202661016423825", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      edtavFiltertoupload_Internalname = "vFILTERTOUPLOAD" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnucancel_Internalname = "BTNUCANCEL" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      edtavFiltertoupload_Jsonclick = "" ;
      edtavFiltertoupload_Parameters = "" ;
      edtavFiltertoupload_Contenttype = "" ;
      edtavFiltertoupload_Filetype = "" ;
      edtavFiltertoupload_Enabled = 1 ;
      edtavFiltertoupload_Filename = "" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Select file to import", "") );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV12Ret',fld:'vRET',pic:''},{av:'AV5ErrorMsgs',fld:'vERRORMSGS',pic:'',hsh:true},{av:'AV8ImportType',fld:'vIMPORTTYPE',pic:'',hsh:true},{av:'AV6ExtraParmsJson',fld:'vEXTRAPARMSJSON',pic:'',hsh:true},{av:'AV13TransactionName',fld:'vTRANSACTIONNAME',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOUCANCEL'","{handler:'e1211Y2',iparms:[]");
      setEventMetadata("'DOUCANCEL'",",oparms:[{av:'AV12Ret',fld:'vRET',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e1311Y2',iparms:[{av:'edtavFiltertoupload_Filename',ctrl:'vFILTERTOUPLOAD',prop:'Filename'},{av:'AV7FilterToUpload',fld:'vFILTERTOUPLOAD',pic:''},{av:'AV8ImportType',fld:'vIMPORTTYPE',pic:'',hsh:true},{av:'AV5ErrorMsgs',fld:'vERRORMSGS',pic:'',hsh:true},{av:'AV6ExtraParmsJson',fld:'vEXTRAPARMSJSON',pic:'',hsh:true},{av:'AV13TransactionName',fld:'vTRANSACTIONNAME',pic:'',hsh:true}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV12Ret',fld:'vRET',pic:''},{av:'AV7FilterToUpload',fld:'vFILTERTOUPLOAD',pic:''}]}");
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
      wcpOAV13TransactionName = "" ;
      wcpOAV8ImportType = "" ;
      wcpOAV6ExtraParmsJson = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV13TransactionName = "" ;
      AV8ImportType = "" ;
      AV6ExtraParmsJson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV5ErrorMsgs = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      GXKey = "" ;
      GXCCtlgxBlob = "" ;
      AV7FilterToUpload = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      gxblobfileaux = new com.genexus.util.GXFile();
      bttBtnenter_Jsonclick = "" ;
      bttBtnucancel_Jsonclick = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV17Station = "" ;
      GXt_char1 = "" ;
      AV18Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV19Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV20Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV14FilterToUploadExt = "" ;
      AV11ResultMsg = "" ;
      GXv_objcol_SdtMessages_Message5 = new GXBaseCollection[1] ;
      AV10Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte AV9LastErrorType ;
   private byte nGXWrapped ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int edtavFiltertoupload_Enabled ;
   private int AV21GXV1 ;
   private int AV22GXV2 ;
   private int idxLst ;
   private String edtavFiltertoupload_Filename ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String GXCCtlgxBlob ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTableattributes_Internalname ;
   private String edtavFiltertoupload_Internalname ;
   private String TempTags ;
   private String edtavFiltertoupload_Filetype ;
   private String edtavFiltertoupload_Contenttype ;
   private String edtavFiltertoupload_Parameters ;
   private String edtavFiltertoupload_Jsonclick ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnucancel_Internalname ;
   private String bttBtnucancel_Jsonclick ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV17Station ;
   private String GXt_char1 ;
   private String AV18Emprcod ;
   private String GXv_char2[] ;
   private String AV19Emprnom ;
   private String GXv_char3[] ;
   private String AV20Usurcod ;
   private String GXv_char4[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV12Ret ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean Cond_result ;
   private String AV7FilterToUpload ;
   private String wcpOAV13TransactionName ;
   private String wcpOAV8ImportType ;
   private String wcpOAV6ExtraParmsJson ;
   private String AV13TransactionName ;
   private String AV8ImportType ;
   private String AV6ExtraParmsJson ;
   private String AV14FilterToUploadExt ;
   private String AV11ResultMsg ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.util.GXFile gxblobfileaux ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV5ErrorMsgs ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> GXv_objcol_SdtMessages_Message5[] ;
   private com.genexus.SdtMessages_Message AV10Message ;
}

