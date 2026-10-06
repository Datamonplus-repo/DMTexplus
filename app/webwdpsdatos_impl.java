package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwdpsdatos_impl extends GXWebComponent
{
   public webwdpsdatos_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwdpsdatos_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwdpsdatos_impl.class ));
   }

   public webwdpsdatos_impl( int remoteHandle ,
                             ModelContext context )
   {
      super( remoteHandle , context);
   }

   public void setPrefix( String sPPrefix )
   {
      sPrefix = sPPrefix;
   }

   protected void createObjects( )
   {
      cmbavBarfasest = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
            else if ( GXutil.strcmp(gxfirstwebparm, "dyncomponent") == 0 )
            {
               httpContext.setAjaxEventMode();
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               nDynComponent = (byte)(1) ;
               sCompPrefix = httpContext.GetPar( "sCompPrefix") ;
               sSFPrefix = httpContext.GetPar( "sSFPrefix") ;
               A396EmprCod = httpContext.GetPar( "EmprCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
               A602MaqCod = httpContext.GetPar( "MaqCod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,A396EmprCod,Integer.valueOf(A129BarCod),Byte.valueOf(A132BarCodReo),A130BarCodPar,A602MaqCod});
               componentstart();
               httpContext.ajax_rspStartCmp(sPrefix);
               componentdraw();
               httpContext.ajax_rspEndCmp();
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
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isLocalStorageSupported( ) )
         {
            httpContext.pushCurrentUrl();
         }
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_133 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_133"))) ;
      nGXsfl_133_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_133_idx"))) ;
      sGXsfl_133_idx = httpContext.GetPar( "sGXsfl_133_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
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
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paBR2( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            validateSpaRequest();
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( ! isAjaxCallMode( ) )
            {
               if ( nDynComponent == 0 )
               {
                  httpContext.sendError( 404 );
                  GXutil.writeLog("send_http_error_code 404");
                  GxWebError = (byte)(1) ;
               }
            }
         }
         if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
         {
            if ( nDynComponent == 0 )
            {
               throw new RuntimeException("WebComponent is not allowed to run");
            }
         }
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
      cleanup();
   }

   public void renderHtmlHeaders( )
   {
      app.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
         httpContext.writeText( "<title>") ;
         httpContext.writeValue( httpContext.getMessage( "Ver datos HDR", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = ((nGXWrapped==0) ? " data-HasEnter=\"false\" data-Skiponenter=\"true\"" : "") ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         if ( nGXWrapped != 1 )
         {
            httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwdpsdatos", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar)),GXutil.URLEncode(GXutil.rtrim(A602MaqCod))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","MaqCod"}) +"\">") ;
            app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
            app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
            httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
            httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
         }
      }
      else
      {
         boolean toggleHtmlOutput = httpContext.isOutputEnabled( );
         if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableOutput();
            }
         }
         httpContext.writeText( "<div") ;
         app.GxWebStd.classAttribute( httpContext, "gxwebcomponent-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         if ( toggleHtmlOutput )
         {
            if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableOutput();
               }
            }
         }
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      if ( GXutil.strSearch( sPrefix, "MP", 1) == 1 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_133", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_133, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV86GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA396EmprCod", GXutil.rtrim( wcpOA396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA129BarCod", GXutil.ltrim( localUtil.ntoc( wcpOA129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA132BarCodReo", GXutil.ltrim( localUtil.ntoc( wcpOA132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA130BarCodPar", GXutil.rtrim( wcpOA130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOA602MaqCod", GXutil.rtrim( wcpOA602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"MAQCOD", GXutil.rtrim( A602MaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARAGRCOD", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARAGRREO", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARAGRPAR", GXutil.rtrim( A122BarAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"BARTOTAGR", GXutil.ltrim( localUtil.ntoc( A219BarTotAgr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLGENERAL_Width", GXutil.rtrim( Dvpanel_pnlgeneral_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLGENERAL_Autowidth", GXutil.booltostr( Dvpanel_pnlgeneral_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLGENERAL_Autoheight", GXutil.booltostr( Dvpanel_pnlgeneral_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLGENERAL_Cls", GXutil.rtrim( Dvpanel_pnlgeneral_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLGENERAL_Title", GXutil.rtrim( Dvpanel_pnlgeneral_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLGENERAL_Collapsible", GXutil.booltostr( Dvpanel_pnlgeneral_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLGENERAL_Collapsed", GXutil.booltostr( Dvpanel_pnlgeneral_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLGENERAL_Showcollapseicon", GXutil.booltostr( Dvpanel_pnlgeneral_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLGENERAL_Iconposition", GXutil.rtrim( Dvpanel_pnlgeneral_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLGENERAL_Autoscroll", GXutil.booltostr( Dvpanel_pnlgeneral_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLDETALLE_Width", GXutil.rtrim( Dvpanel_pnldetalle_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLDETALLE_Autowidth", GXutil.booltostr( Dvpanel_pnldetalle_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLDETALLE_Autoheight", GXutil.booltostr( Dvpanel_pnldetalle_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLDETALLE_Cls", GXutil.rtrim( Dvpanel_pnldetalle_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLDETALLE_Title", GXutil.rtrim( Dvpanel_pnldetalle_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLDETALLE_Collapsible", GXutil.booltostr( Dvpanel_pnldetalle_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLDETALLE_Collapsed", GXutil.booltostr( Dvpanel_pnldetalle_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLDETALLE_Showcollapseicon", GXutil.booltostr( Dvpanel_pnldetalle_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLDETALLE_Iconposition", GXutil.rtrim( Dvpanel_pnldetalle_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLDETALLE_Autoscroll", GXutil.booltostr( Dvpanel_pnldetalle_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Class", GXutil.rtrim( Gridpaginationbar_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showfirst", GXutil.booltostr( Gridpaginationbar_Showfirst));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showprevious", GXutil.booltostr( Gridpaginationbar_Showprevious));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Shownext", GXutil.booltostr( Gridpaginationbar_Shownext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Showlast", GXutil.booltostr( Gridpaginationbar_Showlast));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagestoshow", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Pagestoshow, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition", GXutil.rtrim( Gridpaginationbar_Pagingbuttonsposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition", GXutil.rtrim( Gridpaginationbar_Pagingcaptionposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridclass", GXutil.rtrim( Gridpaginationbar_Emptygridclass));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector", GXutil.booltostr( Gridpaginationbar_Rowsperpageselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions", GXutil.rtrim( Gridpaginationbar_Rowsperpageoptions));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Previous", GXutil.rtrim( Gridpaginationbar_Previous));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Next", GXutil.rtrim( Gridpaginationbar_Next));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Caption", GXutil.rtrim( Gridpaginationbar_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption", GXutil.rtrim( Gridpaginationbar_Emptygridcaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption", GXutil.rtrim( Gridpaginationbar_Rowsperpagecaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLAGRUP_Width", GXutil.rtrim( Dvpanel_pnlagrup_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLAGRUP_Autowidth", GXutil.booltostr( Dvpanel_pnlagrup_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLAGRUP_Autoheight", GXutil.booltostr( Dvpanel_pnlagrup_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLAGRUP_Cls", GXutil.rtrim( Dvpanel_pnlagrup_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLAGRUP_Title", GXutil.rtrim( Dvpanel_pnlagrup_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLAGRUP_Collapsible", GXutil.booltostr( Dvpanel_pnlagrup_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLAGRUP_Collapsed", GXutil.booltostr( Dvpanel_pnlagrup_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLAGRUP_Showcollapseicon", GXutil.booltostr( Dvpanel_pnlagrup_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLAGRUP_Iconposition", GXutil.rtrim( Dvpanel_pnlagrup_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PNLAGRUP_Autoscroll", GXutil.booltostr( Dvpanel_pnlagrup_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormBR2( )
   {
      sendCloseFormHiddens( ) ;
      if ( ( GXutil.len( sPrefix) != 0 ) && ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) ) )
      {
         componentjscripts();
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GX_FocusControl", GX_FocusControl);
      define_styles( ) ;
      sendSecurityToken(sPrefix);
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.SendAjaxEncryptionKey();
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
         httpContext.writeTextNL( "</body>") ;
         httpContext.writeTextNL( "</html>") ;
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableOutput();
         }
      }
      else
      {
         httpContext.SendWebComponentState();
         httpContext.writeText( "</div>") ;
         if ( toggleJsOutput )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.enableJsOutput();
            }
         }
      }
   }

   public String getPgmname( )
   {
      return "WebWDPSDatos" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Ver datos HDR", "") ;
   }

   public void wbBR0( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! wbLoad )
      {
         if ( GXutil.len( sPrefix) == 0 )
         {
            renderHtmlHeaders( ) ;
         }
         renderHtmlOpenForm( ) ;
         if ( GXutil.len( sPrefix) != 0 )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.webwdpsdatos");
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
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucDvpanel_pnlgeneral.setProperty("Width", Dvpanel_pnlgeneral_Width);
         ucDvpanel_pnlgeneral.setProperty("AutoWidth", Dvpanel_pnlgeneral_Autowidth);
         ucDvpanel_pnlgeneral.setProperty("AutoHeight", Dvpanel_pnlgeneral_Autoheight);
         ucDvpanel_pnlgeneral.setProperty("Cls", Dvpanel_pnlgeneral_Cls);
         ucDvpanel_pnlgeneral.setProperty("Title", Dvpanel_pnlgeneral_Title);
         ucDvpanel_pnlgeneral.setProperty("Collapsible", Dvpanel_pnlgeneral_Collapsible);
         ucDvpanel_pnlgeneral.setProperty("Collapsed", Dvpanel_pnlgeneral_Collapsed);
         ucDvpanel_pnlgeneral.setProperty("ShowCollapseIcon", Dvpanel_pnlgeneral_Showcollapseicon);
         ucDvpanel_pnlgeneral.setProperty("IconPosition", Dvpanel_pnlgeneral_Iconposition);
         ucDvpanel_pnlgeneral.setProperty("AutoScroll", Dvpanel_pnlgeneral_Autoscroll);
         ucDvpanel_pnlgeneral.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnlgeneral_Internalname, sPrefix+"DVPANEL_PNLGENERALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_PNLGENERALContainer"+"pnlGeneral"+"\" style=\"display:none;\">") ;
         wb_table1_16_BR2( true) ;
      }
      else
      {
         wb_table1_16_BR2( false) ;
      }
      return  ;
   }

   public void wb_table1_16_BR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucDvpanel_pnldetalle.setProperty("Width", Dvpanel_pnldetalle_Width);
         ucDvpanel_pnldetalle.setProperty("AutoWidth", Dvpanel_pnldetalle_Autowidth);
         ucDvpanel_pnldetalle.setProperty("AutoHeight", Dvpanel_pnldetalle_Autoheight);
         ucDvpanel_pnldetalle.setProperty("Cls", Dvpanel_pnldetalle_Cls);
         ucDvpanel_pnldetalle.setProperty("Title", Dvpanel_pnldetalle_Title);
         ucDvpanel_pnldetalle.setProperty("Collapsible", Dvpanel_pnldetalle_Collapsible);
         ucDvpanel_pnldetalle.setProperty("Collapsed", Dvpanel_pnldetalle_Collapsed);
         ucDvpanel_pnldetalle.setProperty("ShowCollapseIcon", Dvpanel_pnldetalle_Showcollapseicon);
         ucDvpanel_pnldetalle.setProperty("IconPosition", Dvpanel_pnldetalle_Iconposition);
         ucDvpanel_pnldetalle.setProperty("AutoScroll", Dvpanel_pnldetalle_Autoscroll);
         ucDvpanel_pnldetalle.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnldetalle_Internalname, sPrefix+"DVPANEL_PNLDETALLEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_PNLDETALLEContainer"+"pnlDetalle"+"\" style=\"display:none;\">") ;
         wb_table2_47_BR2( true) ;
      }
      else
      {
         wb_table2_47_BR2( false) ;
      }
      return  ;
   }

   public void wb_table2_47_BR2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_pnlagrup_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_pnlagrup_cell_Class, "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucDvpanel_pnlagrup.setProperty("Width", Dvpanel_pnlagrup_Width);
         ucDvpanel_pnlagrup.setProperty("AutoWidth", Dvpanel_pnlagrup_Autowidth);
         ucDvpanel_pnlagrup.setProperty("AutoHeight", Dvpanel_pnlagrup_Autoheight);
         ucDvpanel_pnlagrup.setProperty("Cls", Dvpanel_pnlagrup_Cls);
         ucDvpanel_pnlagrup.setProperty("Title", Dvpanel_pnlagrup_Title);
         ucDvpanel_pnlagrup.setProperty("Collapsible", Dvpanel_pnlagrup_Collapsible);
         ucDvpanel_pnlagrup.setProperty("Collapsed", Dvpanel_pnlagrup_Collapsed);
         ucDvpanel_pnlagrup.setProperty("ShowCollapseIcon", Dvpanel_pnlagrup_Showcollapseicon);
         ucDvpanel_pnlagrup.setProperty("IconPosition", Dvpanel_pnlagrup_Iconposition);
         ucDvpanel_pnlagrup.setProperty("AutoScroll", Dvpanel_pnlagrup_Autoscroll);
         ucDvpanel_pnlagrup.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnlagrup_Internalname, sPrefix+"DVPANEL_PNLAGRUPContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_PNLAGRUPContainer"+"pnlAgrup"+"\" style=\"display:none;\">") ;
         wb_table3_127_BR2( true) ;
      }
      else
      {
         wb_table3_127_BR2( false) ;
      }
      return  ;
   }

   public void wb_table3_127_BR2e( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divHtml_bottomauxiliarcontrols_Internalname, 1, 0, "px", 0, "px", "Section", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 141,'" + sPrefix + "',false,'" + sGXsfl_133_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV85GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV85GridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,141);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWDPSDatos.htm");
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 133 )
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
               httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startBR2( )
   {
      wbLoad = false ;
      wbEnd = 0 ;
      wbStart = 0 ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( ! httpContext.isSpaRequest( ) )
         {
            if ( httpContext.exposeMetadata( ) )
            {
               Form.getMeta().addItem("generator", "GeneXus Java 17_0_11-163677", (short)(0)) ;
            }
            Form.getMeta().addItem("description", httpContext.getMessage( "Ver datos HDR", ""), (short)(0)) ;
         }
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
         httpContext.wbHandled = (byte)(0) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            sXEvt = httpContext.cgiGet( "_EventName") ;
            if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
            {
            }
         }
      }
      wbErr = false ;
      if ( ( GXutil.len( sPrefix) == 0 ) || ( nDraw == 1 ) )
      {
         if ( nDoneStart == 0 )
         {
            strupBR0( ) ;
         }
      }
   }

   public void wsBR2( )
   {
      startBR2( ) ;
      evtBR2( ) ;
   }

   public void evtBR2( )
   {
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ( ( ( GXutil.len( sPrefix) == 0 ) ) || ( GXutil.strSearch( sXEvt, sPrefix, 1) > 0 ) ) && ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) && ! wbErr )
         {
            /* Read Web Panel buttons. */
            if ( httpContext.wbHandled == 0 )
            {
               if ( GXutil.len( sPrefix) == 0 )
               {
                  sEvt = httpContext.cgiGet( "_EventName") ;
                  EvtGridId = httpContext.cgiGet( "_EventGridId") ;
                  EvtRowId = httpContext.cgiGet( "_EventRowId") ;
               }
               if ( GXutil.len( sEvt) > 0 )
               {
                  sEvtType = GXutil.left( sEvt, 1) ;
                  sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
                  if ( GXutil.strcmp(sEvtType, "E") == 0 )
                  {
                     sEvtType = GXutil.right( sEvt, 1) ;
                     if ( GXutil.strcmp(sEvtType, ".") == 0 )
                     {
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                        if ( GXutil.strcmp(sEvt, "RFR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupBR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupBR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11BR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupBR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12BR2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupBR0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavMaqdsc_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
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
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupBR0( ) ;
                           }
                           nGXsfl_133_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1332( ) ;
                           A13695BarAGrHdr = httpContext.cgiGet( edtBarAGrHdr_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMaqdsc_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e13BR2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMaqdsc_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e14BR2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMaqdsc_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e15BR2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       if ( ! wbErr )
                                       {
                                          Rfr0gs = false ;
                                          if ( ! Rfr0gs )
                                          {
                                          }
                                          dynload_actions( ) ;
                                       }
                                    }
                                 }
                                 /* No code required for Cancel button. It is implemented as the Reset button. */
                              }
                              else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strupBR0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMaqdsc_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
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

   public void weBR2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormBR2( ) ;
         }
      }
   }

   public void paBR2( )
   {
      if ( nDonePA == 0 )
      {
         if ( GXutil.len( sPrefix) != 0 )
         {
            initialize_properties( ) ;
         }
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
            {
               gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(httpContext.getHttpSecure( ))) ;
            }
         }
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( httpContext.isSpaRequest( ) )
            {
               httpContext.disableJsOutput();
            }
         }
         init_web_controls( ) ;
         if ( GXutil.len( sPrefix) == 0 )
         {
            if ( toggleJsOutput )
            {
               if ( httpContext.isSpaRequest( ) )
               {
                  httpContext.enableJsOutput();
               }
            }
         }
         if ( ! httpContext.isAjaxRequest( ) )
         {
            GX_FocusControl = edtavMaqdsc_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
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
      subsflControlProps_1332( ) ;
      while ( nGXsfl_133_idx <= nRC_GXsfl_133 )
      {
         sendrow_1332( ) ;
         nGXsfl_133_idx = ((subGrid_Islastpage==1)&&(nGXsfl_133_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_133_idx+1) ;
         sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1332( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e14BR2 ();
      GRID_nCurrentRecord = 0 ;
      rfBR2( ) ;
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
         AV17BarFasEst = (byte)(GXutil.lval( cmbavBarfasest.getValidValue(GXutil.trim( GXutil.str( AV17BarFasEst, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarFasEst", GXutil.str( AV17BarFasEst, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV17BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfBR2( ) ;
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
      cmbavBarfasest.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
      edtavBarfasdti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasdti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdti_Enabled), 5, 0), true);
   }

   public void rfBR2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(133) ;
      /* Execute user event: Refresh */
      e14BR2 ();
      nGXsfl_133_idx = 1 ;
      sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1332( ) ;
      bGXsfl_133_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_1332( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_fnc_recordsperpage( )+1) ;
         /* Using cursor H00BR4 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_133_idx = 1 ;
         sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1332( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A122BarAgrPar = H00BR4_A122BarAgrPar[0] ;
            A124BarAgrReo = H00BR4_A124BarAgrReo[0] ;
            A119BarAgrCod = H00BR4_A119BarAgrCod[0] ;
            A166BarKgm = H00BR4_A166BarKgm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            A219BarTotAgr = H00BR4_A219BarTotAgr[0] ;
            n219BarTotAgr = H00BR4_n219BarTotAgr[0] ;
            A166BarKgm = H00BR4_A166BarKgm[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            A219BarTotAgr = H00BR4_A219BarTotAgr[0] ;
            n219BarTotAgr = H00BR4_n219BarTotAgr[0] ;
            A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
            e15BR2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(133) ;
         wbBR0( ) ;
      }
      bGXsfl_133_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesBR2( )
   {
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
      /* Using cursor H00BR7 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      GRID_nRecordCount = H00BR7_AGRID_nRecordCount[0] ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      cmbavBarfasest.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
      edtavBarfasdti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarfasdti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdti_Enabled), 5, 0), true);
      /* Using cursor H00BR8 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      A120BarAgrEst = H00BR8_A120BarAgrEst[0] ;
      A180BarMaqCod = H00BR8_A180BarMaqCod[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A180BarMaqCod", A180BarMaqCod);
      A252CliCod = H00BR8_A252CliCod[0] ;
      n252CliCod = H00BR8_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A4812BarEncCli = H00BR8_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
      A1234BarNomCli = H00BR8_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1234BarNomCli", A1234BarNomCli);
      A135BarColNom = H00BR8_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A135BarColNom", A135BarColNom);
      A212BarSer = H00BR8_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = H00BR8_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1652BarSerDsc", A1652BarSerDsc);
      pr_default.close(2);
      /* Using cursor H00BR9 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      A279CliNom = H00BR9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor H00BR11 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A166BarKgm = H00BR11_A166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      pr_default.close(4);
      /* Using cursor H00BR13 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A219BarTotAgr = H00BR13_A219BarTotAgr[0] ;
         n219BarTotAgr = H00BR13_n219BarTotAgr[0] ;
      }
      else
      {
         A219BarTotAgr = DecimalUtil.doubleToDec(0) ;
         n219BarTotAgr = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A219BarTotAgr", GXutil.ltrimstr( A219BarTotAgr, 10, 2));
      }
      pr_default.close(5);
      if ( A219BarTotAgr.doubleValue() != 0 )
      {
         A812RecTotKgm = A219BarTotAgr.add(A166BarKgm) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
      }
      else
      {
         A812RecTotKgm = A166BarKgm ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
      }
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      fix_multi_value_controls( ) ;
   }

   public void strupBR0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13BR2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_133 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_133"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV86GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
         wcpOA129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOA130BarCodPar = httpContext.cgiGet( sPrefix+"wcpOA130BarCodPar") ;
         wcpOA602MaqCod = httpContext.cgiGet( sPrefix+"wcpOA602MaqCod") ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_pnlgeneral_Width = httpContext.cgiGet( sPrefix+"DVPANEL_PNLGENERAL_Width") ;
         Dvpanel_pnlgeneral_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLGENERAL_Autowidth")) ;
         Dvpanel_pnlgeneral_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLGENERAL_Autoheight")) ;
         Dvpanel_pnlgeneral_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_PNLGENERAL_Cls") ;
         Dvpanel_pnlgeneral_Title = httpContext.cgiGet( sPrefix+"DVPANEL_PNLGENERAL_Title") ;
         Dvpanel_pnlgeneral_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLGENERAL_Collapsible")) ;
         Dvpanel_pnlgeneral_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLGENERAL_Collapsed")) ;
         Dvpanel_pnlgeneral_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLGENERAL_Showcollapseicon")) ;
         Dvpanel_pnlgeneral_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_PNLGENERAL_Iconposition") ;
         Dvpanel_pnlgeneral_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLGENERAL_Autoscroll")) ;
         Dvpanel_pnldetalle_Width = httpContext.cgiGet( sPrefix+"DVPANEL_PNLDETALLE_Width") ;
         Dvpanel_pnldetalle_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLDETALLE_Autowidth")) ;
         Dvpanel_pnldetalle_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLDETALLE_Autoheight")) ;
         Dvpanel_pnldetalle_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_PNLDETALLE_Cls") ;
         Dvpanel_pnldetalle_Title = httpContext.cgiGet( sPrefix+"DVPANEL_PNLDETALLE_Title") ;
         Dvpanel_pnldetalle_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLDETALLE_Collapsible")) ;
         Dvpanel_pnldetalle_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLDETALLE_Collapsed")) ;
         Dvpanel_pnldetalle_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLDETALLE_Showcollapseicon")) ;
         Dvpanel_pnldetalle_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_PNLDETALLE_Iconposition") ;
         Dvpanel_pnldetalle_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLDETALLE_Autoscroll")) ;
         Gridpaginationbar_Class = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Class") ;
         Gridpaginationbar_Showfirst = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showfirst")) ;
         Gridpaginationbar_Showprevious = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showprevious")) ;
         Gridpaginationbar_Shownext = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Shownext")) ;
         Gridpaginationbar_Showlast = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Showlast")) ;
         Gridpaginationbar_Pagestoshow = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagestoshow"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Pagingbuttonsposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingbuttonsposition") ;
         Gridpaginationbar_Pagingcaptionposition = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Pagingcaptionposition") ;
         Gridpaginationbar_Emptygridclass = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridclass") ;
         Gridpaginationbar_Rowsperpageselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselector")) ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Gridpaginationbar_Rowsperpageoptions = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageoptions") ;
         Gridpaginationbar_Previous = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Previous") ;
         Gridpaginationbar_Next = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Next") ;
         Gridpaginationbar_Caption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Caption") ;
         Gridpaginationbar_Emptygridcaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Emptygridcaption") ;
         Gridpaginationbar_Rowsperpagecaption = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpagecaption") ;
         Dvpanel_pnlagrup_Width = httpContext.cgiGet( sPrefix+"DVPANEL_PNLAGRUP_Width") ;
         Dvpanel_pnlagrup_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLAGRUP_Autowidth")) ;
         Dvpanel_pnlagrup_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLAGRUP_Autoheight")) ;
         Dvpanel_pnlagrup_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_PNLAGRUP_Cls") ;
         Dvpanel_pnlagrup_Title = httpContext.cgiGet( sPrefix+"DVPANEL_PNLAGRUP_Title") ;
         Dvpanel_pnlagrup_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLAGRUP_Collapsible")) ;
         Dvpanel_pnlagrup_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLAGRUP_Collapsed")) ;
         Dvpanel_pnlagrup_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLAGRUP_Showcollapseicon")) ;
         Dvpanel_pnlagrup_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_PNLAGRUP_Iconposition") ;
         Dvpanel_pnlagrup_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PNLAGRUP_Autoscroll")) ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A180BarMaqCod", A180BarMaqCod);
         AV66MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66MaqDsc", AV66MaqDsc);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A279CliNom", A279CliNom);
         A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A4812BarEncCli", A4812BarEncCli);
         A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1234BarNomCli", A1234BarNomCli);
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A135BarColNom", A135BarColNom);
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A1652BarSerDsc", A1652BarSerDsc);
         A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A812RecTotKgm = localUtil.ctond( httpContext.cgiGet( edtRecTotKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
         cmbavBarfasest.setName( cmbavBarfasest.getInternalname() );
         cmbavBarfasest.setValue( httpContext.cgiGet( cmbavBarfasest.getInternalname()) );
         AV17BarFasEst = (byte)(GXutil.lval( httpContext.cgiGet( cmbavBarfasest.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17BarFasEst", GXutil.str( AV17BarFasEst, 1, 0));
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavBarfasdti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vBARFASDTI");
            GX_FocusControl = edtavBarfasdti_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarFasDTI", localUtil.ttoc( AV16BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV16BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtavBarfasdti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16BarFasDTI", localUtil.ttoc( AV16BarFasDTI, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDCURRENTPAGE");
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV85GridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridCurrentPage), 10, 0));
         }
         else
         {
            AV85GridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridCurrentPage), 10, 0));
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
      e13BR2 ();
      if (returnInSub) return;
   }

   public void e13BR2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV79Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwdpsdatos_impl.this.GXt_char1 = GXv_char2[0] ;
      AV79Station = GXt_char1 ;
      GXv_char2[0] = AV91Emprcod ;
      GXv_char3[0] = AV32EmprNom ;
      GXv_char4[0] = AV81UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV79Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwdpsdatos_impl.this.AV91Emprcod = GXv_char2[0] ;
      webwdpsdatos_impl.this.AV32EmprNom = GXv_char3[0] ;
      webwdpsdatos_impl.this.AV81UsurCod = GXv_char4[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV85GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridCurrentPage), 10, 0));
      edtavGridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridcurrentpage_Visible), 5, 0), true);
      AV86GridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV86GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV86GridPageCount), 10, 0));
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      lblAviso_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblAviso_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(lblAviso_Visible), 5, 0), true);
   }

   public void e14BR2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
   }

   private void e15BR2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(133) ;
      }
      sendrow_1332( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_133_Refreshing )
      {
         httpContext.doAjaxLoad(133, GridRow);
      }
   }

   public void e11BR2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV85GridCurrentPage = (long)(AV85GridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridCurrentPage), 10, 0));
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV85GridCurrentPage = (long)(AV85GridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridCurrentPage), 10, 0));
         subgrid_nextpage( ) ;
      }
      else
      {
         AV84PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         AV85GridCurrentPage = AV84PageToGo ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridCurrentPage), 10, 0));
         subgrid_gotopage( AV84PageToGo) ;
      }
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
   }

   public void e12BR2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV85GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV85GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV85GridCurrentPage), 10, 0));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( GXutil.strcmp(A120BarAgrEst, "S") == 0 ) ) )
      {
         edtRecTotKgm_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecTotKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecTotKgm_Visible), 5, 0), true);
         divRectotkgm_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divRectotkgm_cell_Internalname, "Class", divRectotkgm_cell_Class, true);
      }
      else
      {
         edtRecTotKgm_Visible = 1 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtRecTotKgm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecTotKgm_Visible), 5, 0), true);
         divRectotkgm_cell_Class = "DscTop" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divRectotkgm_cell_Internalname, "Class", divRectotkgm_cell_Class, true);
      }
      if ( ! ( ( GXutil.strcmp(A120BarAgrEst, "S") == 0 ) ) )
      {
         divDvpanel_pnlagrup_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_pnlagrup_cell_Internalname, "Class", divDvpanel_pnlagrup_cell_Class, true);
      }
      else
      {
         divDvpanel_pnlagrup_cell_Class = "" ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, divDvpanel_pnlagrup_cell_Internalname, "Class", divDvpanel_pnlagrup_cell_Class, true);
      }
   }

   public void wb_table3_127_BR2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnlagrup_Internalname, tblPnlagrup_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='HasGridEmpowerer'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol133( ) ;
      }
      if ( wbEnd == 133 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_133 = (int)(nGXsfl_133_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Grid", GridContainer, subGrid_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData", GridContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridContainerData"+"V", GridContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridContainerData"+"V"+"\" value='"+GridContainer.GridValuesHidden()+"'/>") ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV85GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV86GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_127_BR2e( true) ;
      }
      else
      {
         wb_table3_127_BR2e( false) ;
      }
   }

   public void wb_table2_47_BR2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnldetalle_Internalname, tblPnldetalle_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, "", "", "", lblTextblockclicod_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWDPSDatos.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclinom_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclinom_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='DscTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarenccli_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarenccli_Internalname, httpContext.getMessage( "Encomenda", ""), "", "", lblTextblockbarenccli_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarEncCli_Internalname, httpContext.getMessage( "Disposicion Cliente Nueva", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCli_Internalname, GXutil.rtrim( A4812BarEncCli), GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtBarNomCli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarNomCli_Internalname, httpContext.getMessage( "Cor", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli), GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNomCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtBarColNom_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSer_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarSer_Internalname, " ", "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtBarSerDsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarSerDsc_Internalname, httpContext.getMessage( "Artigo", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtBarKgm_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarKgm_Internalname, httpContext.getMessage( "Kilos", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgm_Enabled!=0) ? localUtil.format( A166BarKgm, "ZZZZZ9.99") : localUtil.format( A166BarKgm, "ZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divRectotkgm_cell_Internalname, 1, 0, "px", 0, "px", divRectotkgm_cell_Class, "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablerectotkgm_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockrectotkgm_Internalname, httpContext.getMessage( "Kilos Totales", ""), "", "", lblTextblockrectotkgm_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtRecTotKgm_Internalname, httpContext.getMessage( "RecTotKgm", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtRecTotKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A812RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecTotKgm_Enabled!=0) ? localUtil.format( A812RecTotKgm, "ZZZZZZ9.99") : localUtil.format( A812RecTotKgm, "ZZZZZZ9.99"))), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecTotKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", edtRecTotKgm_Visible, edtRecTotKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWDPSDatos.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+cmbavBarfasest.getInternalname()+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasest.getInternalname(), httpContext.getMessage( "Estado Barcada", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 119,'" + sPrefix + "',false,'" + sGXsfl_133_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasest, cmbavBarfasest.getInternalname(), GXutil.trim( GXutil.str( AV17BarFasEst, 1, 0)), 1, cmbavBarfasest.getJsonclick(), 0, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavBarfasest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,119);\"", "", true, (byte)(0), "HLP_WebWDPSDatos.htm");
         cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV17BarFasEst, 1, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarfasdti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfasdti_Internalname, httpContext.getMessage( "Fecha Hora Inicio", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 123,'" + sPrefix + "',false,'" + sGXsfl_133_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfasdti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfasdti_Internalname, localUtil.ttoc( AV16BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV16BarFasDTI, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,123);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfasdti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfasdti_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfasdti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfasdti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWDPSDatos.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_47_BR2e( true) ;
      }
      else
      {
         wb_table2_47_BR2e( false) ;
      }
   }

   public void wb_table1_16_BR2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnlgeneral_Internalname, tblPnlgeneral_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarCod_Internalname, httpContext.getMessage( "Codigo Barcada", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCod_Internalname, GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarCodReo_Internalname, httpContext.getMessage( "Codigo Reoperado Barcada", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodReo_Internalname, GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarCodReo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9") : localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodReo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodReo_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarCodPar_Internalname, httpContext.getMessage( "Codigo Particion Barcada", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarCodPar_Internalname, GXutil.rtrim( A130BarCodPar), GXutil.rtrim( localUtil.format( A130BarCodPar, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarCodPar_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarCodPar_Enabled, 0, "text", "", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblAviso_Internalname, httpContext.getMessage( "Aviso. Os tem RECEITA", ""), "", "", lblAviso_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "AttributeTagDanger", 0, "", lblAviso_Visible, 1, 0, (short)(0), "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable8_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarMaqCod_Internalname, httpContext.getMessage( "Codigo Maquina", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarMaqCod_Internalname, GXutil.rtrim( A180BarMaqCod), GXutil.rtrim( localUtil.format( A180BarMaqCod, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqdsc_Internalname, httpContext.getMessage( "Descripcion ", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'" + sPrefix + "',false,'" + sGXsfl_133_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqdsc_Internalname, GXutil.rtrim( AV66MaqDsc), GXutil.rtrim( localUtil.format( AV66MaqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,43);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqdsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWDPSDatos.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_16_BR2e( true) ;
      }
      else
      {
         wb_table1_16_BR2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      A130BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
      A602MaqCod = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
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
      paBR2( ) ;
      wsBR2( ) ;
      weBR2( ) ;
      httpContext.setWrapped(false);
      httpContext.SaveComponentMsgList(sPrefix);
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

   public void componentbind( Object[] obj )
   {
      if ( IsUrlCreated( ) )
      {
         return  ;
      }
      sCtrlA396EmprCod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlA129BarCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlA132BarCodReo = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlA130BarCodPar = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlA602MaqCod = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paBR2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "webwdpsdatos", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paBR2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         A396EmprCod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
         A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
         A130BarCodPar = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
         A602MaqCod = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
      }
      wcpOA396EmprCod = httpContext.cgiGet( sPrefix+"wcpOA396EmprCod") ;
      wcpOA129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA129BarCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOA132BarCodReo"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOA130BarCodPar = httpContext.cgiGet( sPrefix+"wcpOA130BarCodPar") ;
      wcpOA602MaqCod = httpContext.cgiGet( sPrefix+"wcpOA602MaqCod") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(A396EmprCod, wcpOA396EmprCod) != 0 ) || ( A129BarCod != wcpOA129BarCod ) || ( A132BarCodReo != wcpOA132BarCodReo ) || ( GXutil.strcmp(A130BarCodPar, wcpOA130BarCodPar) != 0 ) || ( GXutil.strcmp(A602MaqCod, wcpOA602MaqCod) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOA396EmprCod = A396EmprCod ;
      wcpOA129BarCod = A129BarCod ;
      wcpOA132BarCodReo = A132BarCodReo ;
      wcpOA130BarCodPar = A130BarCodPar ;
      wcpOA602MaqCod = A602MaqCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlA396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_CTRL") ;
      if ( GXutil.len( sCtrlA396EmprCod) > 0 )
      {
         A396EmprCod = httpContext.cgiGet( sCtrlA396EmprCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      }
      else
      {
         A396EmprCod = httpContext.cgiGet( sPrefix+"A396EmprCod_PARM") ;
      }
      sCtrlA129BarCod = httpContext.cgiGet( sPrefix+"A129BarCod_CTRL") ;
      if ( GXutil.len( sCtrlA129BarCod) > 0 )
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlA129BarCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      }
      else
      {
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A129BarCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA132BarCodReo = httpContext.cgiGet( sPrefix+"A132BarCodReo_CTRL") ;
      if ( GXutil.len( sCtrlA132BarCodReo) > 0 )
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlA132BarCodReo), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      }
      else
      {
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"A132BarCodReo_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlA130BarCodPar = httpContext.cgiGet( sPrefix+"A130BarCodPar_CTRL") ;
      if ( GXutil.len( sCtrlA130BarCodPar) > 0 )
      {
         A130BarCodPar = httpContext.cgiGet( sCtrlA130BarCodPar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A130BarCodPar", A130BarCodPar);
      }
      else
      {
         A130BarCodPar = httpContext.cgiGet( sPrefix+"A130BarCodPar_PARM") ;
      }
      sCtrlA602MaqCod = httpContext.cgiGet( sPrefix+"A602MaqCod_CTRL") ;
      if ( GXutil.len( sCtrlA602MaqCod) > 0 )
      {
         A602MaqCod = httpContext.cgiGet( sCtrlA602MaqCod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A602MaqCod", A602MaqCod);
      }
      else
      {
         A602MaqCod = httpContext.cgiGet( sPrefix+"A602MaqCod_PARM") ;
      }
   }

   public void componentprocess( String sPPrefix ,
                                 String sPSFPrefix ,
                                 String sCompEvt )
   {
      sCompPrefix = sPPrefix ;
      sSFPrefix = sPSFPrefix ;
      sPrefix = sCompPrefix + sSFPrefix ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      initweb( ) ;
      nDraw = (byte)(0) ;
      paBR2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsBR2( ) ;
      if ( isFullAjaxMode( ) )
      {
         componentdraw();
      }
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void componentstart( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
   }

   public void wcstart( )
   {
      nDraw = (byte)(1) ;
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wsBR2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_PARM", GXutil.rtrim( A396EmprCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA396EmprCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A396EmprCod_CTRL", GXutil.rtrim( sCtrlA396EmprCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A129BarCod_PARM", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA129BarCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A129BarCod_CTRL", GXutil.rtrim( sCtrlA129BarCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A132BarCodReo_PARM", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlA132BarCodReo)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A132BarCodReo_CTRL", GXutil.rtrim( sCtrlA132BarCodReo));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A130BarCodPar_PARM", GXutil.rtrim( A130BarCodPar));
      if ( GXutil.len( GXutil.rtrim( sCtrlA130BarCodPar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A130BarCodPar_CTRL", GXutil.rtrim( sCtrlA130BarCodPar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A602MaqCod_PARM", GXutil.rtrim( A602MaqCod));
      if ( GXutil.len( GXutil.rtrim( sCtrlA602MaqCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"A602MaqCod_CTRL", GXutil.rtrim( sCtrlA602MaqCod));
      }
   }

   public void componentdraw( )
   {
      if ( nDoneStart == 0 )
      {
         wcstart( ) ;
      }
      BackMsgLst = httpContext.GX_msglist ;
      httpContext.GX_msglist = LclMsgLst ;
      wcparametersset( ) ;
      weBR2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public String componentgetstring( String sGXControl )
   {
      String sCtrlName;
      if ( GXutil.strcmp(GXutil.substring( sGXControl, 1, 1), "&") == 0 )
      {
         sCtrlName = GXutil.substring( sGXControl, 2, GXutil.len( sGXControl)-1) ;
      }
      else
      {
         sCtrlName = sGXControl ;
      }
      return httpContext.cgiGet( sPrefix+"v"+GXutil.upper( sCtrlName)) ;
   }

   public void componentjscripts( )
   {
      include_jscripts( ) ;
   }

   public void componentthemes( )
   {
      define_styles( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202671010511975", true, true);
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
         httpContext.AddJavascriptSource("webwdpsdatos.js", "?202671010511975", false, true);
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
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_1332( )
   {
      edtBarAGrHdr_Internalname = sPrefix+"BARAGRHDR_"+sGXsfl_133_idx ;
   }

   public void subsflControlProps_fel_1332( )
   {
      edtBarAGrHdr_Internalname = sPrefix+"BARAGRHDR_"+sGXsfl_133_fel_idx ;
   }

   public void sendrow_1332( )
   {
      subsflControlProps_1332( ) ;
      wbBR0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_133_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_133_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_133_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAGrHdr_Internalname,GXutil.rtrim( A13695BarAGrHdr),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtBarAGrHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(133),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesBR2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_133_idx = ((subGrid_Islastpage==1)&&(nGXsfl_133_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_133_idx+1) ;
         sGXsfl_133_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_133_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1332( ) ;
      }
      /* End function sendrow_1332 */
   }

   public void startgridcontrol133( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"133\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Hdr Agrupada", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13695BarAGrHdr));
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
      edtBarCod_Internalname = sPrefix+"BARCOD" ;
      edtBarCodReo_Internalname = sPrefix+"BARCODREO" ;
      edtBarCodPar_Internalname = sPrefix+"BARCODPAR" ;
      divUnnamedtable6_Internalname = sPrefix+"UNNAMEDTABLE6" ;
      lblAviso_Internalname = sPrefix+"AVISO" ;
      divUnnamedtable7_Internalname = sPrefix+"UNNAMEDTABLE7" ;
      edtBarMaqCod_Internalname = sPrefix+"BARMAQCOD" ;
      edtavMaqdsc_Internalname = sPrefix+"vMAQDSC" ;
      divUnnamedtable8_Internalname = sPrefix+"UNNAMEDTABLE8" ;
      tblPnlgeneral_Internalname = sPrefix+"PNLGENERAL" ;
      Dvpanel_pnlgeneral_Internalname = sPrefix+"DVPANEL_PNLGENERAL" ;
      lblTextblockclicod_Internalname = sPrefix+"TEXTBLOCKCLICOD" ;
      edtCliCod_Internalname = sPrefix+"CLICOD" ;
      divUnnamedtableclicod_Internalname = sPrefix+"UNNAMEDTABLECLICOD" ;
      lblTextblockclinom_Internalname = sPrefix+"TEXTBLOCKCLINOM" ;
      edtCliNom_Internalname = sPrefix+"CLINOM" ;
      divUnnamedtableclinom_Internalname = sPrefix+"UNNAMEDTABLECLINOM" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      lblTextblockbarenccli_Internalname = sPrefix+"TEXTBLOCKBARENCCLI" ;
      edtBarEncCli_Internalname = sPrefix+"BARENCCLI" ;
      divUnnamedtablebarenccli_Internalname = sPrefix+"UNNAMEDTABLEBARENCCLI" ;
      edtBarNomCli_Internalname = sPrefix+"BARNOMCLI" ;
      edtBarColNom_Internalname = sPrefix+"BARCOLNOM" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      edtBarSer_Internalname = sPrefix+"BARSER" ;
      edtBarSerDsc_Internalname = sPrefix+"BARSERDSC" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      edtBarKgm_Internalname = sPrefix+"BARKGM" ;
      lblTextblockrectotkgm_Internalname = sPrefix+"TEXTBLOCKRECTOTKGM" ;
      edtRecTotKgm_Internalname = sPrefix+"RECTOTKGM" ;
      divUnnamedtablerectotkgm_Internalname = sPrefix+"UNNAMEDTABLERECTOTKGM" ;
      divRectotkgm_cell_Internalname = sPrefix+"RECTOTKGM_CELL" ;
      divUnnamedtable4_Internalname = sPrefix+"UNNAMEDTABLE4" ;
      cmbavBarfasest.setInternalname( sPrefix+"vBARFASEST" );
      edtavBarfasdti_Internalname = sPrefix+"vBARFASDTI" ;
      divUnnamedtable5_Internalname = sPrefix+"UNNAMEDTABLE5" ;
      tblPnldetalle_Internalname = sPrefix+"PNLDETALLE" ;
      Dvpanel_pnldetalle_Internalname = sPrefix+"DVPANEL_PNLDETALLE" ;
      edtBarAGrHdr_Internalname = sPrefix+"BARAGRHDR" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      tblPnlagrup_Internalname = sPrefix+"PNLAGRUP" ;
      Dvpanel_pnlagrup_Internalname = sPrefix+"DVPANEL_PNLAGRUP" ;
      divDvpanel_pnlagrup_cell_Internalname = sPrefix+"DVPANEL_PNLAGRUP_CELL" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      edtavGridcurrentpage_Internalname = sPrefix+"vGRIDCURRENTPAGE" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = sPrefix+"HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGrid_Internalname = sPrefix+"GRID" ;
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.setDefaultTheme("WorkWithPlusThemeDS");
      }
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableJsOutput();
         }
      }
      init_default_properties( ) ;
      subGrid_Allowcollapsing = (byte)(0) ;
      subGrid_Allowselection = (byte)(0) ;
      subGrid_Header = "" ;
      edtBarAGrHdr_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 1 ;
      edtBarMaqCod_Jsonclick = "" ;
      edtBarMaqCod_Enabled = 0 ;
      lblAviso_Visible = 1 ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodPar_Enabled = 0 ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCodReo_Enabled = 0 ;
      edtBarCod_Jsonclick = "" ;
      edtBarCod_Enabled = 0 ;
      edtavBarfasdti_Jsonclick = "" ;
      edtavBarfasdti_Enabled = 1 ;
      cmbavBarfasest.setJsonclick( "" );
      cmbavBarfasest.setEnabled( 1 );
      edtRecTotKgm_Jsonclick = "" ;
      edtRecTotKgm_Enabled = 0 ;
      edtBarKgm_Jsonclick = "" ;
      edtBarKgm_Enabled = 0 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 0 ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Enabled = 0 ;
      edtBarEncCli_Jsonclick = "" ;
      edtBarEncCli_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      divRectotkgm_cell_Class = "" ;
      edtRecTotKgm_Visible = 1 ;
      edtavGridcurrentpage_Jsonclick = "" ;
      edtavGridcurrentpage_Visible = 1 ;
      divDvpanel_pnlagrup_cell_Class = "" ;
      Dvpanel_pnlagrup_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnlagrup_Iconposition = "Right" ;
      Dvpanel_pnlagrup_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnlagrup_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnlagrup_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnlagrup_Title = httpContext.getMessage( "Agrupacion", "") ;
      Dvpanel_pnlagrup_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnlagrup_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnlagrup_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnlagrup_Width = "100%" ;
      Gridpaginationbar_Rowsperpagecaption = "WWP_PagingRowsPerPage" ;
      Gridpaginationbar_Emptygridcaption = "GridAgrupadas" ;
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
      Dvpanel_pnldetalle_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnldetalle_Iconposition = "Right" ;
      Dvpanel_pnldetalle_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnldetalle_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnldetalle_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnldetalle_Title = httpContext.getMessage( "Detalle", "") ;
      Dvpanel_pnldetalle_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnldetalle_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnldetalle_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnldetalle_Width = "100%" ;
      Dvpanel_pnlgeneral_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnlgeneral_Iconposition = "Right" ;
      Dvpanel_pnlgeneral_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnlgeneral_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnlgeneral_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnlgeneral_Title = httpContext.getMessage( "General", "") ;
      Dvpanel_pnlgeneral_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnlgeneral_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnlgeneral_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnlgeneral_Width = "100%" ;
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
   }

   public void init_web_controls( )
   {
      cmbavBarfasest.setName( "vBARFASEST" );
      cmbavBarfasest.setWebtags( "" );
      cmbavBarfasest.addItem("0", httpContext.getMessage( "Pendiente", ""), (short)(0));
      cmbavBarfasest.addItem("1", httpContext.getMessage( "Iniciada", ""), (short)(0));
      cmbavBarfasest.addItem("2", httpContext.getMessage( "Terminada", ""), (short)(0));
      cmbavBarfasest.addItem("3", httpContext.getMessage( "Desconocido", ""), (short)(0));
      if ( cmbavBarfasest.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e15BR2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11BR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV85GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV85GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12BR2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9'},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9'},{av:'A130BarCodPar',fld:'BARCODPAR',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV85GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARKGM","{handler:'valid_Barkgm',iparms:[]");
      setEventMetadata("VALID_BARKGM",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASEST","{handler:'validv_Barfasest',iparms:[]");
      setEventMetadata("VALIDV_BARFASEST",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Baragrhdr',iparms:[]");
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
      wcpOA602MaqCod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A602MaqCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A122BarAgrPar = "" ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_pnlgeneral = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_pnldetalle = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_pnlagrup = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13695BarAGrHdr = "" ;
      scmdbuf = "" ;
      H00BR4_A396EmprCod = new String[] {""} ;
      H00BR4_A129BarCod = new int[1] ;
      H00BR4_A132BarCodReo = new byte[1] ;
      H00BR4_A130BarCodPar = new String[] {""} ;
      H00BR4_A120BarAgrEst = new String[] {""} ;
      H00BR4_A180BarMaqCod = new String[] {""} ;
      H00BR4_A252CliCod = new int[1] ;
      H00BR4_n252CliCod = new boolean[] {false} ;
      H00BR4_A279CliNom = new String[] {""} ;
      H00BR4_A4812BarEncCli = new String[] {""} ;
      H00BR4_A1234BarNomCli = new String[] {""} ;
      H00BR4_A135BarColNom = new String[] {""} ;
      H00BR4_A212BarSer = new String[] {""} ;
      H00BR4_A1652BarSerDsc = new String[] {""} ;
      H00BR4_A122BarAgrPar = new String[] {""} ;
      H00BR4_A124BarAgrReo = new byte[1] ;
      H00BR4_A119BarAgrCod = new int[1] ;
      H00BR4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00BR4_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00BR4_n219BarTotAgr = new boolean[] {false} ;
      A166BarKgm = DecimalUtil.ZERO ;
      H00BR7_AGRID_nRecordCount = new long[1] ;
      H00BR8_A120BarAgrEst = new String[] {""} ;
      H00BR8_A180BarMaqCod = new String[] {""} ;
      H00BR8_A252CliCod = new int[1] ;
      H00BR8_n252CliCod = new boolean[] {false} ;
      H00BR8_A4812BarEncCli = new String[] {""} ;
      H00BR8_A1234BarNomCli = new String[] {""} ;
      H00BR8_A135BarColNom = new String[] {""} ;
      H00BR8_A212BarSer = new String[] {""} ;
      H00BR8_A1652BarSerDsc = new String[] {""} ;
      A120BarAgrEst = "" ;
      A180BarMaqCod = "" ;
      A4812BarEncCli = "" ;
      A1234BarNomCli = "" ;
      A135BarColNom = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      H00BR9_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      H00BR11_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00BR13_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00BR13_n219BarTotAgr = new boolean[] {false} ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV66MaqDsc = "" ;
      AV16BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      AV79Station = "" ;
      GXt_char1 = "" ;
      AV91Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV32EmprNom = "" ;
      GXv_char3 = new String[1] ;
      AV81UsurCod = "" ;
      GXv_char4 = new String[1] ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      GridRow = new com.genexus.webpanels.GXWebRow();
      lblTextblockclicod_Jsonclick = "" ;
      lblTextblockclinom_Jsonclick = "" ;
      lblTextblockbarenccli_Jsonclick = "" ;
      lblTextblockrectotkgm_Jsonclick = "" ;
      lblAviso_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlA396EmprCod = "" ;
      sCtrlA129BarCod = "" ;
      sCtrlA132BarCodReo = "" ;
      sCtrlA130BarCodPar = "" ;
      sCtrlA602MaqCod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwdpsdatos__default(),
         new Object[] {
             new Object[] {
            H00BR4_A396EmprCod, H00BR4_A129BarCod, H00BR4_A132BarCodReo, H00BR4_A130BarCodPar, H00BR4_A120BarAgrEst, H00BR4_A180BarMaqCod, H00BR4_A252CliCod, H00BR4_n252CliCod, H00BR4_A279CliNom, H00BR4_A4812BarEncCli,
            H00BR4_A1234BarNomCli, H00BR4_A135BarColNom, H00BR4_A212BarSer, H00BR4_A1652BarSerDsc, H00BR4_A122BarAgrPar, H00BR4_A124BarAgrReo, H00BR4_A119BarAgrCod, H00BR4_A166BarKgm, H00BR4_A219BarTotAgr, H00BR4_n219BarTotAgr
            }
            , new Object[] {
            H00BR7_AGRID_nRecordCount
            }
            , new Object[] {
            H00BR8_A120BarAgrEst, H00BR8_A180BarMaqCod, H00BR8_A252CliCod, H00BR8_n252CliCod, H00BR8_A4812BarEncCli, H00BR8_A1234BarNomCli, H00BR8_A135BarColNom, H00BR8_A212BarSer, H00BR8_A1652BarSerDsc
            }
            , new Object[] {
            H00BR9_A279CliNom
            }
            , new Object[] {
            H00BR11_A166BarKgm
            }
            , new Object[] {
            H00BR13_A219BarTotAgr, H00BR13_n219BarTotAgr
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      cmbavBarfasest.setEnabled( 0 );
      edtavBarfasdti_Enabled = 0 ;
   }

   private byte wcpOA132BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte A132BarCodReo ;
   private byte nGXWrapped ;
   private byte A124BarAgrReo ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte AV17BarFasEst ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOA129BarCod ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_133 ;
   private int A129BarCod ;
   private int subGrid_Rows ;
   private int nGXsfl_133_idx=1 ;
   private int A119BarAgrCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavGridcurrentpage_Visible ;
   private int subGrid_Islastpage ;
   private int edtavBarfasdti_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A252CliCod ;
   private int lblAviso_Visible ;
   private int AV84PageToGo ;
   private int edtRecTotKgm_Visible ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarEncCli_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarKgm_Enabled ;
   private int edtRecTotKgm_Enabled ;
   private int edtBarCod_Enabled ;
   private int edtBarCodReo_Enabled ;
   private int edtBarCodPar_Enabled ;
   private int edtBarMaqCod_Enabled ;
   private int edtavMaqdsc_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV86GridPageCount ;
   private long AV85GridCurrentPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A812RecTotKgm ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String wcpOA602MaqCod ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String A602MaqCod ;
   private String sGXsfl_133_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A122BarAgrPar ;
   private String Dvpanel_pnlgeneral_Width ;
   private String Dvpanel_pnlgeneral_Cls ;
   private String Dvpanel_pnlgeneral_Title ;
   private String Dvpanel_pnlgeneral_Iconposition ;
   private String Dvpanel_pnldetalle_Width ;
   private String Dvpanel_pnldetalle_Cls ;
   private String Dvpanel_pnldetalle_Title ;
   private String Dvpanel_pnldetalle_Iconposition ;
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
   private String Dvpanel_pnlagrup_Width ;
   private String Dvpanel_pnlagrup_Cls ;
   private String Dvpanel_pnlagrup_Title ;
   private String Dvpanel_pnlagrup_Iconposition ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_pnlgeneral_Internalname ;
   private String Dvpanel_pnldetalle_Internalname ;
   private String divDvpanel_pnlagrup_cell_Internalname ;
   private String divDvpanel_pnlagrup_cell_Class ;
   private String Dvpanel_pnlagrup_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String TempTags ;
   private String edtavGridcurrentpage_Internalname ;
   private String edtavGridcurrentpage_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavMaqdsc_Internalname ;
   private String A13695BarAGrHdr ;
   private String edtBarAGrHdr_Internalname ;
   private String edtavBarfasdti_Internalname ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A180BarMaqCod ;
   private String A4812BarEncCli ;
   private String A1234BarNomCli ;
   private String A135BarColNom ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A279CliNom ;
   private String edtBarMaqCod_Internalname ;
   private String AV66MaqDsc ;
   private String edtCliCod_Internalname ;
   private String edtCliNom_Internalname ;
   private String edtBarEncCli_Internalname ;
   private String edtBarNomCli_Internalname ;
   private String edtBarColNom_Internalname ;
   private String edtBarSer_Internalname ;
   private String edtBarSerDsc_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtRecTotKgm_Internalname ;
   private String AV79Station ;
   private String GXt_char1 ;
   private String AV91Emprcod ;
   private String GXv_char2[] ;
   private String AV32EmprNom ;
   private String GXv_char3[] ;
   private String AV81UsurCod ;
   private String GXv_char4[] ;
   private String Gridpaginationbar_Internalname ;
   private String lblAviso_Internalname ;
   private String divRectotkgm_cell_Class ;
   private String divRectotkgm_cell_Internalname ;
   private String tblPnlagrup_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String tblPnldetalle_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtableclicod_Internalname ;
   private String lblTextblockclicod_Internalname ;
   private String lblTextblockclicod_Jsonclick ;
   private String edtCliCod_Jsonclick ;
   private String divUnnamedtableclinom_Internalname ;
   private String lblTextblockclinom_Internalname ;
   private String lblTextblockclinom_Jsonclick ;
   private String edtCliNom_Jsonclick ;
   private String divUnnamedtablebarenccli_Internalname ;
   private String lblTextblockbarenccli_Internalname ;
   private String lblTextblockbarenccli_Jsonclick ;
   private String edtBarEncCli_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String edtBarNomCli_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String edtBarSer_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtBarKgm_Jsonclick ;
   private String divUnnamedtablerectotkgm_Internalname ;
   private String lblTextblockrectotkgm_Internalname ;
   private String lblTextblockrectotkgm_Jsonclick ;
   private String edtRecTotKgm_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String edtavBarfasdti_Jsonclick ;
   private String tblPnlgeneral_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Internalname ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Internalname ;
   private String edtBarCodPar_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String lblAviso_Jsonclick ;
   private String divUnnamedtable8_Internalname ;
   private String edtBarMaqCod_Jsonclick ;
   private String edtavMaqdsc_Jsonclick ;
   private String sCtrlA396EmprCod ;
   private String sCtrlA129BarCod ;
   private String sCtrlA132BarCodReo ;
   private String sCtrlA130BarCodPar ;
   private String sCtrlA602MaqCod ;
   private String sGXsfl_133_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarAGrHdr_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV16BarFasDTI ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_pnlgeneral_Autowidth ;
   private boolean Dvpanel_pnlgeneral_Autoheight ;
   private boolean Dvpanel_pnlgeneral_Collapsible ;
   private boolean Dvpanel_pnlgeneral_Collapsed ;
   private boolean Dvpanel_pnlgeneral_Showcollapseicon ;
   private boolean Dvpanel_pnlgeneral_Autoscroll ;
   private boolean Dvpanel_pnldetalle_Autowidth ;
   private boolean Dvpanel_pnldetalle_Autoheight ;
   private boolean Dvpanel_pnldetalle_Collapsible ;
   private boolean Dvpanel_pnldetalle_Collapsed ;
   private boolean Dvpanel_pnldetalle_Showcollapseicon ;
   private boolean Dvpanel_pnldetalle_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_pnlagrup_Autowidth ;
   private boolean Dvpanel_pnlagrup_Autoheight ;
   private boolean Dvpanel_pnlagrup_Collapsible ;
   private boolean Dvpanel_pnlagrup_Collapsed ;
   private boolean Dvpanel_pnlagrup_Showcollapseicon ;
   private boolean Dvpanel_pnlagrup_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_133_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n219BarTotAgr ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnlgeneral ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnldetalle ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnlagrup ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private HTMLChoice cmbavBarfasest ;
   private IDataStoreProvider pr_default ;
   private String[] H00BR4_A396EmprCod ;
   private int[] H00BR4_A129BarCod ;
   private byte[] H00BR4_A132BarCodReo ;
   private String[] H00BR4_A130BarCodPar ;
   private String[] H00BR4_A120BarAgrEst ;
   private String[] H00BR4_A180BarMaqCod ;
   private int[] H00BR4_A252CliCod ;
   private boolean[] H00BR4_n252CliCod ;
   private String[] H00BR4_A279CliNom ;
   private String[] H00BR4_A4812BarEncCli ;
   private String[] H00BR4_A1234BarNomCli ;
   private String[] H00BR4_A135BarColNom ;
   private String[] H00BR4_A212BarSer ;
   private String[] H00BR4_A1652BarSerDsc ;
   private String[] H00BR4_A122BarAgrPar ;
   private byte[] H00BR4_A124BarAgrReo ;
   private int[] H00BR4_A119BarAgrCod ;
   private java.math.BigDecimal[] H00BR4_A166BarKgm ;
   private java.math.BigDecimal[] H00BR4_A219BarTotAgr ;
   private boolean[] H00BR4_n219BarTotAgr ;
   private long[] H00BR7_AGRID_nRecordCount ;
   private String[] H00BR8_A120BarAgrEst ;
   private String[] H00BR8_A180BarMaqCod ;
   private int[] H00BR8_A252CliCod ;
   private boolean[] H00BR8_n252CliCod ;
   private String[] H00BR8_A4812BarEncCli ;
   private String[] H00BR8_A1234BarNomCli ;
   private String[] H00BR8_A135BarColNom ;
   private String[] H00BR8_A212BarSer ;
   private String[] H00BR8_A1652BarSerDsc ;
   private String[] H00BR9_A279CliNom ;
   private java.math.BigDecimal[] H00BR11_A166BarKgm ;
   private java.math.BigDecimal[] H00BR13_A219BarTotAgr ;
   private boolean[] H00BR13_n219BarTotAgr ;
}

final  class webwdpsdatos__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00BR4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarAgrEst, T2.BarMaqCod, T2.CliCod, T3.CliNom, T2.BarEncCli, T2.BarNomCli, T2.BarColNom, T2.BarSer, T2.BarSerDsc, T1.BarAgrPar, T1.BarAgrReo, T1.BarAgrCod, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T5.BarTotAgr, 0) AS BarTotAgr FROM ((((TXPBARAGR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BR7", "SELECT COUNT(*) FROM ((((TXPBARAGR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BR8", "SELECT BarAgrEst, BarMaqCod, CliCod, BarEncCli, BarNomCli, BarColNom, BarSer, BarSerDsc FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BR9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BR11", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BR13", "SELECT COALESCE( T1.BarTotAgr, 0) AS BarTotAgr FROM (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[4])[0] = rslt.getString(5, 1);
               ((String[]) buf[5])[0] = rslt.getString(6, 6);
               ((int[]) buf[6])[0] = rslt.getInt(7);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 30);
               ((String[]) buf[9])[0] = rslt.getString(9, 20);
               ((String[]) buf[10])[0] = rslt.getString(10, 13);
               ((String[]) buf[11])[0] = rslt.getString(11, 13);
               ((String[]) buf[12])[0] = rslt.getString(12, 16);
               ((String[]) buf[13])[0] = rslt.getString(13, 26);
               ((String[]) buf[14])[0] = rslt.getString(14, 1);
               ((byte[]) buf[15])[0] = rslt.getByte(15);
               ((int[]) buf[16])[0] = rslt.getInt(16);
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(17,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(18,2);
               ((boolean[]) buf[19])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 20);
               ((String[]) buf[5])[0] = rslt.getString(5, 13);
               ((String[]) buf[6])[0] = rslt.getString(6, 13);
               ((String[]) buf[7])[0] = rslt.getString(7, 16);
               ((String[]) buf[8])[0] = rslt.getString(8, 26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 30);
               return;
            case 4 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               return;
            case 5 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.NUMERIC );
               }
               else
               {
                  stmt.setInt(2, ((Number) parms[2]).intValue());
               }
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
      }
   }

}

