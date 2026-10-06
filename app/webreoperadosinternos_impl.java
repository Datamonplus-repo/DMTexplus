package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webreoperadosinternos_impl extends GXDataArea
{
   public webreoperadosinternos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webreoperadosinternos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webreoperadosinternos_impl.class ));
   }

   public webreoperadosinternos_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavRctinte = UIFactory.getCheckbox(this);
      chkavRcacabado = UIFactory.getCheckbox(this);
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
      nRC_GXsfl_49 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_49"))) ;
      nGXsfl_49_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_49_idx"))) ;
      sGXsfl_49_idx = httpContext.GetPar( "sGXsfl_49_idx") ;
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
      A13696BarNHdr = httpContext.GetPar( "BarNHdr") ;
      AV12Emprcod = httpContext.GetPar( "Emprcod") ;
      AV5BarNHdr = httpContext.GetPar( "BarNHdr") ;
      A279CliNom = httpContext.GetPar( "CliNom") ;
      AV13CliNom1 = httpContext.GetPar( "CliNom1") ;
      A213BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
      A212BarSer = httpContext.GetPar( "BarSer") ;
      A1652BarSerDsc = httpContext.GetPar( "BarSerDsc") ;
      A135BarColNom = httpContext.GetPar( "BarColNom") ;
      AV25Barcolnum = (int)(GXutil.lval( httpContext.GetPar( "Barcolnum"))) ;
      A166BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
      A184BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
      A198BarPie = (int)(GXutil.lval( httpContext.GetPar( "BarPie"))) ;
      A120BarAgrEst = httpContext.GetPar( "BarAgrEst") ;
      A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
      A228BarUniMed = httpContext.GetPar( "BarUniMed") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A13696BarNHdr, AV12Emprcod, AV5BarNHdr, A279CliNom, AV13CliNom1, A213BarSit, A212BarSer, A1652BarSerDsc, A135BarColNom, AV25Barcolnum, A166BarKgm, A184BarMtr, A198BarPie, A120BarAgrEst, A129BarCod, A132BarCodReo, A130BarCodPar, A228BarUniMed) ;
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
      paEB2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startEB2( ) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webreoperadosinternos", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Barcolnum), "ZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_49", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_49, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV11GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "BARNHDR", GXutil.rtrim( A13696BarNHdr));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV12Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "CLINOM", GXutil.rtrim( A279CliNom));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSIT", GXutil.ltrim( localUtil.ntoc( A213BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSER", GXutil.rtrim( A212BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "BARSERDSC", GXutil.rtrim( A1652BarSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOLNOM", GXutil.rtrim( A135BarColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV25Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Barcolnum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARKGM", GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARMTR", GXutil.ltrim( localUtil.ntoc( A184BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGREST", GXutil.rtrim( A120BarAgrEst));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARUNIMED", GXutil.rtrim( A228BarUniMed));
      app.GxWebStd.gx_hidden_field( httpContext, "vERR_", GXutil.ltrim( localUtil.ntoc( AV41Err_, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV38UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV39Station));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIENDES", GXutil.ltrim( localUtil.ntoc( A898BarPieNDes, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DISDES", GXutil.rtrim( A365DisDes));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE1", GXutil.ltrim( localUtil.ntoc( A199BarPie1, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARPIE", GXutil.ltrim( localUtil.ntoc( A198BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
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
         weEB2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtEB2( ) ;
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
      return formatLink("app.webreoperadosinternos", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebReoperadosInternos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Web Reoperados Internos", "") ;
   }

   public void wbEB0( )
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
         wb_table1_17_EB2( true) ;
      }
      else
      {
         wb_table1_17_EB2( false) ;
      }
      return  ;
   }

   public void wb_table1_17_EB2e( boolean wbgen )
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
         wb_table2_41_EB2( true) ;
      }
      else
      {
         wb_table2_41_EB2( false) ;
      }
      return  ;
   }

   public void wb_table2_41_EB2e( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 76,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV10GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV10GridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,76);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebReoperadosInternos.htm");
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 49 )
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

   public void startEB2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Web Reoperados Internos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupEB0( ) ;
   }

   public void wsEB2( )
   {
      startEB2( ) ;
      evtEB2( ) ;
   }

   public void evtEB2( )
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
                           e11EB2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12EB2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VELIMINAR.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VELIMINAR.CLICK") == 0 ) )
                        {
                           nGXsfl_49_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_492( ) ;
                           AV30CrearRI = httpContext.cgiGet( edtavCrearri_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavCrearri_Internalname, "Bitmap", ((GXutil.strcmp("", AV30CrearRI)==0) ? AV45Crearri_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV30CrearRI))), !bGXsfl_49_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavCrearri_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV30CrearRI), true);
                           AV37Eliminar = httpContext.cgiGet( edtavEliminar_Internalname) ;
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "Bitmap", ((GXutil.strcmp("", AV37Eliminar)==0) ? AV46Eliminar_GXI : httpContext.convertURL( httpContext.getResourceRelative(AV37Eliminar))), !bGXsfl_49_Refreshing);
                           httpContext.ajax_rsp_assign_prop("", false, edtavEliminar_Internalname, "SrcSet", context.getHttpContext().getImageSrcSet( AV37Eliminar), true);
                           AV6BarNHdr1 = httpContext.cgiGet( edtavBarnhdr1_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarnhdr1_Internalname, AV6BarNHdr1);
                           AV7CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV7CliNom);
                           AV14BarSer = httpContext.cgiGet( edtavBarser_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV14BarSer);
                           AV15BarSerDsc = httpContext.cgiGet( edtavBarserdsc_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV15BarSerDsc);
                           AV16BarColNom = httpContext.cgiGet( edtavBarcolnom_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV16BarColNom);
                           AV17BarNomCli = httpContext.cgiGet( edtavBarnomcli_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarnomcli_Internalname, AV17BarNomCli);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARKGM");
                              GX_FocusControl = edtavBarkgm_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV18BarKgm = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV18BarKgm, 9, 2));
                           }
                           else
                           {
                              AV18BarKgm = localUtil.ctond( httpContext.cgiGet( edtavBarkgm_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV18BarKgm, 9, 2));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARMTR");
                              GX_FocusControl = edtavBarmtr_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV19BarMtr = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarmtr_Internalname, GXutil.ltrimstr( AV19BarMtr, 9, 2));
                           }
                           else
                           {
                              AV19BarMtr = localUtil.ctond( httpContext.cgiGet( edtavBarmtr_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarmtr_Internalname, GXutil.ltrimstr( AV19BarMtr, 9, 2));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARPIE");
                              GX_FocusControl = edtavBarpie_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV20BarPie = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarpie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarPie), 6, 0));
                           }
                           else
                           {
                              AV20BarPie = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarpie_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarpie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarPie), 6, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARSIT");
                              GX_FocusControl = edtavBarsit_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV21BarSit = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarsit_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarSit), 2, 0));
                           }
                           else
                           {
                              AV21BarSit = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarsit_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarsit_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarSit), 2, 0));
                           }
                           AV22BarAgrEst = GXutil.upper( httpContext.cgiGet( edtavBaragrest_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBaragrest_Internalname, AV22BarAgrEst);
                           AV23RcTinte = ((GXutil.strcmp(httpContext.cgiGet( chkavRctinte.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavRctinte.getInternalname(), AV23RcTinte);
                           AV24RcAcabado = ((GXutil.strcmp(httpContext.cgiGet( chkavRcacabado.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavRcacabado.getInternalname(), AV24RcAcabado);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCOD");
                              GX_FocusControl = edtavBarcod_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV31BarCod = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarCod), 8, 0));
                           }
                           else
                           {
                              AV31BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarCod), 8, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCODREO");
                              GX_FocusControl = edtavBarcodreo_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV32BarCodReo = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV32BarCodReo, 1, 0));
                           }
                           else
                           {
                              AV32BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV32BarCodReo, 1, 0));
                           }
                           AV33BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarcodpar_Internalname, AV33BarCodPar);
                           AV34BarUniMed = GXutil.upper( httpContext.cgiGet( edtavBarunimed_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarunimed_Internalname, AV34BarUniMed);
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavBarconreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavBarconreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vBARCONREO");
                              GX_FocusControl = edtavBarconreo_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV36BarConReo = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarconreo_Internalname, GXutil.str( AV36BarConReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCONREO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, localUtil.format( DecimalUtil.doubleToDec(AV36BarConReo), "9")));
                           }
                           else
                           {
                              AV36BarConReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarconreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavBarconreo_Internalname, GXutil.str( AV36BarConReo, 1, 0));
                              app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCONREO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, localUtil.format( DecimalUtil.doubleToDec(AV36BarConReo), "9")));
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
                                 e13EB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e14EB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e15EB2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VELIMINAR.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e16EB2 ();
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

   public void weEB2( )
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

   public void paEB2( )
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
            GX_FocusControl = edtavBarnhdr_Internalname ;
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
      subsflControlProps_492( ) ;
      while ( nGXsfl_49_idx <= nRC_GXsfl_49 )
      {
         sendrow_492( ) ;
         nGXsfl_49_idx = ((subGrid_Islastpage==1)&&(nGXsfl_49_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_49_idx+1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 String A13696BarNHdr ,
                                 String AV12Emprcod ,
                                 String AV5BarNHdr ,
                                 String A279CliNom ,
                                 String AV13CliNom1 ,
                                 byte A213BarSit ,
                                 String A212BarSer ,
                                 String A1652BarSerDsc ,
                                 String A135BarColNom ,
                                 int AV25Barcolnum ,
                                 java.math.BigDecimal A166BarKgm ,
                                 java.math.BigDecimal A184BarMtr ,
                                 int A198BarPie ,
                                 String A120BarAgrEst ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String A228BarUniMed )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e14EB2 ();
      GRID_nCurrentRecord = 0 ;
      rfEB2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCONREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV36BarConReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCONREO", GXutil.ltrim( localUtil.ntoc( AV36BarConReo, (byte)(1), (byte)(0), ".", "")));
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
      rfEB2( ) ;
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
      edtavBarnhdr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr1_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarsit_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      chkavRctinte.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavRctinte.getInternalname(), "Enabled", GXutil.ltrimstr( chkavRctinte.getEnabled(), 5, 0), !bGXsfl_49_Refreshing);
      chkavRcacabado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavRcacabado.getInternalname(), "Enabled", GXutil.ltrimstr( chkavRcacabado.getEnabled(), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarconreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarconreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarconreo_Enabled), 5, 0), !bGXsfl_49_Refreshing);
   }

   public void rfEB2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(49) ;
      /* Execute user event: Refresh */
      e14EB2 ();
      nGXsfl_49_idx = 1 ;
      sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_492( ) ;
      bGXsfl_49_Refreshing = true ;
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
         subsflControlProps_492( ) ;
         e15EB2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_49_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e15EB2 ();
         }
         wbEnd = (short)(49) ;
         wbEB0( ) ;
      }
      bGXsfl_49_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesEB2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOLNUM", GXutil.ltrim( localUtil.ntoc( AV25Barcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Barcolnum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCONREO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, localUtil.format( DecimalUtil.doubleToDec(AV36BarConReo), "9")));
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A13696BarNHdr, AV12Emprcod, AV5BarNHdr, A279CliNom, AV13CliNom1, A213BarSit, A212BarSer, A1652BarSerDsc, A135BarColNom, AV25Barcolnum, A166BarKgm, A184BarMtr, A198BarPie, A120BarAgrEst, A129BarCod, A132BarCodReo, A130BarCodPar, A228BarUniMed) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A13696BarNHdr, AV12Emprcod, AV5BarNHdr, A279CliNom, AV13CliNom1, A213BarSit, A212BarSer, A1652BarSerDsc, A135BarColNom, AV25Barcolnum, A166BarKgm, A184BarMtr, A198BarPie, A120BarAgrEst, A129BarCod, A132BarCodReo, A130BarCodPar, A228BarUniMed) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A13696BarNHdr, AV12Emprcod, AV5BarNHdr, A279CliNom, AV13CliNom1, A213BarSit, A212BarSer, A1652BarSerDsc, A135BarColNom, AV25Barcolnum, A166BarKgm, A184BarMtr, A198BarPie, A120BarAgrEst, A129BarCod, A132BarCodReo, A130BarCodPar, A228BarUniMed) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      subGrid_Islastpage = 1 ;
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A13696BarNHdr, AV12Emprcod, AV5BarNHdr, A279CliNom, AV13CliNom1, A213BarSit, A212BarSer, A1652BarSerDsc, A135BarColNom, AV25Barcolnum, A166BarKgm, A184BarMtr, A198BarPie, A120BarAgrEst, A129BarCod, A132BarCodReo, A130BarCodPar, A228BarUniMed) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A13696BarNHdr, AV12Emprcod, AV5BarNHdr, A279CliNom, AV13CliNom1, A213BarSit, A212BarSer, A1652BarSerDsc, A135BarColNom, AV25Barcolnum, A166BarKgm, A184BarMtr, A198BarPie, A120BarAgrEst, A129BarCod, A132BarCodReo, A130BarCodPar, A228BarUniMed) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavBarnhdr1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr1_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarser_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarserdsc_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnom_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcli_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarkgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgm_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarmtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarmtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarmtr_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarpie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarpie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarpie_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarsit_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarsit_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarsit_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBaragrest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBaragrest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBaragrest_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      chkavRctinte.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavRctinte.getInternalname(), "Enabled", GXutil.ltrimstr( chkavRctinte.getEnabled(), 5, 0), !bGXsfl_49_Refreshing);
      chkavRcacabado.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, chkavRcacabado.getInternalname(), "Enabled", GXutil.ltrimstr( chkavRcacabado.getEnabled(), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarunimed_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavBarconreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarconreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarconreo_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupEB0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13EB2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_49 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_49"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV11GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         AV5BarNHdr = httpContext.cgiGet( edtavBarnhdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5BarNHdr", AV5BarNHdr);
         AV13CliNom1 = httpContext.cgiGet( edtavClinom1_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13CliNom1", AV13CliNom1);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDCURRENTPAGE");
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10GridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10GridCurrentPage), 10, 0));
         }
         else
         {
            AV10GridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10GridCurrentPage), 10, 0));
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
      e13EB2 ();
      if (returnInSub) return;
   }

   public void e13EB2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV39Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webreoperadosinternos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV39Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Station", AV39Station);
      GXv_char2[0] = AV12Emprcod ;
      GXv_char3[0] = AV40EmprNom ;
      GXv_char4[0] = AV38UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char2, GXv_char3, GXv_char4) ;
      webreoperadosinternos_impl.this.AV12Emprcod = GXv_char2[0] ;
      webreoperadosinternos_impl.this.AV40EmprNom = GXv_char3[0] ;
      webreoperadosinternos_impl.this.AV38UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Emprcod", AV12Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV38UsurCod", AV38UsurCod);
      GXt_char1 = AV39Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webreoperadosinternos_impl.this.GXt_char1 = GXv_char4[0] ;
      AV39Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Station", AV39Station);
      GXv_char4[0] = AV12Emprcod ;
      GXv_char3[0] = AV40EmprNom ;
      GXv_char2[0] = AV38UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV39Station, GXv_char4, GXv_char3, GXv_char2) ;
      webreoperadosinternos_impl.this.AV12Emprcod = GXv_char4[0] ;
      webreoperadosinternos_impl.this.AV40EmprNom = GXv_char3[0] ;
      webreoperadosinternos_impl.this.AV38UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12Emprcod", AV12Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV38UsurCod", AV38UsurCod);
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV10GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10GridCurrentPage), 10, 0));
      edtavGridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridcurrentpage_Visible), 5, 0), true);
      AV11GridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11GridPageCount), 10, 0));
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e14EB2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
   }

   private void e15EB2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      edtavCrearri_gximage = "ActionAdd" ;
      AV30CrearRI = context.getHttpContext().getImagePath( "2d95db53-4248-43dc-b91a-bbea3e793fad", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavCrearri_Internalname, AV30CrearRI);
      AV45Crearri_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "2d95db53-4248-43dc-b91a-bbea3e793fad", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      edtavCrearri_Tooltiptext = "" ;
      edtavCrearri_Link = formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {})  ;
      edtavEliminar_gximage = "ActionDelete" ;
      AV37Eliminar = context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavEliminar_Internalname, AV37Eliminar);
      AV46Eliminar_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "7695fe89-52c9-4b7e-871e-0e11548f823e", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      edtavEliminar_Tooltiptext = "" ;
      edtavEliminar_Link = formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {})  ;
      lV5BarNHdr = GXutil.padr( GXutil.rtrim( AV5BarNHdr), 11, "%") ;
      lV13CliNom1 = GXutil.padr( GXutil.rtrim( AV13CliNom1), 30, "%") ;
      /* Using cursor H00EB3 */
      pr_default.execute(0, new Object[] {AV12Emprcod, lV5BarNHdr, AV5BarNHdr, lV13CliNom1, AV13CliNom1});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A252CliCod = H00EB3_A252CliCod[0] ;
         n252CliCod = H00EB3_n252CliCod[0] ;
         A396EmprCod = H00EB3_A396EmprCod[0] ;
         A213BarSit = H00EB3_A213BarSit[0] ;
         A279CliNom = H00EB3_A279CliNom[0] ;
         A13696BarNHdr = H00EB3_A13696BarNHdr[0] ;
         A212BarSer = H00EB3_A212BarSer[0] ;
         A1652BarSerDsc = H00EB3_A1652BarSerDsc[0] ;
         A135BarColNom = H00EB3_A135BarColNom[0] ;
         A120BarAgrEst = H00EB3_A120BarAgrEst[0] ;
         A228BarUniMed = H00EB3_A228BarUniMed[0] ;
         A129BarCod = H00EB3_A129BarCod[0] ;
         A132BarCodReo = H00EB3_A132BarCodReo[0] ;
         A130BarCodPar = H00EB3_A130BarCodPar[0] ;
         A166BarKgm = H00EB3_A166BarKgm[0] ;
         A184BarMtr = H00EB3_A184BarMtr[0] ;
         A199BarPie1 = H00EB3_A199BarPie1[0] ;
         A365DisDes = H00EB3_A365DisDes[0] ;
         A898BarPieNDes = H00EB3_A898BarPieNDes[0] ;
         A279CliNom = H00EB3_A279CliNom[0] ;
         A166BarKgm = H00EB3_A166BarKgm[0] ;
         A184BarMtr = H00EB3_A184BarMtr[0] ;
         A199BarPie1 = H00EB3_A199BarPie1[0] ;
         A898BarPieNDes = H00EB3_A898BarPieNDes[0] ;
         if ( GXutil.strcmp(A365DisDes, httpContext.getMessage( "N", "")) == 0 )
         {
            A198BarPie = A898BarPieNDes ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         else
         {
            A198BarPie = A199BarPie1 ;
            httpContext.ajax_rsp_assign_attri("", false, "A198BarPie", GXutil.ltrimstr( DecimalUtil.doubleToDec(A198BarPie), 6, 0));
         }
         AV6BarNHdr1 = A13696BarNHdr ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarnhdr1_Internalname, AV6BarNHdr1);
         AV7CliNom = A279CliNom ;
         httpContext.ajax_rsp_assign_attri("", false, edtavClinom_Internalname, AV7CliNom);
         AV14BarSer = A212BarSer ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarser_Internalname, AV14BarSer);
         AV15BarSerDsc = A1652BarSerDsc ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarserdsc_Internalname, AV15BarSerDsc);
         AV16BarColNom = A135BarColNom ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnom_Internalname, AV16BarColNom);
         httpContext.ajax_rsp_assign_attri("", false, "AV25Barcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25Barcolnum), 6, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV25Barcolnum), "ZZZZZ9")));
         AV18BarKgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarkgm_Internalname, GXutil.ltrimstr( AV18BarKgm, 9, 2));
         AV19BarMtr = A184BarMtr ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarmtr_Internalname, GXutil.ltrimstr( AV19BarMtr, 9, 2));
         AV20BarPie = A198BarPie ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarpie_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarPie), 6, 0));
         AV21BarSit = A213BarSit ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarsit_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21BarSit), 2, 0));
         AV22BarAgrEst = A120BarAgrEst ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBaragrest_Internalname, AV22BarAgrEst);
         AV31BarCod = A129BarCod ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarCod), 8, 0));
         AV32BarCodReo = A132BarCodReo ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV32BarCodReo, 1, 0));
         AV33BarCodPar = A130BarCodPar ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarcodpar_Internalname, AV33BarCodPar);
         AV34BarUniMed = A228BarUniMed ;
         httpContext.ajax_rsp_assign_attri("", false, edtavBarunimed_Internalname, AV34BarUniMed);
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_int6[0] = AV36BarConReo ;
         new app.ultimoreoperado(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_char3, GXv_int6) ;
         webreoperadosinternos_impl.this.A396EmprCod = GXv_char4[0] ;
         webreoperadosinternos_impl.this.A129BarCod = GXv_int5[0] ;
         webreoperadosinternos_impl.this.A130BarCodPar = GXv_char3[0] ;
         webreoperadosinternos_impl.this.AV36BarConReo = GXv_int6[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, edtavBarconreo_Internalname, GXutil.str( AV36BarConReo, 1, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARCONREO"+"_"+sGXsfl_49_idx, getSecureSignedToken( sGXsfl_49_idx, localUtil.format( DecimalUtil.doubleToDec(AV36BarConReo), "9")));
         GXv_char4[0] = A396EmprCod ;
         GXv_int5[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char3[0] = A130BarCodPar ;
         GXv_int7[0] = (byte)(AV26FlagRec) ;
         GXv_char2[0] = AV27Msghayrcta ;
         GXv_char8[0] = AV24RcAcabado ;
         GXv_char9[0] = AV23RcTinte ;
         new app.phayrcta(remoteHandle, context).execute( GXv_char4, GXv_int5, GXv_int6, GXv_char3, GXv_int7, GXv_char2, GXv_char8, GXv_char9) ;
         webreoperadosinternos_impl.this.A396EmprCod = GXv_char4[0] ;
         webreoperadosinternos_impl.this.A129BarCod = GXv_int5[0] ;
         webreoperadosinternos_impl.this.A132BarCodReo = GXv_int6[0] ;
         webreoperadosinternos_impl.this.A130BarCodPar = GXv_char3[0] ;
         webreoperadosinternos_impl.this.AV26FlagRec = GXv_int7[0] ;
         webreoperadosinternos_impl.this.AV27Msghayrcta = GXv_char2[0] ;
         webreoperadosinternos_impl.this.AV24RcAcabado = GXv_char8[0] ;
         webreoperadosinternos_impl.this.AV23RcTinte = GXv_char9[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, chkavRcacabado.getInternalname(), AV24RcAcabado);
         httpContext.ajax_rsp_assign_attri("", false, chkavRctinte.getInternalname(), AV23RcTinte);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(49) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_492( ) ;
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
         if ( isFullAjaxMode( ) && ! bGXsfl_49_Refreshing )
         {
            httpContext.doAjaxLoad(49, GridRow);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
      /*  Sending Event outputs  */
   }

   public void e11EB2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV10GridCurrentPage = (long)(AV10GridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10GridCurrentPage), 10, 0));
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV10GridCurrentPage = (long)(AV10GridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10GridCurrentPage), 10, 0));
         subgrid_nextpage( ) ;
      }
      else
      {
         AV9PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         AV10GridCurrentPage = AV9PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10GridCurrentPage), 10, 0));
         subgrid_gotopage( AV9PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e12EB2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV10GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10GridCurrentPage), 10, 0));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e16EB2( )
   {
      /* Eliminar_Click Routine */
      returnInSub = false ;
      if ( AV32BarCodReo == 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO es una Reoperado Interno", ""));
      }
      else
      {
         if ( AV36BarConReo != AV32BarCodReo )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Hay reoperados posteriores. No es posible recuperar", ""));
         }
         else
         {
            GXv_char9[0] = AV12Emprcod ;
            GXv_int5[0] = AV31BarCod ;
            GXv_int7[0] = AV32BarCodReo ;
            GXv_char8[0] = AV33BarCodPar ;
            GXv_int6[0] = (byte)(AV41Err_) ;
            GXv_char4[0] = AV38UsurCod ;
            GXv_char3[0] = AV39Station ;
            new app.prevreo(remoteHandle, context).execute( GXv_char9, GXv_int5, GXv_int7, GXv_char8, GXv_int6, GXv_char4, GXv_char3) ;
            webreoperadosinternos_impl.this.AV12Emprcod = GXv_char9[0] ;
            webreoperadosinternos_impl.this.AV31BarCod = GXv_int5[0] ;
            webreoperadosinternos_impl.this.AV32BarCodReo = GXv_int7[0] ;
            webreoperadosinternos_impl.this.AV33BarCodPar = GXv_char8[0] ;
            webreoperadosinternos_impl.this.AV41Err_ = GXv_int6[0] ;
            webreoperadosinternos_impl.this.AV38UsurCod = GXv_char4[0] ;
            webreoperadosinternos_impl.this.AV39Station = GXv_char3[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12Emprcod", AV12Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavBarcodreo_Internalname, GXutil.str( AV32BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, edtavBarcodpar_Internalname, AV33BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV41Err_", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41Err_), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV38UsurCod", AV38UsurCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV39Station", AV39Station);
         }
      }
      /*  Sending Event outputs  */
   }

   public void wb_table2_41_EB2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable2_Internalname, tblUnnamedtable2_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "HasGridEmpowerer", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol49( ) ;
      }
      if ( wbEnd == 49 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_49 = (int)(nGXsfl_49_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV10GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV11GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_41_EB2e( true) ;
      }
      else
      {
         wb_table2_41_EB2e( false) ;
      }
   }

   public void wb_table1_17_EB2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable1_Internalname, tblUnnamedtable1_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarnhdr_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarnhdr_Internalname, httpContext.getMessage( "N Hdr", ""), "", "", lblTextblockbarnhdr_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "Bar NHdr", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV5BarNHdr), GXutil.rtrim( localUtil.format( AV5BarNHdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclinom1_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclinom1_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclinom1_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebReoperadosInternos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom1_Internalname, httpContext.getMessage( "Nombre (cont)", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom1_Internalname, GXutil.rtrim( AV13CliNom1), GXutil.rtrim( localUtil.format( AV13CliNom1, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom1_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom1_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebReoperadosInternos.htm");
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
         wb_table1_17_EB2e( true) ;
      }
      else
      {
         wb_table1_17_EB2e( false) ;
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
      paEB2( ) ;
      wsEB2( ) ;
      weEB2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267101111812", true, true);
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
         httpContext.AddJavascriptSource("webreoperadosinternos.js", "?20267101111812", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_492( )
   {
      edtavCrearri_Internalname = "vCREARRI_"+sGXsfl_49_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_49_idx ;
      edtavBarnhdr1_Internalname = "vBARNHDR1_"+sGXsfl_49_idx ;
      edtavClinom_Internalname = "vCLINOM_"+sGXsfl_49_idx ;
      edtavBarser_Internalname = "vBARSER_"+sGXsfl_49_idx ;
      edtavBarserdsc_Internalname = "vBARSERDSC_"+sGXsfl_49_idx ;
      edtavBarcolnom_Internalname = "vBARCOLNOM_"+sGXsfl_49_idx ;
      edtavBarnomcli_Internalname = "vBARNOMCLI_"+sGXsfl_49_idx ;
      edtavBarkgm_Internalname = "vBARKGM_"+sGXsfl_49_idx ;
      edtavBarmtr_Internalname = "vBARMTR_"+sGXsfl_49_idx ;
      edtavBarpie_Internalname = "vBARPIE_"+sGXsfl_49_idx ;
      edtavBarsit_Internalname = "vBARSIT_"+sGXsfl_49_idx ;
      edtavBaragrest_Internalname = "vBARAGREST_"+sGXsfl_49_idx ;
      chkavRctinte.setInternalname( "vRCTINTE_"+sGXsfl_49_idx );
      chkavRcacabado.setInternalname( "vRCACABADO_"+sGXsfl_49_idx );
      edtavBarcod_Internalname = "vBARCOD_"+sGXsfl_49_idx ;
      edtavBarcodreo_Internalname = "vBARCODREO_"+sGXsfl_49_idx ;
      edtavBarcodpar_Internalname = "vBARCODPAR_"+sGXsfl_49_idx ;
      edtavBarunimed_Internalname = "vBARUNIMED_"+sGXsfl_49_idx ;
      edtavBarconreo_Internalname = "vBARCONREO_"+sGXsfl_49_idx ;
   }

   public void subsflControlProps_fel_492( )
   {
      edtavCrearri_Internalname = "vCREARRI_"+sGXsfl_49_fel_idx ;
      edtavEliminar_Internalname = "vELIMINAR_"+sGXsfl_49_fel_idx ;
      edtavBarnhdr1_Internalname = "vBARNHDR1_"+sGXsfl_49_fel_idx ;
      edtavClinom_Internalname = "vCLINOM_"+sGXsfl_49_fel_idx ;
      edtavBarser_Internalname = "vBARSER_"+sGXsfl_49_fel_idx ;
      edtavBarserdsc_Internalname = "vBARSERDSC_"+sGXsfl_49_fel_idx ;
      edtavBarcolnom_Internalname = "vBARCOLNOM_"+sGXsfl_49_fel_idx ;
      edtavBarnomcli_Internalname = "vBARNOMCLI_"+sGXsfl_49_fel_idx ;
      edtavBarkgm_Internalname = "vBARKGM_"+sGXsfl_49_fel_idx ;
      edtavBarmtr_Internalname = "vBARMTR_"+sGXsfl_49_fel_idx ;
      edtavBarpie_Internalname = "vBARPIE_"+sGXsfl_49_fel_idx ;
      edtavBarsit_Internalname = "vBARSIT_"+sGXsfl_49_fel_idx ;
      edtavBaragrest_Internalname = "vBARAGREST_"+sGXsfl_49_fel_idx ;
      chkavRctinte.setInternalname( "vRCTINTE_"+sGXsfl_49_fel_idx );
      chkavRcacabado.setInternalname( "vRCACABADO_"+sGXsfl_49_fel_idx );
      edtavBarcod_Internalname = "vBARCOD_"+sGXsfl_49_fel_idx ;
      edtavBarcodreo_Internalname = "vBARCODREO_"+sGXsfl_49_fel_idx ;
      edtavBarcodpar_Internalname = "vBARCODPAR_"+sGXsfl_49_fel_idx ;
      edtavBarunimed_Internalname = "vBARUNIMED_"+sGXsfl_49_fel_idx ;
      edtavBarconreo_Internalname = "vBARCONREO_"+sGXsfl_49_fel_idx ;
   }

   public void sendrow_492( )
   {
      subsflControlProps_492( ) ;
      wbEB0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_49_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_49_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_49_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavCrearri_Enabled!=0)&&(edtavCrearri_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'',false,'',49)\"" : " ") ;
         ClassString = "ActionBaseColorAttribute" + " " + ((GXutil.strcmp(edtavCrearri_gximage, "")==0) ? "" : "GX_Image_"+edtavCrearri_gximage+"_Class") ;
         StyleString = "" ;
         AV30CrearRI_IsBlob = (boolean)(((GXutil.strcmp("", AV30CrearRI)==0)&&(GXutil.strcmp("", AV45Crearri_GXI)==0))||!(GXutil.strcmp("", AV30CrearRI)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV30CrearRI)==0) ? AV45Crearri_GXI : httpContext.getResourceRelative(AV30CrearRI)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavCrearri_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"",edtavCrearri_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(7),edtavCrearri_Jsonclick,"'"+""+"'"+",false,"+"'"+"e17eb2_client"+"'",StyleString,ClassString,"WWActionColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV30CrearRI_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Active Bitmap Variable */
         TempTags = " " + ((edtavEliminar_Enabled!=0)&&(edtavEliminar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 51,'',false,'',49)\"" : " ") ;
         ClassString = "ActionBaseColorAttribute" + " " + ((GXutil.strcmp(edtavEliminar_gximage, "")==0) ? "" : "GX_Image_"+edtavEliminar_gximage+"_Class") ;
         StyleString = "" ;
         AV37Eliminar_IsBlob = (boolean)(((GXutil.strcmp("", AV37Eliminar)==0)&&(GXutil.strcmp("", AV46Eliminar_GXI)==0))||!(GXutil.strcmp("", AV37Eliminar)==0)) ;
         sImgUrl = ((GXutil.strcmp("", AV37Eliminar)==0) ? AV46Eliminar_GXI : httpContext.getResourceRelative(AV37Eliminar)) ;
         GridRow.AddColumnProperties("bitmap", 1, isAjaxCallMode( ), new Object[] {edtavEliminar_Internalname,sImgUrl,"","","",context.getHttpContext().getTheme( ),Integer.valueOf(-1),Integer.valueOf(1),"",edtavEliminar_Tooltiptext,Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),"px",Integer.valueOf(0),"px",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(5),edtavEliminar_Jsonclick,"'"+""+"'"+",false,"+"'"+"EVELIMINAR.CLICK."+sGXsfl_49_idx+"'",StyleString,ClassString,"WWActionColumn","","","",""+TempTags,"","",Integer.valueOf(1),Boolean.valueOf(AV37Eliminar_IsBlob),Boolean.valueOf(false),context.getHttpContext().getImageSrcSet( sImgUrl)});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarnhdr1_Enabled!=0)&&(edtavBarnhdr1_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 52,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarnhdr1_Internalname,GXutil.rtrim( AV6BarNHdr1),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarnhdr1_Enabled!=0)&&(edtavBarnhdr1_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,52);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarnhdr1_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarnhdr1_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavClinom_Enabled!=0)&&(edtavClinom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 53,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavClinom_Internalname,GXutil.rtrim( AV7CliNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavClinom_Enabled!=0)&&(edtavClinom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,53);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavClinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavClinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarser_Enabled!=0)&&(edtavBarser_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarser_Internalname,GXutil.rtrim( AV14BarSer),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarser_Enabled!=0)&&(edtavBarser_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,54);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarserdsc_Enabled!=0)&&(edtavBarserdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 55,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarserdsc_Internalname,GXutil.rtrim( AV15BarSerDsc),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarserdsc_Enabled!=0)&&(edtavBarserdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,55);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcolnom_Enabled!=0)&&(edtavBarcolnom_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnom_Internalname,GXutil.rtrim( AV16BarColNom),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarcolnom_Enabled!=0)&&(edtavBarcolnom_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,56);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarnomcli_Enabled!=0)&&(edtavBarnomcli_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarnomcli_Internalname,GXutil.rtrim( AV17BarNomCli),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarnomcli_Enabled!=0)&&(edtavBarnomcli_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,57);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarkgm_Enabled!=0)&&(edtavBarkgm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarkgm_Internalname,GXutil.ltrim( localUtil.ntoc( AV18BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarkgm_Enabled!=0) ? localUtil.format( AV18BarKgm, "ZZZZZ9.99") : localUtil.format( AV18BarKgm, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavBarkgm_Enabled!=0)&&(edtavBarkgm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,58);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarkgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarkgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarmtr_Enabled!=0)&&(edtavBarmtr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarmtr_Internalname,GXutil.ltrim( localUtil.ntoc( AV19BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarmtr_Enabled!=0) ? localUtil.format( AV19BarMtr, "ZZZZZ9.99") : localUtil.format( AV19BarMtr, "ZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavBarmtr_Enabled!=0)&&(edtavBarmtr_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,59);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarmtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarmtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarpie_Enabled!=0)&&(edtavBarpie_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarpie_Internalname,GXutil.ltrim( localUtil.ntoc( AV20BarPie, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarpie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV20BarPie), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV20BarPie), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarpie_Enabled!=0)&&(edtavBarpie_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,60);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarpie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarpie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarsit_Enabled!=0)&&(edtavBarsit_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarsit_Internalname,GXutil.ltrim( localUtil.ntoc( AV21BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarsit_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV21BarSit), "Z9") : localUtil.format( DecimalUtil.doubleToDec(AV21BarSit), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarsit_Enabled!=0)&&(edtavBarsit_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,61);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarsit_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarsit_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBaragrest_Enabled!=0)&&(edtavBaragrest_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBaragrest_Internalname,GXutil.rtrim( AV22BarAgrEst),GXutil.rtrim( localUtil.format( AV22BarAgrEst, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavBaragrest_Enabled!=0)&&(edtavBaragrest_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,62);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBaragrest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBaragrest_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavRctinte.getEnabled()!=0)&&(chkavRctinte.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vRCTINTE_" + sGXsfl_49_idx ;
         chkavRctinte.setName( GXCCtl );
         chkavRctinte.setWebtags( "" );
         chkavRctinte.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavRctinte.getInternalname(), "TitleCaption", chkavRctinte.getCaption(), !bGXsfl_49_Refreshing);
         chkavRctinte.setCheckedValue( "N" );
         AV23RcTinte = ((GXutil.strcmp(GXutil.rtrim( AV23RcTinte), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavRctinte.getInternalname(), AV23RcTinte);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavRctinte.getInternalname(),AV23RcTinte,"","",Integer.valueOf(-1),Integer.valueOf(chkavRctinte.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(63, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavRctinte.getEnabled()!=0)&&(chkavRctinte.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavRcacabado.getEnabled()!=0)&&(chkavRcacabado.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vRCACABADO_" + sGXsfl_49_idx ;
         chkavRcacabado.setName( GXCCtl );
         chkavRcacabado.setWebtags( "" );
         chkavRcacabado.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavRcacabado.getInternalname(), "TitleCaption", chkavRcacabado.getCaption(), !bGXsfl_49_Refreshing);
         chkavRcacabado.setCheckedValue( "N" );
         AV24RcAcabado = ((GXutil.strcmp(GXutil.rtrim( AV24RcAcabado), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavRcacabado.getInternalname(), AV24RcAcabado);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavRcacabado.getInternalname(),AV24RcAcabado,"","",Integer.valueOf(-1),Integer.valueOf(chkavRcacabado.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(64, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavRcacabado.getEnabled()!=0)&&(chkavRcacabado.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,64);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcod_Enabled!=0)&&(edtavBarcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 65,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV31BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV31BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV31BarCod), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcod_Enabled!=0)&&(edtavBarcod_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,65);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcodreo_Enabled!=0)&&(edtavBarcodreo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 66,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV32BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV32BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV32BarCodReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarcodreo_Enabled!=0)&&(edtavBarcodreo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,66);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarcodpar_Enabled!=0)&&(edtavBarcodpar_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 67,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodpar_Internalname,GXutil.rtrim( AV33BarCodPar),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavBarcodpar_Enabled!=0)&&(edtavBarcodpar_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,67);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavBarcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarunimed_Enabled!=0)&&(edtavBarunimed_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 68,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarunimed_Internalname,GXutil.rtrim( AV34BarUniMed),GXutil.rtrim( localUtil.format( AV34BarUniMed, "@!")),TempTags+" onchange=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onchange(this, event)\" "+((edtavBarunimed_Enabled!=0)&&(edtavBarunimed_Visible!=0) ? " onblur=\""+"this.value=this.value.toUpperCase();"+";gx.evt.onblur(this,68);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarunimed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarunimed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavBarconreo_Enabled!=0)&&(edtavBarconreo_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarconreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV36BarConReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarconreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV36BarConReo), "9") : localUtil.format( DecimalUtil.doubleToDec(AV36BarConReo), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavBarconreo_Enabled!=0)&&(edtavBarconreo_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,69);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarconreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarconreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesEB2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_49_idx = ((subGrid_Islastpage==1)&&(nGXsfl_49_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_49_idx+1) ;
         sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_492( ) ;
      }
      /* End function sendrow_492 */
   }

   public void startgridcontrol49( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"49\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ActionBaseColorAttribute"+" "+((GXutil.strcmp(edtavCrearri_gximage, "")==0) ? "" : "GX_Image_"+edtavCrearri_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ActionBaseColorAttribute"+" "+((GXutil.strcmp(edtavEliminar_gximage, "")==0) ? "" : "GX_Image_"+edtavEliminar_gximage+"_Class")+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripción", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "St", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Agr?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rc Tinte?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Rc Acabado?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Hdr", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultimo Reop", "")) ;
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
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV30CrearRI));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavCrearri_Link));
         GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavCrearri_Tooltiptext));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", httpContext.convertURL( AV37Eliminar));
         GridColumn.AddObjectProperty("Link", GXutil.rtrim( edtavEliminar_Link));
         GridColumn.AddObjectProperty("Tooltiptext", GXutil.rtrim( edtavEliminar_Tooltiptext));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV6BarNHdr1));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarnhdr1_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV7CliNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavClinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV14BarSer));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV15BarSerDsc));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV16BarColNom));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV17BarNomCli));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV18BarKgm, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarkgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV19BarMtr, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarmtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV20BarPie, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarpie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV21BarSit, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarsit_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV22BarAgrEst));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBaragrest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV23RcTinte));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavRctinte.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV24RcAcabado));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavRcacabado.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV31BarCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV32BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV33BarCodPar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV34BarUniMed));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV36BarConReo, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarconreo_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTextblockbarnhdr_Internalname = "TEXTBLOCKBARNHDR" ;
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      divUnnamedtablebarnhdr_Internalname = "UNNAMEDTABLEBARNHDR" ;
      lblTextblockclinom1_Internalname = "TEXTBLOCKCLINOM1" ;
      edtavClinom1_Internalname = "vCLINOM1" ;
      divUnnamedtableclinom1_Internalname = "UNNAMEDTABLECLINOM1" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      tblUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavCrearri_Internalname = "vCREARRI" ;
      edtavEliminar_Internalname = "vELIMINAR" ;
      edtavBarnhdr1_Internalname = "vBARNHDR1" ;
      edtavClinom_Internalname = "vCLINOM" ;
      edtavBarser_Internalname = "vBARSER" ;
      edtavBarserdsc_Internalname = "vBARSERDSC" ;
      edtavBarcolnom_Internalname = "vBARCOLNOM" ;
      edtavBarnomcli_Internalname = "vBARNOMCLI" ;
      edtavBarkgm_Internalname = "vBARKGM" ;
      edtavBarmtr_Internalname = "vBARMTR" ;
      edtavBarpie_Internalname = "vBARPIE" ;
      edtavBarsit_Internalname = "vBARSIT" ;
      edtavBaragrest_Internalname = "vBARAGREST" ;
      chkavRctinte.setInternalname( "vRCTINTE" );
      chkavRcacabado.setInternalname( "vRCACABADO" );
      edtavBarcod_Internalname = "vBARCOD" ;
      edtavBarcodreo_Internalname = "vBARCODREO" ;
      edtavBarcodpar_Internalname = "vBARCODPAR" ;
      edtavBarunimed_Internalname = "vBARUNIMED" ;
      edtavBarconreo_Internalname = "vBARCONREO" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      tblUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGridcurrentpage_Internalname = "vGRIDCURRENTPAGE" ;
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
      edtavEliminar_Link = "" ;
      edtavCrearri_Link = "" ;
      subGrid_Header = "" ;
      edtavBarconreo_Jsonclick = "" ;
      edtavBarconreo_Visible = -1 ;
      edtavBarconreo_Enabled = 1 ;
      edtavBarunimed_Jsonclick = "" ;
      edtavBarunimed_Visible = -1 ;
      edtavBarunimed_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodpar_Visible = 0 ;
      edtavBarcodpar_Enabled = 1 ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcodreo_Visible = 0 ;
      edtavBarcodreo_Enabled = 1 ;
      edtavBarcod_Jsonclick = "" ;
      edtavBarcod_Visible = 0 ;
      edtavBarcod_Enabled = 1 ;
      chkavRcacabado.setCaption( "" );
      chkavRcacabado.setVisible( -1 );
      chkavRcacabado.setEnabled( 1 );
      chkavRctinte.setCaption( "" );
      chkavRctinte.setVisible( -1 );
      chkavRctinte.setEnabled( 1 );
      edtavBaragrest_Jsonclick = "" ;
      edtavBaragrest_Visible = -1 ;
      edtavBaragrest_Enabled = 1 ;
      edtavBarsit_Jsonclick = "" ;
      edtavBarsit_Visible = -1 ;
      edtavBarsit_Enabled = 1 ;
      edtavBarpie_Jsonclick = "" ;
      edtavBarpie_Visible = -1 ;
      edtavBarpie_Enabled = 1 ;
      edtavBarmtr_Jsonclick = "" ;
      edtavBarmtr_Visible = -1 ;
      edtavBarmtr_Enabled = 1 ;
      edtavBarkgm_Jsonclick = "" ;
      edtavBarkgm_Visible = -1 ;
      edtavBarkgm_Enabled = 1 ;
      edtavBarnomcli_Jsonclick = "" ;
      edtavBarnomcli_Visible = -1 ;
      edtavBarnomcli_Enabled = 1 ;
      edtavBarcolnom_Jsonclick = "" ;
      edtavBarcolnom_Visible = -1 ;
      edtavBarcolnom_Enabled = 1 ;
      edtavBarserdsc_Jsonclick = "" ;
      edtavBarserdsc_Visible = -1 ;
      edtavBarserdsc_Enabled = 1 ;
      edtavBarser_Jsonclick = "" ;
      edtavBarser_Visible = -1 ;
      edtavBarser_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Visible = -1 ;
      edtavClinom_Enabled = 1 ;
      edtavBarnhdr1_Jsonclick = "" ;
      edtavBarnhdr1_Visible = -1 ;
      edtavBarnhdr1_Enabled = 1 ;
      edtavEliminar_Jsonclick = "" ;
      edtavEliminar_gximage = "" ;
      edtavEliminar_Visible = -1 ;
      edtavEliminar_Enabled = 1 ;
      edtavEliminar_Tooltiptext = "" ;
      edtavCrearri_Jsonclick = "" ;
      edtavCrearri_gximage = "" ;
      edtavCrearri_Visible = -1 ;
      edtavCrearri_Enabled = 1 ;
      edtavCrearri_Tooltiptext = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavClinom1_Jsonclick = "" ;
      edtavClinom1_Enabled = 1 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 1 ;
      edtavGridcurrentpage_Jsonclick = "" ;
      edtavGridcurrentpage_Visible = 1 ;
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
      Form.setCaption( httpContext.getMessage( "Web Reoperados Internos", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vRCTINTE_" + sGXsfl_49_idx ;
      chkavRctinte.setName( GXCCtl );
      chkavRctinte.setWebtags( "" );
      chkavRctinte.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavRctinte.getInternalname(), "TitleCaption", chkavRctinte.getCaption(), !bGXsfl_49_Refreshing);
      chkavRctinte.setCheckedValue( "N" );
      AV23RcTinte = ((GXutil.strcmp(GXutil.rtrim( AV23RcTinte), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavRctinte.getInternalname(), AV23RcTinte);
      GXCCtl = "vRCACABADO_" + sGXsfl_49_idx ;
      chkavRcacabado.setName( GXCCtl );
      chkavRcacabado.setWebtags( "" );
      chkavRcacabado.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavRcacabado.getInternalname(), "TitleCaption", chkavRcacabado.getCaption(), !bGXsfl_49_Refreshing);
      chkavRcacabado.setCheckedValue( "N" );
      AV24RcAcabado = ((GXutil.strcmp(GXutil.rtrim( AV24RcAcabado), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavRcacabado.getInternalname(), AV24RcAcabado);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'AV12Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarNHdr',fld:'vBARNHDR',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV13CliNom1',fld:'vCLINOM1',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'AV25Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e15EB2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'AV12Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarNHdr',fld:'vBARNHDR',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV13CliNom1',fld:'vCLINOM1',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV25Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV30CrearRI',fld:'vCREARRI',pic:''},{av:'edtavCrearri_Tooltiptext',ctrl:'vCREARRI',prop:'Tooltiptext'},{av:'edtavCrearri_Link',ctrl:'vCREARRI',prop:'Link'},{av:'AV37Eliminar',fld:'vELIMINAR',pic:''},{av:'edtavEliminar_Tooltiptext',ctrl:'vELIMINAR',prop:'Tooltiptext'},{av:'edtavEliminar_Link',ctrl:'vELIMINAR',prop:'Link'},{av:'AV6BarNHdr1',fld:'vBARNHDR1',pic:''},{av:'AV7CliNom',fld:'vCLINOM',pic:''},{av:'AV14BarSer',fld:'vBARSER',pic:''},{av:'AV15BarSerDsc',fld:'vBARSERDSC',pic:''},{av:'AV16BarColNom',fld:'vBARCOLNOM',pic:''},{av:'AV25Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'AV18BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV19BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV20BarPie',fld:'vBARPIE',pic:'ZZZZZ9'},{av:'AV21BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV22BarAgrEst',fld:'vBARAGREST',pic:'@!'},{av:'AV31BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV32BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV33BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV34BarUniMed',fld:'vBARUNIMED',pic:'@!'},{av:'AV36BarConReo',fld:'vBARCONREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV23RcTinte',fld:'vRCTINTE',pic:''},{av:'AV24RcAcabado',fld:'vRCACABADO',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11EB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'AV12Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarNHdr',fld:'vBARNHDR',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV13CliNom1',fld:'vCLINOM1',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV25Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV10GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV10GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12EB2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A13696BarNHdr',fld:'BARNHDR',pic:''},{av:'AV12Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV5BarNHdr',fld:'vBARNHDR',pic:''},{av:'A279CliNom',fld:'CLINOM',pic:''},{av:'AV13CliNom1',fld:'vCLINOM1',pic:''},{av:'A213BarSit',fld:'BARSIT',pic:'Z9'},{av:'A212BarSer',fld:'BARSER',pic:''},{av:'A1652BarSerDsc',fld:'BARSERDSC',pic:''},{av:'A135BarColNom',fld:'BARCOLNOM',pic:''},{av:'AV25Barcolnum',fld:'vBARCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A166BarKgm',fld:'BARKGM',pic:'ZZZZZ9.99'},{av:'A184BarMtr',fld:'BARMTR',pic:'ZZZZZ9.99'},{av:'A198BarPie',fld:'BARPIE',pic:'ZZZZZ9'},{av:'A120BarAgrEst',fld:'BARAGREST',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A228BarUniMed',fld:'BARUNIMED',pic:'@!'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV10GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VCREARRI.CLICK","{handler:'e17EB2',iparms:[]");
      setEventMetadata("VCREARRI.CLICK",",oparms:[]}");
      setEventMetadata("VELIMINAR.CLICK","{handler:'e16EB2',iparms:[{av:'AV32BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV36BarConReo',fld:'vBARCONREO',pic:'9',hsh:true},{av:'AV12Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV33BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV41Err_',fld:'vERR_',pic:'ZZZ9'},{av:'AV38UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV39Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("VELIMINAR.CLICK",",oparms:[{av:'AV39Station',fld:'vSTATION',pic:''},{av:'AV38UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV41Err_',fld:'vERR_',pic:'ZZZ9'},{av:'AV33BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV32BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV31BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV12Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VALIDV_BARUNIMED","{handler:'validv_Barunimed',iparms:[]");
      setEventMetadata("VALIDV_BARUNIMED",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Barconreo',iparms:[]");
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
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A13696BarNHdr = "" ;
      AV12Emprcod = "" ;
      AV5BarNHdr = "" ;
      A279CliNom = "" ;
      AV13CliNom1 = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A166BarKgm = DecimalUtil.ZERO ;
      A184BarMtr = DecimalUtil.ZERO ;
      A120BarAgrEst = "" ;
      A130BarCodPar = "" ;
      A228BarUniMed = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV38UsurCod = "" ;
      AV39Station = "" ;
      A365DisDes = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV30CrearRI = "" ;
      AV45Crearri_GXI = "" ;
      AV37Eliminar = "" ;
      AV46Eliminar_GXI = "" ;
      AV6BarNHdr1 = "" ;
      AV7CliNom = "" ;
      AV14BarSer = "" ;
      AV15BarSerDsc = "" ;
      AV16BarColNom = "" ;
      AV17BarNomCli = "" ;
      AV18BarKgm = DecimalUtil.ZERO ;
      AV19BarMtr = DecimalUtil.ZERO ;
      AV22BarAgrEst = "" ;
      AV23RcTinte = "" ;
      AV24RcAcabado = "" ;
      AV33BarCodPar = "" ;
      AV34BarUniMed = "" ;
      AV40EmprNom = "" ;
      GXt_char1 = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      lV5BarNHdr = "" ;
      lV13CliNom1 = "" ;
      scmdbuf = "" ;
      H00EB3_A252CliCod = new int[1] ;
      H00EB3_n252CliCod = new boolean[] {false} ;
      H00EB3_A396EmprCod = new String[] {""} ;
      H00EB3_A213BarSit = new byte[1] ;
      H00EB3_A279CliNom = new String[] {""} ;
      H00EB3_A13696BarNHdr = new String[] {""} ;
      H00EB3_A212BarSer = new String[] {""} ;
      H00EB3_A1652BarSerDsc = new String[] {""} ;
      H00EB3_A135BarColNom = new String[] {""} ;
      H00EB3_A120BarAgrEst = new String[] {""} ;
      H00EB3_A228BarUniMed = new String[] {""} ;
      H00EB3_A129BarCod = new int[1] ;
      H00EB3_A132BarCodReo = new byte[1] ;
      H00EB3_A130BarCodPar = new String[] {""} ;
      H00EB3_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EB3_A184BarMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00EB3_A199BarPie1 = new short[1] ;
      H00EB3_A365DisDes = new String[] {""} ;
      H00EB3_A898BarPieNDes = new int[1] ;
      AV27Msghayrcta = "" ;
      GXv_char2 = new String[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_char9 = new String[1] ;
      GXv_int5 = new int[1] ;
      GXv_int7 = new byte[1] ;
      GXv_char8 = new String[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      lblTextblockbarnhdr_Jsonclick = "" ;
      lblTextblockclinom1_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      sImgUrl = "" ;
      ROClassString = "" ;
      GXCCtl = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webreoperadosinternos__default(),
         new Object[] {
             new Object[] {
            H00EB3_A252CliCod, H00EB3_n252CliCod, H00EB3_A396EmprCod, H00EB3_A213BarSit, H00EB3_A279CliNom, H00EB3_A13696BarNHdr, H00EB3_A212BarSer, H00EB3_A1652BarSerDsc, H00EB3_A135BarColNom, H00EB3_A120BarAgrEst,
            H00EB3_A228BarUniMed, H00EB3_A129BarCod, H00EB3_A132BarCodReo, H00EB3_A130BarCodPar, H00EB3_A166BarKgm, H00EB3_A184BarMtr, H00EB3_A199BarPie1, H00EB3_A365DisDes, H00EB3_A898BarPieNDes
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavBarnhdr1_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavBarser_Enabled = 0 ;
      edtavBarserdsc_Enabled = 0 ;
      edtavBarcolnom_Enabled = 0 ;
      edtavBarnomcli_Enabled = 0 ;
      edtavBarkgm_Enabled = 0 ;
      edtavBarmtr_Enabled = 0 ;
      edtavBarpie_Enabled = 0 ;
      edtavBarsit_Enabled = 0 ;
      edtavBaragrest_Enabled = 0 ;
      chkavRctinte.setEnabled( 0 );
      chkavRcacabado.setEnabled( 0 );
      edtavBarcod_Enabled = 0 ;
      edtavBarcodreo_Enabled = 0 ;
      edtavBarcodpar_Enabled = 0 ;
      edtavBarunimed_Enabled = 0 ;
      edtavBarconreo_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte A213BarSit ;
   private byte A132BarCodReo ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte AV21BarSit ;
   private byte AV32BarCodReo ;
   private byte AV36BarConReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXv_int7[] ;
   private byte GXv_int6[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV41Err_ ;
   private short A199BarPie1 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV26FlagRec ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_49 ;
   private int subGrid_Rows ;
   private int nGXsfl_49_idx=1 ;
   private int AV25Barcolnum ;
   private int A198BarPie ;
   private int A129BarCod ;
   private int A898BarPieNDes ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavGridcurrentpage_Visible ;
   private int AV20BarPie ;
   private int AV31BarCod ;
   private int subGrid_Islastpage ;
   private int edtavBarnhdr1_Enabled ;
   private int edtavClinom_Enabled ;
   private int edtavBarser_Enabled ;
   private int edtavBarserdsc_Enabled ;
   private int edtavBarcolnom_Enabled ;
   private int edtavBarnomcli_Enabled ;
   private int edtavBarkgm_Enabled ;
   private int edtavBarmtr_Enabled ;
   private int edtavBarpie_Enabled ;
   private int edtavBarsit_Enabled ;
   private int edtavBaragrest_Enabled ;
   private int edtavBarcod_Enabled ;
   private int edtavBarcodreo_Enabled ;
   private int edtavBarcodpar_Enabled ;
   private int edtavBarunimed_Enabled ;
   private int edtavBarconreo_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int subGrid_Recordcount ;
   private int A252CliCod ;
   private int AV9PageToGo ;
   private int GXv_int5[] ;
   private int edtavBarnhdr_Enabled ;
   private int edtavClinom1_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavCrearri_Enabled ;
   private int edtavCrearri_Visible ;
   private int edtavEliminar_Enabled ;
   private int edtavEliminar_Visible ;
   private int edtavBarnhdr1_Visible ;
   private int edtavClinom_Visible ;
   private int edtavBarser_Visible ;
   private int edtavBarserdsc_Visible ;
   private int edtavBarcolnom_Visible ;
   private int edtavBarnomcli_Visible ;
   private int edtavBarkgm_Visible ;
   private int edtavBarmtr_Visible ;
   private int edtavBarpie_Visible ;
   private int edtavBarsit_Visible ;
   private int edtavBaragrest_Visible ;
   private int edtavBarcod_Visible ;
   private int edtavBarcodreo_Visible ;
   private int edtavBarcodpar_Visible ;
   private int edtavBarunimed_Visible ;
   private int edtavBarconreo_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV11GridPageCount ;
   private long AV10GridCurrentPage ;
   private long GRID_nCurrentRecord ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A184BarMtr ;
   private java.math.BigDecimal AV18BarKgm ;
   private java.math.BigDecimal AV19BarMtr ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_49_idx="0001" ;
   private String A396EmprCod ;
   private String A13696BarNHdr ;
   private String AV12Emprcod ;
   private String AV5BarNHdr ;
   private String A279CliNom ;
   private String AV13CliNom1 ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A120BarAgrEst ;
   private String A130BarCodPar ;
   private String A228BarUniMed ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV38UsurCod ;
   private String AV39Station ;
   private String A365DisDes ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String TempTags ;
   private String edtavGridcurrentpage_Internalname ;
   private String edtavGridcurrentpage_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavCrearri_Internalname ;
   private String edtavEliminar_Internalname ;
   private String AV6BarNHdr1 ;
   private String edtavBarnhdr1_Internalname ;
   private String AV7CliNom ;
   private String edtavClinom_Internalname ;
   private String AV14BarSer ;
   private String edtavBarser_Internalname ;
   private String AV15BarSerDsc ;
   private String edtavBarserdsc_Internalname ;
   private String AV16BarColNom ;
   private String edtavBarcolnom_Internalname ;
   private String AV17BarNomCli ;
   private String edtavBarnomcli_Internalname ;
   private String edtavBarkgm_Internalname ;
   private String edtavBarmtr_Internalname ;
   private String edtavBarpie_Internalname ;
   private String edtavBarsit_Internalname ;
   private String AV22BarAgrEst ;
   private String edtavBaragrest_Internalname ;
   private String AV23RcTinte ;
   private String AV24RcAcabado ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcodreo_Internalname ;
   private String AV33BarCodPar ;
   private String edtavBarcodpar_Internalname ;
   private String AV34BarUniMed ;
   private String edtavBarunimed_Internalname ;
   private String edtavBarconreo_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String edtavClinom1_Internalname ;
   private String AV40EmprNom ;
   private String GXt_char1 ;
   private String Gridpaginationbar_Internalname ;
   private String edtavCrearri_gximage ;
   private String edtavCrearri_Tooltiptext ;
   private String edtavCrearri_Link ;
   private String edtavEliminar_gximage ;
   private String edtavEliminar_Tooltiptext ;
   private String edtavEliminar_Link ;
   private String lV5BarNHdr ;
   private String lV13CliNom1 ;
   private String scmdbuf ;
   private String AV27Msghayrcta ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String tblUnnamedtable2_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String tblUnnamedtable1_Internalname ;
   private String divTableactions_Internalname ;
   private String divUnnamedtablebarnhdr_Internalname ;
   private String lblTextblockbarnhdr_Internalname ;
   private String lblTextblockbarnhdr_Jsonclick ;
   private String edtavBarnhdr_Jsonclick ;
   private String divUnnamedtableclinom1_Internalname ;
   private String lblTextblockclinom1_Internalname ;
   private String lblTextblockclinom1_Jsonclick ;
   private String edtavClinom1_Jsonclick ;
   private String sGXsfl_49_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String sImgUrl ;
   private String edtavCrearri_Jsonclick ;
   private String edtavEliminar_Jsonclick ;
   private String ROClassString ;
   private String edtavBarnhdr1_Jsonclick ;
   private String edtavClinom_Jsonclick ;
   private String edtavBarser_Jsonclick ;
   private String edtavBarserdsc_Jsonclick ;
   private String edtavBarcolnom_Jsonclick ;
   private String edtavBarnomcli_Jsonclick ;
   private String edtavBarkgm_Jsonclick ;
   private String edtavBarmtr_Jsonclick ;
   private String edtavBarpie_Jsonclick ;
   private String edtavBarsit_Jsonclick ;
   private String edtavBaragrest_Jsonclick ;
   private String GXCCtl ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Jsonclick ;
   private String edtavBarunimed_Jsonclick ;
   private String edtavBarconreo_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_49_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n252CliCod ;
   private boolean AV30CrearRI_IsBlob ;
   private boolean AV37Eliminar_IsBlob ;
   private String AV45Crearri_GXI ;
   private String AV46Eliminar_GXI ;
   private String AV30CrearRI ;
   private String AV37Eliminar ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private ICheckbox chkavRctinte ;
   private ICheckbox chkavRcacabado ;
   private IDataStoreProvider pr_default ;
   private int[] H00EB3_A252CliCod ;
   private boolean[] H00EB3_n252CliCod ;
   private String[] H00EB3_A396EmprCod ;
   private byte[] H00EB3_A213BarSit ;
   private String[] H00EB3_A279CliNom ;
   private String[] H00EB3_A13696BarNHdr ;
   private String[] H00EB3_A212BarSer ;
   private String[] H00EB3_A1652BarSerDsc ;
   private String[] H00EB3_A135BarColNom ;
   private String[] H00EB3_A120BarAgrEst ;
   private String[] H00EB3_A228BarUniMed ;
   private int[] H00EB3_A129BarCod ;
   private byte[] H00EB3_A132BarCodReo ;
   private String[] H00EB3_A130BarCodPar ;
   private java.math.BigDecimal[] H00EB3_A166BarKgm ;
   private java.math.BigDecimal[] H00EB3_A184BarMtr ;
   private short[] H00EB3_A199BarPie1 ;
   private String[] H00EB3_A365DisDes ;
   private int[] H00EB3_A898BarPieNDes ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webreoperadosinternos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00EB3", "SELECT T1.CliCod, T1.EmprCod, T1.BarSit, T2.CliNom, RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar AS BarNHdr, T1.BarSer, T1.BarSerDsc, T1.BarColNom, T1.BarAgrEst, T1.BarUniMed, T1.BarCod, T1.BarCodReo, T1.BarCodPar, COALESCE( T3.BarKgm, 0) AS BarKgm, COALESCE( T3.BarMtr, 0) AS BarMtr, COALESCE( T3.BarPie1, 0) AS BarPie1, T1.DisDes, COALESCE( T3.BarPieNDes, 0) AS BarPieNDes FROM ((TXPBARCAD T1 LEFT JOIN TXPCLIENT T2 ON T2.EmprCod = T1.EmprCod AND T2.CliCod = T1.CliCod) LEFT JOIN (SELECT SUM(BarPieKil) AS BarKgm, EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieMet) AS BarMtr, SUM(BarPiePie) AS BarPieNDes, COUNT(*) AS BarPie1 FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar) WHERE (T1.EmprCod = ?) AND (RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCod,'99999990'), 2))) || '-' || RTRIM(LTRIM(SUBSTR(TO_CHAR(T1.BarCodReo,'90'), 2))) || T1.BarCodPar like ? or (rtrim(?) IS NULL)) AND (T2.CliNom like ? or (rtrim(?) IS NULL)) AND (T1.BarSit < 9) ORDER BY EmprCod, BarNHdr ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((String[]) buf[2])[0] = rslt.getString(2, 3);
               ((byte[]) buf[3])[0] = rslt.getByte(3);
               ((String[]) buf[4])[0] = rslt.getString(4, 30);
               ((String[]) buf[5])[0] = rslt.getString(5, 11);
               ((String[]) buf[6])[0] = rslt.getString(6, 16);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
               ((String[]) buf[9])[0] = rslt.getString(9, 1);
               ((String[]) buf[10])[0] = rslt.getString(10, 1);
               ((int[]) buf[11])[0] = rslt.getInt(11);
               ((byte[]) buf[12])[0] = rslt.getByte(12);
               ((String[]) buf[13])[0] = rslt.getString(13, 1);
               ((java.math.BigDecimal[]) buf[14])[0] = rslt.getBigDecimal(14,2);
               ((java.math.BigDecimal[]) buf[15])[0] = rslt.getBigDecimal(15,2);
               ((short[]) buf[16])[0] = rslt.getShort(16);
               ((String[]) buf[17])[0] = rslt.getString(17, 1);
               ((int[]) buf[18])[0] = rslt.getInt(18);
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
               stmt.setString(2, (String)parms[1], 11);
               stmt.setString(3, (String)parms[2], 11);
               stmt.setString(4, (String)parms[3], 30);
               stmt.setString(5, (String)parms[4], 30);
               return;
      }
   }

}

