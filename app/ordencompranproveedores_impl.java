package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class ordencompranproveedores_impl extends GXWebComponent
{
   public ordencompranproveedores_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public ordencompranproveedores_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( ordencompranproveedores_impl.class ));
   }

   public ordencompranproveedores_impl( int remoteHandle ,
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
               AV5Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
               AV8PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PrvNum), 6, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,Integer.valueOf(AV8PrvNum)});
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
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV8PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
      AV54TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV55TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV52TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV53TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV50TFPrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm"), ".") ;
      AV51TFPrdExiAlm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm_To"), ".") ;
      AV48TFPrdCanRes = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes"), ".") ;
      AV49TFPrdCanRes_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanRes_To"), ".") ;
      AV46TFPrdCanPen = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanPen"), ".") ;
      AV47TFPrdCanPen_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdCanPen_To"), ".") ;
      AV58TFValDsc = httpContext.GetPar( "TFValDsc") ;
      AV59TFValDsc_Sel = httpContext.GetPar( "TFValDsc_Sel") ;
      AV83Pgmname = httpContext.GetPar( "Pgmname") ;
      AV31OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV33OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV66Valor = CommonUtil.decimalVal( httpContext.GetPar( "Valor"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV8PrvNum, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV50TFPrdExiAlm, AV51TFPrdExiAlm_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV46TFPrdCanPen, AV47TFPrdCanPen_To, AV58TFValDsc, AV59TFValDsc_Sel, AV83Pgmname, AV31OrderedBy, AV33OrderedDsc, AV66Valor, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1X32( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Tabla PROPRV", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.ordencompranproveedores", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV8PrvNum,6,0))}, new String[] {"Emprcod","PrvNum"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"OrdenCompranProveedores");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV83Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ordencompranproveedores:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_35", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_35, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV15DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8PrvNum", GXutil.ltrim( localUtil.ntoc( wcpOAV8PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV54TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV55TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV52TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV53TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEXIALM", GXutil.ltrim( localUtil.ntoc( AV50TFPrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEXIALM_TO", GXutil.ltrim( localUtil.ntoc( AV51TFPrdExiAlm_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANRES", GXutil.ltrim( localUtil.ntoc( AV48TFPrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANRES_TO", GXutil.ltrim( localUtil.ntoc( AV49TFPrdCanRes_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANPEN", GXutil.ltrim( localUtil.ntoc( AV46TFPrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDCANPEN_TO", GXutil.ltrim( localUtil.ntoc( AV47TFPrdCanPen_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFVALDSC", GXutil.rtrim( AV58TFValDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFVALDSC_SEL", GXutil.rtrim( AV59TFValDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV31OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV33OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUM", GXutil.ltrim( localUtil.ntoc( AV8PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDPREA", GXutil.ltrim( localUtil.ntoc( A7240PrdPrea, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPEDCOD", GXutil.ltrim( localUtil.ntoc( AV6PedCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPEDTOT", GXutil.ltrim( localUtil.ntoc( AV7PedTot, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVALORTOTAL", GXutil.ltrim( localUtil.ntoc( AV67ValorTotal, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHAYDATOS", GXutil.ltrim( localUtil.ntoc( AV23Haydatos, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_confirmar_Result));
   }

   public void renderHtmlCloseForm1X32( )
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
      return "OrdenCompranProveedores" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Tabla PROPRV", "") ;
   }

   public void wb1X30( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.ordencompranproveedores");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTexto1_Internalname, httpContext.getMessage( "Opcion n Proveedores", ""), "", "", lblTexto1_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_OrdenCompranProveedores.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 20,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111x31_client"+"'", TempTags, "", 2, "HLP_OrdenCompranProveedores.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_OrdenCompranProveedores.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "Flex", "left", "top", " "+"data-gx-flex"+" ", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_27_1X32( true) ;
      }
      else
      {
         wb_table1_27_1X32( false) ;
      }
      return  ;
   }

   public void wb_table1_27_1X32e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-10 CellMarginTop15", "Right", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblocktotal_Internalname, httpContext.getMessage( "Total", ""), "", "", lblTextblocktotal_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_OrdenCompranProveedores.htm");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 CellMarginTop15", "Right", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblValorstring_Internalname, lblValorstring_Caption, "", "", lblValorstring_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(1), "HLP_OrdenCompranProveedores.htm");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableinvisible_Internalname, divTableinvisible_Visible, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbexplicar_Internalname, httpContext.getMessage( "Estas acciones no están visibles en ejecución, solo utilizamos para poder llamar al emergente de ww+", ""), "", "", lblTbexplicar_Jsonclick, "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "TextBlock", 0, "", 1, 1, 0, (short)(0), "HLP_OrdenCompranProveedores.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 62,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnimprimir_Internalname, "gx.evt.setGridEvt("+GXutil.str( 35, 2, 0)+","+"null"+");", httpContext.getMessage( "Imprimir", ""), bttBtnimprimir_Jsonclick, 5, httpContext.getMessage( "Imprimir", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOIMPRIMIR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_OrdenCompranProveedores.htm");
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV83Pgmname), GXutil.rtrim( localUtil.format( AV83Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_OrdenCompranProveedores.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Right", "top", "div");
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
         ucDdo_grid.setProperty("IncludeFilter", Ddo_grid_Includefilter);
         ucDdo_grid.setProperty("FilterType", Ddo_grid_Filtertype);
         ucDdo_grid.setProperty("FilterIsRange", Ddo_grid_Filterisrange);
         ucDdo_grid.setProperty("IncludeDataList", Ddo_grid_Includedatalist);
         ucDdo_grid.setProperty("DataListType", Ddo_grid_Datalisttype);
         ucDdo_grid.setProperty("DataListProc", Ddo_grid_Datalistproc);
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV15DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table2_71_1X32( true) ;
      }
      else
      {
         wb_table2_71_1X32( false) ;
      }
      return  ;
   }

   public void wb_table2_71_1X32e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
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

   public void start1X32( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Tabla PROPRV", ""), (short)(0)) ;
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
            strup1X30( ) ;
         }
      }
   }

   public void ws1X32( )
   {
      start1X32( ) ;
      evt1X32( ) ;
   }

   public void evt1X32( )
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
                              strup1X30( ) ;
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1X30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121X32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1X30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131X32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOIMPRIMIR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1X30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoImprimir' */
                                 e141X32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1X30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e151X32 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1X30( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavDisponible_Internalname ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1X30( ) ;
                           }
                           AV87Ordencompranproveedoresds_1_tfprdnum = AV54TFPrdNum ;
                           AV88Ordencompranproveedoresds_2_tfprdnum_sel = AV55TFPrdNum_Sel ;
                           AV89Ordencompranproveedoresds_3_tfprdnom = AV52TFPrdNom ;
                           AV90Ordencompranproveedoresds_4_tfprdnom_sel = AV53TFPrdNom_Sel ;
                           AV91Ordencompranproveedoresds_5_tfprdexialm = AV50TFPrdExiAlm ;
                           AV92Ordencompranproveedoresds_6_tfprdexialm_to = AV51TFPrdExiAlm_To ;
                           AV93Ordencompranproveedoresds_7_tfprdcanres = AV48TFPrdCanRes ;
                           AV94Ordencompranproveedoresds_8_tfprdcanres_to = AV49TFPrdCanRes_To ;
                           AV95Ordencompranproveedoresds_9_tfprdcanpen = AV46TFPrdCanPen ;
                           AV96Ordencompranproveedoresds_10_tfprdcanpen_to = AV47TFPrdCanPen_To ;
                           AV97Ordencompranproveedoresds_11_tfvaldsc = AV58TFValDsc ;
                           AV98Ordencompranproveedoresds_12_tfvaldsc_sel = AV59TFValDsc_Sel ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 10), "'DOCERRAR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 30), "VPRDPREACT.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 29), "VCANTIDAD.CONTROLVALUECHANGED") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 17), "VCANTIDAD.ISVALID") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 18), "VPRDPREACT.ISVALID") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 19), "GRID.ONLINEACTIVATE") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1X30( ) ;
                           }
                           nGXsfl_35_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_352( ) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
                           A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
                           A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
                              GX_FocusControl = edtavDisponible_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV16Disponible = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDisponible_Internalname, GXutil.ltrimstr( AV16Disponible, 12, 4));
                           }
                           else
                           {
                              AV16Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDisponible_Internalname, GXutil.ltrimstr( AV16Disponible, 12, 4));
                           }
                           A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
                           n857ValDsc = false ;
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDAD");
                              GX_FocusControl = edtavCantidad_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV9Cantidad = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantidad_Internalname, GXutil.ltrimstr( AV9Cantidad, 12, 4));
                           }
                           else
                           {
                              AV9Cantidad = localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantidad_Internalname, GXutil.ltrimstr( AV9Cantidad, 12, 4));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDPREACT");
                              GX_FocusControl = edtavPrdpreact_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV40PrdPreAct = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdpreact_Internalname, GXutil.ltrimstr( AV40PrdPreAct, 14, 5));
                           }
                           else
                           {
                              AV40PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdpreact_Internalname, GXutil.ltrimstr( AV40PrdPreAct, 14, 5));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("-9999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
                              GX_FocusControl = edtavValor_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV66Valor = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV66Valor, 11, 2));
                           }
                           else
                           {
                              AV66Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV66Valor, 11, 2));
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
                                       GX_FocusControl = edtavDisponible_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e161X32 ();
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
                                       GX_FocusControl = edtavDisponible_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e171X32 ();
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
                                       GX_FocusControl = edtavDisponible_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e181X32 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDisponible_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: 'DoCerrar' */
                                       e191X32 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VPRDPREACT.CONTROLVALUECHANGED") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDisponible_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e201X32 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VCANTIDAD.CONTROLVALUECHANGED") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDisponible_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e211X32 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VCANTIDAD.ISVALID") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDisponible_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e221X32 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "VPRDPREACT.ISVALID") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDisponible_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e231X32 ();
                                    }
                                 }
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.ONLINEACTIVATE") == 0 )
                              {
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDisponible_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e241X32 ();
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
                                    strup1X30( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavDisponible_Internalname ;
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

   public void we1X32( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1X32( ) ;
         }
      }
   }

   public void pa1X32( )
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
                                 String AV5Emprcod ,
                                 int AV8PrvNum ,
                                 String AV54TFPrdNum ,
                                 String AV55TFPrdNum_Sel ,
                                 String AV52TFPrdNom ,
                                 String AV53TFPrdNom_Sel ,
                                 java.math.BigDecimal AV50TFPrdExiAlm ,
                                 java.math.BigDecimal AV51TFPrdExiAlm_To ,
                                 java.math.BigDecimal AV48TFPrdCanRes ,
                                 java.math.BigDecimal AV49TFPrdCanRes_To ,
                                 java.math.BigDecimal AV46TFPrdCanPen ,
                                 java.math.BigDecimal AV47TFPrdCanPen_To ,
                                 String AV58TFValDsc ,
                                 String AV59TFValDsc_Sel ,
                                 String AV83Pgmname ,
                                 short AV31OrderedBy ,
                                 boolean AV33OrderedDsc ,
                                 java.math.BigDecimal AV66Valor ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e171X32 ();
      GRID_nCurrentRecord = 0 ;
      rf1X32( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"OrdenCompranProveedores");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV83Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("ordencompranproveedores:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1X32( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV83Pgmname = "OrdenCompranProveedores" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83Pgmname", AV83Pgmname);
      Gx_err = (short)(0) ;
      edtavDisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisponible_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1X32( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(35) ;
      /* Execute user event: Refresh */
      e171X32 ();
      nGXsfl_35_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_352( ) ;
      bGXsfl_35_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
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
         subsflControlProps_352( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV88Ordencompranproveedoresds_2_tfprdnum_sel ,
                                              AV87Ordencompranproveedoresds_1_tfprdnum ,
                                              AV90Ordencompranproveedoresds_4_tfprdnom_sel ,
                                              AV89Ordencompranproveedoresds_3_tfprdnom ,
                                              AV91Ordencompranproveedoresds_5_tfprdexialm ,
                                              AV92Ordencompranproveedoresds_6_tfprdexialm_to ,
                                              AV93Ordencompranproveedoresds_7_tfprdcanres ,
                                              AV94Ordencompranproveedoresds_8_tfprdcanres_to ,
                                              AV95Ordencompranproveedoresds_9_tfprdcanpen ,
                                              AV96Ordencompranproveedoresds_10_tfprdcanpen_to ,
                                              AV98Ordencompranproveedoresds_12_tfvaldsc_sel ,
                                              AV97Ordencompranproveedoresds_11_tfvaldsc ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A704PrdExiAlm ,
                                              A685PrdCanRes ,
                                              A684PrdCanPen ,
                                              A857ValDsc ,
                                              Short.valueOf(AV31OrderedBy) ,
                                              Boolean.valueOf(AV33OrderedDsc) ,
                                              Integer.valueOf(A6158PrdPrv) ,
                                              Integer.valueOf(AV8PrvNum) ,
                                              Byte.valueOf(A856ValCod) ,
                                              AV5Emprcod ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                              }
         });
         lV87Ordencompranproveedoresds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV87Ordencompranproveedoresds_1_tfprdnum), 6, "%") ;
         lV89Ordencompranproveedoresds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV89Ordencompranproveedoresds_3_tfprdnom), 26, "%") ;
         lV97Ordencompranproveedoresds_11_tfvaldsc = GXutil.padr( GXutil.rtrim( AV97Ordencompranproveedoresds_11_tfvaldsc), 16, "%") ;
         /* Using cursor H01X32 */
         pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV8PrvNum), lV87Ordencompranproveedoresds_1_tfprdnum, AV88Ordencompranproveedoresds_2_tfprdnum_sel, lV89Ordencompranproveedoresds_3_tfprdnom, AV90Ordencompranproveedoresds_4_tfprdnom_sel, AV91Ordencompranproveedoresds_5_tfprdexialm, AV92Ordencompranproveedoresds_6_tfprdexialm_to, AV93Ordencompranproveedoresds_7_tfprdcanres, AV94Ordencompranproveedoresds_8_tfprdcanres_to, AV95Ordencompranproveedoresds_9_tfprdcanpen, AV96Ordencompranproveedoresds_10_tfprdcanpen_to, lV97Ordencompranproveedoresds_11_tfvaldsc, AV98Ordencompranproveedoresds_12_tfvaldsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_35_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01X32_A396EmprCod[0] ;
            A856ValCod = H01X32_A856ValCod[0] ;
            A6158PrdPrv = H01X32_A6158PrdPrv[0] ;
            A7240PrdPrea = H01X32_A7240PrdPrea[0] ;
            A857ValDsc = H01X32_A857ValDsc[0] ;
            n857ValDsc = H01X32_n857ValDsc[0] ;
            A684PrdCanPen = H01X32_A684PrdCanPen[0] ;
            A685PrdCanRes = H01X32_A685PrdCanRes[0] ;
            A704PrdExiAlm = H01X32_A704PrdExiAlm[0] ;
            A718PrdNom = H01X32_A718PrdNom[0] ;
            A719PrdNum = H01X32_A719PrdNum[0] ;
            A856ValCod = H01X32_A856ValCod[0] ;
            A684PrdCanPen = H01X32_A684PrdCanPen[0] ;
            A685PrdCanRes = H01X32_A685PrdCanRes[0] ;
            A704PrdExiAlm = H01X32_A704PrdExiAlm[0] ;
            A718PrdNom = H01X32_A718PrdNom[0] ;
            A857ValDsc = H01X32_A857ValDsc[0] ;
            n857ValDsc = H01X32_n857ValDsc[0] ;
            e181X32 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(35) ;
         wb1X30( ) ;
      }
      bGXsfl_35_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1X32( )
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
      AV87Ordencompranproveedoresds_1_tfprdnum = AV54TFPrdNum ;
      AV88Ordencompranproveedoresds_2_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV89Ordencompranproveedoresds_3_tfprdnom = AV52TFPrdNom ;
      AV90Ordencompranproveedoresds_4_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV91Ordencompranproveedoresds_5_tfprdexialm = AV50TFPrdExiAlm ;
      AV92Ordencompranproveedoresds_6_tfprdexialm_to = AV51TFPrdExiAlm_To ;
      AV93Ordencompranproveedoresds_7_tfprdcanres = AV48TFPrdCanRes ;
      AV94Ordencompranproveedoresds_8_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV95Ordencompranproveedoresds_9_tfprdcanpen = AV46TFPrdCanPen ;
      AV96Ordencompranproveedoresds_10_tfprdcanpen_to = AV47TFPrdCanPen_To ;
      AV97Ordencompranproveedoresds_11_tfvaldsc = AV58TFValDsc ;
      AV98Ordencompranproveedoresds_12_tfvaldsc_sel = AV59TFValDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV88Ordencompranproveedoresds_2_tfprdnum_sel ,
                                           AV87Ordencompranproveedoresds_1_tfprdnum ,
                                           AV90Ordencompranproveedoresds_4_tfprdnom_sel ,
                                           AV89Ordencompranproveedoresds_3_tfprdnom ,
                                           AV91Ordencompranproveedoresds_5_tfprdexialm ,
                                           AV92Ordencompranproveedoresds_6_tfprdexialm_to ,
                                           AV93Ordencompranproveedoresds_7_tfprdcanres ,
                                           AV94Ordencompranproveedoresds_8_tfprdcanres_to ,
                                           AV95Ordencompranproveedoresds_9_tfprdcanpen ,
                                           AV96Ordencompranproveedoresds_10_tfprdcanpen_to ,
                                           AV98Ordencompranproveedoresds_12_tfvaldsc_sel ,
                                           AV97Ordencompranproveedoresds_11_tfvaldsc ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A704PrdExiAlm ,
                                           A685PrdCanRes ,
                                           A684PrdCanPen ,
                                           A857ValDsc ,
                                           Short.valueOf(AV31OrderedBy) ,
                                           Boolean.valueOf(AV33OrderedDsc) ,
                                           Integer.valueOf(A6158PrdPrv) ,
                                           Integer.valueOf(AV8PrvNum) ,
                                           Byte.valueOf(A856ValCod) ,
                                           AV5Emprcod ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.INT, TypeConstants.INT, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.STRING
                                           }
      });
      lV87Ordencompranproveedoresds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV87Ordencompranproveedoresds_1_tfprdnum), 6, "%") ;
      lV89Ordencompranproveedoresds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV89Ordencompranproveedoresds_3_tfprdnom), 26, "%") ;
      lV97Ordencompranproveedoresds_11_tfvaldsc = GXutil.padr( GXutil.rtrim( AV97Ordencompranproveedoresds_11_tfvaldsc), 16, "%") ;
      /* Using cursor H01X33 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Integer.valueOf(AV8PrvNum), lV87Ordencompranproveedoresds_1_tfprdnum, AV88Ordencompranproveedoresds_2_tfprdnum_sel, lV89Ordencompranproveedoresds_3_tfprdnom, AV90Ordencompranproveedoresds_4_tfprdnom_sel, AV91Ordencompranproveedoresds_5_tfprdexialm, AV92Ordencompranproveedoresds_6_tfprdexialm_to, AV93Ordencompranproveedoresds_7_tfprdcanres, AV94Ordencompranproveedoresds_8_tfprdcanres_to, AV95Ordencompranproveedoresds_9_tfprdcanpen, AV96Ordencompranproveedoresds_10_tfprdcanpen_to, lV97Ordencompranproveedoresds_11_tfvaldsc, AV98Ordencompranproveedoresds_12_tfvaldsc_sel});
      GRID_nRecordCount = H01X33_AGRID_nRecordCount[0] ;
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
      AV87Ordencompranproveedoresds_1_tfprdnum = AV54TFPrdNum ;
      AV88Ordencompranproveedoresds_2_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV89Ordencompranproveedoresds_3_tfprdnom = AV52TFPrdNom ;
      AV90Ordencompranproveedoresds_4_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV91Ordencompranproveedoresds_5_tfprdexialm = AV50TFPrdExiAlm ;
      AV92Ordencompranproveedoresds_6_tfprdexialm_to = AV51TFPrdExiAlm_To ;
      AV93Ordencompranproveedoresds_7_tfprdcanres = AV48TFPrdCanRes ;
      AV94Ordencompranproveedoresds_8_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV95Ordencompranproveedoresds_9_tfprdcanpen = AV46TFPrdCanPen ;
      AV96Ordencompranproveedoresds_10_tfprdcanpen_to = AV47TFPrdCanPen_To ;
      AV97Ordencompranproveedoresds_11_tfvaldsc = AV58TFValDsc ;
      AV98Ordencompranproveedoresds_12_tfvaldsc_sel = AV59TFValDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV8PrvNum, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV50TFPrdExiAlm, AV51TFPrdExiAlm_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV46TFPrdCanPen, AV47TFPrdCanPen_To, AV58TFValDsc, AV59TFValDsc_Sel, AV83Pgmname, AV31OrderedBy, AV33OrderedDsc, AV66Valor, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV87Ordencompranproveedoresds_1_tfprdnum = AV54TFPrdNum ;
      AV88Ordencompranproveedoresds_2_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV89Ordencompranproveedoresds_3_tfprdnom = AV52TFPrdNom ;
      AV90Ordencompranproveedoresds_4_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV91Ordencompranproveedoresds_5_tfprdexialm = AV50TFPrdExiAlm ;
      AV92Ordencompranproveedoresds_6_tfprdexialm_to = AV51TFPrdExiAlm_To ;
      AV93Ordencompranproveedoresds_7_tfprdcanres = AV48TFPrdCanRes ;
      AV94Ordencompranproveedoresds_8_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV95Ordencompranproveedoresds_9_tfprdcanpen = AV46TFPrdCanPen ;
      AV96Ordencompranproveedoresds_10_tfprdcanpen_to = AV47TFPrdCanPen_To ;
      AV97Ordencompranproveedoresds_11_tfvaldsc = AV58TFValDsc ;
      AV98Ordencompranproveedoresds_12_tfvaldsc_sel = AV59TFValDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV8PrvNum, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV50TFPrdExiAlm, AV51TFPrdExiAlm_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV46TFPrdCanPen, AV47TFPrdCanPen_To, AV58TFValDsc, AV59TFValDsc_Sel, AV83Pgmname, AV31OrderedBy, AV33OrderedDsc, AV66Valor, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV87Ordencompranproveedoresds_1_tfprdnum = AV54TFPrdNum ;
      AV88Ordencompranproveedoresds_2_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV89Ordencompranproveedoresds_3_tfprdnom = AV52TFPrdNom ;
      AV90Ordencompranproveedoresds_4_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV91Ordencompranproveedoresds_5_tfprdexialm = AV50TFPrdExiAlm ;
      AV92Ordencompranproveedoresds_6_tfprdexialm_to = AV51TFPrdExiAlm_To ;
      AV93Ordencompranproveedoresds_7_tfprdcanres = AV48TFPrdCanRes ;
      AV94Ordencompranproveedoresds_8_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV95Ordencompranproveedoresds_9_tfprdcanpen = AV46TFPrdCanPen ;
      AV96Ordencompranproveedoresds_10_tfprdcanpen_to = AV47TFPrdCanPen_To ;
      AV97Ordencompranproveedoresds_11_tfvaldsc = AV58TFValDsc ;
      AV98Ordencompranproveedoresds_12_tfvaldsc_sel = AV59TFValDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV8PrvNum, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV50TFPrdExiAlm, AV51TFPrdExiAlm_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV46TFPrdCanPen, AV47TFPrdCanPen_To, AV58TFValDsc, AV59TFValDsc_Sel, AV83Pgmname, AV31OrderedBy, AV33OrderedDsc, AV66Valor, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV87Ordencompranproveedoresds_1_tfprdnum = AV54TFPrdNum ;
      AV88Ordencompranproveedoresds_2_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV89Ordencompranproveedoresds_3_tfprdnom = AV52TFPrdNom ;
      AV90Ordencompranproveedoresds_4_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV91Ordencompranproveedoresds_5_tfprdexialm = AV50TFPrdExiAlm ;
      AV92Ordencompranproveedoresds_6_tfprdexialm_to = AV51TFPrdExiAlm_To ;
      AV93Ordencompranproveedoresds_7_tfprdcanres = AV48TFPrdCanRes ;
      AV94Ordencompranproveedoresds_8_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV95Ordencompranproveedoresds_9_tfprdcanpen = AV46TFPrdCanPen ;
      AV96Ordencompranproveedoresds_10_tfprdcanpen_to = AV47TFPrdCanPen_To ;
      AV97Ordencompranproveedoresds_11_tfvaldsc = AV58TFValDsc ;
      AV98Ordencompranproveedoresds_12_tfvaldsc_sel = AV59TFValDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV8PrvNum, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV50TFPrdExiAlm, AV51TFPrdExiAlm_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV46TFPrdCanPen, AV47TFPrdCanPen_To, AV58TFValDsc, AV59TFValDsc_Sel, AV83Pgmname, AV31OrderedBy, AV33OrderedDsc, AV66Valor, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV87Ordencompranproveedoresds_1_tfprdnum = AV54TFPrdNum ;
      AV88Ordencompranproveedoresds_2_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV89Ordencompranproveedoresds_3_tfprdnom = AV52TFPrdNom ;
      AV90Ordencompranproveedoresds_4_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV91Ordencompranproveedoresds_5_tfprdexialm = AV50TFPrdExiAlm ;
      AV92Ordencompranproveedoresds_6_tfprdexialm_to = AV51TFPrdExiAlm_To ;
      AV93Ordencompranproveedoresds_7_tfprdcanres = AV48TFPrdCanRes ;
      AV94Ordencompranproveedoresds_8_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV95Ordencompranproveedoresds_9_tfprdcanpen = AV46TFPrdCanPen ;
      AV96Ordencompranproveedoresds_10_tfprdcanpen_to = AV47TFPrdCanPen_To ;
      AV97Ordencompranproveedoresds_11_tfvaldsc = AV58TFValDsc ;
      AV98Ordencompranproveedoresds_12_tfvaldsc_sel = AV59TFValDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV8PrvNum, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV50TFPrdExiAlm, AV51TFPrdExiAlm_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV46TFPrdCanPen, AV47TFPrdCanPen_To, AV58TFValDsc, AV59TFValDsc_Sel, AV83Pgmname, AV31OrderedBy, AV33OrderedDsc, AV66Valor, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV83Pgmname = "OrdenCompranProveedores" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83Pgmname", AV83Pgmname);
      Gx_err = (short)(0) ;
      edtavDisponible_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDisponible_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDisponible_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_35_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1X30( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e161X32 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV15DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV8PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV23Haydatos = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vHAYDATOS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Ddo_grid_Caption = httpContext.cgiGet( sPrefix+"DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( sPrefix+"DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( sPrefix+"DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( sPrefix+"DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_confirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Title") ;
         Dvelop_confirmpanel_confirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_confirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_confirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_confirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_confirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_CONFIRMAR_Result") ;
         /* Read variables values. */
         AV83Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83Pgmname", AV83Pgmname);
         /* Read subfile selected row values. */
         nGXsfl_35_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
         if ( nGXsfl_35_idx > 0 )
         {
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
            A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
            A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
               GX_FocusControl = edtavDisponible_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV16Disponible = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDisponible_Internalname, GXutil.ltrimstr( AV16Disponible, 12, 4));
            }
            else
            {
               AV16Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDisponible_Internalname, GXutil.ltrimstr( AV16Disponible, 12, 4));
            }
            A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
            n857ValDsc = false ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDAD");
               GX_FocusControl = edtavCantidad_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV9Cantidad = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantidad_Internalname, GXutil.ltrimstr( AV9Cantidad, 12, 4));
            }
            else
            {
               AV9Cantidad = localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantidad_Internalname, GXutil.ltrimstr( AV9Cantidad, 12, 4));
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDPREACT");
               GX_FocusControl = edtavPrdpreact_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV40PrdPreAct = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdpreact_Internalname, GXutil.ltrimstr( AV40PrdPreAct, 14, 5));
            }
            else
            {
               AV40PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdpreact_Internalname, GXutil.ltrimstr( AV40PrdPreAct, 14, 5));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("-9999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
               GX_FocusControl = edtavValor_Internalname ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV66Valor = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV66Valor, 11, 2));
            }
            else
            {
               AV66Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV66Valor, 11, 2));
            }
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"OrdenCompranProveedores");
         AV83Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV83Pgmname", AV83Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV83Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("ordencompranproveedores:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e161X32 ();
      if (returnInSub) return;
   }

   public void e161X32( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXv_int1[0] = AV13Copias ;
      new app.pbuscon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "COPCAR", ""), GXv_int1) ;
      ordencompranproveedores_impl.this.AV13Copias = (short)((short)(GXv_int1[0])) ;
      AV13Copias = (short)(((AV13Copias==0) ? 1 : AV13Copias)) ;
      AV14Copias2 = AV13Copias ;
      GXt_char2 = AV84Station ;
      GXv_char3[0] = GXt_char2 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      ordencompranproveedores_impl.this.GXt_char2 = GXv_char3[0] ;
      AV84Station = GXt_char2 ;
      GXv_char3[0] = AV5Emprcod ;
      GXv_char4[0] = AV85Emprnom ;
      GXv_char5[0] = AV86Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV84Station, GXv_char3, GXv_char4, GXv_char5) ;
      ordencompranproveedores_impl.this.AV5Emprcod = GXv_char3[0] ;
      ordencompranproveedores_impl.this.AV85Emprnom = GXv_char4[0] ;
      ordencompranproveedores_impl.this.AV86Usurcod = GXv_char5[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV31OrderedBy < 1 )
      {
         AV31OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = AV15DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[0] ;
      AV15DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6;
   }

   public void e171X32( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext8[0] = AV68WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext8) ;
      AV68WWPContext = GXv_SdtWWPContext8[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'TOTAL' */
      S162 ();
      if (returnInSub) return;
      AV87Ordencompranproveedoresds_1_tfprdnum = AV54TFPrdNum ;
      AV88Ordencompranproveedoresds_2_tfprdnum_sel = AV55TFPrdNum_Sel ;
      AV89Ordencompranproveedoresds_3_tfprdnom = AV52TFPrdNom ;
      AV90Ordencompranproveedoresds_4_tfprdnom_sel = AV53TFPrdNom_Sel ;
      AV91Ordencompranproveedoresds_5_tfprdexialm = AV50TFPrdExiAlm ;
      AV92Ordencompranproveedoresds_6_tfprdexialm_to = AV51TFPrdExiAlm_To ;
      AV93Ordencompranproveedoresds_7_tfprdcanres = AV48TFPrdCanRes ;
      AV94Ordencompranproveedoresds_8_tfprdcanres_to = AV49TFPrdCanRes_To ;
      AV95Ordencompranproveedoresds_9_tfprdcanpen = AV46TFPrdCanPen ;
      AV96Ordencompranproveedoresds_10_tfprdcanpen_to = AV47TFPrdCanPen_To ;
      AV97Ordencompranproveedoresds_11_tfvaldsc = AV58TFValDsc ;
      AV98Ordencompranproveedoresds_12_tfvaldsc_sel = AV59TFValDsc_Sel ;
      /*  Sending Event outputs  */
   }

   public void e121X32( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV31OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
         AV33OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33OrderedDsc", AV33OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV54TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPrdNum", AV54TFPrdNum);
            AV55TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPrdNum_Sel", AV55TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV52TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFPrdNom", AV52TFPrdNom);
            AV53TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPrdNom_Sel", AV53TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiAlm") == 0 )
         {
            AV50TFPrdExiAlm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFPrdExiAlm", GXutil.ltrimstr( AV50TFPrdExiAlm, 12, 4));
            AV51TFPrdExiAlm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFPrdExiAlm_To", GXutil.ltrimstr( AV51TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanRes") == 0 )
         {
            AV48TFPrdCanRes = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdCanRes", GXutil.ltrimstr( AV48TFPrdCanRes, 12, 4));
            AV49TFPrdCanRes_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdCanRes_To", GXutil.ltrimstr( AV49TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdCanPen") == 0 )
         {
            AV46TFPrdCanPen = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdCanPen", GXutil.ltrimstr( AV46TFPrdCanPen, 12, 4));
            AV47TFPrdCanPen_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdCanPen_To", GXutil.ltrimstr( AV47TFPrdCanPen_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ValDsc") == 0 )
         {
            AV58TFValDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFValDsc", AV58TFValDsc);
            AV59TFValDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFValDsc_Sel", AV59TFValDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e181X32( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV79KeyCantidad = GXutil.trim( A719PrdNum) + httpContext.getMessage( "-Cantidad", "") ;
      AV77Properties.fromJSonString(AV45Session.getValue(AV79KeyCantidad), null);
      AV80KeyPreco = GXutil.trim( A719PrdNum) + httpContext.getMessage( "-preco", "") ;
      AV77Properties.fromJSonString(AV45Session.getValue(AV80KeyPreco), null);
      AV16Disponible = A704PrdExiAlm.subtract(A685PrdCanRes) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDisponible_Internalname, GXutil.ltrimstr( AV16Disponible, 12, 4));
      AV9Cantidad = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantidad_Internalname, GXutil.ltrimstr( AV9Cantidad, 12, 4));
      AV9Cantidad = CommonUtil.decimalVal( AV77Properties.get(AV79KeyCantidad), ".") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantidad_Internalname, GXutil.ltrimstr( AV9Cantidad, 12, 4));
      edtavCantidad_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavCantidad_Forecolor = GXutil.getColor( 0, 0, 0) ;
      AV40PrdPreAct = A7240PrdPrea ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdpreact_Internalname, GXutil.ltrimstr( AV40PrdPreAct, 14, 5));
      if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40PrdPreAct)==0) )
      {
         AV40PrdPreAct = CommonUtil.decimalVal( AV77Properties.get(AV80KeyPreco), ".") ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdpreact_Internalname, GXutil.ltrimstr( AV40PrdPreAct, 14, 5));
      }
      edtavPrdpreact_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavPrdpreact_Forecolor = GXutil.getColor( 0, 0, 0) ;
      AV66Valor = GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV66Valor, 11, 2));
      if ( ! ( GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2).doubleValue() > 0 ) )
      {
         edtavValor_Backcolor = GXutil.getColor( 255, 255, 0) ;
         edtavValor_Forecolor = GXutil.getColor( 0, 0, 0) ;
      }
      else
      {
         edtavValor_Backcolor = GXutil.getColor( 0, 255, 0) ;
         edtavValor_Forecolor = GXutil.getColor( 0, 0, 0) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(35) ;
      }
      sendrow_352( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_35_Refreshing )
      {
         httpContext.doAjaxLoad(35, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e141X32( )
   {
      /* 'DoImprimir' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.webseleccion", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6PedCod,8,0)),GXutil.URLEncode(DecimalUtil.decToString(AV7PedTot))}, new String[] {"EmprCod","PedCod","PedTot"}) , new Object[] {"AV6PedCod","AV7PedTot"});
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
   }

   public void e131X32( )
   {
      /* Dvelop_confirmpanel_confirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_confirmar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION CONFIRMAR' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e151X32( )
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

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV31OrderedBy, 4, 0))+":"+(AV33OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S172( )
   {
      /* 'DO ACTION CONFIRMAR' Routine */
      returnInSub = false ;
      AV42PriCod = "1" ;
      /* Start For Each Line */
      nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_35_fel_idx = 0 ;
      while ( nGXsfl_35_fel_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_35_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_35_fel_idx+1) ;
         sGXsfl_35_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_352( ) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
         A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
         A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
            GX_FocusControl = edtavDisponible_Internalname ;
            wbErr = true ;
            AV16Disponible = DecimalUtil.ZERO ;
         }
         else
         {
            AV16Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
         }
         A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
         n857ValDsc = false ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDAD");
            GX_FocusControl = edtavCantidad_Internalname ;
            wbErr = true ;
            AV9Cantidad = DecimalUtil.ZERO ;
         }
         else
         {
            AV9Cantidad = localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDPREACT");
            GX_FocusControl = edtavPrdpreact_Internalname ;
            wbErr = true ;
            AV40PrdPreAct = DecimalUtil.ZERO ;
         }
         else
         {
            AV40PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("-9999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
            GX_FocusControl = edtavValor_Internalname ;
            wbErr = true ;
            AV66Valor = DecimalUtil.ZERO ;
         }
         else
         {
            AV66Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
         }
         if ( GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2).doubleValue() > 0 )
         {
            GXv_decimal9[0] = AV9Cantidad ;
            GXv_decimal10[0] = AV40PrdPreAct ;
            GXv_decimal11[0] = DecimalUtil.doubleToDec(0) ;
            GXv_char5[0] = AV42PriCod ;
            new app.pcrepre(remoteHandle, context).execute( AV5Emprcod, AV8PrvNum, A719PrdNum, GXv_decimal9, GXv_decimal10, GXv_decimal11, GXv_char5) ;
            ordencompranproveedores_impl.this.AV9Cantidad = GXv_decimal9[0] ;
            ordencompranproveedores_impl.this.AV40PrdPreAct = GXv_decimal10[0] ;
            ordencompranproveedores_impl.this.AV42PriCod = GXv_char5[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantidad_Internalname, GXutil.ltrimstr( AV9Cantidad, 12, 4));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdpreact_Internalname, GXutil.ltrimstr( AV40PrdPreAct, 14, 5));
         }
         AV78KeyProps = GXutil.trim( A719PrdNum) + httpContext.getMessage( "-Cantidad", "") ;
         AV45Session.remove(AV78KeyProps);
         /* End For Each Line */
      }
      if ( nGXsfl_35_fel_idx == 0 )
      {
         nGXsfl_35_idx = 1 ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
      }
      nGXsfl_35_fel_idx = 1 ;
      AV19FecEnt = GXutil.today( ) ;
      GXv_int1[0] = AV6PedCod ;
      GXv_char5[0] = AV42PriCod ;
      GXv_date12[0] = AV19FecEnt ;
      new app.pcabped(remoteHandle, context).execute( AV5Emprcod, AV8PrvNum, GXv_int1, GXv_char5, GXv_date12) ;
      ordencompranproveedores_impl.this.AV6PedCod = GXv_int1[0] ;
      ordencompranproveedores_impl.this.AV42PriCod = GXv_char5[0] ;
      ordencompranproveedores_impl.this.AV19FecEnt = GXv_date12[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6PedCod), 8, 0));
      AV7PedTot = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PedTot", GXutil.ltrimstr( AV7PedTot, 12, 2));
      /* Start For Each Line */
      nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_35_fel_idx = 0 ;
      while ( nGXsfl_35_fel_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_35_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_35_fel_idx+1) ;
         sGXsfl_35_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_352( ) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
         A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
         A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
            GX_FocusControl = edtavDisponible_Internalname ;
            wbErr = true ;
            AV16Disponible = DecimalUtil.ZERO ;
         }
         else
         {
            AV16Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
         }
         A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
         n857ValDsc = false ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDAD");
            GX_FocusControl = edtavCantidad_Internalname ;
            wbErr = true ;
            AV9Cantidad = DecimalUtil.ZERO ;
         }
         else
         {
            AV9Cantidad = localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDPREACT");
            GX_FocusControl = edtavPrdpreact_Internalname ;
            wbErr = true ;
            AV40PrdPreAct = DecimalUtil.ZERO ;
         }
         else
         {
            AV40PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("-9999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
            GX_FocusControl = edtavValor_Internalname ;
            wbErr = true ;
            AV66Valor = DecimalUtil.ZERO ;
         }
         else
         {
            AV66Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
         }
         if ( GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2).doubleValue() > 0 )
         {
            GXv_decimal11[0] = AV9Cantidad ;
            GXv_int1[0] = AV6PedCod ;
            new app.pmodprp(remoteHandle, context).execute( AV5Emprcod, AV8PrvNum, A719PrdNum, GXv_decimal11, GXv_int1) ;
            ordencompranproveedores_impl.this.AV9Cantidad = GXv_decimal11[0] ;
            ordencompranproveedores_impl.this.AV6PedCod = GXv_int1[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantidad_Internalname, GXutil.ltrimstr( AV9Cantidad, 12, 4));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6PedCod), 8, 0));
            GXv_decimal11[0] = AV9Cantidad ;
            new app.pmodpen(remoteHandle, context).execute( AV5Emprcod, A719PrdNum, GXv_decimal11) ;
            ordencompranproveedores_impl.this.AV9Cantidad = GXv_decimal11[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantidad_Internalname, GXutil.ltrimstr( AV9Cantidad, 12, 4));
            GXv_int1[0] = AV6PedCod ;
            GXv_char5[0] = A719PrdNum ;
            GXv_decimal11[0] = AV9Cantidad ;
            GXv_decimal10[0] = AV40PrdPreAct ;
            GXv_decimal9[0] = DecimalUtil.doubleToDec(0) ;
            GXv_date12[0] = AV19FecEnt ;
            GXv_char4[0] = "" ;
            new app.plinped(remoteHandle, context).execute( AV5Emprcod, GXv_int1, GXv_char5, GXv_decimal11, GXv_decimal10, GXv_decimal9, GXv_date12, GXv_char4) ;
            ordencompranproveedores_impl.this.AV6PedCod = GXv_int1[0] ;
            ordencompranproveedores_impl.this.A719PrdNum = GXv_char5[0] ;
            ordencompranproveedores_impl.this.AV9Cantidad = GXv_decimal11[0] ;
            ordencompranproveedores_impl.this.AV40PrdPreAct = GXv_decimal10[0] ;
            ordencompranproveedores_impl.this.AV19FecEnt = GXv_date12[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6PedCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6PedCod), 8, 0));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavCantidad_Internalname, GXutil.ltrimstr( AV9Cantidad, 12, 4));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPrdpreact_Internalname, GXutil.ltrimstr( AV40PrdPreAct, 14, 5));
            AV7PedTot = AV7PedTot.add((GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7PedTot", GXutil.ltrimstr( AV7PedTot, 12, 2));
         }
         /* End For Each Line */
      }
      if ( nGXsfl_35_fel_idx == 0 )
      {
         nGXsfl_35_idx = 1 ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
      }
      nGXsfl_35_fel_idx = 1 ;
      httpContext.popup(formatLink("app.tpedobs", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6PedCod,8,0))}, new String[] {"Mode","EmprCod","PedCod"}) , new Object[] {});
      httpContext.popup(formatLink("app.tpedido_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("UPD")),GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6PedCod,8,0))}, new String[] {"Mode","EmprCod","PedCod"}) , new Object[] {});
      httpContext.popup(formatLink("app.rmod001", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6PedCod,8,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(DecimalUtil.decToString(AV67ValorTotal))}, new String[] {"EmprCod","PedCod","ImpCod","TotPed"}) , new Object[] {"","AV67ValorTotal"});
      Gx_msg = httpContext.getMessage( "Generado el pedido Nº ", "") + GXutil.str( AV6PedCod, 8, 0) ;
      httpContext.GX_msglist.addItem(Gx_msg);
      GRID_nFirstRecordOnPage = 0 ;
      GRID_nCurrentRecord = 0 ;
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_35_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV8PrvNum, AV54TFPrdNum, AV55TFPrdNum_Sel, AV52TFPrdNom, AV53TFPrdNom_Sel, AV50TFPrdExiAlm, AV51TFPrdExiAlm_To, AV48TFPrdCanRes, AV49TFPrdCanRes_To, AV46TFPrdCanPen, AV47TFPrdCanPen_To, AV58TFValDsc, AV59TFValDsc_Sel, AV83Pgmname, AV31OrderedBy, AV33OrderedDsc, AV66Valor, sPrefix) ;
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV45Session.getValue(AV83Pgmname+"GridState"), "") == 0 )
      {
         AV21GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV83Pgmname+"GridState"), null, null);
      }
      else
      {
         AV21GridState.fromxml(AV45Session.getValue(AV83Pgmname+"GridState"), null, null);
      }
      AV31OrderedBy = AV21GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31OrderedBy), 4, 0));
      AV33OrderedDsc = AV21GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33OrderedDsc", AV33OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV103GXV1 = 1 ;
      while ( AV103GXV1 <= AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV103GXV1));
         if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV54TFPrdNum = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV54TFPrdNum", AV54TFPrdNum);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV55TFPrdNum_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55TFPrdNum_Sel", AV55TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV52TFPrdNom = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52TFPrdNom", AV52TFPrdNom);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV53TFPrdNom_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53TFPrdNom_Sel", AV53TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV50TFPrdExiAlm = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50TFPrdExiAlm", GXutil.ltrimstr( AV50TFPrdExiAlm, 12, 4));
            AV51TFPrdExiAlm_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV51TFPrdExiAlm_To", GXutil.ltrimstr( AV51TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANRES") == 0 )
         {
            AV48TFPrdCanRes = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdCanRes", GXutil.ltrimstr( AV48TFPrdCanRes, 12, 4));
            AV49TFPrdCanRes_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdCanRes_To", GXutil.ltrimstr( AV49TFPrdCanRes_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDCANPEN") == 0 )
         {
            AV46TFPrdCanPen = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV46TFPrdCanPen", GXutil.ltrimstr( AV46TFPrdCanPen, 12, 4));
            AV47TFPrdCanPen_To = CommonUtil.decimalVal( AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV47TFPrdCanPen_To", GXutil.ltrimstr( AV47TFPrdCanPen_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC") == 0 )
         {
            AV58TFValDsc = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFValDsc", AV58TFValDsc);
         }
         else if ( GXutil.strcmp(AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFVALDSC_SEL") == 0 )
         {
            AV59TFValDsc_Sel = AV22GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFValDsc_Sel", AV59TFValDsc_Sel);
         }
         AV103GXV1 = (int)(AV103GXV1+1) ;
      }
      GXt_char2 = "" ;
      GXv_char5[0] = GXt_char2 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV55TFPrdNum_Sel)==0), AV55TFPrdNum_Sel, GXv_char5) ;
      ordencompranproveedores_impl.this.GXt_char2 = GXv_char5[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFPrdNom_Sel)==0), AV53TFPrdNom_Sel, GXv_char4) ;
      ordencompranproveedores_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char14 = "" ;
      GXv_char3[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFValDsc_Sel)==0), AV59TFValDsc_Sel, GXv_char3) ;
      ordencompranproveedores_impl.this.GXt_char14 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char2+"|"+GXt_char13+"||||"+GXt_char14 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char14 = "" ;
      GXv_char5[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFPrdNum)==0), AV54TFPrdNum, GXv_char5) ;
      ordencompranproveedores_impl.this.GXt_char14 = GXv_char5[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFPrdNom)==0), AV52TFPrdNom, GXv_char4) ;
      ordencompranproveedores_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char2 = "" ;
      GXv_char3[0] = GXt_char2 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFValDsc)==0), AV58TFValDsc, GXv_char3) ;
      ordencompranproveedores_impl.this.GXt_char2 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = GXt_char14+"|"+GXt_char13+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFPrdExiAlm)==0) ? "" : GXutil.str( AV50TFPrdExiAlm, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFPrdCanRes)==0) ? "" : GXutil.str( AV48TFPrdCanRes, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPrdCanPen)==0) ? "" : GXutil.str( AV46TFPrdCanPen, 12, 4))+"|"+GXt_char2 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFPrdExiAlm_To)==0) ? "" : GXutil.str( AV51TFPrdExiAlm_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdCanRes_To)==0) ? "" : GXutil.str( AV49TFPrdCanRes_To, 12, 4))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFPrdCanPen_To)==0) ? "" : GXutil.str( AV47TFPrdCanPen_To, 12, 4))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV21GridState.fromxml(AV45Session.getValue(AV83Pgmname+"GridState"), null, null);
      AV21GridState.setgxTv_SdtWWPGridState_Orderedby( AV31OrderedBy );
      AV21GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV33OrderedDsc );
      AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState15[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPRDNUM", "", !(GXutil.strcmp("", AV54TFPrdNum)==0), (short)(0), AV54TFPrdNum, "", !(GXutil.strcmp("", AV55TFPrdNum_Sel)==0), AV55TFPrdNum_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPRDNOM", "", !(GXutil.strcmp("", AV52TFPrdNom)==0), (short)(0), AV52TFPrdNom, "", !(GXutil.strcmp("", AV53TFPrdNom_Sel)==0), AV53TFPrdNom_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPRDEXIALM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV50TFPrdExiAlm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV51TFPrdExiAlm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV50TFPrdExiAlm, 12, 4)), GXutil.trim( GXutil.str( AV51TFPrdExiAlm_To, 12, 4))) ;
      AV21GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPRDCANRES", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV48TFPrdCanRes)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV49TFPrdCanRes_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV48TFPrdCanRes, 12, 4)), GXutil.trim( GXutil.str( AV49TFPrdCanRes_To, 12, 4))) ;
      AV21GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFPRDCANPEN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV46TFPrdCanPen)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV47TFPrdCanPen_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV46TFPrdCanPen, 12, 4)), GXutil.trim( GXutil.str( AV47TFPrdCanPen_To, 12, 4))) ;
      AV21GridState = GXv_SdtWWPGridState15[0] ;
      GXv_SdtWWPGridState15[0] = AV21GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState15, "TFVALDSC", "", !(GXutil.strcmp("", AV58TFValDsc)==0), (short)(0), AV58TFValDsc, "", !(GXutil.strcmp("", AV59TFValDsc_Sel)==0), AV59TFValDsc_Sel, "") ;
      AV21GridState = GXv_SdtWWPGridState15[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV22GridStateFilterValue, 0);
      }
      if ( ! (0==AV8PrvNum) )
      {
         AV22GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUM" );
         AV22GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8PrvNum, 6, 0) );
         AV21GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV22GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV83Pgmname+"GridState", AV21GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV62TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV62TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV83Pgmname );
      AV62TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV62TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV24HTTPRequest.getScriptName()+"?"+AV24HTTPRequest.getQuerystring() );
      AV62TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "PROPRV" );
      AV45Session.setValue("TrnContext", AV62TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      divTableinvisible_Visible = (((1==0)) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, divTableinvisible_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(divTableinvisible_Visible), 5, 0), true);
   }

   public void e191X32( )
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

   public void e201X32( )
   {
      /* Prdpreact_Controlvaluechanged Routine */
      returnInSub = false ;
      AV66Valor = GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV66Valor, 11, 2));
      /* Execute user subroutine: 'TOTAL' */
      S162 ();
      if (returnInSub) return;
      System.out.println( localUtil.format( AV40PrdPreAct, "ZZZZZZZ9.999") );
      if ( AV40PrdPreAct.doubleValue() > 0 )
      {
         AV78KeyProps = GXutil.trim( A719PrdNum) + httpContext.getMessage( "-preco", "") ;
         AV77Properties.remove(AV78KeyProps);
         AV77Properties.set(AV78KeyProps, localUtil.format( AV40PrdPreAct, "ZZZZZZZ9.999"));
         System.out.println( AV77Properties.toJSonString() );
         AV45Session.setValue(AV78KeyProps, AV77Properties.toJSonString());
      }
      /*  Sending Event outputs  */
   }

   public void e211X32( )
   {
      /* Cantidad_Controlvaluechanged Routine */
      returnInSub = false ;
      AV66Valor = GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV66Valor, 11, 2));
      /* Execute user subroutine: 'TOTAL' */
      S162 ();
      if (returnInSub) return;
      System.out.println( GXutil.str( AV9Cantidad, 12, 4) );
      if ( AV9Cantidad.doubleValue() > 0 )
      {
         AV78KeyProps = GXutil.trim( A719PrdNum) + httpContext.getMessage( "-Cantidad", "") ;
         AV77Properties.remove(AV78KeyProps);
         AV77Properties.set(AV78KeyProps, localUtil.format( AV9Cantidad, "ZZZZZZ9.9999"));
         System.out.println( AV77Properties.toJSonString() );
         AV45Session.setValue(AV78KeyProps, AV77Properties.toJSonString());
      }
      /*  Sending Event outputs  */
   }

   public void e221X32( )
   {
      /* Cantidad_Isvalid Routine */
      returnInSub = false ;
      if ( AV9Cantidad.doubleValue() < 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Digite valores positivos", ""));
         GX_FocusControl = edtavCantidad_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( ! ( DecimalUtil.compareTo(AV66Valor, GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2)) == 0 ) )
      {
         /* Execute user subroutine: 'ACTUALIZAR VALORES' */
         S182 ();
         if (returnInSub) return;
      }
      System.out.println( GXutil.str( AV9Cantidad, 12, 4) );
      if ( AV9Cantidad.doubleValue() > 0 )
      {
         AV78KeyProps = GXutil.trim( A719PrdNum) + httpContext.getMessage( "-Cantidad", "") ;
         AV77Properties.remove(AV78KeyProps);
         AV77Properties.set(AV78KeyProps, localUtil.format( AV9Cantidad, "ZZZZZZ9.9999"));
         System.out.println( AV77Properties.toJSonString() );
         AV45Session.setValue(AV78KeyProps, AV77Properties.toJSonString());
      }
      /*  Sending Event outputs  */
   }

   public void e231X32( )
   {
      /* Prdpreact_Isvalid Routine */
      returnInSub = false ;
      if ( AV40PrdPreAct.doubleValue() < 0 )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Digite valores positivos", ""));
         GX_FocusControl = edtavPrdpreact_Internalname ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else if ( ! ( DecimalUtil.compareTo(AV66Valor, GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2)) == 0 ) )
      {
         /* Execute user subroutine: 'ACTUALIZAR VALORES' */
         S182 ();
         if (returnInSub) return;
      }
      System.out.println( GXutil.str( AV40PrdPreAct, 14, 5) );
      if ( AV40PrdPreAct.doubleValue() > 0 )
      {
         AV78KeyProps = GXutil.trim( A719PrdNum) + httpContext.getMessage( "-preco", "") ;
         AV77Properties.remove(AV78KeyProps);
         AV77Properties.set(AV78KeyProps, localUtil.format( AV40PrdPreAct, "ZZZZZZZ9.999"));
         System.out.println( AV77Properties.toJSonString() );
         AV45Session.setValue(AV78KeyProps, AV77Properties.toJSonString());
      }
      /*  Sending Event outputs  */
   }

   public void e241X32( )
   {
      /* Grid_Onlineactivate Routine */
      returnInSub = false ;
      if ( ! ( DecimalUtil.compareTo(AV66Valor, GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2)) == 0 ) )
      {
         AV66Valor = GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV66Valor, 11, 2));
         /* Execute user subroutine: 'AJUSTAR BACKCOLOR &VALOR' */
         S192 ();
         if (returnInSub) return;
         /* Execute user subroutine: 'TOTAL' */
         S162 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void S162( )
   {
      /* 'TOTAL' Routine */
      returnInSub = false ;
      AV67ValorTotal = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ValorTotal", GXutil.ltrimstr( AV67ValorTotal, 12, 2));
      /* Start For Each Line */
      nRC_GXsfl_35 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_35"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_35_fel_idx = 0 ;
      while ( nGXsfl_35_fel_idx < nRC_GXsfl_35 )
      {
         nGXsfl_35_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_35_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_35_fel_idx+1) ;
         sGXsfl_35_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_352( ) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
         A685PrdCanRes = localUtil.ctond( httpContext.cgiGet( edtPrdCanRes_Internalname)) ;
         A684PrdCanPen = localUtil.ctond( httpContext.cgiGet( edtPrdCanPen_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDISPONIBLE");
            GX_FocusControl = edtavDisponible_Internalname ;
            wbErr = true ;
            AV16Disponible = DecimalUtil.ZERO ;
         }
         else
         {
            AV16Disponible = localUtil.ctond( httpContext.cgiGet( edtavDisponible_Internalname)) ;
         }
         A857ValDsc = httpContext.cgiGet( edtValDsc_Internalname) ;
         n857ValDsc = false ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCANTIDAD");
            GX_FocusControl = edtavCantidad_Internalname ;
            wbErr = true ;
            AV9Cantidad = DecimalUtil.ZERO ;
         }
         else
         {
            AV9Cantidad = localUtil.ctond( httpContext.cgiGet( edtavCantidad_Internalname)) ;
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDPREACT");
            GX_FocusControl = edtavPrdpreact_Internalname ;
            wbErr = true ;
            AV40PrdPreAct = DecimalUtil.ZERO ;
         }
         else
         {
            AV40PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtavPrdpreact_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("-9999999.99")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)), DecimalUtil.stringToDec("99999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALOR");
            GX_FocusControl = edtavValor_Internalname ;
            wbErr = true ;
            AV66Valor = DecimalUtil.ZERO ;
         }
         else
         {
            AV66Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
         }
         AV67ValorTotal = AV67ValorTotal.add(AV66Valor) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67ValorTotal", GXutil.ltrimstr( AV67ValorTotal, 12, 2));
         /* End For Each Line */
      }
      if ( nGXsfl_35_fel_idx == 0 )
      {
         nGXsfl_35_idx = 1 ;
         sGXsfl_35_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_35_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_352( ) ;
      }
      nGXsfl_35_fel_idx = 1 ;
      lblValorstring_Caption = httpContext.getMessage( "<b>", "")+localUtil.format( AV67ValorTotal, "ZZZZZZZZ9.99")+httpContext.getMessage( "</b>", "") ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, lblValorstring_Internalname, "Caption", lblValorstring_Caption, true);
   }

   public void S182( )
   {
      /* 'ACTUALIZAR VALORES' Routine */
      returnInSub = false ;
      AV66Valor = GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV66Valor, 11, 2));
      /* Execute user subroutine: 'AJUSTAR BACKCOLOR &VALOR' */
      S192 ();
      if (returnInSub) return;
   }

   public void S192( )
   {
      /* 'AJUSTAR BACKCOLOR &VALOR' Routine */
      returnInSub = false ;
      edtavValor_Backcolor = (!(GXutil.roundDecimal( AV9Cantidad.multiply(AV40PrdPreAct), 2).doubleValue()>0) ? GXutil.getColor( 255, 255, 0) : GXutil.getColor( 0, 255, 0)) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Backcolor", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Backcolor), 9, 0), !bGXsfl_35_Refreshing);
   }

   public void wb_table2_71_1X32( boolean wbgen )
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
         wb_table2_71_1X32e( true) ;
      }
      else
      {
         wb_table2_71_1X32e( false) ;
      }
   }

   public void wb_table1_27_1X32( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablerightheader_Internalname, tblTablerightheader_Internalname, "", "", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_27_1X32e( true) ;
      }
      else
      {
         wb_table1_27_1X32e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV8PrvNum = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PrvNum), 6, 0));
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
      pa1X32( ) ;
      ws1X32( ) ;
      we1X32( ) ;
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
      sCtrlAV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV8PrvNum = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1X32( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "ordencompranproveedores", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1X32( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV8PrvNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PrvNum), 6, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV8PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( AV8PrvNum != wcpOAV8PrvNum ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV8PrvNum = AV8PrvNum ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV5Emprcod) > 0 )
      {
         AV5Emprcod = httpContext.cgiGet( sCtrlAV5Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      }
      else
      {
         AV5Emprcod = httpContext.cgiGet( sPrefix+"AV5Emprcod_PARM") ;
      }
      sCtrlAV8PrvNum = httpContext.cgiGet( sPrefix+"AV8PrvNum_CTRL") ;
      if ( GXutil.len( sCtrlAV8PrvNum) > 0 )
      {
         AV8PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV8PrvNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PrvNum), 6, 0));
      }
      else
      {
         AV8PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV8PrvNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1X32( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1X32( ) ;
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
      ws1X32( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_PARM", GXutil.rtrim( AV5Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV5Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV5Emprcod_CTRL", GXutil.rtrim( sCtrlAV5Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrvNum_PARM", GXutil.ltrim( localUtil.ntoc( AV8PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8PrvNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrvNum_CTRL", GXutil.rtrim( sCtrlAV8PrvNum));
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
      we1X32( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116101220", true, true);
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
      httpContext.AddJavascriptSource("ordencompranproveedores.js", "?202682116101220", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_352( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_35_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_35_idx ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM_"+sGXsfl_35_idx ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES_"+sGXsfl_35_idx ;
      edtPrdCanPen_Internalname = sPrefix+"PRDCANPEN_"+sGXsfl_35_idx ;
      edtavDisponible_Internalname = sPrefix+"vDISPONIBLE_"+sGXsfl_35_idx ;
      edtValDsc_Internalname = sPrefix+"VALDSC_"+sGXsfl_35_idx ;
      edtavCantidad_Internalname = sPrefix+"vCANTIDAD_"+sGXsfl_35_idx ;
      edtavPrdpreact_Internalname = sPrefix+"vPRDPREACT_"+sGXsfl_35_idx ;
      edtavValor_Internalname = sPrefix+"vVALOR_"+sGXsfl_35_idx ;
   }

   public void subsflControlProps_fel_352( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_35_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_35_fel_idx ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM_"+sGXsfl_35_fel_idx ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES_"+sGXsfl_35_fel_idx ;
      edtPrdCanPen_Internalname = sPrefix+"PRDCANPEN_"+sGXsfl_35_fel_idx ;
      edtavDisponible_Internalname = sPrefix+"vDISPONIBLE_"+sGXsfl_35_fel_idx ;
      edtValDsc_Internalname = sPrefix+"VALDSC_"+sGXsfl_35_fel_idx ;
      edtavCantidad_Internalname = sPrefix+"vCANTIDAD_"+sGXsfl_35_fel_idx ;
      edtavPrdpreact_Internalname = sPrefix+"vPRDPREACT_"+sGXsfl_35_fel_idx ;
      edtavValor_Internalname = sPrefix+"vVALOR_"+sGXsfl_35_fel_idx ;
   }

   public void sendrow_352( )
   {
      subsflControlProps_352( ) ;
      wb1X30( ) ;
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
            httpContext.writeText( " class=\""+"GridNoBorder WorkWithSelection WorkWith"+"\" style=\""+""+"\"") ;
            httpContext.writeText( " gxrow=\""+sGXsfl_35_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanRes_Internalname,GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A685PrdCanRes, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanRes_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdCanPen_Internalname,GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A684PrdCanPen, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdCanPen_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDisponible_Enabled!=0)&&(edtavDisponible_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 41,'"+sPrefix+"',false,'"+sGXsfl_35_idx+"',35)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDisponible_Internalname,GXutil.ltrim( localUtil.ntoc( AV16Disponible, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDisponible_Enabled!=0) ? localUtil.format( AV16Disponible, "ZZZZZZ9.9999") : localUtil.format( AV16Disponible, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavDisponible_Enabled!=0)&&(edtavDisponible_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,41);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDisponible_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDisponible_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtValDsc_Internalname,GXutil.rtrim( A857ValDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtValDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavCantidad_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavCantidad_Enabled!=0)&&(edtavCantidad_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'"+sPrefix+"',false,'"+sGXsfl_35_idx+"',35)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavCantidad_Internalname,GXutil.ltrim( localUtil.ntoc( AV9Cantidad, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV9Cantidad, "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavCantidad_Enabled!=0)&&(edtavCantidad_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,43);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavCantidad_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavCantidad_Forecolor)+";"+((edtavCantidad_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavCantidad_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavPrdpreact_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdpreact_Enabled!=0)&&(edtavPrdpreact_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_35_idx+"',35)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdpreact_Internalname,GXutil.ltrim( localUtil.ntoc( AV40PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV40PrdPreAct, "ZZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavPrdpreact_Enabled!=0)&&(edtavPrdpreact_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,44);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPrdpreact_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavPrdpreact_Forecolor)+";"+((edtavPrdpreact_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavPrdpreact_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavValor_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavValor_Enabled!=0)&&(edtavValor_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 45,'"+sPrefix+"',false,'"+sGXsfl_35_idx+"',35)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValor_Internalname,GXutil.ltrim( localUtil.ntoc( AV66Valor, (byte)(11), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValor_Enabled!=0) ? localUtil.format( AV66Valor, "ZZZZZZZ9.99") : localUtil.format( AV66Valor, "ZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavValor_Enabled!=0)&&(edtavValor_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,45);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavValor_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavValor_Forecolor)+";"+((edtavValor_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavValor_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavValor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(35),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1X32( ) ;
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
         app.GxWebStd.gx_table_start( httpContext, subGrid_Internalname, subGrid_Internalname, "", "GridNoBorder WorkWithSelection WorkWith", 0, "", "", 1, 2, sStyleString, "", "", 0);
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
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Almacen", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Reserva", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pendiente", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Disponible", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Validez", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWithSelection WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A685PrdCanRes, (byte)(12), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A684PrdCanPen, (byte)(12), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV16Disponible, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDisponible_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A857ValDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV9Cantidad, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavCantidad_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavCantidad_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV40PrdPreAct, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavPrdpreact_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavPrdpreact_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV66Valor, (byte)(11), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavValor_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavValor_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValor_Enabled, (byte)(5), (byte)(0), ".", "")));
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
      lblTexto1_Internalname = sPrefix+"TEXTO1" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM" ;
      edtPrdCanRes_Internalname = sPrefix+"PRDCANRES" ;
      edtPrdCanPen_Internalname = sPrefix+"PRDCANPEN" ;
      edtavDisponible_Internalname = sPrefix+"vDISPONIBLE" ;
      edtValDsc_Internalname = sPrefix+"VALDSC" ;
      edtavCantidad_Internalname = sPrefix+"vCANTIDAD" ;
      edtavPrdpreact_Internalname = sPrefix+"vPRDPREACT" ;
      edtavValor_Internalname = sPrefix+"vVALOR" ;
      lblTextblocktotal_Internalname = sPrefix+"TEXTBLOCKTOTAL" ;
      lblValorstring_Internalname = sPrefix+"VALORSTRING" ;
      divUnnamedtable2_Internalname = sPrefix+"UNNAMEDTABLE2" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      lblTbexplicar_Internalname = sPrefix+"TBEXPLICAR" ;
      bttBtnimprimir_Internalname = sPrefix+"BTNIMPRIMIR" ;
      divTableinvisible_Internalname = sPrefix+"TABLEINVISIBLE" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavValor_Jsonclick = "" ;
      edtavValor_Forecolor = (int)(0x000000) ;
      edtavValor_Visible = -1 ;
      edtavValor_Enabled = 1 ;
      edtavPrdpreact_Jsonclick = "" ;
      edtavPrdpreact_Forecolor = (int)(0x000000) ;
      edtavPrdpreact_Visible = -1 ;
      edtavPrdpreact_Enabled = 1 ;
      edtavPrdpreact_Backcolor = -1 ;
      edtavCantidad_Jsonclick = "" ;
      edtavCantidad_Forecolor = (int)(0x000000) ;
      edtavCantidad_Visible = -1 ;
      edtavCantidad_Enabled = 1 ;
      edtavCantidad_Backcolor = -1 ;
      edtValDsc_Jsonclick = "" ;
      edtavDisponible_Jsonclick = "" ;
      edtavDisponible_Visible = -1 ;
      edtavDisponible_Enabled = 1 ;
      edtPrdCanPen_Jsonclick = "" ;
      edtPrdCanRes_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavValor_Backcolor = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      divTableinvisible_Visible = 1 ;
      lblValorstring_Caption = "0,00" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Grid" ;
      Dvelop_confirmpanel_confirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_confirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_confirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_confirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_confirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_confirmar_Confirmationtext = "¿Confirma la Orden de Compra?" ;
      Dvelop_confirmpanel_confirmar_Title = "" ;
      Ddo_grid_Datalistproc = "OrdenCompranProveedoresGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T||||T" ;
      Ddo_grid_Filterisrange = "||T|T|T|" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7" ;
      Ddo_grid_Columnids = "0:PrdNum|1:PrdNom|2:PrdExiAlm|3:PrdCanRes|4:PrdCanPen|6:ValDsc" ;
      Ddo_grid_Gridinternalname = "" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV50TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV59TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV66Valor',fld:'vVALOR',grid:35,pic:'ZZZZZZZ9.99'},{av:'nRC_GXsfl_35',ctrl:'GRID',grid:35,prop:'GridRC',grid:35},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV67ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e121X32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV50TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV59TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66Valor',fld:'vVALOR',pic:'ZZZZZZZ9.99'},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV59TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV46TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV50TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e181X32',iparms:[{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A685PrdCanRes',fld:'PRDCANRES',pic:'ZZZZZZ9.9999'},{av:'A7240PrdPrea',fld:'PRDPREA',pic:'ZZZZZZZ9.99999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV16Disponible',fld:'vDISPONIBLE',pic:'ZZZZZZ9.9999'},{av:'AV9Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZ9.9999'},{av:'edtavCantidad_Backcolor',ctrl:'vCANTIDAD',prop:'Backcolor'},{av:'edtavCantidad_Forecolor',ctrl:'vCANTIDAD',prop:'Forecolor'},{av:'AV40PrdPreAct',fld:'vPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'edtavPrdpreact_Backcolor',ctrl:'vPRDPREACT',prop:'Backcolor'},{av:'edtavPrdpreact_Forecolor',ctrl:'vPRDPREACT',prop:'Forecolor'},{av:'AV66Valor',fld:'vVALOR',pic:'ZZZZZZZ9.99'},{av:'edtavValor_Backcolor',ctrl:'vVALOR',prop:'Backcolor'},{av:'edtavValor_Forecolor',ctrl:'vVALOR',prop:'Forecolor'}]}");
      setEventMetadata("'DOIMPRIMIR'","{handler:'e141X32',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV50TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV59TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66Valor',fld:'vVALOR',grid:35,pic:'ZZZZZZZ9.99'},{av:'nRC_GXsfl_35',ctrl:'GRID',grid:35,prop:'GridRC',grid:35},{av:'sPrefix'},{av:'AV6PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV7PedTot',fld:'vPEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'}]");
      setEventMetadata("'DOIMPRIMIR'",",oparms:[{av:'AV7PedTot',fld:'vPEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'},{av:'AV6PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV67ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e111X31',iparms:[{av:'AV66Valor',fld:'vVALOR',grid:35,pic:'ZZZZZZZ9.99'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_35',ctrl:'GRID',grid:35,prop:'GridRC',grid:35}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE","{handler:'e131X32',iparms:[{av:'Dvelop_confirmpanel_confirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_CONFIRMAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV50TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV59TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV66Valor',fld:'vVALOR',grid:35,pic:'ZZZZZZZ9.99'},{av:'nRC_GXsfl_35',ctrl:'GRID',grid:35,prop:'GridRC',grid:35},{av:'sPrefix'},{av:'AV9Cantidad',fld:'vCANTIDAD',grid:35,pic:'ZZZZZZ9.9999'},{av:'AV40PrdPreAct',fld:'vPRDPREACT',grid:35,pic:'ZZZZZZZ9.999'},{av:'A719PrdNum',fld:'PRDNUM',grid:35,pic:''},{av:'AV6PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV67ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_CONFIRMAR.CLOSE",",oparms:[{av:'AV40PrdPreAct',fld:'vPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV9Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZ9.9999'},{av:'AV6PedCod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV7PedTot',fld:'vPEDTOT',pic:'ZZZ,ZZZ,ZZ9.99'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV67ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e151X32',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e191X32',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("VPRDPREACT.CONTROLVALUECHANGED","{handler:'e201X32',iparms:[{av:'AV9Cantidad',fld:'vCANTIDAD',grid:35,pic:'ZZZZZZ9.9999'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_35',ctrl:'GRID',grid:35,prop:'GridRC',grid:35},{av:'AV40PrdPreAct',fld:'vPRDPREACT',grid:35,pic:'ZZZZZZZ9.999'},{av:'A719PrdNum',fld:'PRDNUM',grid:35,pic:''},{av:'AV66Valor',fld:'vVALOR',grid:35,pic:'ZZZZZZZ9.99'}]");
      setEventMetadata("VPRDPREACT.CONTROLVALUECHANGED",",oparms:[{av:'AV66Valor',fld:'vVALOR',pic:'ZZZZZZZ9.99'},{av:'AV67ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("VCANTIDAD.CONTROLVALUECHANGED","{handler:'e211X32',iparms:[{av:'AV9Cantidad',fld:'vCANTIDAD',grid:35,pic:'ZZZZZZ9.9999'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_35',ctrl:'GRID',grid:35,prop:'GridRC',grid:35},{av:'AV40PrdPreAct',fld:'vPRDPREACT',grid:35,pic:'ZZZZZZZ9.999'},{av:'A719PrdNum',fld:'PRDNUM',grid:35,pic:''},{av:'AV66Valor',fld:'vVALOR',grid:35,pic:'ZZZZZZZ9.99'}]");
      setEventMetadata("VCANTIDAD.CONTROLVALUECHANGED",",oparms:[{av:'AV66Valor',fld:'vVALOR',pic:'ZZZZZZZ9.99'},{av:'AV67ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("VCANTIDAD.ISVALID","{handler:'e221X32',iparms:[{av:'AV9Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZ9.9999'},{av:'AV66Valor',fld:'vVALOR',pic:'ZZZZZZZ9.99'},{av:'AV40PrdPreAct',fld:'vPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VCANTIDAD.ISVALID",",oparms:[{av:'AV66Valor',fld:'vVALOR',pic:'ZZZZZZZ9.99'},{av:'edtavValor_Backcolor',ctrl:'vVALOR',prop:'Backcolor'}]}");
      setEventMetadata("VPRDPREACT.ISVALID","{handler:'e231X32',iparms:[{av:'AV40PrdPreAct',fld:'vPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV66Valor',fld:'vVALOR',pic:'ZZZZZZZ9.99'},{av:'AV9Cantidad',fld:'vCANTIDAD',pic:'ZZZZZZ9.9999'},{av:'A719PrdNum',fld:'PRDNUM',pic:''}]");
      setEventMetadata("VPRDPREACT.ISVALID",",oparms:[{av:'AV66Valor',fld:'vVALOR',pic:'ZZZZZZZ9.99'},{av:'edtavValor_Backcolor',ctrl:'vVALOR',prop:'Backcolor'}]}");
      setEventMetadata("GRID.ONLINEACTIVATE","{handler:'e241X32',iparms:[{av:'AV66Valor',fld:'vVALOR',grid:35,pic:'ZZZZZZZ9.99'},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_35',ctrl:'GRID',grid:35,prop:'GridRC',grid:35},{av:'AV9Cantidad',fld:'vCANTIDAD',grid:35,pic:'ZZZZZZ9.9999'},{av:'AV40PrdPreAct',fld:'vPRDPREACT',grid:35,pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("GRID.ONLINEACTIVATE",",oparms:[{av:'AV66Valor',fld:'vVALOR',pic:'ZZZZZZZ9.99'},{av:'edtavValor_Backcolor',ctrl:'vVALOR',prop:'Backcolor'},{av:'AV67ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV50TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV59TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV66Valor',fld:'vVALOR',grid:35,pic:'ZZZZZZZ9.99'},{av:'nRC_GXsfl_35',ctrl:'GRID',grid:35,prop:'GridRC',grid:35}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV67ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV50TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV59TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV66Valor',fld:'vVALOR',grid:35,pic:'ZZZZZZZ9.99'},{av:'nRC_GXsfl_35',ctrl:'GRID',grid:35,prop:'GridRC',grid:35}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV67ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV50TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV59TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV66Valor',fld:'vVALOR',grid:35,pic:'ZZZZZZZ9.99'},{av:'nRC_GXsfl_35',ctrl:'GRID',grid:35,prop:'GridRC',grid:35}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV67ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'sPrefix'},{av:'AV54TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV55TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV52TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV53TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV50TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV51TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV48TFPrdCanRes',fld:'vTFPRDCANRES',pic:'ZZZZZZ9.9999'},{av:'AV49TFPrdCanRes_To',fld:'vTFPRDCANRES_TO',pic:'ZZZZZZ9.9999'},{av:'AV46TFPrdCanPen',fld:'vTFPRDCANPEN',pic:'ZZZZZZ9.9999'},{av:'AV47TFPrdCanPen_To',fld:'vTFPRDCANPEN_TO',pic:'ZZZZZZ9.9999'},{av:'AV58TFValDsc',fld:'vTFVALDSC',pic:''},{av:'AV59TFValDsc_Sel',fld:'vTFVALDSC_SEL',pic:''},{av:'AV83Pgmname',fld:'vPGMNAME',pic:''},{av:'AV31OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV33OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV66Valor',fld:'vVALOR',grid:35,pic:'ZZZZZZZ9.99'},{av:'nRC_GXsfl_35',ctrl:'GRID',grid:35,prop:'GridRC',grid:35}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV67ValorTotal',fld:'vVALORTOTAL',pic:'ZZZZZZZZ9.99'},{av:'lblValorstring_Caption',ctrl:'VALORSTRING',prop:'Caption'}]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Valor',iparms:[]");
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
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_confirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV54TFPrdNum = "" ;
      AV55TFPrdNum_Sel = "" ;
      AV52TFPrdNom = "" ;
      AV53TFPrdNom_Sel = "" ;
      AV50TFPrdExiAlm = DecimalUtil.ZERO ;
      AV51TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV48TFPrdCanRes = DecimalUtil.ZERO ;
      AV49TFPrdCanRes_To = DecimalUtil.ZERO ;
      AV46TFPrdCanPen = DecimalUtil.ZERO ;
      AV47TFPrdCanPen_To = DecimalUtil.ZERO ;
      AV58TFValDsc = "" ;
      AV59TFValDsc_Sel = "" ;
      AV83Pgmname = "" ;
      AV66Valor = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV15DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A7240PrdPrea = DecimalUtil.ZERO ;
      AV7PedTot = DecimalUtil.ZERO ;
      AV67ValorTotal = DecimalUtil.ZERO ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      lblTexto1_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      lblTextblocktotal_Jsonclick = "" ;
      lblValorstring_Jsonclick = "" ;
      lblTbexplicar_Jsonclick = "" ;
      bttBtnimprimir_Jsonclick = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV87Ordencompranproveedoresds_1_tfprdnum = "" ;
      AV88Ordencompranproveedoresds_2_tfprdnum_sel = "" ;
      AV89Ordencompranproveedoresds_3_tfprdnom = "" ;
      AV90Ordencompranproveedoresds_4_tfprdnom_sel = "" ;
      AV91Ordencompranproveedoresds_5_tfprdexialm = DecimalUtil.ZERO ;
      AV92Ordencompranproveedoresds_6_tfprdexialm_to = DecimalUtil.ZERO ;
      AV93Ordencompranproveedoresds_7_tfprdcanres = DecimalUtil.ZERO ;
      AV94Ordencompranproveedoresds_8_tfprdcanres_to = DecimalUtil.ZERO ;
      AV95Ordencompranproveedoresds_9_tfprdcanpen = DecimalUtil.ZERO ;
      AV96Ordencompranproveedoresds_10_tfprdcanpen_to = DecimalUtil.ZERO ;
      AV97Ordencompranproveedoresds_11_tfvaldsc = "" ;
      AV98Ordencompranproveedoresds_12_tfvaldsc_sel = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A685PrdCanRes = DecimalUtil.ZERO ;
      A684PrdCanPen = DecimalUtil.ZERO ;
      AV16Disponible = DecimalUtil.ZERO ;
      A857ValDsc = "" ;
      AV9Cantidad = DecimalUtil.ZERO ;
      AV40PrdPreAct = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV87Ordencompranproveedoresds_1_tfprdnum = "" ;
      lV89Ordencompranproveedoresds_3_tfprdnom = "" ;
      lV97Ordencompranproveedoresds_11_tfvaldsc = "" ;
      A396EmprCod = "" ;
      H01X32_A396EmprCod = new String[] {""} ;
      H01X32_A856ValCod = new byte[1] ;
      H01X32_A6158PrdPrv = new int[1] ;
      H01X32_A7240PrdPrea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01X32_A857ValDsc = new String[] {""} ;
      H01X32_n857ValDsc = new boolean[] {false} ;
      H01X32_A684PrdCanPen = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01X32_A685PrdCanRes = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01X32_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01X32_A718PrdNom = new String[] {""} ;
      H01X32_A719PrdNum = new String[] {""} ;
      H01X33_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV84Station = "" ;
      AV85Emprnom = "" ;
      AV86Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV68WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext8 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV79KeyCantidad = "" ;
      AV77Properties = new com.genexus.util.GXProperties();
      AV45Session = httpContext.getWebSession();
      AV80KeyPreco = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV42PriCod = "" ;
      AV78KeyProps = "" ;
      AV19FecEnt = GXutil.nullDate() ;
      GXv_int1 = new int[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_decimal10 = new java.math.BigDecimal[1] ;
      GXv_decimal9 = new java.math.BigDecimal[1] ;
      GXv_date12 = new java.util.Date[1] ;
      Gx_msg = "" ;
      AV21GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV22GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char14 = "" ;
      GXv_char5 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char2 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState15 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV62TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV24HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_confirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV8PrvNum = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.ordencompranproveedores__default(),
         new Object[] {
             new Object[] {
            H01X32_A396EmprCod, H01X32_A856ValCod, H01X32_A6158PrdPrv, H01X32_A7240PrdPrea, H01X32_A857ValDsc, H01X32_n857ValDsc, H01X32_A684PrdCanPen, H01X32_A685PrdCanRes, H01X32_A704PrdExiAlm, H01X32_A718PrdNom,
            H01X32_A719PrdNum
            }
            , new Object[] {
            H01X33_AGRID_nRecordCount
            }
         }
      );
      AV83Pgmname = "OrdenCompranProveedores" ;
      /* GeneXus formulas. */
      AV83Pgmname = "OrdenCompranProveedores" ;
      Gx_err = (short)(0) ;
      edtavDisponible_Enabled = 0 ;
      edtavValor_Enabled = 0 ;
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
   private byte subGrid_Sortable ;
   private byte A856ValCod ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV31OrderedBy ;
   private short AV23Haydatos ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV13Copias ;
   private short AV14Copias2 ;
   private int wcpOAV8PrvNum ;
   private int nRC_GXsfl_35 ;
   private int AV8PrvNum ;
   private int subGrid_Rows ;
   private int nGXsfl_35_idx=1 ;
   private int AV6PedCod ;
   private int divTableinvisible_Visible ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavDisponible_Enabled ;
   private int edtavValor_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A6158PrdPrv ;
   private int edtavCantidad_Backcolor ;
   private int edtavCantidad_Forecolor ;
   private int edtavPrdpreact_Backcolor ;
   private int edtavPrdpreact_Forecolor ;
   private int edtavValor_Backcolor ;
   private int edtavValor_Forecolor ;
   private int nGXsfl_35_fel_idx=1 ;
   private int GXv_int1[] ;
   private int AV103GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavDisponible_Visible ;
   private int edtavCantidad_Enabled ;
   private int edtavCantidad_Visible ;
   private int edtavPrdpreact_Enabled ;
   private int edtavPrdpreact_Visible ;
   private int edtavValor_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV50TFPrdExiAlm ;
   private java.math.BigDecimal AV51TFPrdExiAlm_To ;
   private java.math.BigDecimal AV48TFPrdCanRes ;
   private java.math.BigDecimal AV49TFPrdCanRes_To ;
   private java.math.BigDecimal AV46TFPrdCanPen ;
   private java.math.BigDecimal AV47TFPrdCanPen_To ;
   private java.math.BigDecimal AV66Valor ;
   private java.math.BigDecimal A7240PrdPrea ;
   private java.math.BigDecimal AV7PedTot ;
   private java.math.BigDecimal AV67ValorTotal ;
   private java.math.BigDecimal AV91Ordencompranproveedoresds_5_tfprdexialm ;
   private java.math.BigDecimal AV92Ordencompranproveedoresds_6_tfprdexialm_to ;
   private java.math.BigDecimal AV93Ordencompranproveedoresds_7_tfprdcanres ;
   private java.math.BigDecimal AV94Ordencompranproveedoresds_8_tfprdcanres_to ;
   private java.math.BigDecimal AV95Ordencompranproveedoresds_9_tfprdcanpen ;
   private java.math.BigDecimal AV96Ordencompranproveedoresds_10_tfprdcanpen_to ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A685PrdCanRes ;
   private java.math.BigDecimal A684PrdCanPen ;
   private java.math.BigDecimal AV16Disponible ;
   private java.math.BigDecimal AV9Cantidad ;
   private java.math.BigDecimal AV40PrdPreAct ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal GXv_decimal10[] ;
   private java.math.BigDecimal GXv_decimal9[] ;
   private String wcpOAV5Emprcod ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_confirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String sGXsfl_35_idx="0001" ;
   private String AV54TFPrdNum ;
   private String AV55TFPrdNum_Sel ;
   private String AV52TFPrdNom ;
   private String AV53TFPrdNom_Sel ;
   private String AV58TFValDsc ;
   private String AV59TFValDsc_Sel ;
   private String AV83Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String Ddo_grid_Caption ;
   private String Ddo_grid_Filteredtext_set ;
   private String Ddo_grid_Filteredtextto_set ;
   private String Ddo_grid_Selectedvalue_set ;
   private String Ddo_grid_Gridinternalname ;
   private String Ddo_grid_Columnids ;
   private String Ddo_grid_Columnssortvalues ;
   private String Ddo_grid_Includesortasc ;
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
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
   private String lblTexto1_Internalname ;
   private String lblTexto1_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divTableheader_Internalname ;
   private String TempTags ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String divTableactions_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String lblTextblocktotal_Internalname ;
   private String lblTextblocktotal_Jsonclick ;
   private String lblValorstring_Internalname ;
   private String lblValorstring_Caption ;
   private String lblValorstring_Jsonclick ;
   private String divTableinvisible_Internalname ;
   private String lblTbexplicar_Internalname ;
   private String lblTbexplicar_Jsonclick ;
   private String bttBtnimprimir_Internalname ;
   private String bttBtnimprimir_Jsonclick ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavDisponible_Internalname ;
   private String AV87Ordencompranproveedoresds_1_tfprdnum ;
   private String AV88Ordencompranproveedoresds_2_tfprdnum_sel ;
   private String AV89Ordencompranproveedoresds_3_tfprdnom ;
   private String AV90Ordencompranproveedoresds_4_tfprdnom_sel ;
   private String AV97Ordencompranproveedoresds_11_tfvaldsc ;
   private String AV98Ordencompranproveedoresds_12_tfvaldsc_sel ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String edtPrdCanRes_Internalname ;
   private String edtPrdCanPen_Internalname ;
   private String A857ValDsc ;
   private String edtValDsc_Internalname ;
   private String edtavCantidad_Internalname ;
   private String edtavPrdpreact_Internalname ;
   private String edtavValor_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV87Ordencompranproveedoresds_1_tfprdnum ;
   private String lV89Ordencompranproveedoresds_3_tfprdnom ;
   private String lV97Ordencompranproveedoresds_11_tfvaldsc ;
   private String A396EmprCod ;
   private String hsh ;
   private String AV84Station ;
   private String AV85Emprnom ;
   private String AV86Usurcod ;
   private String AV42PriCod ;
   private String sGXsfl_35_fel_idx="0001" ;
   private String Gx_msg ;
   private String GXt_char14 ;
   private String GXv_char5[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char2 ;
   private String GXv_char3[] ;
   private String tblTabledvelop_confirmpanel_confirmar_Internalname ;
   private String Dvelop_confirmpanel_confirmar_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV8PrvNum ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdCanRes_Jsonclick ;
   private String edtPrdCanPen_Jsonclick ;
   private String edtavDisponible_Jsonclick ;
   private String edtValDsc_Jsonclick ;
   private String edtavCantidad_Jsonclick ;
   private String edtavPrdpreact_Jsonclick ;
   private String edtavValor_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV19FecEnt ;
   private java.util.Date GXv_date12[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV33OrderedDsc ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n857ValDsc ;
   private boolean bGXsfl_35_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV79KeyCantidad ;
   private String AV80KeyPreco ;
   private String AV78KeyProps ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV24HTTPRequest ;
   private com.genexus.webpanels.WebSession AV45Session ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_confirmar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private String[] H01X32_A396EmprCod ;
   private byte[] H01X32_A856ValCod ;
   private int[] H01X32_A6158PrdPrv ;
   private java.math.BigDecimal[] H01X32_A7240PrdPrea ;
   private String[] H01X32_A857ValDsc ;
   private boolean[] H01X32_n857ValDsc ;
   private java.math.BigDecimal[] H01X32_A684PrdCanPen ;
   private java.math.BigDecimal[] H01X32_A685PrdCanRes ;
   private java.math.BigDecimal[] H01X32_A704PrdExiAlm ;
   private String[] H01X32_A718PrdNom ;
   private String[] H01X32_A719PrdNum ;
   private long[] H01X33_AGRID_nRecordCount ;
   private com.genexus.util.GXProperties AV77Properties ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV15DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV21GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState15[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV22GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV62TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV68WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext8[] ;
}

final  class ordencompranproveedores__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01X32( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV88Ordencompranproveedoresds_2_tfprdnum_sel ,
                                          String AV87Ordencompranproveedoresds_1_tfprdnum ,
                                          String AV90Ordencompranproveedoresds_4_tfprdnom_sel ,
                                          String AV89Ordencompranproveedoresds_3_tfprdnom ,
                                          java.math.BigDecimal AV91Ordencompranproveedoresds_5_tfprdexialm ,
                                          java.math.BigDecimal AV92Ordencompranproveedoresds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV93Ordencompranproveedoresds_7_tfprdcanres ,
                                          java.math.BigDecimal AV94Ordencompranproveedoresds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV95Ordencompranproveedoresds_9_tfprdcanpen ,
                                          java.math.BigDecimal AV96Ordencompranproveedoresds_10_tfprdcanpen_to ,
                                          String AV98Ordencompranproveedoresds_12_tfvaldsc_sel ,
                                          String AV97Ordencompranproveedoresds_11_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          String A857ValDsc ,
                                          short AV31OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          int A6158PrdPrv ,
                                          int AV8PrvNum ,
                                          byte A856ValCod ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int16 = new byte[19];
      Object[] GXv_Object17 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.EmprCod, T2.ValCod, T1.PrdPrv, T1.PrdPrea, T3.ValDsc, T2.PrdCanPen, T2.PrdCanRes, T2.PrdExiAlm, T2.PrdNom, T1.PrdNum" ;
      sFromString = " FROM ((TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod AND T3.ValCod" ;
      sFromString += " = T2.ValCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdPrv = ?)");
      addWhere(sWhereString, "(T2.ValCod <= 2)");
      if ( (GXutil.strcmp("", AV88Ordencompranproveedoresds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV87Ordencompranproveedoresds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ordencompranproveedoresds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int16[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Ordencompranproveedoresds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Ordencompranproveedoresds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Ordencompranproveedoresds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int16[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ordencompranproveedoresds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int16[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ordencompranproveedoresds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int16[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ordencompranproveedoresds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int16[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Ordencompranproveedoresds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int16[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Ordencompranproveedoresds_9_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int16[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Ordencompranproveedoresds_10_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int16[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Ordencompranproveedoresds_12_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Ordencompranproveedoresds_11_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int16[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ordencompranproveedoresds_12_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int16[13] = (byte)(1) ;
      }
      if ( AV31OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.PrdPrv" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdExiAlm" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdExiAlm DESC" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdCanRes" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdCanRes DESC" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdCanPen" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdCanPen DESC" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ! AV33OrderedDsc )
      {
         sOrderString += " ORDER BY T3.ValDsc" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ( AV33OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.ValDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrdNum, T1.PrdPrv" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object17[0] = scmdbuf ;
      GXv_Object17[1] = GXv_int16 ;
      return GXv_Object17 ;
   }

   protected Object[] conditional_H01X33( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV88Ordencompranproveedoresds_2_tfprdnum_sel ,
                                          String AV87Ordencompranproveedoresds_1_tfprdnum ,
                                          String AV90Ordencompranproveedoresds_4_tfprdnom_sel ,
                                          String AV89Ordencompranproveedoresds_3_tfprdnom ,
                                          java.math.BigDecimal AV91Ordencompranproveedoresds_5_tfprdexialm ,
                                          java.math.BigDecimal AV92Ordencompranproveedoresds_6_tfprdexialm_to ,
                                          java.math.BigDecimal AV93Ordencompranproveedoresds_7_tfprdcanres ,
                                          java.math.BigDecimal AV94Ordencompranproveedoresds_8_tfprdcanres_to ,
                                          java.math.BigDecimal AV95Ordencompranproveedoresds_9_tfprdcanpen ,
                                          java.math.BigDecimal AV96Ordencompranproveedoresds_10_tfprdcanpen_to ,
                                          String AV98Ordencompranproveedoresds_12_tfvaldsc_sel ,
                                          String AV97Ordencompranproveedoresds_11_tfvaldsc ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          java.math.BigDecimal A685PrdCanRes ,
                                          java.math.BigDecimal A684PrdCanPen ,
                                          String A857ValDsc ,
                                          short AV31OrderedBy ,
                                          boolean AV33OrderedDsc ,
                                          int A6158PrdPrv ,
                                          int AV8PrvNum ,
                                          byte A856ValCod ,
                                          String AV5Emprcod ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int18 = new byte[14];
      Object[] GXv_Object19 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPPROPRV T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) LEFT JOIN TXPTIPVAL T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.ValCod = T2.ValCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      addWhere(sWhereString, "(T1.PrdPrv = ?)");
      addWhere(sWhereString, "(T2.ValCod <= 2)");
      if ( (GXutil.strcmp("", AV88Ordencompranproveedoresds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV87Ordencompranproveedoresds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV88Ordencompranproveedoresds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int18[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV90Ordencompranproveedoresds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV89Ordencompranproveedoresds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV90Ordencompranproveedoresds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int18[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV91Ordencompranproveedoresds_5_tfprdexialm)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int18[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV92Ordencompranproveedoresds_6_tfprdexialm_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int18[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV93Ordencompranproveedoresds_7_tfprdcanres)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes >= ?)");
      }
      else
      {
         GXv_int18[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV94Ordencompranproveedoresds_8_tfprdcanres_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanRes <= ?)");
      }
      else
      {
         GXv_int18[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV95Ordencompranproveedoresds_9_tfprdcanpen)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanPen >= ?)");
      }
      else
      {
         GXv_int18[10] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV96Ordencompranproveedoresds_10_tfprdcanpen_to)==0) )
      {
         addWhere(sWhereString, "(T2.PrdCanPen <= ?)");
      }
      else
      {
         GXv_int18[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV98Ordencompranproveedoresds_12_tfvaldsc_sel)==0) && ( ! (GXutil.strcmp("", AV97Ordencompranproveedoresds_11_tfvaldsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ValDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int18[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV98Ordencompranproveedoresds_12_tfvaldsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ValDsc = ?)");
      }
      else
      {
         GXv_int18[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV31OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 2 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 3 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 4 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 5 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 6 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ! AV33OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV31OrderedBy == 7 ) && ( AV33OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object19[0] = scmdbuf ;
      GXv_Object19[1] = GXv_int18 ;
      return GXv_Object19 ;
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
                  return conditional_H01X32(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
            case 1 :
                  return conditional_H01X33(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (java.math.BigDecimal)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , (java.math.BigDecimal)dynConstraints[16] , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , ((Number) dynConstraints[20]).intValue() , ((Number) dynConstraints[21]).intValue() , ((Number) dynConstraints[22]).byteValue() , (String)dynConstraints[23] , (String)dynConstraints[24] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01X32", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01X33", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,5);
               ((String[]) buf[4])[0] = rslt.getString(5, 16);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,4);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(7,4);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(8,4);
               ((String[]) buf[9])[0] = rslt.getString(9, 26);
               ((String[]) buf[10])[0] = rslt.getString(10, 6);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
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
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 16);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[36]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 4);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 16);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 16);
               }
               return;
      }
   }

}

