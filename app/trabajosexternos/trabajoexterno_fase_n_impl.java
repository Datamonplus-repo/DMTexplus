package app.trabajosexternos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class trabajoexterno_fase_n_impl extends GXDataArea
{
   public trabajoexterno_fase_n_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public trabajoexterno_fase_n_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( trabajoexterno_fase_n_impl.class ));
   }

   public trabajoexterno_fase_n_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavTrabajoexterno_fases_n_sdt__seleccionar = UIFactory.getCheckbox(this);
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
            AV8Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Emprcod", AV8Emprcod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV32SalExtAlb = (int)(GXutil.lval( httpContext.GetPar( "SalExtAlb"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV32SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32SalExtAlb), 8, 0));
               AV31Mancod = (short)(GXutil.lval( httpContext.GetPar( "Mancod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV31Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Mancod), 4, 0));
               AV30SalExtFec = localUtil.parseDateParm( httpContext.GetPar( "SalExtFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV30SalExtFec", localUtil.format(AV30SalExtFec, "99/99/99"));
               AV5Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Barcod), 8, 0));
               AV7Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
               AV6Barcodpar = httpContext.GetPar( "Barcodpar") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
               AV45SalExCoEIN = (int)(GXutil.lval( httpContext.GetPar( "SalExCoEIN"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV45SalExCoEIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45SalExCoEIN), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXCOEIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45SalExCoEIN), "ZZZZZ9")));
               AV46SalExKgEIN = CommonUtil.decimalVal( httpContext.GetPar( "SalExKgEIN"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV46SalExKgEIN", GXutil.ltrimstr( AV46SalExKgEIN, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXKGEIN", getSecureSignedToken( "", localUtil.format( AV46SalExKgEIN, "ZZZZZ9.99")));
               AV47SalExMtEIN = CommonUtil.decimalVal( httpContext.GetPar( "SalExMtEIN"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV47SalExMtEIN", GXutil.ltrimstr( AV47SalExMtEIN, 9, 2));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXMTEIN", getSecureSignedToken( "", localUtil.format( AV47SalExMtEIN, "ZZZZZ9.99")));
               AV41barunimed = httpContext.GetPar( "barunimed") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV41barunimed", AV41barunimed);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41barunimed, "@!"))));
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
      AV57Pgmname = httpContext.GetPar( "Pgmname") ;
      AV41barunimed = httpContext.GetPar( "barunimed") ;
      AV45SalExCoEIN = (int)(GXutil.lval( httpContext.GetPar( "SalExCoEIN"))) ;
      AV46SalExKgEIN = CommonUtil.decimalVal( httpContext.GetPar( "SalExKgEIN"), ".") ;
      AV47SalExMtEIN = CommonUtil.decimalVal( httpContext.GetPar( "SalExMtEIN"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV57Pgmname, AV41barunimed, AV45SalExCoEIN, AV46SalExKgEIN, AV47SalExMtEIN) ;
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
      pa27E2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start27E2( ) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.trabajosexternos.trabajoexterno_fase_n", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV32SalExtAlb,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31Mancod,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV30SalExtFec)),GXutil.URLEncode(GXutil.ltrimstr(AV5Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV45SalExCoEIN,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV46SalExKgEIN)),GXutil.URLEncode(DecimalUtil.decToString(AV47SalExMtEIN)),GXutil.URLEncode(GXutil.rtrim(AV41barunimed))}, new String[] {"Emprcod","SalExtAlb","Mancod","SalExtFec","Barcod","Barcodreo","Barcodpar","SalExCoEIN","SalExKgEIN","SalExMtEIN","barunimed"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41barunimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXCOEIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45SalExCoEIN), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXKGEIN", getSecureSignedToken( "", localUtil.format( AV46SalExKgEIN, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXMTEIN", getSecureSignedToken( "", localUtil.format( AV47SalExMtEIN, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Fase_n");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV57Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_fase_n:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Trabajoexterno_fases_n_sdt", AV20TrabajoExterno_Fases_n_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Trabajoexterno_fases_n_sdt", AV20TrabajoExterno_Fases_n_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_49", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_49, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vTRABAJOEXTERNO_FASES_N_SDT", AV20TrabajoExterno_Fases_n_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vTRABAJOEXTERNO_FASES_N_SDT", AV20TrabajoExterno_Fases_n_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV41barunimed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41barunimed, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV8Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMANCOD", GXutil.ltrim( localUtil.ntoc( AV31Mancod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXTALB", GXutil.ltrim( localUtil.ntoc( AV32SalExtAlb, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXTFEC", localUtil.dtoc( AV30SalExtFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV5Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV6Barcodpar));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vVAR_SELECCIONAR", AV38Var_seleccionar);
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXCOEIN", GXutil.ltrim( localUtil.ntoc( AV45SalExCoEIN, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXCOEIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45SalExCoEIN), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXKGEIN", GXutil.ltrim( localUtil.ntoc( AV46SalExKgEIN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXKGEIN", getSecureSignedToken( "", localUtil.format( AV46SalExKgEIN, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSALEXMTEIN", GXutil.ltrim( localUtil.ntoc( AV47SalExMtEIN, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXMTEIN", getSecureSignedToken( "", localUtil.format( AV47SalExMtEIN, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV39i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
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
         we27E2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt27E2( ) ;
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
      return formatLink("app.trabajosexternos.trabajoexterno_fase_n", new String[] {GXutil.URLEncode(GXutil.rtrim(AV8Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV32SalExtAlb,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV31Mancod,4,0)),GXutil.URLEncode(GXutil.formatDateParm(AV30SalExtFec)),GXutil.URLEncode(GXutil.ltrimstr(AV5Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV6Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV45SalExCoEIN,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV46SalExKgEIN)),GXutil.URLEncode(DecimalUtil.decToString(AV47SalExMtEIN)),GXutil.URLEncode(GXutil.rtrim(AV41barunimed))}, new String[] {"Emprcod","SalExtAlb","Mancod","SalExtFec","Barcod","Barcodreo","Barcodpar","SalExCoEIN","SalExKgEIN","SalExMtEIN","barunimed"})  ;
   }

   public String getPgmname( )
   {
      return "TrabajosExternos.TrabajoExterno_Fase_n" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Selecciona Tabla BARFAS", "") ;
   }

   public void wb27E0( )
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
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_TrabajosExternos\\TrabajoExterno_Fase_n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexcoe_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexcoe_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexcoe_Internalname, GXutil.ltrim( localUtil.ntoc( AV42SalExCoE, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalexcoe_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV42SalExCoE), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV42SalExCoE), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,24);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexcoe_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexcoe_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Fase_n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexkge_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexkge_Internalname, httpContext.getMessage( "Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 28,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexkge_Internalname, GXutil.ltrim( localUtil.ntoc( AV43SalExKgE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalexkge_Enabled!=0) ? localUtil.format( AV43SalExKgE, "ZZZZZ9.99") : localUtil.format( AV43SalExKgE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,28);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexkge_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexkge_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Fase_n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavSalexmte_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavSalexmte_Internalname, httpContext.getMessage( "Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_49_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavSalexmte_Internalname, GXutil.ltrim( localUtil.ntoc( AV44SalExMtE, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavSalexmte_Enabled!=0) ? localUtil.format( AV44SalExMtE, "ZZZZZ9.99") : localUtil.format( AV44SalExMtE, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavSalexmte_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavSalexmte_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_TrabajosExternos\\TrabajoExterno_Fase_n.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Fase_n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmarcartodos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", "++", bttBtnmarcartodos_Jsonclick, 7, "++", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1127e1_client"+"'", TempTags, "", 2, "HLP_TrabajosExternos\\TrabajoExterno_Fase_n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndesmarcartodos_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", "--", bttBtndesmarcartodos_Jsonclick, 7, "--", "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e1227e1_client"+"'", TempTags, "", 2, "HLP_TrabajosExternos\\TrabajoExterno_Fase_n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 46,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 49, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_TrabajosExternos\\TrabajoExterno_Fase_n.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
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
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            AV51GXV1 = nGXsfl_49_idx ;
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
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV57Pgmname), GXutil.rtrim( localUtil.format( AV57Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_TrabajosExternos\\TrabajoExterno_Fase_n.htm");
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
         wb_table1_65_27E2( true) ;
      }
      else
      {
         wb_table1_65_27E2( false) ;
      }
      return  ;
   }

   public void wb_table1_65_27E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               AV51GXV1 = nGXsfl_49_idx ;
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

   public void start27E2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Selecciona Tabla BARFAS", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup27E0( ) ;
   }

   public void ws27E2( )
   {
      start27E2( ) ;
      evt27E2( ) ;
   }

   public void evt27E2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1327E2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e1427E2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1527E2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_49_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_492( ) ;
                           AV51GXV1 = nGXsfl_49_idx ;
                           if ( ( AV20TrabajoExterno_Fases_n_SDT.size() >= AV51GXV1 ) && ( AV51GXV1 > 0 ) )
                           {
                              AV20TrabajoExterno_Fases_n_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)) );
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
                                 e1627E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1727E2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1827E2 ();
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

   public void we27E2( )
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

   public void pa27E2( )
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
            GX_FocusControl = edtavSalexcoe_Internalname ;
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
                                 String AV57Pgmname ,
                                 String AV41barunimed ,
                                 int AV45SalExCoEIN ,
                                 java.math.BigDecimal AV46SalExKgEIN ,
                                 java.math.BigDecimal AV47SalExMtEIN )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1727E2 ();
      GRID_nCurrentRecord = 0 ;
      rf27E2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Fase_n");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV57Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("trabajosexternos\\trabajoexterno_fase_n:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_49_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf27E2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV57Pgmname = "TrabajosExternos.TrabajoExterno_Fase_n" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Pgmname", AV57Pgmname);
      Gx_err = (short)(0) ;
      edtavTrabajoexterno_fases_n_sdt__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_fases_n_sdt__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_fases_n_sdt__procod_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavTrabajoexterno_fases_n_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_fases_n_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_fases_n_sdt__barordlin_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavTrabajoexterno_fases_n_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_fases_n_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_fases_n_sdt__fascod_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27E2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(49) ;
      /* Execute user event: Refresh */
      e1727E2 ();
      nGXsfl_49_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_492( ) ;
      bGXsfl_49_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_492( ) ;
         e1827E2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_49_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1827E2 ();
         }
         wbEnd = (short)(49) ;
         wb27E0( ) ;
      }
      bGXsfl_49_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes27E2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vBARUNIMED", GXutil.rtrim( AV41barunimed));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41barunimed, "@!"))));
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
      return AV20TrabajoExterno_Fases_n_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV57Pgmname, AV41barunimed, AV45SalExCoEIN, AV46SalExKgEIN, AV47SalExMtEIN) ;
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
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV57Pgmname, AV41barunimed, AV45SalExCoEIN, AV46SalExKgEIN, AV47SalExMtEIN) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV57Pgmname, AV41barunimed, AV45SalExCoEIN, AV46SalExKgEIN, AV47SalExMtEIN) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV57Pgmname, AV41barunimed, AV45SalExCoEIN, AV46SalExKgEIN, AV47SalExMtEIN) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV57Pgmname, AV41barunimed, AV45SalExCoEIN, AV46SalExKgEIN, AV47SalExMtEIN) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV57Pgmname = "TrabajosExternos.TrabajoExterno_Fase_n" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Pgmname", AV57Pgmname);
      Gx_err = (short)(0) ;
      edtavTrabajoexterno_fases_n_sdt__procod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_fases_n_sdt__procod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_fases_n_sdt__procod_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavTrabajoexterno_fases_n_sdt__barordlin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_fases_n_sdt__barordlin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_fases_n_sdt__barordlin_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavTrabajoexterno_fases_n_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTrabajoexterno_fases_n_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTrabajoexterno_fases_n_sdt__fascod_Enabled), 5, 0), !bGXsfl_49_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup27E0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1627E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Trabajoexterno_fases_n_sdt"), AV20TrabajoExterno_Fases_n_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vTRABAJOEXTERNO_FASES_N_SDT"), AV20TrabajoExterno_Fases_n_SDT);
         /* Read saved values. */
         nRC_GXsfl_49 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_49"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39i = (short)(localUtil.ctol( httpContext.cgiGet( "vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV38Var_seleccionar = GXutil.strtobool( httpContext.cgiGet( "vVAR_SELECCIONAR")) ;
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
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         nRC_GXsfl_49 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_49"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_49_fel_idx = 0 ;
         while ( nGXsfl_49_fel_idx < nRC_GXsfl_49 )
         {
            nGXsfl_49_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_49_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_49_fel_idx+1) ;
            sGXsfl_49_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_492( ) ;
            AV51GXV1 = nGXsfl_49_fel_idx ;
            if ( ( AV20TrabajoExterno_Fases_n_SDT.size() >= AV51GXV1 ) && ( AV51GXV1 > 0 ) )
            {
               AV20TrabajoExterno_Fases_n_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)) );
            }
         }
         if ( nGXsfl_49_fel_idx == 0 )
         {
            nGXsfl_49_idx = 1 ;
            sGXsfl_49_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_49_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_492( ) ;
         }
         nGXsfl_49_fel_idx = 1 ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavSalexcoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavSalexcoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXCOE");
            GX_FocusControl = edtavSalexcoe_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV42SalExCoE = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42SalExCoE), 6, 0));
         }
         else
         {
            AV42SalExCoE = (int)(localUtil.ctol( httpContext.cgiGet( edtavSalexcoe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42SalExCoE), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSalexkge_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalexkge_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXKGE");
            GX_FocusControl = edtavSalexkge_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43SalExKgE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43SalExKgE", GXutil.ltrimstr( AV43SalExKgE, 9, 2));
         }
         else
         {
            AV43SalExKgE = localUtil.ctond( httpContext.cgiGet( edtavSalexkge_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43SalExKgE", GXutil.ltrimstr( AV43SalExKgE, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavSalexmte_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavSalexmte_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vSALEXMTE");
            GX_FocusControl = edtavSalexmte_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV44SalExMtE = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44SalExMtE", GXutil.ltrimstr( AV44SalExMtE, 9, 2));
         }
         else
         {
            AV44SalExMtE = localUtil.ctond( httpContext.cgiGet( edtavSalexmte_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44SalExMtE", GXutil.ltrimstr( AV44SalExMtE, 9, 2));
         }
         AV57Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57Pgmname", AV57Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"TrabajoExterno_Fase_n");
         AV57Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57Pgmname", AV57Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV57Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("trabajosexternos\\trabajoexterno_fase_n:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1627E2 ();
      if (returnInSub) return;
   }

   public void e1627E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV22Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      trabajoexterno_fase_n_impl.this.GXt_char1 = GXv_char2[0] ;
      AV22Station = GXt_char1 ;
      GXv_char2[0] = AV8Emprcod ;
      GXv_char3[0] = AV23EmprNom ;
      GXv_char4[0] = AV24UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV22Station, GXv_char2, GXv_char3, GXv_char4) ;
      trabajoexterno_fase_n_impl.this.AV8Emprcod = GXv_char2[0] ;
      trabajoexterno_fase_n_impl.this.AV23EmprNom = GXv_char3[0] ;
      trabajoexterno_fase_n_impl.this.AV24UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Emprcod", AV8Emprcod);
      subGrid_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Selecciona Tabla BARFAS", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXt_char1 = AV40TrabajoExterno_Fases_n_SDT_json ;
      GXv_char4[0] = GXt_char1 ;
      new app.trabajosexternos.trabajoexterno_fases_n_pc(remoteHandle, context).execute( AV8Emprcod, AV5Barcod, AV7Barcodreo, AV6Barcodpar, GXv_char4) ;
      trabajoexterno_fase_n_impl.this.GXt_char1 = GXv_char4[0] ;
      AV40TrabajoExterno_Fases_n_SDT_json = GXt_char1 ;
      AV20TrabajoExterno_Fases_n_SDT.fromJSonString(AV40TrabajoExterno_Fases_n_SDT_json, null);
      gx_BV49 = true ;
      AV42SalExCoE = AV45SalExCoEIN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42SalExCoE), 6, 0));
      AV43SalExKgE = AV46SalExKgEIN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43SalExKgE", GXutil.ltrimstr( AV43SalExKgE, 9, 2));
      AV44SalExMtE = AV47SalExMtEIN ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44SalExMtE", GXutil.ltrimstr( AV44SalExMtE, 9, 2));
   }

   public void e1727E2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext5[0] = AV21WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext5) ;
      AV21WWPContext = GXv_SdtWWPContext5[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S132 ();
      if (returnInSub) return;
   }

   private void e1827E2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV51GXV1 = 1 ;
      while ( AV51GXV1 <= AV20TrabajoExterno_Fases_n_SDT.size() )
      {
         AV20TrabajoExterno_Fases_n_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(49) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_492( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_49_Refreshing )
         {
            httpContext.doAjaxLoad(49, GridRow);
         }
         AV51GXV1 = (int)(AV51GXV1+1) ;
      }
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1427E2 ();
      if (returnInSub) return;
   }

   public void e1427E2( )
   {
      AV51GXV1 = nGXsfl_49_idx ;
      if ( ( AV51GXV1 > 0 ) && ( AV20TrabajoExterno_Fases_n_SDT.size() >= AV51GXV1 ) )
      {
         AV20TrabajoExterno_Fases_n_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)) );
      }
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      AV28lineas = (short)(0) ;
      AV58GXV7 = 1 ;
      while ( AV58GXV7 <= AV20TrabajoExterno_Fases_n_SDT.size() )
      {
         AV29TrabajoExterno_Fases_n_SDT_item = (app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV58GXV7));
         if ( AV29TrabajoExterno_Fases_n_SDT_item.getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar() )
         {
            AV28lineas = (short)(AV28lineas+1) ;
         }
         AV58GXV7 = (int)(AV58GXV7+1) ;
      }
      if ( (0==AV28lineas) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "NO ha seleccionado ninguna linea", ""));
      }
      else
      {
         if ( ( AV43SalExKgE.doubleValue() == 0 ) && ( AV44SalExMtE.doubleValue() == 0 ) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Faltan Kilos y/o Metros", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavSalexkge_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( ( GXutil.strcmp(AV41barunimed, "K") == 0 ) && ( AV43SalExKgE.doubleValue() == 0 ) )
            {
               lblTbmessage_Caption = httpContext.getMessage( "La unidad de la HDR es K,Faltan Kilos", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               httpContext.doAjaxRefresh();
               GX_FocusControl = edtavSalexkge_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( ( GXutil.strcmp(AV41barunimed, "M") == 0 ) && ( AV44SalExMtE.doubleValue() == 0 ) )
               {
                  lblTbmessage_Caption = httpContext.getMessage( "La unidad de la HDR es M,Faltan Metros", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  httpContext.doAjaxRefresh();
                  GX_FocusControl = edtavSalexmte_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  Dvelop_confirmpanel_enter_Confirmationtext = httpContext.getMessage( "Ha seleccionado ", "")+GXutil.trim( GXutil.str( AV28lineas, 4, 0))+httpContext.getMessage( "linea(s)", "")+GXutil.newLine( ) ;
                  ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
                  Dvelop_confirmpanel_enter_Confirmationtext = Dvelop_confirmpanel_enter_Confirmationtext+httpContext.getMessage( "Si confirma, el programa generara ", "")+GXutil.trim( GXutil.str( AV28lineas, 4, 0))+httpContext.getMessage( " movimiento(s)", "")+GXutil.newLine( ) ;
                  ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
                  Dvelop_confirmpanel_enter_Confirmationtext = Dvelop_confirmpanel_enter_Confirmationtext+httpContext.getMessage( "Confirma el proceso?", "") ;
                  ucDvelop_confirmpanel_enter.sendProperty(context, "", false, Dvelop_confirmpanel_enter_Internalname, "ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
                  this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1327E2( )
   {
      AV51GXV1 = nGXsfl_49_idx ;
      if ( ( AV51GXV1 > 0 ) && ( AV20TrabajoExterno_Fases_n_SDT.size() >= AV51GXV1 ) )
      {
         AV20TrabajoExterno_Fases_n_SDT.currentItem( ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)) );
      }
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S142 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1527E2( )
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

   public void S132( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      AV59GXV8 = 1 ;
      while ( AV59GXV8 <= AV20TrabajoExterno_Fases_n_SDT.size() )
      {
         AV29TrabajoExterno_Fases_n_SDT_item = (app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV59GXV8));
         if ( AV29TrabajoExterno_Fases_n_SDT_item.getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar() )
         {
            AV33BarOrdLin = AV29TrabajoExterno_Fases_n_SDT_item.getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin() ;
            AV34FasCod = AV29TrabajoExterno_Fases_n_SDT_item.getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod() ;
            AV48FasdscMn = AV29TrabajoExterno_Fases_n_SDT_item.getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc() ;
            GXv_char4[0] = AV8Emprcod ;
            GXv_int6[0] = AV31Mancod ;
            GXv_int7[0] = AV32SalExtAlb ;
            GXv_date8[0] = AV30SalExtFec ;
            GXv_int9[0] = AV5Barcod ;
            GXv_int10[0] = AV7Barcodreo ;
            GXv_char3[0] = AV6Barcodpar ;
            GXv_int11[0] = AV33BarOrdLin ;
            GXv_decimal12[0] = AV43SalExKgE ;
            GXv_decimal13[0] = AV44SalExMtE ;
            GXv_int14[0] = AV42SalExCoE ;
            GXv_char2[0] = AV34FasCod ;
            GXv_char15[0] = AV48FasdscMn ;
            new app.pwork00(remoteHandle, context).execute( GXv_char4, GXv_int6, GXv_int7, GXv_date8, GXv_int9, GXv_int10, GXv_char3, GXv_int11, GXv_decimal12, GXv_decimal13, GXv_int14, GXv_char2, GXv_char15) ;
            trabajoexterno_fase_n_impl.this.AV8Emprcod = GXv_char4[0] ;
            trabajoexterno_fase_n_impl.this.AV31Mancod = GXv_int6[0] ;
            trabajoexterno_fase_n_impl.this.AV32SalExtAlb = GXv_int7[0] ;
            trabajoexterno_fase_n_impl.this.AV30SalExtFec = GXv_date8[0] ;
            trabajoexterno_fase_n_impl.this.AV5Barcod = GXv_int9[0] ;
            trabajoexterno_fase_n_impl.this.AV7Barcodreo = GXv_int10[0] ;
            trabajoexterno_fase_n_impl.this.AV6Barcodpar = GXv_char3[0] ;
            trabajoexterno_fase_n_impl.this.AV33BarOrdLin = GXv_int11[0] ;
            trabajoexterno_fase_n_impl.this.AV43SalExKgE = GXv_decimal12[0] ;
            trabajoexterno_fase_n_impl.this.AV44SalExMtE = GXv_decimal13[0] ;
            trabajoexterno_fase_n_impl.this.AV42SalExCoE = GXv_int14[0] ;
            trabajoexterno_fase_n_impl.this.AV34FasCod = GXv_char2[0] ;
            trabajoexterno_fase_n_impl.this.AV48FasdscMn = GXv_char15[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8Emprcod", AV8Emprcod);
            httpContext.ajax_rsp_assign_attri("", false, "AV31Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Mancod), 4, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV32SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32SalExtAlb), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV30SalExtFec", localUtil.format(AV30SalExtFec, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, "AV5Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Barcod), 8, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
            httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
            httpContext.ajax_rsp_assign_attri("", false, "AV43SalExKgE", GXutil.ltrimstr( AV43SalExKgE, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV44SalExMtE", GXutil.ltrimstr( AV44SalExMtE, 9, 2));
            httpContext.ajax_rsp_assign_attri("", false, "AV42SalExCoE", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42SalExCoE), 6, 0));
         }
         AV59GXV8 = (int)(AV59GXV8+1) ;
      }
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV19Session.getValue(AV57Pgmname+"GridState"), "") == 0 )
      {
         AV12GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV57Pgmname+"GridState"), null, null);
      }
      else
      {
         AV12GridState.fromxml(AV19Session.getValue(AV57Pgmname+"GridState"), null, null);
      }
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV12GridState.fromxml(AV19Session.getValue(AV57Pgmname+"GridState"), null, null);
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV57Pgmname+"GridState", AV12GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S152( )
   {
      /* 'APLICOGRID' Routine */
      returnInSub = false ;
      AV39i = (short)(1) ;
      while ( AV39i <= AV20TrabajoExterno_Fases_n_SDT.size() )
      {
         ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV39i)).setgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar( AV38Var_seleccionar );
         AV39i = (short)(AV39i+1) ;
      }
   }

   public void wb_table1_65_27E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_65_27E2e( true) ;
      }
      else
      {
         wb_table1_65_27E2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV8Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Emprcod", AV8Emprcod);
      AV32SalExtAlb = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32SalExtAlb", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32SalExtAlb), 8, 0));
      AV31Mancod = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31Mancod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31Mancod), 4, 0));
      AV30SalExtFec = (java.util.Date)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30SalExtFec", localUtil.format(AV30SalExtFec, "99/99/99"));
      AV5Barcod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV5Barcod), 8, 0));
      AV7Barcodreo = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
      AV6Barcodpar = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Barcodpar", AV6Barcodpar);
      AV45SalExCoEIN = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45SalExCoEIN", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV45SalExCoEIN), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXCOEIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV45SalExCoEIN), "ZZZZZ9")));
      AV46SalExKgEIN = (java.math.BigDecimal)getParm(obj,8) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46SalExKgEIN", GXutil.ltrimstr( AV46SalExKgEIN, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXKGEIN", getSecureSignedToken( "", localUtil.format( AV46SalExKgEIN, "ZZZZZ9.99")));
      AV47SalExMtEIN = (java.math.BigDecimal)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47SalExMtEIN", GXutil.ltrimstr( AV47SalExMtEIN, 9, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALEXMTEIN", getSecureSignedToken( "", localUtil.format( AV47SalExMtEIN, "ZZZZZ9.99")));
      AV41barunimed = (String)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41barunimed", AV41barunimed);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vBARUNIMED", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV41barunimed, "@!"))));
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
      pa27E2( ) ;
      ws27E2( ) ;
      we27E2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116145583", true, true);
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
      httpContext.AddJavascriptSource("trabajosexternos/trabajoexterno_fase_n.js", "?202682116145583", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_492( )
   {
      chkavTrabajoexterno_fases_n_sdt__seleccionar.setInternalname( "TRABAJOEXTERNO_FASES_N_SDT__SELECCIONAR_"+sGXsfl_49_idx );
      edtavTrabajoexterno_fases_n_sdt__procod_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__PROCOD_"+sGXsfl_49_idx ;
      edtavTrabajoexterno_fases_n_sdt__barordlin_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__BARORDLIN_"+sGXsfl_49_idx ;
      edtavTrabajoexterno_fases_n_sdt__fascod_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__FASCOD_"+sGXsfl_49_idx ;
      edtavTrabajoexterno_fases_n_sdt__fasdsc_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__FASDSC_"+sGXsfl_49_idx ;
   }

   public void subsflControlProps_fel_492( )
   {
      chkavTrabajoexterno_fases_n_sdt__seleccionar.setInternalname( "TRABAJOEXTERNO_FASES_N_SDT__SELECCIONAR_"+sGXsfl_49_fel_idx );
      edtavTrabajoexterno_fases_n_sdt__procod_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__PROCOD_"+sGXsfl_49_fel_idx ;
      edtavTrabajoexterno_fases_n_sdt__barordlin_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__BARORDLIN_"+sGXsfl_49_fel_idx ;
      edtavTrabajoexterno_fases_n_sdt__fascod_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__FASCOD_"+sGXsfl_49_fel_idx ;
      edtavTrabajoexterno_fases_n_sdt__fasdsc_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__FASDSC_"+sGXsfl_49_fel_idx ;
   }

   public void sendrow_492( )
   {
      subsflControlProps_492( ) ;
      wb27E0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_49_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_49_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavTrabajoexterno_fases_n_sdt__seleccionar.getEnabled()!=0)&&(chkavTrabajoexterno_fases_n_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 50,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "TRABAJOEXTERNO_FASES_N_SDT__SELECCIONAR_" + sGXsfl_49_idx ;
         chkavTrabajoexterno_fases_n_sdt__seleccionar.setName( GXCCtl );
         chkavTrabajoexterno_fases_n_sdt__seleccionar.setWebtags( "" );
         chkavTrabajoexterno_fases_n_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_fases_n_sdt__seleccionar.getInternalname(), "TitleCaption", chkavTrabajoexterno_fases_n_sdt__seleccionar.getCaption(), !bGXsfl_49_Refreshing);
         chkavTrabajoexterno_fases_n_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavTrabajoexterno_fases_n_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Seleccionar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(50, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavTrabajoexterno_fases_n_sdt__seleccionar.getEnabled()!=0)&&(chkavTrabajoexterno_fases_n_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,50);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_fases_n_sdt__procod_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Procod()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_fases_n_sdt__procod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_fases_n_sdt__procod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_fases_n_sdt__barordlin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavTrabajoexterno_fases_n_sdt__barordlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Barordlin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_fases_n_sdt__barordlin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_fases_n_sdt__barordlin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_fases_n_sdt__fascod_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod()),GXutil.rtrim( localUtil.format( ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fascod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_fases_n_sdt__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavTrabajoexterno_fases_n_sdt__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavTrabajoexterno_fases_n_sdt__fasdsc_Enabled!=0)&&(edtavTrabajoexterno_fases_n_sdt__fasdsc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 54,'',false,'"+sGXsfl_49_idx+"',49)\"" : " ") ;
         ROClassString = "AttributeWidth100Porc" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTrabajoexterno_fases_n_sdt__fasdsc_Internalname,GXutil.rtrim( ((app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item)AV20TrabajoExterno_Fases_n_SDT.elementAt(-1+AV51GXV1)).getgxTv_SdtTrabajoExterno_Fases_n_SDT_Item_Fasdsc()),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavTrabajoexterno_fases_n_sdt__fasdsc_Enabled!=0)&&(edtavTrabajoexterno_fases_n_sdt__fasdsc_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,54);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavTrabajoexterno_fases_n_sdt__fasdsc_Jsonclick,Integer.valueOf(0),"AttributeWidth100Porc","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(49),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes27E2( ) ;
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
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"AttributeWidth100Porc"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_fases_n_sdt__procod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_fases_n_sdt__barordlin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTrabajoexterno_fases_n_sdt__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
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
      lblTbmessage_Internalname = "TBMESSAGE" ;
      edtavSalexcoe_Internalname = "vSALEXCOE" ;
      edtavSalexkge_Internalname = "vSALEXKGE" ;
      edtavSalexmte_Internalname = "vSALEXMTE" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnmarcartodos_Internalname = "BTNMARCARTODOS" ;
      bttBtndesmarcartodos_Internalname = "BTNDESMARCARTODOS" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      chkavTrabajoexterno_fases_n_sdt__seleccionar.setInternalname( "TRABAJOEXTERNO_FASES_N_SDT__SELECCIONAR" );
      edtavTrabajoexterno_fases_n_sdt__procod_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__PROCOD" ;
      edtavTrabajoexterno_fases_n_sdt__barordlin_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__BARORDLIN" ;
      edtavTrabajoexterno_fases_n_sdt__fascod_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__FASCOD" ;
      edtavTrabajoexterno_fases_n_sdt__fasdsc_Internalname = "TRABAJOEXTERNO_FASES_N_SDT__FASDSC" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      edtavTrabajoexterno_fases_n_sdt__fasdsc_Jsonclick = "" ;
      edtavTrabajoexterno_fases_n_sdt__fasdsc_Visible = -1 ;
      edtavTrabajoexterno_fases_n_sdt__fasdsc_Enabled = 1 ;
      edtavTrabajoexterno_fases_n_sdt__fascod_Jsonclick = "" ;
      edtavTrabajoexterno_fases_n_sdt__fascod_Enabled = 0 ;
      edtavTrabajoexterno_fases_n_sdt__barordlin_Jsonclick = "" ;
      edtavTrabajoexterno_fases_n_sdt__barordlin_Enabled = 0 ;
      edtavTrabajoexterno_fases_n_sdt__procod_Jsonclick = "" ;
      edtavTrabajoexterno_fases_n_sdt__procod_Enabled = 0 ;
      chkavTrabajoexterno_fases_n_sdt__seleccionar.setCaption( "" );
      chkavTrabajoexterno_fases_n_sdt__seleccionar.setVisible( -1 );
      chkavTrabajoexterno_fases_n_sdt__seleccionar.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTrabajoexterno_fases_n_sdt__fascod_Enabled = -1 ;
      edtavTrabajoexterno_fases_n_sdt__barordlin_Enabled = -1 ;
      edtavTrabajoexterno_fases_n_sdt__procod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavSalexmte_Jsonclick = "" ;
      edtavSalexmte_Enabled = 1 ;
      edtavSalexkge_Jsonclick = "" ;
      edtavSalexkge_Enabled = 1 ;
      edtavSalexcoe_Jsonclick = "" ;
      edtavSalexcoe_Enabled = 1 ;
      lblTbmessage_Caption = "  " ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
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
      Form.setCaption( httpContext.getMessage( "Selecciona Tabla BARFAS", "") );
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "TRABAJOEXTERNO_FASES_N_SDT__SELECCIONAR_" + sGXsfl_49_idx ;
      chkavTrabajoexterno_fases_n_sdt__seleccionar.setName( GXCCtl );
      chkavTrabajoexterno_fases_n_sdt__seleccionar.setWebtags( "" );
      chkavTrabajoexterno_fases_n_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavTrabajoexterno_fases_n_sdt__seleccionar.getInternalname(), "TitleCaption", chkavTrabajoexterno_fases_n_sdt__seleccionar.getCaption(), !bGXsfl_49_Refreshing);
      chkavTrabajoexterno_fases_n_sdt__seleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV20TrabajoExterno_Fases_n_SDT',fld:'vTRABAJOEXTERNO_FASES_N_SDT',grid:49,pic:''},{av:'nGXsfl_49_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:49},{av:'nRC_GXsfl_49',ctrl:'GRID',prop:'GridRC',grid:49},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV45SalExCoEIN',fld:'vSALEXCOEIN',pic:'ZZZZZ9',hsh:true},{av:'AV46SalExKgEIN',fld:'vSALEXKGEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV47SalExMtEIN',fld:'vSALEXMTEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e1827E2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e1427E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV20TrabajoExterno_Fases_n_SDT',fld:'vTRABAJOEXTERNO_FASES_N_SDT',grid:49,pic:''},{av:'nGXsfl_49_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:49},{av:'nRC_GXsfl_49',ctrl:'GRID',prop:'GridRC',grid:49},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''},{av:'AV41barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV45SalExCoEIN',fld:'vSALEXCOEIN',pic:'ZZZZZ9',hsh:true},{av:'AV46SalExKgEIN',fld:'vSALEXKGEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV47SalExMtEIN',fld:'vSALEXMTEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV43SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV44SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'Dvelop_confirmpanel_enter_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e1327E2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'AV20TrabajoExterno_Fases_n_SDT',fld:'vTRABAJOEXTERNO_FASES_N_SDT',grid:49,pic:''},{av:'nGXsfl_49_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:49},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_49',ctrl:'GRID',prop:'GridRC',grid:49},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV31Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV32SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV30SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV5Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV43SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV44SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV42SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV42SalExCoE',fld:'vSALEXCOE',pic:'ZZZZZ9'},{av:'AV44SalExMtE',fld:'vSALEXMTE',pic:'ZZZZZ9.99'},{av:'AV43SalExKgE',fld:'vSALEXKGE',pic:'ZZZZZ9.99'},{av:'AV6Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV5Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV30SalExtFec',fld:'vSALEXTFEC',pic:''},{av:'AV32SalExtAlb',fld:'vSALEXTALB',pic:'ZZZZZZZ9'},{av:'AV31Mancod',fld:'vMANCOD',pic:'ZZZ9'},{av:'AV8Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOMARCARTODOS'","{handler:'e1127E1',iparms:[{av:'AV20TrabajoExterno_Fases_n_SDT',fld:'vTRABAJOEXTERNO_FASES_N_SDT',grid:49,pic:''},{av:'nGXsfl_49_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:49},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_49',ctrl:'GRID',prop:'GridRC',grid:49},{av:'AV38Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV45SalExCoEIN',fld:'vSALEXCOEIN',pic:'ZZZZZ9',hsh:true},{av:'AV46SalExKgEIN',fld:'vSALEXKGEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV47SalExMtEIN',fld:'vSALEXMTEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("'DOMARCARTODOS'",",oparms:[{av:'AV38Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV20TrabajoExterno_Fases_n_SDT',fld:'vTRABAJOEXTERNO_FASES_N_SDT',grid:49,pic:''},{av:'nGXsfl_49_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:49},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_49',ctrl:'GRID',prop:'GridRC',grid:49}]}");
      setEventMetadata("'DODESMARCARTODOS'","{handler:'e1227E1',iparms:[{av:'AV20TrabajoExterno_Fases_n_SDT',fld:'vTRABAJOEXTERNO_FASES_N_SDT',grid:49,pic:''},{av:'nGXsfl_49_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:49},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_49',ctrl:'GRID',prop:'GridRC',grid:49},{av:'AV38Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV45SalExCoEIN',fld:'vSALEXCOEIN',pic:'ZZZZZ9',hsh:true},{av:'AV46SalExKgEIN',fld:'vSALEXKGEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV47SalExMtEIN',fld:'vSALEXMTEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("'DODESMARCARTODOS'",",oparms:[{av:'AV38Var_seleccionar',fld:'vVAR_SELECCIONAR',pic:''},{av:'AV20TrabajoExterno_Fases_n_SDT',fld:'vTRABAJOEXTERNO_FASES_N_SDT',grid:49,pic:''},{av:'nGXsfl_49_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:49},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_49',ctrl:'GRID',prop:'GridRC',grid:49}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1527E2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV45SalExCoEIN',fld:'vSALEXCOEIN',pic:'ZZZZZ9',hsh:true},{av:'AV46SalExKgEIN',fld:'vSALEXKGEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV47SalExMtEIN',fld:'vSALEXMTEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20TrabajoExterno_Fases_n_SDT',fld:'vTRABAJOEXTERNO_FASES_N_SDT',grid:49,pic:''},{av:'nGXsfl_49_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:49},{av:'nRC_GXsfl_49',ctrl:'GRID',prop:'GridRC',grid:49}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV45SalExCoEIN',fld:'vSALEXCOEIN',pic:'ZZZZZ9',hsh:true},{av:'AV46SalExKgEIN',fld:'vSALEXKGEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV47SalExMtEIN',fld:'vSALEXMTEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20TrabajoExterno_Fases_n_SDT',fld:'vTRABAJOEXTERNO_FASES_N_SDT',grid:49,pic:''},{av:'nGXsfl_49_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:49},{av:'nRC_GXsfl_49',ctrl:'GRID',prop:'GridRC',grid:49}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV45SalExCoEIN',fld:'vSALEXCOEIN',pic:'ZZZZZ9',hsh:true},{av:'AV46SalExKgEIN',fld:'vSALEXKGEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV47SalExMtEIN',fld:'vSALEXMTEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20TrabajoExterno_Fases_n_SDT',fld:'vTRABAJOEXTERNO_FASES_N_SDT',grid:49,pic:''},{av:'nGXsfl_49_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:49},{av:'nRC_GXsfl_49',ctrl:'GRID',prop:'GridRC',grid:49}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV41barunimed',fld:'vBARUNIMED',pic:'@!',hsh:true},{av:'AV45SalExCoEIN',fld:'vSALEXCOEIN',pic:'ZZZZZ9',hsh:true},{av:'AV46SalExKgEIN',fld:'vSALEXKGEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV47SalExMtEIN',fld:'vSALEXMTEIN',pic:'ZZZZZ9.99',hsh:true},{av:'AV57Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20TrabajoExterno_Fases_n_SDT',fld:'vTRABAJOEXTERNO_FASES_N_SDT',grid:49,pic:''},{av:'nGXsfl_49_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:49},{av:'nRC_GXsfl_49',ctrl:'GRID',prop:'GridRC',grid:49}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv6',iparms:[]");
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
      wcpOAV8Emprcod = "" ;
      wcpOAV30SalExtFec = GXutil.nullDate() ;
      wcpOAV6Barcodpar = "" ;
      wcpOAV46SalExKgEIN = DecimalUtil.ZERO ;
      wcpOAV47SalExMtEIN = DecimalUtil.ZERO ;
      wcpOAV41barunimed = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV8Emprcod = "" ;
      AV30SalExtFec = GXutil.nullDate() ;
      AV6Barcodpar = "" ;
      AV46SalExKgEIN = DecimalUtil.ZERO ;
      AV47SalExMtEIN = DecimalUtil.ZERO ;
      AV41barunimed = "" ;
      AV57Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV20TrabajoExterno_Fases_n_SDT = new GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item>(app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV43SalExKgE = DecimalUtil.ZERO ;
      AV44SalExMtE = DecimalUtil.ZERO ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnmarcartodos_Jsonclick = "" ;
      bttBtndesmarcartodos_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      hsh = "" ;
      AV22Station = "" ;
      AV23EmprNom = "" ;
      AV24UsurCod = "" ;
      AV40TrabajoExterno_Fases_n_SDT_json = "" ;
      GXt_char1 = "" ;
      AV21WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext5 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV29TrabajoExterno_Fases_n_SDT_item = new app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item(remoteHandle, context);
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      AV34FasCod = "" ;
      AV48FasdscMn = "" ;
      GXv_char4 = new String[1] ;
      GXv_int6 = new short[1] ;
      GXv_int7 = new int[1] ;
      GXv_date8 = new java.util.Date[1] ;
      GXv_int9 = new int[1] ;
      GXv_int10 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int11 = new short[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int14 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char15 = new String[1] ;
      AV19Session = httpContext.getWebSession();
      AV12GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV57Pgmname = "TrabajosExternos.TrabajoExterno_Fase_n" ;
      /* GeneXus formulas. */
      AV57Pgmname = "TrabajosExternos.TrabajoExterno_Fase_n" ;
      Gx_err = (short)(0) ;
      edtavTrabajoexterno_fases_n_sdt__procod_Enabled = 0 ;
      edtavTrabajoexterno_fases_n_sdt__barordlin_Enabled = 0 ;
      edtavTrabajoexterno_fases_n_sdt__fascod_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV7Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV7Barcodreo ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXv_int10[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV31Mancod ;
   private short AV31Mancod ;
   private short AV39i ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV28lineas ;
   private short AV33BarOrdLin ;
   private short GXv_int6[] ;
   private short GXv_int11[] ;
   private int wcpOAV32SalExtAlb ;
   private int wcpOAV5Barcod ;
   private int wcpOAV45SalExCoEIN ;
   private int nRC_GXsfl_49 ;
   private int subGrid_Rows ;
   private int AV32SalExtAlb ;
   private int AV5Barcod ;
   private int AV45SalExCoEIN ;
   private int nGXsfl_49_idx=1 ;
   private int AV42SalExCoE ;
   private int edtavSalexcoe_Enabled ;
   private int edtavSalexkge_Enabled ;
   private int edtavSalexmte_Enabled ;
   private int AV51GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavTrabajoexterno_fases_n_sdt__procod_Enabled ;
   private int edtavTrabajoexterno_fases_n_sdt__barordlin_Enabled ;
   private int edtavTrabajoexterno_fases_n_sdt__fascod_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_49_fel_idx=1 ;
   private int AV58GXV7 ;
   private int AV59GXV8 ;
   private int GXv_int7[] ;
   private int GXv_int9[] ;
   private int GXv_int14[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavTrabajoexterno_fases_n_sdt__fasdsc_Enabled ;
   private int edtavTrabajoexterno_fases_n_sdt__fasdsc_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV46SalExKgEIN ;
   private java.math.BigDecimal wcpOAV47SalExMtEIN ;
   private java.math.BigDecimal AV46SalExKgEIN ;
   private java.math.BigDecimal AV47SalExMtEIN ;
   private java.math.BigDecimal AV43SalExKgE ;
   private java.math.BigDecimal AV44SalExMtE ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String wcpOAV8Emprcod ;
   private String wcpOAV6Barcodpar ;
   private String wcpOAV41barunimed ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV8Emprcod ;
   private String AV6Barcodpar ;
   private String AV41barunimed ;
   private String sGXsfl_49_idx="0001" ;
   private String AV57Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavSalexcoe_Internalname ;
   private String TempTags ;
   private String edtavSalexcoe_Jsonclick ;
   private String edtavSalexkge_Internalname ;
   private String edtavSalexkge_Jsonclick ;
   private String edtavSalexmte_Internalname ;
   private String edtavSalexmte_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnmarcartodos_Internalname ;
   private String bttBtnmarcartodos_Jsonclick ;
   private String bttBtndesmarcartodos_Internalname ;
   private String bttBtndesmarcartodos_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String GXCCtl ;
   private String edtavTrabajoexterno_fases_n_sdt__procod_Internalname ;
   private String edtavTrabajoexterno_fases_n_sdt__barordlin_Internalname ;
   private String edtavTrabajoexterno_fases_n_sdt__fascod_Internalname ;
   private String sGXsfl_49_fel_idx="0001" ;
   private String hsh ;
   private String AV22Station ;
   private String AV23EmprNom ;
   private String AV24UsurCod ;
   private String GXt_char1 ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String AV34FasCod ;
   private String AV48FasdscMn ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char15[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String edtavTrabajoexterno_fases_n_sdt__fasdsc_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavTrabajoexterno_fases_n_sdt__procod_Jsonclick ;
   private String edtavTrabajoexterno_fases_n_sdt__barordlin_Jsonclick ;
   private String edtavTrabajoexterno_fases_n_sdt__fascod_Jsonclick ;
   private String edtavTrabajoexterno_fases_n_sdt__fasdsc_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV30SalExtFec ;
   private java.util.Date AV30SalExtFec ;
   private java.util.Date GXv_date8[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV38Var_seleccionar ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_49_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV49 ;
   private boolean gx_refresh_fired ;
   private String AV40TrabajoExterno_Fases_n_SDT_json ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV19Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavTrabajoexterno_fases_n_sdt__seleccionar ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item> AV20TrabajoExterno_Fases_n_SDT ;
   private app.wwpbaseobjects.SdtWWPGridState AV12GridState ;
   private app.trabajosexternos.SdtTrabajoExterno_Fases_n_SDT_Item AV29TrabajoExterno_Fases_n_SDT_item ;
   private app.wwpbaseobjects.SdtWWPContext AV21WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext5[] ;
}

