package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webdatoshdr_impl extends GXDataArea
{
   public webdatoshdr_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webdatoshdr_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webdatoshdr_impl.class ));
   }

   public webdatoshdr_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavBarfasest = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodN10( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"vMAQCOD") == 0 )
         {
            A13734MaqCDsc = httpContext.GetPar( "MaqCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgvvmaqcodN10( A13734MaqCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"vMAQCOD") == 0 )
         {
            hV9MaqCod = httpContext.GetPar( "hV9MaqCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcvvmaqcodN12( hV9MaqCod) ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Emprcod") ;
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
            AV5Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
               AV7Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
               AV8Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
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
      nRC_GXsfl_215 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_215"))) ;
      nGXsfl_215_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_215_idx"))) ;
      sGXsfl_215_idx = httpContext.GetPar( "sGXsfl_215_idx") ;
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
      A119BarAgrCod = (int)(GXutil.lval( httpContext.GetPar( "BarAgrCod"))) ;
      A124BarAgrReo = (byte)(GXutil.lval( httpContext.GetPar( "BarAgrReo"))) ;
      A122BarAgrPar = httpContext.GetPar( "BarAgrPar") ;
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV7Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV8Barcodpar = httpContext.GetPar( "Barcodpar") ;
      A13695BarAGrHdr = httpContext.GetPar( "BarAGrHdr") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, A13695BarAGrHdr) ;
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
      paN12( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startN12( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webdatoshdr", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8Barcodpar))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar"}) +"\">") ;
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
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_215", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_215, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV41GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLINMAQ", GXutil.ltrim( localUtil.ntoc( A2804RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECACAB", GXutil.rtrim( A6039RecAcab));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASDTI", localUtil.ttoc( A4442BarFasDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "CLICOD", GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARENCCLI", GXutil.rtrim( A4812BarEncCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFECFPR", localUtil.dtoc( A158BarFecFpr, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGM", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECTOTKGM", GXutil.ltrim( localUtil.ntoc( A812RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOMCLI", GXutil.rtrim( A1234BarNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMAQCOD", GXutil.rtrim( A180BarMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARRGB", GXutil.ltrim( localUtil.ntoc( A13234BarRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOTLIN", GXutil.ltrim( localUtil.ntoc( A188BarNotLin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNOTDSC", GXutil.rtrim( A187BarNotDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV11Reclinmaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV15UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV13Station));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vOBJETO", AV51Objeto);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vOBJETO", AV51Objeto);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCvMAQCOD", GXutil.rtrim( AV9MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRCOD", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRREO", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRPAR", GXutil.rtrim( A122BarAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRHDR", GXutil.rtrim( A13695BarAGrHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Width", GXutil.rtrim( Dvpanel_unnamedtable4_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable4_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable4_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Cls", GXutil.rtrim( Dvpanel_unnamedtable4_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Title", GXutil.rtrim( Dvpanel_unnamedtable4_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable4_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable4_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable4_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE4_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable4_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Title", GXutil.rtrim( Dvelop_confirmpanel_btncambiarmaquina_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btncambiarmaquina_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btncambiarmaquina_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btncambiarmaquina_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btncambiarmaquina_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btncambiarmaquina_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btncambiarmaquina_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Title", GXutil.rtrim( Dvelop_confirmpanel_btneliminarmaquina_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btneliminarmaquina_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminarmaquina_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminarmaquina_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminarmaquina_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btneliminarmaquina_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btneliminarmaquina_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Result", GXutil.rtrim( Dvelop_confirmpanel_btncambiarmaquina_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminarmaquina_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Result", GXutil.rtrim( Dvelop_confirmpanel_btncambiarmaquina_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminarmaquina_Result));
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
         weN12( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtN12( ) ;
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
      return formatLink("app.webdatoshdr", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8Barcodpar))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar"})  ;
   }

   public String getPgmname( )
   {
      return "WebDatosHdr" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Datos Hdr", "") ;
   }

   public void wbN10( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable17_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcod_Internalname, httpContext.getMessage( "Hdr", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcod_Internalname, GXutil.ltrim( localUtil.ntoc( AV6Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6Barcod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6Barcod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodreo_Internalname, httpContext.getMessage( "R", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodreo_Internalname, GXutil.ltrim( localUtil.ntoc( AV7Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7Barcodreo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV7Barcodreo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodreo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodreo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcodpar_Internalname, httpContext.getMessage( "P", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcodpar_Internalname, GXutil.rtrim( AV8Barcodpar), GXutil.rtrim( localUtil.format( AV8Barcodpar, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcodpar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarcodpar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable18_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTexto1_Internalname, lblTexto1_Caption, "", "", lblTexto1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "font-size:"+GXutil.str( lblTexto1_Fontsize, 3, 0)+"pt;"+((lblTexto1_Fontbold==1) ? "font-weight:bold;" : "font-weight:normal;")+"color:"+WebUtils.getHTMLColor( lblTexto1_Forecolor)+";"+((lblTexto1_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( lblTexto1_Backcolor)+";"), "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable14_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarmaqcod_Internalname, httpContext.getMessage( "Maquina Actual", ""), "", "", lblTextblockbarmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarmaqcod_Internalname, httpContext.getMessage( "Bar Maq Cod", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarmaqcod_Internalname, GXutil.rtrim( AV10BarMaqCod), GXutil.rtrim( localUtil.format( AV10BarMaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarmaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarmaqcod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable15_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqcod_Internalname, httpContext.getMessage( "Maquina Nueva", ""), "", "", lblTextblockmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqcod_Internalname, httpContext.getMessage( "Maq Cod", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqcod_Internalname, hV9MaqCod, GXutil.rtrim( localUtil.format( hV9MaqCod, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqcod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqcod_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(0), (byte)(0), true, "", "left", true, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable16_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncambiarmaquina_Internalname, "gx.evt.setGridEvt("+GXutil.str( 215, 3, 0)+","+"null"+");", httpContext.getMessage( "Cambiar Maquina", ""), bttBtncambiarmaquina_Jsonclick, 7, httpContext.getMessage( "Cambiar Maquina", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11n11_client"+"'", TempTags, "", 2, "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarmaquina_Internalname, "gx.evt.setGridEvt("+GXutil.str( 215, 3, 0)+","+"null"+");", httpContext.getMessage( "Eliminar Maquina", ""), bttBtneliminarmaquina_Jsonclick, 7, httpContext.getMessage( "Eliminar Maquina", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e12n11_client"+"'", TempTags, "", 2, "HLP_WebDatosHdr.htm");
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
         wb_table1_71_N12( true) ;
      }
      else
      {
         wb_table1_71_N12( false) ;
      }
      return  ;
   }

   public void wb_table1_71_N12e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_unnamedtable4.setProperty("Width", Dvpanel_unnamedtable4_Width);
         ucDvpanel_unnamedtable4.setProperty("AutoWidth", Dvpanel_unnamedtable4_Autowidth);
         ucDvpanel_unnamedtable4.setProperty("AutoHeight", Dvpanel_unnamedtable4_Autoheight);
         ucDvpanel_unnamedtable4.setProperty("Cls", Dvpanel_unnamedtable4_Cls);
         ucDvpanel_unnamedtable4.setProperty("Title", Dvpanel_unnamedtable4_Title);
         ucDvpanel_unnamedtable4.setProperty("Collapsible", Dvpanel_unnamedtable4_Collapsible);
         ucDvpanel_unnamedtable4.setProperty("Collapsed", Dvpanel_unnamedtable4_Collapsed);
         ucDvpanel_unnamedtable4.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable4_Showcollapseicon);
         ucDvpanel_unnamedtable4.setProperty("IconPosition", Dvpanel_unnamedtable4_Iconposition);
         ucDvpanel_unnamedtable4.setProperty("AutoScroll", Dvpanel_unnamedtable4_Autoscroll);
         ucDvpanel_unnamedtable4.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable4_Internalname, "DVPANEL_UNNAMEDTABLE4Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE4Container"+"UnnamedTable4"+"\" style=\"display:none;\">") ;
         wb_table2_95_N12( true) ;
      }
      else
      {
         wb_table2_95_N12( false) ;
      }
      return  ;
   }

   public void wb_table2_95_N12e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol215( ) ;
      }
      if ( wbEnd == 215 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_215 = (int)(nGXsfl_215_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucGridpaginationbar.setProperty("Class", Gridpaginationbar_Class);
         ucGridpaginationbar.setProperty("ShowFirst", Gridpaginationbar_Showfirst);
         ucGridpaginationbar.setProperty("ShowPrevious", Gridpaginationbar_Showprevious);
         ucGridpaginationbar.setProperty("ShowNext", Gridpaginationbar_Shownext);
         ucGridpaginationbar.setProperty("ShowLast", Gridpaginationbar_Showlast);
         ucGridpaginationbar.setProperty("PagesToShow", Gridpaginationbar_Pagestoshow);
         ucGridpaginationbar.setProperty("PagingButtonsPosition", Gridpaginationbar_Pagingbuttonsposition);
         ucGridpaginationbar.setProperty("PagingCaptionPosition", Gridpaginationbar_Pagingcaptionposition);
         ucGridpaginationbar.setProperty("EmptyGridClass", Gridpaginationbar_Emptygridclass);
         ucGridpaginationbar.setProperty("RowsPerPageSelector", Gridpaginationbar_Rowsperpageselector);
         ucGridpaginationbar.setProperty("RowsPerPageOptions", Gridpaginationbar_Rowsperpageoptions);
         ucGridpaginationbar.setProperty("Previous", Gridpaginationbar_Previous);
         ucGridpaginationbar.setProperty("Next", Gridpaginationbar_Next);
         ucGridpaginationbar.setProperty("Caption", Gridpaginationbar_Caption);
         ucGridpaginationbar.setProperty("EmptyGridCaption", Gridpaginationbar_Emptygridcaption);
         ucGridpaginationbar.setProperty("RowsPerPageCaption", Gridpaginationbar_Rowsperpagecaption);
         ucGridpaginationbar.setProperty("CurrentPage", AV40GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV41GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 229,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV40GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV40GridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,229);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosHdr.htm");
         wb_table3_230_N12( true) ;
      }
      else
      {
         wb_table3_230_N12( false) ;
      }
      return  ;
   }

   public void wb_table3_230_N12e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_235_N12( true) ;
      }
      else
      {
         wb_table4_235_N12( false) ;
      }
      return  ;
   }

   public void wb_table4_235_N12e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 215 )
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

   public void startN12( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Datos Hdr", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupN10( ) ;
   }

   public void wsN12( )
   {
      startN12( ) ;
      evtN12( ) ;
   }

   public void evtN12( )
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
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13N12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14N12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e15N12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e16N12 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOOBSERVACIONES'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoObservaciones' */
                           e17N12 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_215_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_215_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_215_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_2152( ) ;
                           AV47BarEnccliAgr = httpContext.cgiGet( edtavBarenccliagr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarenccliagr_Internalname, AV47BarEnccliAgr);
                           AV37BarAGrHdr = httpContext.cgiGet( edtavBaragrhdr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBaragrhdr_Internalname, AV37BarAGrHdr);
                           AV44BarserAgr = httpContext.cgiGet( edtavBarseragr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarseragr_Internalname, AV44BarserAgr);
                           AV48BarSerDscAgr = httpContext.cgiGet( edtavBarserdscagr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarserdscagr_Internalname, AV48BarSerDscAgr);
                           AV49BarNomCliAgr = httpContext.cgiGet( edtavBarnomcliagr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarnomcliagr_Internalname, AV49BarNomCliAgr);
                           AV45BarColNomAgr = httpContext.cgiGet( edtavBarcolnomagr_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnomagr_Internalname, AV45BarColNomAgr);
                           AV42BarKgmAgr = localUtil.ctond( httpContext.cgiGet( edtavBarkgmagr_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarkgmagr_Internalname, GXutil.ltrimstr( AV42BarKgmAgr, 9, 2));
                           if ( ! httpContext.isAjaxRequest( ) )
                           {
                              GXCCtl = "GXHCvMAQCOD_" + sGXsfl_215_idx ;
                              AV9MaqCod = httpContext.cgiGet( GXCCtl) ;
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
                                 e18N12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e19N12 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e20N12 ();
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

   public void weN12( )
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

   public void paN12( )
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
            GX_FocusControl = edtavBarmaqcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxsgvvmaqcodN10( String A13734MaqCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgvvmaqcod_dataN10( A13734MaqCDsc) ;
      gxdynajaxindex = 1 ;
      while ( gxdynajaxindex <= gxdynajaxctrlcodr.getCount() )
      {
         addString( gxwrpcisep+"{\"c\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrlcodr.item(gxdynajaxindex))+"\",\"d\":\""+PrivateUtilities.encodeJSConstant( gxdynajaxctrldescr.item(gxdynajaxindex))+"\"}") ;
         gxdynajaxindex = (int)(gxdynajaxindex+1) ;
         gxwrpcisep = "," ;
      }
      addString( "]") ;
      if ( gxdynajaxctrlcodr.getCount() == 0 )
      {
         addString( ",101") ;
      }
      addString( "]") ;
   }

   protected void gxsgvvmaqcod_dataN10( String A13734MaqCDsc )
   {
      l13734MaqCDsc = GXutil.concat( GXutil.rtrim( A13734MaqCDsc), "%", "") ;
      /* Using cursor H00N12 */
      pr_default.execute(0, new Object[] {l13734MaqCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H00N12_A13734MaqCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13734MaqCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H00N12_A13734MaqCDsc[0]);
            gxdynajaxctrldescr.add(H00N12_A13734MaqCDsc[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcvvmaqcodN12( String A13734MaqCDsc )
   {
      /* Using cursor H00N13 */
      pr_default.execute(1, new Object[] {A13734MaqCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.strcmp(H00N13_A13734MaqCDsc[0], A13734MaqCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13734MaqCDsc = H00N13_A13734MaqCDsc[0] ;
            A396EmprCod = H00N13_A396EmprCod[0] ;
            A602MaqCod = H00N13_A602MaqCod[0] ;
         }
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A602MaqCod))+"\"") ;
      addString( "]") ;
      if ( gxhchits > 1 )
      {
         addString( ",") ;
         addString( "\"ambiguousck\"") ;
      }
      if ( gxhchits == 0 )
      {
         addString( ",") ;
         addString( "101") ;
      }
      addString( "]") ;
      pr_default.close(1);
   }

   public void gxnrgrid_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_2152( ) ;
      while ( nGXsfl_215_idx <= nRC_GXsfl_215 )
      {
         sendrow_2152( ) ;
         nGXsfl_215_idx = ((subGrid_Islastpage==1)&&(nGXsfl_215_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_215_idx+1) ;
         sGXsfl_215_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_215_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2152( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 int A119BarAgrCod ,
                                 byte A124BarAgrReo ,
                                 String A122BarAgrPar ,
                                 String AV5Emprcod ,
                                 int AV6Barcod ,
                                 byte AV7Barcodreo ,
                                 String AV8Barcodpar ,
                                 String A13695BarAGrHdr )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e19N12 ();
      GRID_nCurrentRecord = 0 ;
      rfN12( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
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
      if ( cmbavBarfasest.getItemCount() > 0 )
      {
         AV18BarFasEst = (byte)(GXutil.lval( cmbavBarfasest.getValidValue(GXutil.trim( GXutil.str( AV18BarFasEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarFasEst", GXutil.str( AV18BarFasEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV18BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfN12( ) ;
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
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavBarmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmaqcod_Enabled), 5, 0), true);
      cmbavBarfasest.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarfecfpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecfpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecfpr_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavRectotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgm_Enabled), 5, 0), true);
      edtavDismemo1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDismemo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDismemo1_Enabled), 5, 0), true);
      edtavBarenccliagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccliagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccliagr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBaragrhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaragrhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrhdr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBarseragr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarseragr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarseragr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBarserdscagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdscagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdscagr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBarnomcliagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcliagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcliagr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBarcolnomagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnomagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnomagr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBarkgmagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgmagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmagr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
   }

   public void rfN12( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(215) ;
      /* Execute user event: Refresh */
      e19N12 ();
      nGXsfl_215_idx = 1 ;
      sGXsfl_215_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_215_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_2152( ) ;
      bGXsfl_215_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_2152( ) ;
         e20N12 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_215_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e20N12 ();
         }
         wbEnd = (short)(215) ;
         wbN10( ) ;
      }
      bGXsfl_215_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesN12( )
   {
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, A13695BarAGrHdr) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, A13695BarAGrHdr) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, A13695BarAGrHdr) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, A13695BarAGrHdr) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, A119BarAgrCod, A124BarAgrReo, A122BarAgrPar, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, A13695BarAGrHdr) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), true);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), true);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), true);
      edtavBarmaqcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmaqcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmaqcod_Enabled), 5, 0), true);
      cmbavBarfasest.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavBarenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccli_Enabled), 5, 0), true);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), true);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), true);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), true);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), true);
      edtavBarfecfpr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfecfpr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfecfpr_Enabled), 5, 0), true);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), true);
      edtavRectotkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRectotkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRectotkgm_Enabled), 5, 0), true);
      edtavDismemo1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDismemo1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDismemo1_Enabled), 5, 0), true);
      edtavBarenccliagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarenccliagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarenccliagr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBaragrhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaragrhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrhdr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBarseragr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarseragr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarseragr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBarserdscagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdscagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdscagr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBarnomcliagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcliagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcliagr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBarcolnomagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnomagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnomagr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      edtavBarkgmagr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgmagr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmagr_Enabled), 5, 0), !bGXsfl_215_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupN10( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e18N12 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_215 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_215"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV41GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Dvpanel_unnamedtable4_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Width") ;
         Dvpanel_unnamedtable4_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autowidth")) ;
         Dvpanel_unnamedtable4_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoheight")) ;
         Dvpanel_unnamedtable4_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Cls") ;
         Dvpanel_unnamedtable4_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Title") ;
         Dvpanel_unnamedtable4_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsible")) ;
         Dvpanel_unnamedtable4_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Collapsed")) ;
         Dvpanel_unnamedtable4_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Showcollapseicon")) ;
         Dvpanel_unnamedtable4_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Iconposition") ;
         Dvpanel_unnamedtable4_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE4_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( "GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( "GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( "GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( "GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Dvelop_confirmpanel_btncambiarmaquina_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Title") ;
         Dvelop_confirmpanel_btncambiarmaquina_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Confirmationtext") ;
         Dvelop_confirmpanel_btncambiarmaquina_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btncambiarmaquina_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Nobuttoncaption") ;
         Dvelop_confirmpanel_btncambiarmaquina_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btncambiarmaquina_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Yesbuttonposition") ;
         Dvelop_confirmpanel_btncambiarmaquina_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Confirmtype") ;
         Dvelop_confirmpanel_btneliminarmaquina_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Title") ;
         Dvelop_confirmpanel_btneliminarmaquina_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Confirmationtext") ;
         Dvelop_confirmpanel_btneliminarmaquina_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btneliminarmaquina_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Nobuttoncaption") ;
         Dvelop_confirmpanel_btneliminarmaquina_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btneliminarmaquina_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Yesbuttonposition") ;
         Dvelop_confirmpanel_btneliminarmaquina_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_btncambiarmaquina_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA_Result") ;
         Dvelop_confirmpanel_btneliminarmaquina_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA_Result") ;
         /* Read variables values. */
         AV6Barcod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
         AV7Barcodreo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
         AV8Barcodpar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
         AV10BarMaqCod = httpContext.cgiGet( edtavBarmaqcod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarMaqCod", AV10BarMaqCod);
         hV9MaqCod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
         if ( (GXutil.strcmp("", hV9MaqCod)==0) )
         {
            AV9MaqCod = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "AV9MaqCod", AV9MaqCod);
         }
         else
         {
            A13734MaqCDsc = hV9MaqCod ;
            /* Using cursor H00N14 */
            pr_default.execute(2, new Object[] {A13734MaqCDsc});
            AV9MaqCod = H00N14_A602MaqCod[0] ;
            if ( ! ( (pr_default.getStatus(2) == 101) ) )
            {
               pr_default.readNext(2);
               if ( ! ( (pr_default.getStatus(2) == 101) ) )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
                  GX_FocusControl = edtavMaqcod_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
            }
            pr_default.close(2);
         }
         httpContext.ajax_rsp_assign_attri("", false, "hV9MaqCod", hV9MaqCod);
         cmbavBarfasest.setName( cmbavBarfasest.getInternalname() );
         cmbavBarfasest.setValue( httpContext.cgiGet( cmbavBarfasest.getInternalname()) );
         AV18BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbavBarfasest.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarFasEst", GXutil.str( AV18BarFasEst, 1, 0));
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavBarfasdti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vBARFASDTI");
            GX_FocusControl = edtavBarfasdti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV19BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarFasDTI", localUtil.ttoc( AV19BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV19BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtavBarfasdti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV19BarFasDTI", localUtil.ttoc( AV19BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICOD");
            GX_FocusControl = edtavClicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20CliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20CliCod), 6, 0));
         }
         else
         {
            AV20CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20CliCod), 6, 0));
         }
         AV29CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29CliNom", AV29CliNom);
         AV28BarEncCli = httpContext.cgiGet( edtavBarenccli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28BarEncCli", AV28BarEncCli);
         AV26BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26BarColNom", AV26BarColNom);
         AV27BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27BarNomCli", AV27BarNomCli);
         AV24BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24BarSer", AV24BarSer);
         AV25BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25BarSerDsc", AV25BarSerDsc);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavBarfecfpr_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vBARFECFPR");
            GX_FocusControl = edtavBarfecfpr_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23BarFecFpr = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23BarFecFpr", localUtil.format(AV23BarFecFpr, "99/99/99"));
         }
         else
         {
            AV23BarFecFpr = localUtil.ctod( httpContext.cgiGet( edtavBarfecfpr_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23BarFecFpr", localUtil.format(AV23BarFecFpr, "99/99/99"));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM");
            GX_FocusControl = edtavBarkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV21BarKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21BarKgm", GXutil.ltrimstr( AV21BarKgm, 9, 2));
         }
         else
         {
            AV21BarKgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV21BarKgm", GXutil.ltrimstr( AV21BarKgm, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)), DecimalUtil.stringToDec("9999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECTOTKGM");
            GX_FocusControl = edtavRectotkgm_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22RecTotKgm = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22RecTotKgm", GXutil.ltrimstr( AV22RecTotKgm, 10, 2));
         }
         else
         {
            AV22RecTotKgm = localUtil.ctond( httpContext.cgiGet( edtavRectotkgm_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22RecTotKgm", GXutil.ltrimstr( AV22RecTotKgm, 10, 2));
         }
         AV50DisMemo1 = httpContext.cgiGet( edtavDismemo1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50DisMemo1", AV50DisMemo1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDCURRENTPAGE");
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV40GridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
         }
         else
         {
            AV40GridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
         }
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
      e18N12 ();
      if (returnInSub) return;
   }

   public void e18N12( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV13Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webdatoshdr_impl.this.GXt_char1 = GXv_char2[0] ;
      AV13Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char4[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char2, GXv_char3, GXv_char4) ;
      webdatoshdr_impl.this.AV5Emprcod = GXv_char2[0] ;
      webdatoshdr_impl.this.AV14EmprNom = GXv_char3[0] ;
      webdatoshdr_impl.this.AV15UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      /* Execute user subroutine: 'BARCAD' */
      S112 ();
      if (returnInSub) return;
      GXt_char1 = AV13Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webdatoshdr_impl.this.GXt_char1 = GXv_char4[0] ;
      AV13Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
      GXv_char4[0] = AV5Emprcod ;
      GXv_char3[0] = AV14EmprNom ;
      GXv_char2[0] = AV15UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV13Station, GXv_char4, GXv_char3, GXv_char2) ;
      webdatoshdr_impl.this.AV5Emprcod = GXv_char4[0] ;
      webdatoshdr_impl.this.AV14EmprNom = GXv_char3[0] ;
      webdatoshdr_impl.this.AV15UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV40GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
      edtavGridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridcurrentpage_Visible), 5, 0), true);
      AV41GridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41GridPageCount), 10, 0));
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e19N12( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
   }

   private void e20N12( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Using cursor H00N15 */
      pr_default.execute(3, new Object[] {AV5Emprcod, Integer.valueOf(AV6Barcod), Byte.valueOf(AV7Barcodreo), AV8Barcodpar});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A130BarCodPar = H00N15_A130BarCodPar[0] ;
         A132BarCodReo = H00N15_A132BarCodReo[0] ;
         A129BarCod = H00N15_A129BarCod[0] ;
         A396EmprCod = H00N15_A396EmprCod[0] ;
         A122BarAgrPar = H00N15_A122BarAgrPar[0] ;
         A124BarAgrReo = H00N15_A124BarAgrReo[0] ;
         A119BarAgrCod = H00N15_A119BarAgrCod[0] ;
         A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
         httpContext.ajax_rsp_assign_attri("", false, "A13695BarAGrHdr", A13695BarAGrHdr);
         AV37BarAGrHdr = A13695BarAGrHdr ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBaragrhdr_Internalname, AV37BarAGrHdr);
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A119BarAgrCod ;
         GXv_int6[0] = A124BarAgrReo ;
         GXv_char3[0] = A122BarAgrPar ;
         GXv_decimal7[0] = AV42BarKgmAgr ;
         GXv_decimal8[0] = DecimalUtil.doubleToDec(0) ;
         GXv_int9[0] = AV43BarPieAgr ;
         GXv_char2[0] = AV44BarserAgr ;
         GXv_char10[0] = AV45BarColNomAgr ;
         GXv_int11[0] = 0 ;
         GXv_int12[0] = (byte)(0) ;
         GXv_char13[0] = "" ;
         GXv_date14[0] = AV46fec1 ;
         GXv_int15[0] = (byte)(0) ;
         GXv_char16[0] = AV47BarEnccliAgr ;
         GXv_char17[0] = "" ;
         GXv_int18[0] = 0 ;
         GXv_date19[0] = AV46fec1 ;
         GXv_char20[0] = "" ;
         GXv_char21[0] = AV48BarSerDscAgr ;
         GXv_int22[0] = 0 ;
         GXv_date23[0] = AV46fec1 ;
         GXv_char24[0] = AV49BarNomCliAgr ;
         new app.pinfagr(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_decimal7, GXv_decimal8, GXv_int9, GXv_char2, GXv_char10, GXv_int11, GXv_int12, GXv_char13, GXv_date14, GXv_int15, GXv_char16, GXv_char17, GXv_int18, GXv_date19, GXv_char20, GXv_char21, GXv_int22, GXv_date23, GXv_char24) ;
         webdatoshdr_impl.this.A396EmprCod = GXv_char4[0] ;
         webdatoshdr_impl.this.A119BarAgrCod = GXv_int5[0] ;
         webdatoshdr_impl.this.A124BarAgrReo = GXv_int6[0] ;
         webdatoshdr_impl.this.A122BarAgrPar = GXv_char3[0] ;
         webdatoshdr_impl.this.AV42BarKgmAgr = GXv_decimal7[0] ;
         webdatoshdr_impl.this.AV43BarPieAgr = (short)((short)(GXv_int9[0])) ;
         webdatoshdr_impl.this.AV44BarserAgr = GXv_char2[0] ;
         webdatoshdr_impl.this.AV45BarColNomAgr = GXv_char10[0] ;
         webdatoshdr_impl.this.AV46fec1 = GXv_date14[0] ;
         webdatoshdr_impl.this.AV47BarEnccliAgr = GXv_char16[0] ;
         webdatoshdr_impl.this.AV46fec1 = GXv_date19[0] ;
         webdatoshdr_impl.this.AV48BarSerDscAgr = GXv_char21[0] ;
         webdatoshdr_impl.this.AV46fec1 = GXv_date23[0] ;
         webdatoshdr_impl.this.AV49BarNomCliAgr = GXv_char24[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
         httpContext.ajax_rsp_assign_attri("", false, edtavBarkgmagr_Internalname, GXutil.ltrimstr( AV42BarKgmAgr, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, edtavBarseragr_Internalname, AV44BarserAgr);
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnomagr_Internalname, AV45BarColNomAgr);
         httpContext.ajax_rsp_assign_attri("", false, edtavBarenccliagr_Internalname, AV47BarEnccliAgr);
         httpContext.ajax_rsp_assign_attri("", false, edtavBarserdscagr_Internalname, AV48BarSerDscAgr);
         httpContext.ajax_rsp_assign_attri("", false, edtavBarnomcliagr_Internalname, AV49BarNomCliAgr);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      /*  Sending Event outputs  */
   }

   public void e13N12( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV40GridCurrentPage = (long)(AV40GridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV40GridCurrentPage = (long)(AV40GridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
         subgrid_nextpage( ) ;
      }
      else
      {
         AV39PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         AV40GridCurrentPage = AV39PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
         subgrid_gotopage( AV39PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e14N12( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV40GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridCurrentPage), 10, 0));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e17N12( )
   {
      /* 'DoObservaciones' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.tnotashdrs", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8Barcodpar))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","DisCod","CliCod","BarSer","PedidoCliente","BarColNom","BarColNum","BarPie","BarKgm","BarMtr","CliNom","BarSerDsc"}) );
      httpContext.wjLocDisableFrm = (byte)(1) ;
      /* Execute user subroutine: 'BARCAD' */
      S112 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV18BarFasEst, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
   }

   public void e15N12( )
   {
      /* Dvelop_confirmpanel_btncambiarmaquina_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btncambiarmaquina_Result, "Yes") == 0 )
      {
         if ( (GXutil.strcmp("", AV9MaqCod)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Maquina NO valida", ""));
            GX_FocusControl = edtavMaqcod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            GXv_char24[0] = "" ;
            GXv_char21[0] = AV16Ok ;
            new app.existemaquinamaquin(remoteHandle, context).execute( AV5Emprcod, AV9MaqCod, GXv_char24, GXv_char21) ;
            webdatoshdr_impl.this.AV16Ok = GXv_char21[0] ;
            if ( GXutil.strcmp(AV16Ok, httpContext.getMessage( "N", "")) == 0 )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "NO existe Maquina", ""));
               GX_FocusControl = edtavMaqcod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               GXv_char24[0] = AV5Emprcod ;
               GXv_int22[0] = AV6Barcod ;
               GXv_int15[0] = AV7Barcodreo ;
               GXv_char21[0] = AV8Barcodpar ;
               GXv_int25[0] = AV11Reclinmaq ;
               GXv_char20[0] = AV9MaqCod ;
               GXv_char17[0] = AV15UsurCod ;
               GXv_char16[0] = AV13Station ;
               new app.pprc219(remoteHandle, context).execute( GXv_char24, GXv_int22, GXv_int15, GXv_char21, GXv_int25, GXv_char20, GXv_char17, GXv_char16) ;
               webdatoshdr_impl.this.AV5Emprcod = GXv_char24[0] ;
               webdatoshdr_impl.this.AV6Barcod = GXv_int22[0] ;
               webdatoshdr_impl.this.AV7Barcodreo = GXv_int15[0] ;
               webdatoshdr_impl.this.AV8Barcodpar = GXv_char21[0] ;
               webdatoshdr_impl.this.AV11Reclinmaq = GXv_int25[0] ;
               webdatoshdr_impl.this.AV9MaqCod = GXv_char20[0] ;
               webdatoshdr_impl.this.AV15UsurCod = GXv_char17[0] ;
               webdatoshdr_impl.this.AV13Station = GXv_char16[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV11Reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Reclinmaq), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV9MaqCod", AV9MaqCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
               /* Execute user subroutine: 'REGISTRAR GLOBALEVENTS' */
               S122 ();
               if (returnInSub) return;
               httpContext.setWebReturnParms(new Object[] {AV5Emprcod,Integer.valueOf(AV6Barcod),Byte.valueOf(AV7Barcodreo),AV8Barcodpar});
               httpContext.setWebReturnParmsMetadata(new Object[] {"AV5Emprcod","AV6Barcod","AV7Barcodreo","AV8Barcodpar"});
               httpContext.wjLocDisableFrm = (byte)(1) ;
               httpContext.nUserReturn = (byte)(1) ;
               returnInSub = true;
               if (true) return;
            }
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51Objeto", AV51Objeto);
   }

   public void e16N12( )
   {
      /* Dvelop_confirmpanel_btneliminarmaquina_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btneliminarmaquina_Result, "Yes") == 0 )
      {
         if ( AV11Reclinmaq > 0 )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta HDR tiene receta de tinte, NO se puede eliminar desde aqui", ""));
         }
         else
         {
            AV12MaqcodNueva = GXutil.space( (short)(6)) ;
            GXv_char24[0] = AV5Emprcod ;
            GXv_int22[0] = AV6Barcod ;
            GXv_int15[0] = AV7Barcodreo ;
            GXv_char21[0] = AV8Barcodpar ;
            GXv_char20[0] = AV12MaqcodNueva ;
            GXv_char17[0] = AV15UsurCod ;
            GXv_char16[0] = AV13Station ;
            new app.pprc221(remoteHandle, context).execute( GXv_char24, GXv_int22, GXv_int15, GXv_char21, GXv_char20, GXv_char17, GXv_char16) ;
            webdatoshdr_impl.this.AV5Emprcod = GXv_char24[0] ;
            webdatoshdr_impl.this.AV6Barcod = GXv_int22[0] ;
            webdatoshdr_impl.this.AV7Barcodreo = GXv_int15[0] ;
            webdatoshdr_impl.this.AV8Barcodpar = GXv_char21[0] ;
            webdatoshdr_impl.this.AV12MaqcodNueva = GXv_char20[0] ;
            webdatoshdr_impl.this.AV15UsurCod = GXv_char17[0] ;
            webdatoshdr_impl.this.AV13Station = GXv_char16[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV15UsurCod", AV15UsurCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV13Station", AV13Station);
            /* Execute user subroutine: 'REGISTRAR GLOBALEVENTS' */
            S122 ();
            if (returnInSub) return;
            httpContext.setWebReturnParms(new Object[] {AV5Emprcod,Integer.valueOf(AV6Barcod),Byte.valueOf(AV7Barcodreo),AV8Barcodpar});
            httpContext.setWebReturnParmsMetadata(new Object[] {"AV5Emprcod","AV6Barcod","AV7Barcodreo","AV8Barcodpar"});
            httpContext.wjLocDisableFrm = (byte)(1) ;
            httpContext.nUserReturn = (byte)(1) ;
            returnInSub = true;
            if (true) return;
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV51Objeto", AV51Objeto);
   }

   public void S112( )
   {
      /* 'BARCAD' Routine */
      returnInSub = false ;
      /* Using cursor H00N18 */
      pr_default.execute(4, new Object[] {AV5Emprcod, Integer.valueOf(AV6Barcod), Byte.valueOf(AV7Barcodreo), AV8Barcodpar});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A130BarCodPar = H00N18_A130BarCodPar[0] ;
         A132BarCodReo = H00N18_A132BarCodReo[0] ;
         A129BarCod = H00N18_A129BarCod[0] ;
         A396EmprCod = H00N18_A396EmprCod[0] ;
         A252CliCod = H00N18_A252CliCod[0] ;
         n252CliCod = H00N18_n252CliCod[0] ;
         A279CliNom = H00N18_A279CliNom[0] ;
         A135BarColNom = H00N18_A135BarColNom[0] ;
         A4812BarEncCli = H00N18_A4812BarEncCli[0] ;
         A158BarFecFpr = H00N18_A158BarFecFpr[0] ;
         A1234BarNomCli = H00N18_A1234BarNomCli[0] ;
         A212BarSer = H00N18_A212BarSer[0] ;
         A1652BarSerDsc = H00N18_A1652BarSerDsc[0] ;
         A180BarMaqCod = H00N18_A180BarMaqCod[0] ;
         A13234BarRGB = H00N18_A13234BarRGB[0] ;
         A166BarKgm = H00N18_A166BarKgm[0] ;
         A219BarTotAgr = H00N18_A219BarTotAgr[0] ;
         n219BarTotAgr = H00N18_n219BarTotAgr[0] ;
         A166BarKgm = H00N18_A166BarKgm[0] ;
         A219BarTotAgr = H00N18_A219BarTotAgr[0] ;
         n219BarTotAgr = H00N18_n219BarTotAgr[0] ;
         A279CliNom = H00N18_A279CliNom[0] ;
         if ( A219BarTotAgr.doubleValue() != 0 )
         {
            A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
            httpContext.ajax_rsp_assign_attri("", false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
         }
         else
         {
            A812RecTotKgm = A166BarKgm ;
            httpContext.ajax_rsp_assign_attri("", false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
         }
         AV11Reclinmaq = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV11Reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Reclinmaq), 4, 0));
         /* Using cursor H00N19 */
         pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(5) != 101) )
         {
            A6039RecAcab = H00N19_A6039RecAcab[0] ;
            n6039RecAcab = H00N19_n6039RecAcab[0] ;
            A2804RecLinMaq = H00N19_A2804RecLinMaq[0] ;
            if ( GXutil.strcmp(A6039RecAcab, httpContext.getMessage( "S", "")) != 0 )
            {
               AV11Reclinmaq = A2804RecLinMaq ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11Reclinmaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11Reclinmaq), 4, 0));
            }
            pr_default.readNext(5);
         }
         pr_default.close(5);
         lblTexto1_Caption = ((AV11Reclinmaq>0) ? httpContext.getMessage( "Aviso. Hdr con RECETA", "") : " ") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Caption", lblTexto1_Caption, true);
         lblTexto1_Fontsize = 14 ;
         httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Fontsize", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTexto1_Fontsize), 9, 0), true);
         lblTexto1_Fontbold = (byte)(((AV11Reclinmaq>0) ? 1 : 0)) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Fontbold", GXutil.str( lblTexto1_Fontbold, 1, 0), true);
         lblTexto1_Backcolor = GXutil.getColor( 255, 0, 0) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTexto1_Backcolor), 9, 0), true);
         lblTexto1_Forecolor = GXutil.getColor( 255, 255, 255) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTexto1_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblTexto1_Forecolor), 9, 0), true);
         AV18BarFasEst = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarFasEst", GXutil.str( AV18BarFasEst, 1, 0));
         AV19BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
         httpContext.ajax_rsp_assign_attri("", false, "AV19BarFasDTI", localUtil.ttoc( AV19BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         /* Using cursor H00N110 */
         pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(6) != 101) )
         {
            A150BarFacTin = H00N110_A150BarFacTin[0] ;
            A153BarFasEst = H00N110_A153BarFasEst[0] ;
            A4442BarFasDTI = H00N110_A4442BarFasDTI[0] ;
            n4442BarFasDTI = H00N110_n4442BarFasDTI[0] ;
            if ( GXutil.strcmp(A150BarFacTin, httpContext.getMessage( "S", "")) == 0 )
            {
               AV18BarFasEst = A153BarFasEst ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18BarFasEst", GXutil.str( AV18BarFasEst, 1, 0));
               AV19BarFasDTI = A4442BarFasDTI ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19BarFasDTI", localUtil.ttoc( AV19BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            }
            pr_default.readNext(6);
         }
         pr_default.close(6);
         AV20CliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20CliCod), 6, 0));
         AV29CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29CliNom", AV29CliNom);
         AV26BarColNom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26BarColNom", AV26BarColNom);
         AV28BarEncCli = A4812BarEncCli ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28BarEncCli", AV28BarEncCli);
         AV23BarFecFpr = A158BarFecFpr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV23BarFecFpr", localUtil.format(AV23BarFecFpr, "99/99/99"));
         AV21BarKgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21BarKgm", GXutil.ltrimstr( AV21BarKgm, 9, 2));
         AV22RecTotKgm = A812RecTotKgm ;
         httpContext.ajax_rsp_assign_attri("", false, "AV22RecTotKgm", GXutil.ltrimstr( AV22RecTotKgm, 10, 2));
         AV27BarNomCli = A1234BarNomCli ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27BarNomCli", AV27BarNomCli);
         AV24BarSer = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24BarSer", AV24BarSer);
         AV25BarSerDsc = A1652BarSerDsc ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25BarSerDsc", AV25BarSerDsc);
         AV10BarMaqCod = A180BarMaqCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarMaqCod", AV10BarMaqCod);
         AV30BarRgb = ((A13234BarRGB<0) ? 16777215 : A13234BarRGB) ;
         GXv_int25[0] = AV35R ;
         GXv_int26[0] = AV33G ;
         GXv_int27[0] = AV31B ;
         GXv_int28[0] = AV36R2 ;
         GXv_int29[0] = AV34G2 ;
         GXv_int30[0] = AV32B2 ;
         new app.backcolorforecolor(remoteHandle, context).execute( AV30BarRgb, GXv_int25, GXv_int26, GXv_int27, GXv_int28, GXv_int29, GXv_int30) ;
         webdatoshdr_impl.this.AV35R = GXv_int25[0] ;
         webdatoshdr_impl.this.AV33G = GXv_int26[0] ;
         webdatoshdr_impl.this.AV31B = GXv_int27[0] ;
         webdatoshdr_impl.this.AV36R2 = GXv_int28[0] ;
         webdatoshdr_impl.this.AV34G2 = GXv_int29[0] ;
         webdatoshdr_impl.this.AV32B2 = GXv_int30[0] ;
         edtavBarnomcli_Backcolor = GXutil.getColor( AV35R, AV33G, AV31B) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Backcolor), 9, 0), true);
         edtavBarcolnom_Backcolor = GXutil.getColor( AV35R, AV33G, AV31B) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Backcolor), 9, 0), true);
         edtavBarnomcli_Forecolor = GXutil.getColor( AV36R2, AV34G2, AV32B2) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Forecolor), 9, 0), true);
         edtavBarcolnom_Forecolor = GXutil.getColor( AV36R2, AV34G2, AV32B2) ;
         httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Forecolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Forecolor), 9, 0), true);
         AV50DisMemo1 = " " ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50DisMemo1", AV50DisMemo1);
         /* Using cursor H00N111 */
         pr_default.execute(7, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
         while ( (pr_default.getStatus(7) != 101) )
         {
            A187BarNotDsc = H00N111_A187BarNotDsc[0] ;
            A188BarNotLin = H00N111_A188BarNotLin[0] ;
            if ( (GXutil.strcmp("", AV50DisMemo1)==0) )
            {
               AV50DisMemo1 = A187BarNotDsc + GXutil.newLine( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50DisMemo1", AV50DisMemo1);
            }
            else
            {
               AV50DisMemo1 += A187BarNotDsc + GXutil.newLine( ) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV50DisMemo1", AV50DisMemo1);
            }
            pr_default.readNext(7);
         }
         pr_default.close(7);
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
   }

   public void S122( )
   {
      /* 'REGISTRAR GLOBALEVENTS' Routine */
      returnInSub = false ;
      AV51Objeto.add("WCProgramacionMaquinas", 0);
      AV51Objeto.add("WCProgramarHdrDrop", 0);
      this.executeExternalObjectMethod("", false, "GlobalEvents", "RefrescarObjeto", new Object[] {AV51Objeto,Boolean.valueOf(true)}, true);
   }

   public void wb_table4_235_N12( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btneliminarmaquina_Internalname, tblTabledvelop_confirmpanel_btneliminarmaquina_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btneliminarmaquina.setProperty("Title", Dvelop_confirmpanel_btneliminarmaquina_Title);
         ucDvelop_confirmpanel_btneliminarmaquina.setProperty("ConfirmationText", Dvelop_confirmpanel_btneliminarmaquina_Confirmationtext);
         ucDvelop_confirmpanel_btneliminarmaquina.setProperty("YesButtonCaption", Dvelop_confirmpanel_btneliminarmaquina_Yesbuttoncaption);
         ucDvelop_confirmpanel_btneliminarmaquina.setProperty("NoButtonCaption", Dvelop_confirmpanel_btneliminarmaquina_Nobuttoncaption);
         ucDvelop_confirmpanel_btneliminarmaquina.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btneliminarmaquina_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btneliminarmaquina.setProperty("YesButtonPosition", Dvelop_confirmpanel_btneliminarmaquina_Yesbuttonposition);
         ucDvelop_confirmpanel_btneliminarmaquina.setProperty("ConfirmType", Dvelop_confirmpanel_btneliminarmaquina_Confirmtype);
         ucDvelop_confirmpanel_btneliminarmaquina.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btneliminarmaquina_Internalname, "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_235_N12e( true) ;
      }
      else
      {
         wb_table4_235_N12e( false) ;
      }
   }

   public void wb_table3_230_N12( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btncambiarmaquina_Internalname, tblTabledvelop_confirmpanel_btncambiarmaquina_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btncambiarmaquina.setProperty("Title", Dvelop_confirmpanel_btncambiarmaquina_Title);
         ucDvelop_confirmpanel_btncambiarmaquina.setProperty("ConfirmationText", Dvelop_confirmpanel_btncambiarmaquina_Confirmationtext);
         ucDvelop_confirmpanel_btncambiarmaquina.setProperty("YesButtonCaption", Dvelop_confirmpanel_btncambiarmaquina_Yesbuttoncaption);
         ucDvelop_confirmpanel_btncambiarmaquina.setProperty("NoButtonCaption", Dvelop_confirmpanel_btncambiarmaquina_Nobuttoncaption);
         ucDvelop_confirmpanel_btncambiarmaquina.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btncambiarmaquina_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btncambiarmaquina.setProperty("YesButtonPosition", Dvelop_confirmpanel_btncambiarmaquina_Yesbuttonposition);
         ucDvelop_confirmpanel_btncambiarmaquina.setProperty("ConfirmType", Dvelop_confirmpanel_btncambiarmaquina_Confirmtype);
         ucDvelop_confirmpanel_btncambiarmaquina.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btncambiarmaquina_Internalname, "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_230_N12e( true) ;
      }
      else
      {
         wb_table3_230_N12e( false) ;
      }
   }

   public void wb_table2_95_N12( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable4_Internalname, tblUnnamedtable4_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 106,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV20CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,106);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclinom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclinom_Internalname, "", "", "", lblTextblockclinom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Cli Nom", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 114,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV29CliNom), GXutil.rtrim( localUtil.format( AV29CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,114);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarenccli_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarenccli_Internalname, httpContext.getMessage( "Disp Cliente", ""), "", "", lblTextblockbarenccli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarenccli_Internalname, httpContext.getMessage( "Bar Enc Cli", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 125,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarenccli_Internalname, GXutil.rtrim( AV28BarEncCli), GXutil.rtrim( localUtil.format( AV28BarEncCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,125);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarenccli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarenccli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarcolnom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarcolnom_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblockbarcolnom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarcolnom_Internalname, httpContext.getMessage( "Bar Col Nom", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 136,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarcolnom_Internalname, GXutil.rtrim( AV26BarColNom), GXutil.rtrim( localUtil.format( AV26BarColNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,136);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarcolnom_Jsonclick, 0, "AttributeFL", "color:"+WebUtils.getHTMLColor( edtavBarcolnom_Forecolor)+";"+((edtavBarcolnom_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavBarcolnom_Backcolor)+";"), "", "", "", 1, edtavBarcolnom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarnomcli_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarnomcli_Internalname, httpContext.getMessage( "Color Cliente", ""), "", "", lblTextblockbarnomcli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnomcli_Internalname, httpContext.getMessage( "Bar Nom Cli", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 144,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnomcli_Internalname, GXutil.rtrim( AV27BarNomCli), GXutil.rtrim( localUtil.format( AV27BarNomCli, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,144);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnomcli_Jsonclick, 0, "AttributeFL", "color:"+WebUtils.getHTMLColor( edtavBarnomcli_Forecolor)+";"+((edtavBarnomcli_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavBarnomcli_Backcolor)+";"), "", "", "", 1, edtavBarnomcli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarser_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarser_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblockbarser_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarser_Internalname, httpContext.getMessage( "Bar Ser", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 155,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarser_Internalname, GXutil.rtrim( AV24BarSer), GXutil.rtrim( localUtil.format( AV24BarSer, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,155);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarserdsc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarserdsc_Internalname, "", "", "", lblTextblockbarserdsc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarserdsc_Internalname, httpContext.getMessage( "Bar Ser Dsc", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 163,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarserdsc_Internalname, GXutil.rtrim( AV25BarSerDsc), GXutil.rtrim( localUtil.format( AV25BarSerDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,163);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarserdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarserdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable9_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarfecfpr_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarfecfpr_Internalname, httpContext.getMessage( "Fecha Fin Previsto", ""), "", "", lblTextblockbarfecfpr_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfecfpr_Internalname, httpContext.getMessage( "Bar Fec Fpr", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 174,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfecfpr_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfecfpr_Internalname, localUtil.format(AV23BarFecFpr, "99/99/99"), localUtil.format( AV23BarFecFpr, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,174);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfecfpr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfecfpr_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfecfpr_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfecfpr_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebDatosHdr.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable10_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarkgm_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarkgm_Internalname, httpContext.getMessage( "Kilos", ""), "", "", lblTextblockbarkgm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarkgm_Internalname, httpContext.getMessage( "Bar Kgm", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 185,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV21BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV21BarKgm, "ZZZZZ9.99") : localUtil.format( AV21BarKgm, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,185);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarkgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablerectotkgm_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockrectotkgm_Internalname, httpContext.getMessage( "Kilos Tot", ""), "", "", lblTextblockrectotkgm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRectotkgm_Internalname, httpContext.getMessage( "Rec Tot Kgm", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 193,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRectotkgm_Internalname, GXutil.ltrim( localUtil.ntoc( AV22RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRectotkgm_Enabled!=0) ? localUtil.format( AV22RecTotKgm, "ZZZZZZ9.99") : localUtil.format( AV22RecTotKgm, "ZZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,193);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRectotkgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRectotkgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable11_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtabledismemo1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockdismemo1_Internalname, httpContext.getMessage( "Observaciones", ""), "", "", lblTextblockdismemo1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDismemo1_Internalname, httpContext.getMessage( "Dis Memo1", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Multiple line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 204,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavDismemo1_Internalname, AV50DisMemo1, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,204);\"", (short)(0), 1, edtavDismemo1_Enabled, 0, 80, "chr", 10, "row", (byte)(0), StyleString, ClassString, "", "", "2000", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable12_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 209,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnobservaciones_Internalname, "gx.evt.setGridEvt("+GXutil.str( 215, 3, 0)+","+"null"+");", httpContext.getMessage( "Observaciones", ""), bttBtnobservaciones_Jsonclick, 5, httpContext.getMessage( "Observaciones", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOOBSERVACIONES\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_95_N12e( true) ;
      }
      else
      {
         wb_table2_95_N12e( false) ;
      }
   }

   public void wb_table1_71_N12( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable13_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarfasest_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarfasest_Internalname, "", "", "", lblTextblockbarfasest_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasest.getInternalname(), httpContext.getMessage( "Estado Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 82,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasest, cmbavBarfasest.getInternalname(), GXutil.trim( GXutil.str( AV18BarFasEst, 1, 0)), 1, cmbavBarfasest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavBarfasest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,82);\"", "", true, (byte)(0), "HLP_WebDatosHdr.htm");
         cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV18BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarfasdti_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarfasdti_Internalname, "", "", "", lblTextblockbarfasdti_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfasdti_Internalname, httpContext.getMessage( "Fecha Hora Inicio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 90,'',false,'" + sGXsfl_215_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfasdti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfasdti_Internalname, localUtil.ttoc( AV19BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV19BarFasDTI, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,90);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfasdti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfasdti_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebDatosHdr.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfasdti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfasdti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebDatosHdr.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_71_N12e( true) ;
      }
      else
      {
         wb_table1_71_N12e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      AV6Barcod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
      AV7Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
      AV8Barcodpar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
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
      paN12( ) ;
      wsN12( ) ;
      weN12( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026799181782", true, true);
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
         httpContext.AddJavascriptSource("webdatoshdr.js", "?2026799181783", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_2152( )
   {
      edtavBarenccliagr_Internalname = "vBARENCCLIAGR_"+sGXsfl_215_idx ;
      edtavBaragrhdr_Internalname = "vBARAGRHDR_"+sGXsfl_215_idx ;
      edtavBarseragr_Internalname = "vBARSERAGR_"+sGXsfl_215_idx ;
      edtavBarserdscagr_Internalname = "vBARSERDSCAGR_"+sGXsfl_215_idx ;
      edtavBarnomcliagr_Internalname = "vBARNOMCLIAGR_"+sGXsfl_215_idx ;
      edtavBarcolnomagr_Internalname = "vBARCOLNOMAGR_"+sGXsfl_215_idx ;
      edtavBarkgmagr_Internalname = "vBARKGMAGR_"+sGXsfl_215_idx ;
   }

   public void subsflControlProps_fel_2152( )
   {
      edtavBarenccliagr_Internalname = "vBARENCCLIAGR_"+sGXsfl_215_fel_idx ;
      edtavBaragrhdr_Internalname = "vBARAGRHDR_"+sGXsfl_215_fel_idx ;
      edtavBarseragr_Internalname = "vBARSERAGR_"+sGXsfl_215_fel_idx ;
      edtavBarserdscagr_Internalname = "vBARSERDSCAGR_"+sGXsfl_215_fel_idx ;
      edtavBarnomcliagr_Internalname = "vBARNOMCLIAGR_"+sGXsfl_215_fel_idx ;
      edtavBarcolnomagr_Internalname = "vBARCOLNOMAGR_"+sGXsfl_215_fel_idx ;
      edtavBarkgmagr_Internalname = "vBARKGMAGR_"+sGXsfl_215_fel_idx ;
   }

   public void sendrow_2152( )
   {
      subsflControlProps_2152( ) ;
      wbN10( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_215_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_215_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_215_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarenccliagr_Internalname,GXutil.rtrim( AV47BarEnccliAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarenccliagr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarenccliagr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(215),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaragrhdr_Internalname,GXutil.rtrim( AV37BarAGrHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBaragrhdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBaragrhdr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(215),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarseragr_Internalname,GXutil.rtrim( AV44BarserAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarseragr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarseragr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(215),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarserdscagr_Internalname,GXutil.rtrim( AV48BarSerDscAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarserdscagr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarserdscagr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(215),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarnomcliagr_Internalname,GXutil.rtrim( AV49BarNomCliAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarnomcliagr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarnomcliagr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(215),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnomagr_Internalname,GXutil.rtrim( AV45BarColNomAgr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnomagr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarcolnomagr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(215),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarkgmagr_Internalname,GXutil.ltrim( localUtil.ntoc( AV42BarKgmAgr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarkgmagr_Enabled!=0) ? localUtil.format( AV42BarKgmAgr, "ZZZZZ9.99") : localUtil.format( AV42BarKgmAgr, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarkgmagr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarkgmagr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(215),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesN12( ) ;
         GXCCtl = "GXHCvMAQCOD_" + sGXsfl_215_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.rtrim( AV9MaqCod));
         GridContainer.AddRow(GridRow);
         nGXsfl_215_idx = ((subGrid_Islastpage==1)&&(nGXsfl_215_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_215_idx+1) ;
         sGXsfl_215_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_215_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_2152( ) ;
      }
      /* End function sendrow_2152 */
   }

   public void startgridcontrol215( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"215\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disp Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV47BarEnccliAgr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarenccliagr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV37BarAGrHdr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaragrhdr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV44BarserAgr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarseragr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV48BarSerDscAgr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarserdscagr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV49BarNomCliAgr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarnomcliagr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV45BarColNomAgr));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcolnomagr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV42BarKgmAgr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarkgmagr_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      divUnnamedtable17_Internalname = "UNNAMEDTABLE17" ;
      lblTexto1_Internalname = "TEXTO1" ;
      divUnnamedtable18_Internalname = "UNNAMEDTABLE18" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTextblockbarmaqcod_Internalname = "TEXTBLOCKBARMAQCOD" ;
      edtavBarmaqcod_Internalname = "vBARMAQCOD" ;
      divUnnamedtablebarmaqcod_Internalname = "UNNAMEDTABLEBARMAQCOD" ;
      divUnnamedtable14_Internalname = "UNNAMEDTABLE14" ;
      lblTextblockmaqcod_Internalname = "TEXTBLOCKMAQCOD" ;
      edtavMaqcod_Internalname = "vMAQCOD" ;
      divUnnamedtablemaqcod_Internalname = "UNNAMEDTABLEMAQCOD" ;
      divUnnamedtable15_Internalname = "UNNAMEDTABLE15" ;
      bttBtncambiarmaquina_Internalname = "BTNCAMBIARMAQUINA" ;
      bttBtneliminarmaquina_Internalname = "BTNELIMINARMAQUINA" ;
      divUnnamedtable16_Internalname = "UNNAMEDTABLE16" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      lblTextblockbarfasest_Internalname = "TEXTBLOCKBARFASEST" ;
      cmbavBarfasest.setInternalname( "vBARFASEST" );
      divUnnamedtablebarfasest_Internalname = "UNNAMEDTABLEBARFASEST" ;
      lblTextblockbarfasdti_Internalname = "TEXTBLOCKBARFASDTI" ;
      edtavBarfasdti_Internalname = "vBARFASDTI" ;
      divUnnamedtablebarfasdti_Internalname = "UNNAMEDTABLEBARFASDTI" ;
      divUnnamedtable13_Internalname = "UNNAMEDTABLE13" ;
      tblUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      edtavClicod_Internalname = "vCLICOD" ;
      divUnnamedtableclicod_Internalname = "UNNAMEDTABLECLICOD" ;
      lblTextblockclinom_Internalname = "TEXTBLOCKCLINOM" ;
      edtavClinom_Internalname = "vCLINOM" ;
      divUnnamedtableclinom_Internalname = "UNNAMEDTABLECLINOM" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      lblTextblockbarenccli_Internalname = "TEXTBLOCKBARENCCLI" ;
      edtavBarenccli_Internalname = "vBARENCCLI" ;
      divUnnamedtablebarenccli_Internalname = "UNNAMEDTABLEBARENCCLI" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      lblTextblockbarcolnom_Internalname = "TEXTBLOCKBARCOLNOM" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      divUnnamedtablebarcolnom_Internalname = "UNNAMEDTABLEBARCOLNOM" ;
      lblTextblockbarnomcli_Internalname = "TEXTBLOCKBARNOMCLI" ;
      edtavBarnomcli_Internalname = "vBARNOMCLI" ;
      divUnnamedtablebarnomcli_Internalname = "UNNAMEDTABLEBARNOMCLI" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      lblTextblockbarser_Internalname = "TEXTBLOCKBARSER" ;
      edtavBarser_Internalname = "vBARSER" ;
      divUnnamedtablebarser_Internalname = "UNNAMEDTABLEBARSER" ;
      lblTextblockbarserdsc_Internalname = "TEXTBLOCKBARSERDSC" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      divUnnamedtablebarserdsc_Internalname = "UNNAMEDTABLEBARSERDSC" ;
      divUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      lblTextblockbarfecfpr_Internalname = "TEXTBLOCKBARFECFPR" ;
      edtavBarfecfpr_Internalname = "vBARFECFPR" ;
      divUnnamedtablebarfecfpr_Internalname = "UNNAMEDTABLEBARFECFPR" ;
      divUnnamedtable9_Internalname = "UNNAMEDTABLE9" ;
      lblTextblockbarkgm_Internalname = "TEXTBLOCKBARKGM" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      divUnnamedtablebarkgm_Internalname = "UNNAMEDTABLEBARKGM" ;
      lblTextblockrectotkgm_Internalname = "TEXTBLOCKRECTOTKGM" ;
      edtavRectotkgm_Internalname = "vRECTOTKGM" ;
      divUnnamedtablerectotkgm_Internalname = "UNNAMEDTABLERECTOTKGM" ;
      divUnnamedtable10_Internalname = "UNNAMEDTABLE10" ;
      lblTextblockdismemo1_Internalname = "TEXTBLOCKDISMEMO1" ;
      edtavDismemo1_Internalname = "vDISMEMO1" ;
      divUnnamedtabledismemo1_Internalname = "UNNAMEDTABLEDISMEMO1" ;
      divUnnamedtable11_Internalname = "UNNAMEDTABLE11" ;
      bttBtnobservaciones_Internalname = "BTNOBSERVACIONES" ;
      divUnnamedtable12_Internalname = "UNNAMEDTABLE12" ;
      tblUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      edtavBarenccliagr_Internalname = "vBARENCCLIAGR" ;
      edtavBaragrhdr_Internalname = "vBARAGRHDR" ;
      edtavBarseragr_Internalname = "vBARSERAGR" ;
      edtavBarserdscagr_Internalname = "vBARSERDSCAGR" ;
      edtavBarnomcliagr_Internalname = "vBARNOMCLIAGR" ;
      edtavBarcolnomagr_Internalname = "vBARCOLNOMAGR" ;
      edtavBarkgmagr_Internalname = "vBARKGMAGR" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGridcurrentpage_Internalname = "vGRIDCURRENTPAGE" ;
      Dvelop_confirmpanel_btncambiarmaquina_Internalname = "DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA" ;
      tblTabledvelop_confirmpanel_btncambiarmaquina_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA" ;
      Dvelop_confirmpanel_btneliminarmaquina_Internalname = "DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA" ;
      tblTabledvelop_confirmpanel_btneliminarmaquina_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA" ;
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
      edtavBarkgmagr_Jsonclick = "" ;
      edtavBarkgmagr_Enabled = 0 ;
      edtavBarcolnomagr_Jsonclick = "" ;
      edtavBarcolnomagr_Enabled = 0 ;
      edtavBarnomcliagr_Jsonclick = "" ;
      edtavBarnomcliagr_Enabled = 0 ;
      edtavBarserdscagr_Jsonclick = "" ;
      edtavBarserdscagr_Enabled = 0 ;
      edtavBarseragr_Jsonclick = "" ;
      edtavBarseragr_Enabled = 0 ;
      edtavBaragrhdr_Jsonclick = "" ;
      edtavBaragrhdr_Enabled = 0 ;
      edtavBarenccliagr_Jsonclick = "" ;
      edtavBarenccliagr_Enabled = 0 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavBarfasdti_Jsonclick = "" ;
      edtavBarfasdti_Enabled = 1 ;
      cmbavBarfasest.setJsonclick( "" );
      cmbavBarfasest.setEnabled( 1 );
      edtavDismemo1_Enabled = 1 ;
      edtavRectotkgm_Jsonclick = "" ;
      edtavRectotkgm_Enabled = 1 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Enabled = 1 ;
      edtavBarfecfpr_Jsonclick = "" ;
      edtavBarfecfpr_Enabled = 1 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Enabled = 1 ;
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Backstyle = (byte)(-1) ;
      edtavBarnomcli_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Backstyle = (byte)(-1) ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarenccli_Jsonclick = "" ;
      edtavBarenccli_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 1 ;
      edtavBarcolnom_Forecolor = (int)(0x000000) ;
      edtavBarnomcli_Forecolor = (int)(0x000000) ;
      edtavBarcolnom_Backcolor = (int)(0xFFFFFF) ;
      edtavBarnomcli_Backcolor = (int)(0xFFFFFF) ;
      edtavGridcurrentpage_Jsonclick = "" ;
      edtavGridcurrentpage_Visible = 1 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      edtavBarmaqcod_Jsonclick = "" ;
      edtavBarmaqcod_Enabled = 1 ;
      lblTexto1_Backcolor = (int)(0xFFFFFF) ;
      lblTexto1_Forecolor = (int)(0x000000) ;
      lblTexto1_Fontbold = (byte)(0) ;
      lblTexto1_Fontsize = (int)(DecimalUtil.decToDouble(DecimalUtil.stringToDec("12.0"))) ;
      lblTexto1_Caption = httpContext.getMessage( "Texto", "") ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Enabled = 0 ;
      Dvelop_confirmpanel_btneliminarmaquina_Confirmtype = "1" ;
      Dvelop_confirmpanel_btneliminarmaquina_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btneliminarmaquina_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btneliminarmaquina_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btneliminarmaquina_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btneliminarmaquina_Confirmationtext = "¿Desea eliminar la maquina actual?" ;
      Dvelop_confirmpanel_btneliminarmaquina_Title = "" ;
      Dvelop_confirmpanel_btncambiarmaquina_Confirmtype = "1" ;
      Dvelop_confirmpanel_btncambiarmaquina_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btncambiarmaquina_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btncambiarmaquina_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btncambiarmaquina_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btncambiarmaquina_Confirmationtext = "¿Desea cambiar la Maquina Actual?" ;
      Dvelop_confirmpanel_btncambiarmaquina_Title = "" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "WWP_PagingEmptyGridCaption" ;
      Gridpaginationbar_Caption = httpContext.getMessage( "WWP_PagingCaption", "") ;
      Gridpaginationbar_Next = "WWP_PagingNextCaption" ;
      Gridpaginationbar_Previous = "WWP_PagingPreviousCaption" ;
      Gridpaginationbar_Rowsperpageoptions = "5:WWP_Rows5,10:WWP_Rows10,20:WWP_Rows20,50:WWP_Rows50" ;
      Gridpaginationbar_Rowsperpageselectedvalue = 10 ;
      Gridpaginationbar_Rowsperpageselector = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Emptygridclass = "PaginationBarEmptyGrid" ;
      Gridpaginationbar_Pagingcaptionposition = "Left" ;
      Gridpaginationbar_Pagingbuttonsposition = "Right" ;
      Gridpaginationbar_Pagestoshow = 5 ;
      Gridpaginationbar_Showlast = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Shownext = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showprevious = GXutil.toBoolean( -1) ;
      Gridpaginationbar_Showfirst = GXutil.toBoolean( 0) ;
      Gridpaginationbar_Class = "PaginationBar" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = "" ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Produccion", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Maquinas", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( "Datos Hdr", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      cmbavBarfasest.setName( "vBARFASEST" );
      cmbavBarfasest.setWebtags( "" );
      cmbavBarfasest.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbavBarfasest.addItem("1", httpContext.getMessage( "En Proceso", ""), (short)(0));
      cmbavBarfasest.addItem("2", httpContext.getMessage( "Finalizada", ""), (short)(0));
      if ( cmbavBarfasest.getItemCount() > 0 )
      {
         AV18BarFasEst = (byte)(GXutil.lval( cmbavBarfasest.getValidValue(GXutil.trim( GXutil.str( AV18BarFasEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18BarFasEst", GXutil.str( AV18BarFasEst, 1, 0));
      }
      /* End function init_web_controls */
   }

   public void validv_Maqcod( )
   {
      if ( (GXutil.strcmp("", hV9MaqCod)==0) )
      {
         AV9MaqCod = "" ;
      }
      else
      {
         A13734MaqCDsc = hV9MaqCod ;
         /* Using cursor H00N112 */
         pr_default.execute(8, new Object[] {A13734MaqCDsc});
         AV9MaqCod = H00N112_A602MaqCod[0] ;
         if ( ! ( (pr_default.getStatus(8) == 101) ) )
         {
            pr_default.readNext(8);
            if ( ! ( (pr_default.getStatus(8) == 101) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Codigo+Descripcion", "")}), 1, "vMAQCOD");
               GX_FocusControl = edtavMaqcod_Internalname ;
            }
         }
         else
         {
         }
         pr_default.close(8);
      }
      httpContext.ajax_rsp_assign_attri("", false, "hV9MaqCod", hV9MaqCod);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "AV9MaqCod", GXutil.rtrim( AV9MaqCod));
      httpContext.ajax_rsp_assign_attri("", false, "hV9MaqCod", hV9MaqCod);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e20N12',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV37BarAGrHdr',fld:'vBARAGRHDR',pic:''},{av:'AV49BarNomCliAgr',fld:'vBARNOMCLIAGR',pic:''},{av:'AV48BarSerDscAgr',fld:'vBARSERDSCAGR',pic:''},{av:'AV47BarEnccliAgr',fld:'vBARENCCLIAGR',pic:''},{av:'AV45BarColNomAgr',fld:'vBARCOLNOMAGR',pic:''},{av:'AV44BarserAgr',fld:'vBARSERAGR',pic:''},{av:'AV42BarKgmAgr',fld:'vBARKGMAGR',pic:'ZZZZZ9.99'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e13N12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e14N12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV40GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOOBSERVACIONES'","{handler:'e17N12',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'A13695BarAGrHdr',fld:'BARAGRHDR',pic:''},{av:'A2804RecLinMaq',fld:'RECLINMAQ',pic:'ZZZ9'},{av:'A6039RecAcab',fld:'RECACAB',pic:''},{av:'AV19BarFasDTI',fld:'vBARFASDTI',pic:'99/99/99 99:99:99'},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A4812BarEncCli',fld:'BARENCCLI',pic:''},{av:'A158BarFecFpr',fld:'BARFECFPR',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A812RecTotKgm',fld:'RECTOTKGM',pic:'ZZZZZZ9.99'},{av:'A1234BarNomCli',fld:'BARNOMCLI',pic:''},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A13234BarRGB',fld:'BARRGB',pic:'ZZZZZZZZZ9'},{av:'A188BarNotLin',fld:'BARNOTLIN',pic:'9'},{av:'A187BarNotDsc',fld:'BARNOTDSC',pic:''}]");
      setEventMetadata("'DOOBSERVACIONES'",",oparms:[{av:'AV11Reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'lblTexto1_Caption',ctrl:'TEXTO1',prop:'Caption'},{av:'lblTexto1_Fontsize',ctrl:'TEXTO1',prop:'Fontsize'},{av:'lblTexto1_Fontbold',ctrl:'TEXTO1',prop:'Fontbold'},{av:'lblTexto1_Backcolor',ctrl:'TEXTO1',prop:'Backcolor'},{av:'lblTexto1_Forecolor',ctrl:'TEXTO1',prop:'Forecolor'},{av:'cmbavBarfasest'},{av:'AV18BarFasEst',fld:'vBARFASEST',pic:'9'},{av:'AV19BarFasDTI',fld:'vBARFASDTI',pic:'99/99/99 99:99:99'},{av:'AV20CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV29CliNom',fld:'vCLINOM',pic:''},{av:'AV26BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV28BarEncCli',fld:'vBARENCCLI',pic:''},{av:'AV23BarFecFpr',fld:'vBARFECFPR',pic:''},{av:'AV21BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV22RecTotKgm',fld:'vRECTOTKGM',pic:'ZZZZZZ9.99'},{av:'AV27BarNomCli',fld:'vBARNOMCLI',pic:''},{av:'AV24BarSer',fld:'vBARSER',pic:''},{av:'AV25BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV10BarMaqCod',fld:'vBARMAQCOD',pic:''},{av:'edtavBarnomcli_Backcolor',ctrl:'vBARNOMCLI',prop:'Backcolor'},{av:'edtavBarcolnom_Backcolor',ctrl:'vBARCOLNOM',prop:'Backcolor'},{av:'edtavBarnomcli_Forecolor',ctrl:'vBARNOMCLI',prop:'Forecolor'},{av:'edtavBarcolnom_Forecolor',ctrl:'vBARCOLNOM',prop:'Forecolor'},{av:'AV50DisMemo1',fld:'vDISMEMO1',pic:''}]}");
      setEventMetadata("'DOCAMBIARMAQUINA'","{handler:'e11N11',iparms:[]");
      setEventMetadata("'DOCAMBIARMAQUINA'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA.CLOSE","{handler:'e15N12',iparms:[{av:'Dvelop_confirmpanel_btncambiarmaquina_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA',prop:'Result'},{av:'AV9MaqCod',fld:'vMAQCOD',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV11Reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV15UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV13Station',fld:'vSTATION',pic:''},{av:'AV51Objeto',fld:'vOBJETO',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCAMBIARMAQUINA.CLOSE",",oparms:[{av:'AV13Station',fld:'vSTATION',pic:''},{av:'AV15UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV9MaqCod',fld:'vMAQCOD',pic:''},{av:'AV11Reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51Objeto',fld:'vOBJETO',pic:''}]}");
      setEventMetadata("'DOELIMINARMAQUINA'","{handler:'e12N11',iparms:[]");
      setEventMetadata("'DOELIMINARMAQUINA'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA.CLOSE","{handler:'e16N12',iparms:[{av:'Dvelop_confirmpanel_btneliminarmaquina_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA',prop:'Result'},{av:'AV11Reclinmaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV15UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV13Station',fld:'vSTATION',pic:''},{av:'AV51Objeto',fld:'vOBJETO',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARMAQUINA.CLOSE",",oparms:[{av:'AV13Station',fld:'vSTATION',pic:''},{av:'AV15UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51Objeto',fld:'vOBJETO',pic:''}]}");
      setEventMetadata("VALIDV_BARCOD","{handler:'validv_Barcod',iparms:[]");
      setEventMetadata("VALIDV_BARCOD",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODREO","{handler:'validv_Barcodreo',iparms:[]");
      setEventMetadata("VALIDV_BARCODREO",",oparms:[]}");
      setEventMetadata("VALIDV_BARCODPAR","{handler:'validv_Barcodpar',iparms:[]");
      setEventMetadata("VALIDV_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALIDV_MAQCOD","{handler:'validv_Maqcod',iparms:[{av:'hV9MaqCod'},{av:'AV9MaqCod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("VALIDV_MAQCOD",",oparms:[{av:'AV9MaqCod',fld:'vMAQCOD',pic:''},{av:'hV9MaqCod'}]}");
      setEventMetadata("VALIDV_BARFASEST","{handler:'validv_Barfasest',iparms:[]");
      setEventMetadata("VALIDV_BARFASEST",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Barkgmagr',iparms:[]");
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
      wcpOAV5Emprcod = "" ;
      wcpOAV8Barcodpar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_btncambiarmaquina_Result = "" ;
      Dvelop_confirmpanel_btneliminarmaquina_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13734MaqCDsc = "" ;
      hV9MaqCod = "" ;
      AV5Emprcod = "" ;
      AV8Barcodpar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A122BarAgrPar = "" ;
      A13695BarAGrHdr = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A6039RecAcab = "" ;
      A150BarFacTin = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A279CliNom = "" ;
      A135BarColNom = "" ;
      A4812BarEncCli = "" ;
      A158BarFecFpr = GXutil.nullDate() ;
      A166BarKgm = DecimalUtil.ZERO ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      A1234BarNomCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A180BarMaqCod = "" ;
      A187BarNotDsc = "" ;
      AV15UsurCod = "" ;
      AV13Station = "" ;
      AV51Objeto = new GXSimpleCollection<String>(String.class, "internal", "");
      AV9MaqCod = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      lblTexto1_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      lblTextblockbarmaqcod_Jsonclick = "" ;
      TempTags = "" ;
      AV10BarMaqCod = "" ;
      lblTextblockmaqcod_Jsonclick = "" ;
      bttBtncambiarmaquina_Jsonclick = "" ;
      bttBtneliminarmaquina_Jsonclick = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV47BarEnccliAgr = "" ;
      AV37BarAGrHdr = "" ;
      AV44BarserAgr = "" ;
      AV48BarSerDscAgr = "" ;
      AV49BarNomCliAgr = "" ;
      AV45BarColNomAgr = "" ;
      AV42BarKgmAgr = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13734MaqCDsc = "" ;
      H00N12_A13734MaqCDsc = new String[] {""} ;
      H00N13_A13734MaqCDsc = new String[] {""} ;
      H00N13_A396EmprCod = new String[] {""} ;
      H00N13_A602MaqCod = new String[] {""} ;
      A602MaqCod = "" ;
      H00N14_A13734MaqCDsc = new String[] {""} ;
      H00N14_A396EmprCod = new String[] {""} ;
      H00N14_A602MaqCod = new String[] {""} ;
      AV19BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV29CliNom = "" ;
      AV28BarEncCli = "" ;
      AV26BarColNom = "" ;
      AV27BarNomCli = "" ;
      AV24BarSer = "" ;
      AV25BarSerDsc = "" ;
      AV23BarFecFpr = GXutil.nullDate() ;
      AV21BarKgm = DecimalUtil.ZERO ;
      AV22RecTotKgm = DecimalUtil.ZERO ;
      AV50DisMemo1 = "" ;
      AV14EmprNom = "" ;
      GXt_char1 = "" ;
      H00N15_A130BarCodPar = new String[] {""} ;
      H00N15_A132BarCodReo = new byte[1] ;
      H00N15_A129BarCod = new int[1] ;
      H00N15_A396EmprCod = new String[] {""} ;
      H00N15_A122BarAgrPar = new String[] {""} ;
      H00N15_A124BarAgrReo = new byte[1] ;
      H00N15_A119BarAgrCod = new int[1] ;
      GXv_char4 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal7 = new java.math.BigDecimal[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_int9 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char10 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_int12 = new byte[1] ;
      GXv_char13 = new String[1] ;
      AV46fec1 = GXutil.nullDate() ;
      GXv_date14 = new java.util.Date[1] ;
      GXv_int18 = new int[1] ;
      GXv_date19 = new java.util.Date[1] ;
      GXv_date23 = new java.util.Date[1] ;
      AV16Ok = "" ;
      AV12MaqcodNueva = "" ;
      GXv_char24 = new String[1] ;
      GXv_int22 = new int[1] ;
      GXv_int15 = new byte[1] ;
      GXv_char21 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char16 = new String[1] ;
      H00N18_A130BarCodPar = new String[] {""} ;
      H00N18_A132BarCodReo = new byte[1] ;
      H00N18_A129BarCod = new int[1] ;
      H00N18_A396EmprCod = new String[] {""} ;
      H00N18_A252CliCod = new int[1] ;
      H00N18_n252CliCod = new boolean[] {false} ;
      H00N18_A279CliNom = new String[] {""} ;
      H00N18_A135BarColNom = new String[] {""} ;
      H00N18_A4812BarEncCli = new String[] {""} ;
      H00N18_A158BarFecFpr = new java.util.Date[] {GXutil.nullDate()} ;
      H00N18_A1234BarNomCli = new String[] {""} ;
      H00N18_A212BarSer = new String[] {""} ;
      H00N18_A1652BarSerDsc = new String[] {""} ;
      H00N18_A180BarMaqCod = new String[] {""} ;
      H00N18_A13234BarRGB = new long[1] ;
      H00N18_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00N18_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00N18_n219BarTotAgr = new boolean[] {false} ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      H00N19_A396EmprCod = new String[] {""} ;
      H00N19_A129BarCod = new int[1] ;
      H00N19_A132BarCodReo = new byte[1] ;
      H00N19_A130BarCodPar = new String[] {""} ;
      H00N19_A6039RecAcab = new String[] {""} ;
      H00N19_n6039RecAcab = new boolean[] {false} ;
      H00N19_A2804RecLinMaq = new short[1] ;
      H00N110_A758ProCod = new String[] {""} ;
      H00N110_A194BarOrdLin = new short[1] ;
      H00N110_A396EmprCod = new String[] {""} ;
      H00N110_A129BarCod = new int[1] ;
      H00N110_A132BarCodReo = new byte[1] ;
      H00N110_A130BarCodPar = new String[] {""} ;
      H00N110_A150BarFacTin = new String[] {""} ;
      H00N110_A153BarFasEst = new byte[1] ;
      H00N110_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H00N110_n4442BarFasDTI = new boolean[] {false} ;
      GXv_int25 = new short[1] ;
      GXv_int26 = new short[1] ;
      GXv_int27 = new short[1] ;
      GXv_int28 = new short[1] ;
      GXv_int29 = new short[1] ;
      GXv_int30 = new short[1] ;
      H00N111_A396EmprCod = new String[] {""} ;
      H00N111_A129BarCod = new int[1] ;
      H00N111_A132BarCodReo = new byte[1] ;
      H00N111_A130BarCodPar = new String[] {""} ;
      H00N111_A187BarNotDsc = new String[] {""} ;
      H00N111_A188BarNotLin = new byte[1] ;
      ucDvelop_confirmpanel_btneliminarmaquina = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_btncambiarmaquina = new com.genexus.webpanels.GXUserControl();
      lblTextblockclicod_Jsonclick = "" ;
      lblTextblockclinom_Jsonclick = "" ;
      lblTextblockbarenccli_Jsonclick = "" ;
      lblTextblockbarcolnom_Jsonclick = "" ;
      lblTextblockbarnomcli_Jsonclick = "" ;
      lblTextblockbarser_Jsonclick = "" ;
      lblTextblockbarserdsc_Jsonclick = "" ;
      lblTextblockbarfecfpr_Jsonclick = "" ;
      lblTextblockbarkgm_Jsonclick = "" ;
      lblTextblockrectotkgm_Jsonclick = "" ;
      lblTextblockdismemo1_Jsonclick = "" ;
      bttBtnobservaciones_Jsonclick = "" ;
      lblTextblockbarfasest_Jsonclick = "" ;
      lblTextblockbarfasdti_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      GridRow = new com.genexus.webpanels.GXWebRow();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      H00N112_A13734MaqCDsc = new String[] {""} ;
      H00N112_A396EmprCod = new String[] {""} ;
      H00N112_A602MaqCod = new String[] {""} ;
      ZV9MaqCod = "" ;
      ZhV9MaqCod = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webdatoshdr__default(),
         new Object[] {
             new Object[] {
            H00N12_A13734MaqCDsc
            }
            , new Object[] {
            H00N13_A13734MaqCDsc, H00N13_A396EmprCod, H00N13_A602MaqCod
            }
            , new Object[] {
            H00N14_A13734MaqCDsc, H00N14_A396EmprCod, H00N14_A602MaqCod
            }
            , new Object[] {
            H00N15_A130BarCodPar, H00N15_A132BarCodReo, H00N15_A129BarCod, H00N15_A396EmprCod, H00N15_A122BarAgrPar, H00N15_A124BarAgrReo, H00N15_A119BarAgrCod
            }
            , new Object[] {
            H00N18_A130BarCodPar, H00N18_A132BarCodReo, H00N18_A129BarCod, H00N18_A396EmprCod, H00N18_A252CliCod, H00N18_n252CliCod, H00N18_A279CliNom, H00N18_A135BarColNom, H00N18_A4812BarEncCli, H00N18_A158BarFecFpr,
            H00N18_A1234BarNomCli, H00N18_A212BarSer, H00N18_A1652BarSerDsc, H00N18_A180BarMaqCod, H00N18_A13234BarRGB, H00N18_A166BarKgm, H00N18_A219BarTotAgr, H00N18_n219BarTotAgr
            }
            , new Object[] {
            H00N19_A396EmprCod, H00N19_A129BarCod, H00N19_A132BarCodReo, H00N19_A130BarCodPar, H00N19_A6039RecAcab, H00N19_n6039RecAcab, H00N19_A2804RecLinMaq
            }
            , new Object[] {
            H00N110_A758ProCod, H00N110_A194BarOrdLin, H00N110_A396EmprCod, H00N110_A129BarCod, H00N110_A132BarCodReo, H00N110_A130BarCodPar, H00N110_A150BarFacTin, H00N110_A153BarFasEst, H00N110_A4442BarFasDTI, H00N110_n4442BarFasDTI
            }
            , new Object[] {
            H00N111_A396EmprCod, H00N111_A129BarCod, H00N111_A132BarCodReo, H00N111_A130BarCodPar, H00N111_A187BarNotDsc, H00N111_A188BarNotLin
            }
            , new Object[] {
            H00N112_A13734MaqCDsc, H00N112_A396EmprCod, H00N112_A602MaqCod
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarmaqcod_Enabled = 0 ;
      cmbavBarfasest.setEnabled( 0 );
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarenccli_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarnomcli_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarfecfpr_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavRectotkgm_Enabled = 0 ;
      edtavDismemo1_Enabled = 0 ;
      edtavBarenccliagr_Enabled = 0 ;
      edtavBaragrhdr_Enabled = 0 ;
      edtavBarseragr_Enabled = 0 ;
      edtavBarserdscagr_Enabled = 0 ;
      edtavBarnomcliagr_Enabled = 0 ;
      edtavBarcolnomagr_Enabled = 0 ;
      edtavBarkgmagr_Enabled = 0 ;
   }

   private byte wcpOAV7Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV7Barcodreo ;
   private byte A132BarCodReo ;
   private byte A124BarAgrReo ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte A153BarFasEst ;
   private byte A188BarNotLin ;
   private byte lblTexto1_Fontbold ;
   private byte nDonePA ;
   private byte AV18BarFasEst ;
   private byte subGrid_Backcolorstyle ;
   private byte GXv_int6[] ;
   private byte GXv_int12[] ;
   private byte GXv_int15[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private byte edtavBarnomcli_Backstyle ;
   private byte edtavBarcolnom_Backstyle ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_7 ;
   private short nIsMod_7 ;
   private short nRcdExists_6 ;
   private short nIsMod_6 ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short A2804RecLinMaq ;
   private short AV11Reclinmaq ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short AV43BarPieAgr ;
   private short AV35R ;
   private short GXv_int25[] ;
   private short AV33G ;
   private short GXv_int26[] ;
   private short AV31B ;
   private short GXv_int27[] ;
   private short AV36R2 ;
   private short GXv_int28[] ;
   private short AV34G2 ;
   private short GXv_int29[] ;
   private short AV32B2 ;
   private short GXv_int30[] ;
   private int wcpOAV6Barcod ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_215 ;
   private int subGrid_Rows ;
   private int AV6Barcod ;
   private int nGXsfl_215_idx=1 ;
   private int A129BarCod ;
   private int A119BarAgrCod ;
   private int A252CliCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int lblTexto1_Fontsize ;
   private int lblTexto1_Forecolor ;
   private int lblTexto1_Backcolor ;
   private int edtavBarmaqcod_Enabled ;
   private int edtavMaqcod_Enabled ;
   private int edtavGridcurrentpage_Visible ;
   private int gxdynajaxindex ;
   private int subGrid_Islastpage ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarenccli_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarfecfpr_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavRectotkgm_Enabled ;
   private int edtavDismemo1_Enabled ;
   private int edtavBarenccliagr_Enabled ;
   private int edtavBaragrhdr_Enabled ;
   private int edtavBarseragr_Enabled ;
   private int edtavBarserdscagr_Enabled ;
   private int edtavBarnomcliagr_Enabled ;
   private int edtavBarcolnomagr_Enabled ;
   private int edtavBarkgmagr_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int AV20CliCod ;
   private int GXv_int5[] ;
   private int GXv_int9[] ;
   private int GXv_int11[] ;
   private int GXv_int18[] ;
   private int AV39PageToGo ;
   private int GXv_int22[] ;
   private int edtavBarnomcli_Backcolor ;
   private int edtavBarcolnom_Backcolor ;
   private int edtavBarnomcli_Forecolor ;
   private int edtavBarcolnom_Forecolor ;
   private int edtavBarfasdti_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV41GridPageCount ;
   private long A13234BarRGB ;
   private long AV40GridCurrentPage ;
   private long GRID_nCurrentRecord ;
   private long AV30BarRgb ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal AV42BarKgmAgr ;
   private java.math.BigDecimal AV21BarKgm ;
   private java.math.BigDecimal AV22RecTotKgm ;
   private java.math.BigDecimal GXv_decimal7[] ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal A219BarTotAgr ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV8Barcodpar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_btncambiarmaquina_Result ;
   private String Dvelop_confirmpanel_btneliminarmaquina_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5Emprcod ;
   private String AV8Barcodpar ;
   private String sGXsfl_215_idx="0001" ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A122BarAgrPar ;
   private String A13695BarAGrHdr ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A6039RecAcab ;
   private String A150BarFacTin ;
   private String A279CliNom ;
   private String A135BarColNom ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A180BarMaqCod ;
   private String A187BarNotDsc ;
   private String AV15UsurCod ;
   private String AV13Station ;
   private String AV9MaqCod ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
   private String Dvpanel_unnamedtable4_Width ;
   private String Dvpanel_unnamedtable4_Cls ;
   private String Dvpanel_unnamedtable4_Title ;
   private String Dvpanel_unnamedtable4_Iconposition ;
   private String Gridpaginationbar_Class ;
   private String Gridpaginationbar_Pagingbuttonsposition ;
   private String Gridpaginationbar_Pagingcaptionposition ;
   private String Gridpaginationbar_Emptygridclass ;
   private String Gridpaginationbar_Rowsperpageoptions ;
   private String Gridpaginationbar_Previous ;
   private String Gridpaginationbar_Next ;
   private String Gridpaginationbar_Caption ;
   private String Gridpaginationbar_Emptygridcaption ;
   private String Gridpaginationbar_Rowsperpagecaption ;
   private String Dvelop_confirmpanel_btncambiarmaquina_Title ;
   private String Dvelop_confirmpanel_btncambiarmaquina_Confirmationtext ;
   private String Dvelop_confirmpanel_btncambiarmaquina_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btncambiarmaquina_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btncambiarmaquina_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btncambiarmaquina_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btncambiarmaquina_Confirmtype ;
   private String Dvelop_confirmpanel_btneliminarmaquina_Title ;
   private String Dvelop_confirmpanel_btneliminarmaquina_Confirmationtext ;
   private String Dvelop_confirmpanel_btneliminarmaquina_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminarmaquina_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btneliminarmaquina_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminarmaquina_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btneliminarmaquina_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable17_Internalname ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Internalname ;
   private String edtavBarcodpar_Jsonclick ;
   private String divUnnamedtable18_Internalname ;
   private String lblTexto1_Internalname ;
   private String lblTexto1_Caption ;
   private String lblTexto1_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable14_Internalname ;
   private String divUnnamedtablebarmaqcod_Internalname ;
   private String lblTextblockbarmaqcod_Internalname ;
   private String lblTextblockbarmaqcod_Jsonclick ;
   private String edtavBarmaqcod_Internalname ;
   private String TempTags ;
   private String AV10BarMaqCod ;
   private String edtavBarmaqcod_Jsonclick ;
   private String divUnnamedtable15_Internalname ;
   private String divUnnamedtablemaqcod_Internalname ;
   private String lblTextblockmaqcod_Internalname ;
   private String lblTextblockmaqcod_Jsonclick ;
   private String edtavMaqcod_Internalname ;
   private String edtavMaqcod_Jsonclick ;
   private String divUnnamedtable16_Internalname ;
   private String bttBtncambiarmaquina_Internalname ;
   private String bttBtncambiarmaquina_Jsonclick ;
   private String bttBtneliminarmaquina_Internalname ;
   private String bttBtneliminarmaquina_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGridcurrentpage_Internalname ;
   private String edtavGridcurrentpage_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV47BarEnccliAgr ;
   private String edtavBarenccliagr_Internalname ;
   private String AV37BarAGrHdr ;
   private String edtavBaragrhdr_Internalname ;
   private String AV44BarserAgr ;
   private String edtavBarseragr_Internalname ;
   private String AV48BarSerDscAgr ;
   private String edtavBarserdscagr_Internalname ;
   private String AV49BarNomCliAgr ;
   private String edtavBarnomcliagr_Internalname ;
   private String AV45BarColNomAgr ;
   private String edtavBarcolnomagr_Internalname ;
   private String edtavBarkgmagr_Internalname ;
   private String GXCCtl ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A602MaqCod ;
   private String edtavClicod_Internalname ;
   private String edtavClinom_Internalname ;
   private String edtavBarenccli_Internalname ;
   private String edtavBarcolnom_Internalname ;
   private String edtavBarnomcli_Internalname ;
   private String edtavBarser_Internalname ;
   private String edtavBarserdsc_Internalname ;
   private String edtavBarfecfpr_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavRectotkgm_Internalname ;
   private String edtavDismemo1_Internalname ;
   private String edtavBarfasdti_Internalname ;
   private String AV29CliNom ;
   private String AV28BarEncCli ;
   private String AV26BarColNom ;
   private String AV27BarNomCli ;
   private String AV24BarSer ;
   private String AV25BarSerDsc ;
   private String AV14EmprNom ;
   private String GXt_char1 ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char10[] ;
   private String GXv_char13[] ;
   private String AV16Ok ;
   private String AV12MaqcodNueva ;
   private String GXv_char24[] ;
   private String GXv_char21[] ;
   private String GXv_char20[] ;
   private String GXv_char17[] ;
   private String GXv_char16[] ;
   private String tblTabledvelop_confirmpanel_btneliminarmaquina_Internalname ;
   private String Dvelop_confirmpanel_btneliminarmaquina_Internalname ;
   private String tblTabledvelop_confirmpanel_btncambiarmaquina_Internalname ;
   private String Dvelop_confirmpanel_btncambiarmaquina_Internalname ;
   private String tblUnnamedtable4_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtableclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String edtavClicod_Jsonclick ;
   private String divUnnamedtableclinom_Internalname ;
   private String lblTextblockclinom_Internalname ;
   private String lblTextblockclinom_Jsonclick ;
   private String edtavClinom_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String divUnnamedtablebarenccli_Internalname ;
   private String lblTextblockbarenccli_Internalname ;
   private String lblTextblockbarenccli_Jsonclick ;
   private String edtavBarenccli_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtablebarcolnom_Internalname ;
   private String lblTextblockbarcolnom_Internalname ;
   private String lblTextblockbarcolnom_Jsonclick ;
   private String edtavBarcolnom_Jsonclick ;
   private String divUnnamedtablebarnomcli_Internalname ;
   private String lblTextblockbarnomcli_Internalname ;
   private String lblTextblockbarnomcli_Jsonclick ;
   private String edtavBarnomcli_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String divUnnamedtablebarser_Internalname ;
   private String lblTextblockbarser_Internalname ;
   private String lblTextblockbarser_Jsonclick ;
   private String edtavBarser_Jsonclick ;
   private String divUnnamedtablebarserdsc_Internalname ;
   private String lblTextblockbarserdsc_Internalname ;
   private String lblTextblockbarserdsc_Jsonclick ;
   private String edtavBarserdsc_Jsonclick ;
   private String divUnnamedtable9_Internalname ;
   private String divUnnamedtablebarfecfpr_Internalname ;
   private String lblTextblockbarfecfpr_Internalname ;
   private String lblTextblockbarfecfpr_Jsonclick ;
   private String edtavBarfecfpr_Jsonclick ;
   private String divUnnamedtable10_Internalname ;
   private String divUnnamedtablebarkgm_Internalname ;
   private String lblTextblockbarkgm_Internalname ;
   private String lblTextblockbarkgm_Jsonclick ;
   private String edtavBarkgm_Jsonclick ;
   private String divUnnamedtablerectotkgm_Internalname ;
   private String lblTextblockrectotkgm_Internalname ;
   private String lblTextblockrectotkgm_Jsonclick ;
   private String edtavRectotkgm_Jsonclick ;
   private String divUnnamedtable11_Internalname ;
   private String divUnnamedtabledismemo1_Internalname ;
   private String lblTextblockdismemo1_Internalname ;
   private String lblTextblockdismemo1_Jsonclick ;
   private String divUnnamedtable12_Internalname ;
   private String bttBtnobservaciones_Internalname ;
   private String bttBtnobservaciones_Jsonclick ;
   private String tblUnnamedtable3_Internalname ;
   private String divUnnamedtable13_Internalname ;
   private String divUnnamedtablebarfasest_Internalname ;
   private String lblTextblockbarfasest_Internalname ;
   private String lblTextblockbarfasest_Jsonclick ;
   private String divUnnamedtablebarfasdti_Internalname ;
   private String lblTextblockbarfasdti_Internalname ;
   private String lblTextblockbarfasdti_Jsonclick ;
   private String edtavBarfasdti_Jsonclick ;
   private String sGXsfl_215_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavBarenccliagr_Jsonclick ;
   private String edtavBaragrhdr_Jsonclick ;
   private String edtavBarseragr_Jsonclick ;
   private String edtavBarserdscagr_Jsonclick ;
   private String edtavBarnomcliagr_Jsonclick ;
   private String edtavBarcolnomagr_Jsonclick ;
   private String edtavBarkgmagr_Jsonclick ;
   private String subGrid_Header ;
   private String ZV9MaqCod ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date AV19BarFasDTI ;
   private java.util.Date A158BarFecFpr ;
   private java.util.Date AV23BarFecFpr ;
   private java.util.Date AV46fec1 ;
   private java.util.Date GXv_date14[] ;
   private java.util.Date GXv_date19[] ;
   private java.util.Date GXv_date23[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
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
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Dvpanel_unnamedtable4_Autowidth ;
   private boolean Dvpanel_unnamedtable4_Autoheight ;
   private boolean Dvpanel_unnamedtable4_Collapsible ;
   private boolean Dvpanel_unnamedtable4_Collapsed ;
   private boolean Dvpanel_unnamedtable4_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable4_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_215_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n252CliCod ;
   private boolean n219BarTotAgr ;
   private boolean n6039RecAcab ;
   private boolean n4442BarFasDTI ;
   private String A13734MaqCDsc ;
   private String hV9MaqCod ;
   private String l13734MaqCDsc ;
   private String AV50DisMemo1 ;
   private String ZhV9MaqCod ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btneliminarmaquina ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btncambiarmaquina ;
   private HTMLChoice cmbavBarfasest ;
   private IDataStoreProvider pr_default ;
   private String[] H00N12_A13734MaqCDsc ;
   private String[] H00N13_A13734MaqCDsc ;
   private String[] H00N13_A396EmprCod ;
   private String[] H00N13_A602MaqCod ;
   private String[] H00N14_A13734MaqCDsc ;
   private String[] H00N14_A396EmprCod ;
   private String[] H00N14_A602MaqCod ;
   private String[] H00N15_A130BarCodPar ;
   private byte[] H00N15_A132BarCodReo ;
   private int[] H00N15_A129BarCod ;
   private String[] H00N15_A396EmprCod ;
   private String[] H00N15_A122BarAgrPar ;
   private byte[] H00N15_A124BarAgrReo ;
   private int[] H00N15_A119BarAgrCod ;
   private String[] H00N18_A130BarCodPar ;
   private byte[] H00N18_A132BarCodReo ;
   private int[] H00N18_A129BarCod ;
   private String[] H00N18_A396EmprCod ;
   private int[] H00N18_A252CliCod ;
   private boolean[] H00N18_n252CliCod ;
   private String[] H00N18_A279CliNom ;
   private String[] H00N18_A135BarColNom ;
   private String[] H00N18_A4812BarEncCli ;
   private java.util.Date[] H00N18_A158BarFecFpr ;
   private String[] H00N18_A1234BarNomCli ;
   private String[] H00N18_A212BarSer ;
   private String[] H00N18_A1652BarSerDsc ;
   private String[] H00N18_A180BarMaqCod ;
   private long[] H00N18_A13234BarRGB ;
   private java.math.BigDecimal[] H00N18_A166BarKgm ;
   private java.math.BigDecimal[] H00N18_A219BarTotAgr ;
   private boolean[] H00N18_n219BarTotAgr ;
   private String[] H00N19_A396EmprCod ;
   private int[] H00N19_A129BarCod ;
   private byte[] H00N19_A132BarCodReo ;
   private String[] H00N19_A130BarCodPar ;
   private String[] H00N19_A6039RecAcab ;
   private boolean[] H00N19_n6039RecAcab ;
   private short[] H00N19_A2804RecLinMaq ;
   private String[] H00N110_A758ProCod ;
   private short[] H00N110_A194BarOrdLin ;
   private String[] H00N110_A396EmprCod ;
   private int[] H00N110_A129BarCod ;
   private byte[] H00N110_A132BarCodReo ;
   private String[] H00N110_A130BarCodPar ;
   private String[] H00N110_A150BarFacTin ;
   private byte[] H00N110_A153BarFasEst ;
   private java.util.Date[] H00N110_A4442BarFasDTI ;
   private boolean[] H00N110_n4442BarFasDTI ;
   private String[] H00N111_A396EmprCod ;
   private int[] H00N111_A129BarCod ;
   private byte[] H00N111_A132BarCodReo ;
   private String[] H00N111_A130BarCodPar ;
   private String[] H00N111_A187BarNotDsc ;
   private byte[] H00N111_A188BarNotLin ;
   private String[] H00N112_A13734MaqCDsc ;
   private String[] H00N112_A396EmprCod ;
   private String[] H00N112_A602MaqCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXSimpleCollection<String> AV51Objeto ;
}

final  class webdatoshdr__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00N12", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc FROM TXPMAQUIN WHERE UPPER(RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, '')))) like '%' || UPPER(?)) WHERE rownum <= 10 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00N13", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00N14", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00N15", "SELECT BarCodPar, BarCodReo, BarCod, EmprCod, BarAgrPar, BarAgrReo, BarAgrCod FROM TXPBARAGR WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarAgrCod, BarAgrReo, BarAgrPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00N18", "SELECT T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.CliCod, T4.CliNom, T1.BarColNom, T1.BarEncCli, T1.BarFecFpr, T1.BarNomCli, T1.BarSer, T1.BarSerDsc, T1.BarMaqCod, T1.BarRGB, COALESCE( T2.BarKgm, 0) AS BarKgm, COALESCE( T3.BarTotAgr, 0) AS BarTotAgr FROM (((TXPBARCAD T1 LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T4 ON T4.EmprCod = T1.EmprCod AND T4.CliCod = T1.CliCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00N19", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, RecAcab, RecLinMaq FROM TXPRECMAQ WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, RecLinMaq ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00N110", "SELECT ProCod, BarOrdLin, EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarFasEst, BarFasDTI FROM TXPBARFAS WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00N111", "SELECT EmprCod, BarCod, BarCodReo, BarCodPar, BarNotDsc, BarNotLin FROM TXPBARNOT WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar, BarNotLin ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00N112", "SELECT RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) AS MaqCDsc, EmprCod, MaqCod FROM TXPMAQUIN WHERE RTRIM(LTRIM(MaqCod)) || '-' || RTRIM(LTRIM(COALESCE( MaqDsc, ''))) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               return;
            case 1 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               return;
            case 4 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 3);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 20);
               ((java.util.Date[]) buf[9])[0] = rslt.getGXDate(9);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 16);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               ((String[]) buf[13])[0] = rslt.getString(13, 6);
               ((long[]) buf[14])[0] = rslt.getLong(14);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((java.math.BigDecimal[]) buf[16])[0] = rslt.getBigDecimal(16,2);
               ((boolean[]) buf[17])[0] = rslt.wasNull();
               return;
            case 5 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((short[]) buf[6])[0] = rslt.getShort(6);
               return;
            case 6 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((short[]) buf[1])[0] = rslt.getShort(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 1);
               ((String[]) buf[6])[0] = rslt.getString(7, 1);
               ((byte[]) buf[7])[0] = rslt.getByte(8);
               ((java.util.Date[]) buf[8])[0] = rslt.getGXDateTime(9);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               return;
            case 7 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 65);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               return;
            case 8 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 6);
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
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 2 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 5 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 7 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 8 :
               stmt.setVarchar(1, (String)parms[0], 40);
               return;
      }
   }

}

