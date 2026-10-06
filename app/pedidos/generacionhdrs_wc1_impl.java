package app.pedidos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class generacionhdrs_wc1_impl extends GXDataArea
{
   public generacionhdrs_wc1_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public generacionhdrs_wc1_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( generacionhdrs_wc1_impl.class ));
   }

   public generacionhdrs_wc1_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavGeneracionhdrs_sdt__seleccionar = UIFactory.getCheckbox(this);
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
            AV5EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV15DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV15DisEst", GXutil.str( AV15DisEst, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15DisEst), "9")));
               AV9BarNHdr = httpContext.GetPar( "BarNHdr") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9BarNHdr", AV9BarNHdr);
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
      nRC_GXsfl_68 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_68"))) ;
      nGXsfl_68_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_68_idx"))) ;
      sGXsfl_68_idx = httpContext.GetPar( "sGXsfl_68_idx") ;
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
      AV85Pgmname = httpContext.GetPar( "Pgmname") ;
      AV34Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV39Testrtm = (short)(GXutil.lval( httpContext.GetPar( "Testrtm"))) ;
      AV8UsurCod = httpContext.GetPar( "UsurCod") ;
      AV7Station = httpContext.GetPar( "Station") ;
      AV15DisEst = (byte)(GXutil.lval( httpContext.GetPar( "DisEst"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV85Pgmname, AV34Moda21, AV39Testrtm, AV8UsurCod, AV7Station, AV15DisEst) ;
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
      pa25R2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start25R2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.pedidos.generacionhdrs_wc1", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15DisEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9BarNHdr))}, new String[] {"EmprCod","DisEst","BarNHdr"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTESTRTM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39Testrtm), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15DisEst), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"GeneracionHDRs_WC1");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV85Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\generacionhdrs_wc1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Generacionhdrs_sdt", AV19GeneracionHDRs_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Generacionhdrs_sdt", AV19GeneracionHDRs_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_68", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_68, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV21GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV22GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vGENERACIONHDRS_SDT", AV19GeneracionHDRs_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vGENERACIONHDRS_SDT", AV19GeneracionHDRs_SDT);
      }
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vVAR_SELECCIONAR", AV43Var_seleccionar);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODP", GXutil.ltrim( localUtil.ntoc( AV54BarCodP, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV34Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTESTRTM", GXutil.ltrim( localUtil.ntoc( AV39Testrtm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTESTRTM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39Testrtm), "ZZZ9")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTABLAHDRS_SDT", AV48TablaHdrs_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTABLAHDRS_SDT", AV48TablaHdrs_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV7Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISEST", GXutil.ltrim( localUtil.ntoc( AV15DisEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15DisEst), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "MACCOD", GXutil.ltrim( localUtil.ntoc( A1199MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "MACDISCOD", GXutil.ltrim( localUtil.ntoc( A1202MacDisCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDISCOD", GXutil.ltrim( localUtil.ntoc( AV51discod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMACCOD", GXutil.ltrim( localUtil.ntoc( AV53MacCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARHDR_Title", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARHDR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARHDR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARHDR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARHDR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Title", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Title", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARHDR_Result", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_GENERARHDR_Result", GXutil.rtrim( Dvelop_confirmpanel_generarhdr_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btnincluiraccesorios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btneliminaraccesorios_Result));
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
         we25R2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt25R2( ) ;
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
      return formatLink("app.pedidos.generacionhdrs_wc1", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV15DisEst,1,0)),GXutil.URLEncode(GXutil.rtrim(AV9BarNHdr))}, new String[] {"EmprCod","DisEst","BarNHdr"})  ;
   }

   public String getPgmname( )
   {
      return "Pedidos.GeneracionHDRs_WC1" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Generacion HDRs", "") ;
   }

   public void wb25R0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "CellMarginTop", "left", "top", "", "flex-grow:1;", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup4_Internalname, httpContext.getMessage( "Accesorios", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_Pedidos\\GeneracionHDRs_WC1.htm");
         wb_table1_14_25R2( true) ;
      }
      else
      {
         wb_table1_14_25R2( false) ;
      }
      return  ;
   }

   public void wb_table1_14_25R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "CellMarginTop", "left", "top", "", "flex-grow:1;", "div");
         /* Control Group */
         app.GxWebStd.gx_group_start( httpContext, grpUnnamedgroup6_Internalname, httpContext.getMessage( "Crear Hdr", ""), 1, 0, "px", 0, "px", "Group", "", "HLP_Pedidos\\GeneracionHDRs_WC1.htm");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtngenerarhdr_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "Generar Hdr", ""), bttBtngenerarhdr_Jsonclick, 7, httpContext.getMessage( "Generar Hdr", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1125r1_client"+"'", TempTags, "", 2, "HLP_Pedidos\\GeneracionHDRs_WC1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</fieldset>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavBarnhdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarnhdr_Internalname, httpContext.getMessage( "Ultima HDR Creada", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarnhdr_Internalname, GXutil.rtrim( AV9BarNHdr), GXutil.rtrim( localUtil.format( AV9BarNHdr, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarnhdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarnhdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\GeneracionHDRs_WC1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", "++", bttBtnmarcartodas_Jsonclick, 5, "++", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\GeneracionHDRs_WC1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodas_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", "--", bttBtndesmarcartodas_Jsonclick, 5, "--", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DODESMARCARTODAS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\GeneracionHDRs_WC1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol68( ) ;
      }
      if ( wbEnd == 68 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_68 = (int)(nGXsfl_68_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV65GXV1 = nGXsfl_68_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV21GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV22GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV85Pgmname), GXutil.rtrim( localUtil.format( AV85Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Pedidos\\GeneracionHDRs_WC1.htm");
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
         wb_table2_101_25R2( true) ;
      }
      else
      {
         wb_table2_101_25R2( false) ;
      }
      return  ;
   }

   public void wb_table2_101_25R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_106_25R2( true) ;
      }
      else
      {
         wb_table3_106_25R2( false) ;
      }
      return  ;
   }

   public void wb_table3_106_25R2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_111_25R2( true) ;
      }
      else
      {
         wb_table4_111_25R2( false) ;
      }
      return  ;
   }

   public void wb_table4_111_25R2e( boolean wbgen )
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
      if ( wbEnd == 68 )
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
               AV65GXV1 = nGXsfl_68_idx ;
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

   public void start25R2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Generacion HDRs", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup25R0( ) ;
   }

   public void ws25R2( )
   {
      start25R2( ) ;
      evt25R2( ) ;
   }

   public void evt25R2( )
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
                           e1225R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1325R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_GENERARHDR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1425R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1525R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1625R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMARCARTODAS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoMarcarTodas' */
                           e1725R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DODESMARCARTODAS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoDesmarcarTodas' */
                           e1825R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOINCLUIRACCESORIOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoIncluirAccesorios' */
                           e1925R2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOELIMINARACCESORIOS'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoEliminarAccesorios' */
                           e2025R2 ();
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
                           nGXsfl_68_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_682( ) ;
                           AV65GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV19GeneracionHDRs_SDT.size() >= AV65GXV1 ) && ( AV65GXV1 > 0 ) )
                           {
                              AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
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
                                 e2125R2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2225R2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2325R2 ();
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

   public void we25R2( )
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

   public void pa25R2( )
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
            GX_FocusControl = edtavIncluir_maccod_Internalname ;
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
      subsflControlProps_682( ) ;
      while ( nGXsfl_68_idx <= nRC_GXsfl_68 )
      {
         sendrow_682( ) ;
         nGXsfl_68_idx = ((subGrid_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV85Pgmname ,
                                 short AV34Moda21 ,
                                 short AV39Testrtm ,
                                 String AV8UsurCod ,
                                 String AV7Station ,
                                 byte AV15DisEst )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2225R2 ();
      GRID_nCurrentRecord = 0 ;
      rf25R2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"GeneracionHDRs_WC1");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV85Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("pedidos\\generacionhdrs_wc1:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf25R2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV85Pgmname = "Pedidos.GeneracionHDRs_WC1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85Pgmname", AV85Pgmname);
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavGeneracionhdrs_sdt__discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disfec_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__maccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__maccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__maccod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__clicod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__clinom_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disenccli_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__dispart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__dispart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispart_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disartcod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disartdsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__discolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__discolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discolnom_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__discolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__discolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discolnum_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__distipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__distipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__distipcol_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disnomcli_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disunimed_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__dispiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__dispiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiepie_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__dispiekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__dispiekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiekgm_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__dispiemtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__dispiemtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiemtr_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__maqcoddis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__maqcoddis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__maqcoddis_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf25R2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(68) ;
      /* Execute user event: Refresh */
      e2225R2 ();
      nGXsfl_68_idx = 1 ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_682( ) ;
      bGXsfl_68_Refreshing = true ;
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
         subsflControlProps_682( ) ;
         e2325R2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_68_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2325R2 ();
         }
         wbEnd = (short)(68) ;
         wb25R0( ) ;
      }
      bGXsfl_68_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes25R2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMODA21", GXutil.ltrim( localUtil.ntoc( AV34Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTESTRTM", GXutil.ltrim( localUtil.ntoc( AV39Testrtm, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTESTRTM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39Testrtm), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV8UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV7Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
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
      return AV19GeneracionHDRs_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV85Pgmname, AV34Moda21, AV39Testrtm, AV8UsurCod, AV7Station, AV15DisEst) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV85Pgmname, AV34Moda21, AV39Testrtm, AV8UsurCod, AV7Station, AV15DisEst) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV85Pgmname, AV34Moda21, AV39Testrtm, AV8UsurCod, AV7Station, AV15DisEst) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV85Pgmname, AV34Moda21, AV39Testrtm, AV8UsurCod, AV7Station, AV15DisEst) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV85Pgmname, AV34Moda21, AV39Testrtm, AV8UsurCod, AV7Station, AV15DisEst) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV85Pgmname = "Pedidos.GeneracionHDRs_WC1" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV85Pgmname", AV85Pgmname);
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnhdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnhdr_Enabled), 5, 0), true);
      edtavGeneracionhdrs_sdt__discod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__discod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disfec_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__maccod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__maccod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__maccod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__clicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__clicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__clicod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__clinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__clinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__clinom_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disenccli_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__dispart_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__dispart_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispart_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disartcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disartcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disartcod_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disartdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disartdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disartdsc_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__discolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__discolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discolnom_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__discolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__discolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__discolnum_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__distipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__distipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__distipcol_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disnomcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disnomcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disnomcli_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__disunimed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__disunimed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__disunimed_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__dispiepie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__dispiepie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiepie_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__dispiekgm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__dispiekgm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiekgm_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__dispiemtr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__dispiemtr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__dispiemtr_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavGeneracionhdrs_sdt__maqcoddis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGeneracionhdrs_sdt__maqcoddis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGeneracionhdrs_sdt__maqcoddis_Enabled), 5, 0), !bGXsfl_68_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup25R0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2125R2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Generacionhdrs_sdt"), AV19GeneracionHDRs_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vGENERACIONHDRS_SDT"), AV19GeneracionHDRs_SDT);
         /* Read saved values. */
         nRC_GXsfl_68 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_68"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV21GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV22GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Dvelop_confirmpanel_generarhdr_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARHDR_Title") ;
         Dvelop_confirmpanel_generarhdr_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARHDR_Confirmationtext") ;
         Dvelop_confirmpanel_generarhdr_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_generarhdr_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARHDR_Nobuttoncaption") ;
         Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARHDR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_generarhdr_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARHDR_Yesbuttonposition") ;
         Dvelop_confirmpanel_generarhdr_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARHDR_Confirmtype") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Title") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmationtext") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Confirmtype") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Title") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmationtext") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_generarhdr_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_GENERARHDR_Result") ;
         Dvelop_confirmpanel_btnincluiraccesorios_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS_Result") ;
         Dvelop_confirmpanel_btneliminaraccesorios_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS_Result") ;
         nRC_GXsfl_68 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_68"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_68_fel_idx = 0 ;
         while ( nGXsfl_68_fel_idx < nRC_GXsfl_68 )
         {
            nGXsfl_68_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_68_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_68_fel_idx+1) ;
            sGXsfl_68_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_682( ) ;
            AV65GXV1 = (int)(nGXsfl_68_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV19GeneracionHDRs_SDT.size() >= AV65GXV1 ) && ( AV65GXV1 > 0 ) )
            {
               AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
            }
         }
         if ( nGXsfl_68_fel_idx == 0 )
         {
            nGXsfl_68_idx = 1 ;
            sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_682( ) ;
         }
         nGXsfl_68_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavIncluir_maccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavIncluir_maccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vINCLUIR_MACCOD");
            GX_FocusControl = edtavIncluir_maccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27Incluir_Maccod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Incluir_Maccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Incluir_Maccod), 8, 0));
         }
         else
         {
            AV27Incluir_Maccod = (int)(localUtil.ctol( httpContext.cgiGet( edtavIncluir_maccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27Incluir_Maccod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV27Incluir_Maccod), 8, 0));
         }
         AV85Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85Pgmname", AV85Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_68_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
         AV65GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_68_idx > 0 )
         {
            AV65GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV19GeneracionHDRs_SDT.size() >= AV65GXV1 ) && ( AV65GXV1 > 0 ) )
            {
               AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
            }
            if ( ( AV65GXV1 > 0 ) && ( AV19GeneracionHDRs_SDT.size() >= AV65GXV1 ) )
            {
               AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"GeneracionHDRs_WC1");
         AV85Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV85Pgmname", AV85Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV85Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("pedidos\\generacionhdrs_wc1:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2125R2 ();
      if (returnInSub) return;
   }

   public void e2125R2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = AV19GeneracionHDRs_SDT ;
      GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
      new app.generacionhdrs_dp(remoteHandle, context).execute( AV5EmprCod, AV15DisEst, GXv_objcol_SdtGeneracionHDRs_SDT_Item2) ;
      GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] ;
      AV19GeneracionHDRs_SDT = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
      gx_BV68 = true ;
      AV19GeneracionHDRs_SDT.sort(httpContext.getMessage( "[Discod]", ""));
      gx_BV68 = true ;
      GXt_char3 = AV7Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      generacionhdrs_wc1_impl.this.GXt_char3 = GXv_char4[0] ;
      AV7Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
      GXv_char4[0] = AV5EmprCod ;
      GXv_char5[0] = AV6EmprNom ;
      GXv_char6[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char4, GXv_char5, GXv_char6) ;
      generacionhdrs_wc1_impl.this.AV5EmprCod = GXv_char4[0] ;
      generacionhdrs_wc1_impl.this.AV6EmprNom = GXv_char5[0] ;
      generacionhdrs_wc1_impl.this.AV8UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      GXt_int7 = (byte)(AV10Carvitin) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "CARVIT", ""), GXv_int8) ;
      generacionhdrs_wc1_impl.this.GXt_int7 = GXv_int8[0] ;
      AV10Carvitin = GXt_int7 ;
      GXt_int7 = (byte)(AV39Testrtm) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "RTMTES", ""), GXv_int8) ;
      generacionhdrs_wc1_impl.this.GXt_int7 = GXv_int8[0] ;
      AV39Testrtm = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39Testrtm", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39Testrtm), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTESTRTM", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV39Testrtm), "ZZZ9")));
      GXt_int7 = (byte)(AV34Moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      generacionhdrs_wc1_impl.this.GXt_int7 = GXv_int8[0] ;
      AV34Moda21 = GXt_int7 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV34Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV34Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODA21", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV34Moda21), "ZZZ9")));
      GXt_char3 = AV7Station ;
      GXv_char6[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char6) ;
      generacionhdrs_wc1_impl.this.GXt_char3 = GXv_char6[0] ;
      AV7Station = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Station", AV7Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV7Station, ""))));
      GXv_char6[0] = AV5EmprCod ;
      GXv_char5[0] = AV6EmprNom ;
      GXv_char4[0] = AV8UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV7Station, GXv_char6, GXv_char5, GXv_char4) ;
      generacionhdrs_wc1_impl.this.AV5EmprCod = GXv_char6[0] ;
      generacionhdrs_wc1_impl.this.AV6EmprNom = GXv_char5[0] ;
      generacionhdrs_wc1_impl.this.AV8UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8UsurCod", AV8UsurCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vUSURCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV8UsurCod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Generacion HDRs", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2225R2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV44WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV44WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S132 ();
      if (returnInSub) return;
      AV21GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21GridCurrentPage), 10, 0));
      AV22GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV22GridPageCount), 10, 0));
      /*  Sending Event outputs  */
   }

   public void e1225R2( )
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
         AV35PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV35PageToGo) ;
      }
   }

   public void e1325R2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2325R2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV65GXV1 = 1 ;
      while ( AV65GXV1 <= AV19GeneracionHDRs_SDT.size() )
      {
         AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(68) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_682( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_68_Refreshing )
         {
            httpContext.doAjaxLoad(68, GridRow);
         }
         AV65GXV1 = (int)(AV65GXV1+1) ;
      }
   }

   public void e1725R2( )
   {
      AV65GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV65GXV1 > 0 ) && ( AV19GeneracionHDRs_SDT.size() >= AV65GXV1 ) )
      {
         AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
      }
      /* 'DoMarcarTodas' Routine */
      returnInSub = false ;
      AV43Var_seleccionar = true ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Var_seleccionar", AV43Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S142 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19GeneracionHDRs_SDT", AV19GeneracionHDRs_SDT);
      nGXsfl_68_bak_idx = nGXsfl_68_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV85Pgmname, AV34Moda21, AV39Testrtm, AV8UsurCod, AV7Station, AV15DisEst) ;
      nGXsfl_68_idx = nGXsfl_68_bak_idx ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_682( ) ;
   }

   public void e1825R2( )
   {
      AV65GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV65GXV1 > 0 ) && ( AV19GeneracionHDRs_SDT.size() >= AV65GXV1 ) )
      {
         AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
      }
      /* 'DoDesmarcarTodas' Routine */
      returnInSub = false ;
      AV43Var_seleccionar = false ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43Var_seleccionar", AV43Var_seleccionar);
      /* Execute user subroutine: 'APLICOGRID' */
      S142 ();
      if (returnInSub) return;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19GeneracionHDRs_SDT", AV19GeneracionHDRs_SDT);
      nGXsfl_68_bak_idx = nGXsfl_68_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV85Pgmname, AV34Moda21, AV39Testrtm, AV8UsurCod, AV7Station, AV15DisEst) ;
      nGXsfl_68_idx = nGXsfl_68_bak_idx ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_682( ) ;
   }

   public void e1425R2( )
   {
      AV65GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV65GXV1 > 0 ) && ( AV19GeneracionHDRs_SDT.size() >= AV65GXV1 ) )
      {
         AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
      }
      /* Dvelop_confirmpanel_generarhdr_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_generarhdr_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION GENERARHDR' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV36ProgressIndicator", AV36ProgressIndicator);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV48TablaHdrs_SDT", AV48TablaHdrs_SDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19GeneracionHDRs_SDT", AV19GeneracionHDRs_SDT);
      nGXsfl_68_bak_idx = nGXsfl_68_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV85Pgmname, AV34Moda21, AV39Testrtm, AV8UsurCod, AV7Station, AV15DisEst) ;
      nGXsfl_68_idx = nGXsfl_68_bak_idx ;
      sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_682( ) ;
   }

   public void e1925R2( )
   {
      AV65GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV65GXV1 > 0 ) && ( AV19GeneracionHDRs_SDT.size() >= AV65GXV1 ) )
      {
         AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
      }
      /* 'DoIncluirAccesorios' Routine */
      returnInSub = false ;
      if ( (0==AV27Incluir_Maccod) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta el Nº de Macro", ""));
         GX_FocusControl = edtavIncluir_maccod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         AV60FlagMac = (short)(0) ;
         /* Using cursor H025R2 */
         pr_default.execute(0, new Object[] {AV5EmprCod, Integer.valueOf(AV27Incluir_Maccod)});
         while ( (pr_default.getStatus(0) != 101) )
         {
            A1199MacCod = H025R2_A1199MacCod[0] ;
            A396EmprCod = H025R2_A396EmprCod[0] ;
            AV60FlagMac = (short)(1) ;
            /* Exiting from a For First loop. */
            if (true) break;
         }
         pr_default.close(0);
         AV61FlagDis = (short)(0) ;
         AV51discod = ((app.SdtGeneracionHDRs_SDT_Item)(AV19GeneracionHDRs_SDT.currentItem())).getgxTv_SdtGeneracionHDRs_SDT_Item_Discod() ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51discod), 8, 0));
         /* Using cursor H025R3 */
         pr_default.execute(1, new Object[] {AV5EmprCod, Integer.valueOf(AV51discod)});
         while ( (pr_default.getStatus(1) != 101) )
         {
            A1202MacDisCod = H025R3_A1202MacDisCod[0] ;
            A396EmprCod = H025R3_A396EmprCod[0] ;
            A1199MacCod = H025R3_A1199MacCod[0] ;
            AV62MacCod2 = A1199MacCod ;
            AV61FlagDis = (short)(1) ;
            /* Exit For each command. Update data (if necessary), close cursors & exit. */
            if (true) break;
            pr_default.readNext(1);
         }
         pr_default.close(1);
         if ( (0==AV60FlagMac) || ( AV61FlagDis == 1 ) )
         {
            if ( (0==AV60FlagMac) )
            {
               Gx_msg = httpContext.getMessage( "No existe el Nº Macro ", "") + GXutil.trim( GXutil.str( AV27Incluir_Maccod, 8, 0)) ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
            if ( AV61FlagDis == 1 )
            {
               Gx_msg = httpContext.getMessage( "El N Disposicion ", "") + GXutil.trim( GXutil.str( AV51discod, 8, 0)) + httpContext.getMessage( ", ya esta incluida en el Nº Macro ", "") + GXutil.trim( GXutil.str( AV62MacCod2, 8, 0)) ;
               httpContext.GX_msglist.addItem(Gx_msg);
            }
         }
         else
         {
            Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = httpContext.getMessage( "Desea incluir el Nº Disp. Int. ", "")+GXutil.trim( GXutil.str( AV51discod, 8, 0))+GXutil.newLine( ) ;
            ucDvelop_confirmpanel_btnincluiraccesorios.sendProperty(context, "", false, Dvelop_confirmpanel_btnincluiraccesorios_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext);
            Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext+httpContext.getMessage( "En el Nº accesorio ", "")+GXutil.trim( GXutil.str( AV27Incluir_Maccod, 8, 0))+" ?" ;
            ucDvelop_confirmpanel_btnincluiraccesorios.sendProperty(context, "", false, Dvelop_confirmpanel_btnincluiraccesorios_Internalname, "ConfirmationText", Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext);
            this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOSContainer", "Confirm", "", new Object[] {});
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1525R2( )
   {
      AV65GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV65GXV1 > 0 ) && ( AV19GeneracionHDRs_SDT.size() >= AV65GXV1 ) )
      {
         AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
      }
      /* Dvelop_confirmpanel_btnincluiraccesorios_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnincluiraccesorios_Result, "Yes") == 0 )
      {
         new app.pgenmac(remoteHandle, context).execute( AV5EmprCod, AV51discod, AV27Incluir_Maccod) ;
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Nº Disposicion incluida en macro", ""));
         GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = AV19GeneracionHDRs_SDT ;
         GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
         new app.generacionhdrs_dp(remoteHandle, context).execute( AV5EmprCod, AV15DisEst, GXv_objcol_SdtGeneracionHDRs_SDT_Item2) ;
         GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] ;
         AV19GeneracionHDRs_SDT = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
         gx_BV68 = true ;
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
      if ( gx_BV68 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19GeneracionHDRs_SDT", AV19GeneracionHDRs_SDT);
         nGXsfl_68_bak_idx = nGXsfl_68_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV85Pgmname, AV34Moda21, AV39Testrtm, AV8UsurCod, AV7Station, AV15DisEst) ;
         nGXsfl_68_idx = nGXsfl_68_bak_idx ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
   }

   public void e2025R2( )
   {
      AV65GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV65GXV1 > 0 ) && ( AV19GeneracionHDRs_SDT.size() >= AV65GXV1 ) )
      {
         AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
      }
      /* 'DoEliminarAccesorios' Routine */
      returnInSub = false ;
      AV53MacCod = ((app.SdtGeneracionHDRs_SDT_Item)(AV19GeneracionHDRs_SDT.currentItem())).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MacCod), 8, 0));
      Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext = httpContext.getMessage( "¿Desea eliminar el Nº de Accesorio ", "")+GXutil.trim( GXutil.str( AV53MacCod, 8, 0))+"?" ;
      ucDvelop_confirmpanel_btneliminaraccesorios.sendProperty(context, "", false, Dvelop_confirmpanel_btneliminaraccesorios_Internalname, "ConfirmationText", Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext);
      this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOSContainer", "Confirm", "", new Object[] {});
      /*  Sending Event outputs  */
   }

   public void e1625R2( )
   {
      AV65GXV1 = (int)(nGXsfl_68_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV65GXV1 > 0 ) && ( AV19GeneracionHDRs_SDT.size() >= AV65GXV1 ) )
      {
         AV19GeneracionHDRs_SDT.currentItem( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)) );
      }
      /* Dvelop_confirmpanel_btneliminaraccesorios_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btneliminaraccesorios_Result, "Yes") == 0 )
      {
         GXv_int10[0] = AV53MacCod ;
         new app.pelimac(remoteHandle, context).execute( AV5EmprCod, GXv_int10) ;
         generacionhdrs_wc1_impl.this.AV53MacCod = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MacCod), 8, 0));
         GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = AV19GeneracionHDRs_SDT ;
         GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
         new app.generacionhdrs_dp(remoteHandle, context).execute( AV5EmprCod, AV15DisEst, GXv_objcol_SdtGeneracionHDRs_SDT_Item2) ;
         GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] ;
         AV19GeneracionHDRs_SDT = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
         gx_BV68 = true ;
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
      if ( gx_BV68 )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19GeneracionHDRs_SDT", AV19GeneracionHDRs_SDT);
         nGXsfl_68_bak_idx = nGXsfl_68_idx ;
         gxgrgrid_refresh( subGrid_Rows, AV85Pgmname, AV34Moda21, AV39Testrtm, AV8UsurCod, AV7Station, AV15DisEst) ;
         nGXsfl_68_idx = nGXsfl_68_bak_idx ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S152( )
   {
      /* 'DO ACTION GENERARHDR' Routine */
      returnInSub = false ;
      AV36ProgressIndicator.setgxTv_SdtProgress_Type( (byte)(1) );
      AV36ProgressIndicator.setgxTv_SdtProgress_Class( httpContext.getMessage( "GXProgressBarDanger", "") );
      AV36ProgressIndicator.setgxTv_SdtProgress_Value( 0 );
      AV36ProgressIndicator.showwithtitle(httpContext.getMessage( "Iniciando proceso...", ""));
      AV36ProgressIndicator.show();
      AV36ProgressIndicator.setgxTv_SdtProgress_Value( 33 );
      AV36ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando PGENBARM", ""));
      AV26i = GXutil.sleep( 1) ;
      AV30lineas = (short)(1) ;
      AV38t = (short)(1) ;
      AV26i = (short)(1) ;
      while ( AV26i <= AV19GeneracionHDRs_SDT.size() )
      {
         AV58seleccionar = ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV26i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar() ;
         if ( AV58seleccionar )
         {
            AV51discod = ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV26i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discod() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51discod), 8, 0));
            AV53MacCod = ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV26i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53MacCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53MacCod), 8, 0));
            AV52MaqCod = ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV26i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis() ;
            AV36ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Nº Disp Int ", "")+GXutil.trim( GXutil.str( AV51discod, 8, 0)) );
            GXv_int10[0] = AV54BarCodP ;
            new app.pgenbarm(remoteHandle, context).execute( AV5EmprCod, AV51discod, AV52MaqCod, GXv_int10) ;
            generacionhdrs_wc1_impl.this.AV54BarCodP = GXv_int10[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarCodP), 8, 0));
            new app.pmtsrdt(remoteHandle, context).execute( AV5EmprCod, AV54BarCodP, (byte)(0), " ", DecimalUtil.doubleToDec(0)) ;
            if ( ! (0==AV53MacCod) )
            {
               GXv_char6[0] = AV5EmprCod ;
               GXv_int10[0] = AV51discod ;
               GXv_int11[0] = AV54BarCodP ;
               new app.pmodmac(remoteHandle, context).execute( GXv_char6, GXv_int10, GXv_int11) ;
               generacionhdrs_wc1_impl.this.AV5EmprCod = GXv_char6[0] ;
               generacionhdrs_wc1_impl.this.AV51discod = GXv_int10[0] ;
               generacionhdrs_wc1_impl.this.AV54BarCodP = GXv_int11[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV51discod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51discod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV54BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarCodP), 8, 0));
            }
            if ( AV30lineas < 1000 )
            {
               AV46TabHdr[AV30lineas-1] = GXutil.str( AV54BarCodP, 8, 0) + "0" + " " ;
               AV30lineas = (short)(AV30lineas+1) ;
            }
            if ( AV34Moda21 == 1 )
            {
               if ( AV39Testrtm == 1 )
               {
                  GXv_char6[0] = AV5EmprCod ;
                  GXv_int11[0] = AV54BarCodP ;
                  GXv_int8[0] = (byte)(0) ;
                  GXv_char5[0] = " " ;
                  new app.ptestrtm(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_int8, GXv_char5) ;
                  generacionhdrs_wc1_impl.this.AV5EmprCod = GXv_char6[0] ;
                  generacionhdrs_wc1_impl.this.AV54BarCodP = GXv_int11[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV54BarCodP", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54BarCodP), 8, 0));
               }
               AV47TabladeHdrs_SDTItem = (app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem)new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
               AV47TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcod( AV54BarCodP );
               AV47TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodreo( (byte)(0) );
               AV47TabladeHdrs_SDTItem.setgxTv_SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem_Barcodpar( " " );
               AV48TablaHdrs_SDT.add(AV47TabladeHdrs_SDTItem, 0);
            }
            AV38t = (short)(AV38t+1) ;
         }
         AV26i = (short)(AV26i+1) ;
      }
      AV36ProgressIndicator.setgxTv_SdtProgress_Value( 66 );
      AV36ProgressIndicator.setgxTv_SdtProgress_Description( "" );
      AV36ProgressIndicator.showwithtitle(httpContext.getMessage( "Fin Procesando PGENBARM", ""));
      AV55Inc_obs1 = "" ;
      if ( AV30lineas > 1 )
      {
         AV30lineas = (short)(AV30lineas-1) ;
         AV55Inc_obs1 = httpContext.getMessage( "Proceso Generacion Hdrs,creadas ", "") + GXutil.trim( GXutil.str( AV30lineas, 4, 0)) ;
         new app.pctrinc(remoteHandle, context).execute( AV5EmprCod, AV85Pgmname, AV8UsurCod, AV7Station, AV55Inc_obs1, 22, (byte)(0), "") ;
      }
      AV56MacSav = 0 ;
      AV30lineas = (short)(0) ;
      AV36ProgressIndicator.setgxTv_SdtProgress_Value( 70 );
      AV36ProgressIndicator.showwithtitle(httpContext.getMessage( "Procesando ACCESORIOS", ""));
      AV26i = GXutil.sleep( 1) ;
      AV26i = (short)(1) ;
      while ( AV26i <= AV19GeneracionHDRs_SDT.size() )
      {
         AV58seleccionar = ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV26i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar() ;
         if ( AV58seleccionar )
         {
            AV57Maccoditem = ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV26i)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod() ;
            if ( ! (0==AV57Maccoditem) && ( AV57Maccoditem != AV56MacSav ) )
            {
               AV36ProgressIndicator.setgxTv_SdtProgress_Value( 80 );
               AV36ProgressIndicator.setgxTv_SdtProgress_Description( httpContext.getMessage( "Nº Macro ", "")+GXutil.trim( GXutil.str( AV57Maccoditem, 8, 0)) );
               GXv_char6[0] = AV5EmprCod ;
               GXv_int11[0] = AV57Maccoditem ;
               new app.pagrmac(remoteHandle, context).execute( GXv_char6, GXv_int11) ;
               generacionhdrs_wc1_impl.this.AV5EmprCod = GXv_char6[0] ;
               generacionhdrs_wc1_impl.this.AV57Maccoditem = GXv_int11[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
               AV56MacSav = AV57Maccoditem ;
               AV30lineas = (short)(AV30lineas+1) ;
            }
         }
         AV26i = (short)(AV26i+1) ;
      }
      AV59Inc_obs2 = "" ;
      if ( AV30lineas > 1 )
      {
         AV59Inc_obs2 = httpContext.getMessage( "Proceso Accesorios,creados ", "") + GXutil.trim( GXutil.str( AV30lineas, 4, 0)) ;
         new app.pctrinc(remoteHandle, context).execute( AV5EmprCod, AV85Pgmname, AV8UsurCod, AV7Station, AV59Inc_obs2, 11, (byte)(0), "") ;
      }
      AV59Inc_obs2 = httpContext.getMessage( "Proceso Generacion HDRs, finalizado", "") ;
      new app.pctrinc(remoteHandle, context).execute( AV5EmprCod, AV85Pgmname, AV8UsurCod, AV7Station, AV59Inc_obs2, 10, (byte)(0), "") ;
      AV36ProgressIndicator.showwithtitle(httpContext.getMessage( "Proceso Finalizado", ""));
      AV36ProgressIndicator.setgxTv_SdtProgress_Description( "" );
      AV36ProgressIndicator.setgxTv_SdtProgress_Value( 100 );
      AV26i = GXutil.sleep( 1) ;
      AV36ProgressIndicator.hide();
      if ( ( AV34Moda21 == 1 ) && ( AV48TablaHdrs_SDT.size() > 0 ) )
      {
         AV49TablaHdrs_SDTJson = AV48TablaHdrs_SDT.toJSonString(false) ;
         httpContext.popup(formatLink("app.pctrosc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.rtrim(AV49TablaHdrs_SDTJson))}, new String[] {"EmprCod","TablaHdrs_SDTJson"}) , new Object[] {"AV5EmprCod","AV49TablaHdrs_SDTJson"});
      }
      GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = AV19GeneracionHDRs_SDT ;
      GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
      new app.generacionhdrs_dp(remoteHandle, context).execute( AV5EmprCod, AV15DisEst, GXv_objcol_SdtGeneracionHDRs_SDT_Item2) ;
      GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = GXv_objcol_SdtGeneracionHDRs_SDT_Item2[0] ;
      AV19GeneracionHDRs_SDT = GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
      gx_BV68 = true ;
      GXt_char3 = AV9BarNHdr ;
      GXv_char6[0] = GXt_char3 ;
      new app.pedidos.ultimahdrcreada(remoteHandle, context).execute( AV5EmprCod, GXv_char6) ;
      generacionhdrs_wc1_impl.this.GXt_char3 = GXv_char6[0] ;
      AV9BarNHdr = GXt_char3 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarNHdr", AV9BarNHdr);
      httpContext.doAjaxRefresh();
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV37Session.getValue(AV85Pgmname+"GridState"), "") == 0 )
      {
         AV23GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV85Pgmname+"GridState"), null, null);
      }
      else
      {
         AV23GridState.fromxml(AV37Session.getValue(AV85Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV23GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV23GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV23GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV23GridState.fromxml(AV37Session.getValue(AV85Pgmname+"GridState"), null, null);
      AV23GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV23GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV85Pgmname+"GridState", AV23GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S142( )
   {
      /* 'APLICOGRID' Routine */
      returnInSub = false ;
      AV26i = (short)(1) ;
      while ( AV26i <= AV19GeneracionHDRs_SDT.size() )
      {
         ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV26i)).setgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar( AV43Var_seleccionar );
         AV26i = (short)(AV26i+1) ;
      }
   }

   public void wb_table4_111_25R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname, tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("Title", Dvelop_confirmpanel_btneliminaraccesorios_Title);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("ConfirmationText", Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("YesButtonCaption", Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("NoButtonCaption", Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("YesButtonPosition", Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition);
         ucDvelop_confirmpanel_btneliminaraccesorios.setProperty("ConfirmType", Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype);
         ucDvelop_confirmpanel_btneliminaraccesorios.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btneliminaraccesorios_Internalname, "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_111_25R2e( true) ;
      }
      else
      {
         wb_table4_111_25R2e( false) ;
      }
   }

   public void wb_table3_106_25R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname, tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("Title", Dvelop_confirmpanel_btnincluiraccesorios_Title);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("ConfirmationText", Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition);
         ucDvelop_confirmpanel_btnincluiraccesorios.setProperty("ConfirmType", Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype);
         ucDvelop_confirmpanel_btnincluiraccesorios.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnincluiraccesorios_Internalname, "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_106_25R2e( true) ;
      }
      else
      {
         wb_table3_106_25R2e( false) ;
      }
   }

   public void wb_table2_101_25R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_generarhdr_Internalname, tblTabledvelop_confirmpanel_generarhdr_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_generarhdr.setProperty("Title", Dvelop_confirmpanel_generarhdr_Title);
         ucDvelop_confirmpanel_generarhdr.setProperty("ConfirmationText", Dvelop_confirmpanel_generarhdr_Confirmationtext);
         ucDvelop_confirmpanel_generarhdr.setProperty("YesButtonCaption", Dvelop_confirmpanel_generarhdr_Yesbuttoncaption);
         ucDvelop_confirmpanel_generarhdr.setProperty("NoButtonCaption", Dvelop_confirmpanel_generarhdr_Nobuttoncaption);
         ucDvelop_confirmpanel_generarhdr.setProperty("CancelButtonCaption", Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption);
         ucDvelop_confirmpanel_generarhdr.setProperty("YesButtonPosition", Dvelop_confirmpanel_generarhdr_Yesbuttonposition);
         ucDvelop_confirmpanel_generarhdr.setProperty("ConfirmType", Dvelop_confirmpanel_generarhdr_Confirmtype);
         ucDvelop_confirmpanel_generarhdr.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_generarhdr_Internalname, "DVELOP_CONFIRMPANEL_GENERARHDRContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_GENERARHDRContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_101_25R2e( true) ;
      }
      else
      {
         wb_table2_101_25R2e( false) ;
      }
   }

   public void wb_table1_14_25R2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable3_Internalname, tblUnnamedtable3_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnincluiraccesorios_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "Incluir", ""), bttBtnincluiraccesorios_Jsonclick, 5, httpContext.getMessage( "Incluir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOINCLUIRACCESORIOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\GeneracionHDRs_WC1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td class='DscTop'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableincluir_maccod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockincluir_maccod_Internalname, httpContext.getMessage( "Nº Macro", ""), "", "", lblTextblockincluir_maccod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_Pedidos\\GeneracionHDRs_WC1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavIncluir_maccod_Internalname, httpContext.getMessage( "Incluir_Maccod", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'" + sGXsfl_68_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavIncluir_maccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV27Incluir_Maccod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavIncluir_maccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV27Incluir_Maccod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV27Incluir_Maccod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,25);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavIncluir_maccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavIncluir_maccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Pedidos\\GeneracionHDRs_WC1.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminaraccesorios_Internalname, "gx.evt.setGridEvt("+GXutil.str( 68, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar", ""), bttBtneliminaraccesorios_Jsonclick, 5, httpContext.getMessage( "Eliminar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOELIMINARACCESORIOS\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Pedidos\\GeneracionHDRs_WC1.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_14_25R2e( true) ;
      }
      else
      {
         wb_table1_14_25R2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV15DisEst = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15DisEst", GXutil.str( AV15DisEst, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDISEST", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV15DisEst), "9")));
      AV9BarNHdr = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9BarNHdr", AV9BarNHdr);
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
      pa25R2( ) ;
      ws25R2( ) ;
      we25R2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
      httpContext.AddStyleSheetFile("DVelop/DVPaginationBar/DVPaginationBar.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116144974", true, true);
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
      httpContext.AddJavascriptSource("pedidos/generacionhdrs_wc1.js", "?202682116144975", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_682( )
   {
      chkavGeneracionhdrs_sdt__seleccionar.setInternalname( "GENERACIONHDRS_SDT__SELECCIONAR_"+sGXsfl_68_idx );
      edtavGeneracionhdrs_sdt__discod_Internalname = "GENERACIONHDRS_SDT__DISCOD_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__disfec_Internalname = "GENERACIONHDRS_SDT__DISFEC_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__maccod_Internalname = "GENERACIONHDRS_SDT__MACCOD_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__clicod_Internalname = "GENERACIONHDRS_SDT__CLICOD_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__clinom_Internalname = "GENERACIONHDRS_SDT__CLINOM_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__disenccli_Internalname = "GENERACIONHDRS_SDT__DISENCCLI_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__dispart_Internalname = "GENERACIONHDRS_SDT__DISPART_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__disartcod_Internalname = "GENERACIONHDRS_SDT__DISARTCOD_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__disartdsc_Internalname = "GENERACIONHDRS_SDT__DISARTDSC_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__discolnom_Internalname = "GENERACIONHDRS_SDT__DISCOLNOM_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__discolnum_Internalname = "GENERACIONHDRS_SDT__DISCOLNUM_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__distipcol_Internalname = "GENERACIONHDRS_SDT__DISTIPCOL_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__disnomcli_Internalname = "GENERACIONHDRS_SDT__DISNOMCLI_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__disunimed_Internalname = "GENERACIONHDRS_SDT__DISUNIMED_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__dispiepie_Internalname = "GENERACIONHDRS_SDT__DISPIEPIE_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__dispiekgm_Internalname = "GENERACIONHDRS_SDT__DISPIEKGM_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__dispiemtr_Internalname = "GENERACIONHDRS_SDT__DISPIEMTR_"+sGXsfl_68_idx ;
      edtavGeneracionhdrs_sdt__maqcoddis_Internalname = "GENERACIONHDRS_SDT__MAQCODDIS_"+sGXsfl_68_idx ;
   }

   public void subsflControlProps_fel_682( )
   {
      chkavGeneracionhdrs_sdt__seleccionar.setInternalname( "GENERACIONHDRS_SDT__SELECCIONAR_"+sGXsfl_68_fel_idx );
      edtavGeneracionhdrs_sdt__discod_Internalname = "GENERACIONHDRS_SDT__DISCOD_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__disfec_Internalname = "GENERACIONHDRS_SDT__DISFEC_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__maccod_Internalname = "GENERACIONHDRS_SDT__MACCOD_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__clicod_Internalname = "GENERACIONHDRS_SDT__CLICOD_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__clinom_Internalname = "GENERACIONHDRS_SDT__CLINOM_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__disenccli_Internalname = "GENERACIONHDRS_SDT__DISENCCLI_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__dispart_Internalname = "GENERACIONHDRS_SDT__DISPART_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__disartcod_Internalname = "GENERACIONHDRS_SDT__DISARTCOD_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__disartdsc_Internalname = "GENERACIONHDRS_SDT__DISARTDSC_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__discolnom_Internalname = "GENERACIONHDRS_SDT__DISCOLNOM_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__discolnum_Internalname = "GENERACIONHDRS_SDT__DISCOLNUM_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__distipcol_Internalname = "GENERACIONHDRS_SDT__DISTIPCOL_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__disnomcli_Internalname = "GENERACIONHDRS_SDT__DISNOMCLI_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__disunimed_Internalname = "GENERACIONHDRS_SDT__DISUNIMED_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__dispiepie_Internalname = "GENERACIONHDRS_SDT__DISPIEPIE_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__dispiekgm_Internalname = "GENERACIONHDRS_SDT__DISPIEKGM_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__dispiemtr_Internalname = "GENERACIONHDRS_SDT__DISPIEMTR_"+sGXsfl_68_fel_idx ;
      edtavGeneracionhdrs_sdt__maqcoddis_Internalname = "GENERACIONHDRS_SDT__MAQCODDIS_"+sGXsfl_68_fel_idx ;
   }

   public void sendrow_682( )
   {
      subsflControlProps_682( ) ;
      wb25R0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_68_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_68_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_68_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavGeneracionhdrs_sdt__seleccionar.getEnabled()!=0)&&(chkavGeneracionhdrs_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 69,'',false,'"+sGXsfl_68_idx+"',68)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "GENERACIONHDRS_SDT__SELECCIONAR_" + sGXsfl_68_idx ;
         chkavGeneracionhdrs_sdt__seleccionar.setName( GXCCtl );
         chkavGeneracionhdrs_sdt__seleccionar.setWebtags( "" );
         chkavGeneracionhdrs_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavGeneracionhdrs_sdt__seleccionar.getInternalname(), "TitleCaption", chkavGeneracionhdrs_sdt__seleccionar.getCaption(), !bGXsfl_68_Refreshing);
         chkavGeneracionhdrs_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavGeneracionhdrs_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Seleccionar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(69, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavGeneracionhdrs_sdt__seleccionar.getEnabled()!=0)&&(chkavGeneracionhdrs_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,69);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__discod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__discod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__discod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__discod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disfec_Internalname,localUtil.format(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disfec(), "99/99/99"),localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disfec(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disfec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disfec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__maccod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__maccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maccod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__maccod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__maccod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__clicod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Clicod(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__clicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Clicod()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Clicod()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__clicod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__clicod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__clinom_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Clinom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__clinom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__clinom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disenccli_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disenccli()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__dispart_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispart(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__dispart_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispart()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispart()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__dispart_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__dispart_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disartcod_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disartcod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disartcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disartcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disartdsc_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disartdsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disartdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disartdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__discolnom_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__discolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__discolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__discolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__discolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Discolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__discolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__discolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__distipcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Distipcol(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__distipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Distipcol()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Distipcol()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__distipcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__distipcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disnomcli_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disnomcli()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disnomcli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disnomcli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__disunimed_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disunimed()),GXutil.rtrim( localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Disunimed(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__disunimed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__disunimed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__dispiepie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__dispiepie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiepie()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__dispiepie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__dispiepie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__dispiekgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__dispiekgm_Enabled!=0) ? localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm(), "ZZZZZ9.99") : localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiekgm(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__dispiekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__dispiekgm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__dispiemtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavGeneracionhdrs_sdt__dispiemtr_Enabled!=0) ? localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr(), "ZZZZZ9.99") : localUtil.format( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Dispiemtr(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__dispiemtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__dispiemtr_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavGeneracionhdrs_sdt__maqcoddis_Internalname,GXutil.rtrim( ((app.SdtGeneracionHDRs_SDT_Item)AV19GeneracionHDRs_SDT.elementAt(-1+AV65GXV1)).getgxTv_SdtGeneracionHDRs_SDT_Item_Maqcoddis()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavGeneracionhdrs_sdt__maqcoddis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavGeneracionhdrs_sdt__maqcoddis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(68),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes25R2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_68_idx = ((subGrid_Islastpage==1)&&(nGXsfl_68_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_68_idx+1) ;
         sGXsfl_68_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_68_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_682( ) ;
      }
      /* End function sendrow_682 */
   }

   public void startgridcontrol68( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"68\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Seleccionar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Disp. Int.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Accesorio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido del Cliente ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Partida", "")) ;
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
         httpContext.writeValue( httpContext.getMessage( "TC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Maquina", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__discod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disfec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__maccod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__clicod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__clinom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__dispart_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disartcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disartdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__discolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__discolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__distipcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disnomcli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__disunimed_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__dispiepie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__dispiekgm_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__dispiemtr_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavGeneracionhdrs_sdt__maqcoddis_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnincluiraccesorios_Internalname = "BTNINCLUIRACCESORIOS" ;
      lblTextblockincluir_maccod_Internalname = "TEXTBLOCKINCLUIR_MACCOD" ;
      edtavIncluir_maccod_Internalname = "vINCLUIR_MACCOD" ;
      divUnnamedtableincluir_maccod_Internalname = "UNNAMEDTABLEINCLUIR_MACCOD" ;
      bttBtneliminaraccesorios_Internalname = "BTNELIMINARACCESORIOS" ;
      tblUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      grpUnnamedgroup4_Internalname = "UNNAMEDGROUP4" ;
      bttBtngenerarhdr_Internalname = "BTNGENERARHDR" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      grpUnnamedgroup6_Internalname = "UNNAMEDGROUP6" ;
      edtavBarnhdr_Internalname = "vBARNHDR" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnmarcartodas_Internalname = "BTNMARCARTODAS" ;
      bttBtndesmarcartodas_Internalname = "BTNDESMARCARTODAS" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      chkavGeneracionhdrs_sdt__seleccionar.setInternalname( "GENERACIONHDRS_SDT__SELECCIONAR" );
      edtavGeneracionhdrs_sdt__discod_Internalname = "GENERACIONHDRS_SDT__DISCOD" ;
      edtavGeneracionhdrs_sdt__disfec_Internalname = "GENERACIONHDRS_SDT__DISFEC" ;
      edtavGeneracionhdrs_sdt__maccod_Internalname = "GENERACIONHDRS_SDT__MACCOD" ;
      edtavGeneracionhdrs_sdt__clicod_Internalname = "GENERACIONHDRS_SDT__CLICOD" ;
      edtavGeneracionhdrs_sdt__clinom_Internalname = "GENERACIONHDRS_SDT__CLINOM" ;
      edtavGeneracionhdrs_sdt__disenccli_Internalname = "GENERACIONHDRS_SDT__DISENCCLI" ;
      edtavGeneracionhdrs_sdt__dispart_Internalname = "GENERACIONHDRS_SDT__DISPART" ;
      edtavGeneracionhdrs_sdt__disartcod_Internalname = "GENERACIONHDRS_SDT__DISARTCOD" ;
      edtavGeneracionhdrs_sdt__disartdsc_Internalname = "GENERACIONHDRS_SDT__DISARTDSC" ;
      edtavGeneracionhdrs_sdt__discolnom_Internalname = "GENERACIONHDRS_SDT__DISCOLNOM" ;
      edtavGeneracionhdrs_sdt__discolnum_Internalname = "GENERACIONHDRS_SDT__DISCOLNUM" ;
      edtavGeneracionhdrs_sdt__distipcol_Internalname = "GENERACIONHDRS_SDT__DISTIPCOL" ;
      edtavGeneracionhdrs_sdt__disnomcli_Internalname = "GENERACIONHDRS_SDT__DISNOMCLI" ;
      edtavGeneracionhdrs_sdt__disunimed_Internalname = "GENERACIONHDRS_SDT__DISUNIMED" ;
      edtavGeneracionhdrs_sdt__dispiepie_Internalname = "GENERACIONHDRS_SDT__DISPIEPIE" ;
      edtavGeneracionhdrs_sdt__dispiekgm_Internalname = "GENERACIONHDRS_SDT__DISPIEKGM" ;
      edtavGeneracionhdrs_sdt__dispiemtr_Internalname = "GENERACIONHDRS_SDT__DISPIEMTR" ;
      edtavGeneracionhdrs_sdt__maqcoddis_Internalname = "GENERACIONHDRS_SDT__MAQCODDIS" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_generarhdr_Internalname = "DVELOP_CONFIRMPANEL_GENERARHDR" ;
      tblTabledvelop_confirmpanel_generarhdr_Internalname = "TABLEDVELOP_CONFIRMPANEL_GENERARHDR" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Internalname = "DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS" ;
      tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Internalname = "DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS" ;
      tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS" ;
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
      edtavGeneracionhdrs_sdt__maqcoddis_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__maqcoddis_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiemtr_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__dispiemtr_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiekgm_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__dispiekgm_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiepie_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__dispiepie_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disunimed_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disunimed_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disnomcli_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disnomcli_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__distipcol_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__distipcol_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discolnum_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__discolnum_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discolnom_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__discolnom_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disartdsc_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disartdsc_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disartcod_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disartcod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispart_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__dispart_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disenccli_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disenccli_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__clinom_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__clinom_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__clicod_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__clicod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__maccod_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__maccod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disfec_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__disfec_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discod_Jsonclick = "" ;
      edtavGeneracionhdrs_sdt__discod_Enabled = 0 ;
      chkavGeneracionhdrs_sdt__seleccionar.setCaption( "" );
      chkavGeneracionhdrs_sdt__seleccionar.setVisible( -1 );
      chkavGeneracionhdrs_sdt__seleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavIncluir_maccod_Jsonclick = "" ;
      edtavIncluir_maccod_Enabled = 1 ;
      edtavGeneracionhdrs_sdt__maqcoddis_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__dispiemtr_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__dispiekgm_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__dispiepie_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disunimed_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disnomcli_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__distipcol_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__discolnum_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__discolnom_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disartdsc_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disartcod_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__dispart_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disenccli_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__clinom_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__clicod_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__maccod_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__disfec_Enabled = -1 ;
      edtavGeneracionhdrs_sdt__discod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavBarnhdr_Jsonclick = "" ;
      edtavBarnhdr_Enabled = 0 ;
      Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype = "1" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext = "¿Desea eliminar el accesorio?" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Title = "" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext = "¿Desea añadir el Nº Ped. Int.  al accesorio?" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Title = "" ;
      Dvelop_confirmpanel_generarhdr_Confirmtype = "1" ;
      Dvelop_confirmpanel_generarhdr_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_generarhdr_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_generarhdr_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_generarhdr_Confirmationtext = "¿Desea Generar HDR?" ;
      Dvelop_confirmpanel_generarhdr_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Generacion HDRs", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "GENERACIONHDRS_SDT__SELECCIONAR_" + sGXsfl_68_idx ;
      chkavGeneracionhdrs_sdt__seleccionar.setName( GXCCtl );
      chkavGeneracionhdrs_sdt__seleccionar.setWebtags( "" );
      chkavGeneracionhdrs_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavGeneracionhdrs_sdt__seleccionar.getInternalname(), "TitleCaption", chkavGeneracionhdrs_sdt__seleccionar.getCaption(), !bGXsfl_68_Refreshing);
      chkavGeneracionhdrs_sdt__seleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV39Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15DisEst',fld:'vDISEST',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1225R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV39Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1325R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV39Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2325R2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOMARCARTODAS'","{handler:'e1725R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV39Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV43Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''}]");
      setEventMetadata("'DOMARCARTODAS'",",oparms:[{av:'AV43Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DODESMARCARTODAS'","{handler:'e1825R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV39Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV43Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''}]");
      setEventMetadata("'DODESMARCARTODAS'",",oparms:[{av:'AV43Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOGENERARHDR'","{handler:'e1125R1',iparms:[]");
      setEventMetadata("'DOGENERARHDR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_GENERARHDR.CLOSE","{handler:'e1425R2',iparms:[{av:'Dvelop_confirmpanel_generarhdr_Result',ctrl:'DVELOP_CONFIRMPANEL_GENERARHDR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV39Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV54BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV48TablaHdrs_SDT',fld:'vTABLAHDRS_SDT',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_GENERARHDR.CLOSE",",oparms:[{av:'AV51discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV53MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV54BarCodP',fld:'vBARCODP',pic:'ZZZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV48TablaHdrs_SDT',fld:'vTABLAHDRS_SDT',pic:''},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV9BarNHdr',fld:'vBARNHDR',pic:''},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOINCLUIRACCESORIOS'","{handler:'e1925R2',iparms:[{av:'AV27Incluir_Maccod',fld:'vINCLUIR_MACCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'A1199MacCod',fld:'MACCOD',pic:'ZZZZZZZ9'},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'A1202MacDisCod',fld:'MACDISCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("'DOINCLUIRACCESORIOS'",",oparms:[{av:'AV51discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS.CLOSE","{handler:'e1525R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV39Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'Dvelop_confirmpanel_btnincluiraccesorios_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS',prop:'Result'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV51discod',fld:'vDISCOD',pic:'ZZZZZZZ9'},{av:'AV27Incluir_Maccod',fld:'vINCLUIR_MACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNINCLUIRACCESORIOS.CLOSE",",oparms:[{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOELIMINARACCESORIOS'","{handler:'e2025R2',iparms:[{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68}]");
      setEventMetadata("'DOELIMINARACCESORIOS'",",oparms:[{av:'AV53MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS.CLOSE","{handler:'e1625R2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV85Pgmname',fld:'vPGMNAME',pic:''},{av:'AV34Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV39Testrtm',fld:'vTESTRTM',pic:'ZZZ9',hsh:true},{av:'AV8UsurCod',fld:'vUSURCOD',pic:'@!',hsh:true},{av:'AV7Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV15DisEst',fld:'vDISEST',pic:'9',hsh:true},{av:'Dvelop_confirmpanel_btneliminaraccesorios_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS',prop:'Result'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV53MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNELIMINARACCESORIOS.CLOSE",",oparms:[{av:'AV53MacCod',fld:'vMACCOD',pic:'ZZZZZZZ9'},{av:'AV19GeneracionHDRs_SDT',fld:'vGENERACIONHDRS_SDT',grid:68,pic:''},{av:'nGXsfl_68_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:68},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_68',ctrl:'GRID',prop:'GridRC',grid:68},{av:'AV21GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV22GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_INCLUIR_MACCOD","{handler:'validv_Incluir_maccod',iparms:[]");
      setEventMetadata("VALIDV_INCLUIR_MACCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv20',iparms:[]");
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
      wcpOAV9BarNHdr = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_generarhdr_Result = "" ;
      Dvelop_confirmpanel_btnincluiraccesorios_Result = "" ;
      Dvelop_confirmpanel_btneliminaraccesorios_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5EmprCod = "" ;
      AV9BarNHdr = "" ;
      AV85Pgmname = "" ;
      AV8UsurCod = "" ;
      AV7Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV19GeneracionHDRs_SDT = new GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item>(app.SdtGeneracionHDRs_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      AV48TablaHdrs_SDT = new GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem>(app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem.class, "TabladeHdrs_SDTItem", "TexplusNET", remoteHandle);
      A396EmprCod = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtngenerarhdr_Jsonclick = "" ;
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtnmarcartodas_Jsonclick = "" ;
      bttBtndesmarcartodas_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV6EmprNom = "" ;
      GXv_char4 = new String[1] ;
      AV44WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV36ProgressIndicator = new com.genexuscore.genexus.common.ui.SdtProgress(remoteHandle, context);
      scmdbuf = "" ;
      H025R2_A1199MacCod = new int[1] ;
      H025R2_A396EmprCod = new String[] {""} ;
      H025R3_A1201MacLin = new short[1] ;
      H025R3_A1202MacDisCod = new int[1] ;
      H025R3_A396EmprCod = new String[] {""} ;
      H025R3_A1199MacCod = new int[1] ;
      Gx_msg = "" ;
      ucDvelop_confirmpanel_btnincluiraccesorios = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_btneliminaraccesorios = new com.genexus.webpanels.GXUserControl();
      AV52MaqCod = "" ;
      GXv_int10 = new int[1] ;
      AV46TabHdr = new String[1000] ;
      GX_I = 1 ;
      while ( GX_I <= 1000 )
      {
         AV46TabHdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_int8 = new byte[1] ;
      GXv_char5 = new String[1] ;
      AV47TabladeHdrs_SDTItem = new app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem(remoteHandle, context);
      AV55Inc_obs1 = "" ;
      GXv_int11 = new int[1] ;
      AV59Inc_obs2 = "" ;
      AV49TablaHdrs_SDTJson = "" ;
      GXt_objcol_SdtGeneracionHDRs_SDT_Item1 = new GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item>(app.SdtGeneracionHDRs_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtGeneracionHDRs_SDT_Item2 = new GXBaseCollection[1] ;
      GXt_char3 = "" ;
      GXv_char6 = new String[1] ;
      AV37Session = httpContext.getWebSession();
      AV23GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      ucDvelop_confirmpanel_generarhdr = new com.genexus.webpanels.GXUserControl();
      bttBtnincluiraccesorios_Jsonclick = "" ;
      lblTextblockincluir_maccod_Jsonclick = "" ;
      bttBtneliminaraccesorios_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.pedidos.generacionhdrs_wc1__default(),
         new Object[] {
             new Object[] {
            H025R2_A1199MacCod, H025R2_A396EmprCod
            }
            , new Object[] {
            H025R3_A1201MacLin, H025R3_A1202MacDisCod, H025R3_A396EmprCod, H025R3_A1199MacCod
            }
         }
      );
      AV85Pgmname = "Pedidos.GeneracionHDRs_WC1" ;
      /* GeneXus formulas. */
      AV85Pgmname = "Pedidos.GeneracionHDRs_WC1" ;
      Gx_err = (short)(0) ;
      edtavBarnhdr_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disfec_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__maccod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__clicod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__clinom_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disenccli_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispart_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disartcod_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disartdsc_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discolnom_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__discolnum_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__distipcol_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disnomcli_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__disunimed_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiepie_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiekgm_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__dispiemtr_Enabled = 0 ;
      edtavGeneracionhdrs_sdt__maqcoddis_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV15DisEst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV15DisEst ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXt_int7 ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV34Moda21 ;
   private short AV39Testrtm ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV10Carvitin ;
   private short AV60FlagMac ;
   private short AV61FlagDis ;
   private short AV26i ;
   private short AV30lineas ;
   private short AV38t ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_68 ;
   private int nGXsfl_68_idx=1 ;
   private int AV54BarCodP ;
   private int A1199MacCod ;
   private int A1202MacDisCod ;
   private int AV51discod ;
   private int AV53MacCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavBarnhdr_Enabled ;
   private int AV65GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavGeneracionhdrs_sdt__discod_Enabled ;
   private int edtavGeneracionhdrs_sdt__disfec_Enabled ;
   private int edtavGeneracionhdrs_sdt__maccod_Enabled ;
   private int edtavGeneracionhdrs_sdt__clicod_Enabled ;
   private int edtavGeneracionhdrs_sdt__clinom_Enabled ;
   private int edtavGeneracionhdrs_sdt__disenccli_Enabled ;
   private int edtavGeneracionhdrs_sdt__dispart_Enabled ;
   private int edtavGeneracionhdrs_sdt__disartcod_Enabled ;
   private int edtavGeneracionhdrs_sdt__disartdsc_Enabled ;
   private int edtavGeneracionhdrs_sdt__discolnom_Enabled ;
   private int edtavGeneracionhdrs_sdt__discolnum_Enabled ;
   private int edtavGeneracionhdrs_sdt__distipcol_Enabled ;
   private int edtavGeneracionhdrs_sdt__disnomcli_Enabled ;
   private int edtavGeneracionhdrs_sdt__disunimed_Enabled ;
   private int edtavGeneracionhdrs_sdt__dispiepie_Enabled ;
   private int edtavGeneracionhdrs_sdt__dispiekgm_Enabled ;
   private int edtavGeneracionhdrs_sdt__dispiemtr_Enabled ;
   private int edtavGeneracionhdrs_sdt__maqcoddis_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_68_fel_idx=1 ;
   private int AV27Incluir_Maccod ;
   private int AV35PageToGo ;
   private int nGXsfl_68_bak_idx=1 ;
   private int AV62MacCod2 ;
   private int GXv_int10[] ;
   private int AV56MacSav ;
   private int AV57Maccoditem ;
   private int GXv_int11[] ;
   private int edtavIncluir_maccod_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private int GX_I ;
   private long GRID_nFirstRecordOnPage ;
   private long AV21GridCurrentPage ;
   private long AV22GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV9BarNHdr ;
   private String Gridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_generarhdr_Result ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Result ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5EmprCod ;
   private String AV9BarNHdr ;
   private String sGXsfl_68_idx="0001" ;
   private String AV85Pgmname ;
   private String AV8UsurCod ;
   private String AV7Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Dvelop_confirmpanel_generarhdr_Title ;
   private String Dvelop_confirmpanel_generarhdr_Confirmationtext ;
   private String Dvelop_confirmpanel_generarhdr_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_generarhdr_Nobuttoncaption ;
   private String Dvelop_confirmpanel_generarhdr_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_generarhdr_Yesbuttonposition ;
   private String Dvelop_confirmpanel_generarhdr_Confirmtype ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Title ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Confirmationtext ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Confirmtype ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Title ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Confirmationtext ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String grpUnnamedgroup4_Internalname ;
   private String grpUnnamedgroup6_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtngenerarhdr_Internalname ;
   private String bttBtngenerarhdr_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String edtavBarnhdr_Internalname ;
   private String edtavBarnhdr_Jsonclick ;
   private String Barradeprogreso_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnmarcartodas_Internalname ;
   private String bttBtnmarcartodas_Jsonclick ;
   private String bttBtndesmarcartodas_Internalname ;
   private String bttBtndesmarcartodas_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavIncluir_maccod_Internalname ;
   private String edtavGeneracionhdrs_sdt__discod_Internalname ;
   private String edtavGeneracionhdrs_sdt__disfec_Internalname ;
   private String edtavGeneracionhdrs_sdt__maccod_Internalname ;
   private String edtavGeneracionhdrs_sdt__clicod_Internalname ;
   private String edtavGeneracionhdrs_sdt__clinom_Internalname ;
   private String edtavGeneracionhdrs_sdt__disenccli_Internalname ;
   private String edtavGeneracionhdrs_sdt__dispart_Internalname ;
   private String edtavGeneracionhdrs_sdt__disartcod_Internalname ;
   private String edtavGeneracionhdrs_sdt__disartdsc_Internalname ;
   private String edtavGeneracionhdrs_sdt__discolnom_Internalname ;
   private String edtavGeneracionhdrs_sdt__discolnum_Internalname ;
   private String edtavGeneracionhdrs_sdt__distipcol_Internalname ;
   private String edtavGeneracionhdrs_sdt__disnomcli_Internalname ;
   private String edtavGeneracionhdrs_sdt__disunimed_Internalname ;
   private String edtavGeneracionhdrs_sdt__dispiepie_Internalname ;
   private String edtavGeneracionhdrs_sdt__dispiekgm_Internalname ;
   private String edtavGeneracionhdrs_sdt__dispiemtr_Internalname ;
   private String edtavGeneracionhdrs_sdt__maqcoddis_Internalname ;
   private String sGXsfl_68_fel_idx="0001" ;
   private String hsh ;
   private String AV6EmprNom ;
   private String GXv_char4[] ;
   private String scmdbuf ;
   private String Gx_msg ;
   private String Dvelop_confirmpanel_btnincluiraccesorios_Internalname ;
   private String Dvelop_confirmpanel_btneliminaraccesorios_Internalname ;
   private String AV52MaqCod ;
   private String AV46TabHdr[] ;
   private String GXv_char5[] ;
   private String GXt_char3 ;
   private String GXv_char6[] ;
   private String tblTabledvelop_confirmpanel_btneliminaraccesorios_Internalname ;
   private String tblTabledvelop_confirmpanel_btnincluiraccesorios_Internalname ;
   private String tblTabledvelop_confirmpanel_generarhdr_Internalname ;
   private String Dvelop_confirmpanel_generarhdr_Internalname ;
   private String tblUnnamedtable3_Internalname ;
   private String bttBtnincluiraccesorios_Internalname ;
   private String bttBtnincluiraccesorios_Jsonclick ;
   private String divUnnamedtableincluir_maccod_Internalname ;
   private String lblTextblockincluir_maccod_Internalname ;
   private String lblTextblockincluir_maccod_Jsonclick ;
   private String edtavIncluir_maccod_Jsonclick ;
   private String bttBtneliminaraccesorios_Internalname ;
   private String bttBtneliminaraccesorios_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavGeneracionhdrs_sdt__discod_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disfec_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__maccod_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__clicod_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__clinom_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disenccli_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__dispart_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disartcod_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disartdsc_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__discolnom_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__discolnum_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__distipcol_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disnomcli_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__disunimed_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__dispiepie_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__dispiekgm_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__dispiemtr_Jsonclick ;
   private String edtavGeneracionhdrs_sdt__maqcoddis_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV43Var_seleccionar ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_68_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV68 ;
   private boolean gx_refresh_fired ;
   private boolean AV58seleccionar ;
   private String AV55Inc_obs1 ;
   private String AV59Inc_obs2 ;
   private String AV49TablaHdrs_SDTJson ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV37Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnincluiraccesorios ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btneliminaraccesorios ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_generarhdr ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavGeneracionhdrs_sdt__seleccionar ;
   private IDataStoreProvider pr_default ;
   private int[] H025R2_A1199MacCod ;
   private String[] H025R2_A396EmprCod ;
   private short[] H025R3_A1201MacLin ;
   private int[] H025R3_A1202MacDisCod ;
   private String[] H025R3_A396EmprCod ;
   private int[] H025R3_A1199MacCod ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item> AV19GeneracionHDRs_SDT ;
   private GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item> GXt_objcol_SdtGeneracionHDRs_SDT_Item1 ;
   private GXBaseCollection<app.SdtGeneracionHDRs_SDT_Item> GXv_objcol_SdtGeneracionHDRs_SDT_Item2[] ;
   private GXBaseCollection<app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem> AV48TablaHdrs_SDT ;
   private app.wwpbaseobjects.SdtWWPGridState AV23GridState ;
   private com.genexuscore.genexus.common.ui.SdtProgress AV36ProgressIndicator ;
   private app.wwpbaseobjects.SdtWWPContext AV44WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.SdtTabladeHdrs_SDT_TabladeHdrs_SDTItem AV47TabladeHdrs_SDTItem ;
}

final  class generacionhdrs_wc1__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H025R2", "SELECT MacCod, EmprCod FROM TXPCMACRO WHERE EmprCod = ? and MacCod = ? ORDER BY EmprCod, MacCod ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H025R3", "SELECT * FROM (SELECT MacLin, MacDisCod, EmprCod, MacCod FROM TXPLMACRO WHERE EmprCod = ? and MacDisCod = ? ORDER BY EmprCod, MacDisCod) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               return;
            case 1 :
               ((short[]) buf[0])[0] = rslt.getShort(1);
               ((int[]) buf[1])[0] = rslt.getInt(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((int[]) buf[3])[0] = rslt.getInt(4);
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
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               return;
      }
   }

}

