package app.facturacion ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class confirmacionpreciodocumento_producciones_wc_impl extends GXWebComponent
{
   public confirmacionpreciodocumento_producciones_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public confirmacionpreciodocumento_producciones_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( confirmacionpreciodocumento_producciones_wc_impl.class ));
   }

   public confirmacionpreciodocumento_producciones_wc_impl( int remoteHandle ,
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
      cmbavGridactiongroup1 = new HTMLChoice();
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion = UIFactory.getCheckbox(this);
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
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
               AV18Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
               AV19AlbProCod = GXutil.lval( httpContext.GetPar( "AlbProCod")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProCod), 10, 0));
               AV24GuiRemCli = (int)(GXutil.lval( httpContext.GetPar( "GuiRemCli"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GuiRemCli), 6, 0));
               AV25GuiRemCln = httpContext.GetPar( "GuiRemCln") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25GuiRemCln", AV25GuiRemCln);
               AV41AlbEnvFtp = (byte)(GXutil.lval( httpContext.GetPar( "AlbEnvFtp"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41AlbEnvFtp", GXutil.str( AV41AlbEnvFtp, 1, 0));
               AV42AlbLic = httpContext.GetPar( "AlbLic") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42AlbLic", AV42AlbLic);
               AV45AlbProEst = (byte)(GXutil.lval( httpContext.GetPar( "AlbProEst"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45AlbProEst", GXutil.str( AV45AlbProEst, 1, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV18Emprcod,Long.valueOf(AV19AlbProCod),Integer.valueOf(AV24GuiRemCli),AV25GuiRemCln,Byte.valueOf(AV41AlbEnvFtp),AV42AlbLic,Byte.valueOf(AV45AlbProEst)});
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
      nRC_GXsfl_47 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_47"))) ;
      nGXsfl_47_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_47_idx"))) ;
      sGXsfl_47_idx = httpContext.GetPar( "sGXsfl_47_idx") ;
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
      AV70Pgmname = httpContext.GetPar( "Pgmname") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV12ConfirmacionPrecioDocumento_Producciones_SDT);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV70Pgmname, AV12ConfirmacionPrecioDocumento_Producciones_SDT, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa22E2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Confirmacion Precio Documento Producciones", "")) ;
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
      if ( GXutil.len( sPrefix) == 0 )
      {
         httpContext.closeHtmlHeader();
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
         FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
         httpContext.writeText( "<body ") ;
         bodyStyle = "" ;
         if ( nGXWrapped == 0 )
         {
            bodyStyle += "-moz-opacity:0;opacity:0;" ;
         }
         httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
         httpContext.writeText( FormProcess+">") ;
         httpContext.skipLines( 1 );
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.facturacion.confirmacionpreciodocumento_producciones_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV18Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV19AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV24GuiRemCli,6,0)),GXutil.URLEncode(GXutil.rtrim(AV25GuiRemCln)),GXutil.URLEncode(GXutil.ltrimstr(AV41AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV42AlbLic)),GXutil.URLEncode(GXutil.ltrimstr(AV45AlbProEst,1,0))}, new String[] {"Emprcod","AlbProCod","GuiRemCli","GuiRemCln","AlbEnvFtp","AlbLic","AlbProEst"}) +"\">") ;
         app.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
         app.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
         httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:block;height:0;border:0;padding:0\" disabled>") ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, "FORM", "Class", "form-horizontal Form", true);
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
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConfirmacionPrecioDocumento_Producciones_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV70Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\confirmacionpreciodocumento_producciones_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Confirmacionpreciodocumento_producciones_sdt", AV12ConfirmacionPrecioDocumento_Producciones_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Confirmacionpreciodocumento_producciones_sdt", AV12ConfirmacionPrecioDocumento_Producciones_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_47", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_47, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV15GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV16GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18Emprcod", GXutil.rtrim( wcpOAV18Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV19AlbProCod", GXutil.ltrim( localUtil.ntoc( wcpOAV19AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24GuiRemCli", GXutil.ltrim( localUtil.ntoc( wcpOAV24GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25GuiRemCln", GXutil.rtrim( wcpOAV25GuiRemCln));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV41AlbEnvFtp", GXutil.ltrim( localUtil.ntoc( wcpOAV41AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV42AlbLic", GXutil.rtrim( wcpOAV42AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV45AlbProEst", GXutil.ltrim( localUtil.ntoc( wcpOAV45AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT", AV12ConfirmacionPrecioDocumento_Producciones_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT", AV12ConfirmacionPrecioDocumento_Producciones_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV18Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBENVFTP", GXutil.ltrim( localUtil.ntoc( AV41AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBLIC", GXutil.rtrim( AV42AlbLic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBPROEST", GXutil.ltrim( localUtil.ntoc( AV45AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBIMPMAN", GXutil.ltrim( localUtil.ntoc( AV28AlbImpMan, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vITEM_SDT", AV27Item_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vITEM_SDT", AV27Item_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGXV25", GXutil.ltrim( localUtil.ntoc( AV73GXV25, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLINEAS", GXutil.ltrim( localUtil.ntoc( AV39lineas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGXV23", GXutil.ltrim( localUtil.ntoc( AV71GXV23, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Width", GXutil.rtrim( Dvpanel_tableheader_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autowidth", GXutil.booltostr( Dvpanel_tableheader_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoheight", GXutil.booltostr( Dvpanel_tableheader_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Cls", GXutil.rtrim( Dvpanel_tableheader_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Title", GXutil.rtrim( Dvpanel_tableheader_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsible", GXutil.booltostr( Dvpanel_tableheader_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Collapsed", GXutil.booltostr( Dvpanel_tableheader_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon", GXutil.booltostr( Dvpanel_tableheader_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Iconposition", GXutil.rtrim( Dvpanel_tableheader_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_TABLEHEADER_Autoscroll", GXutil.booltostr( Dvpanel_tableheader_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_FASES_Title", GXutil.rtrim( Dvelop_confirmpanel_fases_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_FASES_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_fases_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_FASES_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_fases_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_FASES_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_fases_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_FASES_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_fases_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_FASES_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_fases_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_FASES_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_fases_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmarprecios_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmarprecios_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmarprecios_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmarprecios_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmarprecios_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmarprecios_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmarprecios_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btndocumentosinconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btndocumentosinconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btndocumentosinconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btndocumentosinconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btndocumentosinconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btndocumentosinconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btndocumentosinconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_FASES_Result", GXutil.rtrim( Dvelop_confirmpanel_fases_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmarprecios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btndocumentosinconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_FASES_Result", GXutil.rtrim( Dvelop_confirmpanel_fases_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmarprecios_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btndocumentosinconfirmar_Result));
   }

   public void renderHtmlCloseForm22E2( )
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
         httpContext.writeTextNL( "</form>") ;
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
      return "Facturacion.ConfirmacionPrecioDocumento_Producciones_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Confirmacion Precio Documento Producciones", "") ;
   }

   public void wb22E0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.facturacion.confirmacionpreciodocumento_producciones_wc");
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
         ucDvpanel_tableheader.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_tableheader_Internalname, sPrefix+"DVPANEL_TABLEHEADERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_TABLEHEADERContainer"+"TableHeader"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbprocod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbprocod_Internalname, httpContext.getMessage( "Nº Documento", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbprocod_Internalname, GXutil.ltrim( localUtil.ntoc( AV19AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbprocod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV19AlbProCod), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV19AlbProCod), "ZZZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbprocod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbprocod_Enabled, 0, "text", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcli_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcli_Internalname, httpContext.getMessage( "Cliente", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcli_Internalname, GXutil.ltrim( localUtil.ntoc( AV24GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavGuiremcli_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24GuiRemCli), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24GuiRemCli), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcli_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcli_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-7 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavGuiremcln_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavGuiremcln_Internalname, httpContext.getMessage( "Nombre", ""), " AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavGuiremcln_Internalname, GXutil.rtrim( AV25GuiRemCln), GXutil.rtrim( localUtil.format( AV25GuiRemCln, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavGuiremcln_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavGuiremcln_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones_WC.htm");
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
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmarprecios_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar Precios", ""), bttBtnconfirmarprecios_Jsonclick, 7, httpContext.getMessage( "Confirmar Precios", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1122e1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 38,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtndocumentosinconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 47, 2, 0)+","+"null"+");", httpContext.getMessage( "Documento sin Confirmar", ""), bttBtndocumentosinconfirmar_Jsonclick, 7, httpContext.getMessage( "Documento sin Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1222e1_client"+"'", TempTags, "", 2, "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones_WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol47( ) ;
      }
      if ( wbEnd == 47 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_47 = (int)(nGXsfl_47_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            AV48GXV1 = nGXsfl_47_idx ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV15GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV16GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV70Pgmname), GXutil.rtrim( localUtil.format( AV70Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_Facturacion\\ConfirmacionPrecioDocumento_Producciones_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDatamonjs.render(context, "datamonjs", Datamonjs_Internalname, sPrefix+"DATAMONJSContainer");
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
         wb_table1_83_22E2( true) ;
      }
      else
      {
         wb_table1_83_22E2( false) ;
      }
      return  ;
   }

   public void wb_table1_83_22E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table2_88_22E2( true) ;
      }
      else
      {
         wb_table2_88_22E2( false) ;
      }
      return  ;
   }

   public void wb_table2_88_22E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_93_22E2( true) ;
      }
      else
      {
         wb_table3_93_22E2( false) ;
      }
      return  ;
   }

   public void wb_table3_93_22E2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 47 )
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
               AV48GXV1 = nGXsfl_47_idx ;
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

   public void start22E2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Confirmacion Precio Documento Producciones", ""), (short)(0)) ;
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
            strup22E0( ) ;
         }
      }
   }

   public void ws22E2( )
   {
      start22E2( ) ;
      evt22E2( ) ;
   }

   public void evt22E2( )
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
                              strup22E0( ) ;
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
                              strup22E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1322E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1422E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_FASES.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1522E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1622E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1722E2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22E0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup22E0( ) ;
                           }
                           nGXsfl_47_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_472( ) ;
                           AV48GXV1 = (int)(nGXsfl_47_idx+GRID_nFirstRecordOnPage) ;
                           if ( ( AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() >= AV48GXV1 ) && ( AV48GXV1 > 0 ) )
                           {
                              AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)) );
                              cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                              cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                              AV40GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridActionGroup1), 4, 0));
                           }
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1822E2 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1922E2 ();
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
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2022E2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2122E2 ();
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
                                    strup22E0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = cmbavGridactiongroup1.getInternalname() ;
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

   public void we22E2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm22E2( ) ;
         }
      }
   }

   public void pa22E2( )
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
      subsflControlProps_472( ) ;
      while ( nGXsfl_47_idx <= nRC_GXsfl_47 )
      {
         sendrow_472( ) ;
         nGXsfl_47_idx = ((subGrid_Islastpage==1)&&(nGXsfl_47_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV70Pgmname ,
                                 GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item> AV12ConfirmacionPrecioDocumento_Producciones_SDT ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1922E2 ();
      GRID_nCurrentRecord = 0 ;
      rf22E2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConfirmacionPrecioDocumento_Producciones_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV70Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("facturacion\\confirmacionpreciodocumento_producciones_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf22E2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV70Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavGuiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      edtavGuiremcln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGuiremcln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcln_Enabled), 5, 0), true);
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barser_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf22E2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(47) ;
      /* Execute user event: Refresh */
      e1922E2 ();
      nGXsfl_47_idx = 1 ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_472( ) ;
      bGXsfl_47_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_472( ) ;
         e2022E2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_47_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e2022E2 ();
         }
         wbEnd = (short)(47) ;
         wb22E0( ) ;
      }
      bGXsfl_47_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes22E2( )
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
      return AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70Pgmname, AV12ConfirmacionPrecioDocumento_Producciones_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70Pgmname, AV12ConfirmacionPrecioDocumento_Producciones_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70Pgmname, AV12ConfirmacionPrecioDocumento_Producciones_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70Pgmname, AV12ConfirmacionPrecioDocumento_Producciones_SDT, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV70Pgmname, AV12ConfirmacionPrecioDocumento_Producciones_SDT, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV70Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavAlbprocod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbprocod_Enabled), 5, 0), true);
      edtavGuiremcli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGuiremcli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcli_Enabled), 5, 0), true);
      edtavGuiremcln_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavGuiremcln_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavGuiremcln_Enabled), 5, 0), true);
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barser_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barser_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Enabled), 5, 0), !bGXsfl_47_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup22E0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1822E2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Confirmacionpreciodocumento_producciones_sdt"), AV12ConfirmacionPrecioDocumento_Producciones_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT"), AV12ConfirmacionPrecioDocumento_Producciones_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vITEM_SDT"), AV27Item_SDT);
         /* Read saved values. */
         nRC_GXsfl_47 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_47"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV15GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV16GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV18Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV18Emprcod") ;
         wcpOAV19AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV19AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV24GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV25GuiRemCln = httpContext.cgiGet( sPrefix+"wcpOAV25GuiRemCln") ;
         wcpOAV41AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV42AlbLic = httpContext.cgiGet( sPrefix+"wcpOAV42AlbLic") ;
         wcpOAV45AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV73GXV25 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vGXV25"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39lineas = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vLINEAS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV71GXV23 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vGXV23"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Dvpanel_tableheader_Width = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Width") ;
         Dvpanel_tableheader_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autowidth")) ;
         Dvpanel_tableheader_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoheight")) ;
         Dvpanel_tableheader_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Cls") ;
         Dvpanel_tableheader_Title = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Title") ;
         Dvpanel_tableheader_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsible")) ;
         Dvpanel_tableheader_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Collapsed")) ;
         Dvpanel_tableheader_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Showcollapseicon")) ;
         Dvpanel_tableheader_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Iconposition") ;
         Dvpanel_tableheader_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_TABLEHEADER_Autoscroll")) ;
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
         Dvelop_confirmpanel_fases_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_FASES_Title") ;
         Dvelop_confirmpanel_fases_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_FASES_Confirmationtext") ;
         Dvelop_confirmpanel_fases_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_FASES_Yesbuttoncaption") ;
         Dvelop_confirmpanel_fases_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_FASES_Nobuttoncaption") ;
         Dvelop_confirmpanel_fases_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_FASES_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_fases_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_FASES_Yesbuttonposition") ;
         Dvelop_confirmpanel_fases_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_FASES_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmarprecios_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Title") ;
         Dvelop_confirmpanel_btnconfirmarprecios_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmarprecios_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmarprecios_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmarprecios_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmarprecios_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmarprecios_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Confirmtype") ;
         Dvelop_confirmpanel_btndocumentosinconfirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btndocumentosinconfirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btndocumentosinconfirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btndocumentosinconfirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btndocumentosinconfirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btndocumentosinconfirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btndocumentosinconfirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Dvelop_confirmpanel_fases_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_FASES_Result") ;
         Dvelop_confirmpanel_btnconfirmarprecios_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS_Result") ;
         Dvelop_confirmpanel_btndocumentosinconfirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR_Result") ;
         nRC_GXsfl_47 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_47"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_47_fel_idx = 0 ;
         while ( nGXsfl_47_fel_idx < nRC_GXsfl_47 )
         {
            nGXsfl_47_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_47_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_47_fel_idx+1) ;
            sGXsfl_47_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_472( ) ;
            AV48GXV1 = (int)(nGXsfl_47_fel_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() >= AV48GXV1 ) && ( AV48GXV1 > 0 ) )
            {
               AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)) );
               cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
               cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
               AV40GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
            }
         }
         if ( nGXsfl_47_fel_idx == 0 )
         {
            nGXsfl_47_idx = 1 ;
            sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_472( ) ;
         }
         nGXsfl_47_fel_idx = 1 ;
         /* Read variables values. */
         AV70Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_47_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
         AV48GXV1 = (int)(nGXsfl_47_idx+GRID_nFirstRecordOnPage) ;
         if ( nGXsfl_47_idx > 0 )
         {
            AV48GXV1 = (int)(nGXsfl_47_idx+GRID_nFirstRecordOnPage) ;
            if ( ( AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() >= AV48GXV1 ) && ( AV48GXV1 > 0 ) )
            {
               AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)) );
               cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
               cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
               AV40GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridActionGroup1), 4, 0));
            }
            if ( ( AV48GXV1 > 0 ) && ( AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() >= AV48GXV1 ) )
            {
               AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)) );
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ConfirmacionPrecioDocumento_Producciones_WC");
         AV70Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70Pgmname", AV70Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV70Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("facturacion\\confirmacionpreciodocumento_producciones_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1822E2 ();
      if (returnInSub) return;
   }

   public void e1822E2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV21Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      confirmacionpreciodocumento_producciones_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV21Station = GXt_char1 ;
      GXv_char2[0] = AV18Emprcod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char4[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char2, GXv_char3, GXv_char4) ;
      confirmacionpreciodocumento_producciones_wc_impl.this.AV18Emprcod = GXv_char2[0] ;
      confirmacionpreciodocumento_producciones_wc_impl.this.AV22EmprNom = GXv_char3[0] ;
      confirmacionpreciodocumento_producciones_wc_impl.this.AV23UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
      GXt_int5 = (byte)(AV20FlagTxt) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV18Emprcod, httpContext.getMessage( "ALBTXT", ""), GXv_int6) ;
      confirmacionpreciodocumento_producciones_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV20FlagTxt = GXt_int5 ;
      GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 = AV12ConfirmacionPrecioDocumento_Producciones_SDT ;
      GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8[0] = GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 ;
      new app.facturacion.confirmacionpreciodocumento_producciones_dp(remoteHandle, context).execute( AV18Emprcod, AV19AlbProCod, GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8) ;
      GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 = GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8[0] ;
      AV12ConfirmacionPrecioDocumento_Producciones_SDT = GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 ;
      gx_BV47 = true ;
      AV12ConfirmacionPrecioDocumento_Producciones_SDT.sort(httpContext.getMessage( "Barcod,Barcodreo,Barcodpar,GuiFaslin", ""));
      gx_BV47 = true ;
      GXt_char1 = AV21Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      confirmacionpreciodocumento_producciones_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV21Station = GXt_char1 ;
      GXv_char4[0] = AV18Emprcod ;
      GXv_char3[0] = AV22EmprNom ;
      GXv_char2[0] = AV23UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV21Station, GXv_char4, GXv_char3, GXv_char2) ;
      confirmacionpreciodocumento_producciones_wc_impl.this.AV18Emprcod = GXv_char4[0] ;
      confirmacionpreciodocumento_producciones_wc_impl.this.AV22EmprNom = GXv_char3[0] ;
      confirmacionpreciodocumento_producciones_wc_impl.this.AV23UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e1922E2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV6WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S132 ();
      if (returnInSub) return;
      AV15GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV15GridCurrentPage), 10, 0));
      AV16GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV16GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16GridPageCount), 10, 0));
      cmbavGridactiongroup1.setColumnHeaderClass( "WWActionGroupColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Columnheaderclass", cmbavGridactiongroup1.getColumnHeaderClass(), !bGXsfl_47_Refreshing);
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setColumnHeaderClass( "WWColumn" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getInternalname(), "Columnheaderclass", chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getColumnHeaderClass(), !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barser_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__barser_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Columnheaderclass, !bGXsfl_47_Refreshing);
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Columnheaderclass = "WWColumn" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Internalname, "Columnheaderclass", edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Columnheaderclass, !bGXsfl_47_Refreshing);
      /*  Sending Event outputs  */
   }

   public void e1322E2( )
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

   public void e1422E2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   private void e2022E2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV48GXV1 = 1 ;
      while ( AV48GXV1 <= AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() )
      {
         AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)) );
         cmbavGridactiongroup1.removeAllItems();
         cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
         cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "Fases", ""), "fa fa-pen", "", "", "", "", "", "", ""), (short)(0));
         cmbavGridactiongroup1.setColumnClass( ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWActionGroupColumn WWColumnInfo WWColumnInfoFirstColumn" : "WWActionGroupColumn") );
         chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setColumnClass( ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") );
         edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__barser_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Columnclass = ((GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBFAS")==0) ? "WWColumn WWColumnInfo" : "WWColumn") ;
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(47) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_472( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_47_Refreshing )
         {
            httpContext.doAjaxLoad(47, GridRow);
         }
         AV48GXV1 = (int)(AV48GXV1+1) ;
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV40GridActionGroup1, 4, 0)) );
   }

   public void e2122E2( )
   {
      AV48GXV1 = (int)(nGXsfl_47_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV48GXV1 > 0 ) && ( AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() >= AV48GXV1 ) )
      {
         AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)) );
      }
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV40GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO FASES' */
         S142 ();
         if (returnInSub) return;
      }
      AV40GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV40GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void e1522E2( )
   {
      AV48GXV1 = (int)(nGXsfl_47_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV48GXV1 > 0 ) && ( AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() >= AV48GXV1 ) )
      {
         AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)) );
      }
      /* Dvelop_confirmpanel_fases_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_fases_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION FASES' */
         S152 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12ConfirmacionPrecioDocumento_Producciones_SDT", AV12ConfirmacionPrecioDocumento_Producciones_SDT);
      nGXsfl_47_bak_idx = nGXsfl_47_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV70Pgmname, AV12ConfirmacionPrecioDocumento_Producciones_SDT, sPrefix) ;
      nGXsfl_47_idx = nGXsfl_47_bak_idx ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_472( ) ;
   }

   public void e1622E2( )
   {
      AV48GXV1 = (int)(nGXsfl_47_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV48GXV1 > 0 ) && ( AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() >= AV48GXV1 ) )
      {
         AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)) );
      }
      /* Dvelop_confirmpanel_btnconfirmarprecios_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmarprecios_Result, "Yes") == 0 )
      {
         AV72GXV24 = 1 ;
         while ( AV72GXV24 <= AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() )
         {
            AV27Item_SDT = (app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV72GXV24));
            if ( AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion() )
            {
               AV30Barcod = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod() ;
               AV37Barcodreo = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo() ;
               AV38Barcodpar = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar() ;
               AV31guifaslin = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin() ;
               AV34BarPrekgm = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm() ;
               AV33BarPreMtr = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr() ;
               AV35Albprorec = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec() ;
               AV36AlbBarRec = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec() ;
               AV29TipoL = ((GXutil.strcmp(AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBBAR")==0) ? "A" : "F") ;
               GXv_char4[0] = AV18Emprcod ;
               GXv_int10[0] = AV19AlbProCod ;
               GXv_int11[0] = AV30Barcod ;
               GXv_int6[0] = AV37Barcodreo ;
               GXv_char3[0] = AV38Barcodpar ;
               GXv_int12[0] = AV31guifaslin ;
               GXv_decimal13[0] = AV34BarPrekgm ;
               GXv_decimal14[0] = AV33BarPreMtr ;
               GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal16[0] = AV28AlbImpMan ;
               GXv_char2[0] = AV29TipoL ;
               GXv_decimal17[0] = AV35Albprorec ;
               GXv_decimal18[0] = AV36AlbBarRec ;
               new app.pconprew(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_int6, GXv_char3, GXv_int12, GXv_decimal13, GXv_decimal14, GXv_decimal15, GXv_decimal16, GXv_char2, GXv_decimal17, GXv_decimal18) ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV18Emprcod = GXv_char4[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV19AlbProCod = GXv_int10[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV30Barcod = GXv_int11[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV37Barcodreo = GXv_int6[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV38Barcodpar = GXv_char3[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV31guifaslin = GXv_int12[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV34BarPrekgm = GXv_decimal13[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV33BarPreMtr = GXv_decimal14[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV28AlbImpMan = GXv_decimal16[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV29TipoL = GXv_char2[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV35Albprorec = GXv_decimal17[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV36AlbBarRec = GXv_decimal18[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProCod), 10, 0));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28AlbImpMan", GXutil.ltrimstr( AV28AlbImpMan, 11, 2));
            }
            AV72GXV24 = (int)(AV72GXV24+1) ;
         }
         GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 = AV12ConfirmacionPrecioDocumento_Producciones_SDT ;
         GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8[0] = GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 ;
         new app.facturacion.confirmacionpreciodocumento_producciones_dp(remoteHandle, context).execute( AV18Emprcod, AV19AlbProCod, GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8) ;
         GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 = GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8[0] ;
         AV12ConfirmacionPrecioDocumento_Producciones_SDT = GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 ;
         gx_BV47 = true ;
         AV12ConfirmacionPrecioDocumento_Producciones_SDT.sort(httpContext.getMessage( "Barcod,Barcodreo,Barcodpar,GuiFaslin", ""));
         gx_BV47 = true ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12ConfirmacionPrecioDocumento_Producciones_SDT", AV12ConfirmacionPrecioDocumento_Producciones_SDT);
      nGXsfl_47_bak_idx = nGXsfl_47_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV70Pgmname, AV12ConfirmacionPrecioDocumento_Producciones_SDT, sPrefix) ;
      nGXsfl_47_idx = nGXsfl_47_bak_idx ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_472( ) ;
   }

   public void e1722E2( )
   {
      AV48GXV1 = (int)(nGXsfl_47_idx+GRID_nFirstRecordOnPage) ;
      if ( ( AV48GXV1 > 0 ) && ( AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() >= AV48GXV1 ) )
      {
         AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)) );
      }
      /* Dvelop_confirmpanel_btndocumentosinconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btndocumentosinconfirmar_Result, "Yes") == 0 )
      {
         AV74GXV26 = 1 ;
         while ( AV74GXV26 <= AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() )
         {
            AV27Item_SDT = (app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV74GXV26));
            if ( AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion() )
            {
               AV30Barcod = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod() ;
               AV37Barcodreo = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo() ;
               AV38Barcodpar = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar() ;
               AV31guifaslin = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin() ;
               AV34BarPrekgm = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm() ;
               AV33BarPreMtr = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr() ;
               AV35Albprorec = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec() ;
               AV36AlbBarRec = AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albbarrec() ;
               AV29TipoL = ((GXutil.strcmp(AV27Item_SDT.getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), "ALBBAR")==0) ? "A" : "F") ;
               GXv_char4[0] = AV18Emprcod ;
               GXv_int10[0] = AV19AlbProCod ;
               GXv_int11[0] = AV30Barcod ;
               GXv_int6[0] = AV37Barcodreo ;
               GXv_char3[0] = AV38Barcodpar ;
               GXv_int12[0] = AV31guifaslin ;
               GXv_decimal18[0] = AV34BarPrekgm ;
               GXv_decimal17[0] = AV33BarPreMtr ;
               GXv_decimal16[0] = AV28AlbImpMan ;
               GXv_char2[0] = AV29TipoL ;
               GXv_decimal15[0] = AV35Albprorec ;
               new app.pconpret(remoteHandle, context).execute( GXv_char4, GXv_int10, GXv_int11, GXv_int6, GXv_char3, GXv_int12, GXv_decimal18, GXv_decimal17, GXv_decimal16, GXv_char2, GXv_decimal15) ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV18Emprcod = GXv_char4[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV19AlbProCod = GXv_int10[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV30Barcod = GXv_int11[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV37Barcodreo = GXv_int6[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV38Barcodpar = GXv_char3[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV31guifaslin = GXv_int12[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV34BarPrekgm = GXv_decimal18[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV33BarPreMtr = GXv_decimal17[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV28AlbImpMan = GXv_decimal16[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV29TipoL = GXv_char2[0] ;
               confirmacionpreciodocumento_producciones_wc_impl.this.AV35Albprorec = GXv_decimal15[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProCod), 10, 0));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28AlbImpMan", GXutil.ltrimstr( AV28AlbImpMan, 11, 2));
            }
            AV74GXV26 = (int)(AV74GXV26+1) ;
         }
         GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 = AV12ConfirmacionPrecioDocumento_Producciones_SDT ;
         GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8[0] = GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 ;
         new app.facturacion.confirmacionpreciodocumento_producciones_dp(remoteHandle, context).execute( AV18Emprcod, AV19AlbProCod, GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8) ;
         GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 = GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8[0] ;
         AV12ConfirmacionPrecioDocumento_Producciones_SDT = GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 ;
         gx_BV47 = true ;
         AV12ConfirmacionPrecioDocumento_Producciones_SDT.sort(httpContext.getMessage( "Barcod,Barcodreo,Barcodpar,GuiFaslin", ""));
         gx_BV47 = true ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12ConfirmacionPrecioDocumento_Producciones_SDT", AV12ConfirmacionPrecioDocumento_Producciones_SDT);
      nGXsfl_47_bak_idx = nGXsfl_47_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV70Pgmname, AV12ConfirmacionPrecioDocumento_Producciones_SDT, sPrefix) ;
      nGXsfl_47_idx = nGXsfl_47_bak_idx ;
      sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_472( ) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSDT' Routine */
      returnInSub = false ;
   }

   public void S142( )
   {
      /* 'DO FASES' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla(), httpContext.getMessage( "ALBFAS", "")) == 0 )
      {
         Dvelop_confirmpanel_fases_Confirmationtext = httpContext.getMessage( "Aviso. Si se confirma este boton, el programa cuando retorne, volvera a cargar los valores del documento.", "")+GXutil.newLine( ) ;
         ucDvelop_confirmpanel_fases.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_fases_Internalname, "ConfirmationText", Dvelop_confirmpanel_fases_Confirmationtext);
         Dvelop_confirmpanel_fases_Confirmationtext = Dvelop_confirmpanel_fases_Confirmationtext+httpContext.getMessage( "Esto quiere decir, que si se habia cambiado algun precio de alguna linea, se tendra que volver a introducir", "") ;
         ucDvelop_confirmpanel_fases.sendProperty(context, sPrefix, false, Dvelop_confirmpanel_fases_Internalname, "ConfirmationText", Dvelop_confirmpanel_fases_Confirmationtext);
         this.executeUsercontrolMethod(sPrefix, false, "DVELOP_CONFIRMPANEL_FASESContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S152( )
   {
      /* 'DO ACTION FASES' Routine */
      returnInSub = false ;
      AV30Barcod = ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod() ;
      AV37Barcodreo = ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo() ;
      AV38Barcodpar = ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar() ;
      AV43BarAlbKgmE = ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme() ;
      AV44BarAlbMtrE = ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)(AV12ConfirmacionPrecioDocumento_Producciones_SDT.currentItem())).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre() ;
      httpContext.popup(formatLink("app.documentotransporteproduccion.documentodetransporteproduccion_4_wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV18Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV19AlbProCod,10,0)),GXutil.URLEncode(GXutil.ltrimstr(AV30Barcod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV37Barcodreo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV38Barcodpar)),GXutil.URLEncode(GXutil.ltrimstr(AV24GuiRemCli,6,0)),GXutil.URLEncode(DecimalUtil.decToString(AV43BarAlbKgmE)),GXutil.URLEncode(DecimalUtil.decToString(AV44BarAlbMtrE)),GXutil.URLEncode(GXutil.ltrimstr(AV41AlbEnvFtp,1,0)),GXutil.URLEncode(GXutil.rtrim(AV42AlbLic)),GXutil.URLEncode(GXutil.ltrimstr(AV45AlbProEst,1,0))}, new String[] {"EmprCod","AlbProCod","BarCod","BarCodReo","BarCodPar","Guiremcli","BarAlbKgmE","BarAlbMtrE","AlbEnvFtp","AlbLic","AlbProEst","albmarca"}) , new Object[] {});
      GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 = AV12ConfirmacionPrecioDocumento_Producciones_SDT ;
      GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8[0] = GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 ;
      new app.facturacion.confirmacionpreciodocumento_producciones_dp(remoteHandle, context).execute( AV18Emprcod, AV19AlbProCod, GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8) ;
      GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 = GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8[0] ;
      AV12ConfirmacionPrecioDocumento_Producciones_SDT = GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 ;
      gx_BV47 = true ;
      AV12ConfirmacionPrecioDocumento_Producciones_SDT.sort(httpContext.getMessage( "Barcod,Barcodreo,Barcodpar,GuiFaslin", ""));
      gx_BV47 = true ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue(AV70Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV70Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV13Session.getValue(AV70Pgmname+"GridState"), null, null);
      }
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV13Session.getValue(AV70Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV70Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void wb_table3_93_22E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btndocumentosinconfirmar_Internalname, tblTabledvelop_confirmpanel_btndocumentosinconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btndocumentosinconfirmar.setProperty("Title", Dvelop_confirmpanel_btndocumentosinconfirmar_Title);
         ucDvelop_confirmpanel_btndocumentosinconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btndocumentosinconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btndocumentosinconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btndocumentosinconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btndocumentosinconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btndocumentosinconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btndocumentosinconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btndocumentosinconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btndocumentosinconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btndocumentosinconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btndocumentosinconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btndocumentosinconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btndocumentosinconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btndocumentosinconfirmar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_93_22E2e( true) ;
      }
      else
      {
         wb_table3_93_22E2e( false) ;
      }
   }

   public void wb_table2_88_22E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmarprecios_Internalname, tblTabledvelop_confirmpanel_btnconfirmarprecios_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmarprecios.setProperty("Title", Dvelop_confirmpanel_btnconfirmarprecios_Title);
         ucDvelop_confirmpanel_btnconfirmarprecios.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmarprecios_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmarprecios.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmarprecios_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmarprecios.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmarprecios_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmarprecios.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmarprecios_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmarprecios.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmarprecios_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmarprecios.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmarprecios_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmarprecios.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmarprecios_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOSContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOSContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_88_22E2e( true) ;
      }
      else
      {
         wb_table2_88_22E2e( false) ;
      }
   }

   public void wb_table1_83_22E2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_fases_Internalname, tblTabledvelop_confirmpanel_fases_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_fases.setProperty("Title", Dvelop_confirmpanel_fases_Title);
         ucDvelop_confirmpanel_fases.setProperty("ConfirmationText", Dvelop_confirmpanel_fases_Confirmationtext);
         ucDvelop_confirmpanel_fases.setProperty("YesButtonCaption", Dvelop_confirmpanel_fases_Yesbuttoncaption);
         ucDvelop_confirmpanel_fases.setProperty("NoButtonCaption", Dvelop_confirmpanel_fases_Nobuttoncaption);
         ucDvelop_confirmpanel_fases.setProperty("CancelButtonCaption", Dvelop_confirmpanel_fases_Cancelbuttoncaption);
         ucDvelop_confirmpanel_fases.setProperty("YesButtonPosition", Dvelop_confirmpanel_fases_Yesbuttonposition);
         ucDvelop_confirmpanel_fases.setProperty("ConfirmType", Dvelop_confirmpanel_fases_Confirmtype);
         ucDvelop_confirmpanel_fases.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_fases_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_FASESContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_FASESContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_83_22E2e( true) ;
      }
      else
      {
         wb_table1_83_22E2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV18Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
      AV19AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProCod), 10, 0));
      AV24GuiRemCli = ((Number) GXutil.testNumericType( getParm(obj,2,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GuiRemCli), 6, 0));
      AV25GuiRemCln = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25GuiRemCln", AV25GuiRemCln);
      AV41AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41AlbEnvFtp", GXutil.str( AV41AlbEnvFtp, 1, 0));
      AV42AlbLic = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42AlbLic", AV42AlbLic);
      AV45AlbProEst = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45AlbProEst", GXutil.str( AV45AlbProEst, 1, 0));
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
      pa22E2( ) ;
      ws22E2( ) ;
      we22E2( ) ;
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
      sCtrlAV18Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV19AlbProCod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV24GuiRemCli = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV25GuiRemCln = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV41AlbEnvFtp = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV42AlbLic = (String)getParm(obj,5,TypeConstants.STRING) ;
      sCtrlAV45AlbProEst = (String)getParm(obj,6,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa22E2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "facturacion\\confirmacionpreciodocumento_producciones_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa22E2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV18Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
         AV19AlbProCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.LONG), TypeConstants.LONG)).longValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProCod), 10, 0));
         AV24GuiRemCli = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GuiRemCli), 6, 0));
         AV25GuiRemCln = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25GuiRemCln", AV25GuiRemCln);
         AV41AlbEnvFtp = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41AlbEnvFtp", GXutil.str( AV41AlbEnvFtp, 1, 0));
         AV42AlbLic = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42AlbLic", AV42AlbLic);
         AV45AlbProEst = ((Number) GXutil.testNumericType( getParm(obj,8,TypeConstants.BYTE), TypeConstants.BYTE)).byteValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45AlbProEst", GXutil.str( AV45AlbProEst, 1, 0));
      }
      wcpOAV18Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV18Emprcod") ;
      wcpOAV19AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV19AlbProCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      wcpOAV24GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV24GuiRemCli"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV25GuiRemCln = httpContext.cgiGet( sPrefix+"wcpOAV25GuiRemCln") ;
      wcpOAV41AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV41AlbEnvFtp"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV42AlbLic = httpContext.cgiGet( sPrefix+"wcpOAV42AlbLic") ;
      wcpOAV45AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV45AlbProEst"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV18Emprcod, wcpOAV18Emprcod) != 0 ) || ( AV19AlbProCod != wcpOAV19AlbProCod ) || ( AV24GuiRemCli != wcpOAV24GuiRemCli ) || ( GXutil.strcmp(AV25GuiRemCln, wcpOAV25GuiRemCln) != 0 ) || ( AV41AlbEnvFtp != wcpOAV41AlbEnvFtp ) || ( GXutil.strcmp(AV42AlbLic, wcpOAV42AlbLic) != 0 ) || ( AV45AlbProEst != wcpOAV45AlbProEst ) ) )
      {
         setjustcreated();
      }
      wcpOAV18Emprcod = AV18Emprcod ;
      wcpOAV19AlbProCod = AV19AlbProCod ;
      wcpOAV24GuiRemCli = AV24GuiRemCli ;
      wcpOAV25GuiRemCln = AV25GuiRemCln ;
      wcpOAV41AlbEnvFtp = AV41AlbEnvFtp ;
      wcpOAV42AlbLic = AV42AlbLic ;
      wcpOAV45AlbProEst = AV45AlbProEst ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV18Emprcod = httpContext.cgiGet( sPrefix+"AV18Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV18Emprcod) > 0 )
      {
         AV18Emprcod = httpContext.cgiGet( sCtrlAV18Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Emprcod", AV18Emprcod);
      }
      else
      {
         AV18Emprcod = httpContext.cgiGet( sPrefix+"AV18Emprcod_PARM") ;
      }
      sCtrlAV19AlbProCod = httpContext.cgiGet( sPrefix+"AV19AlbProCod_CTRL") ;
      if ( GXutil.len( sCtrlAV19AlbProCod) > 0 )
      {
         AV19AlbProCod = localUtil.ctol( httpContext.cgiGet( sCtrlAV19AlbProCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19AlbProCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV19AlbProCod), 10, 0));
      }
      else
      {
         AV19AlbProCod = localUtil.ctol( httpContext.cgiGet( sPrefix+"AV19AlbProCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
      }
      sCtrlAV24GuiRemCli = httpContext.cgiGet( sPrefix+"AV24GuiRemCli_CTRL") ;
      if ( GXutil.len( sCtrlAV24GuiRemCli) > 0 )
      {
         AV24GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV24GuiRemCli), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24GuiRemCli", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24GuiRemCli), 6, 0));
      }
      else
      {
         AV24GuiRemCli = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV24GuiRemCli_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV25GuiRemCln = httpContext.cgiGet( sPrefix+"AV25GuiRemCln_CTRL") ;
      if ( GXutil.len( sCtrlAV25GuiRemCln) > 0 )
      {
         AV25GuiRemCln = httpContext.cgiGet( sCtrlAV25GuiRemCln) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25GuiRemCln", AV25GuiRemCln);
      }
      else
      {
         AV25GuiRemCln = httpContext.cgiGet( sPrefix+"AV25GuiRemCln_PARM") ;
      }
      sCtrlAV41AlbEnvFtp = httpContext.cgiGet( sPrefix+"AV41AlbEnvFtp_CTRL") ;
      if ( GXutil.len( sCtrlAV41AlbEnvFtp) > 0 )
      {
         AV41AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV41AlbEnvFtp), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41AlbEnvFtp", GXutil.str( AV41AlbEnvFtp, 1, 0));
      }
      else
      {
         AV41AlbEnvFtp = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV41AlbEnvFtp_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV42AlbLic = httpContext.cgiGet( sPrefix+"AV42AlbLic_CTRL") ;
      if ( GXutil.len( sCtrlAV42AlbLic) > 0 )
      {
         AV42AlbLic = httpContext.cgiGet( sCtrlAV42AlbLic) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42AlbLic", AV42AlbLic);
      }
      else
      {
         AV42AlbLic = httpContext.cgiGet( sPrefix+"AV42AlbLic_PARM") ;
      }
      sCtrlAV45AlbProEst = httpContext.cgiGet( sPrefix+"AV45AlbProEst_CTRL") ;
      if ( GXutil.len( sCtrlAV45AlbProEst) > 0 )
      {
         AV45AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sCtrlAV45AlbProEst), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45AlbProEst", GXutil.str( AV45AlbProEst, 1, 0));
      }
      else
      {
         AV45AlbProEst = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV45AlbProEst_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa22E2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws22E2( ) ;
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
      ws22E2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Emprcod_PARM", GXutil.rtrim( AV18Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Emprcod_CTRL", GXutil.rtrim( sCtrlAV18Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19AlbProCod_PARM", GXutil.ltrim( localUtil.ntoc( AV19AlbProCod, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV19AlbProCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV19AlbProCod_CTRL", GXutil.rtrim( sCtrlAV19AlbProCod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24GuiRemCli_PARM", GXutil.ltrim( localUtil.ntoc( AV24GuiRemCli, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24GuiRemCli)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24GuiRemCli_CTRL", GXutil.rtrim( sCtrlAV24GuiRemCli));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25GuiRemCln_PARM", GXutil.rtrim( AV25GuiRemCln));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25GuiRemCln)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25GuiRemCln_CTRL", GXutil.rtrim( sCtrlAV25GuiRemCln));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41AlbEnvFtp_PARM", GXutil.ltrim( localUtil.ntoc( AV41AlbEnvFtp, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV41AlbEnvFtp)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV41AlbEnvFtp_CTRL", GXutil.rtrim( sCtrlAV41AlbEnvFtp));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42AlbLic_PARM", GXutil.rtrim( AV42AlbLic));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV42AlbLic)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV42AlbLic_CTRL", GXutil.rtrim( sCtrlAV42AlbLic));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45AlbProEst_PARM", GXutil.ltrim( localUtil.ntoc( AV45AlbProEst, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV45AlbProEst)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV45AlbProEst_CTRL", GXutil.rtrim( sCtrlAV45AlbProEst));
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
      we22E2( ) ;
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
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
      httpContext.AddStyleSheetFile("DVelop/Bootstrap/Shared/DVelopBootstrap.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115553560", true, true);
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
      httpContext.AddJavascriptSource("facturacion/confirmacionpreciodocumento_producciones_wc.js", "?202682115553561", false, true);
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

   public void subsflControlProps_472( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_47_idx );
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setInternalname( sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__SELECCION_"+sGXsfl_47_idx );
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBENCCLI_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOD_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODREO_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODPAR_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSER_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSERDSC_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNOM_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNUM_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARTIPCOL_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASCOD_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASDSC_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBMTRE_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREMTR_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBKGME_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREKGM_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROESP_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBIMPMAN_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROREC_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__GUIFASLIN_"+sGXsfl_47_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__TABLA_"+sGXsfl_47_idx ;
   }

   public void subsflControlProps_fel_472( )
   {
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1_"+sGXsfl_47_fel_idx );
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setInternalname( sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__SELECCION_"+sGXsfl_47_fel_idx );
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBENCCLI_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOD_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODREO_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODPAR_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSER_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSERDSC_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNOM_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNUM_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARTIPCOL_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASCOD_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASDSC_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBMTRE_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREMTR_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBKGME_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREKGM_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROESP_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBIMPMAN_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROREC_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__GUIFASLIN_"+sGXsfl_47_fel_idx ;
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__TABLA_"+sGXsfl_47_fel_idx ;
   }

   public void sendrow_472( )
   {
      subsflControlProps_472( ) ;
      wb22E0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_47_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_47_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_47_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_47_idx+"',47)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_47_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               if ( ( AV48GXV1 > 0 ) && ( AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() >= AV48GXV1 ) && (0==AV40GridActionGroup1) )
               {
                  AV40GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV40GridActionGroup1, 4, 0))))) ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridActionGroup1), 4, 0));
               }
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV40GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+sPrefix+"'"+",false,"+"'"+sPrefix+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_47_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO",cmbavGridactiongroup1.getColumnClass(),cmbavGridactiongroup1.getColumnHeaderClass(),TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,48);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV40GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_47_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getEnabled()!=0)&&(chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 49,'"+sPrefix+"',false,'"+sGXsfl_47_idx+"',47)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__SELECCION_" + sGXsfl_47_idx ;
         chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setName( GXCCtl );
         chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setWebtags( "" );
         chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getInternalname(), "TitleCaption", chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getCaption(), !bGXsfl_47_Refreshing);
         chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getInternalname(),GXutil.booltostr( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Seleccion()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getColumnClass(),chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getColumnHeaderClass(),TempTags+" onclick="+"\"gx.fn.checkboxClick(49, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getEnabled()!=0)&&(chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,49);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Internalname,GXutil.rtrim( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albenccli()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod(), (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod()), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcod()), "ZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodreo()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Internalname,GXutil.rtrim( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcodpar()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__barser_Internalname,GXutil.rtrim( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barser()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__barser_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__barser_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__barser_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__barser_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Internalname,GXutil.rtrim( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barserdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Internalname,GXutil.rtrim( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum(), (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum()), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barcolnum()), "ZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol()), "Z9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Bartipcol()), "Z9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Internalname,GXutil.rtrim( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod()),GXutil.rtrim( localUtil.format( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fascod(), "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Internalname,GXutil.rtrim( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Fasdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(28),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre(), "ZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbmtre(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Enabled!=0)&&(edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 62,'"+sPrefix+"',false,'"+sGXsfl_47_idx+"',47)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr(), (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barpremtr(), "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Enabled!=0)&&(edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,62);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme(), (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme(), "ZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Baralbkgme(), "ZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Enabled!=0)&&(edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 64,'"+sPrefix+"',false,'"+sGXsfl_47_idx+"',47)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm(), (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Barprekgm(), "ZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Enabled!=0)&&(edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,64);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp(), (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp()), "99") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albproesp()), "99")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman(), (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman(), "ZZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albimpman(), "ZZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec(), (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Enabled!=0) ? localUtil.format( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec(), "ZZZZZZ9.99") : localUtil.format( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Albprorec(), "ZZZZZZ9.99"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(13),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Guifaslin()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Internalname,GXutil.rtrim( ((app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item)AV12ConfirmacionPrecioDocumento_Producciones_SDT.elementAt(-1+AV48GXV1)).getgxTv_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item_Tabla()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Columnclass,edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Columnheaderclass,Integer.valueOf(-1),Integer.valueOf(edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(47),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes22E2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_47_idx = ((subGrid_Islastpage==1)&&(nGXsfl_47_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_47_idx+1) ;
         sGXsfl_47_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_47_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_472( ) ;
      }
      /* End function sendrow_472 */
   }

   public void startgridcontrol47( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"47\">") ;
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
         httpContext.writeText( "<th align=\""+""+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedido Cli.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº HDR", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "P", "")) ;
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
         httpContext.writeValue( httpContext.getMessage( "Fase", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos Ent.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Importe Manual", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Recargo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tabla", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV40GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( cmbavGridactiongroup1.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( cmbavGridactiongroup1.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getColumnClass()));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getColumnHeaderClass()));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barser_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barser_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__barser_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Columnheaderclass));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Columnclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Columnclass));
         GridColumn.AddObjectProperty("Columnheaderclass", GXutil.rtrim( edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Columnheaderclass));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavAlbprocod_Internalname = sPrefix+"vALBPROCOD" ;
      edtavGuiremcli_Internalname = sPrefix+"vGUIREMCLI" ;
      edtavGuiremcln_Internalname = sPrefix+"vGUIREMCLN" ;
      divUnnamedtable3_Internalname = sPrefix+"UNNAMEDTABLE3" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnconfirmarprecios_Internalname = sPrefix+"BTNCONFIRMARPRECIOS" ;
      bttBtndocumentosinconfirmar_Internalname = sPrefix+"BTNDOCUMENTOSINCONFIRMAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      cmbavGridactiongroup1.setInternalname( sPrefix+"vGRIDACTIONGROUP1" );
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setInternalname( sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__SELECCION" );
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBENCCLI" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOD" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODREO" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODPAR" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSER" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSERDSC" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNOM" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNUM" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARTIPCOL" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASCOD" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASDSC" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBMTRE" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREMTR" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBKGME" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREKGM" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROESP" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBIMPMAN" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROREC" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__GUIFASLIN" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Internalname = sPrefix+"CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__TABLA" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Dvelop_confirmpanel_fases_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_FASES" ;
      tblTabledvelop_confirmpanel_fases_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_FASES" ;
      Dvelop_confirmpanel_btnconfirmarprecios_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS" ;
      tblTabledvelop_confirmpanel_btnconfirmarprecios_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS" ;
      Dvelop_confirmpanel_btndocumentosinconfirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btndocumentosinconfirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Visible = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Enabled = 1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Visible = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Enabled = 1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Jsonclick = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Columnheaderclass = "" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Columnclass = "WWColumn" ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Enabled = 0 ;
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setCaption( "" );
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setColumnHeaderClass( "" );
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setColumnClass( "WWColumn" );
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setVisible( -1 );
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setEnabled( 1 );
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      cmbavGridactiongroup1.setColumnClass( "WWActionGroupColumn" );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      cmbavGridactiongroup1.setColumnHeaderClass( "" );
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Enabled = -1 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavGuiremcln_Jsonclick = "" ;
      edtavGuiremcln_Enabled = 0 ;
      edtavGuiremcli_Jsonclick = "" ;
      edtavGuiremcli_Enabled = 0 ;
      edtavAlbprocod_Jsonclick = "" ;
      edtavAlbprocod_Enabled = 0 ;
      Dvelop_confirmpanel_btndocumentosinconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btndocumentosinconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btndocumentosinconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btndocumentosinconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btndocumentosinconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btndocumentosinconfirmar_Confirmationtext = "¿Confirma en dejar las lineas Pdtes de confirmar?" ;
      Dvelop_confirmpanel_btndocumentosinconfirmar_Title = "" ;
      Dvelop_confirmpanel_btnconfirmarprecios_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmarprecios_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmarprecios_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmarprecios_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmarprecios_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmarprecios_Confirmationtext = "¿Confirma el precio?" ;
      Dvelop_confirmpanel_btnconfirmarprecios_Title = "" ;
      Dvelop_confirmpanel_fases_Confirmtype = "1" ;
      Dvelop_confirmpanel_fases_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_fases_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_fases_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_fases_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_fases_Confirmationtext = "¿Confirma?" ;
      Dvelop_confirmpanel_fases_Title = "" ;
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
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_47_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         if ( ( AV48GXV1 > 0 ) && ( AV12ConfirmacionPrecioDocumento_Producciones_SDT.size() >= AV48GXV1 ) && (0==AV40GridActionGroup1) )
         {
         }
      }
      GXCCtl = "CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__SELECCION_" + sGXsfl_47_idx ;
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setName( GXCCtl );
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setWebtags( "" );
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getInternalname(), "TitleCaption", chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.getCaption(), !bGXsfl_47_Refreshing);
      chkavConfirmacionpreciodocumento_producciones_sdt__seleccion.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47},{av:'sPrefix'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__SELECCION',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBENCCLI',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODREO',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSER',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSERDSC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNUM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARTIPCOL',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASCOD',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASDSC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBMTRE',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREMTR',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBKGME',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREKGM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROESP',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBIMPMAN',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROREC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__TABLA',prop:'Columnheaderclass'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1322E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1422E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2022E2',iparms:[{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV40GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__SELECCION',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBENCCLI',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOD',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODREO',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODPAR',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSER',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSERDSC',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNOM',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNUM',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARTIPCOL',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASCOD',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASDSC',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBMTRE',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREMTR',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBKGME',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREKGM',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROESP',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBIMPMAN',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROREC',prop:'Columnclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__TABLA',prop:'Columnclass'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2122E2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV40GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV40GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'Dvelop_confirmpanel_fases_Confirmationtext',ctrl:'DVELOP_CONFIRMPANEL_FASES',prop:'ConfirmationText'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_FASES.CLOSE","{handler:'e1522E2',iparms:[{av:'Dvelop_confirmpanel_fases_Result',ctrl:'DVELOP_CONFIRMPANEL_FASES',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47},{av:'sPrefix'},{av:'AV18Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV24GuiRemCli',fld:'vGUIREMCLI',pic:'ZZZZZ9'},{av:'AV41AlbEnvFtp',fld:'vALBENVFTP',pic:'9'},{av:'AV42AlbLic',fld:'vALBLIC',pic:''},{av:'AV45AlbProEst',fld:'vALBPROEST',pic:'9'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_FASES.CLOSE",",oparms:[{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47},{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__SELECCION',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBENCCLI',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODREO',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSER',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSERDSC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNUM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARTIPCOL',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASCOD',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASDSC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBMTRE',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREMTR',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBKGME',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREKGM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROESP',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBIMPMAN',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROREC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__TABLA',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DOCONFIRMARPRECIOS'","{handler:'e1122E1',iparms:[{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47}]");
      setEventMetadata("'DOCONFIRMARPRECIOS'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS.CLOSE","{handler:'e1622E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47},{av:'sPrefix'},{av:'Dvelop_confirmpanel_btnconfirmarprecios_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS',prop:'Result'},{av:'AV18Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV28AlbImpMan',fld:'vALBIMPMAN',pic:'ZZZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMARPRECIOS.CLOSE",",oparms:[{av:'AV28AlbImpMan',fld:'vALBIMPMAN',pic:'ZZZZZZZ9.99'},{av:'AV19AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV18Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47},{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__SELECCION',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBENCCLI',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODREO',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSER',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSERDSC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNUM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARTIPCOL',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASCOD',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASDSC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBMTRE',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREMTR',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBKGME',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREKGM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROESP',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBIMPMAN',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROREC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__TABLA',prop:'Columnheaderclass'}]}");
      setEventMetadata("'DODOCUMENTOSINCONFIRMAR'","{handler:'e1222E1',iparms:[{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47}]");
      setEventMetadata("'DODOCUMENTOSINCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR.CLOSE","{handler:'e1722E2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV70Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47},{av:'sPrefix'},{av:'Dvelop_confirmpanel_btndocumentosinconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR',prop:'Result'},{av:'AV18Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV19AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV28AlbImpMan',fld:'vALBIMPMAN',pic:'ZZZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNDOCUMENTOSINCONFIRMAR.CLOSE",",oparms:[{av:'AV28AlbImpMan',fld:'vALBIMPMAN',pic:'ZZZZZZZ9.99'},{av:'AV19AlbProCod',fld:'vALBPROCOD',pic:'ZZZZZZZZZ9'},{av:'AV18Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV12ConfirmacionPrecioDocumento_Producciones_SDT',fld:'vCONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT',grid:47,pic:''},{av:'nGXsfl_47_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:47},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_47',ctrl:'GRID',prop:'GridRC',grid:47},{av:'AV15GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV16GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'cmbavGridactiongroup1'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__SELECCION',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBENCCLI',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOD',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODREO',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCODPAR',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSER',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARSERDSC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNOM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARCOLNUM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARTIPCOL',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASCOD',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__FASDSC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBMTRE',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREMTR',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARALBKGME',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__BARPREKGM',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROESP',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBIMPMAN',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__ALBPROREC',prop:'Columnheaderclass'},{ctrl:'CONFIRMACIONPRECIODOCUMENTO_PRODUCCIONES_SDT__TABLA',prop:'Columnheaderclass'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv22',iparms:[]");
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
      wcpOAV18Emprcod = "" ;
      wcpOAV25GuiRemCln = "" ;
      wcpOAV42AlbLic = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Dvelop_confirmpanel_fases_Result = "" ;
      Dvelop_confirmpanel_btnconfirmarprecios_Result = "" ;
      Dvelop_confirmpanel_btndocumentosinconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV18Emprcod = "" ;
      AV25GuiRemCln = "" ;
      AV42AlbLic = "" ;
      AV70Pgmname = "" ;
      AV12ConfirmacionPrecioDocumento_Producciones_SDT = new GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item>(app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV28AlbImpMan = DecimalUtil.ZERO ;
      AV27Item_SDT = new app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item(remoteHandle, context);
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnconfirmarprecios_Jsonclick = "" ;
      bttBtndocumentosinconfirmar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      hsh = "" ;
      AV21Station = "" ;
      AV22EmprNom = "" ;
      AV23UsurCod = "" ;
      GXt_char1 = "" ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV38Barcodpar = "" ;
      AV34BarPrekgm = DecimalUtil.ZERO ;
      AV33BarPreMtr = DecimalUtil.ZERO ;
      AV35Albprorec = DecimalUtil.ZERO ;
      AV36AlbBarRec = DecimalUtil.ZERO ;
      AV29TipoL = "" ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int10 = new long[1] ;
      GXv_int11 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_char3 = new String[1] ;
      GXv_int12 = new short[1] ;
      GXv_decimal18 = new java.math.BigDecimal[1] ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_decimal16 = new java.math.BigDecimal[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      ucDvelop_confirmpanel_fases = new com.genexus.webpanels.GXUserControl();
      AV43BarAlbKgmE = DecimalUtil.ZERO ;
      AV44BarAlbMtrE = DecimalUtil.ZERO ;
      GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 = new GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item>(app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8 = new GXBaseCollection[1] ;
      AV13Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      ucDvelop_confirmpanel_btndocumentosinconfirmar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_btnconfirmarprecios = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV18Emprcod = "" ;
      sCtrlAV19AlbProCod = "" ;
      sCtrlAV24GuiRemCli = "" ;
      sCtrlAV25GuiRemCln = "" ;
      sCtrlAV41AlbEnvFtp = "" ;
      sCtrlAV42AlbLic = "" ;
      sCtrlAV45AlbProEst = "" ;
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV70Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones_WC" ;
      /* GeneXus formulas. */
      AV70Pgmname = "Facturacion.ConfirmacionPrecioDocumento_Producciones_WC" ;
      Gx_err = (short)(0) ;
      edtavAlbprocod_Enabled = 0 ;
      edtavGuiremcli_Enabled = 0 ;
      edtavGuiremcln_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barser_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Enabled = 0 ;
      edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte wcpOAV41AlbEnvFtp ;
   private byte wcpOAV45AlbProEst ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV41AlbEnvFtp ;
   private byte AV45AlbProEst ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte GXt_int5 ;
   private byte AV37Barcodreo ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV39lineas ;
   private short wbEnd ;
   private short wbStart ;
   private short AV40GridActionGroup1 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV20FlagTxt ;
   private short AV31guifaslin ;
   private short GXv_int12[] ;
   private int wcpOAV24GuiRemCli ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_47 ;
   private int AV24GuiRemCli ;
   private int nGXsfl_47_idx=1 ;
   private int AV73GXV25 ;
   private int AV71GXV23 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavAlbprocod_Enabled ;
   private int edtavGuiremcli_Enabled ;
   private int edtavGuiremcln_Enabled ;
   private int AV48GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__barser_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_47_fel_idx=1 ;
   private int AV14PageToGo ;
   private int nGXsfl_47_bak_idx=1 ;
   private int AV72GXV24 ;
   private int AV30Barcod ;
   private int AV74GXV26 ;
   private int GXv_int11[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Visible ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Enabled ;
   private int edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long wcpOAV19AlbProCod ;
   private long GRID_nFirstRecordOnPage ;
   private long AV19AlbProCod ;
   private long AV15GridCurrentPage ;
   private long AV16GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXv_int10[] ;
   private java.math.BigDecimal AV28AlbImpMan ;
   private java.math.BigDecimal AV34BarPrekgm ;
   private java.math.BigDecimal AV33BarPreMtr ;
   private java.math.BigDecimal AV35Albprorec ;
   private java.math.BigDecimal AV36AlbBarRec ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal18[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private java.math.BigDecimal GXv_decimal16[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal AV43BarAlbKgmE ;
   private java.math.BigDecimal AV44BarAlbMtrE ;
   private String wcpOAV18Emprcod ;
   private String wcpOAV25GuiRemCln ;
   private String wcpOAV42AlbLic ;
   private String Gridpaginationbar_Selectedpage ;
   private String Dvelop_confirmpanel_fases_Result ;
   private String Dvelop_confirmpanel_btnconfirmarprecios_Result ;
   private String Dvelop_confirmpanel_btndocumentosinconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV18Emprcod ;
   private String AV25GuiRemCln ;
   private String AV42AlbLic ;
   private String sGXsfl_47_idx="0001" ;
   private String AV70Pgmname ;
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
   private String Dvelop_confirmpanel_fases_Title ;
   private String Dvelop_confirmpanel_fases_Confirmationtext ;
   private String Dvelop_confirmpanel_fases_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_fases_Nobuttoncaption ;
   private String Dvelop_confirmpanel_fases_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_fases_Yesbuttonposition ;
   private String Dvelop_confirmpanel_fases_Confirmtype ;
   private String Dvelop_confirmpanel_btnconfirmarprecios_Title ;
   private String Dvelop_confirmpanel_btnconfirmarprecios_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmarprecios_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmarprecios_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmarprecios_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmarprecios_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmarprecios_Confirmtype ;
   private String Dvelop_confirmpanel_btndocumentosinconfirmar_Title ;
   private String Dvelop_confirmpanel_btndocumentosinconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btndocumentosinconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btndocumentosinconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btndocumentosinconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btndocumentosinconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btndocumentosinconfirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String edtavAlbprocod_Internalname ;
   private String edtavAlbprocod_Jsonclick ;
   private String edtavGuiremcli_Internalname ;
   private String edtavGuiremcli_Jsonclick ;
   private String edtavGuiremcln_Internalname ;
   private String edtavGuiremcln_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divUnnamedtable1_Internalname ;
   private String TempTags ;
   private String bttBtnconfirmarprecios_Internalname ;
   private String bttBtnconfirmarprecios_Jsonclick ;
   private String bttBtndocumentosinconfirmar_Internalname ;
   private String bttBtndocumentosinconfirmar_Jsonclick ;
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
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barser_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Internalname ;
   private String sGXsfl_47_fel_idx="0001" ;
   private String hsh ;
   private String AV21Station ;
   private String AV22EmprNom ;
   private String AV23UsurCod ;
   private String GXt_char1 ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barser_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Internalname ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Columnheaderclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barser_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Columnclass ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Columnclass ;
   private String AV38Barcodpar ;
   private String AV29TipoL ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String Dvelop_confirmpanel_fases_Internalname ;
   private String tblTabledvelop_confirmpanel_btndocumentosinconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btndocumentosinconfirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_btnconfirmarprecios_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmarprecios_Internalname ;
   private String tblTabledvelop_confirmpanel_fases_Internalname ;
   private String sCtrlAV18Emprcod ;
   private String sCtrlAV19AlbProCod ;
   private String sCtrlAV24GuiRemCli ;
   private String sCtrlAV25GuiRemCln ;
   private String sCtrlAV41AlbEnvFtp ;
   private String sCtrlAV42AlbLic ;
   private String sCtrlAV45AlbProEst ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albenccli_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcod_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcodreo_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcodpar_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barser_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barserdsc_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcolnom_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barcolnum_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__bartipcol_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__fascod_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__fasdsc_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__baralbmtre_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barpremtr_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__baralbkgme_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__barprekgm_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albproesp_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albimpman_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__albprorec_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__guifaslin_Jsonclick ;
   private String edtavConfirmacionpreciodocumento_producciones_sdt__tabla_Jsonclick ;
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
   private boolean bGXsfl_47_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV47 ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_fases ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btndocumentosinconfirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmarprecios ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private ICheckbox chkavConfirmacionpreciodocumento_producciones_sdt__seleccion ;
   private GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item> AV12ConfirmacionPrecioDocumento_Producciones_SDT ;
   private GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item> GXt_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item7 ;
   private GXBaseCollection<app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item> GXv_objcol_SdtConfirmacionPrecioDocumento_Producciones_SDT_Item8[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.facturacion.SdtConfirmacionPrecioDocumento_Producciones_SDT_Item AV27Item_SDT ;
}

