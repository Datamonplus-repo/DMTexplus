package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class agrupacionhdr_impl extends GXDataArea
{
   public agrupacionhdr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public agrupacionhdr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( agrupacionhdr_impl.class ));
   }

   public agrupacionhdr_impl( int remoteHandle ,
                              ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSdtselectionhdr__selected = UIFactory.getCheckbox(this);
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsdtselectionhdrs") == 0 )
         {
            gxnrgridsdtselectionhdrs_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsdtselectionhdrs") == 0 )
         {
            gxgrgridsdtselectionhdrs_refresh_invoke( ) ;
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

   public void gxnrgridsdtselectionhdrs_newrow_invoke( )
   {
      nRC_GXsfl_39 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_39"))) ;
      nGXsfl_39_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_39_idx"))) ;
      sGXsfl_39_idx = httpContext.GetPar( "sGXsfl_39_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsdtselectionhdrs_newrow( ) ;
      /* End function gxnrGridsdtselectionhdrs_newrow_invoke */
   }

   public void gxgrgridsdtselectionhdrs_refresh_invoke( )
   {
      subGridsdtselectionhdrs_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsdtselectionhdrs_Rows"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV5SDTSelectionHDR);
      AV16EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsdtselectionhdrs_refresh( subGridsdtselectionhdrs_Rows, AV5SDTSelectionHDR, AV16EmprCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsdtselectionhdrs_refresh_invoke */
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
      pa2CZ2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2CZ2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.agrupacionhdr", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTSELECTIONHDR", getSecureSignedToken( "", AV5SDTSelectionHDR));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Sdtselectionhdr", AV5SDTSelectionHDR);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Sdtselectionhdr", AV5SDTSelectionHDR);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Sdtselectionhdr", getSecureSignedToken( "", AV5SDTSelectionHDR));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_39", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_39, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDSDTSELECTIONHDRSCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV8GridSDTSelectionHDRsCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDSDTSELECTIONHDRSPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV9GridSDTSelectionHDRsPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTSELECTIONHDR", AV5SDTSelectionHDR);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTSELECTIONHDR", AV5SDTSelectionHDR);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTSELECTIONHDR", getSecureSignedToken( "", AV5SDTSelectionHDR));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTSELECTIONHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTSELECTIONHDRS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Class", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridsdtselectionhdrspaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridsdtselectionhdrspaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Shownext", GXutil.booltostr( Gridsdtselectionhdrspaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Showlast", GXutil.booltostr( Gridsdtselectionhdrspaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridsdtselectionhdrspaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridsdtselectionhdrspaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtselectionhdrspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Previous", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Next", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Caption", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Width", GXutil.rtrim( Dvpanel_panel_resultado_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autowidth", GXutil.booltostr( Dvpanel_panel_resultado_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoheight", GXutil.booltostr( Dvpanel_panel_resultado_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Cls", GXutil.rtrim( Dvpanel_panel_resultado_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Title", GXutil.rtrim( Dvpanel_panel_resultado_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsible", GXutil.booltostr( Dvpanel_panel_resultado_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Collapsed", GXutil.booltostr( Dvpanel_panel_resultado_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Showcollapseicon", GXutil.booltostr( Dvpanel_panel_resultado_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Iconposition", GXutil.rtrim( Dvpanel_panel_resultado_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PANEL_RESULTADO_Autoscroll", GXutil.booltostr( Dvpanel_panel_resultado_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsdtselectionhdrs_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtselectionhdrspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridsdtselectionhdrspaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridsdtselectionhdrspaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         we2CZ2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2CZ2( ) ;
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
      return formatLink("app.agrupacionhdr", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "AgrupacionHDR" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Agrupacion HDR", "") ;
   }

   public void wb2CZ0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconformemacro_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "Conforme Macro", ""), bttBtnconformemacro_Jsonclick, 5, httpContext.getMessage( "Conforme Macro", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCONFORMEMACRO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AgrupacionHDR.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 39, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AgrupacionHDR.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         ucDvpanel_panel_resultado.setProperty("Width", Dvpanel_panel_resultado_Width);
         ucDvpanel_panel_resultado.setProperty("AutoWidth", Dvpanel_panel_resultado_Autowidth);
         ucDvpanel_panel_resultado.setProperty("AutoHeight", Dvpanel_panel_resultado_Autoheight);
         ucDvpanel_panel_resultado.setProperty("Cls", Dvpanel_panel_resultado_Cls);
         ucDvpanel_panel_resultado.setProperty("Title", Dvpanel_panel_resultado_Title);
         ucDvpanel_panel_resultado.setProperty("Collapsible", Dvpanel_panel_resultado_Collapsible);
         ucDvpanel_panel_resultado.setProperty("Collapsed", Dvpanel_panel_resultado_Collapsed);
         ucDvpanel_panel_resultado.setProperty("ShowCollapseIcon", Dvpanel_panel_resultado_Showcollapseicon);
         ucDvpanel_panel_resultado.setProperty("IconPosition", Dvpanel_panel_resultado_Iconposition);
         ucDvpanel_panel_resultado.setProperty("AutoScroll", Dvpanel_panel_resultado_Autoscroll);
         ucDvpanel_panel_resultado.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panel_resultado_Internalname, "DVPANEL_PANEL_RESULTADOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PANEL_RESULTADOContainer"+"Panel_Resultado"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divPanel_resultado_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridsdtselectionhdrstablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridsdtselectionhdrsContainer.SetWrapped(nGXWrapped);
         startgridcontrol39( ) ;
      }
      if ( wbEnd == 39 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_39 = (int)(nGXsfl_39_idx-1) ;
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV52GXV1 = nGXsfl_39_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"GridsdtselectionhdrsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridsdtselectionhdrs", GridsdtselectionhdrsContainer, subGridsdtselectionhdrs_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridsdtselectionhdrsContainerData", GridsdtselectionhdrsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "GridsdtselectionhdrsContainerData"+"V", GridsdtselectionhdrsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridsdtselectionhdrsContainerData"+"V"+"\" value='"+GridsdtselectionhdrsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridsdtselectionhdrspaginationbar.setProperty("Class", Gridsdtselectionhdrspaginationbar_Class);
         ucGridsdtselectionhdrspaginationbar.setProperty("ShowFirst", Gridsdtselectionhdrspaginationbar_Showfirst);
         ucGridsdtselectionhdrspaginationbar.setProperty("ShowPrevious", Gridsdtselectionhdrspaginationbar_Showprevious);
         ucGridsdtselectionhdrspaginationbar.setProperty("ShowNext", Gridsdtselectionhdrspaginationbar_Shownext);
         ucGridsdtselectionhdrspaginationbar.setProperty("ShowLast", Gridsdtselectionhdrspaginationbar_Showlast);
         ucGridsdtselectionhdrspaginationbar.setProperty("PagesToShow", Gridsdtselectionhdrspaginationbar_Pagestoshow);
         ucGridsdtselectionhdrspaginationbar.setProperty("PagingButtonsPosition", Gridsdtselectionhdrspaginationbar_Pagingbuttonsposition);
         ucGridsdtselectionhdrspaginationbar.setProperty("PagingCaptionPosition", Gridsdtselectionhdrspaginationbar_Pagingcaptionposition);
         ucGridsdtselectionhdrspaginationbar.setProperty("EmptyGridClass", Gridsdtselectionhdrspaginationbar_Emptygridclass);
         ucGridsdtselectionhdrspaginationbar.setProperty("RowsPerPageSelector", Gridsdtselectionhdrspaginationbar_Rowsperpageselector);
         ucGridsdtselectionhdrspaginationbar.setProperty("RowsPerPageOptions", Gridsdtselectionhdrspaginationbar_Rowsperpageoptions);
         ucGridsdtselectionhdrspaginationbar.setProperty("Previous", Gridsdtselectionhdrspaginationbar_Previous);
         ucGridsdtselectionhdrspaginationbar.setProperty("Next", Gridsdtselectionhdrspaginationbar_Next);
         ucGridsdtselectionhdrspaginationbar.setProperty("Caption", Gridsdtselectionhdrspaginationbar_Caption);
         ucGridsdtselectionhdrspaginationbar.setProperty("EmptyGridCaption", Gridsdtselectionhdrspaginationbar_Emptygridcaption);
         ucGridsdtselectionhdrspaginationbar.setProperty("RowsPerPageCaption", Gridsdtselectionhdrspaginationbar_Rowsperpagecaption);
         ucGridsdtselectionhdrspaginationbar.setProperty("CurrentPage", AV8GridSDTSelectionHDRsCurrentPage);
         ucGridsdtselectionhdrspaginationbar.setProperty("PageCount", AV9GridSDTSelectionHDRsPageCount);
         ucGridsdtselectionhdrspaginationbar.render(context, "dvelop.dvpaginationbar", Gridsdtselectionhdrspaginationbar_Internalname, "GRIDSDTSELECTIONHDRSPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV77Pgmname), GXutil.rtrim( localUtil.format( AV77Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AgrupacionHDR.htm");
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
         ucGridsdtselectionhdrs_empowerer.render(context, "wwp.gridempowerer", Gridsdtselectionhdrs_empowerer_Internalname, "GRIDSDTSELECTIONHDRS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 39 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               AV52GXV1 = nGXsfl_39_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"GridsdtselectionhdrsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridsdtselectionhdrs", GridsdtselectionhdrsContainer, subGridsdtselectionhdrs_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridsdtselectionhdrsContainerData", GridsdtselectionhdrsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "GridsdtselectionhdrsContainerData"+"V", GridsdtselectionhdrsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"GridsdtselectionhdrsContainerData"+"V"+"\" value='"+GridsdtselectionhdrsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start2CZ2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Agrupacion HDR", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2CZ0( ) ;
   }

   public void ws2CZ2( )
   {
      start2CZ2( ) ;
      evt2CZ2( ) ;
   }

   public void evt2CZ2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTSELECTIONHDRSPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e112CZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDSDTSELECTIONHDRSPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122CZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCONFORMEMACRO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoConformeMacro' */
                           e132CZ2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e142CZ2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 25), "GRIDSDTSELECTIONHDRS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_39_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_392( ) ;
                           AV52GXV1 = (int)(nGXsfl_39_idx+GRIDSDTSELECTIONHDRS_nFirstRecordOnPage) ;
                           if ( ( AV5SDTSelectionHDR.size() >= AV52GXV1 ) && ( AV52GXV1 > 0 ) )
                           {
                              AV5SDTSelectionHDR.currentItem( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)) );
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
                                 e152CZ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e162CZ2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSDTSELECTIONHDRS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e172CZ2 ();
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

   public void we2CZ2( )
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

   public void pa2CZ2( )
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
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridsdtselectionhdrs_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_392( ) ;
      while ( nGXsfl_39_idx <= nRC_GXsfl_39 )
      {
         sendrow_392( ) ;
         nGXsfl_39_idx = ((subGridsdtselectionhdrs_Islastpage==1)&&(nGXsfl_39_idx+1>subgridsdtselectionhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridsdtselectionhdrsContainer)) ;
      /* End function gxnrGridsdtselectionhdrs_newrow */
   }

   public void gxgrgridsdtselectionhdrs_refresh( int subGridsdtselectionhdrs_Rows ,
                                                 GXBaseCollection<app.SdtSDTSelectionHDR_Item> AV5SDTSelectionHDR ,
                                                 String AV16EmprCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e162CZ2 ();
      GRIDSDTSELECTIONHDRS_nCurrentRecord = 0 ;
      rf2CZ2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsdtselectionhdrs_refresh */
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
      rf2CZ2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV77Pgmname = "AgrupacionHDR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Pgmname", AV77Pgmname);
      Gx_err = (short)(0) ;
      edtavSdtselectionhdr__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__emprcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__macrop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__macrop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__macrop_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barnhdr_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcodreo_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcodpar_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__discod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barser_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__bardisnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__bardisnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__bardisnum_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcolnom_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcolnum_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barnomcli_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barkgm_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barmtr_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barpie_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barunimed_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barsit_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__kilact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__kilact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__kilact_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__mtract_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__mtract_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__mtract_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcosany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcosany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcosany_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcospro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcospro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcospro_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barpri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barpri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barpri_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__usurcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__usurcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__usurcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2CZ2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridsdtselectionhdrsContainer.ClearRows();
      }
      wbStart = (short)(39) ;
      /* Execute user event: Refresh */
      e162CZ2 ();
      nGXsfl_39_idx = 1 ;
      sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_392( ) ;
      bGXsfl_39_Refreshing = true ;
      GridsdtselectionhdrsContainer.AddObjectProperty("GridName", "Gridsdtselectionhdrs");
      GridsdtselectionhdrsContainer.AddObjectProperty("CmpContext", "");
      GridsdtselectionhdrsContainer.AddObjectProperty("InMasterPage", "false");
      GridsdtselectionhdrsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridsdtselectionhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridsdtselectionhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridsdtselectionhdrsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridsdtselectionhdrsContainer.setPageSize( subgridsdtselectionhdrs_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_392( ) ;
         e172CZ2 ();
         if ( ( GRIDSDTSELECTIONHDRS_nCurrentRecord > 0 ) && ( GRIDSDTSELECTIONHDRS_nGridOutOfScope == 0 ) && ( nGXsfl_39_idx == 1 ) )
         {
            GRIDSDTSELECTIONHDRS_nCurrentRecord = 0 ;
            GRIDSDTSELECTIONHDRS_nGridOutOfScope = 1 ;
            subgridsdtselectionhdrs_firstpage( ) ;
            e172CZ2 ();
         }
         wbEnd = (short)(39) ;
         wb2CZ0( ) ;
      }
      bGXsfl_39_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2CZ2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV16EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSDTSELECTIONHDR", AV5SDTSelectionHDR);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSDTSELECTIONHDR", AV5SDTSelectionHDR);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSDTSELECTIONHDR", getSecureSignedToken( "", AV5SDTSelectionHDR));
   }

   public int subgridsdtselectionhdrs_fnc_pagecount( )
   {
      GRIDSDTSELECTIONHDRS_nRecordCount = subgridsdtselectionhdrs_fnc_recordcount( ) ;
      if ( ((int)((GRIDSDTSELECTIONHDRS_nRecordCount) % (subgridsdtselectionhdrs_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSDTSELECTIONHDRS_nRecordCount/ (double) (subgridsdtselectionhdrs_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSDTSELECTIONHDRS_nRecordCount/ (double) (subgridsdtselectionhdrs_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsdtselectionhdrs_fnc_recordcount( )
   {
      return AV5SDTSelectionHDR.size() ;
   }

   public int subgridsdtselectionhdrs_fnc_recordsperpage( )
   {
      if ( subGridsdtselectionhdrs_Rows > 0 )
      {
         return subGridsdtselectionhdrs_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsdtselectionhdrs_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSDTSELECTIONHDRS_nFirstRecordOnPage/ (double) (subgridsdtselectionhdrs_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsdtselectionhdrs_firstpage( )
   {
      GRIDSDTSELECTIONHDRS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTSELECTIONHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtselectionhdrs_refresh( subGridsdtselectionhdrs_Rows, AV5SDTSelectionHDR, AV16EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtselectionhdrs_nextpage( )
   {
      GRIDSDTSELECTIONHDRS_nRecordCount = subgridsdtselectionhdrs_fnc_recordcount( ) ;
      if ( ( GRIDSDTSELECTIONHDRS_nRecordCount >= subgridsdtselectionhdrs_fnc_recordsperpage( ) ) && ( GRIDSDTSELECTIONHDRS_nEOF == 0 ) )
      {
         GRIDSDTSELECTIONHDRS_nFirstRecordOnPage = (long)(GRIDSDTSELECTIONHDRS_nFirstRecordOnPage+subgridsdtselectionhdrs_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTSELECTIONHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridsdtselectionhdrsContainer.AddObjectProperty("GRIDSDTSELECTIONHDRS_nFirstRecordOnPage", GRIDSDTSELECTIONHDRS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtselectionhdrs_refresh( subGridsdtselectionhdrs_Rows, AV5SDTSelectionHDR, AV16EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSDTSELECTIONHDRS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsdtselectionhdrs_previouspage( )
   {
      if ( GRIDSDTSELECTIONHDRS_nFirstRecordOnPage >= subgridsdtselectionhdrs_fnc_recordsperpage( ) )
      {
         GRIDSDTSELECTIONHDRS_nFirstRecordOnPage = (long)(GRIDSDTSELECTIONHDRS_nFirstRecordOnPage-subgridsdtselectionhdrs_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTSELECTIONHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtselectionhdrs_refresh( subGridsdtselectionhdrs_Rows, AV5SDTSelectionHDR, AV16EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsdtselectionhdrs_lastpage( )
   {
      GRIDSDTSELECTIONHDRS_nRecordCount = subgridsdtselectionhdrs_fnc_recordcount( ) ;
      if ( GRIDSDTSELECTIONHDRS_nRecordCount > subgridsdtselectionhdrs_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSDTSELECTIONHDRS_nRecordCount) % (subgridsdtselectionhdrs_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSDTSELECTIONHDRS_nFirstRecordOnPage = (long)(GRIDSDTSELECTIONHDRS_nRecordCount-subgridsdtselectionhdrs_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSDTSELECTIONHDRS_nFirstRecordOnPage = (long)(GRIDSDTSELECTIONHDRS_nRecordCount-((int)((GRIDSDTSELECTIONHDRS_nRecordCount) % (subgridsdtselectionhdrs_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSDTSELECTIONHDRS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTSELECTIONHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtselectionhdrs_refresh( subGridsdtselectionhdrs_Rows, AV5SDTSelectionHDR, AV16EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsdtselectionhdrs_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSDTSELECTIONHDRS_nFirstRecordOnPage = (long)(subgridsdtselectionhdrs_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSDTSELECTIONHDRS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSDTSELECTIONHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsdtselectionhdrs_refresh( subGridsdtselectionhdrs_Rows, AV5SDTSelectionHDR, AV16EmprCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV77Pgmname = "AgrupacionHDR" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Pgmname", AV77Pgmname);
      Gx_err = (short)(0) ;
      edtavSdtselectionhdr__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__emprcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__macrop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__macrop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__macrop_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barnhdr_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcodreo_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcodpar_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__discod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barser_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__bardisnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__bardisnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__bardisnum_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcolnom_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcolnum_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barnomcli_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barkgm_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barmtr_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barpie_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barunimed_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barsit_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__kilact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__kilact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__kilact_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__mtract_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__mtract_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__mtract_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcosany_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcosany_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcosany_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barcospro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barcospro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barcospro_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__barpri_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__barpri_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__barpri_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavSdtselectionhdr__usurcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSdtselectionhdr__usurcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtselectionhdr__usurcod_Enabled), 5, 0), !bGXsfl_39_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2CZ0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e152CZ2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Sdtselectionhdr"), AV5SDTSelectionHDR);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSDTSELECTIONHDR"), AV5SDTSelectionHDR);
         /* Read saved values. */
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV8GridSDTSelectionHDRsCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDSDTSELECTIONHDRSCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV9GridSDTSelectionHDRsPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDSDTSELECTIONHDRSPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTSELECTIONHDRS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDSDTSELECTIONHDRS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSDTSELECTIONHDRS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTSELECTIONHDRS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsdtselectionhdrs_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTSELECTIONHDRS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Gridsdtselectionhdrspaginationbar_Class = httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Class") ;
         Gridsdtselectionhdrspaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Showfirst")) ;
         Gridsdtselectionhdrspaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Showprevious")) ;
         Gridsdtselectionhdrspaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Shownext")) ;
         Gridsdtselectionhdrspaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Showlast")) ;
         Gridsdtselectionhdrspaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtselectionhdrspaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridsdtselectionhdrspaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Pagingcaptionposition") ;
         Gridsdtselectionhdrspaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Emptygridclass") ;
         Gridsdtselectionhdrspaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Rowsperpageselector")) ;
         Gridsdtselectionhdrspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridsdtselectionhdrspaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Rowsperpageoptions") ;
         Gridsdtselectionhdrspaginationbar_Previous = httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Previous") ;
         Gridsdtselectionhdrspaginationbar_Next = httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Next") ;
         Gridsdtselectionhdrspaginationbar_Caption = httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Caption") ;
         Gridsdtselectionhdrspaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Emptygridcaption") ;
         Gridsdtselectionhdrspaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_panel_resultado_Width = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Width") ;
         Dvpanel_panel_resultado_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autowidth")) ;
         Dvpanel_panel_resultado_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoheight")) ;
         Dvpanel_panel_resultado_Cls = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Cls") ;
         Dvpanel_panel_resultado_Title = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Title") ;
         Dvpanel_panel_resultado_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsible")) ;
         Dvpanel_panel_resultado_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Collapsed")) ;
         Dvpanel_panel_resultado_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Showcollapseicon")) ;
         Dvpanel_panel_resultado_Iconposition = httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Iconposition") ;
         Dvpanel_panel_resultado_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PANEL_RESULTADO_Autoscroll")) ;
         Gridsdtselectionhdrs_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDSDTSELECTIONHDRS_EMPOWERER_Gridinternalname") ;
         Gridsdtselectionhdrspaginationbar_Selectedpage = httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Selectedpage") ;
         Gridsdtselectionhdrspaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSDTSELECTIONHDRSPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_39 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_39"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_39_fel_idx = 0 ;
         while ( nGXsfl_39_fel_idx < nRC_GXsfl_39 )
         {
            nGXsfl_39_fel_idx = ((subGridsdtselectionhdrs_Islastpage==1)&&(nGXsfl_39_fel_idx+1>subgridsdtselectionhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_39_fel_idx+1) ;
            sGXsfl_39_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_392( ) ;
            AV52GXV1 = (int)(nGXsfl_39_fel_idx+GRIDSDTSELECTIONHDRS_nFirstRecordOnPage) ;
            if ( ( AV5SDTSelectionHDR.size() >= AV52GXV1 ) && ( AV52GXV1 > 0 ) )
            {
               AV5SDTSelectionHDR.currentItem( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)) );
            }
         }
         if ( nGXsfl_39_fel_idx == 0 )
         {
            nGXsfl_39_idx = 1 ;
            sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_392( ) ;
         }
         nGXsfl_39_fel_idx = 1 ;
         /* Read variables values. */
         AV77Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77Pgmname", AV77Pgmname);
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
      e152CZ2 ();
      if (returnInSub) return;
   }

   public void e152CZ2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV15Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      agrupacionhdr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Station = GXt_char1 ;
      GXv_char2[0] = AV16EmprCod ;
      GXv_char3[0] = AV17EmprNom ;
      GXv_char4[0] = AV18UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV15Station, GXv_char2, GXv_char3, GXv_char4) ;
      agrupacionhdr_impl.this.AV16EmprCod = GXv_char2[0] ;
      agrupacionhdr_impl.this.AV17EmprNom = GXv_char3[0] ;
      agrupacionhdr_impl.this.AV18UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16EmprCod", AV16EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV16EmprCod, "@!"))));
      Gridsdtselectionhdrs_empowerer_Gridinternalname = subGridsdtselectionhdrs_Internalname ;
      ucGridsdtselectionhdrs_empowerer.sendProperty(context, "", false, Gridsdtselectionhdrs_empowerer_Internalname, "GridInternalName", Gridsdtselectionhdrs_empowerer_Gridinternalname);
      subGridsdtselectionhdrs_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Rows, (byte)(6), (byte)(0), ".", "")));
      chkavSdtselectionhdr__selected.setTitleFormat( (short)(1) );
      chkavSdtselectionhdr__selected.setTitle( GXutil.format( "<input name=\"selectAllCheckboxGridSDTSelectionHDRs\" type=\"checkbox\" value=\"Select All\" onClick=\"WWPSelectAll(this, %1);\" onMouseOver=\"WWPSelectAllRemoveParentOnClick(this)\" class=\"AttributeCheckBox\" >", "'SDTSELECTIONHDR__SELECTED'", "", "", "", "", "", "", "", "") );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtselectionhdr__selected.getInternalname(), "Title", chkavSdtselectionhdr__selected.getTitle(), !bGXsfl_39_Refreshing);
      Gridsdtselectionhdrspaginationbar_Rowsperpageselectedvalue = subGridsdtselectionhdrs_Rows ;
      ucGridsdtselectionhdrspaginationbar.sendProperty(context, "", false, Gridsdtselectionhdrspaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridsdtselectionhdrspaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXv_SdtWWPContext5[0] = AV36WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV36WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'LOADDATA' */
      S112 ();
      if (returnInSub) return;
   }

   public void e162CZ2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV8GridSDTSelectionHDRsCurrentPage = subgridsdtselectionhdrs_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8GridSDTSelectionHDRsCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GridSDTSelectionHDRsCurrentPage), 10, 0));
      AV9GridSDTSelectionHDRsPageCount = subgridsdtselectionhdrs_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9GridSDTSelectionHDRsPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9GridSDTSelectionHDRsPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e172CZ2( )
   {
      /* Gridsdtselectionhdrs_Load Routine */
      returnInSub = false ;
      AV52GXV1 = 1 ;
      while ( AV52GXV1 <= AV5SDTSelectionHDR.size() )
      {
         AV5SDTSelectionHDR.currentItem( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(39) ;
         }
         if ( ( subGridsdtselectionhdrs_Islastpage == 1 ) || ( subGridsdtselectionhdrs_Rows == 0 ) || ( ( GRIDSDTSELECTIONHDRS_nCurrentRecord >= GRIDSDTSELECTIONHDRS_nFirstRecordOnPage ) && ( GRIDSDTSELECTIONHDRS_nCurrentRecord < GRIDSDTSELECTIONHDRS_nFirstRecordOnPage + subgridsdtselectionhdrs_fnc_recordsperpage( ) ) ) )
         {
            sendrow_392( ) ;
            GRIDSDTSELECTIONHDRS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTSELECTIONHDRS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSDTSELECTIONHDRS_nCurrentRecord + 1 >= subgridsdtselectionhdrs_fnc_recordcount( ) )
            {
               GRIDSDTSELECTIONHDRS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSDTSELECTIONHDRS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSDTSELECTIONHDRS_nCurrentRecord = (long)(GRIDSDTSELECTIONHDRS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_39_Refreshing )
         {
            httpContext.doAjaxLoad(39, GridsdtselectionhdrsRow);
         }
         AV52GXV1 = (int)(AV52GXV1+1) ;
      }
   }

   public void e112CZ2( )
   {
      /* Gridsdtselectionhdrspaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridsdtselectionhdrspaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgridsdtselectionhdrs_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridsdtselectionhdrspaginationbar_Selectedpage, "Next") == 0 )
      {
         AV7PageToGo = subgridsdtselectionhdrs_fnc_currentpage( ) ;
         AV7PageToGo = (int)(AV7PageToGo+1) ;
         subgridsdtselectionhdrs_gotopage( AV7PageToGo) ;
      }
      else
      {
         AV7PageToGo = (int)(GXutil.lval( Gridsdtselectionhdrspaginationbar_Selectedpage)) ;
         subgridsdtselectionhdrs_gotopage( AV7PageToGo) ;
      }
   }

   public void e122CZ2( )
   {
      /* Gridsdtselectionhdrspaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGridsdtselectionhdrs_Rows = Gridsdtselectionhdrspaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSDTSELECTIONHDRS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Rows, (byte)(6), (byte)(0), ".", "")));
      subgridsdtselectionhdrs_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132CZ2( )
   {
      AV52GXV1 = (int)(nGXsfl_39_idx+GRIDSDTSELECTIONHDRS_nFirstRecordOnPage) ;
      if ( ( AV52GXV1 > 0 ) && ( AV5SDTSelectionHDR.size() >= AV52GXV1 ) )
      {
         AV5SDTSelectionHDR.currentItem( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)) );
      }
      /* 'DoConformeMacro' Routine */
      returnInSub = false ;
      GXt_int6 = AV19Macro ;
      GXv_int7[0] = GXt_int6 ;
      new app.pnumdoc(remoteHandle, context).execute( AV16EmprCod, "444444", GXv_int7) ;
      agrupacionhdr_impl.this.GXt_int6 = GXv_int7[0] ;
      AV19Macro = GXt_int6 ;
      AV30Aviso = httpContext.getMessage( " Nº Macro atribuido = ", "") + GXutil.str( AV19Macro, 6, 0) ;
      AV78GXV26 = 1 ;
      while ( AV78GXV26 <= AV5SDTSelectionHDR.size() )
      {
         AV13SDTSelectionHDR_item = (app.SdtSDTSelectionHDR_Item)((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV78GXV26));
         if ( AV13SDTSelectionHDR_item.getgxTv_SdtSDTSelectionHDR_Item_Selected() )
         {
            GXv_char4[0] = AV13SDTSelectionHDR_item.getgxTv_SdtSDTSelectionHDR_Item_Emprcod() ;
            GXv_int7[0] = AV13SDTSelectionHDR_item.getgxTv_SdtSDTSelectionHDR_Item_Discod() ;
            GXv_int8[0] = AV19Macro ;
            GXv_int9[0] = AV13SDTSelectionHDR_item.getgxTv_SdtSDTSelectionHDR_Item_Barcod() ;
            GXv_int10[0] = AV13SDTSelectionHDR_item.getgxTv_SdtSDTSelectionHDR_Item_Barcodreo() ;
            GXv_char3[0] = AV13SDTSelectionHDR_item.getgxTv_SdtSDTSelectionHDR_Item_Barcodpar() ;
            new app.pgenmace(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int8, GXv_int9, GXv_int10, GXv_char3) ;
            AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Emprcod( GXv_char4[0] );
            AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Discod( GXv_int7[0] );
            agrupacionhdr_impl.this.AV19Macro = GXv_int8[0] ;
            AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Barcod( GXv_int9[0] );
            AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Barcodreo( GXv_int10[0] );
            AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Barcodpar( GXv_char3[0] );
            Application.commitDataStores(context, remoteHandle, pr_default, "agrupacionhdr");
            GXv_char4[0] = AV13SDTSelectionHDR_item.getgxTv_SdtSDTSelectionHDR_Item_Emprcod() ;
            GXv_int9[0] = AV19Macro ;
            new app.pagrmac(remoteHandle, context).execute( GXv_char4, GXv_int9) ;
            AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Emprcod( GXv_char4[0] );
            agrupacionhdr_impl.this.AV19Macro = GXv_int9[0] ;
            httpContext.GX_msglist.addItem(AV30Aviso);
         }
         AV78GXV26 = (int)(AV78GXV26+1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV13SDTSelectionHDR_item", AV13SDTSelectionHDR_item);
   }

   public void e142CZ2( )
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

   public void S112( )
   {
      /* 'LOADDATA' Routine */
      returnInSub = false ;
      AV11json_SDTSeleccionHDR = AV10WebSession.getValue("AgrupacionSDT_001") ;
      if ( AV5SDTSelectionHDR.fromJSonString(AV11json_SDTSeleccionHDR, AV12Messages) )
      {
         AV79GXV27 = 1 ;
         while ( AV79GXV27 <= AV5SDTSelectionHDR.size() )
         {
            AV13SDTSelectionHDR_item = (app.SdtSDTSelectionHDR_Item)((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV79GXV27));
            /* Using cursor H02CZ3 */
            pr_default.execute(0, new Object[] {AV13SDTSelectionHDR_item.getgxTv_SdtSDTSelectionHDR_Item_Emprcod(), Integer.valueOf(AV13SDTSelectionHDR_item.getgxTv_SdtSDTSelectionHDR_Item_Barcod()), Byte.valueOf(AV13SDTSelectionHDR_item.getgxTv_SdtSDTSelectionHDR_Item_Barcodreo()), AV13SDTSelectionHDR_item.getgxTv_SdtSDTSelectionHDR_Item_Barcodpar()});
            while ( (pr_default.getStatus(0) != 101) )
            {
               A130BarCodPar = H02CZ3_A130BarCodPar[0] ;
               A132BarCodReo = H02CZ3_A132BarCodReo[0] ;
               A129BarCod = H02CZ3_A129BarCod[0] ;
               A396EmprCod = H02CZ3_A396EmprCod[0] ;
               A361DisCod = H02CZ3_A361DisCod[0] ;
               A4609BarMdlCod = H02CZ3_A4609BarMdlCod[0] ;
               A143BarDisNum = H02CZ3_A143BarDisNum[0] ;
               A4812BarEncCli = H02CZ3_A4812BarEncCli[0] ;
               A212BarSer = H02CZ3_A212BarSer[0] ;
               A135BarColNom = H02CZ3_A135BarColNom[0] ;
               A136BarColNum = H02CZ3_A136BarColNum[0] ;
               A1234BarNomCli = H02CZ3_A1234BarNomCli[0] ;
               A166BarKgm = H02CZ3_A166BarKgm[0] ;
               A184BarMtr = H02CZ3_A184BarMtr[0] ;
               A166BarKgm = H02CZ3_A166BarKgm[0] ;
               A184BarMtr = H02CZ3_A184BarMtr[0] ;
               AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Discod( A361DisCod );
               AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Barmdlcod( A4609BarMdlCod );
               AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Bardisnum( (!(GXutil.strcmp("", A4812BarEncCli)==0) ? A4812BarEncCli : A143BarDisNum) );
               AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Barser( A212BarSer );
               AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Barcolnom( A135BarColNom );
               AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Barcolnum( A136BarColNum );
               AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Barnomcli( A1234BarNomCli );
               AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Barkgm( A166BarKgm );
               AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Barmtr( A184BarMtr );
               AV13SDTSelectionHDR_item.setgxTv_SdtSDTSelectionHDR_Item_Macrop( (short)(0) );
               /* Exiting from a For First loop. */
               if (true) break;
            }
            pr_default.close(0);
            AV79GXV27 = (int)(AV79GXV27+1) ;
         }
      }
      else
      {
         AV81GXV28 = 1 ;
         while ( AV81GXV28 <= AV12Messages.size() )
         {
            AV14Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV12Messages.elementAt(-1+AV81GXV28));
            httpContext.GX_msglist.addItem(GXutil.format( "%1-%2", AV14Message.getgxTv_SdtMessages_Message_Id(), AV14Message.getgxTv_SdtMessages_Message_Description(), "", "", "", "", "", "", ""));
            AV81GXV28 = (int)(AV81GXV28+1) ;
         }
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
      pa2CZ2( ) ;
      ws2CZ2( ) ;
      we2CZ2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116154556", true, true);
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
      httpContext.AddJavascriptSource("agrupacionhdr.js", "?202682116154556", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_392( )
   {
      chkavSdtselectionhdr__selected.setInternalname( "SDTSELECTIONHDR__SELECTED_"+sGXsfl_39_idx );
      edtavSdtselectionhdr__emprcod_Internalname = "SDTSELECTIONHDR__EMPRCOD_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__macrop_Internalname = "SDTSELECTIONHDR__MACROP_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barcod_Internalname = "SDTSELECTIONHDR__BARCOD_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barnhdr_Internalname = "SDTSELECTIONHDR__BARNHDR_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barcodreo_Internalname = "SDTSELECTIONHDR__BARCODREO_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barcodpar_Internalname = "SDTSELECTIONHDR__BARCODPAR_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__discod_Internalname = "SDTSELECTIONHDR__DISCOD_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barser_Internalname = "SDTSELECTIONHDR__BARSER_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__bardisnum_Internalname = "SDTSELECTIONHDR__BARDISNUM_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barcolnom_Internalname = "SDTSELECTIONHDR__BARCOLNOM_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barcolnum_Internalname = "SDTSELECTIONHDR__BARCOLNUM_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barnomcli_Internalname = "SDTSELECTIONHDR__BARNOMCLI_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barkgm_Internalname = "SDTSELECTIONHDR__BARKGM_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barmtr_Internalname = "SDTSELECTIONHDR__BARMTR_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barpie_Internalname = "SDTSELECTIONHDR__BARPIE_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barunimed_Internalname = "SDTSELECTIONHDR__BARUNIMED_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barsit_Internalname = "SDTSELECTIONHDR__BARSIT_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__kilact_Internalname = "SDTSELECTIONHDR__KILACT_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__mtract_Internalname = "SDTSELECTIONHDR__MTRACT_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barcosany_Internalname = "SDTSELECTIONHDR__BARCOSANY_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barcospro_Internalname = "SDTSELECTIONHDR__BARCOSPRO_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__barpri_Internalname = "SDTSELECTIONHDR__BARPRI_"+sGXsfl_39_idx ;
      edtavSdtselectionhdr__usurcod_Internalname = "SDTSELECTIONHDR__USURCOD_"+sGXsfl_39_idx ;
   }

   public void subsflControlProps_fel_392( )
   {
      chkavSdtselectionhdr__selected.setInternalname( "SDTSELECTIONHDR__SELECTED_"+sGXsfl_39_fel_idx );
      edtavSdtselectionhdr__emprcod_Internalname = "SDTSELECTIONHDR__EMPRCOD_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__macrop_Internalname = "SDTSELECTIONHDR__MACROP_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barcod_Internalname = "SDTSELECTIONHDR__BARCOD_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barnhdr_Internalname = "SDTSELECTIONHDR__BARNHDR_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barcodreo_Internalname = "SDTSELECTIONHDR__BARCODREO_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barcodpar_Internalname = "SDTSELECTIONHDR__BARCODPAR_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__discod_Internalname = "SDTSELECTIONHDR__DISCOD_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barser_Internalname = "SDTSELECTIONHDR__BARSER_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__bardisnum_Internalname = "SDTSELECTIONHDR__BARDISNUM_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barcolnom_Internalname = "SDTSELECTIONHDR__BARCOLNOM_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barcolnum_Internalname = "SDTSELECTIONHDR__BARCOLNUM_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barnomcli_Internalname = "SDTSELECTIONHDR__BARNOMCLI_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barkgm_Internalname = "SDTSELECTIONHDR__BARKGM_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barmtr_Internalname = "SDTSELECTIONHDR__BARMTR_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barpie_Internalname = "SDTSELECTIONHDR__BARPIE_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barunimed_Internalname = "SDTSELECTIONHDR__BARUNIMED_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barsit_Internalname = "SDTSELECTIONHDR__BARSIT_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__kilact_Internalname = "SDTSELECTIONHDR__KILACT_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__mtract_Internalname = "SDTSELECTIONHDR__MTRACT_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barcosany_Internalname = "SDTSELECTIONHDR__BARCOSANY_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barcospro_Internalname = "SDTSELECTIONHDR__BARCOSPRO_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__barpri_Internalname = "SDTSELECTIONHDR__BARPRI_"+sGXsfl_39_fel_idx ;
      edtavSdtselectionhdr__usurcod_Internalname = "SDTSELECTIONHDR__USURCOD_"+sGXsfl_39_fel_idx ;
   }

   public void sendrow_392( )
   {
      subsflControlProps_392( ) ;
      wb2CZ0( ) ;
      if ( ( subGridsdtselectionhdrs_Rows * 1 == 0 ) || ( nGXsfl_39_idx <= subgridsdtselectionhdrs_fnc_recordsperpage( ) * 1 ) )
      {
         GridsdtselectionhdrsRow = GXWebRow.GetNew(context,GridsdtselectionhdrsContainer) ;
         if ( subGridsdtselectionhdrs_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsdtselectionhdrs_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsdtselectionhdrs_Class, "") != 0 )
            {
               subGridsdtselectionhdrs_Linesclass = subGridsdtselectionhdrs_Class+"Odd" ;
            }
         }
         else if ( subGridsdtselectionhdrs_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsdtselectionhdrs_Backstyle = (byte)(0) ;
            subGridsdtselectionhdrs_Backcolor = subGridsdtselectionhdrs_Allbackcolor ;
            if ( GXutil.strcmp(subGridsdtselectionhdrs_Class, "") != 0 )
            {
               subGridsdtselectionhdrs_Linesclass = subGridsdtselectionhdrs_Class+"Uniform" ;
            }
         }
         else if ( subGridsdtselectionhdrs_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsdtselectionhdrs_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsdtselectionhdrs_Class, "") != 0 )
            {
               subGridsdtselectionhdrs_Linesclass = subGridsdtselectionhdrs_Class+"Odd" ;
            }
            subGridsdtselectionhdrs_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsdtselectionhdrs_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsdtselectionhdrs_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_39_idx) % (2))) == 0 )
            {
               subGridsdtselectionhdrs_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtselectionhdrs_Class, "") != 0 )
               {
                  subGridsdtselectionhdrs_Linesclass = subGridsdtselectionhdrs_Class+"Even" ;
               }
            }
            else
            {
               subGridsdtselectionhdrs_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsdtselectionhdrs_Class, "") != 0 )
               {
                  subGridsdtselectionhdrs_Linesclass = subGridsdtselectionhdrs_Class+"Odd" ;
               }
            }
         }
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_39_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSdtselectionhdr__selected.getEnabled()!=0)&&(chkavSdtselectionhdr__selected.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'',false,'"+sGXsfl_39_idx+"',39)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SDTSELECTIONHDR__SELECTED_" + sGXsfl_39_idx ;
         chkavSdtselectionhdr__selected.setName( GXCCtl );
         chkavSdtselectionhdr__selected.setWebtags( "" );
         chkavSdtselectionhdr__selected.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSdtselectionhdr__selected.getInternalname(), "TitleCaption", chkavSdtselectionhdr__selected.getCaption(), !bGXsfl_39_Refreshing);
         chkavSdtselectionhdr__selected.setCheckedValue( "false" );
         GridsdtselectionhdrsRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSdtselectionhdr__selected.getInternalname(),GXutil.booltostr( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Selected()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(40, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSdtselectionhdr__selected.getEnabled()!=0)&&(chkavSdtselectionhdr__selected.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,40);\"" : " ")});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__emprcod_Internalname,GXutil.rtrim( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Emprcod()),GXutil.rtrim( localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Emprcod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtselectionhdr__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__macrop_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Macrop(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__macrop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Macrop()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Macrop()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__macrop_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__macrop_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barnhdr_Internalname,GXutil.rtrim( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barnhdr()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barnhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtselectionhdr__barnhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barcodpar_Internalname,GXutil.rtrim( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcodpar()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__discod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Discod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__discod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Discod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Discod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__discod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__discod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barser_Internalname,GXutil.rtrim( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barser()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__bardisnum_Internalname,GXutil.rtrim( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Bardisnum()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__bardisnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__bardisnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barcolnom_Internalname,GXutil.rtrim( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__barcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__barcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barnomcli_Internalname,GXutil.rtrim( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barnomcli()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__barnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barkgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barkgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__barkgm_Enabled!=0) ? localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barkgm(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barkgm(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__barkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barmtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barmtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__barmtr_Enabled!=0) ? localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barmtr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barmtr(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barmtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__barmtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barpie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barpie(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__barpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barpie()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barpie()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barpie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSdtselectionhdr__barpie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barunimed_Internalname,GXutil.rtrim( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barunimed()),GXutil.rtrim( localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barunimed(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barunimed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtselectionhdr__barunimed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barsit_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barsit(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__barsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barsit()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barsit()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barsit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtselectionhdr__barsit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__kilact_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Kilact(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__kilact_Enabled!=0) ? localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Kilact(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Kilact(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__kilact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtselectionhdr__kilact_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__mtract_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Mtract(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__mtract_Enabled!=0) ? localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Mtract(), "ZZZZZ9.99") : localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Mtract(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__mtract_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtselectionhdr__mtract_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barcosany_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcosany(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__barcosany_Enabled!=0) ? localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcosany(), "ZZZZZZ9.99") : localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcosany(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barcosany_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtselectionhdr__barcosany_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barcospro_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcospro(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSdtselectionhdr__barcospro_Enabled!=0) ? localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcospro(), "ZZZZZZ9.99") : localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barcospro(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barcospro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtselectionhdr__barcospro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__barpri_Internalname,GXutil.rtrim( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barpri()),GXutil.rtrim( localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Barpri(), "9")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__barpri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtselectionhdr__barpri_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridsdtselectionhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtselectionhdr__usurcod_Internalname,GXutil.rtrim( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Usurcod()),GXutil.rtrim( localUtil.format( ((app.SdtSDTSelectionHDR_Item)AV5SDTSelectionHDR.elementAt(-1+AV52GXV1)).getgxTv_SdtSDTSelectionHDR_Item_Usurcod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSdtselectionhdr__usurcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSdtselectionhdr__usurcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(39),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes2CZ2( ) ;
         GridsdtselectionhdrsContainer.AddRow(GridsdtselectionhdrsRow);
         nGXsfl_39_idx = ((subGridsdtselectionhdrs_Islastpage==1)&&(nGXsfl_39_idx+1>subgridsdtselectionhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_39_idx+1) ;
         sGXsfl_39_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_39_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_392( ) ;
      }
      /* End function sendrow_392 */
   }

   public void startgridcontrol39( )
   {
      if ( GridsdtselectionhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridsdtselectionhdrsContainer"+"DivS\" data-gxgridid=\"39\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsdtselectionhdrs_Internalname, subGridsdtselectionhdrs_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsdtselectionhdrs_Backcolorstyle == 0 )
         {
            subGridsdtselectionhdrs_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsdtselectionhdrs_Class) > 0 )
            {
               subGridsdtselectionhdrs_Linesclass = subGridsdtselectionhdrs_Class+"Title" ;
            }
         }
         else
         {
            subGridsdtselectionhdrs_Titlebackstyle = (byte)(1) ;
            if ( subGridsdtselectionhdrs_Backcolorstyle == 1 )
            {
               subGridsdtselectionhdrs_Titlebackcolor = subGridsdtselectionhdrs_Allbackcolor ;
               if ( GXutil.len( subGridsdtselectionhdrs_Class) > 0 )
               {
                  subGridsdtselectionhdrs_Linesclass = subGridsdtselectionhdrs_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsdtselectionhdrs_Class) > 0 )
               {
                  subGridsdtselectionhdrs_Linesclass = subGridsdtselectionhdrs_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         if ( chkavSdtselectionhdr__selected.getTitleFormat() == 0 )
         {
            httpContext.writeValue( chkavSdtselectionhdr__selected.getTitle()) ;
         }
         else
         {
            httpContext.writeText( chkavSdtselectionhdr__selected.getTitle()) ;
         }
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Macro", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "OS", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Enc. Int.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Artigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Enc. Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cor Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kgs", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mts", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad de la HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Situacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kil Act", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Mtr Act", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Añadidas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Produccion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Prioridad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cod. Usuário", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridsdtselectionhdrsContainer.AddObjectProperty("GridName", "Gridsdtselectionhdrs");
      }
      else
      {
         GridsdtselectionhdrsContainer.AddObjectProperty("GridName", "Gridsdtselectionhdrs");
         GridsdtselectionhdrsContainer.AddObjectProperty("Header", subGridsdtselectionhdrs_Header);
         GridsdtselectionhdrsContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridsdtselectionhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddObjectProperty("CmpContext", "");
         GridsdtselectionhdrsContainer.AddObjectProperty("InMasterPage", "false");
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Title", GXutil.rtrim( chkavSdtselectionhdr__selected.getTitle()));
         GridsdtselectionhdrsColumn.AddObjectProperty("Titleformat", GXutil.ltrim( localUtil.ntoc( chkavSdtselectionhdr__selected.getTitleFormat(), (byte)(4), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__macrop_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barnhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__discod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__bardisnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barmtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barpie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barsit_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__kilact_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__mtract_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barcosany_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barcospro_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__barpri_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridsdtselectionhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtselectionhdr__usurcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddColumnProperties(GridsdtselectionhdrsColumn);
         GridsdtselectionhdrsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridsdtselectionhdrsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsdtselectionhdrs_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      bttBtnconformemacro_Internalname = "BTNCONFORMEMACRO" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      chkavSdtselectionhdr__selected.setInternalname( "SDTSELECTIONHDR__SELECTED" );
      edtavSdtselectionhdr__emprcod_Internalname = "SDTSELECTIONHDR__EMPRCOD" ;
      edtavSdtselectionhdr__macrop_Internalname = "SDTSELECTIONHDR__MACROP" ;
      edtavSdtselectionhdr__barcod_Internalname = "SDTSELECTIONHDR__BARCOD" ;
      edtavSdtselectionhdr__barnhdr_Internalname = "SDTSELECTIONHDR__BARNHDR" ;
      edtavSdtselectionhdr__barcodreo_Internalname = "SDTSELECTIONHDR__BARCODREO" ;
      edtavSdtselectionhdr__barcodpar_Internalname = "SDTSELECTIONHDR__BARCODPAR" ;
      edtavSdtselectionhdr__discod_Internalname = "SDTSELECTIONHDR__DISCOD" ;
      edtavSdtselectionhdr__barser_Internalname = "SDTSELECTIONHDR__BARSER" ;
      edtavSdtselectionhdr__bardisnum_Internalname = "SDTSELECTIONHDR__BARDISNUM" ;
      edtavSdtselectionhdr__barcolnom_Internalname = "SDTSELECTIONHDR__BARCOLNOM" ;
      edtavSdtselectionhdr__barcolnum_Internalname = "SDTSELECTIONHDR__BARCOLNUM" ;
      edtavSdtselectionhdr__barnomcli_Internalname = "SDTSELECTIONHDR__BARNOMCLI" ;
      edtavSdtselectionhdr__barkgm_Internalname = "SDTSELECTIONHDR__BARKGM" ;
      edtavSdtselectionhdr__barmtr_Internalname = "SDTSELECTIONHDR__BARMTR" ;
      edtavSdtselectionhdr__barpie_Internalname = "SDTSELECTIONHDR__BARPIE" ;
      edtavSdtselectionhdr__barunimed_Internalname = "SDTSELECTIONHDR__BARUNIMED" ;
      edtavSdtselectionhdr__barsit_Internalname = "SDTSELECTIONHDR__BARSIT" ;
      edtavSdtselectionhdr__kilact_Internalname = "SDTSELECTIONHDR__KILACT" ;
      edtavSdtselectionhdr__mtract_Internalname = "SDTSELECTIONHDR__MTRACT" ;
      edtavSdtselectionhdr__barcosany_Internalname = "SDTSELECTIONHDR__BARCOSANY" ;
      edtavSdtselectionhdr__barcospro_Internalname = "SDTSELECTIONHDR__BARCOSPRO" ;
      edtavSdtselectionhdr__barpri_Internalname = "SDTSELECTIONHDR__BARPRI" ;
      edtavSdtselectionhdr__usurcod_Internalname = "SDTSELECTIONHDR__USURCOD" ;
      Gridsdtselectionhdrspaginationbar_Internalname = "GRIDSDTSELECTIONHDRSPAGINATIONBAR" ;
      divGridsdtselectionhdrstablewithpaginationbar_Internalname = "GRIDSDTSELECTIONHDRSTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divPanel_resultado_Internalname = "PANEL_RESULTADO" ;
      Dvpanel_panel_resultado_Internalname = "DVPANEL_PANEL_RESULTADO" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Gridsdtselectionhdrs_empowerer_Internalname = "GRIDSDTSELECTIONHDRS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridsdtselectionhdrs_Internalname = "GRIDSDTSELECTIONHDRS" ;
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
      subGridsdtselectionhdrs_Allowcollapsing = (byte)(0) ;
      subGridsdtselectionhdrs_Allowselection = (byte)(0) ;
      subGridsdtselectionhdrs_Header = "" ;
      chkavSdtselectionhdr__selected.setTitleFormat( (short)(0) );
      chkavSdtselectionhdr__selected.setTitle( httpContext.getMessage( "Selected", "") );
      edtavSdtselectionhdr__usurcod_Jsonclick = "" ;
      edtavSdtselectionhdr__usurcod_Enabled = 0 ;
      edtavSdtselectionhdr__barpri_Jsonclick = "" ;
      edtavSdtselectionhdr__barpri_Enabled = 0 ;
      edtavSdtselectionhdr__barcospro_Jsonclick = "" ;
      edtavSdtselectionhdr__barcospro_Enabled = 0 ;
      edtavSdtselectionhdr__barcosany_Jsonclick = "" ;
      edtavSdtselectionhdr__barcosany_Enabled = 0 ;
      edtavSdtselectionhdr__mtract_Jsonclick = "" ;
      edtavSdtselectionhdr__mtract_Enabled = 0 ;
      edtavSdtselectionhdr__kilact_Jsonclick = "" ;
      edtavSdtselectionhdr__kilact_Enabled = 0 ;
      edtavSdtselectionhdr__barsit_Jsonclick = "" ;
      edtavSdtselectionhdr__barsit_Enabled = 0 ;
      edtavSdtselectionhdr__barunimed_Jsonclick = "" ;
      edtavSdtselectionhdr__barunimed_Enabled = 0 ;
      edtavSdtselectionhdr__barpie_Jsonclick = "" ;
      edtavSdtselectionhdr__barpie_Enabled = 0 ;
      edtavSdtselectionhdr__barmtr_Jsonclick = "" ;
      edtavSdtselectionhdr__barmtr_Enabled = 0 ;
      edtavSdtselectionhdr__barkgm_Jsonclick = "" ;
      edtavSdtselectionhdr__barkgm_Enabled = 0 ;
      edtavSdtselectionhdr__barnomcli_Jsonclick = "" ;
      edtavSdtselectionhdr__barnomcli_Enabled = 0 ;
      edtavSdtselectionhdr__barcolnum_Jsonclick = "" ;
      edtavSdtselectionhdr__barcolnum_Enabled = 0 ;
      edtavSdtselectionhdr__barcolnom_Jsonclick = "" ;
      edtavSdtselectionhdr__barcolnom_Enabled = 0 ;
      edtavSdtselectionhdr__bardisnum_Jsonclick = "" ;
      edtavSdtselectionhdr__bardisnum_Enabled = 0 ;
      edtavSdtselectionhdr__barser_Jsonclick = "" ;
      edtavSdtselectionhdr__barser_Enabled = 0 ;
      edtavSdtselectionhdr__discod_Jsonclick = "" ;
      edtavSdtselectionhdr__discod_Enabled = 0 ;
      edtavSdtselectionhdr__barcodpar_Jsonclick = "" ;
      edtavSdtselectionhdr__barcodpar_Enabled = 0 ;
      edtavSdtselectionhdr__barcodreo_Jsonclick = "" ;
      edtavSdtselectionhdr__barcodreo_Enabled = 0 ;
      edtavSdtselectionhdr__barnhdr_Jsonclick = "" ;
      edtavSdtselectionhdr__barnhdr_Enabled = 0 ;
      edtavSdtselectionhdr__barcod_Jsonclick = "" ;
      edtavSdtselectionhdr__barcod_Enabled = 0 ;
      edtavSdtselectionhdr__macrop_Jsonclick = "" ;
      edtavSdtselectionhdr__macrop_Enabled = 0 ;
      edtavSdtselectionhdr__emprcod_Jsonclick = "" ;
      edtavSdtselectionhdr__emprcod_Enabled = 0 ;
      chkavSdtselectionhdr__selected.setCaption( "" );
      chkavSdtselectionhdr__selected.setVisible( -1 );
      chkavSdtselectionhdr__selected.setEnabled( 1 );
      subGridsdtselectionhdrs_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGridsdtselectionhdrs_Backcolorstyle = (byte)(0) ;
      chkavSdtselectionhdr__selected.setTitle( httpContext.getMessage( "Selected", "") );
      edtavSdtselectionhdr__usurcod_Enabled = -1 ;
      edtavSdtselectionhdr__barpri_Enabled = -1 ;
      edtavSdtselectionhdr__barcospro_Enabled = -1 ;
      edtavSdtselectionhdr__barcosany_Enabled = -1 ;
      edtavSdtselectionhdr__mtract_Enabled = -1 ;
      edtavSdtselectionhdr__kilact_Enabled = -1 ;
      edtavSdtselectionhdr__barsit_Enabled = -1 ;
      edtavSdtselectionhdr__barunimed_Enabled = -1 ;
      edtavSdtselectionhdr__barpie_Enabled = -1 ;
      edtavSdtselectionhdr__barmtr_Enabled = -1 ;
      edtavSdtselectionhdr__barkgm_Enabled = -1 ;
      edtavSdtselectionhdr__barnomcli_Enabled = -1 ;
      edtavSdtselectionhdr__barcolnum_Enabled = -1 ;
      edtavSdtselectionhdr__barcolnom_Enabled = -1 ;
      edtavSdtselectionhdr__bardisnum_Enabled = -1 ;
      edtavSdtselectionhdr__barser_Enabled = -1 ;
      edtavSdtselectionhdr__discod_Enabled = -1 ;
      edtavSdtselectionhdr__barcodpar_Enabled = -1 ;
      edtavSdtselectionhdr__barcodreo_Enabled = -1 ;
      edtavSdtselectionhdr__barnhdr_Enabled = -1 ;
      edtavSdtselectionhdr__barcod_Enabled = -1 ;
      edtavSdtselectionhdr__macrop_Enabled = -1 ;
      edtavSdtselectionhdr__emprcod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Dvpanel_panel_resultado_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Iconposition = "Right" ;
      Dvpanel_panel_resultado_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Collapsible = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Title = httpContext.getMessage( "<i class=\"fas fa-poll-h\"></i>  Resultados", "") ;
      Dvpanel_panel_resultado_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_panel_resultado_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panel_resultado_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_panel_resultado_Width = "100%" ;
      Gridsdtselectionhdrspaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridsdtselectionhdrspaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridsdtselectionhdrspaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridsdtselectionhdrspaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridsdtselectionhdrspaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridsdtselectionhdrspaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridsdtselectionhdrspaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridsdtselectionhdrspaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridsdtselectionhdrspaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridsdtselectionhdrspaginationbar_Pagingcaptionposition = "Left" ;
      Gridsdtselectionhdrspaginationbar_Pagingbuttonsposition = "Right" ;
      Gridsdtselectionhdrspaginationbar_Pagestoshow = 5 ;
      Gridsdtselectionhdrspaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridsdtselectionhdrspaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridsdtselectionhdrspaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridsdtselectionhdrspaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridsdtselectionhdrspaginationbar_Class = "PaginationBar" ;
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
      Form.setCaption( httpContext.getMessage( "Agrupacion HDR", "") );
      subGridsdtselectionhdrs_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "SDTSELECTIONHDR__SELECTED_" + sGXsfl_39_idx ;
      chkavSdtselectionhdr__selected.setName( GXCCtl );
      chkavSdtselectionhdr__selected.setWebtags( "" );
      chkavSdtselectionhdr__selected.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSdtselectionhdr__selected.getInternalname(), "TitleCaption", chkavSdtselectionhdr__selected.getCaption(), !bGXsfl_39_Refreshing);
      chkavSdtselectionhdr__selected.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSDTSELECTIONHDRS_nFirstRecordOnPage'},{av:'GRIDSDTSELECTIONHDRS_nEOF'},{av:'subGridsdtselectionhdrs_Rows',ctrl:'GRIDSDTSELECTIONHDRS',prop:'Rows'},{av:'AV5SDTSelectionHDR',fld:'vSDTSELECTIONHDR',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRIDSDTSELECTIONHDRS',prop:'GridRC',grid:39},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV8GridSDTSelectionHDRsCurrentPage',fld:'vGRIDSDTSELECTIONHDRSCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV9GridSDTSelectionHDRsPageCount',fld:'vGRIDSDTSELECTIONHDRSPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDSDTSELECTIONHDRS.LOAD","{handler:'e172CZ2',iparms:[]");
      setEventMetadata("GRIDSDTSELECTIONHDRS.LOAD",",oparms:[]}");
      setEventMetadata("GRIDSDTSELECTIONHDRSPAGINATIONBAR.CHANGEPAGE","{handler:'e112CZ2',iparms:[{av:'GRIDSDTSELECTIONHDRS_nFirstRecordOnPage'},{av:'GRIDSDTSELECTIONHDRS_nEOF'},{av:'subGridsdtselectionhdrs_Rows',ctrl:'GRIDSDTSELECTIONHDRS',prop:'Rows'},{av:'AV5SDTSelectionHDR',fld:'vSDTSELECTIONHDR',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRIDSDTSELECTIONHDRS',prop:'GridRC',grid:39},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridsdtselectionhdrspaginationbar_Selectedpage',ctrl:'GRIDSDTSELECTIONHDRSPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDSDTSELECTIONHDRSPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDSDTSELECTIONHDRSPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122CZ2',iparms:[{av:'GRIDSDTSELECTIONHDRS_nFirstRecordOnPage'},{av:'GRIDSDTSELECTIONHDRS_nEOF'},{av:'subGridsdtselectionhdrs_Rows',ctrl:'GRIDSDTSELECTIONHDRS',prop:'Rows'},{av:'AV5SDTSelectionHDR',fld:'vSDTSELECTIONHDR',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'nRC_GXsfl_39',ctrl:'GRIDSDTSELECTIONHDRS',prop:'GridRC',grid:39},{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'Gridsdtselectionhdrspaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDSDTSELECTIONHDRSPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDSDTSELECTIONHDRSPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGridsdtselectionhdrs_Rows',ctrl:'GRIDSDTSELECTIONHDRS',prop:'Rows'}]}");
      setEventMetadata("'DOCONFORMEMACRO'","{handler:'e132CZ2',iparms:[{av:'AV16EmprCod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV5SDTSelectionHDR',fld:'vSDTSELECTIONHDR',grid:39,pic:'',hsh:true},{av:'nGXsfl_39_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:39},{av:'GRIDSDTSELECTIONHDRS_nFirstRecordOnPage'},{av:'nRC_GXsfl_39',ctrl:'GRIDSDTSELECTIONHDRS',prop:'GridRC',grid:39}]");
      setEventMetadata("'DOCONFORMEMACRO'",",oparms:[{av:'AV13SDTSelectionHDR_item',fld:'vSDTSELECTIONHDR_ITEM',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e142CZ2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VALIDV_GXV18","{handler:'validv_Gxv18',iparms:[]");
      setEventMetadata("VALIDV_GXV18",",oparms:[]}");
      setEventMetadata("VALIDV_GXV24","{handler:'validv_Gxv24',iparms:[]");
      setEventMetadata("VALIDV_GXV24",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv25',iparms:[]");
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
      Gridsdtselectionhdrspaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5SDTSelectionHDR = new GXBaseCollection<app.SdtSDTSelectionHDR_Item>(app.SdtSDTSelectionHDR_Item.class, "Item", "TexplusNET", remoteHandle);
      AV16EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      Gridsdtselectionhdrs_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnconformemacro_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_panel_resultado = new com.genexus.webpanels.GXUserControl();
      GridsdtselectionhdrsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridsdtselectionhdrspaginationbar = new com.genexus.webpanels.GXUserControl();
      AV77Pgmname = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGridsdtselectionhdrs_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV15Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV17EmprNom = "" ;
      AV18UsurCod = "" ;
      AV36WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridsdtselectionhdrsRow = new com.genexus.webpanels.GXWebRow();
      AV30Aviso = "" ;
      AV13SDTSelectionHDR_item = new app.SdtSDTSelectionHDR_Item(remoteHandle, context);
      GXv_int7 = new int[1] ;
      GXv_int8 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int9 = new int[1] ;
      AV11json_SDTSeleccionHDR = "" ;
      AV10WebSession = httpContext.getWebSession();
      AV12Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      scmdbuf = "" ;
      H02CZ3_A130BarCodPar = new String[] {""} ;
      H02CZ3_A132BarCodReo = new byte[1] ;
      H02CZ3_A129BarCod = new int[1] ;
      H02CZ3_A396EmprCod = new String[] {""} ;
      H02CZ3_A361DisCod = new int[1] ;
      H02CZ3_A4609BarMdlCod = new String[] {""} ;
      H02CZ3_A143BarDisNum = new String[] {""} ;
      H02CZ3_A4812BarEncCli = new String[] {""} ;
      H02CZ3_A212BarSer = new String[] {""} ;
      H02CZ3_A135BarColNom = new String[] {""} ;
      H02CZ3_A136BarColNum = new int[1] ;
      H02CZ3_A1234BarNomCli = new String[] {""} ;
      H02CZ3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02CZ3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      A130BarCodPar = "" ;
      A396EmprCod = "" ;
      A4609BarMdlCod = "" ;
      A143BarDisNum = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      AV14Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridsdtselectionhdrs_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridsdtselectionhdrsColumn = new com.genexus.webpanels.GXWebColumn();
      pr_moda21 = new DataStoreProvider(context, remoteHandle, new app.agrupacionhdr__moda21(),
         new Object[] {
         }
      );
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.agrupacionhdr__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.agrupacionhdr__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.agrupacionhdr__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.agrupacionhdr__default(),
         new Object[] {
             new Object[] {
            H02CZ3_A130BarCodPar, H02CZ3_A132BarCodReo, H02CZ3_A129BarCod, H02CZ3_A396EmprCod, H02CZ3_A361DisCod, H02CZ3_A4609BarMdlCod, H02CZ3_A143BarDisNum, H02CZ3_A4812BarEncCli, H02CZ3_A212BarSer, H02CZ3_A135BarColNom,
            H02CZ3_A136BarColNum, H02CZ3_A1234BarNomCli, H02CZ3_A166BarKgm, H02CZ3_A184BarMtr
            }
         }
      );
      AV77Pgmname = "AgrupacionHDR" ;
      /* GeneXus formulas. */
      AV77Pgmname = "AgrupacionHDR" ;
      Gx_err = (short)(0) ;
      edtavSdtselectionhdr__emprcod_Enabled = 0 ;
      edtavSdtselectionhdr__macrop_Enabled = 0 ;
      edtavSdtselectionhdr__barcod_Enabled = 0 ;
      edtavSdtselectionhdr__barnhdr_Enabled = 0 ;
      edtavSdtselectionhdr__barcodreo_Enabled = 0 ;
      edtavSdtselectionhdr__barcodpar_Enabled = 0 ;
      edtavSdtselectionhdr__discod_Enabled = 0 ;
      edtavSdtselectionhdr__barser_Enabled = 0 ;
      edtavSdtselectionhdr__bardisnum_Enabled = 0 ;
      edtavSdtselectionhdr__barcolnom_Enabled = 0 ;
      edtavSdtselectionhdr__barcolnum_Enabled = 0 ;
      edtavSdtselectionhdr__barnomcli_Enabled = 0 ;
      edtavSdtselectionhdr__barkgm_Enabled = 0 ;
      edtavSdtselectionhdr__barmtr_Enabled = 0 ;
      edtavSdtselectionhdr__barpie_Enabled = 0 ;
      edtavSdtselectionhdr__barunimed_Enabled = 0 ;
      edtavSdtselectionhdr__barsit_Enabled = 0 ;
      edtavSdtselectionhdr__kilact_Enabled = 0 ;
      edtavSdtselectionhdr__mtract_Enabled = 0 ;
      edtavSdtselectionhdr__barcosany_Enabled = 0 ;
      edtavSdtselectionhdr__barcospro_Enabled = 0 ;
      edtavSdtselectionhdr__barpri_Enabled = 0 ;
      edtavSdtselectionhdr__usurcod_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRIDSDTSELECTIONHDRS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGridsdtselectionhdrs_Backcolorstyle ;
   private byte GXv_int10[] ;
   private byte A132BarCodReo ;
   private byte nGXWrapped ;
   private byte subGridsdtselectionhdrs_Backstyle ;
   private byte subGridsdtselectionhdrs_Titlebackstyle ;
   private byte subGridsdtselectionhdrs_Allowselection ;
   private byte subGridsdtselectionhdrs_Allowhovering ;
   private byte subGridsdtselectionhdrs_Allowcollapsing ;
   private byte subGridsdtselectionhdrs_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int Gridsdtselectionhdrspaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_39 ;
   private int subGridsdtselectionhdrs_Rows ;
   private int nGXsfl_39_idx=1 ;
   private int Gridsdtselectionhdrspaginationbar_Pagestoshow ;
   private int AV52GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGridsdtselectionhdrs_Islastpage ;
   private int edtavSdtselectionhdr__emprcod_Enabled ;
   private int edtavSdtselectionhdr__macrop_Enabled ;
   private int edtavSdtselectionhdr__barcod_Enabled ;
   private int edtavSdtselectionhdr__barnhdr_Enabled ;
   private int edtavSdtselectionhdr__barcodreo_Enabled ;
   private int edtavSdtselectionhdr__barcodpar_Enabled ;
   private int edtavSdtselectionhdr__discod_Enabled ;
   private int edtavSdtselectionhdr__barser_Enabled ;
   private int edtavSdtselectionhdr__bardisnum_Enabled ;
   private int edtavSdtselectionhdr__barcolnom_Enabled ;
   private int edtavSdtselectionhdr__barcolnum_Enabled ;
   private int edtavSdtselectionhdr__barnomcli_Enabled ;
   private int edtavSdtselectionhdr__barkgm_Enabled ;
   private int edtavSdtselectionhdr__barmtr_Enabled ;
   private int edtavSdtselectionhdr__barpie_Enabled ;
   private int edtavSdtselectionhdr__barunimed_Enabled ;
   private int edtavSdtselectionhdr__barsit_Enabled ;
   private int edtavSdtselectionhdr__kilact_Enabled ;
   private int edtavSdtselectionhdr__mtract_Enabled ;
   private int edtavSdtselectionhdr__barcosany_Enabled ;
   private int edtavSdtselectionhdr__barcospro_Enabled ;
   private int edtavSdtselectionhdr__barpri_Enabled ;
   private int edtavSdtselectionhdr__usurcod_Enabled ;
   private int GRIDSDTSELECTIONHDRS_nGridOutOfScope ;
   private int nGXsfl_39_fel_idx=1 ;
   private int AV7PageToGo ;
   private int AV19Macro ;
   private int GXt_int6 ;
   private int AV78GXV26 ;
   private int GXv_int7[] ;
   private int GXv_int8[] ;
   private int GXv_int9[] ;
   private int AV79GXV27 ;
   private int A129BarCod ;
   private int A361DisCod ;
   private int A136BarColNum ;
   private int AV81GXV28 ;
   private int idxLst ;
   private int subGridsdtselectionhdrs_Backcolor ;
   private int subGridsdtselectionhdrs_Allbackcolor ;
   private int subGridsdtselectionhdrs_Titlebackcolor ;
   private int subGridsdtselectionhdrs_Selectedindex ;
   private int subGridsdtselectionhdrs_Selectioncolor ;
   private int subGridsdtselectionhdrs_Hoveringcolor ;
   private long GRIDSDTSELECTIONHDRS_nFirstRecordOnPage ;
   private long AV8GridSDTSelectionHDRsCurrentPage ;
   private long AV9GridSDTSelectionHDRsPageCount ;
   private long GRIDSDTSELECTIONHDRS_nCurrentRecord ;
   private long GRIDSDTSELECTIONHDRS_nRecordCount ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private String Gridsdtselectionhdrspaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_39_idx="0001" ;
   private String AV16EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Gridsdtselectionhdrspaginationbar_Class ;
   private String Gridsdtselectionhdrspaginationbar_Pagingbuttonsposition ;
   private String Gridsdtselectionhdrspaginationbar_Pagingcaptionposition ;
   private String Gridsdtselectionhdrspaginationbar_Emptygridclass ;
   private String Gridsdtselectionhdrspaginationbar_Rowsperpageoptions ;
   private String Gridsdtselectionhdrspaginationbar_Previous ;
   private String Gridsdtselectionhdrspaginationbar_Next ;
   private String Gridsdtselectionhdrspaginationbar_Caption ;
   private String Gridsdtselectionhdrspaginationbar_Emptygridcaption ;
   private String Gridsdtselectionhdrspaginationbar_Rowsperpagecaption ;
   private String Dvpanel_panel_resultado_Width ;
   private String Dvpanel_panel_resultado_Cls ;
   private String Dvpanel_panel_resultado_Title ;
   private String Dvpanel_panel_resultado_Iconposition ;
   private String Gridsdtselectionhdrs_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String bttBtnconformemacro_Internalname ;
   private String bttBtnconformemacro_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_panel_resultado_Internalname ;
   private String divPanel_resultado_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divGridsdtselectionhdrstablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGridsdtselectionhdrs_Internalname ;
   private String Gridsdtselectionhdrspaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String AV77Pgmname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridsdtselectionhdrs_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavSdtselectionhdr__emprcod_Internalname ;
   private String edtavSdtselectionhdr__macrop_Internalname ;
   private String edtavSdtselectionhdr__barcod_Internalname ;
   private String edtavSdtselectionhdr__barnhdr_Internalname ;
   private String edtavSdtselectionhdr__barcodreo_Internalname ;
   private String edtavSdtselectionhdr__barcodpar_Internalname ;
   private String edtavSdtselectionhdr__discod_Internalname ;
   private String edtavSdtselectionhdr__barser_Internalname ;
   private String edtavSdtselectionhdr__bardisnum_Internalname ;
   private String edtavSdtselectionhdr__barcolnom_Internalname ;
   private String edtavSdtselectionhdr__barcolnum_Internalname ;
   private String edtavSdtselectionhdr__barnomcli_Internalname ;
   private String edtavSdtselectionhdr__barkgm_Internalname ;
   private String edtavSdtselectionhdr__barmtr_Internalname ;
   private String edtavSdtselectionhdr__barpie_Internalname ;
   private String edtavSdtselectionhdr__barunimed_Internalname ;
   private String edtavSdtselectionhdr__barsit_Internalname ;
   private String edtavSdtselectionhdr__kilact_Internalname ;
   private String edtavSdtselectionhdr__mtract_Internalname ;
   private String edtavSdtselectionhdr__barcosany_Internalname ;
   private String edtavSdtselectionhdr__barcospro_Internalname ;
   private String edtavSdtselectionhdr__barpri_Internalname ;
   private String edtavSdtselectionhdr__usurcod_Internalname ;
   private String sGXsfl_39_fel_idx="0001" ;
   private String AV15Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV17EmprNom ;
   private String AV18UsurCod ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String A130BarCodPar ;
   private String A396EmprCod ;
   private String A4609BarMdlCod ;
   private String A143BarDisNum ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String subGridsdtselectionhdrs_Class ;
   private String subGridsdtselectionhdrs_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavSdtselectionhdr__emprcod_Jsonclick ;
   private String edtavSdtselectionhdr__macrop_Jsonclick ;
   private String edtavSdtselectionhdr__barcod_Jsonclick ;
   private String edtavSdtselectionhdr__barnhdr_Jsonclick ;
   private String edtavSdtselectionhdr__barcodreo_Jsonclick ;
   private String edtavSdtselectionhdr__barcodpar_Jsonclick ;
   private String edtavSdtselectionhdr__discod_Jsonclick ;
   private String edtavSdtselectionhdr__barser_Jsonclick ;
   private String edtavSdtselectionhdr__bardisnum_Jsonclick ;
   private String edtavSdtselectionhdr__barcolnom_Jsonclick ;
   private String edtavSdtselectionhdr__barcolnum_Jsonclick ;
   private String edtavSdtselectionhdr__barnomcli_Jsonclick ;
   private String edtavSdtselectionhdr__barkgm_Jsonclick ;
   private String edtavSdtselectionhdr__barmtr_Jsonclick ;
   private String edtavSdtselectionhdr__barpie_Jsonclick ;
   private String edtavSdtselectionhdr__barunimed_Jsonclick ;
   private String edtavSdtselectionhdr__barsit_Jsonclick ;
   private String edtavSdtselectionhdr__kilact_Jsonclick ;
   private String edtavSdtselectionhdr__mtract_Jsonclick ;
   private String edtavSdtselectionhdr__barcosany_Jsonclick ;
   private String edtavSdtselectionhdr__barcospro_Jsonclick ;
   private String edtavSdtselectionhdr__barpri_Jsonclick ;
   private String edtavSdtselectionhdr__usurcod_Jsonclick ;
   private String subGridsdtselectionhdrs_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridsdtselectionhdrspaginationbar_Showfirst ;
   private boolean Gridsdtselectionhdrspaginationbar_Showprevious ;
   private boolean Gridsdtselectionhdrspaginationbar_Shownext ;
   private boolean Gridsdtselectionhdrspaginationbar_Showlast ;
   private boolean Gridsdtselectionhdrspaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_panel_resultado_Autowidth ;
   private boolean Dvpanel_panel_resultado_Autoheight ;
   private boolean Dvpanel_panel_resultado_Collapsible ;
   private boolean Dvpanel_panel_resultado_Collapsed ;
   private boolean Dvpanel_panel_resultado_Showcollapseicon ;
   private boolean Dvpanel_panel_resultado_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_39_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV11json_SDTSeleccionHDR ;
   private String AV30Aviso ;
   private com.genexus.webpanels.GXWebGrid GridsdtselectionhdrsContainer ;
   private com.genexus.webpanels.GXWebRow GridsdtselectionhdrsRow ;
   private com.genexus.webpanels.GXWebColumn GridsdtselectionhdrsColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV10WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panel_resultado ;
   private com.genexus.webpanels.GXUserControl ucGridsdtselectionhdrspaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGridsdtselectionhdrs_empowerer ;
   private ICheckbox chkavSdtselectionhdr__selected ;
   private IDataStoreProvider pr_default ;
   private String[] H02CZ3_A130BarCodPar ;
   private byte[] H02CZ3_A132BarCodReo ;
   private int[] H02CZ3_A129BarCod ;
   private String[] H02CZ3_A396EmprCod ;
   private int[] H02CZ3_A361DisCod ;
   private String[] H02CZ3_A4609BarMdlCod ;
   private String[] H02CZ3_A143BarDisNum ;
   private String[] H02CZ3_A4812BarEncCli ;
   private String[] H02CZ3_A212BarSer ;
   private String[] H02CZ3_A135BarColNom ;
   private int[] H02CZ3_A136BarColNum ;
   private String[] H02CZ3_A1234BarNomCli ;
   private java.math.BigDecimal[] H02CZ3_A166BarKgm ;
   private java.math.BigDecimal[] H02CZ3_A184BarMtr ;
   private IDataStoreProvider pr_moda21 ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtSDTSelectionHDR_Item> AV5SDTSelectionHDR ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12Messages ;
   private com.genexus.SdtMessages_Message AV14Message ;
   private app.SdtSDTSelectionHDR_Item AV13SDTSelectionHDR_item ;
   private app.wwpbaseobjects.SdtWWPContext AV36WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

final  class agrupacionhdr__moda21 extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "MODA21";
   }

}

final  class agrupacionhdr__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class agrupacionhdr__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class agrupacionhdr__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class agrupacionhdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02CZ3", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.DisCod, T1.BarMdlCod, T1.BarDisNum, T1.BarEncCli, T1.BarSer, T1.BarColNom, T1.BarColNum, T1.BarNomCli, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T2.BarMtr, 0) AS BarMtr FROM (TXPBARCAD T1 LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 13);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((String[]) buf[7])[0] = rslt.getString(8, 20);
               ((String[]) buf[8])[0] = rslt.getString(9, 16);
               ((String[]) buf[9])[0] = rslt.getString(10, 13);
               ((int[]) buf[10])[0] = rslt.getInt(11);
               ((String[]) buf[11])[0] = rslt.getString(12, 13);
               ((java.math.BigDecimal[]) buf[12])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[13])[0] = rslt.getBigDecimal(14,2);
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

