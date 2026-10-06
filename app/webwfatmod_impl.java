package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwfatmod_impl extends GXDataArea
{
   public webwfatmod_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwfatmod_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwfatmod_impl.class ));
   }

   public webwfatmod_impl( int remoteHandle ,
                           ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavFacest = new HTMLChoice();
      cmbavPrio = new HTMLChoice();
      cmbavF_header = new HTMLChoice();
      cmbavAgr_fases = new HTMLChoice();
      chkavVersumlin = UIFactory.getCheckbox(this);
      chkavMail = UIFactory.getCheckbox(this);
      chkavOpi = UIFactory.getCheckbox(this);
      chkavOp = UIFactory.getCheckbox(this);
      cmbFacEst = new HTMLChoice();
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
      nRC_GXsfl_73 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_73"))) ;
      nGXsfl_73_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_73_idx"))) ;
      sGXsfl_73_idx = httpContext.GetPar( "sGXsfl_73_idx") ;
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
      AV81PCLI = (int)(GXutil.lval( httpContext.GetPar( "PCLI"))) ;
      AV94UCLI = (int)(GXutil.lval( httpContext.GetPar( "UCLI"))) ;
      AV77PAlbFch = localUtil.parseDateParm( httpContext.GetPar( "PAlbFch")) ;
      AV93UAlbFch = localUtil.parseDateParm( httpContext.GetPar( "UAlbFch")) ;
      cmbavFacest.fromJSonString( httpContext.GetNextPar( ));
      AV31FacEst = (byte)(GXutil.lval( httpContext.GetPar( "FacEst"))) ;
      cmbavPrio.fromJSonString( httpContext.GetNextPar( ));
      AV83PRIO = httpContext.GetPar( "PRIO") ;
      AV91UALB = (int)(GXutil.lval( httpContext.GetPar( "UALB"))) ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV101VerSumLin = (byte)(GXutil.lval( httpContext.GetPar( "VerSumLin"))) ;
      AV65Mail = httpContext.GetPar( "Mail") ;
      AV74Opi = httpContext.GetPar( "Opi") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid1_refresh( subGrid1_Rows, AV81PCLI, AV94UCLI, AV77PAlbFch, AV93UAlbFch, AV31FacEst, AV83PRIO, AV91UALB, A396EmprCod, AV101VerSumLin, AV65Mail, AV74Opi) ;
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
      paBB2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startBB2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
      FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwfatmod", new String[] {}, new String[] {}) +"\">") ;
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
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vPCLI", GXutil.ltrim( localUtil.ntoc( AV81PCLI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vUCLI", GXutil.ltrim( localUtil.ntoc( AV94UCLI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vPALBFCH", localUtil.format(AV77PAlbFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vUALBFCH", localUtil.format(AV93UAlbFch, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vFACEST", GXutil.ltrim( localUtil.ntoc( AV31FacEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vPRIO", GXutil.rtrim( AV83PRIO));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_73", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_73, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRID1PAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV108Grid1PageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLIEMF", GXutil.rtrim( A10050Cliemf));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOPIA", AV19Copia);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOPIA", AV19Copia);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vIMPCOD", GXutil.rtrim( AV40ImpCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALEURO", GXutil.ltrim( localUtil.ntoc( AV99ValEuro, (byte)(8), (byte)(3), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "FACHOR", localUtil.ttoc( A9606FacHor, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vUALB", GXutil.ltrim( localUtil.ntoc( AV91UALB, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Class", GXutil.rtrim( Grid1paginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showfirst", GXutil.booltostr( Grid1paginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showprevious", GXutil.booltostr( Grid1paginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Shownext", GXutil.booltostr( Grid1paginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Showlast", GXutil.booltostr( Grid1paginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Grid1paginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Grid1paginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Emptygridclass", GXutil.rtrim( Grid1paginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Grid1paginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Grid1paginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Previous", GXutil.rtrim( Grid1paginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Next", GXutil.rtrim( Grid1paginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Caption", GXutil.rtrim( Grid1paginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Grid1paginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Grid1paginationbar_Rowsperpagecaption));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid1_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Selectedpage", GXutil.rtrim( Grid1paginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1PAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Grid1paginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         weBB2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtBB2( ) ;
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
      return formatLink("app.webwfatmod", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWFatMod" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Impresion Facturas (Moda 21)", "") ;
   }

   public void wbBB0( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPcli_Internalname, httpContext.getMessage( "Clientes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV81PCLI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV81PCLI), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV81PCLI), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWFatMod.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUcli_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV94UCLI, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavUcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV94UCLI), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV94UCLI), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWFatMod.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPalbfch_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPalbfch_Internalname, httpContext.getMessage( "Datas Fatura", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavPalbfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPalbfch_Internalname, localUtil.format(AV77PAlbFch, "99/99/99"), localUtil.format( AV77PAlbFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPalbfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPalbfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWFatMod.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavPalbfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavPalbfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWFatMod.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUalbfch_Internalname, httpContext.getMessage( "AlbProFch", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavUalbfch_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUalbfch_Internalname, localUtil.format(AV93UAlbFch, "99/99/99"), localUtil.format( AV93UAlbFch, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUalbfch_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavUalbfch_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWFatMod.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavUalbfch_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavUalbfch_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWFatMod.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavFacest.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavFacest.getInternalname(), httpContext.getMessage( "Estado?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavFacest, cmbavFacest.getInternalname(), GXutil.trim( GXutil.str( AV31FacEst, 1, 0)), 1, cmbavFacest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavFacest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "", true, (byte)(0), "HLP_WebWFatMod.htm");
         cmbavFacest.setValue( GXutil.trim( GXutil.str( AV31FacEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavFacest.getInternalname(), "Values", cmbavFacest.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+cmbavPrio.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavPrio.getInternalname(), httpContext.getMessage( "Prioridad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavPrio, cmbavPrio.getInternalname(), GXutil.rtrim( AV83PRIO), 1, cmbavPrio.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "char", "", 1, cmbavPrio.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,40);\"", "", true, (byte)(0), "HLP_WebWFatMod.htm");
         cmbavPrio.setValue( GXutil.rtrim( AV83PRIO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavF_header.getInternalname(), httpContext.getMessage( "F header", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavF_header, cmbavF_header.getInternalname(), GXutil.trim( GXutil.str( AV29F_header, 1, 0)), 1, cmbavF_header.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavF_header.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,47);\"", "", true, (byte)(0), "HLP_WebWFatMod.htm");
         cmbavF_header.setValue( GXutil.trim( GXutil.str( AV29F_header, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavF_header.getInternalname(), "Values", cmbavF_header.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavAgr_fases.getInternalname(), httpContext.getMessage( "Agr Fases", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavAgr_fases, cmbavAgr_fases.getInternalname(), GXutil.trim( GXutil.str( AV6Agr_Fases, 1, 0)), 1, cmbavAgr_fases.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavAgr_fases.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "", true, (byte)(0), "HLP_WebWFatMod.htm");
         cmbavAgr_fases.setValue( GXutil.trim( GXutil.str( AV6Agr_Fases, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAgr_fases.getInternalname(), "Values", cmbavAgr_fases.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCopias2_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCopias2_Internalname, httpContext.getMessage( "Nº Copias", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCopias2_Internalname, GXutil.ltrim( localUtil.ntoc( AV21Copias2, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCopias2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21Copias2), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV21Copias2), "Z9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,54);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCopias2_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCopias2_Enabled, 0, "text", "1", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWFatMod.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavVersumlin.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavVersumlin.getInternalname(), httpContext.getMessage( "Ver Suma Total", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavVersumlin.getInternalname(), GXutil.str( AV101VerSumLin, 1, 0), "", httpContext.getMessage( "Ver Suma Total", ""), 1, chkavVersumlin.getEnabled(), "1", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(59, this, 1, 0,"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavMail.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavMail.getInternalname(), httpContext.getMessage( "Faturas por E-mail?", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavMail.getInternalname(), AV65Mail, "", httpContext.getMessage( "Faturas por E-mail?", ""), 1, chkavMail.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(63, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,63);\"");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+chkavOpi.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, chkavOpi.getInternalname(), httpContext.getMessage( "Écran", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Check box */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_checkbox_ctrl( httpContext, chkavOpi.getInternalname(), AV74Opi, "", httpContext.getMessage( "Écran", ""), 1, chkavOpi.getEnabled(), "S", "", StyleString, ClassString, "", "", TempTags+" onclick="+"\"gx.fn.checkboxClick(67, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+" onblur=\""+""+";gx.evt.onblur(this,67);\"");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGrid1tablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         Grid1Container.SetWrapped(nGXWrapped);
         startgridcontrol73( ) ;
      }
      if ( wbEnd == 73 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_73 = (int)(nGXsfl_73_idx-1) ;
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGrid1paginationbar.setProperty("Class", Grid1paginationbar_Class);
         ucGrid1paginationbar.setProperty("ShowFirst", Grid1paginationbar_Showfirst);
         ucGrid1paginationbar.setProperty("ShowPrevious", Grid1paginationbar_Showprevious);
         ucGrid1paginationbar.setProperty("ShowNext", Grid1paginationbar_Shownext);
         ucGrid1paginationbar.setProperty("ShowLast", Grid1paginationbar_Showlast);
         ucGrid1paginationbar.setProperty("PagesToShow", Grid1paginationbar_Pagestoshow);
         ucGrid1paginationbar.setProperty("PagingButtonsPosition", Grid1paginationbar_Pagingbuttonsposition);
         ucGrid1paginationbar.setProperty("PagingCaptionPosition", Grid1paginationbar_Pagingcaptionposition);
         ucGrid1paginationbar.setProperty("EmptyGridClass", Grid1paginationbar_Emptygridclass);
         ucGrid1paginationbar.setProperty("RowsPerPageSelector", Grid1paginationbar_Rowsperpageselector);
         ucGrid1paginationbar.setProperty("RowsPerPageOptions", Grid1paginationbar_Rowsperpageoptions);
         ucGrid1paginationbar.setProperty("Previous", Grid1paginationbar_Previous);
         ucGrid1paginationbar.setProperty("Next", Grid1paginationbar_Next);
         ucGrid1paginationbar.setProperty("Caption", Grid1paginationbar_Caption);
         ucGrid1paginationbar.setProperty("EmptyGridCaption", Grid1paginationbar_Emptygridcaption);
         ucGrid1paginationbar.setProperty("RowsPerPageCaption", Grid1paginationbar_Rowsperpagecaption);
         ucGrid1paginationbar.setProperty("CurrentPage", AV107Grid1CurrentPage);
         ucGrid1paginationbar.setProperty("PageCount", AV108Grid1PageCount);
         ucGrid1paginationbar.render(context, "dvelop.dvpaginationbar", Grid1paginationbar_Internalname, "GRID1PAGINATIONBARContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
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
         wb_table1_91_BB2( true) ;
      }
      else
      {
         wb_table1_91_BB2( false) ;
      }
      return  ;
   }

   public void wb_table1_91_BB2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 102,'',false,'" + sGXsfl_73_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGrid1currentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV107Grid1CurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV107Grid1CurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGrid1currentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGrid1currentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWFatMod.htm");
         /* User Defined Control */
         ucGrid1_empowerer.render(context, "wwp.gridempowerer", Grid1_empowerer_Internalname, "GRID1_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 73 )
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

   public void startBB2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Impresion Facturas (Moda 21)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupBB0( ) ;
   }

   public void wsBB2( )
   {
      startBB2( ) ;
      evtBB2( ) ;
   }

   public void evtBB2( )
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
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e11BB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRID1PAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12BB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoImprimir' */
                           e13BB2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "GRID1.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_73_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_732( ) ;
                           AV112Op = ((GXutil.strcmp(httpContext.cgiGet( chkavOp.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV112Op);
                           A430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A436FacFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtFacFch_Internalname), 0)) ;
                           A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
                           cmbFacEst.setName( cmbFacEst.getInternalname() );
                           cmbFacEst.setValue( httpContext.cgiGet( cmbFacEst.getInternalname()) );
                           A435FacEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbFacEst.getInternalname()))) ;
                           AV14Cliemf = httpContext.cgiGet( edtavCliemf_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavCliemf_Internalname, AV14Cliemf);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e14BB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e15BB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID1.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e16BB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Pcli Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vPCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV81PCLI )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ucli Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vUCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV94UCLI )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Palbfch Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vPALBFCH"), 0), AV77PAlbFch) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Ualbfch Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vUALBFCH"), 0), AV93UAlbFch) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Facest Changed */
                                    if ( localUtil.ctol( httpContext.cgiGet( "GXH_vFACEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV31FacEst )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    /* Set Refresh If Prio Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPRIO"), AV83PRIO) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
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

   public void weBB2( )
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

   public void paBB2( )
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
            GX_FocusControl = edtavPcli_Internalname ;
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
      subsflControlProps_732( ) ;
      while ( nGXsfl_73_idx <= nRC_GXsfl_73 )
      {
         sendrow_732( ) ;
         nGXsfl_73_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_73_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_732( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Grid1Container)) ;
      /* End function gxnrGrid1_newrow */
   }

   public void gxgrgrid1_refresh( int subGrid1_Rows ,
                                  int AV81PCLI ,
                                  int AV94UCLI ,
                                  java.util.Date AV77PAlbFch ,
                                  java.util.Date AV93UAlbFch ,
                                  byte AV31FacEst ,
                                  String AV83PRIO ,
                                  int AV91UALB ,
                                  String A396EmprCod ,
                                  byte AV101VerSumLin ,
                                  String AV65Mail ,
                                  String AV74Opi )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e15BB2 ();
      GRID1_nCurrentRecord = 0 ;
      rfBB2( ) ;
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
      if ( cmbavFacest.getItemCount() > 0 )
      {
         AV31FacEst = (byte)(GXutil.lval( cmbavFacest.getValidValue(GXutil.trim( GXutil.str( AV31FacEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31FacEst", GXutil.str( AV31FacEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavFacest.setValue( GXutil.trim( GXutil.str( AV31FacEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavFacest.getInternalname(), "Values", cmbavFacest.ToJavascriptSource(), true);
      }
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV83PRIO = cmbavPrio.getValidValue(AV83PRIO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83PRIO", AV83PRIO);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavPrio.setValue( GXutil.rtrim( AV83PRIO) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavPrio.getInternalname(), "Values", cmbavPrio.ToJavascriptSource(), true);
      }
      if ( cmbavF_header.getItemCount() > 0 )
      {
         AV29F_header = (byte)(GXutil.lval( cmbavF_header.getValidValue(GXutil.trim( GXutil.str( AV29F_header, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29F_header", GXutil.str( AV29F_header, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavF_header.setValue( GXutil.trim( GXutil.str( AV29F_header, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavF_header.getInternalname(), "Values", cmbavF_header.ToJavascriptSource(), true);
      }
      if ( cmbavAgr_fases.getItemCount() > 0 )
      {
         AV6Agr_Fases = (byte)(GXutil.lval( cmbavAgr_fases.getValidValue(GXutil.trim( GXutil.str( AV6Agr_Fases, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Agr_Fases", GXutil.str( AV6Agr_Fases, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavAgr_fases.setValue( GXutil.trim( GXutil.str( AV6Agr_Fases, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAgr_fases.getInternalname(), "Values", cmbavAgr_fases.ToJavascriptSource(), true);
      }
      AV101VerSumLin = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV101VerSumLin, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101VerSumLin", GXutil.str( AV101VerSumLin, 1, 0));
      AV65Mail = ((GXutil.strcmp(GXutil.rtrim( AV65Mail), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Mail", AV65Mail);
      AV74Opi = ((GXutil.strcmp(GXutil.rtrim( AV74Opi), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Opi", AV74Opi);
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfBB2( ) ;
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
      edtavCliemf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCliemf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCliemf_Enabled), 5, 0), !bGXsfl_73_Refreshing);
   }

   public void rfBB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Grid1Container.ClearRows();
      }
      wbStart = (short)(73) ;
      /* Execute user event: Refresh */
      e15BB2 ();
      nGXsfl_73_idx = 1 ;
      sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_732( ) ;
      bGXsfl_73_Refreshing = true ;
      Grid1Container.AddObjectProperty("GridName", "Grid1");
      Grid1Container.AddObjectProperty("CmpContext", "");
      Grid1Container.AddObjectProperty("InMasterPage", "false");
      Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Grid1Container.setPageSize( subgrid1_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_732( ) ;
         GXPagingFrom2 = (int)(((subGrid1_Rows==0) ? 0 : GRID1_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid1_Rows==0) ? 10000 : subgrid1_fnc_recordsperpage( )+1) ;
         /* Using cursor H00BB2 */
         pr_default.execute(0, new Object[] {A396EmprCod, Byte.valueOf(AV31FacEst), Integer.valueOf(AV76PALB), AV77PAlbFch, AV93UAlbFch, Integer.valueOf(AV81PCLI), Integer.valueOf(AV94UCLI), AV83PRIO, Integer.valueOf(AV91UALB), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_73_idx = 1 ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_732( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid1_Rows == 0 ) || ( GRID1_nCurrentRecord < subgrid1_fnc_recordsperpage( ) ) ) ) )
         {
            A435FacEst = H00BB2_A435FacEst[0] ;
            A450FacPri = H00BB2_A450FacPri[0] ;
            A1153FacTipFac = H00BB2_A1153FacTipFac[0] ;
            A10050Cliemf = H00BB2_A10050Cliemf[0] ;
            A9606FacHor = H00BB2_A9606FacHor[0] ;
            A279CliNom = H00BB2_A279CliNom[0] ;
            A252CliCod = H00BB2_A252CliCod[0] ;
            A436FacFch = H00BB2_A436FacFch[0] ;
            A430FacCod = H00BB2_A430FacCod[0] ;
            A10050Cliemf = H00BB2_A10050Cliemf[0] ;
            A279CliNom = H00BB2_A279CliNom[0] ;
            e16BB2 ();
            pr_default.readNext(0);
         }
         GRID1_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nEOF", GXutil.ltrim( localUtil.ntoc( GRID1_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(73) ;
         wbBB0( ) ;
      }
      bGXsfl_73_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesBB2( )
   {
   }

   public int subgrid1_fnc_pagecount( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID1_nRecordCount/ (double) (subgrid1_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid1_fnc_recordcount( )
   {
      /* Using cursor H00BB3 */
      pr_default.execute(1, new Object[] {A396EmprCod, Byte.valueOf(AV31FacEst), Integer.valueOf(AV76PALB), AV77PAlbFch, AV93UAlbFch, Integer.valueOf(AV81PCLI), Integer.valueOf(AV94UCLI), AV83PRIO, Integer.valueOf(AV91UALB)});
      GRID1_nRecordCount = H00BB3_AGRID1_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID1_nRecordCount) ;
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
      return (int)(GXutil.Int( GRID1_nFirstRecordOnPage/ (double) (subgrid1_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid1_firstpage( )
   {
      GRID1_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV81PCLI, AV94UCLI, AV77PAlbFch, AV93UAlbFch, AV31FacEst, AV83PRIO, AV91UALB, A396EmprCod, AV101VerSumLin, AV65Mail, AV74Opi) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_nextpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( ( GRID1_nRecordCount >= subgrid1_fnc_recordsperpage( ) ) && ( GRID1_nEOF == 0 ) )
      {
         GRID1_nFirstRecordOnPage = (long)(GRID1_nFirstRecordOnPage+subgrid1_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Grid1Container.AddObjectProperty("GRID1_nFirstRecordOnPage", GRID1_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV81PCLI, AV94UCLI, AV77PAlbFch, AV93UAlbFch, AV31FacEst, AV83PRIO, AV91UALB, A396EmprCod, AV101VerSumLin, AV65Mail, AV74Opi) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV81PCLI, AV94UCLI, AV77PAlbFch, AV93UAlbFch, AV31FacEst, AV83PRIO, AV91UALB, A396EmprCod, AV101VerSumLin, AV65Mail, AV74Opi) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid1_lastpage( )
   {
      GRID1_nRecordCount = subgrid1_fnc_recordcount( ) ;
      if ( GRID1_nRecordCount > subgrid1_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( )))) == 0 )
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-subgrid1_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID1_nFirstRecordOnPage = (long)(GRID1_nRecordCount-((int)((GRID1_nRecordCount) % (subgrid1_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID1_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID1_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid1_refresh( subGrid1_Rows, AV81PCLI, AV94UCLI, AV77PAlbFch, AV93UAlbFch, AV31FacEst, AV83PRIO, AV91UALB, A396EmprCod, AV101VerSumLin, AV65Mail, AV74Opi) ;
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
         gxgrgrid1_refresh( subGrid1_Rows, AV81PCLI, AV94UCLI, AV77PAlbFch, AV93UAlbFch, AV31FacEst, AV83PRIO, AV91UALB, A396EmprCod, AV101VerSumLin, AV65Mail, AV74Opi) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavCliemf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCliemf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCliemf_Enabled), 5, 0), !bGXsfl_73_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupBB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e14BB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV108Grid1PageCount = localUtil.ctol( httpContext.cgiGet( "vGRID1PAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         A10050Cliemf = httpContext.cgiGet( "CLIEMF") ;
         GRID1_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID1_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID1_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID1_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid1_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
         Grid1paginationbar_Class = httpContext.cgiGet( "GRID1PAGINATIONBAR_Class") ;
         Grid1paginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showfirst")) ;
         Grid1paginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showprevious")) ;
         Grid1paginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Shownext")) ;
         Grid1paginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Showlast")) ;
         Grid1paginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid1paginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagingbuttonsposition") ;
         Grid1paginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRID1PAGINATIONBAR_Pagingcaptionposition") ;
         Grid1paginationbar_Emptygridclass = httpContext.cgiGet( "GRID1PAGINATIONBAR_Emptygridclass") ;
         Grid1paginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselector")) ;
         Grid1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Grid1paginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageoptions") ;
         Grid1paginationbar_Previous = httpContext.cgiGet( "GRID1PAGINATIONBAR_Previous") ;
         Grid1paginationbar_Next = httpContext.cgiGet( "GRID1PAGINATIONBAR_Next") ;
         Grid1paginationbar_Caption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Caption") ;
         Grid1paginationbar_Emptygridcaption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Emptygridcaption") ;
         Grid1paginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpagecaption") ;
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
         Grid1_empowerer_Gridinternalname = httpContext.cgiGet( "GRID1_EMPOWERER_Gridinternalname") ;
         Grid1paginationbar_Selectedpage = httpContext.cgiGet( "GRID1PAGINATIONBAR_Selectedpage") ;
         Grid1paginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRID1PAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPCLI");
            GX_FocusControl = edtavPcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV81PCLI = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81PCLI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81PCLI), 6, 0));
         }
         else
         {
            AV81PCLI = (int)(localUtil.ctol( httpContext.cgiGet( edtavPcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV81PCLI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV81PCLI), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavUcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavUcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUCLI");
            GX_FocusControl = edtavUcli_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV94UCLI = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94UCLI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94UCLI), 6, 0));
         }
         else
         {
            AV94UCLI = (int)(localUtil.ctol( httpContext.cgiGet( edtavUcli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV94UCLI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94UCLI), 6, 0));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavPalbfch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vPALBFCH");
            GX_FocusControl = edtavPalbfch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV77PAlbFch = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77PAlbFch", localUtil.format(AV77PAlbFch, "99/99/99"));
         }
         else
         {
            AV77PAlbFch = localUtil.ctod( httpContext.cgiGet( edtavPalbfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV77PAlbFch", localUtil.format(AV77PAlbFch, "99/99/99"));
         }
         if ( localUtil.vcdate( httpContext.cgiGet( edtavUalbfch_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vUALBFCH");
            GX_FocusControl = edtavUalbfch_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV93UAlbFch = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93UAlbFch", localUtil.format(AV93UAlbFch, "99/99/99"));
         }
         else
         {
            AV93UAlbFch = localUtil.ctod( httpContext.cgiGet( edtavUalbfch_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV93UAlbFch", localUtil.format(AV93UAlbFch, "99/99/99"));
         }
         cmbavFacest.setName( cmbavFacest.getInternalname() );
         cmbavFacest.setValue( httpContext.cgiGet( cmbavFacest.getInternalname()) );
         AV31FacEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbavFacest.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31FacEst", GXutil.str( AV31FacEst, 1, 0));
         cmbavPrio.setName( cmbavPrio.getInternalname() );
         cmbavPrio.setValue( httpContext.cgiGet( cmbavPrio.getInternalname()) );
         AV83PRIO = httpContext.cgiGet( cmbavPrio.getInternalname()) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83PRIO", AV83PRIO);
         cmbavF_header.setName( cmbavF_header.getInternalname() );
         cmbavF_header.setValue( httpContext.cgiGet( cmbavF_header.getInternalname()) );
         AV29F_header = (byte)(GXutil.lval( httpContext.cgiGet( cmbavF_header.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29F_header", GXutil.str( AV29F_header, 1, 0));
         cmbavAgr_fases.setName( cmbavAgr_fases.getInternalname() );
         cmbavAgr_fases.setValue( httpContext.cgiGet( cmbavAgr_fases.getInternalname()) );
         AV6Agr_Fases = (byte)(GXutil.lval( httpContext.cgiGet( cmbavAgr_fases.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Agr_Fases", GXutil.str( AV6Agr_Fases, 1, 0));
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOPIAS2");
            GX_FocusControl = edtavCopias2_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21Copias2 = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Copias2), 2, 0));
         }
         else
         {
            AV21Copias2 = (byte)(localUtil.ctol( httpContext.cgiGet( edtavCopias2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Copias2), 2, 0));
         }
         if ( ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavVersumlin.getInternalname()), "1")==0) ? 1 : 0) < 0 ) ) || ( ( ((GXutil.strcmp(httpContext.cgiGet( chkavVersumlin.getInternalname()), "1")==0) ? 1 : 0) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVERSUMLIN");
            GX_FocusControl = chkavVersumlin.getInternalname() ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV101VerSumLin = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101VerSumLin", GXutil.str( AV101VerSumLin, 1, 0));
         }
         else
         {
            AV101VerSumLin = (byte)(((GXutil.strcmp(httpContext.cgiGet( chkavVersumlin.getInternalname()), "1")==0) ? 1 : 0)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV101VerSumLin", GXutil.str( AV101VerSumLin, 1, 0));
         }
         AV65Mail = ((GXutil.strcmp(httpContext.cgiGet( chkavMail.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV65Mail", AV65Mail);
         AV74Opi = ((GXutil.strcmp(httpContext.cgiGet( chkavOpi.getInternalname()), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV74Opi", AV74Opi);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRID1CURRENTPAGE");
            GX_FocusControl = edtavGrid1currentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV107Grid1CurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Grid1CurrentPage), 10, 0));
         }
         else
         {
            AV107Grid1CurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGrid1currentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV107Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Grid1CurrentPage), 10, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vPCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV81PCLI )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vUCLI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV94UCLI )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vPALBFCH"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV77PAlbFch)) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vUALBFCH"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV93UAlbFch)) ) )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( localUtil.ctol( httpContext.cgiGet( "GXH_vFACEST"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) != AV31FacEst )
         {
            GRID1_nFirstRecordOnPage = 0 ;
         }
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vPRIO"), AV83PRIO) != 0 )
         {
            GRID1_nFirstRecordOnPage = 0 ;
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
      e14BB2 ();
      if (returnInSub) return;
   }

   public void e14BB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV86Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwfatmod_impl.this.GXt_char1 = GXv_char2[0] ;
      AV86Station = GXt_char1 ;
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char4[0] = AV98UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV86Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwfatmod_impl.this.A396EmprCod = GXv_char2[0] ;
      webwfatmod_impl.this.AV25EmprNom = GXv_char3[0] ;
      webwfatmod_impl.this.AV98UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      AV104AplicarConfirmar = false ;
      GXv_int5[0] = AV20Copias ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, "100005", GXv_int5) ;
      webwfatmod_impl.this.AV20Copias = (byte)((byte)(GXv_int5[0])) ;
      AV20Copias = (byte)(((AV20Copias==0) ? 1 : AV20Copias)) ;
      AV21Copias2 = AV20Copias ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Copias2", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Copias2), 2, 0));
      AV19Copia[1-1] = httpContext.getMessage( "Original", "") ;
      AV19Copia[2-1] = httpContext.getMessage( "Duplicado", "") ;
      AV19Copia[3-1] = httpContext.getMessage( "Triplicado", "") ;
      AV19Copia[4-1] = httpContext.getMessage( "Quadriplicado", "") ;
      AV6Agr_Fases = (byte)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Agr_Fases", GXutil.str( AV6Agr_Fases, 1, 0));
      AV101VerSumLin = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101VerSumLin", GXutil.str( AV101VerSumLin, 1, 0));
      AV67ManAut = httpContext.getMessage( "M", "") ;
      AV65Mail = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Mail", AV65Mail);
      AV94UCLI = 999999 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV94UCLI", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV94UCLI), 6, 0));
      AV77PAlbFch = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77PAlbFch", localUtil.format(AV77PAlbFch, "99/99/99"));
      AV93UAlbFch = GXutil.today( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV93UAlbFch", localUtil.format(AV93UAlbFch, "99/99/99"));
      AV91UALB = 99999999 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV91UALB", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV91UALB), 8, 0));
      AV29F_header = (byte)(2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29F_header", GXutil.str( AV29F_header, 1, 0));
      AV83PRIO = "1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV83PRIO", AV83PRIO);
      AV74Opi = httpContext.getMessage( "N", "") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Opi", AV74Opi);
      GXt_char1 = AV86Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwfatmod_impl.this.GXt_char1 = GXv_char4[0] ;
      AV86Station = GXt_char1 ;
      GXv_char4[0] = AV24EmprCod ;
      GXv_char3[0] = AV25EmprNom ;
      GXv_char2[0] = AV98UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV86Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwfatmod_impl.this.AV24EmprCod = GXv_char4[0] ;
      webwfatmod_impl.this.AV25EmprNom = GXv_char3[0] ;
      webwfatmod_impl.this.AV98UsurCod = GXv_char2[0] ;
      Grid1_empowerer_Gridinternalname = subGrid1_Internalname ;
      ucGrid1_empowerer.sendProperty(context, "", false, Grid1_empowerer_Internalname, "GridInternalName", Grid1_empowerer_Gridinternalname);
      subGrid1_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV107Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Grid1CurrentPage), 10, 0));
      edtavGrid1currentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGrid1currentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGrid1currentpage_Visible), 5, 0), true);
      AV108Grid1PageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV108Grid1PageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV108Grid1PageCount), 10, 0));
      Grid1paginationbar_Rowsperpageselectedvalue = subGrid1_Rows ;
      ucGrid1paginationbar.sendProperty(context, "", false, Grid1paginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Grid1paginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e15BB2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
   }

   private void e16BB2( )
   {
      /* Grid1_Load Routine */
      returnInSub = false ;
      AV112Op = httpContext.getMessage( "S", "") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV112Op);
      AV14Cliemf = A10050Cliemf ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCliemf_Internalname, AV14Cliemf);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(73) ;
      }
      sendrow_732( ) ;
      GRID1_nCurrentRecord = (long)(GRID1_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_73_Refreshing )
      {
         httpContext.doAjaxLoad(73, Grid1Row);
      }
      /*  Sending Event outputs  */
   }

   public void e11BB2( )
   {
      /* Grid1paginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Previous") == 0 )
      {
         AV107Grid1CurrentPage = (long)(AV107Grid1CurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Grid1CurrentPage), 10, 0));
         subgrid1_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Grid1paginationbar_Selectedpage, "Next") == 0 )
      {
         AV107Grid1CurrentPage = (long)(AV107Grid1CurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Grid1CurrentPage), 10, 0));
         subgrid1_nextpage( ) ;
      }
      else
      {
         AV106PageToGo = (int)(GXutil.lval( Grid1paginationbar_Selectedpage)) ;
         AV107Grid1CurrentPage = AV106PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV107Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Grid1CurrentPage), 10, 0));
         subgrid1_gotopage( AV106PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e12BB2( )
   {
      /* Grid1paginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid1_Rows = Grid1paginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID1_Rows", GXutil.ltrim( localUtil.ntoc( subGrid1_Rows, (byte)(6), (byte)(0), ".", "")));
      AV107Grid1CurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV107Grid1CurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV107Grid1CurrentPage), 10, 0));
      subgrid1_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e13BB2( )
   {
      /* 'DoImprimir' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV74Opi, httpContext.getMessage( "N", "")) == 0 )
      {
         AV75Outputi = httpContext.getMessage( "PRN", "") ;
      }
      else
      {
         AV75Outputi = httpContext.getMessage( "SCR", "") ;
      }
      /* Start For Each Line */
      nRC_GXsfl_73 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_73"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_73_fel_idx = 0 ;
      while ( nGXsfl_73_fel_idx < nRC_GXsfl_73 )
      {
         nGXsfl_73_fel_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_73_fel_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_73_fel_idx+1) ;
         sGXsfl_73_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_732( ) ;
         AV112Op = ((GXutil.strcmp(httpContext.cgiGet( chkavOp.getInternalname()), "S")==0) ? "S" : "N") ;
         A430FacCod = (int)(localUtil.ctol( httpContext.cgiGet( edtFacCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A436FacFch = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtFacFch_Internalname), 0)) ;
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         cmbFacEst.setName( cmbFacEst.getInternalname() );
         cmbFacEst.setValue( httpContext.cgiGet( cmbFacEst.getInternalname()) );
         A435FacEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbFacEst.getInternalname()))) ;
         AV14Cliemf = httpContext.cgiGet( edtavCliemf_Internalname) ;
         if ( GXutil.strcmp(AV112Op, httpContext.getMessage( "S", "")) == 0 )
         {
            AV20Copias = AV21Copias2 ;
            AV39i = (byte)(1) ;
            while ( AV20Copias > 0 )
            {
               AV88TextoCopia = AV19Copia[AV39i-1] ;
               callWebObject(formatLink("app.facturacion.pfacm21", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A430FacCod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV40ImpCod)),GXutil.URLEncode(DecimalUtil.decToString(AV99ValEuro)),GXutil.URLEncode(GXutil.rtrim(AV88TextoCopia)),GXutil.URLEncode(GXutil.rtrim(AV75Outputi)),GXutil.URLEncode(GXutil.ltrimstr(AV29F_header,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6Agr_Fases,1,0)),GXutil.URLEncode(GXutil.ltrimstr(AV101VerSumLin,1,0))}, new String[] {"EmprCod","FacCod","ImpCod","ValEuro","TextoCopia","Output","F_header","Agr_Fases","VerSumTot"}) );
               httpContext.wjLocDisableFrm = (byte)(2) ;
               GXv_char4[0] = A396EmprCod ;
               GXv_int5[0] = A430FacCod ;
               GXv_dtime6[0] = A9606FacHor ;
               new app.pfiritems(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_dtime6) ;
               webwfatmod_impl.this.A396EmprCod = GXv_char4[0] ;
               webwfatmod_impl.this.A430FacCod = GXv_int5[0] ;
               webwfatmod_impl.this.A9606FacHor = GXv_dtime6[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "A9606FacHor", localUtil.ttoc( A9606FacHor, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               AV20Copias = (byte)(AV20Copias-1) ;
               AV39i = (byte)(AV39i+1) ;
            }
         }
         /* End For Each Line */
      }
      if ( nGXsfl_73_fel_idx == 0 )
      {
         nGXsfl_73_idx = 1 ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_732( ) ;
      }
      nGXsfl_73_fel_idx = 1 ;
      /*  Sending Event outputs  */
      cmbavAgr_fases.setValue( GXutil.trim( GXutil.str( AV6Agr_Fases, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAgr_fases.getInternalname(), "Values", cmbavAgr_fases.ToJavascriptSource(), true);
      cmbavF_header.setValue( GXutil.trim( GXutil.str( AV29F_header, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavF_header.getInternalname(), "Values", cmbavF_header.ToJavascriptSource(), true);
   }

   public void wb_table1_91_BB2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 94,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 73, 2, 0)+","+"null"+");", httpContext.getMessage( "Marcar Todas", ""), bttBtnmarcartodas_Jsonclick, 7, httpContext.getMessage( "Marcar Todas", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e17bb1_client"+"'", TempTags, "", 2, "HLP_WebWFatMod.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 96,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 73, 2, 0)+","+"null"+");", httpContext.getMessage( "Desmarcar Todas", ""), bttBtndesmarcartodas_Jsonclick, 7, httpContext.getMessage( "Desmarcar Todas", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e18bb1_client"+"'", TempTags, "", 2, "HLP_WebWFatMod.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 98,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 73, 2, 0)+","+"null"+");", httpContext.getMessage( "Imprimir", ""), bttBtnimprimir_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOIMPRIMIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWFatMod.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_91_BB2e( true) ;
      }
      else
      {
         wb_table1_91_BB2e( false) ;
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
      paBB2( ) ;
      wsBB2( ) ;
      weBB2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016405320", true, true);
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
         httpContext.AddJavascriptSource("webwfatmod.js", "?202661016405321", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_732( )
   {
      chkavOp.setInternalname( "vOP_"+sGXsfl_73_idx );
      edtFacCod_Internalname = "FACCOD_"+sGXsfl_73_idx ;
      edtFacFch_Internalname = "FACFCH_"+sGXsfl_73_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_73_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_73_idx ;
      cmbFacEst.setInternalname( "FACEST_"+sGXsfl_73_idx );
      edtavCliemf_Internalname = "vCLIEMF_"+sGXsfl_73_idx ;
   }

   public void subsflControlProps_fel_732( )
   {
      chkavOp.setInternalname( "vOP_"+sGXsfl_73_fel_idx );
      edtFacCod_Internalname = "FACCOD_"+sGXsfl_73_fel_idx ;
      edtFacFch_Internalname = "FACFCH_"+sGXsfl_73_fel_idx ;
      edtCliCod_Internalname = "CLICOD_"+sGXsfl_73_fel_idx ;
      edtCliNom_Internalname = "CLINOM_"+sGXsfl_73_fel_idx ;
      cmbFacEst.setInternalname( "FACEST_"+sGXsfl_73_fel_idx );
      edtavCliemf_Internalname = "vCLIEMF_"+sGXsfl_73_fel_idx ;
   }

   public void sendrow_732( )
   {
      subsflControlProps_732( ) ;
      wbBB0( ) ;
      if ( ( subGrid1_Rows * 1 == 0 ) || ( nGXsfl_73_idx <= subgrid1_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_73_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_73_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavOp.getEnabled()!=0)&&(chkavOp.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 74,'',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vOP_" + sGXsfl_73_idx ;
         chkavOp.setName( GXCCtl );
         chkavOp.setWebtags( "" );
         chkavOp.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavOp.getInternalname(), "TitleCaption", chkavOp.getCaption(), !bGXsfl_73_Refreshing);
         chkavOp.setCheckedValue( "N" );
         AV112Op = ((GXutil.strcmp(GXutil.rtrim( AV112Op), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV112Op);
         Grid1Row.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavOp.getInternalname(),AV112Op,"","",Integer.valueOf(-1),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(74, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavOp.getEnabled()!=0)&&(chkavOp.getVisible()!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,74);\"" : " ")});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacCod_Internalname,GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A430FacCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFacFch_Internalname,localUtil.format(A436FacFch, "99/99/99"),localUtil.format( A436FacFch, "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFacFch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliCod_Internalname,GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtCliNom_Internalname,GXutil.rtrim( A279CliNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtCliNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         if ( ( cmbFacEst.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "FACEST_" + sGXsfl_73_idx ;
            cmbFacEst.setName( GXCCtl );
            cmbFacEst.setWebtags( "" );
            cmbFacEst.addItem("0", httpContext.getMessage( "Gerada", ""), (short)(0));
            cmbFacEst.addItem("1", httpContext.getMessage( "Impresso", ""), (short)(0));
            cmbFacEst.addItem("2", httpContext.getMessage( "Atualizada", ""), (short)(0));
            if ( cmbFacEst.getItemCount() > 0 )
            {
               A435FacEst = (byte)(GXutil.lval( cmbFacEst.getValidValue(GXutil.trim( GXutil.str( A435FacEst, 1, 0))))) ;
            }
         }
         /* ComboBox */
         Grid1Row.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbFacEst,cmbFacEst.getInternalname(),GXutil.trim( GXutil.str( A435FacEst, 1, 0)),Integer.valueOf(1),cmbFacEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbFacEst.setValue( GXutil.trim( GXutil.str( A435FacEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbFacEst.getInternalname(), "Values", cmbFacEst.ToJavascriptSource(), !bGXsfl_73_Refreshing);
         /* Subfile cell */
         if ( Grid1Container.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCliemf_Enabled!=0)&&(edtavCliemf_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 80,'',false,'"+sGXsfl_73_idx+"',73)\"" : " ") ;
         ROClassString = "Attribute" ;
         Grid1Row.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCliemf_Internalname,GXutil.rtrim( AV14Cliemf),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavCliemf_Enabled!=0)&&(edtavCliemf_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,80);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavCliemf_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavCliemf_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(73),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesBB2( ) ;
         Grid1Container.AddRow(Grid1Row);
         nGXsfl_73_idx = ((subGrid1_Islastpage==1)&&(nGXsfl_73_idx+1>subgrid1_fnc_recordsperpage( )) ? 1 : nGXsfl_73_idx+1) ;
         sGXsfl_73_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_73_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_732( ) ;
      }
      /* End function sendrow_732 */
   }

   public void startgridcontrol73( )
   {
      if ( Grid1Container.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Grid1Container"+"DivS\" data-gxgridid=\"73\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid1_Internalname, subGrid1_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado Factura", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Email Facturacion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Grid1Container.AddObjectProperty("GridName", "Grid1");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            Grid1Container.Clear();
         }
         Grid1Container.SetWrapped(nGXWrapped);
         Grid1Container.AddObjectProperty("GridName", "Grid1");
         Grid1Container.AddObjectProperty("Header", subGrid1_Header);
         Grid1Container.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         Grid1Container.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid1_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddObjectProperty("CmpContext", "");
         Grid1Container.AddObjectProperty("InMasterPage", "false");
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV112Op));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A430FacCod, (byte)(8), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", localUtil.format(A436FacFch, "99/99/99"));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( A279CliNom));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A435FacEst, (byte)(1), (byte)(0), ".", "")));
         Grid1Container.AddColumnProperties(Grid1Column);
         Grid1Column = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Grid1Column.AddObjectProperty("Value", GXutil.rtrim( AV14Cliemf));
         Grid1Column.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavCliemf_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavPcli_Internalname = "vPCLI" ;
      edtavUcli_Internalname = "vUCLI" ;
      edtavPalbfch_Internalname = "vPALBFCH" ;
      edtavUalbfch_Internalname = "vUALBFCH" ;
      cmbavFacest.setInternalname( "vFACEST" );
      cmbavPrio.setInternalname( "vPRIO" );
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      cmbavF_header.setInternalname( "vF_HEADER" );
      cmbavAgr_fases.setInternalname( "vAGR_FASES" );
      edtavCopias2_Internalname = "vCOPIAS2" ;
      chkavVersumlin.setInternalname( "vVERSUMLIN" );
      chkavMail.setInternalname( "vMAIL" );
      chkavOpi.setInternalname( "vOPI" );
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      chkavOp.setInternalname( "vOP" );
      edtFacCod_Internalname = "FACCOD" ;
      edtFacFch_Internalname = "FACFCH" ;
      edtCliCod_Internalname = "CLICOD" ;
      edtCliNom_Internalname = "CLINOM" ;
      cmbFacEst.setInternalname( "FACEST" );
      edtavCliemf_Internalname = "vCLIEMF" ;
      Grid1paginationbar_Internalname = "GRID1PAGINATIONBAR" ;
      divGrid1tablewithpaginationbar_Internalname = "GRID1TABLEWITHPAGINATIONBAR" ;
      bttBtnmarcartodas_Internalname = "BTNMARCARTODAS" ;
      bttBtndesmarcartodas_Internalname = "BTNDESMARCARTODAS" ;
      bttBtnimprimir_Internalname = "BTNIMPRIMIR" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGrid1currentpage_Internalname = "vGRID1CURRENTPAGE" ;
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
      edtavCliemf_Jsonclick = "" ;
      edtavCliemf_Visible = -1 ;
      edtavCliemf_Enabled = 1 ;
      cmbFacEst.setJsonclick( "" );
      edtCliNom_Jsonclick = "" ;
      edtCliCod_Jsonclick = "" ;
      edtFacFch_Jsonclick = "" ;
      edtFacCod_Jsonclick = "" ;
      chkavOp.setCaption( "" );
      chkavOp.setVisible( -1 );
      chkavOp.setEnabled( 1 );
      subGrid1_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid1_Backcolorstyle = (byte)(0) ;
      edtavGrid1currentpage_Jsonclick = "" ;
      edtavGrid1currentpage_Visible = 1 ;
      chkavOpi.setEnabled( 1 );
      chkavMail.setEnabled( 1 );
      chkavVersumlin.setEnabled( 1 );
      edtavCopias2_Jsonclick = "" ;
      edtavCopias2_Enabled = 1 ;
      cmbavAgr_fases.setJsonclick( "" );
      cmbavAgr_fases.setEnabled( 1 );
      cmbavF_header.setJsonclick( "" );
      cmbavF_header.setEnabled( 1 );
      cmbavPrio.setJsonclick( "" );
      cmbavPrio.setEnabled( 1 );
      cmbavFacest.setJsonclick( "" );
      cmbavFacest.setEnabled( 1 );
      edtavUalbfch_Jsonclick = "" ;
      edtavUalbfch_Enabled = 1 ;
      edtavPalbfch_Jsonclick = "" ;
      edtavPalbfch_Enabled = 1 ;
      edtavUcli_Jsonclick = "" ;
      edtavUcli_Enabled = 1 ;
      edtavPcli_Jsonclick = "" ;
      edtavPcli_Enabled = 1 ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Grid1paginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Grid1paginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Grid1paginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Grid1paginationbar_Next = "WWP_PagingNextCaption" ;
      Grid1paginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Grid1paginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Grid1paginationbar_Rowsperpageselectedvalue = 10 ;
      Grid1paginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Grid1paginationbar_Pagingcaptionposition = "Left" ;
      Grid1paginationbar_Pagingbuttonsposition = "Right" ;
      Grid1paginationbar_Pagestoshow = 5 ;
      Grid1paginationbar_Showlast = GXutil.toBoolean( 0) ;
      Grid1paginationbar_Shownext = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Grid1paginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Grid1paginationbar_Class = "PaginationBar" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Impresion Facturas (Moda 21)", "") );
      subGrid1_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavFacest.setName( "vFACEST" );
      cmbavFacest.setWebtags( "" );
      cmbavFacest.addItem("0", httpContext.getMessage( "Gerada", ""), (short)(0));
      cmbavFacest.addItem("1", httpContext.getMessage( "Impresso", ""), (short)(0));
      cmbavFacest.addItem("2", httpContext.getMessage( "Atualizada", ""), (short)(0));
      if ( cmbavFacest.getItemCount() > 0 )
      {
         AV31FacEst = (byte)(GXutil.lval( cmbavFacest.getValidValue(GXutil.trim( GXutil.str( AV31FacEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31FacEst", GXutil.str( AV31FacEst, 1, 0));
      }
      cmbavPrio.setName( "vPRIO" );
      cmbavPrio.setWebtags( "" );
      cmbavPrio.addItem("1", httpContext.getMessage( "Maxima", ""), (short)(0));
      cmbavPrio.addItem("0", httpContext.getMessage( "Minima", ""), (short)(0));
      if ( cmbavPrio.getItemCount() > 0 )
      {
         AV83PRIO = cmbavPrio.getValidValue(AV83PRIO) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV83PRIO", AV83PRIO);
      }
      cmbavF_header.setName( "vF_HEADER" );
      cmbavF_header.setWebtags( "" );
      cmbavF_header.addItem("1", httpContext.getMessage( "Formato Inicial", ""), (short)(0));
      cmbavF_header.addItem("2", httpContext.getMessage( "Formato Novo", ""), (short)(0));
      if ( cmbavF_header.getItemCount() > 0 )
      {
         AV29F_header = (byte)(GXutil.lval( cmbavF_header.getValidValue(GXutil.trim( GXutil.str( AV29F_header, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29F_header", GXutil.str( AV29F_header, 1, 0));
      }
      cmbavAgr_fases.setName( "vAGR_FASES" );
      cmbavAgr_fases.setWebtags( "" );
      cmbavAgr_fases.addItem("1", httpContext.getMessage( "Agrupaçao Fases", ""), (short)(0));
      cmbavAgr_fases.addItem("2", httpContext.getMessage( "Agrupaçao + Detalle Fases ", ""), (short)(0));
      cmbavAgr_fases.addItem("3", httpContext.getMessage( "Detalle Fases", ""), (short)(0));
      if ( cmbavAgr_fases.getItemCount() > 0 )
      {
         AV6Agr_Fases = (byte)(GXutil.lval( cmbavAgr_fases.getValidValue(GXutil.trim( GXutil.str( AV6Agr_Fases, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Agr_Fases", GXutil.str( AV6Agr_Fases, 1, 0));
      }
      chkavVersumlin.setName( "vVERSUMLIN" );
      chkavVersumlin.setWebtags( "" );
      chkavVersumlin.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavVersumlin.getInternalname(), "TitleCaption", chkavVersumlin.getCaption(), true);
      chkavVersumlin.setCheckedValue( "0" );
      AV101VerSumLin = (byte)(((GXutil.strcmp(GXutil.ltrim( localUtil.ntoc( AV101VerSumLin, (byte)(1), (byte)(0), ".", "")), "1")==0) ? 1 : 0)) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV101VerSumLin", GXutil.str( AV101VerSumLin, 1, 0));
      chkavMail.setName( "vMAIL" );
      chkavMail.setWebtags( "" );
      chkavMail.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavMail.getInternalname(), "TitleCaption", chkavMail.getCaption(), true);
      chkavMail.setCheckedValue( "N" );
      AV65Mail = ((GXutil.strcmp(GXutil.rtrim( AV65Mail), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV65Mail", AV65Mail);
      chkavOpi.setName( "vOPI" );
      chkavOpi.setWebtags( "" );
      chkavOpi.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOpi.getInternalname(), "TitleCaption", chkavOpi.getCaption(), true);
      chkavOpi.setCheckedValue( "N" );
      AV74Opi = ((GXutil.strcmp(GXutil.rtrim( AV74Opi), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV74Opi", AV74Opi);
      GXCCtl = "vOP_" + sGXsfl_73_idx ;
      chkavOp.setName( GXCCtl );
      chkavOp.setWebtags( "" );
      chkavOp.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavOp.getInternalname(), "TitleCaption", chkavOp.getCaption(), !bGXsfl_73_Refreshing);
      chkavOp.setCheckedValue( "N" );
      AV112Op = ((GXutil.strcmp(GXutil.rtrim( AV112Op), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavOp.getInternalname(), AV112Op);
      GXCCtl = "FACEST_" + sGXsfl_73_idx ;
      cmbFacEst.setName( GXCCtl );
      cmbFacEst.setWebtags( "" );
      cmbFacEst.addItem("0", httpContext.getMessage( "Gerada", ""), (short)(0));
      cmbFacEst.addItem("1", httpContext.getMessage( "Impresso", ""), (short)(0));
      cmbFacEst.addItem("2", httpContext.getMessage( "Atualizada", ""), (short)(0));
      if ( cmbFacEst.getItemCount() > 0 )
      {
         A435FacEst = (byte)(GXutil.lval( cmbFacEst.getValidValue(GXutil.trim( GXutil.str( A435FacEst, 1, 0))))) ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV81PCLI',fld:'vPCLI',pic:'ZZZZZ9'},{av:'AV94UCLI',fld:'vUCLI',pic:'ZZZZZ9'},{av:'AV77PAlbFch',fld:'vPALBFCH',pic:''},{av:'AV93UAlbFch',fld:'vUALBFCH',pic:''},{av:'cmbavFacest'},{av:'AV31FacEst',fld:'vFACEST',pic:'9'},{av:'cmbavPrio'},{av:'AV83PRIO',fld:'vPRIO',pic:''},{av:'AV91UALB',fld:'vUALB',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV101VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'AV65Mail',fld:'vMAIL',pic:''},{av:'AV74Opi',fld:'vOPI',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID1.LOAD","{handler:'e16BB2',iparms:[{av:'A10050Cliemf',fld:'CLIEMF',pic:''}]");
      setEventMetadata("GRID1.LOAD",",oparms:[{av:'AV112Op',fld:'vOP',pic:'@!'},{av:'AV14Cliemf',fld:'vCLIEMF',pic:''}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE","{handler:'e11BB2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV81PCLI',fld:'vPCLI',pic:'ZZZZZ9'},{av:'AV94UCLI',fld:'vUCLI',pic:'ZZZZZ9'},{av:'AV77PAlbFch',fld:'vPALBFCH',pic:''},{av:'AV93UAlbFch',fld:'vUALBFCH',pic:''},{av:'cmbavFacest'},{av:'AV31FacEst',fld:'vFACEST',pic:'9'},{av:'cmbavPrio'},{av:'AV83PRIO',fld:'vPRIO',pic:''},{av:'AV91UALB',fld:'vUALB',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV101VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'AV65Mail',fld:'vMAIL',pic:''},{av:'AV74Opi',fld:'vOPI',pic:''},{av:'Grid1paginationbar_Selectedpage',ctrl:'GRID1PAGINATIONBAR',prop:'SelectedPage'},{av:'AV107Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV107Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12BB2',iparms:[{av:'GRID1_nFirstRecordOnPage'},{av:'GRID1_nEOF'},{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV81PCLI',fld:'vPCLI',pic:'ZZZZZ9'},{av:'AV94UCLI',fld:'vUCLI',pic:'ZZZZZ9'},{av:'AV77PAlbFch',fld:'vPALBFCH',pic:''},{av:'AV93UAlbFch',fld:'vUALBFCH',pic:''},{av:'cmbavFacest'},{av:'AV31FacEst',fld:'vFACEST',pic:'9'},{av:'cmbavPrio'},{av:'AV83PRIO',fld:'vPRIO',pic:''},{av:'AV91UALB',fld:'vUALB',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV101VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'AV65Mail',fld:'vMAIL',pic:''},{av:'AV74Opi',fld:'vOPI',pic:''},{av:'Grid1paginationbar_Rowsperpageselectedvalue',ctrl:'GRID1PAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRID1PAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid1_Rows',ctrl:'GRID1',prop:'Rows'},{av:'AV107Grid1CurrentPage',fld:'vGRID1CURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOMARCARTODAS'","{handler:'e17BB1',iparms:[{av:'AV65Mail',fld:'vMAIL',pic:''},{av:'A10050Cliemf',fld:'CLIEMF',pic:''}]");
      setEventMetadata("'DOMARCARTODAS'",",oparms:[{av:'AV112Op',fld:'vOP',pic:'@!'}]}");
      setEventMetadata("'DODESMARCARTODAS'","{handler:'e18BB1',iparms:[]");
      setEventMetadata("'DODESMARCARTODAS'",",oparms:[{av:'AV112Op',fld:'vOP',pic:'@!'}]}");
      setEventMetadata("'DOIMPRIMIR'","{handler:'e13BB2',iparms:[{av:'AV74Opi',fld:'vOPI',pic:''},{av:'AV112Op',fld:'vOP',grid:73,pic:'@!'},{av:'GRID1_nFirstRecordOnPage'},{av:'nRC_GXsfl_73',ctrl:'GRID1',grid:73,prop:'GridRC',grid:73},{av:'AV21Copias2',fld:'vCOPIAS2',pic:'Z9'},{av:'AV19Copia',fld:'vCOPIA',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',grid:73,pic:'ZZZZZZZ9'},{av:'AV40ImpCod',fld:'vIMPCOD',pic:'@!'},{av:'AV99ValEuro',fld:'vVALEURO',pic:'ZZZ9.999'},{av:'cmbavF_header'},{av:'AV29F_header',fld:'vF_HEADER',pic:'9'},{av:'cmbavAgr_fases'},{av:'AV6Agr_Fases',fld:'vAGR_FASES',pic:'9'},{av:'AV101VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99'}]");
      setEventMetadata("'DOIMPRIMIR'",",oparms:[{av:'AV101VerSumLin',fld:'vVERSUMLIN',pic:'9'},{av:'cmbavAgr_fases'},{av:'AV6Agr_Fases',fld:'vAGR_FASES',pic:'9'},{av:'cmbavF_header'},{av:'AV29F_header',fld:'vF_HEADER',pic:'9'},{av:'AV99ValEuro',fld:'vVALEURO',pic:'ZZZ9.999'},{av:'AV40ImpCod',fld:'vIMPCOD',pic:'@!'},{av:'A430FacCod',fld:'FACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A9606FacHor',fld:'FACHOR',pic:'99/99/99 99:99'}]}");
      setEventMetadata("VALIDV_FACEST","{handler:'validv_Facest',iparms:[]");
      setEventMetadata("VALIDV_FACEST",",oparms:[]}");
      setEventMetadata("VALIDV_PRIO","{handler:'validv_Prio',iparms:[]");
      setEventMetadata("VALIDV_PRIO",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Cliemf',iparms:[]");
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
      Grid1paginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV77PAlbFch = GXutil.nullDate() ;
      AV93UAlbFch = GXutil.nullDate() ;
      AV83PRIO = "" ;
      A396EmprCod = "" ;
      AV65Mail = "" ;
      AV74Opi = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A10050Cliemf = "" ;
      AV19Copia = new String[4] ;
      GX_I = 1 ;
      while ( GX_I <= 4 )
      {
         AV19Copia[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV40ImpCod = "" ;
      AV99ValEuro = DecimalUtil.ZERO ;
      A9606FacHor = GXutil.resetTime( GXutil.nullDate() );
      Grid1_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      Grid1Container = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGrid1paginationbar = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      ucGrid1_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV112Op = "" ;
      A436FacFch = GXutil.nullDate() ;
      A279CliNom = "" ;
      AV14Cliemf = "" ;
      scmdbuf = "" ;
      H00BB2_A396EmprCod = new String[] {""} ;
      H00BB2_A435FacEst = new byte[1] ;
      H00BB2_A450FacPri = new String[] {""} ;
      H00BB2_A1153FacTipFac = new byte[1] ;
      H00BB2_A10050Cliemf = new String[] {""} ;
      H00BB2_A9606FacHor = new java.util.Date[] {GXutil.nullDate()} ;
      H00BB2_A279CliNom = new String[] {""} ;
      H00BB2_A252CliCod = new int[1] ;
      H00BB2_A436FacFch = new java.util.Date[] {GXutil.nullDate()} ;
      H00BB2_A430FacCod = new int[1] ;
      A450FacPri = "" ;
      H00BB3_AGRID1_nRecordCount = new long[1] ;
      AV86Station = "" ;
      AV25EmprNom = "" ;
      AV98UsurCod = "" ;
      AV67ManAut = "" ;
      GXt_char1 = "" ;
      AV24EmprCod = "" ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      Grid1Row = new com.genexus.webpanels.GXWebRow();
      AV75Outputi = "" ;
      AV88TextoCopia = "" ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_dtime6 = new java.util.Date[1] ;
      bttBtnmarcartodas_Jsonclick = "" ;
      bttBtndesmarcartodas_Jsonclick = "" ;
      bttBtnimprimir_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid1_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      Grid1Column = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwfatmod__default(),
         new Object[] {
             new Object[] {
            H00BB2_A396EmprCod, H00BB2_A435FacEst, H00BB2_A450FacPri, H00BB2_A1153FacTipFac, H00BB2_A10050Cliemf, H00BB2_A9606FacHor, H00BB2_A279CliNom, H00BB2_A252CliCod, H00BB2_A436FacFch, H00BB2_A430FacCod
            }
            , new Object[] {
            H00BB3_AGRID1_nRecordCount
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavCliemf_Enabled = 0 ;
   }

   private byte GRID1_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV31FacEst ;
   private byte AV101VerSumLin ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV29F_header ;
   private byte AV6Agr_Fases ;
   private byte AV21Copias2 ;
   private byte A435FacEst ;
   private byte nDonePA ;
   private byte subGrid1_Backcolorstyle ;
   private byte A1153FacTipFac ;
   private byte AV20Copias ;
   private byte AV39i ;
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
   private int Grid1paginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_73 ;
   private int subGrid1_Rows ;
   private int nGXsfl_73_idx=1 ;
   private int AV81PCLI ;
   private int AV94UCLI ;
   private int AV91UALB ;
   private int Grid1paginationbar_Pagestoshow ;
   private int edtavPcli_Enabled ;
   private int edtavUcli_Enabled ;
   private int edtavPalbfch_Enabled ;
   private int edtavUalbfch_Enabled ;
   private int edtavCopias2_Enabled ;
   private int edtavGrid1currentpage_Visible ;
   private int A430FacCod ;
   private int A252CliCod ;
   private int subGrid1_Islastpage ;
   private int edtavCliemf_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV76PALB ;
   private int AV106PageToGo ;
   private int nGXsfl_73_fel_idx=1 ;
   private int GXv_int5[] ;
   private int idxLst ;
   private int subGrid1_Backcolor ;
   private int subGrid1_Allbackcolor ;
   private int edtavCliemf_Visible ;
   private int subGrid1_Titlebackcolor ;
   private int subGrid1_Selectedindex ;
   private int subGrid1_Selectioncolor ;
   private int subGrid1_Hoveringcolor ;
   private int GX_I ;
   private long GRID1_nFirstRecordOnPage ;
   private long AV108Grid1PageCount ;
   private long AV107Grid1CurrentPage ;
   private long GRID1_nCurrentRecord ;
   private long GRID1_nRecordCount ;
   private java.math.BigDecimal AV99ValEuro ;
   private String Grid1paginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_73_idx="0001" ;
   private String AV83PRIO ;
   private String A396EmprCod ;
   private String AV65Mail ;
   private String AV74Opi ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A10050Cliemf ;
   private String AV19Copia[] ;
   private String AV40ImpCod ;
   private String Grid1paginationbar_Class ;
   private String Grid1paginationbar_Pagingbuttonsposition ;
   private String Grid1paginationbar_Pagingcaptionposition ;
   private String Grid1paginationbar_Emptygridclass ;
   private String Grid1paginationbar_Rowsperpageoptions ;
   private String Grid1paginationbar_Previous ;
   private String Grid1paginationbar_Next ;
   private String Grid1paginationbar_Caption ;
   private String Grid1paginationbar_Emptygridcaption ;
   private String Grid1paginationbar_Rowsperpagecaption ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Grid1_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavPcli_Internalname ;
   private String TempTags ;
   private String edtavPcli_Jsonclick ;
   private String edtavUcli_Internalname ;
   private String edtavUcli_Jsonclick ;
   private String edtavPalbfch_Internalname ;
   private String edtavPalbfch_Jsonclick ;
   private String edtavUalbfch_Internalname ;
   private String edtavUalbfch_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavCopias2_Internalname ;
   private String edtavCopias2_Jsonclick ;
   private String divGrid1tablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid1_Internalname ;
   private String Grid1paginationbar_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGrid1currentpage_Internalname ;
   private String edtavGrid1currentpage_Jsonclick ;
   private String Grid1_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV112Op ;
   private String edtFacCod_Internalname ;
   private String edtFacFch_Internalname ;
   private String edtCliCod_Internalname ;
   private String A279CliNom ;
   private String edtCliNom_Internalname ;
   private String AV14Cliemf ;
   private String edtavCliemf_Internalname ;
   private String scmdbuf ;
   private String A450FacPri ;
   private String AV86Station ;
   private String AV25EmprNom ;
   private String AV98UsurCod ;
   private String AV67ManAut ;
   private String GXt_char1 ;
   private String AV24EmprCod ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String AV75Outputi ;
   private String sGXsfl_73_fel_idx="0001" ;
   private String AV88TextoCopia ;
   private String GXv_char4[] ;
   private String tblUnnamedtable2_Internalname ;
   private String bttBtnmarcartodas_Internalname ;
   private String bttBtnmarcartodas_Jsonclick ;
   private String bttBtndesmarcartodas_Internalname ;
   private String bttBtndesmarcartodas_Jsonclick ;
   private String bttBtnimprimir_Internalname ;
   private String bttBtnimprimir_Jsonclick ;
   private String subGrid1_Class ;
   private String subGrid1_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtFacCod_Jsonclick ;
   private String edtFacFch_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String edtavCliemf_Jsonclick ;
   private String subGrid1_Header ;
   private java.util.Date A9606FacHor ;
   private java.util.Date GXv_dtime6[] ;
   private java.util.Date AV77PAlbFch ;
   private java.util.Date AV93UAlbFch ;
   private java.util.Date A436FacFch ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Grid1paginationbar_Showfirst ;
   private boolean Grid1paginationbar_Showprevious ;
   private boolean Grid1paginationbar_Shownext ;
   private boolean Grid1paginationbar_Showlast ;
   private boolean Grid1paginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_73_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean AV104AplicarConfirmar ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid Grid1Container ;
   private com.genexus.webpanels.GXWebRow Grid1Row ;
   private com.genexus.webpanels.GXWebColumn Grid1Column ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucGrid1paginationbar ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGrid1_empowerer ;
   private HTMLChoice cmbavFacest ;
   private HTMLChoice cmbavPrio ;
   private HTMLChoice cmbavF_header ;
   private HTMLChoice cmbavAgr_fases ;
   private ICheckbox chkavVersumlin ;
   private ICheckbox chkavMail ;
   private ICheckbox chkavOpi ;
   private ICheckbox chkavOp ;
   private HTMLChoice cmbFacEst ;
   private IDataStoreProvider pr_default ;
   private String[] H00BB2_A396EmprCod ;
   private byte[] H00BB2_A435FacEst ;
   private String[] H00BB2_A450FacPri ;
   private byte[] H00BB2_A1153FacTipFac ;
   private String[] H00BB2_A10050Cliemf ;
   private java.util.Date[] H00BB2_A9606FacHor ;
   private String[] H00BB2_A279CliNom ;
   private int[] H00BB2_A252CliCod ;
   private java.util.Date[] H00BB2_A436FacFch ;
   private int[] H00BB2_A430FacCod ;
   private long[] H00BB3_AGRID1_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwfatmod__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00BB2", "SELECT T1.EmprCod, T1.FacEst, T1.FacPri, T1.FacTipFac, T2.Cliemf, T1.FacHor, T2.CliNom, T1.CliCod, T1.FacFch, T1.FacCod FROM (TXPCFAVEN T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.FacEst = ? and T1.FacCod >= ?) AND (T1.FacFch >= ?) AND (T1.FacFch <= ?) AND (T1.CliCod >= ?) AND (T1.CliCod <= ?) AND (T1.FacPri = ?) AND (T1.FacTipFac = 0) AND (T1.FacCod <= ?) ORDER BY T1.EmprCod, T1.FacEst, T1.FacCod  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BB3", "SELECT COUNT(*) FROM (TXPCFAVEN T1 INNER JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) WHERE (T1.EmprCod = ? and T1.FacEst = ? and T1.FacCod >= ?) AND (T1.FacFch >= ?) AND (T1.FacFch <= ?) AND (T1.CliCod >= ?) AND (T1.CliCod <= ?) AND (T1.FacPri = ?) AND (T1.FacTipFac = 0) AND (T1.FacCod <= ?) ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((java.util.Date[]) buf[5])[0] = rslt.getGXDateTime(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 30);
               ((int[]) buf[7])[0] = rslt.getInt(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDate(9);
               ((int[]) buf[9])[0] = rslt.getInt(10);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               stmt.setInt(11, ((Number) parms[10]).intValue());
               stmt.setInt(12, ((Number) parms[11]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setByte(2, ((Number) parms[1]).byteValue());
               stmt.setInt(3, ((Number) parms[2]).intValue());
               stmt.setDate(4, (java.util.Date)parms[3]);
               stmt.setDate(5, (java.util.Date)parms[4]);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setString(8, (String)parms[7], 1);
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
      }
   }

}

