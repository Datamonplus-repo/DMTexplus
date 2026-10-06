package app.almacensindetalle ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class devoluciontejido_8_impl extends GXDataArea
{
   public devoluciontejido_8_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public devoluciontejido_8_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( devoluciontejido_8_impl.class ));
   }

   public devoluciontejido_8_impl( int remoteHandle ,
                                   ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactions = new HTMLChoice();
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetFirstPar( "EmprCod") ;
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
            AV28EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV23DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV23DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23DevCruId), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23DevCruId), "ZZZZZZZ9")));
               AV22DevCruFec = localUtil.parseDateParm( httpContext.GetPar( "DevCruFec")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV22DevCruFec", localUtil.format(AV22DevCruFec, "99/99/99"));
               AV21DevCruEnvA = (short)(GXutil.lval( httpContext.GetPar( "DevCruEnvA"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV21DevCruEnvA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21DevCruEnvA), 4, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUENVA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21DevCruEnvA), "ZZZ9")));
               AV19DevCruAtId = httpContext.GetPar( "DevCruAtId") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV19DevCruAtId", AV19DevCruAtId);
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUATID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19DevCruAtId, ""))));
               AV16CliCod = (int)(GXutil.lval( httpContext.GetPar( "CliCod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
               AV20DevCruDtSys = localUtil.parseDTimeParm( httpContext.GetPar( "DevCruDtSys")) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV20DevCruDtSys", localUtil.ttoc( AV20DevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUDTSYS", getSecureSignedToken( "", localUtil.format( AV20DevCruDtSys, "99/99/99 99:99")));
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
      nRC_GXsfl_115 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_115"))) ;
      nGXsfl_115_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_115_idx"))) ;
      sGXsfl_115_idx = httpContext.GetPar( "sGXsfl_115_idx") ;
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
      AV28EmprCod = httpContext.GetPar( "EmprCod") ;
      AV23DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
      AV49TFAlbRecCod = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod"))) ;
      AV50TFAlbRecCod_To = (int)(GXutil.lval( httpContext.GetPar( "TFAlbRecCod_To"))) ;
      AV51TFAlbRef = httpContext.GetPar( "TFAlbRef") ;
      AV52TFAlbRef_Sel = httpContext.GetPar( "TFAlbRef_Sel") ;
      AV53TFAlbRefDsc = httpContext.GetPar( "TFAlbRefDsc") ;
      AV54TFAlbRefDsc_Sel = httpContext.GetPar( "TFAlbRefDsc_Sel") ;
      AV57TFDevCruUnd = CommonUtil.decimalVal( httpContext.GetPar( "TFDevCruUnd"), ".") ;
      AV58TFDevCruUnd_To = CommonUtil.decimalVal( httpContext.GetPar( "TFDevCruUnd_To"), ".") ;
      AV55TFDevCruPzs = (int)(GXutil.lval( httpContext.GetPar( "TFDevCruPzs"))) ;
      AV56TFDevCruPzs_To = (int)(GXutil.lval( httpContext.GetPar( "TFDevCruPzs_To"))) ;
      AV71Pgmname = httpContext.GetPar( "Pgmname") ;
      AV43OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV44OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV21DevCruEnvA = (short)(GXutil.lval( httpContext.GetPar( "DevCruEnvA"))) ;
      AV19DevCruAtId = httpContext.GetPar( "DevCruAtId") ;
      AV20DevCruDtSys = localUtil.parseDTimeParm( httpContext.GetPar( "DevCruDtSys")) ;
      AV67Hash = httpContext.GetPar( "Hash") ;
      A396EmprCod = httpContext.GetPar( "EmprCod") ;
      A11669DevCruId = (int)(GXutil.lval( httpContext.GetPar( "DevCruId"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV23DevCruId, AV49TFAlbRecCod, AV50TFAlbRecCod_To, AV51TFAlbRef, AV52TFAlbRef_Sel, AV53TFAlbRefDsc, AV54TFAlbRefDsc_Sel, AV57TFDevCruUnd, AV58TFDevCruUnd_To, AV55TFDevCruPzs, AV56TFDevCruPzs_To, AV71Pgmname, AV43OrderedBy, AV44OrderedDsc, AV21DevCruEnvA, AV19DevCruAtId, AV20DevCruDtSys, AV67Hash, A396EmprCod, A11669DevCruId) ;
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
      pa2B42( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start2B42( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.almacensindetalle.devoluciontejido_8", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV22DevCruFec)),GXutil.URLEncode(GXutil.ltrimstr(AV21DevCruEnvA,4,0)),GXutil.URLEncode(GXutil.rtrim(AV19DevCruAtId)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV20DevCruDtSys))}, new String[] {"EmprCod","DevCruId","DevCruFec","DevCruEnvA","DevCruAtId","CliCod","DevCruDtSys"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUENVA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21DevCruEnvA), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUATID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19DevCruAtId, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUDTSYS", getSecureSignedToken( "", localUtil.format( AV20DevCruDtSys, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67Hash, ""))));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_8");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV71Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\devoluciontejido_8:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_115", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_115, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV32GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV33GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV18DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD", GXutil.ltrim( localUtil.ntoc( AV49TFAlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBRECCOD_TO", GXutil.ltrim( localUtil.ntoc( AV50TFAlbRecCod_To, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF", GXutil.rtrim( AV51TFAlbRef));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREF_SEL", GXutil.rtrim( AV52TFAlbRef_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC", GXutil.rtrim( AV53TFAlbRefDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFALBREFDSC_SEL", GXutil.rtrim( AV54TFAlbRefDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUUND", GXutil.ltrim( localUtil.ntoc( AV57TFDevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUUND_TO", GXutil.ltrim( localUtil.ntoc( AV58TFDevCruUnd_To, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUPZS", GXutil.ltrim( localUtil.ntoc( AV55TFDevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFDEVCRUPZS_TO", GXutil.ltrim( localUtil.ntoc( AV56TFDevCruPzs_To, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV43OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV44OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUENVA", GXutil.ltrim( localUtil.ntoc( AV21DevCruEnvA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUENVA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21DevCruEnvA), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUATID", GXutil.rtrim( AV19DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUATID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19DevCruAtId, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUID", GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV28EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUID", GXutil.ltrim( localUtil.ntoc( AV23DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUDTSYS", localUtil.ttoc( AV20DevCruDtSys, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUDTSYS", getSecureSignedToken( "", localUtil.format( AV20DevCruDtSys, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV67Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67Hash, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRU", GXutil.ltrim( localUtil.ntoc( AV66DevCru, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUFEC", localUtil.dtoc( AV22DevCruFec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD_SELECTED", GXutil.rtrim( AV82Emprcod_selected));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUID_SELECTED", GXutil.ltrim( localUtil.ntoc( AV83Devcruid_selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vALBRECCOD_SELECTED", GXutil.ltrim( localUtil.ntoc( AV84Albreccod_selected, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Width", GXutil.rtrim( Dvpanel_unnamedtable2_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable2_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable2_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Cls", GXutil.rtrim( Dvpanel_unnamedtable2_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Title", GXutil.rtrim( Dvpanel_unnamedtable2_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable2_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable2_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable2_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE2_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable2_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Title", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Fixedcolumns", GXutil.rtrim( Grid_empowerer_Fixedcolumns));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ELIMINAR_Result", GXutil.rtrim( Dvelop_confirmpanel_eliminar_Result));
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
         we2B42( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt2B42( ) ;
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
      return formatLink("app.almacensindetalle.devoluciontejido_8", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateParm(AV22DevCruFec)),GXutil.URLEncode(GXutil.ltrimstr(AV21DevCruEnvA,4,0)),GXutil.URLEncode(GXutil.rtrim(AV19DevCruAtId)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV20DevCruDtSys))}, new String[] {"EmprCod","DevCruId","DevCruFec","DevCruEnvA","DevCruAtId","CliCod","DevCruDtSys"})  ;
   }

   public String getPgmname( )
   {
      return "AlmacenSinDetalle.DevolucionTejido_8" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( " Devolucion de Tejido", "") ;
   }

   public void wb2B40( )
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
         app.GxWebStd.gx_div_start( httpContext, divTableheader_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicod_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicod_Internalname, GXutil.ltrim( localUtil.ntoc( AV16CliCod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV16CliCod), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV16CliCod), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicod_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClinom_Internalname, GXutil.rtrim( AV68CliNom), GXutil.rtrim( localUtil.format( AV68CliNom, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,23);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClinom_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClinom_Enabled, 0, "text", "", 30, "chr", 1, "row", 30, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbreccod_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbreccod_Internalname, httpContext.getMessage( "N Recepcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 31,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbreccod_Internalname, GXutil.ltrim( localUtil.ntoc( AV7AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbreccod_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV7AlbRecCod), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV7AlbRecCod), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,31);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbreccod_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbreccod_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 33,'',false,'',0)\"" ;
         ClassString = "CellMarginTop15" + " " + ((GXutil.strcmp(imgUseraction1_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgUseraction1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgUseraction1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgUseraction1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbref_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbref_Internalname, httpContext.getMessage( "Referencia", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 37,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbref_Internalname, GXutil.rtrim( AV8AlbRef), GXutil.rtrim( localUtil.format( AV8AlbRef, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,37);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbref_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbref_Enabled, 0, "text", "", 16, "chr", 1, "row", 16, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrefdsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrefdsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 41,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrefdsc_Internalname, GXutil.rtrim( AV9AlbRefDsc), GXutil.rtrim( localUtil.format( AV9AlbRefDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,41);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrefdsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrefdsc_Enabled, 0, "text", "", 26, "chr", 1, "row", 26, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcruund_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcruund_Internalname, httpContext.getMessage( "Unds", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 45,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcruund_Internalname, GXutil.ltrim( localUtil.ntoc( AV26DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevcruund_Enabled!=0) ? localUtil.format( AV26DevCruUnd, "ZZZZZ9.99") : localUtil.format( AV26DevCruUnd, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,45);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcruund_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcruund_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrunidis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrunidis_Internalname, httpContext.getMessage( "Unds. Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrunidis_Internalname, GXutil.ltrim( localUtil.ntoc( AV13AlbRUniDis, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrunidis_Enabled!=0) ? localUtil.format( AV13AlbRUniDis, "ZZZZZ9.99") : localUtil.format( AV13AlbRUniDis, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrunidis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrunidis_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrupzs_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcrupzs_Internalname, httpContext.getMessage( "Pzs.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrupzs_Internalname, GXutil.ltrim( localUtil.ntoc( AV24DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevcrupzs_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV24DevCruPzs), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV24DevCruPzs), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrupzs_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrupzs_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrpiedis_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrpiedis_Internalname, httpContext.getMessage( "Pzs. Disp.", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrpiedis_Internalname, GXutil.ltrim( localUtil.ntoc( AV10AlbRPieDis, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrpiedis_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV10AlbRPieDis), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV10AlbRPieDis), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrpiedis_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrpiedis_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 65,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 115, 3, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, bttBtnenter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 67,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnhashcomunicarat_Internalname, "gx.evt.setGridEvt("+GXutil.str( 115, 3, 0)+","+"null"+");", httpContext.getMessage( "Hash y Comunicar a AT", ""), bttBtnhashcomunicarat_Jsonclick, 5, httpContext.getMessage( "Hash y Comunicar a AT", ""), "", StyleString, ClassString, 1, bttBtnhashcomunicarat_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOHASHCOMUNICARAT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 69,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 115, 3, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
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
         /* User Defined Control */
         ucDvpanel_unnamedtable2.setProperty("Width", Dvpanel_unnamedtable2_Width);
         ucDvpanel_unnamedtable2.setProperty("AutoWidth", Dvpanel_unnamedtable2_Autowidth);
         ucDvpanel_unnamedtable2.setProperty("AutoHeight", Dvpanel_unnamedtable2_Autoheight);
         ucDvpanel_unnamedtable2.setProperty("Cls", Dvpanel_unnamedtable2_Cls);
         ucDvpanel_unnamedtable2.setProperty("Title", Dvpanel_unnamedtable2_Title);
         ucDvpanel_unnamedtable2.setProperty("Collapsible", Dvpanel_unnamedtable2_Collapsible);
         ucDvpanel_unnamedtable2.setProperty("Collapsed", Dvpanel_unnamedtable2_Collapsed);
         ucDvpanel_unnamedtable2.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable2_Showcollapseicon);
         ucDvpanel_unnamedtable2.setProperty("IconPosition", Dvpanel_unnamedtable2_Iconposition);
         ucDvpanel_unnamedtable2.setProperty("AutoScroll", Dvpanel_unnamedtable2_Autoscroll);
         ucDvpanel_unnamedtable2.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable2_Internalname, "DVPANEL_UNNAMEDTABLE2Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE2Container"+"UnnamedTable2"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrunient_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrunient_Internalname, httpContext.getMessage( "Unidades Entrada", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 79,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrunient_Internalname, GXutil.ltrim( localUtil.ntoc( AV14AlbRUniEnt, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrunient_Enabled!=0) ? localUtil.format( AV14AlbRUniEnt, "ZZZZZ9.99") : localUtil.format( AV14AlbRUniEnt, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,79);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrunient_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrunient_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbruniuti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbruniuti_Internalname, httpContext.getMessage( "Unidades Utilizadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 83,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbruniuti_Internalname, GXutil.ltrim( localUtil.ntoc( AV15AlbRUniUti, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbruniuti_Enabled!=0) ? localUtil.format( AV15AlbRUniUti, "ZZZZZ9.99") : localUtil.format( AV15AlbRUniUti, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,83);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbruniuti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbruniuti_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrpieent_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrpieent_Internalname, httpContext.getMessage( "Piezas Entregadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 87,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrpieent_Internalname, GXutil.ltrim( localUtil.ntoc( AV11AlbRPieEnt, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrpieent_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV11AlbRPieEnt), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV11AlbRPieEnt), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,87);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrpieent_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrpieent_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavAlbrpieuti_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavAlbrpieuti_Internalname, httpContext.getMessage( "Piezas Utilizadas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 91,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavAlbrpieuti_Internalname, GXutil.ltrim( localUtil.ntoc( AV12AlbRPieUti, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavAlbrpieuti_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV12AlbRPieUti), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV12AlbRPieUti), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,91);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavAlbrpieuti_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavAlbrpieuti_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcruundold_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcruundold_Internalname, httpContext.getMessage( "Unidades", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 95,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcruundold_Internalname, GXutil.ltrim( localUtil.ntoc( AV27devcruUndold, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevcruundold_Enabled!=0) ? localUtil.format( AV27devcruUndold, "ZZZZZ9.99") : localUtil.format( AV27devcruUndold, "ZZZZZ9.99"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'2');"+";gx.evt.onblur(this,95);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcruundold_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcruundold_Enabled, 0, "text", "", 9, "chr", 1, "row", 9, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavDevcrupzsold_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavDevcrupzsold_Internalname, httpContext.getMessage( "Piezas", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 99,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavDevcrupzsold_Internalname, GXutil.ltrim( localUtil.ntoc( AV25DevCrupzsold, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavDevcrupzsold_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV25DevCrupzsold), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV25DevCrupzsold), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavDevcrupzsold_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavDevcrupzsold_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavClicodalbrec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavClicodalbrec_Internalname, httpContext.getMessage( "Cliente", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 103,'',false,'" + sGXsfl_115_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavClicodalbrec_Internalname, GXutil.ltrim( localUtil.ntoc( AV17CliCodAlbrec, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavClicodalbrec_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV17CliCodAlbrec), "ZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV17CliCodAlbrec), "ZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavClicodalbrec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavClicodalbrec_Enabled, 0, "text", "1", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
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
         startgridcontrol115( ) ;
      }
      if ( wbEnd == 115 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_115 = (int)(nGXsfl_115_idx-1) ;
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "</table>") ;
            httpContext.writeText( "</div>") ;
         }
         else
         {
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV71Pgmname), GXutil.rtrim( localUtil.format( AV71Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_AlmacenSinDetalle\\DevolucionTejido_8.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV18DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table1_136_2B42( true) ;
      }
      else
      {
         wb_table1_136_2B42( false) ;
      }
      return  ;
   }

   public void wb_table1_136_2B42e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("FixedColumns", Grid_empowerer_Fixedcolumns);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 115 )
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

   public void start2B42( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( " Devolucion de Tejido", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup2B40( ) ;
   }

   public void ws2B42( )
   {
      start2B42( ) ;
      evt2B42( ) ;
   }

   public void evt2B42( )
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
                           e112B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e122B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e132B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e142B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOHASHCOMUNICARAT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'Dohashcomunicarat' */
                           e152B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e162B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e172B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VALBRECCOD.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e182B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDEVCRUUND.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e192B42 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VDEVCRUPZS.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e202B42 ();
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
                                 e212B42 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "ALBRECCOD.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 15), "ALBRECCOD.CLICK") == 0 ) )
                        {
                           nGXsfl_115_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_1152( ) ;
                           cmbavGridactions.setName( cmbavGridactions.getInternalname() );
                           cmbavGridactions.setValue( httpContext.cgiGet( cmbavGridactions.getInternalname()) );
                           AV31GridActions = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactions.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridActions), 4, 0));
                           A44AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtAlbRecCod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A45AlbRef = httpContext.cgiGet( edtAlbRef_Internalname) ;
                           A3613AlbRefDsc = httpContext.cgiGet( edtAlbRefDsc_Internalname) ;
                           A11683DevCruUnd = localUtil.ctond( httpContext.cgiGet( edtDevCruUnd_Internalname)) ;
                           A11684DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtDevCruPzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e222B42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e232B42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e242B42 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ALBRECCOD.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e252B42 ();
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

   public void we2B42( )
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

   public void pa2B42( )
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
            GX_FocusControl = edtavClinom_Internalname ;
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
      subsflControlProps_1152( ) ;
      while ( nGXsfl_115_idx <= nRC_GXsfl_115 )
      {
         sendrow_1152( ) ;
         nGXsfl_115_idx = ((subGrid_Islastpage==1)&&(nGXsfl_115_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_115_idx+1) ;
         sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1152( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV28EmprCod ,
                                 int AV23DevCruId ,
                                 int AV49TFAlbRecCod ,
                                 int AV50TFAlbRecCod_To ,
                                 String AV51TFAlbRef ,
                                 String AV52TFAlbRef_Sel ,
                                 String AV53TFAlbRefDsc ,
                                 String AV54TFAlbRefDsc_Sel ,
                                 java.math.BigDecimal AV57TFDevCruUnd ,
                                 java.math.BigDecimal AV58TFDevCruUnd_To ,
                                 int AV55TFDevCruPzs ,
                                 int AV56TFDevCruPzs_To ,
                                 String AV71Pgmname ,
                                 short AV43OrderedBy ,
                                 boolean AV44OrderedDsc ,
                                 short AV21DevCruEnvA ,
                                 String AV19DevCruAtId ,
                                 java.util.Date AV20DevCruDtSys ,
                                 String AV67Hash ,
                                 String A396EmprCod ,
                                 int A11669DevCruId )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e232B42 ();
      GRID_nCurrentRecord = 0 ;
      rf2B42( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_8");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV71Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("almacensindetalle\\devoluciontejido_8:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECCOD", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "ALBRECCOD", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
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
      rf2B42( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV71Pgmname = "AlmacenSinDetalle.DevolucionTejido_8" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Pgmname", AV71Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavAlbref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbref_Enabled), 5, 0), true);
      edtavAlbrefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrefdsc_Enabled), 5, 0), true);
      edtavAlbrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunidis_Enabled), 5, 0), true);
      edtavAlbrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpiedis_Enabled), 5, 0), true);
      edtavAlbrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunient_Enabled), 5, 0), true);
      edtavAlbruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbruniuti_Enabled), 5, 0), true);
      edtavAlbrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieent_Enabled), 5, 0), true);
      edtavAlbrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieuti_Enabled), 5, 0), true);
      edtavDevcruundold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcruundold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcruundold_Enabled), 5, 0), true);
      edtavDevcrupzsold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcrupzsold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrupzsold_Enabled), 5, 0), true);
      edtavClicodalbrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodalbrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodalbrec_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
   }

   public void rf2B42( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(115) ;
      /* Execute user event: Refresh */
      e232B42 ();
      nGXsfl_115_idx = 1 ;
      sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_1152( ) ;
      bGXsfl_115_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_1152( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Integer.valueOf(AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod) ,
                                              Integer.valueOf(AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to) ,
                                              AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel ,
                                              AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref ,
                                              AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel ,
                                              AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc ,
                                              AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund ,
                                              AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to ,
                                              Integer.valueOf(AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs) ,
                                              Integer.valueOf(AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to) ,
                                              Integer.valueOf(A44AlbRecCod) ,
                                              A45AlbRef ,
                                              A3613AlbRefDsc ,
                                              A11683DevCruUnd ,
                                              Integer.valueOf(A11684DevCruPzs) ,
                                              Short.valueOf(AV43OrderedBy) ,
                                              Boolean.valueOf(AV44OrderedDsc) ,
                                              AV28EmprCod ,
                                              Integer.valueOf(AV23DevCruId) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A11669DevCruId) } ,
                                              new int[]{
                                              TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                              TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                              TypeConstants.INT
                                              }
         });
         lV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref), 16, "%") ;
         lV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc), 26, "%") ;
         /* Using cursor H02B42 */
         pr_default.execute(0, new Object[] {AV28EmprCod, Integer.valueOf(AV23DevCruId), Integer.valueOf(AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod), Integer.valueOf(AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to), lV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref, AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel, lV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc, AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel, AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund, AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to, Integer.valueOf(AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs), Integer.valueOf(AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_115_idx = 1 ;
         sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1152( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A396EmprCod = H02B42_A396EmprCod[0] ;
            A11669DevCruId = H02B42_A11669DevCruId[0] ;
            A11684DevCruPzs = H02B42_A11684DevCruPzs[0] ;
            A11683DevCruUnd = H02B42_A11683DevCruUnd[0] ;
            A3613AlbRefDsc = H02B42_A3613AlbRefDsc[0] ;
            A45AlbRef = H02B42_A45AlbRef[0] ;
            A44AlbRecCod = H02B42_A44AlbRecCod[0] ;
            A3613AlbRefDsc = H02B42_A3613AlbRefDsc[0] ;
            A45AlbRef = H02B42_A45AlbRef[0] ;
            e242B42 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(115) ;
         wb2B40( ) ;
      }
      bGXsfl_115_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes2B42( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUENVA", GXutil.ltrim( localUtil.ntoc( AV21DevCruEnvA, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUENVA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21DevCruEnvA), "ZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUATID", GXutil.rtrim( AV19DevCruAtId));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUATID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19DevCruAtId, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_EMPRCOD", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( A396EmprCod, "@!"))));
      app.GxWebStd.gx_hidden_field( httpContext, "DEVCRUID", GXutil.ltrim( localUtil.ntoc( A11669DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_DEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A11669DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_ALBRECCOD"+"_"+sGXsfl_115_idx, getSecureSignedToken( sGXsfl_115_idx, localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUID", GXutil.ltrim( localUtil.ntoc( AV23DevCruId, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23DevCruId), "ZZZZZZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDEVCRUDTSYS", localUtil.ttoc( AV20DevCruDtSys, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUDTSYS", getSecureSignedToken( "", localUtil.format( AV20DevCruDtSys, "99/99/99 99:99")));
      app.GxWebStd.gx_hidden_field( httpContext, "vHASH", AV67Hash);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vHASH", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV67Hash, ""))));
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
      AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod = AV49TFAlbRecCod ;
      AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to = AV50TFAlbRecCod_To ;
      AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref = AV51TFAlbRef ;
      AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel = AV52TFAlbRef_Sel ;
      AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc = AV53TFAlbRefDsc ;
      AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel = AV54TFAlbRefDsc_Sel ;
      AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund = AV57TFDevCruUnd ;
      AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to = AV58TFDevCruUnd_To ;
      AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs = AV55TFDevCruPzs ;
      AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to = AV56TFDevCruPzs_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Integer.valueOf(AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod) ,
                                           Integer.valueOf(AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to) ,
                                           AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel ,
                                           AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref ,
                                           AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel ,
                                           AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc ,
                                           AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund ,
                                           AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to ,
                                           Integer.valueOf(AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs) ,
                                           Integer.valueOf(AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to) ,
                                           Integer.valueOf(A44AlbRecCod) ,
                                           A45AlbRef ,
                                           A3613AlbRefDsc ,
                                           A11683DevCruUnd ,
                                           Integer.valueOf(A11684DevCruPzs) ,
                                           Short.valueOf(AV43OrderedBy) ,
                                           Boolean.valueOf(AV44OrderedDsc) ,
                                           AV28EmprCod ,
                                           Integer.valueOf(AV23DevCruId) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A11669DevCruId) } ,
                                           new int[]{
                                           TypeConstants.INT, TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.INT,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.INT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING,
                                           TypeConstants.INT
                                           }
      });
      lV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref = GXutil.padr( GXutil.rtrim( AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref), 16, "%") ;
      lV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc = GXutil.padr( GXutil.rtrim( AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc), 26, "%") ;
      /* Using cursor H02B43 */
      pr_default.execute(1, new Object[] {AV28EmprCod, Integer.valueOf(AV23DevCruId), Integer.valueOf(AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod), Integer.valueOf(AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to), lV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref, AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel, lV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc, AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel, AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund, AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to, Integer.valueOf(AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs), Integer.valueOf(AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to)});
      GRID_nRecordCount = H02B43_AGRID_nRecordCount[0] ;
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
      AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod = AV49TFAlbRecCod ;
      AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to = AV50TFAlbRecCod_To ;
      AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref = AV51TFAlbRef ;
      AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel = AV52TFAlbRef_Sel ;
      AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc = AV53TFAlbRefDsc ;
      AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel = AV54TFAlbRefDsc_Sel ;
      AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund = AV57TFDevCruUnd ;
      AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to = AV58TFDevCruUnd_To ;
      AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs = AV55TFDevCruPzs ;
      AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to = AV56TFDevCruPzs_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV23DevCruId, AV49TFAlbRecCod, AV50TFAlbRecCod_To, AV51TFAlbRef, AV52TFAlbRef_Sel, AV53TFAlbRefDsc, AV54TFAlbRefDsc_Sel, AV57TFDevCruUnd, AV58TFDevCruUnd_To, AV55TFDevCruPzs, AV56TFDevCruPzs_To, AV71Pgmname, AV43OrderedBy, AV44OrderedDsc, AV21DevCruEnvA, AV19DevCruAtId, AV20DevCruDtSys, AV67Hash, A396EmprCod, A11669DevCruId) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod = AV49TFAlbRecCod ;
      AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to = AV50TFAlbRecCod_To ;
      AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref = AV51TFAlbRef ;
      AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel = AV52TFAlbRef_Sel ;
      AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc = AV53TFAlbRefDsc ;
      AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel = AV54TFAlbRefDsc_Sel ;
      AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund = AV57TFDevCruUnd ;
      AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to = AV58TFDevCruUnd_To ;
      AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs = AV55TFDevCruPzs ;
      AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to = AV56TFDevCruPzs_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV23DevCruId, AV49TFAlbRecCod, AV50TFAlbRecCod_To, AV51TFAlbRef, AV52TFAlbRef_Sel, AV53TFAlbRefDsc, AV54TFAlbRefDsc_Sel, AV57TFDevCruUnd, AV58TFDevCruUnd_To, AV55TFDevCruPzs, AV56TFDevCruPzs_To, AV71Pgmname, AV43OrderedBy, AV44OrderedDsc, AV21DevCruEnvA, AV19DevCruAtId, AV20DevCruDtSys, AV67Hash, A396EmprCod, A11669DevCruId) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod = AV49TFAlbRecCod ;
      AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to = AV50TFAlbRecCod_To ;
      AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref = AV51TFAlbRef ;
      AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel = AV52TFAlbRef_Sel ;
      AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc = AV53TFAlbRefDsc ;
      AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel = AV54TFAlbRefDsc_Sel ;
      AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund = AV57TFDevCruUnd ;
      AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to = AV58TFDevCruUnd_To ;
      AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs = AV55TFDevCruPzs ;
      AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to = AV56TFDevCruPzs_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV23DevCruId, AV49TFAlbRecCod, AV50TFAlbRecCod_To, AV51TFAlbRef, AV52TFAlbRef_Sel, AV53TFAlbRefDsc, AV54TFAlbRefDsc_Sel, AV57TFDevCruUnd, AV58TFDevCruUnd_To, AV55TFDevCruPzs, AV56TFDevCruPzs_To, AV71Pgmname, AV43OrderedBy, AV44OrderedDsc, AV21DevCruEnvA, AV19DevCruAtId, AV20DevCruDtSys, AV67Hash, A396EmprCod, A11669DevCruId) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod = AV49TFAlbRecCod ;
      AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to = AV50TFAlbRecCod_To ;
      AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref = AV51TFAlbRef ;
      AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel = AV52TFAlbRef_Sel ;
      AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc = AV53TFAlbRefDsc ;
      AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel = AV54TFAlbRefDsc_Sel ;
      AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund = AV57TFDevCruUnd ;
      AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to = AV58TFDevCruUnd_To ;
      AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs = AV55TFDevCruPzs ;
      AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to = AV56TFDevCruPzs_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV23DevCruId, AV49TFAlbRecCod, AV50TFAlbRecCod_To, AV51TFAlbRef, AV52TFAlbRef_Sel, AV53TFAlbRefDsc, AV54TFAlbRefDsc_Sel, AV57TFDevCruUnd, AV58TFDevCruUnd_To, AV55TFDevCruPzs, AV56TFDevCruPzs_To, AV71Pgmname, AV43OrderedBy, AV44OrderedDsc, AV21DevCruEnvA, AV19DevCruAtId, AV20DevCruDtSys, AV67Hash, A396EmprCod, A11669DevCruId) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod = AV49TFAlbRecCod ;
      AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to = AV50TFAlbRecCod_To ;
      AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref = AV51TFAlbRef ;
      AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel = AV52TFAlbRef_Sel ;
      AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc = AV53TFAlbRefDsc ;
      AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel = AV54TFAlbRefDsc_Sel ;
      AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund = AV57TFDevCruUnd ;
      AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to = AV58TFDevCruUnd_To ;
      AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs = AV55TFDevCruPzs ;
      AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to = AV56TFDevCruPzs_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV28EmprCod, AV23DevCruId, AV49TFAlbRecCod, AV50TFAlbRecCod_To, AV51TFAlbRef, AV52TFAlbRef_Sel, AV53TFAlbRefDsc, AV54TFAlbRefDsc_Sel, AV57TFDevCruUnd, AV58TFDevCruUnd_To, AV55TFDevCruPzs, AV56TFDevCruPzs_To, AV71Pgmname, AV43OrderedBy, AV44OrderedDsc, AV21DevCruEnvA, AV19DevCruAtId, AV20DevCruDtSys, AV67Hash, A396EmprCod, A11669DevCruId) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV71Pgmname = "AlmacenSinDetalle.DevolucionTejido_8" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV71Pgmname", AV71Pgmname);
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicod_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicod_Enabled), 5, 0), true);
      edtavClinom_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClinom_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClinom_Enabled), 5, 0), true);
      edtavAlbref_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbref_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbref_Enabled), 5, 0), true);
      edtavAlbrefdsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrefdsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrefdsc_Enabled), 5, 0), true);
      edtavAlbrunidis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunidis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunidis_Enabled), 5, 0), true);
      edtavAlbrpiedis_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpiedis_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpiedis_Enabled), 5, 0), true);
      edtavAlbrunient_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrunient_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrunient_Enabled), 5, 0), true);
      edtavAlbruniuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbruniuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbruniuti_Enabled), 5, 0), true);
      edtavAlbrpieent_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieent_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieent_Enabled), 5, 0), true);
      edtavAlbrpieuti_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavAlbrpieuti_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavAlbrpieuti_Enabled), 5, 0), true);
      edtavDevcruundold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcruundold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcruundold_Enabled), 5, 0), true);
      edtavDevcrupzsold_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDevcrupzsold_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDevcrupzsold_Enabled), 5, 0), true);
      edtavClicodalbrec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavClicodalbrec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavClicodalbrec_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      fix_multi_value_controls( ) ;
   }

   public void strup2B40( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e222B42 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV18DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_115 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_115"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV32GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV33GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV21DevCruEnvA = (short)(localUtil.ctol( httpContext.cgiGet( "vDEVCRUENVA"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV19DevCruAtId = httpContext.cgiGet( "vDEVCRUATID") ;
         AV82Emprcod_selected = httpContext.cgiGet( "vEMPRCOD_SELECTED") ;
         A396EmprCod = httpContext.cgiGet( "EMPRCOD") ;
         AV83Devcruid_selected = (int)(localUtil.ctol( httpContext.cgiGet( "vDEVCRUID_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         A11669DevCruId = (int)(localUtil.ctol( httpContext.cgiGet( "DEVCRUID"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV84Albreccod_selected = (int)(localUtil.ctol( httpContext.cgiGet( "vALBRECCOD_SELECTED"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_unnamedtable2_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Width") ;
         Dvpanel_unnamedtable2_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autowidth")) ;
         Dvpanel_unnamedtable2_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoheight")) ;
         Dvpanel_unnamedtable2_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Cls") ;
         Dvpanel_unnamedtable2_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Title") ;
         Dvpanel_unnamedtable2_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsible")) ;
         Dvpanel_unnamedtable2_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Collapsed")) ;
         Dvpanel_unnamedtable2_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Showcollapseicon")) ;
         Dvpanel_unnamedtable2_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Iconposition") ;
         Dvpanel_unnamedtable2_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE2_Autoscroll")) ;
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
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Dvelop_confirmpanel_eliminar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Title") ;
         Dvelop_confirmpanel_eliminar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmationtext") ;
         Dvelop_confirmpanel_eliminar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_eliminar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_eliminar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Fixedcolumns = httpContext.cgiGet( "GRID_EMPOWERER_Fixedcolumns") ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Dvelop_confirmpanel_eliminar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ELIMINAR_Result") ;
         /* Read variables values. */
         AV68CliNom = httpContext.cgiGet( edtavClinom_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV68CliNom", AV68CliNom);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 99999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRECCOD");
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV7AlbRecCod = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbRecCod), 8, 0));
         }
         else
         {
            AV7AlbRecCod = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbreccod_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbRecCod), 8, 0));
         }
         AV8AlbRef = httpContext.cgiGet( edtavAlbref_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV8AlbRef", AV8AlbRef);
         AV9AlbRefDsc = httpContext.cgiGet( edtavAlbrefdsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRefDsc", AV9AlbRefDsc);
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDevcruund_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDevcruund_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDEVCRUUND");
            GX_FocusControl = edtavDevcruund_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26DevCruUnd = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26DevCruUnd", GXutil.ltrimstr( AV26DevCruUnd, 9, 2));
         }
         else
         {
            AV26DevCruUnd = localUtil.ctond( httpContext.cgiGet( edtavDevcruund_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26DevCruUnd", GXutil.ltrimstr( AV26DevCruUnd, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbrunidis_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbrunidis_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRUNIDIS");
            GX_FocusControl = edtavAlbrunidis_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV13AlbRUniDis = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUniDis", GXutil.ltrimstr( AV13AlbRUniDis, 9, 2));
         }
         else
         {
            AV13AlbRUniDis = localUtil.ctond( httpContext.cgiGet( edtavAlbrunidis_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUniDis", GXutil.ltrimstr( AV13AlbRUniDis, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDevcrupzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDevcrupzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDEVCRUPZS");
            GX_FocusControl = edtavDevcrupzs_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV24DevCruPzs = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24DevCruPzs), 6, 0));
         }
         else
         {
            AV24DevCruPzs = (int)(localUtil.ctol( httpContext.cgiGet( edtavDevcrupzs_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24DevCruPzs), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpiedis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpiedis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRPIEDIS");
            GX_FocusControl = edtavAlbrpiedis_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV10AlbRPieDis = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbRPieDis), 6, 0));
         }
         else
         {
            AV10AlbRPieDis = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbrpiedis_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbRPieDis), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbrunient_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbrunient_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRUNIENT");
            GX_FocusControl = edtavAlbrunient_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV14AlbRUniEnt = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14AlbRUniEnt", GXutil.ltrimstr( AV14AlbRUniEnt, 9, 2));
         }
         else
         {
            AV14AlbRUniEnt = localUtil.ctond( httpContext.cgiGet( edtavAlbrunient_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV14AlbRUniEnt", GXutil.ltrimstr( AV14AlbRUniEnt, 9, 2));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavAlbruniuti_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavAlbruniuti_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRUNIUTI");
            GX_FocusControl = edtavAlbruniuti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV15AlbRUniUti = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRUniUti", GXutil.ltrimstr( AV15AlbRUniUti, 9, 2));
         }
         else
         {
            AV15AlbRUniUti = localUtil.ctond( httpContext.cgiGet( edtavAlbruniuti_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRUniUti", GXutil.ltrimstr( AV15AlbRUniUti, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRPIEENT");
            GX_FocusControl = edtavAlbrpieent_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV11AlbRPieEnt = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPieEnt), 6, 0));
         }
         else
         {
            AV11AlbRPieEnt = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbrpieent_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPieEnt), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieuti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavAlbrpieuti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vALBRPIEUTI");
            GX_FocusControl = edtavAlbrpieuti_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV12AlbRPieUti = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AlbRPieUti), 6, 0));
         }
         else
         {
            AV12AlbRPieUti = (int)(localUtil.ctol( httpContext.cgiGet( edtavAlbrpieuti_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AlbRPieUti), 6, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavDevcruundold_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDevcruundold_Internalname)), DecimalUtil.stringToDec("999999.99")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDEVCRUUNDOLD");
            GX_FocusControl = edtavDevcruundold_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV27devcruUndold = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27devcruUndold", GXutil.ltrimstr( AV27devcruUndold, 9, 2));
         }
         else
         {
            AV27devcruUndold = localUtil.ctond( httpContext.cgiGet( edtavDevcruundold_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27devcruUndold", GXutil.ltrimstr( AV27devcruUndold, 9, 2));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavDevcrupzsold_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavDevcrupzsold_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDEVCRUPZSOLD");
            GX_FocusControl = edtavDevcrupzsold_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV25DevCrupzsold = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25DevCrupzsold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DevCrupzsold), 6, 0));
         }
         else
         {
            AV25DevCrupzsold = (int)(localUtil.ctol( httpContext.cgiGet( edtavDevcrupzsold_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25DevCrupzsold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DevCrupzsold), 6, 0));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodalbrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavClicodalbrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCLICODALBREC");
            GX_FocusControl = edtavClicodalbrec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV17CliCodAlbrec = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CliCodAlbrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliCodAlbrec), 6, 0));
         }
         else
         {
            AV17CliCodAlbrec = (int)(localUtil.ctol( httpContext.cgiGet( edtavClicodalbrec_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV17CliCodAlbrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliCodAlbrec), 6, 0));
         }
         AV71Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71Pgmname", AV71Pgmname);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"DevolucionTejido_8");
         AV71Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV71Pgmname", AV71Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV71Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("almacensindetalle\\devoluciontejido_8:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e222B42 ();
      if (returnInSub) return;
   }

   public void e222B42( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV6Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      devoluciontejido_8_impl.this.GXt_char1 = GXv_char2[0] ;
      AV6Station = GXt_char1 ;
      GXv_char2[0] = AV28EmprCod ;
      GXv_char3[0] = AV29EmprNom ;
      GXv_char4[0] = AV61UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV6Station, GXv_char2, GXv_char3, GXv_char4) ;
      devoluciontejido_8_impl.this.AV28EmprCod = GXv_char2[0] ;
      devoluciontejido_8_impl.this.AV29EmprNom = GXv_char3[0] ;
      devoluciontejido_8_impl.this.AV61UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( " Devolucion de Tejido", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S112 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S122 ();
      if (returnInSub) return;
      if ( AV43OrderedBy < 1 )
      {
         AV43OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV18DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV18DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV68CliNom ;
      GXv_char4[0] = GXt_char1 ;
      new app.pclinom(remoteHandle, context).execute( AV28EmprCod, AV16CliCod, GXv_char4) ;
      devoluciontejido_8_impl.this.GXt_char1 = GXv_char4[0] ;
      AV68CliNom = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV68CliNom", AV68CliNom);
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "RemoveElement", "", new Object[] {httpContext.getMessage( ".gx-popup-close", "")});
      this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "DisableFocus", "", new Object[] {imgUseraction1_Internalname});
      bttBtnenter_Enabled = ((AV21DevCruEnvA==3)||(GXutil.strcmp(AV19DevCruAtId, " ")!=0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnenter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnenter_Enabled), 5, 0), true);
      bttBtnhashcomunicarat_Enabled = ((AV21DevCruEnvA==3)||(GXutil.strcmp(AV19DevCruAtId, " ")!=0) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtnhashcomunicarat_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtnhashcomunicarat_Enabled), 5, 0), true);
   }

   public void e232B42( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext7[0] = AV62WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext7) ;
      AV62WWPContext = GXv_SdtWWPContext7[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S142 ();
      if (returnInSub) return;
      AV32GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV32GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32GridCurrentPage), 10, 0));
      AV33GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV33GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33GridPageCount), 10, 0));
      AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod = AV49TFAlbRecCod ;
      AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to = AV50TFAlbRecCod_To ;
      AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref = AV51TFAlbRef ;
      AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel = AV52TFAlbRef_Sel ;
      AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc = AV53TFAlbRefDsc ;
      AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel = AV54TFAlbRefDsc_Sel ;
      AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund = AV57TFDevCruUnd ;
      AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to = AV58TFDevCruUnd_To ;
      AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs = AV55TFDevCruPzs ;
      AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to = AV56TFDevCruPzs_To ;
      /*  Sending Event outputs  */
   }

   public void e112B42( )
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

   public void e122B42( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e132B42( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV43OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV43OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43OrderedBy), 4, 0));
         AV44OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV44OrderedDsc", AV44OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S132 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRecCod") == 0 )
         {
            AV49TFAlbRecCod = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFAlbRecCod), 8, 0));
            AV50TFAlbRecCod_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRef") == 0 )
         {
            AV51TFAlbRef = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbRef", AV51TFAlbRef);
            AV52TFAlbRef_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbRef_Sel", AV52TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "AlbRefDsc") == 0 )
         {
            AV53TFAlbRefDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbRefDsc", AV53TFAlbRefDsc);
            AV54TFAlbRefDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbRefDsc_Sel", AV54TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruUnd") == 0 )
         {
            AV57TFDevCruUnd = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFDevCruUnd", GXutil.ltrimstr( AV57TFDevCruUnd, 9, 2));
            AV58TFDevCruUnd_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFDevCruUnd_To", GXutil.ltrimstr( AV58TFDevCruUnd_To, 9, 2));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "DevCruPzs") == 0 )
         {
            AV55TFDevCruPzs = (int)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFDevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFDevCruPzs), 6, 0));
            AV56TFDevCruPzs_To = (int)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFDevCruPzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFDevCruPzs_To), 6, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e242B42( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactions.removeAllItems();
      cmbavGridactions.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactions.addItem("1", httpContext.getMessage( "Eliminar", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(115) ;
      }
      sendrow_1152( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_115_Refreshing )
      {
         httpContext.doAjaxLoad(115, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV31GridActions, 4, 0)) );
   }

   public void e142B42( )
   {
      /* Dvelop_confirmpanel_eliminar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_eliminar_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ELIMINAR' */
         S162 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e152B42( )
   {
      /* 'Dohashcomunicarat' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.almacensindetalle.devoluciontejido_fechahorasalida_xml_envio_at", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV23DevCruId,8,0)),GXutil.URLEncode(GXutil.formatDateTimeParm(AV20DevCruDtSys)),GXutil.URLEncode(GXutil.rtrim(AV67Hash))}, new String[] {"EmprCod","DevCruId","DevCruDtSys","Hash"}) , new Object[] {});
      httpContext.setWebReturnParms(new Object[] {});
      httpContext.setWebReturnParmsMetadata(new Object[] {});
      httpContext.wjLocDisableFrm = (byte)(1) ;
      httpContext.nUserReturn = (byte)(1) ;
      returnInSub = true;
      if (true) return;
   }

   public void e162B42( )
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

   public void e172B42( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.consultaalmacentejido", new String[] {GXutil.URLEncode(GXutil.rtrim(AV28EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV7AlbRecCod,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV16CliCod,6,0)),GXutil.URLEncode(GXutil.rtrim("")),GXutil.URLEncode(GXutil.rtrim(""))}, new String[] {"InOutEmprCod","InOutAlbRecCod","CliCod","OutAlbRUniDis","OutAlbRPieDis"}) , new Object[] {"AV28EmprCod","AV7AlbRecCod","AV16CliCod","",""});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S132( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV43OrderedBy, 4, 0))+":"+(AV44OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S152( )
   {
      /* 'DO ELIMINAR' Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV21DevCruEnvA == 3 ) || ( GXutil.strcmp(AV19DevCruAtId, " ") != 0 ) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Guia comunicada", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      }
      else
      {
         AV82Emprcod_selected = A396EmprCod ;
         AV83Devcruid_selected = A11669DevCruId ;
         AV84Albreccod_selected = A44AlbRecCod ;
         this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ELIMINARContainer", "Confirm", "", new Object[] {});
      }
   }

   public void S162( )
   {
      /* 'DO ACTION ELIMINAR' Routine */
      returnInSub = false ;
      new app.almacensindetalle.devoluciontejido_del(remoteHandle, context).execute( AV28EmprCod, A44AlbRecCod, AV23DevCruId) ;
      httpContext.doAjaxRefresh();
   }

   public void S122( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV48Session.getValue(AV71Pgmname+"GridState"), "") == 0 )
      {
         AV34GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV71Pgmname+"GridState"), null, null);
      }
      else
      {
         AV34GridState.fromxml(AV48Session.getValue(AV71Pgmname+"GridState"), null, null);
      }
      AV43OrderedBy = AV34GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV43OrderedBy), 4, 0));
      AV44OrderedDsc = AV34GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV44OrderedDsc", AV44OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S132 ();
      if (returnInSub) return;
      AV85GXV1 = 1 ;
      while ( AV85GXV1 <= AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV35GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV85GXV1));
         if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBRECCOD") == 0 )
         {
            AV49TFAlbRecCod = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV49TFAlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV49TFAlbRecCod), 8, 0));
            AV50TFAlbRecCod_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV50TFAlbRecCod_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50TFAlbRecCod_To), 8, 0));
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF") == 0 )
         {
            AV51TFAlbRef = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51TFAlbRef", AV51TFAlbRef);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREF_SEL") == 0 )
         {
            AV52TFAlbRef_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV52TFAlbRef_Sel", AV52TFAlbRef_Sel);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC") == 0 )
         {
            AV53TFAlbRefDsc = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV53TFAlbRefDsc", AV53TFAlbRefDsc);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFALBREFDSC_SEL") == 0 )
         {
            AV54TFAlbRefDsc_Sel = AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV54TFAlbRefDsc_Sel", AV54TFAlbRefDsc_Sel);
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUUND") == 0 )
         {
            AV57TFDevCruUnd = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV57TFDevCruUnd", GXutil.ltrimstr( AV57TFDevCruUnd, 9, 2));
            AV58TFDevCruUnd_To = CommonUtil.decimalVal( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV58TFDevCruUnd_To", GXutil.ltrimstr( AV58TFDevCruUnd_To, 9, 2));
         }
         else if ( GXutil.strcmp(AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFDEVCRUPZS") == 0 )
         {
            AV55TFDevCruPzs = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV55TFDevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55TFDevCruPzs), 6, 0));
            AV56TFDevCruPzs_To = (int)(GXutil.lval( AV35GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV56TFDevCruPzs_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56TFDevCruPzs_To), 6, 0));
         }
         AV85GXV1 = (int)(AV85GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char4[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV52TFAlbRef_Sel)==0), AV52TFAlbRef_Sel, GXv_char4) ;
      devoluciontejido_8_impl.this.GXt_char1 = GXv_char4[0] ;
      GXt_char8 = "" ;
      GXv_char3[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV54TFAlbRefDsc_Sel)==0), AV54TFAlbRefDsc_Sel, GXv_char3) ;
      devoluciontejido_8_impl.this.GXt_char8 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char8+"||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char8 = "" ;
      GXv_char4[0] = GXt_char8 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV51TFAlbRef)==0), AV51TFAlbRef, GXv_char4) ;
      devoluciontejido_8_impl.this.GXt_char8 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV53TFAlbRefDsc)==0), AV53TFAlbRefDsc, GXv_char3) ;
      devoluciontejido_8_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV49TFAlbRecCod) ? "" : GXutil.str( AV49TFAlbRecCod, 8, 0))+"|"+GXt_char8+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFDevCruUnd)==0) ? "" : GXutil.str( AV57TFDevCruUnd, 9, 2))+"|"+((0==AV55TFDevCruPzs) ? "" : GXutil.str( AV55TFDevCruPzs, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV50TFAlbRecCod_To) ? "" : GXutil.str( AV50TFAlbRecCod_To, 8, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFDevCruUnd_To)==0) ? "" : GXutil.str( AV58TFDevCruUnd_To, 9, 2))+"|"+((0==AV56TFDevCruPzs_To) ? "" : GXutil.str( AV56TFDevCruPzs_To, 6, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV34GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV34GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV34GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S142( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV34GridState.fromxml(AV48Session.getValue(AV71Pgmname+"GridState"), null, null);
      AV34GridState.setgxTv_SdtWWPGridState_Orderedby( AV43OrderedBy );
      AV34GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV44OrderedDsc );
      AV34GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState9[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFALBRECCOD", "", !((0==AV49TFAlbRecCod)&&(0==AV50TFAlbRecCod_To)), (short)(0), GXutil.trim( GXutil.str( AV49TFAlbRecCod, 8, 0)), GXutil.trim( GXutil.str( AV50TFAlbRecCod_To, 8, 0))) ;
      AV34GridState = GXv_SdtWWPGridState9[0] ;
      GXv_SdtWWPGridState9[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFALBREF", "", !(GXutil.strcmp("", AV51TFAlbRef)==0), (short)(0), AV51TFAlbRef, "", !(GXutil.strcmp("", AV52TFAlbRef_Sel)==0), AV52TFAlbRef_Sel, "") ;
      AV34GridState = GXv_SdtWWPGridState9[0] ;
      GXv_SdtWWPGridState9[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFALBREFDSC", "", !(GXutil.strcmp("", AV53TFAlbRefDsc)==0), (short)(0), AV53TFAlbRefDsc, "", !(GXutil.strcmp("", AV54TFAlbRefDsc_Sel)==0), AV54TFAlbRefDsc_Sel, "") ;
      AV34GridState = GXv_SdtWWPGridState9[0] ;
      GXv_SdtWWPGridState9[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFDEVCRUUND", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV57TFDevCruUnd)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV58TFDevCruUnd_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV57TFDevCruUnd, 9, 2)), GXutil.trim( GXutil.str( AV58TFDevCruUnd_To, 9, 2))) ;
      AV34GridState = GXv_SdtWWPGridState9[0] ;
      GXv_SdtWWPGridState9[0] = AV34GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState9, "TFDEVCRUPZS", "", !((0==AV55TFDevCruPzs)&&(0==AV56TFDevCruPzs_To)), (short)(0), GXutil.trim( GXutil.str( AV55TFDevCruPzs, 6, 0)), GXutil.trim( GXutil.str( AV56TFDevCruPzs_To, 6, 0))) ;
      AV34GridState = GXv_SdtWWPGridState9[0] ;
      AV34GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV34GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV71Pgmname+"GridState", AV34GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S112( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV59TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV59TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV71Pgmname );
      AV59TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV59TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV36HTTPRequest.getScriptName()+"?"+AV36HTTPRequest.getQuerystring() );
      AV59TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "AlmacenSinDetalle.DevolucionTejido_TRN" );
      AV48Session.setValue("TrnContext", AV59TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void e182B42( )
   {
      /* Albreccod_Controlvaluechanged Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (0==AV7AlbRecCod) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Codigo NO valido", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavAlbreccod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXv_int10[0] = AV24DevCruPzs ;
         GXv_decimal11[0] = AV26DevCruUnd ;
         GXv_char4[0] = AV5Albruni ;
         GXv_int12[0] = AV25DevCrupzsold ;
         GXv_decimal13[0] = AV27devcruUndold ;
         GXv_char3[0] = AV8AlbRef ;
         GXv_char2[0] = AV9AlbRefDsc ;
         GXv_decimal14[0] = AV14AlbRUniEnt ;
         GXv_decimal15[0] = AV15AlbRUniUti ;
         GXv_int16[0] = AV11AlbRPieEnt ;
         GXv_int17[0] = AV12AlbRPieUti ;
         GXv_int18[0] = AV65ALbrec ;
         GXv_int19[0] = AV66DevCru ;
         GXv_int20[0] = AV17CliCodAlbrec ;
         new app.almacensindetalle.obtengodatosdevoluciontejido(remoteHandle, context).execute( AV28EmprCod, AV7AlbRecCod, AV23DevCruId, GXv_int10, GXv_decimal11, GXv_char4, GXv_int12, GXv_decimal13, GXv_char3, GXv_char2, GXv_decimal14, GXv_decimal15, GXv_int16, GXv_int17, GXv_int18, GXv_int19, GXv_int20) ;
         devoluciontejido_8_impl.this.AV24DevCruPzs = GXv_int10[0] ;
         devoluciontejido_8_impl.this.AV26DevCruUnd = GXv_decimal11[0] ;
         devoluciontejido_8_impl.this.AV5Albruni = GXv_char4[0] ;
         devoluciontejido_8_impl.this.AV25DevCrupzsold = GXv_int12[0] ;
         devoluciontejido_8_impl.this.AV27devcruUndold = GXv_decimal13[0] ;
         devoluciontejido_8_impl.this.AV8AlbRef = GXv_char3[0] ;
         devoluciontejido_8_impl.this.AV9AlbRefDsc = GXv_char2[0] ;
         devoluciontejido_8_impl.this.AV14AlbRUniEnt = GXv_decimal14[0] ;
         devoluciontejido_8_impl.this.AV15AlbRUniUti = GXv_decimal15[0] ;
         devoluciontejido_8_impl.this.AV11AlbRPieEnt = GXv_int16[0] ;
         devoluciontejido_8_impl.this.AV12AlbRPieUti = GXv_int17[0] ;
         devoluciontejido_8_impl.this.AV65ALbrec = GXv_int18[0] ;
         devoluciontejido_8_impl.this.AV66DevCru = GXv_int19[0] ;
         devoluciontejido_8_impl.this.AV17CliCodAlbrec = GXv_int20[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24DevCruPzs), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26DevCruUnd", GXutil.ltrimstr( AV26DevCruUnd, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV25DevCrupzsold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DevCrupzsold), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27devcruUndold", GXutil.ltrimstr( AV27devcruUndold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV8AlbRef", AV8AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRefDsc", AV9AlbRefDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV14AlbRUniEnt", GXutil.ltrimstr( AV14AlbRUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRUniUti", GXutil.ltrimstr( AV15AlbRUniUti, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPieEnt), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AlbRPieUti), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV66DevCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66DevCru), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17CliCodAlbrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliCodAlbrec), 6, 0));
         AV13AlbRUniDis = AV14AlbRUniEnt.subtract(AV15AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUniDis", GXutil.ltrimstr( AV13AlbRUniDis, 9, 2));
         AV10AlbRPieDis = (int)(AV11AlbRPieEnt-AV12AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbRPieDis), 6, 0));
         if ( AV65ALbrec == 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Nº Recepcion Inexistente", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV16CliCod != AV17CliCodAlbrec )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Cliente ", "")+GXutil.trim( GXutil.str( AV16CliCod, 6, 0))+httpContext.getMessage( " diferente a cliente entrada ", "")+GXutil.trim( GXutil.str( AV17CliCodAlbrec, 6, 0)) ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               httpContext.doAjaxRefresh();
               GX_FocusControl = edtavAlbreccod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e252B42( )
   {
      /* AlbRecCod_Click Routine */
      returnInSub = false ;
      AV7AlbRecCod = A44AlbRecCod ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbRecCod), 8, 0));
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( (0==AV7AlbRecCod) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Codigo NO valido", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavAlbreccod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         GXv_int20[0] = AV24DevCruPzs ;
         GXv_decimal15[0] = AV26DevCruUnd ;
         GXv_char4[0] = AV5Albruni ;
         GXv_int17[0] = AV25DevCrupzsold ;
         GXv_decimal14[0] = AV27devcruUndold ;
         GXv_char3[0] = AV8AlbRef ;
         GXv_char2[0] = AV9AlbRefDsc ;
         GXv_decimal13[0] = AV14AlbRUniEnt ;
         GXv_decimal11[0] = AV15AlbRUniUti ;
         GXv_int16[0] = AV11AlbRPieEnt ;
         GXv_int12[0] = AV12AlbRPieUti ;
         GXv_int19[0] = AV65ALbrec ;
         GXv_int18[0] = AV66DevCru ;
         GXv_int10[0] = AV17CliCodAlbrec ;
         new app.almacensindetalle.obtengodatosdevoluciontejido(remoteHandle, context).execute( AV28EmprCod, AV7AlbRecCod, AV23DevCruId, GXv_int20, GXv_decimal15, GXv_char4, GXv_int17, GXv_decimal14, GXv_char3, GXv_char2, GXv_decimal13, GXv_decimal11, GXv_int16, GXv_int12, GXv_int19, GXv_int18, GXv_int10) ;
         devoluciontejido_8_impl.this.AV24DevCruPzs = GXv_int20[0] ;
         devoluciontejido_8_impl.this.AV26DevCruUnd = GXv_decimal15[0] ;
         devoluciontejido_8_impl.this.AV5Albruni = GXv_char4[0] ;
         devoluciontejido_8_impl.this.AV25DevCrupzsold = GXv_int17[0] ;
         devoluciontejido_8_impl.this.AV27devcruUndold = GXv_decimal14[0] ;
         devoluciontejido_8_impl.this.AV8AlbRef = GXv_char3[0] ;
         devoluciontejido_8_impl.this.AV9AlbRefDsc = GXv_char2[0] ;
         devoluciontejido_8_impl.this.AV14AlbRUniEnt = GXv_decimal13[0] ;
         devoluciontejido_8_impl.this.AV15AlbRUniUti = GXv_decimal11[0] ;
         devoluciontejido_8_impl.this.AV11AlbRPieEnt = GXv_int16[0] ;
         devoluciontejido_8_impl.this.AV12AlbRPieUti = GXv_int12[0] ;
         devoluciontejido_8_impl.this.AV65ALbrec = GXv_int19[0] ;
         devoluciontejido_8_impl.this.AV66DevCru = GXv_int18[0] ;
         devoluciontejido_8_impl.this.AV17CliCodAlbrec = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24DevCruPzs), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV26DevCruUnd", GXutil.ltrimstr( AV26DevCruUnd, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV25DevCrupzsold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DevCrupzsold), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV27devcruUndold", GXutil.ltrimstr( AV27devcruUndold, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV8AlbRef", AV8AlbRef);
         httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRefDsc", AV9AlbRefDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV14AlbRUniEnt", GXutil.ltrimstr( AV14AlbRUniEnt, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRUniUti", GXutil.ltrimstr( AV15AlbRUniUti, 9, 2));
         httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPieEnt), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AlbRPieUti), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV66DevCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66DevCru), 4, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV17CliCodAlbrec", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV17CliCodAlbrec), 6, 0));
         AV13AlbRUniDis = AV14AlbRUniEnt.subtract(AV15AlbRUniUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUniDis", GXutil.ltrimstr( AV13AlbRUniDis, 9, 2));
         AV10AlbRPieDis = (int)(AV11AlbRPieEnt-AV12AlbRPieUti) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbRPieDis), 6, 0));
         if ( AV65ALbrec == 0 )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Nº Recepcion Inexistente", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            httpContext.doAjaxRefresh();
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV16CliCod != AV17CliCodAlbrec )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Cliente ", "")+GXutil.trim( GXutil.str( AV16CliCod, 6, 0))+httpContext.getMessage( " diferente a cliente entrada ", "")+GXutil.trim( GXutil.str( AV17CliCodAlbrec, 6, 0)) ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               httpContext.doAjaxRefresh();
               GX_FocusControl = edtavAlbreccod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
         }
         GX_FocusControl = edtavDevcruund_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void e192B42( )
   {
      /* Devcruund_Controlvaluechanged Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      AV86Albruniuti2 = AV15AlbRUniUti.add(AV26DevCruUnd).subtract(AV27devcruUndold) ;
      AV64Unidadesdisp = AV14AlbRUniEnt.subtract(AV86Albruniuti2) ;
      if ( AV64Unidadesdisp.doubleValue() < 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Unidades ", "")+GXutil.trim( GXutil.str( AV26DevCruUnd, 9, 2))+httpContext.getMessage( " superior a disponible ", "")+GXutil.trim( GXutil.str( AV64Unidadesdisp, 9, 2)) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavDevcruund_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e202B42( )
   {
      /* Devcrupzs_Controlvaluechanged Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      AV87Albrpieuti2 = (int)(AV12AlbRPieUti+AV24DevCruPzs-AV25DevCrupzsold) ;
      AV46Piezasdisp = (int)(AV11AlbRPieEnt-AV87Albrpieuti2) ;
      if ( AV46Piezasdisp < 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Piezas ", "")+GXutil.trim( GXutil.str( AV24DevCruPzs, 6, 0))+httpContext.getMessage( " superior a disponible ", "")+GXutil.trim( GXutil.str( AV46Piezasdisp, 6, 0)) ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         httpContext.doAjaxRefresh();
         GX_FocusControl = edtavDevcrupzs_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e212B42 ();
      if (returnInSub) return;
   }

   public void e212B42( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( ( AV21DevCruEnvA == 3 ) || ( GXutil.strcmp(AV19DevCruAtId, " ") != 0 ) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Guia comunicada", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavAlbreccod_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV7AlbRecCod) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "NO hay Nº Recepcion", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavAlbreccod_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( AV16CliCod != AV17CliCodAlbrec )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Cliente ", "")+GXutil.trim( GXutil.str( AV16CliCod, 6, 0))+httpContext.getMessage( " diferente a cliente entrada ", "")+GXutil.trim( GXutil.str( AV17CliCodAlbrec, 6, 0)) ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavAlbreccod_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               AV86Albruniuti2 = AV15AlbRUniUti.add(AV26DevCruUnd).subtract(AV27devcruUndold) ;
               AV64Unidadesdisp = AV14AlbRUniEnt.subtract(AV86Albruniuti2) ;
               if ( AV64Unidadesdisp.doubleValue() < 0 )
               {
                  lblTbmessage_Caption = httpContext.getMessage( "Unidades ", "")+GXutil.trim( GXutil.str( AV26DevCruUnd, 9, 2))+httpContext.getMessage( " superior a disponible ", "")+GXutil.trim( GXutil.str( AV64Unidadesdisp, 9, 2)) ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = edtavDevcruund_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  AV87Albrpieuti2 = (int)(AV12AlbRPieUti+AV24DevCruPzs-AV25DevCrupzsold) ;
                  AV46Piezasdisp = (int)(AV11AlbRPieEnt-AV87Albrpieuti2) ;
                  if ( AV46Piezasdisp < 0 )
                  {
                     lblTbmessage_Caption = httpContext.getMessage( "Piezas ", "")+GXutil.trim( GXutil.str( AV24DevCruPzs, 6, 0))+httpContext.getMessage( " superior a disponible ", "")+GXutil.trim( GXutil.str( AV46Piezasdisp, 6, 0)) ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     GX_FocusControl = edtavDevcrupzs_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV26DevCruUnd)==0) )
                     {
                        lblTbmessage_Caption = httpContext.getMessage( "Unidades incorrectas", "") ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        GX_FocusControl = edtavDevcruund_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        new app.almacensindetalle.devoluciontejido_ins_upd(remoteHandle, context).execute( AV28EmprCod, AV7AlbRecCod, AV23DevCruId, AV24DevCruPzs, AV26DevCruUnd, AV25DevCrupzsold, AV27devcruUndold, AV66DevCru) ;
                        AV65ALbrec = (short)(0) ;
                        AV66DevCru = (short)(0) ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV66DevCru", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV66DevCru), 4, 0));
                        AV7AlbRecCod = 0 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV7AlbRecCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7AlbRecCod), 8, 0));
                        AV24DevCruPzs = 0 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV24DevCruPzs", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24DevCruPzs), 6, 0));
                        AV26DevCruUnd = DecimalUtil.ZERO ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV26DevCruUnd", GXutil.ltrimstr( AV26DevCruUnd, 9, 2));
                        AV5Albruni = "" ;
                        AV25DevCrupzsold = 0 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV25DevCrupzsold", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV25DevCrupzsold), 6, 0));
                        AV27devcruUndold = DecimalUtil.ZERO ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV27devcruUndold", GXutil.ltrimstr( AV27devcruUndold, 9, 2));
                        AV8AlbRef = "" ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV8AlbRef", AV8AlbRef);
                        AV9AlbRefDsc = "" ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV9AlbRefDsc", AV9AlbRefDsc);
                        AV14AlbRUniEnt = DecimalUtil.ZERO ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV14AlbRUniEnt", GXutil.ltrimstr( AV14AlbRUniEnt, 9, 2));
                        AV15AlbRUniUti = DecimalUtil.ZERO ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV15AlbRUniUti", GXutil.ltrimstr( AV15AlbRUniUti, 9, 2));
                        AV11AlbRPieEnt = 0 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV11AlbRPieEnt", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11AlbRPieEnt), 6, 0));
                        AV12AlbRPieUti = 0 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV12AlbRPieUti", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12AlbRPieUti), 6, 0));
                        AV13AlbRUniDis = DecimalUtil.ZERO ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV13AlbRUniDis", GXutil.ltrimstr( AV13AlbRUniDis, 9, 2));
                        AV10AlbRPieDis = 0 ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV10AlbRPieDis", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10AlbRPieDis), 6, 0));
                        GX_FocusControl = edtavAlbreccod_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                        httpContext.doAjaxRefresh();
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void wb_table1_136_2B42( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_eliminar_Internalname, tblTabledvelop_confirmpanel_eliminar_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_eliminar.setProperty("Title", Dvelop_confirmpanel_eliminar_Title);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmationText", Dvelop_confirmpanel_eliminar_Confirmationtext);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonCaption", Dvelop_confirmpanel_eliminar_Yesbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("NoButtonCaption", Dvelop_confirmpanel_eliminar_Nobuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("CancelButtonCaption", Dvelop_confirmpanel_eliminar_Cancelbuttoncaption);
         ucDvelop_confirmpanel_eliminar.setProperty("YesButtonPosition", Dvelop_confirmpanel_eliminar_Yesbuttonposition);
         ucDvelop_confirmpanel_eliminar.setProperty("ConfirmType", Dvelop_confirmpanel_eliminar_Confirmtype);
         ucDvelop_confirmpanel_eliminar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_eliminar_Internalname, "DVELOP_CONFIRMPANEL_ELIMINARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ELIMINARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_136_2B42e( true) ;
      }
      else
      {
         wb_table1_136_2B42e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV28EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28EmprCod", AV28EmprCod);
      AV23DevCruId = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV23DevCruId", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23DevCruId), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUID", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV23DevCruId), "ZZZZZZZ9")));
      AV22DevCruFec = (java.util.Date)getParm(obj,2) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV22DevCruFec", localUtil.format(AV22DevCruFec, "99/99/99"));
      AV21DevCruEnvA = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21DevCruEnvA", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV21DevCruEnvA), 4, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUENVA", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV21DevCruEnvA), "ZZZ9")));
      AV19DevCruAtId = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV19DevCruAtId", AV19DevCruAtId);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUATID", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV19DevCruAtId, ""))));
      AV16CliCod = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CliCod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV16CliCod), 6, 0));
      AV20DevCruDtSys = (java.util.Date)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20DevCruDtSys", localUtil.ttoc( AV20DevCruDtSys, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vDEVCRUDTSYS", getSecureSignedToken( "", localUtil.format( AV20DevCruDtSys, "99/99/99 99:99")));
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
      pa2B42( ) ;
      ws2B42( ) ;
      we2B42( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116152192", true, true);
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
      httpContext.AddJavascriptSource("almacensindetalle/devoluciontejido_8.js", "?202682116152192", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/DVPaginationBar/DVPaginationBarRender.js", "", false, true);
      httpContext.AddJavascriptSource("UserControls/DatamonJSRender.js", "", false, true);
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

   public void subsflControlProps_1152( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_115_idx );
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_115_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_115_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_115_idx ;
      edtDevCruUnd_Internalname = "DEVCRUUND_"+sGXsfl_115_idx ;
      edtDevCruPzs_Internalname = "DEVCRUPZS_"+sGXsfl_115_idx ;
   }

   public void subsflControlProps_fel_1152( )
   {
      cmbavGridactions.setInternalname( "vGRIDACTIONS_"+sGXsfl_115_fel_idx );
      edtAlbRecCod_Internalname = "ALBRECCOD_"+sGXsfl_115_fel_idx ;
      edtAlbRef_Internalname = "ALBREF_"+sGXsfl_115_fel_idx ;
      edtAlbRefDsc_Internalname = "ALBREFDSC_"+sGXsfl_115_fel_idx ;
      edtDevCruUnd_Internalname = "DEVCRUUND_"+sGXsfl_115_fel_idx ;
      edtDevCruPzs_Internalname = "DEVCRUPZS_"+sGXsfl_115_fel_idx ;
   }

   public void sendrow_1152( )
   {
      subsflControlProps_1152( ) ;
      wb2B40( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_115_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_115_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_115_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 116,'',false,'"+sGXsfl_115_idx+"',115)\"" : " ") ;
         if ( ( cmbavGridactions.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONS_" + sGXsfl_115_idx ;
            cmbavGridactions.setName( GXCCtl );
            cmbavGridactions.setWebtags( "" );
            if ( cmbavGridactions.getItemCount() > 0 )
            {
               AV31GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV31GridActions, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridActions), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactions,cmbavGridactions.getInternalname(),GXutil.trim( GXutil.str( AV31GridActions, 4, 0)),Integer.valueOf(1),cmbavGridactions.getJsonclick(),Integer.valueOf(7),"'"+""+"'"+",false,"+"'"+"e262b42_client"+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactions.getEnabled()!=0)&&(cmbavGridactions.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,116);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactions.setValue( GXutil.trim( GXutil.str( AV31GridActions, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactions.getInternalname(), "Values", cmbavGridactions.ToJavascriptSource(), !bGXsfl_115_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRecCod_Internalname,GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A44AlbRecCod), "ZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"EALBRECCOD.CLICK."+sGXsfl_115_idx+"'","","","","",edtAlbRecCod_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(8),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRef_Internalname,GXutil.rtrim( A45AlbRef),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRef_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(16),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtAlbRefDsc_Internalname,GXutil.rtrim( A3613AlbRefDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtAlbRefDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruUnd_Internalname,GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A11683DevCruUnd, "ZZZZZ9.99")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruUnd_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(9),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtDevCruPzs_Internalname,GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A11684DevCruPzs), "ZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtDevCruPzs_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(115),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes2B42( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_115_idx = ((subGrid_Islastpage==1)&&(nGXsfl_115_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_115_idx+1) ;
         sGXsfl_115_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_115_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_1152( ) ;
      }
      /* End function sendrow_1152 */
   }

   public void startgridcontrol115( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"115\">") ;
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
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"ConvertToDDO"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( "") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "N Recepcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Referencia", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Piezas", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV31GridActions, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A44AlbRecCod, (byte)(8), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A45AlbRef));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A3613AlbRefDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11683DevCruUnd, (byte)(9), (byte)(2), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A11684DevCruPzs, (byte)(6), (byte)(0), ".", "")));
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
      edtavAlbreccod_Internalname = "vALBRECCOD" ;
      imgUseraction1_Internalname = "USERACTION1" ;
      edtavAlbref_Internalname = "vALBREF" ;
      edtavAlbrefdsc_Internalname = "vALBREFDSC" ;
      edtavDevcruund_Internalname = "vDEVCRUUND" ;
      edtavAlbrunidis_Internalname = "vALBRUNIDIS" ;
      edtavDevcrupzs_Internalname = "vDEVCRUPZS" ;
      edtavAlbrpiedis_Internalname = "vALBRPIEDIS" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtnhashcomunicarat_Internalname = "BTNHASHCOMUNICARAT" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      edtavAlbrunient_Internalname = "vALBRUNIENT" ;
      edtavAlbruniuti_Internalname = "vALBRUNIUTI" ;
      edtavAlbrpieent_Internalname = "vALBRPIEENT" ;
      edtavAlbrpieuti_Internalname = "vALBRPIEUTI" ;
      edtavDevcruundold_Internalname = "vDEVCRUUNDOLD" ;
      edtavDevcrupzsold_Internalname = "vDEVCRUPZSOLD" ;
      edtavClicodalbrec_Internalname = "vCLICODALBREC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      cmbavGridactions.setInternalname( "vGRIDACTIONS" );
      edtAlbRecCod_Internalname = "ALBRECCOD" ;
      edtAlbRef_Internalname = "ALBREF" ;
      edtAlbRefDsc_Internalname = "ALBREFDSC" ;
      edtDevCruUnd_Internalname = "DEVCRUUND" ;
      edtDevCruPzs_Internalname = "DEVCRUPZS" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_eliminar_Internalname = "DVELOP_CONFIRMPANEL_ELIMINAR" ;
      tblTabledvelop_confirmpanel_eliminar_Internalname = "TABLEDVELOP_CONFIRMPANEL_ELIMINAR" ;
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
      edtDevCruPzs_Jsonclick = "" ;
      edtDevCruUnd_Jsonclick = "" ;
      edtAlbRefDsc_Jsonclick = "" ;
      edtAlbRef_Jsonclick = "" ;
      edtAlbRecCod_Jsonclick = "" ;
      cmbavGridactions.setJsonclick( "" );
      cmbavGridactions.setVisible( -1 );
      cmbavGridactions.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      subGrid_Sortable = (byte)(0) ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      edtavClicodalbrec_Jsonclick = "" ;
      edtavClicodalbrec_Enabled = 1 ;
      edtavDevcrupzsold_Jsonclick = "" ;
      edtavDevcrupzsold_Enabled = 1 ;
      edtavDevcruundold_Jsonclick = "" ;
      edtavDevcruundold_Enabled = 1 ;
      edtavAlbrpieuti_Jsonclick = "" ;
      edtavAlbrpieuti_Enabled = 1 ;
      edtavAlbrpieent_Jsonclick = "" ;
      edtavAlbrpieent_Enabled = 1 ;
      edtavAlbruniuti_Jsonclick = "" ;
      edtavAlbruniuti_Enabled = 1 ;
      edtavAlbrunient_Jsonclick = "" ;
      edtavAlbrunient_Enabled = 1 ;
      bttBtnhashcomunicarat_Enabled = 1 ;
      bttBtnenter_Enabled = 1 ;
      edtavAlbrpiedis_Jsonclick = "" ;
      edtavAlbrpiedis_Enabled = 1 ;
      edtavDevcrupzs_Jsonclick = "" ;
      edtavDevcrupzs_Enabled = 1 ;
      edtavAlbrunidis_Jsonclick = "" ;
      edtavAlbrunidis_Enabled = 1 ;
      edtavDevcruund_Jsonclick = "" ;
      edtavDevcruund_Enabled = 1 ;
      edtavAlbrefdsc_Jsonclick = "" ;
      edtavAlbrefdsc_Enabled = 1 ;
      edtavAlbref_Jsonclick = "" ;
      edtavAlbref_Enabled = 1 ;
      edtavAlbreccod_Jsonclick = "" ;
      edtavAlbreccod_Enabled = 1 ;
      edtavClinom_Jsonclick = "" ;
      edtavClinom_Enabled = 1 ;
      edtavClicod_Jsonclick = "" ;
      edtavClicod_Enabled = 0 ;
      Grid_empowerer_Fixedcolumns = "L;;;;;" ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_eliminar_Confirmtype = "1" ;
      Dvelop_confirmpanel_eliminar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_eliminar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_eliminar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_eliminar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_eliminar_Confirmationtext = "¿Desea eliminar la linea?" ;
      Dvelop_confirmpanel_eliminar_Title = "" ;
      Ddo_grid_Datalistproc = "AlmacenSinDetalle.DevolucionTejido_8GetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic||" ;
      Ddo_grid_Includedatalist = "|T|T||" ;
      Ddo_grid_Filterisrange = "T|||T|T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6" ;
      Ddo_grid_Columnids = "1:AlbRecCod|2:AlbRef|3:AlbRefDsc|4:DevCruUnd|5:DevCruPzs" ;
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
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = "" ;
      Dvpanel_unnamedtable2_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable2_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Width = "100%" ;
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
      Form.setCaption( httpContext.getMessage( " Devolucion de Tejido", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONS_" + sGXsfl_115_idx ;
      cmbavGridactions.setName( GXCCtl );
      cmbavGridactions.setWebtags( "" );
      if ( cmbavGridactions.getItemCount() > 0 )
      {
         AV31GridActions = (short)(GXutil.lval( cmbavGridactions.getValidValue(GXutil.trim( GXutil.str( AV31GridActions, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactions.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV31GridActions), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV71Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e112B42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV71Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e122B42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV71Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e132B42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV71Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e242B42',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactions'},{av:'AV31GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONS.CLICK","{handler:'e262B42',iparms:[{av:'cmbavGridactions'},{av:'AV31GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VGRIDACTIONS.CLICK",",oparms:[{av:'cmbavGridactions'},{av:'AV31GridActions',fld:'vGRIDACTIONS',pic:'ZZZ9'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE","{handler:'e142B42',iparms:[{av:'Dvelop_confirmpanel_eliminar_Result',ctrl:'DVELOP_CONFIRMPANEL_ELIMINAR',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV71Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ELIMINAR.CLOSE",",oparms:[{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("'DOHASHCOMUNICARAT'","{handler:'e152B42',iparms:[{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true}]");
      setEventMetadata("'DOHASHCOMUNICARAT'",",oparms:[]}");
      setEventMetadata("'DOCERRAR'","{handler:'e162B42',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e172B42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV71Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV7AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV7AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED","{handler:'e182B42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV71Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV7AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("VALBRECCOD.CONTROLVALUECHANGED",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV17CliCodAlbrec',fld:'vCLICODALBREC',pic:'ZZZZZ9'},{av:'AV66DevCru',fld:'vDEVCRU',pic:'ZZZ9'},{av:'AV12AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV11AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV15AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV14AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV9AlbRefDsc',fld:'vALBREFDSC',pic:''},{av:'AV8AlbRef',fld:'vALBREF',pic:''},{av:'AV27devcruUndold',fld:'vDEVCRUUNDOLD',pic:'ZZZZZ9.99'},{av:'AV25DevCrupzsold',fld:'vDEVCRUPZSOLD',pic:'ZZZZZ9'},{av:'AV26DevCruUnd',fld:'vDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV24DevCruPzs',fld:'vDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV13AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV10AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("ALBRECCOD.CLICK","{handler:'e252B42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV71Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'A44AlbRecCod',fld:'ALBRECCOD',pic:'ZZZZZZZ9',hsh:true},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'}]");
      setEventMetadata("ALBRECCOD.CLICK",",oparms:[{av:'AV7AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV17CliCodAlbrec',fld:'vCLICODALBREC',pic:'ZZZZZ9'},{av:'AV66DevCru',fld:'vDEVCRU',pic:'ZZZ9'},{av:'AV12AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV11AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV15AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV14AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV9AlbRefDsc',fld:'vALBREFDSC',pic:''},{av:'AV8AlbRef',fld:'vALBREF',pic:''},{av:'AV27devcruUndold',fld:'vDEVCRUUNDOLD',pic:'ZZZZZ9.99'},{av:'AV25DevCrupzsold',fld:'vDEVCRUPZSOLD',pic:'ZZZZZ9'},{av:'AV26DevCruUnd',fld:'vDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV24DevCruPzs',fld:'vDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV13AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV10AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VDEVCRUUND.CONTROLVALUECHANGED","{handler:'e192B42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV71Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV15AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV26DevCruUnd',fld:'vDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV27devcruUndold',fld:'vDEVCRUUNDOLD',pic:'ZZZZZ9.99'},{av:'AV14AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'}]");
      setEventMetadata("VDEVCRUUND.CONTROLVALUECHANGED",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VDEVCRUPZS.CONTROLVALUECHANGED","{handler:'e202B42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV71Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV12AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV24DevCruPzs',fld:'vDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV25DevCrupzsold',fld:'vDEVCRUPZSOLD',pic:'ZZZZZ9'},{av:'AV11AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'}]");
      setEventMetadata("VDEVCRUPZS.CONTROLVALUECHANGED",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e212B42',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV28EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV23DevCruId',fld:'vDEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV49TFAlbRecCod',fld:'vTFALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV50TFAlbRecCod_To',fld:'vTFALBRECCOD_TO',pic:'ZZZZZZZ9'},{av:'AV51TFAlbRef',fld:'vTFALBREF',pic:''},{av:'AV52TFAlbRef_Sel',fld:'vTFALBREF_SEL',pic:''},{av:'AV53TFAlbRefDsc',fld:'vTFALBREFDSC',pic:''},{av:'AV54TFAlbRefDsc_Sel',fld:'vTFALBREFDSC_SEL',pic:''},{av:'AV57TFDevCruUnd',fld:'vTFDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV58TFDevCruUnd_To',fld:'vTFDEVCRUUND_TO',pic:'ZZZZZ9.99'},{av:'AV55TFDevCruPzs',fld:'vTFDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV56TFDevCruPzs_To',fld:'vTFDEVCRUPZS_TO',pic:'ZZZZZ9'},{av:'AV71Pgmname',fld:'vPGMNAME',pic:''},{av:'AV43OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV44OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV21DevCruEnvA',fld:'vDEVCRUENVA',pic:'ZZZ9',hsh:true},{av:'AV19DevCruAtId',fld:'vDEVCRUATID',pic:'',hsh:true},{av:'AV20DevCruDtSys',fld:'vDEVCRUDTSYS',pic:'99/99/99 99:99',hsh:true},{av:'AV67Hash',fld:'vHASH',pic:'',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!',hsh:true},{av:'A11669DevCruId',fld:'DEVCRUID',pic:'ZZZZZZZ9',hsh:true},{av:'AV7AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV16CliCod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV17CliCodAlbrec',fld:'vCLICODALBREC',pic:'ZZZZZ9'},{av:'AV15AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV26DevCruUnd',fld:'vDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV27devcruUndold',fld:'vDEVCRUUNDOLD',pic:'ZZZZZ9.99'},{av:'AV14AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV12AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV24DevCruPzs',fld:'vDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV25DevCrupzsold',fld:'vDEVCRUPZSOLD',pic:'ZZZZZ9'},{av:'AV11AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV66DevCru',fld:'vDEVCRU',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV66DevCru',fld:'vDEVCRU',pic:'ZZZ9'},{av:'AV7AlbRecCod',fld:'vALBRECCOD',pic:'ZZZZZZZ9'},{av:'AV24DevCruPzs',fld:'vDEVCRUPZS',pic:'ZZZZZ9'},{av:'AV26DevCruUnd',fld:'vDEVCRUUND',pic:'ZZZZZ9.99'},{av:'AV25DevCrupzsold',fld:'vDEVCRUPZSOLD',pic:'ZZZZZ9'},{av:'AV27devcruUndold',fld:'vDEVCRUUNDOLD',pic:'ZZZZZ9.99'},{av:'AV8AlbRef',fld:'vALBREF',pic:''},{av:'AV9AlbRefDsc',fld:'vALBREFDSC',pic:''},{av:'AV14AlbRUniEnt',fld:'vALBRUNIENT',pic:'ZZZZZ9.99'},{av:'AV15AlbRUniUti',fld:'vALBRUNIUTI',pic:'ZZZZZ9.99'},{av:'AV11AlbRPieEnt',fld:'vALBRPIEENT',pic:'ZZZZZ9'},{av:'AV12AlbRPieUti',fld:'vALBRPIEUTI',pic:'ZZZZZ9'},{av:'AV13AlbRUniDis',fld:'vALBRUNIDIS',pic:'ZZZZZ9.99'},{av:'AV10AlbRPieDis',fld:'vALBRPIEDIS',pic:'ZZZZZ9'},{av:'AV32GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV33GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALID_ALBRECCOD","{handler:'valid_Albreccod',iparms:[]");
      setEventMetadata("VALID_ALBRECCOD",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Devcrupzs',iparms:[]");
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
      wcpOAV28EmprCod = "" ;
      wcpOAV22DevCruFec = GXutil.nullDate() ;
      wcpOAV19DevCruAtId = "" ;
      wcpOAV20DevCruDtSys = GXutil.resetTime( GXutil.nullDate() );
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Dvelop_confirmpanel_eliminar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV28EmprCod = "" ;
      AV22DevCruFec = GXutil.nullDate() ;
      AV19DevCruAtId = "" ;
      AV20DevCruDtSys = GXutil.resetTime( GXutil.nullDate() );
      AV51TFAlbRef = "" ;
      AV52TFAlbRef_Sel = "" ;
      AV53TFAlbRefDsc = "" ;
      AV54TFAlbRefDsc_Sel = "" ;
      AV57TFDevCruUnd = DecimalUtil.ZERO ;
      AV58TFDevCruUnd_To = DecimalUtil.ZERO ;
      AV71Pgmname = "" ;
      AV67Hash = "" ;
      A396EmprCod = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV18DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV82Emprcod_selected = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      AV68CliNom = "" ;
      ClassString = "" ;
      imgUseraction1_gximage = "" ;
      StyleString = "" ;
      sImgUrl = "" ;
      imgUseraction1_Jsonclick = "" ;
      AV8AlbRef = "" ;
      AV9AlbRefDsc = "" ;
      AV26DevCruUnd = DecimalUtil.ZERO ;
      AV13AlbRUniDis = DecimalUtil.ZERO ;
      bttBtnenter_Jsonclick = "" ;
      bttBtnhashcomunicarat_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      AV14AlbRUniEnt = DecimalUtil.ZERO ;
      AV15AlbRUniUti = DecimalUtil.ZERO ;
      AV27devcruUndold = DecimalUtil.ZERO ;
      lblTbmessage_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A45AlbRef = "" ;
      A3613AlbRefDsc = "" ;
      A11683DevCruUnd = DecimalUtil.ZERO ;
      scmdbuf = "" ;
      lV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref = "" ;
      lV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc = "" ;
      AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel = "" ;
      AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref = "" ;
      AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel = "" ;
      AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc = "" ;
      AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund = DecimalUtil.ZERO ;
      AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to = DecimalUtil.ZERO ;
      H02B42_A396EmprCod = new String[] {""} ;
      H02B42_A11669DevCruId = new int[1] ;
      H02B42_A11684DevCruPzs = new int[1] ;
      H02B42_A11683DevCruUnd = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H02B42_A3613AlbRefDsc = new String[] {""} ;
      H02B42_A45AlbRef = new String[] {""} ;
      H02B42_A44AlbRecCod = new int[1] ;
      H02B43_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV6Station = "" ;
      AV29EmprNom = "" ;
      AV61UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV62WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext7 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV48Session = httpContext.getWebSession();
      AV34GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV35GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char8 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState9 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV59TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV36HTTPRequest = httpContext.getHttpRequest();
      AV5Albruni = "" ;
      GXv_int20 = new int[1] ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_char4 = new String[1] ;
      GXv_int17 = new int[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_decimal11 = new java.math.BigDecimal[1] ;
      GXv_int16 = new int[1] ;
      GXv_int12 = new int[1] ;
      GXv_int19 = new short[1] ;
      GXv_int18 = new short[1] ;
      GXv_int10 = new int[1] ;
      AV86Albruniuti2 = DecimalUtil.ZERO ;
      AV64Unidadesdisp = DecimalUtil.ZERO ;
      ucDvelop_confirmpanel_eliminar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.almacensindetalle.devoluciontejido_8__default(),
         new Object[] {
             new Object[] {
            H02B42_A396EmprCod, H02B42_A11669DevCruId, H02B42_A11684DevCruPzs, H02B42_A11683DevCruUnd, H02B42_A3613AlbRefDsc, H02B42_A45AlbRef, H02B42_A44AlbRecCod
            }
            , new Object[] {
            H02B43_AGRID_nRecordCount
            }
         }
      );
      AV71Pgmname = "AlmacenSinDetalle.DevolucionTejido_8" ;
      /* GeneXus formulas. */
      AV71Pgmname = "AlmacenSinDetalle.DevolucionTejido_8" ;
      Gx_err = (short)(0) ;
      edtavClicod_Enabled = 0 ;
      edtavClinom_Enabled = 0 ;
      edtavAlbref_Enabled = 0 ;
      edtavAlbrefdsc_Enabled = 0 ;
      edtavAlbrunidis_Enabled = 0 ;
      edtavAlbrpiedis_Enabled = 0 ;
      edtavAlbrunient_Enabled = 0 ;
      edtavAlbruniuti_Enabled = 0 ;
      edtavAlbrpieent_Enabled = 0 ;
      edtavAlbrpieuti_Enabled = 0 ;
      edtavDevcruundold_Enabled = 0 ;
      edtavDevcrupzsold_Enabled = 0 ;
      edtavClicodalbrec_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte gxajaxcallmode ;
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
   private short wcpOAV21DevCruEnvA ;
   private short AV21DevCruEnvA ;
   private short AV43OrderedBy ;
   private short AV66DevCru ;
   private short wbEnd ;
   private short wbStart ;
   private short AV31GridActions ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV65ALbrec ;
   private short GXv_int19[] ;
   private short GXv_int18[] ;
   private int wcpOAV23DevCruId ;
   private int wcpOAV16CliCod ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_115 ;
   private int AV23DevCruId ;
   private int AV16CliCod ;
   private int nGXsfl_115_idx=1 ;
   private int AV49TFAlbRecCod ;
   private int AV50TFAlbRecCod_To ;
   private int AV55TFDevCruPzs ;
   private int AV56TFDevCruPzs_To ;
   private int A11669DevCruId ;
   private int AV83Devcruid_selected ;
   private int AV84Albreccod_selected ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavClicod_Enabled ;
   private int edtavClinom_Enabled ;
   private int AV7AlbRecCod ;
   private int edtavAlbreccod_Enabled ;
   private int edtavAlbref_Enabled ;
   private int edtavAlbrefdsc_Enabled ;
   private int edtavDevcruund_Enabled ;
   private int edtavAlbrunidis_Enabled ;
   private int AV24DevCruPzs ;
   private int edtavDevcrupzs_Enabled ;
   private int AV10AlbRPieDis ;
   private int edtavAlbrpiedis_Enabled ;
   private int bttBtnenter_Enabled ;
   private int bttBtnhashcomunicarat_Enabled ;
   private int edtavAlbrunient_Enabled ;
   private int edtavAlbruniuti_Enabled ;
   private int AV11AlbRPieEnt ;
   private int edtavAlbrpieent_Enabled ;
   private int AV12AlbRPieUti ;
   private int edtavAlbrpieuti_Enabled ;
   private int edtavDevcruundold_Enabled ;
   private int AV25DevCrupzsold ;
   private int edtavDevcrupzsold_Enabled ;
   private int AV17CliCodAlbrec ;
   private int edtavClicodalbrec_Enabled ;
   private int edtavPgmname_Enabled ;
   private int A44AlbRecCod ;
   private int A11684DevCruPzs ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod ;
   private int AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to ;
   private int AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs ;
   private int AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to ;
   private int AV45PageToGo ;
   private int AV85GXV1 ;
   private int GXv_int20[] ;
   private int GXv_int17[] ;
   private int GXv_int16[] ;
   private int GXv_int12[] ;
   private int GXv_int10[] ;
   private int AV87Albrpieuti2 ;
   private int AV46Piezasdisp ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV32GridCurrentPage ;
   private long AV33GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV57TFDevCruUnd ;
   private java.math.BigDecimal AV58TFDevCruUnd_To ;
   private java.math.BigDecimal AV26DevCruUnd ;
   private java.math.BigDecimal AV13AlbRUniDis ;
   private java.math.BigDecimal AV14AlbRUniEnt ;
   private java.math.BigDecimal AV15AlbRUniUti ;
   private java.math.BigDecimal AV27devcruUndold ;
   private java.math.BigDecimal A11683DevCruUnd ;
   private java.math.BigDecimal AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund ;
   private java.math.BigDecimal AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal11[] ;
   private java.math.BigDecimal AV86Albruniuti2 ;
   private java.math.BigDecimal AV64Unidadesdisp ;
   private String wcpOAV28EmprCod ;
   private String wcpOAV19DevCruAtId ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Dvelop_confirmpanel_eliminar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV28EmprCod ;
   private String AV19DevCruAtId ;
   private String sGXsfl_115_idx="0001" ;
   private String AV51TFAlbRef ;
   private String AV52TFAlbRef_Sel ;
   private String AV53TFAlbRefDsc ;
   private String AV54TFAlbRefDsc_Sel ;
   private String AV71Pgmname ;
   private String A396EmprCod ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV82Emprcod_selected ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
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
   private String Dvelop_confirmpanel_eliminar_Title ;
   private String Dvelop_confirmpanel_eliminar_Confirmationtext ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_eliminar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_eliminar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Fixedcolumns ;
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
   private String TempTags ;
   private String AV68CliNom ;
   private String edtavClinom_Jsonclick ;
   private String divUnnamedtable4_Internalname ;
   private String edtavAlbreccod_Internalname ;
   private String edtavAlbreccod_Jsonclick ;
   private String ClassString ;
   private String imgUseraction1_gximage ;
   private String StyleString ;
   private String sImgUrl ;
   private String imgUseraction1_Internalname ;
   private String imgUseraction1_Jsonclick ;
   private String edtavAlbref_Internalname ;
   private String AV8AlbRef ;
   private String edtavAlbref_Jsonclick ;
   private String edtavAlbrefdsc_Internalname ;
   private String AV9AlbRefDsc ;
   private String edtavAlbrefdsc_Jsonclick ;
   private String edtavDevcruund_Internalname ;
   private String edtavDevcruund_Jsonclick ;
   private String edtavAlbrunidis_Internalname ;
   private String edtavAlbrunidis_Jsonclick ;
   private String edtavDevcrupzs_Internalname ;
   private String edtavDevcrupzs_Jsonclick ;
   private String edtavAlbrpiedis_Internalname ;
   private String edtavAlbrpiedis_Jsonclick ;
   private String divUnnamedtable1_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtnhashcomunicarat_Internalname ;
   private String bttBtnhashcomunicarat_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavAlbrunient_Internalname ;
   private String edtavAlbrunient_Jsonclick ;
   private String edtavAlbruniuti_Internalname ;
   private String edtavAlbruniuti_Jsonclick ;
   private String edtavAlbrpieent_Internalname ;
   private String edtavAlbrpieent_Jsonclick ;
   private String edtavAlbrpieuti_Internalname ;
   private String edtavAlbrpieuti_Jsonclick ;
   private String edtavDevcruundold_Internalname ;
   private String edtavDevcruundold_Jsonclick ;
   private String edtavDevcrupzsold_Internalname ;
   private String edtavDevcrupzsold_Jsonclick ;
   private String edtavClicodalbrec_Internalname ;
   private String edtavClicodalbrec_Jsonclick ;
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtAlbRecCod_Internalname ;
   private String A45AlbRef ;
   private String edtAlbRef_Internalname ;
   private String A3613AlbRefDsc ;
   private String edtAlbRefDsc_Internalname ;
   private String edtDevCruUnd_Internalname ;
   private String edtDevCruPzs_Internalname ;
   private String scmdbuf ;
   private String lV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref ;
   private String lV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc ;
   private String AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel ;
   private String AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref ;
   private String AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel ;
   private String AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc ;
   private String hsh ;
   private String AV6Station ;
   private String AV29EmprNom ;
   private String AV61UsurCod ;
   private String GXt_char8 ;
   private String GXt_char1 ;
   private String AV5Albruni ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String tblTabledvelop_confirmpanel_eliminar_Internalname ;
   private String Dvelop_confirmpanel_eliminar_Internalname ;
   private String sGXsfl_115_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtAlbRecCod_Jsonclick ;
   private String edtAlbRef_Jsonclick ;
   private String edtAlbRefDsc_Jsonclick ;
   private String edtDevCruUnd_Jsonclick ;
   private String edtDevCruPzs_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date wcpOAV20DevCruDtSys ;
   private java.util.Date AV20DevCruDtSys ;
   private java.util.Date wcpOAV22DevCruFec ;
   private java.util.Date AV22DevCruFec ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV44OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Dvpanel_unnamedtable2_Autowidth ;
   private boolean Dvpanel_unnamedtable2_Autoheight ;
   private boolean Dvpanel_unnamedtable2_Collapsible ;
   private boolean Dvpanel_unnamedtable2_Collapsed ;
   private boolean Dvpanel_unnamedtable2_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable2_Autoscroll ;
   private boolean Gridpaginationbar_Showfirst ;
   private boolean Gridpaginationbar_Showprevious ;
   private boolean Gridpaginationbar_Shownext ;
   private boolean Gridpaginationbar_Showlast ;
   private boolean Gridpaginationbar_Rowsperpageselector ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean bGXsfl_115_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV67Hash ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV36HTTPRequest ;
   private com.genexus.webpanels.WebSession AV48Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_eliminar ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactions ;
   private IDataStoreProvider pr_default ;
   private String[] H02B42_A396EmprCod ;
   private int[] H02B42_A11669DevCruId ;
   private int[] H02B42_A11684DevCruPzs ;
   private java.math.BigDecimal[] H02B42_A11683DevCruUnd ;
   private String[] H02B42_A3613AlbRefDsc ;
   private String[] H02B42_A45AlbRef ;
   private int[] H02B42_A44AlbRecCod ;
   private long[] H02B43_AGRID_nRecordCount ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV18DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV34GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState9[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV35GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV59TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV62WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext7[] ;
}

final  class devoluciontejido_8__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H02B42( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod ,
                                          int AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to ,
                                          String AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel ,
                                          String AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref ,
                                          String AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel ,
                                          String AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc ,
                                          java.math.BigDecimal AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund ,
                                          java.math.BigDecimal AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to ,
                                          int AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs ,
                                          int AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          java.math.BigDecimal A11683DevCruUnd ,
                                          int A11684DevCruPzs ,
                                          short AV43OrderedBy ,
                                          boolean AV44OrderedDsc ,
                                          String AV28EmprCod ,
                                          int AV23DevCruId ,
                                          String A396EmprCod ,
                                          int A11669DevCruId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[17];
      Object[] GXv_Object22 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.EmprCod, T1.DevCruId, T1.DevCruPzs, T1.DevCruUnd, T2.AlbRefDsc, T2.AlbRef, T1.AlbRecCod" ;
      sFromString = " FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DevCruId = ?)");
      if ( ! (0==AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
      }
      if ( ! (0==AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int21[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd >= ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd <= ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (0==AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs >= ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs <= ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( AV43OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod" ;
      }
      else if ( ( AV43OrderedBy == 2 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T1.AlbRecCod" ;
      }
      else if ( ( AV43OrderedBy == 2 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.AlbRecCod DESC" ;
      }
      else if ( ( AV43OrderedBy == 3 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRef" ;
      }
      else if ( ( AV43OrderedBy == 3 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRef DESC" ;
      }
      else if ( ( AV43OrderedBy == 4 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T2.AlbRefDsc" ;
      }
      else if ( ( AV43OrderedBy == 4 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.AlbRefDsc DESC" ;
      }
      else if ( ( AV43OrderedBy == 5 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruUnd" ;
      }
      else if ( ( AV43OrderedBy == 5 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruUnd DESC" ;
      }
      else if ( ( AV43OrderedBy == 6 ) && ! AV44OrderedDsc )
      {
         sOrderString += " ORDER BY T1.DevCruPzs" ;
      }
      else if ( ( AV43OrderedBy == 6 ) && ( AV44OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.DevCruPzs DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.DevCruId, T1.AlbRecCod" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H02B43( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          int AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod ,
                                          int AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to ,
                                          String AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel ,
                                          String AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref ,
                                          String AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel ,
                                          String AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc ,
                                          java.math.BigDecimal AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund ,
                                          java.math.BigDecimal AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to ,
                                          int AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs ,
                                          int AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to ,
                                          int A44AlbRecCod ,
                                          String A45AlbRef ,
                                          String A3613AlbRefDsc ,
                                          java.math.BigDecimal A11683DevCruUnd ,
                                          int A11684DevCruPzs ,
                                          short AV43OrderedBy ,
                                          boolean AV44OrderedDsc ,
                                          String AV28EmprCod ,
                                          int AV23DevCruId ,
                                          String A396EmprCod ,
                                          int A11669DevCruId )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[12];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM (TXPDEVCR1 T1 INNER JOIN TXPALBREC T2 ON T2.EmprCod = T1.EmprCod AND T2.AlbRecCod = T1.AlbRecCod)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.DevCruId = ?)");
      if ( ! (0==AV72Almacensindetalle_devoluciontejido_8ds_1_tfalbreccod) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod >= ?)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (0==AV73Almacensindetalle_devoluciontejido_8ds_2_tfalbreccod_to) )
      {
         addWhere(sWhereString, "(T1.AlbRecCod <= ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel)==0) && ( ! (GXutil.strcmp("", AV74Almacensindetalle_devoluciontejido_8ds_3_tfalbref)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRef) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV75Almacensindetalle_devoluciontejido_8ds_4_tfalbref_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRef = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel)==0) && ( ! (GXutil.strcmp("", AV76Almacensindetalle_devoluciontejido_8ds_5_tfalbrefdsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.AlbRefDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV77Almacensindetalle_devoluciontejido_8ds_6_tfalbrefdsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.AlbRefDsc = ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV78Almacensindetalle_devoluciontejido_8ds_7_tfdevcruund)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV79Almacensindetalle_devoluciontejido_8ds_8_tfdevcruund_to)==0) )
      {
         addWhere(sWhereString, "(T1.DevCruUnd <= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (0==AV80Almacensindetalle_devoluciontejido_8ds_9_tfdevcrupzs) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs >= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (0==AV81Almacensindetalle_devoluciontejido_8ds_10_tfdevcrupzs_to) )
      {
         addWhere(sWhereString, "(T1.DevCruPzs <= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV43OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 2 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 2 ) && ( AV44OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 3 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 3 ) && ( AV44OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 4 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 4 ) && ( AV44OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 5 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 5 ) && ( AV44OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 6 ) && ! AV44OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV43OrderedBy == 6 ) && ( AV44OrderedDsc ) )
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

   public Object [] getDynamicStatement( int cursor ,
                                         ModelContext context ,
                                         int remoteHandle ,
                                         com.genexus.IHttpContext httpContext ,
                                         Object [] dynConstraints )
   {
      switch ( cursor )
      {
            case 0 :
                  return conditional_H02B42(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() );
            case 1 :
                  return conditional_H02B43(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).intValue() , ((Number) dynConstraints[1]).intValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).intValue() , ((Number) dynConstraints[9]).intValue() , ((Number) dynConstraints[10]).intValue() , (String)dynConstraints[11] , (String)dynConstraints[12] , (java.math.BigDecimal)dynConstraints[13] , ((Number) dynConstraints[14]).intValue() , ((Number) dynConstraints[15]).shortValue() , ((Boolean) dynConstraints[16]).booleanValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).intValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H02B42", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H02B43", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
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
               ((int[]) buf[2])[0] = rslt.getInt(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,2);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               ((String[]) buf[5])[0] = rslt.getString(6, 16);
               ((int[]) buf[6])[0] = rslt.getInt(7);
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
                  stmt.setInt(sIdx, ((Number) parms[19]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[20]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[24], 26);
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
                  stmt.setInt(sIdx, ((Number) parms[27]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[28]).intValue());
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
                  stmt.setInt(sIdx, ((Number) parms[14]).intValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[15]).intValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 16);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[17], 16);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 26);
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
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[23]).intValue());
               }
               return;
      }
   }

}

