package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwbarprotabla_impl extends GXDataArea
{
   public webwbarprotabla_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwbarprotabla_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwbarprotabla_impl.class ));
   }

   public webwbarprotabla_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAcciones = new HTMLChoice();
      cmbProFasEst = new HTMLChoice();
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
            A396EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               AV21Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Discod), 8, 0));
               AV20BarSit = (byte)(GXutil.lval( httpContext.GetPar( "BarSit"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarSit), 2, 0));
               AV30Barext = (byte)(GXutil.lval( httpContext.GetPar( "Barext"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30Barext", GXutil.str( AV30Barext, 1, 0));
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
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
      AV21Discod = (int)(GXutil.lval( httpContext.GetPar( "Discod"))) ;
      AV40Pgmname = httpContext.GetPar( "Pgmname") ;
      AV18Planing = (short)(GXutil.lval( httpContext.GetPar( "Planing"))) ;
      AV17Carvema = (short)(GXutil.lval( httpContext.GetPar( "Carvema"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV21Discod, AV40Pgmname, AV18Planing, AV17Carvema) ;
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
      paF72( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startF72( ) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwbarprotabla", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV21Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30Barext,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Discod","BarSit","Barext"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Planing), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Carvema), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_35, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV9GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV21Discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vBAREXT", GXutil.ltrim( localUtil.ntoc( AV30Barext, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV40Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV12UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV10Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLANING", GXutil.ltrim( localUtil.ntoc( AV18Planing, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Planing), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVEMA", GXutil.ltrim( localUtil.ntoc( AV17Carvema, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Carvema), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSIT", GXutil.ltrim( localUtil.ntoc( AV20BarSit, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Width", GXutil.rtrim( Dvpanel_opciones_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Autowidth", GXutil.booltostr( Dvpanel_opciones_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Autoheight", GXutil.booltostr( Dvpanel_opciones_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Cls", GXutil.rtrim( Dvpanel_opciones_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Title", GXutil.rtrim( Dvpanel_opciones_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Collapsible", GXutil.booltostr( Dvpanel_opciones_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Collapsed", GXutil.booltostr( Dvpanel_opciones_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Showcollapseicon", GXutil.booltostr( Dvpanel_opciones_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Iconposition", GXutil.rtrim( Dvpanel_opciones_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_OPCIONES_Autoscroll", GXutil.booltostr( Dvpanel_opciones_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarproceso_Result));
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
         weF72( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtF72( ) ;
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
      return formatLink("app.webwbarprotabla", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV21Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30Barext,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Discod","BarSit","Barext"})  ;
   }

   public String getPgmname( )
   {
      return "WebWBARPROtabla" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento de Procesos (Hdr)", "") ;
   }

   public void wbF70( )
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
         ucDvpanel_opciones.setProperty("Width", Dvpanel_opciones_Width);
         ucDvpanel_opciones.setProperty("AutoWidth", Dvpanel_opciones_Autowidth);
         ucDvpanel_opciones.setProperty("AutoHeight", Dvpanel_opciones_Autoheight);
         ucDvpanel_opciones.setProperty("Cls", Dvpanel_opciones_Cls);
         ucDvpanel_opciones.setProperty("Title", Dvpanel_opciones_Title);
         ucDvpanel_opciones.setProperty("Collapsible", Dvpanel_opciones_Collapsible);
         ucDvpanel_opciones.setProperty("Collapsed", Dvpanel_opciones_Collapsed);
         ucDvpanel_opciones.setProperty("ShowCollapseIcon", Dvpanel_opciones_Showcollapseicon);
         ucDvpanel_opciones.setProperty("IconPosition", Dvpanel_opciones_Iconposition);
         ucDvpanel_opciones.setProperty("AutoScroll", Dvpanel_opciones_Autoscroll);
         ucDvpanel_opciones.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_opciones_Internalname, "DVPANEL_OPCIONESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_OPCIONESContainer"+"Opciones"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divOpciones_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnagregarproceso_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "Agregar Proceso", ""), bttBtnagregarproceso_Jsonclick, 5, httpContext.getMessage( "Agregar Proceso", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOAGREGARPROCESO\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWBARPROtabla.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWBARPROtabla.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol35( ) ;
      }
      if ( wbEnd == 35 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_35 = (int)(nGXsfl_35_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV8GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV9GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_35_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV8GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV8GridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWBARPROtabla.htm");
         wb_table1_48_F72( true) ;
      }
      else
      {
         wb_table1_48_F72( false) ;
      }
      return  ;
   }

   public void wb_table1_48_F72e( boolean wbgen )
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
      if ( wbEnd == 35 )
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

   public void startF72( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento de Procesos (Hdr)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupF70( ) ;
   }

   public void wsF72( )
   {
      startF72( ) ;
      evtF72( ) ;
   }

   public void evtF72( )
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
                           e11F72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12F72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARPROCESO.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13F72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOAGREGARPROCESO'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoAgregarProceso' */
                           e14F72 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e15F72 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VACCIONES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "'DOFASES'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "VACCIONES.CLICK") == 0 ) )
                        {
                           nGXsfl_35_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_352( ) ;
                           cmbavAcciones.setName( cmbavAcciones.getInternalname() );
                           cmbavAcciones.setValue( httpContext.cgiGet( cmbavAcciones.getInternalname()) );
                           AV33Acciones = (short)(GXutil.lval( httpContext.cgiGet( cmbavAcciones.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavAcciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Acciones), 4, 0));
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
                           cmbProFasEst.setName( cmbProFasEst.getInternalname() );
                           cmbProFasEst.setValue( httpContext.cgiGet( cmbProFasEst.getInternalname()) );
                           A760ProFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbProFasEst.getInternalname()))) ;
                           n760ProFasEst = false ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavTdislin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavTdislin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTDISLIN");
                              GX_FocusControl = edtavTdislin_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV22Tdislin = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavTdislin_Internalname, GXutil.str( AV22Tdislin, 1, 0));
                           }
                           else
                           {
                              AV22Tdislin = (byte)(localUtil.ctol( httpContext.cgiGet( edtavTdislin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavTdislin_Internalname, GXutil.str( AV22Tdislin, 1, 0));
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
                                 e16F72 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e17F72 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e18F72 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VACCIONES.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e19F72 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOFASES'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoFases' */
                                 e20F72 ();
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

   public void weF72( )
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

   public void paF72( )
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
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
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
      subsflControlProps_352( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         sendrow_352( ) ;
         nGXsfl_35_idx = ((subGrid_Islastpage==1)&&(nGXsfl_35_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 int AV21Discod ,
                                 String AV40Pgmname ,
                                 short AV18Planing ,
                                 short AV17Carvema )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e17F72 ();
      GRID_nCurrentRecord = 0 ;
      rfF72( ) ;
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
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfF72( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV40Pgmname = "WebWBARPROtabla" ;
      Gx_err = (short)(0) ;
      edtavTdislin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdislin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTdislin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void rfF72( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(35) ;
      /* Execute user event: Refresh */
      e17F72 ();
      nGXsfl_35_idx = 1 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_352( ) ;
      bGXsfl_35_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_352( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         /* Using cursor H00F73 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_35_idx = 1 ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A759ProDsc = H00F73_A759ProDsc[0] ;
            A758ProCod = H00F73_A758ProCod[0] ;
            A760ProFasEst = H00F73_A760ProFasEst[0] ;
            n760ProFasEst = H00F73_n760ProFasEst[0] ;
            A759ProDsc = H00F73_A759ProDsc[0] ;
            A760ProFasEst = H00F73_A760ProFasEst[0] ;
            n760ProFasEst = H00F73_n760ProFasEst[0] ;
            e18F72 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(35) ;
         wbF70( ) ;
      }
      bGXsfl_35_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesF72( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV40Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV40Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPLANING", GXutil.ltrim( localUtil.ntoc( AV18Planing, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Planing), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCARVEMA", GXutil.ltrim( localUtil.ntoc( AV17Carvema, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Carvema), "ZZZ9")));
   }

   public int subgrid_fnc_pagecount( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRID_nRecordCount/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public int subgrid_fnc_recordcount( )
   {
      /* Using cursor H00F75 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      GRID_nRecordCount = H00F75_AGRID_nRecordCount[0] ;
      pr_default.close(1);
      return (int)(GRID_nRecordCount) ;
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
      return (int)(GXutil.Int( GRID_nFirstRecordOnPage/ (double) (subgrid_fnc_recordsperpage( )))+1) ;
   }

   public short subgrid_firstpage( )
   {
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV21Discod, AV40Pgmname, AV18Planing, AV17Carvema) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( ( GRID_nRecordCount >= subgrid_fnc_recordsperpage( ) ) && ( GRID_nEOF == 0 ) )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV21Discod, AV40Pgmname, AV18Planing, AV17Carvema) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV21Discod, AV40Pgmname, AV18Planing, AV17Carvema) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      GRID_nRecordCount = subgrid_fnc_recordcount( ) ;
      if ( GRID_nRecordCount > subgrid_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( )))) == 0 )
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-subgrid_fnc_recordsperpage( )) ;
         }
         else
         {
            GRID_nFirstRecordOnPage = (long)(GRID_nRecordCount-((int)((GRID_nRecordCount) % (subgrid_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRID_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV21Discod, AV40Pgmname, AV18Planing, AV17Carvema) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV21Discod, AV40Pgmname, AV18Planing, AV17Carvema) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV40Pgmname = "WebWBARPROtabla" ;
      Gx_err = (short)(0) ;
      edtavTdislin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTdislin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTdislin_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupF70( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e16F72 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV9GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_opciones_Width = httpContext.cgiGet( "DVPANEL_OPCIONES_Width") ;
         Dvpanel_opciones_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Autowidth")) ;
         Dvpanel_opciones_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Autoheight")) ;
         Dvpanel_opciones_Cls = httpContext.cgiGet( "DVPANEL_OPCIONES_Cls") ;
         Dvpanel_opciones_Title = httpContext.cgiGet( "DVPANEL_OPCIONES_Title") ;
         Dvpanel_opciones_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Collapsible")) ;
         Dvpanel_opciones_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Collapsed")) ;
         Dvpanel_opciones_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Showcollapseicon")) ;
         Dvpanel_opciones_Iconposition = httpContext.cgiGet( "DVPANEL_OPCIONES_Iconposition") ;
         Dvpanel_opciones_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_OPCIONES_Autoscroll")) ;
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
         Dvelop_confirmpanel_eliminarproceso_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Title") ;
         Dvelop_confirmpanel_eliminarproceso_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarproceso_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_eliminarproceso_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARPROCESO_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDCURRENTPAGE");
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8GridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GridCurrentPage), 10, 0));
         }
         else
         {
            AV8GridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GridCurrentPage), 10, 0));
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
      e16F72 ();
      if (returnInSub) return;
   }

   public void e16F72( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV10Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwbarprotabla_impl.this.GXt_char1 = GXv_char2[0] ;
      AV10Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Station", AV10Station);
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char4[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwbarprotabla_impl.this.A396EmprCod = GXv_char2[0] ;
      webwbarprotabla_impl.this.AV11EmprNom = GXv_char3[0] ;
      webwbarprotabla_impl.this.AV12UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV12UsurCod", AV12UsurCod);
      GXt_int5 = (byte)(AV18Planing) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PLANNC", ""), GXv_int6) ;
      webwbarprotabla_impl.this.GXt_int5 = GXv_int6[0] ;
      AV18Planing = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18Planing", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18Planing), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPLANING", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18Planing), "ZZZ9")));
      GXt_int5 = (byte)(AV17Carvema) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CARVEM", ""), GXv_int6) ;
      webwbarprotabla_impl.this.GXt_int5 = GXv_int6[0] ;
      AV17Carvema = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Carvema", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17Carvema), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCARVEMA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17Carvema), "ZZZ9")));
      GXt_char1 = AV10Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwbarprotabla_impl.this.GXt_char1 = GXv_char4[0] ;
      AV10Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Station", AV10Station);
      GXv_char4[0] = AV39Emprcod ;
      GXv_char3[0] = AV11EmprNom ;
      GXv_char2[0] = AV12UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV10Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwbarprotabla_impl.this.AV39Emprcod = GXv_char4[0] ;
      webwbarprotabla_impl.this.AV11EmprNom = GXv_char3[0] ;
      webwbarprotabla_impl.this.AV12UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12UsurCod", AV12UsurCod);
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV8GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GridCurrentPage), 10, 0));
      edtavGridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridcurrentpage_Visible), 5, 0), true);
      AV9GridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9GridPageCount), 10, 0));
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e17F72( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      cmbavAcciones.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAcciones.getInternalname(), "Columnheaderclass", cmbavAcciones.getColumnHeaderClass(), !bGXsfl_35_Refreshing);
      edtProCod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtProCod_Internalname, "Columnheaderclass", edtProCod_Columnheaderclass, !bGXsfl_35_Refreshing);
      edtProDsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop("", false, edtProDsc_Internalname, "Columnheaderclass", edtProDsc_Columnheaderclass, !bGXsfl_35_Refreshing);
      cmbProFasEst.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop("", false, cmbProFasEst.getInternalname(), "Columnheaderclass", cmbProFasEst.getColumnHeaderClass(), !bGXsfl_35_Refreshing);
      /*  Sending Event outputs  */
   }

   private void e18F72( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXt_int5 = AV22Tdislin ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = AV21Discod ;
      GXv_char3[0] = A758ProCod ;
      GXv_int6[0] = GXt_int5 ;
      new app.pdislin(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_char3, GXv_int6) ;
      webwbarprotabla_impl.this.A396EmprCod = GXv_char4[0] ;
      webwbarprotabla_impl.this.AV21Discod = GXv_int7[0] ;
      webwbarprotabla_impl.this.A758ProCod = GXv_char3[0] ;
      webwbarprotabla_impl.this.GXt_int5 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV21Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Discod), 8, 0));
      AV22Tdislin = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, edtavTdislin_Internalname, GXutil.str( AV22Tdislin, 1, 0));
      AV26Seleccionar = "N" ;
      AV29SeleccionarFases = "N" ;
      cmbavAcciones.removeAllItems();
      cmbavAcciones.addItem("0", ";fa fa-bars", (short)(0));
      cmbavAcciones.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Fases", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavAcciones.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar Proceso", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      if ( A760ProFasEst == 1 )
      {
         cmbavAcciones.setColumnClass( "WWActionGroupColumn WWColumnWarning WWColumnWarningFirstColumn" );
         edtProCod_Columnclass = "WWColumn WWColumnWarning" ;
         edtProDsc_Columnclass = "WWColumn WWColumnWarning" ;
         cmbProFasEst.setColumnClass( "WWColumn WWColumnWarning" );
      }
      else if ( A760ProFasEst == 2 )
      {
         cmbavAcciones.setColumnClass( "WWActionGroupColumn WWColumnSuccess WWColumnSuccessFirstColumn" );
         edtProCod_Columnclass = "WWColumn WWColumnSuccess" ;
         edtProDsc_Columnclass = "WWColumn WWColumnSuccess" ;
         cmbProFasEst.setColumnClass( "WWColumn WWColumnSuccess" );
      }
      else
      {
         cmbavAcciones.setColumnClass( httpContext.getMessage( "WWActionGroupColumn", "") );
         edtProCod_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         edtProDsc_Columnclass = httpContext.getMessage( "WWColumn", "") ;
         cmbProFasEst.setColumnClass( httpContext.getMessage( "WWColumn", "") );
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(35) ;
      }
      sendrow_352( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_35_Refreshing )
      {
         httpContext.doAjaxLoad(35, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavAcciones.setValue( GXutil.trim( GXutil.str( AV33Acciones, 4, 0)) );
   }

   public void e11F72( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV8GridCurrentPage = (long)(AV8GridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GridCurrentPage), 10, 0));
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV8GridCurrentPage = (long)(AV8GridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GridCurrentPage), 10, 0));
         subgrid_nextpage( ) ;
      }
      else
      {
         AV7PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         AV8GridCurrentPage = AV7PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GridCurrentPage), 10, 0));
         subgrid_gotopage( AV7PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e12F72( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV8GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8GridCurrentPage), 10, 0));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e19F72( )
   {
      /* Acciones_Click Routine */
      returnInSub = false ;
      if ( AV33Acciones == 1 )
      {
         /* Execute user subroutine: 'DO FASES' */
         S112 ();
         if (returnInSub) return;
      }
      else if ( AV33Acciones == 2 )
      {
         /* Execute user subroutine: 'DO ELIMINARPROCESO' */
         S122 ();
         if (returnInSub) return;
      }
      AV33Acciones = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavAcciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Acciones), 4, 0));
      /*  Sending Event outputs  */
      cmbavAcciones.setValue( GXutil.trim( GXutil.str( AV33Acciones, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAcciones.getInternalname(), "Values", cmbavAcciones.ToJavascriptSource(), true);
   }

   public void e13F72( )
   {
      /* Dvelop_confirmpanel_eliminarproceso_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarproceso_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARPROCESO' */
         S132 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e14F72( )
   {
      /* 'DoAgregarProceso' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.insertarprocesoenhdr", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.ltrimstr(AV21Discod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV20BarSit,2,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30Barext,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","Discod","BarSit","BarExt"}) , new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","AV21Discod","AV20BarSit","AV30Barext"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e15F72( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,Integer.valueOf(AV21Discod),Byte.valueOf(AV20BarSit),Byte.valueOf(AV30Barext)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","AV21Discod","AV20BarSit","AV30Barext"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DO FASES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webwbarfastabla", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A759ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV30Barext,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc","BarExt"}) , new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A758ProCod","A759ProDsc","AV30Barext"});
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'DO ELIMINARPROCESO' Routine */
      returnInSub = false ;
      if ( A760ProFasEst != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Error.Proceso en Produccion ¡¡¡", ""));
      }
      else
      {
         Dvelop_confirmpanel_eliminarproceso_Confirmationtext = httpContext.getMessage( "¿Desea eliminar el proceso ", "")+GXutil.trim( A758ProCod)+" "+GXutil.trim( A759ProDsc)+"?" ;
         ucDvelop_confirmpanel_eliminarproceso.sendProperty(context, "", false, Dvelop_confirmpanel_eliminarproceso_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminarproceso_Confirmationtext);
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARPROCESOContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S132( )
   {
      /* 'DO ACTION ELIMINARPROCESO' Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char3[0] = A130BarCodPar ;
      GXv_char2[0] = A758ProCod ;
      GXv_char8[0] = httpContext.getMessage( "DEL", "") ;
      new app.pprofs02(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_char2, GXv_char8) ;
      webwbarprotabla_impl.this.A396EmprCod = GXv_char4[0] ;
      webwbarprotabla_impl.this.A129BarCod = GXv_int7[0] ;
      webwbarprotabla_impl.this.A132BarCodReo = GXv_int6[0] ;
      webwbarprotabla_impl.this.A130BarCodPar = GXv_char3[0] ;
      webwbarprotabla_impl.this.A758ProCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      GXv_char8[0] = A396EmprCod ;
      GXv_int7[0] = A129BarCod ;
      GXv_int6[0] = A132BarCodReo ;
      GXv_char4[0] = A130BarCodPar ;
      GXv_char3[0] = A758ProCod ;
      GXv_char2[0] = httpContext.getMessage( "DEL", "") ;
      new app.prenfas(remoteHandle, context).execute( GXv_char8, GXv_int7, GXv_int6, GXv_char4, GXv_char3, GXv_char2) ;
      webwbarprotabla_impl.this.A396EmprCod = GXv_char8[0] ;
      webwbarprotabla_impl.this.A129BarCod = GXv_int7[0] ;
      webwbarprotabla_impl.this.A132BarCodReo = GXv_int6[0] ;
      webwbarprotabla_impl.this.A130BarCodPar = GXv_char4[0] ;
      webwbarprotabla_impl.this.A758ProCod = GXv_char3[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      new app.pcommit(remoteHandle, context).execute( ) ;
      AV19Inc_obs = httpContext.getMessage( "Baja Proceso= ", "") + A758ProCod + GXutil.newLine( ) ;
      new app.pctrinc(remoteHandle, context).execute( A396EmprCod, GXutil.substring( AV40Pgmname, 1, 10), AV12UsurCod, AV10Station, AV19Inc_obs, A129BarCod, A132BarCodReo, A130BarCodPar) ;
      if ( AV18Planing == 1 )
      {
         GXv_char8[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         new app.ppla005(remoteHandle, context).execute( GXv_char8, GXv_int7, GXv_int6, GXv_char4) ;
         webwbarprotabla_impl.this.A396EmprCod = GXv_char8[0] ;
         webwbarprotabla_impl.this.A129BarCod = GXv_int7[0] ;
         webwbarprotabla_impl.this.A132BarCodReo = GXv_int6[0] ;
         webwbarprotabla_impl.this.A130BarCodPar = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      }
      if ( AV17Carvema == 1 )
      {
         GXv_char8[0] = A396EmprCod ;
         GXv_int7[0] = A129BarCod ;
         GXv_int6[0] = A132BarCodReo ;
         GXv_char4[0] = A130BarCodPar ;
         GXv_char3[0] = AV12UsurCod ;
         GXv_char2[0] = AV10Station ;
         new app.pultfasfteo(remoteHandle, context).execute( GXv_char8, GXv_int7, GXv_int6, GXv_char4, GXv_char3, GXv_char2) ;
         webwbarprotabla_impl.this.A396EmprCod = GXv_char8[0] ;
         webwbarprotabla_impl.this.A129BarCod = GXv_int7[0] ;
         webwbarprotabla_impl.this.A132BarCodReo = GXv_int6[0] ;
         webwbarprotabla_impl.this.A130BarCodPar = GXv_char4[0] ;
         webwbarprotabla_impl.this.AV12UsurCod = GXv_char3[0] ;
         webwbarprotabla_impl.this.AV10Station = GXv_char2[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV12UsurCod", AV12UsurCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV10Station", AV10Station);
      }
      httpContext.doAjaxRefresh();
   }

   public void e20F72( )
   {
      /* 'DoFases' Routine */
      returnInSub = false ;
      if ( ! (GXutil.strcmp("", A758ProCod)==0) )
      {
         httpContext.popup(formatLink("app.webwbarfastabla", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A758ProCod)),GXutil.URLEncode(GXutil.rtrim(A759ProDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV30Barext,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc","BarExt"}) , new Object[] {"A396EmprCod","A129BarCod","A132BarCodReo","A130BarCodPar","A758ProCod","A759ProDsc","AV30Barext"});
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void wb_table1_48_F72( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarproceso_Internalname, tblTabledvelop_confirmpanel_eliminarproceso_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarproceso.setProperty("Title", Dvelop_confirmpanel_eliminarproceso_Title);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarproceso_Confirmationtext);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarproceso.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarproceso_Confirmtype);
         ucDvelop_confirmpanel_eliminarproceso.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarproceso_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARPROCESOContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARPROCESOContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_48_F72e( true) ;
      }
      else
      {
         wb_table1_48_F72e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      AV21Discod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21Discod), 8, 0));
      AV20BarSit = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20BarSit", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20BarSit), 2, 0));
      AV30Barext = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Barext", GXutil.str( AV30Barext, 1, 0));
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
      paF72( ) ;
      wsF72( ) ;
      weF72( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202681714185388", true, true);
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
         httpContext.AddJavascriptSource("webwbarprotabla.js", "?202681714185389", false, true);
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
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_352( )
   {
      cmbavAcciones.setInternalname( "vACCIONES_"+sGXsfl_35_idx );
      edtProCod_Internalname = "PROCOD_"+sGXsfl_35_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_35_idx ;
      cmbProFasEst.setInternalname( "PROFASEST_"+sGXsfl_35_idx );
      edtavTdislin_Internalname = "vTDISLIN_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_352( )
   {
      cmbavAcciones.setInternalname( "vACCIONES_"+sGXsfl_35_fel_idx );
      edtProCod_Internalname = "PROCOD_"+sGXsfl_35_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_35_fel_idx ;
      cmbProFasEst.setInternalname( "PROFASEST_"+sGXsfl_35_fel_idx );
      edtavTdislin_Internalname = "vTDISLIN_"+sGXsfl_35_fel_idx ;
   }

   public void sendrow_352( )
   {
      subsflControlProps_352( ) ;
      wbF70( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_35_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_35_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavAcciones.getEnabled()!=0)&&(cmbavAcciones.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 36,'',false,'"+sGXsfl_35_idx+"',35)\"" : " ") ;
         if ( ( cmbavAcciones.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vACCIONES_" + sGXsfl_35_idx ;
            cmbavAcciones.setName( GXCCtl );
            cmbavAcciones.setWebtags( "" );
            if ( cmbavAcciones.getItemCount() > 0 )
            {
               AV33Acciones = (short)(GXutil.lval( cmbavAcciones.getValidValue(GXutil.trim( GXutil.str( AV33Acciones, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavAcciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Acciones), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAcciones,cmbavAcciones.getInternalname(),GXutil.trim( GXutil.str( AV33Acciones, 4, 0)),Integer.valueOf(1),cmbavAcciones.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVACCIONES.CLICK."+sGXsfl_35_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavAcciones.getColumnClass(),cmbavAcciones.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAcciones.getEnabled()!=0)&&(cmbavAcciones.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,36);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAcciones.setValue( GXutil.trim( GXutil.str( AV33Acciones, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAcciones.getInternalname(), "Values", cmbavAcciones.ToJavascriptSource(), !bGXsfl_35_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtProCod_Columnclass,edtProCod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtProDsc_Columnclass,edtProDsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         GXCCtl = "PROFASEST_" + sGXsfl_35_idx ;
         cmbProFasEst.setName( GXCCtl );
         cmbProFasEst.setWebtags( "" );
         cmbProFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
         cmbProFasEst.addItem("1", httpContext.getMessage( "Iniciado", ""), (short)(0));
         cmbProFasEst.addItem("2", httpContext.getMessage( "Finalizado", ""), (short)(0));
         if ( cmbProFasEst.getItemCount() > 0 )
         {
            A760ProFasEst = (byte)(GXutil.lval( cmbProFasEst.getValidValue(GXutil.trim( GXutil.str( A760ProFasEst, 1, 0))))) ;
            n760ProFasEst = false ;
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbProFasEst,cmbProFasEst.getInternalname(),GXutil.trim( GXutil.str( A760ProFasEst, 1, 0)),Integer.valueOf(1),cmbProFasEst.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute",cmbProFasEst.getColumnClass(),cmbProFasEst.getColumnHeaderClass(),"","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbProFasEst.setValue( GXutil.trim( GXutil.str( A760ProFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbProFasEst.getInternalname(), "Values", cmbProFasEst.ToJavascriptSource(), !bGXsfl_35_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTdislin_Enabled!=0)&&(edtavTdislin_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'',false,'"+sGXsfl_35_idx+"',35)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTdislin_Internalname,GXutil.ltrim( localUtil.ntoc( AV22Tdislin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTdislin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV22Tdislin), "9") : localUtil.format( DecimalUtil.doubleToDec(AV22Tdislin), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavTdislin_Enabled!=0)&&(edtavTdislin_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTdislin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavTdislin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesF72( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_35_idx = ((subGrid_Islastpage==1)&&(nGXsfl_35_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
      }
      /* End function sendrow_352 */
   }

   public void startgridcontrol35( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"35\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Estado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tdislin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         if ( isAjaxCallMode( ) )
         {
            GridContainer = new com.genexus.webpanels.GXWebGrid(context);
         }
         else
         {
            GridContainer.Clear();
         }
         GridContainer.SetWrapped(nGXWrapped);
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV33Acciones, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavAcciones.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavAcciones.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtProCod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtProCod_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtProDsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtProDsc_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A760ProFasEst, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbProFasEst.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbProFasEst.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV22Tdislin, (byte)(1), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTdislin_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnagregarproceso_Internalname = "BTNAGREGARPROCESO" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divOpciones_Internalname = "OPCIONES" ;
      Dvpanel_opciones_Internalname = "DVPANEL_OPCIONES" ;
      cmbavAcciones.setInternalname( "vACCIONES" );
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      cmbProFasEst.setInternalname( "PROFASEST" );
      edtavTdislin_Internalname = "vTDISLIN" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGridcurrentpage_Internalname = "vGRIDCURRENTPAGE" ;
      Dvelop_confirmpanel_eliminarproceso_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARPROCESO" ;
      tblTabledvelop_confirmpanel_eliminarproceso_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARPROCESO" ;
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
      edtavTdislin_Jsonclick = "" ;
      edtavTdislin_Visible = 0 ;
      edtavTdislin_Enabled = 1 ;
      cmbProFasEst.setJsonclick( "" );
      cmbProFasEst.setColumnClass( "WWColumn" );
      edtProDsc_Jsonclick = "" ;
      edtProDsc_Columnclass = "WWColumn" ;
      edtProCod_Jsonclick = "" ;
      edtProCod_Columnclass = "WWColumn" ;
      cmbavAcciones.setJsonclick( "" );
      cmbavAcciones.setVisible( -1 );
      cmbavAcciones.setEnabled( 1 );
      cmbavAcciones.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      cmbProFasEst.setColumnHeaderClass( "" );
      edtProDsc_Columnheaderclass = "" ;
      edtProCod_Columnheaderclass = "" ;
      cmbavAcciones.setColumnHeaderClass( "" );
      edtavGridcurrentpage_Jsonclick = "" ;
      edtavGridcurrentpage_Visible = 1 ;
      Dvelop_confirmpanel_eliminarproceso_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarproceso_Confirmationtext = "¿Desea eliminar el Proceso?" ;
      Dvelop_confirmpanel_eliminarproceso_Title = "" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Procesos", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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
      Dvpanel_opciones_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_opciones_Iconposition = "Right" ;
      Dvpanel_opciones_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_opciones_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_opciones_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_opciones_Title = httpContext.getMessage( "WWP_FilterOptions", "") ;
      Dvpanel_opciones_Cls = "PanelNoHeader" ;
      Dvpanel_opciones_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_opciones_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_opciones_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento de Procesos (Hdr)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vACCIONES_" + sGXsfl_35_idx ;
      cmbavAcciones.setName( GXCCtl );
      cmbavAcciones.setWebtags( "" );
      if ( cmbavAcciones.getItemCount() > 0 )
      {
         AV33Acciones = (short)(GXutil.lval( cmbavAcciones.getValidValue(GXutil.trim( GXutil.str( AV33Acciones, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavAcciones.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33Acciones), 4, 0));
      }
      GXCCtl = "PROFASEST_" + sGXsfl_35_idx ;
      cmbProFasEst.setName( GXCCtl );
      cmbProFasEst.setWebtags( "" );
      cmbProFasEst.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbProFasEst.addItem("1", httpContext.getMessage( "Iniciado", ""), (short)(0));
      cmbProFasEst.addItem("2", httpContext.getMessage( "Finalizado", ""), (short)(0));
      if ( cmbProFasEst.getItemCount() > 0 )
      {
         A760ProFasEst = (byte)(GXutil.lval( cmbProFasEst.getValidValue(GXutil.trim( GXutil.str( A760ProFasEst, 1, 0))))) ;
         n760ProFasEst = false ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV21Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV17Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'cmbavAcciones'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'cmbProFasEst'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e18F72',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV21Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'cmbProFasEst'},{av:'A760ProFasEst',fld:'PROFASEST',pic:'9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV22Tdislin',fld:'vTDISLIN',pic:'9'},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV21Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbavAcciones'},{av:'AV33Acciones',fld:'vACCIONES',pic:'ZZZ9'},{av:'edtProCod_Columnclass',ctrl:'PROCOD',prop:'Columnclass'},{av:'edtProDsc_Columnclass',ctrl:'PRODSC',prop:'Columnclass'},{av:'cmbProFasEst'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11F72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV21Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV17Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV8GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV8GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'cmbavAcciones'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'cmbProFasEst'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12F72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV21Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV17Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV8GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VACCIONES.CLICK","{handler:'e19F72',iparms:[{av:'cmbavAcciones'},{av:'AV33Acciones',fld:'vACCIONES',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV21Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV17Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'AV30Barext',fld:'vBAREXT',pic:'9'},{av:'cmbProFasEst'},{av:'A760ProFasEst',fld:'PROFASEST',pic:'9'}]");
      setEventMetadata("VACCIONES.CLICK",",oparms:[{av:'cmbavAcciones'},{av:'AV33Acciones',fld:'vACCIONES',pic:'ZZZ9'},{av:'AV30Barext',fld:'vBAREXT',pic:'9'},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_eliminarproceso_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARPROCESO',prop:'ConfirmationText'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'cmbProFasEst'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARPROCESO.CLOSE","{handler:'e13F72',iparms:[{av:'Dvelop_confirmpanel_eliminarproceso_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARPROCESO',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV21Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV17Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'AV12UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV10Station',fld:'vSTATION',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARPROCESO.CLOSE",",oparms:[{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV10Station',fld:'vSTATION',pic:''},{av:'AV12UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'cmbavAcciones'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'cmbProFasEst'}]}");
      setEventMetadata("'DOAGREGARPROCESO'","{handler:'e14F72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV21Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV17Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'AV20BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV30Barext',fld:'vBAREXT',pic:'9'}]");
      setEventMetadata("'DOAGREGARPROCESO'",",oparms:[{av:'AV30Barext',fld:'vBAREXT',pic:'9'},{av:'AV20BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV21Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbavAcciones'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'cmbProFasEst'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e15F72',iparms:[{av:'AV30Barext',fld:'vBAREXT',pic:'9'},{av:'AV20BarSit',fld:'vBARSIT',pic:'Z9'},{av:'AV21Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOFASES'","{handler:'e20F72',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'AV21Discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV18Planing',fld:'vPLANING',pic:'ZZZ9',hsh:true},{av:'AV17Carvema',fld:'vCARVEMA',pic:'ZZZ9',hsh:true},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'AV30Barext',fld:'vBAREXT',pic:'9'}]");
      setEventMetadata("'DOFASES'",",oparms:[{av:'AV30Barext',fld:'vBAREXT',pic:'9'},{av:'A759ProDsc',fld:'PRODSC',pic:''},{av:'A758ProCod',fld:'PROCOD',pic:''},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'cmbavAcciones'},{av:'edtProCod_Columnheaderclass',ctrl:'PROCOD',prop:'Columnheaderclass'},{av:'edtProDsc_Columnheaderclass',ctrl:'PRODSC',prop:'Columnheaderclass'},{av:'cmbProFasEst'}]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Tdislin',iparms:[]");
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
      wcpOA396EmprCod = "" ;
      wcpOA130BarCodPar = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_eliminarproceso_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV40Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV12UsurCod = "" ;
      AV10Station = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_opciones = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      bttBtnagregarproceso_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      scmdbuf = "" ;
      H00F73_A396EmprCod = new String[] {""} ;
      H00F73_A129BarCod = new int[1] ;
      H00F73_A132BarCodReo = new byte[1] ;
      H00F73_A130BarCodPar = new String[] {""} ;
      H00F73_A759ProDsc = new String[] {""} ;
      H00F73_A758ProCod = new String[] {""} ;
      H00F73_A760ProFasEst = new byte[1] ;
      H00F73_n760ProFasEst = new boolean[] {false} ;
      H00F75_AGRID_nRecordCount = new long[1] ;
      AV11EmprNom = "" ;
      GXt_char1 = "" ;
      AV39Emprcod = "" ;
      AV26Seleccionar = "" ;
      AV29SeleccionarFases = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      ucDvelop_confirmpanel_eliminarproceso = new com.genexus.webpanels.GXUserControl();
      AV19Inc_obs = "" ;
      GXv_char8 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char4 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwbarprotabla__default(),
         new Object[] {
             new Object[] {
            H00F73_A396EmprCod, H00F73_A129BarCod, H00F73_A132BarCodReo, H00F73_A130BarCodPar, H00F73_A759ProDsc, H00F73_A758ProCod, H00F73_A760ProFasEst, H00F73_n760ProFasEst
            }
            , new Object[] {
            H00F75_AGRID_nRecordCount
            }
         }
      );
      AV40Pgmname = "WebWBARPROtabla" ;
      /* GeneXus formulas. */
      AV40Pgmname = "WebWBARPROtabla" ;
      Gx_err = (short)(0) ;
      edtavTdislin_Enabled = 0 ;
   }

   private byte wcpOA132BarCodReo ;
   private byte wcpOAV20BarSit ;
   private byte wcpOAV30Barext ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte AV20BarSit ;
   private byte AV30Barext ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte A760ProFasEst ;
   private byte AV22Tdislin ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV18Planing ;
   private short AV17Carvema ;
   private short wbEnd ;
   private short wbStart ;
   private short AV33Acciones ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA129BarCod ;
   private int wcpOAV21Discod ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_35 ;
   private int subGrid_Rows ;
   private int A129BarCod ;
   private int AV21Discod ;
   private int nGXsfl_35_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavGridcurrentpage_Visible ;
   private int subGrid_Islastpage ;
   private int edtavTdislin_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV7PageToGo ;
   private int GXv_int7[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavTdislin_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV9GridPageCount ;
   private long AV8GridCurrentPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Gridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_eliminarproceso_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String sGXsfl_35_idx="0001" ;
   private String AV40Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV12UsurCod ;
   private String AV10Station ;
   private String Dvpanel_opciones_Width ;
   private String Dvpanel_opciones_Cls ;
   private String Dvpanel_opciones_Title ;
   private String Dvpanel_opciones_Iconposition ;
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
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Dvelop_confirmpanel_eliminarproceso_Title ;
   private String Dvelop_confirmpanel_eliminarproceso_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarproceso_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarproceso_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarproceso_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarproceso_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarproceso_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_opciones_Internalname ;
   private String divOpciones_Internalname ;
   private String TempTags ;
   private String bttBtnagregarproceso_Internalname ;
   private String bttBtnagregarproceso_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
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
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Internalname ;
   private String edtavTdislin_Internalname ;
   private String scmdbuf ;
   private String AV11EmprNom ;
   private String GXt_char1 ;
   private String AV39Emprcod ;
   private String edtProCod_Columnheaderclass ;
   private String edtProDsc_Columnheaderclass ;
   private String AV26Seleccionar ;
   private String AV29SeleccionarFases ;
   private String edtProCod_Columnclass ;
   private String edtProDsc_Columnclass ;
   private String Dvelop_confirmpanel_eliminarproceso_Internalname ;
   private String GXv_char8[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminarproceso_Internalname ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String edtavTdislin_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_opciones_Autowidth ;
   private boolean Dvpanel_opciones_Autoheight ;
   private boolean Dvpanel_opciones_Collapsible ;
   private boolean Dvpanel_opciones_Collapsed ;
   private boolean Dvpanel_opciones_Showcollapseicon ;
   private boolean Dvpanel_opciones_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n760ProFasEst ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV19Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_opciones ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarproceso ;
   private HTMLChoice cmbavAcciones ;
   private HTMLChoice cmbProFasEst ;
   private IDataStoreProvider pr_default ;
   private String[] H00F73_A396EmprCod ;
   private int[] H00F73_A129BarCod ;
   private byte[] H00F73_A132BarCodReo ;
   private String[] H00F73_A130BarCodPar ;
   private String[] H00F73_A759ProDsc ;
   private String[] H00F73_A758ProCod ;
   private byte[] H00F73_A760ProFasEst ;
   private boolean[] H00F73_n760ProFasEst ;
   private long[] H00F75_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwbarprotabla__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00F73", "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT  T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.ProDsc, T1.ProCod, COALESCE( T3.ProFasEst, 0) AS ProFasEst FROM ((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod) GX_CTE) WHERE GX_ROW_NUMBER BETWEEN ? AND ? OR ? < ? AND GX_ROW_NUMBER >= ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00F75", "SELECT COUNT(*) FROM ((TXPBARPRO T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) LEFT JOIN (SELECT MIN(BarFasEst) AS ProFasEst, EmprCod, BarCod, BarCodReo, BarCodPar, ProCod FROM TXPBARFAS WHERE BarFasEst <> 0 GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar, ProCod ) T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((String[]) buf[4])[0] = rslt.getString(5, 40);
               ((String[]) buf[5])[0] = rslt.getString(6, 8);
               ((byte[]) buf[6])[0] = rslt.getByte(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
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
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setInt(5, ((Number) parms[4]).intValue());
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

