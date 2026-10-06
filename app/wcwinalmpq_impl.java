package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class wcwinalmpq_impl extends GXWebComponent
{
   public wcwinalmpq_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public wcwinalmpq_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( wcwinalmpq_impl.class ));
   }

   public wcwinalmpq_impl( int remoteHandle ,
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
      chkavSeleccionar = UIFactory.getCheckbox(this);
      cmbavPedcum = new HTMLChoice();
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
               AV6Pedcod = (int)(GXutil.lval( httpContext.GetPar( "Pedcod"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Pedcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Pedcod), 8, 0));
               AV7EntNAlbar = httpContext.GetPar( "EntNAlbar") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EntNAlbar", AV7EntNAlbar);
               AV8EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8EntFecEnt", localUtil.format(AV8EntFecEnt, "99/99/99"));
               AV33PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33PrvNum), 6, 0));
               AV112PrvNom = httpContext.GetPar( "PrvNom") ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112PrvNom", AV112PrvNom);
               setjustcreated();
               componentprepare(new Object[] {sCompPrefix,sSFPrefix,AV5Emprcod,Integer.valueOf(AV6Pedcod),AV7EntNAlbar,AV8EntFecEnt,Integer.valueOf(AV33PrvNum),AV112PrvNom});
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
      nRC_GXsfl_31 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_31"))) ;
      nGXsfl_31_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_31_idx"))) ;
      sGXsfl_31_idx = httpContext.GetPar( "sGXsfl_31_idx") ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      edtavEntnemb_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntnemb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntnemb_Visible), 5, 0), !bGXsfl_31_Refreshing);
      edtavNetiquetas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNetiquetas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNetiquetas_Visible), 5, 0), !bGXsfl_31_Refreshing);
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
      AV6Pedcod = (int)(GXutil.lval( httpContext.GetPar( "Pedcod"))) ;
      AV63TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV64TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV66TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV67TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV69TFPedUni = CommonUtil.decimalVal( httpContext.GetPar( "TFPedUni"), ".") ;
      AV70TFPedUni_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPedUni_To"), ".") ;
      AV72TFPedCanEnt = CommonUtil.decimalVal( httpContext.GetPar( "TFPedCanEnt"), ".") ;
      AV73TFPedCanEnt_To = CommonUtil.decimalVal( httpContext.GetPar( "TFPedCanEnt_To"), ".") ;
      AV113TFPrdRec = httpContext.GetPar( "TFPrdRec") ;
      AV114TFPrdRec_Sel = httpContext.GetPar( "TFPrdRec_Sel") ;
      AV137Pgmname = httpContext.GetPar( "Pgmname") ;
      AV49OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV50OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV7EntNAlbar = httpContext.GetPar( "EntNAlbar") ;
      AV8EntFecEnt = localUtil.parseDateParm( httpContext.GetPar( "EntFecEnt")) ;
      AV33PrvNum = (int)(GXutil.lval( httpContext.GetPar( "PrvNum"))) ;
      AV112PrvNom = httpContext.GetPar( "PrvNom") ;
      edtavEntnemb_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntnemb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntnemb_Visible), 5, 0), !bGXsfl_31_Refreshing);
      edtavNetiquetas_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNetiquetas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNetiquetas_Visible), 5, 0), !bGXsfl_31_Refreshing);
      A3342CCStkLin = GXutil.lval( httpContext.GetPar( "CCStkLin")) ;
      A3348CCStkFec = localUtil.parseDateParm( httpContext.GetPar( "CCStkFec")) ;
      AV97ccstkulin = GXutil.lval( httpContext.GetPar( "ccstkulin")) ;
      AV109Moda21 = (short)(GXutil.lval( httpContext.GetPar( "Moda21"))) ;
      AV19LOtes = (byte)(GXutil.lval( httpContext.GetPar( "LOtes"))) ;
      Gx_date = localUtil.parseDateParm( httpContext.GetPar( "Gx_date")) ;
      AV11Carvitin = (byte)(GXutil.lval( httpContext.GetPar( "Carvitin"))) ;
      AV17FlagFecCCS = (byte)(GXutil.lval( httpContext.GetPar( "FlagFecCCS"))) ;
      sPrefix = httpContext.GetPar( "sPrefix") ;
      init_default_properties( ) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Pedcod, AV63TFPrdNum, AV64TFPrdNum_Sel, AV66TFPrdNom, AV67TFPrdNom_Sel, AV69TFPedUni, AV70TFPedUni_To, AV72TFPedCanEnt, AV73TFPedCanEnt_To, AV113TFPrdRec, AV114TFPrdRec_Sel, AV137Pgmname, AV49OrderedBy, AV50OrderedDsc, AV7EntNAlbar, AV8EntFecEnt, AV33PrvNum, AV112PrvNom, A3342CCStkLin, A3348CCStkFec, AV97ccstkulin, AV109Moda21, AV19LOtes, Gx_date, AV11Carvitin, AV17FlagFecCCS, sPrefix) ;
      addString( httpContext.getJSONResponse( )) ;
      /* End function gxgrGrid_refresh_invoke */
   }

   public void webExecute( )
   {
      initweb( ) ;
      if ( ! isAjaxCallMode( ) )
      {
         paWP2( ) ;
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
         httpContext.writeValue( httpContext.getMessage( " PEDIDOS PROVEEDORES", "")) ;
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
         httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.wcwinalmpq", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.ltrimstr(AV6Pedcod,8,0)),GXutil.URLEncode(GXutil.rtrim(AV7EntNAlbar)),GXutil.URLEncode(GXutil.formatDateParm(AV8EntFecEnt)),GXutil.URLEncode(GXutil.ltrimstr(AV33PrvNum,6,0)),GXutil.URLEncode(GXutil.rtrim(AV112PrvNom))}, new String[] {"Emprcod","Pedcod","EntNAlbar","EntFecEnt","PrvNum","PrvNom"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV137Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKULIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV97ccstkulin), "ZZZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV109Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV19LOtes), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTODAY", getSecureSignedToken( sPrefix, Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV11Carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGFECCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV17FlagFecCCS), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"nRC_GXsfl_31", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_31, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri(sPrefix, false, sPrefix+"vDDO_TITLESETTINGSICONS", AV75DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt(sPrefix+"vDDO_TITLESETTINGSICONS", AV75DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV5Emprcod", GXutil.rtrim( wcpOAV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV6Pedcod", GXutil.ltrim( localUtil.ntoc( wcpOAV6Pedcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV7EntNAlbar", GXutil.rtrim( wcpOAV7EntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV8EntFecEnt", localUtil.dtoc( wcpOAV8EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV33PrvNum", GXutil.ltrim( localUtil.ntoc( wcpOAV33PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"wcpOAV112PrvNom", GXutil.rtrim( wcpOAV112PrvNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM", GXutil.rtrim( AV63TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNUM_SEL", GXutil.rtrim( AV64TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM", GXutil.rtrim( AV66TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDNOM_SEL", GXutil.rtrim( AV67TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDUNI", GXutil.ltrim( localUtil.ntoc( AV69TFPedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDUNI_TO", GXutil.ltrim( localUtil.ntoc( AV70TFPedUni_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCANENT", GXutil.ltrim( localUtil.ntoc( AV72TFPedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPEDCANENT_TO", GXutil.ltrim( localUtil.ntoc( AV73TFPedCanEnt_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREC", GXutil.rtrim( AV113TFPrdRec));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTFPRDREC_SEL", GXutil.rtrim( AV114TFPrdRec_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV137Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV137Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV49OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, sPrefix+"vORDEREDDSC", AV50OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vEMPRCOD", GXutil.rtrim( AV5Emprcod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPEDCOD", GXutil.ltrim( localUtil.ntoc( AV6Pedcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTNALBAR", GXutil.rtrim( AV7EntNAlbar));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTFECENT", localUtil.dtoc( AV8EntFecEnt, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKULIN", GXutil.ltrim( localUtil.ntoc( A3341CCStKULin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKLIN", GXutil.ltrim( localUtil.ntoc( A3342CCStkLin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"CCSTKFEC", localUtil.dtoc( A3348CCStkFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKULIN", GXutil.ltrim( localUtil.ntoc( AV97ccstkulin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKULIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV97ccstkulin), "ZZZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV109Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV109Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLOTES", GXutil.ltrim( localUtil.ntoc( AV19LOtes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV19LOtes), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTODAY", getSecureSignedToken( sPrefix, Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPRODUCTOSETIQUETAS", AV76productosEtiquetas);
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vI", GXutil.ltrim( localUtil.ntoc( AV18i, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV11Carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV11Carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGFECCCS", GXutil.ltrim( localUtil.ntoc( AV17FlagFecCCS, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGFECCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV17FlagFecCCS), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMSG", GXutil.rtrim( Gx_msg));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vHAYVALORES", GXutil.ltrim( localUtil.ntoc( AV102Hayvalores, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname", GXutil.rtrim( Grid_titlescategories_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories", GXutil.rtrim( Grid_titlescategories_Gridtitlescategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hascategories", GXutil.booltostr( Grid_empowerer_Hascategories));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vENTNEMB_Visible", GXutil.ltrim( localUtil.ntoc( edtavEntnemb_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vNETIQUETAS_Visible", GXutil.ltrim( localUtil.ntoc( edtavNetiquetas_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
   }

   public void renderHtmlCloseFormWP2( )
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
      return "WCWINAlmPq" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " PEDIDOS PROVEEDORES", "") ;
   }

   public void wbWP0( )
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
            app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"_CMPPGM", "app.wcwinalmpq");
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
            httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainWithShadow", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 16,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 31, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+"e11wp1_client"+"'", TempTags, "", 2, "HLP_WCWINAlmPq.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 18,'" + sPrefix + "',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncancelar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 31, 2, 0)+","+"null"+");", httpContext.getMessage( "Cancelar", ""), bttBtncancelar_Jsonclick, 5, httpContext.getMessage( "Cancelar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+sPrefix+"'"+",false,"+"'"+sPrefix+"E\\'DOCANCELAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WCWINAlmPq.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrvnum_Internalname, httpContext.getMessage( "ProveedorID", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnum_Internalname, GXutil.ltrim( localUtil.ntoc( AV33PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrvnum_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV33PrvNum), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV33PrvNum), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnum_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrvnum_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WCWINAlmPq.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-5", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrvnom_Internalname, httpContext.getMessage( "Prv Nom", ""), "col-sm-3 AttributeFLLabel", 0, true, "");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrvnom_Internalname, GXutil.rtrim( AV112PrvNom), GXutil.rtrim( localUtil.format( AV112PrvNom, "")), "", "'"+sPrefix+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrvnom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavPrvnom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WCWINAlmPq.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "", "left", "top", "", "flex-grow:1;", "div");
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
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol31( ) ;
      }
      if ( wbEnd == 31 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_31 = (int)(nGXsfl_31_idx-1) ;
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV75DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, sPrefix+"DDO_GRIDContainer");
         wb_table1_54_WP2( true) ;
      }
      else
      {
         wb_table1_54_WP2( false) ;
      }
      return  ;
   }

   public void wb_table1_54_WP2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_titlescategories.setProperty("GridTitlesCategories", Grid_titlescategories_Gridtitlescategories);
         ucGrid_titlescategories.render(context, "dvelop.gridtitlescategories", Grid_titlescategories_Internalname, sPrefix+"GRID_TITLESCATEGORIESContainer");
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasCategories", Grid_empowerer_Hascategories);
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, sPrefix+"GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 31 )
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

   public void startWP2( )
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
            Form.getMeta().addItem("description", httpContext.getMessage( " PEDIDOS PROVEEDORES", ""), (short)(0)) ;
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
            strupWP0( ) ;
         }
      }
   }

   public void wsWP2( )
   {
      startWP2( ) ;
      evtWP2( ) ;
   }

   public void evtWP2( )
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
                              strupWP0( ) ;
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
                              strupWP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e12WP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupWP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 e13WP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCANCELAR'") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupWP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoCancelar' */
                                 e14WP2 ();
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupWP0( ) ;
                           }
                           if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                           {
                              httpContext.wbHandled = (byte)(1) ;
                              if ( ! wbErr )
                              {
                                 dynload_actions( ) ;
                                 GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                 httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              }
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupWP0( ) ;
                           }
                           AV121Wcwinalmpqds_1_tfprdnum = AV63TFPrdNum ;
                           AV122Wcwinalmpqds_2_tfprdnum_sel = AV64TFPrdNum_Sel ;
                           AV123Wcwinalmpqds_3_tfprdnom = AV66TFPrdNom ;
                           AV124Wcwinalmpqds_4_tfprdnom_sel = AV67TFPrdNom_Sel ;
                           AV125Wcwinalmpqds_5_tfpeduni = AV69TFPedUni ;
                           AV126Wcwinalmpqds_6_tfpeduni_to = AV70TFPedUni_To ;
                           AV127Wcwinalmpqds_7_tfpedcanent = AV72TFPedCanEnt ;
                           AV128Wcwinalmpqds_8_tfpedcanent_to = AV73TFPedCanEnt_To ;
                           AV129Wcwinalmpqds_9_tfprdrec = AV113TFPrdRec ;
                           AV130Wcwinalmpqds_10_tfprdrec_sel = AV114TFPrdRec_Sel ;
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 5), "ENTER") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) )
                        {
                           if ( ( GXutil.len( sPrefix) != 0 ) && ( nDoneStart == 0 ) )
                           {
                              strupWP0( ) ;
                           }
                           nGXsfl_31_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_31_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_31_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_312( ) ;
                           AV103Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV103Seleccionar);
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A669PedUni = localUtil.ctond( httpContext.cgiGet( edtPedUni_Internalname)) ;
                           A657PedCanEnt = localUtil.ctond( httpContext.cgiGet( edtPedCanEnt_Internalname)) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavEntnemb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavEntnemb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vENTNEMB");
                              GX_FocusControl = edtavEntnemb_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV111EntNEmb = (byte)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntnemb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111EntNEmb), 2, 0));
                           }
                           else
                           {
                              AV111EntNEmb = (byte)(localUtil.ctol( httpContext.cgiGet( edtavEntnemb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntnemb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111EntNEmb), 2, 0));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPedcanent_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPedcanent_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPEDCANENT");
                              GX_FocusControl = edtavPedcanent_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV28PedCanEnt = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPedcanent_Internalname, GXutil.ltrimstr( AV28PedCanEnt, 9, 2));
                           }
                           else
                           {
                              AV28PedCanEnt = localUtil.ctond( httpContext.cgiGet( edtavPedcanent_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPedcanent_Internalname, GXutil.ltrimstr( AV28PedCanEnt, 9, 2));
                           }
                           cmbavPedcum.setName( cmbavPedcum.getInternalname() );
                           cmbavPedcum.setValue( httpContext.cgiGet( cmbavPedcum.getInternalname()) );
                           AV98PedCum = httpContext.cgiGet( cmbavPedcum.getInternalname()) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavPedcum.getInternalname(), AV98PedCum);
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPedpre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPedpre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPEDPRE");
                              GX_FocusControl = edtavPedpre_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV30PedPre = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPedpre_Internalname, GXutil.ltrimstr( AV30PedPre, 14, 5));
                           }
                           else
                           {
                              AV30PedPre = localUtil.ctond( httpContext.cgiGet( edtavPedpre_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPedpre_Internalname, GXutil.ltrimstr( AV30PedPre, 14, 5));
                           }
                           if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavValorlinea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValorlinea_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALORLINEA");
                              GX_FocusControl = edtavValorlinea_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV115ValorLinea = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValorlinea_Internalname, GXutil.ltrimstr( AV115ValorLinea, 12, 2));
                           }
                           else
                           {
                              AV115ValorLinea = localUtil.ctond( httpContext.cgiGet( edtavValorlinea_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValorlinea_Internalname, GXutil.ltrimstr( AV115ValorLinea, 12, 2));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNetiquetas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNetiquetas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNETIQUETAS");
                              GX_FocusControl = edtavNetiquetas_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV25NEtiquetas = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNetiquetas_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25NEtiquetas), 4, 0));
                           }
                           else
                           {
                              AV25NEtiquetas = (short)(localUtil.ctol( httpContext.cgiGet( edtavNetiquetas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNetiquetas_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25NEtiquetas), 4, 0));
                           }
                           AV13EntLotN = httpContext.cgiGet( edtavEntlotn_Internalname) ;
                           httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntlotn_Internalname, AV13EntLotN);
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavEntfval_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vENTFVAL");
                              GX_FocusControl = edtavEntfval_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV12EntFVal = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntfval_Internalname, localUtil.format(AV12EntFVal, "99/99/99"));
                           }
                           else
                           {
                              AV12EntFVal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavEntfval_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntfval_Internalname, localUtil.format(AV12EntFVal, "99/99/99"));
                           }
                           A721PrdNumUco = localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)) ;
                           A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
                           A659PedCum = GXutil.upper( httpContext.cgiGet( edtPedCum_Internalname)) ;
                           if ( localUtil.vcdtime( httpContext.cgiGet( edtavUltfecccs_Internalname), (byte)(0), (byte)(0)) == 0 )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vULTFECCCS");
                              GX_FocusControl = edtavUltfecccs_Internalname ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV96UltFecCCs = GXutil.nullDate() ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUltfecccs_Internalname, localUtil.format(AV96UltFecCCs, "99/99/99"));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vULTFECCCS"+"_"+sGXsfl_31_idx, getSecureSignedToken( sPrefix+sGXsfl_31_idx, AV96UltFecCCs));
                           }
                           else
                           {
                              AV96UltFecCCs = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavUltfecccs_Internalname), 0)) ;
                              httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUltfecccs_Internalname, localUtil.format(AV96UltFecCCs, "99/99/99"));
                              app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vULTFECCCS"+"_"+sGXsfl_31_idx, getSecureSignedToken( sPrefix+sGXsfl_31_idx, AV96UltFecCCs));
                           }
                           A665PedPre = localUtil.ctond( httpContext.cgiGet( edtPedPre_Internalname)) ;
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Start */
                                       e15WP2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       /* Execute user event: Refresh */
                                       e16WP2 ();
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
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
                                       httpContext.ajax_rsp_assign_attri(sPrefix, false, "GX_FocusControl", GX_FocusControl);
                                       e17WP2 ();
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
                                    strupWP0( ) ;
                                 }
                                 if ( ! httpContext.willRedirect( ) && ( httpContext.nUserReturn != 1 ) )
                                 {
                                    httpContext.wbHandled = (byte)(1) ;
                                    if ( ! wbErr )
                                    {
                                       dynload_actions( ) ;
                                       GX_FocusControl = chkavSeleccionar.getInternalname() ;
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

   public void weWP2( )
   {
      if ( ! app.GxWebStd.gx_redirect( httpContext) )
      {
         Rfr0gs = true ;
         refresh( ) ;
         if ( ! app.GxWebStd.gx_redirect( httpContext) )
         {
            renderHtmlCloseFormWP2( ) ;
         }
      }
   }

   public void paWP2( )
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
      subsflControlProps_312( ) ;
      while ( nGXsfl_31_idx <= nRC_GXsfl_31 )
      {
         sendrow_312( ) ;
         nGXsfl_31_idx = ((subGrid_Islastpage==1)&&(nGXsfl_31_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_31_idx+1) ;
         sGXsfl_31_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_31_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_312( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5Emprcod ,
                                 int AV6Pedcod ,
                                 String AV63TFPrdNum ,
                                 String AV64TFPrdNum_Sel ,
                                 String AV66TFPrdNom ,
                                 String AV67TFPrdNom_Sel ,
                                 java.math.BigDecimal AV69TFPedUni ,
                                 java.math.BigDecimal AV70TFPedUni_To ,
                                 java.math.BigDecimal AV72TFPedCanEnt ,
                                 java.math.BigDecimal AV73TFPedCanEnt_To ,
                                 String AV113TFPrdRec ,
                                 String AV114TFPrdRec_Sel ,
                                 String AV137Pgmname ,
                                 short AV49OrderedBy ,
                                 boolean AV50OrderedDsc ,
                                 String AV7EntNAlbar ,
                                 java.util.Date AV8EntFecEnt ,
                                 int AV33PrvNum ,
                                 String AV112PrvNom ,
                                 long A3342CCStkLin ,
                                 java.util.Date A3348CCStkFec ,
                                 long AV97ccstkulin ,
                                 short AV109Moda21 ,
                                 byte AV19LOtes ,
                                 java.util.Date Gx_date ,
                                 byte AV11Carvitin ,
                                 byte AV17FlagFecCCS ,
                                 String sPrefix )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e16WP2 ();
      GRID_nCurrentRecord = 0 ;
      rfWP2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDCUM", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( A659PedCum, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDCUM", GXutil.rtrim( A659PedCum));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vULTFECCCS", getSecureSignedToken( sPrefix, AV96UltFecCCs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vULTFECCCS", localUtil.format(AV96UltFecCCs, "99/99/99"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDCANENT", getSecureSignedToken( sPrefix, localUtil.format( A657PedCanEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDCANENT", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDUNI", getSecureSignedToken( sPrefix, localUtil.format( A669PedUni, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"PEDUNI", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_31_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rfWP2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV137Pgmname = "WCWINAlmPq" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavPrvnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnum_Enabled), 5, 0), true);
      edtavPrvnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Enabled), 5, 0), true);
      chkavSeleccionar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSeleccionar.getEnabled(), 5, 0), !bGXsfl_31_Refreshing);
      edtavValorlinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValorlinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValorlinea_Enabled), 5, 0), !bGXsfl_31_Refreshing);
      edtavUltfecccs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUltfecccs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUltfecccs_Enabled), 5, 0), !bGXsfl_31_Refreshing);
   }

   public void rfWP2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(31) ;
      /* Execute user event: Refresh */
      e16WP2 ();
      nGXsfl_31_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_31_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_31_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_312( ) ;
      bGXsfl_31_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", sPrefix);
      GridContainer.AddObjectProperty("InMasterPage", "false");
      GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
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
         subsflControlProps_312( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              AV122Wcwinalmpqds_2_tfprdnum_sel ,
                                              AV121Wcwinalmpqds_1_tfprdnum ,
                                              AV124Wcwinalmpqds_4_tfprdnom_sel ,
                                              AV123Wcwinalmpqds_3_tfprdnom ,
                                              AV125Wcwinalmpqds_5_tfpeduni ,
                                              AV126Wcwinalmpqds_6_tfpeduni_to ,
                                              AV127Wcwinalmpqds_7_tfpedcanent ,
                                              AV128Wcwinalmpqds_8_tfpedcanent_to ,
                                              AV130Wcwinalmpqds_10_tfprdrec_sel ,
                                              AV129Wcwinalmpqds_9_tfprdrec ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A669PedUni ,
                                              A657PedCanEnt ,
                                              A727PrdRec ,
                                              Short.valueOf(AV49OrderedBy) ,
                                              Boolean.valueOf(AV50OrderedDsc) ,
                                              A667PedSit ,
                                              A659PedCum ,
                                              AV5Emprcod ,
                                              Integer.valueOf(AV6Pedcod) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A658PedCod) } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV121Wcwinalmpqds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV121Wcwinalmpqds_1_tfprdnum), 6, "%") ;
         lV123Wcwinalmpqds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV123Wcwinalmpqds_3_tfprdnom), 26, "%") ;
         lV129Wcwinalmpqds_9_tfprdrec = GXutil.padr( GXutil.rtrim( AV129Wcwinalmpqds_9_tfprdrec), 1, "%") ;
         /* Using cursor H00WP2 */
         pr_default.execute(0, new Object[] {AV5Emprcod, Integer.valueOf(AV6Pedcod), lV121Wcwinalmpqds_1_tfprdnum, AV122Wcwinalmpqds_2_tfprdnum_sel, lV123Wcwinalmpqds_3_tfprdnom, AV124Wcwinalmpqds_4_tfprdnom_sel, AV125Wcwinalmpqds_5_tfpeduni, AV126Wcwinalmpqds_6_tfpeduni_to, AV127Wcwinalmpqds_7_tfpedcanent, AV128Wcwinalmpqds_8_tfpedcanent_to, lV129Wcwinalmpqds_9_tfprdrec, AV130Wcwinalmpqds_10_tfprdrec_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_31_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_31_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_31_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_312( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A719PrdNum = H00WP2_A719PrdNum[0] ;
            A396EmprCod = H00WP2_A396EmprCod[0] ;
            A658PedCod = H00WP2_A658PedCod[0] ;
            A667PedSit = H00WP2_A667PedSit[0] ;
            A3341CCStKULin = H00WP2_A3341CCStKULin[0] ;
            n3341CCStKULin = H00WP2_n3341CCStKULin[0] ;
            A665PedPre = H00WP2_A665PedPre[0] ;
            A659PedCum = H00WP2_A659PedCum[0] ;
            A727PrdRec = H00WP2_A727PrdRec[0] ;
            A721PrdNumUco = H00WP2_A721PrdNumUco[0] ;
            A657PedCanEnt = H00WP2_A657PedCanEnt[0] ;
            A669PedUni = H00WP2_A669PedUni[0] ;
            A718PrdNom = H00WP2_A718PrdNom[0] ;
            A3341CCStKULin = H00WP2_A3341CCStKULin[0] ;
            n3341CCStKULin = H00WP2_n3341CCStKULin[0] ;
            A727PrdRec = H00WP2_A727PrdRec[0] ;
            A721PrdNumUco = H00WP2_A721PrdNumUco[0] ;
            A718PrdNom = H00WP2_A718PrdNom[0] ;
            A667PedSit = H00WP2_A667PedSit[0] ;
            e17WP2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(31) ;
         wbWP0( ) ;
      }
      bGXsfl_31_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesWP2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vPGMNAME", GXutil.rtrim( AV137Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vPGMNAME", getSecureSignedToken( sPrefix, GXutil.rtrim( localUtil.format( AV137Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCCSTKULIN", GXutil.ltrim( localUtil.ntoc( AV97ccstkulin, (byte)(12), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKULIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV97ccstkulin), "ZZZZZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vMODA21", GXutil.ltrim( localUtil.ntoc( AV109Moda21, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV109Moda21), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vLOTES", GXutil.ltrim( localUtil.ntoc( AV19LOtes, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV19LOtes), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vTODAY", localUtil.dtoc( Gx_date, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vTODAY", getSecureSignedToken( sPrefix, Gx_date));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vCARVITIN", GXutil.ltrim( localUtil.ntoc( AV11Carvitin, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCARVITIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV11Carvitin), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDCUM"+"_"+sGXsfl_31_idx, getSecureSignedToken( sPrefix+sGXsfl_31_idx, GXutil.rtrim( localUtil.format( A659PedCum, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vULTFECCCS"+"_"+sGXsfl_31_idx, getSecureSignedToken( sPrefix+sGXsfl_31_idx, AV96UltFecCCs));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"vFLAGFECCCS", GXutil.ltrim( localUtil.ntoc( AV17FlagFecCCS, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGFECCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV17FlagFecCCS), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDCANENT"+"_"+sGXsfl_31_idx, getSecureSignedToken( sPrefix+sGXsfl_31_idx, localUtil.format( A657PedCanEnt, "ZZZZZ9.99")));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_PEDUNI"+"_"+sGXsfl_31_idx, getSecureSignedToken( sPrefix+sGXsfl_31_idx, localUtil.format( A669PedUni, "ZZZZZ9.99")));
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
      AV121Wcwinalmpqds_1_tfprdnum = AV63TFPrdNum ;
      AV122Wcwinalmpqds_2_tfprdnum_sel = AV64TFPrdNum_Sel ;
      AV123Wcwinalmpqds_3_tfprdnom = AV66TFPrdNom ;
      AV124Wcwinalmpqds_4_tfprdnom_sel = AV67TFPrdNom_Sel ;
      AV125Wcwinalmpqds_5_tfpeduni = AV69TFPedUni ;
      AV126Wcwinalmpqds_6_tfpeduni_to = AV70TFPedUni_To ;
      AV127Wcwinalmpqds_7_tfpedcanent = AV72TFPedCanEnt ;
      AV128Wcwinalmpqds_8_tfpedcanent_to = AV73TFPedCanEnt_To ;
      AV129Wcwinalmpqds_9_tfprdrec = AV113TFPrdRec ;
      AV130Wcwinalmpqds_10_tfprdrec_sel = AV114TFPrdRec_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           AV122Wcwinalmpqds_2_tfprdnum_sel ,
                                           AV121Wcwinalmpqds_1_tfprdnum ,
                                           AV124Wcwinalmpqds_4_tfprdnom_sel ,
                                           AV123Wcwinalmpqds_3_tfprdnom ,
                                           AV125Wcwinalmpqds_5_tfpeduni ,
                                           AV126Wcwinalmpqds_6_tfpeduni_to ,
                                           AV127Wcwinalmpqds_7_tfpedcanent ,
                                           AV128Wcwinalmpqds_8_tfpedcanent_to ,
                                           AV130Wcwinalmpqds_10_tfprdrec_sel ,
                                           AV129Wcwinalmpqds_9_tfprdrec ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A669PedUni ,
                                           A657PedCanEnt ,
                                           A727PrdRec ,
                                           Short.valueOf(AV49OrderedBy) ,
                                           Boolean.valueOf(AV50OrderedDsc) ,
                                           A667PedSit ,
                                           A659PedCum ,
                                           AV5Emprcod ,
                                           Integer.valueOf(AV6Pedcod) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A658PedCod) } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV121Wcwinalmpqds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV121Wcwinalmpqds_1_tfprdnum), 6, "%") ;
      lV123Wcwinalmpqds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV123Wcwinalmpqds_3_tfprdnom), 26, "%") ;
      lV129Wcwinalmpqds_9_tfprdrec = GXutil.padr( GXutil.rtrim( AV129Wcwinalmpqds_9_tfprdrec), 1, "%") ;
      /* Using cursor H00WP3 */
      pr_default.execute(1, new Object[] {AV5Emprcod, Integer.valueOf(AV6Pedcod), lV121Wcwinalmpqds_1_tfprdnum, AV122Wcwinalmpqds_2_tfprdnum_sel, lV123Wcwinalmpqds_3_tfprdnom, AV124Wcwinalmpqds_4_tfprdnom_sel, AV125Wcwinalmpqds_5_tfpeduni, AV126Wcwinalmpqds_6_tfpeduni_to, AV127Wcwinalmpqds_7_tfpedcanent, AV128Wcwinalmpqds_8_tfpedcanent_to, lV129Wcwinalmpqds_9_tfprdrec, AV130Wcwinalmpqds_10_tfprdrec_sel});
      GRID_nRecordCount = H00WP3_AGRID_nRecordCount[0] ;
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
      AV121Wcwinalmpqds_1_tfprdnum = AV63TFPrdNum ;
      AV122Wcwinalmpqds_2_tfprdnum_sel = AV64TFPrdNum_Sel ;
      AV123Wcwinalmpqds_3_tfprdnom = AV66TFPrdNom ;
      AV124Wcwinalmpqds_4_tfprdnom_sel = AV67TFPrdNom_Sel ;
      AV125Wcwinalmpqds_5_tfpeduni = AV69TFPedUni ;
      AV126Wcwinalmpqds_6_tfpeduni_to = AV70TFPedUni_To ;
      AV127Wcwinalmpqds_7_tfpedcanent = AV72TFPedCanEnt ;
      AV128Wcwinalmpqds_8_tfpedcanent_to = AV73TFPedCanEnt_To ;
      AV129Wcwinalmpqds_9_tfprdrec = AV113TFPrdRec ;
      AV130Wcwinalmpqds_10_tfprdrec_sel = AV114TFPrdRec_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Pedcod, AV63TFPrdNum, AV64TFPrdNum_Sel, AV66TFPrdNom, AV67TFPrdNom_Sel, AV69TFPedUni, AV70TFPedUni_To, AV72TFPedCanEnt, AV73TFPedCanEnt_To, AV113TFPrdRec, AV114TFPrdRec_Sel, AV137Pgmname, AV49OrderedBy, AV50OrderedDsc, AV7EntNAlbar, AV8EntFecEnt, AV33PrvNum, AV112PrvNom, A3342CCStkLin, A3348CCStkFec, AV97ccstkulin, AV109Moda21, AV19LOtes, Gx_date, AV11Carvitin, AV17FlagFecCCS, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV121Wcwinalmpqds_1_tfprdnum = AV63TFPrdNum ;
      AV122Wcwinalmpqds_2_tfprdnum_sel = AV64TFPrdNum_Sel ;
      AV123Wcwinalmpqds_3_tfprdnom = AV66TFPrdNom ;
      AV124Wcwinalmpqds_4_tfprdnom_sel = AV67TFPrdNom_Sel ;
      AV125Wcwinalmpqds_5_tfpeduni = AV69TFPedUni ;
      AV126Wcwinalmpqds_6_tfpeduni_to = AV70TFPedUni_To ;
      AV127Wcwinalmpqds_7_tfpedcanent = AV72TFPedCanEnt ;
      AV128Wcwinalmpqds_8_tfpedcanent_to = AV73TFPedCanEnt_To ;
      AV129Wcwinalmpqds_9_tfprdrec = AV113TFPrdRec ;
      AV130Wcwinalmpqds_10_tfprdrec_sel = AV114TFPrdRec_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Pedcod, AV63TFPrdNum, AV64TFPrdNum_Sel, AV66TFPrdNom, AV67TFPrdNom_Sel, AV69TFPedUni, AV70TFPedUni_To, AV72TFPedCanEnt, AV73TFPedCanEnt_To, AV113TFPrdRec, AV114TFPrdRec_Sel, AV137Pgmname, AV49OrderedBy, AV50OrderedDsc, AV7EntNAlbar, AV8EntFecEnt, AV33PrvNum, AV112PrvNom, A3342CCStkLin, A3348CCStkFec, AV97ccstkulin, AV109Moda21, AV19LOtes, Gx_date, AV11Carvitin, AV17FlagFecCCS, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV121Wcwinalmpqds_1_tfprdnum = AV63TFPrdNum ;
      AV122Wcwinalmpqds_2_tfprdnum_sel = AV64TFPrdNum_Sel ;
      AV123Wcwinalmpqds_3_tfprdnom = AV66TFPrdNom ;
      AV124Wcwinalmpqds_4_tfprdnom_sel = AV67TFPrdNom_Sel ;
      AV125Wcwinalmpqds_5_tfpeduni = AV69TFPedUni ;
      AV126Wcwinalmpqds_6_tfpeduni_to = AV70TFPedUni_To ;
      AV127Wcwinalmpqds_7_tfpedcanent = AV72TFPedCanEnt ;
      AV128Wcwinalmpqds_8_tfpedcanent_to = AV73TFPedCanEnt_To ;
      AV129Wcwinalmpqds_9_tfprdrec = AV113TFPrdRec ;
      AV130Wcwinalmpqds_10_tfprdrec_sel = AV114TFPrdRec_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Pedcod, AV63TFPrdNum, AV64TFPrdNum_Sel, AV66TFPrdNom, AV67TFPrdNom_Sel, AV69TFPedUni, AV70TFPedUni_To, AV72TFPedCanEnt, AV73TFPedCanEnt_To, AV113TFPrdRec, AV114TFPrdRec_Sel, AV137Pgmname, AV49OrderedBy, AV50OrderedDsc, AV7EntNAlbar, AV8EntFecEnt, AV33PrvNum, AV112PrvNom, A3342CCStkLin, A3348CCStkFec, AV97ccstkulin, AV109Moda21, AV19LOtes, Gx_date, AV11Carvitin, AV17FlagFecCCS, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV121Wcwinalmpqds_1_tfprdnum = AV63TFPrdNum ;
      AV122Wcwinalmpqds_2_tfprdnum_sel = AV64TFPrdNum_Sel ;
      AV123Wcwinalmpqds_3_tfprdnom = AV66TFPrdNom ;
      AV124Wcwinalmpqds_4_tfprdnom_sel = AV67TFPrdNom_Sel ;
      AV125Wcwinalmpqds_5_tfpeduni = AV69TFPedUni ;
      AV126Wcwinalmpqds_6_tfpeduni_to = AV70TFPedUni_To ;
      AV127Wcwinalmpqds_7_tfpedcanent = AV72TFPedCanEnt ;
      AV128Wcwinalmpqds_8_tfpedcanent_to = AV73TFPedCanEnt_To ;
      AV129Wcwinalmpqds_9_tfprdrec = AV113TFPrdRec ;
      AV130Wcwinalmpqds_10_tfprdrec_sel = AV114TFPrdRec_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Pedcod, AV63TFPrdNum, AV64TFPrdNum_Sel, AV66TFPrdNom, AV67TFPrdNom_Sel, AV69TFPedUni, AV70TFPedUni_To, AV72TFPedCanEnt, AV73TFPedCanEnt_To, AV113TFPrdRec, AV114TFPrdRec_Sel, AV137Pgmname, AV49OrderedBy, AV50OrderedDsc, AV7EntNAlbar, AV8EntFecEnt, AV33PrvNum, AV112PrvNom, A3342CCStkLin, A3348CCStkFec, AV97ccstkulin, AV109Moda21, AV19LOtes, Gx_date, AV11Carvitin, AV17FlagFecCCS, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV121Wcwinalmpqds_1_tfprdnum = AV63TFPrdNum ;
      AV122Wcwinalmpqds_2_tfprdnum_sel = AV64TFPrdNum_Sel ;
      AV123Wcwinalmpqds_3_tfprdnom = AV66TFPrdNom ;
      AV124Wcwinalmpqds_4_tfprdnom_sel = AV67TFPrdNom_Sel ;
      AV125Wcwinalmpqds_5_tfpeduni = AV69TFPedUni ;
      AV126Wcwinalmpqds_6_tfpeduni_to = AV70TFPedUni_To ;
      AV127Wcwinalmpqds_7_tfpedcanent = AV72TFPedCanEnt ;
      AV128Wcwinalmpqds_8_tfpedcanent_to = AV73TFPedCanEnt_To ;
      AV129Wcwinalmpqds_9_tfprdrec = AV113TFPrdRec ;
      AV130Wcwinalmpqds_10_tfprdrec_sel = AV114TFPrdRec_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Pedcod, AV63TFPrdNum, AV64TFPrdNum_Sel, AV66TFPrdNom, AV67TFPrdNom_Sel, AV69TFPedUni, AV70TFPedUni_To, AV72TFPedCanEnt, AV73TFPedCanEnt_To, AV113TFPrdRec, AV114TFPrdRec_Sel, AV137Pgmname, AV49OrderedBy, AV50OrderedDsc, AV7EntNAlbar, AV8EntFecEnt, AV33PrvNum, AV112PrvNom, A3342CCStkLin, A3348CCStkFec, AV97ccstkulin, AV109Moda21, AV19LOtes, Gx_date, AV11Carvitin, AV17FlagFecCCS, sPrefix) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV137Pgmname = "WCWINAlmPq" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavPrvnum_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnum_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnum_Enabled), 5, 0), true);
      edtavPrvnom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavPrvnom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrvnom_Enabled), 5, 0), true);
      chkavSeleccionar.setEnabled( 0 );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "Enabled", GXutil.ltrimstr( chkavSeleccionar.getEnabled(), 5, 0), !bGXsfl_31_Refreshing);
      edtavValorlinea_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavValorlinea_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavValorlinea_Enabled), 5, 0), !bGXsfl_31_Refreshing);
      edtavUltfecccs_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavUltfecccs_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavUltfecccs_Enabled), 5, 0), !bGXsfl_31_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupWP0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e15WP2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      nDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      sXEvt = httpContext.cgiGet( "_EventName") ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( sPrefix+"vDDO_TITLESETTINGSICONS"), AV75DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_31 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_31"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
         wcpOAV6Pedcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Pedcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV7EntNAlbar = httpContext.cgiGet( sPrefix+"wcpOAV7EntNAlbar") ;
         wcpOAV8EntFecEnt = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8EntFecEnt"), 0) ;
         wcpOAV33PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         wcpOAV112PrvNom = httpContext.cgiGet( sPrefix+"wcpOAV112PrvNom") ;
         Gx_msg = httpContext.cgiGet( sPrefix+"vMSG") ;
         AV17FlagFecCCS = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vFLAGFECCCS"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV8EntFecEnt = localUtil.ctod( httpContext.cgiGet( sPrefix+"vENTFECENT"), 0) ;
         AV102Hayvalores = (byte)(localUtil.ctol( httpContext.cgiGet( sPrefix+"vHAYVALORES"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Grid_titlescategories_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridinternalname") ;
         Grid_titlescategories_Gridtitlescategories = httpContext.cgiGet( sPrefix+"GRID_TITLESCATEGORIES_Gridtitlescategories") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hascategories = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hascategories")) ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( sPrefix+"GRID_EMPOWERER_Hastitlesettings")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( sPrefix+"DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( sPrefix+"DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( sPrefix+"DDO_GRID_Filteredtextto_get") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         /* Read subfile selected row values. */
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
      e15WP2 ();
      if (returnInSub) return;
   }

   public void e15WP2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_int1 = AV19LOtes ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "00LOTE", ""), GXv_int2) ;
      wcwinalmpq_impl.this.GXt_int1 = GXv_int2[0] ;
      AV19LOtes = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV19LOtes", GXutil.str( AV19LOtes, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vLOTES", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV19LOtes), "9")));
      GXt_int1 = (byte)(AV109Moda21) ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "MODA21", ""), GXv_int2) ;
      wcwinalmpq_impl.this.GXt_int1 = GXv_int2[0] ;
      AV109Moda21 = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV109Moda21", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV109Moda21), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vMODA21", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV109Moda21), "ZZZ9")));
      GXt_int1 = AV17FlagFecCCS ;
      GXv_int2[0] = GXt_int1 ;
      new app.pexicon(remoteHandle, context).execute( AV5Emprcod, httpContext.getMessage( "FECCCS", ""), GXv_int2) ;
      wcwinalmpq_impl.this.GXt_int1 = GXv_int2[0] ;
      AV17FlagFecCCS = GXt_int1 ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV17FlagFecCCS", GXutil.str( AV17FlagFecCCS, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vFLAGFECCCS", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV17FlagFecCCS), "9")));
      GXt_char3 = AV118Station ;
      GXv_char4[0] = GXt_char3 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      wcwinalmpq_impl.this.GXt_char3 = GXv_char4[0] ;
      AV118Station = GXt_char3 ;
      GXv_char4[0] = AV5Emprcod ;
      GXv_char5[0] = AV119Emprnom ;
      GXv_char6[0] = AV120Usurcod ;
      new app.pbusemp(remoteHandle, context).execute( AV118Station, GXv_char4, GXv_char5, GXv_char6) ;
      wcwinalmpq_impl.this.AV5Emprcod = GXv_char4[0] ;
      wcwinalmpq_impl.this.AV119Emprnom = GXv_char5[0] ;
      wcwinalmpq_impl.this.AV120Usurcod = GXv_char6[0] ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      /* Execute user subroutine: 'ATTRIBUTESSECURITYCODE' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, sPrefix, false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Grid_titlescategories_Gridinternalname = subGrid_Internalname ;
      ucGrid_titlescategories.sendProperty(context, sPrefix, false, Grid_titlescategories_Internalname, "GridInternalName", Grid_titlescategories_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV49OrderedBy < 1 )
      {
         AV49OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = AV75DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[0] ;
      AV75DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7;
   }

   public void e16WP2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext9[0] = AV43WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext9) ;
      AV43WWPContext = GXv_SdtWWPContext9[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV121Wcwinalmpqds_1_tfprdnum = AV63TFPrdNum ;
      AV122Wcwinalmpqds_2_tfprdnum_sel = AV64TFPrdNum_Sel ;
      AV123Wcwinalmpqds_3_tfprdnom = AV66TFPrdNom ;
      AV124Wcwinalmpqds_4_tfprdnom_sel = AV67TFPrdNom_Sel ;
      AV125Wcwinalmpqds_5_tfpeduni = AV69TFPedUni ;
      AV126Wcwinalmpqds_6_tfpeduni_to = AV70TFPedUni_To ;
      AV127Wcwinalmpqds_7_tfpedcanent = AV72TFPedCanEnt ;
      AV128Wcwinalmpqds_8_tfpedcanent_to = AV73TFPedCanEnt_To ;
      AV129Wcwinalmpqds_9_tfprdrec = AV113TFPrdRec ;
      AV130Wcwinalmpqds_10_tfprdrec_sel = AV114TFPrdRec_Sel ;
   }

   public void e12WP2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV49OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49OrderedBy), 4, 0));
         AV50OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50OrderedDsc", AV50OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV63TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrdNum", AV63TFPrdNum);
            AV64TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFPrdNum_Sel", AV64TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV66TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPrdNom", AV66TFPrdNom);
            AV67TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFPrdNom_Sel", AV67TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedUni") == 0 )
         {
            AV69TFPedUni = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFPedUni", GXutil.ltrimstr( AV69TFPedUni, 9, 2));
            AV70TFPedUni_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFPedUni_To", GXutil.ltrimstr( AV70TFPedUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PedCanEnt") == 0 )
         {
            AV72TFPedCanEnt = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFPedCanEnt", GXutil.ltrimstr( AV72TFPedCanEnt, 9, 2));
            AV73TFPedCanEnt_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFPedCanEnt_To", GXutil.ltrimstr( AV73TFPedCanEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdRec") == 0 )
         {
            AV113TFPrdRec = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFPrdRec", AV113TFPrdRec);
            AV114TFPrdRec_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFPrdRec_Sel", AV114TFPrdRec_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e17WP2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      AV103Seleccionar = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, chkavSeleccionar.getInternalname(), AV103Seleccionar);
      edtavEntnemb_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavEntnemb_Forecolor = GXutil.getColor( 0, 0, 0) ;
      edtavPedcanent_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavPedcanent_Forecolor = GXutil.getColor( 0, 0, 0) ;
      AV98PedCum = "N" ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavPedcum.getInternalname(), AV98PedCum);
      cmbavPedcum.setIBackground( GXutil.getColor( 0, 255, 0) );
      cmbavPedcum.setIForeground( GXutil.getColor( 0, 0, 0) );
      AV30PedPre = A665PedPre ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPedpre_Internalname, GXutil.ltrimstr( AV30PedPre, 14, 5));
      edtavPedpre_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavPedpre_Forecolor = GXutil.getColor( 0, 0, 0) ;
      AV115ValorLinea = GXutil.roundDecimal( (A669PedUni.subtract(A657PedCanEnt)).multiply(A665PedPre), 2) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavValorlinea_Internalname, GXutil.ltrimstr( AV115ValorLinea, 12, 2));
      edtavNetiquetas_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavNetiquetas_Forecolor = GXutil.getColor( 0, 0, 0) ;
      edtavEntlotn_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavEntlotn_Forecolor = GXutil.getColor( 0, 0, 0) ;
      edtavEntfval_Backcolor = GXutil.getColor( 0, 255, 0) ;
      edtavEntfval_Forecolor = GXutil.getColor( 0, 0, 0) ;
      AV97ccstkulin = A3341CCStKULin ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV97ccstkulin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV97ccstkulin), 12, 0));
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vCCSTKULIN", getSecureSignedToken( sPrefix, localUtil.format( DecimalUtil.doubleToDec(AV97ccstkulin), "ZZZZZZZZZZZ9")));
      /* Using cursor H00WP4 */
      pr_default.execute(2, new Object[] {A396EmprCod, A719PrdNum, Long.valueOf(AV97ccstkulin)});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A3342CCStkLin = H00WP4_A3342CCStkLin[0] ;
         A3348CCStkFec = H00WP4_A3348CCStkFec[0] ;
         AV96UltFecCCs = A3348CCStkFec ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavUltfecccs_Internalname, localUtil.format(AV96UltFecCCs, "99/99/99"));
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"gxhash_vULTFECCCS"+"_"+sGXsfl_31_idx, getSecureSignedToken( sPrefix+sGXsfl_31_idx, AV96UltFecCCs));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(2);
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(31) ;
      }
      sendrow_312( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_31_Refreshing )
      {
         httpContext.doAjaxLoad(31, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavPedcum.setValue( GXutil.rtrim( AV98PedCum) );
   }

   public void e13WP2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         AV101Control = (byte)(0) ;
         Gx_msg = "" ;
         /* Start For Each Line */
         nRC_GXsfl_31 = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"nRC_GXsfl_31"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_31_fel_idx = 0 ;
         while ( nGXsfl_31_fel_idx < nRC_GXsfl_31 )
         {
            nGXsfl_31_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_31_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_31_fel_idx+1) ;
            sGXsfl_31_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_31_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_312( ) ;
            AV103Seleccionar = ((GXutil.strcmp(httpContext.cgiGet( chkavSeleccionar.getInternalname()), "S")==0) ? "S" : "N") ;
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            A669PedUni = localUtil.ctond( httpContext.cgiGet( edtPedUni_Internalname)) ;
            A657PedCanEnt = localUtil.ctond( httpContext.cgiGet( edtPedCanEnt_Internalname)) ;
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavEntnemb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavEntnemb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vENTNEMB");
               GX_FocusControl = edtavEntnemb_Internalname ;
               wbErr = true ;
               AV111EntNEmb = (byte)(0) ;
            }
            else
            {
               AV111EntNEmb = (byte)(localUtil.ctol( httpContext.cgiGet( edtavEntnemb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPedcanent_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPedcanent_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPEDCANENT");
               GX_FocusControl = edtavPedcanent_Internalname ;
               wbErr = true ;
               AV28PedCanEnt = DecimalUtil.ZERO ;
            }
            else
            {
               AV28PedCanEnt = localUtil.ctond( httpContext.cgiGet( edtavPedcanent_Internalname)) ;
            }
            cmbavPedcum.setName( cmbavPedcum.getInternalname() );
            cmbavPedcum.setValue( httpContext.cgiGet( cmbavPedcum.getInternalname()) );
            AV98PedCum = httpContext.cgiGet( cmbavPedcum.getInternalname()) ;
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavPedpre_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavPedpre_Internalname)), DecimalUtil.stringToDec("99999999.99999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPEDPRE");
               GX_FocusControl = edtavPedpre_Internalname ;
               wbErr = true ;
               AV30PedPre = DecimalUtil.ZERO ;
            }
            else
            {
               AV30PedPre = localUtil.ctond( httpContext.cgiGet( edtavPedpre_Internalname)) ;
            }
            if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavValorlinea_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavValorlinea_Internalname)), DecimalUtil.stringToDec("999999999.99")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vVALORLINEA");
               GX_FocusControl = edtavValorlinea_Internalname ;
               wbErr = true ;
               AV115ValorLinea = DecimalUtil.ZERO ;
            }
            else
            {
               AV115ValorLinea = localUtil.ctond( httpContext.cgiGet( edtavValorlinea_Internalname)) ;
            }
            if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavNetiquetas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavNetiquetas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vNETIQUETAS");
               GX_FocusControl = edtavNetiquetas_Internalname ;
               wbErr = true ;
               AV25NEtiquetas = (short)(0) ;
            }
            else
            {
               AV25NEtiquetas = (short)(localUtil.ctol( httpContext.cgiGet( edtavNetiquetas_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            }
            AV13EntLotN = httpContext.cgiGet( edtavEntlotn_Internalname) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavEntfval_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vENTFVAL");
               GX_FocusControl = edtavEntfval_Internalname ;
               wbErr = true ;
               AV12EntFVal = GXutil.nullDate() ;
            }
            else
            {
               AV12EntFVal = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavEntfval_Internalname), 0)) ;
            }
            A721PrdNumUco = localUtil.ctond( httpContext.cgiGet( edtPrdNumUco_Internalname)) ;
            A727PrdRec = httpContext.cgiGet( edtPrdRec_Internalname) ;
            A659PedCum = GXutil.upper( httpContext.cgiGet( edtPedCum_Internalname)) ;
            if ( localUtil.vcdtime( httpContext.cgiGet( edtavUltfecccs_Internalname), (byte)(0), (byte)(0)) == 0 )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vULTFECCCS");
               GX_FocusControl = edtavUltfecccs_Internalname ;
               wbErr = true ;
               AV96UltFecCCs = GXutil.nullDate() ;
            }
            else
            {
               AV96UltFecCCs = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( edtavUltfecccs_Internalname), 0)) ;
            }
            A665PedPre = localUtil.ctond( httpContext.cgiGet( edtPedPre_Internalname)) ;
            if ( GXutil.strcmp(AV103Seleccionar, "S") == 0 )
            {
               if ( ( AV28PedCanEnt.doubleValue() > 0 ) && ( AV30PedPre.doubleValue() > 0 ) )
               {
                  AV104AplicarAlbaran = GXutil.substring( AV7EntNAlbar, 1, 10) ;
                  if ( ( AV109Moda21 == 1 ) && ( AV19LOtes == 1 ) )
                  {
                     AV110EntLotNGRID = AV13EntLotN ;
                     httpContext.popup(formatLink("app.entradaloteproducto", new String[] {GXutil.URLEncode(GXutil.rtrim("INS")),GXutil.URLEncode(GXutil.rtrim(AV5Emprcod)),GXutil.URLEncode(GXutil.rtrim(A719PrdNum)),GXutil.URLEncode(GXutil.rtrim(A718PrdNom)),GXutil.URLEncode(GXutil.ltrimstr(AV6Pedcod,8,0)),GXutil.URLEncode(GXutil.formatDateParm(Gx_date)),GXutil.URLEncode(GXutil.ltrimstr(AV111EntNEmb,2,0)),GXutil.URLEncode(GXutil.rtrim(AV13EntLotN))}, new String[] {"Mode","EmprCod","PrdNum","PrdNom","LotePed","LoteFec","LoteNEmb","LoteID"}) , new Object[] {});
                     GXv_char6[0] = AV5Emprcod ;
                     GXv_char5[0] = A719PrdNum ;
                     GXv_date10[0] = AV8EntFecEnt ;
                     GXv_int11[0] = AV6Pedcod ;
                     GXv_char4[0] = AV13EntLotN ;
                     new app.pnlotprd(remoteHandle, context).execute( GXv_char6, GXv_char5, GXv_date10, GXv_int11, GXv_char4) ;
                     wcwinalmpq_impl.this.AV5Emprcod = GXv_char6[0] ;
                     wcwinalmpq_impl.this.A719PrdNum = GXv_char5[0] ;
                     wcwinalmpq_impl.this.AV8EntFecEnt = GXv_date10[0] ;
                     wcwinalmpq_impl.this.AV6Pedcod = GXv_int11[0] ;
                     wcwinalmpq_impl.this.AV13EntLotN = GXv_char4[0] ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8EntFecEnt", localUtil.format(AV8EntFecEnt, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Pedcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Pedcod), 8, 0));
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntlotn_Internalname, AV13EntLotN);
                     AV13EntLotN = ((GXutil.strcmp("", AV13EntLotN)==0) ? AV110EntLotNGRID : AV13EntLotN) ;
                     httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntlotn_Internalname, AV13EntLotN);
                  }
                  GXv_char6[0] = AV5Emprcod ;
                  GXv_int11[0] = AV6Pedcod ;
                  GXv_char5[0] = A719PrdNum ;
                  GXv_decimal12[0] = AV28PedCanEnt ;
                  GXv_decimal13[0] = AV30PedPre ;
                  GXv_char4[0] = AV104AplicarAlbaran ;
                  GXv_date10[0] = AV12EntFVal ;
                  GXv_char14[0] = AV13EntLotN ;
                  GXv_char15[0] = AV76productosEtiquetas ;
                  GXv_int16[0] = AV18i ;
                  GXv_date17[0] = AV8EntFecEnt ;
                  GXv_int18[0] = AV33PrvNum ;
                  GXv_char19[0] = AV7EntNAlbar ;
                  GXv_int20[0] = AV25NEtiquetas ;
                  GXv_char21[0] = "" ;
                  GXv_char22[0] = AV98PedCum ;
                  GXv_int2[0] = AV111EntNEmb ;
                  new app.palmpedn(remoteHandle, context).execute( GXv_char6, GXv_int11, GXv_char5, GXv_decimal12, GXv_decimal13, GXv_char4, GXv_date10, GXv_char14, GXv_char15, GXv_int16, GXv_date17, GXv_int18, GXv_char19, GXv_int20, GXv_char21, GXv_char22, GXv_int2) ;
                  wcwinalmpq_impl.this.AV5Emprcod = GXv_char6[0] ;
                  wcwinalmpq_impl.this.AV6Pedcod = GXv_int11[0] ;
                  wcwinalmpq_impl.this.A719PrdNum = GXv_char5[0] ;
                  wcwinalmpq_impl.this.AV28PedCanEnt = GXv_decimal12[0] ;
                  wcwinalmpq_impl.this.AV30PedPre = GXv_decimal13[0] ;
                  wcwinalmpq_impl.this.AV104AplicarAlbaran = GXv_char4[0] ;
                  wcwinalmpq_impl.this.AV12EntFVal = GXv_date10[0] ;
                  wcwinalmpq_impl.this.AV13EntLotN = GXv_char14[0] ;
                  wcwinalmpq_impl.this.AV76productosEtiquetas = GXv_char15[0] ;
                  wcwinalmpq_impl.this.AV18i = GXv_int16[0] ;
                  wcwinalmpq_impl.this.AV8EntFecEnt = GXv_date17[0] ;
                  wcwinalmpq_impl.this.AV33PrvNum = GXv_int18[0] ;
                  wcwinalmpq_impl.this.AV7EntNAlbar = GXv_char19[0] ;
                  wcwinalmpq_impl.this.AV25NEtiquetas = GXv_int20[0] ;
                  wcwinalmpq_impl.this.AV98PedCum = GXv_char22[0] ;
                  wcwinalmpq_impl.this.AV111EntNEmb = GXv_int2[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Pedcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Pedcod), 8, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPedcanent_Internalname, GXutil.ltrimstr( AV28PedCanEnt, 9, 2));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavPedpre_Internalname, GXutil.ltrimstr( AV30PedPre, 14, 5));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntfval_Internalname, localUtil.format(AV12EntFVal, "99/99/99"));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntlotn_Internalname, AV13EntLotN);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV76productosEtiquetas", AV76productosEtiquetas);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV18i", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV18i), 4, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8EntFecEnt", localUtil.format(AV8EntFecEnt, "99/99/99"));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33PrvNum), 6, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EntNAlbar", AV7EntNAlbar);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavNetiquetas_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25NEtiquetas), 4, 0));
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavPedcum.getInternalname(), AV98PedCum);
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, edtavEntnemb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV111EntNEmb), 2, 0));
               }
            }
            /* End For Each Line */
         }
         if ( nGXsfl_31_fel_idx == 0 )
         {
            nGXsfl_31_idx = 1 ;
            sGXsfl_31_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_31_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_312( ) ;
         }
         nGXsfl_31_fel_idx = 1 ;
         GXv_char22[0] = AV5Emprcod ;
         GXv_int18[0] = AV6Pedcod ;
         new app.cerrarcompra(remoteHandle, context).execute( GXv_char22, GXv_int18) ;
         wcwinalmpq_impl.this.AV5Emprcod = GXv_char22[0] ;
         wcwinalmpq_impl.this.AV6Pedcod = GXv_int18[0] ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Pedcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Pedcod), 8, 0));
         if ( AV11Carvitin == 1 )
         {
            AV99SDTProductosEtiquetasCollection.fromJSonString(AV76productosEtiquetas, null);
            AV136GXV1 = 1 ;
            while ( AV136GXV1 <= AV99SDTProductosEtiquetasCollection.size() )
            {
               AV100SDTProductosEtiquetas = (app.SdtSDTProductosEtiquetas)((app.SdtSDTProductosEtiquetas)AV99SDTProductosEtiquetasCollection.elementAt(-1+AV136GXV1));
               AV31Prdnum = AV100SDTProductosEtiquetas.getgxTv_SdtSDTProductosEtiquetas_Producto() ;
               AV10Almc_ln = AV100SDTProductosEtiquetas.getgxTv_SdtSDTProductosEtiquetas_Linent() ;
               AV24Neti = AV100SDTProductosEtiquetas.getgxTv_SdtSDTProductosEtiquetas_Netiquetas() ;
               AV24Neti = (short)(((AV24Neti==0) ? 1 : AV24Neti)) ;
               AV27p = (short)(1) ;
               while ( AV27p <= AV24Neti )
               {
                  GXv_char22[0] = AV5Emprcod ;
                  GXv_char21[0] = AV31Prdnum ;
                  GXv_int20[0] = (short)(AV10Almc_ln) ;
                  GXv_char19[0] = " " ;
                  GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_int2[0] = (byte)(0) ;
                  new app.petcarvitinprinter(remoteHandle, context).execute( GXv_char22, GXv_char21, GXv_int20, GXv_char19, GXv_decimal13, GXv_int2) ;
                  wcwinalmpq_impl.this.AV5Emprcod = GXv_char22[0] ;
                  wcwinalmpq_impl.this.AV31Prdnum = GXv_char21[0] ;
                  wcwinalmpq_impl.this.AV10Almc_ln = GXv_int20[0] ;
                  httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
                  AV27p = (short)(AV27p+1) ;
               }
               AV136GXV1 = (int)(AV136GXV1+1) ;
            }
         }
         GRID_nFirstRecordOnPage = 0 ;
         GRID_nCurrentRecord = 0 ;
         GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_31_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         gxgrgrid_refresh( subGrid_Rows, AV5Emprcod, AV6Pedcod, AV63TFPrdNum, AV64TFPrdNum_Sel, AV66TFPrdNom, AV67TFPrdNom_Sel, AV69TFPedUni, AV70TFPedUni_To, AV72TFPedCanEnt, AV73TFPedCanEnt_To, AV113TFPrdRec, AV114TFPrdRec_Sel, AV137Pgmname, AV49OrderedBy, AV50OrderedDsc, AV7EntNAlbar, AV8EntFecEnt, AV33PrvNum, AV112PrvNom, A3342CCStkLin, A3348CCStkFec, AV97ccstkulin, AV109Moda21, AV19LOtes, Gx_date, AV11Carvitin, AV17FlagFecCCS, sPrefix) ;
      }
      /*  Sending Event outputs  */
      cmbavPedcum.setValue( GXutil.rtrim( AV98PedCum) );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavPedcum.getInternalname(), "Values", cmbavPedcum.ToJavascriptSource(), true);
   }

   public void e14WP2( )
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
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV49OrderedBy, 4, 0))+":"+(AV50OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV58Session.getValue(AV137Pgmname+"GridState"), "") == 0 )
      {
         AV47GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV137Pgmname+"GridState"), null, null);
      }
      else
      {
         AV47GridState.fromxml(AV58Session.getValue(AV137Pgmname+"GridState"), null, null);
      }
      AV49OrderedBy = AV47GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV49OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49OrderedBy), 4, 0));
      AV50OrderedDsc = AV47GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV50OrderedDsc", AV50OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV138GXV2 = 1 ;
      while ( AV138GXV2 <= AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV138GXV2));
         if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV63TFPrdNum = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV63TFPrdNum", AV63TFPrdNum);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV64TFPrdNum_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV64TFPrdNum_Sel", AV64TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV66TFPrdNom = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV66TFPrdNom", AV66TFPrdNom);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV67TFPrdNom_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV67TFPrdNom_Sel", AV67TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDUNI") == 0 )
         {
            AV69TFPedUni = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV69TFPedUni", GXutil.ltrimstr( AV69TFPedUni, 9, 2));
            AV70TFPedUni_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV70TFPedUni_To", GXutil.ltrimstr( AV70TFPedUni_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPEDCANENT") == 0 )
         {
            AV72TFPedCanEnt = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV72TFPedCanEnt", GXutil.ltrimstr( AV72TFPedCanEnt, 9, 2));
            AV73TFPedCanEnt_To = CommonUtil.decimalVal( AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV73TFPedCanEnt_To", GXutil.ltrimstr( AV73TFPedCanEnt_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC") == 0 )
         {
            AV113TFPrdRec = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV113TFPrdRec", AV113TFPrdRec);
         }
         else if ( GXutil.strcmp(AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDREC_SEL") == 0 )
         {
            AV114TFPrdRec_Sel = AV48GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV114TFPrdRec_Sel", AV114TFPrdRec_Sel);
         }
         AV138GXV2 = (int)(AV138GXV2+1) ;
      }
      GXt_char3 = "" ;
      GXv_char22[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV64TFPrdNum_Sel)==0), AV64TFPrdNum_Sel, GXv_char22) ;
      wcwinalmpq_impl.this.GXt_char3 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char21[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV67TFPrdNom_Sel)==0), AV67TFPrdNom_Sel, GXv_char21) ;
      wcwinalmpq_impl.this.GXt_char23 = GXv_char21[0] ;
      GXt_char24 = "" ;
      GXv_char19[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV114TFPrdRec_Sel)==0), AV114TFPrdRec_Sel, GXv_char19) ;
      wcwinalmpq_impl.this.GXt_char24 = GXv_char19[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char3+"|"+GXt_char23+"|||"+GXt_char24 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char24 = "" ;
      GXv_char22[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV63TFPrdNum)==0), AV63TFPrdNum, GXv_char22) ;
      wcwinalmpq_impl.this.GXt_char24 = GXv_char22[0] ;
      GXt_char23 = "" ;
      GXv_char21[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV66TFPrdNom)==0), AV66TFPrdNom, GXv_char21) ;
      wcwinalmpq_impl.this.GXt_char23 = GXv_char21[0] ;
      GXt_char3 = "" ;
      GXv_char19[0] = GXt_char3 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV113TFPrdRec)==0), AV113TFPrdRec, GXv_char19) ;
      wcwinalmpq_impl.this.GXt_char3 = GXv_char19[0] ;
      Ddo_grid_Filteredtext_set = GXt_char24+"|"+GXt_char23+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFPedUni)==0) ? "" : GXutil.str( AV69TFPedUni, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFPedCanEnt)==0) ? "" : GXutil.str( AV72TFPedCanEnt, 9, 2))+"|"+GXt_char3 ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFPedUni_To)==0) ? "" : GXutil.str( AV70TFPedUni_To, 9, 2))+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFPedCanEnt_To)==0) ? "" : GXutil.str( AV73TFPedCanEnt_To, 9, 2))+"|" ;
      ucDdo_grid.sendProperty(context, sPrefix, false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV47GridState.fromxml(AV58Session.getValue(AV137Pgmname+"GridState"), null, null);
      AV47GridState.setgxTv_SdtWWPGridState_Orderedby( AV49OrderedBy );
      AV47GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV50OrderedDsc );
      AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState25[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFPRDNUM", "", !(GXutil.strcmp("", AV63TFPrdNum)==0), (short)(0), AV63TFPrdNum, "", !(GXutil.strcmp("", AV64TFPrdNum_Sel)==0), AV64TFPrdNum_Sel, "") ;
      AV47GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFPRDNOM", "", !(GXutil.strcmp("", AV66TFPrdNom)==0), (short)(0), AV66TFPrdNom, "", !(GXutil.strcmp("", AV67TFPrdNom_Sel)==0), AV67TFPrdNom_Sel, "") ;
      AV47GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFPEDUNI", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV69TFPedUni)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV70TFPedUni_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV69TFPedUni, 9, 2)), GXutil.trim( GXutil.str( AV70TFPedUni_To, 9, 2))) ;
      AV47GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFPEDCANENT", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV72TFPedCanEnt)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV73TFPedCanEnt_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV72TFPedCanEnt, 9, 2)), GXutil.trim( GXutil.str( AV73TFPedCanEnt_To, 9, 2))) ;
      AV47GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV47GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFPRDREC", "", !(GXutil.strcmp("", AV113TFPrdRec)==0), (short)(0), AV113TFPrdRec, "", !(GXutil.strcmp("", AV114TFPrdRec_Sel)==0), AV114TFPrdRec_Sel, "") ;
      AV47GridState = GXv_SdtWWPGridState25[0] ;
      if ( ! (GXutil.strcmp("", AV5Emprcod)==0) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&EMPRCOD" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV5Emprcod );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! (0==AV6Pedcod) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PEDCOD" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV6Pedcod, 8, 0) );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV7EntNAlbar)==0) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ENTNALBAR" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV7EntNAlbar );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! GXutil.dateCompare(GXutil.resetTime(GXutil.nullDate()), GXutil.resetTime(AV8EntFecEnt)) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&ENTFECENT" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( localUtil.dtoc( AV8EntFecEnt, localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")), "/") );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! (0==AV33PrvNum) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNUM" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( GXutil.str( AV33PrvNum, 6, 0) );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      if ( ! (GXutil.strcmp("", AV112PrvNom)==0) )
      {
         AV48GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Name( "PARM_&PRVNOM" );
         AV48GridStateFilterValue.setgxTv_SdtWWPGridState_FilterValue_Value( AV112PrvNom );
         AV47GridState.getgxTv_SdtWWPGridState_Filtervalues().add(AV48GridStateFilterValue, 0);
      }
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV137Pgmname+"GridState", AV47GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV45TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV45TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV137Pgmname );
      AV45TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV45TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV44HTTPRequest.getScriptName()+"?"+AV44HTTPRequest.getQuerystring() );
      AV45TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "ComprasQuimicos.TPEDIDO" );
      AV58Session.setValue("TrnContext", AV45TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'ATTRIBUTESSECURITYCODE' Routine */
      returnInSub = false ;
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV5Emprcod, httpContext.getMessage( "MODA21", "")) == 1 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavEntnemb_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavEntnemb_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavEntnemb_Visible), 5, 0), !bGXsfl_31_Refreshing);
      }
      if ( ! ( ( new app.pexicon(remoteHandle, context).executeUdp( AV5Emprcod, httpContext.getMessage( "MODA21", "")) == 0 ) ) )
      {
         Cond_result = true ;
      }
      else
      {
         Cond_result = false ;
      }
      if ( Cond_result )
      {
         edtavNetiquetas_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop(sPrefix, false, edtavNetiquetas_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavNetiquetas_Visible), 5, 0), !bGXsfl_31_Refreshing);
      }
   }

   public void wb_table1_54_WP2( boolean wbgen )
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
         wb_table1_54_WP2e( true) ;
      }
      else
      {
         wb_table1_54_WP2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5Emprcod = (String)getParm(obj,0,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
      AV6Pedcod = ((Number) GXutil.testNumericType( getParm(obj,1,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Pedcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Pedcod), 8, 0));
      AV7EntNAlbar = (String)getParm(obj,2,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EntNAlbar", AV7EntNAlbar);
      AV8EntFecEnt = (java.util.Date)getParm(obj,3,TypeConstants.DATE) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8EntFecEnt", localUtil.format(AV8EntFecEnt, "99/99/99"));
      AV33PrvNum = ((Number) GXutil.testNumericType( getParm(obj,4,TypeConstants.INT), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33PrvNum), 6, 0));
      AV112PrvNom = (String)getParm(obj,5,TypeConstants.STRING) ;
      httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112PrvNom", AV112PrvNom);
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
      paWP2( ) ;
      wsWP2( ) ;
      weWP2( ) ;
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
      sCtrlAV6Pedcod = (String)getParm(obj,1,TypeConstants.STRING) ;
      sCtrlAV7EntNAlbar = (String)getParm(obj,2,TypeConstants.STRING) ;
      sCtrlAV8EntFecEnt = (String)getParm(obj,3,TypeConstants.STRING) ;
      sCtrlAV33PrvNum = (String)getParm(obj,4,TypeConstants.STRING) ;
      sCtrlAV112PrvNom = (String)getParm(obj,5,TypeConstants.STRING) ;
   }

   public void componentrestorestate( String sPPrefix ,
                                      String sPSFPrefix )
   {
      sPrefix = sPPrefix + sPSFPrefix ;
      paWP2( ) ;
      wcparametersget( ) ;
   }

   @SuppressWarnings("unchecked")
   public void componentprepare( Object[] obj )
   {
      wbLoad = false ;
      sCompPrefix = (String)getParm(obj,0,TypeConstants.STRING) ;
      sSFPrefix = (String)getParm(obj,1,TypeConstants.STRING) ;
      sPrefix = sCompPrefix + sSFPrefix ;
      httpContext.AddComponentObject(sPrefix, "wcwinalmpq", GetJustCreated( ));
      if ( ( nDoneStart == 0 ) && ( nDynComponent == 0 ) )
      {
         initweb( ) ;
      }
      else
      {
         init_default_properties( ) ;
         init_web_controls( ) ;
      }
      paWP2( ) ;
      if ( ! GetJustCreated( ) && ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 ) && ( httpContext.wbGlbDoneStart == 0 ) )
      {
         wcparametersget( ) ;
      }
      else
      {
         AV5Emprcod = (String)getParm(obj,2,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV5Emprcod", AV5Emprcod);
         AV6Pedcod = ((Number) GXutil.testNumericType( getParm(obj,3,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Pedcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Pedcod), 8, 0));
         AV7EntNAlbar = (String)getParm(obj,4,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EntNAlbar", AV7EntNAlbar);
         AV8EntFecEnt = (java.util.Date)getParm(obj,5,TypeConstants.DATE) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8EntFecEnt", localUtil.format(AV8EntFecEnt, "99/99/99"));
         AV33PrvNum = ((Number) GXutil.testNumericType( getParm(obj,6,TypeConstants.INT), TypeConstants.INT)).intValue() ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33PrvNum), 6, 0));
         AV112PrvNom = (String)getParm(obj,7,TypeConstants.STRING) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112PrvNom", AV112PrvNom);
      }
      wcpOAV5Emprcod = httpContext.cgiGet( sPrefix+"wcpOAV5Emprcod") ;
      wcpOAV6Pedcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV6Pedcod"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV7EntNAlbar = httpContext.cgiGet( sPrefix+"wcpOAV7EntNAlbar") ;
      wcpOAV8EntFecEnt = localUtil.ctod( httpContext.cgiGet( sPrefix+"wcpOAV8EntFecEnt"), 0) ;
      wcpOAV33PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"wcpOAV33PrvNum"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      wcpOAV112PrvNom = httpContext.cgiGet( sPrefix+"wcpOAV112PrvNom") ;
      if ( ! GetJustCreated( ) && ( ( GXutil.strcmp(AV5Emprcod, wcpOAV5Emprcod) != 0 ) || ( AV6Pedcod != wcpOAV6Pedcod ) || ( GXutil.strcmp(AV7EntNAlbar, wcpOAV7EntNAlbar) != 0 ) || !( GXutil.dateCompare(GXutil.resetTime(AV8EntFecEnt), GXutil.resetTime(wcpOAV8EntFecEnt)) ) || ( AV33PrvNum != wcpOAV33PrvNum ) || ( GXutil.strcmp(AV112PrvNom, wcpOAV112PrvNom) != 0 ) ) )
      {
         setjustcreated();
      }
      wcpOAV5Emprcod = AV5Emprcod ;
      wcpOAV6Pedcod = AV6Pedcod ;
      wcpOAV7EntNAlbar = AV7EntNAlbar ;
      wcpOAV8EntFecEnt = AV8EntFecEnt ;
      wcpOAV33PrvNum = AV33PrvNum ;
      wcpOAV112PrvNom = AV112PrvNom ;
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
      sCtrlAV6Pedcod = httpContext.cgiGet( sPrefix+"AV6Pedcod_CTRL") ;
      if ( GXutil.len( sCtrlAV6Pedcod) > 0 )
      {
         AV6Pedcod = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV6Pedcod), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV6Pedcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Pedcod), 8, 0));
      }
      else
      {
         AV6Pedcod = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV6Pedcod_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV7EntNAlbar = httpContext.cgiGet( sPrefix+"AV7EntNAlbar_CTRL") ;
      if ( GXutil.len( sCtrlAV7EntNAlbar) > 0 )
      {
         AV7EntNAlbar = httpContext.cgiGet( sCtrlAV7EntNAlbar) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV7EntNAlbar", AV7EntNAlbar);
      }
      else
      {
         AV7EntNAlbar = httpContext.cgiGet( sPrefix+"AV7EntNAlbar_PARM") ;
      }
      sCtrlAV8EntFecEnt = httpContext.cgiGet( sPrefix+"AV8EntFecEnt_CTRL") ;
      if ( GXutil.len( sCtrlAV8EntFecEnt) > 0 )
      {
         AV8EntFecEnt = GXutil.resetTime(localUtil.ctot( httpContext.cgiGet( sCtrlAV8EntFecEnt), 0)) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV8EntFecEnt", localUtil.format(AV8EntFecEnt, "99/99/99"));
      }
      else
      {
         AV8EntFecEnt = localUtil.ctod( httpContext.cgiGet( sPrefix+"AV8EntFecEnt_PARM"), 0) ;
      }
      sCtrlAV33PrvNum = httpContext.cgiGet( sPrefix+"AV33PrvNum_CTRL") ;
      if ( GXutil.len( sCtrlAV33PrvNum) > 0 )
      {
         AV33PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sCtrlAV33PrvNum), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV33PrvNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33PrvNum), 6, 0));
      }
      else
      {
         AV33PrvNum = (int)(localUtil.ctol( httpContext.cgiGet( sPrefix+"AV33PrvNum_PARM"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      }
      sCtrlAV112PrvNom = httpContext.cgiGet( sPrefix+"AV112PrvNom_CTRL") ;
      if ( GXutil.len( sCtrlAV112PrvNom) > 0 )
      {
         AV112PrvNom = httpContext.cgiGet( sCtrlAV112PrvNom) ;
         httpContext.ajax_rsp_assign_attri(sPrefix, false, "AV112PrvNom", AV112PrvNom);
      }
      else
      {
         AV112PrvNom = httpContext.cgiGet( sPrefix+"AV112PrvNom_PARM") ;
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
      paWP2( ) ;
      sEvt = sCompEvt ;
      wcparametersget( ) ;
      wsWP2( ) ;
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
      wsWP2( ) ;
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
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Pedcod_PARM", GXutil.ltrim( localUtil.ntoc( AV6Pedcod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV6Pedcod)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV6Pedcod_CTRL", GXutil.rtrim( sCtrlAV6Pedcod));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7EntNAlbar_PARM", GXutil.rtrim( AV7EntNAlbar));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV7EntNAlbar)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV7EntNAlbar_CTRL", GXutil.rtrim( sCtrlAV7EntNAlbar));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8EntFecEnt_PARM", localUtil.dtoc( AV8EntFecEnt, 0, "/"));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV8EntFecEnt)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV8EntFecEnt_CTRL", GXutil.rtrim( sCtrlAV8EntFecEnt));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33PrvNum_PARM", GXutil.ltrim( localUtil.ntoc( AV33PrvNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV33PrvNum)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV33PrvNum_CTRL", GXutil.rtrim( sCtrlAV33PrvNum));
      }
      app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV112PrvNom_PARM", GXutil.rtrim( AV112PrvNom));
      if ( GXutil.len( GXutil.rtrim( sCtrlAV112PrvNom)) > 0 )
      {
         app.GxWebStd.gx_hidden_field( httpContext, sPrefix+"AV112PrvNom_CTRL", GXutil.rtrim( sCtrlAV112PrvNom));
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
      weWP2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211695991", true, true);
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
      httpContext.AddJavascriptSource("wcwinalmpq.js", "?20268211695991", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridTitlesCategories/GridTitlesCategoriesRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_312( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_31_idx );
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_31_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_31_idx ;
      edtPedUni_Internalname = sPrefix+"PEDUNI_"+sGXsfl_31_idx ;
      edtPedCanEnt_Internalname = sPrefix+"PEDCANENT_"+sGXsfl_31_idx ;
      edtavEntnemb_Internalname = sPrefix+"vENTNEMB_"+sGXsfl_31_idx ;
      edtavPedcanent_Internalname = sPrefix+"vPEDCANENT_"+sGXsfl_31_idx ;
      cmbavPedcum.setInternalname( sPrefix+"vPEDCUM_"+sGXsfl_31_idx );
      edtavPedpre_Internalname = sPrefix+"vPEDPRE_"+sGXsfl_31_idx ;
      edtavValorlinea_Internalname = sPrefix+"vVALORLINEA_"+sGXsfl_31_idx ;
      edtavNetiquetas_Internalname = sPrefix+"vNETIQUETAS_"+sGXsfl_31_idx ;
      edtavEntlotn_Internalname = sPrefix+"vENTLOTN_"+sGXsfl_31_idx ;
      edtavEntfval_Internalname = sPrefix+"vENTFVAL_"+sGXsfl_31_idx ;
      edtPrdNumUco_Internalname = sPrefix+"PRDNUMUCO_"+sGXsfl_31_idx ;
      edtPrdRec_Internalname = sPrefix+"PRDREC_"+sGXsfl_31_idx ;
      edtPedCum_Internalname = sPrefix+"PEDCUM_"+sGXsfl_31_idx ;
      edtavUltfecccs_Internalname = sPrefix+"vULTFECCCS_"+sGXsfl_31_idx ;
      edtPedPre_Internalname = sPrefix+"PEDPRE_"+sGXsfl_31_idx ;
   }

   public void subsflControlProps_fel_312( )
   {
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR_"+sGXsfl_31_fel_idx );
      edtPrdNum_Internalname = sPrefix+"PRDNUM_"+sGXsfl_31_fel_idx ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM_"+sGXsfl_31_fel_idx ;
      edtPedUni_Internalname = sPrefix+"PEDUNI_"+sGXsfl_31_fel_idx ;
      edtPedCanEnt_Internalname = sPrefix+"PEDCANENT_"+sGXsfl_31_fel_idx ;
      edtavEntnemb_Internalname = sPrefix+"vENTNEMB_"+sGXsfl_31_fel_idx ;
      edtavPedcanent_Internalname = sPrefix+"vPEDCANENT_"+sGXsfl_31_fel_idx ;
      cmbavPedcum.setInternalname( sPrefix+"vPEDCUM_"+sGXsfl_31_fel_idx );
      edtavPedpre_Internalname = sPrefix+"vPEDPRE_"+sGXsfl_31_fel_idx ;
      edtavValorlinea_Internalname = sPrefix+"vVALORLINEA_"+sGXsfl_31_fel_idx ;
      edtavNetiquetas_Internalname = sPrefix+"vNETIQUETAS_"+sGXsfl_31_fel_idx ;
      edtavEntlotn_Internalname = sPrefix+"vENTLOTN_"+sGXsfl_31_fel_idx ;
      edtavEntfval_Internalname = sPrefix+"vENTFVAL_"+sGXsfl_31_fel_idx ;
      edtPrdNumUco_Internalname = sPrefix+"PRDNUMUCO_"+sGXsfl_31_fel_idx ;
      edtPrdRec_Internalname = sPrefix+"PRDREC_"+sGXsfl_31_fel_idx ;
      edtPedCum_Internalname = sPrefix+"PEDCUM_"+sGXsfl_31_fel_idx ;
      edtavUltfecccs_Internalname = sPrefix+"vULTFECCCS_"+sGXsfl_31_fel_idx ;
      edtPedPre_Internalname = sPrefix+"PEDPRE_"+sGXsfl_31_fel_idx ;
   }

   public void sendrow_312( )
   {
      subsflControlProps_312( ) ;
      wbWP0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_31_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_31_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_31_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+""+"\""+" style=\""+""+"\">") ;
         }
         /* Check box */
         TempTags = " " + ((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 32,'"+sPrefix+"',false,'"+sGXsfl_31_idx+"',31)\"" : " ") ;
         ClassString = "Attribute" ;
         StyleString = "" ;
         GXCCtl = "vSELECCIONAR_" + sGXsfl_31_idx ;
         chkavSeleccionar.setName( GXCCtl );
         chkavSeleccionar.setWebtags( "" );
         chkavSeleccionar.setCaption( "" );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_31_Refreshing);
         chkavSeleccionar.setCheckedValue( "N" );
         GridRow.AddColumnProperties("checkbox", 1, isAjaxCallMode( ), new Object[] {chkavSeleccionar.getInternalname(),AV103Seleccionar,"","",Integer.valueOf(-1),Integer.valueOf(chkavSeleccionar.getEnabled()),"S","",StyleString,ClassString,"WWColumn","",TempTags+" onclick="+"\"gx.fn.checkboxClick(32, this, 'S', 'N',"+"'"+sPrefix+"'"+");"+"gx.evt.onchange(this, event);\""+((chkavSeleccionar.getEnabled()!=0)&&(chkavSeleccionar.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,32);\"" : " ")});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedUni_Internalname,GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A669PedUni, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedUni_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedCanEnt_Internalname,GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A657PedCanEnt, "ZZZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedCanEnt_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavEntnemb_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavEntnemb_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEntnemb_Enabled!=0)&&(edtavEntnemb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 37,'"+sPrefix+"',false,'"+sGXsfl_31_idx+"',31)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntnemb_Internalname,GXutil.ltrim( localUtil.ntoc( AV111EntNEmb, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV111EntNEmb), "Z9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavEntnemb_Enabled!=0)&&(edtavEntnemb_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,37);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntnemb_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavEntnemb_Forecolor)+";"+((edtavEntnemb_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavEntnemb_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavEntnemb_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(2),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavPedcanent_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPedcanent_Enabled!=0)&&(edtavPedcanent_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 38,'"+sPrefix+"',false,'"+sGXsfl_31_idx+"',31)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPedcanent_Internalname,GXutil.ltrim( localUtil.ntoc( AV28PedCanEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV28PedCanEnt, "ZZZZZ9.99")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavPedcanent_Enabled!=0)&&(edtavPedcanent_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,38);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPedcanent_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavPedcanent_Forecolor)+";"+((edtavPedcanent_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavPedcanent_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( cmbavPedcum.getIBackground())+">") ;
         }
         TempTags = " " + ((cmbavPedcum.getEnabled()!=0)&&(cmbavPedcum.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 39,'"+sPrefix+"',false,'"+sGXsfl_31_idx+"',31)\"" : " ") ;
         if ( ( cmbavPedcum.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vPEDCUM_" + sGXsfl_31_idx ;
            cmbavPedcum.setName( GXCCtl );
            cmbavPedcum.setWebtags( "" );
            cmbavPedcum.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
            cmbavPedcum.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
            if ( cmbavPedcum.getItemCount() > 0 )
            {
               AV98PedCum = cmbavPedcum.getValidValue(AV98PedCum) ;
               httpContext.ajax_rsp_assign_attri(sPrefix, false, cmbavPedcum.getInternalname(), AV98PedCum);
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavPedcum,cmbavPedcum.getInternalname(),GXutil.rtrim( AV98PedCum),Integer.valueOf(1),cmbavPedcum.getJsonclick(),Integer.valueOf(0),"'"+sPrefix+"'"+",false,"+"'"+""+"'","char","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","color:"+WebUtils.getHTMLColor( cmbavPedcum.getIForeground())+";"+((cmbavPedcum.getIBackground()==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( cmbavPedcum.getIBackground())+";"),"Attribute","WWColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavPedcum.getEnabled()!=0)&&(cmbavPedcum.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,39);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavPedcum.setValue( GXutil.rtrim( AV98PedCum) );
         httpContext.ajax_rsp_assign_prop(sPrefix, false, cmbavPedcum.getInternalname(), "Values", cmbavPedcum.ToJavascriptSource(), !bGXsfl_31_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavPedpre_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPedpre_Enabled!=0)&&(edtavPedpre_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 40,'"+sPrefix+"',false,'"+sGXsfl_31_idx+"',31)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPedpre_Internalname,GXutil.ltrim( localUtil.ntoc( AV30PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV30PedPre, "ZZZZZZZ9.999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+((edtavPedpre_Enabled!=0)&&(edtavPedpre_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,40);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavPedpre_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavPedpre_Forecolor)+";"+((edtavPedpre_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavPedpre_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavValorlinea_Enabled!=0)&&(edtavValorlinea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 41,'"+sPrefix+"',false,'"+sGXsfl_31_idx+"',31)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavValorlinea_Internalname,GXutil.ltrim( localUtil.ntoc( AV115ValorLinea, (byte)(12), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavValorlinea_Enabled!=0) ? localUtil.format( AV115ValorLinea, "ZZZZZZZZ9.99") : localUtil.format( AV115ValorLinea, "ZZZZZZZZ9.99"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+((edtavValorlinea_Enabled!=0)&&(edtavValorlinea_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,41);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavValorlinea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavValorlinea_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavNetiquetas_Visible==0) ? "display:none;" : "")+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavNetiquetas_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavNetiquetas_Enabled!=0)&&(edtavNetiquetas_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 42,'"+sPrefix+"',false,'"+sGXsfl_31_idx+"',31)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavNetiquetas_Internalname,GXutil.ltrim( localUtil.ntoc( AV25NEtiquetas, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV25NEtiquetas), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavNetiquetas_Enabled!=0)&&(edtavNetiquetas_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavNetiquetas_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavNetiquetas_Forecolor)+";"+((edtavNetiquetas_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavNetiquetas_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(edtavNetiquetas_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavEntlotn_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEntlotn_Enabled!=0)&&(edtavEntlotn_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 43,'"+sPrefix+"',false,'"+sGXsfl_31_idx+"',31)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntlotn_Internalname,GXutil.rtrim( AV13EntLotN),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavEntlotn_Enabled!=0)&&(edtavEntlotn_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,43);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntlotn_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavEntlotn_Forecolor)+";"+((edtavEntlotn_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavEntlotn_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtavEntfval_Backcolor)+">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavEntfval_Enabled!=0)&&(edtavEntfval_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 44,'"+sPrefix+"',false,'"+sGXsfl_31_idx+"',31)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavEntfval_Internalname,localUtil.format(AV12EntFVal, "99/99/99"),localUtil.format( AV12EntFVal, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavEntfval_Enabled!=0)&&(edtavEntfval_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,44);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavEntfval_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtavEntfval_Forecolor)+";"+((edtavEntfval_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtavEntfval_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNumUco_Internalname,GXutil.ltrim( localUtil.ntoc( A721PrdNumUco, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A721PrdNumUco, "ZZZ9.99")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdNumUco_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(7),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRec_Internalname,GXutil.rtrim( A727PrdRec),"","","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPrdRec_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedCum_Internalname,GXutil.rtrim( A659PedCum),GXutil.rtrim( localUtil.format( A659PedCum, "@!")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedCum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavUltfecccs_Enabled!=0)&&(edtavUltfecccs_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 48,'"+sPrefix+"',false,'"+sGXsfl_31_idx+"',31)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavUltfecccs_Internalname,localUtil.format(AV96UltFecCCs, "99/99/99"),localUtil.format( AV96UltFecCCs, "99/99/99"),TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+((edtavUltfecccs_Enabled!=0)&&(edtavUltfecccs_Visible!=0) ? " onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,48);\"" : " "),"'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtavUltfecccs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(edtavUltfecccs_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPedPre_Internalname,GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A665PedPre, "ZZZZZZZ9.999")),"","'"+sPrefix+"'"+",false,"+"'"+""+"'","","","","",edtPedPre_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(14),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(31),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashesWP2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_31_idx = ((subGrid_Islastpage==1)&&(nGXsfl_31_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_31_idx+1) ;
         sGXsfl_31_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_31_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_312( ) ;
      }
      /* End function sendrow_312 */
   }

   public void startgridcontrol31( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+sPrefix+"GridContainer"+"DivS\" data-gxgridid=\"31\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Selecionar", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Pedida", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Entregada", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavEntnemb_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Emb.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cerrar?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Valor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavNetiquetas_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Etiq", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Nº Lote", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fecha Caduc", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Unidades por Contenedor", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R?", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cumplimentado", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Ult Mov C.C.", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Precio Pedido", "")) ;
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
         GridContainer.AddObjectProperty("Class", "GridNoBorder WorkWith");
         GridContainer.AddObjectProperty("Cellpadding", GXutil.ltrim( localUtil.ntoc( 1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Cellspacing", GXutil.ltrim( localUtil.ntoc( 2, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Backcolorstyle", GXutil.ltrim( localUtil.ntoc( subGrid_Backcolorstyle, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("Sortable", GXutil.ltrim( localUtil.ntoc( subGrid_Sortable, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddObjectProperty("CmpContext", sPrefix);
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV103Seleccionar));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( chkavSeleccionar.getEnabled(), (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A669PedUni, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A657PedCanEnt, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV111EntNEmb, (byte)(2), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavEntnemb_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavEntnemb_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavEntnemb_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV28PedCanEnt, (byte)(9), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavPedcanent_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavPedcanent_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV98PedCum));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( cmbavPedcum.getIBackground(), (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( cmbavPedcum.getIForeground(), (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV30PedPre, (byte)(14), (byte)(5), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavPedpre_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavPedpre_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV115ValorLinea, (byte)(12), (byte)(2), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavValorlinea_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV25NEtiquetas, (byte)(4), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavNetiquetas_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavNetiquetas_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavNetiquetas_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV13EntLotN));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavEntlotn_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavEntlotn_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV12EntFVal, "99/99/99"));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtavEntfval_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtavEntfval_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A721PrdNumUco, (byte)(7), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A727PrdRec));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A659PedCum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", localUtil.format(AV96UltFecCCs, "99/99/99"));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavUltfecccs_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A665PedPre, (byte)(14), (byte)(5), ".", "")));
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
      bttBtnconfirmar_Internalname = sPrefix+"BTNCONFIRMAR" ;
      bttBtncancelar_Internalname = sPrefix+"BTNCANCELAR" ;
      edtavPrvnum_Internalname = sPrefix+"vPRVNUM" ;
      edtavPrvnom_Internalname = sPrefix+"vPRVNOM" ;
      divTableactions_Internalname = sPrefix+"TABLEACTIONS" ;
      divTableheader_Internalname = sPrefix+"TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = sPrefix+"DVPANEL_TABLEHEADER" ;
      chkavSeleccionar.setInternalname( sPrefix+"vSELECCIONAR" );
      edtPrdNum_Internalname = sPrefix+"PRDNUM" ;
      edtPrdNom_Internalname = sPrefix+"PRDNOM" ;
      edtPedUni_Internalname = sPrefix+"PEDUNI" ;
      edtPedCanEnt_Internalname = sPrefix+"PEDCANENT" ;
      edtavEntnemb_Internalname = sPrefix+"vENTNEMB" ;
      edtavPedcanent_Internalname = sPrefix+"vPEDCANENT" ;
      cmbavPedcum.setInternalname( sPrefix+"vPEDCUM" );
      edtavPedpre_Internalname = sPrefix+"vPEDPRE" ;
      edtavValorlinea_Internalname = sPrefix+"vVALORLINEA" ;
      edtavNetiquetas_Internalname = sPrefix+"vNETIQUETAS" ;
      edtavEntlotn_Internalname = sPrefix+"vENTLOTN" ;
      edtavEntfval_Internalname = sPrefix+"vENTFVAL" ;
      edtPrdNumUco_Internalname = sPrefix+"PRDNUMUCO" ;
      edtPrdRec_Internalname = sPrefix+"PRDREC" ;
      edtPedCum_Internalname = sPrefix+"PEDCUM" ;
      edtavUltfecccs_Internalname = sPrefix+"vULTFECCCS" ;
      edtPedPre_Internalname = sPrefix+"PEDPRE" ;
      divTablemain_Internalname = sPrefix+"TABLEMAIN" ;
      Ddo_grid_Internalname = sPrefix+"DDO_GRID" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = sPrefix+"DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = sPrefix+"TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      edtPedPre_Jsonclick = "" ;
      edtavUltfecccs_Jsonclick = "" ;
      edtavUltfecccs_Visible = -1 ;
      edtavUltfecccs_Enabled = 1 ;
      edtPedCum_Jsonclick = "" ;
      edtPrdRec_Jsonclick = "" ;
      edtPrdNumUco_Jsonclick = "" ;
      edtavEntfval_Jsonclick = "" ;
      edtavEntfval_Forecolor = (int)(0x000000) ;
      edtavEntfval_Visible = -1 ;
      edtavEntfval_Enabled = 1 ;
      edtavEntfval_Backcolor = -1 ;
      edtavEntlotn_Jsonclick = "" ;
      edtavEntlotn_Forecolor = (int)(0x000000) ;
      edtavEntlotn_Visible = -1 ;
      edtavEntlotn_Enabled = 1 ;
      edtavEntlotn_Backcolor = -1 ;
      edtavNetiquetas_Jsonclick = "" ;
      edtavNetiquetas_Forecolor = (int)(0x000000) ;
      edtavNetiquetas_Enabled = 1 ;
      edtavNetiquetas_Backcolor = -1 ;
      edtavValorlinea_Jsonclick = "" ;
      edtavValorlinea_Visible = -1 ;
      edtavValorlinea_Enabled = 1 ;
      edtavPedpre_Jsonclick = "" ;
      edtavPedpre_Forecolor = (int)(0x000000) ;
      edtavPedpre_Visible = -1 ;
      edtavPedpre_Enabled = 1 ;
      edtavPedpre_Backcolor = -1 ;
      cmbavPedcum.setJsonclick( "" );
      cmbavPedcum.setVisible( -1 );
      cmbavPedcum.setEnabled( 1 );
      cmbavPedcum.setIForeground( (int)(0x000000) );
      cmbavPedcum.setIBackground( -1 );
      edtavPedcanent_Jsonclick = "" ;
      edtavPedcanent_Forecolor = (int)(0x000000) ;
      edtavPedcanent_Visible = -1 ;
      edtavPedcanent_Enabled = 1 ;
      edtavPedcanent_Backcolor = -1 ;
      edtavEntnemb_Jsonclick = "" ;
      edtavEntnemb_Forecolor = (int)(0x000000) ;
      edtavEntnemb_Enabled = 1 ;
      edtavEntnemb_Backcolor = -1 ;
      edtPedCanEnt_Jsonclick = "" ;
      edtPedUni_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      chkavSeleccionar.setCaption( "" );
      chkavSeleccionar.setVisible( -1 );
      chkavSeleccionar.setEnabled( 1 );
      subGrid_Class = "GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPrvnom_Jsonclick = "" ;
      edtavPrvnom_Enabled = 0 ;
      edtavPrvnum_Jsonclick = "" ;
      edtavPrvnum_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Grid_empowerer_Hascategories = GXutil.toBoolean( -1) ;
      Grid_titlescategories_Gridtitlescategories = ";;;Cantidad;Cantidad;;;;;;;;;;;;;" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma la recepcion del Pedido?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
      Ddo_grid_Datalistproc = "WCWINAlmPqGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "T|T|||T" ;
      Ddo_grid_Filterisrange = "||T|T|" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "1|2|3|4|5" ;
      Ddo_grid_Columnids = "1:PrdNum|2:PrdNom|3:PedUni|4:PedCanEnt|14:PrdRec" ;
      Ddo_grid_Gridinternalname = "" ;
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
      edtavNetiquetas_Visible = -1 ;
      edtavEntnemb_Visible = -1 ;
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
      GXCCtl = "vSELECCIONAR_" + sGXsfl_31_idx ;
      chkavSeleccionar.setName( GXCCtl );
      chkavSeleccionar.setWebtags( "" );
      chkavSeleccionar.setCaption( "" );
      httpContext.ajax_rsp_assign_prop(sPrefix, false, chkavSeleccionar.getInternalname(), "TitleCaption", chkavSeleccionar.getCaption(), !bGXsfl_31_Refreshing);
      chkavSeleccionar.setCheckedValue( "N" );
      GXCCtl = "vPEDCUM_" + sGXsfl_31_idx ;
      cmbavPedcum.setName( GXCCtl );
      cmbavPedcum.setWebtags( "" );
      cmbavPedcum.addItem("N", httpContext.getMessage( "N", ""), (short)(0));
      cmbavPedcum.addItem("S", httpContext.getMessage( "S", ""), (short)(0));
      if ( cmbavPedcum.getItemCount() > 0 )
      {
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavEntnemb_Visible',ctrl:'vENTNEMB',prop:'Visible'},{av:'edtavNetiquetas_Visible',ctrl:'vNETIQUETAS',prop:'Visible'},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'sPrefix'},{av:'AV63TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV64TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV66TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV67TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV69TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV70TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV72TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV73TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV113TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV114TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV49OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV50OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV7EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV8EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV33PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV112PrvNom',fld:'vPRVNOM',pic:''},{av:'AV137Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV97ccstkulin',fld:'vCCSTKULIN',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV109Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV19LOtes',fld:'vLOTES',pic:'9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV11Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV17FlagFecCCS',fld:'vFLAGFECCCS',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e12WP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV63TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV64TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV66TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV67TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV69TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV70TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV72TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV73TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV113TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV114TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV137Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV49OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV50OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV8EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV33PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV112PrvNom',fld:'vPRVNOM',pic:''},{av:'edtavEntnemb_Visible',ctrl:'vENTNEMB',prop:'Visible'},{av:'edtavNetiquetas_Visible',ctrl:'vNETIQUETAS',prop:'Visible'},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'AV97ccstkulin',fld:'vCCSTKULIN',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV109Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV19LOtes',fld:'vLOTES',pic:'9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV11Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV17FlagFecCCS',fld:'vFLAGFECCCS',pic:'9',hsh:true},{av:'sPrefix'},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV49OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV50OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV64TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV66TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV67TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV69TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV70TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV72TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV73TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV113TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV114TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e17WP2',iparms:[{av:'A665PedPre',fld:'PEDPRE',pic:'ZZZZZZZ9.999'},{av:'A669PedUni',fld:'PEDUNI',pic:'ZZZZZ9.99',hsh:true},{av:'A657PedCanEnt',fld:'PEDCANENT',pic:'ZZZZZ9.99',hsh:true},{av:'A3341CCStKULin',fld:'CCSTKULIN',pic:'ZZZZZZZZZZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'AV97ccstkulin',fld:'vCCSTKULIN',pic:'ZZZZZZZZZZZ9',hsh:true}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV103Seleccionar',fld:'vSELECCIONAR',pic:''},{av:'edtavEntnemb_Backcolor',ctrl:'vENTNEMB',prop:'Backcolor'},{av:'edtavEntnemb_Forecolor',ctrl:'vENTNEMB',prop:'Forecolor'},{av:'edtavPedcanent_Backcolor',ctrl:'vPEDCANENT',prop:'Backcolor'},{av:'edtavPedcanent_Forecolor',ctrl:'vPEDCANENT',prop:'Forecolor'},{av:'cmbavPedcum'},{av:'AV98PedCum',fld:'vPEDCUM',pic:'@!'},{av:'AV30PedPre',fld:'vPEDPRE',pic:'ZZZZZZZ9.999'},{av:'edtavPedpre_Backcolor',ctrl:'vPEDPRE',prop:'Backcolor'},{av:'edtavPedpre_Forecolor',ctrl:'vPEDPRE',prop:'Forecolor'},{av:'AV115ValorLinea',fld:'vVALORLINEA',pic:'ZZZZZZZZ9.99'},{av:'edtavNetiquetas_Backcolor',ctrl:'vNETIQUETAS',prop:'Backcolor'},{av:'edtavNetiquetas_Forecolor',ctrl:'vNETIQUETAS',prop:'Forecolor'},{av:'edtavEntlotn_Backcolor',ctrl:'vENTLOTN',prop:'Backcolor'},{av:'edtavEntlotn_Forecolor',ctrl:'vENTLOTN',prop:'Forecolor'},{av:'edtavEntfval_Backcolor',ctrl:'vENTFVAL',prop:'Backcolor'},{av:'edtavEntfval_Forecolor',ctrl:'vENTFVAL',prop:'Forecolor'},{av:'AV97ccstkulin',fld:'vCCSTKULIN',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV96UltFecCCs',fld:'vULTFECCCS',pic:'',hsh:true}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e11WP1',iparms:[{av:'AV8EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV103Seleccionar',fld:'vSELECCIONAR',grid:31,pic:''},{av:'GRID_nFirstRecordOnPage'},{av:'nRC_GXsfl_31',ctrl:'GRID',grid:31,prop:'GridRC',grid:31}]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e13WP2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV63TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV64TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV66TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV67TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV69TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV70TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV72TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV73TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV113TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV114TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV137Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV49OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV50OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV7EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV8EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV33PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV112PrvNom',fld:'vPRVNOM',pic:''},{av:'edtavEntnemb_Visible',ctrl:'vENTNEMB',prop:'Visible'},{av:'edtavNetiquetas_Visible',ctrl:'vNETIQUETAS',prop:'Visible'},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'AV97ccstkulin',fld:'vCCSTKULIN',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV109Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV19LOtes',fld:'vLOTES',pic:'9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV11Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV17FlagFecCCS',fld:'vFLAGFECCCS',pic:'9',hsh:true},{av:'sPrefix'},{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV103Seleccionar',fld:'vSELECCIONAR',grid:31,pic:''},{av:'nRC_GXsfl_31',ctrl:'GRID',grid:31,prop:'GridRC',grid:31},{av:'AV28PedCanEnt',fld:'vPEDCANENT',grid:31,pic:'ZZZZZ9.99'},{av:'AV30PedPre',fld:'vPEDPRE',grid:31,pic:'ZZZZZZZ9.999'},{av:'AV13EntLotN',fld:'vENTLOTN',grid:31,pic:''},{av:'A719PrdNum',fld:'PRDNUM',grid:31,pic:''},{av:'A718PrdNom',fld:'PRDNOM',grid:31,pic:''},{av:'AV111EntNEmb',fld:'vENTNEMB',grid:31,pic:'Z9'},{av:'AV12EntFVal',fld:'vENTFVAL',grid:31,pic:''},{av:'AV76productosEtiquetas',fld:'vPRODUCTOSETIQUETAS',pic:''},{av:'AV18i',fld:'vI',pic:'ZZZ9'},{av:'AV25NEtiquetas',fld:'vNETIQUETAS',grid:31,pic:'ZZ9'},{av:'AV98PedCum',fld:'vPEDCUM',grid:31,pic:'@!'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV13EntLotN',fld:'vENTLOTN',pic:''},{av:'AV6Pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV8EntFecEnt',fld:'vENTFECENT',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV111EntNEmb',fld:'vENTNEMB',pic:'Z9'},{av:'cmbavPedcum'},{av:'AV98PedCum',fld:'vPEDCUM',pic:'@!'},{av:'AV25NEtiquetas',fld:'vNETIQUETAS',pic:'ZZ9'},{av:'AV7EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV33PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV18i',fld:'vI',pic:'ZZZ9'},{av:'AV76productosEtiquetas',fld:'vPRODUCTOSETIQUETAS',pic:''},{av:'AV12EntFVal',fld:'vENTFVAL',pic:''},{av:'AV30PedPre',fld:'vPEDPRE',pic:'ZZZZZZZ9.999'},{av:'AV28PedCanEnt',fld:'vPEDCANENT',pic:'ZZZZZ9.99'}]}");
      setEventMetadata("'DOCANCELAR'","{handler:'e14WP2',iparms:[]");
      setEventMetadata("'DOCANCELAR'",",oparms:[]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavEntnemb_Visible',ctrl:'vENTNEMB',prop:'Visible'},{av:'edtavNetiquetas_Visible',ctrl:'vNETIQUETAS',prop:'Visible'},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'AV97ccstkulin',fld:'vCCSTKULIN',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV109Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV19LOtes',fld:'vLOTES',pic:'9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV11Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV17FlagFecCCS',fld:'vFLAGFECCCS',pic:'9',hsh:true},{av:'sPrefix'},{av:'AV63TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV64TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV66TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV67TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV69TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV70TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV72TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV73TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV113TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV114TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV137Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV49OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV50OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV7EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV8EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV33PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV112PrvNom',fld:'vPRVNOM',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavEntnemb_Visible',ctrl:'vENTNEMB',prop:'Visible'},{av:'edtavNetiquetas_Visible',ctrl:'vNETIQUETAS',prop:'Visible'},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'AV97ccstkulin',fld:'vCCSTKULIN',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV109Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV19LOtes',fld:'vLOTES',pic:'9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV11Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV17FlagFecCCS',fld:'vFLAGFECCCS',pic:'9',hsh:true},{av:'sPrefix'},{av:'AV63TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV64TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV66TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV67TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV69TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV70TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV72TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV73TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV113TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV114TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV137Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV49OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV50OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV7EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV8EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV33PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV112PrvNom',fld:'vPRVNOM',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavEntnemb_Visible',ctrl:'vENTNEMB',prop:'Visible'},{av:'edtavNetiquetas_Visible',ctrl:'vNETIQUETAS',prop:'Visible'},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'AV97ccstkulin',fld:'vCCSTKULIN',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV109Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV19LOtes',fld:'vLOTES',pic:'9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV11Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV17FlagFecCCS',fld:'vFLAGFECCCS',pic:'9',hsh:true},{av:'sPrefix'},{av:'AV63TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV64TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV66TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV67TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV69TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV70TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV72TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV73TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV113TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV114TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV137Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV49OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV50OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV7EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV8EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV33PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV112PrvNom',fld:'vPRVNOM',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'edtavEntnemb_Visible',ctrl:'vENTNEMB',prop:'Visible'},{av:'edtavNetiquetas_Visible',ctrl:'vNETIQUETAS',prop:'Visible'},{av:'A3342CCStkLin',fld:'CCSTKLIN',pic:'ZZZZZZZZZZZ9'},{av:'A3348CCStkFec',fld:'CCSTKFEC',pic:''},{av:'AV97ccstkulin',fld:'vCCSTKULIN',pic:'ZZZZZZZZZZZ9',hsh:true},{av:'AV109Moda21',fld:'vMODA21',pic:'ZZZ9',hsh:true},{av:'AV19LOtes',fld:'vLOTES',pic:'9',hsh:true},{av:'Gx_date',fld:'vTODAY',pic:'',hsh:true},{av:'AV11Carvitin',fld:'vCARVITIN',pic:'9',hsh:true},{av:'AV17FlagFecCCS',fld:'vFLAGFECCCS',pic:'9',hsh:true},{av:'sPrefix'},{av:'AV63TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV64TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV66TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV67TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV69TFPedUni',fld:'vTFPEDUNI',pic:'ZZZZZ9.99'},{av:'AV70TFPedUni_To',fld:'vTFPEDUNI_TO',pic:'ZZZZZ9.99'},{av:'AV72TFPedCanEnt',fld:'vTFPEDCANENT',pic:'ZZZZZ9.99'},{av:'AV73TFPedCanEnt_To',fld:'vTFPEDCANENT_TO',pic:'ZZZZZ9.99'},{av:'AV113TFPrdRec',fld:'vTFPRDREC',pic:''},{av:'AV114TFPrdRec_Sel',fld:'vTFPRDREC_SEL',pic:''},{av:'AV137Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV49OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV50OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV5Emprcod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6Pedcod',fld:'vPEDCOD',pic:'ZZZZZZZ9'},{av:'AV7EntNAlbar',fld:'vENTNALBAR',pic:''},{av:'AV8EntFecEnt',fld:'vENTFECENT',pic:''},{av:'AV33PrvNum',fld:'vPRVNUM',pic:'ZZZZZ9'},{av:'AV112PrvNom',fld:'vPRVNOM',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALIDV_PEDCUM","{handler:'validv_Pedcum',iparms:[]");
      setEventMetadata("VALIDV_PEDCUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Pedpre',iparms:[]");
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
      wcpOAV7EntNAlbar = "" ;
      wcpOAV8EntFecEnt = GXutil.nullDate() ;
      wcpOAV112PrvNom = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      sPrefix = "" ;
      AV5Emprcod = "" ;
      AV7EntNAlbar = "" ;
      AV8EntFecEnt = GXutil.nullDate() ;
      AV112PrvNom = "" ;
      AV63TFPrdNum = "" ;
      AV64TFPrdNum_Sel = "" ;
      AV66TFPrdNom = "" ;
      AV67TFPrdNom_Sel = "" ;
      AV69TFPedUni = DecimalUtil.ZERO ;
      AV70TFPedUni_To = DecimalUtil.ZERO ;
      AV72TFPedCanEnt = DecimalUtil.ZERO ;
      AV73TFPedCanEnt_To = DecimalUtil.ZERO ;
      AV113TFPrdRec = "" ;
      AV114TFPrdRec_Sel = "" ;
      AV137Pgmname = "" ;
      A3348CCStkFec = GXutil.nullDate() ;
      Gx_date = GXutil.nullDate() ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV75DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A396EmprCod = "" ;
      AV76productosEtiquetas = "" ;
      Gx_msg = "" ;
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
      bttBtnconfirmar_Jsonclick = "" ;
      bttBtncancelar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_titlescategories = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sXEvt = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV121Wcwinalmpqds_1_tfprdnum = "" ;
      AV122Wcwinalmpqds_2_tfprdnum_sel = "" ;
      AV123Wcwinalmpqds_3_tfprdnom = "" ;
      AV124Wcwinalmpqds_4_tfprdnom_sel = "" ;
      AV125Wcwinalmpqds_5_tfpeduni = DecimalUtil.ZERO ;
      AV126Wcwinalmpqds_6_tfpeduni_to = DecimalUtil.ZERO ;
      AV127Wcwinalmpqds_7_tfpedcanent = DecimalUtil.ZERO ;
      AV128Wcwinalmpqds_8_tfpedcanent_to = DecimalUtil.ZERO ;
      AV129Wcwinalmpqds_9_tfprdrec = "" ;
      AV130Wcwinalmpqds_10_tfprdrec_sel = "" ;
      AV103Seleccionar = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A669PedUni = DecimalUtil.ZERO ;
      A657PedCanEnt = DecimalUtil.ZERO ;
      AV28PedCanEnt = DecimalUtil.ZERO ;
      AV98PedCum = "" ;
      AV30PedPre = DecimalUtil.ZERO ;
      AV115ValorLinea = DecimalUtil.ZERO ;
      AV13EntLotN = "" ;
      AV12EntFVal = GXutil.nullDate() ;
      A721PrdNumUco = DecimalUtil.ZERO ;
      A727PrdRec = "" ;
      A659PedCum = "" ;
      AV96UltFecCCs = GXutil.nullDate() ;
      A665PedPre = DecimalUtil.ZERO ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV121Wcwinalmpqds_1_tfprdnum = "" ;
      lV123Wcwinalmpqds_3_tfprdnom = "" ;
      lV129Wcwinalmpqds_9_tfprdrec = "" ;
      A667PedSit = "" ;
      H00WP2_A719PrdNum = new String[] {""} ;
      H00WP2_A396EmprCod = new String[] {""} ;
      H00WP2_A658PedCod = new int[1] ;
      H00WP2_A667PedSit = new String[] {""} ;
      H00WP2_A3341CCStKULin = new long[1] ;
      H00WP2_n3341CCStKULin = new boolean[] {false} ;
      H00WP2_A665PedPre = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00WP2_A659PedCum = new String[] {""} ;
      H00WP2_A727PrdRec = new String[] {""} ;
      H00WP2_A721PrdNumUco = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00WP2_A657PedCanEnt = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00WP2_A669PedUni = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00WP2_A718PrdNom = new String[] {""} ;
      H00WP3_AGRID_nRecordCount = new long[1] ;
      AV118Station = "" ;
      AV119Emprnom = "" ;
      AV120Usurcod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV43WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext9 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      H00WP4_A396EmprCod = new String[] {""} ;
      H00WP4_A719PrdNum = new String[] {""} ;
      H00WP4_A3342CCStkLin = new long[1] ;
      H00WP4_A3348CCStkFec = new java.util.Date[] {GXutil.nullDate()} ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV104AplicarAlbaran = "" ;
      AV110EntLotNGRID = "" ;
      GXv_char6 = new String[1] ;
      GXv_int11 = new int[1] ;
      GXv_char5 = new String[1] ;
      GXv_decimal12 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_date10 = new java.util.Date[1] ;
      GXv_char14 = new String[1] ;
      GXv_char15 = new String[1] ;
      GXv_int16 = new short[1] ;
      GXv_date17 = new java.util.Date[1] ;
      GXv_int18 = new int[1] ;
      AV99SDTProductosEtiquetasCollection = new GXBaseCollection<app.SdtSDTProductosEtiquetas>(app.SdtSDTProductosEtiquetas.class, "SDTProductosEtiquetas", "TexplusNET", remoteHandle);
      AV100SDTProductosEtiquetas = new app.SdtSDTProductosEtiquetas(remoteHandle, context);
      AV31Prdnum = "" ;
      GXv_int20 = new short[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_int2 = new byte[1] ;
      AV58Session = httpContext.getWebSession();
      AV47GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV48GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char24 = "" ;
      GXv_char22 = new String[1] ;
      GXt_char23 = "" ;
      GXv_char21 = new String[1] ;
      GXt_char3 = "" ;
      GXv_char19 = new String[1] ;
      GXv_SdtWWPGridState25 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV45TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV44HTTPRequest = httpContext.getHttpRequest();
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      sCtrlAV5Emprcod = "" ;
      sCtrlAV6Pedcod = "" ;
      sCtrlAV7EntNAlbar = "" ;
      sCtrlAV8EntFecEnt = "" ;
      sCtrlAV33PrvNum = "" ;
      sCtrlAV112PrvNom = "" ;
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.wcwinalmpq__default(),
         new Object[] {
             new Object[] {
            H00WP2_A719PrdNum, H00WP2_A396EmprCod, H00WP2_A658PedCod, H00WP2_A667PedSit, H00WP2_A3341CCStKULin, H00WP2_n3341CCStKULin, H00WP2_A665PedPre, H00WP2_A659PedCum, H00WP2_A727PrdRec, H00WP2_A721PrdNumUco,
            H00WP2_A657PedCanEnt, H00WP2_A669PedUni, H00WP2_A718PrdNom
            }
            , new Object[] {
            H00WP3_AGRID_nRecordCount
            }
            , new Object[] {
            H00WP4_A396EmprCod, H00WP4_A719PrdNum, H00WP4_A3342CCStkLin, H00WP4_A3348CCStkFec
            }
         }
      );
      AV137Pgmname = "WCWINAlmPq" ;
      Gx_date = GXutil.today( ) ;
      /* GeneXus formulas. */
      AV137Pgmname = "WCWINAlmPq" ;
      Gx_date = GXutil.today( ) ;
      Gx_err = (short)(0) ;
      edtavPrvnum_Enabled = 0 ;
      edtavPrvnom_Enabled = 0 ;
      chkavSeleccionar.setEnabled( 0 );
      edtavValorlinea_Enabled = 0 ;
      edtavUltfecccs_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte nDynComponent ;
   private byte AV19LOtes ;
   private byte AV11Carvitin ;
   private byte AV17FlagFecCCS ;
   private byte AV102Hayvalores ;
   private byte nDraw ;
   private byte nDoneStart ;
   private byte AV111EntNEmb ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte GXt_int1 ;
   private byte AV101Control ;
   private byte GXv_int2[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV49OrderedBy ;
   private short AV109Moda21 ;
   private short AV18i ;
   private short wbEnd ;
   private short wbStart ;
   private short AV25NEtiquetas ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int16[] ;
   private short AV24Neti ;
   private short AV27p ;
   private short GXv_int20[] ;
   private int wcpOAV6Pedcod ;
   private int wcpOAV33PrvNum ;
   private int edtavEntnemb_Visible ;
   private int edtavNetiquetas_Visible ;
   private int nRC_GXsfl_31 ;
   private int AV6Pedcod ;
   private int AV33PrvNum ;
   private int subGrid_Rows ;
   private int nGXsfl_31_idx=1 ;
   private int edtavPrvnum_Enabled ;
   private int edtavPrvnom_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavValorlinea_Enabled ;
   private int edtavUltfecccs_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A658PedCod ;
   private int edtavEntnemb_Backcolor ;
   private int edtavEntnemb_Forecolor ;
   private int edtavPedcanent_Backcolor ;
   private int edtavPedcanent_Forecolor ;
   private int edtavPedpre_Backcolor ;
   private int edtavPedpre_Forecolor ;
   private int edtavNetiquetas_Backcolor ;
   private int edtavNetiquetas_Forecolor ;
   private int edtavEntlotn_Backcolor ;
   private int edtavEntlotn_Forecolor ;
   private int edtavEntfval_Backcolor ;
   private int edtavEntfval_Forecolor ;
   private int nGXsfl_31_fel_idx=1 ;
   private int GXv_int11[] ;
   private int GXv_int18[] ;
   private int AV136GXV1 ;
   private int AV10Almc_ln ;
   private int AV138GXV2 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavEntnemb_Enabled ;
   private int edtavPedcanent_Enabled ;
   private int edtavPedcanent_Visible ;
   private int edtavPedpre_Enabled ;
   private int edtavPedpre_Visible ;
   private int edtavValorlinea_Visible ;
   private int edtavNetiquetas_Enabled ;
   private int edtavEntlotn_Enabled ;
   private int edtavEntlotn_Visible ;
   private int edtavEntfval_Enabled ;
   private int edtavEntfval_Visible ;
   private int edtavUltfecccs_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long A3342CCStkLin ;
   private long AV97ccstkulin ;
   private long A3341CCStKULin ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV69TFPedUni ;
   private java.math.BigDecimal AV70TFPedUni_To ;
   private java.math.BigDecimal AV72TFPedCanEnt ;
   private java.math.BigDecimal AV73TFPedCanEnt_To ;
   private java.math.BigDecimal AV125Wcwinalmpqds_5_tfpeduni ;
   private java.math.BigDecimal AV126Wcwinalmpqds_6_tfpeduni_to ;
   private java.math.BigDecimal AV127Wcwinalmpqds_7_tfpedcanent ;
   private java.math.BigDecimal AV128Wcwinalmpqds_8_tfpedcanent_to ;
   private java.math.BigDecimal A669PedUni ;
   private java.math.BigDecimal A657PedCanEnt ;
   private java.math.BigDecimal AV28PedCanEnt ;
   private java.math.BigDecimal AV30PedPre ;
   private java.math.BigDecimal AV115ValorLinea ;
   private java.math.BigDecimal A721PrdNumUco ;
   private java.math.BigDecimal A665PedPre ;
   private java.math.BigDecimal GXv_decimal12[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private String wcpOAV5Emprcod ;
   private String wcpOAV7EntNAlbar ;
   private String wcpOAV112PrvNom ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sPrefix ;
   private String sCompPrefix ;
   private String sSFPrefix ;
   private String AV5Emprcod ;
   private String AV7EntNAlbar ;
   private String AV112PrvNom ;
   private String sGXsfl_31_idx="0001" ;
   private String edtavEntnemb_Internalname ;
   private String edtavNetiquetas_Internalname ;
   private String AV63TFPrdNum ;
   private String AV64TFPrdNum_Sel ;
   private String AV66TFPrdNom ;
   private String AV67TFPrdNom_Sel ;
   private String AV113TFPrdRec ;
   private String AV114TFPrdRec_Sel ;
   private String AV137Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String Gx_msg ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
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
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String Grid_titlescategories_Gridinternalname ;
   private String Grid_titlescategories_Gridtitlescategories ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divTableactions_Internalname ;
   private String TempTags ;
   private String ClassString ;
   private String StyleString ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String bttBtncancelar_Internalname ;
   private String bttBtncancelar_Jsonclick ;
   private String edtavPrvnum_Internalname ;
   private String edtavPrvnum_Jsonclick ;
   private String edtavPrvnom_Internalname ;
   private String edtavPrvnom_Jsonclick ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_titlescategories_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sXEvt ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV121Wcwinalmpqds_1_tfprdnum ;
   private String AV122Wcwinalmpqds_2_tfprdnum_sel ;
   private String AV123Wcwinalmpqds_3_tfprdnom ;
   private String AV124Wcwinalmpqds_4_tfprdnom_sel ;
   private String AV129Wcwinalmpqds_9_tfprdrec ;
   private String AV130Wcwinalmpqds_10_tfprdrec_sel ;
   private String AV103Seleccionar ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtPedUni_Internalname ;
   private String edtPedCanEnt_Internalname ;
   private String edtavPedcanent_Internalname ;
   private String AV98PedCum ;
   private String edtavPedpre_Internalname ;
   private String edtavValorlinea_Internalname ;
   private String AV13EntLotN ;
   private String edtavEntlotn_Internalname ;
   private String edtavEntfval_Internalname ;
   private String edtPrdNumUco_Internalname ;
   private String A727PrdRec ;
   private String edtPrdRec_Internalname ;
   private String A659PedCum ;
   private String edtPedCum_Internalname ;
   private String edtavUltfecccs_Internalname ;
   private String edtPedPre_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV121Wcwinalmpqds_1_tfprdnum ;
   private String lV123Wcwinalmpqds_3_tfprdnom ;
   private String lV129Wcwinalmpqds_9_tfprdrec ;
   private String A667PedSit ;
   private String AV118Station ;
   private String AV119Emprnom ;
   private String AV120Usurcod ;
   private String sGXsfl_31_fel_idx="0001" ;
   private String AV104AplicarAlbaran ;
   private String AV110EntLotNGRID ;
   private String GXv_char6[] ;
   private String GXv_char5[] ;
   private String GXv_char4[] ;
   private String GXv_char14[] ;
   private String GXv_char15[] ;
   private String AV31Prdnum ;
   private String GXt_char24 ;
   private String GXv_char22[] ;
   private String GXt_char23 ;
   private String GXv_char21[] ;
   private String GXt_char3 ;
   private String GXv_char19[] ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String sCtrlAV5Emprcod ;
   private String sCtrlAV6Pedcod ;
   private String sCtrlAV7EntNAlbar ;
   private String sCtrlAV8EntFecEnt ;
   private String sCtrlAV33PrvNum ;
   private String sCtrlAV112PrvNom ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtPedUni_Jsonclick ;
   private String edtPedCanEnt_Jsonclick ;
   private String edtavEntnemb_Jsonclick ;
   private String edtavPedcanent_Jsonclick ;
   private String edtavPedpre_Jsonclick ;
   private String edtavValorlinea_Jsonclick ;
   private String edtavNetiquetas_Jsonclick ;
   private String edtavEntlotn_Jsonclick ;
   private String edtavEntfval_Jsonclick ;
   private String edtPrdNumUco_Jsonclick ;
   private String edtPrdRec_Jsonclick ;
   private String edtPedCum_Jsonclick ;
   private String edtavUltfecccs_Jsonclick ;
   private String edtPedPre_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV8EntFecEnt ;
   private java.util.Date AV8EntFecEnt ;
   private java.util.Date A3348CCStkFec ;
   private java.util.Date Gx_date ;
   private java.util.Date AV12EntFVal ;
   private java.util.Date AV96UltFecCCs ;
   private java.util.Date GXv_date10[] ;
   private java.util.Date GXv_date17[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_31_Refreshing=false ;
   private boolean AV50OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Grid_empowerer_Hascategories ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean n3341CCStKULin ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private boolean Cond_result ;
   private String AV76productosEtiquetas ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.webpanels.GXWebForm Form ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV44HTTPRequest ;
   private com.genexus.webpanels.WebSession AV58Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_titlescategories ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private ICheckbox chkavSeleccionar ;
   private HTMLChoice cmbavPedcum ;
   private IDataStoreProvider pr_default ;
   private String[] H00WP2_A719PrdNum ;
   private String[] H00WP2_A396EmprCod ;
   private int[] H00WP2_A658PedCod ;
   private String[] H00WP2_A667PedSit ;
   private long[] H00WP2_A3341CCStKULin ;
   private boolean[] H00WP2_n3341CCStKULin ;
   private java.math.BigDecimal[] H00WP2_A665PedPre ;
   private String[] H00WP2_A659PedCum ;
   private String[] H00WP2_A727PrdRec ;
   private java.math.BigDecimal[] H00WP2_A721PrdNumUco ;
   private java.math.BigDecimal[] H00WP2_A657PedCanEnt ;
   private java.math.BigDecimal[] H00WP2_A669PedUni ;
   private String[] H00WP2_A718PrdNom ;
   private long[] H00WP3_AGRID_nRecordCount ;
   private String[] H00WP4_A396EmprCod ;
   private String[] H00WP4_A719PrdNum ;
   private long[] H00WP4_A3342CCStkLin ;
   private java.util.Date[] H00WP4_A3348CCStkFec ;
   private GXBaseCollection<app.SdtSDTProductosEtiquetas> AV99SDTProductosEtiquetasCollection ;
   private app.SdtSDTProductosEtiquetas AV100SDTProductosEtiquetas ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV75DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons7 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons8[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV47GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState25[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV48GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV45TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV43WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext9[] ;
}

final  class wcwinalmpq__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00WP2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV122Wcwinalmpqds_2_tfprdnum_sel ,
                                          String AV121Wcwinalmpqds_1_tfprdnum ,
                                          String AV124Wcwinalmpqds_4_tfprdnom_sel ,
                                          String AV123Wcwinalmpqds_3_tfprdnom ,
                                          java.math.BigDecimal AV125Wcwinalmpqds_5_tfpeduni ,
                                          java.math.BigDecimal AV126Wcwinalmpqds_6_tfpeduni_to ,
                                          java.math.BigDecimal AV127Wcwinalmpqds_7_tfpedcanent ,
                                          java.math.BigDecimal AV128Wcwinalmpqds_8_tfpedcanent_to ,
                                          String AV130Wcwinalmpqds_10_tfprdrec_sel ,
                                          String AV129Wcwinalmpqds_9_tfprdrec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          String A727PrdRec ,
                                          short AV49OrderedBy ,
                                          boolean AV50OrderedDsc ,
                                          String A667PedSit ,
                                          String A659PedCum ,
                                          String AV5Emprcod ,
                                          int AV6Pedcod ,
                                          String A396EmprCod ,
                                          int A658PedCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[17];
      Object[] GXv_Object27 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " /*+ FIRST_ROWS(51) */ T1.PrdNum, T1.EmprCod, T1.PedCod, T3.PedSit, T2.CCStKULin, T1.PedPre, T1.PedCum, T2.PrdRec, T2.PrdNumUco, T1.PedCanEnt, T1.PedUni, T2.PrdNom" ;
      sFromString = " FROM ((TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPCPEDID T3 ON T3.EmprCod = T1.EmprCod AND T3.PedCod" ;
      sFromString += " = T1.PedCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PedCod = ?)");
      addWhere(sWhereString, "(T3.PedSit = 'N')");
      addWhere(sWhereString, "(T1.PedCum = 'N')");
      if ( (GXutil.strcmp("", AV122Wcwinalmpqds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV121Wcwinalmpqds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Wcwinalmpqds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Wcwinalmpqds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV123Wcwinalmpqds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Wcwinalmpqds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcwinalmpqds_5_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcwinalmpqds_6_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcwinalmpqds_7_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Wcwinalmpqds_8_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wcwinalmpqds_10_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcwinalmpqds_9_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcwinalmpqds_10_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdRec = ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( ( AV49OrderedBy == 1 ) && ! AV50OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV49OrderedBy == 1 ) && ( AV50OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV49OrderedBy == 2 ) && ! AV50OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV49OrderedBy == 2 ) && ( AV50OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV49OrderedBy == 3 ) && ! AV50OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedUni" ;
      }
      else if ( ( AV49OrderedBy == 3 ) && ( AV50OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedUni DESC" ;
      }
      else if ( ( AV49OrderedBy == 4 ) && ! AV50OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PedCanEnt" ;
      }
      else if ( ( AV49OrderedBy == 4 ) && ( AV50OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PedCanEnt DESC" ;
      }
      else if ( ( AV49OrderedBy == 5 ) && ! AV50OrderedDsc )
      {
         sOrderString += " ORDER BY T2.PrdRec" ;
      }
      else if ( ( AV49OrderedBy == 5 ) && ( AV50OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.PrdRec DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.PedCod, T1.PrdNum" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H00WP3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV122Wcwinalmpqds_2_tfprdnum_sel ,
                                          String AV121Wcwinalmpqds_1_tfprdnum ,
                                          String AV124Wcwinalmpqds_4_tfprdnom_sel ,
                                          String AV123Wcwinalmpqds_3_tfprdnom ,
                                          java.math.BigDecimal AV125Wcwinalmpqds_5_tfpeduni ,
                                          java.math.BigDecimal AV126Wcwinalmpqds_6_tfpeduni_to ,
                                          java.math.BigDecimal AV127Wcwinalmpqds_7_tfpedcanent ,
                                          java.math.BigDecimal AV128Wcwinalmpqds_8_tfpedcanent_to ,
                                          String AV130Wcwinalmpqds_10_tfprdrec_sel ,
                                          String AV129Wcwinalmpqds_9_tfprdrec ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A669PedUni ,
                                          java.math.BigDecimal A657PedCanEnt ,
                                          String A727PrdRec ,
                                          short AV49OrderedBy ,
                                          boolean AV50OrderedDsc ,
                                          String A667PedSit ,
                                          String A659PedCum ,
                                          String AV5Emprcod ,
                                          int AV6Pedcod ,
                                          String A396EmprCod ,
                                          int A658PedCod )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[12];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPLPEDID T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum) INNER JOIN TXPCPEDID T3 ON T3.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T3.PedCod = T1.PedCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.PedCod = ?)");
      addWhere(sWhereString, "(T3.PedSit = 'N')");
      addWhere(sWhereString, "(T1.PedCum = 'N')");
      if ( (GXutil.strcmp("", AV122Wcwinalmpqds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV121Wcwinalmpqds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV122Wcwinalmpqds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV124Wcwinalmpqds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV123Wcwinalmpqds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV124Wcwinalmpqds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int28[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV125Wcwinalmpqds_5_tfpeduni)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni >= ?)");
      }
      else
      {
         GXv_int28[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV126Wcwinalmpqds_6_tfpeduni_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedUni <= ?)");
      }
      else
      {
         GXv_int28[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV127Wcwinalmpqds_7_tfpedcanent)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt >= ?)");
      }
      else
      {
         GXv_int28[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Wcwinalmpqds_8_tfpedcanent_to)==0) )
      {
         addWhere(sWhereString, "(T1.PedCanEnt <= ?)");
      }
      else
      {
         GXv_int28[9] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV130Wcwinalmpqds_10_tfprdrec_sel)==0) && ( ! (GXutil.strcmp("", AV129Wcwinalmpqds_9_tfprdrec)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdRec) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[10] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV130Wcwinalmpqds_10_tfprdrec_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdRec = ?)");
      }
      else
      {
         GXv_int28[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV49OrderedBy == 1 ) && ! AV50OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV49OrderedBy == 1 ) && ( AV50OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV49OrderedBy == 2 ) && ! AV50OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV49OrderedBy == 2 ) && ( AV50OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV49OrderedBy == 3 ) && ! AV50OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV49OrderedBy == 3 ) && ( AV50OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV49OrderedBy == 4 ) && ! AV50OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV49OrderedBy == 4 ) && ( AV50OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV49OrderedBy == 5 ) && ! AV50OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV49OrderedBy == 5 ) && ( AV50OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( true )
      {
         scmdbuf += "" ;
      }
      GXv_Object29[0] = scmdbuf ;
      GXv_Object29[1] = GXv_int28 ;
      return GXv_Object29 ;
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
                  return conditional_H00WP2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() );
            case 1 :
                  return conditional_H00WP3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (String)dynConstraints[10] , (String)dynConstraints[11] , (java.math.BigDecimal)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , (String)dynConstraints[14] , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() , (String)dynConstraints[21] , ((Number) dynConstraints[22]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00WP2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00WP3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00WP4", "SELECT * FROM (SELECT EmprCod, PrdNum, CCStkLin, CCStkFec FROM TXPCCSTKS WHERE EmprCod = ? and PrdNum = ? and CCStkLin = ? ORDER BY EmprCod, PrdNum, CCStkLin) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 1);
               ((long[]) buf[4])[0] = rslt.getLong(5);
               ((boolean[]) buf[5])[0] = rslt.wasNull();
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 1);
               ((String[]) buf[8])[0] = rslt.getString(8, 1);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(9,2);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(10,2);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(11,2);
               ((String[]) buf[12])[0] = rslt.getString(12, 26);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
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
                  stmt.setString(sIdx, (String)parms[17], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[18]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[26], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 1);
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[29]).intValue());
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[30]).intValue());
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[31]).intValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[32]).intValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[33]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[13]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 2);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 2);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[20], 2);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[21], 2);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 1);
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 1);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               stmt.setLong(3, ((Number) parms[2]).longValue());
               return;
      }
   }

}

