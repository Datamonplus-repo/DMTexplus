package app.gestionlaboratorio ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class entradaensayolaboratorio_productos__wc_impl extends GXWebComponent
{
   public entradaensayolaboratorio_productos__wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public entradaensayolaboratorio_productos__wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( entradaensayolaboratorio_productos__wc_impl.class ));
   }

   public entradaensayolaboratorio_productos__wc_impl( int remoteHandle ,
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
      chkavEntradaensayolaboratorio_productos_sdt__seleccionar = UIFactory.getCheckbox(this);
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
               AV17Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
               AV23Lb_Numero = (int)(GXutil.lval( httpContext.GetPar( "Lb_Numero"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Lb_Numero), 8, 0));
               AV24Lb_opcion = httpContext.GetPar( "Lb_opcion") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Lb_opcion", AV24Lb_opcion);
               AV18Lb_CodGru = httpContext.GetPar( "Lb_CodGru") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Lb_CodGru", AV18Lb_CodGru);
               AV25Tipo_p = httpContext.GetPar( "Tipo_p") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Tipo_p", AV25Tipo_p);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV17Emprcod,Integer.valueOf(AV23Lb_Numero),AV24Lb_opcion,AV18Lb_CodGru,AV25Tipo_p});
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
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
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
      AV40Pgmname = httpContext.GetPar( "Pgmname") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV40Pgmname, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa27W2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Entrada Ensayo Laboratorio Productos", "")) ;
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
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.gestionlaboratorio.entradaensayolaboratorio_productos__wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV17Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV23Lb_Numero,8,0)),GXutil.URLEncode(GXutil.rtrim(AV24Lb_opcion)),GXutil.URLEncode(GXutil.rtrim(AV18Lb_CodGru)),GXutil.URLEncode(GXutil.rtrim(AV25Tipo_p))}, new String[] {"Emprcod","Lb_Numero","Lb_opcion","Lb_CodGru","Tipo_p"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaEnsayoLaboratorio_Productos__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV40Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayolaboratorio_productos__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Entradaensayolaboratorio_productos_sdt", AV12EntradaEnsayoLaboratorio_Productos_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Entradaensayolaboratorio_productos_sdt", AV12EntradaEnsayoLaboratorio_Productos_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_35, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV17Emprcod", GXutil.rtrim( wcpOAV17Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23Lb_Numero", GXutil.ltrim( localUtil.ntoc( wcpOAV23Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV24Lb_opcion", GXutil.rtrim( wcpOAV24Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV18Lb_CodGru", GXutil.rtrim( wcpOAV18Lb_CodGru));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV25Tipo_p", GXutil.rtrim( wcpOAV25Tipo_p));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT", AV12EntradaEnsayoLaboratorio_Productos_SDT);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT", AV12EntradaEnsayoLaboratorio_Productos_SDT);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTIPO_P", GXutil.rtrim( AV25Tipo_p));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV17Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_NUMERO", GXutil.ltrim( localUtil.ntoc( AV23Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_OPCION", GXutil.rtrim( AV24Lb_opcion));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLB_CODGRU", GXutil.rtrim( AV18Lb_CodGru));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV28Prdnum));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT_ITEM", AV27EntradaEnsayoLaboratorio_Productos_SDT_item);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT_ITEM", AV27EntradaEnsayoLaboratorio_Productos_SDT_item);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGXV8", GXutil.ltrim( localUtil.ntoc( AV41GXV8, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vF_ERROR", GXutil.ltrim( localUtil.ntoc( AV26F_error, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
   }

   public void renderHtmlCloseForm27W2( )
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
      return "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos__WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Ensayo Laboratorio Productos", "") ;
   }

   public void wb27W0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.gestionlaboratorio.entradaensayolaboratorio_productos__wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs hidden-sm hidden-md hidden-lg WWFiltersCell", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavTxttipo_Internalname+"\"", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'" + sGXsfl_35_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTxttipo_Internalname, GXutil.rtrim( AV22txtTipo), GXutil.rtrim( localUtil.format( AV22txtTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,19);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTxttipo_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavTxttipo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productos__WC.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1127w1_client"+"'", TempTags, "", 2, "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productos__WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productos__WC.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, sPrefix, "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
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
            GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
            GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
            AV33GXV1 = nGXsfl_35_idx ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV40Pgmname), GXutil.rtrim( localUtil.format( AV40Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_GestionLaboratorio\\EntradaEnsayoLaboratorio_Productos__WC.htm");
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
         wb_table1_52_27W2( true) ;
      }
      else
      {
         wb_table1_52_27W2( false) ;
      }
      return  ;
   }

   public void wb_table1_52_27W2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
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
               GridContainer.AddObjectProperty("GRID_nEOF", GRID_nEOF);
               GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
               AV33GXV1 = nGXsfl_35_idx ;
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

   public void start27W2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Ensayo Laboratorio Productos", ""), (short)(0)) ;
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
            strup27W0( ) ;
         }
      }
   }

   public void ws27W2( )
   {
      start27W2( ) ;
      evt27W2( ) ;
   }

   public void evt27W2( )
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
                              strup27W0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27W0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1227W2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27W0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e1327W2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27W0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavTxttipo_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27W0( ) ;
                           }
                           sEvt = httpContext.cgiGet( sPrefix+"GRIDPAGING") ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 71), "ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__SELECCIONAR.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup27W0( ) ;
                           }
                           nGXsfl_35_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_352( ) ;
                           AV33GXV1 = nGXsfl_35_idx ;
                           if ( ( AV12EntradaEnsayoLaboratorio_Productos_SDT.size() >= AV33GXV1 ) && ( AV33GXV1 > 0 ) )
                           {
                              AV12EntradaEnsayoLaboratorio_Productos_SDT.currentItem( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)) );
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
                                       GX_FocusControl = edtavTxttipo_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1427W2 ();
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
                                       GX_FocusControl = edtavTxttipo_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e1527W2 ();
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
                                       GX_FocusControl = edtavTxttipo_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1627W2 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__SELECCIONAR.CONTROLVALUECHANGED") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTxttipo_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e1727W2 ();
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
                                    strup27W0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavTxttipo_Internalname ;
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

   public void we27W2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm27W2( ) ;
         }
      }
   }

   public void pa27W2( )
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
            GX_FocusControl = edtavTxttipo_Internalname ;
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
                                 String AV40Pgmname ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e1527W2 ();
      GRID_nCurrentRecord = 0 ;
      rf27W2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaEnsayoLaboratorio_Productos__WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV40Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("gestionlaboratorio\\entradaensayolaboratorio_productos__wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rf27W2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV40Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Pgmname", AV40Pgmname);
      Gx_err = (short)(0) ;
      edtavTxttipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTxttipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxttipo_Enabled), 5, 0), true);
      edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavEntradaensayolaboratorio_productos_sdt__prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradaensayolaboratorio_productos_sdt__prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradaensayolaboratorio_productos_sdt__prdnum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavEntradaensayolaboratorio_productos_sdt__prdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradaensayolaboratorio_productos_sdt__prdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradaensayolaboratorio_productos_sdt__prdnom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavEntradaensayolaboratorio_productos_sdt__valcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradaensayolaboratorio_productos_sdt__valcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradaensayolaboratorio_productos_sdt__valcod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavEntradaensayolaboratorio_productos_sdt__valdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradaensayolaboratorio_productos_sdt__valdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradaensayolaboratorio_productos_sdt__valdsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf27W2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(35) ;
      /* Execute user event: Refresh */
      e1527W2 ();
      nGXsfl_35_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_352( ) ;
      bGXsfl_35_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
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
         subsflControlProps_352( ) ;
         e1627W2 ();
         if ( ( GRID_nCurrentRecord > 0 ) && ( GRID_nGridOutOfScope == 0 ) && ( nGXsfl_35_idx == 1 ) )
         {
            GRID_nCurrentRecord = 0 ;
            GRID_nGridOutOfScope = 1 ;
            subgrid_firstpage( ) ;
            e1627W2 ();
         }
         wbEnd = (short)(35) ;
         wb27W0( ) ;
      }
      bGXsfl_35_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes27W2( )
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
      return AV12EntradaEnsayoLaboratorio_Productos_SDT.size() ;
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
         gxgrgrid_refresh( subGrid_Rows, AV40Pgmname, sPrefix) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV40Pgmname, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV40Pgmname, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV40Pgmname, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV40Pgmname, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV40Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos__WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Pgmname", AV40Pgmname);
      Gx_err = (short)(0) ;
      edtavTxttipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTxttipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTxttipo_Enabled), 5, 0), true);
      edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavEntradaensayolaboratorio_productos_sdt__prdnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradaensayolaboratorio_productos_sdt__prdnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradaensayolaboratorio_productos_sdt__prdnum_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavEntradaensayolaboratorio_productos_sdt__prdnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradaensayolaboratorio_productos_sdt__prdnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradaensayolaboratorio_productos_sdt__prdnom_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavEntradaensayolaboratorio_productos_sdt__valcod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradaensayolaboratorio_productos_sdt__valcod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradaensayolaboratorio_productos_sdt__valcod_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavEntradaensayolaboratorio_productos_sdt__valdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntradaensayolaboratorio_productos_sdt__valdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntradaensayolaboratorio_productos_sdt__valdsc_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup27W0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1427W2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Entradaensayolaboratorio_productos_sdt"), AV12EntradaEnsayoLaboratorio_Productos_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT"), AV12EntradaEnsayoLaboratorio_Productos_SDT);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT_ITEM"), AV27EntradaEnsayoLaboratorio_Productos_SDT_item);
         /* Read saved values. */
         nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV17Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV17Emprcod") ;
         wcpOAV23Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV24Lb_opcion = httpContext.cgiGet( sPrefix+"wcpOAV24Lb_opcion") ;
         wcpOAV18Lb_CodGru = httpContext.cgiGet( sPrefix+"wcpOAV18Lb_CodGru") ;
         wcpOAV25Tipo_p = httpContext.cgiGet( sPrefix+"wcpOAV25Tipo_p") ;
         Gx_msg = httpContext.cgiGet( sPrefix+"vMSG") ;
         AV25Tipo_p = httpContext.cgiGet( sPrefix+"vTIPO_P") ;
         AV28Prdnum = httpContext.cgiGet( sPrefix+"vPRDNUM") ;
         AV41GXV8 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vGXV8"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV26F_error = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vF_ERROR"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_35_fel_idx = 0 ;
         while ( nGXsfl_35_fel_idx < nRC_GXsfl_35 )
         {
            nGXsfl_35_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_35_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_35_fel_idx+1) ;
            sGXsfl_35_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_352( ) ;
            AV33GXV1 = nGXsfl_35_fel_idx ;
            if ( ( AV12EntradaEnsayoLaboratorio_Productos_SDT.size() >= AV33GXV1 ) && ( AV33GXV1 > 0 ) )
            {
               AV12EntradaEnsayoLaboratorio_Productos_SDT.currentItem( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)) );
            }
         }
         if ( nGXsfl_35_fel_idx == 0 )
         {
            nGXsfl_35_idx = 1 ;
            sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_352( ) ;
         }
         nGXsfl_35_fel_idx = 1 ;
         /* Read variables values. */
         AV22txtTipo = httpContext.cgiGet( edtavTxttipo_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22txtTipo", AV22txtTipo);
         AV40Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Pgmname", AV40Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"EntradaEnsayoLaboratorio_Productos__WC");
         AV40Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40Pgmname", AV40Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV40Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("gestionlaboratorio\\entradaensayolaboratorio_productos__wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e1427W2 ();
      if (returnInSub) return;
   }

   public void e1427W2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV22txtTipo = ((GXutil.strcmp(AV25Tipo_p, "C")==0) ? httpContext.getMessage( "Colorantes", "") : httpContext.getMessage( "Productos", "")) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV22txtTipo", AV22txtTipo);
      GXt_char1 = AV19Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      entradaensayolaboratorio_productos__wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV19Station = GXt_char1 ;
      GXv_char2[0] = AV17Emprcod ;
      GXv_char3[0] = AV20EmprNom ;
      GXv_char4[0] = AV21UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV19Station, GXv_char2, GXv_char3, GXv_char4) ;
      entradaensayolaboratorio_productos__wc_impl.this.AV17Emprcod = GXv_char2[0] ;
      entradaensayolaboratorio_productos__wc_impl.this.AV20EmprNom = GXv_char3[0] ;
      entradaensayolaboratorio_productos__wc_impl.this.AV21UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
      subGrid_Rows = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S112 ();
      if (returnInSub) return;
      GXt_objcol_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item5 = AV12EntradaEnsayoLaboratorio_Productos_SDT ;
      GXv_objcol_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item6[0] = GXt_objcol_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item5 ;
      new app.gestionlaboratorio.entradaensayolaboratorio_productos_dp(remoteHandle, context).execute( AV17Emprcod, AV18Lb_CodGru, GXv_objcol_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item6) ;
      GXt_objcol_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item5 = GXv_objcol_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item6[0] ;
      AV12EntradaEnsayoLaboratorio_Productos_SDT = GXt_objcol_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item5 ;
      gx_BV35 = true ;
      AV12EntradaEnsayoLaboratorio_Productos_SDT.sort(httpContext.getMessage( "Lb_LinGru", ""));
      gx_BV35 = true ;
   }

   public void e1527W2( )
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
      /* Execute user subroutine: 'LOADGRIDSDT' */
      S132 ();
      if (returnInSub) return;
   }

   private void e1627W2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV33GXV1 = 1 ;
      while ( AV33GXV1 <= AV12EntradaEnsayoLaboratorio_Productos_SDT.size() )
      {
         AV12EntradaEnsayoLaboratorio_Productos_SDT.currentItem( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)) );
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(35) ;
         }
         if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
         {
            sendrow_352( ) ;
            GRID_nEOF = (byte)(0) ;
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            if ( GRID_nCurrentRecord + 1 >= subgrid_fnc_recordcount( ) )
            {
               GRID_nEOF = (byte)(1) ;
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
            }
         }
         GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_35_Refreshing )
         {
            httpContext.doAjaxLoad(35, GridRow);
         }
         AV33GXV1 = (int)(AV33GXV1+1) ;
      }
   }

   public void e1227W2( )
   {
      AV33GXV1 = nGXsfl_35_idx ;
      if ( ( AV33GXV1 > 0 ) && ( AV12EntradaEnsayoLaboratorio_Productos_SDT.size() >= AV33GXV1 ) )
      {
         AV12EntradaEnsayoLaboratorio_Productos_SDT.currentItem( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)) );
      }
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S142 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1327W2( )
   {
      /* 'DoCancelar' Routine */
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
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV29Linea_p = (short)(10) ;
      AV43GXV9 = 1 ;
      while ( AV43GXV9 <= AV12EntradaEnsayoLaboratorio_Productos_SDT.size() )
      {
         AV27EntradaEnsayoLaboratorio_Productos_SDT_item = (app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV43GXV9));
         if ( AV27EntradaEnsayoLaboratorio_Productos_SDT_item.getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar() )
         {
            AV30Lb_LinGru = AV27EntradaEnsayoLaboratorio_Productos_SDT_item.getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru() ;
            AV28Prdnum = AV27EntradaEnsayoLaboratorio_Productos_SDT_item.getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum() ;
            GXv_char4[0] = AV17Emprcod ;
            GXv_int8[0] = AV23Lb_Numero ;
            GXv_char3[0] = AV24Lb_opcion ;
            GXv_char2[0] = AV28Prdnum ;
            GXv_char9[0] = AV25Tipo_p ;
            GXv_int10[0] = AV29Linea_p ;
            new app.gestionlaboratorio.pens021(remoteHandle, context).execute( GXv_char4, GXv_int8, GXv_char3, GXv_char2, GXv_char9, GXv_int10) ;
            entradaensayolaboratorio_productos__wc_impl.this.AV17Emprcod = GXv_char4[0] ;
            entradaensayolaboratorio_productos__wc_impl.this.AV23Lb_Numero = GXv_int8[0] ;
            entradaensayolaboratorio_productos__wc_impl.this.AV24Lb_opcion = GXv_char3[0] ;
            entradaensayolaboratorio_productos__wc_impl.this.AV28Prdnum = GXv_char2[0] ;
            entradaensayolaboratorio_productos__wc_impl.this.AV25Tipo_p = GXv_char9[0] ;
            entradaensayolaboratorio_productos__wc_impl.this.AV29Linea_p = GXv_int10[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Lb_Numero), 8, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Lb_opcion", AV24Lb_opcion);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Tipo_p", AV25Tipo_p);
            AV29Linea_p = (short)(AV29Linea_p+10) ;
         }
         AV43GXV9 = (int)(AV43GXV9+1) ;
      }
      httpContext.GX_msglist.addItem(httpContext.getMessage( "Proceso finalizado", ""));
   }

   public void S112( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV13Session.getValue(AV40Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV40Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV13Session.getValue(AV40Pgmname+"GridState"), null, null);
      }
   }

   public void S122( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV13Session.getValue(AV40Pgmname+"GridState"), null, null);
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV40Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void e1727W2( )
   {
      AV33GXV1 = nGXsfl_35_idx ;
      if ( ( AV33GXV1 > 0 ) && ( AV12EntradaEnsayoLaboratorio_Productos_SDT.size() >= AV33GXV1 ) )
      {
         AV12EntradaEnsayoLaboratorio_Productos_SDT.currentItem( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)) );
      }
      /* Entradaensayolaboratorio_productos_sdt__seleccionar_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)(AV12EntradaEnsayoLaboratorio_Productos_SDT.currentItem())).getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod() == 3 )
      {
         ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)(AV12EntradaEnsayoLaboratorio_Productos_SDT.currentItem())).setgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar( false );
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV12EntradaEnsayoLaboratorio_Productos_SDT", AV12EntradaEnsayoLaboratorio_Productos_SDT);
      nGXsfl_35_bak_idx = nGXsfl_35_idx ;
      gxgrgrid_refresh( subGrid_Rows, AV40Pgmname, sPrefix) ;
      nGXsfl_35_idx = nGXsfl_35_bak_idx ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_352( ) ;
   }

   public void wb_table1_52_27W2( boolean wbgen )
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
         ucDvelop_confirmpanel_confirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_confirmar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_52_27W2e( true) ;
      }
      else
      {
         wb_table1_52_27W2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV17Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
      AV23Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Lb_Numero), 8, 0));
      AV24Lb_opcion = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Lb_opcion", AV24Lb_opcion);
      AV18Lb_CodGru = (String)getParm(obj,3,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Lb_CodGru", AV18Lb_CodGru);
      AV25Tipo_p = (String)getParm(obj,4,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Tipo_p", AV25Tipo_p);
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
      pa27W2( ) ;
      ws27W2( ) ;
      we27W2( ) ;
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
      sCtrlAV17Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV23Lb_Numero = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV24Lb_opcion = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV18Lb_CodGru = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV25Tipo_p = (String)getParm(obj,4,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa27W2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "gestionlaboratorio\\entradaensayolaboratorio_productos__wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa27W2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV17Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
         AV23Lb_Numero = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Lb_Numero), 8, 0));
         AV24Lb_opcion = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Lb_opcion", AV24Lb_opcion);
         AV18Lb_CodGru = (String)getParm(obj,5,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Lb_CodGru", AV18Lb_CodGru);
         AV25Tipo_p = (String)getParm(obj,6,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Tipo_p", AV25Tipo_p);
      }
      wcpOAV17Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV17Emprcod") ;
      wcpOAV23Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV23Lb_Numero"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV24Lb_opcion = httpContext.cgiGet( sPrefix+"wcpOAV24Lb_opcion") ;
      wcpOAV18Lb_CodGru = httpContext.cgiGet( sPrefix+"wcpOAV18Lb_CodGru") ;
      wcpOAV25Tipo_p = httpContext.cgiGet( sPrefix+"wcpOAV25Tipo_p") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV17Emprcod, wcpOAV17Emprcod) != 0 ) || ( AV23Lb_Numero != wcpOAV23Lb_Numero ) || ( GXutil.strcmp(AV24Lb_opcion, wcpOAV24Lb_opcion) != 0 ) || ( GXutil.strcmp(AV18Lb_CodGru, wcpOAV18Lb_CodGru) != 0 ) || ( GXutil.strcmp(AV25Tipo_p, wcpOAV25Tipo_p) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV17Emprcod = AV17Emprcod ;
      wcpOAV23Lb_Numero = AV23Lb_Numero ;
      wcpOAV24Lb_opcion = AV24Lb_opcion ;
      wcpOAV18Lb_CodGru = AV18Lb_CodGru ;
      wcpOAV25Tipo_p = AV25Tipo_p ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV17Emprcod = httpContext.cgiGet( sPrefix+"AV17Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV17Emprcod) > 0 )
      {
         AV17Emprcod = httpContext.cgiGet( sCtrlAV17Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17Emprcod", AV17Emprcod);
      }
      else
      {
         AV17Emprcod = httpContext.cgiGet( sPrefix+"AV17Emprcod_PARM") ;
      }
      sCtrlAV23Lb_Numero = httpContext.cgiGet( sPrefix+"AV23Lb_Numero_CTRL") ;
      if ( GXutil.len( sCtrlAV23Lb_Numero) > 0 )
      {
         AV23Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV23Lb_Numero), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Lb_Numero", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23Lb_Numero), 8, 0));
      }
      else
      {
         AV23Lb_Numero = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV23Lb_Numero_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV24Lb_opcion = httpContext.cgiGet( sPrefix+"AV24Lb_opcion_CTRL") ;
      if ( GXutil.len( sCtrlAV24Lb_opcion) > 0 )
      {
         AV24Lb_opcion = httpContext.cgiGet( sCtrlAV24Lb_opcion) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV24Lb_opcion", AV24Lb_opcion);
      }
      else
      {
         AV24Lb_opcion = httpContext.cgiGet( sPrefix+"AV24Lb_opcion_PARM") ;
      }
      sCtrlAV18Lb_CodGru = httpContext.cgiGet( sPrefix+"AV18Lb_CodGru_CTRL") ;
      if ( GXutil.len( sCtrlAV18Lb_CodGru) > 0 )
      {
         AV18Lb_CodGru = httpContext.cgiGet( sCtrlAV18Lb_CodGru) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18Lb_CodGru", AV18Lb_CodGru);
      }
      else
      {
         AV18Lb_CodGru = httpContext.cgiGet( sPrefix+"AV18Lb_CodGru_PARM") ;
      }
      sCtrlAV25Tipo_p = httpContext.cgiGet( sPrefix+"AV25Tipo_p_CTRL") ;
      if ( GXutil.len( sCtrlAV25Tipo_p) > 0 )
      {
         AV25Tipo_p = httpContext.cgiGet( sCtrlAV25Tipo_p) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25Tipo_p", AV25Tipo_p);
      }
      else
      {
         AV25Tipo_p = httpContext.cgiGet( sPrefix+"AV25Tipo_p_PARM") ;
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
      pa27W2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws27W2( ) ;
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
      ws27W2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Emprcod_PARM", GXutil.rtrim( AV17Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV17Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV17Emprcod_CTRL", GXutil.rtrim( sCtrlAV17Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Lb_Numero_PARM", GXutil.ltrim( localUtil.ntoc( AV23Lb_Numero, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23Lb_Numero)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Lb_Numero_CTRL", GXutil.rtrim( sCtrlAV23Lb_Numero));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Lb_opcion_PARM", GXutil.rtrim( AV24Lb_opcion));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV24Lb_opcion)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV24Lb_opcion_CTRL", GXutil.rtrim( sCtrlAV24Lb_opcion));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Lb_CodGru_PARM", GXutil.rtrim( AV18Lb_CodGru));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV18Lb_CodGru)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV18Lb_CodGru_CTRL", GXutil.rtrim( sCtrlAV18Lb_CodGru));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Tipo_p_PARM", GXutil.rtrim( AV25Tipo_p));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV25Tipo_p)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV25Tipo_p_CTRL", GXutil.rtrim( sCtrlAV25Tipo_p));
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
      we27W2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682115551562", true, true);
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
      httpContext.AddJavascriptSource("gestionlaboratorio/entradaensayolaboratorio_productos__wc.js", "?202682115551562", false, true);
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

   public void subsflControlProps_352( )
   {
      chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setInternalname( sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__SELECCIONAR_"+sGXsfl_35_idx );
      edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__LB_LINGRU_"+sGXsfl_35_idx ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnum_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__PRDNUM_"+sGXsfl_35_idx ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnom_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__PRDNOM_"+sGXsfl_35_idx ;
      edtavEntradaensayolaboratorio_productos_sdt__valcod_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__VALCOD_"+sGXsfl_35_idx ;
      edtavEntradaensayolaboratorio_productos_sdt__valdsc_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__VALDSC_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_352( )
   {
      chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setInternalname( sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__SELECCIONAR_"+sGXsfl_35_fel_idx );
      edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__LB_LINGRU_"+sGXsfl_35_fel_idx ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnum_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__PRDNUM_"+sGXsfl_35_fel_idx ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnom_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__PRDNOM_"+sGXsfl_35_fel_idx ;
      edtavEntradaensayolaboratorio_productos_sdt__valcod_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__VALCOD_"+sGXsfl_35_fel_idx ;
      edtavEntradaensayolaboratorio_productos_sdt__valdsc_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__VALDSC_"+sGXsfl_35_fel_idx ;
   }

   public void sendrow_352( )
   {
      subsflControlProps_352( ) ;
      wb27W0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_35_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_35_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavEntradaensayolaboratorio_productos_sdt__seleccionar.getEnabled()!=0)&&(chkavEntradaensayolaboratorio_productos_sdt__seleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 36,'"+sPrefix+"',false,'"+sGXsfl_35_idx+"',35)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__SELECCIONAR_" + sGXsfl_35_idx ;
         chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setName( GXCCtl );
         chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setWebtags( "" );
         chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEntradaensayolaboratorio_productos_sdt__seleccionar.getInternalname(), "TitleCaption", chkavEntradaensayolaboratorio_productos_sdt__seleccionar.getCaption(), !bGXsfl_35_Refreshing);
         chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setCheckedValue( "false" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavEntradaensayolaboratorio_productos_sdt__seleccionar.getInternalname(),GXutil.booltostr( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)).getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Seleccionar()),"","",Integer.valueOf(-1),Integer.valueOf(1),"true","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(36, this, 'true', 'false',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavEntradaensayolaboratorio_productos_sdt__seleccionar.getEnabled()!=0)&&(chkavEntradaensayolaboratorio_productos_sdt__seleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,36);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)).getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru(), (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)).getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru()), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)).getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Lb_lingru()), "ZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradaensayolaboratorio_productos_sdt__prdnum_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)).getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnum()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradaensayolaboratorio_productos_sdt__prdnum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEntradaensayolaboratorio_productos_sdt__prdnum_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradaensayolaboratorio_productos_sdt__prdnom_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)).getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Prdnom()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradaensayolaboratorio_productos_sdt__prdnom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEntradaensayolaboratorio_productos_sdt__prdnom_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradaensayolaboratorio_productos_sdt__valcod_Internalname,GXutil.ltrim( localUtil.ntoc( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)).getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod(), (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavEntradaensayolaboratorio_productos_sdt__valcod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)).getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod()), "9") : localUtil.format( DecimalUtil.doubleToDec(((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)).getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valcod()), "9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradaensayolaboratorio_productos_sdt__valcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEntradaensayolaboratorio_productos_sdt__valcod_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntradaensayolaboratorio_productos_sdt__valdsc_Internalname,GXutil.rtrim( ((app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item)AV12EntradaEnsayoLaboratorio_Productos_SDT.elementAt(-1+AV33GXV1)).getgxTv_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item_Valdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntradaensayolaboratorio_productos_sdt__valdsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavEntradaensayolaboratorio_productos_sdt__valdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes27W2( ) ;
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
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"35\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Op", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validez", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
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
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradaensayolaboratorio_productos_sdt__prdnum_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradaensayolaboratorio_productos_sdt__prdnom_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradaensayolaboratorio_productos_sdt__valcod_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavEntradaensayolaboratorio_productos_sdt__valdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      edtavTxttipo_Internalname = sPrefix+"vTXTTIPO" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setInternalname( sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__SELECCIONAR" );
      edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__LB_LINGRU" ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnum_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__PRDNUM" ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnom_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__PRDNOM" ;
      edtavEntradaensayolaboratorio_productos_sdt__valcod_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__VALCOD" ;
      edtavEntradaensayolaboratorio_productos_sdt__valdsc_Internalname = sPrefix+"ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__VALDSC" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Dvelop_confirmpanel_confirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR" ;
      tblTabledvelop_confirmpanel_confirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_CONFIRMAR" ;
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
      edtavEntradaensayolaboratorio_productos_sdt__valdsc_Jsonclick = "" ;
      edtavEntradaensayolaboratorio_productos_sdt__valdsc_Enabled = 0 ;
      edtavEntradaensayolaboratorio_productos_sdt__valcod_Jsonclick = "" ;
      edtavEntradaensayolaboratorio_productos_sdt__valcod_Enabled = 0 ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnom_Jsonclick = "" ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnom_Enabled = 0 ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnum_Jsonclick = "" ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnum_Enabled = 0 ;
      edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Jsonclick = "" ;
      edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Enabled = 0 ;
      chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setCaption( "" );
      chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setVisible( -1 );
      chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavEntradaensayolaboratorio_productos_sdt__valdsc_Enabled = -1 ;
      edtavEntradaensayolaboratorio_productos_sdt__valcod_Enabled = -1 ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnom_Enabled = -1 ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnum_Enabled = -1 ;
      edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Enabled = -1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavTxttipo_Jsonclick = "" ;
      edtavTxttipo_Enabled = 1 ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
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
      subGrid_Rows = 50 ;
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
      GXCCtl = "ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__SELECCIONAR_" + sGXsfl_35_idx ;
      chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setName( GXCCtl );
      chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setWebtags( "" );
      chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavEntradaensayolaboratorio_productos_sdt__seleccionar.getInternalname(), "TitleCaption", chkavEntradaensayolaboratorio_productos_sdt__seleccionar.getCaption(), !bGXsfl_35_Refreshing);
      chkavEntradaensayolaboratorio_productos_sdt__seleccionar.setCheckedValue( "false" );
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV12EntradaEnsayoLaboratorio_Productos_SDT',fld:'vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT',grid:35,pic:''},{av:'nGXsfl_35_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:35},{av:'nRC_GXsfl_35',ctrl:'GRID',prop:'GridRC',grid:35},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("GRID.LOAD","{handler:'e1627W2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e1127W1',iparms:[{av:'AV12EntradaEnsayoLaboratorio_Productos_SDT',fld:'vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT',grid:35,pic:''},{av:'nGXsfl_35_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:35},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_35',ctrl:'GRID',prop:'GridRC',grid:35},{av:'AV25Tipo_p',fld:'vTIPO_P',pic:''},{av:'Gx_msg',fld:'vMSG',pic:''}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[{av:'Gx_msg',fld:'vMSG',pic:''}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e1227W2',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'AV12EntradaEnsayoLaboratorio_Productos_SDT',fld:'vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT',grid:35,pic:''},{av:'nGXsfl_35_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:35},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_35',ctrl:'GRID',prop:'GridRC',grid:35},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV24Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV25Tipo_p',fld:'vTIPO_P',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV25Tipo_p',fld:'vTIPO_P',pic:''},{av:'AV24Lb_opcion',fld:'vLB_OPCION',pic:'@!'},{av:'AV23Lb_Numero',fld:'vLB_NUMERO',pic:'ZZZZZZZ9'},{av:'AV17Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e1327W2',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__SELECCIONAR.CONTROLVALUECHANGED","{handler:'e1727W2',iparms:[{av:'AV12EntradaEnsayoLaboratorio_Productos_SDT',fld:'vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT',grid:35,pic:''},{av:'nGXsfl_35_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:35},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_35',ctrl:'GRID',prop:'GridRC',grid:35},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("ENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT__SELECCIONAR.CONTROLVALUECHANGED",",oparms:[{av:'AV12EntradaEnsayoLaboratorio_Productos_SDT',fld:'vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT',grid:35,pic:''},{av:'nGXsfl_35_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:35},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_35',ctrl:'GRID',prop:'GridRC',grid:35}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12EntradaEnsayoLaboratorio_Productos_SDT',fld:'vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT',grid:35,pic:''},{av:'nGXsfl_35_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:35},{av:'nRC_GXsfl_35',ctrl:'GRID',prop:'GridRC',grid:35}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12EntradaEnsayoLaboratorio_Productos_SDT',fld:'vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT',grid:35,pic:''},{av:'nGXsfl_35_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:35},{av:'nRC_GXsfl_35',ctrl:'GRID',prop:'GridRC',grid:35}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12EntradaEnsayoLaboratorio_Productos_SDT',fld:'vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT',grid:35,pic:''},{av:'nGXsfl_35_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:35},{av:'nRC_GXsfl_35',ctrl:'GRID',prop:'GridRC',grid:35}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV40Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12EntradaEnsayoLaboratorio_Productos_SDT',fld:'vENTRADAENSAYOLABORATORIO_PRODUCTOS_SDT',grid:35,pic:''},{av:'nGXsfl_35_idx', ctrl: 'GRID', prop:'GridCurrRow', grid:35},{av:'nRC_GXsfl_35',ctrl:'GRID',prop:'GridRC',grid:35}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Gxv7',iparms:[]");
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
      wcpOAV24Lb_opcion = "" ;
      wcpOAV18Lb_CodGru = "" ;
      wcpOAV25Tipo_p = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV17Emprcod = "" ;
      AV24Lb_opcion = "" ;
      AV18Lb_CodGru = "" ;
      AV25Tipo_p = "" ;
      AV40Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV12EntradaEnsayoLaboratorio_Productos_SDT = new GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item>(app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      Gx_msg = "" ;
      AV28Prdnum = "" ;
      AV27EntradaEnsayoLaboratorio_Productos_SDT_item = new app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item(remoteHandle, context);
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV22txtTipo = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      GXCCtl = "" ;
      hsh = "" ;
      AV19Station = "" ;
      GXt_char1 = "" ;
      AV20EmprNom = "" ;
      AV21UsurCod = "" ;
      GXt_objcol_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item5 = new GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item>(app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item.class, "Item", "TexplusNET", remoteHandle);
      GXv_objcol_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item6 = new GXBaseCollection[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      GXv_char4 = new String[1] ;
      GXv_int8 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char9 = new String[1] ;
      GXv_int10 = new short[1] ;
      AV13Session = httpContext.getWebSession();
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV17Emprcod = "" ;
      sCtrlAV23Lb_Numero = "" ;
      sCtrlAV24Lb_opcion = "" ;
      sCtrlAV18Lb_CodGru = "" ;
      sCtrlAV25Tipo_p = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      AV40Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos__WC" ;
      /* GeneXus formulas. */
      AV40Pgmname = "GestionLaboratorio.EntradaEnsayoLaboratorio_Productos__WC" ;
      Gx_err = (short)(0) ;
      edtavTxttipo_Enabled = 0 ;
      edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Enabled = 0 ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnum_Enabled = 0 ;
      edtavEntradaensayolaboratorio_productos_sdt__prdnom_Enabled = 0 ;
      edtavEntradaensayolaboratorio_productos_sdt__valcod_Enabled = 0 ;
      edtavEntradaensayolaboratorio_productos_sdt__valdsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV26F_error ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV29Linea_p ;
   private short AV30Lb_LinGru ;
   private short GXv_int10[] ;
   private int wcpOAV23Lb_Numero ;
   private int nRC_GXsfl_35 ;
   private int AV23Lb_Numero ;
   private int subGrid_Rows ;
   private int nGXsfl_35_idx=1 ;
   private int AV41GXV8 ;
   private int edtavTxttipo_Enabled ;
   private int AV33GXV1 ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Enabled ;
   private int edtavEntradaensayolaboratorio_productos_sdt__prdnum_Enabled ;
   private int edtavEntradaensayolaboratorio_productos_sdt__prdnom_Enabled ;
   private int edtavEntradaensayolaboratorio_productos_sdt__valcod_Enabled ;
   private int edtavEntradaensayolaboratorio_productos_sdt__valdsc_Enabled ;
   private int GRID_nGridOutOfScope ;
   private int nGXsfl_35_fel_idx=1 ;
   private int AV43GXV9 ;
   private int GXv_int8[] ;
   private int nGXsfl_35_bak_idx=1 ;
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
   private String wcpOAV17Emprcod ;
   private String wcpOAV24Lb_opcion ;
   private String wcpOAV18Lb_CodGru ;
   private String wcpOAV25Tipo_p ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV17Emprcod ;
   private String AV24Lb_opcion ;
   private String AV18Lb_CodGru ;
   private String AV25Tipo_p ;
   private String sGXsfl_35_idx="0001" ;
   private String AV40Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Gx_msg ;
   private String AV28Prdnum ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvelop_confirmpanel_confirmar_Title ;
   private String Dvelop_confirmpanel_confirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_confirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_confirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavTxttipo_Internalname ;
   private String TempTags ;
   private String AV22txtTipo ;
   private String edtavTxttipo_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
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
   private String GXCCtl ;
   private String edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Internalname ;
   private String edtavEntradaensayolaboratorio_productos_sdt__prdnum_Internalname ;
   private String edtavEntradaensayolaboratorio_productos_sdt__prdnom_Internalname ;
   private String edtavEntradaensayolaboratorio_productos_sdt__valcod_Internalname ;
   private String edtavEntradaensayolaboratorio_productos_sdt__valdsc_Internalname ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String hsh ;
   private String AV19Station ;
   private String GXt_char1 ;
   private String AV20EmprNom ;
   private String AV21UsurCod ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char9[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String sCtrlAV17Emprcod ;
   private String sCtrlAV23Lb_Numero ;
   private String sCtrlAV24Lb_opcion ;
   private String sCtrlAV18Lb_CodGru ;
   private String sCtrlAV25Tipo_p ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtavEntradaensayolaboratorio_productos_sdt__lb_lingru_Jsonclick ;
   private String edtavEntradaensayolaboratorio_productos_sdt__prdnum_Jsonclick ;
   private String edtavEntradaensayolaboratorio_productos_sdt__prdnom_Jsonclick ;
   private String edtavEntradaensayolaboratorio_productos_sdt__valcod_Jsonclick ;
   private String edtavEntradaensayolaboratorio_productos_sdt__valdsc_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_BV35 ;
   private boolean gx_refresh_fired ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.WebSession AV13Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private ICheckbox chkavEntradaensayolaboratorio_productos_sdt__seleccionar ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item> AV12EntradaEnsayoLaboratorio_Productos_SDT ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item> GXt_objcol_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item5 ;
   private GXBaseCollection<app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item> GXv_objcol_SdtEntradaEnsayoLaboratorio_Productos_SDT_Item6[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.gestionlaboratorio.SdtEntradaEnsayoLaboratorio_Productos_SDT_Item AV27EntradaEnsayoLaboratorio_Productos_SDT_item ;
}

