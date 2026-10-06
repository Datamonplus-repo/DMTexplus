package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwbarfastabla_impl extends GXDataArea
{
   public webwbarfastabla_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwbarfastabla_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwbarfastabla_impl.class ));
   }

   public webwbarfastabla_impl( int remoteHandle ,
                                ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavAccionesfases = new HTMLChoice();
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
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FASCOD") == 0 )
         {
            A13781FasCDsc = httpContext.GetPar( "FasCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgafascodF90( A13781FasCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxSuggest"+"_"+"FASCOD") == 0 )
         {
            A13781FasCDsc = httpContext.GetPar( "FasCDsc") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxsgafascodF90( A13781FasCDsc) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxHideCode"+"_"+"FASCOD") == 0 )
         {
            h457FasCod = httpContext.GetPar( "h457FasCod") ;
            httpContext.setAjaxCallMode();
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxhcafascodF92( h457FasCod) ;
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
            AV5EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
               AV7BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
               AV8BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
               AV9ProCod = httpContext.GetPar( "ProCod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9ProCod", AV9ProCod);
               AV10Prodsc = httpContext.GetPar( "Prodsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Prodsc", AV10Prodsc);
               AV15BarExt = (byte)(GXutil.lval( httpContext.GetPar( "BarExt"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15BarExt", GXutil.str( AV15BarExt, 1, 0));
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
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV6BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
      AV7BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
      AV8BarCodPar = httpContext.GetPar( "BarCodPar") ;
      AV9ProCod = httpContext.GetPar( "ProCod") ;
      AV41Pgmname = httpContext.GetPar( "Pgmname") ;
      AV21UsurCod = httpContext.GetPar( "UsurCod") ;
      AV23Station = httpContext.GetPar( "Station") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9ProCod, AV41Pgmname, AV21UsurCod, AV23Station) ;
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
      paF92( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startF92( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwbarfastabla", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.rtrim(AV10Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarExt,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc","BarExt"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Station, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_35, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV14GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV8BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV9ProCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRODSC", GXutil.rtrim( AV10Prodsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vSI_RGTO", GXutil.ltrim( localUtil.ntoc( AV30Si_rgto, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV21UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV23Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vBAREXT", GXutil.ltrim( localUtil.ntoc( AV15BarExt, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GXHCFASCOD", GXutil.rtrim( A457FasCod));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminarlinea_Result));
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
         weF92( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtF92( ) ;
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
      return formatLink("app.webwbarfastabla", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.rtrim(AV10Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarExt,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc","BarExt"})  ;
   }

   public String getPgmname( )
   {
      return "WebWBARFASTabla" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mantenimiento Fases (Hdr)", "") ;
   }

   public void wbF90( )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtninsertarlinea_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "Agregar Fase", ""), bttBtninsertarlinea_Jsonclick, 5, httpContext.getMessage( "Agregar Fase", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINSERTARLINEA\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWBARFASTabla.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtnsalir_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOSALIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWBARFASTabla.htm");
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
         ucGridpaginationbar.setProperty("CurrentPage", AV13GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV14GridPageCount);
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_35_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV13GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV13GridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWBARFASTabla.htm");
         wb_table1_64_F92( true) ;
      }
      else
      {
         wb_table1_64_F92( false) ;
      }
      return  ;
   }

   public void wb_table1_64_F92e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, "GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
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

   public void startF92( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mantenimiento Fases (Hdr)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupF90( ) ;
   }

   public void wsF92( )
   {
      startF92( ) ;
      evtF92( ) ;
   }

   public void evtF92( )
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
                           e11F92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12F92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13F92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINSERTARLINEA'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoInsertarLinea' */
                           e14F92 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOSALIR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoSalir' */
                           e15F92 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VACCIONESFASES.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "'DOABRIRFASELECTOR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "'DOMODIFICAR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 20), "VACCIONESFASES.CLICK") == 0 ) )
                        {
                           nGXsfl_35_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_352( ) ;
                           cmbavAccionesfases.setName( cmbavAccionesfases.getInternalname() );
                           cmbavAccionesfases.setValue( httpContext.cgiGet( cmbavAccionesfases.getInternalname()) );
                           AV37AccionesFases = (short)(GXutil.lval( httpContext.cgiGet( cmbavAccionesfases.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AccionesFases), 4, 0));
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
                           A152BarFasCon = GXutil.upper( httpContext.cgiGet( edtBarFasCon_Internalname)) ;
                           A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
                           A4905BarFasAcab = GXutil.upper( httpContext.cgiGet( edtBarFasAcab_Internalname)) ;
                           A4287BarFasFor = GXutil.upper( httpContext.cgiGet( edtBarFasFor_Internalname)) ;
                           A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
                           A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
                           A4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtBarFasDTI_Internalname), 0) ;
                           n4442BarFasDTI = false ;
                           A4443BarFasDTF = localUtil.ctot( httpContext.cgiGet( edtBarFasDTF_Internalname), 0) ;
                           n4443BarFasDTF = false ;
                           A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
                           n3837BarFasKgm = false ;
                           A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
                           n3838BarFasMtr = false ;
                           h457FasCod = httpContext.cgiGet( edtFasCod_Internalname) ;
                           A5048BarFasUsu = GXutil.upper( httpContext.cgiGet( edtBarFasUsu_Internalname)) ;
                           n5048BarFasUsu = false ;
                           A3836BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e16F92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e17F92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e18F92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VACCIONESFASES.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e19F92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOABRIRFASELECTOR'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoAbrirFaseLector' */
                                 e20F92 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOMODIFICAR'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoModificar' */
                                 e21F92 ();
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

   public void weF92( )
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

   public void paF92( )
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

   public void gxsgafascodF90( String A13781FasCDsc )
   {
      if ( ! httpContext.isAjaxRequest( ) )
      {
         httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
      }
      addString( "[[") ;
      gxsgafascod_dataF90( A13781FasCDsc) ;
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

   protected void gxsgafascod_dataF90( String A13781FasCDsc )
   {
      l13781FasCDsc = GXutil.concat( GXutil.rtrim( A13781FasCDsc), "%", "") ;
      /* Using cursor H00F92 */
      pr_default.execute(0, new Object[] {l13781FasCDsc});
      gxdynajaxctrlcodr.removeAllItems();
      gxdynajaxctrldescr.removeAllItems();
      while ( (pr_default.getStatus(0) != 101) )
      {
         if ( GXutil.like( GXutil.upper( H00F92_A13781FasCDsc[0]) , GXutil.padr( "%" + GXutil.upper( A13781FasCDsc) , 255 , "%"),  ' ' ) )
         {
            gxdynajaxctrlcodr.add(H00F92_A13781FasCDsc[0]);
            gxdynajaxctrldescr.add(H00F92_A13781FasCDsc[0]);
         }
         pr_default.readNext(0);
      }
      pr_default.close(0);
   }

   public void gxhcafascodF92( String A13781FasCDsc )
   {
      /* Using cursor H00F93 */
      pr_default.execute(1, new Object[] {A13781FasCDsc});
      gxhchits = (short)(0) ;
      while ( (pr_default.getStatus(1) != 101) )
      {
         if ( GXutil.strcmp(H00F93_A13781FasCDsc[0], A13781FasCDsc) == 0 )
         {
            gxhchits = (short)(gxhchits+1) ;
            if ( gxhchits > 1 )
            {
               if (true) break;
            }
            A13781FasCDsc = H00F93_A13781FasCDsc[0] ;
            A396EmprCod = H00F93_A396EmprCod[0] ;
            A457FasCod = H00F93_A457FasCod[0] ;
         }
         pr_default.readNext(1);
      }
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      addString( "[[") ;
      addString( "\""+PrivateUtilities.encodeJSConstant( GXutil.rtrim( A457FasCod))+"\"") ;
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
                                 String AV5EmprCod ,
                                 int AV6BarCod ,
                                 byte AV7BarCodReo ,
                                 String AV8BarCodPar ,
                                 String AV9ProCod ,
                                 String AV41Pgmname ,
                                 String AV21UsurCod ,
                                 String AV23Station )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e17F92 ();
      GRID_nCurrentRecord = 0 ;
      rfF92( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASFOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASFOR", GXutil.rtrim( A4287BarFasFor));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASACAB", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASACAB", GXutil.rtrim( A4905BarFasAcab));
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
      rfF92( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV41Pgmname = "WebWBARFASTabla" ;
      Gx_err = (short)(0) ;
   }

   public void rfF92( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(35) ;
      /* Execute user event: Refresh */
      e17F92 ();
      nGXsfl_35_idx = 1 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_352( ) ;
      bGXsfl_35_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
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
         /* Using cursor H00F94 */
         pr_default.execute(2, new Object[] {AV5EmprCod, Integer.valueOf(AV6BarCod), Byte.valueOf(AV7BarCodReo), AV8BarCodPar, AV9ProCod, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_35_idx = 1 ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
         while ( ( (pr_default.getStatus(2) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A758ProCod = H00F94_A758ProCod[0] ;
            A130BarCodPar = H00F94_A130BarCodPar[0] ;
            A132BarCodReo = H00F94_A132BarCodReo[0] ;
            A129BarCod = H00F94_A129BarCod[0] ;
            A396EmprCod = H00F94_A396EmprCod[0] ;
            A3836BarFasPri = H00F94_A3836BarFasPri[0] ;
            A5048BarFasUsu = H00F94_A5048BarFasUsu[0] ;
            n5048BarFasUsu = H00F94_n5048BarFasUsu[0] ;
            A457FasCod = H00F94_A457FasCod[0] ;
            A3838BarFasMtr = H00F94_A3838BarFasMtr[0] ;
            n3838BarFasMtr = H00F94_n3838BarFasMtr[0] ;
            A3837BarFasKgm = H00F94_A3837BarFasKgm[0] ;
            n3837BarFasKgm = H00F94_n3837BarFasKgm[0] ;
            A4443BarFasDTF = H00F94_A4443BarFasDTF[0] ;
            n4443BarFasDTF = H00F94_n4443BarFasDTF[0] ;
            A4442BarFasDTI = H00F94_A4442BarFasDTI[0] ;
            n4442BarFasDTI = H00F94_n4442BarFasDTI[0] ;
            A215BarTieRea = H00F94_A215BarTieRea[0] ;
            A216BarTieTeo = H00F94_A216BarTieTeo[0] ;
            A4287BarFasFor = H00F94_A4287BarFasFor[0] ;
            A4905BarFasAcab = H00F94_A4905BarFasAcab[0] ;
            A150BarFacTin = H00F94_A150BarFacTin[0] ;
            A153BarFasEst = H00F94_A153BarFasEst[0] ;
            A152BarFasCon = H00F94_A152BarFasCon[0] ;
            A603MaqCodBis = H00F94_A603MaqCodBis[0] ;
            A460FasDsc = H00F94_A460FasDsc[0] ;
            A194BarOrdLin = H00F94_A194BarOrdLin[0] ;
            A460FasDsc = H00F94_A460FasDsc[0] ;
            h457FasCod = A13781FasCDsc ;
            if ( (GXutil.strcmp("", A13781FasCDsc)==0) )
            {
               A457FasCod = "" ;
            }
            else
            {
               /* Using cursor H00F95 */
               pr_default.execute(3, new Object[] {A13781FasCDsc});
               A457FasCod = H00F95_A457FasCod[0] ;
               A457FasCod = H00F95_A457FasCod[0] ;
               if ( ! ( (pr_default.getStatus(3) == 101) ) )
               {
                  pr_default.readNext(3);
                  if ( ! ( (pr_default.getStatus(3) == 101) ) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_ambiguousck", new Object[] {httpContext.getMessage( "Código - Descripción", "")}), 1, "FASCOD");
                  }
               }
               else
               {
               }
               pr_default.close(3);
            }
            e18F92 ();
            pr_default.readNext(2);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(2) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(2);
         wbEnd = (short)(35) ;
         wbF90( ) ;
      }
      bGXsfl_35_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesF92( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASEST"+"_"+sGXsfl_35_idx, getSecureSignedToken( sGXsfl_35_idx, localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASFOR"+"_"+sGXsfl_35_idx, getSecureSignedToken( sGXsfl_35_idx, GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARFASACAB"+"_"+sGXsfl_35_idx, getSecureSignedToken( sGXsfl_35_idx, GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV41Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV21UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV23Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Station, ""))));
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
      /* Using cursor H00F96 */
      pr_default.execute(4, new Object[] {AV5EmprCod, Integer.valueOf(AV6BarCod), Byte.valueOf(AV7BarCodReo), AV8BarCodPar, AV9ProCod});
      GRID_nRecordCount = H00F96_AGRID_nRecordCount[0] ;
      pr_default.close(4);
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9ProCod, AV41Pgmname, AV21UsurCod, AV23Station) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9ProCod, AV41Pgmname, AV21UsurCod, AV23Station) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9ProCod, AV41Pgmname, AV21UsurCod, AV23Station) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9ProCod, AV41Pgmname, AV21UsurCod, AV23Station) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6BarCod, AV7BarCodReo, AV8BarCodPar, AV9ProCod, AV41Pgmname, AV21UsurCod, AV23Station) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV41Pgmname = "WebWBARFASTabla" ;
      Gx_err = (short)(0) ;
      fix_multi_value_controls( ) ;
   }

   public void strupF90( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e16F92 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV14GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV9ProCod = httpContext.cgiGet( "vPROCOD") ;
         AV8BarCodPar = httpContext.cgiGet( "vBARCODPAR") ;
         AV7BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( "vBARCODREO"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV6BarCod = (int)(localUtil.ctol( httpContext.cgiGet( "vBARCOD"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV5EmprCod = httpContext.cgiGet( "vEMPRCOD") ;
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
         Dvelop_confirmpanel_eliminarlinea_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Title") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmationtext") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminarlinea_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( "GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_eliminarlinea_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINARLINEA_Result") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDCURRENTPAGE");
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13GridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridCurrentPage), 10, 0));
         }
         else
         {
            AV13GridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridCurrentPage), 10, 0));
         }
         /* Read subfile selected row values. */
         nGXsfl_35_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
         if ( nGXsfl_35_idx > 0 )
         {
            cmbavAccionesfases.setName( cmbavAccionesfases.getInternalname() );
            cmbavAccionesfases.setValue( httpContext.cgiGet( cmbavAccionesfases.getInternalname()) );
            AV37AccionesFases = (short)(GXutil.lval( httpContext.cgiGet( cmbavAccionesfases.getInternalname()))) ;
            httpContext.ajax_rsp_assign_attri("", false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AccionesFases), 4, 0));
            A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
            A603MaqCodBis = httpContext.cgiGet( edtMaqCodBis_Internalname) ;
            A152BarFasCon = GXutil.upper( httpContext.cgiGet( edtBarFasCon_Internalname)) ;
            A153BarFasEst = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasEst_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            A150BarFacTin = GXutil.upper( httpContext.cgiGet( edtBarFacTin_Internalname)) ;
            A4905BarFasAcab = GXutil.upper( httpContext.cgiGet( edtBarFasAcab_Internalname)) ;
            A4287BarFasFor = GXutil.upper( httpContext.cgiGet( edtBarFasFor_Internalname)) ;
            A216BarTieTeo = localUtil.ctond( httpContext.cgiGet( edtBarTieTeo_Internalname)) ;
            A215BarTieRea = localUtil.ctond( httpContext.cgiGet( edtBarTieRea_Internalname)) ;
            A4442BarFasDTI = localUtil.ctot( httpContext.cgiGet( edtBarFasDTI_Internalname)) ;
            n4442BarFasDTI = false ;
            A4443BarFasDTF = localUtil.ctot( httpContext.cgiGet( edtBarFasDTF_Internalname)) ;
            n4443BarFasDTF = false ;
            A3837BarFasKgm = localUtil.ctond( httpContext.cgiGet( edtBarFasKgm_Internalname)) ;
            n3837BarFasKgm = false ;
            A3838BarFasMtr = localUtil.ctond( httpContext.cgiGet( edtBarFasMtr_Internalname)) ;
            n3838BarFasMtr = false ;
            h457FasCod = httpContext.cgiGet( edtFasCod_Internalname) ;
            A5048BarFasUsu = GXutil.upper( httpContext.cgiGet( edtBarFasUsu_Internalname)) ;
            n5048BarFasUsu = false ;
            A3836BarFasPri = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarFasPri_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      e16F92 ();
      if (returnInSub) return;
   }

   public void e16F92( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV23Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwbarfastabla_impl.this.GXt_char1 = GXv_char2[0] ;
      AV23Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23Station", AV23Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV23Station, ""))));
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV23Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwbarfastabla_impl.this.AV5EmprCod = GXv_char2[0] ;
      webwbarfastabla_impl.this.AV24EmprNom = GXv_char3[0] ;
      webwbarfastabla_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV21UsurCod", AV21UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV21UsurCod, "@!"))));
      GXt_int5 = (byte)(AV25Eliot) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "ELIOT", ""), GXv_int6) ;
      webwbarfastabla_impl.this.GXt_int5 = GXv_int6[0] ;
      AV25Eliot = GXt_int5 ;
      GXt_int5 = (byte)(AV26Tinamar) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "TINAMA", ""), GXv_int6) ;
      webwbarfastabla_impl.this.GXt_int5 = GXv_int6[0] ;
      AV26Tinamar = GXt_int5 ;
      GXt_int5 = (byte)(AV27Planing) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "PLANNC", ""), GXv_int6) ;
      webwbarfastabla_impl.this.GXt_int5 = GXv_int6[0] ;
      AV27Planing = GXt_int5 ;
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, "", false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      AV13GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridCurrentPage), 10, 0));
      edtavGridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridcurrentpage_Visible), 5, 0), true);
      AV14GridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14GridPageCount), 10, 0));
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e17F92( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_int7 = AV38NumeroRegistros ;
      GXv_char4[0] = AV5EmprCod ;
      GXv_int8[0] = AV6BarCod ;
      GXv_int6[0] = AV7BarCodReo ;
      GXv_char3[0] = AV8BarCodPar ;
      GXv_int9[0] = GXt_int7 ;
      new app.registrostablabarfas(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_int9) ;
      webwbarfastabla_impl.this.AV5EmprCod = GXv_char4[0] ;
      webwbarfastabla_impl.this.AV6BarCod = GXv_int8[0] ;
      webwbarfastabla_impl.this.AV7BarCodReo = GXv_int6[0] ;
      webwbarfastabla_impl.this.AV8BarCodPar = GXv_char3[0] ;
      webwbarfastabla_impl.this.GXt_int7 = GXv_int9[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
      AV38NumeroRegistros = GXt_int7 ;
      AV14GridPageCount = (long)((AV38NumeroRegistros/ (double) (10))+1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   private void e18F92( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavAccionesfases.removeAllItems();
      cmbavAccionesfases.addItem("0", ";fa fa-bars", (short)(0));
      cmbavAccionesfases.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Modificar", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      if ( A153BarFasEst == 0 )
      {
         cmbavAccionesfases.addItem("2", GXutil.format( "%1;%2", httpContext.getMessage( "Eliminar", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavAccionesfases.addItem("3", GXutil.format( "%1;%2", httpContext.getMessage( "Observaciones", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
      cmbavAccionesfases.addItem("4", GXutil.format( "%1;%2", httpContext.getMessage( "Parametros", ""), "fa fa-shapes", "", "", "", "", "", "", ""), (short)(0));
      if ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 )
      {
         cmbavAccionesfases.addItem("5", GXutil.format( "%1;%2", httpContext.getMessage( "Tratamiento Quimico", ""), "menu-icon fas fa-microscope", "", "", "", "", "", "", ""), (short)(0));
      }
      cmbavAccionesfases.addItem("6", GXutil.format( "%1;%2", httpContext.getMessage( "Abrir Fase", ""), "fa fa-folder-open", "", "", "", "", "", "", ""), (short)(0));
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
      cmbavAccionesfases.setValue( GXutil.trim( GXutil.str( AV37AccionesFases, 4, 0)) );
   }

   public void e11F92( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV13GridCurrentPage = (long)(AV13GridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridCurrentPage), 10, 0));
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV13GridCurrentPage = (long)(AV13GridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridCurrentPage), 10, 0));
         subgrid_nextpage( ) ;
      }
      else
      {
         AV12PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         AV13GridCurrentPage = AV12PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridCurrentPage), 10, 0));
         subgrid_gotopage( AV12PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e12F92( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV13GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13GridCurrentPage), 10, 0));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e19F92( )
   {
      /* Accionesfases_Click Routine */
      returnInSub = false ;
      if ( AV37AccionesFases == 1 )
      {
         /* Execute user subroutine: 'DO UPDLINEA' */
         S112 ();
         if (returnInSub) return;
      }
      else if ( AV37AccionesFases == 2 )
      {
         /* Execute user subroutine: 'DO ELIMINARLINEA' */
         S122 ();
         if (returnInSub) return;
      }
      else if ( AV37AccionesFases == 3 )
      {
         /* Execute user subroutine: 'DO OBSERVACIONES' */
         S132 ();
         if (returnInSub) return;
      }
      else if ( AV37AccionesFases == 4 )
      {
         /* Execute user subroutine: 'DO PARAMETROS' */
         S142 ();
         if (returnInSub) return;
      }
      else if ( AV37AccionesFases == 5 )
      {
         /* Execute user subroutine: 'DO TRATAMIENTOQUIMICO' */
         S152 ();
         if (returnInSub) return;
      }
      else if ( AV37AccionesFases == 6 )
      {
         /* Execute user subroutine: 'DO ABRIRFASE' */
         S162 ();
         if (returnInSub) return;
      }
      AV37AccionesFases = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AccionesFases), 4, 0));
      /*  Sending Event outputs  */
      cmbavAccionesfases.setValue( GXutil.trim( GXutil.str( AV37AccionesFases, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavAccionesfases.getInternalname(), "Values", cmbavAccionesfases.ToJavascriptSource(), true);
   }

   public void e13F92( )
   {
      /* Dvelop_confirmpanel_eliminarlinea_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminarlinea_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINARLINEA' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e14F92( )
   {
      /* 'DoInsertarLinea' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.insertarfaseenhdr", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.rtrim(AV10Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(AV15BarExt,1,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","Prodsc","BarExt"}) , new Object[] {"AV5EmprCod","AV6BarCod","AV7BarCodReo","AV8BarCodPar","AV9ProCod","AV10Prodsc","AV15BarExt"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e15F92( )
   {
      /* 'DoSalir' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV5EmprCod,Integer.valueOf(AV6BarCod),Byte.valueOf(AV7BarCodReo),AV8BarCodPar,AV9ProCod,AV10Prodsc,Byte.valueOf(AV15BarExt)});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5EmprCod","AV6BarCod","AV7BarCodReo","AV8BarCodPar","AV9ProCod","AV10Prodsc","AV15BarExt"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'DO UPDLINEA' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.wpwfasesmodif", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.rtrim(AV10Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarOrdLin"}) , new Object[] {"AV5EmprCod","AV6BarCod","AV7BarCodReo","AV8BarCodPar","AV9ProCod","AV10Prodsc","A194BarOrdLin"});
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'DO ELIMINARLINEA' Routine */
      returnInSub = false ;
      if ( A153BarFasEst != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Esta fase esta en Produccion", ""));
      }
      else
      {
         Dvelop_confirmpanel_eliminarlinea_Confirmationtext = httpContext.getMessage( "¿Desea eliminar la linea ", "")+GXutil.trim( GXutil.str( A194BarOrdLin, 4, 0))+" "+GXutil.trim( A457FasCod)+" "+GXutil.trim( A460FasDsc) ;
         ucDvelop_confirmpanel_eliminarlinea.sendProperty(context, "", false, Dvelop_confirmpanel_eliminarlinea_Internalname, "ConfirmationText", Dvelop_confirmpanel_eliminarlinea_Confirmationtext);
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S172( )
   {
      /* 'DO ACTION ELIMINARLINEA' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV5EmprCod ;
      GXv_int8[0] = AV6BarCod ;
      GXv_int6[0] = AV7BarCodReo ;
      GXv_char3[0] = AV8BarCodPar ;
      GXv_char2[0] = AV9ProCod ;
      GXv_int10[0] = A194BarOrdLin ;
      new app.pprofs03(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_char2, GXv_int10) ;
      webwbarfastabla_impl.this.AV5EmprCod = GXv_char4[0] ;
      webwbarfastabla_impl.this.AV6BarCod = GXv_int8[0] ;
      webwbarfastabla_impl.this.AV7BarCodReo = GXv_int6[0] ;
      webwbarfastabla_impl.this.AV8BarCodPar = GXv_char3[0] ;
      webwbarfastabla_impl.this.AV9ProCod = GXv_char2[0] ;
      webwbarfastabla_impl.this.A194BarOrdLin = GXv_int10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
      httpContext.ajax_rsp_assign_attri("", false, "AV9ProCod", AV9ProCod);
      new app.pcommit(remoteHandle, context).execute( ) ;
      AV22Inc_obs = httpContext.getMessage( "Fase= ", "") + A457FasCod + httpContext.getMessage( " Linea= ", "") + GXutil.str( A194BarOrdLin, 4, 0) + httpContext.getMessage( " Eliminada", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV5EmprCod, GXutil.substring( AV41Pgmname, 1, 10), GXutil.substring( AV21UsurCod, 1, 8), AV23Station, AV22Inc_obs, AV6BarCod, AV7BarCodReo, AV8BarCodPar) ;
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'DO OBSERVACIONES' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tbarfso", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin","FasCod","FasDsc","ProDsc"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S142( )
   {
      /* 'DO PARAMETROS' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.tfaspar", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"}) , new Object[] {});
      httpContext.doAjaxRefresh();
   }

   public void S152( )
   {
      /* 'DO TRATAMIENTOQUIMICO' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(A4287BarFasFor, httpContext.getMessage( "S", "")) == 0 )
      {
         GXv_char4[0] = AV5EmprCod ;
         GXv_int8[0] = AV6BarCod ;
         GXv_int6[0] = AV7BarCodReo ;
         GXv_char3[0] = AV8BarCodPar ;
         GXv_char2[0] = AV9ProCod ;
         GXv_int10[0] = A194BarOrdLin ;
         new app.phdfpq(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_char2, GXv_int10) ;
         webwbarfastabla_impl.this.AV5EmprCod = GXv_char4[0] ;
         webwbarfastabla_impl.this.AV6BarCod = GXv_int8[0] ;
         webwbarfastabla_impl.this.AV7BarCodReo = GXv_int6[0] ;
         webwbarfastabla_impl.this.AV8BarCodPar = GXv_char3[0] ;
         webwbarfastabla_impl.this.AV9ProCod = GXv_char2[0] ;
         webwbarfastabla_impl.this.A194BarOrdLin = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
         httpContext.ajax_rsp_assign_attri("", false, "AV9ProCod", AV9ProCod);
         httpContext.popup(formatLink("app.thdfpq", new String[] {GXutil.URLEncode(GXutil.rtrim(httpContext.getMessage( "UPD", ""))),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"Mode","EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","BarOrdLin"}) , new Object[] {});
         if ( GXutil.strcmp(A4905BarFasAcab, httpContext.getMessage( "S", "")) == 0 )
         {
            GXv_char4[0] = AV5EmprCod ;
            GXv_int8[0] = AV6BarCod ;
            GXv_int6[0] = AV7BarCodReo ;
            GXv_char3[0] = AV8BarCodPar ;
            GXv_char2[0] = AV9ProCod ;
            new app.pacbquh(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_int6, GXv_char3, GXv_char2) ;
            webwbarfastabla_impl.this.AV5EmprCod = GXv_char4[0] ;
            webwbarfastabla_impl.this.AV6BarCod = GXv_int8[0] ;
            webwbarfastabla_impl.this.AV7BarCodReo = GXv_int6[0] ;
            webwbarfastabla_impl.this.AV8BarCodPar = GXv_char3[0] ;
            webwbarfastabla_impl.this.AV9ProCod = GXv_char2[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
            httpContext.ajax_rsp_assign_attri("", false, "AV9ProCod", AV9ProCod);
         }
         httpContext.doAjaxRefresh();
      }
      else
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "La fase debe tener item Formula=S", ""));
      }
      if ( 0 == 1 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.home", new String[] {}, new String[] {}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
   }

   public void S162( )
   {
      /* 'DO ABRIRFASE' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webwopenfas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.rtrim(AV10Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A460FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV30Si_rgto,4,0))}, new String[] {"EmprCod","Barcod","BarCodReo","BarCodPar","Procod","Prodsc","Barordlin","FasCod","FasDsc","Si_rgto"}) , new Object[] {"AV5EmprCod","AV6BarCod","AV7BarCodReo","AV8BarCodPar","AV9ProCod","AV10Prodsc","A194BarOrdLin","A457FasCod","A460FasDsc","AV30Si_rgto"});
      httpContext.doAjaxRefresh();
   }

   public void e20F92( )
   {
      /* 'DoAbrirFaseLector' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webwopenfas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.rtrim(AV10Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0)),GXutil.URLEncode(GXutil.rtrim(A457FasCod)),GXutil.URLEncode(GXutil.rtrim(A460FasDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV30Si_rgto,4,0))}, new String[] {"EmprCod","Barcod","BarCodReo","BarCodPar","Procod","Prodsc","Barordlin","FasCod","FasDsc","Si_rgto"}) , new Object[] {"AV5EmprCod","AV6BarCod","AV7BarCodReo","AV8BarCodPar","AV9ProCod","AV10Prodsc","A194BarOrdLin","A457FasCod","A460FasDsc","AV30Si_rgto"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e21F92( )
   {
      /* 'DoModificar' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.wpwfasesmodif", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8BarCodPar)),GXutil.URLEncode(GXutil.rtrim(AV9ProCod)),GXutil.URLEncode(GXutil.rtrim(AV10Prodsc)),GXutil.URLEncode(GXutil.ltrimstr(A194BarOrdLin,4,0))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar","ProCod","ProDsc","BarOrdLin"}) , new Object[] {"AV5EmprCod","AV6BarCod","AV7BarCodReo","AV8BarCodPar","AV9ProCod","AV10Prodsc","A194BarOrdLin"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void wb_table1_64_F92( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, tblTabledvelop_confirmpanel_eliminarlinea_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminarlinea.setProperty("Title", Dvelop_confirmpanel_eliminarlinea_Title);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminarlinea_Confirmationtext);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminarlinea.setProperty("ConfirmType", Dvelop_confirmpanel_eliminarlinea_Confirmtype);
         ucDvelop_confirmpanel_eliminarlinea.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminarlinea_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARLINEAContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_64_F92e( true) ;
      }
      else
      {
         wb_table1_64_F92e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV6BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6BarCod), 8, 0));
      AV7BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7BarCodReo", GXutil.str( AV7BarCodReo, 1, 0));
      AV8BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8BarCodPar", AV8BarCodPar);
      AV9ProCod = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9ProCod", AV9ProCod);
      AV10Prodsc = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Prodsc", AV10Prodsc);
      AV15BarExt = ((Number) GXutil.testNumericType( getParm(obj,6), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15BarExt", GXutil.str( AV15BarExt, 1, 0));
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
      paF92( ) ;
      wsF92( ) ;
      weF92( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268171418512", true, true);
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
         httpContext.AddJavascriptSource("webwbarfastabla.js", "?20268171418513", false, true);
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
         httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_352( )
   {
      cmbavAccionesfases.setInternalname( "vACCIONESFASES_"+sGXsfl_35_idx );
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_35_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_35_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_35_idx ;
      edtBarFasCon_Internalname = "BARFASCON_"+sGXsfl_35_idx ;
      edtBarFasEst_Internalname = "BARFASEST_"+sGXsfl_35_idx ;
      edtBarFacTin_Internalname = "BARFACTIN_"+sGXsfl_35_idx ;
      edtBarFasAcab_Internalname = "BARFASACAB_"+sGXsfl_35_idx ;
      edtBarFasFor_Internalname = "BARFASFOR_"+sGXsfl_35_idx ;
      edtBarTieTeo_Internalname = "BARTIETEO_"+sGXsfl_35_idx ;
      edtBarTieRea_Internalname = "BARTIEREA_"+sGXsfl_35_idx ;
      edtBarFasDTI_Internalname = "BARFASDTI_"+sGXsfl_35_idx ;
      edtBarFasDTF_Internalname = "BARFASDTF_"+sGXsfl_35_idx ;
      edtBarFasKgm_Internalname = "BARFASKGM_"+sGXsfl_35_idx ;
      edtBarFasMtr_Internalname = "BARFASMTR_"+sGXsfl_35_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_35_idx ;
      edtBarFasUsu_Internalname = "BARFASUSU_"+sGXsfl_35_idx ;
      edtBarFasPri_Internalname = "BARFASPRI_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_352( )
   {
      cmbavAccionesfases.setInternalname( "vACCIONESFASES_"+sGXsfl_35_fel_idx );
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_35_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_35_fel_idx ;
      edtMaqCodBis_Internalname = "MAQCODBIS_"+sGXsfl_35_fel_idx ;
      edtBarFasCon_Internalname = "BARFASCON_"+sGXsfl_35_fel_idx ;
      edtBarFasEst_Internalname = "BARFASEST_"+sGXsfl_35_fel_idx ;
      edtBarFacTin_Internalname = "BARFACTIN_"+sGXsfl_35_fel_idx ;
      edtBarFasAcab_Internalname = "BARFASACAB_"+sGXsfl_35_fel_idx ;
      edtBarFasFor_Internalname = "BARFASFOR_"+sGXsfl_35_fel_idx ;
      edtBarTieTeo_Internalname = "BARTIETEO_"+sGXsfl_35_fel_idx ;
      edtBarTieRea_Internalname = "BARTIEREA_"+sGXsfl_35_fel_idx ;
      edtBarFasDTI_Internalname = "BARFASDTI_"+sGXsfl_35_fel_idx ;
      edtBarFasDTF_Internalname = "BARFASDTF_"+sGXsfl_35_fel_idx ;
      edtBarFasKgm_Internalname = "BARFASKGM_"+sGXsfl_35_fel_idx ;
      edtBarFasMtr_Internalname = "BARFASMTR_"+sGXsfl_35_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_35_fel_idx ;
      edtBarFasUsu_Internalname = "BARFASUSU_"+sGXsfl_35_fel_idx ;
      edtBarFasPri_Internalname = "BARFASPRI_"+sGXsfl_35_fel_idx ;
   }

   public void sendrow_352( )
   {
      subsflControlProps_352( ) ;
      wbF90( ) ;
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
            httpContext.writeText( " class=\""+"GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_35_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavAccionesfases.getEnabled()!=0)&&(cmbavAccionesfases.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 36,'',false,'"+sGXsfl_35_idx+"',35)\"" : " ") ;
         if ( ( cmbavAccionesfases.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vACCIONESFASES_" + sGXsfl_35_idx ;
            cmbavAccionesfases.setName( GXCCtl );
            cmbavAccionesfases.setWebtags( "" );
            if ( cmbavAccionesfases.getItemCount() > 0 )
            {
               AV37AccionesFases = (short)(GXutil.lval( cmbavAccionesfases.getValidValue(GXutil.trim( GXutil.str( AV37AccionesFases, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AccionesFases), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavAccionesfases,cmbavAccionesfases.getInternalname(),GXutil.trim( GXutil.str( AV37AccionesFases, 4, 0)),Integer.valueOf(1),cmbavAccionesfases.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVACCIONESFASES.CLICK."+sGXsfl_35_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavAccionesfases.getEnabled()!=0)&&(cmbavAccionesfases.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,36);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavAccionesfases.setValue( GXutil.trim( GXutil.str( AV37AccionesFases, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavAccionesfases.getInternalname(), "Values", cmbavAccionesfases.ToJavascriptSource(), !bGXsfl_35_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtMaqCodBis_Internalname,GXutil.rtrim( A603MaqCodBis),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtMaqCodBis_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasCon_Internalname,GXutil.rtrim( A152BarFasCon),GXutil.rtrim( localUtil.format( A152BarFasCon, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasCon_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasEst_Internalname,GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A153BarFasEst), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasEst_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFacTin_Internalname,GXutil.rtrim( A150BarFacTin),GXutil.rtrim( localUtil.format( A150BarFacTin, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFacTin_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasAcab_Internalname,GXutil.rtrim( A4905BarFasAcab),GXutil.rtrim( localUtil.format( A4905BarFasAcab, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasAcab_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasFor_Internalname,GXutil.rtrim( A4287BarFasFor),GXutil.rtrim( localUtil.format( A4287BarFasFor, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasFor_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A216BarTieTeo, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieTeo_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarTieRea_Internalname,GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A215BarTieRea, "Z9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarTieRea_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDTI_Internalname,localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4442BarFasDTI, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDTI_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasDTF_Internalname,localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "),localUtil.format( A4443BarFasDTF, "99/99/99 99:99:99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasDTF_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasKgm_Internalname,GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3837BarFasKgm, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasKgm_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "TagColum" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasMtr_Internalname,GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A3838BarFasMtr, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasMtr_Jsonclick,Integer.valueOf(0),"TagColum","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,h457FasCod,"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasUsu_Internalname,GXutil.rtrim( A5048BarFasUsu),GXutil.rtrim( localUtil.format( A5048BarFasUsu, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasUsu_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarFasPri_Internalname,GXutil.ltrim( localUtil.ntoc( A3836BarFasPri, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A3836BarFasPri), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarFasPri_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesF92( ) ;
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
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "C", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "T", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "A", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "F", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teorico", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Inicio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fin", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"TagColum"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Usuario", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "BarFasPri", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV37AccionesFases, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A603MaqCodBis));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A152BarFasCon));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A150BarFacTin));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4905BarFasAcab));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A4287BarFasFor));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A216BarTieTeo, (byte)(5), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A215BarTieRea, (byte)(5), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4442BarFasDTI, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.ttoc( A4443BarFasDTF, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3837BarFasKgm, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3838BarFasMtr, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", h457FasCod);
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5048BarFasUsu));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A3836BarFasPri, (byte)(2), (byte)(0), ".", "")));
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
      bttBtninsertarlinea_Internalname = "BTNINSERTARLINEA" ;
      bttBtnsalir_Internalname = "BTNSALIR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      cmbavAccionesfases.setInternalname( "vACCIONESFASES" );
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtMaqCodBis_Internalname = "MAQCODBIS" ;
      edtBarFasCon_Internalname = "BARFASCON" ;
      edtBarFasEst_Internalname = "BARFASEST" ;
      edtBarFacTin_Internalname = "BARFACTIN" ;
      edtBarFasAcab_Internalname = "BARFASACAB" ;
      edtBarFasFor_Internalname = "BARFASFOR" ;
      edtBarTieTeo_Internalname = "BARTIETEO" ;
      edtBarTieRea_Internalname = "BARTIEREA" ;
      edtBarFasDTI_Internalname = "BARFASDTI" ;
      edtBarFasDTF_Internalname = "BARFASDTF" ;
      edtBarFasKgm_Internalname = "BARFASKGM" ;
      edtBarFasMtr_Internalname = "BARFASMTR" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtBarFasUsu_Internalname = "BARFASUSU" ;
      edtBarFasPri_Internalname = "BARFASPRI" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavGridcurrentpage_Internalname = "vGRIDCURRENTPAGE" ;
      Dvelop_confirmpanel_eliminarlinea_Internalname = "DVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      tblTabledvelop_confirmpanel_eliminarlinea_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINARLINEA" ;
      Grid_titlescategories_Internalname = "GRID_TITLESCATEGORIES" ;
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
      edtBarFasPri_Jsonclick = "" ;
      edtBarFasUsu_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtBarFasMtr_Jsonclick = "" ;
      edtBarFasKgm_Jsonclick = "" ;
      edtBarFasDTF_Jsonclick = "" ;
      edtBarFasDTI_Jsonclick = "" ;
      edtBarTieRea_Jsonclick = "" ;
      edtBarTieTeo_Jsonclick = "" ;
      edtBarFasFor_Jsonclick = "" ;
      edtBarFasAcab_Jsonclick = "" ;
      edtBarFacTin_Jsonclick = "" ;
      edtBarFasEst_Jsonclick = "" ;
      edtBarFasCon_Jsonclick = "" ;
      edtMaqCodBis_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      cmbavAccionesfases.setJsonclick( "" );
      cmbavAccionesfases.setVisible( -1 );
      cmbavAccionesfases.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavGridcurrentpage_Jsonclick = "" ;
      edtavGridcurrentpage_Visible = 1 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;;;;;;;;;;;;;" ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;;;;;;;Tiempo;Tiempo;Fecha;Fecha;;;;;" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminarlinea_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminarlinea_Title = "" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Fases", "") ;
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
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Alta Linea", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mantenimiento Fases (Hdr)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vACCIONESFASES_" + sGXsfl_35_idx ;
      cmbavAccionesfases.setName( GXCCtl );
      cmbavAccionesfases.setWebtags( "" );
      if ( cmbavAccionesfases.getItemCount() > 0 )
      {
         AV37AccionesFases = (short)(GXutil.lval( cmbavAccionesfases.getValidValue(GXutil.trim( GXutil.str( AV37AccionesFases, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavAccionesfases.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37AccionesFases), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV41Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV14GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e18F92',iparms:[{av:'A153BarFasEst',fld:'BARFASEST',pic:'9',hsh:true},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavAccionesfases'},{av:'AV37AccionesFases',fld:'vACCIONESFASES',pic:'ZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11F92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV41Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV13GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV13GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV14GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12F92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV41Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV13GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VACCIONESFASES.CLICK","{handler:'e19F92',iparms:[{av:'cmbavAccionesfases'},{av:'AV37AccionesFases',fld:'vACCIONESFASES',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV41Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV10Prodsc',fld:'vPRODSC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9',hsh:true},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A4287BarFasFor',fld:'BARFASFOR',pic:'@!',hsh:true},{av:'A4905BarFasAcab',fld:'BARFASACAB',pic:'@!',hsh:true},{av:'AV30Si_rgto',fld:'vSI_RGTO',pic:'ZZZ9'}]");
      setEventMetadata("VACCIONESFASES.CLICK",",oparms:[{av:'cmbavAccionesfases'},{av:'AV37AccionesFases',fld:'vACCIONESFASES',pic:'ZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV10Prodsc',fld:'vPRODSC',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'Dvelop_confirmpanel_eliminarlinea_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'ConfirmationText'},{av:'AV30Si_rgto',fld:'vSI_RGTO',pic:'ZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV14GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE","{handler:'e13F92',iparms:[{av:'Dvelop_confirmpanel_eliminarlinea_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINARLINEA',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV41Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINARLINEA.CLOSE",",oparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOINSERTARLINEA'","{handler:'e14F92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV41Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV10Prodsc',fld:'vPRODSC',pic:''},{av:'AV15BarExt',fld:'vBAREXT',pic:'9'}]");
      setEventMetadata("'DOINSERTARLINEA'",",oparms:[{av:'AV15BarExt',fld:'vBAREXT',pic:'9'},{av:'AV10Prodsc',fld:'vPRODSC',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOSALIR'","{handler:'e15F92',iparms:[{av:'AV15BarExt',fld:'vBAREXT',pic:'9'},{av:'AV10Prodsc',fld:'vPRODSC',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOSALIR'",",oparms:[]}");
      setEventMetadata("'DOABRIRFASELECTOR'","{handler:'e20F92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV41Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV10Prodsc',fld:'vPRODSC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'AV30Si_rgto',fld:'vSI_RGTO',pic:'ZZZ9'}]");
      setEventMetadata("'DOABRIRFASELECTOR'",",oparms:[{av:'AV30Si_rgto',fld:'vSI_RGTO',pic:'ZZZ9'},{av:'A460FasDsc',fld:'FASDSC',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV10Prodsc',fld:'vPRODSC',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOMODIFICAR'","{handler:'e21F92',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV41Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV21UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV23Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV10Prodsc',fld:'vPRODSC',pic:''},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'}]");
      setEventMetadata("'DOMODIFICAR'",",oparms:[{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV10Prodsc',fld:'vPRODSC',pic:''},{av:'AV9ProCod',fld:'vPROCOD',pic:''},{av:'AV8BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV7BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV6BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Barfaspri',iparms:[]");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV8BarCodPar = "" ;
      wcpOAV9ProCod = "" ;
      wcpOAV10Prodsc = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_eliminarlinea_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A13781FasCDsc = "" ;
      h457FasCod = "" ;
      AV5EmprCod = "" ;
      AV8BarCodPar = "" ;
      AV9ProCod = "" ;
      AV10Prodsc = "" ;
      AV41Pgmname = "" ;
      AV21UsurCod = "" ;
      AV23Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      A457FasCod = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtninsertarlinea_Jsonclick = "" ;
      bttBtnsalir_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A460FasDsc = "" ;
      A603MaqCodBis = "" ;
      A152BarFasCon = "" ;
      A150BarFacTin = "" ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      A216BarTieTeo = DecimalUtil.ZERO ;
      A215BarTieRea = DecimalUtil.ZERO ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      A4443BarFasDTF = GXutil.resetTime( GXutil.nullDate() );
      A3837BarFasKgm = DecimalUtil.ZERO ;
      A3838BarFasMtr = DecimalUtil.ZERO ;
      A5048BarFasUsu = "" ;
      gxdynajaxctrlcodr = new com.genexus.internet.StringCollection();
      gxdynajaxctrldescr = new com.genexus.internet.StringCollection();
      gxwrpcisep = "" ;
      scmdbuf = "" ;
      l13781FasCDsc = "" ;
      H00F92_A13781FasCDsc = new String[] {""} ;
      H00F93_A13781FasCDsc = new String[] {""} ;
      H00F93_A396EmprCod = new String[] {""} ;
      H00F93_A457FasCod = new String[] {""} ;
      A396EmprCod = "" ;
      H00F94_A758ProCod = new String[] {""} ;
      H00F94_A130BarCodPar = new String[] {""} ;
      H00F94_A132BarCodReo = new byte[1] ;
      H00F94_A129BarCod = new int[1] ;
      H00F94_A396EmprCod = new String[] {""} ;
      H00F94_A3836BarFasPri = new byte[1] ;
      H00F94_A5048BarFasUsu = new String[] {""} ;
      H00F94_n5048BarFasUsu = new boolean[] {false} ;
      H00F94_A457FasCod = new String[] {""} ;
      H00F94_A3838BarFasMtr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00F94_n3838BarFasMtr = new boolean[] {false} ;
      H00F94_A3837BarFasKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00F94_n3837BarFasKgm = new boolean[] {false} ;
      H00F94_A4443BarFasDTF = new java.util.Date[] {GXutil.nullDate()} ;
      H00F94_n4443BarFasDTF = new boolean[] {false} ;
      H00F94_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H00F94_n4442BarFasDTI = new boolean[] {false} ;
      H00F94_A215BarTieRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00F94_A216BarTieTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00F94_A4287BarFasFor = new String[] {""} ;
      H00F94_A4905BarFasAcab = new String[] {""} ;
      H00F94_A150BarFacTin = new String[] {""} ;
      H00F94_A153BarFasEst = new byte[1] ;
      H00F94_A152BarFasCon = new String[] {""} ;
      H00F94_A603MaqCodBis = new String[] {""} ;
      H00F94_A460FasDsc = new String[] {""} ;
      H00F94_A194BarOrdLin = new short[1] ;
      A758ProCod = "" ;
      A130BarCodPar = "" ;
      H00F95_A13781FasCDsc = new String[] {""} ;
      H00F95_A396EmprCod = new String[] {""} ;
      H00F95_A457FasCod = new String[] {""} ;
      H00F96_AGRID_nRecordCount = new long[1] ;
      GXt_char1 = "" ;
      AV24EmprNom = "" ;
      GXv_int9 = new long[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      ucDvelop_confirmpanel_eliminarlinea = new com.genexus.webpanels.GXUserControl();
      AV22Inc_obs = "" ;
      GXv_int10 = new short[1] ;
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwbarfastabla__default(),
         new Object[] {
             new Object[] {
            H00F92_A13781FasCDsc
            }
            , new Object[] {
            H00F93_A13781FasCDsc, H00F93_A396EmprCod, H00F93_A457FasCod
            }
            , new Object[] {
            H00F94_A758ProCod, H00F94_A130BarCodPar, H00F94_A132BarCodReo, H00F94_A129BarCod, H00F94_A396EmprCod, H00F94_A3836BarFasPri, H00F94_A5048BarFasUsu, H00F94_n5048BarFasUsu, H00F94_A457FasCod, H00F94_A3838BarFasMtr,
            H00F94_n3838BarFasMtr, H00F94_A3837BarFasKgm, H00F94_n3837BarFasKgm, H00F94_A4443BarFasDTF, H00F94_n4443BarFasDTF, H00F94_A4442BarFasDTI, H00F94_n4442BarFasDTI, H00F94_A215BarTieRea, H00F94_A216BarTieTeo, H00F94_A4287BarFasFor,
            H00F94_A4905BarFasAcab, H00F94_A150BarFacTin, H00F94_A153BarFasEst, H00F94_A152BarFasCon, H00F94_A603MaqCodBis, H00F94_A460FasDsc, H00F94_A194BarOrdLin
            }
            , new Object[] {
            H00F95_A13781FasCDsc, H00F95_A396EmprCod, H00F95_A457FasCod
            }
            , new Object[] {
            H00F96_AGRID_nRecordCount
            }
         }
      );
      AV41Pgmname = "WebWBARFASTabla" ;
      /* GeneXus formulas. */
      AV41Pgmname = "WebWBARFASTabla" ;
      Gx_err = (short)(0) ;
   }

   private byte wcpOAV7BarCodReo ;
   private byte wcpOAV15BarExt ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV7BarCodReo ;
   private byte AV15BarExt ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte A153BarFasEst ;
   private byte A3836BarFasPri ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte A132BarCodReo ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV30Si_rgto ;
   private short wbEnd ;
   private short wbStart ;
   private short AV37AccionesFases ;
   private short A194BarOrdLin ;
   private short gxcookieaux ;
   private short gxhchits ;
   private short Gx_err ;
   private short AV25Eliot ;
   private short AV26Tinamar ;
   private short AV27Planing ;
   private short GXv_int10[] ;
   private int wcpOAV6BarCod ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_35 ;
   private int subGrid_Rows ;
   private int AV6BarCod ;
   private int nGXsfl_35_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavGridcurrentpage_Visible ;
   private int gxdynajaxindex ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A129BarCod ;
   private int AV12PageToGo ;
   private int GXv_int8[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV14GridPageCount ;
   private long AV13GridCurrentPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV38NumeroRegistros ;
   private long GXt_int7 ;
   private long GXv_int9[] ;
   private java.math.BigDecimal A216BarTieTeo ;
   private java.math.BigDecimal A215BarTieRea ;
   private java.math.BigDecimal A3837BarFasKgm ;
   private java.math.BigDecimal A3838BarFasMtr ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV8BarCodPar ;
   private String wcpOAV9ProCod ;
   private String wcpOAV10Prodsc ;
   private String Gridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_eliminarlinea_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5EmprCod ;
   private String AV8BarCodPar ;
   private String AV9ProCod ;
   private String AV10Prodsc ;
   private String sGXsfl_35_idx="0001" ;
   private String AV41Pgmname ;
   private String AV21UsurCod ;
   private String AV23Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A457FasCod ;
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
   private String Dvelop_confirmpanel_eliminarlinea_Title ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminarlinea_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminarlinea_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtninsertarlinea_Internalname ;
   private String bttBtninsertarlinea_Jsonclick ;
   private String bttBtnsalir_Internalname ;
   private String bttBtnsalir_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavGridcurrentpage_Internalname ;
   private String edtavGridcurrentpage_Jsonclick ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtBarOrdLin_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String A603MaqCodBis ;
   private String edtMaqCodBis_Internalname ;
   private String A152BarFasCon ;
   private String edtBarFasCon_Internalname ;
   private String edtBarFasEst_Internalname ;
   private String A150BarFacTin ;
   private String edtBarFacTin_Internalname ;
   private String A4905BarFasAcab ;
   private String edtBarFasAcab_Internalname ;
   private String A4287BarFasFor ;
   private String edtBarFasFor_Internalname ;
   private String edtBarTieTeo_Internalname ;
   private String edtBarTieRea_Internalname ;
   private String edtBarFasDTI_Internalname ;
   private String edtBarFasDTF_Internalname ;
   private String edtBarFasKgm_Internalname ;
   private String edtBarFasMtr_Internalname ;
   private String edtFasCod_Internalname ;
   private String A5048BarFasUsu ;
   private String edtBarFasUsu_Internalname ;
   private String edtBarFasPri_Internalname ;
   private String gxwrpcisep ;
   private String scmdbuf ;
   private String A396EmprCod ;
   private String A758ProCod ;
   private String A130BarCodPar ;
   private String GXt_char1 ;
   private String AV24EmprNom ;
   private String Dvelop_confirmpanel_eliminarlinea_Internalname ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminarlinea_Internalname ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtMaqCodBis_Jsonclick ;
   private String edtBarFasCon_Jsonclick ;
   private String edtBarFasEst_Jsonclick ;
   private String edtBarFacTin_Jsonclick ;
   private String edtBarFasAcab_Jsonclick ;
   private String edtBarFasFor_Jsonclick ;
   private String edtBarTieTeo_Jsonclick ;
   private String edtBarTieRea_Jsonclick ;
   private String edtBarFasDTI_Jsonclick ;
   private String edtBarFasDTF_Jsonclick ;
   private String edtBarFasKgm_Jsonclick ;
   private String edtBarFasMtr_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtBarFasUsu_Jsonclick ;
   private String edtBarFasPri_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date A4443BarFasDTF ;
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
   private boolean Grid_empowerer_Hascategories ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n4442BarFasDTI ;
   private boolean n4443BarFasDTF ;
   private boolean n3837BarFasKgm ;
   private boolean n3838BarFasMtr ;
   private boolean n5048BarFasUsu ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String A13781FasCDsc ;
   private String h457FasCod ;
   private String l13781FasCDsc ;
   private String AV22Inc_obs ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.StringCollection gxdynajaxctrlcodr ;
   private com.genexus.internet.StringCollection gxdynajaxctrldescr ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminarlinea ;
   private HTMLChoice cmbavAccionesfases ;
   private IDataStoreProvider pr_default ;
   private String[] H00F92_A13781FasCDsc ;
   private String[] H00F93_A13781FasCDsc ;
   private String[] H00F93_A396EmprCod ;
   private String[] H00F93_A457FasCod ;
   private String[] H00F94_A758ProCod ;
   private String[] H00F94_A130BarCodPar ;
   private byte[] H00F94_A132BarCodReo ;
   private int[] H00F94_A129BarCod ;
   private String[] H00F94_A396EmprCod ;
   private byte[] H00F94_A3836BarFasPri ;
   private String[] H00F94_A5048BarFasUsu ;
   private boolean[] H00F94_n5048BarFasUsu ;
   private String[] H00F94_A457FasCod ;
   private java.math.BigDecimal[] H00F94_A3838BarFasMtr ;
   private boolean[] H00F94_n3838BarFasMtr ;
   private java.math.BigDecimal[] H00F94_A3837BarFasKgm ;
   private boolean[] H00F94_n3837BarFasKgm ;
   private java.util.Date[] H00F94_A4443BarFasDTF ;
   private boolean[] H00F94_n4443BarFasDTF ;
   private java.util.Date[] H00F94_A4442BarFasDTI ;
   private boolean[] H00F94_n4442BarFasDTI ;
   private java.math.BigDecimal[] H00F94_A215BarTieRea ;
   private java.math.BigDecimal[] H00F94_A216BarTieTeo ;
   private String[] H00F94_A4287BarFasFor ;
   private String[] H00F94_A4905BarFasAcab ;
   private String[] H00F94_A150BarFacTin ;
   private byte[] H00F94_A153BarFasEst ;
   private String[] H00F94_A152BarFasCon ;
   private String[] H00F94_A603MaqCodBis ;
   private String[] H00F94_A460FasDsc ;
   private short[] H00F94_A194BarOrdLin ;
   private String[] H00F95_A13781FasCDsc ;
   private String[] H00F95_A396EmprCod ;
   private String[] H00F95_A457FasCod ;
   private long[] H00F96_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class webwbarfastabla__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00F92", "SELECT * FROM (SELECT DISTINCT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc FROM TXPFASPRO WHERE UPPER(RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc))) like '%' || UPPER(?)) WHERE rownum <= 30 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00F93", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00F94", "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT  T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod, T1.BarFasPri, T1.BarFasUsu, T1.FasCod, T1.BarFasMtr, T1.BarFasKgm, T1.BarFasDTF, T1.BarFasDTI, T1.BarTieRea, T1.BarTieTeo, T1.BarFasFor, T1.BarFasAcab, T1.BarFacTin, T1.BarFasEst, T1.BarFasCon, T1.MaqCodBis, T2.FasDsc, T1.BarOrdLin FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod, T1.BarOrdLin) GX_CTE) WHERE GX_ROW_NUMBER BETWEEN ? AND ? OR ? < ? AND GX_ROW_NUMBER >= ?",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00F95", "SELECT RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) AS FasCDsc, EmprCod, FasCod FROM TXPFASPRO WHERE RTRIM(LTRIM(FasCod)) || '-' || RTRIM(LTRIM(FasDsc)) = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00F96", "SELECT COUNT(*) FROM (TXPBARFAS T1 INNER JOIN TXPFASPRO T2 ON T2.EmprCod = T1.EmprCod AND T2.FasCod = T1.FasCod) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 8);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 3);
               ((byte[]) buf[5])[0] = rslt.getByte(6);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(8, 8);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(10,2);
               ((boolean[]) buf[12])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[13])[0] = rslt.getGXDateTime(11);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((java.util.Date[]) buf[15])[0] = rslt.getGXDateTime(12);
               ((boolean[]) buf[16])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[17])[0] = rslt.getBigDecimal(13,2);
               ((java.math.BigDecimal[]) buf[18])[0] = rslt.getBigDecimal(14,2);
               ((String[]) buf[19])[0] = rslt.getString(15, 1);
               ((String[]) buf[20])[0] = rslt.getString(16, 1);
               ((String[]) buf[21])[0] = rslt.getString(17, 1);
               ((byte[]) buf[22])[0] = rslt.getByte(18);
               ((String[]) buf[23])[0] = rslt.getString(19, 1);
               ((String[]) buf[24])[0] = rslt.getString(20, 6);
               ((String[]) buf[25])[0] = rslt.getString(21, 28);
               ((short[]) buf[26])[0] = rslt.getShort(22);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getVarchar(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 8);
               return;
            case 4 :
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
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 1 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               stmt.setInt(9, ((Number) parms[8]).intValue());
               stmt.setInt(10, ((Number) parms[9]).intValue());
               return;
            case 3 :
               stmt.setVarchar(1, (String)parms[0], 100);
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
      }
   }

}

