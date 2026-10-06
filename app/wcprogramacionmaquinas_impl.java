package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcprogramacionmaquinas_impl extends GXWebComponent
{
   public wcprogramacionmaquinas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcprogramacionmaquinas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcprogramacionmaquinas_impl.class ));
   }

   public wcprogramacionmaquinas_impl( int remoteHandle ,
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
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( GXutil.len( sPrefix) == 0 )
      {
         if ( nGotPars == 0 )
         {
            entryPointCalled = false ;
            gxfirstwebparm = httpContext.GetFirstPar( "MaqCodVisibleJson") ;
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
               AV23MaqCodVisibleJson = httpContext.GetPar( "MaqCodVisibleJson") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCodVisibleJson", AV23MaqCodVisibleJson);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV23MaqCodVisibleJson});
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
               gxfirstwebparm = httpContext.GetFirstPar( "MaqCodVisibleJson") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
            {
               if ( ! httpContext.IsValidAjaxCall( true) )
               {
                  GxWebError = (byte)(1) ;
                  return  ;
               }
               gxfirstwebparm = httpContext.GetFirstPar( "MaqCodVisibleJson") ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridhdrs") == 0 )
            {
               gxnrgridhdrs_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridhdrs") == 0 )
            {
               gxgrgridhdrs_refresh_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxNewRow_"+"Gridmaquinas") == 0 )
            {
               gxnrgridmaquinas_newrow_invoke( ) ;
               return  ;
            }
            else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxGridRefresh_"+"Gridmaquinas") == 0 )
            {
               gxgrgridmaquinas_refresh_invoke( ) ;
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

   public void gxnrgridhdrs_newrow_invoke( )
   {
      nRC_GXsfl_35 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_35"))) ;
      nGXsfl_35_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_35_idx"))) ;
      sGXsfl_35_idx = httpContext.GetPar( "sGXsfl_35_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      edtavBarcod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtavBarcodreo_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtavBarcodpar_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Visible), 5, 0), !bGXsfl_35_Refreshing);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridhdrs_newrow( ) ;
      /* End function gxnrGridhdrs_newrow_invoke */
   }

   public void gxgrgridhdrs_refresh_invoke( )
   {
      AV15Emprcod = httpContext.GetPar( "Emprcod") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV21MaqCodVisible);
      AV27PrefijoMaqCod = httpContext.GetPar( "PrefijoMaqCod") ;
      edtavBarcod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtavBarcodreo_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtavBarcodpar_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Visible), 5, 0), !bGXsfl_35_Refreshing);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV6SDTHdrsporMaquinaCollection);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV7SDTMaquinaCollection);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridhdrs_refresh( AV15Emprcod, AV21MaqCodVisible, AV27PrefijoMaqCod, AV6SDTHdrsporMaquinaCollection, AV7SDTMaquinaCollection, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridhdrs_refresh_invoke */
   }

   public void gxnrgridmaquinas_newrow_invoke( )
   {
      nRC_GXsfl_17 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_17"))) ;
      nGXsfl_17_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_17_idx"))) ;
      sGXsfl_17_idx = httpContext.GetPar( "sGXsfl_17_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      edtavMaqcod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), !bGXsfl_17_Refreshing);
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxnrgridmaquinas_newrow( ) ;
      /* End function gxnrGridmaquinas_newrow_invoke */
   }

   public void gxgrgridmaquinas_refresh_invoke( )
   {
      AV15Emprcod = httpContext.GetPar( "Emprcod") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV21MaqCodVisible);
      AV27PrefijoMaqCod = httpContext.GetPar( "PrefijoMaqCod") ;
      edtavMaqcod_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), !bGXsfl_17_Refreshing);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV7SDTMaquinaCollection);
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV6SDTHdrsporMaquinaCollection);
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgridmaquinas_refresh( AV15Emprcod, AV21MaqCodVisible, AV27PrefijoMaqCod, AV7SDTMaquinaCollection, AV6SDTHdrsporMaquinaCollection, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGridmaquinas_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paN02( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "WCProgramacion Maquinas", "")) ;
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
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcprogramacionmaquinas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23MaqCodVisibleJson))}, new String[] {"MaqCodVisibleJson"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCODVISIBLE", getSecureSignedToken( sPrefix, AV21MaqCodVisible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPREFIJOMAQCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV27PrefijoMaqCod, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( sPrefix, AV7SDTMaquinaCollection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTHDRSPORMAQUINACOLLECTION", getSecureSignedToken( sPrefix, AV6SDTHdrsporMaquinaCollection));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"Sdtmaquina", AV29SDTMaquina);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"Sdtmaquina", AV29SDTMaquina);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_17", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_17, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23MaqCodVisibleJson", wcpOAV23MaqCodVisibleJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV15Emprcod));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMAQCODVISIBLE", AV21MaqCodVisible);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMAQCODVISIBLE", AV21MaqCodVisible);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCODVISIBLE", getSecureSignedToken( sPrefix, AV21MaqCodVisible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPREFIJOMAQCOD", GXutil.rtrim( AV27PrefijoMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPREFIJOMAQCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV27PrefijoMaqCod, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTMAQUINACOLLECTION", AV7SDTMaquinaCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTMAQUINACOLLECTION", AV7SDTMaquinaCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( sPrefix, AV7SDTMaquinaCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTHDRSPORMAQUINACOLLECTION", AV6SDTHdrsporMaquinaCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTHDRSPORMAQUINACOLLECTION", AV6SDTHdrsporMaquinaCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTHDRSPORMAQUINACOLLECTION", getSecureSignedToken( sPrefix, AV6SDTHdrsporMaquinaCollection));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCODVISIBLEJSON", AV23MaqCodVisibleJson);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELPROGRAMACION_Autowidth", GXutil.booltostr( Dvpanel_panelprogramacion_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELPROGRAMACION_Autoheight", GXutil.booltostr( Dvpanel_panelprogramacion_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELPROGRAMACION_Cls", GXutil.rtrim( Dvpanel_panelprogramacion_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELPROGRAMACION_Title", GXutil.rtrim( Dvpanel_panelprogramacion_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELPROGRAMACION_Collapsible", GXutil.booltostr( Dvpanel_panelprogramacion_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELPROGRAMACION_Showcollapseicon", GXutil.booltostr( Dvpanel_panelprogramacion_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_PANELPROGRAMACION_Iconposition", GXutil.rtrim( Dvpanel_panelprogramacion_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINAS_Class", GXutil.rtrim( subGridmaquinas_Class));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDMAQUINAS_Variablewidth", GXutil.rtrim( subGridmaquinas_Variablewidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMAQCOD_Visible", GXutil.ltrim( localUtil.ntoc( edtavMaqcod_Visible, (byte)(5), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseFormN02( )
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
      return "WCProgramacionMaquinas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "WCProgramacion Maquinas", "") ;
   }

   public void wbN00( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcprogramacionmaquinas");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
            httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
         }
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), "", "", sPrefix, "false");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablecontent_Internalname, 1, 0, "px", 0, "px", divTablecontent_Class, "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucDvpanel_panelprogramacion.setProperty("AutoWidth", Dvpanel_panelprogramacion_Autowidth);
         ucDvpanel_panelprogramacion.setProperty("AutoHeight", Dvpanel_panelprogramacion_Autoheight);
         ucDvpanel_panelprogramacion.setProperty("Cls", Dvpanel_panelprogramacion_Cls);
         ucDvpanel_panelprogramacion.setProperty("Title", Dvpanel_panelprogramacion_Title);
         ucDvpanel_panelprogramacion.setProperty("Collapsible", Dvpanel_panelprogramacion_Collapsible);
         ucDvpanel_panelprogramacion.setProperty("ShowCollapseIcon", Dvpanel_panelprogramacion_Showcollapseicon);
         ucDvpanel_panelprogramacion.setProperty("IconPosition", Dvpanel_panelprogramacion_Iconposition);
         ucDvpanel_panelprogramacion.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_panelprogramacion_Internalname, sPrefix+"DVPANEL_PANELPROGRAMACIONContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_PANELPROGRAMACIONContainer"+"PanelProgramacion"+"\" style=\"display:none;\">") ;
         wb_table1_14_N02( true) ;
      }
      else
      {
         wb_table1_14_N02( false) ;
      }
      return  ;
   }

   public void wb_table1_14_N02e( boolean wbgen )
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 17 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridmaquinasContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridmaquinasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridmaquinas", GridmaquinasContainer, subGridmaquinas_Internalname);
               if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridmaquinasContainerData", GridmaquinasContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridmaquinasContainerData"+"V", GridmaquinasContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridmaquinasContainerData"+"V"+"\" value='"+GridmaquinasContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      if ( wbEnd == 35 )
      {
         wbEnd = (short)(0) ;
         if ( isFullAjaxMode( ) )
         {
            if ( GridhdrsContainer.GetWrapped() == 1 )
            {
               httpContext.writeText( "</table>") ;
               httpContext.writeText( "</div>") ;
            }
            else
            {
               sStyleString = "" ;
               httpContext.writeText( "<div id=\""+sPrefix+"GridhdrsContainer"+"Div\" "+sStyleString+">"+"</div>") ;
               httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridhdrs", GridhdrsContainer, subGridhdrs_Internalname);
               if ( ! isAjaxCallMode( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridhdrsContainerData", GridhdrsContainer.ToJavascriptSource());
               }
               if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
               {
                  app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridhdrsContainerData"+"V", GridhdrsContainer.GridValuesHidden());
               }
               else
               {
                  httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridhdrsContainerData"+"V"+"\" value='"+GridhdrsContainer.GridValuesHidden()+"'/>") ;
               }
            }
         }
      }
      wbLoad = true ;
   }

   public void startN02( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "WCProgramacion Maquinas", ""), (short)(0)) ;
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
            strupN00( ) ;
         }
      }
   }

   public void wsN02( )
   {
      startN02( ) ;
      evtN02( ) ;
   }

   public void evtN02( )
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
                              strupN00( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "TBLHDR.CLICK") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupN00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e11N02 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupN00( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavMaqcod_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "GRIDMAQUINAS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 13), "GRIDHDRS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "TBLHDR.CLICK") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupN00( ) ;
                           }
                           nGXsfl_17_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_172( ) ;
                           AV5Maqcod = httpContext.cgiGet( edtavMaqcod_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcod_Internalname, AV5Maqcod);
                           AV29SDTMaquina.setgxTv_SdtSDTMaquina_Maqdsc( httpContext.cgiGet( edtavSdtmaquina_maqdsc_Internalname) );
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
                                       GX_FocusControl = edtavMaqcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e12N02 ();
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
                                       GX_FocusControl = edtavMaqcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e13N02 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRIDMAQUINAS.LOAD") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMaqcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e14N02 ();
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
                                    strupN00( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavMaqcod_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                              sEvtType = GXutil.right( sEvt, 4) ;
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-4) ;
                              if ( ( GXutil.strcmp(GXutil.left( sEvt, 13), "GRIDHDRS.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "TBLHDR.CLICK") == 0 ) )
                              {
                                 if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                 {
                                    strupN00( ) ;
                                 }
                                 nGXsfl_35_idx = (int)(GXutil.lval( sEvtType)) ;
                                 sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") + sGXsfl_17_idx ;
                                 subsflControlProps_353( ) ;
                                 AV30Texto = httpContext.cgiGet( edtavTexto_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTexto_Internalname, AV30Texto);
                                 AV9BarCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavBarcod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
                                 AV11BarCodReo = (byte)(localUtil.ctol( httpContext.cgiGet( edtavBarcodreo_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreo_Internalname, GXutil.str( AV11BarCodReo, 1, 0));
                                 AV10BarCodPar = httpContext.cgiGet( edtavBarcodpar_Internalname) ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpar_Internalname, AV10BarCodPar);
                                 sEvtType = GXutil.right( sEvt, 1) ;
                                 if ( GXutil.strcmp(sEvtType, ".") == 0 )
                                 {
                                    sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                                    if ( GXutil.strcmp(sEvt, "GRIDHDRS.LOAD") == 0 )
                                    {
                                       if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                       {
                                          httpContext.wbHandled = (byte)(1) ;
                                          if ( ! wbErr )
                                          {
                                             dynload_actions( ) ;
                                             e15N03 ();
                                          }
                                       }
                                    }
                                    else if ( GXutil.strcmp(sEvt, "TBLHDR.CLICK") == 0 )
                                    {
                                       if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                       {
                                          httpContext.wbHandled = (byte)(1) ;
                                          if ( ! wbErr )
                                          {
                                             dynload_actions( ) ;
                                             e11N02 ();
                                          }
                                       }
                                    }
                                    else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                                    {
                                       if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                                       {
                                          strupN00( ) ;
                                       }
                                       if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                       {
                                          httpContext.wbHandled = (byte)(1) ;
                                          if ( ! wbErr )
                                          {
                                             dynload_actions( ) ;
                                             GX_FocusControl = edtavMaqcod_Internalname ;
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
                     }
                  }
                  httpContext.wbHandled = (byte)(1) ;
               }
            }
         }
      }
   }

   public void weN02( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormN02( ) ;
         }
      }
   }

   public void paN02( )
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

   public void gxnrgridmaquinas_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_172( ) ;
      while ( nGXsfl_17_idx <= nRC_GXsfl_17 )
      {
         sendrow_172( ) ;
         nGXsfl_17_idx = ((subGridmaquinas_Islastpage==1)&&(nGXsfl_17_idx+1>subgridmaquinas_fnc_recordsperpage( )) ? 1 : nGXsfl_17_idx+1) ;
         sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_172( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridmaquinasContainer)) ;
      /* End function gxnrGridmaquinas_newrow */
   }

   public void gxnrgridhdrs_newrow( )
   {
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      subsflControlProps_353( ) ;
      while ( nGXsfl_35_idx <= nRC_GXsfl_35 )
      {
         sendrow_353( ) ;
         nGXsfl_35_idx = ((subGridhdrs_Islastpage==1)&&(nGXsfl_35_idx+1>subgridhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_35_idx+1) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") + sGXsfl_17_idx ;
         subsflControlProps_353( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridhdrsContainer)) ;
      /* End function gxnrGridhdrs_newrow */
   }

   public void gxgrgridhdrs_refresh( String AV15Emprcod ,
                                     GXSimpleCollection<String> AV21MaqCodVisible ,
                                     String AV27PrefijoMaqCod ,
                                     GXBaseCollection<app.SdtSDTHdrsporMaquina> AV6SDTHdrsporMaquinaCollection ,
                                     GXBaseCollection<app.SdtSDTMaquina> AV7SDTMaquinaCollection ,
                                     String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e13N02 ();
      GRIDHDRS_nCurrentRecord = 0 ;
      rfN03( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridhdrs_refresh */
   }

   public void gxgrgridmaquinas_refresh( String AV15Emprcod ,
                                         GXSimpleCollection<String> AV21MaqCodVisible ,
                                         String AV27PrefijoMaqCod ,
                                         GXBaseCollection<app.SdtSDTMaquina> AV7SDTMaquinaCollection ,
                                         GXBaseCollection<app.SdtSDTHdrsporMaquina> AV6SDTHdrsporMaquinaCollection ,
                                         String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e13N02 ();
      GRIDMAQUINAS_nCurrentRecord = 0 ;
      rfN02( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGridmaquinas_refresh */
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
      rfN02( ) ;
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
      edtavSdtmaquina_maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmaquina_maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquina_maqdsc_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavTexto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTexto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto_Enabled), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void rfN02( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridmaquinasContainer.ClearRows();
      }
      wbStart = (short)(17) ;
      /* Execute user event: Refresh */
      e13N02 ();
      nGXsfl_17_idx = 1 ;
      sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_172( ) ;
      bGXsfl_17_Refreshing = true ;
      GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
      GridmaquinasContainer.AddObjectProperty("CmpContext", sPrefix);
      GridmaquinasContainer.AddObjectProperty("InMasterPage", "false");
      GridmaquinasContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
      GridmaquinasContainer.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Width, (byte)(9), (byte)(0), ".", "")));
      GridmaquinasContainer.AddObjectProperty("Class", "FreeStyleGrid");
      GridmaquinasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
      GridmaquinasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
      GridmaquinasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridmaquinasContainer.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Width, (byte)(9), (byte)(0), ".", "")));
      GridmaquinasContainer.setPageSize( subgridmaquinas_fnc_recordsperpage( ) );
      if ( subGridhdrs_Islastpage != 0 )
      {
         GRIDHDRS_nFirstRecordOnPage = (long)(subgridhdrs_fnc_recordcount( )-subgridhdrs_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDHDRS_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("GRIDHDRS_nFirstRecordOnPage", GRIDHDRS_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_172( ) ;
         e14N02 ();
         wbEnd = (short)(17) ;
         wbN00( ) ;
      }
      bGXsfl_17_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesN02( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMAQCODVISIBLE", AV21MaqCodVisible);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMAQCODVISIBLE", AV21MaqCodVisible);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMAQCODVISIBLE", getSecureSignedToken( sPrefix, AV21MaqCodVisible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPREFIJOMAQCOD", GXutil.rtrim( AV27PrefijoMaqCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPREFIJOMAQCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV27PrefijoMaqCod, ""))));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTMAQUINACOLLECTION", AV7SDTMaquinaCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTMAQUINACOLLECTION", AV7SDTMaquinaCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTMAQUINACOLLECTION", getSecureSignedToken( sPrefix, AV7SDTMaquinaCollection));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vSDTHDRSPORMAQUINACOLLECTION", AV6SDTHdrsporMaquinaCollection);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vSDTHDRSPORMAQUINACOLLECTION", AV6SDTHdrsporMaquinaCollection);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSDTHDRSPORMAQUINACOLLECTION", getSecureSignedToken( sPrefix, AV6SDTHdrsporMaquinaCollection));
   }

   public void rfN03( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridhdrsContainer.ClearRows();
      }
      wbStart = (short)(35) ;
      nGXsfl_35_idx = 1 ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") + sGXsfl_17_idx ;
      subsflControlProps_353( ) ;
      bGXsfl_35_Refreshing = true ;
      GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
      GridhdrsContainer.AddObjectProperty("CmpContext", sPrefix);
      GridhdrsContainer.AddObjectProperty("InMasterPage", "false");
      GridhdrsContainer.AddObjectProperty("Class", GXutil.rtrim( "DtmFreeStyleGrid"));
      GridhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Class", "DtmFreeStyleGrid");
      GridhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
      GridhdrsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
      GridhdrsContainer.setPageSize( subgridhdrs_fnc_recordsperpage( ) );
      GXCCtl = "GRIDHDRS_nFirstRecordOnPage_" + sGXsfl_17_idx ;
      if ( subGridhdrs_Islastpage != 0 )
      {
         GRIDHDRS_nFirstRecordOnPage = (long)(subgridhdrs_fnc_recordcount( )-subgridhdrs_fnc_recordsperpage( )) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRIDHDRS_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("GRIDHDRS_nFirstRecordOnPage", GRIDHDRS_nFirstRecordOnPage);
      }
      gxdyncontrolsrefreshing = true ;
      fix_multi_value_controls( ) ;
      gxdyncontrolsrefreshing = false ;
      if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
      {
         subsflControlProps_353( ) ;
         e15N03 ();
         wbEnd = (short)(35) ;
         wbN00( ) ;
      }
      bGXsfl_35_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesN03( )
   {
   }

   public int subgridmaquinas_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgridmaquinas_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgridmaquinas_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgridmaquinas_fnc_currentpage( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_pagecount( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_recordcount( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_recordsperpage( )
   {
      return -1 ;
   }

   public int subgridhdrs_fnc_currentpage( )
   {
      return -1 ;
   }

   public void before_start_formulas( )
   {
      Gx_err = (short)(0) ;
      edtavSdtmaquina_maqdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavSdtmaquina_maqdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavSdtmaquina_maqdsc_Enabled), 5, 0), !bGXsfl_17_Refreshing);
      edtavTexto_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTexto_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTexto_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupN00( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e12N02 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"Sdtmaquina"), AV29SDTMaquina);
         /* Read saved values. */
         nRC_GXsfl_17 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_17"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV23MaqCodVisibleJson = httpContext.cgiGet( sPrefix+"wcpOAV23MaqCodVisibleJson") ;
         Dvpanel_panelprogramacion_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELPROGRAMACION_Autowidth")) ;
         Dvpanel_panelprogramacion_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELPROGRAMACION_Autoheight")) ;
         Dvpanel_panelprogramacion_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_PANELPROGRAMACION_Cls") ;
         Dvpanel_panelprogramacion_Title = httpContext.cgiGet( sPrefix+"DVPANEL_PANELPROGRAMACION_Title") ;
         Dvpanel_panelprogramacion_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELPROGRAMACION_Collapsible")) ;
         Dvpanel_panelprogramacion_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_PANELPROGRAMACION_Showcollapseicon")) ;
         Dvpanel_panelprogramacion_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_PANELPROGRAMACION_Iconposition") ;
         subGridmaquinas_Class = httpContext.cgiGet( sPrefix+"GRIDMAQUINAS_Class") ;
         subGridmaquinas_Variablewidth = httpContext.cgiGet( sPrefix+"GRIDMAQUINAS_Variablewidth") ;
         /* Read variables values. */
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      }
      else
      {
         dynload_actions( ) ;
      }
   }

   protected void GXStart( )
   {
      /* Execute user event: Start */
      e12N02 ();
      if (returnInSub) return;
   }

   public void e12N02( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV21MaqCodVisible.fromJSonString(AV23MaqCodVisibleJson, null);
      GXt_char1 = AV15Emprcod ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerempresa(remoteHandle, context).execute( GXv_char2) ;
      wcprogramacionmaquinas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV15Emprcod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Emprcod", AV15Emprcod);
      GXt_char1 = AV27PrefijoMaqCod ;
      GXv_char2[0] = AV15Emprcod ;
      GXv_char3[0] = "MQPLTI" ;
      GXv_char4[0] = GXt_char1 ;
      new app.pbusdsc(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_char4) ;
      wcprogramacionmaquinas_impl.this.AV15Emprcod = GXv_char2[0] ;
      wcprogramacionmaquinas_impl.this.GXt_char1 = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15Emprcod", AV15Emprcod);
      AV27PrefijoMaqCod = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27PrefijoMaqCod", AV27PrefijoMaqCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPREFIJOMAQCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV27PrefijoMaqCod, ""))));
      if ( (GXutil.strcmp("", AV27PrefijoMaqCod)==0) )
      {
         AV27PrefijoMaqCod = "TN" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27PrefijoMaqCod", AV27PrefijoMaqCod);
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPREFIJOMAQCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV27PrefijoMaqCod, ""))));
      }
      AV27PrefijoMaqCod += "%" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27PrefijoMaqCod", AV27PrefijoMaqCod);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPREFIJOMAQCOD", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV27PrefijoMaqCod, ""))));
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV14DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV14DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      divTablecontent_Class = "TableContent" ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTablecontent_Internalname, "Class", divTablecontent_Class, true);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV14DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV14DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      edtavMaqcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavMaqcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavMaqcod_Visible), 5, 0), !bGXsfl_17_Refreshing);
      edtavBarcod_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcod_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtavBarcodreo_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodreo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodreo_Visible), 5, 0), !bGXsfl_35_Refreshing);
      edtavBarcodpar_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavBarcodpar_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavBarcodpar_Visible), 5, 0), !bGXsfl_35_Refreshing);
   }

   public void e13N02( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXt_objcol_SdtSDTMaquina7 = AV7SDTMaquinaCollection ;
      GXv_objcol_SdtSDTMaquina8[0] = GXt_objcol_SdtSDTMaquina7 ;
      new app.dpmaquinaconhdr(remoteHandle, context).execute( AV15Emprcod, AV21MaqCodVisible, false, AV27PrefijoMaqCod, GXv_objcol_SdtSDTMaquina8) ;
      GXt_objcol_SdtSDTMaquina7 = GXv_objcol_SdtSDTMaquina8[0] ;
      AV7SDTMaquinaCollection = GXt_objcol_SdtSDTMaquina7 ;
      AV41Ancho = (short)(120*AV7SDTMaquinaCollection.size()+80) ;
      subGridmaquinas_Width = AV41Ancho ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, sPrefix+"GridmaquinasContainerDiv", "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(subGridmaquinas_Width), 9, 0), true);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV7SDTMaquinaCollection", AV7SDTMaquinaCollection);
   }

   private void e14N02( )
   {
      /* Gridmaquinas_Load Routine */
      returnInSub = false ;
      AV46GXV2 = 1 ;
      while ( AV46GXV2 <= AV7SDTMaquinaCollection.size() )
      {
         AV29SDTMaquina = (app.SdtSDTMaquina)((app.SdtSDTMaquina)AV7SDTMaquinaCollection.elementAt(-1+AV46GXV2));
         AV5Maqcod = AV29SDTMaquina.getgxTv_SdtSDTMaquina_Maqcod() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavMaqcod_Internalname, AV5Maqcod);
         AV6SDTHdrsporMaquinaCollection.fromJSonString(AV29SDTMaquina.getgxTv_SdtSDTMaquina_Sdthdrspormaquina().toJSonString(false), null);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(17) ;
         }
         sendrow_172( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_17_Refreshing )
         {
            httpContext.doAjaxLoad(17, GridmaquinasRow);
         }
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(35) ;
         }
         sendrow_353( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_35_Refreshing )
         {
            httpContext.doAjaxLoad(35, GridhdrsRow);
         }
         AV46GXV2 = (int)(AV46GXV2+1) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29SDTMaquina", AV29SDTMaquina);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV6SDTHdrsporMaquinaCollection", AV6SDTHdrsporMaquinaCollection);
   }

   public void e11N02( )
   {
      /* Tblhdr_Click Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webdatoshdr", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV9BarCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11BarCodReo,1,0)),GXutil.URLEncode(GXutil.rtrim(AV10BarCodPar))}, new String[] {"Emprcod","Barcod","Barcodreo","Barcodpar"}) , new Object[] {"AV15Emprcod","AV9BarCod","AV11BarCodReo","AV10BarCodPar"});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV7SDTMaquinaCollection", AV7SDTMaquinaCollection);
   }

   private void e15N03( )
   {
      /* Gridhdrs_Load Routine */
      returnInSub = false ;
      AV47GXV3 = 1 ;
      while ( AV47GXV3 <= AV6SDTHdrsporMaquinaCollection.size() )
      {
         AV28SDTHdrsporMaquina = (app.SdtSDTHdrsporMaquina)((app.SdtSDTHdrsporMaquina)AV6SDTHdrsporMaquinaCollection.elementAt(-1+AV47GXV3));
         AV9BarCod = AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcod() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcod_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9BarCod), 8, 0));
         AV11BarCodReo = AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcodreo() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodreo_Internalname, GXutil.str( AV11BarCodReo, 1, 0));
         AV10BarCodPar = AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcodpar() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavBarcodpar_Internalname, AV10BarCodPar);
         AV37Rgb = ((AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barrgb()==0) ? 65793 : AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barrgb()) ;
         GXv_int9[0] = AV35R ;
         GXv_int10[0] = AV33G ;
         GXv_int11[0] = AV31B ;
         GXv_int12[0] = AV36R2 ;
         GXv_int13[0] = AV34G2 ;
         GXv_int14[0] = AV32B2 ;
         new app.backcolorforecolor(remoteHandle, context).execute( AV37Rgb, GXv_int9, GXv_int10, GXv_int11, GXv_int12, GXv_int13, GXv_int14) ;
         wcprogramacionmaquinas_impl.this.AV35R = GXv_int9[0] ;
         wcprogramacionmaquinas_impl.this.AV33G = GXv_int10[0] ;
         wcprogramacionmaquinas_impl.this.AV31B = GXv_int11[0] ;
         wcprogramacionmaquinas_impl.this.AV36R2 = GXv_int12[0] ;
         wcprogramacionmaquinas_impl.this.AV34G2 = GXv_int13[0] ;
         wcprogramacionmaquinas_impl.this.AV32B2 = GXv_int14[0] ;
         tblTblhdr_Backcolor = GXutil.getColor( AV35R, AV33G, AV31B) ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTblhdr_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTblhdr_Backcolor), 9, 0), !bGXsfl_35_Refreshing);
         edtavTexto_Forecolor = GXutil.getColor( AV36R2, AV34G2, AV32B2) ;
         tblTblhdr_Width = 120 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, tblTblhdr_Internalname, "Width", GXutil.ltrimstr( DecimalUtil.doubleToDec(tblTblhdr_Width), 9, 0), !bGXsfl_35_Refreshing);
         AV30Texto = ((GXutil.strcmp("", AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barnomcli())==0) ? AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barcolnom() : AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barnomcli()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTexto_Internalname, AV30Texto);
         AV30Texto += "<br>" + GXutil.trim( AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barser()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTexto_Internalname, AV30Texto);
         AV30Texto += "<br>" + httpContext.getMessage( "Os ", "") + GXutil.trim( AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barhdr()) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTexto_Internalname, AV30Texto);
         AV30Texto += "<br>" + GXutil.trim( GXutil.str( AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barkgs(), 9, 2)) + " Kgs" ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTexto_Internalname, AV30Texto);
         AV30Texto += "<br>TIN: " + localUtil.format( DecimalUtil.doubleToDec(AV28SDTHdrsporMaquina.getgxTv_SdtSDTHdrsporMaquina_Barfasest()), "9") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavTexto_Internalname, AV30Texto);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(35) ;
         }
         sendrow_353( ) ;
         if ( isFullAjaxMode( ) && ! bGXsfl_35_Refreshing )
         {
            httpContext.doAjaxLoad(35, GridhdrsRow);
         }
         AV47GXV3 = (int)(AV47GXV3+1) ;
      }
      /*  Sending Event outputs  */
   }

   public void wb_table1_14_N02( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblPanelprogramacion_Internalname, tblPanelprogramacion_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /*  Grid Control  */
         GridmaquinasContainer.SetIsFreestyle(true);
         GridmaquinasContainer.SetWrapped(nGXWrapped);
         startgridcontrol17( ) ;
      }
      if ( wbEnd == 17 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_17 = (int)(nGXsfl_17_idx-1) ;
         if ( GridmaquinasContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
            sStyleString = "" ;
            httpContext.writeText( "<div id=\""+sPrefix+"GridmaquinasContainer"+"Div\" "+sStyleString+">"+"</div>") ;
            httpContext.ajax_rsp_assign_grid(sPrefix+"_"+"Gridmaquinas", GridmaquinasContainer, subGridmaquinas_Internalname);
            if ( ! isAjaxCallMode( ) && ! httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridmaquinasContainerData", GridmaquinasContainer.ToJavascriptSource());
            }
            if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
            {
               app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridmaquinasContainerData"+"V", GridmaquinasContainer.GridValuesHidden());
            }
            else
            {
               httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridmaquinasContainerData"+"V"+"\" value='"+GridmaquinasContainer.GridValuesHidden()+"'/>") ;
            }
         }
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_14_N02e( true) ;
      }
      else
      {
         wb_table1_14_N02e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV23MaqCodVisibleJson = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCodVisibleJson", AV23MaqCodVisibleJson);
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
      paN02( ) ;
      wsN02( ) ;
      weN02( ) ;
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
      sCtrlAV23MaqCodVisibleJson = (String)getParm(obj,0,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paN02( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcprogramacionmaquinas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paN02( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV23MaqCodVisibleJson = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCodVisibleJson", AV23MaqCodVisibleJson);
      }
      wcpOAV23MaqCodVisibleJson = httpContext.cgiGet( sPrefix+"wcpOAV23MaqCodVisibleJson") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV23MaqCodVisibleJson, wcpOAV23MaqCodVisibleJson) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV23MaqCodVisibleJson = AV23MaqCodVisibleJson ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV23MaqCodVisibleJson = httpContext.cgiGet( sPrefix+"AV23MaqCodVisibleJson_CTRL") ;
      if ( GXutil.len( sCtrlAV23MaqCodVisibleJson) > 0 )
      {
         AV23MaqCodVisibleJson = httpContext.cgiGet( sCtrlAV23MaqCodVisibleJson) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23MaqCodVisibleJson", AV23MaqCodVisibleJson);
      }
      else
      {
         AV23MaqCodVisibleJson = httpContext.cgiGet( sPrefix+"AV23MaqCodVisibleJson_PARM") ;
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
      paN02( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsN02( ) ;
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
      wsN02( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23MaqCodVisibleJson_PARM", AV23MaqCodVisibleJson);
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23MaqCodVisibleJson)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23MaqCodVisibleJson_CTRL", GXutil.rtrim( sCtrlAV23MaqCodVisibleJson));
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
      weN02( ) ;
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
      httpContext.AddStyleSheetFile("HorizontalGrid/horizontalgrid.min.css", "");
      httpContext.AddStyleSheetFile("HorizontalGrid/horizontalgrid.min.css", "");
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268171415038", true, true);
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
      httpContext.AddJavascriptSource("wcprogramacionmaquinas.js", "?20268171415038", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
      httpContext.AddJavascriptSource("HorizontalGrid/horizontalgrid.min.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_353( )
   {
      edtavTexto_Internalname = sPrefix+"vTEXTO_"+sGXsfl_35_idx ;
      edtavBarcod_Internalname = sPrefix+"vBARCOD_"+sGXsfl_35_idx ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO_"+sGXsfl_35_idx ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_353( )
   {
      edtavTexto_Internalname = sPrefix+"vTEXTO_"+sGXsfl_35_fel_idx ;
      edtavBarcod_Internalname = sPrefix+"vBARCOD_"+sGXsfl_35_fel_idx ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO_"+sGXsfl_35_fel_idx ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR_"+sGXsfl_35_fel_idx ;
   }

   public void sendrow_353( )
   {
      subsflControlProps_353( ) ;
      wbN00( ) ;
      GridhdrsRow = GXWebRow.GetNew(context,GridhdrsContainer) ;
      if ( subGridhdrs_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
         {
            subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
         }
      }
      else if ( subGridhdrs_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(0) ;
         subGridhdrs_Backcolor = subGridhdrs_Allbackcolor ;
         if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
         {
            subGridhdrs_Linesclass = subGridhdrs_Class+"Uniform" ;
         }
      }
      else if ( subGridhdrs_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
         {
            subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
         }
         subGridhdrs_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGridhdrs_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridhdrs_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_35_idx) % (2))) == 0 )
         {
            subGridhdrs_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
            {
               subGridhdrs_Linesclass = subGridhdrs_Class+"Even" ;
            }
         }
         else
         {
            subGridhdrs_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGridhdrs_Class, "") != 0 )
            {
               subGridhdrs_Linesclass = subGridhdrs_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGridhdrs_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_35_idx+"\">") ;
      }
      /* Table start */
      GridhdrsRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTblhdr_Internalname+"_"+sGXsfl_35_idx,Integer.valueOf(1),"DtmGridCol","",Integer.valueOf(tblTblhdr_Backcolor),"","","","",Integer.valueOf(0),Integer.valueOf(0),"",Integer.valueOf(tblTblhdr_Width),"","px","px",""});
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      /* Attribute/Variable Label */
      GridhdrsRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavTexto_Internalname,httpContext.getMessage( "texto", ""),"gx-form-item ReadonlyAttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavTexto_Internalname,AV30Texto,"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavTexto_Jsonclick,Integer.valueOf(0),"ReadonlyAttribute","color:"+WebUtils.getHTMLColor( edtavTexto_Forecolor)+";",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavTexto_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(80),"chr",Integer.valueOf(1),"row",Integer.valueOf(100),Integer.valueOf(0),Integer.valueOf(1),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtavBarcod_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavBarcod_Internalname+"\"","","div"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcod_Internalname,GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV9BarCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtavBarcod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(8),"chr",Integer.valueOf(1),"row",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtavBarcodreo_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavBarcodreo_Internalname+"\"","","div"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodreo_Internalname,GXutil.ltrim( localUtil.ntoc( AV11BarCodReo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV11BarCodReo), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodreo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtavBarcodreo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      GridhdrsRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridhdrsRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(edtavBarcodpar_Visible),Integer.valueOf(0),"px",Integer.valueOf(0),"px","form-group gx-form-group gx-default-form-group","left","top",""+" data-gx-for=\""+edtavBarcodpar_Internalname+"\"","","div"});
      /* Div Control */
      GridhdrsRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(75),"%",Integer.valueOf(0),"px","gx-form-item gx-attribute","left","top","","","div"});
      /* Single line edit */
      ROClassString = "Attribute" ;
      GridhdrsRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavBarcodpar_Internalname,GXutil.rtrim( AV10BarCodPar),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavBarcodpar_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtavBarcodpar_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(1),"chr",Integer.valueOf(1),"row",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridhdrsRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("cell");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("row");
      }
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         GridhdrsContainer.CloseTag("table");
      }
      /* End of table */
      send_integrity_lvl_hashesN03( ) ;
      /* End of Columns property logic. */
      GridhdrsContainer.AddRow(GridhdrsRow);
      nGXsfl_35_idx = ((subGridhdrs_Islastpage==1)&&(nGXsfl_35_idx+1>subgridhdrs_fnc_recordsperpage( )) ? 1 : nGXsfl_35_idx+1) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") + sGXsfl_17_idx ;
      subsflControlProps_353( ) ;
      /* End function sendrow_353 */
   }

   public void subsflControlProps_172( )
   {
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD_"+sGXsfl_17_idx ;
      edtavSdtmaquina_maqdsc_Internalname = sPrefix+"SDTMAQUINA_MAQDSC_"+sGXsfl_17_idx ;
      subGridhdrs_Internalname = sPrefix+"GRIDHDRS_"+sGXsfl_17_idx ;
   }

   public void subsflControlProps_fel_172( )
   {
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD_"+sGXsfl_17_fel_idx ;
      edtavSdtmaquina_maqdsc_Internalname = sPrefix+"SDTMAQUINA_MAQDSC_"+sGXsfl_17_fel_idx ;
      subGridhdrs_Internalname = sPrefix+"GRIDHDRS_"+sGXsfl_17_fel_idx ;
   }

   public void sendrow_172( )
   {
      subsflControlProps_172( ) ;
      wbN00( ) ;
      GridmaquinasRow = GXWebRow.GetNew(context,GridmaquinasContainer) ;
      if ( subGridmaquinas_Backcolorstyle == 0 )
      {
         /* None style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(0) ;
         if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
         {
            subGridmaquinas_Linesclass = subGridmaquinas_Class+"Odd" ;
         }
      }
      else if ( subGridmaquinas_Backcolorstyle == 1 )
      {
         /* Uniform style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(0) ;
         subGridmaquinas_Backcolor = subGridmaquinas_Allbackcolor ;
         if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
         {
            subGridmaquinas_Linesclass = subGridmaquinas_Class+"Uniform" ;
         }
      }
      else if ( subGridmaquinas_Backcolorstyle == 2 )
      {
         /* Header style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(1) ;
         if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
         {
            subGridmaquinas_Linesclass = subGridmaquinas_Class+"Odd" ;
         }
         subGridmaquinas_Backcolor = (int)(0xFFFFFF) ;
      }
      else if ( subGridmaquinas_Backcolorstyle == 3 )
      {
         /* Report style subfile background logic. */
         subGridmaquinas_Backstyle = (byte)(1) ;
         if ( ((int)((nGXsfl_17_idx) % (2))) == 0 )
         {
            subGridmaquinas_Backcolor = (int)(0x0) ;
            if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
            {
               subGridmaquinas_Linesclass = subGridmaquinas_Class+"Even" ;
            }
         }
         else
         {
            subGridmaquinas_Backcolor = (int)(0xFFFFFF) ;
            if ( GXutil.strcmp(subGridmaquinas_Class, "") != 0 )
            {
               subGridmaquinas_Linesclass = subGridmaquinas_Class+"Odd" ;
            }
         }
      }
      /* Start of Columns property logic. */
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<tr"+" class=\""+subGridmaquinas_Linesclass+"\" style=\""+""+"\""+" data-gxrow=\""+sGXsfl_17_idx+"\">") ;
      }
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divUnnamedtablefsgridmaquinas_Internalname+"_"+sGXsfl_17_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","flex-direction:column;","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Invisible","left","top","","flex-grow:1;","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Table start */
      GridmaquinasRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblUnnamedtablecontentfsgridmaquinas_Internalname+"_"+sGXsfl_17_idx,Integer.valueOf(1),"Table","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      GridmaquinasRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      GridmaquinasRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Attribute/Variable Label */
      GridmaquinasRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavMaqcod_Internalname,httpContext.getMessage( "Maquina", ""),"gx-form-item AttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Single line edit */
      TempTags = " " + ((edtavMaqcod_Enabled!=0)&&(edtavMaqcod_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 24,'"+sPrefix+"',false,'"+sGXsfl_17_idx+"',17)\"" : " ") ;
      ROClassString = "Attribute" ;
      GridmaquinasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavMaqcod_Internalname,GXutil.rtrim( AV5Maqcod),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavMaqcod_Enabled!=0)&&(edtavMaqcod_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,24);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavMaqcod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"","",Integer.valueOf(edtavMaqcod_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(6),"chr",Integer.valueOf(1),"row",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      GridmaquinasRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("cell");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("row");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("table");
      }
      /* End of table */
      GridmaquinasRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","flex-grow:1;","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Table start */
      GridmaquinasRow.AddColumnProperties("table", -1, isAjaxCallMode( ), new Object[] {tblTblmaquina_Internalname+"_"+sGXsfl_17_idx,Integer.valueOf(1),"","","","","","","",Integer.valueOf(1),Integer.valueOf(2),"","","","px","px",""});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      GridmaquinasRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      GridmaquinasRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px"," gx-attribute","left","top","","","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Attribute/Variable Label */
      GridmaquinasRow.AddColumnProperties("html_label", -1, isAjaxCallMode( ), new Object[] {edtavSdtmaquina_maqdsc_Internalname,httpContext.getMessage( "Descripcion Maquina", ""),"gx-form-item ReadonlyAttributeLabel",Integer.valueOf(0),Boolean.valueOf(true),"width: 25%;"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Single line edit */
      ROClassString = "ReadonlyAttribute" ;
      GridmaquinasRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavSdtmaquina_maqdsc_Internalname,GXutil.rtrim( AV29SDTMaquina.getgxTv_SdtSDTMaquina_Maqdsc()),"","","'"+sPrefix+"'"+",false,"+"'"+"e16n02_client"+"'","","","","",edtavSdtmaquina_maqdsc_Jsonclick,Integer.valueOf(7),"ReadonlyAttribute","",ROClassString,"","",Integer.valueOf(1),Integer.valueOf(edtavSdtmaquina_maqdsc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(16),"chr",Integer.valueOf(1),"row",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(17),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      GridmaquinasRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("cell");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("row");
      }
      GridmaquinasRow.AddColumnProperties("row", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      GridmaquinasRow.AddColumnProperties("cell", -1, isAjaxCallMode( ), new Object[] {"","",""});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {divTable1_Internalname+"_"+sGXsfl_17_idx,Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","Flex","left","top"," "+"data-gx-flex"+" ","flex-wrap:wrap;","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /* Div Control */
      GridmaquinasRow.AddColumnProperties("div_start", -1, isAjaxCallMode( ), new Object[] {"",Integer.valueOf(1),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","left","top","","flex-grow:1;","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      /*  Child Grid Control  */
      GridmaquinasRow.AddColumnProperties("subfile", -1, isAjaxCallMode( ), new Object[] {"GridhdrsContainer"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      if ( isAjaxCallMode( ) )
      {
         GridhdrsContainer = new com.genexus.webpanels.GXWebGrid(context);
      }
      else
      {
         GridhdrsContainer.Clear();
      }
      GridhdrsContainer.SetIsFreestyle(true);
      GridhdrsContainer.SetWrapped(nGXWrapped);
      startgridcontrol35( ) ;
      rfN03( ) ;
      nRC_GXsfl_35 = (int)(nGXsfl_35_idx-1) ;
      send_integrity_footer_hashes( ) ;
      GXCCtl = "nRC_GXsfl_35_" + sGXsfl_17_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_35, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "</table>") ;
      }
      else
      {
         if ( ! isAjaxCallMode( ) )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridhdrsContainerData"+"_"+sGXsfl_17_idx, GridhdrsContainer.ToJavascriptSource());
         }
         if ( isAjaxCallMode( ) )
         {
            GridmaquinasRow.AddGrid("Gridhdrs", GridhdrsContainer);
         }
         if ( httpContext.isAjaxRequest( ) || httpContext.isSpaRequest( ) )
         {
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GridhdrsContainerData"+"V_"+sGXsfl_17_idx, GridhdrsContainer.GridValuesHidden());
         }
         else
         {
            httpContext.writeText( "<input type=\"hidden\" "+"name=\""+sPrefix+"GridhdrsContainerData"+"V_"+sGXsfl_17_idx+"\" value='"+GridhdrsContainer.GridValuesHidden()+"'/>") ;
         }
      }
      GridmaquinasRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      GridmaquinasRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("cell");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("row");
      }
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         GridmaquinasContainer.CloseTag("table");
      }
      /* End of table */
      GridmaquinasRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      GridmaquinasRow.AddColumnProperties("div_end", -1, isAjaxCallMode( ), new Object[] {"left","top","div"});
      GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
      GridmaquinasRow.AddRenderProperties(GridmaquinasColumn);
      send_integrity_lvl_hashesN02( ) ;
      /* End of Columns property logic. */
      GridmaquinasContainer.AddRow(GridmaquinasRow);
      nGXsfl_17_idx = ((subGridmaquinas_Islastpage==1)&&(nGXsfl_17_idx+1>subgridmaquinas_fnc_recordsperpage( )) ? 1 : nGXsfl_17_idx+1) ;
      sGXsfl_17_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_17_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_172( ) ;
      /* End function sendrow_172 */
   }

   public void startgridcontrol17( )
   {
      if ( GridmaquinasContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridmaquinasContainer"+"DivS\" data-gxgridid=\"17\">") ;
         sStyleString = "" ;
         sStyleString += " width: " + GXutil.ltrimstr( DecimalUtil.doubleToDec(subGridmaquinas_Width), 10, 0) + "px" + ";" ;
         app.GxWebStd.gx_table_start( httpContext, subGridmaquinas_Internalname, subGridmaquinas_Internalname, "", "FreeStyleGrid", 0, "", "", 1, 2, sStyleString, "", "", 0);
         GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
      }
      else
      {
         GridmaquinasContainer.AddObjectProperty("GridName", "Gridmaquinas");
         GridmaquinasContainer.AddObjectProperty("Header", subGridmaquinas_Header);
         GridmaquinasContainer.AddObjectProperty("Class", GXutil.rtrim( "FreeStyleGrid"));
         GridmaquinasContainer.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Width, (byte)(9), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Class", "FreeStyleGrid");
         GridmaquinasContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Width", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Width, (byte)(9), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("CmpContext", sPrefix);
         GridmaquinasContainer.AddObjectProperty("InMasterPage", "false");
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasColumn.AddObjectProperty("Value", GXutil.rtrim( AV5Maqcod));
         GridmaquinasColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavMaqcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasColumn.AddObjectProperty("Value", GXutil.rtrim( AV29SDTMaquina.getgxTv_SdtSDTMaquina_Maqdsc()));
         GridmaquinasColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavSdtmaquina_maqdsc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridmaquinasContainer.AddColumnProperties(GridmaquinasColumn);
         GridmaquinasContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridmaquinasContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridmaquinas_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void startgridcontrol35( )
   {
      if ( GridhdrsContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridhdrsContainer"+"DivS\" data-gxgridid=\"35\">") ;
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, subGridhdrs_Internalname, subGridhdrs_Internalname, "", "DtmFreeStyleGrid", 0, "", "", 0, 0, sStyleString, "", "", 0);
         GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
      }
      else
      {
         GridhdrsContainer.AddObjectProperty("GridName", "Gridhdrs");
         GridhdrsContainer.AddObjectProperty("Header", subGridhdrs_Header);
         GridhdrsContainer.AddObjectProperty("Class", GXutil.rtrim( "DtmFreeStyleGrid"));
         GridhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Class", "DtmFreeStyleGrid");
         GridhdrsContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 0, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("CmpContext", sPrefix);
         GridhdrsContainer.AddObjectProperty("InMasterPage", "false");
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", AV30Texto);
         GridhdrsColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavTexto_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavTexto_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV9BarCod, (byte)(8), (byte)(0), ".", "")));
         GridhdrsColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarcod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV11BarCodReo, (byte)(1), (byte)(0), ".", "")));
         GridhdrsColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarcodreo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridhdrsColumn.AddObjectProperty("Value", GXutil.rtrim( AV10BarCodPar));
         GridhdrsColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavBarcodpar_Visible, (byte)(5), (byte)(0), ".", "")));
         GridhdrsContainer.AddColumnProperties(GridhdrsColumn);
         GridhdrsContainer.AddObjectProperty("Selectedindex", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Selectedindex, (byte)(4), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowselection", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowselection, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Selectioncolor", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Selectioncolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowhover", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowhovering, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Hovercolor", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Hoveringcolor, (byte)(9), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Allowcollapsing", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Allowcollapsing, (byte)(1), (byte)(0), ".", "")));
         GridhdrsContainer.AddObjectProperty("Collapsed", GXutil.ltrim( localUtil.ntoc( subGridhdrs_Collapsed, (byte)(1), (byte)(0), ".", "")));
      }
   }

   public void init_default_properties( )
   {
      edtavMaqcod_Internalname = sPrefix+"vMAQCOD" ;
      tblUnnamedtablecontentfsgridmaquinas_Internalname = sPrefix+"UNNAMEDTABLECONTENTFSGRIDMAQUINAS" ;
      edtavSdtmaquina_maqdsc_Internalname = sPrefix+"SDTMAQUINA_MAQDSC" ;
      edtavTexto_Internalname = sPrefix+"vTEXTO" ;
      edtavBarcod_Internalname = sPrefix+"vBARCOD" ;
      edtavBarcodreo_Internalname = sPrefix+"vBARCODREO" ;
      edtavBarcodpar_Internalname = sPrefix+"vBARCODPAR" ;
      tblTblhdr_Internalname = sPrefix+"TBLHDR" ;
      divTable1_Internalname = sPrefix+"TABLE1" ;
      tblTblmaquina_Internalname = sPrefix+"TBLMAQUINA" ;
      divUnnamedtablefsgridmaquinas_Internalname = sPrefix+"UNNAMEDTABLEFSGRIDMAQUINAS" ;
      tblPanelprogramacion_Internalname = sPrefix+"PANELPROGRAMACION" ;
      Dvpanel_panelprogramacion_Internalname = sPrefix+"DVPANEL_PANELPROGRAMACION" ;
      divTablecontent_Internalname = sPrefix+"TABLECONTENT" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      divLayoutmaintable_Internalname = sPrefix+"LAYOUTMAINTABLE" ;
      Form.setInternalname( sPrefix+"FORM" );
      subGridhdrs_Internalname = sPrefix+"GRIDHDRS" ;
      subGridmaquinas_Internalname = sPrefix+"GRIDMAQUINAS" ;
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
      subGridhdrs_Allowcollapsing = (byte)(0) ;
      subGridmaquinas_Allowcollapsing = (byte)(0) ;
      edtavSdtmaquina_maqdsc_Jsonclick = "" ;
      edtavSdtmaquina_maqdsc_Enabled = 0 ;
      edtavMaqcod_Jsonclick = "" ;
      edtavMaqcod_Enabled = 1 ;
      edtavBarcodpar_Jsonclick = "" ;
      edtavBarcodreo_Jsonclick = "" ;
      edtavBarcod_Jsonclick = "" ;
      edtavTexto_Jsonclick = "" ;
      edtavTexto_Forecolor = (int)(0x000000) ;
      edtavTexto_Enabled = 0 ;
      tblTblhdr_Width = 0 ;
      subGridhdrs_Class = "DtmFreeStyleGrid" ;
      tblTblhdr_Backcolor = (int)(0x000000) ;
      subGridhdrs_Backcolorstyle = (byte)(0) ;
      subGridmaquinas_Backcolorstyle = (byte)(0) ;
      subGridmaquinas_Width = 0 ;
      edtavSdtmaquina_maqdsc_Enabled = -1 ;
      divTablecontent_Class = "" ;
      subGridmaquinas_Variablewidth = GXutil.ltrimstr( DecimalUtil.doubleToDec(-1), 9, 0) ;
      subGridmaquinas_Class = "FreeStyleGrid" ;
      Dvpanel_panelprogramacion_Iconposition = "Right" ;
      Dvpanel_panelprogramacion_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_panelprogramacion_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_panelprogramacion_Title = httpContext.getMessage( "Programación", "") ;
      Dvpanel_panelprogramacion_Cls = "PanelWithBorder_BaseColor" ;
      Dvpanel_panelprogramacion_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_panelprogramacion_Autowidth = GXutil.toBoolean( -1) ;
      edtavMaqcod_Visible = 1 ;
      edtavBarcodpar_Visible = 1 ;
      edtavBarcodreo_Visible = 1 ;
      edtavBarcod_Visible = 1 ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRIDMAQUINAS_nFirstRecordOnPage'},{av:'GRIDMAQUINAS_nEOF'},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'GRIDHDRS_nFirstRecordOnPage'},{av:'GRIDHDRS_nEOF'},{av:'edtavBarcod_Visible',ctrl:'vBARCOD',prop:'Visible'},{av:'edtavBarcodreo_Visible',ctrl:'vBARCODREO',prop:'Visible'},{av:'edtavBarcodpar_Visible',ctrl:'vBARCODPAR',prop:'Visible'},{av:'sPrefix'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21MaqCodVisible',fld:'vMAQCODVISIBLE',pic:'',hsh:true},{av:'AV27PrefijoMaqCod',fld:'vPREFIJOMAQCOD',pic:'',hsh:true},{av:'AV7SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true},{av:'AV6SDTHdrsporMaquinaCollection',fld:'vSDTHDRSPORMAQUINACOLLECTION',pic:'',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV7SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true},{av:'subGridmaquinas_Width',ctrl:'GRIDMAQUINAS',prop:'Width'}]}");
      setEventMetadata("GRIDMAQUINAS.LOAD","{handler:'e14N02',iparms:[{av:'AV7SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true}]");
      setEventMetadata("GRIDMAQUINAS.LOAD",",oparms:[{av:'AV29SDTMaquina',fld:'vSDTMAQUINA',pic:''},{av:'AV5Maqcod',fld:'vMAQCOD',pic:''},{av:'AV6SDTHdrsporMaquinaCollection',fld:'vSDTHDRSPORMAQUINACOLLECTION',pic:'',hsh:true}]}");
      setEventMetadata("GRIDHDRS.LOAD","{handler:'e15N03',iparms:[{av:'AV6SDTHdrsporMaquinaCollection',fld:'vSDTHDRSPORMAQUINACOLLECTION',pic:'',hsh:true}]");
      setEventMetadata("GRIDHDRS.LOAD",",oparms:[{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'tblTblhdr_Backcolor',ctrl:'TBLHDR',prop:'Backcolor'},{av:'edtavTexto_Forecolor',ctrl:'vTEXTO',prop:'Forecolor'},{av:'tblTblhdr_Width',ctrl:'TBLHDR',prop:'Width'},{av:'AV30Texto',fld:'vTEXTO',pic:''}]}");
      setEventMetadata("SDTMAQUINA_MAQDSC.CLICK","{handler:'e16N02',iparms:[{av:'AV5Maqcod',fld:'vMAQCOD',pic:''}]");
      setEventMetadata("SDTMAQUINA_MAQDSC.CLICK",",oparms:[]}");
      setEventMetadata("TBLHDR.CLICK","{handler:'e11N02',iparms:[{av:'GRIDMAQUINAS_nFirstRecordOnPage'},{av:'GRIDMAQUINAS_nEOF'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV21MaqCodVisible',fld:'vMAQCODVISIBLE',pic:'',hsh:true},{av:'AV27PrefijoMaqCod',fld:'vPREFIJOMAQCOD',pic:'',hsh:true},{av:'edtavMaqcod_Visible',ctrl:'vMAQCOD',prop:'Visible'},{av:'AV7SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true},{av:'AV6SDTHdrsporMaquinaCollection',fld:'vSDTHDRSPORMAQUINACOLLECTION',pic:'',hsh:true},{av:'sPrefix'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'GRIDHDRS_nFirstRecordOnPage'},{av:'GRIDHDRS_nEOF'},{av:'edtavBarcod_Visible',ctrl:'vBARCOD',prop:'Visible'},{av:'edtavBarcodreo_Visible',ctrl:'vBARCODREO',prop:'Visible'},{av:'edtavBarcodpar_Visible',ctrl:'vBARCODPAR',prop:'Visible'}]");
      setEventMetadata("TBLHDR.CLICK",",oparms:[{av:'AV10BarCodPar',fld:'vBARCODPAR',pic:''},{av:'AV11BarCodReo',fld:'vBARCODREO',pic:'9'},{av:'AV9BarCod',fld:'vBARCOD',pic:'ZZZZZZZ9'},{av:'AV15Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7SDTMaquinaCollection',fld:'vSDTMAQUINACOLLECTION',pic:'',hsh:true},{av:'subGridmaquinas_Width',ctrl:'GRIDMAQUINAS',prop:'Width'}]}");
      setEventMetadata("NULL","{handler:'validv_Gxv1',iparms:[]");
      setEventMetadata("NULL",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Barcodpar',iparms:[]");
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
      wcpOAV23MaqCodVisibleJson = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV23MaqCodVisibleJson = "" ;
      AV15Emprcod = "" ;
      AV21MaqCodVisible = new GXSimpleCollection<String>(String.class, "internal", "");
      AV27PrefijoMaqCod = "" ;
      AV6SDTHdrsporMaquinaCollection = new GXBaseCollection<app.SdtSDTHdrsporMaquina>(app.SdtSDTHdrsporMaquina.class, "SDTHdrsporMaquina", "TexplusNET", remoteHandle);
      AV7SDTMaquinaCollection = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV29SDTMaquina = new app.SdtSDTMaquina(remoteHandle, context);
      GX_FocusControl = "" ;
      ucDvpanel_panelprogramacion = new com.genexus.webpanels.GXUserControl();
      GridmaquinasContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      GridhdrsContainer = new com.genexus.webpanels.GXWebGrid(context);
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV5Maqcod = "" ;
      AV30Texto = "" ;
      AV10BarCodPar = "" ;
      GXCCtl = "" ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_char3 = new String[1] ;
      GXv_char4 = new String[1] ;
      AV14DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      GXt_objcol_SdtSDTMaquina7 = new GXBaseCollection<app.SdtSDTMaquina>(app.SdtSDTMaquina.class, "SDTMaquina", "TexplusNET", remoteHandle);
      GXv_objcol_SdtSDTMaquina8 = new GXBaseCollection[1] ;
      GridmaquinasRow = new com.genexus.webpanels.GXWebRow();
      GridhdrsRow = new com.genexus.webpanels.GXWebRow();
      AV28SDTHdrsporMaquina = new app.SdtSDTHdrsporMaquina(remoteHandle, context);
      GXv_int9 = new short[1] ;
      GXv_int10 = new short[1] ;
      GXv_int11 = new short[1] ;
      GXv_int12 = new short[1] ;
      GXv_int13 = new short[1] ;
      GXv_int14 = new short[1] ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV23MaqCodVisibleJson = "" ;
      subGridhdrs_Linesclass = "" ;
      ROClassString = "" ;
      subGridmaquinas_Linesclass = "" ;
      GridmaquinasColumn = new com.genexus.webpanels.GXWebColumn();
      TempTags = "" ;
      subGridmaquinas_Header = "" ;
      subGridhdrs_Header = "" ;
      GridhdrsColumn = new com.genexus.webpanels.GXWebColumn();
      /* GeneXus formulas. */
      Gx_err = (short)(0) ;
      edtavSdtmaquina_maqdsc_Enabled = 0 ;
      edtavTexto_Enabled = 0 ;
   }

   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV11BarCodReo ;
   private byte nDonePA ;
   private byte subGridmaquinas_Backcolorstyle ;
   private byte subGridhdrs_Backcolorstyle ;
   private byte GRIDMAQUINAS_nEOF ;
   private byte GRIDHDRS_nEOF ;
   private byte nGXWrapped ;
   private byte subGridhdrs_Backstyle ;
   private byte subGridmaquinas_Backstyle ;
   private byte subGridmaquinas_Allowselection ;
   private byte subGridmaquinas_Allowhovering ;
   private byte subGridmaquinas_Allowcollapsing ;
   private byte subGridmaquinas_Collapsed ;
   private byte subGridhdrs_Allowselection ;
   private byte subGridhdrs_Allowhovering ;
   private byte subGridhdrs_Allowcollapsing ;
   private byte subGridhdrs_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV41Ancho ;
   private short AV35R ;
   private short GXv_int9[] ;
   private short AV33G ;
   private short GXv_int10[] ;
   private short AV31B ;
   private short GXv_int11[] ;
   private short AV36R2 ;
   private short GXv_int12[] ;
   private short AV34G2 ;
   private short GXv_int13[] ;
   private short AV32B2 ;
   private short GXv_int14[] ;
   private int nRC_GXsfl_35 ;
   private int nGXsfl_35_idx=1 ;
   private int edtavMaqcod_Visible ;
   private int nRC_GXsfl_17 ;
   private int edtavBarcod_Visible ;
   private int edtavBarcodreo_Visible ;
   private int edtavBarcodpar_Visible ;
   private int nGXsfl_17_idx=1 ;
   private int AV9BarCod ;
   private int subGridmaquinas_Islastpage ;
   private int subGridhdrs_Islastpage ;
   private int edtavSdtmaquina_maqdsc_Enabled ;
   private int edtavTexto_Enabled ;
   private int subGridmaquinas_Width ;
   private int AV46GXV2 ;
   private int AV47GXV3 ;
   private int tblTblhdr_Backcolor ;
   private int edtavTexto_Forecolor ;
   private int tblTblhdr_Width ;
   private int idxLst ;
   private int subGridhdrs_Backcolor ;
   private int subGridhdrs_Allbackcolor ;
   private int subGridmaquinas_Backcolor ;
   private int subGridmaquinas_Allbackcolor ;
   private int edtavMaqcod_Enabled ;
   private int subGridmaquinas_Selectedindex ;
   private int subGridmaquinas_Selectioncolor ;
   private int subGridmaquinas_Hoveringcolor ;
   private int subGridhdrs_Selectedindex ;
   private int subGridhdrs_Selectioncolor ;
   private int subGridhdrs_Hoveringcolor ;
   private long GRIDHDRS_nCurrentRecord ;
   private long GRIDMAQUINAS_nCurrentRecord ;
   private long GRIDHDRS_nFirstRecordOnPage ;
   private long GRIDMAQUINAS_nFirstRecordOnPage ;
   private long AV37Rgb ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String sGXsfl_35_idx="0001" ;
   private String edtavBarcod_Internalname ;
   private String edtavBarcodreo_Internalname ;
   private String edtavBarcodpar_Internalname ;
   private String AV15Emprcod ;
   private String AV27PrefijoMaqCod ;
   private String sGXsfl_17_idx="0001" ;
   private String edtavMaqcod_Internalname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Dvpanel_panelprogramacion_Cls ;
   private String Dvpanel_panelprogramacion_Title ;
   private String Dvpanel_panelprogramacion_Iconposition ;
   private String subGridmaquinas_Class ;
   private String subGridmaquinas_Variablewidth ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divTablecontent_Internalname ;
   private String divTablecontent_Class ;
   private String Dvpanel_panelprogramacion_Internalname ;
   private String sStyleString ;
   private String subGridmaquinas_Internalname ;
   private String subGridhdrs_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV5Maqcod ;
   private String edtavSdtmaquina_maqdsc_Internalname ;
   private String edtavTexto_Internalname ;
   private String AV10BarCodPar ;
   private String GXCCtl ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXv_char4[] ;
   private String tblTblhdr_Internalname ;
   private String tblPanelprogramacion_Internalname ;
   private String sCtrlAV23MaqCodVisibleJson ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String subGridhdrs_Class ;
   private String subGridhdrs_Linesclass ;
   private String ROClassString ;
   private String edtavTexto_Jsonclick ;
   private String edtavBarcod_Jsonclick ;
   private String edtavBarcodreo_Jsonclick ;
   private String edtavBarcodpar_Jsonclick ;
   private String sGXsfl_17_fel_idx="0001" ;
   private String subGridmaquinas_Linesclass ;
   private String divUnnamedtablefsgridmaquinas_Internalname ;
   private String tblUnnamedtablecontentfsgridmaquinas_Internalname ;
   private String TempTags ;
   private String edtavMaqcod_Jsonclick ;
   private String tblTblmaquina_Internalname ;
   private String edtavSdtmaquina_maqdsc_Jsonclick ;
   private String divTable1_Internalname ;
   private String subGridmaquinas_Header ;
   private String subGridhdrs_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean bGXsfl_17_Refreshing=false ;
   private boolean Dvpanel_panelprogramacion_Autowidth ;
   private boolean Dvpanel_panelprogramacion_Autoheight ;
   private boolean Dvpanel_panelprogramacion_Collapsible ;
   private boolean Dvpanel_panelprogramacion_Showcollapseicon ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String wcpOAV23MaqCodVisibleJson ;
   private String AV23MaqCodVisibleJson ;
   private String AV30Texto ;
   private com.genexus.webpanels.GXWebGrid GridmaquinasContainer ;
   private com.genexus.webpanels.GXWebGrid GridhdrsContainer ;
   private com.genexus.webpanels.GXWebRow GridmaquinasRow ;
   private com.genexus.webpanels.GXWebRow GridhdrsRow ;
   private com.genexus.webpanels.GXWebColumn GridmaquinasColumn ;
   private com.genexus.webpanels.GXWebColumn GridhdrsColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_panelprogramacion ;
   private GXSimpleCollection<String> AV21MaqCodVisible ;
   private GXBaseCollection<app.SdtSDTHdrsporMaquina> AV6SDTHdrsporMaquinaCollection ;
   private GXBaseCollection<app.SdtSDTMaquina> AV7SDTMaquinaCollection ;
   private GXBaseCollection<app.SdtSDTMaquina> GXt_objcol_SdtSDTMaquina7 ;
   private GXBaseCollection<app.SdtSDTMaquina> GXv_objcol_SdtSDTMaquina8[] ;
   private app.SdtSDTHdrsporMaquina AV28SDTHdrsporMaquina ;
   private app.SdtSDTMaquina AV29SDTMaquina ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV14DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

