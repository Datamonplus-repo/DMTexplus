package app.stocksquimicos ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class salidasmanualesproductos_wp_impl extends GXDataArea
{
   public salidasmanualesproductos_wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public salidasmanualesproductos_wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( salidasmanualesproductos_wp_impl.class ));
   }

   public salidasmanualesproductos_wp_impl( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavSalidasmanualesproductos_detalle_sdt_eliminar = UIFactory.getCheckbox(this);
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "Mode") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridsalidasmanualesproductos_detalle_sdts") == 0 )
         {
            gxnrgridsalidasmanualesproductos_detalle_sdts_newrow_invoke( ) ;
            return  ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridsalidasmanualesproductos_detalle_sdts") == 0 )
         {
            gxgrgridsalidasmanualesproductos_detalle_sdts_refresh_invoke( ) ;
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
            Gx_mode = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
               AV6CumCodCont = (int)(GXutil.lval( httpContext.GetPar( "CumCodCont"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CumCodCont), 8, 0));
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

   public void gxnrgridsalidasmanualesproductos_detalle_sdts_newrow_invoke( )
   {
      nRC_GXsfl_61 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_61"))) ;
      nGXsfl_61_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_61_idx"))) ;
      sGXsfl_61_idx = httpContext.GetPar( "sGXsfl_61_idx") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridsalidasmanualesproductos_detalle_sdts_newrow( ) ;
      /* End function gxnrGridsalidasmanualesproductos_detalle_sdts_newrow_invoke */
   }

   public void gxgrgridsalidasmanualesproductos_detalle_sdts_refresh_invoke( )
   {
      subGridsalidasmanualesproductos_detalle_sdts_Rows = (int)(GXutil.lval( httpContext.GetPar( "subGridsalidasmanualesproductos_detalle_sdts_Rows"))) ;
      AV23WebSessionKey_LCumCo_Ok = httpContext.GetPar( "WebSessionKey_LCumCo_Ok") ;
      AV24WebSessionKey_LCumCo = httpContext.GetPar( "WebSessionKey_LCumCo") ;
      AV26WebSessionKey_LCumCo_Index = httpContext.GetPar( "WebSessionKey_LCumCo_Index") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV14SalidasManualesProductos_Detalle_SDTs);
      AV25WebSessionKey_LCumCos = httpContext.GetPar( "WebSessionKey_LCumCos") ;
      AV27WebSessionKey_LCumCo_Insert = httpContext.GetPar( "WebSessionKey_LCumCo_Insert") ;
      Gx_mode = httpContext.GetPar( "Mode") ;
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridsalidasmanualesproductos_detalle_sdts_refresh( subGridsalidasmanualesproductos_detalle_sdts_Rows, AV23WebSessionKey_LCumCo_Ok, AV24WebSessionKey_LCumCo, AV26WebSessionKey_LCumCo_Index, AV14SalidasManualesProductos_Detalle_SDTs, AV25WebSessionKey_LCumCos, AV27WebSessionKey_LCumCo_Insert, Gx_mode, AV5Emprcod) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridsalidasmanualesproductos_detalle_sdts_refresh_invoke */
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
      pa1CP2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start1CP2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"true\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.stocksquimicos.salidasmanualesproductos_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6CumCodCont,8,0))}, new String[] {"Gx_mode","Emprcod","CumCodCont"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", getSecureSignedToken( "", AV14SalidasManualesProductos_Detalle_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWEBSESSIONKEY_LCUMCO_INSERT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27WebSessionKey_LCumCo_Insert, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Salidasmanualesproductos_detalle_sdt", AV19SalidasManualesProductos_Detalle_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Salidasmanualesproductos_detalle_sdt", AV19SalidasManualesProductos_Detalle_SDT);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Salidasmanualesproductos_detalle_sdts", AV14SalidasManualesProductos_Detalle_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Salidasmanualesproductos_detalle_sdts", AV14SalidasManualesProductos_Detalle_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Salidasmanualesproductos_detalle_sdts", getSecureSignedToken( "", AV14SalidasManualesProductos_Detalle_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_61", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_61, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY_LCUMCO", AV24WebSessionKey_LCumCo);
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", AV14SalidasManualesProductos_Detalle_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", AV14SalidasManualesProductos_Detalle_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", getSecureSignedToken( "", AV14SalidasManualesProductos_Detalle_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY_LCUMCO_INDEX", AV26WebSessionKey_LCumCo_Index);
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY_LCUMCOS", AV25WebSessionKey_LCumCos);
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY_LCUMCO_OK", AV23WebSessionKey_LCumCo_Ok);
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY_LCUMCO_INSERT", AV27WebSessionKey_LCumCo_Insert);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWEBSESSIONKEY_LCUMCO_INSERT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27WebSessionKey_LCumCo_Insert, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Width", GXutil.rtrim( Dvpanel_tableattributes_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autowidth", GXutil.booltostr( Dvpanel_tableattributes_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoheight", GXutil.booltostr( Dvpanel_tableattributes_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Cls", GXutil.rtrim( Dvpanel_tableattributes_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Title", GXutil.rtrim( Dvpanel_tableattributes_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsible", GXutil.booltostr( Dvpanel_tableattributes_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Collapsed", GXutil.booltostr( Dvpanel_tableattributes_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Showcollapseicon", GXutil.booltostr( Dvpanel_tableattributes_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Iconposition", GXutil.rtrim( Dvpanel_tableattributes_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_TABLEATTRIBUTES_Autoscroll", GXutil.booltostr( Dvpanel_tableattributes_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_EMPOWERER_Gridinternalname", GXutil.rtrim( Gridsalidasmanualesproductos_detalle_sdts_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_EMPOWERER_Infinitescrolling", GXutil.rtrim( Gridsalidasmanualesproductos_detalle_sdts_empowerer_Infinitescrolling));
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
         we1CP2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt1CP2( ) ;
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
      return formatLink("app.stocksquimicos.salidasmanualesproductos_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(Gx_mode)),GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6CumCodCont,8,0))}, new String[] {"Gx_mode","Emprcod","CumCodCont"})  ;
   }

   public String getPgmname( )
   {
      return "StocksQuimicos.SalidasManualesProductos_WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Salidas Manuales Productos", "") ;
   }

   public void wb1CP0( )
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
         ucDvpanel_tableattributes.setProperty("Width", Dvpanel_tableattributes_Width);
         ucDvpanel_tableattributes.setProperty("AutoWidth", Dvpanel_tableattributes_Autowidth);
         ucDvpanel_tableattributes.setProperty("AutoHeight", Dvpanel_tableattributes_Autoheight);
         ucDvpanel_tableattributes.setProperty("Cls", Dvpanel_tableattributes_Cls);
         ucDvpanel_tableattributes.setProperty("Title", Dvpanel_tableattributes_Title);
         ucDvpanel_tableattributes.setProperty("Collapsible", Dvpanel_tableattributes_Collapsible);
         ucDvpanel_tableattributes.setProperty("Collapsed", Dvpanel_tableattributes_Collapsed);
         ucDvpanel_tableattributes.setProperty("ShowCollapseIcon", Dvpanel_tableattributes_Showcollapseicon);
         ucDvpanel_tableattributes.setProperty("IconPosition", Dvpanel_tableattributes_Iconposition);
         ucDvpanel_tableattributes.setProperty("AutoScroll", Dvpanel_tableattributes_Autoscroll);
         ucDvpanel_tableattributes.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableattributes_Internalname, "DVPANEL_TABLEATTRIBUTESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_TABLEATTRIBUTESContainer"+"TableAttributes"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableattributes_Internalname, 1, 0, "px", 0, "px", "TableData", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDatoscabecera_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCumcodcont_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCumcodcont_Internalname, httpContext.getMessage( "Nº Documento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCumcodcont_Internalname, GXutil.ltrim( localUtil.ntoc( AV6CumCodCont, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCumcodcont_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6CumCodCont), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6CumCodCont), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCumcodcont_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCumcodcont_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCumconfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCumconfec_Internalname, httpContext.getMessage( "Fecha Salida", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavCumconfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCumconfec_Internalname, localUtil.format(AV7CumConFec, "99/99/99"), localUtil.format( AV7CumConFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,32);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCumconfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCumconfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_WP.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavCumconfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavCumconfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_WP.htm");
         httpContext.writeTextNL( "</div>") ;
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCumccos_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCumccos_Internalname, httpContext.getMessage( "Centro Coste", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 40,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCumccos_Internalname, GXutil.ltrim( localUtil.ntoc( AV8CumCCos, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCumccos_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV8CumCCos), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV8CumCCos), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,40);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCumccos_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCumccos_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_StocksQuimicos\\SalidasManualesProductos_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCumccosd_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCumccosd_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'" + sGXsfl_61_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCumccosd_Internalname, GXutil.rtrim( AV9CumCCosD), GXutil.rtrim( localUtil.format( AV9CumCCosD, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCumccosd_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCumccosd_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_StocksQuimicos\\SalidasManualesProductos_WP.htm");
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
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divProductos_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 55,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnsalidasmanuales_agregar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "Agregar", ""), bttBtnsalidasmanuales_agregar_Jsonclick, 7, httpContext.getMessage( "Agregar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e111cp1_client"+"'", TempTags, "", 2, "HLP_StocksQuimicos\\SalidasManualesProductos_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         Gridsalidasmanualesproductos_detalle_sdtsContainer.SetWrapped(nGXWrapped);
         startgridcontrol61( ) ;
      }
      if ( wbEnd == 61 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_61 = (int)(nGXsfl_61_idx-1) ;
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF", GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF);
            Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage", GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage);
            AV33GXV2 = nGXsfl_61_idx ;
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+"Gridsalidasmanualesproductos_detalle_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid("_"+"Gridsalidasmanualesproductos_detalle_sdts", Gridsalidasmanualesproductos_detalle_sdtsContainer, subGridsalidasmanualesproductos_detalle_sdts_Internalname);
            if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridsalidasmanualesproductos_detalle_sdtsContainerData", Gridsalidasmanualesproductos_detalle_sdtsContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, "Gridsalidasmanualesproductos_detalle_sdtsContainerData"+"V", Gridsalidasmanualesproductos_detalle_sdtsContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridsalidasmanualesproductos_detalle_sdtsContainerData"+"V"+"\" value='"+Gridsalidasmanualesproductos_detalle_sdtsContainer.GridValuesHidden()+"'/>") ;
            }
         }
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 88,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneliminarsalida_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "Eliminar", ""), bttBtneliminarsalida_Jsonclick, 7, httpContext.getMessage( "Eliminar Salida", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e121cp1_client"+"'", TempTags, "", 2, "HLP_StocksQuimicos\\SalidasManualesProductos_WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 93,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "GX_BtnEnter", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'',0)\"" ;
         ClassString = "ButtonMaterialDefault" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancel_Internalname, "gx.evt.setGridEvt("+GXutil.str( 61, 2, 0)+","+"null"+");", httpContext.getMessage( "GX_BtnCancel", ""), bttBtncancel_Jsonclick, 1, httpContext.getMessage( "GX_BtnCancel", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_StocksQuimicos\\SalidasManualesProductos_WP.htm");
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
         /* User Defined Control */
         ucGridsalidasmanualesproductos_detalle_sdts_empowerer.setProperty("InfiniteScrolling", Gridsalidasmanualesproductos_detalle_sdts_empowerer_Infinitescrolling);
         ucGridsalidasmanualesproductos_detalle_sdts_empowerer.render(context, "wwp.gridempowerer", Gridsalidasmanualesproductos_detalle_sdts_empowerer_Internalname, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 61 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF", GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF);
               Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage", GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage);
               AV33GXV2 = nGXsfl_61_idx ;
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+"Gridsalidasmanualesproductos_detalle_sdtsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid("_"+"Gridsalidasmanualesproductos_detalle_sdts", Gridsalidasmanualesproductos_detalle_sdtsContainer, subGridsalidasmanualesproductos_detalle_sdts_Internalname);
               if ( ! httpContext.isAjaxRequest( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridsalidasmanualesproductos_detalle_sdtsContainerData", Gridsalidasmanualesproductos_detalle_sdtsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, "Gridsalidasmanualesproductos_detalle_sdtsContainerData"+"V", Gridsalidasmanualesproductos_detalle_sdtsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+"Gridsalidasmanualesproductos_detalle_sdtsContainerData"+"V"+"\" value='"+Gridsalidasmanualesproductos_detalle_sdtsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void start1CP2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Salidas Manuales Productos", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup1CP0( ) ;
   }

   public void ws1CP2( )
   {
      start1CP2( ) ;
      evt1CP2( ) ;
   }

   public void evt1CP2( )
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
                        else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ! wbErr )
                           {
                              Rfr0gs = false ;
                              if ( ! Rfr0gs )
                              {
                                 /* Execute user event: Enter */
                                 e131CP2 ();
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
                        else if ( GXutil.strcmp(sEvt, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTSPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           sEvt = httpContext.cgiGet( "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTSPAGING") ;
                           if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                           {
                              subgridsalidasmanualesproductos_detalle_sdts_firstpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "PREV") == 0 )
                           {
                              subgridsalidasmanualesproductos_detalle_sdts_previouspage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                           {
                              subgridsalidasmanualesproductos_detalle_sdts_nextpage( ) ;
                           }
                           else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                           {
                              subgridsalidasmanualesproductos_detalle_sdts_lastpage( ) ;
                           }
                           dynload_actions( ) ;
                        }
                     }
                     else
                     {
                        sEvtType = GXutil.right( sEvt, 4) ;
                        sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 46), "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "VIMGSALIDA.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 16), "VIMGSALIDA.CLICK") == 0 ) )
                        {
                           nGXsfl_61_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_612( ) ;
                           AV33GXV2 = nGXsfl_61_idx ;
                           if ( ( AV14SalidasManualesProductos_Detalle_SDTs.size() >= AV33GXV2 ) && ( AV33GXV2 > 0 ) )
                           {
                              AV14SalidasManualesProductos_Detalle_SDTs.currentItem( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)) );
                              AV20imgSalida = httpContext.cgiGet( edtavImgsalida_Internalname) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavImgsalida_Internalname, AV20imgSalida);
                              AV19SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar( GXutil.strtobool( httpContext.cgiGet( chkavSalidasmanualesproductos_detalle_sdt_eliminar.getInternalname())) );
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
                                 e141CP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e151CP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VIMGSALIDA.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e161CP2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e171CP2 ();
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

   public void we1CP2( )
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

   public void pa1CP2( )
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
            GX_FocusControl = edtavCumconfec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
         nDonePA = (byte)(1) ;
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void gxnrgridsalidasmanualesproductos_detalle_sdts_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_612( ) ;
      while ( nGXsfl_61_idx <= nRC_GXsfl_61 )
      {
         sendrow_612( ) ;
         nGXsfl_61_idx = ((subGridsalidasmanualesproductos_detalle_sdts_Islastpage==1)&&(nGXsfl_61_idx+1>subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_61_idx+1) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
      }
      addString( httpContext.getJSONContainerResponse( Gridsalidasmanualesproductos_detalle_sdtsContainer)) ;
      /* End function gxnrGridsalidasmanualesproductos_detalle_sdts_newrow */
   }

   public void gxgrgridsalidasmanualesproductos_detalle_sdts_refresh( int subGridsalidasmanualesproductos_detalle_sdts_Rows ,
                                                                      String AV23WebSessionKey_LCumCo_Ok ,
                                                                      String AV24WebSessionKey_LCumCo ,
                                                                      String AV26WebSessionKey_LCumCo_Index ,
                                                                      GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT> AV14SalidasManualesProductos_Detalle_SDTs ,
                                                                      String AV25WebSessionKey_LCumCos ,
                                                                      String AV27WebSessionKey_LCumCo_Insert ,
                                                                      String Gx_mode ,
                                                                      String AV5Emprcod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171CP2 ();
      GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nCurrentRecord = 0 ;
      rf1CP2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridsalidasmanualesproductos_detalle_sdts_refresh */
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
      GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage = 0 ;
      GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nCurrentRecord = 0 ;
      GXCCtl = "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage_" + sGXsfl_61_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf1CP2( ) ;
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
      edtavImgsalida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavImgsalida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImgsalida_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdnum_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdnom_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__forprdume_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__forprdume_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__forprdume_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdlote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdlote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdlote_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getEnabled(), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__emprcod_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Enabled), 5, 0), !bGXsfl_61_Refreshing);
   }

   public void rf1CP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         Gridsalidasmanualesproductos_detalle_sdtsContainer.ClearRows();
      }
      wbStart = (short)(61) ;
      /* Execute user event: Refresh */
      e171CP2 ();
      nGXsfl_61_idx = (int)(1+GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage) ;
      sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_612( ) ;
      bGXsfl_61_Refreshing = true ;
      Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("GridName", "Gridsalidasmanualesproductos_detalle_sdts");
      Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("CmpContext", "");
      Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("InMasterPage", "false");
      Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
      Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      Gridsalidasmanualesproductos_detalle_sdtsContainer.setPageSize( subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_612( ) ;
         e151CP2 ();
         if ( ( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nCurrentRecord > 0 ) && ( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nGridOutOfScope == 0 ) && ( nGXsfl_61_idx == 1 ) )
         {
            GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nCurrentRecord = 0 ;
            GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nGridOutOfScope = 1 ;
            subgridsalidasmanualesproductos_detalle_sdts_firstpage( ) ;
            e151CP2 ();
         }
         wbEnd = (short)(61) ;
         wb1CP0( ) ;
      }
      bGXsfl_61_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1CP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vMODE", GXutil.rtrim( Gx_mode));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vMODE", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( Gx_mode, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", AV14SalidasManualesProductos_Detalle_SDTs);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", AV14SalidasManualesProductos_Detalle_SDTs);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS", getSecureSignedToken( "", AV14SalidasManualesProductos_Detalle_SDTs));
      app.GxWebStd.gx_hidden_field( httpContext, "vWEBSESSIONKEY_LCUMCO_INSERT", AV27WebSessionKey_LCumCo_Insert);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWEBSESSIONKEY_LCUMCO_INSERT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27WebSessionKey_LCumCo_Insert, ""))));
   }

   public int subgridsalidasmanualesproductos_detalle_sdts_fnc_pagecount( )
   {
      GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount = subgridsalidasmanualesproductos_detalle_sdts_fnc_recordcount( ) ;
      if ( ((int)((GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount) % (subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )))) == 0 )
      {
         return (int)(GXutil.Int( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount/ (double) (subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )))) ;
      }
      return (int)(GXutil.Int( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount/ (double) (subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )))+1) ;
   }

   public int subgridsalidasmanualesproductos_detalle_sdts_fnc_recordcount( )
   {
      return AV14SalidasManualesProductos_Detalle_SDTs.size() ;
   }

   public int subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )
   {
      if ( subGridsalidasmanualesproductos_detalle_sdts_Rows > 0 )
      {
         return subGridsalidasmanualesproductos_detalle_sdts_Rows*1 ;
      }
      else
      {
         return -1 ;
      }
   }

   public int subgridsalidasmanualesproductos_detalle_sdts_fnc_currentpage( )
   {
      return (int)(GXutil.Int( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage/ (double) (subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )))+1) ;
   }

   public short subgridsalidasmanualesproductos_detalle_sdts_firstpage( )
   {
      GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsalidasmanualesproductos_detalle_sdts_refresh( subGridsalidasmanualesproductos_detalle_sdts_Rows, AV23WebSessionKey_LCumCo_Ok, AV24WebSessionKey_LCumCo, AV26WebSessionKey_LCumCo_Index, AV14SalidasManualesProductos_Detalle_SDTs, AV25WebSessionKey_LCumCos, AV27WebSessionKey_LCumCo_Insert, Gx_mode, AV5Emprcod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsalidasmanualesproductos_detalle_sdts_nextpage( )
   {
      GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount = subgridsalidasmanualesproductos_detalle_sdts_fnc_recordcount( ) ;
      if ( ( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount >= subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( ) ) && ( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF == 0 ) )
      {
         GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage = (long)(GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage+subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      if ( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF == 1 )
      {
         GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage = GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage", GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsalidasmanualesproductos_detalle_sdts_refresh( subGridsalidasmanualesproductos_detalle_sdts_Rows, AV23WebSessionKey_LCumCo_Ok, AV24WebSessionKey_LCumCo, AV26WebSessionKey_LCumCo_Index, AV14SalidasManualesProductos_Detalle_SDTs, AV25WebSessionKey_LCumCos, AV27WebSessionKey_LCumCo_Insert, Gx_mode, AV5Emprcod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF==0) ? 0 : 2)) ;
   }

   public short subgridsalidasmanualesproductos_detalle_sdts_previouspage( )
   {
      if ( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage >= subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( ) )
      {
         GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage = (long)(GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage-subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )) ;
      }
      else
      {
         return (short)(2) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsalidasmanualesproductos_detalle_sdts_refresh( subGridsalidasmanualesproductos_detalle_sdts_Rows, AV23WebSessionKey_LCumCo_Ok, AV24WebSessionKey_LCumCo, AV26WebSessionKey_LCumCo_Index, AV14SalidasManualesProductos_Detalle_SDTs, AV25WebSessionKey_LCumCos, AV27WebSessionKey_LCumCo_Insert, Gx_mode, AV5Emprcod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgridsalidasmanualesproductos_detalle_sdts_lastpage( )
   {
      GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount = subgridsalidasmanualesproductos_detalle_sdts_fnc_recordcount( ) ;
      if ( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount > subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( ) )
      {
         if ( ((int)((GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount) % (subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )))) == 0 )
         {
            GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage = (long)(GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount-subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )) ;
         }
         else
         {
            GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage = (long)(GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount-((int)((GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount) % (subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( ))))) ;
         }
      }
      else
      {
         GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsalidasmanualesproductos_detalle_sdts_refresh( subGridsalidasmanualesproductos_detalle_sdts_Rows, AV23WebSessionKey_LCumCo_Ok, AV24WebSessionKey_LCumCo, AV26WebSessionKey_LCumCo_Index, AV14SalidasManualesProductos_Detalle_SDTs, AV25WebSessionKey_LCumCos, AV27WebSessionKey_LCumCo_Insert, Gx_mode, AV5Emprcod) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgridsalidasmanualesproductos_detalle_sdts_gotopage( int nPageNo )
   {
      if ( nPageNo > 0 )
      {
         GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage = (long)(subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )*(nPageNo-1)) ;
      }
      else
      {
         GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage = 0 ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgridsalidasmanualesproductos_detalle_sdts_refresh( subGridsalidasmanualesproductos_detalle_sdts_Rows, AV23WebSessionKey_LCumCo_Ok, AV24WebSessionKey_LCumCo, AV26WebSessionKey_LCumCo_Index, AV14SalidasManualesProductos_Detalle_SDTs, AV25WebSessionKey_LCumCos, AV27WebSessionKey_LCumCo_Insert, Gx_mode, AV5Emprcod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavImgsalida_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavImgsalida_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavImgsalida_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdnum_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdnom_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__forprdume_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__forprdume_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__forprdume_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdlote_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdlote_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdlote_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop("", false, cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getInternalname(), "Enabled", GXutil.ltrimstr( cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getEnabled(), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__emprcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__emprcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__emprcod_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Enabled), 5, 0), !bGXsfl_61_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strup1CP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e141CP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Salidasmanualesproductos_detalle_sdt"), AV19SalidasManualesProductos_Detalle_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Salidasmanualesproductos_detalle_sdts"), AV14SalidasManualesProductos_Detalle_SDTs);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS"), AV14SalidasManualesProductos_Detalle_SDTs);
         /* Read saved values. */
         nRC_GXsfl_61 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_61"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGridsalidasmanualesproductos_detalle_sdts_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tableattributes_Width = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Width") ;
         Dvpanel_tableattributes_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autowidth")) ;
         Dvpanel_tableattributes_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoheight")) ;
         Dvpanel_tableattributes_Cls = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Cls") ;
         Dvpanel_tableattributes_Title = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Title") ;
         Dvpanel_tableattributes_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsible")) ;
         Dvpanel_tableattributes_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Collapsed")) ;
         Dvpanel_tableattributes_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Showcollapseicon")) ;
         Dvpanel_tableattributes_Iconposition = httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Iconposition") ;
         Dvpanel_tableattributes_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_TABLEATTRIBUTES_Autoscroll")) ;
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
         Gridsalidasmanualesproductos_detalle_sdts_empowerer_Gridinternalname = httpContext.cgiGet( "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_EMPOWERER_Gridinternalname") ;
         Gridsalidasmanualesproductos_detalle_sdts_empowerer_Infinitescrolling = httpContext.cgiGet( "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_EMPOWERER_Infinitescrolling") ;
         nRC_GXsfl_61 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_61"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_61_fel_idx = 0 ;
         while ( nGXsfl_61_fel_idx < nRC_GXsfl_61 )
         {
            nGXsfl_61_fel_idx = ((subGridsalidasmanualesproductos_detalle_sdts_Islastpage==1)&&(nGXsfl_61_fel_idx+1>subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_61_fel_idx+1) ;
            sGXsfl_61_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_612( ) ;
            AV33GXV2 = nGXsfl_61_fel_idx ;
            if ( ( AV14SalidasManualesProductos_Detalle_SDTs.size() >= AV33GXV2 ) && ( AV33GXV2 > 0 ) )
            {
               AV14SalidasManualesProductos_Detalle_SDTs.currentItem( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)) );
               AV20imgSalida = httpContext.cgiGet( edtavImgsalida_Internalname) ;
               AV19SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar( GXutil.strtobool( httpContext.cgiGet( chkavSalidasmanualesproductos_detalle_sdt_eliminar.getInternalname())) );
            }
         }
         if ( nGXsfl_61_fel_idx == 0 )
         {
            nGXsfl_61_idx = 1 ;
            sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_612( ) ;
         }
         nGXsfl_61_fel_idx = 1 ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavCumconfec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vCUMCONFEC");
            GX_FocusControl = edtavCumconfec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7CumConFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CumConFec", localUtil.format(AV7CumConFec, "99/99/99"));
         }
         else
         {
            AV7CumConFec = localUtil.ctod( httpContext.cgiGet( edtavCumconfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7CumConFec", localUtil.format(AV7CumConFec, "99/99/99"));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCumccos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCumccos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCUMCCOS");
            GX_FocusControl = edtavCumccos_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV8CumCCos = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CumCCos), 3, 0));
         }
         else
         {
            AV8CumCCos = (short)(localUtil.ctol( httpContext.cgiGet( edtavCumccos_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV8CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CumCCos), 3, 0));
         }
         AV9CumCCosD = httpContext.cgiGet( edtavCumccosd_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9CumCCosD", AV9CumCCosD);
         /* Read subfile selected row values. */
         nGXsfl_61_idx = (int)(localUtil.cton( httpContext.cgiGet( subGridsalidasmanualesproductos_detalle_sdts_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
         AV33GXV2 = nGXsfl_61_idx ;
         if ( nGXsfl_61_idx > 0 )
         {
            AV33GXV2 = nGXsfl_61_idx ;
            if ( ( AV14SalidasManualesProductos_Detalle_SDTs.size() >= AV33GXV2 ) && ( AV33GXV2 > 0 ) )
            {
               AV14SalidasManualesProductos_Detalle_SDTs.currentItem( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)) );
               AV20imgSalida = httpContext.cgiGet( edtavImgsalida_Internalname) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavImgsalida_Internalname, AV20imgSalida);
               AV19SalidasManualesProductos_Detalle_SDT.setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar( GXutil.strtobool( httpContext.cgiGet( chkavSalidasmanualesproductos_detalle_sdt_eliminar.getInternalname())) );
            }
            if ( ( AV33GXV2 > 0 ) && ( AV14SalidasManualesProductos_Detalle_SDTs.size() >= AV33GXV2 ) )
            {
               AV14SalidasManualesProductos_Detalle_SDTs.currentItem( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)) );
            }
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
      e141CP2 ();
      if (returnInSub) return;
   }

   public void e141CP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV56Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      salidasmanualesproductos_wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV56Station = GXt_char1 ;
      GXv_char2[0] = AV5Emprcod ;
      GXv_char3[0] = AV57Emprnom ;
      GXv_char4[0] = AV58Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV56Station, GXv_char2, GXv_char3, GXv_char4) ;
      salidasmanualesproductos_wp_impl.this.AV5Emprcod = GXv_char2[0] ;
      salidasmanualesproductos_wp_impl.this.AV57Emprnom = GXv_char3[0] ;
      salidasmanualesproductos_wp_impl.this.AV58Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
      Gridsalidasmanualesproductos_detalle_sdts_empowerer_Gridinternalname = subGridsalidasmanualesproductos_detalle_sdts_Internalname ;
      ucGridsalidasmanualesproductos_detalle_sdts_empowerer.sendProperty(context, "", false, Gridsalidasmanualesproductos_detalle_sdts_empowerer_Internalname, "GridInternalName", Gridsalidasmanualesproductos_detalle_sdts_empowerer_Gridinternalname);
      subGridsalidasmanualesproductos_detalle_sdts_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_Rows", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Rows, (byte)(6), (byte)(0), ".", "")));
      AV24WebSessionKey_LCumCo = "LCumCo" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24WebSessionKey_LCumCo", AV24WebSessionKey_LCumCo);
      AV25WebSessionKey_LCumCos = "LCumCos" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25WebSessionKey_LCumCos", AV25WebSessionKey_LCumCos);
      AV23WebSessionKey_LCumCo_Ok = "LCumCo_Ok" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23WebSessionKey_LCumCo_Ok", AV23WebSessionKey_LCumCo_Ok);
      AV26WebSessionKey_LCumCo_Index = "LCumCo_Index" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26WebSessionKey_LCumCo_Index", AV26WebSessionKey_LCumCo_Index);
      AV27WebSessionKey_LCumCo_Insert = "LCumCo_Insert" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27WebSessionKey_LCumCo_Insert", AV27WebSessionKey_LCumCo_Insert);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vWEBSESSIONKEY_LCUMCO_INSERT", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV27WebSessionKey_LCumCo_Insert, ""))));
      AV28WebSession.remove(AV24WebSessionKey_LCumCo);
      AV28WebSession.remove(AV23WebSessionKey_LCumCo_Ok);
      AV28WebSession.remove(AV26WebSessionKey_LCumCo_Index);
      AV28WebSession.remove(AV27WebSessionKey_LCumCo_Insert);
      /* Execute user subroutine: 'OBTENER_DATOS' */
      S112 ();
      if (returnInSub) return;
   }

   private void e151CP2( )
   {
      /* Gridsalidasmanualesproductos_detalle_sdts_Load Routine */
      returnInSub = false ;
      AV33GXV2 = 1 ;
      while ( AV33GXV2 <= AV14SalidasManualesProductos_Detalle_SDTs.size() )
      {
         AV14SalidasManualesProductos_Detalle_SDTs.currentItem( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)) );
         AV20imgSalida = "<i class=\"fas fa-pencil-alt\"></i>" ;
         httpContext.ajax_rsp_assign_attri("", false, edtavImgsalida_Internalname, AV20imgSalida);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(61) ;
         }
         if ( ( subGridsalidasmanualesproductos_detalle_sdts_Islastpage == 1 ) || ( subGridsalidasmanualesproductos_detalle_sdts_Rows == 0 ) || ( ( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nCurrentRecord >= GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage ) && ( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nCurrentRecord < GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage + subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( ) ) ) )
         {
            sendrow_612( ) ;
            GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nCurrentRecord + 1 >= subgridsalidasmanualesproductos_detalle_sdts_fnc_recordcount( ) )
            {
               GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF", GXutil.ltrim( localUtil.ntoc( GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nCurrentRecord = (long)(GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_61_Refreshing )
         {
            httpContext.doAjaxLoad(61, Gridsalidasmanualesproductos_detalle_sdtsRow);
         }
         AV33GXV2 = (int)(AV33GXV2+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e131CP2 ();
      if (returnInSub) return;
   }

   public void e131CP2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      AV12Messages.clear();
      if ( GXutil.strcmp(Gx_mode, "INS") != 0 )
      {
         if ( GXutil.strcmp(Gx_mode, "DLT") == 0 )
         {
            if ( AV12Messages.size() == 0 )
            {
               AV10SalidasManualesProductos_Cabecera.Load(AV5Emprcod, AV6CumCodCont);
               AV10SalidasManualesProductos_Cabecera.Delete();
               if ( AV10SalidasManualesProductos_Cabecera.Fail() )
               {
                  AV12Messages = AV10SalidasManualesProductos_Cabecera.GetMessages() ;
               }
            }
         }
      }
      if ( GXutil.strcmp(Gx_mode, "DLT") != 0 )
      {
         AV10SalidasManualesProductos_Cabecera.Load(AV5Emprcod, AV6CumCodCont);
         AV10SalidasManualesProductos_Cabecera.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec( AV7CumConFec );
         AV10SalidasManualesProductos_Cabecera.setgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos( AV8CumCCos );
         AV10SalidasManualesProductos_Cabecera.Save();
         if ( AV10SalidasManualesProductos_Cabecera.Fail() )
         {
            AV12Messages = AV10SalidasManualesProductos_Cabecera.GetMessages() ;
         }
      }
      if ( AV12Messages.size() == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "stocksquimicos.salidasmanualesproductos_wp");
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso finalizado correctamente", ""));
         httpContext.setWebReturnParms(new Object[] {Gx_mode,AV5Emprcod,Integer.valueOf(AV6CumCodCont)});
         httpContext.setWebReturnParmsMetadata(new Object[] {"Gx_mode","AV5Emprcod","AV6CumCodCont"});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "stocksquimicos.salidasmanualesproductos_wp");
         AV59GXV25 = 1 ;
         while ( AV59GXV25 <= AV12Messages.size() )
         {
            AV13Message = (com.genexus.SdtMessages_Message)((com.genexus.SdtMessages_Message)AV12Messages.elementAt(-1+AV59GXV25));
            httpContext.GX_msglist.addItem(AV13Message.getgxTv_SdtMessages_Message_Description());
            AV59GXV25 = (int)(AV59GXV25+1) ;
         }
      }
   }

   public void e161CP2( )
   {
      AV33GXV2 = nGXsfl_61_idx ;
      if ( ( AV33GXV2 > 0 ) && ( AV14SalidasManualesProductos_Detalle_SDTs.size() >= AV33GXV2 ) )
      {
         AV14SalidasManualesProductos_Detalle_SDTs.currentItem( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)) );
      }
      /* Imgsalida_Click Routine */
      returnInSub = false ;
      AV28WebSession.setValue(AV24WebSessionKey_LCumCo, ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.currentItem()).toJSonString(false, true));
      AV28WebSession.setValue(AV26WebSessionKey_LCumCo_Index, GXutil.str( AV14SalidasManualesProductos_Detalle_SDTs.indexof(((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.currentItem())), 10, 2));
      httpContext.popup(formatLink("app.salidasmanualesproductos_detalle_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV24WebSessionKey_LCumCo)),GXutil.URLEncode(GXutil.rtrim(AV25WebSessionKey_LCumCos)),GXutil.URLEncode(GXutil.rtrim(AV23WebSessionKey_LCumCo_Ok)),GXutil.URLEncode(GXutil.rtrim(AV26WebSessionKey_LCumCo_Index))}, new String[] {"WebSessionKey_LCumco","WebSessionKey_LCumCos","WebSessionKey_LCumCo_Ok","WebSessionKey_LCumCo_Index"}) , new Object[] {"AV24WebSessionKey_LCumCo","AV25WebSessionKey_LCumCos","AV23WebSessionKey_LCumCo_Ok","AV26WebSessionKey_LCumCo_Index"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19SalidasManualesProductos_Detalle_SDT", AV19SalidasManualesProductos_Detalle_SDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14SalidasManualesProductos_Detalle_SDTs", AV14SalidasManualesProductos_Detalle_SDTs);
      nGXsfl_61_bak_idx = nGXsfl_61_idx ;
      gxgrgridsalidasmanualesproductos_detalle_sdts_refresh( subGridsalidasmanualesproductos_detalle_sdts_Rows, AV23WebSessionKey_LCumCo_Ok, AV24WebSessionKey_LCumCo, AV26WebSessionKey_LCumCo_Index, AV14SalidasManualesProductos_Detalle_SDTs, AV25WebSessionKey_LCumCos, AV27WebSessionKey_LCumCo_Insert, Gx_mode, AV5Emprcod) ;
      nGXsfl_61_idx = nGXsfl_61_bak_idx ;
      sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_612( ) ;
   }

   public void e171CP2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(GXutil.trim( AV28WebSession.getValue(AV23WebSessionKey_LCumCo_Ok)), httpContext.getMessage( "S", "")) == 0 )
      {
         AV19SalidasManualesProductos_Detalle_SDT.fromJSonString(AV28WebSession.getValue(AV24WebSessionKey_LCumCo), null);
         if ( CommonUtil.decimalVal( AV28WebSession.getValue(AV26WebSessionKey_LCumCo_Index), ".").doubleValue() == 0 )
         {
            AV14SalidasManualesProductos_Detalle_SDTs.add(AV19SalidasManualesProductos_Detalle_SDT, 0);
            gx_BV61 = true ;
         }
         else
         {
            AV14SalidasManualesProductos_Detalle_SDTs.removeItem((int)(DecimalUtil.decToDouble(CommonUtil.decimalVal( AV28WebSession.getValue(AV26WebSessionKey_LCumCo_Index), "."))));
            gx_BV61 = true ;
            AV14SalidasManualesProductos_Detalle_SDTs.add(AV19SalidasManualesProductos_Detalle_SDT, 0);
            gx_BV61 = true ;
         }
         AV28WebSession.remove(AV24WebSessionKey_LCumCo);
         AV28WebSession.remove(AV25WebSessionKey_LCumCos);
         AV28WebSession.remove(AV26WebSessionKey_LCumCo_Index);
         AV28WebSession.remove(AV23WebSessionKey_LCumCo_Ok);
      }
      if ( GXutil.strcmp(GXutil.trim( AV28WebSession.getValue(AV27WebSessionKey_LCumCo_Insert)), "") != 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Se agrego desde la TRN ", "")+AV28WebSession.getValue(AV27WebSessionKey_LCumCo_Insert));
         AV28WebSession.remove(AV27WebSessionKey_LCumCo_Insert);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV19SalidasManualesProductos_Detalle_SDT", AV19SalidasManualesProductos_Detalle_SDT);
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV14SalidasManualesProductos_Detalle_SDTs", AV14SalidasManualesProductos_Detalle_SDTs);
   }

   public void S112( )
   {
      /* 'OBTENER_DATOS' Routine */
      returnInSub = false ;
      AV10SalidasManualesProductos_Cabecera.Load(AV5Emprcod, AV6CumCodCont);
      AV7CumConFec = AV10SalidasManualesProductos_Cabecera.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumconfec() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7CumConFec", localUtil.format(AV7CumConFec, "99/99/99"));
      AV11CumConTipo = AV10SalidasManualesProductos_Cabecera.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumcontipo() ;
      AV8CumCCos = AV10SalidasManualesProductos_Cabecera.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccos() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8CumCCos", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8CumCCos), 3, 0));
      AV9CumCCosD = AV10SalidasManualesProductos_Cabecera.getgxTv_SdtSalidasManualesProductos_Cabecera_Cumccosd() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9CumCCosD", AV9CumCCosD);
      GXt_objcol_SdtSalidasManualesProductos_Detalle_SDT5 = AV14SalidasManualesProductos_Detalle_SDTs ;
      GXv_objcol_SdtSalidasManualesProductos_Detalle_SDT6[0] = GXt_objcol_SdtSalidasManualesProductos_Detalle_SDT5 ;
      new app.stocksquimicos.salidasmanualesproductos_detalle_dp(remoteHandle, context).execute( AV5Emprcod, AV6CumCodCont, GXv_objcol_SdtSalidasManualesProductos_Detalle_SDT6) ;
      GXt_objcol_SdtSalidasManualesProductos_Detalle_SDT5 = GXv_objcol_SdtSalidasManualesProductos_Detalle_SDT6[0] ;
      AV14SalidasManualesProductos_Detalle_SDTs = GXt_objcol_SdtSalidasManualesProductos_Detalle_SDT5 ;
      gx_BV61 = true ;
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      Gx_mode = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      AV5Emprcod = (String)getParm(obj,1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5Emprcod", AV5Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV5Emprcod, "@!"))));
      AV6CumCodCont = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6CumCodCont", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6CumCodCont), 8, 0));
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
      pa1CP2( ) ;
      ws1CP2( ) ;
      we1CP2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20266101643565", true, true);
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
      httpContext.AddJavascriptSource("stocksquimicos/salidasmanualesproductos_wp.js", "?20266101643566", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_612( )
   {
      edtavImgsalida_Internalname = "vIMGSALIDA_"+sGXsfl_61_idx ;
      chkavSalidasmanualesproductos_detalle_sdt_eliminar.setInternalname( "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_ELIMINAR_"+sGXsfl_61_idx );
      edtavSalidasmanualesproductos_detalle_sdts__prdnum_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDNUM_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdnom_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDNOM_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDFACCON_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDEXIALM_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDCANRES_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCONCANT_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMUNIDAD_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCONLOT_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDPREMED_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__ULTFECCCS_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDVALSTK_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__forprdume_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__FORPRDUME_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__FORPRDDSC_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDCOMID_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdlote_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDLOTE_"+sGXsfl_61_idx ;
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setInternalname( "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMUMED_"+sGXsfl_61_idx );
      edtavSalidasmanualesproductos_detalle_sdts__emprcod_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__EMPRCOD_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCODCONT_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCONCBIS_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCOSPRO_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDPREACT_"+sGXsfl_61_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDEXICC_"+sGXsfl_61_idx ;
   }

   public void subsflControlProps_fel_612( )
   {
      edtavImgsalida_Internalname = "vIMGSALIDA_"+sGXsfl_61_fel_idx ;
      chkavSalidasmanualesproductos_detalle_sdt_eliminar.setInternalname( "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_ELIMINAR_"+sGXsfl_61_fel_idx );
      edtavSalidasmanualesproductos_detalle_sdts__prdnum_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDNUM_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdnom_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDNOM_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDFACCON_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDEXIALM_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDCANRES_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCONCANT_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMUNIDAD_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCONLOT_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDPREMED_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__ULTFECCCS_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDVALSTK_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__forprdume_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__FORPRDUME_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__FORPRDDSC_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDCOMID_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdlote_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDLOTE_"+sGXsfl_61_fel_idx ;
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setInternalname( "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMUMED_"+sGXsfl_61_fel_idx );
      edtavSalidasmanualesproductos_detalle_sdts__emprcod_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__EMPRCOD_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCODCONT_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCONCBIS_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCOSPRO_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDPREACT_"+sGXsfl_61_fel_idx ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDEXICC_"+sGXsfl_61_fel_idx ;
   }

   public void sendrow_612( )
   {
      subsflControlProps_612( ) ;
      wb1CP0( ) ;
      if ( ( subGridsalidasmanualesproductos_detalle_sdts_Rows * 1 == 0 ) || ( nGXsfl_61_idx - GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage <= subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( ) * 1 ) )
      {
         Gridsalidasmanualesproductos_detalle_sdtsRow = GXWebRow.GetNew(context,Gridsalidasmanualesproductos_detalle_sdtsContainer) ;
         if ( subGridsalidasmanualesproductos_detalle_sdts_Backcolorstyle == 0 )
         {
            /* None style subfile background logic. */
            subGridsalidasmanualesproductos_detalle_sdts_Backstyle = (byte)(0) ;
            if ( GXutil.strcmp(subGridsalidasmanualesproductos_detalle_sdts_Class, "") != 0 )
            {
               subGridsalidasmanualesproductos_detalle_sdts_Linesclass = subGridsalidasmanualesproductos_detalle_sdts_Class+"Odd" ;
            }
         }
         else if ( subGridsalidasmanualesproductos_detalle_sdts_Backcolorstyle == 1 )
         {
            /* Uniform style subfile background logic. */
            subGridsalidasmanualesproductos_detalle_sdts_Backstyle = (byte)(0) ;
            subGridsalidasmanualesproductos_detalle_sdts_Backcolor = subGridsalidasmanualesproductos_detalle_sdts_Allbackcolor ;
            if ( GXutil.strcmp(subGridsalidasmanualesproductos_detalle_sdts_Class, "") != 0 )
            {
               subGridsalidasmanualesproductos_detalle_sdts_Linesclass = subGridsalidasmanualesproductos_detalle_sdts_Class+"Uniform" ;
            }
         }
         else if ( subGridsalidasmanualesproductos_detalle_sdts_Backcolorstyle == 2 )
         {
            /* Header style subfile background logic. */
            subGridsalidasmanualesproductos_detalle_sdts_Backstyle = (byte)(1) ;
            if ( GXutil.strcmp(subGridsalidasmanualesproductos_detalle_sdts_Class, "") != 0 )
            {
               subGridsalidasmanualesproductos_detalle_sdts_Linesclass = subGridsalidasmanualesproductos_detalle_sdts_Class+"Odd" ;
            }
            subGridsalidasmanualesproductos_detalle_sdts_Backcolor = (int)(0x0) ;
         }
         else if ( subGridsalidasmanualesproductos_detalle_sdts_Backcolorstyle == 3 )
         {
            /* Report style subfile background logic. */
            subGridsalidasmanualesproductos_detalle_sdts_Backstyle = (byte)(1) ;
            if ( ((int)((nGXsfl_61_idx) % (2))) == 0 )
            {
               subGridsalidasmanualesproductos_detalle_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsalidasmanualesproductos_detalle_sdts_Class, "") != 0 )
               {
                  subGridsalidasmanualesproductos_detalle_sdts_Linesclass = subGridsalidasmanualesproductos_detalle_sdts_Class+"Even" ;
               }
            }
            else
            {
               subGridsalidasmanualesproductos_detalle_sdts_Backcolor = (int)(0x0) ;
               if ( GXutil.strcmp(subGridsalidasmanualesproductos_detalle_sdts_Class, "") != 0 )
               {
                  subGridsalidasmanualesproductos_detalle_sdts_Linesclass = subGridsalidasmanualesproductos_detalle_sdts_Class+"Odd" ;
               }
            }
         }
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<tr ") ;
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_61_idx+"\">") ;
         }
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavImgsalida_Enabled!=0)&&(edtavImgsalida_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavImgsalida_Internalname,GXutil.rtrim( AV20imgSalida),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavImgsalida_Enabled!=0)&&(edtavImgsalida_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,62);\"" : " "),"'"+""+"'"+",false,"+"'"+"EVIMGSALIDA.CLICK."+sGXsfl_61_idx+"'","","",httpContext.getMessage( "Modificar", ""),"",edtavImgsalida_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWIconActionColumn","",Integer.valueOf(-1),Integer.valueOf(edtavImgsalida_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSalidasmanualesproductos_detalle_sdt_eliminar.getEnabled()!=0)&&(chkavSalidasmanualesproductos_detalle_sdt_eliminar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 63,'',false,'"+sGXsfl_61_idx+"',61)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_ELIMINAR_" + sGXsfl_61_idx ;
         chkavSalidasmanualesproductos_detalle_sdt_eliminar.setName( GXCCtl );
         chkavSalidasmanualesproductos_detalle_sdt_eliminar.setWebtags( "" );
         chkavSalidasmanualesproductos_detalle_sdt_eliminar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavSalidasmanualesproductos_detalle_sdt_eliminar.getInternalname(), "TitleCaption", chkavSalidasmanualesproductos_detalle_sdt_eliminar.getCaption(), !bGXsfl_61_Refreshing);
         chkavSalidasmanualesproductos_detalle_sdt_eliminar.setCheckedValue( "false" );
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSalidasmanualesproductos_detalle_sdt_eliminar.getInternalname(),GXutil.booltostr( AV19SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn TagColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(63, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavSalidasmanualesproductos_detalle_sdt_eliminar.getEnabled()!=0)&&(chkavSalidasmanualesproductos_detalle_sdt_eliminar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,63);\"" : " ")});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__prdnum_Internalname,GXutil.rtrim( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnum()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__prdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__prdnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__prdnom_Internalname,GXutil.rtrim( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdnom()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__prdnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__prdnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon(), (byte)(7), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Enabled!=0) ? localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon(), "Z9.9999") : localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdfaccon(), "Z9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Enabled!=0) ? localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm(), "ZZZZZZ9.9999") : localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexialm(), "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Enabled!=0) ? localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres(), "ZZZZZZ9.9999") : localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcanres(), "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Enabled!=0) ? localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant(), "ZZZZZZ9.9999") : localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcant(), "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumunidad()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Internalname,GXutil.rtrim( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconlot()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn TagColumn","",Integer.valueOf(-1),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed(), (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Enabled!=0) ? localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed(), "ZZZZZZZ9.999") : localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpremed(), "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Internalname,localUtil.format(((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs(), "99/99/99"),localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Ultfecccs(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk(), (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Enabled!=0) ? localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk(), "ZZZZZZZ9.99") : localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdvalstk(), "ZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__forprdume_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__forprdume_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprdume()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__forprdume_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__forprdume_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Internalname,GXutil.rtrim( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Forprddsc()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Internalname,GXutil.rtrim( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdcomid()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__prdlote_Internalname,GXutil.rtrim( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdlote()),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__prdlote_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__prdlote_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         if ( ( cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMUMED_" + sGXsfl_61_idx ;
            cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setName( GXCCtl );
            cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setWebtags( "" );
            cmbavSalidasmanualesproductos_detalle_sdts__cumumed.addItem("0", httpContext.getMessage( "Sin Definir", ""), (short)(0));
            cmbavSalidasmanualesproductos_detalle_sdts__cumumed.addItem("1", httpContext.getMessage( "Kilos", ""), (short)(0));
            cmbavSalidasmanualesproductos_detalle_sdts__cumumed.addItem("2", httpContext.getMessage( "Gramos", ""), (short)(0));
            cmbavSalidasmanualesproductos_detalle_sdts__cumumed.addItem("3", httpContext.getMessage( "Litros", ""), (short)(0));
            cmbavSalidasmanualesproductos_detalle_sdts__cumumed.addItem("4", httpContext.getMessage( "Mililitros", ""), (short)(0));
            if ( cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getItemCount() > 0 )
            {
               if ( ( AV33GXV2 > 0 ) && ( AV14SalidasManualesProductos_Detalle_SDTs.size() >= AV33GXV2 ) && (0==((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed()) )
               {
                  ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed( (byte)(GXutil.lval( cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getValidValue(GXutil.trim( GXutil.str( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed(), 1, 0))))) );
               }
            }
         }
         /* ComboBox */
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavSalidasmanualesproductos_detalle_sdts__cumumed,cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getInternalname(),GXutil.trim( GXutil.str( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed(), 1, 0)),Integer.valueOf(1),cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getJsonclick(),Integer.valueOf(0),"'"+""+"'"+",false,"+"'"+""+"'","int","",Integer.valueOf(0),Integer.valueOf(cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getEnabled()),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","Attribute","WWColumn","","","",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setValue( GXutil.trim( GXutil.str( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed(), 1, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getInternalname(), "Values", cmbavSalidasmanualesproductos_detalle_sdts__cumumed.ToJavascriptSource(), !bGXsfl_61_Refreshing);
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__emprcod_Internalname,GXutil.rtrim( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod()),GXutil.rtrim( localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Emprcod(), "@!")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__emprcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__emprcod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcodcont()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Enabled!=0) ? localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis(), "ZZZZZZ9.9999") : localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumconcbis(), "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro(), (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Enabled!=0) ? localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro(), "ZZZZZZ9.99") : localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumcospro(), "ZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact(), (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Enabled!=0) ? localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact(), "ZZZZZZZ9.999") : localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdpreact(), "ZZZZZZZ9.999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         Gridsalidasmanualesproductos_detalle_sdtsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc(), (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Enabled!=0) ? localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc(), "ZZZZZZ9.9999") : localUtil.format( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Prdexicc(), "ZZZZZZ9.9999"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(61),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1CP2( ) ;
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddRow(Gridsalidasmanualesproductos_detalle_sdtsRow);
         nGXsfl_61_idx = ((subGridsalidasmanualesproductos_detalle_sdts_Islastpage==1)&&(nGXsfl_61_idx+1>subgridsalidasmanualesproductos_detalle_sdts_fnc_recordsperpage( )) ? 1 : nGXsfl_61_idx+1) ;
         sGXsfl_61_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_61_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_612( ) ;
      }
      /* End function sendrow_612 */
   }

   public void startgridcontrol61( )
   {
      if ( Gridsalidasmanualesproductos_detalle_sdtsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"Gridsalidasmanualesproductos_detalle_sdtsContainer"+"DivS\" data-gxgridid=\"61\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridsalidasmanualesproductos_detalle_sdts_Internalname, subGridsalidasmanualesproductos_detalle_sdts_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
         /* Subfile titles */
         httpContext.writeText( "<tr") ;
         httpContext.writeTextNL( ">") ;
         if ( subGridsalidasmanualesproductos_detalle_sdts_Backcolorstyle == 0 )
         {
            subGridsalidasmanualesproductos_detalle_sdts_Titlebackstyle = (byte)(0) ;
            if ( GXutil.len( subGridsalidasmanualesproductos_detalle_sdts_Class) > 0 )
            {
               subGridsalidasmanualesproductos_detalle_sdts_Linesclass = subGridsalidasmanualesproductos_detalle_sdts_Class+"Title" ;
            }
         }
         else
         {
            subGridsalidasmanualesproductos_detalle_sdts_Titlebackstyle = (byte)(1) ;
            if ( subGridsalidasmanualesproductos_detalle_sdts_Backcolorstyle == 1 )
            {
               subGridsalidasmanualesproductos_detalle_sdts_Titlebackcolor = subGridsalidasmanualesproductos_detalle_sdts_Allbackcolor ;
               if ( GXutil.len( subGridsalidasmanualesproductos_detalle_sdts_Class) > 0 )
               {
                  subGridsalidasmanualesproductos_detalle_sdts_Linesclass = subGridsalidasmanualesproductos_detalle_sdts_Class+"UniformTitle" ;
               }
            }
            else
            {
               if ( GXutil.len( subGridsalidasmanualesproductos_detalle_sdts_Class) > 0 )
               {
                  subGridsalidasmanualesproductos_detalle_sdts_Linesclass = subGridsalidasmanualesproductos_detalle_sdts_Class+"Title" ;
               }
            }
         }
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Eliminar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion del Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Factor de Conversion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad Reservada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad Consumo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Medio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ultimo valor Fecha,Entradas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Unidad Medida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion Unidad Medida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto Compuesto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidad de consumo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Código Empresa", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Coste Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Actual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencia Cuarto Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("GridName", "Gridsalidasmanualesproductos_detalle_sdts");
      }
      else
      {
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("GridName", "Gridsalidasmanualesproductos_detalle_sdts");
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Header", subGridsalidasmanualesproductos_detalle_sdts_Header);
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("CmpContext", "");
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("InMasterPage", "false");
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Value", GXutil.rtrim( AV20imgSalida));
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavImgsalida_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Value", GXutil.booltostr( AV19SalidasManualesProductos_Detalle_SDT.getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Eliminar()));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__prdnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__forprdume_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__prdlote_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__emprcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         Gridsalidasmanualesproductos_detalle_sdtsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Enabled, (byte)(5), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddColumnProperties(Gridsalidasmanualesproductos_detalle_sdtsColumn);
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Allowselection, (byte)(1), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         Gridsalidasmanualesproductos_detalle_sdtsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridsalidasmanualesproductos_detalle_sdts_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavCumcodcont_Internalname = "vCUMCODCONT" ;
      edtavCumconfec_Internalname = "vCUMCONFEC" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      edtavCumccos_Internalname = "vCUMCCOS" ;
      edtavCumccosd_Internalname = "vCUMCCOSD" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divDatoscabecera_Internalname = "DATOSCABECERA" ;
      divTableattributes_Internalname = "TABLEATTRIBUTES" ;
      Dvpanel_tableattributes_Internalname = "DVPANEL_TABLEATTRIBUTES" ;
      bttBtnsalidasmanuales_agregar_Internalname = "BTNSALIDASMANUALES_AGREGAR" ;
      edtavImgsalida_Internalname = "vIMGSALIDA" ;
      chkavSalidasmanualesproductos_detalle_sdt_eliminar.setInternalname( "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_ELIMINAR" );
      edtavSalidasmanualesproductos_detalle_sdts__prdnum_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDNUM" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdnom_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDNOM" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDFACCON" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDEXIALM" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDCANRES" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCONCANT" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMUNIDAD" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCONLOT" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDPREMED" ;
      edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__ULTFECCCS" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDVALSTK" ;
      edtavSalidasmanualesproductos_detalle_sdts__forprdume_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__FORPRDUME" ;
      edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__FORPRDDSC" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDCOMID" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdlote_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDLOTE" ;
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setInternalname( "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMUMED" );
      edtavSalidasmanualesproductos_detalle_sdts__emprcod_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__EMPRCOD" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCODCONT" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCONCBIS" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMCOSPRO" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDPREACT" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Internalname = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__PRDEXICC" ;
      bttBtneliminarsalida_Internalname = "BTNELIMINARSALIDA" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      divProductos_Internalname = "PRODUCTOS" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncancel_Internalname = "BTNCANCEL" ;
      divTablecontent_Internalname = "TABLECONTENT" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Gridsalidasmanualesproductos_detalle_sdts_empowerer_Internalname = "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_EMPOWERER" ;
      divHtml_bottomauxiliarcontrols_Internalname = "HTML_BOTTOMAUXILIARCONTROLS" ;
      divLayoutmaintable_Internalname = "LAYOUTMAINTABLE" ;
      Form.setInternalname( "FORM" );
      subGridsalidasmanualesproductos_detalle_sdts_Internalname = "GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS" ;
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
      subGridsalidasmanualesproductos_detalle_sdts_Allowcollapsing = (byte)(0) ;
      subGridsalidasmanualesproductos_detalle_sdts_Allowhovering = (byte)(-1) ;
      subGridsalidasmanualesproductos_detalle_sdts_Allowselection = (byte)(1) ;
      subGridsalidasmanualesproductos_detalle_sdts_Header = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__emprcod_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__emprcod_Enabled = 0 ;
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setJsonclick( "" );
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setEnabled( 0 );
      edtavSalidasmanualesproductos_detalle_sdts__prdlote_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdlote_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__forprdume_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__forprdume_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdnom_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdnom_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdnum_Jsonclick = "" ;
      edtavSalidasmanualesproductos_detalle_sdts__prdnum_Enabled = 0 ;
      chkavSalidasmanualesproductos_detalle_sdt_eliminar.setCaption( "" );
      chkavSalidasmanualesproductos_detalle_sdt_eliminar.setVisible( -1 );
      chkavSalidasmanualesproductos_detalle_sdt_eliminar.setEnabled( 1 );
      edtavImgsalida_Jsonclick = "" ;
      edtavImgsalida_Visible = -1 ;
      edtavImgsalida_Enabled = 1 ;
      subGridsalidasmanualesproductos_detalle_sdts_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGridsalidasmanualesproductos_detalle_sdts_Backcolorstyle = (byte)(0) ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__emprcod_Enabled = -1 ;
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setEnabled( -1 );
      edtavSalidasmanualesproductos_detalle_sdts__prdlote_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__forprdume_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdnom_Enabled = -1 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdnum_Enabled = -1 ;
      edtavCumccosd_Jsonclick = "" ;
      edtavCumccosd_Enabled = 1 ;
      edtavCumccos_Jsonclick = "" ;
      edtavCumccos_Enabled = 1 ;
      edtavCumconfec_Jsonclick = "" ;
      edtavCumconfec_Enabled = 1 ;
      edtavCumcodcont_Jsonclick = "" ;
      edtavCumcodcont_Enabled = 0 ;
      Gridsalidasmanualesproductos_detalle_sdts_empowerer_Infinitescrolling = "Grid" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Productos", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Dvpanel_tableattributes_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Iconposition = "Right" ;
      Dvpanel_tableattributes_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableattributes_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableattributes_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableattributes_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableattributes_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Salidas Manuales Productos", "") );
      subGridsalidasmanualesproductos_detalle_sdts_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "SALIDASMANUALESPRODUCTOS_DETALLE_SDT_ELIMINAR_" + sGXsfl_61_idx ;
      chkavSalidasmanualesproductos_detalle_sdt_eliminar.setName( GXCCtl );
      chkavSalidasmanualesproductos_detalle_sdt_eliminar.setWebtags( "" );
      chkavSalidasmanualesproductos_detalle_sdt_eliminar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavSalidasmanualesproductos_detalle_sdt_eliminar.getInternalname(), "TitleCaption", chkavSalidasmanualesproductos_detalle_sdt_eliminar.getCaption(), !bGXsfl_61_Refreshing);
      chkavSalidasmanualesproductos_detalle_sdt_eliminar.setCheckedValue( "false" );
      GXCCtl = "SALIDASMANUALESPRODUCTOS_DETALLE_SDTS__CUMUMED_" + sGXsfl_61_idx ;
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setName( GXCCtl );
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setWebtags( "" );
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.addItem("0", httpContext.getMessage( "Sin Definir", ""), (short)(0));
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.addItem("1", httpContext.getMessage( "Kilos", ""), (short)(0));
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.addItem("2", httpContext.getMessage( "Gramos", ""), (short)(0));
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.addItem("3", httpContext.getMessage( "Litros", ""), (short)(0));
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.addItem("4", httpContext.getMessage( "Mililitros", ""), (short)(0));
      if ( cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getItemCount() > 0 )
      {
         if ( ( AV33GXV2 > 0 ) && ( AV14SalidasManualesProductos_Detalle_SDTs.size() >= AV33GXV2 ) && (0==((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed()) )
         {
            ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).setgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed( (byte)(GXutil.lval( cmbavSalidasmanualesproductos_detalle_sdts__cumumed.getValidValue(GXutil.trim( GXutil.str( ((app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT)AV14SalidasManualesProductos_Detalle_SDTs.elementAt(-1+AV33GXV2)).getgxTv_SdtSalidasManualesProductos_Detalle_SDT_Cumumed(), 1, 0))))) );
         }
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF'},{av:'subGridsalidasmanualesproductos_detalle_sdts_Rows',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'Rows'},{av:'AV23WebSessionKey_LCumCo_Ok',fld:'vWEBSESSIONKEY_LCUMCO_OK',pic:''},{av:'AV24WebSessionKey_LCumCo',fld:'vWEBSESSIONKEY_LCUMCO',pic:''},{av:'AV26WebSessionKey_LCumCo_Index',fld:'vWEBSESSIONKEY_LCUMCO_INDEX',pic:''},{av:'AV25WebSessionKey_LCumCos',fld:'vWEBSESSIONKEY_LCUMCOS',pic:''},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61},{av:'AV27WebSessionKey_LCumCo_Insert',fld:'vWEBSESSIONKEY_LCUMCO_INSERT',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV19SalidasManualesProductos_Detalle_SDT',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDT',pic:''},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61}]}");
      setEventMetadata("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS.LOAD","{handler:'e151CP2',iparms:[]");
      setEventMetadata("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS.LOAD",",oparms:[{av:'AV20imgSalida',fld:'vIMGSALIDA',pic:''}]}");
      setEventMetadata("'DOSALIDASMANUALES_AGREGAR'","{handler:'e111CP1',iparms:[]");
      setEventMetadata("'DOSALIDASMANUALES_AGREGAR'",",oparms:[]}");
      setEventMetadata("'DOELIMINARSALIDA'","{handler:'e121CP1',iparms:[]");
      setEventMetadata("'DOELIMINARSALIDA'",",oparms:[]}");
      setEventMetadata("ENTER","{handler:'e131CP2',iparms:[{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV6CumCodCont',fld:'vCUMCODCONT',pic:'ZZZZZZZ9'},{av:'AV7CumConFec',fld:'vCUMCONFEC',pic:''},{av:'AV8CumCCos',fld:'vCUMCCOS',pic:'ZZ9'}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("VIMGSALIDA.CLICK","{handler:'e161CP2',iparms:[{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF'},{av:'subGridsalidasmanualesproductos_detalle_sdts_Rows',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'Rows'},{av:'AV23WebSessionKey_LCumCo_Ok',fld:'vWEBSESSIONKEY_LCUMCO_OK',pic:''},{av:'AV24WebSessionKey_LCumCo',fld:'vWEBSESSIONKEY_LCUMCO',pic:''},{av:'AV26WebSessionKey_LCumCo_Index',fld:'vWEBSESSIONKEY_LCUMCO_INDEX',pic:''},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61},{av:'AV25WebSessionKey_LCumCos',fld:'vWEBSESSIONKEY_LCUMCOS',pic:''},{av:'AV27WebSessionKey_LCumCo_Insert',fld:'vWEBSESSIONKEY_LCUMCO_INSERT',pic:'',hsh:true},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true}]");
      setEventMetadata("VIMGSALIDA.CLICK",",oparms:[{av:'AV26WebSessionKey_LCumCo_Index',fld:'vWEBSESSIONKEY_LCUMCO_INDEX',pic:''},{av:'AV23WebSessionKey_LCumCo_Ok',fld:'vWEBSESSIONKEY_LCUMCO_OK',pic:''},{av:'AV25WebSessionKey_LCumCos',fld:'vWEBSESSIONKEY_LCUMCOS',pic:''},{av:'AV24WebSessionKey_LCumCo',fld:'vWEBSESSIONKEY_LCUMCO',pic:''},{av:'AV19SalidasManualesProductos_Detalle_SDT',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDT',pic:''},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61}]}");
      setEventMetadata("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_FIRSTPAGE","{handler:'subgridsalidasmanualesproductos_detalle_sdts_firstpage',iparms:[{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF'},{av:'subGridsalidasmanualesproductos_detalle_sdts_Rows',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'Rows'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV23WebSessionKey_LCumCo_Ok',fld:'vWEBSESSIONKEY_LCUMCO_OK',pic:''},{av:'AV24WebSessionKey_LCumCo',fld:'vWEBSESSIONKEY_LCUMCO',pic:''},{av:'AV26WebSessionKey_LCumCo_Index',fld:'vWEBSESSIONKEY_LCUMCO_INDEX',pic:''},{av:'AV25WebSessionKey_LCumCos',fld:'vWEBSESSIONKEY_LCUMCOS',pic:''},{av:'AV27WebSessionKey_LCumCo_Insert',fld:'vWEBSESSIONKEY_LCUMCO_INSERT',pic:'',hsh:true},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61}]");
      setEventMetadata("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_FIRSTPAGE",",oparms:[{av:'AV19SalidasManualesProductos_Detalle_SDT',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDT',pic:''},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61}]}");
      setEventMetadata("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_PREVPAGE","{handler:'subgridsalidasmanualesproductos_detalle_sdts_previouspage',iparms:[{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF'},{av:'subGridsalidasmanualesproductos_detalle_sdts_Rows',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'Rows'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV23WebSessionKey_LCumCo_Ok',fld:'vWEBSESSIONKEY_LCUMCO_OK',pic:''},{av:'AV24WebSessionKey_LCumCo',fld:'vWEBSESSIONKEY_LCUMCO',pic:''},{av:'AV26WebSessionKey_LCumCo_Index',fld:'vWEBSESSIONKEY_LCUMCO_INDEX',pic:''},{av:'AV25WebSessionKey_LCumCos',fld:'vWEBSESSIONKEY_LCUMCOS',pic:''},{av:'AV27WebSessionKey_LCumCo_Insert',fld:'vWEBSESSIONKEY_LCUMCO_INSERT',pic:'',hsh:true},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61}]");
      setEventMetadata("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_PREVPAGE",",oparms:[{av:'AV19SalidasManualesProductos_Detalle_SDT',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDT',pic:''},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61}]}");
      setEventMetadata("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_NEXTPAGE","{handler:'subgridsalidasmanualesproductos_detalle_sdts_nextpage',iparms:[{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF'},{av:'subGridsalidasmanualesproductos_detalle_sdts_Rows',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'Rows'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV23WebSessionKey_LCumCo_Ok',fld:'vWEBSESSIONKEY_LCUMCO_OK',pic:''},{av:'AV24WebSessionKey_LCumCo',fld:'vWEBSESSIONKEY_LCUMCO',pic:''},{av:'AV26WebSessionKey_LCumCo_Index',fld:'vWEBSESSIONKEY_LCUMCO_INDEX',pic:''},{av:'AV25WebSessionKey_LCumCos',fld:'vWEBSESSIONKEY_LCUMCOS',pic:''},{av:'AV27WebSessionKey_LCumCo_Insert',fld:'vWEBSESSIONKEY_LCUMCO_INSERT',pic:'',hsh:true},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61}]");
      setEventMetadata("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_NEXTPAGE",",oparms:[{av:'AV19SalidasManualesProductos_Detalle_SDT',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDT',pic:''},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61}]}");
      setEventMetadata("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_LASTPAGE","{handler:'subgridsalidasmanualesproductos_detalle_sdts_lastpage',iparms:[{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF'},{av:'subGridsalidasmanualesproductos_detalle_sdts_Rows',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'Rows'},{av:'Gx_mode',fld:'vMODE',pic:'@!',hsh:true},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV23WebSessionKey_LCumCo_Ok',fld:'vWEBSESSIONKEY_LCUMCO_OK',pic:''},{av:'AV24WebSessionKey_LCumCo',fld:'vWEBSESSIONKEY_LCUMCO',pic:''},{av:'AV26WebSessionKey_LCumCo_Index',fld:'vWEBSESSIONKEY_LCUMCO_INDEX',pic:''},{av:'AV25WebSessionKey_LCumCos',fld:'vWEBSESSIONKEY_LCUMCOS',pic:''},{av:'AV27WebSessionKey_LCumCo_Insert',fld:'vWEBSESSIONKEY_LCUMCO_INSERT',pic:'',hsh:true},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61}]");
      setEventMetadata("GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_LASTPAGE",",oparms:[{av:'AV19SalidasManualesProductos_Detalle_SDT',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDT',pic:''},{av:'AV14SalidasManualesProductos_Detalle_SDTs',fld:'vSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',grid:61,pic:'',hsh:true},{av:'nGXsfl_61_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:61},{av:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage'},{av:'nRC_GXsfl_61',ctrl:'GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS',prop:'GridRC',grid:61}]}");
      setEventMetadata("VALIDV_GXV14","{handler:'validv_Gxv14',iparms:[]");
      setEventMetadata("VALIDV_GXV14",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv24',iparms:[]");
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
      wcpOGx_mode = "" ;
      wcpOAV5Emprcod = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      Gx_mode = "" ;
      AV5Emprcod = "" ;
      AV23WebSessionKey_LCumCo_Ok = "" ;
      AV24WebSessionKey_LCumCo = "" ;
      AV26WebSessionKey_LCumCo_Index = "" ;
      AV14SalidasManualesProductos_Detalle_SDTs = new GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT>(app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT.class, "SalidasManualesProductos_Detalle_SDT", "TexplusNET", remoteHandle);
      AV25WebSessionKey_LCumCos = "" ;
      AV27WebSessionKey_LCumCo_Insert = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV19SalidasManualesProductos_Detalle_SDT = new app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT(remoteHandle, context);
      Gridsalidasmanualesproductos_detalle_sdts_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableattributes = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV7CumConFec = GXutil.nullDate() ;
      AV9CumCCosD = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtnsalidasmanuales_agregar_Jsonclick = "" ;
      Gridsalidasmanualesproductos_detalle_sdtsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      bttBtneliminarsalida_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncancel_Jsonclick = "" ;
      ucGridsalidasmanualesproductos_detalle_sdts_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV20imgSalida = "" ;
      GXCCtl = "" ;
      AV56Station = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      AV57Emprnom = "" ;
      GXv_char3 = new String[1] ;
      AV58Usurcod = "" ;
      GXv_char4 = new String[1] ;
      AV28WebSession = httpContext.getWebSession();
      Gridsalidasmanualesproductos_detalle_sdtsRow = new com.genexus.webpanels.GXWebRow();
      AV12Messages = new GXBaseCollection<com.genexus.SdtMessages_Message>(com.genexus.SdtMessages_Message.class, "Message", "GeneXus", remoteHandle);
      AV10SalidasManualesProductos_Cabecera = new app.stocksquimicos.SdtSalidasManualesProductos_Cabecera(remoteHandle);
      AV13Message = new com.genexus.SdtMessages_Message(remoteHandle, context);
      GXt_objcol_SdtSalidasManualesProductos_Detalle_SDT5 = new GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT>(app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT.class, "SalidasManualesProductos_Detalle_SDT", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSalidasManualesProductos_Detalle_SDT6 = new GXBaseCollection[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGridsalidasmanualesproductos_detalle_sdts_Linesclass = "" ;
      ROClassString = "" ;
      Gridsalidasmanualesproductos_detalle_sdtsColumn = new com.genexus.webpanels.GXWebColumn();
      pr_vertex = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_wp__vertex(),
         new Object[] {
         }
      );
      pr_colorservice = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_wp__colorservice(),
         new Object[] {
         }
      );
      pr_ekamat = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_wp__ekamat(),
         new Object[] {
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new app.stocksquimicos.salidasmanualesproductos_wp__default(),
         new Object[] {
         }
      );
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavImgsalida_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdnum_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdnom_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__forprdume_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdlote_Enabled = 0 ;
      cmbavSalidasmanualesproductos_detalle_sdts__cumumed.setEnabled( 0 );
      edtavSalidasmanualesproductos_detalle_sdts__emprcod_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Enabled = 0 ;
      edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Enabled = 0 ;
   }

   private byte GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGridsalidasmanualesproductos_detalle_sdts_Backcolorstyle ;
   private byte AV11CumConTipo ;
   private byte nGXWrapped ;
   private byte subGridsalidasmanualesproductos_detalle_sdts_Backstyle ;
   private byte subGridsalidasmanualesproductos_detalle_sdts_Titlebackstyle ;
   private byte subGridsalidasmanualesproductos_detalle_sdts_Allowselection ;
   private byte subGridsalidasmanualesproductos_detalle_sdts_Allowhovering ;
   private byte subGridsalidasmanualesproductos_detalle_sdts_Allowcollapsing ;
   private byte subGridsalidasmanualesproductos_detalle_sdts_Collapsed ;
   private short wbEnd ;
   private short wbStart ;
   private short AV8CumCCos ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV6CumCodCont ;
   private int nRC_GXsfl_61 ;
   private int subGridsalidasmanualesproductos_detalle_sdts_Rows ;
   private int AV6CumCodCont ;
   private int nGXsfl_61_idx=1 ;
   private int edtavCumcodcont_Enabled ;
   private int edtavCumconfec_Enabled ;
   private int edtavCumccos_Enabled ;
   private int edtavCumccosd_Enabled ;
   private int AV33GXV2 ;
   private int subGridsalidasmanualesproductos_detalle_sdts_Islastpage ;
   private int edtavImgsalida_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__prdnum_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__prdnom_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__forprdume_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__prdlote_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__emprcod_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Enabled ;
   private int edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Enabled ;
   private int GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nGridOutOfScope ;
   private int nGXsfl_61_fel_idx=1 ;
   private int AV59GXV25 ;
   private int nGXsfl_61_bak_idx=1 ;
   private int idxLst ;
   private int subGridsalidasmanualesproductos_detalle_sdts_Backcolor ;
   private int subGridsalidasmanualesproductos_detalle_sdts_Allbackcolor ;
   private int edtavImgsalida_Visible ;
   private int subGridsalidasmanualesproductos_detalle_sdts_Titlebackcolor ;
   private int subGridsalidasmanualesproductos_detalle_sdts_Selectedindex ;
   private int subGridsalidasmanualesproductos_detalle_sdts_Selectioncolor ;
   private int subGridsalidasmanualesproductos_detalle_sdts_Hoveringcolor ;
   private long GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nFirstRecordOnPage ;
   private long GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nCurrentRecord ;
   private long GRIDSALIDASMANUALESPRODUCTOS_DETALLE_SDTS_nRecordCount ;
   private String wcpOGx_mode ;
   private String wcpOAV5Emprcod ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String Gx_mode ;
   private String AV5Emprcod ;
   private String sGXsfl_61_idx="0001" ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableattributes_Width ;
   private String Dvpanel_tableattributes_Cls ;
   private String Dvpanel_tableattributes_Title ;
   private String Dvpanel_tableattributes_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Gridsalidasmanualesproductos_detalle_sdts_empowerer_Gridinternalname ;
   private String Gridsalidasmanualesproductos_detalle_sdts_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String divTablecontent_Internalname ;
   private String Dvpanel_tableattributes_Internalname ;
   private String divTableattributes_Internalname ;
   private String divDatoscabecera_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavCumcodcont_Internalname ;
   private String edtavCumcodcont_Jsonclick ;
   private String edtavCumconfec_Internalname ;
   private String TempTags ;
   private String edtavCumconfec_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavCumccos_Internalname ;
   private String edtavCumccos_Jsonclick ;
   private String edtavCumccosd_Internalname ;
   private String AV9CumCCosD ;
   private String edtavCumccosd_Jsonclick ;
   private String divProductos_Internalname ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnsalidasmanuales_agregar_Internalname ;
   private String bttBtnsalidasmanuales_agregar_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
   private String sStyleString ;
   private String subGridsalidasmanualesproductos_detalle_sdts_Internalname ;
   private String bttBtneliminarsalida_Internalname ;
   private String bttBtneliminarsalida_Jsonclick ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncancel_Internalname ;
   private String bttBtncancel_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Gridsalidasmanualesproductos_detalle_sdts_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV20imgSalida ;
   private String edtavImgsalida_Internalname ;
   private String GXCCtl ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdnum_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdnom_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__forprdume_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdlote_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__emprcod_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Internalname ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Internalname ;
   private String sGXsfl_61_fel_idx="0001" ;
   private String AV56Station ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String AV57Emprnom ;
   private String GXv_char3[] ;
   private String AV58Usurcod ;
   private String GXv_char4[] ;
   private String subGridsalidasmanualesproductos_detalle_sdts_Class ;
   private String subGridsalidasmanualesproductos_detalle_sdts_Linesclass ;
   private String ROClassString ;
   private String edtavImgsalida_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdnum_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdnom_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdfaccon_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdexialm_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdcanres_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumconcant_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumunidad_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumconlot_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdpremed_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__ultfecccs_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdvalstk_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__forprdume_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__forprddsc_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdcomid_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdlote_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__emprcod_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumcodcont_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumconcbis_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__cumcospro_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdpreact_Jsonclick ;
   private String edtavSalidasmanualesproductos_detalle_sdts__prdexicc_Jsonclick ;
   private String subGridsalidasmanualesproductos_detalle_sdts_Header ;
   private java.util.Date AV7CumConFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableattributes_Autowidth ;
   private boolean Dvpanel_tableattributes_Autoheight ;
   private boolean Dvpanel_tableattributes_Collapsible ;
   private boolean Dvpanel_tableattributes_Collapsed ;
   private boolean Dvpanel_tableattributes_Showcollapseicon ;
   private boolean Dvpanel_tableattributes_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_61_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean gx_BV61 ;
   private String AV23WebSessionKey_LCumCo_Ok ;
   private String AV24WebSessionKey_LCumCo ;
   private String AV26WebSessionKey_LCumCo_Index ;
   private String AV25WebSessionKey_LCumCos ;
   private String AV27WebSessionKey_LCumCo_Insert ;
   private com.genexus.webpanels.GXWebGrid Gridsalidasmanualesproductos_detalle_sdtsContainer ;
   private com.genexus.webpanels.GXWebRow Gridsalidasmanualesproductos_detalle_sdtsRow ;
   private com.genexus.webpanels.GXWebColumn Gridsalidasmanualesproductos_detalle_sdtsColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableattributes ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridsalidasmanualesproductos_detalle_sdts_empowerer ;
   private ICheckbox chkavSalidasmanualesproductos_detalle_sdt_eliminar ;
   private HTMLChoice cmbavSalidasmanualesproductos_detalle_sdts__cumumed ;
   private IDataStoreProvider pr_default ;
   private IDataStoreProvider pr_vertex ;
   private IDataStoreProvider pr_colorservice ;
   private IDataStoreProvider pr_ekamat ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.webpanels.WebSession AV28WebSession ;
   private GXBaseCollection<com.genexus.SdtMessages_Message> AV12Messages ;
   private GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT> AV14SalidasManualesProductos_Detalle_SDTs ;
   private GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT> GXt_objcol_SdtSalidasManualesProductos_Detalle_SDT5 ;
   private GXBaseCollection<app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT> GXv_objcol_SdtSalidasManualesProductos_Detalle_SDT6[] ;
   private com.genexus.SdtMessages_Message AV13Message ;
   private app.stocksquimicos.SdtSalidasManualesProductos_Cabecera AV10SalidasManualesProductos_Cabecera ;
   private app.stocksquimicos.SdtSalidasManualesProductos_Detalle_SDT AV19SalidasManualesProductos_Detalle_SDT ;
}

final  class salidasmanualesproductos_wp__vertex extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "VERTEX";
   }

}

final  class salidasmanualesproductos_wp__colorservice extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "COLORSERVICE";
   }

}

final  class salidasmanualesproductos_wp__ekamat extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public String getDataStoreName( )
   {
      return "EKAMAT";
   }

}

final  class salidasmanualesproductos_wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

