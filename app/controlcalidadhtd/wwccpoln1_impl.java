package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwccpoln1_impl extends GXDataArea
{
   public wwccpoln1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwccpoln1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwccpoln1_impl.class ));
   }

   public wwccpoln1_impl( int remoteHandle ,
                          ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSelected = UIFactory.getCheckbox(this);
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
            AV23EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
               AV9BarCodreo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodreo", GXutil.str( AV9BarCodreo, 1, 0));
               AV8BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
               AV13CCTArc = httpContext.GetPar( "CCTArc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13CCTArc", AV13CCTArc);
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
      nRC_GXsfl_50 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_50"))) ;
      nGXsfl_50_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_50_idx"))) ;
      sGXsfl_50_idx = httpContext.GetPar( "sGXsfl_50_idx") ;
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
      AV95Pgmname = httpContext.GetPar( "Pgmname") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV23EmprCod = httpContext.GetPar( "EmprCod") ;
      AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV9BarCodreo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodreo"))) ;
      AV8BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A4033CCFch = localUtil.parseDateParm( httpContext.GetPar( "CCFch")) ;
      n4033CCFch = false ;
      A457FasCod = httpContext.GetPar( "FasCod") ;
      A460FasDsc = httpContext.GetPar( "FasDsc") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV95Pgmname, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV23EmprCod, AV6BarCod, AV9BarCodreo, AV8BarCodPar, A4033CCFch, A457FasCod, A460FasDsc) ;
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
      pa1UQ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1UQ2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"false\"" : "") ;
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wwccpoln1", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV13CCTArc))}, new String[] {"EmprCod","BarCod","BarCodreo","BarCodPar","CCTArc"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      }
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WWCCPoln1");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\wwccpoln1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_50", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_50, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "PROCOD", GXutil.rtrim( A758ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARORDLIN", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV23EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV9BarCodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCFCH", localUtil.dtoc( A4033CCFch, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSELECTEDROWS", AV81SelectedRows);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSELECTEDROWS", AV81SelectedRows);
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      if ( nGXWrapped != 1 )
      {
         httpContext.writeTextNL( "</form>") ;
      }
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
         we1UQ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1UQ2( ) ;
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
      return formatLink("app.controlcalidadhtd.wwccpoln1", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV13CCTArc))}, new String[] {"EmprCod","BarCod","BarCodreo","BarCodPar","CCTArc"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.WWCCPoln1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Auditoria n Controles", "") ;
   }

   public void wb1UQ0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesearchparm_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Ordem Servico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCPoln1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcadreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcadreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'" + sGXsfl_50_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcadreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV5BarCadReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcadreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV5BarCadReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV5BarCadReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcadreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcadreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCPoln1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV8BarCodPar), GXutil.rtrim( localUtil.format( AV8BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCPoln1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableprompt1_Internalname, 1, 0, "px", 0, "px", "Prompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblPrompt1_Internalname, httpContext.getMessage( "<i class=\"fas fa-file-word\"></i>", ""), "", "", lblPrompt1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOPROMPT1\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Buscar el codigo del cliente", ""), 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\WWCCPoln1.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctarc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctarc_Internalname, httpContext.getMessage( "Archivo de Plantilla", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctarc_Internalname, GXutil.rtrim( AV13CCTArc), GXutil.rtrim( localUtil.format( AV13CCTArc, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctarc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctarc_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCPoln1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Prompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblUseraction1_Internalname, httpContext.getMessage( "<i class=\"Image WWPBtnNeedMultiRowWOPagingSelection fas fa-file-word\"></i>", ""), "", "", lblUseraction1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Confirmar", ""), 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\WWCCPoln1.htm");
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
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol50( ) ;
      }
      if ( wbEnd == 50 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_50 = (int)(nGXsfl_50_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV95Pgmname), GXutil.rtrim( localUtil.format( AV95Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCPoln1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 50 )
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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

   public void start1UQ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Auditoria n Controles", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1UQ0( ) ;
   }

   public void ws1UQ2( )
   {
      start1UQ2( ) ;
      evt1UQ2( ) ;
   }

   public void evt1UQ2( )
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
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e111UQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPROMPT1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Doprompt1' */
                           e121UQ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgrid_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgrid_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgrid_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgrid_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_50_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_502( ) ;
                           AV79Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV79Selected);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARCOD");
                              GX_FocusControl = edtavGridbarcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV32GridBarCod = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridBarCod), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCOD"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV32GridBarCod), "ZZZZZZZ9")));
                           }
                           else
                           {
                              AV32GridBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridBarCod), 8, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCOD"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV32GridBarCod), "ZZZZZZZ9")));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARCODREO");
                              GX_FocusControl = edtavGridbarcodreo_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV34GridBarCodReo = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodreo_Internalname, GXutil.str( AV34GridBarCodReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCODREO"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV34GridBarCodReo), "9")));
                           }
                           else
                           {
                              AV34GridBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodreo_Internalname, GXutil.str( AV34GridBarCodReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCODREO"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV34GridBarCodReo), "9")));
                           }
                           AV33GridBarCodPar = httpContext.cgiGet( edtavGridbarcodpar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodpar_Internalname, AV33GridBarCodPar);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCODPAR"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, GXutil.rtrim( localUtil.format( AV33GridBarCodPar, ""))));
                           AV36GridBarProCod = httpContext.cgiGet( edtavGridbarprocod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGridbarprocod_Internalname, AV36GridBarProCod);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARPROCOD"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, GXutil.rtrim( localUtil.format( AV36GridBarProCod, ""))));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARORDLIN");
                              GX_FocusControl = edtavGridbarordlin_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV35GridBarOrdLin = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridBarOrdLin), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV35GridBarOrdLin), "ZZZ9")));
                           }
                           else
                           {
                              AV35GridBarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridBarOrdLin), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV35GridBarOrdLin), "ZZZ9")));
                           }
                           AV38GridFasCod = GXutil.upper( httpContext.cgiGet( edtavGridfascod_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGridfascod_Internalname, AV38GridFasCod);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDFASCOD"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, GXutil.rtrim( localUtil.format( AV38GridFasCod, "@!"))));
                           AV39GridFasDsc = httpContext.cgiGet( edtavGridfasdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGridfasdsc_Internalname, AV39GridFasDsc);
                           app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDFASDSC"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, GXutil.rtrim( localUtil.format( AV39GridFasDsc, ""))));
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDNUM_CC");
                              GX_FocusControl = edtavGridnum_cc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV91GridNum_CC = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridnum_cc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91GridNum_CC), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDNUM_CC"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV91GridNum_CC), "ZZZ9")));
                           }
                           else
                           {
                              AV91GridNum_CC = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridnum_cc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91GridNum_CC), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDNUM_CC"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV91GridNum_CC), "ZZZ9")));
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
                                 e131UQ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e141UQ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e151UQ2 ();
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

   public void we1UQ2( )
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

   public void pa1UQ2( )
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
            GX_FocusControl = edtavBarcadreo_Internalname ;
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
      subsflControlProps_502( ) ;
      while ( nGXsfl_50_idx <= nRC_GXsfl_50 )
      {
         sendrow_502( ) ;
         nGXsfl_50_idx = ((subGrid_Islastpage==1)&&(nGXsfl_50_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV95Pgmname ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String A758ProCod ,
                                 short A194BarOrdLin ,
                                 String AV23EmprCod ,
                                 int AV6BarCod ,
                                 byte AV9BarCodreo ,
                                 String AV8BarCodPar ,
                                 java.util.Date A4033CCFch ,
                                 String A457FasCod ,
                                 String A460FasDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e141UQ2 ();
      GRID_nCurrentRecord = 0 ;
      rf1UQ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WWCCPoln1");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlcalidadhtd\\wwccpoln1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV32GridBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDBARCOD", GXutil.ltrim( localUtil.ntoc( AV32GridBarCod, (byte)(8), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34GridBarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDBARCODREO", GXutil.ltrim( localUtil.ntoc( AV34GridBarCodReo, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV33GridBarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDBARCODPAR", GXutil.rtrim( AV33GridBarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARPROCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV36GridBarProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDBARPROCOD", GXutil.rtrim( AV36GridBarProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV35GridBarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV35GridBarOrdLin, (byte)(4), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDFASCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV38GridFasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDFASCOD", GXutil.rtrim( AV38GridFasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDFASDSC", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV39GridFasDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDFASDSC", GXutil.rtrim( AV39GridFasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDNUM_CC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV91GridNum_CC), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDNUM_CC", GXutil.ltrim( localUtil.ntoc( AV91GridNum_CC, (byte)(4), (byte)(0), ".", "")));
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
      rf1UQ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV95Pgmname = "ControlCalidadHTD.WWCCPoln1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      edtavGridbarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbarcod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridbarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbarcodreo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridbarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbarcodpar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridbarprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbarprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbarprocod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridbarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbarordlin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridfascod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridfasdsc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridnum_cc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridnum_cc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridnum_cc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1UQ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(50) ;
      /* Execute user event: Refresh */
      e141UQ2 ();
      nGXsfl_50_idx = 1 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_502( ) ;
      bGXsfl_50_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      if ( subGrid_Islastpage != 0 )
      {
         GRID_nFirstRecordOnPage = (long)(subgrid_fnc_recordcount( )-subgrid_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_502( ) ;
         e151UQ2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_50_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e151UQ2 ();
         }
         wbEnd = (short)(50) ;
         wb1UQ0( ) ;
      }
      bGXsfl_50_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1UQ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCOD"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV32GridBarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCODREO"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV34GridBarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCODPAR"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, GXutil.rtrim( localUtil.format( AV33GridBarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARPROCOD"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, GXutil.rtrim( localUtil.format( AV36GridBarProCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV35GridBarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDFASCOD"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, GXutil.rtrim( localUtil.format( AV38GridFasCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDFASDSC"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, GXutil.rtrim( localUtil.format( AV39GridFasDsc, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDNUM_CC"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV91GridNum_CC), "ZZZ9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgrid_fnc_recordcount( )
   {
      return (int)(((subGrid_Recordcount==0) ? GRID_nFirstRecordOnPage+1 : subGrid_Recordcount)) ;
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
      return (int)(((subGrid_Islastpage==1) ? subgrid_fnc_recordcount( )/ (double) (subgrid_fnc_recordsperpage( ))+((((int)((subgrid_fnc_recordcount( )) % (subgrid_fnc_recordsperpage( ))))==0) ? 0 : 1) : GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1)) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV95Pgmname, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV23EmprCod, AV6BarCod, AV9BarCodreo, AV8BarCodPar, A4033CCFch, A457FasCod, A460FasDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV95Pgmname, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV23EmprCod, AV6BarCod, AV9BarCodreo, AV8BarCodPar, A4033CCFch, A457FasCod, A460FasDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV95Pgmname, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV23EmprCod, AV6BarCod, AV9BarCodreo, AV8BarCodPar, A4033CCFch, A457FasCod, A460FasDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV95Pgmname, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV23EmprCod, AV6BarCod, AV9BarCodreo, AV8BarCodPar, A4033CCFch, A457FasCod, A460FasDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
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
         gxgrgrid_refresh( subGrid_Rows, AV95Pgmname, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV23EmprCod, AV6BarCod, AV9BarCodreo, AV8BarCodPar, A4033CCFch, A457FasCod, A460FasDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV95Pgmname = "ControlCalidadHTD.WWCCPoln1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
      Gx_err = (short)(0) ;
      edtavGridbarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbarcod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridbarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbarcodreo_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridbarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbarcodpar_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridbarprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbarprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbarprocod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridbarordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridbarordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridbarordlin_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridfascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridfascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridfascod_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridfasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridfasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridfasdsc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavGridnum_cc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridnum_cc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridnum_cc_Enabled), 5, 0), !bGXsfl_50_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1UQ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e131UQ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCADREO");
            GX_FocusControl = edtavBarcadreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV5BarCadReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCadReo", GXutil.str( AV5BarCadReo, 1, 0));
         }
         else
         {
            AV5BarCadReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5BarCadReo", GXutil.str( AV5BarCadReo, 1, 0));
         }
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WWCCPoln1");
         AV95Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV95Pgmname", AV95Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV95Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlcalidadhtd\\wwccpoln1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e131UQ2 ();
      if (returnInSub) return;
   }

   public void e131UQ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      httpContext.GX_msglist.addItem(AV23EmprCod);
      AV23EmprCod = "001" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
      GXt_char1 = AV83Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wwccpoln1_impl.this.GXt_char1 = GXv_char2[0] ;
      AV83Station = GXt_char1 ;
      GXv_char2[0] = AV23EmprCod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char4[0] = AV89UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV83Station, GXv_char2, GXv_char3, GXv_char4) ;
      wwccpoln1_impl.this.AV23EmprCod = GXv_char2[0] ;
      wwccpoln1_impl.this.AV24EmprNom = GXv_char3[0] ;
      wwccpoln1_impl.this.AV89UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Auditoria n Controles", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
   }

   public void e141UQ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext5[0] = AV90WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV90WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
   }

   private void e151UQ2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Using cursor H01UQ2 */
      pr_default.execute(0, new Object[] {AV23EmprCod, Integer.valueOf(AV6BarCod), Byte.valueOf(AV9BarCodreo), AV8BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk1UQ3 = false ;
         A194BarOrdLin = H01UQ2_A194BarOrdLin[0] ;
         A758ProCod = H01UQ2_A758ProCod[0] ;
         A130BarCodPar = H01UQ2_A130BarCodPar[0] ;
         A132BarCodReo = H01UQ2_A132BarCodReo[0] ;
         A129BarCod = H01UQ2_A129BarCod[0] ;
         A396EmprCod = H01UQ2_A396EmprCod[0] ;
         A4033CCFch = H01UQ2_A4033CCFch[0] ;
         n4033CCFch = H01UQ2_n4033CCFch[0] ;
         A457FasCod = H01UQ2_A457FasCod[0] ;
         A460FasDsc = H01UQ2_A460FasDsc[0] ;
         A457FasCod = H01UQ2_A457FasCod[0] ;
         A460FasDsc = H01UQ2_A460FasDsc[0] ;
         AV75Num_cc = (short)(0) ;
         AV32GridBarCod = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridBarCod), 8, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCOD"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV32GridBarCod), "ZZZZZZZ9")));
         AV34GridBarCodReo = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodreo_Internalname, GXutil.str( AV34GridBarCodReo, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCODREO"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV34GridBarCodReo), "9")));
         AV33GridBarCodPar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodpar_Internalname, AV33GridBarCodPar);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARCODPAR"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, GXutil.rtrim( localUtil.format( AV33GridBarCodPar, ""))));
         AV92GridProCod = A758ProCod ;
         AV35GridBarOrdLin = A194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridbarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35GridBarOrdLin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV35GridBarOrdLin), "ZZZ9")));
         AV38GridFasCod = A457FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridfascod_Internalname, AV38GridFasCod);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDFASCOD"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, GXutil.rtrim( localUtil.format( AV38GridFasCod, "@!"))));
         AV39GridFasDsc = A460FasDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridfasdsc_Internalname, AV39GridFasDsc);
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDFASDSC"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, GXutil.rtrim( localUtil.format( AV39GridFasDsc, ""))));
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(H01UQ2_A396EmprCod[0], A396EmprCod) == 0 ) && ( H01UQ2_A129BarCod[0] == A129BarCod ) && ( H01UQ2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(H01UQ2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(H01UQ2_A758ProCod[0], A758ProCod) == 0 ) && ( H01UQ2_A194BarOrdLin[0] == A194BarOrdLin ) ) )
            {
               if (true) break;
            }
            brk1UQ3 = false ;
            A4033CCFch = H01UQ2_A4033CCFch[0] ;
            n4033CCFch = H01UQ2_n4033CCFch[0] ;
            AV75Num_cc = (short)(AV75Num_cc+1) ;
            brk1UQ3 = true ;
            pr_default.readNext(0);
         }
         AV79Selected = false ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV79Selected);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(50) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_502( ) ;
            GRID_nEOF = (byte)(1) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
            {
               GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
            }
         }
         if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
         {
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_50_Refreshing )
         {
            httpContext.doAjaxLoad(50, GridRow);
         }
         if ( ! brk1UQ3 )
         {
            brk1UQ3 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      /*  Sending Event outputs  */
   }

   public void e111UQ2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      if ( 1 == 2 )
      {
         /* Execute user subroutine: 'LOADSELECTEDROWS' */
         S132 ();
         if (returnInSub) return;
         if ( AV81SelectedRows.size() == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_NoRecordSelected", ""));
         }
      }
      AV46Lin = 0 ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV84Tab_cod[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      if ( AV81SelectedRows.size() > 0 )
      {
         AV98GXV1 = 1 ;
         while ( AV98GXV1 <= AV81SelectedRows.size() )
         {
            AV80SelectedRow = (app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem)((app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem)AV81SelectedRows.elementAt(-1+AV98GXV1));
            AV84Tab_cod[AV46Lin-1] = AV80SelectedRow.getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin() ;
            AV98GXV1 = (int)(AV98GXV1+1) ;
         }
         if ( AV46Lin == 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "No ha seleccionado ninguna linea ¡¡¡", ""));
         }
         else
         {
            GXt_int6 = AV30Flg ;
            GXv_int7[0] = GXt_int6 ;
            new app.pexicon(remoteHandle, context).execute( AV23EmprCod, httpContext.getMessage( "IWORD", ""), GXv_int7) ;
            wwccpoln1_impl.this.GXt_int6 = GXv_int7[0] ;
            AV30Flg = GXt_int6 ;
            httpContext.GX_msglist.addItem(GXutil.str( AV30Flg, 10, 0));
            if ( AV30Flg == 0 )
            {
            }
            else
            {
               GXv_char4[0] = AV23EmprCod ;
               GXv_int8[0] = AV6BarCod ;
               GXv_int7[0] = AV9BarCodreo ;
               GXv_char3[0] = AV8BarCodPar ;
               GXv_char2[0] = AV13CCTArc ;
               new app.controlcalidadhtd.pccpolnwd(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_char3, GXv_char2, AV84Tab_cod) ;
               wwccpoln1_impl.this.AV23EmprCod = GXv_char4[0] ;
               wwccpoln1_impl.this.AV6BarCod = GXv_int8[0] ;
               wwccpoln1_impl.this.AV9BarCodreo = GXv_int7[0] ;
               wwccpoln1_impl.this.AV8BarCodPar = GXv_char3[0] ;
               wwccpoln1_impl.this.AV13CCTArc = GXv_char2[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodreo", GXutil.str( AV9BarCodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
               httpContext.ajax_rsp_assign_attri("", false, "AV13CCTArc", AV13CCTArc);
            }
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Seleciones al menos um item del listado", ""));
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV81SelectedRows", AV81SelectedRows);
   }

   public void e121UQ2( )
   {
      /* 'Doprompt1' Routine */
      returnInSub = false ;
      if ( AV81SelectedRows.size() > 0 )
      {
         AV99GXV2 = 1 ;
         while ( AV99GXV2 <= AV81SelectedRows.size() )
         {
            AV80SelectedRow = (app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem)((app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem)AV81SelectedRows.elementAt(-1+AV99GXV2));
            AV84Tab_cod[AV46Lin-1] = AV80SelectedRow.getgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin() ;
            AV99GXV2 = (int)(AV99GXV2+1) ;
         }
         GXt_int6 = AV30Flg ;
         GXv_int7[0] = GXt_int6 ;
         new app.pexicon(remoteHandle, context).execute( AV23EmprCod, httpContext.getMessage( "IWORD", ""), GXv_int7) ;
         wwccpoln1_impl.this.GXt_int6 = GXv_int7[0] ;
         AV30Flg = GXt_int6 ;
         if ( AV30Flg == 0 )
         {
            GXv_char4[0] = AV23EmprCod ;
            GXv_int8[0] = AV6BarCod ;
            GXv_int7[0] = AV9BarCodreo ;
            GXv_char3[0] = AV8BarCodPar ;
            GXv_char2[0] = AV13CCTArc ;
            new app.controlcalidadhtd.pccpolnsinlineas(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int7, GXv_char3, GXv_char2, AV84Tab_cod) ;
            wwccpoln1_impl.this.AV23EmprCod = GXv_char4[0] ;
            wwccpoln1_impl.this.AV6BarCod = GXv_int8[0] ;
            wwccpoln1_impl.this.AV9BarCodreo = GXv_int7[0] ;
            wwccpoln1_impl.this.AV8BarCodPar = GXv_char3[0] ;
            wwccpoln1_impl.this.AV13CCTArc = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodreo", GXutil.str( AV9BarCodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV13CCTArc", AV13CCTArc);
            httpContext.GX_msglist.addItem(httpContext.getMessage( "0 - Procedimiento realizado con sucesso!", ""));
         }
         else
         {
            new app.controlcalidadhtd.pwordsinlineasccpoln(remoteHandle, context).execute( AV23EmprCod, AV6BarCod, AV9BarCodreo, AV8BarCodPar, AV13CCTArc, AV84Tab_cod) ;
            httpContext.GX_msglist.addItem(httpContext.getMessage( "1 - Procedimiento realizado con sucesso!", ""));
         }
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Ningun registro de la gilla selecionado!", ""));
      }
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'LOADSELECTEDROWS' Routine */
      returnInSub = false ;
      AV81SelectedRows = new GXBaseCollection<app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem>(app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem.class, "WWCCPoln1SDTItem", "TexplusNET", remoteHandle) ;
      /* Start For Each Line */
      nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_50_fel_idx = 0 ;
      while ( nGXsfl_50_fel_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_50_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_50_fel_idx+1) ;
         sGXsfl_50_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_502( ) ;
         AV79Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARCOD");
            GX_FocusControl = edtavGridbarcod_Internalname ;
            wbErr = true ;
            AV32GridBarCod = 0 ;
         }
         else
         {
            AV32GridBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARCODREO");
            GX_FocusControl = edtavGridbarcodreo_Internalname ;
            wbErr = true ;
            AV34GridBarCodReo = (byte)(0) ;
         }
         else
         {
            AV34GridBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV33GridBarCodPar = httpContext.cgiGet( edtavGridbarcodpar_Internalname) ;
         AV36GridBarProCod = httpContext.cgiGet( edtavGridbarprocod_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARORDLIN");
            GX_FocusControl = edtavGridbarordlin_Internalname ;
            wbErr = true ;
            AV35GridBarOrdLin = (short)(0) ;
         }
         else
         {
            AV35GridBarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV38GridFasCod = GXutil.upper( httpContext.cgiGet( edtavGridfascod_Internalname)) ;
         AV39GridFasDsc = httpContext.cgiGet( edtavGridfasdsc_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDNUM_CC");
            GX_FocusControl = edtavGridnum_cc_Internalname ;
            wbErr = true ;
            AV91GridNum_CC = (short)(0) ;
         }
         else
         {
            AV91GridNum_CC = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( AV79Selected )
         {
            AV80SelectedRow = (app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem)new app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem(remoteHandle, context);
            AV80SelectedRow.setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcod( AV32GridBarCod );
            AV80SelectedRow.setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodreo( AV34GridBarCodReo );
            AV80SelectedRow.setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarcodpar( AV33GridBarCodPar );
            AV80SelectedRow.setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarprocod( AV36GridBarProCod );
            AV80SelectedRow.setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridbarordlin( AV35GridBarOrdLin );
            AV80SelectedRow.setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfascod( AV38GridFasCod );
            AV80SelectedRow.setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridfasdsc( AV39GridFasDsc );
            AV80SelectedRow.setgxTv_SdtWWCCPoln1SDT_WWCCPoln1SDTItem_Gridnum_cc( AV91GridNum_CC );
            AV81SelectedRows.add(AV80SelectedRow, 0);
         }
         /* End For Each Line */
      }
      if ( nGXsfl_50_fel_idx == 0 )
      {
         nGXsfl_50_idx = 1 ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
      }
      nGXsfl_50_fel_idx = 1 ;
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV82Session.getValue(AV95Pgmname+"GridState"), "") == 0 )
      {
         AV41GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV95Pgmname+"GridState"), null, null);
      }
      else
      {
         AV41GridState.fromxml(AV82Session.getValue(AV95Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV41GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV41GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV41GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV41GridState.fromxml(AV82Session.getValue(AV95Pgmname+"GridState"), null, null);
      AV41GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV41GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV95Pgmname+"GridState", AV41GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV23EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23EmprCod", AV23EmprCod);
      AV6BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      AV9BarCodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodreo", GXutil.str( AV9BarCodreo, 1, 0));
      AV8BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
      AV13CCTArc = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13CCTArc", AV13CCTArc);
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
      pa1UQ2( ) ;
      ws1UQ2( ) ;
      we1UQ2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211614671", true, true);
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
      if ( nGXWrapped != 1 )
      {
         httpContext.AddJavascriptSource("messages."+httpContext.getLanguageProperty( "code")+".js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
         httpContext.AddJavascriptSource("controlcalidadhtd/wwccpoln1.js", "?20268211614671", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_502( )
   {
      chkavSelected.setInternalname( "vSELECTED_"+sGXsfl_50_idx );
      edtavGridbarcod_Internalname = "vGRIDBARCOD_"+sGXsfl_50_idx ;
      edtavGridbarcodreo_Internalname = "vGRIDBARCODREO_"+sGXsfl_50_idx ;
      edtavGridbarcodpar_Internalname = "vGRIDBARCODPAR_"+sGXsfl_50_idx ;
      edtavGridbarprocod_Internalname = "vGRIDBARPROCOD_"+sGXsfl_50_idx ;
      edtavGridbarordlin_Internalname = "vGRIDBARORDLIN_"+sGXsfl_50_idx ;
      edtavGridfascod_Internalname = "vGRIDFASCOD_"+sGXsfl_50_idx ;
      edtavGridfasdsc_Internalname = "vGRIDFASDSC_"+sGXsfl_50_idx ;
      edtavGridnum_cc_Internalname = "vGRIDNUM_CC_"+sGXsfl_50_idx ;
   }

   public void subsflControlProps_fel_502( )
   {
      chkavSelected.setInternalname( "vSELECTED_"+sGXsfl_50_fel_idx );
      edtavGridbarcod_Internalname = "vGRIDBARCOD_"+sGXsfl_50_fel_idx ;
      edtavGridbarcodreo_Internalname = "vGRIDBARCODREO_"+sGXsfl_50_fel_idx ;
      edtavGridbarcodpar_Internalname = "vGRIDBARCODPAR_"+sGXsfl_50_fel_idx ;
      edtavGridbarprocod_Internalname = "vGRIDBARPROCOD_"+sGXsfl_50_fel_idx ;
      edtavGridbarordlin_Internalname = "vGRIDBARORDLIN_"+sGXsfl_50_fel_idx ;
      edtavGridfascod_Internalname = "vGRIDFASCOD_"+sGXsfl_50_fel_idx ;
      edtavGridfasdsc_Internalname = "vGRIDFASDSC_"+sGXsfl_50_fel_idx ;
      edtavGridnum_cc_Internalname = "vGRIDNUM_CC_"+sGXsfl_50_fel_idx ;
   }

   public void sendrow_502( )
   {
      subsflControlProps_502( ) ;
      wb1UQ0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_50_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_50_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_50_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSelected.getEnabled()!=0)&&(chkavSelected.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ClassString = "AttributeCheckBox" ;
         StyleString = "" ;
         GXCCtl = "vSELECTED_" + sGXsfl_50_idx ;
         chkavSelected.setName( GXCCtl );
         chkavSelected.setWebtags( "" );
         chkavSelected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSelected.getInternalname(), "TitleCaption", chkavSelected.getCaption(), !bGXsfl_50_Refreshing);
         chkavSelected.setCheckedValue( "false" );
         AV79Selected = GXutil.strtobool( GXutil.booltostr( AV79Selected)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV79Selected);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSelected.getInternalname(),GXutil.booltostr( AV79Selected),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"","",TempTags+" onclick="+"\"gx.fn.checkboxClick(51, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSelected.getEnabled()!=0)&&(chkavSelected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,51);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridbarcod_Enabled!=0)&&(edtavGridbarcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridbarcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV32GridBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGridbarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV32GridBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV32GridBarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGridbarcod_Enabled!=0)&&(edtavGridbarcod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridbarcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridbarcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridbarcodreo_Enabled!=0)&&(edtavGridbarcodreo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridbarcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV34GridBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGridbarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV34GridBarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV34GridBarCodReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGridbarcodreo_Enabled!=0)&&(edtavGridbarcodreo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridbarcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridbarcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridbarcodpar_Enabled!=0)&&(edtavGridbarcodpar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridbarcodpar_Internalname,GXutil.rtrim( AV33GridBarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGridbarcodpar_Enabled!=0)&&(edtavGridbarcodpar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,54);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridbarcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridbarcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridbarprocod_Enabled!=0)&&(edtavGridbarprocod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridbarprocod_Internalname,GXutil.rtrim( AV36GridBarProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGridbarprocod_Enabled!=0)&&(edtavGridbarprocod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,55);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridbarprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridbarprocod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridbarordlin_Enabled!=0)&&(edtavGridbarordlin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridbarordlin_Internalname,GXutil.ltrim( localUtil.ntoc( AV35GridBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGridbarordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV35GridBarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV35GridBarOrdLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGridbarordlin_Enabled!=0)&&(edtavGridbarordlin_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridbarordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridbarordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridfascod_Enabled!=0)&&(edtavGridfascod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridfascod_Internalname,GXutil.rtrim( AV38GridFasCod),GXutil.rtrim( localUtil.format( AV38GridFasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavGridfascod_Enabled!=0)&&(edtavGridfascod_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,57);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridfascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridfasdsc_Enabled!=0)&&(edtavGridfasdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridfasdsc_Internalname,GXutil.rtrim( AV39GridFasDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGridfasdsc_Enabled!=0)&&(edtavGridfasdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridfasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridfasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridnum_cc_Enabled!=0)&&(edtavGridnum_cc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridnum_cc_Internalname,GXutil.ltrim( localUtil.ntoc( AV91GridNum_CC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGridnum_cc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV91GridNum_CC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV91GridNum_CC), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGridnum_cc_Enabled!=0)&&(edtavGridnum_cc_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridnum_cc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridnum_cc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1UQ2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_50_idx = ((subGrid_Islastpage==1)&&(nGXsfl_50_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_50_idx+1) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
      }
      /* End function sendrow_502 */
   }

   public void startgridcontrol50( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"50\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ordem Servico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Processo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Controles", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV79Selected));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV32GridBarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridbarcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV34GridBarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridbarcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV33GridBarCodPar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridbarcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV36GridBarProCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridbarprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV35GridBarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridbarordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV38GridFasCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV39GridFasDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridfasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV91GridNum_CC, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridnum_cc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcadreo_Internalname = "vBARCADREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      lblPrompt1_Internalname = "PROMPT1" ;
      divTableprompt1_Internalname = "TABLEPROMPT1" ;
      edtavCctarc_Internalname = "vCCTARC" ;
      lblUseraction1_Internalname = "USERACTION1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablesearchparm_Internalname = "TABLESEARCHPARM" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      chkavSelected.setInternalname( "vSELECTED" );
      edtavGridbarcod_Internalname = "vGRIDBARCOD" ;
      edtavGridbarcodreo_Internalname = "vGRIDBARCODREO" ;
      edtavGridbarcodpar_Internalname = "vGRIDBARCODPAR" ;
      edtavGridbarprocod_Internalname = "vGRIDBARPROCOD" ;
      edtavGridbarordlin_Internalname = "vGRIDBARORDLIN" ;
      edtavGridfascod_Internalname = "vGRIDFASCOD" ;
      edtavGridfasdsc_Internalname = "vGRIDFASDSC" ;
      edtavGridnum_cc_Internalname = "vGRIDNUM_CC" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      edtavGridnum_cc_Jsonclick = "" ;
      edtavGridnum_cc_Visible = -1 ;
      edtavGridnum_cc_Enabled = 1 ;
      edtavGridfasdsc_Jsonclick = "" ;
      edtavGridfasdsc_Visible = -1 ;
      edtavGridfasdsc_Enabled = 1 ;
      edtavGridfascod_Jsonclick = "" ;
      edtavGridfascod_Visible = -1 ;
      edtavGridfascod_Enabled = 1 ;
      edtavGridbarordlin_Jsonclick = "" ;
      edtavGridbarordlin_Visible = -1 ;
      edtavGridbarordlin_Enabled = 1 ;
      edtavGridbarprocod_Jsonclick = "" ;
      edtavGridbarprocod_Visible = -1 ;
      edtavGridbarprocod_Enabled = 1 ;
      edtavGridbarcodpar_Jsonclick = "" ;
      edtavGridbarcodpar_Visible = -1 ;
      edtavGridbarcodpar_Enabled = 1 ;
      edtavGridbarcodreo_Jsonclick = "" ;
      edtavGridbarcodreo_Visible = -1 ;
      edtavGridbarcodreo_Enabled = 1 ;
      edtavGridbarcod_Jsonclick = "" ;
      edtavGridbarcod_Visible = -1 ;
      edtavGridbarcod_Enabled = 1 ;
      chkavSelected.setCaption( "" );
      chkavSelected.setVisible( -1 );
      chkavSelected.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavCctarc_Jsonclick = "" ;
      edtavCctarc_Enabled = 0 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcadreo_Jsonclick = "" ;
      edtavBarcadreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
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
      Form.setCaption( httpContext.getMessage( "Auditoria n Controles", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vSELECTED_" + sGXsfl_50_idx ;
      chkavSelected.setName( GXCCtl );
      chkavSelected.setWebtags( "" );
      chkavSelected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSelected.getInternalname(), "TitleCaption", chkavSelected.getCaption(), !bGXsfl_50_Refreshing);
      chkavSelected.setCheckedValue( "false" );
      AV79Selected = GXutil.strtobool( GXutil.booltostr( AV79Selected)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV79Selected);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e151UQ2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV32GridBarCod',fld:'vGRIDBARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV34GridBarCodReo',fld:'vGRIDBARCODREO',pic:'9',hsh:true},{av:'AV33GridBarCodPar',fld:'vGRIDBARCODPAR',pic:'',hsh:true},{av:'AV35GridBarOrdLin',fld:'vGRIDBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV38GridFasCod',fld:'vGRIDFASCOD',pic:'@!',hsh:true},{av:'AV39GridFasDsc',fld:'vGRIDFASDSC',pic:'',hsh:true},{av:'AV79Selected',fld:'vSELECTED',pic:''}]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e111UQ2',iparms:[{av:'AV81SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV13CCTArc',fld:'vCCTARC',pic:'@!'},{av:'AV79Selected',fld:'vSELECTED',grid:50,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_50',ctrl:'GRID',grid:50,prop:'GridRC',grid:50},{av:'AV32GridBarCod',fld:'vGRIDBARCOD',grid:50,pic:'ZZZZZZZ9',hsh:true},{av:'AV34GridBarCodReo',fld:'vGRIDBARCODREO',grid:50,pic:'9',hsh:true},{av:'AV33GridBarCodPar',fld:'vGRIDBARCODPAR',grid:50,pic:'',hsh:true},{av:'AV36GridBarProCod',fld:'vGRIDBARPROCOD',grid:50,pic:'',hsh:true},{av:'AV35GridBarOrdLin',fld:'vGRIDBARORDLIN',grid:50,pic:'ZZZ9',hsh:true},{av:'AV38GridFasCod',fld:'vGRIDFASCOD',grid:50,pic:'@!',hsh:true},{av:'AV39GridFasDsc',fld:'vGRIDFASDSC',grid:50,pic:'',hsh:true},{av:'AV91GridNum_CC',fld:'vGRIDNUM_CC',grid:50,pic:'ZZZ9',hsh:true}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV13CCTArc',fld:'vCCTARC',pic:'@!'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV81SelectedRows',fld:'vSELECTEDROWS',pic:''}]}");
      setEventMetadata("'DOPROMPT1'","{handler:'e121UQ2',iparms:[{av:'AV81SelectedRows',fld:'vSELECTEDROWS',pic:''},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV13CCTArc',fld:'vCCTARC',pic:'@!'}]");
      setEventMetadata("'DOPROMPT1'",",oparms:[{av:'AV13CCTArc',fld:'vCCTARC',pic:'@!'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV23EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV9BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV95Pgmname',fld:'vPGMNAME',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gridnum_cc',iparms:[]");
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
      wcpOAV23EmprCod = "" ;
      wcpOAV8BarCodPar = "" ;
      wcpOAV13CCTArc = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV23EmprCod = "" ;
      AV8BarCodPar = "" ;
      AV13CCTArc = "" ;
      AV95Pgmname = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A4033CCFch = GXutil.nullDate() ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV81SelectedRows = new GXBaseCollection<app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem>(app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem.class, "WWCCPoln1SDTItem", "TexplusNET", remoteHandle);
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblPrompt1_Jsonclick = "" ;
      lblUseraction1_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV33GridBarCodPar = "" ;
      AV36GridBarProCod = "" ;
      AV38GridFasCod = "" ;
      AV39GridFasDsc = "" ;
      hsh = "" ;
      AV83Station = "" ;
      GXt_char1 = "" ;
      AV24EmprNom = "" ;
      AV89UsurCod = "" ;
      AV90WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      scmdbuf = "" ;
      H01UQ2_A4031CCTCod = new int[1] ;
      H01UQ2_A194BarOrdLin = new short[1] ;
      H01UQ2_A758ProCod = new String[] {""} ;
      H01UQ2_A130BarCodPar = new String[] {""} ;
      H01UQ2_A132BarCodReo = new byte[1] ;
      H01UQ2_A129BarCod = new int[1] ;
      H01UQ2_A396EmprCod = new String[] {""} ;
      H01UQ2_A4033CCFch = new java.util.Date[] {GXutil.nullDate()} ;
      H01UQ2_n4033CCFch = new boolean[] {false} ;
      H01UQ2_A457FasCod = new String[] {""} ;
      H01UQ2_A460FasDsc = new String[] {""} ;
      AV92GridProCod = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV84Tab_cod = new short[100] ;
      AV80SelectedRow = new app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem(remoteHandle, context);
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      AV82Session = httpContext.getWebSession();
      AV41GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wwccpoln1__default(),
         new Object[] {
             new Object[] {
            H01UQ2_A4031CCTCod, H01UQ2_A194BarOrdLin, H01UQ2_A758ProCod, H01UQ2_A130BarCodPar, H01UQ2_A132BarCodReo, H01UQ2_A129BarCod, H01UQ2_A396EmprCod, H01UQ2_A4033CCFch, H01UQ2_n4033CCFch, H01UQ2_A457FasCod,
            H01UQ2_A460FasDsc
            }
         }
      );
      AV95Pgmname = "ControlCalidadHTD.WWCCPoln1" ;
      /* GeneXus formulas. */
      AV95Pgmname = "ControlCalidadHTD.WWCCPoln1" ;
      Gx_err = (short)(0) ;
      edtavGridbarcod_Enabled = 0 ;
      edtavGridbarcodreo_Enabled = 0 ;
      edtavGridbarcodpar_Enabled = 0 ;
      edtavGridbarprocod_Enabled = 0 ;
      edtavGridbarordlin_Enabled = 0 ;
      edtavGridfascod_Enabled = 0 ;
      edtavGridfasdsc_Enabled = 0 ;
      edtavGridnum_cc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV9BarCodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV9BarCodreo ;
   private byte A132BarCodReo ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV5BarCadReo ;
   private byte AV34GridBarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte AV30Flg ;
   private byte GXt_int6 ;
   private byte GXv_int7[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short A194BarOrdLin ;
   private short wbEnd ;
   private short wbStart ;
   private short AV35GridBarOrdLin ;
   private short AV91GridNum_CC ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV75Num_cc ;
   private short AV84Tab_cod[] ;
   private int wcpOAV6BarCod ;
   private int subGrid_Rows ;
   private int nRC_GXsfl_50 ;
   private int AV6BarCod ;
   private int nGXsfl_50_idx=1 ;
   private int A129BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcadreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavCctarc_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV32GridBarCod ;
   private int subGrid_Islastpage ;
   private int edtavGridbarcod_Enabled ;
   private int edtavGridbarcodreo_Enabled ;
   private int edtavGridbarcodpar_Enabled ;
   private int edtavGridbarprocod_Enabled ;
   private int edtavGridbarordlin_Enabled ;
   private int edtavGridfascod_Enabled ;
   private int edtavGridfasdsc_Enabled ;
   private int edtavGridnum_cc_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int AV46Lin ;
   private int GX_I ;
   private int AV98GXV1 ;
   private int AV99GXV2 ;
   private int GXv_int8[] ;
   private int nGXsfl_50_fel_idx=1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavGridbarcod_Visible ;
   private int edtavGridbarcodreo_Visible ;
   private int edtavGridbarcodpar_Visible ;
   private int edtavGridbarprocod_Visible ;
   private int edtavGridbarordlin_Visible ;
   private int edtavGridfascod_Visible ;
   private int edtavGridfasdsc_Visible ;
   private int edtavGridnum_cc_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private String wcpOAV23EmprCod ;
   private String wcpOAV8BarCodPar ;
   private String wcpOAV13CCTArc ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV23EmprCod ;
   private String AV8BarCodPar ;
   private String AV13CCTArc ;
   private String sGXsfl_50_idx="0001" ;
   private String AV95Pgmname ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A758ProCod ;
   private String A457FasCod ;
   private String A460FasDsc ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTablesearchparm_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcadreo_Internalname ;
   private String TempTags ;
   private String edtavBarcadreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String divTableprompt1_Internalname ;
   private String lblPrompt1_Internalname ;
   private String lblPrompt1_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String edtavCctarc_Internalname ;
   private String edtavCctarc_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String lblUseraction1_Internalname ;
   private String lblUseraction1_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavGridbarcod_Internalname ;
   private String edtavGridbarcodreo_Internalname ;
   private String AV33GridBarCodPar ;
   private String edtavGridbarcodpar_Internalname ;
   private String AV36GridBarProCod ;
   private String edtavGridbarprocod_Internalname ;
   private String edtavGridbarordlin_Internalname ;
   private String AV38GridFasCod ;
   private String edtavGridfascod_Internalname ;
   private String AV39GridFasDsc ;
   private String edtavGridfasdsc_Internalname ;
   private String edtavGridnum_cc_Internalname ;
   private String hsh ;
   private String AV83Station ;
   private String GXt_char1 ;
   private String AV24EmprNom ;
   private String AV89UsurCod ;
   private String scmdbuf ;
   private String AV92GridProCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavGridbarcod_Jsonclick ;
   private String edtavGridbarcodreo_Jsonclick ;
   private String edtavGridbarcodpar_Jsonclick ;
   private String edtavGridbarprocod_Jsonclick ;
   private String edtavGridbarordlin_Jsonclick ;
   private String edtavGridfascod_Jsonclick ;
   private String edtavGridfasdsc_Jsonclick ;
   private String edtavGridnum_cc_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A4033CCFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4033CCFch ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean AV79Selected ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean brk1UQ3 ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV82Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavSelected ;
   private IDataStoreProvider pr_default ;
   private int[] H01UQ2_A4031CCTCod ;
   private short[] H01UQ2_A194BarOrdLin ;
   private String[] H01UQ2_A758ProCod ;
   private String[] H01UQ2_A130BarCodPar ;
   private byte[] H01UQ2_A132BarCodReo ;
   private int[] H01UQ2_A129BarCod ;
   private String[] H01UQ2_A396EmprCod ;
   private java.util.Date[] H01UQ2_A4033CCFch ;
   private boolean[] H01UQ2_n4033CCFch ;
   private String[] H01UQ2_A457FasCod ;
   private String[] H01UQ2_A460FasDsc ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem> AV81SelectedRows ;
   private app.wwpbaseobjects.SdtWWPGridState AV41GridState ;
   private app.controlcalidadhtd.SdtWWCCPoln1SDT_WWCCPoln1SDTItem AV80SelectedRow ;
   private app.wwpbaseobjects.SdtWWPContext AV90WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class wwccpoln1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01UQ2", "SELECT T1.CCTCod, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CCFch, T2.FasCod, T3.FasDsc FROM ((TXPCC T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod = T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T2.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((int[]) buf[5])[0] = rslt.getInt(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 3);
               ((java.util.Date[]) buf[7])[0] = rslt.getGXDate(8);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(9, 8);
               ((String[]) buf[10])[0] = rslt.getString(10, 28);
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

