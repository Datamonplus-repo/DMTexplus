package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class controlrecuentoentrada_wc_impl extends GXWebComponent
{
   public controlrecuentoentrada_wc_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public controlrecuentoentrada_wc_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( controlrecuentoentrada_wc_impl.class ));
   }

   public controlrecuentoentrada_wc_impl( int remoteHandle ,
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
               AV23Emprcod = httpContext.GetPar( "Emprcod") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
               AV50RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50RecFec", localUtil.format(AV50RecFec, "99/99/99"));
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV23Emprcod,AV50RecFec});
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
      nRC_GXsfl_53 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_53"))) ;
      nGXsfl_53_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_53_idx"))) ;
      sGXsfl_53_idx = httpContext.GetPar( "sGXsfl_53_idx") ;
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
      AV27FilterFullText = httpContext.GetPar( "FilterFullText") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      AV40ManageFiltersExecutionStep = (byte)(GXutil.lval( httpContext.GetPar( "ManageFiltersExecutionStep"))) ;
      AV58TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV59TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV56TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV57TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV74TFRecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo"), ".") ;
      AV75TFRecExiTeo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo_To"), ".") ;
      AV60TFPrdRec = httpContext.GetPar( "TFPrdRec") ;
      AV61TFPrdRec_Sel = httpContext.GetPar( "TFPrdRec_Sel") ;
      AV101Pgmname = httpContext.GetPar( "Pgmname") ;
      AV43OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV45OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV23Emprcod = httpContext.GetPar( "Emprcod") ;
      AV50RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
      AV53Station = httpContext.GetPar( "Station") ;
      AV30FlagPreMed = (short)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
      AV29FlagCcs = (short)(GXutil.lval( httpContext.GetPar( "FlagCcs"))) ;
      AV28FlagCColor = GXutil.lval( httpContext.GetPar( "FlagCColor")) ;
      AV42Nalmcc = (short)(GXutil.lval( httpContext.GetPar( "Nalmcc"))) ;
      AV93Val_stk = (short)(GXutil.lval( httpContext.GetPar( "Val_stk"))) ;
      A808RecExiTcc = CommonUtil.decimalVal( httpContext.GetPar( "RecExiTcc"), ".") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, A396EmprCod, AV40ManageFiltersExecutionStep, AV58TFPrdNum, AV59TFPrdNum_Sel, AV56TFPrdNom, AV57TFPrdNom_Sel, AV74TFRecExiTeo, AV75TFRecExiTeo_To, AV60TFPrdRec, AV61TFPrdRec_Sel, AV101Pgmname, AV43OrderedBy, AV45OrderedDsc, AV23Emprcod, AV50RecFec, AV53Station, AV30FlagPreMed, AV29FlagCcs, AV28FlagCColor, AV42Nalmcc, AV93Val_stk, A808RecExiTcc, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         pa1SU2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( "Control Recuento, Entrada ", "")) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.controlrecuentoentrada_wc", new String[] {GXutil.URLEncode(GXutil.rtrim(AV23Emprcod)),GXutil.URLEncode(GXutil.formatDateParm(AV50RecFec))}, new String[] {"Emprcod","RecFec"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV30FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITCC", getSecureSignedToken( sPrefix, localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV28FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Val_stk), "ZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ControlRecuentoEntrada_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV101Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlrecuentoentrada_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GXH_vFILTERFULLTEXT", AV27FilterFullText);
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_53", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_53, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vMANAGEFILTERSDATA", AV39ManageFiltersData);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV32GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV33GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV20DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV23Emprcod", GXutil.rtrim( wcpOAV23Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV50RecFec", localUtil.dtoc( wcpOAV50RecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMANAGEFILTERSEXECUTIONSTEP", GXutil.ltrim( localUtil.ntoc( AV40ManageFiltersExecutionStep, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV58TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV59TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV56TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV57TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXITEO", GXutil.ltrim( localUtil.ntoc( AV74TFRecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFRECEXITEO_TO", GXutil.ltrim( localUtil.ntoc( AV75TFRecExiTeo_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREC", GXutil.rtrim( AV60TFPrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREC_SEL", GXutil.rtrim( AV61TFPrdRec_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV43OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV45OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV23Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFEC", localUtil.dtoc( AV50RecFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECMEMCANT", GXutil.ltrim( localUtil.ntoc( A11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXIREA", GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECLOT", GXutil.rtrim( A12285RecLot));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vGRIDSTATE", AV34GridState);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vGRIDSTATE", AV34GridState);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECEXIRCC", GXutil.ltrim( localUtil.ntoc( AV48RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECFECHR", localUtil.ttoc( AV10Recfechr, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vUSURCOD", GXutil.rtrim( AV92UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV53Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV30FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV30FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDPREMED", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITCC", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITCC", getSecureSignedToken( sPrefix, localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vRECUBIC", GXutil.rtrim( AV11RecUbic));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCS", GXutil.ltrim( localUtil.ntoc( AV29FlagCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKHOR", GXutil.rtrim( AV7CCStkHor));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV28FlagCColor, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV28FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNALMCC", GXutil.ltrim( localUtil.ntoc( AV42Nalmcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV93Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Val_stk), "ZZZ9")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Title", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Result", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_MANAGEFILTERS_Activeeventkey", GXutil.rtrim( Ddo_managefilters_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Result", GXutil.rtrim( Dvelop_confirmpanel_btnmemorizarcantreal_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar2_Result));
   }

   public void renderHtmlCloseForm1SU2( )
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
      return "ControlRecuentoEntrada_WC" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Control Recuento, Entrada ", "") ;
   }

   public void wb1SU0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.controlrecuentoentrada_wc");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
            httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 53, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlRecuentoEntrada_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 19,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 53, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlRecuentoEntrada_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         wb_table1_21_1SU2( true) ;
      }
      else
      {
         wb_table1_21_1SU2( false) ;
      }
      return  ;
   }

   public void wb_table1_21_1SU2e( boolean wbgen )
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, sPrefix+"DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmemorizarcantreal_Internalname, "gx.evt.setGridEvt("+GXutil.str( 53, 2, 0)+","+"null"+");", httpContext.getMessage( "Memorizar Cant Real?", ""), bttBtnmemorizarcantreal_Jsonclick, 7, httpContext.getMessage( "Memorizar Cant Real?", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e111su1_client"+"'", TempTags, "", 2, "HLP_ControlRecuentoEntrada_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 43,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 53, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e121su1_client"+"'", TempTags, "", 2, "HLP_ControlRecuentoEntrada_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs col-sm-3 hidden-sm hidden-md hidden-lg", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar2_Internalname, "gx.evt.setGridEvt("+GXutil.str( 53, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar2", ""), bttBtnconfirmar2_Jsonclick, 7, httpContext.getMessage( "Confirmar2", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e131su1_client"+"'", TempTags, "", 2, "HLP_ControlRecuentoEntrada_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 53, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ControlRecuentoEntrada_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         startgridcontrol53( ) ;
      }
      if ( wbEnd == 53 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_53 = (int)(nGXsfl_53_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV32GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV33GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV101Pgmname), GXutil.rtrim( localUtil.format( AV101Pgmname, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ControlRecuentoEntrada_WC.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV20DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table2_73_1SU2( true) ;
      }
      else
      {
         wb_table2_73_1SU2( false) ;
      }
      return  ;
   }

   public void wb_table2_73_1SU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table3_78_1SU2( true) ;
      }
      else
      {
         wb_table3_78_1SU2( false) ;
      }
      return  ;
   }

   public void wb_table3_78_1SU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         wb_table4_83_1SU2( true) ;
      }
      else
      {
         wb_table4_83_1SU2( false) ;
      }
      return  ;
   }

   public void wb_table4_83_1SU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 53 )
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

   public void start1SU2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( "Control Recuento, Entrada ", ""), (short)(0)) ;
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
            strup1SU0( ) ;
         }
      }
   }

   public void ws1SU2( )
   {
      start1SU2( ) ;
      evt1SU2( ) ;
   }

   public void evt1SU2( )
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
                              strup1SU0( ) ;
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
                              strup1SU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e141SU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e151SU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e161SU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e171SU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e181SU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR2.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e191SU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCerrar' */
                                 e201SU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExport' */
                                 e211SU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoExportCSV' */
                                 e221SU2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strup1SU0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = edtavRecexirea_Internalname ;
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
                              strup1SU0( ) ;
                           }
                           nGXsfl_53_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_532( ) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
                              GX_FocusControl = edtavRecexirea_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV49RecExiRea = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV49RecExiRea, 12, 4));
                           }
                           else
                           {
                              AV49RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV49RecExiRea, 12, 4));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
                              GX_FocusControl = edtavDifer_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV21Difer = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( AV21Difer, 12, 4));
                           }
                           else
                           {
                              AV21Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( AV21Difer, 12, 4));
                           }
                           AV51RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV51RecLot);
                           A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
                           A13416RecEstInv = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
                                       GX_FocusControl = edtavRecexirea_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e231SU2 ();
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
                                       GX_FocusControl = edtavRecexirea_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e241SU2 ();
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
                                       GX_FocusControl = edtavRecexirea_Internalname ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e251SU2 ();
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
                                          if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV27FilterFullText) != 0 )
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
                                    strup1SU0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = edtavRecexirea_Internalname ;
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

   public void we1SU2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseForm1SU2( ) ;
         }
      }
   }

   public void pa1SU2( )
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
      subsflControlProps_532( ) ;
      while ( nGXsfl_53_idx <= nRC_GXsfl_53 )
      {
         sendrow_532( ) ;
         nGXsfl_53_idx = ((subGrid_Islastpage==1)&&(nGXsfl_53_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_53_idx+1) ;
         sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_532( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV27FilterFullText ,
                                 String A396EmprCod ,
                                 byte AV40ManageFiltersExecutionStep ,
                                 String AV58TFPrdNum ,
                                 String AV59TFPrdNum_Sel ,
                                 String AV56TFPrdNom ,
                                 String AV57TFPrdNom_Sel ,
                                 java.math.BigDecimal AV74TFRecExiTeo ,
                                 java.math.BigDecimal AV75TFRecExiTeo_To ,
                                 String AV60TFPrdRec ,
                                 String AV61TFPrdRec_Sel ,
                                 String AV101Pgmname ,
                                 short AV43OrderedBy ,
                                 boolean AV45OrderedDsc ,
                                 String AV23Emprcod ,
                                 java.util.Date AV50RecFec ,
                                 String AV53Station ,
                                 short AV30FlagPreMed ,
                                 short AV29FlagCcs ,
                                 long AV28FlagCColor ,
                                 short AV42Nalmcc ,
                                 short AV93Val_stk ,
                                 java.math.BigDecimal A808RecExiTcc ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e241SU2 ();
      GRID_nCurrentRecord = 0 ;
      rf1SU2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ControlRecuentoEntrada_WC");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV101Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("controlrecuentoentrada_wc:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITEO", getSecureSignedToken( sPrefix, localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITEO", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
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
      rf1SU2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV101Pgmname = "ControlRecuentoEntrada_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Pgmname", AV101Pgmname);
      Gx_err = (short)(0) ;
      edtavDifer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf1SU2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(53) ;
      /* Execute user event: Refresh */
      e241SU2 ();
      nGXsfl_53_idx = 1 ;
      sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_532( ) ;
      bGXsfl_53_Refreshing = true ;
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
         subsflControlProps_532( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV102Controlrecuentoentrada_wcds_1_filterfulltext ,
                                              AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                              AV103Controlrecuentoentrada_wcds_2_tfprdnum ,
                                              AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                              AV105Controlrecuentoentrada_wcds_4_tfprdnom ,
                                              AV107Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                              AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                              AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                              AV109Controlrecuentoentrada_wcds_8_tfprdrec ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A809RecExiTeo ,
                                              A727PrdRec ,
                                              Short.valueOf(AV43OrderedBy) ,
                                              Boolean.valueOf(AV45OrderedDsc) ,
                                              A396EmprCod } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                              }
         });
         lV102Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
         lV102Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
         lV102Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
         lV102Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
         lV103Controlrecuentoentrada_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV103Controlrecuentoentrada_wcds_2_tfprdnum), 6, "%") ;
         lV105Controlrecuentoentrada_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV105Controlrecuentoentrada_wcds_4_tfprdnom), 26, "%") ;
         lV109Controlrecuentoentrada_wcds_8_tfprdrec = GXutil.padr( GXutil.rtrim( AV109Controlrecuentoentrada_wcds_8_tfprdrec), 1, "%") ;
         /* Using cursor H01SU2 */
         pr_default.execute(0, new Object[] {A396EmprCod, lV102Controlrecuentoentrada_wcds_1_filterfulltext, lV102Controlrecuentoentrada_wcds_1_filterfulltext, lV102Controlrecuentoentrada_wcds_1_filterfulltext, lV102Controlrecuentoentrada_wcds_1_filterfulltext, lV103Controlrecuentoentrada_wcds_2_tfprdnum, AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel, lV105Controlrecuentoentrada_wcds_4_tfprdnom, AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel, AV107Controlrecuentoentrada_wcds_6_tfrecexiteo, AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to, lV109Controlrecuentoentrada_wcds_8_tfprdrec, AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_53_idx = 1 ;
         sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_532( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A807RecExiRea = H01SU2_A807RecExiRea[0] ;
            A11624RecMemCant = H01SU2_A11624RecMemCant[0] ;
            A12285RecLot = H01SU2_A12285RecLot[0] ;
            A724PrdPreAct = H01SU2_A724PrdPreAct[0] ;
            A726PrdPreMed = H01SU2_A726PrdPreMed[0] ;
            A808RecExiTcc = H01SU2_A808RecExiTcc[0] ;
            A13416RecEstInv = H01SU2_A13416RecEstInv[0] ;
            A727PrdRec = H01SU2_A727PrdRec[0] ;
            A809RecExiTeo = H01SU2_A809RecExiTeo[0] ;
            A718PrdNom = H01SU2_A718PrdNom[0] ;
            A719PrdNum = H01SU2_A719PrdNum[0] ;
            A724PrdPreAct = H01SU2_A724PrdPreAct[0] ;
            A726PrdPreMed = H01SU2_A726PrdPreMed[0] ;
            A727PrdRec = H01SU2_A727PrdRec[0] ;
            A718PrdNom = H01SU2_A718PrdNom[0] ;
            e251SU2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(53) ;
         wb1SU0( ) ;
      }
      bGXsfl_53_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes1SU2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vSTATION", GXutil.rtrim( AV53Station));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV30FlagPreMed, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV30FlagPreMed), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITEO"+"_"+sGXsfl_53_idx, getSecureSignedToken( sPrefix+sGXsfl_53_idx, localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"RECEXITCC", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_RECEXITCC", getSecureSignedToken( sPrefix, localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCS", GXutil.ltrim( localUtil.ntoc( AV29FlagCcs, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29FlagCcs), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV28FlagCColor, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV28FlagCColor), "ZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNALMCC", GXutil.ltrim( localUtil.ntoc( AV42Nalmcc, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42Nalmcc), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV93Val_stk, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Val_stk), "ZZZ9")));
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
      AV102Controlrecuentoentrada_wcds_1_filterfulltext = AV27FilterFullText ;
      AV103Controlrecuentoentrada_wcds_2_tfprdnum = AV58TFPrdNum ;
      AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel = AV59TFPrdNum_Sel ;
      AV105Controlrecuentoentrada_wcds_4_tfprdnom = AV56TFPrdNom ;
      AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel = AV57TFPrdNom_Sel ;
      AV107Controlrecuentoentrada_wcds_6_tfrecexiteo = AV74TFRecExiTeo ;
      AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to = AV75TFRecExiTeo_To ;
      AV109Controlrecuentoentrada_wcds_8_tfprdrec = AV60TFPrdRec ;
      AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel = AV61TFPrdRec_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV102Controlrecuentoentrada_wcds_1_filterfulltext ,
                                           AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                           AV103Controlrecuentoentrada_wcds_2_tfprdnum ,
                                           AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                           AV105Controlrecuentoentrada_wcds_4_tfprdnom ,
                                           AV107Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                           AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                           AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                           AV109Controlrecuentoentrada_wcds_8_tfprdrec ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A727PrdRec ,
                                           Short.valueOf(AV43OrderedBy) ,
                                           Boolean.valueOf(AV45OrderedDsc) ,
                                           A396EmprCod } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING
                                           }
      });
      lV102Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV102Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV102Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV102Controlrecuentoentrada_wcds_1_filterfulltext = GXutil.concat( GXutil.rtrim( AV102Controlrecuentoentrada_wcds_1_filterfulltext), "%", "") ;
      lV103Controlrecuentoentrada_wcds_2_tfprdnum = GXutil.padr( GXutil.rtrim( AV103Controlrecuentoentrada_wcds_2_tfprdnum), 6, "%") ;
      lV105Controlrecuentoentrada_wcds_4_tfprdnom = GXutil.padr( GXutil.rtrim( AV105Controlrecuentoentrada_wcds_4_tfprdnom), 26, "%") ;
      lV109Controlrecuentoentrada_wcds_8_tfprdrec = GXutil.padr( GXutil.rtrim( AV109Controlrecuentoentrada_wcds_8_tfprdrec), 1, "%") ;
      /* Using cursor H01SU3 */
      pr_default.execute(1, new Object[] {A396EmprCod, lV102Controlrecuentoentrada_wcds_1_filterfulltext, lV102Controlrecuentoentrada_wcds_1_filterfulltext, lV102Controlrecuentoentrada_wcds_1_filterfulltext, lV102Controlrecuentoentrada_wcds_1_filterfulltext, lV103Controlrecuentoentrada_wcds_2_tfprdnum, AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel, lV105Controlrecuentoentrada_wcds_4_tfprdnom, AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel, AV107Controlrecuentoentrada_wcds_6_tfrecexiteo, AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to, lV109Controlrecuentoentrada_wcds_8_tfprdrec, AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel});
      GRID_nRecordCount = H01SU3_AGRID_nRecordCount[0] ;
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
      AV102Controlrecuentoentrada_wcds_1_filterfulltext = AV27FilterFullText ;
      AV103Controlrecuentoentrada_wcds_2_tfprdnum = AV58TFPrdNum ;
      AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel = AV59TFPrdNum_Sel ;
      AV105Controlrecuentoentrada_wcds_4_tfprdnom = AV56TFPrdNom ;
      AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel = AV57TFPrdNom_Sel ;
      AV107Controlrecuentoentrada_wcds_6_tfrecexiteo = AV74TFRecExiTeo ;
      AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to = AV75TFRecExiTeo_To ;
      AV109Controlrecuentoentrada_wcds_8_tfprdrec = AV60TFPrdRec ;
      AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel = AV61TFPrdRec_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, A396EmprCod, AV40ManageFiltersExecutionStep, AV58TFPrdNum, AV59TFPrdNum_Sel, AV56TFPrdNom, AV57TFPrdNom_Sel, AV74TFRecExiTeo, AV75TFRecExiTeo_To, AV60TFPrdRec, AV61TFPrdRec_Sel, AV101Pgmname, AV43OrderedBy, AV45OrderedDsc, AV23Emprcod, AV50RecFec, AV53Station, AV30FlagPreMed, AV29FlagCcs, AV28FlagCColor, AV42Nalmcc, AV93Val_stk, A808RecExiTcc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV102Controlrecuentoentrada_wcds_1_filterfulltext = AV27FilterFullText ;
      AV103Controlrecuentoentrada_wcds_2_tfprdnum = AV58TFPrdNum ;
      AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel = AV59TFPrdNum_Sel ;
      AV105Controlrecuentoentrada_wcds_4_tfprdnom = AV56TFPrdNom ;
      AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel = AV57TFPrdNom_Sel ;
      AV107Controlrecuentoentrada_wcds_6_tfrecexiteo = AV74TFRecExiTeo ;
      AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to = AV75TFRecExiTeo_To ;
      AV109Controlrecuentoentrada_wcds_8_tfprdrec = AV60TFPrdRec ;
      AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel = AV61TFPrdRec_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, A396EmprCod, AV40ManageFiltersExecutionStep, AV58TFPrdNum, AV59TFPrdNum_Sel, AV56TFPrdNom, AV57TFPrdNom_Sel, AV74TFRecExiTeo, AV75TFRecExiTeo_To, AV60TFPrdRec, AV61TFPrdRec_Sel, AV101Pgmname, AV43OrderedBy, AV45OrderedDsc, AV23Emprcod, AV50RecFec, AV53Station, AV30FlagPreMed, AV29FlagCcs, AV28FlagCColor, AV42Nalmcc, AV93Val_stk, A808RecExiTcc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV102Controlrecuentoentrada_wcds_1_filterfulltext = AV27FilterFullText ;
      AV103Controlrecuentoentrada_wcds_2_tfprdnum = AV58TFPrdNum ;
      AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel = AV59TFPrdNum_Sel ;
      AV105Controlrecuentoentrada_wcds_4_tfprdnom = AV56TFPrdNom ;
      AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel = AV57TFPrdNom_Sel ;
      AV107Controlrecuentoentrada_wcds_6_tfrecexiteo = AV74TFRecExiTeo ;
      AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to = AV75TFRecExiTeo_To ;
      AV109Controlrecuentoentrada_wcds_8_tfprdrec = AV60TFPrdRec ;
      AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel = AV61TFPrdRec_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, A396EmprCod, AV40ManageFiltersExecutionStep, AV58TFPrdNum, AV59TFPrdNum_Sel, AV56TFPrdNom, AV57TFPrdNom_Sel, AV74TFRecExiTeo, AV75TFRecExiTeo_To, AV60TFPrdRec, AV61TFPrdRec_Sel, AV101Pgmname, AV43OrderedBy, AV45OrderedDsc, AV23Emprcod, AV50RecFec, AV53Station, AV30FlagPreMed, AV29FlagCcs, AV28FlagCColor, AV42Nalmcc, AV93Val_stk, A808RecExiTcc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV102Controlrecuentoentrada_wcds_1_filterfulltext = AV27FilterFullText ;
      AV103Controlrecuentoentrada_wcds_2_tfprdnum = AV58TFPrdNum ;
      AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel = AV59TFPrdNum_Sel ;
      AV105Controlrecuentoentrada_wcds_4_tfprdnom = AV56TFPrdNom ;
      AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel = AV57TFPrdNom_Sel ;
      AV107Controlrecuentoentrada_wcds_6_tfrecexiteo = AV74TFRecExiTeo ;
      AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to = AV75TFRecExiTeo_To ;
      AV109Controlrecuentoentrada_wcds_8_tfprdrec = AV60TFPrdRec ;
      AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel = AV61TFPrdRec_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, A396EmprCod, AV40ManageFiltersExecutionStep, AV58TFPrdNum, AV59TFPrdNum_Sel, AV56TFPrdNom, AV57TFPrdNom_Sel, AV74TFRecExiTeo, AV75TFRecExiTeo_To, AV60TFPrdRec, AV61TFPrdRec_Sel, AV101Pgmname, AV43OrderedBy, AV45OrderedDsc, AV23Emprcod, AV50RecFec, AV53Station, AV30FlagPreMed, AV29FlagCcs, AV28FlagCColor, AV42Nalmcc, AV93Val_stk, A808RecExiTcc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV102Controlrecuentoentrada_wcds_1_filterfulltext = AV27FilterFullText ;
      AV103Controlrecuentoentrada_wcds_2_tfprdnum = AV58TFPrdNum ;
      AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel = AV59TFPrdNum_Sel ;
      AV105Controlrecuentoentrada_wcds_4_tfprdnom = AV56TFPrdNom ;
      AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel = AV57TFPrdNom_Sel ;
      AV107Controlrecuentoentrada_wcds_6_tfrecexiteo = AV74TFRecExiTeo ;
      AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to = AV75TFRecExiTeo_To ;
      AV109Controlrecuentoentrada_wcds_8_tfprdrec = AV60TFPrdRec ;
      AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel = AV61TFPrdRec_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV27FilterFullText, A396EmprCod, AV40ManageFiltersExecutionStep, AV58TFPrdNum, AV59TFPrdNum_Sel, AV56TFPrdNom, AV57TFPrdNom_Sel, AV74TFRecExiTeo, AV75TFRecExiTeo_To, AV60TFPrdRec, AV61TFPrdRec_Sel, AV101Pgmname, AV43OrderedBy, AV45OrderedDsc, AV23Emprcod, AV50RecFec, AV53Station, AV30FlagPreMed, AV29FlagCcs, AV28FlagCColor, AV42Nalmcc, AV93Val_stk, A808RecExiTcc, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV101Pgmname = "ControlRecuentoEntrada_WC" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Pgmname", AV101Pgmname);
      Gx_err = (short)(0) ;
      edtavDifer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavDifer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Enabled), 5, 0), !bGXsfl_53_Refreshing);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup1SU0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e231SU2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vMANAGEFILTERSDATA"), AV39ManageFiltersData);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV20DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_53 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_53"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV32GridCurrentPage = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV33GridPageCount = localUtil.ctol( httpContext.cgiGet( sPrefix+"vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         wcpOAV23Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV23Emprcod") ;
         wcpOAV50RecFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV50RecFec"), 0) ;
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
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( sPrefix+"DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Ddo_grid_Sortedstatus = httpContext.cgiGet( sPrefix+"DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( sPrefix+"DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( sPrefix+"DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( sPrefix+"DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( sPrefix+"DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( sPrefix+"DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Title") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Confirmationtext") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Dvelop_confirmpanel_btnconfirmar2_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Title") ;
         Dvelop_confirmpanel_btnconfirmar2_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar2_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar2_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar2_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar2_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar2_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Selectedpage") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Ddo_managefilters_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_MANAGEFILTERS_Activeeventkey") ;
         Dvelop_confirmpanel_btnmemorizarcantreal_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL_Result") ;
         Dvelop_confirmpanel_btnconfirmar2_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2_Result") ;
         /* Read variables values. */
         AV27FilterFullText = httpContext.cgiGet( edtavFilterfulltext_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
         AV101Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Pgmname", AV101Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", sPrefix+"hsh"+"ControlRecuentoEntrada_WC");
         AV101Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV101Pgmname", AV101Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV101Pgmname, "")));
         hsh = httpContext.cgiGet( sPrefix+"hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("controlrecuentoentrada_wc:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
            GxWebError = (byte)(1) ;
            httpContext.sendError( 403 );
            GXutil.writeLog("send_http_error_code 403");
            return  ;
         }
         /* Check if conditions changed and reset current page numbers */
         if ( GXutil.strcmp(httpContext.cgiGet( sPrefix+"GXH_vFILTERFULLTEXT"), AV27FilterFullText) != 0 )
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
      e231SU2 ();
      if (returnInSub) return;
   }

   public void e231SU2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV53Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      controlrecuentoentrada_wc_impl.this.GXt_char1 = GXv_char2[0] ;
      AV53Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Station", AV53Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53Station, ""))));
      GXv_char2[0] = A396EmprCod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char4[0] = AV92UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV53Station, GXv_char2, GXv_char3, GXv_char4) ;
      controlrecuentoentrada_wc_impl.this.A396EmprCod = GXv_char2[0] ;
      controlrecuentoentrada_wc_impl.this.AV24EmprNom = GXv_char3[0] ;
      controlrecuentoentrada_wc_impl.this.AV92UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92UsurCod", AV92UsurCod);
      AV23Emprcod = A396EmprCod ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      GXt_int5 = (byte)(AV93Val_stk) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int6) ;
      controlrecuentoentrada_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV93Val_stk = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV93Val_stk", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV93Val_stk), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vVAL_STK", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV93Val_stk), "ZZZ9")));
      GXt_int7 = AV47Precio_stk ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int8) ;
      controlrecuentoentrada_wc_impl.this.GXt_int7 = GXv_int8[0] ;
      AV47Precio_stk = (short)(GXt_int7) ;
      GXt_int5 = (byte)(AV12Artextil) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      controlrecuentoentrada_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV12Artextil = GXt_int5 ;
      GXt_int5 = (byte)(AV37Intexco) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int6) ;
      controlrecuentoentrada_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV37Intexco = GXt_int5 ;
      GXt_int5 = (byte)(AV42Nalmcc) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int6) ;
      controlrecuentoentrada_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV42Nalmcc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV42Nalmcc", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV42Nalmcc), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vNALMCC", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV42Nalmcc), "ZZZ9")));
      GXt_int5 = (byte)(AV90Ubicacion) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "LOCPRD", ""), GXv_int6) ;
      controlrecuentoentrada_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV90Ubicacion = GXt_int5 ;
      GXv_int6[0] = (byte)(AV29FlagCcs) ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int6) ;
      controlrecuentoentrada_wc_impl.this.AV29FlagCcs = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV29FlagCcs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV29FlagCcs), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV29FlagCcs), "ZZZ9")));
      GXt_int5 = (byte)(AV30FlagPreMed) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int6) ;
      controlrecuentoentrada_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV30FlagPreMed = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV30FlagPreMed", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV30FlagPreMed), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGPREMED", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV30FlagPreMed), "ZZZ9")));
      GXt_int5 = (byte)(AV28FlagCColor) ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( A396EmprCod, httpContext.getMessage( "10002E", ""), GXv_int6) ;
      controlrecuentoentrada_wc_impl.this.GXt_int5 = GXv_int6[0] ;
      AV28FlagCColor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV28FlagCColor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV28FlagCColor), 10, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGCCOLOR", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV28FlagCColor), "ZZZZZZZZZ9")));
      GXt_char1 = AV53Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      controlrecuentoentrada_wc_impl.this.GXt_char1 = GXv_char4[0] ;
      AV53Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV53Station", AV53Station);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vSTATION", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV53Station, ""))));
      GXv_char4[0] = AV23Emprcod ;
      GXv_char3[0] = AV24EmprNom ;
      GXv_char2[0] = AV92UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV53Station, GXv_char4, GXv_char3, GXv_char2) ;
      controlrecuentoentrada_wc_impl.this.AV23Emprcod = GXv_char4[0] ;
      controlrecuentoentrada_wc_impl.this.AV24EmprNom = GXv_char3[0] ;
      controlrecuentoentrada_wc_impl.this.AV92UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92UsurCod", AV92UsurCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
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
      if ( AV43OrderedBy < 1 )
      {
         AV43OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV20DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV20DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, sPrefix, false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
   }

   public void e241SU2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV94WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV94WWPContext = GXv_SdtWWPContext11[0] ;
      if ( AV40ManageFiltersExecutionStep == 1 )
      {
         AV40ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ManageFiltersExecutionStep", GXutil.str( AV40ManageFiltersExecutionStep, 1, 0));
      }
      else if ( AV40ManageFiltersExecutionStep == 2 )
      {
         AV40ManageFiltersExecutionStep = (byte)(0) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ManageFiltersExecutionStep", GXutil.str( AV40ManageFiltersExecutionStep, 1, 0));
         /* Execute user subroutine: 'LOADSAVEDFILTERS' */
         S112 ();
         if (returnInSub) return;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV32GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV32GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridCurrentPage), 10, 0));
      AV33GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridPageCount), 10, 0));
      AV102Controlrecuentoentrada_wcds_1_filterfulltext = AV27FilterFullText ;
      AV103Controlrecuentoentrada_wcds_2_tfprdnum = AV58TFPrdNum ;
      AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel = AV59TFPrdNum_Sel ;
      AV105Controlrecuentoentrada_wcds_4_tfprdnom = AV56TFPrdNom ;
      AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel = AV57TFPrdNom_Sel ;
      AV107Controlrecuentoentrada_wcds_6_tfrecexiteo = AV74TFRecExiTeo ;
      AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to = AV75TFRecExiTeo_To ;
      AV109Controlrecuentoentrada_wcds_8_tfprdrec = AV60TFPrdRec ;
      AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel = AV61TFPrdRec_Sel ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV34GridState", AV34GridState);
   }

   public void e151SU2( )
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
         AV46PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV46PageToGo) ;
      }
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV34GridState", AV34GridState);
   }

   public void e161SU2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e171SU2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV43OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43OrderedBy), 4, 0));
         AV45OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45OrderedDsc", AV45OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV58TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFPrdNum", AV58TFPrdNum);
            AV59TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPrdNum_Sel", AV59TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV56TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrdNom", AV56TFPrdNom);
            AV57TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPrdNom_Sel", AV57TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiTeo") == 0 )
         {
            AV74TFRecExiTeo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFRecExiTeo", GXutil.ltrimstr( AV74TFRecExiTeo, 12, 4));
            AV75TFRecExiTeo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFRecExiTeo_To", GXutil.ltrimstr( AV75TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdRec") == 0 )
         {
            AV60TFPrdRec = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdRec", AV60TFPrdRec);
            AV61TFPrdRec_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrdRec_Sel", AV61TFPrdRec_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e251SU2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV52Session.getValue(AV101Pgmname+"GridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV101Pgmname+"GridState"), null, null);
      }
      else
      {
         AV49RecExiRea = ((A11624RecMemCant==1) ? A807RecExiRea : ((DecimalUtil.compareTo(DecimalUtil.ZERO, A807RecExiRea)==0) ? A809RecExiTeo : A807RecExiRea)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV49RecExiRea, 12, 4));
         edtavRecexirea_Backcolor = GXutil.getColor( 0, 255, 0) ;
         edtavRecexirea_Forecolor = GXutil.getColor( 0, 0, 0) ;
         AV21Difer = A809RecExiTeo.subtract(AV49RecExiRea) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( AV21Difer, 12, 4));
         edtavDifer_Backcolor = GXutil.getColor( 0, 255, 0) ;
         edtavDifer_Forecolor = GXutil.getColor( 0, 0, 0) ;
         AV51RecLot = A12285RecLot ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV51RecLot);
         edtavReclot_Backcolor = GXutil.getColor( 0, 255, 0) ;
         edtavReclot_Forecolor = GXutil.getColor( 0, 0, 0) ;
      }
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(53) ;
      }
      sendrow_532( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_53_Refreshing )
      {
         httpContext.doAjaxLoad(53, GridRow);
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV34GridState", AV34GridState);
   }

   public void e141SU2( )
   {
      /* Ddo_managefilters_Onoptionclicked Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Clean#>") == 0 )
      {
         /* Execute user subroutine: 'CLEANFILTERS' */
         S162 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Save#>") == 0 )
      {
         /* Execute user subroutine: 'SAVEGRIDSTATE' */
         S152 ();
         if (returnInSub) return;
         httpContext.popup(formatLink("app.wwpbaseobjects.savefilteras", new String[] {GXutil.URLEncode(GXutil.rtrim("ControlRecuentoEntrada_WCFilters")),GXutil.URLEncode(GXutil.rtrim(AV101Pgmname+"GridState"))}, new String[] {"UserKey","GridStateKey"}) , new Object[] {});
         AV40ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ManageFiltersExecutionStep", GXutil.str( AV40ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else if ( GXutil.strcmp(Ddo_managefilters_Activeeventkey, "<#Manage#>") == 0 )
      {
         httpContext.popup(formatLink("app.wwpbaseobjects.managefilters", new String[] {GXutil.URLEncode(GXutil.rtrim("ControlRecuentoEntrada_WCFilters"))}, new String[] {"UserKey"}) , new Object[] {});
         AV40ManageFiltersExecutionStep = (byte)(2) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV40ManageFiltersExecutionStep", GXutil.str( AV40ManageFiltersExecutionStep, 1, 0));
         httpContext.doAjaxRefreshCmp(sPrefix);
      }
      else
      {
         GXt_char1 = AV41ManageFiltersXml ;
         GXv_char4[0] = GXt_char1 ;
         new app.wwpbaseobjects.getfilterbyname(remoteHandle, context).execute( "ControlRecuentoEntrada_WCFilters", Ddo_managefilters_Activeeventkey, GXv_char4) ;
         controlrecuentoentrada_wc_impl.this.GXt_char1 = GXv_char4[0] ;
         AV41ManageFiltersXml = GXt_char1 ;
         if ( (GXutil.strcmp("", AV41ManageFiltersXml)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "WWP_FilterNotExist", ""));
         }
         else
         {
            /* Execute user subroutine: 'CLEANFILTERS' */
            S162 ();
            if (returnInSub) return;
            new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV101Pgmname+"GridState", AV41ManageFiltersXml) ;
            AV34GridState.fromxml(AV41ManageFiltersXml, null, null);
            AV43OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43OrderedBy), 4, 0));
            AV45OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45OrderedDsc", AV45OrderedDsc);
            /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
            S142 ();
            if (returnInSub) return;
            /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
            S172 ();
            if (returnInSub) return;
            subgrid_firstpage( ) ;
            httpContext.doAjaxRefreshCmp(sPrefix);
         }
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV34GridState", AV34GridState);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39ManageFiltersData", AV39ManageFiltersData);
   }

   public void e181SU2( )
   {
      /* Dvelop_confirmpanel_btnmemorizarcantreal_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnmemorizarcantreal_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'MEMORIZARCANTREAL' */
         S182 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV39ManageFiltersData", AV39ManageFiltersData);
      httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, "AV34GridState", AV34GridState);
   }

   public void e191SU2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar2_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar2_Result, "Yes") == 0 )
      {
         AV9Inc_obs = httpContext.getMessage( "Inicio Actualizacion RECUENTO", "") ;
         new app.pctrinc(remoteHandle, context).execute( AV23Emprcod, GXutil.substring( AV101Pgmname, 1, 10), AV92UsurCod, AV53Station, AV9Inc_obs, 99999999, (byte)(0), " ") ;
         /* Start For Each Line */
         nRC_GXsfl_53 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_53"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_53_fel_idx = 0 ;
         while ( nGXsfl_53_fel_idx < nRC_GXsfl_53 )
         {
            nGXsfl_53_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_53_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_53_fel_idx+1) ;
            sGXsfl_53_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_532( ) ;
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
               GX_FocusControl = edtavRecexirea_Internalname ;
               wbErr = true ;
               AV49RecExiRea = DecimalUtil.ZERO ;
            }
            else
            {
               AV49RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
               GX_FocusControl = edtavDifer_Internalname ;
               wbErr = true ;
               AV21Difer = DecimalUtil.ZERO ;
            }
            else
            {
               AV21Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
            }
            AV51RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
            A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
            A13416RecEstInv = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            AV112Precio_mov = ((AV30FlagPreMed==1) ? A726PrdPreMed : A724PrdPreAct) ;
            AV113Totdet = (byte)(0) ;
            AV21Difer = A809RecExiTeo.subtract(AV49RecExiRea) ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( AV21Difer, 12, 4));
            AV22DiferCC = A808RecExiTcc.subtract(AV48RecExiRcc) ;
            if ( AV21Difer.doubleValue() != 0 )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_char3[0] = A719PrdNum ;
               GXv_decimal12[0] = AV21Difer ;
               GXv_date13[0] = AV50RecFec ;
               new app.pmodrem(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal12, GXv_date13) ;
               controlrecuentoentrada_wc_impl.this.A396EmprCod = GXv_char4[0] ;
               controlrecuentoentrada_wc_impl.this.A719PrdNum = GXv_char3[0] ;
               controlrecuentoentrada_wc_impl.this.AV21Difer = GXv_decimal12[0] ;
               controlrecuentoentrada_wc_impl.this.AV50RecFec = GXv_date13[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavDifer_Internalname, GXutil.ltrimstr( AV21Difer, 12, 4));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50RecFec", localUtil.format(AV50RecFec, "99/99/99"));
            }
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A719PrdNum ;
            GXv_date13[0] = AV50RecFec ;
            GXv_decimal12[0] = AV49RecExiRea ;
            GXv_decimal14[0] = AV48RecExiRcc ;
            GXv_decimal15[0] = AV112Precio_mov ;
            GXv_dtime16[0] = AV10Recfechr ;
            GXv_char2[0] = " " ;
            GXv_char17[0] = AV51RecLot ;
            GXv_char18[0] = AV11RecUbic ;
            new app.pmodexi2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date13, GXv_decimal12, GXv_decimal14, GXv_decimal15, GXv_dtime16, GXv_char2, GXv_char17, GXv_char18) ;
            controlrecuentoentrada_wc_impl.this.A396EmprCod = GXv_char4[0] ;
            controlrecuentoentrada_wc_impl.this.A719PrdNum = GXv_char3[0] ;
            controlrecuentoentrada_wc_impl.this.AV50RecFec = GXv_date13[0] ;
            controlrecuentoentrada_wc_impl.this.AV49RecExiRea = GXv_decimal12[0] ;
            controlrecuentoentrada_wc_impl.this.AV48RecExiRcc = GXv_decimal14[0] ;
            controlrecuentoentrada_wc_impl.this.AV112Precio_mov = GXv_decimal15[0] ;
            controlrecuentoentrada_wc_impl.this.AV10Recfechr = GXv_dtime16[0] ;
            controlrecuentoentrada_wc_impl.this.AV51RecLot = GXv_char17[0] ;
            controlrecuentoentrada_wc_impl.this.AV11RecUbic = GXv_char18[0] ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50RecFec", localUtil.format(AV50RecFec, "99/99/99"));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV49RecExiRea, 12, 4));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48RecExiRcc", GXutil.ltrimstr( AV48RecExiRcc, 12, 4));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Recfechr", localUtil.ttoc( AV10Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV51RecLot);
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV11RecUbic", AV11RecUbic);
            if ( AV29FlagCcs == 1 )
            {
               AV8Fecha = GXutil.today( ) ;
               if ( AV21Difer.doubleValue() < 0 )
               {
                  AV5CCStkCanE = AV21Difer.negate() ;
                  AV6CCStkCanS = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  AV5CCStkCanE = DecimalUtil.doubleToDec(0) ;
                  AV6CCStkCanS = AV21Difer ;
               }
               GXv_char18[0] = A396EmprCod ;
               GXv_char17[0] = A719PrdNum ;
               GXv_decimal15[0] = AV5CCStkCanE ;
               GXv_decimal14[0] = AV6CCStkCanS ;
               GXv_char4[0] = httpContext.getMessage( "SR", "") ;
               GXv_char3[0] = "1" ;
               GXv_decimal12[0] = AV112Precio_mov ;
               GXv_int8[0] = 0 ;
               GXv_int6[0] = (byte)(0) ;
               GXv_char2[0] = " " ;
               GXv_int19[0] = 0 ;
               GXv_char20[0] = " " ;
               GXv_char21[0] = AV92UsurCod ;
               GXv_char22[0] = httpContext.getMessage( "Recuento de Almacen", "") ;
               GXv_int23[0] = (short)(0) ;
               GXv_decimal24[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal25[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date13[0] = AV50RecFec ;
               GXv_char26[0] = AV51RecLot ;
               GXv_char27[0] = AV7CCStkHor ;
               new app.precccstks(remoteHandle, context).execute( GXv_char18, GXv_char17, GXv_decimal15, GXv_decimal14, GXv_char4, GXv_char3, GXv_decimal12, GXv_int8, GXv_int6, GXv_char2, GXv_int19, GXv_char20, GXv_char21, GXv_char22, GXv_int23, GXv_decimal24, GXv_decimal25, GXv_date13, GXv_char26, GXv_char27) ;
               controlrecuentoentrada_wc_impl.this.A396EmprCod = GXv_char18[0] ;
               controlrecuentoentrada_wc_impl.this.A719PrdNum = GXv_char17[0] ;
               controlrecuentoentrada_wc_impl.this.AV5CCStkCanE = GXv_decimal15[0] ;
               controlrecuentoentrada_wc_impl.this.AV6CCStkCanS = GXv_decimal14[0] ;
               controlrecuentoentrada_wc_impl.this.AV112Precio_mov = GXv_decimal12[0] ;
               controlrecuentoentrada_wc_impl.this.AV92UsurCod = GXv_char21[0] ;
               controlrecuentoentrada_wc_impl.this.AV50RecFec = GXv_date13[0] ;
               controlrecuentoentrada_wc_impl.this.AV51RecLot = GXv_char26[0] ;
               controlrecuentoentrada_wc_impl.this.AV7CCStkHor = GXv_char27[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92UsurCod", AV92UsurCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50RecFec", localUtil.format(AV50RecFec, "99/99/99"));
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV51RecLot);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CCStkHor", AV7CCStkHor);
               if ( AV28FlagCColor == 1 )
               {
                  if ( AV22DiferCC.doubleValue() < 0 )
                  {
                     AV5CCStkCanE = AV22DiferCC.negate() ;
                     AV6CCStkCanS = DecimalUtil.doubleToDec(0) ;
                  }
                  else
                  {
                     AV5CCStkCanE = DecimalUtil.doubleToDec(0) ;
                     AV6CCStkCanS = AV22DiferCC ;
                  }
                  GXv_char27[0] = A396EmprCod ;
                  GXv_char26[0] = A719PrdNum ;
                  GXv_decimal25[0] = AV5CCStkCanE ;
                  GXv_decimal24[0] = AV6CCStkCanS ;
                  GXv_char22[0] = httpContext.getMessage( "SR", "") ;
                  GXv_char21[0] = "1" ;
                  GXv_decimal15[0] = AV112Precio_mov ;
                  GXv_int19[0] = 0 ;
                  GXv_int6[0] = (byte)(0) ;
                  GXv_char20[0] = " " ;
                  GXv_int8[0] = 0 ;
                  GXv_char18[0] = " " ;
                  GXv_char17[0] = AV92UsurCod ;
                  GXv_char4[0] = httpContext.getMessage( "Recuento de CC", "") ;
                  GXv_int23[0] = (short)(0) ;
                  GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal12[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date13[0] = AV50RecFec ;
                  GXv_char3[0] = AV51RecLot ;
                  GXv_char2[0] = AV7CCStkHor ;
                  new app.precccstks(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_decimal24, GXv_char22, GXv_char21, GXv_decimal15, GXv_int19, GXv_int6, GXv_char20, GXv_int8, GXv_char18, GXv_char17, GXv_char4, GXv_int23, GXv_decimal14, GXv_decimal12, GXv_date13, GXv_char3, GXv_char2) ;
                  controlrecuentoentrada_wc_impl.this.A396EmprCod = GXv_char27[0] ;
                  controlrecuentoentrada_wc_impl.this.A719PrdNum = GXv_char26[0] ;
                  controlrecuentoentrada_wc_impl.this.AV5CCStkCanE = GXv_decimal25[0] ;
                  controlrecuentoentrada_wc_impl.this.AV6CCStkCanS = GXv_decimal24[0] ;
                  controlrecuentoentrada_wc_impl.this.AV112Precio_mov = GXv_decimal15[0] ;
                  controlrecuentoentrada_wc_impl.this.AV92UsurCod = GXv_char17[0] ;
                  controlrecuentoentrada_wc_impl.this.AV50RecFec = GXv_date13[0] ;
                  controlrecuentoentrada_wc_impl.this.AV51RecLot = GXv_char3[0] ;
                  controlrecuentoentrada_wc_impl.this.AV7CCStkHor = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92UsurCod", AV92UsurCod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50RecFec", localUtil.format(AV50RecFec, "99/99/99"));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavReclot_Internalname, AV51RecLot);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7CCStkHor", AV7CCStkHor);
                  if ( AV42Nalmcc == 1 )
                  {
                     GXv_char27[0] = A396EmprCod ;
                     GXv_char26[0] = A719PrdNum ;
                     GXv_decimal25[0] = AV48RecExiRcc ;
                     GXv_char22[0] = httpContext.getMessage( "SR", "") ;
                     GXv_decimal24[0] = AV112Precio_mov ;
                     GXv_char21[0] = AV92UsurCod ;
                     GXv_char20[0] = httpContext.getMessage( "Recuento de CC p/Almacenes", "") ;
                     GXv_date13[0] = AV50RecFec ;
                     GXv_dtime16[0] = AV10Recfechr ;
                     new app.pccalm1(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_char22, GXv_decimal24, GXv_char21, GXv_char20, GXv_date13, GXv_dtime16) ;
                     controlrecuentoentrada_wc_impl.this.A396EmprCod = GXv_char27[0] ;
                     controlrecuentoentrada_wc_impl.this.A719PrdNum = GXv_char26[0] ;
                     controlrecuentoentrada_wc_impl.this.AV48RecExiRcc = GXv_decimal25[0] ;
                     controlrecuentoentrada_wc_impl.this.AV112Precio_mov = GXv_decimal24[0] ;
                     controlrecuentoentrada_wc_impl.this.AV92UsurCod = GXv_char21[0] ;
                     controlrecuentoentrada_wc_impl.this.AV50RecFec = GXv_date13[0] ;
                     controlrecuentoentrada_wc_impl.this.AV10Recfechr = GXv_dtime16[0] ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48RecExiRcc", GXutil.ltrimstr( AV48RecExiRcc, 12, 4));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV92UsurCod", AV92UsurCod);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50RecFec", localUtil.format(AV50RecFec, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Recfechr", localUtil.ttoc( AV10Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  }
               }
            }
            if ( AV93Val_stk == 0 )
            {
               GXv_char27[0] = A396EmprCod ;
               GXv_char26[0] = A719PrdNum ;
               new app.pstm017(remoteHandle, context).execute( GXv_char27, GXv_char26) ;
               controlrecuentoentrada_wc_impl.this.A396EmprCod = GXv_char27[0] ;
               controlrecuentoentrada_wc_impl.this.A719PrdNum = GXv_char26[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
            }
            else
            {
               GXv_char27[0] = A396EmprCod ;
               GXv_char26[0] = A719PrdNum ;
               GXv_decimal25[0] = AV49RecExiRea ;
               GXv_decimal24[0] = AV112Precio_mov ;
               new app.pvalstksr(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_decimal24) ;
               controlrecuentoentrada_wc_impl.this.A396EmprCod = GXv_char27[0] ;
               controlrecuentoentrada_wc_impl.this.A719PrdNum = GXv_char26[0] ;
               controlrecuentoentrada_wc_impl.this.AV49RecExiRea = GXv_decimal25[0] ;
               controlrecuentoentrada_wc_impl.this.AV112Precio_mov = GXv_decimal24[0] ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV49RecExiRea, 12, 4));
            }
            /* End For Each Line */
         }
         if ( nGXsfl_53_fel_idx == 0 )
         {
            nGXsfl_53_idx = 1 ;
            sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_532( ) ;
         }
         nGXsfl_53_fel_idx = 1 ;
         AV9Inc_obs = httpContext.getMessage( "Fin Actualizacion RECUENTO", "") ;
         new app.pctrinc(remoteHandle, context).execute( AV23Emprcod, GXutil.substring( AV101Pgmname, 1, 10), AV92UsurCod, AV53Station, AV9Inc_obs, 99999999, (byte)(0), " ") ;
         GXv_char27[0] = AV23Emprcod ;
         new app.pinvprd(remoteHandle, context).execute( GXv_char27) ;
         controlrecuentoentrada_wc_impl.this.AV23Emprcod = GXv_char27[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         httpContext.GX_msglist.addItem(AV9Inc_obs);
         httpContext.setWebReturnParms(new Object[] {});
         httpContext.setWebReturnParmsMetadata(new Object[] {});
         httpContext.wjLocDisableFrm = (byte)(1) ;
         httpContext.nUserReturn = (byte)(1) ;
         returnInSub = true;
         if (true) return;
      }
      /*  Sending Event outputs  */
   }

   public void e201SU2( )
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

   public void e211SU2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      GXv_char27[0] = AV26ExcelFilename ;
      GXv_char26[0] = AV25ErrorMessage ;
      new app.controlrecuentoentrada_wcexport(remoteHandle, context).execute( GXv_char27, GXv_char26) ;
      controlrecuentoentrada_wc_impl.this.AV26ExcelFilename = GXv_char27[0] ;
      controlrecuentoentrada_wc_impl.this.AV25ErrorMessage = GXv_char26[0] ;
      if ( GXutil.strcmp(AV26ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV26ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV25ErrorMessage);
      }
   }

   public void e221SU2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      callWebObject(formatLink("app.controlrecuentoentrada_wcexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV43OrderedBy, 4, 0))+":"+(AV45OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S112( )
   {
      /* 'LOADSAVEDFILTERS' Routine */
      returnInSub = false ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 = AV39ManageFiltersData ;
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item29[0] = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 ;
      new app.wwpbaseobjects.wwp_managefiltersloadsavedfilters(remoteHandle, context).execute( "ControlRecuentoEntrada_WCFilters", "", "", false, GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item29) ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 = GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item29[0] ;
      AV39ManageFiltersData = GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 ;
   }

   public void S162( )
   {
      /* 'CLEANFILTERS' Routine */
      returnInSub = false ;
      AV27FilterFullText = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
      AV58TFPrdNum = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFPrdNum", AV58TFPrdNum);
      AV59TFPrdNum_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPrdNum_Sel", AV59TFPrdNum_Sel);
      AV56TFPrdNom = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrdNom", AV56TFPrdNom);
      AV57TFPrdNom_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPrdNom_Sel", AV57TFPrdNom_Sel);
      AV74TFRecExiTeo = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFRecExiTeo", GXutil.ltrimstr( AV74TFRecExiTeo, 12, 4));
      AV75TFRecExiTeo_To = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFRecExiTeo_To", GXutil.ltrimstr( AV75TFRecExiTeo_To, 12, 4));
      AV60TFPrdRec = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdRec", AV60TFPrdRec);
      AV61TFPrdRec_Sel = "" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrdRec_Sel", AV61TFPrdRec_Sel);
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
      if ( GXutil.strcmp(AV52Session.getValue(AV101Pgmname+"GridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV101Pgmname+"GridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV52Session.getValue(AV101Pgmname+"GridState"), null, null);
      }
      AV43OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV43OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43OrderedBy), 4, 0));
      AV45OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV45OrderedDsc", AV45OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADREGFILTERSSTATE' */
      S172 ();
      if (returnInSub) return;
      if ( ! (GXutil.strcmp("", GXutil.trim( AV34GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV34GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV34GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S172( )
   {
      /* 'LOADREGFILTERSSTATE' Routine */
      returnInSub = false ;
      AV114GXV1 = 1 ;
      while ( AV114GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV114GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "FILTERFULLTEXT") == 0 )
         {
            AV27FilterFullText = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV27FilterFullText", AV27FilterFullText);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV58TFPrdNum = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV58TFPrdNum", AV58TFPrdNum);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV59TFPrdNum_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV59TFPrdNum_Sel", AV59TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV56TFPrdNom = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV56TFPrdNom", AV56TFPrdNom);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV57TFPrdNom_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV57TFPrdNom_Sel", AV57TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV74TFRecExiTeo = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV74TFRecExiTeo", GXutil.ltrimstr( AV74TFRecExiTeo, 12, 4));
            AV75TFRecExiTeo_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV75TFRecExiTeo_To", GXutil.ltrimstr( AV75TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV60TFPrdRec = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV60TFPrdRec", AV60TFPrdRec);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV61TFPrdRec_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV61TFPrdRec_Sel", AV61TFPrdRec_Sel);
         }
         AV114GXV1 = (int)(AV114GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char27[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV59TFPrdNum_Sel)==0), AV59TFPrdNum_Sel, GXv_char27) ;
      controlrecuentoentrada_wc_impl.this.GXt_char1 = GXv_char27[0] ;
      GXt_char30 = "" ;
      GXv_char26[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV57TFPrdNom_Sel)==0), AV57TFPrdNom_Sel, GXv_char26) ;
      controlrecuentoentrada_wc_impl.this.GXt_char30 = GXv_char26[0] ;
      GXt_char31 = "" ;
      GXv_char22[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV61TFPrdRec_Sel)==0), AV61TFPrdRec_Sel, GXv_char22) ;
      controlrecuentoentrada_wc_impl.this.GXt_char31 = GXv_char22[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char30+"||"+GXt_char31 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char31 = "" ;
      GXv_char27[0] = GXt_char31 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV58TFPrdNum)==0), AV58TFPrdNum, GXv_char27) ;
      controlrecuentoentrada_wc_impl.this.GXt_char31 = GXv_char27[0] ;
      GXt_char30 = "" ;
      GXv_char26[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV56TFPrdNom)==0), AV56TFPrdNom, GXv_char26) ;
      controlrecuentoentrada_wc_impl.this.GXt_char30 = GXv_char26[0] ;
      GXt_char1 = "" ;
      GXv_char22[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV60TFPrdRec)==0), AV60TFPrdRec, GXv_char22) ;
      controlrecuentoentrada_wc_impl.this.GXt_char1 = GXv_char22[0] ;
      Ddo_grid_Filteredtext_set = GXt_char31+"|"+GXt_char30+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFRecExiTeo)==0) ? "" : GXutil.str( AV74TFRecExiTeo, 12, 4))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFRecExiTeo_To)==0) ? "" : GXutil.str( AV75TFRecExiTeo_To, 12, 4))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV34GridState.fromxml(AV52Session.getValue(AV101Pgmname+"GridState"), null, null);
      AV34GridState.setgxTv_SdtWWPGridState_Orderedby( AV43OrderedBy );
      AV34GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV45OrderedDsc );
      AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState32[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "FILTERFULLTEXT", "", !(GXutil.strcmp("", AV27FilterFullText)==0), (short)(0), AV27FilterFullText, "") ;
      AV34GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPRDNUM", "", !(GXutil.strcmp("", AV58TFPrdNum)==0), (short)(0), AV58TFPrdNum, "", !(GXutil.strcmp("", AV59TFPrdNum_Sel)==0), AV59TFPrdNum_Sel, "") ;
      AV34GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPRDNOM", "", !(GXutil.strcmp("", AV56TFPrdNom)==0), (short)(0), AV56TFPrdNom, "", !(GXutil.strcmp("", AV57TFPrdNom_Sel)==0), AV57TFPrdNom_Sel, "") ;
      AV34GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFRECEXITEO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV74TFRecExiTeo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV75TFRecExiTeo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV74TFRecExiTeo, 12, 4)), GXutil.trim( GXutil.str( AV75TFRecExiTeo_To, 12, 4))) ;
      AV34GridState = GXv_SdtWWPGridState32[0] ;
      GXv_SdtWWPGridState32[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState32, "TFPRDREC", "", !(GXutil.strcmp("", AV60TFPrdRec)==0), (short)(0), AV60TFPrdRec, "", !(GXutil.strcmp("", AV61TFPrdRec_Sel)==0), AV61TFPrdRec_Sel, "") ;
      AV34GridState = GXv_SdtWWPGridState32[0] ;
      if ( ! (GXutil.strcmp("", AV23Emprcod)==0) )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV35GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV35GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV23Emprcod );
         AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV35GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV50RecFec)) )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV35GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&RECFEC" );
         AV35GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV50RecFec, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV35GridStateFilterValue, 0);
      }
      AV34GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV34GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV101Pgmname+"GridState", AV34GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV88TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV88TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV101Pgmname );
      AV88TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV88TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV36HTTPRequest.getScriptName()+"?"+AV36HTTPRequest.getQuerystring() );
      AV88TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "StocksQuimicos.RECUEN_TRN" );
      AV52Session.setValue("TrnContext", AV88TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S182( )
   {
      /* 'MEMORIZARCANTREAL' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_53 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_53"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_53_fel_idx = 0 ;
      while ( nGXsfl_53_fel_idx < nRC_GXsfl_53 )
      {
         nGXsfl_53_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_53_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_53_fel_idx+1) ;
         sGXsfl_53_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_532( ) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
            GX_FocusControl = edtavRecexirea_Internalname ;
            wbErr = true ;
            AV49RecExiRea = DecimalUtil.ZERO ;
         }
         else
         {
            AV49RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
            GX_FocusControl = edtavDifer_Internalname ;
            wbErr = true ;
            AV21Difer = DecimalUtil.ZERO ;
         }
         else
         {
            AV21Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
         }
         AV51RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
         A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
         A13416RecEstInv = (byte)(localUtil.ctol( httpContext.cgiGet( edtRecEstInv_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         GXv_char27[0] = A396EmprCod ;
         GXv_char26[0] = A719PrdNum ;
         GXv_date13[0] = AV50RecFec ;
         GXv_decimal25[0] = AV49RecExiRea ;
         GXv_decimal24[0] = AV48RecExiRcc ;
         GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
         GXv_dtime16[0] = AV10Recfechr ;
         GXv_char22[0] = " " ;
         new app.pmemocant(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_date13, GXv_decimal25, GXv_decimal24, GXv_decimal15, GXv_dtime16, GXv_char22) ;
         controlrecuentoentrada_wc_impl.this.A396EmprCod = GXv_char27[0] ;
         controlrecuentoentrada_wc_impl.this.A719PrdNum = GXv_char26[0] ;
         controlrecuentoentrada_wc_impl.this.AV50RecFec = GXv_date13[0] ;
         controlrecuentoentrada_wc_impl.this.AV49RecExiRea = GXv_decimal25[0] ;
         controlrecuentoentrada_wc_impl.this.AV48RecExiRcc = GXv_decimal24[0] ;
         controlrecuentoentrada_wc_impl.this.AV10Recfechr = GXv_dtime16[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50RecFec", localUtil.format(AV50RecFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV49RecExiRea, 12, 4));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV48RecExiRcc", GXutil.ltrimstr( AV48RecExiRcc, 12, 4));
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV10Recfechr", localUtil.ttoc( AV10Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         /* End For Each Line */
      }
      if ( nGXsfl_53_fel_idx == 0 )
      {
         nGXsfl_53_idx = 1 ;
         sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_532( ) ;
      }
      nGXsfl_53_fel_idx = 1 ;
      httpContext.doAjaxRefreshCmp(sPrefix);
   }

   public void wb_table4_83_1SU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar2_Internalname, tblTabledvelop_confirmpanel_btnconfirmar2_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("Title", Dvelop_confirmpanel_btnconfirmar2_Title);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar2_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar2_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar2_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar2_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar2_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar2.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar2_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar2.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar2_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2Container"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table4_83_1SU2e( true) ;
      }
      else
      {
         wb_table4_83_1SU2e( false) ;
      }
   }

   public void wb_table3_78_1SU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, tblTabledvelop_confirmpanel_btnconfirmar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnconfirmar.setProperty("Title", Dvelop_confirmpanel_btnconfirmar_Title);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmationText", Dvelop_confirmpanel_btnconfirmar_Confirmationtext);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition);
         ucDvelop_confirmpanel_btnconfirmar.setProperty("ConfirmType", Dvelop_confirmpanel_btnconfirmar_Confirmtype);
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table3_78_1SU2e( true) ;
      }
      else
      {
         wb_table3_78_1SU2e( false) ;
      }
   }

   public void wb_table2_73_1SU2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_btnmemorizarcantreal_Internalname, tblTabledvelop_confirmpanel_btnmemorizarcantreal_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("Title", Dvelop_confirmpanel_btnmemorizarcantreal_Title);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("ConfirmationText", Dvelop_confirmpanel_btnmemorizarcantreal_Confirmationtext);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("YesButtonCaption", Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttoncaption);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("NoButtonCaption", Dvelop_confirmpanel_btnmemorizarcantreal_Nobuttoncaption);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("CancelButtonCaption", Dvelop_confirmpanel_btnmemorizarcantreal_Cancelbuttoncaption);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("YesButtonPosition", Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttonposition);
         ucDvelop_confirmpanel_btnmemorizarcantreal.setProperty("ConfirmType", Dvelop_confirmpanel_btnmemorizarcantreal_Confirmtype);
         ucDvelop_confirmpanel_btnmemorizarcantreal.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnmemorizarcantreal_Internalname, sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREALContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREALContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_73_1SU2e( true) ;
      }
      else
      {
         wb_table2_73_1SU2e( false) ;
      }
   }

   public void wb_table1_21_1SU2( boolean wbgen )
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
         ucDdo_managefilters.setProperty("DropDownOptionsData", AV39ManageFiltersData);
         ucDdo_managefilters.render(context, "dvelop.gxbootstrap.ddoregular", Ddo_managefilters_Internalname, sPrefix+"DDO_MANAGEFILTERSContainer");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         wb_table5_26_1SU2( true) ;
      }
      else
      {
         wb_table5_26_1SU2( false) ;
      }
      return  ;
   }

   public void wb_table5_26_1SU2e( boolean wbgen )
   {
      if ( wbgen )
      {
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_21_1SU2e( true) ;
      }
      else
      {
         wb_table1_21_1SU2e( false) ;
      }
   }

   public void wb_table5_26_1SU2( boolean wbgen )
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'" + sPrefix + "',false,'" + sGXsfl_53_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFilterfulltext_Internalname, AV27FilterFullText, GXutil.rtrim( localUtil.format( AV27FilterFullText, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,30);\"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", httpContext.getMessage( "WWP_Search", ""), edtavFilterfulltext_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavFilterfulltext_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "WWPFullTextFilter", "left", true, "", "HLP_ControlRecuentoEntrada_WC.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table5_26_1SU2e( true) ;
      }
      else
      {
         wb_table5_26_1SU2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV23Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      AV50RecFec = (java.util.Date)getParm(obj,1,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50RecFec", localUtil.format(AV50RecFec, "99/99/99"));
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
      pa1SU2( ) ;
      ws1SU2( ) ;
      we1SU2( ) ;
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
      sCtrlAV23Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      sCtrlAV50RecFec = (String)getParm(obj,1,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      pa1SU2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "controlrecuentoentrada_wc", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      pa1SU2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV23Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
         AV50RecFec = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50RecFec", localUtil.format(AV50RecFec, "99/99/99"));
      }
      wcpOAV23Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV23Emprcod") ;
      wcpOAV50RecFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV50RecFec"), 0) ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV23Emprcod, wcpOAV23Emprcod) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV50RecFec), GXutil.resetTime(wcpOAV50RecFec)) ) ) )
      {
         setjustcreated();
      }
      wcpOAV23Emprcod = AV23Emprcod ;
      wcpOAV50RecFec = AV50RecFec ;
   }

   public void wcparametersget( )
   {
      /* Read Component Parameters. */
      sCtrlAV23Emprcod = httpContext.cgiGet( sPrefix+"AV23Emprcod_CTRL") ;
      if ( GXutil.len( sCtrlAV23Emprcod) > 0 )
      {
         AV23Emprcod = httpContext.cgiGet( sCtrlAV23Emprcod) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV23Emprcod", AV23Emprcod);
      }
      else
      {
         AV23Emprcod = httpContext.cgiGet( sPrefix+"AV23Emprcod_PARM") ;
      }
      sCtrlAV50RecFec = httpContext.cgiGet( sPrefix+"AV50RecFec_CTRL") ;
      if ( GXutil.len( sCtrlAV50RecFec) > 0 )
      {
         AV50RecFec = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV50RecFec), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50RecFec", localUtil.format(AV50RecFec, "99/99/99"));
      }
      else
      {
         AV50RecFec = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV50RecFec_PARM"), 0) ;
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
      pa1SU2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      ws1SU2( ) ;
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
      ws1SU2( ) ;
      httpContext.SaveComponentMsgList(sPrefix);
      httpContext.GX_msglist = BackMsgLst ;
   }

   public void wcparametersset( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Emprcod_PARM", GXutil.rtrim( AV23Emprcod));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV23Emprcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV23Emprcod_CTRL", GXutil.rtrim( sCtrlAV23Emprcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50RecFec_PARM", localUtil.dtoc( AV50RecFec, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV50RecFec)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV50RecFec_CTRL", GXutil.rtrim( sCtrlAV50RecFec));
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
      we1SU2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211555500", true, true);
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
      httpContext.AddJavascriptSource("controlrecuentoentrada_wc.js", "?20268211555501", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_532( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_53_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_53_idx ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO_"+sGXsfl_53_idx ;
      edtavRecexirea_Internalname = sPrefix+"vRECEXIREA_"+sGXsfl_53_idx ;
      edtavDifer_Internalname = sPrefix+"vDIFER_"+sGXsfl_53_idx ;
      edtavReclot_Internalname = sPrefix+"vRECLOT_"+sGXsfl_53_idx ;
      edtPrdRec_Internalname = sPrefix+"PRDREC_"+sGXsfl_53_idx ;
      edtRecEstInv_Internalname = sPrefix+"RECESTINV_"+sGXsfl_53_idx ;
   }

   public void subsflControlProps_fel_532( )
   {
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_53_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_53_fel_idx ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO_"+sGXsfl_53_fel_idx ;
      edtavRecexirea_Internalname = sPrefix+"vRECEXIREA_"+sGXsfl_53_fel_idx ;
      edtavDifer_Internalname = sPrefix+"vDIFER_"+sGXsfl_53_fel_idx ;
      edtavReclot_Internalname = sPrefix+"vRECLOT_"+sGXsfl_53_fel_idx ;
      edtPrdRec_Internalname = sPrefix+"PRDREC_"+sGXsfl_53_fel_idx ;
      edtRecEstInv_Internalname = sPrefix+"RECESTINV_"+sGXsfl_53_fel_idx ;
   }

   public void sendrow_532( )
   {
      subsflControlProps_532( ) ;
      wb1SU0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_53_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_53_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_53_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavRecexirea_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecexirea_Enabled!=0)&&(edtavRecexirea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'"+sPrefix+"',false,'"+sGXsfl_53_idx+"',53)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecexirea_Internalname,GXutil.ltrim( localUtil.ntoc( AV49RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV49RecExiRea, "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavRecexirea_Enabled!=0)&&(edtavRecexirea_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,57);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavRecexirea_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavRecexirea_Forecolor)+";"+((edtavRecexirea_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavRecexirea_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavDifer_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDifer_Enabled!=0)&&(edtavDifer_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 58,'"+sPrefix+"',false,'"+sGXsfl_53_idx+"',53)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifer_Internalname,GXutil.ltrim( localUtil.ntoc( AV21Difer, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifer_Enabled!=0) ? localUtil.format( AV21Difer, "ZZZZZZ9.9999") : localUtil.format( AV21Difer, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavDifer_Enabled!=0)&&(edtavDifer_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,58);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavDifer_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavDifer_Forecolor)+";"+((edtavDifer_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavDifer_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavDifer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavReclot_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavReclot_Enabled!=0)&&(edtavReclot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'"+sPrefix+"',false,'"+sGXsfl_53_idx+"',53)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavReclot_Internalname,GXutil.rtrim( AV51RecLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavReclot_Enabled!=0)&&(edtavReclot_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,59);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavReclot_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavReclot_Forecolor)+";"+((edtavReclot_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavReclot_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRec_Internalname,GXutil.rtrim( A727PrdRec),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecEstInv_Internalname,GXutil.ltrim( localUtil.ntoc( A13416RecEstInv, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13416RecEstInv), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtRecEstInv_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(53),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes1SU2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_53_idx = ((subGrid_Islastpage==1)&&(nGXsfl_53_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_53_idx+1) ;
         sGXsfl_53_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_53_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_532( ) ;
      }
      /* End function sendrow_532 */
   }

   public void startgridcontrol53( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"53\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Teorica", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "E", "")) ;
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
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV49RecExiRea, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavRecexirea_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavRecexirea_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV21Difer, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavDifer_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavDifer_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifer_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV51RecLot));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavReclot_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavReclot_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A727PrdRec));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13416RecEstInv, (byte)(1), (byte)(0), ".", "")));
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
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      Ddo_managefilters_Internalname = sPrefix+"DDO_MANAGEFILTERS" ;
      edtavFilterfulltext_Internalname = sPrefix+"vFILTERFULLTEXT" ;
      tblTablefilters_Internalname = sPrefix+"TABLEFILTERS" ;
      tblTablerightheader_Internalname = sPrefix+"TABLERIGHTHEADER" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      bttBtnmemorizarcantreal_Internalname = sPrefix+"BTNMEMORIZARCANTREAL" ;
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtnconfirmar2_Internalname = sPrefix+"BTNCONFIRMAR2" ;
      bttBtncerrar_Internalname = sPrefix+"BTNCERRAR" ;
      divUnnamedtable1_Internalname = sPrefix+"UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = sPrefix+"DVPANEL_UNNAMEDTABLE1" ;
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtRecExiTeo_Internalname = sPrefix+"RECEXITEO" ;
      edtavRecexirea_Internalname = sPrefix+"vRECEXIREA" ;
      edtavDifer_Internalname = sPrefix+"vDIFER" ;
      edtavReclot_Internalname = sPrefix+"vRECLOT" ;
      edtPrdRec_Internalname = sPrefix+"PRDREC" ;
      edtRecEstInv_Internalname = sPrefix+"RECESTINV" ;
      Gridpaginationbar_Internalname = sPrefix+"GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = sPrefix+"GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = sPrefix+"vPGMNAME" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL" ;
      tblTabledvelop_confirmpanel_btnmemorizarcantreal_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      Dvelop_confirmpanel_btnconfirmar2_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR2" ;
      tblTabledvelop_confirmpanel_btnconfirmar2_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR2" ;
      Grid_titlescategories_Internalname = sPrefix+"GRID_TITLESCATEGORIES" ;
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
      edtRecEstInv_Jsonclick = "" ;
      edtPrdRec_Jsonclick = "" ;
      edtavReclot_Jsonclick = "" ;
      edtavReclot_Forecolor = (int)(0x000000) ;
      edtavReclot_Visible = -1 ;
      edtavReclot_Enabled = 1 ;
      edtavReclot_Backcolor = -1 ;
      edtavDifer_Jsonclick = "" ;
      edtavDifer_Forecolor = (int)(0x000000) ;
      edtavDifer_Visible = -1 ;
      edtavDifer_Enabled = 1 ;
      edtavDifer_Backcolor = -1 ;
      edtavRecexirea_Jsonclick = "" ;
      edtavRecexirea_Forecolor = (int)(0x000000) ;
      edtavRecexirea_Visible = -1 ;
      edtavRecexirea_Enabled = 1 ;
      edtavRecexirea_Backcolor = -1 ;
      edtRecExiTeo_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavFilterfulltext_Jsonclick = "" ;
      edtavFilterfulltext_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;Cantidad;Cantidad;;;;" ;
      Dvelop_confirmpanel_btnconfirmar2_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar2_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar2_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar2_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar2_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar2_Confirmationtext = "¿SEGUNDO MENSAJE?" ;
      Dvelop_confirmpanel_btnconfirmar2_Title = "" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma el Inventario introducido?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Confirmationtext = "¿Desea memorirar la cantidad real?" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Title = "" ;
      Ddo_grid_Datalistproc = "ControlRecuentoEntrada_WCGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T||T" ;
      Ddo_grid_Filterisrange = "||T|" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4" ;
      Ddo_grid_Columnids = "0:PrdNum|1:PrdNom|2:RecExiTeo|6:PrdRec" ;
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
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "Acciones", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
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

   public void valid_Prdnum( )
   {
      /* Using cursor H01SU4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum});
      if ( (pr_default.getStatus(2) == 101) )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_inex", new Object[] {"PRODUC"}), 1, "PRDNUM");
      }
      A724PrdPreAct = H01SU4_A724PrdPreAct[0] ;
      A726PrdPreMed = H01SU4_A726PrdPreMed[0] ;
      A727PrdRec = H01SU4_A727PrdRec[0] ;
      A718PrdNom = H01SU4_A718PrdNom[0] ;
      pr_default.close(2);
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A724PrdPreAct", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A726PrdPreMed", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), ".", "")));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A727PrdRec", GXutil.rtrim( A727PrdRec));
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "A718PrdNom", GXutil.rtrim( A718PrdNom));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'sPrefix'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV58TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV59TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV56TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV57TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV74TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV75TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV61TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV45OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV30FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV29FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV28FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV93Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV34GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e151SU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV58TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV59TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV56TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV57TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV74TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV75TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV61TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV45OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV30FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV29FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV28FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV93Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[{av:'AV34GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e161SU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV58TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV59TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV56TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV57TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV74TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV75TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV61TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV45OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV30FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV29FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV28FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV93Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e171SU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV58TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV59TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV56TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV57TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV74TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV75TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV61TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV45OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV30FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV29FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV28FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV93Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV45OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV58TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV59TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV56TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV57TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV74TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV75TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV61TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e251SU2',iparms:[{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'A11624RecMemCant',fld:'RECMEMCANT',pic:'9'},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A12285RecLot',fld:'RECLOT',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV34GridState',fld:'vGRIDSTATE',pic:''},{av:'AV49RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'edtavRecexirea_Backcolor',ctrl:'vRECEXIREA',prop:'Backcolor'},{av:'edtavRecexirea_Forecolor',ctrl:'vRECEXIREA',prop:'Forecolor'},{av:'AV21Difer',fld:'vDIFER',pic:'ZZZZZZ9.9999'},{av:'edtavDifer_Backcolor',ctrl:'vDIFER',prop:'Backcolor'},{av:'edtavDifer_Forecolor',ctrl:'vDIFER',prop:'Forecolor'},{av:'AV51RecLot',fld:'vRECLOT',pic:''},{av:'edtavReclot_Backcolor',ctrl:'vRECLOT',prop:'Backcolor'},{av:'edtavReclot_Forecolor',ctrl:'vRECLOT',prop:'Forecolor'}]}");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED","{handler:'e141SU2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV58TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV59TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV56TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV57TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV74TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV75TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV61TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV45OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV30FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV29FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV28FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV93Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'Ddo_managefilters_Activeeventkey',ctrl:'DDO_MANAGEFILTERS',prop:'ActiveEventKey'},{av:'AV34GridState',fld:'vGRIDSTATE',pic:''}]");
      setEventMetadata("DDO_MANAGEFILTERS.ONOPTIONCLICKED",",oparms:[{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV34GridState',fld:'vGRIDSTATE',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV45OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'AV58TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV59TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV56TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV57TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV74TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV75TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV61TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''}]}");
      setEventMetadata("'DOMEMORIZARCANTREAL'","{handler:'e111SU1',iparms:[]");
      setEventMetadata("'DOMEMORIZARCANTREAL'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL.CLOSE","{handler:'e181SU2',iparms:[{av:'Dvelop_confirmpanel_btnmemorizarcantreal_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV27FilterFullText',fld:'vFILTERFULLTEXT',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV58TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV59TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV56TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV57TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV74TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV75TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV61TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV45OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV50RecFec',fld:'vRECFEC',pic:''},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV30FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'AV29FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV28FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV93Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'sPrefix'},{av:'A719PrdNum',fld:'PRDNUM',grid:53,pic:''},{av:'nRC_GXsfl_53',ctrl:'GRID',grid:53,prop:'GridRC',grid:53},{av:'AV49RecExiRea',fld:'vRECEXIREA',grid:53,pic:'ZZZZZZ9.9999'},{av:'AV48RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV10Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNMEMORIZARCANTREAL.CLOSE",",oparms:[{av:'AV10Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV48RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV49RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV50RecFec',fld:'vRECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV40ManageFiltersExecutionStep',fld:'vMANAGEFILTERSEXECUTIONSTEP',pic:'9'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV39ManageFiltersData',fld:'vMANAGEFILTERSDATA',pic:''},{av:'AV34GridState',fld:'vGRIDSTATE',pic:''}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e121SU1',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("'DOCONFIRMAR2'","{handler:'e131SU1',iparms:[]");
      setEventMetadata("'DOCONFIRMAR2'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR2.CLOSE","{handler:'e191SU2',iparms:[{av:'Dvelop_confirmpanel_btnconfirmar2_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR2',prop:'Result'},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV101Pgmname',fld:'vPGMNAME',pic:''},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV53Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV30FlagPreMed',fld:'vFLAGPREMED',pic:'ZZZ9',hsh:true},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A809RecExiTeo',fld:'RECEXITEO',grid:53,pic:'ZZZZZZ9.9999',hsh:true},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_53',ctrl:'GRID',grid:53,prop:'GridRC',grid:53},{av:'AV49RecExiRea',fld:'vRECEXIREA',grid:53,pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'AV48RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',grid:53,pic:''},{av:'AV50RecFec',fld:'vRECFEC',pic:''},{av:'AV10Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV51RecLot',fld:'vRECLOT',grid:53,pic:''},{av:'AV11RecUbic',fld:'vRECUBIC',pic:''},{av:'AV29FlagCcs',fld:'vFLAGCCS',pic:'ZZZ9',hsh:true},{av:'AV7CCStkHor',fld:'vCCSTKHOR',pic:''},{av:'AV28FlagCColor',fld:'vFLAGCCOLOR',pic:'ZZZZZZZZZ9',hsh:true},{av:'AV42Nalmcc',fld:'vNALMCC',pic:'ZZZ9',hsh:true},{av:'AV93Val_stk',fld:'vVAL_STK',pic:'ZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR2.CLOSE",",oparms:[{av:'AV21Difer',fld:'vDIFER',pic:'ZZZZZZ9.9999'},{av:'AV50RecFec',fld:'vRECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV11RecUbic',fld:'vRECUBIC',pic:''},{av:'AV51RecLot',fld:'vRECLOT',pic:''},{av:'AV10Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV48RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV49RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV7CCStkHor',fld:'vCCSTKHOR',pic:''},{av:'AV92UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV23Emprcod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e201SU2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOEXPORT'","{handler:'e211SU2',iparms:[]");
      setEventMetadata("'DOEXPORT'",",oparms:[]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e221SU2',iparms:[]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]");
      setEventMetadata("VALID_PRDNUM",",oparms:[{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A727PrdRec',fld:'PRDREC',pic:''},{av:'A718PrdNom',fld:'PRDNOM',pic:''}]}");
      setEventMetadata("NULL","{handler:'valid_Recestinv',iparms:[]");
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
      pr_default.close(2);
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      wcpOAV23Emprcod = "" ;
      wcpOAV50RecFec = GXutil.nullDate() ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_managefilters_Activeeventkey = "" ;
      Dvelop_confirmpanel_btnmemorizarcantreal_Result = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      Dvelop_confirmpanel_btnconfirmar2_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV23Emprcod = "" ;
      AV50RecFec = GXutil.nullDate() ;
      AV27FilterFullText = "" ;
      A396EmprCod = "" ;
      AV58TFPrdNum = "" ;
      AV59TFPrdNum_Sel = "" ;
      AV56TFPrdNom = "" ;
      AV57TFPrdNom_Sel = "" ;
      AV74TFRecExiTeo = DecimalUtil.ZERO ;
      AV75TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV60TFPrdRec = "" ;
      AV61TFPrdRec_Sel = "" ;
      AV101Pgmname = "" ;
      AV53Station = "" ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV39ManageFiltersData = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      AV20DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A807RecExiRea = DecimalUtil.ZERO ;
      A12285RecLot = "" ;
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48RecExiRcc = DecimalUtil.ZERO ;
      AV10Recfechr = GXutil.resetTime( GXutil.nullDate() );
      AV92UsurCod = "" ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV11RecUbic = "" ;
      AV7CCStkHor = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_titlescategories_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      bttBtnmemorizarcantreal_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtnconfirmar2_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      AV49RecExiRea = DecimalUtil.ZERO ;
      AV21Difer = DecimalUtil.ZERO ;
      AV51RecLot = "" ;
      A727PrdRec = "" ;
      scmdbuf = "" ;
      lV102Controlrecuentoentrada_wcds_1_filterfulltext = "" ;
      lV103Controlrecuentoentrada_wcds_2_tfprdnum = "" ;
      lV105Controlrecuentoentrada_wcds_4_tfprdnom = "" ;
      lV109Controlrecuentoentrada_wcds_8_tfprdrec = "" ;
      AV102Controlrecuentoentrada_wcds_1_filterfulltext = "" ;
      AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel = "" ;
      AV103Controlrecuentoentrada_wcds_2_tfprdnum = "" ;
      AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel = "" ;
      AV105Controlrecuentoentrada_wcds_4_tfprdnom = "" ;
      AV107Controlrecuentoentrada_wcds_6_tfrecexiteo = DecimalUtil.ZERO ;
      AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel = "" ;
      AV109Controlrecuentoentrada_wcds_8_tfprdrec = "" ;
      H01SU2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H01SU2_A396EmprCod = new String[] {""} ;
      H01SU2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SU2_A11624RecMemCant = new byte[1] ;
      H01SU2_A12285RecLot = new String[] {""} ;
      H01SU2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SU2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SU2_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SU2_A13416RecEstInv = new byte[1] ;
      H01SU2_A727PrdRec = new String[] {""} ;
      H01SU2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SU2_A718PrdNom = new String[] {""} ;
      H01SU2_A719PrdNum = new String[] {""} ;
      H01SU3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV24EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV94WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV52Session = httpContext.getWebSession();
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV41ManageFiltersXml = "" ;
      AV9Inc_obs = "" ;
      AV112Precio_mov = DecimalUtil.ZERO ;
      AV22DiferCC = DecimalUtil.ZERO ;
      AV8Fecha = GXutil.nullDate() ;
      AV5CCStkCanE = DecimalUtil.ZERO ;
      AV6CCStkCanS = DecimalUtil.ZERO ;
      GXv_int19 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int8 = new int[1] ;
      GXv_char18 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int23 = new short[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_char20 = new String[1] ;
      AV26ExcelFilename = "" ;
      AV25ErrorMessage = "" ;
      GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item>(app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item.class, "Item", "", remoteHandle);
      GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item29 = new GXBaseCollection[1] ;
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char31 = "" ;
      GXt_char30 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState32 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV88TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36HTTPRequest = httpContext.getHttpRequest();
      GXv_char27 = new String[1] ;
      GXv_char26 = new String[1] ;
      GXv_date13 = new java.util.Date[1] ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_dtime16 = new java.util.Date[1] ;
      GXv_char22 = new String[1] ;
      ucDvelop_confirmpanel_btnconfirmar2 = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      ucDvelop_confirmpanel_btnmemorizarcantreal = new com.genexus.webpanels.GXUserControl();
      ucDdo_managefilters = new com.genexus.webpanels.GXUserControl();
      Ddo_managefilters_Caption = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV23Emprcod = "" ;
      sCtrlAV50RecFec = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      H01SU4_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SU4_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H01SU4_A727PrdRec = new String[] {""} ;
      H01SU4_A718PrdNom = new String[] {""} ;
      Z724PrdPreAct = DecimalUtil.ZERO ;
      Z726PrdPreMed = DecimalUtil.ZERO ;
      Z727PrdRec = "" ;
      Z718PrdNom = "" ;
      pr_default = new DataStoreProvider(context, remoteHandle, new app.controlrecuentoentrada_wc__default(),
         new Object[] {
             new Object[] {
            H01SU2_A810RecFec, H01SU2_A396EmprCod, H01SU2_A807RecExiRea, H01SU2_A11624RecMemCant, H01SU2_A12285RecLot, H01SU2_A724PrdPreAct, H01SU2_A726PrdPreMed, H01SU2_A808RecExiTcc, H01SU2_A13416RecEstInv, H01SU2_A727PrdRec,
            H01SU2_A809RecExiTeo, H01SU2_A718PrdNom, H01SU2_A719PrdNum
            }
            , new Object[] {
            H01SU3_AGRID_nRecordCount
            }
            , new Object[] {
            H01SU4_A724PrdPreAct, H01SU4_A726PrdPreMed, H01SU4_A727PrdRec, H01SU4_A718PrdNom
            }
         }
      );
      AV101Pgmname = "ControlRecuentoEntrada_WC" ;
      /* GeneXus formulas. */
      AV101Pgmname = "ControlRecuentoEntrada_WC" ;
      Gx_err = (short)(0) ;
      edtavDifer_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV40ManageFiltersExecutionStep ;
   private byte A11624RecMemCant ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte A13416RecEstInv ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int5 ;
   private byte AV113Totdet ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short AV43OrderedBy ;
   private short AV30FlagPreMed ;
   private short AV29FlagCcs ;
   private short AV42Nalmcc ;
   private short AV93Val_stk ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV47Precio_stk ;
   private short AV12Artextil ;
   private short AV37Intexco ;
   private short AV90Ubicacion ;
   private short GXv_int23[] ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_53 ;
   private int nGXsfl_53_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavPgmname_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavDifer_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int GXt_int7 ;
   private int AV46PageToGo ;
   private int edtavRecexirea_Backcolor ;
   private int edtavRecexirea_Forecolor ;
   private int edtavDifer_Backcolor ;
   private int edtavDifer_Forecolor ;
   private int edtavReclot_Backcolor ;
   private int edtavReclot_Forecolor ;
   private int nGXsfl_53_fel_idx=1 ;
   private int GXv_int19[] ;
   private int GXv_int8[] ;
   private int AV114GXV1 ;
   private int edtavFilterfulltext_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavRecexirea_Enabled ;
   private int edtavRecexirea_Visible ;
   private int edtavDifer_Visible ;
   private int edtavReclot_Enabled ;
   private int edtavReclot_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV28FlagCColor ;
   private long AV32GridCurrentPage ;
   private long AV33GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV74TFRecExiTeo ;
   private java.math.BigDecimal AV75TFRecExiTeo_To ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal AV48RecExiRcc ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal AV49RecExiRea ;
   private java.math.BigDecimal AV21Difer ;
   private java.math.BigDecimal AV107Controlrecuentoentrada_wcds_6_tfrecexiteo ;
   private java.math.BigDecimal AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to ;
   private java.math.BigDecimal AV112Precio_mov ;
   private java.math.BigDecimal AV22DiferCC ;
   private java.math.BigDecimal AV5CCStkCanE ;
   private java.math.BigDecimal AV6CCStkCanS ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal Z724PrdPreAct ;
   private java.math.BigDecimal Z726PrdPreMed ;
   private String wcpOAV23Emprcod ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_managefilters_Activeeventkey ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Result ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String Dvelop_confirmpanel_btnconfirmar2_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV23Emprcod ;
   private String sGXsfl_53_idx="0001" ;
   private String A396EmprCod ;
   private String AV58TFPrdNum ;
   private String AV59TFPrdNum_Sel ;
   private String AV56TFPrdNom ;
   private String AV57TFPrdNom_Sel ;
   private String AV60TFPrdRec ;
   private String AV61TFPrdRec_Sel ;
   private String AV101Pgmname ;
   private String AV53Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A12285RecLot ;
   private String AV92UsurCod ;
   private String AV11RecUbic ;
   private String AV7CCStkHor ;
   private String Ddo_managefilters_Icontype ;
   private String Ddo_managefilters_Icon ;
   private String Ddo_managefilters_Tooltip ;
   private String Ddo_managefilters_Cls ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
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
   private String Ddo_grid_Sortedstatus ;
   private String Ddo_grid_Includefilter ;
   private String Ddo_grid_Filtertype ;
   private String Ddo_grid_Filterisrange ;
   private String Ddo_grid_Includedatalist ;
   private String Ddo_grid_Datalisttype ;
   private String Ddo_grid_Datalistproc ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Title ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Confirmationtext ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Confirmtype ;
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String Dvelop_confirmpanel_btnconfirmar2_Title ;
   private String Dvelop_confirmpanel_btnconfirmar2_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar2_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar2_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar2_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar2_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar2_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
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
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnmemorizarcantreal_Internalname ;
   private String bttBtnmemorizarcantreal_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtnconfirmar2_Internalname ;
   private String bttBtnconfirmar2_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtavRecexirea_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtRecExiTeo_Internalname ;
   private String edtavDifer_Internalname ;
   private String AV51RecLot ;
   private String edtavReclot_Internalname ;
   private String A727PrdRec ;
   private String edtPrdRec_Internalname ;
   private String edtRecEstInv_Internalname ;
   private String edtavFilterfulltext_Internalname ;
   private String scmdbuf ;
   private String lV103Controlrecuentoentrada_wcds_2_tfprdnum ;
   private String lV105Controlrecuentoentrada_wcds_4_tfprdnom ;
   private String lV109Controlrecuentoentrada_wcds_8_tfprdrec ;
   private String AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel ;
   private String AV103Controlrecuentoentrada_wcds_2_tfprdnum ;
   private String AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel ;
   private String AV105Controlrecuentoentrada_wcds_4_tfprdnom ;
   private String AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel ;
   private String AV109Controlrecuentoentrada_wcds_8_tfprdrec ;
   private String hsh ;
   private String AV24EmprNom ;
   private String sGXsfl_53_fel_idx="0001" ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char21[] ;
   private String GXv_char20[] ;
   private String GXt_char31 ;
   private String GXt_char30 ;
   private String GXt_char1 ;
   private String GXv_char27[] ;
   private String GXv_char26[] ;
   private String GXv_char22[] ;
   private String tblTabledvelop_confirmpanel_btnconfirmar2_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar2_Internalname ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String tblTabledvelop_confirmpanel_btnmemorizarcantreal_Internalname ;
   private String Dvelop_confirmpanel_btnmemorizarcantreal_Internalname ;
   private String tblTablerightheader_Internalname ;
   private String Ddo_managefilters_Caption ;
   private String Ddo_managefilters_Internalname ;
   private String tblTablefilters_Internalname ;
   private String edtavFilterfulltext_Jsonclick ;
   private String sCtrlAV23Emprcod ;
   private String sCtrlAV50RecFec ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtRecExiTeo_Jsonclick ;
   private String edtavRecexirea_Jsonclick ;
   private String edtavDifer_Jsonclick ;
   private String edtavReclot_Jsonclick ;
   private String edtPrdRec_Jsonclick ;
   private String edtRecEstInv_Jsonclick ;
   private String subGrid_Header ;
   private String Z727PrdRec ;
   private String Z718PrdNom ;
   private java.util.Date AV10Recfechr ;
   private java.util.Date GXv_dtime16[] ;
   private java.util.Date wcpOAV50RecFec ;
   private java.util.Date AV50RecFec ;
   private java.util.Date AV8Fecha ;
   private java.util.Date GXv_date13[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV45OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_53_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV41ManageFiltersXml ;
   private String AV27FilterFullText ;
   private String lV102Controlrecuentoentrada_wcds_1_filterfulltext ;
   private String AV102Controlrecuentoentrada_wcds_1_filterfulltext ;
   private String AV9Inc_obs ;
   private String AV26ExcelFilename ;
   private String AV25ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV36HTTPRequest ;
   private com.genexus.webpanels.WebSession AV52Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar2 ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnmemorizarcantreal ;
   private com.genexus.webpanels.GXUserControl ucDdo_managefilters ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H01SU2_A810RecFec ;
   private String[] H01SU2_A396EmprCod ;
   private java.math.BigDecimal[] H01SU2_A807RecExiRea ;
   private byte[] H01SU2_A11624RecMemCant ;
   private String[] H01SU2_A12285RecLot ;
   private java.math.BigDecimal[] H01SU2_A724PrdPreAct ;
   private java.math.BigDecimal[] H01SU2_A726PrdPreMed ;
   private java.math.BigDecimal[] H01SU2_A808RecExiTcc ;
   private byte[] H01SU2_A13416RecEstInv ;
   private String[] H01SU2_A727PrdRec ;
   private java.math.BigDecimal[] H01SU2_A809RecExiTeo ;
   private String[] H01SU2_A718PrdNom ;
   private String[] H01SU2_A719PrdNum ;
   private long[] H01SU3_AGRID_nRecordCount ;
   private java.math.BigDecimal[] H01SU4_A724PrdPreAct ;
   private java.math.BigDecimal[] H01SU4_A726PrdPreMed ;
   private String[] H01SU4_A727PrdRec ;
   private String[] H01SU4_A718PrdNom ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> AV39ManageFiltersData ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXt_objcol_SdtDVB_SDTDropDownOptionsData_Item28 ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsData_Item> GXv_objcol_SdtDVB_SDTDropDownOptionsData_Item29[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV20DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState32[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV88TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV94WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class controlrecuentoentrada_wc__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H01SU2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV102Controlrecuentoentrada_wcds_1_filterfulltext ,
                                          String AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                          String AV103Controlrecuentoentrada_wcds_2_tfprdnum ,
                                          String AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                          String AV105Controlrecuentoentrada_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV107Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                          String AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                          String AV109Controlrecuentoentrada_wcds_8_tfprdrec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          String A727PrdRec ,
                                          short AV43OrderedBy ,
                                          boolean AV45OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int33 = new byte[18];
      Object[] GXv_Object34 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.RecFec, T1.EmprCod, T1.RecExiRea, T1.RecMemCant, T1.RecLot, T2.PrdPreAct, T2.PrdPreMed, T1.RecExiTcc, T1.RecEstInv, T2.PrdRec, T1.RecExiTeo, T2.PrdNom, T1.PrdNum" ;
      sFromString = " FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV102Controlrecuentoentrada_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T2.PrdRec) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int33[1] = (byte)(1) ;
         GXv_int33[2] = (byte)(1) ;
         GXv_int33[3] = (byte)(1) ;
         GXv_int33[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV103Controlrecuentoentrada_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int33[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV105Controlrecuentoentrada_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int33[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Controlrecuentoentrada_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int33[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int33[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV109Controlrecuentoentrada_wcds_8_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int33[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdRec = ?)");
      }
      else
      {
         GXv_int33[12] = (byte)(1) ;
      }
      if ( ( AV43OrderedBy == 1 ) && ! AV45OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV43OrderedBy == 1 ) && ( AV45OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV43OrderedBy == 2 ) && ! AV45OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV43OrderedBy == 2 ) && ( AV45OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV43OrderedBy == 3 ) && ! AV45OrderedDsc )
      {
         sOrderString += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV43OrderedBy == 3 ) && ( AV45OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV43OrderedBy == 4 ) && ! AV45OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdRec" ;
      }
      else if ( ( AV43OrderedBy == 4 ) && ( AV45OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdRec DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PrdNum, T1.RecFec" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object34[0] = scmdbuf ;
      GXv_Object34[1] = GXv_int33 ;
      return GXv_Object34 ;
   }

   protected Object[] conditional_H01SU3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV102Controlrecuentoentrada_wcds_1_filterfulltext ,
                                          String AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel ,
                                          String AV103Controlrecuentoentrada_wcds_2_tfprdnum ,
                                          String AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel ,
                                          String AV105Controlrecuentoentrada_wcds_4_tfprdnom ,
                                          java.math.BigDecimal AV107Controlrecuentoentrada_wcds_6_tfrecexiteo ,
                                          java.math.BigDecimal AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to ,
                                          String AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel ,
                                          String AV109Controlrecuentoentrada_wcds_8_tfprdrec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          String A727PrdRec ,
                                          short AV43OrderedBy ,
                                          boolean AV45OrderedDsc ,
                                          String A396EmprCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int35 = new byte[13];
      Object[] GXv_Object36 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ?)");
      if ( ! (GXutil.strcmp("", AV102Controlrecuentoentrada_wcds_1_filterfulltext)==0) )
      {
         addWhere(sWhereString, "(( UPPER(T1.PrdNum) like '%' || UPPER(?)) or ( UPPER(T2.PrdNom) like '%' || UPPER(?)) or ( SUBSTR(TO_CHAR(T1.RecExiTeo,'9999990.9999'), 2) like '%' || ?) or ( UPPER(T2.PrdRec) like '%' || UPPER(?)))");
      }
      else
      {
         GXv_int35[1] = (byte)(1) ;
         GXv_int35[2] = (byte)(1) ;
         GXv_int35[3] = (byte)(1) ;
         GXv_int35[4] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV103Controlrecuentoentrada_wcds_2_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[5] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV104Controlrecuentoentrada_wcds_3_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int35[6] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV105Controlrecuentoentrada_wcds_4_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[7] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV106Controlrecuentoentrada_wcds_5_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int35[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV107Controlrecuentoentrada_wcds_6_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int35[9] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV108Controlrecuentoentrada_wcds_7_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int35[10] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV109Controlrecuentoentrada_wcds_8_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int35[11] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV110Controlrecuentoentrada_wcds_9_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdRec = ?)");
      }
      else
      {
         GXv_int35[12] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV43OrderedBy == 1 ) && ! AV45OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 1 ) && ( AV45OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 2 ) && ! AV45OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 2 ) && ( AV45OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 3 ) && ! AV45OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 3 ) && ( AV45OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 4 ) && ! AV45OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 4 ) && ( AV45OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object36[0] = scmdbuf ;
      GXv_Object36[1] = GXv_int35 ;
      return GXv_Object36 ;
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
                  return conditional_H01SU2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] );
            case 1 :
                  return conditional_H01SU3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (String)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , (String)dynConstraints[12] , ((Number) dynConstraints[13]).shortValue() , ((Boolean) dynConstraints[14]).booleanValue() , (String)dynConstraints[15] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H01SU2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01SU3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H01SU4", "SELECT PrdPreAct, PrdPreMed, PrdRec, PrdNom FROM TXPPRODUC WHERE EmprCod = ? AND PrdNum = ? ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.math.BigDecimal[]) buf[2])[0] = rslt.getBigDecimal(3,4);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(7,5);
               ((java.math.BigDecimal[]) buf[7])[0] = rslt.getBigDecimal(8,4);
               ((byte[]) buf[8])[0] = rslt.getByte(9);
               ((String[]) buf[9])[0] = rslt.getString(10, 1);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((String[]) buf[11])[0] = rslt.getString(12, 26);
               ((String[]) buf[12])[0] = rslt.getString(13, 6);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((java.math.BigDecimal[]) buf[0])[0] = rslt.getBigDecimal(1,5);
               ((java.math.BigDecimal[]) buf[1])[0] = rslt.getBigDecimal(2,5);
               ((String[]) buf[2])[0] = rslt.getString(3, 1);
               ((String[]) buf[3])[0] = rslt.getString(4, 26);
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
                  stmt.setString(sIdx, (String)parms[18], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[19], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[20], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[21], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[22], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[30], 1);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[34]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[35]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[14], 100);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[15], 100);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[16], 100);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setVarchar(sIdx, (String)parms[17], 100);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 4);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 4);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 1);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

