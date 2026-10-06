package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class costesquimicosanalisis_impl extends GXDataArea
{
   public costesquimicosanalisis_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public costesquimicosanalisis_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( costesquimicosanalisis_impl.class ));
   }

   public costesquimicosanalisis_impl( int remoteHandle ,
                                       ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavHreracab = new HTMLChoice();
      chkavConsmanuales = UIFactory.getCheckbox(this);
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
      pa1582( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1582( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.costesquimicosanalisis", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39Calculo), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD2", GXutil.rtrim( AV34Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV35Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALCULO", GXutil.ltrim( localUtil.ntoc( AV39Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39Calculo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV36barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV37barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV38barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD3", GXutil.rtrim( AV25Maqcod3));
      app.GxWebStd.gx_hidden_field( httpContext, "vINTCOD3", GXutil.ltrim( localUtil.ntoc( AV26Intcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD3", GXutil.ltrim( localUtil.ntoc( AV27Tipcolcod3, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM3", GXutil.ltrim( localUtil.ntoc( AV28Barcolnum3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNOM3", GXutil.rtrim( AV29Barcolnom3));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPARTCOD3", GXutil.ltrim( localUtil.ntoc( AV30Tipartcod3, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vARTCOD3", GXutil.rtrim( AV31Artcod3));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD3", GXutil.ltrim( localUtil.ntoc( AV32Clicod3, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFEC3", localUtil.dtoc( AV33Fec3, 0, "/"));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      if ( ! ( WebComp_Wccostesquimicosanalisisdetalle == null ) )
      {
         WebComp_Wccostesquimicosanalisisdetalle.componentjscripts();
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
         we1582( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1582( ) ;
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
      return formatLink("app.costesquimicosanalisis", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "CostesQuimicosAnalisis" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Costes Quimicos Analisis", "") ;
   }

   public void wb1580( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavHreracab.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavHreracab.getInternalname(), httpContext.getMessage( "Receta", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavHreracab, cmbavHreracab.getInternalname(), GXutil.rtrim( AV5HreRacab), 1, cmbavHreracab.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavHreracab.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "", true, (byte)(0), "HLP_CostesQuimicosAnalisis.htm");
         cmbavHreracab.setValue( GXutil.rtrim( AV5HreRacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec1_Internalname, httpContext.getMessage( "Fecha Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec1_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec1_Internalname, localUtil.format(AV6Fec1, "99/99/99"), localUtil.format( AV6Fec1, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,38);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec1_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec1_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec1_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CostesQuimicosAnalisis.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFec2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFec2_Internalname, httpContext.getMessage( "Fecha Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavFec2_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFec2_Internalname, localUtil.format(AV7Fec2, "99/99/99"), localUtil.format( AV7Fec2, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFec2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFec2_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavFec2_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavFec2_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_CostesQuimicosAnalisis.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod1_Internalname, httpContext.getMessage( "Cliente Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV8Clicod1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8Clicod1), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8Clicod1), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod1_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod2_Internalname, httpContext.getMessage( "Cliente Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV9Clicod2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV9Clicod2), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV9Clicod2), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod2_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod1_Internalname, httpContext.getMessage( "Articulo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod1_Internalname, GXutil.rtrim( AV10ARtcod1), GXutil.rtrim( localUtil.format( AV10ARtcod1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,62);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod1_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavArtcod2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavArtcod2_Internalname, httpContext.getMessage( "Articulo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavArtcod2_Internalname, GXutil.rtrim( AV11Artcod2), GXutil.rtrim( localUtil.format( AV11Artcod2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavArtcod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavArtcod2_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipartcod1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipartcod1_Internalname, httpContext.getMessage( "Tipos Artículo Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 74,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV20TipArtCod1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipartcod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20TipArtCod1), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20TipArtCod1), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,74);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipartcod1_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipartcod2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipartcod2_Internalname, httpContext.getMessage( "Tipos Artículo Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipartcod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV21TipArtCod2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipartcod2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21TipArtCod2), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV21TipArtCod2), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,78);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipartcod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipartcod2_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom1_Internalname, httpContext.getMessage( "Color Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 86,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom1_Internalname, GXutil.rtrim( AV12Barcolnom1), GXutil.rtrim( localUtil.format( AV12Barcolnom1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,86);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom1_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum1_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum1_Internalname, GXutil.ltrim( localUtil.ntoc( AV13Barcolnum1, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13Barcolnum1), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13Barcolnum1), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum1_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnom2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom2_Internalname, httpContext.getMessage( "Color Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom2_Internalname, GXutil.rtrim( AV14barcolnom2), GXutil.rtrim( localUtil.format( AV14barcolnom2, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,94);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnom2_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcolnum2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnum2_Internalname, httpContext.getMessage( "Numero", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnum2_Internalname, GXutil.ltrim( localUtil.ntoc( AV15Barcolnum2, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcolnum2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15Barcolnum2), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15Barcolnum2), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnum2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcolnum2_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolcod1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcolcod1_Internalname, httpContext.getMessage( "Tc Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV16Tipcolcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcolcod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV16Tipcolcod1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV16Tipcolcod1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcod1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTipcolcod2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTipcolcod2_Internalname, httpContext.getMessage( "Tc Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 110,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTipcolcod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV17TipColcod2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTipcolcod2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17TipColcod2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV17TipColcod2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,110);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTipcolcod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTipcolcod2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntcod1_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntcod1_Internalname, httpContext.getMessage( "Intensidad Inicial", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 118,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcod1_Internalname, GXutil.ltrim( localUtil.ntoc( AV18Intcod1, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntcod1_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18Intcod1), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV18Intcod1), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,118);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcod1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntcod1_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavIntcod2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIntcod2_Internalname, httpContext.getMessage( "Intensidad Final", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 122,'',false,'',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIntcod2_Internalname, GXutil.ltrim( localUtil.ntoc( AV19Intcod2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIntcod2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19Intcod2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV19Intcod2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,122);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIntcod2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIntcod2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_CostesQuimicosAnalisis.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divTabla_masopciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 130,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "", httpContext.getMessage( "Ver Resultado", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Ver Resultado", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111581_client"+"'", TempTags, "", 2, "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 132,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninformeporproducto_Internalname, "", httpContext.getMessage( "Informe por producto (Excel)", ""), bttBtninformeporproducto_Jsonclick, 5, httpContext.getMessage( "Informe por producto (Excel)", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINFORMEPORPRODUCTO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 134,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportarcsv_Internalname, "", httpContext.getMessage( "Informe CSV", ""), bttBtnexportarcsv_Jsonclick, 5, httpContext.getMessage( "Informe CSV", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTARCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "", httpContext.getMessage( "Salir", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Salir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_CostesQuimicosAnalisis.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_139_1582( true) ;
      }
      else
      {
         wb_table1_139_1582( false) ;
      }
      return  ;
   }

   public void wb_table1_139_1582e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         if ( ! isFullAjaxMode( ) )
         {
            /* WebComponent */
            app.GxWebStd.gx_hidden_field( httpContext, "W0153"+"", GXutil.rtrim( WebComp_Wccostesquimicosanalisisdetalle_Component));
            httpContext.writeText( "<div") ;
            app.GxWebStd.classAttribute( httpContext, "gxwebcomponent");
            httpContext.writeText( " id=\""+"gxHTMLWrpW0153"+""+"\""+"") ;
            httpContext.writeText( ">") ;
            if ( GXutil.len( WebComp_Wccostesquimicosanalisisdetalle_Component) != 0 )
            {
               if ( GXutil.strcmp(GXutil.lower( OldWccostesquimicosanalisisdetalle), GXutil.lower( WebComp_Wccostesquimicosanalisisdetalle_Component)) != 0 )
               {
                  httpContext.ajax_rspStartCmp("gxHTMLWrpW0153"+"");
               }
               WebComp_Wccostesquimicosanalisisdetalle.componentdraw();
               if ( GXutil.strcmp(GXutil.lower( OldWccostesquimicosanalisisdetalle), GXutil.lower( WebComp_Wccostesquimicosanalisisdetalle_Component)) != 0 )
               {
                  httpContext.ajax_rspEndCmp();
               }
            }
            httpContext.writeText( "</div>") ;
         }
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      wbLoad = true ;
   }

   public void start1582( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Costes Quimicos Analisis", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1580( ) ;
   }

   public void ws1582( )
   {
      start1582( ) ;
      evt1582( ) ;
   }

   public void evt1582( )
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
                           e121582 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINFORMEPORPRODUCTO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInformeporproducto' */
                           e131582 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTARCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportarCSV' */
                           e141582 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e151582 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LOAD") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: Load */
                           e161582 ();
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
                  else if ( GXutil.strcmp(sEvtType, "W") == 0 )
                  {
                     sEvtType = GXutil.left( sEvt, 4) ;
                     sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-4) ;
                     nCmpId = (short)(GXutil.lval( sEvtType)) ;
                     if ( nCmpId == 153 )
                     {
                        OldWccostesquimicosanalisisdetalle = httpContext.cgiGet( "W0153") ;
                        if ( ( GXutil.len( OldWccostesquimicosanalisisdetalle) == 0 ) || ( GXutil.strcmp(OldWccostesquimicosanalisisdetalle, WebComp_Wccostesquimicosanalisisdetalle_Component) != 0 ) )
                        {
                           WebComp_Wccostesquimicosanalisisdetalle = WebUtils.getWebComponent(getClass(), "app." + OldWccostesquimicosanalisisdetalle + "_impl", remoteHandle, context);
                           WebComp_Wccostesquimicosanalisisdetalle_Component = OldWccostesquimicosanalisisdetalle ;
                        }
                        if ( GXutil.len( WebComp_Wccostesquimicosanalisisdetalle_Component) != 0 )
                        {
                           WebComp_Wccostesquimicosanalisisdetalle.componentprocess("W0153", "", sEvt);
                        }
                        WebComp_Wccostesquimicosanalisisdetalle_Component = OldWccostesquimicosanalisisdetalle ;
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void we1582( )
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

   public void pa1582( )
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
            GX_FocusControl = cmbavHreracab.getInternalname() ;
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
      if ( cmbavHreracab.getItemCount() > 0 )
      {
         AV5HreRacab = cmbavHreracab.getValidValue(AV5HreRacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5HreRacab", AV5HreRacab);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavHreracab.setValue( GXutil.rtrim( AV5HreRacab) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
      }
      AV42ConsManuales = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV42ConsManuales, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ConsManuales", GXutil.str( AV42ConsManuales, 1, 0));
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rf1582( ) ;
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

   public void rf1582( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         if ( 1 != 0 )
         {
            if ( GXutil.len( WebComp_Wccostesquimicosanalisisdetalle_Component) != 0 )
            {
               WebComp_Wccostesquimicosanalisisdetalle.componentstart();
            }
         }
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         /* Execute user event: Load */
         e161582 ();
         wb1580( ) ;
      }
   }

   public void send_integrity_lvl_hashes1582( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD2", GXutil.rtrim( AV34Maqcod2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMAQCOD2", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV34Maqcod2, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vCALCULO", GXutil.ltrim( localUtil.ntoc( AV39Calculo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCALCULO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39Calculo), "9")));
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strup1580( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e121582 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         AV38barcodpar = httpContext.cgiGet( "vBARCODPAR") ;
         AV37barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV36barcod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39Calculo = (byte)(localUtil.ctol( httpContext.cgiGet( "vCALCULO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV35Emprcod = httpContext.cgiGet( "vEMPRCOD") ;
         AV34Maqcod2 = httpContext.cgiGet( "vMAQCOD2") ;
         AV25Maqcod3 = httpContext.cgiGet( "vMAQCOD3") ;
         AV26Intcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( "vINTCOD3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV27Tipcolcod3 = (byte)(localUtil.ctol( httpContext.cgiGet( "vTIPCOLCOD3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV28Barcolnum3 = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOLNUM3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV29Barcolnom3 = httpContext.cgiGet( "vBARCOLNOM3") ;
         AV30Tipartcod3 = (short)(localUtil.ctol( httpContext.cgiGet( "vTIPARTCOD3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV31Artcod3 = httpContext.cgiGet( "vARTCOD3") ;
         AV32Clicod3 = (int)(localUtil.ctol( httpContext.cgiGet( "vCLICOD3"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV33Fec3 = localUtil.ctod( httpContext.cgiGet( "vFEC3"), 0) ;
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
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
         /* Read variables values. */
         cmbavHreracab.setValue( httpContext.cgiGet( cmbavHreracab.getInternalname()) );
         AV5HreRacab = httpContext.cgiGet( cmbavHreracab.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5HreRacab", AV5HreRacab);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec1_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC1");
            GX_FocusControl = edtavFec1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6Fec1 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Fec1", localUtil.format(AV6Fec1, "99/99/99"));
         }
         else
         {
            AV6Fec1 = localUtil.ctod( httpContext.cgiGet( edtavFec1_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6Fec1", localUtil.format(AV6Fec1, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavFec2_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vFEC2");
            GX_FocusControl = edtavFec2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7Fec2 = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Fec2", localUtil.format(AV7Fec2, "99/99/99"));
         }
         else
         {
            AV7Fec2 = localUtil.ctod( httpContext.cgiGet( edtavFec2_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7Fec2", localUtil.format(AV7Fec2, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD1");
            GX_FocusControl = edtavClicod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8Clicod1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod1), 6, 0));
         }
         else
         {
            AV8Clicod1 = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod1), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD2");
            GX_FocusControl = edtavClicod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV9Clicod2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Clicod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Clicod2), 6, 0));
         }
         else
         {
            AV9Clicod2 = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9Clicod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Clicod2), 6, 0));
         }
         AV10ARtcod1 = httpContext.cgiGet( edtavArtcod1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10ARtcod1", AV10ARtcod1);
         AV11Artcod2 = httpContext.cgiGet( edtavArtcod2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Artcod2", AV11Artcod2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCOD1");
            GX_FocusControl = edtavTipartcod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20TipArtCod1 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TipArtCod1), 4, 0));
         }
         else
         {
            AV20TipArtCod1 = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TipArtCod1), 4, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipartcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPARTCOD2");
            GX_FocusControl = edtavTipartcod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21TipArtCod2 = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TipArtCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TipArtCod2), 4, 0));
         }
         else
         {
            AV21TipArtCod2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavTipartcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21TipArtCod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21TipArtCod2), 4, 0));
         }
         AV12Barcolnom1 = httpContext.cgiGet( edtavBarcolnom1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV12Barcolnom1", AV12Barcolnom1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM1");
            GX_FocusControl = edtavBarcolnum1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13Barcolnum1 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barcolnum1), 6, 0));
         }
         else
         {
            AV13Barcolnum1 = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barcolnum1), 6, 0));
         }
         AV14barcolnom2 = httpContext.cgiGet( edtavBarcolnom2_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14barcolnom2", AV14barcolnom2);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcolnum2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOLNUM2");
            GX_FocusControl = edtavBarcolnum2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15Barcolnum2 = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Barcolnum2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Barcolnum2), 6, 0));
         }
         else
         {
            AV15Barcolnum2 = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcolnum2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Barcolnum2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Barcolnum2), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCOD1");
            GX_FocusControl = edtavTipcolcod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16Tipcolcod1 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Tipcolcod1), 2, 0));
         }
         else
         {
            AV16Tipcolcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Tipcolcod1), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTipcolcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTIPCOLCOD2");
            GX_FocusControl = edtavTipcolcod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17TipColcod2 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TipColcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TipColcod2), 2, 0));
         }
         else
         {
            AV17TipColcod2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTipcolcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17TipColcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17TipColcod2), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTCOD1");
            GX_FocusControl = edtavIntcod1_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV18Intcod1 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Intcod1), 2, 0));
         }
         else
         {
            AV18Intcod1 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIntcod1_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV18Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Intcod1), 2, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIntcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINTCOD2");
            GX_FocusControl = edtavIntcod2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19Intcod2 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Intcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Intcod2), 2, 0));
         }
         else
         {
            AV19Intcod2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavIntcod2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19Intcod2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19Intcod2), 2, 0));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavConsmanuales.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavConsmanuales.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCONSMANUALES");
            GX_FocusControl = chkavConsmanuales.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42ConsManuales = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42ConsManuales", GXutil.str( AV42ConsManuales, 1, 0));
         }
         else
         {
            AV42ConsManuales = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavConsmanuales.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42ConsManuales", GXutil.str( AV42ConsManuales, 1, 0));
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
      e121582 ();
      if (returnInSub) return;
   }

   public void e121582( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      costesquimicosanalisis_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      GXv_char2[0] = AV35Emprcod ;
      GXv_char3[0] = AV23EmprNom ;
      GXv_char4[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      costesquimicosanalisis_impl.this.AV35Emprcod = GXv_char2[0] ;
      costesquimicosanalisis_impl.this.AV23EmprNom = GXv_char3[0] ;
      costesquimicosanalisis_impl.this.AV24UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Emprcod", AV35Emprcod);
      AV6Fec1 = GXutil.dadd(GXutil.today( ),-(30)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Fec1", localUtil.format(AV6Fec1, "99/99/99"));
      AV7Fec2 = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Fec2", localUtil.format(AV7Fec2, "99/99/99"));
      AV5HreRacab = httpContext.getMessage( "T", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5HreRacab", AV5HreRacab);
      if ( 1 == 0 )
      {
         GXt_char1 = AV22Station ;
         GXv_char4[0] = GXt_char1 ;
         new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
         costesquimicosanalisis_impl.this.GXt_char1 = GXv_char4[0] ;
         AV22Station = GXt_char1 ;
         GXv_char4[0] = AV35Emprcod ;
         GXv_char3[0] = AV23EmprNom ;
         GXv_char2[0] = AV24UsurCod ;
         new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char4, GXv_char3, GXv_char2) ;
         costesquimicosanalisis_impl.this.AV35Emprcod = GXv_char4[0] ;
         costesquimicosanalisis_impl.this.AV23EmprNom = GXv_char3[0] ;
         costesquimicosanalisis_impl.this.AV24UsurCod = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV35Emprcod", AV35Emprcod);
         /* Object Property */
         if ( true )
         {
            bDynCreated_Wccostesquimicosanalisisdetalle = true ;
         }
         if ( GXutil.strcmp(GXutil.lower( WebComp_Wccostesquimicosanalisisdetalle_Component), GXutil.lower( "CostesQuimicosAnalisisDetalle")) != 0 )
         {
            WebComp_Wccostesquimicosanalisisdetalle = WebUtils.getWebComponent(getClass(), "app.costesquimicosanalisisdetalle_impl", remoteHandle, context);
            WebComp_Wccostesquimicosanalisisdetalle_Component = "CostesQuimicosAnalisisDetalle" ;
         }
         if ( GXutil.len( WebComp_Wccostesquimicosanalisisdetalle_Component) != 0 )
         {
            WebComp_Wccostesquimicosanalisisdetalle.setjustcreated();
            WebComp_Wccostesquimicosanalisisdetalle.componentprepare(new Object[] {"W0153","",AV35Emprcod,AV5HreRacab,AV6Fec1,AV7Fec2,Byte.valueOf(AV39Calculo),Integer.valueOf(AV36barcod),Byte.valueOf(AV37barcodreo),AV38barcodpar,AV10ARtcod1,AV31Artcod3,AV12Barcolnom1,AV29Barcolnom3,Integer.valueOf(AV13Barcolnum1),Integer.valueOf(AV28Barcolnum3),Integer.valueOf(AV8Clicod1),Integer.valueOf(AV32Clicod3),Byte.valueOf(AV18Intcod1),Byte.valueOf(AV26Intcod3),Short.valueOf(AV20TipArtCod1),Short.valueOf(AV30Tipartcod3),Byte.valueOf(AV16Tipcolcod1),Byte.valueOf(AV27Tipcolcod3)});
            WebComp_Wccostesquimicosanalisisdetalle.componentbind(new Object[] {"","vHRERACAB","vFEC1","vFEC2","","","","","vARTCOD1","","vBARCOLNOM1","","vBARCOLNUM1","","vCLICOD1","","vINTCOD1","","vTIPARTCOD1","","vTIPCOLCOD1",""});
         }
      }
   }

   public void e131582( )
   {
      /* 'DoInformeporproducto' Routine */
      returnInSub = false ;
      AV33Fec3 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV7Fec2)) ? GXutil.today( ) : AV7Fec2) ;
      AV32Clicod3 = ((0==AV9Clicod2) ? 999999 : AV9Clicod2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicod3), 6, 0));
      AV31Artcod3 = ((GXutil.strcmp("", AV11Artcod2)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV11Artcod2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Artcod3", AV31Artcod3);
      AV30Tipartcod3 = (short)(((0==AV21TipArtCod2) ? 9999 : AV21TipArtCod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Tipartcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Tipartcod3), 4, 0));
      AV29Barcolnom3 = ((GXutil.strcmp("", AV14barcolnom2)==0) ? httpContext.getMessage( "zzzzzzzzzzzzz", "") : AV14barcolnom2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Barcolnom3", AV29Barcolnom3);
      AV28Barcolnum3 = ((0==AV15Barcolnum2) ? 999999 : AV15Barcolnum2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Barcolnum3), 6, 0));
      AV27Tipcolcod3 = (byte)(((0==AV17TipColcod2) ? 99 : AV17TipColcod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Tipcolcod3), 2, 0));
      AV26Intcod3 = (byte)(((0==AV19Intcod2) ? 99 : AV19Intcod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Intcod3), 2, 0));
      AV25Maqcod3 = ((GXutil.strcmp("", AV34Maqcod2)==0) ? httpContext.getMessage( "ZZZZZZ", "") : AV34Maqcod2) ;
      GXv_char4[0] = AV35Emprcod ;
      GXv_char3[0] = AV5HreRacab ;
      GXv_date5[0] = AV6Fec1 ;
      GXv_date6[0] = AV33Fec3 ;
      GXv_char2[0] = AV10ARtcod1 ;
      GXv_char7[0] = AV31Artcod3 ;
      GXv_char8[0] = AV12Barcolnom1 ;
      GXv_char9[0] = AV29Barcolnom3 ;
      GXv_int10[0] = AV13Barcolnum1 ;
      GXv_int11[0] = AV28Barcolnum3 ;
      GXv_int12[0] = AV8Clicod1 ;
      GXv_int13[0] = AV32Clicod3 ;
      GXv_int14[0] = AV18Intcod1 ;
      GXv_int15[0] = AV26Intcod3 ;
      GXv_int16[0] = AV20TipArtCod1 ;
      GXv_int17[0] = AV30Tipartcod3 ;
      GXv_int18[0] = AV16Tipcolcod1 ;
      GXv_int19[0] = AV27Tipcolcod3 ;
      GXv_int20[0] = AV36barcod ;
      GXv_int21[0] = AV37barcodreo ;
      GXv_char22[0] = AV38barcodpar ;
      GXv_int23[0] = AV42ConsManuales ;
      GXv_char24[0] = AV40ExcelFilename ;
      GXv_char25[0] = AV41ErrorMessage ;
      new app.informeproductosconsumos(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date5, GXv_date6, GXv_char2, GXv_char7, GXv_char8, GXv_char9, GXv_int10, GXv_int11, GXv_int12, GXv_int13, GXv_int14, GXv_int15, GXv_int16, GXv_int17, GXv_int18, GXv_int19, GXv_int20, GXv_int21, GXv_char22, GXv_int23, GXv_char24, GXv_char25) ;
      costesquimicosanalisis_impl.this.AV35Emprcod = GXv_char4[0] ;
      costesquimicosanalisis_impl.this.AV5HreRacab = GXv_char3[0] ;
      costesquimicosanalisis_impl.this.AV6Fec1 = GXv_date5[0] ;
      costesquimicosanalisis_impl.this.AV33Fec3 = GXv_date6[0] ;
      costesquimicosanalisis_impl.this.AV10ARtcod1 = GXv_char2[0] ;
      costesquimicosanalisis_impl.this.AV31Artcod3 = GXv_char7[0] ;
      costesquimicosanalisis_impl.this.AV12Barcolnom1 = GXv_char8[0] ;
      costesquimicosanalisis_impl.this.AV29Barcolnom3 = GXv_char9[0] ;
      costesquimicosanalisis_impl.this.AV13Barcolnum1 = GXv_int10[0] ;
      costesquimicosanalisis_impl.this.AV28Barcolnum3 = GXv_int11[0] ;
      costesquimicosanalisis_impl.this.AV8Clicod1 = GXv_int12[0] ;
      costesquimicosanalisis_impl.this.AV32Clicod3 = GXv_int13[0] ;
      costesquimicosanalisis_impl.this.AV18Intcod1 = GXv_int14[0] ;
      costesquimicosanalisis_impl.this.AV26Intcod3 = GXv_int15[0] ;
      costesquimicosanalisis_impl.this.AV20TipArtCod1 = GXv_int16[0] ;
      costesquimicosanalisis_impl.this.AV30Tipartcod3 = GXv_int17[0] ;
      costesquimicosanalisis_impl.this.AV16Tipcolcod1 = GXv_int18[0] ;
      costesquimicosanalisis_impl.this.AV27Tipcolcod3 = GXv_int19[0] ;
      costesquimicosanalisis_impl.this.AV36barcod = GXv_int20[0] ;
      costesquimicosanalisis_impl.this.AV37barcodreo = GXv_int21[0] ;
      costesquimicosanalisis_impl.this.AV38barcodpar = GXv_char22[0] ;
      costesquimicosanalisis_impl.this.AV42ConsManuales = GXv_int23[0] ;
      costesquimicosanalisis_impl.this.AV40ExcelFilename = GXv_char24[0] ;
      costesquimicosanalisis_impl.this.AV41ErrorMessage = GXv_char25[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV35Emprcod", AV35Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV5HreRacab", AV5HreRacab);
      httpContext.ajax_rsp_assign_attri("", false, "AV6Fec1", localUtil.format(AV6Fec1, "99/99/99"));
      httpContext.ajax_rsp_assign_attri("", false, "AV10ARtcod1", AV10ARtcod1);
      httpContext.ajax_rsp_assign_attri("", false, "AV31Artcod3", AV31Artcod3);
      httpContext.ajax_rsp_assign_attri("", false, "AV12Barcolnom1", AV12Barcolnom1);
      httpContext.ajax_rsp_assign_attri("", false, "AV29Barcolnom3", AV29Barcolnom3);
      httpContext.ajax_rsp_assign_attri("", false, "AV13Barcolnum1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13Barcolnum1), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV28Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Barcolnum3), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Clicod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8Clicod1), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV32Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicod3), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV18Intcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Intcod1), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV26Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Intcod3), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV20TipArtCod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20TipArtCod1), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV30Tipartcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Tipartcod3), 4, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV16Tipcolcod1", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16Tipcolcod1), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV27Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Tipcolcod3), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV36barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV37barcodreo", GXutil.str( AV37barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV38barcodpar", AV38barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV42ConsManuales", GXutil.str( AV42ConsManuales, 1, 0));
      if ( GXutil.strcmp(AV40ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV40ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV41ErrorMessage);
      }
      /*  Sending Event outputs  */
      cmbavHreracab.setValue( GXutil.rtrim( AV5HreRacab) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavHreracab.getInternalname(), "Values", cmbavHreracab.ToJavascriptSource(), true);
   }

   public void e141582( )
   {
      /* 'DoExportarCSV' Routine */
      returnInSub = false ;
      AV33Fec3 = (GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV7Fec2)) ? GXutil.today( ) : AV7Fec2) ;
      AV32Clicod3 = ((0==AV9Clicod2) ? 999999 : AV9Clicod2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Clicod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32Clicod3), 6, 0));
      AV31Artcod3 = ((GXutil.strcmp("", AV11Artcod2)==0) ? httpContext.getMessage( "zzzzzzzzzzzzzzzz", "") : AV11Artcod2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Artcod3", AV31Artcod3);
      AV30Tipartcod3 = (short)(((0==AV21TipArtCod2) ? 9999 : AV21TipArtCod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Tipartcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30Tipartcod3), 4, 0));
      AV29Barcolnom3 = ((GXutil.strcmp("", AV14barcolnom2)==0) ? httpContext.getMessage( "zzzzzzzzzzzzz", "") : AV14barcolnom2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29Barcolnom3", AV29Barcolnom3);
      AV28Barcolnum3 = ((0==AV15Barcolnum2) ? 999999 : AV15Barcolnum2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Barcolnum3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28Barcolnum3), 6, 0));
      AV27Tipcolcod3 = (byte)(((0==AV17TipColcod2) ? 99 : AV17TipColcod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27Tipcolcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Tipcolcod3), 2, 0));
      AV26Intcod3 = (byte)(((0==AV19Intcod2) ? 99 : AV19Intcod2)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Intcod3", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26Intcod3), 2, 0));
      AV25Maqcod3 = ((GXutil.strcmp("", AV34Maqcod2)==0) ? httpContext.getMessage( "ZZZZZZ", "") : AV34Maqcod2) ;
      callWebObject(formatLink("app.costesquimicosanalisisdetalleexportcsv", new String[] {}, new String[] {"Emprcod","HreRacab","Fec1","Fec2","Calculo","barcod","barcodreo","barcodpar","ARtcod1","ARtcod3","Barcolnom1","Barcolnom3","Barcolnum1","Barcolnum3","Clicod1","Clicod3","Intcod1","Intcod3","TipArtCod1","TipArtCod3","Tipcolcod1","Tipcolcod3"}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void e151582( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   protected void nextLoad( )
   {
   }

   protected void e161582( )
   {
      /* Load Routine */
      returnInSub = false ;
   }

   public void wb_table1_139_1582( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedconsmanuales_Internalname, tblTablemergedconsmanuales_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavConsmanuales.getInternalname(), httpContext.getMessage( "Cons Manuales", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavConsmanuales.getInternalname(), GXutil.str( AV42ConsManuales, 1, 0), "", httpContext.getMessage( "Cons Manuales", ""), 1, chkavConsmanuales.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(143, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,143);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblConsmanuales_righttext_Internalname, httpContext.getMessage( "Informe Productos, incluir Consumos Manuales?", ""), "", "", lblConsmanuales_righttext_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "DataDescription", 0, "", 1, 1, 0, (short)(0), "HLP_CostesQuimicosAnalisis.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_139_1582e( true) ;
      }
      else
      {
         wb_table1_139_1582e( false) ;
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
      pa1582( ) ;
      ws1582( ) ;
      we1582( ) ;
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
      if ( ! ( WebComp_Wccostesquimicosanalisisdetalle == null ) )
      {
         if ( GXutil.len( WebComp_Wccostesquimicosanalisisdetalle_Component) != 0 )
         {
            WebComp_Wccostesquimicosanalisisdetalle.componentthemes();
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016424595", true, true);
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
      httpContext.AddJavascriptSource("costesquimicosanalisis.js", "?202661016424595", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      cmbavHreracab.setInternalname( "vHRERACAB" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      edtavFec1_Internalname = "vFEC1" ;
      edtavFec2_Internalname = "vFEC2" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavClicod1_Internalname = "vCLICOD1" ;
      edtavClicod2_Internalname = "vCLICOD2" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      edtavArtcod1_Internalname = "vARTCOD1" ;
      edtavArtcod2_Internalname = "vARTCOD2" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavTipartcod1_Internalname = "vTIPARTCOD1" ;
      edtavTipartcod2_Internalname = "vTIPARTCOD2" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      edtavBarcolnom1_Internalname = "vBARCOLNOM1" ;
      edtavBarcolnum1_Internalname = "vBARCOLNUM1" ;
      edtavBarcolnom2_Internalname = "vBARCOLNOM2" ;
      edtavBarcolnum2_Internalname = "vBARCOLNUM2" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      edtavTipcolcod1_Internalname = "vTIPCOLCOD1" ;
      edtavTipcolcod2_Internalname = "vTIPCOLCOD2" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      edtavIntcod1_Internalname = "vINTCOD1" ;
      edtavIntcod2_Internalname = "vINTCOD2" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtninformeporproducto_Internalname = "BTNINFORMEPORPRODUCTO" ;
      bttBtnexportarcsv_Internalname = "BTNEXPORTARCSV" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      chkavConsmanuales.setInternalname( "vCONSMANUALES" );
      lblConsmanuales_righttext_Internalname = "CONSMANUALES_RIGHTTEXT" ;
      tblTablemergedconsmanuales_Internalname = "TABLEMERGEDCONSMANUALES" ;
      divTabla_masopciones_Internalname = "TABLA_MASOPCIONES" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
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
      chkavConsmanuales.setEnabled( 1 );
      edtavIntcod2_Jsonclick = "" ;
      edtavIntcod2_Enabled = 1 ;
      edtavIntcod1_Jsonclick = "" ;
      edtavIntcod1_Enabled = 1 ;
      edtavTipcolcod2_Jsonclick = "" ;
      edtavTipcolcod2_Enabled = 1 ;
      edtavTipcolcod1_Jsonclick = "" ;
      edtavTipcolcod1_Enabled = 1 ;
      edtavBarcolnum2_Jsonclick = "" ;
      edtavBarcolnum2_Enabled = 1 ;
      edtavBarcolnom2_Jsonclick = "" ;
      edtavBarcolnom2_Enabled = 1 ;
      edtavBarcolnum1_Jsonclick = "" ;
      edtavBarcolnum1_Enabled = 1 ;
      edtavBarcolnom1_Jsonclick = "" ;
      edtavBarcolnom1_Enabled = 1 ;
      edtavTipartcod2_Jsonclick = "" ;
      edtavTipartcod2_Enabled = 1 ;
      edtavTipartcod1_Jsonclick = "" ;
      edtavTipartcod1_Enabled = 1 ;
      edtavArtcod2_Jsonclick = "" ;
      edtavArtcod2_Enabled = 1 ;
      edtavArtcod1_Jsonclick = "" ;
      edtavArtcod1_Enabled = 1 ;
      edtavClicod2_Jsonclick = "" ;
      edtavClicod2_Enabled = 1 ;
      edtavClicod1_Jsonclick = "" ;
      edtavClicod1_Enabled = 1 ;
      edtavFec2_Jsonclick = "" ;
      edtavFec2_Enabled = 1 ;
      edtavFec1_Jsonclick = "" ;
      edtavFec1_Enabled = 1 ;
      cmbavHreracab.setJsonclick( "" );
      cmbavHreracab.setEnabled( 1 );
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Resultado", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Filtros", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Generales", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Costes Quimicos Analisis", "") );
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavHreracab.setName( "vHRERACAB" );
      cmbavHreracab.setWebtags( "" );
      cmbavHreracab.addItem("T", httpContext.getMessage( "Todas", ""), (short)(0));
      cmbavHreracab.addItem("", httpContext.getMessage( "Tinte", ""), (short)(0));
      cmbavHreracab.addItem("S", httpContext.getMessage( "Acabados", ""), (short)(0));
      if ( cmbavHreracab.getItemCount() > 0 )
      {
         AV5HreRacab = cmbavHreracab.getValidValue(AV5HreRacab) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5HreRacab", AV5HreRacab);
      }
      chkavConsmanuales.setName( "vCONSMANUALES" );
      chkavConsmanuales.setWebtags( "" );
      chkavConsmanuales.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavConsmanuales.getInternalname(), "TitleCaption", chkavConsmanuales.getCaption(), true);
      chkavConsmanuales.setCheckedValue( "0" );
      AV42ConsManuales = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV42ConsManuales, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42ConsManuales", GXutil.str( AV42ConsManuales, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'AV42ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV34Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV39Calculo',fld:'vCALCULO',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111581',iparms:[{av:'AV7Fec2',fld:'vFEC2',pic:''},{av:'AV9Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV11Artcod2',fld:'vARTCOD2',pic:''},{av:'AV21TipArtCod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV14barcolnom2',fld:'vBARCOLNOM2',pic:''},{av:'AV15Barcolnum2',fld:'vBARCOLNUM2',pic:'ZZZZZ9'},{av:'AV17TipColcod2',fld:'vTIPCOLCOD2',pic:'Z9'},{av:'AV19Intcod2',fld:'vINTCOD2',pic:'Z9'},{av:'AV34Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV35Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavHreracab'},{av:'AV5HreRacab',fld:'vHRERACAB',pic:''},{av:'AV6Fec1',fld:'vFEC1',pic:''},{av:'AV39Calculo',fld:'vCALCULO',pic:'9',hsh:true},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV10ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV12Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV13Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV8Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV18Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV20TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV16Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV32Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV31Artcod3',fld:'vARTCOD3',pic:''},{av:'AV30Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV29Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV28Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV27Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV26Intcod3',fld:'vINTCOD3',pic:'Z9'},{ctrl:'WCCOSTESQUIMICOSANALISISDETALLE'}]}");
      setEventMetadata("'DOINFORMEPORPRODUCTO'","{handler:'e131582',iparms:[{av:'AV7Fec2',fld:'vFEC2',pic:''},{av:'AV9Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV11Artcod2',fld:'vARTCOD2',pic:''},{av:'AV21TipArtCod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV14barcolnom2',fld:'vBARCOLNOM2',pic:''},{av:'AV15Barcolnum2',fld:'vBARCOLNUM2',pic:'ZZZZZ9'},{av:'AV17TipColcod2',fld:'vTIPCOLCOD2',pic:'Z9'},{av:'AV19Intcod2',fld:'vINTCOD2',pic:'Z9'},{av:'AV34Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true},{av:'AV35Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'cmbavHreracab'},{av:'AV5HreRacab',fld:'vHRERACAB',pic:''},{av:'AV6Fec1',fld:'vFEC1',pic:''},{av:'AV10ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV12Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV13Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV8Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV18Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV20TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV16Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV42ConsManuales',fld:'vCONSMANUALES',pic:'9'}]");
      setEventMetadata("'DOINFORMEPORPRODUCTO'",",oparms:[{av:'AV32Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV31Artcod3',fld:'vARTCOD3',pic:''},{av:'AV30Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV29Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV28Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV27Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV26Intcod3',fld:'vINTCOD3',pic:'Z9'},{av:'AV42ConsManuales',fld:'vCONSMANUALES',pic:'9'},{av:'AV38barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV37barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV36barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV16Tipcolcod1',fld:'vTIPCOLCOD1',pic:'Z9'},{av:'AV20TipArtCod1',fld:'vTIPARTCOD1',pic:'ZZZ9'},{av:'AV18Intcod1',fld:'vINTCOD1',pic:'Z9'},{av:'AV8Clicod1',fld:'vCLICOD1',pic:'ZZZZZ9'},{av:'AV13Barcolnum1',fld:'vBARCOLNUM1',pic:'ZZZZZ9'},{av:'AV12Barcolnom1',fld:'vBARCOLNOM1',pic:''},{av:'AV10ARtcod1',fld:'vARTCOD1',pic:''},{av:'AV6Fec1',fld:'vFEC1',pic:''},{av:'cmbavHreracab'},{av:'AV5HreRacab',fld:'vHRERACAB',pic:''},{av:'AV35Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOEXPORTARCSV'","{handler:'e141582',iparms:[{av:'AV7Fec2',fld:'vFEC2',pic:''},{av:'AV9Clicod2',fld:'vCLICOD2',pic:'ZZZZZ9'},{av:'AV11Artcod2',fld:'vARTCOD2',pic:''},{av:'AV21TipArtCod2',fld:'vTIPARTCOD2',pic:'ZZZ9'},{av:'AV14barcolnom2',fld:'vBARCOLNOM2',pic:''},{av:'AV15Barcolnum2',fld:'vBARCOLNUM2',pic:'ZZZZZ9'},{av:'AV17TipColcod2',fld:'vTIPCOLCOD2',pic:'Z9'},{av:'AV19Intcod2',fld:'vINTCOD2',pic:'Z9'},{av:'AV34Maqcod2',fld:'vMAQCOD2',pic:'',hsh:true}]");
      setEventMetadata("'DOEXPORTARCSV'",",oparms:[{av:'AV32Clicod3',fld:'vCLICOD3',pic:'ZZZZZ9'},{av:'AV31Artcod3',fld:'vARTCOD3',pic:''},{av:'AV30Tipartcod3',fld:'vTIPARTCOD3',pic:'ZZZ9'},{av:'AV29Barcolnom3',fld:'vBARCOLNOM3',pic:''},{av:'AV28Barcolnum3',fld:'vBARCOLNUM3',pic:'ZZZZZ9'},{av:'AV27Tipcolcod3',fld:'vTIPCOLCOD3',pic:'Z9'},{av:'AV26Intcod3',fld:'vINTCOD3',pic:'Z9'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e151582',iparms:[]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      AV34Maqcod2 = "" ;
      GXKey = "" ;
      AV35Emprcod = "" ;
      AV38barcodpar = "" ;
      AV25Maqcod3 = "" ;
      AV29Barcolnom3 = "" ;
      AV31Artcod3 = "" ;
      AV33Fec3 = GXutil.nullDate() ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV5HreRacab = "" ;
      AV6Fec1 = GXutil.nullDate() ;
      AV7Fec2 = GXutil.nullDate() ;
      AV10ARtcod1 = "" ;
      AV11Artcod2 = "" ;
      AV12Barcolnom1 = "" ;
      AV14barcolnom2 = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtninformeporproducto_Jsonclick = "" ;
      bttBtnexportarcsv_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      WebComp_Wccostesquimicosanalisisdetalle_Component = "" ;
      OldWccostesquimicosanalisisdetalle = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV22Station = "" ;
      AV23EmprNom = "" ;
      AV24UsurCod = "" ;
      GXt_char1 = "" ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_date5 = new java.util.Date[1] ;
      GXv_date6 = new java.util.Date[1] ;
      GXv_char2 = new String[1] ;
      GXv_char7 = new String[1] ;
      GXv_char8 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new int[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int13 = new int[1] ;
      GXv_int14 = new byte[1] ;
      GXv_int15 = new byte[1] ;
      GXv_int16 = new short[1] ;
      GXv_int17 = new short[1] ;
      GXv_int18 = new byte[1] ;
      GXv_int19 = new byte[1] ;
      GXv_int20 = new int[1] ;
      GXv_int21 = new byte[1] ;
      GXv_char22 = new String[1] ;
      GXv_int23 = new byte[1] ;
      AV40ExcelFilename = "" ;
      GXv_char24 = new String[1] ;
      AV41ErrorMessage = "" ;
      GXv_char25 = new String[1] ;
      sStyleString = "" ;
      lblConsmanuales_righttext_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      WebComp_Wccostesquimicosanalisisdetalle = new com.genexus.webpanels.GXWebComponentNull(remoteHandle, context);
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte AV39Calculo ;
   private byte AV37barcodreo ;
   private byte AV26Intcod3 ;
   private byte AV27Tipcolcod3 ;
   private byte AV16Tipcolcod1 ;
   private byte AV17TipColcod2 ;
   private byte AV18Intcod1 ;
   private byte AV19Intcod2 ;
   private byte nDonePA ;
   private byte AV42ConsManuales ;
   private byte GXv_int14[] ;
   private byte GXv_int15[] ;
   private byte GXv_int18[] ;
   private byte GXv_int19[] ;
   private byte GXv_int21[] ;
   private byte GXv_int23[] ;
   private byte nGXWrapped ;
   private short AV30Tipartcod3 ;
   private short wbEnd ;
   private short wbStart ;
   private short AV20TipArtCod1 ;
   private short AV21TipArtCod2 ;
   private short nCmpId ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int16[] ;
   private short GXv_int17[] ;
   private int AV36barcod ;
   private int AV28Barcolnum3 ;
   private int AV32Clicod3 ;
   private int edtavFec1_Enabled ;
   private int edtavFec2_Enabled ;
   private int AV8Clicod1 ;
   private int edtavClicod1_Enabled ;
   private int AV9Clicod2 ;
   private int edtavClicod2_Enabled ;
   private int edtavArtcod1_Enabled ;
   private int edtavArtcod2_Enabled ;
   private int edtavTipartcod1_Enabled ;
   private int edtavTipartcod2_Enabled ;
   private int edtavBarcolnom1_Enabled ;
   private int AV13Barcolnum1 ;
   private int edtavBarcolnum1_Enabled ;
   private int edtavBarcolnom2_Enabled ;
   private int AV15Barcolnum2 ;
   private int edtavBarcolnum2_Enabled ;
   private int edtavTipcolcod1_Enabled ;
   private int edtavTipcolcod2_Enabled ;
   private int edtavIntcod1_Enabled ;
   private int edtavIntcod2_Enabled ;
   private int GXv_int10[] ;
   private int GXv_int11[] ;
   private int GXv_int12[] ;
   private int GXv_int13[] ;
   private int GXv_int20[] ;
   private int idxLst ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String AV34Maqcod2 ;
   private String GXKey ;
   private String AV35Emprcod ;
   private String AV38barcodpar ;
   private String AV25Maqcod3 ;
   private String AV29Barcolnom3 ;
   private String AV31Artcod3 ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String TempTags ;
   private String AV5HreRacab ;
   private String divUnnamedtable5_Internalname ;
   private String edtavFec1_Internalname ;
   private String edtavFec1_Jsonclick ;
   private String edtavFec2_Internalname ;
   private String edtavFec2_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavClicod1_Internalname ;
   private String edtavClicod1_Jsonclick ;
   private String edtavClicod2_Internalname ;
   private String edtavClicod2_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavArtcod1_Internalname ;
   private String AV10ARtcod1 ;
   private String edtavArtcod1_Jsonclick ;
   private String edtavArtcod2_Internalname ;
   private String AV11Artcod2 ;
   private String edtavArtcod2_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtavTipartcod1_Internalname ;
   private String edtavTipartcod1_Jsonclick ;
   private String edtavTipartcod2_Internalname ;
   private String edtavTipartcod2_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String edtavBarcolnom1_Internalname ;
   private String AV12Barcolnom1 ;
   private String edtavBarcolnom1_Jsonclick ;
   private String edtavBarcolnum1_Internalname ;
   private String edtavBarcolnum1_Jsonclick ;
   private String edtavBarcolnom2_Internalname ;
   private String AV14barcolnom2 ;
   private String edtavBarcolnom2_Jsonclick ;
   private String edtavBarcolnum2_Internalname ;
   private String edtavBarcolnum2_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String edtavTipcolcod1_Internalname ;
   private String edtavTipcolcod1_Jsonclick ;
   private String edtavTipcolcod2_Internalname ;
   private String edtavTipcolcod2_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String edtavIntcod1_Internalname ;
   private String edtavIntcod1_Jsonclick ;
   private String edtavIntcod2_Internalname ;
   private String edtavIntcod2_Jsonclick ;
   private String divTabla_masopciones_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtninformeporproducto_Internalname ;
   private String bttBtninformeporproducto_Jsonclick ;
   private String bttBtnexportarcsv_Internalname ;
   private String bttBtnexportarcsv_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String WebComp_Wccostesquimicosanalisisdetalle_Component ;
   private String OldWccostesquimicosanalisisdetalle ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV22Station ;
   private String AV23EmprNom ;
   private String AV24UsurCod ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char7[] ;
   private String GXv_char8[] ;
   private String GXv_char9[] ;
   private String GXv_char22[] ;
   private String GXv_char24[] ;
   private String GXv_char25[] ;
   private String sStyleString ;
   private String tblTablemergedconsmanuales_Internalname ;
   private String lblConsmanuales_righttext_Internalname ;
   private String lblConsmanuales_righttext_Jsonclick ;
   private java.util.Date AV33Fec3 ;
   private java.util.Date AV6Fec1 ;
   private java.util.Date AV7Fec2 ;
   private java.util.Date GXv_date5[] ;
   private java.util.Date GXv_date6[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean bDynCreated_Wccostesquimicosanalisisdetalle ;
   private String AV40ExcelFilename ;
   private String AV41ErrorMessage ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private GXWebComponent WebComp_Wccostesquimicosanalisisdetalle ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private HTMLChoice cmbavHreracab ;
   private ICheckbox chkavConsmanuales ;
   private com.genexus.webpanels.GXWebForm Form ;
}

