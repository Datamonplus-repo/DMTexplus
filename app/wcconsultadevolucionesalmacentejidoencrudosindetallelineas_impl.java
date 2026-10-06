package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl extends GXWebComponent
{
   public wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.class ));
   }

   public wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl( int remoteHandle ,
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
               AV49Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Emprcod", AV49Emprcod);
               AV50DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50DevCruId), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV49Emprcod,Integer.valueOf(AV50DevCruId)});
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
      nRC_GXsfl_43 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_43"))) ;
      nGXsfl_43_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_43_idx"))) ;
      sGXsfl_43_idx = httpContext.GetPar( "sGXsfl_43_idx") ;
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
      AV15FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV49Emprcod = httpContext.GetPar( "Emprcod") ;
      AV50DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV51TFAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod"))) ;
      AV52TFAlbRecCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod_To"))) ;
      AV65TFAlbREnt = httpContext.GetPar( "TFAlbREnt") ;
      AV66TFAlbREnt_Sel = httpContext.GetPar( "TFAlbREnt_Sel") ;
      AV53TFAlbRef = httpContext.GetPar( "TFAlbRef") ;
      AV54TFAlbRef_Sel = httpContext.GetPar( "TFAlbRef_Sel") ;
      AV55TFAlbRefDsc = httpContext.GetPar( "TFAlbRefDsc") ;
      AV56TFAlbRefDsc_Sel = httpContext.GetPar( "TFAlbRefDsc_Sel") ;
      AV57TFDevCruPzs = (int)(GXutil.lval( httpContext.GetPar( "TFDevCruPzs"))) ;
      AV58TFDevCruPzs_To = (int)(GXutil.lval( httpContext.GetPar( "TFDevCruPzs_To"))) ;
      AV59TFDevCruUnd = CommonUtil.decimalVal( httpContext.GetPar( "TFDevCruUnd"), ".") ;
      AV60TFDevCruUnd_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDevCruUnd_To"), ".") ;
      AV72Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV61TotDevCruPzs = GXutil.lval( httpContext.GetPar( "TotDevCruPzs")) ;
      AV63TotDevCruUnd = CommonUtil.decimalVal( httpContext.GetPar( "TotDevCruUnd"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV49Emprcod, AV50DevCruId, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV51TFAlbRecCod, AV52TFAlbRecCod_To, AV65TFAlbREnt, AV66TFAlbREnt_Sel, AV53TFAlbRef, AV54TFAlbRef_Sel, AV55TFAlbRefDsc, AV56TFAlbRefDsc_Sel, AV57TFDevCruPzs, AV58TFDevCruPzs_To, AV59TFDevCruUnd, AV60TFDevCruUnd_To, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV61TotDevCruPzs, AV63TotDevCruUnd, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa16P2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Devolucion Almacen Tejido Crudo (sin detalle)", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcconsultadevolucionesalmacentejidoencrudosindetallelineas", new String[] {GXutil.URLEncode(GXutil.rtrim(AV49Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV50DevCruId,8,0))}, new String[] {"Emprcod","DevCruId"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDEVCRUPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61TotDevCruPzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDEVCRUUND", getSecureSignedToken( sPrefix, localUtil.format( AV63TotDevCruUnd, "ZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcconsultadevolucionesalmacentejidoencrudosindetallelineas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV15FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_43", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_43, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV23ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV46GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV47GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV49Emprcod", GXutil.rtrim( wcpOAV49Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50DevCruId", GXutil.ltrim( localUtil.ntoc( wcpOAV50DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV51TFAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRECCOD_TO", GXutil.ltrim( localUtil.ntoc( AV52TFAlbRecCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRENT", GXutil.rtrim( AV65TFAlbREnt));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBRENT_SEL", GXutil.rtrim( AV66TFAlbREnt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBREF", GXutil.rtrim( AV53TFAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBREF_SEL", GXutil.rtrim( AV54TFAlbRef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBREFDSC", GXutil.rtrim( AV55TFAlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBREFDSC_SEL", GXutil.rtrim( AV56TFAlbRefDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDEVCRUPZS", GXutil.ltrim( localUtil.ntoc( AV57TFDevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDEVCRUPZS_TO", GXutil.ltrim( localUtil.ntoc( AV58TFDevCruPzs_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDEVCRUUND", GXutil.ltrim( localUtil.ntoc( AV59TFDevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFDEVCRUUND_TO", GXutil.ltrim( localUtil.ntoc( AV60TFDevCruUnd_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV49Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDEVCRUID", GXutil.ltrim( localUtil.ntoc( AV50DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DEVCRUID", GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDEVCRUPZS", GXutil.ltrim( localUtil.ntoc( AV61TotDevCruPzs, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDEVCRUPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61TotDevCruPzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDEVCRUUND", GXutil.ltrim( localUtil.ntoc( AV63TotDevCruUnd, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDEVCRUUND", getSecureSignedToken( sPrefix, localUtil.format( AV63TotDevCruUnd, "ZZZZZ9.99")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV10GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV10GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icontype", GXutil.rtrim( Ddo_managefilters_Icontype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Icon", GXutil.rtrim( Ddo_managefilters_Icon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Tooltip", GXutil.rtrim( Ddo_managefilters_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Cls", GXutil.rtrim( Ddo_managefilters_Cls));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Width", GXutil.rtrim( Innewwindow1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Height", GXutil.rtrim( Innewwindow1_Height));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"INNEWWINDOW1_Target", GXutil.rtrim( Innewwindow1_Target));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
   }

   public void renderHtmlCloseForm16P2( )
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
      return "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Devolucion Almacen Tejido Crudo (sin detalle)", "") ;
   }

   public void wb16P0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcconsultadevolucionesalmacentejidoencrudosindetallelineas");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "flex-wrap:wrap;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 17,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e1116p1_client"+"'", TempTags, "", 2, "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_16P2( true) ;
      }
      else
      {
         wb_table1_25_16P2( false) ;
      }
      return  ;
   }

   public void wb_table1_25_16P2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol43( ) ;
      }
      if ( wbEnd == 43 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_43 = (int)(nGXsfl_43_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_52_16P2( true) ;
      }
      else
      {
         wb_table2_52_16P2( false) ;
      }
      return  ;
   }

   public void wb_table2_52_16P2e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV46GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV47GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV72Pgmname), GXutil.rtrim( localUtil.format( AV72Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas.htm");
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
         /* User Defined Control */
         ucDdo_grid.setProperty("Caption", Ddo_grid_Caption);
         ucDdo_grid.setProperty("ColumnIds", Ddo_grid_Columnids);
         ucDdo_grid.setProperty("ColumnsSortValues", Ddo_grid_Columnssortvalues);
         ucDdo_grid.setProperty("IncludeSortASC", Ddo_grid_Includesortasc);
         ucDdo_grid.setProperty("Fixable", Ddo_grid_Fixable);
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV20ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 43 )
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

   public void start16P2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Devolucion Almacen Tejido Crudo (sin detalle)", ""), (short)(0)) ;
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
            strup16P0( ) ;
         }
      }
   }

   public void ws16P2( )
   {
      start16P2( ) ;
      evt16P2( ) ;
   }

   public void evt16P2( )
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
                              strup16P0( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_MANAGEFILTERS.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1216P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1316P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1416P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1516P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e1616P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e1716P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e1816P2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16P0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavFilterfulltext_Internalname ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16P0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
                           A11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)) ;
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1916P2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e2016P2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2116P2 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strup16P0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                    }
                                 }
                              }
                           }
                           else
                           {
                           }
                        }
                        else if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup16P0( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A46AlbREnt = httpContext.cgiGet( edtAlbREnt_Internalname) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
                           A11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)) ;
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e1916P2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e2016P2 ();
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
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e2116P2 ();
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
                                          /* Set Refresh If Filterfulltext Changed */
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
                                          {
                                             Rfr0gs = true ;
                                          }
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
                                    strup16P0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavFilterfulltext_Internalname ;
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

   public void we16P2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm16P2( ) ;
         }
      }
   }

   public void pa16P2( )
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
            GX_FocusControl = edtavFilterfulltext_Internalname ;
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
      subsflControlProps_432( ) ;
      while ( nGXsfl_43_idx <= nRC_GXsfl_43 )
      {
         sendrow_432( ) ;
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15FilterFullText ,
                                 String AV49Emprcod ,
                                 int AV50DevCruId ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 int AV51TFAlbRecCod ,
                                 int AV52TFAlbRecCod_To ,
                                 String AV65TFAlbREnt ,
                                 String AV66TFAlbREnt_Sel ,
                                 String AV53TFAlbRef ,
                                 String AV54TFAlbRef_Sel ,
                                 String AV55TFAlbRefDsc ,
                                 String AV56TFAlbRefDsc_Sel ,
                                 int AV57TFDevCruPzs ,
                                 int AV58TFDevCruPzs_To ,
                                 java.math.BigDecimal AV59TFDevCruUnd ,
                                 java.math.BigDecimal AV60TFDevCruUnd_To ,
                                 String AV72Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 long AV61TotDevCruPzs ,
                                 java.math.BigDecimal AV63TotDevCruUnd ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2016P2 ();
      GRID_nCurrentRecord = 0 ;
      rf16P2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("wcconsultadevolucionesalmacentejidoencrudosindetallelineas:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf16P2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV72Pgmname = "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluedevcrupzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedevcrupzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedevcrupzs_Enabled), 5, 0), true);
      edtavTotvaluedevcruund_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedevcruund_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedevcruund_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf16P2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e2016P2 ();
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      bGXsfl_43_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_432( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                              Integer.valueOf(AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) ,
                                              Integer.valueOf(AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) ,
                                              AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                              AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                              AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                              AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                              AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                              AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                              Integer.valueOf(AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) ,
                                              Integer.valueOf(AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) ,
                                              AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                              AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A46AlbREnt ,
                                              A45AlbRef ,
                                              A3613AlbRefDsc ,
                                              Integer.valueOf(A11684DevCruPzs) ,
                                              A11683DevCruUnd ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV49Emprcod ,
                                              Integer.valueOf(AV50DevCruId) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A11669DevCruId) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
         lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
         lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
         lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
         lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
         lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
         lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent), 8, "%") ;
         lV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = GXutil.padr( GXutil.rtrim( AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref), 16, "%") ;
         lV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc), 26, "%") ;
         /* Using cursor H016P2 */
         pr_default.execute(0, new Object[] {AV49Emprcod, Integer.valueOf(AV50DevCruId), lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, Integer.valueOf(AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod), Integer.valueOf(AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to), lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent, AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel, lV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref, AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel, lV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc, AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel, Integer.valueOf(AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs), Integer.valueOf(AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to), AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund, AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A11669DevCruId = H016P2_A11669DevCruId[0] ;
            A11670DevCruFec = H016P2_A11670DevCruFec[0] ;
            A396EmprCod = H016P2_A396EmprCod[0] ;
            A11683DevCruUnd = H016P2_A11683DevCruUnd[0] ;
            A11684DevCruPzs = H016P2_A11684DevCruPzs[0] ;
            A3613AlbRefDsc = H016P2_A3613AlbRefDsc[0] ;
            A45AlbRef = H016P2_A45AlbRef[0] ;
            A46AlbREnt = H016P2_A46AlbREnt[0] ;
            A44AlbRecCod = H016P2_A44AlbRecCod[0] ;
            A11670DevCruFec = H016P2_A11670DevCruFec[0] ;
            A3613AlbRefDsc = H016P2_A3613AlbRefDsc[0] ;
            A45AlbRef = H016P2_A45AlbRef[0] ;
            A46AlbREnt = H016P2_A46AlbREnt[0] ;
            e2116P2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wb16P0( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes16P2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDEVCRUPZS", GXutil.ltrim( localUtil.ntoc( AV61TotDevCruPzs, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDEVCRUPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61TotDevCruPzs), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTDEVCRUUND", GXutil.ltrim( localUtil.ntoc( AV63TotDevCruUnd, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDEVCRUUND", getSecureSignedToken( sPrefix, localUtil.format( AV63TotDevCruUnd, "ZZZZZ9.99")));
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
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV15FilterFullText ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV65TFAlbREnt ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV66TFAlbREnt_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV53TFAlbRef ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV54TFAlbRef_Sel ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV55TFAlbRefDsc ;
      AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV56TFAlbRefDsc_Sel ;
      AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV57TFDevCruPzs ;
      AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV58TFDevCruPzs_To ;
      AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV59TFDevCruUnd ;
      AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV60TFDevCruUnd_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                           Integer.valueOf(AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) ,
                                           Integer.valueOf(AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) ,
                                           AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                           AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                           AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                           AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                           AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                           AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                           Integer.valueOf(AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) ,
                                           Integer.valueOf(AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) ,
                                           AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                           AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A11684DevCruPzs) ,
                                           A11683DevCruUnd ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV49Emprcod ,
                                           Integer.valueOf(AV50DevCruId) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A11669DevCruId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent), 8, "%") ;
      lV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = GXutil.padr( GXutil.rtrim( AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref), 16, "%") ;
      lV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc), 26, "%") ;
      /* Using cursor H016P3 */
      pr_default.execute(1, new Object[] {AV49Emprcod, Integer.valueOf(AV50DevCruId), lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, Integer.valueOf(AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod), Integer.valueOf(AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to), lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent, AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel, lV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref, AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel, lV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc, AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel, Integer.valueOf(AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs), Integer.valueOf(AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to), AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund, AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to});
      GRID_nRecordCount = H016P3_AGRID_nRecordCount[0] ;
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
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV15FilterFullText ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV65TFAlbREnt ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV66TFAlbREnt_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV53TFAlbRef ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV54TFAlbRef_Sel ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV55TFAlbRefDsc ;
      AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV56TFAlbRefDsc_Sel ;
      AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV57TFDevCruPzs ;
      AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV58TFDevCruPzs_To ;
      AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV59TFDevCruUnd ;
      AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV60TFDevCruUnd_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV49Emprcod, AV50DevCruId, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV51TFAlbRecCod, AV52TFAlbRecCod_To, AV65TFAlbREnt, AV66TFAlbREnt_Sel, AV53TFAlbRef, AV54TFAlbRef_Sel, AV55TFAlbRefDsc, AV56TFAlbRefDsc_Sel, AV57TFDevCruPzs, AV58TFDevCruPzs_To, AV59TFDevCruUnd, AV60TFDevCruUnd_To, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV61TotDevCruPzs, AV63TotDevCruUnd, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV15FilterFullText ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV65TFAlbREnt ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV66TFAlbREnt_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV53TFAlbRef ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV54TFAlbRef_Sel ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV55TFAlbRefDsc ;
      AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV56TFAlbRefDsc_Sel ;
      AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV57TFDevCruPzs ;
      AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV58TFDevCruPzs_To ;
      AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV59TFDevCruUnd ;
      AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV60TFDevCruUnd_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV49Emprcod, AV50DevCruId, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV51TFAlbRecCod, AV52TFAlbRecCod_To, AV65TFAlbREnt, AV66TFAlbREnt_Sel, AV53TFAlbRef, AV54TFAlbRef_Sel, AV55TFAlbRefDsc, AV56TFAlbRefDsc_Sel, AV57TFDevCruPzs, AV58TFDevCruPzs_To, AV59TFDevCruUnd, AV60TFDevCruUnd_To, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV61TotDevCruPzs, AV63TotDevCruUnd, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV15FilterFullText ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV65TFAlbREnt ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV66TFAlbREnt_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV53TFAlbRef ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV54TFAlbRef_Sel ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV55TFAlbRefDsc ;
      AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV56TFAlbRefDsc_Sel ;
      AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV57TFDevCruPzs ;
      AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV58TFDevCruPzs_To ;
      AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV59TFDevCruUnd ;
      AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV60TFDevCruUnd_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV49Emprcod, AV50DevCruId, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV51TFAlbRecCod, AV52TFAlbRecCod_To, AV65TFAlbREnt, AV66TFAlbREnt_Sel, AV53TFAlbRef, AV54TFAlbRef_Sel, AV55TFAlbRefDsc, AV56TFAlbRefDsc_Sel, AV57TFDevCruPzs, AV58TFDevCruPzs_To, AV59TFDevCruUnd, AV60TFDevCruUnd_To, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV61TotDevCruPzs, AV63TotDevCruUnd, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV15FilterFullText ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV65TFAlbREnt ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV66TFAlbREnt_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV53TFAlbRef ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV54TFAlbRef_Sel ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV55TFAlbRefDsc ;
      AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV56TFAlbRefDsc_Sel ;
      AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV57TFDevCruPzs ;
      AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV58TFDevCruPzs_To ;
      AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV59TFDevCruUnd ;
      AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV60TFDevCruUnd_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV49Emprcod, AV50DevCruId, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV51TFAlbRecCod, AV52TFAlbRecCod_To, AV65TFAlbREnt, AV66TFAlbREnt_Sel, AV53TFAlbRef, AV54TFAlbRef_Sel, AV55TFAlbRefDsc, AV56TFAlbRefDsc_Sel, AV57TFDevCruPzs, AV58TFDevCruPzs_To, AV59TFDevCruUnd, AV60TFDevCruUnd_To, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV61TotDevCruPzs, AV63TotDevCruUnd, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV15FilterFullText ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV65TFAlbREnt ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV66TFAlbREnt_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV53TFAlbRef ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV54TFAlbRef_Sel ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV55TFAlbRefDsc ;
      AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV56TFAlbRefDsc_Sel ;
      AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV57TFDevCruPzs ;
      AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV58TFDevCruPzs_To ;
      AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV59TFDevCruUnd ;
      AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV60TFDevCruUnd_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV49Emprcod, AV50DevCruId, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV51TFAlbRecCod, AV52TFAlbRecCod_To, AV65TFAlbREnt, AV66TFAlbREnt_Sel, AV53TFAlbRef, AV54TFAlbRef_Sel, AV55TFAlbRefDsc, AV56TFAlbRefDsc_Sel, AV57TFDevCruPzs, AV58TFDevCruPzs_To, AV59TFDevCruUnd, AV60TFDevCruUnd_To, AV72Pgmname, AV12OrderedBy, AV13OrderedDsc, AV61TotDevCruPzs, AV63TotDevCruUnd, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV72Pgmname = "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
      Gx_err = (short)(0) ;
      edtavTotvaluedevcrupzs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedevcrupzs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedevcrupzs_Enabled), 5, 0), true);
      edtavTotvaluedevcruund_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluedevcruund_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluedevcruund_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup16P0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e1916P2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV49Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV49Emprcod") ;
         wcpOAV50DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV50DevCruId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_managefilters_Icontype = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icontype") ;
         Ddo_managefilters_Icon = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Icon") ;
         Ddo_managefilters_Tooltip = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Tooltip") ;
         Ddo_managefilters_Cls = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Cls") ;
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
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( sPrefix+"DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Innewwindow1_Width = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Width") ;
         Innewwindow1_Height = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Height") ;
         Innewwindow1_Target = httpContext.cgiGet( sPrefix+"INNEWWINDOW1_Target") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascolumnsselector")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( sPrefix+"DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         /* Read variables values. */
         AV15FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         AV62TotValueDevCruPzs = httpContext.cgiGet( edtavTotvaluedevcrupzs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TotValueDevCruPzs", AV62TotValueDevCruPzs);
         AV64TotValueDevCruUnd = httpContext.cgiGet( edtavTotvaluedevcruund_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TotValueDevCruUnd", AV64TotValueDevCruUnd);
         AV72Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas");
         AV72Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("wcconsultadevolucionesalmacentejidoencrudosindetallelineas:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
         {
            GRID_nFirstRecordOnPage = 0 ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV15FilterFullText) != 0 )
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
      e1916P2 ();
      if (returnInSub) return;
   }

   public void e1916P2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV67Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.GXt_char1 = GXv_char2[0] ;
      AV67Station = GXt_char1 ;
      GXv_char2[0] = AV49Emprcod ;
      GXv_char3[0] = AV69EmprNom ;
      GXv_char4[0] = AV68UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV67Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.AV49Emprcod = GXv_char2[0] ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.AV69EmprNom = GXv_char3[0] ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.AV68UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Emprcod", AV49Emprcod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      /* Execute user subroutine: 'LOADSAVEDFILTERS' */
      S112 ();
      if (returnInSub) return;
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV12OrderedBy < 1 )
      {
         AV12OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e2016P2( )
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
      if ( AV25ManageFiltersExecutionStep == 1 )
      {
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV25ManageFiltersExecutionStep == 2 )
      {
         AV25ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV22Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtAlbRecCod_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRecCod_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRecCod_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbREnt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbREnt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbREnt_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbRef_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRef_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbRefDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbRefDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbRefDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtDevCruPzs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruPzs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruPzs_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtDevCruUnd_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtDevCruUnd_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtDevCruUnd_Visible), 5, 0), !bGXsfl_43_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV46GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridCurrentPage), 10, 0));
      AV47GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV15FilterFullText ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV65TFAlbREnt ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV66TFAlbREnt_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV53TFAlbRef ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV54TFAlbRef_Sel ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV55TFAlbRefDsc ;
      AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV56TFAlbRefDsc_Sel ;
      AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV57TFDevCruPzs ;
      AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV58TFDevCruPzs_To ;
      AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV59TFDevCruUnd ;
      AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV60TFDevCruUnd_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1316P2( )
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
         AV45PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV45PageToGo) ;
      }
   }

   public void e1416P2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1516P2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV12OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
         AV13OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecCod") == 0 )
         {
            AV51TFAlbRecCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFAlbRecCod), 8, 0));
            AV52TFAlbRecCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbREnt") == 0 )
         {
            AV65TFAlbREnt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbREnt", AV65TFAlbREnt);
            AV66TFAlbREnt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFAlbREnt_Sel", AV66TFAlbREnt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRef") == 0 )
         {
            AV53TFAlbRef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFAlbRef", AV53TFAlbRef);
            AV54TFAlbRef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFAlbRef_Sel", AV54TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRefDsc") == 0 )
         {
            AV55TFAlbRefDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFAlbRefDsc", AV55TFAlbRefDsc);
            AV56TFAlbRefDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbRefDsc_Sel", AV56TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruPzs") == 0 )
         {
            AV57TFDevCruPzs = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFDevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFDevCruPzs), 6, 0));
            AV58TFDevCruPzs_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFDevCruPzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFDevCruPzs_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruUnd") == 0 )
         {
            AV59TFDevCruUnd = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFDevCruUnd", GXutil.ltrimstr( AV59TFDevCruUnd, 9, 2));
            AV60TFDevCruUnd_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFDevCruUnd_To", GXutil.ltrimstr( AV60TFDevCruUnd_To, 9, 2));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2116P2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(43) ;
      }
      sendrow_432( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_43_Refreshing )
      {
         httpContext.doAjaxLoad(43, GridRow);
      }
   }

   public void e1616P2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e1216P2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S192 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasFilters")),GXutil.URLEncode(GXutil.rtrim(AV72Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.GXt_char1 = GXv_char4[0] ;
         AV24ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV24ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S192 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV72Pgmname+"GridState", AV24ManageFiltersXml) ;
            AV10GridState.fromxml(AV24ManageFiltersXml, null, null);
            AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
            AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S202 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
   }

   public void e1716P2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.wcconsultadevolucionesalmacentejidoencrudosindetallelineasexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.AV17ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV16ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV16ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV17ErrorMessage);
      }
   }

   public void e1816P2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcconsultadevolucionesalmacentejidoencrudosindetallelineasexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV12OrderedBy, 4, 0))+":"+(AV13OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV20ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRecCod", "", "N Recepcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbREnt", "", "Nº Documento", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRef", "", "Referencia", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbRefDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruPzs", "", "Piezas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "DevCruUnd", "", "Unidades", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasColumnsSelector", GXv_char4) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.GXt_char1 = GXv_char4[0] ;
      AV19UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV19UserCustomValue)==0) ) )
      {
         AV21ColumnsSelectorAux.fromxml(AV19UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector8[0] = AV21ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector9[0] = AV20ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, GXv_SdtWWPColumnsSelector9) ;
         AV21ColumnsSelectorAux = GXv_SdtWWPColumnsSelector8[0] ;
         AV20ColumnsSelector = GXv_SdtWWPColumnsSelector9[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = AV23ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV51TFAlbRecCod = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFAlbRecCod), 8, 0));
      AV52TFAlbRecCod_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFAlbRecCod_To), 8, 0));
      AV65TFAlbREnt = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbREnt", AV65TFAlbREnt);
      AV66TFAlbREnt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFAlbREnt_Sel", AV66TFAlbREnt_Sel);
      AV53TFAlbRef = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFAlbRef", AV53TFAlbRef);
      AV54TFAlbRef_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFAlbRef_Sel", AV54TFAlbRef_Sel);
      AV55TFAlbRefDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFAlbRefDsc", AV55TFAlbRefDsc);
      AV56TFAlbRefDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbRefDsc_Sel", AV56TFAlbRefDsc_Sel);
      AV57TFDevCruPzs = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFDevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFDevCruPzs), 6, 0));
      AV58TFDevCruPzs_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFDevCruPzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFDevCruPzs_To), 6, 0));
      AV59TFDevCruUnd = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFDevCruUnd", GXutil.ltrimstr( AV59TFDevCruUnd, 9, 2));
      AV60TFDevCruUnd_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFDevCruUnd_To", GXutil.ltrimstr( AV60TFDevCruUnd_To, 9, 2));
      Ddo_grid_Selectedvalue_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      Ddo_grid_Filteredtext_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV72Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV72Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV72Pgmname+"GridState"), null, null);
      }
      AV12OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV12OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12OrderedBy), 4, 0));
      AV13OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV13OrderedDsc", AV13OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S202 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV10GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV10GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV10GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S202( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV86GXV1 = 1 ;
      while ( AV86GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV86GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV51TFAlbRecCod = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51TFAlbRecCod), 8, 0));
            AV52TFAlbRecCod_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT") == 0 )
         {
            AV65TFAlbREnt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbREnt", AV65TFAlbREnt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRENT_SEL") == 0 )
         {
            AV66TFAlbREnt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFAlbREnt_Sel", AV66TFAlbREnt_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV53TFAlbRef = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFAlbRef", AV53TFAlbRef);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV54TFAlbRef_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFAlbRef_Sel", AV54TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV55TFAlbRefDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFAlbRefDsc", AV55TFAlbRefDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV56TFAlbRefDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFAlbRefDsc_Sel", AV56TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUPZS") == 0 )
         {
            AV57TFDevCruPzs = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFDevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFDevCruPzs), 6, 0));
            AV58TFDevCruPzs_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFDevCruPzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFDevCruPzs_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUUND") == 0 )
         {
            AV59TFDevCruUnd = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFDevCruUnd", GXutil.ltrimstr( AV59TFDevCruUnd, 9, 2));
            AV60TFDevCruUnd_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFDevCruUnd_To", GXutil.ltrimstr( AV60TFDevCruUnd_To, 9, 2));
         }
         AV86GXV1 = (int)(AV86GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFAlbREnt_Sel)==0), AV66TFAlbREnt_Sel, GXv_char4) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFAlbRef_Sel)==0), AV54TFAlbRef_Sel, GXv_char3) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFAlbRefDsc_Sel)==0), AV56TFAlbRefDsc_Sel, GXv_char2) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.GXt_char13 = GXv_char2[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"|"+GXt_char13+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV65TFAlbREnt)==0), AV65TFAlbREnt, GXv_char4) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFAlbRef)==0), AV53TFAlbRef, GXv_char3) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFAlbRefDsc)==0), AV55TFAlbRefDsc, GXv_char2) ;
      wcconsultadevolucionesalmacentejidoencrudosindetallelineas_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV51TFAlbRecCod) ? "" : GXutil.str( AV51TFAlbRecCod, 8, 0))+"|"+GXt_char13+"|"+GXt_char12+"|"+GXt_char1+"|"+((0==AV57TFDevCruPzs) ? "" : GXutil.str( AV57TFDevCruPzs, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFDevCruUnd)==0) ? "" : GXutil.str( AV59TFDevCruUnd, 9, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV52TFAlbRecCod_To) ? "" : GXutil.str( AV52TFAlbRecCod_To, 8, 0))+"||||"+((0==AV58TFDevCruPzs_To) ? "" : GXutil.str( AV58TFDevCruPzs_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFDevCruUnd_To)==0) ? "" : GXutil.str( AV60TFDevCruUnd_To, 9, 2)) ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV72Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRECCOD", "", !((0==AV51TFAlbRecCod)&&(0==AV52TFAlbRecCod_To)), (short)(0), GXutil.trim( GXutil.str( AV51TFAlbRecCod, 8, 0)), GXutil.trim( GXutil.str( AV52TFAlbRecCod_To, 8, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBRENT", "", !(GXutil.strcmp("", AV65TFAlbREnt)==0), (short)(0), AV65TFAlbREnt, "", !(GXutil.strcmp("", AV66TFAlbREnt_Sel)==0), AV66TFAlbREnt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBREF", "", !(GXutil.strcmp("", AV53TFAlbRef)==0), (short)(0), AV53TFAlbRef, "", !(GXutil.strcmp("", AV54TFAlbRef_Sel)==0), AV54TFAlbRef_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFALBREFDSC", "", !(GXutil.strcmp("", AV55TFAlbRefDsc)==0), (short)(0), AV55TFAlbRefDsc, "", !(GXutil.strcmp("", AV56TFAlbRefDsc_Sel)==0), AV56TFAlbRefDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFDEVCRUPZS", "", !((0==AV57TFDevCruPzs)&&(0==AV58TFDevCruPzs_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFDevCruPzs, 6, 0)), GXutil.trim( GXutil.str( AV58TFDevCruPzs_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      GXv_SdtWWPGridState14[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState14, "TFDEVCRUUND", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV59TFDevCruUnd)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFDevCruUnd_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV59TFDevCruUnd, 9, 2)), GXutil.trim( GXutil.str( AV60TFDevCruUnd_To, 9, 2))) ;
      AV10GridState = GXv_SdtWWPGridState14[0] ;
      if ( ! (GXutil.strcmp("", AV49Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV49Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV50DevCruId) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DEVCRUID" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV50DevCruId, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV72Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV72Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DevolucionAlmacenTejidoCrudosindetalle" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV61TotDevCruPzs = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TotDevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TotDevCruPzs), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDEVCRUPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61TotDevCruPzs), "ZZZZZ9")));
      AV63TotDevCruUnd = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TotDevCruUnd", GXutil.ltrimstr( AV63TotDevCruUnd, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDEVCRUUND", getSecureSignedToken( sPrefix, localUtil.format( AV63TotDevCruUnd, "ZZZZZ9.99")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = AV15FilterFullText ;
      AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod = AV51TFAlbRecCod ;
      AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to = AV52TFAlbRecCod_To ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = AV65TFAlbREnt ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = AV66TFAlbREnt_Sel ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = AV53TFAlbRef ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = AV54TFAlbRef_Sel ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = AV55TFAlbRefDsc ;
      AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = AV56TFAlbRefDsc_Sel ;
      AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs = AV57TFDevCruPzs ;
      AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to = AV58TFDevCruPzs_To ;
      AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = AV59TFDevCruUnd ;
      AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = AV60TFDevCruUnd_To ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                           Integer.valueOf(AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) ,
                                           Integer.valueOf(AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) ,
                                           AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                           AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                           AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                           AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                           AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                           AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                           Integer.valueOf(AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) ,
                                           Integer.valueOf(AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) ,
                                           AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                           AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A46AlbREnt ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           Integer.valueOf(A11684DevCruPzs) ,
                                           A11683DevCruUnd ,
                                           AV49Emprcod ,
                                           Integer.valueOf(AV50DevCruId) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A11669DevCruId) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext), "%", "") ;
      lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = GXutil.padr( GXutil.rtrim( AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent), 8, "%") ;
      lV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = GXutil.padr( GXutil.rtrim( AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref), 16, "%") ;
      lV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc), 26, "%") ;
      /* Using cursor H016P4 */
      pr_default.execute(2, new Object[] {AV49Emprcod, Integer.valueOf(AV50DevCruId), lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext, Integer.valueOf(AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod), Integer.valueOf(AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to), lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent, AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel, lV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref, AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel, lV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc, AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel, Integer.valueOf(AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs), Integer.valueOf(AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to), AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund, AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to});
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      GRID_nEOF = (byte)(0) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      while ( ( (pr_default.getStatus(2) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
      {
         A11669DevCruId = H016P4_A11669DevCruId[0] ;
         A396EmprCod = H016P4_A396EmprCod[0] ;
         A11683DevCruUnd = H016P4_A11683DevCruUnd[0] ;
         A11684DevCruPzs = H016P4_A11684DevCruPzs[0] ;
         A3613AlbRefDsc = H016P4_A3613AlbRefDsc[0] ;
         A45AlbRef = H016P4_A45AlbRef[0] ;
         A46AlbREnt = H016P4_A46AlbREnt[0] ;
         A44AlbRecCod = H016P4_A44AlbRecCod[0] ;
         A3613AlbRefDsc = H016P4_A3613AlbRefDsc[0] ;
         A45AlbRef = H016P4_A45AlbRef[0] ;
         A46AlbREnt = H016P4_A46AlbREnt[0] ;
         AV61TotDevCruPzs = (long)(A11684DevCruPzs+AV61TotDevCruPzs) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TotDevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61TotDevCruPzs), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDEVCRUPZS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV61TotDevCruPzs), "ZZZZZ9")));
         AV63TotDevCruUnd = A11683DevCruUnd.add(AV63TotDevCruUnd) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TotDevCruUnd", GXutil.ltrimstr( AV63TotDevCruUnd, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTDEVCRUUND", getSecureSignedToken( sPrefix, localUtil.format( AV63TotDevCruUnd, "ZZZZZ9.99")));
         pr_default.readNext(2);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(2) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(2);
      AV62TotValueDevCruPzs = localUtil.format( DecimalUtil.doubleToDec(AV61TotDevCruPzs), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TotValueDevCruPzs", AV62TotValueDevCruPzs);
      AV64TotValueDevCruUnd = localUtil.format( AV63TotDevCruUnd, "ZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TotValueDevCruUnd", AV64TotValueDevCruUnd);
   }

   public void wb_table2_52_16P2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedevcrupzs_Internalname, httpContext.getMessage( "Tot Value Dev Cru Pzs", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 60,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedevcrupzs_Internalname, AV62TotValueDevCruPzs, GXutil.rtrim( localUtil.format( AV62TotValueDevCruPzs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,60);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedevcrupzs_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedevcrupzs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluedevcruund_Internalname, httpContext.getMessage( "Tot Value Dev Cru Und", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluedevcruund_Internalname, AV64TotValueDevCruUnd, GXutil.rtrim( localUtil.format( AV64TotValueDevCruUnd, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluedevcruund_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluedevcruund_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_52_16P2e( true) ;
      }
      else
      {
         wb_table2_52_16P2e( false) ;
      }
   }

   public void wb_table1_25_16P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* User Defined Control */
         ucDdo_managefilters.setProperty("IconType", Ddo_managefilters_Icontype);
         ucDdo_managefilters.setProperty("Icon", Ddo_managefilters_Icon);
         ucDdo_managefilters.setProperty("Caption", Ddo_managefilters_Caption);
         ucDdo_managefilters.setProperty("Tooltip", Ddo_managefilters_Tooltip);
         ucDdo_managefilters.setProperty("Cls", Ddo_managefilters_Cls);
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV23ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table3_30_16P2( true) ;
      }
      else
      {
         wb_table3_30_16P2( false) ;
      }
      return  ;
   }

   public void wb_table3_30_16P2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_16P2e( true) ;
      }
      else
      {
         wb_table1_25_16P2e( false) ;
      }
   }

   public void wb_table3_30_16P2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablefilters_Internalname, tblTablefilters_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFilterfulltext_Internalname, httpContext.getMessage( "Filter Full Text", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_30_16P2e( true) ;
      }
      else
      {
         wb_table3_30_16P2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV49Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Emprcod", AV49Emprcod);
      AV50DevCruId = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50DevCruId), 8, 0));
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
      pa16P2( ) ;
      ws16P2( ) ;
      we16P2( ) ;
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
      sCtrlAV49Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV50DevCruId = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa16P2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcconsultadevolucionesalmacentejidoencrudosindetallelineas", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa16P2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV49Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Emprcod", AV49Emprcod);
         AV50DevCruId = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50DevCruId), 8, 0));
      }
      wcpOAV49Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV49Emprcod") ;
      wcpOAV50DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV50DevCruId"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV49Emprcod, wcpOAV49Emprcod) != 0 ) || ( AV50DevCruId != wcpOAV50DevCruId ) ) )
      {
         setjustcreated();
      }
      wcpOAV49Emprcod = AV49Emprcod ;
      wcpOAV50DevCruId = AV50DevCruId ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV49Emprcod = httpContext.cgiGet( sPrefix+"AV49Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV49Emprcod) > 0 )
      {
         AV49Emprcod = httpContext.cgiGet( sCtrlAV49Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49Emprcod", AV49Emprcod);
      }
      else
      {
         AV49Emprcod = httpContext.cgiGet( sPrefix+"AV49Emprcod_PARM") ;
      }
      sCtrlAV50DevCruId = httpContext.cgiGet( sPrefix+"AV50DevCruId_CTRL") ;
      if ( GXutil.len( sCtrlAV50DevCruId) > 0 )
      {
         AV50DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV50DevCruId), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50DevCruId), 8, 0));
      }
      else
      {
         AV50DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV50DevCruId_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa16P2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws16P2( ) ;
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
      ws16P2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49Emprcod_PARM", GXutil.rtrim( AV49Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV49Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV49Emprcod_CTRL", GXutil.rtrim( sCtrlAV49Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50DevCruId_PARM", GXutil.ltrim( localUtil.ntoc( AV50DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50DevCruId)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50DevCruId_CTRL", GXutil.rtrim( sCtrlAV50DevCruId));
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
      we16P2( ) ;
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
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211681487", true, true);
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
      httpContext.AddJavascriptSource("wcconsultadevolucionesalmacentejidoencrudosindetallelineas.js", "?20268211681488", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("Window/InNewWindowRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_432( )
   {
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_43_idx ;
      edtAlbREnt_Internalname = sPrefix+"ALBRENT_"+sGXsfl_43_idx ;
      edtAlbRef_Internalname = sPrefix+"ALBREF_"+sGXsfl_43_idx ;
      edtAlbRefDsc_Internalname = sPrefix+"ALBREFDSC_"+sGXsfl_43_idx ;
      edtDevCruPzs_Internalname = sPrefix+"DEVCRUPZS_"+sGXsfl_43_idx ;
      edtDevCruUnd_Internalname = sPrefix+"DEVCRUUND_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD_"+sGXsfl_43_fel_idx ;
      edtAlbREnt_Internalname = sPrefix+"ALBRENT_"+sGXsfl_43_fel_idx ;
      edtAlbRef_Internalname = sPrefix+"ALBREF_"+sGXsfl_43_fel_idx ;
      edtAlbRefDsc_Internalname = sPrefix+"ALBREFDSC_"+sGXsfl_43_fel_idx ;
      edtDevCruPzs_Internalname = sPrefix+"DEVCRUPZS_"+sGXsfl_43_fel_idx ;
      edtDevCruUnd_Internalname = sPrefix+"DEVCRUUND_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb16P0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_43_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_43_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_43_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRecCod_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbREnt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbREnt_Internalname,GXutil.rtrim( A46AlbREnt),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbREnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbREnt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRef_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbRefDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbRefDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevCruPzs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruPzs_Internalname,GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDevCruPzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDevCruPzs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtDevCruUnd_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11683DevCruUnd, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtDevCruUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtDevCruUnd_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes16P2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_43_idx = ((subGrid_Islastpage==1)&&(nGXsfl_43_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_43_idx+1) ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
      }
      /* End function sendrow_432 */
   }

   public void startgridcontrol43( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"43\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRecCod_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbREnt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Documento", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRef_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbRefDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruPzs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtDevCruUnd_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRecCod_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A46AlbREnt));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbREnt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRef_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3613AlbRefDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbRefDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruPzs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtDevCruUnd_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtAlbRecCod_Internalname = sPrefix+"ALBRECCOD" ;
      edtAlbREnt_Internalname = sPrefix+"ALBRENT" ;
      edtAlbRef_Internalname = sPrefix+"ALBREF" ;
      edtAlbRefDsc_Internalname = sPrefix+"ALBREFDSC" ;
      edtDevCruPzs_Internalname = sPrefix+"DEVCRUPZS" ;
      edtDevCruUnd_Internalname = sPrefix+"DEVCRUUND" ;
      edtavTotvaluedevcrupzs_Internalname = sPrefix+"vTOTVALUEDEVCRUPZS" ;
      edtavTotvaluedevcruund_Internalname = sPrefix+"vTOTVALUEDEVCRUUND" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      Datamonjs_Internalname = sPrefix+"DATAMONJS" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Innewwindow1_Internalname = sPrefix+"INNEWWINDOW1" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
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
      edtDevCruUnd_Jsonclick = "" ;
      edtDevCruPzs_Jsonclick = "" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbREnt_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluedevcruund_Jsonclick = "" ;
      edtavTotvaluedevcruund_Enabled = 1 ;
      edtavTotvaluedevcrupzs_Jsonclick = "" ;
      edtavTotvaluedevcrupzs_Enabled = 1 ;
      edtDevCruUnd_Visible = -1 ;
      edtDevCruPzs_Visible = -1 ;
      edtAlbRefDsc_Visible = -1 ;
      edtAlbRef_Visible = -1 ;
      edtAlbREnt_Visible = -1 ;
      edtAlbRecCod_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Innewwindow1_Target = "" ;
      Innewwindow1_Height = "50" ;
      Innewwindow1_Width = "50" ;
      Ddo_grid_Datalistproc = "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineasGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|Dynamic||" ;
      Ddo_grid_Includedatalist = "|T|T|T||" ;
      Ddo_grid_Filterisrange = "T||||T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Character|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7" ;
      Ddo_grid_Columnids = "0:AlbRecCod|1:AlbREnt|2:AlbRef|3:AlbRefDsc|4:DevCruPzs|5:DevCruUnd" ;
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
      Ddo_managefilters_Cls = "ManageFilters" ;
      Ddo_managefilters_Tooltip = "WWP_ManageFiltersTooltip" ;
      Ddo_managefilters_Icon = "fas fa-filter" ;
      Ddo_managefilters_Icontype = "FontIcon" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV52TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV65TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV66TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV53TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV55TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV56TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV58TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV59TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV60TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61TotDevCruPzs',fld:'vTOTDEVCRUPZS',pic:'ZZZZZ9',hsh:true},{av:'AV63TotDevCruUnd',fld:'vTOTDEVCRUUND',pic:'ZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A11684DevCruPzs',fld:'DEVCRUPZS',pic:'ZZZZZ9'},{av:'A11683DevCruUnd',fld:'DEVCRUUND',pic:'ZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbREnt_Visible',ctrl:'ALBRENT',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtDevCruPzs_Visible',ctrl:'DEVCRUPZS',prop:'Visible'},{av:'edtDevCruUnd_Visible',ctrl:'DEVCRUUND',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV61TotDevCruPzs',fld:'vTOTDEVCRUPZS',pic:'ZZZZZ9',hsh:true},{av:'AV63TotDevCruUnd',fld:'vTOTDEVCRUUND',pic:'ZZZZZ9.99',hsh:true},{av:'AV62TotValueDevCruPzs',fld:'vTOTVALUEDEVCRUPZS',pic:''},{av:'AV64TotValueDevCruUnd',fld:'vTOTVALUEDEVCRUUND',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1316P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV51TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV52TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV65TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV66TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV53TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV55TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV56TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV58TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV59TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV60TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61TotDevCruPzs',fld:'vTOTDEVCRUPZS',pic:'ZZZZZ9',hsh:true},{av:'AV63TotDevCruUnd',fld:'vTOTDEVCRUUND',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1416P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV51TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV52TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV65TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV66TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV53TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV55TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV56TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV58TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV59TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV60TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61TotDevCruPzs',fld:'vTOTDEVCRUPZS',pic:'ZZZZZ9',hsh:true},{av:'AV63TotDevCruUnd',fld:'vTOTDEVCRUUND',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1516P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV51TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV52TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV65TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV66TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV53TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV55TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV56TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV58TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV59TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV60TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61TotDevCruPzs',fld:'vTOTDEVCRUPZS',pic:'ZZZZZ9',hsh:true},{av:'AV63TotDevCruUnd',fld:'vTOTDEVCRUUND',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV59TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV60TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV57TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV58TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV55TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV56TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV53TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV65TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV66TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV51TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV52TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2116P2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e1616P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV51TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV52TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV65TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV66TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV53TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV55TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV56TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV58TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV59TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV60TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61TotDevCruPzs',fld:'vTOTDEVCRUPZS',pic:'ZZZZZ9',hsh:true},{av:'AV63TotDevCruUnd',fld:'vTOTDEVCRUUND',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A11684DevCruPzs',fld:'DEVCRUPZS',pic:'ZZZZZ9'},{av:'A11683DevCruUnd',fld:'DEVCRUUND',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbREnt_Visible',ctrl:'ALBRENT',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtDevCruPzs_Visible',ctrl:'DEVCRUPZS',prop:'Visible'},{av:'edtDevCruUnd_Visible',ctrl:'DEVCRUUND',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV61TotDevCruPzs',fld:'vTOTDEVCRUPZS',pic:'ZZZZZ9',hsh:true},{av:'AV63TotDevCruUnd',fld:'vTOTDEVCRUUND',pic:'ZZZZZ9.99',hsh:true},{av:'AV62TotValueDevCruPzs',fld:'vTOTVALUEDEVCRUPZS',pic:''},{av:'AV64TotValueDevCruUnd',fld:'vTOTVALUEDEVCRUUND',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e1216P2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV49Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV51TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV52TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV65TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV66TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV53TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV55TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV56TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV58TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV59TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV60TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV61TotDevCruPzs',fld:'vTOTDEVCRUPZS',pic:'ZZZZZ9',hsh:true},{av:'AV63TotDevCruUnd',fld:'vTOTDEVCRUUND',pic:'ZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9'},{av:'A11684DevCruPzs',fld:'DEVCRUPZS',pic:'ZZZZZ9'},{av:'A11683DevCruUnd',fld:'DEVCRUUND',pic:'ZZZZZ9.99'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV51TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV52TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV65TFAlbREnt',fld:'vTFALBRENT',pic:''},{av:'AV66TFAlbREnt_Sel',fld:'vTFALBRENT_SEL',pic:''},{av:'AV53TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV54TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV55TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV56TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV58TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV59TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV60TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbRecCod_Visible',ctrl:'ALBRECCOD',prop:'Visible'},{av:'edtAlbREnt_Visible',ctrl:'ALBRENT',prop:'Visible'},{av:'edtAlbRef_Visible',ctrl:'ALBREF',prop:'Visible'},{av:'edtAlbRefDsc_Visible',ctrl:'ALBREFDSC',prop:'Visible'},{av:'edtDevCruPzs_Visible',ctrl:'DEVCRUPZS',prop:'Visible'},{av:'edtDevCruUnd_Visible',ctrl:'DEVCRUUND',prop:'Visible'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV61TotDevCruPzs',fld:'vTOTDEVCRUPZS',pic:'ZZZZZ9',hsh:true},{av:'AV63TotDevCruUnd',fld:'vTOTDEVCRUUND',pic:'ZZZZZ9.99',hsh:true},{av:'AV62TotValueDevCruPzs',fld:'vTOTVALUEDEVCRUPZS',pic:''},{av:'AV64TotValueDevCruUnd',fld:'vTOTVALUEDEVCRUUND',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e1716P2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e1116P1',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e1816P2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Devcruund',iparms:[]");
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
      wcpOAV49Emprcod = "" ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV49Emprcod = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV65TFAlbREnt = "" ;
      AV66TFAlbREnt_Sel = "" ;
      AV53TFAlbRef = "" ;
      AV54TFAlbRef_Sel = "" ;
      AV55TFAlbRefDsc = "" ;
      AV56TFAlbRefDsc_Sel = "" ;
      AV59TFDevCruUnd = DecimalUtil.ZERO ;
      AV60TFDevCruUnd_To = DecimalUtil.ZERO ;
      AV72Pgmname = "" ;
      AV63TotDevCruUnd = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A46AlbREnt = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = "" ;
      lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = "" ;
      lV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = "" ;
      lV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = "" ;
      AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext = "" ;
      AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel = "" ;
      AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent = "" ;
      AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel = "" ;
      AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref = "" ;
      AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel = "" ;
      AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc = "" ;
      AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund = DecimalUtil.ZERO ;
      AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to = DecimalUtil.ZERO ;
      H016P2_A11669DevCruId = new int[1] ;
      H016P2_A11670DevCruFec = new java.util.Date[] {GXutil.nullDate()} ;
      H016P2_A396EmprCod = new String[] {""} ;
      H016P2_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H016P2_A11684DevCruPzs = new int[1] ;
      H016P2_A3613AlbRefDsc = new String[] {""} ;
      H016P2_A45AlbRef = new String[] {""} ;
      H016P2_A46AlbREnt = new String[] {""} ;
      H016P2_A44AlbRecCod = new int[1] ;
      A11670DevCruFec = GXutil.nullDate() ;
      H016P3_AGRID_nRecordCount = new long[1] ;
      AV62TotValueDevCruPzs = "" ;
      AV64TotValueDevCruUnd = "" ;
      hsh = "" ;
      AV67Station = "" ;
      AV69EmprNom = "" ;
      AV68UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV22Session = httpContext.getWebSession();
      AV18ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV24ManageFiltersXml = "" ;
      AV16ExcelFilename = "" ;
      AV17ErrorMessage = "" ;
      AV19UserCustomValue = "" ;
      AV21ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector8 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector9 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11 = new GXBaseCollection[1] ;
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState14 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H016P4_A11669DevCruId = new int[1] ;
      H016P4_A396EmprCod = new String[] {""} ;
      H016P4_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H016P4_A11684DevCruPzs = new int[1] ;
      H016P4_A3613AlbRefDsc = new String[] {""} ;
      H016P4_A45AlbRef = new String[] {""} ;
      H016P4_A46AlbREnt = new String[] {""} ;
      H016P4_A44AlbRecCod = new int[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV49Emprcod = "" ;
      sCtrlAV50DevCruId = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadevolucionesalmacentejidoencrudosindetallelineas__default(),
         new Object[] {
             new Object[] {
            H016P2_A11669DevCruId, H016P2_A11670DevCruFec, H016P2_A396EmprCod, H016P2_A11683DevCruUnd, H016P2_A11684DevCruPzs, H016P2_A3613AlbRefDsc, H016P2_A45AlbRef, H016P2_A46AlbREnt, H016P2_A44AlbRecCod
            }
            , new Object[] {
            H016P3_AGRID_nRecordCount
            }
            , new Object[] {
            H016P4_A11669DevCruId, H016P4_A396EmprCod, H016P4_A11683DevCruUnd, H016P4_A11684DevCruPzs, H016P4_A3613AlbRefDsc, H016P4_A45AlbRef, H016P4_A46AlbREnt, H016P4_A44AlbRecCod
            }
         }
      );
      AV72Pgmname = "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas" ;
      /* GeneXus formulas. */
      AV72Pgmname = "WCConsultaDevolucionesAlmacenTejidoencrudosindetalleLineas" ;
      Gx_err = (short)(0) ;
      edtavTotvaluedevcrupzs_Enabled = 0 ;
      edtavTotvaluedevcruund_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV25ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
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
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private int wcpOAV50DevCruId ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV50DevCruId ;
   private int nGXsfl_43_idx=1 ;
   private int AV51TFAlbRecCod ;
   private int AV52TFAlbRecCod_To ;
   private int AV57TFDevCruPzs ;
   private int AV58TFDevCruPzs_To ;
   private int A11669DevCruId ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A44AlbRecCod ;
   private int A11684DevCruPzs ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluedevcrupzs_Enabled ;
   private int edtavTotvaluedevcruund_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod ;
   private int AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to ;
   private int AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs ;
   private int AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to ;
   private int edtAlbRecCod_Visible ;
   private int edtAlbREnt_Visible ;
   private int edtAlbRef_Visible ;
   private int edtAlbRefDsc_Visible ;
   private int edtDevCruPzs_Visible ;
   private int edtDevCruUnd_Visible ;
   private int AV45PageToGo ;
   private int AV86GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV61TotDevCruPzs ;
   private long AV46GridCurrentPage ;
   private long AV47GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV59TFDevCruUnd ;
   private java.math.BigDecimal AV60TFDevCruUnd_To ;
   private java.math.BigDecimal AV63TotDevCruUnd ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ;
   private java.math.BigDecimal AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ;
   private String wcpOAV49Emprcod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Ddo_managefilters_Activeeventkey ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV49Emprcod ;
   private String sGXsfl_43_idx="0001" ;
   private String AV65TFAlbREnt ;
   private String AV66TFAlbREnt_Sel ;
   private String AV53TFAlbRef ;
   private String AV54TFAlbRef_Sel ;
   private String AV55TFAlbRefDsc ;
   private String AV56TFAlbRefDsc_Sel ;
   private String AV72Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
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
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Fixable ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Innewwindow1_Width ;
   private String Innewwindow1_Height ;
   private String Innewwindow1_Target ;
   private String Ddo_gridcolumnsselector_Caption ;
   private String Ddo_gridcolumnsselector_Tooltip ;
   private String Ddo_gridcolumnsselector_Cls ;
   private String Ddo_gridcolumnsselector_Dropdownoptionstype ;
   private String Ddo_gridcolumnsselector_Gridinternalname ;
   private String Ddo_gridcolumnsselector_Titlecontrolidtoreplace ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Innewwindow1_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String edtAlbRecCod_Internalname ;
   private String A46AlbREnt ;
   private String edtAlbREnt_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Internalname ;
   private String edtDevCruPzs_Internalname ;
   private String edtDevCruUnd_Internalname ;
   private String edtavTotvaluedevcrupzs_Internalname ;
   private String edtavTotvaluedevcruund_Internalname ;
   private String scmdbuf ;
   private String lV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ;
   private String lV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ;
   private String lV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ;
   private String AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ;
   private String AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ;
   private String AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ;
   private String AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ;
   private String AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ;
   private String AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ;
   private String hsh ;
   private String AV67Station ;
   private String AV69EmprNom ;
   private String AV68UsurCod ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluedevcrupzs_Jsonclick ;
   private String edtavTotvaluedevcruund_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV49Emprcod ;
   private String sCtrlAV50DevCruId ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbREnt_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtDevCruPzs_Jsonclick ;
   private String edtDevCruUnd_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date A11670DevCruFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV13OrderedDsc ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_43_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV18ColumnsSelectorXML ;
   private String AV24ManageFiltersXml ;
   private String AV19UserCustomValue ;
   private String AV15FilterFullText ;
   private String lV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ;
   private String AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ;
   private String AV62TotValueDevCruPzs ;
   private String AV64TotValueDevCruUnd ;
   private String AV16ExcelFilename ;
   private String AV17ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private int[] H016P2_A11669DevCruId ;
   private java.util.Date[] H016P2_A11670DevCruFec ;
   private String[] H016P2_A396EmprCod ;
   private java.math.BigDecimal[] H016P2_A11683DevCruUnd ;
   private int[] H016P2_A11684DevCruPzs ;
   private String[] H016P2_A3613AlbRefDsc ;
   private String[] H016P2_A45AlbRef ;
   private String[] H016P2_A46AlbREnt ;
   private int[] H016P2_A44AlbRecCod ;
   private long[] H016P3_AGRID_nRecordCount ;
   private int[] H016P4_A11669DevCruId ;
   private String[] H016P4_A396EmprCod ;
   private java.math.BigDecimal[] H016P4_A11683DevCruUnd ;
   private int[] H016P4_A11684DevCruPzs ;
   private String[] H016P4_A3613AlbRefDsc ;
   private String[] H016P4_A45AlbRef ;
   private String[] H016P4_A46AlbREnt ;
   private int[] H016P4_A44AlbRecCod ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState14[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wcconsultadevolucionesalmacentejidoencrudosindetallelineas__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H016P2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                          int AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod ,
                                          int AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to ,
                                          String AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                          String AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                          String AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                          String AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                          String AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                          String AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                          int AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs ,
                                          int AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to ,
                                          java.math.BigDecimal AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                          java.math.BigDecimal AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A11684DevCruPzs ,
                                          java.math.BigDecimal A11683DevCruUnd ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV49Emprcod ,
                                          int AV50DevCruId ,
                                          String A396EmprCod ,
                                          int A11669DevCruId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int15 = new byte[25];
      Object[] GXv_Object16 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.DevCruId, T2.DevCruFec, T1.EmprCod, T1.DevCruUnd, T1.DevCruPzs, T3.AlbRefDsc, T3.AlbRef, T3.AlbREnt, T1.AlbRecCod" ;
      sFromString = " FROM ((TXPDEVCR1 T1 INNER JOIN TXPDEVCRU T2 ON T2.EmprCod = T1.EmprCod AND T2.DevCruId = T1.DevCruId) INNER JOIN TXPALBREC T3 ON T3.EmprCod = T1.EmprCod AND T3.AlbRecCod" ;
      sFromString += " = T1.AlbRecCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DevCruId = ?)");
      if ( ! (GXutil.strcmp("", AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbRecCod,'99999990'), 2) like '%' || ?) or ( UPPER(T3.AlbREnt) like '%' || UPPER(?)) or ( UPPER(T3.AlbRef) like '%' || UPPER(?)) or ( UPPER(T3.AlbRefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DevCruPzs,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.DevCruUnd,'999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int15[2] = (byte)(1) ;
         GXv_int15[3] = (byte)(1) ;
         GXv_int15[4] = (byte)(1) ;
         GXv_int15[5] = (byte)(1) ;
         GXv_int15[6] = (byte)(1) ;
         GXv_int15[7] = (byte)(1) ;
      }
      if ( ! (0==AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int15[8] = (byte)(1) ;
      }
      if ( ! (0==AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int15[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T3.AlbREnt = ?)");
      }
      else
      {
         GXv_int15[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T3.AlbRef = ?)");
      }
      else
      {
         GXv_int15[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int15[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int15[15] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs >= ?)");
      }
      else
      {
         GXv_int15[16] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs <= ?)");
      }
      else
      {
         GXv_int15[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd >= ?)");
      }
      else
      {
         GXv_int15[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd <= ?)");
      }
      else
      {
         GXv_int15[19] = (byte)(1) ;
      }
      if ( AV12OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T2.DevCruFec" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.AlbREnt" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.AlbREnt DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.AlbRef" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.AlbRef DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T3.AlbRefDsc" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.AlbRefDsc DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruPzs" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruPzs DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruUnd" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruUnd DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object16[0] = scmdbuf ;
      GXv_Object16[1] = GXv_int15 ;
      return GXv_Object16 ;
   }

   protected Object[] conditional_H016P3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                          int AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod ,
                                          int AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to ,
                                          String AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                          String AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                          String AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                          String AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                          String AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                          String AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                          int AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs ,
                                          int AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to ,
                                          java.math.BigDecimal AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                          java.math.BigDecimal AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A11684DevCruPzs ,
                                          java.math.BigDecimal A11683DevCruUnd ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV49Emprcod ,
                                          int AV50DevCruId ,
                                          String A396EmprCod ,
                                          int A11669DevCruId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int17 = new byte[20];
      Object[] GXv_Object18 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPDEVCR1 T1 INNER JOIN TXPDEVCRU T3 ON T3.EmprCod = T1.EmprCod AND T3.DevCruId = T1.DevCruId) INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DevCruId = ?)");
      if ( ! (GXutil.strcmp("", AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbRecCod,'99999990'), 2) like '%' || ?) or ( UPPER(T2.AlbREnt) like '%' || UPPER(?)) or ( UPPER(T2.AlbRef) like '%' || UPPER(?)) or ( UPPER(T2.AlbRefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DevCruPzs,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.DevCruUnd,'999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int17[2] = (byte)(1) ;
         GXv_int17[3] = (byte)(1) ;
         GXv_int17[4] = (byte)(1) ;
         GXv_int17[5] = (byte)(1) ;
         GXv_int17[6] = (byte)(1) ;
         GXv_int17[7] = (byte)(1) ;
      }
      if ( ! (0==AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int17[8] = (byte)(1) ;
      }
      if ( ! (0==AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int17[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int17[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int17[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int17[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int17[15] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs >= ?)");
      }
      else
      {
         GXv_int17[16] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs <= ?)");
      }
      else
      {
         GXv_int17[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd >= ?)");
      }
      else
      {
         GXv_int17[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd <= ?)");
      }
      else
      {
         GXv_int17[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV12OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object18[0] = scmdbuf ;
      GXv_Object18[1] = GXv_int17 ;
      return GXv_Object18 ;
   }

   protected Object[] conditional_H016P4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext ,
                                          int AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod ,
                                          int AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to ,
                                          String AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel ,
                                          String AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent ,
                                          String AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel ,
                                          String AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref ,
                                          String AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel ,
                                          String AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc ,
                                          int AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs ,
                                          int AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to ,
                                          java.math.BigDecimal AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund ,
                                          java.math.BigDecimal AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to ,
                                          int A44AlbRecCod ,
                                          String A46AlbREnt ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          int A11684DevCruPzs ,
                                          java.math.BigDecimal A11683DevCruUnd ,
                                          String AV49Emprcod ,
                                          int AV50DevCruId ,
                                          String A396EmprCod ,
                                          int A11669DevCruId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int19 = new byte[20];
      Object[] GXv_Object20 = new Object[2];
      scmdbuf = "SELECT T1.DevCruId, T1.EmprCod, T1.DevCruUnd, T1.DevCruPzs, T2.AlbRefDsc, T2.AlbRef, T2.AlbREnt, T1.AlbRecCod FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DevCruId = ?)");
      if ( ! (GXutil.strcmp("", AV73Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(T1.AlbRecCod,'99999990'), 2) like '%' || ?) or ( UPPER(T2.AlbREnt) like '%' || UPPER(?)) or ( UPPER(T2.AlbRef) like '%' || UPPER(?)) or ( UPPER(T2.AlbRefDsc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.DevCruPzs,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(T1.DevCruUnd,'999990.99'), 2) like '%' || ?))");
      }
      else
      {
         GXv_int19[2] = (byte)(1) ;
         GXv_int19[3] = (byte)(1) ;
         GXv_int19[4] = (byte)(1) ;
         GXv_int19[5] = (byte)(1) ;
         GXv_int19[6] = (byte)(1) ;
         GXv_int19[7] = (byte)(1) ;
      }
      if ( ! (0==AV74Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_2_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int19[8] = (byte)(1) ;
      }
      if ( ! (0==AV75Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_3_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int19[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) && ( ! (GXutil.strcmp("", AV76Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_4_tfalbrent)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbREnt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_5_tfalbrent_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbREnt = ?)");
      }
      else
      {
         GXv_int19[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV78Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_6_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_7_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int19[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV80Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_8_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int19[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV81Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_9_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int19[15] = (byte)(1) ;
      }
      if ( ! (0==AV82Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_10_tfdevcrupzs) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs >= ?)");
      }
      else
      {
         GXv_int19[16] = (byte)(1) ;
      }
      if ( ! (0==AV83Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_11_tfdevcrupzs_to) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs <= ?)");
      }
      else
      {
         GXv_int19[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV84Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_12_tfdevcruund)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd >= ?)");
      }
      else
      {
         GXv_int19[18] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV85Wcconsultadevolucionesalmacentejidoencrudosindetallelineasds_13_tfdevcruund_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd <= ?)");
      }
      else
      {
         GXv_int19[19] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.DevCruId" ;
      GXv_Object20[0] = scmdbuf ;
      GXv_Object20[1] = GXv_int19 ;
      return GXv_Object20 ;
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
                  return conditional_H016P2(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() );
            case 1 :
                  return conditional_H016P3(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (java.math.BigDecimal)dynConstraints[18] , ((Number) dynConstraints[19]).shortValue() , ((Boolean) dynConstraints[20]).booleanValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() );
            case 2 :
                  return conditional_H016P4(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).intValue() , ((Number) dynConstraints[2]).intValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (java.math.BigDecimal)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , ((Number) dynConstraints[13]).intValue() , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , ((Number) dynConstraints[17]).intValue() , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H016P2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H016P3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H016P4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((java.util.Date[]) buf[1])[0] = rslt.getGXDate(2);
               ((String[]) buf[2])[0] = rslt.getString(3, 3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((int[]) buf[4])[0] = rslt.getInt(5);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((String[]) buf[7])[0] = rslt.getString(8, 8);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,2);
               ((int[]) buf[3])[0] = rslt.getInt(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((String[]) buf[6])[0] = rslt.getString(7, 8);
               ((int[]) buf[7])[0] = rslt.getInt(8);
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
                  stmt.setString(sIdx, (String)parms[25], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[26]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[28], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[29], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[30], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[31], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[32], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[36], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[37], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[38], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[39], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[40], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[42]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[43], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[44], 2);
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[45]).intValue());
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[46]).intValue());
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[47]).intValue());
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[48]).intValue());
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[49]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[23], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[24], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[25], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[26], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[27], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 8);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 8);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 26);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 26);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[38], 2);
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[39], 2);
               }
               return;
      }
   }

}

