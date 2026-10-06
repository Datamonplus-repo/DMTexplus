package app.formulaciontinte ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class colorcolorantes__wp_impl extends GXDataArea
{
   public colorcolorantes__wp_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public colorcolorantes__wp_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( colorcolorantes__wp_impl.class ));
   }

   public colorcolorantes__wp_impl( int remoteHandle ,
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
            AV15EmprCod = gxfirstwebparm ;
            httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
            if ( GXutil.strcmp(gxfirstwebparm, "viewer") != 0 )
            {
               AV14ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV14ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ForNumCol), 8, 0));
               app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14ForNumCol), "ZZZZZZZ9")));
               AV13ContNum = (int)(GXutil.lval( httpContext.GetPar( "ContNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV13ContNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13ContNum), 9, 0));
               AV12FlagMod = (short)(GXutil.lval( httpContext.GetPar( "FlagMod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV12FlagMod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12FlagMod), 4, 0));
               AV11ForOpcCli = httpContext.GetPar( "ForOpcCli") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV11ForOpcCli", AV11ForOpcCli);
               AV10Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV10Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Clicod), 6, 0));
               AV9Forser = httpContext.GetPar( "Forser") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV9Forser", AV9Forser);
               AV8Forcolnom = httpContext.GetPar( "Forcolnom") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
               AV7ForcolNum = (int)(GXutil.lval( httpContext.GetPar( "ForcolNum"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV7ForcolNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ForcolNum), 6, 0));
               AV6Tipcolcod = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod"))) ;
               httpContext.ajax_rsp_assign_attri("", false, "AV6Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Tipcolcod), 2, 0));
               AV5ForRelBan = CommonUtil.decimalVal( httpContext.GetPar( "ForRelBan"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV5ForRelBan", GXutil.ltrimstr( AV5ForRelBan, 7, 2));
               AV16CosKgmF = CommonUtil.decimalVal( httpContext.GetPar( "CosKgmF"), ".") ;
               httpContext.ajax_rsp_assign_attri("", false, "AV16CosKgmF", GXutil.ltrimstr( AV16CosKgmF, 13, 5));
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
      nRC_GXsfl_88 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_88"))) ;
      nGXsfl_88_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_88_idx"))) ;
      sGXsfl_88_idx = httpContext.GetPar( "sGXsfl_88_idx") ;
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
      AV15EmprCod = httpContext.GetPar( "EmprCod") ;
      AV14ForNumCol = (int)(GXutil.lval( httpContext.GetPar( "ForNumCol"))) ;
      AV77Acciongridmodificar = (short)(GXutil.lval( httpContext.GetPar( "Acciongridmodificar"))) ;
      AV10Clicod = (int)(GXutil.lval( httpContext.GetPar( "Clicod"))) ;
      AV9Forser = httpContext.GetPar( "Forser") ;
      AV8Forcolnom = httpContext.GetPar( "Forcolnom") ;
      AV7ForcolNum = (int)(GXutil.lval( httpContext.GetPar( "ForcolNum"))) ;
      AV6Tipcolcod = (byte)(GXutil.lval( httpContext.GetPar( "Tipcolcod"))) ;
      AV5ForRelBan = CommonUtil.decimalVal( httpContext.GetPar( "ForRelBan"), ".") ;
      AV57Station = httpContext.GetPar( "Station") ;
      AV74Valor_cor = CommonUtil.decimalVal( httpContext.GetPar( "Valor_cor"), ".") ;
      AV32TFColLin = (short)(GXutil.lval( httpContext.GetPar( "TFColLin"))) ;
      AV33TFColLin_To = (short)(GXutil.lval( httpContext.GetPar( "TFColLin_To"))) ;
      AV34TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV35TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV36TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV37TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV38TFForCan = CommonUtil.decimalVal( httpContext.GetPar( "TFForCan"), ".") ;
      AV39TFForCan_To = CommonUtil.decimalVal( httpContext.GetPar( "TFForCan_To"), ".") ;
      AV40TFForPrdUMe = (byte)(GXutil.lval( httpContext.GetPar( "TFForPrdUMe"))) ;
      AV41TFForPrdUMe_To = (byte)(GXutil.lval( httpContext.GetPar( "TFForPrdUMe_To"))) ;
      AV42TFForPrdDsc = httpContext.GetPar( "TFForPrdDsc") ;
      AV43TFForPrdDsc_Sel = httpContext.GetPar( "TFForPrdDsc_Sel") ;
      AV80Pgmname = httpContext.GetPar( "Pgmname") ;
      AV24OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV25OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      AV72TotForCan = CommonUtil.decimalVal( httpContext.GetPar( "TotForCan"), ".") ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV15EmprCod, AV14ForNumCol, AV77Acciongridmodificar, AV10Clicod, AV9Forser, AV8Forcolnom, AV7ForcolNum, AV6Tipcolcod, AV5ForRelBan, AV57Station, AV74Valor_cor, AV32TFColLin, AV33TFColLin_To, AV34TFPrdNum, AV35TFPrdNum_Sel, AV36TFPrdNom, AV37TFPrdNom_Sel, AV38TFForCan, AV39TFForCan_To, AV40TFForPrdUMe, AV41TFForPrdUMe_To, AV42TFForPrdDsc, AV43TFForPrdDsc_Sel, AV80Pgmname, AV24OrderedBy, AV25OrderedDsc, AV72TotForCan) ;
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
      pa28X2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         start28X2( ) ;
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.formulaciontinte.colorcolorantes__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13ContNum,9,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12FlagMod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV11ForOpcCli)),GXutil.URLEncode(GXutil.ltrimstr(AV10Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9Forser)),GXutil.URLEncode(GXutil.rtrim(AV8Forcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV7ForcolNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6Tipcolcod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV5ForRelBan)),GXutil.URLEncode(DecimalUtil.decToString(AV16CosKgmF))}, new String[] {"EmprCod","ForNumCol","ContNum","FlagMod","ForOpcCli","Clicod","Forser","Forcolnom","ForcolNum","Tipcolcod","ForRelBan","CosKgmF"}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFORCAN", getSecureSignedToken( "", localUtil.format( AV72TotForCan, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14ForNumCol), "ZZZZZZZ9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ColorColorantes__WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV80Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\colorcolorantes__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_88", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_88, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vPRDNUM_DATA", AV48PrdNum_Data);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vPRDNUM_DATA", AV48PrdNum_Data);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDCURRENTPAGE", GXutil.ltrim( localUtil.ntoc( AV46GridCurrentPage, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vGRIDPAGECOUNT", GXutil.ltrim( localUtil.ntoc( AV47GridPageCount, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV44DDO_TitleSettingsIcons);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vACCIONGRIDMODIFICAR", GXutil.ltrim( localUtil.ntoc( AV77Acciongridmodificar, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV15EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vCLICOD", GXutil.ltrim( localUtil.ntoc( AV10Clicod, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORSER", GXutil.rtrim( AV9Forser));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNOM", GXutil.rtrim( AV8Forcolnom));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORCOLNUM", GXutil.ltrim( localUtil.ntoc( AV7ForcolNum, (byte)(6), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTIPCOLCOD", GXutil.ltrim( localUtil.ntoc( AV6Tipcolcod, (byte)(2), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFORRELBAN", GXutil.ltrim( localUtil.ntoc( AV5ForRelBan, (byte)(7), (byte)(2), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV57Station));
      app.GxWebStd.gx_hidden_field( httpContext, "vVALOR_COR", GXutil.ltrim( localUtil.ntoc( AV74Valor_cor, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLLIN", GXutil.ltrim( localUtil.ntoc( AV32TFColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFCOLLIN_TO", GXutil.ltrim( localUtil.ntoc( AV33TFColLin_To, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV34TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV35TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV36TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV37TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCAN", GXutil.ltrim( localUtil.ntoc( AV38TFForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORCAN_TO", GXutil.ltrim( localUtil.ntoc( AV39TFForCan_To, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDUME", GXutil.ltrim( localUtil.ntoc( AV40TFForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDUME_TO", GXutil.ltrim( localUtil.ntoc( AV41TFForPrdUMe_To, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC", GXutil.rtrim( AV42TFForPrdDsc));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFFORPRDDSC_SEL", GXutil.rtrim( AV43TFForPrdDsc_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV24OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV25OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "FORNUMCOL", GXutil.ltrim( localUtil.ntoc( A486ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFORCAN", GXutil.ltrim( localUtil.ntoc( AV72TotForCan, (byte)(18), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFORCAN", getSecureSignedToken( "", localUtil.format( AV72TotForCan, "ZZZZ9.99999")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDUMEFO", GXutil.ltrim( localUtil.ntoc( A4338PrdUMeFo, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vCONTNUM", GXutil.ltrim( localUtil.ntoc( AV13ContNum, (byte)(9), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGMOD", GXutil.ltrim( localUtil.ntoc( AV12FlagMod, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFOROPCCLI", GXutil.rtrim( AV11ForOpcCli));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Cls", GXutil.rtrim( Combo_prdnum_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Selectedvalue_set", GXutil.rtrim( Combo_prdnum_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "COMBO_PRDNUM_Emptyitem", GXutil.booltostr( Combo_prdnum_Emptyitem));
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
         we28X2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evt28X2( ) ;
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
      return formatLink("app.formulaciontinte.colorcolorantes__wp", new String[] {GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(AV13ContNum,9,0)),GXutil.URLEncode(GXutil.ltrimstr(AV12FlagMod,4,0)),GXutil.URLEncode(GXutil.rtrim(AV11ForOpcCli)),GXutil.URLEncode(GXutil.ltrimstr(AV10Clicod,6,0)),GXutil.URLEncode(GXutil.rtrim(AV9Forser)),GXutil.URLEncode(GXutil.rtrim(AV8Forcolnom)),GXutil.URLEncode(GXutil.ltrimstr(AV7ForcolNum,6,0)),GXutil.URLEncode(GXutil.ltrimstr(AV6Tipcolcod,2,0)),GXutil.URLEncode(DecimalUtil.decToString(AV5ForRelBan)),GXutil.URLEncode(DecimalUtil.decToString(AV16CosKgmF))}, new String[] {"EmprCod","ForNumCol","ContNum","FlagMod","ForOpcCli","Clicod","Forser","Forcolnom","ForcolNum","Tipcolcod","ForRelBan","CosKgmF"})  ;
   }

   public String getPgmname( )
   {
      return "FormulacionTinte.ColorColorantes__WP" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Colorantes", "") ;
   }

   public void wb28X0( )
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTbmessage_Internalname, lblTbmessage_Caption, "", "", lblTbmessage_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "TextDanger", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable4_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavFornumcol_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavFornumcol_Internalname, httpContext.getMessage( "Nº Interno", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavFornumcol_Internalname, GXutil.ltrim( localUtil.ntoc( AV14ForNumCol, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavFornumcol_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV14ForNumCol), "ZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV14ForNumCol), "ZZZZZZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavFornumcol_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavFornumcol_Enabled, 0, "text", "1", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCoskgmf_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCoskgmf_Internalname, httpContext.getMessage( "Coste/kg", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCoskgmf_Internalname, GXutil.ltrim( localUtil.ntoc( AV16CosKgmF, (byte)(13), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCoskgmf_Enabled!=0) ? localUtil.format( AV16CosKgmF, "ZZZZZZ9.99999") : localUtil.format( AV16CosKgmF, "ZZZZZZ9.99999"))), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCoskgmf_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCoskgmf_Enabled, 0, "text", "", 13, "chr", 1, "row", 13, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 WWFiltersCell CellMarginTop", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable2_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCollin_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCollin_Internalname, "#", "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCollin_Internalname, GXutil.ltrim( localUtil.ntoc( AV26ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavCollin_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV26ColLin), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV26ColLin), "ZZ9"))), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,42);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCollin_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCollin_Enabled, 0, "text", "1", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4 DscTop ExtendedComboCell", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedprdnum_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockcombo_prdnum_Internalname, httpContext.getMessage( "Producto", ""), "", "", lblTextblockcombo_prdnum_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucCombo_prdnum.setProperty("Caption", Combo_prdnum_Caption);
         ucCombo_prdnum.setProperty("Cls", Combo_prdnum_Cls);
         ucCombo_prdnum.setProperty("EmptyItem", Combo_prdnum_Emptyitem);
         ucCombo_prdnum.setProperty("DropDownOptionsData", AV48PrdNum_Data);
         ucCombo_prdnum.render(context, "dvelop.gxbootstrap.ddoextendedcombo", Combo_prdnum_Internalname, "COMBO_PRDNUMContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForcan_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForcan_Internalname, httpContext.getMessage( "Cantidad", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 53,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForcan_Internalname, GXutil.ltrim( localUtil.ntoc( AV28ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( ((edtavForcan_Enabled!=0) ? localUtil.format( AV28ForCan, "ZZZZ9.99999") : localUtil.format( AV28ForCan, "ZZZZ9.99999"))), TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'5');"+";gx.evt.onblur(this,53);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForcan_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForcan_Enabled, 0, "text", "", 11, "chr", 1, "row", 11, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-1 DscTop", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablesplittedforprdume_Internalname, 1, 0, "px", 0, "px", "Table", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 MergeLabelCell", "left", "top", "", "", "div");
         /* Text block */
         app.GxWebStd.gx_label_ctrl( httpContext, lblTextblockforprdume_Internalname, httpContext.getMessage( "Und", ""), "", "", lblTextblockforprdume_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Label", 0, "", 1, 1, 0, (short)(0), "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table1_60_28X2( true) ;
      }
      else
      {
         wb_table1_60_28X2( false) ;
      }
      return  ;
   }

   public void wb_table1_60_28X2e( boolean wbgen )
   {
      if ( wbgen )
      {
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-2", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavForprddsc_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprddsc_Internalname, httpContext.getMessage( "Descripcion", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 70,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprddsc_Internalname, GXutil.rtrim( AV30ForPrdDsc), GXutil.rtrim( localUtil.format( AV30ForPrdDsc, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,70);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprddsc_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprddsc_Enabled, 0, "text", "", 5, "chr", 1, "row", 5, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
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
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnenter_Internalname, "gx.evt.setGridEvt("+GXutil.str( 88, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnenter_Jsonclick, 5, httpContext.getMessage( "GX_BtnEnter", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 80,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtncerrar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 88, 2, 0)+","+"null"+");", httpContext.getMessage( "Cerrar", ""), bttBtncerrar_Jsonclick, 5, httpContext.getMessage( "Cerrar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOCERRAR\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 hidden-xs", "left", "top", "", "", "div");
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
         startgridcontrol88( ) ;
      }
      if ( wbEnd == 88 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_88 = (int)(nGXsfl_88_idx-1) ;
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row Invisible", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         wb_table2_107_28X2( true) ;
      }
      else
      {
         wb_table2_107_28X2( false) ;
      }
      return  ;
   }

   public void wb_table2_107_28X2e( boolean wbgen )
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
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPgmname_Internalname, GXutil.rtrim( AV80Pgmname), GXutil.rtrim( localUtil.format( AV80Pgmname, "")), "", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPgmname_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtavPgmname_Enabled, 0, "text", "", 80, "chr", 1, "row", 129, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
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
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* User Defined Control */
         ucBarradeprogreso.render(context, "gxprogressindicator", Barradeprogreso_Internalname, "BARRADEPROGRESOContainer");
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
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 143,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavPrdnum_Internalname, GXutil.rtrim( AV27PrdNum), GXutil.rtrim( localUtil.format( AV27PrdNum, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,143);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavPrdnum_Jsonclick, 0, "Attribute", "", "", "", "", edtavPrdnum_Visible, 1, 0, "text", "", 6, "chr", 1, "row", 6, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV44DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         wb_table3_145_28X2( true) ;
      }
      else
      {
         wb_table3_145_28X2( false) ;
      }
      return  ;
   }

   public void wb_table3_145_28X2e( boolean wbgen )
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
      if ( wbEnd == 88 )
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

   public void start28X2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Colorantes", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strup28X0( ) ;
   }

   public void ws28X2( )
   {
      start28X2( ) ;
      evt28X2( ) ;
   }

   public void evt28X2( )
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
                           e1128X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1228X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGINATIONBAR.CHANGEROWSPERPAGE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1328X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1428X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_ENTER.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1528X2 ();
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
                                 e1628X2 ();
                              }
                              dynload_actions( ) ;
                           }
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOCERRAR'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoCerrar' */
                           e1728X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VCOLLIN.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1828X2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "VFORPRDUME.CONTROLVALUECHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e1928X2 ();
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
                        if ( ( GXutil.strcmp(GXutil.left( sEvt, 5), "START") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 7), "REFRESH") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 9), "GRID.LOAD") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 11), "'DOAGREGAR'") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "COLLIN.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 6), "CANCEL") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 23), "VGRIDACTIONGROUP1.CLICK") == 0 ) || ( GXutil.strcmp(GXutil.left( sEvt, 12), "COLLIN.CLICK") == 0 ) )
                        {
                           nGXsfl_88_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_882( ) ;
                           cmbavGridactiongroup1.setName( cmbavGridactiongroup1.getInternalname() );
                           cmbavGridactiongroup1.setValue( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()) );
                           AV71GridActionGroup1 = (short)(GXutil.lval( httpContext.cgiGet( cmbavGridactiongroup1.getInternalname()))) ;
                           httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71GridActionGroup1), 4, 0));
                           A309ColLin = (short)(localUtil.ctol( httpContext.cgiGet( edtColLin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A481ForCan = localUtil.ctond( httpContext.cgiGet( edtForCan_Internalname)) ;
                           A490ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtForPrdUMe_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                           A488ForPrdDsc = httpContext.cgiGet( edtForPrdDsc_Internalname) ;
                           n488ForPrdDsc = false ;
                           A13232PrdRGB = localUtil.ctol( httpContext.cgiGet( edtPrdRGB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9999999999L ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vPRDRGB");
                              GX_FocusControl = edtavPrdrgb_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV50PrdRGB = 0 ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50PrdRGB), 10, 0));
                           }
                           else
                           {
                              AV50PrdRGB = localUtil.ctol( httpContext.cgiGet( edtavPrdrgb_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50PrdRGB), 10, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR");
                              GX_FocusControl = edtavR_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV51R = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51R), 3, 0));
                           }
                           else
                           {
                              AV51R = (short)(localUtil.ctol( httpContext.cgiGet( edtavR_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51R), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG");
                              GX_FocusControl = edtavG_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV52G = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52G), 3, 0));
                           }
                           else
                           {
                              AV52G = (short)(localUtil.ctol( httpContext.cgiGet( edtavG_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52G), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB");
                              GX_FocusControl = edtavB_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV53B = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53B), 3, 0));
                           }
                           else
                           {
                              AV53B = (short)(localUtil.ctol( httpContext.cgiGet( edtavB_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53B), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vR2");
                              GX_FocusControl = edtavR2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV54R2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54R2), 3, 0));
                           }
                           else
                           {
                              AV54R2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavR2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54R2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vG2");
                              GX_FocusControl = edtavG2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV55G2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55G2), 3, 0));
                           }
                           else
                           {
                              AV55G2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavG2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55G2), 3, 0));
                           }
                           if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vB2");
                              GX_FocusControl = edtavB2_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV56B2 = (short)(0) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56B2), 3, 0));
                           }
                           else
                           {
                              AV56B2 = (short)(localUtil.ctol( httpContext.cgiGet( edtavB2_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56B2), 3, 0));
                           }
                           A13926ColFibra = httpContext.cgiGet( edtColFibra_Internalname) ;
                           n13926ColFibra = false ;
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e2028X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e2128X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2228X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "VGRIDACTIONGROUP1.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2328X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "'DOAGREGAR'") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: 'DoAgregar' */
                                 e2428X2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "COLLIN.CLICK") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e2528X2 ();
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

   public void we28X2( )
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

   public void pa28X2( )
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
            GX_FocusControl = edtavCollin_Internalname ;
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
      subsflControlProps_882( ) ;
      while ( nGXsfl_88_idx <= nRC_GXsfl_88 )
      {
         sendrow_882( ) ;
         nGXsfl_88_idx = ((subGrid_Islastpage==1)&&(nGXsfl_88_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_88_idx+1) ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_882( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 String AV15EmprCod ,
                                 int AV14ForNumCol ,
                                 short AV77Acciongridmodificar ,
                                 int AV10Clicod ,
                                 String AV9Forser ,
                                 String AV8Forcolnom ,
                                 int AV7ForcolNum ,
                                 byte AV6Tipcolcod ,
                                 java.math.BigDecimal AV5ForRelBan ,
                                 String AV57Station ,
                                 java.math.BigDecimal AV74Valor_cor ,
                                 short AV32TFColLin ,
                                 short AV33TFColLin_To ,
                                 String AV34TFPrdNum ,
                                 String AV35TFPrdNum_Sel ,
                                 String AV36TFPrdNom ,
                                 String AV37TFPrdNom_Sel ,
                                 java.math.BigDecimal AV38TFForCan ,
                                 java.math.BigDecimal AV39TFForCan_To ,
                                 byte AV40TFForPrdUMe ,
                                 byte AV41TFForPrdUMe_To ,
                                 String AV42TFForPrdDsc ,
                                 String AV43TFForPrdDsc_Sel ,
                                 String AV80Pgmname ,
                                 short AV24OrderedBy ,
                                 boolean AV25OrderedDsc ,
                                 java.math.BigDecimal AV72TotForCan )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e2128X2 ();
      GRID_nCurrentRecord = 0 ;
      rf28X2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      forbiddenHiddens = new com.genexus.util.GXProperties() ;
      forbiddenHiddens.add("hshsalt", "hsh"+"ColorColorantes__WP");
      forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV80Pgmname, "")));
      app.GxWebStd.gx_hidden_field( httpContext, "hsh", httpContext.getEncryptedSignature( forbiddenHiddens.toString(), GXKey));
      GXutil.writeLogInfo("formulaciontinte\\colorcolorantes__wp:[ SendSecurityCheck value for]"+forbiddenHiddens.toJSonString());
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
      rf28X2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV80Pgmname = "FormulacionTinte.ColorColorantes__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
      Gx_err = (short)(0) ;
      edtavFornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumcol_Enabled), 5, 0), true);
      edtavCoskgmf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoskgmf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoskgmf_Enabled), 5, 0), true);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavTotvalueforcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalueforcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalueforcan_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
   }

   public void rf28X2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(88) ;
      /* Execute user event: Refresh */
      e2128X2 ();
      nGXsfl_88_idx = 1 ;
      sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_882( ) ;
      bGXsfl_88_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_882( ) ;
         GXPagingFrom2 = (int)(((subGrid_Rows==0) ? 1 : GRID_nFirstRecordOnPage+1)) ;
         GXPagingTo2 = (int)(((subGrid_Rows==0) ? 10000 : GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )+1)) ;
         pr_default.dynParam(0, new Object[]{ new Object[]{
                                              Short.valueOf(AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin) ,
                                              Short.valueOf(AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to) ,
                                              AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel ,
                                              AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum ,
                                              AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel ,
                                              AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom ,
                                              AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan ,
                                              AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to ,
                                              Byte.valueOf(AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume) ,
                                              Byte.valueOf(AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to) ,
                                              AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel ,
                                              AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc ,
                                              Short.valueOf(A309ColLin) ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A481ForCan ,
                                              Byte.valueOf(A490ForPrdUMe) ,
                                              A488ForPrdDsc ,
                                              Short.valueOf(AV24OrderedBy) ,
                                              Boolean.valueOf(AV25OrderedDsc) ,
                                              AV15EmprCod ,
                                              Integer.valueOf(AV14ForNumCol) ,
                                              A396EmprCod ,
                                              Integer.valueOf(A486ForNumCol) } ,
                                              new int[]{
                                              TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                              TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                              }
         });
         lV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum), 6, "%") ;
         lV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom), 26, "%") ;
         lV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc), 5, "%") ;
         /* Using cursor H028X2 */
         pr_default.execute(0, new Object[] {AV15EmprCod, Integer.valueOf(AV14ForNumCol), Short.valueOf(AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin), Short.valueOf(AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to), lV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum, AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel, lV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom, AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel, AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan, AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to, Byte.valueOf(AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume), Byte.valueOf(AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to), lV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc, AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel, Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingTo2), Integer.valueOf(GXPagingFrom2), Integer.valueOf(GXPagingFrom2)});
         nGXsfl_88_idx = 1 ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_882( ) ;
         while ( ( (pr_default.getStatus(0) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A486ForNumCol = H028X2_A486ForNumCol[0] ;
            A396EmprCod = H028X2_A396EmprCod[0] ;
            A13926ColFibra = H028X2_A13926ColFibra[0] ;
            n13926ColFibra = H028X2_n13926ColFibra[0] ;
            A13232PrdRGB = H028X2_A13232PrdRGB[0] ;
            A488ForPrdDsc = H028X2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H028X2_n488ForPrdDsc[0] ;
            A490ForPrdUMe = H028X2_A490ForPrdUMe[0] ;
            A481ForCan = H028X2_A481ForCan[0] ;
            A718PrdNom = H028X2_A718PrdNom[0] ;
            A719PrdNum = H028X2_A719PrdNum[0] ;
            A309ColLin = H028X2_A309ColLin[0] ;
            A488ForPrdDsc = H028X2_A488ForPrdDsc[0] ;
            n488ForPrdDsc = H028X2_n488ForPrdDsc[0] ;
            A13232PrdRGB = H028X2_A13232PrdRGB[0] ;
            A718PrdNom = H028X2_A718PrdNom[0] ;
            e2228X2 ();
            pr_default.readNext(0);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(0);
         wbEnd = (short)(88) ;
         wb28X0( ) ;
      }
      bGXsfl_88_Refreshing = true ;
   }

   public void send_integrity_lvl_hashes28X2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vTOTFORCAN", GXutil.ltrim( localUtil.ntoc( AV72TotForCan, (byte)(18), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFORCAN", getSecureSignedToken( "", localUtil.format( AV72TotForCan, "ZZZZ9.99999")));
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
      AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin = AV32TFColLin ;
      AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to = AV33TFColLin_To ;
      AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = AV34TFPrdNum ;
      AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = AV36TFPrdNom ;
      AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan = AV38TFForCan ;
      AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to = AV39TFForCan_To ;
      AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume = AV40TFForPrdUMe ;
      AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to = AV41TFForPrdUMe_To ;
      AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = AV42TFForPrdDsc ;
      AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel = AV43TFForPrdDsc_Sel ;
      pr_default.dynParam(1, new Object[]{ new Object[]{
                                           Short.valueOf(AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin) ,
                                           Short.valueOf(AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to) ,
                                           AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel ,
                                           AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum ,
                                           AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel ,
                                           AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom ,
                                           AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan ,
                                           AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to ,
                                           Byte.valueOf(AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to) ,
                                           AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel ,
                                           AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc ,
                                           Short.valueOf(A309ColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A481ForCan ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           Short.valueOf(AV24OrderedBy) ,
                                           Boolean.valueOf(AV25OrderedDsc) ,
                                           AV15EmprCod ,
                                           Integer.valueOf(AV14ForNumCol) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A486ForNumCol) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.SHORT,
                                           TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum), 6, "%") ;
      lV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom), 26, "%") ;
      lV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor H028X3 */
      pr_default.execute(1, new Object[] {AV15EmprCod, Integer.valueOf(AV14ForNumCol), Short.valueOf(AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin), Short.valueOf(AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to), lV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum, AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel, lV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom, AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel, AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan, AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to, Byte.valueOf(AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume), Byte.valueOf(AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to), lV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc, AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel});
      GRID_nRecordCount = H028X3_AGRID_nRecordCount[0] ;
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
      AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin = AV32TFColLin ;
      AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to = AV33TFColLin_To ;
      AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = AV34TFPrdNum ;
      AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = AV36TFPrdNom ;
      AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan = AV38TFForCan ;
      AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to = AV39TFForCan_To ;
      AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume = AV40TFForPrdUMe ;
      AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to = AV41TFForPrdUMe_To ;
      AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = AV42TFForPrdDsc ;
      AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel = AV43TFForPrdDsc_Sel ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV15EmprCod, AV14ForNumCol, AV77Acciongridmodificar, AV10Clicod, AV9Forser, AV8Forcolnom, AV7ForcolNum, AV6Tipcolcod, AV5ForRelBan, AV57Station, AV74Valor_cor, AV32TFColLin, AV33TFColLin_To, AV34TFPrdNum, AV35TFPrdNum_Sel, AV36TFPrdNom, AV37TFPrdNom_Sel, AV38TFForCan, AV39TFForCan_To, AV40TFForPrdUMe, AV41TFForPrdUMe_To, AV42TFForPrdDsc, AV43TFForPrdDsc_Sel, AV80Pgmname, AV24OrderedBy, AV25OrderedDsc, AV72TotForCan) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin = AV32TFColLin ;
      AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to = AV33TFColLin_To ;
      AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = AV34TFPrdNum ;
      AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = AV36TFPrdNom ;
      AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan = AV38TFForCan ;
      AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to = AV39TFForCan_To ;
      AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume = AV40TFForPrdUMe ;
      AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to = AV41TFForPrdUMe_To ;
      AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = AV42TFForPrdDsc ;
      AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel = AV43TFForPrdDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15EmprCod, AV14ForNumCol, AV77Acciongridmodificar, AV10Clicod, AV9Forser, AV8Forcolnom, AV7ForcolNum, AV6Tipcolcod, AV5ForRelBan, AV57Station, AV74Valor_cor, AV32TFColLin, AV33TFColLin_To, AV34TFPrdNum, AV35TFPrdNum_Sel, AV36TFPrdNom, AV37TFPrdNom_Sel, AV38TFForCan, AV39TFForCan_To, AV40TFForPrdUMe, AV41TFForPrdUMe_To, AV42TFForPrdDsc, AV43TFForPrdDsc_Sel, AV80Pgmname, AV24OrderedBy, AV25OrderedDsc, AV72TotForCan) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin = AV32TFColLin ;
      AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to = AV33TFColLin_To ;
      AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = AV34TFPrdNum ;
      AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = AV36TFPrdNom ;
      AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan = AV38TFForCan ;
      AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to = AV39TFForCan_To ;
      AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume = AV40TFForPrdUMe ;
      AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to = AV41TFForPrdUMe_To ;
      AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = AV42TFForPrdDsc ;
      AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel = AV43TFForPrdDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15EmprCod, AV14ForNumCol, AV77Acciongridmodificar, AV10Clicod, AV9Forser, AV8Forcolnom, AV7ForcolNum, AV6Tipcolcod, AV5ForRelBan, AV57Station, AV74Valor_cor, AV32TFColLin, AV33TFColLin_To, AV34TFPrdNum, AV35TFPrdNum_Sel, AV36TFPrdNom, AV37TFPrdNom_Sel, AV38TFForCan, AV39TFForCan_To, AV40TFForPrdUMe, AV41TFForPrdUMe_To, AV42TFForPrdDsc, AV43TFForPrdDsc_Sel, AV80Pgmname, AV24OrderedBy, AV25OrderedDsc, AV72TotForCan) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin = AV32TFColLin ;
      AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to = AV33TFColLin_To ;
      AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = AV34TFPrdNum ;
      AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = AV36TFPrdNom ;
      AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan = AV38TFForCan ;
      AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to = AV39TFForCan_To ;
      AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume = AV40TFForPrdUMe ;
      AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to = AV41TFForPrdUMe_To ;
      AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = AV42TFForPrdDsc ;
      AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel = AV43TFForPrdDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15EmprCod, AV14ForNumCol, AV77Acciongridmodificar, AV10Clicod, AV9Forser, AV8Forcolnom, AV7ForcolNum, AV6Tipcolcod, AV5ForRelBan, AV57Station, AV74Valor_cor, AV32TFColLin, AV33TFColLin_To, AV34TFPrdNum, AV35TFPrdNum_Sel, AV36TFPrdNom, AV37TFPrdNom_Sel, AV38TFForCan, AV39TFForCan_To, AV40TFForPrdUMe, AV41TFForPrdUMe_To, AV42TFForPrdDsc, AV43TFForPrdDsc_Sel, AV80Pgmname, AV24OrderedBy, AV25OrderedDsc, AV72TotForCan) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin = AV32TFColLin ;
      AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to = AV33TFColLin_To ;
      AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = AV34TFPrdNum ;
      AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = AV36TFPrdNom ;
      AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan = AV38TFForCan ;
      AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to = AV39TFForCan_To ;
      AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume = AV40TFForPrdUMe ;
      AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to = AV41TFForPrdUMe_To ;
      AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = AV42TFForPrdDsc ;
      AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel = AV43TFForPrdDsc_Sel ;
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
         gxgrgrid_refresh( subGrid_Rows, AV15EmprCod, AV14ForNumCol, AV77Acciongridmodificar, AV10Clicod, AV9Forser, AV8Forcolnom, AV7ForcolNum, AV6Tipcolcod, AV5ForRelBan, AV57Station, AV74Valor_cor, AV32TFColLin, AV33TFColLin_To, AV34TFPrdNum, AV35TFPrdNum_Sel, AV36TFPrdNom, AV37TFPrdNom_Sel, AV38TFForCan, AV39TFForCan_To, AV40TFForPrdUMe, AV41TFForPrdUMe_To, AV42TFForPrdDsc, AV43TFForPrdDsc_Sel, AV80Pgmname, AV24OrderedBy, AV25OrderedDsc, AV72TotForCan) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV80Pgmname = "FormulacionTinte.ColorColorantes__WP" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
      Gx_err = (short)(0) ;
      edtavFornumcol_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavFornumcol_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavFornumcol_Enabled), 5, 0), true);
      edtavCoskgmf_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCoskgmf_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCoskgmf_Enabled), 5, 0), true);
      edtavForprddsc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprddsc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprddsc_Enabled), 5, 0), true);
      edtavPrdrgb_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPrdrgb_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPrdrgb_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavR_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavG_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavB_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavR2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavR2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavR2_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavG2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavG2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavG2_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavB2_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavB2_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavB2_Enabled), 5, 0), !bGXsfl_88_Refreshing);
      edtavTotvalueforcan_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavTotvalueforcan_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavTotvalueforcan_Enabled), 5, 0), true);
      edtavPgmname_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavPgmname_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavPgmname_Enabled), 5, 0), true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      httpContext.ajax_rsp_assign_prop("", false, imgPrompt_forprdume_Internalname, "Link", imgPrompt_forprdume_Link, true);
      fix_multi_value_controls( ) ;
   }

   public void strup28X0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e2028X2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vPRDNUM_DATA"), AV48PrdNum_Data);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV44DDO_TitleSettingsIcons);
         /* Read saved values. */
         nRC_GXsfl_88 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_88"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         AV46GridCurrentPage = localUtil.ctol( httpContext.cgiGet( "vGRIDCURRENTPAGE"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         AV47GridPageCount = localUtil.ctol( httpContext.cgiGet( "vGRIDPAGECOUNT"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nFirstRecordOnPage = localUtil.ctol( httpContext.cgiGet( "GRID_nFirstRecordOnPage"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) ;
         GRID_nEOF = (byte)(localUtil.ctol( httpContext.cgiGet( "GRID_nEOF"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         subGrid_Rows = (int)(localUtil.ctol( httpContext.cgiGet( "GRID_Rows"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
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
         Combo_prdnum_Cls = httpContext.cgiGet( "COMBO_PRDNUM_Cls") ;
         Combo_prdnum_Selectedvalue_set = httpContext.cgiGet( "COMBO_PRDNUM_Selectedvalue_set") ;
         Combo_prdnum_Emptyitem = GXutil.strtobool( httpContext.cgiGet( "COMBO_PRDNUM_Emptyitem")) ;
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
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavCollin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavCollin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 999 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vCOLLIN");
            GX_FocusControl = edtavCollin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV26ColLin = (short)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ColLin), 3, 0));
         }
         else
         {
            AV26ColLin = (short)(localUtil.ctol( httpContext.cgiGet( edtavCollin_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV26ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ColLin), 3, 0));
         }
         if ( ( ( localUtil.ctond( httpContext.cgiGet( edtavForcan_Internalname)).doubleValue() < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavForcan_Internalname)), DecimalUtil.stringToDec("99999.99999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORCAN");
            GX_FocusControl = edtavForcan_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV28ForCan = DecimalUtil.ZERO ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ForCan", GXutil.ltrimstr( AV28ForCan, 11, 5));
         }
         else
         {
            AV28ForCan = localUtil.ctond( httpContext.cgiGet( edtavForcan_Internalname)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV28ForCan", GXutil.ltrimstr( AV28ForCan, 11, 5));
         }
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep")) > 9 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vFORPRDUME");
            GX_FocusControl = edtavForprdume_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV29ForPrdUMe = (byte)(0) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29ForPrdUMe", GXutil.str( AV29ForPrdUMe, 1, 0));
         }
         else
         {
            AV29ForPrdUMe = (byte)(localUtil.ctol( httpContext.cgiGet( edtavForprdume_Internalname), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV29ForPrdUMe", GXutil.str( AV29ForPrdUMe, 1, 0));
         }
         AV30ForPrdDsc = httpContext.cgiGet( edtavForprddsc_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV30ForPrdDsc", AV30ForPrdDsc);
         AV73TotValueForCan = httpContext.cgiGet( edtavTotvalueforcan_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV73TotValueForCan", AV73TotValueForCan);
         AV80Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
         AV27PrdNum = httpContext.cgiGet( edtavPrdnum_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrdNum", AV27PrdNum);
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         forbiddenHiddens = new com.genexus.util.GXProperties() ;
         forbiddenHiddens.add("hshsalt", "hsh"+"ColorColorantes__WP");
         AV80Pgmname = httpContext.cgiGet( edtavPgmname_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV80Pgmname", AV80Pgmname);
         forbiddenHiddens.add("Pgmname", GXutil.rtrim( localUtil.format( AV80Pgmname, "")));
         hsh = httpContext.cgiGet( "hsh") ;
         if ( ! GXutil.checkEncryptedSignature( forbiddenHiddens.toString(), hsh, GXKey) )
         {
            GXutil.writeLogError("formulaciontinte\\colorcolorantes__wp:[ SecurityCheckFailed (403 Forbidden) value for]"+forbiddenHiddens.toJSonString());
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
      e2028X2 ();
      if (returnInSub) return;
   }

   public void e2028X2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV57Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      colorcolorantes__wp_impl.this.GXt_char1 = GXv_char2[0] ;
      AV57Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV57Station", AV57Station);
      GXv_char2[0] = AV15EmprCod ;
      GXv_char3[0] = AV58EmprNom ;
      GXv_char4[0] = AV59UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV57Station, GXv_char2, GXv_char3, GXv_char4) ;
      colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char2[0] ;
      colorcolorantes__wp_impl.this.AV58EmprNom = GXv_char3[0] ;
      colorcolorantes__wp_impl.this.AV59UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
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
      Form.setCaption( httpContext.getMessage( "Colorantes", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV24OrderedBy < 1 )
      {
         AV24OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = AV44DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[0] ;
      AV44DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5;
      Gridpaginationbar_Rowsperpageselectedvalue = subGrid_Rows ;
      ucGridpaginationbar.sendProperty(context, "", false, Gridpaginationbar_Internalname, "RowsPerPageSelectedValue", GXutil.ltrimstr( DecimalUtil.doubleToDec(Gridpaginationbar_Rowsperpageselectedvalue), 9, 0));
      GXt_char1 = AV60msg0 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WMSG265_", ""), (byte)(99), GXv_char4) ;
      colorcolorantes__wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV60msg0 = GXt_char1 ;
      GXt_int7 = (byte)(AV61F_lavand) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "LAVAND", ""), GXv_int8) ;
      colorcolorantes__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV61F_lavand = GXt_int7 ;
      GXt_int7 = (byte)(AV62ClaveCol) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "CLAVEC", ""), GXv_int8) ;
      colorcolorantes__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV62ClaveCol = GXt_int7 ;
      GXt_int7 = (byte)(AV63OtraformaAux) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "IN0AUX", ""), GXv_int8) ;
      colorcolorantes__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV63OtraformaAux = GXt_int7 ;
      GXt_int7 = (byte)(AV64fam1d1) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "FAM1D1", ""), GXv_int8) ;
      colorcolorantes__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV64fam1d1 = GXt_int7 ;
      GXt_int7 = (byte)(AV65prdaux) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "PRD#", ""), GXv_int8) ;
      colorcolorantes__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV65prdaux = GXt_int7 ;
      GXt_int7 = (byte)(AV66texpasa) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "TEXPAS", ""), GXv_int8) ;
      colorcolorantes__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV66texpasa = GXt_int7 ;
      GXt_char1 = AV67Lit13 ;
      GXv_char4[0] = GXt_char1 ;
      new app.core.pobtlit(remoteHandle, context).execute( httpContext.getMessage( "WLIT2006_", ""), (byte)(99), GXv_char4) ;
      colorcolorantes__wp_impl.this.GXt_char1 = GXv_char4[0] ;
      AV67Lit13 = GXt_char1 ;
      AV68TitTxt = ((AV64fam1d1==0) ? " " : httpContext.getMessage( "El sistema controla solo 1ª Posicion Familia Productos: 3,4..etc", "")) ;
      GXt_int7 = (byte)(AV69MForEq) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MFOREQ", ""), GXv_int8) ;
      colorcolorantes__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV69MForEq = GXt_int7 ;
      GXt_int7 = (byte)(AV75moda21) ;
      GXv_int8[0] = GXt_int7 ;
      new app.pexicon(remoteHandle, context).execute( AV15EmprCod, httpContext.getMessage( "MODA21", ""), GXv_int8) ;
      colorcolorantes__wp_impl.this.GXt_int7 = GXv_int8[0] ;
      AV75moda21 = GXt_int7 ;
      GXt_int9 = AV26ColLin ;
      GXv_int10[0] = GXt_int9 ;
      new app.formulaciontinte.getcolorcolorantes(remoteHandle, context).execute( AV15EmprCod, AV14ForNumCol, GXv_int10) ;
      colorcolorantes__wp_impl.this.GXt_int9 = GXv_int10[0] ;
      AV26ColLin = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ColLin), 3, 0));
      edtavForprdume_Enabled = ((AV75moda21==1) ? 0 : 1) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavForprdume_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavForprdume_Enabled), 5, 0), true);
      AV77Acciongridmodificar = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Acciongridmodificar), 4, 0));
   }

   public void e2128X2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV18WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV18WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'INITIALIZETOTALIZERS' */
      S162 ();
      if (returnInSub) return;
      AV46GridCurrentPage = subgrid_fnc_currentpage( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV46GridCurrentPage", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV46GridCurrentPage), 10, 0));
      AV47GridPageCount = subgrid_fnc_pagecount( ) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47GridPageCount", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV47GridPageCount), 10, 0));
      /* Execute user subroutine: 'CALCULATETOTALIZERS' */
      S172 ();
      if (returnInSub) return;
      if ( AV77Acciongridmodificar == 1 )
      {
         AV77Acciongridmodificar = (short)(0) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV77Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Acciongridmodificar), 4, 0));
      }
      else
      {
         System.out.println( httpContext.getMessage( "---calculo coste-----", "") );
         GXv_char4[0] = AV15EmprCod ;
         GXv_int12[0] = AV10Clicod ;
         GXv_char3[0] = AV9Forser ;
         GXv_char2[0] = AV8Forcolnom ;
         GXv_int13[0] = AV7ForcolNum ;
         GXv_int8[0] = AV6Tipcolcod ;
         GXv_decimal14[0] = DecimalUtil.doubleToDec(1) ;
         GXv_int15[0] = (int)(DecimalUtil.decToDouble(AV5ForRelBan)) ;
         GXv_char16[0] = " " ;
         GXv_decimal17[0] = DecimalUtil.doubleToDec(0) ;
         new app.psimulax(remoteHandle, context).execute( GXv_char4, GXv_int12, GXv_char3, GXv_char2, GXv_int13, GXv_int8, GXv_decimal14, GXv_int15, GXv_char16, GXv_decimal17) ;
         colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char4[0] ;
         colorcolorantes__wp_impl.this.AV10Clicod = GXv_int12[0] ;
         colorcolorantes__wp_impl.this.AV9Forser = GXv_char3[0] ;
         colorcolorantes__wp_impl.this.AV8Forcolnom = GXv_char2[0] ;
         colorcolorantes__wp_impl.this.AV7ForcolNum = GXv_int13[0] ;
         colorcolorantes__wp_impl.this.AV6Tipcolcod = GXv_int8[0] ;
         colorcolorantes__wp_impl.this.AV5ForRelBan = DecimalUtil.doubleToDec(GXv_int15[0]) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV10Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Clicod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9Forser", AV9Forser);
         httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
         httpContext.ajax_rsp_assign_attri("", false, "AV7ForcolNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ForcolNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV6Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Tipcolcod), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV5ForRelBan", GXutil.ltrimstr( AV5ForRelBan, 7, 2));
         GXv_char16[0] = AV15EmprCod ;
         GXv_char4[0] = AV57Station ;
         GXv_decimal17[0] = AV74Valor_cor ;
         new app.pcoscor(remoteHandle, context).execute( GXv_char16, GXv_char4, GXv_decimal17) ;
         colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
         colorcolorantes__wp_impl.this.AV57Station = GXv_char4[0] ;
         colorcolorantes__wp_impl.this.AV74Valor_cor = GXv_decimal17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV57Station", AV57Station);
         httpContext.ajax_rsp_assign_attri("", false, "AV74Valor_cor", GXutil.ltrimstr( AV74Valor_cor, 11, 5));
         GXv_char16[0] = AV15EmprCod ;
         GXv_int15[0] = AV10Clicod ;
         GXv_char4[0] = AV9Forser ;
         GXv_char3[0] = AV8Forcolnom ;
         GXv_int13[0] = AV7ForcolNum ;
         GXv_int8[0] = AV6Tipcolcod ;
         GXv_decimal17[0] = AV74Valor_cor ;
         new app.pupdcos(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_decimal17) ;
         colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
         colorcolorantes__wp_impl.this.AV10Clicod = GXv_int15[0] ;
         colorcolorantes__wp_impl.this.AV9Forser = GXv_char4[0] ;
         colorcolorantes__wp_impl.this.AV8Forcolnom = GXv_char3[0] ;
         colorcolorantes__wp_impl.this.AV7ForcolNum = GXv_int13[0] ;
         colorcolorantes__wp_impl.this.AV6Tipcolcod = GXv_int8[0] ;
         colorcolorantes__wp_impl.this.AV74Valor_cor = GXv_decimal17[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV10Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Clicod), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV9Forser", AV9Forser);
         httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
         httpContext.ajax_rsp_assign_attri("", false, "AV7ForcolNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ForcolNum), 6, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV6Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Tipcolcod), 2, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV74Valor_cor", GXutil.ltrimstr( AV74Valor_cor, 11, 5));
         System.out.println( httpContext.getMessage( "Coste= ", "")+GXutil.str( AV74Valor_cor, 11, 5) );
         GXt_int9 = AV26ColLin ;
         GXv_int10[0] = GXt_int9 ;
         new app.formulaciontinte.getcolorcolorantes(remoteHandle, context).execute( AV15EmprCod, AV14ForNumCol, GXv_int10) ;
         colorcolorantes__wp_impl.this.GXt_int9 = GXv_int10[0] ;
         AV26ColLin = GXt_int9 ;
         httpContext.ajax_rsp_assign_attri("", false, "AV26ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ColLin), 3, 0));
      }
      AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin = AV32TFColLin ;
      AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to = AV33TFColLin_To ;
      AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = AV34TFPrdNum ;
      AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = AV36TFPrdNom ;
      AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan = AV38TFForCan ;
      AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to = AV39TFForCan_To ;
      AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume = AV40TFForPrdUMe ;
      AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to = AV41TFForPrdUMe_To ;
      AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = AV42TFForPrdDsc ;
      AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel = AV43TFForPrdDsc_Sel ;
      /*  Sending Event outputs  */
   }

   public void e1228X2( )
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

   public void e1328X2( )
   {
      /* Gridpaginationbar_Changerowsperpage Routine */
      returnInSub = false ;
      subGrid_Rows = Gridpaginationbar_Rowsperpageselectedvalue ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      subgrid_firstpage( ) ;
      /*  Sending Event outputs  */
   }

   public void e1428X2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV24OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV24OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24OrderedBy), 4, 0));
         AV25OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV25OrderedDsc", AV25OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ColLin") == 0 )
         {
            AV32TFColLin = (short)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFColLin), 3, 0));
            AV33TFColLin_To = (short)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFColLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFColLin_To), 3, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV34TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrdNum", AV34TFPrdNum);
            AV35TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFPrdNum_Sel", AV35TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV36TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrdNom", AV36TFPrdNom);
            AV37TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrdNom_Sel", AV37TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForCan") == 0 )
         {
            AV38TFForCan = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFForCan", GXutil.ltrimstr( AV38TFForCan, 11, 5));
            AV39TFForCan_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFForCan_To", GXutil.ltrimstr( AV39TFForCan_To, 11, 5));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdUMe") == 0 )
         {
            AV40TFForPrdUMe = (byte)(GXutil.lval( Ddo_grid_Filteredtext_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFForPrdUMe", GXutil.str( AV40TFForPrdUMe, 1, 0));
            AV41TFForPrdUMe_To = (byte)(GXutil.lval( Ddo_grid_Filteredtextto_get)) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFForPrdUMe_To", GXutil.str( AV41TFForPrdUMe_To, 1, 0));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "ForPrdDsc") == 0 )
         {
            AV42TFForPrdDsc = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFForPrdDsc", AV42TFForPrdDsc);
            AV43TFForPrdDsc_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFForPrdDsc_Sel", AV43TFForPrdDsc_Sel);
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e2228X2( )
   {
      /* Grid_Load Routine */
      returnInSub = false ;
      cmbavGridactiongroup1.removeAllItems();
      cmbavGridactiongroup1.addItem("0", ";fa fa-bars", (short)(0));
      cmbavGridactiongroup1.addItem("1", GXutil.format( "%1;%2", httpContext.getMessage( "GX_BtnDelete", ""), "fa fa-times", "", "", "", "", "", "", ""), (short)(0));
      AV50PrdRGB = ((A13232PrdRGB==0) ? 65793 : A13232PrdRGB) ;
      httpContext.ajax_rsp_assign_attri("", false, edtavPrdrgb_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV50PrdRGB), 10, 0));
      GXv_int10[0] = AV51R ;
      GXv_int18[0] = AV52G ;
      GXv_int19[0] = AV53B ;
      GXv_int20[0] = AV54R2 ;
      GXv_int21[0] = AV55G2 ;
      GXv_int22[0] = AV56B2 ;
      new app.backcolorforecolor(remoteHandle, context).execute( AV50PrdRGB, GXv_int10, GXv_int18, GXv_int19, GXv_int20, GXv_int21, GXv_int22) ;
      colorcolorantes__wp_impl.this.AV51R = GXv_int10[0] ;
      colorcolorantes__wp_impl.this.AV52G = GXv_int18[0] ;
      colorcolorantes__wp_impl.this.AV53B = GXv_int19[0] ;
      colorcolorantes__wp_impl.this.AV54R2 = GXv_int20[0] ;
      colorcolorantes__wp_impl.this.AV55G2 = GXv_int21[0] ;
      colorcolorantes__wp_impl.this.AV56B2 = GXv_int22[0] ;
      httpContext.ajax_rsp_assign_attri("", false, edtavR_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV51R), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV52G), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV53B), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavR2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV54R2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavG2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV55G2), 3, 0));
      httpContext.ajax_rsp_assign_attri("", false, edtavB2_Internalname, GXutil.ltrimstr( DecimalUtil.doubleToDec(AV56B2), 3, 0));
      edtPrdNum_Backcolor = GXutil.getColor( AV51R, AV52G, AV53B) ;
      edtPrdNum_Forecolor = GXutil.getColor( AV54R2, AV55G2, AV56B2) ;
      /* Load Method */
      if ( wbStart != -1 )
      {
         wbStart = (short)(88) ;
      }
      sendrow_882( ) ;
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_88_Refreshing )
      {
         httpContext.doAjaxLoad(88, GridRow);
      }
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV71GridActionGroup1, 4, 0)) );
   }

   public void e2328X2( )
   {
      /* Gridactiongroup1_Click Routine */
      returnInSub = false ;
      if ( AV71GridActionGroup1 == 1 )
      {
         /* Execute user subroutine: 'DO DELETE' */
         S182 ();
         if (returnInSub) return;
      }
      AV71GridActionGroup1 = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71GridActionGroup1), 4, 0));
      /*  Sending Event outputs  */
      cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV71GridActionGroup1, 4, 0)) );
      httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), true);
   }

   public void GXEnter( )
   {
      /* Execute user event: Enter */
      e1628X2 ();
      if (returnInSub) return;
   }

   public void e1628X2( )
   {
      /* Enter Routine */
      returnInSub = false ;
      lblTbmessage_Caption = "" ;
      httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
      GXt_char1 = AV76ForPrdDsccontrol ;
      GXv_char16[0] = GXt_char1 ;
      new app.get_forprddsc(remoteHandle, context).execute( AV15EmprCod, AV29ForPrdUMe, GXv_char16) ;
      colorcolorantes__wp_impl.this.GXt_char1 = GXv_char16[0] ;
      AV76ForPrdDsccontrol = GXt_char1 ;
      if ( GXutil.strcmp(AV76ForPrdDsccontrol, httpContext.getMessage( "Error", "")) == 0 )
      {
         lblTbmessage_Caption = httpContext.getMessage( "NO es una UNIDAD Valida", "") ;
         httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
         GX_FocusControl = edtavForprdume_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (0==AV26ColLin) )
         {
            lblTbmessage_Caption = httpContext.getMessage( "Falta #", "") ;
            httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
            GX_FocusControl = edtavCollin_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (GXutil.strcmp("", AV27PrdNum)==0) )
            {
               lblTbmessage_Caption = httpContext.getMessage( "Falta Producto", "") ;
               httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
               GX_FocusControl = edtavPrdnum_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28ForCan)==0) )
               {
                  lblTbmessage_Caption = httpContext.getMessage( "Cantidad nula", "") ;
                  httpContext.ajax_rsp_assign_prop("", false, lblTbmessage_Internalname, "Caption", lblTbmessage_Caption, true);
                  GX_FocusControl = edtavForcan_Internalname ;
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
      /*  Sending Event outputs  */
   }

   public void e1528X2( )
   {
      /* Dvelop_confirmpanel_enter_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_enter_Result, "Yes") == 0 )
      {
         /* Execute user subroutine: 'DO ACTION ENTER' */
         S192 ();
         if (returnInSub) return;
      }
      /*  Sending Event outputs  */
   }

   public void e1728X2( )
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

   public void e1128X2( )
   {
      /* Combo_prdnum_Onoptionclicked Routine */
      returnInSub = false ;
      AV27PrdNum = Combo_prdnum_Selectedvalue_get ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27PrdNum", AV27PrdNum);
      /* Execute user subroutine: 'UNIDADPRODUCTO' */
      S202 ();
      if (returnInSub) return;
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV24OrderedBy, 4, 0))+":"+(AV25OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S182( )
   {
      /* 'DO DELETE' Routine */
      returnInSub = false ;
      if ( 1 == 0 )
      {
         httpContext.popup(formatLink("app.formulaciontinte.colorcolorantes_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A309ColLin,3,0))}, new String[] {"Mode","EmprCod","ForNumCol","ColLin"}) , new Object[] {});
         httpContext.doAjaxRefresh();
      }
      httpContext.popup(formatLink("app.formulaciontinte.colorcolorantes_trn", new String[] {GXutil.URLEncode(GXutil.rtrim("DLT")),GXutil.URLEncode(GXutil.rtrim(AV15EmprCod)),GXutil.URLEncode(GXutil.ltrimstr(AV14ForNumCol,8,0)),GXutil.URLEncode(GXutil.ltrimstr(A309ColLin,3,0))}, new String[] {"Mode","EmprCod","ForNumCol","ColLin"}) , new Object[] {});
      System.out.println( httpContext.getMessage( "---calculo coste-----", "") );
      GXv_char16[0] = AV15EmprCod ;
      GXv_int15[0] = AV10Clicod ;
      GXv_char4[0] = AV9Forser ;
      GXv_char3[0] = AV8Forcolnom ;
      GXv_int13[0] = AV7ForcolNum ;
      GXv_int8[0] = AV6Tipcolcod ;
      GXv_decimal17[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int12[0] = (int)(DecimalUtil.decToDouble(AV5ForRelBan)) ;
      GXv_char2[0] = " " ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_decimal17, GXv_int12, GXv_char2, GXv_decimal14) ;
      colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
      colorcolorantes__wp_impl.this.AV10Clicod = GXv_int15[0] ;
      colorcolorantes__wp_impl.this.AV9Forser = GXv_char4[0] ;
      colorcolorantes__wp_impl.this.AV8Forcolnom = GXv_char3[0] ;
      colorcolorantes__wp_impl.this.AV7ForcolNum = GXv_int13[0] ;
      colorcolorantes__wp_impl.this.AV6Tipcolcod = GXv_int8[0] ;
      colorcolorantes__wp_impl.this.AV5ForRelBan = DecimalUtil.doubleToDec(GXv_int12[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV10Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Clicod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9Forser", AV9Forser);
      httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV7ForcolNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ForcolNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Tipcolcod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV5ForRelBan", GXutil.ltrimstr( AV5ForRelBan, 7, 2));
      GXv_char16[0] = AV15EmprCod ;
      GXv_char4[0] = AV57Station ;
      GXv_decimal17[0] = AV74Valor_cor ;
      new app.pcoscor(remoteHandle, context).execute( GXv_char16, GXv_char4, GXv_decimal17) ;
      colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
      colorcolorantes__wp_impl.this.AV57Station = GXv_char4[0] ;
      colorcolorantes__wp_impl.this.AV74Valor_cor = GXv_decimal17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV57Station", AV57Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV74Valor_cor", GXutil.ltrimstr( AV74Valor_cor, 11, 5));
      GXv_char16[0] = AV15EmprCod ;
      GXv_int15[0] = AV10Clicod ;
      GXv_char4[0] = AV9Forser ;
      GXv_char3[0] = AV8Forcolnom ;
      GXv_int13[0] = AV7ForcolNum ;
      GXv_int8[0] = AV6Tipcolcod ;
      GXv_decimal17[0] = AV74Valor_cor ;
      new app.pupdcos(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_decimal17) ;
      colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
      colorcolorantes__wp_impl.this.AV10Clicod = GXv_int15[0] ;
      colorcolorantes__wp_impl.this.AV9Forser = GXv_char4[0] ;
      colorcolorantes__wp_impl.this.AV8Forcolnom = GXv_char3[0] ;
      colorcolorantes__wp_impl.this.AV7ForcolNum = GXv_int13[0] ;
      colorcolorantes__wp_impl.this.AV6Tipcolcod = GXv_int8[0] ;
      colorcolorantes__wp_impl.this.AV74Valor_cor = GXv_decimal17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV10Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Clicod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9Forser", AV9Forser);
      httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV7ForcolNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ForcolNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Tipcolcod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV74Valor_cor", GXutil.ltrimstr( AV74Valor_cor, 11, 5));
      System.out.println( httpContext.getMessage( "Coste= ", "")+GXutil.str( AV74Valor_cor, 11, 5) );
      httpContext.doAjaxRefresh();
   }

   public void S192( )
   {
      /* 'DO ACTION ENTER' Routine */
      returnInSub = false ;
      new app.formulaciontinte.colorcolorantes_ins_upd(remoteHandle, context).execute( AV15EmprCod, AV14ForNumCol, AV26ColLin, AV27PrdNum, AV29ForPrdUMe, AV28ForCan) ;
      new app.formulaciontinte.colorcolorantes_colultlin(remoteHandle, context).execute( AV15EmprCod, AV14ForNumCol) ;
      AV29ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29ForPrdUMe", GXutil.str( AV29ForPrdUMe, 1, 0));
      AV28ForCan = DecimalUtil.ZERO ;
      httpContext.ajax_rsp_assign_attri("", false, "AV28ForCan", GXutil.ltrimstr( AV28ForCan, 11, 5));
      AV27PrdNum = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27PrdNum", AV27PrdNum);
      Combo_prdnum_Selectedvalue_set = AV27PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      System.out.println( httpContext.getMessage( "---calculo coste-----", "") );
      GXv_char16[0] = AV15EmprCod ;
      GXv_int15[0] = AV10Clicod ;
      GXv_char4[0] = AV9Forser ;
      GXv_char3[0] = AV8Forcolnom ;
      GXv_int13[0] = AV7ForcolNum ;
      GXv_int8[0] = AV6Tipcolcod ;
      GXv_decimal17[0] = DecimalUtil.doubleToDec(1) ;
      GXv_int12[0] = (int)(DecimalUtil.decToDouble(AV5ForRelBan)) ;
      GXv_char2[0] = " " ;
      GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
      new app.psimulax(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_decimal17, GXv_int12, GXv_char2, GXv_decimal14) ;
      colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
      colorcolorantes__wp_impl.this.AV10Clicod = GXv_int15[0] ;
      colorcolorantes__wp_impl.this.AV9Forser = GXv_char4[0] ;
      colorcolorantes__wp_impl.this.AV8Forcolnom = GXv_char3[0] ;
      colorcolorantes__wp_impl.this.AV7ForcolNum = GXv_int13[0] ;
      colorcolorantes__wp_impl.this.AV6Tipcolcod = GXv_int8[0] ;
      colorcolorantes__wp_impl.this.AV5ForRelBan = DecimalUtil.doubleToDec(GXv_int12[0]) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV10Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Clicod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9Forser", AV9Forser);
      httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV7ForcolNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ForcolNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Tipcolcod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV5ForRelBan", GXutil.ltrimstr( AV5ForRelBan, 7, 2));
      GXv_char16[0] = AV15EmprCod ;
      GXv_char4[0] = AV57Station ;
      GXv_decimal17[0] = AV74Valor_cor ;
      new app.pcoscor(remoteHandle, context).execute( GXv_char16, GXv_char4, GXv_decimal17) ;
      colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
      colorcolorantes__wp_impl.this.AV57Station = GXv_char4[0] ;
      colorcolorantes__wp_impl.this.AV74Valor_cor = GXv_decimal17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV57Station", AV57Station);
      httpContext.ajax_rsp_assign_attri("", false, "AV74Valor_cor", GXutil.ltrimstr( AV74Valor_cor, 11, 5));
      GXv_char16[0] = AV15EmprCod ;
      GXv_int15[0] = AV10Clicod ;
      GXv_char4[0] = AV9Forser ;
      GXv_char3[0] = AV8Forcolnom ;
      GXv_int13[0] = AV7ForcolNum ;
      GXv_int8[0] = AV6Tipcolcod ;
      GXv_decimal17[0] = AV74Valor_cor ;
      new app.pupdcos(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_decimal17) ;
      colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
      colorcolorantes__wp_impl.this.AV10Clicod = GXv_int15[0] ;
      colorcolorantes__wp_impl.this.AV9Forser = GXv_char4[0] ;
      colorcolorantes__wp_impl.this.AV8Forcolnom = GXv_char3[0] ;
      colorcolorantes__wp_impl.this.AV7ForcolNum = GXv_int13[0] ;
      colorcolorantes__wp_impl.this.AV6Tipcolcod = GXv_int8[0] ;
      colorcolorantes__wp_impl.this.AV74Valor_cor = GXv_decimal17[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV10Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Clicod), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV9Forser", AV9Forser);
      httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
      httpContext.ajax_rsp_assign_attri("", false, "AV7ForcolNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ForcolNum), 6, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV6Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Tipcolcod), 2, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV74Valor_cor", GXutil.ltrimstr( AV74Valor_cor, 11, 5));
      System.out.println( httpContext.getMessage( "Coste= ", "")+GXutil.str( AV74Valor_cor, 11, 5) );
      GXt_int9 = AV26ColLin ;
      GXv_int22[0] = GXt_int9 ;
      new app.formulaciontinte.getcolorcolorantes(remoteHandle, context).execute( AV15EmprCod, AV14ForNumCol, GXv_int22) ;
      colorcolorantes__wp_impl.this.GXt_int9 = GXv_int22[0] ;
      AV26ColLin = GXt_int9 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ColLin), 3, 0));
      httpContext.doAjaxRefresh();
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV31Session.getValue(AV80Pgmname+"GridState"), "") == 0 )
      {
         AV22GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV80Pgmname+"GridState"), null, null);
      }
      else
      {
         AV22GridState.fromxml(AV31Session.getValue(AV80Pgmname+"GridState"), null, null);
      }
      AV24OrderedBy = AV22GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV24OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV24OrderedBy), 4, 0));
      AV25OrderedDsc = AV22GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV25OrderedDsc", AV25OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV93GXV1 = 1 ;
      while ( AV93GXV1 <= AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV23GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV93GXV1));
         if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFCOLLIN") == 0 )
         {
            AV32TFColLin = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV32TFColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV32TFColLin), 3, 0));
            AV33TFColLin_To = (short)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV33TFColLin_To", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV33TFColLin_To), 3, 0));
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV34TFPrdNum = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV34TFPrdNum", AV34TFPrdNum);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV35TFPrdNum_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV35TFPrdNum_Sel", AV35TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV36TFPrdNom = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV36TFPrdNom", AV36TFPrdNom);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV37TFPrdNom_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV37TFPrdNom_Sel", AV37TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORCAN") == 0 )
         {
            AV38TFForCan = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV38TFForCan", GXutil.ltrimstr( AV38TFForCan, 11, 5));
            AV39TFForCan_To = CommonUtil.decimalVal( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV39TFForCan_To", GXutil.ltrimstr( AV39TFForCan_To, 11, 5));
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDUME") == 0 )
         {
            AV40TFForPrdUMe = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFForPrdUMe", GXutil.str( AV40TFForPrdUMe, 1, 0));
            AV41TFForPrdUMe_To = (byte)(GXutil.lval( AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto())) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFForPrdUMe_To", GXutil.str( AV41TFForPrdUMe_To, 1, 0));
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC") == 0 )
         {
            AV42TFForPrdDsc = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV42TFForPrdDsc", AV42TFForPrdDsc);
         }
         else if ( GXutil.strcmp(AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFFORPRDDSC_SEL") == 0 )
         {
            AV43TFForPrdDsc_Sel = AV23GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFForPrdDsc_Sel", AV43TFForPrdDsc_Sel);
         }
         AV93GXV1 = (int)(AV93GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char16[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV35TFPrdNum_Sel)==0), AV35TFPrdNum_Sel, GXv_char16) ;
      colorcolorantes__wp_impl.this.GXt_char1 = GXv_char16[0] ;
      GXt_char23 = "" ;
      GXv_char4[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV37TFPrdNom_Sel)==0), AV37TFPrdNom_Sel, GXv_char4) ;
      colorcolorantes__wp_impl.this.GXt_char23 = GXv_char4[0] ;
      GXt_char24 = "" ;
      GXv_char3[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFForPrdDsc_Sel)==0), AV43TFForPrdDsc_Sel, GXv_char3) ;
      colorcolorantes__wp_impl.this.GXt_char24 = GXv_char3[0] ;
      Ddo_grid_Selectedvalue_set = "|"+GXt_char1+"|"+GXt_char23+"|||"+GXt_char24 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char24 = "" ;
      GXv_char16[0] = GXt_char24 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV34TFPrdNum)==0), AV34TFPrdNum, GXv_char16) ;
      colorcolorantes__wp_impl.this.GXt_char24 = GXv_char16[0] ;
      GXt_char23 = "" ;
      GXv_char4[0] = GXt_char23 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV36TFPrdNom)==0), AV36TFPrdNom, GXv_char4) ;
      colorcolorantes__wp_impl.this.GXt_char23 = GXv_char4[0] ;
      GXt_char1 = "" ;
      GXv_char3[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV42TFForPrdDsc)==0), AV42TFForPrdDsc, GXv_char3) ;
      colorcolorantes__wp_impl.this.GXt_char1 = GXv_char3[0] ;
      Ddo_grid_Filteredtext_set = ((0==AV32TFColLin) ? "" : GXutil.str( AV32TFColLin, 3, 0))+"|"+GXt_char24+"|"+GXt_char23+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFForCan)==0) ? "" : GXutil.str( AV38TFForCan, 11, 5))+"|"+((0==AV40TFForPrdUMe) ? "" : GXutil.str( AV40TFForPrdUMe, 1, 0))+"|"+GXt_char1 ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = ((0==AV33TFColLin_To) ? "" : GXutil.str( AV33TFColLin_To, 3, 0))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFForCan_To)==0) ? "" : GXutil.str( AV39TFForCan_To, 11, 5))+"|"+((0==AV41TFForPrdUMe_To) ? "" : GXutil.str( AV41TFForPrdUMe_To, 1, 0))+"|" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
      if ( ! (GXutil.strcmp("", GXutil.trim( AV22GridState.getgxTv_SdtWWPGridState_Pagesize()))==0) )
      {
         subGrid_Rows = (int)(GXutil.lval( AV22GridState.getgxTv_SdtWWPGridState_Pagesize())) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      }
      subgrid_gotopage( AV22GridState.getgxTv_SdtWWPGridState_Currentpage()) ;
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV22GridState.fromxml(AV31Session.getValue(AV80Pgmname+"GridState"), null, null);
      AV22GridState.setgxTv_SdtWWPGridState_Orderedby( AV24OrderedBy );
      AV22GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV25OrderedDsc );
      AV22GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState25[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFCOLLIN", "", !((0==AV32TFColLin)&&(0==AV33TFColLin_To)), (short)(0), GXutil.trim( GXutil.str( AV32TFColLin, 3, 0)), GXutil.trim( GXutil.str( AV33TFColLin_To, 3, 0))) ;
      AV22GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFPRDNUM", "", !(GXutil.strcmp("", AV34TFPrdNum)==0), (short)(0), AV34TFPrdNum, "", !(GXutil.strcmp("", AV35TFPrdNum_Sel)==0), AV35TFPrdNum_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFPRDNOM", "", !(GXutil.strcmp("", AV36TFPrdNom)==0), (short)(0), AV36TFPrdNom, "", !(GXutil.strcmp("", AV37TFPrdNom_Sel)==0), AV37TFPrdNom_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFFORCAN", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV38TFForCan)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV39TFForCan_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV38TFForCan, 11, 5)), GXutil.trim( GXutil.str( AV39TFForCan_To, 11, 5))) ;
      AV22GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFFORPRDUME", "", !((0==AV40TFForPrdUMe)&&(0==AV41TFForPrdUMe_To)), (short)(0), GXutil.trim( GXutil.str( AV40TFForPrdUMe, 1, 0)), GXutil.trim( GXutil.str( AV41TFForPrdUMe_To, 1, 0))) ;
      AV22GridState = GXv_SdtWWPGridState25[0] ;
      GXv_SdtWWPGridState25[0] = AV22GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState25, "TFFORPRDDSC", "", !(GXutil.strcmp("", AV42TFForPrdDsc)==0), (short)(0), AV42TFForPrdDsc, "", !(GXutil.strcmp("", AV43TFForPrdDsc_Sel)==0), AV43TFForPrdDsc_Sel, "") ;
      AV22GridState = GXv_SdtWWPGridState25[0] ;
      AV22GridState.setgxTv_SdtWWPGridState_Pagesize( GXutil.str( subGrid_Rows, 10, 0) );
      AV22GridState.setgxTv_SdtWWPGridState_Currentpage( (short)(subgrid_fnc_currentpage( )) );
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV80Pgmname+"GridState", AV22GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV20TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV20TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV80Pgmname );
      AV20TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV20TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV19HTTPRequest.getScriptName()+"?"+AV19HTTPRequest.getQuerystring() );
      AV20TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "LDFORM" );
      AV31Session.setValue("TrnContext", AV20TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S162( )
   {
      /* 'INITIALIZETOTALIZERS' Routine */
      returnInSub = false ;
      AV72TotForCan = DecimalUtil.doubleToDec(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV72TotForCan", GXutil.ltrimstr( AV72TotForCan, 18, 5));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFORCAN", getSecureSignedToken( "", localUtil.format( AV72TotForCan, "ZZZZ9.99999")));
   }

   public void S172( )
   {
      /* 'CALCULATETOTALIZERS' Routine */
      returnInSub = false ;
      AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin = AV32TFColLin ;
      AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to = AV33TFColLin_To ;
      AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = AV34TFPrdNum ;
      AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel = AV35TFPrdNum_Sel ;
      AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = AV36TFPrdNom ;
      AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel = AV37TFPrdNom_Sel ;
      AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan = AV38TFForCan ;
      AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to = AV39TFForCan_To ;
      AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume = AV40TFForPrdUMe ;
      AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to = AV41TFForPrdUMe_To ;
      AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = AV42TFForPrdDsc ;
      AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel = AV43TFForPrdDsc_Sel ;
      pr_default.dynParam(2, new Object[]{ new Object[]{
                                           Short.valueOf(AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin) ,
                                           Short.valueOf(AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to) ,
                                           AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel ,
                                           AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum ,
                                           AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel ,
                                           AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom ,
                                           AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan ,
                                           AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to ,
                                           Byte.valueOf(AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume) ,
                                           Byte.valueOf(AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to) ,
                                           AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel ,
                                           AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc ,
                                           Short.valueOf(A309ColLin) ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A481ForCan ,
                                           Byte.valueOf(A490ForPrdUMe) ,
                                           A488ForPrdDsc ,
                                           AV15EmprCod ,
                                           Integer.valueOf(AV14ForNumCol) ,
                                           A396EmprCod ,
                                           Integer.valueOf(A486ForNumCol) } ,
                                           new int[]{
                                           TypeConstants.SHORT, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.BYTE,
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.SHORT, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.BOOLEAN, TypeConstants.STRING,
                                           TypeConstants.INT, TypeConstants.STRING, TypeConstants.INT
                                           }
      });
      lV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = GXutil.padr( GXutil.rtrim( AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum), 6, "%") ;
      lV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = GXutil.padr( GXutil.rtrim( AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom), 26, "%") ;
      lV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = GXutil.padr( GXutil.rtrim( AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc), 5, "%") ;
      /* Using cursor H028X4 */
      pr_default.execute(2, new Object[] {AV15EmprCod, Integer.valueOf(AV14ForNumCol), Short.valueOf(AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin), Short.valueOf(AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to), lV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum, AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel, lV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom, AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel, AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan, AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to, Byte.valueOf(AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume), Byte.valueOf(AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to), lV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc, AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A486ForNumCol = H028X4_A486ForNumCol[0] ;
         A396EmprCod = H028X4_A396EmprCod[0] ;
         A488ForPrdDsc = H028X4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H028X4_n488ForPrdDsc[0] ;
         A490ForPrdUMe = H028X4_A490ForPrdUMe[0] ;
         A481ForCan = H028X4_A481ForCan[0] ;
         A718PrdNom = H028X4_A718PrdNom[0] ;
         A719PrdNum = H028X4_A719PrdNum[0] ;
         A309ColLin = H028X4_A309ColLin[0] ;
         A488ForPrdDsc = H028X4_A488ForPrdDsc[0] ;
         n488ForPrdDsc = H028X4_n488ForPrdDsc[0] ;
         A718PrdNom = H028X4_A718PrdNom[0] ;
         AV72TotForCan = A481ForCan.add(AV72TotForCan) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV72TotForCan", GXutil.ltrimstr( AV72TotForCan, 18, 5));
         app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vTOTFORCAN", getSecureSignedToken( "", localUtil.format( AV72TotForCan, "ZZZZ9.99999")));
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV73TotValueForCan = localUtil.format( AV72TotForCan, "ZZZZ9.99999") ;
      httpContext.ajax_rsp_assign_attri("", false, "AV73TotValueForCan", AV73TotValueForCan);
   }

   public void S112( )
   {
      /* 'LOADCOMBOPRDNUM' Routine */
      returnInSub = false ;
      /* Using cursor H028X5 */
      pr_default.execute(3);
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H028X5_A396EmprCod[0] ;
         A856ValCod = H028X5_A856ValCod[0] ;
         A13747PrdCDsc = H028X5_A13747PrdCDsc[0] ;
         A719PrdNum = H028X5_A719PrdNum[0] ;
         A718PrdNom = H028X5_A718PrdNom[0] ;
         AV49Combo_DataItem = (app.wwpbaseobjects.SdtDVB_SDTComboData_Item)new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
         AV49Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Id( A719PrdNum );
         AV49Combo_DataItem.setgxTv_SdtDVB_SDTComboData_Item_Title( A13747PrdCDsc );
         AV48PrdNum_Data.add(AV49Combo_DataItem, 0);
         pr_default.readNext(3);
      }
      pr_default.close(3);
      Combo_prdnum_Selectedvalue_set = AV27PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
   }

   public void e2428X2( )
   {
      /* 'DoAgregar' Routine */
      returnInSub = false ;
      if ( (0==AV26ColLin) )
      {
         httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta #", ""));
         GX_FocusControl = edtavCollin_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         httpContext.doAjaxSetFocus(GX_FocusControl);
      }
      else
      {
         if ( (GXutil.strcmp("", AV27PrdNum)==0) )
         {
            httpContext.GX_msglist.addItem(httpContext.getMessage( "Falta Producto", ""));
            GX_FocusControl = edtavPrdnum_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            httpContext.doAjaxSetFocus(GX_FocusControl);
         }
         else
         {
            if ( (DecimalUtil.compareTo(DecimalUtil.ZERO, AV28ForCan)==0) )
            {
               httpContext.GX_msglist.addItem(httpContext.getMessage( "Cantidad nula", ""));
               GX_FocusControl = edtavForcan_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               httpContext.doAjaxSetFocus(GX_FocusControl);
            }
            else
            {
               GXt_int9 = AV70ExisteRegistro ;
               GXv_int22[0] = GXt_int9 ;
               new app.formulaciontinte.getexistecollin(remoteHandle, context).execute( AV15EmprCod, AV14ForNumCol, AV26ColLin, GXv_int22) ;
               colorcolorantes__wp_impl.this.GXt_int9 = GXv_int22[0] ;
               AV70ExisteRegistro = GXt_int9 ;
               if ( AV70ExisteRegistro == 1 )
               {
                  httpContext.GX_msglist.addItem(httpContext.getMessage( "Existe este #", ""));
                  GX_FocusControl = edtavCollin_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  httpContext.doAjaxSetFocus(GX_FocusControl);
               }
               else
               {
                  new app.formulaciontinte.colorcolorantes_ins(remoteHandle, context).execute( AV15EmprCod, AV14ForNumCol, AV26ColLin, AV27PrdNum, AV29ForPrdUMe, AV28ForCan) ;
                  new app.formulaciontinte.colorcolorantes_colultlin(remoteHandle, context).execute( AV15EmprCod, AV14ForNumCol) ;
                  AV29ForPrdUMe = (byte)(0) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV29ForPrdUMe", GXutil.str( AV29ForPrdUMe, 1, 0));
                  AV28ForCan = DecimalUtil.ZERO ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV28ForCan", GXutil.ltrimstr( AV28ForCan, 11, 5));
                  AV27PrdNum = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV27PrdNum", AV27PrdNum);
                  Combo_prdnum_Selectedvalue_set = AV27PrdNum ;
                  ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
                  System.out.println( httpContext.getMessage( "---calculo coste-----", "") );
                  GXv_char16[0] = AV15EmprCod ;
                  GXv_int15[0] = AV10Clicod ;
                  GXv_char4[0] = AV9Forser ;
                  GXv_char3[0] = AV8Forcolnom ;
                  GXv_int13[0] = AV7ForcolNum ;
                  GXv_int8[0] = AV6Tipcolcod ;
                  GXv_decimal17[0] = DecimalUtil.doubleToDec(1) ;
                  GXv_int12[0] = (int)(DecimalUtil.decToDouble(AV5ForRelBan)) ;
                  GXv_char2[0] = " " ;
                  GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
                  new app.psimulax(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_decimal17, GXv_int12, GXv_char2, GXv_decimal14) ;
                  colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
                  colorcolorantes__wp_impl.this.AV10Clicod = GXv_int15[0] ;
                  colorcolorantes__wp_impl.this.AV9Forser = GXv_char4[0] ;
                  colorcolorantes__wp_impl.this.AV8Forcolnom = GXv_char3[0] ;
                  colorcolorantes__wp_impl.this.AV7ForcolNum = GXv_int13[0] ;
                  colorcolorantes__wp_impl.this.AV6Tipcolcod = GXv_int8[0] ;
                  colorcolorantes__wp_impl.this.AV5ForRelBan = DecimalUtil.doubleToDec(GXv_int12[0]) ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV10Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Clicod), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV9Forser", AV9Forser);
                  httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
                  httpContext.ajax_rsp_assign_attri("", false, "AV7ForcolNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ForcolNum), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV6Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Tipcolcod), 2, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV5ForRelBan", GXutil.ltrimstr( AV5ForRelBan, 7, 2));
                  GXv_char16[0] = AV15EmprCod ;
                  GXv_char4[0] = AV57Station ;
                  GXv_decimal17[0] = AV74Valor_cor ;
                  new app.pcoscor(remoteHandle, context).execute( GXv_char16, GXv_char4, GXv_decimal17) ;
                  colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
                  colorcolorantes__wp_impl.this.AV57Station = GXv_char4[0] ;
                  colorcolorantes__wp_impl.this.AV74Valor_cor = GXv_decimal17[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV57Station", AV57Station);
                  httpContext.ajax_rsp_assign_attri("", false, "AV74Valor_cor", GXutil.ltrimstr( AV74Valor_cor, 11, 5));
                  GXv_char16[0] = AV15EmprCod ;
                  GXv_int15[0] = AV10Clicod ;
                  GXv_char4[0] = AV9Forser ;
                  GXv_char3[0] = AV8Forcolnom ;
                  GXv_int13[0] = AV7ForcolNum ;
                  GXv_int8[0] = AV6Tipcolcod ;
                  GXv_decimal17[0] = AV74Valor_cor ;
                  new app.pupdcos(remoteHandle, context).execute( GXv_char16, GXv_int15, GXv_char4, GXv_char3, GXv_int13, GXv_int8, GXv_decimal17) ;
                  colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
                  colorcolorantes__wp_impl.this.AV10Clicod = GXv_int15[0] ;
                  colorcolorantes__wp_impl.this.AV9Forser = GXv_char4[0] ;
                  colorcolorantes__wp_impl.this.AV8Forcolnom = GXv_char3[0] ;
                  colorcolorantes__wp_impl.this.AV7ForcolNum = GXv_int13[0] ;
                  colorcolorantes__wp_impl.this.AV6Tipcolcod = GXv_int8[0] ;
                  colorcolorantes__wp_impl.this.AV74Valor_cor = GXv_decimal17[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV10Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Clicod), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV9Forser", AV9Forser);
                  httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
                  httpContext.ajax_rsp_assign_attri("", false, "AV7ForcolNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ForcolNum), 6, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV6Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Tipcolcod), 2, 0));
                  httpContext.ajax_rsp_assign_attri("", false, "AV74Valor_cor", GXutil.ltrimstr( AV74Valor_cor, 11, 5));
                  System.out.println( httpContext.getMessage( "Coste= ", "")+GXutil.str( AV74Valor_cor, 11, 5) );
                  GXt_int9 = AV26ColLin ;
                  GXv_int22[0] = GXt_int9 ;
                  new app.formulaciontinte.getcolorcolorantes(remoteHandle, context).execute( AV15EmprCod, AV14ForNumCol, GXv_int22) ;
                  colorcolorantes__wp_impl.this.GXt_int9 = GXv_int22[0] ;
                  AV26ColLin = GXt_int9 ;
                  httpContext.ajax_rsp_assign_attri("", false, "AV26ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ColLin), 3, 0));
                  httpContext.doAjaxRefresh();
               }
            }
         }
      }
      /*  Sending Event outputs  */
   }

   public void e1828X2( )
   {
      /* Collin_Controlvaluechanged Routine */
      returnInSub = false ;
      if ( AV26ColLin > 0 )
      {
         GXv_char16[0] = AV27PrdNum ;
         GXv_decimal17[0] = AV28ForCan ;
         GXv_int8[0] = AV29ForPrdUMe ;
         GXv_char4[0] = AV30ForPrdDsc ;
         new app.formulaciontinte.obtengodatoscollin(remoteHandle, context).execute( A396EmprCod, AV14ForNumCol, AV26ColLin, GXv_char16, GXv_decimal17, GXv_int8, GXv_char4) ;
         colorcolorantes__wp_impl.this.AV27PrdNum = GXv_char16[0] ;
         colorcolorantes__wp_impl.this.AV28ForCan = GXv_decimal17[0] ;
         colorcolorantes__wp_impl.this.AV29ForPrdUMe = GXv_int8[0] ;
         colorcolorantes__wp_impl.this.AV30ForPrdDsc = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV27PrdNum", AV27PrdNum);
         httpContext.ajax_rsp_assign_attri("", false, "AV28ForCan", GXutil.ltrimstr( AV28ForCan, 11, 5));
         httpContext.ajax_rsp_assign_attri("", false, "AV29ForPrdUMe", GXutil.str( AV29ForPrdUMe, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30ForPrdDsc", AV30ForPrdDsc);
         Combo_prdnum_Selectedvalue_set = AV27PrdNum ;
         ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      }
      /*  Sending Event outputs  */
   }

   public void e1928X2( )
   {
      /* Forprdume_Controlvaluechanged Routine */
      returnInSub = false ;
      GXt_char24 = AV30ForPrdDsc ;
      GXv_char16[0] = GXt_char24 ;
      new app.get_forprddsc(remoteHandle, context).execute( AV15EmprCod, AV29ForPrdUMe, GXv_char16) ;
      colorcolorantes__wp_impl.this.GXt_char24 = GXv_char16[0] ;
      AV30ForPrdDsc = GXt_char24 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30ForPrdDsc", AV30ForPrdDsc);
      /*  Sending Event outputs  */
   }

   public void e2528X2( )
   {
      /* ColLin_Click Routine */
      returnInSub = false ;
      AV77Acciongridmodificar = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Acciongridmodificar), 4, 0));
      AV26ColLin = A309ColLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ColLin), 3, 0));
      GXv_char16[0] = AV27PrdNum ;
      GXv_decimal17[0] = AV28ForCan ;
      GXv_int8[0] = AV29ForPrdUMe ;
      GXv_char4[0] = AV30ForPrdDsc ;
      new app.formulaciontinte.obtengodatoscollin(remoteHandle, context).execute( A396EmprCod, AV14ForNumCol, AV26ColLin, GXv_char16, GXv_decimal17, GXv_int8, GXv_char4) ;
      colorcolorantes__wp_impl.this.AV27PrdNum = GXv_char16[0] ;
      colorcolorantes__wp_impl.this.AV28ForCan = GXv_decimal17[0] ;
      colorcolorantes__wp_impl.this.AV29ForPrdUMe = GXv_int8[0] ;
      colorcolorantes__wp_impl.this.AV30ForPrdDsc = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27PrdNum", AV27PrdNum);
      httpContext.ajax_rsp_assign_attri("", false, "AV28ForCan", GXutil.ltrimstr( AV28ForCan, 11, 5));
      httpContext.ajax_rsp_assign_attri("", false, "AV29ForPrdUMe", GXutil.str( AV29ForPrdUMe, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV30ForPrdDsc", AV30ForPrdDsc);
      Combo_prdnum_Selectedvalue_set = AV27PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      GX_FocusControl = edtavForcan_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
   }

   public void S212( )
   {
      /* 'DO MODIFICAR' Routine */
      returnInSub = false ;
      AV77Acciongridmodificar = (short)(1) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV77Acciongridmodificar", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV77Acciongridmodificar), 4, 0));
      AV26ColLin = A309ColLin ;
      httpContext.ajax_rsp_assign_attri("", false, "AV26ColLin", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV26ColLin), 3, 0));
      GXv_char16[0] = AV27PrdNum ;
      GXv_decimal17[0] = AV28ForCan ;
      GXv_int8[0] = AV29ForPrdUMe ;
      GXv_char4[0] = AV30ForPrdDsc ;
      new app.formulaciontinte.obtengodatoscollin(remoteHandle, context).execute( A396EmprCod, AV14ForNumCol, AV26ColLin, GXv_char16, GXv_decimal17, GXv_int8, GXv_char4) ;
      colorcolorantes__wp_impl.this.AV27PrdNum = GXv_char16[0] ;
      colorcolorantes__wp_impl.this.AV28ForCan = GXv_decimal17[0] ;
      colorcolorantes__wp_impl.this.AV29ForPrdUMe = GXv_int8[0] ;
      colorcolorantes__wp_impl.this.AV30ForPrdDsc = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV27PrdNum", AV27PrdNum);
      httpContext.ajax_rsp_assign_attri("", false, "AV28ForCan", GXutil.ltrimstr( AV28ForCan, 11, 5));
      httpContext.ajax_rsp_assign_attri("", false, "AV29ForPrdUMe", GXutil.str( AV29ForPrdUMe, 1, 0));
      httpContext.ajax_rsp_assign_attri("", false, "AV30ForPrdDsc", AV30ForPrdDsc);
      Combo_prdnum_Selectedvalue_set = AV27PrdNum ;
      ucCombo_prdnum.sendProperty(context, "", false, Combo_prdnum_Internalname, "SelectedValue_set", Combo_prdnum_Selectedvalue_set);
      GX_FocusControl = edtavForcan_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
   }

   public void S202( )
   {
      /* 'UNIDADPRODUCTO' Routine */
      returnInSub = false ;
      AV29ForPrdUMe = (byte)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV29ForPrdUMe", GXutil.str( AV29ForPrdUMe, 1, 0));
      AV30ForPrdDsc = "" ;
      httpContext.ajax_rsp_assign_attri("", false, "AV30ForPrdDsc", AV30ForPrdDsc);
      /* Using cursor H028X6 */
      pr_default.execute(4, new Object[] {AV15EmprCod, AV27PrdNum});
      while ( (pr_default.getStatus(4) != 101) )
      {
         A719PrdNum = H028X6_A719PrdNum[0] ;
         A396EmprCod = H028X6_A396EmprCod[0] ;
         A4338PrdUMeFo = H028X6_A4338PrdUMeFo[0] ;
         AV29ForPrdUMe = A4338PrdUMeFo ;
         httpContext.ajax_rsp_assign_attri("", false, "AV29ForPrdUMe", GXutil.str( AV29ForPrdUMe, 1, 0));
         /* Exiting from a For First loop. */
         if (true) break;
      }
      pr_default.close(4);
      if ( AV29ForPrdUMe > 0 )
      {
         GXv_char16[0] = AV15EmprCod ;
         GXv_int8[0] = AV29ForPrdUMe ;
         GXv_char4[0] = AV30ForPrdDsc ;
         new app.pbusumed(remoteHandle, context).execute( GXv_char16, GXv_int8, GXv_char4) ;
         colorcolorantes__wp_impl.this.AV15EmprCod = GXv_char16[0] ;
         colorcolorantes__wp_impl.this.AV29ForPrdUMe = GXv_int8[0] ;
         colorcolorantes__wp_impl.this.AV30ForPrdDsc = GXv_char4[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV29ForPrdUMe", GXutil.str( AV29ForPrdUMe, 1, 0));
         httpContext.ajax_rsp_assign_attri("", false, "AV30ForPrdDsc", AV30ForPrdDsc);
      }
   }

   public void wb_table3_145_28X2( boolean wbgen )
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
         wb_table3_145_28X2e( true) ;
      }
      else
      {
         wb_table3_145_28X2e( false) ;
      }
   }

   public void wb_table2_107_28X2( boolean wbgen )
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
         app.GxWebStd.gx_label_element( httpContext, edtavTotvalueforcan_Internalname, httpContext.getMessage( "Tot Value For Can", ""), "gx-form-item AttributeTotalizerLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 115,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavTotvalueforcan_Internalname, AV73TotValueForCan, GXutil.rtrim( localUtil.format( AV73TotValueForCan, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,115);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavTotvalueforcan_Jsonclick, 0, "AttributeTotalizer", "", "", "", "", 1, edtavTotvalueforcan_Enabled, 0, "text", "", 80, "chr", 1, "row", 100, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table2_107_28X2e( true) ;
      }
      else
      {
         wb_table2_107_28X2e( false) ;
      }
   }

   public void wb_table1_60_28X2( boolean wbgen )
   {
      if ( wbgen )
      {
         /* Table start */
         sStyleString = "" ;
         app.GxWebStd.gx_table_start( httpContext, tblTablemergedforprdume_Internalname, tblTablemergedforprdume_Internalname, "", "TableMerged", 0, "", "", 0, 0, sStyleString, "", "", 0);
         httpContext.writeText( "<tr>") ;
         httpContext.writeText( "<td class='MergeDataCell'>") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", " gx-attribute", "left", "top", "", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavForprdume_Internalname, httpContext.getMessage( "For Prd UMe", ""), "gx-form-item AttributeFLLabel", 0, true, "width: 25%;");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'" + sGXsfl_88_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavForprdume_Internalname, GXutil.ltrim( localUtil.ntoc( AV29ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")), GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(AV29ForPrdUMe), "9")), " inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,64);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavForprdume_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavForprdume_Enabled, 1, "text", "1", 1, "chr", 1, "row", 1, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "<td>") ;
         /* Static images/pictures */
         ClassString = "Image" + " " + ((GXutil.strcmp(imgPrompt_forprdume_gximage, "")==0) ? "GX_Image_prompt_Class" : "GX_Image_"+imgPrompt_forprdume_gximage+"_Class") ;
         StyleString = "" ;
         sImgUrl = context.getHttpContext().getImagePath( "f5b04895-0024-488b-8e3b-b687ca4598ee", "", context.getHttpContext().getTheme( )) ;
         app.GxWebStd.gx_bitmap( httpContext, imgPrompt_forprdume_Internalname, sImgUrl, imgPrompt_forprdume_Link, "", "", context.getHttpContext().getTheme( ), 1, 1, "", "", 0, 0, 0, "px", 0, "px", 0, 0, 0, "", "", StyleString, ClassString, "", "", "", "", " "+"data-gx-image"+" ", "", "", 1, false, false, context.getHttpContext().getImageSrcSet( sImgUrl), "HLP_FormulacionTinte\\ColorColorantes__WP.htm");
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_60_28X2e( true) ;
      }
      else
      {
         wb_table1_60_28X2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
      AV15EmprCod = (String)getParm(obj,0) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV15EmprCod", AV15EmprCod);
      AV14ForNumCol = ((Number) GXutil.testNumericType( getParm(obj,1), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14ForNumCol", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV14ForNumCol), 8, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFORNUMCOL", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV14ForNumCol), "ZZZZZZZ9")));
      AV13ContNum = ((Number) GXutil.testNumericType( getParm(obj,2), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13ContNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13ContNum), 9, 0));
      AV12FlagMod = ((Number) GXutil.testNumericType( getParm(obj,3), TypeConstants.SHORT)).shortValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV12FlagMod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV12FlagMod), 4, 0));
      AV11ForOpcCli = (String)getParm(obj,4) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV11ForOpcCli", AV11ForOpcCli);
      AV10Clicod = ((Number) GXutil.testNumericType( getParm(obj,5), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV10Clicod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV10Clicod), 6, 0));
      AV9Forser = (String)getParm(obj,6) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV9Forser", AV9Forser);
      AV8Forcolnom = (String)getParm(obj,7) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV8Forcolnom", AV8Forcolnom);
      AV7ForcolNum = ((Number) GXutil.testNumericType( getParm(obj,8), TypeConstants.INT)).intValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV7ForcolNum", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV7ForcolNum), 6, 0));
      AV6Tipcolcod = ((Number) GXutil.testNumericType( getParm(obj,9), TypeConstants.BYTE)).byteValue() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV6Tipcolcod", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV6Tipcolcod), 2, 0));
      AV5ForRelBan = (java.math.BigDecimal)getParm(obj,10) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV5ForRelBan", GXutil.ltrimstr( AV5ForRelBan, 7, 2));
      AV16CosKgmF = (java.math.BigDecimal)getParm(obj,11) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV16CosKgmF", GXutil.ltrimstr( AV16CosKgmF, 13, 5));
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
      pa28X2( ) ;
      ws28X2( ) ;
      we28X2( ) ;
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
      httpContext.AddStyleSheetFile("GXProgressIndicator/css/bootstrap-progressbar-3.0.1.css", "");
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?20268211615915", true, true);
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
      httpContext.AddJavascriptSource("gxdec.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("formulaciontinte/colorcolorantes__wp.js", "?20268211615916", false, true);
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
      httpContext.AddJavascriptSource("GXProgressIndicator/javascript/bootstrap-progressbar.js", "", false, true);
      httpContext.AddJavascriptSource("GXProgressIndicator/GXProgressIndicatorRender.js", "", false, true);
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

   public void subsflControlProps_882( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_88_idx );
      edtColLin_Internalname = "COLLIN_"+sGXsfl_88_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_88_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_88_idx ;
      edtForCan_Internalname = "FORCAN_"+sGXsfl_88_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_88_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_88_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_88_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_88_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_88_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_88_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_88_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_88_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_88_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_88_idx ;
      edtColFibra_Internalname = "COLFIBRA_"+sGXsfl_88_idx ;
   }

   public void subsflControlProps_fel_882( )
   {
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1_"+sGXsfl_88_fel_idx );
      edtColLin_Internalname = "COLLIN_"+sGXsfl_88_fel_idx ;
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_88_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_88_fel_idx ;
      edtForCan_Internalname = "FORCAN_"+sGXsfl_88_fel_idx ;
      edtForPrdUMe_Internalname = "FORPRDUME_"+sGXsfl_88_fel_idx ;
      edtForPrdDsc_Internalname = "FORPRDDSC_"+sGXsfl_88_fel_idx ;
      edtPrdRGB_Internalname = "PRDRGB_"+sGXsfl_88_fel_idx ;
      edtavPrdrgb_Internalname = "vPRDRGB_"+sGXsfl_88_fel_idx ;
      edtavR_Internalname = "vR_"+sGXsfl_88_fel_idx ;
      edtavG_Internalname = "vG_"+sGXsfl_88_fel_idx ;
      edtavB_Internalname = "vB_"+sGXsfl_88_fel_idx ;
      edtavR2_Internalname = "vR2_"+sGXsfl_88_fel_idx ;
      edtavG2_Internalname = "vG2_"+sGXsfl_88_fel_idx ;
      edtavB2_Internalname = "vB2_"+sGXsfl_88_fel_idx ;
      edtColFibra_Internalname = "COLFIBRA_"+sGXsfl_88_fel_idx ;
   }

   public void sendrow_882( )
   {
      subsflControlProps_882( ) ;
      wb28X0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_88_idx <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_88_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_88_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         TempTags = " " + ((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onfocus=\"gx.evt.onfocus(this, 89,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         if ( ( cmbavGridactiongroup1.getItemCount() == 0 ) && isAjaxCallMode( ) )
         {
            GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_88_idx ;
            cmbavGridactiongroup1.setName( GXCCtl );
            cmbavGridactiongroup1.setWebtags( "" );
            if ( cmbavGridactiongroup1.getItemCount() > 0 )
            {
               AV71GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV71GridActionGroup1, 4, 0))))) ;
               httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71GridActionGroup1), 4, 0));
            }
         }
         /* ComboBox */
         GridRow.AddColumnProperties("combobox", 2, isAjaxCallMode( ), new Object[] {cmbavGridactiongroup1,cmbavGridactiongroup1.getInternalname(),GXutil.trim( GXutil.str( AV71GridActionGroup1, 4, 0)),Integer.valueOf(1),cmbavGridactiongroup1.getJsonclick(),Integer.valueOf(5),"'"+""+"'"+",false,"+"'"+"EVGRIDACTIONGROUP1.CLICK."+sGXsfl_88_idx+"'","int","",Integer.valueOf(-1),Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"px",Integer.valueOf(0),"px","","ConvertToDDO","WWActionGroupColumn","",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((cmbavGridactiongroup1.getEnabled()!=0)&&(cmbavGridactiongroup1.getVisible()!=0) ? " onblur=\""+""+";gx.evt.onblur(this,89);\"" : " "),"",Boolean.valueOf(true),Integer.valueOf(0)});
         cmbavGridactiongroup1.setValue( GXutil.trim( GXutil.str( AV71GridActionGroup1, 4, 0)) );
         httpContext.ajax_rsp_assign_prop("", false, cmbavGridactiongroup1.getInternalname(), "Values", cmbavGridactiongroup1.ToJavascriptSource(), !bGXsfl_88_Refreshing);
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColLin_Internalname,GXutil.ltrim( localUtil.ntoc( A309ColLin, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A309ColLin), "ZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+"ECOLLIN.CLICK."+sGXsfl_88_idx+"'","","","","",edtColLin_Jsonclick,Integer.valueOf(5),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\""+" bgcolor="+WebUtils.getHTMLColor( edtPrdNum_Backcolor)+">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","color:"+WebUtils.getHTMLColor( edtPrdNum_Forecolor)+";"+((edtPrdNum_Backcolor==-1) ? "" : "background-color:"+WebUtils.getHTMLColor( edtPrdNum_Backcolor)+";"),ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForCan_Internalname,GXutil.ltrim( localUtil.ntoc( A481ForCan, (byte)(11), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A481ForCan, "ZZZZ9.99999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForCan_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(11),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdUMe_Internalname,GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A490ForPrdUMe), "9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdUMe_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(1),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+""+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtForPrdDsc_Internalname,GXutil.rtrim( A488ForPrdDsc),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtForPrdDsc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(-1),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(5),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdRGB_Internalname,GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A13232PrdRGB), "ZZZZZZZZZ9"))," inputmode=\"numeric\" pattern=\"[0-9]*\""+"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdRGB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 97,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavPrdrgb_Internalname,GXutil.ltrim( localUtil.ntoc( AV50PrdRGB, (byte)(10), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavPrdrgb_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV50PrdRGB), "ZZZZZZZZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV50PrdRGB), "ZZZZZZZZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavPrdrgb_Enabled!=0)&&(edtavPrdrgb_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,97);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavPrdrgb_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavPrdrgb_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(10),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 98,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR_Internalname,GXutil.ltrim( localUtil.ntoc( AV51R, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV51R), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV51R), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR_Enabled!=0)&&(edtavR_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,98);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 99,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG_Internalname,GXutil.ltrim( localUtil.ntoc( AV52G, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV52G), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV52G), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG_Enabled!=0)&&(edtavG_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,99);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 100,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB_Internalname,GXutil.ltrim( localUtil.ntoc( AV53B, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV53B), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV53B), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB_Enabled!=0)&&(edtavB_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,100);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 101,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavR2_Internalname,GXutil.ltrim( localUtil.ntoc( AV54R2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavR2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV54R2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV54R2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavR2_Enabled!=0)&&(edtavR2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,101);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavR2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavR2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 102,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavG2_Internalname,GXutil.ltrim( localUtil.ntoc( AV55G2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavG2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV55G2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV55G2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavG2_Enabled!=0)&&(edtavG2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,102);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavG2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavG2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 103,'',false,'"+sGXsfl_88_idx+"',88)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavB2_Internalname,GXutil.ltrim( localUtil.ntoc( AV56B2, (byte)(3), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavB2_Enabled!=0) ? localUtil.format( DecimalUtil.doubleToDec(AV56B2), "ZZ9") : localUtil.format( DecimalUtil.doubleToDec(AV56B2), "ZZ9")))," inputmode=\"numeric\" pattern=\"[0-9]*\""+TempTags+" onchange=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onchange(this, event)\" "+((edtavB2_Enabled!=0)&&(edtavB2_Visible!=0) ? " onblur=\""+"gx.num.valid_integer( this,gx.thousandSeparator);"+";gx.evt.onblur(this,103);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavB2_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(edtavB2_Enabled),Integer.valueOf(0),"text","1",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(3),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+"display:none;"+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtColFibra_Internalname,GXutil.rtrim( A13926ColFibra),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtColFibra_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(4),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(88),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashes28X2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_88_idx = ((subGrid_Islastpage==1)&&(nGXsfl_88_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_88_idx+1) ;
         sGXsfl_88_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_88_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_882( ) ;
      }
      /* End function sendrow_882 */
   }

   public void startgridcontrol88( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"88\">") ;
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
         httpContext.writeValue( httpContext.getMessage( "Cantidad", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Und", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+""+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "RGB", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "RGB", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "G", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "B", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "R2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "G2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "B2", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+"display:none;"+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Fibra", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
         GridContainer.AddObjectProperty("InMasterPage", "false");
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV71GridActionGroup1, (byte)(4), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A309ColLin, (byte)(3), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A719PrdNum));
         GridColumn.AddObjectProperty("Backcolor", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Backcolor, (byte)(9), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Forecolor", GXutil.ltrim( localUtil.ntoc( edtPrdNum_Forecolor, (byte)(9), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A718PrdNom));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A481ForCan, (byte)(11), (byte)(5), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A490ForPrdUMe, (byte)(1), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A488ForPrdDsc));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A13232PrdRGB, (byte)(10), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV50PrdRGB, (byte)(10), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavPrdrgb_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV51R, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV52G, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV53B, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV54R2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavR2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV55G2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavG2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV56B2, (byte)(3), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavB2_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( A13926ColFibra));
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
      lblTbmessage_Internalname = "TBMESSAGE" ;
      edtavFornumcol_Internalname = "vFORNUMCOL" ;
      edtavCoskgmf_Internalname = "vCOSKGMF" ;
      divUnnamedtable4_Internalname = "UNNAMEDTABLE4" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      Dvpanel_unnamedtable1_Internalname = "DVPANEL_UNNAMEDTABLE1" ;
      edtavCollin_Internalname = "vCOLLIN" ;
      lblTextblockcombo_prdnum_Internalname = "TEXTBLOCKCOMBO_PRDNUM" ;
      Combo_prdnum_Internalname = "COMBO_PRDNUM" ;
      divTablesplittedprdnum_Internalname = "TABLESPLITTEDPRDNUM" ;
      edtavForcan_Internalname = "vFORCAN" ;
      lblTextblockforprdume_Internalname = "TEXTBLOCKFORPRDUME" ;
      edtavForprdume_Internalname = "vFORPRDUME" ;
      imgPrompt_forprdume_Internalname = "PROMPT_FORPRDUME" ;
      tblTablemergedforprdume_Internalname = "TABLEMERGEDFORPRDUME" ;
      divTablesplittedforprdume_Internalname = "TABLESPLITTEDFORPRDUME" ;
      edtavForprddsc_Internalname = "vFORPRDDSC" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      bttBtnenter_Internalname = "BTNENTER" ;
      bttBtncerrar_Internalname = "BTNCERRAR" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      cmbavGridactiongroup1.setInternalname( "vGRIDACTIONGROUP1" );
      edtColLin_Internalname = "COLLIN" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtForCan_Internalname = "FORCAN" ;
      edtForPrdUMe_Internalname = "FORPRDUME" ;
      edtForPrdDsc_Internalname = "FORPRDDSC" ;
      edtPrdRGB_Internalname = "PRDRGB" ;
      edtavPrdrgb_Internalname = "vPRDRGB" ;
      edtavR_Internalname = "vR" ;
      edtavG_Internalname = "vG" ;
      edtavB_Internalname = "vB" ;
      edtavR2_Internalname = "vR2" ;
      edtavG2_Internalname = "vG2" ;
      edtavB2_Internalname = "vB2" ;
      edtColFibra_Internalname = "COLFIBRA" ;
      edtavTotvalueforcan_Internalname = "vTOTVALUEFORCAN" ;
      tblGridtabletotalizer_Internalname = "GRIDTABLETOTALIZER" ;
      Gridpaginationbar_Internalname = "GRIDPAGINATIONBAR" ;
      divGridtablewithpaginationbar_Internalname = "GRIDTABLEWITHPAGINATIONBAR" ;
      edtavPgmname_Internalname = "vPGMNAME" ;
      Datamonjs_Internalname = "DATAMONJS" ;
      Barradeprogreso_Internalname = "BARRADEPROGRESO" ;
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
      edtColFibra_Jsonclick = "" ;
      edtavB2_Jsonclick = "" ;
      edtavB2_Visible = 0 ;
      edtavB2_Enabled = 1 ;
      edtavG2_Jsonclick = "" ;
      edtavG2_Visible = 0 ;
      edtavG2_Enabled = 1 ;
      edtavR2_Jsonclick = "" ;
      edtavR2_Visible = 0 ;
      edtavR2_Enabled = 1 ;
      edtavB_Jsonclick = "" ;
      edtavB_Visible = 0 ;
      edtavB_Enabled = 1 ;
      edtavG_Jsonclick = "" ;
      edtavG_Visible = 0 ;
      edtavG_Enabled = 1 ;
      edtavR_Jsonclick = "" ;
      edtavR_Visible = 0 ;
      edtavR_Enabled = 1 ;
      edtavPrdrgb_Jsonclick = "" ;
      edtavPrdrgb_Visible = 0 ;
      edtavPrdrgb_Enabled = 1 ;
      edtPrdRGB_Jsonclick = "" ;
      edtForPrdDsc_Jsonclick = "" ;
      edtForPrdUMe_Jsonclick = "" ;
      edtForCan_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      edtPrdNum_Forecolor = (int)(0x000000) ;
      edtPrdNum_Backcolor = -1 ;
      edtColLin_Jsonclick = "" ;
      cmbavGridactiongroup1.setJsonclick( "" );
      cmbavGridactiongroup1.setVisible( -1 );
      cmbavGridactiongroup1.setEnabled( 1 );
      subGrid_Class = "GridWithTotalizer GridWithPaginationBar GridNoBorder WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      imgPrompt_forprdume_Link = "" ;
      edtavForprdume_Jsonclick = "" ;
      edtavTotvalueforcan_Jsonclick = "" ;
      edtavTotvalueforcan_Enabled = 1 ;
      edtavForprdume_Enabled = 1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavPrdnum_Jsonclick = "" ;
      edtavPrdnum_Visible = 1 ;
      edtavPgmname_Jsonclick = "" ;
      edtavPgmname_Enabled = 0 ;
      edtavForprddsc_Jsonclick = "" ;
      edtavForprddsc_Enabled = 1 ;
      edtavForcan_Jsonclick = "" ;
      edtavForcan_Enabled = 1 ;
      edtavCollin_Jsonclick = "" ;
      edtavCollin_Enabled = 1 ;
      edtavCoskgmf_Jsonclick = "" ;
      edtavCoskgmf_Enabled = 0 ;
      edtavFornumcol_Jsonclick = "" ;
      edtavFornumcol_Enabled = 0 ;
      lblTbmessage_Caption = "  " ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Dvelop_confirmpanel_enter_Confirmtype = "1" ;
      Dvelop_confirmpanel_enter_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_enter_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_enter_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_enter_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_enter_Confirmationtext = "¿Confirma la Linea?" ;
      Dvelop_confirmpanel_enter_Title = "" ;
      Ddo_grid_Datalistproc = "FormulacionTinte.ColorColorantes__WPGetFilterData" ;
      Ddo_grid_Datalisttype = "|Dynamic|Dynamic|||Dynamic" ;
      Ddo_grid_Includedatalist = "|T|T|||T" ;
      Ddo_grid_Filterisrange = "T|||T|T|" ;
      Ddo_grid_Filtertype = "Numeric|Character|Character|Numeric|Numeric|Character" ;
      Ddo_grid_Includefilter = "T" ;
      Ddo_grid_Includesortasc = "T" ;
      Ddo_grid_Columnssortvalues = "2|3|4|5|6|7" ;
      Ddo_grid_Columnids = "1:ColLin|2:PrdNum|3:PrdNom|4:ForCan|5:ForPrdUMe|6:ForPrdDsc" ;
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
      Combo_prdnum_Emptyitem = GXutil.toBoolean( 0) ;
      Combo_prdnum_Cls = "ExtendedCombo AttributeFL" ;
      Dvpanel_unnamedtable1_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Iconposition = "Right" ;
      Dvpanel_unnamedtable1_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Title = httpContext.getMessage( "WWP_TemplateDataPanelTitle", "") ;
      Dvpanel_unnamedtable1_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable1_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable1_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable1_Width = "100%" ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( httpContext.getMessage( "Colorantes", "") );
      subGrid_Rows = 0 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void init_web_controls( )
   {
      GXCCtl = "vGRIDACTIONGROUP1_" + sGXsfl_88_idx ;
      cmbavGridactiongroup1.setName( GXCCtl );
      cmbavGridactiongroup1.setWebtags( "" );
      if ( cmbavGridactiongroup1.getItemCount() > 0 )
      {
         AV71GridActionGroup1 = (short)(GXutil.lval( cmbavGridactiongroup1.getValidValue(GXutil.trim( GXutil.str( AV71GridActionGroup1, 4, 0))))) ;
         httpContext.ajax_rsp_assign_attri("", false, cmbavGridactiongroup1.getInternalname(), GXutil.ltrimstr( DecimalUtil.doubleToDec(AV71GridActionGroup1), 4, 0));
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV32TFColLin',fld:'vTFCOLLIN',pic:'ZZ9'},{av:'AV33TFColLin_To',fld:'vTFCOLLIN_TO',pic:'ZZ9'},{av:'AV34TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV35TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV36TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV37TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFForCan',fld:'vTFFORCAN',pic:'ZZZZ9.99999'},{av:'AV39TFForCan_To',fld:'vTFFORCAN_TO',pic:'ZZZZ9.99999'},{av:'AV40TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV41TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV42TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV43TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A481ForCan',fld:'FORCAN',pic:'ZZZZ9.99999'}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV26ColLin',fld:'vCOLLIN',pic:'ZZ9'},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'AV73TotValueForCan',fld:'vTOTVALUEFORCAN',pic:''}]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE","{handler:'e1228X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV32TFColLin',fld:'vTFCOLLIN',pic:'ZZ9'},{av:'AV33TFColLin_To',fld:'vTFCOLLIN_TO',pic:'ZZ9'},{av:'AV34TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV35TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV36TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV37TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFForCan',fld:'vTFFORCAN',pic:'ZZZZ9.99999'},{av:'AV39TFForCan_To',fld:'vTFFORCAN_TO',pic:'ZZZZ9.99999'},{av:'AV40TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV41TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV42TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV43TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'Gridpaginationbar_Selectedpage',ctrl:'GRIDPAGINATIONBAR',prop:'SelectedPage'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEPAGE",",oparms:[]}");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE","{handler:'e1328X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV32TFColLin',fld:'vTFCOLLIN',pic:'ZZ9'},{av:'AV33TFColLin_To',fld:'vTFCOLLIN_TO',pic:'ZZ9'},{av:'AV34TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV35TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV36TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV37TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFForCan',fld:'vTFFORCAN',pic:'ZZZZ9.99999'},{av:'AV39TFForCan_To',fld:'vTFFORCAN_TO',pic:'ZZZZ9.99999'},{av:'AV40TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV41TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV42TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV43TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'Gridpaginationbar_Rowsperpageselectedvalue',ctrl:'GRIDPAGINATIONBAR',prop:'RowsPerPageSelectedValue'}]");
      setEventMetadata("GRIDPAGINATIONBAR.CHANGEROWSPERPAGE",",oparms:[{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e1428X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV32TFColLin',fld:'vTFCOLLIN',pic:'ZZ9'},{av:'AV33TFColLin_To',fld:'vTFCOLLIN_TO',pic:'ZZ9'},{av:'AV34TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV35TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV36TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV37TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFForCan',fld:'vTFFORCAN',pic:'ZZZZ9.99999'},{av:'AV39TFForCan_To',fld:'vTFFORCAN_TO',pic:'ZZZZ9.99999'},{av:'AV40TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV41TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV42TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV43TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV42TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV43TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV40TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV41TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV38TFForCan',fld:'vTFFORCAN',pic:'ZZZZ9.99999'},{av:'AV39TFForCan_To',fld:'vTFFORCAN_TO',pic:'ZZZZ9.99999'},{av:'AV36TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV37TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV34TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV35TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV32TFColLin',fld:'vTFCOLLIN',pic:'ZZ9'},{av:'AV33TFColLin_To',fld:'vTFCOLLIN_TO',pic:'ZZ9'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e2228X2',iparms:[{av:'A13232PrdRGB',fld:'PRDRGB',pic:'ZZZZZZZZZ9'}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV71GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV50PrdRGB',fld:'vPRDRGB',pic:'ZZZZZZZZZ9'},{av:'AV56B2',fld:'vB2',pic:'ZZ9'},{av:'AV55G2',fld:'vG2',pic:'ZZ9'},{av:'AV54R2',fld:'vR2',pic:'ZZ9'},{av:'AV53B',fld:'vB',pic:'ZZ9'},{av:'AV52G',fld:'vG',pic:'ZZ9'},{av:'AV51R',fld:'vR',pic:'ZZ9'},{av:'edtPrdNum_Backcolor',ctrl:'PRDNUM',prop:'Backcolor'},{av:'edtPrdNum_Forecolor',ctrl:'PRDNUM',prop:'Forecolor'}]}");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK","{handler:'e2328X2',iparms:[{av:'cmbavGridactiongroup1'},{av:'AV71GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV32TFColLin',fld:'vTFCOLLIN',pic:'ZZ9'},{av:'AV33TFColLin_To',fld:'vTFCOLLIN_TO',pic:'ZZ9'},{av:'AV34TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV35TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV36TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV37TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFForCan',fld:'vTFFORCAN',pic:'ZZZZ9.99999'},{av:'AV39TFForCan_To',fld:'vTFFORCAN_TO',pic:'ZZZZ9.99999'},{av:'AV40TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV41TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV42TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV43TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'A309ColLin',fld:'COLLIN',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A481ForCan',fld:'FORCAN',pic:'ZZZZ9.99999'}]");
      setEventMetadata("VGRIDACTIONGROUP1.CLICK",",oparms:[{av:'cmbavGridactiongroup1'},{av:'AV71GridActionGroup1',fld:'vGRIDACTIONGROUP1',pic:'ZZZ9'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV26ColLin',fld:'vCOLLIN',pic:'ZZ9'},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'AV73TotValueForCan',fld:'vTOTVALUEFORCAN',pic:''}]}");
      setEventMetadata("ENTER","{handler:'e1628X2',iparms:[{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV26ColLin',fld:'vCOLLIN',pic:'ZZ9'},{av:'AV27PrdNum',fld:'vPRDNUM',pic:''},{av:'AV28ForCan',fld:'vFORCAN',pic:'ZZZZ9.99999'}]");
      setEventMetadata("ENTER",",oparms:[{av:'lblTbmessage_Caption',ctrl:'TBMESSAGE',prop:'Caption'}]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE","{handler:'e1528X2',iparms:[{av:'Dvelop_confirmpanel_enter_Result',ctrl:'DVELOP_CONFIRMPANEL_ENTER',prop:'Result'},{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV32TFColLin',fld:'vTFCOLLIN',pic:'ZZ9'},{av:'AV33TFColLin_To',fld:'vTFCOLLIN_TO',pic:'ZZ9'},{av:'AV34TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV35TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV36TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV37TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFForCan',fld:'vTFFORCAN',pic:'ZZZZ9.99999'},{av:'AV39TFForCan_To',fld:'vTFFORCAN_TO',pic:'ZZZZ9.99999'},{av:'AV40TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV41TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV42TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV43TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'AV26ColLin',fld:'vCOLLIN',pic:'ZZ9'},{av:'AV27PrdNum',fld:'vPRDNUM',pic:''},{av:'AV29ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV28ForCan',fld:'vFORCAN',pic:'ZZZZ9.99999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A481ForCan',fld:'FORCAN',pic:'ZZZZ9.99999'}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_ENTER.CLOSE",",oparms:[{av:'AV29ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV28ForCan',fld:'vFORCAN',pic:'ZZZZ9.99999'},{av:'AV27PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV26ColLin',fld:'vCOLLIN',pic:'ZZ9'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'AV73TotValueForCan',fld:'vTOTVALUEFORCAN',pic:''}]}");
      setEventMetadata("'DOCERRAR'","{handler:'e1728X2',iparms:[]");
      setEventMetadata("'DOCERRAR'",",oparms:[]}");
      setEventMetadata("COMBO_PRDNUM.ONOPTIONCLICKED","{handler:'e1128X2',iparms:[{av:'Combo_prdnum_Selectedvalue_get',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_get'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV27PrdNum',fld:'vPRDNUM',pic:''},{av:'A4338PrdUMeFo',fld:'PRDUMEFO',pic:'9'}]");
      setEventMetadata("COMBO_PRDNUM.ONOPTIONCLICKED",",oparms:[{av:'AV27PrdNum',fld:'vPRDNUM',pic:''},{av:'AV29ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV30ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'}]}");
      setEventMetadata("'DOAGREGAR'","{handler:'e2428X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV32TFColLin',fld:'vTFCOLLIN',pic:'ZZ9'},{av:'AV33TFColLin_To',fld:'vTFCOLLIN_TO',pic:'ZZ9'},{av:'AV34TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV35TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV36TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV37TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFForCan',fld:'vTFFORCAN',pic:'ZZZZ9.99999'},{av:'AV39TFForCan_To',fld:'vTFFORCAN_TO',pic:'ZZZZ9.99999'},{av:'AV40TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV41TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV42TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV43TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'AV26ColLin',fld:'vCOLLIN',pic:'ZZ9'},{av:'AV27PrdNum',fld:'vPRDNUM',pic:''},{av:'AV28ForCan',fld:'vFORCAN',pic:'ZZZZ9.99999'},{av:'AV29ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A481ForCan',fld:'FORCAN',pic:'ZZZZ9.99999'}]");
      setEventMetadata("'DOAGREGAR'",",oparms:[{av:'AV29ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV28ForCan',fld:'vFORCAN',pic:'ZZZZ9.99999'},{av:'AV27PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV26ColLin',fld:'vCOLLIN',pic:'ZZ9'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'AV73TotValueForCan',fld:'vTOTVALUEFORCAN',pic:''}]}");
      setEventMetadata("VCOLLIN.CONTROLVALUECHANGED","{handler:'e1828X2',iparms:[{av:'AV26ColLin',fld:'vCOLLIN',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV14ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true}]");
      setEventMetadata("VCOLLIN.CONTROLVALUECHANGED",",oparms:[{av:'AV30ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV29ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV28ForCan',fld:'vFORCAN',pic:'ZZZZ9.99999'},{av:'AV27PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'}]}");
      setEventMetadata("VFORPRDUME.CONTROLVALUECHANGED","{handler:'e1928X2',iparms:[{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV29ForPrdUMe',fld:'vFORPRDUME',pic:'9'}]");
      setEventMetadata("VFORPRDUME.CONTROLVALUECHANGED",",oparms:[{av:'AV30ForPrdDsc',fld:'vFORPRDDSC',pic:''}]}");
      setEventMetadata("COLLIN.CLICK","{handler:'e2528X2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV14ForNumCol',fld:'vFORNUMCOL',pic:'ZZZZZZZ9',hsh:true},{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV32TFColLin',fld:'vTFCOLLIN',pic:'ZZ9'},{av:'AV33TFColLin_To',fld:'vTFCOLLIN_TO',pic:'ZZ9'},{av:'AV34TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV35TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV36TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV37TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV38TFForCan',fld:'vTFFORCAN',pic:'ZZZZ9.99999'},{av:'AV39TFForCan_To',fld:'vTFFORCAN_TO',pic:'ZZZZ9.99999'},{av:'AV40TFForPrdUMe',fld:'vTFFORPRDUME',pic:'9'},{av:'AV41TFForPrdUMe_To',fld:'vTFFORPRDUME_TO',pic:'9'},{av:'AV42TFForPrdDsc',fld:'vTFFORPRDDSC',pic:''},{av:'AV43TFForPrdDsc_Sel',fld:'vTFFORPRDDSC_SEL',pic:''},{av:'AV80Pgmname',fld:'vPGMNAME',pic:''},{av:'AV24OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV25OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'A309ColLin',fld:'COLLIN',pic:'ZZ9'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A486ForNumCol',fld:'FORNUMCOL',pic:'ZZZZZZZ9'},{av:'A481ForCan',fld:'FORCAN',pic:'ZZZZ9.99999'}]");
      setEventMetadata("COLLIN.CLICK",",oparms:[{av:'AV77Acciongridmodificar',fld:'vACCIONGRIDMODIFICAR',pic:'ZZZ9'},{av:'AV26ColLin',fld:'vCOLLIN',pic:'ZZ9'},{av:'AV30ForPrdDsc',fld:'vFORPRDDSC',pic:''},{av:'AV29ForPrdUMe',fld:'vFORPRDUME',pic:'9'},{av:'AV28ForCan',fld:'vFORCAN',pic:'ZZZZ9.99999'},{av:'AV27PrdNum',fld:'vPRDNUM',pic:''},{av:'Combo_prdnum_Selectedvalue_set',ctrl:'COMBO_PRDNUM',prop:'SelectedValue_set'},{av:'AV46GridCurrentPage',fld:'vGRIDCURRENTPAGE',pic:'ZZZZZZZZZ9'},{av:'AV47GridPageCount',fld:'vGRIDPAGECOUNT',pic:'ZZZZZZZZZ9'},{av:'AV5ForRelBan',fld:'vFORRELBAN',pic:'ZZZ9.99'},{av:'AV6Tipcolcod',fld:'vTIPCOLCOD',pic:'Z9'},{av:'AV7ForcolNum',fld:'vFORCOLNUM',pic:'ZZZZZ9'},{av:'AV8Forcolnom',fld:'vFORCOLNOM',pic:''},{av:'AV9Forser',fld:'vFORSER',pic:''},{av:'AV10Clicod',fld:'vCLICOD',pic:'ZZZZZ9'},{av:'AV15EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV74Valor_cor',fld:'vVALOR_COR',pic:'ZZZZ9.99999'},{av:'AV57Station',fld:'vSTATION',pic:''},{av:'AV72TotForCan',fld:'vTOTFORCAN',pic:'ZZZZ9.99999',hsh:true},{av:'AV73TotValueForCan',fld:'vTOTVALUEFORCAN',pic:''}]}");
      setEventMetadata("VALIDV_FORNUMCOL","{handler:'validv_Fornumcol',iparms:[]");
      setEventMetadata("VALIDV_FORNUMCOL",",oparms:[]}");
      setEventMetadata("VALIDV_FORPRDUME","{handler:'validv_Forprdume',iparms:[]");
      setEventMetadata("VALIDV_FORPRDUME",",oparms:[]}");
      setEventMetadata("VALIDV_PRDNUM","{handler:'validv_Prdnum',iparms:[]");
      setEventMetadata("VALIDV_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("VALID_FORPRDUME","{handler:'valid_Forprdume',iparms:[]");
      setEventMetadata("VALID_FORPRDUME",",oparms:[]}");
      setEventMetadata("NULL","{handler:'valid_Colfibra',iparms:[]");
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
      wcpOAV15EmprCod = "" ;
      wcpOAV11ForOpcCli = "" ;
      wcpOAV9Forser = "" ;
      wcpOAV8Forcolnom = "" ;
      wcpOAV5ForRelBan = DecimalUtil.ZERO ;
      wcpOAV16CosKgmF = DecimalUtil.ZERO ;
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
      AV15EmprCod = "" ;
      AV11ForOpcCli = "" ;
      AV9Forser = "" ;
      AV8Forcolnom = "" ;
      AV5ForRelBan = DecimalUtil.ZERO ;
      AV16CosKgmF = DecimalUtil.ZERO ;
      AV57Station = "" ;
      AV74Valor_cor = DecimalUtil.ZERO ;
      AV34TFPrdNum = "" ;
      AV35TFPrdNum_Sel = "" ;
      AV36TFPrdNom = "" ;
      AV37TFPrdNom_Sel = "" ;
      AV38TFForCan = DecimalUtil.ZERO ;
      AV39TFForCan_To = DecimalUtil.ZERO ;
      AV42TFForPrdDsc = "" ;
      AV43TFForPrdDsc_Sel = "" ;
      AV80Pgmname = "" ;
      AV72TotForCan = DecimalUtil.ZERO ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      forbiddenHiddens = new com.genexus.util.GXProperties();
      AV48PrdNum_Data = new GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item>(app.wwpbaseobjects.SdtDVB_SDTComboData_Item.class, "Item", "", remoteHandle);
      AV44DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
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
      lblTbmessage_Jsonclick = "" ;
      ucDvpanel_unnamedtable1 = new com.genexus.webpanels.GXUserControl();
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      lblTextblockcombo_prdnum_Jsonclick = "" ;
      ucCombo_prdnum = new com.genexus.webpanels.GXUserControl();
      Combo_prdnum_Caption = "" ;
      AV28ForCan = DecimalUtil.ZERO ;
      lblTextblockforprdume_Jsonclick = "" ;
      AV30ForPrdDsc = "" ;
      bttBtnenter_Jsonclick = "" ;
      bttBtncerrar_Jsonclick = "" ;
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucGridpaginationbar = new com.genexus.webpanels.GXUserControl();
      ucDatamonjs = new com.genexus.webpanels.GXUserControl();
      ucBarradeprogreso = new com.genexus.webpanels.GXUserControl();
      AV27PrdNum = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A481ForCan = DecimalUtil.ZERO ;
      A488ForPrdDsc = "" ;
      A13926ColFibra = "" ;
      scmdbuf = "" ;
      lV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = "" ;
      lV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = "" ;
      lV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = "" ;
      AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel = "" ;
      AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum = "" ;
      AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel = "" ;
      AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom = "" ;
      AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan = DecimalUtil.ZERO ;
      AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to = DecimalUtil.ZERO ;
      AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel = "" ;
      AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc = "" ;
      H028X2_A486ForNumCol = new int[1] ;
      H028X2_A396EmprCod = new String[] {""} ;
      H028X2_A13926ColFibra = new String[] {""} ;
      H028X2_n13926ColFibra = new boolean[] {false} ;
      H028X2_A13232PrdRGB = new long[1] ;
      H028X2_A488ForPrdDsc = new String[] {""} ;
      H028X2_n488ForPrdDsc = new boolean[] {false} ;
      H028X2_A490ForPrdUMe = new byte[1] ;
      H028X2_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H028X2_A718PrdNom = new String[] {""} ;
      H028X2_A719PrdNum = new String[] {""} ;
      H028X2_A309ColLin = new short[1] ;
      H028X3_AGRID_nRecordCount = new long[1] ;
      AV73TotValueForCan = "" ;
      hsh = "" ;
      AV58EmprNom = "" ;
      AV59UsurCod = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV60msg0 = "" ;
      AV67Lit13 = "" ;
      AV68TitTxt = "" ;
      AV18WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      GXv_int10 = new short[1] ;
      GXv_int18 = new short[1] ;
      GXv_int19 = new short[1] ;
      GXv_int20 = new short[1] ;
      GXv_int21 = new short[1] ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV76ForPrdDsccontrol = "" ;
      AV31Session = httpContext.getWebSession();
      AV22GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV23GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char23 = "" ;
      GXt_char1 = "" ;
      GXv_SdtWWPGridState25 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV20TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV19HTTPRequest = httpContext.getHttpRequest();
      H028X4_A486ForNumCol = new int[1] ;
      H028X4_A396EmprCod = new String[] {""} ;
      H028X4_A488ForPrdDsc = new String[] {""} ;
      H028X4_n488ForPrdDsc = new boolean[] {false} ;
      H028X4_A490ForPrdUMe = new byte[1] ;
      H028X4_A481ForCan = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H028X4_A718PrdNom = new String[] {""} ;
      H028X4_A719PrdNum = new String[] {""} ;
      H028X4_A309ColLin = new short[1] ;
      H028X5_A396EmprCod = new String[] {""} ;
      H028X5_A856ValCod = new byte[1] ;
      H028X5_A13747PrdCDsc = new String[] {""} ;
      H028X5_A719PrdNum = new String[] {""} ;
      H028X5_A718PrdNom = new String[] {""} ;
      A13747PrdCDsc = "" ;
      AV49Combo_DataItem = new app.wwpbaseobjects.SdtDVB_SDTComboData_Item(remoteHandle, context);
      GXv_int12 = new int[1] ;
      GXv_char2 = new String[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_int15 = new int[1] ;
      GXv_char3 = new String[1] ;
      GXv_int13 = new int[1] ;
      GXv_int22 = new short[1] ;
      GXt_char24 = "" ;
      GXv_decimal17 = new java.math.BigDecimal[1] ;
      H028X6_A719PrdNum = new String[] {""} ;
      H028X6_A396EmprCod = new String[] {""} ;
      H028X6_A4338PrdUMeFo = new byte[1] ;
      GXv_char16 = new String[1] ;
      GXv_int8 = new byte[1] ;
      GXv_char4 = new String[1] ;
      ucDvelop_confirmpanel_enter = new com.genexus.webpanels.GXUserControl();
      imgPrompt_forprdume_gximage = "" ;
      sImgUrl = "" ;
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      GXCCtl = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.formulaciontinte.colorcolorantes__wp__default(),
         new Object[] {
             new Object[] {
            H028X2_A486ForNumCol, H028X2_A396EmprCod, H028X2_A13926ColFibra, H028X2_n13926ColFibra, H028X2_A13232PrdRGB, H028X2_A488ForPrdDsc, H028X2_n488ForPrdDsc, H028X2_A490ForPrdUMe, H028X2_A481ForCan, H028X2_A718PrdNom,
            H028X2_A719PrdNum, H028X2_A309ColLin
            }
            , new Object[] {
            H028X3_AGRID_nRecordCount
            }
            , new Object[] {
            H028X4_A486ForNumCol, H028X4_A396EmprCod, H028X4_A488ForPrdDsc, H028X4_n488ForPrdDsc, H028X4_A490ForPrdUMe, H028X4_A481ForCan, H028X4_A718PrdNom, H028X4_A719PrdNum, H028X4_A309ColLin
            }
            , new Object[] {
            H028X5_A396EmprCod, H028X5_A856ValCod, H028X5_A13747PrdCDsc, H028X5_A719PrdNum, H028X5_A718PrdNom
            }
            , new Object[] {
            H028X6_A719PrdNum, H028X6_A396EmprCod, H028X6_A4338PrdUMeFo
            }
         }
      );
      AV80Pgmname = "FormulacionTinte.ColorColorantes__WP" ;
      /* GeneXus formulas. */
      AV80Pgmname = "FormulacionTinte.ColorColorantes__WP" ;
      Gx_err = (short)(0) ;
      edtavFornumcol_Enabled = 0 ;
      edtavCoskgmf_Enabled = 0 ;
      edtavForprddsc_Enabled = 0 ;
      edtavPrdrgb_Enabled = 0 ;
      edtavR_Enabled = 0 ;
      edtavG_Enabled = 0 ;
      edtavB_Enabled = 0 ;
      edtavR2_Enabled = 0 ;
      edtavG2_Enabled = 0 ;
      edtavB2_Enabled = 0 ;
      edtavTotvalueforcan_Enabled = 0 ;
      edtavPgmname_Enabled = 0 ;
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
      imgPrompt_forprdume_Link = "javascript:"+"gx.popup.openPrompt('"+"app.formulaciontinte.tunmefoprompt"+"',["+"{Ctrl:gx.dom.el('"+"vEMPRCOD"+"'), id:'"+"vEMPRCOD"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDUME"+"'), id:'"+"vFORPRDUME"+"'"+",IOType:'inout'}"+","+"{Ctrl:gx.dom.el('"+"vFORPRDDSC"+"'), id:'"+"vFORPRDDSC"+"'"+",IOType:'inout'}"+"],"+"null"+","+"'', false"+","+"false"+");" ;
   }

   private byte wcpOAV6Tipcolcod ;
   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV6Tipcolcod ;
   private byte AV40TFForPrdUMe ;
   private byte AV41TFForPrdUMe_To ;
   private byte gxajaxcallmode ;
   private byte A4338PrdUMeFo ;
   private byte A490ForPrdUMe ;
   private byte nDonePA ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume ;
   private byte AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to ;
   private byte AV29ForPrdUMe ;
   private byte GXt_int7 ;
   private byte A856ValCod ;
   private byte GXv_int8[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short wcpOAV12FlagMod ;
   private short nRcdExists_5 ;
   private short nIsMod_5 ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV12FlagMod ;
   private short AV77Acciongridmodificar ;
   private short AV32TFColLin ;
   private short AV33TFColLin_To ;
   private short AV24OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short AV26ColLin ;
   private short AV71GridActionGroup1 ;
   private short A309ColLin ;
   private short AV51R ;
   private short AV52G ;
   private short AV53B ;
   private short AV54R2 ;
   private short AV55G2 ;
   private short AV56B2 ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin ;
   private short AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to ;
   private short AV61F_lavand ;
   private short AV62ClaveCol ;
   private short AV63OtraformaAux ;
   private short AV64fam1d1 ;
   private short AV65prdaux ;
   private short AV66texpasa ;
   private short AV69MForEq ;
   private short AV75moda21 ;
   private short GXv_int10[] ;
   private short GXv_int18[] ;
   private short GXv_int19[] ;
   private short GXv_int20[] ;
   private short GXv_int21[] ;
   private short AV70ExisteRegistro ;
   private short GXt_int9 ;
   private short GXv_int22[] ;
   private int wcpOAV14ForNumCol ;
   private int wcpOAV13ContNum ;
   private int wcpOAV10Clicod ;
   private int wcpOAV7ForcolNum ;
   private int subGrid_Rows ;
   private int Gridpaginationbar_Rowsperpageselectedvalue ;
   private int nRC_GXsfl_88 ;
   private int AV14ForNumCol ;
   private int AV13ContNum ;
   private int AV10Clicod ;
   private int AV7ForcolNum ;
   private int nGXsfl_88_idx=1 ;
   private int A486ForNumCol ;
   private int Gridpaginationbar_Pagestoshow ;
   private int edtavFornumcol_Enabled ;
   private int edtavCoskgmf_Enabled ;
   private int edtavCollin_Enabled ;
   private int edtavForcan_Enabled ;
   private int edtavForprddsc_Enabled ;
   private int edtavPgmname_Enabled ;
   private int edtavPrdnum_Visible ;
   private int subGrid_Islastpage ;
   private int edtavPrdrgb_Enabled ;
   private int edtavR_Enabled ;
   private int edtavG_Enabled ;
   private int edtavB_Enabled ;
   private int edtavR2_Enabled ;
   private int edtavG2_Enabled ;
   private int edtavB2_Enabled ;
   private int edtavTotvalueforcan_Enabled ;
   private int GXPagingFrom2 ;
   private int GXPagingTo2 ;
   private int edtavForprdume_Enabled ;
   private int AV45PageToGo ;
   private int edtPrdNum_Backcolor ;
   private int edtPrdNum_Forecolor ;
   private int AV93GXV1 ;
   private int GXv_int12[] ;
   private int GXv_int15[] ;
   private int GXv_int13[] ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavPrdrgb_Visible ;
   private int edtavR_Visible ;
   private int edtavG_Visible ;
   private int edtavB_Visible ;
   private int edtavR2_Visible ;
   private int edtavG2_Visible ;
   private int edtavB2_Visible ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long AV46GridCurrentPage ;
   private long AV47GridPageCount ;
   private long A13232PrdRGB ;
   private long AV50PrdRGB ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal wcpOAV5ForRelBan ;
   private java.math.BigDecimal wcpOAV16CosKgmF ;
   private java.math.BigDecimal AV5ForRelBan ;
   private java.math.BigDecimal AV16CosKgmF ;
   private java.math.BigDecimal AV74Valor_cor ;
   private java.math.BigDecimal AV38TFForCan ;
   private java.math.BigDecimal AV39TFForCan_To ;
   private java.math.BigDecimal AV72TotForCan ;
   private java.math.BigDecimal AV28ForCan ;
   private java.math.BigDecimal A481ForCan ;
   private java.math.BigDecimal AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan ;
   private java.math.BigDecimal AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal17[] ;
   private String wcpOAV15EmprCod ;
   private String wcpOAV11ForOpcCli ;
   private String wcpOAV9Forser ;
   private String wcpOAV8Forcolnom ;
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
   private String AV15EmprCod ;
   private String AV11ForOpcCli ;
   private String AV9Forser ;
   private String AV8Forcolnom ;
   private String sGXsfl_88_idx="0001" ;
   private String AV57Station ;
   private String AV34TFPrdNum ;
   private String AV35TFPrdNum_Sel ;
   private String AV36TFPrdNom ;
   private String AV37TFPrdNom_Sel ;
   private String AV42TFForPrdDsc ;
   private String AV43TFForPrdDsc_Sel ;
   private String AV80Pgmname ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A396EmprCod ;
   private String Dvpanel_unnamedtable1_Width ;
   private String Dvpanel_unnamedtable1_Cls ;
   private String Dvpanel_unnamedtable1_Title ;
   private String Dvpanel_unnamedtable1_Iconposition ;
   private String Combo_prdnum_Cls ;
   private String Combo_prdnum_Selectedvalue_set ;
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
   private String lblTbmessage_Internalname ;
   private String lblTbmessage_Caption ;
   private String lblTbmessage_Jsonclick ;
   private String Dvpanel_unnamedtable1_Internalname ;
   private String divUnnamedtable1_Internalname ;
   private String divUnnamedtable4_Internalname ;
   private String edtavFornumcol_Internalname ;
   private String edtavFornumcol_Jsonclick ;
   private String edtavCoskgmf_Internalname ;
   private String edtavCoskgmf_Jsonclick ;
   private String Dvpanel_tableheader_Internalname ;
   private String divTableheader_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String edtavCollin_Internalname ;
   private String TempTags ;
   private String edtavCollin_Jsonclick ;
   private String divTablesplittedprdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Internalname ;
   private String lblTextblockcombo_prdnum_Jsonclick ;
   private String Combo_prdnum_Caption ;
   private String Combo_prdnum_Internalname ;
   private String edtavForcan_Internalname ;
   private String edtavForcan_Jsonclick ;
   private String divTablesplittedforprdume_Internalname ;
   private String lblTextblockforprdume_Internalname ;
   private String lblTextblockforprdume_Jsonclick ;
   private String edtavForprddsc_Internalname ;
   private String AV30ForPrdDsc ;
   private String edtavForprddsc_Jsonclick ;
   private String divUnnamedtable3_Internalname ;
   private String bttBtnenter_Internalname ;
   private String bttBtnenter_Jsonclick ;
   private String bttBtncerrar_Internalname ;
   private String bttBtncerrar_Jsonclick ;
   private String divGridtablewithpaginationbar_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String Gridpaginationbar_Internalname ;
   private String edtavPgmname_Internalname ;
   private String edtavPgmname_Jsonclick ;
   private String Datamonjs_Internalname ;
   private String Barradeprogreso_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String edtavPrdnum_Internalname ;
   private String AV27PrdNum ;
   private String edtavPrdnum_Jsonclick ;
   private String Ddo_grid_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String edtColLin_Internalname ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtForCan_Internalname ;
   private String edtForPrdUMe_Internalname ;
   private String A488ForPrdDsc ;
   private String edtForPrdDsc_Internalname ;
   private String edtPrdRGB_Internalname ;
   private String edtavPrdrgb_Internalname ;
   private String edtavR_Internalname ;
   private String edtavG_Internalname ;
   private String edtavB_Internalname ;
   private String edtavR2_Internalname ;
   private String edtavG2_Internalname ;
   private String edtavB2_Internalname ;
   private String A13926ColFibra ;
   private String edtColFibra_Internalname ;
   private String edtavTotvalueforcan_Internalname ;
   private String imgPrompt_forprdume_Link ;
   private String imgPrompt_forprdume_Internalname ;
   private String scmdbuf ;
   private String lV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum ;
   private String lV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom ;
   private String lV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc ;
   private String AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel ;
   private String AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum ;
   private String AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel ;
   private String AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom ;
   private String AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel ;
   private String AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc ;
   private String edtavForprdume_Internalname ;
   private String hsh ;
   private String AV58EmprNom ;
   private String AV59UsurCod ;
   private String AV60msg0 ;
   private String AV67Lit13 ;
   private String AV68TitTxt ;
   private String AV76ForPrdDsccontrol ;
   private String GXt_char23 ;
   private String GXt_char1 ;
   private String GXv_char2[] ;
   private String GXv_char3[] ;
   private String GXt_char24 ;
   private String GXv_char16[] ;
   private String GXv_char4[] ;
   private String tblTabledvelop_confirmpanel_enter_Internalname ;
   private String Dvelop_confirmpanel_enter_Internalname ;
   private String tblGridtabletotalizer_Internalname ;
   private String edtavTotvalueforcan_Jsonclick ;
   private String tblTablemergedforprdume_Internalname ;
   private String edtavForprdume_Jsonclick ;
   private String imgPrompt_forprdume_gximage ;
   private String sImgUrl ;
   private String sGXsfl_88_fel_idx="0001" ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String GXCCtl ;
   private String ROClassString ;
   private String edtColLin_Jsonclick ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtForCan_Jsonclick ;
   private String edtForPrdUMe_Jsonclick ;
   private String edtForPrdDsc_Jsonclick ;
   private String edtPrdRGB_Jsonclick ;
   private String edtavPrdrgb_Jsonclick ;
   private String edtavR_Jsonclick ;
   private String edtavG_Jsonclick ;
   private String edtavB_Jsonclick ;
   private String edtavR2_Jsonclick ;
   private String edtavG2_Jsonclick ;
   private String edtavB2_Jsonclick ;
   private String edtColFibra_Jsonclick ;
   private String subGrid_Header ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean AV25OrderedDsc ;
   private boolean Dvpanel_unnamedtable1_Autowidth ;
   private boolean Dvpanel_unnamedtable1_Autoheight ;
   private boolean Dvpanel_unnamedtable1_Collapsible ;
   private boolean Dvpanel_unnamedtable1_Collapsed ;
   private boolean Dvpanel_unnamedtable1_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable1_Autoscroll ;
   private boolean Combo_prdnum_Emptyitem ;
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
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean n488ForPrdDsc ;
   private boolean n13926ColFibra ;
   private boolean bGXsfl_88_Refreshing=false ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV73TotValueForCan ;
   private String A13747PrdCDsc ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV19HTTPRequest ;
   private com.genexus.webpanels.WebSession AV31Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable1 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucCombo_prdnum ;
   private com.genexus.webpanels.GXUserControl ucGridpaginationbar ;
   private com.genexus.webpanels.GXUserControl ucDatamonjs ;
   private com.genexus.webpanels.GXUserControl ucBarradeprogreso ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_enter ;
   private com.genexus.util.GXProperties forbiddenHiddens ;
   private HTMLChoice cmbavGridactiongroup1 ;
   private IDataStoreProvider pr_default ;
   private int[] H028X2_A486ForNumCol ;
   private String[] H028X2_A396EmprCod ;
   private String[] H028X2_A13926ColFibra ;
   private boolean[] H028X2_n13926ColFibra ;
   private long[] H028X2_A13232PrdRGB ;
   private String[] H028X2_A488ForPrdDsc ;
   private boolean[] H028X2_n488ForPrdDsc ;
   private byte[] H028X2_A490ForPrdUMe ;
   private java.math.BigDecimal[] H028X2_A481ForCan ;
   private String[] H028X2_A718PrdNom ;
   private String[] H028X2_A719PrdNum ;
   private short[] H028X2_A309ColLin ;
   private long[] H028X3_AGRID_nRecordCount ;
   private int[] H028X4_A486ForNumCol ;
   private String[] H028X4_A396EmprCod ;
   private String[] H028X4_A488ForPrdDsc ;
   private boolean[] H028X4_n488ForPrdDsc ;
   private byte[] H028X4_A490ForPrdUMe ;
   private java.math.BigDecimal[] H028X4_A481ForCan ;
   private String[] H028X4_A718PrdNom ;
   private String[] H028X4_A719PrdNum ;
   private short[] H028X4_A309ColLin ;
   private String[] H028X5_A396EmprCod ;
   private byte[] H028X5_A856ValCod ;
   private String[] H028X5_A13747PrdCDsc ;
   private String[] H028X5_A719PrdNum ;
   private String[] H028X5_A718PrdNom ;
   private String[] H028X6_A719PrdNum ;
   private String[] H028X6_A396EmprCod ;
   private byte[] H028X6_A4338PrdUMeFo ;
   private com.genexus.webpanels.GXWebForm Form ;
   private GXBaseCollection<app.wwpbaseobjects.SdtDVB_SDTComboData_Item> AV48PrdNum_Data ;
   private app.wwpbaseobjects.SdtWWPContext AV18WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV20TrnContext ;
   private app.wwpbaseobjects.SdtWWPGridState AV22GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState25[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV23GridStateFilterValue ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV44DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons5 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons6[] ;
   private app.wwpbaseobjects.SdtDVB_SDTComboData_Item AV49Combo_DataItem ;
}

final  class colorcolorantes__wp__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H028X2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin ,
                                          short AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to ,
                                          String AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel ,
                                          String AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum ,
                                          String AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel ,
                                          String AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan ,
                                          java.math.BigDecimal AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to ,
                                          byte AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume ,
                                          byte AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to ,
                                          String AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel ,
                                          String AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc ,
                                          short A309ColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A481ForCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short AV24OrderedBy ,
                                          boolean AV25OrderedDsc ,
                                          String AV15EmprCod ,
                                          int AV14ForNumCol ,
                                          String A396EmprCod ,
                                          int A486ForNumCol )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int26 = new byte[19];
      Object[] GXv_Object27 = new Object[2];
      String sSelectString;
      String sFromString;
      String sOrderString;
      sSelectString = " T1.ForNumCol, T1.EmprCod, T1.ColFibra, T3.PrdRGB, T2.ForPrdDsc, T1.ForPrdUMe, T1.ForCan, T3.PrdNom, T1.PrdNum, T1.ColLin" ;
      sFromString = " FROM ((TXPLDFORM T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum" ;
      sFromString += " = T1.PrdNum)" ;
      sOrderString = "" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ForNumCol = ?)");
      if ( ! (0==AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin) )
      {
         addWhere(sWhereString, "(T1.ColLin >= ?)");
      }
      else
      {
         GXv_int26[2] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to) )
      {
         addWhere(sWhereString, "(T1.ColLin <= ?)");
      }
      else
      {
         GXv_int26[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int26[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int26[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan >= ?)");
      }
      else
      {
         GXv_int26[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan <= ?)");
      }
      else
      {
         GXv_int26[9] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int26[10] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int26[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int26[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int26[13] = (byte)(1) ;
      }
      if ( AV24OrderedBy == 1 )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ColLin" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ColLin DESC" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T3.PrdNom" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T3.PrdNom DESC" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForCan" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForCan DESC" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T1.ForPrdUMe" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T1.ForPrdUMe DESC" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ! AV25OrderedDsc )
      {
         sOrderString += " ORDER BY T2.ForPrdDsc" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ( AV25OrderedDsc ) )
      {
         sOrderString += " ORDER BY T2.ForPrdDsc DESC" ;
      }
      else if ( true )
      {
         sOrderString += " ORDER BY T1.EmprCod, T1.ForNumCol, T1.ColLin" ;
      }
      scmdbuf = "SELECT * FROM ( SELECT GX_CTE.*, ROWNUM GX_ROW_NUMBER FROM (SELECT " + sSelectString + sFromString + sWhereString + sOrderString + "" + ") GX_CTE) WHERE GX_ROW_NUMBER" + " BETWEEN " + "?" + " AND " + "?" + " OR " + "?" + " < " + "?" + " AND GX_ROW_NUMBER >= " + "?" ;
      GXv_Object27[0] = scmdbuf ;
      GXv_Object27[1] = GXv_int26 ;
      return GXv_Object27 ;
   }

   protected Object[] conditional_H028X3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin ,
                                          short AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to ,
                                          String AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel ,
                                          String AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum ,
                                          String AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel ,
                                          String AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan ,
                                          java.math.BigDecimal AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to ,
                                          byte AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume ,
                                          byte AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to ,
                                          String AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel ,
                                          String AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc ,
                                          short A309ColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A481ForCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          short AV24OrderedBy ,
                                          boolean AV25OrderedDsc ,
                                          String AV15EmprCod ,
                                          int AV14ForNumCol ,
                                          String A396EmprCod ,
                                          int A486ForNumCol )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int28 = new byte[14];
      Object[] GXv_Object29 = new Object[2];
      scmdbuf = "SELECT COUNT(*) FROM ((TXPLDFORM T1 INNER JOIN TXPUNMEPR T3 ON T3.EmprCod = T1.EmprCod AND T3.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod" ;
      scmdbuf += " AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ForNumCol = ?)");
      if ( ! (0==AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin) )
      {
         addWhere(sWhereString, "(T1.ColLin >= ?)");
      }
      else
      {
         GXv_int28[2] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to) )
      {
         addWhere(sWhereString, "(T1.ColLin <= ?)");
      }
      else
      {
         GXv_int28[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int28[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int28[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan >= ?)");
      }
      else
      {
         GXv_int28[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan <= ?)");
      }
      else
      {
         GXv_int28[9] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int28[10] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int28[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int28[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T3.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int28[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( AV24OrderedBy == 1 )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 2 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 3 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 4 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 5 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 6 ) && ( AV25OrderedDsc ) )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ! AV25OrderedDsc )
      {
         scmdbuf += "" ;
      }
      else if ( ( AV24OrderedBy == 7 ) && ( AV25OrderedDsc ) )
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

   protected Object[] conditional_H028X4( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          short AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin ,
                                          short AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to ,
                                          String AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel ,
                                          String AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum ,
                                          String AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel ,
                                          String AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom ,
                                          java.math.BigDecimal AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan ,
                                          java.math.BigDecimal AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to ,
                                          byte AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume ,
                                          byte AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to ,
                                          String AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel ,
                                          String AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc ,
                                          short A309ColLin ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A481ForCan ,
                                          byte A490ForPrdUMe ,
                                          String A488ForPrdDsc ,
                                          String AV15EmprCod ,
                                          int AV14ForNumCol ,
                                          String A396EmprCod ,
                                          int A486ForNumCol )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int30 = new byte[14];
      Object[] GXv_Object31 = new Object[2];
      scmdbuf = "SELECT T1.ForNumCol, T1.EmprCod, T2.ForPrdDsc, T1.ForPrdUMe, T1.ForCan, T3.PrdNom, T1.PrdNum, T1.ColLin FROM ((TXPLDFORM T1 INNER JOIN TXPUNMEPR T2 ON T2.EmprCod" ;
      scmdbuf += " = T1.EmprCod AND T2.ForPrdUMe = T1.ForPrdUMe) INNER JOIN TXPPRODUC T3 ON T3.EmprCod = T1.EmprCod AND T3.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.ForNumCol = ?)");
      if ( ! (0==AV81Formulaciontinte_colorcolorantes__wpds_1_tfcollin) )
      {
         addWhere(sWhereString, "(T1.ColLin >= ?)");
      }
      else
      {
         GXv_int30[2] = (byte)(1) ;
      }
      if ( ! (0==AV82Formulaciontinte_colorcolorantes__wpds_2_tfcollin_to) )
      {
         addWhere(sWhereString, "(T1.ColLin <= ?)");
      }
      else
      {
         GXv_int30[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV83Formulaciontinte_colorcolorantes__wpds_3_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV84Formulaciontinte_colorcolorantes__wpds_4_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int30[5] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV85Formulaciontinte_colorcolorantes__wpds_5_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T3.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[6] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV86Formulaciontinte_colorcolorantes__wpds_6_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T3.PrdNom = ?)");
      }
      else
      {
         GXv_int30[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV87Formulaciontinte_colorcolorantes__wpds_7_tfforcan)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan >= ?)");
      }
      else
      {
         GXv_int30[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV88Formulaciontinte_colorcolorantes__wpds_8_tfforcan_to)==0) )
      {
         addWhere(sWhereString, "(T1.ForCan <= ?)");
      }
      else
      {
         GXv_int30[9] = (byte)(1) ;
      }
      if ( ! (0==AV89Formulaciontinte_colorcolorantes__wpds_9_tfforprdume) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe >= ?)");
      }
      else
      {
         GXv_int30[10] = (byte)(1) ;
      }
      if ( ! (0==AV90Formulaciontinte_colorcolorantes__wpds_10_tfforprdume_to) )
      {
         addWhere(sWhereString, "(T1.ForPrdUMe <= ?)");
      }
      else
      {
         GXv_int30[11] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel)==0) && ( ! (GXutil.strcmp("", AV91Formulaciontinte_colorcolorantes__wpds_11_tfforprddsc)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.ForPrdDsc) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int30[12] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV92Formulaciontinte_colorcolorantes__wpds_12_tfforprddsc_sel)==0) )
      {
         addWhere(sWhereString, "(T2.ForPrdDsc = ?)");
      }
      else
      {
         GXv_int30[13] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      scmdbuf += " ORDER BY T1.EmprCod, T1.ForNumCol" ;
      GXv_Object31[0] = scmdbuf ;
      GXv_Object31[1] = GXv_int30 ;
      return GXv_Object31 ;
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
                  return conditional_H028X2(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() );
            case 1 :
                  return conditional_H028X3(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , ((Number) dynConstraints[18]).shortValue() , ((Boolean) dynConstraints[19]).booleanValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() , (String)dynConstraints[22] , ((Number) dynConstraints[23]).intValue() );
            case 2 :
                  return conditional_H028X4(context, remoteHandle, httpContext, ((Number) dynConstraints[0]).shortValue() , ((Number) dynConstraints[1]).shortValue() , (String)dynConstraints[2] , (String)dynConstraints[3] , (String)dynConstraints[4] , (String)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , ((Number) dynConstraints[8]).byteValue() , ((Number) dynConstraints[9]).byteValue() , (String)dynConstraints[10] , (String)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , (String)dynConstraints[13] , (String)dynConstraints[14] , (java.math.BigDecimal)dynConstraints[15] , ((Number) dynConstraints[16]).byteValue() , (String)dynConstraints[17] , (String)dynConstraints[18] , ((Number) dynConstraints[19]).intValue() , (String)dynConstraints[20] , ((Number) dynConstraints[21]).intValue() );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H028X2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028X3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028X4", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,11, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028X5", "SELECT EmprCod, ValCod, RTRIM(LTRIM(PrdNum)) || ' - ' || RTRIM(LTRIM(PrdNom)) AS PrdCDsc, PrdNum, PrdNom FROM TXPPRODUC WHERE ValCod >= 1 and ValCod <= 2 and SUBSTR(PrdNum, 1, 1) <> '#' and SUBSTR(PrdNum, 1, 1) <> 'C' ORDER BY PrdCDsc ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H028X6", "SELECT PrdNum, EmprCod, PrdUMeFo FROM TXPPRODUC WHERE EmprCod = ? and PrdNum = ? ORDER BY EmprCod, PrdNum ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[2])[0] = rslt.getString(3, 4);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((long[]) buf[4])[0] = rslt.getLong(4);
               ((String[]) buf[5])[0] = rslt.getString(5, 5);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((byte[]) buf[7])[0] = rslt.getByte(6);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(7,5);
               ((String[]) buf[9])[0] = rslt.getString(8, 26);
               ((String[]) buf[10])[0] = rslt.getString(9, 6);
               ((short[]) buf[11])[0] = rslt.getShort(10);
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 2 :
               ((int[]) buf[0])[0] = rslt.getInt(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((String[]) buf[2])[0] = rslt.getString(3, 5);
               ((boolean[]) buf[3])[0] = rslt.wasNull();
               ((byte[]) buf[4])[0] = rslt.getByte(4);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(5,5);
               ((String[]) buf[6])[0] = rslt.getString(6, 26);
               ((String[]) buf[7])[0] = rslt.getString(7, 6);
               ((short[]) buf[8])[0] = rslt.getShort(8);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 3);
               ((byte[]) buf[1])[0] = rslt.getByte(2);
               ((String[]) buf[2])[0] = rslt.getVarchar(3);
               ((String[]) buf[3])[0] = rslt.getString(4, 6);
               ((String[]) buf[4])[0] = rslt.getString(5, 26);
               return;
            case 4 :
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
                  stmt.setShort(sIdx, ((Number) parms[21]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[22]).shortValue());
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
                  stmt.setString(sIdx, (String)parms[25], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[27], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[28], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[29]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[30]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[31], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[32], 5);
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
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 5);
               }
               return;
            case 2 :
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
                  stmt.setShort(sIdx, ((Number) parms[16]).shortValue());
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setShort(sIdx, ((Number) parms[17]).shortValue());
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[18], 6);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[19], 6);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[20], 26);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[21], 26);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[22], 5);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[23], 5);
               }
               if ( ((Number) parms[10]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[24]).byteValue());
               }
               if ( ((Number) parms[11]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setByte(sIdx, ((Number) parms[25]).byteValue());
               }
               if ( ((Number) parms[12]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[26], 5);
               }
               if ( ((Number) parms[13]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[27], 5);
               }
               return;
            case 4 :
               stmt.setString(1, (String)parms[0], 3);
               stmt.setString(2, (String)parms[1], 6);
               return;
      }
   }

}

