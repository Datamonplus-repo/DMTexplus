package app ;
import app.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

public final  class webwconreinfinite_impl extends GXDataArea
{
   public webwconreinfinite_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public webwconreinfinite_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( webwconreinfinite_impl.class ));
   }

   public webwconreinfinite_impl( int remoteHandle ,
                                  ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void initweb( )
   {
      initialize_properties( ) ;
      if ( nGotPars == 0 )
      {
         entryPointCalled = false ;
         gxfirstwebparm = httpContext.GetNextPar( ) ;
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
            gxfirstwebparm = httpContext.GetNextPar( ) ;
         }
         else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
         {
            if ( ! httpContext.IsValidAjaxCall( true) )
            {
               GxWebError = (byte)(1) ;
               return  ;
            }
            gxfirstwebparm = httpContext.GetNextPar( ) ;
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
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public void gxnrgrid_newrow_invoke( )
   {
      nRC_GXsfl_52 = (int)(GXutil.lval( httpContext.GetPar( "nRC_GXsfl_52"))) ;
      nGXsfl_52_idx = (int)(GXutil.lval( httpContext.GetPar( "nGXsfl_52_idx"))) ;
      sGXsfl_52_idx = httpContext.GetPar( "sGXsfl_52_idx") ;
      edtRecExiTcc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavRecexircc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecexircc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecexircc_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavDifercc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Visible), 5, 0), !bGXsfl_52_Refreshing);
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
      AV51RecFec = localUtil.parseDateParm( httpContext.GetPar( "RecFec")) ;
      AV53EmprCod = httpContext.GetPar( "EmprCod") ;
      httpContext.ajax_req_read_hidden_sdt(httpContext.GetNextPar( ), AV33ColumnsSelector);
      AV40TFPrdNum = httpContext.GetPar( "TFPrdNum") ;
      AV41TFPrdNum_Sel = httpContext.GetPar( "TFPrdNum_Sel") ;
      AV43TFPrdNom = httpContext.GetPar( "TFPrdNom") ;
      AV44TFPrdNom_Sel = httpContext.GetPar( "TFPrdNom_Sel") ;
      AV60TFRecExiTeo = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo"), ".") ;
      AV61TFRecExiTeo_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTeo_To"), ".") ;
      AV118TFRecExiTcc = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTcc"), ".") ;
      AV119TFRecExiTcc_To = CommonUtil.decimalVal( httpContext.GetPar( "TFRecExiTcc_To"), ".") ;
      AV133Pgmname = httpContext.GetPar( "Pgmname") ;
      AV13OrderedBy = (short)(GXutil.lval( httpContext.GetPar( "OrderedBy"))) ;
      AV14OrderedDsc = GXutil.strtobool( httpContext.GetPar( "OrderedDsc")) ;
      edtRecExiTcc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavRecexircc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecexircc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecexircc_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavDifercc_Visible = (int)(GXutil.lval( httpContext.GetNextPar( ))) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Visible), 5, 0), !bGXsfl_52_Refreshing);
      AV52Station = httpContext.GetPar( "Station") ;
      AV89FlagPreMed = (byte)(GXutil.lval( httpContext.GetPar( "FlagPreMed"))) ;
      AV88FlagCcs = (byte)(GXutil.lval( httpContext.GetPar( "FlagCcs"))) ;
      AV87FlagCColor = (byte)(GXutil.lval( httpContext.GetPar( "FlagCColor"))) ;
      AV95Nalmcc = (byte)(GXutil.lval( httpContext.GetPar( "Nalmcc"))) ;
      AV115Val_stk = (byte)(GXutil.lval( httpContext.GetPar( "Val_stk"))) ;
      httpContext.setAjaxCallMode();
      if ( ! httpContext.IsValidAjaxCall( true) )
      {
         GxWebError = (byte)(1) ;
         return  ;
      }
      gxgrgrid_refresh( subGrid_Rows, AV51RecFec, AV53EmprCod, AV33ColumnsSelector, AV40TFPrdNum, AV41TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV60TFRecExiTeo, AV61TFRecExiTeo_To, AV118TFRecExiTcc, AV119TFRecExiTcc_To, AV133Pgmname, AV13OrderedBy, AV14OrderedDsc, AV52Station, AV89FlagPreMed, AV88FlagCcs, AV87FlagCColor, AV95Nalmcc, AV115Val_stk) ;
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
      paTO2( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      if ( ( gxajaxcallmode == 0 ) && ( GxWebError == 0 ) )
      {
         startTO2( ) ;
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
      httpContext.AddJavascriptSource("calendar.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-setup.js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("calendar-"+GXutil.substring( httpContext.getLanguageProperty( "culture"), 1, 2)+".js", "?"+httpContext.getBuildNumber( 214800), false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      FormProcess = " data-HasEnter=\"false\" data-Skiponenter=\"false\"" ;
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
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("app.webwconreinfinite", new String[] {}, new String[] {}) +"\">") ;
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
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV133Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGPREMED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89FlagPreMed), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV88FlagCcs), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87FlagCColor), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNALMCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV95Nalmcc), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAL_STK", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV115Val_stk), "9")));
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      app.GxWebStd.gx_hidden_field( httpContext, "GXH_vRECFEC", localUtil.format(AV51RecFec, "99/99/99"));
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      app.GxWebStd.gx_hidden_field( httpContext, "nRC_GXsfl_52", GXutil.ltrim( localUtil.ntoc( nRC_GXsfl_52, (byte)(8), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vDDO_TITLESETTINGSICONS", AV46DDO_TitleSettingsIcons);
      }
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.ajax_rsp_assign_sdt_attri("", false, "vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      else
      {
         httpContext.ajax_rsp_assign_hidden_sdt("vCOLUMNSSELECTOR", AV33ColumnsSelector);
      }
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM", GXutil.rtrim( AV40TFPrdNum));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNUM_SEL", GXutil.rtrim( AV41TFPrdNum_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM", GXutil.rtrim( AV43TFPrdNom));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFPRDNOM_SEL", GXutil.rtrim( AV44TFPrdNom_Sel));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXITEO", GXutil.ltrim( localUtil.ntoc( AV60TFRecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXITEO_TO", GXutil.ltrim( localUtil.ntoc( AV61TFRecExiTeo_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXITCC", GXutil.ltrim( localUtil.ntoc( AV118TFRecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vTFRECEXITCC_TO", GXutil.ltrim( localUtil.ntoc( AV119TFRecExiTcc_To, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV133Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV133Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vORDEREDBY", GXutil.ltrim( localUtil.ntoc( AV13OrderedBy, (byte)(4), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_boolean_hidden_field( httpContext, "vORDEREDDSC", AV14OrderedDsc);
      app.GxWebStd.gx_hidden_field( httpContext, "RECMEMCANT", GXutil.ltrim( localUtil.ntoc( A11624RecMemCant, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXIREA", GXutil.ltrim( localUtil.ntoc( A807RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXIRCC", GXutil.ltrim( localUtil.ntoc( A806RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECLOT", GXutil.rtrim( A12285RecLot));
      app.GxWebStd.gx_hidden_field( httpContext, "EMPRCOD", GXutil.rtrim( A396EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECFECHR", localUtil.ttoc( AV49Recfechr, 10, 8, 0, 0, "/", ":", " "));
      app.GxWebStd.gx_hidden_field( httpContext, "vEMPRCOD", GXutil.rtrim( AV53EmprCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vUSURCOD", GXutil.rtrim( AV55UsurCod));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV52Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV89FlagPreMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGPREMED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89FlagPreMed), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREMED", GXutil.ltrim( localUtil.ntoc( A726PrdPreMed, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDPREACT", GXutil.ltrim( localUtil.ntoc( A724PrdPreAct, (byte)(14), (byte)(5), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECUBIC", GXutil.rtrim( AV107RecUbic));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCCS", GXutil.ltrim( localUtil.ntoc( AV88FlagCcs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV88FlagCcs), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFECREC", localUtil.dtoc( AV63Fecrec, 0, "/"));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV87FlagCColor, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87FlagCColor), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNALMCC", GXutil.ltrim( localUtil.ntoc( AV95Nalmcc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNALMCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV95Nalmcc), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV115Val_stk, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAL_STK", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV115Val_stk), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "PRDREC", GXutil.rtrim( A727PrdRec));
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
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Width", GXutil.rtrim( Dvpanel_unnamedtable3_Width));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autowidth", GXutil.booltostr( Dvpanel_unnamedtable3_Autowidth));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoheight", GXutil.booltostr( Dvpanel_unnamedtable3_Autoheight));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Cls", GXutil.rtrim( Dvpanel_unnamedtable3_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Title", GXutil.rtrim( Dvpanel_unnamedtable3_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsible", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsible));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Collapsed", GXutil.booltostr( Dvpanel_unnamedtable3_Collapsed));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Showcollapseicon", GXutil.booltostr( Dvpanel_unnamedtable3_Showcollapseicon));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Iconposition", GXutil.rtrim( Dvpanel_unnamedtable3_Iconposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVPANEL_UNNAMEDTABLE3_Autoscroll", GXutil.booltostr( Dvpanel_unnamedtable3_Autoscroll));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Caption", GXutil.rtrim( Ddo_grid_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_set", GXutil.rtrim( Ddo_grid_Filteredtext_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_set", GXutil.rtrim( Ddo_grid_Filteredtextto_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_set", GXutil.rtrim( Ddo_grid_Selectedvalue_set));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Gridinternalname", GXutil.rtrim( Ddo_grid_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnids", GXutil.rtrim( Ddo_grid_Columnids));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Columnssortvalues", GXutil.rtrim( Ddo_grid_Columnssortvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includesortasc", GXutil.rtrim( Ddo_grid_Includesortasc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Fixable", GXutil.rtrim( Ddo_grid_Fixable));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Sortedstatus", GXutil.rtrim( Ddo_grid_Sortedstatus));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includefilter", GXutil.rtrim( Ddo_grid_Includefilter));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filtertype", GXutil.rtrim( Ddo_grid_Filtertype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filterisrange", GXutil.rtrim( Ddo_grid_Filterisrange));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Includedatalist", GXutil.rtrim( Ddo_grid_Includedatalist));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalisttype", GXutil.rtrim( Ddo_grid_Datalisttype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Datalistproc", GXutil.rtrim( Ddo_grid_Datalistproc));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Caption", GXutil.rtrim( Ddo_gridcolumnsselector_Caption));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Tooltip", GXutil.rtrim( Ddo_gridcolumnsselector_Tooltip));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Cls", GXutil.rtrim( Ddo_gridcolumnsselector_Cls));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype", GXutil.rtrim( Ddo_gridcolumnsselector_Dropdownoptionstype));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname", GXutil.rtrim( Ddo_gridcolumnsselector_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace", GXutil.rtrim( Ddo_gridcolumnsselector_Titlecontrolidtoreplace));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Title));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmationtext));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Confirmtype));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Gridinternalname", GXutil.rtrim( Grid_empowerer_Gridinternalname));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Infinitescrolling", GXutil.rtrim( Grid_empowerer_Infinitescrolling));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hastitlesettings", GXutil.booltostr( Grid_empowerer_Hastitlesettings));
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_EMPOWERER_Hascolumnsselector", GXutil.booltostr( Grid_empowerer_Hascolumnsselector));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXITCC_Visible", GXutil.ltrim( localUtil.ntoc( edtRecExiTcc_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vRECEXIRCC_Visible", GXutil.ltrim( localUtil.ntoc( edtavRecexircc_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "vDIFERCC_Visible", GXutil.ltrim( localUtil.ntoc( edtavDifercc_Visible, (byte)(5), (byte)(0), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Activeeventkey", GXutil.rtrim( Ddo_grid_Activeeventkey));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedvalue_get", GXutil.rtrim( Ddo_grid_Selectedvalue_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Selectedcolumn", GXutil.rtrim( Ddo_grid_Selectedcolumn));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtext_get", GXutil.rtrim( Ddo_grid_Filteredtext_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRID_Filteredtextto_get", GXutil.rtrim( Ddo_grid_Filteredtextto_get));
      app.GxWebStd.gx_hidden_field( httpContext, "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues", GXutil.rtrim( Ddo_gridcolumnsselector_Columnsselectorvalues));
      app.GxWebStd.gx_hidden_field( httpContext, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result", GXutil.rtrim( Dvelop_confirmpanel_btnconfirmar_Result));
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
         weTO2( ) ;
         httpContext.writeText( "</div>") ;
      }
   }

   public void dispatchEvents( )
   {
      evtTO2( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return false ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("app.webwconreinfinite", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "WebWConreInfinite" ;
   }

   public String getPgmdesc( )
   {
      return httpContext.getMessage( "Entrada Inventario", "") ;
   }

   public void wbTO0( )
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
         app.GxWebStd.gx_div_start( httpContext, divLayoutmaintable_Internalname, 1, 0, "px", 0, "px", "Table TableWithSelectableGrid", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTablemain_Internalname, 1, 0, "px", 0, "px", "TableMainWithShadow", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable1_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divTableactions_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroupGrouped", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 22,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexport_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCaption", ""), bttBtnexport_Jsonclick, 5, httpContext.getMessage( "WWP_ExportTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORT\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWConreInfinite.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 24,'',false,'',0)\"" ;
         ClassString = "Button" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnexportcsv_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_ExportCSVCaption", ""), bttBtnexportcsv_Jsonclick, 5, httpContext.getMessage( "WWP_ExportCSVTooltip", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOEXPORTCSV\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWConreInfinite.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 26,'',false,'',0)\"" ;
         ClassString = "hidden-xs" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtneditcolumns_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "WWP_EditColumnsCaption", ""), bttBtneditcolumns_Jsonclick, 0, httpContext.getMessage( "WWP_EditColumnsTooltip", ""), "", StyleString, ClassString, 1, 0, "standard", "'"+""+"'"+",false,"+"'"+""+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWConreInfinite.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavRecfec_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavRecfec_Internalname, httpContext.getMessage( "Fecha Recuento", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 30,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         httpContext.writeText( "<div id=\""+edtavRecfec_Internalname+"_dp_container\" class=\"dp_container\" style=\"white-space:nowrap;display:inline;\">") ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavRecfec_Internalname, localUtil.format(AV51RecFec, "99/99/99"), localUtil.format( AV51RecFec, "99/99/99"), TempTags+" onchange=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.date.valid_date(this, 8,'"+httpContext.getLanguageProperty( "date_fmt")+"',0,"+httpContext.getLanguageProperty( "time_fmt")+",'"+httpContext.getLanguageProperty( "code")+"',false,0);"+";gx.evt.onblur(this,30);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavRecfec_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavRecfec_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_WebWConreInfinite.htm");
         app.GxWebStd.gx_bitmap( httpContext, edtavRecfec_Internalname+"_dp_trigger", context.getHttpContext().getImagePath( "61b9b5d3-dff6-4d59-9b00-da61bc2cbe93", "", context.getHttpContext().getTheme( )), "", "", "", "", ((1==0)||(edtavRecfec_Enabled==0) ? 0 : 1), 0, "Date selector", "Date selector", 0, 1, 0, "", 0, "", 0, 0, 0, "", "", "cursor: pointer;", "", "", "", "", "", "", "", "", 1, false, false, "", "HLP_WebWConreInfinite.htm");
         httpContext.writeTextNL( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-4", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtavCcstkhor_Internalname+"\"", "", "div");
         /* Attribute/Variable Label */
         app.GxWebStd.gx_label_element( httpContext, edtavCcstkhor_Internalname, httpContext.getMessage( "Hora", ""), "col-sm-3 AttributeFLLabel", 1, true, "");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
         /* Single line edit */
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'" + sGXsfl_52_idx + "',0)\"" ;
         app.GxWebStd.gx_single_line_edit( httpContext, edtavCcstkhor_Internalname, GXutil.rtrim( AV47CCStkHor), GXutil.rtrim( localUtil.format( AV47CCStkHor, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtavCcstkhor_Jsonclick, 0, "AttributeFL", "", "", "", "", 1, edtavCcstkhor_Enabled, 0, "text", "", 8, "chr", 1, "row", 8, (byte)(0), (short)(0), 0, (byte)(0), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_WebWConreInfinite.htm");
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
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 42,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnmemorizarcantreal_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Memorizar Cant Real?", ""), bttBtnmemorizarcantreal_Jsonclick, 5, httpContext.getMessage( "Memorizar Cant Real?", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"E\\'DOMEMORIZARCANTREAL\\'."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_WebWConreInfinite.htm");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-6", "left", "top", "", "", "div");
         TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
         ClassString = "ButtonMaterial" ;
         StyleString = "" ;
         app.GxWebStd.gx_button_ctrl( httpContext, bttBtnconfirmar_Internalname, "gx.evt.setGridEvt("+GXutil.str( 52, 2, 0)+","+"null"+");", httpContext.getMessage( "Confirmar", ""), bttBtnconfirmar_Jsonclick, 7, httpContext.getMessage( "Confirmar", ""), "", StyleString, ClassString, 1, 1, "standard", "'"+""+"'"+",false,"+"'"+"e11to1_client"+"'", TempTags, "", 2, "HLP_WebWConreInfinite.htm");
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
         ucDvpanel_unnamedtable3.setProperty("Width", Dvpanel_unnamedtable3_Width);
         ucDvpanel_unnamedtable3.setProperty("AutoWidth", Dvpanel_unnamedtable3_Autowidth);
         ucDvpanel_unnamedtable3.setProperty("AutoHeight", Dvpanel_unnamedtable3_Autoheight);
         ucDvpanel_unnamedtable3.setProperty("Cls", Dvpanel_unnamedtable3_Cls);
         ucDvpanel_unnamedtable3.setProperty("Title", Dvpanel_unnamedtable3_Title);
         ucDvpanel_unnamedtable3.setProperty("Collapsible", Dvpanel_unnamedtable3_Collapsible);
         ucDvpanel_unnamedtable3.setProperty("Collapsed", Dvpanel_unnamedtable3_Collapsed);
         ucDvpanel_unnamedtable3.setProperty("ShowCollapseIcon", Dvpanel_unnamedtable3_Showcollapseicon);
         ucDvpanel_unnamedtable3.setProperty("IconPosition", Dvpanel_unnamedtable3_Iconposition);
         ucDvpanel_unnamedtable3.setProperty("AutoScroll", Dvpanel_unnamedtable3_Autoscroll);
         ucDvpanel_unnamedtable3.render(context, "dvelop.gxbootstrap.panel_al", Dvpanel_unnamedtable3_Internalname, "DVPANEL_UNNAMEDTABLE3Container");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVPANEL_UNNAMEDTABLE3Container"+"UnnamedTable3"+"\" style=\"display:none;\">") ;
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, divUnnamedtable3_Internalname, 1, 0, "px", 0, "px", "", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
         /* Div Control */
         app.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 SectionGrid GridNoBorderCell HasGridEmpowerer", "left", "top", "", "", "div");
         /*  Grid Control  */
         GridContainer.SetWrapped(nGXWrapped);
         startgridcontrol52( ) ;
      }
      if ( wbEnd == 52 )
      {
         wbEnd = (short)(0) ;
         nRC_GXsfl_52 = (int)(nGXsfl_52_idx-1) ;
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
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         httpContext.writeText( "</div>") ;
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
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
         ucDdo_grid.setProperty("DropDownOptionsTitleSettingsIcons", AV46DDO_TitleSettingsIcons);
         ucDdo_grid.render(context, "dvelop.gxbootstrap.ddogridtitlesettingsm", Ddo_grid_Internalname, "DDO_GRIDContainer");
         /* User Defined Control */
         ucDdo_gridcolumnsselector.setProperty("Caption", Ddo_gridcolumnsselector_Caption);
         ucDdo_gridcolumnsselector.setProperty("Tooltip", Ddo_gridcolumnsselector_Tooltip);
         ucDdo_gridcolumnsselector.setProperty("Cls", Ddo_gridcolumnsselector_Cls);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsType", Ddo_gridcolumnsselector_Dropdownoptionstype);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsTitleSettingsIcons", AV46DDO_TitleSettingsIcons);
         ucDdo_gridcolumnsselector.setProperty("DropDownOptionsData", AV33ColumnsSelector);
         ucDdo_gridcolumnsselector.render(context, "dvelop.gxbootstrap.ddogridcolumnsselector", Ddo_gridcolumnsselector_Internalname, "DDO_GRIDCOLUMNSSELECTORContainer");
         wb_table1_70_TO2( true) ;
      }
      else
      {
         wb_table1_70_TO2( false) ;
      }
      return  ;
   }

   public void wb_table1_70_TO2e( boolean wbgen )
   {
      if ( wbgen )
      {
         /* User Defined Control */
         ucGrid_empowerer.setProperty("InfiniteScrolling", Grid_empowerer_Infinitescrolling);
         ucGrid_empowerer.setProperty("HasTitleSettings", Grid_empowerer_Hastitlesettings);
         ucGrid_empowerer.setProperty("HasColumnsSelector", Grid_empowerer_Hascolumnsselector);
         ucGrid_empowerer.render(context, "wwp.gridempowerer", Grid_empowerer_Internalname, "GRID_EMPOWERERContainer");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
         app.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      }
      if ( wbEnd == 52 )
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

   public void startTO2( )
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
         Form.getMeta().addItem("description", httpContext.getMessage( "Entrada Inventario", ""), (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      wbErr = false ;
      strupTO0( ) ;
   }

   public void wsTO2( )
   {
      startTO2( ) ;
      evtTO2( ) ;
   }

   public void evtTO2( )
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
                        else if ( GXutil.strcmp(sEvt, "DDO_GRID.ONOPTIONCLICKED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e12TO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e13TO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           e14TO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOMEMORIZARCANTREAL'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoMemorizarCantReal' */
                           e15TO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORT'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExport' */
                           e16TO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "'DOEXPORTCSV'") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                           /* Execute user event: 'DoExportCSV' */
                           e17TO2 ();
                        }
                        else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           dynload_actions( ) ;
                        }
                        else if ( GXutil.strcmp(sEvt, "GRIDPAGING") == 0 )
                        {
                           httpContext.wbHandled = (byte)(1) ;
                           AV124Webwconreinfiniteds_1_tfprdnum = AV40TFPrdNum ;
                           AV125Webwconreinfiniteds_2_tfprdnum_sel = AV41TFPrdNum_Sel ;
                           AV126Webwconreinfiniteds_3_tfprdnom = AV43TFPrdNom ;
                           AV127Webwconreinfiniteds_4_tfprdnom_sel = AV44TFPrdNom_Sel ;
                           AV128Webwconreinfiniteds_5_tfrecexiteo = AV60TFRecExiTeo ;
                           AV129Webwconreinfiniteds_6_tfrecexiteo_to = AV61TFRecExiTeo_To ;
                           AV130Webwconreinfiniteds_7_tfrecexitcc = AV118TFRecExiTcc ;
                           AV131Webwconreinfiniteds_8_tfrecexitcc_to = AV119TFRecExiTcc_To ;
                           sEvt = httpContext.cgiGet( "GRIDPAGING") ;
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
                           nGXsfl_52_idx = (int)(GXutil.lval( sEvtType)) ;
                           sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
                           subsflControlProps_522( ) ;
                           A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
                           A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
                           A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
                              GX_FocusControl = edtavRecexirea_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV56RecExiRea = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV56RecExiRea, 12, 4));
                           }
                           else
                           {
                              AV56RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV56RecExiRea, 12, 4));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
                              GX_FocusControl = edtavDifer_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV57Difer = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV57Difer, 12, 4));
                           }
                           else
                           {
                              AV57Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV57Difer, 12, 4));
                           }
                           A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIRCC");
                              GX_FocusControl = edtavRecexircc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV62RecExiRcc = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV62RecExiRcc, 12, 4));
                           }
                           else
                           {
                              AV62RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV62RecExiRcc, 12, 4));
                           }
                           if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
                           {
                              httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERCC");
                              GX_FocusControl = edtavDifercc_Internalname ;
                              httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                              wbErr = true ;
                              AV76DiferCC = DecimalUtil.ZERO ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV76DiferCC, 12, 4));
                           }
                           else
                           {
                              AV76DiferCC = localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)) ;
                              httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV76DiferCC, 12, 4));
                           }
                           AV58RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
                           httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV58RecLot);
                           sEvtType = GXutil.right( sEvt, 1) ;
                           if ( GXutil.strcmp(sEvtType, ".") == 0 )
                           {
                              sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                              if ( GXutil.strcmp(sEvt, "START") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Start */
                                 e18TO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "REFRESH") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 /* Execute user event: Refresh */
                                 e19TO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "GRID.LOAD") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 dynload_actions( ) ;
                                 e20TO2 ();
                              }
                              else if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                              {
                                 httpContext.wbHandled = (byte)(1) ;
                                 if ( ! wbErr )
                                 {
                                    Rfr0gs = false ;
                                    /* Set Refresh If Recfec Changed */
                                    if ( !( GXutil.dateCompare(localUtil.ctot( httpContext.cgiGet( "GXH_vRECFEC"), 0), AV51RecFec) ) )
                                    {
                                       Rfr0gs = true ;
                                    }
                                    if ( ! Rfr0gs )
                                    {
                                    }
                                    dynload_actions( ) ;
                                 }
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

   public void weTO2( )
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

   public void paTO2( )
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
            GX_FocusControl = edtavRecfec_Internalname ;
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
      subsflControlProps_522( ) ;
      while ( nGXsfl_52_idx <= nRC_GXsfl_52 )
      {
         sendrow_522( ) ;
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      addString( httpContext.getJSONContainerResponse( GridContainer)) ;
      /* End function gxnrGrid_newrow */
   }

   public void gxgrgrid_refresh( int subGrid_Rows ,
                                 java.util.Date AV51RecFec ,
                                 String AV53EmprCod ,
                                 app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ,
                                 String AV40TFPrdNum ,
                                 String AV41TFPrdNum_Sel ,
                                 String AV43TFPrdNom ,
                                 String AV44TFPrdNom_Sel ,
                                 java.math.BigDecimal AV60TFRecExiTeo ,
                                 java.math.BigDecimal AV61TFRecExiTeo_To ,
                                 java.math.BigDecimal AV118TFRecExiTcc ,
                                 java.math.BigDecimal AV119TFRecExiTcc_To ,
                                 String AV133Pgmname ,
                                 short AV13OrderedBy ,
                                 boolean AV14OrderedDsc ,
                                 String AV52Station ,
                                 byte AV89FlagPreMed ,
                                 byte AV88FlagCcs ,
                                 byte AV87FlagCColor ,
                                 byte AV95Nalmcc ,
                                 byte AV115Val_stk )
   {
      initialize_formulas( ) ;
      app.GxWebStd.set_html_headers( httpContext, 0, "", "");
      /* Execute user event: Refresh */
      e19TO2 ();
      GRID_nCurrentRecord = 0 ;
      rfTO2( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      send_integrity_footer_hashes( ) ;
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      /* End function gxgrGrid_refresh */
   }

   public void send_integrity_hashes( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXITEO", getSecureSignedToken( "", localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXITEO", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXITCC", getSecureSignedToken( "", localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "RECEXITCC", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), ".", "")));
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
      GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_52_idx ;
      app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      send_integrity_hashes( ) ;
      rfTO2( ) ;
      if ( isFullAjaxMode( ) )
      {
         send_integrity_footer_hashes( ) ;
      }
      /* End function Refresh */
   }

   public void initialize_formulas( )
   {
      /* GeneXus formulas. */
      AV133Pgmname = "WebWConreInfinite" ;
      Gx_err = (short)(0) ;
      edtavRecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecfec_Enabled), 5, 0), true);
      edtavCcstkhor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcstkhor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkhor_Enabled), 5, 0), true);
      edtavDifer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavDifercc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
   }

   public int subgridclient_rec_count_fnc( )
   {
      AV124Webwconreinfiniteds_1_tfprdnum = AV40TFPrdNum ;
      AV125Webwconreinfiniteds_2_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV126Webwconreinfiniteds_3_tfprdnom = AV43TFPrdNom ;
      AV127Webwconreinfiniteds_4_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV128Webwconreinfiniteds_5_tfrecexiteo = AV60TFRecExiTeo ;
      AV129Webwconreinfiniteds_6_tfrecexiteo_to = AV61TFRecExiTeo_To ;
      AV130Webwconreinfiniteds_7_tfrecexitcc = AV118TFRecExiTcc ;
      AV131Webwconreinfiniteds_8_tfrecexitcc_to = AV119TFRecExiTcc_To ;
      GRID_nRecordCount = 0 ;
      pr_default.dynParam(0, new Object[]{ new Object[]{
                                           AV125Webwconreinfiniteds_2_tfprdnum_sel ,
                                           AV124Webwconreinfiniteds_1_tfprdnum ,
                                           AV127Webwconreinfiniteds_4_tfprdnom_sel ,
                                           AV126Webwconreinfiniteds_3_tfprdnom ,
                                           AV128Webwconreinfiniteds_5_tfrecexiteo ,
                                           AV129Webwconreinfiniteds_6_tfrecexiteo_to ,
                                           AV130Webwconreinfiniteds_7_tfrecexitcc ,
                                           AV131Webwconreinfiniteds_8_tfrecexitcc_to ,
                                           A719PrdNum ,
                                           A718PrdNom ,
                                           A809RecExiTeo ,
                                           A808RecExiTcc ,
                                           Short.valueOf(AV13OrderedBy) ,
                                           Boolean.valueOf(AV14OrderedDsc) ,
                                           A727PrdRec ,
                                           Byte.valueOf(A13416RecEstInv) ,
                                           AV53EmprCod ,
                                           AV51RecFec ,
                                           A396EmprCod ,
                                           A810RecFec } ,
                                           new int[]{
                                           TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                           TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE
                                           }
      });
      lV124Webwconreinfiniteds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV124Webwconreinfiniteds_1_tfprdnum), 6, "%") ;
      lV126Webwconreinfiniteds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV126Webwconreinfiniteds_3_tfprdnom), 26, "%") ;
      /* Using cursor H00TO2 */
      pr_default.execute(0, new Object[] {AV53EmprCod, AV51RecFec, lV124Webwconreinfiniteds_1_tfprdnum, AV125Webwconreinfiniteds_2_tfprdnum_sel, lV126Webwconreinfiniteds_3_tfprdnom, AV127Webwconreinfiniteds_4_tfprdnom_sel, AV128Webwconreinfiniteds_5_tfrecexiteo, AV129Webwconreinfiniteds_6_tfrecexiteo_to, AV130Webwconreinfiniteds_7_tfrecexitcc, AV131Webwconreinfiniteds_8_tfrecexitcc_to});
      while ( (pr_default.getStatus(0) != 101) )
      {
         A810RecFec = H00TO2_A810RecFec[0] ;
         A727PrdRec = H00TO2_A727PrdRec[0] ;
         A13416RecEstInv = H00TO2_A13416RecEstInv[0] ;
         A807RecExiRea = H00TO2_A807RecExiRea[0] ;
         A11624RecMemCant = H00TO2_A11624RecMemCant[0] ;
         A806RecExiRcc = H00TO2_A806RecExiRcc[0] ;
         A12285RecLot = H00TO2_A12285RecLot[0] ;
         A396EmprCod = H00TO2_A396EmprCod[0] ;
         A724PrdPreAct = H00TO2_A724PrdPreAct[0] ;
         A726PrdPreMed = H00TO2_A726PrdPreMed[0] ;
         A808RecExiTcc = H00TO2_A808RecExiTcc[0] ;
         A809RecExiTeo = H00TO2_A809RecExiTeo[0] ;
         A718PrdNom = H00TO2_A718PrdNom[0] ;
         A719PrdNum = H00TO2_A719PrdNum[0] ;
         A727PrdRec = H00TO2_A727PrdRec[0] ;
         A724PrdPreAct = H00TO2_A724PrdPreAct[0] ;
         A726PrdPreMed = H00TO2_A726PrdPreMed[0] ;
         A718PrdNom = H00TO2_A718PrdNom[0] ;
         if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
         {
            GRID_nRecordCount = (long)(GRID_nRecordCount+1) ;
         }
         pr_default.readNext(0);
      }
      GRID_nEOF = (byte)(((pr_default.getStatus(0) == 101) ? 1 : 0)) ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      pr_default.close(0);
      return (int)(GRID_nRecordCount) ;
   }

   public void rfTO2( )
   {
      initialize_formulas( ) ;
      clear_multi_value_controls( ) ;
      if ( isAjaxCallMode( ) )
      {
         GridContainer.ClearRows();
      }
      wbStart = (short)(52) ;
      /* Execute user event: Refresh */
      e19TO2 ();
      nGXsfl_52_idx = (int)(1+GRID_nFirstRecordOnPage) ;
      sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
      subsflControlProps_522( ) ;
      bGXsfl_52_Refreshing = true ;
      GridContainer.AddObjectProperty("GridName", "Grid");
      GridContainer.AddObjectProperty("CmpContext", "");
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
         subsflControlProps_522( ) ;
         pr_default.dynParam(1, new Object[]{ new Object[]{
                                              AV125Webwconreinfiniteds_2_tfprdnum_sel ,
                                              AV124Webwconreinfiniteds_1_tfprdnum ,
                                              AV127Webwconreinfiniteds_4_tfprdnom_sel ,
                                              AV126Webwconreinfiniteds_3_tfprdnom ,
                                              AV128Webwconreinfiniteds_5_tfrecexiteo ,
                                              AV129Webwconreinfiniteds_6_tfrecexiteo_to ,
                                              AV130Webwconreinfiniteds_7_tfrecexitcc ,
                                              AV131Webwconreinfiniteds_8_tfrecexitcc_to ,
                                              A719PrdNum ,
                                              A718PrdNom ,
                                              A809RecExiTeo ,
                                              A808RecExiTcc ,
                                              Short.valueOf(AV13OrderedBy) ,
                                              Boolean.valueOf(AV14OrderedDsc) ,
                                              A727PrdRec ,
                                              Byte.valueOf(A13416RecEstInv) ,
                                              AV53EmprCod ,
                                              AV51RecFec ,
                                              A396EmprCod ,
                                              A810RecFec } ,
                                              new int[]{
                                              TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.STRING, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.STRING, TypeConstants.STRING,
                                              TypeConstants.DECIMAL, TypeConstants.DECIMAL, TypeConstants.SHORT, TypeConstants.BOOLEAN, TypeConstants.STRING, TypeConstants.BYTE, TypeConstants.STRING, TypeConstants.DATE, TypeConstants.STRING, TypeConstants.DATE
                                              }
         });
         lV124Webwconreinfiniteds_1_tfprdnum = GXutil.padr( GXutil.rtrim( AV124Webwconreinfiniteds_1_tfprdnum), 6, "%") ;
         lV126Webwconreinfiniteds_3_tfprdnom = GXutil.padr( GXutil.rtrim( AV126Webwconreinfiniteds_3_tfprdnom), 26, "%") ;
         /* Using cursor H00TO3 */
         pr_default.execute(1, new Object[] {AV53EmprCod, AV51RecFec, lV124Webwconreinfiniteds_1_tfprdnum, AV125Webwconreinfiniteds_2_tfprdnum_sel, lV126Webwconreinfiniteds_3_tfprdnom, AV127Webwconreinfiniteds_4_tfprdnom_sel, AV128Webwconreinfiniteds_5_tfrecexiteo, AV129Webwconreinfiniteds_6_tfrecexiteo_to, AV130Webwconreinfiniteds_7_tfrecexitcc, AV131Webwconreinfiniteds_8_tfrecexitcc_to});
         nGXsfl_52_idx = (int)(1+GRID_nFirstRecordOnPage) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         while ( ( (pr_default.getStatus(1) != 101) ) && ( ( ( subGrid_Rows == 0 ) || ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) ) )
         {
            A810RecFec = H00TO3_A810RecFec[0] ;
            A727PrdRec = H00TO3_A727PrdRec[0] ;
            A13416RecEstInv = H00TO3_A13416RecEstInv[0] ;
            A807RecExiRea = H00TO3_A807RecExiRea[0] ;
            A11624RecMemCant = H00TO3_A11624RecMemCant[0] ;
            A806RecExiRcc = H00TO3_A806RecExiRcc[0] ;
            A12285RecLot = H00TO3_A12285RecLot[0] ;
            A396EmprCod = H00TO3_A396EmprCod[0] ;
            A724PrdPreAct = H00TO3_A724PrdPreAct[0] ;
            A726PrdPreMed = H00TO3_A726PrdPreMed[0] ;
            A808RecExiTcc = H00TO3_A808RecExiTcc[0] ;
            A809RecExiTeo = H00TO3_A809RecExiTeo[0] ;
            A718PrdNom = H00TO3_A718PrdNom[0] ;
            A719PrdNum = H00TO3_A719PrdNum[0] ;
            A727PrdRec = H00TO3_A727PrdRec[0] ;
            A724PrdPreAct = H00TO3_A724PrdPreAct[0] ;
            A726PrdPreMed = H00TO3_A726PrdPreMed[0] ;
            A718PrdNom = H00TO3_A718PrdNom[0] ;
            if ( GXutil.strcmp(A727PrdRec, httpContext.getMessage( "S", "")) == 0 )
            {
               e20TO2 ();
            }
            pr_default.readNext(1);
         }
         GRID_nEOF = (byte)(((pr_default.getStatus(1) == 101) ? 1 : 0)) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         pr_default.close(1);
         wbEnd = (short)(52) ;
         wbTO0( ) ;
      }
      bGXsfl_52_Refreshing = true ;
   }

   public void send_integrity_lvl_hashesTO2( )
   {
      app.GxWebStd.gx_hidden_field( httpContext, "vPGMNAME", GXutil.rtrim( AV133Pgmname));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vPGMNAME", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV133Pgmname, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vSTATION", GXutil.rtrim( AV52Station));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Station, ""))));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGPREMED", GXutil.ltrim( localUtil.ntoc( AV89FlagPreMed, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGPREMED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89FlagPreMed), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXITEO"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_RECEXITCC"+"_"+sGXsfl_52_idx, getSecureSignedToken( sGXsfl_52_idx, localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCCS", GXutil.ltrim( localUtil.ntoc( AV88FlagCcs, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV88FlagCcs), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vFLAGCCOLOR", GXutil.ltrim( localUtil.ntoc( AV87FlagCColor, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87FlagCColor), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vNALMCC", GXutil.ltrim( localUtil.ntoc( AV95Nalmcc, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNALMCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV95Nalmcc), "9")));
      app.GxWebStd.gx_hidden_field( httpContext, "vVAL_STK", GXutil.ltrim( localUtil.ntoc( AV115Val_stk, (byte)(1), (byte)(0), httpContext.getLanguageProperty( "decimal_point"), "")));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAL_STK", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV115Val_stk), "9")));
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
      AV124Webwconreinfiniteds_1_tfprdnum = AV40TFPrdNum ;
      AV125Webwconreinfiniteds_2_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV126Webwconreinfiniteds_3_tfprdnom = AV43TFPrdNom ;
      AV127Webwconreinfiniteds_4_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV128Webwconreinfiniteds_5_tfrecexiteo = AV60TFRecExiTeo ;
      AV129Webwconreinfiniteds_6_tfrecexiteo_to = AV61TFRecExiTeo_To ;
      AV130Webwconreinfiniteds_7_tfrecexitcc = AV118TFRecExiTcc ;
      AV131Webwconreinfiniteds_8_tfrecexitcc_to = AV119TFRecExiTcc_To ;
      GRID_nFirstRecordOnPage = 0 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV51RecFec, AV53EmprCod, AV33ColumnsSelector, AV40TFPrdNum, AV41TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV60TFRecExiTeo, AV61TFRecExiTeo_To, AV118TFRecExiTcc, AV119TFRecExiTcc_To, AV133Pgmname, AV13OrderedBy, AV14OrderedDsc, AV52Station, AV89FlagPreMed, AV88FlagCcs, AV87FlagCColor, AV95Nalmcc, AV115Val_stk) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_nextpage( )
   {
      AV124Webwconreinfiniteds_1_tfprdnum = AV40TFPrdNum ;
      AV125Webwconreinfiniteds_2_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV126Webwconreinfiniteds_3_tfprdnom = AV43TFPrdNom ;
      AV127Webwconreinfiniteds_4_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV128Webwconreinfiniteds_5_tfrecexiteo = AV60TFRecExiTeo ;
      AV129Webwconreinfiniteds_6_tfrecexiteo_to = AV61TFRecExiTeo_To ;
      AV130Webwconreinfiniteds_7_tfrecexitcc = AV118TFRecExiTcc ;
      AV131Webwconreinfiniteds_8_tfrecexitcc_to = AV119TFRecExiTcc_To ;
      if ( GRID_nEOF == 0 )
      {
         GRID_nFirstRecordOnPage = (long)(GRID_nFirstRecordOnPage+subgrid_fnc_recordsperpage( )) ;
      }
      if ( GRID_nEOF == 1 )
      {
         GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
      }
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_nFirstRecordOnPage", GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
      GridContainer.AddObjectProperty("GRID_nFirstRecordOnPage", GRID_nFirstRecordOnPage);
      if ( isFullAjaxMode( ) )
      {
         gxgrgrid_refresh( subGrid_Rows, AV51RecFec, AV53EmprCod, AV33ColumnsSelector, AV40TFPrdNum, AV41TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV60TFRecExiTeo, AV61TFRecExiTeo_To, AV118TFRecExiTcc, AV119TFRecExiTcc_To, AV133Pgmname, AV13OrderedBy, AV14OrderedDsc, AV52Station, AV89FlagPreMed, AV88FlagCcs, AV87FlagCColor, AV95Nalmcc, AV115Val_stk) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(((GRID_nEOF==0) ? 0 : 2)) ;
   }

   public short subgrid_previouspage( )
   {
      AV124Webwconreinfiniteds_1_tfprdnum = AV40TFPrdNum ;
      AV125Webwconreinfiniteds_2_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV126Webwconreinfiniteds_3_tfprdnom = AV43TFPrdNom ;
      AV127Webwconreinfiniteds_4_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV128Webwconreinfiniteds_5_tfrecexiteo = AV60TFRecExiTeo ;
      AV129Webwconreinfiniteds_6_tfrecexiteo_to = AV61TFRecExiTeo_To ;
      AV130Webwconreinfiniteds_7_tfrecexitcc = AV118TFRecExiTcc ;
      AV131Webwconreinfiniteds_8_tfrecexitcc_to = AV119TFRecExiTcc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV51RecFec, AV53EmprCod, AV33ColumnsSelector, AV40TFPrdNum, AV41TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV60TFRecExiTeo, AV61TFRecExiTeo_To, AV118TFRecExiTcc, AV119TFRecExiTcc_To, AV133Pgmname, AV13OrderedBy, AV14OrderedDsc, AV52Station, AV89FlagPreMed, AV88FlagCcs, AV87FlagCColor, AV95Nalmcc, AV115Val_stk) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public short subgrid_lastpage( )
   {
      AV124Webwconreinfiniteds_1_tfprdnum = AV40TFPrdNum ;
      AV125Webwconreinfiniteds_2_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV126Webwconreinfiniteds_3_tfprdnom = AV43TFPrdNom ;
      AV127Webwconreinfiniteds_4_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV128Webwconreinfiniteds_5_tfrecexiteo = AV60TFRecExiTeo ;
      AV129Webwconreinfiniteds_6_tfrecexiteo_to = AV61TFRecExiTeo_To ;
      AV130Webwconreinfiniteds_7_tfrecexitcc = AV118TFRecExiTcc ;
      AV131Webwconreinfiniteds_8_tfrecexitcc_to = AV119TFRecExiTcc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV51RecFec, AV53EmprCod, AV33ColumnsSelector, AV40TFPrdNum, AV41TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV60TFRecExiTeo, AV61TFRecExiTeo_To, AV118TFRecExiTcc, AV119TFRecExiTcc_To, AV133Pgmname, AV13OrderedBy, AV14OrderedDsc, AV52Station, AV89FlagPreMed, AV88FlagCcs, AV87FlagCColor, AV95Nalmcc, AV115Val_stk) ;
      }
      send_integrity_footer_hashes( ) ;
      return (short)(0) ;
   }

   public int subgrid_gotopage( int nPageNo )
   {
      AV124Webwconreinfiniteds_1_tfprdnum = AV40TFPrdNum ;
      AV125Webwconreinfiniteds_2_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV126Webwconreinfiniteds_3_tfprdnom = AV43TFPrdNom ;
      AV127Webwconreinfiniteds_4_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV128Webwconreinfiniteds_5_tfrecexiteo = AV60TFRecExiTeo ;
      AV129Webwconreinfiniteds_6_tfrecexiteo_to = AV61TFRecExiTeo_To ;
      AV130Webwconreinfiniteds_7_tfrecexitcc = AV118TFRecExiTcc ;
      AV131Webwconreinfiniteds_8_tfrecexitcc_to = AV119TFRecExiTcc_To ;
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
         gxgrgrid_refresh( subGrid_Rows, AV51RecFec, AV53EmprCod, AV33ColumnsSelector, AV40TFPrdNum, AV41TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV60TFRecExiTeo, AV61TFRecExiTeo_To, AV118TFRecExiTcc, AV119TFRecExiTcc_To, AV133Pgmname, AV13OrderedBy, AV14OrderedDsc, AV52Station, AV89FlagPreMed, AV88FlagCcs, AV87FlagCColor, AV95Nalmcc, AV115Val_stk) ;
      }
      send_integrity_footer_hashes( ) ;
      return 0 ;
   }

   public void before_start_formulas( )
   {
      AV133Pgmname = "WebWConreInfinite" ;
      Gx_err = (short)(0) ;
      edtavRecfec_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecfec_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecfec_Enabled), 5, 0), true);
      edtavCcstkhor_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavCcstkhor_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavCcstkhor_Enabled), 5, 0), true);
      edtavDifer_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifer_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      edtavDifercc_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Enabled), 5, 0), !bGXsfl_52_Refreshing);
      fix_multi_value_controls( ) ;
   }

   public void strupTO0( )
   {
      /* Before Start, stand alone formulas. */
      before_start_formulas( ) ;
      /* Execute Start event if defined. */
      httpContext.wbGlbDoneStart = (byte)(0) ;
      /* Execute user event: Start */
      e18TO2 ();
      httpContext.wbGlbDoneStart = (byte)(1) ;
      /* After Start, stand alone formulas. */
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vDDO_TITLESETTINGSICONS"), AV46DDO_TitleSettingsIcons);
         httpContext.ajax_req_read_hidden_sdt(httpContext.cgiGet( "vCOLUMNSSELECTOR"), AV33ColumnsSelector);
         /* Read saved values. */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
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
         Dvpanel_unnamedtable3_Width = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Width") ;
         Dvpanel_unnamedtable3_Autowidth = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autowidth")) ;
         Dvpanel_unnamedtable3_Autoheight = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoheight")) ;
         Dvpanel_unnamedtable3_Cls = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Cls") ;
         Dvpanel_unnamedtable3_Title = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Title") ;
         Dvpanel_unnamedtable3_Collapsible = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsible")) ;
         Dvpanel_unnamedtable3_Collapsed = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Collapsed")) ;
         Dvpanel_unnamedtable3_Showcollapseicon = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Showcollapseicon")) ;
         Dvpanel_unnamedtable3_Iconposition = httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Iconposition") ;
         Dvpanel_unnamedtable3_Autoscroll = GXutil.strtobool( httpContext.cgiGet( "DVPANEL_UNNAMEDTABLE3_Autoscroll")) ;
         Ddo_grid_Caption = httpContext.cgiGet( "DDO_GRID_Caption") ;
         Ddo_grid_Filteredtext_set = httpContext.cgiGet( "DDO_GRID_Filteredtext_set") ;
         Ddo_grid_Filteredtextto_set = httpContext.cgiGet( "DDO_GRID_Filteredtextto_set") ;
         Ddo_grid_Selectedvalue_set = httpContext.cgiGet( "DDO_GRID_Selectedvalue_set") ;
         Ddo_grid_Gridinternalname = httpContext.cgiGet( "DDO_GRID_Gridinternalname") ;
         Ddo_grid_Columnids = httpContext.cgiGet( "DDO_GRID_Columnids") ;
         Ddo_grid_Columnssortvalues = httpContext.cgiGet( "DDO_GRID_Columnssortvalues") ;
         Ddo_grid_Includesortasc = httpContext.cgiGet( "DDO_GRID_Includesortasc") ;
         Ddo_grid_Fixable = httpContext.cgiGet( "DDO_GRID_Fixable") ;
         Ddo_grid_Sortedstatus = httpContext.cgiGet( "DDO_GRID_Sortedstatus") ;
         Ddo_grid_Includefilter = httpContext.cgiGet( "DDO_GRID_Includefilter") ;
         Ddo_grid_Filtertype = httpContext.cgiGet( "DDO_GRID_Filtertype") ;
         Ddo_grid_Filterisrange = httpContext.cgiGet( "DDO_GRID_Filterisrange") ;
         Ddo_grid_Includedatalist = httpContext.cgiGet( "DDO_GRID_Includedatalist") ;
         Ddo_grid_Datalisttype = httpContext.cgiGet( "DDO_GRID_Datalisttype") ;
         Ddo_grid_Datalistproc = httpContext.cgiGet( "DDO_GRID_Datalistproc") ;
         Ddo_gridcolumnsselector_Caption = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Caption") ;
         Ddo_gridcolumnsselector_Tooltip = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Tooltip") ;
         Ddo_gridcolumnsselector_Cls = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Cls") ;
         Ddo_gridcolumnsselector_Dropdownoptionstype = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Dropdownoptionstype") ;
         Ddo_gridcolumnsselector_Gridinternalname = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Gridinternalname") ;
         Ddo_gridcolumnsselector_Titlecontrolidtoreplace = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Titlecontrolidtoreplace") ;
         Dvelop_confirmpanel_btnconfirmar_Title = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Title") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmationtext = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmationtext") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Nobuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Cancelbuttoncaption") ;
         Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Yesbuttonposition") ;
         Dvelop_confirmpanel_btnconfirmar_Confirmtype = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Confirmtype") ;
         Grid_empowerer_Gridinternalname = httpContext.cgiGet( "GRID_EMPOWERER_Gridinternalname") ;
         Grid_empowerer_Infinitescrolling = httpContext.cgiGet( "GRID_EMPOWERER_Infinitescrolling") ;
         Grid_empowerer_Hastitlesettings = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hastitlesettings")) ;
         Grid_empowerer_Hascolumnsselector = GXutil.strtobool( httpContext.cgiGet( "GRID_EMPOWERER_Hascolumnsselector")) ;
         Ddo_grid_Activeeventkey = httpContext.cgiGet( "DDO_GRID_Activeeventkey") ;
         Ddo_grid_Selectedvalue_get = httpContext.cgiGet( "DDO_GRID_Selectedvalue_get") ;
         Ddo_grid_Selectedcolumn = httpContext.cgiGet( "DDO_GRID_Selectedcolumn") ;
         Ddo_grid_Filteredtext_get = httpContext.cgiGet( "DDO_GRID_Filteredtext_get") ;
         Ddo_grid_Filteredtextto_get = httpContext.cgiGet( "DDO_GRID_Filteredtextto_get") ;
         Ddo_gridcolumnsselector_Columnsselectorvalues = httpContext.cgiGet( "DDO_GRIDCOLUMNSSELECTOR_Columnsselectorvalues") ;
         Dvelop_confirmpanel_btnconfirmar_Result = httpContext.cgiGet( "DVELOP_CONFIRMPANEL_BTNCONFIRMAR_Result") ;
         /* Read variables values. */
         if ( localUtil.vcdate( httpContext.cgiGet( edtavRecfec_Internalname), (byte)(localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))) == 0 )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_faildate", new Object[] {}), 1, "vRECFEC");
            GX_FocusControl = edtavRecfec_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            AV51RecFec = GXutil.nullDate() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51RecFec", localUtil.format(AV51RecFec, "99/99/99"));
         }
         else
         {
            AV51RecFec = localUtil.ctod( httpContext.cgiGet( edtavRecfec_Internalname), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt"))) ;
            httpContext.ajax_rsp_assign_attri("", false, "AV51RecFec", localUtil.format(AV51RecFec, "99/99/99"));
         }
         AV47CCStkHor = httpContext.cgiGet( edtavCcstkhor_Internalname) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV47CCStkHor", AV47CCStkHor);
         /* Read subfile selected row values. */
         nGXsfl_52_idx = (int)(localUtil.cton( httpContext.cgiGet( subGrid_Internalname+"_ROW"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
         if ( nGXsfl_52_idx > 0 )
         {
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
               GX_FocusControl = edtavRecexirea_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV56RecExiRea = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV56RecExiRea, 12, 4));
            }
            else
            {
               AV56RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV56RecExiRea, 12, 4));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
               GX_FocusControl = edtavDifer_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV57Difer = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV57Difer, 12, 4));
            }
            else
            {
               AV57Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV57Difer, 12, 4));
            }
            A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIRCC");
               GX_FocusControl = edtavRecexircc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV62RecExiRcc = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV62RecExiRcc, 12, 4));
            }
            else
            {
               AV62RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV62RecExiRcc, 12, 4));
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERCC");
               GX_FocusControl = edtavDifercc_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               wbErr = true ;
               AV76DiferCC = DecimalUtil.ZERO ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV76DiferCC, 12, 4));
            }
            else
            {
               AV76DiferCC = localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)) ;
               httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV76DiferCC, 12, 4));
            }
            AV58RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV58RecLot);
         }
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         /* Check if conditions changed and reset current page numbers */
         if ( !( GXutil.dateCompare(GXutil.resetTime(localUtil.ctod( httpContext.cgiGet( "GXH_vRECFEC"), localUtil.mapDateFormat( httpContext.getLanguageProperty( "date_fmt")))), GXutil.resetTime(AV51RecFec)) ) )
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
      e18TO2 ();
      if (returnInSub) return;
   }

   public void e18TO2( )
   {
      /* Start Routine */
      returnInSub = false ;
      GXt_char1 = AV52Station ;
      GXv_char2[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char2) ;
      webwconreinfinite_impl.this.GXt_char1 = GXv_char2[0] ;
      AV52Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Station", AV52Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Station, ""))));
      GXv_char2[0] = AV53EmprCod ;
      GXv_char3[0] = AV54EmprNom ;
      GXv_char4[0] = AV55UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV52Station, GXv_char2, GXv_char3, GXv_char4) ;
      webwconreinfinite_impl.this.AV53EmprCod = GXv_char2[0] ;
      webwconreinfinite_impl.this.AV54EmprNom = GXv_char3[0] ;
      webwconreinfinite_impl.this.AV55UsurCod = GXv_char4[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53EmprCod", AV53EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV55UsurCod", AV55UsurCod);
      GXt_int5 = AV115Val_stk ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int6) ;
      webwconreinfinite_impl.this.GXt_int5 = GXv_int6[0] ;
      AV115Val_stk = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV115Val_stk", GXutil.str( AV115Val_stk, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vVAL_STK", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV115Val_stk), "9")));
      GXt_int7 = AV101Precio_stk ;
      GXv_int8[0] = GXt_int7 ;
      new app.pbuscon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "VALSTK", ""), GXv_int8) ;
      webwconreinfinite_impl.this.GXt_int7 = GXv_int8[0] ;
      AV101Precio_stk = (byte)(GXt_int7) ;
      GXt_int5 = AV67Artextil ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "ARTEXT", ""), GXv_int6) ;
      webwconreinfinite_impl.this.GXt_int5 = GXv_int6[0] ;
      AV67Artextil = GXt_int5 ;
      GXt_int5 = AV91Intexco ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "INTEXC", ""), GXv_int6) ;
      webwconreinfinite_impl.this.GXt_int5 = GXv_int6[0] ;
      AV91Intexco = GXt_int5 ;
      GXt_int5 = AV95Nalmcc ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "NALMCC", ""), GXv_int6) ;
      webwconreinfinite_impl.this.GXt_int5 = GXv_int6[0] ;
      AV95Nalmcc = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV95Nalmcc", GXutil.str( AV95Nalmcc, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vNALMCC", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV95Nalmcc), "9")));
      GXt_int5 = AV113Ubicacion ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "LOCPRD", ""), GXv_int6) ;
      webwconreinfinite_impl.this.GXt_int5 = GXv_int6[0] ;
      AV113Ubicacion = GXt_int5 ;
      GXv_int6[0] = AV88FlagCcs ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "CCSTKS", ""), GXv_int6) ;
      webwconreinfinite_impl.this.AV88FlagCcs = GXv_int6[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV88FlagCcs", GXutil.str( AV88FlagCcs, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCS", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV88FlagCcs), "9")));
      GXt_int5 = AV89FlagPreMed ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "PREMED", ""), GXv_int6) ;
      webwconreinfinite_impl.this.GXt_int5 = GXv_int6[0] ;
      AV89FlagPreMed = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV89FlagPreMed", GXutil.str( AV89FlagPreMed, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGPREMED", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV89FlagPreMed), "9")));
      GXt_int5 = AV87FlagCColor ;
      GXv_int6[0] = GXt_int5 ;
      new app.pexicon(remoteHandle, context).execute( AV53EmprCod, httpContext.getMessage( "10002E", ""), GXv_int6) ;
      webwconreinfinite_impl.this.GXt_int5 = GXv_int6[0] ;
      AV87FlagCColor = GXt_int5 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV87FlagCColor", GXutil.str( AV87FlagCColor, 1, 0));
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vFLAGCCOLOR", getSecureSignedToken( "", localUtil.format( DecimalUtil.doubleToDec(AV87FlagCColor), "9")));
      edtRecExiTcc_Visible = (((AV87FlagCColor==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavRecexircc_Visible = (((AV87FlagCColor==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecexircc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecexircc_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavDifercc_Visible = (((AV87FlagCColor==1) ? true : false) ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Visible), 5, 0), !bGXsfl_52_Refreshing);
      /* Execute user subroutine: 'LASTRECUEN' */
      S112 ();
      if (returnInSub) return;
      GXt_char1 = AV52Station ;
      GXv_char4[0] = GXt_char1 ;
      new app.obtenerwrkst(remoteHandle, context).execute( GXv_char4) ;
      webwconreinfinite_impl.this.GXt_char1 = GXv_char4[0] ;
      AV52Station = GXt_char1 ;
      httpContext.ajax_rsp_assign_attri("", false, "AV52Station", AV52Station);
      app.GxWebStd.gx_hidden_field( httpContext, "gxhash_vSTATION", getSecureSignedToken( "", GXutil.rtrim( localUtil.format( AV52Station, ""))));
      GXv_char4[0] = AV53EmprCod ;
      GXv_char3[0] = AV54EmprNom ;
      GXv_char2[0] = AV55UsurCod ;
      new app.pbusemp(remoteHandle, context).execute( AV52Station, GXv_char4, GXv_char3, GXv_char2) ;
      webwconreinfinite_impl.this.AV53EmprCod = GXv_char4[0] ;
      webwconreinfinite_impl.this.AV54EmprNom = GXv_char3[0] ;
      webwconreinfinite_impl.this.AV55UsurCod = GXv_char2[0] ;
      httpContext.ajax_rsp_assign_attri("", false, "AV53EmprCod", AV53EmprCod);
      httpContext.ajax_rsp_assign_attri("", false, "AV55UsurCod", AV55UsurCod);
      subGrid_Rows = 50 ;
      app.GxWebStd.gx_hidden_field( httpContext, "GRID_Rows", GXutil.ltrim( localUtil.ntoc( subGrid_Rows, (byte)(6), (byte)(0), ".", "")));
      Grid_empowerer_Gridinternalname = subGrid_Internalname ;
      ucGrid_empowerer.sendProperty(context, "", false, Grid_empowerer_Internalname, "GridInternalName", Grid_empowerer_Gridinternalname);
      Ddo_gridcolumnsselector_Gridinternalname = subGrid_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "GridInternalName", Ddo_gridcolumnsselector_Gridinternalname);
      Ddo_grid_Gridinternalname = subGrid_Internalname ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "GridInternalName", Ddo_grid_Gridinternalname);
      Form.setCaption( httpContext.getMessage( "Entrada Inventario", "") );
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Caption", Form.getCaption(), true);
      /* Execute user subroutine: 'PREPARETRANSACTION' */
      S122 ();
      if (returnInSub) return;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      if ( AV13OrderedBy < 1 )
      {
         AV13OrderedBy = (short)(1) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
      }
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = AV46DDO_TitleSettingsIcons;
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      new app.wwpbaseobjects.getwwptitlesettingsicons(remoteHandle, context).execute( GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10) ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[0] ;
      AV46DDO_TitleSettingsIcons = GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = bttBtneditcolumns_Internalname ;
      ucDdo_gridcolumnsselector.sendProperty(context, "", false, Ddo_gridcolumnsselector_Internalname, "TitleControlIdToReplace", Ddo_gridcolumnsselector_Titlecontrolidtoreplace);
   }

   public void e19TO2( )
   {
      if ( gx_refresh_fired )
      {
         return  ;
      }
      gx_refresh_fired = true ;
      /* Refresh Routine */
      returnInSub = false ;
      GXv_SdtWWPContext11[0] = AV6WWPContext;
      new app.wwpbaseobjects.loadwwpcontext(remoteHandle, context).execute( GXv_SdtWWPContext11) ;
      AV6WWPContext = GXv_SdtWWPContext11[0] ;
      /* Execute user subroutine: 'SAVEGRIDSTATE' */
      S152 ();
      if (returnInSub) return;
      if ( GXutil.strcmp(AV35Session.getValue("WebWConreInfiniteColumnsSelector"), "") != 0 )
      {
         AV31ColumnsSelectorXML = AV35Session.getValue("WebWConreInfiniteColumnsSelector") ;
         AV33ColumnsSelector.fromxml(AV31ColumnsSelectorXML, null, null);
      }
      else
      {
         /* Execute user subroutine: 'INITIALIZECOLUMNSSELECTOR' */
         S162 ();
         if (returnInSub) return;
      }
      edtPrdNum_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+1)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNum_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNum_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtPrdNom_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+2)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtPrdNom_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtPrdNom_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtRecExiTeo_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+3)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTeo_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTeo_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavRecexirea_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+4)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecexirea_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecexirea_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavDifer_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+5)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifer_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifer_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtRecExiTcc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+6)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtRecExiTcc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtRecExiTcc_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavRecexircc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+7)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavRecexircc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavRecexircc_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavDifercc_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+8)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavDifercc_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavDifercc_Visible), 5, 0), !bGXsfl_52_Refreshing);
      edtavReclot_Visible = (((app.wwpbaseobjects.SdtWWPColumnsSelector_Column)AV33ColumnsSelector.getgxTv_SdtWWPColumnsSelector_Columns().elementAt(-1+9)).getgxTv_SdtWWPColumnsSelector_Column_Isvisible() ? 1 : 0) ;
      httpContext.ajax_rsp_assign_prop("", false, edtavReclot_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtavReclot_Visible), 5, 0), !bGXsfl_52_Refreshing);
      AV124Webwconreinfiniteds_1_tfprdnum = AV40TFPrdNum ;
      AV125Webwconreinfiniteds_2_tfprdnum_sel = AV41TFPrdNum_Sel ;
      AV126Webwconreinfiniteds_3_tfprdnom = AV43TFPrdNom ;
      AV127Webwconreinfiniteds_4_tfprdnom_sel = AV44TFPrdNom_Sel ;
      AV128Webwconreinfiniteds_5_tfrecexiteo = AV60TFRecExiTeo ;
      AV129Webwconreinfiniteds_6_tfrecexiteo_to = AV61TFRecExiTeo_To ;
      AV130Webwconreinfiniteds_7_tfrecexitcc = AV118TFRecExiTcc ;
      AV131Webwconreinfiniteds_8_tfrecexitcc_to = AV119TFRecExiTcc_To ;
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
   }

   public void e12TO2( )
   {
      /* Ddo_grid_Onoptionclicked Routine */
      returnInSub = false ;
      if ( ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderASC#>") == 0 ) || ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>") == 0 ) )
      {
         AV13OrderedBy = (short)(GXutil.lval( Ddo_grid_Selectedvalue_get)) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
         AV14OrderedDsc = ((GXutil.strcmp(Ddo_grid_Activeeventkey, "<#OrderDSC#>")==0) ? true : false) ;
         httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
         /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
         S142 ();
         if (returnInSub) return;
         subgrid_firstpage( ) ;
      }
      else if ( GXutil.strcmp(Ddo_grid_Activeeventkey, "<#Filter#>") == 0 )
      {
         if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNum") == 0 )
         {
            AV40TFPrdNum = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrdNum", AV40TFPrdNum);
            AV41TFPrdNum_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrdNum_Sel", AV41TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "PrdNom") == 0 )
         {
            AV43TFPrdNom = Ddo_grid_Filteredtext_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrdNom", AV43TFPrdNom);
            AV44TFPrdNom_Sel = Ddo_grid_Selectedvalue_get ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPrdNom_Sel", AV44TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiTeo") == 0 )
         {
            AV60TFRecExiTeo = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFRecExiTeo", GXutil.ltrimstr( AV60TFRecExiTeo, 12, 4));
            AV61TFRecExiTeo_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFRecExiTeo_To", GXutil.ltrimstr( AV61TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(Ddo_grid_Selectedcolumn, "RecExiTcc") == 0 )
         {
            AV118TFRecExiTcc = CommonUtil.decimalVal( Ddo_grid_Filteredtext_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118TFRecExiTcc", GXutil.ltrimstr( AV118TFRecExiTcc, 12, 4));
            AV119TFRecExiTcc_To = CommonUtil.decimalVal( Ddo_grid_Filteredtextto_get, ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFRecExiTcc_To", GXutil.ltrimstr( AV119TFRecExiTcc_To, 12, 4));
         }
         subgrid_firstpage( ) ;
      }
      /*  Sending Event outputs  */
   }

   private void e20TO2( )
   {
      if ( ( subGrid_Islastpage == 1 ) || ( subGrid_Rows == 0 ) || ( ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage ) && ( GRID_nCurrentRecord < GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) ) ) )
      {
         /* Grid_Load Routine */
         returnInSub = false ;
         AV56RecExiRea = ((A11624RecMemCant==1) ? A807RecExiRea : ((DecimalUtil.compareTo(DecimalUtil.ZERO, A807RecExiRea)==0) ? A809RecExiTeo : A807RecExiRea)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV56RecExiRea, 12, 4));
         AV57Difer = A809RecExiTeo.subtract(AV56RecExiRea) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV57Difer, 12, 4));
         AV62RecExiRcc = ((A11624RecMemCant==1) ? A806RecExiRcc : ((DecimalUtil.compareTo(DecimalUtil.ZERO, A806RecExiRcc)==0) ? A808RecExiTcc : A806RecExiRcc)) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV62RecExiRcc, 12, 4));
         AV76DiferCC = A808RecExiTcc.subtract(AV62RecExiRcc) ;
         httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV76DiferCC, 12, 4));
         AV58RecLot = A12285RecLot ;
         httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV58RecLot);
         /* Load Method */
         if ( wbStart != -1 )
         {
            wbStart = (short)(52) ;
         }
         sendrow_522( ) ;
         GRID_nEOF = (byte)(1) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
         if ( ( subGrid_Islastpage == 1 ) && ( ((int)((GRID_nCurrentRecord) % (subgrid_fnc_recordsperpage( )))) == 0 ) )
         {
            GRID_nFirstRecordOnPage = GRID_nCurrentRecord ;
         }
      }
      if ( GRID_nCurrentRecord >= GRID_nFirstRecordOnPage + subgrid_fnc_recordsperpage( ) )
      {
         GRID_nEOF = (byte)(0) ;
         app.GxWebStd.gx_hidden_field( httpContext, "GRID_nEOF", GXutil.ltrim( localUtil.ntoc( GRID_nEOF, (byte)(1), (byte)(0), ".", "")));
      }
      GRID_nCurrentRecord = (long)(GRID_nCurrentRecord+1) ;
      if ( isFullAjaxMode( ) && ! bGXsfl_52_Refreshing )
      {
         httpContext.doAjaxLoad(52, GridRow);
      }
      /*  Sending Event outputs  */
   }

   public void e13TO2( )
   {
      /* Ddo_gridcolumnsselector_Oncolumnschanged Routine */
      returnInSub = false ;
      AV31ColumnsSelectorXML = Ddo_gridcolumnsselector_Columnsselectorvalues ;
      AV33ColumnsSelector.fromJSonString(AV31ColumnsSelectorXML, null);
      new app.wwpbaseobjects.savecolumnsselectorstate(remoteHandle, context).execute( "WebWConreInfiniteColumnsSelector", ((GXutil.strcmp("", AV31ColumnsSelectorXML)==0) ? "" : AV33ColumnsSelector.toxml(false, true, "WWPColumnsSelector", "TexplusNET"))) ;
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
   }

   public void e15TO2( )
   {
      /* 'DoMemorizarCantReal' Routine */
      returnInSub = false ;
      /* Start For Each Line */
      nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
      nGXsfl_52_fel_idx = 0 ;
      while ( nGXsfl_52_fel_idx < nRC_GXsfl_52 )
      {
         nGXsfl_52_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_fel_idx+1) ;
         sGXsfl_52_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_fel_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_fel_522( ) ;
         A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
         A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
         A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
            GX_FocusControl = edtavRecexirea_Internalname ;
            wbErr = true ;
            AV56RecExiRea = DecimalUtil.ZERO ;
         }
         else
         {
            AV56RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
            GX_FocusControl = edtavDifer_Internalname ;
            wbErr = true ;
            AV57Difer = DecimalUtil.ZERO ;
         }
         else
         {
            AV57Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
         }
         A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIRCC");
            GX_FocusControl = edtavRecexircc_Internalname ;
            wbErr = true ;
            AV62RecExiRcc = DecimalUtil.ZERO ;
         }
         else
         {
            AV62RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)) ;
         }
         if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERCC");
            GX_FocusControl = edtavDifercc_Internalname ;
            wbErr = true ;
            AV76DiferCC = DecimalUtil.ZERO ;
         }
         else
         {
            AV76DiferCC = localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)) ;
         }
         AV58RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
         GXv_char4[0] = A396EmprCod ;
         GXv_char3[0] = A719PrdNum ;
         GXv_date12[0] = AV51RecFec ;
         GXv_decimal13[0] = AV56RecExiRea ;
         GXv_decimal14[0] = AV62RecExiRcc ;
         GXv_decimal15[0] = DecimalUtil.doubleToDec(0) ;
         GXv_dtime16[0] = AV49Recfechr ;
         GXv_char2[0] = " " ;
         new app.pmemocant(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date12, GXv_decimal13, GXv_decimal14, GXv_decimal15, GXv_dtime16, GXv_char2) ;
         webwconreinfinite_impl.this.A396EmprCod = GXv_char4[0] ;
         webwconreinfinite_impl.this.A719PrdNum = GXv_char3[0] ;
         webwconreinfinite_impl.this.AV51RecFec = GXv_date12[0] ;
         webwconreinfinite_impl.this.AV56RecExiRea = GXv_decimal13[0] ;
         webwconreinfinite_impl.this.AV62RecExiRcc = GXv_decimal14[0] ;
         webwconreinfinite_impl.this.AV49Recfechr = GXv_dtime16[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
         httpContext.ajax_rsp_assign_attri("", false, "AV51RecFec", localUtil.format(AV51RecFec, "99/99/99"));
         httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV56RecExiRea, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV62RecExiRcc, 12, 4));
         httpContext.ajax_rsp_assign_attri("", false, "AV49Recfechr", localUtil.ttoc( AV49Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         /* End For Each Line */
      }
      if ( nGXsfl_52_fel_idx == 0 )
      {
         nGXsfl_52_idx = 1 ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      nGXsfl_52_fel_idx = 1 ;
      GX_FocusControl = edtavRecfec_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      httpContext.doAjaxSetFocus(GX_FocusControl);
      httpContext.doAjaxRefresh();
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
   }

   public void e14TO2( )
   {
      /* Dvelop_confirmpanel_btnconfirmar_Close Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(Dvelop_confirmpanel_btnconfirmar_Result, "Yes") == 0 )
      {
         AV66Inc_obs = httpContext.getMessage( "Inicio Actualizacion RECUENTO", "") ;
         new app.pctrinc(remoteHandle, context).execute( AV53EmprCod, GXutil.substring( AV133Pgmname, 1, 10), AV55UsurCod, AV52Station, AV66Inc_obs, 99999999, (byte)(0), " ") ;
         /* Start For Each Line */
         nRC_GXsfl_52 = (int)(localUtil.ctol( httpContext.cgiGet( "nRC_GXsfl_52"), httpContext.getLanguageProperty( "decimal_point"), httpContext.getLanguageProperty( "thousand_sep"))) ;
         nGXsfl_52_fel_idx = 0 ;
         while ( nGXsfl_52_fel_idx < nRC_GXsfl_52 )
         {
            nGXsfl_52_fel_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_fel_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_fel_idx+1) ;
            sGXsfl_52_fel_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_fel_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_fel_522( ) ;
            A719PrdNum = httpContext.cgiGet( edtPrdNum_Internalname) ;
            A718PrdNom = httpContext.cgiGet( edtPrdNom_Internalname) ;
            A809RecExiTeo = localUtil.ctond( httpContext.cgiGet( edtRecExiTeo_Internalname)) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIREA");
               GX_FocusControl = edtavRecexirea_Internalname ;
               wbErr = true ;
               AV56RecExiRea = DecimalUtil.ZERO ;
            }
            else
            {
               AV56RecExiRea = localUtil.ctond( httpContext.cgiGet( edtavRecexirea_Internalname)) ;
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFER");
               GX_FocusControl = edtavDifer_Internalname ;
               wbErr = true ;
               AV57Difer = DecimalUtil.ZERO ;
            }
            else
            {
               AV57Difer = localUtil.ctond( httpContext.cgiGet( edtavDifer_Internalname)) ;
            }
            A808RecExiTcc = localUtil.ctond( httpContext.cgiGet( edtRecExiTcc_Internalname)) ;
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vRECEXIRCC");
               GX_FocusControl = edtavRecexircc_Internalname ;
               wbErr = true ;
               AV62RecExiRcc = DecimalUtil.ZERO ;
            }
            else
            {
               AV62RecExiRcc = localUtil.ctond( httpContext.cgiGet( edtavRecexircc_Internalname)) ;
            }
            if ( ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("-999999.9999")) < 0 ) ) || ( ( DecimalUtil.compareTo(localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)), DecimalUtil.stringToDec("9999999.9999")) > 0 ) ) )
            {
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "vDIFERCC");
               GX_FocusControl = edtavDifercc_Internalname ;
               wbErr = true ;
               AV76DiferCC = DecimalUtil.ZERO ;
            }
            else
            {
               AV76DiferCC = localUtil.ctond( httpContext.cgiGet( edtavDifercc_Internalname)) ;
            }
            AV58RecLot = httpContext.cgiGet( edtavReclot_Internalname) ;
            AV100Precio_mov = ((AV89FlagPreMed==1) ? A726PrdPreMed : A724PrdPreAct) ;
            AV112TotDet = DecimalUtil.doubleToDec(0) ;
            AV57Difer = A809RecExiTeo.subtract(AV56RecExiRea) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV57Difer, 12, 4));
            AV76DiferCC = A808RecExiTcc.subtract(AV62RecExiRcc) ;
            httpContext.ajax_rsp_assign_attri("", false, edtavDifercc_Internalname, GXutil.ltrimstr( AV76DiferCC, 12, 4));
            if ( AV57Difer.doubleValue() != 0 )
            {
               GXv_char4[0] = A396EmprCod ;
               GXv_char3[0] = A719PrdNum ;
               GXv_decimal15[0] = AV57Difer ;
               GXv_date12[0] = AV51RecFec ;
               new app.pmodrem(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_decimal15, GXv_date12) ;
               webwconreinfinite_impl.this.A396EmprCod = GXv_char4[0] ;
               webwconreinfinite_impl.this.A719PrdNum = GXv_char3[0] ;
               webwconreinfinite_impl.this.AV57Difer = GXv_decimal15[0] ;
               webwconreinfinite_impl.this.AV51RecFec = GXv_date12[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, edtavDifer_Internalname, GXutil.ltrimstr( AV57Difer, 12, 4));
               httpContext.ajax_rsp_assign_attri("", false, "AV51RecFec", localUtil.format(AV51RecFec, "99/99/99"));
            }
            GXv_char4[0] = A396EmprCod ;
            GXv_char3[0] = A719PrdNum ;
            GXv_date12[0] = AV51RecFec ;
            GXv_decimal15[0] = AV56RecExiRea ;
            GXv_decimal14[0] = AV62RecExiRcc ;
            GXv_decimal13[0] = AV100Precio_mov ;
            GXv_dtime16[0] = AV49Recfechr ;
            GXv_char2[0] = " " ;
            GXv_char17[0] = AV58RecLot ;
            GXv_char18[0] = AV107RecUbic ;
            new app.pmodexi2(remoteHandle, context).execute( GXv_char4, GXv_char3, GXv_date12, GXv_decimal15, GXv_decimal14, GXv_decimal13, GXv_dtime16, GXv_char2, GXv_char17, GXv_char18) ;
            webwconreinfinite_impl.this.A396EmprCod = GXv_char4[0] ;
            webwconreinfinite_impl.this.A719PrdNum = GXv_char3[0] ;
            webwconreinfinite_impl.this.AV51RecFec = GXv_date12[0] ;
            webwconreinfinite_impl.this.AV56RecExiRea = GXv_decimal15[0] ;
            webwconreinfinite_impl.this.AV62RecExiRcc = GXv_decimal14[0] ;
            webwconreinfinite_impl.this.AV100Precio_mov = GXv_decimal13[0] ;
            webwconreinfinite_impl.this.AV49Recfechr = GXv_dtime16[0] ;
            webwconreinfinite_impl.this.AV58RecLot = GXv_char17[0] ;
            webwconreinfinite_impl.this.AV107RecUbic = GXv_char18[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            httpContext.ajax_rsp_assign_attri("", false, "AV51RecFec", localUtil.format(AV51RecFec, "99/99/99"));
            httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV56RecExiRea, 12, 4));
            httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV62RecExiRcc, 12, 4));
            httpContext.ajax_rsp_assign_attri("", false, "AV49Recfechr", localUtil.ttoc( AV49Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
            httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV58RecLot);
            httpContext.ajax_rsp_assign_attri("", false, "AV107RecUbic", AV107RecUbic);
            if ( AV88FlagCcs == 1 )
            {
               AV83Fecha = GXutil.today( ) ;
               if ( AV57Difer.doubleValue() < 0 )
               {
                  AV71CCStkCanE = AV57Difer.negate() ;
                  AV72CCStkCanS = DecimalUtil.doubleToDec(0) ;
               }
               else
               {
                  AV71CCStkCanE = DecimalUtil.doubleToDec(0) ;
                  AV72CCStkCanS = AV57Difer ;
               }
               GXv_char18[0] = A396EmprCod ;
               GXv_char17[0] = A719PrdNum ;
               GXv_decimal15[0] = AV71CCStkCanE ;
               GXv_decimal14[0] = AV72CCStkCanS ;
               GXv_char4[0] = httpContext.getMessage( "SR", "") ;
               GXv_char3[0] = "1" ;
               GXv_decimal13[0] = AV100Precio_mov ;
               GXv_int8[0] = 0 ;
               GXv_int6[0] = (byte)(0) ;
               GXv_char2[0] = " " ;
               GXv_int19[0] = 0 ;
               GXv_char20[0] = " " ;
               GXv_char21[0] = AV55UsurCod ;
               GXv_char22[0] = httpContext.getMessage( "Recuento de Almacen", "") ;
               GXv_int23[0] = (short)(0) ;
               GXv_decimal24[0] = DecimalUtil.doubleToDec(0) ;
               GXv_decimal25[0] = DecimalUtil.doubleToDec(0) ;
               GXv_date12[0] = AV63Fecrec ;
               GXv_char26[0] = AV58RecLot ;
               GXv_char27[0] = AV47CCStkHor ;
               new app.precccstks(remoteHandle, context).execute( GXv_char18, GXv_char17, GXv_decimal15, GXv_decimal14, GXv_char4, GXv_char3, GXv_decimal13, GXv_int8, GXv_int6, GXv_char2, GXv_int19, GXv_char20, GXv_char21, GXv_char22, GXv_int23, GXv_decimal24, GXv_decimal25, GXv_date12, GXv_char26, GXv_char27) ;
               webwconreinfinite_impl.this.A396EmprCod = GXv_char18[0] ;
               webwconreinfinite_impl.this.A719PrdNum = GXv_char17[0] ;
               webwconreinfinite_impl.this.AV71CCStkCanE = GXv_decimal15[0] ;
               webwconreinfinite_impl.this.AV72CCStkCanS = GXv_decimal14[0] ;
               webwconreinfinite_impl.this.AV100Precio_mov = GXv_decimal13[0] ;
               webwconreinfinite_impl.this.AV55UsurCod = GXv_char21[0] ;
               webwconreinfinite_impl.this.AV63Fecrec = GXv_date12[0] ;
               webwconreinfinite_impl.this.AV58RecLot = GXv_char26[0] ;
               webwconreinfinite_impl.this.AV47CCStkHor = GXv_char27[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV55UsurCod", AV55UsurCod);
               httpContext.ajax_rsp_assign_attri("", false, "AV63Fecrec", localUtil.format(AV63Fecrec, "99/99/99"));
               httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV58RecLot);
               httpContext.ajax_rsp_assign_attri("", false, "AV47CCStkHor", AV47CCStkHor);
               if ( AV87FlagCColor == 1 )
               {
                  if ( AV76DiferCC.doubleValue() < 0 )
                  {
                     AV71CCStkCanE = AV76DiferCC.negate() ;
                     AV72CCStkCanS = DecimalUtil.doubleToDec(0) ;
                  }
                  else
                  {
                     AV71CCStkCanE = DecimalUtil.doubleToDec(0) ;
                     AV72CCStkCanS = AV76DiferCC ;
                  }
                  GXv_char27[0] = A396EmprCod ;
                  GXv_char26[0] = A719PrdNum ;
                  GXv_decimal25[0] = AV71CCStkCanE ;
                  GXv_decimal24[0] = AV72CCStkCanS ;
                  GXv_char22[0] = httpContext.getMessage( "SR", "") ;
                  GXv_char21[0] = "1" ;
                  GXv_decimal15[0] = AV100Precio_mov ;
                  GXv_int19[0] = 0 ;
                  GXv_int6[0] = (byte)(0) ;
                  GXv_char20[0] = " " ;
                  GXv_int8[0] = 0 ;
                  GXv_char18[0] = " " ;
                  GXv_char17[0] = AV55UsurCod ;
                  GXv_char4[0] = httpContext.getMessage( "Recuento de CC", "") ;
                  GXv_int23[0] = (short)(0) ;
                  GXv_decimal14[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_decimal13[0] = DecimalUtil.doubleToDec(0) ;
                  GXv_date12[0] = AV51RecFec ;
                  GXv_char3[0] = AV58RecLot ;
                  GXv_char2[0] = AV47CCStkHor ;
                  new app.precccstks(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_decimal24, GXv_char22, GXv_char21, GXv_decimal15, GXv_int19, GXv_int6, GXv_char20, GXv_int8, GXv_char18, GXv_char17, GXv_char4, GXv_int23, GXv_decimal14, GXv_decimal13, GXv_date12, GXv_char3, GXv_char2) ;
                  webwconreinfinite_impl.this.A396EmprCod = GXv_char27[0] ;
                  webwconreinfinite_impl.this.A719PrdNum = GXv_char26[0] ;
                  webwconreinfinite_impl.this.AV71CCStkCanE = GXv_decimal25[0] ;
                  webwconreinfinite_impl.this.AV72CCStkCanS = GXv_decimal24[0] ;
                  webwconreinfinite_impl.this.AV100Precio_mov = GXv_decimal15[0] ;
                  webwconreinfinite_impl.this.AV55UsurCod = GXv_char17[0] ;
                  webwconreinfinite_impl.this.AV51RecFec = GXv_date12[0] ;
                  webwconreinfinite_impl.this.AV58RecLot = GXv_char3[0] ;
                  webwconreinfinite_impl.this.AV47CCStkHor = GXv_char2[0] ;
                  httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV55UsurCod", AV55UsurCod);
                  httpContext.ajax_rsp_assign_attri("", false, "AV51RecFec", localUtil.format(AV51RecFec, "99/99/99"));
                  httpContext.ajax_rsp_assign_attri("", false, edtavReclot_Internalname, AV58RecLot);
                  httpContext.ajax_rsp_assign_attri("", false, "AV47CCStkHor", AV47CCStkHor);
                  if ( AV95Nalmcc == 1 )
                  {
                     GXv_char27[0] = A396EmprCod ;
                     GXv_char26[0] = A719PrdNum ;
                     GXv_decimal25[0] = AV62RecExiRcc ;
                     GXv_char22[0] = httpContext.getMessage( "SR", "") ;
                     GXv_decimal24[0] = AV100Precio_mov ;
                     GXv_char21[0] = AV55UsurCod ;
                     GXv_char20[0] = httpContext.getMessage( "Recuento de CC p/Almacenes", "") ;
                     GXv_date12[0] = AV51RecFec ;
                     GXv_dtime16[0] = AV49Recfechr ;
                     new app.pccalm1(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_char22, GXv_decimal24, GXv_char21, GXv_char20, GXv_date12, GXv_dtime16) ;
                     webwconreinfinite_impl.this.A396EmprCod = GXv_char27[0] ;
                     webwconreinfinite_impl.this.A719PrdNum = GXv_char26[0] ;
                     webwconreinfinite_impl.this.AV62RecExiRcc = GXv_decimal25[0] ;
                     webwconreinfinite_impl.this.AV100Precio_mov = GXv_decimal24[0] ;
                     webwconreinfinite_impl.this.AV55UsurCod = GXv_char21[0] ;
                     webwconreinfinite_impl.this.AV51RecFec = GXv_date12[0] ;
                     webwconreinfinite_impl.this.AV49Recfechr = GXv_dtime16[0] ;
                     httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
                     httpContext.ajax_rsp_assign_attri("", false, edtavRecexircc_Internalname, GXutil.ltrimstr( AV62RecExiRcc, 12, 4));
                     httpContext.ajax_rsp_assign_attri("", false, "AV55UsurCod", AV55UsurCod);
                     httpContext.ajax_rsp_assign_attri("", false, "AV51RecFec", localUtil.format(AV51RecFec, "99/99/99"));
                     httpContext.ajax_rsp_assign_attri("", false, "AV49Recfechr", localUtil.ttoc( AV49Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
                  }
               }
            }
            if ( AV115Val_stk == 0 )
            {
               GXv_char27[0] = A396EmprCod ;
               GXv_char26[0] = A719PrdNum ;
               new app.pstm017(remoteHandle, context).execute( GXv_char27, GXv_char26) ;
               webwconreinfinite_impl.this.A396EmprCod = GXv_char27[0] ;
               webwconreinfinite_impl.this.A719PrdNum = GXv_char26[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
            }
            else
            {
               GXv_char27[0] = A396EmprCod ;
               GXv_char26[0] = A719PrdNum ;
               GXv_decimal25[0] = AV56RecExiRea ;
               GXv_decimal24[0] = AV100Precio_mov ;
               new app.pvalstksr(remoteHandle, context).execute( GXv_char27, GXv_char26, GXv_decimal25, GXv_decimal24) ;
               webwconreinfinite_impl.this.A396EmprCod = GXv_char27[0] ;
               webwconreinfinite_impl.this.A719PrdNum = GXv_char26[0] ;
               webwconreinfinite_impl.this.AV56RecExiRea = GXv_decimal25[0] ;
               webwconreinfinite_impl.this.AV100Precio_mov = GXv_decimal24[0] ;
               httpContext.ajax_rsp_assign_attri("", false, "A396EmprCod", A396EmprCod);
               httpContext.ajax_rsp_assign_attri("", false, edtavRecexirea_Internalname, GXutil.ltrimstr( AV56RecExiRea, 12, 4));
            }
            /* End For Each Line */
         }
         if ( nGXsfl_52_fel_idx == 0 )
         {
            nGXsfl_52_idx = 1 ;
            sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
            subsflControlProps_522( ) ;
         }
         nGXsfl_52_fel_idx = 1 ;
         AV66Inc_obs = httpContext.getMessage( "Fin Actualizacion RECUENTO", "") ;
         new app.pctrinc(remoteHandle, context).execute( AV53EmprCod, GXutil.substring( AV133Pgmname, 1, 10), AV55UsurCod, AV52Station, AV66Inc_obs, 99999999, (byte)(0), " ") ;
         GXv_char27[0] = AV53EmprCod ;
         new app.pinvprd(remoteHandle, context).execute( GXv_char27) ;
         webwconreinfinite_impl.this.AV53EmprCod = GXv_char27[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "AV53EmprCod", AV53EmprCod);
         GRID_nFirstRecordOnPage = 0 ;
         GRID_nCurrentRecord = 0 ;
         GXCCtl = "GRID_nFirstRecordOnPage_" + sGXsfl_52_idx ;
         app.GxWebStd.gx_hidden_field( httpContext, GXCCtl, GXutil.ltrim( localUtil.ntoc( GRID_nFirstRecordOnPage, (byte)(15), (byte)(0), ".", "")));
         gxgrgrid_refresh( subGrid_Rows, AV51RecFec, AV53EmprCod, AV33ColumnsSelector, AV40TFPrdNum, AV41TFPrdNum_Sel, AV43TFPrdNom, AV44TFPrdNom_Sel, AV60TFRecExiTeo, AV61TFRecExiTeo_To, AV118TFRecExiTcc, AV119TFRecExiTcc_To, AV133Pgmname, AV13OrderedBy, AV14OrderedDsc, AV52Station, AV89FlagPreMed, AV88FlagCcs, AV87FlagCColor, AV95Nalmcc, AV115Val_stk) ;
      }
      /*  Sending Event outputs  */
      httpContext.ajax_rsp_assign_sdt_attri("", false, "AV33ColumnsSelector", AV33ColumnsSelector);
   }

   public void e16TO2( )
   {
      /* 'DoExport' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      GXv_char27[0] = AV29ExcelFilename ;
      GXv_char26[0] = AV30ErrorMessage ;
      new app.webwconreinfiniteexport(remoteHandle, context).execute( GXv_char27, GXv_char26) ;
      webwconreinfinite_impl.this.AV29ExcelFilename = GXv_char27[0] ;
      webwconreinfinite_impl.this.AV30ErrorMessage = GXv_char26[0] ;
      if ( GXutil.strcmp(AV29ExcelFilename, "") != 0 )
      {
         callWebObject(formatLink(AV29ExcelFilename, new String[] {}, new String[] {}) );
         httpContext.wjLocDisableFrm = (byte)(0) ;
      }
      else
      {
         httpContext.GX_msglist.addItem(AV30ErrorMessage);
      }
      /*  Sending Event outputs  */
   }

   public void e17TO2( )
   {
      /* 'DoExportCSV' Routine */
      returnInSub = false ;
      /* Execute user subroutine: 'LOADGRIDSTATE' */
      S132 ();
      if (returnInSub) return;
      callWebObject(formatLink("app.webwconreinfiniteexportcsv", new String[] {}, new String[] {}) );
      httpContext.wjLocDisableFrm = (byte)(2) ;
      /*  Sending Event outputs  */
   }

   public void S142( )
   {
      /* 'SETDDOSORTEDSTATUS' Routine */
      returnInSub = false ;
      Ddo_grid_Sortedstatus = GXutil.trim( GXutil.str( AV13OrderedBy, 4, 0))+":"+(AV14OrderedDsc ? "DSC" : "ASC") ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SortedStatus", Ddo_grid_Sortedstatus);
   }

   public void S162( )
   {
      /* 'INITIALIZECOLUMNSSELECTOR' Routine */
      returnInSub = false ;
      AV33ColumnsSelector = (app.wwpbaseobjects.SdtWWPColumnsSelector)new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector28[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "PrdNum", "", "Producto", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "PrdNom", "", "Descripcion", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "RecExiTeo", "", "Cant Teorica", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "&RecExiRea", "", "Cant Real", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "&Difer", "", "Dif", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "RecExiTcc", "", "Cant Teo CC", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "&RecExiRcc", "", "Cant Real CC", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "&DiferCC", "", "Dif", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXv_SdtWWPColumnsSelector28[0] = AV33ColumnsSelector;
      new app.wwpbaseobjects.wwp_columnsselector_add(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, "&RecLot", "", "Lote", true, "") ;
      AV33ColumnsSelector = GXv_SdtWWPColumnsSelector28[0] ;
      GXt_char1 = AV32UserCustomValue ;
      GXv_char27[0] = GXt_char1 ;
      new app.wwpbaseobjects.loadcolumnsselectorstate(remoteHandle, context).execute( "WebWConreInfiniteColumnsSelector", GXv_char27) ;
      webwconreinfinite_impl.this.GXt_char1 = GXv_char27[0] ;
      AV32UserCustomValue = GXt_char1 ;
      if ( ! ( (GXutil.strcmp("", AV32UserCustomValue)==0) ) )
      {
         AV34ColumnsSelectorAux.fromxml(AV32UserCustomValue, null, null);
         GXv_SdtWWPColumnsSelector28[0] = AV34ColumnsSelectorAux;
         GXv_SdtWWPColumnsSelector29[0] = AV33ColumnsSelector;
         new app.wwpbaseobjects.wwp_columnselector_updatecolumns(remoteHandle, context).execute( GXv_SdtWWPColumnsSelector28, GXv_SdtWWPColumnsSelector29) ;
         AV34ColumnsSelectorAux = GXv_SdtWWPColumnsSelector28[0] ;
         AV33ColumnsSelector = GXv_SdtWWPColumnsSelector29[0] ;
      }
   }

   public void S132( )
   {
      /* 'LOADGRIDSTATE' Routine */
      returnInSub = false ;
      if ( GXutil.strcmp(AV35Session.getValue(AV133Pgmname+"GridState"), "") == 0 )
      {
         AV10GridState.fromxml(new app.wwpbaseobjects.loadgridstate(remoteHandle, context).executeUdp( AV133Pgmname+"GridState"), null, null);
      }
      else
      {
         AV10GridState.fromxml(AV35Session.getValue(AV133Pgmname+"GridState"), null, null);
      }
      AV13OrderedBy = AV10GridState.getgxTv_SdtWWPGridState_Orderedby() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV13OrderedBy", GXutil.ltrimstr( DecimalUtil.doubleToDec(AV13OrderedBy), 4, 0));
      AV14OrderedDsc = AV10GridState.getgxTv_SdtWWPGridState_Ordereddsc() ;
      httpContext.ajax_rsp_assign_attri("", false, "AV14OrderedDsc", AV14OrderedDsc);
      /* Execute user subroutine: 'SETDDOSORTEDSTATUS' */
      S142 ();
      if (returnInSub) return;
      AV135GXV1 = 1 ;
      while ( AV135GXV1 <= AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().size() )
      {
         AV11GridStateFilterValue = (app.wwpbaseobjects.SdtWWPGridState_FilterValue)((app.wwpbaseobjects.SdtWWPGridState_FilterValue)AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().elementAt(-1+AV135GXV1));
         if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM") == 0 )
         {
            AV40TFPrdNum = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV40TFPrdNum", AV40TFPrdNum);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNUM_SEL") == 0 )
         {
            AV41TFPrdNum_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV41TFPrdNum_Sel", AV41TFPrdNum_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM") == 0 )
         {
            AV43TFPrdNom = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV43TFPrdNom", AV43TFPrdNom);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFPRDNOM_SEL") == 0 )
         {
            AV44TFPrdNom_Sel = AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value() ;
            httpContext.ajax_rsp_assign_attri("", false, "AV44TFPrdNom_Sel", AV44TFPrdNom_Sel);
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITEO") == 0 )
         {
            AV60TFRecExiTeo = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV60TFRecExiTeo", GXutil.ltrimstr( AV60TFRecExiTeo, 12, 4));
            AV61TFRecExiTeo_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV61TFRecExiTeo_To", GXutil.ltrimstr( AV61TFRecExiTeo_To, 12, 4));
         }
         else if ( GXutil.strcmp(AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Name(), "TFRECEXITCC") == 0 )
         {
            AV118TFRecExiTcc = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Value(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV118TFRecExiTcc", GXutil.ltrimstr( AV118TFRecExiTcc, 12, 4));
            AV119TFRecExiTcc_To = CommonUtil.decimalVal( AV11GridStateFilterValue.getgxTv_SdtWWPGridState_FilterValue_Valueto(), ".") ;
            httpContext.ajax_rsp_assign_attri("", false, "AV119TFRecExiTcc_To", GXutil.ltrimstr( AV119TFRecExiTcc_To, 12, 4));
         }
         AV135GXV1 = (int)(AV135GXV1+1) ;
      }
      GXt_char1 = "" ;
      GXv_char27[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV41TFPrdNum_Sel)==0), AV41TFPrdNum_Sel, GXv_char27) ;
      webwconreinfinite_impl.this.GXt_char1 = GXv_char27[0] ;
      GXt_char30 = "" ;
      GXv_char26[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV44TFPrdNom_Sel)==0), AV44TFPrdNom_Sel, GXv_char26) ;
      webwconreinfinite_impl.this.GXt_char30 = GXv_char26[0] ;
      Ddo_grid_Selectedvalue_set = GXt_char1+"|"+GXt_char30+"|||||||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "SelectedValue_set", Ddo_grid_Selectedvalue_set);
      GXt_char30 = "" ;
      GXv_char27[0] = GXt_char30 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV40TFPrdNum)==0), AV40TFPrdNum, GXv_char27) ;
      webwconreinfinite_impl.this.GXt_char30 = GXv_char27[0] ;
      GXt_char1 = "" ;
      GXv_char26[0] = GXt_char1 ;
      new app.wwpbaseobjects.wwp_getfilterval(remoteHandle, context).execute( (GXutil.strcmp("", AV43TFPrdNom)==0), AV43TFPrdNom, GXv_char26) ;
      webwconreinfinite_impl.this.GXt_char1 = GXv_char26[0] ;
      Ddo_grid_Filteredtext_set = GXt_char30+"|"+GXt_char1+"|"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFRecExiTeo)==0) ? "" : GXutil.str( AV60TFRecExiTeo, 12, 4))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV118TFRecExiTcc)==0) ? "" : GXutil.str( AV118TFRecExiTcc, 12, 4))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredText_set", Ddo_grid_Filteredtext_set);
      Ddo_grid_Filteredtextto_set = "||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFRecExiTeo_To)==0) ? "" : GXutil.str( AV61TFRecExiTeo_To, 12, 4))+"|||"+((DecimalUtil.compareTo(DecimalUtil.ZERO, AV119TFRecExiTcc_To)==0) ? "" : GXutil.str( AV119TFRecExiTcc_To, 12, 4))+"|||" ;
      ucDdo_grid.sendProperty(context, "", false, Ddo_grid_Internalname, "FilteredTextTo_set", Ddo_grid_Filteredtextto_set);
   }

   public void S152( )
   {
      /* 'SAVEGRIDSTATE' Routine */
      returnInSub = false ;
      AV10GridState.fromxml(AV35Session.getValue(AV133Pgmname+"GridState"), null, null);
      AV10GridState.setgxTv_SdtWWPGridState_Orderedby( AV13OrderedBy );
      AV10GridState.setgxTv_SdtWWPGridState_Ordereddsc( AV14OrderedDsc );
      AV10GridState.getgxTv_SdtWWPGridState_Filtervalues().clear();
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFPRDNUM", "", !(GXutil.strcmp("", AV40TFPrdNum)==0), (short)(0), AV40TFPrdNum, "", !(GXutil.strcmp("", AV41TFPrdNum_Sel)==0), AV41TFPrdNum_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalueandsel(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFPRDNOM", "", !(GXutil.strcmp("", AV43TFPrdNom)==0), (short)(0), AV43TFPrdNom, "", !(GXutil.strcmp("", AV44TFPrdNom_Sel)==0), AV44TFPrdNom_Sel, "") ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFRECEXITEO", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV60TFRecExiTeo)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV61TFRecExiTeo_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV60TFRecExiTeo, 12, 4)), GXutil.trim( GXutil.str( AV61TFRecExiTeo_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      GXv_SdtWWPGridState31[0] = AV10GridState;
      new app.wwpbaseobjects.wwp_gridstateaddfiltervalue(remoteHandle, context).execute( GXv_SdtWWPGridState31, "TFRECEXITCC", "", !((DecimalUtil.compareTo(DecimalUtil.ZERO, AV118TFRecExiTcc)==0)&&(DecimalUtil.compareTo(DecimalUtil.ZERO, AV119TFRecExiTcc_To)==0)), (short)(0), GXutil.trim( GXutil.str( AV118TFRecExiTcc, 12, 4)), GXutil.trim( GXutil.str( AV119TFRecExiTcc_To, 12, 4))) ;
      AV10GridState = GXv_SdtWWPGridState31[0] ;
      new app.wwpbaseobjects.savegridstate(remoteHandle, context).execute( AV133Pgmname+"GridState", AV10GridState.toxml(false, true, "WWPGridState", "TexplusNET")) ;
   }

   public void S122( )
   {
      /* 'PREPARETRANSACTION' Routine */
      returnInSub = false ;
      AV8TrnContext = (app.wwpbaseobjects.SdtWWPTransactionContext)new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerobject( AV133Pgmname );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerondelete( true );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Callerurl( AV7HTTPRequest.getScriptName()+"?"+AV7HTTPRequest.getQuerystring() );
      AV8TrnContext.setgxTv_SdtWWPTransactionContext_Transactionname( "TRECUEN" );
      AV35Session.setValue("TrnContext", AV8TrnContext.toxml(false, true, "WWPTransactionContext", "TexplusNET"));
   }

   public void S112( )
   {
      /* 'LASTRECUEN' Routine */
      returnInSub = false ;
      AV50RecHora = GXutil.resetTime( GXutil.nullDate() );
      httpContext.ajax_rsp_assign_attri("", false, "AV50RecHora", localUtil.ttoc( AV50RecHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
      AV64Diahora = GXutil.serverNow( context, remoteHandle, pr_default) ;
      /* Using cursor H00TO4 */
      pr_default.execute(2, new Object[] {AV53EmprCod});
      while ( (pr_default.getStatus(2) != 101) )
      {
         A396EmprCod = H00TO4_A396EmprCod[0] ;
         A810RecFec = H00TO4_A810RecFec[0] ;
         A13416RecEstInv = H00TO4_A13416RecEstInv[0] ;
         A13455Rechora = H00TO4_A13455Rechora[0] ;
         AV51RecFec = A810RecFec ;
         httpContext.ajax_rsp_assign_attri("", false, "AV51RecFec", localUtil.format(AV51RecFec, "99/99/99"));
         AV50RecHora = A13455Rechora ;
         httpContext.ajax_rsp_assign_attri("", false, "AV50RecHora", localUtil.ttoc( AV50RecHora, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(2);
      }
      pr_default.close(2);
      AV48Invprd = (short)(0) ;
      /* Using cursor H00TO5 */
      pr_default.execute(3, new Object[] {AV53EmprCod});
      while ( (pr_default.getStatus(3) != 101) )
      {
         A396EmprCod = H00TO5_A396EmprCod[0] ;
         A8577RecFecHr = H00TO5_A8577RecFecHr[0] ;
         AV49Recfechr = A8577RecFecHr ;
         httpContext.ajax_rsp_assign_attri("", false, "AV49Recfechr", localUtil.ttoc( AV49Recfechr, 8, 5, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " "));
         AV48Invprd = (short)(1) ;
         /* Exit For each command. Update data (if necessary), close cursors & exit. */
         if (true) break;
         pr_default.readNext(3);
      }
      pr_default.close(3);
      AV47CCStkHor = (GXutil.dateCompare(GXutil.nullDate(), AV50RecHora) ? localUtil.ttoc( GXutil.serverNow( context, remoteHandle, pr_default), 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ") : localUtil.ttoc( AV50RecHora, 0, 8, ((GXutil.strcmp(httpContext.getLanguageProperty( "time_fmt"), "12")==0) ? 1 : 0), localUtil.mapDateTimeFormat( httpContext.getLanguageProperty( "date_fmt")), "/", ":", " ")) ;
      httpContext.ajax_rsp_assign_attri("", false, "AV47CCStkHor", AV47CCStkHor);
   }

   public void wb_table1_70_TO2( boolean wbgen )
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
         ucDvelop_confirmpanel_btnconfirmar.render(context, "dvelop.gxbootstrap.confirmpanel", Dvelop_confirmpanel_btnconfirmar_Internalname, "DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer");
         httpContext.writeText( "<div class=\"gx_usercontrol_child\" id=\""+"DVELOP_CONFIRMPANEL_BTNCONFIRMARContainer"+"Body"+"\" style=\"display:none;\">") ;
         httpContext.writeText( "</div>") ;
         httpContext.writeText( "</td>") ;
         httpContext.writeText( "</tr>") ;
         httpContext.writeText( "</tbody>") ;
         /* End of table */
         httpContext.writeText( "</table>") ;
         wb_table1_70_TO2e( true) ;
      }
      else
      {
         wb_table1_70_TO2e( false) ;
      }
   }

   @SuppressWarnings("unchecked")
   public void setparameters( Object[] obj )
   {
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
      paTO2( ) ;
      wsTO2( ) ;
      weTO2( ) ;
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
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202682116125117", true, true);
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
      httpContext.AddJavascriptSource("webwconreinfinite.js", "?202682116125117", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Panel/BootstrapPanelRender.js", "", false, true);
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
      httpContext.AddJavascriptSource("DVelop/Bootstrap/DropDownOptions/BootstrapDropDownOptionsRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/Shared/DVelopBootstrap.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Bootstrap/ConfirmPanel/BootstrapConfirmPanelRender.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/Shared/WorkWithPlusCommon.js", "", false, true);
      httpContext.AddJavascriptSource("DVelop/GridEmpowerer/GridEmpowererRender.js", "", false, true);
      /* End function include_jscripts */
   }

   public void subsflControlProps_522( )
   {
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_52_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_52_idx ;
      edtRecExiTeo_Internalname = "RECEXITEO_"+sGXsfl_52_idx ;
      edtavRecexirea_Internalname = "vRECEXIREA_"+sGXsfl_52_idx ;
      edtavDifer_Internalname = "vDIFER_"+sGXsfl_52_idx ;
      edtRecExiTcc_Internalname = "RECEXITCC_"+sGXsfl_52_idx ;
      edtavRecexircc_Internalname = "vRECEXIRCC_"+sGXsfl_52_idx ;
      edtavDifercc_Internalname = "vDIFERCC_"+sGXsfl_52_idx ;
      edtavReclot_Internalname = "vRECLOT_"+sGXsfl_52_idx ;
   }

   public void subsflControlProps_fel_522( )
   {
      edtPrdNum_Internalname = "PRDNUM_"+sGXsfl_52_fel_idx ;
      edtPrdNom_Internalname = "PRDNOM_"+sGXsfl_52_fel_idx ;
      edtRecExiTeo_Internalname = "RECEXITEO_"+sGXsfl_52_fel_idx ;
      edtavRecexirea_Internalname = "vRECEXIREA_"+sGXsfl_52_fel_idx ;
      edtavDifer_Internalname = "vDIFER_"+sGXsfl_52_fel_idx ;
      edtRecExiTcc_Internalname = "RECEXITCC_"+sGXsfl_52_fel_idx ;
      edtavRecexircc_Internalname = "vRECEXIRCC_"+sGXsfl_52_fel_idx ;
      edtavDifercc_Internalname = "vDIFERCC_"+sGXsfl_52_fel_idx ;
      edtavReclot_Internalname = "vRECLOT_"+sGXsfl_52_fel_idx ;
   }

   public void sendrow_522( )
   {
      subsflControlProps_522( ) ;
      wbTO0( ) ;
      if ( ( subGrid_Rows * 1 == 0 ) || ( nGXsfl_52_idx - GRID_nFirstRecordOnPage <= subgrid_fnc_recordsperpage( ) * 1 ) )
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
            if ( ((int)((nGXsfl_52_idx) % (2))) == 0 )
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
            httpContext.writeText( " gxrow=\""+sGXsfl_52_idx+"\">") ;
         }
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNum_Internalname,GXutil.rtrim( A719PrdNum),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNum_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn hidden-xs","",Integer.valueOf(edtPrdNum_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(6),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtPrdNom_Internalname,GXutil.rtrim( A718PrdNom),"","","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtPrdNom_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtPrdNom_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecExiTeo_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTeo_Internalname,GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A809RecExiTeo, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTeo_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecExiTeo_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecexirea_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecexirea_Enabled!=0)&&(edtavRecexirea_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 56,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecexirea_Internalname,GXutil.ltrim( localUtil.ntoc( AV56RecExiRea, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV56RecExiRea, "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavRecexirea_Enabled!=0)&&(edtavRecexirea_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,56);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecexirea_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecexirea_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDifer_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDifer_Enabled!=0)&&(edtavDifer_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 57,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifer_Internalname,GXutil.ltrim( localUtil.ntoc( AV57Difer, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifer_Enabled!=0) ? localUtil.format( AV57Difer, "ZZZZZZ9.9999") : localUtil.format( AV57Difer, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavDifer_Enabled!=0)&&(edtavDifer_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,57);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDifer_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDifer_Visible),Integer.valueOf(edtavDifer_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtRecExiTcc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtRecExiTcc_Internalname,GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( A808RecExiTcc, "ZZZZZZ9.9999")),"","'"+""+"'"+",false,"+"'"+""+"'","","","","",edtRecExiTcc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtRecExiTcc_Visible),Integer.valueOf(0),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavRecexircc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavRecexircc_Enabled!=0)&&(edtavRecexircc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 59,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavRecexircc_Internalname,GXutil.ltrim( localUtil.ntoc( AV62RecExiRcc, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( localUtil.format( AV62RecExiRcc, "ZZZZZZ9.9999")),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavRecexircc_Enabled!=0)&&(edtavRecexircc_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,59);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavRecexircc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavRecexircc_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"right"+"\""+" style=\""+((edtavDifercc_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavDifercc_Enabled!=0)&&(edtavDifercc_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 60,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavDifercc_Internalname,GXutil.ltrim( localUtil.ntoc( AV76DiferCC, (byte)(12), (byte)(4), httpContext.getLanguageProperty( "decimal_point"), "")),GXutil.ltrim( ((edtavDifercc_Enabled!=0) ? localUtil.format( AV76DiferCC, "ZZZZZZ9.9999") : localUtil.format( AV76DiferCC, "ZZZZZZ9.9999"))),TempTags+" onchange=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onchange(this, event)\" "+((edtavDifercc_Enabled!=0)&&(edtavDifercc_Visible!=0) ? " onblur=\""+"gx.num.valid_decimal( this, gx.thousandSeparator,gx.decimalPoint,'4');"+";gx.evt.onblur(this,60);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavDifercc_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavDifercc_Visible),Integer.valueOf(edtavDifercc_Enabled),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(12),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(0),Boolean.valueOf(true),"","right",Boolean.valueOf(false),""});
         /* Subfile cell */
         if ( GridContainer.GetWrapped() == 1 )
         {
            httpContext.writeText( "<td valign=\"middle\" align=\""+"left"+"\""+" style=\""+((edtavReclot_Visible==0) ? "display:none;" : "")+"\">") ;
         }
         /* Single line edit */
         TempTags = " " + ((edtavReclot_Enabled!=0)&&(edtavReclot_Visible!=0) ? " onfocus=\"gx.evt.onfocus(this, 61,'',false,'"+sGXsfl_52_idx+"',52)\"" : " ") ;
         ROClassString = "Attribute" ;
         GridRow.AddColumnProperties("edit", 1, isAjaxCallMode( ), new Object[] {edtavReclot_Internalname,GXutil.rtrim( AV58RecLot),"",TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+((edtavReclot_Enabled!=0)&&(edtavReclot_Visible!=0) ? " onblur=\""+""+";gx.evt.onblur(this,61);\"" : " "),"'"+""+"'"+",false,"+"'"+""+"'","","","","",edtavReclot_Jsonclick,Integer.valueOf(0),"Attribute","",ROClassString,"WWColumn","",Integer.valueOf(edtavReclot_Visible),Integer.valueOf(1),Integer.valueOf(0),"text","",Integer.valueOf(0),"px",Integer.valueOf(17),"px",Integer.valueOf(26),Integer.valueOf(0),Integer.valueOf(0),Integer.valueOf(52),Integer.valueOf(0),Integer.valueOf(-1),Integer.valueOf(-1),Boolean.valueOf(true),"","left",Boolean.valueOf(true),""});
         send_integrity_lvl_hashesTO2( ) ;
         GridContainer.AddRow(GridRow);
         nGXsfl_52_idx = ((subGrid_Islastpage==1)&&(nGXsfl_52_idx+1>subgrid_fnc_recordsperpage( )) ? 1 : nGXsfl_52_idx+1) ;
         sGXsfl_52_idx = GXutil.padl( GXutil.ltrimstr( DecimalUtil.doubleToDec(nGXsfl_52_idx), 4, 0), (short)(4), "0") ;
         subsflControlProps_522( ) ;
      }
      /* End function sendrow_522 */
   }

   public void startgridcontrol52( )
   {
      if ( GridContainer.GetWrapped() == 1 )
      {
         httpContext.writeText( "<div id=\""+"GridContainer"+"DivS\" data-gxgridid=\"52\">") ;
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
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNum_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Producto", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtPrdNom_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Descripcion", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecExiTeo_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Teorica", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecexirea_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Real", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDifer_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtRecExiTcc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Teo CC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavRecexircc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Cant Real CC", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"right"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavDifercc_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Dif", "")) ;
         httpContext.writeTextNL( "</th>") ;
         httpContext.writeText( "<th align=\""+"left"+"\" "+" nowrap=\"nowrap\" "+" class=\""+"Attribute"+"\" "+" style=\""+((edtavReclot_Visible==0) ? "display:none;" : "")+""+"\" "+">") ;
         httpContext.writeValue( httpContext.getMessage( "Lote", "")) ;
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
         GridContainer.AddObjectProperty("CmpContext", "");
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
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A809RecExiTeo, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecExiTeo_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV56RecExiRea, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecexirea_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV57Difer, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifer_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDifer_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( A808RecExiTcc, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtRecExiTcc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV62RecExiRcc, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavRecexircc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.ltrim( localUtil.ntoc( AV76DiferCC, (byte)(12), (byte)(4), ".", "")));
         GridColumn.AddObjectProperty("Enabled", GXutil.ltrim( localUtil.ntoc( edtavDifercc_Enabled, (byte)(5), (byte)(0), ".", "")));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavDifercc_Visible, (byte)(5), (byte)(0), ".", "")));
         GridContainer.AddColumnProperties(GridColumn);
         GridColumn = GXWebColumn.GetNew(isAjaxCallMode( )) ;
         GridColumn.AddObjectProperty("Value", GXutil.rtrim( AV58RecLot));
         GridColumn.AddObjectProperty("Visible", GXutil.ltrim( localUtil.ntoc( edtavReclot_Visible, (byte)(5), (byte)(0), ".", "")));
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
      bttBtnexport_Internalname = "BTNEXPORT" ;
      bttBtnexportcsv_Internalname = "BTNEXPORTCSV" ;
      bttBtneditcolumns_Internalname = "BTNEDITCOLUMNS" ;
      edtavRecfec_Internalname = "vRECFEC" ;
      edtavCcstkhor_Internalname = "vCCSTKHOR" ;
      divTableactions_Internalname = "TABLEACTIONS" ;
      divTableheader_Internalname = "TABLEHEADER" ;
      Dvpanel_tableheader_Internalname = "DVPANEL_TABLEHEADER" ;
      bttBtnmemorizarcantreal_Internalname = "BTNMEMORIZARCANTREAL" ;
      bttBtnconfirmar_Internalname = "BTNCONFIRMAR" ;
      divUnnamedtable2_Internalname = "UNNAMEDTABLE2" ;
      Dvpanel_unnamedtable2_Internalname = "DVPANEL_UNNAMEDTABLE2" ;
      edtPrdNum_Internalname = "PRDNUM" ;
      edtPrdNom_Internalname = "PRDNOM" ;
      edtRecExiTeo_Internalname = "RECEXITEO" ;
      edtavRecexirea_Internalname = "vRECEXIREA" ;
      edtavDifer_Internalname = "vDIFER" ;
      edtRecExiTcc_Internalname = "RECEXITCC" ;
      edtavRecexircc_Internalname = "vRECEXIRCC" ;
      edtavDifercc_Internalname = "vDIFERCC" ;
      edtavReclot_Internalname = "vRECLOT" ;
      divUnnamedtable3_Internalname = "UNNAMEDTABLE3" ;
      Dvpanel_unnamedtable3_Internalname = "DVPANEL_UNNAMEDTABLE3" ;
      divUnnamedtable1_Internalname = "UNNAMEDTABLE1" ;
      divTablemain_Internalname = "TABLEMAIN" ;
      Ddo_grid_Internalname = "DDO_GRID" ;
      Ddo_gridcolumnsselector_Internalname = "DDO_GRIDCOLUMNSSELECTOR" ;
      Dvelop_confirmpanel_btnconfirmar_Internalname = "DVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
      tblTabledvelop_confirmpanel_btnconfirmar_Internalname = "TABLEDVELOP_CONFIRMPANEL_BTNCONFIRMAR" ;
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
      subGrid_Allowhovering = (byte)(-1) ;
      subGrid_Allowselection = (byte)(1) ;
      subGrid_Header = "" ;
      edtavReclot_Jsonclick = "" ;
      edtavReclot_Enabled = 1 ;
      edtavDifercc_Jsonclick = "" ;
      edtavDifercc_Enabled = 1 ;
      edtavRecexircc_Jsonclick = "" ;
      edtavRecexircc_Enabled = 1 ;
      edtRecExiTcc_Jsonclick = "" ;
      edtavDifer_Jsonclick = "" ;
      edtavDifer_Enabled = 1 ;
      edtavRecexirea_Jsonclick = "" ;
      edtavRecexirea_Enabled = 1 ;
      edtRecExiTeo_Jsonclick = "" ;
      edtPrdNom_Jsonclick = "" ;
      edtPrdNum_Jsonclick = "" ;
      subGrid_Class = "GridNoBorder WorkWithSelection WorkWith" ;
      subGrid_Backcolorstyle = (byte)(0) ;
      edtavReclot_Visible = -1 ;
      edtavDifer_Visible = -1 ;
      edtavRecexirea_Visible = -1 ;
      edtRecExiTeo_Visible = -1 ;
      edtPrdNom_Visible = -1 ;
      edtPrdNum_Visible = -1 ;
      subGrid_Sortable = (byte)(0) ;
      edtavCcstkhor_Jsonclick = "" ;
      edtavCcstkhor_Enabled = 1 ;
      edtavRecfec_Jsonclick = "" ;
      edtavRecfec_Enabled = 1 ;
      Grid_empowerer_Hascolumnsselector = GXutil.toBoolean( -1) ;
      Grid_empowerer_Hastitlesettings = GXutil.toBoolean( -1) ;
      Grid_empowerer_Infinitescrolling = "Form" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmtype = "1" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition = "left" ;
      Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption = "WWP_ConfirmTextCancel" ;
      Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption = "WWP_ConfirmTextNo" ;
      Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption = "WWP_ConfirmTextYes" ;
      Dvelop_confirmpanel_btnconfirmar_Confirmationtext = "¿Confirma el Inventario introducido?" ;
      Dvelop_confirmpanel_btnconfirmar_Title = "" ;
      Ddo_gridcolumnsselector_Titlecontrolidtoreplace = "" ;
      Ddo_gridcolumnsselector_Dropdownoptionstype = "GridColumnsSelector" ;
      Ddo_gridcolumnsselector_Cls = "ColumnsSelector hidden-xs" ;
      Ddo_gridcolumnsselector_Tooltip = "WWP_EditColumnsTooltip" ;
      Ddo_gridcolumnsselector_Caption = httpContext.getMessage( "WWP_EditColumnsCaption", "") ;
      Ddo_grid_Datalistproc = "WebWConreInfiniteGetFilterData" ;
      Ddo_grid_Datalisttype = "Dynamic|Dynamic|||||||" ;
      Ddo_grid_Includedatalist = "T|T|||||||" ;
      Ddo_grid_Filterisrange = "||T|||T|||" ;
      Ddo_grid_Filtertype = "Character|Character|Numeric|||Numeric|||" ;
      Ddo_grid_Includefilter = "T|T|T|||T|||" ;
      Ddo_grid_Fixable = "T" ;
      Ddo_grid_Includesortasc = "T|T|T|||T|||" ;
      Ddo_grid_Columnssortvalues = "1|2|3|||4|||" ;
      Ddo_grid_Columnids = "0:PrdNum|1:PrdNom|2:RecExiTeo|3:RecExiRea|4:Difer|5:RecExiTcc|6:RecExiRcc|7:DiferCC|8:RecLot" ;
      Ddo_grid_Gridinternalname = "" ;
      Dvpanel_unnamedtable3_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Iconposition = "Right" ;
      Dvpanel_unnamedtable3_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsed = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Title = httpContext.getMessage( "Productos Inventario", "") ;
      Dvpanel_unnamedtable3_Cls = "PanelCard_GrayTitle" ;
      Dvpanel_unnamedtable3_Autoheight = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable3_Autowidth = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable3_Width = "100%" ;
      Dvpanel_unnamedtable2_Autoscroll = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Iconposition = "Right" ;
      Dvpanel_unnamedtable2_Showcollapseicon = GXutil.toBoolean( 0) ;
      Dvpanel_unnamedtable2_Collapsed = GXutil.toBoolean( 1) ;
      Dvpanel_unnamedtable2_Collapsible = GXutil.toBoolean( -1) ;
      Dvpanel_unnamedtable2_Title = httpContext.getMessage( "Acciones", "") ;
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
      Form.setCaption( httpContext.getMessage( "Entrada Inventario", "") );
      edtavDifercc_Visible = -1 ;
      edtavRecexircc_Visible = -1 ;
      edtRecExiTcc_Visible = -1 ;
      subGrid_Rows = 50 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
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
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51RecFec',fld:'vRECFEC',pic:''},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV52Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV89FlagPreMed',fld:'vFLAGPREMED',pic:'9',hsh:true},{av:'AV88FlagCcs',fld:'vFLAGCCS',pic:'9',hsh:true},{av:'AV87FlagCColor',fld:'vFLAGCCOLOR',pic:'9',hsh:true},{av:'AV95Nalmcc',fld:'vNALMCC',pic:'9',hsh:true},{av:'AV115Val_stk',fld:'vVAL_STK',pic:'9',hsh:true}]");
      setEventMetadata("REFRESH",",oparms:[{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'}]}");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED","{handler:'e12TO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51RecFec',fld:'vRECFEC',pic:''},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV52Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV89FlagPreMed',fld:'vFLAGPREMED',pic:'9',hsh:true},{av:'AV88FlagCcs',fld:'vFLAGCCS',pic:'9',hsh:true},{av:'AV87FlagCColor',fld:'vFLAGCCOLOR',pic:'9',hsh:true},{av:'AV95Nalmcc',fld:'vNALMCC',pic:'9',hsh:true},{av:'AV115Val_stk',fld:'vVAL_STK',pic:'9',hsh:true},{av:'Ddo_grid_Activeeventkey',ctrl:'DDO_GRID',prop:'ActiveEventKey'},{av:'Ddo_grid_Selectedvalue_get',ctrl:'DDO_GRID',prop:'SelectedValue_get'},{av:'Ddo_grid_Selectedcolumn',ctrl:'DDO_GRID',prop:'SelectedColumn'},{av:'Ddo_grid_Filteredtext_get',ctrl:'DDO_GRID',prop:'FilteredText_get'},{av:'Ddo_grid_Filteredtextto_get',ctrl:'DDO_GRID',prop:'FilteredTextTo_get'}]");
      setEventMetadata("DDO_GRID.ONOPTIONCLICKED",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID.LOAD","{handler:'e20TO2',iparms:[{av:'A11624RecMemCant',fld:'RECMEMCANT',pic:'9'},{av:'A809RecExiTeo',fld:'RECEXITEO',pic:'ZZZZZZ9.9999',hsh:true},{av:'A807RecExiRea',fld:'RECEXIREA',pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',pic:'ZZZZZZ9.9999',hsh:true},{av:'A806RecExiRcc',fld:'RECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'A12285RecLot',fld:'RECLOT',pic:''}]");
      setEventMetadata("GRID.LOAD",",oparms:[{av:'AV56RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV57Difer',fld:'vDIFER',pic:'ZZZZZZ9.9999'},{av:'AV62RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV76DiferCC',fld:'vDIFERCC',pic:'ZZZZZZ9.9999'},{av:'AV58RecLot',fld:'vRECLOT',pic:''}]}");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED","{handler:'e13TO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51RecFec',fld:'vRECFEC',pic:''},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV52Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV89FlagPreMed',fld:'vFLAGPREMED',pic:'9',hsh:true},{av:'AV88FlagCcs',fld:'vFLAGCCS',pic:'9',hsh:true},{av:'AV87FlagCColor',fld:'vFLAGCCOLOR',pic:'9',hsh:true},{av:'AV95Nalmcc',fld:'vNALMCC',pic:'9',hsh:true},{av:'AV115Val_stk',fld:'vVAL_STK',pic:'9',hsh:true},{av:'Ddo_gridcolumnsselector_Columnsselectorvalues',ctrl:'DDO_GRIDCOLUMNSSELECTOR',prop:'ColumnsSelectorValues'}]");
      setEventMetadata("DDO_GRIDCOLUMNSSELECTOR.ONCOLUMNSCHANGED",",oparms:[{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'}]}");
      setEventMetadata("'DOMEMORIZARCANTREAL'","{handler:'e15TO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51RecFec',fld:'vRECFEC',pic:''},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV52Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV89FlagPreMed',fld:'vFLAGPREMED',pic:'9',hsh:true},{av:'AV88FlagCcs',fld:'vFLAGCCS',pic:'9',hsh:true},{av:'AV87FlagCColor',fld:'vFLAGCCOLOR',pic:'9',hsh:true},{av:'AV95Nalmcc',fld:'vNALMCC',pic:'9',hsh:true},{av:'AV115Val_stk',fld:'vVAL_STK',pic:'9',hsh:true},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',grid:52,pic:''},{av:'nRC_GXsfl_52',ctrl:'GRID',grid:52,prop:'GridRC',grid:52},{av:'AV56RecExiRea',fld:'vRECEXIREA',grid:52,pic:'ZZZZZZ9.9999'},{av:'AV62RecExiRcc',fld:'vRECEXIRCC',grid:52,pic:'ZZZZZZ9.9999'},{av:'AV49Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'}]");
      setEventMetadata("'DOMEMORIZARCANTREAL'",",oparms:[{av:'AV49Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV62RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV56RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV51RecFec',fld:'vRECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'}]}");
      setEventMetadata("'DOCONFIRMAR'","{handler:'e11TO1',iparms:[]");
      setEventMetadata("'DOCONFIRMAR'",",oparms:[]}");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE","{handler:'e14TO2',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51RecFec',fld:'vRECFEC',pic:''},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV52Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV89FlagPreMed',fld:'vFLAGPREMED',pic:'9',hsh:true},{av:'AV88FlagCcs',fld:'vFLAGCCS',pic:'9',hsh:true},{av:'AV87FlagCColor',fld:'vFLAGCCOLOR',pic:'9',hsh:true},{av:'AV95Nalmcc',fld:'vNALMCC',pic:'9',hsh:true},{av:'AV115Val_stk',fld:'vVAL_STK',pic:'9',hsh:true},{av:'Dvelop_confirmpanel_btnconfirmar_Result',ctrl:'DVELOP_CONFIRMPANEL_BTNCONFIRMAR',prop:'Result'},{av:'AV55UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'A726PrdPreMed',fld:'PRDPREMED',pic:'ZZZZZZZ9.999'},{av:'A724PrdPreAct',fld:'PRDPREACT',pic:'ZZZZZZZ9.999'},{av:'A809RecExiTeo',fld:'RECEXITEO',grid:52,pic:'ZZZZZZ9.9999',hsh:true},{av:'nRC_GXsfl_52',ctrl:'GRID',grid:52,prop:'GridRC',grid:52},{av:'AV56RecExiRea',fld:'vRECEXIREA',grid:52,pic:'ZZZZZZ9.9999'},{av:'A808RecExiTcc',fld:'RECEXITCC',grid:52,pic:'ZZZZZZ9.9999',hsh:true},{av:'AV62RecExiRcc',fld:'vRECEXIRCC',grid:52,pic:'ZZZZZZ9.9999'},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'A719PrdNum',fld:'PRDNUM',grid:52,pic:''},{av:'AV49Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV58RecLot',fld:'vRECLOT',grid:52,pic:''},{av:'AV107RecUbic',fld:'vRECUBIC',pic:''},{av:'AV63Fecrec',fld:'vFECREC',pic:''},{av:'AV47CCStkHor',fld:'vCCSTKHOR',pic:''}]");
      setEventMetadata("DVELOP_CONFIRMPANEL_BTNCONFIRMAR.CLOSE",",oparms:[{av:'AV57Difer',fld:'vDIFER',pic:'ZZZZZZ9.9999'},{av:'AV76DiferCC',fld:'vDIFERCC',pic:'ZZZZZZ9.9999'},{av:'AV51RecFec',fld:'vRECFEC',pic:''},{av:'A719PrdNum',fld:'PRDNUM',pic:''},{av:'A396EmprCod',fld:'EMPRCOD',pic:'@!'},{av:'AV107RecUbic',fld:'vRECUBIC',pic:''},{av:'AV58RecLot',fld:'vRECLOT',pic:''},{av:'AV49Recfechr',fld:'vRECFECHR',pic:'99/99/99 99:99'},{av:'AV62RecExiRcc',fld:'vRECEXIRCC',pic:'ZZZZZZ9.9999'},{av:'AV56RecExiRea',fld:'vRECEXIREA',pic:'ZZZZZZ9.9999'},{av:'AV47CCStkHor',fld:'vCCSTKHOR',pic:''},{av:'AV63Fecrec',fld:'vFECREC',pic:''},{av:'AV55UsurCod',fld:'vUSURCOD',pic:'@!'},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'}]}");
      setEventMetadata("'DOEXPORT'","{handler:'e16TO2',iparms:[{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORT'",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("'DOEXPORTCSV'","{handler:'e17TO2',iparms:[{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("'DOEXPORTCSV'",",oparms:[{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'Ddo_grid_Selectedvalue_set',ctrl:'DDO_GRID',prop:'SelectedValue_set'},{av:'Ddo_grid_Filteredtext_set',ctrl:'DDO_GRID',prop:'FilteredText_set'},{av:'Ddo_grid_Filteredtextto_set',ctrl:'DDO_GRID',prop:'FilteredTextTo_set'},{av:'Ddo_grid_Sortedstatus',ctrl:'DDO_GRID',prop:'SortedStatus'}]}");
      setEventMetadata("GRID_FIRSTPAGE","{handler:'subgrid_firstpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51RecFec',fld:'vRECFEC',pic:''},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV52Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV89FlagPreMed',fld:'vFLAGPREMED',pic:'9',hsh:true},{av:'AV88FlagCcs',fld:'vFLAGCCS',pic:'9',hsh:true},{av:'AV87FlagCColor',fld:'vFLAGCCOLOR',pic:'9',hsh:true},{av:'AV95Nalmcc',fld:'vNALMCC',pic:'9',hsh:true},{av:'AV115Val_stk',fld:'vVAL_STK',pic:'9',hsh:true},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_FIRSTPAGE",",oparms:[{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'}]}");
      setEventMetadata("GRID_PREVPAGE","{handler:'subgrid_previouspage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51RecFec',fld:'vRECFEC',pic:''},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV52Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV89FlagPreMed',fld:'vFLAGPREMED',pic:'9',hsh:true},{av:'AV88FlagCcs',fld:'vFLAGCCS',pic:'9',hsh:true},{av:'AV87FlagCColor',fld:'vFLAGCCOLOR',pic:'9',hsh:true},{av:'AV95Nalmcc',fld:'vNALMCC',pic:'9',hsh:true},{av:'AV115Val_stk',fld:'vVAL_STK',pic:'9',hsh:true},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_PREVPAGE",",oparms:[{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'}]}");
      setEventMetadata("GRID_NEXTPAGE","{handler:'subgrid_nextpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51RecFec',fld:'vRECFEC',pic:''},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV52Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV89FlagPreMed',fld:'vFLAGPREMED',pic:'9',hsh:true},{av:'AV88FlagCcs',fld:'vFLAGCCS',pic:'9',hsh:true},{av:'AV87FlagCColor',fld:'vFLAGCCOLOR',pic:'9',hsh:true},{av:'AV95Nalmcc',fld:'vNALMCC',pic:'9',hsh:true},{av:'AV115Val_stk',fld:'vVAL_STK',pic:'9',hsh:true},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_NEXTPAGE",",oparms:[{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'}]}");
      setEventMetadata("GRID_LASTPAGE","{handler:'subgrid_lastpage',iparms:[{av:'GRID_nFirstRecordOnPage'},{av:'GRID_nEOF'},{av:'subGrid_Rows',ctrl:'GRID',prop:'Rows'},{av:'AV51RecFec',fld:'vRECFEC',pic:''},{av:'AV53EmprCod',fld:'vEMPRCOD',pic:'@!'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'AV52Station',fld:'vSTATION',pic:'',hsh:true},{av:'AV89FlagPreMed',fld:'vFLAGPREMED',pic:'9',hsh:true},{av:'AV88FlagCcs',fld:'vFLAGCCS',pic:'9',hsh:true},{av:'AV87FlagCColor',fld:'vFLAGCCOLOR',pic:'9',hsh:true},{av:'AV95Nalmcc',fld:'vNALMCC',pic:'9',hsh:true},{av:'AV115Val_stk',fld:'vVAL_STK',pic:'9',hsh:true},{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'AV40TFPrdNum',fld:'vTFPRDNUM',pic:''},{av:'AV41TFPrdNum_Sel',fld:'vTFPRDNUM_SEL',pic:''},{av:'AV43TFPrdNom',fld:'vTFPRDNOM',pic:''},{av:'AV44TFPrdNom_Sel',fld:'vTFPRDNOM_SEL',pic:''},{av:'AV60TFRecExiTeo',fld:'vTFRECEXITEO',pic:'ZZZZZZ9.9999'},{av:'AV61TFRecExiTeo_To',fld:'vTFRECEXITEO_TO',pic:'ZZZZZZ9.9999'},{av:'AV118TFRecExiTcc',fld:'vTFRECEXITCC',pic:'ZZZZZZ9.9999'},{av:'AV119TFRecExiTcc_To',fld:'vTFRECEXITCC_TO',pic:'ZZZZZZ9.9999'},{av:'AV133Pgmname',fld:'vPGMNAME',pic:'',hsh:true},{av:'AV13OrderedBy',fld:'vORDEREDBY',pic:'ZZZ9'},{av:'AV14OrderedDsc',fld:'vORDEREDDSC',pic:''}]");
      setEventMetadata("GRID_LASTPAGE",",oparms:[{av:'AV33ColumnsSelector',fld:'vCOLUMNSSELECTOR',pic:''},{av:'edtPrdNum_Visible',ctrl:'PRDNUM',prop:'Visible'},{av:'edtPrdNom_Visible',ctrl:'PRDNOM',prop:'Visible'},{av:'edtRecExiTeo_Visible',ctrl:'RECEXITEO',prop:'Visible'},{av:'edtavRecexirea_Visible',ctrl:'vRECEXIREA',prop:'Visible'},{av:'edtavDifer_Visible',ctrl:'vDIFER',prop:'Visible'},{av:'edtRecExiTcc_Visible',ctrl:'RECEXITCC',prop:'Visible'},{av:'edtavRecexircc_Visible',ctrl:'vRECEXIRCC',prop:'Visible'},{av:'edtavDifercc_Visible',ctrl:'vDIFERCC',prop:'Visible'},{av:'edtavReclot_Visible',ctrl:'vRECLOT',prop:'Visible'}]}");
      setEventMetadata("VALIDV_RECFEC","{handler:'validv_Recfec',iparms:[]");
      setEventMetadata("VALIDV_RECFEC",",oparms:[]}");
      setEventMetadata("VALID_PRDNUM","{handler:'valid_Prdnum',iparms:[]");
      setEventMetadata("VALID_PRDNUM",",oparms:[]}");
      setEventMetadata("NULL","{handler:'validv_Reclot',iparms:[]");
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
      Ddo_grid_Activeeventkey = "" ;
      Ddo_grid_Selectedvalue_get = "" ;
      Ddo_grid_Selectedcolumn = "" ;
      Ddo_grid_Filteredtext_get = "" ;
      Ddo_grid_Filteredtextto_get = "" ;
      Ddo_gridcolumnsselector_Columnsselectorvalues = "" ;
      Dvelop_confirmpanel_btnconfirmar_Result = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      AV51RecFec = GXutil.nullDate() ;
      AV53EmprCod = "" ;
      AV33ColumnsSelector = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      AV40TFPrdNum = "" ;
      AV41TFPrdNum_Sel = "" ;
      AV43TFPrdNom = "" ;
      AV44TFPrdNom_Sel = "" ;
      AV60TFRecExiTeo = DecimalUtil.ZERO ;
      AV61TFRecExiTeo_To = DecimalUtil.ZERO ;
      AV118TFRecExiTcc = DecimalUtil.ZERO ;
      AV119TFRecExiTcc_To = DecimalUtil.ZERO ;
      AV133Pgmname = "" ;
      AV52Station = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      GXKey = "" ;
      AV46DDO_TitleSettingsIcons = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      A807RecExiRea = DecimalUtil.ZERO ;
      A806RecExiRcc = DecimalUtil.ZERO ;
      A12285RecLot = "" ;
      A396EmprCod = "" ;
      AV49Recfechr = GXutil.resetTime( GXutil.nullDate() );
      AV55UsurCod = "" ;
      A726PrdPreMed = DecimalUtil.ZERO ;
      A724PrdPreAct = DecimalUtil.ZERO ;
      AV107RecUbic = "" ;
      AV63Fecrec = GXutil.nullDate() ;
      A727PrdRec = "" ;
      Ddo_grid_Caption = "" ;
      Ddo_grid_Filteredtext_set = "" ;
      Ddo_grid_Filteredtextto_set = "" ;
      Ddo_grid_Selectedvalue_set = "" ;
      Ddo_grid_Sortedstatus = "" ;
      Ddo_gridcolumnsselector_Gridinternalname = "" ;
      Grid_empowerer_Gridinternalname = "" ;
      GX_FocusControl = "" ;
      sPrefix = "" ;
      ucDvpanel_tableheader = new com.genexus.webpanels.GXUserControl();
      TempTags = "" ;
      ClassString = "" ;
      StyleString = "" ;
      bttBtnexport_Jsonclick = "" ;
      bttBtnexportcsv_Jsonclick = "" ;
      bttBtneditcolumns_Jsonclick = "" ;
      AV47CCStkHor = "" ;
      ucDvpanel_unnamedtable2 = new com.genexus.webpanels.GXUserControl();
      bttBtnmemorizarcantreal_Jsonclick = "" ;
      bttBtnconfirmar_Jsonclick = "" ;
      ucDvpanel_unnamedtable3 = new com.genexus.webpanels.GXUserControl();
      GridContainer = new com.genexus.webpanels.GXWebGrid(context);
      sStyleString = "" ;
      ucDdo_grid = new com.genexus.webpanels.GXUserControl();
      ucDdo_gridcolumnsselector = new com.genexus.webpanels.GXUserControl();
      ucGrid_empowerer = new com.genexus.webpanels.GXUserControl();
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      AV124Webwconreinfiniteds_1_tfprdnum = "" ;
      AV125Webwconreinfiniteds_2_tfprdnum_sel = "" ;
      AV126Webwconreinfiniteds_3_tfprdnom = "" ;
      AV127Webwconreinfiniteds_4_tfprdnom_sel = "" ;
      AV128Webwconreinfiniteds_5_tfrecexiteo = DecimalUtil.ZERO ;
      AV129Webwconreinfiniteds_6_tfrecexiteo_to = DecimalUtil.ZERO ;
      AV130Webwconreinfiniteds_7_tfrecexitcc = DecimalUtil.ZERO ;
      AV131Webwconreinfiniteds_8_tfrecexitcc_to = DecimalUtil.ZERO ;
      A719PrdNum = "" ;
      A718PrdNom = "" ;
      A809RecExiTeo = DecimalUtil.ZERO ;
      AV56RecExiRea = DecimalUtil.ZERO ;
      AV57Difer = DecimalUtil.ZERO ;
      A808RecExiTcc = DecimalUtil.ZERO ;
      AV62RecExiRcc = DecimalUtil.ZERO ;
      AV76DiferCC = DecimalUtil.ZERO ;
      AV58RecLot = "" ;
      GXCCtl = "" ;
      scmdbuf = "" ;
      lV124Webwconreinfiniteds_1_tfprdnum = "" ;
      lV126Webwconreinfiniteds_3_tfprdnom = "" ;
      A810RecFec = GXutil.nullDate() ;
      H00TO2_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00TO2_A727PrdRec = new String[] {""} ;
      H00TO2_A13416RecEstInv = new byte[1] ;
      H00TO2_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO2_A11624RecMemCant = new byte[1] ;
      H00TO2_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO2_A12285RecLot = new String[] {""} ;
      H00TO2_A396EmprCod = new String[] {""} ;
      H00TO2_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO2_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO2_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO2_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO2_A718PrdNom = new String[] {""} ;
      H00TO2_A719PrdNum = new String[] {""} ;
      H00TO3_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00TO3_A727PrdRec = new String[] {""} ;
      H00TO3_A13416RecEstInv = new byte[1] ;
      H00TO3_A807RecExiRea = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO3_A11624RecMemCant = new byte[1] ;
      H00TO3_A806RecExiRcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO3_A12285RecLot = new String[] {""} ;
      H00TO3_A396EmprCod = new String[] {""} ;
      H00TO3_A724PrdPreAct = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO3_A726PrdPreMed = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO3_A808RecExiTcc = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO3_A809RecExiTeo = new java.math.BigDecimal[] {DecimalUtil.ZERO} ;
      H00TO3_A718PrdNom = new String[] {""} ;
      H00TO3_A719PrdNum = new String[] {""} ;
      AV54EmprNom = "" ;
      GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons(remoteHandle, context);
      GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10 = new app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons[1] ;
      AV6WWPContext = new app.wwpbaseobjects.SdtWWPContext(remoteHandle, context);
      GXv_SdtWWPContext11 = new app.wwpbaseobjects.SdtWWPContext[1] ;
      AV35Session = httpContext.getWebSession();
      AV31ColumnsSelectorXML = "" ;
      GridRow = new com.genexus.webpanels.GXWebRow();
      AV66Inc_obs = "" ;
      AV100Precio_mov = DecimalUtil.ZERO ;
      AV112TotDet = DecimalUtil.ZERO ;
      AV83Fecha = GXutil.nullDate() ;
      AV71CCStkCanE = DecimalUtil.ZERO ;
      AV72CCStkCanS = DecimalUtil.ZERO ;
      GXv_decimal15 = new java.math.BigDecimal[1] ;
      GXv_int19 = new int[1] ;
      GXv_int6 = new byte[1] ;
      GXv_int8 = new int[1] ;
      GXv_char18 = new String[1] ;
      GXv_char17 = new String[1] ;
      GXv_char4 = new String[1] ;
      GXv_int23 = new short[1] ;
      GXv_decimal14 = new java.math.BigDecimal[1] ;
      GXv_decimal13 = new java.math.BigDecimal[1] ;
      GXv_char3 = new String[1] ;
      GXv_char2 = new String[1] ;
      GXv_char22 = new String[1] ;
      GXv_char21 = new String[1] ;
      GXv_char20 = new String[1] ;
      GXv_date12 = new java.util.Date[1] ;
      GXv_dtime16 = new java.util.Date[1] ;
      GXv_decimal25 = new java.math.BigDecimal[1] ;
      GXv_decimal24 = new java.math.BigDecimal[1] ;
      AV29ExcelFilename = "" ;
      AV30ErrorMessage = "" ;
      AV32UserCustomValue = "" ;
      AV34ColumnsSelectorAux = new app.wwpbaseobjects.SdtWWPColumnsSelector(remoteHandle, context);
      GXv_SdtWWPColumnsSelector28 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      GXv_SdtWWPColumnsSelector29 = new app.wwpbaseobjects.SdtWWPColumnsSelector[1] ;
      AV10GridState = new app.wwpbaseobjects.SdtWWPGridState(remoteHandle, context);
      AV11GridStateFilterValue = new app.wwpbaseobjects.SdtWWPGridState_FilterValue(remoteHandle, context);
      GXt_char30 = "" ;
      GXv_char27 = new String[1] ;
      GXt_char1 = "" ;
      GXv_char26 = new String[1] ;
      GXv_SdtWWPGridState31 = new app.wwpbaseobjects.SdtWWPGridState[1] ;
      AV8TrnContext = new app.wwpbaseobjects.SdtWWPTransactionContext(remoteHandle, context);
      AV7HTTPRequest = httpContext.getHttpRequest();
      AV50RecHora = GXutil.resetTime( GXutil.nullDate() );
      AV64Diahora = GXutil.resetTime( GXutil.nullDate() );
      H00TO4_A719PrdNum = new String[] {""} ;
      H00TO4_A396EmprCod = new String[] {""} ;
      H00TO4_A810RecFec = new java.util.Date[] {GXutil.nullDate()} ;
      H00TO4_A13416RecEstInv = new byte[1] ;
      H00TO4_A13455Rechora = new java.util.Date[] {GXutil.nullDate()} ;
      A13455Rechora = GXutil.resetTime( GXutil.nullDate() );
      H00TO5_A719PrdNum = new String[] {""} ;
      H00TO5_A396EmprCod = new String[] {""} ;
      H00TO5_A8577RecFecHr = new java.util.Date[] {GXutil.nullDate()} ;
      A8577RecFecHr = GXutil.resetTime( GXutil.nullDate() );
      ucDvelop_confirmpanel_btnconfirmar = new com.genexus.webpanels.GXUserControl();
      BackMsgLst = new com.genexus.internet.MsgList();
      LclMsgLst = new com.genexus.internet.MsgList();
      subGrid_Linesclass = "" ;
      ROClassString = "" ;
      GridColumn = new com.genexus.webpanels.GXWebColumn();
      pr_default = new DataStoreProvider(context, remoteHandle, new app.webwconreinfinite__default(),
         new Object[] {
             new Object[] {
            H00TO2_A810RecFec, H00TO2_A727PrdRec, H00TO2_A13416RecEstInv, H00TO2_A807RecExiRea, H00TO2_A11624RecMemCant, H00TO2_A806RecExiRcc, H00TO2_A12285RecLot, H00TO2_A396EmprCod, H00TO2_A724PrdPreAct, H00TO2_A726PrdPreMed,
            H00TO2_A808RecExiTcc, H00TO2_A809RecExiTeo, H00TO2_A718PrdNom, H00TO2_A719PrdNum
            }
            , new Object[] {
            H00TO3_A810RecFec, H00TO3_A727PrdRec, H00TO3_A13416RecEstInv, H00TO3_A807RecExiRea, H00TO3_A11624RecMemCant, H00TO3_A806RecExiRcc, H00TO3_A12285RecLot, H00TO3_A396EmprCod, H00TO3_A724PrdPreAct, H00TO3_A726PrdPreMed,
            H00TO3_A808RecExiTcc, H00TO3_A809RecExiTeo, H00TO3_A718PrdNom, H00TO3_A719PrdNum
            }
            , new Object[] {
            H00TO4_A719PrdNum, H00TO4_A396EmprCod, H00TO4_A810RecFec, H00TO4_A13416RecEstInv, H00TO4_A13455Rechora
            }
            , new Object[] {
            H00TO5_A719PrdNum, H00TO5_A396EmprCod, H00TO5_A8577RecFecHr
            }
         }
      );
      AV133Pgmname = "WebWConreInfinite" ;
      /* GeneXus formulas. */
      AV133Pgmname = "WebWConreInfinite" ;
      Gx_err = (short)(0) ;
      edtavRecfec_Enabled = 0 ;
      edtavCcstkhor_Enabled = 0 ;
      edtavDifer_Enabled = 0 ;
      edtavDifercc_Enabled = 0 ;
   }

   private byte GRID_nEOF ;
   private byte nGotPars ;
   private byte GxWebError ;
   private byte AV89FlagPreMed ;
   private byte AV88FlagCcs ;
   private byte AV87FlagCColor ;
   private byte AV95Nalmcc ;
   private byte AV115Val_stk ;
   private byte gxajaxcallmode ;
   private byte A11624RecMemCant ;
   private byte nDonePA ;
   private byte A13416RecEstInv ;
   private byte subGrid_Backcolorstyle ;
   private byte subGrid_Sortable ;
   private byte AV101Precio_stk ;
   private byte AV67Artextil ;
   private byte AV91Intexco ;
   private byte AV113Ubicacion ;
   private byte GXt_int5 ;
   private byte GXv_int6[] ;
   private byte nGXWrapped ;
   private byte subGrid_Backstyle ;
   private byte subGrid_Titlebackstyle ;
   private byte subGrid_Allowselection ;
   private byte subGrid_Allowhovering ;
   private byte subGrid_Allowcollapsing ;
   private byte subGrid_Collapsed ;
   private short nRcdExists_4 ;
   private short nIsMod_4 ;
   private short nRcdExists_3 ;
   private short nIsMod_3 ;
   private short AV13OrderedBy ;
   private short wbEnd ;
   private short wbStart ;
   private short gxcookieaux ;
   private short Gx_err ;
   private short GXv_int23[] ;
   private short AV48Invprd ;
   private int edtRecExiTcc_Visible ;
   private int edtavRecexircc_Visible ;
   private int edtavDifercc_Visible ;
   private int nRC_GXsfl_52 ;
   private int subGrid_Rows ;
   private int nGXsfl_52_idx=1 ;
   private int edtavRecfec_Enabled ;
   private int edtavCcstkhor_Enabled ;
   private int subGrid_Islastpage ;
   private int edtavDifer_Enabled ;
   private int edtavDifercc_Enabled ;
   private int GXt_int7 ;
   private int edtPrdNum_Visible ;
   private int edtPrdNom_Visible ;
   private int edtRecExiTeo_Visible ;
   private int edtavRecexirea_Visible ;
   private int edtavDifer_Visible ;
   private int edtavReclot_Visible ;
   private int nGXsfl_52_fel_idx=1 ;
   private int GXv_int19[] ;
   private int GXv_int8[] ;
   private int AV135GXV1 ;
   private int idxLst ;
   private int subGrid_Backcolor ;
   private int subGrid_Allbackcolor ;
   private int edtavRecexirea_Enabled ;
   private int edtavRecexircc_Enabled ;
   private int edtavReclot_Enabled ;
   private int subGrid_Titlebackcolor ;
   private int subGrid_Selectedindex ;
   private int subGrid_Selectioncolor ;
   private int subGrid_Hoveringcolor ;
   private long GRID_nFirstRecordOnPage ;
   private long GRID_nCurrentRecord ;
   private long GRID_nRecordCount ;
   private java.math.BigDecimal AV60TFRecExiTeo ;
   private java.math.BigDecimal AV61TFRecExiTeo_To ;
   private java.math.BigDecimal AV118TFRecExiTcc ;
   private java.math.BigDecimal AV119TFRecExiTcc_To ;
   private java.math.BigDecimal A807RecExiRea ;
   private java.math.BigDecimal A806RecExiRcc ;
   private java.math.BigDecimal A726PrdPreMed ;
   private java.math.BigDecimal A724PrdPreAct ;
   private java.math.BigDecimal AV128Webwconreinfiniteds_5_tfrecexiteo ;
   private java.math.BigDecimal AV129Webwconreinfiniteds_6_tfrecexiteo_to ;
   private java.math.BigDecimal AV130Webwconreinfiniteds_7_tfrecexitcc ;
   private java.math.BigDecimal AV131Webwconreinfiniteds_8_tfrecexitcc_to ;
   private java.math.BigDecimal A809RecExiTeo ;
   private java.math.BigDecimal AV56RecExiRea ;
   private java.math.BigDecimal AV57Difer ;
   private java.math.BigDecimal A808RecExiTcc ;
   private java.math.BigDecimal AV62RecExiRcc ;
   private java.math.BigDecimal AV76DiferCC ;
   private java.math.BigDecimal AV100Precio_mov ;
   private java.math.BigDecimal AV112TotDet ;
   private java.math.BigDecimal AV71CCStkCanE ;
   private java.math.BigDecimal AV72CCStkCanS ;
   private java.math.BigDecimal GXv_decimal15[] ;
   private java.math.BigDecimal GXv_decimal14[] ;
   private java.math.BigDecimal GXv_decimal13[] ;
   private java.math.BigDecimal GXv_decimal25[] ;
   private java.math.BigDecimal GXv_decimal24[] ;
   private String Ddo_grid_Activeeventkey ;
   private String Ddo_grid_Selectedvalue_get ;
   private String Ddo_grid_Selectedcolumn ;
   private String Ddo_grid_Filteredtext_get ;
   private String Ddo_grid_Filteredtextto_get ;
   private String Ddo_gridcolumnsselector_Columnsselectorvalues ;
   private String Dvelop_confirmpanel_btnconfirmar_Result ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String sGXsfl_52_idx="0001" ;
   private String edtRecExiTcc_Internalname ;
   private String edtavRecexircc_Internalname ;
   private String edtavDifercc_Internalname ;
   private String AV53EmprCod ;
   private String AV40TFPrdNum ;
   private String AV41TFPrdNum_Sel ;
   private String AV43TFPrdNom ;
   private String AV44TFPrdNom_Sel ;
   private String AV133Pgmname ;
   private String AV52Station ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String GXKey ;
   private String A12285RecLot ;
   private String A396EmprCod ;
   private String AV55UsurCod ;
   private String AV107RecUbic ;
   private String A727PrdRec ;
   private String Dvpanel_tableheader_Width ;
   private String Dvpanel_tableheader_Cls ;
   private String Dvpanel_tableheader_Title ;
   private String Dvpanel_tableheader_Iconposition ;
   private String Dvpanel_unnamedtable2_Width ;
   private String Dvpanel_unnamedtable2_Cls ;
   private String Dvpanel_unnamedtable2_Title ;
   private String Dvpanel_unnamedtable2_Iconposition ;
   private String Dvpanel_unnamedtable3_Width ;
   private String Dvpanel_unnamedtable3_Cls ;
   private String Dvpanel_unnamedtable3_Title ;
   private String Dvpanel_unnamedtable3_Iconposition ;
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
   private String Dvelop_confirmpanel_btnconfirmar_Title ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmationtext ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Nobuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Cancelbuttoncaption ;
   private String Dvelop_confirmpanel_btnconfirmar_Yesbuttonposition ;
   private String Dvelop_confirmpanel_btnconfirmar_Confirmtype ;
   private String Grid_empowerer_Gridinternalname ;
   private String Grid_empowerer_Infinitescrolling ;
   private String GX_FocusControl ;
   private String sPrefix ;
   private String divLayoutmaintable_Internalname ;
   private String divTablemain_Internalname ;
   private String divUnnamedtable1_Internalname ;
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
   private String edtavRecfec_Internalname ;
   private String edtavRecfec_Jsonclick ;
   private String edtavCcstkhor_Internalname ;
   private String AV47CCStkHor ;
   private String edtavCcstkhor_Jsonclick ;
   private String Dvpanel_unnamedtable2_Internalname ;
   private String divUnnamedtable2_Internalname ;
   private String bttBtnmemorizarcantreal_Internalname ;
   private String bttBtnmemorizarcantreal_Jsonclick ;
   private String bttBtnconfirmar_Internalname ;
   private String bttBtnconfirmar_Jsonclick ;
   private String Dvpanel_unnamedtable3_Internalname ;
   private String divUnnamedtable3_Internalname ;
   private String sStyleString ;
   private String subGrid_Internalname ;
   private String divHtml_bottomauxiliarcontrols_Internalname ;
   private String Ddo_grid_Internalname ;
   private String Ddo_gridcolumnsselector_Internalname ;
   private String Grid_empowerer_Internalname ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String AV124Webwconreinfiniteds_1_tfprdnum ;
   private String AV125Webwconreinfiniteds_2_tfprdnum_sel ;
   private String AV126Webwconreinfiniteds_3_tfprdnom ;
   private String AV127Webwconreinfiniteds_4_tfprdnom_sel ;
   private String A719PrdNum ;
   private String edtPrdNum_Internalname ;
   private String A718PrdNom ;
   private String edtPrdNom_Internalname ;
   private String edtRecExiTeo_Internalname ;
   private String edtavRecexirea_Internalname ;
   private String edtavDifer_Internalname ;
   private String AV58RecLot ;
   private String edtavReclot_Internalname ;
   private String GXCCtl ;
   private String scmdbuf ;
   private String lV124Webwconreinfiniteds_1_tfprdnum ;
   private String lV126Webwconreinfiniteds_3_tfprdnom ;
   private String AV54EmprNom ;
   private String sGXsfl_52_fel_idx="0001" ;
   private String GXv_char18[] ;
   private String GXv_char17[] ;
   private String GXv_char4[] ;
   private String GXv_char3[] ;
   private String GXv_char2[] ;
   private String GXv_char22[] ;
   private String GXv_char21[] ;
   private String GXv_char20[] ;
   private String GXt_char30 ;
   private String GXv_char27[] ;
   private String GXt_char1 ;
   private String GXv_char26[] ;
   private String tblTabledvelop_confirmpanel_btnconfirmar_Internalname ;
   private String Dvelop_confirmpanel_btnconfirmar_Internalname ;
   private String subGrid_Class ;
   private String subGrid_Linesclass ;
   private String ROClassString ;
   private String edtPrdNum_Jsonclick ;
   private String edtPrdNom_Jsonclick ;
   private String edtRecExiTeo_Jsonclick ;
   private String edtavRecexirea_Jsonclick ;
   private String edtavDifer_Jsonclick ;
   private String edtRecExiTcc_Jsonclick ;
   private String edtavRecexircc_Jsonclick ;
   private String edtavDifercc_Jsonclick ;
   private String edtavReclot_Jsonclick ;
   private String subGrid_Header ;
   private java.util.Date AV49Recfechr ;
   private java.util.Date GXv_dtime16[] ;
   private java.util.Date AV50RecHora ;
   private java.util.Date AV64Diahora ;
   private java.util.Date A13455Rechora ;
   private java.util.Date A8577RecFecHr ;
   private java.util.Date AV51RecFec ;
   private java.util.Date AV63Fecrec ;
   private java.util.Date A810RecFec ;
   private java.util.Date AV83Fecha ;
   private java.util.Date GXv_date12[] ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean bGXsfl_52_Refreshing=false ;
   private boolean AV14OrderedDsc ;
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
   private boolean Dvpanel_unnamedtable3_Autowidth ;
   private boolean Dvpanel_unnamedtable3_Autoheight ;
   private boolean Dvpanel_unnamedtable3_Collapsible ;
   private boolean Dvpanel_unnamedtable3_Collapsed ;
   private boolean Dvpanel_unnamedtable3_Showcollapseicon ;
   private boolean Dvpanel_unnamedtable3_Autoscroll ;
   private boolean Grid_empowerer_Hastitlesettings ;
   private boolean Grid_empowerer_Hascolumnsselector ;
   private boolean wbLoad ;
   private boolean Rfr0gs ;
   private boolean wbErr ;
   private boolean gxdyncontrolsrefreshing ;
   private boolean returnInSub ;
   private boolean gx_refresh_fired ;
   private String AV31ColumnsSelectorXML ;
   private String AV32UserCustomValue ;
   private String AV66Inc_obs ;
   private String AV29ExcelFilename ;
   private String AV30ErrorMessage ;
   private com.genexus.webpanels.GXWebGrid GridContainer ;
   private com.genexus.webpanels.GXWebRow GridRow ;
   private com.genexus.webpanels.GXWebColumn GridColumn ;
   private com.genexus.internet.MsgList BackMsgLst ;
   private com.genexus.internet.MsgList LclMsgLst ;
   private com.genexus.internet.HttpRequest AV7HTTPRequest ;
   private com.genexus.webpanels.WebSession AV35Session ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_tableheader ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable2 ;
   private com.genexus.webpanels.GXUserControl ucDvpanel_unnamedtable3 ;
   private com.genexus.webpanels.GXUserControl ucDdo_grid ;
   private com.genexus.webpanels.GXUserControl ucDdo_gridcolumnsselector ;
   private com.genexus.webpanels.GXUserControl ucGrid_empowerer ;
   private com.genexus.webpanels.GXUserControl ucDvelop_confirmpanel_btnconfirmar ;
   private IDataStoreProvider pr_default ;
   private java.util.Date[] H00TO2_A810RecFec ;
   private String[] H00TO2_A727PrdRec ;
   private byte[] H00TO2_A13416RecEstInv ;
   private java.math.BigDecimal[] H00TO2_A807RecExiRea ;
   private byte[] H00TO2_A11624RecMemCant ;
   private java.math.BigDecimal[] H00TO2_A806RecExiRcc ;
   private String[] H00TO2_A12285RecLot ;
   private String[] H00TO2_A396EmprCod ;
   private java.math.BigDecimal[] H00TO2_A724PrdPreAct ;
   private java.math.BigDecimal[] H00TO2_A726PrdPreMed ;
   private java.math.BigDecimal[] H00TO2_A808RecExiTcc ;
   private java.math.BigDecimal[] H00TO2_A809RecExiTeo ;
   private String[] H00TO2_A718PrdNom ;
   private String[] H00TO2_A719PrdNum ;
   private java.util.Date[] H00TO3_A810RecFec ;
   private String[] H00TO3_A727PrdRec ;
   private byte[] H00TO3_A13416RecEstInv ;
   private java.math.BigDecimal[] H00TO3_A807RecExiRea ;
   private byte[] H00TO3_A11624RecMemCant ;
   private java.math.BigDecimal[] H00TO3_A806RecExiRcc ;
   private String[] H00TO3_A12285RecLot ;
   private String[] H00TO3_A396EmprCod ;
   private java.math.BigDecimal[] H00TO3_A724PrdPreAct ;
   private java.math.BigDecimal[] H00TO3_A726PrdPreMed ;
   private java.math.BigDecimal[] H00TO3_A808RecExiTcc ;
   private java.math.BigDecimal[] H00TO3_A809RecExiTeo ;
   private String[] H00TO3_A718PrdNom ;
   private String[] H00TO3_A719PrdNum ;
   private String[] H00TO4_A719PrdNum ;
   private String[] H00TO4_A396EmprCod ;
   private java.util.Date[] H00TO4_A810RecFec ;
   private byte[] H00TO4_A13416RecEstInv ;
   private java.util.Date[] H00TO4_A13455Rechora ;
   private String[] H00TO5_A719PrdNum ;
   private String[] H00TO5_A396EmprCod ;
   private java.util.Date[] H00TO5_A8577RecFecHr ;
   private com.genexus.webpanels.GXWebForm Form ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV33ColumnsSelector ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector AV34ColumnsSelectorAux ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector28[] ;
   private app.wwpbaseobjects.SdtWWPColumnsSelector GXv_SdtWWPColumnsSelector29[] ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons AV46DDO_TitleSettingsIcons ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXt_SdtDVB_SDTDropDownOptionsTitleSettingsIcons9 ;
   private app.wwpbaseobjects.SdtDVB_SDTDropDownOptionsTitleSettingsIcons GXv_SdtDVB_SDTDropDownOptionsTitleSettingsIcons10[] ;
   private app.wwpbaseobjects.SdtWWPGridState AV10GridState ;
   private app.wwpbaseobjects.SdtWWPGridState GXv_SdtWWPGridState31[] ;
   private app.wwpbaseobjects.SdtWWPGridState_FilterValue AV11GridStateFilterValue ;
   private app.wwpbaseobjects.SdtWWPTransactionContext AV8TrnContext ;
   private app.wwpbaseobjects.SdtWWPContext AV6WWPContext ;
   private app.wwpbaseobjects.SdtWWPContext GXv_SdtWWPContext11[] ;
}

final  class webwconreinfinite__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   protected Object[] conditional_H00TO2( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV125Webwconreinfiniteds_2_tfprdnum_sel ,
                                          String AV124Webwconreinfiniteds_1_tfprdnum ,
                                          String AV127Webwconreinfiniteds_4_tfprdnom_sel ,
                                          String AV126Webwconreinfiniteds_3_tfprdnom ,
                                          java.math.BigDecimal AV128Webwconreinfiniteds_5_tfrecexiteo ,
                                          java.math.BigDecimal AV129Webwconreinfiniteds_6_tfrecexiteo_to ,
                                          java.math.BigDecimal AV130Webwconreinfiniteds_7_tfrecexitcc ,
                                          java.math.BigDecimal AV131Webwconreinfiniteds_8_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A727PrdRec ,
                                          byte A13416RecEstInv ,
                                          String AV53EmprCod ,
                                          java.util.Date AV51RecFec ,
                                          String A396EmprCod ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int32 = new byte[10];
      Object[] GXv_Object33 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ T1.RecFec, T2.PrdRec, T1.RecEstInv, T1.RecExiRea, T1.RecMemCant, T1.RecExiRcc, T1.RecLot, T1.EmprCod, T2.PrdPreAct, T2.PrdPreMed, T1.RecExiTcc," ;
      scmdbuf += " T1.RecExiTeo, T2.PrdNom, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( (GXutil.strcmp("", AV125Webwconreinfiniteds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV124Webwconreinfiniteds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Webwconreinfiniteds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int32[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Webwconreinfiniteds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV126Webwconreinfiniteds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int32[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Webwconreinfiniteds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int32[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Webwconreinfiniteds_5_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int32[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Webwconreinfiniteds_6_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int32[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Webwconreinfiniteds_7_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int32[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Webwconreinfiniteds_8_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int32[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc DESC" ;
      }
      GXv_Object33[0] = scmdbuf ;
      GXv_Object33[1] = GXv_int32 ;
      return GXv_Object33 ;
   }

   protected Object[] conditional_H00TO3( ModelContext context ,
                                          int remoteHandle ,
                                          com.genexus.IHttpContext httpContext ,
                                          String AV125Webwconreinfiniteds_2_tfprdnum_sel ,
                                          String AV124Webwconreinfiniteds_1_tfprdnum ,
                                          String AV127Webwconreinfiniteds_4_tfprdnom_sel ,
                                          String AV126Webwconreinfiniteds_3_tfprdnom ,
                                          java.math.BigDecimal AV128Webwconreinfiniteds_5_tfrecexiteo ,
                                          java.math.BigDecimal AV129Webwconreinfiniteds_6_tfrecexiteo_to ,
                                          java.math.BigDecimal AV130Webwconreinfiniteds_7_tfrecexitcc ,
                                          java.math.BigDecimal AV131Webwconreinfiniteds_8_tfrecexitcc_to ,
                                          String A719PrdNum ,
                                          String A718PrdNom ,
                                          java.math.BigDecimal A809RecExiTeo ,
                                          java.math.BigDecimal A808RecExiTcc ,
                                          short AV13OrderedBy ,
                                          boolean AV14OrderedDsc ,
                                          String A727PrdRec ,
                                          byte A13416RecEstInv ,
                                          String AV53EmprCod ,
                                          java.util.Date AV51RecFec ,
                                          String A396EmprCod ,
                                          java.util.Date A810RecFec )
   {
      java.lang.StringBuffer sWhereString = new java.lang.StringBuffer();
      String scmdbuf;
      byte[] GXv_int34 = new byte[10];
      Object[] GXv_Object35 = new Object[2];
      scmdbuf = "SELECT /*+ FIRST_ROWS(51) */ T1.RecFec, T2.PrdRec, T1.RecEstInv, T1.RecExiRea, T1.RecMemCant, T1.RecExiRcc, T1.RecLot, T1.EmprCod, T2.PrdPreAct, T2.PrdPreMed, T1.RecExiTcc," ;
      scmdbuf += " T1.RecExiTeo, T2.PrdNom, T1.PrdNum FROM (TXPRECUEN T1 INNER JOIN TXPPRODUC T2 ON T2.EmprCod = T1.EmprCod AND T2.PrdNum = T1.PrdNum)" ;
      addWhere(sWhereString, "(T1.EmprCod = ? and T1.RecFec = ?)");
      addWhere(sWhereString, "(T1.RecEstInv = 0)");
      if ( (GXutil.strcmp("", AV125Webwconreinfiniteds_2_tfprdnum_sel)==0) && ( ! (GXutil.strcmp("", AV124Webwconreinfiniteds_1_tfprdnum)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T1.PrdNum) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[2] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV125Webwconreinfiniteds_2_tfprdnum_sel)==0) )
      {
         addWhere(sWhereString, "(T1.PrdNum = ?)");
      }
      else
      {
         GXv_int34[3] = (byte)(1) ;
      }
      if ( (GXutil.strcmp("", AV127Webwconreinfiniteds_4_tfprdnom_sel)==0) && ( ! (GXutil.strcmp("", AV126Webwconreinfiniteds_3_tfprdnom)==0) ) )
      {
         addWhere(sWhereString, "(UPPER(T2.PrdNom) like '%' || UPPER(?))");
      }
      else
      {
         GXv_int34[4] = (byte)(1) ;
      }
      if ( ! (GXutil.strcmp("", AV127Webwconreinfiniteds_4_tfprdnom_sel)==0) )
      {
         addWhere(sWhereString, "(T2.PrdNom = ?)");
      }
      else
      {
         GXv_int34[5] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV128Webwconreinfiniteds_5_tfrecexiteo)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo >= ?)");
      }
      else
      {
         GXv_int34[6] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV129Webwconreinfiniteds_6_tfrecexiteo_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTeo <= ?)");
      }
      else
      {
         GXv_int34[7] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV130Webwconreinfiniteds_7_tfrecexitcc)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc >= ?)");
      }
      else
      {
         GXv_int34[8] = (byte)(1) ;
      }
      if ( ! (DecimalUtil.compareTo(DecimalUtil.ZERO, AV131Webwconreinfiniteds_8_tfrecexitcc_to)==0) )
      {
         addWhere(sWhereString, "(T1.RecExiTcc <= ?)");
      }
      else
      {
         GXv_int34[9] = (byte)(1) ;
      }
      scmdbuf += sWhereString ;
      if ( ( AV13OrderedBy == 1 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.PrdNum" ;
      }
      else if ( ( AV13OrderedBy == 1 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.PrdNum DESC" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T2.PrdNom" ;
      }
      else if ( ( AV13OrderedBy == 2 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T2.PrdNom DESC" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo" ;
      }
      else if ( ( AV13OrderedBy == 3 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTeo DESC" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ! AV14OrderedDsc )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc" ;
      }
      else if ( ( AV13OrderedBy == 4 ) && ( AV14OrderedDsc ) )
      {
         scmdbuf += " ORDER BY T1.RecExiTcc DESC" ;
      }
      GXv_Object35[0] = scmdbuf ;
      GXv_Object35[1] = GXv_int34 ;
      return GXv_Object35 ;
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
                  return conditional_H00TO2(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] );
            case 1 :
                  return conditional_H00TO3(context, remoteHandle, httpContext, (String)dynConstraints[0] , (String)dynConstraints[1] , (String)dynConstraints[2] , (String)dynConstraints[3] , (java.math.BigDecimal)dynConstraints[4] , (java.math.BigDecimal)dynConstraints[5] , (java.math.BigDecimal)dynConstraints[6] , (java.math.BigDecimal)dynConstraints[7] , (String)dynConstraints[8] , (String)dynConstraints[9] , (java.math.BigDecimal)dynConstraints[10] , (java.math.BigDecimal)dynConstraints[11] , ((Number) dynConstraints[12]).shortValue() , ((Boolean) dynConstraints[13]).booleanValue() , (String)dynConstraints[14] , ((Number) dynConstraints[15]).byteValue() , (String)dynConstraints[16] , (java.util.Date)dynConstraints[17] , (String)dynConstraints[18] , (java.util.Date)dynConstraints[19] );
      }
      return super.getDynamicStatement(cursor, context, remoteHandle, httpContext, dynConstraints);
   }

   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("H00TO2", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00TO3", "scmdbuf",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,51, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("H00TO4", "SELECT * FROM (SELECT /*+ FIRST_ROWS(1) */ PrdNum, EmprCod, RecFec, RecEstInv, Rechora FROM TXPRECUEN WHERE EmprCod = ? ORDER BY EmprCod, RecFec DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("H00TO5", "SELECT * FROM (SELECT PrdNum, EmprCod, RecFecHr FROM TXPINVPRD WHERE EmprCod = ? ORDER BY EmprCod, RecFecHr DESC) WHERE rownum <= 1 ",false, GX_NOMASK + GX_MASKLOOPLOCK, false, this,1, GxCacheFrequency.OFF,true )
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
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((String[]) buf[12])[0] = rslt.getString(13, 26);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
               return;
            case 1 :
               ((java.util.Date[]) buf[0])[0] = rslt.getGXDate(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 1);
               ((byte[]) buf[2])[0] = rslt.getByte(3);
               ((java.math.BigDecimal[]) buf[3])[0] = rslt.getBigDecimal(4,4);
               ((byte[]) buf[4])[0] = rslt.getByte(5);
               ((java.math.BigDecimal[]) buf[5])[0] = rslt.getBigDecimal(6,4);
               ((String[]) buf[6])[0] = rslt.getString(7, 26);
               ((String[]) buf[7])[0] = rslt.getString(8, 3);
               ((java.math.BigDecimal[]) buf[8])[0] = rslt.getBigDecimal(9,5);
               ((java.math.BigDecimal[]) buf[9])[0] = rslt.getBigDecimal(10,5);
               ((java.math.BigDecimal[]) buf[10])[0] = rslt.getBigDecimal(11,4);
               ((java.math.BigDecimal[]) buf[11])[0] = rslt.getBigDecimal(12,4);
               ((String[]) buf[12])[0] = rslt.getString(13, 26);
               ((String[]) buf[13])[0] = rslt.getString(14, 6);
               return;
            case 2 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDate(3);
               ((byte[]) buf[3])[0] = rslt.getByte(4);
               ((java.util.Date[]) buf[4])[0] = rslt.getGXDateTime(5);
               return;
            case 3 :
               ((String[]) buf[0])[0] = rslt.getString(1, 6);
               ((String[]) buf[1])[0] = rslt.getString(2, 3);
               ((java.util.Date[]) buf[2])[0] = rslt.getGXDateTime(3);
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
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 4);
               }
               return;
            case 1 :
               sIdx = (short)(0) ;
               if ( ((Number) parms[0]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[10], 3);
               }
               if ( ((Number) parms[1]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setDate(sIdx, (java.util.Date)parms[11]);
               }
               if ( ((Number) parms[2]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[12], 6);
               }
               if ( ((Number) parms[3]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[13], 6);
               }
               if ( ((Number) parms[4]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[14], 26);
               }
               if ( ((Number) parms[5]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setString(sIdx, (String)parms[15], 26);
               }
               if ( ((Number) parms[6]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[16], 4);
               }
               if ( ((Number) parms[7]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[17], 4);
               }
               if ( ((Number) parms[8]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[18], 4);
               }
               if ( ((Number) parms[9]).byteValue() == 0 )
               {
                  sIdx = (short)(sIdx+1) ;
                  stmt.setBigDecimal(sIdx, (java.math.BigDecimal)parms[19], 4);
               }
               return;
            case 2 :
               stmt.setString(1, (String)parms[0], 3);
               return;
            case 3 :
               stmt.setString(1, (String)parms[0], 3);
               return;
      }
   }

}

