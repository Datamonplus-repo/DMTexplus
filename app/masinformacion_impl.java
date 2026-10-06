package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class masinformacion_impl extends GXDataArea
{
   public masinformacion_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public masinformacion_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( masinformacion_impl.class ));
   }

   public masinformacion_impl( int remoteHandle ,
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
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               A129BarCod = (int)(GXutil.lval( httpContext.GetPar( "BarCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
               A132BarCodReo = (byte)(GXutil.lval( httpContext.GetPar( "BarCodReo"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
               A130BarCodPar = httpContext.GetPar( "BarCodPar") ;
               httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
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
      nRC_GXsfl_172 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_172"))) ;
      nGXsfl_172_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_172_idx"))) ;
      sGXsfl_172_idx = httpContext.GetPar( "sGXsfl_172_idx") ;
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
      AV8MaqDsc = httpContext.GetPar( "MaqDsc") ;
      A150BarFacTin = httpContext.GetPar( "BarFacTin") ;
      A153BarFasEst = (byte)(GXutil.lval( httpContext.GetPar( "BarFasEst"))) ;
      A4442BarFasDTI = localUtil.parseDTimeParm( httpContext.GetPar( "BarFasDTI")) ;
      n4442BarFasDTI = false ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV8MaqDsc, A150BarFacTin, A153BarFasEst, A4442BarFasDTI) ;
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
      paBW2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startBW2( ) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.masinformacion", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MasInformacion");
      forbiddenHiddens.add("MaqDsc", GXutil.rtrim( localUtil.format( AV8MaqDsc, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("masinformacion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_172", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_172, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV16GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFACTIN", GXutil.rtrim( A150BarFacTin));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASEST", GXutil.ltrim( localUtil.ntoc( A153BarFasEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARFASDTI", localUtil.ttoc( A4442BarFasDTI, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRCOD", GXutil.ltrim( localUtil.ntoc( A119BarAgrCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRREO", GXutil.ltrim( localUtil.ntoc( A124BarAgrReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARAGRPAR", GXutil.rtrim( A122BarAgrPar));
      app.GxWebStd.gx_hidden_field( httpContext, "BARTOTAGR", GXutil.ltrim( localUtil.ntoc( A219BarTotAgr, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLMAQUINA_Width", GXutil.rtrim( Dvpanel_pnlmaquina_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLMAQUINA_Autowidth", GXutil.booltostr( Dvpanel_pnlmaquina_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLMAQUINA_Autoheight", GXutil.booltostr( Dvpanel_pnlmaquina_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLMAQUINA_Cls", GXutil.rtrim( Dvpanel_pnlmaquina_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLMAQUINA_Title", GXutil.rtrim( Dvpanel_pnlmaquina_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLMAQUINA_Collapsible", GXutil.booltostr( Dvpanel_pnlmaquina_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLMAQUINA_Collapsed", GXutil.booltostr( Dvpanel_pnlmaquina_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLMAQUINA_Showcollapseicon", GXutil.booltostr( Dvpanel_pnlmaquina_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLMAQUINA_Iconposition", GXutil.rtrim( Dvpanel_pnlmaquina_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLMAQUINA_Autoscroll", GXutil.booltostr( Dvpanel_pnlmaquina_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPEDIDOCLIENTE_Width", GXutil.rtrim( Dvpanel_pnlpedidocliente_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPEDIDOCLIENTE_Autowidth", GXutil.booltostr( Dvpanel_pnlpedidocliente_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPEDIDOCLIENTE_Autoheight", GXutil.booltostr( Dvpanel_pnlpedidocliente_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPEDIDOCLIENTE_Cls", GXutil.rtrim( Dvpanel_pnlpedidocliente_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPEDIDOCLIENTE_Title", GXutil.rtrim( Dvpanel_pnlpedidocliente_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPEDIDOCLIENTE_Collapsible", GXutil.booltostr( Dvpanel_pnlpedidocliente_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPEDIDOCLIENTE_Collapsed", GXutil.booltostr( Dvpanel_pnlpedidocliente_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPEDIDOCLIENTE_Showcollapseicon", GXutil.booltostr( Dvpanel_pnlpedidocliente_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPEDIDOCLIENTE_Iconposition", GXutil.rtrim( Dvpanel_pnlpedidocliente_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPEDIDOCLIENTE_Autoscroll", GXutil.booltostr( Dvpanel_pnlpedidocliente_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPRODUCCION_Width", GXutil.rtrim( Dvpanel_pnlproduccion_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPRODUCCION_Autowidth", GXutil.booltostr( Dvpanel_pnlproduccion_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPRODUCCION_Autoheight", GXutil.booltostr( Dvpanel_pnlproduccion_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPRODUCCION_Cls", GXutil.rtrim( Dvpanel_pnlproduccion_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPRODUCCION_Title", GXutil.rtrim( Dvpanel_pnlproduccion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPRODUCCION_Collapsible", GXutil.booltostr( Dvpanel_pnlproduccion_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPRODUCCION_Collapsed", GXutil.booltostr( Dvpanel_pnlproduccion_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPRODUCCION_Showcollapseicon", GXutil.booltostr( Dvpanel_pnlproduccion_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPRODUCCION_Iconposition", GXutil.rtrim( Dvpanel_pnlproduccion_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLPRODUCCION_Autoscroll", GXutil.booltostr( Dvpanel_pnlproduccion_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLAGRUPADAS_Width", GXutil.rtrim( Dvpanel_pnlagrupadas_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLAGRUPADAS_Autowidth", GXutil.booltostr( Dvpanel_pnlagrupadas_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLAGRUPADAS_Autoheight", GXutil.booltostr( Dvpanel_pnlagrupadas_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLAGRUPADAS_Cls", GXutil.rtrim( Dvpanel_pnlagrupadas_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLAGRUPADAS_Title", GXutil.rtrim( Dvpanel_pnlagrupadas_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLAGRUPADAS_Collapsible", GXutil.booltostr( Dvpanel_pnlagrupadas_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLAGRUPADAS_Collapsed", GXutil.booltostr( Dvpanel_pnlagrupadas_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLAGRUPADAS_Showcollapseicon", GXutil.booltostr( Dvpanel_pnlagrupadas_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLAGRUPADAS_Iconposition", GXutil.rtrim( Dvpanel_pnlagrupadas_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_PNLAGRUPADAS_Autoscroll", GXutil.booltostr( Dvpanel_pnlagrupadas_Autoscroll));
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
         weBW2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtBW2( ) ;
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
      return formatLink("app.masinformacion", new String[] {GXutil.URLEncode(GXutil.rtrim(A396EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(A129BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A132BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(A130BarCodPar))}, new String[] {"EmprCod","BarCod","BarCodReo","BarCodPar"})  ;
   }

   public String getPgmname( )
   {
      return "MasInformacion" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Mas Informacion", "") ;
   }

   public void wbBW0( )
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
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucDvpanel_pnlmaquina.setProperty("Width", Dvpanel_pnlmaquina_Width);
         ucDvpanel_pnlmaquina.setProperty("AutoWidth", Dvpanel_pnlmaquina_Autowidth);
         ucDvpanel_pnlmaquina.setProperty("AutoHeight", Dvpanel_pnlmaquina_Autoheight);
         ucDvpanel_pnlmaquina.setProperty("Cls", Dvpanel_pnlmaquina_Cls);
         ucDvpanel_pnlmaquina.setProperty("Title", Dvpanel_pnlmaquina_Title);
         ucDvpanel_pnlmaquina.setProperty("Collapsible", Dvpanel_pnlmaquina_Collapsible);
         ucDvpanel_pnlmaquina.setProperty("Collapsed", Dvpanel_pnlmaquina_Collapsed);
         ucDvpanel_pnlmaquina.setProperty("ShowCollapseIcon", Dvpanel_pnlmaquina_Showcollapseicon);
         ucDvpanel_pnlmaquina.setProperty("IconPosition", Dvpanel_pnlmaquina_Iconposition);
         ucDvpanel_pnlmaquina.setProperty("AutoScroll", Dvpanel_pnlmaquina_Autoscroll);
         ucDvpanel_pnlmaquina.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnlmaquina_Internalname, "DVPANEL_PNLMAQUINAContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNLMAQUINAContainer"+"pnlMaquina"+"\" style=\"display:none;\">") ;
         wb_table1_16_BW2( true) ;
      }
      else
      {
         wb_table1_16_BW2( false) ;
      }
      return  ;
   }

   public void wb_table1_16_BW2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucDvpanel_pnlpedidocliente.setProperty("Width", Dvpanel_pnlpedidocliente_Width);
         ucDvpanel_pnlpedidocliente.setProperty("AutoWidth", Dvpanel_pnlpedidocliente_Autowidth);
         ucDvpanel_pnlpedidocliente.setProperty("AutoHeight", Dvpanel_pnlpedidocliente_Autoheight);
         ucDvpanel_pnlpedidocliente.setProperty("Cls", Dvpanel_pnlpedidocliente_Cls);
         ucDvpanel_pnlpedidocliente.setProperty("Title", Dvpanel_pnlpedidocliente_Title);
         ucDvpanel_pnlpedidocliente.setProperty("Collapsible", Dvpanel_pnlpedidocliente_Collapsible);
         ucDvpanel_pnlpedidocliente.setProperty("Collapsed", Dvpanel_pnlpedidocliente_Collapsed);
         ucDvpanel_pnlpedidocliente.setProperty("ShowCollapseIcon", Dvpanel_pnlpedidocliente_Showcollapseicon);
         ucDvpanel_pnlpedidocliente.setProperty("IconPosition", Dvpanel_pnlpedidocliente_Iconposition);
         ucDvpanel_pnlpedidocliente.setProperty("AutoScroll", Dvpanel_pnlpedidocliente_Autoscroll);
         ucDvpanel_pnlpedidocliente.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnlpedidocliente_Internalname, "DVPANEL_PNLPEDIDOCLIENTEContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNLPEDIDOCLIENTEContainer"+"pnlpedidocliente"+"\" style=\"display:none;\">") ;
         wb_table2_54_BW2( true) ;
      }
      else
      {
         wb_table2_54_BW2( false) ;
      }
      return  ;
   }

   public void wb_table2_54_BW2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucDvpanel_pnlproduccion.setProperty("Width", Dvpanel_pnlproduccion_Width);
         ucDvpanel_pnlproduccion.setProperty("AutoWidth", Dvpanel_pnlproduccion_Autowidth);
         ucDvpanel_pnlproduccion.setProperty("AutoHeight", Dvpanel_pnlproduccion_Autoheight);
         ucDvpanel_pnlproduccion.setProperty("Cls", Dvpanel_pnlproduccion_Cls);
         ucDvpanel_pnlproduccion.setProperty("Title", Dvpanel_pnlproduccion_Title);
         ucDvpanel_pnlproduccion.setProperty("Collapsible", Dvpanel_pnlproduccion_Collapsible);
         ucDvpanel_pnlproduccion.setProperty("Collapsed", Dvpanel_pnlproduccion_Collapsed);
         ucDvpanel_pnlproduccion.setProperty("ShowCollapseIcon", Dvpanel_pnlproduccion_Showcollapseicon);
         ucDvpanel_pnlproduccion.setProperty("IconPosition", Dvpanel_pnlproduccion_Iconposition);
         ucDvpanel_pnlproduccion.setProperty("AutoScroll", Dvpanel_pnlproduccion_Autoscroll);
         ucDvpanel_pnlproduccion.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnlproduccion_Internalname, "DVPANEL_PNLPRODUCCIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNLPRODUCCIONContainer"+"pnlproduccion"+"\" style=\"display:none;\">") ;
         wb_table3_143_BW2( true) ;
      }
      else
      {
         wb_table3_143_BW2( false) ;
      }
      return  ;
   }

   public void wb_table3_143_BW2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDvpanel_pnlagrupadas_cell_Internalname, 1, 0, "px", 0, "px", divDvpanel_pnlagrupadas_cell_Class, "left", "top", "", "flex-grow:1;", "div");
         /* User Defined Control */
         ucDvpanel_pnlagrupadas.setProperty("Width", Dvpanel_pnlagrupadas_Width);
         ucDvpanel_pnlagrupadas.setProperty("AutoWidth", Dvpanel_pnlagrupadas_Autowidth);
         ucDvpanel_pnlagrupadas.setProperty("AutoHeight", Dvpanel_pnlagrupadas_Autoheight);
         ucDvpanel_pnlagrupadas.setProperty("Cls", Dvpanel_pnlagrupadas_Cls);
         ucDvpanel_pnlagrupadas.setProperty("Title", Dvpanel_pnlagrupadas_Title);
         ucDvpanel_pnlagrupadas.setProperty("Collapsible", Dvpanel_pnlagrupadas_Collapsible);
         ucDvpanel_pnlagrupadas.setProperty("Collapsed", Dvpanel_pnlagrupadas_Collapsed);
         ucDvpanel_pnlagrupadas.setProperty("ShowCollapseIcon", Dvpanel_pnlagrupadas_Showcollapseicon);
         ucDvpanel_pnlagrupadas.setProperty("IconPosition", Dvpanel_pnlagrupadas_Iconposition);
         ucDvpanel_pnlagrupadas.setProperty("AutoScroll", Dvpanel_pnlagrupadas_Autoscroll);
         ucDvpanel_pnlagrupadas.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_pnlagrupadas_Internalname, "DVPANEL_PNLAGRUPADASContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_PNLAGRUPADASContainer"+"pnlagrupadas"+"\" style=\"display:none;\">") ;
         wb_table4_166_BW2( true) ;
      }
      else
      {
         wb_table4_166_BW2( false) ;
      }
      return  ;
   }

   public void wb_table4_166_BW2e( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 184,'',false,'" + sGXsfl_172_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGridcurrentpage_Internalname, GXutil.ltrim( localUtil.ntoc( AV15GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV15GridCurrentPage), "ZZZZZZZZZ9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,184);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGridcurrentpage_Jsonclick, 0, "Attribute", "", "", "", "", edtavGridcurrentpage_Visible, 1, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MasInformacion.htm");
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 172 )
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

   public void startBW2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Mas Informacion", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupBW0( ) ;
   }

   public void wsBW2( )
   {
      startBW2( ) ;
      evtBW2( ) ;
   }

   public void evtBW2( )
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
                           e11BW2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12BW2 ();
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
                           nGXsfl_172_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_172_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_172_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1722( ) ;
                           A13695BarAGrHdr = httpContext.cgiGet( edtBarAGrHdr_Internalname) ;
                           AV19BarserAgrupada = httpContext.cgiGet( edtavBarseragrupada_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarseragrupada_Internalname, AV19BarserAgrupada);
                           AV26BarNomCliAgrupada = httpContext.cgiGet( edtavBarnomcliagrupada_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarnomcliagrupada_Internalname, AV26BarNomCliAgrupada);
                           AV20BarColNomAgrupada = httpContext.cgiGet( edtavBarcolnomagrupada_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnomagrupada_Internalname, AV20BarColNomAgrupada);
                           AV21BarKgmAgrupada = localUtil.ctond( httpContext.cgiGet( edtavBarkgmagrupada_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavBarkgmagrupada_Internalname, GXutil.ltrimstr( AV21BarKgmAgrupada, 9, 2));
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e13BW2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e14BW2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e15BW2 ();
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

   public void weBW2( )
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

   public void paBW2( )
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
            GX_FocusControl = edtavHdr_Internalname ;
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
      subsflControlProps_1722( ) ;
      while ( nGXsfl_172_idx <= nRC_GXsfl_172 )
      {
         sendrow_1722( ) ;
         nGXsfl_172_idx = ((subGrid_Islastpage==1)&&(nGXsfl_172_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_172_idx+1) ;
         sGXsfl_172_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_172_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1722( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String A396EmprCod ,
                                 int A129BarCod ,
                                 byte A132BarCodReo ,
                                 String A130BarCodPar ,
                                 String AV8MaqDsc ,
                                 String A150BarFacTin ,
                                 byte A153BarFasEst ,
                                 java.util.Date A4442BarFasDTI )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e14BW2 ();
      GRID_nCurrentRecord = 0 ;
      rfBW2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"MasInformacion");
      forbiddenHiddens.add("MaqDsc", GXutil.rtrim( localUtil.format( AV8MaqDsc, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("masinformacion:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
         AV9BarFasest = (byte)(GXutil.lval( cmbavBarfasest.getValidValue(GXutil.trim( GXutil.str( AV9BarFasest, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFasest", GXutil.str( AV9BarFasest, 1, 0));
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV9BarFasest, 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
      }
   }

   public void refresh( )
   {
      send_integrity_hashes( ) ;
      rfBW2( ) ;
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
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), true);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavTxthayreceta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTxthayreceta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxthayreceta_Enabled), 5, 0), true);
      cmbavBarfasest.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
      edtavBarfasdti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasdti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdti_Enabled), 5, 0), true);
      edtavBarseragrupada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarseragrupada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarseragrupada_Enabled), 5, 0), !bGXsfl_172_Refreshing);
      edtavBarnomcliagrupada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcliagrupada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcliagrupada_Enabled), 5, 0), !bGXsfl_172_Refreshing);
      edtavBarcolnomagrupada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnomagrupada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnomagrupada_Enabled), 5, 0), !bGXsfl_172_Refreshing);
      edtavBarkgmagrupada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgmagrupada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmagrupada_Enabled), 5, 0), !bGXsfl_172_Refreshing);
   }

   public void rfBW2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(172) ;
      /* Execute user event: Refresh */
      e14BW2 ();
      nGXsfl_172_idx = 1 ;
      sGXsfl_172_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_172_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1722( ) ;
      bGXsfl_172_Refreshing = true ;
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
         subsflControlProps_1722( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_fnc_recordsperpage( )+1) ;
         /* Using cursor H00BW4 */
         pr_default.execute(0, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_172_idx = 1 ;
         sGXsfl_172_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_172_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1722( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A122BarAgrPar = H00BW4_A122BarAgrPar[0] ;
            A124BarAgrReo = H00BW4_A124BarAgrReo[0] ;
            A119BarAgrCod = H00BW4_A119BarAgrCod[0] ;
            A166BarKgm = H00BW4_A166BarKgm[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            A219BarTotAgr = H00BW4_A219BarTotAgr[0] ;
            n219BarTotAgr = H00BW4_n219BarTotAgr[0] ;
            A166BarKgm = H00BW4_A166BarKgm[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
            A219BarTotAgr = H00BW4_A219BarTotAgr[0] ;
            n219BarTotAgr = H00BW4_n219BarTotAgr[0] ;
            A13695BarAGrHdr = GXutil.padl( GXutil.trim( GXutil.str( A119BarAgrCod, 8, 0)), (short)(8), "0") + "-" + GXutil.trim( GXutil.str( A124BarAgrReo, 1, 0)) + GXutil.padl( A122BarAgrPar, (short)(1), " ") ;
            e15BW2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(172) ;
         wbBW0( ) ;
      }
      bGXsfl_172_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesBW2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "BARCOD", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODREO", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "BARCODPAR", GXutil.rtrim( A130BarCodPar));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
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
      /* Using cursor H00BW7 */
      pr_default.execute(1, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      GRID_nRecordCount = H00BW7_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV8MaqDsc, A150BarFacTin, A153BarFasEst, A4442BarFasDTI) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV8MaqDsc, A150BarFacTin, A153BarFasEst, A4442BarFasDTI) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV8MaqDsc, A150BarFacTin, A153BarFasEst, A4442BarFasDTI) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV8MaqDsc, A150BarFacTin, A153BarFasEst, A4442BarFasDTI) ;
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
         gxgrgrid_refresh( subGrid_Rows, A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, AV8MaqDsc, A150BarFacTin, A153BarFasEst, A4442BarFasDTI) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), true);
      edtavMaqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqdsc_Enabled), 5, 0), true);
      edtavTxthayreceta_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTxthayreceta_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxthayreceta_Enabled), 5, 0), true);
      cmbavBarfasest.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavBarfasest.getEnabled(), 5, 0), true);
      edtavBarfasdti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarfasdti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarfasdti_Enabled), 5, 0), true);
      edtavBarseragrupada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarseragrupada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarseragrupada_Enabled), 5, 0), !bGXsfl_172_Refreshing);
      edtavBarnomcliagrupada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarnomcliagrupada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarnomcliagrupada_Enabled), 5, 0), !bGXsfl_172_Refreshing);
      edtavBarcolnomagrupada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarcolnomagrupada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcolnomagrupada_Enabled), 5, 0), !bGXsfl_172_Refreshing);
      edtavBarkgmagrupada_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavBarkgmagrupada_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarkgmagrupada_Enabled), 5, 0), !bGXsfl_172_Refreshing);
      /* Using cursor H00BW8 */
      pr_default.execute(2, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      A120BarAgrEst = H00BW8_A120BarAgrEst[0] ;
      A180BarMaqCod = H00BW8_A180BarMaqCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      A252CliCod = H00BW8_A252CliCod[0] ;
      n252CliCod = H00BW8_n252CliCod[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
      A4812BarEncCli = H00BW8_A4812BarEncCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
      A212BarSer = H00BW8_A212BarSer[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
      A1652BarSerDsc = H00BW8_A1652BarSerDsc[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
      A135BarColNom = H00BW8_A135BarColNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
      A1234BarNomCli = H00BW8_A1234BarNomCli[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
      pr_default.close(2);
      /* Using cursor H00BW9 */
      pr_default.execute(3, new Object[] {A396EmprCod, Boolean.valueOf(n252CliCod), Integer.valueOf(A252CliCod)});
      A279CliNom = H00BW9_A279CliNom[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
      pr_default.close(3);
      /* Using cursor H00BW11 */
      pr_default.execute(4, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(4) != 101) )
      {
         A166BarKgm = H00BW11_A166BarKgm[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      else
      {
         A166BarKgm = DecimalUtil.doubleToDec(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
      }
      pr_default.close(4);
      /* Using cursor H00BW13 */
      pr_default.execute(5, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      if ( (pr_default.getStatus(5) != 101) )
      {
         A219BarTotAgr = H00BW13_A219BarTotAgr[0] ;
         n219BarTotAgr = H00BW13_n219BarTotAgr[0] ;
      }
      else
      {
         A219BarTotAgr = DecimalUtil.doubleToDec(0) ;
         n219BarTotAgr = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A219BarTotAgr", GXutil.ltrimstr( A219BarTotAgr, 10, 2));
      }
      pr_default.close(5);
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
      pr_default.close(2);
      pr_default.close(3);
      pr_default.close(4);
      pr_default.close(5);
      fix_multi_value_controls( ) ;
   }

   public void strupBW0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e13BW2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_172 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_172"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV16GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_pnlmaquina_Width = httpContext.cgiGet( "DVPANEL_PNLMAQUINA_Width") ;
         Dvpanel_pnlmaquina_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLMAQUINA_Autowidth")) ;
         Dvpanel_pnlmaquina_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLMAQUINA_Autoheight")) ;
         Dvpanel_pnlmaquina_Cls = httpContext.cgiGet( "DVPANEL_PNLMAQUINA_Cls") ;
         Dvpanel_pnlmaquina_Title = httpContext.cgiGet( "DVPANEL_PNLMAQUINA_Title") ;
         Dvpanel_pnlmaquina_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLMAQUINA_Collapsible")) ;
         Dvpanel_pnlmaquina_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLMAQUINA_Collapsed")) ;
         Dvpanel_pnlmaquina_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLMAQUINA_Showcollapseicon")) ;
         Dvpanel_pnlmaquina_Iconposition = httpContext.cgiGet( "DVPANEL_PNLMAQUINA_Iconposition") ;
         Dvpanel_pnlmaquina_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLMAQUINA_Autoscroll")) ;
         Dvpanel_pnlpedidocliente_Width = httpContext.cgiGet( "DVPANEL_PNLPEDIDOCLIENTE_Width") ;
         Dvpanel_pnlpedidocliente_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPEDIDOCLIENTE_Autowidth")) ;
         Dvpanel_pnlpedidocliente_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPEDIDOCLIENTE_Autoheight")) ;
         Dvpanel_pnlpedidocliente_Cls = httpContext.cgiGet( "DVPANEL_PNLPEDIDOCLIENTE_Cls") ;
         Dvpanel_pnlpedidocliente_Title = httpContext.cgiGet( "DVPANEL_PNLPEDIDOCLIENTE_Title") ;
         Dvpanel_pnlpedidocliente_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPEDIDOCLIENTE_Collapsible")) ;
         Dvpanel_pnlpedidocliente_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPEDIDOCLIENTE_Collapsed")) ;
         Dvpanel_pnlpedidocliente_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPEDIDOCLIENTE_Showcollapseicon")) ;
         Dvpanel_pnlpedidocliente_Iconposition = httpContext.cgiGet( "DVPANEL_PNLPEDIDOCLIENTE_Iconposition") ;
         Dvpanel_pnlpedidocliente_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPEDIDOCLIENTE_Autoscroll")) ;
         Dvpanel_pnlproduccion_Width = httpContext.cgiGet( "DVPANEL_PNLPRODUCCION_Width") ;
         Dvpanel_pnlproduccion_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPRODUCCION_Autowidth")) ;
         Dvpanel_pnlproduccion_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPRODUCCION_Autoheight")) ;
         Dvpanel_pnlproduccion_Cls = httpContext.cgiGet( "DVPANEL_PNLPRODUCCION_Cls") ;
         Dvpanel_pnlproduccion_Title = httpContext.cgiGet( "DVPANEL_PNLPRODUCCION_Title") ;
         Dvpanel_pnlproduccion_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPRODUCCION_Collapsible")) ;
         Dvpanel_pnlproduccion_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPRODUCCION_Collapsed")) ;
         Dvpanel_pnlproduccion_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPRODUCCION_Showcollapseicon")) ;
         Dvpanel_pnlproduccion_Iconposition = httpContext.cgiGet( "DVPANEL_PNLPRODUCCION_Iconposition") ;
         Dvpanel_pnlproduccion_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLPRODUCCION_Autoscroll")) ;
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
         Dvpanel_pnlagrupadas_Width = httpContext.cgiGet( "DVPANEL_PNLAGRUPADAS_Width") ;
         Dvpanel_pnlagrupadas_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLAGRUPADAS_Autowidth")) ;
         Dvpanel_pnlagrupadas_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLAGRUPADAS_Autoheight")) ;
         Dvpanel_pnlagrupadas_Cls = httpContext.cgiGet( "DVPANEL_PNLAGRUPADAS_Cls") ;
         Dvpanel_pnlagrupadas_Title = httpContext.cgiGet( "DVPANEL_PNLAGRUPADAS_Title") ;
         Dvpanel_pnlagrupadas_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLAGRUPADAS_Collapsible")) ;
         Dvpanel_pnlagrupadas_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLAGRUPADAS_Collapsed")) ;
         Dvpanel_pnlagrupadas_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLAGRUPADAS_Showcollapseicon")) ;
         Dvpanel_pnlagrupadas_Iconposition = httpContext.cgiGet( "DVPANEL_PNLAGRUPADAS_Iconposition") ;
         Dvpanel_pnlagrupadas_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_PNLAGRUPADAS_Autoscroll")) ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         /* Read variables values. */
         AV7Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV7Hdr", AV7Hdr);
         A180BarMaqCod = httpContext.cgiGet( edtBarMaqCod_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
         AV8MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8MaqDsc", AV8MaqDsc);
         AV28txthayReceta = httpContext.cgiGet( edtavTxthayreceta_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28txthayReceta", AV28txthayReceta);
         A252CliCod = (int)(localUtil.ctol( httpContext.cgiGet( edtCliCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         n252CliCod = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A252CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A252CliCod), 6, 0));
         A279CliNom = httpContext.cgiGet( edtCliNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A279CliNom", A279CliNom);
         A4812BarEncCli = httpContext.cgiGet( edtBarEncCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A4812BarEncCli", A4812BarEncCli);
         A212BarSer = httpContext.cgiGet( edtBarSer_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A212BarSer", A212BarSer);
         A1652BarSerDsc = httpContext.cgiGet( edtBarSerDsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1652BarSerDsc", A1652BarSerDsc);
         A135BarColNom = httpContext.cgiGet( edtBarColNom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A135BarColNom", A135BarColNom);
         A1234BarNomCli = httpContext.cgiGet( edtBarNomCli_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "A1234BarNomCli", A1234BarNomCli);
         A166BarKgm = localUtil.ctond( httpContext.cgiGet( edtBarKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A166BarKgm", GXutil.ltrimstr( A166BarKgm, 9, 2));
         A812RecTotKgm = localUtil.ctond( httpContext.cgiGet( edtRecTotKgm_Internalname)) ;
         httpContext.ajax_rsp_assign_attri("", false, "A812RecTotKgm", GXutil.ltrimstr( A812RecTotKgm, 10, 2));
         cmbavBarfasest.setName( cmbavBarfasest.getInternalname() );
         cmbavBarfasest.setValue( httpContext.cgiGet( cmbavBarfasest.getInternalname()) );
         AV9BarFasest = (byte)(GXutil.lval( httpContext.cgiGet( cmbavBarfasest.getInternalname()))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFasest", GXutil.str( AV9BarFasest, 1, 0));
         if ( localUtil.vcdtime( httpContext.cgiGet( edtavBarfasdti_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))), (byte)(((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_baddatetime", new Object[] {}), 1, "vBARFASDTI");
            GX_FocusControl = edtavBarfasdti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10BarFasDti = GXutil.resetTime( GXutil.nullDate() );
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarFasDti", localUtil.ttoc( AV10BarFasDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         else
         {
            AV10BarFasDti = localUtil.ctot( httpContext.cgiGet( edtavBarfasdti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10BarFasDti", localUtil.ttoc( AV10BarFasDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vGRIDCURRENTPAGE");
            GX_FocusControl = edtavGridcurrentpage_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15GridCurrentPage = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
         }
         else
         {
            AV15GridCurrentPage = localUtil.ctol( httpContext.cgiGet( edtavGridcurrentpage_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"MasInformacion");
         AV8MaqDsc = httpContext.cgiGet( edtavMaqdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8MaqDsc", AV8MaqDsc);
         forbiddenHiddens.add("MaqDsc", GXutil.rtrim( localUtil.format( AV8MaqDsc, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("masinformacion:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e13BW2 ();
      if (returnInSub) return;
   }

   public void e13BW2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV31Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      masinformacion_impl.this.GXt_char1 = GXv_char2[0] ;
      AV31Station = GXt_char1 ;
      GXv_char2[0] = AV32Emprcod ;
      GXv_char3[0] = AV33Emprnom ;
      GXv_char4[0] = AV34Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV31Station, GXv_char2, GXv_char3, GXv_char4) ;
      masinformacion_impl.this.AV32Emprcod = GXv_char2[0] ;
      masinformacion_impl.this.AV33Emprnom = GXv_char3[0] ;
      masinformacion_impl.this.AV34Usurcod = GXv_char4[0] ;
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV15GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
      edtavGridcurrentpage_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavGridcurrentpage_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGridcurrentpage_Visible), 5, 0), true);
      AV16GridPageCount = -1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridPageCount), 10, 0));
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e14BW2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      AV7Hdr = GXutil.str( A129BarCod, 8, 0) + "-" + GXutil.str( A132BarCodReo, 1, 0) + A130BarCodPar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Hdr", AV7Hdr);
      GXv_char4[0] = A396EmprCod ;
      GXv_char3[0] = A180BarMaqCod ;
      GXv_char2[0] = AV8MaqDsc ;
      new app.pmaqdsc(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_char2) ;
      masinformacion_impl.this.A396EmprCod = GXv_char4[0] ;
      masinformacion_impl.this.A180BarMaqCod = GXv_char3[0] ;
      masinformacion_impl.this.AV8MaqDsc = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "A180BarMaqCod", A180BarMaqCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV8MaqDsc", AV8MaqDsc);
      GXt_int5 = (byte)(AV27FlagRec) ;
      GXv_int6[0] = GXt_int5 ;
      new app.phayrec(remoteHandle, context).execute( A396EmprCod, A129BarCod, A132BarCodReo, A130BarCodPar, GXv_int6) ;
      masinformacion_impl.this.GXt_int5 = GXv_int6[0] ;
      AV27FlagRec = GXt_int5 ;
      AV28txthayReceta = ((AV27FlagRec==0) ? " " : httpContext.getMessage( "Receta Tinte Creada", "")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28txthayReceta", AV28txthayReceta);
      /* Using cursor H00BW14 */
      pr_default.execute(6, new Object[] {A396EmprCod, Integer.valueOf(A129BarCod), Byte.valueOf(A132BarCodReo), A130BarCodPar});
      while ( (pr_default.getStatus(6) != 101) )
      {
         A150BarFacTin = H00BW14_A150BarFacTin[0] ;
         A153BarFasEst = H00BW14_A153BarFasEst[0] ;
         A4442BarFasDTI = H00BW14_A4442BarFasDTI[0] ;
         n4442BarFasDTI = H00BW14_n4442BarFasDTI[0] ;
         AV9BarFasest = A153BarFasEst ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFasest", GXutil.str( AV9BarFasest, 1, 0));
         AV10BarFasDti = A4442BarFasDTI ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10BarFasDti", localUtil.ttoc( AV10BarFasDti, 8, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         pr_default.readNext(6);
      }
      pr_default.close(6);
      /*  Sending Event outputs  */
      cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV9BarFasest, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
   }

   private void e15BW2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      GXv_char4[0] = A396EmprCod ;
      GXv_int7[0] = A119BarAgrCod ;
      GXv_int6[0] = A124BarAgrReo ;
      GXv_char3[0] = A122BarAgrPar ;
      GXv_decimal8[0] = AV21BarKgmAgrupada ;
      GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
      GXv_int10[0] = 0 ;
      GXv_char2[0] = AV19BarserAgrupada ;
      GXv_char11[0] = AV20BarColNomAgrupada ;
      GXv_int12[0] = 0 ;
      GXv_int13[0] = (byte)(0) ;
      GXv_char14[0] = AV22CliNomAgrupada ;
      GXv_date15[0] = AV23fecha ;
      GXv_int16[0] = (byte)(0) ;
      GXv_char17[0] = AV24BarenccliAgrupada ;
      GXv_char18[0] = "" ;
      GXv_int19[0] = 0 ;
      GXv_date20[0] = AV23fecha ;
      GXv_char21[0] = "" ;
      GXv_char22[0] = AV25BarSerDscAgrupada ;
      GXv_int23[0] = 0 ;
      GXv_date24[0] = AV23fecha ;
      GXv_char25[0] = AV26BarNomCliAgrupada ;
      GXv_int26[0] = (short)(0) ;
      GXv_int27[0] = 0 ;
      new app.pinfagrmas(remoteHandle, context).execute( GXv_char4, GXv_int7, GXv_int6, GXv_char3, GXv_decimal8, GXv_decimal9, GXv_int10, GXv_char2, GXv_char11, GXv_int12, GXv_int13, GXv_char14, GXv_date15, GXv_int16, GXv_char17, GXv_char18, GXv_int19, GXv_date20, GXv_char21, GXv_char22, GXv_int23, GXv_date24, GXv_char25, GXv_int26, GXv_int27) ;
      masinformacion_impl.this.A396EmprCod = GXv_char4[0] ;
      masinformacion_impl.this.A119BarAgrCod = GXv_int7[0] ;
      masinformacion_impl.this.A124BarAgrReo = GXv_int6[0] ;
      masinformacion_impl.this.A122BarAgrPar = GXv_char3[0] ;
      masinformacion_impl.this.AV21BarKgmAgrupada = GXv_decimal8[0] ;
      masinformacion_impl.this.AV19BarserAgrupada = GXv_char2[0] ;
      masinformacion_impl.this.AV20BarColNomAgrupada = GXv_char11[0] ;
      masinformacion_impl.this.AV22CliNomAgrupada = GXv_char14[0] ;
      masinformacion_impl.this.AV23fecha = GXv_date15[0] ;
      masinformacion_impl.this.AV24BarenccliAgrupada = GXv_char17[0] ;
      masinformacion_impl.this.AV23fecha = GXv_date20[0] ;
      masinformacion_impl.this.AV25BarSerDscAgrupada = GXv_char22[0] ;
      masinformacion_impl.this.AV23fecha = GXv_date24[0] ;
      masinformacion_impl.this.AV26BarNomCliAgrupada = GXv_char25[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      httpContext.ajax_rsp_assign_attri("", false, "A119BarAgrCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A119BarAgrCod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A124BarAgrReo", GXutil.str( A124BarAgrReo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "A122BarAgrPar", A122BarAgrPar);
      httpContext.ajax_rsp_assign_attri("", false, edtavBarkgmagrupada_Internalname, GXutil.ltrimstr( AV21BarKgmAgrupada, 9, 2));
      httpContext.ajax_rsp_assign_attri("", false, edtavBarseragrupada_Internalname, AV19BarserAgrupada);
      httpContext.ajax_rsp_assign_attri("", false, edtavBarcolnomagrupada_Internalname, AV20BarColNomAgrupada);
      httpContext.ajax_rsp_assign_attri("", false, edtavBarnomcliagrupada_Internalname, AV26BarNomCliAgrupada);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(172) ;
      }
      sendrow_1722( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_172_Refreshing )
      {
         httpContext.doAjaxLoad(172, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e11BW2( )
   {
      /* Gridpaginationbar_Changepage Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Previous") == 0 )
      {
         AV15GridCurrentPage = (long)(AV15GridCurrentPage-1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
         subgrid_previouspage( ) ;
      }
      else if ( GXutil.strcmp(Gridpaginationbar_Selectedpage, "Next") == 0 )
      {
         AV15GridCurrentPage = (long)(AV15GridCurrentPage+1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
         subgrid_nextpage( ) ;
      }
      else
      {
         AV14PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         AV15GridCurrentPage = AV14PageToGo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
         subgrid_gotopage( AV14PageToGo) ;
      }
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV9BarFasest, 1, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavBarfasest.getInternalname(), "Values", cmbavBarfasest.ToJavascriptSource(), true);
   }

   public void e12BW2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      AV15GridCurrentPage = 1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( GXutil.strcmp(A120BarAgrEst, "S") == 0 ) ) )
      {
         divDvpanel_pnlagrupadas_cell_Class = "Invisible" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_pnlagrupadas_cell_Internalname, "Class", divDvpanel_pnlagrupadas_cell_Class, true);
      }
      else
      {
         divDvpanel_pnlagrupadas_cell_Class = "" ;
         httpContext.ajax_rsp_assign_prop("", false, divDvpanel_pnlagrupadas_cell_Internalname, "Class", divDvpanel_pnlagrupadas_cell_Class, true);
      }
   }

   public void wb_table4_166_BW2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnlagrupadas_Internalname, tblPnlagrupadas_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         startgridcontrol172( ) ;
      }
      if ( wbEnd == 172 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_172 = (int)(nGXsfl_172_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV15GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV16GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, "GRIDPAGINATIONBARContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_166_BW2e( true) ;
      }
      else
      {
         wb_table4_166_BW2e( false) ;
      }
   }

   public void wb_table3_143_BW2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnlproduccion_Internalname, tblPnlproduccion_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarfasest_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarfasest_Internalname, httpContext.getMessage( "Estado", ""), "", "", lblTextblockbarfasest_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, cmbavBarfasest.getInternalname(), httpContext.getMessage( "Estado Barcada", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 154,'',false,'" + sGXsfl_172_idx + "',0)\"" ;
         /* ComboBox */
         app.GxWebStd.gx_combobox_ctrl1( httpContext, cmbavBarfasest, cmbavBarfasest.getInternalname(), GXutil.trim( GXutil.str( AV9BarFasest, 1, 0)), 1, cmbavBarfasest.getJsonclick(), 0, "'"+""+"'"+",false,"+"'"+""+"'", "int", "", 1, cmbavBarfasest.getEnabled(), 0, (short)(0), 0, "em", 0, "", "", "AttributeFL", "", "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,154);\"", "", true, (byte)(0), "HLP_MasInformacion.htm");
         cmbavBarfasest.setValue( GXutil.trim( GXutil.str( AV9BarFasest, 1, 0)) );
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarfasdti_Internalname, "", "", "", lblTextblockbarfasdti_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavBarfasdti_Internalname, httpContext.getMessage( "Fecha Hora Inicio", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 162,'',false,'" + sGXsfl_172_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavBarfasdti_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavBarfasdti_Internalname, localUtil.ttoc( AV10BarFasDti, 10, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "), localUtil.format( AV10BarFasDti, "99/99/99 99:99:99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',8,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,162);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavBarfasdti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavBarfasdti_Enabled, 0, "text", "", 17, "chr", 1, "row", 17, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MasInformacion.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavBarfasdti_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavBarfasdti_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_MasInformacion.htm");
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
         wb_table3_143_BW2e( true) ;
      }
      else
      {
         wb_table3_143_BW2e( false) ;
      }
   }

   public void wb_table2_54_BW2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnlpedidocliente_Internalname, tblPnlpedidocliente_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtableclicod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclicod_Internalname, httpContext.getMessage( "Cliente", ""), "", "", lblTextblockclicod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliCod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliCod_Internalname, GXutil.ltrim( localUtil.ntoc( A252CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtCliCod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(A252CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliCod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MasInformacion.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockclinom_Internalname, "", "", "", lblTextblockclinom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtCliNom_Internalname, httpContext.getMessage( "Nombre Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtCliNom_Internalname, GXutil.rtrim( A279CliNom), GXutil.rtrim( localUtil.format( A279CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtCliNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtCliNom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MasInformacion.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarenccli_Internalname, httpContext.getMessage( "Pedido Cliente", ""), "", "", lblTextblockbarenccli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarEncCli_Internalname, httpContext.getMessage( "Disposicion Cliente Nueva", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarEncCli_Internalname, GXutil.rtrim( A4812BarEncCli), GXutil.rtrim( localUtil.format( A4812BarEncCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarEncCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarEncCli_Enabled, 0, "text", "", 20, "chr", 1, "row", 20, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MasInformacion.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarser_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarser_Internalname, httpContext.getMessage( "Articulo", ""), "", "", lblTextblockbarser_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarSer_Internalname, httpContext.getMessage( "Serie", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarSer_Internalname, GXutil.rtrim( A212BarSer), GXutil.rtrim( localUtil.format( A212BarSer, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSer_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSer_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MasInformacion.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarserdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "", "", lblTextblockbarserdsc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarSerDsc_Internalname, httpContext.getMessage( "Descripción Serie", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarSerDsc_Internalname, GXutil.rtrim( A1652BarSerDsc), GXutil.rtrim( localUtil.format( A1652BarSerDsc, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarSerDsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarSerDsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MasInformacion.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarcolnom_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarcolnom_Internalname, httpContext.getMessage( "Color", ""), "", "", lblTextblockbarcolnom_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarColNom_Internalname, httpContext.getMessage( "Nombre Color", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarColNom_Internalname, GXutil.rtrim( A135BarColNom), GXutil.rtrim( localUtil.format( A135BarColNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarColNom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarColNom_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MasInformacion.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarnomcli_Internalname, httpContext.getMessage( "Color Cliente", ""), "", "", lblTextblockbarnomcli_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarNomCli_Internalname, httpContext.getMessage( "Nombre Color Cliente", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarNomCli_Internalname, GXutil.rtrim( A1234BarNomCli), GXutil.rtrim( localUtil.format( A1234BarNomCli, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarNomCli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarNomCli_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MasInformacion.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarkgm_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarkgm_Internalname, httpContext.getMessage( "Kgs", ""), "", "", lblTextblockbarkgm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarKgm_Internalname, httpContext.getMessage( "Kilogramos", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A166BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtBarKgm_Enabled!=0) ? localUtil.format( A166BarKgm, "ZZZZZ9.99") : localUtil.format( A166BarKgm, "ZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarKgm_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MasInformacion.htm");
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
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockrectotkgm_Internalname, httpContext.getMessage( "Kgs Totales", ""), "", "", lblTextblockrectotkgm_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtRecTotKgm_Internalname, httpContext.getMessage( "RecTotKgm", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtRecTotKgm_Internalname, GXutil.ltrim( localUtil.ntoc( A812RecTotKgm, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtRecTotKgm_Enabled!=0) ? localUtil.format( A812RecTotKgm, "ZZZZZZ9.99") : localUtil.format( A812RecTotKgm, "ZZZZZZ9.99"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtRecTotKgm_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtRecTotKgm_Enabled, 0, "text", "", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_MasInformacion.htm");
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
         wb_table2_54_BW2e( true) ;
      }
      else
      {
         wb_table2_54_BW2e( false) ;
      }
   }

   public void wb_table1_16_BW2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPnlmaquina_Internalname, tblPnlmaquina_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavHdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHdr_Internalname, httpContext.getMessage( "Hdr", ""), "gx-form-item AttributeFLLabel", 1, true, "width: 25%;");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_172_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHdr_Internalname, GXutil.rtrim( AV7Hdr), GXutil.rtrim( localUtil.format( AV7Hdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablebarmaqcod_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockbarmaqcod_Internalname, httpContext.getMessage( "Maquina", ""), "", "", lblTextblockbarmaqcod_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtBarMaqCod_Internalname, httpContext.getMessage( "Codigo Maquina", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtBarMaqCod_Internalname, GXutil.rtrim( A180BarMaqCod), GXutil.rtrim( localUtil.format( A180BarMaqCod, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtBarMaqCod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtBarMaqCod_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "DscTop", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtablemaqdsc_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockmaqdsc_Internalname, "", "", "", lblTextblockmaqdsc_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqdsc_Internalname, httpContext.getMessage( "Descripcion ", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_172_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqdsc_Internalname, GXutil.rtrim( AV8MaqDsc), GXutil.rtrim( localUtil.format( AV8MaqDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqdsc_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MasInformacion.htm");
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
         wb_table5_45_BW2( true) ;
      }
      else
      {
         wb_table5_45_BW2( false) ;
      }
      return  ;
   }

   public void wb_table5_45_BW2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_16_BW2e( true) ;
      }
      else
      {
         wb_table1_16_BW2e( false) ;
      }
   }

   public void wb_table5_45_BW2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblUnnamedtable8_Internalname, tblUnnamedtable8_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"Center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-Center;text-align:-moz-Center;text-align:-webkit-Center")+"\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group gx-default-form-group", "left", "top", ""+" data-gx-for=\""+edtavTxthayreceta_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 75, "%", 0, "px", "gx-form-item gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 50,'',false,'" + sGXsfl_172_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTxthayreceta_Internalname, GXutil.rtrim( AV28txthayReceta), GXutil.rtrim( localUtil.format( AV28txthayReceta, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,50);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTxthayreceta_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTxthayreceta_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_MasInformacion.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_45_BW2e( true) ;
      }
      else
      {
         wb_table5_45_BW2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      A396EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      A129BarCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A129BarCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(A129BarCod), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9")));
      A132BarCodReo = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "A132BarCodReo", GXutil.str( A132BarCodReo, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODREO", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9")));
      A130BarCodPar = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "A130BarCodPar", A130BarCodPar);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_BARCODPAR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A130BarCodPar, ""))));
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
      paBW2( ) ;
      wsBW2( ) ;
      weBW2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20267101111292", true, true);
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
         httpContext.AddJavascriptSource("masinformacion.js", "?20267101111292", false, true);
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
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_1722( )
   {
      edtBarAGrHdr_Internalname = "BARAGRHDR_"+sGXsfl_172_idx ;
      edtavBarseragrupada_Internalname = "vBARSERAGRUPADA_"+sGXsfl_172_idx ;
      edtavBarnomcliagrupada_Internalname = "vBARNOMCLIAGRUPADA_"+sGXsfl_172_idx ;
      edtavBarcolnomagrupada_Internalname = "vBARCOLNOMAGRUPADA_"+sGXsfl_172_idx ;
      edtavBarkgmagrupada_Internalname = "vBARKGMAGRUPADA_"+sGXsfl_172_idx ;
   }

   public void subsflControlProps_fel_1722( )
   {
      edtBarAGrHdr_Internalname = "BARAGRHDR_"+sGXsfl_172_fel_idx ;
      edtavBarseragrupada_Internalname = "vBARSERAGRUPADA_"+sGXsfl_172_fel_idx ;
      edtavBarnomcliagrupada_Internalname = "vBARNOMCLIAGRUPADA_"+sGXsfl_172_fel_idx ;
      edtavBarcolnomagrupada_Internalname = "vBARCOLNOMAGRUPADA_"+sGXsfl_172_fel_idx ;
      edtavBarkgmagrupada_Internalname = "vBARKGMAGRUPADA_"+sGXsfl_172_fel_idx ;
   }

   public void sendrow_1722( )
   {
      subsflControlProps_1722( ) ;
      wbBW0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_172_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_172_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_172_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarAGrHdr_Internalname,GXutil.rtrim( A13695BarAGrHdr),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarAGrHdr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(172),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarseragrupada_Internalname,GXutil.rtrim( AV19BarserAgrupada),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarseragrupada_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarseragrupada_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(172),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarnomcliagrupada_Internalname,GXutil.rtrim( AV26BarNomCliAgrupada),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarnomcliagrupada_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarnomcliagrupada_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(172),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcolnomagrupada_Internalname,GXutil.rtrim( AV20BarColNomAgrupada),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarcolnomagrupada_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarcolnomagrupada_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(172),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarkgmagrupada_Internalname,GXutil.ltrim( localUtil.ntoc( AV21BarKgmAgrupada, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavBarkgmagrupada_Enabled!=0) ? localUtil.format( AV21BarKgmAgrupada, "ZZZZZ9.99") : localUtil.format( AV21BarKgmAgrupada, "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavBarkgmagrupada_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavBarkgmagrupada_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(172),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesBW2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_172_idx = ((subGrid_Islastpage==1)&&(nGXsfl_172_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_172_idx+1) ;
         sGXsfl_172_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_172_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1722( ) ;
      }
      /* End function sendrow_1722 */
   }

   public void startgridcontrol172( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"172\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color Cliente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13695BarAGrHdr));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV19BarserAgrupada));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarseragrupada_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV26BarNomCliAgrupada));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarnomcliagrupada_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV20BarColNomAgrupada));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarcolnomagrupada_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV21BarKgmAgrupada, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavBarkgmagrupada_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavHdr_Internalname = "vHDR" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      lblTextblockbarmaqcod_Internalname = "TEXTBLOCKBARMAQCOD" ;
      edtBarMaqCod_Internalname = "BARMAQCOD" ;
      divUnnamedtablebarmaqcod_Internalname = "UNNAMEDTABLEBARMAQCOD" ;
      lblTextblockmaqdsc_Internalname = "TEXTBLOCKMAQDSC" ;
      edtavMaqdsc_Internalname = "vMAQDSC" ;
      divUnnamedtablemaqdsc_Internalname = "UNNAMEDTABLEMAQDSC" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      edtavTxthayreceta_Internalname = "vTXTHAYRECETA" ;
      tblUnnamedtable8_Internalname = "UNNAMEDTABLE8" ;
      tblPnlmaquina_Internalname = "PNLMAQUINA" ;
      Dvpanel_pnlmaquina_Internalname = "DVPANEL_PNLMAQUINA" ;
      lblTextblockclicod_Internalname = "TEXTBLOCKCLICOD" ;
      edtCliCod_Internalname = "CLICOD" ;
      divUnnamedtableclicod_Internalname = "UNNAMEDTABLECLICOD" ;
      lblTextblockclinom_Internalname = "TEXTBLOCKCLINOM" ;
      edtCliNom_Internalname = "CLINOM" ;
      divUnnamedtableclinom_Internalname = "UNNAMEDTABLECLINOM" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      lblTextblockbarenccli_Internalname = "TEXTBLOCKBARENCCLI" ;
      edtBarEncCli_Internalname = "BARENCCLI" ;
      divUnnamedtablebarenccli_Internalname = "UNNAMEDTABLEBARENCCLI" ;
      lblTextblockbarser_Internalname = "TEXTBLOCKBARSER" ;
      edtBarSer_Internalname = "BARSER" ;
      divUnnamedtablebarser_Internalname = "UNNAMEDTABLEBARSER" ;
      lblTextblockbarserdsc_Internalname = "TEXTBLOCKBARSERDSC" ;
      edtBarSerDsc_Internalname = "BARSERDSC" ;
      divUnnamedtablebarserdsc_Internalname = "UNNAMEDTABLEBARSERDSC" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      lblTextblockbarcolnom_Internalname = "TEXTBLOCKBARCOLNOM" ;
      edtBarColNom_Internalname = "BARCOLNOM" ;
      divUnnamedtablebarcolnom_Internalname = "UNNAMEDTABLEBARCOLNOM" ;
      lblTextblockbarnomcli_Internalname = "TEXTBLOCKBARNOMCLI" ;
      edtBarNomCli_Internalname = "BARNOMCLI" ;
      divUnnamedtablebarnomcli_Internalname = "UNNAMEDTABLEBARNOMCLI" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      lblTextblockbarkgm_Internalname = "TEXTBLOCKBARKGM" ;
      edtBarKgm_Internalname = "BARKGM" ;
      divUnnamedtablebarkgm_Internalname = "UNNAMEDTABLEBARKGM" ;
      lblTextblockrectotkgm_Internalname = "TEXTBLOCKRECTOTKGM" ;
      edtRecTotKgm_Internalname = "RECTOTKGM" ;
      divUnnamedtablerectotkgm_Internalname = "UNNAMEDTABLERECTOTKGM" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      tblPnlpedidocliente_Internalname = "PNLPEDIDOCLIENTE" ;
      Dvpanel_pnlpedidocliente_Internalname = "DVPANEL_PNLPEDIDOCLIENTE" ;
      lblTextblockbarfasest_Internalname = "TEXTBLOCKBARFASEST" ;
      cmbavBarfasest.setInternalname( "vBARFASEST" );
      divUnnamedtablebarfasest_Internalname = "UNNAMEDTABLEBARFASEST" ;
      lblTextblockbarfasdti_Internalname = "TEXTBLOCKBARFASDTI" ;
      edtavBarfasdti_Internalname = "vBARFASDTI" ;
      divUnnamedtablebarfasdti_Internalname = "UNNAMEDTABLEBARFASDTI" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      tblPnlproduccion_Internalname = "PNLPRODUCCION" ;
      Dvpanel_pnlproduccion_Internalname = "DVPANEL_PNLPRODUCCION" ;
      edtBarAGrHdr_Internalname = "BARAGRHDR" ;
      edtavBarseragrupada_Internalname = "vBARSERAGRUPADA" ;
      edtavBarnomcliagrupada_Internalname = "vBARNOMCLIAGRUPADA" ;
      edtavBarcolnomagrupada_Internalname = "vBARCOLNOMAGRUPADA" ;
      edtavBarkgmagrupada_Internalname = "vBARKGMAGRUPADA" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      tblPnlagrupadas_Internalname = "PNLAGRUPADAS" ;
      Dvpanel_pnlagrupadas_Internalname = "DVPANEL_PNLAGRUPADAS" ;
      divDvpanel_pnlagrupadas_cell_Internalname = "DVPANEL_PNLAGRUPADAS_CELL" ;
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
      subGrid_Header = "" ;
      edtavBarkgmagrupada_Jsonclick = "" ;
      edtavBarkgmagrupada_Enabled = 0 ;
      edtavBarcolnomagrupada_Jsonclick = "" ;
      edtavBarcolnomagrupada_Enabled = 0 ;
      edtavBarnomcliagrupada_Jsonclick = "" ;
      edtavBarnomcliagrupada_Enabled = 0 ;
      edtavBarseragrupada_Jsonclick = "" ;
      edtavBarseragrupada_Enabled = 0 ;
      edtBarAGrHdr_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTxthayreceta_Jsonclick = "" ;
      edtavTxthayreceta_Enabled = 1 ;
      edtavMaqdsc_Jsonclick = "" ;
      edtavMaqdsc_Enabled = 1 ;
      edtBarMaqCod_Jsonclick = "" ;
      edtBarMaqCod_Enabled = 0 ;
      edtavHdr_Jsonclick = "" ;
      edtavHdr_Enabled = 1 ;
      edtRecTotKgm_Jsonclick = "" ;
      edtRecTotKgm_Enabled = 0 ;
      edtBarKgm_Jsonclick = "" ;
      edtBarKgm_Enabled = 0 ;
      edtBarNomCli_Jsonclick = "" ;
      edtBarNomCli_Enabled = 0 ;
      edtBarColNom_Jsonclick = "" ;
      edtBarColNom_Enabled = 0 ;
      edtBarSerDsc_Jsonclick = "" ;
      edtBarSerDsc_Enabled = 0 ;
      edtBarSer_Jsonclick = "" ;
      edtBarSer_Enabled = 0 ;
      edtBarEncCli_Jsonclick = "" ;
      edtBarEncCli_Enabled = 0 ;
      edtCliNom_Jsonclick = "" ;
      edtCliNom_Enabled = 0 ;
      edtCliCod_Jsonclick = "" ;
      edtCliCod_Enabled = 0 ;
      edtavBarfasdti_Jsonclick = "" ;
      edtavBarfasdti_Enabled = 1 ;
      cmbavBarfasest.setJsonclick( "" );
      cmbavBarfasest.setEnabled( 1 );
      edtavGridcurrentpage_Jsonclick = "" ;
      edtavGridcurrentpage_Visible = 1 ;
      divDvpanel_pnlagrupadas_cell_Class = "" ;
      Dvpanel_pnlagrupadas_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnlagrupadas_Iconposition = "Right" ;
      Dvpanel_pnlagrupadas_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnlagrupadas_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnlagrupadas_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnlagrupadas_Title = httpContext.getMessage( "Agrupadas", "") ;
      Dvpanel_pnlagrupadas_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnlagrupadas_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnlagrupadas_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnlagrupadas_Width = "100%" ;
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
      Dvpanel_pnlproduccion_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnlproduccion_Iconposition = "Right" ;
      Dvpanel_pnlproduccion_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnlproduccion_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnlproduccion_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnlproduccion_Title = httpContext.getMessage( "Informacion Produccion", "") ;
      Dvpanel_pnlproduccion_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnlproduccion_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnlproduccion_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnlproduccion_Width = "100%" ;
      Dvpanel_pnlpedidocliente_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnlpedidocliente_Iconposition = "Right" ;
      Dvpanel_pnlpedidocliente_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnlpedidocliente_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnlpedidocliente_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnlpedidocliente_Title = httpContext.getMessage( "Informacion Pedido Cliente", "") ;
      Dvpanel_pnlpedidocliente_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnlpedidocliente_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnlpedidocliente_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnlpedidocliente_Width = "100%" ;
      Dvpanel_pnlmaquina_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_pnlmaquina_Iconposition = "Right" ;
      Dvpanel_pnlmaquina_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_pnlmaquina_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_pnlmaquina_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_pnlmaquina_Title = httpContext.getMessage( "Informacion Maquina", "") ;
      Dvpanel_pnlmaquina_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_pnlmaquina_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_pnlmaquina_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_pnlmaquina_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Mas Informacion", "") );
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
         AV9BarFasest = (byte)(GXutil.lval( cmbavBarfasest.getValidValue(GXutil.trim( GXutil.str( AV9BarFasest, 1, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9BarFasest", GXutil.str( AV9BarFasest, 1, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV8MaqDsc',fld:'vMAQDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV7Hdr',fld:'vHDR',pic:''},{av:'AV8MaqDsc',fld:'vMAQDSC',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV28txthayReceta',fld:'vTXTHAYRECETA',pic:''},{av:'cmbavBarfasest'},{av:'AV9BarFasest',fld:'vBARFASEST',pic:'9'},{av:'AV10BarFasDti',fld:'vBARFASDTI',pic:'99/99/99 99:99:99'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e15BW2',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV26BarNomCliAgrupada',fld:'vBARNOMCLIAGRUPADA',pic:''},{av:'AV20BarColNomAgrupada',fld:'vBARCOLNOMAGRUPADA',pic:''},{av:'AV19BarserAgrupada',fld:'vBARSERAGRUPADA',pic:''},{av:'AV21BarKgmAgrupada',fld:'vBARKGMAGRUPADA',pic:'ZZZZZ9.99'},{av:'A122BarAgrPar',fld:'BARAGRPAR',pic:''},{av:'A124BarAgrReo',fld:'BARAGRREO',pic:'9'},{av:'A119BarAgrCod',fld:'BARAGRCOD',pic:'ZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e11BW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV8MaqDsc',fld:'vMAQDSC',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'},{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV7Hdr',fld:'vHDR',pic:''},{av:'AV8MaqDsc',fld:'vMAQDSC',pic:''},{av:'A180BarMaqCod',fld:'BARMAQCOD',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'AV28txthayReceta',fld:'vTXTHAYRECETA',pic:''},{av:'cmbavBarfasest'},{av:'AV9BarFasest',fld:'vBARFASEST',pic:'9'},{av:'AV10BarFasDti',fld:'vBARFASDTI',pic:'99/99/99 99:99:99'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e12BW2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A129BarCod',fld:'BARCOD',pic:'ZZZZZZZ9',hsh:true},{av:'A132BarCodReo',fld:'BARCODREO',pic:'9',hsh:true},{av:'A130BarCodPar',fld:'BARCODPAR',pic:'',hsh:true},{av:'AV8MaqDsc',fld:'vMAQDSC',pic:''},{av:'A150BarFacTin',fld:'BARFACTIN',pic:'@!'},{av:'A153BarFasEst',fld:'BARFASEST',pic:'9'},{av:'A4442BarFasDTI',fld:'BARFASDTI',pic:'99/99/99 99:99:99'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_CLICOD","{handler:'valid_Clicod',iparms:[]");
      setEventMetadata("VALID_CLICOD",",oparms:[]}");
      setEventMetadata("VALID_BARKGM","{handler:'valid_Barkgm',iparms:[]");
      setEventMetadata("VALID_BARKGM",",oparms:[]}");
      setEventMetadata("VALIDV_BARFASEST","{handler:'validv_Barfasest',iparms:[]");
      setEventMetadata("VALIDV_BARFASEST",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Barkgmagrupada',iparms:[]");
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
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      AV8MaqDsc = "" ;
      A150BarFacTin = "" ;
      A4442BarFasDTI = GXutil.resetTime( GXutil.nullDate() );
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      A122BarAgrPar = "" ;
      A219BarTotAgr = DecimalUtil.ZERO ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_pnlmaquina = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_pnlpedidocliente = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_pnlproduccion = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_pnlagrupadas = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13695BarAGrHdr = "" ;
      AV19BarserAgrupada = "" ;
      AV26BarNomCliAgrupada = "" ;
      AV20BarColNomAgrupada = "" ;
      AV21BarKgmAgrupada = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      H00BW4_A396EmprCod = new String[] {""} ;
      H00BW4_A129BarCod = new int[1] ;
      H00BW4_A132BarCodReo = new byte[1] ;
      H00BW4_A130BarCodPar = new String[] {""} ;
      H00BW4_A120BarAgrEst = new String[] {""} ;
      H00BW4_A180BarMaqCod = new String[] {""} ;
      H00BW4_A252CliCod = new int[1] ;
      H00BW4_n252CliCod = new boolean[] {false} ;
      H00BW4_A279CliNom = new String[] {""} ;
      H00BW4_A4812BarEncCli = new String[] {""} ;
      H00BW4_A212BarSer = new String[] {""} ;
      H00BW4_A1652BarSerDsc = new String[] {""} ;
      H00BW4_A135BarColNom = new String[] {""} ;
      H00BW4_A1234BarNomCli = new String[] {""} ;
      H00BW4_A122BarAgrPar = new String[] {""} ;
      H00BW4_A124BarAgrReo = new byte[1] ;
      H00BW4_A119BarAgrCod = new int[1] ;
      H00BW4_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00BW4_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00BW4_n219BarTotAgr = new boolean[] {false} ;
      A166BarKgm = DecimalUtil.ZERO ;
      H00BW7_AGRID_nRecordCount = new long[1] ;
      H00BW8_A120BarAgrEst = new String[] {""} ;
      H00BW8_A180BarMaqCod = new String[] {""} ;
      H00BW8_A252CliCod = new int[1] ;
      H00BW8_n252CliCod = new boolean[] {false} ;
      H00BW8_A4812BarEncCli = new String[] {""} ;
      H00BW8_A212BarSer = new String[] {""} ;
      H00BW8_A1652BarSerDsc = new String[] {""} ;
      H00BW8_A135BarColNom = new String[] {""} ;
      H00BW8_A1234BarNomCli = new String[] {""} ;
      A120BarAgrEst = "" ;
      A180BarMaqCod = "" ;
      A4812BarEncCli = "" ;
      A212BarSer = "" ;
      A1652BarSerDsc = "" ;
      A135BarColNom = "" ;
      A1234BarNomCli = "" ;
      H00BW9_A279CliNom = new String[] {""} ;
      A279CliNom = "" ;
      H00BW11_A166BarKgm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00BW13_A219BarTotAgr = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00BW13_n219BarTotAgr = new boolean[] {false} ;
      A812RecTotKgm = DecimalUtil.ZERO ;
      AV7Hdr = "" ;
      AV28txthayReceta = "" ;
      AV10BarFasDti = GXutil.resetTime( GXutil.nullDate() );
      hsh = "" ;
      AV31Station = "" ;
      GXt_char1 = "" ;
      AV32Emprcod = "" ;
      AV33Emprnom = "" ;
      AV34Usurcod = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      H00BW14_A758ProCod = new String[] {""} ;
      H00BW14_A194BarOrdLin = new short[1] ;
      H00BW14_A396EmprCod = new String[] {""} ;
      H00BW14_A129BarCod = new int[1] ;
      H00BW14_A132BarCodReo = new byte[1] ;
      H00BW14_A130BarCodPar = new String[] {""} ;
      H00BW14_A150BarFacTin = new String[] {""} ;
      H00BW14_A153BarFasEst = new byte[1] ;
      H00BW14_A4442BarFasDTI = new java.util.Date[] {GXutil.nullDate()} ;
      H00BW14_n4442BarFasDTI = new boolean[] {false} ;
      GXv_char4 = new String[1] ;
      GXv_int7 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_decimal8 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_int10 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_char11 = new String[1] ;
      GXv_int12 = new int[1] ;
      GXv_int13 = new byte[1] ;
      AV22CliNomAgrupada = "" ;
      GXv_char14 = new String[1] ;
      AV23fecha = GXutil.nullDate() ;
      GXv_date15 = new java.util.Date[1] ;
      GXv_int16 = new byte[1] ;
      AV24BarenccliAgrupada = "" ;
      GXv_char17 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_int19 = new int[1] ;
      GXv_date20 = new java.util.Date[1] ;
      GXv_char21 = new String[1] ;
      AV25BarSerDscAgrupada = "" ;
      GXv_char22 = new String[1] ;
      GXv_int23 = new int[1] ;
      GXv_date24 = new java.util.Date[1] ;
      GXv_char25 = new String[1] ;
      GXv_int26 = new short[1] ;
      GXv_int27 = new int[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      lblTextblockbarfasest_Jsonclick = "" ;
      lblTextblockbarfasdti_Jsonclick = "" ;
      lblTextblockclicod_Jsonclick = "" ;
      lblTextblockclinom_Jsonclick = "" ;
      lblTextblockbarenccli_Jsonclick = "" ;
      lblTextblockbarser_Jsonclick = "" ;
      lblTextblockbarserdsc_Jsonclick = "" ;
      lblTextblockbarcolnom_Jsonclick = "" ;
      lblTextblockbarnomcli_Jsonclick = "" ;
      lblTextblockbarkgm_Jsonclick = "" ;
      lblTextblockrectotkgm_Jsonclick = "" ;
      lblTextblockbarmaqcod_Jsonclick = "" ;
      lblTextblockmaqdsc_Jsonclick = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.masinformacion__default(),
         new Object[] {
             new Object[] {
            H00BW4_A396EmprCod, H00BW4_A129BarCod, H00BW4_A132BarCodReo, H00BW4_A130BarCodPar, H00BW4_A120BarAgrEst, H00BW4_A180BarMaqCod, H00BW4_A252CliCod, H00BW4_n252CliCod, H00BW4_A279CliNom, H00BW4_A4812BarEncCli,
            H00BW4_A212BarSer, H00BW4_A1652BarSerDsc, H00BW4_A135BarColNom, H00BW4_A1234BarNomCli, H00BW4_A122BarAgrPar, H00BW4_A124BarAgrReo, H00BW4_A119BarAgrCod, H00BW4_A166BarKgm, H00BW4_A219BarTotAgr, H00BW4_n219BarTotAgr
            }
            , new Object[] {
            H00BW7_AGRID_nRecordCount
            }
            , new Object[] {
            H00BW8_A120BarAgrEst, H00BW8_A180BarMaqCod, H00BW8_A252CliCod, H00BW8_n252CliCod, H00BW8_A4812BarEncCli, H00BW8_A212BarSer, H00BW8_A1652BarSerDsc, H00BW8_A135BarColNom, H00BW8_A1234BarNomCli
            }
            , new Object[] {
            H00BW9_A279CliNom
            }
            , new Object[] {
            H00BW11_A166BarKgm
            }
            , new Object[] {
            H00BW13_A219BarTotAgr, H00BW13_n219BarTotAgr
            }
            , new Object[] {
            H00BW14_A758ProCod, H00BW14_A194BarOrdLin, H00BW14_A396EmprCod, H00BW14_A129BarCod, H00BW14_A132BarCodReo, H00BW14_A130BarCodPar, H00BW14_A150BarFacTin, H00BW14_A153BarFasEst, H00BW14_A4442BarFasDTI, H00BW14_n4442BarFasDTI
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavHdr_Enabled = 0 ;
      edtavMaqdsc_Enabled = 0 ;
      edtavTxthayreceta_Enabled = 0 ;
      cmbavBarfasest.setEnabled( 0 );
      edtavBarfasdti_Enabled = 0 ;
      edtavBarseragrupada_Enabled = 0 ;
      edtavBarnomcliagrupada_Enabled = 0 ;
      edtavBarcolnomagrupada_Enabled = 0 ;
      edtavBarkgmagrupada_Enabled = 0 ;
   }

   private byte wcpOA132BarCodReo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte A132BarCodReo ;
   private byte A153BarFasEst ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte A124BarAgrReo ;
   private byte nDonePA ;
   private byte AV9BarFasest ;
   private byte subGrid_Backcolorstyle ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte GXv_int13[] ;
   private byte GXv_int16[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV27FlagRec ;
   private short GXv_int26[] ;
   private int wcpOA129BarCod ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_172 ;
   private int subGrid_Rows ;
   private int A129BarCod ;
   private int nGXsfl_172_idx=1 ;
   private int A119BarAgrCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavGridcurrentpage_Visible ;
   private int subGrid_Islastpage ;
   private int edtavHdr_Enabled ;
   private int edtavMaqdsc_Enabled ;
   private int edtavTxthayreceta_Enabled ;
   private int edtavBarfasdti_Enabled ;
   private int edtavBarseragrupada_Enabled ;
   private int edtavBarnomcliagrupada_Enabled ;
   private int edtavBarcolnomagrupada_Enabled ;
   private int edtavBarkgmagrupada_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A252CliCod ;
   private int GXv_int7[] ;
   private int GXv_int10[] ;
   private int GXv_int12[] ;
   private int GXv_int19[] ;
   private int GXv_int23[] ;
   private int GXv_int27[] ;
   private int AV14PageToGo ;
   private int edtCliCod_Enabled ;
   private int edtCliNom_Enabled ;
   private int edtBarEncCli_Enabled ;
   private int edtBarSer_Enabled ;
   private int edtBarSerDsc_Enabled ;
   private int edtBarColNom_Enabled ;
   private int edtBarNomCli_Enabled ;
   private int edtBarKgm_Enabled ;
   private int edtRecTotKgm_Enabled ;
   private int edtBarMaqCod_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV16GridPageCount ;
   private long AV15GridCurrentPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal A219BarTotAgr ;
   private java.math.BigDecimal AV21BarKgmAgrupada ;
   private java.math.BigDecimal A166BarKgm ;
   private java.math.BigDecimal A812RecTotKgm ;
   private java.math.BigDecimal GXv_decimal8[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String wcpOA396EmprCod ;
   private String wcpOA130BarCodPar ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String A396EmprCod ;
   private String A130BarCodPar ;
   private String sGXsfl_172_idx="0001" ;
   private String AV8MaqDsc ;
   private String A150BarFacTin ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A122BarAgrPar ;
   private String Dvpanel_pnlmaquina_Width ;
   private String Dvpanel_pnlmaquina_Cls ;
   private String Dvpanel_pnlmaquina_Title ;
   private String Dvpanel_pnlmaquina_Iconposition ;
   private String Dvpanel_pnlpedidocliente_Width ;
   private String Dvpanel_pnlpedidocliente_Cls ;
   private String Dvpanel_pnlpedidocliente_Title ;
   private String Dvpanel_pnlpedidocliente_Iconposition ;
   private String Dvpanel_pnlproduccion_Width ;
   private String Dvpanel_pnlproduccion_Cls ;
   private String Dvpanel_pnlproduccion_Title ;
   private String Dvpanel_pnlproduccion_Iconposition ;
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
   private String Dvpanel_pnlagrupadas_Width ;
   private String Dvpanel_pnlagrupadas_Cls ;
   private String Dvpanel_pnlagrupadas_Title ;
   private String Dvpanel_pnlagrupadas_Iconposition ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_pnlmaquina_Internalname ;
   private String Dvpanel_pnlpedidocliente_Internalname ;
   private String Dvpanel_pnlproduccion_Internalname ;
   private String divDvpanel_pnlagrupadas_cell_Internalname ;
   private String divDvpanel_pnlagrupadas_cell_Class ;
   private String Dvpanel_pnlagrupadas_Internalname ;
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
   private String A13695BarAGrHdr ;
   private String edtBarAGrHdr_Internalname ;
   private String AV19BarserAgrupada ;
   private String edtavBarseragrupada_Internalname ;
   private String AV26BarNomCliAgrupada ;
   private String edtavBarnomcliagrupada_Internalname ;
   private String AV20BarColNomAgrupada ;
   private String edtavBarcolnomagrupada_Internalname ;
   private String edtavBarkgmagrupada_Internalname ;
   private String edtavHdr_Internalname ;
   private String edtavMaqdsc_Internalname ;
   private String edtavTxthayreceta_Internalname ;
   private String edtavBarfasdti_Internalname ;
   private String scmdbuf ;
   private String A120BarAgrEst ;
   private String A180BarMaqCod ;
   private String A4812BarEncCli ;
   private String A212BarSer ;
   private String A1652BarSerDsc ;
   private String A135BarColNom ;
   private String A1234BarNomCli ;
   private String A279CliNom ;
   private String AV7Hdr ;
   private String edtBarMaqCod_Internalname ;
   private String AV28txthayReceta ;
   private String edtCliCod_Internalname ;
   private String edtCliNom_Internalname ;
   private String edtBarEncCli_Internalname ;
   private String edtBarSer_Internalname ;
   private String edtBarSerDsc_Internalname ;
   private String edtBarColNom_Internalname ;
   private String edtBarNomCli_Internalname ;
   private String edtBarKgm_Internalname ;
   private String edtRecTotKgm_Internalname ;
   private String hsh ;
   private String AV31Station ;
   private String GXt_char1 ;
   private String AV32Emprcod ;
   private String AV33Emprnom ;
   private String AV34Usurcod ;
   private String Gridpaginationbar_Internalname ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char11[] ;
   private String AV22CliNomAgrupada ;
   private String GXv_char14[] ;
   private String AV24BarenccliAgrupada ;
   private String GXv_char17[] ;
   private String GXv_char18[] ;
   private String GXv_char21[] ;
   private String AV25BarSerDscAgrupada ;
   private String GXv_char22[] ;
   private String GXv_char25[] ;
   private String tblPnlagrupadas_Internalname ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String tblPnlproduccion_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtablebarfasest_Internalname ;
   private String lblTextblockbarfasest_Internalname ;
   private String lblTextblockbarfasest_Jsonclick ;
   private String divUnnamedtablebarfasdti_Internalname ;
   private String lblTextblockbarfasdti_Internalname ;
   private String lblTextblockbarfasdti_Jsonclick ;
   private String edtavBarfasdti_Jsonclick ;
   private String tblPnlpedidocliente_Internalname ;
   private String divUnnamedtable2_Internalname ;
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
   private String divUnnamedtable3_Internalname ;
   private String divUnnamedtablebarser_Internalname ;
   private String lblTextblockbarser_Internalname ;
   private String lblTextblockbarser_Jsonclick ;
   private String edtBarSer_Jsonclick ;
   private String divUnnamedtablebarserdsc_Internalname ;
   private String lblTextblockbarserdsc_Internalname ;
   private String lblTextblockbarserdsc_Jsonclick ;
   private String edtBarSerDsc_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String divUnnamedtablebarcolnom_Internalname ;
   private String lblTextblockbarcolnom_Internalname ;
   private String lblTextblockbarcolnom_Jsonclick ;
   private String edtBarColNom_Jsonclick ;
   private String divUnnamedtablebarnomcli_Internalname ;
   private String lblTextblockbarnomcli_Internalname ;
   private String lblTextblockbarnomcli_Jsonclick ;
   private String edtBarNomCli_Jsonclick ;
   private String divUnnamedtable5_Internalname ;
   private String divUnnamedtablebarkgm_Internalname ;
   private String lblTextblockbarkgm_Internalname ;
   private String lblTextblockbarkgm_Jsonclick ;
   private String edtBarKgm_Jsonclick ;
   private String divUnnamedtablerectotkgm_Internalname ;
   private String lblTextblockrectotkgm_Internalname ;
   private String lblTextblockrectotkgm_Jsonclick ;
   private String edtRecTotKgm_Jsonclick ;
   private String tblPnlmaquina_Internalname ;
   private String divUnnamedtable6_Internalname ;
   private String edtavHdr_Jsonclick ;
   private String divUnnamedtable7_Internalname ;
   private String divUnnamedtablebarmaqcod_Internalname ;
   private String lblTextblockbarmaqcod_Internalname ;
   private String lblTextblockbarmaqcod_Jsonclick ;
   private String edtBarMaqCod_Jsonclick ;
   private String divUnnamedtablemaqdsc_Internalname ;
   private String lblTextblockmaqdsc_Internalname ;
   private String lblTextblockmaqdsc_Jsonclick ;
   private String edtavMaqdsc_Jsonclick ;
   private String tblUnnamedtable8_Internalname ;
   private String edtavTxthayreceta_Jsonclick ;
   private String sGXsfl_172_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtBarAGrHdr_Jsonclick ;
   private String edtavBarseragrupada_Jsonclick ;
   private String edtavBarnomcliagrupada_Jsonclick ;
   private String edtavBarcolnomagrupada_Jsonclick ;
   private String edtavBarkgmagrupada_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A4442BarFasDTI ;
   private java.util.Date AV10BarFasDti ;
   private java.util.Date AV23fecha ;
   private java.util.Date GXv_date15[] ;
   private java.util.Date GXv_date20[] ;
   private java.util.Date GXv_date24[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean n4442BarFasDTI ;
   private boolean Dvpanel_pnlmaquina_Autowidth ;
   private boolean Dvpanel_pnlmaquina_Autoheight ;
   private boolean Dvpanel_pnlmaquina_Collapsible ;
   private boolean Dvpanel_pnlmaquina_Collapsed ;
   private boolean Dvpanel_pnlmaquina_Showcollapseicon ;
   private boolean Dvpanel_pnlmaquina_Autoscroll ;
   private boolean Dvpanel_pnlpedidocliente_Autowidth ;
   private boolean Dvpanel_pnlpedidocliente_Autoheight ;
   private boolean Dvpanel_pnlpedidocliente_Collapsible ;
   private boolean Dvpanel_pnlpedidocliente_Collapsed ;
   private boolean Dvpanel_pnlpedidocliente_Showcollapseicon ;
   private boolean Dvpanel_pnlpedidocliente_Autoscroll ;
   private boolean Dvpanel_pnlproduccion_Autowidth ;
   private boolean Dvpanel_pnlproduccion_Autoheight ;
   private boolean Dvpanel_pnlproduccion_Collapsible ;
   private boolean Dvpanel_pnlproduccion_Collapsed ;
   private boolean Dvpanel_pnlproduccion_Showcollapseicon ;
   private boolean Dvpanel_pnlproduccion_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Dvpanel_pnlagrupadas_Autowidth ;
   private boolean Dvpanel_pnlagrupadas_Autoheight ;
   private boolean Dvpanel_pnlagrupadas_Collapsible ;
   private boolean Dvpanel_pnlagrupadas_Collapsed ;
   private boolean Dvpanel_pnlagrupadas_Showcollapseicon ;
   private boolean Dvpanel_pnlagrupadas_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_172_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n219BarTotAgr ;
   private boolean n252CliCod ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnlmaquina ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnlpedidocliente ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnlproduccion ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_pnlagrupadas ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavBarfasest ;
   private IDataStoreProvider pr_default ;
   private String[] H00BW4_A396EmprCod ;
   private int[] H00BW4_A129BarCod ;
   private byte[] H00BW4_A132BarCodReo ;
   private String[] H00BW4_A130BarCodPar ;
   private String[] H00BW4_A120BarAgrEst ;
   private String[] H00BW4_A180BarMaqCod ;
   private int[] H00BW4_A252CliCod ;
   private boolean[] H00BW4_n252CliCod ;
   private String[] H00BW4_A279CliNom ;
   private String[] H00BW4_A4812BarEncCli ;
   private String[] H00BW4_A212BarSer ;
   private String[] H00BW4_A1652BarSerDsc ;
   private String[] H00BW4_A135BarColNom ;
   private String[] H00BW4_A1234BarNomCli ;
   private String[] H00BW4_A122BarAgrPar ;
   private byte[] H00BW4_A124BarAgrReo ;
   private int[] H00BW4_A119BarAgrCod ;
   private java.math.BigDecimal[] H00BW4_A166BarKgm ;
   private java.math.BigDecimal[] H00BW4_A219BarTotAgr ;
   private boolean[] H00BW4_n219BarTotAgr ;
   private long[] H00BW7_AGRID_nRecordCount ;
   private String[] H00BW8_A120BarAgrEst ;
   private String[] H00BW8_A180BarMaqCod ;
   private int[] H00BW8_A252CliCod ;
   private boolean[] H00BW8_n252CliCod ;
   private String[] H00BW8_A4812BarEncCli ;
   private String[] H00BW8_A212BarSer ;
   private String[] H00BW8_A1652BarSerDsc ;
   private String[] H00BW8_A135BarColNom ;
   private String[] H00BW8_A1234BarNomCli ;
   private String[] H00BW9_A279CliNom ;
   private java.math.BigDecimal[] H00BW11_A166BarKgm ;
   private java.math.BigDecimal[] H00BW13_A219BarTotAgr ;
   private boolean[] H00BW13_n219BarTotAgr ;
   private String[] H00BW14_A758ProCod ;
   private short[] H00BW14_A194BarOrdLin ;
   private String[] H00BW14_A396EmprCod ;
   private int[] H00BW14_A129BarCod ;
   private byte[] H00BW14_A132BarCodReo ;
   private String[] H00BW14_A130BarCodPar ;
   private String[] H00BW14_A150BarFacTin ;
   private byte[] H00BW14_A153BarFasEst ;
   private java.util.Date[] H00BW14_A4442BarFasDTI ;
   private boolean[] H00BW14_n4442BarFasDTI ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class masinformacion__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00BW4", "SELECT T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T2.BarAgrEst, T2.BarMaqCod, T2.CliCod, T3.CliNom, T2.BarEncCli, T2.BarSer, T2.BarSerDsc, T2.BarColNom, T2.BarNomCli, T1.BarAgrPar, T1.BarAgrReo, T1.BarAgrCod, COALESCE( T4.BarKgm, 0) AS BarKgm, COALESCE( T5.BarTotAgr, 0) AS BarTotAgr FROM ((((TXPBARAGR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BW7", "SELECT COUNT(*) FROM ((((TXPBARAGR T1 INNER JOIN TXPBARCAD T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar) LEFT JOIN TXPCLIENT T3 ON T3.EmprCod = T1.EmprCod AND T3.CliCod = T2.CliCod) LEFT JOIN (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T4 ON T4.EmprCod = T1.EmprCod AND T4.BarCod = T1.BarCod AND T4.BarCodReo = T1.BarCodReo AND T4.BarCodPar = T1.BarCodPar) LEFT JOIN (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T5 ON T5.EmprCod = T1.EmprCod AND T5.BarCod = T1.BarCod AND T5.BarCodReo = T1.BarCodReo AND T5.BarCodPar = T1.BarCodPar) WHERE T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BW8", "SELECT BarAgrEst, BarMaqCod, CliCod, BarEncCli, BarSer, BarSerDsc, BarColNom, BarNomCli FROM TXPBARCAD WHERE EmprCod = ? AND BarCod = ? AND BarCodReo = ? AND BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BW9", "SELECT CliNom FROM TXPCLIENT WHERE EmprCod = ? AND CliCod = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BW11", "SELECT COALESCE( T1.BarKgm, 0) AS BarKgm FROM (SELECT EmprCod, BarCod, BarCodReo, BarCodPar, SUM(BarPieKil) AS BarKgm FROM TXPBARPIE GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BW13", "SELECT COALESCE( T1.BarTotAgr, 0) AS BarTotAgr FROM (SELECT SUM(KgmAgr) AS BarTotAgr, EmprCod, BarCod, BarCodReo, BarCodPar FROM TXPBARAGR GROUP BY EmprCod, BarCod, BarCodReo, BarCodPar ) T1 WHERE T1.EmprCod = ? AND T1.BarCod = ? AND T1.BarCodReo = ? AND T1.BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00BW14", "SELECT ProCod, BarOrdLin, EmprCod, BarCod, BarCodReo, BarCodPar, BarFacTin, BarFasEst, BarFasDTI FROM TXPBARFAS WHERE (EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ?) AND (BarFacTin = 'S') ORDER BY EmprCod, BarCod, BarCodReo, BarCodPar ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[10])[0] = rslt.getString(10, 16);
               ((String[]) buf[11])[0] = rslt.getString(11, 26);
               ((String[]) buf[12])[0] = rslt.getString(12, 13);
               ((String[]) buf[13])[0] = rslt.getString(13, 13);
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
               ((String[]) buf[5])[0] = rslt.getString(5, 16);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((String[]) buf[7])[0] = rslt.getString(7, 13);
               ((String[]) buf[8])[0] = rslt.getString(8, 13);
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
            case 6 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

