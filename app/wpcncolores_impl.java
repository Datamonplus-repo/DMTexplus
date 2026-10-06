package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wpcncolores_impl extends GXDataArea
{
   public wpcncolores_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wpcncolores_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wpcncolores_impl.class ));
   }

   public wpcncolores_impl( int remoteHandle ,
                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "InOutEmprCod") ;
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
            AV69InOutEmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV69InOutEmprCod", AV69InOutEmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV55InOutCliCod = (int)(GXutil.lval( httpContext.GetPar( "InOutCliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55InOutCliCod), 6, 0));
               AV16InOutForSer = httpContext.GetPar( "InOutForSer") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16InOutForSer", AV16InOutForSer);
               AV17InOutForColNom = httpContext.GetPar( "InOutForColNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV17InOutForColNom", AV17InOutForColNom);
               AV18InOutForColNum = (int)(GXutil.lval( httpContext.GetPar( "InOutForColNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18InOutForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18InOutForColNum), 6, 0));
               AV19InOutTipColCod = (byte)(GXutil.lval( httpContext.GetPar( "InOutTipColCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19InOutTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19InOutTipColCod), 2, 0));
               AV53InoutForNomcli = httpContext.GetPar( "InoutForNomcli") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV53InoutForNomcli", AV53InoutForNomcli);
               AV54InoutFornumcli = (int)(GXutil.lval( httpContext.GetPar( "InoutFornumcli"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV54InoutFornumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54InoutFornumcli), 6, 0));
               AV66InoutFortonal = httpContext.GetPar( "InoutFortonal") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV66InoutFortonal", AV66InoutFortonal);
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
      nRC_GXsfl_32 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_32"))) ;
      nGXsfl_32_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_32_idx"))) ;
      sGXsfl_32_idx = httpContext.GetPar( "sGXsfl_32_idx") ;
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
      AV68Var_Forser = httpContext.GetPar( "Var_Forser") ;
      AV24OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV25OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV59TFForSerDsc = httpContext.GetPar( "TFForSerDsc") ;
      AV60TFForSerDsc_Sel = httpContext.GetPar( "TFForSerDsc_Sel") ;
      AV61TFForColNom = httpContext.GetPar( "TFForColNom") ;
      AV62TFForColNom_Sel = httpContext.GetPar( "TFForColNom_Sel") ;
      AV63TFForColNum = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum"))) ;
      AV64TFForColNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFForColNum_To"))) ;
      AV75Pgmname = httpContext.GetPar( "Pgmname") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A252CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV68Var_Forser, AV24OrderedBy, AV25OrderedDsc, AV59TFForSerDsc, AV60TFForSerDsc_Sel, AV61TFForColNom, AV62TFForColNom_Sel, AV63TFForColNum, AV64TFForColNum_To, AV75Pgmname, A396EmprCod, A252CliCod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "app.wwpbaseobjects.workwithplusmasterpageprompt");
         MasterPageObj.setDataArea(this,true);
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
      pa11G2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start11G2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeText( " "+"class=\"form-horizontal FormNoBackgroundColor\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal FormNoBackgroundColor\" data-gx-class=\"form-horizontal FormNoBackgroundColor\" novalidate action=\""+formatLink("app.wpcncolores", new String[] {GXutil.URLEncode(GXutil.rtrim(AV69InOutEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV55InOutCliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV16InOutForSer)),GXutil.URLEncode(GXutil.rtrim(AV17InOutForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV18InOutForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19InOutTipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV53InoutForNomcli)),GXutil.URLEncode(GXutil.ltrimstr(AV54InoutFornumcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV66InoutFortonal))}, new String[] {"InOutEmprCod","InOutCliCod","InOutForSer","InOutForColNom","InOutForColNum","InOutTipColCod","InoutForNomcli","InoutFornumcli","InoutFortonal"}) +"\">") ;
      app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal FormNoBackgroundColor", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75Pgmname, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WpCnColores");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wpcncolores:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vVAR_FORSER", GXutil.rtrim( AV68Var_Forser));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_32", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_32, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV50GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV51GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV48DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV24OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV25OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSERDSC", GXutil.rtrim( AV59TFForSerDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORSERDSC_SEL", GXutil.rtrim( AV60TFForSerDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNOM", GXutil.rtrim( AV61TFForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNOM_SEL", GXutil.rtrim( AV62TFForColNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV63TFForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCOLNUM_TO", GXutil.ltrim( localUtil.ntoc( AV64TFForColNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV75Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORTONAL", GXutil.rtrim( AV66InoutFortonal));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORNUMCLI", GXutil.ltrim( localUtil.ntoc( AV54InoutFornumcli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORNOMCLI", GXutil.rtrim( AV53InoutForNomcli));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORSER", GXutil.rtrim( AV16InOutForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTCLICOD", GXutil.ltrim( localUtil.ntoc( AV55InOutCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTEMPRCOD", GXutil.rtrim( AV69InOutEmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORCOLNOM", GXutil.rtrim( AV17InOutForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV18InOutForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vINOUTTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV19InOutTipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
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
         app.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal FormNoBackgroundColor" : Form.getThemeClass())+"-fx");
         httpContext.writeText( ">") ;
         we11G2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt11G2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.wpcncolores", new String[] {GXutil.URLEncode(GXutil.rtrim(AV69InOutEmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV55InOutCliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV16InOutForSer)),GXutil.URLEncode(GXutil.rtrim(AV17InOutForColNom)),GXutil.URLEncode(GXutil.ltrimstr(AV18InOutForColNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV19InOutTipColCod,2,0)),GXutil.URLEncode(GXutil.rtrim(AV53InoutForNomcli)),GXutil.URLEncode(GXutil.ltrimstr(AV54InoutFornumcli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV66InoutFortonal))}, new String[] {"InOutEmprCod","InOutCliCod","InOutForSer","InOutForColNom","InOutForColNum","InOutTipColCod","InoutForNomcli","InoutFornumcli","InoutFortonal"})  ;
   }

   public String getPgmname( )
   {
      return "WpCnColores" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Seleccion Colores", "") ;
   }

   public void wb11G0( )
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
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", "", "false");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainPrompt", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginPrompt", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavInclicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavInclicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavInclicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV15InCliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavInclicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15InCliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15InCliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,16);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavInclicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavInclicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WpCnColores.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVar_forser_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVar_forser_Internalname, httpContext.getMessage( "Articulo", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'',false,'" + sGXsfl_32_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVar_forser_Internalname, GXutil.rtrim( AV68Var_Forser), GXutil.rtrim( localUtil.format( AV68Var_Forser, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,20);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVar_forser_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVar_forser_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WpCnColores.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablefilters_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginPrompt GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol32( ) ;
      }
      if ( wbEnd == 32 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_32 = (int)(nGXsfl_32_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV50GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV51GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV48DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtEmprCod_Internalname, GXutil.rtrim( A396EmprCod), GXutil.rtrim( localUtil.format( A396EmprCod, "@!")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtEmprCod_Jsonclick, 0, "Attribute", "", "", "", "", edtEmprCod_Visible, 0, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WpCnColores.htm");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "Attribute", "", "", "", "", edtCliCod_Visible, 0, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WpCnColores.htm");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 32 )
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

   public void start11G2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Seleccion Colores", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup11G0( ) ;
   }

   public void ws11G2( )
   {
      start11G2( ) ;
      evt11G2( ) ;
   }

   public void evt11G2( )
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
                           e1111G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1211G2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1311G2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) )
                        {
                           nGXsfl_32_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_322( ) ;
                           AV52Select = httpContext.cgiGet( edtavSelect_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV52Select);
                           A494ForSer = httpContext.cgiGet( edtForSer_Internalname) ;
                           A5742ForSerDsc = httpContext.cgiGet( edtForSerDsc_Internalname) ;
                           n5742ForSerDsc = false ;
                           A482ForColNom = httpContext.cgiGet( edtForColNom_Internalname) ;
                           A483ForColNum = (int)(localUtil.ctol( httpContext.cgiGet( edtForColNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A831TipColCod = (byte)(localUtil.ctol( httpContext.cgiGet( edtTipColCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A1191ForNomCli = httpContext.cgiGet( edtForNomCli_Internalname) ;
                           n1191ForNomCli = false ;
                           A1192ForNumCli = (int)(localUtil.ctol( httpContext.cgiGet( edtForNumCli_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           n1192ForNumCli = false ;
                           A12130ForPanto = httpContext.cgiGet( edtForPanto_Internalname) ;
                           n12130ForPanto = false ;
                           A995ForTonal = httpContext.cgiGet( edtForTonal_Internalname) ;
                           n995ForTonal = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e1411G2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1511G2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1611G2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Var_forser Changed */
                                    if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vVAR_FORSER"), AV68Var_Forser) != 0 )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                       /* Execute user event: Enter */
                                       e1711G2 ();
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

   public void we11G2( )
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

   public void pa11G2( )
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
            GX_FocusControl = edtavInclicod_Internalname ;
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
      subsflControlProps_322( ) ;
      while ( nGXsfl_32_idx <= nRC_GXsfl_32 )
      {
         sendrow_322( ) ;
         nGXsfl_32_idx = ((subGrid_Islastpage==1)&&(nGXsfl_32_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_322( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV68Var_Forser ,
                                 short AV24OrderedBy ,
                                 boolean AV25OrderedDsc ,
                                 String AV59TFForSerDsc ,
                                 String AV60TFForSerDsc_Sel ,
                                 String AV61TFForColNom ,
                                 String AV62TFForColNom_Sel ,
                                 int AV63TFForColNum ,
                                 int AV64TFForColNum_To ,
                                 String AV75Pgmname ,
                                 String A396EmprCod ,
                                 int A252CliCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1511G2 ();
      GRID_nCurrentRecord = 0 ;
      rf11G2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"WpCnColores");
      forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
      forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wpcncolores:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORSER", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A494ForSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORSER", GXutil.rtrim( A494ForSer));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORCOLNOM", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A482ForColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCOLNOM", GXutil.rtrim( A482ForColNom));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORCOLNUM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORCOLNUM", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPCOLCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "TIPCOLCOD", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORNOMCLI", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A1191ForNomCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORNOMCLI", GXutil.rtrim( A1191ForNomCli));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORNUMCLI", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "FORNUMCLI", GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORTONAL", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A995ForTonal, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "FORTONAL", GXutil.rtrim( A995ForTonal));
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
      rf11G2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV75Pgmname = "WpCnColores" ;
      Gx_err = (short)(0) ;
      edtavInclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInclicod_Enabled), 5, 0), true);
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_32_Refreshing);
   }

   public void rf11G2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(32) ;
      /* Execute user event: Refresh */
      e1511G2 ();
      nGXsfl_32_idx = 1 ;
      sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_322( ) ;
      bGXsfl_32_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_322( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV60TFForSerDsc_Sel ,
                                              AV59TFForSerDsc ,
                                              AV62TFForColNom_Sel ,
                                              AV61TFForColNom ,
                                              Integer.valueOf(AV63TFForColNum) ,
                                              Integer.valueOf(AV64TFForColNum_To) ,
                                              AV68Var_Forser ,
                                              A5742ForSerDsc ,
                                              A482ForColNom ,
                                              Integer.valueOf(A483ForColNum) ,
                                              A494ForSer ,
                                              Short.valueOf(AV24OrderedBy) ,
                                              Boolean.valueOf(AV25OrderedDsc) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                              }
         });
         lV59TFForSerDsc = GXutil.padr( GXutil.rtrim( AV59TFForSerDsc), 26, "%") ;
         lV61TFForColNom = GXutil.padr( GXutil.rtrim( AV61TFForColNom), 13, "%") ;
         /* Using cursor H011G2 */
         pr_default.execute(0, new Object[] {lV59TFForSerDsc, AV60TFForSerDsc_Sel, lV61TFForColNom, AV62TFForColNom_Sel, Integer.valueOf(AV63TFForColNum), Integer.valueOf(AV64TFForColNum_To), AV68Var_Forser, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_32_idx = 1 ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_322( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H011G2_A396EmprCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            A252CliCod = H011G2_A252CliCod[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
            A995ForTonal = H011G2_A995ForTonal[0] ;
            n995ForTonal = H011G2_n995ForTonal[0] ;
            A12130ForPanto = H011G2_A12130ForPanto[0] ;
            n12130ForPanto = H011G2_n12130ForPanto[0] ;
            A1192ForNumCli = H011G2_A1192ForNumCli[0] ;
            n1192ForNumCli = H011G2_n1192ForNumCli[0] ;
            A1191ForNomCli = H011G2_A1191ForNomCli[0] ;
            n1191ForNomCli = H011G2_n1191ForNomCli[0] ;
            A831TipColCod = H011G2_A831TipColCod[0] ;
            A483ForColNum = H011G2_A483ForColNum[0] ;
            A482ForColNom = H011G2_A482ForColNom[0] ;
            A5742ForSerDsc = H011G2_A5742ForSerDsc[0] ;
            n5742ForSerDsc = H011G2_n5742ForSerDsc[0] ;
            A494ForSer = H011G2_A494ForSer[0] ;
            e1611G2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(32) ;
         wb11G0( ) ;
      }
      bGXsfl_32_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes11G2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV75Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV75Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORSER"+"_"+sGXsfl_32_idx, getSecureSignedToken( sGXsfl_32_idx, GXutil.rtrim( localUtil.format( A494ForSer, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORCOLNOM"+"_"+sGXsfl_32_idx, getSecureSignedToken( sGXsfl_32_idx, GXutil.rtrim( localUtil.format( A482ForColNom, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORCOLNUM"+"_"+sGXsfl_32_idx, getSecureSignedToken( sGXsfl_32_idx, localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_TIPCOLCOD"+"_"+sGXsfl_32_idx, getSecureSignedToken( sGXsfl_32_idx, localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORNOMCLI"+"_"+sGXsfl_32_idx, getSecureSignedToken( sGXsfl_32_idx, GXutil.rtrim( localUtil.format( A1191ForNomCli, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORNUMCLI"+"_"+sGXsfl_32_idx, getSecureSignedToken( sGXsfl_32_idx, localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_FORTONAL"+"_"+sGXsfl_32_idx, getSecureSignedToken( sGXsfl_32_idx, GXutil.rtrim( localUtil.format( A995ForTonal, ""))));
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
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV60TFForSerDsc_Sel ,
                                           AV59TFForSerDsc ,
                                           AV62TFForColNom_Sel ,
                                           AV61TFForColNom ,
                                           Integer.valueOf(AV63TFForColNum) ,
                                           Integer.valueOf(AV64TFForColNum_To) ,
                                           AV68Var_Forser ,
                                           A5742ForSerDsc ,
                                           A482ForColNom ,
                                           Integer.valueOf(A483ForColNum) ,
                                           A494ForSer ,
                                           Short.valueOf(AV24OrderedBy) ,
                                           Boolean.valueOf(AV25OrderedDsc) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN
                                           }
      });
      lV59TFForSerDsc = GXutil.padr( GXutil.rtrim( AV59TFForSerDsc), 26, "%") ;
      lV61TFForColNom = GXutil.padr( GXutil.rtrim( AV61TFForColNom), 13, "%") ;
      /* Using cursor H011G3 */
      pr_default.execute(1, new Object[] {lV59TFForSerDsc, AV60TFForSerDsc_Sel, lV61TFForColNom, AV62TFForColNom_Sel, Integer.valueOf(AV63TFForColNum), Integer.valueOf(AV64TFForColNum_To), AV68Var_Forser});
      GRID_nRecordCount = H011G3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV68Var_Forser, AV24OrderedBy, AV25OrderedDsc, AV59TFForSerDsc, AV60TFForSerDsc_Sel, AV61TFForColNom, AV62TFForColNom_Sel, AV63TFForColNum, AV64TFForColNum_To, AV75Pgmname, A396EmprCod, A252CliCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV68Var_Forser, AV24OrderedBy, AV25OrderedDsc, AV59TFForSerDsc, AV60TFForSerDsc_Sel, AV61TFForColNom, AV62TFForColNom_Sel, AV63TFForColNum, AV64TFForColNum_To, AV75Pgmname, A396EmprCod, A252CliCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV68Var_Forser, AV24OrderedBy, AV25OrderedDsc, AV59TFForSerDsc, AV60TFForSerDsc_Sel, AV61TFForColNom, AV62TFForColNom_Sel, AV63TFForColNum, AV64TFForColNum_To, AV75Pgmname, A396EmprCod, A252CliCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV68Var_Forser, AV24OrderedBy, AV25OrderedDsc, AV59TFForSerDsc, AV60TFForSerDsc_Sel, AV61TFForColNom, AV62TFForColNom_Sel, AV63TFForColNum, AV64TFForColNum_To, AV75Pgmname, A396EmprCod, A252CliCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV68Var_Forser, AV24OrderedBy, AV25OrderedDsc, AV59TFForSerDsc, AV60TFForSerDsc_Sel, AV61TFForColNom, AV62TFForColNom_Sel, AV63TFForColNum, AV64TFForColNum_To, AV75Pgmname, A396EmprCod, A252CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV75Pgmname = "WpCnColores" ;
      Gx_err = (short)(0) ;
      edtavInclicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavInclicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavInclicod_Enabled), 5, 0), true);
      edtavSelect_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSelect_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSelect_Enabled), 5, 0), !bGXsfl_32_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup11G0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1411G2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV48DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_32 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_32"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV50GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV51GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavInclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavInclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINCLICOD");
            GX_FocusControl = edtavInclicod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15InCliCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15InCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15InCliCod), 6, 0));
         }
         else
         {
            AV15InCliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavInclicod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15InCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15InCliCod), 6, 0));
         }
         AV68Var_Forser = httpContext.cgiGet( edtavVar_forser_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68Var_Forser", AV68Var_Forser);
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"WpCnColores");
         A396EmprCod = httpContext.cgiGet( edtEmprCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         forbiddenHiddens.add("EmprCod", GXutil.rtrim( localUtil.format( A396EmprCod, "@!")));
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         forbiddenHiddens.add("CliCod", localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wpcncolores:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( "GXH_vVAR_FORSER"), AV68Var_Forser) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
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
      e1411G2 ();
      if (returnInSub) return;
   }

   public void e1411G2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV68Var_Forser = AV16InOutForSer ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68Var_Forser", AV68Var_Forser);
      GXt_char1 = AV72Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wpcncolores_impl.this.GXt_char1 = GXv_char2[0] ;
      AV72Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV73Emprnom ;
      GXv_char4[0] = AV74Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV72Station, GXv_char2, GXv_char3, GXv_char4) ;
      wpcncolores_impl.this.AV5Emprcod = GXv_char2[0] ;
      wpcncolores_impl.this.AV73Emprnom = GXv_char3[0] ;
      wpcncolores_impl.this.AV74Usurcod = GXv_char4[0] ;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Seleccion Colores", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      edtEmprCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtEmprCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtEmprCod_Visible), 5, 0), true);
      edtCliCod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtCliCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtCliCod_Visible), 5, 0), true);
      if ( AV24OrderedBy < 1 )
      {
         AV24OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV48DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV48DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      if ( GXutil.strcmp(AV67WebSession.getValue("DisArtCod"), "") != 0 )
      {
         AV56FilterFullText = AV67WebSession.getValue("DisArtCod") ;
         AV67WebSession.remove("DisArtCod");
      }
   }

   public void e1511G2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV13WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV13WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      AV50GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV50GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50GridCurrentPage), 10, 0));
      AV51GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   public void e1111G2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         subgrid_nextpage( ) ;
      }
      else
      {
         AV49PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV49PageToGo) ;
      }
   }

   public void e1211G2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1311G2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV24OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24OrderedBy), 4, 0));
         AV25OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25OrderedDsc", AV25OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S112 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForSerDsc") == 0 )
         {
            AV59TFForSerDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV59TFForSerDsc", AV59TFForSerDsc);
            AV60TFForSerDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFForSerDsc_Sel", AV60TFForSerDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNom") == 0 )
         {
            AV61TFForColNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFForColNom", AV61TFForColNom);
            AV62TFForColNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV62TFForColNom_Sel", AV62TFForColNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForColNum") == 0 )
         {
            AV63TFForColNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63TFForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFForColNum), 6, 0));
            AV64TFForColNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV64TFForColNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFForColNum_To), 6, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e1611G2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV52Select = "<i class=\"fas fa-check\"></i>" ;
      httpContext.ajax_rsp_assign_attri("", false, edtavSelect_Internalname, AV52Select);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(32) ;
      }
      sendrow_322( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_32_Refreshing )
      {
         httpContext.doAjaxLoad(32, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1711G2 ();
      if (returnInSub) return;
   }

   public void e1711G2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      if ( 0 == 1 )
      {
         AV69InOutEmprCod = A396EmprCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV69InOutEmprCod", AV69InOutEmprCod);
         AV55InOutCliCod = A252CliCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55InOutCliCod), 6, 0));
         AV16InOutForSer = A494ForSer ;
         httpContext.ajax_rsp_assign_attri("", false, "AV16InOutForSer", AV16InOutForSer);
         AV17InOutForColNom = A482ForColNom ;
         httpContext.ajax_rsp_assign_attri("", false, "AV17InOutForColNom", AV17InOutForColNom);
         AV18InOutForColNum = A483ForColNum ;
         httpContext.ajax_rsp_assign_attri("", false, "AV18InOutForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18InOutForColNum), 6, 0));
         AV19InOutTipColCod = A831TipColCod ;
         httpContext.ajax_rsp_assign_attri("", false, "AV19InOutTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19InOutTipColCod), 2, 0));
         httpContext.setWebReturnParms(new Object[] {AV69InOutEmprCod,Integer.valueOf(AV55InOutCliCod),AV16InOutForSer,AV17InOutForColNom,Integer.valueOf(AV18InOutForColNum),Byte.valueOf(AV19InOutTipColCod),AV53InoutForNomcli,Integer.valueOf(AV54InoutFornumcli),AV66InoutFortonal});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV69InOutEmprCod","AV55InOutCliCod","AV16InOutForSer","AV17InOutForColNom","AV18InOutForColNum","AV19InOutTipColCod","AV53InoutForNomcli","AV54InoutFornumcli","AV66InoutFortonal"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      AV17InOutForColNom = A482ForColNom ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17InOutForColNom", AV17InOutForColNom);
      AV18InOutForColNum = A483ForColNum ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18InOutForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18InOutForColNum), 6, 0));
      AV19InOutTipColCod = A831TipColCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19InOutTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19InOutTipColCod), 2, 0));
      AV53InoutForNomcli = A1191ForNomCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53InoutForNomcli", AV53InoutForNomcli);
      AV54InoutFornumcli = A1192ForNumCli ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54InoutFornumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54InoutFornumcli), 6, 0));
      AV66InoutFortonal = A995ForTonal ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66InoutFortonal", AV66InoutFortonal);
      httpContext.setWebReturnParms(new Object[] {AV69InOutEmprCod,Integer.valueOf(AV55InOutCliCod),AV16InOutForSer,AV17InOutForColNom,Integer.valueOf(AV18InOutForColNum),Byte.valueOf(AV19InOutTipColCod),AV53InoutForNomcli,Integer.valueOf(AV54InoutFornumcli),AV66InoutFortonal});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV69InOutEmprCod","AV55InOutCliCod","AV16InOutForSer","AV17InOutForColNom","AV18InOutForColNum","AV19InOutTipColCod","AV53InoutForNomcli","AV54InoutFornumcli","AV66InoutFortonal"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV24OrderedBy, 4, 0))+":"+(AV25OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV22GridState = (app.wwpbaseobjects.SdtWWPGridState)new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridState.setgxTv_SdtWWPGridState_Orderedby( AV24OrderedBy );
      AV22GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV25OrderedDsc );
      AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState8[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFFORSERDSC", "", !(GXutil.strcmp("", AV59TFForSerDsc)==0), (short)(0), AV59TFForSerDsc, "", !(GXutil.strcmp("", AV60TFForSerDsc_Sel)==0), AV60TFForSerDsc_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFFORCOLNOM", "", !(GXutil.strcmp("", AV61TFForColNom)==0), (short)(0), AV61TFForColNom, "", !(GXutil.strcmp("", AV62TFForColNom_Sel)==0), AV62TFForColNom_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState8[0] ;
      GXv_SdtWWPGridState8[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState8, "TFFORCOLNUM", "", !((0==AV63TFForColNum)&&(0==AV64TFForColNum_To)), (short)(0), GXutil.trim( GXutil.str( AV63TFForColNum, 6, 0)), GXutil.trim( GXutil.str( AV64TFForColNum_To, 6, 0))) ;
      AV22GridState = GXv_SdtWWPGridState8[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV75Pgmname+"GridState", AV22GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV69InOutEmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV69InOutEmprCod", AV69InOutEmprCod);
      AV55InOutCliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55InOutCliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55InOutCliCod), 6, 0));
      AV16InOutForSer = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16InOutForSer", AV16InOutForSer);
      AV17InOutForColNom = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17InOutForColNom", AV17InOutForColNom);
      AV18InOutForColNum = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18InOutForColNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18InOutForColNum), 6, 0));
      AV19InOutTipColCod = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19InOutTipColCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19InOutTipColCod), 2, 0));
      AV53InoutForNomcli = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53InoutForNomcli", AV53InoutForNomcli);
      AV54InoutFornumcli = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54InoutFornumcli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54InoutFornumcli), 6, 0));
      AV66InoutFortonal = (String)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66InoutFortonal", AV66InoutFortonal);
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
      pa11G2( ) ;
      ws11G2( ) ;
      we11G2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211613627", true, true);
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
      httpContext.AddJavascriptSource("wpcncolores.js", "?20268211613628", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_322( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_32_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_32_idx ;
      edtForSerDsc_Internalname = "FORSERDSC_"+sGXsfl_32_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_32_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_32_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_32_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_32_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_32_idx ;
      edtForPanto_Internalname = "FORPANTO_"+sGXsfl_32_idx ;
      edtForTonal_Internalname = "FORTONAL_"+sGXsfl_32_idx ;
   }

   public void subsflControlProps_fel_322( )
   {
      edtavSelect_Internalname = "vSELECT_"+sGXsfl_32_fel_idx ;
      edtForSer_Internalname = "FORSER_"+sGXsfl_32_fel_idx ;
      edtForSerDsc_Internalname = "FORSERDSC_"+sGXsfl_32_fel_idx ;
      edtForColNom_Internalname = "FORCOLNOM_"+sGXsfl_32_fel_idx ;
      edtForColNum_Internalname = "FORCOLNUM_"+sGXsfl_32_fel_idx ;
      edtTipColCod_Internalname = "TIPCOLCOD_"+sGXsfl_32_fel_idx ;
      edtForNomCli_Internalname = "FORNOMCLI_"+sGXsfl_32_fel_idx ;
      edtForNumCli_Internalname = "FORNUMCLI_"+sGXsfl_32_fel_idx ;
      edtForPanto_Internalname = "FORPANTO_"+sGXsfl_32_fel_idx ;
      edtForTonal_Internalname = "FORTONAL_"+sGXsfl_32_fel_idx ;
   }

   public void sendrow_322( )
   {
      subsflControlProps_322( ) ;
      wb11G0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_32_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_32_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_32_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 33,'',false,'"+sGXsfl_32_idx+"',32)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSelect_Internalname,GXutil.rtrim( AV52Select),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavSelect_Enabled!=0)&&(edtavSelect_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,33);\"" : " "),"'"+""+"'"+",false,"+"'"+"EENTER."+sGXsfl_32_idx+"'","","",httpContext.getMessage( "GX_BtnSelect", ""),"",edtavSelect_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSelect_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSer_Internalname,GXutil.rtrim( A494ForSer),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForSerDsc_Internalname,GXutil.rtrim( A5742ForSerDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForSerDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNom_Internalname,GXutil.rtrim( A482ForColNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForColNum_Internalname,GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A483ForColNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForColNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtTipColCod_Internalname,GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A831TipColCod), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtTipColCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNomCli_Internalname,GXutil.rtrim( A1191ForNomCli),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNomCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForNumCli_Internalname,GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1192ForNumCli), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForNumCli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPanto_Internalname,GXutil.rtrim( A12130ForPanto),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPanto_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForTonal_Internalname,GXutil.rtrim( A995ForTonal),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForTonal_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(32),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes11G2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_32_idx = ((subGrid_Islastpage==1)&&(nGXsfl_32_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_32_idx+1) ;
         sGXsfl_32_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_32_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_322( ) ;
      }
      /* End function sendrow_322 */
   }

   public void startgridcontrol32( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"32\">") ;
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
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cli", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Numero", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pantone", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coleccion", "")) ;
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
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV52Select));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSelect_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A494ForSer));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A5742ForSerDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A482ForColNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A483ForColNum, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A831TipColCod, (byte)(2), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A1191ForNomCli));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A1192ForNumCli, (byte)(6), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A12130ForPanto));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A995ForTonal));
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
      edtavInclicod_Internalname = "vINCLICOD" ;
      edtavVar_forser_Internalname = "vVAR_FORSER" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divTablefilters_Internalname = "TABLEFILTERS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      edtavSelect_Internalname = "vSELECT" ;
      edtForSer_Internalname = "FORSER" ;
      edtForSerDsc_Internalname = "FORSERDSC" ;
      edtForColNom_Internalname = "FORCOLNOM" ;
      edtForColNum_Internalname = "FORCOLNUM" ;
      edtTipColCod_Internalname = "TIPCOLCOD" ;
      edtForNomCli_Internalname = "FORNOMCLI" ;
      edtForNumCli_Internalname = "FORNUMCLI" ;
      edtForPanto_Internalname = "FORPANTO" ;
      edtForTonal_Internalname = "FORTONAL" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtCliCod_Internalname = "CLICOD" ;
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
      edtForTonal_Jsonclick = "" ;
      edtForPanto_Jsonclick = "" ;
      edtForNumCli_Jsonclick = "" ;
      edtForNomCli_Jsonclick = "" ;
      edtTipColCod_Jsonclick = "" ;
      edtForColNum_Jsonclick = "" ;
      edtForColNom_Jsonclick = "" ;
      edtForSerDsc_Jsonclick = "" ;
      edtForSer_Jsonclick = "" ;
      edtavSelect_Jsonclick = "" ;
      edtavSelect_Visible = -1 ;
      edtavSelect_Enabled = 1 ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Visible = 1 ;
      edtEmprCod_Jsonclick = "" ;
      edtEmprCod_Visible = 1 ;
      edtavVar_forser_Jsonclick = "" ;
      edtavVar_forser_Enabled = 1 ;
      edtavInclicod_Jsonclick = "" ;
      edtavInclicod_Enabled = 1 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_grid_Datalistproc = "WpCnColoresGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||||||" ;
      Ddo_grid_Includedatalist = "T|T||||||" ;
      Ddo_grid_Filterisrange = "||T|||||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|||||" ;
      Ddo_grid_Includefilter = "T|T|T|||||" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8|9" ;
      Ddo_grid_Columnids = "2:ForSerDsc|3:ForColNom|4:ForColNum|5:TipColCod|6:ForNomCli|7:ForNumCli|8:ForPanto|9:ForTonal" ;
      Ddo_grid_Gridinternalname = "" ;
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
      Dvpanel_unnamedtable1_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Seleccion Colores", "") );
      subGrid_Rows = 0 ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV68Var_Forser',fld:'vVAR_FORSER',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV60TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV61TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV62TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV63TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV64TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV50GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV51GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1111G2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV68Var_Forser',fld:'vVAR_FORSER',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV60TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV61TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV62TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV63TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV64TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1211G2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV68Var_Forser',fld:'vVAR_FORSER',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV60TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV61TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV62TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV63TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV64TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1311G2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV68Var_Forser',fld:'vVAR_FORSER',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV60TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV61TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV62TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV63TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV64TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'AV75Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59TFForSerDsc',fld:'vTFFORSERDSC',pic:''},{av:'AV60TFForSerDsc_Sel',fld:'vTFFORSERDSC_SEL',pic:''},{av:'AV61TFForColNom',fld:'vTFFORCOLNOM',pic:''},{av:'AV62TFForColNom_Sel',fld:'vTFFORCOLNOM_SEL',pic:''},{av:'AV63TFForColNum',fld:'vTFFORCOLNUM',pic:'ZZZZZ9'},{av:'AV64TFForColNum_To',fld:'vTFFORCOLNUM_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1611G2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV52Select',fld:'vSELECT',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e1711G2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A252CliCod',fld:'CLICOD',pic:'ZZZZZ9'},{av:'A494ForSer',fld:'FORSER',pic:'',hsh:true},{av:'A482ForColNom',fld:'FORCOLNOM',pic:'',hsh:true},{av:'A483ForColNum',fld:'FORCOLNUM',pic:'ZZZZZ9',hsh:true},{av:'A831TipColCod',fld:'TIPCOLCOD',pic:'Z9',hsh:true},{av:'AV66InoutFortonal',fld:'vINOUTFORTONAL',pic:''},{av:'AV54InoutFornumcli',fld:'vINOUTFORNUMCLI',pic:'ZZZZZ9'},{av:'AV53InoutForNomcli',fld:'vINOUTFORNOMCLI',pic:''},{av:'A1191ForNomCli',fld:'FORNOMCLI',pic:'',hsh:true},{av:'A1192ForNumCli',fld:'FORNUMCLI',pic:'ZZZZZ9',hsh:true},{av:'A995ForTonal',fld:'FORTONAL',pic:'',hsh:true},{av:'AV16InOutForSer',fld:'vINOUTFORSER',pic:''},{av:'AV55InOutCliCod',fld:'vINOUTCLICOD',pic:'ZZZZZ9'},{av:'AV69InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV69InOutEmprCod',fld:'vINOUTEMPRCOD',pic:'@!'},{av:'AV55InOutCliCod',fld:'vINOUTCLICOD',pic:'ZZZZZ9'},{av:'AV16InOutForSer',fld:'vINOUTFORSER',pic:''},{av:'AV17InOutForColNom',fld:'vINOUTFORCOLNOM',pic:''},{av:'AV18InOutForColNum',fld:'vINOUTFORCOLNUM',pic:'ZZZZZ9'},{av:'AV19InOutTipColCod',fld:'vINOUTTIPCOLCOD',pic:'Z9'},{av:'AV53InoutForNomcli',fld:'vINOUTFORNOMCLI',pic:''},{av:'AV54InoutFornumcli',fld:'vINOUTFORNUMCLI',pic:'ZZZZZ9'},{av:'AV66InoutFortonal',fld:'vINOUTFORTONAL',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Fortonal',iparms:[]");
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
      wcpOAV69InOutEmprCod = "" ;
      wcpOAV16InOutForSer = "" ;
      wcpOAV17InOutForColNom = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV69InOutEmprCod = "" ;
      AV16InOutForSer = "" ;
      AV17InOutForColNom = "" ;
      AV53InoutForNomcli = "" ;
      AV66InoutFortonal = "" ;
      AV68Var_Forser = "" ;
      AV59TFForSerDsc = "" ;
      AV60TFForSerDsc_Sel = "" ;
      AV61TFForColNom = "" ;
      AV62TFForColNom_Sel = "" ;
      AV75Pgmname = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV48DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV52Select = "" ;
      A494ForSer = "" ;
      A5742ForSerDsc = "" ;
      A482ForColNom = "" ;
      A1191ForNomCli = "" ;
      A12130ForPanto = "" ;
      A995ForTonal = "" ;
      scmdbuf = "" ;
      lV59TFForSerDsc = "" ;
      lV61TFForColNom = "" ;
      H011G2_A396EmprCod = new String[] {""} ;
      H011G2_A252CliCod = new int[1] ;
      H011G2_A995ForTonal = new String[] {""} ;
      H011G2_n995ForTonal = new boolean[] {false} ;
      H011G2_A12130ForPanto = new String[] {""} ;
      H011G2_n12130ForPanto = new boolean[] {false} ;
      H011G2_A1192ForNumCli = new int[1] ;
      H011G2_n1192ForNumCli = new boolean[] {false} ;
      H011G2_A1191ForNomCli = new String[] {""} ;
      H011G2_n1191ForNomCli = new boolean[] {false} ;
      H011G2_A831TipColCod = new byte[1] ;
      H011G2_A483ForColNum = new int[1] ;
      H011G2_A482ForColNom = new String[] {""} ;
      H011G2_A5742ForSerDsc = new String[] {""} ;
      H011G2_n5742ForSerDsc = new boolean[] {false} ;
      H011G2_A494ForSer = new String[] {""} ;
      H011G3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV72Station = "" ;
      GXt_char1 = "" ;
      AV5Emprcod = "" ;
      GXv_char2 = new String[1] ;
      AV73Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV74Usurcod = "" ;
      GXv_char4 = new String[1] ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV67WebSession = httpContext.getWebSession();
      AV56FilterFullText = "" ;
      AV13WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      GXv_SdtWWPGridState8 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wpcncolores__default(),
         new Object[] {
             new Object[] {
            H011G2_A396EmprCod, H011G2_A252CliCod, H011G2_A995ForTonal, H011G2_n995ForTonal, H011G2_A12130ForPanto, H011G2_n12130ForPanto, H011G2_A1192ForNumCli, H011G2_n1192ForNumCli, H011G2_A1191ForNomCli, H011G2_n1191ForNomCli,
            H011G2_A831TipColCod, H011G2_A483ForColNum, H011G2_A482ForColNom, H011G2_A5742ForSerDsc, H011G2_n5742ForSerDsc, H011G2_A494ForSer
            }
            , new Object[] {
            H011G3_AGRID_nRecordCount
            }
         }
      );
      AV75Pgmname = "WpCnColores" ;
      /* GeneXus formulas. */
      AV75Pgmname = "WpCnColores" ;
      Gx_err = (short)(0) ;
      edtavInclicod_Enabled = 0 ;
      edtavSelect_Enabled = 0 ;
   }

   private byte wcpOAV19InOutTipColCod ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV19InOutTipColCod ;
   private byte gxajaxcallmode ;
   private byte A831TipColCod ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV24OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV55InOutCliCod ;
   private int wcpOAV18InOutForColNum ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_32 ;
   private int subGrid_Rows ;
   private int AV55InOutCliCod ;
   private int AV18InOutForColNum ;
   private int AV54InoutFornumcli ;
   private int nGXsfl_32_idx=1 ;
   private int AV63TFForColNum ;
   private int AV64TFForColNum_To ;
   private int A252CliCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int AV15InCliCod ;
   private int edtavInclicod_Enabled ;
   private int edtavVar_forser_Enabled ;
   private int edtEmprCod_Visible ;
   private int edtCliCod_Visible ;
   private int A483ForColNum ;
   private int A1192ForNumCli ;
   private int subGrid_Islastpage ;
   private int edtavSelect_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV49PageToGo ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavSelect_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV50GridCurrentPage ;
   private long AV51GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV69InOutEmprCod ;
   private String wcpOAV16InOutForSer ;
   private String wcpOAV17InOutForColNom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV69InOutEmprCod ;
   private String AV16InOutForSer ;
   private String AV17InOutForColNom ;
   private String AV53InoutForNomcli ;
   private String AV66InoutFortonal ;
   private String sGXsfl_32_idx="0001" ;
   private String AV68Var_Forser ;
   private String AV59TFForSerDsc ;
   private String AV60TFForSerDsc_Sel ;
   private String AV61TFForColNom ;
   private String AV62TFForColNom_Sel ;
   private String AV75Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
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
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String edtavInclicod_Internalname ;
   private String TempTags ;
   private String edtavInclicod_Jsonclick ;
   private String edtavVar_forser_Internalname ;
   private String edtavVar_forser_Jsonclick ;
   private String divTableheader_Internalname ;
   private String divTablefilters_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String edtEmprCod_Internalname ;
   private String edtEmprCod_Jsonclick ;
   private String edtCliCod_Internalname ;
   private String edtCliCod_Jsonclick ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV52Select ;
   private String edtavSelect_Internalname ;
   private String A494ForSer ;
   private String edtForSer_Internalname ;
   private String A5742ForSerDsc ;
   private String edtForSerDsc_Internalname ;
   private String A482ForColNom ;
   private String edtForColNom_Internalname ;
   private String edtForColNum_Internalname ;
   private String edtTipColCod_Internalname ;
   private String A1191ForNomCli ;
   private String edtForNomCli_Internalname ;
   private String edtForNumCli_Internalname ;
   private String A12130ForPanto ;
   private String edtForPanto_Internalname ;
   private String A995ForTonal ;
   private String edtForTonal_Internalname ;
   private String scmdbuf ;
   private String lV59TFForSerDsc ;
   private String lV61TFForColNom ;
   private String hsh ;
   private String AV72Station ;
   private String GXt_char1 ;
   private String AV5Emprcod ;
   private String GXv_char2[] ;
   private String AV73Emprnom ;
   private String GXv_char3[] ;
   private String AV74Usurcod ;
   private String GXv_char4[] ;
   private String sGXsfl_32_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavSelect_Jsonclick ;
   private String edtForSer_Jsonclick ;
   private String edtForSerDsc_Jsonclick ;
   private String edtForColNom_Jsonclick ;
   private String edtForColNum_Jsonclick ;
   private String edtTipColCod_Jsonclick ;
   private String edtForNomCli_Jsonclick ;
   private String edtForNumCli_Jsonclick ;
   private String edtForPanto_Jsonclick ;
   private String edtForTonal_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV25OrderedDsc ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n5742ForSerDsc ;
   private boolean n1191ForNomCli ;
   private boolean n1192ForNumCli ;
   private boolean n12130ForPanto ;
   private boolean n995ForTonal ;
   private boolean bGXsfl_32_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV56FilterFullText ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV67WebSession ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H011G2_A396EmprCod ;
   private int[] H011G2_A252CliCod ;
   private String[] H011G2_A995ForTonal ;
   private boolean[] H011G2_n995ForTonal ;
   private String[] H011G2_A12130ForPanto ;
   private boolean[] H011G2_n12130ForPanto ;
   private int[] H011G2_A1192ForNumCli ;
   private boolean[] H011G2_n1192ForNumCli ;
   private String[] H011G2_A1191ForNomCli ;
   private boolean[] H011G2_n1191ForNomCli ;
   private byte[] H011G2_A831TipColCod ;
   private int[] H011G2_A483ForColNum ;
   private String[] H011G2_A482ForColNom ;
   private String[] H011G2_A5742ForSerDsc ;
   private boolean[] H011G2_n5742ForSerDsc ;
   private String[] H011G2_A494ForSer ;
   private long[] H011G3_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV48DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState8[] ;
   private app.wwpbaseobjects.SdtWWPContext AV13WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class wpcncolores__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H011G2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60TFForSerDsc_Sel ,
                                          String AV59TFForSerDsc ,
                                          String AV62TFForColNom_Sel ,
                                          String AV61TFForColNom ,
                                          int AV63TFForColNum ,
                                          int AV64TFForColNum_To ,
                                          String AV68Var_Forser ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A494ForSer ,
                                          short AV24OrderedBy ,
                                          boolean AV25OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int9 = new byte[12];
      Object[] GXv_Object10 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, CliCod, ForTonal, ForPanto, ForNumCli, ForNomCli, TipColCod, ForColNum, ForColNom, ForSerDsc, ForSer" ;
      sFromString = " FROM TXPCFORMU" ;
      sOrderString = "" ;
      if ( (GXutil.strcmp("", AV60TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(ForSerDsc = ?)");
      }
      else
      {
         GXv_int9[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int9[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int9[3] = (byte)(1) ;
      }
      if ( ! (0==AV63TFForColNum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int9[4] = (byte)(1) ;
      }
      if ( ! (0==AV64TFForColNum_To) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int9[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Var_Forser)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int9[6] = (byte)(1) ;
      }
      if ( AV24OrderedBy == 1 )
      {
         sOrderString += " ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY ForSerDsc" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForSerDsc DESC" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY ForColNom" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForColNom DESC" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY ForColNum" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForColNum DESC" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY TipColCod" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY TipColCod DESC" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY ForNomCli" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForNomCli DESC" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY ForNumCli" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForNumCli DESC" ;
      }
      else if ( ( AV24OrderedBy == 8 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY ForPanto" ;
      }
      else if ( ( AV24OrderedBy == 8 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForPanto DESC" ;
      }
      else if ( ( AV24OrderedBy == 9 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY ForTonal" ;
      }
      else if ( ( AV24OrderedBy == 9 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY ForTonal DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, CliCod, ForSer, ForColNom, ForColNum, TipColCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object10[0] = scmdbuf ;
      GXv_Object10[1] = GXv_int9 ;
      return GXv_Object10 ;
   }

   protected Object[] conditional_H011G3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV60TFForSerDsc_Sel ,
                                          String AV59TFForSerDsc ,
                                          String AV62TFForColNom_Sel ,
                                          String AV61TFForColNom ,
                                          int AV63TFForColNum ,
                                          int AV64TFForColNum_To ,
                                          String AV68Var_Forser ,
                                          String A5742ForSerDsc ,
                                          String A482ForColNom ,
                                          int A483ForColNum ,
                                          String A494ForSer ,
                                          short AV24OrderedBy ,
                                          boolean AV25OrderedDsc )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int11 = new byte[7];
      Object[] GXv_Object12 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPCFORMU" ;
      if ( (GXutil.strcmp("", AV60TFForSerDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV59TFForSerDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForSerDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[0] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV60TFForSerDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(ForSerDsc = ?)");
      }
      else
      {
         GXv_int11[1] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV62TFForColNom_Sel)==0) && ( ! (GXutil.strcmp("", AV61TFForColNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(ForColNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int11[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV62TFForColNom_Sel)==0) )
      {
         addWhere(sWhereString, "(ForColNom = ?)");
      }
      else
      {
         GXv_int11[3] = (byte)(1) ;
      }
      if ( ! (0==AV63TFForColNum) )
      {
         addWhere(sWhereString, "(ForColNum >= ?)");
      }
      else
      {
         GXv_int11[4] = (byte)(1) ;
      }
      if ( ! (0==AV64TFForColNum_To) )
      {
         addWhere(sWhereString, "(ForColNum <= ?)");
      }
      else
      {
         GXv_int11[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV68Var_Forser)==0) )
      {
         addWhere(sWhereString, "(ForSer = ?)");
      }
      else
      {
         GXv_int11[6] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV24OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 8 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 8 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 9 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 9 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object12[0] = scmdbuf ;
      GXv_Object12[1] = GXv_int11 ;
      return GXv_Object12 ;
   }

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H011G2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Boolean) dynConstraints[12]).booleanValue() );
            case 1 :
                  return conditional_H011G3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , (String)dynConstraints[10] , ((Number) dynConstraints[11]).shortValue() , ((Boolean) dynConstraints[12]).booleanValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H011G2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H011G3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 20);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((String[]) buf[4])[0] = rslt.getString(4, 100);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((int[]) buf[6])[0] = rslt.getInt(5);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((String[]) buf[8])[0] = rslt.getString(6, 13);
               ((boolean[]) buf[9])[0] = rslt.wasNull();
               ((byte[]) buf[10])[0] = rslt.getByte(7);
               ((int[]) buf[11])[0] = rslt.getInt(8);
               ((String[]) buf[12])[0] = rslt.getString(9, 13);
               ((String[]) buf[13])[0] = rslt.getString(10, 26);
               ((boolean[]) buf[14])[0] = rslt.wasNull();
               ((String[]) buf[15])[0] = rslt.getString(11, 16);
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
      short sIdx;
      switch ( cursor )
      {
            case 0 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 13);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[16]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 16);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[7], 26);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[8], 26);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[9], 13);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 13);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[11]).intValue());
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[12]).intValue());
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 16);
               }
               return;
      }
   }

}

