package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class colorproductosvariables__wp_impl extends GXDataArea
{
   public colorproductosvariables__wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public colorproductosvariables__wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorproductosvariables__wp_impl.class ));
   }

   public colorproductosvariables__wp_impl( int remoteHandle ,
                                            ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
      cmbavGridactiongroup1 = new HTMLChoice();
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
            AV5EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV6ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ForNumCol), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6ForNumCol), "ZZZZZZZ9")));
               AV56ValCon = (short)(GXutil.lval( httpContext.GetPar( "ValCon"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV56ValCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56ValCon), 4, 0));
               AV55FlagModC = (short)(GXutil.lval( httpContext.GetPar( "FlagModC"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV55FlagModC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55FlagModC), 4, 0));
               AV7Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Clicod), 6, 0));
               AV8Forser = httpContext.GetPar( "Forser") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Forser", AV8Forser);
               AV9Forcolnom = httpContext.GetPar( "Forcolnom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Forcolnom", AV9Forcolnom);
               AV10Forcolnum = (int)(GXutil.lval( httpContext.GetPar( "Forcolnum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Forcolnum), 6, 0));
               AV11TipColcod = (byte)(GXutil.lval( httpContext.GetPar( "TipColcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColcod), 2, 0));
               AV12ForRelBan = CommonUtil.decimalVal( httpContext.GetPar( "ForRelBan"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12ForRelBan", GXutil.ltrimstr( AV12ForRelBan, 7, 2));
               AV54CosKgmF = CommonUtil.decimalVal( httpContext.GetPar( "CosKgmF"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV54CosKgmF", GXutil.ltrimstr( AV54CosKgmF, 13, 5));
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
      nRC_GXsfl_89 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_89"))) ;
      nGXsfl_89_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_89_idx"))) ;
      sGXsfl_89_idx = httpContext.GetPar( "sGXsfl_89_idx") ;
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
      AV5EmprCod = httpContext.GetPar( "EmprCod") ;
      AV6ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
      AV61Acciongridmodificar = (short)(GXutil.lval( httpContext.GetPar( "Acciongridmodificar"))) ;
      AV23TFPrdLin = (short)(GXutil.lval( httpContext.GetPar( "TFPrdLin"))) ;
      AV24TFPrdLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFPrdLin_To"))) ;
      AV25TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV26TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV27TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV28TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV29TFForPrdCan = CommonUtil.decimalVal( httpContext.GetPar( "TFForPrdCan"), ".") ;
      AV30TFForPrdCan_To = CommonUtil.decimalVal( httpContext.GetPar( "TFForPrdCan_To"), ".") ;
      AV31TFForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "TFForPrdUMe"))) ;
      AV32TFForPrdUMe_To = (byte)(GXutil.lval( httpContext.GetPar( "TFForPrdUMe_To"))) ;
      AV33TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV34TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV35TFForPrdNor = (short)(GXutil.lval( httpContext.GetPar( "TFForPrdNor"))) ;
      AV36TFForPrdNor_To = (short)(GXutil.lval( httpContext.GetPar( "TFForPrdNor_To"))) ;
      AV66Pgmname = httpContext.GetPar( "Pgmname") ;
      AV20OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV21OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6ForNumCol, AV61Acciongridmodificar, AV23TFPrdLin, AV24TFPrdLin_To, AV25TFPrdNum, AV26TFPrdNum_Sel, AV27TFPrdNom, AV28TFPrdNom_Sel, AV29TFForPrdCan, AV30TFForPrdCan_To, AV31TFForPrdUMe, AV32TFForPrdUMe_To, AV33TFForPrdDsc, AV34TFForPrdDsc_Sel, AV35TFForPrdNor, AV36TFForPrdNor_To, AV66Pgmname, AV20OrderedBy, AV21OrderedDsc) ;
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
      pa28Y2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start28Y2( ) ;
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.colorproductosvariables__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV56ValCon,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV55FlagModC,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8Forser)),GXutil.URLEncode(GXutil.rtrim(AV9Forcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV10Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11TipColcod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV12ForRelBan)),GXutil.URLEncode(DecimalUtil.decToString(AV54CosKgmF))}, new String[] {"EmprCod","ForNumCol","ValCon","FlagModC","Clicod","Forser","Forcolnom","Forcolnum","TipColcod","ForRelBan","CosKgmF"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6ForNumCol), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ColorProductosVariables__WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\colorproductosvariables__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_89", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_89, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV47PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV47PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV39GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV40GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV37DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV37DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vACCIONGRIDMODIFICAR", GXutil.ltrim( localUtil.ntoc( AV61Acciongridmodificar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV5EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDLIN", GXutil.ltrim( localUtil.ntoc( AV23TFPrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDLIN_TO", GXutil.ltrim( localUtil.ntoc( AV24TFPrdLin_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV25TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV26TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV27TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV28TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDCAN", GXutil.ltrim( localUtil.ntoc( AV29TFForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDCAN_TO", GXutil.ltrim( localUtil.ntoc( AV30TFForPrdCan_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDUME", GXutil.ltrim( localUtil.ntoc( AV31TFForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDUME_TO", GXutil.ltrim( localUtil.ntoc( AV32TFForPrdUMe_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC", GXutil.rtrim( AV33TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC_SEL", GXutil.rtrim( AV34TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDNOR", GXutil.ltrim( localUtil.ntoc( AV35TFForPrdNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDNOR_TO", GXutil.ltrim( localUtil.ntoc( AV36TFForPrdNor_To, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV20OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV21OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV7Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORSER", GXutil.rtrim( AV8Forser));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNOM", GXutil.rtrim( AV9Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV10Forcolnum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV11TipColcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORRELBAN", GXutil.ltrim( localUtil.ntoc( AV12ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV49Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALOR_COR", GXutil.ltrim( localUtil.ntoc( AV52Valor_cor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEXISTECARDINAL", GXutil.ltrim( localUtil.ntoc( AV57existecardinal, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALCON", GXutil.ltrim( localUtil.ntoc( AV56ValCon, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMODC", GXutil.ltrim( localUtil.ntoc( AV55FlagModC, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCOSKGMF", GXutil.ltrim( localUtil.ntoc( AV54CosKgmF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_set", GXutil.rtrim( Combo_prdnum_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Width", GXutil.rtrim( Dvpanel_unnamedtable1_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable1_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable1_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Cls", GXutil.rtrim( Dvpanel_unnamedtable1_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Title", GXutil.rtrim( Dvpanel_unnamedtable1_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable1_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable1_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable1_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE1_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable1_Autoscroll));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Title", GXutil.rtrim( Dvelop_confirmpanel_enter_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_enter_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_enter_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_enter_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_get", GXutil.rtrim( Combo_prdnum_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Selectedpage", GXutil.rtrim( Gridpaginationbar_Selectedpage));
      app.GxWebStd.gx_hidden_field( httpContext, "GRIDPAGINATIONBAR_Rowsperpageselectedvalue", GXutil.ltrim( localUtil.ntoc( Gridpaginationbar_Rowsperpageselectedvalue, (byte)(9), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_ENTER_Result", GXutil.rtrim( Dvelop_confirmpanel_enter_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_get", GXutil.rtrim( Combo_prdnum_Selectedvalue_get));
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
         we28Y2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt28Y2( ) ;
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
      return formatLink("app.formulaciontinte.colorproductosvariables__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV56ValCon,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV55FlagModC,4,0)),GXutil.URLEncode(GXutil.ltrimstr(AV7Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV8Forser)),GXutil.URLEncode(GXutil.rtrim(AV9Forcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV10Forcolnum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV11TipColcod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV12ForRelBan)),GXutil.URLEncode(DecimalUtil.decToString(AV54CosKgmF))}, new String[] {"EmprCod","ForNumCol","ValCon","FlagModC","Clicod","Forser","Forcolnom","Forcolnum","TipColcod","ForRelBan","CosKgmF"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ColorProductosVariables__WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Productos Variables (#)", "") ;
   }

   public void wb28Y0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         ClassString = "ErrorViewer" ;
         StyleString = "" ;
         app.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFornumcol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFornumcol_Internalname, httpContext.getMessage( "Nº Interno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFornumcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV6ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFornumcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV6ForNumCol), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV6ForNumCol), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFornumcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFornumcol_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs col-sm-6", "left", "top", "", "", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
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
         ucDvpanel_unnamedtable1.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable1_Internalname, "DVPANEL_UNNAMEDTABLE1Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE1Container"+"UnnamedTable1"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavPrdlin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavPrdlin_Internalname, "#", " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 36,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdlin_Internalname, GXutil.ltrim( localUtil.ntoc( AV41PrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavPrdlin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV41PrdLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV41PrdLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,36);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdlin_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPrdlin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_prdnum_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockcombo_prdnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
         ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
         ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
         ucCombo_prdnum.setProperty("DropDownOptionsData", AV47PrdNum_Data);
         ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-3 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForprdcan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprdcan_Internalname, httpContext.getMessage( "Cantidad", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 47,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprdcan_Internalname, GXutil.ltrim( localUtil.ntoc( AV43ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForprdcan_Enabled!=0) ? localUtil.format( AV43ForPrdCan, "ZZZZ9.99999") : localUtil.format( AV43ForPrdCan, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,47);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprdcan_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavForprdcan_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavUndformula_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavUndformula_Internalname, httpContext.getMessage( "Und", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 51,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavUndformula_Internalname, GXutil.ltrim( localUtil.ntoc( AV63UndFormula, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavUndformula_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV63UndFormula), "9") : localUtil.format( DecimalUtil.doubleToDec(AV63UndFormula), "9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,51);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavUndformula_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavUndformula_Enabled, 0, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Active images/pictures */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'',0)\"" ;
         ClassString = "CellMarginTop35" + " " + ((GXutil.strcmp(imgUseraction1_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgUseraction1_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgUseraction1_Internalname, sImgUrl, "", "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 5, imgUseraction1_Jsonclick, "'"+""+"'"+",false,"+"'"+"E\\'DOUSERACTION1\\'."+"'", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" "+TempTags, "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForprddsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprddsc_Internalname, httpContext.getMessage( "Desc.", ""), " AttributeLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 57,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprddsc_Internalname, GXutil.rtrim( AV45ForPrdDsc), GXutil.rtrim( localUtil.format( AV45ForPrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,57);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprddsc_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavForprddsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedforprdnor_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockforprdnor_Internalname, httpContext.getMessage( "Orden(#)", ""), "", "", lblTextblockforprdnor_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_64_28Y2( true) ;
      }
      else
      {
         wb_table1_64_28Y2( false) ;
      }
      return  ;
   }

   public void wb_table1_64_28Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 CellMarginTop", "Center", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 78,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 89, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 89, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell CellMarginTop HasGridEmpowerer", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divGridtablewithpaginationbar_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol89( ) ;
      }
      if ( wbEnd == 89 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_89 = (int)(nGXsfl_89_idx-1) ;
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
         ucGridpaginationbar.setProperty("CurrentPage", AV39GridCurrentPage);
         ucGridpaginationbar.setProperty("PageCount", AV40GridPageCount);
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV66Pgmname), GXutil.rtrim( localUtil.format( AV66Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
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
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 111,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, GXutil.rtrim( AV42PrdNum), GXutil.rtrim( localUtil.format( AV42PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,111);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavPrdnum_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV37DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table2_113_28Y2( true) ;
      }
      else
      {
         wb_table2_113_28Y2( false) ;
      }
      return  ;
   }

   public void wb_table2_113_28Y2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 89 )
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

   public void start28Y2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Productos Variables (#)", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup28Y0( ) ;
   }

   public void ws28Y2( )
   {
      start28Y2( ) ;
      evt28Y2( ) ;
   }

   public void evt28Y2( )
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
                        else if ( GXutil.strcmp(sEvt, "COMBO_PRDNUM.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1128Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1228Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1328Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1428Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1528Y2 ();
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
                                 e1628Y2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1728Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOUSERACTION1'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoUserAction1' */
                           e1828Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORPRDNOR.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1928Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VPRDLIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2028Y2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VUNDFORMULA.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e2128Y2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "PRDLIN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "PRDLIN.CLICK") == 0 ) )
                        {
                           nGXsfl_89_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_892( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV53GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridActionGroup1), 4, 0));
                           A715PrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtPrdLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A487ForPrdCan = localUtil.ctond( httpContext.cgiGet( edtForPrdCan_Internalname)) ;
                           A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A489ForPrdNor = (short)(localUtil.ctol( httpContext.cgiGet( edtForPrdNor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2228Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2328Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2428Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2528Y2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "PRDLIN.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2628Y2 ();
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

   public void we28Y2( )
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

   public void pa28Y2( )
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
            GX_FocusControl = edtavPrdlin_Internalname ;
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
      subsflControlProps_892( ) ;
      while ( nGXsfl_89_idx <= nRC_GXsfl_89 )
      {
         sendrow_892( ) ;
         nGXsfl_89_idx = ((subGrid_Islastpage==1)&&(nGXsfl_89_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_89_idx+1) ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_892( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV5EmprCod ,
                                 int AV6ForNumCol ,
                                 short AV61Acciongridmodificar ,
                                 short AV23TFPrdLin ,
                                 short AV24TFPrdLin_To ,
                                 String AV25TFPrdNum ,
                                 String AV26TFPrdNum_Sel ,
                                 String AV27TFPrdNom ,
                                 String AV28TFPrdNom_Sel ,
                                 java.math.BigDecimal AV29TFForPrdCan ,
                                 java.math.BigDecimal AV30TFForPrdCan_To ,
                                 byte AV31TFForPrdUMe ,
                                 byte AV32TFForPrdUMe_To ,
                                 String AV33TFForPrdDsc ,
                                 String AV34TFForPrdDsc_Sel ,
                                 short AV35TFForPrdNor ,
                                 short AV36TFForPrdNor_To ,
                                 String AV66Pgmname ,
                                 short AV20OrderedBy ,
                                 boolean AV21OrderedDsc )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2328Y2 ();
      GRID_nCurrentRecord = 0 ;
      rf28Y2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ColorProductosVariables__WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\colorproductosvariables__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDLIN", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(A715PrdLin), "ZZ9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDLIN", GXutil.ltrim( localUtil.ntoc( A715PrdLin, (byte)(3), (byte)(0), ".", "")));
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
      rf28Y2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV66Pgmname = "FormulacionTinte.ColorProductosVariables__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
      Gx_err = (short)(0) ;
      edtavFornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumcol_Enabled), 5, 0), true);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_forprdnor_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.promptproductosvariables"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDNOR"+"'), id:'"+"vFORPRDNOR"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdnor_Internalname, "Link", imgPrompt_forprdnor_Link, true);
   }

   public void rf28Y2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(89) ;
      /* Execute user event: Refresh */
      e2328Y2 ();
      nGXsfl_89_idx = 1 ;
      sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_892( ) ;
      bGXsfl_89_Refreshing = true ;
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
         subsflControlProps_892( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin) ,
                                              Short.valueOf(AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to) ,
                                              AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel ,
                                              AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum ,
                                              AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel ,
                                              AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom ,
                                              AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan ,
                                              AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to ,
                                              Byte.valueOf(AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume) ,
                                              Byte.valueOf(AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to) ,
                                              AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel ,
                                              AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc ,
                                              Short.valueOf(AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor) ,
                                              Short.valueOf(AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to) ,
                                              Short.valueOf(A715PrdLin) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A487ForPrdCan ,
                                              Byte.valueOf(A490ForPrdUMe) ,
                                              A488ForPrdDsc ,
                                              Short.valueOf(A489ForPrdNor) ,
                                              Short.valueOf(AV20OrderedBy) ,
                                              Boolean.valueOf(AV21OrderedDsc) ,
                                              AV5EmprCod ,
                                              Integer.valueOf(AV6ForNumCol) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A486ForNumCol) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                              TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum), 6, "%") ;
         lV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom), 26, "%") ;
         lV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc), 5, "%") ;
         /* Using cursor H028Y2 */
         pr_default.execute(0, new Object[] {AV5EmprCod, Integer.valueOf(AV6ForNumCol), Short.valueOf(AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin), Short.valueOf(AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to), lV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum, AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel, lV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom, AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel, AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan, AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to, Byte.valueOf(AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume), Byte.valueOf(AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to), lV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc, AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel, Short.valueOf(AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor), Short.valueOf(AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_89_idx = 1 ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_892( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A486ForNumCol = H028Y2_A486ForNumCol[0] ;
            A396EmprCod = H028Y2_A396EmprCod[0] ;
            A489ForPrdNor = H028Y2_A489ForPrdNor[0] ;
            A488ForPrdDsc = H028Y2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H028Y2_n488ForPrdDsc[0] ;
            A490ForPrdUMe = H028Y2_A490ForPrdUMe[0] ;
            A487ForPrdCan = H028Y2_A487ForPrdCan[0] ;
            A718PrdNom = H028Y2_A718PrdNom[0] ;
            A719PrdNum = H028Y2_A719PrdNum[0] ;
            A715PrdLin = H028Y2_A715PrdLin[0] ;
            A488ForPrdDsc = H028Y2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H028Y2_n488ForPrdDsc[0] ;
            A718PrdNom = H028Y2_A718PrdNom[0] ;
            e2428Y2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(89) ;
         wb28Y0( ) ;
      }
      bGXsfl_89_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes28Y2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_PRDLIN"+"_"+sGXsfl_89_idx, getSecureSignedToken( sGXsfl_89_idx, localUtil.format( DecimalUtil.doubleToDec(A715PrdLin), "ZZ9")));
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
      AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin = AV23TFPrdLin ;
      AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to = AV24TFPrdLin_To ;
      AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum = AV25TFPrdNum ;
      AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel = AV26TFPrdNum_Sel ;
      AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom = AV27TFPrdNom ;
      AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel = AV28TFPrdNom_Sel ;
      AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan = AV29TFForPrdCan ;
      AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to = AV30TFForPrdCan_To ;
      AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume = AV31TFForPrdUMe ;
      AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to = AV32TFForPrdUMe_To ;
      AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc = AV33TFForPrdDsc ;
      AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel = AV34TFForPrdDsc_Sel ;
      AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor = AV35TFForPrdNor ;
      AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to = AV36TFForPrdNor_To ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin) ,
                                           Short.valueOf(AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to) ,
                                           AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel ,
                                           AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum ,
                                           AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel ,
                                           AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom ,
                                           AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan ,
                                           AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to ,
                                           Byte.valueOf(AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to) ,
                                           AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel ,
                                           AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc ,
                                           Short.valueOf(AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor) ,
                                           Short.valueOf(AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to) ,
                                           Short.valueOf(A715PrdLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A487ForPrdCan ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(A489ForPrdNor) ,
                                           Short.valueOf(AV20OrderedBy) ,
                                           Boolean.valueOf(AV21OrderedDsc) ,
                                           AV5EmprCod ,
                                           Integer.valueOf(AV6ForNumCol) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A486ForNumCol) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING,
                                           TypeConstants.BOOLEAN, TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum), 6, "%") ;
      lV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom), 26, "%") ;
      lV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor H028Y3 */
      pr_default.execute(1, new Object[] {AV5EmprCod, Integer.valueOf(AV6ForNumCol), Short.valueOf(AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin), Short.valueOf(AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to), lV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum, AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel, lV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom, AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel, AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan, AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to, Byte.valueOf(AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume), Byte.valueOf(AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to), lV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc, AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel, Short.valueOf(AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor), Short.valueOf(AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to)});
      GRID_nRecordCount = H028Y3_AGRID_nRecordCount[0] ;
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
      AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin = AV23TFPrdLin ;
      AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to = AV24TFPrdLin_To ;
      AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum = AV25TFPrdNum ;
      AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel = AV26TFPrdNum_Sel ;
      AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom = AV27TFPrdNom ;
      AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel = AV28TFPrdNom_Sel ;
      AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan = AV29TFForPrdCan ;
      AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to = AV30TFForPrdCan_To ;
      AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume = AV31TFForPrdUMe ;
      AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to = AV32TFForPrdUMe_To ;
      AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc = AV33TFForPrdDsc ;
      AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel = AV34TFForPrdDsc_Sel ;
      AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor = AV35TFForPrdNor ;
      AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to = AV36TFForPrdNor_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6ForNumCol, AV61Acciongridmodificar, AV23TFPrdLin, AV24TFPrdLin_To, AV25TFPrdNum, AV26TFPrdNum_Sel, AV27TFPrdNom, AV28TFPrdNom_Sel, AV29TFForPrdCan, AV30TFForPrdCan_To, AV31TFForPrdUMe, AV32TFForPrdUMe_To, AV33TFForPrdDsc, AV34TFForPrdDsc_Sel, AV35TFForPrdNor, AV36TFForPrdNor_To, AV66Pgmname, AV20OrderedBy, AV21OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin = AV23TFPrdLin ;
      AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to = AV24TFPrdLin_To ;
      AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum = AV25TFPrdNum ;
      AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel = AV26TFPrdNum_Sel ;
      AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom = AV27TFPrdNom ;
      AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel = AV28TFPrdNom_Sel ;
      AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan = AV29TFForPrdCan ;
      AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to = AV30TFForPrdCan_To ;
      AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume = AV31TFForPrdUMe ;
      AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to = AV32TFForPrdUMe_To ;
      AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc = AV33TFForPrdDsc ;
      AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel = AV34TFForPrdDsc_Sel ;
      AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor = AV35TFForPrdNor ;
      AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to = AV36TFForPrdNor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6ForNumCol, AV61Acciongridmodificar, AV23TFPrdLin, AV24TFPrdLin_To, AV25TFPrdNum, AV26TFPrdNum_Sel, AV27TFPrdNom, AV28TFPrdNom_Sel, AV29TFForPrdCan, AV30TFForPrdCan_To, AV31TFForPrdUMe, AV32TFForPrdUMe_To, AV33TFForPrdDsc, AV34TFForPrdDsc_Sel, AV35TFForPrdNor, AV36TFForPrdNor_To, AV66Pgmname, AV20OrderedBy, AV21OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin = AV23TFPrdLin ;
      AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to = AV24TFPrdLin_To ;
      AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum = AV25TFPrdNum ;
      AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel = AV26TFPrdNum_Sel ;
      AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom = AV27TFPrdNom ;
      AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel = AV28TFPrdNom_Sel ;
      AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan = AV29TFForPrdCan ;
      AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to = AV30TFForPrdCan_To ;
      AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume = AV31TFForPrdUMe ;
      AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to = AV32TFForPrdUMe_To ;
      AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc = AV33TFForPrdDsc ;
      AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel = AV34TFForPrdDsc_Sel ;
      AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor = AV35TFForPrdNor ;
      AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to = AV36TFForPrdNor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6ForNumCol, AV61Acciongridmodificar, AV23TFPrdLin, AV24TFPrdLin_To, AV25TFPrdNum, AV26TFPrdNum_Sel, AV27TFPrdNom, AV28TFPrdNom_Sel, AV29TFForPrdCan, AV30TFForPrdCan_To, AV31TFForPrdUMe, AV32TFForPrdUMe_To, AV33TFForPrdDsc, AV34TFForPrdDsc_Sel, AV35TFForPrdNor, AV36TFForPrdNor_To, AV66Pgmname, AV20OrderedBy, AV21OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin = AV23TFPrdLin ;
      AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to = AV24TFPrdLin_To ;
      AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum = AV25TFPrdNum ;
      AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel = AV26TFPrdNum_Sel ;
      AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom = AV27TFPrdNom ;
      AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel = AV28TFPrdNom_Sel ;
      AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan = AV29TFForPrdCan ;
      AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to = AV30TFForPrdCan_To ;
      AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume = AV31TFForPrdUMe ;
      AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to = AV32TFForPrdUMe_To ;
      AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc = AV33TFForPrdDsc ;
      AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel = AV34TFForPrdDsc_Sel ;
      AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor = AV35TFForPrdNor ;
      AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to = AV36TFForPrdNor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6ForNumCol, AV61Acciongridmodificar, AV23TFPrdLin, AV24TFPrdLin_To, AV25TFPrdNum, AV26TFPrdNum_Sel, AV27TFPrdNom, AV28TFPrdNom_Sel, AV29TFForPrdCan, AV30TFForPrdCan_To, AV31TFForPrdUMe, AV32TFForPrdUMe_To, AV33TFForPrdDsc, AV34TFForPrdDsc_Sel, AV35TFForPrdNor, AV36TFForPrdNor_To, AV66Pgmname, AV20OrderedBy, AV21OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin = AV23TFPrdLin ;
      AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to = AV24TFPrdLin_To ;
      AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum = AV25TFPrdNum ;
      AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel = AV26TFPrdNum_Sel ;
      AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom = AV27TFPrdNom ;
      AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel = AV28TFPrdNom_Sel ;
      AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan = AV29TFForPrdCan ;
      AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to = AV30TFForPrdCan_To ;
      AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume = AV31TFForPrdUMe ;
      AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to = AV32TFForPrdUMe_To ;
      AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc = AV33TFForPrdDsc ;
      AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel = AV34TFForPrdDsc_Sel ;
      AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor = AV35TFForPrdNor ;
      AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to = AV36TFForPrdNor_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV5EmprCod, AV6ForNumCol, AV61Acciongridmodificar, AV23TFPrdLin, AV24TFPrdLin_To, AV25TFPrdNum, AV26TFPrdNum_Sel, AV27TFPrdNom, AV28TFPrdNom_Sel, AV29TFForPrdCan, AV30TFForPrdCan_To, AV31TFForPrdUMe, AV32TFForPrdUMe_To, AV33TFForPrdDsc, AV34TFForPrdDsc_Sel, AV35TFForPrdNor, AV36TFForPrdNor_To, AV66Pgmname, AV20OrderedBy, AV21OrderedDsc) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV66Pgmname = "FormulacionTinte.ColorProductosVariables__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
      Gx_err = (short)(0) ;
      edtavFornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumcol_Enabled), 5, 0), true);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_forprdnor_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.promptproductosvariables"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDNOR"+"'), id:'"+"vFORPRDNOR"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdnor_Internalname, "Link", imgPrompt_forprdnor_Link, true);
      fix_multi_value_controls( ) ;
   }

   public void strup28Y0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2228Y2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV47PrdNum_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV37DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_89 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_89"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV39GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV40GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
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
         Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
         Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
         Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
         Dvpanel_unnamedtable1_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Width") ;
         Dvpanel_unnamedtable1_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autowidth")) ;
         Dvpanel_unnamedtable1_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoheight")) ;
         Dvpanel_unnamedtable1_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Cls") ;
         Dvpanel_unnamedtable1_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Title") ;
         Dvpanel_unnamedtable1_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsible")) ;
         Dvpanel_unnamedtable1_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Collapsed")) ;
         Dvpanel_unnamedtable1_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Showcollapseicon")) ;
         Dvpanel_unnamedtable1_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Iconposition") ;
         Dvpanel_unnamedtable1_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE1_Autoscroll")) ;
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
         Dvelop_confirmpanel_enter_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Title") ;
         Dvelop_confirmpanel_enter_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmationtext") ;
         Dvelop_confirmpanel_enter_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttoncaption") ;
         Dvelop_confirmpanel_enter_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Nobuttoncaption") ;
         Dvelop_confirmpanel_enter_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_enter_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Yesbuttonposition") ;
         Dvelop_confirmpanel_enter_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
         Gridpaginationbar_Selectedpage = httpContext.cgiGet( "GRIDPAGINATIONBAR_Selectedpage") ;
         Gridpaginationbar_Rowsperpageselectedvalue = (int)(localUtil.ctol( httpContext.cgiGet( "GRIDPAGINATIONBAR_Rowsperpageselectedvalue"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Dvelop_confirmpanel_enter_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_ENTER_Result") ;
         Combo_prdnum_Selectedvalue_get = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_get") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDLIN");
            GX_FocusControl = edtavPrdlin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV41PrdLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41PrdLin), 3, 0));
         }
         else
         {
            AV41PrdLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavPrdlin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41PrdLin), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavForprdcan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavForprdcan_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORPRDCAN");
            GX_FocusControl = edtavForprdcan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV43ForPrdCan = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43ForPrdCan", GXutil.ltrimstr( AV43ForPrdCan, 11, 5));
         }
         else
         {
            AV43ForPrdCan = localUtil.ctond( httpContext.cgiGet( edtavForprdcan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43ForPrdCan", GXutil.ltrimstr( AV43ForPrdCan, 11, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavUndformula_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavUndformula_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vUNDFORMULA");
            GX_FocusControl = edtavUndformula_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV63UndFormula = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63UndFormula", GXutil.str( AV63UndFormula, 1, 0));
         }
         else
         {
            AV63UndFormula = (byte)(localUtil.ctol( httpContext.cgiGet( edtavUndformula_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV63UndFormula", GXutil.str( AV63UndFormula, 1, 0));
         }
         AV45ForPrdDsc = httpContext.cgiGet( edtavForprddsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV45ForPrdDsc", AV45ForPrdDsc);
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdnor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdnor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORPRDNOR");
            GX_FocusControl = edtavForprdnor_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV46ForPrdNor = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46ForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ForPrdNor), 4, 0));
         }
         else
         {
            AV46ForPrdNor = (short)(localUtil.ctol( httpContext.cgiGet( edtavForprdnor_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV46ForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ForPrdNor), 4, 0));
         }
         AV66Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
         AV42PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42PrdNum", AV42PrdNum);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ColorProductosVariables__WP");
         AV66Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV66Pgmname", AV66Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV66Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\colorproductosvariables__wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2228Y2 ();
      if (returnInSub) return;
   }

   public void e2228Y2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV49Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      colorproductosvariables__wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV49Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV49Station", AV49Station);
      GXv_char2[0] = AV5EmprCod ;
      GXv_char3[0] = AV50EmprNom ;
      GXv_char4[0] = AV51UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV49Station, GXv_char2, GXv_char3, GXv_char4) ;
      colorproductosvariables__wp_impl.this.AV5EmprCod = GXv_char2[0] ;
      colorproductosvariables__wp_impl.this.AV50EmprNom = GXv_char3[0] ;
      colorproductosvariables__wp_impl.this.AV51UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      edtavPrdnum_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdnum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdnum_Visible), 5, 0), true);
      /* Execute user subroutine: 'LOADCOMBOPRDNUM' */
      S112 ();
      if (returnInSub) return;
      subGrid_Rows = 10 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Productos Variables (#)", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV20OrderedBy < 1 )
      {
         AV20OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV37DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV37DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_int7 = (byte)(AV59MForEq) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV5EmprCod, httpContext.getMessage( "MFOREQ", ""), GXv_int8) ;
      colorproductosvariables__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV59MForEq = GXt_int7 ;
      GXt_int9 = AV41PrdLin ;
      GXv_int10[0] = GXt_int9 ;
      new app.formulaciontinte.getcolorproductos(remoteHandle, context).execute( AV5EmprCod, AV6ForNumCol, GXv_int10) ;
      colorproductosvariables__wp_impl.this.GXt_int9 = GXv_int10[0] ;
      AV41PrdLin = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41PrdLin), 3, 0));
      imgPrompt_gximage = "prompt" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_Internalname, "gximage", imgPrompt_gximage, true);
      AV60prompt = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
      AV67Prompt_GXI = GXDbFile.pathToUrl( context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )), context.getHttpContext()) ;
      AV61Acciongridmodificar = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV61Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61Acciongridmodificar), 4, 0));
   }

   public void e2328Y2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV14WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV14WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      AV39GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV39GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV39GridCurrentPage), 10, 0));
      AV40GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV40GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV40GridPageCount), 10, 0));
      if ( AV61Acciongridmodificar == 1 )
      {
         AV61Acciongridmodificar = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61Acciongridmodificar), 4, 0));
      }
      else
      {
         GXt_int9 = AV41PrdLin ;
         GXv_int10[0] = GXt_int9 ;
         new app.formulaciontinte.getcolorproductos(remoteHandle, context).execute( AV5EmprCod, AV6ForNumCol, GXv_int10) ;
         colorproductosvariables__wp_impl.this.GXt_int9 = GXv_int10[0] ;
         AV41PrdLin = GXt_int9 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41PrdLin), 3, 0));
         this.executeUsercontrolMethod("", false, "DATAMONJSContainer", "DisableFocus", "", new Object[] {imgUseraction1_Internalname});
      }
      AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin = AV23TFPrdLin ;
      AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to = AV24TFPrdLin_To ;
      AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum = AV25TFPrdNum ;
      AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel = AV26TFPrdNum_Sel ;
      AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom = AV27TFPrdNom ;
      AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel = AV28TFPrdNom_Sel ;
      AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan = AV29TFForPrdCan ;
      AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to = AV30TFForPrdCan_To ;
      AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume = AV31TFForPrdUMe ;
      AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to = AV32TFForPrdUMe_To ;
      AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc = AV33TFForPrdDsc ;
      AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel = AV34TFForPrdDsc_Sel ;
      AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor = AV35TFForPrdNor ;
      AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to = AV36TFForPrdNor_To ;
      /*  Sending Event outputs  */
   }

   public void e1228Y2( )
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
         AV38PageToGo = (int)(GXutil.lval( Gridpaginationbar_Selectedpage)) ;
         subgrid_gotopage( AV38PageToGo) ;
      }
   }

   public void e1328Y2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1428Y2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV20OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV20OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OrderedBy), 4, 0));
         AV21OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV21OrderedDsc", AV21OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdLin") == 0 )
         {
            AV23TFPrdLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFPrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFPrdLin), 3, 0));
            AV24TFPrdLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFPrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFPrdLin_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV25TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFPrdNum", AV25TFPrdNum);
            AV26TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNum_Sel", AV26TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV27TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNom", AV27TFPrdNom);
            AV28TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNom_Sel", AV28TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdCan") == 0 )
         {
            AV29TFForPrdCan = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFForPrdCan", GXutil.ltrimstr( AV29TFForPrdCan, 11, 5));
            AV30TFForPrdCan_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFForPrdCan_To", GXutil.ltrimstr( AV30TFForPrdCan_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdUMe") == 0 )
         {
            AV31TFForPrdUMe = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFForPrdUMe", GXutil.str( AV31TFForPrdUMe, 1, 0));
            AV32TFForPrdUMe_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFForPrdUMe_To", GXutil.str( AV32TFForPrdUMe_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV33TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFForPrdDsc", AV33TFForPrdDsc);
            AV34TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFForPrdDsc_Sel", AV34TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdNor") == 0 )
         {
            AV35TFForPrdNor = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFForPrdNor), 4, 0));
            AV36TFForPrdNor_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFForPrdNor_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFForPrdNor_To), 4, 0));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2428Y2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(89) ;
      }
      sendrow_892( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_89_Refreshing )
      {
         httpContext.doAjaxLoad(89, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV53GridActionGroup1, 4, 0)) );
   }

   public void e2528Y2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV53GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S162 ();
         if (returnInSub) return;
      }
      AV53GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV53GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1628Y2 ();
      if (returnInSub) return;
   }

   public void e1628Y2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      AV58Mensaje = " " ;
      if ( (0==AV41PrdLin) )
      {
         lblTbmessage_Caption = httpContext.getMessage( "Falta #", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavPrdlin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (GXutil.strcmp("", AV42PrdNum)==0) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Falta Producto", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavPrdnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV43ForPrdCan)==0) )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Cantidad nula", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavForprdcan_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( (0==AV46ForPrdNor) )
               {
                  lblTbmessage_Caption = httpContext.getMessage( "NO puede ser valor 0", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = edtavForprdnor_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  GXt_char1 = AV62ForPrdDsccontrol ;
                  GXv_char4[0] = GXt_char1 ;
                  new app.get_forprddsc(remoteHandle, context).execute( AV5EmprCod, AV63UndFormula, GXv_char4) ;
                  colorproductosvariables__wp_impl.this.GXt_char1 = GXv_char4[0] ;
                  AV62ForPrdDsccontrol = GXt_char1 ;
                  if ( GXutil.strcmp(AV62ForPrdDsccontrol, httpContext.getMessage( "Error", "")) == 0 )
                  {
                     lblTbmessage_Caption = httpContext.getMessage( "NO es una UNIDAD Valida", "") ;
                     httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                     GX_FocusControl = edtavUndformula_Internalname ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                     httpContext.doAjaxSetFocus(GX_FocusControl);
                  }
                  else
                  {
                     if ( ! (0==AV46ForPrdNor) )
                     {
                        GXv_int10[0] = AV57existecardinal ;
                        GXv_char4[0] = AV58Mensaje ;
                        new app.formulaciontinte.existecardinalenprocesoquimico(remoteHandle, context).execute( AV5EmprCod, AV7Clicod, AV8Forser, AV9Forcolnom, AV10Forcolnum, AV11TipColcod, AV46ForPrdNor, AV42PrdNum, GXv_int10, GXv_char4) ;
                        colorproductosvariables__wp_impl.this.AV57existecardinal = GXv_int10[0] ;
                        colorproductosvariables__wp_impl.this.AV58Mensaje = GXv_char4[0] ;
                        httpContext.ajax_rsp_assign_attri("", false, "AV57existecardinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57existecardinal), 4, 0));
                     }
                     if ( ! (GXutil.strcmp("", AV58Mensaje)==0) && ( AV57existecardinal == 1 ) )
                     {
                        lblTbmessage_Caption = AV58Mensaje ;
                        httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                        GX_FocusControl = edtavForprdnor_Internalname ;
                        httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                        httpContext.doAjaxSetFocus(GX_FocusControl);
                     }
                     else
                     {
                        if ( ! (GXutil.strcmp("", AV58Mensaje)==0) && ( AV57existecardinal == 0 ) )
                        {
                           lblTbmessage_Caption = AV58Mensaje ;
                           httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                           GX_FocusControl = edtavForprdnor_Internalname ;
                           httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                           httpContext.doAjaxSetFocus(GX_FocusControl);
                        }
                        else
                        {
                           this.executeUsercontrolMethod("", false, "DVELOP_CONFIRMPANEL_ENTERContainer", "Confirm", "", new Object[] {});
                        }
                     }
                  }
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1528Y2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S172 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1728Y2( )
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

   public void e1828Y2( )
   {
      /* 'DoUserAction1' Routine */
      returnInSub = false ;
      httpContext.popup(formatLink("app.formulaciontinte.tunmefoprompt", new String[] {GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV63UndFormula,1,0)),GXutil.URLEncode(GXutil.rtrim(AV45ForPrdDsc))}, new String[] {"InOutEmprCod","InOutForPrdUMe","InOutForPrdDsc"}) , new Object[] {"AV5EmprCod","AV63UndFormula","AV45ForPrdDsc"});
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void e1128Y2( )
   {
      /* Combo_prdnum_Onoptionclicked Routine */
      returnInSub = false ;
      AV42PrdNum = Combo_prdnum_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42PrdNum", AV42PrdNum);
      /* Execute user subroutine: 'UNIDADPRODUCTO' */
      S182 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV20OrderedBy, 4, 0))+":"+(AV21OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         httpContext.popup(formatLink("app.formulaciontinte.colorproductos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A715PrdLin,3,0))}, new String[] {"Mode","EmprCod","ForNumCol","PrdLin"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      httpContext.popup(formatLink("app.formulaciontinte.colorproductos_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(AV5EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV6ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A715PrdLin,3,0))}, new String[] {"Mode","EmprCod","ForNumCol","PrdLin"}) , new Object[] {});
      System.out.println( httpContext.getMessage( "---calculo coste-----", "") );
      GXv_char4[0] = AV5EmprCod ;
      GXv_int12[0] = AV7Clicod ;
      GXv_char3[0] = AV8Forser ;
      GXv_char2[0] = AV9Forcolnom ;
      GXv_int13[0] = AV10Forcolnum ;
      GXv_int8[0] = AV11TipColcod ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int15[0] = (int)(DecimalUtil.decToDouble(AV12ForRelBan)) ;
      GXv_char16[0] = " " ;
      GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2, GXv_int13, GXv_int8, GXv_decimal14, GXv_int15, GXv_char16, GXv_decimal17) ;
      colorproductosvariables__wp_impl.this.AV5EmprCod = GXv_char4[0] ;
      colorproductosvariables__wp_impl.this.AV7Clicod = GXv_int12[0] ;
      colorproductosvariables__wp_impl.this.AV8Forser = GXv_char3[0] ;
      colorproductosvariables__wp_impl.this.AV9Forcolnom = GXv_char2[0] ;
      colorproductosvariables__wp_impl.this.AV10Forcolnum = GXv_int13[0] ;
      colorproductosvariables__wp_impl.this.AV11TipColcod = GXv_int8[0] ;
      colorproductosvariables__wp_impl.this.AV12ForRelBan = DecimalUtil.doubleToDec(GXv_int15[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Clicod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Forser", AV8Forser);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Forcolnom", AV9Forcolnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Forcolnum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColcod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForRelBan", GXutil.ltrimstr( AV12ForRelBan, 7, 2));
      GXv_char16[0] = AV5EmprCod ;
      GXv_char4[0] = AV49Station ;
      GXv_decimal17[0] = AV52Valor_cor ;
      new app.pcoscor(remoteHandle, context).execute( GXv_char16, GXv_char4, GXv_decimal17) ;
      colorproductosvariables__wp_impl.this.AV5EmprCod = GXv_char16[0] ;
      colorproductosvariables__wp_impl.this.AV49Station = GXv_char4[0] ;
      colorproductosvariables__wp_impl.this.AV52Valor_cor = GXv_decimal17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV49Station", AV49Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV52Valor_cor", GXutil.ltrimstr( AV52Valor_cor, 11, 5));
      GXv_char16[0] = AV5EmprCod ;
      GXv_int15[0] = AV7Clicod ;
      GXv_char4[0] = AV8Forser ;
      GXv_char3[0] = AV9Forcolnom ;
      GXv_int13[0] = AV10Forcolnum ;
      GXv_int8[0] = AV11TipColcod ;
      GXv_decimal17[0] = AV52Valor_cor ;
      new app.pupdcos(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_decimal17) ;
      colorproductosvariables__wp_impl.this.AV5EmprCod = GXv_char16[0] ;
      colorproductosvariables__wp_impl.this.AV7Clicod = GXv_int15[0] ;
      colorproductosvariables__wp_impl.this.AV8Forser = GXv_char4[0] ;
      colorproductosvariables__wp_impl.this.AV9Forcolnom = GXv_char3[0] ;
      colorproductosvariables__wp_impl.this.AV10Forcolnum = GXv_int13[0] ;
      colorproductosvariables__wp_impl.this.AV11TipColcod = GXv_int8[0] ;
      colorproductosvariables__wp_impl.this.AV52Valor_cor = GXv_decimal17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Clicod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Forser", AV8Forser);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Forcolnom", AV9Forcolnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Forcolnum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColcod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV52Valor_cor", GXutil.ltrimstr( AV52Valor_cor, 11, 5));
      System.out.println( httpContext.getMessage( "Coste= ", "")+GXutil.str( AV52Valor_cor, 11, 5) );
      httpContext.doAjaxRefresh();
   }

   public void S172( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      AV44ForPrdUMe = AV63UndFormula ;
      new app.formulaciontinte.colorproductos_ins_upd(remoteHandle, context).execute( AV5EmprCod, AV6ForNumCol, AV41PrdLin, AV42PrdNum, AV44ForPrdUMe, AV43ForPrdCan, AV46ForPrdNor) ;
      new app.formulaciontinte.colorcolorantes_prdultlin(remoteHandle, context).execute( AV5EmprCod, AV6ForNumCol) ;
      AV63UndFormula = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63UndFormula", GXutil.str( AV63UndFormula, 1, 0));
      AV43ForPrdCan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV43ForPrdCan", GXutil.ltrimstr( AV43ForPrdCan, 11, 5));
      AV46ForPrdNor = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46ForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ForPrdNor), 4, 0));
      AV42PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV42PrdNum", AV42PrdNum);
      Combo_prdnum_Selectedvalue_set = AV42PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      System.out.println( httpContext.getMessage( "---calculo coste-----", "") );
      GXv_char16[0] = AV5EmprCod ;
      GXv_int15[0] = AV7Clicod ;
      GXv_char4[0] = AV8Forser ;
      GXv_char3[0] = AV9Forcolnom ;
      GXv_int13[0] = AV10Forcolnum ;
      GXv_int8[0] = AV11TipColcod ;
      GXv_decimal17[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int12[0] = (int)(DecimalUtil.decToDouble(AV12ForRelBan)) ;
      GXv_char2[0] = " " ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_decimal17, GXv_int12, GXv_char2, GXv_decimal14) ;
      colorproductosvariables__wp_impl.this.AV5EmprCod = GXv_char16[0] ;
      colorproductosvariables__wp_impl.this.AV7Clicod = GXv_int15[0] ;
      colorproductosvariables__wp_impl.this.AV8Forser = GXv_char4[0] ;
      colorproductosvariables__wp_impl.this.AV9Forcolnom = GXv_char3[0] ;
      colorproductosvariables__wp_impl.this.AV10Forcolnum = GXv_int13[0] ;
      colorproductosvariables__wp_impl.this.AV11TipColcod = GXv_int8[0] ;
      colorproductosvariables__wp_impl.this.AV12ForRelBan = DecimalUtil.doubleToDec(GXv_int12[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Clicod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Forser", AV8Forser);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Forcolnom", AV9Forcolnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Forcolnum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColcod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForRelBan", GXutil.ltrimstr( AV12ForRelBan, 7, 2));
      GXv_char16[0] = AV5EmprCod ;
      GXv_char4[0] = AV49Station ;
      GXv_decimal17[0] = AV52Valor_cor ;
      new app.pcoscor(remoteHandle, context).execute( GXv_char16, GXv_char4, GXv_decimal17) ;
      colorproductosvariables__wp_impl.this.AV5EmprCod = GXv_char16[0] ;
      colorproductosvariables__wp_impl.this.AV49Station = GXv_char4[0] ;
      colorproductosvariables__wp_impl.this.AV52Valor_cor = GXv_decimal17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV49Station", AV49Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV52Valor_cor", GXutil.ltrimstr( AV52Valor_cor, 11, 5));
      GXv_char16[0] = AV5EmprCod ;
      GXv_int15[0] = AV7Clicod ;
      GXv_char4[0] = AV8Forser ;
      GXv_char3[0] = AV9Forcolnom ;
      GXv_int13[0] = AV10Forcolnum ;
      GXv_int8[0] = AV11TipColcod ;
      GXv_decimal17[0] = AV52Valor_cor ;
      new app.pupdcos(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_decimal17) ;
      colorproductosvariables__wp_impl.this.AV5EmprCod = GXv_char16[0] ;
      colorproductosvariables__wp_impl.this.AV7Clicod = GXv_int15[0] ;
      colorproductosvariables__wp_impl.this.AV8Forser = GXv_char4[0] ;
      colorproductosvariables__wp_impl.this.AV9Forcolnom = GXv_char3[0] ;
      colorproductosvariables__wp_impl.this.AV10Forcolnum = GXv_int13[0] ;
      colorproductosvariables__wp_impl.this.AV11TipColcod = GXv_int8[0] ;
      colorproductosvariables__wp_impl.this.AV52Valor_cor = GXv_decimal17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV7Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Clicod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV8Forser", AV8Forser);
      httpContext.ajax_rsp_assign_attri("", false, "AV9Forcolnom", AV9Forcolnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV10Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Forcolnum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColcod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV52Valor_cor", GXutil.ltrimstr( AV52Valor_cor, 11, 5));
      System.out.println( httpContext.getMessage( "Coste= ", "")+GXutil.str( AV52Valor_cor, 11, 5) );
      GXt_int9 = AV41PrdLin ;
      GXv_int10[0] = GXt_int9 ;
      new app.formulaciontinte.getcolorproductos(remoteHandle, context).execute( AV5EmprCod, AV6ForNumCol, GXv_int10) ;
      colorproductosvariables__wp_impl.this.GXt_int9 = GXv_int10[0] ;
      AV41PrdLin = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV41PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41PrdLin), 3, 0));
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV22Session.getValue(AV66Pgmname+"GridState"), "") == 0 )
      {
         AV18GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV66Pgmname+"GridState"), null, null);
      }
      else
      {
         AV18GridState.fromxml(AV22Session.getValue(AV66Pgmname+"GridState"), null, null);
      }
      AV20OrderedBy = AV18GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV20OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV20OrderedBy), 4, 0));
      AV21OrderedDsc = AV18GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV21OrderedDsc", AV21OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV82GXV1 = 1 ;
      while ( AV82GXV1 <= AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV19GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV82GXV1));
         if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDLIN") == 0 )
         {
            AV23TFPrdLin = (short)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV23TFPrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV23TFPrdLin), 3, 0));
            AV24TFPrdLin_To = (short)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV24TFPrdLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24TFPrdLin_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV25TFPrdNum = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV25TFPrdNum", AV25TFPrdNum);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV26TFPrdNum_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26TFPrdNum_Sel", AV26TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV27TFPrdNom = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV27TFPrdNom", AV27TFPrdNom);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV28TFPrdNom_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28TFPrdNom_Sel", AV28TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDCAN") == 0 )
         {
            AV29TFForPrdCan = CommonUtil.decimalVal( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29TFForPrdCan", GXutil.ltrimstr( AV29TFForPrdCan, 11, 5));
            AV30TFForPrdCan_To = CommonUtil.decimalVal( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV30TFForPrdCan_To", GXutil.ltrimstr( AV30TFForPrdCan_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV31TFForPrdUMe = (byte)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV31TFForPrdUMe", GXutil.str( AV31TFForPrdUMe, 1, 0));
            AV32TFForPrdUMe_To = (byte)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFForPrdUMe_To", GXutil.str( AV32TFForPrdUMe_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV33TFForPrdDsc = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFForPrdDsc", AV33TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV34TFForPrdDsc_Sel = AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFForPrdDsc_Sel", AV34TFForPrdDsc_Sel);
         }
         else if ( GXutil.strcmp(AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDNOR") == 0 )
         {
            AV35TFForPrdNor = (short)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV35TFForPrdNor), 4, 0));
            AV36TFForPrdNor_To = (short)(GXutil.lval( AV19GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFForPrdNor_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV36TFForPrdNor_To), 4, 0));
         }
         AV82GXV1 = (int)(AV82GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char16[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV26TFPrdNum_Sel)==0), AV26TFPrdNum_Sel, GXv_char16) ;
      colorproductosvariables__wp_impl.this.GXt_char1 = GXv_char16[0] ;
      GXt_char18 = "" ;
      GXv_char4[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV28TFPrdNom_Sel)==0), AV28TFPrdNom_Sel, GXv_char4) ;
      colorproductosvariables__wp_impl.this.GXt_char18 = GXv_char4[0] ;
      GXt_char19 = "" ;
      GXv_char3[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFForPrdDsc_Sel)==0), AV34TFForPrdDsc_Sel, GXv_char3) ;
      colorproductosvariables__wp_impl.this.GXt_char19 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char18+"|||"+GXt_char19+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char19 = "" ;
      GXv_char16[0] = GXt_char19 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV25TFPrdNum)==0), AV25TFPrdNum, GXv_char16) ;
      colorproductosvariables__wp_impl.this.GXt_char19 = GXv_char16[0] ;
      GXt_char18 = "" ;
      GXv_char4[0] = GXt_char18 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV27TFPrdNom)==0), AV27TFPrdNom, GXv_char4) ;
      colorproductosvariables__wp_impl.this.GXt_char18 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV33TFForPrdDsc)==0), AV33TFForPrdDsc, GXv_char3) ;
      colorproductosvariables__wp_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV23TFPrdLin) ? "" : GXutil.str( AV23TFPrdLin, 3, 0))+"|"+GXt_char19+"|"+GXt_char18+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFForPrdCan)==0) ? "" : GXutil.str( AV29TFForPrdCan, 11, 5))+"|"+((0==AV31TFForPrdUMe) ? "" : GXutil.str( AV31TFForPrdUMe, 1, 0))+"|"+GXt_char1+"|"+((0==AV35TFForPrdNor) ? "" : GXutil.str( AV35TFForPrdNor, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV24TFPrdLin_To) ? "" : GXutil.str( AV24TFPrdLin_To, 3, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFForPrdCan_To)==0) ? "" : GXutil.str( AV30TFForPrdCan_To, 11, 5))+"|"+((0==AV32TFForPrdUMe_To) ? "" : GXutil.str( AV32TFForPrdUMe_To, 1, 0))+"||"+((0==AV36TFForPrdNor_To) ? "" : GXutil.str( AV36TFForPrdNor_To, 4, 0)) ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV18GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV18GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV18GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV18GridState.fromxml(AV22Session.getValue(AV66Pgmname+"GridState"), null, null);
      AV18GridState.setgxTv_SdtWWPGridState_Orderedby( AV20OrderedBy );
      AV18GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV21OrderedDsc );
      AV18GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState20[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFPRDLIN", "", !((0==AV23TFPrdLin)&&(0==AV24TFPrdLin_To)), (short)(0), GXutil.trim( GXutil.str( AV23TFPrdLin, 3, 0)), GXutil.trim( GXutil.str( AV24TFPrdLin_To, 3, 0))) ;
      AV18GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFPRDNUM", "", !(GXutil.strcmp("", AV25TFPrdNum)==0), (short)(0), AV25TFPrdNum, "", !(GXutil.strcmp("", AV26TFPrdNum_Sel)==0), AV26TFPrdNum_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFPRDNOM", "", !(GXutil.strcmp("", AV27TFPrdNom)==0), (short)(0), AV27TFPrdNom, "", !(GXutil.strcmp("", AV28TFPrdNom_Sel)==0), AV28TFPrdNom_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFFORPRDCAN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV29TFForPrdCan)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV30TFForPrdCan_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV29TFForPrdCan, 11, 5)), GXutil.trim( GXutil.str( AV30TFForPrdCan_To, 11, 5))) ;
      AV18GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFFORPRDUME", "", !((0==AV31TFForPrdUMe)&&(0==AV32TFForPrdUMe_To)), (short)(0), GXutil.trim( GXutil.str( AV31TFForPrdUMe, 1, 0)), GXutil.trim( GXutil.str( AV32TFForPrdUMe_To, 1, 0))) ;
      AV18GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV33TFForPrdDsc)==0), (short)(0), AV33TFForPrdDsc, "", !(GXutil.strcmp("", AV34TFForPrdDsc_Sel)==0), AV34TFForPrdDsc_Sel, "") ;
      AV18GridState = GXv_SdtWWPGridState20[0] ;
      GXv_SdtWWPGridState20[0] = AV18GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState20, "TFFORPRDNOR", "", !((0==AV35TFForPrdNor)&&(0==AV36TFForPrdNor_To)), (short)(0), GXutil.trim( GXutil.str( AV35TFForPrdNor, 4, 0)), GXutil.trim( GXutil.str( AV36TFForPrdNor_To, 4, 0))) ;
      AV18GridState = GXv_SdtWWPGridState20[0] ;
      AV18GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV18GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV66Pgmname+"GridState", AV18GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV16TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV16TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV66Pgmname );
      AV16TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV16TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV15HTTPRequest.getScriptName()+"?"+AV15HTTPRequest.getQuerystring() );
      AV16TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LPRFOR" );
      AV22Session.setValue("TrnContext", AV16TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      /* Using cursor H028Y4 */
      pr_default.execute(2);
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H028Y4_A396EmprCod[0] ;
         A856ValCod = H028Y4_A856ValCod[0] ;
         A13747PrdCDsc = H028Y4_A13747PrdCDsc[0] ;
         A719PrdNum = H028Y4_A719PrdNum[0] ;
         A718PrdNom = H028Y4_A718PrdNom[0] ;
         AV48Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV48Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV48Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV47PrdNum_Data.add(AV48Combo_DataItem, 0);
         pr_default.readNext(2);
      }
      pr_default.close(2);
      Combo_prdnum_Selectedvalue_set = AV42PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
   }

   public void e1928Y2( )
   {
      /* Forprdnor_Controlvaluechanged Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      AV57existecardinal = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57existecardinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57existecardinal), 4, 0));
      AV58Mensaje = "" ;
      if ( ! (0==AV46ForPrdNor) )
      {
         GXv_int10[0] = AV57existecardinal ;
         GXv_char16[0] = AV58Mensaje ;
         new app.formulaciontinte.existecardinalenprocesoquimico(remoteHandle, context).execute( AV5EmprCod, AV7Clicod, AV8Forser, AV9Forcolnom, AV10Forcolnum, AV11TipColcod, AV46ForPrdNor, AV42PrdNum, GXv_int10, GXv_char16) ;
         colorproductosvariables__wp_impl.this.AV57existecardinal = GXv_int10[0] ;
         colorproductosvariables__wp_impl.this.AV58Mensaje = GXv_char16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV57existecardinal", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV57existecardinal), 4, 0));
         if ( ! (GXutil.strcmp("", AV58Mensaje)==0) )
         {
            lblTbmessage_Caption = AV58Mensaje ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         }
      }
      /*  Sending Event outputs  */
   }

   public void e2028Y2( )
   {
      /* Prdlin_Controlvaluechanged Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( AV41PrdLin > 0 )
      {
         GXv_char16[0] = AV42PrdNum ;
         GXv_int8[0] = AV63UndFormula ;
         GXv_char4[0] = AV45ForPrdDsc ;
         GXv_decimal17[0] = AV43ForPrdCan ;
         GXv_int10[0] = AV46ForPrdNor ;
         new app.formulaciontinte.obtenerdatosprdlin(remoteHandle, context).execute( AV5EmprCod, AV6ForNumCol, AV41PrdLin, GXv_char16, GXv_int8, GXv_char4, GXv_decimal17, GXv_int10) ;
         colorproductosvariables__wp_impl.this.AV42PrdNum = GXv_char16[0] ;
         colorproductosvariables__wp_impl.this.AV63UndFormula = GXv_int8[0] ;
         colorproductosvariables__wp_impl.this.AV45ForPrdDsc = GXv_char4[0] ;
         colorproductosvariables__wp_impl.this.AV43ForPrdCan = GXv_decimal17[0] ;
         colorproductosvariables__wp_impl.this.AV46ForPrdNor = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42PrdNum", AV42PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV63UndFormula", GXutil.str( AV63UndFormula, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV45ForPrdDsc", AV45ForPrdDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV43ForPrdCan", GXutil.ltrimstr( AV43ForPrdCan, 11, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV46ForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ForPrdNor), 4, 0));
         Combo_prdnum_Selectedvalue_set = AV42PrdNum ;
         ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      }
      /*  Sending Event outputs  */
   }

   public void e2128Y2( )
   {
      /* Undformula_Controlvaluechanged Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      GXv_char16[0] = AV5EmprCod ;
      GXv_int8[0] = AV63UndFormula ;
      GXv_char4[0] = AV45ForPrdDsc ;
      new app.pbusumed(remoteHandle, context).execute( GXv_char16, GXv_int8, GXv_char4) ;
      colorproductosvariables__wp_impl.this.AV5EmprCod = GXv_char16[0] ;
      colorproductosvariables__wp_impl.this.AV63UndFormula = GXv_int8[0] ;
      colorproductosvariables__wp_impl.this.AV45ForPrdDsc = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV63UndFormula", GXutil.str( AV63UndFormula, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV45ForPrdDsc", AV45ForPrdDsc);
      GXt_char19 = AV62ForPrdDsccontrol ;
      GXv_char16[0] = GXt_char19 ;
      new app.get_forprddsc(remoteHandle, context).execute( AV5EmprCod, AV63UndFormula, GXv_char16) ;
      colorproductosvariables__wp_impl.this.GXt_char19 = GXv_char16[0] ;
      AV62ForPrdDsccontrol = GXt_char19 ;
      if ( GXutil.strcmp(AV62ForPrdDsccontrol, httpContext.getMessage( "Error", "")) == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO es una UNIDAD Valida", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavUndformula_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      /*  Sending Event outputs  */
   }

   public void e2628Y2( )
   {
      /* PrdLin_Click Routine */
      returnInSub = false ;
      lblTbmessage_Caption = " " ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      if ( AV41PrdLin > 0 )
      {
         AV61Acciongridmodificar = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV61Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV61Acciongridmodificar), 4, 0));
         AV41PrdLin = A715PrdLin ;
         httpContext.ajax_rsp_assign_attri("", false, "AV41PrdLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV41PrdLin), 3, 0));
         GXv_char16[0] = AV42PrdNum ;
         GXv_int8[0] = AV63UndFormula ;
         GXv_char4[0] = AV45ForPrdDsc ;
         GXv_decimal17[0] = AV43ForPrdCan ;
         GXv_int10[0] = AV46ForPrdNor ;
         new app.formulaciontinte.obtenerdatosprdlin(remoteHandle, context).execute( AV5EmprCod, AV6ForNumCol, AV41PrdLin, GXv_char16, GXv_int8, GXv_char4, GXv_decimal17, GXv_int10) ;
         colorproductosvariables__wp_impl.this.AV42PrdNum = GXv_char16[0] ;
         colorproductosvariables__wp_impl.this.AV63UndFormula = GXv_int8[0] ;
         colorproductosvariables__wp_impl.this.AV45ForPrdDsc = GXv_char4[0] ;
         colorproductosvariables__wp_impl.this.AV43ForPrdCan = GXv_decimal17[0] ;
         colorproductosvariables__wp_impl.this.AV46ForPrdNor = GXv_int10[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV42PrdNum", AV42PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV63UndFormula", GXutil.str( AV63UndFormula, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV45ForPrdDsc", AV45ForPrdDsc);
         httpContext.ajax_rsp_assign_attri("", false, "AV43ForPrdCan", GXutil.ltrimstr( AV43ForPrdCan, 11, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV46ForPrdNor", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46ForPrdNor), 4, 0));
         Combo_prdnum_Selectedvalue_set = AV42PrdNum ;
         ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
         GX_FocusControl = edtavForprdcan_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
         httpContext.doAjaxRefresh();
      }
      /*  Sending Event outputs  */
   }

   public void S182( )
   {
      /* 'UNIDADPRODUCTO' Routine */
      returnInSub = false ;
      AV63UndFormula = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV63UndFormula", GXutil.str( AV63UndFormula, 1, 0));
      AV45ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV45ForPrdDsc", AV45ForPrdDsc);
      /* Using cursor H028Y5 */
      pr_default.execute(3, new Object[] {AV5EmprCod, AV42PrdNum});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A719PrdNum = H028Y5_A719PrdNum[0] ;
         A396EmprCod = H028Y5_A396EmprCod[0] ;
         A4338PrdUMeFo = H028Y5_A4338PrdUMeFo[0] ;
         AV63UndFormula = A4338PrdUMeFo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV63UndFormula", GXutil.str( AV63UndFormula, 1, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(3);
      if ( AV63UndFormula > 0 )
      {
         GXv_char16[0] = AV5EmprCod ;
         GXv_int8[0] = AV63UndFormula ;
         GXv_char4[0] = AV45ForPrdDsc ;
         new app.pbusumed(remoteHandle, context).execute( GXv_char16, GXv_int8, GXv_char4) ;
         colorproductosvariables__wp_impl.this.AV5EmprCod = GXv_char16[0] ;
         colorproductosvariables__wp_impl.this.AV63UndFormula = GXv_int8[0] ;
         colorproductosvariables__wp_impl.this.AV45ForPrdDsc = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV63UndFormula", GXutil.str( AV63UndFormula, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV45ForPrdDsc", AV45ForPrdDsc);
      }
   }

   public void wb_table2_113_28Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTabledvelop_confirmpanel_enter_Internalname, tblTabledvelop_confirmpanel_enter_Internalname, "", "Table", 0, "", "", 1, 2, sStyleString, "", "", 0);
         httpContext.writeText( "<tbody>") ;
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td data-align=\"center\"  style=\""+GXutil.CssPrettify( "text-align:-khtml-center;text-align:-moz-center;text-align:-webkit-center")+"\">") ;
         /* User Defined Control */
         ucDvelop_confirmpanel_enter.setProperty("Title", Dvelop_confirmpanel_enter_Title);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmationText", Dvelop_confirmpanel_enter_Confirmationtext);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonCaption", Dvelop_confirmpanel_enter_Yesbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("NoButtonCaption", Dvelop_confirmpanel_enter_Nobuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("CancelButtonCaption", Dvelop_confirmpanel_enter_Cancelbuttoncaption);
         ucDvelop_confirmpanel_enter.setProperty("YesButtonPosition", Dvelop_confirmpanel_enter_Yesbuttonposition);
         ucDvelop_confirmpanel_enter.setProperty("ConfirmType", Dvelop_confirmpanel_enter_Confirmtype);
         ucDvelop_confirmpanel_enter.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_enter_Internalname, "DVELOP_CONFIRMPANEL_ENTERContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_ENTERContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_113_28Y2e( true) ;
      }
      else
      {
         wb_table2_113_28Y2e( false) ;
      }
   }

   public void wb_table1_64_28Y2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedforprdnor_Internalname, tblTablemergedforprdnor_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprdnor_Internalname, httpContext.getMessage( "For Prd Nor", ""), "gx-form-item AttributeLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'" + sGXsfl_89_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprdnor_Internalname, GXutil.ltrim( localUtil.ntoc( AV46ForPrdNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForprdnor_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV46ForPrdNor), "ZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV46ForPrdNor), "ZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,68);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprdnor_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavForprdnor_Enabled, 0, "text", "1", 4, "chr", 1, "row", 4, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPrompt_forprdnor_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPrompt_forprdnor_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPrompt_forprdnor_Internalname, sImgUrl, imgPrompt_forprdnor_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\ColorProductosVariables__WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_64_28Y2e( true) ;
      }
      else
      {
         wb_table1_64_28Y2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV5EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5EmprCod", AV5EmprCod);
      AV6ForNumCol = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6ForNumCol), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV6ForNumCol), "ZZZZZZZ9")));
      AV56ValCon = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV56ValCon", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56ValCon), 4, 0));
      AV55FlagModC = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV55FlagModC", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55FlagModC), 4, 0));
      AV7Clicod = ((Number) GXutil.testNumericType( getParm(obj,4), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7Clicod), 6, 0));
      AV8Forser = (String)getParm(obj,5) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Forser", AV8Forser);
      AV9Forcolnom = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Forcolnom", AV9Forcolnom);
      AV10Forcolnum = ((Number) GXutil.testNumericType( getParm(obj,7), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Forcolnum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Forcolnum), 6, 0));
      AV11TipColcod = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11TipColcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV11TipColcod), 2, 0));
      AV12ForRelBan = (java.math.BigDecimal)getParm(obj,9) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12ForRelBan", GXutil.ltrimstr( AV12ForRelBan, 7, 2));
      AV54CosKgmF = (java.math.BigDecimal)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV54CosKgmF", GXutil.ltrimstr( AV54CosKgmF, 13, 5));
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
      pa28Y2( ) ;
      ws28Y2( ) ;
      we28Y2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?2026821161582", true, true);
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
      httpContext.AddJavascriptSource("formulaciontinte/colorproductosvariables__wp.js", "?2026821161582", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_892( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_89_idx );
      edtPrdLin_Internalname = "PRDLIN_"+sGXsfl_89_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_89_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_89_idx ;
      edtForPrdCan_Internalname = "FORPRDCAN_"+sGXsfl_89_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_89_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_89_idx ;
      edtForPrdNor_Internalname = "FORPRDNOR_"+sGXsfl_89_idx ;
   }

   public void subsflControlProps_fel_892( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_89_fel_idx );
      edtPrdLin_Internalname = "PRDLIN_"+sGXsfl_89_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_89_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_89_fel_idx ;
      edtForPrdCan_Internalname = "FORPRDCAN_"+sGXsfl_89_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_89_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_89_fel_idx ;
      edtForPrdNor_Internalname = "FORPRDNOR_"+sGXsfl_89_fel_idx ;
   }

   public void sendrow_892( )
   {
      subsflControlProps_892( ) ;
      wb28Y0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_89_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_89_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_89_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 90,'',false,'"+sGXsfl_89_idx+"',89)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_89_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV53GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV53GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV53GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_89_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,90);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV53GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_89_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdLin_Internalname,GXutil.ltrim( localUtil.ntoc( A715PrdLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A715PrdLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"EPRDLIN.CLICK."+sGXsfl_89_idx+"'","","","","",edtPrdLin_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdCan_Internalname,GXutil.ltrim( localUtil.ntoc( A487ForPrdCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A487ForPrdCan, "ZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdNor_Internalname,GXutil.ltrim( localUtil.ntoc( A489ForPrdNor, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A489ForPrdNor), "ZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdNor_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(89),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         send_integrity_lvl_hashes28Y2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_89_idx = ((subGrid_Islastpage==1)&&(nGXsfl_89_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_89_idx+1) ;
         sGXsfl_89_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_89_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_892( ) ;
      }
      /* End function sendrow_892 */
   }

   public void startgridcontrol89( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"89\">") ;
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
         httpContext.writeValue( "#") ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cantidad Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Orden(#)", "")) ;
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A715PrdLin, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A487ForPrdCan, (byte)(11), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A489ForPrdNor, (byte)(4), (byte)(0), ".", "")));
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
      edtavFornumcol_Internalname = "vFORNUMCOL" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      edtavPrdlin_Internalname = "vPRDLIN" ;
      lblTextblockcombo_prdnum_Internalname = "TEXTBLOCKCOMBO_PRDNUM" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      divTablesplittedprdnum_Internalname = "TABLESPLITTEDPRDNUM" ;
      edtavForprdcan_Internalname = "vFORPRDCAN" ;
      edtavUndformula_Internalname = "vUNDFORMULA" ;
      imgUseraction1_Internalname = "USERACTION1" ;
      edtavForprddsc_Internalname = "vFORPRDDSC" ;
      lblTextblockforprdnor_Internalname = "TEXTBLOCKFORPRDNOR" ;
      edtavForprdnor_Internalname = "vFORPRDNOR" ;
      imgPrompt_forprdnor_Internalname = "PROMPT_FORPRDNOR" ;
      tblTablemergedforprdnor_Internalname = "TABLEMERGEDFORPRDNOR" ;
      divTablesplittedforprdnor_Internalname = "TABLESPLITTEDFORPRDNOR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      lblTbmessage_Internalname = "TBMESSAGE" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtPrdLin_Internalname = "PRDLIN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtForPrdCan_Internalname = "FORPRDCAN" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtForPrdNor_Internalname = "FORPRDNOR" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      edtavPrdnum_Internalname = "vPRDNUM" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Dvelop_confirmpanel_enter_Internalname = "DVELOP_CONFIRMPANEL_ENTER" ;
      tblTabledvelop_confirmpanel_enter_Internalname = "TABLEDVELOP_CONFIRMPANEL_ENTER" ;
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
      edtForPrdNor_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForPrdCan_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdLin_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      imgPrompt_forprdnor_Link = "" ;
      edtavForprdnor_Jsonclick = "" ;
      edtavForprdnor_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      edtavForprddsc_Jsonclick = "" ;
      edtavForprddsc_Enabled = 1 ;
      edtavUndformula_Jsonclick = "" ;
      edtavUndformula_Enabled = 1 ;
      edtavForprdcan_Jsonclick = "" ;
      edtavForprdcan_Enabled = 1 ;
      edtavPrdlin_Jsonclick = "" ;
      edtavPrdlin_Enabled = 1 ;
      edtavFornumcol_Jsonclick = "" ;
      edtavFornumcol_Enabled = 0 ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma la Linea?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.ColorProductosVariables__WPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|||Dynamic|" ;
      Ddo_grid_Includedatalist = "|T|T|||T|" ;
      Ddo_grid_Filterisrange = "T|||T|T||T" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Numeric|Character|Numeric" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7|8" ;
      Ddo_grid_Columnids = "1:PrdLin|2:PrdNum|3:PrdNom|4:ForPrdCan|5:ForPrdUMe|6:ForPrdDsc|7:ForPrdNor" ;
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
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = "" ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Cls = "ExtendedCombo Attribute" ;
      Dvpanel_tableheader_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Iconposition = "Right" ;
      Dvpanel_tableheader_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_tableheader_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_tableheader_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_tableheader_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_tableheader_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Productos Variables (#)", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_89_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV53GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV53GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53GridActionGroup1), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV23TFPrdLin',fld:'vTFPRDLIN',pic:'ZZ9'},{av:'AV24TFPrdLin_To',fld:'vTFPRDLIN_TO',pic:'ZZ9'},{av:'AV25TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV26TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV27TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFForPrdCan',fld:'vTFFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV30TFForPrdCan_To',fld:'vTFFORPRDCAN_TO',pic:'ZZZZ9.99999'},{av:'AV31TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV32TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV33TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV34TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV35TFForPrdNor',fld:'vTFFORPRDNOR',pic:'ZZZ9'},{av:'AV36TFForPrdNor_To',fld:'vTFFORPRDNOR_TO',pic:'ZZZ9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV41PrdLin',fld:'vPRDLIN',pic:'ZZ9'}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1228Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV23TFPrdLin',fld:'vTFPRDLIN',pic:'ZZ9'},{av:'AV24TFPrdLin_To',fld:'vTFPRDLIN_TO',pic:'ZZ9'},{av:'AV25TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV26TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV27TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFForPrdCan',fld:'vTFFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV30TFForPrdCan_To',fld:'vTFFORPRDCAN_TO',pic:'ZZZZ9.99999'},{av:'AV31TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV32TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV33TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV34TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV35TFForPrdNor',fld:'vTFFORPRDNOR',pic:'ZZZ9'},{av:'AV36TFForPrdNor_To',fld:'vTFFORPRDNOR_TO',pic:'ZZZ9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1328Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV23TFPrdLin',fld:'vTFPRDLIN',pic:'ZZ9'},{av:'AV24TFPrdLin_To',fld:'vTFPRDLIN_TO',pic:'ZZ9'},{av:'AV25TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV26TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV27TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFForPrdCan',fld:'vTFFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV30TFForPrdCan_To',fld:'vTFFORPRDCAN_TO',pic:'ZZZZ9.99999'},{av:'AV31TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV32TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV33TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV34TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV35TFForPrdNor',fld:'vTFFORPRDNOR',pic:'ZZZ9'},{av:'AV36TFForPrdNor_To',fld:'vTFFORPRDNOR_TO',pic:'ZZZ9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1428Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV23TFPrdLin',fld:'vTFPRDLIN',pic:'ZZ9'},{av:'AV24TFPrdLin_To',fld:'vTFPRDLIN_TO',pic:'ZZ9'},{av:'AV25TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV26TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV27TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFForPrdCan',fld:'vTFFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV30TFForPrdCan_To',fld:'vTFFORPRDCAN_TO',pic:'ZZZZ9.99999'},{av:'AV31TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV32TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV33TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV34TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV35TFForPrdNor',fld:'vTFFORPRDNOR',pic:'ZZZ9'},{av:'AV36TFForPrdNor_To',fld:'vTFFORPRDNOR_TO',pic:'ZZZ9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV35TFForPrdNor',fld:'vTFFORPRDNOR',pic:'ZZZ9'},{av:'AV36TFForPrdNor_To',fld:'vTFFORPRDNOR_TO',pic:'ZZZ9'},{av:'AV33TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV34TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV31TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV32TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV29TFForPrdCan',fld:'vTFFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV30TFForPrdCan_To',fld:'vTFFORPRDCAN_TO',pic:'ZZZZ9.99999'},{av:'AV27TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV25TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV26TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV23TFPrdLin',fld:'vTFPRDLIN',pic:'ZZ9'},{av:'AV24TFPrdLin_To',fld:'vTFPRDLIN_TO',pic:'ZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2428Y2',iparms:[]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV53GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2528Y2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV53GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV23TFPrdLin',fld:'vTFPRDLIN',pic:'ZZ9'},{av:'AV24TFPrdLin_To',fld:'vTFPRDLIN_TO',pic:'ZZ9'},{av:'AV25TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV26TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV27TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFForPrdCan',fld:'vTFFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV30TFForPrdCan_To',fld:'vTFFORPRDCAN_TO',pic:'ZZZZ9.99999'},{av:'AV31TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV32TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV33TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV34TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV35TFForPrdNor',fld:'vTFFORPRDNOR',pic:'ZZZ9'},{av:'AV36TFForPrdNor_To',fld:'vTFFORPRDNOR_TO',pic:'ZZZ9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'A715PrdLin',fld:'PRDLIN',pic:'ZZ9',hsh:true},{av:'AV7Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8Forser',fld:'vFORSER',pic:''},{av:'AV9Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV10Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV12ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV49Station',fld:'vSTATION',pic:''},{av:'AV52Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV53GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV12ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV11TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV10Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV9Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV8Forser',fld:'vFORSER',pic:''},{av:'AV7Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV49Station',fld:'vSTATION',pic:''},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV41PrdLin',fld:'vPRDLIN',pic:'ZZ9'}]}");
      setEventMetadata("ENTER","{handler:'e1628Y2',iparms:[{av:'AV41PrdLin',fld:'vPRDLIN',pic:'ZZ9'},{av:'AV42PrdNum',fld:'vPRDNUM',pic:''},{av:'AV43ForPrdCan',fld:'vFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV46ForPrdNor',fld:'vFORPRDNOR',pic:'ZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV63UndFormula',fld:'vUNDFORMULA',pic:'9'},{av:'AV7Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8Forser',fld:'vFORSER',pic:''},{av:'AV9Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV10Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV57existecardinal',fld:'vEXISTECARDINAL',pic:'ZZZ9'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV57existecardinal',fld:'vEXISTECARDINAL',pic:'ZZZ9'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e1528Y2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV23TFPrdLin',fld:'vTFPRDLIN',pic:'ZZ9'},{av:'AV24TFPrdLin_To',fld:'vTFPRDLIN_TO',pic:'ZZ9'},{av:'AV25TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV26TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV27TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFForPrdCan',fld:'vTFFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV30TFForPrdCan_To',fld:'vTFFORPRDCAN_TO',pic:'ZZZZ9.99999'},{av:'AV31TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV32TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV33TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV34TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV35TFForPrdNor',fld:'vTFFORPRDNOR',pic:'ZZZ9'},{av:'AV36TFForPrdNor_To',fld:'vTFFORPRDNOR_TO',pic:'ZZZ9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63UndFormula',fld:'vUNDFORMULA',pic:'9'},{av:'AV41PrdLin',fld:'vPRDLIN',pic:'ZZ9'},{av:'AV42PrdNum',fld:'vPRDNUM',pic:''},{av:'AV43ForPrdCan',fld:'vFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV46ForPrdNor',fld:'vFORPRDNOR',pic:'ZZZ9'},{av:'AV7Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8Forser',fld:'vFORSER',pic:''},{av:'AV9Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV10Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV12ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV49Station',fld:'vSTATION',pic:''},{av:'AV52Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV63UndFormula',fld:'vUNDFORMULA',pic:'9'},{av:'AV43ForPrdCan',fld:'vFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV46ForPrdNor',fld:'vFORPRDNOR',pic:'ZZZ9'},{av:'AV42PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV12ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV11TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV10Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV9Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV8Forser',fld:'vFORSER',pic:''},{av:'AV7Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV52Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV49Station',fld:'vSTATION',pic:''},{av:'AV41PrdLin',fld:'vPRDLIN',pic:'ZZ9'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1728Y2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("'DOUSERACTION1'","{handler:'e1828Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV23TFPrdLin',fld:'vTFPRDLIN',pic:'ZZ9'},{av:'AV24TFPrdLin_To',fld:'vTFPRDLIN_TO',pic:'ZZ9'},{av:'AV25TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV26TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV27TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFForPrdCan',fld:'vTFFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV30TFForPrdCan_To',fld:'vTFFORPRDCAN_TO',pic:'ZZZZ9.99999'},{av:'AV31TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV32TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV33TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV34TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV35TFForPrdNor',fld:'vTFFORPRDNOR',pic:'ZZZ9'},{av:'AV36TFForPrdNor_To',fld:'vTFFORPRDNOR_TO',pic:'ZZZ9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV63UndFormula',fld:'vUNDFORMULA',pic:'9'},{av:'AV45ForPrdDsc',fld:'vFORPRDDSC',pic:''}]");
      setEventMetadata("'DOUSERACTION1'",",oparms:[{av:'AV45ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV63UndFormula',fld:'vUNDFORMULA',pic:'9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV41PrdLin',fld:'vPRDLIN',pic:'ZZ9'}]}");
      setEventMetadata("COMBO_PRDNUM.ONOPTIONCLICKED","{handler:'e1128Y2',iparms:[{av:'Combo_prdnum_Selectedvalue_get',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_get'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV42PrdNum',fld:'vPRDNUM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'}]");
      setEventMetadata("COMBO_PRDNUM.ONOPTIONCLICKED",",oparms:[{av:'AV42PrdNum',fld:'vPRDNUM',pic:''},{av:'AV63UndFormula',fld:'vUNDFORMULA',pic:'9'},{av:'AV45ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("VFORPRDNOR.CONTROLVALUECHANGED","{handler:'e1928Y2',iparms:[{av:'AV46ForPrdNor',fld:'vFORPRDNOR',pic:'ZZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV7Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV8Forser',fld:'vFORSER',pic:''},{av:'AV9Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV10Forcolnum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV11TipColcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV42PrdNum',fld:'vPRDNUM',pic:''}]");
      setEventMetadata("VFORPRDNOR.CONTROLVALUECHANGED",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV57existecardinal',fld:'vEXISTECARDINAL',pic:'ZZZ9'}]}");
      setEventMetadata("VPRDLIN.CONTROLVALUECHANGED","{handler:'e2028Y2',iparms:[{av:'AV41PrdLin',fld:'vPRDLIN',pic:'ZZ9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VPRDLIN.CONTROLVALUECHANGED",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV46ForPrdNor',fld:'vFORPRDNOR',pic:'ZZZ9'},{av:'AV43ForPrdCan',fld:'vFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV45ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV63UndFormula',fld:'vUNDFORMULA',pic:'9'},{av:'AV42PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'}]}");
      setEventMetadata("VUNDFORMULA.CONTROLVALUECHANGED","{handler:'e2128Y2',iparms:[{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV63UndFormula',fld:'vUNDFORMULA',pic:'9'}]");
      setEventMetadata("VUNDFORMULA.CONTROLVALUECHANGED",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV45ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV63UndFormula',fld:'vUNDFORMULA',pic:'9'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("PRDLIN.CLICK","{handler:'e2628Y2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV5EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV6ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV23TFPrdLin',fld:'vTFPRDLIN',pic:'ZZ9'},{av:'AV24TFPrdLin_To',fld:'vTFPRDLIN_TO',pic:'ZZ9'},{av:'AV25TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV26TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV27TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV28TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV29TFForPrdCan',fld:'vTFFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV30TFForPrdCan_To',fld:'vTFFORPRDCAN_TO',pic:'ZZZZ9.99999'},{av:'AV31TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV32TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV33TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV34TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV35TFForPrdNor',fld:'vTFFORPRDNOR',pic:'ZZZ9'},{av:'AV36TFForPrdNor_To',fld:'vTFFORPRDNOR_TO',pic:'ZZZ9'},{av:'AV66Pgmname',fld:'vPGMNAME',pic:''},{av:'AV20OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV21OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV41PrdLin',fld:'vPRDLIN',pic:'ZZ9'},{av:'A715PrdLin',fld:'PRDLIN',pic:'ZZ9',hsh:true}]");
      setEventMetadata("PRDLIN.CLICK",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'},{av:'AV61Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV41PrdLin',fld:'vPRDLIN',pic:'ZZ9'},{av:'AV46ForPrdNor',fld:'vFORPRDNOR',pic:'ZZZ9'},{av:'AV43ForPrdCan',fld:'vFORPRDCAN',pic:'ZZZZ9.99999'},{av:'AV45ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV63UndFormula',fld:'vUNDFORMULA',pic:'9'},{av:'AV42PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV39GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV40GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'}]}");
      setEventMetadata("VALIDV_FORNUMCOL","{handler:'validv_Fornumcol',iparms:[]");
      setEventMetadata("VALIDV_FORNUMCOL",",oparms:[]}");
      setEventMetadata("VALIDV_PRDNUM","{handler:'validv_Prdnum',iparms:[]");
      setEventMetadata("VALIDV_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Forprdnor',iparms:[]");
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
      wcpOAV5EmprCod = "" ;
      wcpOAV8Forser = "" ;
      wcpOAV9Forcolnom = "" ;
      wcpOAV12ForRelBan = DecimalUtil.ZERO ;
      wcpOAV54CosKgmF = DecimalUtil.ZERO ;
      Gridpaginationbar_Selectedpage = "" ;
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Dvelop_confirmpanel_enter_Result = "" ;
      Combo_prdnum_Selectedvalue_get = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV5EmprCod = "" ;
      AV8Forser = "" ;
      AV9Forcolnom = "" ;
      AV12ForRelBan = DecimalUtil.ZERO ;
      AV54CosKgmF = DecimalUtil.ZERO ;
      AV25TFPrdNum = "" ;
      AV26TFPrdNum_Sel = "" ;
      AV27TFPrdNom = "" ;
      AV28TFPrdNom_Sel = "" ;
      AV29TFForPrdCan = DecimalUtil.ZERO ;
      AV30TFForPrdCan_To = DecimalUtil.ZERO ;
      AV33TFForPrdDsc = "" ;
      AV34TFForPrdDsc_Sel = "" ;
      AV66Pgmname = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV47PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV37DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      AV49Station = "" ;
      AV52Valor_cor = DecimalUtil.ZERO ;
      A396EmprCod = "" ;
      Combo_prdnum_Selectedvalue_set = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ClassString = "" ;
      StyleString = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockcombo_prdnum_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV43ForPrdCan = DecimalUtil.ZERO ;
      imgUseraction1_gximage = "" ;
      sImgUrl = "" ;
      imgUseraction1_Jsonclick = "" ;
      AV45ForPrdDsc = "" ;
      lblTextblockforprdnor_Jsonclick = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      lblTbmessage_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      AV42PrdNum = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A487ForPrdCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      scmdbuf = "" ;
      lV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum = "" ;
      lV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom = "" ;
      lV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc = "" ;
      AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel = "" ;
      AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum = "" ;
      AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel = "" ;
      AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom = "" ;
      AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan = DecimalUtil.ZERO ;
      AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to = DecimalUtil.ZERO ;
      AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel = "" ;
      AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc = "" ;
      H028Y2_A486ForNumCol = new int[1] ;
      H028Y2_A396EmprCod = new String[] {""} ;
      H028Y2_A489ForPrdNor = new short[1] ;
      H028Y2_A488ForPrdDsc = new String[] {""} ;
      H028Y2_n488ForPrdDsc = new boolean[] {false} ;
      H028Y2_A490ForPrdUMe = new byte[1] ;
      H028Y2_A487ForPrdCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H028Y2_A718PrdNom = new String[] {""} ;
      H028Y2_A719PrdNum = new String[] {""} ;
      H028Y2_A715PrdLin = new short[1] ;
      H028Y3_AGRID_nRecordCount = new long[1] ;
      hsh = "" ;
      AV50EmprNom = "" ;
      AV51UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV60prompt = "" ;
      imgPrompt_gximage = "" ;
      imgPrompt_Internalname = "" ;
      AV67Prompt_GXI = "" ;
      AV14WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV58Mensaje = "" ;
      AV62ForPrdDsccontrol = "" ;
      GXv_int12 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int15 = new int[1] ;
      GXv_int13 = new int[1] ;
      AV22Session = httpContext.getWebSession();
      AV18GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV19GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char18 = "" ;
      GXt_char1 = "" ;
      GXv_char3 = new String[1] ;
      GXv_SdtWWPGridState20 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV16TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV15HTTPRequest = httpContext.getHttpRequest();
      H028Y4_A396EmprCod = new String[] {""} ;
      H028Y4_A856ValCod = new byte[1] ;
      H028Y4_A13747PrdCDsc = new String[] {""} ;
      H028Y4_A719PrdNum = new String[] {""} ;
      H028Y4_A718PrdNom = new String[] {""} ;
      A13747PrdCDsc = "" ;
      AV48Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXt_char19 = "" ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      GXv_int10 = new short[1] ;
      H028Y5_A719PrdNum = new String[] {""} ;
      H028Y5_A396EmprCod = new String[] {""} ;
      H028Y5_A4338PrdUMeFo = new byte[1] ;
      GXv_char16 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char4 = new String[1] ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      imgPrompt_forprdnor_gximage = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorproductosvariables__wp__default(),
         new Object[] {
             new Object[] {
            H028Y2_A486ForNumCol, H028Y2_A396EmprCod, H028Y2_A489ForPrdNor, H028Y2_A488ForPrdDsc, H028Y2_n488ForPrdDsc, H028Y2_A490ForPrdUMe, H028Y2_A487ForPrdCan, H028Y2_A718PrdNom, H028Y2_A719PrdNum, H028Y2_A715PrdLin
            }
            , new Object[] {
            H028Y3_AGRID_nRecordCount
            }
            , new Object[] {
            H028Y4_A396EmprCod, H028Y4_A856ValCod, H028Y4_A13747PrdCDsc, H028Y4_A719PrdNum, H028Y4_A718PrdNom
            }
            , new Object[] {
            H028Y5_A719PrdNum, H028Y5_A396EmprCod, H028Y5_A4338PrdUMeFo
            }
         }
      );
      AV66Pgmname = "FormulacionTinte.ColorProductosVariables__WP" ;
      /* GeneXus formulas. */
      AV66Pgmname = "FormulacionTinte.ColorProductosVariables__WP" ;
      Gx_err = (short)(0) ;
      edtavFornumcol_Enabled = 0 ;
      edtavForprddsc_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      imgPrompt_forprdnor_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.promptproductosvariables"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDNOR"+"'), id:'"+"vFORPRDNOR"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
   }

   private byte wcpOAV11TipColcod ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV11TipColcod ;
   private byte AV31TFForPrdUMe ;
   private byte AV32TFForPrdUMe_To ;
   private byte gxajaxcallmode ;
   private byte A4338PrdUMeFo ;
   private byte AV63UndFormula ;
   private byte A490ForPrdUMe ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume ;
   private byte AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to ;
   private byte GXt_int7 ;
   private byte AV44ForPrdUMe ;
   private byte A856ValCod ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV56ValCon ;
   private short wcpOAV55FlagModC ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV56ValCon ;
   private short AV55FlagModC ;
   private short AV61Acciongridmodificar ;
   private short AV23TFPrdLin ;
   private short AV24TFPrdLin_To ;
   private short AV35TFForPrdNor ;
   private short AV36TFForPrdNor_To ;
   private short AV20OrderedBy ;
   private short AV57existecardinal ;
   private short wbEnd ;
   private short wbStart ;
   private short AV41PrdLin ;
   private short AV53GridActionGroup1 ;
   private short A715PrdLin ;
   private short A489ForPrdNor ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin ;
   private short AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to ;
   private short AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor ;
   private short AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to ;
   private short AV46ForPrdNor ;
   private short AV59MForEq ;
   private short GXt_int9 ;
   private short GXv_int10[] ;
   private int wcpOAV6ForNumCol ;
   private int wcpOAV7Clicod ;
   private int wcpOAV10Forcolnum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_89 ;
   private int AV6ForNumCol ;
   private int AV7Clicod ;
   private int AV10Forcolnum ;
   private int nGXsfl_89_idx=1 ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavFornumcol_Enabled ;
   private int edtavPrdlin_Enabled ;
   private int edtavForprdcan_Enabled ;
   private int edtavUndformula_Enabled ;
   private int edtavForprddsc_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavPrdnum_Visible ;
   private int subGrid_Islastpage ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int A486ForNumCol ;
   private int AV38PageToGo ;
   private int GXv_int12[] ;
   private int GXv_int15[] ;
   private int GXv_int13[] ;
   private int AV82GXV1 ;
   private int edtavForprdnor_Enabled ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV39GridCurrentPage ;
   private long AV40GridPageCount ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV12ForRelBan ;
   private java.math.BigDecimal wcpOAV54CosKgmF ;
   private java.math.BigDecimal AV12ForRelBan ;
   private java.math.BigDecimal AV54CosKgmF ;
   private java.math.BigDecimal AV29TFForPrdCan ;
   private java.math.BigDecimal AV30TFForPrdCan_To ;
   private java.math.BigDecimal AV52Valor_cor ;
   private java.math.BigDecimal AV43ForPrdCan ;
   private java.math.BigDecimal A487ForPrdCan ;
   private java.math.BigDecimal AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan ;
   private java.math.BigDecimal AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private String wcpOAV5EmprCod ;
   private String wcpOAV8Forser ;
   private String wcpOAV9Forcolnom ;
   private String Gridpaginationbar_Selectedpage ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Dvelop_confirmpanel_enter_Result ;
   private String Combo_prdnum_Selectedvalue_get ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String AV5EmprCod ;
   private String AV8Forser ;
   private String AV9Forcolnom ;
   private String sGXsfl_89_idx="0001" ;
   private String AV25TFPrdNum ;
   private String AV26TFPrdNum_Sel ;
   private String AV27TFPrdNom ;
   private String AV28TFPrdNom_Sel ;
   private String AV33TFForPrdDsc ;
   private String AV34TFForPrdDsc_Sel ;
   private String AV66Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String AV49Station ;
   private String A396EmprCod ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Selectedvalue_set ;
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
   private String Dvelop_confirmpanel_enter_Title ;
   private String Dvelop_confirmpanel_enter_Confirmationtext ;
   private String Dvelop_confirmpanel_enter_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Nobuttoncaption ;
   private String Dvelop_confirmpanel_enter_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_enter_Yesbuttonposition ;
   private String Dvelop_confirmpanel_enter_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String ClassString ;
   private String StyleString ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavFornumcol_Internalname ;
   private String edtavFornumcol_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavPrdlin_Internalname ;
   private String TempTags ;
   private String edtavPrdlin_Jsonclick ;
   private String divTablesplittedprdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Internalname ;
   private String edtavForprdcan_Internalname ;
   private String edtavForprdcan_Jsonclick ;
   private String edtavUndformula_Internalname ;
   private String edtavUndformula_Jsonclick ;
   private String imgUseraction1_gximage ;
   private String sImgUrl ;
   private String imgUseraction1_Internalname ;
   private String imgUseraction1_Jsonclick ;
   private String edtavForprddsc_Internalname ;
   private String AV45ForPrdDsc ;
   private String edtavForprddsc_Jsonclick ;
   private String divTablesplittedforprdnor_Internalname ;
   private String lblTextblockforprdnor_Internalname ;
   private String lblTextblockforprdnor_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
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
   private String edtavPrdnum_Internalname ;
   private String AV42PrdNum ;
   private String edtavPrdnum_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtPrdLin_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtForPrdCan_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String edtForPrdNor_Internalname ;
   private String imgPrompt_forprdnor_Link ;
   private String imgPrompt_forprdnor_Internalname ;
   private String scmdbuf ;
   private String lV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum ;
   private String lV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom ;
   private String lV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc ;
   private String AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel ;
   private String AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum ;
   private String AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel ;
   private String AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom ;
   private String AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel ;
   private String AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc ;
   private String edtavForprdnor_Internalname ;
   private String hsh ;
   private String AV50EmprNom ;
   private String AV51UsurCod ;
   private String imgPrompt_gximage ;
   private String imgPrompt_Internalname ;
   private String GXv_char2[] ;
   private String GXt_char18 ;
   private String GXt_char1 ;
   private String GXv_char3[] ;
   private String GXt_char19 ;
   private String GXv_char16[] ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblTablemergedforprdnor_Internalname ;
   private String edtavForprdnor_Jsonclick ;
   private String imgPrompt_forprdnor_gximage ;
   private String sGXsfl_89_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtPrdLin_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtForPrdCan_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtForPrdNor_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV21OrderedDsc ;
   private boolean Dvpanel_tableheader_Autowidth ;
   private boolean Dvpanel_tableheader_Autoheight ;
   private boolean Dvpanel_tableheader_Collapsible ;
   private boolean Dvpanel_tableheader_Collapsed ;
   private boolean Dvpanel_tableheader_Showcollapseicon ;
   private boolean Dvpanel_tableheader_Autoscroll ;
   private boolean Combo_prdnum_Emptyitem ;
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
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n488ForPrdDsc ;
   private boolean bGXsfl_89_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV67Prompt_GXI ;
   private String AV58Mensaje ;
   private String AV62ForPrdDsccontrol ;
   private String A13747PrdCDsc ;
   private String AV60prompt ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV15HTTPRequest ;
   private com.genexus.webpanels.WebSession AV22Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private int[] H028Y2_A486ForNumCol ;
   private String[] H028Y2_A396EmprCod ;
   private short[] H028Y2_A489ForPrdNor ;
   private String[] H028Y2_A488ForPrdDsc ;
   private boolean[] H028Y2_n488ForPrdDsc ;
   private byte[] H028Y2_A490ForPrdUMe ;
   private java.math.BigDecimal[] H028Y2_A487ForPrdCan ;
   private String[] H028Y2_A718PrdNom ;
   private String[] H028Y2_A719PrdNum ;
   private short[] H028Y2_A715PrdLin ;
   private long[] H028Y3_AGRID_nRecordCount ;
   private String[] H028Y4_A396EmprCod ;
   private byte[] H028Y4_A856ValCod ;
   private String[] H028Y4_A13747PrdCDsc ;
   private String[] H028Y4_A719PrdNum ;
   private String[] H028Y4_A718PrdNom ;
   private String[] H028Y5_A719PrdNum ;
   private String[] H028Y5_A396EmprCod ;
   private byte[] H028Y5_A4338PrdUMeFo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV47PrdNum_Data ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV48Combo_DataItem ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV37DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV18GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState20[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV19GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV16TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV14WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class colorproductosvariables__wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H028Y2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin ,
                                          short AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to ,
                                          String AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel ,
                                          String AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum ,
                                          String AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel ,
                                          String AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan ,
                                          java.math.BigDecimal AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to ,
                                          byte AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume ,
                                          byte AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to ,
                                          String AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel ,
                                          String AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc ,
                                          short AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor ,
                                          short AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to ,
                                          short A715PrdLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A487ForPrdCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A489ForPrdNor ,
                                          short AV20OrderedBy ,
                                          boolean AV21OrderedDsc ,
                                          String AV5EmprCod ,
                                          int AV6ForNumCol ,
                                          String A396EmprCod ,
                                          int A486ForNumCol )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int21 = new byte[21];
      Object[] GXv_Object22 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.ForNumCol, T1.EmprCod, T1.ForPrdNor, T2.ForPrdDsc, T1.ForPrdUMe, T1.ForPrdCan, T3.PrdNom, T1.PrdNum, T1.PrdLin" ;
      sFromString = " FROM ((TXPLPRFOR T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum" ;
      sFromString += " = T1.PrdNum)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ForNumCol = ?)");
      if ( ! (0==AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin) )
      {
         addWhere(sWhereString, "(T1.PrdLin >= ?)");
      }
      else
      {
         GXv_int21[2] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to) )
      {
         addWhere(sWhereString, "(T1.PrdLin <= ?)");
      }
      else
      {
         GXv_int21[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int21[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int21[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan >= ?)");
      }
      else
      {
         GXv_int21[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan <= ?)");
      }
      else
      {
         GXv_int21[9] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int21[10] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int21[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int21[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int21[13] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor >= ?)");
      }
      else
      {
         GXv_int21[14] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor <= ?)");
      }
      else
      {
         GXv_int21[15] = (byte)(1) ;
      }
      if ( AV20OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdLin" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdLin DESC" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T3.PrdNom" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.PrdNom DESC" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForPrdCan" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForPrdCan DESC" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T2.ForPrdDsc" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ForPrdDsc DESC" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ! AV21OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForPrdNor" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ( AV21OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForPrdNor DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ForNumCol, T1.PrdLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object22[0] = scmdbuf ;
      GXv_Object22[1] = GXv_int21 ;
      return GXv_Object22 ;
   }

   protected Object[] conditional_H028Y3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin ,
                                          short AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to ,
                                          String AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel ,
                                          String AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum ,
                                          String AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel ,
                                          String AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan ,
                                          java.math.BigDecimal AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to ,
                                          byte AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume ,
                                          byte AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to ,
                                          String AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel ,
                                          String AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc ,
                                          short AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor ,
                                          short AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to ,
                                          short A715PrdLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A487ForPrdCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short A489ForPrdNor ,
                                          short AV20OrderedBy ,
                                          boolean AV21OrderedDsc ,
                                          String AV5EmprCod ,
                                          int AV6ForNumCol ,
                                          String A396EmprCod ,
                                          int A486ForNumCol )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int23 = new byte[16];
      Object[] GXv_Object24 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPLPRFOR T1 INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ForNumCol = ?)");
      if ( ! (0==AV68Formulaciontinte_colorproductosvariables__wpds_1_tfprdlin) )
      {
         addWhere(sWhereString, "(T1.PrdLin >= ?)");
      }
      else
      {
         GXv_int23[2] = (byte)(1) ;
      }
      if ( ! (0==AV69Formulaciontinte_colorproductosvariables__wpds_2_tfprdlin_to) )
      {
         addWhere(sWhereString, "(T1.PrdLin <= ?)");
      }
      else
      {
         GXv_int23[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV70Formulaciontinte_colorproductosvariables__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV71Formulaciontinte_colorproductosvariables__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int23[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV72Formulaciontinte_colorproductosvariables__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV73Formulaciontinte_colorproductosvariables__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int23[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV74Formulaciontinte_colorproductosvariables__wpds_7_tfforprdcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan >= ?)");
      }
      else
      {
         GXv_int23[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV75Formulaciontinte_colorproductosvariables__wpds_8_tfforprdcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForPrdCan <= ?)");
      }
      else
      {
         GXv_int23[9] = (byte)(1) ;
      }
      if ( ! (0==AV76Formulaciontinte_colorproductosvariables__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int23[10] = (byte)(1) ;
      }
      if ( ! (0==AV77Formulaciontinte_colorproductosvariables__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int23[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV78Formulaciontinte_colorproductosvariables__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int23[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV79Formulaciontinte_colorproductosvariables__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int23[13] = (byte)(1) ;
      }
      if ( ! (0==AV80Formulaciontinte_colorproductosvariables__wpds_13_tfforprdnor) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor >= ?)");
      }
      else
      {
         GXv_int23[14] = (byte)(1) ;
      }
      if ( ! (0==AV81Formulaciontinte_colorproductosvariables__wpds_14_tfforprdnor_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdNor <= ?)");
      }
      else
      {
         GXv_int23[15] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV20OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 2 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 3 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 4 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 5 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 6 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 7 ) && ( AV21OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ! AV21OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV20OrderedBy == 8 ) && ( AV21OrderedDsc ) )
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
                  return conditional_H028Y2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() );
            case 1 :
                  return conditional_H028Y3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Number) dynConstraints[13]).shortValue() , ((Number) dynConstraints[14]).shortValue() , (String)dynConstraints[15] , (String)dynConstraints[16] , (java.math.BigDecimal)dynConstraints[17] , ((Number) dynConstraints[18]).byteValue() , (String)dynConstraints[19] , ((Number) dynConstraints[20]).shortValue() , ((Number) dynConstraints[21]).shortValue() , ((Boolean) dynConstraints[22]).booleanValue() , (String)dynConstraints[23] , ((Number) dynConstraints[24]).intValue() , (String)dynConstraints[25] , ((Number) dynConstraints[26]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H028Y2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028Y3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028Y4", "SELECT EmprCod, ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom FROM TXPPRODUC WHERE ValCod >= 1 and ValCod <= 2 and SUBSTR(PrdNum, 1, 1) <> '#' and SUBSTR(PrdNum, 1, 1) <> 'C' ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028Y5", "SELECT PrdNum, EmprCod, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((short[]) buf[2])[0] = rslt.getShort(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 5);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((byte[]) buf[5])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[6])[0] = rslt.getBigDecimal(6,5);
               ((String[]) buf[7])[0] = rslt.getString(7, 26);
               ((String[]) buf[8])[0] = rslt.getString(8, 6);
               ((short[]) buf[9])[0] = rslt.getShort(9);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
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
                  stmt.setString(sIdx, (String)parms[21], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[22]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[23]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[24]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[25], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[29], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[30], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[31]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[32]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[33], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[34], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[35]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[36]).shortValue());
               }
               if ( ((Number) parms[16]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[37]).intValue());
               }
               if ( ((Number) parms[17]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[38]).intValue());
               }
               if ( ((Number) parms[18]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[39]).intValue());
               }
               if ( ((Number) parms[19]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[40]).intValue());
               }
               if ( ((Number) parms[20]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[41]).intValue());
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[16], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setInt(sIdx, ((Number) parms[17]).intValue());
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[18]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[19]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[22], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[23], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[24], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[25], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[26]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[27]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[28], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[29], 5);
               }
               if ( ((Number) parms[14]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[30]).shortValue());
               }
               if ( ((Number) parms[15]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[31]).shortValue());
               }
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

