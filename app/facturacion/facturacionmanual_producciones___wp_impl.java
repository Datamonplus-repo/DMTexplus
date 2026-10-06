package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class facturacionmanual_producciones___wp_impl extends GXDataArea
{
   public facturacionmanual_producciones___wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public facturacionmanual_producciones___wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( facturacionmanual_producciones___wp_impl.class ));
   }

   public facturacionmanual_producciones___wp_impl( int remoteHandle ,
                                                    ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      chkavFacturacionmanual_producciones__sdt__seleccionar = UIFactory.getCheckbox(this);
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
            AV17Emprcod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
            app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Emprcod, "@!"))));
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV18CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV18CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CliCod), 6, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18CliCod), "ZZZZZ9")));
               AV19CliNom = httpContext.GetPar( "CliNom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19CliNom", AV19CliNom);
               AV20Prior = httpContext.GetPar( "Prior") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20Prior", AV20Prior);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Prior, "9"))));
               AV21Json_Documentos = httpContext.GetPar( "Json_Documentos") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21Json_Documentos", AV21Json_Documentos);
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
      nRC_GXsfl_44 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_44"))) ;
      nGXsfl_44_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_44_idx"))) ;
      sGXsfl_44_idx = httpContext.GetPar( "sGXsfl_44_idx") ;
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
      AV47Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV22FacturacionManual_Producciones__SDT);
      AV24Tot_AlbPropie = GXutil.lval( httpContext.GetPar( "Tot_AlbPropie")) ;
      AV26Tot_ALbProKgs = CommonUtil.decimalVal( httpContext.GetPar( "Tot_ALbProKgs"), ".") ;
      AV28Tot_ALbProMet = CommonUtil.decimalVal( httpContext.GetPar( "Tot_ALbProMet"), ".") ;
      AV30Tot_AlbImporte = CommonUtil.decimalVal( httpContext.GetPar( "Tot_AlbImporte"), ".") ;
      AV17Emprcod = httpContext.GetPar( "Emprcod") ;
      AV20Prior = httpContext.GetPar( "Prior") ;
      AV18CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV47Pgmname, AV22FacturacionManual_Producciones__SDT, AV24Tot_AlbPropie, AV26Tot_ALbProKgs, AV28Tot_ALbProMet, AV30Tot_AlbImporte, AV17Emprcod, AV20Prior, AV18CliCod) ;
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
      pa20B2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start20B2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.facturacionmanual_producciones___wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV18CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV19CliNom)),GXutil.URLEncode(GXutil.rtrim(AV20Prior)),GXutil.URLEncode(GXutil.rtrim(AV21Json_Documentos))}, new String[] {"Emprcod","CliCod","CliNom","Prior","Json_Documentos"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACTURACIONMANUAL_PRODUCCIONES__SDT", getSecureSignedToken( "", AV22FacturacionManual_Producciones__SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Tot_AlbPropie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROKGS", getSecureSignedToken( "", localUtil.format( AV26Tot_ALbProKgs, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROMET", getSecureSignedToken( "", localUtil.format( AV28Tot_ALbProMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBIMPORTE", getSecureSignedToken( "", localUtil.format( AV30Tot_AlbImporte, "ZZZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18CliCod), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Prior, "9"))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"FacturacionManual_Producciones___WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV47Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\facturacionmanual_producciones___wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "Facturacionmanual_producciones__sdt", AV22FacturacionManual_Producciones__SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("Facturacionmanual_producciones__sdt", AV22FacturacionManual_Producciones__SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_Facturacionmanual_producciones__sdt", getSecureSignedToken( "", AV22FacturacionManual_Producciones__SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_44", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_44, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV15GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV16GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFACTURACIONMANUAL_PRODUCCIONES__SDT", AV22FacturacionManual_Producciones__SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFACTURACIONMANUAL_PRODUCCIONES__SDT", AV22FacturacionManual_Producciones__SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACTURACIONMANUAL_PRODUCCIONES__SDT", getSecureSignedToken( "", AV22FacturacionManual_Producciones__SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_ALBPROPIE", GXutil.ltrim( localUtil.ntoc( AV24Tot_AlbPropie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Tot_AlbPropie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_ALBPROKGS", GXutil.ltrim( localUtil.ntoc( AV26Tot_ALbProKgs, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROKGS", getSecureSignedToken( "", localUtil.format( AV26Tot_ALbProKgs, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_ALBPROMET", GXutil.ltrim( localUtil.ntoc( AV28Tot_ALbProMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROMET", getSecureSignedToken( "", localUtil.format( AV28Tot_ALbProMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_ALBIMPORTE", GXutil.ltrim( localUtil.ntoc( AV30Tot_AlbImporte, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBIMPORTE", getSecureSignedToken( "", localUtil.format( AV30Tot_AlbImporte, "ZZZZZZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vJSON_DOCUMENTOS", AV21Json_Documentos);
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV17Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Emprcod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "vPRIOR", GXutil.rtrim( AV20Prior));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Prior, "9"))));
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
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         we20B2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt20B2( ) ;
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
      return formatLink("app.facturacion.facturacionmanual_producciones___wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV18CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV19CliNom)),GXutil.URLEncode(GXutil.rtrim(AV20Prior)),GXutil.URLEncode(GXutil.rtrim(AV21Json_Documentos))}, new String[] {"Emprcod","CliCod","CliNom","Prior","Json_Documentos"})  ;
   }

   public String getPgmname( )
   {
      return "Facturacion.FacturacionManual_Producciones___WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Facturacion Manual Producciones (SDT)", "") ;
   }

   public void wb20B0( )
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV18CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV18CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV18CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\FacturacionManual_Producciones___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClinom_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClinom_Internalname, httpContext.getMessage( "Nombre", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV19CliNom), GXutil.rtrim( localUtil.format( AV19CliNom, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturacionManual_Producciones___WP.htm");
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\FacturacionManual_Producciones___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 35,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnuseraction2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 44, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtnuseraction2_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION2\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_Facturacion\\FacturacionManual_Producciones___WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol44( ) ;
      }
      if ( wbEnd == 44 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_44 = (int)(nGXsfl_44_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV38GXV1 = nGXsfl_44_idx ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_55_20B2( true) ;
      }
      else
      {
         wb_table1_55_20B2( false) ;
      }
      return  ;
   }

   public void wb_table1_55_20B2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV47Pgmname), GXutil.rtrim( localUtil.format( AV47Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturacionManual_Producciones___WP.htm");
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
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 44 )
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
               AV38GXV1 = nGXsfl_44_idx ;
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

   public void start20B2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Facturacion Manual Producciones (SDT)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup20B0( ) ;
   }

   public void ws20B2( )
   {
      start20B2( ) ;
      evt20B2( ) ;
   }

   public void evt20B2( )
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
                           e1120B2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1220B2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION2'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction2' */
                           e1320B2 ();
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
                                 e1420B2 ();
                              }
                              dynload_actions( ) ;
                           }
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "'DOUSERACTION1'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           nGXsfl_44_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_442( ) ;
                           AV38GXV1 = (int)(nGXsfl_44_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV22FacturacionManual_Producciones__SDT.size() >= AV38GXV1 ) && ( AV38GXV1 > 0 ) )
                           {
                              AV22FacturacionManual_Producciones__SDT.currentItem( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)) );
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
                                 e1520B2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e1620B2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e1720B2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoUserAction1' */
                                 e1820B2 ();
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

   public void we20B2( )
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

   public void pa20B2( )
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
            GX_FocusControl = edtavTotvalue_albpropie_Internalname ;
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
      subsflControlProps_442( ) ;
      while ( nGXsfl_44_idx <= nRC_GXsfl_44 )
      {
         sendrow_442( ) ;
         nGXsfl_44_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV47Pgmname ,
                                 GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem> AV22FacturacionManual_Producciones__SDT ,
                                 long AV24Tot_AlbPropie ,
                                 java.math.BigDecimal AV26Tot_ALbProKgs ,
                                 java.math.BigDecimal AV28Tot_ALbProMet ,
                                 java.math.BigDecimal AV30Tot_AlbImporte ,
                                 String AV17Emprcod ,
                                 String AV20Prior ,
                                 int AV18CliCod )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1620B2 ();
      GRID_nCurrentRecord = 0 ;
      rf20B2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"FacturacionManual_Producciones___WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV47Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\facturacionmanual_producciones___wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf20B2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV47Pgmname = "Facturacion.FacturacionManual_Producciones___WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavFacturacionmanual_producciones__sdt__albprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albprocod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albprofch_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albproest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albproest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albproest_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albpropie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albpropie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albpropie_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albprokgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albprokgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albprokgs_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albpromet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albpromet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albpromet_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albimporte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albimporte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albimporte_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavTotvalue_albpropie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalue_albpropie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albpropie_Enabled), 5, 0), true);
      edtavTotvalue_albprokgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalue_albprokgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albprokgs_Enabled), 5, 0), true);
      edtavTotvalue_albpromet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalue_albpromet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albpromet_Enabled), 5, 0), true);
      edtavTotvalue_albimporte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalue_albimporte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albimporte_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf20B2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(44) ;
      /* Execute user event: Refresh */
      e1620B2 ();
      nGXsfl_44_idx = 1 ;
      sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_442( ) ;
      bGXsfl_44_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
      GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridContainer.setPageSize( subgrid_fnc_recordsperpage( ) );
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_442( ) ;
         e1720B2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_44_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1720B2 ();
         }
         wbEnd = (short)(44) ;
         wb20B0( ) ;
      }
      bGXsfl_44_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes20B2( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vFACTURACIONMANUAL_PRODUCCIONES__SDT", AV22FacturacionManual_Producciones__SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vFACTURACIONMANUAL_PRODUCCIONES__SDT", AV22FacturacionManual_Producciones__SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFACTURACIONMANUAL_PRODUCCIONES__SDT", getSecureSignedToken( "", AV22FacturacionManual_Producciones__SDT));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_ALBPROPIE", GXutil.ltrim( localUtil.ntoc( AV24Tot_AlbPropie, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Tot_AlbPropie), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_ALBPROKGS", GXutil.ltrim( localUtil.ntoc( AV26Tot_ALbProKgs, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROKGS", getSecureSignedToken( "", localUtil.format( AV26Tot_ALbProKgs, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_ALBPROMET", GXutil.ltrim( localUtil.ntoc( AV28Tot_ALbProMet, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROMET", getSecureSignedToken( "", localUtil.format( AV28Tot_ALbProMet, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOT_ALBIMPORTE", GXutil.ltrim( localUtil.ntoc( AV30Tot_AlbImporte, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBIMPORTE", getSecureSignedToken( "", localUtil.format( AV30Tot_AlbImporte, "ZZZZZZZZZZZ9.99")));
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
      return AV22FacturacionManual_Producciones__SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV47Pgmname, AV22FacturacionManual_Producciones__SDT, AV24Tot_AlbPropie, AV26Tot_ALbProKgs, AV28Tot_ALbProMet, AV30Tot_AlbImporte, AV17Emprcod, AV20Prior, AV18CliCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV47Pgmname, AV22FacturacionManual_Producciones__SDT, AV24Tot_AlbPropie, AV26Tot_ALbProKgs, AV28Tot_ALbProMet, AV30Tot_AlbImporte, AV17Emprcod, AV20Prior, AV18CliCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV47Pgmname, AV22FacturacionManual_Producciones__SDT, AV24Tot_AlbPropie, AV26Tot_ALbProKgs, AV28Tot_ALbProMet, AV30Tot_AlbImporte, AV17Emprcod, AV20Prior, AV18CliCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV47Pgmname, AV22FacturacionManual_Producciones__SDT, AV24Tot_AlbPropie, AV26Tot_ALbProKgs, AV28Tot_ALbProMet, AV30Tot_AlbImporte, AV17Emprcod, AV20Prior, AV18CliCod) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV47Pgmname, AV22FacturacionManual_Producciones__SDT, AV24Tot_AlbPropie, AV26Tot_ALbProKgs, AV28Tot_ALbProMet, AV30Tot_AlbImporte, AV17Emprcod, AV20Prior, AV18CliCod) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV47Pgmname = "Facturacion.FacturacionManual_Producciones___WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavFacturacionmanual_producciones__sdt__albprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albprocod_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albprofch_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albprofch_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albprofch_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albproest_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albproest_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albproest_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albpropie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albpropie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albpropie_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albprokgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albprokgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albprokgs_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albpromet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albpromet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albpromet_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavFacturacionmanual_producciones__sdt__albimporte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFacturacionmanual_producciones__sdt__albimporte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFacturacionmanual_producciones__sdt__albimporte_Enabled), 5, 0), !bGXsfl_44_Refreshing);
      edtavTotvalue_albpropie_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalue_albpropie_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albpropie_Enabled), 5, 0), true);
      edtavTotvalue_albprokgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalue_albprokgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albprokgs_Enabled), 5, 0), true);
      edtavTotvalue_albpromet_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalue_albpromet_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albpromet_Enabled), 5, 0), true);
      edtavTotvalue_albimporte_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalue_albimporte_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalue_albimporte_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup20B0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1520B2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "Facturacionmanual_producciones__sdt"), AV22FacturacionManual_Producciones__SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vFACTURACIONMANUAL_PRODUCCIONES__SDT"), AV22FacturacionManual_Producciones__SDT);
         /* Read saved values. */
         nRC_GXsfl_44 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_44"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV16GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nRC_GXsfl_44 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_44"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_44_fel_idx = 0 ;
         while ( nGXsfl_44_fel_idx < nRC_GXsfl_44 )
         {
            nGXsfl_44_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_fel_idx+1) ;
            sGXsfl_44_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_442( ) ;
            AV38GXV1 = (int)(nGXsfl_44_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV22FacturacionManual_Producciones__SDT.size() >= AV38GXV1 ) && ( AV38GXV1 > 0 ) )
            {
               AV22FacturacionManual_Producciones__SDT.currentItem( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)) );
            }
         }
         if ( nGXsfl_44_fel_idx == 0 )
         {
            nGXsfl_44_idx = 1 ;
            sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_442( ) ;
         }
         nGXsfl_44_fel_idx = 1 ;
         /* Read variables values. */
         AV25TotValue_AlbPropie = httpContext.cgiGet( edtavTotvalue_albpropie_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25TotValue_AlbPropie", AV25TotValue_AlbPropie);
         AV27TotValue_ALbProKgs = httpContext.cgiGet( edtavTotvalue_albprokgs_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27TotValue_ALbProKgs", AV27TotValue_ALbProKgs);
         AV29TotValue_ALbProMet = httpContext.cgiGet( edtavTotvalue_albpromet_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29TotValue_ALbProMet", AV29TotValue_ALbProMet);
         AV31TotValue_AlbImporte = httpContext.cgiGet( edtavTotvalue_albimporte_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV31TotValue_AlbImporte", AV31TotValue_AlbImporte);
         AV47Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"FacturacionManual_Producciones___WP");
         AV47Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47Pgmname", AV47Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV47Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\facturacionmanual_producciones___wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1520B2 ();
      if (returnInSub) return;
   }

   public void e1520B2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_objcol_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem1 = AV22FacturacionManual_Producciones__SDT ;
      GXv_objcol_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem2[0] = GXt_objcol_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem1 ;
      new app.facturacion.facturacionmanual_producciones__dp(remoteHandle, context).execute( AV17Emprcod, AV18CliCod, AV20Prior, GXv_objcol_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem2) ;
      GXt_objcol_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem1 = GXv_objcol_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem2[0] ;
      AV22FacturacionManual_Producciones__SDT = GXt_objcol_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem1 ;
      gx_BV44 = true ;
      GXt_char3 = AV33Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      facturacionmanual_producciones___wp_impl.this.GXt_char3 = GXv_char4[0] ;
      AV33Station = GXt_char3 ;
      GXv_char4[0] = AV17Emprcod ;
      GXv_char5[0] = AV34EmprNom ;
      GXv_char6[0] = AV35UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV33Station, GXv_char4, GXv_char5, GXv_char6) ;
      facturacionmanual_producciones___wp_impl.this.AV17Emprcod = GXv_char4[0] ;
      facturacionmanual_producciones___wp_impl.this.AV34EmprNom = GXv_char5[0] ;
      facturacionmanual_producciones___wp_impl.this.AV35UsurCod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Emprcod, "@!"))));
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Facturacion Manual Producciones (SDT)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1620B2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV6WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S132 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S142 ();
      if (returnInSub) return;
      AV15GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
      AV16GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void e1120B2( )
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
         AV14PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV14PageToGo) ;
      }
   }

   public void e1220B2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e1720B2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV38GXV1 = 1 ;
      while ( AV38GXV1 <= AV22FacturacionManual_Producciones__SDT.size() )
      {
         AV22FacturacionManual_Producciones__SDT.currentItem( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(44) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_442( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_44_Refreshing )
         {
            httpContext.doAjaxLoad(44, GridRow);
         }
         AV38GXV1 = (int)(AV38GXV1+1) ;
      }
   }

   public void e1320B2( )
   {
      /* 'DoUserAction2' Routine */
      returnInSub = false ;
      httpContext.setWebReturnParms(new Object[] {AV21Json_Documentos});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV21Json_Documentos"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void S142( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue(AV47Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV47Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV13Session.getValue(AV47Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV13Session.getValue(AV47Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV47Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S132( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV24Tot_AlbPropie = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24Tot_AlbPropie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Tot_AlbPropie), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Tot_AlbPropie), "ZZZ9")));
      AV26Tot_ALbProKgs = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26Tot_ALbProKgs", GXutil.ltrimstr( AV26Tot_ALbProKgs, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROKGS", getSecureSignedToken( "", localUtil.format( AV26Tot_ALbProKgs, "ZZZZZ9.99")));
      AV28Tot_ALbProMet = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28Tot_ALbProMet", GXutil.ltrimstr( AV28Tot_ALbProMet, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROMET", getSecureSignedToken( "", localUtil.format( AV28Tot_ALbProMet, "ZZZZZ9.99")));
      AV30Tot_AlbImporte = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30Tot_AlbImporte", GXutil.ltrimstr( AV30Tot_AlbImporte, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBIMPORTE", getSecureSignedToken( "", localUtil.format( AV30Tot_AlbImporte, "ZZZZZZZZZZZ9.99")));
   }

   public void S152( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV48GXV10 = 1 ;
      while ( AV48GXV10 <= AV22FacturacionManual_Producciones__SDT.size() )
      {
         AV23FacturacionManual_Producciones__SDTItem = (app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV48GXV10));
         AV24Tot_AlbPropie = (long)(AV24Tot_AlbPropie+(AV23FacturacionManual_Producciones__SDTItem.getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24Tot_AlbPropie", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24Tot_AlbPropie), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROPIE", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV24Tot_AlbPropie), "ZZZ9")));
         AV26Tot_ALbProKgs = AV26Tot_ALbProKgs.add((AV23FacturacionManual_Producciones__SDTItem.getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26Tot_ALbProKgs", GXutil.ltrimstr( AV26Tot_ALbProKgs, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROKGS", getSecureSignedToken( "", localUtil.format( AV26Tot_ALbProKgs, "ZZZZZ9.99")));
         AV28Tot_ALbProMet = AV28Tot_ALbProMet.add((AV23FacturacionManual_Producciones__SDTItem.getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV28Tot_ALbProMet", GXutil.ltrimstr( AV28Tot_ALbProMet, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBPROMET", getSecureSignedToken( "", localUtil.format( AV28Tot_ALbProMet, "ZZZZZ9.99")));
         AV30Tot_AlbImporte = AV30Tot_AlbImporte.add((AV23FacturacionManual_Producciones__SDTItem.getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte())) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30Tot_AlbImporte", GXutil.ltrimstr( AV30Tot_AlbImporte, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOT_ALBIMPORTE", getSecureSignedToken( "", localUtil.format( AV30Tot_AlbImporte, "ZZZZZZZZZZZ9.99")));
         AV48GXV10 = (int)(AV48GXV10+1) ;
      }
      AV25TotValue_AlbPropie = localUtil.format( DecimalUtil.doubleToDec(AV24Tot_AlbPropie), "ZZZ9") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25TotValue_AlbPropie", AV25TotValue_AlbPropie);
      AV27TotValue_ALbProKgs = localUtil.format( AV26Tot_ALbProKgs, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27TotValue_ALbProKgs", AV27TotValue_ALbProKgs);
      AV29TotValue_ALbProMet = localUtil.format( AV28Tot_ALbProMet, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29TotValue_ALbProMet", AV29TotValue_ALbProMet);
      AV31TotValue_AlbImporte = localUtil.format( AV30Tot_AlbImporte, "ZZZZZZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV31TotValue_AlbImporte", AV31TotValue_AlbImporte);
   }

   public void e1820B2( )
   {
      AV38GXV1 = (int)(nGXsfl_44_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV38GXV1 > 0 ) && ( AV22FacturacionManual_Producciones__SDT.size() >= AV38GXV1 ) )
      {
         AV22FacturacionManual_Producciones__SDT.currentItem( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)) );
      }
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      AV21Json_Documentos = AV22FacturacionManual_Producciones__SDT.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Json_Documentos", AV21Json_Documentos);
      httpContext.setWebReturnParms(new Object[] {AV21Json_Documentos});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV21Json_Documentos"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1420B2 ();
      if (returnInSub) return;
   }

   public void e1420B2( )
   {
      AV38GXV1 = (int)(nGXsfl_44_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV38GXV1 > 0 ) && ( AV22FacturacionManual_Producciones__SDT.size() >= AV38GXV1 ) )
      {
         AV22FacturacionManual_Producciones__SDT.currentItem( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)) );
      }
      /* Enter Routine */
      returnInSub = false ;
      AV21Json_Documentos = AV22FacturacionManual_Producciones__SDT.toJSonString(false) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Json_Documentos", AV21Json_Documentos);
      httpContext.setWebReturnParms(new Object[] {AV21Json_Documentos});
      httpContext.setWebReturnParmsMetadata(new Object[] {"AV21Json_Documentos"});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
      /*  Sending Event outputs  */
   }

   public void wb_table1_55_20B2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblGridtabletotalizer_Internalname, tblGridtabletotalizer_Internalname, "", "TableTotalizerAl", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_albpropie_Internalname, httpContext.getMessage( "Tot Value_Alb Propie", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_albpropie_Internalname, AV25TotValue_AlbPropie, GXutil.rtrim( localUtil.format( AV25TotValue_AlbPropie, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_albpropie_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_albpropie_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturacionManual_Producciones___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_albprokgs_Internalname, httpContext.getMessage( "Tot Value_ALb Pro Kgs", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_albprokgs_Internalname, AV27TotValue_ALbProKgs, GXutil.rtrim( localUtil.format( AV27TotValue_ALbProKgs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_albprokgs_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_albprokgs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturacionManual_Producciones___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_albpromet_Internalname, httpContext.getMessage( "Tot Value_ALb Pro Met", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_albpromet_Internalname, AV29TotValue_ALbProMet, GXutil.rtrim( localUtil.format( AV29TotValue_ALbProMet, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,69);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_albpromet_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_albpromet_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturacionManual_Producciones___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalue_albimporte_Internalname, httpContext.getMessage( "Tot Value_Alb Importe", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'',false,'" + sGXsfl_44_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalue_albimporte_Internalname, AV31TotValue_AlbImporte, GXutil.rtrim( localUtil.format( AV31TotValue_AlbImporte, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalue_albimporte_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalue_albimporte_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\FacturacionManual_Producciones___WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_55_20B2e( true) ;
      }
      else
      {
         wb_table1_55_20B2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV17Emprcod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV17Emprcod", AV17Emprcod);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vEMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV17Emprcod, "@!"))));
      AV18CliCod = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV18CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18CliCod), 6, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vCLICOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV18CliCod), "ZZZZZ9")));
      AV19CliNom = (String)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19CliNom", AV19CliNom);
      AV20Prior = (String)getParm(obj,3) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20Prior", AV20Prior);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPRIOR", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV20Prior, "9"))));
      AV21Json_Documentos = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21Json_Documentos", AV21Json_Documentos);
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
      pa20B2( ) ;
      ws20B2( ) ;
      we20B2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116142669", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("facturacion/facturacionmanual_producciones___wp.js", "?202682116142670", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_442( )
   {
      chkavFacturacionmanual_producciones__sdt__seleccionar.setInternalname( "FACTURACIONMANUAL_PRODUCCIONES__SDT__SELECCIONAR_"+sGXsfl_44_idx );
      edtavFacturacionmanual_producciones__sdt__albprocod_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROCOD_"+sGXsfl_44_idx ;
      edtavFacturacionmanual_producciones__sdt__albprofch_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROFCH_"+sGXsfl_44_idx ;
      edtavFacturacionmanual_producciones__sdt__albproest_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROEST_"+sGXsfl_44_idx ;
      edtavFacturacionmanual_producciones__sdt__albpropie_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROPIE_"+sGXsfl_44_idx ;
      edtavFacturacionmanual_producciones__sdt__albprokgs_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROKGS_"+sGXsfl_44_idx ;
      edtavFacturacionmanual_producciones__sdt__albpromet_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROMET_"+sGXsfl_44_idx ;
      edtavFacturacionmanual_producciones__sdt__albimporte_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBIMPORTE_"+sGXsfl_44_idx ;
   }

   public void subsflControlProps_fel_442( )
   {
      chkavFacturacionmanual_producciones__sdt__seleccionar.setInternalname( "FACTURACIONMANUAL_PRODUCCIONES__SDT__SELECCIONAR_"+sGXsfl_44_fel_idx );
      edtavFacturacionmanual_producciones__sdt__albprocod_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROCOD_"+sGXsfl_44_fel_idx ;
      edtavFacturacionmanual_producciones__sdt__albprofch_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROFCH_"+sGXsfl_44_fel_idx ;
      edtavFacturacionmanual_producciones__sdt__albproest_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROEST_"+sGXsfl_44_fel_idx ;
      edtavFacturacionmanual_producciones__sdt__albpropie_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROPIE_"+sGXsfl_44_fel_idx ;
      edtavFacturacionmanual_producciones__sdt__albprokgs_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROKGS_"+sGXsfl_44_fel_idx ;
      edtavFacturacionmanual_producciones__sdt__albpromet_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROMET_"+sGXsfl_44_fel_idx ;
      edtavFacturacionmanual_producciones__sdt__albimporte_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBIMPORTE_"+sGXsfl_44_fel_idx ;
   }

   public void sendrow_442( )
   {
      subsflControlProps_442( ) ;
      wb20B0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_44_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_44_idx) % (2))) == 0 )
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
            httpContext.writeText( " class=\""+"GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_44_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavFacturacionmanual_producciones__sdt__seleccionar.getEnabled()!=0)&&(chkavFacturacionmanual_producciones__sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'',false,'"+sGXsfl_44_idx+"',44)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "FACTURACIONMANUAL_PRODUCCIONES__SDT__SELECCIONAR_" + sGXsfl_44_idx ;
         chkavFacturacionmanual_producciones__sdt__seleccionar.setName( GXCCtl );
         chkavFacturacionmanual_producciones__sdt__seleccionar.setWebtags( "" );
         chkavFacturacionmanual_producciones__sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop("", false, chkavFacturacionmanual_producciones__sdt__seleccionar.getInternalname(), "TitleCaption", chkavFacturacionmanual_producciones__sdt__seleccionar.getCaption(), !bGXsfl_44_Refreshing);
         chkavFacturacionmanual_producciones__sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavFacturacionmanual_producciones__sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Seleccionar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn WWActionColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(45, this, 'true', 'false',"+"''"+");"+"gx.evt.onchange(this, event);\""+((chkavFacturacionmanual_producciones__sdt__seleccionar.getEnabled()!=0)&&(chkavFacturacionmanual_producciones__sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,45);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturacionmanual_producciones__sdt__albprocod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod(), (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturacionmanual_producciones__sdt__albprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod()), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprocod()), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFacturacionmanual_producciones__sdt__albprocod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFacturacionmanual_producciones__sdt__albprocod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturacionmanual_producciones__sdt__albprofch_Internalname,localUtil.format(((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch(), "99/99/99"),localUtil.format( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprofch(), "99/99/99"),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFacturacionmanual_producciones__sdt__albprofch_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFacturacionmanual_producciones__sdt__albprofch_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturacionmanual_producciones__sdt__albproest_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturacionmanual_producciones__sdt__albproest_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albproest()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFacturacionmanual_producciones__sdt__albproest_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFacturacionmanual_producciones__sdt__albproest_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturacionmanual_producciones__sdt__albpropie_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturacionmanual_producciones__sdt__albpropie_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpropie()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFacturacionmanual_producciones__sdt__albpropie_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFacturacionmanual_producciones__sdt__albpropie_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturacionmanual_producciones__sdt__albprokgs_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturacionmanual_producciones__sdt__albprokgs_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs(), "ZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albprokgs(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFacturacionmanual_producciones__sdt__albprokgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFacturacionmanual_producciones__sdt__albprokgs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturacionmanual_producciones__sdt__albpromet_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturacionmanual_producciones__sdt__albpromet_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet(), "ZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albpromet(), "ZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFacturacionmanual_producciones__sdt__albpromet_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFacturacionmanual_producciones__sdt__albpromet_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavFacturacionmanual_producciones__sdt__albimporte_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte(), (byte)(15), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavFacturacionmanual_producciones__sdt__albimporte_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte(), "ZZZZZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem)AV22FacturacionManual_Producciones__SDT.elementAt(-1+AV38GXV1)).getgxTv_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem_Albimporte(), "ZZZZZZZZZZZ9.99"))),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavFacturacionmanual_producciones__sdt__albimporte_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavFacturacionmanual_producciones__sdt__albimporte_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(15),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(44),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes20B2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_44_idx = ((subGrid_Islastpage==1)&&(nGXsfl_44_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_44_idx+1) ;
         sGXsfl_44_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_44_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_442( ) ;
      }
      /* End function sendrow_442 */
   }

   public void startgridcontrol44( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"44\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Importe", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeTextNL( "</tr>") ;
         GridContainer.AddObjectProperty("GridName", "Grid");
      }
      else
      {
         GridContainer.AddObjectProperty("GridName", "Grid");
         GridContainer.AddObjectProperty("Header", subGrid_Header);
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturacionmanual_producciones__sdt__albprocod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturacionmanual_producciones__sdt__albprofch_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturacionmanual_producciones__sdt__albproest_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturacionmanual_producciones__sdt__albpropie_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturacionmanual_producciones__sdt__albprokgs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturacionmanual_producciones__sdt__albpromet_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavFacturacionmanual_producciones__sdt__albimporte_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavClicod_Internalname = "vCLICOD" ;
      edtavClinom_Internalname = "vCLINOM" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnuseraction2_Internalname = "BTNUSERACTION2" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      chkavFacturacionmanual_producciones__sdt__seleccionar.setInternalname( "FACTURACIONMANUAL_PRODUCCIONES__SDT__SELECCIONAR" );
      edtavFacturacionmanual_producciones__sdt__albprocod_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROCOD" ;
      edtavFacturacionmanual_producciones__sdt__albprofch_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROFCH" ;
      edtavFacturacionmanual_producciones__sdt__albproest_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROEST" ;
      edtavFacturacionmanual_producciones__sdt__albpropie_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROPIE" ;
      edtavFacturacionmanual_producciones__sdt__albprokgs_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROKGS" ;
      edtavFacturacionmanual_producciones__sdt__albpromet_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBPROMET" ;
      edtavFacturacionmanual_producciones__sdt__albimporte_Internalname = "FACTURACIONMANUAL_PRODUCCIONES__SDT__ALBIMPORTE" ;
      edtavTotvalue_albpropie_Internalname = "vTOTVALUE_ALBPROPIE" ;
      edtavTotvalue_albprokgs_Internalname = "vTOTVALUE_ALBPROKGS" ;
      edtavTotvalue_albpromet_Internalname = "vTOTVALUE_ALBPROMET" ;
      edtavTotvalue_albimporte_Internalname = "vTOTVALUE_ALBIMPORTE" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
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
      edtavFacturacionmanual_producciones__sdt__albimporte_Jsonclick = "" ;
      edtavFacturacionmanual_producciones__sdt__albimporte_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albpromet_Jsonclick = "" ;
      edtavFacturacionmanual_producciones__sdt__albpromet_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albprokgs_Jsonclick = "" ;
      edtavFacturacionmanual_producciones__sdt__albprokgs_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albpropie_Jsonclick = "" ;
      edtavFacturacionmanual_producciones__sdt__albpropie_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albproest_Jsonclick = "" ;
      edtavFacturacionmanual_producciones__sdt__albproest_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albprofch_Jsonclick = "" ;
      edtavFacturacionmanual_producciones__sdt__albprofch_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albprocod_Jsonclick = "" ;
      edtavFacturacionmanual_producciones__sdt__albprocod_Enabled = 0 ;
      chkavFacturacionmanual_producciones__sdt__seleccionar.setCaption( "" );
      chkavFacturacionmanual_producciones__sdt__seleccionar.setVisible( -1 );
      chkavFacturacionmanual_producciones__sdt__seleccionar.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavTotvalue_albimporte_Jsonclick = "" ;
      edtavTotvalue_albimporte_Enabled = 1 ;
      edtavTotvalue_albpromet_Jsonclick = "" ;
      edtavTotvalue_albpromet_Enabled = 1 ;
      edtavTotvalue_albprokgs_Jsonclick = "" ;
      edtavTotvalue_albprokgs_Enabled = 1 ;
      edtavTotvalue_albpropie_Jsonclick = "" ;
      edtavTotvalue_albpropie_Enabled = 1 ;
      edtavFacturacionmanual_producciones__sdt__albimporte_Enabled = -1 ;
      edtavFacturacionmanual_producciones__sdt__albpromet_Enabled = -1 ;
      edtavFacturacionmanual_producciones__sdt__albprokgs_Enabled = -1 ;
      edtavFacturacionmanual_producciones__sdt__albpropie_Enabled = -1 ;
      edtavFacturacionmanual_producciones__sdt__albproest_Enabled = -1 ;
      edtavFacturacionmanual_producciones__sdt__albprofch_Enabled = -1 ;
      edtavFacturacionmanual_producciones__sdt__albprocod_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 0 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
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
      Form.setCaption( httpContext.getMessage( "Facturacion Manual Producciones (SDT)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "FACTURACIONMANUAL_PRODUCCIONES__SDT__SELECCIONAR_" + sGXsfl_44_idx ;
      chkavFacturacionmanual_producciones__sdt__seleccionar.setName( GXCCtl );
      chkavFacturacionmanual_producciones__sdt__seleccionar.setWebtags( "" );
      chkavFacturacionmanual_producciones__sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop("", false, chkavFacturacionmanual_producciones__sdt__seleccionar.getInternalname(), "TitleCaption", chkavFacturacionmanual_producciones__sdt__seleccionar.getCaption(), !bGXsfl_44_Refreshing);
      chkavFacturacionmanual_producciones__sdt__seleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22FacturacionManual_Producciones__SDT',fld:'vFACTURACIONMANUAL_PRODUCCIONES__SDT',grid:44,pic:'',hsh:true},{av:'nGXsfl_44_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:44},{av:'nRC_GXsfl_44',ctrl:'GRID',prop:'GridRC',grid:44},{av:'AV24Tot_AlbPropie',fld:'vTOT_ALBPROPIE',pic:'ZZZ9',hsh:true},{av:'AV26Tot_ALbProKgs',fld:'vTOT_ALBPROKGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV28Tot_ALbProMet',fld:'vTOT_ALBPROMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV30Tot_AlbImporte',fld:'vTOT_ALBIMPORTE',pic:'ZZZZZZZZZZZ9.99',hsh:true},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV20Prior',fld:'vPRIOR',pic:'9',hsh:true},{av:'AV18CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV24Tot_AlbPropie',fld:'vTOT_ALBPROPIE',pic:'ZZZ9',hsh:true},{av:'AV26Tot_ALbProKgs',fld:'vTOT_ALBPROKGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV28Tot_ALbProMet',fld:'vTOT_ALBPROMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV30Tot_AlbImporte',fld:'vTOT_ALBIMPORTE',pic:'ZZZZZZZZZZZ9.99',hsh:true},{av:'AV25TotValue_AlbPropie',fld:'vTOTVALUE_ALBPROPIE',pic:''},{av:'AV27TotValue_ALbProKgs',fld:'vTOTVALUE_ALBPROKGS',pic:''},{av:'AV29TotValue_ALbProMet',fld:'vTOTVALUE_ALBPROMET',pic:''},{av:'AV31TotValue_AlbImporte',fld:'vTOTVALUE_ALBIMPORTE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1120B2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22FacturacionManual_Producciones__SDT',fld:'vFACTURACIONMANUAL_PRODUCCIONES__SDT',grid:44,pic:'',hsh:true},{av:'nGXsfl_44_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:44},{av:'nRC_GXsfl_44',ctrl:'GRID',prop:'GridRC',grid:44},{av:'AV24Tot_AlbPropie',fld:'vTOT_ALBPROPIE',pic:'ZZZ9',hsh:true},{av:'AV26Tot_ALbProKgs',fld:'vTOT_ALBPROKGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV28Tot_ALbProMet',fld:'vTOT_ALBPROMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV30Tot_AlbImporte',fld:'vTOT_ALBIMPORTE',pic:'ZZZZZZZZZZZ9.99',hsh:true},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV20Prior',fld:'vPRIOR',pic:'9',hsh:true},{av:'AV18CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1220B2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV47Pgmname',fld:'vPGMNAME',pic:''},{av:'AV22FacturacionManual_Producciones__SDT',fld:'vFACTURACIONMANUAL_PRODUCCIONES__SDT',grid:44,pic:'',hsh:true},{av:'nGXsfl_44_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:44},{av:'nRC_GXsfl_44',ctrl:'GRID',prop:'GridRC',grid:44},{av:'AV24Tot_AlbPropie',fld:'vTOT_ALBPROPIE',pic:'ZZZ9',hsh:true},{av:'AV26Tot_ALbProKgs',fld:'vTOT_ALBPROKGS',pic:'ZZZZZ9.99',hsh:true},{av:'AV28Tot_ALbProMet',fld:'vTOT_ALBPROMET',pic:'ZZZZZ9.99',hsh:true},{av:'AV30Tot_AlbImporte',fld:'vTOT_ALBIMPORTE',pic:'ZZZZZZZZZZZ9.99',hsh:true},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!',hsh:true},{av:'AV20Prior',fld:'vPRIOR',pic:'9',hsh:true},{av:'AV18CliCod',fld:'vCLICOD',pic:'ZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e1720B2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOUSERACTION2'","{handler:'e1320B2',iparms:[{av:'AV21Json_Documentos',fld:'vJSON_DOCUMENTOS',pic:''}]");
      setEventMetadata("'DOUSERACTION2'",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e1820B2',iparms:[{av:'AV22FacturacionManual_Producciones__SDT',fld:'vFACTURACIONMANUAL_PRODUCCIONES__SDT',grid:44,pic:'',hsh:true},{av:'nGXsfl_44_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:44},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_44',ctrl:'GRID',prop:'GridRC',grid:44}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV21Json_Documentos',fld:'vJSON_DOCUMENTOS',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e1420B2',iparms:[{av:'AV22FacturacionManual_Producciones__SDT',fld:'vFACTURACIONMANUAL_PRODUCCIONES__SDT',grid:44,pic:'',hsh:true},{av:'nGXsfl_44_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:44},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_44',ctrl:'GRID',prop:'GridRC',grid:44}]");
      setEventMetadata("ENTER",",oparms:[{av:'AV21Json_Documentos',fld:'vJSON_DOCUMENTOS',pic:''}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv9',iparms:[]");
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
      wcpOAV17Emprcod = "" ;
      wcpOAV19CliNom = "" ;
      wcpOAV20Prior = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV17Emprcod = "" ;
      AV19CliNom = "" ;
      AV20Prior = "" ;
      AV21Json_Documentos = "" ;
      AV47Pgmname = "" ;
      AV22FacturacionManual_Producciones__SDT = new GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem>(app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem.class, "FacturacionManual_Producciones__SDTItem", "TexplusNET", remoteHandle);
      AV26Tot_ALbProKgs = DecimalUtil.ZERO ;
      AV28Tot_ALbProMet = DecimalUtil.ZERO ;
      AV30Tot_AlbImporte = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnuseraction2_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV25TotValue_AlbPropie = "" ;
      AV27TotValue_ALbProKgs = "" ;
      AV29TotValue_ALbProMet = "" ;
      AV31TotValue_AlbImporte = "" ;
      hsh = "" ;
      GXt_objcol_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem1 = new GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem>(app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem.class, "FacturacionManual_Producciones__SDTItem", "TexplusNET", remoteHandle);
      GXv_objcol_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem2 = new GXBaseCollection[1] ;
      AV33Station = "" ;
      GXt_char3 = "" ;
      GXv_char4 = new String[1] ;
      AV34EmprNom = "" ;
      GXv_char5 = new String[1] ;
      AV35UsurCod = "" ;
      GXv_char6 = new String[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV13Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23FacturacionManual_Producciones__SDTItem = new app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem(remoteHandle, context);
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV47Pgmname = "Facturacion.FacturacionManual_Producciones___WP" ;
      /* GeneXus formulas. */
      AV47Pgmname = "Facturacion.FacturacionManual_Producciones___WP" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albprocod_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albprofch_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albproest_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albpropie_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albprokgs_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albpromet_Enabled = 0 ;
      edtavFacturacionmanual_producciones__sdt__albimporte_Enabled = 0 ;
      edtavTotvalue_albpropie_Enabled = 0 ;
      edtavTotvalue_albprokgs_Enabled = 0 ;
      edtavTotvalue_albpromet_Enabled = 0 ;
      edtavTotvalue_albimporte_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte nGXWrapped ;
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
   private int wcpOAV18CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_44 ;
   private int AV18CliCod ;
   private int nGXsfl_44_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int AV38GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavFacturacionmanual_producciones__sdt__albprocod_Enabled ;
   private int edtavFacturacionmanual_producciones__sdt__albprofch_Enabled ;
   private int edtavFacturacionmanual_producciones__sdt__albproest_Enabled ;
   private int edtavFacturacionmanual_producciones__sdt__albpropie_Enabled ;
   private int edtavFacturacionmanual_producciones__sdt__albprokgs_Enabled ;
   private int edtavFacturacionmanual_producciones__sdt__albpromet_Enabled ;
   private int edtavFacturacionmanual_producciones__sdt__albimporte_Enabled ;
   private int edtavTotvalue_albpropie_Enabled ;
   private int edtavTotvalue_albprokgs_Enabled ;
   private int edtavTotvalue_albpromet_Enabled ;
   private int edtavTotvalue_albimporte_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_44_fel_idx=1 ;
   private int AV14PageToGo ;
   private int AV48GXV10 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV24Tot_AlbPropie ;
   private long AV15GridCurrentPage ;
   private long AV16GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV26Tot_ALbProKgs ;
   private java.math.BigDecimal AV28Tot_ALbProMet ;
   private java.math.BigDecimal AV30Tot_AlbImporte ;
   private String wcpOAV17Emprcod ;
   private String wcpOAV19CliNom ;
   private String wcpOAV20Prior ;
   private String Gridpaginationbar_Selectedpage ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV17Emprcod ;
   private String AV19CliNom ;
   private String AV20Prior ;
   private String sGXsfl_44_idx="0001" ;
   private String AV47Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavClicod_Internalname ;
   private String edtavClicod_Jsonclick ;
   private String edtavClinom_Internalname ;
   private String edtavClinom_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnuseraction2_Internalname ;
   private String bttBtnuseraction2_Jsonclick ;
   private String divUnnamedtable2_Internalname ;
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
   private String edtavTotvalue_albpropie_Internalname ;
   private String edtavFacturacionmanual_producciones__sdt__albprocod_Internalname ;
   private String edtavFacturacionmanual_producciones__sdt__albprofch_Internalname ;
   private String edtavFacturacionmanual_producciones__sdt__albproest_Internalname ;
   private String edtavFacturacionmanual_producciones__sdt__albpropie_Internalname ;
   private String edtavFacturacionmanual_producciones__sdt__albprokgs_Internalname ;
   private String edtavFacturacionmanual_producciones__sdt__albpromet_Internalname ;
   private String edtavFacturacionmanual_producciones__sdt__albimporte_Internalname ;
   private String edtavTotvalue_albprokgs_Internalname ;
   private String edtavTotvalue_albpromet_Internalname ;
   private String edtavTotvalue_albimporte_Internalname ;
   private String sGXsfl_44_fel_idx="0001" ;
   private String hsh ;
   private String AV33Station ;
   private String GXt_char3 ;
   private String GXv_char4[] ;
   private String AV34EmprNom ;
   private String GXv_char5[] ;
   private String AV35UsurCod ;
   private String GXv_char6[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalue_albpropie_Jsonclick ;
   private String edtavTotvalue_albprokgs_Jsonclick ;
   private String edtavTotvalue_albpromet_Jsonclick ;
   private String edtavTotvalue_albimporte_Jsonclick ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavFacturacionmanual_producciones__sdt__albprocod_Jsonclick ;
   private String edtavFacturacionmanual_producciones__sdt__albprofch_Jsonclick ;
   private String edtavFacturacionmanual_producciones__sdt__albproest_Jsonclick ;
   private String edtavFacturacionmanual_producciones__sdt__albpropie_Jsonclick ;
   private String edtavFacturacionmanual_producciones__sdt__albprokgs_Jsonclick ;
   private String edtavFacturacionmanual_producciones__sdt__albpromet_Jsonclick ;
   private String edtavFacturacionmanual_producciones__sdt__albimporte_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_44_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV44 ;
   private boolean gx_refresh_fired ;
   private String AV21Json_Documentos ;
   private String AV25TotValue_AlbPropie ;
   private String AV27TotValue_ALbProKgs ;
   private String AV29TotValue_ALbProMet ;
   private String AV31TotValue_AlbImporte ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavFacturacionmanual_producciones__sdt__seleccionar ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem> AV22FacturacionManual_Producciones__SDT ;
   private GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem> GXt_objcol_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem1 ;
   private GXBaseCollection<app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem> GXv_objcol_SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem2[] ;
   private app.facturacion.SdtFacturacionManual_Producciones__SDT_FacturacionManual_Producciones__SDTItem AV23FacturacionManual_Producciones__SDTItem ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

