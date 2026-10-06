package app.controlcalidadhtd ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wwccpoln2_impl extends GXDataArea
{
   public wwccpoln2_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wwccpoln2_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wwccpoln2_impl.class ));
   }

   public wwccpoln2_impl( int remoteHandle ,
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
            AV24EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV7BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCod), 8, 0));
               AV10BarCodreo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodreo", GXutil.str( AV10BarCodreo, 1, 0));
               AV9BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodPar", AV9BarCodPar);
               AV14CCTArc = httpContext.GetPar( "CCTArc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14CCTArc", AV14CCTArc);
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
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A758ProCod = httpContext.GetPar( "ProCod") ;
      A194BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      AV24EmprCod = httpContext.GetPar( "EmprCod") ;
      AV7BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV10BarCodreo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodreo"))) ;
      AV9BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV93vNControl = (short)(GXutil.lval( httpContext.GetPar( "vNControl"))) ;
      A457FasCod = httpContext.GetPar( "FasCod") ;
      A460FasDsc = httpContext.GetPar( "FasDsc") ;
      AV13BarOrdLin = (short)(GXutil.lval( httpContext.GetPar( "BarOrdLin"))) ;
      A4033CCFch = localUtil.parseDateParm( httpContext.GetPar( "CCFch")) ;
      n4033CCFch = false ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV24EmprCod, AV7BarCod, AV10BarCodreo, AV9BarCodPar, AV93vNControl, A457FasCod, A460FasDsc, AV13BarOrdLin, A4033CCFch) ;
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
      pa2CV2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2CV2( ) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlcalidadhtd.wwccpoln2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV14CCTArc))}, new String[] {"EmprCod","BarCod","BarCodreo","BarCodPar","CCTArc"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVNCONTROL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93vNControl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarOrdLin), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV24EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV10BarCodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVNCONTROL", GXutil.ltrim( localUtil.ntoc( AV93vNControl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVNCONTROL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93vNControl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "FASCOD", GXutil.rtrim( A457FasCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FASDSC", GXutil.rtrim( A460FasDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV13BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "CCFCH", localUtil.dtoc( A4033CCFch, 0, "/"));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTAB_COD", AV86Tab_cod);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTAB_COD", AV86Tab_cod);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vVNUMSEL", GXutil.ltrim( localUtil.ntoc( AV95vNumSel, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
         we2CV2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2CV2( ) ;
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
      return formatLink("app.controlcalidadhtd.wwccpoln2", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10BarCodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV14CCTArc))}, new String[] {"EmprCod","BarCod","BarCodreo","BarCodPar","CCTArc"})  ;
   }

   public String getPgmname( )
   {
      return "ControlCalidadHTD.WWCCPoln2" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Auditoría N Controles XML", "") ;
   }

   public void wb2CV0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Ordem Servico", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV7BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCPoln2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-md-2 col-lg-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcadreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcadreo_Internalname, httpContext.getMessage( "R", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'" + sGXsfl_50_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcadreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV6BarCadReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcadreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6BarCadReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV6BarCadReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,22);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcadreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcadreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlCalidadHTD\\WWCCPoln2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 col-md-3 col-lg-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV9BarCodPar), GXutil.rtrim( localUtil.format( AV9BarCodPar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCPoln2.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-1", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblPrompt1_Internalname, httpContext.getMessage( "<i class=\"fas fa-file-word\" style=\"color:#D60021; font-size:24px\"></i><span style=\"color:#666; font-size:12px; text-transform: lowercase;\"> Sin Controles </span>", ""), "", "", lblPrompt1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOPROMPT1\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Buscar el codigo del cliente", ""), 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\WWCCPoln2.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-9", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCctarc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCctarc_Internalname, httpContext.getMessage( "Archivo de Plantilla", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCctarc_Internalname, GXutil.rtrim( AV14CCTArc), GXutil.rtrim( localUtil.format( AV14CCTArc, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCctarc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCctarc_Enabled, 0, "text", "", 80, "chr", 1, "row", 128, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCPoln2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Prompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-lg-1", "Center", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblUseraction1_Internalname, lblUseraction1_Caption, "", "", lblUseraction1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", "", "TextBlock", 5, httpContext.getMessage( "Confirmar", ""), 1, 1, 0, (short)(1), "HLP_ControlCalidadHTD\\WWCCPoln2.htm");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer HasGridEmpowerer", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "Pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV98Pgmname), GXutil.rtrim( localUtil.format( AV98Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 30, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlCalidadHTD\\WWCCPoln2.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 50, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlCalidadHTD\\WWCCPoln2.htm");
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

   public void start2CV2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Auditoría N Controles XML", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2CV0( ) ;
   }

   public void ws2CV2( )
   {
      start2CV2( ) ;
      evt2CV2( ) ;
   }

   public void evt2CV2( )
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
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e112CV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e122CV2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOPROMPT1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Doprompt1' */
                           e132CV2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_50_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_502( ) ;
                           AV81Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV81Selected);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARCOD");
                              GX_FocusControl = edtavGridbarcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV33GridBarCod = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridBarCod), 8, 0));
                           }
                           else
                           {
                              AV33GridBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridBarCod), 8, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARCODREO");
                              GX_FocusControl = edtavGridbarcodreo_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV35GridBarCodReo = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodreo_Internalname, GXutil.str( AV35GridBarCodReo, 1, 0));
                           }
                           else
                           {
                              AV35GridBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodreo_Internalname, GXutil.str( AV35GridBarCodReo, 1, 0));
                           }
                           AV34GridBarCodPar = httpContext.cgiGet( edtavGridbarcodpar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodpar_Internalname, AV34GridBarCodPar);
                           AV37GridBarProCod = httpContext.cgiGet( edtavGridbarprocod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGridbarprocod_Internalname, AV37GridBarProCod);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARORDLIN");
                              GX_FocusControl = edtavGridbarordlin_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV36GridBarOrdLin = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GridBarOrdLin), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV36GridBarOrdLin), "ZZZ9")));
                           }
                           else
                           {
                              AV36GridBarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridbarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GridBarOrdLin), 4, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV36GridBarOrdLin), "ZZZ9")));
                           }
                           AV39GridFasCod = GXutil.upper( httpContext.cgiGet( edtavGridfascod_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGridfascod_Internalname, AV39GridFasCod);
                           AV40GridFasDsc = httpContext.cgiGet( edtavGridfasdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavGridfasdsc_Internalname, AV40GridFasDsc);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDNUM_CC");
                              GX_FocusControl = edtavGridnum_cc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV41GridNum_CC = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridnum_cc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridNum_CC), 4, 0));
                           }
                           else
                           {
                              AV41GridNum_CC = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavGridnum_cc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridNum_CC), 4, 0));
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
                                 e142CV2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e152CV2 ();
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

   public void we2CV2( )
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

   public void pa2CV2( )
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
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String A758ProCod ,
                                 short A194BarOrdLin ,
                                 String AV24EmprCod ,
                                 int AV7BarCod ,
                                 byte AV10BarCodreo ,
                                 String AV9BarCodPar ,
                                 short AV93vNControl ,
                                 String A457FasCod ,
                                 String A460FasDsc ,
                                 short AV13BarOrdLin ,
                                 java.util.Date A4033CCFch )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      GRID_nCurrentRecord = 0 ;
      rf2CV2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36GridBarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV36GridBarOrdLin, (byte)(4), (byte)(0), ".", "")));
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
      rf2CV2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV98Pgmname = "ControlCalidadHTD.WWCCPoln2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98Pgmname", AV98Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcadreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcadreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcadreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavCctarc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctarc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctarc_Enabled), 5, 0), true);
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

   public void rf2CV2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(50) ;
      nGXsfl_50_idx = 1 ;
      sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_502( ) ;
      bGXsfl_50_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
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
         e152CV2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_50_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e152CV2 ();
         }
         wbEnd = (short)(50) ;
         wb2CV0( ) ;
      }
      bGXsfl_50_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2CV2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vVNCONTROL", GXutil.ltrim( localUtil.ntoc( AV93vNControl, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVNCONTROL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93vNControl), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARORDLIN", GXutil.ltrim( localUtil.ntoc( AV13BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarOrdLin), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV36GridBarOrdLin), "ZZZ9")));
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV24EmprCod, AV7BarCod, AV10BarCodreo, AV9BarCodPar, AV93vNControl, A457FasCod, A460FasDsc, AV13BarOrdLin, A4033CCFch) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV24EmprCod, AV7BarCod, AV10BarCodreo, AV9BarCodPar, AV93vNControl, A457FasCod, A460FasDsc, AV13BarOrdLin, A4033CCFch) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV24EmprCod, AV7BarCod, AV10BarCodreo, AV9BarCodPar, AV93vNControl, A457FasCod, A460FasDsc, AV13BarOrdLin, A4033CCFch) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV24EmprCod, AV7BarCod, AV10BarCodreo, AV9BarCodPar, AV93vNControl, A457FasCod, A460FasDsc, AV13BarOrdLin, A4033CCFch) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A758ProCod, A194BarOrdLin, AV24EmprCod, AV7BarCod, AV10BarCodreo, AV9BarCodPar, AV93vNControl, A457FasCod, A460FasDsc, AV13BarOrdLin, A4033CCFch) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV98Pgmname = "ControlCalidadHTD.WWCCPoln2" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV98Pgmname", AV98Pgmname);
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcadreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcadreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcadreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavCctarc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCctarc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCctarc_Enabled), 5, 0), true);
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

   public void strup2CV0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e142CV2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV95vNumSel = (byte)(localUtil.ctol( httpContext.cgiGet( "vVNUMSEL"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         /* Read variables values. */
         AV7BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCod), 8, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCADREO");
            GX_FocusControl = edtavBarcadreo_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV6BarCadReo = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCadReo", GXutil.str( AV6BarCadReo, 1, 0));
         }
         else
         {
            AV6BarCadReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcadreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCadReo", GXutil.str( AV6BarCadReo, 1, 0));
         }
         AV9BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodPar", AV9BarCodPar);
         AV14CCTArc = GXutil.upper( httpContext.cgiGet( edtavCctarc_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14CCTArc", AV14CCTArc);
         AV98Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV98Pgmname", AV98Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_50_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_50_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_502( ) ;
         if ( nGXsfl_50_idx > 0 )
         {
            AV81Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
            httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV81Selected);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARCOD");
               GX_FocusControl = edtavGridbarcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV33GridBarCod = 0 ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridBarCod), 8, 0));
            }
            else
            {
               AV33GridBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridBarCod), 8, 0));
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARCODREO");
               GX_FocusControl = edtavGridbarcodreo_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV35GridBarCodReo = (byte)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodreo_Internalname, GXutil.str( AV35GridBarCodReo, 1, 0));
            }
            else
            {
               AV35GridBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodreo_Internalname, GXutil.str( AV35GridBarCodReo, 1, 0));
            }
            AV34GridBarCodPar = httpContext.cgiGet( edtavGridbarcodpar_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodpar_Internalname, AV34GridBarCodPar);
            AV37GridBarProCod = httpContext.cgiGet( edtavGridbarprocod_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGridbarprocod_Internalname, AV37GridBarProCod);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARORDLIN");
               GX_FocusControl = edtavGridbarordlin_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV36GridBarOrdLin = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGridbarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GridBarOrdLin), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV36GridBarOrdLin), "ZZZ9")));
            }
            else
            {
               AV36GridBarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGridbarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GridBarOrdLin), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV36GridBarOrdLin), "ZZZ9")));
            }
            AV39GridFasCod = GXutil.upper( httpContext.cgiGet( edtavGridfascod_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGridfascod_Internalname, AV39GridFasCod);
            AV40GridFasDsc = httpContext.cgiGet( edtavGridfasdsc_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavGridfasdsc_Internalname, AV40GridFasDsc);
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDNUM_CC");
               GX_FocusControl = edtavGridnum_cc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV41GridNum_CC = (short)(0) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGridnum_cc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridNum_CC), 4, 0));
            }
            else
            {
               AV41GridNum_CC = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavGridnum_cc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridNum_CC), 4, 0));
            }
         }
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
      e142CV2 ();
      if (returnInSub) return;
   }

   public void e142CV2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV85Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wwccpoln2_impl.this.GXt_char1 = GXv_char2[0] ;
      AV85Station = GXt_char1 ;
      GXv_char2[0] = AV24EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV91UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV85Station, GXv_char2, GXv_char3, GXv_char4) ;
      wwccpoln2_impl.this.AV24EmprCod = GXv_char2[0] ;
      wwccpoln2_impl.this.AV25EmprNom = GXv_char3[0] ;
      wwccpoln2_impl.this.AV91UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   private void e152CV2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV94vNumReg = (byte)(0) ;
      /* Using cursor H02CV2 */
      pr_default.execute(0, new Object[] {AV24EmprCod, Integer.valueOf(AV7BarCod), Byte.valueOf(AV10BarCodreo), AV9BarCodPar});
      while ( (pr_default.getStatus(0) != 101) )
      {
         brk2CV3 = false ;
         A194BarOrdLin = H02CV2_A194BarOrdLin[0] ;
         A758ProCod = H02CV2_A758ProCod[0] ;
         A130BarCodPar = H02CV2_A130BarCodPar[0] ;
         A132BarCodReo = H02CV2_A132BarCodReo[0] ;
         A129BarCod = H02CV2_A129BarCod[0] ;
         A396EmprCod = H02CV2_A396EmprCod[0] ;
         A457FasCod = H02CV2_A457FasCod[0] ;
         A460FasDsc = H02CV2_A460FasDsc[0] ;
         A457FasCod = H02CV2_A457FasCod[0] ;
         A460FasDsc = H02CV2_A460FasDsc[0] ;
         AV77Num_cc = (short)(0) ;
         while ( (pr_default.getStatus(0) != 101) && ( GXutil.strcmp(H02CV2_A396EmprCod[0], A396EmprCod) == 0 ) && ( H02CV2_A129BarCod[0] == A129BarCod ) && ( H02CV2_A132BarCodReo[0] == A132BarCodReo ) && ( GXutil.strcmp(H02CV2_A130BarCodPar[0], A130BarCodPar) == 0 ) )
         {
            if ( ! ( ( GXutil.strcmp(H02CV2_A758ProCod[0], A758ProCod) == 0 ) && ( H02CV2_A194BarOrdLin[0] == A194BarOrdLin ) ) )
            {
               if (true) break;
            }
            brk2CV3 = false ;
            brk2CV3 = true ;
            pr_default.readNext(0);
         }
         AV13BarOrdLin = A194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13BarOrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13BarOrdLin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARORDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV13BarOrdLin), "ZZZ9")));
         /* Execute user subroutine: 'NCONTROLES' */
         S113 ();
         if ( returnInSub )
         {
            pr_default.close(0);
            pr_default.close(0);
            pr_default.close(0);
            returnInSub = true;
            if (true) return;
         }
         AV77Num_cc = AV93vNControl ;
         chkavSelected.setEnabled( 1 );
         AV81Selected = true ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV81Selected);
         AV33GridBarCod = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridBarCod), 8, 0));
         AV35GridBarCodReo = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodreo_Internalname, GXutil.str( AV35GridBarCodReo, 1, 0));
         AV34GridBarCodPar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridbarcodpar_Internalname, AV34GridBarCodPar);
         AV37GridBarProCod = A758ProCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridbarprocod_Internalname, AV37GridBarProCod);
         AV36GridBarOrdLin = A194BarOrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridbarordlin_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36GridBarOrdLin), 4, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vGRIDBARORDLIN"+"_"+sGXsfl_50_idx, getSecureSignedToken( sGXsfl_50_idx, localUtil.format( DecimalUtil.doubleToDec(AV36GridBarOrdLin), "ZZZ9")));
         AV39GridFasCod = A457FasCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridfascod_Internalname, AV39GridFasCod);
         AV40GridFasDsc = A460FasDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridfasdsc_Internalname, AV40GridFasDsc);
         AV41GridNum_CC = AV77Num_cc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavGridnum_cc_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridNum_CC), 4, 0));
         AV94vNumReg = (byte)(AV94vNumReg+1) ;
         lblUseraction1_Caption = httpContext.getMessage( "<i class=\"fas fa-file-word\" style=\"color:#D60021; font-size:24px; \"></i>", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblUseraction1_Internalname, "Caption", lblUseraction1_Caption, true);
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
         if ( ! brk2CV3 )
         {
            brk2CV3 = true ;
            pr_default.readNext(0);
         }
      }
      pr_default.close(0);
      if ( AV94vNumReg > 0 )
      {
         lblUseraction1_Caption = httpContext.getMessage( "<i class=\"fas fa-file-word\" style=\"color:#D60021; font-size:24px; \"></i>", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblUseraction1_Internalname, "Caption", lblUseraction1_Caption, true);
      }
      /*  Sending Event outputs  */
   }

   public void e112CV2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV24EmprCod,Integer.valueOf(AV7BarCod),Byte.valueOf(AV10BarCodreo),AV9BarCodPar,AV14CCTArc});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV24EmprCod","AV7BarCod","AV10BarCodreo","AV9BarCodPar","AV14CCTArc"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e122CV2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      AV48Lin = 0 ;
      /* Start For Each Line in Grid */
      nRC_GXsfl_50 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_50"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_50_fel_idx = 0 ;
      while ( nGXsfl_50_fel_idx < nRC_GXsfl_50 )
      {
         nGXsfl_50_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_50_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_50_fel_idx+1) ;
         sGXsfl_50_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_50_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_502( ) ;
         AV81Selected = GXutil.strtobool( httpContext.cgiGet( chkavSelected.getInternalname())) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARCOD");
            GX_FocusControl = edtavGridbarcod_Internalname ;
            wbErr = true ;
            AV33GridBarCod = 0 ;
         }
         else
         {
            AV33GridBarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavGridbarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARCODREO");
            GX_FocusControl = edtavGridbarcodreo_Internalname ;
            wbErr = true ;
            AV35GridBarCodReo = (byte)(0) ;
         }
         else
         {
            AV35GridBarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavGridbarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV34GridBarCodPar = httpContext.cgiGet( edtavGridbarcodpar_Internalname) ;
         AV37GridBarProCod = httpContext.cgiGet( edtavGridbarprocod_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDBARORDLIN");
            GX_FocusControl = edtavGridbarordlin_Internalname ;
            wbErr = true ;
            AV36GridBarOrdLin = (short)(0) ;
         }
         else
         {
            AV36GridBarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridbarordlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         AV39GridFasCod = GXutil.upper( httpContext.cgiGet( edtavGridfascod_Internalname)) ;
         AV40GridFasDsc = httpContext.cgiGet( edtavGridfasdsc_Internalname) ;
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDNUM_CC");
            GX_FocusControl = edtavGridnum_cc_Internalname ;
            wbErr = true ;
            AV41GridNum_CC = (short)(0) ;
         }
         else
         {
            AV41GridNum_CC = (short)(localUtil.ctol( httpContext.cgiGet( edtavGridnum_cc_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         }
         if ( AV81Selected )
         {
            AV48Lin = (int)(AV48Lin+1) ;
            AV86Tab_cod[AV48Lin-1] = AV36GridBarOrdLin ;
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
      if ( AV48Lin == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "No ha seleccionado ninguna linea ¡¡¡", ""));
      }
      else
      {
         GXt_int5 = AV31Flg ;
         GXv_int6[0] = GXt_int5 ;
         new app.pexicon(remoteHandle, context).execute( AV24EmprCod, httpContext.getMessage( "IWORD", ""), GXv_int6) ;
         wwccpoln2_impl.this.GXt_int5 = GXv_int6[0] ;
         AV31Flg = GXt_int5 ;
         if ( AV31Flg == 0 )
         {
            GXv_char4[0] = AV24EmprCod ;
            GXv_int7[0] = AV7BarCod ;
            GXv_int6[0] = AV10BarCodreo ;
            GXv_char3[0] = AV9BarCodPar ;
            GXv_char2[0] = AV14CCTArc ;
            GXv_char8[0] = httpContext.getMessage( "CON", "") ;
            new app.controlcalidadhtd.pccpolnxml(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, AV86Tab_cod, GXv_char8) ;
            wwccpoln2_impl.this.AV24EmprCod = GXv_char4[0] ;
            wwccpoln2_impl.this.AV7BarCod = GXv_int7[0] ;
            wwccpoln2_impl.this.AV10BarCodreo = GXv_int6[0] ;
            wwccpoln2_impl.this.AV9BarCodPar = GXv_char3[0] ;
            wwccpoln2_impl.this.AV14CCTArc = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodreo", GXutil.str( AV10BarCodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodPar", AV9BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV14CCTArc", AV14CCTArc);
         }
         else
         {
            GXv_char8[0] = AV24EmprCod ;
            GXv_int7[0] = AV7BarCod ;
            GXv_int6[0] = AV10BarCodreo ;
            GXv_char4[0] = AV9BarCodPar ;
            GXv_char3[0] = AV14CCTArc ;
            GXv_char2[0] = httpContext.getMessage( "CON", "") ;
            new app.controlcalidadhtd.pccpolnxml(remoteHandle, context).execute( GXv_char8, GXv_int7, GXv_int6, GXv_char4, GXv_char3, AV86Tab_cod, GXv_char2) ;
            wwccpoln2_impl.this.AV24EmprCod = GXv_char8[0] ;
            wwccpoln2_impl.this.AV7BarCod = GXv_int7[0] ;
            wwccpoln2_impl.this.AV10BarCodreo = GXv_int6[0] ;
            wwccpoln2_impl.this.AV9BarCodPar = GXv_char4[0] ;
            wwccpoln2_impl.this.AV14CCTArc = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodreo", GXutil.str( AV10BarCodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodPar", AV9BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV14CCTArc", AV14CCTArc);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e132CV2( )
   {
      /* 'Doprompt1' Routine */
      returnInSub = false ;
      GX_I = 1 ;
      while ( GX_I <= 100 )
      {
         AV86Tab_cod[GX_I-1] = (short)(0) ;
         GX_I = (int)(GX_I+1) ;
      }
      GXt_int5 = AV31Flg ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV24EmprCod, httpContext.getMessage( "IWORD", ""), GXv_int6) ;
      wwccpoln2_impl.this.GXt_int5 = GXv_int6[0] ;
      AV31Flg = GXt_int5 ;
      if ( AV31Flg == 0 )
      {
         GXv_char8[0] = AV24EmprCod ;
         GXv_int7[0] = AV7BarCod ;
         GXv_int6[0] = AV10BarCodreo ;
         GXv_char4[0] = AV9BarCodPar ;
         GXv_char3[0] = AV14CCTArc ;
         GXv_char2[0] = httpContext.getMessage( "SIN", "") ;
         new app.controlcalidadhtd.pccpolnxml(remoteHandle, context).execute( GXv_char8, GXv_int7, GXv_int6, GXv_char4, GXv_char3, AV86Tab_cod, GXv_char2) ;
         wwccpoln2_impl.this.AV24EmprCod = GXv_char8[0] ;
         wwccpoln2_impl.this.AV7BarCod = GXv_int7[0] ;
         wwccpoln2_impl.this.AV10BarCodreo = GXv_int6[0] ;
         wwccpoln2_impl.this.AV9BarCodPar = GXv_char4[0] ;
         wwccpoln2_impl.this.AV14CCTArc = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodreo", GXutil.str( AV10BarCodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodPar", AV9BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV14CCTArc", AV14CCTArc);
      }
      else
      {
         GXv_char8[0] = AV24EmprCod ;
         GXv_int7[0] = AV7BarCod ;
         GXv_int6[0] = AV10BarCodreo ;
         GXv_char4[0] = AV9BarCodPar ;
         GXv_char3[0] = AV14CCTArc ;
         GXv_char2[0] = httpContext.getMessage( "SIN", "") ;
         new app.controlcalidadhtd.pccpolnxml(remoteHandle, context).execute( GXv_char8, GXv_int7, GXv_int6, GXv_char4, GXv_char3, AV86Tab_cod, GXv_char2) ;
         wwccpoln2_impl.this.AV24EmprCod = GXv_char8[0] ;
         wwccpoln2_impl.this.AV7BarCod = GXv_int7[0] ;
         wwccpoln2_impl.this.AV10BarCodreo = GXv_int6[0] ;
         wwccpoln2_impl.this.AV9BarCodPar = GXv_char4[0] ;
         wwccpoln2_impl.this.AV14CCTArc = GXv_char3[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodreo", GXutil.str( AV10BarCodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodPar", AV9BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV14CCTArc", AV14CCTArc);
      }
      /*  Sending Event outputs  */
   }

   public void S113( )
   {
      /* 'NCONTROLES' Routine */
      returnInSub = false ;
      AV93vNControl = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93vNControl", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93vNControl), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVNCONTROL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93vNControl), "ZZZ9")));
      /* Optimized group. */
      /* Using cursor H02CV3 */
      pr_default.execute(1, new Object[] {AV24EmprCod, Integer.valueOf(AV7BarCod), Byte.valueOf(AV10BarCodreo), AV9BarCodPar, Short.valueOf(AV13BarOrdLin)});
      cV93vNControl = H02CV3_AV93vNControl[0] ;
      pr_default.close(1);
      AV93vNControl = (short)(AV93vNControl+cV93vNControl*1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93vNControl", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93vNControl), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVNCONTROL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV93vNControl), "ZZZ9")));
      /* End optimized group. */
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV24EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24EmprCod", AV24EmprCod);
      AV7BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7BarCod), 8, 0));
      AV10BarCodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10BarCodreo", GXutil.str( AV10BarCodreo, 1, 0));
      AV9BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarCodPar", AV9BarCodPar);
      AV14CCTArc = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14CCTArc", AV14CCTArc);
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
      pa2CV2( ) ;
      ws2CV2( ) ;
      we2CV2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116154069", true, true);
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
         httpContext.AddJavascriptSource("controlcalidadhtd/wwccpoln2.js", "?202682116154069", false, true);
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
      wb2CV0( ) ;
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
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
         AV81Selected = GXutil.strtobool( GXutil.booltostr( AV81Selected)) ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV81Selected);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSelected.getInternalname(),GXutil.booltostr( AV81Selected),"","",Integer.valueOf(-1),Integer.valueOf(chkavSelected.getEnabled()),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(51, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSelected.getEnabled()!=0)&&(chkavSelected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,51);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridbarcod_Enabled!=0)&&(edtavGridbarcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridbarcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV33GridBarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGridbarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33GridBarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV33GridBarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGridbarcod_Enabled!=0)&&(edtavGridbarcod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,52);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridbarcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridbarcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridbarcodreo_Enabled!=0)&&(edtavGridbarcodreo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridbarcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV35GridBarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGridbarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV35GridBarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV35GridBarCodReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGridbarcodreo_Enabled!=0)&&(edtavGridbarcodreo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridbarcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridbarcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridbarcodpar_Enabled!=0)&&(edtavGridbarcodpar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridbarcodpar_Internalname,GXutil.rtrim( AV34GridBarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGridbarcodpar_Enabled!=0)&&(edtavGridbarcodpar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,54);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridbarcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridbarcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridbarprocod_Enabled!=0)&&(edtavGridbarprocod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridbarprocod_Internalname,GXutil.rtrim( AV37GridBarProCod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGridbarprocod_Enabled!=0)&&(edtavGridbarprocod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,55);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridbarprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridbarprocod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridbarordlin_Enabled!=0)&&(edtavGridbarordlin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridbarordlin_Internalname,GXutil.ltrim( localUtil.ntoc( AV36GridBarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGridbarordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV36GridBarOrdLin), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV36GridBarOrdLin), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGridbarordlin_Enabled!=0)&&(edtavGridbarordlin_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,56);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridbarordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridbarordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridfascod_Enabled!=0)&&(edtavGridfascod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridfascod_Internalname,GXutil.rtrim( AV39GridFasCod),GXutil.rtrim( localUtil.format( AV39GridFasCod, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavGridfascod_Enabled!=0)&&(edtavGridfascod_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,57);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridfascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridfascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridfasdsc_Enabled!=0)&&(edtavGridfasdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridfasdsc_Internalname,GXutil.rtrim( AV40GridFasDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavGridfasdsc_Enabled!=0)&&(edtavGridfasdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,58);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridfasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridfasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavGridnum_cc_Enabled!=0)&&(edtavGridnum_cc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_50_idx+"',50)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGridnum_cc_Internalname,GXutil.ltrim( localUtil.ntoc( AV41GridNum_CC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGridnum_cc_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41GridNum_CC), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV41GridNum_CC), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavGridnum_cc_Enabled!=0)&&(edtavGridnum_cc_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGridnum_cc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGridnum_cc_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(50),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2CV2( ) ;
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
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.booltostr( AV81Selected));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSelected.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV33GridBarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridbarcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV35GridBarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridbarcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV34GridBarCodPar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridbarcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV37GridBarProCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridbarprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV36GridBarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridbarordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV39GridFasCod));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridfascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV40GridFasDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGridfasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV41GridNum_CC, (byte)(4), (byte)(0), ".", "")));
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
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
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
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
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
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblUseraction1_Caption = httpContext.getMessage( "<i class=\"Image WWPBtnNeedMultiRowWOPagingSelection fas fa-file-word\" style=\"color:#D60021; font-size:24px; \"></i>", "") ;
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
      Form.setCaption( httpContext.getMessage( "Auditoría N Controles XML", "") );
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
      AV81Selected = GXutil.strtobool( GXutil.booltostr( AV81Selected)) ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSelected.getInternalname(), AV81Selected);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4033CCFch',fld:'CCFCH',pic:''},{av:'AV93vNControl',fld:'vVNCONTROL',pic:'ZZZ9',hsh:true},{av:'AV13BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e152CV2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV93vNControl',fld:'vVNCONTROL',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV13BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A4033CCFch',fld:'CCFCH',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV13BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'chkavSelected.getEnabled()',ctrl:'vSELECTED',prop:'Enabled'},{av:'AV81Selected',fld:'vSELECTED',pic:''},{av:'AV33GridBarCod',fld:'vGRIDBARCOD',pic:'ZZZZZZZ9'},{av:'AV35GridBarCodReo',fld:'vGRIDBARCODREO',pic:'9'},{av:'AV34GridBarCodPar',fld:'vGRIDBARCODPAR',pic:''},{av:'AV37GridBarProCod',fld:'vGRIDBARPROCOD',pic:''},{av:'AV36GridBarOrdLin',fld:'vGRIDBARORDLIN',pic:'ZZZ9',hsh:true},{av:'AV39GridFasCod',fld:'vGRIDFASCOD',pic:'@!'},{av:'AV40GridFasDsc',fld:'vGRIDFASDSC',pic:''},{av:'AV41GridNum_CC',fld:'vGRIDNUM_CC',pic:'ZZZ9'},{av:'lblUseraction1_Caption',ctrl:'USERACTION1',prop:'Caption'},{av:'AV93vNControl',fld:'vVNCONTROL',pic:'ZZZ9',hsh:true}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e112CV2',iparms:[{av:'AV14CCTArc',fld:'vCCTARC',pic:'@!'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e122CV2',iparms:[{av:'AV81Selected',fld:'vSELECTED',grid:50,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_50',ctrl:'GRID',grid:50,prop:'GridRC',grid:50},{av:'AV36GridBarOrdLin',fld:'vGRIDBARORDLIN',grid:50,pic:'ZZZ9',hsh:true},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV14CCTArc',fld:'vCCTARC',pic:'@!'},{av:'AV86Tab_cod',fld:'vTAB_COD',pic:'ZZZ9'}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV86Tab_cod',fld:'vTAB_COD',pic:'ZZZ9'},{av:'AV14CCTArc',fld:'vCCTARC',pic:'@!'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOPROMPT1'","{handler:'e132CV2',iparms:[{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV14CCTArc',fld:'vCCTARC',pic:'@!'}]");
      setEventMetadata("'DOPROMPT1'",",oparms:[{av:'AV86Tab_cod',fld:'vTAB_COD',pic:'ZZZ9'},{av:'AV14CCTArc',fld:'vCCTARC',pic:'@!'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV93vNControl',fld:'vVNCONTROL',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV13BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A4033CCFch',fld:'CCFCH',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV93vNControl',fld:'vVNCONTROL',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV13BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A4033CCFch',fld:'CCFCH',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV93vNControl',fld:'vVNCONTROL',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV13BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A4033CCFch',fld:'CCFCH',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV24EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV10BarCodreo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV93vNControl',fld:'vVNCONTROL',pic:'ZZZ9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV13BarOrdLin',fld:'vBARORDLIN',pic:'ZZZ9',hsh:true},{av:'A4033CCFch',fld:'CCFCH',pic:''}]");
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
      wcpOAV24EmprCod = "" ;
      wcpOAV9BarCodPar = "" ;
      wcpOAV14CCTArc = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV24EmprCod = "" ;
      AV9BarCodPar = "" ;
      AV14CCTArc = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A4033CCFch = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV86Tab_cod = new short[100] ;
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
      AV98Pgmname = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV34GridBarCodPar = "" ;
      AV37GridBarProCod = "" ;
      AV39GridFasCod = "" ;
      AV40GridFasDsc = "" ;
      AV85Station = "" ;
      GXt_char1 = "" ;
      AV25EmprNom = "" ;
      AV91UsurCod = "" ;
      scmdbuf = "" ;
      H02CV2_A4031CCTCod = new int[1] ;
      H02CV2_A4034CCTLin = new short[1] ;
      H02CV2_A194BarOrdLin = new short[1] ;
      H02CV2_A758ProCod = new String[] {""} ;
      H02CV2_A130BarCodPar = new String[] {""} ;
      H02CV2_A132BarCodReo = new byte[1] ;
      H02CV2_A129BarCod = new int[1] ;
      H02CV2_A396EmprCod = new String[] {""} ;
      H02CV2_A457FasCod = new String[] {""} ;
      H02CV2_A460FasDsc = new String[] {""} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_char8 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      H02CV3_AV93vNControl = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlcalidadhtd.wwccpoln2__default(),
         new Object[] {
             new Object[] {
            H02CV2_A4031CCTCod, H02CV2_A4034CCTLin, H02CV2_A194BarOrdLin, H02CV2_A758ProCod, H02CV2_A130BarCodPar, H02CV2_A132BarCodReo, H02CV2_A129BarCod, H02CV2_A396EmprCod, H02CV2_A457FasCod, H02CV2_A460FasDsc
            }
            , new Object[] {
            H02CV3_AV93vNControl
            }
         }
      );
      AV98Pgmname = "ControlCalidadHTD.WWCCPoln2" ;
      /* GeneXus formulas. */
      AV98Pgmname = "ControlCalidadHTD.WWCCPoln2" ;
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcadreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavCctarc_Enabled = 0 ;
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

   private byte wcpOAV10BarCodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV10BarCodreo ;
   private byte A132BarCodReo ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV95vNumSel ;
   private byte AV6BarCadReo ;
   private byte AV35GridBarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte AV94vNumReg ;
   private byte AV31Flg ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short A194BarOrdLin ;
   private short AV93vNControl ;
   private short AV13BarOrdLin ;
   private short AV86Tab_cod[] ;
   private short wbEnd ;
   private short wbStart ;
   private short AV36GridBarOrdLin ;
   private short AV41GridNum_CC ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV77Num_cc ;
   private short cV93vNControl ;
   private int wcpOAV7BarCod ;
   private int nRC_GXsfl_50 ;
   private int subGrid_Rows ;
   private int AV7BarCod ;
   private int nGXsfl_50_idx=1 ;
   private int A129BarCod ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcadreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavCctarc_Enabled ;
   private int edtavPgmname_Enabled ;
   private int AV33GridBarCod ;
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
   private int AV48Lin ;
   private int nGXsfl_50_fel_idx=1 ;
   private int GX_I ;
   private int GXv_int7[] ;
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
   private String wcpOAV24EmprCod ;
   private String wcpOAV9BarCodPar ;
   private String wcpOAV14CCTArc ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV24EmprCod ;
   private String AV9BarCodPar ;
   private String AV14CCTArc ;
   private String sGXsfl_50_idx="0001" ;
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
   private String divUnnamedtable2_Internalname ;
   private String edtavCctarc_Internalname ;
   private String edtavCctarc_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String lblUseraction1_Internalname ;
   private String lblUseraction1_Caption ;
   private String lblUseraction1_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV98Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavGridbarcod_Internalname ;
   private String edtavGridbarcodreo_Internalname ;
   private String AV34GridBarCodPar ;
   private String edtavGridbarcodpar_Internalname ;
   private String AV37GridBarProCod ;
   private String edtavGridbarprocod_Internalname ;
   private String edtavGridbarordlin_Internalname ;
   private String AV39GridFasCod ;
   private String edtavGridfascod_Internalname ;
   private String AV40GridFasDsc ;
   private String edtavGridfasdsc_Internalname ;
   private String edtavGridnum_cc_Internalname ;
   private String AV85Station ;
   private String GXt_char1 ;
   private String AV25EmprNom ;
   private String AV91UsurCod ;
   private String scmdbuf ;
   private String sGXsfl_50_fel_idx="0001" ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
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
   private boolean AV81Selected ;
   private boolean bGXsfl_50_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean brk2CV3 ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private ICheckbox chkavSelected ;
   private IDataStoreProvider pr_default ;
   private int[] H02CV2_A4031CCTCod ;
   private short[] H02CV2_A4034CCTLin ;
   private short[] H02CV2_A194BarOrdLin ;
   private String[] H02CV2_A758ProCod ;
   private String[] H02CV2_A130BarCodPar ;
   private byte[] H02CV2_A132BarCodReo ;
   private int[] H02CV2_A129BarCod ;
   private String[] H02CV2_A396EmprCod ;
   private String[] H02CV2_A457FasCod ;
   private String[] H02CV2_A460FasDsc ;
   private short[] H02CV3_AV93vNControl ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class wwccpoln2__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02CV2", "SELECT T1.CCTCod, T1.CCTLin, T1.BarOrdLin, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T2.FasCod, T3.FasDsc FROM ((TXPCC1 T1 INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod = T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T2.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02CV3", "SELECT COUNT(*) FROM TXPCC WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarOrdLin = ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((String[]) buf[8])[0] = rslt.getString(9, 8);
               ((String[]) buf[9])[0] = rslt.getString(10, 28);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
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
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setShort(5, ((Number) parms[4]).shortValue());
               return;
      }
   }

}

