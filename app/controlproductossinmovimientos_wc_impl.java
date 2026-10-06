package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlproductossinmovimientos_wc_impl extends GXWebComponent
{
   public controlproductossinmovimientos_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlproductossinmovimientos_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlproductossinmovimientos_wc_impl.class ));
   }

   public controlproductossinmovimientos_wc_impl( int remoteHandle ,
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
               AV6Prdnum = httpContext.GetPar( "Prdnum") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
               AV7Prdnum_to = httpContext.GetPar( "Prdnum_to") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Prdnum_to", AV7Prdnum_to);
               AV8PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PrvNum), 6, 0));
               AV9Prvnum_to = (int)(GXutil.lval( httpContext.GetPar( "Prvnum_to"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Prvnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Prvnum_to), 6, 0));
               AV10Dias = (short)(GXutil.lval( httpContext.GetPar( "Dias"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Dias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Dias), 4, 0));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,AV6Prdnum,AV7Prdnum_to,Integer.valueOf(AV8PrvNum),Integer.valueOf(AV9Prvnum_to),Short.valueOf(AV10Dias)});
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
      nRC_GXsfl_41 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_41"))) ;
      nGXsfl_41_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_41_idx"))) ;
      sGXsfl_41_idx = httpContext.GetPar( "sGXsfl_41_idx") ;
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
      AV21FilterFullText = httpContext.GetPar( "FilterFullText") ;
      AV5Emprcod = httpContext.GetPar( "Emprcod") ;
      AV6Prdnum = httpContext.GetPar( "Prdnum") ;
      AV7Prdnum_to = httpContext.GetPar( "Prdnum_to") ;
      AV8PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
      AV9Prvnum_to = (int)(GXutil.lval( httpContext.GetPar( "Prvnum_to"))) ;
      AV10Dias = (short)(GXutil.lval( httpContext.GetPar( "Dias"))) ;
      AV31ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV26ColumnsSelector);
      AV72Pgmname = httpContext.GetPar( "Pgmname") ;
      AV18OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV19OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV32TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV33TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV34TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV35TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV36TFPrvNum = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum"))) ;
      AV37TFPrvNum_To = (int)(GXutil.lval( httpContext.GetPar( "TFPrvNum_To"))) ;
      AV38TFPrvNom = httpContext.GetPar( "TFPrvNom") ;
      AV39TFPrvNom_Sel = httpContext.GetPar( "TFPrvNom_Sel") ;
      AV40TFPrdExiAlm = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm"), ".") ;
      AV41TFPrdExiAlm_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdExiAlm_To"), ".") ;
      AV68TFPrdUcpDsc = httpContext.GetPar( "TFPrdUcpDsc") ;
      AV69TFPrdUcpDsc_Sel = httpContext.GetPar( "TFPrdUcpDsc_Sel") ;
      AV66TFPrdPreAct = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct"), ".") ;
      AV67TFPrdPreAct_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPrdPreAct_To"), ".") ;
      AV48TFPrdDiasInactivo = (short)(GXutil.lval( httpContext.GetPar( "TFPrdDiasInactivo"))) ;
      AV49TFPrdDiasInactivo_To = (short)(GXutil.lval( httpContext.GetPar( "TFPrdDiasInactivo_To"))) ;
      AV56TFPrdLastFechCC = localUtil.parseDateParm( httpContext.GetPar( "TFPrdLastFechCC")) ;
      AV62TFPrdLastTipMovCC = httpContext.GetPar( "TFPrdLastTipMovCC") ;
      AV63TFPrdLastTipMovCC_Sel = httpContext.GetPar( "TFPrdLastTipMovCC_Sel") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV8PrvNum, AV9Prvnum_to, AV10Dias, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV72Pgmname, AV18OrderedBy, AV19OrderedDsc, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFPrdExiAlm, AV41TFPrdExiAlm_To, AV68TFPrdUcpDsc, AV69TFPrdUcpDsc_Sel, AV66TFPrdPreAct, AV67TFPrdPreAct_To, AV48TFPrdDiasInactivo, AV49TFPrdDiasInactivo_To, AV56TFPrdLastFechCC, AV62TFPrdLastTipMovCC, AV63TFPrdLastTipMovCC_Sel, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1DP2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Control Productos sin Movimientos", "")) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlproductossinmovimientos_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(AV6Prdnum)),GXutil.URLEncode(GXutil.rtrim(AV7Prdnum_to)),GXutil.URLEncode(GXutil.ltrimstr(AV8PrvNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV9Prvnum_to,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV10Dias,4,0))}, new String[] {"Emprcod","Prdnum","Prdnum_to","PrvNum","Prvnum_to","Dias"}) +"\">") ;
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
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ControlProductossinMovimientos_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlproductossinmovimientos_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV21FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_41", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_41, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV29ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV29ManageFiltersData);
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
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vCOLUMNSSELECTOR", AV26ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Prdnum", GXutil.rtrim( wcpOAV6Prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7Prdnum_to", GXutil.rtrim( wcpOAV7Prdnum_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8PrvNum", GXutil.ltrim( localUtil.ntoc( wcpOAV8PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV9Prvnum_to", GXutil.ltrim( localUtil.ntoc( wcpOAV9Prvnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV10Dias", GXutil.ltrim( localUtil.ntoc( wcpOAV10Dias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV31ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV18OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV19OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV32TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV33TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV34TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV35TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM", GXutil.ltrim( localUtil.ntoc( AV36TFPrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV37TFPrvNum_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM", GXutil.rtrim( AV38TFPrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRVNOM_SEL", GXutil.rtrim( AV39TFPrvNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEXIALM", GXutil.ltrim( localUtil.ntoc( AV40TFPrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDEXIALM_TO", GXutil.ltrim( localUtil.ntoc( AV41TFPrdExiAlm_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDUCPDSC", GXutil.rtrim( AV68TFPrdUcpDsc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDUCPDSC_SEL", GXutil.rtrim( AV69TFPrdUcpDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDPREACT", GXutil.ltrim( localUtil.ntoc( AV66TFPrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDPREACT_TO", GXutil.ltrim( localUtil.ntoc( AV67TFPrdPreAct_To, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDDIASINACTIVO", GXutil.ltrim( localUtil.ntoc( AV48TFPrdDiasInactivo, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDDIASINACTIVO_TO", GXutil.ltrim( localUtil.ntoc( AV49TFPrdDiasInactivo_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDLASTFECHCC", localUtil.dtoc( AV56TFPrdLastFechCC, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDLASTTIPMOVCC", GXutil.rtrim( AV62TFPrdLastTipMovCC));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDLASTTIPMOVCC_SEL", GXutil.rtrim( AV63TFPrdLastTipMovCC_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM", GXutil.rtrim( AV6Prdnum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRDNUM_TO", GXutil.rtrim( AV7Prdnum_to));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUM", GXutil.ltrim( localUtil.ntoc( AV8PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRVNUM_TO", GXutil.ltrim( localUtil.ntoc( AV9Prvnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vDIAS", GXutil.ltrim( localUtil.ntoc( AV10Dias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV16GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV16GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDULTMOVC", GXutil.ltrim( localUtil.ntoc( A13873PrdUltMovC, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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

   public void renderHtmlCloseForm1DP2( )
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
      return "ControlProductossinMovimientos_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control Productos sin Movimientos", "") ;
   }

   public void wb1DP0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.controlproductossinmovimientos_wc");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlProductossinMovimientos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlProductossinMovimientos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 41, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+sPrefix+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlProductossinMovimientos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_23_1DP2( true) ;
      }
      else
      {
         wb_table1_23_1DP2( false) ;
      }
      return  ;
   }

   public void wb_table1_23_1DP2e( boolean wbgen )
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
         startgridcontrol41( ) ;
      }
      if ( wbEnd == 41 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_41 = (int)(nGXsfl_41_idx-1) ;
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop10 CellMarginBottom10", "Right", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPgmname_Internalname, httpContext.getMessage( "pgmname", ""), "col-sm-3 AttributeLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV72Pgmname), GXutil.rtrim( localUtil.format( AV72Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlProductossinMovimientos_WC.htm");
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
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV50DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV26ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, sPrefix+"DDO_GRIDCOLUMNSSELECTORContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divDdo_prdlastfechccauxdates_Internalname, 1, 0, "px", 0, "px", "Invisible", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavDdo_prdlastfechccauxdate_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDdo_prdlastfechccauxdate_Internalname, localUtil.format(AV58DDO_PrdLastFechCCAuxDate, "99/99/99"), localUtil.format( AV58DDO_PrdLastFechCCAuxDate, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,67);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDdo_prdlastfechccauxdate_Jsonclick, 0, "Attribute", "", "", "", "", 1, 1, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ControlProductossinMovimientos_WC.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavDdo_prdlastfechccauxdate_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(1==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_ControlProductossinMovimientos_WC.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 41 )
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

   public void start1DP2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Control Productos sin Movimientos", ""), (short)(0)) ;
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
            strup1DP0( ) ;
         }
      }
   }

   public void ws1DP2( )
   {
      start1DP2( ) ;
      evt1DP2( ) ;
   }

   public void evt1DP2( )
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
                              strup1DP0( ) ;
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
                              strup1DP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e111DP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e121DP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e131DP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141DP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151DP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e161DP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e171DP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1DP0( ) ;
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
                              strup1DP0( ) ;
                           }
                           nGXsfl_41_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_412( ) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A795PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( edtPrvNum_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A794PrvNom = httpContext.cgiGet( edtPrvNom_Internalname) ;
                           n794PrvNom = false ;
                           A704PrdExiAlm = localUtil.ctond( httpContext.cgiGet( edtPrdExiAlm_Internalname)) ;
                           A737PrdUcpDsc = httpContext.cgiGet( edtPrdUcpDsc_Internalname) ;
                           n737PrdUcpDsc = false ;
                           A724PrdPreAct = localUtil.ctond( httpContext.cgiGet( edtPrdPreAct_Internalname)) ;
                           AV64Valor = localUtil.ctond( httpContext.cgiGet( edtavValor_Internalname)) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV64Valor, 12, 4));
                           A13871PrdDiasIna = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdDiasIna_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A13876PrdLastFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtPrdLastFec_Internalname), 0)) ;
                           A13877PrdLastTip = httpContext.cgiGet( edtPrdLastTip_Internalname) ;
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
                                       e181DP2 ();
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
                                       e191DP2 ();
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
                                       e201DP2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV21FilterFullText) != 0 )
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
                                    strup1DP0( ) ;
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

   public void we1DP2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1DP2( ) ;
         }
      }
   }

   public void pa1DP2( )
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
      subsflControlProps_412( ) ;
      while ( nGXsfl_41_idx <= nRC_GXsfl_41 )
      {
         sendrow_412( ) ;
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV21FilterFullText ,
                                 String AV5Emprcod ,
                                 String AV6Prdnum ,
                                 String AV7Prdnum_to ,
                                 int AV8PrvNum ,
                                 int AV9Prvnum_to ,
                                 short AV10Dias ,
                                 byte AV31ManageFiltersExecutionStep ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ,
                                 String AV72Pgmname ,
                                 short AV18OrderedBy ,
                                 boolean AV19OrderedDsc ,
                                 String AV32TFPrdNum ,
                                 String AV33TFPrdNum_Sel ,
                                 String AV34TFPrdNom ,
                                 String AV35TFPrdNom_Sel ,
                                 int AV36TFPrvNum ,
                                 int AV37TFPrvNum_To ,
                                 String AV38TFPrvNom ,
                                 String AV39TFPrvNom_Sel ,
                                 java.math.BigDecimal AV40TFPrdExiAlm ,
                                 java.math.BigDecimal AV41TFPrdExiAlm_To ,
                                 String AV68TFPrdUcpDsc ,
                                 String AV69TFPrdUcpDsc_Sel ,
                                 java.math.BigDecimal AV66TFPrdPreAct ,
                                 java.math.BigDecimal AV67TFPrdPreAct_To ,
                                 short AV48TFPrdDiasInactivo ,
                                 short AV49TFPrdDiasInactivo_To ,
                                 java.util.Date AV56TFPrdLastFechCC ,
                                 String AV62TFPrdLastTipMovCC ,
                                 String AV63TFPrdLastTipMovCC_Sel ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e191DP2 ();
      GRID_nCurrentRecord = 0 ;
      rf1DP2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ControlProductossinMovimientos_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlproductossinmovimientos_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf1DP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV72Pgmname = "ControlProductossinMovimientos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
      Gx_err = (short)(0) ;
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public int subgridclient_rec_count_fnc( )
   {
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV33TFPrdNum_Sel ,
                                           AV32TFPrdNum ,
                                           AV35TFPrdNom_Sel ,
                                           AV34TFPrdNom ,
                                           Integer.valueOf(AV36TFPrvNum) ,
                                           Integer.valueOf(AV37TFPrvNum_To) ,
                                           AV39TFPrvNom_Sel ,
                                           AV38TFPrvNom ,
                                           AV40TFPrdExiAlm ,
                                           AV41TFPrdExiAlm_To ,
                                           AV69TFPrdUcpDsc_Sel ,
                                           AV68TFPrdUcpDsc ,
                                           AV66TFPrdPreAct ,
                                           AV67TFPrdPreAct_To ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           Integer.valueOf(A795PrvNum) ,
                                           A794PrvNom ,
                                           A704PrdExiAlm ,
                                           A737PrdUcpDsc ,
                                           A724PrdPreAct ,
                                           Short.valueOf(AV18OrderedBy) ,
                                           Boolean.valueOf(AV19OrderedDsc) ,
                                           AV21FilterFullText ,
                                           Short.valueOf(A13871PrdDiasIna) ,
                                           A13877PrdLastTip ,
                                           Short.valueOf(AV48TFPrdDiasInactivo) ,
                                           Short.valueOf(AV49TFPrdDiasInactivo_To) ,
                                           AV56TFPrdLastFechCC ,
                                           A13876PrdLastFec ,
                                           AV63TFPrdLastTipMovCC_Sel ,
                                           AV62TFPrdLastTipMovCC ,
                                           Integer.valueOf(AV8PrvNum) ,
                                           Integer.valueOf(AV9Prvnum_to) ,
                                           Short.valueOf(AV10Dias) ,
                                           AV5Emprcod ,
                                           AV6Prdnum ,
                                           A396EmprCod ,
                                           AV7Prdnum_to } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                           TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                           TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING
                                           }
      });
      lV32TFPrdNum = GXutil.padr( GXutil.rtrim( AV32TFPrdNum), 6, "%") ;
      lV34TFPrdNom = GXutil.padr( GXutil.rtrim( AV34TFPrdNom), 26, "%") ;
      lV38TFPrvNom = GXutil.padr( GXutil.rtrim( AV38TFPrvNom), 30, "%") ;
      lV68TFPrdUcpDsc = GXutil.padr( GXutil.rtrim( AV68TFPrdUcpDsc), 8, "%") ;
      /* Using cursor H01DP2 */
      pr_default.execute(0, new Object[] {AV5Emprcod, AV6Prdnum, Integer.valueOf(AV8PrvNum), Integer.valueOf(AV9Prvnum_to), AV7Prdnum_to, lV32TFPrdNum, AV33TFPrdNum_Sel, lV34TFPrdNom, AV35TFPrdNom_Sel, Integer.valueOf(AV36TFPrvNum), Integer.valueOf(AV37TFPrvNum_To), lV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFPrdExiAlm, AV41TFPrdExiAlm_To, lV68TFPrdUcpDsc, AV69TFPrdUcpDsc_Sel, AV66TFPrdPreAct, AV67TFPrdPreAct_To});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A742PrdUniCom = H01DP2_A742PrdUniCom[0] ;
         A4338PrdUMeFo = H01DP2_A4338PrdUMeFo[0] ;
         A724PrdPreAct = H01DP2_A724PrdPreAct[0] ;
         A737PrdUcpDsc = H01DP2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = H01DP2_n737PrdUcpDsc[0] ;
         A704PrdExiAlm = H01DP2_A704PrdExiAlm[0] ;
         A794PrvNom = H01DP2_A794PrvNom[0] ;
         n794PrvNom = H01DP2_n794PrvNom[0] ;
         A795PrvNum = H01DP2_A795PrvNum[0] ;
         A718PrdNom = H01DP2_A718PrdNom[0] ;
         A719PrdNum = H01DP2_A719PrdNum[0] ;
         A396EmprCod = H01DP2_A396EmprCod[0] ;
         A794PrvNom = H01DP2_A794PrvNom[0] ;
         n794PrvNom = H01DP2_n794PrvNom[0] ;
         A737PrdUcpDsc = H01DP2_A737PrdUcpDsc[0] ;
         n737PrdUcpDsc = H01DP2_n737PrdUcpDsc[0] ;
         GXt_int1 = A13871PrdDiasIna ;
         GXv_char2[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_int4[0] = GXt_int1 ;
         new app.core.ultimomovimiento(remoteHandle, context).execute( GXv_char2, GXv_char3, GXv_int4) ;
         controlproductossinmovimientos_wc_impl.this.A396EmprCod = GXv_char2[0] ;
         controlproductossinmovimientos_wc_impl.this.A719PrdNum = GXv_char3[0] ;
         controlproductossinmovimientos_wc_impl.this.GXt_int1 = GXv_int4[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         A13871PrdDiasIna = GXt_int1 ;
         if ( (0==AV48TFPrdDiasInactivo) || ( ( A13871PrdDiasIna >= AV48TFPrdDiasInactivo ) ) )
         {
            if ( (0==AV49TFPrdDiasInactivo_To) || ( ( A13871PrdDiasIna <= AV49TFPrdDiasInactivo_To ) ) )
            {
               if ( ( A13871PrdDiasIna >= AV10Dias ) || (0==AV10Dias) )
               {
                  GXt_int5 = A13873PrdUltMovC ;
                  GXv_int6[0] = GXt_int5 ;
                  new app.core.ultimalineamovcc(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_int6) ;
                  controlproductossinmovimientos_wc_impl.this.GXt_int5 = GXv_int6[0] ;
                  A13873PrdUltMovC = GXt_int5 ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13873PrdUltMovC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13873PrdUltMovC), 12, 0));
                  A13876PrdLastFec = getPrdLastFec0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                  if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFPrdLastFechCC)) || ( (( GXutil.resetTime(A13876PrdLastFec).after( GXutil.resetTime( AV56TFPrdLastFechCC )) ) || ( GXutil.dateCompare(GXutil.resetTime(A13876PrdLastFec), GXutil.resetTime(AV56TFPrdLastFechCC)) )) ) )
                  {
                     A13877PrdLastTip = getPrdLastTip0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                     if ( (GXutil.strcmp("", AV21FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV21FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV21FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV21FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV21FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV21FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV21FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV21FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13871PrdDiasIna, 4, 0) , GXutil.padr( "%" + AV21FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV21FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                     {
                        if ( ! ( (GXutil.strcmp("", AV63TFPrdLastTipMovCC_Sel)==0) && ( ! (GXutil.strcmp("", AV62TFPrdLastTipMovCC)==0) ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV62TFPrdLastTipMovCC) , 255 , "%"),  ' ' ) ) )
                        {
                           if ( (GXutil.strcmp("", AV63TFPrdLastTipMovCC_Sel)==0) || ( ( GXutil.strcmp(A13877PrdLastTip, AV63TFPrdLastTipMovCC_Sel) == 0 ) ) )
                           {
                              GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
                           }
                        }
                     }
                  }
               }
            }
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rf1DP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(41) ;
      /* Execute user event: Refresh */
      e191DP2 ();
      nGXsfl_41_idx = 1 ;
      sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_412( ) ;
      bGXsfl_41_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridWithPaginationBar GridNoBorder WorkWith");
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
         subsflControlProps_412( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV33TFPrdNum_Sel ,
                                              AV32TFPrdNum ,
                                              AV35TFPrdNom_Sel ,
                                              AV34TFPrdNom ,
                                              Integer.valueOf(AV36TFPrvNum) ,
                                              Integer.valueOf(AV37TFPrvNum_To) ,
                                              AV39TFPrvNom_Sel ,
                                              AV38TFPrvNom ,
                                              AV40TFPrdExiAlm ,
                                              AV41TFPrdExiAlm_To ,
                                              AV69TFPrdUcpDsc_Sel ,
                                              AV68TFPrdUcpDsc ,
                                              AV66TFPrdPreAct ,
                                              AV67TFPrdPreAct_To ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              Integer.valueOf(A795PrvNum) ,
                                              A794PrvNom ,
                                              A704PrdExiAlm ,
                                              A737PrdUcpDsc ,
                                              A724PrdPreAct ,
                                              Short.valueOf(AV18OrderedBy) ,
                                              Boolean.valueOf(AV19OrderedDsc) ,
                                              AV21FilterFullText ,
                                              Short.valueOf(A13871PrdDiasIna) ,
                                              A13877PrdLastTip ,
                                              Short.valueOf(AV48TFPrdDiasInactivo) ,
                                              Short.valueOf(AV49TFPrdDiasInactivo_To) ,
                                              AV56TFPrdLastFechCC ,
                                              A13876PrdLastFec ,
                                              AV63TFPrdLastTipMovCC_Sel ,
                                              AV62TFPrdLastTipMovCC ,
                                              Integer.valueOf(AV8PrvNum) ,
                                              Integer.valueOf(AV9Prvnum_to) ,
                                              Short.valueOf(AV10Dias) ,
                                              AV5Emprcod ,
                                              AV6Prdnum ,
                                              A396EmprCod ,
                                              AV7Prdnum_to } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL,
                                              TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT,
                                              TypeConstants.DATE, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.INT, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING
                                              }
         });
         lV32TFPrdNum = GXutil.padr( GXutil.rtrim( AV32TFPrdNum), 6, "%") ;
         lV34TFPrdNom = GXutil.padr( GXutil.rtrim( AV34TFPrdNom), 26, "%") ;
         lV38TFPrvNom = GXutil.padr( GXutil.rtrim( AV38TFPrvNom), 30, "%") ;
         lV68TFPrdUcpDsc = GXutil.padr( GXutil.rtrim( AV68TFPrdUcpDsc), 8, "%") ;
         /* Using cursor H01DP3 */
         pr_default.execute(1, new Object[] {AV5Emprcod, AV6Prdnum, Integer.valueOf(AV8PrvNum), Integer.valueOf(AV9Prvnum_to), AV7Prdnum_to, lV32TFPrdNum, AV33TFPrdNum_Sel, lV34TFPrdNom, AV35TFPrdNom_Sel, Integer.valueOf(AV36TFPrvNum), Integer.valueOf(AV37TFPrvNum_To), lV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFPrdExiAlm, AV41TFPrdExiAlm_To, lV68TFPrdUcpDsc, AV69TFPrdUcpDsc_Sel, AV66TFPrdPreAct, AV67TFPrdPreAct_To});
         nGXsfl_41_idx = 1 ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A742PrdUniCom = H01DP3_A742PrdUniCom[0] ;
            A4338PrdUMeFo = H01DP3_A4338PrdUMeFo[0] ;
            A724PrdPreAct = H01DP3_A724PrdPreAct[0] ;
            A737PrdUcpDsc = H01DP3_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = H01DP3_n737PrdUcpDsc[0] ;
            A704PrdExiAlm = H01DP3_A704PrdExiAlm[0] ;
            A794PrvNom = H01DP3_A794PrvNom[0] ;
            n794PrvNom = H01DP3_n794PrvNom[0] ;
            A795PrvNum = H01DP3_A795PrvNum[0] ;
            A718PrdNom = H01DP3_A718PrdNom[0] ;
            A719PrdNum = H01DP3_A719PrdNum[0] ;
            A396EmprCod = H01DP3_A396EmprCod[0] ;
            A794PrvNom = H01DP3_A794PrvNom[0] ;
            n794PrvNom = H01DP3_n794PrvNom[0] ;
            A737PrdUcpDsc = H01DP3_A737PrdUcpDsc[0] ;
            n737PrdUcpDsc = H01DP3_n737PrdUcpDsc[0] ;
            GXt_int1 = A13871PrdDiasIna ;
            GXv_char3[0] = A396EmprCod ;
            GXv_char2[0] = A719PrdNum ;
            GXv_int4[0] = GXt_int1 ;
            new app.core.ultimomovimiento(remoteHandle, context).execute( GXv_char3, GXv_char2, GXv_int4) ;
            controlproductossinmovimientos_wc_impl.this.A396EmprCod = GXv_char3[0] ;
            controlproductossinmovimientos_wc_impl.this.A719PrdNum = GXv_char2[0] ;
            controlproductossinmovimientos_wc_impl.this.GXt_int1 = GXv_int4[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            A13871PrdDiasIna = GXt_int1 ;
            if ( (0==AV48TFPrdDiasInactivo) || ( ( A13871PrdDiasIna >= AV48TFPrdDiasInactivo ) ) )
            {
               if ( (0==AV49TFPrdDiasInactivo_To) || ( ( A13871PrdDiasIna <= AV49TFPrdDiasInactivo_To ) ) )
               {
                  if ( ( A13871PrdDiasIna >= AV10Dias ) || (0==AV10Dias) )
                  {
                     GXt_int5 = A13873PrdUltMovC ;
                     GXv_int6[0] = GXt_int5 ;
                     new app.core.ultimalineamovcc(remoteHandle, context).execute( A396EmprCod, A719PrdNum, GXv_int6) ;
                     controlproductossinmovimientos_wc_impl.this.GXt_int5 = GXv_int6[0] ;
                     A13873PrdUltMovC = GXt_int5 ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A13873PrdUltMovC", GXutil.ltrimstr( DecimalUtil.doubleToDec(A13873PrdUltMovC), 12, 0));
                     A13876PrdLastFec = getPrdLastFec0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                     if ( GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFPrdLastFechCC)) || ( (( GXutil.resetTime(A13876PrdLastFec).after( GXutil.resetTime( AV56TFPrdLastFechCC )) ) || ( GXutil.dateCompare(GXutil.resetTime(A13876PrdLastFec), GXutil.resetTime(AV56TFPrdLastFechCC)) )) ) )
                     {
                        A13877PrdLastTip = getPrdLastTip0( A396EmprCod, A719PrdNum, A13873PrdUltMovC) ;
                        if ( (GXutil.strcmp("", AV21FilterFullText)==0) || ( ( GXutil.like( GXutil.upper( A719PrdNum) , GXutil.padr( "%" + GXutil.upper( AV21FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A718PrdNom) , GXutil.padr( "%" + GXutil.upper( AV21FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A795PrvNum, 6, 0) , GXutil.padr( "%" + AV21FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A794PrvNom) , GXutil.padr( "%" + GXutil.upper( AV21FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A704PrdExiAlm, 12, 4) , GXutil.padr( "%" + AV21FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A737PrdUcpDsc) , GXutil.padr( "%" + GXutil.upper( AV21FilterFullText) , 255 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A724PrdPreAct, 14, 5) , GXutil.padr( "%" + AV21FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.str( A13871PrdDiasIna, 4, 0) , GXutil.padr( "%" + AV21FilterFullText , 254 , "%"),  ' ' ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV21FilterFullText) , 255 , "%"),  ' ' ) ) ) )
                        {
                           if ( ! ( (GXutil.strcmp("", AV63TFPrdLastTipMovCC_Sel)==0) && ( ! (GXutil.strcmp("", AV62TFPrdLastTipMovCC)==0) ) ) || ( GXutil.like( GXutil.upper( A13877PrdLastTip) , GXutil.padr( "%" + GXutil.upper( AV62TFPrdLastTipMovCC) , 255 , "%"),  ' ' ) ) )
                           {
                              if ( (GXutil.strcmp("", AV63TFPrdLastTipMovCC_Sel)==0) || ( ( GXutil.strcmp(A13877PrdLastTip, AV63TFPrdLastTipMovCC_Sel) == 0 ) ) )
                              {
                                 e201DP2 ();
                              }
                           }
                        }
                     }
                  }
               }
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(41) ;
         wb1DP0( ) ;
      }
      bGXsfl_41_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1DP2( )
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
      return (int)(subgridclient_rec_count_fnc()) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV8PrvNum, AV9Prvnum_to, AV10Dias, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV72Pgmname, AV18OrderedBy, AV19OrderedDsc, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFPrdExiAlm, AV41TFPrdExiAlm_To, AV68TFPrdUcpDsc, AV69TFPrdUcpDsc_Sel, AV66TFPrdPreAct, AV67TFPrdPreAct_To, AV48TFPrdDiasInactivo, AV49TFPrdDiasInactivo_To, AV56TFPrdLastFechCC, AV62TFPrdLastTipMovCC, AV63TFPrdLastTipMovCC_Sel, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV8PrvNum, AV9Prvnum_to, AV10Dias, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV72Pgmname, AV18OrderedBy, AV19OrderedDsc, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFPrdExiAlm, AV41TFPrdExiAlm_To, AV68TFPrdUcpDsc, AV69TFPrdUcpDsc_Sel, AV66TFPrdPreAct, AV67TFPrdPreAct_To, AV48TFPrdDiasInactivo, AV49TFPrdDiasInactivo_To, AV56TFPrdLastFechCC, AV62TFPrdLastTipMovCC, AV63TFPrdLastTipMovCC_Sel, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV8PrvNum, AV9Prvnum_to, AV10Dias, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV72Pgmname, AV18OrderedBy, AV19OrderedDsc, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFPrdExiAlm, AV41TFPrdExiAlm_To, AV68TFPrdUcpDsc, AV69TFPrdUcpDsc_Sel, AV66TFPrdPreAct, AV67TFPrdPreAct_To, AV48TFPrdDiasInactivo, AV49TFPrdDiasInactivo_To, AV56TFPrdLastFechCC, AV62TFPrdLastTipMovCC, AV63TFPrdLastTipMovCC_Sel, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV8PrvNum, AV9Prvnum_to, AV10Dias, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV72Pgmname, AV18OrderedBy, AV19OrderedDsc, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFPrdExiAlm, AV41TFPrdExiAlm_To, AV68TFPrdUcpDsc, AV69TFPrdUcpDsc_Sel, AV66TFPrdPreAct, AV67TFPrdPreAct_To, AV48TFPrdDiasInactivo, AV49TFPrdDiasInactivo_To, AV56TFPrdLastFechCC, AV62TFPrdLastTipMovCC, AV63TFPrdLastTipMovCC_Sel, sPrefix) ;
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
         gxgrgrid_refresh( subGrid_Rows, AV21FilterFullText, AV5Emprcod, AV6Prdnum, AV7Prdnum_to, AV8PrvNum, AV9Prvnum_to, AV10Dias, AV31ManageFiltersExecutionStep, AV26ColumnsSelector, AV72Pgmname, AV18OrderedBy, AV19OrderedDsc, AV32TFPrdNum, AV33TFPrdNum_Sel, AV34TFPrdNom, AV35TFPrdNom_Sel, AV36TFPrvNum, AV37TFPrvNum_To, AV38TFPrvNom, AV39TFPrvNom_Sel, AV40TFPrdExiAlm, AV41TFPrdExiAlm_To, AV68TFPrdUcpDsc, AV69TFPrdUcpDsc_Sel, AV66TFPrdPreAct, AV67TFPrdPreAct_To, AV48TFPrdDiasInactivo, AV49TFPrdDiasInactivo_To, AV56TFPrdLastFechCC, AV62TFPrdLastTipMovCC, AV63TFPrdLastTipMovCC_Sel, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV72Pgmname = "ControlProductossinMovimientos_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
      Gx_err = (short)(0) ;
      edtavValor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Enabled), 5, 0), !bGXsfl_41_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1DP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e181DP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV29ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV50DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vCOLUMNSSELECTOR"), AV26ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_41 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_41"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV52GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV53GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6Prdnum = httpContext.cgiGet( sPrefix+"wcpOAV6Prdnum") ;
         wcpOAV7Prdnum_to = httpContext.cgiGet( sPrefix+"wcpOAV7Prdnum_to") ;
         wcpOAV8PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV9Prvnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Prvnum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV10Dias = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10Dias"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         AV21FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FilterFullText", AV21FilterFullText);
         AV72Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
         if ( localUtil.vcdate( httpContext.cgiGet( edtavDdo_prdlastfechccauxdate_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vDDO_PRDLASTFECHCCAUXDATE");
            GX_FocusControl = edtavDdo_prdlastfechccauxdate_Internalname ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV58DDO_PrdLastFechCCAuxDate = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58DDO_PrdLastFechCCAuxDate", localUtil.format(AV58DDO_PrdLastFechCCAuxDate, "99/99/99"));
         }
         else
         {
            AV58DDO_PrdLastFechCCAuxDate = localUtil.ctod( httpContext.cgiGet( edtavDdo_prdlastfechccauxdate_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58DDO_PrdLastFechCCAuxDate", localUtil.format(AV58DDO_PrdLastFechCCAuxDate, "99/99/99"));
         }
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ControlProductossinMovimientos_WC");
         AV72Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72Pgmname", AV72Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV72Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlproductossinmovimientos_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV21FilterFullText) != 0 )
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
      e181DP2 ();
      if (returnInSub) return;
   }

   public void e181DP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      AV65ForPrdDsc = ((A4338PrdUMeFo==1) ? httpContext.getMessage( "gr/l", "") : ((A4338PrdUMeFo==2) ? httpContext.getMessage( "cc/l", "") : ((A4338PrdUMeFo==3) ? httpContext.getMessage( "gr", "") : " "))) ;
      GXt_char7 = AV73Station ;
      GXv_char3[0] = GXt_char7 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char3) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char7 = GXv_char3[0] ;
      AV73Station = GXt_char7 ;
      GXv_char3[0] = AV5Emprcod ;
      GXv_char2[0] = AV74Emprnom ;
      GXv_char8[0] = AV75Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV73Station, GXv_char3, GXv_char2, GXv_char8) ;
      controlproductossinmovimientos_wc_impl.this.AV5Emprcod = GXv_char3[0] ;
      controlproductossinmovimientos_wc_impl.this.AV74Emprnom = GXv_char2[0] ;
      controlproductossinmovimientos_wc_impl.this.AV75Usurcod = GXv_char8[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
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
      if ( AV18OrderedBy < 1 )
      {
         AV18OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV50DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV50DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, sPrefix, false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e191DP2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV12WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV12WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV31ManageFiltersExecutionStep == 1 )
      {
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV31ManageFiltersExecutionStep == 2 )
      {
         AV31ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV28Session.getValue("ControlProductossinMovimientos_WCColumnsSelector"), "") != 0 )
      {
         AV24ColumnsSelectorXML = AV28Session.getValue("ControlProductossinMovimientos_WCColumnsSelector") ;
         AV26ColumnsSelector.fromxml(AV24ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrvNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNum_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrvNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrvNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrvNom_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdExiAlm_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdExiAlm_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdExiAlm_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdUcpDsc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdUcpDsc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdUcpDsc_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdPreAct_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdPreAct_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdPreAct_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtavValor_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValor_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValor_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdDiasIna_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdDiasIna_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdDiasIna_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdLastFec_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+10)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdLastFec_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLastFec_Visible), 5, 0), !bGXsfl_41_Refreshing);
      edtPrdLastTip_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV26ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+11)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtPrdLastTip_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdLastTip_Visible), 5, 0), !bGXsfl_41_Refreshing);
      AV52GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV52GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52GridCurrentPage), 10, 0));
      AV53GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridPageCount), 10, 0));
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e121DP2( )
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

   public void e131DP2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e141DP2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV18OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
         AV19OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV32TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNum", AV32TFPrdNum);
            AV33TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdNum_Sel", AV33TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV34TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrdNom", AV34TFPrdNom);
            AV35TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrdNom_Sel", AV35TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNum") == 0 )
         {
            AV36TFPrvNum = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrvNum), 6, 0));
            AV37TFPrvNum_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrvNom") == 0 )
         {
            AV38TFPrvNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvNom", AV38TFPrvNom);
            AV39TFPrvNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvNom_Sel", AV39TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdExiAlm") == 0 )
         {
            AV40TFPrdExiAlm = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdExiAlm", GXutil.ltrimstr( AV40TFPrdExiAlm, 12, 4));
            AV41TFPrdExiAlm_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdExiAlm_To", GXutil.ltrimstr( AV41TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdUcpDsc") == 0 )
         {
            AV68TFPrdUcpDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFPrdUcpDsc", AV68TFPrdUcpDsc);
            AV69TFPrdUcpDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFPrdUcpDsc_Sel", AV69TFPrdUcpDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdPreAct") == 0 )
         {
            AV66TFPrdPreAct = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPrdPreAct", GXutil.ltrimstr( AV66TFPrdPreAct, 14, 5));
            AV67TFPrdPreAct_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFPrdPreAct_To", GXutil.ltrimstr( AV67TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdDiasInactivo") == 0 )
         {
            AV48TFPrdDiasInactivo = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdDiasInactivo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFPrdDiasInactivo), 4, 0));
            AV49TFPrdDiasInactivo_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdDiasInactivo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFPrdDiasInactivo_To), 4, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdLastFechCC") == 0 )
         {
            AV56TFPrdLastFechCC = localUtil.ctod( Ddo_grid_Filteredtext_get, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrdLastFechCC", localUtil.format(AV56TFPrdLastFechCC, "99/99/99"));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdLastTipMovCC") == 0 )
         {
            AV62TFPrdLastTipMovCC = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFPrdLastTipMovCC", AV62TFPrdLastTipMovCC);
            AV63TFPrdLastTipMovCC_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrdLastTipMovCC_Sel", AV63TFPrdLastTipMovCC_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e201DP2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV64Valor = A704PrdExiAlm.multiply(A724PrdPreAct) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValor_Internalname, GXutil.ltrimstr( AV64Valor, 12, 4));
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(41) ;
         }
         sendrow_412( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_41_Refreshing )
      {
         httpContext.doAjaxLoad(41, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e151DP2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV24ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV26ColumnsSelector.fromJSonString(AV24ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "ControlProductossinMovimientos_WCColumnsSelector", ((GXutil.strcmp("", AV24ColumnsSelectorXML)==0) ? "" : AV26ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefreshCmp(sPrefix);
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
   }

   public void e111DP2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S172 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ControlProductossinMovimientos_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV72Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ControlProductossinMovimientos_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV31ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV31ManageFiltersExecutionStep", GXutil.str( AV31ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char7 = AV30ManageFiltersXml ;
         GXv_char8[0] = GXt_char7 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ControlProductossinMovimientos_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char8) ;
         controlproductossinmovimientos_wc_impl.this.GXt_char7 = GXv_char8[0] ;
         AV30ManageFiltersXml = GXt_char7 ;
         if ( (GXutil.strcmp("", AV30ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S172 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV72Pgmname+"GridState", AV30ManageFiltersXml) ;
            AV16GridState.fromxml(AV30ManageFiltersXml, null, null);
            AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
            AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S182 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV16GridState", AV16GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV26ColumnsSelector", AV26ColumnsSelector);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV29ManageFiltersData", AV29ManageFiltersData);
   }

   public void e161DP2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char8[0] = AV22ExcelFilename ;
      GXv_char3[0] = AV23ErrorMessage ;
      new app.controlproductossinmovimientos_wcexport(remoteHandle, context).execute( GXv_char8, GXv_char3) ;
      controlproductossinmovimientos_wc_impl.this.AV22ExcelFilename = GXv_char8[0] ;
      controlproductossinmovimientos_wc_impl.this.AV23ErrorMessage = GXv_char3[0] ;
      if ( GXutil.strcmp(AV22ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV22ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV23ErrorMessage);
      }
   }

   public void e171DP2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.controlproductossinmovimientos_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV18OrderedBy, 4, 0))+":"+(AV19OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV26ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdNum", "", "Producto", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdNom", "", "Descripcion", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrvNum", "", "Proveedor", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrvNom", "", "Nombre", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdExiAlm", "", "Existencias", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdUcpDsc", "", "Und", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdPreAct", "", "Precio", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "&Valor", "", "Valor", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdDiasInactivo", "", "Dias", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdLastFechCC", "", "Fech Ult ", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXv_SdtWWPColumnsSelector12[0] = AV26ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, "PrdLastTipMovCC", "", "Tipo Mov", true, "") ;
      AV26ColumnsSelector = GXv_SdtWWPColumnsSelector12[0] ;
      GXt_char7 = AV25UserCustomValue ;
      GXv_char8[0] = GXt_char7 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "ControlProductossinMovimientos_WCColumnsSelector", GXv_char8) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char7 = GXv_char8[0] ;
      AV25UserCustomValue = GXt_char7 ;
      if ( ! ( (GXutil.strcmp("", AV25UserCustomValue)==0) ) )
      {
         AV27ColumnsSelectorAux.fromxml(AV25UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector12[0] = AV27ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector13[0] = AV26ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector12, GXv_SdtWWPColumnsSelector13) ;
         AV27ColumnsSelectorAux = GXv_SdtWWPColumnsSelector12[0] ;
         AV26ColumnsSelector = GXv_SdtWWPColumnsSelector13[0] ;
      }
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = AV29ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ControlProductossinMovimientos_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[0] ;
      AV29ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   }

   public void S172( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV21FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FilterFullText", AV21FilterFullText);
      AV32TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNum", AV32TFPrdNum);
      AV33TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdNum_Sel", AV33TFPrdNum_Sel);
      AV34TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrdNom", AV34TFPrdNom);
      AV35TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrdNom_Sel", AV35TFPrdNom_Sel);
      AV36TFPrvNum = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrvNum), 6, 0));
      AV37TFPrvNum_To = 0 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFPrvNum_To), 6, 0));
      AV38TFPrvNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvNom", AV38TFPrvNom);
      AV39TFPrvNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvNom_Sel", AV39TFPrvNom_Sel);
      AV40TFPrdExiAlm = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdExiAlm", GXutil.ltrimstr( AV40TFPrdExiAlm, 12, 4));
      AV41TFPrdExiAlm_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdExiAlm_To", GXutil.ltrimstr( AV41TFPrdExiAlm_To, 12, 4));
      AV68TFPrdUcpDsc = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFPrdUcpDsc", AV68TFPrdUcpDsc);
      AV69TFPrdUcpDsc_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFPrdUcpDsc_Sel", AV69TFPrdUcpDsc_Sel);
      AV66TFPrdPreAct = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPrdPreAct", GXutil.ltrimstr( AV66TFPrdPreAct, 14, 5));
      AV67TFPrdPreAct_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFPrdPreAct_To", GXutil.ltrimstr( AV67TFPrdPreAct_To, 14, 5));
      AV48TFPrdDiasInactivo = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdDiasInactivo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFPrdDiasInactivo), 4, 0));
      AV49TFPrdDiasInactivo_To = (short)(0) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdDiasInactivo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFPrdDiasInactivo_To), 4, 0));
      AV56TFPrdLastFechCC = GXutil.nullDate() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrdLastFechCC", localUtil.format(AV56TFPrdLastFechCC, "99/99/99"));
      AV62TFPrdLastTipMovCC = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFPrdLastTipMovCC", AV62TFPrdLastTipMovCC);
      AV63TFPrdLastTipMovCC_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrdLastTipMovCC_Sel", AV63TFPrdLastTipMovCC_Sel);
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
      if ( GXutil.strcmp(AV28Session.getValue(AV72Pgmname+"GridState"), "") == 0 )
      {
         AV16GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV72Pgmname+"GridState"), null, null);
      }
      else
      {
         AV16GridState.fromxml(AV28Session.getValue(AV72Pgmname+"GridState"), null, null);
      }
      AV18OrderedBy = AV16GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18OrderedBy), 4, 0));
      AV19OrderedDsc = AV16GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19OrderedDsc", AV19OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S182 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV16GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV16GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV16GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S182( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV76GXV1 = 1 ;
      while ( AV76GXV1 <= AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV76GXV1));
         if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV21FilterFullText = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV21FilterFullText", AV21FilterFullText);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV32TFPrdNum = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32TFPrdNum", AV32TFPrdNum);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV33TFPrdNum_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33TFPrdNum_Sel", AV33TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV34TFPrdNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV34TFPrdNom", AV34TFPrdNom);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV35TFPrdNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV35TFPrdNom_Sel", AV35TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNUM") == 0 )
         {
            AV36TFPrvNum = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV36TFPrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFPrvNum), 6, 0));
            AV37TFPrvNum_To = (int)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV37TFPrvNum_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV37TFPrvNum_To), 6, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM") == 0 )
         {
            AV38TFPrvNom = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV38TFPrvNom", AV38TFPrvNom);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRVNOM_SEL") == 0 )
         {
            AV39TFPrvNom_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV39TFPrvNom_Sel", AV39TFPrvNom_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDEXIALM") == 0 )
         {
            AV40TFPrdExiAlm = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40TFPrdExiAlm", GXutil.ltrimstr( AV40TFPrdExiAlm, 12, 4));
            AV41TFPrdExiAlm_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV41TFPrdExiAlm_To", GXutil.ltrimstr( AV41TFPrdExiAlm_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC") == 0 )
         {
            AV68TFPrdUcpDsc = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV68TFPrdUcpDsc", AV68TFPrdUcpDsc);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDUCPDSC_SEL") == 0 )
         {
            AV69TFPrdUcpDsc_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFPrdUcpDsc_Sel", AV69TFPrdUcpDsc_Sel);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDPREACT") == 0 )
         {
            AV66TFPrdPreAct = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPrdPreAct", GXutil.ltrimstr( AV66TFPrdPreAct, 14, 5));
            AV67TFPrdPreAct_To = CommonUtil.decimalVal( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFPrdPreAct_To", GXutil.ltrimstr( AV67TFPrdPreAct_To, 14, 5));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDDIASINACTIVO") == 0 )
         {
            AV48TFPrdDiasInactivo = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48TFPrdDiasInactivo", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV48TFPrdDiasInactivo), 4, 0));
            AV49TFPrdDiasInactivo_To = (short)(GXutil.lval( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49TFPrdDiasInactivo_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFPrdDiasInactivo_To), 4, 0));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLASTFECHCC") == 0 )
         {
            AV56TFPrdLastFechCC = localUtil.ctod( AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrdLastFechCC", localUtil.format(AV56TFPrdLastFechCC, "99/99/99"));
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLASTTIPMOVCC") == 0 )
         {
            AV62TFPrdLastTipMovCC = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV62TFPrdLastTipMovCC", AV62TFPrdLastTipMovCC);
         }
         else if ( GXutil.strcmp(AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLASTTIPMOVCC_SEL") == 0 )
         {
            AV63TFPrdLastTipMovCC_Sel = AV17GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrdLastTipMovCC_Sel", AV63TFPrdLastTipMovCC_Sel);
         }
         AV76GXV1 = (int)(AV76GXV1+1) ;
      }
      GXt_char7 = "" ;
      GXv_char8[0] = GXt_char7 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFPrdNum_Sel)==0), AV33TFPrdNum_Sel, GXv_char8) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char7 = GXv_char8[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFPrdNom_Sel)==0), AV35TFPrdNom_Sel, GXv_char3) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char17 = "" ;
      GXv_char2[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV39TFPrvNom_Sel)==0), AV39TFPrvNom_Sel, GXv_char2) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char17 = GXv_char2[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV69TFPrdUcpDsc_Sel)==0), AV69TFPrdUcpDsc_Sel, GXv_char19) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFPrdLastTipMovCC_Sel)==0), AV63TFPrdLastTipMovCC_Sel, GXv_char21) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char7+"|"+GXt_char16+"||"+GXt_char17+"||"+GXt_char18+"|||||"+GXt_char20 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char20 = "" ;
      GXv_char21[0] = GXt_char20 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV32TFPrdNum)==0), AV32TFPrdNum, GXv_char21) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char20 = GXv_char21[0] ;
      GXt_char18 = "" ;
      GXv_char19[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFPrdNom)==0), AV34TFPrdNom, GXv_char19) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char18 = GXv_char19[0] ;
      GXt_char17 = "" ;
      GXv_char8[0] = GXt_char17 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV38TFPrvNom)==0), AV38TFPrvNom, GXv_char8) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char17 = GXv_char8[0] ;
      GXt_char16 = "" ;
      GXv_char3[0] = GXt_char16 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV68TFPrdUcpDsc)==0), AV68TFPrdUcpDsc, GXv_char3) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char16 = GXv_char3[0] ;
      GXt_char7 = "" ;
      GXv_char2[0] = GXt_char7 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV62TFPrdLastTipMovCC)==0), AV62TFPrdLastTipMovCC, GXv_char2) ;
      controlproductossinmovimientos_wc_impl.this.GXt_char7 = GXv_char2[0] ;
      Ddo_grid_Filteredtext_set = GXt_char20+"|"+GXt_char18+"|"+((0==AV36TFPrvNum) ? "" : GXutil.str( AV36TFPrvNum, 6, 0))+"|"+GXt_char17+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdExiAlm)==0) ? "" : GXutil.str( AV40TFPrdExiAlm, 12, 4))+"|"+GXt_char16+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdPreAct)==0) ? "" : GXutil.str( AV66TFPrdPreAct, 14, 5))+"||"+((0==AV48TFPrdDiasInactivo) ? "" : GXutil.str( AV48TFPrdDiasInactivo, 4, 0))+"|"+(GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFPrdLastFechCC)) ? "" : localUtil.dtoc( AV56TFPrdLastFechCC, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/"))+"|"+GXt_char7 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((0==AV37TFPrvNum_To) ? "" : GXutil.str( AV37TFPrvNum_To, 6, 0))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdExiAlm_To)==0) ? "" : GXutil.str( AV41TFPrdExiAlm_To, 12, 4))+"||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPrdPreAct_To)==0) ? "" : GXutil.str( AV67TFPrdPreAct_To, 14, 5))+"||"+((0==AV49TFPrdDiasInactivo_To) ? "" : GXutil.str( AV49TFPrdDiasInactivo_To, 4, 0))+"||" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV16GridState.fromxml(AV28Session.getValue(AV72Pgmname+"GridState"), null, null);
      AV16GridState.setgxTv_SdtWWPGridState_Orderedby( AV18OrderedBy );
      AV16GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV19OrderedDsc );
      AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState22[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV21FilterFullText)==0), (short)(0), AV21FilterFullText, "") ;
      AV16GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPRDNUM", "", !(GXutil.strcmp("", AV32TFPrdNum)==0), (short)(0), AV32TFPrdNum, "", !(GXutil.strcmp("", AV33TFPrdNum_Sel)==0), AV33TFPrdNum_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPRDNOM", "", !(GXutil.strcmp("", AV34TFPrdNom)==0), (short)(0), AV34TFPrdNom, "", !(GXutil.strcmp("", AV35TFPrdNom_Sel)==0), AV35TFPrdNom_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPRVNUM", "", !((0==AV36TFPrvNum)&&(0==AV37TFPrvNum_To)), (short)(0), GXutil.trim( GXutil.str( AV36TFPrvNum, 6, 0)), GXutil.trim( GXutil.str( AV37TFPrvNum_To, 6, 0))) ;
      AV16GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPRVNOM", "", !(GXutil.strcmp("", AV38TFPrvNom)==0), (short)(0), AV38TFPrvNom, "", !(GXutil.strcmp("", AV39TFPrvNom_Sel)==0), AV39TFPrvNom_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPRDEXIALM", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdExiAlm)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdExiAlm_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV40TFPrdExiAlm, 12, 4)), GXutil.trim( GXutil.str( AV41TFPrdExiAlm_To, 12, 4))) ;
      AV16GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPRDUCPDSC", "", !(GXutil.strcmp("", AV68TFPrdUcpDsc)==0), (short)(0), AV68TFPrdUcpDsc, "", !(GXutil.strcmp("", AV69TFPrdUcpDsc_Sel)==0), AV69TFPrdUcpDsc_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPRDPREACT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdPreAct)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPrdPreAct_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV66TFPrdPreAct, 14, 5)), GXutil.trim( GXutil.str( AV67TFPrdPreAct_To, 14, 5))) ;
      AV16GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPRDDIASINACTIVO", "", !((0==AV48TFPrdDiasInactivo)&&(0==AV49TFPrdDiasInactivo_To)), (short)(0), GXutil.trim( GXutil.str( AV48TFPrdDiasInactivo, 4, 0)), GXutil.trim( GXutil.str( AV49TFPrdDiasInactivo_To, 4, 0))) ;
      AV16GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPRDLASTFECHCC", "", !GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV56TFPrdLastFechCC)), (short)(0), GXutil.trim( localUtil.dtoc( AV56TFPrdLastFechCC, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/")), "") ;
      AV16GridState = GXv_SdtWWPGridState22[0] ;
      GXv_SdtWWPGridState22[0] = AV16GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState22, "TFPRDLASTTIPMOVCC", "", !(GXutil.strcmp("", AV62TFPrdLastTipMovCC)==0), (short)(0), AV62TFPrdLastTipMovCC, "", !(GXutil.strcmp("", AV63TFPrdLastTipMovCC_Sel)==0), AV63TFPrdLastTipMovCC_Sel, "") ;
      AV16GridState = GXv_SdtWWPGridState22[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV6Prdnum)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV6Prdnum );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV7Prdnum_to)==0) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRDNUM_TO" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7Prdnum_to );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV8PrvNum) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUM" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV8PrvNum, 6, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV9Prvnum_to) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUM_TO" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV9Prvnum_to, 6, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      if ( ! (0==AV10Dias) )
      {
         AV17GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&DIAS" );
         AV17GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV10Dias, 4, 0) );
         AV16GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV17GridStateFilterValue, 0);
      }
      AV16GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV16GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV72Pgmname+"GridState", AV16GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV14TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV72Pgmname );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV13HTTPRequest.getScriptName()+"?"+AV13HTTPRequest.getQuerystring() );
      AV14TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.PRODUC" );
      AV28Session.setValue("TrnContext", AV14TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void wb_table1_23_1DP2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV29ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table2_28_1DP2( true) ;
      }
      else
      {
         wb_table2_28_1DP2( false) ;
      }
      return  ;
   }

   public void wb_table2_28_1DP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_23_1DP2e( true) ;
      }
      else
      {
         wb_table1_23_1DP2e( false) ;
      }
   }

   public void wb_table2_28_1DP2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 32,'" + sPrefix + "',false,'" + sGXsfl_41_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV21FilterFullText, GXutil.rtrim( localUtil.format( AV21FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,32);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ControlProductossinMovimientos_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_28_1DP2e( true) ;
      }
      else
      {
         wb_table2_28_1DP2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6Prdnum = (String)getParm(obj,1,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      AV7Prdnum_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Prdnum_to", AV7Prdnum_to);
      AV8PrvNum = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PrvNum), 6, 0));
      AV9Prvnum_to = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Prvnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Prvnum_to), 6, 0));
      AV10Dias = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Dias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Dias), 4, 0));
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
      pa1DP2( ) ;
      ws1DP2( ) ;
      we1DP2( ) ;
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
      sCtrlAV6Prdnum = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7Prdnum_to = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8PrvNum = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV9Prvnum_to = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV10Dias = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1DP2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "controlproductossinmovimientos_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1DP2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6Prdnum = (String)getParm(obj,3,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
         AV7Prdnum_to = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Prdnum_to", AV7Prdnum_to);
         AV8PrvNum = ((Number) GXutil.testNumericType( getParm(obj,5,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV8PrvNum), 6, 0));
         AV9Prvnum_to = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Prvnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Prvnum_to), 6, 0));
         AV10Dias = ((Number) GXutil.testNumericType( getParm(obj,7,TypeConstants.SHORT), TypeConstants.SHORT)).shortValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Dias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Dias), 4, 0));
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6Prdnum = httpContext.cgiGet( sPrefix+"wcpOAV6Prdnum") ;
      wcpOAV7Prdnum_to = httpContext.cgiGet( sPrefix+"wcpOAV7Prdnum_to") ;
      wcpOAV8PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV8PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV9Prvnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV9Prvnum_to"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV10Dias = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV10Dias"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( GXutil.strcmp(AV6Prdnum, wcpOAV6Prdnum) != 0 ) || ( GXutil.strcmp(AV7Prdnum_to, wcpOAV7Prdnum_to) != 0 ) || ( AV8PrvNum != wcpOAV8PrvNum ) || ( AV9Prvnum_to != wcpOAV9Prvnum_to ) || ( AV10Dias != wcpOAV10Dias ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6Prdnum = AV6Prdnum ;
      wcpOAV7Prdnum_to = AV7Prdnum_to ;
      wcpOAV8PrvNum = AV8PrvNum ;
      wcpOAV9Prvnum_to = AV9Prvnum_to ;
      wcpOAV10Dias = AV10Dias ;
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
      sCtrlAV6Prdnum = httpContext.cgiGet( sPrefix+"AV6Prdnum_CTRL") ;
      if ( GXutil.len( sCtrlAV6Prdnum) > 0 )
      {
         AV6Prdnum = httpContext.cgiGet( sCtrlAV6Prdnum) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Prdnum", AV6Prdnum);
      }
      else
      {
         AV6Prdnum = httpContext.cgiGet( sPrefix+"AV6Prdnum_PARM") ;
      }
      sCtrlAV7Prdnum_to = httpContext.cgiGet( sPrefix+"AV7Prdnum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV7Prdnum_to) > 0 )
      {
         AV7Prdnum_to = httpContext.cgiGet( sCtrlAV7Prdnum_to) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7Prdnum_to", AV7Prdnum_to);
      }
      else
      {
         AV7Prdnum_to = httpContext.cgiGet( sPrefix+"AV7Prdnum_to_PARM") ;
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
      sCtrlAV9Prvnum_to = httpContext.cgiGet( sPrefix+"AV9Prvnum_to_CTRL") ;
      if ( GXutil.len( sCtrlAV9Prvnum_to) > 0 )
      {
         AV9Prvnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV9Prvnum_to), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV9Prvnum_to", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV9Prvnum_to), 6, 0));
      }
      else
      {
         AV9Prvnum_to = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV9Prvnum_to_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV10Dias = httpContext.cgiGet( sPrefix+"AV10Dias_CTRL") ;
      if ( GXutil.len( sCtrlAV10Dias) > 0 )
      {
         AV10Dias = (short)(localUtil.ctol( httpContext.cgiGet( sCtrlAV10Dias), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Dias", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Dias), 4, 0));
      }
      else
      {
         AV10Dias = (short)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV10Dias_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
      pa1DP2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1DP2( ) ;
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
      ws1DP2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Prdnum_PARM", GXutil.rtrim( AV6Prdnum));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Prdnum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Prdnum_CTRL", GXutil.rtrim( sCtrlAV6Prdnum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Prdnum_to_PARM", GXutil.rtrim( AV7Prdnum_to));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7Prdnum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7Prdnum_to_CTRL", GXutil.rtrim( sCtrlAV7Prdnum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrvNum_PARM", GXutil.ltrim( localUtil.ntoc( AV8PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8PrvNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8PrvNum_CTRL", GXutil.rtrim( sCtrlAV8PrvNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Prvnum_to_PARM", GXutil.ltrim( localUtil.ntoc( AV9Prvnum_to, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV9Prvnum_to)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV9Prvnum_to_CTRL", GXutil.rtrim( sCtrlAV9Prvnum_to));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Dias_PARM", GXutil.ltrim( localUtil.ntoc( AV10Dias, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV10Dias)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV10Dias_CTRL", GXutil.rtrim( sCtrlAV10Dias));
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
      we1DP2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821168139", true, true);
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
      httpContext.AddJavascriptSource("controlproductossinmovimientos_wc.js", "?2026821168140", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_412( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_41_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_41_idx ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_41_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_41_idx ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM_"+sGXsfl_41_idx ;
      edtPrdUcpDsc_Internalname = sPrefix+"PRDUCPDSC_"+sGXsfl_41_idx ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT_"+sGXsfl_41_idx ;
      edtavValor_Internalname = sPrefix+"vVALOR_"+sGXsfl_41_idx ;
      edtPrdDiasIna_Internalname = sPrefix+"PRDDIASINA_"+sGXsfl_41_idx ;
      edtPrdLastFec_Internalname = sPrefix+"PRDLASTFEC_"+sGXsfl_41_idx ;
      edtPrdLastTip_Internalname = sPrefix+"PRDLASTTIP_"+sGXsfl_41_idx ;
   }

   public void subsflControlProps_fel_412( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_41_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_41_fel_idx ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM_"+sGXsfl_41_fel_idx ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM_"+sGXsfl_41_fel_idx ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM_"+sGXsfl_41_fel_idx ;
      edtPrdUcpDsc_Internalname = sPrefix+"PRDUCPDSC_"+sGXsfl_41_fel_idx ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT_"+sGXsfl_41_fel_idx ;
      edtavValor_Internalname = sPrefix+"vVALOR_"+sGXsfl_41_fel_idx ;
      edtPrdDiasIna_Internalname = sPrefix+"PRDDIASINA_"+sGXsfl_41_fel_idx ;
      edtPrdLastFec_Internalname = sPrefix+"PRDLASTFEC_"+sGXsfl_41_fel_idx ;
      edtPrdLastTip_Internalname = sPrefix+"PRDLASTTIP_"+sGXsfl_41_fel_idx ;
   }

   public void sendrow_412( )
   {
      subsflControlProps_412( ) ;
      wb1DP0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_41_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_41_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_41_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNum_Internalname,GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A795PrvNum), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrvNom_Internalname,GXutil.rtrim( A794PrvNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrvNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrvNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(30),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdExiAlm_Internalname,GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A704PrdExiAlm, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdExiAlm_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdExiAlm_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdUcpDsc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdUcpDsc_Internalname,GXutil.rtrim( A737PrdUcpDsc),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdUcpDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdUcpDsc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdPreAct_Internalname,GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A724PrdPreAct, "ZZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdPreAct_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdPreAct_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavValor_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValor_Internalname,GXutil.ltrim( localUtil.ntoc( AV64Valor, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValor_Enabled!=0) ? localUtil.format( AV64Valor, "ZZZZZZ9.9999") : localUtil.format( AV64Valor, "ZZZZZZ9.9999"))),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavValor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavValor_Visible),Integer.valueOf(edtavValor_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdDiasIna_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdDiasIna_Internalname,GXutil.ltrim( localUtil.ntoc( A13871PrdDiasIna, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13871PrdDiasIna), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdDiasIna_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdDiasIna_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtPrdLastFec_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdLastFec_Internalname,localUtil.format(A13876PrdLastFec, "99/99/99"),localUtil.format( A13876PrdLastFec, "99/99/99"),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdLastFec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdLastFec_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdLastTip_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdLastTip_Internalname,GXutil.rtrim( A13877PrdLastTip),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdLastTip_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdLastTip_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(41),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes1DP2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_41_idx = ((subGrid_Islastpage==1)&&(nGXsfl_41_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_41_idx+1) ;
         sGXsfl_41_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_41_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_412( ) ;
      }
      /* End function sendrow_412 */
   }

   public void startgridcontrol41( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"41\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Proveedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrvNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nombre", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdExiAlm_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Existencias", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdUcpDsc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdPreAct_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavValor_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdDiasIna_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dias", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdLastFec_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fech Ult ", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdLastTip_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Tipo Mov", "")) ;
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
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A795PrvNum, (byte)(6), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNum_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A794PrvNom));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrvNom_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A704PrdExiAlm, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdExiAlm_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A737PrdUcpDsc));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdUcpDsc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdPreAct_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV64Valor, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValor_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavValor_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13871PrdDiasIna, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdDiasIna_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(A13876PrdLastFec, "99/99/99"));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdLastFec_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13877PrdLastTip));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtPrdLastTip_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexportcsv_Internalname = sPrefix+"BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = sPrefix+"BTNEDITCOLUMNS" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtPrvNum_Internalname = sPrefix+"PRVNUM" ;
      edtPrvNom_Internalname = sPrefix+"PRVNOM" ;
      edtPrdExiAlm_Internalname = sPrefix+"PRDEXIALM" ;
      edtPrdUcpDsc_Internalname = sPrefix+"PRDUCPDSC" ;
      edtPrdPreAct_Internalname = sPrefix+"PRDPREACT" ;
      edtavValor_Internalname = sPrefix+"vVALOR" ;
      edtPrdDiasIna_Internalname = sPrefix+"PRDDIASINA" ;
      edtPrdLastFec_Internalname = sPrefix+"PRDLASTFEC" ;
      edtPrdLastTip_Internalname = sPrefix+"PRDLASTTIP" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = sPrefix+"DDO_GRIDCOLUMNSSELECTOR" ;
      Grid_empowerer_Internalname = sPrefix+"GRID_EMPOWERER" ;
      edtavDdo_prdlastfechccauxdate_Internalname = sPrefix+"vDDO_PRDLASTFECHCCAUXDATE" ;
      divDdo_prdlastfechccauxdates_Internalname = sPrefix+"DDO_PRDLASTFECHCCAUXDATES" ;
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
      edtPrdLastTip_Jsonclick = "" ;
      edtPrdLastFec_Jsonclick = "" ;
      edtPrdDiasIna_Jsonclick = "" ;
      edtavValor_Jsonclick = "" ;
      edtavValor_Enabled = 0 ;
      edtPrdPreAct_Jsonclick = "" ;
      edtPrdUcpDsc_Jsonclick = "" ;
      edtPrdExiAlm_Jsonclick = "" ;
      edtPrvNom_Jsonclick = "" ;
      edtPrvNum_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      edtPrdLastTip_Visible = -1 ;
      edtPrdLastFec_Visible = -1 ;
      edtPrdDiasIna_Visible = -1 ;
      edtavValor_Visible = -1 ;
      edtPrdPreAct_Visible = -1 ;
      edtPrdUcpDsc_Visible = -1 ;
      edtPrdExiAlm_Visible = -1 ;
      edtPrvNom_Visible = -1 ;
      edtPrvNum_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavDdo_prdlastfechccauxdate_Jsonclick = "" ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "ControlProductossinMovimientos_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||Dynamic||Dynamic|||||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T||T||T|||||T" ;
      Ddo_grid_Filterisrange = "||T||T||T||T||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Character|Numeric|Character|Numeric||Numeric|Date|Character" ;
      Ddo_grid_Includefilter = "T|T|T|T|T|T|T||T|T|T" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|T|T|T|T||||" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5|6|7||||" ;
      Ddo_grid_Columnids = "0:PrdNum|1:PrdNom|2:PrvNum|3:PrvNom|4:PrdExiAlm|5:PrdUcpDsc|6:PrdPreAct|7:Valor|8:PrdDiasInactivo|9:PrdLastFechCC|10:PrdLastTipMovCC" ;
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'sPrefix'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV9Prvnum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV10Dias',fld:'vDIAS',pic:'ZZZ9'},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV69TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV66TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV67TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFPrdDiasInactivo',fld:'vTFPRDDIASINACTIVO',pic:'ZZZ9'},{av:'AV49TFPrdDiasInactivo_To',fld:'vTFPRDDIASINACTIVO_TO',pic:'ZZZ9'},{av:'AV56TFPrdLastFechCC',fld:'vTFPRDLASTFECHCC',pic:''},{av:'AV62TFPrdLastTipMovCC',fld:'vTFPRDLASTTIPMOVCC',pic:''},{av:'AV63TFPrdLastTipMovCC_Sel',fld:'vTFPRDLASTTIPMOVCC_SEL',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdUcpDsc_Visible',ctrl:'PRDUCPDSC',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'edtPrdDiasIna_Visible',ctrl:'PRDDIASINA',prop:'Visible'},{av:'edtPrdLastFec_Visible',ctrl:'PRDLASTFEC',prop:'Visible'},{av:'edtPrdLastTip_Visible',ctrl:'PRDLASTTIP',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e121DP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV9Prvnum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV10Dias',fld:'vDIAS',pic:'ZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV69TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV66TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV67TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFPrdDiasInactivo',fld:'vTFPRDDIASINACTIVO',pic:'ZZZ9'},{av:'AV49TFPrdDiasInactivo_To',fld:'vTFPRDDIASINACTIVO_TO',pic:'ZZZ9'},{av:'AV56TFPrdLastFechCC',fld:'vTFPRDLASTFECHCC',pic:''},{av:'AV62TFPrdLastTipMovCC',fld:'vTFPRDLASTTIPMOVCC',pic:''},{av:'AV63TFPrdLastTipMovCC_Sel',fld:'vTFPRDLASTTIPMOVCC_SEL',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e131DP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV9Prvnum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV10Dias',fld:'vDIAS',pic:'ZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV69TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV66TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV67TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFPrdDiasInactivo',fld:'vTFPRDDIASINACTIVO',pic:'ZZZ9'},{av:'AV49TFPrdDiasInactivo_To',fld:'vTFPRDDIASINACTIVO_TO',pic:'ZZZ9'},{av:'AV56TFPrdLastFechCC',fld:'vTFPRDLASTFECHCC',pic:''},{av:'AV62TFPrdLastTipMovCC',fld:'vTFPRDLASTTIPMOVCC',pic:''},{av:'AV63TFPrdLastTipMovCC_Sel',fld:'vTFPRDLASTTIPMOVCC_SEL',pic:''},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e141DP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV9Prvnum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV10Dias',fld:'vDIAS',pic:'ZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV69TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV66TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV67TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFPrdDiasInactivo',fld:'vTFPRDDIASINACTIVO',pic:'ZZZ9'},{av:'AV49TFPrdDiasInactivo_To',fld:'vTFPRDDIASINACTIVO_TO',pic:'ZZZ9'},{av:'AV56TFPrdLastFechCC',fld:'vTFPRDLASTFECHCC',pic:''},{av:'AV62TFPrdLastTipMovCC',fld:'vTFPRDLASTTIPMOVCC',pic:''},{av:'AV63TFPrdLastTipMovCC_Sel',fld:'vTFPRDLASTTIPMOVCC_SEL',pic:''},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV62TFPrdLastTipMovCC',fld:'vTFPRDLASTTIPMOVCC',pic:''},{av:'AV63TFPrdLastTipMovCC_Sel',fld:'vTFPRDLASTTIPMOVCC_SEL',pic:''},{av:'AV56TFPrdLastFechCC',fld:'vTFPRDLASTFECHCC',pic:''},{av:'AV48TFPrdDiasInactivo',fld:'vTFPRDDIASINACTIVO',pic:'ZZZ9'},{av:'AV49TFPrdDiasInactivo_To',fld:'vTFPRDDIASINACTIVO_TO',pic:'ZZZ9'},{av:'AV66TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV67TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV68TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV69TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV40TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e201DP2',iparms:[{av:'A704PrdExiAlm',fld:'PRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV64Valor',fld:'vVALOR',pic:'ZZZZZZ9.9999'}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e151DP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV9Prvnum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV10Dias',fld:'vDIAS',pic:'ZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV69TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV66TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV67TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFPrdDiasInactivo',fld:'vTFPRDDIASINACTIVO',pic:'ZZZ9'},{av:'AV49TFPrdDiasInactivo_To',fld:'vTFPRDDIASINACTIVO_TO',pic:'ZZZ9'},{av:'AV56TFPrdLastFechCC',fld:'vTFPRDLASTFECHCC',pic:''},{av:'AV62TFPrdLastTipMovCC',fld:'vTFPRDLASTTIPMOVCC',pic:''},{av:'AV63TFPrdLastTipMovCC_Sel',fld:'vTFPRDLASTTIPMOVCC_SEL',pic:''},{av:'sPrefix'},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdUcpDsc_Visible',ctrl:'PRDUCPDSC',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'edtPrdDiasIna_Visible',ctrl:'PRDDIASINA',prop:'Visible'},{av:'edtPrdLastFec_Visible',ctrl:'PRDLASTFEC',prop:'Visible'},{av:'edtPrdLastTip_Visible',ctrl:'PRDLASTTIP',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e111DP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Prdnum',fld:'vPRDNUM',pic:''},{av:'AV7Prdnum_to',fld:'vPRDNUM_TO',pic:''},{av:'AV8PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV9Prvnum_to',fld:'vPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV10Dias',fld:'vDIAS',pic:'ZZZ9'},{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV72Pgmname',fld:'vPGMNAME',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV69TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV66TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV67TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFPrdDiasInactivo',fld:'vTFPRDDIASINACTIVO',pic:'ZZZ9'},{av:'AV49TFPrdDiasInactivo_To',fld:'vTFPRDDIASINACTIVO_TO',pic:'ZZZ9'},{av:'AV56TFPrdLastFechCC',fld:'vTFPRDLASTFECHCC',pic:''},{av:'AV62TFPrdLastTipMovCC',fld:'vTFPRDLASTTIPMOVCC',pic:''},{av:'AV63TFPrdLastTipMovCC_Sel',fld:'vTFPRDLASTTIPMOVCC_SEL',pic:''},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV31ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV16GridState',fld:'vGRIDSTATE',pic:''},{av:'AV18OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV19OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV32TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV33TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV34TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV35TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV36TFPrvNum',fld:'vTFPRVNUM',pic:'ZZZZZ9'},{av:'AV37TFPrvNum_To',fld:'vTFPRVNUM_TO',pic:'ZZZZZ9'},{av:'AV38TFPrvNom',fld:'vTFPRVNOM',pic:''},{av:'AV39TFPrvNom_Sel',fld:'vTFPRVNOM_SEL',pic:''},{av:'AV40TFPrdExiAlm',fld:'vTFPRDEXIALM',pic:'ZZZZZZ9.9999'},{av:'AV41TFPrdExiAlm_To',fld:'vTFPRDEXIALM_TO',pic:'ZZZZZZ9.9999'},{av:'AV68TFPrdUcpDsc',fld:'vTFPRDUCPDSC',pic:''},{av:'AV69TFPrdUcpDsc_Sel',fld:'vTFPRDUCPDSC_SEL',pic:''},{av:'AV66TFPrdPreAct',fld:'vTFPRDPREACT',pic:'ZZZZZZZ9.999'},{av:'AV67TFPrdPreAct_To',fld:'vTFPRDPREACT_TO',pic:'ZZZZZZZ9.999'},{av:'AV48TFPrdDiasInactivo',fld:'vTFPRDDIASINACTIVO',pic:'ZZZ9'},{av:'AV49TFPrdDiasInactivo_To',fld:'vTFPRDDIASINACTIVO_TO',pic:'ZZZ9'},{av:'AV56TFPrdLastFechCC',fld:'vTFPRDLASTFECHCC',pic:''},{av:'AV62TFPrdLastTipMovCC',fld:'vTFPRDLASTTIPMOVCC',pic:''},{av:'AV63TFPrdLastTipMovCC_Sel',fld:'vTFPRDLASTTIPMOVCC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV26ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtPrvNum_Visible',ctrl:'PRVNUM',prop:'Visible'},{av:'edtPrvNom_Visible',ctrl:'PRVNOM',prop:'Visible'},{av:'edtPrdExiAlm_Visible',ctrl:'PRDEXIALM',prop:'Visible'},{av:'edtPrdUcpDsc_Visible',ctrl:'PRDUCPDSC',prop:'Visible'},{av:'edtPrdPreAct_Visible',ctrl:'PRDPREACT',prop:'Visible'},{av:'edtavValor_Visible',ctrl:'vVALOR',prop:'Visible'},{av:'edtPrdDiasIna_Visible',ctrl:'PRDDIASINA',prop:'Visible'},{av:'edtPrdLastFec_Visible',ctrl:'PRDLASTFEC',prop:'Visible'},{av:'edtPrdLastTip_Visible',ctrl:'PRDLASTTIP',prop:'Visible'},{av:'AV52GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV53GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV29ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e161DP2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e171DP2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDNOM","{handler:'valid_Prdnom',iparms:[]");
      setEventMetadata("VALID_PRDNOM",",oparms:[]}");
      setEventMetadata("VALID_PRVNUM","{handler:'valid_Prvnum',iparms:[]");
      setEventMetadata("VALID_PRVNUM",",oparms:[]}");
      setEventMetadata("VALID_PRVNOM","{handler:'valid_Prvnom',iparms:[]");
      setEventMetadata("VALID_PRVNOM",",oparms:[]}");
      setEventMetadata("VALID_PRDEXIALM","{handler:'valid_Prdexialm',iparms:[]");
      setEventMetadata("VALID_PRDEXIALM",",oparms:[]}");
      setEventMetadata("VALID_PRDUCPDSC","{handler:'valid_Prducpdsc',iparms:[]");
      setEventMetadata("VALID_PRDUCPDSC",",oparms:[]}");
      setEventMetadata("VALID_PRDPREACT","{handler:'valid_Prdpreact',iparms:[]");
      setEventMetadata("VALID_PRDPREACT",",oparms:[]}");
      setEventMetadata("VALID_PRDDIASINA","{handler:'valid_Prddiasina',iparms:[]");
      setEventMetadata("VALID_PRDDIASINA",",oparms:[]}");
      setEventMetadata("VALID_PRDLASTFEC","{handler:'valid_Prdlastfec',iparms:[]");
      setEventMetadata("VALID_PRDLASTFEC",",oparms:[]}");
      setEventMetadata("VALID_PRDLASTTIP","{handler:'valid_Prdlasttip',iparms:[]");
      setEventMetadata("VALID_PRDLASTTIP",",oparms:[]}");
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
   public String getPrdLastTip0( String E396EmprCod ,
                                 String E719PrdNum ,
                                 long E13873PrdUltMovC )
   {
      X3345TipMovCc = "" ;
      Gx_first = true ;
      /* Using cursor H01DP4 */
      pr_default.execute(2, new Object[] {E396EmprCod, E719PrdNum, Long.valueOf(E13873PrdUltMovC)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         if ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E719PrdNum, E719PrdNum) == 0 ) && ( H01DP4_A3342CCStkLin[0] == E13873PrdUltMovC ) )
         {
            X3345TipMovCc = H01DP4_A3345TipMovCc[0] ;
            if (true) break;
         }
         pr_default.readNext(2);
      }
      pr_default.close(2);
      return X3345TipMovCc ;
   }

   public java.util.Date getPrdLastFec0( String E396EmprCod ,
                                         String E719PrdNum ,
                                         long E13873PrdUltMovC )
   {
      X3348CCStkFec = GXutil.nullDate() ;
      Gx_first = true ;
      /* Using cursor H01DP5 */
      pr_default.execute(3, new Object[] {E396EmprCod, E719PrdNum, Long.valueOf(E13873PrdUltMovC)});
      while ( (pr_default.getStatus(3) != 101) )
      {
         if ( ( GXutil.strcmp(E396EmprCod, E396EmprCod) == 0 ) && ( GXutil.strcmp(E719PrdNum, E719PrdNum) == 0 ) && ( H01DP5_A3342CCStkLin[0] == E13873PrdUltMovC ) )
         {
            X3348CCStkFec = H01DP5_A3348CCStkFec[0] ;
            if (true) break;
         }
         pr_default.readNext(3);
      }
      pr_default.close(3);
      return X3348CCStkFec ;
   }

   public void initialize( )
   {
      wcpOAV5Emprcod = "" ;
      wcpOAV6Prdnum = "" ;
      wcpOAV7Prdnum_to = "" ;
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
      AV5Emprcod = "" ;
      AV6Prdnum = "" ;
      AV7Prdnum_to = "" ;
      AV21FilterFullText = "" ;
      AV26ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV72Pgmname = "" ;
      AV32TFPrdNum = "" ;
      AV33TFPrdNum_Sel = "" ;
      AV34TFPrdNom = "" ;
      AV35TFPrdNom_Sel = "" ;
      AV38TFPrvNom = "" ;
      AV39TFPrvNom_Sel = "" ;
      AV40TFPrdExiAlm = DecimalUtil.ZERO ;
      AV41TFPrdExiAlm_To = DecimalUtil.ZERO ;
      AV68TFPrdUcpDsc = "" ;
      AV69TFPrdUcpDsc_Sel = "" ;
      AV66TFPrdPreAct = DecimalUtil.ZERO ;
      AV67TFPrdPreAct_To = DecimalUtil.ZERO ;
      AV56TFPrdLastFechCC = GXutil.nullDate() ;
      AV62TFPrdLastTipMovCC = "" ;
      AV63TFPrdLastTipMovCC_Sel = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV29ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV50DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV16GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      A396EmprCod = "" ;
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
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      AV58DDO_PrdLastFechCCAuxDate = GXutil.nullDate() ;
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A794PrvNom = "" ;
      A704PrdExiAlm = DecimalUtil.ZERO ;
      A737PrdUcpDsc = "" ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV64Valor = DecimalUtil.ZERO ;
      A13876PrdLastFec = GXutil.nullDate() ;
      A13877PrdLastTip = "" ;
      scmdbuf = "" ;
      lV32TFPrdNum = "" ;
      lV34TFPrdNom = "" ;
      lV38TFPrvNom = "" ;
      lV68TFPrdUcpDsc = "" ;
      H01DP2_A742PrdUniCom = new byte[1] ;
      H01DP2_A4338PrdUMeFo = new byte[1] ;
      H01DP2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01DP2_A737PrdUcpDsc = new String[] {""} ;
      H01DP2_n737PrdUcpDsc = new boolean[] {false} ;
      H01DP2_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01DP2_A794PrvNom = new String[] {""} ;
      H01DP2_n794PrvNom = new boolean[] {false} ;
      H01DP2_A795PrvNum = new int[1] ;
      H01DP2_A718PrdNom = new String[] {""} ;
      H01DP2_A719PrdNum = new String[] {""} ;
      H01DP2_A396EmprCod = new String[] {""} ;
      H01DP3_A742PrdUniCom = new byte[1] ;
      H01DP3_A4338PrdUMeFo = new byte[1] ;
      H01DP3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01DP3_A737PrdUcpDsc = new String[] {""} ;
      H01DP3_n737PrdUcpDsc = new boolean[] {false} ;
      H01DP3_A704PrdExiAlm = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01DP3_A794PrvNom = new String[] {""} ;
      H01DP3_n794PrvNom = new boolean[] {false} ;
      H01DP3_A795PrvNum = new int[1] ;
      H01DP3_A718PrdNom = new String[] {""} ;
      H01DP3_A719PrdNum = new String[] {""} ;
      H01DP3_A396EmprCod = new String[] {""} ;
      GXv_int4 = new short[1] ;
      GXv_int6 = new long[1] ;
      hsh = "" ;
      AV65ForPrdDsc = "" ;
      AV73Station = "" ;
      AV74Emprnom = "" ;
      AV75Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV12WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV28Session = httpContext.getWebSession();
      AV24ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV30ManageFiltersXml = "" ;
      AV22ExcelFilename = "" ;
      AV23ErrorMessage = "" ;
      AV25UserCustomValue = "" ;
      AV27ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector12 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector13 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15 = new GXBaseCollection[1] ;
      AV17GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char20 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char18 = "" ;
      GXv_char19 = new String[1] ;
      GXt_char17 = "" ;
      GXv_char8 = new String[1] ;
      GXt_char16 = "" ;
      GXv_char3 = new String[1] ;
      GXt_char7 = "" ;
      GXv_char2 = new String[1] ;
      GXv_SdtWWPGridState22 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV14TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV13HTTPRequest = httpContext.getHttpRequest();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6Prdnum = "" ;
      sCtrlAV7Prdnum_to = "" ;
      sCtrlAV8PrvNum = "" ;
      sCtrlAV9Prvnum_to = "" ;
      sCtrlAV10Dias = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      X3345TipMovCc = "" ;
      E396EmprCod = "" ;
      E719PrdNum = "" ;
      H01DP4_A396EmprCod = new String[] {""} ;
      H01DP4_A719PrdNum = new String[] {""} ;
      H01DP4_A3342CCStkLin = new long[1] ;
      H01DP4_A3345TipMovCc = new String[] {""} ;
      X3348CCStkFec = GXutil.nullDate() ;
      H01DP5_A396EmprCod = new String[] {""} ;
      H01DP5_A719PrdNum = new String[] {""} ;
      H01DP5_A3342CCStkLin = new long[1] ;
      H01DP5_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlproductossinmovimientos_wc__default(),
         new Object[] {
             new Object[] {
            H01DP2_A742PrdUniCom, H01DP2_A4338PrdUMeFo, H01DP2_A724PrdPreAct, H01DP2_A737PrdUcpDsc, H01DP2_n737PrdUcpDsc, H01DP2_A704PrdExiAlm, H01DP2_A794PrvNom, H01DP2_n794PrvNom, H01DP2_A795PrvNum, H01DP2_A718PrdNom,
            H01DP2_A719PrdNum, H01DP2_A396EmprCod
            }
            , new Object[] {
            H01DP3_A742PrdUniCom, H01DP3_A4338PrdUMeFo, H01DP3_A724PrdPreAct, H01DP3_A737PrdUcpDsc, H01DP3_n737PrdUcpDsc, H01DP3_A704PrdExiAlm, H01DP3_A794PrvNom, H01DP3_n794PrvNom, H01DP3_A795PrvNum, H01DP3_A718PrdNom,
            H01DP3_A719PrdNum, H01DP3_A396EmprCod
            }
            , new Object[] {
            H01DP4_A396EmprCod, H01DP4_A719PrdNum, H01DP4_A3342CCStkLin, H01DP4_A3345TipMovCc
            }
            , new Object[] {
            H01DP5_A396EmprCod, H01DP5_A719PrdNum, H01DP5_A3342CCStkLin, H01DP5_A3348CCStkFec
            }
         }
      );
      AV72Pgmname = "ControlProductossinMovimientos_WC" ;
      /* GeneXus formulas. */
      AV72Pgmname = "ControlProductossinMovimientos_WC" ;
      Gx_err = (short)(0) ;
      edtavValor_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV31ManageFiltersExecutionStep ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte nDonePA ;
   private byte A742PrdUniCom ;
   private byte A4338PrdUMeFo ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV10Dias ;
   private short AV10Dias ;
   private short AV18OrderedBy ;
   private short AV48TFPrdDiasInactivo ;
   private short AV49TFPrdDiasInactivo_To ;
   private short wbEnd ;
   private short wbStart ;
   private short A13871PrdDiasIna ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXt_int1 ;
   private short GXv_int4[] ;
   private int wcpOAV8PrvNum ;
   private int wcpOAV9Prvnum_to ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_41 ;
   private int AV8PrvNum ;
   private int AV9Prvnum_to ;
   private int nGXsfl_41_idx=1 ;
   private int AV36TFPrvNum ;
   private int AV37TFPrvNum_To ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int A795PrvNum ;
   private int subGrid_Islastpage ;
   private int edtavValor_Enabled ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtPrvNum_Visible ;
   private int edtPrvNom_Visible ;
   private int edtPrdExiAlm_Visible ;
   private int edtPrdUcpDsc_Visible ;
   private int edtPrdPreAct_Visible ;
   private int edtavValor_Visible ;
   private int edtPrdDiasIna_Visible ;
   private int edtPrdLastFec_Visible ;
   private int edtPrdLastTip_Visible ;
   private int AV51PageToGo ;
   private int AV76GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV52GridCurrentPage ;
   private long AV53GridPageCount ;
   private long A13873PrdUltMovC ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private long GXt_int5 ;
   private long GXv_int6[] ;
   private long E13873PrdUltMovC ;
   private java.math.BigDecimal AV40TFPrdExiAlm ;
   private java.math.BigDecimal AV41TFPrdExiAlm_To ;
   private java.math.BigDecimal AV66TFPrdPreAct ;
   private java.math.BigDecimal AV67TFPrdPreAct_To ;
   private java.math.BigDecimal A704PrdExiAlm ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV64Valor ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV6Prdnum ;
   private String wcpOAV7Prdnum_to ;
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
   private String AV5Emprcod ;
   private String AV6Prdnum ;
   private String AV7Prdnum_to ;
   private String sGXsfl_41_idx="0001" ;
   private String AV72Pgmname ;
   private String AV32TFPrdNum ;
   private String AV33TFPrdNum_Sel ;
   private String AV34TFPrdNom ;
   private String AV35TFPrdNom_Sel ;
   private String AV38TFPrvNom ;
   private String AV39TFPrvNom_Sel ;
   private String AV68TFPrdUcpDsc ;
   private String AV69TFPrdUcpDsc_Sel ;
   private String AV62TFPrdLastTipMovCC ;
   private String AV63TFPrdLastTipMovCC_Sel ;
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
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String divDdo_prdlastfechccauxdates_Internalname ;
   private String edtavDdo_prdlastfechccauxdate_Internalname ;
   private String edtavDdo_prdlastfechccauxdate_Jsonclick ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavFilterfulltext_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtPrvNum_Internalname ;
   private String A794PrvNom ;
   private String edtPrvNom_Internalname ;
   private String edtPrdExiAlm_Internalname ;
   private String A737PrdUcpDsc ;
   private String edtPrdUcpDsc_Internalname ;
   private String edtPrdPreAct_Internalname ;
   private String edtavValor_Internalname ;
   private String edtPrdDiasIna_Internalname ;
   private String edtPrdLastFec_Internalname ;
   private String A13877PrdLastTip ;
   private String edtPrdLastTip_Internalname ;
   private String scmdbuf ;
   private String lV32TFPrdNum ;
   private String lV34TFPrdNom ;
   private String lV38TFPrvNom ;
   private String lV68TFPrdUcpDsc ;
   private String hsh ;
   private String AV65ForPrdDsc ;
   private String AV73Station ;
   private String AV74Emprnom ;
   private String AV75Usurcod ;
   private String GXt_char20 ;
   private String GXv_char21[] ;
   private String GXt_char18 ;
   private String GXv_char19[] ;
   private String GXt_char17 ;
   private String GXv_char8[] ;
   private String GXt_char16 ;
   private String GXv_char3[] ;
   private String GXt_char7 ;
   private String GXv_char2[] ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6Prdnum ;
   private String sCtrlAV7Prdnum_to ;
   private String sCtrlAV8PrvNum ;
   private String sCtrlAV9Prvnum_to ;
   private String sCtrlAV10Dias ;
   private String sGXsfl_41_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPrvNum_Jsonclick ;
   private String edtPrvNom_Jsonclick ;
   private String edtPrdExiAlm_Jsonclick ;
   private String edtPrdUcpDsc_Jsonclick ;
   private String edtPrdPreAct_Jsonclick ;
   private String edtavValor_Jsonclick ;
   private String edtPrdDiasIna_Jsonclick ;
   private String edtPrdLastFec_Jsonclick ;
   private String edtPrdLastTip_Jsonclick ;
   private String subGrid_Header ;
   private String X3345TipMovCc ;
   private String E396EmprCod ;
   private String E719PrdNum ;
   private java.util.Date AV56TFPrdLastFechCC ;
   private java.util.Date AV58DDO_PrdLastFechCCAuxDate ;
   private java.util.Date A13876PrdLastFec ;
   private java.util.Date X3348CCStkFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV19OrderedDsc ;
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
   private boolean n794PrvNom ;
   private boolean n737PrdUcpDsc ;
   private boolean bGXsfl_41_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Gx_first ;
   private String AV24ColumnsSelectorXML ;
   private String AV30ManageFiltersXml ;
   private String AV25UserCustomValue ;
   private String AV21FilterFullText ;
   private String AV22ExcelFilename ;
   private String AV23ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV13HTTPRequest ;
   private com.genexus.webpanels.WebSession AV28Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private byte[] H01DP2_A742PrdUniCom ;
   private byte[] H01DP2_A4338PrdUMeFo ;
   private java.math.BigDecimal[] H01DP2_A724PrdPreAct ;
   private String[] H01DP2_A737PrdUcpDsc ;
   private boolean[] H01DP2_n737PrdUcpDsc ;
   private java.math.BigDecimal[] H01DP2_A704PrdExiAlm ;
   private String[] H01DP2_A794PrvNom ;
   private boolean[] H01DP2_n794PrvNom ;
   private int[] H01DP2_A795PrvNum ;
   private String[] H01DP2_A718PrdNom ;
   private String[] H01DP2_A719PrdNum ;
   private String[] H01DP2_A396EmprCod ;
   private byte[] H01DP3_A742PrdUniCom ;
   private byte[] H01DP3_A4338PrdUMeFo ;
   private java.math.BigDecimal[] H01DP3_A724PrdPreAct ;
   private String[] H01DP3_A737PrdUcpDsc ;
   private boolean[] H01DP3_n737PrdUcpDsc ;
   private java.math.BigDecimal[] H01DP3_A704PrdExiAlm ;
   private String[] H01DP3_A794PrvNom ;
   private boolean[] H01DP3_n794PrvNom ;
   private int[] H01DP3_A795PrvNum ;
   private String[] H01DP3_A718PrdNom ;
   private String[] H01DP3_A719PrdNum ;
   private String[] H01DP3_A396EmprCod ;
   private String[] H01DP4_A396EmprCod ;
   private String[] H01DP4_A719PrdNum ;
   private long[] H01DP4_A3342CCStkLin ;
   private String[] H01DP4_A3345TipMovCc ;
   private String[] H01DP5_A396EmprCod ;
   private String[] H01DP5_A719PrdNum ;
   private long[] H01DP5_A3342CCStkLin ;
   private java.util.Date[] H01DP5_A3348CCStkFec ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV29ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item14 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item15[] ;
   private app.wwpbaseobjects.SdtWWPContext AV12WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV14TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV16GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState22[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV17GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV26ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV27ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector12[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector13[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV50DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
}

final  class controlproductossinmovimientos_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01DP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV33TFPrdNum_Sel ,
                                          String AV32TFPrdNum ,
                                          String AV35TFPrdNom_Sel ,
                                          String AV34TFPrdNom ,
                                          int AV36TFPrvNum ,
                                          int AV37TFPrvNum_To ,
                                          String AV39TFPrvNom_Sel ,
                                          String AV38TFPrvNom ,
                                          java.math.BigDecimal AV40TFPrdExiAlm ,
                                          java.math.BigDecimal AV41TFPrdExiAlm_To ,
                                          String AV69TFPrdUcpDsc_Sel ,
                                          String AV68TFPrdUcpDsc ,
                                          java.math.BigDecimal AV66TFPrdPreAct ,
                                          java.math.BigDecimal AV67TFPrdPreAct_To ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV21FilterFullText ,
                                          short A13871PrdDiasIna ,
                                          String A13877PrdLastTip ,
                                          short AV48TFPrdDiasInactivo ,
                                          short AV49TFPrdDiasInactivo_To ,
                                          java.util.Date AV56TFPrdLastFechCC ,
                                          java.util.Date A13876PrdLastFec ,
                                          String AV63TFPrdLastTipMovCC_Sel ,
                                          String AV62TFPrdLastTipMovCC ,
                                          int AV8PrvNum ,
                                          int AV9Prvnum_to ,
                                          short AV10Dias ,
                                          String AV5Emprcod ,
                                          String AV6Prdnum ,
                                          String A396EmprCod ,
                                          String AV7Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[19];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdUMeFo, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdExiAlm, T2.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum, T1.EmprCod FROM ((TXPPRODUC" ;
      scmdbuf += " T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdExiAlm > 0)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( (GXutil.strcmp("", AV33TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (0==AV36TFPrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (0==AV37TFPrvNum_To) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39TFPrvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFPrvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39TFPrvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdExiAlm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdExiAlm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69TFPrdUcpDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV68TFPrdUcpDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69TFPrdUcpDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int23[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdPreAct)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int23[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPrdPreAct_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int23[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNom" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.UniDsc" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.UniDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
      GXv_Object24[0] = scmdbuf ;
      GXv_Object24[1] = GXv_int23 ;
      return GXv_Object24 ;
   }

   protected Object[] conditional_H01DP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV33TFPrdNum_Sel ,
                                          String AV32TFPrdNum ,
                                          String AV35TFPrdNom_Sel ,
                                          String AV34TFPrdNom ,
                                          int AV36TFPrvNum ,
                                          int AV37TFPrvNum_To ,
                                          String AV39TFPrvNom_Sel ,
                                          String AV38TFPrvNom ,
                                          java.math.BigDecimal AV40TFPrdExiAlm ,
                                          java.math.BigDecimal AV41TFPrdExiAlm_To ,
                                          String AV69TFPrdUcpDsc_Sel ,
                                          String AV68TFPrdUcpDsc ,
                                          java.math.BigDecimal AV66TFPrdPreAct ,
                                          java.math.BigDecimal AV67TFPrdPreAct_To ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          int A795PrvNum ,
                                          String A794PrvNom ,
                                          java.math.BigDecimal A704PrdExiAlm ,
                                          String A737PrdUcpDsc ,
                                          java.math.BigDecimal A724PrdPreAct ,
                                          short AV18OrderedBy ,
                                          boolean AV19OrderedDsc ,
                                          String AV21FilterFullText ,
                                          short A13871PrdDiasIna ,
                                          String A13877PrdLastTip ,
                                          short AV48TFPrdDiasInactivo ,
                                          short AV49TFPrdDiasInactivo_To ,
                                          java.util.Date AV56TFPrdLastFechCC ,
                                          java.util.Date A13876PrdLastFec ,
                                          String AV63TFPrdLastTipMovCC_Sel ,
                                          String AV62TFPrdLastTipMovCC ,
                                          int AV8PrvNum ,
                                          int AV9Prvnum_to ,
                                          short AV10Dias ,
                                          String AV5Emprcod ,
                                          String AV6Prdnum ,
                                          String A396EmprCod ,
                                          String AV7Prdnum_to )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int25 = new byte[19];
      Object[] GXv_Object26 = new Object[2];
      scmdbuf = "SELECT T1.PrdUniCom AS PrdUniCom, T1.PrdUMeFo, T1.PrdPreAct, T3.UniDsc AS PrdUcpDsc, T1.PrdExiAlm, T2.PrvNom, T1.PrvNum, T1.PrdNom, T1.PrdNum, T1.EmprCod FROM ((TXPPRODUC" ;
      scmdbuf += " T1 INNER JOIN TXPPRVGEN T2 ON T2.EmprCod = T1.EmprCod AND T2.PrvNum = T1.PrvNum) INNER JOIN TXPTIPUNI T3 ON T3.EmprCod = T1.EmprCod AND T3.UniCod = T1.PrdUniCom)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PrdNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum >= ?)");
      addWhere(sWhereString, "(T1.PrvNum <= ?)");
      addWhere(sWhereString, "(T1.PrdExiAlm > 0)");
      addWhere(sWhereString, "(T1.PrdNum <= ?)");
      if ( (GXutil.strcmp("", AV33TFPrdNum_Sel)==0) && ( ! (GXutil.strcmp("", AV32TFPrdNum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV33TFPrdNum_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int25[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV35TFPrdNom_Sel)==0) && ( ! (GXutil.strcmp("", AV34TFPrdNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV35TFPrdNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNom = ?)");
      }
      else
      {
         GXv_int25[8] = (byte)(1) ;
      }
      if ( ! (0==AV36TFPrvNum) )
      {
         addWhere(sWhereString, "(T1.PrvNum >= ?)");
      }
      else
      {
         GXv_int25[9] = (byte)(1) ;
      }
      if ( ! (0==AV37TFPrvNum_To) )
      {
         addWhere(sWhereString, "(T1.PrvNum <= ?)");
      }
      else
      {
         GXv_int25[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV39TFPrvNom_Sel)==0) && ( ! (GXutil.strcmp("", AV38TFPrvNom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrvNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV39TFPrvNom_Sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrvNom = ?)");
      }
      else
      {
         GXv_int25[12] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV40TFPrdExiAlm)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm >= ?)");
      }
      else
      {
         GXv_int25[13] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV41TFPrdExiAlm_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdExiAlm <= ?)");
      }
      else
      {
         GXv_int25[14] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV69TFPrdUcpDsc_Sel)==0) && ( ! (GXutil.strcmp("", AV68TFPrdUcpDsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.UniDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int25[15] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV69TFPrdUcpDsc_Sel)==0) )
      {
         addWhere(sWhereString, "(T3.UniDsc = ?)");
      }
      else
      {
         GXv_int25[16] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV66TFPrdPreAct)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct >= ?)");
      }
      else
      {
         GXv_int25[17] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV67TFPrdPreAct_To)==0) )
      {
         addWhere(sWhereString, "(T1.PrdPreAct <= ?)");
      }
      else
      {
         GXv_int25[18] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV18OrderedBy == 1 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV18OrderedBy == 1 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNom" ;
      }
      else if ( ( AV18OrderedBy == 2 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrvNum" ;
      }
      else if ( ( AV18OrderedBy == 3 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrvNum DESC" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrvNom" ;
      }
      else if ( ( AV18OrderedBy == 4 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrvNom DESC" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm" ;
      }
      else if ( ( AV18OrderedBy == 5 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdExiAlm DESC" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T3.UniDsc" ;
      }
      else if ( ( AV18OrderedBy == 6 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T3.UniDsc DESC" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ! AV19OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct" ;
      }
      else if ( ( AV18OrderedBy == 7 ) && ( AV19OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdPreAct DESC" ;
      }
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
                  return conditional_H01DP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
            case 1 :
                  return conditional_H01DP3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , ((Number) dynConstraints[4]).intValue() , ((Number) dynConstraints[5]).intValue() , (String)dynConstraints[6] , (String)dynConstraints[7] , (java.math.BigDecimal)dynConstraints[8] , (java.math.BigDecimal)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , (String)dynConstraints[15] , ((Number) dynConstraints[16]).intValue() , (String)dynConstraints[17] , (java.math.BigDecimal)dynConstraints[18] , (String)dynConstraints[19] , (java.math.BigDecimal)dynConstraints[20] , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).shortValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).shortValue() , ((Number) dynConstraints[27]).shortValue() , (java.util.Date)dynConstraints[28] , (java.util.Date)dynConstraints[29] , (String)dynConstraints[30] , (String)dynConstraints[31] , ((Number) dynConstraints[32]).intValue() , ((Number) dynConstraints[33]).intValue() , ((Number) dynConstraints[34]).shortValue() , (String)dynConstraints[35] , (String)dynConstraints[36] , (String)dynConstraints[37] , (String)dynConstraints[38] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01DP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DP4", "SELECT EmprCod, PrdNum, CCStkLin, TipMovCc FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01DP5", "SELECT EmprCod, PrdNum, CCStkLin, CCStkFec FROM TXPCCSTKS WHERE EmprCod = ? AND PrdNum = ? AND CCStkLin = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,0, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               return;
            case 1 :
               ((byte[]) buf[0])[0] = rslt.getByte(1);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,5);
               ((String[]) buf[3])[0] = rslt.getString(4, 8);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,4);
               ((String[]) buf[6])[0] = rslt.getString(6, 30);
               ((boolean[]) buf[7])[0] = rslt.wasNull();
               ((int[]) buf[8])[0] = rslt.getInt(7);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((String[]) buf[11])[0] = rslt.getString(10, 3);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 2);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((String[]) buf[1])[0] = rslt.getString(2, 6);
               ((long[]) buf[2])[0] = rslt.getLong(3);
               ((java.util.Date[]) buf[3])[0] = rslt.getGXDate(4);
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
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[21]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 30);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 30);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[32], 4);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[33], 4);
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 8);
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[35], 8);
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[36], 5);
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[37], 5);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

