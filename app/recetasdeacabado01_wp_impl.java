package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class recetasdeacabado01_wp_impl extends GXDataArea
{
   public recetasdeacabado01_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public recetasdeacabado01_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( recetasdeacabado01_wp_impl.class ));
   }

   public recetasdeacabado01_wp_impl( int remoteHandle ,
                                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSeleccionar = UIFactory.getCheckbox(this);
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
               AV18BarKgm = CommonUtil.decimalVal( httpContext.GetPar( "BarKgm"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18BarKgm", GXutil.ltrimstr( AV18BarKgm, 9, 2));
               AV19BarMtr = CommonUtil.decimalVal( httpContext.GetPar( "BarMtr"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19BarMtr", GXutil.ltrimstr( AV19BarMtr, 9, 2));
               AV10Maqcod = httpContext.GetPar( "Maqcod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Maqcod", AV10Maqcod);
               AV12MaqDsc = httpContext.GetPar( "MaqDsc") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12MaqDsc", AV12MaqDsc);
               AV13MaqVolRes = (int)(GXutil.lval( httpContext.GetPar( "MaqVolRes"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MaqVolRes), 5, 0));
               AV14MaqVolTop = (int)(GXutil.lval( httpContext.GetPar( "MaqVolTop"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14MaqVolTop), 5, 0));
               AV11ArtFacAbs = CommonUtil.decimalVal( httpContext.GetPar( "ArtFacAbs"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11ArtFacAbs", GXutil.ltrimstr( AV11ArtFacAbs, 6, 2));
               AV9Procod = httpContext.GetPar( "Procod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Procod", AV9Procod);
               AV39ErrMensaje1 = httpContext.GetPar( "ErrMensaje1") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV39ErrMensaje1", AV39ErrMensaje1);
               AV38ErrMensaje = httpContext.GetPar( "ErrMensaje") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV38ErrMensaje", AV38ErrMensaje);
               AV51HdrscreadasToJson = httpContext.GetPar( "HdrscreadasToJson") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV51HdrscreadasToJson", AV51HdrscreadasToJson);
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
      nRC_GXsfl_99 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_99"))) ;
      nGXsfl_99_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_99_idx"))) ;
      sGXsfl_99_idx = httpContext.GetPar( "sGXsfl_99_idx") ;
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6Barcod = (int)(GXutil.lval( httpContext.GetPar( "Barcod"))) ;
      AV7Barcodreo = (byte)(GXutil.lval( httpContext.GetPar( "Barcodreo"))) ;
      AV8Barcodpar = httpContext.GetPar( "Barcodpar") ;
      AV9Procod = httpContext.GetPar( "Procod") ;
      AV17VolMul = (int)(GXutil.lval( httpContext.GetPar( "VolMul"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9Procod, AV17VolMul) ;
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
      pa1HH2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1HH2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.recetasdeacabado01_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8Barcodpar)),GXutil.URLEncode(DecimalUtil.decToString(AV18BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV19BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV10Maqcod)),GXutil.URLEncode(GXutil.rtrim(AV12MaqDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV13MaqVolRes,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14MaqVolTop,5,0)),GXutil.URLEncode(DecimalUtil.decToString(AV11ArtFacAbs)),GXutil.URLEncode(GXutil.rtrim(AV9Procod)),GXutil.URLEncode(GXutil.rtrim(AV39ErrMensaje1)),GXutil.URLEncode(GXutil.rtrim(AV38ErrMensaje)),GXutil.URLEncode(GXutil.rtrim(AV51HdrscreadasToJson))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","BarKgm","BarMtr","Maqcod","MaqDsc","MaqVolRes","MaqVolTop","ArtFacAbs","Procod","ErrMensaje1","ErrMensaje","HdrscreadasToJson"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17VolMul), "ZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_99", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_99, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCOD", GXutil.ltrim( localUtil.ntoc( AV6Barcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODREO", GXutil.ltrim( localUtil.ntoc( AV7Barcodreo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARCODPAR", GXutil.rtrim( AV8Barcodpar));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV47CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARSER", GXutil.rtrim( AV48BarSer));
      app.GxWebStd.gx_hidden_field( httpContext, "vPROCOD", GXutil.rtrim( AV9Procod));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQCOD", GXutil.rtrim( AV10Maqcod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV49UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECLINMAQ", GXutil.ltrim( localUtil.ntoc( AV43RecLinMaq, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vLTSREC", GXutil.ltrim( localUtil.ntoc( AV44LtsRec, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vABS2", GXutil.ltrim( localUtil.ntoc( AV45Abs2, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAR1", GXutil.rtrim( AV46Var1));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vHDRSCREADAS_SDTS", AV54Hdrscreadas_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vHDRSCREADAS_SDTS", AV54Hdrscreadas_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vARTFACABS", GXutil.ltrim( localUtil.ntoc( AV11ArtFacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMAQDSC", GXutil.rtrim( AV12MaqDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARMTR", GXutil.ltrim( localUtil.ntoc( AV19BarMtr, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vBARKGM", GXutil.ltrim( localUtil.ntoc( AV18BarKgm, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHDRSCREADASTOJSON", AV51HdrscreadasToJson);
      app.GxWebStd.gx_hidden_field( httpContext, "vERRMENSAJE", AV38ErrMensaje);
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLMUL", GXutil.ltrim( localUtil.ntoc( AV17VolMul, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17VolMul), "ZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vREP2", GXutil.ltrim( localUtil.ntoc( AV24Rep2, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLUMEN2", GXutil.ltrim( localUtil.ntoc( AV25Volumen2, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLUMENES", GXutil.rtrim( AV31Volumenes));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLUMENC", GXutil.ltrim( localUtil.ntoc( AV28Volumenc, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLPAR", GXutil.ltrim( localUtil.ntoc( AV29VolPar, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vI", GXutil.ltrim( localUtil.ntoc( AV40i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
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
         we1HH2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1HH2( ) ;
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
      return formatLink("app.recetasdeacabado01_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV8Barcodpar)),GXutil.URLEncode(DecimalUtil.decToString(AV18BarKgm)),GXutil.URLEncode(DecimalUtil.decToString(AV19BarMtr)),GXutil.URLEncode(GXutil.rtrim(AV10Maqcod)),GXutil.URLEncode(GXutil.rtrim(AV12MaqDsc)),GXutil.URLEncode(GXutil.ltrimstr(AV13MaqVolRes,5,0)),GXutil.URLEncode(GXutil.ltrimstr(AV14MaqVolTop,5,0)),GXutil.URLEncode(DecimalUtil.decToString(AV11ArtFacAbs)),GXutil.URLEncode(GXutil.rtrim(AV9Procod)),GXutil.URLEncode(GXutil.rtrim(AV39ErrMensaje1)),GXutil.URLEncode(GXutil.rtrim(AV38ErrMensaje)),GXutil.URLEncode(GXutil.rtrim(AV51HdrscreadasToJson))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar","BarKgm","BarMtr","Maqcod","MaqDsc","MaqVolRes","MaqVolTop","ArtFacAbs","Procod","ErrMensaje1","ErrMensaje","HdrscreadasToJson"})  ;
   }

   public String getPgmname( )
   {
      return "RecetasdeAcabado01_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Recetas de acabado", "") ;
   }

   public void wb1HH0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavErrmensaje1_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Multiple line edit */
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         ClassString = "AttributeFL" ;
         StyleString = "" ;
         app.GxWebStd.gx_html_textarea( httpContext, edtavErrmensaje1_Internalname, AV39ErrMensaje1, "", "", (short)(0), 1, edtavErrmensaje1_Enabled, 0, 80, "chr", 7, "row", (byte)(0), StyleString, ClassString, "", "", "512", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_RecetasdeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable7_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavHdr_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavHdr_Internalname, httpContext.getMessage( "Nº Hdr", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavHdr_Internalname, GXutil.rtrim( AV32Hdr), GXutil.rtrim( localUtil.format( AV32Hdr, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavHdr_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavHdr_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaquinadescripcion_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaquinadescripcion_Internalname, httpContext.getMessage( "Maquina", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaquinadescripcion_Internalname, GXutil.rtrim( AV55MaquinaDescripcion), GXutil.rtrim( localUtil.format( AV55MaquinaDescripcion, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaquinadescripcion_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaquinadescripcion_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvoltop_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvoltop_Internalname, httpContext.getMessage( "Volumen Tope Baño", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvoltop_Internalname, GXutil.ltrim( localUtil.ntoc( AV14MaqVolTop, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvoltop_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14MaqVolTop), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14MaqVolTop), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvoltop_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvoltop_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavMaqvolres_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavMaqvolres_Internalname, httpContext.getMessage( "Volumen Residual", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavMaqvolres_Internalname, GXutil.ltrim( localUtil.ntoc( AV13MaqVolRes, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavMaqvolres_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV13MaqVolRes), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV13MaqVolRes), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavMaqvolres_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavMaqvolres_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado01_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable5_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFacabs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFacabs_Internalname, httpContext.getMessage( "Factor Absorcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFacabs_Internalname, GXutil.ltrim( localUtil.ntoc( AV16FacAbs, (byte)(6), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFacabs_Enabled!=0) ? localUtil.format( AV16FacAbs, "ZZ9.99") : localUtil.format( AV16FacAbs, "ZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,55);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFacabs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFacabs_Enabled, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavVolumen_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavVolumen_Internalname, httpContext.getMessage( "Volumen", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavVolumen_Internalname, GXutil.ltrim( localUtil.ntoc( AV15Volumen, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavVolumen_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV15Volumen), "ZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV15Volumen), "ZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavVolumen_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavVolumen_Enabled, 0, "text", "1", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRep_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRep_Internalname, httpContext.getMessage( "Nº Baños", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRep_Internalname, GXutil.ltrim( localUtil.ntoc( AV23Rep, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavRep_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV23Rep), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV23Rep), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRep_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRep_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTabladevolumenes_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTabladevolumenes_Internalname, httpContext.getMessage( "Volumenes", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTabladevolumenes_Internalname, GXutil.rtrim( AV58tabladevolumenes), GXutil.rtrim( localUtil.format( AV58tabladevolumenes, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,67);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTabladevolumenes_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTabladevolumenes_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_RecetasdeAcabado01_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable6_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTot_kgs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTot_kgs_Internalname, httpContext.getMessage( "Total Kilos", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 75,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTot_kgs_Internalname, GXutil.ltrim( localUtil.ntoc( AV20Tot_kgs, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTot_kgs_Enabled!=0) ? localUtil.format( AV20Tot_kgs, "ZZZZZ9.99") : localUtil.format( AV20Tot_kgs, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,75);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTot_kgs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTot_kgs_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTot_mts_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTot_mts_Internalname, httpContext.getMessage( "Total Metros", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_99_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTot_mts_Internalname, GXutil.ltrim( localUtil.ntoc( AV22Tot_mts, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavTot_mts_Enabled!=0) ? localUtil.format( AV22Tot_mts, "ZZZZZ9.99") : localUtil.format( AV22Tot_mts, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTot_mts_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTot_mts_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_RecetasdeAcabado01_WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 89,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 99, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111hh1_client"+"'", TempTags, "", 2, "HLP_RecetasdeAcabado01_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 99, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_RecetasdeAcabado01_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol99( ) ;
      }
      if ( wbEnd == 99 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_99 = (int)(nGXsfl_99_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
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
         wb_table1_116_1HH2( true) ;
      }
      else
      {
         wb_table1_116_1HH2( false) ;
      }
      return  ;
   }

   public void wb_table1_116_1HH2e( boolean wbgen )
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
      if ( wbEnd == 99 )
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

   public void start1HH2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Recetas de acabado", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1HH0( ) ;
   }

   public void ws1HH2( )
   {
      start1HH2( ) ;
      evt1HH2( ) ;
   }

   public void evt1HH2( )
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e121HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e131HH2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFACABS.ISVALID") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e141HH2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_99_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_992( ) ;
                           AV33Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV33Seleccionar);
                           A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
                           A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
                           A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
                           A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
                           A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
                           A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
                           A5371FasQuiLin = (short)(localUtil.ctol( httpContext.cgiGet( edtFasQuiLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
                           A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e151HH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e161HH2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171HH2 ();
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

   public void we1HH2( )
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

   public void pa1HH2( )
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
      subsflControlProps_992( ) ;
      while ( nGXsfl_99_idx <= nRC_GXsfl_99 )
      {
         sendrow_992( ) ;
         nGXsfl_99_idx = ((subGrid_Islastpage==1)&&(nGXsfl_99_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_99_idx+1) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_992( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5Emprcod ,
                                 int AV6Barcod ,
                                 byte AV7Barcodreo ,
                                 String AV8Barcodpar ,
                                 String AV9Procod ,
                                 int AV17VolMul )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171HH2 ();
      GRID_nCurrentRecord = 0 ;
      rf1HH2( ) ;
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
      rf1HH2( ) ;
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
      edtavErrmensaje1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErrmensaje1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErrmensaje1_Enabled), 5, 0), true);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), true);
      edtavMaquinadescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaquinadescripcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaquinadescripcion_Enabled), 5, 0), true);
      edtavMaqvoltop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvoltop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvoltop_Enabled), 5, 0), true);
      edtavMaqvolres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolres_Enabled), 5, 0), true);
      edtavRep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRep_Enabled), 5, 0), true);
      edtavTabladevolumenes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTabladevolumenes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTabladevolumenes_Enabled), 5, 0), true);
      edtavTot_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_kgs_Enabled), 5, 0), true);
      edtavTot_mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_mts_Enabled), 5, 0), true);
   }

   public void rf1HH2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(99) ;
      /* Execute user event: Refresh */
      e171HH2 ();
      nGXsfl_99_idx = 1 ;
      sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_992( ) ;
      bGXsfl_99_Refreshing = true ;
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
         subsflControlProps_992( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 0 : GRID_nFirstRecordOnPage)) ;
         GXPagingTo2 = ((subGrid_Rows==0) ? 10000 : subgrid_fnc_recordsperpage( )+1) ;
         /* Using cursor H01HH2 */
         pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6Barcod), Byte.valueOf(AV7Barcodreo), AV8Barcodpar, AV9Procod, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2)});
         nGXsfl_99_idx = 1 ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_992( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A4905BarFasAcab = H01HH2_A4905BarFasAcab[0] ;
            A4287BarFasFor = H01HH2_A4287BarFasFor[0] ;
            A766ProForDsc = H01HH2_A766ProForDsc[0] ;
            A764ProForCod = H01HH2_A764ProForCod[0] ;
            A5371FasQuiLin = H01HH2_A5371FasQuiLin[0] ;
            A460FasDsc = H01HH2_A460FasDsc[0] ;
            A457FasCod = H01HH2_A457FasCod[0] ;
            A194BarOrdLin = H01HH2_A194BarOrdLin[0] ;
            A759ProDsc = H01HH2_A759ProDsc[0] ;
            A758ProCod = H01HH2_A758ProCod[0] ;
            A130BarCodPar = H01HH2_A130BarCodPar[0] ;
            A132BarCodReo = H01HH2_A132BarCodReo[0] ;
            A129BarCod = H01HH2_A129BarCod[0] ;
            A396EmprCod = H01HH2_A396EmprCod[0] ;
            A759ProDsc = H01HH2_A759ProDsc[0] ;
            A4905BarFasAcab = H01HH2_A4905BarFasAcab[0] ;
            A4287BarFasFor = H01HH2_A4287BarFasFor[0] ;
            A457FasCod = H01HH2_A457FasCod[0] ;
            A460FasDsc = H01HH2_A460FasDsc[0] ;
            A766ProForDsc = H01HH2_A766ProForDsc[0] ;
            e161HH2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(99) ;
         wb1HH0( ) ;
      }
      bGXsfl_99_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1HH2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vVOLMUL", GXutil.ltrim( localUtil.ntoc( AV17VolMul, (byte)(5), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17VolMul), "ZZZZ9")));
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
      /* Using cursor H01HH3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Integer.valueOf(AV6Barcod), Byte.valueOf(AV7Barcodreo), AV8Barcodpar, AV9Procod});
      GRID_nRecordCount = H01HH3_AGRID_nRecordCount[0] ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9Procod, AV17VolMul) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9Procod, AV17VolMul) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9Procod, AV17VolMul) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9Procod, AV17VolMul) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Barcod, AV7Barcodreo, AV8Barcodpar, AV9Procod, AV17VolMul) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavErrmensaje1_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavErrmensaje1_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavErrmensaje1_Enabled), 5, 0), true);
      edtavHdr_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavHdr_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavHdr_Enabled), 5, 0), true);
      edtavMaquinadescripcion_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaquinadescripcion_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaquinadescripcion_Enabled), 5, 0), true);
      edtavMaqvoltop_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvoltop_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvoltop_Enabled), 5, 0), true);
      edtavMaqvolres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavMaqvolres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqvolres_Enabled), 5, 0), true);
      edtavRep_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRep_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRep_Enabled), 5, 0), true);
      edtavTabladevolumenes_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTabladevolumenes_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTabladevolumenes_Enabled), 5, 0), true);
      edtavTot_kgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_kgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_kgs_Enabled), 5, 0), true);
      edtavTot_mts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTot_mts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTot_mts_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1HH0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e151HH2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         nRC_GXsfl_99 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_99"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV24Rep2 = (short)(localUtil.ctol( httpContext.cgiGet( "vREP2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV25Volumen2 = (int)(localUtil.ctol( httpContext.cgiGet( "vVOLUMEN2"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV31Volumenes = httpContext.cgiGet( "vVOLUMENES") ;
         AV28Volumenc = (int)(localUtil.ctol( httpContext.cgiGet( "vVOLUMENC"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV29VolPar = (int)(localUtil.ctol( httpContext.cgiGet( "vVOLPAR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV40i = (short)(localUtil.ctol( httpContext.cgiGet( "vI"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         AV32Hdr = httpContext.cgiGet( edtavHdr_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV32Hdr", AV32Hdr);
         AV55MaquinaDescripcion = httpContext.cgiGet( edtavMaquinadescripcion_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV55MaquinaDescripcion", AV55MaquinaDescripcion);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavFacabs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavFacabs_Internalname)), DecimalUtil.stringToDec("999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFACABS");
            GX_FocusControl = edtavFacabs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV16FacAbs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16FacAbs", GXutil.ltrimstr( AV16FacAbs, 6, 2));
         }
         else
         {
            AV16FacAbs = localUtil.ctond( httpContext.cgiGet( edtavFacabs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV16FacAbs", GXutil.ltrimstr( AV16FacAbs, 6, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavVolumen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavVolumen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVOLUMEN");
            GX_FocusControl = edtavVolumen_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15Volumen = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Volumen), 5, 0));
         }
         else
         {
            AV15Volumen = (int)(localUtil.ctol( httpContext.cgiGet( edtavVolumen_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Volumen), 5, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavRep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavRep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vREP");
            GX_FocusControl = edtavRep_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV23Rep = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Rep", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Rep), 4, 0));
         }
         else
         {
            AV23Rep = (short)(localUtil.ctol( httpContext.cgiGet( edtavRep_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Rep", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Rep), 4, 0));
         }
         AV58tabladevolumenes = httpContext.cgiGet( edtavTabladevolumenes_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58tabladevolumenes", AV58tabladevolumenes);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOT_KGS");
            GX_FocusControl = edtavTot_kgs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV20Tot_kgs = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Tot_kgs", GXutil.ltrimstr( AV20Tot_kgs, 9, 2));
         }
         else
         {
            AV20Tot_kgs = localUtil.ctond( httpContext.cgiGet( edtavTot_kgs_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV20Tot_kgs", GXutil.ltrimstr( AV20Tot_kgs, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavTot_mts_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavTot_mts_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vTOT_MTS");
            GX_FocusControl = edtavTot_mts_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV22Tot_mts = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Tot_mts", GXutil.ltrimstr( AV22Tot_mts, 9, 2));
         }
         else
         {
            AV22Tot_mts = localUtil.ctond( httpContext.cgiGet( edtavTot_mts_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV22Tot_mts", GXutil.ltrimstr( AV22Tot_mts, 9, 2));
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
      e151HH2 ();
      if (returnInSub) return;
   }

   public void e151HH2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV32Hdr = GXutil.trim( GXutil.str( AV6Barcod, 8, 0)) + GXutil.str( AV7Barcodreo, 1, 0) + AV8Barcodpar ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32Hdr", AV32Hdr);
      AV55MaquinaDescripcion = GXutil.trim( AV10Maqcod) + " " + GXutil.trim( AV12MaqDsc) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55MaquinaDescripcion", AV55MaquinaDescripcion);
      GXt_int1 = AV17VolMul ;
      GXv_int2[0] = GXt_int1 ;
      new app.pbuscon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "VOLMUL", ""), GXv_int2) ;
      recetasdeacabado01_wp_impl.this.GXt_int1 = GXv_int2[0] ;
      AV17VolMul = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17VolMul), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17VolMul), "ZZZZ9")));
      AV38ErrMensaje = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38ErrMensaje", AV38ErrMensaje);
      AV16FacAbs = AV11ArtFacAbs ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16FacAbs", GXutil.ltrimstr( AV16FacAbs, 6, 2));
      /* Execute user subroutine: 'SUMO_KGS' */
      S112 ();
      if (returnInSub) return;
      GXt_int1 = AV15Volumen ;
      GXv_decimal3[0] = AV16FacAbs ;
      GXv_int2[0] = AV13MaqVolRes ;
      GXv_int4[0] = (byte)(AV17VolMul) ;
      GXv_decimal5[0] = AV20Tot_kgs ;
      GXv_int6[0] = GXt_int1 ;
      new app.pcalvol(remoteHandle, context).execute( GXv_decimal3, GXv_int2, GXv_int4, GXv_decimal5, GXv_int6) ;
      recetasdeacabado01_wp_impl.this.AV16FacAbs = GXv_decimal3[0] ;
      recetasdeacabado01_wp_impl.this.AV13MaqVolRes = GXv_int2[0] ;
      recetasdeacabado01_wp_impl.this.AV17VolMul = GXv_int4[0] ;
      recetasdeacabado01_wp_impl.this.AV20Tot_kgs = GXv_decimal5[0] ;
      recetasdeacabado01_wp_impl.this.GXt_int1 = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16FacAbs", GXutil.ltrimstr( AV16FacAbs, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV13MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MaqVolRes), 5, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17VolMul), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17VolMul), "ZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tot_kgs", GXutil.ltrimstr( AV20Tot_kgs, 9, 2));
      AV15Volumen = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Volumen), 5, 0));
      /* Execute user subroutine: 'TOPE_BANYO' */
      S122 ();
      if (returnInSub) return;
      GXt_char7 = AV62Station ;
      GXv_char8[0] = GXt_char7 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char8) ;
      recetasdeacabado01_wp_impl.this.GXt_char7 = GXv_char8[0] ;
      AV62Station = GXt_char7 ;
      GXv_char8[0] = AV5Emprcod ;
      GXv_char9[0] = AV63Emprnom ;
      GXv_char10[0] = AV49UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV62Station, GXv_char8, GXv_char9, GXv_char10) ;
      recetasdeacabado01_wp_impl.this.AV5Emprcod = GXv_char8[0] ;
      recetasdeacabado01_wp_impl.this.AV63Emprnom = GXv_char9[0] ;
      recetasdeacabado01_wp_impl.this.AV49UsurCod = GXv_char10[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV49UsurCod", AV49UsurCod);
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   private void e161HH2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV33Seleccionar = "N" ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV33Seleccionar);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(99) ;
      }
      sendrow_992( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_99_Refreshing )
      {
         httpContext.doAjaxLoad(99, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e121HH2( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S132 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV54Hdrscreadas_SDTs", AV54Hdrscreadas_SDTs);
   }

   public void e131HH2( )
   {
      /* 'DoCerrar' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV5Emprcod,Integer.valueOf(AV6Barcod),Byte.valueOf(AV7Barcodreo),AV8Barcodpar,AV18BarKgm,AV19BarMtr,AV10Maqcod,AV12MaqDsc,Integer.valueOf(AV13MaqVolRes),Integer.valueOf(AV14MaqVolTop),AV11ArtFacAbs,AV9Procod,AV39ErrMensaje1,AV38ErrMensaje,AV51HdrscreadasToJson});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV5Emprcod","AV6Barcod","AV7Barcodreo","AV8Barcodpar","AV18BarKgm","AV19BarMtr","AV10Maqcod","AV12MaqDsc","AV13MaqVolRes","AV14MaqVolTop","AV11ArtFacAbs","AV9Procod","AV39ErrMensaje1","AV38ErrMensaje","AV51HdrscreadasToJson"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S132( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV41LinPro = (byte)(5) ;
      if ( AV23Rep == 1 )
      {
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV26Tab_vol[GX_I-1] = 0 ;
            GX_I = (int)(GX_I+1) ;
         }
         AV26Tab_vol[1-1] = AV15Volumen ;
      }
      else
      {
         AV40i = (short)(1) ;
         AV59t = (short)(1) ;
         while ( AV40i <= AV23Rep )
         {
            AV26Tab_vol[AV40i-1] = (int)(GXutil.lval( GXutil.substring( AV58tabladevolumenes, AV59t, 5))) ;
            AV40i = (short)(AV40i+1) ;
            AV59t = (short)(AV59t+5) ;
         }
      }
      AV40i = (short)(1) ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV27Tabla_Hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      AV51HdrscreadasToJson = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51HdrscreadasToJson", AV51HdrscreadasToJson);
      /* Start For Each Line */
      nRC_GXsfl_99 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_99"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_99_fel_idx = 0 ;
      while ( nGXsfl_99_fel_idx < nRC_GXsfl_99 )
      {
         nGXsfl_99_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_99_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_99_fel_idx+1) ;
         sGXsfl_99_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_992( ) ;
         AV33Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
         A396EmprCod = GXutil.upper( httpContext.cgiGet( edtEmprCod_Internalname)) ;
         A129BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtBarCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A132BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtBarCodReo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A130BarCodPar = httpContext.cgiGet( edtBarCodPar_Internalname) ;
         A758ProCod = httpContext.cgiGet( edtProCod_Internalname) ;
         A759ProDsc = httpContext.cgiGet( edtProDsc_Internalname) ;
         A194BarOrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtBarOrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A457FasCod = GXutil.upper( httpContext.cgiGet( edtFasCod_Internalname)) ;
         A460FasDsc = httpContext.cgiGet( edtFasDsc_Internalname) ;
         A5371FasQuiLin = (short)(localUtil.ctol( httpContext.cgiGet( edtFasQuiLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A764ProForCod = httpContext.cgiGet( edtProForCod_Internalname) ;
         A766ProForDsc = httpContext.cgiGet( edtProForDsc_Internalname) ;
         if ( GXutil.strcmp(AV33Seleccionar, "S") == 0 )
         {
            while ( AV40i <= 100 )
            {
               if ( AV26Tab_vol[AV40i-1] == 0 )
               {
                  if (true) break;
               }
               AV42Volumeni = (short)(AV26Tab_vol[AV40i-1]) ;
               GXv_char10[0] = AV5Emprcod ;
               GXv_int6[0] = AV6Barcod ;
               GXv_int4[0] = AV7Barcodreo ;
               GXv_char9[0] = AV8Barcodpar ;
               new app.prac033(remoteHandle, context).execute( GXv_char10, GXv_int6, GXv_int4, GXv_char9) ;
               recetasdeacabado01_wp_impl.this.AV5Emprcod = GXv_char10[0] ;
               recetasdeacabado01_wp_impl.this.AV6Barcod = GXv_int6[0] ;
               recetasdeacabado01_wp_impl.this.AV7Barcodreo = GXv_int4[0] ;
               recetasdeacabado01_wp_impl.this.AV8Barcodpar = GXv_char9[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
               GXv_char10[0] = AV5Emprcod ;
               GXv_int6[0] = AV6Barcod ;
               GXv_int4[0] = AV7Barcodreo ;
               GXv_char9[0] = AV8Barcodpar ;
               GXv_decimal5[0] = AV20Tot_kgs ;
               GXv_decimal3[0] = AV22Tot_mts ;
               GXv_decimal11[0] = AV16FacAbs ;
               GXv_int2[0] = AV47CliCod ;
               GXv_char8[0] = AV48BarSer ;
               GXv_char12[0] = AV9Procod ;
               GXv_char13[0] = AV10Maqcod ;
               GXv_char14[0] = A457FasCod ;
               GXv_char15[0] = A764ProForCod ;
               GXv_int16[0] = AV42Volumeni ;
               GXv_int17[0] = AV41LinPro ;
               GXv_char18[0] = AV49UsurCod ;
               GXv_int19[0] = AV43RecLinMaq ;
               GXv_int20[0] = A194BarOrdLin ;
               GXv_int21[0] = AV44LtsRec ;
               GXv_decimal22[0] = AV45Abs2 ;
               GXv_char23[0] = AV46Var1 ;
               new app.prac001(remoteHandle, context).execute( GXv_char10, GXv_int6, GXv_int4, GXv_char9, GXv_decimal5, GXv_decimal3, GXv_decimal11, GXv_int2, GXv_char8, GXv_char12, GXv_char13, GXv_char14, GXv_char15, GXv_int16, GXv_int17, GXv_char18, GXv_int19, GXv_int20, GXv_int21, GXv_decimal22, GXv_char23) ;
               recetasdeacabado01_wp_impl.this.AV5Emprcod = GXv_char10[0] ;
               recetasdeacabado01_wp_impl.this.AV6Barcod = GXv_int6[0] ;
               recetasdeacabado01_wp_impl.this.AV7Barcodreo = GXv_int4[0] ;
               recetasdeacabado01_wp_impl.this.AV8Barcodpar = GXv_char9[0] ;
               recetasdeacabado01_wp_impl.this.AV20Tot_kgs = GXv_decimal5[0] ;
               recetasdeacabado01_wp_impl.this.AV22Tot_mts = GXv_decimal3[0] ;
               recetasdeacabado01_wp_impl.this.AV16FacAbs = GXv_decimal11[0] ;
               recetasdeacabado01_wp_impl.this.AV47CliCod = GXv_int2[0] ;
               recetasdeacabado01_wp_impl.this.AV48BarSer = GXv_char8[0] ;
               recetasdeacabado01_wp_impl.this.AV9Procod = GXv_char12[0] ;
               recetasdeacabado01_wp_impl.this.AV10Maqcod = GXv_char13[0] ;
               recetasdeacabado01_wp_impl.this.A457FasCod = GXv_char14[0] ;
               recetasdeacabado01_wp_impl.this.A764ProForCod = GXv_char15[0] ;
               recetasdeacabado01_wp_impl.this.AV42Volumeni = (short)((short)(GXv_int16[0])) ;
               recetasdeacabado01_wp_impl.this.AV41LinPro = GXv_int17[0] ;
               recetasdeacabado01_wp_impl.this.AV49UsurCod = GXv_char18[0] ;
               recetasdeacabado01_wp_impl.this.AV43RecLinMaq = GXv_int19[0] ;
               recetasdeacabado01_wp_impl.this.A194BarOrdLin = GXv_int20[0] ;
               recetasdeacabado01_wp_impl.this.AV44LtsRec = GXv_int21[0] ;
               recetasdeacabado01_wp_impl.this.AV45Abs2 = GXv_decimal22[0] ;
               recetasdeacabado01_wp_impl.this.AV46Var1 = GXv_char23[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV20Tot_kgs", GXutil.ltrimstr( AV20Tot_kgs, 9, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV22Tot_mts", GXutil.ltrimstr( AV22Tot_mts, 9, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV16FacAbs", GXutil.ltrimstr( AV16FacAbs, 6, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV47CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47CliCod), 6, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV48BarSer", AV48BarSer);
               httpContext.ajax_rsp_assign_attri("", false, "AV9Procod", AV9Procod);
               httpContext.ajax_rsp_assign_attri("", false, "AV10Maqcod", AV10Maqcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV49UsurCod", AV49UsurCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV43RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43RecLinMaq), 4, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV44LtsRec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV44LtsRec), 5, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV45Abs2", GXutil.ltrimstr( AV45Abs2, 6, 2));
               httpContext.ajax_rsp_assign_attri("", false, "AV46Var1", AV46Var1);
               GXv_char23[0] = AV5Emprcod ;
               GXv_int21[0] = AV6Barcod ;
               GXv_int17[0] = AV7Barcodreo ;
               GXv_char18[0] = AV8Barcodpar ;
               GXv_int20[0] = AV43RecLinMaq ;
               GXv_char15[0] = "N" ;
               new app.prac004(remoteHandle, context).execute( GXv_char23, GXv_int21, GXv_int17, GXv_char18, GXv_int20, GXv_char15) ;
               recetasdeacabado01_wp_impl.this.AV5Emprcod = GXv_char23[0] ;
               recetasdeacabado01_wp_impl.this.AV6Barcod = GXv_int21[0] ;
               recetasdeacabado01_wp_impl.this.AV7Barcodreo = GXv_int17[0] ;
               recetasdeacabado01_wp_impl.this.AV8Barcodpar = GXv_char18[0] ;
               recetasdeacabado01_wp_impl.this.AV43RecLinMaq = GXv_int20[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV43RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43RecLinMaq), 4, 0));
               GXv_char23[0] = AV5Emprcod ;
               GXv_int21[0] = AV6Barcod ;
               GXv_int17[0] = AV7Barcodreo ;
               GXv_char18[0] = AV8Barcodpar ;
               GXv_int20[0] = AV43RecLinMaq ;
               new app.prenum(remoteHandle, context).execute( GXv_char23, GXv_int21, GXv_int17, GXv_char18, GXv_int20) ;
               recetasdeacabado01_wp_impl.this.AV5Emprcod = GXv_char23[0] ;
               recetasdeacabado01_wp_impl.this.AV6Barcod = GXv_int21[0] ;
               recetasdeacabado01_wp_impl.this.AV7Barcodreo = GXv_int17[0] ;
               recetasdeacabado01_wp_impl.this.AV8Barcodpar = GXv_char18[0] ;
               recetasdeacabado01_wp_impl.this.AV43RecLinMaq = GXv_int20[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
               httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
               httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
               httpContext.ajax_rsp_assign_attri("", false, "AV43RecLinMaq", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43RecLinMaq), 4, 0));
               AV53Hdrscreadas_SDT = (app.SdtHdrscreadas_SDT)new app.SdtHdrscreadas_SDT(remoteHandle, context);
               AV53Hdrscreadas_SDT.setgxTv_SdtHdrscreadas_SDT_Barcod( AV6Barcod );
               AV53Hdrscreadas_SDT.setgxTv_SdtHdrscreadas_SDT_Barcodreo( AV7Barcodreo );
               AV53Hdrscreadas_SDT.setgxTv_SdtHdrscreadas_SDT_Barcodpar( AV8Barcodpar );
               AV53Hdrscreadas_SDT.setgxTv_SdtHdrscreadas_SDT_Reclinmaq( AV43RecLinMaq );
               AV54Hdrscreadas_SDTs.add(AV53Hdrscreadas_SDT, 0);
               AV40i = (short)(AV40i+1) ;
            }
            AV41LinPro = (byte)(AV41LinPro+5) ;
         }
         /* End For Each Line */
      }
      if ( nGXsfl_99_fel_idx == 0 )
      {
         nGXsfl_99_idx = 1 ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_992( ) ;
      }
      nGXsfl_99_fel_idx = 1 ;
      AV51HdrscreadasToJson = AV54Hdrscreadas_SDTs.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51HdrscreadasToJson", AV51HdrscreadasToJson);
      if ( AV41LinPro > 5 )
      {
         GXv_char23[0] = AV5Emprcod ;
         GXv_int21[0] = AV6Barcod ;
         GXv_int17[0] = AV7Barcodreo ;
         GXv_char18[0] = AV8Barcodpar ;
         new app.prac002(remoteHandle, context).execute( GXv_char23, GXv_int21, GXv_int17, GXv_char18) ;
         recetasdeacabado01_wp_impl.this.AV5Emprcod = GXv_char23[0] ;
         recetasdeacabado01_wp_impl.this.AV6Barcod = GXv_int21[0] ;
         recetasdeacabado01_wp_impl.this.AV7Barcodreo = GXv_int17[0] ;
         recetasdeacabado01_wp_impl.this.AV8Barcodpar = GXv_char18[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
         httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
         AV38ErrMensaje = httpContext.getMessage( "Proceso finalizado con exito!", "") ;
         httpContext.ajax_rsp_assign_attri("", false, "AV38ErrMensaje", AV38ErrMensaje);
         httpContext.setWebReturnParms(new Object[] {AV5Emprcod,Integer.valueOf(AV6Barcod),Byte.valueOf(AV7Barcodreo),AV8Barcodpar,AV18BarKgm,AV19BarMtr,AV10Maqcod,AV12MaqDsc,Integer.valueOf(AV13MaqVolRes),Integer.valueOf(AV14MaqVolTop),AV11ArtFacAbs,AV9Procod,AV39ErrMensaje1,AV38ErrMensaje,AV51HdrscreadasToJson});
         httpContext.setWebReturnParmsMetadata(new Object[] {"AV5Emprcod","AV6Barcod","AV7Barcodreo","AV8Barcodpar","AV18BarKgm","AV19BarMtr","AV10Maqcod","AV12MaqDsc","AV13MaqVolRes","AV14MaqVolTop","AV11ArtFacAbs","AV9Procod","AV39ErrMensaje1","AV38ErrMensaje","AV51HdrscreadasToJson"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
   }

   public void e171HH2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_int24 = AV50NumeroRegistros ;
      GXv_char23[0] = AV5Emprcod ;
      GXv_int21[0] = AV6Barcod ;
      GXv_int17[0] = AV7Barcodreo ;
      GXv_char18[0] = AV8Barcodpar ;
      GXv_char15[0] = AV9Procod ;
      GXv_int25[0] = GXt_int24 ;
      new app.registrostablafasqui(remoteHandle, context).execute( GXv_char23, GXv_int21, GXv_int17, GXv_char18, GXv_char15, GXv_int25) ;
      recetasdeacabado01_wp_impl.this.AV5Emprcod = GXv_char23[0] ;
      recetasdeacabado01_wp_impl.this.AV6Barcod = GXv_int21[0] ;
      recetasdeacabado01_wp_impl.this.AV7Barcodreo = GXv_int17[0] ;
      recetasdeacabado01_wp_impl.this.AV8Barcodpar = GXv_char18[0] ;
      recetasdeacabado01_wp_impl.this.AV9Procod = GXv_char15[0] ;
      recetasdeacabado01_wp_impl.this.GXt_int24 = GXv_int25[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      httpContext.ajax_rsp_assign_attri("", false, "AV6Barcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Barcod), 8, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV7Barcodreo", GXutil.str( AV7Barcodreo, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Barcodpar", AV8Barcodpar);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Procod", AV9Procod);
      AV50NumeroRegistros = GXt_int24 ;
      AV37GridPageCount = (long)((AV50NumeroRegistros/ (double) (10))+1) ;
   }

   public void e141HH2( )
   {
      /* Facabs_Isvalid Routine */
      returnInSub = false ;
      GXt_int1 = AV15Volumen ;
      GXv_decimal22[0] = AV16FacAbs ;
      GXv_int21[0] = AV13MaqVolRes ;
      GXv_int17[0] = (byte)(AV17VolMul) ;
      GXv_decimal11[0] = AV20Tot_kgs ;
      GXv_int16[0] = GXt_int1 ;
      new app.pcalvol(remoteHandle, context).execute( GXv_decimal22, GXv_int21, GXv_int17, GXv_decimal11, GXv_int16) ;
      recetasdeacabado01_wp_impl.this.AV16FacAbs = GXv_decimal22[0] ;
      recetasdeacabado01_wp_impl.this.AV13MaqVolRes = GXv_int21[0] ;
      recetasdeacabado01_wp_impl.this.AV17VolMul = GXv_int17[0] ;
      recetasdeacabado01_wp_impl.this.AV20Tot_kgs = GXv_decimal11[0] ;
      recetasdeacabado01_wp_impl.this.GXt_int1 = GXv_int16[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16FacAbs", GXutil.ltrimstr( AV16FacAbs, 6, 2));
      httpContext.ajax_rsp_assign_attri("", false, "AV13MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MaqVolRes), 5, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV17VolMul", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17VolMul), 5, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVOLMUL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV17VolMul), "ZZZZ9")));
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tot_kgs", GXutil.ltrimstr( AV20Tot_kgs, 9, 2));
      AV15Volumen = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15Volumen", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15Volumen), 5, 0));
      /* Execute user subroutine: 'TOPE_BANYO' */
      S122 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S112( )
   {
      /* 'SUMO_KGS' Routine */
      returnInSub = false ;
      AV20Tot_kgs = AV18BarKgm ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tot_kgs", GXutil.ltrimstr( AV20Tot_kgs, 9, 2));
      AV21OldKgs = AV18BarKgm ;
      AV22Tot_mts = AV19BarMtr ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Tot_mts", GXutil.ltrimstr( AV22Tot_mts, 9, 2));
      /* Optimized group. */
      /* Using cursor H01HH4 */
      pr_default.execute(2, new Object[] {AV5Emprcod, Integer.valueOf(AV6Barcod), Byte.valueOf(AV7Barcodreo), AV8Barcodpar});
      c6035Ac_Kilos = H01HH4_A6035Ac_Kilos[0] ;
      n6035Ac_Kilos = H01HH4_n6035Ac_Kilos[0] ;
      c6035Ac_Kilos = H01HH4_A6035Ac_Kilos[0] ;
      n6035Ac_Kilos = H01HH4_n6035Ac_Kilos[0] ;
      c6034Ac_Metros = H01HH4_A6034Ac_Metros[0] ;
      n6034Ac_Metros = H01HH4_n6034Ac_Metros[0] ;
      pr_default.close(2);
      AV20Tot_kgs = AV20Tot_kgs.add(c6035Ac_Kilos) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Tot_kgs", GXutil.ltrimstr( AV20Tot_kgs, 9, 2));
      AV21OldKgs = AV21OldKgs.add(c6035Ac_Kilos) ;
      AV22Tot_mts = AV22Tot_mts.add(c6034Ac_Metros) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22Tot_mts", GXutil.ltrimstr( AV22Tot_mts, 9, 2));
      /* End optimized group. */
   }

   public void S122( )
   {
      /* 'TOPE_BANYO' Routine */
      returnInSub = false ;
      if ( AV14MaqVolTop > 0 )
      {
         if ( ( GXutil.Int( AV15Volumen/ (double) (AV14MaqVolTop)) == AV15Volumen / (double) ( AV14MaqVolTop ) ) )
         {
            AV23Rep = (short)(GXutil.Int( AV15Volumen/ (double) (AV14MaqVolTop))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Rep", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Rep), 4, 0));
         }
         else
         {
            AV23Rep = (short)(GXutil.Int( AV15Volumen/ (double) (AV14MaqVolTop))+1) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23Rep", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Rep), 4, 0));
         }
         AV24Rep2 = (short)(1) ;
         AV25Volumen2 = AV15Volumen ;
         AV31Volumenes = "" ;
         AV58tabladevolumenes = "" ;
         httpContext.ajax_rsp_assign_attri("", false, "AV58tabladevolumenes", AV58tabladevolumenes);
         GX_I = 1 ;
         while ( GX_I <= 100 )
         {
            AV26Tab_vol[GX_I-1] = 0 ;
            GX_I = (int)(GX_I+1) ;
         }
         while ( AV24Rep2 <= AV23Rep )
         {
            AV28Volumenc = (int)(AV25Volumen2-AV24Rep2*AV14MaqVolTop) ;
            AV29VolPar = ((AV28Volumenc<0) ? AV25Volumen2-(AV24Rep2-1)*AV14MaqVolTop : AV14MaqVolTop) ;
            AV26Tab_vol[AV24Rep2-1] = AV29VolPar ;
            AV24Rep2 = (short)(AV24Rep2+1) ;
            AV31Volumenes = ((GXutil.strcmp("", AV31Volumenes)==0) ? GXutil.trim( GXutil.str( AV29VolPar, 5, 0)) : GXutil.concat( AV31Volumenes, GXutil.trim( GXutil.str( AV29VolPar, 5, 0)), "-")) ;
            if ( (GXutil.strcmp("", AV58tabladevolumenes)==0) )
            {
               AV58tabladevolumenes = GXutil.str( AV29VolPar, 5, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58tabladevolumenes", AV58tabladevolumenes);
            }
            else
            {
               AV58tabladevolumenes += GXutil.str( AV29VolPar, 5, 0) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV58tabladevolumenes", AV58tabladevolumenes);
            }
         }
      }
   }

   public void wb_table1_116_1HH2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_confirmar_Internalname, tblTabledvelop_confirmpanel_confirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_confirmar.setProperty("Title", Dvelop_confirmpanel_confirmar_Title);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_confirmar_Confirmationtext);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_confirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_confirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_confirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_confirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_confirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_confirmar.setProperty("ConfirmType", Dvelop_confirmpanel_confirmar_Confirmtype);
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, "DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_116_1HH2e( true) ;
      }
      else
      {
         wb_table1_116_1HH2e( false) ;
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
      AV18BarKgm = (java.math.BigDecimal)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18BarKgm", GXutil.ltrimstr( AV18BarKgm, 9, 2));
      AV19BarMtr = (java.math.BigDecimal)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19BarMtr", GXutil.ltrimstr( AV19BarMtr, 9, 2));
      AV10Maqcod = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Maqcod", AV10Maqcod);
      AV12MaqDsc = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12MaqDsc", AV12MaqDsc);
      AV13MaqVolRes = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13MaqVolRes", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13MaqVolRes), 5, 0));
      AV14MaqVolTop = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14MaqVolTop", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14MaqVolTop), 5, 0));
      AV11ArtFacAbs = (java.math.BigDecimal)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ArtFacAbs", GXutil.ltrimstr( AV11ArtFacAbs, 6, 2));
      AV9Procod = (String)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Procod", AV9Procod);
      AV39ErrMensaje1 = (String)getParm(obj,12) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39ErrMensaje1", AV39ErrMensaje1);
      AV38ErrMensaje = (String)getParm(obj,13) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV38ErrMensaje", AV38ErrMensaje);
      AV51HdrscreadasToJson = (String)getParm(obj,14) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV51HdrscreadasToJson", AV51HdrscreadasToJson);
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
      pa1HH2( ) ;
      ws1HH2( ) ;
      we1HH2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202661016432030", true, true);
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
         httpContext.AddJavascriptSource("recetasdeacabado01_wp.js", "?202661016432030", false, true);
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
         httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
         httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      }
      /* End function include_jscripts */
   }

   public void subsflControlProps_992( )
   {
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_99_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_99_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_99_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_99_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_99_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_99_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_99_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_99_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_99_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_99_idx ;
      edtFasQuiLin_Internalname = "FASQUILIN_"+sGXsfl_99_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_99_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_99_idx ;
   }

   public void subsflControlProps_fel_992( )
   {
      chkavSeleccionar.setInternalname( "vSELECCIONAR_"+sGXsfl_99_fel_idx );
      edtEmprCod_Internalname = "EMPRCOD_"+sGXsfl_99_fel_idx ;
      edtBarCod_Internalname = "BARCOD_"+sGXsfl_99_fel_idx ;
      edtBarCodReo_Internalname = "BARCODREO_"+sGXsfl_99_fel_idx ;
      edtBarCodPar_Internalname = "BARCODPAR_"+sGXsfl_99_fel_idx ;
      edtProCod_Internalname = "PROCOD_"+sGXsfl_99_fel_idx ;
      edtProDsc_Internalname = "PRODSC_"+sGXsfl_99_fel_idx ;
      edtBarOrdLin_Internalname = "BARORDLIN_"+sGXsfl_99_fel_idx ;
      edtFasCod_Internalname = "FASCOD_"+sGXsfl_99_fel_idx ;
      edtFasDsc_Internalname = "FASDSC_"+sGXsfl_99_fel_idx ;
      edtFasQuiLin_Internalname = "FASQUILIN_"+sGXsfl_99_fel_idx ;
      edtProForCod_Internalname = "PROFORCOD_"+sGXsfl_99_fel_idx ;
      edtProForDsc_Internalname = "PROFORDSC_"+sGXsfl_99_fel_idx ;
   }

   public void sendrow_992( )
   {
      subsflControlProps_992( ) ;
      wb1HH0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_99_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_99_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_99_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'',false,'"+sGXsfl_99_idx+"',99)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_99_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_99_Refreshing);
         chkavSeleccionar.setCheckedValue( "N" );
         AV33Seleccionar = ((GXutil.strcmp(GXutil.rtrim( AV33Seleccionar), "S")==0) ? "S" : "N") ;
         httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV33Seleccionar);
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),AV33Seleccionar,"","",Integer.valueOf(-1),Integer.valueOf(1),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(100, this, 'S', 'N',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,100);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtEmprCod_Internalname,GXutil.rtrim( A396EmprCod),GXutil.rtrim( localUtil.format( A396EmprCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtEmprCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCod_Internalname,GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A129BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodReo_Internalname,GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A132BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodReo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarCodPar_Internalname,GXutil.rtrim( A130BarCodPar),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarCodPar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProCod_Internalname,GXutil.rtrim( A758ProCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProDsc_Internalname,GXutil.rtrim( A759ProDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtBarOrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A194BarOrdLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtBarOrdLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasCod_Internalname,GXutil.rtrim( A457FasCod),GXutil.rtrim( localUtil.format( A457FasCod, "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasDsc_Internalname,GXutil.rtrim( A460FasDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtFasQuiLin_Internalname,GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A5371FasQuiLin), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtFasQuiLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForCod_Internalname,GXutil.rtrim( A764ProForCod),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtProForDsc_Internalname,GXutil.rtrim( A766ProForDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtProForDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(99),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1HH2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_99_idx = ((subGrid_Islastpage==1)&&(nGXsfl_99_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_99_idx+1) ;
         sGXsfl_99_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_99_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_992( ) ;
      }
      /* End function sendrow_992 */
   }

   public void startgridcontrol99( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"99\">") ;
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
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Reoperado Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Particion Barcada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proceso Quimico", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV33Seleccionar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A396EmprCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A129BarCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A132BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A130BarCodPar));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A758ProCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A759ProDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A194BarOrdLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A457FasCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A460FasDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A5371FasQuiLin, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A764ProForCod));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A766ProForDsc));
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
      edtavErrmensaje1_Internalname = "vERRMENSAJE1" ;
      edtavHdr_Internalname = "vHDR" ;
      edtavMaquinadescripcion_Internalname = "vMAQUINADESCRIPCION" ;
      edtavMaqvoltop_Internalname = "vMAQVOLTOP" ;
      edtavMaqvolres_Internalname = "vMAQVOLRES" ;
      divUnnamedtable7_Internalname = "UNNAMEDTABLE7" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavFacabs_Internalname = "vFACABS" ;
      edtavVolumen_Internalname = "vVOLUMEN" ;
      edtavRep_Internalname = "vREP" ;
      edtavTabladevolumenes_Internalname = "vTABLADEVOLUMENES" ;
      divUnnamedtable5_Internalname = "UNNAMEDTABLE5" ;
      edtavTot_kgs_Internalname = "vTOT_KGS" ;
      edtavTot_mts_Internalname = "vTOT_MTS" ;
      divUnnamedtable6_Internalname = "UNNAMEDTABLE6" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      chkavSeleccionar.setInternalname( "vSELECCIONAR" );
      edtEmprCod_Internalname = "EMPRCOD" ;
      edtBarCod_Internalname = "BARCOD" ;
      edtBarCodReo_Internalname = "BARCODREO" ;
      edtBarCodPar_Internalname = "BARCODPAR" ;
      edtProCod_Internalname = "PROCOD" ;
      edtProDsc_Internalname = "PRODSC" ;
      edtBarOrdLin_Internalname = "BARORDLIN" ;
      edtFasCod_Internalname = "FASCOD" ;
      edtFasDsc_Internalname = "FASDSC" ;
      edtFasQuiLin_Internalname = "FASQUILIN" ;
      edtProForCod_Internalname = "PROFORCOD" ;
      edtProForDsc_Internalname = "PROFORDSC" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      Dvpanel_unnamedtable4_Internalname = "DVPANEL_UNNAMEDTABLE4" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Dvelop_confirmpanel_confirmar_Internalname = "DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      edtProForDsc_Jsonclick = "" ;
      edtProForCod_Jsonclick = "" ;
      edtFasQuiLin_Jsonclick = "" ;
      edtFasDsc_Jsonclick = "" ;
      edtFasCod_Jsonclick = "" ;
      edtBarOrdLin_Jsonclick = "" ;
      edtProDsc_Jsonclick = "" ;
      edtProCod_Jsonclick = "" ;
      edtBarCodPar_Jsonclick = "" ;
      edtBarCodReo_Jsonclick = "" ;
      edtBarCod_Jsonclick = "" ;
      edtEmprCod_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTot_mts_Jsonclick = "" ;
      edtavTot_mts_Enabled = 1 ;
      edtavTot_kgs_Jsonclick = "" ;
      edtavTot_kgs_Enabled = 1 ;
      edtavTabladevolumenes_Jsonclick = "" ;
      edtavTabladevolumenes_Enabled = 1 ;
      edtavRep_Jsonclick = "" ;
      edtavRep_Enabled = 1 ;
      edtavVolumen_Jsonclick = "" ;
      edtavVolumen_Enabled = 1 ;
      edtavFacabs_Jsonclick = "" ;
      edtavFacabs_Enabled = 1 ;
      edtavMaqvolres_Jsonclick = "" ;
      edtavMaqvolres_Enabled = 0 ;
      edtavMaqvoltop_Jsonclick = "" ;
      edtavMaqvoltop_Enabled = 0 ;
      edtavMaquinadescripcion_Jsonclick = "" ;
      edtavMaquinadescripcion_Enabled = 1 ;
      edtavHdr_Jsonclick = "" ;
      edtavHdr_Enabled = 1 ;
      edtavErrmensaje1_Enabled = 0 ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma los datos?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Dvpanel_unnamedtable4_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Iconposition = "Right" ;
      Dvpanel_unnamedtable4_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Title = httpContext.getMessage( "Tratamientos Quimicos", "") ;
      Dvpanel_unnamedtable4_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable4_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable4_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable4_Width = "100%" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = "" ;
      Dvpanel_unnamedtable3_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Datos a modificar", "") ;
      Dvpanel_unnamedtable2_Cls = "PanelNoHeader" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Informacion ", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Recetas de acabado", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vSELECCIONAR_" + sGXsfl_99_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_99_Refreshing);
      chkavSeleccionar.setCheckedValue( "N" );
      AV33Seleccionar = ((GXutil.strcmp(GXutil.rtrim( AV33Seleccionar), "S")==0) ? "S" : "N") ;
      httpContext.ajax_rsp_assign_attri("", false, chkavSeleccionar.getInternalname(), AV33Seleccionar);
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9Procod',fld:'vPROCOD',pic:''},{av:'AV17VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e161HH2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV33Seleccionar',fld:'vSELECCIONAR',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111HH1',iparms:[{av:'AV33Seleccionar',fld:'vSELECCIONAR',grid:99,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_99',ctrl:'GRID',grid:99,prop:'GridRC',grid:99},{av:'AV15Volumen',fld:'vVOLUMEN',pic:'ZZZZ9'},{av:'AV23Rep',fld:'vREP',pic:'ZZZ9'}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'AV23Rep',fld:'vREP',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_confirmar_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e121HH2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV23Rep',fld:'vREP',pic:'ZZZ9'},{av:'AV15Volumen',fld:'vVOLUMEN',pic:'ZZZZ9'},{av:'AV58tabladevolumenes',fld:'vTABLADEVOLUMENES',pic:''},{av:'AV33Seleccionar',fld:'vSELECCIONAR',grid:99,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_99',ctrl:'GRID',grid:99,prop:'GridRC',grid:99},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV20Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZ9.99'},{av:'AV22Tot_mts',fld:'vTOT_MTS',pic:'ZZZZZ9.99'},{av:'AV16FacAbs',fld:'vFACABS',pic:'ZZ9.99'},{av:'AV47CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV48BarSer',fld:'vBARSER',pic:''},{av:'AV9Procod',fld:'vPROCOD',pic:''},{av:'AV10Maqcod',fld:'vMAQCOD',pic:''},{av:'A457FasCod',fld:'FASCOD',grid:99,pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',grid:99,pic:''},{av:'AV49UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV43RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',grid:99,pic:'ZZZ9'},{av:'AV44LtsRec',fld:'vLTSREC',pic:'ZZZZ9'},{av:'AV45Abs2',fld:'vABS2',pic:'ZZ9.99'},{av:'AV46Var1',fld:'vVAR1',pic:''},{av:'AV54Hdrscreadas_SDTs',fld:'vHDRSCREADAS_SDTS',pic:''},{av:'AV39ErrMensaje1',fld:'vERRMENSAJE1',pic:''},{av:'AV11ArtFacAbs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV14MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9'},{av:'AV13MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV12MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV19BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV18BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV51HdrscreadasToJson',fld:'vHDRSCREADASTOJSON',pic:''},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV46Var1',fld:'vVAR1',pic:''},{av:'AV45Abs2',fld:'vABS2',pic:'ZZ9.99'},{av:'AV44LtsRec',fld:'vLTSREC',pic:'ZZZZ9'},{av:'A194BarOrdLin',fld:'BARORDLIN',pic:'ZZZ9'},{av:'AV43RecLinMaq',fld:'vRECLINMAQ',pic:'ZZZ9'},{av:'AV49UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A764ProForCod',fld:'PROFORCOD',pic:''},{av:'A457FasCod',fld:'FASCOD',pic:'@!'},{av:'AV10Maqcod',fld:'vMAQCOD',pic:''},{av:'AV9Procod',fld:'vPROCOD',pic:''},{av:'AV48BarSer',fld:'vBARSER',pic:''},{av:'AV47CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV16FacAbs',fld:'vFACABS',pic:'ZZ9.99'},{av:'AV22Tot_mts',fld:'vTOT_MTS',pic:'ZZZZZ9.99'},{av:'AV20Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZ9.99'},{av:'AV54Hdrscreadas_SDTs',fld:'vHDRSCREADAS_SDTS',pic:''},{av:'AV38ErrMensaje',fld:'vERRMENSAJE',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e131HH2',iparms:[{av:'AV51HdrscreadasToJson',fld:'vHDRSCREADASTOJSON',pic:''},{av:'AV38ErrMensaje',fld:'vERRMENSAJE',pic:''},{av:'AV39ErrMensaje1',fld:'vERRMENSAJE1',pic:''},{av:'AV9Procod',fld:'vPROCOD',pic:''},{av:'AV11ArtFacAbs',fld:'vARTFACABS',pic:'ZZ9.99'},{av:'AV14MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9'},{av:'AV13MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV12MaqDsc',fld:'vMAQDSC',pic:''},{av:'AV10Maqcod',fld:'vMAQCOD',pic:''},{av:'AV19BarMtr',fld:'vBARMTR',pic:'ZZZZZ9.99'},{av:'AV18BarKgm',fld:'vBARKGM',pic:'ZZZZZ9.99'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'}]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VFACABS.ISVALID","{handler:'e141HH2',iparms:[{av:'AV16FacAbs',fld:'vFACABS',pic:'ZZ9.99'},{av:'AV13MaqVolRes',fld:'vMAQVOLRES',pic:'ZZZZ9'},{av:'AV17VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true},{av:'AV20Tot_kgs',fld:'vTOT_KGS',pic:'ZZZZZ9.99'},{av:'AV14MaqVolTop',fld:'vMAQVOLTOP',pic:'ZZZZ9'},{av:'AV15Volumen',fld:'vVOLUMEN',pic:'ZZZZ9'}]");
      setEventMetadata("VFACABS.ISVALID",",oparms:[{av:'AV15Volumen',fld:'vVOLUMEN',pic:'ZZZZ9'},{av:'AV23Rep',fld:'vREP',pic:'ZZZ9'},{av:'AV58tabladevolumenes',fld:'vTABLADEVOLUMENES',pic:''}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9Procod',fld:'vPROCOD',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9Procod',fld:'vPROCOD',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9Procod',fld:'vPROCOD',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV17VolMul',fld:'vVOLMUL',pic:'ZZZZ9',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Barcod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV7Barcodreo',fld:'vBARCODREO',pic:'9'},{av:'AV8Barcodpar',fld:'vBARCODPAR',pic:''},{av:'AV9Procod',fld:'vPROCOD',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALID_EMPRCOD","{handler:'valid_Emprcod',iparms:[]");
      setEventMetadata("VALID_EMPRCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCOD","{handler:'valid_Barcod',iparms:[]");
      setEventMetadata("VALID_BARCOD",",oparms:[]}");
      setEventMetadata("VALID_BARCODREO","{handler:'valid_Barcodreo',iparms:[]");
      setEventMetadata("VALID_BARCODREO",",oparms:[]}");
      setEventMetadata("VALID_BARCODPAR","{handler:'valid_Barcodpar',iparms:[]");
      setEventMetadata("VALID_BARCODPAR",",oparms:[]}");
      setEventMetadata("VALID_PROCOD","{handler:'valid_Procod',iparms:[]");
      setEventMetadata("VALID_PROCOD",",oparms:[]}");
      setEventMetadata("VALID_BARORDLIN","{handler:'valid_Barordlin',iparms:[]");
      setEventMetadata("VALID_BARORDLIN",",oparms:[]}");
      setEventMetadata("VALID_FASCOD","{handler:'valid_Fascod',iparms:[]");
      setEventMetadata("VALID_FASCOD",",oparms:[]}");
      setEventMetadata("VALID_PROFORCOD","{handler:'valid_Proforcod',iparms:[]");
      setEventMetadata("VALID_PROFORCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Profordsc',iparms:[]");
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
      wcpOAV18BarKgm = DecimalUtil.ZERO ;
      wcpOAV19BarMtr = DecimalUtil.ZERO ;
      wcpOAV10Maqcod = "" ;
      wcpOAV12MaqDsc = "" ;
      wcpOAV11ArtFacAbs = DecimalUtil.ZERO ;
      wcpOAV9Procod = "" ;
      wcpOAV39ErrMensaje1 = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5Emprcod = "" ;
      AV8Barcodpar = "" ;
      AV18BarKgm = DecimalUtil.ZERO ;
      AV19BarMtr = DecimalUtil.ZERO ;
      AV10Maqcod = "" ;
      AV12MaqDsc = "" ;
      AV11ArtFacAbs = DecimalUtil.ZERO ;
      AV9Procod = "" ;
      AV39ErrMensaje1 = "" ;
      AV38ErrMensaje = "" ;
      AV51HdrscreadasToJson = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV48BarSer = "" ;
      AV49UsurCod = "" ;
      AV45Abs2 = DecimalUtil.ZERO ;
      AV46Var1 = "" ;
      AV54Hdrscreadas_SDTs = new GXBaseCollection<app.SdtHdrscreadas_SDT>(app.SdtHdrscreadas_SDT.class, "Hdrscreadas_SDT", "TexplusNET", remoteHandle);
      AV31Volumenes = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV32Hdr = "" ;
      AV55MaquinaDescripcion = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      AV16FacAbs = DecimalUtil.ZERO ;
      AV58tabladevolumenes = "" ;
      AV20Tot_kgs = DecimalUtil.ZERO ;
      AV22Tot_mts = DecimalUtil.ZERO ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_unnamedtable4 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV33Seleccionar = "" ;
      A396EmprCod = "" ;
      A130BarCodPar = "" ;
      A758ProCod = "" ;
      A759ProDsc = "" ;
      A457FasCod = "" ;
      A460FasDsc = "" ;
      A764ProForCod = "" ;
      A766ProForDsc = "" ;
      scmdbuf = "" ;
      H01HH2_A4905BarFasAcab = new String[] {""} ;
      H01HH2_A4287BarFasFor = new String[] {""} ;
      H01HH2_A766ProForDsc = new String[] {""} ;
      H01HH2_A764ProForCod = new String[] {""} ;
      H01HH2_A5371FasQuiLin = new short[1] ;
      H01HH2_A460FasDsc = new String[] {""} ;
      H01HH2_A457FasCod = new String[] {""} ;
      H01HH2_A194BarOrdLin = new short[1] ;
      H01HH2_A759ProDsc = new String[] {""} ;
      H01HH2_A758ProCod = new String[] {""} ;
      H01HH2_A130BarCodPar = new String[] {""} ;
      H01HH2_A132BarCodReo = new byte[1] ;
      H01HH2_A129BarCod = new int[1] ;
      H01HH2_A396EmprCod = new String[] {""} ;
      A4905BarFasAcab = "" ;
      A4287BarFasFor = "" ;
      H01HH3_AGRID_nRecordCount = new long[1] ;
      AV62Station = "" ;
      GXt_char7 = "" ;
      AV63Emprnom = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV26Tab_vol = new int[100] ;
      AV27Tabla_Hdr = new String[3] ;
      GX_I = 1 ;
      while ( GX_I <= 3 )
      {
         AV27Tabla_Hdr[GX_I-1] = "" ;
         GX_I = (int)(GX_I+1) ;
      }
      GXv_char10 = new String[1] ;
      GXv_int6 = new int[1] ;
      GXv_int4 = new byte[1] ;
      GXv_char9 = new String[1] ;
      GXv_decimal5 = new java.math.BigDecimal[1] ;
      GXv_decimal3 = new java.math.BigDecimal[1] ;
      GXv_int2 = new int[1] ;
      GXv_char8 = new String[1] ;
      GXv_char12 = new String[1] ;
      GXv_char13 = new String[1] ;
      GXv_char14 = new String[1] ;
      GXv_int19 = new short[1] ;
      GXv_int20 = new short[1] ;
      AV53Hdrscreadas_SDT = new app.SdtHdrscreadas_SDT(remoteHandle, context);
      GXv_char23 = new String[1] ;
      GXv_char18 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_int25 = new long[1] ;
      GXv_decimal22 = new java.math.BigDecimal[1] ;
      GXv_int21 = new int[1] ;
      GXv_int17 = new byte[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int16 = new int[1] ;
      AV21OldKgs = DecimalUtil.ZERO ;
      c6035Ac_Kilos = DecimalUtil.ZERO ;
      c6034Ac_Metros = DecimalUtil.ZERO ;
      H01HH4_A6035Ac_Kilos = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HH4_n6035Ac_Kilos = new boolean[] {false} ;
      H01HH4_A6034Ac_Metros = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01HH4_n6034Ac_Metros = new boolean[] {false} ;
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.recetasdeacabado01_wp__default(),
         new Object[] {
             new Object[] {
            H01HH2_A4905BarFasAcab, H01HH2_A4287BarFasFor, H01HH2_A766ProForDsc, H01HH2_A764ProForCod, H01HH2_A5371FasQuiLin, H01HH2_A460FasDsc, H01HH2_A457FasCod, H01HH2_A194BarOrdLin, H01HH2_A759ProDsc, H01HH2_A758ProCod,
            H01HH2_A130BarCodPar, H01HH2_A132BarCodReo, H01HH2_A129BarCod, H01HH2_A396EmprCod
            }
            , new Object[] {
            H01HH3_AGRID_nRecordCount
            }
            , new Object[] {
            H01HH4_A6035Ac_Kilos, H01HH4_n6035Ac_Kilos, H01HH4_A6034Ac_Metros, H01HH4_n6034Ac_Metros
            }
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavErrmensaje1_Enabled = 0 ;
      edtavHdr_Enabled = 0 ;
      edtavMaquinadescripcion_Enabled = 0 ;
      edtavMaqvoltop_Enabled = 0 ;
      edtavMaqvolres_Enabled = 0 ;
      edtavRep_Enabled = 0 ;
      edtavTabladevolumenes_Enabled = 0 ;
      edtavTot_kgs_Enabled = 0 ;
      edtavTot_mts_Enabled = 0 ;
   }

   private byte wcpOAV7Barcodreo ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV7Barcodreo ;
   private byte gxajaxcallmode ;
   private byte nGXWrapped ;
   private byte A132BarCodReo ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte AV41LinPro ;
   private byte GXv_int4[] ;
   private byte GXv_int17[] ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV43RecLinMaq ;
   private short AV24Rep2 ;
   private short AV40i ;
   private short wbEnd ;
   private short wbStart ;
   private short AV23Rep ;
   private short A194BarOrdLin ;
   private short A5371FasQuiLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV59t ;
   private short AV42Volumeni ;
   private short GXv_int19[] ;
   private short GXv_int20[] ;
   private int wcpOAV6Barcod ;
   private int wcpOAV13MaqVolRes ;
   private int wcpOAV14MaqVolTop ;
   private int nRC_GXsfl_99 ;
   private int subGrid_Rows ;
   private int AV6Barcod ;
   private int AV13MaqVolRes ;
   private int AV14MaqVolTop ;
   private int nGXsfl_99_idx=1 ;
   private int AV17VolMul ;
   private int AV47CliCod ;
   private int AV44LtsRec ;
   private int AV25Volumen2 ;
   private int AV28Volumenc ;
   private int AV29VolPar ;
   private int edtavErrmensaje1_Enabled ;
   private int edtavHdr_Enabled ;
   private int edtavMaquinadescripcion_Enabled ;
   private int edtavMaqvoltop_Enabled ;
   private int edtavMaqvolres_Enabled ;
   private int edtavFacabs_Enabled ;
   private int AV15Volumen ;
   private int edtavVolumen_Enabled ;
   private int edtavRep_Enabled ;
   private int edtavTabladevolumenes_Enabled ;
   private int edtavTot_kgs_Enabled ;
   private int edtavTot_mts_Enabled ;
   private int A129BarCod ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GX_I ;
   private int AV26Tab_vol[] ;
   private int nGXsfl_99_fel_idx=1 ;
   private int GXv_int6[] ;
   private int GXv_int2[] ;
   private int GXt_int1 ;
   private int GXv_int21[] ;
   private int GXv_int16[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long AV50NumeroRegistros ;
   private long GXt_int24 ;
   private long GXv_int25[] ;
   private long AV37GridPageCount ;
   private java.math.BigDecimal wcpOAV18BarKgm ;
   private java.math.BigDecimal wcpOAV19BarMtr ;
   private java.math.BigDecimal wcpOAV11ArtFacAbs ;
   private java.math.BigDecimal AV18BarKgm ;
   private java.math.BigDecimal AV19BarMtr ;
   private java.math.BigDecimal AV11ArtFacAbs ;
   private java.math.BigDecimal AV45Abs2 ;
   private java.math.BigDecimal AV16FacAbs ;
   private java.math.BigDecimal AV20Tot_kgs ;
   private java.math.BigDecimal AV22Tot_mts ;
   private java.math.BigDecimal GXv_decimal5[] ;
   private java.math.BigDecimal GXv_decimal3[] ;
   private java.math.BigDecimal GXv_decimal22[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV21OldKgs ;
   private java.math.BigDecimal c6035Ac_Kilos ;
   private java.math.BigDecimal c6034Ac_Metros ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV8Barcodpar ;
   private String wcpOAV10Maqcod ;
   private String wcpOAV12MaqDsc ;
   private String wcpOAV9Procod ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5Emprcod ;
   private String AV8Barcodpar ;
   private String AV10Maqcod ;
   private String AV12MaqDsc ;
   private String AV9Procod ;
   private String sGXsfl_99_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV48BarSer ;
   private String AV49UsurCod ;
   private String AV46Var1 ;
   private String AV31Volumenes ;
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
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String edtavErrmensaje1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable7_Internalname ;
   private String edtavHdr_Internalname ;
   private String TempTags ;
   private String AV32Hdr ;
   private String edtavHdr_Jsonclick ;
   private String edtavMaquinadescripcion_Internalname ;
   private String AV55MaquinaDescripcion ;
   private String edtavMaquinadescripcion_Jsonclick ;
   private String edtavMaqvoltop_Internalname ;
   private String edtavMaqvoltop_Jsonclick ;
   private String edtavMaqvolres_Internalname ;
   private String edtavMaqvolres_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String divUnnamedtable5_Internalname ;
   private String edtavFacabs_Internalname ;
   private String edtavFacabs_Jsonclick ;
   private String edtavVolumen_Internalname ;
   private String edtavVolumen_Jsonclick ;
   private String edtavRep_Internalname ;
   private String edtavRep_Jsonclick ;
   private String edtavTabladevolumenes_Internalname ;
   private String AV58tabladevolumenes ;
   private String edtavTabladevolumenes_Jsonclick ;
   private String divUnnamedtable6_Internalname ;
   private String edtavTot_kgs_Internalname ;
   private String edtavTot_kgs_Jsonclick ;
   private String edtavTot_mts_Internalname ;
   private String edtavTot_mts_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_unnamedtable4_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV33Seleccionar ;
   private String A396EmprCod ;
   private String edtEmprCod_Internalname ;
   private String edtBarCod_Internalname ;
   private String edtBarCodReo_Internalname ;
   private String A130BarCodPar ;
   private String edtBarCodPar_Internalname ;
   private String A758ProCod ;
   private String edtProCod_Internalname ;
   private String A759ProDsc ;
   private String edtProDsc_Internalname ;
   private String edtBarOrdLin_Internalname ;
   private String A457FasCod ;
   private String edtFasCod_Internalname ;
   private String A460FasDsc ;
   private String edtFasDsc_Internalname ;
   private String edtFasQuiLin_Internalname ;
   private String A764ProForCod ;
   private String edtProForCod_Internalname ;
   private String A766ProForDsc ;
   private String edtProForDsc_Internalname ;
   private String scmdbuf ;
   private String A4905BarFasAcab ;
   private String A4287BarFasFor ;
   private String AV62Station ;
   private String GXt_char7 ;
   private String AV63Emprnom ;
   private String AV27Tabla_Hdr[] ;
   private String sGXsfl_99_fel_idx="0001" ;
   private String GXv_char10[] ;
   private String GXv_char9[] ;
   private String GXv_char8[] ;
   private String GXv_char12[] ;
   private String GXv_char13[] ;
   private String GXv_char14[] ;
   private String GXv_char23[] ;
   private String GXv_char18[] ;
   private String GXv_char15[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtEmprCod_Jsonclick ;
   private String edtBarCod_Jsonclick ;
   private String edtBarCodReo_Jsonclick ;
   private String edtBarCodPar_Jsonclick ;
   private String edtProCod_Jsonclick ;
   private String edtProDsc_Jsonclick ;
   private String edtBarOrdLin_Jsonclick ;
   private String edtFasCod_Jsonclick ;
   private String edtFasDsc_Jsonclick ;
   private String edtFasQuiLin_Jsonclick ;
   private String edtProForCod_Jsonclick ;
   private String edtProForDsc_Jsonclick ;
   private String subGrid_Header ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_99_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean n6035Ac_Kilos ;
   private boolean n6034Ac_Metros ;
   private String wcpOAV39ErrMensaje1 ;
   private String AV39ErrMensaje1 ;
   private String AV38ErrMensaje ;
   private String AV51HdrscreadasToJson ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable4 ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private ICheckbox chkavSeleccionar ;
   private IDataStoreProvider pr_default ;
   private String[] H01HH2_A4905BarFasAcab ;
   private String[] H01HH2_A4287BarFasFor ;
   private String[] H01HH2_A766ProForDsc ;
   private String[] H01HH2_A764ProForCod ;
   private short[] H01HH2_A5371FasQuiLin ;
   private String[] H01HH2_A460FasDsc ;
   private String[] H01HH2_A457FasCod ;
   private short[] H01HH2_A194BarOrdLin ;
   private String[] H01HH2_A759ProDsc ;
   private String[] H01HH2_A758ProCod ;
   private String[] H01HH2_A130BarCodPar ;
   private byte[] H01HH2_A132BarCodReo ;
   private int[] H01HH2_A129BarCod ;
   private String[] H01HH2_A396EmprCod ;
   private long[] H01HH3_AGRID_nRecordCount ;
   private java.math.BigDecimal[] H01HH4_A6035Ac_Kilos ;
   private boolean[] H01HH4_n6035Ac_Kilos ;
   private java.math.BigDecimal[] H01HH4_A6034Ac_Metros ;
   private boolean[] H01HH4_n6034Ac_Metros ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.SdtHdrscreadas_SDT> AV54Hdrscreadas_SDTs ;
   private app.SdtHdrscreadas_SDT AV53Hdrscreadas_SDT ;
}

final  class recetasdeacabado01_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01HH2", "SELECT T3.BarFasAcab, T3.BarFasFor, T5.ProForDsc, T1.ProForCod, T1.FasQuiLin, T4.FasDsc, T3.FasCod, T1.BarOrdLin, T2.ProDsc, T1.ProCod, T1.BarCodPar, T1.BarCodReo, T1.BarCod, T1.EmprCod FROM ((((TXPFASQUI T1 INNER JOIN TXPPROCES T2 ON T2.EmprCod = T1.EmprCod AND T2.ProCod = T1.ProCod) INNER JOIN TXPBARFAS T3 ON T3.EmprCod = T1.EmprCod AND T3.BarCod = T1.BarCod AND T3.BarCodReo = T1.BarCodReo AND T3.BarCodPar = T1.BarCodPar AND T3.ProCod = T1.ProCod AND T3.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T4 ON T4.EmprCod = T1.EmprCod AND T4.FasCod = T3.FasCod) INNER JOIN TXPCPROFO T5 ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T1.ProForCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ?) AND (T3.BarFasAcab = 'S') AND (T3.BarFasFor = 'S') ORDER BY T1.EmprCod, T1.BarCod, T1.BarCodReo, T1.BarCodPar, T1.ProCod  OFFSET ? ROWS FETCH NEXT (CASE WHEN ? > 0 THEN ? ELSE 1e9 END) ROWS ONLY",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HH3", "SELECT COUNT(*) FROM ((((TXPFASQUI T1 INNER JOIN TXPPROCES T4 ON T4.EmprCod = T1.EmprCod AND T4.ProCod = T1.ProCod) INNER JOIN TXPBARFAS T2 ON T2.EmprCod = T1.EmprCod AND T2.BarCod = T1.BarCod AND T2.BarCodReo = T1.BarCodReo AND T2.BarCodPar = T1.BarCodPar AND T2.ProCod = T1.ProCod AND T2.BarOrdLin = T1.BarOrdLin) LEFT JOIN TXPFASPRO T3 ON T3.EmprCod = T1.EmprCod AND T3.FasCod = T2.FasCod) INNER JOIN TXPCPROFO T5 ON T5.EmprCod = T1.EmprCod AND T5.ProForCod = T1.ProForCod) WHERE (T1.EmprCod = ? and T1.BarCod = ? and T1.BarCodReo = ? and T1.BarCodPar = ? and T1.ProCod = ?) AND (T2.BarFasAcab = 'S') AND (T2.BarFasFor = 'S') ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01HH4", "SELECT SUM(Ac_Kilos), SUM(Ac_Metros) FROM TXPHDRACA WHERE EmprCod = ? and BarCod = ? and BarCodReo = ? and BarCodPar = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((String[]) buf[2])[0] = rslt.getString(3, 30);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((short[]) buf[4])[0] = rslt.getShort(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 28);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((short[]) buf[7])[0] = rslt.getShort(8);
               ((String[]) buf[8])[0] = rslt.getString(9, 40);
               ((String[]) buf[9])[0] = rslt.getString(10, 8);
               ((String[]) buf[10])[0] = rslt.getString(11, 1);
               ((byte[]) buf[11])[0] = rslt.getByte(12);
               ((int[]) buf[12])[0] = rslt.getInt(13);
               ((String[]) buf[13])[0] = rslt.getString(14, 3);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,2);
               ((boolean[]) buf[1])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(2,2);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
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
               stmt.setString(5, (String)parms[4], 8);
               stmt.setInt(6, ((Number) parms[5]).intValue());
               stmt.setInt(7, ((Number) parms[6]).intValue());
               stmt.setInt(8, ((Number) parms[7]).intValue());
               return;
            case 1 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               stmt.setString(5, (String)parms[4], 8);
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setInt(2, ((Number) parms[1]).intValue());
               stmt.setByte(3, ((Number) parms[2]).byteValue());
               stmt.setString(4, (String)parms[3], 1);
               return;
      }
   }

}

