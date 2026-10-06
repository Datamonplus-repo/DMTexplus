package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwatdc01_impl extends GXDataArea
{
   public webwatdc01_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwatdc01_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwatdc01_impl.class ));
   }

   public webwatdc01_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavTipoguia = new HTMLChoice();
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
            A396EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV57TipoGuia = (byte)(GXutil.lval( httpContext.GetPar( "TipoGuia"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV57TipoGuia", GXutil.str( AV57TipoGuia, 1, 0));
               AV9AlbProcod = GXutil.lval( httpContext.GetPar( "AlbProcod")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbProcod), 10, 0));
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
      paXO2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startXO2( ) ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwatdc01", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV57TipoGuia,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbProcod,10,0))}, new String[] {"EmprCod","TipoGuia","AlbProcod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vCALPRD", GXutil.ltrim( localUtil.ntoc( AV14Calprd, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALCOM", GXutil.ltrim( localUtil.ntoc( AV13Calcom, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVGEN", GXutil.ltrim( localUtil.ntoc( AV21DevGen, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCESTSA", GXutil.ltrim( localUtil.ntoc( AV16Cestsa, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALPRO", GXutil.ltrim( localUtil.ntoc( AV15Calpro, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBLIC", GXutil.rtrim( AV8ALbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHORSAL", GXutil.rtrim( A3865AlbHorSal));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBFECSAL", localUtil.dtoc( A4023AlbFecSal, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBHHFM", localUtil.ttoc( A10019AlbHhfm, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "GUIREMCLI", GXutil.ltrim( localUtil.ntoc( A1243GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBLIC", GXutil.rtrim( A7101AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCOD", GXutil.ltrim( localUtil.ntoc( A30AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMHOR", localUtil.ttoc( A4829AlbComHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMFS", localUtil.ttoc( A10013AlbComFs, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMID", GXutil.rtrim( A10740AlbComID));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBCOMCOD", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVHORSAL", localUtil.ttoc( A5348DevHorSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVFHH", localUtil.ttoc( A10073DevFHh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVATCODEI", GXutil.rtrim( A10737DevATCodeI));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVGENCOD", GXutil.ltrim( localUtil.ntoc( A323DevGenCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTHOR", GXutil.rtrim( A6396SalExtHor));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTFEC", localUtil.dtoc( A2256SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "SALFHH", localUtil.ttoc( A10076SalFhh, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "MANNIF", GXutil.rtrim( A3302ManNif));
      app.GxWebStd.gx_hidden_field( httpContext, "SALCODEID", GXutil.rtrim( A10742SalCodeID));
      app.GxWebStd.gx_hidden_field( httpContext, "SALEXTALB", GXutil.ltrim( localUtil.ntoc( A2253SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUSAL", localUtil.ttoc( A11673DevCruSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUDTSY", localUtil.ttoc( A11676DevCruDtSy, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUATID", GXutil.rtrim( A11680DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUID", GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROSAL", localUtil.ttoc( A13429AlbProSal, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROSYS", localUtil.ttoc( A13431AlbProSys, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROPRVI", GXutil.ltrim( localUtil.ntoc( A13419AlbProPrvI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROCLIC", GXutil.ltrim( localUtil.ntoc( A13425AlbProCliC, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROTIPO", GXutil.rtrim( A13417AlbProTipo));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROIDAT", GXutil.rtrim( A13436AlbProIDAT));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBPROID", GXutil.ltrim( localUtil.ntoc( A13418AlbProID, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV17Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINIF", GXutil.rtrim( A278CliNif));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNUM", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRVNUM", GXutil.ltrim( localUtil.ntoc( AV55PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRVNIF", GXutil.rtrim( A793PrvNif));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vREFRESCAR", AV61Refrescar);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETOCOLLECTION", AV60ObjetoCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETOCOLLECTION", AV60ObjetoCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vACCIONCONFIRMADA", AV6AccionConfirmada);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV24EmprCod));
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
         weXO2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtXO2( ) ;
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
      return formatLink("app.webwatdc01", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV57TipoGuia,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9AlbProcod,10,0))}, new String[] {"EmprCod","TipoGuia","AlbProcod"})  ;
   }

   public String getPgmname( )
   {
      return "WebWATDC01" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "ENTRADA MANUAL DEL CODIGO AT", "") ;
   }

   public void wbXO0( )
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
         wb_table1_17_XO2( true) ;
      }
      else
      {
         wb_table1_17_XO2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_XO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
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
      }
      wbLoad = true ;
   }

   public void startXO2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "ENTRADA MANUAL DEL CODIGO AT", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupXO0( ) ;
   }

   public void wsXO2( )
   {
      startXO2( ) ;
      evtXO2( ) ;
   }

   public void evtXO2( )
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
                           e11XO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOESCREVACODIGOAT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEscrevaCodigoAT' */
                           e12XO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GLOBALEVENTS.REFRESCAROBJETO") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13XO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e14XO2 ();
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

   public void weXO2( )
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

   public void paXO2( )
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
            GX_FocusControl = edtavAtcodeid_Internalname ;
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
      if ( cmbavTipoguia.getItemCount() > 0 )
      {
         AV57TipoGuia = (byte)(GXutil.lval( cmbavTipoguia.getValidValue(GXutil.trim( GXutil.str( AV57TipoGuia, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57TipoGuia", GXutil.str( AV57TipoGuia, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavTipoguia.setValue( GXutil.trim( GXutil.str( AV57TipoGuia, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipoguia.getInternalname(), "Values", cmbavTipoguia.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfXO2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV64Pgmname = "WebWATDC01" ;
      Gx_err = (short)(0) ;
      cmbavTipoguia.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipoguia.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavTipoguia.getEnabled(), 5, 0), true);
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
   }

   public void rfXO2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Using cursor H00XO2 */
         pr_default.execute(0, new Object[] {A396EmprCod});
         while ( (pr_default.getStatus(0) != 101) )
         {
            /* Execute user event: Load */
            e14XO2 ();
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         wbXO0( ) ;
      }
   }

   public void send_integrity_lvl_hashesXO2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
   }

   public void before_start_formulas( )
   {
      AV64Pgmname = "WebWATDC01" ;
      Gx_err = (short)(0) ;
      cmbavTipoguia.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavTipoguia.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavTipoguia.getEnabled(), 5, 0), true);
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strupXO0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e11XO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
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
         /* Read variables values. */
         AV9AlbProcod = localUtil.ctol( httpContext.cgiGet( edtavAlbprocod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbProcod), 10, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAtcodeid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAtcodeid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vATCODEID");
            GX_FocusControl = edtavAtcodeid_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12AtCodeID = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12AtCodeID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AtCodeID), 12, 0));
         }
         else
         {
            AV12AtCodeID = localUtil.ctol( httpContext.cgiGet( edtavAtcodeid_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12AtCodeID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AtCodeID), 12, 0));
         }
         AV18CliNif = GXutil.upper( httpContext.cgiGet( edtavClinif_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18CliNif", AV18CliNif);
         AV26FecHhSal = httpContext.cgiGet( edtavFechhsal_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26FecHhSal", AV26FecHhSal);
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavAlbhhfm_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vALBHHFM");
            GX_FocusControl = edtavAlbhhfm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHhfm", localUtil.ttoc( AV7AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV7AlbHhfm = localUtil.ctot( httpContext.cgiGet( edtavAlbhhfm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHhfm", localUtil.ttoc( AV7AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
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
      e11XO2 ();
      if (returnInSub) return;
   }

   public void e11XO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV56Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwatdc01_impl.this.GXt_char1 = GXv_char2[0] ;
      AV56Station = GXt_char1 ;
      GXv_char2[0] = AV24EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV56Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwatdc01_impl.this.AV24EmprCod = GXv_char2[0] ;
      webwatdc01_impl.this.AV25EmprNom = GXv_char3[0] ;
      webwatdc01_impl.this.AV59UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      GXt_char1 = AV30Lit0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$USUARIO", ""), (byte)(99), GXv_char4) ;
      webwatdc01_impl.this.GXt_char1 = GXv_char4[0] ;
      AV30Lit0 = GXt_char1 ;
      GXt_char1 = AV50LitFe ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "$FECHA", ""), (byte)(99), GXv_char4) ;
      webwatdc01_impl.this.GXt_char1 = GXv_char4[0] ;
      AV50LitFe = GXt_char1 ;
      GXt_char1 = AV41Lit2 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( AV64Pgmname, (byte)(99), GXv_char4) ;
      webwatdc01_impl.this.GXt_char1 = GXv_char4[0] ;
      AV41Lit2 = GXt_char1 ;
      AV43Lit3 = httpContext.getMessage( "ATDocCodeID", "") ;
      AV44Lit4 = httpContext.getMessage( "Path Criar Resultado XML", "") ;
      AV45Lit5 = httpContext.getMessage( "Utilizador Portal Finanzas", "") ;
      AV46Lit6 = httpContext.getMessage( "Senha acceso do Utilizador", "") ;
      AV47Lit7 = httpContext.getMessage( "Guia Nº", "") ;
      AV48Lit8 = httpContext.getMessage( "NIF", "") ;
      AV49Lit9 = httpContext.getMessage( "Data-Hora Saida", "") ;
      AV31Lit10 = httpContext.getMessage( "Data do Documento", "") ;
      GXt_char1 = AV56Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwatdc01_impl.this.GXt_char1 = GXv_char4[0] ;
      AV56Station = GXt_char1 ;
      GXv_char4[0] = AV5BuscarEmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char2[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV56Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwatdc01_impl.this.AV5BuscarEmprCod = GXv_char4[0] ;
      webwatdc01_impl.this.AV25EmprNom = GXv_char3[0] ;
      webwatdc01_impl.this.AV59UsurCod = GXv_char2[0] ;
      AV24EmprCod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      /* Execute user subroutine: 'LEERDOC' */
      S112 ();
      if (returnInSub) return;
   }

   public void e12XO2( )
   {
      /* 'DoEscrevaCodigoAT' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LEERDOC' */
      S112 ();
      if (returnInSub) return;
      if ( AV12AtCodeID == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Erro, o código AT não é correto", ""));
         GX_FocusControl = edtavAtcodeid_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( ( ( AV57TipoGuia == 1 ) && ( AV14Calprd == 0 ) ) || ( ( AV57TipoGuia == 2 ) && ( AV13Calcom == 0 ) ) || ( ( AV57TipoGuia == 3 ) && ( AV21DevGen == 0 ) ) || ( ( AV57TipoGuia == 4 ) && ( AV16Cestsa == 0 ) ) || ( ( AV57TipoGuia == 6 ) && ( AV15Calpro == 0 ) ) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Nao Existe N Guia¡¡¡", ""));
            GX_FocusControl = edtavAlbprocod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( GXutil.strcmp(AV8ALbLic, " ") != 0 )
            {
               Gx_msg = httpContext.getMessage( "Atenção, este guia já tem o código AT= ", "") + AV8ALbLic ;
               httpContext.GX_msglist.addItem(Gx_msg);
               bttBtnescrevacodigoat_Enabled = 0 ;
               httpContext.ajax_rsp_assign_prop("", false, bttBtnescrevacodigoat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnescrevacodigoat_Enabled), 5, 0), true);
            }
            else
            {
               AV8ALbLic = GXutil.trim( GXutil.str( AV12AtCodeID, 12, 0)) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
               Gx_msg = httpContext.getMessage( "Confirme a introdução manual", "") + GXutil.chr( (short)(13)) ;
               Gx_msg += httpContext.getMessage( "do código da AT = ", "") + AV8ALbLic + " ?" + GXutil.chr( (short)(13)) ;
               AV6AccionConfirmada = "ConfirmaIntroduccion" ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6AccionConfirmada", AV6AccionConfirmada);
               httpContext.popup(formatLink("app.mensajeconfirmarglobalevent", new String[] {GXutil.URLEncode(GXutil.rtrim(AV6AccionConfirmada)),GXutil.URLEncode(GXutil.rtrim(Gx_msg))}, new String[] {"ObjetoRefrescar","Mensaje"}) , new Object[] {});
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e13XO2( )
   {
      /* GlobalEvents_Refrescarobjeto Routine */
      returnInSub = false ;
      if ( AV60ObjetoCollection.indexof(AV6AccionConfirmada) > 0 )
      {
         if ( AV61Refrescar )
         {
            if ( GXutil.strcmp(AV6AccionConfirmada, "ConfirmaIntroduccion") == 0 )
            {
               if ( AV57TipoGuia == 1 )
               {
                  GXv_char4[0] = AV24EmprCod ;
                  GXv_int5[0] = AV9AlbProcod ;
                  GXv_char3[0] = AV8ALbLic ;
                  GXv_int6[0] = (byte)(3) ;
                  new app.documentotransporteproduccion.pfasprda(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_int6) ;
                  webwatdc01_impl.this.AV24EmprCod = GXv_char4[0] ;
                  webwatdc01_impl.this.AV9AlbProcod = GXv_int5[0] ;
                  webwatdc01_impl.this.AV8ALbLic = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbProcod), 10, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
               }
               else if ( AV57TipoGuia == 2 )
               {
                  GXv_char4[0] = AV24EmprCod ;
                  GXv_int7[0] = (int)(AV9AlbProcod) ;
                  GXv_char3[0] = AV8ALbLic ;
                  GXv_int6[0] = (byte)(3) ;
                  new app.psaftsd1(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int6) ;
                  webwatdc01_impl.this.AV24EmprCod = GXv_char4[0] ;
                  webwatdc01_impl.this.AV9AlbProcod = GXv_int7[0] ;
                  webwatdc01_impl.this.AV8ALbLic = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbProcod), 10, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
               }
               else if ( AV57TipoGuia == 3 )
               {
                  GXv_char4[0] = AV24EmprCod ;
                  GXv_int7[0] = (int)(AV9AlbProcod) ;
                  GXv_char3[0] = AV8ALbLic ;
                  GXv_int6[0] = (byte)(3) ;
                  new app.psaftsm1(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int6) ;
                  webwatdc01_impl.this.AV24EmprCod = GXv_char4[0] ;
                  webwatdc01_impl.this.AV9AlbProcod = GXv_int7[0] ;
                  webwatdc01_impl.this.AV8ALbLic = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbProcod), 10, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
               }
               else if ( AV57TipoGuia == 4 )
               {
                  GXv_char4[0] = AV24EmprCod ;
                  GXv_int7[0] = (int)(AV9AlbProcod) ;
                  GXv_char3[0] = AV8ALbLic ;
                  GXv_int6[0] = (byte)(3) ;
                  new app.psaftse1(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int6) ;
                  webwatdc01_impl.this.AV24EmprCod = GXv_char4[0] ;
                  webwatdc01_impl.this.AV9AlbProcod = GXv_int7[0] ;
                  webwatdc01_impl.this.AV8ALbLic = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbProcod), 10, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
               }
               else if ( AV57TipoGuia == 5 )
               {
                  new app.almacensindetalle.psaftsm3(remoteHandle, context).execute( AV24EmprCod, (int)(AV9AlbProcod), AV8ALbLic, (byte)(3)) ;
               }
               else if ( AV57TipoGuia == 6 )
               {
                  GXv_char4[0] = AV24EmprCod ;
                  GXv_int7[0] = (int)(AV9AlbProcod) ;
                  GXv_char3[0] = AV8ALbLic ;
                  GXv_int6[0] = (byte)(3) ;
                  new app.psaftsd7(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int6) ;
                  webwatdc01_impl.this.AV24EmprCod = GXv_char4[0] ;
                  webwatdc01_impl.this.AV9AlbProcod = GXv_int7[0] ;
                  webwatdc01_impl.this.AV8ALbLic = GXv_char3[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbProcod), 10, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
               }
               else
               {
               }
               AV12AtCodeID = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12AtCodeID", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AtCodeID), 12, 0));
               AV8ALbLic = " " ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
               GX_FocusControl = edtavAlbprocod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
         }
         else
         {
         }
      }
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'LEERDOC' Routine */
      returnInSub = false ;
      AV18CliNif = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18CliNif", AV18CliNif);
      AV7AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHhfm", localUtil.ttoc( AV7AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV26FecHhSal = " " ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26FecHhSal", AV26FecHhSal);
      if ( AV57TipoGuia == 1 )
      {
         AV14Calprd = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14Calprd", GXutil.str( AV14Calprd, 1, 0));
         /* Using cursor H00XO3 */
         pr_default.execute(1, new Object[] {A396EmprCod, Long.valueOf(AV9AlbProcod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A30AlbProCod = H00XO3_A30AlbProCod[0] ;
            A7101AlbLic = H00XO3_A7101AlbLic[0] ;
            A1243GuiRemCli = H00XO3_A1243GuiRemCli[0] ;
            A10019AlbHhfm = H00XO3_A10019AlbHhfm[0] ;
            A3865AlbHorSal = H00XO3_A3865AlbHorSal[0] ;
            A4023AlbFecSal = H00XO3_A4023AlbFecSal[0] ;
            AV8ALbLic = A7101AlbLic ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
            AV14Calprd = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14Calprd", GXutil.str( AV14Calprd, 1, 0));
            AV17Clicod = A1243GuiRemCli ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Clicod), 6, 0));
            /* Execute user subroutine: 'CLIENTE' */
            S123 ();
            if ( returnInSub )
            {
               pr_default.close(1);
               returnInSub = true;
               if (true) return;
            }
            AV7AlbHhfm = A10019AlbHhfm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHhfm", localUtil.ttoc( AV7AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV26FecHhSal = localUtil.dtoc( A4023AlbFecSal, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A3865AlbHorSal ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26FecHhSal", AV26FecHhSal);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(1);
      }
      else if ( AV57TipoGuia == 2 )
      {
         AV13Calcom = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13Calcom", GXutil.str( AV13Calcom, 1, 0));
         /* Using cursor H00XO4 */
         pr_default.execute(2, new Object[] {A396EmprCod, Long.valueOf(AV9AlbProcod)});
         while ( (pr_default.getStatus(2) != 101) )
         {
            A14AlbComCod = H00XO4_A14AlbComCod[0] ;
            A10740AlbComID = H00XO4_A10740AlbComID[0] ;
            A252CliCod = H00XO4_A252CliCod[0] ;
            n252CliCod = H00XO4_n252CliCod[0] ;
            A10013AlbComFs = H00XO4_A10013AlbComFs[0] ;
            A4829AlbComHor = H00XO4_A4829AlbComHor[0] ;
            AV8ALbLic = A10740AlbComID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
            AV13Calcom = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Calcom", GXutil.str( AV13Calcom, 1, 0));
            AV17Clicod = A252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Clicod), 6, 0));
            /* Execute user subroutine: 'CLIENTE' */
            S123 ();
            if ( returnInSub )
            {
               pr_default.close(2);
               returnInSub = true;
               if (true) return;
            }
            AV7AlbHhfm = A10013AlbComFs ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHhfm", localUtil.ttoc( AV7AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV26FecHhSal = localUtil.ttoc( A4829AlbComHor, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26FecHhSal", AV26FecHhSal);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(2);
      }
      else if ( AV57TipoGuia == 3 )
      {
         AV21DevGen = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21DevGen", GXutil.str( AV21DevGen, 1, 0));
         /* Using cursor H00XO5 */
         pr_default.execute(3, new Object[] {A396EmprCod, Long.valueOf(AV9AlbProcod)});
         while ( (pr_default.getStatus(3) != 101) )
         {
            A323DevGenCod = H00XO5_A323DevGenCod[0] ;
            A10737DevATCodeI = H00XO5_A10737DevATCodeI[0] ;
            n10737DevATCodeI = H00XO5_n10737DevATCodeI[0] ;
            A252CliCod = H00XO5_A252CliCod[0] ;
            n252CliCod = H00XO5_n252CliCod[0] ;
            A10073DevFHh = H00XO5_A10073DevFHh[0] ;
            n10073DevFHh = H00XO5_n10073DevFHh[0] ;
            A5348DevHorSal = H00XO5_A5348DevHorSal[0] ;
            n5348DevHorSal = H00XO5_n5348DevHorSal[0] ;
            AV8ALbLic = A10737DevATCodeI ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
            AV21DevGen = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21DevGen", GXutil.str( AV21DevGen, 1, 0));
            AV17Clicod = A252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Clicod), 6, 0));
            /* Execute user subroutine: 'CLIENTE' */
            S123 ();
            if ( returnInSub )
            {
               pr_default.close(3);
               returnInSub = true;
               if (true) return;
            }
            AV7AlbHhfm = A10073DevFHh ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHhfm", localUtil.ttoc( AV7AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV26FecHhSal = localUtil.ttoc( A5348DevHorSal, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26FecHhSal", AV26FecHhSal);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(3);
      }
      else if ( AV57TipoGuia == 4 )
      {
         AV16Cestsa = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16Cestsa", GXutil.str( AV16Cestsa, 1, 0));
         /* Using cursor H00XO6 */
         pr_default.execute(4, new Object[] {A396EmprCod, Long.valueOf(AV9AlbProcod)});
         while ( (pr_default.getStatus(4) != 101) )
         {
            A2248ManCod = H00XO6_A2248ManCod[0] ;
            A2253SalExtAlb = H00XO6_A2253SalExtAlb[0] ;
            A10742SalCodeID = H00XO6_A10742SalCodeID[0] ;
            A3302ManNif = H00XO6_A3302ManNif[0] ;
            n3302ManNif = H00XO6_n3302ManNif[0] ;
            A10076SalFhh = H00XO6_A10076SalFhh[0] ;
            A6396SalExtHor = H00XO6_A6396SalExtHor[0] ;
            A2256SalExtFec = H00XO6_A2256SalExtFec[0] ;
            A3302ManNif = H00XO6_A3302ManNif[0] ;
            n3302ManNif = H00XO6_n3302ManNif[0] ;
            AV8ALbLic = A10742SalCodeID ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
            AV16Cestsa = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Cestsa", GXutil.str( AV16Cestsa, 1, 0));
            AV18CliNif = A3302ManNif ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18CliNif", AV18CliNif);
            AV7AlbHhfm = A10076SalFhh ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHhfm", localUtil.ttoc( AV7AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV26FecHhSal = localUtil.dtoc( A2256SalExtFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") + " " + A6396SalExtHor ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26FecHhSal", AV26FecHhSal);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(4);
      }
      else if ( AV57TipoGuia == 5 )
      {
         AV21DevGen = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21DevGen", GXutil.str( AV21DevGen, 1, 0));
         /* Using cursor H00XO7 */
         pr_default.execute(5, new Object[] {A396EmprCod, Long.valueOf(AV9AlbProcod)});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A11669DevCruId = H00XO7_A11669DevCruId[0] ;
            A11680DevCruAtId = H00XO7_A11680DevCruAtId[0] ;
            A252CliCod = H00XO7_A252CliCod[0] ;
            n252CliCod = H00XO7_n252CliCod[0] ;
            A11676DevCruDtSy = H00XO7_A11676DevCruDtSy[0] ;
            A11673DevCruSal = H00XO7_A11673DevCruSal[0] ;
            AV8ALbLic = A11680DevCruAtId ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
            AV21DevGen = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21DevGen", GXutil.str( AV21DevGen, 1, 0));
            AV17Clicod = A252CliCod ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Clicod), 6, 0));
            /* Execute user subroutine: 'CLIENTE' */
            S123 ();
            if ( returnInSub )
            {
               pr_default.close(5);
               returnInSub = true;
               if (true) return;
            }
            AV7AlbHhfm = A11676DevCruDtSy ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHhfm", localUtil.ttoc( AV7AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV26FecHhSal = localUtil.ttoc( A11673DevCruSal, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26FecHhSal", AV26FecHhSal);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(5);
      }
      else if ( AV57TipoGuia == 6 )
      {
         AV15Calpro = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15Calpro", GXutil.str( AV15Calpro, 1, 0));
         /* Using cursor H00XO8 */
         pr_default.execute(6, new Object[] {A396EmprCod, Long.valueOf(AV9AlbProcod)});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A13418AlbProID = H00XO8_A13418AlbProID[0] ;
            A13436AlbProIDAT = H00XO8_A13436AlbProIDAT[0] ;
            A13417AlbProTipo = H00XO8_A13417AlbProTipo[0] ;
            A13425AlbProCliC = H00XO8_A13425AlbProCliC[0] ;
            A13419AlbProPrvI = H00XO8_A13419AlbProPrvI[0] ;
            A13431AlbProSys = H00XO8_A13431AlbProSys[0] ;
            A13429AlbProSal = H00XO8_A13429AlbProSal[0] ;
            AV8ALbLic = A13436AlbProIDAT ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8ALbLic", AV8ALbLic);
            AV15Calpro = (byte)(1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Calpro", GXutil.str( AV15Calpro, 1, 0));
            if ( GXutil.strcmp(A13417AlbProTipo, httpContext.getMessage( "C", "")) == 0 )
            {
               AV17Clicod = A13425AlbProCliC ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Clicod), 6, 0));
               /* Execute user subroutine: 'CLIENTE' */
               S123 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  returnInSub = true;
                  if (true) return;
               }
            }
            else
            {
               AV55PrvNum = A13419AlbProPrvI ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55PrvNum), 6, 0));
               /* Execute user subroutine: 'PRVGEN' */
               S138 ();
               if ( returnInSub )
               {
                  pr_default.close(6);
                  returnInSub = true;
                  if (true) return;
               }
            }
            AV7AlbHhfm = A13431AlbProSys ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbHhfm", localUtil.ttoc( AV7AlbHhfm, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            AV26FecHhSal = localUtil.ttoc( A13429AlbProSal, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26FecHhSal", AV26FecHhSal);
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(6);
      }
      else
      {
      }
   }

   public void S123( )
   {
      /* 'CLIENTE' Routine */
      returnInSub = false ;
      /* Using cursor H00XO9 */
      pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(AV17Clicod)});
      while ( (pr_default.getStatus(7) != 101) )
      {
         A252CliCod = H00XO9_A252CliCod[0] ;
         n252CliCod = H00XO9_n252CliCod[0] ;
         A278CliNif = H00XO9_A278CliNif[0] ;
         AV18CliNif = A278CliNif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18CliNif", AV18CliNif);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(7);
   }

   public void S138( )
   {
      /* 'PRVGEN' Routine */
      returnInSub = false ;
      /* Using cursor H00XO10 */
      pr_default.execute(8, new Object[] {A396EmprCod, Integer.valueOf(AV55PrvNum)});
      while ( (pr_default.getStatus(8) != 101) )
      {
         A795PrvNum = H00XO10_A795PrvNum[0] ;
         A793PrvNif = H00XO10_A793PrvNif[0] ;
         n793PrvNif = H00XO10_n793PrvNif[0] ;
         AV18CliNif = A793PrvNif ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18CliNif", AV18CliNif);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(8);
   }

   protected void nextLoad( )
   {
   }

   protected void e14XO2( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_17_XO2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavTipoguia.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavTipoguia.getInternalname(), httpContext.getMessage( "Tipo Guia", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavTipoguia, cmbavTipoguia.getInternalname(), GXutil.trim( GXutil.str( AV57TipoGuia, 1, 0)), 1, cmbavTipoguia.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavTipoguia.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", "", "", true, (byte)(0), "HLP_WebWATDC01.htm");
         cmbavTipoguia.setValue( GXutil.trim( GXutil.str( AV57TipoGuia, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavTipoguia.getInternalname(), "Values", cmbavTipoguia.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Albaran", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV9AlbProcod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9AlbProcod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9AlbProcod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWATDC01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavAtcodeid_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAtcodeid_Internalname, httpContext.getMessage( "At Code ID", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAtcodeid_Internalname, GXutil.ltrim( localUtil.ntoc( AV12AtCodeID, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAtcodeid_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12AtCodeID), "ZZZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12AtCodeID), "ZZZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAtcodeid_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAtcodeid_Enabled, 0, "text", "1", 12, "chr", 1, "row", 12, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWATDC01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinif_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinif_Internalname, httpContext.getMessage( "Nif", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinif_Internalname, GXutil.rtrim( AV18CliNif), GXutil.rtrim( localUtil.format( AV18CliNif, "@!")), TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinif_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinif_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWATDC01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavFechhsal_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFechhsal_Internalname, httpContext.getMessage( "Fec Hh Sal", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFechhsal_Internalname, GXutil.rtrim( AV26FecHhSal), GXutil.rtrim( localUtil.format( AV26FecHhSal, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFechhsal_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFechhsal_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWATDC01.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbhhfm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbhhfm_Internalname, httpContext.getMessage( "Hora Firma Digital", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavAlbhhfm_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbhhfm_Internalname, localUtil.ttoc( AV7AlbHhfm, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV7AlbHhfm, "99/99/99 99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',5,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbhhfm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbhhfm_Enabled, 0, "text", "", 14, "chr", 1, "row", 14, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWATDC01.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavAlbhhfm_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavAlbhhfm_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWATDC01.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnescrevacodigoat_Internalname, "", httpContext.getMessage( "Escreva o código da AT", ""), bttBtnescrevacodigoat_Jsonclick, 5, httpContext.getMessage( "Escreva o código da AT", ""), "", StyleString, ClassString, 1, bttBtnescrevacodigoat_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOESCREVACODIGOAT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWATDC01.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_17_XO2e( true) ;
      }
      else
      {
         wb_table1_17_XO2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      AV57TipoGuia = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57TipoGuia", GXutil.str( AV57TipoGuia, 1, 0));
      AV9AlbProcod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9AlbProcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9AlbProcod), 10, 0));
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
      paXO2( ) ;
      wsXO2( ) ;
      weXO2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268241513741", true, true);
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
      httpContext.AddJavascriptSource("webwatdc01.js", "?20268241513741", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavTipoguia.setInternalname( "vTIPOGUIA" );
      edtavAlbprocod_Internalname = "vALBPROCOD" ;
      edtavAtcodeid_Internalname = "vATCODEID" ;
      edtavClinif_Internalname = "vCLINIF" ;
      edtavFechhsal_Internalname = "vFECHHSAL" ;
      edtavAlbhhfm_Internalname = "vALBHHFM" ;
      bttBtnescrevacodigoat_Internalname = "BTNESCREVACODIGOAT" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
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
      bttBtnescrevacodigoat_Enabled = 1 ;
      edtavAlbhhfm_Jsonclick = "" ;
      edtavAlbhhfm_Enabled = 1 ;
      edtavFechhsal_Jsonclick = "" ;
      edtavFechhsal_Enabled = 1 ;
      edtavClinif_Jsonclick = "" ;
      edtavClinif_Enabled = 1 ;
      edtavAtcodeid_Jsonclick = "" ;
      edtavAtcodeid_Enabled = 1 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
      cmbavTipoguia.setJsonclick( "" );
      cmbavTipoguia.setEnabled( 0 );
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "ENTRADA MANUAL DEL CODIGO AT", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavTipoguia.setName( "vTIPOGUIA" );
      cmbavTipoguia.setWebtags( "" );
      cmbavTipoguia.addItem("1", httpContext.getMessage( "Guia Remessa", ""), (short)(0));
      cmbavTipoguia.addItem("2", httpContext.getMessage( "Guias Diversas (Comerciais)", ""), (short)(0));
      cmbavTipoguia.addItem("3", httpContext.getMessage( "Devoluçoes Malha em Cru", ""), (short)(0));
      cmbavTipoguia.addItem("4", httpContext.getMessage( "Trabalhos Externos", ""), (short)(0));
      cmbavTipoguia.addItem("6", httpContext.getMessage( "Documento Transporte Proveedor", ""), (short)(0));
      if ( cmbavTipoguia.getItemCount() > 0 )
      {
         AV57TipoGuia = (byte)(GXutil.lval( cmbavTipoguia.getValidValue(GXutil.trim( GXutil.str( AV57TipoGuia, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57TipoGuia", GXutil.str( AV57TipoGuia, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOESCREVACODIGOAT'","{handler:'e12XO2',iparms:[{av:'AV12AtCodeID',fld:'vATCODEID',pic:'ZZZZZZZZZZZ9'},{av:'AV14Calprd',fld:'vCALPRD',pic:'9'},{av:'AV13Calcom',fld:'vCALCOM',pic:'9'},{av:'AV21DevGen',fld:'vDEVGEN',pic:'9'},{av:'AV16Cestsa',fld:'vCESTSA',pic:'9'},{av:'cmbavTipoguia'},{av:'AV57TipoGuia',fld:'vTIPOGUIA',pic:'9'},{av:'AV15Calpro',fld:'vCALPRO',pic:'9'},{av:'AV9AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV8ALbLic',fld:'vALBLIC',pic:''},{av:'AV7AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'A3865AlbHorSal',fld:'ALBHORSAL',pic:''},{av:'A4023AlbFecSal',fld:'ALBFECSAL',pic:''},{av:'A10019AlbHhfm',fld:'ALBHHFM',pic:'99/99/99 99:99'},{av:'A1243GuiRemCli',fld:'GUIREMCLI',pic:'ZZZZZ9'},{av:'A7101AlbLic',fld:'ALBLIC',pic:''},{av:'A30AlbProCod',fld:'ALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'A4829AlbComHor',fld:'ALBCOMHOR',pic:'99/99/99 99:99:99'},{av:'A10013AlbComFs',fld:'ALBCOMFS',pic:'99/99/99 99:99:99'},{av:'A10740AlbComID',fld:'ALBCOMID',pic:''},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A5348DevHorSal',fld:'DEVHORSAL',pic:'99/99/99 99:99:99'},{av:'A10073DevFHh',fld:'DEVFHH',pic:'99/99/99 99:99:99'},{av:'A10737DevATCodeI',fld:'DEVATCODEI',pic:''},{av:'A323DevGenCod',fld:'DEVGENCOD',pic:'ZZZZZZZ9'},{av:'A6396SalExtHor',fld:'SALEXTHOR',pic:''},{av:'A2256SalExtFec',fld:'SALEXTFEC',pic:''},{av:'A10076SalFhh',fld:'SALFHH',pic:'99/99/99 99:99'},{av:'A3302ManNif',fld:'MANNIF',pic:'@!'},{av:'A10742SalCodeID',fld:'SALCODEID',pic:''},{av:'A2253SalExtAlb',fld:'SALEXTALB',pic:'ZZZZZZZ9'},{av:'A11673DevCruSal',fld:'DEVCRUSAL',pic:'99/99/99 99:99'},{av:'A11676DevCruDtSy',fld:'DEVCRUDTSY',pic:'99/99/99 99:99'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A11680DevCruAtId',fld:'DEVCRUATID',pic:''},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A13429AlbProSal',fld:'ALBPROSAL',pic:'99/99/99 99:99'},{av:'A13431AlbProSys',fld:'ALBPROSYS',pic:'99/99/99 99:99'},{av:'A13419AlbProPrvI',fld:'ALBPROPRVI',pic:'ZZZZZ9'},{av:'A13425AlbProCliC',fld:'ALBPROCLIC',pic:'ZZZZZ9'},{av:'A13417AlbProTipo',fld:'ALBPROTIPO',pic:''},{av:'A13436AlbProIDAT',fld:'ALBPROIDAT',pic:''},{av:'A13418AlbProID',fld:'ALBPROID',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV17Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'A278CliNif',fld:'CLINIF',pic:'@!'},{av:'A795PrvNum',fld:'PRVNUM',pic:'ZZZZZ9'},{av:'AV55PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'A793PrvNif',fld:'PRVNIF',pic:''}]");
      setEventMetadata("'DOESCREVACODIGOAT'",",oparms:[{ctrl:'BTNESCREVACODIGOAT',prop:'Enabled'},{av:'AV8ALbLic',fld:'vALBLIC',pic:''},{av:'AV6AccionConfirmada',fld:'vACCIONCONFIRMADA',pic:''},{av:'AV18CliNif',fld:'vCLINIF',pic:'@!'},{av:'AV7AlbHhfm',fld:'vALBHHFM',pic:'99/99/99 99:99'},{av:'AV26FecHhSal',fld:'vFECHHSAL',pic:''},{av:'AV15Calpro',fld:'vCALPRO',pic:'9'},{av:'AV17Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV55PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV21DevGen',fld:'vDEVGEN',pic:'9'},{av:'AV16Cestsa',fld:'vCESTSA',pic:'9'},{av:'AV13Calcom',fld:'vCALCOM',pic:'9'},{av:'AV14Calprd',fld:'vCALPRD',pic:'9'}]}");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO","{handler:'e13XO2',iparms:[{av:'AV61Refrescar',fld:'vREFRESCAR',pic:''},{av:'AV60ObjetoCollection',fld:'vOBJETOCOLLECTION',pic:''},{av:'AV6AccionConfirmada',fld:'vACCIONCONFIRMADA',pic:''},{av:'AV8ALbLic',fld:'vALBLIC',pic:''},{av:'AV9AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavTipoguia'},{av:'AV57TipoGuia',fld:'vTIPOGUIA',pic:'9'}]");
      setEventMetadata("GLOBALEVENTS.REFRESCAROBJETO",",oparms:[{av:'AV8ALbLic',fld:'vALBLIC',pic:''},{av:'AV9AlbProcod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12AtCodeID',fld:'vATCODEID',pic:'ZZZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_ALBPROCOD","{handler:'validv_Albprocod',iparms:[]");
      setEventMetadata("VALIDV_ALBPROCOD",",oparms:[]}");
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
      wcpOA396EmprCod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV8ALbLic = "" ;
      A3865AlbHorSal = "" ;
      A4023AlbFecSal = GXutil.nullDate() ;
      A10019AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      A7101AlbLic = "" ;
      A4829AlbComHor = GXutil.resetTime( GXutil.nullDate() );
      A10013AlbComFs = GXutil.resetTime( GXutil.nullDate() );
      A10740AlbComID = "" ;
      A5348DevHorSal = GXutil.resetTime( GXutil.nullDate() );
      A10073DevFHh = GXutil.resetTime( GXutil.nullDate() );
      A10737DevATCodeI = "" ;
      A6396SalExtHor = "" ;
      A2256SalExtFec = GXutil.nullDate() ;
      A10076SalFhh = GXutil.resetTime( GXutil.nullDate() );
      A3302ManNif = "" ;
      A10742SalCodeID = "" ;
      A11673DevCruSal = GXutil.resetTime( GXutil.nullDate() );
      A11676DevCruDtSy = GXutil.resetTime( GXutil.nullDate() );
      A11680DevCruAtId = "" ;
      A13429AlbProSal = GXutil.resetTime( GXutil.nullDate() );
      A13431AlbProSys = GXutil.resetTime( GXutil.nullDate() );
      A13417AlbProTipo = "" ;
      A13436AlbProIDAT = "" ;
      A278CliNif = "" ;
      A793PrvNif = "" ;
      AV60ObjetoCollection = new GXSimpleCollection<String>(String.class, "internal", "");
      AV6AccionConfirmada = "" ;
      AV24EmprCod = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV64Pgmname = "" ;
      scmdbuf = "" ;
      H00XO2_A396EmprCod = new String[] {""} ;
      AV18CliNif = "" ;
      AV26FecHhSal = "" ;
      AV7AlbHhfm = GXutil.resetTime( GXutil.nullDate() );
      AV56Station = "" ;
      AV25EmprNom = "" ;
      AV59UsurCod = "" ;
      AV30Lit0 = "" ;
      AV50LitFe = "" ;
      AV41Lit2 = "" ;
      AV43Lit3 = "" ;
      AV44Lit4 = "" ;
      AV45Lit5 = "" ;
      AV46Lit6 = "" ;
      AV47Lit7 = "" ;
      AV48Lit8 = "" ;
      AV49Lit9 = "" ;
      AV31Lit10 = "" ;
      GXt_char1 = "" ;
      AV5BuscarEmprCod = "" ;
      GXv_char2 = new String[1] ;
      Gx_msg = "" ;
      GXv_int5 = new long[1] ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int6 = new byte[1] ;
      H00XO3_A396EmprCod = new String[] {""} ;
      H00XO3_A30AlbProCod = new long[1] ;
      H00XO3_A7101AlbLic = new String[] {""} ;
      H00XO3_A1243GuiRemCli = new int[1] ;
      H00XO3_A10019AlbHhfm = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO3_A3865AlbHorSal = new String[] {""} ;
      H00XO3_A4023AlbFecSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO4_A396EmprCod = new String[] {""} ;
      H00XO4_A14AlbComCod = new int[1] ;
      H00XO4_A10740AlbComID = new String[] {""} ;
      H00XO4_A252CliCod = new int[1] ;
      H00XO4_n252CliCod = new boolean[] {false} ;
      H00XO4_A10013AlbComFs = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO4_A4829AlbComHor = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO5_A396EmprCod = new String[] {""} ;
      H00XO5_A323DevGenCod = new int[1] ;
      H00XO5_A10737DevATCodeI = new String[] {""} ;
      H00XO5_n10737DevATCodeI = new boolean[] {false} ;
      H00XO5_A252CliCod = new int[1] ;
      H00XO5_n252CliCod = new boolean[] {false} ;
      H00XO5_A10073DevFHh = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO5_n10073DevFHh = new boolean[] {false} ;
      H00XO5_A5348DevHorSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO5_n5348DevHorSal = new boolean[] {false} ;
      H00XO6_A2248ManCod = new short[1] ;
      H00XO6_A396EmprCod = new String[] {""} ;
      H00XO6_A2253SalExtAlb = new int[1] ;
      H00XO6_A10742SalCodeID = new String[] {""} ;
      H00XO6_A3302ManNif = new String[] {""} ;
      H00XO6_n3302ManNif = new boolean[] {false} ;
      H00XO6_A10076SalFhh = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO6_A6396SalExtHor = new String[] {""} ;
      H00XO6_A2256SalExtFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO7_A396EmprCod = new String[] {""} ;
      H00XO7_A11669DevCruId = new int[1] ;
      H00XO7_A11680DevCruAtId = new String[] {""} ;
      H00XO7_A252CliCod = new int[1] ;
      H00XO7_n252CliCod = new boolean[] {false} ;
      H00XO7_A11676DevCruDtSy = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO7_A11673DevCruSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO8_A396EmprCod = new String[] {""} ;
      H00XO8_A13418AlbProID = new int[1] ;
      H00XO8_A13436AlbProIDAT = new String[] {""} ;
      H00XO8_A13417AlbProTipo = new String[] {""} ;
      H00XO8_A13425AlbProCliC = new int[1] ;
      H00XO8_A13419AlbProPrvI = new int[1] ;
      H00XO8_A13431AlbProSys = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO8_A13429AlbProSal = new java.util.Date[] {GXutil.nullDate()} ;
      H00XO9_A396EmprCod = new String[] {""} ;
      H00XO9_A252CliCod = new int[1] ;
      H00XO9_n252CliCod = new boolean[] {false} ;
      H00XO9_A278CliNif = new String[] {""} ;
      H00XO10_A396EmprCod = new String[] {""} ;
      H00XO10_A795PrvNum = new int[1] ;
      H00XO10_A793PrvNif = new String[] {""} ;
      H00XO10_n793PrvNif = new boolean[] {false} ;
      sStyleString = "" ;
      TempTags = "" ;
      bttBtnescrevacodigoat_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwatdc01__default(),
         new Object[] {
             new Object[] {
            H00XO2_A396EmprCod
            }
            , new Object[] {
            H00XO3_A396EmprCod, H00XO3_A30AlbProCod, H00XO3_A7101AlbLic, H00XO3_A1243GuiRemCli, H00XO3_A10019AlbHhfm, H00XO3_A3865AlbHorSal, H00XO3_A4023AlbFecSal
            }
            , new Object[] {
            H00XO4_A396EmprCod, H00XO4_A14AlbComCod, H00XO4_A10740AlbComID, H00XO4_A252CliCod, H00XO4_A10013AlbComFs, H00XO4_A4829AlbComHor
            }
            , new Object[] {
            H00XO5_A396EmprCod, H00XO5_A323DevGenCod, H00XO5_A10737DevATCodeI, H00XO5_n10737DevATCodeI, H00XO5_A252CliCod, H00XO5_n252CliCod, H00XO5_A10073DevFHh, H00XO5_n10073DevFHh, H00XO5_A5348DevHorSal, H00XO5_n5348DevHorSal
            }
            , new Object[] {
            H00XO6_A2248ManCod, H00XO6_A396EmprCod, H00XO6_A2253SalExtAlb, H00XO6_A10742SalCodeID, H00XO6_A3302ManNif, H00XO6_n3302ManNif, H00XO6_A10076SalFhh, H00XO6_A6396SalExtHor, H00XO6_A2256SalExtFec
            }
            , new Object[] {
            H00XO7_A396EmprCod, H00XO7_A11669DevCruId, H00XO7_A11680DevCruAtId, H00XO7_A252CliCod, H00XO7_A11676DevCruDtSy, H00XO7_A11673DevCruSal
            }
            , new Object[] {
            H00XO8_A396EmprCod, H00XO8_A13418AlbProID, H00XO8_A13436AlbProIDAT, H00XO8_A13417AlbProTipo, H00XO8_A13425AlbProCliC, H00XO8_A13419AlbProPrvI, H00XO8_A13431AlbProSys, H00XO8_A13429AlbProSal
            }
            , new Object[] {
            H00XO9_A396EmprCod, H00XO9_A252CliCod, H00XO9_A278CliNif
            }
            , new Object[] {
            H00XO10_A396EmprCod, H00XO10_A795PrvNum, H00XO10_A793PrvNif, H00XO10_n793PrvNif
            }
         }
      );
      AV64Pgmname = "WebWATDC01" ;
      /* GeneXus formulas. */
      AV64Pgmname = "WebWATDC01" ;
      Gx_err = (short)(0) ;
      cmbavTipoguia.setEnabled( 0 );
      edtavAlbprocod_Enabled = 0 ;
   }

   private byte wcpOAV57TipoGuia ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV57TipoGuia ;
   private byte gxajaxcallmode ;
   private byte AV14Calprd ;
   private byte AV13Calcom ;
   private byte AV21DevGen ;
   private byte AV16Cestsa ;
   private byte AV15Calpro ;
   private byte nDonePA ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
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
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short A2248ManCod ;
   private int A1243GuiRemCli ;
   private int A14AlbComCod ;
   private int A323DevGenCod ;
   private int A2253SalExtAlb ;
   private int A252CliCod ;
   private int A11669DevCruId ;
   private int A13419AlbProPrvI ;
   private int A13425AlbProCliC ;
   private int A13418AlbProID ;
   private int AV17Clicod ;
   private int A795PrvNum ;
   private int AV55PrvNum ;
   private int edtavAlbprocod_Enabled ;
   private int bttBtnescrevacodigoat_Enabled ;
   private int GXv_int7[] ;
   private int edtavAtcodeid_Enabled ;
   private int edtavClinif_Enabled ;
   private int edtavFechhsal_Enabled ;
   private int edtavAlbhhfm_Enabled ;
   private int idxLst ;
   private long wcpOAV9AlbProcod ;
   private long AV9AlbProcod ;
   private long A30AlbProCod ;
   private long AV12AtCodeID ;
   private long GXv_int5[] ;
   private String wcpOA396EmprCod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV8ALbLic ;
   private String A3865AlbHorSal ;
   private String A7101AlbLic ;
   private String A10740AlbComID ;
   private String A10737DevATCodeI ;
   private String A6396SalExtHor ;
   private String A3302ManNif ;
   private String A10742SalCodeID ;
   private String A11680DevCruAtId ;
   private String A13417AlbProTipo ;
   private String A13436AlbProIDAT ;
   private String A278CliNif ;
   private String A793PrvNif ;
   private String AV24EmprCod ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavAtcodeid_Internalname ;
   private String AV64Pgmname ;
   private String edtavAlbprocod_Internalname ;
   private String scmdbuf ;
   private String AV18CliNif ;
   private String edtavClinif_Internalname ;
   private String AV26FecHhSal ;
   private String edtavFechhsal_Internalname ;
   private String edtavAlbhhfm_Internalname ;
   private String AV56Station ;
   private String AV25EmprNom ;
   private String AV59UsurCod ;
   private String AV30Lit0 ;
   private String AV50LitFe ;
   private String AV41Lit2 ;
   private String AV43Lit3 ;
   private String AV44Lit4 ;
   private String AV45Lit5 ;
   private String AV46Lit6 ;
   private String AV47Lit7 ;
   private String AV48Lit8 ;
   private String AV49Lit9 ;
   private String AV31Lit10 ;
   private String GXt_char1 ;
   private String AV5BuscarEmprCod ;
   private String GXv_char2[] ;
   private String Gx_msg ;
   private String bttBtnescrevacodigoat_Internalname ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String sStyleString ;
   private String tblUnnamedtable1_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String TempTags ;
   private String edtavAtcodeid_Jsonclick ;
   private String edtavClinif_Jsonclick ;
   private String edtavFechhsal_Jsonclick ;
   private String edtavAlbhhfm_Jsonclick ;
   private String bttBtnescrevacodigoat_Jsonclick ;
   private java.util.Date A10019AlbHhfm ;
   private java.util.Date A4829AlbComHor ;
   private java.util.Date A10013AlbComFs ;
   private java.util.Date A5348DevHorSal ;
   private java.util.Date A10073DevFHh ;
   private java.util.Date A10076SalFhh ;
   private java.util.Date A11673DevCruSal ;
   private java.util.Date A11676DevCruDtSy ;
   private java.util.Date A13429AlbProSal ;
   private java.util.Date A13431AlbProSys ;
   private java.util.Date AV7AlbHhfm ;
   private java.util.Date A4023AlbFecSal ;
   private java.util.Date A2256SalExtFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV61Refrescar ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean n252CliCod ;
   private boolean n10737DevATCodeI ;
   private boolean n10073DevFHh ;
   private boolean n5348DevHorSal ;
   private boolean n3302ManNif ;
   private boolean n793PrvNif ;
   private String AV6AccionConfirmada ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private HTMLChoice cmbavTipoguia ;
   private IDataStoreProvider pr_default ;
   private String[] H00XO2_A396EmprCod ;
   private String[] H00XO3_A396EmprCod ;
   private long[] H00XO3_A30AlbProCod ;
   private String[] H00XO3_A7101AlbLic ;
   private int[] H00XO3_A1243GuiRemCli ;
   private java.util.Date[] H00XO3_A10019AlbHhfm ;
   private String[] H00XO3_A3865AlbHorSal ;
   private java.util.Date[] H00XO3_A4023AlbFecSal ;
   private String[] H00XO4_A396EmprCod ;
   private int[] H00XO4_A14AlbComCod ;
   private String[] H00XO4_A10740AlbComID ;
   private int[] H00XO4_A252CliCod ;
   private boolean[] H00XO4_n252CliCod ;
   private java.util.Date[] H00XO4_A10013AlbComFs ;
   private java.util.Date[] H00XO4_A4829AlbComHor ;
   private String[] H00XO5_A396EmprCod ;
   private int[] H00XO5_A323DevGenCod ;
   private String[] H00XO5_A10737DevATCodeI ;
   private boolean[] H00XO5_n10737DevATCodeI ;
   private int[] H00XO5_A252CliCod ;
   private boolean[] H00XO5_n252CliCod ;
   private java.util.Date[] H00XO5_A10073DevFHh ;
   private boolean[] H00XO5_n10073DevFHh ;
   private java.util.Date[] H00XO5_A5348DevHorSal ;
   private boolean[] H00XO5_n5348DevHorSal ;
   private short[] H00XO6_A2248ManCod ;
   private String[] H00XO6_A396EmprCod ;
   private int[] H00XO6_A2253SalExtAlb ;
   private String[] H00XO6_A10742SalCodeID ;
   private String[] H00XO6_A3302ManNif ;
   private boolean[] H00XO6_n3302ManNif ;
   private java.util.Date[] H00XO6_A10076SalFhh ;
   private String[] H00XO6_A6396SalExtHor ;
   private java.util.Date[] H00XO6_A2256SalExtFec ;
   private String[] H00XO7_A396EmprCod ;
   private int[] H00XO7_A11669DevCruId ;
   private String[] H00XO7_A11680DevCruAtId ;
   private int[] H00XO7_A252CliCod ;
   private boolean[] H00XO7_n252CliCod ;
   private java.util.Date[] H00XO7_A11676DevCruDtSy ;
   private java.util.Date[] H00XO7_A11673DevCruSal ;
   private String[] H00XO8_A396EmprCod ;
   private int[] H00XO8_A13418AlbProID ;
   private String[] H00XO8_A13436AlbProIDAT ;
   private String[] H00XO8_A13417AlbProTipo ;
   private int[] H00XO8_A13425AlbProCliC ;
   private int[] H00XO8_A13419AlbProPrvI ;
   private java.util.Date[] H00XO8_A13431AlbProSys ;
   private java.util.Date[] H00XO8_A13429AlbProSal ;
   private String[] H00XO9_A396EmprCod ;
   private int[] H00XO9_A252CliCod ;
   private boolean[] H00XO9_n252CliCod ;
   private String[] H00XO9_A278CliNif ;
   private String[] H00XO10_A396EmprCod ;
   private int[] H00XO10_A795PrvNum ;
   private String[] H00XO10_A793PrvNif ;
   private boolean[] H00XO10_n793PrvNif ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV60ObjetoCollection ;
}

final  class webwatdc01__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00XO2", "SELECT EmprCod FROM TXPEMPRES WHERE EmprCod = ? ORDER BY EmprCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00XO3", "SELECT EmprCod, AlbProCod, AlbLic, GuiRemCli, AlbHhfm, AlbHorSal, AlbFecSal FROM TXPCALPRD WHERE EmprCod = ? and AlbProCod = ? ORDER BY EmprCod, AlbProCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00XO4", "SELECT EmprCod, AlbComCod, AlbComID, CliCod, AlbComFs, AlbComHor FROM TXPCALCOM WHERE EmprCod = ? and AlbComCod = ? ORDER BY EmprCod, AlbComCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00XO5", "SELECT EmprCod, DevGenCod, DevATCodeI, CliCod, DevFHh, DevHorSal FROM TXPDEVGEN WHERE EmprCod = ? and DevGenCod = ? ORDER BY EmprCod, DevGenCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00XO6", "SELECT T1.ManCod, T1.EmprCod, T1.SalExtAlb, T1.SalCodeID, T2.ManNif, T1.SalFhh, T1.SalExtHor, T1.SalExtFec FROM (TXPCEXTSA T1 INNER JOIN TXPMANUFA T2 ON T2.EmprCod = T1.EmprCod AND T2.ManCod = T1.ManCod) WHERE T1.EmprCod = ? and T1.SalExtAlb = ? ORDER BY T1.EmprCod, T1.SalExtAlb ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00XO7", "SELECT EmprCod, DevCruId, DevCruAtId, CliCod, DevCruDtSy, DevCruSal FROM TXPDEVCRU WHERE EmprCod = ? and DevCruId = ? ORDER BY EmprCod, DevCruId ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00XO8", "SELECT EmprCod, AlbProID, AlbProIDAT, AlbProTipo, AlbProCliC, AlbProPrvI, AlbProSys, AlbProSal FROM TXPCALPRO WHERE EmprCod = ? and AlbProID = ? ORDER BY EmprCod, AlbProID ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00XO9", "SELECT EmprCod, CliCod, CliNif FROM TXPCLIENT WHERE EmprCod = ? and CliCod = ? ORDER BY EmprCod, CliCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00XO10", "SELECT EmprCod, PrvNum, PrvNif FROM TXPPRVGEN WHERE EmprCod = ? and PrvNum = ? ORDER BY EmprCod, PrvNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((long[]) buf[1])[0] = rslt.getLong(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDate(7);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((int[]) buf[4])[0] = rslt.getInt(4);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(6);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 4 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 20);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[7])[0] = rslt.getString(7, 8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(8);
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((java.util.Date[]) buf[6])[0] = rslt.getGXDateTime(7);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDateTime(8);
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setLong(2, ((Number) parms[1]).longValue());
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
            case 8 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

