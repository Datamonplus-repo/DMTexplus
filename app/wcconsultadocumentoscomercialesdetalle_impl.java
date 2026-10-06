package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcconsultadocumentoscomercialesdetalle_impl extends GXWebComponent
{
   public wcconsultadocumentoscomercialesdetalle_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcconsultadocumentoscomercialesdetalle_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcconsultadocumentoscomercialesdetalle_impl.class ));
   }

   public wcconsultadocumentoscomercialesdetalle_impl( int remoteHandle ,
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
               AV55Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Emprcod", AV55Emprcod);
               AV56AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56AlbComCod), 8, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV55Emprcod,Integer.valueOf(AV56AlbComCod)});
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
      AV55Emprcod = httpContext.GetPar( "Emprcod") ;
      AV56AlbComCod = (int)(GXutil.lval( httpContext.GetPar( "AlbComCod"))) ;
      AV25ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV20ColumnsSelector);
      AV57TFAlbComLin = (short)(GXutil.lval( httpContext.GetPar( "TFAlbComLin"))) ;
      AV58TFAlbComLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFAlbComLin_To"))) ;
      AV59TFAlbComNRef = httpContext.GetPar( "TFAlbComNRef") ;
      AV60TFAlbComNRef_Sel = httpContext.GetPar( "TFAlbComNRef_Sel") ;
      AV61TFAlbComVDoc = httpContext.GetPar( "TFAlbComVDoc") ;
      AV62TFAlbComVDoc_Sel = httpContext.GetPar( "TFAlbComVDoc_Sel") ;
      AV63TFAlbComPzas = (int)(GXutil.lval( httpContext.GetPar( "TFAlbComPzas"))) ;
      AV64TFAlbComPzas_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbComPzas_To"))) ;
      AV65TFAlbComMts = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbComMts"), ".") ;
      AV66TFAlbComMts_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbComMts_To"), ".") ;
      AV67TFAlbComArt = httpContext.GetPar( "TFAlbComArt") ;
      AV68TFAlbComArt_Sel = httpContext.GetPar( "TFAlbComArt_Sel") ;
      AV69TFAlbComArtD = httpContext.GetPar( "TFAlbComArtD") ;
      AV70TFAlbComArtD_Sel = httpContext.GetPar( "TFAlbComArtD_Sel") ;
      AV71TFAlbComCol = httpContext.GetPar( "TFAlbComCol") ;
      AV72TFAlbComCol_Sel = httpContext.GetPar( "TFAlbComCol_Sel") ;
      AV73TFAlbComKgs = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbComKgs"), ".") ;
      AV74TFAlbComKgs_To = CommonUtil.decimalVal( httpContext.GetPar( "TFAlbComKgs_To"), ".") ;
      AV75TFAlbComDsc = httpContext.GetPar( "TFAlbComDsc") ;
      AV76TFAlbComDsc_Sel = httpContext.GetPar( "TFAlbComDsc_Sel") ;
      AV109Pgmname = httpContext.GetPar( "Pgmname") ;
      AV12OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV13OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV77TotAlbComPzas = GXutil.lval( httpContext.GetPar( "TotAlbComPzas")) ;
      AV79TotAlbComMts = CommonUtil.decimalVal( httpContext.GetPar( "TotAlbComMts"), ".") ;
      AV81TotAlbComKgs = CommonUtil.decimalVal( httpContext.GetPar( "TotAlbComKgs"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55Emprcod, AV56AlbComCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV57TFAlbComLin, AV58TFAlbComLin_To, AV59TFAlbComNRef, AV60TFAlbComNRef_Sel, AV61TFAlbComVDoc, AV62TFAlbComVDoc_Sel, AV63TFAlbComPzas, AV64TFAlbComPzas_To, AV65TFAlbComMts, AV66TFAlbComMts_To, AV67TFAlbComArt, AV68TFAlbComArt_Sel, AV69TFAlbComArtD, AV70TFAlbComArtD_Sel, AV71TFAlbComCol, AV72TFAlbComCol_Sel, AV73TFAlbComKgs, AV74TFAlbComKgs_To, AV75TFAlbComDsc, AV76TFAlbComDsc_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77TotAlbComPzas, AV79TotAlbComMts, AV81TotAlbComKgs, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1762( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " Documento Comercial (v01)", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcconsultadocumentoscomercialesdetalle", new String[] {GXutil.URLEncode(GXutil.rtrim(AV55Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV56AlbComCod,8,0))}, new String[] {"Emprcod","AlbComCod"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV109Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMPZAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77TotAlbComPzas), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMMTS", getSecureSignedToken( sPrefix, localUtil.format( AV79TotAlbComMts, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMKGS", getSecureSignedToken( sPrefix, localUtil.format( AV81TotAlbComKgs, "ZZZZZZ9.99")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV52GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV53GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV50DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV20ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV55Emprcod", GXutil.rtrim( wcpOAV55Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV56AlbComCod", GXutil.ltrim( localUtil.ntoc( wcpOAV56AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV25ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMLIN", GXutil.ltrim( localUtil.ntoc( AV57TFAlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMLIN_TO", GXutil.ltrim( localUtil.ntoc( AV58TFAlbComLin_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMNREF", GXutil.rtrim( AV59TFAlbComNRef));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMNREF_SEL", GXutil.rtrim( AV60TFAlbComNRef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMVDOC", GXutil.rtrim( AV61TFAlbComVDoc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMVDOC_SEL", GXutil.rtrim( AV62TFAlbComVDoc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMPZAS", GXutil.ltrim( localUtil.ntoc( AV63TFAlbComPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMPZAS_TO", GXutil.ltrim( localUtil.ntoc( AV64TFAlbComPzas_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMMTS", GXutil.ltrim( localUtil.ntoc( AV65TFAlbComMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMMTS_TO", GXutil.ltrim( localUtil.ntoc( AV66TFAlbComMts_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMART", GXutil.rtrim( AV67TFAlbComArt));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMART_SEL", GXutil.rtrim( AV68TFAlbComArt_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMARTD", GXutil.rtrim( AV69TFAlbComArtD));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMARTD_SEL", GXutil.rtrim( AV70TFAlbComArtD_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMCOL", GXutil.rtrim( AV71TFAlbComCol));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMCOL_SEL", GXutil.rtrim( AV72TFAlbComCol_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMKGS", GXutil.ltrim( localUtil.ntoc( AV73TFAlbComKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMKGS_TO", GXutil.ltrim( localUtil.ntoc( AV74TFAlbComKgs_To, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMDSC", GXutil.rtrim( AV75TFAlbComDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFALBCOMDSC_SEL", GXutil.rtrim( AV76TFAlbComDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV109Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV109Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV12OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV13OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV55Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vALBCOMCOD", GXutil.ltrim( localUtil.ntoc( AV56AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"ALBCOMCOD", GXutil.ltrim( localUtil.ntoc( A14AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALBCOMPZAS", GXutil.ltrim( localUtil.ntoc( AV77TotAlbComPzas, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMPZAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77TotAlbComPzas), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALBCOMMTS", GXutil.ltrim( localUtil.ntoc( AV79TotAlbComMts, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMMTS", getSecureSignedToken( sPrefix, localUtil.format( AV79TotAlbComMts, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALBCOMKGS", GXutil.ltrim( localUtil.ntoc( AV81TotAlbComKgs, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMKGS", getSecureSignedToken( sPrefix, localUtil.format( AV81TotAlbComKgs, "ZZZZZZ9.99")));
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

   public void renderHtmlCloseForm1762( )
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
      return "WCConsultaDocumentosComercialesDetalle" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Documento Comercial (v01)", "") ;
   }

   public void wb1760( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcconsultadocumentoscomercialesdetalle");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportreport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportReportCaption", ""), bttBtnexportreport_Jsonclick, 7, httpContext.getMessage( "WWP_ExportReportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111761_client"+"'", TempTags, "", 2, "HLP_WCConsultaDocumentosComercialesDetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaDocumentosComercialesDetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaDocumentosComercialesDetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 43, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCConsultaDocumentosComercialesDetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_25_1762( true) ;
      }
      else
      {
         wb_table1_25_1762( false) ;
      }
      return  ;
   }

   public void wb_table1_25_1762e( boolean wbgen )
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
         wb_table2_56_1762( true) ;
      }
      else
      {
         wb_table2_56_1762( false) ;
      }
      return  ;
   }

   public void wb_table2_56_1762e( boolean wbgen )
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
         ucGridpaginationbar.setProperty("CurrentPage", AV52GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV53GridPageCount);
         ucGridpaginationbar.render(context, "dvelop.dvpaginationbar", Gridpaginationbar_Internalname, sPrefix+"GRIDPAGINATIONBARContainer");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         /* User Defined Control */
         ucInnewwindow1.render(context, "innewwindow", Innewwindow1_Internalname, sPrefix+"INNEWWINDOW1Container");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
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

   public void start1762( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " Documento Comercial (v01)", ""), (short)(0)) ;
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
            strup1760( ) ;
         }
      }
   }

   public void ws1762( )
   {
      start1762( ) ;
      evt1762( ) ;
   }

   public void evt1762( )
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
                              strup1760( ) ;
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
                              strup1760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e171762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1760( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e181762 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1760( ) ;
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
                              strup1760( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           A20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13315AlbComNRef = httpContext.cgiGet( edtAlbComNRef_Internalname) ;
                           A13316AlbComVDoc = httpContext.cgiGet( edtAlbComVDoc_Internalname) ;
                           A13317AlbComPzas = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13318AlbComMts = localUtil.ctond( httpContext.cgiGet( edtAlbComMts_Internalname)) ;
                           A13320AlbComArt = httpContext.cgiGet( edtAlbComArt_Internalname) ;
                           A13321AlbComArtD = httpContext.cgiGet( edtAlbComArtD_Internalname) ;
                           A13322AlbComCol = httpContext.cgiGet( edtAlbComCol_Internalname) ;
                           A13319AlbComKgs = localUtil.ctond( httpContext.cgiGet( edtAlbComKgs_Internalname)) ;
                           A15AlbComDsc = httpContext.cgiGet( edtAlbComDsc_Internalname) ;
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
                                       e191762 ();
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
                                       e201762 ();
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
                                       e211762 ();
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
                                    strup1760( ) ;
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
                              strup1760( ) ;
                           }
                           nGXsfl_43_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_432( ) ;
                           A20AlbComLin = (short)(localUtil.ctol( httpContext.cgiGet( edtAlbComLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13315AlbComNRef = httpContext.cgiGet( edtAlbComNRef_Internalname) ;
                           A13316AlbComVDoc = httpContext.cgiGet( edtAlbComVDoc_Internalname) ;
                           A13317AlbComPzas = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbComPzas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13318AlbComMts = localUtil.ctond( httpContext.cgiGet( edtAlbComMts_Internalname)) ;
                           A13320AlbComArt = httpContext.cgiGet( edtAlbComArt_Internalname) ;
                           A13321AlbComArtD = httpContext.cgiGet( edtAlbComArtD_Internalname) ;
                           A13322AlbComCol = httpContext.cgiGet( edtAlbComCol_Internalname) ;
                           A13319AlbComKgs = localUtil.ctond( httpContext.cgiGet( edtAlbComKgs_Internalname)) ;
                           A15AlbComDsc = httpContext.cgiGet( edtAlbComDsc_Internalname) ;
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
                                       e191762 ();
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
                                       e201762 ();
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
                                       e211762 ();
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
                                    strup1760( ) ;
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

   public void we1762( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1762( ) ;
         }
      }
   }

   public void pa1762( )
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
                                 String AV55Emprcod ,
                                 int AV56AlbComCod ,
                                 byte AV25ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ,
                                 short AV57TFAlbComLin ,
                                 short AV58TFAlbComLin_To ,
                                 String AV59TFAlbComNRef ,
                                 String AV60TFAlbComNRef_Sel ,
                                 String AV61TFAlbComVDoc ,
                                 String AV62TFAlbComVDoc_Sel ,
                                 int AV63TFAlbComPzas ,
                                 int AV64TFAlbComPzas_To ,
                                 java.math.BigDecimal AV65TFAlbComMts ,
                                 java.math.BigDecimal AV66TFAlbComMts_To ,
                                 String AV67TFAlbComArt ,
                                 String AV68TFAlbComArt_Sel ,
                                 String AV69TFAlbComArtD ,
                                 String AV70TFAlbComArtD_Sel ,
                                 String AV71TFAlbComCol ,
                                 String AV72TFAlbComCol_Sel ,
                                 java.math.BigDecimal AV73TFAlbComKgs ,
                                 java.math.BigDecimal AV74TFAlbComKgs_To ,
                                 String AV75TFAlbComDsc ,
                                 String AV76TFAlbComDsc_Sel ,
                                 String AV109Pgmname ,
                                 short AV12OrderedBy ,
                                 boolean AV13OrderedDsc ,
                                 long AV77TotAlbComPzas ,
                                 java.math.BigDecimal AV79TotAlbComMts ,
                                 java.math.BigDecimal AV81TotAlbComKgs ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e201762 ();
      GRID_nCurrentRecord = 0 ;
      rf1762( ) ;
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
      rf1762( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV109Pgmname = "WCConsultaDocumentosComercialesDetalle" ;
      Gx_err = (short)(0) ;
      edtavTotvaluealbcompzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluealbcompzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbcompzas_Enabled), 5, 0), true);
      edtavTotvaluealbcommts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluealbcommts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbcommts_Enabled), 5, 0), true);
      edtavTotvaluealbcomkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluealbcomkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbcomkgs_Enabled), 5, 0), true);
   }

   public void rf1762( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(43) ;
      /* Execute user event: Refresh */
      e201762 ();
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
                                              AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                              Short.valueOf(AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                              Short.valueOf(AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                              AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                              AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                              AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                              AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                              Integer.valueOf(AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                              Integer.valueOf(AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                              AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                              AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                              AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                              AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                              AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                              AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                              AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                              AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                              AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                              AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                              AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                              AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                              Short.valueOf(A20AlbComLin) ,
                                              A13315AlbComNRef ,
                                              A13316AlbComVDoc ,
                                              Integer.valueOf(A13317AlbComPzas) ,
                                              A13318AlbComMts ,
                                              A13320AlbComArt ,
                                              A13321AlbComArtD ,
                                              A13322AlbComCol ,
                                              A13319AlbComKgs ,
                                              A15AlbComDsc ,
                                              Short.valueOf(AV12OrderedBy) ,
                                              Boolean.valueOf(AV13OrderedDsc) ,
                                              AV55Emprcod ,
                                              Integer.valueOf(AV56AlbComCod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A14AlbComCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                              TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
         lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
         lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
         lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
         lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
         lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
         lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
         lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
         lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
         lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
         lV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
         lV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
         lV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
         lV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
         lV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
         lV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
         /* Using cursor H01762 */
         pr_default.execute(0, new Object[] {AV55Emprcod, Integer.valueOf(AV56AlbComCod), lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_43_idx = 1 ;
         sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_432( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H01762_A396EmprCod[0] ;
            A14AlbComCod = H01762_A14AlbComCod[0] ;
            A15AlbComDsc = H01762_A15AlbComDsc[0] ;
            A13319AlbComKgs = H01762_A13319AlbComKgs[0] ;
            A13322AlbComCol = H01762_A13322AlbComCol[0] ;
            A13321AlbComArtD = H01762_A13321AlbComArtD[0] ;
            A13320AlbComArt = H01762_A13320AlbComArt[0] ;
            A13318AlbComMts = H01762_A13318AlbComMts[0] ;
            A13317AlbComPzas = H01762_A13317AlbComPzas[0] ;
            A13316AlbComVDoc = H01762_A13316AlbComVDoc[0] ;
            A13315AlbComNRef = H01762_A13315AlbComNRef[0] ;
            A20AlbComLin = H01762_A20AlbComLin[0] ;
            e211762 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(43) ;
         wb1760( ) ;
      }
      bGXsfl_43_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1762( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV109Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV109Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALBCOMPZAS", GXutil.ltrim( localUtil.ntoc( AV77TotAlbComPzas, (byte)(18), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMPZAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77TotAlbComPzas), "ZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALBCOMMTS", GXutil.ltrim( localUtil.ntoc( AV79TotAlbComMts, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMMTS", getSecureSignedToken( sPrefix, localUtil.format( AV79TotAlbComMts, "ZZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTOTALBCOMKGS", GXutil.ltrim( localUtil.ntoc( AV81TotAlbComKgs, (byte)(18), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMKGS", getSecureSignedToken( sPrefix, localUtil.format( AV81TotAlbComKgs, "ZZZZZZ9.99")));
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
      AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV15FilterFullText ;
      AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV57TFAlbComLin ;
      AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV58TFAlbComLin_To ;
      AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV59TFAlbComNRef ;
      AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV60TFAlbComNRef_Sel ;
      AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV61TFAlbComVDoc ;
      AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV62TFAlbComVDoc_Sel ;
      AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV63TFAlbComPzas ;
      AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV64TFAlbComPzas_To ;
      AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV65TFAlbComMts ;
      AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV66TFAlbComMts_To ;
      AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV67TFAlbComArt ;
      AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV68TFAlbComArt_Sel ;
      AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV69TFAlbComArtD ;
      AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV70TFAlbComArtD_Sel ;
      AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV71TFAlbComCol ;
      AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV72TFAlbComCol_Sel ;
      AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV73TFAlbComKgs ;
      AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV74TFAlbComKgs_To ;
      AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV75TFAlbComDsc ;
      AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV76TFAlbComDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                           Short.valueOf(AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                           Short.valueOf(AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                           AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                           AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                           AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                           AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                           Integer.valueOf(AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                           Integer.valueOf(AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                           AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                           AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                           AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                           AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                           AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                           AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                           AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                           AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                           AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                           AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                           AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                           AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A13315AlbComNRef ,
                                           A13316AlbComVDoc ,
                                           Integer.valueOf(A13317AlbComPzas) ,
                                           A13318AlbComMts ,
                                           A13320AlbComArt ,
                                           A13321AlbComArtD ,
                                           A13322AlbComCol ,
                                           A13319AlbComKgs ,
                                           A15AlbComDsc ,
                                           Short.valueOf(AV12OrderedBy) ,
                                           Boolean.valueOf(AV13OrderedDsc) ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56AlbComCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A14AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
      lV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
      lV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
      lV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
      lV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
      lV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
      /* Using cursor H01763 */
      pr_default.execute(1, new Object[] {AV55Emprcod, Integer.valueOf(AV56AlbComCod), lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel});
      GRID_nRecordCount = H01763_AGRID_nRecordCount[0] ;
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
      AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV15FilterFullText ;
      AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV57TFAlbComLin ;
      AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV58TFAlbComLin_To ;
      AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV59TFAlbComNRef ;
      AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV60TFAlbComNRef_Sel ;
      AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV61TFAlbComVDoc ;
      AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV62TFAlbComVDoc_Sel ;
      AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV63TFAlbComPzas ;
      AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV64TFAlbComPzas_To ;
      AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV65TFAlbComMts ;
      AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV66TFAlbComMts_To ;
      AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV67TFAlbComArt ;
      AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV68TFAlbComArt_Sel ;
      AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV69TFAlbComArtD ;
      AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV70TFAlbComArtD_Sel ;
      AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV71TFAlbComCol ;
      AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV72TFAlbComCol_Sel ;
      AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV73TFAlbComKgs ;
      AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV74TFAlbComKgs_To ;
      AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV75TFAlbComDsc ;
      AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV76TFAlbComDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55Emprcod, AV56AlbComCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV57TFAlbComLin, AV58TFAlbComLin_To, AV59TFAlbComNRef, AV60TFAlbComNRef_Sel, AV61TFAlbComVDoc, AV62TFAlbComVDoc_Sel, AV63TFAlbComPzas, AV64TFAlbComPzas_To, AV65TFAlbComMts, AV66TFAlbComMts_To, AV67TFAlbComArt, AV68TFAlbComArt_Sel, AV69TFAlbComArtD, AV70TFAlbComArtD_Sel, AV71TFAlbComCol, AV72TFAlbComCol_Sel, AV73TFAlbComKgs, AV74TFAlbComKgs_To, AV75TFAlbComDsc, AV76TFAlbComDsc_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77TotAlbComPzas, AV79TotAlbComMts, AV81TotAlbComKgs, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV15FilterFullText ;
      AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV57TFAlbComLin ;
      AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV58TFAlbComLin_To ;
      AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV59TFAlbComNRef ;
      AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV60TFAlbComNRef_Sel ;
      AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV61TFAlbComVDoc ;
      AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV62TFAlbComVDoc_Sel ;
      AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV63TFAlbComPzas ;
      AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV64TFAlbComPzas_To ;
      AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV65TFAlbComMts ;
      AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV66TFAlbComMts_To ;
      AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV67TFAlbComArt ;
      AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV68TFAlbComArt_Sel ;
      AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV69TFAlbComArtD ;
      AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV70TFAlbComArtD_Sel ;
      AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV71TFAlbComCol ;
      AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV72TFAlbComCol_Sel ;
      AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV73TFAlbComKgs ;
      AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV74TFAlbComKgs_To ;
      AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV75TFAlbComDsc ;
      AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV76TFAlbComDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55Emprcod, AV56AlbComCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV57TFAlbComLin, AV58TFAlbComLin_To, AV59TFAlbComNRef, AV60TFAlbComNRef_Sel, AV61TFAlbComVDoc, AV62TFAlbComVDoc_Sel, AV63TFAlbComPzas, AV64TFAlbComPzas_To, AV65TFAlbComMts, AV66TFAlbComMts_To, AV67TFAlbComArt, AV68TFAlbComArt_Sel, AV69TFAlbComArtD, AV70TFAlbComArtD_Sel, AV71TFAlbComCol, AV72TFAlbComCol_Sel, AV73TFAlbComKgs, AV74TFAlbComKgs_To, AV75TFAlbComDsc, AV76TFAlbComDsc_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77TotAlbComPzas, AV79TotAlbComMts, AV81TotAlbComKgs, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV15FilterFullText ;
      AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV57TFAlbComLin ;
      AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV58TFAlbComLin_To ;
      AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV59TFAlbComNRef ;
      AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV60TFAlbComNRef_Sel ;
      AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV61TFAlbComVDoc ;
      AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV62TFAlbComVDoc_Sel ;
      AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV63TFAlbComPzas ;
      AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV64TFAlbComPzas_To ;
      AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV65TFAlbComMts ;
      AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV66TFAlbComMts_To ;
      AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV67TFAlbComArt ;
      AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV68TFAlbComArt_Sel ;
      AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV69TFAlbComArtD ;
      AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV70TFAlbComArtD_Sel ;
      AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV71TFAlbComCol ;
      AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV72TFAlbComCol_Sel ;
      AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV73TFAlbComKgs ;
      AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV74TFAlbComKgs_To ;
      AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV75TFAlbComDsc ;
      AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV76TFAlbComDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55Emprcod, AV56AlbComCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV57TFAlbComLin, AV58TFAlbComLin_To, AV59TFAlbComNRef, AV60TFAlbComNRef_Sel, AV61TFAlbComVDoc, AV62TFAlbComVDoc_Sel, AV63TFAlbComPzas, AV64TFAlbComPzas_To, AV65TFAlbComMts, AV66TFAlbComMts_To, AV67TFAlbComArt, AV68TFAlbComArt_Sel, AV69TFAlbComArtD, AV70TFAlbComArtD_Sel, AV71TFAlbComCol, AV72TFAlbComCol_Sel, AV73TFAlbComKgs, AV74TFAlbComKgs_To, AV75TFAlbComDsc, AV76TFAlbComDsc_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77TotAlbComPzas, AV79TotAlbComMts, AV81TotAlbComKgs, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV15FilterFullText ;
      AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV57TFAlbComLin ;
      AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV58TFAlbComLin_To ;
      AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV59TFAlbComNRef ;
      AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV60TFAlbComNRef_Sel ;
      AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV61TFAlbComVDoc ;
      AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV62TFAlbComVDoc_Sel ;
      AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV63TFAlbComPzas ;
      AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV64TFAlbComPzas_To ;
      AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV65TFAlbComMts ;
      AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV66TFAlbComMts_To ;
      AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV67TFAlbComArt ;
      AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV68TFAlbComArt_Sel ;
      AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV69TFAlbComArtD ;
      AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV70TFAlbComArtD_Sel ;
      AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV71TFAlbComCol ;
      AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV72TFAlbComCol_Sel ;
      AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV73TFAlbComKgs ;
      AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV74TFAlbComKgs_To ;
      AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV75TFAlbComDsc ;
      AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV76TFAlbComDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55Emprcod, AV56AlbComCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV57TFAlbComLin, AV58TFAlbComLin_To, AV59TFAlbComNRef, AV60TFAlbComNRef_Sel, AV61TFAlbComVDoc, AV62TFAlbComVDoc_Sel, AV63TFAlbComPzas, AV64TFAlbComPzas_To, AV65TFAlbComMts, AV66TFAlbComMts_To, AV67TFAlbComArt, AV68TFAlbComArt_Sel, AV69TFAlbComArtD, AV70TFAlbComArtD_Sel, AV71TFAlbComCol, AV72TFAlbComCol_Sel, AV73TFAlbComKgs, AV74TFAlbComKgs_To, AV75TFAlbComDsc, AV76TFAlbComDsc_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77TotAlbComPzas, AV79TotAlbComMts, AV81TotAlbComKgs, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV15FilterFullText ;
      AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV57TFAlbComLin ;
      AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV58TFAlbComLin_To ;
      AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV59TFAlbComNRef ;
      AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV60TFAlbComNRef_Sel ;
      AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV61TFAlbComVDoc ;
      AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV62TFAlbComVDoc_Sel ;
      AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV63TFAlbComPzas ;
      AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV64TFAlbComPzas_To ;
      AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV65TFAlbComMts ;
      AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV66TFAlbComMts_To ;
      AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV67TFAlbComArt ;
      AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV68TFAlbComArt_Sel ;
      AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV69TFAlbComArtD ;
      AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV70TFAlbComArtD_Sel ;
      AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV71TFAlbComCol ;
      AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV72TFAlbComCol_Sel ;
      AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV73TFAlbComKgs ;
      AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV74TFAlbComKgs_To ;
      AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV75TFAlbComDsc ;
      AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV76TFAlbComDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15FilterFullText, AV55Emprcod, AV56AlbComCod, AV25ManageFiltersExecutionStep, AV20ColumnsSelector, AV57TFAlbComLin, AV58TFAlbComLin_To, AV59TFAlbComNRef, AV60TFAlbComNRef_Sel, AV61TFAlbComVDoc, AV62TFAlbComVDoc_Sel, AV63TFAlbComPzas, AV64TFAlbComPzas_To, AV65TFAlbComMts, AV66TFAlbComMts_To, AV67TFAlbComArt, AV68TFAlbComArt_Sel, AV69TFAlbComArtD, AV70TFAlbComArtD_Sel, AV71TFAlbComCol, AV72TFAlbComCol_Sel, AV73TFAlbComKgs, AV74TFAlbComKgs_To, AV75TFAlbComDsc, AV76TFAlbComDsc_Sel, AV109Pgmname, AV12OrderedBy, AV13OrderedDsc, AV77TotAlbComPzas, AV79TotAlbComMts, AV81TotAlbComKgs, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV109Pgmname = "WCConsultaDocumentosComercialesDetalle" ;
      Gx_err = (short)(0) ;
      edtavTotvaluealbcompzas_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluealbcompzas_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbcompzas_Enabled), 5, 0), true);
      edtavTotvaluealbcommts_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluealbcommts_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbcommts_Enabled), 5, 0), true);
      edtavTotvaluealbcomkgs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavTotvaluealbcomkgs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvaluealbcomkgs_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1760( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e191762 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV23ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV20ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_43 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_43"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV55Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV55Emprcod") ;
         wcpOAV56AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56AlbComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         AV78TotValueAlbComPzas = httpContext.cgiGet( edtavTotvaluealbcompzas_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TotValueAlbComPzas", AV78TotValueAlbComPzas);
         AV80TotValueAlbComMts = httpContext.cgiGet( edtavTotvaluealbcommts_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TotValueAlbComMts", AV80TotValueAlbComMts);
         AV82TotValueAlbComKgs = httpContext.cgiGet( edtavTotvaluealbcomkgs_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TotValueAlbComKgs", AV82TotValueAlbComKgs);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
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
      e191762 ();
      if (returnInSub) return;
   }

   public void e191762( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV85Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char1 = GXv_char2[0] ;
      AV85Station = GXt_char1 ;
      GXv_char2[0] = AV55Emprcod ;
      GXv_char3[0] = AV86Emprnom ;
      GXv_char4[0] = AV87Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV85Station, GXv_char2, GXv_char3, GXv_char4) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.AV55Emprcod = GXv_char2[0] ;
      wcconsultadocumentoscomercialesdetalle_impl.this.AV86Emprnom = GXv_char3[0] ;
      wcconsultadocumentoscomercialesdetalle_impl.this.AV87Usurcod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Emprcod", AV55Emprcod);
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
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e201762( )
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
      if ( GXutil.strcmp(AV22Session.getValue("WCConsultaDocumentosComercialesDetalleColumnsSelector"), "") != 0 )
      {
         AV18ColumnsSelectorXML = AV22Session.getValue("WCConsultaDocumentosComercialesDetalleColumnsSelector") ;
         AV20ColumnsSelector.fromxml(AV18ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtAlbComLin_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComLin_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComLin_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbComNRef_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComNRef_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComNRef_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbComVDoc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComVDoc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComVDoc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbComPzas_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComPzas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComPzas_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbComMts_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComMts_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComMts_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbComArt_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComArt_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComArt_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbComArtD_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComArtD_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComArtD_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbComCol_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComCol_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComCol_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbComKgs_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComKgs_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComKgs_Visible), 5, 0), !bGXsfl_43_Refreshing);
      edtAlbComDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV20ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtAlbComDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtAlbComDsc_Visible), 5, 0), !bGXsfl_43_Refreshing);
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S182 ();
      if (returnInSub) return;
      AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV15FilterFullText ;
      AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV57TFAlbComLin ;
      AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV58TFAlbComLin_To ;
      AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV59TFAlbComNRef ;
      AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV60TFAlbComNRef_Sel ;
      AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV61TFAlbComVDoc ;
      AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV62TFAlbComVDoc_Sel ;
      AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV63TFAlbComPzas ;
      AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV64TFAlbComPzas_To ;
      AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV65TFAlbComMts ;
      AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV66TFAlbComMts_To ;
      AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV67TFAlbComArt ;
      AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV68TFAlbComArt_Sel ;
      AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV69TFAlbComArtD ;
      AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV70TFAlbComArtD_Sel ;
      AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV71TFAlbComCol ;
      AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV72TFAlbComCol_Sel ;
      AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV73TFAlbComKgs ;
      AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV74TFAlbComKgs_To ;
      AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV75TFAlbComDsc ;
      AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV76TFAlbComDsc_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e131762( )
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
         AV51PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV51PageToGo) ;
      }
   }

   public void e141762( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e151762( )
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
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComLin") == 0 )
         {
            AV57TFAlbComLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbComLin), 3, 0));
            AV58TFAlbComLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFAlbComLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbComLin_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComNRef") == 0 )
         {
            AV59TFAlbComNRef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFAlbComNRef", AV59TFAlbComNRef);
            AV60TFAlbComNRef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFAlbComNRef_Sel", AV60TFAlbComNRef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComVDoc") == 0 )
         {
            AV61TFAlbComVDoc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFAlbComVDoc", AV61TFAlbComVDoc);
            AV62TFAlbComVDoc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFAlbComVDoc_Sel", AV62TFAlbComVDoc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComPzas") == 0 )
         {
            AV63TFAlbComPzas = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFAlbComPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFAlbComPzas), 6, 0));
            AV64TFAlbComPzas_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFAlbComPzas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFAlbComPzas_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComMts") == 0 )
         {
            AV65TFAlbComMts = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbComMts", GXutil.ltrimstr( AV65TFAlbComMts, 10, 2));
            AV66TFAlbComMts_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFAlbComMts_To", GXutil.ltrimstr( AV66TFAlbComMts_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComArt") == 0 )
         {
            AV67TFAlbComArt = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFAlbComArt", AV67TFAlbComArt);
            AV68TFAlbComArt_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFAlbComArt_Sel", AV68TFAlbComArt_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComArtD") == 0 )
         {
            AV69TFAlbComArtD = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFAlbComArtD", AV69TFAlbComArtD);
            AV70TFAlbComArtD_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFAlbComArtD_Sel", AV70TFAlbComArtD_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComCol") == 0 )
         {
            AV71TFAlbComCol = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFAlbComCol", AV71TFAlbComCol);
            AV72TFAlbComCol_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFAlbComCol_Sel", AV72TFAlbComCol_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComKgs") == 0 )
         {
            AV73TFAlbComKgs = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFAlbComKgs", GXutil.ltrimstr( AV73TFAlbComKgs, 10, 2));
            AV74TFAlbComKgs_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFAlbComKgs_To", GXutil.ltrimstr( AV74TFAlbComKgs_To, 10, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbComDsc") == 0 )
         {
            AV75TFAlbComDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFAlbComDsc", AV75TFAlbComDsc);
            AV76TFAlbComDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFAlbComDsc_Sel", AV76TFAlbComDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e211762( )
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

   public void e161762( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV18ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV20ColumnsSelector.fromJSonString(AV18ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WCConsultaDocumentosComercialesDetalleColumnsSelector", ((GXutil.strcmp("", AV18ColumnsSelectorXML)==0) ? "" : AV20ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV20ColumnsSelector", AV20ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV23ManageFiltersData", AV23ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV10GridState", AV10GridState);
   }

   public void e121762( )
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
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("WCConsultaDocumentosComercialesDetalleFilters")),GXutil.URLEncode(GXutil.rtrim(AV109Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("WCConsultaDocumentosComercialesDetalleFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV25ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV25ManageFiltersExecutionStep", GXutil.str( AV25ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV24ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "WCConsultaDocumentosComercialesDetalleFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char1 = GXv_char4[0] ;
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
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV109Pgmname+"GridState", AV24ManageFiltersXml) ;
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

   public void e171762( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char4[0] = AV16ExcelFilename ;
      GXv_char3[0] = AV17ErrorMessage ;
      new app.wcconsultadocumentoscomercialesdetalleexport(remoteHandle, context).execute( GXv_char4, GXv_char3) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.AV16ExcelFilename = GXv_char4[0] ;
      wcconsultadocumentoscomercialesdetalle_impl.this.AV17ErrorMessage = GXv_char3[0] ;
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

   public void e181762( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.wcconsultadocumentoscomercialesdetalleexportcsv", new String[] {}, new String[] {}) );
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
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbComLin", "", "Linea", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbComNRef", "", "N/Ref", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbComVDoc", "", "V/Doc", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbComPzas", "", "Piezas", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbComMts", "", "Metros", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbComArt", "", "Codigo Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbComArtD", "", "Articulo", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbComCol", "", "Color", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbComKgs", "", "Kilos", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXv_SdtWWPColumnsSelector8[0] = AV20ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector8, "AlbComDsc", "", "Descripcion", true, "") ;
      AV20ColumnsSelector = GXv_SdtWWPColumnsSelector8[0] ;
      GXt_char1 = AV19UserCustomValue ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WCConsultaDocumentosComercialesDetalleColumnsSelector", GXv_char4) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char1 = GXv_char4[0] ;
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
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "WCConsultaDocumentosComercialesDetalleFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[0] ;
      AV23ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   }

   public void S192( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV15FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
      AV57TFAlbComLin = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbComLin), 3, 0));
      AV58TFAlbComLin_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFAlbComLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbComLin_To), 3, 0));
      AV59TFAlbComNRef = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFAlbComNRef", AV59TFAlbComNRef);
      AV60TFAlbComNRef_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFAlbComNRef_Sel", AV60TFAlbComNRef_Sel);
      AV61TFAlbComVDoc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFAlbComVDoc", AV61TFAlbComVDoc);
      AV62TFAlbComVDoc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFAlbComVDoc_Sel", AV62TFAlbComVDoc_Sel);
      AV63TFAlbComPzas = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFAlbComPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFAlbComPzas), 6, 0));
      AV64TFAlbComPzas_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFAlbComPzas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFAlbComPzas_To), 6, 0));
      AV65TFAlbComMts = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbComMts", GXutil.ltrimstr( AV65TFAlbComMts, 10, 2));
      AV66TFAlbComMts_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFAlbComMts_To", GXutil.ltrimstr( AV66TFAlbComMts_To, 10, 2));
      AV67TFAlbComArt = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFAlbComArt", AV67TFAlbComArt);
      AV68TFAlbComArt_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFAlbComArt_Sel", AV68TFAlbComArt_Sel);
      AV69TFAlbComArtD = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFAlbComArtD", AV69TFAlbComArtD);
      AV70TFAlbComArtD_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFAlbComArtD_Sel", AV70TFAlbComArtD_Sel);
      AV71TFAlbComCol = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFAlbComCol", AV71TFAlbComCol);
      AV72TFAlbComCol_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFAlbComCol_Sel", AV72TFAlbComCol_Sel);
      AV73TFAlbComKgs = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFAlbComKgs", GXutil.ltrimstr( AV73TFAlbComKgs, 10, 2));
      AV74TFAlbComKgs_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFAlbComKgs_To", GXutil.ltrimstr( AV74TFAlbComKgs_To, 10, 2));
      AV75TFAlbComDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFAlbComDsc", AV75TFAlbComDsc);
      AV76TFAlbComDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFAlbComDsc_Sel", AV76TFAlbComDsc_Sel);
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
      if ( GXutil.strcmp(AV22Session.getValue(AV109Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV109Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV22Session.getValue(AV109Pgmname+"GridState"), null, null);
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
      AV110GXV1 = 1 ;
      while ( AV110GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV110GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV15FilterFullText = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV15FilterFullText", AV15FilterFullText);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMLIN") == 0 )
         {
            AV57TFAlbComLin = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFAlbComLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57TFAlbComLin), 3, 0));
            AV58TFAlbComLin_To = (short)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFAlbComLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV58TFAlbComLin_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMNREF") == 0 )
         {
            AV59TFAlbComNRef = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFAlbComNRef", AV59TFAlbComNRef);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMNREF_SEL") == 0 )
         {
            AV60TFAlbComNRef_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFAlbComNRef_Sel", AV60TFAlbComNRef_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMVDOC") == 0 )
         {
            AV61TFAlbComVDoc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFAlbComVDoc", AV61TFAlbComVDoc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMVDOC_SEL") == 0 )
         {
            AV62TFAlbComVDoc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFAlbComVDoc_Sel", AV62TFAlbComVDoc_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMPZAS") == 0 )
         {
            AV63TFAlbComPzas = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFAlbComPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV63TFAlbComPzas), 6, 0));
            AV64TFAlbComPzas_To = (int)(GXutil.lval( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFAlbComPzas_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV64TFAlbComPzas_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMMTS") == 0 )
         {
            AV65TFAlbComMts = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV65TFAlbComMts", GXutil.ltrimstr( AV65TFAlbComMts, 10, 2));
            AV66TFAlbComMts_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFAlbComMts_To", GXutil.ltrimstr( AV66TFAlbComMts_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMART") == 0 )
         {
            AV67TFAlbComArt = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFAlbComArt", AV67TFAlbComArt);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMART_SEL") == 0 )
         {
            AV68TFAlbComArt_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFAlbComArt_Sel", AV68TFAlbComArt_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMARTD") == 0 )
         {
            AV69TFAlbComArtD = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFAlbComArtD", AV69TFAlbComArtD);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMARTD_SEL") == 0 )
         {
            AV70TFAlbComArtD_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFAlbComArtD_Sel", AV70TFAlbComArtD_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOL") == 0 )
         {
            AV71TFAlbComCol = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV71TFAlbComCol", AV71TFAlbComCol);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMCOL_SEL") == 0 )
         {
            AV72TFAlbComCol_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFAlbComCol_Sel", AV72TFAlbComCol_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMKGS") == 0 )
         {
            AV73TFAlbComKgs = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFAlbComKgs", GXutil.ltrimstr( AV73TFAlbComKgs, 10, 2));
            AV74TFAlbComKgs_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFAlbComKgs_To", GXutil.ltrimstr( AV74TFAlbComKgs_To, 10, 2));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC") == 0 )
         {
            AV75TFAlbComDsc = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFAlbComDsc", AV75TFAlbComDsc);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBCOMDSC_SEL") == 0 )
         {
            AV76TFAlbComDsc_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76TFAlbComDsc_Sel", AV76TFAlbComDsc_Sel);
         }
         AV110GXV1 = (int)(AV110GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFAlbComNRef_Sel)==0), AV60TFAlbComNRef_Sel, GXv_char4) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFAlbComVDoc_Sel)==0), AV62TFAlbComVDoc_Sel, GXv_char3) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char13 = "" ;
      GXv_char2[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFAlbComArt_Sel)==0), AV68TFAlbComArt_Sel, GXv_char2) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char13 = GXv_char2[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV70TFAlbComArtD_Sel)==0), AV70TFAlbComArtD_Sel, GXv_char15) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV72TFAlbComCol_Sel)==0), AV72TFAlbComCol_Sel, GXv_char17) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV76TFAlbComDsc_Sel)==0), AV76TFAlbComDsc_Sel, GXv_char19) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char18 = GXv_char19[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char12+"|||"+GXt_char13+"|"+GXt_char14+"|"+GXt_char16+"||"+GXt_char18 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFAlbComNRef)==0), AV59TFAlbComNRef, GXv_char19) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char16 = "" ;
      GXv_char17[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFAlbComVDoc)==0), AV61TFAlbComVDoc, GXv_char17) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char16 = GXv_char17[0] ;
      GXt_char14 = "" ;
      GXv_char15[0] = GXt_char14 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFAlbComArt)==0), AV67TFAlbComArt, GXv_char15) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char14 = GXv_char15[0] ;
      GXt_char13 = "" ;
      GXv_char4[0] = GXt_char13 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFAlbComArtD)==0), AV69TFAlbComArtD, GXv_char4) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char13 = GXv_char4[0] ;
      GXt_char12 = "" ;
      GXv_char3[0] = GXt_char12 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV71TFAlbComCol)==0), AV71TFAlbComCol, GXv_char3) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char12 = GXv_char3[0] ;
      GXt_char1 = "" ;
      GXv_char2[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV75TFAlbComDsc)==0), AV75TFAlbComDsc, GXv_char2) ;
      wcconsultadocumentoscomercialesdetalle_impl.this.GXt_char1 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV57TFAlbComLin) ? "" : GXutil.str( AV57TFAlbComLin, 3, 0))+"|"+GXt_char18+"|"+GXt_char16+"|"+((0==AV63TFAlbComPzas) ? "" : GXutil.str( AV63TFAlbComPzas, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFAlbComMts)==0) ? "" : GXutil.str( AV65TFAlbComMts, 10, 2))+"|"+GXt_char14+"|"+GXt_char13+"|"+GXt_char12+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFAlbComKgs)==0) ? "" : GXutil.str( AV73TFAlbComKgs, 10, 2))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV58TFAlbComLin_To) ? "" : GXutil.str( AV58TFAlbComLin_To, 3, 0))+"|||"+((0==AV64TFAlbComPzas_To) ? "" : GXutil.str( AV64TFAlbComPzas_To, 6, 0))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbComMts_To)==0) ? "" : GXutil.str( AV66TFAlbComMts_To, 10, 2))+"||||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFAlbComKgs_To)==0) ? "" : GXutil.str( AV74TFAlbComKgs_To, 10, 2))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV22Session.getValue(AV109Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV12OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV13OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV15FilterFullText)==0), (short)(0), AV15FilterFullText, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFALBCOMLIN", "", !((0==AV57TFAlbComLin)&&(0==AV58TFAlbComLin_To)), (short)(0), GXutil.trim( GXutil.str( AV57TFAlbComLin, 3, 0)), GXutil.trim( GXutil.str( AV58TFAlbComLin_To, 3, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFALBCOMNREF", "", !(GXutil.strcmp("", AV59TFAlbComNRef)==0), (short)(0), AV59TFAlbComNRef, "", !(GXutil.strcmp("", AV60TFAlbComNRef_Sel)==0), AV60TFAlbComNRef_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFALBCOMVDOC", "", !(GXutil.strcmp("", AV61TFAlbComVDoc)==0), (short)(0), AV61TFAlbComVDoc, "", !(GXutil.strcmp("", AV62TFAlbComVDoc_Sel)==0), AV62TFAlbComVDoc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFALBCOMPZAS", "", !((0==AV63TFAlbComPzas)&&(0==AV64TFAlbComPzas_To)), (short)(0), GXutil.trim( GXutil.str( AV63TFAlbComPzas, 6, 0)), GXutil.trim( GXutil.str( AV64TFAlbComPzas_To, 6, 0))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFALBCOMMTS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV65TFAlbComMts)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFAlbComMts_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV65TFAlbComMts, 10, 2)), GXutil.trim( GXutil.str( AV66TFAlbComMts_To, 10, 2))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFALBCOMART", "", !(GXutil.strcmp("", AV67TFAlbComArt)==0), (short)(0), AV67TFAlbComArt, "", !(GXutil.strcmp("", AV68TFAlbComArt_Sel)==0), AV68TFAlbComArt_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFALBCOMARTD", "", !(GXutil.strcmp("", AV69TFAlbComArtD)==0), (short)(0), AV69TFAlbComArtD, "", !(GXutil.strcmp("", AV70TFAlbComArtD_Sel)==0), AV70TFAlbComArtD_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFALBCOMCOL", "", !(GXutil.strcmp("", AV71TFAlbComCol)==0), (short)(0), AV71TFAlbComCol, "", !(GXutil.strcmp("", AV72TFAlbComCol_Sel)==0), AV72TFAlbComCol_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFALBCOMKGS", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFAlbComKgs)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFAlbComKgs_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV73TFAlbComKgs, 10, 2)), GXutil.trim( GXutil.str( AV74TFAlbComKgs_To, 10, 2))) ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFALBCOMDSC", "", !(GXutil.strcmp("", AV75TFAlbComDsc)==0), (short)(0), AV75TFAlbComDsc, "", !(GXutil.strcmp("", AV76TFAlbComDsc_Sel)==0), AV76TFAlbComDsc_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState20[0] ;
      if ( ! (GXutil.strcmp("", AV55Emprcod)==0) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV55Emprcod );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      if ( ! (0==AV56AlbComCod) )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ALBCOMCOD" );
         AV11GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV56AlbComCod, 8, 0) );
         AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV11GridStateFilterValue, 0);
      }
      AV10GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV10GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV109Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV109Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "DocumentoComercialv01" );
      AV22Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S172( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV77TotAlbComPzas = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TotAlbComPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TotAlbComPzas), 18, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMPZAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77TotAlbComPzas), "ZZZZZ9")));
      AV79TotAlbComMts = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TotAlbComMts", GXutil.ltrimstr( AV79TotAlbComMts, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMMTS", getSecureSignedToken( sPrefix, localUtil.format( AV79TotAlbComMts, "ZZZZZZ9.99")));
      AV81TotAlbComKgs = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TotAlbComKgs", GXutil.ltrimstr( AV81TotAlbComKgs, 18, 2));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMKGS", getSecureSignedToken( sPrefix, localUtil.format( AV81TotAlbComKgs, "ZZZZZZ9.99")));
   }

   public void S182( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = AV15FilterFullText ;
      AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin = AV57TFAlbComLin ;
      AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to = AV58TFAlbComLin_To ;
      AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = AV59TFAlbComNRef ;
      AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = AV60TFAlbComNRef_Sel ;
      AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = AV61TFAlbComVDoc ;
      AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = AV62TFAlbComVDoc_Sel ;
      AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas = AV63TFAlbComPzas ;
      AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to = AV64TFAlbComPzas_To ;
      AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = AV65TFAlbComMts ;
      AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = AV66TFAlbComMts_To ;
      AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = AV67TFAlbComArt ;
      AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = AV68TFAlbComArt_Sel ;
      AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = AV69TFAlbComArtD ;
      AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = AV70TFAlbComArtD_Sel ;
      AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = AV71TFAlbComCol ;
      AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = AV72TFAlbComCol_Sel ;
      AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = AV73TFAlbComKgs ;
      AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = AV74TFAlbComKgs_To ;
      AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = AV75TFAlbComDsc ;
      AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = AV76TFAlbComDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                           Short.valueOf(AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) ,
                                           Short.valueOf(AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) ,
                                           AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                           AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                           AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                           AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                           Integer.valueOf(AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) ,
                                           Integer.valueOf(AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) ,
                                           AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                           AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                           AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                           AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                           AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                           AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                           AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                           AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                           AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                           AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                           AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                           AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                           Short.valueOf(A20AlbComLin) ,
                                           A13315AlbComNRef ,
                                           A13316AlbComVDoc ,
                                           Integer.valueOf(A13317AlbComPzas) ,
                                           A13318AlbComMts ,
                                           A13320AlbComArt ,
                                           A13321AlbComArtD ,
                                           A13322AlbComCol ,
                                           A13319AlbComKgs ,
                                           A15AlbComDsc ,
                                           AV55Emprcod ,
                                           Integer.valueOf(AV56AlbComCod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A14AlbComCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.DECIMAL,
                                           TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext), "%", "") ;
      lV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = GXutil.padr( GXutil.rtrim( AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref), 20, "%") ;
      lV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = GXutil.padr( GXutil.rtrim( AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc), 20, "%") ;
      lV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = GXutil.padr( GXutil.rtrim( AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart), 16, "%") ;
      lV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = GXutil.padr( GXutil.rtrim( AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd), 26, "%") ;
      lV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = GXutil.padr( GXutil.rtrim( AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol), 20, "%") ;
      lV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = GXutil.padr( GXutil.rtrim( AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc), 40, "%") ;
      /* Using cursor H01764 */
      pr_default.execute(2, new Object[] {AV55Emprcod, Integer.valueOf(AV56AlbComCod), lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext, Short.valueOf(AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin), Short.valueOf(AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to), lV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref, AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel, lV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc, AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel, Integer.valueOf(AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas), Integer.valueOf(AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to), AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts, AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to, lV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart, AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel, lV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd, AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel, lV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol, AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel, AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs, AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to, lV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc, AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel});
      nGXsfl_43_idx = 1 ;
      sGXsfl_43_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_43_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_432( ) ;
      GRID_nEOF = (byte)(0) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      while ( ( (pr_default.getStatus(2) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
      {
         A14AlbComCod = H01764_A14AlbComCod[0] ;
         A396EmprCod = H01764_A396EmprCod[0] ;
         A15AlbComDsc = H01764_A15AlbComDsc[0] ;
         A13319AlbComKgs = H01764_A13319AlbComKgs[0] ;
         A13322AlbComCol = H01764_A13322AlbComCol[0] ;
         A13321AlbComArtD = H01764_A13321AlbComArtD[0] ;
         A13320AlbComArt = H01764_A13320AlbComArt[0] ;
         A13318AlbComMts = H01764_A13318AlbComMts[0] ;
         A13317AlbComPzas = H01764_A13317AlbComPzas[0] ;
         A13316AlbComVDoc = H01764_A13316AlbComVDoc[0] ;
         A13315AlbComNRef = H01764_A13315AlbComNRef[0] ;
         A20AlbComLin = H01764_A20AlbComLin[0] ;
         AV77TotAlbComPzas = (long)(A13317AlbComPzas+AV77TotAlbComPzas) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV77TotAlbComPzas", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77TotAlbComPzas), 18, 0));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMPZAS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV77TotAlbComPzas), "ZZZZZ9")));
         AV79TotAlbComMts = A13318AlbComMts.add(AV79TotAlbComMts) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV79TotAlbComMts", GXutil.ltrimstr( AV79TotAlbComMts, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMMTS", getSecureSignedToken( sPrefix, localUtil.format( AV79TotAlbComMts, "ZZZZZZ9.99")));
         AV81TotAlbComKgs = A13319AlbComKgs.add(AV81TotAlbComKgs) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV81TotAlbComKgs", GXutil.ltrimstr( AV81TotAlbComKgs, 18, 2));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTOTALBCOMKGS", getSecureSignedToken( sPrefix, localUtil.format( AV81TotAlbComKgs, "ZZZZZZ9.99")));
         pr_default.readNext(2);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(2) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(2);
      AV78TotValueAlbComPzas = localUtil.format( DecimalUtil.doubleToDec(AV77TotAlbComPzas), "ZZZZZ9") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV78TotValueAlbComPzas", AV78TotValueAlbComPzas);
      AV80TotValueAlbComMts = localUtil.format( AV79TotAlbComMts, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV80TotValueAlbComMts", AV80TotValueAlbComMts);
      AV82TotValueAlbComKgs = localUtil.format( AV81TotAlbComKgs, "ZZZZZZ9.99") ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV82TotValueAlbComKgs", AV82TotValueAlbComKgs);
   }

   public void wb_table2_56_1762( boolean wbgen )
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbcompzas_Internalname, httpContext.getMessage( "Tot Value Alb Com Pzas", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 63,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbcompzas_Internalname, AV78TotValueAlbComPzas, GXutil.rtrim( localUtil.format( AV78TotValueAlbComPzas, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,63);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbcompzas_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbcompzas_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCConsultaDocumentosComercialesDetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbcommts_Internalname, httpContext.getMessage( "Tot Value Alb Com Mts", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbcommts_Internalname, AV80TotValueAlbComMts, GXutil.rtrim( localUtil.format( AV80TotValueAlbComMts, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,66);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbcommts_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbcommts_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCConsultaDocumentosComercialesDetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvaluealbcomkgs_Internalname, httpContext.getMessage( "Tot Value Alb Com Kgs", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 72,'" + sPrefix + "',false,'" + sGXsfl_43_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvaluealbcomkgs_Internalname, AV82TotValueAlbComKgs, GXutil.rtrim( localUtil.format( AV82TotValueAlbComKgs, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,72);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvaluealbcomkgs_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvaluealbcomkgs_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCConsultaDocumentosComercialesDetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_56_1762e( true) ;
      }
      else
      {
         wb_table2_56_1762e( false) ;
      }
   }

   public void wb_table1_25_1762( boolean wbgen )
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
         wb_table3_30_1762( true) ;
      }
      else
      {
         wb_table3_30_1762( false) ;
      }
      return  ;
   }

   public void wb_table3_30_1762e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_25_1762e( true) ;
      }
      else
      {
         wb_table1_25_1762e( false) ;
      }
   }

   public void wb_table3_30_1762( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV15FilterFullText, GXutil.rtrim( localUtil.format( AV15FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_WCConsultaDocumentosComercialesDetalle.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_30_1762e( true) ;
      }
      else
      {
         wb_table3_30_1762e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV55Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Emprcod", AV55Emprcod);
      AV56AlbComCod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56AlbComCod), 8, 0));
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
      pa1762( ) ;
      ws1762( ) ;
      we1762( ) ;
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
      sCtrlAV55Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV56AlbComCod = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1762( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcconsultadocumentoscomercialesdetalle", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1762( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV55Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Emprcod", AV55Emprcod);
         AV56AlbComCod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56AlbComCod), 8, 0));
      }
      wcpOAV55Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV55Emprcod") ;
      wcpOAV56AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV56AlbComCod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV55Emprcod, wcpOAV55Emprcod) != 0 ) || ( AV56AlbComCod != wcpOAV56AlbComCod ) ) )
      {
         setjustcreated();
      }
      wcpOAV55Emprcod = AV55Emprcod ;
      wcpOAV56AlbComCod = AV56AlbComCod ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV55Emprcod = httpContext.cgiGet( sPrefix+"AV55Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV55Emprcod) > 0 )
      {
         AV55Emprcod = httpContext.cgiGet( sCtrlAV55Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV55Emprcod", AV55Emprcod);
      }
      else
      {
         AV55Emprcod = httpContext.cgiGet( sPrefix+"AV55Emprcod_PARM") ;
      }
      sCtrlAV56AlbComCod = httpContext.cgiGet( sPrefix+"AV56AlbComCod_CTRL") ;
      if ( GXutil.len( sCtrlAV56AlbComCod) > 0 )
      {
         AV56AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV56AlbComCod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56AlbComCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56AlbComCod), 8, 0));
      }
      else
      {
         AV56AlbComCod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV56AlbComCod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1762( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1762( ) ;
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
      ws1762( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55Emprcod_PARM", GXutil.rtrim( AV55Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV55Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV55Emprcod_CTRL", GXutil.rtrim( sCtrlAV55Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56AlbComCod_PARM", GXutil.ltrim( localUtil.ntoc( AV56AlbComCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV56AlbComCod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV56AlbComCod_CTRL", GXutil.rtrim( sCtrlAV56AlbComCod));
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
      we1762( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211682173", true, true);
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
      httpContext.AddJavascriptSource("wcconsultadocumentoscomercialesdetalle.js", "?20268211682173", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
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
      edtAlbComLin_Internalname = sPrefix+"ALBCOMLIN_"+sGXsfl_43_idx ;
      edtAlbComNRef_Internalname = sPrefix+"ALBCOMNREF_"+sGXsfl_43_idx ;
      edtAlbComVDoc_Internalname = sPrefix+"ALBCOMVDOC_"+sGXsfl_43_idx ;
      edtAlbComPzas_Internalname = sPrefix+"ALBCOMPZAS_"+sGXsfl_43_idx ;
      edtAlbComMts_Internalname = sPrefix+"ALBCOMMTS_"+sGXsfl_43_idx ;
      edtAlbComArt_Internalname = sPrefix+"ALBCOMART_"+sGXsfl_43_idx ;
      edtAlbComArtD_Internalname = sPrefix+"ALBCOMARTD_"+sGXsfl_43_idx ;
      edtAlbComCol_Internalname = sPrefix+"ALBCOMCOL_"+sGXsfl_43_idx ;
      edtAlbComKgs_Internalname = sPrefix+"ALBCOMKGS_"+sGXsfl_43_idx ;
      edtAlbComDsc_Internalname = sPrefix+"ALBCOMDSC_"+sGXsfl_43_idx ;
   }

   public void subsflControlProps_fel_432( )
   {
      edtAlbComLin_Internalname = sPrefix+"ALBCOMLIN_"+sGXsfl_43_fel_idx ;
      edtAlbComNRef_Internalname = sPrefix+"ALBCOMNREF_"+sGXsfl_43_fel_idx ;
      edtAlbComVDoc_Internalname = sPrefix+"ALBCOMVDOC_"+sGXsfl_43_fel_idx ;
      edtAlbComPzas_Internalname = sPrefix+"ALBCOMPZAS_"+sGXsfl_43_fel_idx ;
      edtAlbComMts_Internalname = sPrefix+"ALBCOMMTS_"+sGXsfl_43_fel_idx ;
      edtAlbComArt_Internalname = sPrefix+"ALBCOMART_"+sGXsfl_43_fel_idx ;
      edtAlbComArtD_Internalname = sPrefix+"ALBCOMARTD_"+sGXsfl_43_fel_idx ;
      edtAlbComCol_Internalname = sPrefix+"ALBCOMCOL_"+sGXsfl_43_fel_idx ;
      edtAlbComKgs_Internalname = sPrefix+"ALBCOMKGS_"+sGXsfl_43_fel_idx ;
      edtAlbComDsc_Internalname = sPrefix+"ALBCOMDSC_"+sGXsfl_43_fel_idx ;
   }

   public void sendrow_432( )
   {
      subsflControlProps_432( ) ;
      wb1760( ) ;
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
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbComLin_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComLin_Internalname,GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A20AlbComLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbComLin_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbComLin_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbComNRef_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComNRef_Internalname,GXutil.rtrim( A13315AlbComNRef),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbComNRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbComNRef_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbComVDoc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComVDoc_Internalname,GXutil.rtrim( A13316AlbComVDoc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbComVDoc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbComVDoc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbComPzas_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComPzas_Internalname,GXutil.ltrim( localUtil.ntoc( A13317AlbComPzas, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13317AlbComPzas), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbComPzas_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbComPzas_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbComMts_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComMts_Internalname,GXutil.ltrim( localUtil.ntoc( A13318AlbComMts, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13318AlbComMts, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbComMts_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbComMts_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbComArt_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComArt_Internalname,GXutil.rtrim( A13320AlbComArt),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbComArt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbComArt_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbComArtD_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComArtD_Internalname,GXutil.rtrim( A13321AlbComArtD),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbComArtD_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbComArtD_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbComCol_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComCol_Internalname,GXutil.rtrim( A13322AlbComCol),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbComCol_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbComCol_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(20),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtAlbComKgs_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComKgs_Internalname,GXutil.ltrim( localUtil.ntoc( A13319AlbComKgs, (byte)(10), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A13319AlbComKgs, "ZZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbComKgs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbComKgs_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtAlbComDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbComDsc_Internalname,GXutil.rtrim( A15AlbComDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtAlbComDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtAlbComDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(40),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(43),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1762( ) ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComLin_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Linea", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComNRef_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N/Ref", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComVDoc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "V/Doc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComPzas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComMts_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Metros", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComArt_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Codigo Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComArtD_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Articulo", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComCol_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Color", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComKgs_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Kilos", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtAlbComDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A20AlbComLin, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComLin_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13315AlbComNRef));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComNRef_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13316AlbComVDoc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComVDoc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13317AlbComPzas, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComPzas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13318AlbComMts, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComMts_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13320AlbComArt));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComArt_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13321AlbComArtD));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComArtD_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13322AlbComCol));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComCol_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13319AlbComKgs, (byte)(10), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComKgs_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A15AlbComDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtAlbComDsc_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportreport_Internalname = sPrefix+"BTNEXPORTREPORT" ;
      bttBtnexport_Internalname = sPrefix+"BTNEXPORT" ;
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtAlbComLin_Internalname = sPrefix+"ALBCOMLIN" ;
      edtAlbComNRef_Internalname = sPrefix+"ALBCOMNREF" ;
      edtAlbComVDoc_Internalname = sPrefix+"ALBCOMVDOC" ;
      edtAlbComPzas_Internalname = sPrefix+"ALBCOMPZAS" ;
      edtAlbComMts_Internalname = sPrefix+"ALBCOMMTS" ;
      edtAlbComArt_Internalname = sPrefix+"ALBCOMART" ;
      edtAlbComArtD_Internalname = sPrefix+"ALBCOMARTD" ;
      edtAlbComCol_Internalname = sPrefix+"ALBCOMCOL" ;
      edtAlbComKgs_Internalname = sPrefix+"ALBCOMKGS" ;
      edtAlbComDsc_Internalname = sPrefix+"ALBCOMDSC" ;
      edtavTotvaluealbcompzas_Internalname = sPrefix+"vTOTVALUEALBCOMPZAS" ;
      edtavTotvaluealbcommts_Internalname = sPrefix+"vTOTVALUEALBCOMMTS" ;
      edtavTotvaluealbcomkgs_Internalname = sPrefix+"vTOTVALUEALBCOMKGS" ;
      tblGridtabletotalizer_Internalname = sPrefix+"GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
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
      edtAlbComDsc_Jsonclick = "" ;
      edtAlbComKgs_Jsonclick = "" ;
      edtAlbComCol_Jsonclick = "" ;
      edtAlbComArtD_Jsonclick = "" ;
      edtAlbComArt_Jsonclick = "" ;
      edtAlbComMts_Jsonclick = "" ;
      edtAlbComPzas_Jsonclick = "" ;
      edtAlbComVDoc_Jsonclick = "" ;
      edtAlbComNRef_Jsonclick = "" ;
      edtAlbComLin_Jsonclick = "" ;
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtavTotvaluealbcomkgs_Jsonclick = "" ;
      edtavTotvaluealbcomkgs_Enabled = 1 ;
      edtavTotvaluealbcommts_Jsonclick = "" ;
      edtavTotvaluealbcommts_Enabled = 1 ;
      edtavTotvaluealbcompzas_Jsonclick = "" ;
      edtavTotvaluealbcompzas_Enabled = 1 ;
      edtAlbComDsc_Visible = -1 ;
      edtAlbComKgs_Visible = -1 ;
      edtAlbComCol_Visible = -1 ;
      edtAlbComArtD_Visible = -1 ;
      edtAlbComArt_Visible = -1 ;
      edtAlbComMts_Visible = -1 ;
      edtAlbComPzas_Visible = -1 ;
      edtAlbComVDoc_Visible = -1 ;
      edtAlbComNRef_Visible = -1 ;
      edtAlbComLin_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
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
      Ddo_grid_Datalistproc = "WCConsultaDocumentosComercialesDetalleGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|||Dynamic|Dynamic|Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|||T|T|T||T" ;
      Ddo_grid_Filterisrange = "T|||T|T||||T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Numeric|Character|Character|Character|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7|8|9|10" ;
      Ddo_grid_Columnids = "0:AlbComLin|1:AlbComNRef|2:AlbComVDoc|3:AlbComPzas|4:AlbComMts|5:AlbComArt|6:AlbComArtD|7:AlbComCol|8:AlbComKgs|9:AlbComDsc" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV57TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV58TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV59TFAlbComNRef',fld:'vTFALBCOMNREF',pic:''},{av:'AV60TFAlbComNRef_Sel',fld:'vTFALBCOMNREF_SEL',pic:''},{av:'AV61TFAlbComVDoc',fld:'vTFALBCOMVDOC',pic:''},{av:'AV62TFAlbComVDoc_Sel',fld:'vTFALBCOMVDOC_SEL',pic:''},{av:'AV63TFAlbComPzas',fld:'vTFALBCOMPZAS',pic:'ZZZZZ9'},{av:'AV64TFAlbComPzas_To',fld:'vTFALBCOMPZAS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbComMts',fld:'vTFALBCOMMTS',pic:'ZZZZZZ9.99'},{av:'AV66TFAlbComMts_To',fld:'vTFALBCOMMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV67TFAlbComArt',fld:'vTFALBCOMART',pic:''},{av:'AV68TFAlbComArt_Sel',fld:'vTFALBCOMART_SEL',pic:''},{av:'AV69TFAlbComArtD',fld:'vTFALBCOMARTD',pic:''},{av:'AV70TFAlbComArtD_Sel',fld:'vTFALBCOMARTD_SEL',pic:''},{av:'AV71TFAlbComCol',fld:'vTFALBCOMCOL',pic:''},{av:'AV72TFAlbComCol_Sel',fld:'vTFALBCOMCOL_SEL',pic:''},{av:'AV73TFAlbComKgs',fld:'vTFALBCOMKGS',pic:'ZZZZZZ9.99'},{av:'AV74TFAlbComKgs_To',fld:'vTFALBCOMKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV75TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV76TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77TotAlbComPzas',fld:'vTOTALBCOMPZAS',pic:'ZZZZZ9',hsh:true},{av:'AV79TotAlbComMts',fld:'vTOTALBCOMMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81TotAlbComKgs',fld:'vTOTALBCOMKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A13317AlbComPzas',fld:'ALBCOMPZAS',pic:'ZZZZZ9'},{av:'A13318AlbComMts',fld:'ALBCOMMTS',pic:'ZZZZZZ9.99'},{av:'A13319AlbComKgs',fld:'ALBCOMKGS',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbComLin_Visible',ctrl:'ALBCOMLIN',prop:'Visible'},{av:'edtAlbComNRef_Visible',ctrl:'ALBCOMNREF',prop:'Visible'},{av:'edtAlbComVDoc_Visible',ctrl:'ALBCOMVDOC',prop:'Visible'},{av:'edtAlbComPzas_Visible',ctrl:'ALBCOMPZAS',prop:'Visible'},{av:'edtAlbComMts_Visible',ctrl:'ALBCOMMTS',prop:'Visible'},{av:'edtAlbComArt_Visible',ctrl:'ALBCOMART',prop:'Visible'},{av:'edtAlbComArtD_Visible',ctrl:'ALBCOMARTD',prop:'Visible'},{av:'edtAlbComCol_Visible',ctrl:'ALBCOMCOL',prop:'Visible'},{av:'edtAlbComKgs_Visible',ctrl:'ALBCOMKGS',prop:'Visible'},{av:'edtAlbComDsc_Visible',ctrl:'ALBCOMDSC',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV77TotAlbComPzas',fld:'vTOTALBCOMPZAS',pic:'ZZZZZ9',hsh:true},{av:'AV79TotAlbComMts',fld:'vTOTALBCOMMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81TotAlbComKgs',fld:'vTOTALBCOMKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV78TotValueAlbComPzas',fld:'vTOTVALUEALBCOMPZAS',pic:''},{av:'AV80TotValueAlbComMts',fld:'vTOTVALUEALBCOMMTS',pic:''},{av:'AV82TotValueAlbComKgs',fld:'vTOTVALUEALBCOMKGS',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e131762',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV57TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV58TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV59TFAlbComNRef',fld:'vTFALBCOMNREF',pic:''},{av:'AV60TFAlbComNRef_Sel',fld:'vTFALBCOMNREF_SEL',pic:''},{av:'AV61TFAlbComVDoc',fld:'vTFALBCOMVDOC',pic:''},{av:'AV62TFAlbComVDoc_Sel',fld:'vTFALBCOMVDOC_SEL',pic:''},{av:'AV63TFAlbComPzas',fld:'vTFALBCOMPZAS',pic:'ZZZZZ9'},{av:'AV64TFAlbComPzas_To',fld:'vTFALBCOMPZAS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbComMts',fld:'vTFALBCOMMTS',pic:'ZZZZZZ9.99'},{av:'AV66TFAlbComMts_To',fld:'vTFALBCOMMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV67TFAlbComArt',fld:'vTFALBCOMART',pic:''},{av:'AV68TFAlbComArt_Sel',fld:'vTFALBCOMART_SEL',pic:''},{av:'AV69TFAlbComArtD',fld:'vTFALBCOMARTD',pic:''},{av:'AV70TFAlbComArtD_Sel',fld:'vTFALBCOMARTD_SEL',pic:''},{av:'AV71TFAlbComCol',fld:'vTFALBCOMCOL',pic:''},{av:'AV72TFAlbComCol_Sel',fld:'vTFALBCOMCOL_SEL',pic:''},{av:'AV73TFAlbComKgs',fld:'vTFALBCOMKGS',pic:'ZZZZZZ9.99'},{av:'AV74TFAlbComKgs_To',fld:'vTFALBCOMKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV75TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV76TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77TotAlbComPzas',fld:'vTOTALBCOMPZAS',pic:'ZZZZZ9',hsh:true},{av:'AV79TotAlbComMts',fld:'vTOTALBCOMMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81TotAlbComKgs',fld:'vTOTALBCOMKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e141762',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV57TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV58TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV59TFAlbComNRef',fld:'vTFALBCOMNREF',pic:''},{av:'AV60TFAlbComNRef_Sel',fld:'vTFALBCOMNREF_SEL',pic:''},{av:'AV61TFAlbComVDoc',fld:'vTFALBCOMVDOC',pic:''},{av:'AV62TFAlbComVDoc_Sel',fld:'vTFALBCOMVDOC_SEL',pic:''},{av:'AV63TFAlbComPzas',fld:'vTFALBCOMPZAS',pic:'ZZZZZ9'},{av:'AV64TFAlbComPzas_To',fld:'vTFALBCOMPZAS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbComMts',fld:'vTFALBCOMMTS',pic:'ZZZZZZ9.99'},{av:'AV66TFAlbComMts_To',fld:'vTFALBCOMMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV67TFAlbComArt',fld:'vTFALBCOMART',pic:''},{av:'AV68TFAlbComArt_Sel',fld:'vTFALBCOMART_SEL',pic:''},{av:'AV69TFAlbComArtD',fld:'vTFALBCOMARTD',pic:''},{av:'AV70TFAlbComArtD_Sel',fld:'vTFALBCOMARTD_SEL',pic:''},{av:'AV71TFAlbComCol',fld:'vTFALBCOMCOL',pic:''},{av:'AV72TFAlbComCol_Sel',fld:'vTFALBCOMCOL_SEL',pic:''},{av:'AV73TFAlbComKgs',fld:'vTFALBCOMKGS',pic:'ZZZZZZ9.99'},{av:'AV74TFAlbComKgs_To',fld:'vTFALBCOMKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV75TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV76TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77TotAlbComPzas',fld:'vTOTALBCOMPZAS',pic:'ZZZZZ9',hsh:true},{av:'AV79TotAlbComMts',fld:'vTOTALBCOMMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81TotAlbComKgs',fld:'vTOTALBCOMKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e151762',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV57TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV58TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV59TFAlbComNRef',fld:'vTFALBCOMNREF',pic:''},{av:'AV60TFAlbComNRef_Sel',fld:'vTFALBCOMNREF_SEL',pic:''},{av:'AV61TFAlbComVDoc',fld:'vTFALBCOMVDOC',pic:''},{av:'AV62TFAlbComVDoc_Sel',fld:'vTFALBCOMVDOC_SEL',pic:''},{av:'AV63TFAlbComPzas',fld:'vTFALBCOMPZAS',pic:'ZZZZZ9'},{av:'AV64TFAlbComPzas_To',fld:'vTFALBCOMPZAS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbComMts',fld:'vTFALBCOMMTS',pic:'ZZZZZZ9.99'},{av:'AV66TFAlbComMts_To',fld:'vTFALBCOMMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV67TFAlbComArt',fld:'vTFALBCOMART',pic:''},{av:'AV68TFAlbComArt_Sel',fld:'vTFALBCOMART_SEL',pic:''},{av:'AV69TFAlbComArtD',fld:'vTFALBCOMARTD',pic:''},{av:'AV70TFAlbComArtD_Sel',fld:'vTFALBCOMARTD_SEL',pic:''},{av:'AV71TFAlbComCol',fld:'vTFALBCOMCOL',pic:''},{av:'AV72TFAlbComCol_Sel',fld:'vTFALBCOMCOL_SEL',pic:''},{av:'AV73TFAlbComKgs',fld:'vTFALBCOMKGS',pic:'ZZZZZZ9.99'},{av:'AV74TFAlbComKgs_To',fld:'vTFALBCOMKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV75TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV76TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77TotAlbComPzas',fld:'vTOTALBCOMPZAS',pic:'ZZZZZ9',hsh:true},{av:'AV79TotAlbComMts',fld:'vTOTALBCOMMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81TotAlbComKgs',fld:'vTOTALBCOMKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV75TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV76TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV73TFAlbComKgs',fld:'vTFALBCOMKGS',pic:'ZZZZZZ9.99'},{av:'AV74TFAlbComKgs_To',fld:'vTFALBCOMKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV71TFAlbComCol',fld:'vTFALBCOMCOL',pic:''},{av:'AV72TFAlbComCol_Sel',fld:'vTFALBCOMCOL_SEL',pic:''},{av:'AV69TFAlbComArtD',fld:'vTFALBCOMARTD',pic:''},{av:'AV70TFAlbComArtD_Sel',fld:'vTFALBCOMARTD_SEL',pic:''},{av:'AV67TFAlbComArt',fld:'vTFALBCOMART',pic:''},{av:'AV68TFAlbComArt_Sel',fld:'vTFALBCOMART_SEL',pic:''},{av:'AV65TFAlbComMts',fld:'vTFALBCOMMTS',pic:'ZZZZZZ9.99'},{av:'AV66TFAlbComMts_To',fld:'vTFALBCOMMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV63TFAlbComPzas',fld:'vTFALBCOMPZAS',pic:'ZZZZZ9'},{av:'AV64TFAlbComPzas_To',fld:'vTFALBCOMPZAS_TO',pic:'ZZZZZ9'},{av:'AV61TFAlbComVDoc',fld:'vTFALBCOMVDOC',pic:''},{av:'AV62TFAlbComVDoc_Sel',fld:'vTFALBCOMVDOC_SEL',pic:''},{av:'AV59TFAlbComNRef',fld:'vTFALBCOMNREF',pic:''},{av:'AV60TFAlbComNRef_Sel',fld:'vTFALBCOMNREF_SEL',pic:''},{av:'AV57TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV58TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e211762',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e161762',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV57TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV58TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV59TFAlbComNRef',fld:'vTFALBCOMNREF',pic:''},{av:'AV60TFAlbComNRef_Sel',fld:'vTFALBCOMNREF_SEL',pic:''},{av:'AV61TFAlbComVDoc',fld:'vTFALBCOMVDOC',pic:''},{av:'AV62TFAlbComVDoc_Sel',fld:'vTFALBCOMVDOC_SEL',pic:''},{av:'AV63TFAlbComPzas',fld:'vTFALBCOMPZAS',pic:'ZZZZZ9'},{av:'AV64TFAlbComPzas_To',fld:'vTFALBCOMPZAS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbComMts',fld:'vTFALBCOMMTS',pic:'ZZZZZZ9.99'},{av:'AV66TFAlbComMts_To',fld:'vTFALBCOMMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV67TFAlbComArt',fld:'vTFALBCOMART',pic:''},{av:'AV68TFAlbComArt_Sel',fld:'vTFALBCOMART_SEL',pic:''},{av:'AV69TFAlbComArtD',fld:'vTFALBCOMARTD',pic:''},{av:'AV70TFAlbComArtD_Sel',fld:'vTFALBCOMARTD_SEL',pic:''},{av:'AV71TFAlbComCol',fld:'vTFALBCOMCOL',pic:''},{av:'AV72TFAlbComCol_Sel',fld:'vTFALBCOMCOL_SEL',pic:''},{av:'AV73TFAlbComKgs',fld:'vTFALBCOMKGS',pic:'ZZZZZZ9.99'},{av:'AV74TFAlbComKgs_To',fld:'vTFALBCOMKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV75TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV76TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77TotAlbComPzas',fld:'vTOTALBCOMPZAS',pic:'ZZZZZ9',hsh:true},{av:'AV79TotAlbComMts',fld:'vTOTALBCOMMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81TotAlbComKgs',fld:'vTOTALBCOMKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A13317AlbComPzas',fld:'ALBCOMPZAS',pic:'ZZZZZ9'},{av:'A13318AlbComMts',fld:'ALBCOMMTS',pic:'ZZZZZZ9.99'},{av:'A13319AlbComKgs',fld:'ALBCOMKGS',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtAlbComLin_Visible',ctrl:'ALBCOMLIN',prop:'Visible'},{av:'edtAlbComNRef_Visible',ctrl:'ALBCOMNREF',prop:'Visible'},{av:'edtAlbComVDoc_Visible',ctrl:'ALBCOMVDOC',prop:'Visible'},{av:'edtAlbComPzas_Visible',ctrl:'ALBCOMPZAS',prop:'Visible'},{av:'edtAlbComMts_Visible',ctrl:'ALBCOMMTS',prop:'Visible'},{av:'edtAlbComArt_Visible',ctrl:'ALBCOMART',prop:'Visible'},{av:'edtAlbComArtD_Visible',ctrl:'ALBCOMARTD',prop:'Visible'},{av:'edtAlbComCol_Visible',ctrl:'ALBCOMCOL',prop:'Visible'},{av:'edtAlbComKgs_Visible',ctrl:'ALBCOMKGS',prop:'Visible'},{av:'edtAlbComDsc_Visible',ctrl:'ALBCOMDSC',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV77TotAlbComPzas',fld:'vTOTALBCOMPZAS',pic:'ZZZZZ9',hsh:true},{av:'AV79TotAlbComMts',fld:'vTOTALBCOMMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81TotAlbComKgs',fld:'vTOTALBCOMKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV78TotValueAlbComPzas',fld:'vTOTVALUEALBCOMPZAS',pic:''},{av:'AV80TotValueAlbComMts',fld:'vTOTVALUEALBCOMMTS',pic:''},{av:'AV82TotValueAlbComKgs',fld:'vTOTVALUEALBCOMKGS',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e121762',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV55Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV56AlbComCod',fld:'vALBCOMCOD',pic:'ZZZZZZZ9'},{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV57TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV58TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV59TFAlbComNRef',fld:'vTFALBCOMNREF',pic:''},{av:'AV60TFAlbComNRef_Sel',fld:'vTFALBCOMNREF_SEL',pic:''},{av:'AV61TFAlbComVDoc',fld:'vTFALBCOMVDOC',pic:''},{av:'AV62TFAlbComVDoc_Sel',fld:'vTFALBCOMVDOC_SEL',pic:''},{av:'AV63TFAlbComPzas',fld:'vTFALBCOMPZAS',pic:'ZZZZZ9'},{av:'AV64TFAlbComPzas_To',fld:'vTFALBCOMPZAS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbComMts',fld:'vTFALBCOMMTS',pic:'ZZZZZZ9.99'},{av:'AV66TFAlbComMts_To',fld:'vTFALBCOMMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV67TFAlbComArt',fld:'vTFALBCOMART',pic:''},{av:'AV68TFAlbComArt_Sel',fld:'vTFALBCOMART_SEL',pic:''},{av:'AV69TFAlbComArtD',fld:'vTFALBCOMARTD',pic:''},{av:'AV70TFAlbComArtD_Sel',fld:'vTFALBCOMARTD_SEL',pic:''},{av:'AV71TFAlbComCol',fld:'vTFALBCOMCOL',pic:''},{av:'AV72TFAlbComCol_Sel',fld:'vTFALBCOMCOL_SEL',pic:''},{av:'AV73TFAlbComKgs',fld:'vTFALBCOMKGS',pic:'ZZZZZZ9.99'},{av:'AV74TFAlbComKgs_To',fld:'vTFALBCOMKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV75TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV76TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'AV109Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV77TotAlbComPzas',fld:'vTOTALBCOMPZAS',pic:'ZZZZZ9',hsh:true},{av:'AV79TotAlbComMts',fld:'vTOTALBCOMMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81TotAlbComKgs',fld:'vTOTALBCOMKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A14AlbComCod',fld:'ALBCOMCOD',pic:'ZZZZZZZ9'},{av:'A13317AlbComPzas',fld:'ALBCOMPZAS',pic:'ZZZZZ9'},{av:'A13318AlbComMts',fld:'ALBCOMMTS',pic:'ZZZZZZ9.99'},{av:'A13319AlbComKgs',fld:'ALBCOMKGS',pic:'ZZZZZZ9.99'}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV25ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV10GridState',fld:'vGRIDSTATE',pic:''},{av:'AV12OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV13OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV15FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV57TFAlbComLin',fld:'vTFALBCOMLIN',pic:'ZZ9'},{av:'AV58TFAlbComLin_To',fld:'vTFALBCOMLIN_TO',pic:'ZZ9'},{av:'AV59TFAlbComNRef',fld:'vTFALBCOMNREF',pic:''},{av:'AV60TFAlbComNRef_Sel',fld:'vTFALBCOMNREF_SEL',pic:''},{av:'AV61TFAlbComVDoc',fld:'vTFALBCOMVDOC',pic:''},{av:'AV62TFAlbComVDoc_Sel',fld:'vTFALBCOMVDOC_SEL',pic:''},{av:'AV63TFAlbComPzas',fld:'vTFALBCOMPZAS',pic:'ZZZZZ9'},{av:'AV64TFAlbComPzas_To',fld:'vTFALBCOMPZAS_TO',pic:'ZZZZZ9'},{av:'AV65TFAlbComMts',fld:'vTFALBCOMMTS',pic:'ZZZZZZ9.99'},{av:'AV66TFAlbComMts_To',fld:'vTFALBCOMMTS_TO',pic:'ZZZZZZ9.99'},{av:'AV67TFAlbComArt',fld:'vTFALBCOMART',pic:''},{av:'AV68TFAlbComArt_Sel',fld:'vTFALBCOMART_SEL',pic:''},{av:'AV69TFAlbComArtD',fld:'vTFALBCOMARTD',pic:''},{av:'AV70TFAlbComArtD_Sel',fld:'vTFALBCOMARTD_SEL',pic:''},{av:'AV71TFAlbComCol',fld:'vTFALBCOMCOL',pic:''},{av:'AV72TFAlbComCol_Sel',fld:'vTFALBCOMCOL_SEL',pic:''},{av:'AV73TFAlbComKgs',fld:'vTFALBCOMKGS',pic:'ZZZZZZ9.99'},{av:'AV74TFAlbComKgs_To',fld:'vTFALBCOMKGS_TO',pic:'ZZZZZZ9.99'},{av:'AV75TFAlbComDsc',fld:'vTFALBCOMDSC',pic:''},{av:'AV76TFAlbComDsc_Sel',fld:'vTFALBCOMDSC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV20ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtAlbComLin_Visible',ctrl:'ALBCOMLIN',prop:'Visible'},{av:'edtAlbComNRef_Visible',ctrl:'ALBCOMNREF',prop:'Visible'},{av:'edtAlbComVDoc_Visible',ctrl:'ALBCOMVDOC',prop:'Visible'},{av:'edtAlbComPzas_Visible',ctrl:'ALBCOMPZAS',prop:'Visible'},{av:'edtAlbComMts_Visible',ctrl:'ALBCOMMTS',prop:'Visible'},{av:'edtAlbComArt_Visible',ctrl:'ALBCOMART',prop:'Visible'},{av:'edtAlbComArtD_Visible',ctrl:'ALBCOMARTD',prop:'Visible'},{av:'edtAlbComCol_Visible',ctrl:'ALBCOMCOL',prop:'Visible'},{av:'edtAlbComKgs_Visible',ctrl:'ALBCOMKGS',prop:'Visible'},{av:'edtAlbComDsc_Visible',ctrl:'ALBCOMDSC',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV23ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV77TotAlbComPzas',fld:'vTOTALBCOMPZAS',pic:'ZZZZZ9',hsh:true},{av:'AV79TotAlbComMts',fld:'vTOTALBCOMMTS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV81TotAlbComKgs',fld:'vTOTALBCOMKGS',pic:'ZZZZZZ9.99',hsh:true},{av:'AV78TotValueAlbComPzas',fld:'vTOTVALUEALBCOMPZAS',pic:''},{av:'AV80TotValueAlbComMts',fld:'vTOTVALUEALBCOMMTS',pic:''},{av:'AV82TotValueAlbComKgs',fld:'vTOTVALUEALBCOMKGS',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e171762',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTREPORT'","{handler:'e111761',iparms:[]");
      setEventMetadata("'DOEXPORTREPORT'",",oparms:[{av:'Innewwindow1_Target',ctrl:'INNEWWINDOW1',prop:'Target'},{av:'Innewwindow1_Height',ctrl:'INNEWWINDOW1',prop:'Height'},{av:'Innewwindow1_Width',ctrl:'INNEWWINDOW1',prop:'Width'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e181762',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Albcomdsc',iparms:[]");
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
      wcpOAV55Emprcod = "" ;
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
      AV55Emprcod = "" ;
      AV15FilterFullText = "" ;
      AV20ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV59TFAlbComNRef = "" ;
      AV60TFAlbComNRef_Sel = "" ;
      AV61TFAlbComVDoc = "" ;
      AV62TFAlbComVDoc_Sel = "" ;
      AV65TFAlbComMts = DecimalUtil.ZERO ;
      AV66TFAlbComMts_To = DecimalUtil.ZERO ;
      AV67TFAlbComArt = "" ;
      AV68TFAlbComArt_Sel = "" ;
      AV69TFAlbComArtD = "" ;
      AV70TFAlbComArtD_Sel = "" ;
      AV71TFAlbComCol = "" ;
      AV72TFAlbComCol_Sel = "" ;
      AV73TFAlbComKgs = DecimalUtil.ZERO ;
      AV74TFAlbComKgs_To = DecimalUtil.ZERO ;
      AV75TFAlbComDsc = "" ;
      AV76TFAlbComDsc_Sel = "" ;
      AV109Pgmname = "" ;
      AV79TotAlbComMts = DecimalUtil.ZERO ;
      AV81TotAlbComKgs = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV23ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      bttBtnexportreport_Jsonclick = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucInnewwindow1 = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A13315AlbComNRef = "" ;
      A13316AlbComVDoc = "" ;
      A13318AlbComMts = DecimalUtil.ZERO ;
      A13320AlbComArt = "" ;
      A13321AlbComArtD = "" ;
      A13322AlbComCol = "" ;
      A13319AlbComKgs = DecimalUtil.ZERO ;
      A15AlbComDsc = "" ;
      scmdbuf = "" ;
      lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = "" ;
      lV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = "" ;
      lV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = "" ;
      lV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = "" ;
      lV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = "" ;
      lV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = "" ;
      lV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = "" ;
      AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext = "" ;
      AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel = "" ;
      AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref = "" ;
      AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel = "" ;
      AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc = "" ;
      AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts = DecimalUtil.ZERO ;
      AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to = DecimalUtil.ZERO ;
      AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel = "" ;
      AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart = "" ;
      AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel = "" ;
      AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd = "" ;
      AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel = "" ;
      AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol = "" ;
      AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs = DecimalUtil.ZERO ;
      AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to = DecimalUtil.ZERO ;
      AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel = "" ;
      AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc = "" ;
      H01762_A396EmprCod = new String[] {""} ;
      H01762_A14AlbComCod = new int[1] ;
      H01762_A15AlbComDsc = new String[] {""} ;
      H01762_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01762_A13322AlbComCol = new String[] {""} ;
      H01762_A13321AlbComArtD = new String[] {""} ;
      H01762_A13320AlbComArt = new String[] {""} ;
      H01762_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01762_A13317AlbComPzas = new int[1] ;
      H01762_A13316AlbComVDoc = new String[] {""} ;
      H01762_A13315AlbComNRef = new String[] {""} ;
      H01762_A20AlbComLin = new short[1] ;
      H01763_AGRID_nRecordCount = new long[1] ;
      AV78TotValueAlbComPzas = "" ;
      AV80TotValueAlbComMts = "" ;
      AV82TotValueAlbComKgs = "" ;
      AV85Station = "" ;
      AV86Emprnom = "" ;
      AV87Usurcod = "" ;
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
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char17 = new String[1] ;
      GXt_char14 = "" ;
      GXv_char15 = new String[1] ;
      GXt_char13 = "" ;
      GXv_char4 = new String[1] ;
      GXt_char12 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      H01764_A14AlbComCod = new int[1] ;
      H01764_A396EmprCod = new String[] {""} ;
      H01764_A15AlbComDsc = new String[] {""} ;
      H01764_A13319AlbComKgs = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01764_A13322AlbComCol = new String[] {""} ;
      H01764_A13321AlbComArtD = new String[] {""} ;
      H01764_A13320AlbComArt = new String[] {""} ;
      H01764_A13318AlbComMts = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01764_A13317AlbComPzas = new int[1] ;
      H01764_A13316AlbComVDoc = new String[] {""} ;
      H01764_A13315AlbComNRef = new String[] {""} ;
      H01764_A20AlbComLin = new short[1] ;
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV55Emprcod = "" ;
      sCtrlAV56AlbComCod = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcconsultadocumentoscomercialesdetalle__default(),
         new Object[] {
             new Object[] {
            H01762_A396EmprCod, H01762_A14AlbComCod, H01762_A15AlbComDsc, H01762_A13319AlbComKgs, H01762_A13322AlbComCol, H01762_A13321AlbComArtD, H01762_A13320AlbComArt, H01762_A13318AlbComMts, H01762_A13317AlbComPzas, H01762_A13316AlbComVDoc,
            H01762_A13315AlbComNRef, H01762_A20AlbComLin
            }
            , new Object[] {
            H01763_AGRID_nRecordCount
            }
            , new Object[] {
            H01764_A14AlbComCod, H01764_A396EmprCod, H01764_A15AlbComDsc, H01764_A13319AlbComKgs, H01764_A13322AlbComCol, H01764_A13321AlbComArtD, H01764_A13320AlbComArt, H01764_A13318AlbComMts, H01764_A13317AlbComPzas, H01764_A13316AlbComVDoc,
            H01764_A13315AlbComNRef, H01764_A20AlbComLin
            }
         }
      );
      AV109Pgmname = "WCConsultaDocumentosComercialesDetalle" ;
      /* GeneXus formulas. */
      AV109Pgmname = "WCConsultaDocumentosComercialesDetalle" ;
      Gx_err = (short)(0) ;
      edtavTotvaluealbcompzas_Enabled = 0 ;
      edtavTotvaluealbcommts_Enabled = 0 ;
      edtavTotvaluealbcomkgs_Enabled = 0 ;
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
   private short AV57TFAlbComLin ;
   private short AV58TFAlbComLin_To ;
   private short AV12OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short A20AlbComLin ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ;
   private short AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ;
   private int wcpOAV56AlbComCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_43 ;
   private int AV56AlbComCod ;
   private int nGXsfl_43_idx=1 ;
   private int AV63TFAlbComPzas ;
   private int AV64TFAlbComPzas_To ;
   private int A14AlbComCod ;
   private int Gridpaginationbar_Pagestoshow ;
   private int A13317AlbComPzas ;
   private int subGrid_Islastpage ;
   private int edtavTotvaluealbcompzas_Enabled ;
   private int edtavTotvaluealbcommts_Enabled ;
   private int edtavTotvaluealbcomkgs_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ;
   private int AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ;
   private int edtAlbComLin_Visible ;
   private int edtAlbComNRef_Visible ;
   private int edtAlbComVDoc_Visible ;
   private int edtAlbComPzas_Visible ;
   private int edtAlbComMts_Visible ;
   private int edtAlbComArt_Visible ;
   private int edtAlbComArtD_Visible ;
   private int edtAlbComCol_Visible ;
   private int edtAlbComKgs_Visible ;
   private int edtAlbComDsc_Visible ;
   private int AV51PageToGo ;
   private int AV110GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV77TotAlbComPzas ;
   private long AV52GridCurrentPage ;
   private long AV53GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV65TFAlbComMts ;
   private java.math.BigDecimal AV66TFAlbComMts_To ;
   private java.math.BigDecimal AV73TFAlbComKgs ;
   private java.math.BigDecimal AV74TFAlbComKgs_To ;
   private java.math.BigDecimal AV79TotAlbComMts ;
   private java.math.BigDecimal AV81TotAlbComKgs ;
   private java.math.BigDecimal A13318AlbComMts ;
   private java.math.BigDecimal A13319AlbComKgs ;
   private java.math.BigDecimal AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ;
   private java.math.BigDecimal AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ;
   private java.math.BigDecimal AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ;
   private java.math.BigDecimal AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ;
   private String wcpOAV55Emprcod ;
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
   private String AV55Emprcod ;
   private String sGXsfl_43_idx="0001" ;
   private String AV59TFAlbComNRef ;
   private String AV60TFAlbComNRef_Sel ;
   private String AV61TFAlbComVDoc ;
   private String AV62TFAlbComVDoc_Sel ;
   private String AV67TFAlbComArt ;
   private String AV68TFAlbComArt_Sel ;
   private String AV69TFAlbComArtD ;
   private String AV70TFAlbComArtD_Sel ;
   private String AV71TFAlbComCol ;
   private String AV72TFAlbComCol_Sel ;
   private String AV75TFAlbComDsc ;
   private String AV76TFAlbComDsc_Sel ;
   private String AV109Pgmname ;
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
   private String bttBtnexportreport_Internalname ;
   private String bttBtnexportreport_Jsonclick ;
   private String bttBtnexport_Internalname ;
   private String bttBtnexport_Jsonclick ;
   private String bttBtnexportcsv_Internalname ;
   private String bttBtnexportcsv_Jsonclick ;
   private String bttBtneditcolumns_Internalname ;
   private String bttBtneditcolumns_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
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
   private String edtAlbComLin_Internalname ;
   private String A13315AlbComNRef ;
   private String edtAlbComNRef_Internalname ;
   private String A13316AlbComVDoc ;
   private String edtAlbComVDoc_Internalname ;
   private String edtAlbComPzas_Internalname ;
   private String edtAlbComMts_Internalname ;
   private String A13320AlbComArt ;
   private String edtAlbComArt_Internalname ;
   private String A13321AlbComArtD ;
   private String edtAlbComArtD_Internalname ;
   private String A13322AlbComCol ;
   private String edtAlbComCol_Internalname ;
   private String edtAlbComKgs_Internalname ;
   private String A15AlbComDsc ;
   private String edtAlbComDsc_Internalname ;
   private String edtavTotvaluealbcompzas_Internalname ;
   private String edtavTotvaluealbcommts_Internalname ;
   private String edtavTotvaluealbcomkgs_Internalname ;
   private String scmdbuf ;
   private String lV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ;
   private String lV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ;
   private String lV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ;
   private String lV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ;
   private String lV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ;
   private String lV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ;
   private String AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ;
   private String AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ;
   private String AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ;
   private String AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ;
   private String AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ;
   private String AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ;
   private String AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ;
   private String AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ;
   private String AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ;
   private String AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ;
   private String AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ;
   private String AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ;
   private String AV85Station ;
   private String AV86Emprnom ;
   private String AV87Usurcod ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char16 ;
   private String GXv_char17[] ;
   private String GXt_char14 ;
   private String GXv_char15[] ;
   private String GXt_char13 ;
   private String GXv_char4[] ;
   private String GXt_char12 ;
   private String GXv_char3[] ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvaluealbcompzas_Jsonclick ;
   private String edtavTotvaluealbcommts_Jsonclick ;
   private String edtavTotvaluealbcomkgs_Jsonclick ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV55Emprcod ;
   private String sCtrlAV56AlbComCod ;
   private String sGXsfl_43_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtAlbComLin_Jsonclick ;
   private String edtAlbComNRef_Jsonclick ;
   private String edtAlbComVDoc_Jsonclick ;
   private String edtAlbComPzas_Jsonclick ;
   private String edtAlbComMts_Jsonclick ;
   private String edtAlbComArt_Jsonclick ;
   private String edtAlbComArtD_Jsonclick ;
   private String edtAlbComCol_Jsonclick ;
   private String edtAlbComKgs_Jsonclick ;
   private String edtAlbComDsc_Jsonclick ;
   private String subGrid_Header ;
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
   private String lV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ;
   private String AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ;
   private String AV78TotValueAlbComPzas ;
   private String AV80TotValueAlbComMts ;
   private String AV82TotValueAlbComKgs ;
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
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucInnewwindow1 ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private IDataStoreProvider pr_default ;
   private String[] H01762_A396EmprCod ;
   private int[] H01762_A14AlbComCod ;
   private String[] H01762_A15AlbComDsc ;
   private java.math.BigDecimal[] H01762_A13319AlbComKgs ;
   private String[] H01762_A13322AlbComCol ;
   private String[] H01762_A13321AlbComArtD ;
   private String[] H01762_A13320AlbComArt ;
   private java.math.BigDecimal[] H01762_A13318AlbComMts ;
   private int[] H01762_A13317AlbComPzas ;
   private String[] H01762_A13316AlbComVDoc ;
   private String[] H01762_A13315AlbComNRef ;
   private short[] H01762_A20AlbComLin ;
   private long[] H01763_AGRID_nRecordCount ;
   private int[] H01764_A14AlbComCod ;
   private String[] H01764_A396EmprCod ;
   private String[] H01764_A15AlbComDsc ;
   private java.math.BigDecimal[] H01764_A13319AlbComKgs ;
   private String[] H01764_A13322AlbComCol ;
   private String[] H01764_A13321AlbComArtD ;
   private String[] H01764_A13320AlbComArt ;
   private java.math.BigDecimal[] H01764_A13318AlbComMts ;
   private int[] H01764_A13317AlbComPzas ;
   private String[] H01764_A13316AlbComVDoc ;
   private String[] H01764_A13315AlbComNRef ;
   private short[] H01764_A20AlbComLin ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV23ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item10 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item11[] ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV20ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV21ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector8[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector9[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
}

final  class wcconsultadocumentoscomercialesdetalle__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01762( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV55Emprcod ,
                                          int AV56AlbComCod ,
                                          String A396EmprCod ,
                                          int A14AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[37];
      Object[] GXv_Object22 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " EmprCod, AlbComCod, AlbComDsc, AlbComKgs, AlbComCol, AlbComArtD, AlbComArt, AlbComMts, AlbComPzas, AlbComVDoc, AlbComNRef, AlbComLin" ;
      sFromString = " FROM TXPLALCOM" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
         GXv_int21[3] = (byte)(1) ;
         GXv_int21[4] = (byte)(1) ;
         GXv_int21[5] = (byte)(1) ;
         GXv_int21[6] = (byte)(1) ;
         GXv_int21[7] = (byte)(1) ;
         GXv_int21[8] = (byte)(1) ;
         GXv_int21[9] = (byte)(1) ;
         GXv_int21[10] = (byte)(1) ;
         GXv_int21[11] = (byte)(1) ;
      }
      if ( ! (0==AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (0==AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int21[17] = (byte)(1) ;
      }
      if ( ! (0==AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int21[18] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int21[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int21[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int21[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int21[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int21[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int21[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int21[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int21[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int21[31] = (byte)(1) ;
      }
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbComLin" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbComLin DESC" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbComNRef" ;
      }
      else if ( ( AV12OrderedBy == 2 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbComNRef DESC" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbComVDoc" ;
      }
      else if ( ( AV12OrderedBy == 3 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbComVDoc DESC" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbComPzas" ;
      }
      else if ( ( AV12OrderedBy == 4 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbComPzas DESC" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbComMts" ;
      }
      else if ( ( AV12OrderedBy == 5 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbComMts DESC" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbComArt" ;
      }
      else if ( ( AV12OrderedBy == 6 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbComArt DESC" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbComArtD" ;
      }
      else if ( ( AV12OrderedBy == 7 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbComArtD DESC" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbComCol" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbComCol DESC" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbComKgs" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbComKgs DESC" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         sOrderString += " ORDER BY AlbComDsc" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         sOrderString += " ORDER BY AlbComDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY EmprCod, AlbComCod, AlbComLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H01763( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          short AV12OrderedBy ,
                                          boolean AV13OrderedDsc ,
                                          String AV55Emprcod ,
                                          int AV56AlbComCod ,
                                          String A396EmprCod ,
                                          int A14AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[32];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM TXPLALCOM" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
         GXv_int23[3] = (byte)(1) ;
         GXv_int23[4] = (byte)(1) ;
         GXv_int23[5] = (byte)(1) ;
         GXv_int23[6] = (byte)(1) ;
         GXv_int23[7] = (byte)(1) ;
         GXv_int23[8] = (byte)(1) ;
         GXv_int23[9] = (byte)(1) ;
         GXv_int23[10] = (byte)(1) ;
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (0==AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (0==AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (0==AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int23[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int23[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int23[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int23[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int23[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int23[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int23[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int23[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int23[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV12OrderedBy == 1 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 1 ) && ( AV13OrderedDsc ) )
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
      else if ( ( AV12OrderedBy == 8 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 8 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 9 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ! AV13OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV12OrderedBy == 10 ) && ( AV13OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H01764( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext ,
                                          short AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin ,
                                          short AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to ,
                                          String AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel ,
                                          String AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref ,
                                          String AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel ,
                                          String AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc ,
                                          int AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas ,
                                          int AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to ,
                                          java.math.BigDecimal AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts ,
                                          java.math.BigDecimal AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to ,
                                          String AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel ,
                                          String AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart ,
                                          String AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel ,
                                          String AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd ,
                                          String AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel ,
                                          String AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol ,
                                          java.math.BigDecimal AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs ,
                                          java.math.BigDecimal AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to ,
                                          String AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel ,
                                          String AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc ,
                                          short A20AlbComLin ,
                                          String A13315AlbComNRef ,
                                          String A13316AlbComVDoc ,
                                          int A13317AlbComPzas ,
                                          java.math.BigDecimal A13318AlbComMts ,
                                          String A13320AlbComArt ,
                                          String A13321AlbComArtD ,
                                          String A13322AlbComCol ,
                                          java.math.BigDecimal A13319AlbComKgs ,
                                          String A15AlbComDsc ,
                                          String AV55Emprcod ,
                                          int AV56AlbComCod ,
                                          String A396EmprCod ,
                                          int A14AlbComCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[32];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT AlbComCod, EmprCod, AlbComDsc, AlbComKgs, AlbComCol, AlbComArtD, AlbComArt, AlbComMts, AlbComPzas, AlbComVDoc, AlbComNRef, AlbComLin FROM TXPLALCOM" ;
      addWhere(sWhereString, "(EmprCod = ? and AlbComCod = ?)");
      if ( ! (GXutil.strcmp("", AV88Wcconsultadocumentoscomercialesdetalleds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( SUBSTR(TO_CHAR(AlbComLin,'990'), 2) like '%' || ?) or ( UPPER(AlbComNRef) like '%' || UPPER(?)) or ( UPPER(AlbComVDoc) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComPzas,'999990'), 2) like '%' || ?) or ( SUBSTR(TO_CHAR(AlbComMts,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComArt) like '%' || UPPER(?)) or ( UPPER(AlbComArtD) like '%' || UPPER(?)) or ( UPPER(AlbComCol) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(AlbComKgs,'9999990.99'), 2) like '%' || ?) or ( UPPER(AlbComDsc) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int25[2] = (byte)(1) ;
         GXv_int25[3] = (byte)(1) ;
         GXv_int25[4] = (byte)(1) ;
         GXv_int25[5] = (byte)(1) ;
         GXv_int25[6] = (byte)(1) ;
         GXv_int25[7] = (byte)(1) ;
         GXv_int25[8] = (byte)(1) ;
         GXv_int25[9] = (byte)(1) ;
         GXv_int25[10] = (byte)(1) ;
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (0==AV89Wcconsultadocumentoscomercialesdetalleds_2_tfalbcomlin) )
      {
         addWhere(sWhereString, "(AlbComLin >= ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (0==AV90Wcconsultadocumentoscomercialesdetalleds_3_tfalbcomlin_to) )
      {
         addWhere(sWhereString, "(AlbComLin <= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) && ( ! (GXutil.strcmp("", AV91Wcconsultadocumentoscomercialesdetalleds_4_tfalbcomnref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComNRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Wcconsultadocumentoscomercialesdetalleds_5_tfalbcomnref_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComNRef = ?)");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) && ( ! (GXutil.strcmp("", AV93Wcconsultadocumentoscomercialesdetalleds_6_tfalbcomvdoc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComVDoc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV94Wcconsultadocumentoscomercialesdetalleds_7_tfalbcomvdoc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComVDoc = ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (0==AV95Wcconsultadocumentoscomercialesdetalleds_8_tfalbcompzas) )
      {
         addWhere(sWhereString, "(AlbComPzas >= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      if ( ! (0==AV96Wcconsultadocumentoscomercialesdetalleds_9_tfalbcompzas_to) )
      {
         addWhere(sWhereString, "(AlbComPzas <= ?)");
      }
      else
      {
         GXv_int25[19] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV97Wcconsultadocumentoscomercialesdetalleds_10_tfalbcommts)==0) )
      {
         addWhere(sWhereString, "(AlbComMts >= ?)");
      }
      else
      {
         GXv_int25[20] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV98Wcconsultadocumentoscomercialesdetalleds_11_tfalbcommts_to)==0) )
      {
         addWhere(sWhereString, "(AlbComMts <= ?)");
      }
      else
      {
         GXv_int25[21] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) && ( ! (GXutil.strcmp("", AV99Wcconsultadocumentoscomercialesdetalleds_12_tfalbcomart)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArt) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[22] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV100Wcconsultadocumentoscomercialesdetalleds_13_tfalbcomart_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArt = ?)");
      }
      else
      {
         GXv_int25[23] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) && ( ! (GXutil.strcmp("", AV101Wcconsultadocumentoscomercialesdetalleds_14_tfalbcomartd)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComArtD) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[24] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV102Wcconsultadocumentoscomercialesdetalleds_15_tfalbcomartd_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComArtD = ?)");
      }
      else
      {
         GXv_int25[25] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) && ( ! (GXutil.strcmp("", AV103Wcconsultadocumentoscomercialesdetalleds_16_tfalbcomcol)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComCol) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[26] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Wcconsultadocumentoscomercialesdetalleds_17_tfalbcomcol_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComCol = ?)");
      }
      else
      {
         GXv_int25[27] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV105Wcconsultadocumentoscomercialesdetalleds_18_tfalbcomkgs)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs >= ?)");
      }
      else
      {
         GXv_int25[28] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV106Wcconsultadocumentoscomercialesdetalleds_19_tfalbcomkgs_to)==0) )
      {
         addWhere(sWhereString, "(AlbComKgs <= ?)");
      }
      else
      {
         GXv_int25[29] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) && ( ! (GXutil.strcmp("", AV107Wcconsultadocumentoscomercialesdetalleds_20_tfalbcomdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(AlbComDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[30] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV108Wcconsultadocumentoscomercialesdetalleds_21_tfalbcomdsc_sel)==0) )
      {
         addWhere(sWhereString, "(AlbComDsc = ?)");
      }
      else
      {
         GXv_int25[31] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY EmprCod, AlbComCod" ;
      GXv_Object26[0] = scmdbuf ;
      GXv_Object26[1] = GXv_int25 ;
      return GXv_Object26 ;
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
                  return conditional_H01762(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() );
            case 1 :
                  return conditional_H01763(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , ((Number) dynConstraints[31]).shortValue() , ((Boolean) dynConstraints[32]).booleanValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() , (String)dynConstraints[35] , ((Number) dynConstraints[36]).intValue() );
            case 2 :
                  return conditional_H01764(context, remoteHandle, httpContext, (String)dynConstraints[0] , ((Number) dynConstraints[1]).shortValue() , ((Number) dynConstraints[2]).shortValue() , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (String)dynConstraints[6] , ((Number) dynConstraints[7]).intValue() , ((Number) dynConstraints[8]).intValue() , (java.math.BigDecimal)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (String)dynConstraints[11] , (String)dynConstraints[12] , (String)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (String)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , (String)dynConstraints[22] , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (java.math.BigDecimal)dynConstraints[25] , (String)dynConstraints[26] , (String)dynConstraints[27] , (String)dynConstraints[28] , (java.math.BigDecimal)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , (String)dynConstraints[33] , ((Number) dynConstraints[34]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01762", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01763", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01764", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 40);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 20);
               ((String[]) buf[5])[0] = rslt.getString(6, 26);
               ((String[]) buf[6])[0] = rslt.getString(7, 16);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,2);
               ((int[]) buf[8])[0] = rslt.getInt(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 20);
               ((String[]) buf[10])[0] = rslt.getString(11, 20);
               ((short[]) buf[11])[0] = rslt.getShort(12);
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
                  stmt.setString(sIdx, (String)parms[37], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[44], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[45], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[46], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[47], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[48], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[49]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[50]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[51], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[52], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[53], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[55]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[56]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[57], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[58], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[60], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[61], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[64], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[65], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[66], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[67], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[68], 40);
               }
               if ( ((Number) parms[32]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[69]).intValue());
               }
               if ( ((Number) parms[33]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[70]).intValue());
               }
               if ( ((Number) parms[34]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[71]).intValue());
               }
               if ( ((Number) parms[35]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[72]).intValue());
               }
               if ( ((Number) parms[36]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[73]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
            case 2 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[34], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[35], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[36], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[37], 100);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[38], 100);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[39], 100);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[40], 100);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[41], 100);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[42], 100);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[43], 100);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[44]).shortValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[45]).shortValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[46], 20);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[47], 20);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[48], 20);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[49], 20);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[50]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[51]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[52], 2);
               }
               if ( ((Number) parms[21]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[53], 2);
               }
               if ( ((Number) parms[22]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[54], 16);
               }
               if ( ((Number) parms[23]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[55], 16);
               }
               if ( ((Number) parms[24]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[56], 26);
               }
               if ( ((Number) parms[25]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[57], 26);
               }
               if ( ((Number) parms[26]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[58], 20);
               }
               if ( ((Number) parms[27]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[59], 20);
               }
               if ( ((Number) parms[28]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[60], 2);
               }
               if ( ((Number) parms[29]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[61], 2);
               }
               if ( ((Number) parms[30]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[62], 40);
               }
               if ( ((Number) parms[31]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[63], 40);
               }
               return;
      }
   }

}

